// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			azk, azh, azj

final class azt
	implements azk
{

	private azt(azh azh1)
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

	azt(azh azh1, azj azj)
	{
		this(azh1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void azt(azh)>
	//    3    5:return          
	}

	public final void a(byte abyte0[], byte abyte1[])
	{
		abyte0 = ((byte []) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field azh a>
	//    2    4:astore_1        
		abyte0.cg = ((azh) (abyte0)).W ^ a.cg;
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:getfield        #26  <Field int azh.W>
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field azh a>
	//    8   14:getfield        #29  <Field int azh.cg>
	//    9   17:ixor            
	//   10   18:putfield        #29  <Field int azh.cg>
		abyte0 = ((byte []) (a));
	//   11   21:aload_0         
	//   12   22:getfield        #12  <Field azh a>
	//   13   25:astore_1        
		abyte0.E = ((azh) (abyte0)).cg ^ a.E;
	//   14   26:aload_1         
	//   15   27:aload_1         
	//   16   28:getfield        #29  <Field int azh.cg>
	//   17   31:aload_0         
	//   18   32:getfield        #12  <Field azh a>
	//   19   35:getfield        #32  <Field int azh.E>
	//   20   38:ixor            
	//   21   39:putfield        #32  <Field int azh.E>
		abyte0 = ((byte []) (a));
	//   22   42:aload_0         
	//   23   43:getfield        #12  <Field azh a>
	//   24   46:astore_1        
		abyte0.cg = ((azh) (abyte0)).E & a.U;
	//   25   47:aload_1         
	//   26   48:aload_1         
	//   27   49:getfield        #32  <Field int azh.E>
	//   28   52:aload_0         
	//   29   53:getfield        #12  <Field azh a>
	//   30   56:getfield        #35  <Field int azh.U>
	//   31   59:iand            
	//   32   60:putfield        #29  <Field int azh.cg>
		abyte0 = ((byte []) (a));
	//   33   63:aload_0         
	//   34   64:getfield        #12  <Field azh a>
	//   35   67:astore_1        
		abyte0.ap = ((azh) (abyte0)).E & a.U;
	//   36   68:aload_1         
	//   37   69:aload_1         
	//   38   70:getfield        #32  <Field int azh.E>
	//   39   73:aload_0         
	//   40   74:getfield        #12  <Field azh a>
	//   41   77:getfield        #35  <Field int azh.U>
	//   42   80:iand            
	//   43   81:putfield        #38  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	//   44   84:aload_0         
	//   45   85:getfield        #12  <Field azh a>
	//   46   88:astore_1        
		abyte0.aX = ((azh) (abyte0)).E & ~a.U;
	//   47   89:aload_1         
	//   48   90:aload_1         
	//   49   91:getfield        #32  <Field int azh.E>
	//   50   94:aload_0         
	//   51   95:getfield        #12  <Field azh a>
	//   52   98:getfield        #35  <Field int azh.U>
	//   53  101:iconst_m1       
	//   54  102:ixor            
	//   55  103:iand            
	//   56  104:putfield        #41  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	//   57  107:aload_0         
	//   58  108:getfield        #12  <Field azh a>
	//   59  111:astore_1        
		abyte0.bB = ((azh) (abyte0)).E & ~a.U;
	//   60  112:aload_1         
	//   61  113:aload_1         
	//   62  114:getfield        #32  <Field int azh.E>
	//   63  117:aload_0         
	//   64  118:getfield        #12  <Field azh a>
	//   65  121:getfield        #35  <Field int azh.U>
	//   66  124:iconst_m1       
	//   67  125:ixor            
	//   68  126:iand            
	//   69  127:putfield        #44  <Field int azh.bB>
		abyte0 = ((byte []) (a));
	//   70  130:aload_0         
	//   71  131:getfield        #12  <Field azh a>
	//   72  134:astore_1        
		abyte0.bh = ((azh) (abyte0)).aS & a.bl;
	//   73  135:aload_1         
	//   74  136:aload_1         
	//   75  137:getfield        #47  <Field int azh.aS>
	//   76  140:aload_0         
	//   77  141:getfield        #12  <Field azh a>
	//   78  144:getfield        #50  <Field int azh.bl>
	//   79  147:iand            
	//   80  148:putfield        #53  <Field int azh.bh>
		abyte0 = ((byte []) (a));
	//   81  151:aload_0         
	//   82  152:getfield        #12  <Field azh a>
	//   83  155:astore_1        
		abyte0.ba = ((azh) (abyte0)).bh & a.bE;
	//   84  156:aload_1         
	//   85  157:aload_1         
	//   86  158:getfield        #53  <Field int azh.bh>
	//   87  161:aload_0         
	//   88  162:getfield        #12  <Field azh a>
	//   89  165:getfield        #56  <Field int azh.bE>
	//   90  168:iand            
	//   91  169:putfield        #59  <Field int azh.ba>
		abyte0 = ((byte []) (a));
	//   92  172:aload_0         
	//   93  173:getfield        #12  <Field azh a>
	//   94  176:astore_1        
		abyte0.ba = ((azh) (abyte0)).aY ^ a.ba;
	//   95  177:aload_1         
	//   96  178:aload_1         
	//   97  179:getfield        #62  <Field int azh.aY>
	//   98  182:aload_0         
	//   99  183:getfield        #12  <Field azh a>
	//  100  186:getfield        #59  <Field int azh.ba>
	//  101  189:ixor            
	//  102  190:putfield        #59  <Field int azh.ba>
		abyte0 = ((byte []) (a));
	//  103  193:aload_0         
	//  104  194:getfield        #12  <Field azh a>
	//  105  197:astore_1        
		abyte0.ba = ((azh) (abyte0)).ba & ~a.j;
	//  106  198:aload_1         
	//  107  199:aload_1         
	//  108  200:getfield        #59  <Field int azh.ba>
	//  109  203:aload_0         
	//  110  204:getfield        #12  <Field azh a>
	//  111  207:getfield        #65  <Field int azh.j>
	//  112  210:iconst_m1       
	//  113  211:ixor            
	//  114  212:iand            
	//  115  213:putfield        #59  <Field int azh.ba>
		abyte0 = ((byte []) (a));
	//  116  216:aload_0         
	//  117  217:getfield        #12  <Field azh a>
	//  118  220:astore_1        
		abyte0.ba = ((azh) (abyte0)).bm ^ a.ba;
	//  119  221:aload_1         
	//  120  222:aload_1         
	//  121  223:getfield        #68  <Field int azh.bm>
	//  122  226:aload_0         
	//  123  227:getfield        #12  <Field azh a>
	//  124  230:getfield        #59  <Field int azh.ba>
	//  125  233:ixor            
	//  126  234:putfield        #59  <Field int azh.ba>
		abyte0 = ((byte []) (a));
	//  127  237:aload_0         
	//  128  238:getfield        #12  <Field azh a>
	//  129  241:astore_1        
		abyte0.ba = ((azh) (abyte0)).al | a.ba;
	//  130  242:aload_1         
	//  131  243:aload_1         
	//  132  244:getfield        #71  <Field int azh.al>
	//  133  247:aload_0         
	//  134  248:getfield        #12  <Field azh a>
	//  135  251:getfield        #59  <Field int azh.ba>
	//  136  254:ior             
	//  137  255:putfield        #59  <Field int azh.ba>
		abyte0 = ((byte []) (a));
	//  138  258:aload_0         
	//  139  259:getfield        #12  <Field azh a>
	//  140  262:astore_1        
		abyte0.ba = ((azh) (abyte0)).W ^ a.ba;
	//  141  263:aload_1         
	//  142  264:aload_1         
	//  143  265:getfield        #26  <Field int azh.W>
	//  144  268:aload_0         
	//  145  269:getfield        #12  <Field azh a>
	//  146  272:getfield        #59  <Field int azh.ba>
	//  147  275:ixor            
	//  148  276:putfield        #59  <Field int azh.ba>
		abyte0 = ((byte []) (a));
	//  149  279:aload_0         
	//  150  280:getfield        #12  <Field azh a>
	//  151  283:astore_1        
		abyte0.A = ((azh) (abyte0)).ba ^ a.A;
	//  152  284:aload_1         
	//  153  285:aload_1         
	//  154  286:getfield        #59  <Field int azh.ba>
	//  155  289:aload_0         
	//  156  290:getfield        #12  <Field azh a>
	//  157  293:getfield        #74  <Field int azh.A>
	//  158  296:ixor            
	//  159  297:putfield        #74  <Field int azh.A>
		abyte0 = ((byte []) (a));
	//  160  300:aload_0         
	//  161  301:getfield        #12  <Field azh a>
	//  162  304:astore_1        
		abyte0.ba = ((azh) (abyte0)).A & a.e;
	//  163  305:aload_1         
	//  164  306:aload_1         
	//  165  307:getfield        #74  <Field int azh.A>
	//  166  310:aload_0         
	//  167  311:getfield        #12  <Field azh a>
	//  168  314:getfield        #77  <Field int azh.e>
	//  169  317:iand            
	//  170  318:putfield        #59  <Field int azh.ba>
		abyte0 = ((byte []) (a));
	//  171  321:aload_0         
	//  172  322:getfield        #12  <Field azh a>
	//  173  325:astore_1        
		abyte0.W = ((azh) (abyte0)).A ^ a.e;
	//  174  326:aload_1         
	//  175  327:aload_1         
	//  176  328:getfield        #74  <Field int azh.A>
	//  177  331:aload_0         
	//  178  332:getfield        #12  <Field azh a>
	//  179  335:getfield        #77  <Field int azh.e>
	//  180  338:ixor            
	//  181  339:putfield        #26  <Field int azh.W>
		abyte0 = ((byte []) (a));
	//  182  342:aload_0         
	//  183  343:getfield        #12  <Field azh a>
	//  184  346:astore_1        
		abyte0.bm = ((azh) (abyte0)).I | a.W;
	//  185  347:aload_1         
	//  186  348:aload_1         
	//  187  349:getfield        #79  <Field int azh.I>
	//  188  352:aload_0         
	//  189  353:getfield        #12  <Field azh a>
	//  190  356:getfield        #26  <Field int azh.W>
	//  191  359:ior             
	//  192  360:putfield        #68  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	//  193  363:aload_0         
	//  194  364:getfield        #12  <Field azh a>
	//  195  367:astore_1        
		abyte0.aY = ((azh) (abyte0)).e | a.A;
	//  196  368:aload_1         
	//  197  369:aload_1         
	//  198  370:getfield        #77  <Field int azh.e>
	//  199  373:aload_0         
	//  200  374:getfield        #12  <Field azh a>
	//  201  377:getfield        #74  <Field int azh.A>
	//  202  380:ior             
	//  203  381:putfield        #62  <Field int azh.aY>
		abyte0 = ((byte []) (a));
	//  204  384:aload_0         
	//  205  385:getfield        #12  <Field azh a>
	//  206  388:astore_1        
		abyte0.bv = ((azh) (abyte0)).A & ~a.e;
	//  207  389:aload_1         
	//  208  390:aload_1         
	//  209  391:getfield        #74  <Field int azh.A>
	//  210  394:aload_0         
	//  211  395:getfield        #12  <Field azh a>
	//  212  398:getfield        #77  <Field int azh.e>
	//  213  401:iconst_m1       
	//  214  402:ixor            
	//  215  403:iand            
	//  216  404:putfield        #82  <Field int azh.bv>
		abyte0 = ((byte []) (a));
	//  217  407:aload_0         
	//  218  408:getfield        #12  <Field azh a>
	//  219  411:astore_1        
		abyte0.bN = ((azh) (abyte0)).e | a.bv;
	//  220  412:aload_1         
	//  221  413:aload_1         
	//  222  414:getfield        #77  <Field int azh.e>
	//  223  417:aload_0         
	//  224  418:getfield        #12  <Field azh a>
	//  225  421:getfield        #82  <Field int azh.bv>
	//  226  424:ior             
	//  227  425:putfield        #85  <Field int azh.bN>
		abyte0 = ((byte []) (a));
	//  228  428:aload_0         
	//  229  429:getfield        #12  <Field azh a>
	//  230  432:astore_1        
		abyte0.aC = ((azh) (abyte0)).e & ~a.A;
	//  231  433:aload_1         
	//  232  434:aload_1         
	//  233  435:getfield        #77  <Field int azh.e>
	//  234  438:aload_0         
	//  235  439:getfield        #12  <Field azh a>
	//  236  442:getfield        #74  <Field int azh.A>
	//  237  445:iconst_m1       
	//  238  446:ixor            
	//  239  447:iand            
	//  240  448:putfield        #88  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	//  241  451:aload_0         
	//  242  452:getfield        #12  <Field azh a>
	//  243  455:astore_1        
		abyte0.cf = ((azh) (abyte0)).I | a.aC;
	//  244  456:aload_1         
	//  245  457:aload_1         
	//  246  458:getfield        #79  <Field int azh.I>
	//  247  461:aload_0         
	//  248  462:getfield        #12  <Field azh a>
	//  249  465:getfield        #88  <Field int azh.aC>
	//  250  468:ior             
	//  251  469:putfield        #91  <Field int azh.cf>
		abyte0 = ((byte []) (a));
	//  252  472:aload_0         
	//  253  473:getfield        #12  <Field azh a>
	//  254  476:astore_1        
		abyte0.ag = ((azh) (abyte0)).e & ~a.aC;
	//  255  477:aload_1         
	//  256  478:aload_1         
	//  257  479:getfield        #77  <Field int azh.e>
	//  258  482:aload_0         
	//  259  483:getfield        #12  <Field azh a>
	//  260  486:getfield        #88  <Field int azh.aC>
	//  261  489:iconst_m1       
	//  262  490:ixor            
	//  263  491:iand            
	//  264  492:putfield        #94  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	//  265  495:aload_0         
	//  266  496:getfield        #12  <Field azh a>
	//  267  499:astore_1        
		abyte0.bw = ((azh) (abyte0)).I | a.ag;
	//  268  500:aload_1         
	//  269  501:aload_1         
	//  270  502:getfield        #79  <Field int azh.I>
	//  271  505:aload_0         
	//  272  506:getfield        #12  <Field azh a>
	//  273  509:getfield        #94  <Field int azh.ag>
	//  274  512:ior             
	//  275  513:putfield        #97  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	//  276  516:aload_0         
	//  277  517:getfield        #12  <Field azh a>
	//  278  520:astore_1        
		abyte0.bQ = ((azh) (abyte0)).bh ^ a.bQ;
	//  279  521:aload_1         
	//  280  522:aload_1         
	//  281  523:getfield        #53  <Field int azh.bh>
	//  282  526:aload_0         
	//  283  527:getfield        #12  <Field azh a>
	//  284  530:getfield        #100 <Field int azh.bQ>
	//  285  533:ixor            
	//  286  534:putfield        #100 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	//  287  537:aload_0         
	//  288  538:getfield        #12  <Field azh a>
	//  289  541:astore_1        
		abyte0.bS = ((azh) (abyte0)).bQ ^ a.bS;
	//  290  542:aload_1         
	//  291  543:aload_1         
	//  292  544:getfield        #100 <Field int azh.bQ>
	//  293  547:aload_0         
	//  294  548:getfield        #12  <Field azh a>
	//  295  551:getfield        #103 <Field int azh.bS>
	//  296  554:ixor            
	//  297  555:putfield        #103 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	//  298  558:aload_0         
	//  299  559:getfield        #12  <Field azh a>
	//  300  562:astore_1        
		abyte0.bc = ((azh) (abyte0)).bS ^ a.bc;
	//  301  563:aload_1         
	//  302  564:aload_1         
	//  303  565:getfield        #103 <Field int azh.bS>
	//  304  568:aload_0         
	//  305  569:getfield        #12  <Field azh a>
	//  306  572:getfield        #106 <Field int azh.bc>
	//  307  575:ixor            
	//  308  576:putfield        #106 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	//  309  579:aload_0         
	//  310  580:getfield        #12  <Field azh a>
	//  311  583:astore_1        
		abyte0.bh = ((azh) (abyte0)).bh & ~a.aL;
	//  312  584:aload_1         
	//  313  585:aload_1         
	//  314  586:getfield        #53  <Field int azh.bh>
	//  315  589:aload_0         
	//  316  590:getfield        #12  <Field azh a>
	//  317  593:getfield        #109 <Field int azh.aL>
	//  318  596:iconst_m1       
	//  319  597:ixor            
	//  320  598:iand            
	//  321  599:putfield        #53  <Field int azh.bh>
		abyte0 = ((byte []) (a));
	//  322  602:aload_0         
	//  323  603:getfield        #12  <Field azh a>
	//  324  606:astore_1        
		abyte0.bh = ((azh) (abyte0)).l ^ a.bh;
	//  325  607:aload_1         
	//  326  608:aload_1         
	//  327  609:getfield        #112 <Field int azh.l>
	//  328  612:aload_0         
	//  329  613:getfield        #12  <Field azh a>
	//  330  616:getfield        #53  <Field int azh.bh>
	//  331  619:ixor            
	//  332  620:putfield        #53  <Field int azh.bh>
		abyte0 = ((byte []) (a));
	//  333  623:aload_0         
	//  334  624:getfield        #12  <Field azh a>
	//  335  627:astore_1        
		abyte0.l = ((azh) (abyte0)).bE & ~a.bh;
	//  336  628:aload_1         
	//  337  629:aload_1         
	//  338  630:getfield        #56  <Field int azh.bE>
	//  339  633:aload_0         
	//  340  634:getfield        #12  <Field azh a>
	//  341  637:getfield        #53  <Field int azh.bh>
	//  342  640:iconst_m1       
	//  343  641:ixor            
	//  344  642:iand            
	//  345  643:putfield        #112 <Field int azh.l>
		abyte0 = ((byte []) (a));
	//  346  646:aload_0         
	//  347  647:getfield        #12  <Field azh a>
	//  348  650:astore_1        
		abyte0.l = ((azh) (abyte0)).cb ^ a.l;
	//  349  651:aload_1         
	//  350  652:aload_1         
	//  351  653:getfield        #115 <Field int azh.cb>
	//  352  656:aload_0         
	//  353  657:getfield        #12  <Field azh a>
	//  354  660:getfield        #112 <Field int azh.l>
	//  355  663:ixor            
	//  356  664:putfield        #112 <Field int azh.l>
		abyte0 = ((byte []) (a));
	//  357  667:aload_0         
	//  358  668:getfield        #12  <Field azh a>
	//  359  671:astore_1        
		abyte0.aT = ((azh) (abyte0)).l ^ a.aT;
	//  360  672:aload_1         
	//  361  673:aload_1         
	//  362  674:getfield        #112 <Field int azh.l>
	//  363  677:aload_0         
	//  364  678:getfield        #12  <Field azh a>
	//  365  681:getfield        #118 <Field int azh.aT>
	//  366  684:ixor            
	//  367  685:putfield        #118 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	//  368  688:aload_0         
	//  369  689:getfield        #12  <Field azh a>
	//  370  692:astore_1        
		abyte0.am = ((azh) (abyte0)).aT ^ a.am;
	//  371  693:aload_1         
	//  372  694:aload_1         
	//  373  695:getfield        #118 <Field int azh.aT>
	//  374  698:aload_0         
	//  375  699:getfield        #12  <Field azh a>
	//  376  702:getfield        #121 <Field int azh.am>
	//  377  705:ixor            
	//  378  706:putfield        #121 <Field int azh.am>
		abyte0 = ((byte []) (a));
	//  379  709:aload_0         
	//  380  710:getfield        #12  <Field azh a>
	//  381  713:astore_1        
		abyte0.m = ((azh) (abyte0)).am ^ a.m;
	//  382  714:aload_1         
	//  383  715:aload_1         
	//  384  716:getfield        #121 <Field int azh.am>
	//  385  719:aload_0         
	//  386  720:getfield        #12  <Field azh a>
	//  387  723:getfield        #124 <Field int azh.m>
	//  388  726:ixor            
	//  389  727:putfield        #124 <Field int azh.m>
		abyte0 = ((byte []) (a));
	//  390  730:aload_0         
	//  391  731:getfield        #12  <Field azh a>
	//  392  734:astore_1        
		abyte0.bV = ((azh) (abyte0)).bh ^ a.bV;
	//  393  735:aload_1         
	//  394  736:aload_1         
	//  395  737:getfield        #53  <Field int azh.bh>
	//  396  740:aload_0         
	//  397  741:getfield        #12  <Field azh a>
	//  398  744:getfield        #127 <Field int azh.bV>
	//  399  747:ixor            
	//  400  748:putfield        #127 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	//  401  751:aload_0         
	//  402  752:getfield        #12  <Field azh a>
	//  403  755:astore_1        
		abyte0.bV = ((azh) (abyte0)).al | a.bV;
	//  404  756:aload_1         
	//  405  757:aload_1         
	//  406  758:getfield        #71  <Field int azh.al>
	//  407  761:aload_0         
	//  408  762:getfield        #12  <Field azh a>
	//  409  765:getfield        #127 <Field int azh.bV>
	//  410  768:ior             
	//  411  769:putfield        #127 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	//  412  772:aload_0         
	//  413  773:getfield        #12  <Field azh a>
	//  414  776:astore_1        
		abyte0.bV = ((azh) (abyte0)).bc ^ a.bV;
	//  415  777:aload_1         
	//  416  778:aload_1         
	//  417  779:getfield        #106 <Field int azh.bc>
	//  418  782:aload_0         
	//  419  783:getfield        #12  <Field azh a>
	//  420  786:getfield        #127 <Field int azh.bV>
	//  421  789:ixor            
	//  422  790:putfield        #127 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	//  423  793:aload_0         
	//  424  794:getfield        #12  <Field azh a>
	//  425  797:astore_1        
		abyte0.O = ((azh) (abyte0)).bV ^ a.O;
	//  426  798:aload_1         
	//  427  799:aload_1         
	//  428  800:getfield        #127 <Field int azh.bV>
	//  429  803:aload_0         
	//  430  804:getfield        #12  <Field azh a>
	//  431  807:getfield        #130 <Field int azh.O>
	//  432  810:ixor            
	//  433  811:putfield        #130 <Field int azh.O>
		abyte0 = ((byte []) (a));
	//  434  814:aload_0         
	//  435  815:getfield        #12  <Field azh a>
	//  436  818:astore_1        
		abyte0.bV = ((azh) (abyte0)).bF & a.O;
	//  437  819:aload_1         
	//  438  820:aload_1         
	//  439  821:getfield        #133 <Field int azh.bF>
	//  440  824:aload_0         
	//  441  825:getfield        #12  <Field azh a>
	//  442  828:getfield        #130 <Field int azh.O>
	//  443  831:iand            
	//  444  832:putfield        #127 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	//  445  835:aload_0         
	//  446  836:getfield        #12  <Field azh a>
	//  447  839:astore_1        
		abyte0.bc = ((azh) (abyte0)).bF & a.O;
	//  448  840:aload_1         
	//  449  841:aload_1         
	//  450  842:getfield        #133 <Field int azh.bF>
	//  451  845:aload_0         
	//  452  846:getfield        #12  <Field azh a>
	//  453  849:getfield        #130 <Field int azh.O>
	//  454  852:iand            
	//  455  853:putfield        #106 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	//  456  856:aload_0         
	//  457  857:getfield        #12  <Field azh a>
	//  458  860:astore_1        
		abyte0.bh = ((azh) (abyte0)).bF & ~a.O;
	//  459  861:aload_1         
	//  460  862:aload_1         
	//  461  863:getfield        #133 <Field int azh.bF>
	//  462  866:aload_0         
	//  463  867:getfield        #12  <Field azh a>
	//  464  870:getfield        #130 <Field int azh.O>
	//  465  873:iconst_m1       
	//  466  874:ixor            
	//  467  875:iand            
	//  468  876:putfield        #53  <Field int azh.bh>
		abyte0 = ((byte []) (a));
	//  469  879:aload_0         
	//  470  880:getfield        #12  <Field azh a>
	//  471  883:astore_1        
		abyte0.am = ((azh) (abyte0)).bF & ~a.O;
	//  472  884:aload_1         
	//  473  885:aload_1         
	//  474  886:getfield        #133 <Field int azh.bF>
	//  475  889:aload_0         
	//  476  890:getfield        #12  <Field azh a>
	//  477  893:getfield        #130 <Field int azh.O>
	//  478  896:iconst_m1       
	//  479  897:ixor            
	//  480  898:iand            
	//  481  899:putfield        #121 <Field int azh.am>
		abyte0 = ((byte []) (a));
	//  482  902:aload_0         
	//  483  903:getfield        #12  <Field azh a>
	//  484  906:astore_1        
		abyte0.bX = ((azh) (abyte0)).av ^ a.bX;
	//  485  907:aload_1         
	//  486  908:aload_1         
	//  487  909:getfield        #136 <Field int azh.av>
	//  488  912:aload_0         
	//  489  913:getfield        #12  <Field azh a>
	//  490  916:getfield        #139 <Field int azh.bX>
	//  491  919:ixor            
	//  492  920:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	//  493  923:aload_0         
	//  494  924:getfield        #12  <Field azh a>
	//  495  927:astore_1        
		abyte0.B = ((azh) (abyte0)).bX ^ a.B;
	//  496  928:aload_1         
	//  497  929:aload_1         
	//  498  930:getfield        #139 <Field int azh.bX>
	//  499  933:aload_0         
	//  500  934:getfield        #12  <Field azh a>
	//  501  937:getfield        #142 <Field int azh.B>
	//  502  940:ixor            
	//  503  941:putfield        #142 <Field int azh.B>
		abyte0 = ((byte []) (a));
	//  504  944:aload_0         
	//  505  945:getfield        #12  <Field azh a>
	//  506  948:astore_1        
		abyte0.g = ((azh) (abyte0)).g | a.S;
	//  507  949:aload_1         
	//  508  950:aload_1         
	//  509  951:getfield        #145 <Field int azh.g>
	//  510  954:aload_0         
	//  511  955:getfield        #12  <Field azh a>
	//  512  958:getfield        #148 <Field int azh.S>
	//  513  961:ior             
	//  514  962:putfield        #145 <Field int azh.g>
		abyte0 = ((byte []) (a));
	//  515  965:aload_0         
	//  516  966:getfield        #12  <Field azh a>
	//  517  969:astore_1        
		abyte0.g = ((azh) (abyte0)).S ^ a.g;
	//  518  970:aload_1         
	//  519  971:aload_1         
	//  520  972:getfield        #148 <Field int azh.S>
	//  521  975:aload_0         
	//  522  976:getfield        #12  <Field azh a>
	//  523  979:getfield        #145 <Field int azh.g>
	//  524  982:ixor            
	//  525  983:putfield        #145 <Field int azh.g>
		abyte0 = ((byte []) (a));
	//  526  986:aload_0         
	//  527  987:getfield        #12  <Field azh a>
	//  528  990:astore_1        
		abyte0.aK = ((azh) (abyte0)).g ^ a.aK;
	//  529  991:aload_1         
	//  530  992:aload_1         
	//  531  993:getfield        #145 <Field int azh.g>
	//  532  996:aload_0         
	//  533  997:getfield        #12  <Field azh a>
	//  534 1000:getfield        #151 <Field int azh.aK>
	//  535 1003:ixor            
	//  536 1004:putfield        #151 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	//  537 1007:aload_0         
	//  538 1008:getfield        #12  <Field azh a>
	//  539 1011:astore_1        
		abyte0.bW = ((azh) (abyte0)).aK ^ a.bW;
	//  540 1012:aload_1         
	//  541 1013:aload_1         
	//  542 1014:getfield        #151 <Field int azh.aK>
	//  543 1017:aload_0         
	//  544 1018:getfield        #12  <Field azh a>
	//  545 1021:getfield        #154 <Field int azh.bW>
	//  546 1024:ixor            
	//  547 1025:putfield        #154 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	//  548 1028:aload_0         
	//  549 1029:getfield        #12  <Field azh a>
	//  550 1032:astore_1        
		abyte0.bW = ((azh) (abyte0)).bW & ~a.K;
	//  551 1033:aload_1         
	//  552 1034:aload_1         
	//  553 1035:getfield        #154 <Field int azh.bW>
	//  554 1038:aload_0         
	//  555 1039:getfield        #12  <Field azh a>
	//  556 1042:getfield        #157 <Field int azh.K>
	//  557 1045:iconst_m1       
	//  558 1046:ixor            
	//  559 1047:iand            
	//  560 1048:putfield        #154 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	//  561 1051:aload_0         
	//  562 1052:getfield        #12  <Field azh a>
	//  563 1055:astore_1        
		abyte0.bW = ((azh) (abyte0)).B ^ a.bW;
	//  564 1056:aload_1         
	//  565 1057:aload_1         
	//  566 1058:getfield        #142 <Field int azh.B>
	//  567 1061:aload_0         
	//  568 1062:getfield        #12  <Field azh a>
	//  569 1065:getfield        #154 <Field int azh.bW>
	//  570 1068:ixor            
	//  571 1069:putfield        #154 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	//  572 1072:aload_0         
	//  573 1073:getfield        #12  <Field azh a>
	//  574 1076:astore_1        
		abyte0.x = ((azh) (abyte0)).bW ^ a.x;
	//  575 1077:aload_1         
	//  576 1078:aload_1         
	//  577 1079:getfield        #154 <Field int azh.bW>
	//  578 1082:aload_0         
	//  579 1083:getfield        #12  <Field azh a>
	//  580 1086:getfield        #160 <Field int azh.x>
	//  581 1089:ixor            
	//  582 1090:putfield        #160 <Field int azh.x>
		abyte0 = ((byte []) (a));
	//  583 1093:aload_0         
	//  584 1094:getfield        #12  <Field azh a>
	//  585 1097:astore_1        
		abyte0.bW = ((azh) (abyte0)).x & a.bk;
	//  586 1098:aload_1         
	//  587 1099:aload_1         
	//  588 1100:getfield        #160 <Field int azh.x>
	//  589 1103:aload_0         
	//  590 1104:getfield        #12  <Field azh a>
	//  591 1107:getfield        #163 <Field int azh.bk>
	//  592 1110:iand            
	//  593 1111:putfield        #154 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	//  594 1114:aload_0         
	//  595 1115:getfield        #12  <Field azh a>
	//  596 1118:astore_1        
		abyte0.bW = ((azh) (abyte0)).F ^ a.bW;
	//  597 1119:aload_1         
	//  598 1120:aload_1         
	//  599 1121:getfield        #166 <Field int azh.F>
	//  600 1124:aload_0         
	//  601 1125:getfield        #12  <Field azh a>
	//  602 1128:getfield        #154 <Field int azh.bW>
	//  603 1131:ixor            
	//  604 1132:putfield        #154 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	//  605 1135:aload_0         
	//  606 1136:getfield        #12  <Field azh a>
	//  607 1139:astore_1        
		abyte0.B = ((azh) (abyte0)).x & a.aj;
	//  608 1140:aload_1         
	//  609 1141:aload_1         
	//  610 1142:getfield        #160 <Field int azh.x>
	//  611 1145:aload_0         
	//  612 1146:getfield        #12  <Field azh a>
	//  613 1149:getfield        #169 <Field int azh.aj>
	//  614 1152:iand            
	//  615 1153:putfield        #142 <Field int azh.B>
		abyte0 = ((byte []) (a));
	//  616 1156:aload_0         
	//  617 1157:getfield        #12  <Field azh a>
	//  618 1160:astore_1        
		abyte0.B = ((azh) (abyte0)).aj ^ a.B;
	//  619 1161:aload_1         
	//  620 1162:aload_1         
	//  621 1163:getfield        #169 <Field int azh.aj>
	//  622 1166:aload_0         
	//  623 1167:getfield        #12  <Field azh a>
	//  624 1170:getfield        #142 <Field int azh.B>
	//  625 1173:ixor            
	//  626 1174:putfield        #142 <Field int azh.B>
		abyte0 = ((byte []) (a));
	//  627 1177:aload_0         
	//  628 1178:getfield        #12  <Field azh a>
	//  629 1181:astore_1        
		abyte0.B = ((azh) (abyte0)).B & ~a.h;
	//  630 1182:aload_1         
	//  631 1183:aload_1         
	//  632 1184:getfield        #142 <Field int azh.B>
	//  633 1187:aload_0         
	//  634 1188:getfield        #12  <Field azh a>
	//  635 1191:getfield        #172 <Field int azh.h>
	//  636 1194:iconst_m1       
	//  637 1195:ixor            
	//  638 1196:iand            
	//  639 1197:putfield        #142 <Field int azh.B>
		abyte0 = ((byte []) (a));
	//  640 1200:aload_0         
	//  641 1201:getfield        #12  <Field azh a>
	//  642 1204:astore_1        
		abyte0.B = ((azh) (abyte0)).aZ ^ a.B;
	//  643 1205:aload_1         
	//  644 1206:aload_1         
	//  645 1207:getfield        #175 <Field int azh.aZ>
	//  646 1210:aload_0         
	//  647 1211:getfield        #12  <Field azh a>
	//  648 1214:getfield        #142 <Field int azh.B>
	//  649 1217:ixor            
	//  650 1218:putfield        #142 <Field int azh.B>
		abyte0 = ((byte []) (a));
	//  651 1221:aload_0         
	//  652 1222:getfield        #12  <Field azh a>
	//  653 1225:astore_1        
		abyte0.B = ((azh) (abyte0)).p | a.B;
	//  654 1226:aload_1         
	//  655 1227:aload_1         
	//  656 1228:getfield        #178 <Field int azh.p>
	//  657 1231:aload_0         
	//  658 1232:getfield        #12  <Field azh a>
	//  659 1235:getfield        #142 <Field int azh.B>
	//  660 1238:ior             
	//  661 1239:putfield        #142 <Field int azh.B>
		abyte0 = ((byte []) (a));
	//  662 1242:aload_0         
	//  663 1243:getfield        #12  <Field azh a>
	//  664 1246:astore_1        
		abyte0.aK = ((azh) (abyte0)).x & a.aZ;
	//  665 1247:aload_1         
	//  666 1248:aload_1         
	//  667 1249:getfield        #160 <Field int azh.x>
	//  668 1252:aload_0         
	//  669 1253:getfield        #12  <Field azh a>
	//  670 1256:getfield        #175 <Field int azh.aZ>
	//  671 1259:iand            
	//  672 1260:putfield        #151 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	//  673 1263:aload_0         
	//  674 1264:getfield        #12  <Field azh a>
	//  675 1267:astore_1        
		abyte0.aK = ((azh) (abyte0)).ci ^ a.aK;
	//  676 1268:aload_1         
	//  677 1269:aload_1         
	//  678 1270:getfield        #181 <Field int azh.ci>
	//  679 1273:aload_0         
	//  680 1274:getfield        #12  <Field azh a>
	//  681 1277:getfield        #151 <Field int azh.aK>
	//  682 1280:ixor            
	//  683 1281:putfield        #151 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	//  684 1284:aload_0         
	//  685 1285:getfield        #12  <Field azh a>
	//  686 1288:astore_1        
		abyte0.bX = ((azh) (abyte0)).x & a.bf;
	//  687 1289:aload_1         
	//  688 1290:aload_1         
	//  689 1291:getfield        #160 <Field int azh.x>
	//  690 1294:aload_0         
	//  691 1295:getfield        #12  <Field azh a>
	//  692 1298:getfield        #184 <Field int azh.bf>
	//  693 1301:iand            
	//  694 1302:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	//  695 1305:aload_0         
	//  696 1306:getfield        #12  <Field azh a>
	//  697 1309:astore_1        
		abyte0.bX = ((azh) (abyte0)).bf ^ a.bX;
	//  698 1310:aload_1         
	//  699 1311:aload_1         
	//  700 1312:getfield        #184 <Field int azh.bf>
	//  701 1315:aload_0         
	//  702 1316:getfield        #12  <Field azh a>
	//  703 1319:getfield        #139 <Field int azh.bX>
	//  704 1322:ixor            
	//  705 1323:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	//  706 1326:aload_0         
	//  707 1327:getfield        #12  <Field azh a>
	//  708 1330:astore_1        
		abyte0.bX = ((azh) (abyte0)).bX ^ a.h;
	//  709 1331:aload_1         
	//  710 1332:aload_1         
	//  711 1333:getfield        #139 <Field int azh.bX>
	//  712 1336:aload_0         
	//  713 1337:getfield        #12  <Field azh a>
	//  714 1340:getfield        #172 <Field int azh.h>
	//  715 1343:ixor            
	//  716 1344:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	//  717 1347:aload_0         
	//  718 1348:getfield        #12  <Field azh a>
	//  719 1351:astore_1        
		abyte0.B = ((azh) (abyte0)).bX ^ a.B;
	//  720 1352:aload_1         
	//  721 1353:aload_1         
	//  722 1354:getfield        #139 <Field int azh.bX>
	//  723 1357:aload_0         
	//  724 1358:getfield        #12  <Field azh a>
	//  725 1361:getfield        #142 <Field int azh.B>
	//  726 1364:ixor            
	//  727 1365:putfield        #142 <Field int azh.B>
		abyte0 = ((byte []) (a));
	//  728 1368:aload_0         
	//  729 1369:getfield        #12  <Field azh a>
	//  730 1372:astore_1        
		abyte0.bX = ((azh) (abyte0)).x & ~a.aZ;
	//  731 1373:aload_1         
	//  732 1374:aload_1         
	//  733 1375:getfield        #160 <Field int azh.x>
	//  734 1378:aload_0         
	//  735 1379:getfield        #12  <Field azh a>
	//  736 1382:getfield        #175 <Field int azh.aZ>
	//  737 1385:iconst_m1       
	//  738 1386:ixor            
	//  739 1387:iand            
	//  740 1388:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	//  741 1391:aload_0         
	//  742 1392:getfield        #12  <Field azh a>
	//  743 1395:astore_1        
		abyte0.bX = ((azh) (abyte0)).au ^ a.bX;
	//  744 1396:aload_1         
	//  745 1397:aload_1         
	//  746 1398:getfield        #187 <Field int azh.au>
	//  747 1401:aload_0         
	//  748 1402:getfield        #12  <Field azh a>
	//  749 1405:getfield        #139 <Field int azh.bX>
	//  750 1408:ixor            
	//  751 1409:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	//  752 1412:aload_0         
	//  753 1413:getfield        #12  <Field azh a>
	//  754 1416:astore_1        
		abyte0.bX = ((azh) (abyte0)).bX ^ a.h;
	//  755 1417:aload_1         
	//  756 1418:aload_1         
	//  757 1419:getfield        #139 <Field int azh.bX>
	//  758 1422:aload_0         
	//  759 1423:getfield        #12  <Field azh a>
	//  760 1426:getfield        #172 <Field int azh.h>
	//  761 1429:ixor            
	//  762 1430:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	//  763 1433:aload_0         
	//  764 1434:getfield        #12  <Field azh a>
	//  765 1437:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bX ^ a.bJ;
	//  766 1438:aload_1         
	//  767 1439:aload_1         
	//  768 1440:getfield        #139 <Field int azh.bX>
	//  769 1443:aload_0         
	//  770 1444:getfield        #12  <Field azh a>
	//  771 1447:getfield        #190 <Field int azh.bJ>
	//  772 1450:ixor            
	//  773 1451:putfield        #190 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	//  774 1454:aload_0         
	//  775 1455:getfield        #12  <Field azh a>
	//  776 1458:astore_1        
		abyte0.bX = ((azh) (abyte0)).x & ~a.F;
	//  777 1459:aload_1         
	//  778 1460:aload_1         
	//  779 1461:getfield        #160 <Field int azh.x>
	//  780 1464:aload_0         
	//  781 1465:getfield        #12  <Field azh a>
	//  782 1468:getfield        #166 <Field int azh.F>
	//  783 1471:iconst_m1       
	//  784 1472:ixor            
	//  785 1473:iand            
	//  786 1474:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	//  787 1477:aload_0         
	//  788 1478:getfield        #12  <Field azh a>
	//  789 1481:astore_1        
		abyte0.bX = ((azh) (abyte0)).aZ ^ a.bX;
	//  790 1482:aload_1         
	//  791 1483:aload_1         
	//  792 1484:getfield        #175 <Field int azh.aZ>
	//  793 1487:aload_0         
	//  794 1488:getfield        #12  <Field azh a>
	//  795 1491:getfield        #139 <Field int azh.bX>
	//  796 1494:ixor            
	//  797 1495:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	//  798 1498:aload_0         
	//  799 1499:getfield        #12  <Field azh a>
	//  800 1502:astore_1        
		abyte0.av = ((azh) (abyte0)).x & ~a.aj;
	//  801 1503:aload_1         
	//  802 1504:aload_1         
	//  803 1505:getfield        #160 <Field int azh.x>
	//  804 1508:aload_0         
	//  805 1509:getfield        #12  <Field azh a>
	//  806 1512:getfield        #169 <Field int azh.aj>
	//  807 1515:iconst_m1       
	//  808 1516:ixor            
	//  809 1517:iand            
	//  810 1518:putfield        #136 <Field int azh.av>
		abyte0 = ((byte []) (a));
	//  811 1521:aload_0         
	//  812 1522:getfield        #12  <Field azh a>
	//  813 1525:astore_1        
		abyte0.av = ((azh) (abyte0)).ci ^ a.av;
	//  814 1526:aload_1         
	//  815 1527:aload_1         
	//  816 1528:getfield        #181 <Field int azh.ci>
	//  817 1531:aload_0         
	//  818 1532:getfield        #12  <Field azh a>
	//  819 1535:getfield        #136 <Field int azh.av>
	//  820 1538:ixor            
	//  821 1539:putfield        #136 <Field int azh.av>
		abyte0 = ((byte []) (a));
	//  822 1542:aload_0         
	//  823 1543:getfield        #12  <Field azh a>
	//  824 1546:astore_1        
		abyte0.aT = ((azh) (abyte0)).x & ~a.au;
	//  825 1547:aload_1         
	//  826 1548:aload_1         
	//  827 1549:getfield        #160 <Field int azh.x>
	//  828 1552:aload_0         
	//  829 1553:getfield        #12  <Field azh a>
	//  830 1556:getfield        #187 <Field int azh.au>
	//  831 1559:iconst_m1       
	//  832 1560:ixor            
	//  833 1561:iand            
	//  834 1562:putfield        #118 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	//  835 1565:aload_0         
	//  836 1566:getfield        #12  <Field azh a>
	//  837 1569:astore_1        
		abyte0.aT = ((azh) (abyte0)).C ^ a.aT;
	//  838 1570:aload_1         
	//  839 1571:aload_1         
	//  840 1572:getfield        #193 <Field int azh.C>
	//  841 1575:aload_0         
	//  842 1576:getfield        #12  <Field azh a>
	//  843 1579:getfield        #118 <Field int azh.aT>
	//  844 1582:ixor            
	//  845 1583:putfield        #118 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	//  846 1586:aload_0         
	//  847 1587:getfield        #12  <Field azh a>
	//  848 1590:astore_1        
		abyte0.aT = ((azh) (abyte0)).h & a.aT;
	//  849 1591:aload_1         
	//  850 1592:aload_1         
	//  851 1593:getfield        #172 <Field int azh.h>
	//  852 1596:aload_0         
	//  853 1597:getfield        #12  <Field azh a>
	//  854 1600:getfield        #118 <Field int azh.aT>
	//  855 1603:iand            
	//  856 1604:putfield        #118 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	//  857 1607:aload_0         
	//  858 1608:getfield        #12  <Field azh a>
	//  859 1611:astore_1        
		abyte0.aT = ((azh) (abyte0)).bk ^ a.aT;
	//  860 1612:aload_1         
	//  861 1613:aload_1         
	//  862 1614:getfield        #163 <Field int azh.bk>
	//  863 1617:aload_0         
	//  864 1618:getfield        #12  <Field azh a>
	//  865 1621:getfield        #118 <Field int azh.aT>
	//  866 1624:ixor            
	//  867 1625:putfield        #118 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	//  868 1628:aload_0         
	//  869 1629:getfield        #12  <Field azh a>
	//  870 1632:astore_1        
		abyte0.bH = ((azh) (abyte0)).aT ^ a.bH;
	//  871 1633:aload_1         
	//  872 1634:aload_1         
	//  873 1635:getfield        #118 <Field int azh.aT>
	//  874 1638:aload_0         
	//  875 1639:getfield        #12  <Field azh a>
	//  876 1642:getfield        #196 <Field int azh.bH>
	//  877 1645:ixor            
	//  878 1646:putfield        #196 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	//  879 1649:aload_0         
	//  880 1650:getfield        #12  <Field azh a>
	//  881 1653:astore_1        
		abyte0.bH = ((azh) (abyte0)).bH | a.N;
	//  882 1654:aload_1         
	//  883 1655:aload_1         
	//  884 1656:getfield        #196 <Field int azh.bH>
	//  885 1659:aload_0         
	//  886 1660:getfield        #12  <Field azh a>
	//  887 1663:getfield        #199 <Field int azh.N>
	//  888 1666:ior             
	//  889 1667:putfield        #196 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	//  890 1670:aload_0         
	//  891 1671:getfield        #12  <Field azh a>
	//  892 1674:astore_1        
		abyte0.aT = ((azh) (abyte0)).x & a.aj;
	//  893 1675:aload_1         
	//  894 1676:aload_1         
	//  895 1677:getfield        #160 <Field int azh.x>
	//  896 1680:aload_0         
	//  897 1681:getfield        #12  <Field azh a>
	//  898 1684:getfield        #169 <Field int azh.aj>
	//  899 1687:iand            
	//  900 1688:putfield        #118 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	//  901 1691:aload_0         
	//  902 1692:getfield        #12  <Field azh a>
	//  903 1695:astore_1        
		abyte0.aT = ((azh) (abyte0)).au ^ a.aT;
	//  904 1696:aload_1         
	//  905 1697:aload_1         
	//  906 1698:getfield        #187 <Field int azh.au>
	//  907 1701:aload_0         
	//  908 1702:getfield        #12  <Field azh a>
	//  909 1705:getfield        #118 <Field int azh.aT>
	//  910 1708:ixor            
	//  911 1709:putfield        #118 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	//  912 1712:aload_0         
	//  913 1713:getfield        #12  <Field azh a>
	//  914 1716:astore_1        
		abyte0.aT = ((azh) (abyte0)).aT & ~a.h;
	//  915 1717:aload_1         
	//  916 1718:aload_1         
	//  917 1719:getfield        #118 <Field int azh.aT>
	//  918 1722:aload_0         
	//  919 1723:getfield        #12  <Field azh a>
	//  920 1726:getfield        #172 <Field int azh.h>
	//  921 1729:iconst_m1       
	//  922 1730:ixor            
	//  923 1731:iand            
	//  924 1732:putfield        #118 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	//  925 1735:aload_0         
	//  926 1736:getfield        #12  <Field azh a>
	//  927 1739:astore_1        
		abyte0.aT = ((azh) (abyte0)).aK ^ a.aT;
	//  928 1740:aload_1         
	//  929 1741:aload_1         
	//  930 1742:getfield        #151 <Field int azh.aK>
	//  931 1745:aload_0         
	//  932 1746:getfield        #12  <Field azh a>
	//  933 1749:getfield        #118 <Field int azh.aT>
	//  934 1752:ixor            
	//  935 1753:putfield        #118 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	//  936 1756:aload_0         
	//  937 1757:getfield        #12  <Field azh a>
	//  938 1760:astore_1        
		abyte0.aD = ((azh) (abyte0)).aT ^ a.aD;
	//  939 1761:aload_1         
	//  940 1762:aload_1         
	//  941 1763:getfield        #118 <Field int azh.aT>
	//  942 1766:aload_0         
	//  943 1767:getfield        #12  <Field azh a>
	//  944 1770:getfield        #202 <Field int azh.aD>
	//  945 1773:ixor            
	//  946 1774:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	//  947 1777:aload_0         
	//  948 1778:getfield        #12  <Field azh a>
	//  949 1781:astore_1        
		abyte0.aD = ((azh) (abyte0)).aD & ~a.N;
	//  950 1782:aload_1         
	//  951 1783:aload_1         
	//  952 1784:getfield        #202 <Field int azh.aD>
	//  953 1787:aload_0         
	//  954 1788:getfield        #12  <Field azh a>
	//  955 1791:getfield        #199 <Field int azh.N>
	//  956 1794:iconst_m1       
	//  957 1795:ixor            
	//  958 1796:iand            
	//  959 1797:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	//  960 1800:aload_0         
	//  961 1801:getfield        #12  <Field azh a>
	//  962 1804:astore_1        
		abyte0.aD = ((azh) (abyte0)).bJ ^ a.aD;
	//  963 1805:aload_1         
	//  964 1806:aload_1         
	//  965 1807:getfield        #190 <Field int azh.bJ>
	//  966 1810:aload_0         
	//  967 1811:getfield        #12  <Field azh a>
	//  968 1814:getfield        #202 <Field int azh.aD>
	//  969 1817:ixor            
	//  970 1818:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	//  971 1821:aload_0         
	//  972 1822:getfield        #12  <Field azh a>
	//  973 1825:astore_1        
		abyte0.bs = ((azh) (abyte0)).aD ^ a.bs;
	//  974 1826:aload_1         
	//  975 1827:aload_1         
	//  976 1828:getfield        #202 <Field int azh.aD>
	//  977 1831:aload_0         
	//  978 1832:getfield        #12  <Field azh a>
	//  979 1835:getfield        #205 <Field int azh.bs>
	//  980 1838:ixor            
	//  981 1839:putfield        #205 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	//  982 1842:aload_0         
	//  983 1843:getfield        #12  <Field azh a>
	//  984 1846:astore_1        
		abyte0.aD = ((azh) (abyte0)).ae & ~a.bs;
	//  985 1847:aload_1         
	//  986 1848:aload_1         
	//  987 1849:getfield        #208 <Field int azh.ae>
	//  988 1852:aload_0         
	//  989 1853:getfield        #12  <Field azh a>
	//  990 1856:getfield        #205 <Field int azh.bs>
	//  991 1859:iconst_m1       
	//  992 1860:ixor            
	//  993 1861:iand            
	//  994 1862:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	//  995 1865:aload_0         
	//  996 1866:getfield        #12  <Field azh a>
	//  997 1869:astore_1        
		abyte0.bJ = ((azh) (abyte0)).be & ~a.bs;
	//  998 1870:aload_1         
	//  999 1871:aload_1         
	// 1000 1872:getfield        #211 <Field int azh.be>
	// 1001 1875:aload_0         
	// 1002 1876:getfield        #12  <Field azh a>
	// 1003 1879:getfield        #205 <Field int azh.bs>
	// 1004 1882:iconst_m1       
	// 1005 1883:ixor            
	// 1006 1884:iand            
	// 1007 1885:putfield        #190 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 1008 1888:aload_0         
	// 1009 1889:getfield        #12  <Field azh a>
	// 1010 1892:astore_1        
		abyte0.aT = ((azh) (abyte0)).ae & a.bJ;
	// 1011 1893:aload_1         
	// 1012 1894:aload_1         
	// 1013 1895:getfield        #208 <Field int azh.ae>
	// 1014 1898:aload_0         
	// 1015 1899:getfield        #12  <Field azh a>
	// 1016 1902:getfield        #190 <Field int azh.bJ>
	// 1017 1905:iand            
	// 1018 1906:putfield        #118 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 1019 1909:aload_0         
	// 1020 1910:getfield        #12  <Field azh a>
	// 1021 1913:astore_1        
		abyte0.aK = ((azh) (abyte0)).ae & a.bJ;
	// 1022 1914:aload_1         
	// 1023 1915:aload_1         
	// 1024 1916:getfield        #208 <Field int azh.ae>
	// 1025 1919:aload_0         
	// 1026 1920:getfield        #12  <Field azh a>
	// 1027 1923:getfield        #190 <Field int azh.bJ>
	// 1028 1926:iand            
	// 1029 1927:putfield        #151 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 1030 1930:aload_0         
	// 1031 1931:getfield        #12  <Field azh a>
	// 1032 1934:astore_1        
		abyte0.au = ((azh) (abyte0)).s & ~a.bs;
	// 1033 1935:aload_1         
	// 1034 1936:aload_1         
	// 1035 1937:getfield        #214 <Field int azh.s>
	// 1036 1940:aload_0         
	// 1037 1941:getfield        #12  <Field azh a>
	// 1038 1944:getfield        #205 <Field int azh.bs>
	// 1039 1947:iconst_m1       
	// 1040 1948:ixor            
	// 1041 1949:iand            
	// 1042 1950:putfield        #187 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 1043 1953:aload_0         
	// 1044 1954:getfield        #12  <Field azh a>
	// 1045 1957:astore_1        
		abyte0.bk = ((azh) (abyte0)).bs & ~a.be;
	// 1046 1958:aload_1         
	// 1047 1959:aload_1         
	// 1048 1960:getfield        #205 <Field int azh.bs>
	// 1049 1963:aload_0         
	// 1050 1964:getfield        #12  <Field azh a>
	// 1051 1967:getfield        #211 <Field int azh.be>
	// 1052 1970:iconst_m1       
	// 1053 1971:ixor            
	// 1054 1972:iand            
	// 1055 1973:putfield        #163 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 1056 1976:aload_0         
	// 1057 1977:getfield        #12  <Field azh a>
	// 1058 1980:astore_1        
		abyte0.bq = ((azh) (abyte0)).bk ^ a.bq;
	// 1059 1981:aload_1         
	// 1060 1982:aload_1         
	// 1061 1983:getfield        #163 <Field int azh.bk>
	// 1062 1986:aload_0         
	// 1063 1987:getfield        #12  <Field azh a>
	// 1064 1990:getfield        #217 <Field int azh.bq>
	// 1065 1993:ixor            
	// 1066 1994:putfield        #217 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 1067 1997:aload_0         
	// 1068 1998:getfield        #12  <Field azh a>
	// 1069 2001:astore_1        
		abyte0.bk = ((azh) (abyte0)).ae & a.bk;
	// 1070 2002:aload_1         
	// 1071 2003:aload_1         
	// 1072 2004:getfield        #208 <Field int azh.ae>
	// 1073 2007:aload_0         
	// 1074 2008:getfield        #12  <Field azh a>
	// 1075 2011:getfield        #163 <Field int azh.bk>
	// 1076 2014:iand            
	// 1077 2015:putfield        #163 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 1078 2018:aload_0         
	// 1079 2019:getfield        #12  <Field azh a>
	// 1080 2022:astore_1        
		abyte0.bk = ((azh) (abyte0)).be ^ a.bk;
	// 1081 2023:aload_1         
	// 1082 2024:aload_1         
	// 1083 2025:getfield        #211 <Field int azh.be>
	// 1084 2028:aload_0         
	// 1085 2029:getfield        #12  <Field azh a>
	// 1086 2032:getfield        #163 <Field int azh.bk>
	// 1087 2035:ixor            
	// 1088 2036:putfield        #163 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 1089 2039:aload_0         
	// 1090 2040:getfield        #12  <Field azh a>
	// 1091 2043:astore_1        
		abyte0.C = ((azh) (abyte0)).bs & a.u;
	// 1092 2044:aload_1         
	// 1093 2045:aload_1         
	// 1094 2046:getfield        #205 <Field int azh.bs>
	// 1095 2049:aload_0         
	// 1096 2050:getfield        #12  <Field azh a>
	// 1097 2053:getfield        #220 <Field int azh.u>
	// 1098 2056:iand            
	// 1099 2057:putfield        #193 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 1100 2060:aload_0         
	// 1101 2061:getfield        #12  <Field azh a>
	// 1102 2064:astore_1        
		abyte0.l = ((azh) (abyte0)).bs ^ a.be;
	// 1103 2065:aload_1         
	// 1104 2066:aload_1         
	// 1105 2067:getfield        #205 <Field int azh.bs>
	// 1106 2070:aload_0         
	// 1107 2071:getfield        #12  <Field azh a>
	// 1108 2074:getfield        #211 <Field int azh.be>
	// 1109 2077:ixor            
	// 1110 2078:putfield        #112 <Field int azh.l>
		abyte0 = ((byte []) (a));
	// 1111 2081:aload_0         
	// 1112 2082:getfield        #12  <Field azh a>
	// 1113 2085:astore_1        
		abyte0.cb = ((azh) (abyte0)).l ^ a.ae;
	// 1114 2086:aload_1         
	// 1115 2087:aload_1         
	// 1116 2088:getfield        #112 <Field int azh.l>
	// 1117 2091:aload_0         
	// 1118 2092:getfield        #12  <Field azh a>
	// 1119 2095:getfield        #208 <Field int azh.ae>
	// 1120 2098:ixor            
	// 1121 2099:putfield        #115 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 1122 2102:aload_0         
	// 1123 2103:getfield        #12  <Field azh a>
	// 1124 2106:astore_1        
		abyte0.bS = ((azh) (abyte0)).ae & a.l;
	// 1125 2107:aload_1         
	// 1126 2108:aload_1         
	// 1127 2109:getfield        #208 <Field int azh.ae>
	// 1128 2112:aload_0         
	// 1129 2113:getfield        #12  <Field azh a>
	// 1130 2116:getfield        #112 <Field int azh.l>
	// 1131 2119:iand            
	// 1132 2120:putfield        #103 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 1133 2123:aload_0         
	// 1134 2124:getfield        #12  <Field azh a>
	// 1135 2127:astore_1        
		abyte0.bS = ((azh) (abyte0)).bs ^ a.bS;
	// 1136 2128:aload_1         
	// 1137 2129:aload_1         
	// 1138 2130:getfield        #205 <Field int azh.bs>
	// 1139 2133:aload_0         
	// 1140 2134:getfield        #12  <Field azh a>
	// 1141 2137:getfield        #103 <Field int azh.bS>
	// 1142 2140:ixor            
	// 1143 2141:putfield        #103 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 1144 2144:aload_0         
	// 1145 2145:getfield        #12  <Field azh a>
	// 1146 2148:astore_1        
		abyte0.aK = ((azh) (abyte0)).l ^ a.aK;
	// 1147 2149:aload_1         
	// 1148 2150:aload_1         
	// 1149 2151:getfield        #112 <Field int azh.l>
	// 1150 2154:aload_0         
	// 1151 2155:getfield        #12  <Field azh a>
	// 1152 2158:getfield        #151 <Field int azh.aK>
	// 1153 2161:ixor            
	// 1154 2162:putfield        #151 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 1155 2165:aload_0         
	// 1156 2166:getfield        #12  <Field azh a>
	// 1157 2169:astore_1        
		abyte0.bQ = ((azh) (abyte0)).ae & a.l;
	// 1158 2170:aload_1         
	// 1159 2171:aload_1         
	// 1160 2172:getfield        #208 <Field int azh.ae>
	// 1161 2175:aload_0         
	// 1162 2176:getfield        #12  <Field azh a>
	// 1163 2179:getfield        #112 <Field int azh.l>
	// 1164 2182:iand            
	// 1165 2183:putfield        #100 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 1166 2186:aload_0         
	// 1167 2187:getfield        #12  <Field azh a>
	// 1168 2190:astore_1        
		abyte0.bQ = ((azh) (abyte0)).l ^ a.bQ;
	// 1169 2191:aload_1         
	// 1170 2192:aload_1         
	// 1171 2193:getfield        #112 <Field int azh.l>
	// 1172 2196:aload_0         
	// 1173 2197:getfield        #12  <Field azh a>
	// 1174 2200:getfield        #100 <Field int azh.bQ>
	// 1175 2203:ixor            
	// 1176 2204:putfield        #100 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 1177 2207:aload_0         
	// 1178 2208:getfield        #12  <Field azh a>
	// 1179 2211:astore_1        
		abyte0.bo = ((azh) (abyte0)).ae & ~a.l;
	// 1180 2212:aload_1         
	// 1181 2213:aload_1         
	// 1182 2214:getfield        #208 <Field int azh.ae>
	// 1183 2217:aload_0         
	// 1184 2218:getfield        #12  <Field azh a>
	// 1185 2221:getfield        #112 <Field int azh.l>
	// 1186 2224:iconst_m1       
	// 1187 2225:ixor            
	// 1188 2226:iand            
	// 1189 2227:putfield        #223 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 1190 2230:aload_0         
	// 1191 2231:getfield        #12  <Field azh a>
	// 1192 2234:astore_1        
		abyte0.bn = ((azh) (abyte0)).ae & a.bs;
	// 1193 2235:aload_1         
	// 1194 2236:aload_1         
	// 1195 2237:getfield        #208 <Field int azh.ae>
	// 1196 2240:aload_0         
	// 1197 2241:getfield        #12  <Field azh a>
	// 1198 2244:getfield        #205 <Field int azh.bs>
	// 1199 2247:iand            
	// 1200 2248:putfield        #226 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 1201 2251:aload_0         
	// 1202 2252:getfield        #12  <Field azh a>
	// 1203 2255:astore_1        
		abyte0.bn = ((azh) (abyte0)).bJ ^ a.bn;
	// 1204 2256:aload_1         
	// 1205 2257:aload_1         
	// 1206 2258:getfield        #190 <Field int azh.bJ>
	// 1207 2261:aload_0         
	// 1208 2262:getfield        #12  <Field azh a>
	// 1209 2265:getfield        #226 <Field int azh.bn>
	// 1210 2268:ixor            
	// 1211 2269:putfield        #226 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 1212 2272:aload_0         
	// 1213 2273:getfield        #12  <Field azh a>
	// 1214 2276:astore_1        
		abyte0.bJ = ((azh) (abyte0)).ae & a.bs;
	// 1215 2277:aload_1         
	// 1216 2278:aload_1         
	// 1217 2279:getfield        #208 <Field int azh.ae>
	// 1218 2282:aload_0         
	// 1219 2283:getfield        #12  <Field azh a>
	// 1220 2286:getfield        #205 <Field int azh.bs>
	// 1221 2289:iand            
	// 1222 2290:putfield        #190 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 1223 2293:aload_0         
	// 1224 2294:getfield        #12  <Field azh a>
	// 1225 2297:astore_1        
		abyte0.bJ = ((azh) (abyte0)).l ^ a.bJ;
	// 1226 2298:aload_1         
	// 1227 2299:aload_1         
	// 1228 2300:getfield        #112 <Field int azh.l>
	// 1229 2303:aload_0         
	// 1230 2304:getfield        #12  <Field azh a>
	// 1231 2307:getfield        #190 <Field int azh.bJ>
	// 1232 2310:ixor            
	// 1233 2311:putfield        #190 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 1234 2314:aload_0         
	// 1235 2315:getfield        #12  <Field azh a>
	// 1236 2318:astore_1        
		abyte0.aW = ((azh) (abyte0)).be | a.bs;
	// 1237 2319:aload_1         
	// 1238 2320:aload_1         
	// 1239 2321:getfield        #211 <Field int azh.be>
	// 1240 2324:aload_0         
	// 1241 2325:getfield        #12  <Field azh a>
	// 1242 2328:getfield        #205 <Field int azh.bs>
	// 1243 2331:ior             
	// 1244 2332:putfield        #229 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 1245 2335:aload_0         
	// 1246 2336:getfield        #12  <Field azh a>
	// 1247 2339:astore_1        
		abyte0.bo = ((azh) (abyte0)).aW ^ a.bo;
	// 1248 2340:aload_1         
	// 1249 2341:aload_1         
	// 1250 2342:getfield        #229 <Field int azh.aW>
	// 1251 2345:aload_0         
	// 1252 2346:getfield        #12  <Field azh a>
	// 1253 2349:getfield        #223 <Field int azh.bo>
	// 1254 2352:ixor            
	// 1255 2353:putfield        #223 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 1256 2356:aload_0         
	// 1257 2357:getfield        #12  <Field azh a>
	// 1258 2360:astore_1        
		abyte0.aT = ((azh) (abyte0)).aW ^ a.aT;
	// 1259 2361:aload_1         
	// 1260 2362:aload_1         
	// 1261 2363:getfield        #229 <Field int azh.aW>
	// 1262 2366:aload_0         
	// 1263 2367:getfield        #12  <Field azh a>
	// 1264 2370:getfield        #118 <Field int azh.aT>
	// 1265 2373:ixor            
	// 1266 2374:putfield        #118 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 1267 2377:aload_0         
	// 1268 2378:getfield        #12  <Field azh a>
	// 1269 2381:astore_1        
		abyte0.aw = ((azh) (abyte0)).aW & ~a.be;
	// 1270 2382:aload_1         
	// 1271 2383:aload_1         
	// 1272 2384:getfield        #229 <Field int azh.aW>
	// 1273 2387:aload_0         
	// 1274 2388:getfield        #12  <Field azh a>
	// 1275 2391:getfield        #211 <Field int azh.be>
	// 1276 2394:iconst_m1       
	// 1277 2395:ixor            
	// 1278 2396:iand            
	// 1279 2397:putfield        #232 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 1280 2400:aload_0         
	// 1281 2401:getfield        #12  <Field azh a>
	// 1282 2404:astore_1        
		abyte0.aw = ((azh) (abyte0)).ae & ~a.aw;
	// 1283 2405:aload_1         
	// 1284 2406:aload_1         
	// 1285 2407:getfield        #208 <Field int azh.ae>
	// 1286 2410:aload_0         
	// 1287 2411:getfield        #12  <Field azh a>
	// 1288 2414:getfield        #232 <Field int azh.aw>
	// 1289 2417:iconst_m1       
	// 1290 2418:ixor            
	// 1291 2419:iand            
	// 1292 2420:putfield        #232 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 1293 2423:aload_0         
	// 1294 2424:getfield        #12  <Field azh a>
	// 1295 2427:astore_1        
		abyte0.aw = ((azh) (abyte0)).l ^ a.aw;
	// 1296 2428:aload_1         
	// 1297 2429:aload_1         
	// 1298 2430:getfield        #112 <Field int azh.l>
	// 1299 2433:aload_0         
	// 1300 2434:getfield        #12  <Field azh a>
	// 1301 2437:getfield        #232 <Field int azh.aw>
	// 1302 2440:ixor            
	// 1303 2441:putfield        #232 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 1304 2444:aload_0         
	// 1305 2445:getfield        #12  <Field azh a>
	// 1306 2448:astore_1        
		abyte0.l = ((azh) (abyte0)).bs & a.s;
	// 1307 2449:aload_1         
	// 1308 2450:aload_1         
	// 1309 2451:getfield        #205 <Field int azh.bs>
	// 1310 2454:aload_0         
	// 1311 2455:getfield        #12  <Field azh a>
	// 1312 2458:getfield        #214 <Field int azh.s>
	// 1313 2461:iand            
	// 1314 2462:putfield        #112 <Field int azh.l>
		abyte0 = ((byte []) (a));
	// 1315 2465:aload_0         
	// 1316 2466:getfield        #12  <Field azh a>
	// 1317 2469:astore_1        
		abyte0.aQ = ((azh) (abyte0)).ae & a.bs;
	// 1318 2470:aload_1         
	// 1319 2471:aload_1         
	// 1320 2472:getfield        #208 <Field int azh.ae>
	// 1321 2475:aload_0         
	// 1322 2476:getfield        #12  <Field azh a>
	// 1323 2479:getfield        #205 <Field int azh.bs>
	// 1324 2482:iand            
	// 1325 2483:putfield        #235 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 1326 2486:aload_0         
	// 1327 2487:getfield        #12  <Field azh a>
	// 1328 2490:astore_1        
		abyte0.ao = ((azh) (abyte0)).bs & a.be;
	// 1329 2491:aload_1         
	// 1330 2492:aload_1         
	// 1331 2493:getfield        #205 <Field int azh.bs>
	// 1332 2496:aload_0         
	// 1333 2497:getfield        #12  <Field azh a>
	// 1334 2500:getfield        #211 <Field int azh.be>
	// 1335 2503:iand            
	// 1336 2504:putfield        #238 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 1337 2507:aload_0         
	// 1338 2508:getfield        #12  <Field azh a>
	// 1339 2511:astore_1        
		abyte0.aJ = ((azh) (abyte0)).ae & ~a.ao;
	// 1340 2512:aload_1         
	// 1341 2513:aload_1         
	// 1342 2514:getfield        #208 <Field int azh.ae>
	// 1343 2517:aload_0         
	// 1344 2518:getfield        #12  <Field azh a>
	// 1345 2521:getfield        #238 <Field int azh.ao>
	// 1346 2524:iconst_m1       
	// 1347 2525:ixor            
	// 1348 2526:iand            
	// 1349 2527:putfield        #241 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 1350 2530:aload_0         
	// 1351 2531:getfield        #12  <Field azh a>
	// 1352 2534:astore_1        
		abyte0.aJ = ((azh) (abyte0)).ao ^ a.aJ;
	// 1353 2535:aload_1         
	// 1354 2536:aload_1         
	// 1355 2537:getfield        #238 <Field int azh.ao>
	// 1356 2540:aload_0         
	// 1357 2541:getfield        #12  <Field azh a>
	// 1358 2544:getfield        #241 <Field int azh.aJ>
	// 1359 2547:ixor            
	// 1360 2548:putfield        #241 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 1361 2551:aload_0         
	// 1362 2552:getfield        #12  <Field azh a>
	// 1363 2555:astore_1        
		abyte0.by = ((azh) (abyte0)).be & ~a.ao;
	// 1364 2556:aload_1         
	// 1365 2557:aload_1         
	// 1366 2558:getfield        #211 <Field int azh.be>
	// 1367 2561:aload_0         
	// 1368 2562:getfield        #12  <Field azh a>
	// 1369 2565:getfield        #238 <Field int azh.ao>
	// 1370 2568:iconst_m1       
	// 1371 2569:ixor            
	// 1372 2570:iand            
	// 1373 2571:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 1374 2574:aload_0         
	// 1375 2575:getfield        #12  <Field azh a>
	// 1376 2578:astore_1        
		abyte0.aD = ((azh) (abyte0)).by ^ a.aD;
	// 1377 2579:aload_1         
	// 1378 2580:aload_1         
	// 1379 2581:getfield        #244 <Field int azh.by>
	// 1380 2584:aload_0         
	// 1381 2585:getfield        #12  <Field azh a>
	// 1382 2588:getfield        #202 <Field int azh.aD>
	// 1383 2591:ixor            
	// 1384 2592:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 1385 2595:aload_0         
	// 1386 2596:getfield        #12  <Field azh a>
	// 1387 2599:astore_1        
		abyte0.aR = ((azh) (abyte0)).ae & a.ao;
	// 1388 2600:aload_1         
	// 1389 2601:aload_1         
	// 1390 2602:getfield        #208 <Field int azh.ae>
	// 1391 2605:aload_0         
	// 1392 2606:getfield        #12  <Field azh a>
	// 1393 2609:getfield        #238 <Field int azh.ao>
	// 1394 2612:iand            
	// 1395 2613:putfield        #247 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 1396 2616:aload_0         
	// 1397 2617:getfield        #12  <Field azh a>
	// 1398 2620:astore_1        
		abyte0.z = ((azh) (abyte0)).ae & a.ao;
	// 1399 2621:aload_1         
	// 1400 2622:aload_1         
	// 1401 2623:getfield        #208 <Field int azh.ae>
	// 1402 2626:aload_0         
	// 1403 2627:getfield        #12  <Field azh a>
	// 1404 2630:getfield        #238 <Field int azh.ao>
	// 1405 2633:iand            
	// 1406 2634:putfield        #250 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 1407 2637:aload_0         
	// 1408 2638:getfield        #12  <Field azh a>
	// 1409 2641:astore_1        
		abyte0.z = ((azh) (abyte0)).bs ^ a.z;
	// 1410 2642:aload_1         
	// 1411 2643:aload_1         
	// 1412 2644:getfield        #205 <Field int azh.bs>
	// 1413 2647:aload_0         
	// 1414 2648:getfield        #12  <Field azh a>
	// 1415 2651:getfield        #250 <Field int azh.z>
	// 1416 2654:ixor            
	// 1417 2655:putfield        #250 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 1418 2658:aload_0         
	// 1419 2659:getfield        #12  <Field azh a>
	// 1420 2662:astore_1        
		abyte0.ay = ((azh) (abyte0)).x & ~a.bf;
	// 1421 2663:aload_1         
	// 1422 2664:aload_1         
	// 1423 2665:getfield        #160 <Field int azh.x>
	// 1424 2668:aload_0         
	// 1425 2669:getfield        #12  <Field azh a>
	// 1426 2672:getfield        #184 <Field int azh.bf>
	// 1427 2675:iconst_m1       
	// 1428 2676:ixor            
	// 1429 2677:iand            
	// 1430 2678:putfield        #253 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 1431 2681:aload_0         
	// 1432 2682:getfield        #12  <Field azh a>
	// 1433 2685:astore_1        
		abyte0.ay = ((azh) (abyte0)).aZ ^ a.ay;
	// 1434 2686:aload_1         
	// 1435 2687:aload_1         
	// 1436 2688:getfield        #175 <Field int azh.aZ>
	// 1437 2691:aload_0         
	// 1438 2692:getfield        #12  <Field azh a>
	// 1439 2695:getfield        #253 <Field int azh.ay>
	// 1440 2698:ixor            
	// 1441 2699:putfield        #253 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 1442 2702:aload_0         
	// 1443 2703:getfield        #12  <Field azh a>
	// 1444 2706:astore_1        
		abyte0.ci = ((azh) (abyte0)).ci ^ a.x;
	// 1445 2707:aload_1         
	// 1446 2708:aload_1         
	// 1447 2709:getfield        #181 <Field int azh.ci>
	// 1448 2712:aload_0         
	// 1449 2713:getfield        #12  <Field azh a>
	// 1450 2716:getfield        #160 <Field int azh.x>
	// 1451 2719:ixor            
	// 1452 2720:putfield        #181 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 1453 2723:aload_0         
	// 1454 2724:getfield        #12  <Field azh a>
	// 1455 2727:astore_1        
		abyte0.ar = ((azh) (abyte0)).ci | a.h;
	// 1456 2728:aload_1         
	// 1457 2729:aload_1         
	// 1458 2730:getfield        #181 <Field int azh.ci>
	// 1459 2733:aload_0         
	// 1460 2734:getfield        #12  <Field azh a>
	// 1461 2737:getfield        #172 <Field int azh.h>
	// 1462 2740:ior             
	// 1463 2741:putfield        #256 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 1464 2744:aload_0         
	// 1465 2745:getfield        #12  <Field azh a>
	// 1466 2748:astore_1        
		abyte0.ar = ((azh) (abyte0)).bW ^ a.ar;
	// 1467 2749:aload_1         
	// 1468 2750:aload_1         
	// 1469 2751:getfield        #154 <Field int azh.bW>
	// 1470 2754:aload_0         
	// 1471 2755:getfield        #12  <Field azh a>
	// 1472 2758:getfield        #256 <Field int azh.ar>
	// 1473 2761:ixor            
	// 1474 2762:putfield        #256 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 1475 2765:aload_0         
	// 1476 2766:getfield        #12  <Field azh a>
	// 1477 2769:astore_1        
		abyte0.bW = ((azh) (abyte0)).ci | a.h;
	// 1478 2770:aload_1         
	// 1479 2771:aload_1         
	// 1480 2772:getfield        #181 <Field int azh.ci>
	// 1481 2775:aload_0         
	// 1482 2776:getfield        #12  <Field azh a>
	// 1483 2779:getfield        #172 <Field int azh.h>
	// 1484 2782:ior             
	// 1485 2783:putfield        #154 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 1486 2786:aload_0         
	// 1487 2787:getfield        #12  <Field azh a>
	// 1488 2790:astore_1        
		abyte0.bW = ((azh) (abyte0)).ay ^ a.bW;
	// 1489 2791:aload_1         
	// 1490 2792:aload_1         
	// 1491 2793:getfield        #253 <Field int azh.ay>
	// 1492 2796:aload_0         
	// 1493 2797:getfield        #12  <Field azh a>
	// 1494 2800:getfield        #154 <Field int azh.bW>
	// 1495 2803:ixor            
	// 1496 2804:putfield        #154 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 1497 2807:aload_0         
	// 1498 2808:getfield        #12  <Field azh a>
	// 1499 2811:astore_1        
		abyte0.bW = ((azh) (abyte0)).p | a.bW;
	// 1500 2812:aload_1         
	// 1501 2813:aload_1         
	// 1502 2814:getfield        #178 <Field int azh.p>
	// 1503 2817:aload_0         
	// 1504 2818:getfield        #12  <Field azh a>
	// 1505 2821:getfield        #154 <Field int azh.bW>
	// 1506 2824:ior             
	// 1507 2825:putfield        #154 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 1508 2828:aload_0         
	// 1509 2829:getfield        #12  <Field azh a>
	// 1510 2832:astore_1        
		abyte0.ci = ((azh) (abyte0)).ci & ~a.h;
	// 1511 2833:aload_1         
	// 1512 2834:aload_1         
	// 1513 2835:getfield        #181 <Field int azh.ci>
	// 1514 2838:aload_0         
	// 1515 2839:getfield        #12  <Field azh a>
	// 1516 2842:getfield        #172 <Field int azh.h>
	// 1517 2845:iconst_m1       
	// 1518 2846:ixor            
	// 1519 2847:iand            
	// 1520 2848:putfield        #181 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 1521 2851:aload_0         
	// 1522 2852:getfield        #12  <Field azh a>
	// 1523 2855:astore_1        
		abyte0.ci = ((azh) (abyte0)).av ^ a.ci;
	// 1524 2856:aload_1         
	// 1525 2857:aload_1         
	// 1526 2858:getfield        #136 <Field int azh.av>
	// 1527 2861:aload_0         
	// 1528 2862:getfield        #12  <Field azh a>
	// 1529 2865:getfield        #181 <Field int azh.ci>
	// 1530 2868:ixor            
	// 1531 2869:putfield        #181 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 1532 2872:aload_0         
	// 1533 2873:getfield        #12  <Field azh a>
	// 1534 2876:astore_1        
		abyte0.ci = ((azh) (abyte0)).p | a.ci;
	// 1535 2877:aload_1         
	// 1536 2878:aload_1         
	// 1537 2879:getfield        #178 <Field int azh.p>
	// 1538 2882:aload_0         
	// 1539 2883:getfield        #12  <Field azh a>
	// 1540 2886:getfield        #181 <Field int azh.ci>
	// 1541 2889:ior             
	// 1542 2890:putfield        #181 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 1543 2893:aload_0         
	// 1544 2894:getfield        #12  <Field azh a>
	// 1545 2897:astore_1        
		abyte0.ci = ((azh) (abyte0)).ar ^ a.ci;
	// 1546 2898:aload_1         
	// 1547 2899:aload_1         
	// 1548 2900:getfield        #256 <Field int azh.ar>
	// 1549 2903:aload_0         
	// 1550 2904:getfield        #12  <Field azh a>
	// 1551 2907:getfield        #181 <Field int azh.ci>
	// 1552 2910:ixor            
	// 1553 2911:putfield        #181 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 1554 2914:aload_0         
	// 1555 2915:getfield        #12  <Field azh a>
	// 1556 2918:astore_1        
		abyte0.ar = ((azh) (abyte0)).x & ~a.aZ;
	// 1557 2919:aload_1         
	// 1558 2920:aload_1         
	// 1559 2921:getfield        #160 <Field int azh.x>
	// 1560 2924:aload_0         
	// 1561 2925:getfield        #12  <Field azh a>
	// 1562 2928:getfield        #175 <Field int azh.aZ>
	// 1563 2931:iconst_m1       
	// 1564 2932:ixor            
	// 1565 2933:iand            
	// 1566 2934:putfield        #256 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 1567 2937:aload_0         
	// 1568 2938:getfield        #12  <Field azh a>
	// 1569 2941:astore_1        
		abyte0.ar = ((azh) (abyte0)).bf ^ a.ar;
	// 1570 2942:aload_1         
	// 1571 2943:aload_1         
	// 1572 2944:getfield        #184 <Field int azh.bf>
	// 1573 2947:aload_0         
	// 1574 2948:getfield        #12  <Field azh a>
	// 1575 2951:getfield        #256 <Field int azh.ar>
	// 1576 2954:ixor            
	// 1577 2955:putfield        #256 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 1578 2958:aload_0         
	// 1579 2959:getfield        #12  <Field azh a>
	// 1580 2962:astore_1        
		abyte0.ar = ((azh) (abyte0)).ar & ~a.h;
	// 1581 2963:aload_1         
	// 1582 2964:aload_1         
	// 1583 2965:getfield        #256 <Field int azh.ar>
	// 1584 2968:aload_0         
	// 1585 2969:getfield        #12  <Field azh a>
	// 1586 2972:getfield        #172 <Field int azh.h>
	// 1587 2975:iconst_m1       
	// 1588 2976:ixor            
	// 1589 2977:iand            
	// 1590 2978:putfield        #256 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 1591 2981:aload_0         
	// 1592 2982:getfield        #12  <Field azh a>
	// 1593 2985:astore_1        
		abyte0.ar = ((azh) (abyte0)).bX ^ a.ar;
	// 1594 2986:aload_1         
	// 1595 2987:aload_1         
	// 1596 2988:getfield        #139 <Field int azh.bX>
	// 1597 2991:aload_0         
	// 1598 2992:getfield        #12  <Field azh a>
	// 1599 2995:getfield        #256 <Field int azh.ar>
	// 1600 2998:ixor            
	// 1601 2999:putfield        #256 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 1602 3002:aload_0         
	// 1603 3003:getfield        #12  <Field azh a>
	// 1604 3006:astore_1        
		abyte0.bW = ((azh) (abyte0)).ar ^ a.bW;
	// 1605 3007:aload_1         
	// 1606 3008:aload_1         
	// 1607 3009:getfield        #256 <Field int azh.ar>
	// 1608 3012:aload_0         
	// 1609 3013:getfield        #12  <Field azh a>
	// 1610 3016:getfield        #154 <Field int azh.bW>
	// 1611 3019:ixor            
	// 1612 3020:putfield        #154 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 1613 3023:aload_0         
	// 1614 3024:getfield        #12  <Field azh a>
	// 1615 3027:astore_1        
		abyte0.bW = ((azh) (abyte0)).bW & ~a.N;
	// 1616 3028:aload_1         
	// 1617 3029:aload_1         
	// 1618 3030:getfield        #154 <Field int azh.bW>
	// 1619 3033:aload_0         
	// 1620 3034:getfield        #12  <Field azh a>
	// 1621 3037:getfield        #199 <Field int azh.N>
	// 1622 3040:iconst_m1       
	// 1623 3041:ixor            
	// 1624 3042:iand            
	// 1625 3043:putfield        #154 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 1626 3046:aload_0         
	// 1627 3047:getfield        #12  <Field azh a>
	// 1628 3050:astore_1        
		abyte0.bW = ((azh) (abyte0)).ci ^ a.bW;
	// 1629 3051:aload_1         
	// 1630 3052:aload_1         
	// 1631 3053:getfield        #181 <Field int azh.ci>
	// 1632 3056:aload_0         
	// 1633 3057:getfield        #12  <Field azh a>
	// 1634 3060:getfield        #154 <Field int azh.bW>
	// 1635 3063:ixor            
	// 1636 3064:putfield        #154 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 1637 3067:aload_0         
	// 1638 3068:getfield        #12  <Field azh a>
	// 1639 3071:astore_1        
		abyte0.ac = ((azh) (abyte0)).bW ^ a.ac;
	// 1640 3072:aload_1         
	// 1641 3073:aload_1         
	// 1642 3074:getfield        #154 <Field int azh.bW>
	// 1643 3077:aload_0         
	// 1644 3078:getfield        #12  <Field azh a>
	// 1645 3081:getfield        #259 <Field int azh.ac>
	// 1646 3084:ixor            
	// 1647 3085:putfield        #259 <Field int azh.ac>
		abyte0 = ((byte []) (a));
	// 1648 3088:aload_0         
	// 1649 3089:getfield        #12  <Field azh a>
	// 1650 3092:astore_1        
		abyte0.bW = ((azh) (abyte0)).ac | a.E;
	// 1651 3093:aload_1         
	// 1652 3094:aload_1         
	// 1653 3095:getfield        #259 <Field int azh.ac>
	// 1654 3098:aload_0         
	// 1655 3099:getfield        #12  <Field azh a>
	// 1656 3102:getfield        #32  <Field int azh.E>
	// 1657 3105:ior             
	// 1658 3106:putfield        #154 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 1659 3109:aload_0         
	// 1660 3110:getfield        #12  <Field azh a>
	// 1661 3113:astore_1        
		abyte0.ci = ((azh) (abyte0)).ac & ~a.U;
	// 1662 3114:aload_1         
	// 1663 3115:aload_1         
	// 1664 3116:getfield        #259 <Field int azh.ac>
	// 1665 3119:aload_0         
	// 1666 3120:getfield        #12  <Field azh a>
	// 1667 3123:getfield        #35  <Field int azh.U>
	// 1668 3126:iconst_m1       
	// 1669 3127:ixor            
	// 1670 3128:iand            
	// 1671 3129:putfield        #181 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 1672 3132:aload_0         
	// 1673 3133:getfield        #12  <Field azh a>
	// 1674 3136:astore_1        
		abyte0.ar = ((azh) (abyte0)).x & ~a.aZ;
	// 1675 3137:aload_1         
	// 1676 3138:aload_1         
	// 1677 3139:getfield        #160 <Field int azh.x>
	// 1678 3142:aload_0         
	// 1679 3143:getfield        #12  <Field azh a>
	// 1680 3146:getfield        #175 <Field int azh.aZ>
	// 1681 3149:iconst_m1       
	// 1682 3150:ixor            
	// 1683 3151:iand            
	// 1684 3152:putfield        #256 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 1685 3155:aload_0         
	// 1686 3156:getfield        #12  <Field azh a>
	// 1687 3159:astore_1        
		abyte0.ar = ((azh) (abyte0)).ar & ~a.h;
	// 1688 3160:aload_1         
	// 1689 3161:aload_1         
	// 1690 3162:getfield        #256 <Field int azh.ar>
	// 1691 3165:aload_0         
	// 1692 3166:getfield        #12  <Field azh a>
	// 1693 3169:getfield        #172 <Field int azh.h>
	// 1694 3172:iconst_m1       
	// 1695 3173:ixor            
	// 1696 3174:iand            
	// 1697 3175:putfield        #256 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 1698 3178:aload_0         
	// 1699 3179:getfield        #12  <Field azh a>
	// 1700 3182:astore_1        
		abyte0.ar = ((azh) (abyte0)).av ^ a.ar;
	// 1701 3183:aload_1         
	// 1702 3184:aload_1         
	// 1703 3185:getfield        #136 <Field int azh.av>
	// 1704 3188:aload_0         
	// 1705 3189:getfield        #12  <Field azh a>
	// 1706 3192:getfield        #256 <Field int azh.ar>
	// 1707 3195:ixor            
	// 1708 3196:putfield        #256 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 1709 3199:aload_0         
	// 1710 3200:getfield        #12  <Field azh a>
	// 1711 3203:astore_1        
		abyte0.bL = ((azh) (abyte0)).ar ^ a.bL;
	// 1712 3204:aload_1         
	// 1713 3205:aload_1         
	// 1714 3206:getfield        #256 <Field int azh.ar>
	// 1715 3209:aload_0         
	// 1716 3210:getfield        #12  <Field azh a>
	// 1717 3213:getfield        #262 <Field int azh.bL>
	// 1718 3216:ixor            
	// 1719 3217:putfield        #262 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 1720 3220:aload_0         
	// 1721 3221:getfield        #12  <Field azh a>
	// 1722 3224:astore_1        
		abyte0.bH = ((azh) (abyte0)).bL ^ a.bH;
	// 1723 3225:aload_1         
	// 1724 3226:aload_1         
	// 1725 3227:getfield        #262 <Field int azh.bL>
	// 1726 3230:aload_0         
	// 1727 3231:getfield        #12  <Field azh a>
	// 1728 3234:getfield        #196 <Field int azh.bH>
	// 1729 3237:ixor            
	// 1730 3238:putfield        #196 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 1731 3241:aload_0         
	// 1732 3242:getfield        #12  <Field azh a>
	// 1733 3245:astore_1        
		abyte0.Y = ((azh) (abyte0)).bH ^ a.Y;
	// 1734 3246:aload_1         
	// 1735 3247:aload_1         
	// 1736 3248:getfield        #196 <Field int azh.bH>
	// 1737 3251:aload_0         
	// 1738 3252:getfield        #12  <Field azh a>
	// 1739 3255:getfield        #265 <Field int azh.Y>
	// 1740 3258:ixor            
	// 1741 3259:putfield        #265 <Field int azh.Y>
		abyte0 = ((byte []) (a));
	// 1742 3262:aload_0         
	// 1743 3263:getfield        #12  <Field azh a>
	// 1744 3266:astore_1        
		abyte0.bH = ((azh) (abyte0)).Y | a.A;
	// 1745 3267:aload_1         
	// 1746 3268:aload_1         
	// 1747 3269:getfield        #265 <Field int azh.Y>
	// 1748 3272:aload_0         
	// 1749 3273:getfield        #12  <Field azh a>
	// 1750 3276:getfield        #74  <Field int azh.A>
	// 1751 3279:ior             
	// 1752 3280:putfield        #196 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 1753 3283:aload_0         
	// 1754 3284:getfield        #12  <Field azh a>
	// 1755 3287:astore_1        
		abyte0.bH = ((azh) (abyte0)).bN ^ a.bH;
	// 1756 3288:aload_1         
	// 1757 3289:aload_1         
	// 1758 3290:getfield        #85  <Field int azh.bN>
	// 1759 3293:aload_0         
	// 1760 3294:getfield        #12  <Field azh a>
	// 1761 3297:getfield        #196 <Field int azh.bH>
	// 1762 3300:ixor            
	// 1763 3301:putfield        #196 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 1764 3304:aload_0         
	// 1765 3305:getfield        #12  <Field azh a>
	// 1766 3308:astore_1        
		abyte0.bL = ((azh) (abyte0)).I & ~a.bH;
	// 1767 3309:aload_1         
	// 1768 3310:aload_1         
	// 1769 3311:getfield        #79  <Field int azh.I>
	// 1770 3314:aload_0         
	// 1771 3315:getfield        #12  <Field azh a>
	// 1772 3318:getfield        #196 <Field int azh.bH>
	// 1773 3321:iconst_m1       
	// 1774 3322:ixor            
	// 1775 3323:iand            
	// 1776 3324:putfield        #262 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 1777 3327:aload_0         
	// 1778 3328:getfield        #12  <Field azh a>
	// 1779 3331:astore_1        
		abyte0.bH = ((azh) (abyte0)).bH & ~a.I;
	// 1780 3332:aload_1         
	// 1781 3333:aload_1         
	// 1782 3334:getfield        #196 <Field int azh.bH>
	// 1783 3337:aload_0         
	// 1784 3338:getfield        #12  <Field azh a>
	// 1785 3341:getfield        #79  <Field int azh.I>
	// 1786 3344:iconst_m1       
	// 1787 3345:ixor            
	// 1788 3346:iand            
	// 1789 3347:putfield        #196 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 1790 3350:aload_0         
	// 1791 3351:getfield        #12  <Field azh a>
	// 1792 3354:astore_1        
		abyte0.ar = ((azh) (abyte0)).bv & ~a.Y;
	// 1793 3355:aload_1         
	// 1794 3356:aload_1         
	// 1795 3357:getfield        #82  <Field int azh.bv>
	// 1796 3360:aload_0         
	// 1797 3361:getfield        #12  <Field azh a>
	// 1798 3364:getfield        #265 <Field int azh.Y>
	// 1799 3367:iconst_m1       
	// 1800 3368:ixor            
	// 1801 3369:iand            
	// 1802 3370:putfield        #256 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 1803 3373:aload_0         
	// 1804 3374:getfield        #12  <Field azh a>
	// 1805 3377:astore_1        
		abyte0.ar = ((azh) (abyte0)).ba ^ a.ar;
	// 1806 3378:aload_1         
	// 1807 3379:aload_1         
	// 1808 3380:getfield        #59  <Field int azh.ba>
	// 1809 3383:aload_0         
	// 1810 3384:getfield        #12  <Field azh a>
	// 1811 3387:getfield        #256 <Field int azh.ar>
	// 1812 3390:ixor            
	// 1813 3391:putfield        #256 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 1814 3394:aload_0         
	// 1815 3395:getfield        #12  <Field azh a>
	// 1816 3398:astore_1        
		abyte0.ar = ((azh) (abyte0)).ar & ~a.I;
	// 1817 3399:aload_1         
	// 1818 3400:aload_1         
	// 1819 3401:getfield        #256 <Field int azh.ar>
	// 1820 3404:aload_0         
	// 1821 3405:getfield        #12  <Field azh a>
	// 1822 3408:getfield        #79  <Field int azh.I>
	// 1823 3411:iconst_m1       
	// 1824 3412:ixor            
	// 1825 3413:iand            
	// 1826 3414:putfield        #256 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 1827 3417:aload_0         
	// 1828 3418:getfield        #12  <Field azh a>
	// 1829 3421:astore_1        
		abyte0.ar = ((azh) (abyte0)).Y ^ a.ar;
	// 1830 3422:aload_1         
	// 1831 3423:aload_1         
	// 1832 3424:getfield        #265 <Field int azh.Y>
	// 1833 3427:aload_0         
	// 1834 3428:getfield        #12  <Field azh a>
	// 1835 3431:getfield        #256 <Field int azh.ar>
	// 1836 3434:ixor            
	// 1837 3435:putfield        #256 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 1838 3438:aload_0         
	// 1839 3439:getfield        #12  <Field azh a>
	// 1840 3442:astore_1        
		abyte0.av = ((azh) (abyte0)).Y | a.aY;
	// 1841 3443:aload_1         
	// 1842 3444:aload_1         
	// 1843 3445:getfield        #265 <Field int azh.Y>
	// 1844 3448:aload_0         
	// 1845 3449:getfield        #12  <Field azh a>
	// 1846 3452:getfield        #62  <Field int azh.aY>
	// 1847 3455:ior             
	// 1848 3456:putfield        #136 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 1849 3459:aload_0         
	// 1850 3460:getfield        #12  <Field azh a>
	// 1851 3463:astore_1        
		abyte0.av = ((azh) (abyte0)).ag ^ a.av;
	// 1852 3464:aload_1         
	// 1853 3465:aload_1         
	// 1854 3466:getfield        #94  <Field int azh.ag>
	// 1855 3469:aload_0         
	// 1856 3470:getfield        #12  <Field azh a>
	// 1857 3473:getfield        #136 <Field int azh.av>
	// 1858 3476:ixor            
	// 1859 3477:putfield        #136 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 1860 3480:aload_0         
	// 1861 3481:getfield        #12  <Field azh a>
	// 1862 3484:astore_1        
		abyte0.av = ((azh) (abyte0)).I & a.av;
	// 1863 3485:aload_1         
	// 1864 3486:aload_1         
	// 1865 3487:getfield        #79  <Field int azh.I>
	// 1866 3490:aload_0         
	// 1867 3491:getfield        #12  <Field azh a>
	// 1868 3494:getfield        #136 <Field int azh.av>
	// 1869 3497:iand            
	// 1870 3498:putfield        #136 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 1871 3501:aload_0         
	// 1872 3502:getfield        #12  <Field azh a>
	// 1873 3505:astore_1        
		abyte0.bX = ((azh) (abyte0)).e & ~a.Y;
	// 1874 3506:aload_1         
	// 1875 3507:aload_1         
	// 1876 3508:getfield        #77  <Field int azh.e>
	// 1877 3511:aload_0         
	// 1878 3512:getfield        #12  <Field azh a>
	// 1879 3515:getfield        #265 <Field int azh.Y>
	// 1880 3518:iconst_m1       
	// 1881 3519:ixor            
	// 1882 3520:iand            
	// 1883 3521:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 1884 3524:aload_0         
	// 1885 3525:getfield        #12  <Field azh a>
	// 1886 3528:astore_1        
		abyte0.bX = ((azh) (abyte0)).e ^ a.bX;
	// 1887 3529:aload_1         
	// 1888 3530:aload_1         
	// 1889 3531:getfield        #77  <Field int azh.e>
	// 1890 3534:aload_0         
	// 1891 3535:getfield        #12  <Field azh a>
	// 1892 3538:getfield        #139 <Field int azh.bX>
	// 1893 3541:ixor            
	// 1894 3542:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 1895 3545:aload_0         
	// 1896 3546:getfield        #12  <Field azh a>
	// 1897 3549:astore_1        
		abyte0.bm = ((azh) (abyte0)).bX ^ a.bm;
	// 1898 3550:aload_1         
	// 1899 3551:aload_1         
	// 1900 3552:getfield        #139 <Field int azh.bX>
	// 1901 3555:aload_0         
	// 1902 3556:getfield        #12  <Field azh a>
	// 1903 3559:getfield        #68  <Field int azh.bm>
	// 1904 3562:ixor            
	// 1905 3563:putfield        #68  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 1906 3566:aload_0         
	// 1907 3567:getfield        #12  <Field azh a>
	// 1908 3570:astore_1        
		abyte0.bX = ((azh) (abyte0)).e & ~a.Y;
	// 1909 3571:aload_1         
	// 1910 3572:aload_1         
	// 1911 3573:getfield        #77  <Field int azh.e>
	// 1912 3576:aload_0         
	// 1913 3577:getfield        #12  <Field azh a>
	// 1914 3580:getfield        #265 <Field int azh.Y>
	// 1915 3583:iconst_m1       
	// 1916 3584:ixor            
	// 1917 3585:iand            
	// 1918 3586:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 1919 3589:aload_0         
	// 1920 3590:getfield        #12  <Field azh a>
	// 1921 3593:astore_1        
		abyte0.bX = ((azh) (abyte0)).W ^ a.bX;
	// 1922 3594:aload_1         
	// 1923 3595:aload_1         
	// 1924 3596:getfield        #26  <Field int azh.W>
	// 1925 3599:aload_0         
	// 1926 3600:getfield        #12  <Field azh a>
	// 1927 3603:getfield        #139 <Field int azh.bX>
	// 1928 3606:ixor            
	// 1929 3607:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 1930 3610:aload_0         
	// 1931 3611:getfield        #12  <Field azh a>
	// 1932 3614:astore_1        
		abyte0.bw = ((azh) (abyte0)).bX ^ a.bw;
	// 1933 3615:aload_1         
	// 1934 3616:aload_1         
	// 1935 3617:getfield        #139 <Field int azh.bX>
	// 1936 3620:aload_0         
	// 1937 3621:getfield        #12  <Field azh a>
	// 1938 3624:getfield        #97  <Field int azh.bw>
	// 1939 3627:ixor            
	// 1940 3628:putfield        #97  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 1941 3631:aload_0         
	// 1942 3632:getfield        #12  <Field azh a>
	// 1943 3635:astore_1        
		abyte0.av = ((azh) (abyte0)).bX ^ a.av;
	// 1944 3636:aload_1         
	// 1945 3637:aload_1         
	// 1946 3638:getfield        #139 <Field int azh.bX>
	// 1947 3641:aload_0         
	// 1948 3642:getfield        #12  <Field azh a>
	// 1949 3645:getfield        #136 <Field int azh.av>
	// 1950 3648:ixor            
	// 1951 3649:putfield        #136 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 1952 3652:aload_0         
	// 1953 3653:getfield        #12  <Field azh a>
	// 1954 3656:astore_1        
		abyte0.bX = ((azh) (abyte0)).Y | a.W;
	// 1955 3657:aload_1         
	// 1956 3658:aload_1         
	// 1957 3659:getfield        #265 <Field int azh.Y>
	// 1958 3662:aload_0         
	// 1959 3663:getfield        #12  <Field azh a>
	// 1960 3666:getfield        #26  <Field int azh.W>
	// 1961 3669:ior             
	// 1962 3670:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 1963 3673:aload_0         
	// 1964 3674:getfield        #12  <Field azh a>
	// 1965 3677:astore_1        
		abyte0.bX = ((azh) (abyte0)).aY ^ a.bX;
	// 1966 3678:aload_1         
	// 1967 3679:aload_1         
	// 1968 3680:getfield        #62  <Field int azh.aY>
	// 1969 3683:aload_0         
	// 1970 3684:getfield        #12  <Field azh a>
	// 1971 3687:getfield        #139 <Field int azh.bX>
	// 1972 3690:ixor            
	// 1973 3691:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 1974 3694:aload_0         
	// 1975 3695:getfield        #12  <Field azh a>
	// 1976 3698:astore_1        
		abyte0.bX = ((azh) (abyte0)).bX & ~a.I;
	// 1977 3699:aload_1         
	// 1978 3700:aload_1         
	// 1979 3701:getfield        #139 <Field int azh.bX>
	// 1980 3704:aload_0         
	// 1981 3705:getfield        #12  <Field azh a>
	// 1982 3708:getfield        #79  <Field int azh.I>
	// 1983 3711:iconst_m1       
	// 1984 3712:ixor            
	// 1985 3713:iand            
	// 1986 3714:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 1987 3717:aload_0         
	// 1988 3718:getfield        #12  <Field azh a>
	// 1989 3721:astore_1        
		abyte0.bf = ((azh) (abyte0)).Y | a.ag;
	// 1990 3722:aload_1         
	// 1991 3723:aload_1         
	// 1992 3724:getfield        #265 <Field int azh.Y>
	// 1993 3727:aload_0         
	// 1994 3728:getfield        #12  <Field azh a>
	// 1995 3731:getfield        #94  <Field int azh.ag>
	// 1996 3734:ior             
	// 1997 3735:putfield        #184 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 1998 3738:aload_0         
	// 1999 3739:getfield        #12  <Field azh a>
	// 2000 3742:astore_1        
		abyte0.bf = ((azh) (abyte0)).W ^ a.bf;
	// 2001 3743:aload_1         
	// 2002 3744:aload_1         
	// 2003 3745:getfield        #26  <Field int azh.W>
	// 2004 3748:aload_0         
	// 2005 3749:getfield        #12  <Field azh a>
	// 2006 3752:getfield        #184 <Field int azh.bf>
	// 2007 3755:ixor            
	// 2008 3756:putfield        #184 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 2009 3759:aload_0         
	// 2010 3760:getfield        #12  <Field azh a>
	// 2011 3763:astore_1        
		abyte0.ay = ((azh) (abyte0)).Y | a.bv;
	// 2012 3764:aload_1         
	// 2013 3765:aload_1         
	// 2014 3766:getfield        #265 <Field int azh.Y>
	// 2015 3769:aload_0         
	// 2016 3770:getfield        #12  <Field azh a>
	// 2017 3773:getfield        #82  <Field int azh.bv>
	// 2018 3776:ior             
	// 2019 3777:putfield        #253 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 2020 3780:aload_0         
	// 2021 3781:getfield        #12  <Field azh a>
	// 2022 3784:astore_1        
		abyte0.ay = ((azh) (abyte0)).W ^ a.ay;
	// 2023 3785:aload_1         
	// 2024 3786:aload_1         
	// 2025 3787:getfield        #26  <Field int azh.W>
	// 2026 3790:aload_0         
	// 2027 3791:getfield        #12  <Field azh a>
	// 2028 3794:getfield        #253 <Field int azh.ay>
	// 2029 3797:ixor            
	// 2030 3798:putfield        #253 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 2031 3801:aload_0         
	// 2032 3802:getfield        #12  <Field azh a>
	// 2033 3805:astore_1        
		abyte0.az = ((azh) (abyte0)).bv & ~a.Y;
	// 2034 3806:aload_1         
	// 2035 3807:aload_1         
	// 2036 3808:getfield        #82  <Field int azh.bv>
	// 2037 3811:aload_0         
	// 2038 3812:getfield        #12  <Field azh a>
	// 2039 3815:getfield        #265 <Field int azh.Y>
	// 2040 3818:iconst_m1       
	// 2041 3819:ixor            
	// 2042 3820:iand            
	// 2043 3821:putfield        #268 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 2044 3824:aload_0         
	// 2045 3825:getfield        #12  <Field azh a>
	// 2046 3828:astore_1        
		abyte0.az = ((azh) (abyte0)).A ^ a.az;
	// 2047 3829:aload_1         
	// 2048 3830:aload_1         
	// 2049 3831:getfield        #74  <Field int azh.A>
	// 2050 3834:aload_0         
	// 2051 3835:getfield        #12  <Field azh a>
	// 2052 3838:getfield        #268 <Field int azh.az>
	// 2053 3841:ixor            
	// 2054 3842:putfield        #268 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 2055 3845:aload_0         
	// 2056 3846:getfield        #12  <Field azh a>
	// 2057 3849:astore_1        
		abyte0.az = ((azh) (abyte0)).az & a.I;
	// 2058 3850:aload_1         
	// 2059 3851:aload_1         
	// 2060 3852:getfield        #268 <Field int azh.az>
	// 2061 3855:aload_0         
	// 2062 3856:getfield        #12  <Field azh a>
	// 2063 3859:getfield        #79  <Field int azh.I>
	// 2064 3862:iand            
	// 2065 3863:putfield        #268 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 2066 3866:aload_0         
	// 2067 3867:getfield        #12  <Field azh a>
	// 2068 3870:astore_1        
		abyte0.ch = ((azh) (abyte0)).bN & ~a.Y;
	// 2069 3871:aload_1         
	// 2070 3872:aload_1         
	// 2071 3873:getfield        #85  <Field int azh.bN>
	// 2072 3876:aload_0         
	// 2073 3877:getfield        #12  <Field azh a>
	// 2074 3880:getfield        #265 <Field int azh.Y>
	// 2075 3883:iconst_m1       
	// 2076 3884:ixor            
	// 2077 3885:iand            
	// 2078 3886:putfield        #271 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 2079 3889:aload_0         
	// 2080 3890:getfield        #12  <Field azh a>
	// 2081 3893:astore_1        
		abyte0.ch = ((azh) (abyte0)).ba ^ a.ch;
	// 2082 3894:aload_1         
	// 2083 3895:aload_1         
	// 2084 3896:getfield        #59  <Field int azh.ba>
	// 2085 3899:aload_0         
	// 2086 3900:getfield        #12  <Field azh a>
	// 2087 3903:getfield        #271 <Field int azh.ch>
	// 2088 3906:ixor            
	// 2089 3907:putfield        #271 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 2090 3910:aload_0         
	// 2091 3911:getfield        #12  <Field azh a>
	// 2092 3914:astore_1        
		abyte0.ch = ((azh) (abyte0)).ch & ~a.I;
	// 2093 3915:aload_1         
	// 2094 3916:aload_1         
	// 2095 3917:getfield        #271 <Field int azh.ch>
	// 2096 3920:aload_0         
	// 2097 3921:getfield        #12  <Field azh a>
	// 2098 3924:getfield        #79  <Field int azh.I>
	// 2099 3927:iconst_m1       
	// 2100 3928:ixor            
	// 2101 3929:iand            
	// 2102 3930:putfield        #271 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 2103 3933:aload_0         
	// 2104 3934:getfield        #12  <Field azh a>
	// 2105 3937:astore_1        
		abyte0.ag = ((azh) (abyte0)).Y | a.ag;
	// 2106 3938:aload_1         
	// 2107 3939:aload_1         
	// 2108 3940:getfield        #265 <Field int azh.Y>
	// 2109 3943:aload_0         
	// 2110 3944:getfield        #12  <Field azh a>
	// 2111 3947:getfield        #94  <Field int azh.ag>
	// 2112 3950:ior             
	// 2113 3951:putfield        #94  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 2114 3954:aload_0         
	// 2115 3955:getfield        #12  <Field azh a>
	// 2116 3958:astore_1        
		abyte0.ag = ((azh) (abyte0)).A ^ a.ag;
	// 2117 3959:aload_1         
	// 2118 3960:aload_1         
	// 2119 3961:getfield        #74  <Field int azh.A>
	// 2120 3964:aload_0         
	// 2121 3965:getfield        #12  <Field azh a>
	// 2122 3968:getfield        #94  <Field int azh.ag>
	// 2123 3971:ixor            
	// 2124 3972:putfield        #94  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 2125 3975:aload_0         
	// 2126 3976:getfield        #12  <Field azh a>
	// 2127 3979:astore_1        
		abyte0.bL = ((azh) (abyte0)).ag ^ a.bL;
	// 2128 3980:aload_1         
	// 2129 3981:aload_1         
	// 2130 3982:getfield        #94  <Field int azh.ag>
	// 2131 3985:aload_0         
	// 2132 3986:getfield        #12  <Field azh a>
	// 2133 3989:getfield        #262 <Field int azh.bL>
	// 2134 3992:ixor            
	// 2135 3993:putfield        #262 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 2136 3996:aload_0         
	// 2137 3997:getfield        #12  <Field azh a>
	// 2138 4000:astore_1        
		abyte0.ag = ((azh) (abyte0)).ag & ~a.I;
	// 2139 4001:aload_1         
	// 2140 4002:aload_1         
	// 2141 4003:getfield        #94  <Field int azh.ag>
	// 2142 4006:aload_0         
	// 2143 4007:getfield        #12  <Field azh a>
	// 2144 4010:getfield        #79  <Field int azh.I>
	// 2145 4013:iconst_m1       
	// 2146 4014:ixor            
	// 2147 4015:iand            
	// 2148 4016:putfield        #94  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 2149 4019:aload_0         
	// 2150 4020:getfield        #12  <Field azh a>
	// 2151 4023:astore_1        
		abyte0.ag = ((azh) (abyte0)).Y ^ a.ag;
	// 2152 4024:aload_1         
	// 2153 4025:aload_1         
	// 2154 4026:getfield        #265 <Field int azh.Y>
	// 2155 4029:aload_0         
	// 2156 4030:getfield        #12  <Field azh a>
	// 2157 4033:getfield        #94  <Field int azh.ag>
	// 2158 4036:ixor            
	// 2159 4037:putfield        #94  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 2160 4040:aload_0         
	// 2161 4041:getfield        #12  <Field azh a>
	// 2162 4044:astore_1        
		abyte0.ba = ((azh) (abyte0)).Y | a.bv;
	// 2163 4045:aload_1         
	// 2164 4046:aload_1         
	// 2165 4047:getfield        #265 <Field int azh.Y>
	// 2166 4050:aload_0         
	// 2167 4051:getfield        #12  <Field azh a>
	// 2168 4054:getfield        #82  <Field int azh.bv>
	// 2169 4057:ior             
	// 2170 4058:putfield        #59  <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 2171 4061:aload_0         
	// 2172 4062:getfield        #12  <Field azh a>
	// 2173 4065:astore_1        
		abyte0.ba = ((azh) (abyte0)).A ^ a.ba;
	// 2174 4066:aload_1         
	// 2175 4067:aload_1         
	// 2176 4068:getfield        #74  <Field int azh.A>
	// 2177 4071:aload_0         
	// 2178 4072:getfield        #12  <Field azh a>
	// 2179 4075:getfield        #59  <Field int azh.ba>
	// 2180 4078:ixor            
	// 2181 4079:putfield        #59  <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 2182 4082:aload_0         
	// 2183 4083:getfield        #12  <Field azh a>
	// 2184 4086:astore_1        
		abyte0.bi = ((azh) (abyte0)).I & a.ba;
	// 2185 4087:aload_1         
	// 2186 4088:aload_1         
	// 2187 4089:getfield        #79  <Field int azh.I>
	// 2188 4092:aload_0         
	// 2189 4093:getfield        #12  <Field azh a>
	// 2190 4096:getfield        #59  <Field int azh.ba>
	// 2191 4099:iand            
	// 2192 4100:putfield        #274 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 2193 4103:aload_0         
	// 2194 4104:getfield        #12  <Field azh a>
	// 2195 4107:astore_1        
		abyte0.ba = ((azh) (abyte0)).I | a.ba;
	// 2196 4108:aload_1         
	// 2197 4109:aload_1         
	// 2198 4110:getfield        #79  <Field int azh.I>
	// 2199 4113:aload_0         
	// 2200 4114:getfield        #12  <Field azh a>
	// 2201 4117:getfield        #59  <Field int azh.ba>
	// 2202 4120:ior             
	// 2203 4121:putfield        #59  <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 2204 4124:aload_0         
	// 2205 4125:getfield        #12  <Field azh a>
	// 2206 4128:astore_1        
		abyte0.ba = ((azh) (abyte0)).bf ^ a.ba;
	// 2207 4129:aload_1         
	// 2208 4130:aload_1         
	// 2209 4131:getfield        #184 <Field int azh.bf>
	// 2210 4134:aload_0         
	// 2211 4135:getfield        #12  <Field azh a>
	// 2212 4138:getfield        #59  <Field int azh.ba>
	// 2213 4141:ixor            
	// 2214 4142:putfield        #59  <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 2215 4145:aload_0         
	// 2216 4146:getfield        #12  <Field azh a>
	// 2217 4149:astore_1        
		abyte0.aY = ((azh) (abyte0)).Y | a.aY;
	// 2218 4150:aload_1         
	// 2219 4151:aload_1         
	// 2220 4152:getfield        #265 <Field int azh.Y>
	// 2221 4155:aload_0         
	// 2222 4156:getfield        #12  <Field azh a>
	// 2223 4159:getfield        #62  <Field int azh.aY>
	// 2224 4162:ior             
	// 2225 4163:putfield        #62  <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 2226 4166:aload_0         
	// 2227 4167:getfield        #12  <Field azh a>
	// 2228 4170:astore_1        
		abyte0.aY = ((azh) (abyte0)).bv ^ a.aY;
	// 2229 4171:aload_1         
	// 2230 4172:aload_1         
	// 2231 4173:getfield        #82  <Field int azh.bv>
	// 2232 4176:aload_0         
	// 2233 4177:getfield        #12  <Field azh a>
	// 2234 4180:getfield        #62  <Field int azh.aY>
	// 2235 4183:ixor            
	// 2236 4184:putfield        #62  <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 2237 4187:aload_0         
	// 2238 4188:getfield        #12  <Field azh a>
	// 2239 4191:astore_1        
		abyte0.bX = ((azh) (abyte0)).aY ^ a.bX;
	// 2240 4192:aload_1         
	// 2241 4193:aload_1         
	// 2242 4194:getfield        #62  <Field int azh.aY>
	// 2243 4197:aload_0         
	// 2244 4198:getfield        #12  <Field azh a>
	// 2245 4201:getfield        #139 <Field int azh.bX>
	// 2246 4204:ixor            
	// 2247 4205:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 2248 4208:aload_0         
	// 2249 4209:getfield        #12  <Field azh a>
	// 2250 4212:astore_1        
		abyte0.bi = ((azh) (abyte0)).aY ^ a.bi;
	// 2251 4213:aload_1         
	// 2252 4214:aload_1         
	// 2253 4215:getfield        #62  <Field int azh.aY>
	// 2254 4218:aload_0         
	// 2255 4219:getfield        #12  <Field azh a>
	// 2256 4222:getfield        #274 <Field int azh.bi>
	// 2257 4225:ixor            
	// 2258 4226:putfield        #274 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 2259 4229:aload_0         
	// 2260 4230:getfield        #12  <Field azh a>
	// 2261 4233:astore_1        
		abyte0.bv = ((azh) (abyte0)).bv & ~a.Y;
	// 2262 4234:aload_1         
	// 2263 4235:aload_1         
	// 2264 4236:getfield        #82  <Field int azh.bv>
	// 2265 4239:aload_0         
	// 2266 4240:getfield        #12  <Field azh a>
	// 2267 4243:getfield        #265 <Field int azh.Y>
	// 2268 4246:iconst_m1       
	// 2269 4247:ixor            
	// 2270 4248:iand            
	// 2271 4249:putfield        #82  <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 2272 4252:aload_0         
	// 2273 4253:getfield        #12  <Field azh a>
	// 2274 4256:astore_1        
		abyte0.ch = ((azh) (abyte0)).bv ^ a.ch;
	// 2275 4257:aload_1         
	// 2276 4258:aload_1         
	// 2277 4259:getfield        #82  <Field int azh.bv>
	// 2278 4262:aload_0         
	// 2279 4263:getfield        #12  <Field azh a>
	// 2280 4266:getfield        #271 <Field int azh.ch>
	// 2281 4269:ixor            
	// 2282 4270:putfield        #271 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 2283 4273:aload_0         
	// 2284 4274:getfield        #12  <Field azh a>
	// 2285 4277:astore_1        
		abyte0.cf = ((azh) (abyte0)).bv ^ a.cf;
	// 2286 4278:aload_1         
	// 2287 4279:aload_1         
	// 2288 4280:getfield        #82  <Field int azh.bv>
	// 2289 4283:aload_0         
	// 2290 4284:getfield        #12  <Field azh a>
	// 2291 4287:getfield        #91  <Field int azh.cf>
	// 2292 4290:ixor            
	// 2293 4291:putfield        #91  <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 2294 4294:aload_0         
	// 2295 4295:getfield        #12  <Field azh a>
	// 2296 4298:astore_1        
		abyte0.W = ((azh) (abyte0)).W & ~a.Y;
	// 2297 4299:aload_1         
	// 2298 4300:aload_1         
	// 2299 4301:getfield        #26  <Field int azh.W>
	// 2300 4304:aload_0         
	// 2301 4305:getfield        #12  <Field azh a>
	// 2302 4308:getfield        #265 <Field int azh.Y>
	// 2303 4311:iconst_m1       
	// 2304 4312:ixor            
	// 2305 4313:iand            
	// 2306 4314:putfield        #26  <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 2307 4317:aload_0         
	// 2308 4318:getfield        #12  <Field azh a>
	// 2309 4321:astore_1        
		abyte0.W = ((azh) (abyte0)).bN ^ a.W;
	// 2310 4322:aload_1         
	// 2311 4323:aload_1         
	// 2312 4324:getfield        #85  <Field int azh.bN>
	// 2313 4327:aload_0         
	// 2314 4328:getfield        #12  <Field azh a>
	// 2315 4331:getfield        #26  <Field int azh.W>
	// 2316 4334:ixor            
	// 2317 4335:putfield        #26  <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 2318 4338:aload_0         
	// 2319 4339:getfield        #12  <Field azh a>
	// 2320 4342:astore_1        
		abyte0.W = ((azh) (abyte0)).W & ~a.I;
	// 2321 4343:aload_1         
	// 2322 4344:aload_1         
	// 2323 4345:getfield        #26  <Field int azh.W>
	// 2324 4348:aload_0         
	// 2325 4349:getfield        #12  <Field azh a>
	// 2326 4352:getfield        #79  <Field int azh.I>
	// 2327 4355:iconst_m1       
	// 2328 4356:ixor            
	// 2329 4357:iand            
	// 2330 4358:putfield        #26  <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 2331 4361:aload_0         
	// 2332 4362:getfield        #12  <Field azh a>
	// 2333 4365:astore_1        
		abyte0.W = ((azh) (abyte0)).aC ^ a.W;
	// 2334 4366:aload_1         
	// 2335 4367:aload_1         
	// 2336 4368:getfield        #88  <Field int azh.aC>
	// 2337 4371:aload_0         
	// 2338 4372:getfield        #12  <Field azh a>
	// 2339 4375:getfield        #26  <Field int azh.W>
	// 2340 4378:ixor            
	// 2341 4379:putfield        #26  <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 2342 4382:aload_0         
	// 2343 4383:getfield        #12  <Field azh a>
	// 2344 4386:astore_1        
		abyte0.aC = ((azh) (abyte0)).aC & ~a.Y;
	// 2345 4387:aload_1         
	// 2346 4388:aload_1         
	// 2347 4389:getfield        #88  <Field int azh.aC>
	// 2348 4392:aload_0         
	// 2349 4393:getfield        #12  <Field azh a>
	// 2350 4396:getfield        #265 <Field int azh.Y>
	// 2351 4399:iconst_m1       
	// 2352 4400:ixor            
	// 2353 4401:iand            
	// 2354 4402:putfield        #88  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 2355 4405:aload_0         
	// 2356 4406:getfield        #12  <Field azh a>
	// 2357 4409:astore_1        
		abyte0.bH = ((azh) (abyte0)).aC ^ a.bH;
	// 2358 4410:aload_1         
	// 2359 4411:aload_1         
	// 2360 4412:getfield        #88  <Field int azh.aC>
	// 2361 4415:aload_0         
	// 2362 4416:getfield        #12  <Field azh a>
	// 2363 4419:getfield        #196 <Field int azh.bH>
	// 2364 4422:ixor            
	// 2365 4423:putfield        #196 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 2366 4426:aload_0         
	// 2367 4427:getfield        #12  <Field azh a>
	// 2368 4430:astore_1        
		abyte0.aZ = ((azh) (abyte0)).x & a.aZ;
	// 2369 4431:aload_1         
	// 2370 4432:aload_1         
	// 2371 4433:getfield        #160 <Field int azh.x>
	// 2372 4436:aload_0         
	// 2373 4437:getfield        #12  <Field azh a>
	// 2374 4440:getfield        #175 <Field int azh.aZ>
	// 2375 4443:iand            
	// 2376 4444:putfield        #175 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 2377 4447:aload_0         
	// 2378 4448:getfield        #12  <Field azh a>
	// 2379 4451:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aZ & ~a.h;
	// 2380 4452:aload_1         
	// 2381 4453:aload_1         
	// 2382 4454:getfield        #175 <Field int azh.aZ>
	// 2383 4457:aload_0         
	// 2384 4458:getfield        #12  <Field azh a>
	// 2385 4461:getfield        #172 <Field int azh.h>
	// 2386 4464:iconst_m1       
	// 2387 4465:ixor            
	// 2388 4466:iand            
	// 2389 4467:putfield        #175 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 2390 4470:aload_0         
	// 2391 4471:getfield        #12  <Field azh a>
	// 2392 4474:astore_1        
		abyte0.bO = ((azh) (abyte0)).aZ ^ a.bO;
	// 2393 4475:aload_1         
	// 2394 4476:aload_1         
	// 2395 4477:getfield        #175 <Field int azh.aZ>
	// 2396 4480:aload_0         
	// 2397 4481:getfield        #12  <Field azh a>
	// 2398 4484:getfield        #277 <Field int azh.bO>
	// 2399 4487:ixor            
	// 2400 4488:putfield        #277 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 2401 4491:aload_0         
	// 2402 4492:getfield        #12  <Field azh a>
	// 2403 4495:astore_1        
		abyte0.bO = ((azh) (abyte0)).N | a.bO;
	// 2404 4496:aload_1         
	// 2405 4497:aload_1         
	// 2406 4498:getfield        #199 <Field int azh.N>
	// 2407 4501:aload_0         
	// 2408 4502:getfield        #12  <Field azh a>
	// 2409 4505:getfield        #277 <Field int azh.bO>
	// 2410 4508:ior             
	// 2411 4509:putfield        #277 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 2412 4512:aload_0         
	// 2413 4513:getfield        #12  <Field azh a>
	// 2414 4516:astore_1        
		abyte0.bO = ((azh) (abyte0)).B ^ a.bO;
	// 2415 4517:aload_1         
	// 2416 4518:aload_1         
	// 2417 4519:getfield        #142 <Field int azh.B>
	// 2418 4522:aload_0         
	// 2419 4523:getfield        #12  <Field azh a>
	// 2420 4526:getfield        #277 <Field int azh.bO>
	// 2421 4529:ixor            
	// 2422 4530:putfield        #277 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 2423 4533:aload_0         
	// 2424 4534:getfield        #12  <Field azh a>
	// 2425 4537:astore_1        
		abyte0.G = ((azh) (abyte0)).bO ^ a.G;
	// 2426 4538:aload_1         
	// 2427 4539:aload_1         
	// 2428 4540:getfield        #277 <Field int azh.bO>
	// 2429 4543:aload_0         
	// 2430 4544:getfield        #12  <Field azh a>
	// 2431 4547:getfield        #280 <Field int azh.G>
	// 2432 4550:ixor            
	// 2433 4551:putfield        #280 <Field int azh.G>
		abyte0 = ((byte []) (a));
	// 2434 4554:aload_0         
	// 2435 4555:getfield        #12  <Field azh a>
	// 2436 4558:astore_1        
		abyte0.bO = ((azh) (abyte0)).q & a.G;
	// 2437 4559:aload_1         
	// 2438 4560:aload_1         
	// 2439 4561:getfield        #283 <Field int azh.q>
	// 2440 4564:aload_0         
	// 2441 4565:getfield        #12  <Field azh a>
	// 2442 4568:getfield        #280 <Field int azh.G>
	// 2443 4571:iand            
	// 2444 4572:putfield        #277 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 2445 4575:aload_0         
	// 2446 4576:getfield        #12  <Field azh a>
	// 2447 4579:astore_1        
		abyte0.B = ((azh) (abyte0)).G & ~a.O;
	// 2448 4580:aload_1         
	// 2449 4581:aload_1         
	// 2450 4582:getfield        #280 <Field int azh.G>
	// 2451 4585:aload_0         
	// 2452 4586:getfield        #12  <Field azh a>
	// 2453 4589:getfield        #130 <Field int azh.O>
	// 2454 4592:iconst_m1       
	// 2455 4593:ixor            
	// 2456 4594:iand            
	// 2457 4595:putfield        #142 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 2458 4598:aload_0         
	// 2459 4599:getfield        #12  <Field azh a>
	// 2460 4602:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bF & a.B;
	// 2461 4603:aload_1         
	// 2462 4604:aload_1         
	// 2463 4605:getfield        #133 <Field int azh.bF>
	// 2464 4608:aload_0         
	// 2465 4609:getfield        #12  <Field azh a>
	// 2466 4612:getfield        #142 <Field int azh.B>
	// 2467 4615:iand            
	// 2468 4616:putfield        #175 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 2469 4619:aload_0         
	// 2470 4620:getfield        #12  <Field azh a>
	// 2471 4623:astore_1        
		abyte0.bV = ((azh) (abyte0)).B ^ a.bV;
	// 2472 4624:aload_1         
	// 2473 4625:aload_1         
	// 2474 4626:getfield        #142 <Field int azh.B>
	// 2475 4629:aload_0         
	// 2476 4630:getfield        #12  <Field azh a>
	// 2477 4633:getfield        #127 <Field int azh.bV>
	// 2478 4636:ixor            
	// 2479 4637:putfield        #127 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 2480 4640:aload_0         
	// 2481 4641:getfield        #12  <Field azh a>
	// 2482 4644:astore_1        
		abyte0.aC = ((azh) (abyte0)).bT & a.bV;
	// 2483 4645:aload_1         
	// 2484 4646:aload_1         
	// 2485 4647:getfield        #286 <Field int azh.bT>
	// 2486 4650:aload_0         
	// 2487 4651:getfield        #12  <Field azh a>
	// 2488 4654:getfield        #127 <Field int azh.bV>
	// 2489 4657:iand            
	// 2490 4658:putfield        #88  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 2491 4661:aload_0         
	// 2492 4662:getfield        #12  <Field azh a>
	// 2493 4665:astore_1        
		abyte0.bN = ((azh) (abyte0)).bT & a.bV;
	// 2494 4666:aload_1         
	// 2495 4667:aload_1         
	// 2496 4668:getfield        #286 <Field int azh.bT>
	// 2497 4671:aload_0         
	// 2498 4672:getfield        #12  <Field azh a>
	// 2499 4675:getfield        #127 <Field int azh.bV>
	// 2500 4678:iand            
	// 2501 4679:putfield        #85  <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 2502 4682:aload_0         
	// 2503 4683:getfield        #12  <Field azh a>
	// 2504 4686:astore_1        
		abyte0.bv = ((azh) (abyte0)).bT & ~a.bV;
	// 2505 4687:aload_1         
	// 2506 4688:aload_1         
	// 2507 4689:getfield        #286 <Field int azh.bT>
	// 2508 4692:aload_0         
	// 2509 4693:getfield        #12  <Field azh a>
	// 2510 4696:getfield        #127 <Field int azh.bV>
	// 2511 4699:iconst_m1       
	// 2512 4700:ixor            
	// 2513 4701:iand            
	// 2514 4702:putfield        #82  <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 2515 4705:aload_0         
	// 2516 4706:getfield        #12  <Field azh a>
	// 2517 4709:astore_1        
		abyte0.bv = ((azh) (abyte0)).bV ^ a.bv;
	// 2518 4710:aload_1         
	// 2519 4711:aload_1         
	// 2520 4712:getfield        #127 <Field int azh.bV>
	// 2521 4715:aload_0         
	// 2522 4716:getfield        #12  <Field azh a>
	// 2523 4719:getfield        #82  <Field int azh.bv>
	// 2524 4722:ixor            
	// 2525 4723:putfield        #82  <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 2526 4726:aload_0         
	// 2527 4727:getfield        #12  <Field azh a>
	// 2528 4730:astore_1        
		abyte0.B = ((azh) (abyte0)).bF & a.B;
	// 2529 4731:aload_1         
	// 2530 4732:aload_1         
	// 2531 4733:getfield        #133 <Field int azh.bF>
	// 2532 4736:aload_0         
	// 2533 4737:getfield        #12  <Field azh a>
	// 2534 4740:getfield        #142 <Field int azh.B>
	// 2535 4743:iand            
	// 2536 4744:putfield        #142 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 2537 4747:aload_0         
	// 2538 4748:getfield        #12  <Field azh a>
	// 2539 4751:astore_1        
		abyte0.aY = ((azh) (abyte0)).q & ~a.G;
	// 2540 4752:aload_1         
	// 2541 4753:aload_1         
	// 2542 4754:getfield        #283 <Field int azh.q>
	// 2543 4757:aload_0         
	// 2544 4758:getfield        #12  <Field azh a>
	// 2545 4761:getfield        #280 <Field int azh.G>
	// 2546 4764:iconst_m1       
	// 2547 4765:ixor            
	// 2548 4766:iand            
	// 2549 4767:putfield        #62  <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 2550 4770:aload_0         
	// 2551 4771:getfield        #12  <Field azh a>
	// 2552 4774:astore_1        
		abyte0.aY = ((azh) (abyte0)).aY & a.i;
	// 2553 4775:aload_1         
	// 2554 4776:aload_1         
	// 2555 4777:getfield        #62  <Field int azh.aY>
	// 2556 4780:aload_0         
	// 2557 4781:getfield        #12  <Field azh a>
	// 2558 4784:getfield        #289 <Field int azh.i>
	// 2559 4787:iand            
	// 2560 4788:putfield        #62  <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 2561 4791:aload_0         
	// 2562 4792:getfield        #12  <Field azh a>
	// 2563 4795:astore_1        
		abyte0.bf = ((azh) (abyte0)).G | a.O;
	// 2564 4796:aload_1         
	// 2565 4797:aload_1         
	// 2566 4798:getfield        #280 <Field int azh.G>
	// 2567 4801:aload_0         
	// 2568 4802:getfield        #12  <Field azh a>
	// 2569 4805:getfield        #130 <Field int azh.O>
	// 2570 4808:ior             
	// 2571 4809:putfield        #184 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 2572 4812:aload_0         
	// 2573 4813:getfield        #12  <Field azh a>
	// 2574 4816:astore_1        
		abyte0.bh = ((azh) (abyte0)).bf ^ a.bh;
	// 2575 4817:aload_1         
	// 2576 4818:aload_1         
	// 2577 4819:getfield        #184 <Field int azh.bf>
	// 2578 4822:aload_0         
	// 2579 4823:getfield        #12  <Field azh a>
	// 2580 4826:getfield        #53  <Field int azh.bh>
	// 2581 4829:ixor            
	// 2582 4830:putfield        #53  <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 2583 4833:aload_0         
	// 2584 4834:getfield        #12  <Field azh a>
	// 2585 4837:astore_1        
		abyte0.aP = ((azh) (abyte0)).bT & a.bh;
	// 2586 4838:aload_1         
	// 2587 4839:aload_1         
	// 2588 4840:getfield        #286 <Field int azh.bT>
	// 2589 4843:aload_0         
	// 2590 4844:getfield        #12  <Field azh a>
	// 2591 4847:getfield        #53  <Field int azh.bh>
	// 2592 4850:iand            
	// 2593 4851:putfield        #292 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 2594 4854:aload_0         
	// 2595 4855:getfield        #12  <Field azh a>
	// 2596 4858:astore_1        
		abyte0.aM = ((azh) (abyte0)).bT & ~a.bh;
	// 2597 4859:aload_1         
	// 2598 4860:aload_1         
	// 2599 4861:getfield        #286 <Field int azh.bT>
	// 2600 4864:aload_0         
	// 2601 4865:getfield        #12  <Field azh a>
	// 2602 4868:getfield        #53  <Field int azh.bh>
	// 2603 4871:iconst_m1       
	// 2604 4872:ixor            
	// 2605 4873:iand            
	// 2606 4874:putfield        #295 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 2607 4877:aload_0         
	// 2608 4878:getfield        #12  <Field azh a>
	// 2609 4881:astore_1        
		abyte0.aM = ((azh) (abyte0)).bV ^ a.aM;
	// 2610 4882:aload_1         
	// 2611 4883:aload_1         
	// 2612 4884:getfield        #127 <Field int azh.bV>
	// 2613 4887:aload_0         
	// 2614 4888:getfield        #12  <Field azh a>
	// 2615 4891:getfield        #295 <Field int azh.aM>
	// 2616 4894:ixor            
	// 2617 4895:putfield        #295 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 2618 4898:aload_0         
	// 2619 4899:getfield        #12  <Field azh a>
	// 2620 4902:astore_1        
		abyte0.bh = ((azh) (abyte0)).bh & ~a.bT;
	// 2621 4903:aload_1         
	// 2622 4904:aload_1         
	// 2623 4905:getfield        #53  <Field int azh.bh>
	// 2624 4908:aload_0         
	// 2625 4909:getfield        #12  <Field azh a>
	// 2626 4912:getfield        #286 <Field int azh.bT>
	// 2627 4915:iconst_m1       
	// 2628 4916:ixor            
	// 2629 4917:iand            
	// 2630 4918:putfield        #53  <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 2631 4921:aload_0         
	// 2632 4922:getfield        #12  <Field azh a>
	// 2633 4925:astore_1        
		abyte0.bV = ((azh) (abyte0)).bT & ~a.bf;
	// 2634 4926:aload_1         
	// 2635 4927:aload_1         
	// 2636 4928:getfield        #286 <Field int azh.bT>
	// 2637 4931:aload_0         
	// 2638 4932:getfield        #12  <Field azh a>
	// 2639 4935:getfield        #184 <Field int azh.bf>
	// 2640 4938:iconst_m1       
	// 2641 4939:ixor            
	// 2642 4940:iand            
	// 2643 4941:putfield        #127 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 2644 4944:aload_0         
	// 2645 4945:getfield        #12  <Field azh a>
	// 2646 4948:astore_1        
		abyte0.bU = ((azh) (abyte0)).bF & a.bf;
	// 2647 4949:aload_1         
	// 2648 4950:aload_1         
	// 2649 4951:getfield        #133 <Field int azh.bF>
	// 2650 4954:aload_0         
	// 2651 4955:getfield        #12  <Field azh a>
	// 2652 4958:getfield        #184 <Field int azh.bf>
	// 2653 4961:iand            
	// 2654 4962:putfield        #298 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 2655 4965:aload_0         
	// 2656 4966:getfield        #12  <Field azh a>
	// 2657 4969:astore_1        
		abyte0.bV = ((azh) (abyte0)).bU ^ a.bV;
	// 2658 4970:aload_1         
	// 2659 4971:aload_1         
	// 2660 4972:getfield        #298 <Field int azh.bU>
	// 2661 4975:aload_0         
	// 2662 4976:getfield        #12  <Field azh a>
	// 2663 4979:getfield        #127 <Field int azh.bV>
	// 2664 4982:ixor            
	// 2665 4983:putfield        #127 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 2666 4986:aload_0         
	// 2667 4987:getfield        #12  <Field azh a>
	// 2668 4990:astore_1        
		abyte0.bU = ((azh) (abyte0)).bf ^ a.bF;
	// 2669 4991:aload_1         
	// 2670 4992:aload_1         
	// 2671 4993:getfield        #184 <Field int azh.bf>
	// 2672 4996:aload_0         
	// 2673 4997:getfield        #12  <Field azh a>
	// 2674 5000:getfield        #133 <Field int azh.bF>
	// 2675 5003:ixor            
	// 2676 5004:putfield        #298 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 2677 5007:aload_0         
	// 2678 5008:getfield        #12  <Field azh a>
	// 2679 5011:astore_1        
		abyte0.bU = ((azh) (abyte0)).bU & ~a.bT;
	// 2680 5012:aload_1         
	// 2681 5013:aload_1         
	// 2682 5014:getfield        #298 <Field int azh.bU>
	// 2683 5017:aload_0         
	// 2684 5018:getfield        #12  <Field azh a>
	// 2685 5021:getfield        #286 <Field int azh.bT>
	// 2686 5024:iconst_m1       
	// 2687 5025:ixor            
	// 2688 5026:iand            
	// 2689 5027:putfield        #298 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 2690 5030:aload_0         
	// 2691 5031:getfield        #12  <Field azh a>
	// 2692 5034:astore_1        
		abyte0.aO = ((azh) (abyte0)).bF & ~a.bf;
	// 2693 5035:aload_1         
	// 2694 5036:aload_1         
	// 2695 5037:getfield        #133 <Field int azh.bF>
	// 2696 5040:aload_0         
	// 2697 5041:getfield        #12  <Field azh a>
	// 2698 5044:getfield        #184 <Field int azh.bf>
	// 2699 5047:iconst_m1       
	// 2700 5048:ixor            
	// 2701 5049:iand            
	// 2702 5050:putfield        #301 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2703 5053:aload_0         
	// 2704 5054:getfield        #12  <Field azh a>
	// 2705 5057:astore_1        
		abyte0.aO = ((azh) (abyte0)).O ^ a.aO;
	// 2706 5058:aload_1         
	// 2707 5059:aload_1         
	// 2708 5060:getfield        #130 <Field int azh.O>
	// 2709 5063:aload_0         
	// 2710 5064:getfield        #12  <Field azh a>
	// 2711 5067:getfield        #301 <Field int azh.aO>
	// 2712 5070:ixor            
	// 2713 5071:putfield        #301 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2714 5074:aload_0         
	// 2715 5075:getfield        #12  <Field azh a>
	// 2716 5078:astore_1        
		abyte0.bN = ((azh) (abyte0)).aO ^ a.bN;
	// 2717 5079:aload_1         
	// 2718 5080:aload_1         
	// 2719 5081:getfield        #301 <Field int azh.aO>
	// 2720 5084:aload_0         
	// 2721 5085:getfield        #12  <Field azh a>
	// 2722 5088:getfield        #85  <Field int azh.bN>
	// 2723 5091:ixor            
	// 2724 5092:putfield        #85  <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 2725 5095:aload_0         
	// 2726 5096:getfield        #12  <Field azh a>
	// 2727 5099:astore_1        
		abyte0.aO = ((azh) (abyte0)).bf & ~a.O;
	// 2728 5100:aload_1         
	// 2729 5101:aload_1         
	// 2730 5102:getfield        #184 <Field int azh.bf>
	// 2731 5105:aload_0         
	// 2732 5106:getfield        #12  <Field azh a>
	// 2733 5109:getfield        #130 <Field int azh.O>
	// 2734 5112:iconst_m1       
	// 2735 5113:ixor            
	// 2736 5114:iand            
	// 2737 5115:putfield        #301 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2738 5118:aload_0         
	// 2739 5119:getfield        #12  <Field azh a>
	// 2740 5122:astore_1        
		abyte0.b = ((azh) (abyte0)).aO ^ a.bF;
	// 2741 5123:aload_1         
	// 2742 5124:aload_1         
	// 2743 5125:getfield        #301 <Field int azh.aO>
	// 2744 5128:aload_0         
	// 2745 5129:getfield        #12  <Field azh a>
	// 2746 5132:getfield        #133 <Field int azh.bF>
	// 2747 5135:ixor            
	// 2748 5136:putfield        #304 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 2749 5139:aload_0         
	// 2750 5140:getfield        #12  <Field azh a>
	// 2751 5143:astore_1        
		abyte0.aA = ((azh) (abyte0)).bT & ~a.b;
	// 2752 5144:aload_1         
	// 2753 5145:aload_1         
	// 2754 5146:getfield        #286 <Field int azh.bT>
	// 2755 5149:aload_0         
	// 2756 5150:getfield        #12  <Field azh a>
	// 2757 5153:getfield        #304 <Field int azh.b>
	// 2758 5156:iconst_m1       
	// 2759 5157:ixor            
	// 2760 5158:iand            
	// 2761 5159:putfield        #307 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 2762 5162:aload_0         
	// 2763 5163:getfield        #12  <Field azh a>
	// 2764 5166:astore_1        
		abyte0.b = ((azh) (abyte0)).bT & a.b;
	// 2765 5167:aload_1         
	// 2766 5168:aload_1         
	// 2767 5169:getfield        #286 <Field int azh.bT>
	// 2768 5172:aload_0         
	// 2769 5173:getfield        #12  <Field azh a>
	// 2770 5176:getfield        #304 <Field int azh.b>
	// 2771 5179:iand            
	// 2772 5180:putfield        #304 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 2773 5183:aload_0         
	// 2774 5184:getfield        #12  <Field azh a>
	// 2775 5187:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aO ^ a.aZ;
	// 2776 5188:aload_1         
	// 2777 5189:aload_1         
	// 2778 5190:getfield        #301 <Field int azh.aO>
	// 2779 5193:aload_0         
	// 2780 5194:getfield        #12  <Field azh a>
	// 2781 5197:getfield        #175 <Field int azh.aZ>
	// 2782 5200:ixor            
	// 2783 5201:putfield        #175 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 2784 5204:aload_0         
	// 2785 5205:getfield        #12  <Field azh a>
	// 2786 5208:astore_1        
		abyte0.bh = ((azh) (abyte0)).aZ ^ a.bh;
	// 2787 5209:aload_1         
	// 2788 5210:aload_1         
	// 2789 5211:getfield        #175 <Field int azh.aZ>
	// 2790 5214:aload_0         
	// 2791 5215:getfield        #12  <Field azh a>
	// 2792 5218:getfield        #53  <Field int azh.bh>
	// 2793 5221:ixor            
	// 2794 5222:putfield        #53  <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 2795 5225:aload_0         
	// 2796 5226:getfield        #12  <Field azh a>
	// 2797 5229:astore_1        
		abyte0.n = ((azh) (abyte0)).aZ ^ a.n;
	// 2798 5230:aload_1         
	// 2799 5231:aload_1         
	// 2800 5232:getfield        #175 <Field int azh.aZ>
	// 2801 5235:aload_0         
	// 2802 5236:getfield        #12  <Field azh a>
	// 2803 5239:getfield        #310 <Field int azh.n>
	// 2804 5242:ixor            
	// 2805 5243:putfield        #310 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 2806 5246:aload_0         
	// 2807 5247:getfield        #12  <Field azh a>
	// 2808 5250:astore_1        
		abyte0.aO = ((azh) (abyte0)).q & ~a.G;
	// 2809 5251:aload_1         
	// 2810 5252:aload_1         
	// 2811 5253:getfield        #283 <Field int azh.q>
	// 2812 5256:aload_0         
	// 2813 5257:getfield        #12  <Field azh a>
	// 2814 5260:getfield        #280 <Field int azh.G>
	// 2815 5263:iconst_m1       
	// 2816 5264:ixor            
	// 2817 5265:iand            
	// 2818 5266:putfield        #301 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2819 5269:aload_0         
	// 2820 5270:getfield        #12  <Field azh a>
	// 2821 5273:astore_1        
		abyte0.aO = ((azh) (abyte0)).G ^ a.aO;
	// 2822 5274:aload_1         
	// 2823 5275:aload_1         
	// 2824 5276:getfield        #280 <Field int azh.G>
	// 2825 5279:aload_0         
	// 2826 5280:getfield        #12  <Field azh a>
	// 2827 5283:getfield        #301 <Field int azh.aO>
	// 2828 5286:ixor            
	// 2829 5287:putfield        #301 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2830 5290:aload_0         
	// 2831 5291:getfield        #12  <Field azh a>
	// 2832 5294:astore_1        
		abyte0.aO = ((azh) (abyte0)).i & ~a.aO;
	// 2833 5295:aload_1         
	// 2834 5296:aload_1         
	// 2835 5297:getfield        #289 <Field int azh.i>
	// 2836 5300:aload_0         
	// 2837 5301:getfield        #12  <Field azh a>
	// 2838 5304:getfield        #301 <Field int azh.aO>
	// 2839 5307:iconst_m1       
	// 2840 5308:ixor            
	// 2841 5309:iand            
	// 2842 5310:putfield        #301 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 2843 5313:aload_0         
	// 2844 5314:getfield        #12  <Field azh a>
	// 2845 5317:astore_1        
		abyte0.aI = ((azh) (abyte0)).q & a.G;
	// 2846 5318:aload_1         
	// 2847 5319:aload_1         
	// 2848 5320:getfield        #283 <Field int azh.q>
	// 2849 5323:aload_0         
	// 2850 5324:getfield        #12  <Field azh a>
	// 2851 5327:getfield        #280 <Field int azh.G>
	// 2852 5330:iand            
	// 2853 5331:putfield        #313 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 2854 5334:aload_0         
	// 2855 5335:getfield        #12  <Field azh a>
	// 2856 5338:astore_1        
		abyte0.ck = ((azh) (abyte0)).O & a.G;
	// 2857 5339:aload_1         
	// 2858 5340:aload_1         
	// 2859 5341:getfield        #130 <Field int azh.O>
	// 2860 5344:aload_0         
	// 2861 5345:getfield        #12  <Field azh a>
	// 2862 5348:getfield        #280 <Field int azh.G>
	// 2863 5351:iand            
	// 2864 5352:putfield        #316 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 2865 5355:aload_0         
	// 2866 5356:getfield        #12  <Field azh a>
	// 2867 5359:astore_1        
		abyte0.ck = ((azh) (abyte0)).bF & a.ck;
	// 2868 5360:aload_1         
	// 2869 5361:aload_1         
	// 2870 5362:getfield        #133 <Field int azh.bF>
	// 2871 5365:aload_0         
	// 2872 5366:getfield        #12  <Field azh a>
	// 2873 5369:getfield        #316 <Field int azh.ck>
	// 2874 5372:iand            
	// 2875 5373:putfield        #316 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 2876 5376:aload_0         
	// 2877 5377:getfield        #12  <Field azh a>
	// 2878 5380:astore_1        
		abyte0.cl = ((azh) (abyte0)).G ^ a.O;
	// 2879 5381:aload_1         
	// 2880 5382:aload_1         
	// 2881 5383:getfield        #280 <Field int azh.G>
	// 2882 5386:aload_0         
	// 2883 5387:getfield        #12  <Field azh a>
	// 2884 5390:getfield        #130 <Field int azh.O>
	// 2885 5393:ixor            
	// 2886 5394:putfield        #319 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 2887 5397:aload_0         
	// 2888 5398:getfield        #12  <Field azh a>
	// 2889 5401:astore_1        
		abyte0.cm = ((azh) (abyte0)).bF & ~a.cl;
	// 2890 5402:aload_1         
	// 2891 5403:aload_1         
	// 2892 5404:getfield        #133 <Field int azh.bF>
	// 2893 5407:aload_0         
	// 2894 5408:getfield        #12  <Field azh a>
	// 2895 5411:getfield        #319 <Field int azh.cl>
	// 2896 5414:iconst_m1       
	// 2897 5415:ixor            
	// 2898 5416:iand            
	// 2899 5417:putfield        #322 <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 2900 5420:aload_0         
	// 2901 5421:getfield        #12  <Field azh a>
	// 2902 5424:astore_1        
		abyte0.am = ((azh) (abyte0)).cl ^ a.am;
	// 2903 5425:aload_1         
	// 2904 5426:aload_1         
	// 2905 5427:getfield        #319 <Field int azh.cl>
	// 2906 5430:aload_0         
	// 2907 5431:getfield        #12  <Field azh a>
	// 2908 5434:getfield        #121 <Field int azh.am>
	// 2909 5437:ixor            
	// 2910 5438:putfield        #121 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 2911 5441:aload_0         
	// 2912 5442:getfield        #12  <Field azh a>
	// 2913 5445:astore_1        
		abyte0.am = ((azh) (abyte0)).am ^ a.bT;
	// 2914 5446:aload_1         
	// 2915 5447:aload_1         
	// 2916 5448:getfield        #121 <Field int azh.am>
	// 2917 5451:aload_0         
	// 2918 5452:getfield        #12  <Field azh a>
	// 2919 5455:getfield        #286 <Field int azh.bT>
	// 2920 5458:ixor            
	// 2921 5459:putfield        #121 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 2922 5462:aload_0         
	// 2923 5463:getfield        #12  <Field azh a>
	// 2924 5466:astore_1        
		abyte0.bc = ((azh) (abyte0)).cl ^ a.bc;
	// 2925 5467:aload_1         
	// 2926 5468:aload_1         
	// 2927 5469:getfield        #319 <Field int azh.cl>
	// 2928 5472:aload_0         
	// 2929 5473:getfield        #12  <Field azh a>
	// 2930 5476:getfield        #106 <Field int azh.bc>
	// 2931 5479:ixor            
	// 2932 5480:putfield        #106 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 2933 5483:aload_0         
	// 2934 5484:getfield        #12  <Field azh a>
	// 2935 5487:astore_1        
		abyte0.aC = ((azh) (abyte0)).bc ^ a.aC;
	// 2936 5488:aload_1         
	// 2937 5489:aload_1         
	// 2938 5490:getfield        #106 <Field int azh.bc>
	// 2939 5493:aload_0         
	// 2940 5494:getfield        #12  <Field azh a>
	// 2941 5497:getfield        #88  <Field int azh.aC>
	// 2942 5500:ixor            
	// 2943 5501:putfield        #88  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 2944 5504:aload_0         
	// 2945 5505:getfield        #12  <Field azh a>
	// 2946 5508:astore_1        
		abyte0.bc = ((azh) (abyte0)).bF & ~a.cl;
	// 2947 5509:aload_1         
	// 2948 5510:aload_1         
	// 2949 5511:getfield        #133 <Field int azh.bF>
	// 2950 5514:aload_0         
	// 2951 5515:getfield        #12  <Field azh a>
	// 2952 5518:getfield        #319 <Field int azh.cl>
	// 2953 5521:iconst_m1       
	// 2954 5522:ixor            
	// 2955 5523:iand            
	// 2956 5524:putfield        #106 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 2957 5527:aload_0         
	// 2958 5528:getfield        #12  <Field azh a>
	// 2959 5531:astore_1        
		abyte0.bc = ((azh) (abyte0)).bf ^ a.bc;
	// 2960 5532:aload_1         
	// 2961 5533:aload_1         
	// 2962 5534:getfield        #184 <Field int azh.bf>
	// 2963 5537:aload_0         
	// 2964 5538:getfield        #12  <Field azh a>
	// 2965 5541:getfield        #106 <Field int azh.bc>
	// 2966 5544:ixor            
	// 2967 5545:putfield        #106 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 2968 5548:aload_0         
	// 2969 5549:getfield        #12  <Field azh a>
	// 2970 5552:astore_1        
		abyte0.bc = ((azh) (abyte0)).bT & a.bc;
	// 2971 5553:aload_1         
	// 2972 5554:aload_1         
	// 2973 5555:getfield        #286 <Field int azh.bT>
	// 2974 5558:aload_0         
	// 2975 5559:getfield        #12  <Field azh a>
	// 2976 5562:getfield        #106 <Field int azh.bc>
	// 2977 5565:iand            
	// 2978 5566:putfield        #106 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 2979 5569:aload_0         
	// 2980 5570:getfield        #12  <Field azh a>
	// 2981 5573:astore_1        
		abyte0.bf = ((azh) (abyte0)).bF & ~a.cl;
	// 2982 5574:aload_1         
	// 2983 5575:aload_1         
	// 2984 5576:getfield        #133 <Field int azh.bF>
	// 2985 5579:aload_0         
	// 2986 5580:getfield        #12  <Field azh a>
	// 2987 5583:getfield        #319 <Field int azh.cl>
	// 2988 5586:iconst_m1       
	// 2989 5587:ixor            
	// 2990 5588:iand            
	// 2991 5589:putfield        #184 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 2992 5592:aload_0         
	// 2993 5593:getfield        #12  <Field azh a>
	// 2994 5596:astore_1        
		abyte0.bf = ((azh) (abyte0)).cl ^ a.bf;
	// 2995 5597:aload_1         
	// 2996 5598:aload_1         
	// 2997 5599:getfield        #319 <Field int azh.cl>
	// 2998 5602:aload_0         
	// 2999 5603:getfield        #12  <Field azh a>
	// 3000 5606:getfield        #184 <Field int azh.bf>
	// 3001 5609:ixor            
	// 3002 5610:putfield        #184 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 3003 5613:aload_0         
	// 3004 5614:getfield        #12  <Field azh a>
	// 3005 5617:astore_1        
		abyte0.aA = ((azh) (abyte0)).bf ^ a.aA;
	// 3006 5618:aload_1         
	// 3007 5619:aload_1         
	// 3008 5620:getfield        #184 <Field int azh.bf>
	// 3009 5623:aload_0         
	// 3010 5624:getfield        #12  <Field azh a>
	// 3011 5627:getfield        #307 <Field int azh.aA>
	// 3012 5630:ixor            
	// 3013 5631:putfield        #307 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 3014 5634:aload_0         
	// 3015 5635:getfield        #12  <Field azh a>
	// 3016 5638:astore_1        
		abyte0.bf = ((azh) (abyte0)).O & ~a.G;
	// 3017 5639:aload_1         
	// 3018 5640:aload_1         
	// 3019 5641:getfield        #130 <Field int azh.O>
	// 3020 5644:aload_0         
	// 3021 5645:getfield        #12  <Field azh a>
	// 3022 5648:getfield        #280 <Field int azh.G>
	// 3023 5651:iconst_m1       
	// 3024 5652:ixor            
	// 3025 5653:iand            
	// 3026 5654:putfield        #184 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 3027 5657:aload_0         
	// 3028 5658:getfield        #12  <Field azh a>
	// 3029 5661:astore_1        
		abyte0.cm = ((azh) (abyte0)).bf ^ a.cm;
	// 3030 5662:aload_1         
	// 3031 5663:aload_1         
	// 3032 5664:getfield        #184 <Field int azh.bf>
	// 3033 5667:aload_0         
	// 3034 5668:getfield        #12  <Field azh a>
	// 3035 5671:getfield        #322 <Field int azh.cm>
	// 3036 5674:ixor            
	// 3037 5675:putfield        #322 <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 3038 5678:aload_0         
	// 3039 5679:getfield        #12  <Field azh a>
	// 3040 5682:astore_1        
		abyte0.bc = ((azh) (abyte0)).cm ^ a.bc;
	// 3041 5683:aload_1         
	// 3042 5684:aload_1         
	// 3043 5685:getfield        #322 <Field int azh.cm>
	// 3044 5688:aload_0         
	// 3045 5689:getfield        #12  <Field azh a>
	// 3046 5692:getfield        #106 <Field int azh.bc>
	// 3047 5695:ixor            
	// 3048 5696:putfield        #106 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 3049 5699:aload_0         
	// 3050 5700:getfield        #12  <Field azh a>
	// 3051 5703:astore_1        
		abyte0.B = ((azh) (abyte0)).bf ^ a.B;
	// 3052 5704:aload_1         
	// 3053 5705:aload_1         
	// 3054 5706:getfield        #184 <Field int azh.bf>
	// 3055 5709:aload_0         
	// 3056 5710:getfield        #12  <Field azh a>
	// 3057 5713:getfield        #142 <Field int azh.B>
	// 3058 5716:ixor            
	// 3059 5717:putfield        #142 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 3060 5720:aload_0         
	// 3061 5721:getfield        #12  <Field azh a>
	// 3062 5724:astore_1        
		abyte0.bU = ((azh) (abyte0)).B ^ a.bU;
	// 3063 5725:aload_1         
	// 3064 5726:aload_1         
	// 3065 5727:getfield        #142 <Field int azh.B>
	// 3066 5730:aload_0         
	// 3067 5731:getfield        #12  <Field azh a>
	// 3068 5734:getfield        #298 <Field int azh.bU>
	// 3069 5737:ixor            
	// 3070 5738:putfield        #298 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 3071 5741:aload_0         
	// 3072 5742:getfield        #12  <Field azh a>
	// 3073 5745:astore_1        
		abyte0.b = ((azh) (abyte0)).B ^ a.b;
	// 3074 5746:aload_1         
	// 3075 5747:aload_1         
	// 3076 5748:getfield        #142 <Field int azh.B>
	// 3077 5751:aload_0         
	// 3078 5752:getfield        #12  <Field azh a>
	// 3079 5755:getfield        #304 <Field int azh.b>
	// 3080 5758:ixor            
	// 3081 5759:putfield        #304 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 3082 5762:aload_0         
	// 3083 5763:getfield        #12  <Field azh a>
	// 3084 5766:astore_1        
		abyte0.aP = ((azh) (abyte0)).B ^ a.aP;
	// 3085 5767:aload_1         
	// 3086 5768:aload_1         
	// 3087 5769:getfield        #142 <Field int azh.B>
	// 3088 5772:aload_0         
	// 3089 5773:getfield        #12  <Field azh a>
	// 3090 5776:getfield        #292 <Field int azh.aP>
	// 3091 5779:ixor            
	// 3092 5780:putfield        #292 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 3093 5783:aload_0         
	// 3094 5784:getfield        #12  <Field azh a>
	// 3095 5787:astore_1        
		abyte0.B = ((azh) (abyte0)).bF & ~a.G;
	// 3096 5788:aload_1         
	// 3097 5789:aload_1         
	// 3098 5790:getfield        #133 <Field int azh.bF>
	// 3099 5793:aload_0         
	// 3100 5794:getfield        #12  <Field azh a>
	// 3101 5797:getfield        #280 <Field int azh.G>
	// 3102 5800:iconst_m1       
	// 3103 5801:ixor            
	// 3104 5802:iand            
	// 3105 5803:putfield        #142 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 3106 5806:aload_0         
	// 3107 5807:getfield        #12  <Field azh a>
	// 3108 5810:astore_1        
		abyte0.B = ((azh) (abyte0)).bT & ~a.B;
	// 3109 5811:aload_1         
	// 3110 5812:aload_1         
	// 3111 5813:getfield        #286 <Field int azh.bT>
	// 3112 5816:aload_0         
	// 3113 5817:getfield        #12  <Field azh a>
	// 3114 5820:getfield        #142 <Field int azh.B>
	// 3115 5823:iconst_m1       
	// 3116 5824:ixor            
	// 3117 5825:iand            
	// 3118 5826:putfield        #142 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 3119 5829:aload_0         
	// 3120 5830:getfield        #12  <Field azh a>
	// 3121 5833:astore_1        
		abyte0.B = ((azh) (abyte0)).ck ^ a.B;
	// 3122 5834:aload_1         
	// 3123 5835:aload_1         
	// 3124 5836:getfield        #316 <Field int azh.ck>
	// 3125 5839:aload_0         
	// 3126 5840:getfield        #12  <Field azh a>
	// 3127 5843:getfield        #142 <Field int azh.B>
	// 3128 5846:ixor            
	// 3129 5847:putfield        #142 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 3130 5850:aload_0         
	// 3131 5851:getfield        #12  <Field azh a>
	// 3132 5854:astore_1        
		abyte0.ck = ((azh) (abyte0)).i & ~a.G;
	// 3133 5855:aload_1         
	// 3134 5856:aload_1         
	// 3135 5857:getfield        #289 <Field int azh.i>
	// 3136 5860:aload_0         
	// 3137 5861:getfield        #12  <Field azh a>
	// 3138 5864:getfield        #280 <Field int azh.G>
	// 3139 5867:iconst_m1       
	// 3140 5868:ixor            
	// 3141 5869:iand            
	// 3142 5870:putfield        #316 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 3143 5873:aload_0         
	// 3144 5874:getfield        #12  <Field azh a>
	// 3145 5877:astore_1        
		abyte0.bf = ((azh) (abyte0)).ai & ~a.g;
	// 3146 5878:aload_1         
	// 3147 5879:aload_1         
	// 3148 5880:getfield        #325 <Field int azh.ai>
	// 3149 5883:aload_0         
	// 3150 5884:getfield        #12  <Field azh a>
	// 3151 5887:getfield        #145 <Field int azh.g>
	// 3152 5890:iconst_m1       
	// 3153 5891:ixor            
	// 3154 5892:iand            
	// 3155 5893:putfield        #184 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 3156 5896:aload_0         
	// 3157 5897:getfield        #12  <Field azh a>
	// 3158 5900:astore_1        
		abyte0.bf = ((azh) (abyte0)).aa & ~a.bf;
	// 3159 5901:aload_1         
	// 3160 5902:aload_1         
	// 3161 5903:getfield        #328 <Field int azh.aa>
	// 3162 5906:aload_0         
	// 3163 5907:getfield        #12  <Field azh a>
	// 3164 5910:getfield        #184 <Field int azh.bf>
	// 3165 5913:iconst_m1       
	// 3166 5914:ixor            
	// 3167 5915:iand            
	// 3168 5916:putfield        #184 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 3169 5919:aload_0         
	// 3170 5920:getfield        #12  <Field azh a>
	// 3171 5923:astore_1        
		abyte0.ai = ((azh) (abyte0)).g & a.ai;
	// 3172 5924:aload_1         
	// 3173 5925:aload_1         
	// 3174 5926:getfield        #145 <Field int azh.g>
	// 3175 5929:aload_0         
	// 3176 5930:getfield        #12  <Field azh a>
	// 3177 5933:getfield        #325 <Field int azh.ai>
	// 3178 5936:iand            
	// 3179 5937:putfield        #325 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 3180 5940:aload_0         
	// 3181 5941:getfield        #12  <Field azh a>
	// 3182 5944:astore_1        
		abyte0.ai = ((azh) (abyte0)).aF ^ a.ai;
	// 3183 5945:aload_1         
	// 3184 5946:aload_1         
	// 3185 5947:getfield        #331 <Field int azh.aF>
	// 3186 5950:aload_0         
	// 3187 5951:getfield        #12  <Field azh a>
	// 3188 5954:getfield        #325 <Field int azh.ai>
	// 3189 5957:ixor            
	// 3190 5958:putfield        #325 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 3191 5961:aload_0         
	// 3192 5962:getfield        #12  <Field azh a>
	// 3193 5965:astore_1        
		abyte0.bf = ((azh) (abyte0)).ai ^ a.bf;
	// 3194 5966:aload_1         
	// 3195 5967:aload_1         
	// 3196 5968:getfield        #325 <Field int azh.ai>
	// 3197 5971:aload_0         
	// 3198 5972:getfield        #12  <Field azh a>
	// 3199 5975:getfield        #184 <Field int azh.bf>
	// 3200 5978:ixor            
	// 3201 5979:putfield        #184 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 3202 5982:aload_0         
	// 3203 5983:getfield        #12  <Field azh a>
	// 3204 5986:astore_1        
		abyte0.aU = ((azh) (abyte0)).bf ^ a.aU;
	// 3205 5987:aload_1         
	// 3206 5988:aload_1         
	// 3207 5989:getfield        #184 <Field int azh.bf>
	// 3208 5992:aload_0         
	// 3209 5993:getfield        #12  <Field azh a>
	// 3210 5996:getfield        #334 <Field int azh.aU>
	// 3211 5999:ixor            
	// 3212 6000:putfield        #334 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 3213 6003:aload_0         
	// 3214 6004:getfield        #12  <Field azh a>
	// 3215 6007:astore_1        
		abyte0.d = ((azh) (abyte0)).aU ^ a.d;
	// 3216 6008:aload_1         
	// 3217 6009:aload_1         
	// 3218 6010:getfield        #334 <Field int azh.aU>
	// 3219 6013:aload_0         
	// 3220 6014:getfield        #12  <Field azh a>
	// 3221 6017:getfield        #337 <Field int azh.d>
	// 3222 6020:ixor            
	// 3223 6021:putfield        #337 <Field int azh.d>
		abyte0 = ((byte []) (a));
	// 3224 6024:aload_0         
	// 3225 6025:getfield        #12  <Field azh a>
	// 3226 6028:astore_1        
		abyte0.bR = ((azh) (abyte0)).bR & ~a.d;
	// 3227 6029:aload_1         
	// 3228 6030:aload_1         
	// 3229 6031:getfield        #340 <Field int azh.bR>
	// 3230 6034:aload_0         
	// 3231 6035:getfield        #12  <Field azh a>
	// 3232 6038:getfield        #337 <Field int azh.d>
	// 3233 6041:iconst_m1       
	// 3234 6042:ixor            
	// 3235 6043:iand            
	// 3236 6044:putfield        #340 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 3237 6047:aload_0         
	// 3238 6048:getfield        #12  <Field azh a>
	// 3239 6051:astore_1        
		abyte0.bR = ((azh) (abyte0)).J ^ a.bR;
	// 3240 6052:aload_1         
	// 3241 6053:aload_1         
	// 3242 6054:getfield        #343 <Field int azh.J>
	// 3243 6057:aload_0         
	// 3244 6058:getfield        #12  <Field azh a>
	// 3245 6061:getfield        #340 <Field int azh.bR>
	// 3246 6064:ixor            
	// 3247 6065:putfield        #340 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 3248 6068:aload_0         
	// 3249 6069:getfield        #12  <Field azh a>
	// 3250 6072:astore_1        
		abyte0.bR = ((azh) (abyte0)).bY & ~a.bR;
	// 3251 6073:aload_1         
	// 3252 6074:aload_1         
	// 3253 6075:getfield        #346 <Field int azh.bY>
	// 3254 6078:aload_0         
	// 3255 6079:getfield        #12  <Field azh a>
	// 3256 6082:getfield        #340 <Field int azh.bR>
	// 3257 6085:iconst_m1       
	// 3258 6086:ixor            
	// 3259 6087:iand            
	// 3260 6088:putfield        #340 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 3261 6091:aload_0         
	// 3262 6092:getfield        #12  <Field azh a>
	// 3263 6095:astore_1        
		abyte0.J = ((azh) (abyte0)).bM & ~a.d;
	// 3264 6096:aload_1         
	// 3265 6097:aload_1         
	// 3266 6098:getfield        #349 <Field int azh.bM>
	// 3267 6101:aload_0         
	// 3268 6102:getfield        #12  <Field azh a>
	// 3269 6105:getfield        #337 <Field int azh.d>
	// 3270 6108:iconst_m1       
	// 3271 6109:ixor            
	// 3272 6110:iand            
	// 3273 6111:putfield        #343 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 3274 6114:aload_0         
	// 3275 6115:getfield        #12  <Field azh a>
	// 3276 6118:astore_1        
		abyte0.J = ((azh) (abyte0)).t ^ a.J;
	// 3277 6119:aload_1         
	// 3278 6120:aload_1         
	// 3279 6121:getfield        #352 <Field int azh.t>
	// 3280 6124:aload_0         
	// 3281 6125:getfield        #12  <Field azh a>
	// 3282 6128:getfield        #343 <Field int azh.J>
	// 3283 6131:ixor            
	// 3284 6132:putfield        #343 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 3285 6135:aload_0         
	// 3286 6136:getfield        #12  <Field azh a>
	// 3287 6139:astore_1        
		abyte0.J = ((azh) (abyte0)).J & a.bY;
	// 3288 6140:aload_1         
	// 3289 6141:aload_1         
	// 3290 6142:getfield        #343 <Field int azh.J>
	// 3291 6145:aload_0         
	// 3292 6146:getfield        #12  <Field azh a>
	// 3293 6149:getfield        #346 <Field int azh.bY>
	// 3294 6152:iand            
	// 3295 6153:putfield        #343 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 3296 6156:aload_0         
	// 3297 6157:getfield        #12  <Field azh a>
	// 3298 6160:astore_1        
		abyte0.aU = ((azh) (abyte0)).X & a.d;
	// 3299 6161:aload_1         
	// 3300 6162:aload_1         
	// 3301 6163:getfield        #355 <Field int azh.X>
	// 3302 6166:aload_0         
	// 3303 6167:getfield        #12  <Field azh a>
	// 3304 6170:getfield        #337 <Field int azh.d>
	// 3305 6173:iand            
	// 3306 6174:putfield        #334 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 3307 6177:aload_0         
	// 3308 6178:getfield        #12  <Field azh a>
	// 3309 6181:astore_1        
		abyte0.aU = ((azh) (abyte0)).aU & ~a.aS;
	// 3310 6182:aload_1         
	// 3311 6183:aload_1         
	// 3312 6184:getfield        #334 <Field int azh.aU>
	// 3313 6187:aload_0         
	// 3314 6188:getfield        #12  <Field azh a>
	// 3315 6191:getfield        #47  <Field int azh.aS>
	// 3316 6194:iconst_m1       
	// 3317 6195:ixor            
	// 3318 6196:iand            
	// 3319 6197:putfield        #334 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 3320 6200:aload_0         
	// 3321 6201:getfield        #12  <Field azh a>
	// 3322 6204:astore_1        
		abyte0.bf = ((azh) (abyte0)).bE & a.d;
	// 3323 6205:aload_1         
	// 3324 6206:aload_1         
	// 3325 6207:getfield        #56  <Field int azh.bE>
	// 3326 6210:aload_0         
	// 3327 6211:getfield        #12  <Field azh a>
	// 3328 6214:getfield        #337 <Field int azh.d>
	// 3329 6217:iand            
	// 3330 6218:putfield        #184 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 3331 6221:aload_0         
	// 3332 6222:getfield        #12  <Field azh a>
	// 3333 6225:astore_1        
		abyte0.ai = ((azh) (abyte0)).X & a.bf;
	// 3334 6226:aload_1         
	// 3335 6227:aload_1         
	// 3336 6228:getfield        #355 <Field int azh.X>
	// 3337 6231:aload_0         
	// 3338 6232:getfield        #12  <Field azh a>
	// 3339 6235:getfield        #184 <Field int azh.bf>
	// 3340 6238:iand            
	// 3341 6239:putfield        #325 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 3342 6242:aload_0         
	// 3343 6243:getfield        #12  <Field azh a>
	// 3344 6246:astore_1        
		abyte0.ai = ((azh) (abyte0)).ai & ~a.aS;
	// 3345 6247:aload_1         
	// 3346 6248:aload_1         
	// 3347 6249:getfield        #325 <Field int azh.ai>
	// 3348 6252:aload_0         
	// 3349 6253:getfield        #12  <Field azh a>
	// 3350 6256:getfield        #47  <Field int azh.aS>
	// 3351 6259:iconst_m1       
	// 3352 6260:ixor            
	// 3353 6261:iand            
	// 3354 6262:putfield        #325 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 3355 6265:aload_0         
	// 3356 6266:getfield        #12  <Field azh a>
	// 3357 6269:astore_1        
		abyte0.bf = ((azh) (abyte0)).X & a.bf;
	// 3358 6270:aload_1         
	// 3359 6271:aload_1         
	// 3360 6272:getfield        #355 <Field int azh.X>
	// 3361 6275:aload_0         
	// 3362 6276:getfield        #12  <Field azh a>
	// 3363 6279:getfield        #184 <Field int azh.bf>
	// 3364 6282:iand            
	// 3365 6283:putfield        #184 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 3366 6286:aload_0         
	// 3367 6287:getfield        #12  <Field azh a>
	// 3368 6290:astore_1        
		abyte0.bG = ((azh) (abyte0)).d | a.bG;
	// 3369 6291:aload_1         
	// 3370 6292:aload_1         
	// 3371 6293:getfield        #337 <Field int azh.d>
	// 3372 6296:aload_0         
	// 3373 6297:getfield        #12  <Field azh a>
	// 3374 6300:getfield        #358 <Field int azh.bG>
	// 3375 6303:ior             
	// 3376 6304:putfield        #358 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 3377 6307:aload_0         
	// 3378 6308:getfield        #12  <Field azh a>
	// 3379 6311:astore_1        
		abyte0.bG = ((azh) (abyte0)).bt ^ a.bG;
	// 3380 6312:aload_1         
	// 3381 6313:aload_1         
	// 3382 6314:getfield        #361 <Field int azh.bt>
	// 3383 6317:aload_0         
	// 3384 6318:getfield        #12  <Field azh a>
	// 3385 6321:getfield        #358 <Field int azh.bG>
	// 3386 6324:ixor            
	// 3387 6325:putfield        #358 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 3388 6328:aload_0         
	// 3389 6329:getfield        #12  <Field azh a>
	// 3390 6332:astore_1        
		abyte0.r = ((azh) (abyte0)).d | a.r;
	// 3391 6333:aload_1         
	// 3392 6334:aload_1         
	// 3393 6335:getfield        #337 <Field int azh.d>
	// 3394 6338:aload_0         
	// 3395 6339:getfield        #12  <Field azh a>
	// 3396 6342:getfield        #364 <Field int azh.r>
	// 3397 6345:ior             
	// 3398 6346:putfield        #364 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 3399 6349:aload_0         
	// 3400 6350:getfield        #12  <Field azh a>
	// 3401 6353:astore_1        
		abyte0.r = ((azh) (abyte0)).bD ^ a.r;
	// 3402 6354:aload_1         
	// 3403 6355:aload_1         
	// 3404 6356:getfield        #367 <Field int azh.bD>
	// 3405 6359:aload_0         
	// 3406 6360:getfield        #12  <Field azh a>
	// 3407 6363:getfield        #364 <Field int azh.r>
	// 3408 6366:ixor            
	// 3409 6367:putfield        #364 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 3410 6370:aload_0         
	// 3411 6371:getfield        #12  <Field azh a>
	// 3412 6374:astore_1        
		abyte0.aE = ((azh) (abyte0)).aE & ~a.d;
	// 3413 6375:aload_1         
	// 3414 6376:aload_1         
	// 3415 6377:getfield        #370 <Field int azh.aE>
	// 3416 6380:aload_0         
	// 3417 6381:getfield        #12  <Field azh a>
	// 3418 6384:getfield        #337 <Field int azh.d>
	// 3419 6387:iconst_m1       
	// 3420 6388:ixor            
	// 3421 6389:iand            
	// 3422 6390:putfield        #370 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 3423 6393:aload_0         
	// 3424 6394:getfield        #12  <Field azh a>
	// 3425 6397:astore_1        
		abyte0.aE = ((azh) (abyte0)).aq ^ a.aE;
	// 3426 6398:aload_1         
	// 3427 6399:aload_1         
	// 3428 6400:getfield        #373 <Field int azh.aq>
	// 3429 6403:aload_0         
	// 3430 6404:getfield        #12  <Field azh a>
	// 3431 6407:getfield        #370 <Field int azh.aE>
	// 3432 6410:ixor            
	// 3433 6411:putfield        #370 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 3434 6414:aload_0         
	// 3435 6415:getfield        #12  <Field azh a>
	// 3436 6418:astore_1        
		abyte0.aE = ((azh) (abyte0)).bY & ~a.aE;
	// 3437 6419:aload_1         
	// 3438 6420:aload_1         
	// 3439 6421:getfield        #346 <Field int azh.bY>
	// 3440 6424:aload_0         
	// 3441 6425:getfield        #12  <Field azh a>
	// 3442 6428:getfield        #370 <Field int azh.aE>
	// 3443 6431:iconst_m1       
	// 3444 6432:ixor            
	// 3445 6433:iand            
	// 3446 6434:putfield        #370 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 3447 6437:aload_0         
	// 3448 6438:getfield        #12  <Field azh a>
	// 3449 6441:astore_1        
		abyte0.aE = ((azh) (abyte0)).bG ^ a.aE;
	// 3450 6442:aload_1         
	// 3451 6443:aload_1         
	// 3452 6444:getfield        #358 <Field int azh.bG>
	// 3453 6447:aload_0         
	// 3454 6448:getfield        #12  <Field azh a>
	// 3455 6451:getfield        #370 <Field int azh.aE>
	// 3456 6454:ixor            
	// 3457 6455:putfield        #370 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 3458 6458:aload_0         
	// 3459 6459:getfield        #12  <Field azh a>
	// 3460 6462:astore_1        
		abyte0.bG = ((azh) (abyte0)).bE & ~a.d;
	// 3461 6463:aload_1         
	// 3462 6464:aload_1         
	// 3463 6465:getfield        #56  <Field int azh.bE>
	// 3464 6468:aload_0         
	// 3465 6469:getfield        #12  <Field azh a>
	// 3466 6472:getfield        #337 <Field int azh.d>
	// 3467 6475:iconst_m1       
	// 3468 6476:ixor            
	// 3469 6477:iand            
	// 3470 6478:putfield        #358 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 3471 6481:aload_0         
	// 3472 6482:getfield        #12  <Field azh a>
	// 3473 6485:astore_1        
		abyte0.aq = ((azh) (abyte0)).X & a.bG;
	// 3474 6486:aload_1         
	// 3475 6487:aload_1         
	// 3476 6488:getfield        #355 <Field int azh.X>
	// 3477 6491:aload_0         
	// 3478 6492:getfield        #12  <Field azh a>
	// 3479 6495:getfield        #358 <Field int azh.bG>
	// 3480 6498:iand            
	// 3481 6499:putfield        #373 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 3482 6502:aload_0         
	// 3483 6503:getfield        #12  <Field azh a>
	// 3484 6506:astore_1        
		abyte0.bD = ((azh) (abyte0)).X & a.bG;
	// 3485 6507:aload_1         
	// 3486 6508:aload_1         
	// 3487 6509:getfield        #355 <Field int azh.X>
	// 3488 6512:aload_0         
	// 3489 6513:getfield        #12  <Field azh a>
	// 3490 6516:getfield        #358 <Field int azh.bG>
	// 3491 6519:iand            
	// 3492 6520:putfield        #367 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 3493 6523:aload_0         
	// 3494 6524:getfield        #12  <Field azh a>
	// 3495 6527:astore_1        
		abyte0.bf = ((azh) (abyte0)).bG ^ a.bf;
	// 3496 6528:aload_1         
	// 3497 6529:aload_1         
	// 3498 6530:getfield        #358 <Field int azh.bG>
	// 3499 6533:aload_0         
	// 3500 6534:getfield        #12  <Field azh a>
	// 3501 6537:getfield        #184 <Field int azh.bf>
	// 3502 6540:ixor            
	// 3503 6541:putfield        #184 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 3504 6544:aload_0         
	// 3505 6545:getfield        #12  <Field azh a>
	// 3506 6548:astore_1        
		abyte0.bf = ((azh) (abyte0)).bf & ~a.aS;
	// 3507 6549:aload_1         
	// 3508 6550:aload_1         
	// 3509 6551:getfield        #184 <Field int azh.bf>
	// 3510 6554:aload_0         
	// 3511 6555:getfield        #12  <Field azh a>
	// 3512 6558:getfield        #47  <Field int azh.aS>
	// 3513 6561:iconst_m1       
	// 3514 6562:ixor            
	// 3515 6563:iand            
	// 3516 6564:putfield        #184 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 3517 6567:aload_0         
	// 3518 6568:getfield        #12  <Field azh a>
	// 3519 6571:astore_1        
		abyte0.bG = ((azh) (abyte0)).d | a.bG;
	// 3520 6572:aload_1         
	// 3521 6573:aload_1         
	// 3522 6574:getfield        #337 <Field int azh.d>
	// 3523 6577:aload_0         
	// 3524 6578:getfield        #12  <Field azh a>
	// 3525 6581:getfield        #358 <Field int azh.bG>
	// 3526 6584:ior             
	// 3527 6585:putfield        #358 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 3528 6588:aload_0         
	// 3529 6589:getfield        #12  <Field azh a>
	// 3530 6592:astore_1        
		abyte0.bt = ((azh) (abyte0)).X & a.bG;
	// 3531 6593:aload_1         
	// 3532 6594:aload_1         
	// 3533 6595:getfield        #355 <Field int azh.X>
	// 3534 6598:aload_0         
	// 3535 6599:getfield        #12  <Field azh a>
	// 3536 6602:getfield        #358 <Field int azh.bG>
	// 3537 6605:iand            
	// 3538 6606:putfield        #361 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 3539 6609:aload_0         
	// 3540 6610:getfield        #12  <Field azh a>
	// 3541 6613:astore_1        
		abyte0.bG = ((azh) (abyte0)).X & a.bG;
	// 3542 6614:aload_1         
	// 3543 6615:aload_1         
	// 3544 6616:getfield        #355 <Field int azh.X>
	// 3545 6619:aload_0         
	// 3546 6620:getfield        #12  <Field azh a>
	// 3547 6623:getfield        #358 <Field int azh.bG>
	// 3548 6626:iand            
	// 3549 6627:putfield        #358 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 3550 6630:aload_0         
	// 3551 6631:getfield        #12  <Field azh a>
	// 3552 6634:astore_1        
		abyte0.bG = ((azh) (abyte0)).d ^ a.bG;
	// 3553 6635:aload_1         
	// 3554 6636:aload_1         
	// 3555 6637:getfield        #337 <Field int azh.d>
	// 3556 6640:aload_0         
	// 3557 6641:getfield        #12  <Field azh a>
	// 3558 6644:getfield        #358 <Field int azh.bG>
	// 3559 6647:ixor            
	// 3560 6648:putfield        #358 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 3561 6651:aload_0         
	// 3562 6652:getfield        #12  <Field azh a>
	// 3563 6655:astore_1        
		abyte0.aU = ((azh) (abyte0)).bG ^ a.aU;
	// 3564 6656:aload_1         
	// 3565 6657:aload_1         
	// 3566 6658:getfield        #358 <Field int azh.bG>
	// 3567 6661:aload_0         
	// 3568 6662:getfield        #12  <Field azh a>
	// 3569 6665:getfield        #334 <Field int azh.aU>
	// 3570 6668:ixor            
	// 3571 6669:putfield        #334 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 3572 6672:aload_0         
	// 3573 6673:getfield        #12  <Field azh a>
	// 3574 6676:astore_1        
		abyte0.bG = ((azh) (abyte0)).d & ~a.bE;
	// 3575 6677:aload_1         
	// 3576 6678:aload_1         
	// 3577 6679:getfield        #337 <Field int azh.d>
	// 3578 6682:aload_0         
	// 3579 6683:getfield        #12  <Field azh a>
	// 3580 6686:getfield        #56  <Field int azh.bE>
	// 3581 6689:iconst_m1       
	// 3582 6690:ixor            
	// 3583 6691:iand            
	// 3584 6692:putfield        #358 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 3585 6695:aload_0         
	// 3586 6696:getfield        #12  <Field azh a>
	// 3587 6699:astore_1        
		abyte0.aq = ((azh) (abyte0)).bG ^ a.aq;
	// 3588 6700:aload_1         
	// 3589 6701:aload_1         
	// 3590 6702:getfield        #358 <Field int azh.bG>
	// 3591 6705:aload_0         
	// 3592 6706:getfield        #12  <Field azh a>
	// 3593 6709:getfield        #373 <Field int azh.aq>
	// 3594 6712:ixor            
	// 3595 6713:putfield        #373 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 3596 6716:aload_0         
	// 3597 6717:getfield        #12  <Field azh a>
	// 3598 6720:astore_1        
		abyte0.aq = ((azh) (abyte0)).aS & a.aq;
	// 3599 6721:aload_1         
	// 3600 6722:aload_1         
	// 3601 6723:getfield        #47  <Field int azh.aS>
	// 3602 6726:aload_0         
	// 3603 6727:getfield        #12  <Field azh a>
	// 3604 6730:getfield        #373 <Field int azh.aq>
	// 3605 6733:iand            
	// 3606 6734:putfield        #373 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 3607 6737:aload_0         
	// 3608 6738:getfield        #12  <Field azh a>
	// 3609 6741:astore_1        
		abyte0.aq = ((azh) (abyte0)).d ^ a.aq;
	// 3610 6742:aload_1         
	// 3611 6743:aload_1         
	// 3612 6744:getfield        #337 <Field int azh.d>
	// 3613 6747:aload_0         
	// 3614 6748:getfield        #12  <Field azh a>
	// 3615 6751:getfield        #373 <Field int azh.aq>
	// 3616 6754:ixor            
	// 3617 6755:putfield        #373 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 3618 6758:aload_0         
	// 3619 6759:getfield        #12  <Field azh a>
	// 3620 6762:astore_1        
		abyte0.aq = ((azh) (abyte0)).P & a.aq;
	// 3621 6763:aload_1         
	// 3622 6764:aload_1         
	// 3623 6765:getfield        #376 <Field int azh.P>
	// 3624 6768:aload_0         
	// 3625 6769:getfield        #12  <Field azh a>
	// 3626 6772:getfield        #373 <Field int azh.aq>
	// 3627 6775:iand            
	// 3628 6776:putfield        #373 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 3629 6779:aload_0         
	// 3630 6780:getfield        #12  <Field azh a>
	// 3631 6783:astore_1        
		abyte0.aF = ((azh) (abyte0)).X & ~a.bG;
	// 3632 6784:aload_1         
	// 3633 6785:aload_1         
	// 3634 6786:getfield        #355 <Field int azh.X>
	// 3635 6789:aload_0         
	// 3636 6790:getfield        #12  <Field azh a>
	// 3637 6793:getfield        #358 <Field int azh.bG>
	// 3638 6796:iconst_m1       
	// 3639 6797:ixor            
	// 3640 6798:iand            
	// 3641 6799:putfield        #331 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 3642 6802:aload_0         
	// 3643 6803:getfield        #12  <Field azh a>
	// 3644 6806:astore_1        
		abyte0.g = ((azh) (abyte0)).bG & ~a.aS;
	// 3645 6807:aload_1         
	// 3646 6808:aload_1         
	// 3647 6809:getfield        #358 <Field int azh.bG>
	// 3648 6812:aload_0         
	// 3649 6813:getfield        #12  <Field azh a>
	// 3650 6816:getfield        #47  <Field int azh.aS>
	// 3651 6819:iconst_m1       
	// 3652 6820:ixor            
	// 3653 6821:iand            
	// 3654 6822:putfield        #145 <Field int azh.g>
		abyte0 = ((byte []) (a));
	// 3655 6825:aload_0         
	// 3656 6826:getfield        #12  <Field azh a>
	// 3657 6829:astore_1        
		abyte0.aa = ((azh) (abyte0)).d & ~a.bG;
	// 3658 6830:aload_1         
	// 3659 6831:aload_1         
	// 3660 6832:getfield        #337 <Field int azh.d>
	// 3661 6835:aload_0         
	// 3662 6836:getfield        #12  <Field azh a>
	// 3663 6839:getfield        #358 <Field int azh.bG>
	// 3664 6842:iconst_m1       
	// 3665 6843:ixor            
	// 3666 6844:iand            
	// 3667 6845:putfield        #328 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 3668 6848:aload_0         
	// 3669 6849:getfield        #12  <Field azh a>
	// 3670 6852:astore_1        
		abyte0.cm = ((azh) (abyte0)).X & ~a.aa;
	// 3671 6853:aload_1         
	// 3672 6854:aload_1         
	// 3673 6855:getfield        #355 <Field int azh.X>
	// 3674 6858:aload_0         
	// 3675 6859:getfield        #12  <Field azh a>
	// 3676 6862:getfield        #328 <Field int azh.aa>
	// 3677 6865:iconst_m1       
	// 3678 6866:ixor            
	// 3679 6867:iand            
	// 3680 6868:putfield        #322 <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 3681 6871:aload_0         
	// 3682 6872:getfield        #12  <Field azh a>
	// 3683 6875:astore_1        
		abyte0.cl = ((azh) (abyte0)).X & ~a.bG;
	// 3684 6876:aload_1         
	// 3685 6877:aload_1         
	// 3686 6878:getfield        #355 <Field int azh.X>
	// 3687 6881:aload_0         
	// 3688 6882:getfield        #12  <Field azh a>
	// 3689 6885:getfield        #358 <Field int azh.bG>
	// 3690 6888:iconst_m1       
	// 3691 6889:ixor            
	// 3692 6890:iand            
	// 3693 6891:putfield        #319 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 3694 6894:aload_0         
	// 3695 6895:getfield        #12  <Field azh a>
	// 3696 6898:astore_1        
		abyte0.cl = ((azh) (abyte0)).bG ^ a.cl;
	// 3697 6899:aload_1         
	// 3698 6900:aload_1         
	// 3699 6901:getfield        #358 <Field int azh.bG>
	// 3700 6904:aload_0         
	// 3701 6905:getfield        #12  <Field azh a>
	// 3702 6908:getfield        #319 <Field int azh.cl>
	// 3703 6911:ixor            
	// 3704 6912:putfield        #319 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 3705 6915:aload_0         
	// 3706 6916:getfield        #12  <Field azh a>
	// 3707 6919:astore_1        
		abyte0.cn = ((azh) (abyte0)).aS & ~a.cl;
	// 3708 6920:aload_1         
	// 3709 6921:aload_1         
	// 3710 6922:getfield        #47  <Field int azh.aS>
	// 3711 6925:aload_0         
	// 3712 6926:getfield        #12  <Field azh a>
	// 3713 6929:getfield        #319 <Field int azh.cl>
	// 3714 6932:iconst_m1       
	// 3715 6933:ixor            
	// 3716 6934:iand            
	// 3717 6935:putfield        #379 <Field int azh.cn>
		abyte0 = ((byte []) (a));
	// 3718 6938:aload_0         
	// 3719 6939:getfield        #12  <Field azh a>
	// 3720 6942:astore_1        
		abyte0.cn = ((azh) (abyte0)).cl ^ a.cn;
	// 3721 6943:aload_1         
	// 3722 6944:aload_1         
	// 3723 6945:getfield        #319 <Field int azh.cl>
	// 3724 6948:aload_0         
	// 3725 6949:getfield        #12  <Field azh a>
	// 3726 6952:getfield        #379 <Field int azh.cn>
	// 3727 6955:ixor            
	// 3728 6956:putfield        #379 <Field int azh.cn>
		abyte0 = ((byte []) (a));
	// 3729 6959:aload_0         
	// 3730 6960:getfield        #12  <Field azh a>
	// 3731 6963:astore_1        
		abyte0.cn = ((azh) (abyte0)).P & a.cn;
	// 3732 6964:aload_1         
	// 3733 6965:aload_1         
	// 3734 6966:getfield        #376 <Field int azh.P>
	// 3735 6969:aload_0         
	// 3736 6970:getfield        #12  <Field azh a>
	// 3737 6973:getfield        #379 <Field int azh.cn>
	// 3738 6976:iand            
	// 3739 6977:putfield        #379 <Field int azh.cn>
		abyte0 = ((byte []) (a));
	// 3740 6980:aload_0         
	// 3741 6981:getfield        #12  <Field azh a>
	// 3742 6984:astore_1        
		abyte0.g = ((azh) (abyte0)).cl ^ a.g;
	// 3743 6985:aload_1         
	// 3744 6986:aload_1         
	// 3745 6987:getfield        #319 <Field int azh.cl>
	// 3746 6990:aload_0         
	// 3747 6991:getfield        #12  <Field azh a>
	// 3748 6994:getfield        #145 <Field int azh.g>
	// 3749 6997:ixor            
	// 3750 6998:putfield        #145 <Field int azh.g>
		abyte0 = ((byte []) (a));
	// 3751 7001:aload_0         
	// 3752 7002:getfield        #12  <Field azh a>
	// 3753 7005:astore_1        
		abyte0.an = ((azh) (abyte0)).bG ^ a.an;
	// 3754 7006:aload_1         
	// 3755 7007:aload_1         
	// 3756 7008:getfield        #358 <Field int azh.bG>
	// 3757 7011:aload_0         
	// 3758 7012:getfield        #12  <Field azh a>
	// 3759 7015:getfield        #382 <Field int azh.an>
	// 3760 7018:ixor            
	// 3761 7019:putfield        #382 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 3762 7022:aload_0         
	// 3763 7023:getfield        #12  <Field azh a>
	// 3764 7026:astore_1        
		abyte0.an = ((azh) (abyte0)).P & ~a.an;
	// 3765 7027:aload_1         
	// 3766 7028:aload_1         
	// 3767 7029:getfield        #376 <Field int azh.P>
	// 3768 7032:aload_0         
	// 3769 7033:getfield        #12  <Field azh a>
	// 3770 7036:getfield        #382 <Field int azh.an>
	// 3771 7039:iconst_m1       
	// 3772 7040:ixor            
	// 3773 7041:iand            
	// 3774 7042:putfield        #382 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 3775 7045:aload_0         
	// 3776 7046:getfield        #12  <Field azh a>
	// 3777 7049:astore_1        
		abyte0.an = ((azh) (abyte0)).g ^ a.an;
	// 3778 7050:aload_1         
	// 3779 7051:aload_1         
	// 3780 7052:getfield        #145 <Field int azh.g>
	// 3781 7055:aload_0         
	// 3782 7056:getfield        #12  <Field azh a>
	// 3783 7059:getfield        #382 <Field int azh.an>
	// 3784 7062:ixor            
	// 3785 7063:putfield        #382 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 3786 7066:aload_0         
	// 3787 7067:getfield        #12  <Field azh a>
	// 3788 7070:astore_1        
		abyte0.an = ((azh) (abyte0)).af & ~a.an;
	// 3789 7071:aload_1         
	// 3790 7072:aload_1         
	// 3791 7073:getfield        #385 <Field int azh.af>
	// 3792 7076:aload_0         
	// 3793 7077:getfield        #12  <Field azh a>
	// 3794 7080:getfield        #382 <Field int azh.an>
	// 3795 7083:iconst_m1       
	// 3796 7084:ixor            
	// 3797 7085:iand            
	// 3798 7086:putfield        #382 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 3799 7089:aload_0         
	// 3800 7090:getfield        #12  <Field azh a>
	// 3801 7093:astore_1        
		abyte0.g = ((azh) (abyte0)).bE | a.d;
	// 3802 7094:aload_1         
	// 3803 7095:aload_1         
	// 3804 7096:getfield        #56  <Field int azh.bE>
	// 3805 7099:aload_0         
	// 3806 7100:getfield        #12  <Field azh a>
	// 3807 7103:getfield        #337 <Field int azh.d>
	// 3808 7106:ior             
	// 3809 7107:putfield        #145 <Field int azh.g>
		abyte0 = ((byte []) (a));
	// 3810 7110:aload_0         
	// 3811 7111:getfield        #12  <Field azh a>
	// 3812 7114:astore_1        
		abyte0.bG = ((azh) (abyte0)).g | a.aS;
	// 3813 7115:aload_1         
	// 3814 7116:aload_1         
	// 3815 7117:getfield        #145 <Field int azh.g>
	// 3816 7120:aload_0         
	// 3817 7121:getfield        #12  <Field azh a>
	// 3818 7124:getfield        #47  <Field int azh.aS>
	// 3819 7127:ior             
	// 3820 7128:putfield        #358 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 3821 7131:aload_0         
	// 3822 7132:getfield        #12  <Field azh a>
	// 3823 7135:astore_1        
		abyte0.g = ((azh) (abyte0)).X & ~a.g;
	// 3824 7136:aload_1         
	// 3825 7137:aload_1         
	// 3826 7138:getfield        #355 <Field int azh.X>
	// 3827 7141:aload_0         
	// 3828 7142:getfield        #12  <Field azh a>
	// 3829 7145:getfield        #145 <Field int azh.g>
	// 3830 7148:iconst_m1       
	// 3831 7149:ixor            
	// 3832 7150:iand            
	// 3833 7151:putfield        #145 <Field int azh.g>
		abyte0 = ((byte []) (a));
	// 3834 7154:aload_0         
	// 3835 7155:getfield        #12  <Field azh a>
	// 3836 7158:astore_1        
		abyte0.g = ((azh) (abyte0)).bE ^ a.g;
	// 3837 7159:aload_1         
	// 3838 7160:aload_1         
	// 3839 7161:getfield        #56  <Field int azh.bE>
	// 3840 7164:aload_0         
	// 3841 7165:getfield        #12  <Field azh a>
	// 3842 7168:getfield        #145 <Field int azh.g>
	// 3843 7171:ixor            
	// 3844 7172:putfield        #145 <Field int azh.g>
		abyte0 = ((byte []) (a));
	// 3845 7175:aload_0         
	// 3846 7176:getfield        #12  <Field azh a>
	// 3847 7179:astore_1        
		abyte0.cl = ((azh) (abyte0)).g & ~a.aS;
	// 3848 7180:aload_1         
	// 3849 7181:aload_1         
	// 3850 7182:getfield        #145 <Field int azh.g>
	// 3851 7185:aload_0         
	// 3852 7186:getfield        #12  <Field azh a>
	// 3853 7189:getfield        #47  <Field int azh.aS>
	// 3854 7192:iconst_m1       
	// 3855 7193:ixor            
	// 3856 7194:iand            
	// 3857 7195:putfield        #319 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 3858 7198:aload_0         
	// 3859 7199:getfield        #12  <Field azh a>
	// 3860 7202:astore_1        
		abyte0.cl = ((azh) (abyte0)).bE ^ a.cl;
	// 3861 7203:aload_1         
	// 3862 7204:aload_1         
	// 3863 7205:getfield        #56  <Field int azh.bE>
	// 3864 7208:aload_0         
	// 3865 7209:getfield        #12  <Field azh a>
	// 3866 7212:getfield        #319 <Field int azh.cl>
	// 3867 7215:ixor            
	// 3868 7216:putfield        #319 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 3869 7219:aload_0         
	// 3870 7220:getfield        #12  <Field azh a>
	// 3871 7223:astore_1        
		abyte0.cl = ((azh) (abyte0)).P & ~a.cl;
	// 3872 7224:aload_1         
	// 3873 7225:aload_1         
	// 3874 7226:getfield        #376 <Field int azh.P>
	// 3875 7229:aload_0         
	// 3876 7230:getfield        #12  <Field azh a>
	// 3877 7233:getfield        #319 <Field int azh.cl>
	// 3878 7236:iconst_m1       
	// 3879 7237:ixor            
	// 3880 7238:iand            
	// 3881 7239:putfield        #319 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 3882 7242:aload_0         
	// 3883 7243:getfield        #12  <Field azh a>
	// 3884 7246:astore_1        
		abyte0.co = ((azh) (abyte0)).X & a.d;
	// 3885 7247:aload_1         
	// 3886 7248:aload_1         
	// 3887 7249:getfield        #355 <Field int azh.X>
	// 3888 7252:aload_0         
	// 3889 7253:getfield        #12  <Field azh a>
	// 3890 7256:getfield        #337 <Field int azh.d>
	// 3891 7259:iand            
	// 3892 7260:putfield        #388 <Field int azh.co>
		abyte0 = ((byte []) (a));
	// 3893 7263:aload_0         
	// 3894 7264:getfield        #12  <Field azh a>
	// 3895 7267:astore_1        
		abyte0.co = ((azh) (abyte0)).aa ^ a.co;
	// 3896 7268:aload_1         
	// 3897 7269:aload_1         
	// 3898 7270:getfield        #328 <Field int azh.aa>
	// 3899 7273:aload_0         
	// 3900 7274:getfield        #12  <Field azh a>
	// 3901 7277:getfield        #388 <Field int azh.co>
	// 3902 7280:ixor            
	// 3903 7281:putfield        #388 <Field int azh.co>
		abyte0 = ((byte []) (a));
	// 3904 7284:aload_0         
	// 3905 7285:getfield        #12  <Field azh a>
	// 3906 7288:astore_1        
		abyte0.aa = ((azh) (abyte0)).co ^ a.aS;
	// 3907 7289:aload_1         
	// 3908 7290:aload_1         
	// 3909 7291:getfield        #388 <Field int azh.co>
	// 3910 7294:aload_0         
	// 3911 7295:getfield        #12  <Field azh a>
	// 3912 7298:getfield        #47  <Field int azh.aS>
	// 3913 7301:ixor            
	// 3914 7302:putfield        #328 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 3915 7305:aload_0         
	// 3916 7306:getfield        #12  <Field azh a>
	// 3917 7309:astore_1        
		abyte0.co = ((azh) (abyte0)).co | a.aS;
	// 3918 7310:aload_1         
	// 3919 7311:aload_1         
	// 3920 7312:getfield        #388 <Field int azh.co>
	// 3921 7315:aload_0         
	// 3922 7316:getfield        #12  <Field azh a>
	// 3923 7319:getfield        #47  <Field int azh.aS>
	// 3924 7322:ior             
	// 3925 7323:putfield        #388 <Field int azh.co>
		abyte0 = ((byte []) (a));
	// 3926 7326:aload_0         
	// 3927 7327:getfield        #12  <Field azh a>
	// 3928 7330:astore_1        
		abyte0.cp = ((azh) (abyte0)).X & a.d;
	// 3929 7331:aload_1         
	// 3930 7332:aload_1         
	// 3931 7333:getfield        #355 <Field int azh.X>
	// 3932 7336:aload_0         
	// 3933 7337:getfield        #12  <Field azh a>
	// 3934 7340:getfield        #337 <Field int azh.d>
	// 3935 7343:iand            
	// 3936 7344:putfield        #391 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 3937 7347:aload_0         
	// 3938 7348:getfield        #12  <Field azh a>
	// 3939 7351:astore_1        
		abyte0.cp = ((azh) (abyte0)).bE ^ a.cp;
	// 3940 7352:aload_1         
	// 3941 7353:aload_1         
	// 3942 7354:getfield        #56  <Field int azh.bE>
	// 3943 7357:aload_0         
	// 3944 7358:getfield        #12  <Field azh a>
	// 3945 7361:getfield        #391 <Field int azh.cp>
	// 3946 7364:ixor            
	// 3947 7365:putfield        #391 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 3948 7368:aload_0         
	// 3949 7369:getfield        #12  <Field azh a>
	// 3950 7372:astore_1        
		abyte0.bG = ((azh) (abyte0)).cp ^ a.bG;
	// 3951 7373:aload_1         
	// 3952 7374:aload_1         
	// 3953 7375:getfield        #391 <Field int azh.cp>
	// 3954 7378:aload_0         
	// 3955 7379:getfield        #12  <Field azh a>
	// 3956 7382:getfield        #358 <Field int azh.bG>
	// 3957 7385:ixor            
	// 3958 7386:putfield        #358 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 3959 7389:aload_0         
	// 3960 7390:getfield        #12  <Field azh a>
	// 3961 7393:astore_1        
		abyte0.bG = ((azh) (abyte0)).P & ~a.bG;
	// 3962 7394:aload_1         
	// 3963 7395:aload_1         
	// 3964 7396:getfield        #376 <Field int azh.P>
	// 3965 7399:aload_0         
	// 3966 7400:getfield        #12  <Field azh a>
	// 3967 7403:getfield        #358 <Field int azh.bG>
	// 3968 7406:iconst_m1       
	// 3969 7407:ixor            
	// 3970 7408:iand            
	// 3971 7409:putfield        #358 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 3972 7412:aload_0         
	// 3973 7413:getfield        #12  <Field azh a>
	// 3974 7416:astore_1        
		abyte0.ah = ((azh) (abyte0)).ah & ~a.d;
	// 3975 7417:aload_1         
	// 3976 7418:aload_1         
	// 3977 7419:getfield        #394 <Field int azh.ah>
	// 3978 7422:aload_0         
	// 3979 7423:getfield        #12  <Field azh a>
	// 3980 7426:getfield        #337 <Field int azh.d>
	// 3981 7429:iconst_m1       
	// 3982 7430:ixor            
	// 3983 7431:iand            
	// 3984 7432:putfield        #394 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 3985 7435:aload_0         
	// 3986 7436:getfield        #12  <Field azh a>
	// 3987 7439:astore_1        
		abyte0.ah = ((azh) (abyte0)).bP ^ a.ah;
	// 3988 7440:aload_1         
	// 3989 7441:aload_1         
	// 3990 7442:getfield        #397 <Field int azh.bP>
	// 3991 7445:aload_0         
	// 3992 7446:getfield        #12  <Field azh a>
	// 3993 7449:getfield        #394 <Field int azh.ah>
	// 3994 7452:ixor            
	// 3995 7453:putfield        #394 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 3996 7456:aload_0         
	// 3997 7457:getfield        #12  <Field azh a>
	// 3998 7460:astore_1        
		abyte0.bP = ((azh) (abyte0)).bE ^ a.d;
	// 3999 7461:aload_1         
	// 4000 7462:aload_1         
	// 4001 7463:getfield        #56  <Field int azh.bE>
	// 4002 7466:aload_0         
	// 4003 7467:getfield        #12  <Field azh a>
	// 4004 7470:getfield        #337 <Field int azh.d>
	// 4005 7473:ixor            
	// 4006 7474:putfield        #397 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 4007 7477:aload_0         
	// 4008 7478:getfield        #12  <Field azh a>
	// 4009 7481:astore_1        
		abyte0.cp = ((azh) (abyte0)).X & ~a.bP;
	// 4010 7482:aload_1         
	// 4011 7483:aload_1         
	// 4012 7484:getfield        #355 <Field int azh.X>
	// 4013 7487:aload_0         
	// 4014 7488:getfield        #12  <Field azh a>
	// 4015 7491:getfield        #397 <Field int azh.bP>
	// 4016 7494:iconst_m1       
	// 4017 7495:ixor            
	// 4018 7496:iand            
	// 4019 7497:putfield        #391 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 4020 7500:aload_0         
	// 4021 7501:getfield        #12  <Field azh a>
	// 4022 7504:astore_1        
		abyte0.cp = ((azh) (abyte0)).aS & a.cp;
	// 4023 7505:aload_1         
	// 4024 7506:aload_1         
	// 4025 7507:getfield        #47  <Field int azh.aS>
	// 4026 7510:aload_0         
	// 4027 7511:getfield        #12  <Field azh a>
	// 4028 7514:getfield        #391 <Field int azh.cp>
	// 4029 7517:iand            
	// 4030 7518:putfield        #391 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 4031 7521:aload_0         
	// 4032 7522:getfield        #12  <Field azh a>
	// 4033 7525:astore_1        
		abyte0.cp = ((azh) (abyte0)).d ^ a.cp;
	// 4034 7526:aload_1         
	// 4035 7527:aload_1         
	// 4036 7528:getfield        #337 <Field int azh.d>
	// 4037 7531:aload_0         
	// 4038 7532:getfield        #12  <Field azh a>
	// 4039 7535:getfield        #391 <Field int azh.cp>
	// 4040 7538:ixor            
	// 4041 7539:putfield        #391 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 4042 7542:aload_0         
	// 4043 7543:getfield        #12  <Field azh a>
	// 4044 7546:astore_1        
		abyte0.cp = ((azh) (abyte0)).P & ~a.cp;
	// 4045 7547:aload_1         
	// 4046 7548:aload_1         
	// 4047 7549:getfield        #376 <Field int azh.P>
	// 4048 7552:aload_0         
	// 4049 7553:getfield        #12  <Field azh a>
	// 4050 7556:getfield        #391 <Field int azh.cp>
	// 4051 7559:iconst_m1       
	// 4052 7560:ixor            
	// 4053 7561:iand            
	// 4054 7562:putfield        #391 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 4055 7565:aload_0         
	// 4056 7566:getfield        #12  <Field azh a>
	// 4057 7569:astore_1        
		abyte0.cp = ((azh) (abyte0)).aa ^ a.cp;
	// 4058 7570:aload_1         
	// 4059 7571:aload_1         
	// 4060 7572:getfield        #328 <Field int azh.aa>
	// 4061 7575:aload_0         
	// 4062 7576:getfield        #12  <Field azh a>
	// 4063 7579:getfield        #391 <Field int azh.cp>
	// 4064 7582:ixor            
	// 4065 7583:putfield        #391 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 4066 7586:aload_0         
	// 4067 7587:getfield        #12  <Field azh a>
	// 4068 7590:astore_1        
		abyte0.aa = ((azh) (abyte0)).bP & ~a.aS;
	// 4069 7591:aload_1         
	// 4070 7592:aload_1         
	// 4071 7593:getfield        #397 <Field int azh.bP>
	// 4072 7596:aload_0         
	// 4073 7597:getfield        #12  <Field azh a>
	// 4074 7600:getfield        #47  <Field int azh.aS>
	// 4075 7603:iconst_m1       
	// 4076 7604:ixor            
	// 4077 7605:iand            
	// 4078 7606:putfield        #328 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 4079 7609:aload_0         
	// 4080 7610:getfield        #12  <Field azh a>
	// 4081 7613:astore_1        
		abyte0.aa = ((azh) (abyte0)).g ^ a.aa;
	// 4082 7614:aload_1         
	// 4083 7615:aload_1         
	// 4084 7616:getfield        #145 <Field int azh.g>
	// 4085 7619:aload_0         
	// 4086 7620:getfield        #12  <Field azh a>
	// 4087 7623:getfield        #328 <Field int azh.aa>
	// 4088 7626:ixor            
	// 4089 7627:putfield        #328 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 4090 7630:aload_0         
	// 4091 7631:getfield        #12  <Field azh a>
	// 4092 7634:astore_1        
		abyte0.aa = ((azh) (abyte0)).P & a.aa;
	// 4093 7635:aload_1         
	// 4094 7636:aload_1         
	// 4095 7637:getfield        #376 <Field int azh.P>
	// 4096 7640:aload_0         
	// 4097 7641:getfield        #12  <Field azh a>
	// 4098 7644:getfield        #328 <Field int azh.aa>
	// 4099 7647:iand            
	// 4100 7648:putfield        #328 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 4101 7651:aload_0         
	// 4102 7652:getfield        #12  <Field azh a>
	// 4103 7655:astore_1        
		abyte0.aa = ((azh) (abyte0)).ai ^ a.aa;
	// 4104 7656:aload_1         
	// 4105 7657:aload_1         
	// 4106 7658:getfield        #325 <Field int azh.ai>
	// 4107 7661:aload_0         
	// 4108 7662:getfield        #12  <Field azh a>
	// 4109 7665:getfield        #328 <Field int azh.aa>
	// 4110 7668:ixor            
	// 4111 7669:putfield        #328 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 4112 7672:aload_0         
	// 4113 7673:getfield        #12  <Field azh a>
	// 4114 7676:astore_1        
		abyte0.aa = ((azh) (abyte0)).af & ~a.aa;
	// 4115 7677:aload_1         
	// 4116 7678:aload_1         
	// 4117 7679:getfield        #385 <Field int azh.af>
	// 4118 7682:aload_0         
	// 4119 7683:getfield        #12  <Field azh a>
	// 4120 7686:getfield        #328 <Field int azh.aa>
	// 4121 7689:iconst_m1       
	// 4122 7690:ixor            
	// 4123 7691:iand            
	// 4124 7692:putfield        #328 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 4125 7695:aload_0         
	// 4126 7696:getfield        #12  <Field azh a>
	// 4127 7699:astore_1        
		abyte0.cm = ((azh) (abyte0)).bP ^ a.cm;
	// 4128 7700:aload_1         
	// 4129 7701:aload_1         
	// 4130 7702:getfield        #397 <Field int azh.bP>
	// 4131 7705:aload_0         
	// 4132 7706:getfield        #12  <Field azh a>
	// 4133 7709:getfield        #322 <Field int azh.cm>
	// 4134 7712:ixor            
	// 4135 7713:putfield        #322 <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 4136 7716:aload_0         
	// 4137 7717:getfield        #12  <Field azh a>
	// 4138 7720:astore_1        
		abyte0.co = ((azh) (abyte0)).cm ^ a.co;
	// 4139 7721:aload_1         
	// 4140 7722:aload_1         
	// 4141 7723:getfield        #322 <Field int azh.cm>
	// 4142 7726:aload_0         
	// 4143 7727:getfield        #12  <Field azh a>
	// 4144 7730:getfield        #388 <Field int azh.co>
	// 4145 7733:ixor            
	// 4146 7734:putfield        #388 <Field int azh.co>
		abyte0 = ((byte []) (a));
	// 4147 7737:aload_0         
	// 4148 7738:getfield        #12  <Field azh a>
	// 4149 7741:astore_1        
		abyte0.aq = ((azh) (abyte0)).co ^ a.aq;
	// 4150 7742:aload_1         
	// 4151 7743:aload_1         
	// 4152 7744:getfield        #388 <Field int azh.co>
	// 4153 7747:aload_0         
	// 4154 7748:getfield        #12  <Field azh a>
	// 4155 7751:getfield        #373 <Field int azh.aq>
	// 4156 7754:ixor            
	// 4157 7755:putfield        #373 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 4158 7758:aload_0         
	// 4159 7759:getfield        #12  <Field azh a>
	// 4160 7762:astore_1        
		abyte0.aF = ((azh) (abyte0)).bP ^ a.aF;
	// 4161 7763:aload_1         
	// 4162 7764:aload_1         
	// 4163 7765:getfield        #397 <Field int azh.bP>
	// 4164 7768:aload_0         
	// 4165 7769:getfield        #12  <Field azh a>
	// 4166 7772:getfield        #331 <Field int azh.aF>
	// 4167 7775:ixor            
	// 4168 7776:putfield        #331 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 4169 7779:aload_0         
	// 4170 7780:getfield        #12  <Field azh a>
	// 4171 7783:astore_1        
		abyte0.bG = ((azh) (abyte0)).aF ^ a.bG;
	// 4172 7784:aload_1         
	// 4173 7785:aload_1         
	// 4174 7786:getfield        #331 <Field int azh.aF>
	// 4175 7789:aload_0         
	// 4176 7790:getfield        #12  <Field azh a>
	// 4177 7793:getfield        #358 <Field int azh.bG>
	// 4178 7796:ixor            
	// 4179 7797:putfield        #358 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 4180 7800:aload_0         
	// 4181 7801:getfield        #12  <Field azh a>
	// 4182 7804:astore_1        
		abyte0.bG = ((azh) (abyte0)).bG & a.af;
	// 4183 7805:aload_1         
	// 4184 7806:aload_1         
	// 4185 7807:getfield        #358 <Field int azh.bG>
	// 4186 7810:aload_0         
	// 4187 7811:getfield        #12  <Field azh a>
	// 4188 7814:getfield        #385 <Field int azh.af>
	// 4189 7817:iand            
	// 4190 7818:putfield        #358 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 4191 7821:aload_0         
	// 4192 7822:getfield        #12  <Field azh a>
	// 4193 7825:astore_1        
		abyte0.bG = ((azh) (abyte0)).cp ^ a.bG;
	// 4194 7826:aload_1         
	// 4195 7827:aload_1         
	// 4196 7828:getfield        #391 <Field int azh.cp>
	// 4197 7831:aload_0         
	// 4198 7832:getfield        #12  <Field azh a>
	// 4199 7835:getfield        #358 <Field int azh.bG>
	// 4200 7838:ixor            
	// 4201 7839:putfield        #358 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 4202 7842:aload_0         
	// 4203 7843:getfield        #12  <Field azh a>
	// 4204 7846:astore_1        
		abyte0.K = ((azh) (abyte0)).bG ^ a.K;
	// 4205 7847:aload_1         
	// 4206 7848:aload_1         
	// 4207 7849:getfield        #358 <Field int azh.bG>
	// 4208 7852:aload_0         
	// 4209 7853:getfield        #12  <Field azh a>
	// 4210 7856:getfield        #157 <Field int azh.K>
	// 4211 7859:ixor            
	// 4212 7860:putfield        #157 <Field int azh.K>
		abyte0 = ((byte []) (a));
	// 4213 7863:aload_0         
	// 4214 7864:getfield        #12  <Field azh a>
	// 4215 7867:astore_1        
		abyte0.bk = ((azh) (abyte0)).K | a.bk;
	// 4216 7868:aload_1         
	// 4217 7869:aload_1         
	// 4218 7870:getfield        #157 <Field int azh.K>
	// 4219 7873:aload_0         
	// 4220 7874:getfield        #12  <Field azh a>
	// 4221 7877:getfield        #163 <Field int azh.bk>
	// 4222 7880:ior             
	// 4223 7881:putfield        #163 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 4224 7884:aload_0         
	// 4225 7885:getfield        #12  <Field azh a>
	// 4226 7888:astore_1        
		abyte0.bk = ((azh) (abyte0)).bq ^ a.bk;
	// 4227 7889:aload_1         
	// 4228 7890:aload_1         
	// 4229 7891:getfield        #217 <Field int azh.bq>
	// 4230 7894:aload_0         
	// 4231 7895:getfield        #12  <Field azh a>
	// 4232 7898:getfield        #163 <Field int azh.bk>
	// 4233 7901:ixor            
	// 4234 7902:putfield        #163 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 4235 7905:aload_0         
	// 4236 7906:getfield        #12  <Field azh a>
	// 4237 7909:astore_1        
		abyte0.bk = ((azh) (abyte0)).bC & a.bk;
	// 4238 7910:aload_1         
	// 4239 7911:aload_1         
	// 4240 7912:getfield        #400 <Field int azh.bC>
	// 4241 7915:aload_0         
	// 4242 7916:getfield        #12  <Field azh a>
	// 4243 7919:getfield        #163 <Field int azh.bk>
	// 4244 7922:iand            
	// 4245 7923:putfield        #163 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 4246 7926:aload_0         
	// 4247 7927:getfield        #12  <Field azh a>
	// 4248 7930:astore_1        
		abyte0.aR = ((azh) (abyte0)).K | a.aR;
	// 4249 7931:aload_1         
	// 4250 7932:aload_1         
	// 4251 7933:getfield        #157 <Field int azh.K>
	// 4252 7936:aload_0         
	// 4253 7937:getfield        #12  <Field azh a>
	// 4254 7940:getfield        #247 <Field int azh.aR>
	// 4255 7943:ior             
	// 4256 7944:putfield        #247 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 4257 7947:aload_0         
	// 4258 7948:getfield        #12  <Field azh a>
	// 4259 7951:astore_1        
		abyte0.aR = ((azh) (abyte0)).aK ^ a.aR;
	// 4260 7952:aload_1         
	// 4261 7953:aload_1         
	// 4262 7954:getfield        #151 <Field int azh.aK>
	// 4263 7957:aload_0         
	// 4264 7958:getfield        #12  <Field azh a>
	// 4265 7961:getfield        #247 <Field int azh.aR>
	// 4266 7964:ixor            
	// 4267 7965:putfield        #247 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 4268 7968:aload_0         
	// 4269 7969:getfield        #12  <Field azh a>
	// 4270 7972:astore_1        
		abyte0.aK = ((azh) (abyte0)).K | a.cb;
	// 4271 7973:aload_1         
	// 4272 7974:aload_1         
	// 4273 7975:getfield        #157 <Field int azh.K>
	// 4274 7978:aload_0         
	// 4275 7979:getfield        #12  <Field azh a>
	// 4276 7982:getfield        #115 <Field int azh.cb>
	// 4277 7985:ior             
	// 4278 7986:putfield        #151 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 4279 7989:aload_0         
	// 4280 7990:getfield        #12  <Field azh a>
	// 4281 7993:astore_1        
		abyte0.aK = ((azh) (abyte0)).z ^ a.aK;
	// 4282 7994:aload_1         
	// 4283 7995:aload_1         
	// 4284 7996:getfield        #250 <Field int azh.z>
	// 4285 7999:aload_0         
	// 4286 8000:getfield        #12  <Field azh a>
	// 4287 8003:getfield        #151 <Field int azh.aK>
	// 4288 8006:ixor            
	// 4289 8007:putfield        #151 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 4290 8010:aload_0         
	// 4291 8011:getfield        #12  <Field azh a>
	// 4292 8014:astore_1        
		abyte0.aK = ((azh) (abyte0)).bC & ~a.aK;
	// 4293 8015:aload_1         
	// 4294 8016:aload_1         
	// 4295 8017:getfield        #400 <Field int azh.bC>
	// 4296 8020:aload_0         
	// 4297 8021:getfield        #12  <Field azh a>
	// 4298 8024:getfield        #151 <Field int azh.aK>
	// 4299 8027:iconst_m1       
	// 4300 8028:ixor            
	// 4301 8029:iand            
	// 4302 8030:putfield        #151 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 4303 8033:aload_0         
	// 4304 8034:getfield        #12  <Field azh a>
	// 4305 8037:astore_1        
		abyte0.by = ((azh) (abyte0)).K | a.by;
	// 4306 8038:aload_1         
	// 4307 8039:aload_1         
	// 4308 8040:getfield        #157 <Field int azh.K>
	// 4309 8043:aload_0         
	// 4310 8044:getfield        #12  <Field azh a>
	// 4311 8047:getfield        #244 <Field int azh.by>
	// 4312 8050:ior             
	// 4313 8051:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 4314 8054:aload_0         
	// 4315 8055:getfield        #12  <Field azh a>
	// 4316 8058:astore_1        
		abyte0.by = ((azh) (abyte0)).aD ^ a.by;
	// 4317 8059:aload_1         
	// 4318 8060:aload_1         
	// 4319 8061:getfield        #202 <Field int azh.aD>
	// 4320 8064:aload_0         
	// 4321 8065:getfield        #12  <Field azh a>
	// 4322 8068:getfield        #244 <Field int azh.by>
	// 4323 8071:ixor            
	// 4324 8072:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 4325 8075:aload_0         
	// 4326 8076:getfield        #12  <Field azh a>
	// 4327 8079:astore_1        
		abyte0.aW = ((azh) (abyte0)).K | a.aW;
	// 4328 8080:aload_1         
	// 4329 8081:aload_1         
	// 4330 8082:getfield        #157 <Field int azh.K>
	// 4331 8085:aload_0         
	// 4332 8086:getfield        #12  <Field azh a>
	// 4333 8089:getfield        #229 <Field int azh.aW>
	// 4334 8092:ior             
	// 4335 8093:putfield        #229 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 4336 8096:aload_0         
	// 4337 8097:getfield        #12  <Field azh a>
	// 4338 8100:astore_1        
		abyte0.aW = ((azh) (abyte0)).bq ^ a.aW;
	// 4339 8101:aload_1         
	// 4340 8102:aload_1         
	// 4341 8103:getfield        #217 <Field int azh.bq>
	// 4342 8106:aload_0         
	// 4343 8107:getfield        #12  <Field azh a>
	// 4344 8110:getfield        #229 <Field int azh.aW>
	// 4345 8113:ixor            
	// 4346 8114:putfield        #229 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 4347 8117:aload_0         
	// 4348 8118:getfield        #12  <Field azh a>
	// 4349 8121:astore_1        
		abyte0.aW = ((azh) (abyte0)).bC & ~a.aW;
	// 4350 8122:aload_1         
	// 4351 8123:aload_1         
	// 4352 8124:getfield        #400 <Field int azh.bC>
	// 4353 8127:aload_0         
	// 4354 8128:getfield        #12  <Field azh a>
	// 4355 8131:getfield        #229 <Field int azh.aW>
	// 4356 8134:iconst_m1       
	// 4357 8135:ixor            
	// 4358 8136:iand            
	// 4359 8137:putfield        #229 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 4360 8140:aload_0         
	// 4361 8141:getfield        #12  <Field azh a>
	// 4362 8144:astore_1        
		abyte0.aW = ((azh) (abyte0)).by ^ a.aW;
	// 4363 8145:aload_1         
	// 4364 8146:aload_1         
	// 4365 8147:getfield        #244 <Field int azh.by>
	// 4366 8150:aload_0         
	// 4367 8151:getfield        #12  <Field azh a>
	// 4368 8154:getfield        #229 <Field int azh.aW>
	// 4369 8157:ixor            
	// 4370 8158:putfield        #229 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 4371 8161:aload_0         
	// 4372 8162:getfield        #12  <Field azh a>
	// 4373 8165:astore_1        
		abyte0.by = ((azh) (abyte0)).bJ & ~a.K;
	// 4374 8166:aload_1         
	// 4375 8167:aload_1         
	// 4376 8168:getfield        #190 <Field int azh.bJ>
	// 4377 8171:aload_0         
	// 4378 8172:getfield        #12  <Field azh a>
	// 4379 8175:getfield        #157 <Field int azh.K>
	// 4380 8178:iconst_m1       
	// 4381 8179:ixor            
	// 4382 8180:iand            
	// 4383 8181:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 4384 8184:aload_0         
	// 4385 8185:getfield        #12  <Field azh a>
	// 4386 8188:astore_1        
		abyte0.by = ((azh) (abyte0)).aw ^ a.by;
	// 4387 8189:aload_1         
	// 4388 8190:aload_1         
	// 4389 8191:getfield        #232 <Field int azh.aw>
	// 4390 8194:aload_0         
	// 4391 8195:getfield        #12  <Field azh a>
	// 4392 8198:getfield        #244 <Field int azh.by>
	// 4393 8201:ixor            
	// 4394 8202:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 4395 8205:aload_0         
	// 4396 8206:getfield        #12  <Field azh a>
	// 4397 8209:astore_1        
		abyte0.aK = ((azh) (abyte0)).by ^ a.aK;
	// 4398 8210:aload_1         
	// 4399 8211:aload_1         
	// 4400 8212:getfield        #244 <Field int azh.by>
	// 4401 8215:aload_0         
	// 4402 8216:getfield        #12  <Field azh a>
	// 4403 8219:getfield        #151 <Field int azh.aK>
	// 4404 8222:ixor            
	// 4405 8223:putfield        #151 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 4406 8226:aload_0         
	// 4407 8227:getfield        #12  <Field azh a>
	// 4408 8230:astore_1        
		abyte0.bx = ((azh) (abyte0)).bx & ~a.K;
	// 4409 8231:aload_1         
	// 4410 8232:aload_1         
	// 4411 8233:getfield        #403 <Field int azh.bx>
	// 4412 8236:aload_0         
	// 4413 8237:getfield        #12  <Field azh a>
	// 4414 8240:getfield        #157 <Field int azh.K>
	// 4415 8243:iconst_m1       
	// 4416 8244:ixor            
	// 4417 8245:iand            
	// 4418 8246:putfield        #403 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 4419 8249:aload_0         
	// 4420 8250:getfield        #12  <Field azh a>
	// 4421 8253:astore_1        
		abyte0.bx = ((azh) (abyte0)).s ^ a.bx;
	// 4422 8254:aload_1         
	// 4423 8255:aload_1         
	// 4424 8256:getfield        #214 <Field int azh.s>
	// 4425 8259:aload_0         
	// 4426 8260:getfield        #12  <Field azh a>
	// 4427 8263:getfield        #403 <Field int azh.bx>
	// 4428 8266:ixor            
	// 4429 8267:putfield        #403 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 4430 8270:aload_0         
	// 4431 8271:getfield        #12  <Field azh a>
	// 4432 8274:astore_1        
		abyte0.bx = ((azh) (abyte0)).bs | a.bx;
	// 4433 8275:aload_1         
	// 4434 8276:aload_1         
	// 4435 8277:getfield        #205 <Field int azh.bs>
	// 4436 8280:aload_0         
	// 4437 8281:getfield        #12  <Field azh a>
	// 4438 8284:getfield        #403 <Field int azh.bx>
	// 4439 8287:ior             
	// 4440 8288:putfield        #403 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 4441 8291:aload_0         
	// 4442 8292:getfield        #12  <Field azh a>
	// 4443 8295:astore_1        
		abyte0.by = ((azh) (abyte0)).K | a.s;
	// 4444 8296:aload_1         
	// 4445 8297:aload_1         
	// 4446 8298:getfield        #157 <Field int azh.K>
	// 4447 8301:aload_0         
	// 4448 8302:getfield        #12  <Field azh a>
	// 4449 8305:getfield        #214 <Field int azh.s>
	// 4450 8308:ior             
	// 4451 8309:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 4452 8312:aload_0         
	// 4453 8313:getfield        #12  <Field azh a>
	// 4454 8316:astore_1        
		abyte0.by = ((azh) (abyte0)).u ^ a.by;
	// 4455 8317:aload_1         
	// 4456 8318:aload_1         
	// 4457 8319:getfield        #220 <Field int azh.u>
	// 4458 8322:aload_0         
	// 4459 8323:getfield        #12  <Field azh a>
	// 4460 8326:getfield        #244 <Field int azh.by>
	// 4461 8329:ixor            
	// 4462 8330:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 4463 8333:aload_0         
	// 4464 8334:getfield        #12  <Field azh a>
	// 4465 8337:astore_1        
		abyte0.by = ((azh) (abyte0)).bs & a.by;
	// 4466 8338:aload_1         
	// 4467 8339:aload_1         
	// 4468 8340:getfield        #205 <Field int azh.bs>
	// 4469 8343:aload_0         
	// 4470 8344:getfield        #12  <Field azh a>
	// 4471 8347:getfield        #244 <Field int azh.by>
	// 4472 8350:iand            
	// 4473 8351:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 4474 8354:aload_0         
	// 4475 8355:getfield        #12  <Field azh a>
	// 4476 8358:astore_1        
		abyte0.aD = ((azh) (abyte0)).K | a.aD;
	// 4477 8359:aload_1         
	// 4478 8360:aload_1         
	// 4479 8361:getfield        #157 <Field int azh.K>
	// 4480 8364:aload_0         
	// 4481 8365:getfield        #12  <Field azh a>
	// 4482 8368:getfield        #202 <Field int azh.aD>
	// 4483 8371:ior             
	// 4484 8372:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 4485 8375:aload_0         
	// 4486 8376:getfield        #12  <Field azh a>
	// 4487 8379:astore_1        
		abyte0.aD = ((azh) (abyte0)).aJ ^ a.aD;
	// 4488 8380:aload_1         
	// 4489 8381:aload_1         
	// 4490 8382:getfield        #241 <Field int azh.aJ>
	// 4491 8385:aload_0         
	// 4492 8386:getfield        #12  <Field azh a>
	// 4493 8389:getfield        #202 <Field int azh.aD>
	// 4494 8392:ixor            
	// 4495 8393:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 4496 8396:aload_0         
	// 4497 8397:getfield        #12  <Field azh a>
	// 4498 8400:astore_1        
		abyte0.aD = ((azh) (abyte0)).bC & a.aD;
	// 4499 8401:aload_1         
	// 4500 8402:aload_1         
	// 4501 8403:getfield        #400 <Field int azh.bC>
	// 4502 8406:aload_0         
	// 4503 8407:getfield        #12  <Field azh a>
	// 4504 8410:getfield        #202 <Field int azh.aD>
	// 4505 8413:iand            
	// 4506 8414:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 4507 8417:aload_0         
	// 4508 8418:getfield        #12  <Field azh a>
	// 4509 8421:astore_1        
		abyte0.aJ = ((azh) (abyte0)).bj & ~a.K;
	// 4510 8422:aload_1         
	// 4511 8423:aload_1         
	// 4512 8424:getfield        #406 <Field int azh.bj>
	// 4513 8427:aload_0         
	// 4514 8428:getfield        #12  <Field azh a>
	// 4515 8431:getfield        #157 <Field int azh.K>
	// 4516 8434:iconst_m1       
	// 4517 8435:ixor            
	// 4518 8436:iand            
	// 4519 8437:putfield        #241 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 4520 8440:aload_0         
	// 4521 8441:getfield        #12  <Field azh a>
	// 4522 8444:astore_1        
		abyte0.aJ = ((azh) (abyte0)).s ^ a.aJ;
	// 4523 8445:aload_1         
	// 4524 8446:aload_1         
	// 4525 8447:getfield        #214 <Field int azh.s>
	// 4526 8450:aload_0         
	// 4527 8451:getfield        #12  <Field azh a>
	// 4528 8454:getfield        #241 <Field int azh.aJ>
	// 4529 8457:ixor            
	// 4530 8458:putfield        #241 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 4531 8461:aload_0         
	// 4532 8462:getfield        #12  <Field azh a>
	// 4533 8465:astore_1        
		abyte0.bQ = ((azh) (abyte0)).K | a.bQ;
	// 4534 8466:aload_1         
	// 4535 8467:aload_1         
	// 4536 8468:getfield        #157 <Field int azh.K>
	// 4537 8471:aload_0         
	// 4538 8472:getfield        #12  <Field azh a>
	// 4539 8475:getfield        #100 <Field int azh.bQ>
	// 4540 8478:ior             
	// 4541 8479:putfield        #100 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 4542 8482:aload_0         
	// 4543 8483:getfield        #12  <Field azh a>
	// 4544 8486:astore_1        
		abyte0.bQ = ((azh) (abyte0)).cb ^ a.bQ;
	// 4545 8487:aload_1         
	// 4546 8488:aload_1         
	// 4547 8489:getfield        #115 <Field int azh.cb>
	// 4548 8492:aload_0         
	// 4549 8493:getfield        #12  <Field azh a>
	// 4550 8496:getfield        #100 <Field int azh.bQ>
	// 4551 8499:ixor            
	// 4552 8500:putfield        #100 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 4553 8503:aload_0         
	// 4554 8504:getfield        #12  <Field azh a>
	// 4555 8507:astore_1        
		abyte0.bp = ((azh) (abyte0)).K | a.bp;
	// 4556 8508:aload_1         
	// 4557 8509:aload_1         
	// 4558 8510:getfield        #157 <Field int azh.K>
	// 4559 8513:aload_0         
	// 4560 8514:getfield        #12  <Field azh a>
	// 4561 8517:getfield        #409 <Field int azh.bp>
	// 4562 8520:ior             
	// 4563 8521:putfield        #409 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 4564 8524:aload_0         
	// 4565 8525:getfield        #12  <Field azh a>
	// 4566 8528:astore_1        
		abyte0.bp = ((azh) (abyte0)).u ^ a.bp;
	// 4567 8529:aload_1         
	// 4568 8530:aload_1         
	// 4569 8531:getfield        #220 <Field int azh.u>
	// 4570 8534:aload_0         
	// 4571 8535:getfield        #12  <Field azh a>
	// 4572 8538:getfield        #409 <Field int azh.bp>
	// 4573 8541:ixor            
	// 4574 8542:putfield        #409 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 4575 8545:aload_0         
	// 4576 8546:getfield        #12  <Field azh a>
	// 4577 8549:astore_1        
		abyte0.l = ((azh) (abyte0)).bp ^ a.l;
	// 4578 8550:aload_1         
	// 4579 8551:aload_1         
	// 4580 8552:getfield        #409 <Field int azh.bp>
	// 4581 8555:aload_0         
	// 4582 8556:getfield        #12  <Field azh a>
	// 4583 8559:getfield        #112 <Field int azh.l>
	// 4584 8562:ixor            
	// 4585 8563:putfield        #112 <Field int azh.l>
		abyte0 = ((byte []) (a));
	// 4586 8566:aload_0         
	// 4587 8567:getfield        #12  <Field azh a>
	// 4588 8570:astore_1        
		abyte0.l = ((azh) (abyte0)).m & ~a.l;
	// 4589 8571:aload_1         
	// 4590 8572:aload_1         
	// 4591 8573:getfield        #124 <Field int azh.m>
	// 4592 8576:aload_0         
	// 4593 8577:getfield        #12  <Field azh a>
	// 4594 8580:getfield        #112 <Field int azh.l>
	// 4595 8583:iconst_m1       
	// 4596 8584:ixor            
	// 4597 8585:iand            
	// 4598 8586:putfield        #112 <Field int azh.l>
		abyte0 = ((byte []) (a));
	// 4599 8589:aload_0         
	// 4600 8590:getfield        #12  <Field azh a>
	// 4601 8593:astore_1        
		abyte0.cb = ((azh) (abyte0)).K | a.bK;
	// 4602 8594:aload_1         
	// 4603 8595:aload_1         
	// 4604 8596:getfield        #157 <Field int azh.K>
	// 4605 8599:aload_0         
	// 4606 8600:getfield        #12  <Field azh a>
	// 4607 8603:getfield        #412 <Field int azh.bK>
	// 4608 8606:ior             
	// 4609 8607:putfield        #115 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 4610 8610:aload_0         
	// 4611 8611:getfield        #12  <Field azh a>
	// 4612 8614:astore_1        
		abyte0.cb = ((azh) (abyte0)).bZ ^ a.cb;
	// 4613 8615:aload_1         
	// 4614 8616:aload_1         
	// 4615 8617:getfield        #415 <Field int azh.bZ>
	// 4616 8620:aload_0         
	// 4617 8621:getfield        #12  <Field azh a>
	// 4618 8624:getfield        #115 <Field int azh.cb>
	// 4619 8627:ixor            
	// 4620 8628:putfield        #115 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 4621 8631:aload_0         
	// 4622 8632:getfield        #12  <Field azh a>
	// 4623 8635:astore_1        
		abyte0.au = ((azh) (abyte0)).cb ^ a.au;
	// 4624 8636:aload_1         
	// 4625 8637:aload_1         
	// 4626 8638:getfield        #115 <Field int azh.cb>
	// 4627 8641:aload_0         
	// 4628 8642:getfield        #12  <Field azh a>
	// 4629 8645:getfield        #187 <Field int azh.au>
	// 4630 8648:ixor            
	// 4631 8649:putfield        #187 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 4632 8652:aload_0         
	// 4633 8653:getfield        #12  <Field azh a>
	// 4634 8656:astore_1        
		abyte0.au = ((azh) (abyte0)).m & ~a.au;
	// 4635 8657:aload_1         
	// 4636 8658:aload_1         
	// 4637 8659:getfield        #124 <Field int azh.m>
	// 4638 8662:aload_0         
	// 4639 8663:getfield        #12  <Field azh a>
	// 4640 8666:getfield        #187 <Field int azh.au>
	// 4641 8669:iconst_m1       
	// 4642 8670:ixor            
	// 4643 8671:iand            
	// 4644 8672:putfield        #187 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 4645 8675:aload_0         
	// 4646 8676:getfield        #12  <Field azh a>
	// 4647 8679:astore_1        
		abyte0.C = ((azh) (abyte0)).cb ^ a.C;
	// 4648 8680:aload_1         
	// 4649 8681:aload_1         
	// 4650 8682:getfield        #115 <Field int azh.cb>
	// 4651 8685:aload_0         
	// 4652 8686:getfield        #12  <Field azh a>
	// 4653 8689:getfield        #193 <Field int azh.C>
	// 4654 8692:ixor            
	// 4655 8693:putfield        #193 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 4656 8696:aload_0         
	// 4657 8697:getfield        #12  <Field azh a>
	// 4658 8700:astore_1        
		abyte0.cb = ((azh) (abyte0)).aT ^ a.K;
	// 4659 8701:aload_1         
	// 4660 8702:aload_1         
	// 4661 8703:getfield        #118 <Field int azh.aT>
	// 4662 8706:aload_0         
	// 4663 8707:getfield        #12  <Field azh a>
	// 4664 8710:getfield        #157 <Field int azh.K>
	// 4665 8713:ixor            
	// 4666 8714:putfield        #115 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 4667 8717:aload_0         
	// 4668 8718:getfield        #12  <Field azh a>
	// 4669 8721:astore_1        
		abyte0.cb = ((azh) (abyte0)).bC & ~a.cb;
	// 4670 8722:aload_1         
	// 4671 8723:aload_1         
	// 4672 8724:getfield        #400 <Field int azh.bC>
	// 4673 8727:aload_0         
	// 4674 8728:getfield        #12  <Field azh a>
	// 4675 8731:getfield        #115 <Field int azh.cb>
	// 4676 8734:iconst_m1       
	// 4677 8735:ixor            
	// 4678 8736:iand            
	// 4679 8737:putfield        #115 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 4680 8740:aload_0         
	// 4681 8741:getfield        #12  <Field azh a>
	// 4682 8744:astore_1        
		abyte0.cb = ((azh) (abyte0)).aT ^ a.cb;
	// 4683 8745:aload_1         
	// 4684 8746:aload_1         
	// 4685 8747:getfield        #118 <Field int azh.aT>
	// 4686 8750:aload_0         
	// 4687 8751:getfield        #12  <Field azh a>
	// 4688 8754:getfield        #115 <Field int azh.cb>
	// 4689 8757:ixor            
	// 4690 8758:putfield        #115 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 4691 8761:aload_0         
	// 4692 8762:getfield        #12  <Field azh a>
	// 4693 8765:astore_1        
		abyte0.aT = ((azh) (abyte0)).K | a.s;
	// 4694 8766:aload_1         
	// 4695 8767:aload_1         
	// 4696 8768:getfield        #157 <Field int azh.K>
	// 4697 8771:aload_0         
	// 4698 8772:getfield        #12  <Field azh a>
	// 4699 8775:getfield        #214 <Field int azh.s>
	// 4700 8778:ior             
	// 4701 8779:putfield        #118 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 4702 8782:aload_0         
	// 4703 8783:getfield        #12  <Field azh a>
	// 4704 8786:astore_1        
		abyte0.aT = ((azh) (abyte0)).e ^ a.aT;
	// 4705 8787:aload_1         
	// 4706 8788:aload_1         
	// 4707 8789:getfield        #77  <Field int azh.e>
	// 4708 8792:aload_0         
	// 4709 8793:getfield        #12  <Field azh a>
	// 4710 8796:getfield        #118 <Field int azh.aT>
	// 4711 8799:ixor            
	// 4712 8800:putfield        #118 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 4713 8803:aload_0         
	// 4714 8804:getfield        #12  <Field azh a>
	// 4715 8807:astore_1        
		abyte0.bZ = ((azh) (abyte0)).aT & ~a.bs;
	// 4716 8808:aload_1         
	// 4717 8809:aload_1         
	// 4718 8810:getfield        #118 <Field int azh.aT>
	// 4719 8813:aload_0         
	// 4720 8814:getfield        #12  <Field azh a>
	// 4721 8817:getfield        #205 <Field int azh.bs>
	// 4722 8820:iconst_m1       
	// 4723 8821:ixor            
	// 4724 8822:iand            
	// 4725 8823:putfield        #415 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 4726 8826:aload_0         
	// 4727 8827:getfield        #12  <Field azh a>
	// 4728 8830:astore_1        
		abyte0.bZ = ((azh) (abyte0)).e ^ a.bZ;
	// 4729 8831:aload_1         
	// 4730 8832:aload_1         
	// 4731 8833:getfield        #77  <Field int azh.e>
	// 4732 8836:aload_0         
	// 4733 8837:getfield        #12  <Field azh a>
	// 4734 8840:getfield        #415 <Field int azh.bZ>
	// 4735 8843:ixor            
	// 4736 8844:putfield        #415 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 4737 8847:aload_0         
	// 4738 8848:getfield        #12  <Field azh a>
	// 4739 8851:astore_1        
		abyte0.bZ = ((azh) (abyte0)).m & a.bZ;
	// 4740 8852:aload_1         
	// 4741 8853:aload_1         
	// 4742 8854:getfield        #124 <Field int azh.m>
	// 4743 8857:aload_0         
	// 4744 8858:getfield        #12  <Field azh a>
	// 4745 8861:getfield        #415 <Field int azh.bZ>
	// 4746 8864:iand            
	// 4747 8865:putfield        #415 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 4748 8868:aload_0         
	// 4749 8869:getfield        #12  <Field azh a>
	// 4750 8872:astore_1        
		abyte0.bx = ((azh) (abyte0)).aT ^ a.bx;
	// 4751 8873:aload_1         
	// 4752 8874:aload_1         
	// 4753 8875:getfield        #118 <Field int azh.aT>
	// 4754 8878:aload_0         
	// 4755 8879:getfield        #12  <Field azh a>
	// 4756 8882:getfield        #403 <Field int azh.bx>
	// 4757 8885:ixor            
	// 4758 8886:putfield        #403 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 4759 8889:aload_0         
	// 4760 8890:getfield        #12  <Field azh a>
	// 4761 8893:astore_1        
		abyte0.au = ((azh) (abyte0)).bx ^ a.au;
	// 4762 8894:aload_1         
	// 4763 8895:aload_1         
	// 4764 8896:getfield        #403 <Field int azh.bx>
	// 4765 8899:aload_0         
	// 4766 8900:getfield        #12  <Field azh a>
	// 4767 8903:getfield        #187 <Field int azh.au>
	// 4768 8906:ixor            
	// 4769 8907:putfield        #187 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 4770 8910:aload_0         
	// 4771 8911:getfield        #12  <Field azh a>
	// 4772 8914:astore_1        
		abyte0.bx = ((azh) (abyte0)).au & a.bu;
	// 4773 8915:aload_1         
	// 4774 8916:aload_1         
	// 4775 8917:getfield        #187 <Field int azh.au>
	// 4776 8920:aload_0         
	// 4777 8921:getfield        #12  <Field azh a>
	// 4778 8924:getfield        #418 <Field int azh.bu>
	// 4779 8927:iand            
	// 4780 8928:putfield        #403 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 4781 8931:aload_0         
	// 4782 8932:getfield        #12  <Field azh a>
	// 4783 8935:astore_1        
		abyte0.au = ((azh) (abyte0)).bu | a.au;
	// 4784 8936:aload_1         
	// 4785 8937:aload_1         
	// 4786 8938:getfield        #418 <Field int azh.bu>
	// 4787 8941:aload_0         
	// 4788 8942:getfield        #12  <Field azh a>
	// 4789 8945:getfield        #187 <Field int azh.au>
	// 4790 8948:ior             
	// 4791 8949:putfield        #187 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 4792 8952:aload_0         
	// 4793 8953:getfield        #12  <Field azh a>
	// 4794 8956:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aQ & a.K;
	// 4795 8957:aload_1         
	// 4796 8958:aload_1         
	// 4797 8959:getfield        #235 <Field int azh.aQ>
	// 4798 8962:aload_0         
	// 4799 8963:getfield        #12  <Field azh a>
	// 4800 8966:getfield        #157 <Field int azh.K>
	// 4801 8969:iand            
	// 4802 8970:putfield        #235 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 4803 8973:aload_0         
	// 4804 8974:getfield        #12  <Field azh a>
	// 4805 8977:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bC & ~a.aQ;
	// 4806 8978:aload_1         
	// 4807 8979:aload_1         
	// 4808 8980:getfield        #400 <Field int azh.bC>
	// 4809 8983:aload_0         
	// 4810 8984:getfield        #12  <Field azh a>
	// 4811 8987:getfield        #235 <Field int azh.aQ>
	// 4812 8990:iconst_m1       
	// 4813 8991:ixor            
	// 4814 8992:iand            
	// 4815 8993:putfield        #235 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 4816 8996:aload_0         
	// 4817 8997:getfield        #12  <Field azh a>
	// 4818 9000:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aR ^ a.aQ;
	// 4819 9001:aload_1         
	// 4820 9002:aload_1         
	// 4821 9003:getfield        #247 <Field int azh.aR>
	// 4822 9006:aload_0         
	// 4823 9007:getfield        #12  <Field azh a>
	// 4824 9010:getfield        #235 <Field int azh.aQ>
	// 4825 9013:ixor            
	// 4826 9014:putfield        #235 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 4827 9017:aload_0         
	// 4828 9018:getfield        #12  <Field azh a>
	// 4829 9021:astore_1        
		abyte0.bj = ((azh) (abyte0)).bj & ~a.K;
	// 4830 9022:aload_1         
	// 4831 9023:aload_1         
	// 4832 9024:getfield        #406 <Field int azh.bj>
	// 4833 9027:aload_0         
	// 4834 9028:getfield        #12  <Field azh a>
	// 4835 9031:getfield        #157 <Field int azh.K>
	// 4836 9034:iconst_m1       
	// 4837 9035:ixor            
	// 4838 9036:iand            
	// 4839 9037:putfield        #406 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 4840 9040:aload_0         
	// 4841 9041:getfield        #12  <Field azh a>
	// 4842 9044:astore_1        
		abyte0.bj = ((azh) (abyte0)).bK ^ a.bj;
	// 4843 9045:aload_1         
	// 4844 9046:aload_1         
	// 4845 9047:getfield        #412 <Field int azh.bK>
	// 4846 9050:aload_0         
	// 4847 9051:getfield        #12  <Field azh a>
	// 4848 9054:getfield        #406 <Field int azh.bj>
	// 4849 9057:ixor            
	// 4850 9058:putfield        #406 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 4851 9061:aload_0         
	// 4852 9062:getfield        #12  <Field azh a>
	// 4853 9065:astore_1        
		abyte0.bj = ((azh) (abyte0)).bs | a.bj;
	// 4854 9066:aload_1         
	// 4855 9067:aload_1         
	// 4856 9068:getfield        #205 <Field int azh.bs>
	// 4857 9071:aload_0         
	// 4858 9072:getfield        #12  <Field azh a>
	// 4859 9075:getfield        #406 <Field int azh.bj>
	// 4860 9078:ior             
	// 4861 9079:putfield        #406 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 4862 9082:aload_0         
	// 4863 9083:getfield        #12  <Field azh a>
	// 4864 9086:astore_1        
		abyte0.bj = ((azh) (abyte0)).aJ ^ a.bj;
	// 4865 9087:aload_1         
	// 4866 9088:aload_1         
	// 4867 9089:getfield        #241 <Field int azh.aJ>
	// 4868 9092:aload_0         
	// 4869 9093:getfield        #12  <Field azh a>
	// 4870 9096:getfield        #406 <Field int azh.bj>
	// 4871 9099:ixor            
	// 4872 9100:putfield        #406 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 4873 9103:aload_0         
	// 4874 9104:getfield        #12  <Field azh a>
	// 4875 9107:astore_1        
		abyte0.l = ((azh) (abyte0)).bj ^ a.l;
	// 4876 9108:aload_1         
	// 4877 9109:aload_1         
	// 4878 9110:getfield        #406 <Field int azh.bj>
	// 4879 9113:aload_0         
	// 4880 9114:getfield        #12  <Field azh a>
	// 4881 9117:getfield        #112 <Field int azh.l>
	// 4882 9120:ixor            
	// 4883 9121:putfield        #112 <Field int azh.l>
		abyte0 = ((byte []) (a));
	// 4884 9124:aload_0         
	// 4885 9125:getfield        #12  <Field azh a>
	// 4886 9128:astore_1        
		abyte0.bj = ((azh) (abyte0)).bu | a.l;
	// 4887 9129:aload_1         
	// 4888 9130:aload_1         
	// 4889 9131:getfield        #418 <Field int azh.bu>
	// 4890 9134:aload_0         
	// 4891 9135:getfield        #12  <Field azh a>
	// 4892 9138:getfield        #112 <Field int azh.l>
	// 4893 9141:ior             
	// 4894 9142:putfield        #406 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 4895 9145:aload_0         
	// 4896 9146:getfield        #12  <Field azh a>
	// 4897 9149:astore_1        
		abyte0.l = ((azh) (abyte0)).l & a.bu;
	// 4898 9150:aload_1         
	// 4899 9151:aload_1         
	// 4900 9152:getfield        #112 <Field int azh.l>
	// 4901 9155:aload_0         
	// 4902 9156:getfield        #12  <Field azh a>
	// 4903 9159:getfield        #418 <Field int azh.bu>
	// 4904 9162:iand            
	// 4905 9163:putfield        #112 <Field int azh.l>
		abyte0 = ((byte []) (a));
	// 4906 9166:aload_0         
	// 4907 9167:getfield        #12  <Field azh a>
	// 4908 9170:astore_1        
		abyte0.aJ = ((azh) (abyte0)).K | a.s;
	// 4909 9171:aload_1         
	// 4910 9172:aload_1         
	// 4911 9173:getfield        #157 <Field int azh.K>
	// 4912 9176:aload_0         
	// 4913 9177:getfield        #12  <Field azh a>
	// 4914 9180:getfield        #214 <Field int azh.s>
	// 4915 9183:ior             
	// 4916 9184:putfield        #241 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 4917 9187:aload_0         
	// 4918 9188:getfield        #12  <Field azh a>
	// 4919 9191:astore_1        
		abyte0.aJ = ((azh) (abyte0)).s ^ a.aJ;
	// 4920 9192:aload_1         
	// 4921 9193:aload_1         
	// 4922 9194:getfield        #214 <Field int azh.s>
	// 4923 9197:aload_0         
	// 4924 9198:getfield        #12  <Field azh a>
	// 4925 9201:getfield        #241 <Field int azh.aJ>
	// 4926 9204:ixor            
	// 4927 9205:putfield        #241 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 4928 9208:aload_0         
	// 4929 9209:getfield        #12  <Field azh a>
	// 4930 9212:astore_1        
		abyte0.s = ((azh) (abyte0)).aJ | a.bs;
	// 4931 9213:aload_1         
	// 4932 9214:aload_1         
	// 4933 9215:getfield        #241 <Field int azh.aJ>
	// 4934 9218:aload_0         
	// 4935 9219:getfield        #12  <Field azh a>
	// 4936 9222:getfield        #205 <Field int azh.bs>
	// 4937 9225:ior             
	// 4938 9226:putfield        #214 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 4939 9229:aload_0         
	// 4940 9230:getfield        #12  <Field azh a>
	// 4941 9233:astore_1        
		abyte0.s = ((azh) (abyte0)).bp ^ a.s;
	// 4942 9234:aload_1         
	// 4943 9235:aload_1         
	// 4944 9236:getfield        #409 <Field int azh.bp>
	// 4945 9239:aload_0         
	// 4946 9240:getfield        #12  <Field azh a>
	// 4947 9243:getfield        #214 <Field int azh.s>
	// 4948 9246:ixor            
	// 4949 9247:putfield        #214 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 4950 9250:aload_0         
	// 4951 9251:getfield        #12  <Field azh a>
	// 4952 9254:astore_1        
		abyte0.bZ = ((azh) (abyte0)).s ^ a.bZ;
	// 4953 9255:aload_1         
	// 4954 9256:aload_1         
	// 4955 9257:getfield        #214 <Field int azh.s>
	// 4956 9260:aload_0         
	// 4957 9261:getfield        #12  <Field azh a>
	// 4958 9264:getfield        #415 <Field int azh.bZ>
	// 4959 9267:ixor            
	// 4960 9268:putfield        #415 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 4961 9271:aload_0         
	// 4962 9272:getfield        #12  <Field azh a>
	// 4963 9275:astore_1        
		abyte0.bx = ((azh) (abyte0)).bZ ^ a.bx;
	// 4964 9276:aload_1         
	// 4965 9277:aload_1         
	// 4966 9278:getfield        #415 <Field int azh.bZ>
	// 4967 9281:aload_0         
	// 4968 9282:getfield        #12  <Field azh a>
	// 4969 9285:getfield        #403 <Field int azh.bx>
	// 4970 9288:ixor            
	// 4971 9289:putfield        #403 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 4972 9292:aload_0         
	// 4973 9293:getfield        #12  <Field azh a>
	// 4974 9296:astore_1        
		abyte0.ab = ((azh) (abyte0)).bx ^ a.ab;
	// 4975 9297:aload_1         
	// 4976 9298:aload_1         
	// 4977 9299:getfield        #403 <Field int azh.bx>
	// 4978 9302:aload_0         
	// 4979 9303:getfield        #12  <Field azh a>
	// 4980 9306:getfield        #421 <Field int azh.ab>
	// 4981 9309:ixor            
	// 4982 9310:putfield        #421 <Field int azh.ab>
		abyte0 = ((byte []) (a));
	// 4983 9313:aload_0         
	// 4984 9314:getfield        #12  <Field azh a>
	// 4985 9317:astore_1        
		abyte0.au = ((azh) (abyte0)).bZ ^ a.au;
	// 4986 9318:aload_1         
	// 4987 9319:aload_1         
	// 4988 9320:getfield        #415 <Field int azh.bZ>
	// 4989 9323:aload_0         
	// 4990 9324:getfield        #12  <Field azh a>
	// 4991 9327:getfield        #187 <Field int azh.au>
	// 4992 9330:ixor            
	// 4993 9331:putfield        #187 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 4994 9334:aload_0         
	// 4995 9335:getfield        #12  <Field azh a>
	// 4996 9338:astore_1        
		abyte0.al = ((azh) (abyte0)).au ^ a.al;
	// 4997 9339:aload_1         
	// 4998 9340:aload_1         
	// 4999 9341:getfield        #187 <Field int azh.au>
	// 5000 9344:aload_0         
	// 5001 9345:getfield        #12  <Field azh a>
	// 5002 9348:getfield        #71  <Field int azh.al>
	// 5003 9351:ixor            
	// 5004 9352:putfield        #71  <Field int azh.al>
		abyte0 = ((byte []) (a));
	// 5005 9355:aload_0         
	// 5006 9356:getfield        #12  <Field azh a>
	// 5007 9359:astore_1        
		abyte0.by = ((azh) (abyte0)).aJ ^ a.by;
	// 5008 9360:aload_1         
	// 5009 9361:aload_1         
	// 5010 9362:getfield        #241 <Field int azh.aJ>
	// 5011 9365:aload_0         
	// 5012 9366:getfield        #12  <Field azh a>
	// 5013 9369:getfield        #244 <Field int azh.by>
	// 5014 9372:ixor            
	// 5015 9373:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 5016 9376:aload_0         
	// 5017 9377:getfield        #12  <Field azh a>
	// 5018 9380:astore_1        
		abyte0.by = ((azh) (abyte0)).m & ~a.by;
	// 5019 9381:aload_1         
	// 5020 9382:aload_1         
	// 5021 9383:getfield        #124 <Field int azh.m>
	// 5022 9386:aload_0         
	// 5023 9387:getfield        #12  <Field azh a>
	// 5024 9390:getfield        #244 <Field int azh.by>
	// 5025 9393:iconst_m1       
	// 5026 9394:ixor            
	// 5027 9395:iand            
	// 5028 9396:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 5029 9399:aload_0         
	// 5030 9400:getfield        #12  <Field azh a>
	// 5031 9403:astore_1        
		abyte0.by = ((azh) (abyte0)).C ^ a.by;
	// 5032 9404:aload_1         
	// 5033 9405:aload_1         
	// 5034 9406:getfield        #193 <Field int azh.C>
	// 5035 9409:aload_0         
	// 5036 9410:getfield        #12  <Field azh a>
	// 5037 9413:getfield        #244 <Field int azh.by>
	// 5038 9416:ixor            
	// 5039 9417:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 5040 9420:aload_0         
	// 5041 9421:getfield        #12  <Field azh a>
	// 5042 9424:astore_1        
		abyte0.bj = ((azh) (abyte0)).by ^ a.bj;
	// 5043 9425:aload_1         
	// 5044 9426:aload_1         
	// 5045 9427:getfield        #244 <Field int azh.by>
	// 5046 9430:aload_0         
	// 5047 9431:getfield        #12  <Field azh a>
	// 5048 9434:getfield        #406 <Field int azh.bj>
	// 5049 9437:ixor            
	// 5050 9438:putfield        #406 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 5051 9441:aload_0         
	// 5052 9442:getfield        #12  <Field azh a>
	// 5053 9445:astore_1        
		abyte0.ax = ((azh) (abyte0)).bj ^ a.ax;
	// 5054 9446:aload_1         
	// 5055 9447:aload_1         
	// 5056 9448:getfield        #406 <Field int azh.bj>
	// 5057 9451:aload_0         
	// 5058 9452:getfield        #12  <Field azh a>
	// 5059 9455:getfield        #424 <Field int azh.ax>
	// 5060 9458:ixor            
	// 5061 9459:putfield        #424 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 5062 9462:aload_0         
	// 5063 9463:getfield        #12  <Field azh a>
	// 5064 9466:astore_1        
		abyte0.l = ((azh) (abyte0)).by ^ a.l;
	// 5065 9467:aload_1         
	// 5066 9468:aload_1         
	// 5067 9469:getfield        #244 <Field int azh.by>
	// 5068 9472:aload_0         
	// 5069 9473:getfield        #12  <Field azh a>
	// 5070 9476:getfield        #112 <Field int azh.l>
	// 5071 9479:ixor            
	// 5072 9480:putfield        #112 <Field int azh.l>
		abyte0 = ((byte []) (a));
	// 5073 9483:aload_0         
	// 5074 9484:getfield        #12  <Field azh a>
	// 5075 9487:astore_1        
		abyte0.l = ((azh) (abyte0)).l ^ a.X;
	// 5076 9488:aload_1         
	// 5077 9489:aload_1         
	// 5078 9490:getfield        #112 <Field int azh.l>
	// 5079 9493:aload_0         
	// 5080 9494:getfield        #12  <Field azh a>
	// 5081 9497:getfield        #355 <Field int azh.X>
	// 5082 9500:ixor            
	// 5083 9501:putfield        #112 <Field int azh.l>
		abyte0 = ((byte []) (a));
	// 5084 9504:aload_0         
	// 5085 9505:getfield        #12  <Field azh a>
	// 5086 9508:astore_1        
		abyte0.ao = ((azh) (abyte0)).K & ~a.ao;
	// 5087 9509:aload_1         
	// 5088 9510:aload_1         
	// 5089 9511:getfield        #157 <Field int azh.K>
	// 5090 9514:aload_0         
	// 5091 9515:getfield        #12  <Field azh a>
	// 5092 9518:getfield        #238 <Field int azh.ao>
	// 5093 9521:iconst_m1       
	// 5094 9522:ixor            
	// 5095 9523:iand            
	// 5096 9524:putfield        #238 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 5097 9527:aload_0         
	// 5098 9528:getfield        #12  <Field azh a>
	// 5099 9531:astore_1        
		abyte0.ao = ((azh) (abyte0)).bJ ^ a.ao;
	// 5100 9532:aload_1         
	// 5101 9533:aload_1         
	// 5102 9534:getfield        #190 <Field int azh.bJ>
	// 5103 9537:aload_0         
	// 5104 9538:getfield        #12  <Field azh a>
	// 5105 9541:getfield        #238 <Field int azh.ao>
	// 5106 9544:ixor            
	// 5107 9545:putfield        #238 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 5108 9548:aload_0         
	// 5109 9549:getfield        #12  <Field azh a>
	// 5110 9552:astore_1        
		abyte0.bk = ((azh) (abyte0)).ao ^ a.bk;
	// 5111 9553:aload_1         
	// 5112 9554:aload_1         
	// 5113 9555:getfield        #238 <Field int azh.ao>
	// 5114 9558:aload_0         
	// 5115 9559:getfield        #12  <Field azh a>
	// 5116 9562:getfield        #163 <Field int azh.bk>
	// 5117 9565:ixor            
	// 5118 9566:putfield        #163 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 5119 9569:aload_0         
	// 5120 9570:getfield        #12  <Field azh a>
	// 5121 9573:astore_1        
		abyte0.bn = ((azh) (abyte0)).bn & ~a.K;
	// 5122 9574:aload_1         
	// 5123 9575:aload_1         
	// 5124 9576:getfield        #226 <Field int azh.bn>
	// 5125 9579:aload_0         
	// 5126 9580:getfield        #12  <Field azh a>
	// 5127 9583:getfield        #157 <Field int azh.K>
	// 5128 9586:iconst_m1       
	// 5129 9587:ixor            
	// 5130 9588:iand            
	// 5131 9589:putfield        #226 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 5132 9592:aload_0         
	// 5133 9593:getfield        #12  <Field azh a>
	// 5134 9596:astore_1        
		abyte0.bn = ((azh) (abyte0)).bo ^ a.bn;
	// 5135 9597:aload_1         
	// 5136 9598:aload_1         
	// 5137 9599:getfield        #223 <Field int azh.bo>
	// 5138 9602:aload_0         
	// 5139 9603:getfield        #12  <Field azh a>
	// 5140 9606:getfield        #226 <Field int azh.bn>
	// 5141 9609:ixor            
	// 5142 9610:putfield        #226 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 5143 9613:aload_0         
	// 5144 9614:getfield        #12  <Field azh a>
	// 5145 9617:astore_1        
		abyte0.bn = ((azh) (abyte0)).bC & ~a.bn;
	// 5146 9618:aload_1         
	// 5147 9619:aload_1         
	// 5148 9620:getfield        #400 <Field int azh.bC>
	// 5149 9623:aload_0         
	// 5150 9624:getfield        #12  <Field azh a>
	// 5151 9627:getfield        #226 <Field int azh.bn>
	// 5152 9630:iconst_m1       
	// 5153 9631:ixor            
	// 5154 9632:iand            
	// 5155 9633:putfield        #226 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 5156 9636:aload_0         
	// 5157 9637:getfield        #12  <Field azh a>
	// 5158 9640:astore_1        
		abyte0.bJ = ((azh) (abyte0)).K | a.bJ;
	// 5159 9641:aload_1         
	// 5160 9642:aload_1         
	// 5161 9643:getfield        #157 <Field int azh.K>
	// 5162 9646:aload_0         
	// 5163 9647:getfield        #12  <Field azh a>
	// 5164 9650:getfield        #190 <Field int azh.bJ>
	// 5165 9653:ior             
	// 5166 9654:putfield        #190 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 5167 9657:aload_0         
	// 5168 9658:getfield        #12  <Field azh a>
	// 5169 9661:astore_1        
		abyte0.bJ = ((azh) (abyte0)).ae ^ a.bJ;
	// 5170 9662:aload_1         
	// 5171 9663:aload_1         
	// 5172 9664:getfield        #208 <Field int azh.ae>
	// 5173 9667:aload_0         
	// 5174 9668:getfield        #12  <Field azh a>
	// 5175 9671:getfield        #190 <Field int azh.bJ>
	// 5176 9674:ixor            
	// 5177 9675:putfield        #190 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 5178 9678:aload_0         
	// 5179 9679:getfield        #12  <Field azh a>
	// 5180 9682:astore_1        
		abyte0.aD = ((azh) (abyte0)).bJ ^ a.aD;
	// 5181 9683:aload_1         
	// 5182 9684:aload_1         
	// 5183 9685:getfield        #190 <Field int azh.bJ>
	// 5184 9688:aload_0         
	// 5185 9689:getfield        #12  <Field azh a>
	// 5186 9692:getfield        #202 <Field int azh.aD>
	// 5187 9695:ixor            
	// 5188 9696:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 5189 9699:aload_0         
	// 5190 9700:getfield        #12  <Field azh a>
	// 5191 9703:astore_1        
		abyte0.bS = ((azh) (abyte0)).bS & ~a.K;
	// 5192 9704:aload_1         
	// 5193 9705:aload_1         
	// 5194 9706:getfield        #103 <Field int azh.bS>
	// 5195 9709:aload_0         
	// 5196 9710:getfield        #12  <Field azh a>
	// 5197 9713:getfield        #157 <Field int azh.K>
	// 5198 9716:iconst_m1       
	// 5199 9717:ixor            
	// 5200 9718:iand            
	// 5201 9719:putfield        #103 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 5202 9722:aload_0         
	// 5203 9723:getfield        #12  <Field azh a>
	// 5204 9726:astore_1        
		abyte0.bS = ((azh) (abyte0)).bC & ~a.bS;
	// 5205 9727:aload_1         
	// 5206 9728:aload_1         
	// 5207 9729:getfield        #400 <Field int azh.bC>
	// 5208 9732:aload_0         
	// 5209 9733:getfield        #12  <Field azh a>
	// 5210 9736:getfield        #103 <Field int azh.bS>
	// 5211 9739:iconst_m1       
	// 5212 9740:ixor            
	// 5213 9741:iand            
	// 5214 9742:putfield        #103 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 5215 9745:aload_0         
	// 5216 9746:getfield        #12  <Field azh a>
	// 5217 9749:astore_1        
		abyte0.bS = ((azh) (abyte0)).bQ ^ a.bS;
	// 5218 9750:aload_1         
	// 5219 9751:aload_1         
	// 5220 9752:getfield        #100 <Field int azh.bQ>
	// 5221 9755:aload_0         
	// 5222 9756:getfield        #12  <Field azh a>
	// 5223 9759:getfield        #103 <Field int azh.bS>
	// 5224 9762:ixor            
	// 5225 9763:putfield        #103 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 5226 9766:aload_0         
	// 5227 9767:getfield        #12  <Field azh a>
	// 5228 9770:astore_1        
		abyte0.bt = ((azh) (abyte0)).bP ^ a.bt;
	// 5229 9771:aload_1         
	// 5230 9772:aload_1         
	// 5231 9773:getfield        #397 <Field int azh.bP>
	// 5232 9776:aload_0         
	// 5233 9777:getfield        #12  <Field azh a>
	// 5234 9780:getfield        #361 <Field int azh.bt>
	// 5235 9783:ixor            
	// 5236 9784:putfield        #361 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 5237 9787:aload_0         
	// 5238 9788:getfield        #12  <Field azh a>
	// 5239 9791:astore_1        
		abyte0.bf = ((azh) (abyte0)).bt ^ a.bf;
	// 5240 9792:aload_1         
	// 5241 9793:aload_1         
	// 5242 9794:getfield        #361 <Field int azh.bt>
	// 5243 9797:aload_0         
	// 5244 9798:getfield        #12  <Field azh a>
	// 5245 9801:getfield        #184 <Field int azh.bf>
	// 5246 9804:ixor            
	// 5247 9805:putfield        #184 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 5248 9808:aload_0         
	// 5249 9809:getfield        #12  <Field azh a>
	// 5250 9812:astore_1        
		abyte0.cl = ((azh) (abyte0)).bf ^ a.cl;
	// 5251 9813:aload_1         
	// 5252 9814:aload_1         
	// 5253 9815:getfield        #184 <Field int azh.bf>
	// 5254 9818:aload_0         
	// 5255 9819:getfield        #12  <Field azh a>
	// 5256 9822:getfield        #319 <Field int azh.cl>
	// 5257 9825:ixor            
	// 5258 9826:putfield        #319 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 5259 9829:aload_0         
	// 5260 9830:getfield        #12  <Field azh a>
	// 5261 9833:astore_1        
		abyte0.aa = ((azh) (abyte0)).cl ^ a.aa;
	// 5262 9834:aload_1         
	// 5263 9835:aload_1         
	// 5264 9836:getfield        #319 <Field int azh.cl>
	// 5265 9839:aload_0         
	// 5266 9840:getfield        #12  <Field azh a>
	// 5267 9843:getfield        #328 <Field int azh.aa>
	// 5268 9846:ixor            
	// 5269 9847:putfield        #328 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 5270 9850:aload_0         
	// 5271 9851:getfield        #12  <Field azh a>
	// 5272 9854:astore_1        
		abyte0.bb = ((azh) (abyte0)).aa ^ a.bb;
	// 5273 9855:aload_1         
	// 5274 9856:aload_1         
	// 5275 9857:getfield        #328 <Field int azh.aa>
	// 5276 9860:aload_0         
	// 5277 9861:getfield        #12  <Field azh a>
	// 5278 9864:getfield        #427 <Field int azh.bb>
	// 5279 9867:ixor            
	// 5280 9868:putfield        #427 <Field int azh.bb>
		abyte0 = ((byte []) (a));
	// 5281 9871:aload_0         
	// 5282 9872:getfield        #12  <Field azh a>
	// 5283 9875:astore_1        
		abyte0.at = ((azh) (abyte0)).bb ^ a.at;
	// 5284 9876:aload_1         
	// 5285 9877:aload_1         
	// 5286 9878:getfield        #427 <Field int azh.bb>
	// 5287 9881:aload_0         
	// 5288 9882:getfield        #12  <Field azh a>
	// 5289 9885:getfield        #430 <Field int azh.at>
	// 5290 9888:ixor            
	// 5291 9889:putfield        #430 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 5292 9892:aload_0         
	// 5293 9893:getfield        #12  <Field azh a>
	// 5294 9896:astore_1        
		abyte0.at = ((azh) (abyte0)).at & ~a.c;
	// 5295 9897:aload_1         
	// 5296 9898:aload_1         
	// 5297 9899:getfield        #430 <Field int azh.at>
	// 5298 9902:aload_0         
	// 5299 9903:getfield        #12  <Field azh a>
	// 5300 9906:getfield        #433 <Field int azh.c>
	// 5301 9909:iconst_m1       
	// 5302 9910:ixor            
	// 5303 9911:iand            
	// 5304 9912:putfield        #430 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 5305 9915:aload_0         
	// 5306 9916:getfield        #12  <Field azh a>
	// 5307 9919:astore_1        
		abyte0.aa = ((azh) (abyte0)).k & ~a.bb;
	// 5308 9920:aload_1         
	// 5309 9921:aload_1         
	// 5310 9922:getfield        #436 <Field int azh.k>
	// 5311 9925:aload_0         
	// 5312 9926:getfield        #12  <Field azh a>
	// 5313 9929:getfield        #427 <Field int azh.bb>
	// 5314 9932:iconst_m1       
	// 5315 9933:ixor            
	// 5316 9934:iand            
	// 5317 9935:putfield        #328 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 5318 9938:aload_0         
	// 5319 9939:getfield        #12  <Field azh a>
	// 5320 9942:astore_1        
		abyte0.aa = ((azh) (abyte0)).bb ^ a.aa;
	// 5321 9943:aload_1         
	// 5322 9944:aload_1         
	// 5323 9945:getfield        #427 <Field int azh.bb>
	// 5324 9948:aload_0         
	// 5325 9949:getfield        #12  <Field azh a>
	// 5326 9952:getfield        #328 <Field int azh.aa>
	// 5327 9955:ixor            
	// 5328 9956:putfield        #328 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 5329 9959:aload_0         
	// 5330 9960:getfield        #12  <Field azh a>
	// 5331 9963:astore_1        
		abyte0.aa = ((azh) (abyte0)).A & a.aa;
	// 5332 9964:aload_1         
	// 5333 9965:aload_1         
	// 5334 9966:getfield        #74  <Field int azh.A>
	// 5335 9969:aload_0         
	// 5336 9970:getfield        #12  <Field azh a>
	// 5337 9973:getfield        #328 <Field int azh.aa>
	// 5338 9976:iand            
	// 5339 9977:putfield        #328 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 5340 9980:aload_0         
	// 5341 9981:getfield        #12  <Field azh a>
	// 5342 9984:astore_1        
		abyte0.cl = ((azh) (abyte0)).k & ~a.bb;
	// 5343 9985:aload_1         
	// 5344 9986:aload_1         
	// 5345 9987:getfield        #436 <Field int azh.k>
	// 5346 9990:aload_0         
	// 5347 9991:getfield        #12  <Field azh a>
	// 5348 9994:getfield        #427 <Field int azh.bb>
	// 5349 9997:iconst_m1       
	// 5350 9998:ixor            
	// 5351 9999:iand            
	// 5352 10000:putfield        #319 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 5353 10003:aload_0         
	// 5354 10004:getfield        #12  <Field azh a>
	// 5355 10007:astore_1        
		abyte0.bf = ((azh) (abyte0)).I ^ a.bb;
	// 5356 10008:aload_1         
	// 5357 10009:aload_1         
	// 5358 10010:getfield        #79  <Field int azh.I>
	// 5359 10013:aload_0         
	// 5360 10014:getfield        #12  <Field azh a>
	// 5361 10017:getfield        #427 <Field int azh.bb>
	// 5362 10020:ixor            
	// 5363 10021:putfield        #184 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 5364 10024:aload_0         
	// 5365 10025:getfield        #12  <Field azh a>
	// 5366 10028:astore_1        
		abyte0.bt = ((azh) (abyte0)).k & ~a.bf;
	// 5367 10029:aload_1         
	// 5368 10030:aload_1         
	// 5369 10031:getfield        #436 <Field int azh.k>
	// 5370 10034:aload_0         
	// 5371 10035:getfield        #12  <Field azh a>
	// 5372 10038:getfield        #184 <Field int azh.bf>
	// 5373 10041:iconst_m1       
	// 5374 10042:ixor            
	// 5375 10043:iand            
	// 5376 10044:putfield        #361 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 5377 10047:aload_0         
	// 5378 10048:getfield        #12  <Field azh a>
	// 5379 10051:astore_1        
		abyte0.bQ = ((azh) (abyte0)).k & a.bb;
	// 5380 10052:aload_1         
	// 5381 10053:aload_1         
	// 5382 10054:getfield        #436 <Field int azh.k>
	// 5383 10057:aload_0         
	// 5384 10058:getfield        #12  <Field azh a>
	// 5385 10061:getfield        #427 <Field int azh.bb>
	// 5386 10064:iand            
	// 5387 10065:putfield        #100 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 5388 10068:aload_0         
	// 5389 10069:getfield        #12  <Field azh a>
	// 5390 10072:astore_1        
		abyte0.bJ = ((azh) (abyte0)).A & ~a.bb;
	// 5391 10073:aload_1         
	// 5392 10074:aload_1         
	// 5393 10075:getfield        #74  <Field int azh.A>
	// 5394 10078:aload_0         
	// 5395 10079:getfield        #12  <Field azh a>
	// 5396 10082:getfield        #427 <Field int azh.bb>
	// 5397 10085:iconst_m1       
	// 5398 10086:ixor            
	// 5399 10087:iand            
	// 5400 10088:putfield        #190 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 5401 10091:aload_0         
	// 5402 10092:getfield        #12  <Field azh a>
	// 5403 10095:astore_1        
		abyte0.bo = ((azh) (abyte0)).I | a.bb;
	// 5404 10096:aload_1         
	// 5405 10097:aload_1         
	// 5406 10098:getfield        #79  <Field int azh.I>
	// 5407 10101:aload_0         
	// 5408 10102:getfield        #12  <Field azh a>
	// 5409 10105:getfield        #427 <Field int azh.bb>
	// 5410 10108:ior             
	// 5411 10109:putfield        #223 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 5412 10112:aload_0         
	// 5413 10113:getfield        #12  <Field azh a>
	// 5414 10116:astore_1        
		abyte0.at = ((azh) (abyte0)).bo ^ a.at;
	// 5415 10117:aload_1         
	// 5416 10118:aload_1         
	// 5417 10119:getfield        #223 <Field int azh.bo>
	// 5418 10122:aload_0         
	// 5419 10123:getfield        #12  <Field azh a>
	// 5420 10126:getfield        #430 <Field int azh.at>
	// 5421 10129:ixor            
	// 5422 10130:putfield        #430 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 5423 10133:aload_0         
	// 5424 10134:getfield        #12  <Field azh a>
	// 5425 10137:astore_1        
		abyte0.at = ((azh) (abyte0)).A & a.at;
	// 5426 10138:aload_1         
	// 5427 10139:aload_1         
	// 5428 10140:getfield        #74  <Field int azh.A>
	// 5429 10143:aload_0         
	// 5430 10144:getfield        #12  <Field azh a>
	// 5431 10147:getfield        #430 <Field int azh.at>
	// 5432 10150:iand            
	// 5433 10151:putfield        #430 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 5434 10154:aload_0         
	// 5435 10155:getfield        #12  <Field azh a>
	// 5436 10158:astore_1        
		abyte0.ao = ((azh) (abyte0)).bo & ~a.c;
	// 5437 10159:aload_1         
	// 5438 10160:aload_1         
	// 5439 10161:getfield        #223 <Field int azh.bo>
	// 5440 10164:aload_0         
	// 5441 10165:getfield        #12  <Field azh a>
	// 5442 10168:getfield        #433 <Field int azh.c>
	// 5443 10171:iconst_m1       
	// 5444 10172:ixor            
	// 5445 10173:iand            
	// 5446 10174:putfield        #238 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 5447 10177:aload_0         
	// 5448 10178:getfield        #12  <Field azh a>
	// 5449 10181:astore_1        
		abyte0.by = ((azh) (abyte0)).bo ^ a.k;
	// 5450 10182:aload_1         
	// 5451 10183:aload_1         
	// 5452 10184:getfield        #223 <Field int azh.bo>
	// 5453 10187:aload_0         
	// 5454 10188:getfield        #12  <Field azh a>
	// 5455 10191:getfield        #436 <Field int azh.k>
	// 5456 10194:ixor            
	// 5457 10195:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 5458 10198:aload_0         
	// 5459 10199:getfield        #12  <Field azh a>
	// 5460 10202:astore_1        
		abyte0.bj = ((azh) (abyte0)).k & a.bo;
	// 5461 10203:aload_1         
	// 5462 10204:aload_1         
	// 5463 10205:getfield        #436 <Field int azh.k>
	// 5464 10208:aload_0         
	// 5465 10209:getfield        #12  <Field azh a>
	// 5466 10212:getfield        #223 <Field int azh.bo>
	// 5467 10215:iand            
	// 5468 10216:putfield        #406 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 5469 10219:aload_0         
	// 5470 10220:getfield        #12  <Field azh a>
	// 5471 10223:astore_1        
		abyte0.bt = ((azh) (abyte0)).bo ^ a.bt;
	// 5472 10224:aload_1         
	// 5473 10225:aload_1         
	// 5474 10226:getfield        #223 <Field int azh.bo>
	// 5475 10229:aload_0         
	// 5476 10230:getfield        #12  <Field azh a>
	// 5477 10233:getfield        #361 <Field int azh.bt>
	// 5478 10236:ixor            
	// 5479 10237:putfield        #361 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 5480 10240:aload_0         
	// 5481 10241:getfield        #12  <Field azh a>
	// 5482 10244:astore_1        
		abyte0.bt = ((azh) (abyte0)).c & ~a.bt;
	// 5483 10245:aload_1         
	// 5484 10246:aload_1         
	// 5485 10247:getfield        #433 <Field int azh.c>
	// 5486 10250:aload_0         
	// 5487 10251:getfield        #12  <Field azh a>
	// 5488 10254:getfield        #361 <Field int azh.bt>
	// 5489 10257:iconst_m1       
	// 5490 10258:ixor            
	// 5491 10259:iand            
	// 5492 10260:putfield        #361 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 5493 10263:aload_0         
	// 5494 10264:getfield        #12  <Field azh a>
	// 5495 10267:astore_1        
		abyte0.C = ((azh) (abyte0)).k & a.bo;
	// 5496 10268:aload_1         
	// 5497 10269:aload_1         
	// 5498 10270:getfield        #436 <Field int azh.k>
	// 5499 10273:aload_0         
	// 5500 10274:getfield        #12  <Field azh a>
	// 5501 10277:getfield        #223 <Field int azh.bo>
	// 5502 10280:iand            
	// 5503 10281:putfield        #193 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 5504 10284:aload_0         
	// 5505 10285:getfield        #12  <Field azh a>
	// 5506 10288:astore_1        
		abyte0.C = ((azh) (abyte0)).bb ^ a.C;
	// 5507 10289:aload_1         
	// 5508 10290:aload_1         
	// 5509 10291:getfield        #427 <Field int azh.bb>
	// 5510 10294:aload_0         
	// 5511 10295:getfield        #12  <Field azh a>
	// 5512 10298:getfield        #193 <Field int azh.C>
	// 5513 10301:ixor            
	// 5514 10302:putfield        #193 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 5515 10305:aload_0         
	// 5516 10306:getfield        #12  <Field azh a>
	// 5517 10309:astore_1        
		abyte0.C = ((azh) (abyte0)).c | a.C;
	// 5518 10310:aload_1         
	// 5519 10311:aload_1         
	// 5520 10312:getfield        #433 <Field int azh.c>
	// 5521 10315:aload_0         
	// 5522 10316:getfield        #12  <Field azh a>
	// 5523 10319:getfield        #193 <Field int azh.C>
	// 5524 10322:ior             
	// 5525 10323:putfield        #193 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 5526 10326:aload_0         
	// 5527 10327:getfield        #12  <Field azh a>
	// 5528 10330:astore_1        
		abyte0.C = ((azh) (abyte0)).by ^ a.C;
	// 5529 10331:aload_1         
	// 5530 10332:aload_1         
	// 5531 10333:getfield        #244 <Field int azh.by>
	// 5532 10336:aload_0         
	// 5533 10337:getfield        #12  <Field azh a>
	// 5534 10340:getfield        #193 <Field int azh.C>
	// 5535 10343:ixor            
	// 5536 10344:putfield        #193 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 5537 10347:aload_0         
	// 5538 10348:getfield        #12  <Field azh a>
	// 5539 10351:astore_1        
		abyte0.by = ((azh) (abyte0)).k & ~a.bo;
	// 5540 10352:aload_1         
	// 5541 10353:aload_1         
	// 5542 10354:getfield        #436 <Field int azh.k>
	// 5543 10357:aload_0         
	// 5544 10358:getfield        #12  <Field azh a>
	// 5545 10361:getfield        #223 <Field int azh.bo>
	// 5546 10364:iconst_m1       
	// 5547 10365:ixor            
	// 5548 10366:iand            
	// 5549 10367:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 5550 10370:aload_0         
	// 5551 10371:getfield        #12  <Field azh a>
	// 5552 10374:astore_1        
		abyte0.by = ((azh) (abyte0)).by & ~a.c;
	// 5553 10375:aload_1         
	// 5554 10376:aload_1         
	// 5555 10377:getfield        #244 <Field int azh.by>
	// 5556 10380:aload_0         
	// 5557 10381:getfield        #12  <Field azh a>
	// 5558 10384:getfield        #433 <Field int azh.c>
	// 5559 10387:iconst_m1       
	// 5560 10388:ixor            
	// 5561 10389:iand            
	// 5562 10390:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 5563 10393:aload_0         
	// 5564 10394:getfield        #12  <Field azh a>
	// 5565 10397:astore_1        
		abyte0.bo = ((azh) (abyte0)).bo & ~a.bb;
	// 5566 10398:aload_1         
	// 5567 10399:aload_1         
	// 5568 10400:getfield        #223 <Field int azh.bo>
	// 5569 10403:aload_0         
	// 5570 10404:getfield        #12  <Field azh a>
	// 5571 10407:getfield        #427 <Field int azh.bb>
	// 5572 10410:iconst_m1       
	// 5573 10411:ixor            
	// 5574 10412:iand            
	// 5575 10413:putfield        #223 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 5576 10416:aload_0         
	// 5577 10417:getfield        #12  <Field azh a>
	// 5578 10420:astore_1        
		abyte0.cl = ((azh) (abyte0)).bo ^ a.cl;
	// 5579 10421:aload_1         
	// 5580 10422:aload_1         
	// 5581 10423:getfield        #223 <Field int azh.bo>
	// 5582 10426:aload_0         
	// 5583 10427:getfield        #12  <Field azh a>
	// 5584 10430:getfield        #319 <Field int azh.cl>
	// 5585 10433:ixor            
	// 5586 10434:putfield        #319 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 5587 10437:aload_0         
	// 5588 10438:getfield        #12  <Field azh a>
	// 5589 10441:astore_1        
		abyte0.aJ = ((azh) (abyte0)).c | a.cl;
	// 5590 10442:aload_1         
	// 5591 10443:aload_1         
	// 5592 10444:getfield        #433 <Field int azh.c>
	// 5593 10447:aload_0         
	// 5594 10448:getfield        #12  <Field azh a>
	// 5595 10451:getfield        #319 <Field int azh.cl>
	// 5596 10454:ior             
	// 5597 10455:putfield        #241 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 5598 10458:aload_0         
	// 5599 10459:getfield        #12  <Field azh a>
	// 5600 10462:astore_1        
		abyte0.R = ((azh) (abyte0)).cl ^ a.R;
	// 5601 10463:aload_1         
	// 5602 10464:aload_1         
	// 5603 10465:getfield        #319 <Field int azh.cl>
	// 5604 10468:aload_0         
	// 5605 10469:getfield        #12  <Field azh a>
	// 5606 10472:getfield        #439 <Field int azh.R>
	// 5607 10475:ixor            
	// 5608 10476:putfield        #439 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 5609 10479:aload_0         
	// 5610 10480:getfield        #12  <Field azh a>
	// 5611 10483:astore_1        
		abyte0.R = ((azh) (abyte0)).A & a.R;
	// 5612 10484:aload_1         
	// 5613 10485:aload_1         
	// 5614 10486:getfield        #74  <Field int azh.A>
	// 5615 10489:aload_0         
	// 5616 10490:getfield        #12  <Field azh a>
	// 5617 10493:getfield        #439 <Field int azh.R>
	// 5618 10496:iand            
	// 5619 10497:putfield        #439 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 5620 10500:aload_0         
	// 5621 10501:getfield        #12  <Field azh a>
	// 5622 10504:astore_1        
		abyte0.cl = ((azh) (abyte0)).bb & a.I;
	// 5623 10505:aload_1         
	// 5624 10506:aload_1         
	// 5625 10507:getfield        #427 <Field int azh.bb>
	// 5626 10510:aload_0         
	// 5627 10511:getfield        #12  <Field azh a>
	// 5628 10514:getfield        #79  <Field int azh.I>
	// 5629 10517:iand            
	// 5630 10518:putfield        #319 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 5631 10521:aload_0         
	// 5632 10522:getfield        #12  <Field azh a>
	// 5633 10525:astore_1        
		abyte0.cc = ((azh) (abyte0)).cl ^ a.cc;
	// 5634 10526:aload_1         
	// 5635 10527:aload_1         
	// 5636 10528:getfield        #319 <Field int azh.cl>
	// 5637 10531:aload_0         
	// 5638 10532:getfield        #12  <Field azh a>
	// 5639 10535:getfield        #442 <Field int azh.cc>
	// 5640 10538:ixor            
	// 5641 10539:putfield        #442 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 5642 10542:aload_0         
	// 5643 10543:getfield        #12  <Field azh a>
	// 5644 10546:astore_1        
		abyte0.cc = ((azh) (abyte0)).cc & ~a.c;
	// 5645 10547:aload_1         
	// 5646 10548:aload_1         
	// 5647 10549:getfield        #442 <Field int azh.cc>
	// 5648 10552:aload_0         
	// 5649 10553:getfield        #12  <Field azh a>
	// 5650 10556:getfield        #433 <Field int azh.c>
	// 5651 10559:iconst_m1       
	// 5652 10560:ixor            
	// 5653 10561:iand            
	// 5654 10562:putfield        #442 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 5655 10565:aload_0         
	// 5656 10566:getfield        #12  <Field azh a>
	// 5657 10569:astore_1        
		abyte0.cc = ((azh) (abyte0)).bo ^ a.cc;
	// 5658 10570:aload_1         
	// 5659 10571:aload_1         
	// 5660 10572:getfield        #223 <Field int azh.bo>
	// 5661 10575:aload_0         
	// 5662 10576:getfield        #12  <Field azh a>
	// 5663 10579:getfield        #442 <Field int azh.cc>
	// 5664 10582:ixor            
	// 5665 10583:putfield        #442 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 5666 10586:aload_0         
	// 5667 10587:getfield        #12  <Field azh a>
	// 5668 10590:astore_1        
		abyte0.bj = ((azh) (abyte0)).cl ^ a.bj;
	// 5669 10591:aload_1         
	// 5670 10592:aload_1         
	// 5671 10593:getfield        #319 <Field int azh.cl>
	// 5672 10596:aload_0         
	// 5673 10597:getfield        #12  <Field azh a>
	// 5674 10600:getfield        #406 <Field int azh.bj>
	// 5675 10603:ixor            
	// 5676 10604:putfield        #406 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 5677 10607:aload_0         
	// 5678 10608:getfield        #12  <Field azh a>
	// 5679 10611:astore_1        
		abyte0.bo = ((azh) (abyte0)).c | a.bj;
	// 5680 10612:aload_1         
	// 5681 10613:aload_1         
	// 5682 10614:getfield        #433 <Field int azh.c>
	// 5683 10617:aload_0         
	// 5684 10618:getfield        #12  <Field azh a>
	// 5685 10621:getfield        #406 <Field int azh.bj>
	// 5686 10624:ior             
	// 5687 10625:putfield        #223 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 5688 10628:aload_0         
	// 5689 10629:getfield        #12  <Field azh a>
	// 5690 10632:astore_1        
		abyte0.as = ((azh) (abyte0)).cl ^ a.as;
	// 5691 10633:aload_1         
	// 5692 10634:aload_1         
	// 5693 10635:getfield        #319 <Field int azh.cl>
	// 5694 10638:aload_0         
	// 5695 10639:getfield        #12  <Field azh a>
	// 5696 10642:getfield        #445 <Field int azh.as>
	// 5697 10645:ixor            
	// 5698 10646:putfield        #445 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 5699 10649:aload_0         
	// 5700 10650:getfield        #12  <Field azh a>
	// 5701 10653:astore_1        
		abyte0.au = ((azh) (abyte0)).as & ~a.c;
	// 5702 10654:aload_1         
	// 5703 10655:aload_1         
	// 5704 10656:getfield        #445 <Field int azh.as>
	// 5705 10659:aload_0         
	// 5706 10660:getfield        #12  <Field azh a>
	// 5707 10663:getfield        #433 <Field int azh.c>
	// 5708 10666:iconst_m1       
	// 5709 10667:ixor            
	// 5710 10668:iand            
	// 5711 10669:putfield        #187 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 5712 10672:aload_0         
	// 5713 10673:getfield        #12  <Field azh a>
	// 5714 10676:astore_1        
		abyte0.bZ = ((azh) (abyte0)).c | a.as;
	// 5715 10677:aload_1         
	// 5716 10678:aload_1         
	// 5717 10679:getfield        #433 <Field int azh.c>
	// 5718 10682:aload_0         
	// 5719 10683:getfield        #12  <Field azh a>
	// 5720 10686:getfield        #445 <Field int azh.as>
	// 5721 10689:ior             
	// 5722 10690:putfield        #415 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 5723 10693:aload_0         
	// 5724 10694:getfield        #12  <Field azh a>
	// 5725 10697:astore_1        
		abyte0.bZ = ((azh) (abyte0)).A & ~a.bZ;
	// 5726 10698:aload_1         
	// 5727 10699:aload_1         
	// 5728 10700:getfield        #74  <Field int azh.A>
	// 5729 10703:aload_0         
	// 5730 10704:getfield        #12  <Field azh a>
	// 5731 10707:getfield        #415 <Field int azh.bZ>
	// 5732 10710:iconst_m1       
	// 5733 10711:ixor            
	// 5734 10712:iand            
	// 5735 10713:putfield        #415 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 5736 10716:aload_0         
	// 5737 10717:getfield        #12  <Field azh a>
	// 5738 10720:astore_1        
		abyte0.bZ = ((azh) (abyte0)).cc ^ a.bZ;
	// 5739 10721:aload_1         
	// 5740 10722:aload_1         
	// 5741 10723:getfield        #442 <Field int azh.cc>
	// 5742 10726:aload_0         
	// 5743 10727:getfield        #12  <Field azh a>
	// 5744 10730:getfield        #415 <Field int azh.bZ>
	// 5745 10733:ixor            
	// 5746 10734:putfield        #415 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 5747 10737:aload_0         
	// 5748 10738:getfield        #12  <Field azh a>
	// 5749 10741:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bF & ~a.bZ;
	// 5750 10742:aload_1         
	// 5751 10743:aload_1         
	// 5752 10744:getfield        #133 <Field int azh.bF>
	// 5753 10747:aload_0         
	// 5754 10748:getfield        #12  <Field azh a>
	// 5755 10751:getfield        #415 <Field int azh.bZ>
	// 5756 10754:iconst_m1       
	// 5757 10755:ixor            
	// 5758 10756:iand            
	// 5759 10757:putfield        #415 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 5760 10760:aload_0         
	// 5761 10761:getfield        #12  <Field azh a>
	// 5762 10764:astore_1        
		abyte0.cc = ((azh) (abyte0)).as & ~a.c;
	// 5763 10765:aload_1         
	// 5764 10766:aload_1         
	// 5765 10767:getfield        #445 <Field int azh.as>
	// 5766 10770:aload_0         
	// 5767 10771:getfield        #12  <Field azh a>
	// 5768 10774:getfield        #433 <Field int azh.c>
	// 5769 10777:iconst_m1       
	// 5770 10778:ixor            
	// 5771 10779:iand            
	// 5772 10780:putfield        #442 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 5773 10783:aload_0         
	// 5774 10784:getfield        #12  <Field azh a>
	// 5775 10787:astore_1        
		abyte0.cc = ((azh) (abyte0)).cl ^ a.cc;
	// 5776 10788:aload_1         
	// 5777 10789:aload_1         
	// 5778 10790:getfield        #319 <Field int azh.cl>
	// 5779 10793:aload_0         
	// 5780 10794:getfield        #12  <Field azh a>
	// 5781 10797:getfield        #442 <Field int azh.cc>
	// 5782 10800:ixor            
	// 5783 10801:putfield        #442 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 5784 10804:aload_0         
	// 5785 10805:getfield        #12  <Field azh a>
	// 5786 10808:astore_1        
		abyte0.as = ((azh) (abyte0)).as & ~a.c;
	// 5787 10809:aload_1         
	// 5788 10810:aload_1         
	// 5789 10811:getfield        #445 <Field int azh.as>
	// 5790 10814:aload_0         
	// 5791 10815:getfield        #12  <Field azh a>
	// 5792 10818:getfield        #433 <Field int azh.c>
	// 5793 10821:iconst_m1       
	// 5794 10822:ixor            
	// 5795 10823:iand            
	// 5796 10824:putfield        #445 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 5797 10827:aload_0         
	// 5798 10828:getfield        #12  <Field azh a>
	// 5799 10831:astore_1        
		abyte0.as = ((azh) (abyte0)).bj ^ a.as;
	// 5800 10832:aload_1         
	// 5801 10833:aload_1         
	// 5802 10834:getfield        #406 <Field int azh.bj>
	// 5803 10837:aload_0         
	// 5804 10838:getfield        #12  <Field azh a>
	// 5805 10841:getfield        #445 <Field int azh.as>
	// 5806 10844:ixor            
	// 5807 10845:putfield        #445 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 5808 10848:aload_0         
	// 5809 10849:getfield        #12  <Field azh a>
	// 5810 10852:astore_1        
		abyte0.as = ((azh) (abyte0)).A & a.as;
	// 5811 10853:aload_1         
	// 5812 10854:aload_1         
	// 5813 10855:getfield        #74  <Field int azh.A>
	// 5814 10858:aload_0         
	// 5815 10859:getfield        #12  <Field azh a>
	// 5816 10862:getfield        #445 <Field int azh.as>
	// 5817 10865:iand            
	// 5818 10866:putfield        #445 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 5819 10869:aload_0         
	// 5820 10870:getfield        #12  <Field azh a>
	// 5821 10873:astore_1        
		abyte0.as = ((azh) (abyte0)).bt ^ a.as;
	// 5822 10874:aload_1         
	// 5823 10875:aload_1         
	// 5824 10876:getfield        #361 <Field int azh.bt>
	// 5825 10879:aload_0         
	// 5826 10880:getfield        #12  <Field azh a>
	// 5827 10883:getfield        #445 <Field int azh.as>
	// 5828 10886:ixor            
	// 5829 10887:putfield        #445 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 5830 10890:aload_0         
	// 5831 10891:getfield        #12  <Field azh a>
	// 5832 10894:astore_1        
		abyte0.as = ((azh) (abyte0)).bF & ~a.as;
	// 5833 10895:aload_1         
	// 5834 10896:aload_1         
	// 5835 10897:getfield        #133 <Field int azh.bF>
	// 5836 10900:aload_0         
	// 5837 10901:getfield        #12  <Field azh a>
	// 5838 10904:getfield        #445 <Field int azh.as>
	// 5839 10907:iconst_m1       
	// 5840 10908:ixor            
	// 5841 10909:iand            
	// 5842 10910:putfield        #445 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 5843 10913:aload_0         
	// 5844 10914:getfield        #12  <Field azh a>
	// 5845 10917:astore_1        
		abyte0.bt = ((azh) (abyte0)).k & a.cl;
	// 5846 10918:aload_1         
	// 5847 10919:aload_1         
	// 5848 10920:getfield        #436 <Field int azh.k>
	// 5849 10923:aload_0         
	// 5850 10924:getfield        #12  <Field azh a>
	// 5851 10927:getfield        #319 <Field int azh.cl>
	// 5852 10930:iand            
	// 5853 10931:putfield        #361 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 5854 10934:aload_0         
	// 5855 10935:getfield        #12  <Field azh a>
	// 5856 10938:astore_1        
		abyte0.bt = ((azh) (abyte0)).cl ^ a.bt;
	// 5857 10939:aload_1         
	// 5858 10940:aload_1         
	// 5859 10941:getfield        #319 <Field int azh.cl>
	// 5860 10944:aload_0         
	// 5861 10945:getfield        #12  <Field azh a>
	// 5862 10948:getfield        #361 <Field int azh.bt>
	// 5863 10951:ixor            
	// 5864 10952:putfield        #361 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 5865 10955:aload_0         
	// 5866 10956:getfield        #12  <Field azh a>
	// 5867 10959:astore_1        
		abyte0.bQ = ((azh) (abyte0)).cl ^ a.bQ;
	// 5868 10960:aload_1         
	// 5869 10961:aload_1         
	// 5870 10962:getfield        #319 <Field int azh.cl>
	// 5871 10965:aload_0         
	// 5872 10966:getfield        #12  <Field azh a>
	// 5873 10969:getfield        #100 <Field int azh.bQ>
	// 5874 10972:ixor            
	// 5875 10973:putfield        #100 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 5876 10976:aload_0         
	// 5877 10977:getfield        #12  <Field azh a>
	// 5878 10980:astore_1        
		abyte0.aJ = ((azh) (abyte0)).bQ ^ a.aJ;
	// 5879 10981:aload_1         
	// 5880 10982:aload_1         
	// 5881 10983:getfield        #100 <Field int azh.bQ>
	// 5882 10986:aload_0         
	// 5883 10987:getfield        #12  <Field azh a>
	// 5884 10990:getfield        #241 <Field int azh.aJ>
	// 5885 10993:ixor            
	// 5886 10994:putfield        #241 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 5887 10997:aload_0         
	// 5888 10998:getfield        #12  <Field azh a>
	// 5889 11001:astore_1        
		abyte0.bJ = ((azh) (abyte0)).aJ ^ a.bJ;
	// 5890 11002:aload_1         
	// 5891 11003:aload_1         
	// 5892 11004:getfield        #241 <Field int azh.aJ>
	// 5893 11007:aload_0         
	// 5894 11008:getfield        #12  <Field azh a>
	// 5895 11011:getfield        #190 <Field int azh.bJ>
	// 5896 11014:ixor            
	// 5897 11015:putfield        #190 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 5898 11018:aload_0         
	// 5899 11019:getfield        #12  <Field azh a>
	// 5900 11022:astore_1        
		abyte0.as = ((azh) (abyte0)).bJ ^ a.as;
	// 5901 11023:aload_1         
	// 5902 11024:aload_1         
	// 5903 11025:getfield        #190 <Field int azh.bJ>
	// 5904 11028:aload_0         
	// 5905 11029:getfield        #12  <Field azh a>
	// 5906 11032:getfield        #445 <Field int azh.as>
	// 5907 11035:ixor            
	// 5908 11036:putfield        #445 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 5909 11039:aload_0         
	// 5910 11040:getfield        #12  <Field azh a>
	// 5911 11043:astore_1        
		abyte0.N = ((azh) (abyte0)).as ^ a.N;
	// 5912 11044:aload_1         
	// 5913 11045:aload_1         
	// 5914 11046:getfield        #445 <Field int azh.as>
	// 5915 11049:aload_0         
	// 5916 11050:getfield        #12  <Field azh a>
	// 5917 11053:getfield        #199 <Field int azh.N>
	// 5918 11056:ixor            
	// 5919 11057:putfield        #199 <Field int azh.N>
		abyte0 = ((byte []) (a));
	// 5920 11060:aload_0         
	// 5921 11061:getfield        #12  <Field azh a>
	// 5922 11064:astore_1        
		abyte0.cl = ((azh) (abyte0)).cl ^ a.k;
	// 5923 11065:aload_1         
	// 5924 11066:aload_1         
	// 5925 11067:getfield        #319 <Field int azh.cl>
	// 5926 11070:aload_0         
	// 5927 11071:getfield        #12  <Field azh a>
	// 5928 11074:getfield        #436 <Field int azh.k>
	// 5929 11077:ixor            
	// 5930 11078:putfield        #319 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 5931 11081:aload_0         
	// 5932 11082:getfield        #12  <Field azh a>
	// 5933 11085:astore_1        
		abyte0.au = ((azh) (abyte0)).cl ^ a.au;
	// 5934 11086:aload_1         
	// 5935 11087:aload_1         
	// 5936 11088:getfield        #319 <Field int azh.cl>
	// 5937 11091:aload_0         
	// 5938 11092:getfield        #12  <Field azh a>
	// 5939 11095:getfield        #187 <Field int azh.au>
	// 5940 11098:ixor            
	// 5941 11099:putfield        #187 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 5942 11102:aload_0         
	// 5943 11103:getfield        #12  <Field azh a>
	// 5944 11106:astore_1        
		abyte0.au = ((azh) (abyte0)).A & ~a.au;
	// 5945 11107:aload_1         
	// 5946 11108:aload_1         
	// 5947 11109:getfield        #74  <Field int azh.A>
	// 5948 11112:aload_0         
	// 5949 11113:getfield        #12  <Field azh a>
	// 5950 11116:getfield        #187 <Field int azh.au>
	// 5951 11119:iconst_m1       
	// 5952 11120:ixor            
	// 5953 11121:iand            
	// 5954 11122:putfield        #187 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 5955 11125:aload_0         
	// 5956 11126:getfield        #12  <Field azh a>
	// 5957 11129:astore_1        
		abyte0.au = ((azh) (abyte0)).C ^ a.au;
	// 5958 11130:aload_1         
	// 5959 11131:aload_1         
	// 5960 11132:getfield        #193 <Field int azh.C>
	// 5961 11135:aload_0         
	// 5962 11136:getfield        #12  <Field azh a>
	// 5963 11139:getfield        #187 <Field int azh.au>
	// 5964 11142:ixor            
	// 5965 11143:putfield        #187 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 5966 11146:aload_0         
	// 5967 11147:getfield        #12  <Field azh a>
	// 5968 11150:astore_1        
		abyte0.C = ((azh) (abyte0)).cl & ~a.c;
	// 5969 11151:aload_1         
	// 5970 11152:aload_1         
	// 5971 11153:getfield        #319 <Field int azh.cl>
	// 5972 11156:aload_0         
	// 5973 11157:getfield        #12  <Field azh a>
	// 5974 11160:getfield        #433 <Field int azh.c>
	// 5975 11163:iconst_m1       
	// 5976 11164:ixor            
	// 5977 11165:iand            
	// 5978 11166:putfield        #193 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 5979 11169:aload_0         
	// 5980 11170:getfield        #12  <Field azh a>
	// 5981 11173:astore_1        
		abyte0.C = ((azh) (abyte0)).bt ^ a.C;
	// 5982 11174:aload_1         
	// 5983 11175:aload_1         
	// 5984 11176:getfield        #361 <Field int azh.bt>
	// 5985 11179:aload_0         
	// 5986 11180:getfield        #12  <Field azh a>
	// 5987 11183:getfield        #193 <Field int azh.C>
	// 5988 11186:ixor            
	// 5989 11187:putfield        #193 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 5990 11190:aload_0         
	// 5991 11191:getfield        #12  <Field azh a>
	// 5992 11194:astore_1        
		abyte0.C = ((azh) (abyte0)).A & a.C;
	// 5993 11195:aload_1         
	// 5994 11196:aload_1         
	// 5995 11197:getfield        #74  <Field int azh.A>
	// 5996 11200:aload_0         
	// 5997 11201:getfield        #12  <Field azh a>
	// 5998 11204:getfield        #193 <Field int azh.C>
	// 5999 11207:iand            
	// 6000 11208:putfield        #193 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 6001 11211:aload_0         
	// 6002 11212:getfield        #12  <Field azh a>
	// 6003 11215:astore_1        
		abyte0.C = ((azh) (abyte0)).cc ^ a.C;
	// 6004 11216:aload_1         
	// 6005 11217:aload_1         
	// 6006 11218:getfield        #442 <Field int azh.cc>
	// 6007 11221:aload_0         
	// 6008 11222:getfield        #12  <Field azh a>
	// 6009 11225:getfield        #193 <Field int azh.C>
	// 6010 11228:ixor            
	// 6011 11229:putfield        #193 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 6012 11232:aload_0         
	// 6013 11233:getfield        #12  <Field azh a>
	// 6014 11236:astore_1        
		abyte0.C = ((azh) (abyte0)).bF & ~a.C;
	// 6015 11237:aload_1         
	// 6016 11238:aload_1         
	// 6017 11239:getfield        #133 <Field int azh.bF>
	// 6018 11242:aload_0         
	// 6019 11243:getfield        #12  <Field azh a>
	// 6020 11246:getfield        #193 <Field int azh.C>
	// 6021 11249:iconst_m1       
	// 6022 11250:ixor            
	// 6023 11251:iand            
	// 6024 11252:putfield        #193 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 6025 11255:aload_0         
	// 6026 11256:getfield        #12  <Field azh a>
	// 6027 11259:astore_1        
		abyte0.C = ((azh) (abyte0)).au ^ a.C;
	// 6028 11260:aload_1         
	// 6029 11261:aload_1         
	// 6030 11262:getfield        #187 <Field int azh.au>
	// 6031 11265:aload_0         
	// 6032 11266:getfield        #12  <Field azh a>
	// 6033 11269:getfield        #193 <Field int azh.C>
	// 6034 11272:ixor            
	// 6035 11273:putfield        #193 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 6036 11276:aload_0         
	// 6037 11277:getfield        #12  <Field azh a>
	// 6038 11280:astore_1        
		abyte0.bE = ((azh) (abyte0)).C ^ a.bE;
	// 6039 11281:aload_1         
	// 6040 11282:aload_1         
	// 6041 11283:getfield        #193 <Field int azh.C>
	// 6042 11286:aload_0         
	// 6043 11287:getfield        #12  <Field azh a>
	// 6044 11290:getfield        #56  <Field int azh.bE>
	// 6045 11293:ixor            
	// 6046 11294:putfield        #56  <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 6047 11297:aload_0         
	// 6048 11298:getfield        #12  <Field azh a>
	// 6049 11301:astore_1        
		abyte0.ao = ((azh) (abyte0)).cl ^ a.ao;
	// 6050 11302:aload_1         
	// 6051 11303:aload_1         
	// 6052 11304:getfield        #319 <Field int azh.cl>
	// 6053 11307:aload_0         
	// 6054 11308:getfield        #12  <Field azh a>
	// 6055 11311:getfield        #238 <Field int azh.ao>
	// 6056 11314:ixor            
	// 6057 11315:putfield        #238 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 6058 11318:aload_0         
	// 6059 11319:getfield        #12  <Field azh a>
	// 6060 11322:astore_1        
		abyte0.at = ((azh) (abyte0)).ao ^ a.at;
	// 6061 11323:aload_1         
	// 6062 11324:aload_1         
	// 6063 11325:getfield        #238 <Field int azh.ao>
	// 6064 11328:aload_0         
	// 6065 11329:getfield        #12  <Field azh a>
	// 6066 11332:getfield        #430 <Field int azh.at>
	// 6067 11335:ixor            
	// 6068 11336:putfield        #430 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 6069 11339:aload_0         
	// 6070 11340:getfield        #12  <Field azh a>
	// 6071 11343:astore_1        
		abyte0.bZ = ((azh) (abyte0)).at ^ a.bZ;
	// 6072 11344:aload_1         
	// 6073 11345:aload_1         
	// 6074 11346:getfield        #430 <Field int azh.at>
	// 6075 11349:aload_0         
	// 6076 11350:getfield        #12  <Field azh a>
	// 6077 11353:getfield        #415 <Field int azh.bZ>
	// 6078 11356:ixor            
	// 6079 11357:putfield        #415 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 6080 11360:aload_0         
	// 6081 11361:getfield        #12  <Field azh a>
	// 6082 11364:astore_1        
		abyte0.T = ((azh) (abyte0)).bZ ^ a.T;
	// 6083 11365:aload_1         
	// 6084 11366:aload_1         
	// 6085 11367:getfield        #415 <Field int azh.bZ>
	// 6086 11370:aload_0         
	// 6087 11371:getfield        #12  <Field azh a>
	// 6088 11374:getfield        #448 <Field int azh.T>
	// 6089 11377:ixor            
	// 6090 11378:putfield        #448 <Field int azh.T>
		abyte0 = ((byte []) (a));
	// 6091 11381:aload_0         
	// 6092 11382:getfield        #12  <Field azh a>
	// 6093 11385:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bb & ~a.I;
	// 6094 11386:aload_1         
	// 6095 11387:aload_1         
	// 6096 11388:getfield        #427 <Field int azh.bb>
	// 6097 11391:aload_0         
	// 6098 11392:getfield        #12  <Field azh a>
	// 6099 11395:getfield        #79  <Field int azh.I>
	// 6100 11398:iconst_m1       
	// 6101 11399:ixor            
	// 6102 11400:iand            
	// 6103 11401:putfield        #415 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 6104 11404:aload_0         
	// 6105 11405:getfield        #12  <Field azh a>
	// 6106 11408:astore_1        
		abyte0.at = ((azh) (abyte0)).k & a.bZ;
	// 6107 11409:aload_1         
	// 6108 11410:aload_1         
	// 6109 11411:getfield        #436 <Field int azh.k>
	// 6110 11414:aload_0         
	// 6111 11415:getfield        #12  <Field azh a>
	// 6112 11418:getfield        #415 <Field int azh.bZ>
	// 6113 11421:iand            
	// 6114 11422:putfield        #430 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 6115 11425:aload_0         
	// 6116 11426:getfield        #12  <Field azh a>
	// 6117 11429:astore_1        
		abyte0.at = ((azh) (abyte0)).I ^ a.at;
	// 6118 11430:aload_1         
	// 6119 11431:aload_1         
	// 6120 11432:getfield        #79  <Field int azh.I>
	// 6121 11435:aload_0         
	// 6122 11436:getfield        #12  <Field azh a>
	// 6123 11439:getfield        #430 <Field int azh.at>
	// 6124 11442:ixor            
	// 6125 11443:putfield        #430 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 6126 11446:aload_0         
	// 6127 11447:getfield        #12  <Field azh a>
	// 6128 11450:astore_1        
		abyte0.by = ((azh) (abyte0)).at ^ a.by;
	// 6129 11451:aload_1         
	// 6130 11452:aload_1         
	// 6131 11453:getfield        #430 <Field int azh.at>
	// 6132 11456:aload_0         
	// 6133 11457:getfield        #12  <Field azh a>
	// 6134 11460:getfield        #244 <Field int azh.by>
	// 6135 11463:ixor            
	// 6136 11464:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 6137 11467:aload_0         
	// 6138 11468:getfield        #12  <Field azh a>
	// 6139 11471:astore_1        
		abyte0.R = ((azh) (abyte0)).by ^ a.R;
	// 6140 11472:aload_1         
	// 6141 11473:aload_1         
	// 6142 11474:getfield        #244 <Field int azh.by>
	// 6143 11477:aload_0         
	// 6144 11478:getfield        #12  <Field azh a>
	// 6145 11481:getfield        #439 <Field int azh.R>
	// 6146 11484:ixor            
	// 6147 11485:putfield        #439 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 6148 11488:aload_0         
	// 6149 11489:getfield        #12  <Field azh a>
	// 6150 11492:astore_1        
		abyte0.R = ((azh) (abyte0)).bF & a.R;
	// 6151 11493:aload_1         
	// 6152 11494:aload_1         
	// 6153 11495:getfield        #133 <Field int azh.bF>
	// 6154 11498:aload_0         
	// 6155 11499:getfield        #12  <Field azh a>
	// 6156 11502:getfield        #439 <Field int azh.R>
	// 6157 11505:iand            
	// 6158 11506:putfield        #439 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 6159 11509:aload_0         
	// 6160 11510:getfield        #12  <Field azh a>
	// 6161 11513:astore_1        
		abyte0.bZ = ((azh) (abyte0)).k & a.bZ;
	// 6162 11514:aload_1         
	// 6163 11515:aload_1         
	// 6164 11516:getfield        #436 <Field int azh.k>
	// 6165 11519:aload_0         
	// 6166 11520:getfield        #12  <Field azh a>
	// 6167 11523:getfield        #415 <Field int azh.bZ>
	// 6168 11526:iand            
	// 6169 11527:putfield        #415 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 6170 11530:aload_0         
	// 6171 11531:getfield        #12  <Field azh a>
	// 6172 11534:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bf ^ a.bZ;
	// 6173 11535:aload_1         
	// 6174 11536:aload_1         
	// 6175 11537:getfield        #184 <Field int azh.bf>
	// 6176 11540:aload_0         
	// 6177 11541:getfield        #12  <Field azh a>
	// 6178 11544:getfield        #415 <Field int azh.bZ>
	// 6179 11547:ixor            
	// 6180 11548:putfield        #415 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 6181 11551:aload_0         
	// 6182 11552:getfield        #12  <Field azh a>
	// 6183 11555:astore_1        
		abyte0.bo = ((azh) (abyte0)).bZ ^ a.bo;
	// 6184 11556:aload_1         
	// 6185 11557:aload_1         
	// 6186 11558:getfield        #415 <Field int azh.bZ>
	// 6187 11561:aload_0         
	// 6188 11562:getfield        #12  <Field azh a>
	// 6189 11565:getfield        #223 <Field int azh.bo>
	// 6190 11568:ixor            
	// 6191 11569:putfield        #223 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 6192 11572:aload_0         
	// 6193 11573:getfield        #12  <Field azh a>
	// 6194 11576:astore_1        
		abyte0.aa = ((azh) (abyte0)).bo ^ a.aa;
	// 6195 11577:aload_1         
	// 6196 11578:aload_1         
	// 6197 11579:getfield        #223 <Field int azh.bo>
	// 6198 11582:aload_0         
	// 6199 11583:getfield        #12  <Field azh a>
	// 6200 11586:getfield        #328 <Field int azh.aa>
	// 6201 11589:ixor            
	// 6202 11590:putfield        #328 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 6203 11593:aload_0         
	// 6204 11594:getfield        #12  <Field azh a>
	// 6205 11597:astore_1        
		abyte0.R = ((azh) (abyte0)).aa ^ a.R;
	// 6206 11598:aload_1         
	// 6207 11599:aload_1         
	// 6208 11600:getfield        #328 <Field int azh.aa>
	// 6209 11603:aload_0         
	// 6210 11604:getfield        #12  <Field azh a>
	// 6211 11607:getfield        #439 <Field int azh.R>
	// 6212 11610:ixor            
	// 6213 11611:putfield        #439 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 6214 11614:aload_0         
	// 6215 11615:getfield        #12  <Field azh a>
	// 6216 11618:astore_1        
		abyte0.H = ((azh) (abyte0)).R ^ a.H;
	// 6217 11619:aload_1         
	// 6218 11620:aload_1         
	// 6219 11621:getfield        #439 <Field int azh.R>
	// 6220 11624:aload_0         
	// 6221 11625:getfield        #12  <Field azh a>
	// 6222 11628:getfield        #451 <Field int azh.H>
	// 6223 11631:ixor            
	// 6224 11632:putfield        #451 <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 6225 11635:aload_0         
	// 6226 11636:getfield        #12  <Field azh a>
	// 6227 11639:astore_1        
		abyte0.X = ((azh) (abyte0)).bP ^ a.X;
	// 6228 11640:aload_1         
	// 6229 11641:aload_1         
	// 6230 11642:getfield        #397 <Field int azh.bP>
	// 6231 11645:aload_0         
	// 6232 11646:getfield        #12  <Field azh a>
	// 6233 11649:getfield        #355 <Field int azh.X>
	// 6234 11652:ixor            
	// 6235 11653:putfield        #355 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 6236 11656:aload_0         
	// 6237 11657:getfield        #12  <Field azh a>
	// 6238 11660:astore_1        
		abyte0.X = ((azh) (abyte0)).X ^ a.aS;
	// 6239 11661:aload_1         
	// 6240 11662:aload_1         
	// 6241 11663:getfield        #355 <Field int azh.X>
	// 6242 11666:aload_0         
	// 6243 11667:getfield        #12  <Field azh a>
	// 6244 11670:getfield        #47  <Field int azh.aS>
	// 6245 11673:ixor            
	// 6246 11674:putfield        #355 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 6247 11677:aload_0         
	// 6248 11678:getfield        #12  <Field azh a>
	// 6249 11681:astore_1        
		abyte0.cn = ((azh) (abyte0)).X ^ a.cn;
	// 6250 11682:aload_1         
	// 6251 11683:aload_1         
	// 6252 11684:getfield        #355 <Field int azh.X>
	// 6253 11687:aload_0         
	// 6254 11688:getfield        #12  <Field azh a>
	// 6255 11691:getfield        #379 <Field int azh.cn>
	// 6256 11694:ixor            
	// 6257 11695:putfield        #379 <Field int azh.cn>
		abyte0 = ((byte []) (a));
	// 6258 11698:aload_0         
	// 6259 11699:getfield        #12  <Field azh a>
	// 6260 11702:astore_1        
		abyte0.an = ((azh) (abyte0)).cn ^ a.an;
	// 6261 11703:aload_1         
	// 6262 11704:aload_1         
	// 6263 11705:getfield        #379 <Field int azh.cn>
	// 6264 11708:aload_0         
	// 6265 11709:getfield        #12  <Field azh a>
	// 6266 11712:getfield        #382 <Field int azh.an>
	// 6267 11715:ixor            
	// 6268 11716:putfield        #382 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 6269 11719:aload_0         
	// 6270 11720:getfield        #12  <Field azh a>
	// 6271 11723:astore_1        
		abyte0.o = ((azh) (abyte0)).an ^ a.o;
	// 6272 11724:aload_1         
	// 6273 11725:aload_1         
	// 6274 11726:getfield        #382 <Field int azh.an>
	// 6275 11729:aload_0         
	// 6276 11730:getfield        #12  <Field azh a>
	// 6277 11733:getfield        #454 <Field int azh.o>
	// 6278 11736:ixor            
	// 6279 11737:putfield        #454 <Field int azh.o>
		abyte0 = ((byte []) (a));
	// 6280 11740:aload_0         
	// 6281 11741:getfield        #12  <Field azh a>
	// 6282 11744:astore_1        
		abyte0.bd = ((azh) (abyte0)).bd & ~a.o;
	// 6283 11745:aload_1         
	// 6284 11746:aload_1         
	// 6285 11747:getfield        #457 <Field int azh.bd>
	// 6286 11750:aload_0         
	// 6287 11751:getfield        #12  <Field azh a>
	// 6288 11754:getfield        #454 <Field int azh.o>
	// 6289 11757:iconst_m1       
	// 6290 11758:ixor            
	// 6291 11759:iand            
	// 6292 11760:putfield        #457 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 6293 11763:aload_0         
	// 6294 11764:getfield        #12  <Field azh a>
	// 6295 11767:astore_1        
		abyte0.bd = ((azh) (abyte0)).ae ^ a.bd;
	// 6296 11768:aload_1         
	// 6297 11769:aload_1         
	// 6298 11770:getfield        #208 <Field int azh.ae>
	// 6299 11773:aload_0         
	// 6300 11774:getfield        #12  <Field azh a>
	// 6301 11777:getfield        #457 <Field int azh.bd>
	// 6302 11780:ixor            
	// 6303 11781:putfield        #457 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 6304 11784:aload_0         
	// 6305 11785:getfield        #12  <Field azh a>
	// 6306 11788:astore_1        
		abyte0.an = ((azh) (abyte0)).d | a.aB;
	// 6307 11789:aload_1         
	// 6308 11790:aload_1         
	// 6309 11791:getfield        #337 <Field int azh.d>
	// 6310 11794:aload_0         
	// 6311 11795:getfield        #12  <Field azh a>
	// 6312 11798:getfield        #460 <Field int azh.aB>
	// 6313 11801:ior             
	// 6314 11802:putfield        #382 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 6315 11805:aload_0         
	// 6316 11806:getfield        #12  <Field azh a>
	// 6317 11809:astore_1        
		abyte0.an = ((azh) (abyte0)).bA ^ a.an;
	// 6318 11810:aload_1         
	// 6319 11811:aload_1         
	// 6320 11812:getfield        #463 <Field int azh.bA>
	// 6321 11815:aload_0         
	// 6322 11816:getfield        #12  <Field azh a>
	// 6323 11819:getfield        #382 <Field int azh.an>
	// 6324 11822:ixor            
	// 6325 11823:putfield        #382 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 6326 11826:aload_0         
	// 6327 11827:getfield        #12  <Field azh a>
	// 6328 11830:astore_1        
		abyte0.an = ((azh) (abyte0)).bY & ~a.an;
	// 6329 11831:aload_1         
	// 6330 11832:aload_1         
	// 6331 11833:getfield        #346 <Field int azh.bY>
	// 6332 11836:aload_0         
	// 6333 11837:getfield        #12  <Field azh a>
	// 6334 11840:getfield        #382 <Field int azh.an>
	// 6335 11843:iconst_m1       
	// 6336 11844:ixor            
	// 6337 11845:iand            
	// 6338 11846:putfield        #382 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 6339 11849:aload_0         
	// 6340 11850:getfield        #12  <Field azh a>
	// 6341 11853:astore_1        
		abyte0.an = ((azh) (abyte0)).r ^ a.an;
	// 6342 11854:aload_1         
	// 6343 11855:aload_1         
	// 6344 11856:getfield        #364 <Field int azh.r>
	// 6345 11859:aload_0         
	// 6346 11860:getfield        #12  <Field azh a>
	// 6347 11863:getfield        #382 <Field int azh.an>
	// 6348 11866:ixor            
	// 6349 11867:putfield        #382 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 6350 11870:aload_0         
	// 6351 11871:getfield        #12  <Field azh a>
	// 6352 11874:astore_1        
		abyte0.an = ((azh) (abyte0)).an & ~a.bz;
	// 6353 11875:aload_1         
	// 6354 11876:aload_1         
	// 6355 11877:getfield        #382 <Field int azh.an>
	// 6356 11880:aload_0         
	// 6357 11881:getfield        #12  <Field azh a>
	// 6358 11884:getfield        #466 <Field int azh.bz>
	// 6359 11887:iconst_m1       
	// 6360 11888:ixor            
	// 6361 11889:iand            
	// 6362 11890:putfield        #382 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 6363 11893:aload_0         
	// 6364 11894:getfield        #12  <Field azh a>
	// 6365 11897:astore_1        
		abyte0.aB = ((azh) (abyte0)).d & ~a.aB;
	// 6366 11898:aload_1         
	// 6367 11899:aload_1         
	// 6368 11900:getfield        #337 <Field int azh.d>
	// 6369 11903:aload_0         
	// 6370 11904:getfield        #12  <Field azh a>
	// 6371 11907:getfield        #460 <Field int azh.aB>
	// 6372 11910:iconst_m1       
	// 6373 11911:ixor            
	// 6374 11912:iand            
	// 6375 11913:putfield        #460 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 6376 11916:aload_0         
	// 6377 11917:getfield        #12  <Field azh a>
	// 6378 11920:astore_1        
		abyte0.ce = ((azh) (abyte0)).ce & ~a.d;
	// 6379 11921:aload_1         
	// 6380 11922:aload_1         
	// 6381 11923:getfield        #469 <Field int azh.ce>
	// 6382 11926:aload_0         
	// 6383 11927:getfield        #12  <Field azh a>
	// 6384 11930:getfield        #337 <Field int azh.d>
	// 6385 11933:iconst_m1       
	// 6386 11934:ixor            
	// 6387 11935:iand            
	// 6388 11936:putfield        #469 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 6389 11939:aload_0         
	// 6390 11940:getfield        #12  <Field azh a>
	// 6391 11943:astore_1        
		abyte0.ce = ((azh) (abyte0)).bY & ~a.ce;
	// 6392 11944:aload_1         
	// 6393 11945:aload_1         
	// 6394 11946:getfield        #346 <Field int azh.bY>
	// 6395 11949:aload_0         
	// 6396 11950:getfield        #12  <Field azh a>
	// 6397 11953:getfield        #469 <Field int azh.ce>
	// 6398 11956:iconst_m1       
	// 6399 11957:ixor            
	// 6400 11958:iand            
	// 6401 11959:putfield        #469 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 6402 11962:aload_0         
	// 6403 11963:getfield        #12  <Field azh a>
	// 6404 11966:astore_1        
		abyte0.ce = ((azh) (abyte0)).ah ^ a.ce;
	// 6405 11967:aload_1         
	// 6406 11968:aload_1         
	// 6407 11969:getfield        #394 <Field int azh.ah>
	// 6408 11972:aload_0         
	// 6409 11973:getfield        #12  <Field azh a>
	// 6410 11976:getfield        #469 <Field int azh.ce>
	// 6411 11979:ixor            
	// 6412 11980:putfield        #469 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 6413 11983:aload_0         
	// 6414 11984:getfield        #12  <Field azh a>
	// 6415 11987:astore_1        
		abyte0.ah = ((azh) (abyte0)).d & ~a.ca;
	// 6416 11988:aload_1         
	// 6417 11989:aload_1         
	// 6418 11990:getfield        #337 <Field int azh.d>
	// 6419 11993:aload_0         
	// 6420 11994:getfield        #12  <Field azh a>
	// 6421 11997:getfield        #472 <Field int azh.ca>
	// 6422 12000:iconst_m1       
	// 6423 12001:ixor            
	// 6424 12002:iand            
	// 6425 12003:putfield        #394 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 6426 12006:aload_0         
	// 6427 12007:getfield        #12  <Field azh a>
	// 6428 12010:astore_1        
		abyte0.ah = ((azh) (abyte0)).bM ^ a.ah;
	// 6429 12011:aload_1         
	// 6430 12012:aload_1         
	// 6431 12013:getfield        #349 <Field int azh.bM>
	// 6432 12016:aload_0         
	// 6433 12017:getfield        #12  <Field azh a>
	// 6434 12020:getfield        #394 <Field int azh.ah>
	// 6435 12023:ixor            
	// 6436 12024:putfield        #394 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 6437 12027:aload_0         
	// 6438 12028:getfield        #12  <Field azh a>
	// 6439 12031:astore_1        
		abyte0.ah = ((azh) (abyte0)).bY & ~a.ah;
	// 6440 12032:aload_1         
	// 6441 12033:aload_1         
	// 6442 12034:getfield        #346 <Field int azh.bY>
	// 6443 12037:aload_0         
	// 6444 12038:getfield        #12  <Field azh a>
	// 6445 12041:getfield        #394 <Field int azh.ah>
	// 6446 12044:iconst_m1       
	// 6447 12045:ixor            
	// 6448 12046:iand            
	// 6449 12047:putfield        #394 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 6450 12050:aload_0         
	// 6451 12051:getfield        #12  <Field azh a>
	// 6452 12054:astore_1        
		abyte0.cj = ((azh) (abyte0)).cj & ~a.d;
	// 6453 12055:aload_1         
	// 6454 12056:aload_1         
	// 6455 12057:getfield        #475 <Field int azh.cj>
	// 6456 12060:aload_0         
	// 6457 12061:getfield        #12  <Field azh a>
	// 6458 12064:getfield        #337 <Field int azh.d>
	// 6459 12067:iconst_m1       
	// 6460 12068:ixor            
	// 6461 12069:iand            
	// 6462 12070:putfield        #475 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 6463 12073:aload_0         
	// 6464 12074:getfield        #12  <Field azh a>
	// 6465 12077:astore_1        
		abyte0.bR = ((azh) (abyte0)).cj ^ a.bR;
	// 6466 12078:aload_1         
	// 6467 12079:aload_1         
	// 6468 12080:getfield        #475 <Field int azh.cj>
	// 6469 12083:aload_0         
	// 6470 12084:getfield        #12  <Field azh a>
	// 6471 12087:getfield        #340 <Field int azh.bR>
	// 6472 12090:ixor            
	// 6473 12091:putfield        #340 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 6474 12094:aload_0         
	// 6475 12095:getfield        #12  <Field azh a>
	// 6476 12098:astore_1        
		abyte0.bR = ((azh) (abyte0)).bz | a.bR;
	// 6477 12099:aload_1         
	// 6478 12100:aload_1         
	// 6479 12101:getfield        #466 <Field int azh.bz>
	// 6480 12104:aload_0         
	// 6481 12105:getfield        #12  <Field azh a>
	// 6482 12108:getfield        #340 <Field int azh.bR>
	// 6483 12111:ior             
	// 6484 12112:putfield        #340 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 6485 12115:aload_0         
	// 6486 12116:getfield        #12  <Field azh a>
	// 6487 12119:astore_1        
		abyte0.bg = ((azh) (abyte0)).d | a.bg;
	// 6488 12120:aload_1         
	// 6489 12121:aload_1         
	// 6490 12122:getfield        #337 <Field int azh.d>
	// 6491 12125:aload_0         
	// 6492 12126:getfield        #12  <Field azh a>
	// 6493 12129:getfield        #478 <Field int azh.bg>
	// 6494 12132:ior             
	// 6495 12133:putfield        #478 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 6496 12136:aload_0         
	// 6497 12137:getfield        #12  <Field azh a>
	// 6498 12140:astore_1        
		abyte0.bg = ((azh) (abyte0)).aN ^ a.bg;
	// 6499 12141:aload_1         
	// 6500 12142:aload_1         
	// 6501 12143:getfield        #481 <Field int azh.aN>
	// 6502 12146:aload_0         
	// 6503 12147:getfield        #12  <Field azh a>
	// 6504 12150:getfield        #478 <Field int azh.bg>
	// 6505 12153:ixor            
	// 6506 12154:putfield        #478 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 6507 12157:aload_0         
	// 6508 12158:getfield        #12  <Field azh a>
	// 6509 12161:astore_1        
		abyte0.bI = ((azh) (abyte0)).bg ^ a.bI;
	// 6510 12162:aload_1         
	// 6511 12163:aload_1         
	// 6512 12164:getfield        #478 <Field int azh.bg>
	// 6513 12167:aload_0         
	// 6514 12168:getfield        #12  <Field azh a>
	// 6515 12171:getfield        #484 <Field int azh.bI>
	// 6516 12174:ixor            
	// 6517 12175:putfield        #484 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 6518 12178:aload_0         
	// 6519 12179:getfield        #12  <Field azh a>
	// 6520 12182:astore_1        
		abyte0.an = ((azh) (abyte0)).bI ^ a.an;
	// 6521 12183:aload_1         
	// 6522 12184:aload_1         
	// 6523 12185:getfield        #484 <Field int azh.bI>
	// 6524 12188:aload_0         
	// 6525 12189:getfield        #12  <Field azh a>
	// 6526 12192:getfield        #382 <Field int azh.an>
	// 6527 12195:ixor            
	// 6528 12196:putfield        #382 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 6529 12199:aload_0         
	// 6530 12200:getfield        #12  <Field azh a>
	// 6531 12203:astore_1        
		abyte0.Q = ((azh) (abyte0)).an ^ a.Q;
	// 6532 12204:aload_1         
	// 6533 12205:aload_1         
	// 6534 12206:getfield        #382 <Field int azh.an>
	// 6535 12209:aload_0         
	// 6536 12210:getfield        #12  <Field azh a>
	// 6537 12213:getfield        #487 <Field int azh.Q>
	// 6538 12216:ixor            
	// 6539 12217:putfield        #487 <Field int azh.Q>
		abyte0 = ((byte []) (a));
	// 6540 12220:aload_0         
	// 6541 12221:getfield        #12  <Field azh a>
	// 6542 12224:astore_1        
		abyte0.bw = ((azh) (abyte0)).bw & ~a.Q;
	// 6543 12225:aload_1         
	// 6544 12226:aload_1         
	// 6545 12227:getfield        #97  <Field int azh.bw>
	// 6546 12230:aload_0         
	// 6547 12231:getfield        #12  <Field azh a>
	// 6548 12234:getfield        #487 <Field int azh.Q>
	// 6549 12237:iconst_m1       
	// 6550 12238:ixor            
	// 6551 12239:iand            
	// 6552 12240:putfield        #97  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 6553 12243:aload_0         
	// 6554 12244:getfield        #12  <Field azh a>
	// 6555 12247:astore_1        
		abyte0.bw = ((azh) (abyte0)).bH ^ a.bw;
	// 6556 12248:aload_1         
	// 6557 12249:aload_1         
	// 6558 12250:getfield        #196 <Field int azh.bH>
	// 6559 12253:aload_0         
	// 6560 12254:getfield        #12  <Field azh a>
	// 6561 12257:getfield        #97  <Field int azh.bw>
	// 6562 12260:ixor            
	// 6563 12261:putfield        #97  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 6564 12264:aload_0         
	// 6565 12265:getfield        #12  <Field azh a>
	// 6566 12268:astore_1        
		abyte0.bw = ((azh) (abyte0)).bu | a.bw;
	// 6567 12269:aload_1         
	// 6568 12270:aload_1         
	// 6569 12271:getfield        #418 <Field int azh.bu>
	// 6570 12274:aload_0         
	// 6571 12275:getfield        #12  <Field azh a>
	// 6572 12278:getfield        #97  <Field int azh.bw>
	// 6573 12281:ior             
	// 6574 12282:putfield        #97  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 6575 12285:aload_0         
	// 6576 12286:getfield        #12  <Field azh a>
	// 6577 12289:astore_1        
		abyte0.bX = ((azh) (abyte0)).bX & ~a.Q;
	// 6578 12290:aload_1         
	// 6579 12291:aload_1         
	// 6580 12292:getfield        #139 <Field int azh.bX>
	// 6581 12295:aload_0         
	// 6582 12296:getfield        #12  <Field azh a>
	// 6583 12299:getfield        #487 <Field int azh.Q>
	// 6584 12302:iconst_m1       
	// 6585 12303:ixor            
	// 6586 12304:iand            
	// 6587 12305:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 6588 12308:aload_0         
	// 6589 12309:getfield        #12  <Field azh a>
	// 6590 12312:astore_1        
		abyte0.bX = ((azh) (abyte0)).bL ^ a.bX;
	// 6591 12313:aload_1         
	// 6592 12314:aload_1         
	// 6593 12315:getfield        #262 <Field int azh.bL>
	// 6594 12318:aload_0         
	// 6595 12319:getfield        #12  <Field azh a>
	// 6596 12322:getfield        #139 <Field int azh.bX>
	// 6597 12325:ixor            
	// 6598 12326:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 6599 12329:aload_0         
	// 6600 12330:getfield        #12  <Field azh a>
	// 6601 12333:astore_1        
		abyte0.W = ((azh) (abyte0)).Q | a.W;
	// 6602 12334:aload_1         
	// 6603 12335:aload_1         
	// 6604 12336:getfield        #487 <Field int azh.Q>
	// 6605 12339:aload_0         
	// 6606 12340:getfield        #12  <Field azh a>
	// 6607 12343:getfield        #26  <Field int azh.W>
	// 6608 12346:ior             
	// 6609 12347:putfield        #26  <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 6610 12350:aload_0         
	// 6611 12351:getfield        #12  <Field azh a>
	// 6612 12354:astore_1        
		abyte0.W = ((azh) (abyte0)).av ^ a.W;
	// 6613 12355:aload_1         
	// 6614 12356:aload_1         
	// 6615 12357:getfield        #136 <Field int azh.av>
	// 6616 12360:aload_0         
	// 6617 12361:getfield        #12  <Field azh a>
	// 6618 12364:getfield        #26  <Field int azh.W>
	// 6619 12367:ixor            
	// 6620 12368:putfield        #26  <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 6621 12371:aload_0         
	// 6622 12372:getfield        #12  <Field azh a>
	// 6623 12375:astore_1        
		abyte0.bw = ((azh) (abyte0)).W ^ a.bw;
	// 6624 12376:aload_1         
	// 6625 12377:aload_1         
	// 6626 12378:getfield        #26  <Field int azh.W>
	// 6627 12381:aload_0         
	// 6628 12382:getfield        #12  <Field azh a>
	// 6629 12385:getfield        #97  <Field int azh.bw>
	// 6630 12388:ixor            
	// 6631 12389:putfield        #97  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 6632 12392:aload_0         
	// 6633 12393:getfield        #12  <Field azh a>
	// 6634 12396:astore_1        
		abyte0.h = ((azh) (abyte0)).bw ^ a.h;
	// 6635 12397:aload_1         
	// 6636 12398:aload_1         
	// 6637 12399:getfield        #97  <Field int azh.bw>
	// 6638 12402:aload_0         
	// 6639 12403:getfield        #12  <Field azh a>
	// 6640 12406:getfield        #172 <Field int azh.h>
	// 6641 12409:ixor            
	// 6642 12410:putfield        #172 <Field int azh.h>
		abyte0 = ((byte []) (a));
	// 6643 12413:aload_0         
	// 6644 12414:getfield        #12  <Field azh a>
	// 6645 12417:astore_1        
		abyte0.bw = ((azh) (abyte0)).h | a.N;
	// 6646 12418:aload_1         
	// 6647 12419:aload_1         
	// 6648 12420:getfield        #172 <Field int azh.h>
	// 6649 12423:aload_0         
	// 6650 12424:getfield        #12  <Field azh a>
	// 6651 12427:getfield        #199 <Field int azh.N>
	// 6652 12430:ior             
	// 6653 12431:putfield        #97  <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 6654 12434:aload_0         
	// 6655 12435:getfield        #12  <Field azh a>
	// 6656 12438:astore_1        
		abyte0.W = ((azh) (abyte0)).bw & ~a.N;
	// 6657 12439:aload_1         
	// 6658 12440:aload_1         
	// 6659 12441:getfield        #97  <Field int azh.bw>
	// 6660 12444:aload_0         
	// 6661 12445:getfield        #12  <Field azh a>
	// 6662 12448:getfield        #199 <Field int azh.N>
	// 6663 12451:iconst_m1       
	// 6664 12452:ixor            
	// 6665 12453:iand            
	// 6666 12454:putfield        #26  <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 6667 12457:aload_0         
	// 6668 12458:getfield        #12  <Field azh a>
	// 6669 12461:astore_1        
		abyte0.av = ((azh) (abyte0)).h & ~a.N;
	// 6670 12462:aload_1         
	// 6671 12463:aload_1         
	// 6672 12464:getfield        #172 <Field int azh.h>
	// 6673 12467:aload_0         
	// 6674 12468:getfield        #12  <Field azh a>
	// 6675 12471:getfield        #199 <Field int azh.N>
	// 6676 12474:iconst_m1       
	// 6677 12475:ixor            
	// 6678 12476:iand            
	// 6679 12477:putfield        #136 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 6680 12480:aload_0         
	// 6681 12481:getfield        #12  <Field azh a>
	// 6682 12484:astore_1        
		abyte0.bL = ((azh) (abyte0)).h & a.N;
	// 6683 12485:aload_1         
	// 6684 12486:aload_1         
	// 6685 12487:getfield        #172 <Field int azh.h>
	// 6686 12490:aload_0         
	// 6687 12491:getfield        #12  <Field azh a>
	// 6688 12494:getfield        #199 <Field int azh.N>
	// 6689 12497:iand            
	// 6690 12498:putfield        #262 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 6691 12501:aload_0         
	// 6692 12502:getfield        #12  <Field azh a>
	// 6693 12505:astore_1        
		abyte0.bH = ((azh) (abyte0)).N & ~a.bL;
	// 6694 12506:aload_1         
	// 6695 12507:aload_1         
	// 6696 12508:getfield        #199 <Field int azh.N>
	// 6697 12511:aload_0         
	// 6698 12512:getfield        #12  <Field azh a>
	// 6699 12515:getfield        #262 <Field int azh.bL>
	// 6700 12518:iconst_m1       
	// 6701 12519:ixor            
	// 6702 12520:iand            
	// 6703 12521:putfield        #196 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 6704 12524:aload_0         
	// 6705 12525:getfield        #12  <Field azh a>
	// 6706 12528:astore_1        
		abyte0.an = ((azh) (abyte0)).N & ~a.h;
	// 6707 12529:aload_1         
	// 6708 12530:aload_1         
	// 6709 12531:getfield        #199 <Field int azh.N>
	// 6710 12534:aload_0         
	// 6711 12535:getfield        #12  <Field azh a>
	// 6712 12538:getfield        #172 <Field int azh.h>
	// 6713 12541:iconst_m1       
	// 6714 12542:ixor            
	// 6715 12543:iand            
	// 6716 12544:putfield        #382 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 6717 12547:aload_0         
	// 6718 12548:getfield        #12  <Field azh a>
	// 6719 12551:astore_1        
		abyte0.bI = ((azh) (abyte0)).h ^ a.N;
	// 6720 12552:aload_1         
	// 6721 12553:aload_1         
	// 6722 12554:getfield        #172 <Field int azh.h>
	// 6723 12557:aload_0         
	// 6724 12558:getfield        #12  <Field azh a>
	// 6725 12561:getfield        #199 <Field int azh.N>
	// 6726 12564:ixor            
	// 6727 12565:putfield        #484 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 6728 12568:aload_0         
	// 6729 12569:getfield        #12  <Field azh a>
	// 6730 12572:astore_1        
		abyte0.bg = ((azh) (abyte0)).Q | a.ay;
	// 6731 12573:aload_1         
	// 6732 12574:aload_1         
	// 6733 12575:getfield        #487 <Field int azh.Q>
	// 6734 12578:aload_0         
	// 6735 12579:getfield        #12  <Field azh a>
	// 6736 12582:getfield        #253 <Field int azh.ay>
	// 6737 12585:ior             
	// 6738 12586:putfield        #478 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 6739 12589:aload_0         
	// 6740 12590:getfield        #12  <Field azh a>
	// 6741 12593:astore_1        
		abyte0.bg = ((azh) (abyte0)).ay ^ a.bg;
	// 6742 12594:aload_1         
	// 6743 12595:aload_1         
	// 6744 12596:getfield        #253 <Field int azh.ay>
	// 6745 12599:aload_0         
	// 6746 12600:getfield        #12  <Field azh a>
	// 6747 12603:getfield        #478 <Field int azh.bg>
	// 6748 12606:ixor            
	// 6749 12607:putfield        #478 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 6750 12610:aload_0         
	// 6751 12611:getfield        #12  <Field azh a>
	// 6752 12614:astore_1        
		abyte0.bg = ((azh) (abyte0)).bu | a.bg;
	// 6753 12615:aload_1         
	// 6754 12616:aload_1         
	// 6755 12617:getfield        #418 <Field int azh.bu>
	// 6756 12620:aload_0         
	// 6757 12621:getfield        #12  <Field azh a>
	// 6758 12624:getfield        #478 <Field int azh.bg>
	// 6759 12627:ior             
	// 6760 12628:putfield        #478 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 6761 12631:aload_0         
	// 6762 12632:getfield        #12  <Field azh a>
	// 6763 12635:astore_1        
		abyte0.bg = ((azh) (abyte0)).bX ^ a.bg;
	// 6764 12636:aload_1         
	// 6765 12637:aload_1         
	// 6766 12638:getfield        #139 <Field int azh.bX>
	// 6767 12641:aload_0         
	// 6768 12642:getfield        #12  <Field azh a>
	// 6769 12645:getfield        #478 <Field int azh.bg>
	// 6770 12648:ixor            
	// 6771 12649:putfield        #478 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 6772 12652:aload_0         
	// 6773 12653:getfield        #12  <Field azh a>
	// 6774 12656:astore_1        
		abyte0.v = ((azh) (abyte0)).bg ^ a.v;
	// 6775 12657:aload_1         
	// 6776 12658:aload_1         
	// 6777 12659:getfield        #478 <Field int azh.bg>
	// 6778 12662:aload_0         
	// 6779 12663:getfield        #12  <Field azh a>
	// 6780 12666:getfield        #490 <Field int azh.v>
	// 6781 12669:ixor            
	// 6782 12670:putfield        #490 <Field int azh.v>
		abyte0 = ((byte []) (a));
	// 6783 12673:aload_0         
	// 6784 12674:getfield        #12  <Field azh a>
	// 6785 12677:astore_1        
		abyte0.bm = ((azh) (abyte0)).bm & ~a.Q;
	// 6786 12678:aload_1         
	// 6787 12679:aload_1         
	// 6788 12680:getfield        #68  <Field int azh.bm>
	// 6789 12683:aload_0         
	// 6790 12684:getfield        #12  <Field azh a>
	// 6791 12687:getfield        #487 <Field int azh.Q>
	// 6792 12690:iconst_m1       
	// 6793 12691:ixor            
	// 6794 12692:iand            
	// 6795 12693:putfield        #68  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 6796 12696:aload_0         
	// 6797 12697:getfield        #12  <Field azh a>
	// 6798 12700:astore_1        
		abyte0.bm = ((azh) (abyte0)).ag ^ a.bm;
	// 6799 12701:aload_1         
	// 6800 12702:aload_1         
	// 6801 12703:getfield        #94  <Field int azh.ag>
	// 6802 12706:aload_0         
	// 6803 12707:getfield        #12  <Field azh a>
	// 6804 12710:getfield        #68  <Field int azh.bm>
	// 6805 12713:ixor            
	// 6806 12714:putfield        #68  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 6807 12717:aload_0         
	// 6808 12718:getfield        #12  <Field azh a>
	// 6809 12721:astore_1        
		abyte0.bm = ((azh) (abyte0)).bu | a.bm;
	// 6810 12722:aload_1         
	// 6811 12723:aload_1         
	// 6812 12724:getfield        #418 <Field int azh.bu>
	// 6813 12727:aload_0         
	// 6814 12728:getfield        #12  <Field azh a>
	// 6815 12731:getfield        #68  <Field int azh.bm>
	// 6816 12734:ior             
	// 6817 12735:putfield        #68  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 6818 12738:aload_0         
	// 6819 12739:getfield        #12  <Field azh a>
	// 6820 12742:astore_1        
		abyte0.az = ((azh) (abyte0)).Q | a.az;
	// 6821 12743:aload_1         
	// 6822 12744:aload_1         
	// 6823 12745:getfield        #487 <Field int azh.Q>
	// 6824 12748:aload_0         
	// 6825 12749:getfield        #12  <Field azh a>
	// 6826 12752:getfield        #268 <Field int azh.az>
	// 6827 12755:ior             
	// 6828 12756:putfield        #268 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 6829 12759:aload_0         
	// 6830 12760:getfield        #12  <Field azh a>
	// 6831 12763:astore_1        
		abyte0.az = ((azh) (abyte0)).bi ^ a.az;
	// 6832 12764:aload_1         
	// 6833 12765:aload_1         
	// 6834 12766:getfield        #274 <Field int azh.bi>
	// 6835 12769:aload_0         
	// 6836 12770:getfield        #12  <Field azh a>
	// 6837 12773:getfield        #268 <Field int azh.az>
	// 6838 12776:ixor            
	// 6839 12777:putfield        #268 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 6840 12780:aload_0         
	// 6841 12781:getfield        #12  <Field azh a>
	// 6842 12784:astore_1        
		abyte0.cf = ((azh) (abyte0)).Q | a.cf;
	// 6843 12785:aload_1         
	// 6844 12786:aload_1         
	// 6845 12787:getfield        #487 <Field int azh.Q>
	// 6846 12790:aload_0         
	// 6847 12791:getfield        #12  <Field azh a>
	// 6848 12794:getfield        #91  <Field int azh.cf>
	// 6849 12797:ior             
	// 6850 12798:putfield        #91  <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 6851 12801:aload_0         
	// 6852 12802:getfield        #12  <Field azh a>
	// 6853 12805:astore_1        
		abyte0.cf = ((azh) (abyte0)).ch ^ a.cf;
	// 6854 12806:aload_1         
	// 6855 12807:aload_1         
	// 6856 12808:getfield        #271 <Field int azh.ch>
	// 6857 12811:aload_0         
	// 6858 12812:getfield        #12  <Field azh a>
	// 6859 12815:getfield        #91  <Field int azh.cf>
	// 6860 12818:ixor            
	// 6861 12819:putfield        #91  <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 6862 12822:aload_0         
	// 6863 12823:getfield        #12  <Field azh a>
	// 6864 12826:astore_1        
		abyte0.cf = ((azh) (abyte0)).cf & ~a.bu;
	// 6865 12827:aload_1         
	// 6866 12828:aload_1         
	// 6867 12829:getfield        #91  <Field int azh.cf>
	// 6868 12832:aload_0         
	// 6869 12833:getfield        #12  <Field azh a>
	// 6870 12836:getfield        #418 <Field int azh.bu>
	// 6871 12839:iconst_m1       
	// 6872 12840:ixor            
	// 6873 12841:iand            
	// 6874 12842:putfield        #91  <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 6875 12845:aload_0         
	// 6876 12846:getfield        #12  <Field azh a>
	// 6877 12849:astore_1        
		abyte0.cf = ((azh) (abyte0)).az ^ a.cf;
	// 6878 12850:aload_1         
	// 6879 12851:aload_1         
	// 6880 12852:getfield        #268 <Field int azh.az>
	// 6881 12855:aload_0         
	// 6882 12856:getfield        #12  <Field azh a>
	// 6883 12859:getfield        #91  <Field int azh.cf>
	// 6884 12862:ixor            
	// 6885 12863:putfield        #91  <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 6886 12866:aload_0         
	// 6887 12867:getfield        #12  <Field azh a>
	// 6888 12870:astore_1        
		abyte0.cf = ((azh) (abyte0)).cf ^ a.af;
	// 6889 12871:aload_1         
	// 6890 12872:aload_1         
	// 6891 12873:getfield        #91  <Field int azh.cf>
	// 6892 12876:aload_0         
	// 6893 12877:getfield        #12  <Field azh a>
	// 6894 12880:getfield        #385 <Field int azh.af>
	// 6895 12883:ixor            
	// 6896 12884:putfield        #91  <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 6897 12887:aload_0         
	// 6898 12888:getfield        #12  <Field azh a>
	// 6899 12891:astore_1        
		abyte0.az = ((azh) (abyte0)).cf & a.l;
	// 6900 12892:aload_1         
	// 6901 12893:aload_1         
	// 6902 12894:getfield        #91  <Field int azh.cf>
	// 6903 12897:aload_0         
	// 6904 12898:getfield        #12  <Field azh a>
	// 6905 12901:getfield        #112 <Field int azh.l>
	// 6906 12904:iand            
	// 6907 12905:putfield        #268 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 6908 12908:aload_0         
	// 6909 12909:getfield        #12  <Field azh a>
	// 6910 12912:astore_1        
		abyte0.ch = ((azh) (abyte0)).l ^ a.cf;
	// 6911 12913:aload_1         
	// 6912 12914:aload_1         
	// 6913 12915:getfield        #112 <Field int azh.l>
	// 6914 12918:aload_0         
	// 6915 12919:getfield        #12  <Field azh a>
	// 6916 12922:getfield        #91  <Field int azh.cf>
	// 6917 12925:ixor            
	// 6918 12926:putfield        #271 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 6919 12929:aload_0         
	// 6920 12930:getfield        #12  <Field azh a>
	// 6921 12933:astore_1        
		abyte0.ch = ((azh) (abyte0)).bE & ~a.ch;
	// 6922 12934:aload_1         
	// 6923 12935:aload_1         
	// 6924 12936:getfield        #56  <Field int azh.bE>
	// 6925 12939:aload_0         
	// 6926 12940:getfield        #12  <Field azh a>
	// 6927 12943:getfield        #271 <Field int azh.ch>
	// 6928 12946:iconst_m1       
	// 6929 12947:ixor            
	// 6930 12948:iand            
	// 6931 12949:putfield        #271 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 6932 12952:aload_0         
	// 6933 12953:getfield        #12  <Field azh a>
	// 6934 12956:astore_1        
		abyte0.ar = ((azh) (abyte0)).ar & ~a.Q;
	// 6935 12957:aload_1         
	// 6936 12958:aload_1         
	// 6937 12959:getfield        #256 <Field int azh.ar>
	// 6938 12962:aload_0         
	// 6939 12963:getfield        #12  <Field azh a>
	// 6940 12966:getfield        #487 <Field int azh.Q>
	// 6941 12969:iconst_m1       
	// 6942 12970:ixor            
	// 6943 12971:iand            
	// 6944 12972:putfield        #256 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 6945 12975:aload_0         
	// 6946 12976:getfield        #12  <Field azh a>
	// 6947 12979:astore_1        
		abyte0.ar = ((azh) (abyte0)).ba ^ a.ar;
	// 6948 12980:aload_1         
	// 6949 12981:aload_1         
	// 6950 12982:getfield        #59  <Field int azh.ba>
	// 6951 12985:aload_0         
	// 6952 12986:getfield        #12  <Field azh a>
	// 6953 12989:getfield        #256 <Field int azh.ar>
	// 6954 12992:ixor            
	// 6955 12993:putfield        #256 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 6956 12996:aload_0         
	// 6957 12997:getfield        #12  <Field azh a>
	// 6958 13000:astore_1        
		abyte0.bm = ((azh) (abyte0)).ar ^ a.bm;
	// 6959 13001:aload_1         
	// 6960 13002:aload_1         
	// 6961 13003:getfield        #256 <Field int azh.ar>
	// 6962 13006:aload_0         
	// 6963 13007:getfield        #12  <Field azh a>
	// 6964 13010:getfield        #68  <Field int azh.bm>
	// 6965 13013:ixor            
	// 6966 13014:putfield        #68  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 6967 13017:aload_0         
	// 6968 13018:getfield        #12  <Field azh a>
	// 6969 13021:astore_1        
		abyte0.V = ((azh) (abyte0)).bm ^ a.V;
	// 6970 13022:aload_1         
	// 6971 13023:aload_1         
	// 6972 13024:getfield        #68  <Field int azh.bm>
	// 6973 13027:aload_0         
	// 6974 13028:getfield        #12  <Field azh a>
	// 6975 13031:getfield        #493 <Field int azh.V>
	// 6976 13034:ixor            
	// 6977 13035:putfield        #493 <Field int azh.V>
		abyte0 = ((byte []) (a));
	// 6978 13038:aload_0         
	// 6979 13039:getfield        #12  <Field azh a>
	// 6980 13042:astore_1        
		abyte0.bm = ((azh) (abyte0)).V & ~a.N;
	// 6981 13043:aload_1         
	// 6982 13044:aload_1         
	// 6983 13045:getfield        #493 <Field int azh.V>
	// 6984 13048:aload_0         
	// 6985 13049:getfield        #12  <Field azh a>
	// 6986 13052:getfield        #199 <Field int azh.N>
	// 6987 13055:iconst_m1       
	// 6988 13056:ixor            
	// 6989 13057:iand            
	// 6990 13058:putfield        #68  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 6991 13061:aload_0         
	// 6992 13062:getfield        #12  <Field azh a>
	// 6993 13065:astore_1        
		abyte0.ar = ((azh) (abyte0)).V & ~a.N;
	// 6994 13066:aload_1         
	// 6995 13067:aload_1         
	// 6996 13068:getfield        #493 <Field int azh.V>
	// 6997 13071:aload_0         
	// 6998 13072:getfield        #12  <Field azh a>
	// 6999 13075:getfield        #199 <Field int azh.N>
	// 7000 13078:iconst_m1       
	// 7001 13079:ixor            
	// 7002 13080:iand            
	// 7003 13081:putfield        #256 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 7004 13084:aload_0         
	// 7005 13085:getfield        #12  <Field azh a>
	// 7006 13088:astore_1        
		abyte0.ar = ((azh) (abyte0)).N ^ a.ar;
	// 7007 13089:aload_1         
	// 7008 13090:aload_1         
	// 7009 13091:getfield        #199 <Field int azh.N>
	// 7010 13094:aload_0         
	// 7011 13095:getfield        #12  <Field azh a>
	// 7012 13098:getfield        #256 <Field int azh.ar>
	// 7013 13101:ixor            
	// 7014 13102:putfield        #256 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 7015 13105:aload_0         
	// 7016 13106:getfield        #12  <Field azh a>
	// 7017 13109:astore_1        
		abyte0.ba = ((azh) (abyte0)).V & a.N;
	// 7018 13110:aload_1         
	// 7019 13111:aload_1         
	// 7020 13112:getfield        #493 <Field int azh.V>
	// 7021 13115:aload_0         
	// 7022 13116:getfield        #12  <Field azh a>
	// 7023 13119:getfield        #199 <Field int azh.N>
	// 7024 13122:iand            
	// 7025 13123:putfield        #59  <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 7026 13126:aload_0         
	// 7027 13127:getfield        #12  <Field azh a>
	// 7028 13130:astore_1        
		abyte0.cd = ((azh) (abyte0)).d | a.cd;
	// 7029 13131:aload_1         
	// 7030 13132:aload_1         
	// 7031 13133:getfield        #337 <Field int azh.d>
	// 7032 13136:aload_0         
	// 7033 13137:getfield        #12  <Field azh a>
	// 7034 13140:getfield        #496 <Field int azh.cd>
	// 7035 13143:ior             
	// 7036 13144:putfield        #496 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 7037 13147:aload_0         
	// 7038 13148:getfield        #12  <Field azh a>
	// 7039 13151:astore_1        
		abyte0.cd = ((azh) (abyte0)).ca ^ a.cd;
	// 7040 13152:aload_1         
	// 7041 13153:aload_1         
	// 7042 13154:getfield        #472 <Field int azh.ca>
	// 7043 13157:aload_0         
	// 7044 13158:getfield        #12  <Field azh a>
	// 7045 13161:getfield        #496 <Field int azh.cd>
	// 7046 13164:ixor            
	// 7047 13165:putfield        #496 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 7048 13168:aload_0         
	// 7049 13169:getfield        #12  <Field azh a>
	// 7050 13172:astore_1        
		abyte0.J = ((azh) (abyte0)).cd ^ a.J;
	// 7051 13173:aload_1         
	// 7052 13174:aload_1         
	// 7053 13175:getfield        #496 <Field int azh.cd>
	// 7054 13178:aload_0         
	// 7055 13179:getfield        #12  <Field azh a>
	// 7056 13182:getfield        #343 <Field int azh.J>
	// 7057 13185:ixor            
	// 7058 13186:putfield        #343 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 7059 13189:aload_0         
	// 7060 13190:getfield        #12  <Field azh a>
	// 7061 13193:astore_1        
		abyte0.bR = ((azh) (abyte0)).J ^ a.bR;
	// 7062 13194:aload_1         
	// 7063 13195:aload_1         
	// 7064 13196:getfield        #343 <Field int azh.J>
	// 7065 13199:aload_0         
	// 7066 13200:getfield        #12  <Field azh a>
	// 7067 13203:getfield        #340 <Field int azh.bR>
	// 7068 13206:ixor            
	// 7069 13207:putfield        #340 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 7070 13210:aload_0         
	// 7071 13211:getfield        #12  <Field azh a>
	// 7072 13214:astore_1        
		abyte0.M = ((azh) (abyte0)).bR ^ a.M;
	// 7073 13215:aload_1         
	// 7074 13216:aload_1         
	// 7075 13217:getfield        #340 <Field int azh.bR>
	// 7076 13220:aload_0         
	// 7077 13221:getfield        #12  <Field azh a>
	// 7078 13224:getfield        #499 <Field int azh.M>
	// 7079 13227:ixor            
	// 7080 13228:putfield        #499 <Field int azh.M>
		abyte0 = ((byte []) (a));
	// 7081 13231:aload_0         
	// 7082 13232:getfield        #12  <Field azh a>
	// 7083 13235:astore_1        
		abyte0.bR = ((azh) (abyte0)).E & ~a.M;
	// 7084 13236:aload_1         
	// 7085 13237:aload_1         
	// 7086 13238:getfield        #32  <Field int azh.E>
	// 7087 13241:aload_0         
	// 7088 13242:getfield        #12  <Field azh a>
	// 7089 13245:getfield        #499 <Field int azh.M>
	// 7090 13248:iconst_m1       
	// 7091 13249:ixor            
	// 7092 13250:iand            
	// 7093 13251:putfield        #340 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 7094 13254:aload_0         
	// 7095 13255:getfield        #12  <Field azh a>
	// 7096 13258:astore_1        
		abyte0.bR = ((azh) (abyte0)).ac | a.bR;
	// 7097 13259:aload_1         
	// 7098 13260:aload_1         
	// 7099 13261:getfield        #259 <Field int azh.ac>
	// 7100 13264:aload_0         
	// 7101 13265:getfield        #12  <Field azh a>
	// 7102 13268:getfield        #340 <Field int azh.bR>
	// 7103 13271:ior             
	// 7104 13272:putfield        #340 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 7105 13275:aload_0         
	// 7106 13276:getfield        #12  <Field azh a>
	// 7107 13279:astore_1        
		abyte0.J = ((azh) (abyte0)).E & a.M;
	// 7108 13280:aload_1         
	// 7109 13281:aload_1         
	// 7110 13282:getfield        #32  <Field int azh.E>
	// 7111 13285:aload_0         
	// 7112 13286:getfield        #12  <Field azh a>
	// 7113 13289:getfield        #499 <Field int azh.M>
	// 7114 13292:iand            
	// 7115 13293:putfield        #343 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 7116 13296:aload_0         
	// 7117 13297:getfield        #12  <Field azh a>
	// 7118 13300:astore_1        
		abyte0.bB = ((azh) (abyte0)).M ^ a.bB;
	// 7119 13301:aload_1         
	// 7120 13302:aload_1         
	// 7121 13303:getfield        #499 <Field int azh.M>
	// 7122 13306:aload_0         
	// 7123 13307:getfield        #12  <Field azh a>
	// 7124 13310:getfield        #44  <Field int azh.bB>
	// 7125 13313:ixor            
	// 7126 13314:putfield        #44  <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 7127 13317:aload_0         
	// 7128 13318:getfield        #12  <Field azh a>
	// 7129 13321:astore_1        
		abyte0.bB = ((azh) (abyte0)).ac & a.bB;
	// 7130 13322:aload_1         
	// 7131 13323:aload_1         
	// 7132 13324:getfield        #259 <Field int azh.ac>
	// 7133 13327:aload_0         
	// 7134 13328:getfield        #12  <Field azh a>
	// 7135 13331:getfield        #44  <Field int azh.bB>
	// 7136 13334:iand            
	// 7137 13335:putfield        #44  <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 7138 13338:aload_0         
	// 7139 13339:getfield        #12  <Field azh a>
	// 7140 13342:astore_1        
		abyte0.cd = ((azh) (abyte0)).M ^ a.bC;
	// 7141 13343:aload_1         
	// 7142 13344:aload_1         
	// 7143 13345:getfield        #499 <Field int azh.M>
	// 7144 13348:aload_0         
	// 7145 13349:getfield        #12  <Field azh a>
	// 7146 13352:getfield        #400 <Field int azh.bC>
	// 7147 13355:ixor            
	// 7148 13356:putfield        #496 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 7149 13359:aload_0         
	// 7150 13360:getfield        #12  <Field azh a>
	// 7151 13363:astore_1        
		abyte0.cd = ((azh) (abyte0)).cd ^ a.o;
	// 7152 13364:aload_1         
	// 7153 13365:aload_1         
	// 7154 13366:getfield        #496 <Field int azh.cd>
	// 7155 13369:aload_0         
	// 7156 13370:getfield        #12  <Field azh a>
	// 7157 13373:getfield        #454 <Field int azh.o>
	// 7158 13376:ixor            
	// 7159 13377:putfield        #496 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 7160 13380:aload_0         
	// 7161 13381:getfield        #12  <Field azh a>
	// 7162 13384:astore_1        
		abyte0.ca = ((azh) (abyte0)).ae ^ a.M;
	// 7163 13385:aload_1         
	// 7164 13386:aload_1         
	// 7165 13387:getfield        #208 <Field int azh.ae>
	// 7166 13390:aload_0         
	// 7167 13391:getfield        #12  <Field azh a>
	// 7168 13394:getfield        #499 <Field int azh.M>
	// 7169 13397:ixor            
	// 7170 13398:putfield        #472 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 7171 13401:aload_0         
	// 7172 13402:getfield        #12  <Field azh a>
	// 7173 13405:astore_1        
		abyte0.bi = ((azh) (abyte0)).bC & ~a.ca;
	// 7174 13406:aload_1         
	// 7175 13407:aload_1         
	// 7176 13408:getfield        #400 <Field int azh.bC>
	// 7177 13411:aload_0         
	// 7178 13412:getfield        #12  <Field azh a>
	// 7179 13415:getfield        #472 <Field int azh.ca>
	// 7180 13418:iconst_m1       
	// 7181 13419:ixor            
	// 7182 13420:iand            
	// 7183 13421:putfield        #274 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 7184 13424:aload_0         
	// 7185 13425:getfield        #12  <Field azh a>
	// 7186 13428:astore_1        
		abyte0.ca = ((azh) (abyte0)).ca ^ a.bC;
	// 7187 13429:aload_1         
	// 7188 13430:aload_1         
	// 7189 13431:getfield        #472 <Field int azh.ca>
	// 7190 13434:aload_0         
	// 7191 13435:getfield        #12  <Field azh a>
	// 7192 13438:getfield        #400 <Field int azh.bC>
	// 7193 13441:ixor            
	// 7194 13442:putfield        #472 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 7195 13445:aload_0         
	// 7196 13446:getfield        #12  <Field azh a>
	// 7197 13449:astore_1        
		abyte0.ag = ((azh) (abyte0)).bC & ~a.M;
	// 7198 13450:aload_1         
	// 7199 13451:aload_1         
	// 7200 13452:getfield        #400 <Field int azh.bC>
	// 7201 13455:aload_0         
	// 7202 13456:getfield        #12  <Field azh a>
	// 7203 13459:getfield        #499 <Field int azh.M>
	// 7204 13462:iconst_m1       
	// 7205 13463:ixor            
	// 7206 13464:iand            
	// 7207 13465:putfield        #94  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 7208 13468:aload_0         
	// 7209 13469:getfield        #12  <Field azh a>
	// 7210 13472:astore_1        
		abyte0.ag = ((azh) (abyte0)).M ^ a.ag;
	// 7211 13473:aload_1         
	// 7212 13474:aload_1         
	// 7213 13475:getfield        #499 <Field int azh.M>
	// 7214 13478:aload_0         
	// 7215 13479:getfield        #12  <Field azh a>
	// 7216 13482:getfield        #94  <Field int azh.ag>
	// 7217 13485:ixor            
	// 7218 13486:putfield        #94  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 7219 13489:aload_0         
	// 7220 13490:getfield        #12  <Field azh a>
	// 7221 13493:astore_1        
		abyte0.bg = ((azh) (abyte0)).o & a.M;
	// 7222 13494:aload_1         
	// 7223 13495:aload_1         
	// 7224 13496:getfield        #454 <Field int azh.o>
	// 7225 13499:aload_0         
	// 7226 13500:getfield        #12  <Field azh a>
	// 7227 13503:getfield        #499 <Field int azh.M>
	// 7228 13506:iand            
	// 7229 13507:putfield        #478 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 7230 13510:aload_0         
	// 7231 13511:getfield        #12  <Field azh a>
	// 7232 13514:astore_1        
		abyte0.bX = ((azh) (abyte0)).U | a.M;
	// 7233 13515:aload_1         
	// 7234 13516:aload_1         
	// 7235 13517:getfield        #35  <Field int azh.U>
	// 7236 13520:aload_0         
	// 7237 13521:getfield        #12  <Field azh a>
	// 7238 13524:getfield        #499 <Field int azh.M>
	// 7239 13527:ior             
	// 7240 13528:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 7241 13531:aload_0         
	// 7242 13532:getfield        #12  <Field azh a>
	// 7243 13535:astore_1        
		abyte0.ay = ((azh) (abyte0)).E & ~a.bX;
	// 7244 13536:aload_1         
	// 7245 13537:aload_1         
	// 7246 13538:getfield        #32  <Field int azh.E>
	// 7247 13541:aload_0         
	// 7248 13542:getfield        #12  <Field azh a>
	// 7249 13545:getfield        #139 <Field int azh.bX>
	// 7250 13548:iconst_m1       
	// 7251 13549:ixor            
	// 7252 13550:iand            
	// 7253 13551:putfield        #253 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 7254 13554:aload_0         
	// 7255 13555:getfield        #12  <Field azh a>
	// 7256 13558:astore_1        
		abyte0.cj = ((azh) (abyte0)).E & ~a.bX;
	// 7257 13559:aload_1         
	// 7258 13560:aload_1         
	// 7259 13561:getfield        #32  <Field int azh.E>
	// 7260 13564:aload_0         
	// 7261 13565:getfield        #12  <Field azh a>
	// 7262 13568:getfield        #139 <Field int azh.bX>
	// 7263 13571:iconst_m1       
	// 7264 13572:ixor            
	// 7265 13573:iand            
	// 7266 13574:putfield        #475 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 7267 13577:aload_0         
	// 7268 13578:getfield        #12  <Field azh a>
	// 7269 13581:astore_1        
		abyte0.bM = ((azh) (abyte0)).bC & ~a.M;
	// 7270 13582:aload_1         
	// 7271 13583:aload_1         
	// 7272 13584:getfield        #400 <Field int azh.bC>
	// 7273 13587:aload_0         
	// 7274 13588:getfield        #12  <Field azh a>
	// 7275 13591:getfield        #499 <Field int azh.M>
	// 7276 13594:iconst_m1       
	// 7277 13595:ixor            
	// 7278 13596:iand            
	// 7279 13597:putfield        #349 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 7280 13600:aload_0         
	// 7281 13601:getfield        #12  <Field azh a>
	// 7282 13604:astore_1        
		abyte0.r = ((azh) (abyte0)).ae & ~a.M;
	// 7283 13605:aload_1         
	// 7284 13606:aload_1         
	// 7285 13607:getfield        #208 <Field int azh.ae>
	// 7286 13610:aload_0         
	// 7287 13611:getfield        #12  <Field azh a>
	// 7288 13614:getfield        #499 <Field int azh.M>
	// 7289 13617:iconst_m1       
	// 7290 13618:ixor            
	// 7291 13619:iand            
	// 7292 13620:putfield        #364 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 7293 13623:aload_0         
	// 7294 13624:getfield        #12  <Field azh a>
	// 7295 13627:astore_1        
		abyte0.bA = ((azh) (abyte0)).bC & a.r;
	// 7296 13628:aload_1         
	// 7297 13629:aload_1         
	// 7298 13630:getfield        #400 <Field int azh.bC>
	// 7299 13633:aload_0         
	// 7300 13634:getfield        #12  <Field azh a>
	// 7301 13637:getfield        #364 <Field int azh.r>
	// 7302 13640:iand            
	// 7303 13641:putfield        #463 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 7304 13644:aload_0         
	// 7305 13645:getfield        #12  <Field azh a>
	// 7306 13648:astore_1        
		abyte0.bA = ((azh) (abyte0)).o | a.bA;
	// 7307 13649:aload_1         
	// 7308 13650:aload_1         
	// 7309 13651:getfield        #454 <Field int azh.o>
	// 7310 13654:aload_0         
	// 7311 13655:getfield        #12  <Field azh a>
	// 7312 13658:getfield        #463 <Field int azh.bA>
	// 7313 13661:ior             
	// 7314 13662:putfield        #463 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 7315 13665:aload_0         
	// 7316 13666:getfield        #12  <Field azh a>
	// 7317 13669:astore_1        
		abyte0.cn = ((azh) (abyte0)).bC & ~a.r;
	// 7318 13670:aload_1         
	// 7319 13671:aload_1         
	// 7320 13672:getfield        #400 <Field int azh.bC>
	// 7321 13675:aload_0         
	// 7322 13676:getfield        #12  <Field azh a>
	// 7323 13679:getfield        #364 <Field int azh.r>
	// 7324 13682:iconst_m1       
	// 7325 13683:ixor            
	// 7326 13684:iand            
	// 7327 13685:putfield        #379 <Field int azh.cn>
		abyte0 = ((byte []) (a));
	// 7328 13688:aload_0         
	// 7329 13689:getfield        #12  <Field azh a>
	// 7330 13692:astore_1        
		abyte0.X = ((azh) (abyte0)).bC & a.r;
	// 7331 13693:aload_1         
	// 7332 13694:aload_1         
	// 7333 13695:getfield        #400 <Field int azh.bC>
	// 7334 13698:aload_0         
	// 7335 13699:getfield        #12  <Field azh a>
	// 7336 13702:getfield        #364 <Field int azh.r>
	// 7337 13705:iand            
	// 7338 13706:putfield        #355 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 7339 13709:aload_0         
	// 7340 13710:getfield        #12  <Field azh a>
	// 7341 13713:astore_1        
		abyte0.X = ((azh) (abyte0)).r ^ a.X;
	// 7342 13714:aload_1         
	// 7343 13715:aload_1         
	// 7344 13716:getfield        #364 <Field int azh.r>
	// 7345 13719:aload_0         
	// 7346 13720:getfield        #12  <Field azh a>
	// 7347 13723:getfield        #355 <Field int azh.X>
	// 7348 13726:ixor            
	// 7349 13727:putfield        #355 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 7350 13730:aload_0         
	// 7351 13731:getfield        #12  <Field azh a>
	// 7352 13734:astore_1        
		abyte0.X = ((azh) (abyte0)).o & a.X;
	// 7353 13735:aload_1         
	// 7354 13736:aload_1         
	// 7355 13737:getfield        #454 <Field int azh.o>
	// 7356 13740:aload_0         
	// 7357 13741:getfield        #12  <Field azh a>
	// 7358 13744:getfield        #355 <Field int azh.X>
	// 7359 13747:iand            
	// 7360 13748:putfield        #355 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 7361 13751:aload_0         
	// 7362 13752:getfield        #12  <Field azh a>
	// 7363 13755:astore_1        
		abyte0.X = ((azh) (abyte0)).E | a.X;
	// 7364 13756:aload_1         
	// 7365 13757:aload_1         
	// 7366 13758:getfield        #32  <Field int azh.E>
	// 7367 13761:aload_0         
	// 7368 13762:getfield        #12  <Field azh a>
	// 7369 13765:getfield        #355 <Field int azh.X>
	// 7370 13768:ior             
	// 7371 13769:putfield        #355 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 7372 13772:aload_0         
	// 7373 13773:getfield        #12  <Field azh a>
	// 7374 13776:astore_1        
		abyte0.r = ((azh) (abyte0)).M | a.r;
	// 7375 13777:aload_1         
	// 7376 13778:aload_1         
	// 7377 13779:getfield        #499 <Field int azh.M>
	// 7378 13782:aload_0         
	// 7379 13783:getfield        #12  <Field azh a>
	// 7380 13786:getfield        #364 <Field int azh.r>
	// 7381 13789:ior             
	// 7382 13790:putfield        #364 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 7383 13793:aload_0         
	// 7384 13794:getfield        #12  <Field azh a>
	// 7385 13797:astore_1        
		abyte0.bP = ((azh) (abyte0)).r ^ a.bC;
	// 7386 13798:aload_1         
	// 7387 13799:aload_1         
	// 7388 13800:getfield        #364 <Field int azh.r>
	// 7389 13803:aload_0         
	// 7390 13804:getfield        #12  <Field azh a>
	// 7391 13807:getfield        #400 <Field int azh.bC>
	// 7392 13810:ixor            
	// 7393 13811:putfield        #397 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 7394 13814:aload_0         
	// 7395 13815:getfield        #12  <Field azh a>
	// 7396 13818:astore_1        
		abyte0.bP = ((azh) (abyte0)).o & a.bP;
	// 7397 13819:aload_1         
	// 7398 13820:aload_1         
	// 7399 13821:getfield        #454 <Field int azh.o>
	// 7400 13824:aload_0         
	// 7401 13825:getfield        #12  <Field azh a>
	// 7402 13828:getfield        #397 <Field int azh.bP>
	// 7403 13831:iand            
	// 7404 13832:putfield        #397 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 7405 13835:aload_0         
	// 7406 13836:getfield        #12  <Field azh a>
	// 7407 13839:astore_1        
		abyte0.bi = ((azh) (abyte0)).r ^ a.bi;
	// 7408 13840:aload_1         
	// 7409 13841:aload_1         
	// 7410 13842:getfield        #364 <Field int azh.r>
	// 7411 13845:aload_0         
	// 7412 13846:getfield        #12  <Field azh a>
	// 7413 13849:getfield        #274 <Field int azh.bi>
	// 7414 13852:ixor            
	// 7415 13853:putfield        #274 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 7416 13856:aload_0         
	// 7417 13857:getfield        #12  <Field azh a>
	// 7418 13860:astore_1        
		abyte0.r = ((azh) (abyte0)).E & a.M;
	// 7419 13861:aload_1         
	// 7420 13862:aload_1         
	// 7421 13863:getfield        #32  <Field int azh.E>
	// 7422 13866:aload_0         
	// 7423 13867:getfield        #12  <Field azh a>
	// 7424 13870:getfield        #499 <Field int azh.M>
	// 7425 13873:iand            
	// 7426 13874:putfield        #364 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 7427 13877:aload_0         
	// 7428 13878:getfield        #12  <Field azh a>
	// 7429 13881:astore_1        
		abyte0.r = ((azh) (abyte0)).bX ^ a.r;
	// 7430 13882:aload_1         
	// 7431 13883:aload_1         
	// 7432 13884:getfield        #139 <Field int azh.bX>
	// 7433 13887:aload_0         
	// 7434 13888:getfield        #12  <Field azh a>
	// 7435 13891:getfield        #364 <Field int azh.r>
	// 7436 13894:ixor            
	// 7437 13895:putfield        #364 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 7438 13898:aload_0         
	// 7439 13899:getfield        #12  <Field azh a>
	// 7440 13902:astore_1        
		abyte0.R = ((azh) (abyte0)).U & a.M;
	// 7441 13903:aload_1         
	// 7442 13904:aload_1         
	// 7443 13905:getfield        #35  <Field int azh.U>
	// 7444 13908:aload_0         
	// 7445 13909:getfield        #12  <Field azh a>
	// 7446 13912:getfield        #499 <Field int azh.M>
	// 7447 13915:iand            
	// 7448 13916:putfield        #439 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 7449 13919:aload_0         
	// 7450 13920:getfield        #12  <Field azh a>
	// 7451 13923:astore_1        
		abyte0.R = ((azh) (abyte0)).E & a.R;
	// 7452 13924:aload_1         
	// 7453 13925:aload_1         
	// 7454 13926:getfield        #32  <Field int azh.E>
	// 7455 13929:aload_0         
	// 7456 13930:getfield        #12  <Field azh a>
	// 7457 13933:getfield        #439 <Field int azh.R>
	// 7458 13936:iand            
	// 7459 13937:putfield        #439 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 7460 13940:aload_0         
	// 7461 13941:getfield        #12  <Field azh a>
	// 7462 13944:astore_1        
		abyte0.R = ((azh) (abyte0)).M ^ a.R;
	// 7463 13945:aload_1         
	// 7464 13946:aload_1         
	// 7465 13947:getfield        #499 <Field int azh.M>
	// 7466 13950:aload_0         
	// 7467 13951:getfield        #12  <Field azh a>
	// 7468 13954:getfield        #439 <Field int azh.R>
	// 7469 13957:ixor            
	// 7470 13958:putfield        #439 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 7471 13961:aload_0         
	// 7472 13962:getfield        #12  <Field azh a>
	// 7473 13965:astore_1        
		abyte0.aa = ((azh) (abyte0)).U ^ a.M;
	// 7474 13966:aload_1         
	// 7475 13967:aload_1         
	// 7476 13968:getfield        #35  <Field int azh.U>
	// 7477 13971:aload_0         
	// 7478 13972:getfield        #12  <Field azh a>
	// 7479 13975:getfield        #499 <Field int azh.M>
	// 7480 13978:ixor            
	// 7481 13979:putfield        #328 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 7482 13982:aload_0         
	// 7483 13983:getfield        #12  <Field azh a>
	// 7484 13986:astore_1        
		abyte0.bo = ((azh) (abyte0)).E & a.aa;
	// 7485 13987:aload_1         
	// 7486 13988:aload_1         
	// 7487 13989:getfield        #32  <Field int azh.E>
	// 7488 13992:aload_0         
	// 7489 13993:getfield        #12  <Field azh a>
	// 7490 13996:getfield        #328 <Field int azh.aa>
	// 7491 13999:iand            
	// 7492 14000:putfield        #223 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7493 14003:aload_0         
	// 7494 14004:getfield        #12  <Field azh a>
	// 7495 14007:astore_1        
		abyte0.bo = ((azh) (abyte0)).M ^ a.bo;
	// 7496 14008:aload_1         
	// 7497 14009:aload_1         
	// 7498 14010:getfield        #499 <Field int azh.M>
	// 7499 14013:aload_0         
	// 7500 14014:getfield        #12  <Field azh a>
	// 7501 14017:getfield        #223 <Field int azh.bo>
	// 7502 14020:ixor            
	// 7503 14021:putfield        #223 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7504 14024:aload_0         
	// 7505 14025:getfield        #12  <Field azh a>
	// 7506 14028:astore_1        
		abyte0.bZ = ((azh) (abyte0)).ac & ~a.bo;
	// 7507 14029:aload_1         
	// 7508 14030:aload_1         
	// 7509 14031:getfield        #259 <Field int azh.ac>
	// 7510 14034:aload_0         
	// 7511 14035:getfield        #12  <Field azh a>
	// 7512 14038:getfield        #223 <Field int azh.bo>
	// 7513 14041:iconst_m1       
	// 7514 14042:ixor            
	// 7515 14043:iand            
	// 7516 14044:putfield        #415 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 7517 14047:aload_0         
	// 7518 14048:getfield        #12  <Field azh a>
	// 7519 14051:astore_1        
		abyte0.bo = ((azh) (abyte0)).ac | a.bo;
	// 7520 14052:aload_1         
	// 7521 14053:aload_1         
	// 7522 14054:getfield        #259 <Field int azh.ac>
	// 7523 14057:aload_0         
	// 7524 14058:getfield        #12  <Field azh a>
	// 7525 14061:getfield        #223 <Field int azh.bo>
	// 7526 14064:ior             
	// 7527 14065:putfield        #223 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7528 14068:aload_0         
	// 7529 14069:getfield        #12  <Field azh a>
	// 7530 14072:astore_1        
		abyte0.bf = ((azh) (abyte0)).E & ~a.aa;
	// 7531 14073:aload_1         
	// 7532 14074:aload_1         
	// 7533 14075:getfield        #32  <Field int azh.E>
	// 7534 14078:aload_0         
	// 7535 14079:getfield        #12  <Field azh a>
	// 7536 14082:getfield        #328 <Field int azh.aa>
	// 7537 14085:iconst_m1       
	// 7538 14086:ixor            
	// 7539 14087:iand            
	// 7540 14088:putfield        #184 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 7541 14091:aload_0         
	// 7542 14092:getfield        #12  <Field azh a>
	// 7543 14095:astore_1        
		abyte0.by = ((azh) (abyte0)).bf & ~a.ac;
	// 7544 14096:aload_1         
	// 7545 14097:aload_1         
	// 7546 14098:getfield        #184 <Field int azh.bf>
	// 7547 14101:aload_0         
	// 7548 14102:getfield        #12  <Field azh a>
	// 7549 14105:getfield        #259 <Field int azh.ac>
	// 7550 14108:iconst_m1       
	// 7551 14109:ixor            
	// 7552 14110:iand            
	// 7553 14111:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 7554 14114:aload_0         
	// 7555 14115:getfield        #12  <Field azh a>
	// 7556 14118:astore_1        
		abyte0.bf = ((azh) (abyte0)).bf & ~a.ac;
	// 7557 14119:aload_1         
	// 7558 14120:aload_1         
	// 7559 14121:getfield        #184 <Field int azh.bf>
	// 7560 14124:aload_0         
	// 7561 14125:getfield        #12  <Field azh a>
	// 7562 14128:getfield        #259 <Field int azh.ac>
	// 7563 14131:iconst_m1       
	// 7564 14132:ixor            
	// 7565 14133:iand            
	// 7566 14134:putfield        #184 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 7567 14137:aload_0         
	// 7568 14138:getfield        #12  <Field azh a>
	// 7569 14141:astore_1        
		abyte0.bf = ((azh) (abyte0)).R ^ a.bf;
	// 7570 14142:aload_1         
	// 7571 14143:aload_1         
	// 7572 14144:getfield        #439 <Field int azh.R>
	// 7573 14147:aload_0         
	// 7574 14148:getfield        #12  <Field azh a>
	// 7575 14151:getfield        #184 <Field int azh.bf>
	// 7576 14154:ixor            
	// 7577 14155:putfield        #184 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 7578 14158:aload_0         
	// 7579 14159:getfield        #12  <Field azh a>
	// 7580 14162:astore_1        
		abyte0.R = ((azh) (abyte0)).U & ~a.M;
	// 7581 14163:aload_1         
	// 7582 14164:aload_1         
	// 7583 14165:getfield        #35  <Field int azh.U>
	// 7584 14168:aload_0         
	// 7585 14169:getfield        #12  <Field azh a>
	// 7586 14172:getfield        #499 <Field int azh.M>
	// 7587 14175:iconst_m1       
	// 7588 14176:ixor            
	// 7589 14177:iand            
	// 7590 14178:putfield        #439 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 7591 14181:aload_0         
	// 7592 14182:getfield        #12  <Field azh a>
	// 7593 14185:astore_1        
		abyte0.at = ((azh) (abyte0)).M | a.R;
	// 7594 14186:aload_1         
	// 7595 14187:aload_1         
	// 7596 14188:getfield        #499 <Field int azh.M>
	// 7597 14191:aload_0         
	// 7598 14192:getfield        #12  <Field azh a>
	// 7599 14195:getfield        #439 <Field int azh.R>
	// 7600 14198:ior             
	// 7601 14199:putfield        #430 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 7602 14202:aload_0         
	// 7603 14203:getfield        #12  <Field azh a>
	// 7604 14206:astore_1        
		abyte0.ao = ((azh) (abyte0)).E & a.at;
	// 7605 14207:aload_1         
	// 7606 14208:aload_1         
	// 7607 14209:getfield        #32  <Field int azh.E>
	// 7608 14212:aload_0         
	// 7609 14213:getfield        #12  <Field azh a>
	// 7610 14216:getfield        #430 <Field int azh.at>
	// 7611 14219:iand            
	// 7612 14220:putfield        #238 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 7613 14223:aload_0         
	// 7614 14224:getfield        #12  <Field azh a>
	// 7615 14227:astore_1        
		abyte0.aX = ((azh) (abyte0)).at ^ a.aX;
	// 7616 14228:aload_1         
	// 7617 14229:aload_1         
	// 7618 14230:getfield        #430 <Field int azh.at>
	// 7619 14233:aload_0         
	// 7620 14234:getfield        #12  <Field azh a>
	// 7621 14237:getfield        #41  <Field int azh.aX>
	// 7622 14240:ixor            
	// 7623 14241:putfield        #41  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 7624 14244:aload_0         
	// 7625 14245:getfield        #12  <Field azh a>
	// 7626 14248:astore_1        
		abyte0.at = ((azh) (abyte0)).E & ~a.R;
	// 7627 14249:aload_1         
	// 7628 14250:aload_1         
	// 7629 14251:getfield        #32  <Field int azh.E>
	// 7630 14254:aload_0         
	// 7631 14255:getfield        #12  <Field azh a>
	// 7632 14258:getfield        #439 <Field int azh.R>
	// 7633 14261:iconst_m1       
	// 7634 14262:ixor            
	// 7635 14263:iand            
	// 7636 14264:putfield        #430 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 7637 14267:aload_0         
	// 7638 14268:getfield        #12  <Field azh a>
	// 7639 14271:astore_1        
		abyte0.at = ((azh) (abyte0)).aa ^ a.at;
	// 7640 14272:aload_1         
	// 7641 14273:aload_1         
	// 7642 14274:getfield        #328 <Field int azh.aa>
	// 7643 14277:aload_0         
	// 7644 14278:getfield        #12  <Field azh a>
	// 7645 14281:getfield        #430 <Field int azh.at>
	// 7646 14284:ixor            
	// 7647 14285:putfield        #430 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 7648 14288:aload_0         
	// 7649 14289:getfield        #12  <Field azh a>
	// 7650 14292:astore_1        
		abyte0.ap = ((azh) (abyte0)).R ^ a.ap;
	// 7651 14293:aload_1         
	// 7652 14294:aload_1         
	// 7653 14295:getfield        #439 <Field int azh.R>
	// 7654 14298:aload_0         
	// 7655 14299:getfield        #12  <Field azh a>
	// 7656 14302:getfield        #38  <Field int azh.ap>
	// 7657 14305:ixor            
	// 7658 14306:putfield        #38  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 7659 14309:aload_0         
	// 7660 14310:getfield        #12  <Field azh a>
	// 7661 14313:astore_1        
		abyte0.aa = ((azh) (abyte0)).ap & ~a.ac;
	// 7662 14314:aload_1         
	// 7663 14315:aload_1         
	// 7664 14316:getfield        #38  <Field int azh.ap>
	// 7665 14319:aload_0         
	// 7666 14320:getfield        #12  <Field azh a>
	// 7667 14323:getfield        #259 <Field int azh.ac>
	// 7668 14326:iconst_m1       
	// 7669 14327:ixor            
	// 7670 14328:iand            
	// 7671 14329:putfield        #328 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 7672 14332:aload_0         
	// 7673 14333:getfield        #12  <Field azh a>
	// 7674 14336:astore_1        
		abyte0.aa = ((azh) (abyte0)).at ^ a.aa;
	// 7675 14337:aload_1         
	// 7676 14338:aload_1         
	// 7677 14339:getfield        #430 <Field int azh.at>
	// 7678 14342:aload_0         
	// 7679 14343:getfield        #12  <Field azh a>
	// 7680 14346:getfield        #328 <Field int azh.aa>
	// 7681 14349:ixor            
	// 7682 14350:putfield        #328 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 7683 14353:aload_0         
	// 7684 14354:getfield        #12  <Field azh a>
	// 7685 14357:astore_1        
		abyte0.ap = ((azh) (abyte0)).ap ^ a.ac;
	// 7686 14358:aload_1         
	// 7687 14359:aload_1         
	// 7688 14360:getfield        #38  <Field int azh.ap>
	// 7689 14363:aload_0         
	// 7690 14364:getfield        #12  <Field azh a>
	// 7691 14367:getfield        #259 <Field int azh.ac>
	// 7692 14370:ixor            
	// 7693 14371:putfield        #38  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 7694 14374:aload_0         
	// 7695 14375:getfield        #12  <Field azh a>
	// 7696 14378:astore_1        
		abyte0.cj = ((azh) (abyte0)).R ^ a.cj;
	// 7697 14379:aload_1         
	// 7698 14380:aload_1         
	// 7699 14381:getfield        #439 <Field int azh.R>
	// 7700 14384:aload_0         
	// 7701 14385:getfield        #12  <Field azh a>
	// 7702 14388:getfield        #475 <Field int azh.cj>
	// 7703 14391:ixor            
	// 7704 14392:putfield        #475 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 7705 14395:aload_0         
	// 7706 14396:getfield        #12  <Field azh a>
	// 7707 14399:astore_1        
		abyte0.at = ((azh) (abyte0)).cj & ~a.ac;
	// 7708 14400:aload_1         
	// 7709 14401:aload_1         
	// 7710 14402:getfield        #475 <Field int azh.cj>
	// 7711 14405:aload_0         
	// 7712 14406:getfield        #12  <Field azh a>
	// 7713 14409:getfield        #259 <Field int azh.ac>
	// 7714 14412:iconst_m1       
	// 7715 14413:ixor            
	// 7716 14414:iand            
	// 7717 14415:putfield        #430 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 7718 14418:aload_0         
	// 7719 14419:getfield        #12  <Field azh a>
	// 7720 14422:astore_1        
		abyte0.at = ((azh) (abyte0)).r ^ a.at;
	// 7721 14423:aload_1         
	// 7722 14424:aload_1         
	// 7723 14425:getfield        #364 <Field int azh.r>
	// 7724 14428:aload_0         
	// 7725 14429:getfield        #12  <Field azh a>
	// 7726 14432:getfield        #430 <Field int azh.at>
	// 7727 14435:ixor            
	// 7728 14436:putfield        #430 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 7729 14439:aload_0         
	// 7730 14440:getfield        #12  <Field azh a>
	// 7731 14443:astore_1        
		abyte0.cj = ((azh) (abyte0)).cj & ~a.ac;
	// 7732 14444:aload_1         
	// 7733 14445:aload_1         
	// 7734 14446:getfield        #475 <Field int azh.cj>
	// 7735 14449:aload_0         
	// 7736 14450:getfield        #12  <Field azh a>
	// 7737 14453:getfield        #259 <Field int azh.ac>
	// 7738 14456:iconst_m1       
	// 7739 14457:ixor            
	// 7740 14458:iand            
	// 7741 14459:putfield        #475 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 7742 14462:aload_0         
	// 7743 14463:getfield        #12  <Field azh a>
	// 7744 14466:astore_1        
		abyte0.r = ((azh) (abyte0)).E & ~a.R;
	// 7745 14467:aload_1         
	// 7746 14468:aload_1         
	// 7747 14469:getfield        #32  <Field int azh.E>
	// 7748 14472:aload_0         
	// 7749 14473:getfield        #12  <Field azh a>
	// 7750 14476:getfield        #439 <Field int azh.R>
	// 7751 14479:iconst_m1       
	// 7752 14480:ixor            
	// 7753 14481:iand            
	// 7754 14482:putfield        #364 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 7755 14485:aload_0         
	// 7756 14486:getfield        #12  <Field azh a>
	// 7757 14489:astore_1        
		abyte0.R = ((azh) (abyte0)).E & ~a.R;
	// 7758 14490:aload_1         
	// 7759 14491:aload_1         
	// 7760 14492:getfield        #32  <Field int azh.E>
	// 7761 14495:aload_0         
	// 7762 14496:getfield        #12  <Field azh a>
	// 7763 14499:getfield        #439 <Field int azh.R>
	// 7764 14502:iconst_m1       
	// 7765 14503:ixor            
	// 7766 14504:iand            
	// 7767 14505:putfield        #439 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 7768 14508:aload_0         
	// 7769 14509:getfield        #12  <Field azh a>
	// 7770 14512:astore_1        
		abyte0.R = ((azh) (abyte0)).bX ^ a.R;
	// 7771 14513:aload_1         
	// 7772 14514:aload_1         
	// 7773 14515:getfield        #139 <Field int azh.bX>
	// 7774 14518:aload_0         
	// 7775 14519:getfield        #12  <Field azh a>
	// 7776 14522:getfield        #439 <Field int azh.R>
	// 7777 14525:ixor            
	// 7778 14526:putfield        #439 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 7779 14529:aload_0         
	// 7780 14530:getfield        #12  <Field azh a>
	// 7781 14533:astore_1        
		abyte0.R = ((azh) (abyte0)).ac | a.R;
	// 7782 14534:aload_1         
	// 7783 14535:aload_1         
	// 7784 14536:getfield        #259 <Field int azh.ac>
	// 7785 14539:aload_0         
	// 7786 14540:getfield        #12  <Field azh a>
	// 7787 14543:getfield        #439 <Field int azh.R>
	// 7788 14546:ior             
	// 7789 14547:putfield        #439 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 7790 14550:aload_0         
	// 7791 14551:getfield        #12  <Field azh a>
	// 7792 14554:astore_1        
		abyte0.R = ((azh) (abyte0)).aX ^ a.R;
	// 7793 14555:aload_1         
	// 7794 14556:aload_1         
	// 7795 14557:getfield        #41  <Field int azh.aX>
	// 7796 14560:aload_0         
	// 7797 14561:getfield        #12  <Field azh a>
	// 7798 14564:getfield        #439 <Field int azh.R>
	// 7799 14567:ixor            
	// 7800 14568:putfield        #439 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 7801 14571:aload_0         
	// 7802 14572:getfield        #12  <Field azh a>
	// 7803 14575:astore_1        
		abyte0.bX = ((azh) (abyte0)).M & ~a.U;
	// 7804 14576:aload_1         
	// 7805 14577:aload_1         
	// 7806 14578:getfield        #499 <Field int azh.M>
	// 7807 14581:aload_0         
	// 7808 14582:getfield        #12  <Field azh a>
	// 7809 14585:getfield        #35  <Field int azh.U>
	// 7810 14588:iconst_m1       
	// 7811 14589:ixor            
	// 7812 14590:iand            
	// 7813 14591:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 7814 14594:aload_0         
	// 7815 14595:getfield        #12  <Field azh a>
	// 7816 14598:astore_1        
		abyte0.cl = ((azh) (abyte0)).M & ~a.bX;
	// 7817 14599:aload_1         
	// 7818 14600:aload_1         
	// 7819 14601:getfield        #499 <Field int azh.M>
	// 7820 14604:aload_0         
	// 7821 14605:getfield        #12  <Field azh a>
	// 7822 14608:getfield        #139 <Field int azh.bX>
	// 7823 14611:iconst_m1       
	// 7824 14612:ixor            
	// 7825 14613:iand            
	// 7826 14614:putfield        #319 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 7827 14617:aload_0         
	// 7828 14618:getfield        #12  <Field azh a>
	// 7829 14621:astore_1        
		abyte0.cg = ((azh) (abyte0)).cl ^ a.cg;
	// 7830 14622:aload_1         
	// 7831 14623:aload_1         
	// 7832 14624:getfield        #319 <Field int azh.cl>
	// 7833 14627:aload_0         
	// 7834 14628:getfield        #12  <Field azh a>
	// 7835 14631:getfield        #29  <Field int azh.cg>
	// 7836 14634:ixor            
	// 7837 14635:putfield        #29  <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 7838 14638:aload_0         
	// 7839 14639:getfield        #12  <Field azh a>
	// 7840 14642:astore_1        
		abyte0.bW = ((azh) (abyte0)).cg ^ a.bW;
	// 7841 14643:aload_1         
	// 7842 14644:aload_1         
	// 7843 14645:getfield        #29  <Field int azh.cg>
	// 7844 14648:aload_0         
	// 7845 14649:getfield        #12  <Field azh a>
	// 7846 14652:getfield        #154 <Field int azh.bW>
	// 7847 14655:ixor            
	// 7848 14656:putfield        #154 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 7849 14659:aload_0         
	// 7850 14660:getfield        #12  <Field azh a>
	// 7851 14663:astore_1        
		abyte0.bR = ((azh) (abyte0)).cg ^ a.bR;
	// 7852 14664:aload_1         
	// 7853 14665:aload_1         
	// 7854 14666:getfield        #29  <Field int azh.cg>
	// 7855 14669:aload_0         
	// 7856 14670:getfield        #12  <Field azh a>
	// 7857 14673:getfield        #340 <Field int azh.bR>
	// 7858 14676:ixor            
	// 7859 14677:putfield        #340 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 7860 14680:aload_0         
	// 7861 14681:getfield        #12  <Field azh a>
	// 7862 14684:astore_1        
		abyte0.bo = ((azh) (abyte0)).cl ^ a.bo;
	// 7863 14685:aload_1         
	// 7864 14686:aload_1         
	// 7865 14687:getfield        #319 <Field int azh.cl>
	// 7866 14690:aload_0         
	// 7867 14691:getfield        #12  <Field azh a>
	// 7868 14694:getfield        #223 <Field int azh.bo>
	// 7869 14697:ixor            
	// 7870 14698:putfield        #223 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7871 14701:aload_0         
	// 7872 14702:getfield        #12  <Field azh a>
	// 7873 14705:astore_1        
		abyte0.J = ((azh) (abyte0)).cl ^ a.J;
	// 7874 14706:aload_1         
	// 7875 14707:aload_1         
	// 7876 14708:getfield        #319 <Field int azh.cl>
	// 7877 14711:aload_0         
	// 7878 14712:getfield        #12  <Field azh a>
	// 7879 14715:getfield        #343 <Field int azh.J>
	// 7880 14718:ixor            
	// 7881 14719:putfield        #343 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 7882 14722:aload_0         
	// 7883 14723:getfield        #12  <Field azh a>
	// 7884 14726:astore_1        
		abyte0.bZ = ((azh) (abyte0)).J ^ a.bZ;
	// 7885 14727:aload_1         
	// 7886 14728:aload_1         
	// 7887 14729:getfield        #343 <Field int azh.J>
	// 7888 14732:aload_0         
	// 7889 14733:getfield        #12  <Field azh a>
	// 7890 14736:getfield        #415 <Field int azh.bZ>
	// 7891 14739:ixor            
	// 7892 14740:putfield        #415 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 7893 14743:aload_0         
	// 7894 14744:getfield        #12  <Field azh a>
	// 7895 14747:astore_1        
		abyte0.J = ((azh) (abyte0)).ac | a.J;
	// 7896 14748:aload_1         
	// 7897 14749:aload_1         
	// 7898 14750:getfield        #259 <Field int azh.ac>
	// 7899 14753:aload_0         
	// 7900 14754:getfield        #12  <Field azh a>
	// 7901 14757:getfield        #343 <Field int azh.J>
	// 7902 14760:ior             
	// 7903 14761:putfield        #343 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 7904 14764:aload_0         
	// 7905 14765:getfield        #12  <Field azh a>
	// 7906 14768:astore_1        
		abyte0.ao = ((azh) (abyte0)).bX ^ a.ao;
	// 7907 14769:aload_1         
	// 7908 14770:aload_1         
	// 7909 14771:getfield        #139 <Field int azh.bX>
	// 7910 14774:aload_0         
	// 7911 14775:getfield        #12  <Field azh a>
	// 7912 14778:getfield        #238 <Field int azh.ao>
	// 7913 14781:ixor            
	// 7914 14782:putfield        #238 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 7915 14785:aload_0         
	// 7916 14786:getfield        #12  <Field azh a>
	// 7917 14789:astore_1        
		abyte0.by = ((azh) (abyte0)).ao ^ a.by;
	// 7918 14790:aload_1         
	// 7919 14791:aload_1         
	// 7920 14792:getfield        #238 <Field int azh.ao>
	// 7921 14795:aload_0         
	// 7922 14796:getfield        #12  <Field azh a>
	// 7923 14799:getfield        #244 <Field int azh.by>
	// 7924 14802:ixor            
	// 7925 14803:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 7926 14806:aload_0         
	// 7927 14807:getfield        #12  <Field azh a>
	// 7928 14810:astore_1        
		abyte0.ao = ((azh) (abyte0)).E & a.bX;
	// 7929 14811:aload_1         
	// 7930 14812:aload_1         
	// 7931 14813:getfield        #32  <Field int azh.E>
	// 7932 14816:aload_0         
	// 7933 14817:getfield        #12  <Field azh a>
	// 7934 14820:getfield        #139 <Field int azh.bX>
	// 7935 14823:iand            
	// 7936 14824:putfield        #238 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 7937 14827:aload_0         
	// 7938 14828:getfield        #12  <Field azh a>
	// 7939 14831:astore_1        
		abyte0.ao = ((azh) (abyte0)).ao & ~a.ac;
	// 7940 14832:aload_1         
	// 7941 14833:aload_1         
	// 7942 14834:getfield        #238 <Field int azh.ao>
	// 7943 14837:aload_0         
	// 7944 14838:getfield        #12  <Field azh a>
	// 7945 14841:getfield        #259 <Field int azh.ac>
	// 7946 14844:iconst_m1       
	// 7947 14845:ixor            
	// 7948 14846:iand            
	// 7949 14847:putfield        #238 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 7950 14850:aload_0         
	// 7951 14851:getfield        #12  <Field azh a>
	// 7952 14854:astore_1        
		abyte0.ao = ((azh) (abyte0)).ay ^ a.ao;
	// 7953 14855:aload_1         
	// 7954 14856:aload_1         
	// 7955 14857:getfield        #253 <Field int azh.ay>
	// 7956 14860:aload_0         
	// 7957 14861:getfield        #12  <Field azh a>
	// 7958 14864:getfield        #238 <Field int azh.ao>
	// 7959 14867:ixor            
	// 7960 14868:putfield        #238 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 7961 14871:aload_0         
	// 7962 14872:getfield        #12  <Field azh a>
	// 7963 14875:astore_1        
		abyte0.r = ((azh) (abyte0)).bX ^ a.r;
	// 7964 14876:aload_1         
	// 7965 14877:aload_1         
	// 7966 14878:getfield        #139 <Field int azh.bX>
	// 7967 14881:aload_0         
	// 7968 14882:getfield        #12  <Field azh a>
	// 7969 14885:getfield        #364 <Field int azh.r>
	// 7970 14888:ixor            
	// 7971 14889:putfield        #364 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 7972 14892:aload_0         
	// 7973 14893:getfield        #12  <Field azh a>
	// 7974 14896:astore_1        
		abyte0.cj = ((azh) (abyte0)).r ^ a.cj;
	// 7975 14897:aload_1         
	// 7976 14898:aload_1         
	// 7977 14899:getfield        #364 <Field int azh.r>
	// 7978 14902:aload_0         
	// 7979 14903:getfield        #12  <Field azh a>
	// 7980 14906:getfield        #475 <Field int azh.cj>
	// 7981 14909:ixor            
	// 7982 14910:putfield        #475 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 7983 14913:aload_0         
	// 7984 14914:getfield        #12  <Field azh a>
	// 7985 14917:astore_1        
		abyte0.bB = ((azh) (abyte0)).r ^ a.bB;
	// 7986 14918:aload_1         
	// 7987 14919:aload_1         
	// 7988 14920:getfield        #364 <Field int azh.r>
	// 7989 14923:aload_0         
	// 7990 14924:getfield        #12  <Field azh a>
	// 7991 14927:getfield        #44  <Field int azh.bB>
	// 7992 14930:ixor            
	// 7993 14931:putfield        #44  <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 7994 14934:aload_0         
	// 7995 14935:getfield        #12  <Field azh a>
	// 7996 14938:astore_1        
		abyte0.r = ((azh) (abyte0)).E & ~a.M;
	// 7997 14939:aload_1         
	// 7998 14940:aload_1         
	// 7999 14941:getfield        #32  <Field int azh.E>
	// 8000 14944:aload_0         
	// 8001 14945:getfield        #12  <Field azh a>
	// 8002 14948:getfield        #499 <Field int azh.M>
	// 8003 14951:iconst_m1       
	// 8004 14952:ixor            
	// 8005 14953:iand            
	// 8006 14954:putfield        #364 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 8007 14957:aload_0         
	// 8008 14958:getfield        #12  <Field azh a>
	// 8009 14961:astore_1        
		abyte0.r = ((azh) (abyte0)).M ^ a.r;
	// 8010 14962:aload_1         
	// 8011 14963:aload_1         
	// 8012 14964:getfield        #499 <Field int azh.M>
	// 8013 14967:aload_0         
	// 8014 14968:getfield        #12  <Field azh a>
	// 8015 14971:getfield        #364 <Field int azh.r>
	// 8016 14974:ixor            
	// 8017 14975:putfield        #364 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 8018 14978:aload_0         
	// 8019 14979:getfield        #12  <Field azh a>
	// 8020 14982:astore_1        
		abyte0.r = ((azh) (abyte0)).ac & ~a.r;
	// 8021 14983:aload_1         
	// 8022 14984:aload_1         
	// 8023 14985:getfield        #259 <Field int azh.ac>
	// 8024 14988:aload_0         
	// 8025 14989:getfield        #12  <Field azh a>
	// 8026 14992:getfield        #364 <Field int azh.r>
	// 8027 14995:iconst_m1       
	// 8028 14996:ixor            
	// 8029 14997:iand            
	// 8030 14998:putfield        #364 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 8031 15001:aload_0         
	// 8032 15002:getfield        #12  <Field azh a>
	// 8033 15005:astore_1        
		abyte0.r = ((azh) (abyte0)).aX ^ a.r;
	// 8034 15006:aload_1         
	// 8035 15007:aload_1         
	// 8036 15008:getfield        #41  <Field int azh.aX>
	// 8037 15011:aload_0         
	// 8038 15012:getfield        #12  <Field azh a>
	// 8039 15015:getfield        #364 <Field int azh.r>
	// 8040 15018:ixor            
	// 8041 15019:putfield        #364 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 8042 15022:aload_0         
	// 8043 15023:getfield        #12  <Field azh a>
	// 8044 15026:astore_1        
		abyte0.aX = ((azh) (abyte0)).ae & a.M;
	// 8045 15027:aload_1         
	// 8046 15028:aload_1         
	// 8047 15029:getfield        #208 <Field int azh.ae>
	// 8048 15032:aload_0         
	// 8049 15033:getfield        #12  <Field azh a>
	// 8050 15036:getfield        #499 <Field int azh.M>
	// 8051 15039:iand            
	// 8052 15040:putfield        #41  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 8053 15043:aload_0         
	// 8054 15044:getfield        #12  <Field azh a>
	// 8055 15047:astore_1        
		abyte0.bX = ((azh) (abyte0)).bC & a.aX;
	// 8056 15048:aload_1         
	// 8057 15049:aload_1         
	// 8058 15050:getfield        #400 <Field int azh.bC>
	// 8059 15053:aload_0         
	// 8060 15054:getfield        #12  <Field azh a>
	// 8061 15057:getfield        #41  <Field int azh.aX>
	// 8062 15060:iand            
	// 8063 15061:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 8064 15064:aload_0         
	// 8065 15065:getfield        #12  <Field azh a>
	// 8066 15068:astore_1        
		abyte0.aV = ((azh) (abyte0)).aX ^ a.aV;
	// 8067 15069:aload_1         
	// 8068 15070:aload_1         
	// 8069 15071:getfield        #41  <Field int azh.aX>
	// 8070 15074:aload_0         
	// 8071 15075:getfield        #12  <Field azh a>
	// 8072 15078:getfield        #502 <Field int azh.aV>
	// 8073 15081:ixor            
	// 8074 15082:putfield        #502 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 8075 15085:aload_0         
	// 8076 15086:getfield        #12  <Field azh a>
	// 8077 15089:astore_1        
		abyte0.aV = ((azh) (abyte0)).aV & ~a.o;
	// 8078 15090:aload_1         
	// 8079 15091:aload_1         
	// 8080 15092:getfield        #502 <Field int azh.aV>
	// 8081 15095:aload_0         
	// 8082 15096:getfield        #12  <Field azh a>
	// 8083 15099:getfield        #454 <Field int azh.o>
	// 8084 15102:iconst_m1       
	// 8085 15103:ixor            
	// 8086 15104:iand            
	// 8087 15105:putfield        #502 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 8088 15108:aload_0         
	// 8089 15109:getfield        #12  <Field azh a>
	// 8090 15112:astore_1        
		abyte0.aV = ((azh) (abyte0)).bi ^ a.aV;
	// 8091 15113:aload_1         
	// 8092 15114:aload_1         
	// 8093 15115:getfield        #274 <Field int azh.bi>
	// 8094 15118:aload_0         
	// 8095 15119:getfield        #12  <Field azh a>
	// 8096 15122:getfield        #502 <Field int azh.aV>
	// 8097 15125:ixor            
	// 8098 15126:putfield        #502 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 8099 15129:aload_0         
	// 8100 15130:getfield        #12  <Field azh a>
	// 8101 15133:astore_1        
		abyte0.aV = ((azh) (abyte0)).aV & ~a.E;
	// 8102 15134:aload_1         
	// 8103 15135:aload_1         
	// 8104 15136:getfield        #502 <Field int azh.aV>
	// 8105 15139:aload_0         
	// 8106 15140:getfield        #12  <Field azh a>
	// 8107 15143:getfield        #32  <Field int azh.E>
	// 8108 15146:iconst_m1       
	// 8109 15147:ixor            
	// 8110 15148:iand            
	// 8111 15149:putfield        #502 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 8112 15152:aload_0         
	// 8113 15153:getfield        #12  <Field azh a>
	// 8114 15156:astore_1        
		abyte0.cn = ((azh) (abyte0)).aX ^ a.cn;
	// 8115 15157:aload_1         
	// 8116 15158:aload_1         
	// 8117 15159:getfield        #41  <Field int azh.aX>
	// 8118 15162:aload_0         
	// 8119 15163:getfield        #12  <Field azh a>
	// 8120 15166:getfield        #379 <Field int azh.cn>
	// 8121 15169:ixor            
	// 8122 15170:putfield        #379 <Field int azh.cn>
		abyte0 = ((byte []) (a));
	// 8123 15173:aload_0         
	// 8124 15174:getfield        #12  <Field azh a>
	// 8125 15177:astore_1        
		abyte0.cn = ((azh) (abyte0)).cn & ~a.E;
	// 8126 15178:aload_1         
	// 8127 15179:aload_1         
	// 8128 15180:getfield        #379 <Field int azh.cn>
	// 8129 15183:aload_0         
	// 8130 15184:getfield        #12  <Field azh a>
	// 8131 15187:getfield        #32  <Field int azh.E>
	// 8132 15190:iconst_m1       
	// 8133 15191:ixor            
	// 8134 15192:iand            
	// 8135 15193:putfield        #379 <Field int azh.cn>
		abyte0 = ((byte []) (a));
	// 8136 15196:aload_0         
	// 8137 15197:getfield        #12  <Field azh a>
	// 8138 15200:astore_1        
		abyte0.aX = ((azh) (abyte0)).M | a.ae;
	// 8139 15201:aload_1         
	// 8140 15202:aload_1         
	// 8141 15203:getfield        #499 <Field int azh.M>
	// 8142 15206:aload_0         
	// 8143 15207:getfield        #12  <Field azh a>
	// 8144 15210:getfield        #208 <Field int azh.ae>
	// 8145 15213:ior             
	// 8146 15214:putfield        #41  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 8147 15217:aload_0         
	// 8148 15218:getfield        #12  <Field azh a>
	// 8149 15221:astore_1        
		abyte0.bM = ((azh) (abyte0)).aX ^ a.bM;
	// 8150 15222:aload_1         
	// 8151 15223:aload_1         
	// 8152 15224:getfield        #41  <Field int azh.aX>
	// 8153 15227:aload_0         
	// 8154 15228:getfield        #12  <Field azh a>
	// 8155 15231:getfield        #349 <Field int azh.bM>
	// 8156 15234:ixor            
	// 8157 15235:putfield        #349 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 8158 15238:aload_0         
	// 8159 15239:getfield        #12  <Field azh a>
	// 8160 15242:astore_1        
		abyte0.bM = ((azh) (abyte0)).bM | a.o;
	// 8161 15243:aload_1         
	// 8162 15244:aload_1         
	// 8163 15245:getfield        #349 <Field int azh.bM>
	// 8164 15248:aload_0         
	// 8165 15249:getfield        #12  <Field azh a>
	// 8166 15252:getfield        #454 <Field int azh.o>
	// 8167 15255:ior             
	// 8168 15256:putfield        #349 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 8169 15259:aload_0         
	// 8170 15260:getfield        #12  <Field azh a>
	// 8171 15263:astore_1        
		abyte0.bM = ((azh) (abyte0)).ag ^ a.bM;
	// 8172 15264:aload_1         
	// 8173 15265:aload_1         
	// 8174 15266:getfield        #94  <Field int azh.ag>
	// 8175 15269:aload_0         
	// 8176 15270:getfield        #12  <Field azh a>
	// 8177 15273:getfield        #349 <Field int azh.bM>
	// 8178 15276:ixor            
	// 8179 15277:putfield        #349 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 8180 15280:aload_0         
	// 8181 15281:getfield        #12  <Field azh a>
	// 8182 15284:astore_1        
		abyte0.bi = ((azh) (abyte0)).aX | a.E;
	// 8183 15285:aload_1         
	// 8184 15286:aload_1         
	// 8185 15287:getfield        #41  <Field int azh.aX>
	// 8186 15290:aload_0         
	// 8187 15291:getfield        #12  <Field azh a>
	// 8188 15294:getfield        #32  <Field int azh.E>
	// 8189 15297:ior             
	// 8190 15298:putfield        #274 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 8191 15301:aload_0         
	// 8192 15302:getfield        #12  <Field azh a>
	// 8193 15305:astore_1        
		abyte0.bi = ((azh) (abyte0)).bX ^ a.bi;
	// 8194 15306:aload_1         
	// 8195 15307:aload_1         
	// 8196 15308:getfield        #139 <Field int azh.bX>
	// 8197 15311:aload_0         
	// 8198 15312:getfield        #12  <Field azh a>
	// 8199 15315:getfield        #274 <Field int azh.bi>
	// 8200 15318:ixor            
	// 8201 15319:putfield        #274 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 8202 15322:aload_0         
	// 8203 15323:getfield        #12  <Field azh a>
	// 8204 15326:astore_1        
		abyte0.bi = ((azh) (abyte0)).bi & ~a.w;
	// 8205 15327:aload_1         
	// 8206 15328:aload_1         
	// 8207 15329:getfield        #274 <Field int azh.bi>
	// 8208 15332:aload_0         
	// 8209 15333:getfield        #12  <Field azh a>
	// 8210 15336:getfield        #505 <Field int azh.w>
	// 8211 15339:iconst_m1       
	// 8212 15340:ixor            
	// 8213 15341:iand            
	// 8214 15342:putfield        #274 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 8215 15345:aload_0         
	// 8216 15346:getfield        #12  <Field azh a>
	// 8217 15349:astore_1        
		abyte0.bX = ((azh) (abyte0)).M & ~a.ae;
	// 8218 15350:aload_1         
	// 8219 15351:aload_1         
	// 8220 15352:getfield        #499 <Field int azh.M>
	// 8221 15355:aload_0         
	// 8222 15356:getfield        #12  <Field azh a>
	// 8223 15359:getfield        #208 <Field int azh.ae>
	// 8224 15362:iconst_m1       
	// 8225 15363:ixor            
	// 8226 15364:iand            
	// 8227 15365:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 8228 15368:aload_0         
	// 8229 15369:getfield        #12  <Field azh a>
	// 8230 15372:astore_1        
		abyte0.ay = ((azh) (abyte0)).bC & ~a.bX;
	// 8231 15373:aload_1         
	// 8232 15374:aload_1         
	// 8233 15375:getfield        #400 <Field int azh.bC>
	// 8234 15378:aload_0         
	// 8235 15379:getfield        #12  <Field azh a>
	// 8236 15382:getfield        #139 <Field int azh.bX>
	// 8237 15385:iconst_m1       
	// 8238 15386:ixor            
	// 8239 15387:iand            
	// 8240 15388:putfield        #253 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 8241 15391:aload_0         
	// 8242 15392:getfield        #12  <Field azh a>
	// 8243 15395:astore_1        
		abyte0.ay = ((azh) (abyte0)).aX ^ a.ay;
	// 8244 15396:aload_1         
	// 8245 15397:aload_1         
	// 8246 15398:getfield        #41  <Field int azh.aX>
	// 8247 15401:aload_0         
	// 8248 15402:getfield        #12  <Field azh a>
	// 8249 15405:getfield        #253 <Field int azh.ay>
	// 8250 15408:ixor            
	// 8251 15409:putfield        #253 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 8252 15412:aload_0         
	// 8253 15413:getfield        #12  <Field azh a>
	// 8254 15416:astore_1        
		abyte0.cn = ((azh) (abyte0)).ay ^ a.cn;
	// 8255 15417:aload_1         
	// 8256 15418:aload_1         
	// 8257 15419:getfield        #253 <Field int azh.ay>
	// 8258 15422:aload_0         
	// 8259 15423:getfield        #12  <Field azh a>
	// 8260 15426:getfield        #379 <Field int azh.cn>
	// 8261 15429:ixor            
	// 8262 15430:putfield        #379 <Field int azh.cn>
		abyte0 = ((byte []) (a));
	// 8263 15433:aload_0         
	// 8264 15434:getfield        #12  <Field azh a>
	// 8265 15437:astore_1        
		abyte0.cn = ((azh) (abyte0)).cn | a.w;
	// 8266 15438:aload_1         
	// 8267 15439:aload_1         
	// 8268 15440:getfield        #379 <Field int azh.cn>
	// 8269 15443:aload_0         
	// 8270 15444:getfield        #12  <Field azh a>
	// 8271 15447:getfield        #505 <Field int azh.w>
	// 8272 15450:ior             
	// 8273 15451:putfield        #379 <Field int azh.cn>
		abyte0 = ((byte []) (a));
	// 8274 15454:aload_0         
	// 8275 15455:getfield        #12  <Field azh a>
	// 8276 15458:astore_1        
		abyte0.bP = ((azh) (abyte0)).ay ^ a.bP;
	// 8277 15459:aload_1         
	// 8278 15460:aload_1         
	// 8279 15461:getfield        #253 <Field int azh.ay>
	// 8280 15464:aload_0         
	// 8281 15465:getfield        #12  <Field azh a>
	// 8282 15468:getfield        #397 <Field int azh.bP>
	// 8283 15471:ixor            
	// 8284 15472:putfield        #397 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 8285 15475:aload_0         
	// 8286 15476:getfield        #12  <Field azh a>
	// 8287 15479:astore_1        
		abyte0.X = ((azh) (abyte0)).bP ^ a.X;
	// 8288 15480:aload_1         
	// 8289 15481:aload_1         
	// 8290 15482:getfield        #397 <Field int azh.bP>
	// 8291 15485:aload_0         
	// 8292 15486:getfield        #12  <Field azh a>
	// 8293 15489:getfield        #355 <Field int azh.X>
	// 8294 15492:ixor            
	// 8295 15493:putfield        #355 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 8296 15496:aload_0         
	// 8297 15497:getfield        #12  <Field azh a>
	// 8298 15500:astore_1        
		abyte0.bP = ((azh) (abyte0)).bC & ~a.bX;
	// 8299 15501:aload_1         
	// 8300 15502:aload_1         
	// 8301 15503:getfield        #400 <Field int azh.bC>
	// 8302 15506:aload_0         
	// 8303 15507:getfield        #12  <Field azh a>
	// 8304 15510:getfield        #139 <Field int azh.bX>
	// 8305 15513:iconst_m1       
	// 8306 15514:ixor            
	// 8307 15515:iand            
	// 8308 15516:putfield        #397 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 8309 15519:aload_0         
	// 8310 15520:getfield        #12  <Field azh a>
	// 8311 15523:astore_1        
		abyte0.ay = ((azh) (abyte0)).o & ~a.bP;
	// 8312 15524:aload_1         
	// 8313 15525:aload_1         
	// 8314 15526:getfield        #454 <Field int azh.o>
	// 8315 15529:aload_0         
	// 8316 15530:getfield        #12  <Field azh a>
	// 8317 15533:getfield        #397 <Field int azh.bP>
	// 8318 15536:iconst_m1       
	// 8319 15537:ixor            
	// 8320 15538:iand            
	// 8321 15539:putfield        #253 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 8322 15542:aload_0         
	// 8323 15543:getfield        #12  <Field azh a>
	// 8324 15546:astore_1        
		abyte0.ay = ((azh) (abyte0)).ag ^ a.ay;
	// 8325 15547:aload_1         
	// 8326 15548:aload_1         
	// 8327 15549:getfield        #94  <Field int azh.ag>
	// 8328 15552:aload_0         
	// 8329 15553:getfield        #12  <Field azh a>
	// 8330 15556:getfield        #253 <Field int azh.ay>
	// 8331 15559:ixor            
	// 8332 15560:putfield        #253 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 8333 15563:aload_0         
	// 8334 15564:getfield        #12  <Field azh a>
	// 8335 15567:astore_1        
		abyte0.ay = ((azh) (abyte0)).ay & ~a.E;
	// 8336 15568:aload_1         
	// 8337 15569:aload_1         
	// 8338 15570:getfield        #253 <Field int azh.ay>
	// 8339 15573:aload_0         
	// 8340 15574:getfield        #12  <Field azh a>
	// 8341 15577:getfield        #32  <Field int azh.E>
	// 8342 15580:iconst_m1       
	// 8343 15581:ixor            
	// 8344 15582:iand            
	// 8345 15583:putfield        #253 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 8346 15586:aload_0         
	// 8347 15587:getfield        #12  <Field azh a>
	// 8348 15590:astore_1        
		abyte0.bP = ((azh) (abyte0)).bP & ~a.o;
	// 8349 15591:aload_1         
	// 8350 15592:aload_1         
	// 8351 15593:getfield        #397 <Field int azh.bP>
	// 8352 15596:aload_0         
	// 8353 15597:getfield        #12  <Field azh a>
	// 8354 15600:getfield        #454 <Field int azh.o>
	// 8355 15603:iconst_m1       
	// 8356 15604:ixor            
	// 8357 15605:iand            
	// 8358 15606:putfield        #397 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 8359 15609:aload_0         
	// 8360 15610:getfield        #12  <Field azh a>
	// 8361 15613:astore_1        
		abyte0.bP = ((azh) (abyte0)).ca ^ a.bP;
	// 8362 15614:aload_1         
	// 8363 15615:aload_1         
	// 8364 15616:getfield        #472 <Field int azh.ca>
	// 8365 15619:aload_0         
	// 8366 15620:getfield        #12  <Field azh a>
	// 8367 15623:getfield        #397 <Field int azh.bP>
	// 8368 15626:ixor            
	// 8369 15627:putfield        #397 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 8370 15630:aload_0         
	// 8371 15631:getfield        #12  <Field azh a>
	// 8372 15634:astore_1        
		abyte0.ay = ((azh) (abyte0)).bP ^ a.ay;
	// 8373 15635:aload_1         
	// 8374 15636:aload_1         
	// 8375 15637:getfield        #397 <Field int azh.bP>
	// 8376 15640:aload_0         
	// 8377 15641:getfield        #12  <Field azh a>
	// 8378 15644:getfield        #253 <Field int azh.ay>
	// 8379 15647:ixor            
	// 8380 15648:putfield        #253 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 8381 15651:aload_0         
	// 8382 15652:getfield        #12  <Field azh a>
	// 8383 15655:astore_1        
		abyte0.bi = ((azh) (abyte0)).ay ^ a.bi;
	// 8384 15656:aload_1         
	// 8385 15657:aload_1         
	// 8386 15658:getfield        #253 <Field int azh.ay>
	// 8387 15661:aload_0         
	// 8388 15662:getfield        #12  <Field azh a>
	// 8389 15665:getfield        #274 <Field int azh.bi>
	// 8390 15668:ixor            
	// 8391 15669:putfield        #274 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 8392 15672:aload_0         
	// 8393 15673:getfield        #12  <Field azh a>
	// 8394 15676:astore_1        
		abyte0.D = ((azh) (abyte0)).bi ^ a.D;
	// 8395 15677:aload_1         
	// 8396 15678:aload_1         
	// 8397 15679:getfield        #274 <Field int azh.bi>
	// 8398 15682:aload_0         
	// 8399 15683:getfield        #12  <Field azh a>
	// 8400 15686:getfield        #508 <Field int azh.D>
	// 8401 15689:ixor            
	// 8402 15690:putfield        #508 <Field int azh.D>
		abyte0 = ((byte []) (a));
	// 8403 15693:aload_0         
	// 8404 15694:getfield        #12  <Field azh a>
	// 8405 15697:astore_1        
		abyte0.bi = ((azh) (abyte0)).bC & a.bX;
	// 8406 15698:aload_1         
	// 8407 15699:aload_1         
	// 8408 15700:getfield        #400 <Field int azh.bC>
	// 8409 15703:aload_0         
	// 8410 15704:getfield        #12  <Field azh a>
	// 8411 15707:getfield        #139 <Field int azh.bX>
	// 8412 15710:iand            
	// 8413 15711:putfield        #274 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 8414 15714:aload_0         
	// 8415 15715:getfield        #12  <Field azh a>
	// 8416 15718:astore_1        
		abyte0.bi = ((azh) (abyte0)).E | a.bi;
	// 8417 15719:aload_1         
	// 8418 15720:aload_1         
	// 8419 15721:getfield        #32  <Field int azh.E>
	// 8420 15724:aload_0         
	// 8421 15725:getfield        #12  <Field azh a>
	// 8422 15728:getfield        #274 <Field int azh.bi>
	// 8423 15731:ior             
	// 8424 15732:putfield        #274 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 8425 15735:aload_0         
	// 8426 15736:getfield        #12  <Field azh a>
	// 8427 15739:astore_1        
		abyte0.bi = ((azh) (abyte0)).bd ^ a.bi;
	// 8428 15740:aload_1         
	// 8429 15741:aload_1         
	// 8430 15742:getfield        #457 <Field int azh.bd>
	// 8431 15745:aload_0         
	// 8432 15746:getfield        #12  <Field azh a>
	// 8433 15749:getfield        #274 <Field int azh.bi>
	// 8434 15752:ixor            
	// 8435 15753:putfield        #274 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 8436 15756:aload_0         
	// 8437 15757:getfield        #12  <Field azh a>
	// 8438 15760:astore_1        
		abyte0.bi = ((azh) (abyte0)).w | a.bi;
	// 8439 15761:aload_1         
	// 8440 15762:aload_1         
	// 8441 15763:getfield        #505 <Field int azh.w>
	// 8442 15766:aload_0         
	// 8443 15767:getfield        #12  <Field azh a>
	// 8444 15770:getfield        #274 <Field int azh.bi>
	// 8445 15773:ior             
	// 8446 15774:putfield        #274 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 8447 15777:aload_0         
	// 8448 15778:getfield        #12  <Field azh a>
	// 8449 15781:astore_1        
		abyte0.bX = ((azh) (abyte0)).bC & a.bX;
	// 8450 15782:aload_1         
	// 8451 15783:aload_1         
	// 8452 15784:getfield        #400 <Field int azh.bC>
	// 8453 15787:aload_0         
	// 8454 15788:getfield        #12  <Field azh a>
	// 8455 15791:getfield        #139 <Field int azh.bX>
	// 8456 15794:iand            
	// 8457 15795:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 8458 15798:aload_0         
	// 8459 15799:getfield        #12  <Field azh a>
	// 8460 15802:astore_1        
		abyte0.bX = ((azh) (abyte0)).ae ^ a.bX;
	// 8461 15803:aload_1         
	// 8462 15804:aload_1         
	// 8463 15805:getfield        #208 <Field int azh.ae>
	// 8464 15808:aload_0         
	// 8465 15809:getfield        #12  <Field azh a>
	// 8466 15812:getfield        #139 <Field int azh.bX>
	// 8467 15815:ixor            
	// 8468 15816:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 8469 15819:aload_0         
	// 8470 15820:getfield        #12  <Field azh a>
	// 8471 15823:astore_1        
		abyte0.bd = ((azh) (abyte0)).o & ~a.bX;
	// 8472 15824:aload_1         
	// 8473 15825:aload_1         
	// 8474 15826:getfield        #454 <Field int azh.o>
	// 8475 15829:aload_0         
	// 8476 15830:getfield        #12  <Field azh a>
	// 8477 15833:getfield        #139 <Field int azh.bX>
	// 8478 15836:iconst_m1       
	// 8479 15837:ixor            
	// 8480 15838:iand            
	// 8481 15839:putfield        #457 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 8482 15842:aload_0         
	// 8483 15843:getfield        #12  <Field azh a>
	// 8484 15846:astore_1        
		abyte0.bd = ((azh) (abyte0)).ae ^ a.bd;
	// 8485 15847:aload_1         
	// 8486 15848:aload_1         
	// 8487 15849:getfield        #208 <Field int azh.ae>
	// 8488 15852:aload_0         
	// 8489 15853:getfield        #12  <Field azh a>
	// 8490 15856:getfield        #457 <Field int azh.bd>
	// 8491 15859:ixor            
	// 8492 15860:putfield        #457 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 8493 15863:aload_0         
	// 8494 15864:getfield        #12  <Field azh a>
	// 8495 15867:astore_1        
		abyte0.bd = ((azh) (abyte0)).E | a.bd;
	// 8496 15868:aload_1         
	// 8497 15869:aload_1         
	// 8498 15870:getfield        #32  <Field int azh.E>
	// 8499 15873:aload_0         
	// 8500 15874:getfield        #12  <Field azh a>
	// 8501 15877:getfield        #457 <Field int azh.bd>
	// 8502 15880:ior             
	// 8503 15881:putfield        #457 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 8504 15884:aload_0         
	// 8505 15885:getfield        #12  <Field azh a>
	// 8506 15888:astore_1        
		abyte0.bd = ((azh) (abyte0)).cd ^ a.bd;
	// 8507 15889:aload_1         
	// 8508 15890:aload_1         
	// 8509 15891:getfield        #496 <Field int azh.cd>
	// 8510 15894:aload_0         
	// 8511 15895:getfield        #12  <Field azh a>
	// 8512 15898:getfield        #457 <Field int azh.bd>
	// 8513 15901:ixor            
	// 8514 15902:putfield        #457 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 8515 15905:aload_0         
	// 8516 15906:getfield        #12  <Field azh a>
	// 8517 15909:astore_1        
		abyte0.bi = ((azh) (abyte0)).bd ^ a.bi;
	// 8518 15910:aload_1         
	// 8519 15911:aload_1         
	// 8520 15912:getfield        #457 <Field int azh.bd>
	// 8521 15915:aload_0         
	// 8522 15916:getfield        #12  <Field azh a>
	// 8523 15919:getfield        #274 <Field int azh.bi>
	// 8524 15922:ixor            
	// 8525 15923:putfield        #274 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 8526 15926:aload_0         
	// 8527 15927:getfield        #12  <Field azh a>
	// 8528 15930:astore_1        
		abyte0.bi = ((azh) (abyte0)).bi ^ a.aS;
	// 8529 15931:aload_1         
	// 8530 15932:aload_1         
	// 8531 15933:getfield        #274 <Field int azh.bi>
	// 8532 15936:aload_0         
	// 8533 15937:getfield        #12  <Field azh a>
	// 8534 15940:getfield        #47  <Field int azh.aS>
	// 8535 15943:ixor            
	// 8536 15944:putfield        #274 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 8537 15947:aload_0         
	// 8538 15948:getfield        #12  <Field azh a>
	// 8539 15951:astore_1        
		abyte0.bg = ((azh) (abyte0)).bX ^ a.bg;
	// 8540 15952:aload_1         
	// 8541 15953:aload_1         
	// 8542 15954:getfield        #139 <Field int azh.bX>
	// 8543 15957:aload_0         
	// 8544 15958:getfield        #12  <Field azh a>
	// 8545 15961:getfield        #478 <Field int azh.bg>
	// 8546 15964:ixor            
	// 8547 15965:putfield        #478 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 8548 15968:aload_0         
	// 8549 15969:getfield        #12  <Field azh a>
	// 8550 15972:astore_1        
		abyte0.bg = ((azh) (abyte0)).bg & ~a.E;
	// 8551 15973:aload_1         
	// 8552 15974:aload_1         
	// 8553 15975:getfield        #478 <Field int azh.bg>
	// 8554 15978:aload_0         
	// 8555 15979:getfield        #12  <Field azh a>
	// 8556 15982:getfield        #32  <Field int azh.E>
	// 8557 15985:iconst_m1       
	// 8558 15986:ixor            
	// 8559 15987:iand            
	// 8560 15988:putfield        #478 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 8561 15991:aload_0         
	// 8562 15992:getfield        #12  <Field azh a>
	// 8563 15995:astore_1        
		abyte0.bg = ((azh) (abyte0)).bM ^ a.bg;
	// 8564 15996:aload_1         
	// 8565 15997:aload_1         
	// 8566 15998:getfield        #349 <Field int azh.bM>
	// 8567 16001:aload_0         
	// 8568 16002:getfield        #12  <Field azh a>
	// 8569 16005:getfield        #478 <Field int azh.bg>
	// 8570 16008:ixor            
	// 8571 16009:putfield        #478 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 8572 16012:aload_0         
	// 8573 16013:getfield        #12  <Field azh a>
	// 8574 16016:astore_1        
		abyte0.bg = ((azh) (abyte0)).w | a.bg;
	// 8575 16017:aload_1         
	// 8576 16018:aload_1         
	// 8577 16019:getfield        #505 <Field int azh.w>
	// 8578 16022:aload_0         
	// 8579 16023:getfield        #12  <Field azh a>
	// 8580 16026:getfield        #478 <Field int azh.bg>
	// 8581 16029:ior             
	// 8582 16030:putfield        #478 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 8583 16033:aload_0         
	// 8584 16034:getfield        #12  <Field azh a>
	// 8585 16037:astore_1        
		abyte0.bg = ((azh) (abyte0)).X ^ a.bg;
	// 8586 16038:aload_1         
	// 8587 16039:aload_1         
	// 8588 16040:getfield        #355 <Field int azh.X>
	// 8589 16043:aload_0         
	// 8590 16044:getfield        #12  <Field azh a>
	// 8591 16047:getfield        #478 <Field int azh.bg>
	// 8592 16050:ixor            
	// 8593 16051:putfield        #478 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 8594 16054:aload_0         
	// 8595 16055:getfield        #12  <Field azh a>
	// 8596 16058:astore_1        
		abyte0.ad = ((azh) (abyte0)).bg ^ a.ad;
	// 8597 16059:aload_1         
	// 8598 16060:aload_1         
	// 8599 16061:getfield        #478 <Field int azh.bg>
	// 8600 16064:aload_0         
	// 8601 16065:getfield        #12  <Field azh a>
	// 8602 16068:getfield        #511 <Field int azh.ad>
	// 8603 16071:ixor            
	// 8604 16072:putfield        #511 <Field int azh.ad>
		abyte0 = ((byte []) (a));
	// 8605 16075:aload_0         
	// 8606 16076:getfield        #12  <Field azh a>
	// 8607 16079:astore_1        
		abyte0.bg = ((azh) (abyte0)).V & ~a.ad;
	// 8608 16080:aload_1         
	// 8609 16081:aload_1         
	// 8610 16082:getfield        #493 <Field int azh.V>
	// 8611 16085:aload_0         
	// 8612 16086:getfield        #12  <Field azh a>
	// 8613 16089:getfield        #511 <Field int azh.ad>
	// 8614 16092:iconst_m1       
	// 8615 16093:ixor            
	// 8616 16094:iand            
	// 8617 16095:putfield        #478 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 8618 16098:aload_0         
	// 8619 16099:getfield        #12  <Field azh a>
	// 8620 16102:astore_1        
		abyte0.bg = ((azh) (abyte0)).al | a.bg;
	// 8621 16103:aload_1         
	// 8622 16104:aload_1         
	// 8623 16105:getfield        #71  <Field int azh.al>
	// 8624 16108:aload_0         
	// 8625 16109:getfield        #12  <Field azh a>
	// 8626 16112:getfield        #478 <Field int azh.bg>
	// 8627 16115:ior             
	// 8628 16116:putfield        #478 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 8629 16119:aload_0         
	// 8630 16120:getfield        #12  <Field azh a>
	// 8631 16123:astore_1        
		abyte0.X = ((azh) (abyte0)).bC & ~a.M;
	// 8632 16124:aload_1         
	// 8633 16125:aload_1         
	// 8634 16126:getfield        #400 <Field int azh.bC>
	// 8635 16129:aload_0         
	// 8636 16130:getfield        #12  <Field azh a>
	// 8637 16133:getfield        #499 <Field int azh.M>
	// 8638 16136:iconst_m1       
	// 8639 16137:ixor            
	// 8640 16138:iand            
	// 8641 16139:putfield        #355 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 8642 16142:aload_0         
	// 8643 16143:getfield        #12  <Field azh a>
	// 8644 16146:astore_1        
		abyte0.X = ((azh) (abyte0)).ae ^ a.X;
	// 8645 16147:aload_1         
	// 8646 16148:aload_1         
	// 8647 16149:getfield        #208 <Field int azh.ae>
	// 8648 16152:aload_0         
	// 8649 16153:getfield        #12  <Field azh a>
	// 8650 16156:getfield        #355 <Field int azh.X>
	// 8651 16159:ixor            
	// 8652 16160:putfield        #355 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 8653 16163:aload_0         
	// 8654 16164:getfield        #12  <Field azh a>
	// 8655 16167:astore_1        
		abyte0.bA = ((azh) (abyte0)).X ^ a.bA;
	// 8656 16168:aload_1         
	// 8657 16169:aload_1         
	// 8658 16170:getfield        #355 <Field int azh.X>
	// 8659 16173:aload_0         
	// 8660 16174:getfield        #12  <Field azh a>
	// 8661 16177:getfield        #463 <Field int azh.bA>
	// 8662 16180:ixor            
	// 8663 16181:putfield        #463 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 8664 16184:aload_0         
	// 8665 16185:getfield        #12  <Field azh a>
	// 8666 16188:astore_1        
		abyte0.aV = ((azh) (abyte0)).bA ^ a.aV;
	// 8667 16189:aload_1         
	// 8668 16190:aload_1         
	// 8669 16191:getfield        #463 <Field int azh.bA>
	// 8670 16194:aload_0         
	// 8671 16195:getfield        #12  <Field azh a>
	// 8672 16198:getfield        #502 <Field int azh.aV>
	// 8673 16201:ixor            
	// 8674 16202:putfield        #502 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 8675 16205:aload_0         
	// 8676 16206:getfield        #12  <Field azh a>
	// 8677 16209:astore_1        
		abyte0.cn = ((azh) (abyte0)).aV ^ a.cn;
	// 8678 16210:aload_1         
	// 8679 16211:aload_1         
	// 8680 16212:getfield        #502 <Field int azh.aV>
	// 8681 16215:aload_0         
	// 8682 16216:getfield        #12  <Field azh a>
	// 8683 16219:getfield        #379 <Field int azh.cn>
	// 8684 16222:ixor            
	// 8685 16223:putfield        #379 <Field int azh.cn>
		abyte0 = ((byte []) (a));
	// 8686 16226:aload_0         
	// 8687 16227:getfield        #12  <Field azh a>
	// 8688 16230:astore_1        
		abyte0.Z = ((azh) (abyte0)).cn ^ a.Z;
	// 8689 16231:aload_1         
	// 8690 16232:aload_1         
	// 8691 16233:getfield        #379 <Field int azh.cn>
	// 8692 16236:aload_0         
	// 8693 16237:getfield        #12  <Field azh a>
	// 8694 16240:getfield        #514 <Field int azh.Z>
	// 8695 16243:ixor            
	// 8696 16244:putfield        #514 <Field int azh.Z>
		abyte0 = ((byte []) (a));
	// 8697 16247:aload_0         
	// 8698 16248:getfield        #12  <Field azh a>
	// 8699 16251:astore_1        
		abyte0.cn = ((azh) (abyte0)).H | a.Z;
	// 8700 16252:aload_1         
	// 8701 16253:aload_1         
	// 8702 16254:getfield        #451 <Field int azh.H>
	// 8703 16257:aload_0         
	// 8704 16258:getfield        #12  <Field azh a>
	// 8705 16261:getfield        #514 <Field int azh.Z>
	// 8706 16264:ior             
	// 8707 16265:putfield        #379 <Field int azh.cn>
		abyte0 = ((byte []) (a));
	// 8708 16268:aload_0         
	// 8709 16269:getfield        #12  <Field azh a>
	// 8710 16272:astore_1        
		abyte0.aN = ((azh) (abyte0)).d & ~a.aN;
	// 8711 16273:aload_1         
	// 8712 16274:aload_1         
	// 8713 16275:getfield        #337 <Field int azh.d>
	// 8714 16278:aload_0         
	// 8715 16279:getfield        #12  <Field azh a>
	// 8716 16282:getfield        #481 <Field int azh.aN>
	// 8717 16285:iconst_m1       
	// 8718 16286:ixor            
	// 8719 16287:iand            
	// 8720 16288:putfield        #481 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 8721 16291:aload_0         
	// 8722 16292:getfield        #12  <Field azh a>
	// 8723 16295:astore_1        
		abyte0.ah = ((azh) (abyte0)).aN ^ a.ah;
	// 8724 16296:aload_1         
	// 8725 16297:aload_1         
	// 8726 16298:getfield        #481 <Field int azh.aN>
	// 8727 16301:aload_0         
	// 8728 16302:getfield        #12  <Field azh a>
	// 8729 16305:getfield        #394 <Field int azh.ah>
	// 8730 16308:ixor            
	// 8731 16309:putfield        #394 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 8732 16312:aload_0         
	// 8733 16313:getfield        #12  <Field azh a>
	// 8734 16316:astore_1        
		abyte0.ah = ((azh) (abyte0)).bz | a.ah;
	// 8735 16317:aload_1         
	// 8736 16318:aload_1         
	// 8737 16319:getfield        #466 <Field int azh.bz>
	// 8738 16322:aload_0         
	// 8739 16323:getfield        #12  <Field azh a>
	// 8740 16326:getfield        #394 <Field int azh.ah>
	// 8741 16329:ior             
	// 8742 16330:putfield        #394 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 8743 16333:aload_0         
	// 8744 16334:getfield        #12  <Field azh a>
	// 8745 16337:astore_1        
		abyte0.ah = ((azh) (abyte0)).ce ^ a.ah;
	// 8746 16338:aload_1         
	// 8747 16339:aload_1         
	// 8748 16340:getfield        #469 <Field int azh.ce>
	// 8749 16343:aload_0         
	// 8750 16344:getfield        #12  <Field azh a>
	// 8751 16347:getfield        #394 <Field int azh.ah>
	// 8752 16350:ixor            
	// 8753 16351:putfield        #394 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 8754 16354:aload_0         
	// 8755 16355:getfield        #12  <Field azh a>
	// 8756 16358:astore_1        
		abyte0.y = ((azh) (abyte0)).ah ^ a.y;
	// 8757 16359:aload_1         
	// 8758 16360:aload_1         
	// 8759 16361:getfield        #394 <Field int azh.ah>
	// 8760 16364:aload_0         
	// 8761 16365:getfield        #12  <Field azh a>
	// 8762 16368:getfield        #517 <Field int azh.y>
	// 8763 16371:ixor            
	// 8764 16372:putfield        #517 <Field int azh.y>
		abyte0 = ((byte []) (a));
	// 8765 16375:aload_0         
	// 8766 16376:getfield        #12  <Field azh a>
	// 8767 16379:astore_1        
		abyte0.aZ = ((azh) (abyte0)).y & ~a.aZ;
	// 8768 16380:aload_1         
	// 8769 16381:aload_1         
	// 8770 16382:getfield        #517 <Field int azh.y>
	// 8771 16385:aload_0         
	// 8772 16386:getfield        #12  <Field azh a>
	// 8773 16389:getfield        #175 <Field int azh.aZ>
	// 8774 16392:iconst_m1       
	// 8775 16393:ixor            
	// 8776 16394:iand            
	// 8777 16395:putfield        #175 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 8778 16398:aload_0         
	// 8779 16399:getfield        #12  <Field azh a>
	// 8780 16402:astore_1        
		abyte0.aZ = ((azh) (abyte0)).b ^ a.aZ;
	// 8781 16403:aload_1         
	// 8782 16404:aload_1         
	// 8783 16405:getfield        #304 <Field int azh.b>
	// 8784 16408:aload_0         
	// 8785 16409:getfield        #12  <Field azh a>
	// 8786 16412:getfield        #175 <Field int azh.aZ>
	// 8787 16415:ixor            
	// 8788 16416:putfield        #175 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 8789 16419:aload_0         
	// 8790 16420:getfield        #12  <Field azh a>
	// 8791 16423:astore_1        
		abyte0.bv = ((azh) (abyte0)).y & a.bv;
	// 8792 16424:aload_1         
	// 8793 16425:aload_1         
	// 8794 16426:getfield        #517 <Field int azh.y>
	// 8795 16429:aload_0         
	// 8796 16430:getfield        #12  <Field azh a>
	// 8797 16433:getfield        #82  <Field int azh.bv>
	// 8798 16436:iand            
	// 8799 16437:putfield        #82  <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 8800 16440:aload_0         
	// 8801 16441:getfield        #12  <Field azh a>
	// 8802 16444:astore_1        
		abyte0.bv = ((azh) (abyte0)).am ^ a.bv;
	// 8803 16445:aload_1         
	// 8804 16446:aload_1         
	// 8805 16447:getfield        #121 <Field int azh.am>
	// 8806 16450:aload_0         
	// 8807 16451:getfield        #12  <Field azh a>
	// 8808 16454:getfield        #82  <Field int azh.bv>
	// 8809 16457:ixor            
	// 8810 16458:putfield        #82  <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 8811 16461:aload_0         
	// 8812 16462:getfield        #12  <Field azh a>
	// 8813 16465:astore_1        
		abyte0.aC = ((azh) (abyte0)).y & ~a.aC;
	// 8814 16466:aload_1         
	// 8815 16467:aload_1         
	// 8816 16468:getfield        #517 <Field int azh.y>
	// 8817 16471:aload_0         
	// 8818 16472:getfield        #12  <Field azh a>
	// 8819 16475:getfield        #88  <Field int azh.aC>
	// 8820 16478:iconst_m1       
	// 8821 16479:ixor            
	// 8822 16480:iand            
	// 8823 16481:putfield        #88  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 8824 16484:aload_0         
	// 8825 16485:getfield        #12  <Field azh a>
	// 8826 16488:astore_1        
		abyte0.aC = ((azh) (abyte0)).B ^ a.aC;
	// 8827 16489:aload_1         
	// 8828 16490:aload_1         
	// 8829 16491:getfield        #142 <Field int azh.B>
	// 8830 16494:aload_0         
	// 8831 16495:getfield        #12  <Field azh a>
	// 8832 16498:getfield        #88  <Field int azh.aC>
	// 8833 16501:ixor            
	// 8834 16502:putfield        #88  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 8835 16505:aload_0         
	// 8836 16506:getfield        #12  <Field azh a>
	// 8837 16509:astore_1        
		abyte0.aC = ((azh) (abyte0)).c | a.aC;
	// 8838 16510:aload_1         
	// 8839 16511:aload_1         
	// 8840 16512:getfield        #433 <Field int azh.c>
	// 8841 16515:aload_0         
	// 8842 16516:getfield        #12  <Field azh a>
	// 8843 16519:getfield        #88  <Field int azh.aC>
	// 8844 16522:ior             
	// 8845 16523:putfield        #88  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 8846 16526:aload_0         
	// 8847 16527:getfield        #12  <Field azh a>
	// 8848 16530:astore_1        
		abyte0.aC = ((azh) (abyte0)).bv ^ a.aC;
	// 8849 16531:aload_1         
	// 8850 16532:aload_1         
	// 8851 16533:getfield        #82  <Field int azh.bv>
	// 8852 16536:aload_0         
	// 8853 16537:getfield        #12  <Field azh a>
	// 8854 16540:getfield        #88  <Field int azh.aC>
	// 8855 16543:ixor            
	// 8856 16544:putfield        #88  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 8857 16547:aload_0         
	// 8858 16548:getfield        #12  <Field azh a>
	// 8859 16551:astore_1        
		abyte0.aL = ((azh) (abyte0)).aC ^ a.aL;
	// 8860 16552:aload_1         
	// 8861 16553:aload_1         
	// 8862 16554:getfield        #88  <Field int azh.aC>
	// 8863 16557:aload_0         
	// 8864 16558:getfield        #12  <Field azh a>
	// 8865 16561:getfield        #109 <Field int azh.aL>
	// 8866 16564:ixor            
	// 8867 16565:putfield        #109 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 8868 16568:aload_0         
	// 8869 16569:getfield        #12  <Field azh a>
	// 8870 16572:astore_1        
		abyte0.n = ((azh) (abyte0)).y & a.n;
	// 8871 16573:aload_1         
	// 8872 16574:aload_1         
	// 8873 16575:getfield        #517 <Field int azh.y>
	// 8874 16578:aload_0         
	// 8875 16579:getfield        #12  <Field azh a>
	// 8876 16582:getfield        #310 <Field int azh.n>
	// 8877 16585:iand            
	// 8878 16586:putfield        #310 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 8879 16589:aload_0         
	// 8880 16590:getfield        #12  <Field azh a>
	// 8881 16593:astore_1        
		abyte0.n = ((azh) (abyte0)).bN ^ a.n;
	// 8882 16594:aload_1         
	// 8883 16595:aload_1         
	// 8884 16596:getfield        #85  <Field int azh.bN>
	// 8885 16599:aload_0         
	// 8886 16600:getfield        #12  <Field azh a>
	// 8887 16603:getfield        #310 <Field int azh.n>
	// 8888 16606:ixor            
	// 8889 16607:putfield        #310 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 8890 16610:aload_0         
	// 8891 16611:getfield        #12  <Field azh a>
	// 8892 16614:astore_1        
		abyte0.n = ((azh) (abyte0)).n & ~a.c;
	// 8893 16615:aload_1         
	// 8894 16616:aload_1         
	// 8895 16617:getfield        #310 <Field int azh.n>
	// 8896 16620:aload_0         
	// 8897 16621:getfield        #12  <Field azh a>
	// 8898 16624:getfield        #433 <Field int azh.c>
	// 8899 16627:iconst_m1       
	// 8900 16628:ixor            
	// 8901 16629:iand            
	// 8902 16630:putfield        #310 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 8903 16633:aload_0         
	// 8904 16634:getfield        #12  <Field azh a>
	// 8905 16637:astore_1        
		abyte0.bc = ((azh) (abyte0)).y & a.bc;
	// 8906 16638:aload_1         
	// 8907 16639:aload_1         
	// 8908 16640:getfield        #517 <Field int azh.y>
	// 8909 16643:aload_0         
	// 8910 16644:getfield        #12  <Field azh a>
	// 8911 16647:getfield        #106 <Field int azh.bc>
	// 8912 16650:iand            
	// 8913 16651:putfield        #106 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 8914 16654:aload_0         
	// 8915 16655:getfield        #12  <Field azh a>
	// 8916 16658:astore_1        
		abyte0.bc = ((azh) (abyte0)).bh ^ a.bc;
	// 8917 16659:aload_1         
	// 8918 16660:aload_1         
	// 8919 16661:getfield        #53  <Field int azh.bh>
	// 8920 16664:aload_0         
	// 8921 16665:getfield        #12  <Field azh a>
	// 8922 16668:getfield        #106 <Field int azh.bc>
	// 8923 16671:ixor            
	// 8924 16672:putfield        #106 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 8925 16675:aload_0         
	// 8926 16676:getfield        #12  <Field azh a>
	// 8927 16679:astore_1        
		abyte0.bc = ((azh) (abyte0)).c | a.bc;
	// 8928 16680:aload_1         
	// 8929 16681:aload_1         
	// 8930 16682:getfield        #433 <Field int azh.c>
	// 8931 16685:aload_0         
	// 8932 16686:getfield        #12  <Field azh a>
	// 8933 16689:getfield        #106 <Field int azh.bc>
	// 8934 16692:ior             
	// 8935 16693:putfield        #106 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 8936 16696:aload_0         
	// 8937 16697:getfield        #12  <Field azh a>
	// 8938 16700:astore_1        
		abyte0.bh = ((azh) (abyte0)).y & ~a.aA;
	// 8939 16701:aload_1         
	// 8940 16702:aload_1         
	// 8941 16703:getfield        #517 <Field int azh.y>
	// 8942 16706:aload_0         
	// 8943 16707:getfield        #12  <Field azh a>
	// 8944 16710:getfield        #307 <Field int azh.aA>
	// 8945 16713:iconst_m1       
	// 8946 16714:ixor            
	// 8947 16715:iand            
	// 8948 16716:putfield        #53  <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 8949 16719:aload_0         
	// 8950 16720:getfield        #12  <Field azh a>
	// 8951 16723:astore_1        
		abyte0.bh = ((azh) (abyte0)).aA ^ a.bh;
	// 8952 16724:aload_1         
	// 8953 16725:aload_1         
	// 8954 16726:getfield        #307 <Field int azh.aA>
	// 8955 16729:aload_0         
	// 8956 16730:getfield        #12  <Field azh a>
	// 8957 16733:getfield        #53  <Field int azh.bh>
	// 8958 16736:ixor            
	// 8959 16737:putfield        #53  <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 8960 16740:aload_0         
	// 8961 16741:getfield        #12  <Field azh a>
	// 8962 16744:astore_1        
		abyte0.bh = ((azh) (abyte0)).bh & ~a.c;
	// 8963 16745:aload_1         
	// 8964 16746:aload_1         
	// 8965 16747:getfield        #53  <Field int azh.bh>
	// 8966 16750:aload_0         
	// 8967 16751:getfield        #12  <Field azh a>
	// 8968 16754:getfield        #433 <Field int azh.c>
	// 8969 16757:iconst_m1       
	// 8970 16758:ixor            
	// 8971 16759:iand            
	// 8972 16760:putfield        #53  <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 8973 16763:aload_0         
	// 8974 16764:getfield        #12  <Field azh a>
	// 8975 16767:astore_1        
		abyte0.bh = ((azh) (abyte0)).aZ ^ a.bh;
	// 8976 16768:aload_1         
	// 8977 16769:aload_1         
	// 8978 16770:getfield        #175 <Field int azh.aZ>
	// 8979 16773:aload_0         
	// 8980 16774:getfield        #12  <Field azh a>
	// 8981 16777:getfield        #53  <Field int azh.bh>
	// 8982 16780:ixor            
	// 8983 16781:putfield        #53  <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 8984 16784:aload_0         
	// 8985 16785:getfield        #12  <Field azh a>
	// 8986 16788:astore_1        
		abyte0.p = ((azh) (abyte0)).bh ^ a.p;
	// 8987 16789:aload_1         
	// 8988 16790:aload_1         
	// 8989 16791:getfield        #53  <Field int azh.bh>
	// 8990 16794:aload_0         
	// 8991 16795:getfield        #12  <Field azh a>
	// 8992 16798:getfield        #178 <Field int azh.p>
	// 8993 16801:ixor            
	// 8994 16802:putfield        #178 <Field int azh.p>
		abyte0 = ((byte []) (a));
	// 8995 16805:aload_0         
	// 8996 16806:getfield        #12  <Field azh a>
	// 8997 16809:astore_1        
		abyte0.bh = ((azh) (abyte0)).p & ~a.N;
	// 8998 16810:aload_1         
	// 8999 16811:aload_1         
	// 9000 16812:getfield        #178 <Field int azh.p>
	// 9001 16815:aload_0         
	// 9002 16816:getfield        #12  <Field azh a>
	// 9003 16819:getfield        #199 <Field int azh.N>
	// 9004 16822:iconst_m1       
	// 9005 16823:ixor            
	// 9006 16824:iand            
	// 9007 16825:putfield        #53  <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 9008 16828:aload_0         
	// 9009 16829:getfield        #12  <Field azh a>
	// 9010 16832:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bI ^ a.p;
	// 9011 16833:aload_1         
	// 9012 16834:aload_1         
	// 9013 16835:getfield        #484 <Field int azh.bI>
	// 9014 16838:aload_0         
	// 9015 16839:getfield        #12  <Field azh a>
	// 9016 16842:getfield        #178 <Field int azh.p>
	// 9017 16845:ixor            
	// 9018 16846:putfield        #175 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 9019 16849:aload_0         
	// 9020 16850:getfield        #12  <Field azh a>
	// 9021 16853:astore_1        
		abyte0.aO = ((azh) (abyte0)).y & a.aO;
	// 9022 16854:aload_1         
	// 9023 16855:aload_1         
	// 9024 16856:getfield        #517 <Field int azh.y>
	// 9025 16859:aload_0         
	// 9026 16860:getfield        #12  <Field azh a>
	// 9027 16863:getfield        #301 <Field int azh.aO>
	// 9028 16866:iand            
	// 9029 16867:putfield        #301 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 9030 16870:aload_0         
	// 9031 16871:getfield        #12  <Field azh a>
	// 9032 16874:astore_1        
		abyte0.aP = ((azh) (abyte0)).y & ~a.aP;
	// 9033 16875:aload_1         
	// 9034 16876:aload_1         
	// 9035 16877:getfield        #517 <Field int azh.y>
	// 9036 16880:aload_0         
	// 9037 16881:getfield        #12  <Field azh a>
	// 9038 16884:getfield        #292 <Field int azh.aP>
	// 9039 16887:iconst_m1       
	// 9040 16888:ixor            
	// 9041 16889:iand            
	// 9042 16890:putfield        #292 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 9043 16893:aload_0         
	// 9044 16894:getfield        #12  <Field azh a>
	// 9045 16897:astore_1        
		abyte0.aP = ((azh) (abyte0)).aM ^ a.aP;
	// 9046 16898:aload_1         
	// 9047 16899:aload_1         
	// 9048 16900:getfield        #295 <Field int azh.aM>
	// 9049 16903:aload_0         
	// 9050 16904:getfield        #12  <Field azh a>
	// 9051 16907:getfield        #292 <Field int azh.aP>
	// 9052 16910:ixor            
	// 9053 16911:putfield        #292 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 9054 16914:aload_0         
	// 9055 16915:getfield        #12  <Field azh a>
	// 9056 16918:astore_1        
		abyte0.bc = ((azh) (abyte0)).aP ^ a.bc;
	// 9057 16919:aload_1         
	// 9058 16920:aload_1         
	// 9059 16921:getfield        #292 <Field int azh.aP>
	// 9060 16924:aload_0         
	// 9061 16925:getfield        #12  <Field azh a>
	// 9062 16928:getfield        #106 <Field int azh.bc>
	// 9063 16931:ixor            
	// 9064 16932:putfield        #106 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 9065 16935:aload_0         
	// 9066 16936:getfield        #12  <Field azh a>
	// 9067 16939:astore_1        
		abyte0.t = ((azh) (abyte0)).bc ^ a.t;
	// 9068 16940:aload_1         
	// 9069 16941:aload_1         
	// 9070 16942:getfield        #106 <Field int azh.bc>
	// 9071 16945:aload_0         
	// 9072 16946:getfield        #12  <Field azh a>
	// 9073 16949:getfield        #352 <Field int azh.t>
	// 9074 16952:ixor            
	// 9075 16953:putfield        #352 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 9076 16956:aload_0         
	// 9077 16957:getfield        #12  <Field azh a>
	// 9078 16960:astore_1        
		abyte0.bV = ((azh) (abyte0)).y & ~a.bV;
	// 9079 16961:aload_1         
	// 9080 16962:aload_1         
	// 9081 16963:getfield        #517 <Field int azh.y>
	// 9082 16966:aload_0         
	// 9083 16967:getfield        #12  <Field azh a>
	// 9084 16970:getfield        #127 <Field int azh.bV>
	// 9085 16973:iconst_m1       
	// 9086 16974:ixor            
	// 9087 16975:iand            
	// 9088 16976:putfield        #127 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 9089 16979:aload_0         
	// 9090 16980:getfield        #12  <Field azh a>
	// 9091 16983:astore_1        
		abyte0.bV = ((azh) (abyte0)).bU ^ a.bV;
	// 9092 16984:aload_1         
	// 9093 16985:aload_1         
	// 9094 16986:getfield        #298 <Field int azh.bU>
	// 9095 16989:aload_0         
	// 9096 16990:getfield        #12  <Field azh a>
	// 9097 16993:getfield        #127 <Field int azh.bV>
	// 9098 16996:ixor            
	// 9099 16997:putfield        #127 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 9100 17000:aload_0         
	// 9101 17001:getfield        #12  <Field azh a>
	// 9102 17004:astore_1        
		abyte0.n = ((azh) (abyte0)).bV ^ a.n;
	// 9103 17005:aload_1         
	// 9104 17006:aload_1         
	// 9105 17007:getfield        #127 <Field int azh.bV>
	// 9106 17010:aload_0         
	// 9107 17011:getfield        #12  <Field azh a>
	// 9108 17014:getfield        #310 <Field int azh.n>
	// 9109 17017:ixor            
	// 9110 17018:putfield        #310 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 9111 17021:aload_0         
	// 9112 17022:getfield        #12  <Field azh a>
	// 9113 17025:astore_1        
		abyte0.L = ((azh) (abyte0)).n ^ a.L;
	// 9114 17026:aload_1         
	// 9115 17027:aload_1         
	// 9116 17028:getfield        #310 <Field int azh.n>
	// 9117 17031:aload_0         
	// 9118 17032:getfield        #12  <Field azh a>
	// 9119 17035:getfield        #520 <Field int azh.L>
	// 9120 17038:ixor            
	// 9121 17039:putfield        #520 <Field int azh.L>
		abyte0 = ((byte []) (a));
	// 9122 17042:aload_0         
	// 9123 17043:getfield        #12  <Field azh a>
	// 9124 17046:astore_1        
		abyte0.n = ((azh) (abyte0)).D ^ a.L;
	// 9125 17047:aload_1         
	// 9126 17048:aload_1         
	// 9127 17049:getfield        #508 <Field int azh.D>
	// 9128 17052:aload_0         
	// 9129 17053:getfield        #12  <Field azh a>
	// 9130 17056:getfield        #520 <Field int azh.L>
	// 9131 17059:ixor            
	// 9132 17060:putfield        #310 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 9133 17063:aload_0         
	// 9134 17064:getfield        #12  <Field azh a>
	// 9135 17067:astore_1        
		abyte0.bV = ((azh) (abyte0)).v | a.L;
	// 9136 17068:aload_1         
	// 9137 17069:aload_1         
	// 9138 17070:getfield        #490 <Field int azh.v>
	// 9139 17073:aload_0         
	// 9140 17074:getfield        #12  <Field azh a>
	// 9141 17077:getfield        #520 <Field int azh.L>
	// 9142 17080:ior             
	// 9143 17081:putfield        #127 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 9144 17084:aload_0         
	// 9145 17085:getfield        #12  <Field azh a>
	// 9146 17088:astore_1        
		abyte0.bU = ((azh) (abyte0)).L & ~a.v;
	// 9147 17089:aload_1         
	// 9148 17090:aload_1         
	// 9149 17091:getfield        #520 <Field int azh.L>
	// 9150 17094:aload_0         
	// 9151 17095:getfield        #12  <Field azh a>
	// 9152 17098:getfield        #490 <Field int azh.v>
	// 9153 17101:iconst_m1       
	// 9154 17102:ixor            
	// 9155 17103:iand            
	// 9156 17104:putfield        #298 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 9157 17107:aload_0         
	// 9158 17108:getfield        #12  <Field azh a>
	// 9159 17111:astore_1        
		abyte0.bc = ((azh) (abyte0)).D & a.L;
	// 9160 17112:aload_1         
	// 9161 17113:aload_1         
	// 9162 17114:getfield        #508 <Field int azh.D>
	// 9163 17117:aload_0         
	// 9164 17118:getfield        #12  <Field azh a>
	// 9165 17121:getfield        #520 <Field int azh.L>
	// 9166 17124:iand            
	// 9167 17125:putfield        #106 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 9168 17128:aload_0         
	// 9169 17129:getfield        #12  <Field azh a>
	// 9170 17132:astore_1        
		abyte0.aP = ((azh) (abyte0)).ab & a.bc;
	// 9171 17133:aload_1         
	// 9172 17134:aload_1         
	// 9173 17135:getfield        #421 <Field int azh.ab>
	// 9174 17138:aload_0         
	// 9175 17139:getfield        #12  <Field azh a>
	// 9176 17142:getfield        #106 <Field int azh.bc>
	// 9177 17145:iand            
	// 9178 17146:putfield        #292 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 9179 17149:aload_0         
	// 9180 17150:getfield        #12  <Field azh a>
	// 9181 17153:astore_1        
		abyte0.aM = ((azh) (abyte0)).v | a.L;
	// 9182 17154:aload_1         
	// 9183 17155:aload_1         
	// 9184 17156:getfield        #490 <Field int azh.v>
	// 9185 17159:aload_0         
	// 9186 17160:getfield        #12  <Field azh a>
	// 9187 17163:getfield        #520 <Field int azh.L>
	// 9188 17166:ior             
	// 9189 17167:putfield        #295 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 9190 17170:aload_0         
	// 9191 17171:getfield        #12  <Field azh a>
	// 9192 17174:astore_1        
		abyte0.aA = ((azh) (abyte0)).L & ~a.D;
	// 9193 17175:aload_1         
	// 9194 17176:aload_1         
	// 9195 17177:getfield        #520 <Field int azh.L>
	// 9196 17180:aload_0         
	// 9197 17181:getfield        #12  <Field azh a>
	// 9198 17184:getfield        #508 <Field int azh.D>
	// 9199 17187:iconst_m1       
	// 9200 17188:ixor            
	// 9201 17189:iand            
	// 9202 17190:putfield        #307 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 9203 17193:aload_0         
	// 9204 17194:getfield        #12  <Field azh a>
	// 9205 17197:astore_1        
		abyte0.bN = ((azh) (abyte0)).L & ~a.aA;
	// 9206 17198:aload_1         
	// 9207 17199:aload_1         
	// 9208 17200:getfield        #520 <Field int azh.L>
	// 9209 17203:aload_0         
	// 9210 17204:getfield        #12  <Field azh a>
	// 9211 17207:getfield        #307 <Field int azh.aA>
	// 9212 17210:iconst_m1       
	// 9213 17211:ixor            
	// 9214 17212:iand            
	// 9215 17213:putfield        #85  <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 9216 17216:aload_0         
	// 9217 17217:getfield        #12  <Field azh a>
	// 9218 17220:astore_1        
		abyte0.aC = ((azh) (abyte0)).ab & a.L;
	// 9219 17221:aload_1         
	// 9220 17222:aload_1         
	// 9221 17223:getfield        #421 <Field int azh.ab>
	// 9222 17226:aload_0         
	// 9223 17227:getfield        #12  <Field azh a>
	// 9224 17230:getfield        #520 <Field int azh.L>
	// 9225 17233:iand            
	// 9226 17234:putfield        #88  <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 9227 17237:aload_0         
	// 9228 17238:getfield        #12  <Field azh a>
	// 9229 17241:astore_1        
		abyte0.bv = ((azh) (abyte0)).v | a.L;
	// 9230 17242:aload_1         
	// 9231 17243:aload_1         
	// 9232 17244:getfield        #490 <Field int azh.v>
	// 9233 17247:aload_0         
	// 9234 17248:getfield        #12  <Field azh a>
	// 9235 17251:getfield        #520 <Field int azh.L>
	// 9236 17254:ior             
	// 9237 17255:putfield        #82  <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 9238 17258:aload_0         
	// 9239 17259:getfield        #12  <Field azh a>
	// 9240 17262:astore_1        
		abyte0.B = ((azh) (abyte0)).D | a.L;
	// 9241 17263:aload_1         
	// 9242 17264:aload_1         
	// 9243 17265:getfield        #508 <Field int azh.D>
	// 9244 17268:aload_0         
	// 9245 17269:getfield        #12  <Field azh a>
	// 9246 17272:getfield        #520 <Field int azh.L>
	// 9247 17275:ior             
	// 9248 17276:putfield        #142 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 9249 17279:aload_0         
	// 9250 17280:getfield        #12  <Field azh a>
	// 9251 17283:astore_1        
		abyte0.am = ((azh) (abyte0)).D & ~a.L;
	// 9252 17284:aload_1         
	// 9253 17285:aload_1         
	// 9254 17286:getfield        #508 <Field int azh.D>
	// 9255 17289:aload_0         
	// 9256 17290:getfield        #12  <Field azh a>
	// 9257 17293:getfield        #520 <Field int azh.L>
	// 9258 17296:iconst_m1       
	// 9259 17297:ixor            
	// 9260 17298:iand            
	// 9261 17299:putfield        #121 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 9262 17302:aload_0         
	// 9263 17303:getfield        #12  <Field azh a>
	// 9264 17306:astore_1        
		abyte0.b = ((azh) (abyte0)).L | a.am;
	// 9265 17307:aload_1         
	// 9266 17308:aload_1         
	// 9267 17309:getfield        #520 <Field int azh.L>
	// 9268 17312:aload_0         
	// 9269 17313:getfield        #12  <Field azh a>
	// 9270 17316:getfield        #121 <Field int azh.am>
	// 9271 17319:ior             
	// 9272 17320:putfield        #304 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 9273 17323:aload_0         
	// 9274 17324:getfield        #12  <Field azh a>
	// 9275 17327:astore_1        
		abyte0.aH = ((azh) (abyte0)).d & ~a.aH;
	// 9276 17328:aload_1         
	// 9277 17329:aload_1         
	// 9278 17330:getfield        #337 <Field int azh.d>
	// 9279 17333:aload_0         
	// 9280 17334:getfield        #12  <Field azh a>
	// 9281 17337:getfield        #523 <Field int azh.aH>
	// 9282 17340:iconst_m1       
	// 9283 17341:ixor            
	// 9284 17342:iand            
	// 9285 17343:putfield        #523 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 9286 17346:aload_0         
	// 9287 17347:getfield        #12  <Field azh a>
	// 9288 17350:astore_1        
		abyte0.aH = ((azh) (abyte0)).aH & a.bY;
	// 9289 17351:aload_1         
	// 9290 17352:aload_1         
	// 9291 17353:getfield        #523 <Field int azh.aH>
	// 9292 17356:aload_0         
	// 9293 17357:getfield        #12  <Field azh a>
	// 9294 17360:getfield        #346 <Field int azh.bY>
	// 9295 17363:iand            
	// 9296 17364:putfield        #523 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 9297 17367:aload_0         
	// 9298 17368:getfield        #12  <Field azh a>
	// 9299 17371:astore_1        
		abyte0.aH = ((azh) (abyte0)).aB ^ a.aH;
	// 9300 17372:aload_1         
	// 9301 17373:aload_1         
	// 9302 17374:getfield        #460 <Field int azh.aB>
	// 9303 17377:aload_0         
	// 9304 17378:getfield        #12  <Field azh a>
	// 9305 17381:getfield        #523 <Field int azh.aH>
	// 9306 17384:ixor            
	// 9307 17385:putfield        #523 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 9308 17388:aload_0         
	// 9309 17389:getfield        #12  <Field azh a>
	// 9310 17392:astore_1        
		abyte0.aH = ((azh) (abyte0)).bz | a.aH;
	// 9311 17393:aload_1         
	// 9312 17394:aload_1         
	// 9313 17395:getfield        #466 <Field int azh.bz>
	// 9314 17398:aload_0         
	// 9315 17399:getfield        #12  <Field azh a>
	// 9316 17402:getfield        #523 <Field int azh.aH>
	// 9317 17405:ior             
	// 9318 17406:putfield        #523 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 9319 17409:aload_0         
	// 9320 17410:getfield        #12  <Field azh a>
	// 9321 17413:astore_1        
		abyte0.aH = ((azh) (abyte0)).aE ^ a.aH;
	// 9322 17414:aload_1         
	// 9323 17415:aload_1         
	// 9324 17416:getfield        #370 <Field int azh.aE>
	// 9325 17419:aload_0         
	// 9326 17420:getfield        #12  <Field azh a>
	// 9327 17423:getfield        #523 <Field int azh.aH>
	// 9328 17426:ixor            
	// 9329 17427:putfield        #523 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 9330 17430:aload_0         
	// 9331 17431:getfield        #12  <Field azh a>
	// 9332 17434:astore_1        
		abyte0.S = ((azh) (abyte0)).aH ^ a.S;
	// 9333 17435:aload_1         
	// 9334 17436:aload_1         
	// 9335 17437:getfield        #523 <Field int azh.aH>
	// 9336 17440:aload_0         
	// 9337 17441:getfield        #12  <Field azh a>
	// 9338 17444:getfield        #148 <Field int azh.S>
	// 9339 17447:ixor            
	// 9340 17448:putfield        #148 <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 9341 17451:aload_0         
	// 9342 17452:getfield        #12  <Field azh a>
	// 9343 17455:astore_1        
		abyte0.bn = ((azh) (abyte0)).S & ~a.bn;
	// 9344 17456:aload_1         
	// 9345 17457:aload_1         
	// 9346 17458:getfield        #148 <Field int azh.S>
	// 9347 17461:aload_0         
	// 9348 17462:getfield        #12  <Field azh a>
	// 9349 17465:getfield        #226 <Field int azh.bn>
	// 9350 17468:iconst_m1       
	// 9351 17469:ixor            
	// 9352 17470:iand            
	// 9353 17471:putfield        #226 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 9354 17474:aload_0         
	// 9355 17475:getfield        #12  <Field azh a>
	// 9356 17478:astore_1        
		abyte0.bn = ((azh) (abyte0)).aQ ^ a.bn;
	// 9357 17479:aload_1         
	// 9358 17480:aload_1         
	// 9359 17481:getfield        #235 <Field int azh.aQ>
	// 9360 17484:aload_0         
	// 9361 17485:getfield        #12  <Field azh a>
	// 9362 17488:getfield        #226 <Field int azh.bn>
	// 9363 17491:ixor            
	// 9364 17492:putfield        #226 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 9365 17495:aload_0         
	// 9366 17496:getfield        #12  <Field azh a>
	// 9367 17499:astore_1        
		abyte0.bn = ((azh) (abyte0)).bn ^ a.d;
	// 9368 17500:aload_1         
	// 9369 17501:aload_1         
	// 9370 17502:getfield        #226 <Field int azh.bn>
	// 9371 17505:aload_0         
	// 9372 17506:getfield        #12  <Field azh a>
	// 9373 17509:getfield        #337 <Field int azh.d>
	// 9374 17512:ixor            
	// 9375 17513:putfield        #226 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 9376 17516:aload_0         
	// 9377 17517:getfield        #12  <Field azh a>
	// 9378 17520:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bn | a.l;
	// 9379 17521:aload_1         
	// 9380 17522:aload_1         
	// 9381 17523:getfield        #226 <Field int azh.bn>
	// 9382 17526:aload_0         
	// 9383 17527:getfield        #12  <Field azh a>
	// 9384 17530:getfield        #112 <Field int azh.l>
	// 9385 17533:ior             
	// 9386 17534:putfield        #235 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 9387 17537:aload_0         
	// 9388 17538:getfield        #12  <Field azh a>
	// 9389 17541:astore_1        
		abyte0.aH = ((azh) (abyte0)).cf & ~a.aQ;
	// 9390 17542:aload_1         
	// 9391 17543:aload_1         
	// 9392 17544:getfield        #91  <Field int azh.cf>
	// 9393 17547:aload_0         
	// 9394 17548:getfield        #12  <Field azh a>
	// 9395 17551:getfield        #235 <Field int azh.aQ>
	// 9396 17554:iconst_m1       
	// 9397 17555:ixor            
	// 9398 17556:iand            
	// 9399 17557:putfield        #523 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 9400 17560:aload_0         
	// 9401 17561:getfield        #12  <Field azh a>
	// 9402 17564:astore_1        
		abyte0.aE = ((azh) (abyte0)).aQ & ~a.bE;
	// 9403 17565:aload_1         
	// 9404 17566:aload_1         
	// 9405 17567:getfield        #235 <Field int azh.aQ>
	// 9406 17570:aload_0         
	// 9407 17571:getfield        #12  <Field azh a>
	// 9408 17574:getfield        #56  <Field int azh.bE>
	// 9409 17577:iconst_m1       
	// 9410 17578:ixor            
	// 9411 17579:iand            
	// 9412 17580:putfield        #370 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 9413 17583:aload_0         
	// 9414 17584:getfield        #12  <Field azh a>
	// 9415 17587:astore_1        
		abyte0.aB = ((azh) (abyte0)).aQ ^ a.cf;
	// 9416 17588:aload_1         
	// 9417 17589:aload_1         
	// 9418 17590:getfield        #235 <Field int azh.aQ>
	// 9419 17593:aload_0         
	// 9420 17594:getfield        #12  <Field azh a>
	// 9421 17597:getfield        #91  <Field int azh.cf>
	// 9422 17600:ixor            
	// 9423 17601:putfield        #460 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 9424 17604:aload_0         
	// 9425 17605:getfield        #12  <Field azh a>
	// 9426 17608:astore_1        
		abyte0.aB = ((azh) (abyte0)).aB & a.bE;
	// 9427 17609:aload_1         
	// 9428 17610:aload_1         
	// 9429 17611:getfield        #460 <Field int azh.aB>
	// 9430 17614:aload_0         
	// 9431 17615:getfield        #12  <Field azh a>
	// 9432 17618:getfield        #56  <Field int azh.bE>
	// 9433 17621:iand            
	// 9434 17622:putfield        #460 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 9435 17625:aload_0         
	// 9436 17626:getfield        #12  <Field azh a>
	// 9437 17629:astore_1        
		abyte0.ah = ((azh) (abyte0)).cf & a.aQ;
	// 9438 17630:aload_1         
	// 9439 17631:aload_1         
	// 9440 17632:getfield        #91  <Field int azh.cf>
	// 9441 17635:aload_0         
	// 9442 17636:getfield        #12  <Field azh a>
	// 9443 17639:getfield        #235 <Field int azh.aQ>
	// 9444 17642:iand            
	// 9445 17643:putfield        #394 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 9446 17646:aload_0         
	// 9447 17647:getfield        #12  <Field azh a>
	// 9448 17650:astore_1        
		abyte0.ah = ((azh) (abyte0)).bE & ~a.ah;
	// 9449 17651:aload_1         
	// 9450 17652:aload_1         
	// 9451 17653:getfield        #56  <Field int azh.bE>
	// 9452 17656:aload_0         
	// 9453 17657:getfield        #12  <Field azh a>
	// 9454 17660:getfield        #394 <Field int azh.ah>
	// 9455 17663:iconst_m1       
	// 9456 17664:ixor            
	// 9457 17665:iand            
	// 9458 17666:putfield        #394 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 9459 17669:aload_0         
	// 9460 17670:getfield        #12  <Field azh a>
	// 9461 17673:astore_1        
		abyte0.ah = ((azh) (abyte0)).cf ^ a.ah;
	// 9462 17674:aload_1         
	// 9463 17675:aload_1         
	// 9464 17676:getfield        #91  <Field int azh.cf>
	// 9465 17679:aload_0         
	// 9466 17680:getfield        #12  <Field azh a>
	// 9467 17683:getfield        #394 <Field int azh.ah>
	// 9468 17686:ixor            
	// 9469 17687:putfield        #394 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 9470 17690:aload_0         
	// 9471 17691:getfield        #12  <Field azh a>
	// 9472 17694:astore_1        
		abyte0.ce = ((azh) (abyte0)).aQ & ~a.l;
	// 9473 17695:aload_1         
	// 9474 17696:aload_1         
	// 9475 17697:getfield        #235 <Field int azh.aQ>
	// 9476 17700:aload_0         
	// 9477 17701:getfield        #12  <Field azh a>
	// 9478 17704:getfield        #112 <Field int azh.l>
	// 9479 17707:iconst_m1       
	// 9480 17708:ixor            
	// 9481 17709:iand            
	// 9482 17710:putfield        #469 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 9483 17713:aload_0         
	// 9484 17714:getfield        #12  <Field azh a>
	// 9485 17717:astore_1        
		abyte0.aN = ((azh) (abyte0)).cf & ~a.ce;
	// 9486 17718:aload_1         
	// 9487 17719:aload_1         
	// 9488 17720:getfield        #91  <Field int azh.cf>
	// 9489 17723:aload_0         
	// 9490 17724:getfield        #12  <Field azh a>
	// 9491 17727:getfield        #469 <Field int azh.ce>
	// 9492 17730:iconst_m1       
	// 9493 17731:ixor            
	// 9494 17732:iand            
	// 9495 17733:putfield        #481 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 9496 17736:aload_0         
	// 9497 17737:getfield        #12  <Field azh a>
	// 9498 17740:astore_1        
		abyte0.aN = ((azh) (abyte0)).bn ^ a.aN;
	// 9499 17741:aload_1         
	// 9500 17742:aload_1         
	// 9501 17743:getfield        #226 <Field int azh.bn>
	// 9502 17746:aload_0         
	// 9503 17747:getfield        #12  <Field azh a>
	// 9504 17750:getfield        #481 <Field int azh.aN>
	// 9505 17753:ixor            
	// 9506 17754:putfield        #481 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 9507 17757:aload_0         
	// 9508 17758:getfield        #12  <Field azh a>
	// 9509 17761:astore_1        
		abyte0.aN = ((azh) (abyte0)).aN & a.bE;
	// 9510 17762:aload_1         
	// 9511 17763:aload_1         
	// 9512 17764:getfield        #481 <Field int azh.aN>
	// 9513 17767:aload_0         
	// 9514 17768:getfield        #12  <Field azh a>
	// 9515 17771:getfield        #56  <Field int azh.bE>
	// 9516 17774:iand            
	// 9517 17775:putfield        #481 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 9518 17778:aload_0         
	// 9519 17779:getfield        #12  <Field azh a>
	// 9520 17782:astore_1        
		abyte0.aV = ((azh) (abyte0)).cf & ~a.ce;
	// 9521 17783:aload_1         
	// 9522 17784:aload_1         
	// 9523 17785:getfield        #91  <Field int azh.cf>
	// 9524 17788:aload_0         
	// 9525 17789:getfield        #12  <Field azh a>
	// 9526 17792:getfield        #469 <Field int azh.ce>
	// 9527 17795:iconst_m1       
	// 9528 17796:ixor            
	// 9529 17797:iand            
	// 9530 17798:putfield        #502 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 9531 17801:aload_0         
	// 9532 17802:getfield        #12  <Field azh a>
	// 9533 17805:astore_1        
		abyte0.aH = ((azh) (abyte0)).ce ^ a.aH;
	// 9534 17806:aload_1         
	// 9535 17807:aload_1         
	// 9536 17808:getfield        #469 <Field int azh.ce>
	// 9537 17811:aload_0         
	// 9538 17812:getfield        #12  <Field azh a>
	// 9539 17815:getfield        #523 <Field int azh.aH>
	// 9540 17818:ixor            
	// 9541 17819:putfield        #523 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 9542 17822:aload_0         
	// 9543 17823:getfield        #12  <Field azh a>
	// 9544 17826:astore_1        
		abyte0.aH = ((azh) (abyte0)).bE & ~a.aH;
	// 9545 17827:aload_1         
	// 9546 17828:aload_1         
	// 9547 17829:getfield        #56  <Field int azh.bE>
	// 9548 17832:aload_0         
	// 9549 17833:getfield        #12  <Field azh a>
	// 9550 17836:getfield        #523 <Field int azh.aH>
	// 9551 17839:iconst_m1       
	// 9552 17840:ixor            
	// 9553 17841:iand            
	// 9554 17842:putfield        #523 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 9555 17845:aload_0         
	// 9556 17846:getfield        #12  <Field azh a>
	// 9557 17849:astore_1        
		abyte0.ce = ((azh) (abyte0)).cf & ~a.aQ;
	// 9558 17850:aload_1         
	// 9559 17851:aload_1         
	// 9560 17852:getfield        #91  <Field int azh.cf>
	// 9561 17855:aload_0         
	// 9562 17856:getfield        #12  <Field azh a>
	// 9563 17859:getfield        #235 <Field int azh.aQ>
	// 9564 17862:iconst_m1       
	// 9565 17863:ixor            
	// 9566 17864:iand            
	// 9567 17865:putfield        #469 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 9568 17868:aload_0         
	// 9569 17869:getfield        #12  <Field azh a>
	// 9570 17872:astore_1        
		abyte0.bA = ((azh) (abyte0)).cf & a.bn;
	// 9571 17873:aload_1         
	// 9572 17874:aload_1         
	// 9573 17875:getfield        #91  <Field int azh.cf>
	// 9574 17878:aload_0         
	// 9575 17879:getfield        #12  <Field azh a>
	// 9576 17882:getfield        #226 <Field int azh.bn>
	// 9577 17885:iand            
	// 9578 17886:putfield        #463 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 9579 17889:aload_0         
	// 9580 17890:getfield        #12  <Field azh a>
	// 9581 17893:astore_1        
		abyte0.bA = ((azh) (abyte0)).aQ ^ a.bA;
	// 9582 17894:aload_1         
	// 9583 17895:aload_1         
	// 9584 17896:getfield        #235 <Field int azh.aQ>
	// 9585 17899:aload_0         
	// 9586 17900:getfield        #12  <Field azh a>
	// 9587 17903:getfield        #463 <Field int azh.bA>
	// 9588 17906:ixor            
	// 9589 17907:putfield        #463 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 9590 17910:aload_0         
	// 9591 17911:getfield        #12  <Field azh a>
	// 9592 17914:astore_1        
		abyte0.aQ = ((azh) (abyte0)).l & ~a.bn;
	// 9593 17915:aload_1         
	// 9594 17916:aload_1         
	// 9595 17917:getfield        #112 <Field int azh.l>
	// 9596 17920:aload_0         
	// 9597 17921:getfield        #12  <Field azh a>
	// 9598 17924:getfield        #226 <Field int azh.bn>
	// 9599 17927:iconst_m1       
	// 9600 17928:ixor            
	// 9601 17929:iand            
	// 9602 17930:putfield        #235 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 9603 17933:aload_0         
	// 9604 17934:getfield        #12  <Field azh a>
	// 9605 17937:astore_1        
		abyte0.X = ((azh) (abyte0)).cf & ~a.bn;
	// 9606 17938:aload_1         
	// 9607 17939:aload_1         
	// 9608 17940:getfield        #91  <Field int azh.cf>
	// 9609 17943:aload_0         
	// 9610 17944:getfield        #12  <Field azh a>
	// 9611 17947:getfield        #226 <Field int azh.bn>
	// 9612 17950:iconst_m1       
	// 9613 17951:ixor            
	// 9614 17952:iand            
	// 9615 17953:putfield        #355 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 9616 17956:aload_0         
	// 9617 17957:getfield        #12  <Field azh a>
	// 9618 17960:astore_1        
		abyte0.X = ((azh) (abyte0)).l ^ a.X;
	// 9619 17961:aload_1         
	// 9620 17962:aload_1         
	// 9621 17963:getfield        #112 <Field int azh.l>
	// 9622 17966:aload_0         
	// 9623 17967:getfield        #12  <Field azh a>
	// 9624 17970:getfield        #355 <Field int azh.X>
	// 9625 17973:ixor            
	// 9626 17974:putfield        #355 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 9627 17977:aload_0         
	// 9628 17978:getfield        #12  <Field azh a>
	// 9629 17981:astore_1        
		abyte0.X = ((azh) (abyte0)).bE & ~a.X;
	// 9630 17982:aload_1         
	// 9631 17983:aload_1         
	// 9632 17984:getfield        #56  <Field int azh.bE>
	// 9633 17987:aload_0         
	// 9634 17988:getfield        #12  <Field azh a>
	// 9635 17991:getfield        #355 <Field int azh.X>
	// 9636 17994:iconst_m1       
	// 9637 17995:ixor            
	// 9638 17996:iand            
	// 9639 17997:putfield        #355 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 9640 18000:aload_0         
	// 9641 18001:getfield        #12  <Field azh a>
	// 9642 18004:astore_1        
		abyte0.bM = ((azh) (abyte0)).bn & a.bE;
	// 9643 18005:aload_1         
	// 9644 18006:aload_1         
	// 9645 18007:getfield        #226 <Field int azh.bn>
	// 9646 18010:aload_0         
	// 9647 18011:getfield        #12  <Field azh a>
	// 9648 18014:getfield        #56  <Field int azh.bE>
	// 9649 18017:iand            
	// 9650 18018:putfield        #349 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 9651 18021:aload_0         
	// 9652 18022:getfield        #12  <Field azh a>
	// 9653 18025:astore_1        
		abyte0.bX = ((azh) (abyte0)).bn & a.l;
	// 9654 18026:aload_1         
	// 9655 18027:aload_1         
	// 9656 18028:getfield        #226 <Field int azh.bn>
	// 9657 18031:aload_0         
	// 9658 18032:getfield        #12  <Field azh a>
	// 9659 18035:getfield        #112 <Field int azh.l>
	// 9660 18038:iand            
	// 9661 18039:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 9662 18042:aload_0         
	// 9663 18043:getfield        #12  <Field azh a>
	// 9664 18046:astore_1        
		abyte0.bd = ((azh) (abyte0)).cf & a.bX;
	// 9665 18047:aload_1         
	// 9666 18048:aload_1         
	// 9667 18049:getfield        #91  <Field int azh.cf>
	// 9668 18052:aload_0         
	// 9669 18053:getfield        #12  <Field azh a>
	// 9670 18056:getfield        #139 <Field int azh.bX>
	// 9671 18059:iand            
	// 9672 18060:putfield        #457 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 9673 18063:aload_0         
	// 9674 18064:getfield        #12  <Field azh a>
	// 9675 18067:astore_1        
		abyte0.bd = ((azh) (abyte0)).bE & ~a.bd;
	// 9676 18068:aload_1         
	// 9677 18069:aload_1         
	// 9678 18070:getfield        #56  <Field int azh.bE>
	// 9679 18073:aload_0         
	// 9680 18074:getfield        #12  <Field azh a>
	// 9681 18077:getfield        #457 <Field int azh.bd>
	// 9682 18080:iconst_m1       
	// 9683 18081:ixor            
	// 9684 18082:iand            
	// 9685 18083:putfield        #457 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 9686 18086:aload_0         
	// 9687 18087:getfield        #12  <Field azh a>
	// 9688 18090:astore_1        
		abyte0.cd = ((azh) (abyte0)).l & ~a.bX;
	// 9689 18091:aload_1         
	// 9690 18092:aload_1         
	// 9691 18093:getfield        #112 <Field int azh.l>
	// 9692 18096:aload_0         
	// 9693 18097:getfield        #12  <Field azh a>
	// 9694 18100:getfield        #139 <Field int azh.bX>
	// 9695 18103:iconst_m1       
	// 9696 18104:ixor            
	// 9697 18105:iand            
	// 9698 18106:putfield        #496 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 9699 18109:aload_0         
	// 9700 18110:getfield        #12  <Field azh a>
	// 9701 18113:astore_1        
		abyte0.ay = ((azh) (abyte0)).bE & ~a.cd;
	// 9702 18114:aload_1         
	// 9703 18115:aload_1         
	// 9704 18116:getfield        #56  <Field int azh.bE>
	// 9705 18119:aload_0         
	// 9706 18120:getfield        #12  <Field azh a>
	// 9707 18123:getfield        #496 <Field int azh.cd>
	// 9708 18126:iconst_m1       
	// 9709 18127:ixor            
	// 9710 18128:iand            
	// 9711 18129:putfield        #253 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 9712 18132:aload_0         
	// 9713 18133:getfield        #12  <Field azh a>
	// 9714 18136:astore_1        
		abyte0.ay = ((azh) (abyte0)).bA ^ a.ay;
	// 9715 18137:aload_1         
	// 9716 18138:aload_1         
	// 9717 18139:getfield        #463 <Field int azh.bA>
	// 9718 18142:aload_0         
	// 9719 18143:getfield        #12  <Field azh a>
	// 9720 18146:getfield        #253 <Field int azh.ay>
	// 9721 18149:ixor            
	// 9722 18150:putfield        #253 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 9723 18153:aload_0         
	// 9724 18154:getfield        #12  <Field azh a>
	// 9725 18157:astore_1        
		abyte0.ay = ((azh) (abyte0)).bi & ~a.ay;
	// 9726 18158:aload_1         
	// 9727 18159:aload_1         
	// 9728 18160:getfield        #274 <Field int azh.bi>
	// 9729 18163:aload_0         
	// 9730 18164:getfield        #12  <Field azh a>
	// 9731 18167:getfield        #253 <Field int azh.ay>
	// 9732 18170:iconst_m1       
	// 9733 18171:ixor            
	// 9734 18172:iand            
	// 9735 18173:putfield        #253 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 9736 18176:aload_0         
	// 9737 18177:getfield        #12  <Field azh a>
	// 9738 18180:astore_1        
		abyte0.ce = ((azh) (abyte0)).cd ^ a.ce;
	// 9739 18181:aload_1         
	// 9740 18182:aload_1         
	// 9741 18183:getfield        #496 <Field int azh.cd>
	// 9742 18186:aload_0         
	// 9743 18187:getfield        #12  <Field azh a>
	// 9744 18190:getfield        #469 <Field int azh.ce>
	// 9745 18193:ixor            
	// 9746 18194:putfield        #469 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 9747 18197:aload_0         
	// 9748 18198:getfield        #12  <Field azh a>
	// 9749 18201:astore_1        
		abyte0.ce = ((azh) (abyte0)).bE | a.ce;
	// 9750 18202:aload_1         
	// 9751 18203:aload_1         
	// 9752 18204:getfield        #56  <Field int azh.bE>
	// 9753 18207:aload_0         
	// 9754 18208:getfield        #12  <Field azh a>
	// 9755 18211:getfield        #469 <Field int azh.ce>
	// 9756 18214:ior             
	// 9757 18215:putfield        #469 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 9758 18218:aload_0         
	// 9759 18219:getfield        #12  <Field azh a>
	// 9760 18222:astore_1        
		abyte0.ce = ((azh) (abyte0)).cf ^ a.ce;
	// 9761 18223:aload_1         
	// 9762 18224:aload_1         
	// 9763 18225:getfield        #91  <Field int azh.cf>
	// 9764 18228:aload_0         
	// 9765 18229:getfield        #12  <Field azh a>
	// 9766 18232:getfield        #469 <Field int azh.ce>
	// 9767 18235:ixor            
	// 9768 18236:putfield        #469 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 9769 18239:aload_0         
	// 9770 18240:getfield        #12  <Field azh a>
	// 9771 18243:astore_1        
		abyte0.ay = ((azh) (abyte0)).ce ^ a.ay;
	// 9772 18244:aload_1         
	// 9773 18245:aload_1         
	// 9774 18246:getfield        #469 <Field int azh.ce>
	// 9775 18249:aload_0         
	// 9776 18250:getfield        #12  <Field azh a>
	// 9777 18253:getfield        #253 <Field int azh.ay>
	// 9778 18256:ixor            
	// 9779 18257:putfield        #253 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 9780 18260:aload_0         
	// 9781 18261:getfield        #12  <Field azh a>
	// 9782 18264:astore_1        
		abyte0.ce = ((azh) (abyte0)).bX ^ a.cf;
	// 9783 18265:aload_1         
	// 9784 18266:aload_1         
	// 9785 18267:getfield        #139 <Field int azh.bX>
	// 9786 18270:aload_0         
	// 9787 18271:getfield        #12  <Field azh a>
	// 9788 18274:getfield        #91  <Field int azh.cf>
	// 9789 18277:ixor            
	// 9790 18278:putfield        #469 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 9791 18281:aload_0         
	// 9792 18282:getfield        #12  <Field azh a>
	// 9793 18285:astore_1        
		abyte0.cd = ((azh) (abyte0)).ce & a.bE;
	// 9794 18286:aload_1         
	// 9795 18287:aload_1         
	// 9796 18288:getfield        #469 <Field int azh.ce>
	// 9797 18291:aload_0         
	// 9798 18292:getfield        #12  <Field azh a>
	// 9799 18295:getfield        #56  <Field int azh.bE>
	// 9800 18298:iand            
	// 9801 18299:putfield        #496 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 9802 18302:aload_0         
	// 9803 18303:getfield        #12  <Field azh a>
	// 9804 18306:astore_1        
		abyte0.cd = ((azh) (abyte0)).l ^ a.cd;
	// 9805 18307:aload_1         
	// 9806 18308:aload_1         
	// 9807 18309:getfield        #112 <Field int azh.l>
	// 9808 18312:aload_0         
	// 9809 18313:getfield        #12  <Field azh a>
	// 9810 18316:getfield        #496 <Field int azh.cd>
	// 9811 18319:ixor            
	// 9812 18320:putfield        #496 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 9813 18323:aload_0         
	// 9814 18324:getfield        #12  <Field azh a>
	// 9815 18327:astore_1        
		abyte0.cd = ((azh) (abyte0)).bi & a.cd;
	// 9816 18328:aload_1         
	// 9817 18329:aload_1         
	// 9818 18330:getfield        #274 <Field int azh.bi>
	// 9819 18333:aload_0         
	// 9820 18334:getfield        #12  <Field azh a>
	// 9821 18337:getfield        #496 <Field int azh.cd>
	// 9822 18340:iand            
	// 9823 18341:putfield        #496 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 9824 18344:aload_0         
	// 9825 18345:getfield        #12  <Field azh a>
	// 9826 18348:astore_1        
		abyte0.aE = ((azh) (abyte0)).ce ^ a.aE;
	// 9827 18349:aload_1         
	// 9828 18350:aload_1         
	// 9829 18351:getfield        #469 <Field int azh.ce>
	// 9830 18354:aload_0         
	// 9831 18355:getfield        #12  <Field azh a>
	// 9832 18358:getfield        #370 <Field int azh.aE>
	// 9833 18361:ixor            
	// 9834 18362:putfield        #370 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 9835 18365:aload_0         
	// 9836 18366:getfield        #12  <Field azh a>
	// 9837 18369:astore_1        
		abyte0.aV = ((azh) (abyte0)).bX ^ a.aV;
	// 9838 18370:aload_1         
	// 9839 18371:aload_1         
	// 9840 18372:getfield        #139 <Field int azh.bX>
	// 9841 18375:aload_0         
	// 9842 18376:getfield        #12  <Field azh a>
	// 9843 18379:getfield        #502 <Field int azh.aV>
	// 9844 18382:ixor            
	// 9845 18383:putfield        #502 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 9846 18386:aload_0         
	// 9847 18387:getfield        #12  <Field azh a>
	// 9848 18390:astore_1        
		abyte0.ch = ((azh) (abyte0)).aV ^ a.ch;
	// 9849 18391:aload_1         
	// 9850 18392:aload_1         
	// 9851 18393:getfield        #502 <Field int azh.aV>
	// 9852 18396:aload_0         
	// 9853 18397:getfield        #12  <Field azh a>
	// 9854 18400:getfield        #271 <Field int azh.ch>
	// 9855 18403:ixor            
	// 9856 18404:putfield        #271 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 9857 18407:aload_0         
	// 9858 18408:getfield        #12  <Field azh a>
	// 9859 18411:astore_1        
		abyte0.aV = ((azh) (abyte0)).cf & ~a.bn;
	// 9860 18412:aload_1         
	// 9861 18413:aload_1         
	// 9862 18414:getfield        #91  <Field int azh.cf>
	// 9863 18417:aload_0         
	// 9864 18418:getfield        #12  <Field azh a>
	// 9865 18421:getfield        #226 <Field int azh.bn>
	// 9866 18424:iconst_m1       
	// 9867 18425:ixor            
	// 9868 18426:iand            
	// 9869 18427:putfield        #502 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 9870 18430:aload_0         
	// 9871 18431:getfield        #12  <Field azh a>
	// 9872 18434:astore_1        
		abyte0.aB = ((azh) (abyte0)).aV ^ a.aB;
	// 9873 18435:aload_1         
	// 9874 18436:aload_1         
	// 9875 18437:getfield        #502 <Field int azh.aV>
	// 9876 18440:aload_0         
	// 9877 18441:getfield        #12  <Field azh a>
	// 9878 18444:getfield        #460 <Field int azh.aB>
	// 9879 18447:ixor            
	// 9880 18448:putfield        #460 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 9881 18451:aload_0         
	// 9882 18452:getfield        #12  <Field azh a>
	// 9883 18455:astore_1        
		abyte0.aB = ((azh) (abyte0)).bi & ~a.aB;
	// 9884 18456:aload_1         
	// 9885 18457:aload_1         
	// 9886 18458:getfield        #274 <Field int azh.bi>
	// 9887 18461:aload_0         
	// 9888 18462:getfield        #12  <Field azh a>
	// 9889 18465:getfield        #460 <Field int azh.aB>
	// 9890 18468:iconst_m1       
	// 9891 18469:ixor            
	// 9892 18470:iand            
	// 9893 18471:putfield        #460 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 9894 18474:aload_0         
	// 9895 18475:getfield        #12  <Field azh a>
	// 9896 18478:astore_1        
		abyte0.aB = ((azh) (abyte0)).ah ^ a.aB;
	// 9897 18479:aload_1         
	// 9898 18480:aload_1         
	// 9899 18481:getfield        #394 <Field int azh.ah>
	// 9900 18484:aload_0         
	// 9901 18485:getfield        #12  <Field azh a>
	// 9902 18488:getfield        #460 <Field int azh.aB>
	// 9903 18491:ixor            
	// 9904 18492:putfield        #460 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 9905 18495:aload_0         
	// 9906 18496:getfield        #12  <Field azh a>
	// 9907 18499:astore_1        
		abyte0.ah = ((azh) (abyte0)).cf & a.bn;
	// 9908 18500:aload_1         
	// 9909 18501:aload_1         
	// 9910 18502:getfield        #91  <Field int azh.cf>
	// 9911 18505:aload_0         
	// 9912 18506:getfield        #12  <Field azh a>
	// 9913 18509:getfield        #226 <Field int azh.bn>
	// 9914 18512:iand            
	// 9915 18513:putfield        #394 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 9916 18516:aload_0         
	// 9917 18517:getfield        #12  <Field azh a>
	// 9918 18520:astore_1        
		abyte0.ah = ((azh) (abyte0)).ah & a.bE;
	// 9919 18521:aload_1         
	// 9920 18522:aload_1         
	// 9921 18523:getfield        #394 <Field int azh.ah>
	// 9922 18526:aload_0         
	// 9923 18527:getfield        #12  <Field azh a>
	// 9924 18530:getfield        #56  <Field int azh.bE>
	// 9925 18533:iand            
	// 9926 18534:putfield        #394 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 9927 18537:aload_0         
	// 9928 18538:getfield        #12  <Field azh a>
	// 9929 18541:astore_1        
		abyte0.cd = ((azh) (abyte0)).ah ^ a.cd;
	// 9930 18542:aload_1         
	// 9931 18543:aload_1         
	// 9932 18544:getfield        #394 <Field int azh.ah>
	// 9933 18547:aload_0         
	// 9934 18548:getfield        #12  <Field azh a>
	// 9935 18551:getfield        #496 <Field int azh.cd>
	// 9936 18554:ixor            
	// 9937 18555:putfield        #496 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 9938 18558:aload_0         
	// 9939 18559:getfield        #12  <Field azh a>
	// 9940 18562:astore_1        
		abyte0.ah = ((azh) (abyte0)).bi & ~a.ah;
	// 9941 18563:aload_1         
	// 9942 18564:aload_1         
	// 9943 18565:getfield        #274 <Field int azh.bi>
	// 9944 18568:aload_0         
	// 9945 18569:getfield        #12  <Field azh a>
	// 9946 18572:getfield        #394 <Field int azh.ah>
	// 9947 18575:iconst_m1       
	// 9948 18576:ixor            
	// 9949 18577:iand            
	// 9950 18578:putfield        #394 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 9951 18581:aload_0         
	// 9952 18582:getfield        #12  <Field azh a>
	// 9953 18585:astore_1        
		abyte0.aV = ((azh) (abyte0)).bn & ~a.l;
	// 9954 18586:aload_1         
	// 9955 18587:aload_1         
	// 9956 18588:getfield        #226 <Field int azh.bn>
	// 9957 18591:aload_0         
	// 9958 18592:getfield        #12  <Field azh a>
	// 9959 18595:getfield        #112 <Field int azh.l>
	// 9960 18598:iconst_m1       
	// 9961 18599:ixor            
	// 9962 18600:iand            
	// 9963 18601:putfield        #502 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 9964 18604:aload_0         
	// 9965 18605:getfield        #12  <Field azh a>
	// 9966 18608:astore_1        
		abyte0.X = ((azh) (abyte0)).aV ^ a.X;
	// 9967 18609:aload_1         
	// 9968 18610:aload_1         
	// 9969 18611:getfield        #502 <Field int azh.aV>
	// 9970 18614:aload_0         
	// 9971 18615:getfield        #12  <Field azh a>
	// 9972 18618:getfield        #355 <Field int azh.X>
	// 9973 18621:ixor            
	// 9974 18622:putfield        #355 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 9975 18625:aload_0         
	// 9976 18626:getfield        #12  <Field azh a>
	// 9977 18629:astore_1        
		abyte0.X = ((azh) (abyte0)).bi & a.X;
	// 9978 18630:aload_1         
	// 9979 18631:aload_1         
	// 9980 18632:getfield        #274 <Field int azh.bi>
	// 9981 18635:aload_0         
	// 9982 18636:getfield        #12  <Field azh a>
	// 9983 18639:getfield        #355 <Field int azh.X>
	// 9984 18642:iand            
	// 9985 18643:putfield        #355 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 9986 18646:aload_0         
	// 9987 18647:getfield        #12  <Field azh a>
	// 9988 18650:astore_1        
		abyte0.X = ((azh) (abyte0)).ch ^ a.X;
	// 9989 18651:aload_1         
	// 9990 18652:aload_1         
	// 9991 18653:getfield        #271 <Field int azh.ch>
	// 9992 18656:aload_0         
	// 9993 18657:getfield        #12  <Field azh a>
	// 9994 18660:getfield        #355 <Field int azh.X>
	// 9995 18663:ixor            
	// 9996 18664:putfield        #355 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 9997 18667:aload_0         
	// 9998 18668:getfield        #12  <Field azh a>
	// 9999 18671:astore_1        
		abyte0.aV = ((azh) (abyte0)).cf & a.aV;
	// 10000 18672:aload_1         
	// 10001 18673:aload_1         
	// 10002 18674:getfield        #91  <Field int azh.cf>
	// 10003 18677:aload_0         
	// 10004 18678:getfield        #12  <Field azh a>
	// 10005 18681:getfield        #502 <Field int azh.aV>
	// 10006 18684:iand            
	// 10007 18685:putfield        #502 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 10008 18688:aload_0         
	// 10009 18689:getfield        #12  <Field azh a>
	// 10010 18692:astore_1        
		abyte0.aV = ((azh) (abyte0)).bX ^ a.aV;
	// 10011 18693:aload_1         
	// 10012 18694:aload_1         
	// 10013 18695:getfield        #139 <Field int azh.bX>
	// 10014 18698:aload_0         
	// 10015 18699:getfield        #12  <Field azh a>
	// 10016 18702:getfield        #502 <Field int azh.aV>
	// 10017 18705:ixor            
	// 10018 18706:putfield        #502 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 10019 18709:aload_0         
	// 10020 18710:getfield        #12  <Field azh a>
	// 10021 18713:astore_1        
		abyte0.ch = ((azh) (abyte0)).bE | a.aV;
	// 10022 18714:aload_1         
	// 10023 18715:aload_1         
	// 10024 18716:getfield        #56  <Field int azh.bE>
	// 10025 18719:aload_0         
	// 10026 18720:getfield        #12  <Field azh a>
	// 10027 18723:getfield        #502 <Field int azh.aV>
	// 10028 18726:ior             
	// 10029 18727:putfield        #271 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 10030 18730:aload_0         
	// 10031 18731:getfield        #12  <Field azh a>
	// 10032 18734:astore_1        
		abyte0.ch = ((azh) (abyte0)).bi & ~a.ch;
	// 10033 18735:aload_1         
	// 10034 18736:aload_1         
	// 10035 18737:getfield        #274 <Field int azh.bi>
	// 10036 18740:aload_0         
	// 10037 18741:getfield        #12  <Field azh a>
	// 10038 18744:getfield        #271 <Field int azh.ch>
	// 10039 18747:iconst_m1       
	// 10040 18748:ixor            
	// 10041 18749:iand            
	// 10042 18750:putfield        #271 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 10043 18753:aload_0         
	// 10044 18754:getfield        #12  <Field azh a>
	// 10045 18757:astore_1        
		abyte0.ch = ((azh) (abyte0)).aE ^ a.ch;
	// 10046 18758:aload_1         
	// 10047 18759:aload_1         
	// 10048 18760:getfield        #370 <Field int azh.aE>
	// 10049 18763:aload_0         
	// 10050 18764:getfield        #12  <Field azh a>
	// 10051 18767:getfield        #271 <Field int azh.ch>
	// 10052 18770:ixor            
	// 10053 18771:putfield        #271 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 10054 18774:aload_0         
	// 10055 18775:getfield        #12  <Field azh a>
	// 10056 18778:astore_1        
		abyte0.bM = ((azh) (abyte0)).aV ^ a.bM;
	// 10057 18779:aload_1         
	// 10058 18780:aload_1         
	// 10059 18781:getfield        #502 <Field int azh.aV>
	// 10060 18784:aload_0         
	// 10061 18785:getfield        #12  <Field azh a>
	// 10062 18788:getfield        #349 <Field int azh.bM>
	// 10063 18791:ixor            
	// 10064 18792:putfield        #349 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 10065 18795:aload_0         
	// 10066 18796:getfield        #12  <Field azh a>
	// 10067 18799:astore_1        
		abyte0.bM = ((azh) (abyte0)).bi & ~a.bM;
	// 10068 18800:aload_1         
	// 10069 18801:aload_1         
	// 10070 18802:getfield        #274 <Field int azh.bi>
	// 10071 18805:aload_0         
	// 10072 18806:getfield        #12  <Field azh a>
	// 10073 18809:getfield        #349 <Field int azh.bM>
	// 10074 18812:iconst_m1       
	// 10075 18813:ixor            
	// 10076 18814:iand            
	// 10077 18815:putfield        #349 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 10078 18818:aload_0         
	// 10079 18819:getfield        #12  <Field azh a>
	// 10080 18822:astore_1        
		abyte0.aV = ((azh) (abyte0)).bn ^ a.l;
	// 10081 18823:aload_1         
	// 10082 18824:aload_1         
	// 10083 18825:getfield        #226 <Field int azh.bn>
	// 10084 18828:aload_0         
	// 10085 18829:getfield        #12  <Field azh a>
	// 10086 18832:getfield        #112 <Field int azh.l>
	// 10087 18835:ixor            
	// 10088 18836:putfield        #502 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 10089 18839:aload_0         
	// 10090 18840:getfield        #12  <Field azh a>
	// 10091 18843:astore_1        
		abyte0.az = ((azh) (abyte0)).aV ^ a.az;
	// 10092 18844:aload_1         
	// 10093 18845:aload_1         
	// 10094 18846:getfield        #502 <Field int azh.aV>
	// 10095 18849:aload_0         
	// 10096 18850:getfield        #12  <Field azh a>
	// 10097 18853:getfield        #268 <Field int azh.az>
	// 10098 18856:ixor            
	// 10099 18857:putfield        #268 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 10100 18860:aload_0         
	// 10101 18861:getfield        #12  <Field azh a>
	// 10102 18864:astore_1        
		abyte0.bd = ((azh) (abyte0)).az ^ a.bd;
	// 10103 18865:aload_1         
	// 10104 18866:aload_1         
	// 10105 18867:getfield        #268 <Field int azh.az>
	// 10106 18870:aload_0         
	// 10107 18871:getfield        #12  <Field azh a>
	// 10108 18874:getfield        #457 <Field int azh.bd>
	// 10109 18877:ixor            
	// 10110 18878:putfield        #457 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 10111 18881:aload_0         
	// 10112 18882:getfield        #12  <Field azh a>
	// 10113 18885:astore_1        
		abyte0.ah = ((azh) (abyte0)).bd ^ a.ah;
	// 10114 18886:aload_1         
	// 10115 18887:aload_1         
	// 10116 18888:getfield        #457 <Field int azh.bd>
	// 10117 18891:aload_0         
	// 10118 18892:getfield        #12  <Field azh a>
	// 10119 18895:getfield        #394 <Field int azh.ah>
	// 10120 18898:ixor            
	// 10121 18899:putfield        #394 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 10122 18902:aload_0         
	// 10123 18903:getfield        #12  <Field azh a>
	// 10124 18906:astore_1        
		abyte0.bd = ((azh) (abyte0)).cf & a.aV;
	// 10125 18907:aload_1         
	// 10126 18908:aload_1         
	// 10127 18909:getfield        #91  <Field int azh.cf>
	// 10128 18912:aload_0         
	// 10129 18913:getfield        #12  <Field azh a>
	// 10130 18916:getfield        #502 <Field int azh.aV>
	// 10131 18919:iand            
	// 10132 18920:putfield        #457 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 10133 18923:aload_0         
	// 10134 18924:getfield        #12  <Field azh a>
	// 10135 18927:astore_1        
		abyte0.bd = ((azh) (abyte0)).bX ^ a.bd;
	// 10136 18928:aload_1         
	// 10137 18929:aload_1         
	// 10138 18930:getfield        #139 <Field int azh.bX>
	// 10139 18933:aload_0         
	// 10140 18934:getfield        #12  <Field azh a>
	// 10141 18937:getfield        #457 <Field int azh.bd>
	// 10142 18940:ixor            
	// 10143 18941:putfield        #457 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 10144 18944:aload_0         
	// 10145 18945:getfield        #12  <Field azh a>
	// 10146 18948:astore_1        
		abyte0.aN = ((azh) (abyte0)).bd ^ a.aN;
	// 10147 18949:aload_1         
	// 10148 18950:aload_1         
	// 10149 18951:getfield        #457 <Field int azh.bd>
	// 10150 18954:aload_0         
	// 10151 18955:getfield        #12  <Field azh a>
	// 10152 18958:getfield        #481 <Field int azh.aN>
	// 10153 18961:ixor            
	// 10154 18962:putfield        #481 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 10155 18965:aload_0         
	// 10156 18966:getfield        #12  <Field azh a>
	// 10157 18969:astore_1        
		abyte0.aN = ((azh) (abyte0)).aN ^ a.bi;
	// 10158 18970:aload_1         
	// 10159 18971:aload_1         
	// 10160 18972:getfield        #481 <Field int azh.aN>
	// 10161 18975:aload_0         
	// 10162 18976:getfield        #12  <Field azh a>
	// 10163 18979:getfield        #274 <Field int azh.bi>
	// 10164 18982:ixor            
	// 10165 18983:putfield        #481 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 10166 18986:aload_0         
	// 10167 18987:getfield        #12  <Field azh a>
	// 10168 18990:astore_1        
		abyte0.aV = ((azh) (abyte0)).cf & ~a.aV;
	// 10169 18991:aload_1         
	// 10170 18992:aload_1         
	// 10171 18993:getfield        #91  <Field int azh.cf>
	// 10172 18996:aload_0         
	// 10173 18997:getfield        #12  <Field azh a>
	// 10174 19000:getfield        #502 <Field int azh.aV>
	// 10175 19003:iconst_m1       
	// 10176 19004:ixor            
	// 10177 19005:iand            
	// 10178 19006:putfield        #502 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 10179 19009:aload_0         
	// 10180 19010:getfield        #12  <Field azh a>
	// 10181 19013:astore_1        
		abyte0.aV = ((azh) (abyte0)).aQ ^ a.aV;
	// 10182 19014:aload_1         
	// 10183 19015:aload_1         
	// 10184 19016:getfield        #235 <Field int azh.aQ>
	// 10185 19019:aload_0         
	// 10186 19020:getfield        #12  <Field azh a>
	// 10187 19023:getfield        #502 <Field int azh.aV>
	// 10188 19026:ixor            
	// 10189 19027:putfield        #502 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 10190 19030:aload_0         
	// 10191 19031:getfield        #12  <Field azh a>
	// 10192 19034:astore_1        
		abyte0.aH = ((azh) (abyte0)).aV ^ a.aH;
	// 10193 19035:aload_1         
	// 10194 19036:aload_1         
	// 10195 19037:getfield        #502 <Field int azh.aV>
	// 10196 19040:aload_0         
	// 10197 19041:getfield        #12  <Field azh a>
	// 10198 19044:getfield        #523 <Field int azh.aH>
	// 10199 19047:ixor            
	// 10200 19048:putfield        #523 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 10201 19051:aload_0         
	// 10202 19052:getfield        #12  <Field azh a>
	// 10203 19055:astore_1        
		abyte0.bM = ((azh) (abyte0)).aH ^ a.bM;
	// 10204 19056:aload_1         
	// 10205 19057:aload_1         
	// 10206 19058:getfield        #523 <Field int azh.aH>
	// 10207 19061:aload_0         
	// 10208 19062:getfield        #12  <Field azh a>
	// 10209 19065:getfield        #349 <Field int azh.bM>
	// 10210 19068:ixor            
	// 10211 19069:putfield        #349 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 10212 19072:aload_0         
	// 10213 19073:getfield        #12  <Field azh a>
	// 10214 19076:astore_1        
		abyte0.aW = ((azh) (abyte0)).aW & a.S;
	// 10215 19077:aload_1         
	// 10216 19078:aload_1         
	// 10217 19079:getfield        #229 <Field int azh.aW>
	// 10218 19082:aload_0         
	// 10219 19083:getfield        #12  <Field azh a>
	// 10220 19086:getfield        #148 <Field int azh.S>
	// 10221 19089:iand            
	// 10222 19090:putfield        #229 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 10223 19093:aload_0         
	// 10224 19094:getfield        #12  <Field azh a>
	// 10225 19097:astore_1        
		abyte0.aW = ((azh) (abyte0)).bk ^ a.aW;
	// 10226 19098:aload_1         
	// 10227 19099:aload_1         
	// 10228 19100:getfield        #163 <Field int azh.bk>
	// 10229 19103:aload_0         
	// 10230 19104:getfield        #12  <Field azh a>
	// 10231 19107:getfield        #229 <Field int azh.aW>
	// 10232 19110:ixor            
	// 10233 19111:putfield        #229 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 10234 19114:aload_0         
	// 10235 19115:getfield        #12  <Field azh a>
	// 10236 19118:astore_1        
		abyte0.f = ((azh) (abyte0)).aW ^ a.f;
	// 10237 19119:aload_1         
	// 10238 19120:aload_1         
	// 10239 19121:getfield        #229 <Field int azh.aW>
	// 10240 19124:aload_0         
	// 10241 19125:getfield        #12  <Field azh a>
	// 10242 19128:getfield        #526 <Field int azh.f>
	// 10243 19131:ixor            
	// 10244 19132:putfield        #526 <Field int azh.f>
		abyte0 = ((byte []) (a));
	// 10245 19135:aload_0         
	// 10246 19136:getfield        #12  <Field azh a>
	// 10247 19139:astore_1        
		abyte0.aW = ((azh) (abyte0)).f & ~a.H;
	// 10248 19140:aload_1         
	// 10249 19141:aload_1         
	// 10250 19142:getfield        #526 <Field int azh.f>
	// 10251 19145:aload_0         
	// 10252 19146:getfield        #12  <Field azh a>
	// 10253 19149:getfield        #451 <Field int azh.H>
	// 10254 19152:iconst_m1       
	// 10255 19153:ixor            
	// 10256 19154:iand            
	// 10257 19155:putfield        #229 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 10258 19158:aload_0         
	// 10259 19159:getfield        #12  <Field azh a>
	// 10260 19162:astore_1        
		abyte0.bk = ((azh) (abyte0)).H | a.f;
	// 10261 19163:aload_1         
	// 10262 19164:aload_1         
	// 10263 19165:getfield        #451 <Field int azh.H>
	// 10264 19168:aload_0         
	// 10265 19169:getfield        #12  <Field azh a>
	// 10266 19172:getfield        #526 <Field int azh.f>
	// 10267 19175:ior             
	// 10268 19176:putfield        #163 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 10269 19179:aload_0         
	// 10270 19180:getfield        #12  <Field azh a>
	// 10271 19183:astore_1        
		abyte0.aH = ((azh) (abyte0)).f ^ a.Z;
	// 10272 19184:aload_1         
	// 10273 19185:aload_1         
	// 10274 19186:getfield        #526 <Field int azh.f>
	// 10275 19189:aload_0         
	// 10276 19190:getfield        #12  <Field azh a>
	// 10277 19193:getfield        #514 <Field int azh.Z>
	// 10278 19196:ixor            
	// 10279 19197:putfield        #523 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 10280 19200:aload_0         
	// 10281 19201:getfield        #12  <Field azh a>
	// 10282 19204:astore_1        
		abyte0.aV = ((azh) (abyte0)).H | a.aH;
	// 10283 19205:aload_1         
	// 10284 19206:aload_1         
	// 10285 19207:getfield        #451 <Field int azh.H>
	// 10286 19210:aload_0         
	// 10287 19211:getfield        #12  <Field azh a>
	// 10288 19214:getfield        #523 <Field int azh.aH>
	// 10289 19217:ior             
	// 10290 19218:putfield        #502 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 10291 19221:aload_0         
	// 10292 19222:getfield        #12  <Field azh a>
	// 10293 19225:astore_1        
		abyte0.aQ = ((azh) (abyte0)).H | a.aH;
	// 10294 19226:aload_1         
	// 10295 19227:aload_1         
	// 10296 19228:getfield        #451 <Field int azh.H>
	// 10297 19231:aload_0         
	// 10298 19232:getfield        #12  <Field azh a>
	// 10299 19235:getfield        #523 <Field int azh.aH>
	// 10300 19238:ior             
	// 10301 19239:putfield        #235 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 10302 19242:aload_0         
	// 10303 19243:getfield        #12  <Field azh a>
	// 10304 19246:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aH ^ a.aQ;
	// 10305 19247:aload_1         
	// 10306 19248:aload_1         
	// 10307 19249:getfield        #523 <Field int azh.aH>
	// 10308 19252:aload_0         
	// 10309 19253:getfield        #12  <Field azh a>
	// 10310 19256:getfield        #235 <Field int azh.aQ>
	// 10311 19259:ixor            
	// 10312 19260:putfield        #235 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 10313 19263:aload_0         
	// 10314 19264:getfield        #12  <Field azh a>
	// 10315 19267:astore_1        
		abyte0.bd = ((azh) (abyte0)).aH ^ a.H;
	// 10316 19268:aload_1         
	// 10317 19269:aload_1         
	// 10318 19270:getfield        #523 <Field int azh.aH>
	// 10319 19273:aload_0         
	// 10320 19274:getfield        #12  <Field azh a>
	// 10321 19277:getfield        #451 <Field int azh.H>
	// 10322 19280:ixor            
	// 10323 19281:putfield        #457 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 10324 19284:aload_0         
	// 10325 19285:getfield        #12  <Field azh a>
	// 10326 19288:astore_1        
		abyte0.aW = ((azh) (abyte0)).aH ^ a.aW;
	// 10327 19289:aload_1         
	// 10328 19290:aload_1         
	// 10329 19291:getfield        #523 <Field int azh.aH>
	// 10330 19294:aload_0         
	// 10331 19295:getfield        #12  <Field azh a>
	// 10332 19298:getfield        #229 <Field int azh.aW>
	// 10333 19301:ixor            
	// 10334 19302:putfield        #229 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 10335 19305:aload_0         
	// 10336 19306:getfield        #12  <Field azh a>
	// 10337 19309:astore_1        
		abyte0.aH = ((azh) (abyte0)).Z & ~a.f;
	// 10338 19310:aload_1         
	// 10339 19311:aload_1         
	// 10340 19312:getfield        #514 <Field int azh.Z>
	// 10341 19315:aload_0         
	// 10342 19316:getfield        #12  <Field azh a>
	// 10343 19319:getfield        #526 <Field int azh.f>
	// 10344 19322:iconst_m1       
	// 10345 19323:ixor            
	// 10346 19324:iand            
	// 10347 19325:putfield        #523 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 10348 19328:aload_0         
	// 10349 19329:getfield        #12  <Field azh a>
	// 10350 19332:astore_1        
		abyte0.bX = ((azh) (abyte0)).aH & ~a.H;
	// 10351 19333:aload_1         
	// 10352 19334:aload_1         
	// 10353 19335:getfield        #523 <Field int azh.aH>
	// 10354 19338:aload_0         
	// 10355 19339:getfield        #12  <Field azh a>
	// 10356 19342:getfield        #451 <Field int azh.H>
	// 10357 19345:iconst_m1       
	// 10358 19346:ixor            
	// 10359 19347:iand            
	// 10360 19348:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 10361 19351:aload_0         
	// 10362 19352:getfield        #12  <Field azh a>
	// 10363 19355:astore_1        
		abyte0.bX = ((azh) (abyte0)).aH ^ a.bX;
	// 10364 19356:aload_1         
	// 10365 19357:aload_1         
	// 10366 19358:getfield        #523 <Field int azh.aH>
	// 10367 19361:aload_0         
	// 10368 19362:getfield        #12  <Field azh a>
	// 10369 19365:getfield        #139 <Field int azh.bX>
	// 10370 19368:ixor            
	// 10371 19369:putfield        #139 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 10372 19372:aload_0         
	// 10373 19373:getfield        #12  <Field azh a>
	// 10374 19376:astore_1        
		abyte0.az = ((azh) (abyte0)).f & ~a.Z;
	// 10375 19377:aload_1         
	// 10376 19378:aload_1         
	// 10377 19379:getfield        #526 <Field int azh.f>
	// 10378 19382:aload_0         
	// 10379 19383:getfield        #12  <Field azh a>
	// 10380 19386:getfield        #514 <Field int azh.Z>
	// 10381 19389:iconst_m1       
	// 10382 19390:ixor            
	// 10383 19391:iand            
	// 10384 19392:putfield        #268 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 10385 19395:aload_0         
	// 10386 19396:getfield        #12  <Field azh a>
	// 10387 19399:astore_1        
		abyte0.aE = ((azh) (abyte0)).az & ~a.H;
	// 10388 19400:aload_1         
	// 10389 19401:aload_1         
	// 10390 19402:getfield        #268 <Field int azh.az>
	// 10391 19405:aload_0         
	// 10392 19406:getfield        #12  <Field azh a>
	// 10393 19409:getfield        #451 <Field int azh.H>
	// 10394 19412:iconst_m1       
	// 10395 19413:ixor            
	// 10396 19414:iand            
	// 10397 19415:putfield        #370 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 10398 19418:aload_0         
	// 10399 19419:getfield        #12  <Field azh a>
	// 10400 19422:astore_1        
		abyte0.ce = ((azh) (abyte0)).f & a.Z;
	// 10401 19423:aload_1         
	// 10402 19424:aload_1         
	// 10403 19425:getfield        #526 <Field int azh.f>
	// 10404 19428:aload_0         
	// 10405 19429:getfield        #12  <Field azh a>
	// 10406 19432:getfield        #514 <Field int azh.Z>
	// 10407 19435:iand            
	// 10408 19436:putfield        #469 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 10409 19439:aload_0         
	// 10410 19440:getfield        #12  <Field azh a>
	// 10411 19443:astore_1        
		abyte0.bA = ((azh) (abyte0)).Z & ~a.ce;
	// 10412 19444:aload_1         
	// 10413 19445:aload_1         
	// 10414 19446:getfield        #514 <Field int azh.Z>
	// 10415 19449:aload_0         
	// 10416 19450:getfield        #12  <Field azh a>
	// 10417 19453:getfield        #469 <Field int azh.ce>
	// 10418 19456:iconst_m1       
	// 10419 19457:ixor            
	// 10420 19458:iand            
	// 10421 19459:putfield        #463 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 10422 19462:aload_0         
	// 10423 19463:getfield        #12  <Field azh a>
	// 10424 19466:astore_1        
		abyte0.bP = ((azh) (abyte0)).H | a.bA;
	// 10425 19467:aload_1         
	// 10426 19468:aload_1         
	// 10427 19469:getfield        #451 <Field int azh.H>
	// 10428 19472:aload_0         
	// 10429 19473:getfield        #12  <Field azh a>
	// 10430 19476:getfield        #463 <Field int azh.bA>
	// 10431 19479:ior             
	// 10432 19480:putfield        #397 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 10433 19483:aload_0         
	// 10434 19484:getfield        #12  <Field azh a>
	// 10435 19487:astore_1        
		abyte0.bP = ((azh) (abyte0)).ce ^ a.bP;
	// 10436 19488:aload_1         
	// 10437 19489:aload_1         
	// 10438 19490:getfield        #469 <Field int azh.ce>
	// 10439 19493:aload_0         
	// 10440 19494:getfield        #12  <Field azh a>
	// 10441 19497:getfield        #397 <Field int azh.bP>
	// 10442 19500:ixor            
	// 10443 19501:putfield        #397 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 10444 19504:aload_0         
	// 10445 19505:getfield        #12  <Field azh a>
	// 10446 19508:astore_1        
		abyte0.ca = ((azh) (abyte0)).H | a.bA;
	// 10447 19509:aload_1         
	// 10448 19510:aload_1         
	// 10449 19511:getfield        #451 <Field int azh.H>
	// 10450 19514:aload_0         
	// 10451 19515:getfield        #12  <Field azh a>
	// 10452 19518:getfield        #463 <Field int azh.bA>
	// 10453 19521:ior             
	// 10454 19522:putfield        #472 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 10455 19525:aload_0         
	// 10456 19526:getfield        #12  <Field azh a>
	// 10457 19529:astore_1        
		abyte0.ca = ((azh) (abyte0)).bA ^ a.ca;
	// 10458 19530:aload_1         
	// 10459 19531:aload_1         
	// 10460 19532:getfield        #463 <Field int azh.bA>
	// 10461 19535:aload_0         
	// 10462 19536:getfield        #12  <Field azh a>
	// 10463 19539:getfield        #472 <Field int azh.ca>
	// 10464 19542:ixor            
	// 10465 19543:putfield        #472 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 10466 19546:aload_0         
	// 10467 19547:getfield        #12  <Field azh a>
	// 10468 19550:astore_1        
		abyte0.ag = ((azh) (abyte0)).H | a.bA;
	// 10469 19551:aload_1         
	// 10470 19552:aload_1         
	// 10471 19553:getfield        #451 <Field int azh.H>
	// 10472 19556:aload_0         
	// 10473 19557:getfield        #12  <Field azh a>
	// 10474 19560:getfield        #463 <Field int azh.bA>
	// 10475 19563:ior             
	// 10476 19564:putfield        #94  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 10477 19567:aload_0         
	// 10478 19568:getfield        #12  <Field azh a>
	// 10479 19571:astore_1        
		abyte0.ag = ((azh) (abyte0)).f ^ a.ag;
	// 10480 19572:aload_1         
	// 10481 19573:aload_1         
	// 10482 19574:getfield        #526 <Field int azh.f>
	// 10483 19577:aload_0         
	// 10484 19578:getfield        #12  <Field azh a>
	// 10485 19581:getfield        #94  <Field int azh.ag>
	// 10486 19584:ixor            
	// 10487 19585:putfield        #94  <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 10488 19588:aload_0         
	// 10489 19589:getfield        #12  <Field azh a>
	// 10490 19592:astore_1        
		abyte0.aX = ((azh) (abyte0)).ce ^ a.H;
	// 10491 19593:aload_1         
	// 10492 19594:aload_1         
	// 10493 19595:getfield        #469 <Field int azh.ce>
	// 10494 19598:aload_0         
	// 10495 19599:getfield        #12  <Field azh a>
	// 10496 19602:getfield        #451 <Field int azh.H>
	// 10497 19605:ixor            
	// 10498 19606:putfield        #41  <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 10499 19609:aload_0         
	// 10500 19610:getfield        #12  <Field azh a>
	// 10501 19613:astore_1        
		abyte0.cl = ((azh) (abyte0)).ce & ~a.H;
	// 10502 19614:aload_1         
	// 10503 19615:aload_1         
	// 10504 19616:getfield        #469 <Field int azh.ce>
	// 10505 19619:aload_0         
	// 10506 19620:getfield        #12  <Field azh a>
	// 10507 19623:getfield        #451 <Field int azh.H>
	// 10508 19626:iconst_m1       
	// 10509 19627:ixor            
	// 10510 19628:iand            
	// 10511 19629:putfield        #319 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 10512 19632:aload_0         
	// 10513 19633:getfield        #12  <Field azh a>
	// 10514 19636:astore_1        
		abyte0.cg = ((azh) (abyte0)).Z | a.f;
	// 10515 19637:aload_1         
	// 10516 19638:aload_1         
	// 10517 19639:getfield        #514 <Field int azh.Z>
	// 10518 19642:aload_0         
	// 10519 19643:getfield        #12  <Field azh a>
	// 10520 19646:getfield        #526 <Field int azh.f>
	// 10521 19649:ior             
	// 10522 19650:putfield        #29  <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 10523 19653:aload_0         
	// 10524 19654:getfield        #12  <Field azh a>
	// 10525 19657:astore_1        
		abyte0.C = ((azh) (abyte0)).cg & ~a.H;
	// 10526 19658:aload_1         
	// 10527 19659:aload_1         
	// 10528 19660:getfield        #29  <Field int azh.cg>
	// 10529 19663:aload_0         
	// 10530 19664:getfield        #12  <Field azh a>
	// 10531 19667:getfield        #451 <Field int azh.H>
	// 10532 19670:iconst_m1       
	// 10533 19671:ixor            
	// 10534 19672:iand            
	// 10535 19673:putfield        #193 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 10536 19676:aload_0         
	// 10537 19677:getfield        #12  <Field azh a>
	// 10538 19680:astore_1        
		abyte0.C = ((azh) (abyte0)).bA ^ a.C;
	// 10539 19681:aload_1         
	// 10540 19682:aload_1         
	// 10541 19683:getfield        #463 <Field int azh.bA>
	// 10542 19686:aload_0         
	// 10543 19687:getfield        #12  <Field azh a>
	// 10544 19690:getfield        #193 <Field int azh.C>
	// 10545 19693:ixor            
	// 10546 19694:putfield        #193 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 10547 19697:aload_0         
	// 10548 19698:getfield        #12  <Field azh a>
	// 10549 19701:astore_1        
		abyte0.bA = ((azh) (abyte0)).H | a.cg;
	// 10550 19702:aload_1         
	// 10551 19703:aload_1         
	// 10552 19704:getfield        #451 <Field int azh.H>
	// 10553 19707:aload_0         
	// 10554 19708:getfield        #12  <Field azh a>
	// 10555 19711:getfield        #29  <Field int azh.cg>
	// 10556 19714:ior             
	// 10557 19715:putfield        #463 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 10558 19718:aload_0         
	// 10559 19719:getfield        #12  <Field azh a>
	// 10560 19722:astore_1        
		abyte0.bA = ((azh) (abyte0)).cg ^ a.bA;
	// 10561 19723:aload_1         
	// 10562 19724:aload_1         
	// 10563 19725:getfield        #29  <Field int azh.cg>
	// 10564 19728:aload_0         
	// 10565 19729:getfield        #12  <Field azh a>
	// 10566 19732:getfield        #463 <Field int azh.bA>
	// 10567 19735:ixor            
	// 10568 19736:putfield        #463 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 10569 19739:aload_0         
	// 10570 19740:getfield        #12  <Field azh a>
	// 10571 19743:astore_1        
		abyte0.au = ((azh) (abyte0)).cg & ~a.H;
	// 10572 19744:aload_1         
	// 10573 19745:aload_1         
	// 10574 19746:getfield        #29  <Field int azh.cg>
	// 10575 19749:aload_0         
	// 10576 19750:getfield        #12  <Field azh a>
	// 10577 19753:getfield        #451 <Field int azh.H>
	// 10578 19756:iconst_m1       
	// 10579 19757:ixor            
	// 10580 19758:iand            
	// 10581 19759:putfield        #187 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 10582 19762:aload_0         
	// 10583 19763:getfield        #12  <Field azh a>
	// 10584 19766:astore_1        
		abyte0.au = ((azh) (abyte0)).ce ^ a.au;
	// 10585 19767:aload_1         
	// 10586 19768:aload_1         
	// 10587 19769:getfield        #469 <Field int azh.ce>
	// 10588 19772:aload_0         
	// 10589 19773:getfield        #12  <Field azh a>
	// 10590 19776:getfield        #187 <Field int azh.au>
	// 10591 19779:ixor            
	// 10592 19780:putfield        #187 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 10593 19783:aload_0         
	// 10594 19784:getfield        #12  <Field azh a>
	// 10595 19787:astore_1        
		abyte0.cn = ((azh) (abyte0)).cg ^ a.cn;
	// 10596 19788:aload_1         
	// 10597 19789:aload_1         
	// 10598 19790:getfield        #29  <Field int azh.cg>
	// 10599 19793:aload_0         
	// 10600 19794:getfield        #12  <Field azh a>
	// 10601 19797:getfield        #379 <Field int azh.cn>
	// 10602 19800:ixor            
	// 10603 19801:putfield        #379 <Field int azh.cn>
		abyte0 = ((byte []) (a));
	// 10604 19804:aload_0         
	// 10605 19805:getfield        #12  <Field azh a>
	// 10606 19808:astore_1        
		abyte0.cc = ((azh) (abyte0)).cg & ~a.Z;
	// 10607 19809:aload_1         
	// 10608 19810:aload_1         
	// 10609 19811:getfield        #29  <Field int azh.cg>
	// 10610 19814:aload_0         
	// 10611 19815:getfield        #12  <Field azh a>
	// 10612 19818:getfield        #514 <Field int azh.Z>
	// 10613 19821:iconst_m1       
	// 10614 19822:ixor            
	// 10615 19823:iand            
	// 10616 19824:putfield        #442 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 10617 19827:aload_0         
	// 10618 19828:getfield        #12  <Field azh a>
	// 10619 19831:astore_1        
		abyte0.bt = ((azh) (abyte0)).H | a.cc;
	// 10620 19832:aload_1         
	// 10621 19833:aload_1         
	// 10622 19834:getfield        #451 <Field int azh.H>
	// 10623 19837:aload_0         
	// 10624 19838:getfield        #12  <Field azh a>
	// 10625 19841:getfield        #442 <Field int azh.cc>
	// 10626 19844:ior             
	// 10627 19845:putfield        #361 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 10628 19848:aload_0         
	// 10629 19849:getfield        #12  <Field azh a>
	// 10630 19852:astore_1        
		abyte0.bt = ((azh) (abyte0)).Z ^ a.bt;
	// 10631 19853:aload_1         
	// 10632 19854:aload_1         
	// 10633 19855:getfield        #514 <Field int azh.Z>
	// 10634 19858:aload_0         
	// 10635 19859:getfield        #12  <Field azh a>
	// 10636 19862:getfield        #361 <Field int azh.bt>
	// 10637 19865:ixor            
	// 10638 19866:putfield        #361 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 10639 19869:aload_0         
	// 10640 19870:getfield        #12  <Field azh a>
	// 10641 19873:astore_1        
		abyte0.cc = ((azh) (abyte0)).H | a.cc;
	// 10642 19874:aload_1         
	// 10643 19875:aload_1         
	// 10644 19876:getfield        #451 <Field int azh.H>
	// 10645 19879:aload_0         
	// 10646 19880:getfield        #12  <Field azh a>
	// 10647 19883:getfield        #442 <Field int azh.cc>
	// 10648 19886:ior             
	// 10649 19887:putfield        #442 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 10650 19890:aload_0         
	// 10651 19891:getfield        #12  <Field azh a>
	// 10652 19894:astore_1        
		abyte0.cc = ((azh) (abyte0)).az ^ a.cc;
	// 10653 19895:aload_1         
	// 10654 19896:aload_1         
	// 10655 19897:getfield        #268 <Field int azh.az>
	// 10656 19900:aload_0         
	// 10657 19901:getfield        #12  <Field azh a>
	// 10658 19904:getfield        #442 <Field int azh.cc>
	// 10659 19907:ixor            
	// 10660 19908:putfield        #442 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 10661 19911:aload_0         
	// 10662 19912:getfield        #12  <Field azh a>
	// 10663 19915:astore_1        
		abyte0.aV = ((azh) (abyte0)).cg ^ a.aV;
	// 10664 19916:aload_1         
	// 10665 19917:aload_1         
	// 10666 19918:getfield        #29  <Field int azh.cg>
	// 10667 19921:aload_0         
	// 10668 19922:getfield        #12  <Field azh a>
	// 10669 19925:getfield        #502 <Field int azh.aV>
	// 10670 19928:ixor            
	// 10671 19929:putfield        #502 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 10672 19932:aload_0         
	// 10673 19933:getfield        #12  <Field azh a>
	// 10674 19936:astore_1        
		abyte0.az = ((azh) (abyte0)).f & ~a.H;
	// 10675 19937:aload_1         
	// 10676 19938:aload_1         
	// 10677 19939:getfield        #526 <Field int azh.f>
	// 10678 19942:aload_0         
	// 10679 19943:getfield        #12  <Field azh a>
	// 10680 19946:getfield        #451 <Field int azh.H>
	// 10681 19949:iconst_m1       
	// 10682 19950:ixor            
	// 10683 19951:iand            
	// 10684 19952:putfield        #268 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 10685 19955:aload_0         
	// 10686 19956:getfield        #12  <Field azh a>
	// 10687 19959:astore_1        
		abyte0.az = ((azh) (abyte0)).cg ^ a.az;
	// 10688 19960:aload_1         
	// 10689 19961:aload_1         
	// 10690 19962:getfield        #29  <Field int azh.cg>
	// 10691 19965:aload_0         
	// 10692 19966:getfield        #12  <Field azh a>
	// 10693 19969:getfield        #268 <Field int azh.az>
	// 10694 19972:ixor            
	// 10695 19973:putfield        #268 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 10696 19976:aload_0         
	// 10697 19977:getfield        #12  <Field azh a>
	// 10698 19980:astore_1        
		abyte0.cg = ((azh) (abyte0)).f & ~a.H;
	// 10699 19981:aload_1         
	// 10700 19982:aload_1         
	// 10701 19983:getfield        #526 <Field int azh.f>
	// 10702 19986:aload_0         
	// 10703 19987:getfield        #12  <Field azh a>
	// 10704 19990:getfield        #451 <Field int azh.H>
	// 10705 19993:iconst_m1       
	// 10706 19994:ixor            
	// 10707 19995:iand            
	// 10708 19996:putfield        #29  <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 10709 19999:aload_0         
	// 10710 20000:getfield        #12  <Field azh a>
	// 10711 20003:astore_1        
		abyte0.cg = ((azh) (abyte0)).aH ^ a.cg;
	// 10712 20004:aload_1         
	// 10713 20005:aload_1         
	// 10714 20006:getfield        #523 <Field int azh.aH>
	// 10715 20009:aload_0         
	// 10716 20010:getfield        #12  <Field azh a>
	// 10717 20013:getfield        #29  <Field int azh.cg>
	// 10718 20016:ixor            
	// 10719 20017:putfield        #29  <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 10720 20020:aload_0         
	// 10721 20021:getfield        #12  <Field azh a>
	// 10722 20024:astore_1        
		abyte0.cb = ((azh) (abyte0)).S & a.cb;
	// 10723 20025:aload_1         
	// 10724 20026:aload_1         
	// 10725 20027:getfield        #148 <Field int azh.S>
	// 10726 20030:aload_0         
	// 10727 20031:getfield        #12  <Field azh a>
	// 10728 20034:getfield        #115 <Field int azh.cb>
	// 10729 20037:iand            
	// 10730 20038:putfield        #115 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 10731 20041:aload_0         
	// 10732 20042:getfield        #12  <Field azh a>
	// 10733 20045:astore_1        
		abyte0.cb = ((azh) (abyte0)).bS ^ a.cb;
	// 10734 20046:aload_1         
	// 10735 20047:aload_1         
	// 10736 20048:getfield        #103 <Field int azh.bS>
	// 10737 20051:aload_0         
	// 10738 20052:getfield        #12  <Field azh a>
	// 10739 20055:getfield        #115 <Field int azh.cb>
	// 10740 20058:ixor            
	// 10741 20059:putfield        #115 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 10742 20062:aload_0         
	// 10743 20063:getfield        #12  <Field azh a>
	// 10744 20066:astore_1        
		abyte0.x = ((azh) (abyte0)).cb ^ a.x;
	// 10745 20067:aload_1         
	// 10746 20068:aload_1         
	// 10747 20069:getfield        #115 <Field int azh.cb>
	// 10748 20072:aload_0         
	// 10749 20073:getfield        #12  <Field azh a>
	// 10750 20076:getfield        #160 <Field int azh.x>
	// 10751 20079:ixor            
	// 10752 20080:putfield        #160 <Field int azh.x>
		abyte0 = ((byte []) (a));
	// 10753 20083:aload_0         
	// 10754 20084:getfield        #12  <Field azh a>
	// 10755 20087:astore_1        
		abyte0.aD = ((azh) (abyte0)).S & ~a.aD;
	// 10756 20088:aload_1         
	// 10757 20089:aload_1         
	// 10758 20090:getfield        #148 <Field int azh.S>
	// 10759 20093:aload_0         
	// 10760 20094:getfield        #12  <Field azh a>
	// 10761 20097:getfield        #202 <Field int azh.aD>
	// 10762 20100:iconst_m1       
	// 10763 20101:ixor            
	// 10764 20102:iand            
	// 10765 20103:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 10766 20106:aload_0         
	// 10767 20107:getfield        #12  <Field azh a>
	// 10768 20110:astore_1        
		abyte0.aD = ((azh) (abyte0)).aK ^ a.aD;
	// 10769 20111:aload_1         
	// 10770 20112:aload_1         
	// 10771 20113:getfield        #151 <Field int azh.aK>
	// 10772 20116:aload_0         
	// 10773 20117:getfield        #12  <Field azh a>
	// 10774 20120:getfield        #202 <Field int azh.aD>
	// 10775 20123:ixor            
	// 10776 20124:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 10777 20127:aload_0         
	// 10778 20128:getfield        #12  <Field azh a>
	// 10779 20131:astore_1        
		abyte0.bl = ((azh) (abyte0)).aD ^ a.bl;
	// 10780 20132:aload_1         
	// 10781 20133:aload_1         
	// 10782 20134:getfield        #202 <Field int azh.aD>
	// 10783 20137:aload_0         
	// 10784 20138:getfield        #12  <Field azh a>
	// 10785 20141:getfield        #50  <Field int azh.bl>
	// 10786 20144:ixor            
	// 10787 20145:putfield        #50  <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 10788 20148:aload_0         
	// 10789 20149:getfield        #12  <Field azh a>
	// 10790 20152:astore_1        
		abyte0.aD = ((azh) (abyte0)).bl & ~a.bE;
	// 10791 20153:aload_1         
	// 10792 20154:aload_1         
	// 10793 20155:getfield        #50  <Field int azh.bl>
	// 10794 20158:aload_0         
	// 10795 20159:getfield        #12  <Field azh a>
	// 10796 20162:getfield        #56  <Field int azh.bE>
	// 10797 20165:iconst_m1       
	// 10798 20166:ixor            
	// 10799 20167:iand            
	// 10800 20168:putfield        #202 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 10801 20171:aload_0         
	// 10802 20172:getfield        #12  <Field azh a>
	// 10803 20175:astore_1        
		abyte0.aK = ((azh) (abyte0)).bl & ~a.aD;
	// 10804 20176:aload_1         
	// 10805 20177:aload_1         
	// 10806 20178:getfield        #50  <Field int azh.bl>
	// 10807 20181:aload_0         
	// 10808 20182:getfield        #12  <Field azh a>
	// 10809 20185:getfield        #202 <Field int azh.aD>
	// 10810 20188:iconst_m1       
	// 10811 20189:ixor            
	// 10812 20190:iand            
	// 10813 20191:putfield        #151 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 10814 20194:aload_0         
	// 10815 20195:getfield        #12  <Field azh a>
	// 10816 20198:astore_1        
		abyte0.cb = ((azh) (abyte0)).bl & a.bE;
	// 10817 20199:aload_1         
	// 10818 20200:aload_1         
	// 10819 20201:getfield        #50  <Field int azh.bl>
	// 10820 20204:aload_0         
	// 10821 20205:getfield        #12  <Field azh a>
	// 10822 20208:getfield        #56  <Field int azh.bE>
	// 10823 20211:iand            
	// 10824 20212:putfield        #115 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 10825 20215:aload_0         
	// 10826 20216:getfield        #12  <Field azh a>
	// 10827 20219:astore_1        
		abyte0.bS = ((azh) (abyte0)).bE & ~a.bl;
	// 10828 20220:aload_1         
	// 10829 20221:aload_1         
	// 10830 20222:getfield        #56  <Field int azh.bE>
	// 10831 20225:aload_0         
	// 10832 20226:getfield        #12  <Field azh a>
	// 10833 20229:getfield        #50  <Field int azh.bl>
	// 10834 20232:iconst_m1       
	// 10835 20233:ixor            
	// 10836 20234:iand            
	// 10837 20235:putfield        #103 <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 10838 20238:aload_0         
	// 10839 20239:getfield        #12  <Field azh a>
	// 10840 20242:astore_1        
		abyte0.aH = ((azh) (abyte0)).bS | a.bl;
	// 10841 20243:aload_1         
	// 10842 20244:aload_1         
	// 10843 20245:getfield        #103 <Field int azh.bS>
	// 10844 20248:aload_0         
	// 10845 20249:getfield        #12  <Field azh a>
	// 10846 20252:getfield        #50  <Field int azh.bl>
	// 10847 20255:ior             
	// 10848 20256:putfield        #523 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 10849 20259:aload_0         
	// 10850 20260:getfield        #12  <Field azh a>
	// 10851 20263:astore_1        
		abyte0.as = ((azh) (abyte0)).bE | a.bl;
	// 10852 20264:aload_1         
	// 10853 20265:aload_1         
	// 10854 20266:getfield        #56  <Field int azh.bE>
	// 10855 20269:aload_0         
	// 10856 20270:getfield        #12  <Field azh a>
	// 10857 20273:getfield        #50  <Field int azh.bl>
	// 10858 20276:ior             
	// 10859 20277:putfield        #445 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 10860 20280:aload_0         
	// 10861 20281:getfield        #12  <Field azh a>
	// 10862 20284:astore_1        
		abyte0.bJ = ((azh) (abyte0)).aL & a.bl;
	// 10863 20285:aload_1         
	// 10864 20286:aload_1         
	// 10865 20287:getfield        #109 <Field int azh.aL>
	// 10866 20290:aload_0         
	// 10867 20291:getfield        #12  <Field azh a>
	// 10868 20294:getfield        #50  <Field int azh.bl>
	// 10869 20297:iand            
	// 10870 20298:putfield        #190 <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 10871 20301:aload_0         
	// 10872 20302:getfield        #12  <Field azh a>
	// 10873 20305:astore_1        
		abyte0.aS = ((azh) (abyte0)).d & ~a.aS;
	// 10874 20306:aload_1         
	// 10875 20307:aload_1         
	// 10876 20308:getfield        #337 <Field int azh.d>
	// 10877 20311:aload_0         
	// 10878 20312:getfield        #12  <Field azh a>
	// 10879 20315:getfield        #47  <Field int azh.aS>
	// 10880 20318:iconst_m1       
	// 10881 20319:ixor            
	// 10882 20320:iand            
	// 10883 20321:putfield        #47  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 10884 20324:aload_0         
	// 10885 20325:getfield        #12  <Field azh a>
	// 10886 20328:astore_1        
		abyte0.aS = ((azh) (abyte0)).bD ^ a.aS;
	// 10887 20329:aload_1         
	// 10888 20330:aload_1         
	// 10889 20331:getfield        #367 <Field int azh.bD>
	// 10890 20334:aload_0         
	// 10891 20335:getfield        #12  <Field azh a>
	// 10892 20338:getfield        #47  <Field int azh.aS>
	// 10893 20341:ixor            
	// 10894 20342:putfield        #47  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 10895 20345:aload_0         
	// 10896 20346:getfield        #12  <Field azh a>
	// 10897 20349:astore_1        
		abyte0.aS = ((azh) (abyte0)).P & ~a.aS;
	// 10898 20350:aload_1         
	// 10899 20351:aload_1         
	// 10900 20352:getfield        #376 <Field int azh.P>
	// 10901 20355:aload_0         
	// 10902 20356:getfield        #12  <Field azh a>
	// 10903 20359:getfield        #47  <Field int azh.aS>
	// 10904 20362:iconst_m1       
	// 10905 20363:ixor            
	// 10906 20364:iand            
	// 10907 20365:putfield        #47  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 10908 20368:aload_0         
	// 10909 20369:getfield        #12  <Field azh a>
	// 10910 20372:astore_1        
		abyte0.aS = ((azh) (abyte0)).aU ^ a.aS;
	// 10911 20373:aload_1         
	// 10912 20374:aload_1         
	// 10913 20375:getfield        #334 <Field int azh.aU>
	// 10914 20378:aload_0         
	// 10915 20379:getfield        #12  <Field azh a>
	// 10916 20382:getfield        #47  <Field int azh.aS>
	// 10917 20385:ixor            
	// 10918 20386:putfield        #47  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 10919 20389:aload_0         
	// 10920 20390:getfield        #12  <Field azh a>
	// 10921 20393:astore_1        
		abyte0.aS = ((azh) (abyte0)).af & a.aS;
	// 10922 20394:aload_1         
	// 10923 20395:aload_1         
	// 10924 20396:getfield        #385 <Field int azh.af>
	// 10925 20399:aload_0         
	// 10926 20400:getfield        #12  <Field azh a>
	// 10927 20403:getfield        #47  <Field int azh.aS>
	// 10928 20406:iand            
	// 10929 20407:putfield        #47  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 10930 20410:aload_0         
	// 10931 20411:getfield        #12  <Field azh a>
	// 10932 20414:astore_1        
		abyte0.aS = ((azh) (abyte0)).aq ^ a.aS;
	// 10933 20415:aload_1         
	// 10934 20416:aload_1         
	// 10935 20417:getfield        #373 <Field int azh.aq>
	// 10936 20420:aload_0         
	// 10937 20421:getfield        #12  <Field azh a>
	// 10938 20424:getfield        #47  <Field int azh.aS>
	// 10939 20427:ixor            
	// 10940 20428:putfield        #47  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 10941 20431:aload_0         
	// 10942 20432:getfield        #12  <Field azh a>
	// 10943 20435:astore_1        
		abyte0.a = ((azh) (abyte0)).aS ^ a.a;
	// 10944 20436:aload_1         
	// 10945 20437:aload_1         
	// 10946 20438:getfield        #47  <Field int azh.aS>
	// 10947 20441:aload_0         
	// 10948 20442:getfield        #12  <Field azh a>
	// 10949 20445:getfield        #528 <Field int azh.a>
	// 10950 20448:ixor            
	// 10951 20449:putfield        #528 <Field int azh.a>
		abyte0 = ((byte []) (a));
	// 10952 20452:aload_0         
	// 10953 20453:getfield        #12  <Field azh a>
	// 10954 20456:astore_1        
		abyte0.at = ((azh) (abyte0)).a | a.at;
	// 10955 20457:aload_1         
	// 10956 20458:aload_1         
	// 10957 20459:getfield        #528 <Field int azh.a>
	// 10958 20462:aload_0         
	// 10959 20463:getfield        #12  <Field azh a>
	// 10960 20466:getfield        #430 <Field int azh.at>
	// 10961 20469:ior             
	// 10962 20470:putfield        #430 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 10963 20473:aload_0         
	// 10964 20474:getfield        #12  <Field azh a>
	// 10965 20477:astore_1        
		abyte0.at = ((azh) (abyte0)).ap ^ a.at;
	// 10966 20478:aload_1         
	// 10967 20479:aload_1         
	// 10968 20480:getfield        #38  <Field int azh.ap>
	// 10969 20483:aload_0         
	// 10970 20484:getfield        #12  <Field azh a>
	// 10971 20487:getfield        #430 <Field int azh.at>
	// 10972 20490:ixor            
	// 10973 20491:putfield        #430 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 10974 20494:aload_0         
	// 10975 20495:getfield        #12  <Field azh a>
	// 10976 20498:astore_1        
		abyte0.ao = ((azh) (abyte0)).a | a.ao;
	// 10977 20499:aload_1         
	// 10978 20500:aload_1         
	// 10979 20501:getfield        #528 <Field int azh.a>
	// 10980 20504:aload_0         
	// 10981 20505:getfield        #12  <Field azh a>
	// 10982 20508:getfield        #238 <Field int azh.ao>
	// 10983 20511:ior             
	// 10984 20512:putfield        #238 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 10985 20515:aload_0         
	// 10986 20516:getfield        #12  <Field azh a>
	// 10987 20519:astore_1        
		abyte0.ao = ((azh) (abyte0)).bR ^ a.ao;
	// 10988 20520:aload_1         
	// 10989 20521:aload_1         
	// 10990 20522:getfield        #340 <Field int azh.bR>
	// 10991 20525:aload_0         
	// 10992 20526:getfield        #12  <Field azh a>
	// 10993 20529:getfield        #238 <Field int azh.ao>
	// 10994 20532:ixor            
	// 10995 20533:putfield        #238 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 10996 20536:aload_0         
	// 10997 20537:getfield        #12  <Field azh a>
	// 10998 20540:astore_1        
		abyte0.by = ((azh) (abyte0)).by & ~a.a;
	// 10999 20541:aload_1         
	// 11000 20542:aload_1         
	// 11001 20543:getfield        #244 <Field int azh.by>
	// 11002 20546:aload_0         
	// 11003 20547:getfield        #12  <Field azh a>
	// 11004 20550:getfield        #528 <Field int azh.a>
	// 11005 20553:iconst_m1       
	// 11006 20554:ixor            
	// 11007 20555:iand            
	// 11008 20556:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 11009 20559:aload_0         
	// 11010 20560:getfield        #12  <Field azh a>
	// 11011 20563:astore_1        
		abyte0.by = ((azh) (abyte0)).bW ^ a.by;
	// 11012 20564:aload_1         
	// 11013 20565:aload_1         
	// 11014 20566:getfield        #154 <Field int azh.bW>
	// 11015 20569:aload_0         
	// 11016 20570:getfield        #12  <Field azh a>
	// 11017 20573:getfield        #244 <Field int azh.by>
	// 11018 20576:ixor            
	// 11019 20577:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 11020 20580:aload_0         
	// 11021 20581:getfield        #12  <Field azh a>
	// 11022 20584:astore_1        
		abyte0.by = ((azh) (abyte0)).by & a.ak;
	// 11023 20585:aload_1         
	// 11024 20586:aload_1         
	// 11025 20587:getfield        #244 <Field int azh.by>
	// 11026 20590:aload_0         
	// 11027 20591:getfield        #12  <Field azh a>
	// 11028 20594:getfield        #531 <Field int azh.ak>
	// 11029 20597:iand            
	// 11030 20598:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 11031 20601:aload_0         
	// 11032 20602:getfield        #12  <Field azh a>
	// 11033 20605:astore_1        
		abyte0.R = ((azh) (abyte0)).a | a.R;
	// 11034 20606:aload_1         
	// 11035 20607:aload_1         
	// 11036 20608:getfield        #528 <Field int azh.a>
	// 11037 20611:aload_0         
	// 11038 20612:getfield        #12  <Field azh a>
	// 11039 20615:getfield        #439 <Field int azh.R>
	// 11040 20618:ior             
	// 11041 20619:putfield        #439 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 11042 20622:aload_0         
	// 11043 20623:getfield        #12  <Field azh a>
	// 11044 20626:astore_1        
		abyte0.R = ((azh) (abyte0)).cj ^ a.R;
	// 11045 20627:aload_1         
	// 11046 20628:aload_1         
	// 11047 20629:getfield        #475 <Field int azh.cj>
	// 11048 20632:aload_0         
	// 11049 20633:getfield        #12  <Field azh a>
	// 11050 20636:getfield        #439 <Field int azh.R>
	// 11051 20639:ixor            
	// 11052 20640:putfield        #439 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 11053 20643:aload_0         
	// 11054 20644:getfield        #12  <Field azh a>
	// 11055 20647:astore_1        
		abyte0.by = ((azh) (abyte0)).R ^ a.by;
	// 11056 20648:aload_1         
	// 11057 20649:aload_1         
	// 11058 20650:getfield        #439 <Field int azh.R>
	// 11059 20653:aload_0         
	// 11060 20654:getfield        #12  <Field azh a>
	// 11061 20657:getfield        #244 <Field int azh.by>
	// 11062 20660:ixor            
	// 11063 20661:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 11064 20664:aload_0         
	// 11065 20665:getfield        #12  <Field azh a>
	// 11066 20668:astore_1        
		abyte0.br = ((azh) (abyte0)).by ^ a.br;
	// 11067 20669:aload_1         
	// 11068 20670:aload_1         
	// 11069 20671:getfield        #244 <Field int azh.by>
	// 11070 20674:aload_0         
	// 11071 20675:getfield        #12  <Field azh a>
	// 11072 20678:getfield        #534 <Field int azh.br>
	// 11073 20681:ixor            
	// 11074 20682:putfield        #534 <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 11075 20685:aload_0         
	// 11076 20686:getfield        #12  <Field azh a>
	// 11077 20689:astore_1        
		abyte0.by = ((azh) (abyte0)).a & ~a.G;
	// 11078 20690:aload_1         
	// 11079 20691:aload_1         
	// 11080 20692:getfield        #528 <Field int azh.a>
	// 11081 20695:aload_0         
	// 11082 20696:getfield        #12  <Field azh a>
	// 11083 20699:getfield        #280 <Field int azh.G>
	// 11084 20702:iconst_m1       
	// 11085 20703:ixor            
	// 11086 20704:iand            
	// 11087 20705:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 11088 20708:aload_0         
	// 11089 20709:getfield        #12  <Field azh a>
	// 11090 20712:astore_1        
		abyte0.R = ((azh) (abyte0)).G | a.by;
	// 11091 20713:aload_1         
	// 11092 20714:aload_1         
	// 11093 20715:getfield        #280 <Field int azh.G>
	// 11094 20718:aload_0         
	// 11095 20719:getfield        #12  <Field azh a>
	// 11096 20722:getfield        #244 <Field int azh.by>
	// 11097 20725:ior             
	// 11098 20726:putfield        #439 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 11099 20729:aload_0         
	// 11100 20730:getfield        #12  <Field azh a>
	// 11101 20733:astore_1        
		abyte0.R = ((azh) (abyte0)).q & a.R;
	// 11102 20734:aload_1         
	// 11103 20735:aload_1         
	// 11104 20736:getfield        #283 <Field int azh.q>
	// 11105 20739:aload_0         
	// 11106 20740:getfield        #12  <Field azh a>
	// 11107 20743:getfield        #439 <Field int azh.R>
	// 11108 20746:iand            
	// 11109 20747:putfield        #439 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 11110 20750:aload_0         
	// 11111 20751:getfield        #12  <Field azh a>
	// 11112 20754:astore_1        
		abyte0.R = ((azh) (abyte0)).a ^ a.R;
	// 11113 20755:aload_1         
	// 11114 20756:aload_1         
	// 11115 20757:getfield        #528 <Field int azh.a>
	// 11116 20760:aload_0         
	// 11117 20761:getfield        #12  <Field azh a>
	// 11118 20764:getfield        #439 <Field int azh.R>
	// 11119 20767:ixor            
	// 11120 20768:putfield        #439 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 11121 20771:aload_0         
	// 11122 20772:getfield        #12  <Field azh a>
	// 11123 20775:astore_1        
		abyte0.aY = ((azh) (abyte0)).R ^ a.aY;
	// 11124 20776:aload_1         
	// 11125 20777:aload_1         
	// 11126 20778:getfield        #439 <Field int azh.R>
	// 11127 20781:aload_0         
	// 11128 20782:getfield        #12  <Field azh a>
	// 11129 20785:getfield        #62  <Field int azh.aY>
	// 11130 20788:ixor            
	// 11131 20789:putfield        #62  <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 11132 20792:aload_0         
	// 11133 20793:getfield        #12  <Field azh a>
	// 11134 20796:astore_1        
		abyte0.aY = ((azh) (abyte0)).y & a.aY;
	// 11135 20797:aload_1         
	// 11136 20798:aload_1         
	// 11137 20799:getfield        #517 <Field int azh.y>
	// 11138 20802:aload_0         
	// 11139 20803:getfield        #12  <Field azh a>
	// 11140 20806:getfield        #62  <Field int azh.aY>
	// 11141 20809:iand            
	// 11142 20810:putfield        #62  <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 11143 20813:aload_0         
	// 11144 20814:getfield        #12  <Field azh a>
	// 11145 20817:astore_1        
		abyte0.cj = ((azh) (abyte0)).q & a.by;
	// 11146 20818:aload_1         
	// 11147 20819:aload_1         
	// 11148 20820:getfield        #283 <Field int azh.q>
	// 11149 20823:aload_0         
	// 11150 20824:getfield        #12  <Field azh a>
	// 11151 20827:getfield        #244 <Field int azh.by>
	// 11152 20830:iand            
	// 11153 20831:putfield        #475 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 11154 20834:aload_0         
	// 11155 20835:getfield        #12  <Field azh a>
	// 11156 20838:astore_1        
		abyte0.bW = ((azh) (abyte0)).i & ~a.by;
	// 11157 20839:aload_1         
	// 11158 20840:aload_1         
	// 11159 20841:getfield        #289 <Field int azh.i>
	// 11160 20844:aload_0         
	// 11161 20845:getfield        #12  <Field azh a>
	// 11162 20848:getfield        #244 <Field int azh.by>
	// 11163 20851:iconst_m1       
	// 11164 20852:ixor            
	// 11165 20853:iand            
	// 11166 20854:putfield        #154 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 11167 20857:aload_0         
	// 11168 20858:getfield        #12  <Field azh a>
	// 11169 20861:astore_1        
		abyte0.bR = ((azh) (abyte0)).q & a.by;
	// 11170 20862:aload_1         
	// 11171 20863:aload_1         
	// 11172 20864:getfield        #283 <Field int azh.q>
	// 11173 20867:aload_0         
	// 11174 20868:getfield        #12  <Field azh a>
	// 11175 20871:getfield        #244 <Field int azh.by>
	// 11176 20874:iand            
	// 11177 20875:putfield        #340 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 11178 20878:aload_0         
	// 11179 20879:getfield        #12  <Field azh a>
	// 11180 20882:astore_1        
		abyte0.bR = ((azh) (abyte0)).by ^ a.bR;
	// 11181 20883:aload_1         
	// 11182 20884:aload_1         
	// 11183 20885:getfield        #244 <Field int azh.by>
	// 11184 20888:aload_0         
	// 11185 20889:getfield        #12  <Field azh a>
	// 11186 20892:getfield        #340 <Field int azh.bR>
	// 11187 20895:ixor            
	// 11188 20896:putfield        #340 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 11189 20899:aload_0         
	// 11190 20900:getfield        #12  <Field azh a>
	// 11191 20903:astore_1        
		abyte0.bo = ((azh) (abyte0)).bo & ~a.a;
	// 11192 20904:aload_1         
	// 11193 20905:aload_1         
	// 11194 20906:getfield        #223 <Field int azh.bo>
	// 11195 20909:aload_0         
	// 11196 20910:getfield        #12  <Field azh a>
	// 11197 20913:getfield        #528 <Field int azh.a>
	// 11198 20916:iconst_m1       
	// 11199 20917:ixor            
	// 11200 20918:iand            
	// 11201 20919:putfield        #223 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 11202 20922:aload_0         
	// 11203 20923:getfield        #12  <Field azh a>
	// 11204 20926:astore_1        
		abyte0.bo = ((azh) (abyte0)).ci ^ a.bo;
	// 11205 20927:aload_1         
	// 11206 20928:aload_1         
	// 11207 20929:getfield        #181 <Field int azh.ci>
	// 11208 20932:aload_0         
	// 11209 20933:getfield        #12  <Field azh a>
	// 11210 20936:getfield        #223 <Field int azh.bo>
	// 11211 20939:ixor            
	// 11212 20940:putfield        #223 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 11213 20943:aload_0         
	// 11214 20944:getfield        #12  <Field azh a>
	// 11215 20947:astore_1        
		abyte0.bo = ((azh) (abyte0)).ak & ~a.bo;
	// 11216 20948:aload_1         
	// 11217 20949:aload_1         
	// 11218 20950:getfield        #531 <Field int azh.ak>
	// 11219 20953:aload_0         
	// 11220 20954:getfield        #12  <Field azh a>
	// 11221 20957:getfield        #223 <Field int azh.bo>
	// 11222 20960:iconst_m1       
	// 11223 20961:ixor            
	// 11224 20962:iand            
	// 11225 20963:putfield        #223 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 11226 20966:aload_0         
	// 11227 20967:getfield        #12  <Field azh a>
	// 11228 20970:astore_1        
		abyte0.ci = ((azh) (abyte0)).a | a.G;
	// 11229 20971:aload_1         
	// 11230 20972:aload_1         
	// 11231 20973:getfield        #528 <Field int azh.a>
	// 11232 20976:aload_0         
	// 11233 20977:getfield        #12  <Field azh a>
	// 11234 20980:getfield        #280 <Field int azh.G>
	// 11235 20983:ior             
	// 11236 20984:putfield        #181 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 11237 20987:aload_0         
	// 11238 20988:getfield        #12  <Field azh a>
	// 11239 20991:astore_1        
		abyte0.by = ((azh) (abyte0)).q & ~a.ci;
	// 11240 20992:aload_1         
	// 11241 20993:aload_1         
	// 11242 20994:getfield        #283 <Field int azh.q>
	// 11243 20997:aload_0         
	// 11244 20998:getfield        #12  <Field azh a>
	// 11245 21001:getfield        #181 <Field int azh.ci>
	// 11246 21004:iconst_m1       
	// 11247 21005:ixor            
	// 11248 21006:iand            
	// 11249 21007:putfield        #244 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 11250 21010:aload_0         
	// 11251 21011:getfield        #12  <Field azh a>
	// 11252 21014:astore_1        
		abyte0.ck = ((azh) (abyte0)).by ^ a.ck;
	// 11253 21015:aload_1         
	// 11254 21016:aload_1         
	// 11255 21017:getfield        #244 <Field int azh.by>
	// 11256 21020:aload_0         
	// 11257 21021:getfield        #12  <Field azh a>
	// 11258 21024:getfield        #316 <Field int azh.ck>
	// 11259 21027:ixor            
	// 11260 21028:putfield        #316 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 11261 21031:aload_0         
	// 11262 21032:getfield        #12  <Field azh a>
	// 11263 21035:astore_1        
		abyte0.aO = ((azh) (abyte0)).ck ^ a.aO;
	// 11264 21036:aload_1         
	// 11265 21037:aload_1         
	// 11266 21038:getfield        #316 <Field int azh.ck>
	// 11267 21041:aload_0         
	// 11268 21042:getfield        #12  <Field azh a>
	// 11269 21045:getfield        #301 <Field int azh.aO>
	// 11270 21048:ixor            
	// 11271 21049:putfield        #301 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 11272 21052:aload_0         
	// 11273 21053:getfield        #12  <Field azh a>
	// 11274 21056:astore_1        
		abyte0.aO = ((azh) (abyte0)).ak & ~a.aO;
	// 11275 21057:aload_1         
	// 11276 21058:aload_1         
	// 11277 21059:getfield        #531 <Field int azh.ak>
	// 11278 21062:aload_0         
	// 11279 21063:getfield        #12  <Field azh a>
	// 11280 21066:getfield        #301 <Field int azh.aO>
	// 11281 21069:iconst_m1       
	// 11282 21070:ixor            
	// 11283 21071:iand            
	// 11284 21072:putfield        #301 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 11285 21075:aload_0         
	// 11286 21076:getfield        #12  <Field azh a>
	// 11287 21079:astore_1        
		abyte0.bO = ((azh) (abyte0)).ci ^ a.bO;
	// 11288 21080:aload_1         
	// 11289 21081:aload_1         
	// 11290 21082:getfield        #181 <Field int azh.ci>
	// 11291 21085:aload_0         
	// 11292 21086:getfield        #12  <Field azh a>
	// 11293 21089:getfield        #277 <Field int azh.bO>
	// 11294 21092:ixor            
	// 11295 21093:putfield        #277 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 11296 21096:aload_0         
	// 11297 21097:getfield        #12  <Field azh a>
	// 11298 21100:astore_1        
		abyte0.bO = ((azh) (abyte0)).i & ~a.bO;
	// 11299 21101:aload_1         
	// 11300 21102:aload_1         
	// 11301 21103:getfield        #289 <Field int azh.i>
	// 11302 21106:aload_0         
	// 11303 21107:getfield        #12  <Field azh a>
	// 11304 21110:getfield        #277 <Field int azh.bO>
	// 11305 21113:iconst_m1       
	// 11306 21114:ixor            
	// 11307 21115:iand            
	// 11308 21116:putfield        #277 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 11309 21119:aload_0         
	// 11310 21120:getfield        #12  <Field azh a>
	// 11311 21123:astore_1        
		abyte0.ci = ((azh) (abyte0)).ci ^ a.q;
	// 11312 21124:aload_1         
	// 11313 21125:aload_1         
	// 11314 21126:getfield        #181 <Field int azh.ci>
	// 11315 21129:aload_0         
	// 11316 21130:getfield        #12  <Field azh a>
	// 11317 21133:getfield        #283 <Field int azh.q>
	// 11318 21136:ixor            
	// 11319 21137:putfield        #181 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 11320 21140:aload_0         
	// 11321 21141:getfield        #12  <Field azh a>
	// 11322 21144:astore_1        
		abyte0.ci = ((azh) (abyte0)).i & ~a.ci;
	// 11323 21145:aload_1         
	// 11324 21146:aload_1         
	// 11325 21147:getfield        #289 <Field int azh.i>
	// 11326 21150:aload_0         
	// 11327 21151:getfield        #12  <Field azh a>
	// 11328 21154:getfield        #181 <Field int azh.ci>
	// 11329 21157:iconst_m1       
	// 11330 21158:ixor            
	// 11331 21159:iand            
	// 11332 21160:putfield        #181 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 11333 21163:aload_0         
	// 11334 21164:getfield        #12  <Field azh a>
	// 11335 21167:astore_1        
		abyte0.ck = ((azh) (abyte0)).G & ~a.a;
	// 11336 21168:aload_1         
	// 11337 21169:aload_1         
	// 11338 21170:getfield        #280 <Field int azh.G>
	// 11339 21173:aload_0         
	// 11340 21174:getfield        #12  <Field azh a>
	// 11341 21177:getfield        #528 <Field int azh.a>
	// 11342 21180:iconst_m1       
	// 11343 21181:ixor            
	// 11344 21182:iand            
	// 11345 21183:putfield        #316 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 11346 21186:aload_0         
	// 11347 21187:getfield        #12  <Field azh a>
	// 11348 21190:astore_1        
		abyte0.ap = ((azh) (abyte0)).G & ~a.ck;
	// 11349 21191:aload_1         
	// 11350 21192:aload_1         
	// 11351 21193:getfield        #280 <Field int azh.G>
	// 11352 21196:aload_0         
	// 11353 21197:getfield        #12  <Field azh a>
	// 11354 21200:getfield        #316 <Field int azh.ck>
	// 11355 21203:iconst_m1       
	// 11356 21204:ixor            
	// 11357 21205:iand            
	// 11358 21206:putfield        #38  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 11359 21209:aload_0         
	// 11360 21210:getfield        #12  <Field azh a>
	// 11361 21213:astore_1        
		abyte0.aI = ((azh) (abyte0)).ap ^ a.aI;
	// 11362 21214:aload_1         
	// 11363 21215:aload_1         
	// 11364 21216:getfield        #38  <Field int azh.ap>
	// 11365 21219:aload_0         
	// 11366 21220:getfield        #12  <Field azh a>
	// 11367 21223:getfield        #313 <Field int azh.aI>
	// 11368 21226:ixor            
	// 11369 21227:putfield        #313 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 11370 21230:aload_0         
	// 11371 21231:getfield        #12  <Field azh a>
	// 11372 21234:astore_1        
		abyte0.aS = ((azh) (abyte0)).q & a.ck;
	// 11373 21235:aload_1         
	// 11374 21236:aload_1         
	// 11375 21237:getfield        #283 <Field int azh.q>
	// 11376 21240:aload_0         
	// 11377 21241:getfield        #12  <Field azh a>
	// 11378 21244:getfield        #316 <Field int azh.ck>
	// 11379 21247:iand            
	// 11380 21248:putfield        #47  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 11381 21251:aload_0         
	// 11382 21252:getfield        #12  <Field azh a>
	// 11383 21255:astore_1        
		abyte0.ck = ((azh) (abyte0)).ck ^ a.q;
	// 11384 21256:aload_1         
	// 11385 21257:aload_1         
	// 11386 21258:getfield        #316 <Field int azh.ck>
	// 11387 21261:aload_0         
	// 11388 21262:getfield        #12  <Field azh a>
	// 11389 21265:getfield        #283 <Field int azh.q>
	// 11390 21268:ixor            
	// 11391 21269:putfield        #316 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 11392 21272:aload_0         
	// 11393 21273:getfield        #12  <Field azh a>
	// 11394 21276:astore_1        
		abyte0.aq = ((azh) (abyte0)).ck & ~a.i;
	// 11395 21277:aload_1         
	// 11396 21278:aload_1         
	// 11397 21279:getfield        #316 <Field int azh.ck>
	// 11398 21282:aload_0         
	// 11399 21283:getfield        #12  <Field azh a>
	// 11400 21286:getfield        #289 <Field int azh.i>
	// 11401 21289:iconst_m1       
	// 11402 21290:ixor            
	// 11403 21291:iand            
	// 11404 21292:putfield        #373 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 11405 21295:aload_0         
	// 11406 21296:getfield        #12  <Field azh a>
	// 11407 21299:astore_1        
		abyte0.aq = ((azh) (abyte0)).y & ~a.aq;
	// 11408 21300:aload_1         
	// 11409 21301:aload_1         
	// 11410 21302:getfield        #517 <Field int azh.y>
	// 11411 21305:aload_0         
	// 11412 21306:getfield        #12  <Field azh a>
	// 11413 21309:getfield        #373 <Field int azh.aq>
	// 11414 21312:iconst_m1       
	// 11415 21313:ixor            
	// 11416 21314:iand            
	// 11417 21315:putfield        #373 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 11418 21318:aload_0         
	// 11419 21319:getfield        #12  <Field azh a>
	// 11420 21322:astore_1        
		abyte0.bW = ((azh) (abyte0)).ck ^ a.bW;
	// 11421 21323:aload_1         
	// 11422 21324:aload_1         
	// 11423 21325:getfield        #316 <Field int azh.ck>
	// 11424 21328:aload_0         
	// 11425 21329:getfield        #12  <Field azh a>
	// 11426 21332:getfield        #154 <Field int azh.bW>
	// 11427 21335:ixor            
	// 11428 21336:putfield        #154 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 11429 21339:aload_0         
	// 11430 21340:getfield        #12  <Field azh a>
	// 11431 21343:astore_1        
		abyte0.ck = ((azh) (abyte0)).ck & ~a.i;
	// 11432 21344:aload_1         
	// 11433 21345:aload_1         
	// 11434 21346:getfield        #316 <Field int azh.ck>
	// 11435 21349:aload_0         
	// 11436 21350:getfield        #12  <Field azh a>
	// 11437 21353:getfield        #289 <Field int azh.i>
	// 11438 21356:iconst_m1       
	// 11439 21357:ixor            
	// 11440 21358:iand            
	// 11441 21359:putfield        #316 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 11442 21362:aload_0         
	// 11443 21363:getfield        #12  <Field azh a>
	// 11444 21366:astore_1        
		abyte0.ck = ((azh) (abyte0)).by ^ a.ck;
	// 11445 21367:aload_1         
	// 11446 21368:aload_1         
	// 11447 21369:getfield        #244 <Field int azh.by>
	// 11448 21372:aload_0         
	// 11449 21373:getfield        #12  <Field azh a>
	// 11450 21376:getfield        #316 <Field int azh.ck>
	// 11451 21379:ixor            
	// 11452 21380:putfield        #316 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 11453 21383:aload_0         
	// 11454 21384:getfield        #12  <Field azh a>
	// 11455 21387:astore_1        
		abyte0.ck = ((azh) (abyte0)).y & a.ck;
	// 11456 21388:aload_1         
	// 11457 21389:aload_1         
	// 11458 21390:getfield        #517 <Field int azh.y>
	// 11459 21393:aload_0         
	// 11460 21394:getfield        #12  <Field azh a>
	// 11461 21397:getfield        #316 <Field int azh.ck>
	// 11462 21400:iand            
	// 11463 21401:putfield        #316 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 11464 21404:aload_0         
	// 11465 21405:getfield        #12  <Field azh a>
	// 11466 21408:astore_1        
		abyte0.af = ((azh) (abyte0)).q & a.a;
	// 11467 21409:aload_1         
	// 11468 21410:aload_1         
	// 11469 21411:getfield        #283 <Field int azh.q>
	// 11470 21414:aload_0         
	// 11471 21415:getfield        #12  <Field azh a>
	// 11472 21418:getfield        #528 <Field int azh.a>
	// 11473 21421:iand            
	// 11474 21422:putfield        #385 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 11475 21425:aload_0         
	// 11476 21426:getfield        #12  <Field azh a>
	// 11477 21429:astore_1        
		abyte0.af = ((azh) (abyte0)).a ^ a.af;
	// 11478 21430:aload_1         
	// 11479 21431:aload_1         
	// 11480 21432:getfield        #528 <Field int azh.a>
	// 11481 21435:aload_0         
	// 11482 21436:getfield        #12  <Field azh a>
	// 11483 21439:getfield        #385 <Field int azh.af>
	// 11484 21442:ixor            
	// 11485 21443:putfield        #385 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 11486 21446:aload_0         
	// 11487 21447:getfield        #12  <Field azh a>
	// 11488 21450:astore_1        
		abyte0.aU = ((azh) (abyte0)).a ^ a.G;
	// 11489 21451:aload_1         
	// 11490 21452:aload_1         
	// 11491 21453:getfield        #528 <Field int azh.a>
	// 11492 21456:aload_0         
	// 11493 21457:getfield        #12  <Field azh a>
	// 11494 21460:getfield        #280 <Field int azh.G>
	// 11495 21463:ixor            
	// 11496 21464:putfield        #334 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 11497 21467:aload_0         
	// 11498 21468:getfield        #12  <Field azh a>
	// 11499 21471:astore_1        
		abyte0.bD = ((azh) (abyte0)).aU ^ a.q;
	// 11500 21472:aload_1         
	// 11501 21473:aload_1         
	// 11502 21474:getfield        #334 <Field int azh.aU>
	// 11503 21477:aload_0         
	// 11504 21478:getfield        #12  <Field azh a>
	// 11505 21481:getfield        #283 <Field int azh.q>
	// 11506 21484:ixor            
	// 11507 21485:putfield        #367 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 11508 21488:aload_0         
	// 11509 21489:getfield        #12  <Field azh a>
	// 11510 21492:astore_1        
		abyte0.bD = ((azh) (abyte0)).bD & a.i;
	// 11511 21493:aload_1         
	// 11512 21494:aload_1         
	// 11513 21495:getfield        #367 <Field int azh.bD>
	// 11514 21498:aload_0         
	// 11515 21499:getfield        #12  <Field azh a>
	// 11516 21502:getfield        #289 <Field int azh.i>
	// 11517 21505:iand            
	// 11518 21506:putfield        #367 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 11519 21509:aload_0         
	// 11520 21510:getfield        #12  <Field azh a>
	// 11521 21513:astore_1        
		abyte0.bD = ((azh) (abyte0)).R ^ a.bD;
	// 11522 21514:aload_1         
	// 11523 21515:aload_1         
	// 11524 21516:getfield        #439 <Field int azh.R>
	// 11525 21519:aload_0         
	// 11526 21520:getfield        #12  <Field azh a>
	// 11527 21523:getfield        #367 <Field int azh.bD>
	// 11528 21526:ixor            
	// 11529 21527:putfield        #367 <Field int azh.bD>
	// 11530 21530:return          
	}

	private final azh a;
}
