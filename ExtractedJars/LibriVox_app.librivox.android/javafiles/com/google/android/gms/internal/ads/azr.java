// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			azk, azh, azj

final class azr
	implements azk
{

	private azr(azh azh1)
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

	azr(azh azh1, azj azj)
	{
		this(azh1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void azr(azh)>
	//    3    5:return          
	}

	public final void a(byte abyte0[], byte abyte1[])
	{
		abyte0 = ((byte []) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field azh a>
	//    2    4:astore_1        
		abyte0.ap = ((azh) (abyte0)).ap & ~a.I;
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:getfield        #26  <Field int azh.ap>
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field azh a>
	//    8   14:getfield        #28  <Field int azh.I>
	//    9   17:iconst_m1       
	//   10   18:ixor            
	//   11   19:iand            
	//   12   20:putfield        #26  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	//   13   23:aload_0         
	//   14   24:getfield        #12  <Field azh a>
	//   15   27:astore_1        
		abyte0.ap = ((azh) (abyte0)).bJ ^ a.ap;
	//   16   28:aload_1         
	//   17   29:aload_1         
	//   18   30:getfield        #31  <Field int azh.bJ>
	//   19   33:aload_0         
	//   20   34:getfield        #12  <Field azh a>
	//   21   37:getfield        #26  <Field int azh.ap>
	//   22   40:ixor            
	//   23   41:putfield        #26  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	//   24   44:aload_0         
	//   25   45:getfield        #12  <Field azh a>
	//   26   48:astore_1        
		abyte0.ap = ((azh) (abyte0)).bb | a.ap;
	//   27   49:aload_1         
	//   28   50:aload_1         
	//   29   51:getfield        #34  <Field int azh.bb>
	//   30   54:aload_0         
	//   31   55:getfield        #12  <Field azh a>
	//   32   58:getfield        #26  <Field int azh.ap>
	//   33   61:ior             
	//   34   62:putfield        #26  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	//   35   65:aload_0         
	//   36   66:getfield        #12  <Field azh a>
	//   37   69:astore_1        
		abyte0.ap = ((azh) (abyte0)).ar ^ a.ap;
	//   38   70:aload_1         
	//   39   71:aload_1         
	//   40   72:getfield        #37  <Field int azh.ar>
	//   41   75:aload_0         
	//   42   76:getfield        #12  <Field azh a>
	//   43   79:getfield        #26  <Field int azh.ap>
	//   44   82:ixor            
	//   45   83:putfield        #26  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	//   46   86:aload_0         
	//   47   87:getfield        #12  <Field azh a>
	//   48   90:astore_1        
		abyte0.am = ((azh) (abyte0)).ap ^ a.am;
	//   49   91:aload_1         
	//   50   92:aload_1         
	//   51   93:getfield        #26  <Field int azh.ap>
	//   52   96:aload_0         
	//   53   97:getfield        #12  <Field azh a>
	//   54  100:getfield        #40  <Field int azh.am>
	//   55  103:ixor            
	//   56  104:putfield        #40  <Field int azh.am>
		abyte0 = ((byte []) (a));
	//   57  107:aload_0         
	//   58  108:getfield        #12  <Field azh a>
	//   59  111:astore_1        
		abyte0.T = ((azh) (abyte0)).am ^ a.T;
	//   60  112:aload_1         
	//   61  113:aload_1         
	//   62  114:getfield        #40  <Field int azh.am>
	//   63  117:aload_0         
	//   64  118:getfield        #12  <Field azh a>
	//   65  121:getfield        #43  <Field int azh.T>
	//   66  124:ixor            
	//   67  125:putfield        #43  <Field int azh.T>
		abyte0 = ((byte []) (a));
	//   68  128:aload_0         
	//   69  129:getfield        #12  <Field azh a>
	//   70  132:astore_1        
		abyte0.bk = ((azh) (abyte0)).c | a.bk;
	//   71  133:aload_1         
	//   72  134:aload_1         
	//   73  135:getfield        #46  <Field int azh.c>
	//   74  138:aload_0         
	//   75  139:getfield        #12  <Field azh a>
	//   76  142:getfield        #49  <Field int azh.bk>
	//   77  145:ior             
	//   78  146:putfield        #49  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	//   79  149:aload_0         
	//   80  150:getfield        #12  <Field azh a>
	//   81  153:astore_1        
		abyte0.bk = ((azh) (abyte0)).aQ ^ a.bk;
	//   82  154:aload_1         
	//   83  155:aload_1         
	//   84  156:getfield        #52  <Field int azh.aQ>
	//   85  159:aload_0         
	//   86  160:getfield        #12  <Field azh a>
	//   87  163:getfield        #49  <Field int azh.bk>
	//   88  166:ixor            
	//   89  167:putfield        #49  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	//   90  170:aload_0         
	//   91  171:getfield        #12  <Field azh a>
	//   92  174:astore_1        
		abyte0.bk = ((azh) (abyte0)).bk | a.I;
	//   93  175:aload_1         
	//   94  176:aload_1         
	//   95  177:getfield        #49  <Field int azh.bk>
	//   96  180:aload_0         
	//   97  181:getfield        #12  <Field azh a>
	//   98  184:getfield        #28  <Field int azh.I>
	//   99  187:ior             
	//  100  188:putfield        #49  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	//  101  191:aload_0         
	//  102  192:getfield        #12  <Field azh a>
	//  103  195:astore_1        
		abyte0.bk = ((azh) (abyte0)).bW ^ a.bk;
	//  104  196:aload_1         
	//  105  197:aload_1         
	//  106  198:getfield        #55  <Field int azh.bW>
	//  107  201:aload_0         
	//  108  202:getfield        #12  <Field azh a>
	//  109  205:getfield        #49  <Field int azh.bk>
	//  110  208:ixor            
	//  111  209:putfield        #49  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	//  112  212:aload_0         
	//  113  213:getfield        #12  <Field azh a>
	//  114  216:astore_1        
		abyte0.aS = ((azh) (abyte0)).bk ^ a.aS;
	//  115  217:aload_1         
	//  116  218:aload_1         
	//  117  219:getfield        #49  <Field int azh.bk>
	//  118  222:aload_0         
	//  119  223:getfield        #12  <Field azh a>
	//  120  226:getfield        #58  <Field int azh.aS>
	//  121  229:ixor            
	//  122  230:putfield        #58  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	//  123  233:aload_0         
	//  124  234:getfield        #12  <Field azh a>
	//  125  237:astore_1        
		abyte0.aS = ((azh) (abyte0)).k & a.aS;
	//  126  238:aload_1         
	//  127  239:aload_1         
	//  128  240:getfield        #61  <Field int azh.k>
	//  129  243:aload_0         
	//  130  244:getfield        #12  <Field azh a>
	//  131  247:getfield        #58  <Field int azh.aS>
	//  132  250:iand            
	//  133  251:putfield        #58  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	//  134  254:aload_0         
	//  135  255:getfield        #12  <Field azh a>
	//  136  258:astore_1        
		abyte0.aS = ((azh) (abyte0)).bL ^ a.aS;
	//  137  259:aload_1         
	//  138  260:aload_1         
	//  139  261:getfield        #64  <Field int azh.bL>
	//  140  264:aload_0         
	//  141  265:getfield        #12  <Field azh a>
	//  142  268:getfield        #58  <Field int azh.aS>
	//  143  271:ixor            
	//  144  272:putfield        #58  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	//  145  275:aload_0         
	//  146  276:getfield        #12  <Field azh a>
	//  147  279:astore_1        
		abyte0.R = ((azh) (abyte0)).aS ^ a.R;
	//  148  280:aload_1         
	//  149  281:aload_1         
	//  150  282:getfield        #58  <Field int azh.aS>
	//  151  285:aload_0         
	//  152  286:getfield        #12  <Field azh a>
	//  153  289:getfield        #67  <Field int azh.R>
	//  154  292:ixor            
	//  155  293:putfield        #67  <Field int azh.R>
		abyte0 = ((byte []) (a));
	//  156  296:aload_0         
	//  157  297:getfield        #12  <Field azh a>
	//  158  300:astore_1        
		abyte0.aA = ((azh) (abyte0)).bm ^ a.aA;
	//  159  301:aload_1         
	//  160  302:aload_1         
	//  161  303:getfield        #70  <Field int azh.bm>
	//  162  306:aload_0         
	//  163  307:getfield        #12  <Field azh a>
	//  164  310:getfield        #73  <Field int azh.aA>
	//  165  313:ixor            
	//  166  314:putfield        #73  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	//  167  317:aload_0         
	//  168  318:getfield        #12  <Field azh a>
	//  169  321:astore_1        
		abyte0.E = ((azh) (abyte0)).aA ^ a.E;
	//  170  322:aload_1         
	//  171  323:aload_1         
	//  172  324:getfield        #73  <Field int azh.aA>
	//  173  327:aload_0         
	//  174  328:getfield        #12  <Field azh a>
	//  175  331:getfield        #76  <Field int azh.E>
	//  176  334:ixor            
	//  177  335:putfield        #76  <Field int azh.E>
		abyte0 = ((byte []) (a));
	//  178  338:aload_0         
	//  179  339:getfield        #12  <Field azh a>
	//  180  342:astore_1        
		abyte0.aA = ((azh) (abyte0)).E & a.a;
	//  181  343:aload_1         
	//  182  344:aload_1         
	//  183  345:getfield        #76  <Field int azh.E>
	//  184  348:aload_0         
	//  185  349:getfield        #12  <Field azh a>
	//  186  352:getfield        #78  <Field int azh.a>
	//  187  355:iand            
	//  188  356:putfield        #73  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	//  189  359:aload_0         
	//  190  360:getfield        #12  <Field azh a>
	//  191  363:astore_1        
		abyte0.bm = ((azh) (abyte0)).ak & ~a.aA;
	//  192  364:aload_1         
	//  193  365:aload_1         
	//  194  366:getfield        #81  <Field int azh.ak>
	//  195  369:aload_0         
	//  196  370:getfield        #12  <Field azh a>
	//  197  373:getfield        #73  <Field int azh.aA>
	//  198  376:iconst_m1       
	//  199  377:ixor            
	//  200  378:iand            
	//  201  379:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	//  202  382:aload_0         
	//  203  383:getfield        #12  <Field azh a>
	//  204  386:astore_1        
		abyte0.aS = ((azh) (abyte0)).ak & a.aA;
	//  205  387:aload_1         
	//  206  388:aload_1         
	//  207  389:getfield        #81  <Field int azh.ak>
	//  208  392:aload_0         
	//  209  393:getfield        #12  <Field azh a>
	//  210  396:getfield        #73  <Field int azh.aA>
	//  211  399:iand            
	//  212  400:putfield        #58  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	//  213  403:aload_0         
	//  214  404:getfield        #12  <Field azh a>
	//  215  407:astore_1        
		abyte0.bL = ((azh) (abyte0)).ak & a.aA;
	//  216  408:aload_1         
	//  217  409:aload_1         
	//  218  410:getfield        #81  <Field int azh.ak>
	//  219  413:aload_0         
	//  220  414:getfield        #12  <Field azh a>
	//  221  417:getfield        #73  <Field int azh.aA>
	//  222  420:iand            
	//  223  421:putfield        #64  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	//  224  424:aload_0         
	//  225  425:getfield        #12  <Field azh a>
	//  226  428:astore_1        
		abyte0.bL = ((azh) (abyte0)).ac & ~a.bL;
	//  227  429:aload_1         
	//  228  430:aload_1         
	//  229  431:getfield        #84  <Field int azh.ac>
	//  230  434:aload_0         
	//  231  435:getfield        #12  <Field azh a>
	//  232  438:getfield        #64  <Field int azh.bL>
	//  233  441:iconst_m1       
	//  234  442:ixor            
	//  235  443:iand            
	//  236  444:putfield        #64  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	//  237  447:aload_0         
	//  238  448:getfield        #12  <Field azh a>
	//  239  451:astore_1        
		abyte0.bk = ((azh) (abyte0)).ac & a.aA;
	//  240  452:aload_1         
	//  241  453:aload_1         
	//  242  454:getfield        #84  <Field int azh.ac>
	//  243  457:aload_0         
	//  244  458:getfield        #12  <Field azh a>
	//  245  461:getfield        #73  <Field int azh.aA>
	//  246  464:iand            
	//  247  465:putfield        #49  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	//  248  468:aload_0         
	//  249  469:getfield        #12  <Field azh a>
	//  250  472:astore_1        
		abyte0.bW = ((azh) (abyte0)).a & ~a.aA;
	//  251  473:aload_1         
	//  252  474:aload_1         
	//  253  475:getfield        #78  <Field int azh.a>
	//  254  478:aload_0         
	//  255  479:getfield        #12  <Field azh a>
	//  256  482:getfield        #73  <Field int azh.aA>
	//  257  485:iconst_m1       
	//  258  486:ixor            
	//  259  487:iand            
	//  260  488:putfield        #55  <Field int azh.bW>
		abyte0 = ((byte []) (a));
	//  261  491:aload_0         
	//  262  492:getfield        #12  <Field azh a>
	//  263  495:astore_1        
		abyte0.aQ = ((azh) (abyte0)).ak & ~a.bW;
	//  264  496:aload_1         
	//  265  497:aload_1         
	//  266  498:getfield        #81  <Field int azh.ak>
	//  267  501:aload_0         
	//  268  502:getfield        #12  <Field azh a>
	//  269  505:getfield        #55  <Field int azh.bW>
	//  270  508:iconst_m1       
	//  271  509:ixor            
	//  272  510:iand            
	//  273  511:putfield        #52  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	//  274  514:aload_0         
	//  275  515:getfield        #12  <Field azh a>
	//  276  518:astore_1        
		abyte0.am = ((azh) (abyte0)).ak & ~a.bW;
	//  277  519:aload_1         
	//  278  520:aload_1         
	//  279  521:getfield        #81  <Field int azh.ak>
	//  280  524:aload_0         
	//  281  525:getfield        #12  <Field azh a>
	//  282  528:getfield        #55  <Field int azh.bW>
	//  283  531:iconst_m1       
	//  284  532:ixor            
	//  285  533:iand            
	//  286  534:putfield        #40  <Field int azh.am>
		abyte0 = ((byte []) (a));
	//  287  537:aload_0         
	//  288  538:getfield        #12  <Field azh a>
	//  289  541:astore_1        
		abyte0.am = ((azh) (abyte0)).E ^ a.am;
	//  290  542:aload_1         
	//  291  543:aload_1         
	//  292  544:getfield        #76  <Field int azh.E>
	//  293  547:aload_0         
	//  294  548:getfield        #12  <Field azh a>
	//  295  551:getfield        #40  <Field int azh.am>
	//  296  554:ixor            
	//  297  555:putfield        #40  <Field int azh.am>
		abyte0 = ((byte []) (a));
	//  298  558:aload_0         
	//  299  559:getfield        #12  <Field azh a>
	//  300  562:astore_1        
		abyte0.ap = ((azh) (abyte0)).ak & ~a.bW;
	//  301  563:aload_1         
	//  302  564:aload_1         
	//  303  565:getfield        #81  <Field int azh.ak>
	//  304  568:aload_0         
	//  305  569:getfield        #12  <Field azh a>
	//  306  572:getfield        #55  <Field int azh.bW>
	//  307  575:iconst_m1       
	//  308  576:ixor            
	//  309  577:iand            
	//  310  578:putfield        #26  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	//  311  581:aload_0         
	//  312  582:getfield        #12  <Field azh a>
	//  313  585:astore_1        
		abyte0.ap = ((azh) (abyte0)).aA ^ a.ap;
	//  314  586:aload_1         
	//  315  587:aload_1         
	//  316  588:getfield        #73  <Field int azh.aA>
	//  317  591:aload_0         
	//  318  592:getfield        #12  <Field azh a>
	//  319  595:getfield        #26  <Field int azh.ap>
	//  320  598:ixor            
	//  321  599:putfield        #26  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	//  322  602:aload_0         
	//  323  603:getfield        #12  <Field azh a>
	//  324  606:astore_1        
		abyte0.ap = ((azh) (abyte0)).ap | a.ac;
	//  325  607:aload_1         
	//  326  608:aload_1         
	//  327  609:getfield        #26  <Field int azh.ap>
	//  328  612:aload_0         
	//  329  613:getfield        #12  <Field azh a>
	//  330  616:getfield        #84  <Field int azh.ac>
	//  331  619:ior             
	//  332  620:putfield        #26  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	//  333  623:aload_0         
	//  334  624:getfield        #12  <Field azh a>
	//  335  627:astore_1        
		abyte0.bW = ((azh) (abyte0)).ak & ~a.bW;
	//  336  628:aload_1         
	//  337  629:aload_1         
	//  338  630:getfield        #81  <Field int azh.ak>
	//  339  633:aload_0         
	//  340  634:getfield        #12  <Field azh a>
	//  341  637:getfield        #55  <Field int azh.bW>
	//  342  640:iconst_m1       
	//  343  641:ixor            
	//  344  642:iand            
	//  345  643:putfield        #55  <Field int azh.bW>
		abyte0 = ((byte []) (a));
	//  346  646:aload_0         
	//  347  647:getfield        #12  <Field azh a>
	//  348  650:astore_1        
		abyte0.ar = ((azh) (abyte0)).E | a.ce;
	//  349  651:aload_1         
	//  350  652:aload_1         
	//  351  653:getfield        #76  <Field int azh.E>
	//  352  656:aload_0         
	//  353  657:getfield        #12  <Field azh a>
	//  354  660:getfield        #87  <Field int azh.ce>
	//  355  663:ior             
	//  356  664:putfield        #37  <Field int azh.ar>
		abyte0 = ((byte []) (a));
	//  357  667:aload_0         
	//  358  668:getfield        #12  <Field azh a>
	//  359  671:astore_1        
		abyte0.ar = ((azh) (abyte0)).ch ^ a.ar;
	//  360  672:aload_1         
	//  361  673:aload_1         
	//  362  674:getfield        #90  <Field int azh.ch>
	//  363  677:aload_0         
	//  364  678:getfield        #12  <Field azh a>
	//  365  681:getfield        #37  <Field int azh.ar>
	//  366  684:ixor            
	//  367  685:putfield        #37  <Field int azh.ar>
		abyte0 = ((byte []) (a));
	//  368  688:aload_0         
	//  369  689:getfield        #12  <Field azh a>
	//  370  692:astore_1        
		abyte0.ar = ((azh) (abyte0)).ar ^ a.M;
	//  371  693:aload_1         
	//  372  694:aload_1         
	//  373  695:getfield        #37  <Field int azh.ar>
	//  374  698:aload_0         
	//  375  699:getfield        #12  <Field azh a>
	//  376  702:getfield        #93  <Field int azh.M>
	//  377  705:ixor            
	//  378  706:putfield        #37  <Field int azh.ar>
		abyte0 = ((byte []) (a));
	//  379  709:aload_0         
	//  380  710:getfield        #12  <Field azh a>
	//  381  713:astore_1        
		abyte0.bJ = ((azh) (abyte0)).be & ~a.E;
	//  382  714:aload_1         
	//  383  715:aload_1         
	//  384  716:getfield        #96  <Field int azh.be>
	//  385  719:aload_0         
	//  386  720:getfield        #12  <Field azh a>
	//  387  723:getfield        #76  <Field int azh.E>
	//  388  726:iconst_m1       
	//  389  727:ixor            
	//  390  728:iand            
	//  391  729:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	//  392  732:aload_0         
	//  393  733:getfield        #12  <Field azh a>
	//  394  736:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bJ & a.M;
	//  395  737:aload_1         
	//  396  738:aload_1         
	//  397  739:getfield        #31  <Field int azh.bJ>
	//  398  742:aload_0         
	//  399  743:getfield        #12  <Field azh a>
	//  400  746:getfield        #93  <Field int azh.M>
	//  401  749:iand            
	//  402  750:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	//  403  753:aload_0         
	//  404  754:getfield        #12  <Field azh a>
	//  405  757:astore_1        
		abyte0.bJ = ((azh) (abyte0)).ch ^ a.bJ;
	//  406  758:aload_1         
	//  407  759:aload_1         
	//  408  760:getfield        #90  <Field int azh.ch>
	//  409  763:aload_0         
	//  410  764:getfield        #12  <Field azh a>
	//  411  767:getfield        #31  <Field int azh.bJ>
	//  412  770:ixor            
	//  413  771:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	//  414  774:aload_0         
	//  415  775:getfield        #12  <Field azh a>
	//  416  778:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bJ & ~a.g;
	//  417  779:aload_1         
	//  418  780:aload_1         
	//  419  781:getfield        #31  <Field int azh.bJ>
	//  420  784:aload_0         
	//  421  785:getfield        #12  <Field azh a>
	//  422  788:getfield        #99  <Field int azh.g>
	//  423  791:iconst_m1       
	//  424  792:ixor            
	//  425  793:iand            
	//  426  794:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	//  427  797:aload_0         
	//  428  798:getfield        #12  <Field azh a>
	//  429  801:astore_1        
		abyte0.bJ = ((azh) (abyte0)).ar ^ a.bJ;
	//  430  802:aload_1         
	//  431  803:aload_1         
	//  432  804:getfield        #37  <Field int azh.ar>
	//  433  807:aload_0         
	//  434  808:getfield        #12  <Field azh a>
	//  435  811:getfield        #31  <Field int azh.bJ>
	//  436  814:ixor            
	//  437  815:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	//  438  818:aload_0         
	//  439  819:getfield        #12  <Field azh a>
	//  440  822:astore_1        
		abyte0.ar = ((azh) (abyte0)).ce & ~a.E;
	//  441  823:aload_1         
	//  442  824:aload_1         
	//  443  825:getfield        #87  <Field int azh.ce>
	//  444  828:aload_0         
	//  445  829:getfield        #12  <Field azh a>
	//  446  832:getfield        #76  <Field int azh.E>
	//  447  835:iconst_m1       
	//  448  836:ixor            
	//  449  837:iand            
	//  450  838:putfield        #37  <Field int azh.ar>
		abyte0 = ((byte []) (a));
	//  451  841:aload_0         
	//  452  842:getfield        #12  <Field azh a>
	//  453  845:astore_1        
		abyte0.ar = ((azh) (abyte0)).ah ^ a.ar;
	//  454  846:aload_1         
	//  455  847:aload_1         
	//  456  848:getfield        #102 <Field int azh.ah>
	//  457  851:aload_0         
	//  458  852:getfield        #12  <Field azh a>
	//  459  855:getfield        #37  <Field int azh.ar>
	//  460  858:ixor            
	//  461  859:putfield        #37  <Field int azh.ar>
		abyte0 = ((byte []) (a));
	//  462  862:aload_0         
	//  463  863:getfield        #12  <Field azh a>
	//  464  866:astore_1        
		abyte0.ar = ((azh) (abyte0)).ar & a.M;
	//  465  867:aload_1         
	//  466  868:aload_1         
	//  467  869:getfield        #37  <Field int azh.ar>
	//  468  872:aload_0         
	//  469  873:getfield        #12  <Field azh a>
	//  470  876:getfield        #93  <Field int azh.M>
	//  471  879:iand            
	//  472  880:putfield        #37  <Field int azh.ar>
		abyte0 = ((byte []) (a));
	//  473  883:aload_0         
	//  474  884:getfield        #12  <Field azh a>
	//  475  887:astore_1        
		abyte0.aT = ((azh) (abyte0)).E | a.a;
	//  476  888:aload_1         
	//  477  889:aload_1         
	//  478  890:getfield        #76  <Field int azh.E>
	//  479  893:aload_0         
	//  480  894:getfield        #12  <Field azh a>
	//  481  897:getfield        #78  <Field int azh.a>
	//  482  900:ior             
	//  483  901:putfield        #105 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	//  484  904:aload_0         
	//  485  905:getfield        #12  <Field azh a>
	//  486  908:astore_1        
		abyte0.aJ = ((azh) (abyte0)).ak & ~a.aT;
	//  487  909:aload_1         
	//  488  910:aload_1         
	//  489  911:getfield        #81  <Field int azh.ak>
	//  490  914:aload_0         
	//  491  915:getfield        #12  <Field azh a>
	//  492  918:getfield        #105 <Field int azh.aT>
	//  493  921:iconst_m1       
	//  494  922:ixor            
	//  495  923:iand            
	//  496  924:putfield        #108 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	//  497  927:aload_0         
	//  498  928:getfield        #12  <Field azh a>
	//  499  931:astore_1        
		abyte0.aJ = ((azh) (abyte0)).aT ^ a.aJ;
	//  500  932:aload_1         
	//  501  933:aload_1         
	//  502  934:getfield        #105 <Field int azh.aT>
	//  503  937:aload_0         
	//  504  938:getfield        #12  <Field azh a>
	//  505  941:getfield        #108 <Field int azh.aJ>
	//  506  944:ixor            
	//  507  945:putfield        #108 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	//  508  948:aload_0         
	//  509  949:getfield        #12  <Field azh a>
	//  510  952:astore_1        
		abyte0.aJ = ((azh) (abyte0)).ac & ~a.aJ;
	//  511  953:aload_1         
	//  512  954:aload_1         
	//  513  955:getfield        #84  <Field int azh.ac>
	//  514  958:aload_0         
	//  515  959:getfield        #12  <Field azh a>
	//  516  962:getfield        #108 <Field int azh.aJ>
	//  517  965:iconst_m1       
	//  518  966:ixor            
	//  519  967:iand            
	//  520  968:putfield        #108 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	//  521  971:aload_0         
	//  522  972:getfield        #12  <Field azh a>
	//  523  975:astore_1        
		abyte0.bh = ((azh) (abyte0)).ak & a.aT;
	//  524  976:aload_1         
	//  525  977:aload_1         
	//  526  978:getfield        #81  <Field int azh.ak>
	//  527  981:aload_0         
	//  528  982:getfield        #12  <Field azh a>
	//  529  985:getfield        #105 <Field int azh.aT>
	//  530  988:iand            
	//  531  989:putfield        #111 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	//  532  992:aload_0         
	//  533  993:getfield        #12  <Field azh a>
	//  534  996:astore_1        
		abyte0.bh = ((azh) (abyte0)).E ^ a.bh;
	//  535  997:aload_1         
	//  536  998:aload_1         
	//  537  999:getfield        #76  <Field int azh.E>
	//  538 1002:aload_0         
	//  539 1003:getfield        #12  <Field azh a>
	//  540 1006:getfield        #111 <Field int azh.bh>
	//  541 1009:ixor            
	//  542 1010:putfield        #111 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	//  543 1013:aload_0         
	//  544 1014:getfield        #12  <Field azh a>
	//  545 1017:astore_1        
		abyte0.bk = ((azh) (abyte0)).bh ^ a.bk;
	//  546 1018:aload_1         
	//  547 1019:aload_1         
	//  548 1020:getfield        #111 <Field int azh.bh>
	//  549 1023:aload_0         
	//  550 1024:getfield        #12  <Field azh a>
	//  551 1027:getfield        #49  <Field int azh.bk>
	//  552 1030:ixor            
	//  553 1031:putfield        #49  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	//  554 1034:aload_0         
	//  555 1035:getfield        #12  <Field azh a>
	//  556 1038:astore_1        
		abyte0.bk = ((azh) (abyte0)).M | a.bk;
	//  557 1039:aload_1         
	//  558 1040:aload_1         
	//  559 1041:getfield        #93  <Field int azh.M>
	//  560 1044:aload_0         
	//  561 1045:getfield        #12  <Field azh a>
	//  562 1048:getfield        #49  <Field int azh.bk>
	//  563 1051:ior             
	//  564 1052:putfield        #49  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	//  565 1055:aload_0         
	//  566 1056:getfield        #12  <Field azh a>
	//  567 1059:astore_1        
		abyte0.bh = ((azh) (abyte0)).ac & a.bh;
	//  568 1060:aload_1         
	//  569 1061:aload_1         
	//  570 1062:getfield        #84  <Field int azh.ac>
	//  571 1065:aload_0         
	//  572 1066:getfield        #12  <Field azh a>
	//  573 1069:getfield        #111 <Field int azh.bh>
	//  574 1072:iand            
	//  575 1073:putfield        #111 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	//  576 1076:aload_0         
	//  577 1077:getfield        #12  <Field azh a>
	//  578 1080:astore_1        
		abyte0.cg = ((azh) (abyte0)).aT | a.ac;
	//  579 1081:aload_1         
	//  580 1082:aload_1         
	//  581 1083:getfield        #105 <Field int azh.aT>
	//  582 1086:aload_0         
	//  583 1087:getfield        #12  <Field azh a>
	//  584 1090:getfield        #84  <Field int azh.ac>
	//  585 1093:ior             
	//  586 1094:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	//  587 1097:aload_0         
	//  588 1098:getfield        #12  <Field azh a>
	//  589 1101:astore_1        
		abyte0.bm = ((azh) (abyte0)).aT ^ a.bm;
	//  590 1102:aload_1         
	//  591 1103:aload_1         
	//  592 1104:getfield        #105 <Field int azh.aT>
	//  593 1107:aload_0         
	//  594 1108:getfield        #12  <Field azh a>
	//  595 1111:getfield        #70  <Field int azh.bm>
	//  596 1114:ixor            
	//  597 1115:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	//  598 1118:aload_0         
	//  599 1119:getfield        #12  <Field azh a>
	//  600 1122:astore_1        
		abyte0.aT = ((azh) (abyte0)).bm ^ a.ac;
	//  601 1123:aload_1         
	//  602 1124:aload_1         
	//  603 1125:getfield        #70  <Field int azh.bm>
	//  604 1128:aload_0         
	//  605 1129:getfield        #12  <Field azh a>
	//  606 1132:getfield        #84  <Field int azh.ac>
	//  607 1135:ixor            
	//  608 1136:putfield        #105 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	//  609 1139:aload_0         
	//  610 1140:getfield        #12  <Field azh a>
	//  611 1143:astore_1        
		abyte0.s = ((azh) (abyte0)).E & ~a.a;
	//  612 1144:aload_1         
	//  613 1145:aload_1         
	//  614 1146:getfield        #76  <Field int azh.E>
	//  615 1149:aload_0         
	//  616 1150:getfield        #12  <Field azh a>
	//  617 1153:getfield        #78  <Field int azh.a>
	//  618 1156:iconst_m1       
	//  619 1157:ixor            
	//  620 1158:iand            
	//  621 1159:putfield        #117 <Field int azh.s>
		abyte0 = ((byte []) (a));
	//  622 1162:aload_0         
	//  623 1163:getfield        #12  <Field azh a>
	//  624 1166:astore_1        
		abyte0.bW = ((azh) (abyte0)).s ^ a.bW;
	//  625 1167:aload_1         
	//  626 1168:aload_1         
	//  627 1169:getfield        #117 <Field int azh.s>
	//  628 1172:aload_0         
	//  629 1173:getfield        #12  <Field azh a>
	//  630 1176:getfield        #55  <Field int azh.bW>
	//  631 1179:ixor            
	//  632 1180:putfield        #55  <Field int azh.bW>
		abyte0 = ((byte []) (a));
	//  633 1183:aload_0         
	//  634 1184:getfield        #12  <Field azh a>
	//  635 1187:astore_1        
		abyte0.bW = ((azh) (abyte0)).bW & ~a.ac;
	//  636 1188:aload_1         
	//  637 1189:aload_1         
	//  638 1190:getfield        #55  <Field int azh.bW>
	//  639 1193:aload_0         
	//  640 1194:getfield        #12  <Field azh a>
	//  641 1197:getfield        #84  <Field int azh.ac>
	//  642 1200:iconst_m1       
	//  643 1201:ixor            
	//  644 1202:iand            
	//  645 1203:putfield        #55  <Field int azh.bW>
		abyte0 = ((byte []) (a));
	//  646 1206:aload_0         
	//  647 1207:getfield        #12  <Field azh a>
	//  648 1210:astore_1        
		abyte0.bW = ((azh) (abyte0)).bX ^ a.bW;
	//  649 1211:aload_1         
	//  650 1212:aload_1         
	//  651 1213:getfield        #120 <Field int azh.bX>
	//  652 1216:aload_0         
	//  653 1217:getfield        #12  <Field azh a>
	//  654 1220:getfield        #55  <Field int azh.bW>
	//  655 1223:ixor            
	//  656 1224:putfield        #55  <Field int azh.bW>
		abyte0 = ((byte []) (a));
	//  657 1227:aload_0         
	//  658 1228:getfield        #12  <Field azh a>
	//  659 1231:astore_1        
		abyte0.bA = ((azh) (abyte0)).s ^ a.ak;
	//  660 1232:aload_1         
	//  661 1233:aload_1         
	//  662 1234:getfield        #117 <Field int azh.s>
	//  663 1237:aload_0         
	//  664 1238:getfield        #12  <Field azh a>
	//  665 1241:getfield        #81  <Field int azh.ak>
	//  666 1244:ixor            
	//  667 1245:putfield        #123 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	//  668 1248:aload_0         
	//  669 1249:getfield        #12  <Field azh a>
	//  670 1252:astore_1        
		abyte0.bh = ((azh) (abyte0)).bA ^ a.bh;
	//  671 1253:aload_1         
	//  672 1254:aload_1         
	//  673 1255:getfield        #123 <Field int azh.bA>
	//  674 1258:aload_0         
	//  675 1259:getfield        #12  <Field azh a>
	//  676 1262:getfield        #111 <Field int azh.bh>
	//  677 1265:ixor            
	//  678 1266:putfield        #111 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	//  679 1269:aload_0         
	//  680 1270:getfield        #12  <Field azh a>
	//  681 1273:astore_1        
		abyte0.bA = ((azh) (abyte0)).s & ~a.ac;
	//  682 1274:aload_1         
	//  683 1275:aload_1         
	//  684 1276:getfield        #117 <Field int azh.s>
	//  685 1279:aload_0         
	//  686 1280:getfield        #12  <Field azh a>
	//  687 1283:getfield        #84  <Field int azh.ac>
	//  688 1286:iconst_m1       
	//  689 1287:ixor            
	//  690 1288:iand            
	//  691 1289:putfield        #123 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	//  692 1292:aload_0         
	//  693 1293:getfield        #12  <Field azh a>
	//  694 1296:astore_1        
		abyte0.bA = ((azh) (abyte0)).bm ^ a.bA;
	//  695 1297:aload_1         
	//  696 1298:aload_1         
	//  697 1299:getfield        #70  <Field int azh.bm>
	//  698 1302:aload_0         
	//  699 1303:getfield        #12  <Field azh a>
	//  700 1306:getfield        #123 <Field int azh.bA>
	//  701 1309:ixor            
	//  702 1310:putfield        #123 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	//  703 1313:aload_0         
	//  704 1314:getfield        #12  <Field azh a>
	//  705 1317:astore_1        
		abyte0.bA = ((azh) (abyte0)).M | a.bA;
	//  706 1318:aload_1         
	//  707 1319:aload_1         
	//  708 1320:getfield        #93  <Field int azh.M>
	//  709 1323:aload_0         
	//  710 1324:getfield        #12  <Field azh a>
	//  711 1327:getfield        #123 <Field int azh.bA>
	//  712 1330:ior             
	//  713 1331:putfield        #123 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	//  714 1334:aload_0         
	//  715 1335:getfield        #12  <Field azh a>
	//  716 1338:astore_1        
		abyte0.aS = ((azh) (abyte0)).s ^ a.aS;
	//  717 1339:aload_1         
	//  718 1340:aload_1         
	//  719 1341:getfield        #117 <Field int azh.s>
	//  720 1344:aload_0         
	//  721 1345:getfield        #12  <Field azh a>
	//  722 1348:getfield        #58  <Field int azh.aS>
	//  723 1351:ixor            
	//  724 1352:putfield        #58  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	//  725 1355:aload_0         
	//  726 1356:getfield        #12  <Field azh a>
	//  727 1359:astore_1        
		abyte0.bm = ((azh) (abyte0)).ak & a.s;
	//  728 1360:aload_1         
	//  729 1361:aload_1         
	//  730 1362:getfield        #81  <Field int azh.ak>
	//  731 1365:aload_0         
	//  732 1366:getfield        #12  <Field azh a>
	//  733 1369:getfield        #117 <Field int azh.s>
	//  734 1372:iand            
	//  735 1373:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	//  736 1376:aload_0         
	//  737 1377:getfield        #12  <Field azh a>
	//  738 1380:astore_1        
		abyte0.bm = ((azh) (abyte0)).aA ^ a.bm;
	//  739 1381:aload_1         
	//  740 1382:aload_1         
	//  741 1383:getfield        #73  <Field int azh.aA>
	//  742 1386:aload_0         
	//  743 1387:getfield        #12  <Field azh a>
	//  744 1390:getfield        #70  <Field int azh.bm>
	//  745 1393:ixor            
	//  746 1394:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	//  747 1397:aload_0         
	//  748 1398:getfield        #12  <Field azh a>
	//  749 1401:astore_1        
		abyte0.bm = ((azh) (abyte0)).ac & ~a.bm;
	//  750 1402:aload_1         
	//  751 1403:aload_1         
	//  752 1404:getfield        #84  <Field int azh.ac>
	//  753 1407:aload_0         
	//  754 1408:getfield        #12  <Field azh a>
	//  755 1411:getfield        #70  <Field int azh.bm>
	//  756 1414:iconst_m1       
	//  757 1415:ixor            
	//  758 1416:iand            
	//  759 1417:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	//  760 1420:aload_0         
	//  761 1421:getfield        #12  <Field azh a>
	//  762 1424:astore_1        
		abyte0.bm = ((azh) (abyte0)).aS ^ a.bm;
	//  763 1425:aload_1         
	//  764 1426:aload_1         
	//  765 1427:getfield        #58  <Field int azh.aS>
	//  766 1430:aload_0         
	//  767 1431:getfield        #12  <Field azh a>
	//  768 1434:getfield        #70  <Field int azh.bm>
	//  769 1437:ixor            
	//  770 1438:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	//  771 1441:aload_0         
	//  772 1442:getfield        #12  <Field azh a>
	//  773 1445:astore_1        
		abyte0.bm = ((azh) (abyte0)).bm & ~a.M;
	//  774 1446:aload_1         
	//  775 1447:aload_1         
	//  776 1448:getfield        #70  <Field int azh.bm>
	//  777 1451:aload_0         
	//  778 1452:getfield        #12  <Field azh a>
	//  779 1455:getfield        #93  <Field int azh.M>
	//  780 1458:iconst_m1       
	//  781 1459:ixor            
	//  782 1460:iand            
	//  783 1461:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	//  784 1464:aload_0         
	//  785 1465:getfield        #12  <Field azh a>
	//  786 1468:astore_1        
		abyte0.bm = ((azh) (abyte0)).aT ^ a.bm;
	//  787 1469:aload_1         
	//  788 1470:aload_1         
	//  789 1471:getfield        #105 <Field int azh.aT>
	//  790 1474:aload_0         
	//  791 1475:getfield        #12  <Field azh a>
	//  792 1478:getfield        #70  <Field int azh.bm>
	//  793 1481:ixor            
	//  794 1482:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	//  795 1485:aload_0         
	//  796 1486:getfield        #12  <Field azh a>
	//  797 1489:astore_1        
		abyte0.s = ((azh) (abyte0)).ak & a.s;
	//  798 1490:aload_1         
	//  799 1491:aload_1         
	//  800 1492:getfield        #81  <Field int azh.ak>
	//  801 1495:aload_0         
	//  802 1496:getfield        #12  <Field azh a>
	//  803 1499:getfield        #117 <Field int azh.s>
	//  804 1502:iand            
	//  805 1503:putfield        #117 <Field int azh.s>
		abyte0 = ((byte []) (a));
	//  806 1506:aload_0         
	//  807 1507:getfield        #12  <Field azh a>
	//  808 1510:astore_1        
		abyte0.aT = ((azh) (abyte0)).E ^ a.a;
	//  809 1511:aload_1         
	//  810 1512:aload_1         
	//  811 1513:getfield        #76  <Field int azh.E>
	//  812 1516:aload_0         
	//  813 1517:getfield        #12  <Field azh a>
	//  814 1520:getfield        #78  <Field int azh.a>
	//  815 1523:ixor            
	//  816 1524:putfield        #105 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	//  817 1527:aload_0         
	//  818 1528:getfield        #12  <Field azh a>
	//  819 1531:astore_1        
		abyte0.s = ((azh) (abyte0)).aT ^ a.s;
	//  820 1532:aload_1         
	//  821 1533:aload_1         
	//  822 1534:getfield        #105 <Field int azh.aT>
	//  823 1537:aload_0         
	//  824 1538:getfield        #12  <Field azh a>
	//  825 1541:getfield        #117 <Field int azh.s>
	//  826 1544:ixor            
	//  827 1545:putfield        #117 <Field int azh.s>
		abyte0 = ((byte []) (a));
	//  828 1548:aload_0         
	//  829 1549:getfield        #12  <Field azh a>
	//  830 1552:astore_1        
		abyte0.ap = ((azh) (abyte0)).s ^ a.ap;
	//  831 1553:aload_1         
	//  832 1554:aload_1         
	//  833 1555:getfield        #117 <Field int azh.s>
	//  834 1558:aload_0         
	//  835 1559:getfield        #12  <Field azh a>
	//  836 1562:getfield        #26  <Field int azh.ap>
	//  837 1565:ixor            
	//  838 1566:putfield        #26  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	//  839 1569:aload_0         
	//  840 1570:getfield        #12  <Field azh a>
	//  841 1573:astore_1        
		abyte0.ap = ((azh) (abyte0)).ap & ~a.M;
	//  842 1574:aload_1         
	//  843 1575:aload_1         
	//  844 1576:getfield        #26  <Field int azh.ap>
	//  845 1579:aload_0         
	//  846 1580:getfield        #12  <Field azh a>
	//  847 1583:getfield        #93  <Field int azh.M>
	//  848 1586:iconst_m1       
	//  849 1587:ixor            
	//  850 1588:iand            
	//  851 1589:putfield        #26  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	//  852 1592:aload_0         
	//  853 1593:getfield        #12  <Field azh a>
	//  854 1596:astore_1        
		abyte0.aS = ((azh) (abyte0)).ak & a.aT;
	//  855 1597:aload_1         
	//  856 1598:aload_1         
	//  857 1599:getfield        #81  <Field int azh.ak>
	//  858 1602:aload_0         
	//  859 1603:getfield        #12  <Field azh a>
	//  860 1606:getfield        #105 <Field int azh.aT>
	//  861 1609:iand            
	//  862 1610:putfield        #58  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	//  863 1613:aload_0         
	//  864 1614:getfield        #12  <Field azh a>
	//  865 1617:astore_1        
		abyte0.aS = ((azh) (abyte0)).aA ^ a.aS;
	//  866 1618:aload_1         
	//  867 1619:aload_1         
	//  868 1620:getfield        #73  <Field int azh.aA>
	//  869 1623:aload_0         
	//  870 1624:getfield        #12  <Field azh a>
	//  871 1627:getfield        #58  <Field int azh.aS>
	//  872 1630:ixor            
	//  873 1631:putfield        #58  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	//  874 1634:aload_0         
	//  875 1635:getfield        #12  <Field azh a>
	//  876 1638:astore_1        
		abyte0.aV = ((azh) (abyte0)).ak & ~a.aT;
	//  877 1639:aload_1         
	//  878 1640:aload_1         
	//  879 1641:getfield        #81  <Field int azh.ak>
	//  880 1644:aload_0         
	//  881 1645:getfield        #12  <Field azh a>
	//  882 1648:getfield        #105 <Field int azh.aT>
	//  883 1651:iconst_m1       
	//  884 1652:ixor            
	//  885 1653:iand            
	//  886 1654:putfield        #126 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	//  887 1657:aload_0         
	//  888 1658:getfield        #12  <Field azh a>
	//  889 1661:astore_1        
		abyte0.aV = ((azh) (abyte0)).aA ^ a.aV;
	//  890 1662:aload_1         
	//  891 1663:aload_1         
	//  892 1664:getfield        #73  <Field int azh.aA>
	//  893 1667:aload_0         
	//  894 1668:getfield        #12  <Field azh a>
	//  895 1671:getfield        #126 <Field int azh.aV>
	//  896 1674:ixor            
	//  897 1675:putfield        #126 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	//  898 1678:aload_0         
	//  899 1679:getfield        #12  <Field azh a>
	//  900 1682:astore_1        
		abyte0.aA = ((azh) (abyte0)).ai & ~a.E;
	//  901 1683:aload_1         
	//  902 1684:aload_1         
	//  903 1685:getfield        #129 <Field int azh.ai>
	//  904 1688:aload_0         
	//  905 1689:getfield        #12  <Field azh a>
	//  906 1692:getfield        #76  <Field int azh.E>
	//  907 1695:iconst_m1       
	//  908 1696:ixor            
	//  909 1697:iand            
	//  910 1698:putfield        #73  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	//  911 1701:aload_0         
	//  912 1702:getfield        #12  <Field azh a>
	//  913 1705:astore_1        
		abyte0.aA = ((azh) (abyte0)).ai ^ a.aA;
	//  914 1706:aload_1         
	//  915 1707:aload_1         
	//  916 1708:getfield        #129 <Field int azh.ai>
	//  917 1711:aload_0         
	//  918 1712:getfield        #12  <Field azh a>
	//  919 1715:getfield        #73  <Field int azh.aA>
	//  920 1718:ixor            
	//  921 1719:putfield        #73  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	//  922 1722:aload_0         
	//  923 1723:getfield        #12  <Field azh a>
	//  924 1726:astore_1        
		abyte0.aA = ((azh) (abyte0)).aA & a.M;
	//  925 1727:aload_1         
	//  926 1728:aload_1         
	//  927 1729:getfield        #73  <Field int azh.aA>
	//  928 1732:aload_0         
	//  929 1733:getfield        #12  <Field azh a>
	//  930 1736:getfield        #93  <Field int azh.M>
	//  931 1739:iand            
	//  932 1740:putfield        #73  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	//  933 1743:aload_0         
	//  934 1744:getfield        #12  <Field azh a>
	//  935 1747:astore_1        
		abyte0.aA = ((azh) (abyte0)).E ^ a.aA;
	//  936 1748:aload_1         
	//  937 1749:aload_1         
	//  938 1750:getfield        #76  <Field int azh.E>
	//  939 1753:aload_0         
	//  940 1754:getfield        #12  <Field azh a>
	//  941 1757:getfield        #73  <Field int azh.aA>
	//  942 1760:ixor            
	//  943 1761:putfield        #73  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	//  944 1764:aload_0         
	//  945 1765:getfield        #12  <Field azh a>
	//  946 1768:astore_1        
		abyte0.aA = ((azh) (abyte0)).aA & ~a.g;
	//  947 1769:aload_1         
	//  948 1770:aload_1         
	//  949 1771:getfield        #73  <Field int azh.aA>
	//  950 1774:aload_0         
	//  951 1775:getfield        #12  <Field azh a>
	//  952 1778:getfield        #99  <Field int azh.g>
	//  953 1781:iconst_m1       
	//  954 1782:ixor            
	//  955 1783:iand            
	//  956 1784:putfield        #73  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	//  957 1787:aload_0         
	//  958 1788:getfield        #12  <Field azh a>
	//  959 1791:astore_1        
		abyte0.aA = ((azh) (abyte0)).E ^ a.aA;
	//  960 1792:aload_1         
	//  961 1793:aload_1         
	//  962 1794:getfield        #76  <Field int azh.E>
	//  963 1797:aload_0         
	//  964 1798:getfield        #12  <Field azh a>
	//  965 1801:getfield        #73  <Field int azh.aA>
	//  966 1804:ixor            
	//  967 1805:putfield        #73  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	//  968 1808:aload_0         
	//  969 1809:getfield        #12  <Field azh a>
	//  970 1812:astore_1        
		abyte0.aA = ((azh) (abyte0)).o & ~a.aA;
	//  971 1813:aload_1         
	//  972 1814:aload_1         
	//  973 1815:getfield        #132 <Field int azh.o>
	//  974 1818:aload_0         
	//  975 1819:getfield        #12  <Field azh a>
	//  976 1822:getfield        #73  <Field int azh.aA>
	//  977 1825:iconst_m1       
	//  978 1826:ixor            
	//  979 1827:iand            
	//  980 1828:putfield        #73  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	//  981 1831:aload_0         
	//  982 1832:getfield        #12  <Field azh a>
	//  983 1835:astore_1        
		abyte0.bR = ((azh) (abyte0)).a & ~a.E;
	//  984 1836:aload_1         
	//  985 1837:aload_1         
	//  986 1838:getfield        #78  <Field int azh.a>
	//  987 1841:aload_0         
	//  988 1842:getfield        #12  <Field azh a>
	//  989 1845:getfield        #76  <Field int azh.E>
	//  990 1848:iconst_m1       
	//  991 1849:ixor            
	//  992 1850:iand            
	//  993 1851:putfield        #135 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	//  994 1854:aload_0         
	//  995 1855:getfield        #12  <Field azh a>
	//  996 1858:astore_1        
		abyte0.bO = ((azh) (abyte0)).ak & a.bR;
	//  997 1859:aload_1         
	//  998 1860:aload_1         
	//  999 1861:getfield        #81  <Field int azh.ak>
	// 1000 1864:aload_0         
	// 1001 1865:getfield        #12  <Field azh a>
	// 1002 1868:getfield        #135 <Field int azh.bR>
	// 1003 1871:iand            
	// 1004 1872:putfield        #138 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 1005 1875:aload_0         
	// 1006 1876:getfield        #12  <Field azh a>
	// 1007 1879:astore_1        
		abyte0.ao = ((azh) (abyte0)).ac & ~a.bO;
	// 1008 1880:aload_1         
	// 1009 1881:aload_1         
	// 1010 1882:getfield        #84  <Field int azh.ac>
	// 1011 1885:aload_0         
	// 1012 1886:getfield        #12  <Field azh a>
	// 1013 1889:getfield        #138 <Field int azh.bO>
	// 1014 1892:iconst_m1       
	// 1015 1893:ixor            
	// 1016 1894:iand            
	// 1017 1895:putfield        #141 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 1018 1898:aload_0         
	// 1019 1899:getfield        #12  <Field azh a>
	// 1020 1902:astore_1        
		abyte0.ao = ((azh) (abyte0)).am ^ a.ao;
	// 1021 1903:aload_1         
	// 1022 1904:aload_1         
	// 1023 1905:getfield        #40  <Field int azh.am>
	// 1024 1908:aload_0         
	// 1025 1909:getfield        #12  <Field azh a>
	// 1026 1912:getfield        #141 <Field int azh.ao>
	// 1027 1915:ixor            
	// 1028 1916:putfield        #141 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 1029 1919:aload_0         
	// 1030 1920:getfield        #12  <Field azh a>
	// 1031 1923:astore_1        
		abyte0.ao = ((azh) (abyte0)).M | a.ao;
	// 1032 1924:aload_1         
	// 1033 1925:aload_1         
	// 1034 1926:getfield        #93  <Field int azh.M>
	// 1035 1929:aload_0         
	// 1036 1930:getfield        #12  <Field azh a>
	// 1037 1933:getfield        #141 <Field int azh.ao>
	// 1038 1936:ior             
	// 1039 1937:putfield        #141 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 1040 1940:aload_0         
	// 1041 1941:getfield        #12  <Field azh a>
	// 1042 1944:astore_1        
		abyte0.ao = ((azh) (abyte0)).bh ^ a.ao;
	// 1043 1945:aload_1         
	// 1044 1946:aload_1         
	// 1045 1947:getfield        #111 <Field int azh.bh>
	// 1046 1950:aload_0         
	// 1047 1951:getfield        #12  <Field azh a>
	// 1048 1954:getfield        #141 <Field int azh.ao>
	// 1049 1957:ixor            
	// 1050 1958:putfield        #141 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 1051 1961:aload_0         
	// 1052 1962:getfield        #12  <Field azh a>
	// 1053 1965:astore_1        
		abyte0.bO = ((azh) (abyte0)).ac & a.bO;
	// 1054 1966:aload_1         
	// 1055 1967:aload_1         
	// 1056 1968:getfield        #84  <Field int azh.ac>
	// 1057 1971:aload_0         
	// 1058 1972:getfield        #12  <Field azh a>
	// 1059 1975:getfield        #138 <Field int azh.bO>
	// 1060 1978:iand            
	// 1061 1979:putfield        #138 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 1062 1982:aload_0         
	// 1063 1983:getfield        #12  <Field azh a>
	// 1064 1986:astore_1        
		abyte0.bO = ((azh) (abyte0)).aV ^ a.bO;
	// 1065 1987:aload_1         
	// 1066 1988:aload_1         
	// 1067 1989:getfield        #126 <Field int azh.aV>
	// 1068 1992:aload_0         
	// 1069 1993:getfield        #12  <Field azh a>
	// 1070 1996:getfield        #138 <Field int azh.bO>
	// 1071 1999:ixor            
	// 1072 2000:putfield        #138 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 1073 2003:aload_0         
	// 1074 2004:getfield        #12  <Field azh a>
	// 1075 2007:astore_1        
		abyte0.aV = ((azh) (abyte0)).ak & a.bR;
	// 1076 2008:aload_1         
	// 1077 2009:aload_1         
	// 1078 2010:getfield        #81  <Field int azh.ak>
	// 1079 2013:aload_0         
	// 1080 2014:getfield        #12  <Field azh a>
	// 1081 2017:getfield        #135 <Field int azh.bR>
	// 1082 2020:iand            
	// 1083 2021:putfield        #126 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 1084 2024:aload_0         
	// 1085 2025:getfield        #12  <Field azh a>
	// 1086 2028:astore_1        
		abyte0.aV = ((azh) (abyte0)).aT ^ a.aV;
	// 1087 2029:aload_1         
	// 1088 2030:aload_1         
	// 1089 2031:getfield        #105 <Field int azh.aT>
	// 1090 2034:aload_0         
	// 1091 2035:getfield        #12  <Field azh a>
	// 1092 2038:getfield        #126 <Field int azh.aV>
	// 1093 2041:ixor            
	// 1094 2042:putfield        #126 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 1095 2045:aload_0         
	// 1096 2046:getfield        #12  <Field azh a>
	// 1097 2049:astore_1        
		abyte0.bL = ((azh) (abyte0)).aV ^ a.bL;
	// 1098 2050:aload_1         
	// 1099 2051:aload_1         
	// 1100 2052:getfield        #126 <Field int azh.aV>
	// 1101 2055:aload_0         
	// 1102 2056:getfield        #12  <Field azh a>
	// 1103 2059:getfield        #64  <Field int azh.bL>
	// 1104 2062:ixor            
	// 1105 2063:putfield        #64  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 1106 2066:aload_0         
	// 1107 2067:getfield        #12  <Field azh a>
	// 1108 2070:astore_1        
		abyte0.bL = ((azh) (abyte0)).M | a.bL;
	// 1109 2071:aload_1         
	// 1110 2072:aload_1         
	// 1111 2073:getfield        #93  <Field int azh.M>
	// 1112 2076:aload_0         
	// 1113 2077:getfield        #12  <Field azh a>
	// 1114 2080:getfield        #64  <Field int azh.bL>
	// 1115 2083:ior             
	// 1116 2084:putfield        #64  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 1117 2087:aload_0         
	// 1118 2088:getfield        #12  <Field azh a>
	// 1119 2091:astore_1        
		abyte0.aV = ((azh) (abyte0)).ak & a.bR;
	// 1120 2092:aload_1         
	// 1121 2093:aload_1         
	// 1122 2094:getfield        #81  <Field int azh.ak>
	// 1123 2097:aload_0         
	// 1124 2098:getfield        #12  <Field azh a>
	// 1125 2101:getfield        #135 <Field int azh.bR>
	// 1126 2104:iand            
	// 1127 2105:putfield        #126 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 1128 2108:aload_0         
	// 1129 2109:getfield        #12  <Field azh a>
	// 1130 2112:astore_1        
		abyte0.aV = ((azh) (abyte0)).bR ^ a.aV;
	// 1131 2113:aload_1         
	// 1132 2114:aload_1         
	// 1133 2115:getfield        #135 <Field int azh.bR>
	// 1134 2118:aload_0         
	// 1135 2119:getfield        #12  <Field azh a>
	// 1136 2122:getfield        #126 <Field int azh.aV>
	// 1137 2125:ixor            
	// 1138 2126:putfield        #126 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 1139 2129:aload_0         
	// 1140 2130:getfield        #12  <Field azh a>
	// 1141 2133:astore_1        
		abyte0.aV = ((azh) (abyte0)).ac & a.aV;
	// 1142 2134:aload_1         
	// 1143 2135:aload_1         
	// 1144 2136:getfield        #84  <Field int azh.ac>
	// 1145 2139:aload_0         
	// 1146 2140:getfield        #12  <Field azh a>
	// 1147 2143:getfield        #126 <Field int azh.aV>
	// 1148 2146:iand            
	// 1149 2147:putfield        #126 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 1150 2150:aload_0         
	// 1151 2151:getfield        #12  <Field azh a>
	// 1152 2154:astore_1        
		abyte0.aV = ((azh) (abyte0)).s ^ a.aV;
	// 1153 2155:aload_1         
	// 1154 2156:aload_1         
	// 1155 2157:getfield        #117 <Field int azh.s>
	// 1156 2160:aload_0         
	// 1157 2161:getfield        #12  <Field azh a>
	// 1158 2164:getfield        #126 <Field int azh.aV>
	// 1159 2167:ixor            
	// 1160 2168:putfield        #126 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 1161 2171:aload_0         
	// 1162 2172:getfield        #12  <Field azh a>
	// 1163 2175:astore_1        
		abyte0.bA = ((azh) (abyte0)).aV ^ a.bA;
	// 1164 2176:aload_1         
	// 1165 2177:aload_1         
	// 1166 2178:getfield        #126 <Field int azh.aV>
	// 1167 2181:aload_0         
	// 1168 2182:getfield        #12  <Field azh a>
	// 1169 2185:getfield        #123 <Field int azh.bA>
	// 1170 2188:ixor            
	// 1171 2189:putfield        #123 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 1172 2192:aload_0         
	// 1173 2193:getfield        #12  <Field azh a>
	// 1174 2196:astore_1        
		abyte0.bA = ((azh) (abyte0)).U & a.bA;
	// 1175 2197:aload_1         
	// 1176 2198:aload_1         
	// 1177 2199:getfield        #144 <Field int azh.U>
	// 1178 2202:aload_0         
	// 1179 2203:getfield        #12  <Field azh a>
	// 1180 2206:getfield        #123 <Field int azh.bA>
	// 1181 2209:iand            
	// 1182 2210:putfield        #123 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 1183 2213:aload_0         
	// 1184 2214:getfield        #12  <Field azh a>
	// 1185 2217:astore_1        
		abyte0.bA = ((azh) (abyte0)).ao ^ a.bA;
	// 1186 2218:aload_1         
	// 1187 2219:aload_1         
	// 1188 2220:getfield        #141 <Field int azh.ao>
	// 1189 2223:aload_0         
	// 1190 2224:getfield        #12  <Field azh a>
	// 1191 2227:getfield        #123 <Field int azh.bA>
	// 1192 2230:ixor            
	// 1193 2231:putfield        #123 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 1194 2234:aload_0         
	// 1195 2235:getfield        #12  <Field azh a>
	// 1196 2238:astore_1        
		abyte0.br = ((azh) (abyte0)).bA ^ a.br;
	// 1197 2239:aload_1         
	// 1198 2240:aload_1         
	// 1199 2241:getfield        #123 <Field int azh.bA>
	// 1200 2244:aload_0         
	// 1201 2245:getfield        #12  <Field azh a>
	// 1202 2248:getfield        #147 <Field int azh.br>
	// 1203 2251:ixor            
	// 1204 2252:putfield        #147 <Field int azh.br>
		abyte0 = ((byte []) (a));
	// 1205 2255:aload_0         
	// 1206 2256:getfield        #12  <Field azh a>
	// 1207 2259:astore_1        
		abyte0.cf = ((azh) (abyte0)).br | a.cf;
	// 1208 2260:aload_1         
	// 1209 2261:aload_1         
	// 1210 2262:getfield        #147 <Field int azh.br>
	// 1211 2265:aload_0         
	// 1212 2266:getfield        #12  <Field azh a>
	// 1213 2269:getfield        #150 <Field int azh.cf>
	// 1214 2272:ior             
	// 1215 2273:putfield        #150 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 1216 2276:aload_0         
	// 1217 2277:getfield        #12  <Field azh a>
	// 1218 2280:astore_1        
		abyte0.ay = ((azh) (abyte0)).ay & ~a.br;
	// 1219 2281:aload_1         
	// 1220 2282:aload_1         
	// 1221 2283:getfield        #153 <Field int azh.ay>
	// 1222 2286:aload_0         
	// 1223 2287:getfield        #12  <Field azh a>
	// 1224 2290:getfield        #147 <Field int azh.br>
	// 1225 2293:iconst_m1       
	// 1226 2294:ixor            
	// 1227 2295:iand            
	// 1228 2296:putfield        #153 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 1229 2299:aload_0         
	// 1230 2300:getfield        #12  <Field azh a>
	// 1231 2303:astore_1        
		abyte0.bA = ((azh) (abyte0)).br | a.cb;
	// 1232 2304:aload_1         
	// 1233 2305:aload_1         
	// 1234 2306:getfield        #147 <Field int azh.br>
	// 1235 2309:aload_0         
	// 1236 2310:getfield        #12  <Field azh a>
	// 1237 2313:getfield        #156 <Field int azh.cb>
	// 1238 2316:ior             
	// 1239 2317:putfield        #123 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 1240 2320:aload_0         
	// 1241 2321:getfield        #12  <Field azh a>
	// 1242 2324:astore_1        
		abyte0.ao = ((azh) (abyte0)).ac & a.bR;
	// 1243 2325:aload_1         
	// 1244 2326:aload_1         
	// 1245 2327:getfield        #84  <Field int azh.ac>
	// 1246 2330:aload_0         
	// 1247 2331:getfield        #12  <Field azh a>
	// 1248 2334:getfield        #135 <Field int azh.bR>
	// 1249 2337:iand            
	// 1250 2338:putfield        #141 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 1251 2341:aload_0         
	// 1252 2342:getfield        #12  <Field azh a>
	// 1253 2345:astore_1        
		abyte0.ao = ((azh) (abyte0)).bX ^ a.ao;
	// 1254 2346:aload_1         
	// 1255 2347:aload_1         
	// 1256 2348:getfield        #120 <Field int azh.bX>
	// 1257 2351:aload_0         
	// 1258 2352:getfield        #12  <Field azh a>
	// 1259 2355:getfield        #141 <Field int azh.ao>
	// 1260 2358:ixor            
	// 1261 2359:putfield        #141 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 1262 2362:aload_0         
	// 1263 2363:getfield        #12  <Field azh a>
	// 1264 2366:astore_1        
		abyte0.ao = ((azh) (abyte0)).ao & ~a.M;
	// 1265 2367:aload_1         
	// 1266 2368:aload_1         
	// 1267 2369:getfield        #141 <Field int azh.ao>
	// 1268 2372:aload_0         
	// 1269 2373:getfield        #12  <Field azh a>
	// 1270 2376:getfield        #93  <Field int azh.M>
	// 1271 2379:iconst_m1       
	// 1272 2380:ixor            
	// 1273 2381:iand            
	// 1274 2382:putfield        #141 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 1275 2385:aload_0         
	// 1276 2386:getfield        #12  <Field azh a>
	// 1277 2389:astore_1        
		abyte0.ao = ((azh) (abyte0)).bO ^ a.ao;
	// 1278 2390:aload_1         
	// 1279 2391:aload_1         
	// 1280 2392:getfield        #138 <Field int azh.bO>
	// 1281 2395:aload_0         
	// 1282 2396:getfield        #12  <Field azh a>
	// 1283 2399:getfield        #141 <Field int azh.ao>
	// 1284 2402:ixor            
	// 1285 2403:putfield        #141 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 1286 2406:aload_0         
	// 1287 2407:getfield        #12  <Field azh a>
	// 1288 2410:astore_1        
		abyte0.ao = ((azh) (abyte0)).U & ~a.ao;
	// 1289 2411:aload_1         
	// 1290 2412:aload_1         
	// 1291 2413:getfield        #144 <Field int azh.U>
	// 1292 2416:aload_0         
	// 1293 2417:getfield        #12  <Field azh a>
	// 1294 2420:getfield        #141 <Field int azh.ao>
	// 1295 2423:iconst_m1       
	// 1296 2424:ixor            
	// 1297 2425:iand            
	// 1298 2426:putfield        #141 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 1299 2429:aload_0         
	// 1300 2430:getfield        #12  <Field azh a>
	// 1301 2433:astore_1        
		abyte0.ao = ((azh) (abyte0)).bm ^ a.ao;
	// 1302 2434:aload_1         
	// 1303 2435:aload_1         
	// 1304 2436:getfield        #70  <Field int azh.bm>
	// 1305 2439:aload_0         
	// 1306 2440:getfield        #12  <Field azh a>
	// 1307 2443:getfield        #141 <Field int azh.ao>
	// 1308 2446:ixor            
	// 1309 2447:putfield        #141 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 1310 2450:aload_0         
	// 1311 2451:getfield        #12  <Field azh a>
	// 1312 2454:astore_1        
		abyte0.j = ((azh) (abyte0)).ao ^ a.j;
	// 1313 2455:aload_1         
	// 1314 2456:aload_1         
	// 1315 2457:getfield        #141 <Field int azh.ao>
	// 1316 2460:aload_0         
	// 1317 2461:getfield        #12  <Field azh a>
	// 1318 2464:getfield        #159 <Field int azh.j>
	// 1319 2467:ixor            
	// 1320 2468:putfield        #159 <Field int azh.j>
		abyte0 = ((byte []) (a));
	// 1321 2471:aload_0         
	// 1322 2472:getfield        #12  <Field azh a>
	// 1323 2475:astore_1        
		abyte0.ao = ((azh) (abyte0)).j & a.bE;
	// 1324 2476:aload_1         
	// 1325 2477:aload_1         
	// 1326 2478:getfield        #159 <Field int azh.j>
	// 1327 2481:aload_0         
	// 1328 2482:getfield        #12  <Field azh a>
	// 1329 2485:getfield        #162 <Field int azh.bE>
	// 1330 2488:iand            
	// 1331 2489:putfield        #141 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 1332 2492:aload_0         
	// 1333 2493:getfield        #12  <Field azh a>
	// 1334 2496:astore_1        
		abyte0.bm = ((azh) (abyte0)).ao & ~a.bl;
	// 1335 2497:aload_1         
	// 1336 2498:aload_1         
	// 1337 2499:getfield        #141 <Field int azh.ao>
	// 1338 2502:aload_0         
	// 1339 2503:getfield        #12  <Field azh a>
	// 1340 2506:getfield        #165 <Field int azh.bl>
	// 1341 2509:iconst_m1       
	// 1342 2510:ixor            
	// 1343 2511:iand            
	// 1344 2512:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 1345 2515:aload_0         
	// 1346 2516:getfield        #12  <Field azh a>
	// 1347 2519:astore_1        
		abyte0.bO = ((azh) (abyte0)).ao & ~a.bl;
	// 1348 2520:aload_1         
	// 1349 2521:aload_1         
	// 1350 2522:getfield        #141 <Field int azh.ao>
	// 1351 2525:aload_0         
	// 1352 2526:getfield        #12  <Field azh a>
	// 1353 2529:getfield        #165 <Field int azh.bl>
	// 1354 2532:iconst_m1       
	// 1355 2533:ixor            
	// 1356 2534:iand            
	// 1357 2535:putfield        #138 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 1358 2538:aload_0         
	// 1359 2539:getfield        #12  <Field azh a>
	// 1360 2542:astore_1        
		abyte0.bH = ((azh) (abyte0)).ao ^ a.bH;
	// 1361 2543:aload_1         
	// 1362 2544:aload_1         
	// 1363 2545:getfield        #141 <Field int azh.ao>
	// 1364 2548:aload_0         
	// 1365 2549:getfield        #12  <Field azh a>
	// 1366 2552:getfield        #168 <Field int azh.bH>
	// 1367 2555:ixor            
	// 1368 2556:putfield        #168 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 1369 2559:aload_0         
	// 1370 2560:getfield        #12  <Field azh a>
	// 1371 2563:astore_1        
		abyte0.ao = ((azh) (abyte0)).j & ~a.bE;
	// 1372 2564:aload_1         
	// 1373 2565:aload_1         
	// 1374 2566:getfield        #159 <Field int azh.j>
	// 1375 2569:aload_0         
	// 1376 2570:getfield        #12  <Field azh a>
	// 1377 2573:getfield        #162 <Field int azh.bE>
	// 1378 2576:iconst_m1       
	// 1379 2577:ixor            
	// 1380 2578:iand            
	// 1381 2579:putfield        #141 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 1382 2582:aload_0         
	// 1383 2583:getfield        #12  <Field azh a>
	// 1384 2586:astore_1        
		abyte0.bX = ((azh) (abyte0)).ao & ~a.bl;
	// 1385 2587:aload_1         
	// 1386 2588:aload_1         
	// 1387 2589:getfield        #141 <Field int azh.ao>
	// 1388 2592:aload_0         
	// 1389 2593:getfield        #12  <Field azh a>
	// 1390 2596:getfield        #165 <Field int azh.bl>
	// 1391 2599:iconst_m1       
	// 1392 2600:ixor            
	// 1393 2601:iand            
	// 1394 2602:putfield        #120 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 1395 2605:aload_0         
	// 1396 2606:getfield        #12  <Field azh a>
	// 1397 2609:astore_1        
		abyte0.bX = ((azh) (abyte0)).ao ^ a.bX;
	// 1398 2610:aload_1         
	// 1399 2611:aload_1         
	// 1400 2612:getfield        #141 <Field int azh.ao>
	// 1401 2615:aload_0         
	// 1402 2616:getfield        #12  <Field azh a>
	// 1403 2619:getfield        #120 <Field int azh.bX>
	// 1404 2622:ixor            
	// 1405 2623:putfield        #120 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 1406 2626:aload_0         
	// 1407 2627:getfield        #12  <Field azh a>
	// 1408 2630:astore_1        
		abyte0.aV = ((azh) (abyte0)).ao ^ a.bl;
	// 1409 2631:aload_1         
	// 1410 2632:aload_1         
	// 1411 2633:getfield        #141 <Field int azh.ao>
	// 1412 2636:aload_0         
	// 1413 2637:getfield        #12  <Field azh a>
	// 1414 2640:getfield        #165 <Field int azh.bl>
	// 1415 2643:ixor            
	// 1416 2644:putfield        #126 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 1417 2647:aload_0         
	// 1418 2648:getfield        #12  <Field azh a>
	// 1419 2651:astore_1        
		abyte0.s = ((azh) (abyte0)).aL & ~a.aV;
	// 1420 2652:aload_1         
	// 1421 2653:aload_1         
	// 1422 2654:getfield        #171 <Field int azh.aL>
	// 1423 2657:aload_0         
	// 1424 2658:getfield        #12  <Field azh a>
	// 1425 2661:getfield        #126 <Field int azh.aV>
	// 1426 2664:iconst_m1       
	// 1427 2665:ixor            
	// 1428 2666:iand            
	// 1429 2667:putfield        #117 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 1430 2670:aload_0         
	// 1431 2671:getfield        #12  <Field azh a>
	// 1432 2674:astore_1        
		abyte0.aT = ((azh) (abyte0)).aL & a.aV;
	// 1433 2675:aload_1         
	// 1434 2676:aload_1         
	// 1435 2677:getfield        #171 <Field int azh.aL>
	// 1436 2680:aload_0         
	// 1437 2681:getfield        #12  <Field azh a>
	// 1438 2684:getfield        #126 <Field int azh.aV>
	// 1439 2687:iand            
	// 1440 2688:putfield        #105 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 1441 2691:aload_0         
	// 1442 2692:getfield        #12  <Field azh a>
	// 1443 2695:astore_1        
		abyte0.aT = ((azh) (abyte0)).bH ^ a.aT;
	// 1444 2696:aload_1         
	// 1445 2697:aload_1         
	// 1446 2698:getfield        #168 <Field int azh.bH>
	// 1447 2701:aload_0         
	// 1448 2702:getfield        #12  <Field azh a>
	// 1449 2705:getfield        #105 <Field int azh.aT>
	// 1450 2708:ixor            
	// 1451 2709:putfield        #105 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 1452 2712:aload_0         
	// 1453 2713:getfield        #12  <Field azh a>
	// 1454 2716:astore_1        
		abyte0.ao = ((azh) (abyte0)).ao & a.aL;
	// 1455 2717:aload_1         
	// 1456 2718:aload_1         
	// 1457 2719:getfield        #141 <Field int azh.ao>
	// 1458 2722:aload_0         
	// 1459 2723:getfield        #12  <Field azh a>
	// 1460 2726:getfield        #171 <Field int azh.aL>
	// 1461 2729:iand            
	// 1462 2730:putfield        #141 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 1463 2733:aload_0         
	// 1464 2734:getfield        #12  <Field azh a>
	// 1465 2737:astore_1        
		abyte0.ao = ((azh) (abyte0)).bX ^ a.ao;
	// 1466 2738:aload_1         
	// 1467 2739:aload_1         
	// 1468 2740:getfield        #120 <Field int azh.bX>
	// 1469 2743:aload_0         
	// 1470 2744:getfield        #12  <Field azh a>
	// 1471 2747:getfield        #141 <Field int azh.ao>
	// 1472 2750:ixor            
	// 1473 2751:putfield        #141 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 1474 2754:aload_0         
	// 1475 2755:getfield        #12  <Field azh a>
	// 1476 2758:astore_1        
		abyte0.bX = ((azh) (abyte0)).bE ^ a.j;
	// 1477 2759:aload_1         
	// 1478 2760:aload_1         
	// 1479 2761:getfield        #162 <Field int azh.bE>
	// 1480 2764:aload_0         
	// 1481 2765:getfield        #12  <Field azh a>
	// 1482 2768:getfield        #159 <Field int azh.j>
	// 1483 2771:ixor            
	// 1484 2772:putfield        #120 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 1485 2775:aload_0         
	// 1486 2776:getfield        #12  <Field azh a>
	// 1487 2779:astore_1        
		abyte0.bH = ((azh) (abyte0)).bX & ~a.aL;
	// 1488 2780:aload_1         
	// 1489 2781:aload_1         
	// 1490 2782:getfield        #120 <Field int azh.bX>
	// 1491 2785:aload_0         
	// 1492 2786:getfield        #12  <Field azh a>
	// 1493 2789:getfield        #171 <Field int azh.aL>
	// 1494 2792:iconst_m1       
	// 1495 2793:ixor            
	// 1496 2794:iand            
	// 1497 2795:putfield        #168 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 1498 2798:aload_0         
	// 1499 2799:getfield        #12  <Field azh a>
	// 1500 2802:astore_1        
		abyte0.bV = ((azh) (abyte0)).bX ^ a.bV;
	// 1501 2803:aload_1         
	// 1502 2804:aload_1         
	// 1503 2805:getfield        #120 <Field int azh.bX>
	// 1504 2808:aload_0         
	// 1505 2809:getfield        #12  <Field azh a>
	// 1506 2812:getfield        #174 <Field int azh.bV>
	// 1507 2815:ixor            
	// 1508 2816:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 1509 2819:aload_0         
	// 1510 2820:getfield        #12  <Field azh a>
	// 1511 2823:astore_1        
		abyte0.bh = ((azh) (abyte0)).aL & a.bV;
	// 1512 2824:aload_1         
	// 1513 2825:aload_1         
	// 1514 2826:getfield        #171 <Field int azh.aL>
	// 1515 2829:aload_0         
	// 1516 2830:getfield        #12  <Field azh a>
	// 1517 2833:getfield        #174 <Field int azh.bV>
	// 1518 2836:iand            
	// 1519 2837:putfield        #111 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 1520 2840:aload_0         
	// 1521 2841:getfield        #12  <Field azh a>
	// 1522 2844:astore_1        
		abyte0.am = ((azh) (abyte0)).aL & ~a.bV;
	// 1523 2845:aload_1         
	// 1524 2846:aload_1         
	// 1525 2847:getfield        #171 <Field int azh.aL>
	// 1526 2850:aload_0         
	// 1527 2851:getfield        #12  <Field azh a>
	// 1528 2854:getfield        #174 <Field int azh.bV>
	// 1529 2857:iconst_m1       
	// 1530 2858:ixor            
	// 1531 2859:iand            
	// 1532 2860:putfield        #40  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 1533 2863:aload_0         
	// 1534 2864:getfield        #12  <Field azh a>
	// 1535 2867:astore_1        
		abyte0.am = ((azh) (abyte0)).j ^ a.am;
	// 1536 2868:aload_1         
	// 1537 2869:aload_1         
	// 1538 2870:getfield        #159 <Field int azh.j>
	// 1539 2873:aload_0         
	// 1540 2874:getfield        #12  <Field azh a>
	// 1541 2877:getfield        #40  <Field int azh.am>
	// 1542 2880:ixor            
	// 1543 2881:putfield        #40  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 1544 2884:aload_0         
	// 1545 2885:getfield        #12  <Field azh a>
	// 1546 2888:astore_1        
		abyte0.aw = ((azh) (abyte0)).bE | a.j;
	// 1547 2889:aload_1         
	// 1548 2890:aload_1         
	// 1549 2891:getfield        #162 <Field int azh.bE>
	// 1550 2894:aload_0         
	// 1551 2895:getfield        #12  <Field azh a>
	// 1552 2898:getfield        #159 <Field int azh.j>
	// 1553 2901:ior             
	// 1554 2902:putfield        #177 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 1555 2905:aload_0         
	// 1556 2906:getfield        #12  <Field azh a>
	// 1557 2909:astore_1        
		abyte0.bu = ((azh) (abyte0)).aw & ~a.j;
	// 1558 2910:aload_1         
	// 1559 2911:aload_1         
	// 1560 2912:getfield        #177 <Field int azh.aw>
	// 1561 2915:aload_0         
	// 1562 2916:getfield        #12  <Field azh a>
	// 1563 2919:getfield        #159 <Field int azh.j>
	// 1564 2922:iconst_m1       
	// 1565 2923:ixor            
	// 1566 2924:iand            
	// 1567 2925:putfield        #180 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 1568 2928:aload_0         
	// 1569 2929:getfield        #12  <Field azh a>
	// 1570 2932:astore_1        
		abyte0.bN = ((azh) (abyte0)).aL | a.bu;
	// 1571 2933:aload_1         
	// 1572 2934:aload_1         
	// 1573 2935:getfield        #171 <Field int azh.aL>
	// 1574 2938:aload_0         
	// 1575 2939:getfield        #12  <Field azh a>
	// 1576 2942:getfield        #180 <Field int azh.bu>
	// 1577 2945:ior             
	// 1578 2946:putfield        #183 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 1579 2949:aload_0         
	// 1580 2950:getfield        #12  <Field azh a>
	// 1581 2953:astore_1        
		abyte0.bN = ((azh) (abyte0)).aV ^ a.bN;
	// 1582 2954:aload_1         
	// 1583 2955:aload_1         
	// 1584 2956:getfield        #126 <Field int azh.aV>
	// 1585 2959:aload_0         
	// 1586 2960:getfield        #12  <Field azh a>
	// 1587 2963:getfield        #183 <Field int azh.bN>
	// 1588 2966:ixor            
	// 1589 2967:putfield        #183 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 1590 2970:aload_0         
	// 1591 2971:getfield        #12  <Field azh a>
	// 1592 2974:astore_1        
		abyte0.ci = ((azh) (abyte0)).bu ^ a.ci;
	// 1593 2975:aload_1         
	// 1594 2976:aload_1         
	// 1595 2977:getfield        #180 <Field int azh.bu>
	// 1596 2980:aload_0         
	// 1597 2981:getfield        #12  <Field azh a>
	// 1598 2984:getfield        #186 <Field int azh.ci>
	// 1599 2987:ixor            
	// 1600 2988:putfield        #186 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 1601 2991:aload_0         
	// 1602 2992:getfield        #12  <Field azh a>
	// 1603 2995:astore_1        
		abyte0.bu = ((azh) (abyte0)).ci & a.aL;
	// 1604 2996:aload_1         
	// 1605 2997:aload_1         
	// 1606 2998:getfield        #186 <Field int azh.ci>
	// 1607 3001:aload_0         
	// 1608 3002:getfield        #12  <Field azh a>
	// 1609 3005:getfield        #171 <Field int azh.aL>
	// 1610 3008:iand            
	// 1611 3009:putfield        #180 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 1612 3012:aload_0         
	// 1613 3013:getfield        #12  <Field azh a>
	// 1614 3016:astore_1        
		abyte0.bu = ((azh) (abyte0)).j ^ a.bu;
	// 1615 3017:aload_1         
	// 1616 3018:aload_1         
	// 1617 3019:getfield        #159 <Field int azh.j>
	// 1618 3022:aload_0         
	// 1619 3023:getfield        #12  <Field azh a>
	// 1620 3026:getfield        #180 <Field int azh.bu>
	// 1621 3029:ixor            
	// 1622 3030:putfield        #180 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 1623 3033:aload_0         
	// 1624 3034:getfield        #12  <Field azh a>
	// 1625 3037:astore_1        
		abyte0.ci = ((azh) (abyte0)).ci & a.aL;
	// 1626 3038:aload_1         
	// 1627 3039:aload_1         
	// 1628 3040:getfield        #186 <Field int azh.ci>
	// 1629 3043:aload_0         
	// 1630 3044:getfield        #12  <Field azh a>
	// 1631 3047:getfield        #171 <Field int azh.aL>
	// 1632 3050:iand            
	// 1633 3051:putfield        #186 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 1634 3054:aload_0         
	// 1635 3055:getfield        #12  <Field azh a>
	// 1636 3058:astore_1        
		abyte0.bm = ((azh) (abyte0)).aw ^ a.bm;
	// 1637 3059:aload_1         
	// 1638 3060:aload_1         
	// 1639 3061:getfield        #177 <Field int azh.aw>
	// 1640 3064:aload_0         
	// 1641 3065:getfield        #12  <Field azh a>
	// 1642 3068:getfield        #70  <Field int azh.bm>
	// 1643 3071:ixor            
	// 1644 3072:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 1645 3075:aload_0         
	// 1646 3076:getfield        #12  <Field azh a>
	// 1647 3079:astore_1        
		abyte0.ci = ((azh) (abyte0)).bm ^ a.ci;
	// 1648 3080:aload_1         
	// 1649 3081:aload_1         
	// 1650 3082:getfield        #70  <Field int azh.bm>
	// 1651 3085:aload_0         
	// 1652 3086:getfield        #12  <Field azh a>
	// 1653 3089:getfield        #186 <Field int azh.ci>
	// 1654 3092:ixor            
	// 1655 3093:putfield        #186 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 1656 3096:aload_0         
	// 1657 3097:getfield        #12  <Field azh a>
	// 1658 3100:astore_1        
		abyte0.aI = ((azh) (abyte0)).aw ^ a.aI;
	// 1659 3101:aload_1         
	// 1660 3102:aload_1         
	// 1661 3103:getfield        #177 <Field int azh.aw>
	// 1662 3106:aload_0         
	// 1663 3107:getfield        #12  <Field azh a>
	// 1664 3110:getfield        #189 <Field int azh.aI>
	// 1665 3113:ixor            
	// 1666 3114:putfield        #189 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 1667 3117:aload_0         
	// 1668 3118:getfield        #12  <Field azh a>
	// 1669 3121:astore_1        
		abyte0.aI = ((azh) (abyte0)).aI & ~a.aL;
	// 1670 3122:aload_1         
	// 1671 3123:aload_1         
	// 1672 3124:getfield        #189 <Field int azh.aI>
	// 1673 3127:aload_0         
	// 1674 3128:getfield        #12  <Field azh a>
	// 1675 3131:getfield        #171 <Field int azh.aL>
	// 1676 3134:iconst_m1       
	// 1677 3135:ixor            
	// 1678 3136:iand            
	// 1679 3137:putfield        #189 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 1680 3140:aload_0         
	// 1681 3141:getfield        #12  <Field azh a>
	// 1682 3144:astore_1        
		abyte0.bm = ((azh) (abyte0)).j & ~a.bl;
	// 1683 3145:aload_1         
	// 1684 3146:aload_1         
	// 1685 3147:getfield        #159 <Field int azh.j>
	// 1686 3150:aload_0         
	// 1687 3151:getfield        #12  <Field azh a>
	// 1688 3154:getfield        #165 <Field int azh.bl>
	// 1689 3157:iconst_m1       
	// 1690 3158:ixor            
	// 1691 3159:iand            
	// 1692 3160:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 1693 3163:aload_0         
	// 1694 3164:getfield        #12  <Field azh a>
	// 1695 3167:astore_1        
		abyte0.bm = ((azh) (abyte0)).bE ^ a.bm;
	// 1696 3168:aload_1         
	// 1697 3169:aload_1         
	// 1698 3170:getfield        #162 <Field int azh.bE>
	// 1699 3173:aload_0         
	// 1700 3174:getfield        #12  <Field azh a>
	// 1701 3177:getfield        #70  <Field int azh.bm>
	// 1702 3180:ixor            
	// 1703 3181:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 1704 3184:aload_0         
	// 1705 3185:getfield        #12  <Field azh a>
	// 1706 3188:astore_1        
		abyte0.bm = ((azh) (abyte0)).bm & ~a.aL;
	// 1707 3189:aload_1         
	// 1708 3190:aload_1         
	// 1709 3191:getfield        #70  <Field int azh.bm>
	// 1710 3194:aload_0         
	// 1711 3195:getfield        #12  <Field azh a>
	// 1712 3198:getfield        #171 <Field int azh.aL>
	// 1713 3201:iconst_m1       
	// 1714 3202:ixor            
	// 1715 3203:iand            
	// 1716 3204:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 1717 3207:aload_0         
	// 1718 3208:getfield        #12  <Field azh a>
	// 1719 3211:astore_1        
		abyte0.bm = ((azh) (abyte0)).bV ^ a.bm;
	// 1720 3212:aload_1         
	// 1721 3213:aload_1         
	// 1722 3214:getfield        #174 <Field int azh.bV>
	// 1723 3217:aload_0         
	// 1724 3218:getfield        #12  <Field azh a>
	// 1725 3221:getfield        #70  <Field int azh.bm>
	// 1726 3224:ixor            
	// 1727 3225:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 1728 3228:aload_0         
	// 1729 3229:getfield        #12  <Field azh a>
	// 1730 3232:astore_1        
		abyte0.bV = ((azh) (abyte0)).bE & ~a.j;
	// 1731 3233:aload_1         
	// 1732 3234:aload_1         
	// 1733 3235:getfield        #162 <Field int azh.bE>
	// 1734 3238:aload_0         
	// 1735 3239:getfield        #12  <Field azh a>
	// 1736 3242:getfield        #159 <Field int azh.j>
	// 1737 3245:iconst_m1       
	// 1738 3246:ixor            
	// 1739 3247:iand            
	// 1740 3248:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 1741 3251:aload_0         
	// 1742 3252:getfield        #12  <Field azh a>
	// 1743 3255:astore_1        
		abyte0.bO = ((azh) (abyte0)).bV ^ a.bO;
	// 1744 3256:aload_1         
	// 1745 3257:aload_1         
	// 1746 3258:getfield        #174 <Field int azh.bV>
	// 1747 3261:aload_0         
	// 1748 3262:getfield        #12  <Field azh a>
	// 1749 3265:getfield        #138 <Field int azh.bO>
	// 1750 3268:ixor            
	// 1751 3269:putfield        #138 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 1752 3272:aload_0         
	// 1753 3273:getfield        #12  <Field azh a>
	// 1754 3276:astore_1        
		abyte0.s = ((azh) (abyte0)).bO ^ a.s;
	// 1755 3277:aload_1         
	// 1756 3278:aload_1         
	// 1757 3279:getfield        #138 <Field int azh.bO>
	// 1758 3282:aload_0         
	// 1759 3283:getfield        #12  <Field azh a>
	// 1760 3286:getfield        #117 <Field int azh.s>
	// 1761 3289:ixor            
	// 1762 3290:putfield        #117 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 1763 3293:aload_0         
	// 1764 3294:getfield        #12  <Field azh a>
	// 1765 3297:astore_1        
		abyte0.bO = ((azh) (abyte0)).bV & ~a.bl;
	// 1766 3298:aload_1         
	// 1767 3299:aload_1         
	// 1768 3300:getfield        #174 <Field int azh.bV>
	// 1769 3303:aload_0         
	// 1770 3304:getfield        #12  <Field azh a>
	// 1771 3307:getfield        #165 <Field int azh.bl>
	// 1772 3310:iconst_m1       
	// 1773 3311:ixor            
	// 1774 3312:iand            
	// 1775 3313:putfield        #138 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 1776 3316:aload_0         
	// 1777 3317:getfield        #12  <Field azh a>
	// 1778 3320:astore_1        
		abyte0.bO = ((azh) (abyte0)).aw ^ a.bO;
	// 1779 3321:aload_1         
	// 1780 3322:aload_1         
	// 1781 3323:getfield        #177 <Field int azh.aw>
	// 1782 3326:aload_0         
	// 1783 3327:getfield        #12  <Field azh a>
	// 1784 3330:getfield        #138 <Field int azh.bO>
	// 1785 3333:ixor            
	// 1786 3334:putfield        #138 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 1787 3337:aload_0         
	// 1788 3338:getfield        #12  <Field azh a>
	// 1789 3341:astore_1        
		abyte0.bh = ((azh) (abyte0)).bO ^ a.bh;
	// 1790 3342:aload_1         
	// 1791 3343:aload_1         
	// 1792 3344:getfield        #138 <Field int azh.bO>
	// 1793 3347:aload_0         
	// 1794 3348:getfield        #12  <Field azh a>
	// 1795 3351:getfield        #111 <Field int azh.bh>
	// 1796 3354:ixor            
	// 1797 3355:putfield        #111 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 1798 3358:aload_0         
	// 1799 3359:getfield        #12  <Field azh a>
	// 1800 3362:astore_1        
		abyte0.bH = ((azh) (abyte0)).bO ^ a.bH;
	// 1801 3363:aload_1         
	// 1802 3364:aload_1         
	// 1803 3365:getfield        #138 <Field int azh.bO>
	// 1804 3368:aload_0         
	// 1805 3369:getfield        #12  <Field azh a>
	// 1806 3372:getfield        #168 <Field int azh.bH>
	// 1807 3375:ixor            
	// 1808 3376:putfield        #168 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 1809 3379:aload_0         
	// 1810 3380:getfield        #12  <Field azh a>
	// 1811 3383:astore_1        
		abyte0.bV = ((azh) (abyte0)).bV & ~a.bl;
	// 1812 3384:aload_1         
	// 1813 3385:aload_1         
	// 1814 3386:getfield        #174 <Field int azh.bV>
	// 1815 3389:aload_0         
	// 1816 3390:getfield        #12  <Field azh a>
	// 1817 3393:getfield        #165 <Field int azh.bl>
	// 1818 3396:iconst_m1       
	// 1819 3397:ixor            
	// 1820 3398:iand            
	// 1821 3399:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 1822 3402:aload_0         
	// 1823 3403:getfield        #12  <Field azh a>
	// 1824 3406:astore_1        
		abyte0.bV = ((azh) (abyte0)).j ^ a.bV;
	// 1825 3407:aload_1         
	// 1826 3408:aload_1         
	// 1827 3409:getfield        #159 <Field int azh.j>
	// 1828 3412:aload_0         
	// 1829 3413:getfield        #12  <Field azh a>
	// 1830 3416:getfield        #174 <Field int azh.bV>
	// 1831 3419:ixor            
	// 1832 3420:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 1833 3423:aload_0         
	// 1834 3424:getfield        #12  <Field azh a>
	// 1835 3427:astore_1        
		abyte0.cc = ((azh) (abyte0)).bV ^ a.cc;
	// 1836 3428:aload_1         
	// 1837 3429:aload_1         
	// 1838 3430:getfield        #174 <Field int azh.bV>
	// 1839 3433:aload_0         
	// 1840 3434:getfield        #12  <Field azh a>
	// 1841 3437:getfield        #192 <Field int azh.cc>
	// 1842 3440:ixor            
	// 1843 3441:putfield        #192 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 1844 3444:aload_0         
	// 1845 3445:getfield        #12  <Field azh a>
	// 1846 3448:astore_1        
		abyte0.bV = ((azh) (abyte0)).j ^ a.bl;
	// 1847 3449:aload_1         
	// 1848 3450:aload_1         
	// 1849 3451:getfield        #159 <Field int azh.j>
	// 1850 3454:aload_0         
	// 1851 3455:getfield        #12  <Field azh a>
	// 1852 3458:getfield        #165 <Field int azh.bl>
	// 1853 3461:ixor            
	// 1854 3462:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 1855 3465:aload_0         
	// 1856 3466:getfield        #12  <Field azh a>
	// 1857 3469:astore_1        
		abyte0.bV = ((azh) (abyte0)).aL | a.bV;
	// 1858 3470:aload_1         
	// 1859 3471:aload_1         
	// 1860 3472:getfield        #171 <Field int azh.aL>
	// 1861 3475:aload_0         
	// 1862 3476:getfield        #12  <Field azh a>
	// 1863 3479:getfield        #174 <Field int azh.bV>
	// 1864 3482:ior             
	// 1865 3483:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 1866 3486:aload_0         
	// 1867 3487:getfield        #12  <Field azh a>
	// 1868 3490:astore_1        
		abyte0.bV = ((azh) (abyte0)).bX ^ a.bV;
	// 1869 3491:aload_1         
	// 1870 3492:aload_1         
	// 1871 3493:getfield        #120 <Field int azh.bX>
	// 1872 3496:aload_0         
	// 1873 3497:getfield        #12  <Field azh a>
	// 1874 3500:getfield        #174 <Field int azh.bV>
	// 1875 3503:ixor            
	// 1876 3504:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 1877 3507:aload_0         
	// 1878 3508:getfield        #12  <Field azh a>
	// 1879 3511:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bR ^ a.aQ;
	// 1880 3512:aload_1         
	// 1881 3513:aload_1         
	// 1882 3514:getfield        #135 <Field int azh.bR>
	// 1883 3517:aload_0         
	// 1884 3518:getfield        #12  <Field azh a>
	// 1885 3521:getfield        #52  <Field int azh.aQ>
	// 1886 3524:ixor            
	// 1887 3525:putfield        #52  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 1888 3528:aload_0         
	// 1889 3529:getfield        #12  <Field azh a>
	// 1890 3532:astore_1        
		abyte0.aQ = ((azh) (abyte0)).ac & a.aQ;
	// 1891 3533:aload_1         
	// 1892 3534:aload_1         
	// 1893 3535:getfield        #84  <Field int azh.ac>
	// 1894 3538:aload_0         
	// 1895 3539:getfield        #12  <Field azh a>
	// 1896 3542:getfield        #52  <Field int azh.aQ>
	// 1897 3545:iand            
	// 1898 3546:putfield        #52  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 1899 3549:aload_0         
	// 1900 3550:getfield        #12  <Field azh a>
	// 1901 3553:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aS ^ a.aQ;
	// 1902 3554:aload_1         
	// 1903 3555:aload_1         
	// 1904 3556:getfield        #58  <Field int azh.aS>
	// 1905 3559:aload_0         
	// 1906 3560:getfield        #12  <Field azh a>
	// 1907 3563:getfield        #52  <Field int azh.aQ>
	// 1908 3566:ixor            
	// 1909 3567:putfield        #52  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 1910 3570:aload_0         
	// 1911 3571:getfield        #12  <Field azh a>
	// 1912 3574:astore_1        
		abyte0.ap = ((azh) (abyte0)).aQ ^ a.ap;
	// 1913 3575:aload_1         
	// 1914 3576:aload_1         
	// 1915 3577:getfield        #52  <Field int azh.aQ>
	// 1916 3580:aload_0         
	// 1917 3581:getfield        #12  <Field azh a>
	// 1918 3584:getfield        #26  <Field int azh.ap>
	// 1919 3587:ixor            
	// 1920 3588:putfield        #26  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 1921 3591:aload_0         
	// 1922 3592:getfield        #12  <Field azh a>
	// 1923 3595:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bw ^ a.E;
	// 1924 3596:aload_1         
	// 1925 3597:aload_1         
	// 1926 3598:getfield        #195 <Field int azh.bw>
	// 1927 3601:aload_0         
	// 1928 3602:getfield        #12  <Field azh a>
	// 1929 3605:getfield        #76  <Field int azh.E>
	// 1930 3608:ixor            
	// 1931 3609:putfield        #52  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 1932 3612:aload_0         
	// 1933 3613:getfield        #12  <Field azh a>
	// 1934 3616:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aQ & ~a.M;
	// 1935 3617:aload_1         
	// 1936 3618:aload_1         
	// 1937 3619:getfield        #52  <Field int azh.aQ>
	// 1938 3622:aload_0         
	// 1939 3623:getfield        #12  <Field azh a>
	// 1940 3626:getfield        #93  <Field int azh.M>
	// 1941 3629:iconst_m1       
	// 1942 3630:ixor            
	// 1943 3631:iand            
	// 1944 3632:putfield        #52  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 1945 3635:aload_0         
	// 1946 3636:getfield        #12  <Field azh a>
	// 1947 3639:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bw ^ a.aQ;
	// 1948 3640:aload_1         
	// 1949 3641:aload_1         
	// 1950 3642:getfield        #195 <Field int azh.bw>
	// 1951 3645:aload_0         
	// 1952 3646:getfield        #12  <Field azh a>
	// 1953 3649:getfield        #52  <Field int azh.aQ>
	// 1954 3652:ixor            
	// 1955 3653:putfield        #52  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 1956 3656:aload_0         
	// 1957 3657:getfield        #12  <Field azh a>
	// 1958 3660:astore_1        
		abyte0.aQ = ((azh) (abyte0)).g | a.aQ;
	// 1959 3661:aload_1         
	// 1960 3662:aload_1         
	// 1961 3663:getfield        #99  <Field int azh.g>
	// 1962 3666:aload_0         
	// 1963 3667:getfield        #12  <Field azh a>
	// 1964 3670:getfield        #52  <Field int azh.aQ>
	// 1965 3673:ior             
	// 1966 3674:putfield        #52  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 1967 3677:aload_0         
	// 1968 3678:getfield        #12  <Field azh a>
	// 1969 3681:astore_1        
		abyte0.bw = ((azh) (abyte0)).ai & ~a.E;
	// 1970 3682:aload_1         
	// 1971 3683:aload_1         
	// 1972 3684:getfield        #129 <Field int azh.ai>
	// 1973 3687:aload_0         
	// 1974 3688:getfield        #12  <Field azh a>
	// 1975 3691:getfield        #76  <Field int azh.E>
	// 1976 3694:iconst_m1       
	// 1977 3695:ixor            
	// 1978 3696:iand            
	// 1979 3697:putfield        #195 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 1980 3700:aload_0         
	// 1981 3701:getfield        #12  <Field azh a>
	// 1982 3704:astore_1        
		abyte0.an = ((azh) (abyte0)).bw ^ a.an;
	// 1983 3705:aload_1         
	// 1984 3706:aload_1         
	// 1985 3707:getfield        #195 <Field int azh.bw>
	// 1986 3710:aload_0         
	// 1987 3711:getfield        #12  <Field azh a>
	// 1988 3714:getfield        #198 <Field int azh.an>
	// 1989 3717:ixor            
	// 1990 3718:putfield        #198 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 1991 3721:aload_0         
	// 1992 3722:getfield        #12  <Field azh a>
	// 1993 3725:astore_1        
		abyte0.an = ((azh) (abyte0)).g | a.an;
	// 1994 3726:aload_1         
	// 1995 3727:aload_1         
	// 1996 3728:getfield        #99  <Field int azh.g>
	// 1997 3731:aload_0         
	// 1998 3732:getfield        #12  <Field azh a>
	// 1999 3735:getfield        #198 <Field int azh.an>
	// 2000 3738:ior             
	// 2001 3739:putfield        #198 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 2002 3742:aload_0         
	// 2003 3743:getfield        #12  <Field azh a>
	// 2004 3746:astore_1        
		abyte0.aS = ((azh) (abyte0)).bw & a.M;
	// 2005 3747:aload_1         
	// 2006 3748:aload_1         
	// 2007 3749:getfield        #195 <Field int azh.bw>
	// 2008 3752:aload_0         
	// 2009 3753:getfield        #12  <Field azh a>
	// 2010 3756:getfield        #93  <Field int azh.M>
	// 2011 3759:iand            
	// 2012 3760:putfield        #58  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 2013 3763:aload_0         
	// 2014 3764:getfield        #12  <Field azh a>
	// 2015 3767:astore_1        
		abyte0.aS = ((azh) (abyte0)).ch ^ a.aS;
	// 2016 3768:aload_1         
	// 2017 3769:aload_1         
	// 2018 3770:getfield        #90  <Field int azh.ch>
	// 2019 3773:aload_0         
	// 2020 3774:getfield        #12  <Field azh a>
	// 2021 3777:getfield        #58  <Field int azh.aS>
	// 2022 3780:ixor            
	// 2023 3781:putfield        #58  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 2024 3784:aload_0         
	// 2025 3785:getfield        #12  <Field azh a>
	// 2026 3788:astore_1        
		abyte0.aS = ((azh) (abyte0)).g | a.aS;
	// 2027 3789:aload_1         
	// 2028 3790:aload_1         
	// 2029 3791:getfield        #99  <Field int azh.g>
	// 2030 3794:aload_0         
	// 2031 3795:getfield        #12  <Field azh a>
	// 2032 3798:getfield        #58  <Field int azh.aS>
	// 2033 3801:ior             
	// 2034 3802:putfield        #58  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 2035 3805:aload_0         
	// 2036 3806:getfield        #12  <Field azh a>
	// 2037 3809:astore_1        
		abyte0.aS = ((azh) (abyte0)).bw ^ a.aS;
	// 2038 3810:aload_1         
	// 2039 3811:aload_1         
	// 2040 3812:getfield        #195 <Field int azh.bw>
	// 2041 3815:aload_0         
	// 2042 3816:getfield        #12  <Field azh a>
	// 2043 3819:getfield        #58  <Field int azh.aS>
	// 2044 3822:ixor            
	// 2045 3823:putfield        #58  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 2046 3826:aload_0         
	// 2047 3827:getfield        #12  <Field azh a>
	// 2048 3830:astore_1        
		abyte0.aS = ((azh) (abyte0)).o & a.aS;
	// 2049 3831:aload_1         
	// 2050 3832:aload_1         
	// 2051 3833:getfield        #132 <Field int azh.o>
	// 2052 3836:aload_0         
	// 2053 3837:getfield        #12  <Field azh a>
	// 2054 3840:getfield        #58  <Field int azh.aS>
	// 2055 3843:iand            
	// 2056 3844:putfield        #58  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 2057 3847:aload_0         
	// 2058 3848:getfield        #12  <Field azh a>
	// 2059 3851:astore_1        
		abyte0.aS = ((azh) (abyte0)).bJ ^ a.aS;
	// 2060 3852:aload_1         
	// 2061 3853:aload_1         
	// 2062 3854:getfield        #31  <Field int azh.bJ>
	// 2063 3857:aload_0         
	// 2064 3858:getfield        #12  <Field azh a>
	// 2065 3861:getfield        #58  <Field int azh.aS>
	// 2066 3864:ixor            
	// 2067 3865:putfield        #58  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 2068 3868:aload_0         
	// 2069 3869:getfield        #12  <Field azh a>
	// 2070 3872:astore_1        
		abyte0.aS = ((azh) (abyte0)).aS ^ a.H;
	// 2071 3873:aload_1         
	// 2072 3874:aload_1         
	// 2073 3875:getfield        #58  <Field int azh.aS>
	// 2074 3878:aload_0         
	// 2075 3879:getfield        #12  <Field azh a>
	// 2076 3882:getfield        #201 <Field int azh.H>
	// 2077 3885:ixor            
	// 2078 3886:putfield        #58  <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 2079 3889:aload_0         
	// 2080 3890:getfield        #12  <Field azh a>
	// 2081 3893:astore_1        
		abyte0.ci = ((azh) (abyte0)).ci & ~a.aS;
	// 2082 3894:aload_1         
	// 2083 3895:aload_1         
	// 2084 3896:getfield        #186 <Field int azh.ci>
	// 2085 3899:aload_0         
	// 2086 3900:getfield        #12  <Field azh a>
	// 2087 3903:getfield        #58  <Field int azh.aS>
	// 2088 3906:iconst_m1       
	// 2089 3907:ixor            
	// 2090 3908:iand            
	// 2091 3909:putfield        #186 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 2092 3912:aload_0         
	// 2093 3913:getfield        #12  <Field azh a>
	// 2094 3916:astore_1        
		abyte0.ci = ((azh) (abyte0)).bH ^ a.ci;
	// 2095 3917:aload_1         
	// 2096 3918:aload_1         
	// 2097 3919:getfield        #168 <Field int azh.bH>
	// 2098 3922:aload_0         
	// 2099 3923:getfield        #12  <Field azh a>
	// 2100 3926:getfield        #186 <Field int azh.ci>
	// 2101 3929:ixor            
	// 2102 3930:putfield        #186 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 2103 3933:aload_0         
	// 2104 3934:getfield        #12  <Field azh a>
	// 2105 3937:astore_1        
		abyte0.bH = ((azh) (abyte0)).aS & ~a.P;
	// 2106 3938:aload_1         
	// 2107 3939:aload_1         
	// 2108 3940:getfield        #58  <Field int azh.aS>
	// 2109 3943:aload_0         
	// 2110 3944:getfield        #12  <Field azh a>
	// 2111 3947:getfield        #204 <Field int azh.P>
	// 2112 3950:iconst_m1       
	// 2113 3951:ixor            
	// 2114 3952:iand            
	// 2115 3953:putfield        #168 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 2116 3956:aload_0         
	// 2117 3957:getfield        #12  <Field azh a>
	// 2118 3960:astore_1        
		abyte0.bJ = ((azh) (abyte0)).af & a.bH;
	// 2119 3961:aload_1         
	// 2120 3962:aload_1         
	// 2121 3963:getfield        #207 <Field int azh.af>
	// 2122 3966:aload_0         
	// 2123 3967:getfield        #12  <Field azh a>
	// 2124 3970:getfield        #168 <Field int azh.bH>
	// 2125 3973:iand            
	// 2126 3974:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 2127 3977:aload_0         
	// 2128 3978:getfield        #12  <Field azh a>
	// 2129 3981:astore_1        
		abyte0.bH = ((azh) (abyte0)).bH ^ a.af;
	// 2130 3982:aload_1         
	// 2131 3983:aload_1         
	// 2132 3984:getfield        #168 <Field int azh.bH>
	// 2133 3987:aload_0         
	// 2134 3988:getfield        #12  <Field azh a>
	// 2135 3991:getfield        #207 <Field int azh.af>
	// 2136 3994:ixor            
	// 2137 3995:putfield        #168 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 2138 3998:aload_0         
	// 2139 3999:getfield        #12  <Field azh a>
	// 2140 4002:astore_1        
		abyte0.n = ((azh) (abyte0)).bH ^ a.n;
	// 2141 4003:aload_1         
	// 2142 4004:aload_1         
	// 2143 4005:getfield        #168 <Field int azh.bH>
	// 2144 4008:aload_0         
	// 2145 4009:getfield        #12  <Field azh a>
	// 2146 4012:getfield        #210 <Field int azh.n>
	// 2147 4015:ixor            
	// 2148 4016:putfield        #210 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 2149 4019:aload_0         
	// 2150 4020:getfield        #12  <Field azh a>
	// 2151 4023:astore_1        
		abyte0.cc = ((azh) (abyte0)).cc | a.aS;
	// 2152 4024:aload_1         
	// 2153 4025:aload_1         
	// 2154 4026:getfield        #192 <Field int azh.cc>
	// 2155 4029:aload_0         
	// 2156 4030:getfield        #12  <Field azh a>
	// 2157 4033:getfield        #58  <Field int azh.aS>
	// 2158 4036:ior             
	// 2159 4037:putfield        #192 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 2160 4040:aload_0         
	// 2161 4041:getfield        #12  <Field azh a>
	// 2162 4044:astore_1        
		abyte0.bH = ((azh) (abyte0)).P | a.aS;
	// 2163 4045:aload_1         
	// 2164 4046:aload_1         
	// 2165 4047:getfield        #204 <Field int azh.P>
	// 2166 4050:aload_0         
	// 2167 4051:getfield        #12  <Field azh a>
	// 2168 4054:getfield        #58  <Field int azh.aS>
	// 2169 4057:ior             
	// 2170 4058:putfield        #168 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 2171 4061:aload_0         
	// 2172 4062:getfield        #12  <Field azh a>
	// 2173 4065:astore_1        
		abyte0.bw = ((azh) (abyte0)).af & ~a.bH;
	// 2174 4066:aload_1         
	// 2175 4067:aload_1         
	// 2176 4068:getfield        #207 <Field int azh.af>
	// 2177 4071:aload_0         
	// 2178 4072:getfield        #12  <Field azh a>
	// 2179 4075:getfield        #168 <Field int azh.bH>
	// 2180 4078:iconst_m1       
	// 2181 4079:ixor            
	// 2182 4080:iand            
	// 2183 4081:putfield        #195 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 2184 4084:aload_0         
	// 2185 4085:getfield        #12  <Field azh a>
	// 2186 4088:astore_1        
		abyte0.bw = ((azh) (abyte0)).aS ^ a.bw;
	// 2187 4089:aload_1         
	// 2188 4090:aload_1         
	// 2189 4091:getfield        #58  <Field int azh.aS>
	// 2190 4094:aload_0         
	// 2191 4095:getfield        #12  <Field azh a>
	// 2192 4098:getfield        #195 <Field int azh.bw>
	// 2193 4101:ixor            
	// 2194 4102:putfield        #195 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 2195 4105:aload_0         
	// 2196 4106:getfield        #12  <Field azh a>
	// 2197 4109:astore_1        
		abyte0.bw = ((azh) (abyte0)).bw & a.d;
	// 2198 4110:aload_1         
	// 2199 4111:aload_1         
	// 2200 4112:getfield        #195 <Field int azh.bw>
	// 2201 4115:aload_0         
	// 2202 4116:getfield        #12  <Field azh a>
	// 2203 4119:getfield        #213 <Field int azh.d>
	// 2204 4122:iand            
	// 2205 4123:putfield        #195 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 2206 4126:aload_0         
	// 2207 4127:getfield        #12  <Field azh a>
	// 2208 4130:astore_1        
		abyte0.ch = ((azh) (abyte0)).af & a.bH;
	// 2209 4131:aload_1         
	// 2210 4132:aload_1         
	// 2211 4133:getfield        #207 <Field int azh.af>
	// 2212 4136:aload_0         
	// 2213 4137:getfield        #12  <Field azh a>
	// 2214 4140:getfield        #168 <Field int azh.bH>
	// 2215 4143:iand            
	// 2216 4144:putfield        #90  <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 2217 4147:aload_0         
	// 2218 4148:getfield        #12  <Field azh a>
	// 2219 4151:astore_1        
		abyte0.bR = ((azh) (abyte0)).af & ~a.bH;
	// 2220 4152:aload_1         
	// 2221 4153:aload_1         
	// 2222 4154:getfield        #207 <Field int azh.af>
	// 2223 4157:aload_0         
	// 2224 4158:getfield        #12  <Field azh a>
	// 2225 4161:getfield        #168 <Field int azh.bH>
	// 2226 4164:iconst_m1       
	// 2227 4165:ixor            
	// 2228 4166:iand            
	// 2229 4167:putfield        #135 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 2230 4170:aload_0         
	// 2231 4171:getfield        #12  <Field azh a>
	// 2232 4174:astore_1        
		abyte0.bX = ((azh) (abyte0)).d & ~a.bR;
	// 2233 4175:aload_1         
	// 2234 4176:aload_1         
	// 2235 4177:getfield        #213 <Field int azh.d>
	// 2236 4180:aload_0         
	// 2237 4181:getfield        #12  <Field azh a>
	// 2238 4184:getfield        #135 <Field int azh.bR>
	// 2239 4187:iconst_m1       
	// 2240 4188:ixor            
	// 2241 4189:iand            
	// 2242 4190:putfield        #120 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 2243 4193:aload_0         
	// 2244 4194:getfield        #12  <Field azh a>
	// 2245 4197:astore_1        
		abyte0.bX = ((azh) (abyte0)).by ^ a.bX;
	// 2246 4198:aload_1         
	// 2247 4199:aload_1         
	// 2248 4200:getfield        #216 <Field int azh.by>
	// 2249 4203:aload_0         
	// 2250 4204:getfield        #12  <Field azh a>
	// 2251 4207:getfield        #120 <Field int azh.bX>
	// 2252 4210:ixor            
	// 2253 4211:putfield        #120 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 2254 4214:aload_0         
	// 2255 4215:getfield        #12  <Field azh a>
	// 2256 4218:astore_1        
		abyte0.by = ((azh) (abyte0)).bH & ~a.aS;
	// 2257 4219:aload_1         
	// 2258 4220:aload_1         
	// 2259 4221:getfield        #168 <Field int azh.bH>
	// 2260 4224:aload_0         
	// 2261 4225:getfield        #12  <Field azh a>
	// 2262 4228:getfield        #58  <Field int azh.aS>
	// 2263 4231:iconst_m1       
	// 2264 4232:ixor            
	// 2265 4233:iand            
	// 2266 4234:putfield        #216 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 2267 4237:aload_0         
	// 2268 4238:getfield        #12  <Field azh a>
	// 2269 4241:astore_1        
		abyte0.bO = ((azh) (abyte0)).bH ^ a.af;
	// 2270 4242:aload_1         
	// 2271 4243:aload_1         
	// 2272 4244:getfield        #168 <Field int azh.bH>
	// 2273 4247:aload_0         
	// 2274 4248:getfield        #12  <Field azh a>
	// 2275 4251:getfield        #207 <Field int azh.af>
	// 2276 4254:ixor            
	// 2277 4255:putfield        #138 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 2278 4258:aload_0         
	// 2279 4259:getfield        #12  <Field azh a>
	// 2280 4262:astore_1        
		abyte0.aw = ((azh) (abyte0)).d | a.bO;
	// 2281 4263:aload_1         
	// 2282 4264:aload_1         
	// 2283 4265:getfield        #213 <Field int azh.d>
	// 2284 4268:aload_0         
	// 2285 4269:getfield        #12  <Field azh a>
	// 2286 4272:getfield        #138 <Field int azh.bO>
	// 2287 4275:ior             
	// 2288 4276:putfield        #177 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 2289 4279:aload_0         
	// 2290 4280:getfield        #12  <Field azh a>
	// 2291 4283:astore_1        
		abyte0.bB = ((azh) (abyte0)).bH ^ a.bB;
	// 2292 4284:aload_1         
	// 2293 4285:aload_1         
	// 2294 4286:getfield        #168 <Field int azh.bH>
	// 2295 4289:aload_0         
	// 2296 4290:getfield        #12  <Field azh a>
	// 2297 4293:getfield        #219 <Field int azh.bB>
	// 2298 4296:ixor            
	// 2299 4297:putfield        #219 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 2300 4300:aload_0         
	// 2301 4301:getfield        #12  <Field azh a>
	// 2302 4304:astore_1        
		abyte0.bw = ((azh) (abyte0)).bB ^ a.bw;
	// 2303 4305:aload_1         
	// 2304 4306:aload_1         
	// 2305 4307:getfield        #219 <Field int azh.bB>
	// 2306 4310:aload_0         
	// 2307 4311:getfield        #12  <Field azh a>
	// 2308 4314:getfield        #195 <Field int azh.bw>
	// 2309 4317:ixor            
	// 2310 4318:putfield        #195 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 2311 4321:aload_0         
	// 2312 4322:getfield        #12  <Field azh a>
	// 2313 4325:astore_1        
		abyte0.bB = ((azh) (abyte0)).aS & a.P;
	// 2314 4326:aload_1         
	// 2315 4327:aload_1         
	// 2316 4328:getfield        #58  <Field int azh.aS>
	// 2317 4331:aload_0         
	// 2318 4332:getfield        #12  <Field azh a>
	// 2319 4335:getfield        #204 <Field int azh.P>
	// 2320 4338:iand            
	// 2321 4339:putfield        #219 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 2322 4342:aload_0         
	// 2323 4343:getfield        #12  <Field azh a>
	// 2324 4346:astore_1        
		abyte0.aV = ((azh) (abyte0)).d | a.bB;
	// 2325 4347:aload_1         
	// 2326 4348:aload_1         
	// 2327 4349:getfield        #213 <Field int azh.d>
	// 2328 4352:aload_0         
	// 2329 4353:getfield        #12  <Field azh a>
	// 2330 4356:getfield        #219 <Field int azh.bB>
	// 2331 4359:ior             
	// 2332 4360:putfield        #126 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 2333 4363:aload_0         
	// 2334 4364:getfield        #12  <Field azh a>
	// 2335 4367:astore_1        
		abyte0.aW = ((azh) (abyte0)).bB ^ a.af;
	// 2336 4368:aload_1         
	// 2337 4369:aload_1         
	// 2338 4370:getfield        #219 <Field int azh.bB>
	// 2339 4373:aload_0         
	// 2340 4374:getfield        #12  <Field azh a>
	// 2341 4377:getfield        #207 <Field int azh.af>
	// 2342 4380:ixor            
	// 2343 4381:putfield        #222 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 2344 4384:aload_0         
	// 2345 4385:getfield        #12  <Field azh a>
	// 2346 4388:astore_1        
		abyte0.aW = ((azh) (abyte0)).aW ^ a.d;
	// 2347 4389:aload_1         
	// 2348 4390:aload_1         
	// 2349 4391:getfield        #222 <Field int azh.aW>
	// 2350 4394:aload_0         
	// 2351 4395:getfield        #12  <Field azh a>
	// 2352 4398:getfield        #213 <Field int azh.d>
	// 2353 4401:ixor            
	// 2354 4402:putfield        #222 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 2355 4405:aload_0         
	// 2356 4406:getfield        #12  <Field azh a>
	// 2357 4409:astore_1        
		abyte0.bI = ((azh) (abyte0)).aS & ~a.bB;
	// 2358 4410:aload_1         
	// 2359 4411:aload_1         
	// 2360 4412:getfield        #58  <Field int azh.aS>
	// 2361 4415:aload_0         
	// 2362 4416:getfield        #12  <Field azh a>
	// 2363 4419:getfield        #219 <Field int azh.bB>
	// 2364 4422:iconst_m1       
	// 2365 4423:ixor            
	// 2366 4424:iand            
	// 2367 4425:putfield        #225 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 2368 4428:aload_0         
	// 2369 4429:getfield        #12  <Field azh a>
	// 2370 4432:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bI ^ a.bJ;
	// 2371 4433:aload_1         
	// 2372 4434:aload_1         
	// 2373 4435:getfield        #225 <Field int azh.bI>
	// 2374 4438:aload_0         
	// 2375 4439:getfield        #12  <Field azh a>
	// 2376 4442:getfield        #31  <Field int azh.bJ>
	// 2377 4445:ixor            
	// 2378 4446:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 2379 4449:aload_0         
	// 2380 4450:getfield        #12  <Field azh a>
	// 2381 4453:astore_1        
		abyte0.au = ((azh) (abyte0)).bI ^ a.au;
	// 2382 4454:aload_1         
	// 2383 4455:aload_1         
	// 2384 4456:getfield        #225 <Field int azh.bI>
	// 2385 4459:aload_0         
	// 2386 4460:getfield        #12  <Field azh a>
	// 2387 4463:getfield        #228 <Field int azh.au>
	// 2388 4466:ixor            
	// 2389 4467:putfield        #228 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 2390 4470:aload_0         
	// 2391 4471:getfield        #12  <Field azh a>
	// 2392 4474:astore_1        
		abyte0.au = ((azh) (abyte0)).d | a.au;
	// 2393 4475:aload_1         
	// 2394 4476:aload_1         
	// 2395 4477:getfield        #213 <Field int azh.d>
	// 2396 4480:aload_0         
	// 2397 4481:getfield        #12  <Field azh a>
	// 2398 4484:getfield        #228 <Field int azh.au>
	// 2399 4487:ior             
	// 2400 4488:putfield        #228 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 2401 4491:aload_0         
	// 2402 4492:getfield        #12  <Field azh a>
	// 2403 4495:astore_1        
		abyte0.au = ((azh) (abyte0)).af ^ a.au;
	// 2404 4496:aload_1         
	// 2405 4497:aload_1         
	// 2406 4498:getfield        #207 <Field int azh.af>
	// 2407 4501:aload_0         
	// 2408 4502:getfield        #12  <Field azh a>
	// 2409 4505:getfield        #228 <Field int azh.au>
	// 2410 4508:ixor            
	// 2411 4509:putfield        #228 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 2412 4512:aload_0         
	// 2413 4513:getfield        #12  <Field azh a>
	// 2414 4516:astore_1        
		abyte0.bU = ((azh) (abyte0)).bI ^ a.bU;
	// 2415 4517:aload_1         
	// 2416 4518:aload_1         
	// 2417 4519:getfield        #225 <Field int azh.bI>
	// 2418 4522:aload_0         
	// 2419 4523:getfield        #12  <Field azh a>
	// 2420 4526:getfield        #231 <Field int azh.bU>
	// 2421 4529:ixor            
	// 2422 4530:putfield        #231 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 2423 4533:aload_0         
	// 2424 4534:getfield        #12  <Field azh a>
	// 2425 4537:astore_1        
		abyte0.bI = ((azh) (abyte0)).d & ~a.bU;
	// 2426 4538:aload_1         
	// 2427 4539:aload_1         
	// 2428 4540:getfield        #213 <Field int azh.d>
	// 2429 4543:aload_0         
	// 2430 4544:getfield        #12  <Field azh a>
	// 2431 4547:getfield        #231 <Field int azh.bU>
	// 2432 4550:iconst_m1       
	// 2433 4551:ixor            
	// 2434 4552:iand            
	// 2435 4553:putfield        #225 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 2436 4556:aload_0         
	// 2437 4557:getfield        #12  <Field azh a>
	// 2438 4560:astore_1        
		abyte0.bc = ((azh) (abyte0)).P ^ a.aS;
	// 2439 4561:aload_1         
	// 2440 4562:aload_1         
	// 2441 4563:getfield        #204 <Field int azh.P>
	// 2442 4566:aload_0         
	// 2443 4567:getfield        #12  <Field azh a>
	// 2444 4570:getfield        #58  <Field int azh.aS>
	// 2445 4573:ixor            
	// 2446 4574:putfield        #234 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 2447 4577:aload_0         
	// 2448 4578:getfield        #12  <Field azh a>
	// 2449 4581:astore_1        
		abyte0.ch = ((azh) (abyte0)).bc ^ a.ch;
	// 2450 4582:aload_1         
	// 2451 4583:aload_1         
	// 2452 4584:getfield        #234 <Field int azh.bc>
	// 2453 4587:aload_0         
	// 2454 4588:getfield        #12  <Field azh a>
	// 2455 4591:getfield        #90  <Field int azh.ch>
	// 2456 4594:ixor            
	// 2457 4595:putfield        #90  <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 2458 4598:aload_0         
	// 2459 4599:getfield        #12  <Field azh a>
	// 2460 4602:astore_1        
		abyte0.ch = ((azh) (abyte0)).d | a.ch;
	// 2461 4603:aload_1         
	// 2462 4604:aload_1         
	// 2463 4605:getfield        #213 <Field int azh.d>
	// 2464 4608:aload_0         
	// 2465 4609:getfield        #12  <Field azh a>
	// 2466 4612:getfield        #90  <Field int azh.ch>
	// 2467 4615:ior             
	// 2468 4616:putfield        #90  <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 2469 4619:aload_0         
	// 2470 4620:getfield        #12  <Field azh a>
	// 2471 4623:astore_1        
		abyte0.bZ = ((azh) (abyte0)).af & a.bc;
	// 2472 4624:aload_1         
	// 2473 4625:aload_1         
	// 2474 4626:getfield        #207 <Field int azh.af>
	// 2475 4629:aload_0         
	// 2476 4630:getfield        #12  <Field azh a>
	// 2477 4633:getfield        #234 <Field int azh.bc>
	// 2478 4636:iand            
	// 2479 4637:putfield        #237 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 2480 4640:aload_0         
	// 2481 4641:getfield        #12  <Field azh a>
	// 2482 4644:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bB ^ a.bZ;
	// 2483 4645:aload_1         
	// 2484 4646:aload_1         
	// 2485 4647:getfield        #219 <Field int azh.bB>
	// 2486 4650:aload_0         
	// 2487 4651:getfield        #12  <Field azh a>
	// 2488 4654:getfield        #237 <Field int azh.bZ>
	// 2489 4657:ixor            
	// 2490 4658:putfield        #237 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 2491 4661:aload_0         
	// 2492 4662:getfield        #12  <Field azh a>
	// 2493 4665:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bZ & ~a.d;
	// 2494 4666:aload_1         
	// 2495 4667:aload_1         
	// 2496 4668:getfield        #237 <Field int azh.bZ>
	// 2497 4671:aload_0         
	// 2498 4672:getfield        #12  <Field azh a>
	// 2499 4675:getfield        #213 <Field int azh.d>
	// 2500 4678:iconst_m1       
	// 2501 4679:ixor            
	// 2502 4680:iand            
	// 2503 4681:putfield        #237 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 2504 4684:aload_0         
	// 2505 4685:getfield        #12  <Field azh a>
	// 2506 4688:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bU ^ a.bZ;
	// 2507 4689:aload_1         
	// 2508 4690:aload_1         
	// 2509 4691:getfield        #231 <Field int azh.bU>
	// 2510 4694:aload_0         
	// 2511 4695:getfield        #12  <Field azh a>
	// 2512 4698:getfield        #237 <Field int azh.bZ>
	// 2513 4701:ixor            
	// 2514 4702:putfield        #237 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 2515 4705:aload_0         
	// 2516 4706:getfield        #12  <Field azh a>
	// 2517 4709:astore_1        
		abyte0.bU = ((azh) (abyte0)).af & a.bc;
	// 2518 4710:aload_1         
	// 2519 4711:aload_1         
	// 2520 4712:getfield        #207 <Field int azh.af>
	// 2521 4715:aload_0         
	// 2522 4716:getfield        #12  <Field azh a>
	// 2523 4719:getfield        #234 <Field int azh.bc>
	// 2524 4722:iand            
	// 2525 4723:putfield        #231 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 2526 4726:aload_0         
	// 2527 4727:getfield        #12  <Field azh a>
	// 2528 4730:astore_1        
		abyte0.bU = ((azh) (abyte0)).by ^ a.bU;
	// 2529 4731:aload_1         
	// 2530 4732:aload_1         
	// 2531 4733:getfield        #216 <Field int azh.by>
	// 2532 4736:aload_0         
	// 2533 4737:getfield        #12  <Field azh a>
	// 2534 4740:getfield        #231 <Field int azh.bU>
	// 2535 4743:ixor            
	// 2536 4744:putfield        #231 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 2537 4747:aload_0         
	// 2538 4748:getfield        #12  <Field azh a>
	// 2539 4751:astore_1        
		abyte0.bU = ((azh) (abyte0)).d & ~a.bU;
	// 2540 4752:aload_1         
	// 2541 4753:aload_1         
	// 2542 4754:getfield        #213 <Field int azh.d>
	// 2543 4757:aload_0         
	// 2544 4758:getfield        #12  <Field azh a>
	// 2545 4761:getfield        #231 <Field int azh.bU>
	// 2546 4764:iconst_m1       
	// 2547 4765:ixor            
	// 2548 4766:iand            
	// 2549 4767:putfield        #231 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 2550 4770:aload_0         
	// 2551 4771:getfield        #12  <Field azh a>
	// 2552 4774:astore_1        
		abyte0.bc = ((azh) (abyte0)).af & ~a.bc;
	// 2553 4775:aload_1         
	// 2554 4776:aload_1         
	// 2555 4777:getfield        #207 <Field int azh.af>
	// 2556 4780:aload_0         
	// 2557 4781:getfield        #12  <Field azh a>
	// 2558 4784:getfield        #234 <Field int azh.bc>
	// 2559 4787:iconst_m1       
	// 2560 4788:ixor            
	// 2561 4789:iand            
	// 2562 4790:putfield        #234 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 2563 4793:aload_0         
	// 2564 4794:getfield        #12  <Field azh a>
	// 2565 4797:astore_1        
		abyte0.bc = ((azh) (abyte0)).bH ^ a.bc;
	// 2566 4798:aload_1         
	// 2567 4799:aload_1         
	// 2568 4800:getfield        #168 <Field int azh.bH>
	// 2569 4803:aload_0         
	// 2570 4804:getfield        #12  <Field azh a>
	// 2571 4807:getfield        #234 <Field int azh.bc>
	// 2572 4810:ixor            
	// 2573 4811:putfield        #234 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 2574 4814:aload_0         
	// 2575 4815:getfield        #12  <Field azh a>
	// 2576 4818:astore_1        
		abyte0.bc = ((azh) (abyte0)).d | a.bc;
	// 2577 4819:aload_1         
	// 2578 4820:aload_1         
	// 2579 4821:getfield        #213 <Field int azh.d>
	// 2580 4824:aload_0         
	// 2581 4825:getfield        #12  <Field azh a>
	// 2582 4828:getfield        #234 <Field int azh.bc>
	// 2583 4831:ior             
	// 2584 4832:putfield        #234 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 2585 4835:aload_0         
	// 2586 4836:getfield        #12  <Field azh a>
	// 2587 4839:astore_1        
		abyte0.bc = ((azh) (abyte0)).bR ^ a.bc;
	// 2588 4840:aload_1         
	// 2589 4841:aload_1         
	// 2590 4842:getfield        #135 <Field int azh.bR>
	// 2591 4845:aload_0         
	// 2592 4846:getfield        #12  <Field azh a>
	// 2593 4849:getfield        #234 <Field int azh.bc>
	// 2594 4852:ixor            
	// 2595 4853:putfield        #234 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 2596 4856:aload_0         
	// 2597 4857:getfield        #12  <Field azh a>
	// 2598 4860:astore_1        
		abyte0.aB = ((azh) (abyte0)).aS ^ a.aB;
	// 2599 4861:aload_1         
	// 2600 4862:aload_1         
	// 2601 4863:getfield        #58  <Field int azh.aS>
	// 2602 4866:aload_0         
	// 2603 4867:getfield        #12  <Field azh a>
	// 2604 4870:getfield        #240 <Field int azh.aB>
	// 2605 4873:ixor            
	// 2606 4874:putfield        #240 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 2607 4877:aload_0         
	// 2608 4878:getfield        #12  <Field azh a>
	// 2609 4881:astore_1        
		abyte0.ch = ((azh) (abyte0)).aB ^ a.ch;
	// 2610 4882:aload_1         
	// 2611 4883:aload_1         
	// 2612 4884:getfield        #240 <Field int azh.aB>
	// 2613 4887:aload_0         
	// 2614 4888:getfield        #12  <Field azh a>
	// 2615 4891:getfield        #90  <Field int azh.ch>
	// 2616 4894:ixor            
	// 2617 4895:putfield        #90  <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 2618 4898:aload_0         
	// 2619 4899:getfield        #12  <Field azh a>
	// 2620 4902:astore_1        
		abyte0.bx = ((azh) (abyte0)).aB ^ a.bx;
	// 2621 4903:aload_1         
	// 2622 4904:aload_1         
	// 2623 4905:getfield        #240 <Field int azh.aB>
	// 2624 4908:aload_0         
	// 2625 4909:getfield        #12  <Field azh a>
	// 2626 4912:getfield        #243 <Field int azh.bx>
	// 2627 4915:ixor            
	// 2628 4916:putfield        #243 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 2629 4919:aload_0         
	// 2630 4920:getfield        #12  <Field azh a>
	// 2631 4923:astore_1        
		abyte0.bu = ((azh) (abyte0)).aS | a.bu;
	// 2632 4924:aload_1         
	// 2633 4925:aload_1         
	// 2634 4926:getfield        #58  <Field int azh.aS>
	// 2635 4929:aload_0         
	// 2636 4930:getfield        #12  <Field azh a>
	// 2637 4933:getfield        #180 <Field int azh.bu>
	// 2638 4936:ior             
	// 2639 4937:putfield        #180 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 2640 4940:aload_0         
	// 2641 4941:getfield        #12  <Field azh a>
	// 2642 4944:astore_1        
		abyte0.bu = ((azh) (abyte0)).ao ^ a.bu;
	// 2643 4945:aload_1         
	// 2644 4946:aload_1         
	// 2645 4947:getfield        #141 <Field int azh.ao>
	// 2646 4950:aload_0         
	// 2647 4951:getfield        #12  <Field azh a>
	// 2648 4954:getfield        #180 <Field int azh.bu>
	// 2649 4957:ixor            
	// 2650 4958:putfield        #180 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 2651 4961:aload_0         
	// 2652 4962:getfield        #12  <Field azh a>
	// 2653 4965:astore_1        
		abyte0.ao = ((azh) (abyte0)).d & ~a.aS;
	// 2654 4966:aload_1         
	// 2655 4967:aload_1         
	// 2656 4968:getfield        #213 <Field int azh.d>
	// 2657 4971:aload_0         
	// 2658 4972:getfield        #12  <Field azh a>
	// 2659 4975:getfield        #58  <Field int azh.aS>
	// 2660 4978:iconst_m1       
	// 2661 4979:ixor            
	// 2662 4980:iand            
	// 2663 4981:putfield        #141 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 2664 4984:aload_0         
	// 2665 4985:getfield        #12  <Field azh a>
	// 2666 4988:astore_1        
		abyte0.ao = ((azh) (abyte0)).bJ ^ a.ao;
	// 2667 4989:aload_1         
	// 2668 4990:aload_1         
	// 2669 4991:getfield        #31  <Field int azh.bJ>
	// 2670 4994:aload_0         
	// 2671 4995:getfield        #12  <Field azh a>
	// 2672 4998:getfield        #141 <Field int azh.ao>
	// 2673 5001:ixor            
	// 2674 5002:putfield        #141 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 2675 5005:aload_0         
	// 2676 5006:getfield        #12  <Field azh a>
	// 2677 5009:astore_1        
		abyte0.s = ((azh) (abyte0)).s & ~a.aS;
	// 2678 5010:aload_1         
	// 2679 5011:aload_1         
	// 2680 5012:getfield        #117 <Field int azh.s>
	// 2681 5015:aload_0         
	// 2682 5016:getfield        #12  <Field azh a>
	// 2683 5019:getfield        #58  <Field int azh.aS>
	// 2684 5022:iconst_m1       
	// 2685 5023:ixor            
	// 2686 5024:iand            
	// 2687 5025:putfield        #117 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 2688 5028:aload_0         
	// 2689 5029:getfield        #12  <Field azh a>
	// 2690 5032:astore_1        
		abyte0.s = ((azh) (abyte0)).aT ^ a.s;
	// 2691 5033:aload_1         
	// 2692 5034:aload_1         
	// 2693 5035:getfield        #105 <Field int azh.aT>
	// 2694 5038:aload_0         
	// 2695 5039:getfield        #12  <Field azh a>
	// 2696 5042:getfield        #117 <Field int azh.s>
	// 2697 5045:ixor            
	// 2698 5046:putfield        #117 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 2699 5049:aload_0         
	// 2700 5050:getfield        #12  <Field azh a>
	// 2701 5053:astore_1        
		abyte0.am = ((azh) (abyte0)).am & ~a.aS;
	// 2702 5054:aload_1         
	// 2703 5055:aload_1         
	// 2704 5056:getfield        #40  <Field int azh.am>
	// 2705 5059:aload_0         
	// 2706 5060:getfield        #12  <Field azh a>
	// 2707 5063:getfield        #58  <Field int azh.aS>
	// 2708 5066:iconst_m1       
	// 2709 5067:ixor            
	// 2710 5068:iand            
	// 2711 5069:putfield        #40  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 2712 5072:aload_0         
	// 2713 5073:getfield        #12  <Field azh a>
	// 2714 5076:astore_1        
		abyte0.am = ((azh) (abyte0)).bV ^ a.am;
	// 2715 5077:aload_1         
	// 2716 5078:aload_1         
	// 2717 5079:getfield        #174 <Field int azh.bV>
	// 2718 5082:aload_0         
	// 2719 5083:getfield        #12  <Field azh a>
	// 2720 5086:getfield        #40  <Field int azh.am>
	// 2721 5089:ixor            
	// 2722 5090:putfield        #40  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 2723 5093:aload_0         
	// 2724 5094:getfield        #12  <Field azh a>
	// 2725 5097:astore_1        
		abyte0.bV = ((azh) (abyte0)).af & ~a.aS;
	// 2726 5098:aload_1         
	// 2727 5099:aload_1         
	// 2728 5100:getfield        #207 <Field int azh.af>
	// 2729 5103:aload_0         
	// 2730 5104:getfield        #12  <Field azh a>
	// 2731 5107:getfield        #58  <Field int azh.aS>
	// 2732 5110:iconst_m1       
	// 2733 5111:ixor            
	// 2734 5112:iand            
	// 2735 5113:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 2736 5116:aload_0         
	// 2737 5117:getfield        #12  <Field azh a>
	// 2738 5120:astore_1        
		abyte0.bV = ((azh) (abyte0)).aS ^ a.bV;
	// 2739 5121:aload_1         
	// 2740 5122:aload_1         
	// 2741 5123:getfield        #58  <Field int azh.aS>
	// 2742 5126:aload_0         
	// 2743 5127:getfield        #12  <Field azh a>
	// 2744 5130:getfield        #174 <Field int azh.bV>
	// 2745 5133:ixor            
	// 2746 5134:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 2747 5137:aload_0         
	// 2748 5138:getfield        #12  <Field azh a>
	// 2749 5141:astore_1        
		abyte0.bU = ((azh) (abyte0)).bV ^ a.bU;
	// 2750 5142:aload_1         
	// 2751 5143:aload_1         
	// 2752 5144:getfield        #174 <Field int azh.bV>
	// 2753 5147:aload_0         
	// 2754 5148:getfield        #12  <Field azh a>
	// 2755 5151:getfield        #231 <Field int azh.bU>
	// 2756 5154:ixor            
	// 2757 5155:putfield        #231 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 2758 5158:aload_0         
	// 2759 5159:getfield        #12  <Field azh a>
	// 2760 5162:astore_1        
		abyte0.bV = ((azh) (abyte0)).d | a.bV;
	// 2761 5163:aload_1         
	// 2762 5164:aload_1         
	// 2763 5165:getfield        #213 <Field int azh.d>
	// 2764 5168:aload_0         
	// 2765 5169:getfield        #12  <Field azh a>
	// 2766 5172:getfield        #174 <Field int azh.bV>
	// 2767 5175:ior             
	// 2768 5176:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 2769 5179:aload_0         
	// 2770 5180:getfield        #12  <Field azh a>
	// 2771 5183:astore_1        
		abyte0.bh = ((azh) (abyte0)).bh & ~a.aS;
	// 2772 5184:aload_1         
	// 2773 5185:aload_1         
	// 2774 5186:getfield        #111 <Field int azh.bh>
	// 2775 5189:aload_0         
	// 2776 5190:getfield        #12  <Field azh a>
	// 2777 5193:getfield        #58  <Field int azh.aS>
	// 2778 5196:iconst_m1       
	// 2779 5197:ixor            
	// 2780 5198:iand            
	// 2781 5199:putfield        #111 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 2782 5202:aload_0         
	// 2783 5203:getfield        #12  <Field azh a>
	// 2784 5206:astore_1        
		abyte0.bh = ((azh) (abyte0)).bm ^ a.bh;
	// 2785 5207:aload_1         
	// 2786 5208:aload_1         
	// 2787 5209:getfield        #70  <Field int azh.bm>
	// 2788 5212:aload_0         
	// 2789 5213:getfield        #12  <Field azh a>
	// 2790 5216:getfield        #111 <Field int azh.bh>
	// 2791 5219:ixor            
	// 2792 5220:putfield        #111 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 2793 5223:aload_0         
	// 2794 5224:getfield        #12  <Field azh a>
	// 2795 5227:astore_1        
		abyte0.aI = ((azh) (abyte0)).aS | a.aI;
	// 2796 5228:aload_1         
	// 2797 5229:aload_1         
	// 2798 5230:getfield        #58  <Field int azh.aS>
	// 2799 5233:aload_0         
	// 2800 5234:getfield        #12  <Field azh a>
	// 2801 5237:getfield        #189 <Field int azh.aI>
	// 2802 5240:ior             
	// 2803 5241:putfield        #189 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 2804 5244:aload_0         
	// 2805 5245:getfield        #12  <Field azh a>
	// 2806 5248:astore_1        
		abyte0.aI = ((azh) (abyte0)).bN ^ a.aI;
	// 2807 5249:aload_1         
	// 2808 5250:aload_1         
	// 2809 5251:getfield        #183 <Field int azh.bN>
	// 2810 5254:aload_0         
	// 2811 5255:getfield        #12  <Field azh a>
	// 2812 5258:getfield        #189 <Field int azh.aI>
	// 2813 5261:ixor            
	// 2814 5262:putfield        #189 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 2815 5265:aload_0         
	// 2816 5266:getfield        #12  <Field azh a>
	// 2817 5269:astore_1        
		abyte0.bN = ((azh) (abyte0)).ax & ~a.E;
	// 2818 5270:aload_1         
	// 2819 5271:aload_1         
	// 2820 5272:getfield        #246 <Field int azh.ax>
	// 2821 5275:aload_0         
	// 2822 5276:getfield        #12  <Field azh a>
	// 2823 5279:getfield        #76  <Field int azh.E>
	// 2824 5282:iconst_m1       
	// 2825 5283:ixor            
	// 2826 5284:iand            
	// 2827 5285:putfield        #183 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 2828 5288:aload_0         
	// 2829 5289:getfield        #12  <Field azh a>
	// 2830 5292:astore_1        
		abyte0.bN = ((azh) (abyte0)).ah ^ a.bN;
	// 2831 5293:aload_1         
	// 2832 5294:aload_1         
	// 2833 5295:getfield        #102 <Field int azh.ah>
	// 2834 5298:aload_0         
	// 2835 5299:getfield        #12  <Field azh a>
	// 2836 5302:getfield        #183 <Field int azh.bN>
	// 2837 5305:ixor            
	// 2838 5306:putfield        #183 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 2839 5309:aload_0         
	// 2840 5310:getfield        #12  <Field azh a>
	// 2841 5313:astore_1        
		abyte0.ah = ((azh) (abyte0)).bN & a.M;
	// 2842 5314:aload_1         
	// 2843 5315:aload_1         
	// 2844 5316:getfield        #183 <Field int azh.bN>
	// 2845 5319:aload_0         
	// 2846 5320:getfield        #12  <Field azh a>
	// 2847 5323:getfield        #93  <Field int azh.M>
	// 2848 5326:iand            
	// 2849 5327:putfield        #102 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 2850 5330:aload_0         
	// 2851 5331:getfield        #12  <Field azh a>
	// 2852 5334:astore_1        
		abyte0.at = ((azh) (abyte0)).bN ^ a.at;
	// 2853 5335:aload_1         
	// 2854 5336:aload_1         
	// 2855 5337:getfield        #183 <Field int azh.bN>
	// 2856 5340:aload_0         
	// 2857 5341:getfield        #12  <Field azh a>
	// 2858 5344:getfield        #249 <Field int azh.at>
	// 2859 5347:ixor            
	// 2860 5348:putfield        #249 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 2861 5351:aload_0         
	// 2862 5352:getfield        #12  <Field azh a>
	// 2863 5355:astore_1        
		abyte0.bN = ((azh) (abyte0)).be & ~a.E;
	// 2864 5356:aload_1         
	// 2865 5357:aload_1         
	// 2866 5358:getfield        #96  <Field int azh.be>
	// 2867 5361:aload_0         
	// 2868 5362:getfield        #12  <Field azh a>
	// 2869 5365:getfield        #76  <Field int azh.E>
	// 2870 5368:iconst_m1       
	// 2871 5369:ixor            
	// 2872 5370:iand            
	// 2873 5371:putfield        #183 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 2874 5374:aload_0         
	// 2875 5375:getfield        #12  <Field azh a>
	// 2876 5378:astore_1        
		abyte0.bN = ((azh) (abyte0)).ce ^ a.bN;
	// 2877 5379:aload_1         
	// 2878 5380:aload_1         
	// 2879 5381:getfield        #87  <Field int azh.ce>
	// 2880 5384:aload_0         
	// 2881 5385:getfield        #12  <Field azh a>
	// 2882 5388:getfield        #183 <Field int azh.bN>
	// 2883 5391:ixor            
	// 2884 5392:putfield        #183 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 2885 5395:aload_0         
	// 2886 5396:getfield        #12  <Field azh a>
	// 2887 5399:astore_1        
		abyte0.ah = ((azh) (abyte0)).bN ^ a.ah;
	// 2888 5400:aload_1         
	// 2889 5401:aload_1         
	// 2890 5402:getfield        #183 <Field int azh.bN>
	// 2891 5405:aload_0         
	// 2892 5406:getfield        #12  <Field azh a>
	// 2893 5409:getfield        #102 <Field int azh.ah>
	// 2894 5412:ixor            
	// 2895 5413:putfield        #102 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 2896 5416:aload_0         
	// 2897 5417:getfield        #12  <Field azh a>
	// 2898 5420:astore_1        
		abyte0.ah = ((azh) (abyte0)).g | a.ah;
	// 2899 5421:aload_1         
	// 2900 5422:aload_1         
	// 2901 5423:getfield        #99  <Field int azh.g>
	// 2902 5426:aload_0         
	// 2903 5427:getfield        #12  <Field azh a>
	// 2904 5430:getfield        #102 <Field int azh.ah>
	// 2905 5433:ior             
	// 2906 5434:putfield        #102 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 2907 5437:aload_0         
	// 2908 5438:getfield        #12  <Field azh a>
	// 2909 5441:astore_1        
		abyte0.ax = ((azh) (abyte0)).ax & ~a.E;
	// 2910 5442:aload_1         
	// 2911 5443:aload_1         
	// 2912 5444:getfield        #246 <Field int azh.ax>
	// 2913 5447:aload_0         
	// 2914 5448:getfield        #12  <Field azh a>
	// 2915 5451:getfield        #76  <Field int azh.E>
	// 2916 5454:iconst_m1       
	// 2917 5455:ixor            
	// 2918 5456:iand            
	// 2919 5457:putfield        #246 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 2920 5460:aload_0         
	// 2921 5461:getfield        #12  <Field azh a>
	// 2922 5464:astore_1        
		abyte0.ax = ((azh) (abyte0)).be ^ a.ax;
	// 2923 5465:aload_1         
	// 2924 5466:aload_1         
	// 2925 5467:getfield        #96  <Field int azh.be>
	// 2926 5470:aload_0         
	// 2927 5471:getfield        #12  <Field azh a>
	// 2928 5474:getfield        #246 <Field int azh.ax>
	// 2929 5477:ixor            
	// 2930 5478:putfield        #246 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 2931 5481:aload_0         
	// 2932 5482:getfield        #12  <Field azh a>
	// 2933 5485:astore_1        
		abyte0.ax = ((azh) (abyte0)).ax & a.M;
	// 2934 5486:aload_1         
	// 2935 5487:aload_1         
	// 2936 5488:getfield        #246 <Field int azh.ax>
	// 2937 5491:aload_0         
	// 2938 5492:getfield        #12  <Field azh a>
	// 2939 5495:getfield        #93  <Field int azh.M>
	// 2940 5498:iand            
	// 2941 5499:putfield        #246 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 2942 5502:aload_0         
	// 2943 5503:getfield        #12  <Field azh a>
	// 2944 5506:astore_1        
		abyte0.ce = ((azh) (abyte0)).E ^ a.ak;
	// 2945 5507:aload_1         
	// 2946 5508:aload_1         
	// 2947 5509:getfield        #76  <Field int azh.E>
	// 2948 5512:aload_0         
	// 2949 5513:getfield        #12  <Field azh a>
	// 2950 5516:getfield        #81  <Field int azh.ak>
	// 2951 5519:ixor            
	// 2952 5520:putfield        #87  <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 2953 5523:aload_0         
	// 2954 5524:getfield        #12  <Field azh a>
	// 2955 5527:astore_1        
		abyte0.cg = ((azh) (abyte0)).ce ^ a.cg;
	// 2956 5528:aload_1         
	// 2957 5529:aload_1         
	// 2958 5530:getfield        #87  <Field int azh.ce>
	// 2959 5533:aload_0         
	// 2960 5534:getfield        #12  <Field azh a>
	// 2961 5537:getfield        #114 <Field int azh.cg>
	// 2962 5540:ixor            
	// 2963 5541:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 2964 5544:aload_0         
	// 2965 5545:getfield        #12  <Field azh a>
	// 2966 5548:astore_1        
		abyte0.bL = ((azh) (abyte0)).cg ^ a.bL;
	// 2967 5549:aload_1         
	// 2968 5550:aload_1         
	// 2969 5551:getfield        #114 <Field int azh.cg>
	// 2970 5554:aload_0         
	// 2971 5555:getfield        #12  <Field azh a>
	// 2972 5558:getfield        #64  <Field int azh.bL>
	// 2973 5561:ixor            
	// 2974 5562:putfield        #64  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 2975 5565:aload_0         
	// 2976 5566:getfield        #12  <Field azh a>
	// 2977 5569:astore_1        
		abyte0.aJ = ((azh) (abyte0)).ce ^ a.aJ;
	// 2978 5570:aload_1         
	// 2979 5571:aload_1         
	// 2980 5572:getfield        #87  <Field int azh.ce>
	// 2981 5575:aload_0         
	// 2982 5576:getfield        #12  <Field azh a>
	// 2983 5579:getfield        #108 <Field int azh.aJ>
	// 2984 5582:ixor            
	// 2985 5583:putfield        #108 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 2986 5586:aload_0         
	// 2987 5587:getfield        #12  <Field azh a>
	// 2988 5590:astore_1        
		abyte0.bk = ((azh) (abyte0)).aJ ^ a.bk;
	// 2989 5591:aload_1         
	// 2990 5592:aload_1         
	// 2991 5593:getfield        #108 <Field int azh.aJ>
	// 2992 5596:aload_0         
	// 2993 5597:getfield        #12  <Field azh a>
	// 2994 5600:getfield        #49  <Field int azh.bk>
	// 2995 5603:ixor            
	// 2996 5604:putfield        #49  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 2997 5607:aload_0         
	// 2998 5608:getfield        #12  <Field azh a>
	// 2999 5611:astore_1        
		abyte0.bk = ((azh) (abyte0)).U & ~a.bk;
	// 3000 5612:aload_1         
	// 3001 5613:aload_1         
	// 3002 5614:getfield        #144 <Field int azh.U>
	// 3003 5617:aload_0         
	// 3004 5618:getfield        #12  <Field azh a>
	// 3005 5621:getfield        #49  <Field int azh.bk>
	// 3006 5624:iconst_m1       
	// 3007 5625:ixor            
	// 3008 5626:iand            
	// 3009 5627:putfield        #49  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 3010 5630:aload_0         
	// 3011 5631:getfield        #12  <Field azh a>
	// 3012 5634:astore_1        
		abyte0.bk = ((azh) (abyte0)).ap ^ a.bk;
	// 3013 5635:aload_1         
	// 3014 5636:aload_1         
	// 3015 5637:getfield        #26  <Field int azh.ap>
	// 3016 5640:aload_0         
	// 3017 5641:getfield        #12  <Field azh a>
	// 3018 5644:getfield        #49  <Field int azh.bk>
	// 3019 5647:ixor            
	// 3020 5648:putfield        #49  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 3021 5651:aload_0         
	// 3022 5652:getfield        #12  <Field azh a>
	// 3023 5655:astore_1        
		abyte0.l = ((azh) (abyte0)).bk ^ a.l;
	// 3024 5656:aload_1         
	// 3025 5657:aload_1         
	// 3026 5658:getfield        #49  <Field int azh.bk>
	// 3027 5661:aload_0         
	// 3028 5662:getfield        #12  <Field azh a>
	// 3029 5665:getfield        #252 <Field int azh.l>
	// 3030 5668:ixor            
	// 3031 5669:putfield        #252 <Field int azh.l>
		abyte0 = ((byte []) (a));
	// 3032 5672:aload_0         
	// 3033 5673:getfield        #12  <Field azh a>
	// 3034 5676:astore_1        
		abyte0.bk = ((azh) (abyte0)).E | a.ai;
	// 3035 5677:aload_1         
	// 3036 5678:aload_1         
	// 3037 5679:getfield        #76  <Field int azh.E>
	// 3038 5682:aload_0         
	// 3039 5683:getfield        #12  <Field azh a>
	// 3040 5686:getfield        #129 <Field int azh.ai>
	// 3041 5689:ior             
	// 3042 5690:putfield        #49  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 3043 5693:aload_0         
	// 3044 5694:getfield        #12  <Field azh a>
	// 3045 5697:astore_1        
		abyte0.bk = ((azh) (abyte0)).aO ^ a.bk;
	// 3046 5698:aload_1         
	// 3047 5699:aload_1         
	// 3048 5700:getfield        #255 <Field int azh.aO>
	// 3049 5703:aload_0         
	// 3050 5704:getfield        #12  <Field azh a>
	// 3051 5707:getfield        #49  <Field int azh.bk>
	// 3052 5710:ixor            
	// 3053 5711:putfield        #49  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 3054 5714:aload_0         
	// 3055 5715:getfield        #12  <Field azh a>
	// 3056 5718:astore_1        
		abyte0.ar = ((azh) (abyte0)).bk ^ a.ar;
	// 3057 5719:aload_1         
	// 3058 5720:aload_1         
	// 3059 5721:getfield        #49  <Field int azh.bk>
	// 3060 5724:aload_0         
	// 3061 5725:getfield        #12  <Field azh a>
	// 3062 5728:getfield        #37  <Field int azh.ar>
	// 3063 5731:ixor            
	// 3064 5732:putfield        #37  <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 3065 5735:aload_0         
	// 3066 5736:getfield        #12  <Field azh a>
	// 3067 5739:astore_1        
		abyte0.ax = ((azh) (abyte0)).bk ^ a.ax;
	// 3068 5740:aload_1         
	// 3069 5741:aload_1         
	// 3070 5742:getfield        #49  <Field int azh.bk>
	// 3071 5745:aload_0         
	// 3072 5746:getfield        #12  <Field azh a>
	// 3073 5749:getfield        #246 <Field int azh.ax>
	// 3074 5752:ixor            
	// 3075 5753:putfield        #246 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 3076 5756:aload_0         
	// 3077 5757:getfield        #12  <Field azh a>
	// 3078 5760:astore_1        
		abyte0.ah = ((azh) (abyte0)).ax ^ a.ah;
	// 3079 5761:aload_1         
	// 3080 5762:aload_1         
	// 3081 5763:getfield        #246 <Field int azh.ax>
	// 3082 5766:aload_0         
	// 3083 5767:getfield        #12  <Field azh a>
	// 3084 5770:getfield        #102 <Field int azh.ah>
	// 3085 5773:ixor            
	// 3086 5774:putfield        #102 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 3087 5777:aload_0         
	// 3088 5778:getfield        #12  <Field azh a>
	// 3089 5781:astore_1        
		abyte0.ax = ((azh) (abyte0)).E | a.ai;
	// 3090 5782:aload_1         
	// 3091 5783:aload_1         
	// 3092 5784:getfield        #76  <Field int azh.E>
	// 3093 5787:aload_0         
	// 3094 5788:getfield        #12  <Field azh a>
	// 3095 5791:getfield        #129 <Field int azh.ai>
	// 3096 5794:ior             
	// 3097 5795:putfield        #246 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 3098 5798:aload_0         
	// 3099 5799:getfield        #12  <Field azh a>
	// 3100 5802:astore_1        
		abyte0.ax = ((azh) (abyte0)).w ^ a.ax;
	// 3101 5803:aload_1         
	// 3102 5804:aload_1         
	// 3103 5805:getfield        #258 <Field int azh.w>
	// 3104 5808:aload_0         
	// 3105 5809:getfield        #12  <Field azh a>
	// 3106 5812:getfield        #246 <Field int azh.ax>
	// 3107 5815:ixor            
	// 3108 5816:putfield        #246 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 3109 5819:aload_0         
	// 3110 5820:getfield        #12  <Field azh a>
	// 3111 5823:astore_1        
		abyte0.ax = ((azh) (abyte0)).ax & ~a.M;
	// 3112 5824:aload_1         
	// 3113 5825:aload_1         
	// 3114 5826:getfield        #246 <Field int azh.ax>
	// 3115 5829:aload_0         
	// 3116 5830:getfield        #12  <Field azh a>
	// 3117 5833:getfield        #93  <Field int azh.M>
	// 3118 5836:iconst_m1       
	// 3119 5837:ixor            
	// 3120 5838:iand            
	// 3121 5839:putfield        #246 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 3122 5842:aload_0         
	// 3123 5843:getfield        #12  <Field azh a>
	// 3124 5846:astore_1        
		abyte0.ax = ((azh) (abyte0)).g | a.ax;
	// 3125 5847:aload_1         
	// 3126 5848:aload_1         
	// 3127 5849:getfield        #99  <Field int azh.g>
	// 3128 5852:aload_0         
	// 3129 5853:getfield        #12  <Field azh a>
	// 3130 5856:getfield        #246 <Field int azh.ax>
	// 3131 5859:ior             
	// 3132 5860:putfield        #246 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 3133 5863:aload_0         
	// 3134 5864:getfield        #12  <Field azh a>
	// 3135 5867:astore_1        
		abyte0.ax = ((azh) (abyte0)).ar ^ a.ax;
	// 3136 5868:aload_1         
	// 3137 5869:aload_1         
	// 3138 5870:getfield        #37  <Field int azh.ar>
	// 3139 5873:aload_0         
	// 3140 5874:getfield        #12  <Field azh a>
	// 3141 5877:getfield        #246 <Field int azh.ax>
	// 3142 5880:ixor            
	// 3143 5881:putfield        #246 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 3144 5884:aload_0         
	// 3145 5885:getfield        #12  <Field azh a>
	// 3146 5888:astore_1        
		abyte0.ax = ((azh) (abyte0)).o & ~a.ax;
	// 3147 5889:aload_1         
	// 3148 5890:aload_1         
	// 3149 5891:getfield        #132 <Field int azh.o>
	// 3150 5894:aload_0         
	// 3151 5895:getfield        #12  <Field azh a>
	// 3152 5898:getfield        #246 <Field int azh.ax>
	// 3153 5901:iconst_m1       
	// 3154 5902:ixor            
	// 3155 5903:iand            
	// 3156 5904:putfield        #246 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 3157 5907:aload_0         
	// 3158 5908:getfield        #12  <Field azh a>
	// 3159 5911:astore_1        
		abyte0.ar = ((azh) (abyte0)).E | a.be;
	// 3160 5912:aload_1         
	// 3161 5913:aload_1         
	// 3162 5914:getfield        #76  <Field int azh.E>
	// 3163 5917:aload_0         
	// 3164 5918:getfield        #12  <Field azh a>
	// 3165 5921:getfield        #96  <Field int azh.be>
	// 3166 5924:ior             
	// 3167 5925:putfield        #37  <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 3168 5928:aload_0         
	// 3169 5929:getfield        #12  <Field azh a>
	// 3170 5932:astore_1        
		abyte0.ar = ((azh) (abyte0)).M & a.ar;
	// 3171 5933:aload_1         
	// 3172 5934:aload_1         
	// 3173 5935:getfield        #93  <Field int azh.M>
	// 3174 5938:aload_0         
	// 3175 5939:getfield        #12  <Field azh a>
	// 3176 5942:getfield        #37  <Field int azh.ar>
	// 3177 5945:iand            
	// 3178 5946:putfield        #37  <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 3179 5949:aload_0         
	// 3180 5950:getfield        #12  <Field azh a>
	// 3181 5953:astore_1        
		abyte0.ar = ((azh) (abyte0)).bN ^ a.ar;
	// 3182 5954:aload_1         
	// 3183 5955:aload_1         
	// 3184 5956:getfield        #183 <Field int azh.bN>
	// 3185 5959:aload_0         
	// 3186 5960:getfield        #12  <Field azh a>
	// 3187 5963:getfield        #37  <Field int azh.ar>
	// 3188 5966:ixor            
	// 3189 5967:putfield        #37  <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 3190 5970:aload_0         
	// 3191 5971:getfield        #12  <Field azh a>
	// 3192 5974:astore_1        
		abyte0.aQ = ((azh) (abyte0)).ar ^ a.aQ;
	// 3193 5975:aload_1         
	// 3194 5976:aload_1         
	// 3195 5977:getfield        #37  <Field int azh.ar>
	// 3196 5980:aload_0         
	// 3197 5981:getfield        #12  <Field azh a>
	// 3198 5984:getfield        #52  <Field int azh.aQ>
	// 3199 5987:ixor            
	// 3200 5988:putfield        #52  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 3201 5991:aload_0         
	// 3202 5992:getfield        #12  <Field azh a>
	// 3203 5995:astore_1        
		abyte0.aA = ((azh) (abyte0)).aQ ^ a.aA;
	// 3204 5996:aload_1         
	// 3205 5997:aload_1         
	// 3206 5998:getfield        #52  <Field int azh.aQ>
	// 3207 6001:aload_0         
	// 3208 6002:getfield        #12  <Field azh a>
	// 3209 6005:getfield        #73  <Field int azh.aA>
	// 3210 6008:ixor            
	// 3211 6009:putfield        #73  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 3212 6012:aload_0         
	// 3213 6013:getfield        #12  <Field azh a>
	// 3214 6016:astore_1        
		abyte0.D = ((azh) (abyte0)).aA ^ a.D;
	// 3215 6017:aload_1         
	// 3216 6018:aload_1         
	// 3217 6019:getfield        #73  <Field int azh.aA>
	// 3218 6022:aload_0         
	// 3219 6023:getfield        #12  <Field azh a>
	// 3220 6026:getfield        #261 <Field int azh.D>
	// 3221 6029:ixor            
	// 3222 6030:putfield        #261 <Field int azh.D>
		abyte0 = ((byte []) (a));
	// 3223 6033:aload_0         
	// 3224 6034:getfield        #12  <Field azh a>
	// 3225 6037:astore_1        
		abyte0.aA = ((azh) (abyte0)).T ^ a.D;
	// 3226 6038:aload_1         
	// 3227 6039:aload_1         
	// 3228 6040:getfield        #43  <Field int azh.T>
	// 3229 6043:aload_0         
	// 3230 6044:getfield        #12  <Field azh a>
	// 3231 6047:getfield        #261 <Field int azh.D>
	// 3232 6050:ixor            
	// 3233 6051:putfield        #73  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 3234 6054:aload_0         
	// 3235 6055:getfield        #12  <Field azh a>
	// 3236 6058:astore_1        
		abyte0.aR = ((azh) (abyte0)).D | a.aR;
	// 3237 6059:aload_1         
	// 3238 6060:aload_1         
	// 3239 6061:getfield        #261 <Field int azh.D>
	// 3240 6064:aload_0         
	// 3241 6065:getfield        #12  <Field azh a>
	// 3242 6068:getfield        #264 <Field int azh.aR>
	// 3243 6071:ior             
	// 3244 6072:putfield        #264 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 3245 6075:aload_0         
	// 3246 6076:getfield        #12  <Field azh a>
	// 3247 6079:astore_1        
		abyte0.aR = ((azh) (abyte0)).av ^ a.aR;
	// 3248 6080:aload_1         
	// 3249 6081:aload_1         
	// 3250 6082:getfield        #267 <Field int azh.av>
	// 3251 6085:aload_0         
	// 3252 6086:getfield        #12  <Field azh a>
	// 3253 6089:getfield        #264 <Field int azh.aR>
	// 3254 6092:ixor            
	// 3255 6093:putfield        #264 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 3256 6096:aload_0         
	// 3257 6097:getfield        #12  <Field azh a>
	// 3258 6100:astore_1        
		abyte0.av = ((azh) (abyte0)).aR & ~a.br;
	// 3259 6101:aload_1         
	// 3260 6102:aload_1         
	// 3261 6103:getfield        #264 <Field int azh.aR>
	// 3262 6106:aload_0         
	// 3263 6107:getfield        #12  <Field azh a>
	// 3264 6110:getfield        #147 <Field int azh.br>
	// 3265 6113:iconst_m1       
	// 3266 6114:ixor            
	// 3267 6115:iand            
	// 3268 6116:putfield        #267 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 3269 6119:aload_0         
	// 3270 6120:getfield        #12  <Field azh a>
	// 3271 6123:astore_1        
		abyte0.aR = ((azh) (abyte0)).br & ~a.aR;
	// 3272 6124:aload_1         
	// 3273 6125:aload_1         
	// 3274 6126:getfield        #147 <Field int azh.br>
	// 3275 6129:aload_0         
	// 3276 6130:getfield        #12  <Field azh a>
	// 3277 6133:getfield        #264 <Field int azh.aR>
	// 3278 6136:iconst_m1       
	// 3279 6137:ixor            
	// 3280 6138:iand            
	// 3281 6139:putfield        #264 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 3282 6142:aload_0         
	// 3283 6143:getfield        #12  <Field azh a>
	// 3284 6146:astore_1        
		abyte0.bj = ((azh) (abyte0)).bj & ~a.D;
	// 3285 6147:aload_1         
	// 3286 6148:aload_1         
	// 3287 6149:getfield        #270 <Field int azh.bj>
	// 3288 6152:aload_0         
	// 3289 6153:getfield        #12  <Field azh a>
	// 3290 6156:getfield        #261 <Field int azh.D>
	// 3291 6159:iconst_m1       
	// 3292 6160:ixor            
	// 3293 6161:iand            
	// 3294 6162:putfield        #270 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 3295 6165:aload_0         
	// 3296 6166:getfield        #12  <Field azh a>
	// 3297 6169:astore_1        
		abyte0.bj = ((azh) (abyte0)).bg ^ a.bj;
	// 3298 6170:aload_1         
	// 3299 6171:aload_1         
	// 3300 6172:getfield        #273 <Field int azh.bg>
	// 3301 6175:aload_0         
	// 3302 6176:getfield        #12  <Field azh a>
	// 3303 6179:getfield        #270 <Field int azh.bj>
	// 3304 6182:ixor            
	// 3305 6183:putfield        #270 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 3306 6186:aload_0         
	// 3307 6187:getfield        #12  <Field azh a>
	// 3308 6190:astore_1        
		abyte0.av = ((azh) (abyte0)).bj ^ a.av;
	// 3309 6191:aload_1         
	// 3310 6192:aload_1         
	// 3311 6193:getfield        #270 <Field int azh.bj>
	// 3312 6196:aload_0         
	// 3313 6197:getfield        #12  <Field azh a>
	// 3314 6200:getfield        #267 <Field int azh.av>
	// 3315 6203:ixor            
	// 3316 6204:putfield        #267 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 3317 6207:aload_0         
	// 3318 6208:getfield        #12  <Field azh a>
	// 3319 6211:astore_1        
		abyte0.I = ((azh) (abyte0)).av ^ a.I;
	// 3320 6212:aload_1         
	// 3321 6213:aload_1         
	// 3322 6214:getfield        #267 <Field int azh.av>
	// 3323 6217:aload_0         
	// 3324 6218:getfield        #12  <Field azh a>
	// 3325 6221:getfield        #28  <Field int azh.I>
	// 3326 6224:ixor            
	// 3327 6225:putfield        #28  <Field int azh.I>
		abyte0 = ((byte []) (a));
	// 3328 6228:aload_0         
	// 3329 6229:getfield        #12  <Field azh a>
	// 3330 6232:astore_1        
		abyte0.aR = ((azh) (abyte0)).bj ^ a.aR;
	// 3331 6233:aload_1         
	// 3332 6234:aload_1         
	// 3333 6235:getfield        #270 <Field int azh.bj>
	// 3334 6238:aload_0         
	// 3335 6239:getfield        #12  <Field azh a>
	// 3336 6242:getfield        #264 <Field int azh.aR>
	// 3337 6245:ixor            
	// 3338 6246:putfield        #264 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 3339 6249:aload_0         
	// 3340 6250:getfield        #12  <Field azh a>
	// 3341 6253:astore_1        
		abyte0.bT = ((azh) (abyte0)).aR ^ a.bT;
	// 3342 6254:aload_1         
	// 3343 6255:aload_1         
	// 3344 6256:getfield        #264 <Field int azh.aR>
	// 3345 6259:aload_0         
	// 3346 6260:getfield        #12  <Field azh a>
	// 3347 6263:getfield        #276 <Field int azh.bT>
	// 3348 6266:ixor            
	// 3349 6267:putfield        #276 <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 3350 6270:aload_0         
	// 3351 6271:getfield        #12  <Field azh a>
	// 3352 6274:astore_1        
		abyte0.bP = ((azh) (abyte0)).bP & ~a.D;
	// 3353 6275:aload_1         
	// 3354 6276:aload_1         
	// 3355 6277:getfield        #279 <Field int azh.bP>
	// 3356 6280:aload_0         
	// 3357 6281:getfield        #12  <Field azh a>
	// 3358 6284:getfield        #261 <Field int azh.D>
	// 3359 6287:iconst_m1       
	// 3360 6288:ixor            
	// 3361 6289:iand            
	// 3362 6290:putfield        #279 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 3363 6293:aload_0         
	// 3364 6294:getfield        #12  <Field azh a>
	// 3365 6297:astore_1        
		abyte0.bP = ((azh) (abyte0)).aH ^ a.bP;
	// 3366 6298:aload_1         
	// 3367 6299:aload_1         
	// 3368 6300:getfield        #282 <Field int azh.aH>
	// 3369 6303:aload_0         
	// 3370 6304:getfield        #12  <Field azh a>
	// 3371 6307:getfield        #279 <Field int azh.bP>
	// 3372 6310:ixor            
	// 3373 6311:putfield        #279 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 3374 6314:aload_0         
	// 3375 6315:getfield        #12  <Field azh a>
	// 3376 6318:astore_1        
		abyte0.aH = ((azh) (abyte0)).bP & ~a.br;
	// 3377 6319:aload_1         
	// 3378 6320:aload_1         
	// 3379 6321:getfield        #279 <Field int azh.bP>
	// 3380 6324:aload_0         
	// 3381 6325:getfield        #12  <Field azh a>
	// 3382 6328:getfield        #147 <Field int azh.br>
	// 3383 6331:iconst_m1       
	// 3384 6332:ixor            
	// 3385 6333:iand            
	// 3386 6334:putfield        #282 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 3387 6337:aload_0         
	// 3388 6338:getfield        #12  <Field azh a>
	// 3389 6341:astore_1        
		abyte0.bP = ((azh) (abyte0)).br & ~a.bP;
	// 3390 6342:aload_1         
	// 3391 6343:aload_1         
	// 3392 6344:getfield        #147 <Field int azh.br>
	// 3393 6347:aload_0         
	// 3394 6348:getfield        #12  <Field azh a>
	// 3395 6351:getfield        #279 <Field int azh.bP>
	// 3396 6354:iconst_m1       
	// 3397 6355:ixor            
	// 3398 6356:iand            
	// 3399 6357:putfield        #279 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 3400 6360:aload_0         
	// 3401 6361:getfield        #12  <Field azh a>
	// 3402 6364:astore_1        
		abyte0.aR = ((azh) (abyte0)).T & ~a.D;
	// 3403 6365:aload_1         
	// 3404 6366:aload_1         
	// 3405 6367:getfield        #43  <Field int azh.T>
	// 3406 6370:aload_0         
	// 3407 6371:getfield        #12  <Field azh a>
	// 3408 6374:getfield        #261 <Field int azh.D>
	// 3409 6377:iconst_m1       
	// 3410 6378:ixor            
	// 3411 6379:iand            
	// 3412 6380:putfield        #264 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 3413 6383:aload_0         
	// 3414 6384:getfield        #12  <Field azh a>
	// 3415 6387:astore_1        
		abyte0.bj = ((azh) (abyte0)).aR & ~a.L;
	// 3416 6388:aload_1         
	// 3417 6389:aload_1         
	// 3418 6390:getfield        #264 <Field int azh.aR>
	// 3419 6393:aload_0         
	// 3420 6394:getfield        #12  <Field azh a>
	// 3421 6397:getfield        #285 <Field int azh.L>
	// 3422 6400:iconst_m1       
	// 3423 6401:ixor            
	// 3424 6402:iand            
	// 3425 6403:putfield        #270 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 3426 6406:aload_0         
	// 3427 6407:getfield        #12  <Field azh a>
	// 3428 6410:astore_1        
		abyte0.av = ((azh) (abyte0)).aR & ~a.L;
	// 3429 6411:aload_1         
	// 3430 6412:aload_1         
	// 3431 6413:getfield        #264 <Field int azh.aR>
	// 3432 6416:aload_0         
	// 3433 6417:getfield        #12  <Field azh a>
	// 3434 6420:getfield        #285 <Field int azh.L>
	// 3435 6423:iconst_m1       
	// 3436 6424:ixor            
	// 3437 6425:iand            
	// 3438 6426:putfield        #267 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 3439 6429:aload_0         
	// 3440 6430:getfield        #12  <Field azh a>
	// 3441 6433:astore_1        
		abyte0.bg = ((azh) (abyte0)).T & a.D;
	// 3442 6434:aload_1         
	// 3443 6435:aload_1         
	// 3444 6436:getfield        #43  <Field int azh.T>
	// 3445 6439:aload_0         
	// 3446 6440:getfield        #12  <Field azh a>
	// 3447 6443:getfield        #261 <Field int azh.D>
	// 3448 6446:iand            
	// 3449 6447:putfield        #273 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 3450 6450:aload_0         
	// 3451 6451:getfield        #12  <Field azh a>
	// 3452 6454:astore_1        
		abyte0.aQ = ((azh) (abyte0)).D & ~a.bg;
	// 3453 6455:aload_1         
	// 3454 6456:aload_1         
	// 3455 6457:getfield        #261 <Field int azh.D>
	// 3456 6460:aload_0         
	// 3457 6461:getfield        #12  <Field azh a>
	// 3458 6464:getfield        #273 <Field int azh.bg>
	// 3459 6467:iconst_m1       
	// 3460 6468:ixor            
	// 3461 6469:iand            
	// 3462 6470:putfield        #52  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 3463 6473:aload_0         
	// 3464 6474:getfield        #12  <Field azh a>
	// 3465 6477:astore_1        
		abyte0.ar = ((azh) (abyte0)).L | a.aQ;
	// 3466 6478:aload_1         
	// 3467 6479:aload_1         
	// 3468 6480:getfield        #285 <Field int azh.L>
	// 3469 6483:aload_0         
	// 3470 6484:getfield        #12  <Field azh a>
	// 3471 6487:getfield        #52  <Field int azh.aQ>
	// 3472 6490:ior             
	// 3473 6491:putfield        #37  <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 3474 6494:aload_0         
	// 3475 6495:getfield        #12  <Field azh a>
	// 3476 6498:astore_1        
		abyte0.bN = ((azh) (abyte0)).D | a.T;
	// 3477 6499:aload_1         
	// 3478 6500:aload_1         
	// 3479 6501:getfield        #261 <Field int azh.D>
	// 3480 6504:aload_0         
	// 3481 6505:getfield        #12  <Field azh a>
	// 3482 6508:getfield        #43  <Field int azh.T>
	// 3483 6511:ior             
	// 3484 6512:putfield        #183 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 3485 6515:aload_0         
	// 3486 6516:getfield        #12  <Field azh a>
	// 3487 6519:astore_1        
		abyte0.bN = ((azh) (abyte0)).bN & ~a.D;
	// 3488 6520:aload_1         
	// 3489 6521:aload_1         
	// 3490 6522:getfield        #183 <Field int azh.bN>
	// 3491 6525:aload_0         
	// 3492 6526:getfield        #12  <Field azh a>
	// 3493 6529:getfield        #261 <Field int azh.D>
	// 3494 6532:iconst_m1       
	// 3495 6533:ixor            
	// 3496 6534:iand            
	// 3497 6535:putfield        #183 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 3498 6538:aload_0         
	// 3499 6539:getfield        #12  <Field azh a>
	// 3500 6542:astore_1        
		abyte0.bd = ((azh) (abyte0)).D | a.bd;
	// 3501 6543:aload_1         
	// 3502 6544:aload_1         
	// 3503 6545:getfield        #261 <Field int azh.D>
	// 3504 6548:aload_0         
	// 3505 6549:getfield        #12  <Field azh a>
	// 3506 6552:getfield        #288 <Field int azh.bd>
	// 3507 6555:ior             
	// 3508 6556:putfield        #288 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 3509 6559:aload_0         
	// 3510 6560:getfield        #12  <Field azh a>
	// 3511 6563:astore_1        
		abyte0.bd = ((azh) (abyte0)).bq ^ a.bd;
	// 3512 6564:aload_1         
	// 3513 6565:aload_1         
	// 3514 6566:getfield        #291 <Field int azh.bq>
	// 3515 6569:aload_0         
	// 3516 6570:getfield        #12  <Field azh a>
	// 3517 6573:getfield        #288 <Field int azh.bd>
	// 3518 6576:ixor            
	// 3519 6577:putfield        #288 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 3520 6580:aload_0         
	// 3521 6581:getfield        #12  <Field azh a>
	// 3522 6584:astore_1        
		abyte0.aH = ((azh) (abyte0)).bd ^ a.aH;
	// 3523 6585:aload_1         
	// 3524 6586:aload_1         
	// 3525 6587:getfield        #288 <Field int azh.bd>
	// 3526 6590:aload_0         
	// 3527 6591:getfield        #12  <Field azh a>
	// 3528 6594:getfield        #282 <Field int azh.aH>
	// 3529 6597:ixor            
	// 3530 6598:putfield        #282 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 3531 6601:aload_0         
	// 3532 6602:getfield        #12  <Field azh a>
	// 3533 6605:astore_1        
		abyte0.ak = ((azh) (abyte0)).aH ^ a.ak;
	// 3534 6606:aload_1         
	// 3535 6607:aload_1         
	// 3536 6608:getfield        #282 <Field int azh.aH>
	// 3537 6611:aload_0         
	// 3538 6612:getfield        #12  <Field azh a>
	// 3539 6615:getfield        #81  <Field int azh.ak>
	// 3540 6618:ixor            
	// 3541 6619:putfield        #81  <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 3542 6622:aload_0         
	// 3543 6623:getfield        #12  <Field azh a>
	// 3544 6626:astore_1        
		abyte0.bP = ((azh) (abyte0)).bd ^ a.bP;
	// 3545 6627:aload_1         
	// 3546 6628:aload_1         
	// 3547 6629:getfield        #288 <Field int azh.bd>
	// 3548 6632:aload_0         
	// 3549 6633:getfield        #12  <Field azh a>
	// 3550 6636:getfield        #279 <Field int azh.bP>
	// 3551 6639:ixor            
	// 3552 6640:putfield        #279 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 3553 6643:aload_0         
	// 3554 6644:getfield        #12  <Field azh a>
	// 3555 6647:astore_1        
		abyte0.aa = ((azh) (abyte0)).bP ^ a.aa;
	// 3556 6648:aload_1         
	// 3557 6649:aload_1         
	// 3558 6650:getfield        #279 <Field int azh.bP>
	// 3559 6653:aload_0         
	// 3560 6654:getfield        #12  <Field azh a>
	// 3561 6657:getfield        #294 <Field int azh.aa>
	// 3562 6660:ixor            
	// 3563 6661:putfield        #294 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 3564 6664:aload_0         
	// 3565 6665:getfield        #12  <Field azh a>
	// 3566 6668:astore_1        
		abyte0.bP = ((azh) (abyte0)).D & ~a.T;
	// 3567 6669:aload_1         
	// 3568 6670:aload_1         
	// 3569 6671:getfield        #261 <Field int azh.D>
	// 3570 6674:aload_0         
	// 3571 6675:getfield        #12  <Field azh a>
	// 3572 6678:getfield        #43  <Field int azh.T>
	// 3573 6681:iconst_m1       
	// 3574 6682:ixor            
	// 3575 6683:iand            
	// 3576 6684:putfield        #279 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 3577 6687:aload_0         
	// 3578 6688:getfield        #12  <Field azh a>
	// 3579 6691:astore_1        
		abyte0.bs = ((azh) (abyte0)).E ^ a.bs;
	// 3580 6692:aload_1         
	// 3581 6693:aload_1         
	// 3582 6694:getfield        #76  <Field int azh.E>
	// 3583 6697:aload_0         
	// 3584 6698:getfield        #12  <Field azh a>
	// 3585 6701:getfield        #297 <Field int azh.bs>
	// 3586 6704:ixor            
	// 3587 6705:putfield        #297 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 3588 6708:aload_0         
	// 3589 6709:getfield        #12  <Field azh a>
	// 3590 6712:astore_1        
		abyte0.aq = ((azh) (abyte0)).bs ^ a.aq;
	// 3591 6713:aload_1         
	// 3592 6714:aload_1         
	// 3593 6715:getfield        #297 <Field int azh.bs>
	// 3594 6718:aload_0         
	// 3595 6719:getfield        #12  <Field azh a>
	// 3596 6722:getfield        #300 <Field int azh.aq>
	// 3597 6725:ixor            
	// 3598 6726:putfield        #300 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 3599 6729:aload_0         
	// 3600 6730:getfield        #12  <Field azh a>
	// 3601 6733:astore_1        
		abyte0.aq = ((azh) (abyte0)).aq & ~a.M;
	// 3602 6734:aload_1         
	// 3603 6735:aload_1         
	// 3604 6736:getfield        #300 <Field int azh.aq>
	// 3605 6739:aload_0         
	// 3606 6740:getfield        #12  <Field azh a>
	// 3607 6743:getfield        #93  <Field int azh.M>
	// 3608 6746:iconst_m1       
	// 3609 6747:ixor            
	// 3610 6748:iand            
	// 3611 6749:putfield        #300 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 3612 6752:aload_0         
	// 3613 6753:getfield        #12  <Field azh a>
	// 3614 6756:astore_1        
		abyte0.aq = ((azh) (abyte0)).bW ^ a.aq;
	// 3615 6757:aload_1         
	// 3616 6758:aload_1         
	// 3617 6759:getfield        #55  <Field int azh.bW>
	// 3618 6762:aload_0         
	// 3619 6763:getfield        #12  <Field azh a>
	// 3620 6766:getfield        #300 <Field int azh.aq>
	// 3621 6769:ixor            
	// 3622 6770:putfield        #300 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 3623 6773:aload_0         
	// 3624 6774:getfield        #12  <Field azh a>
	// 3625 6777:astore_1        
		abyte0.aq = ((azh) (abyte0)).U & a.aq;
	// 3626 6778:aload_1         
	// 3627 6779:aload_1         
	// 3628 6780:getfield        #144 <Field int azh.U>
	// 3629 6783:aload_0         
	// 3630 6784:getfield        #12  <Field azh a>
	// 3631 6787:getfield        #300 <Field int azh.aq>
	// 3632 6790:iand            
	// 3633 6791:putfield        #300 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 3634 6794:aload_0         
	// 3635 6795:getfield        #12  <Field azh a>
	// 3636 6798:astore_1        
		abyte0.aq = ((azh) (abyte0)).bL ^ a.aq;
	// 3637 6799:aload_1         
	// 3638 6800:aload_1         
	// 3639 6801:getfield        #64  <Field int azh.bL>
	// 3640 6804:aload_0         
	// 3641 6805:getfield        #12  <Field azh a>
	// 3642 6808:getfield        #300 <Field int azh.aq>
	// 3643 6811:ixor            
	// 3644 6812:putfield        #300 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 3645 6815:aload_0         
	// 3646 6816:getfield        #12  <Field azh a>
	// 3647 6819:astore_1        
		abyte0.aj = ((azh) (abyte0)).aq ^ a.aj;
	// 3648 6820:aload_1         
	// 3649 6821:aload_1         
	// 3650 6822:getfield        #300 <Field int azh.aq>
	// 3651 6825:aload_0         
	// 3652 6826:getfield        #12  <Field azh a>
	// 3653 6829:getfield        #303 <Field int azh.aj>
	// 3654 6832:ixor            
	// 3655 6833:putfield        #303 <Field int azh.aj>
		abyte0 = ((byte []) (a));
	// 3656 6836:aload_0         
	// 3657 6837:getfield        #12  <Field azh a>
	// 3658 6840:astore_1        
		abyte0.aq = ((azh) (abyte0)).F | a.aj;
	// 3659 6841:aload_1         
	// 3660 6842:aload_1         
	// 3661 6843:getfield        #306 <Field int azh.F>
	// 3662 6846:aload_0         
	// 3663 6847:getfield        #12  <Field azh a>
	// 3664 6850:getfield        #303 <Field int azh.aj>
	// 3665 6853:ior             
	// 3666 6854:putfield        #300 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 3667 6857:aload_0         
	// 3668 6858:getfield        #12  <Field azh a>
	// 3669 6861:astore_1        
		abyte0.bL = ((azh) (abyte0)).p & ~a.aj;
	// 3670 6862:aload_1         
	// 3671 6863:aload_1         
	// 3672 6864:getfield        #309 <Field int azh.p>
	// 3673 6867:aload_0         
	// 3674 6868:getfield        #12  <Field azh a>
	// 3675 6871:getfield        #303 <Field int azh.aj>
	// 3676 6874:iconst_m1       
	// 3677 6875:ixor            
	// 3678 6876:iand            
	// 3679 6877:putfield        #64  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 3680 6880:aload_0         
	// 3681 6881:getfield        #12  <Field azh a>
	// 3682 6884:astore_1        
		abyte0.bW = ((azh) (abyte0)).p & ~a.aj;
	// 3683 6885:aload_1         
	// 3684 6886:aload_1         
	// 3685 6887:getfield        #309 <Field int azh.p>
	// 3686 6890:aload_0         
	// 3687 6891:getfield        #12  <Field azh a>
	// 3688 6894:getfield        #303 <Field int azh.aj>
	// 3689 6897:iconst_m1       
	// 3690 6898:ixor            
	// 3691 6899:iand            
	// 3692 6900:putfield        #55  <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 3693 6903:aload_0         
	// 3694 6904:getfield        #12  <Field azh a>
	// 3695 6907:astore_1        
		abyte0.bs = ((azh) (abyte0)).p & a.aj;
	// 3696 6908:aload_1         
	// 3697 6909:aload_1         
	// 3698 6910:getfield        #309 <Field int azh.p>
	// 3699 6913:aload_0         
	// 3700 6914:getfield        #12  <Field azh a>
	// 3701 6917:getfield        #303 <Field int azh.aj>
	// 3702 6920:iand            
	// 3703 6921:putfield        #297 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 3704 6924:aload_0         
	// 3705 6925:getfield        #12  <Field azh a>
	// 3706 6928:astore_1        
		abyte0.bs = ((azh) (abyte0)).F & ~a.bs;
	// 3707 6929:aload_1         
	// 3708 6930:aload_1         
	// 3709 6931:getfield        #306 <Field int azh.F>
	// 3710 6934:aload_0         
	// 3711 6935:getfield        #12  <Field azh a>
	// 3712 6938:getfield        #297 <Field int azh.bs>
	// 3713 6941:iconst_m1       
	// 3714 6942:ixor            
	// 3715 6943:iand            
	// 3716 6944:putfield        #297 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 3717 6947:aload_0         
	// 3718 6948:getfield        #12  <Field azh a>
	// 3719 6951:astore_1        
		abyte0.bD = ((azh) (abyte0)).aj ^ a.bD;
	// 3720 6952:aload_1         
	// 3721 6953:aload_1         
	// 3722 6954:getfield        #303 <Field int azh.aj>
	// 3723 6957:aload_0         
	// 3724 6958:getfield        #12  <Field azh a>
	// 3725 6961:getfield        #312 <Field int azh.bD>
	// 3726 6964:ixor            
	// 3727 6965:putfield        #312 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 3728 6968:aload_0         
	// 3729 6969:getfield        #12  <Field azh a>
	// 3730 6972:astore_1        
		abyte0.bd = ((azh) (abyte0)).aj & ~a.x;
	// 3731 6973:aload_1         
	// 3732 6974:aload_1         
	// 3733 6975:getfield        #303 <Field int azh.aj>
	// 3734 6978:aload_0         
	// 3735 6979:getfield        #12  <Field azh a>
	// 3736 6982:getfield        #315 <Field int azh.x>
	// 3737 6985:iconst_m1       
	// 3738 6986:ixor            
	// 3739 6987:iand            
	// 3740 6988:putfield        #288 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 3741 6991:aload_0         
	// 3742 6992:getfield        #12  <Field azh a>
	// 3743 6995:astore_1        
		abyte0.aH = ((azh) (abyte0)).p & a.bd;
	// 3744 6996:aload_1         
	// 3745 6997:aload_1         
	// 3746 6998:getfield        #309 <Field int azh.p>
	// 3747 7001:aload_0         
	// 3748 7002:getfield        #12  <Field azh a>
	// 3749 7005:getfield        #288 <Field int azh.bd>
	// 3750 7008:iand            
	// 3751 7009:putfield        #282 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 3752 7012:aload_0         
	// 3753 7013:getfield        #12  <Field azh a>
	// 3754 7016:astore_1        
		abyte0.bq = ((azh) (abyte0)).aj & ~a.bd;
	// 3755 7017:aload_1         
	// 3756 7018:aload_1         
	// 3757 7019:getfield        #303 <Field int azh.aj>
	// 3758 7022:aload_0         
	// 3759 7023:getfield        #12  <Field azh a>
	// 3760 7026:getfield        #288 <Field int azh.bd>
	// 3761 7029:iconst_m1       
	// 3762 7030:ixor            
	// 3763 7031:iand            
	// 3764 7032:putfield        #291 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 3765 7035:aload_0         
	// 3766 7036:getfield        #12  <Field azh a>
	// 3767 7039:astore_1        
		abyte0.bk = ((azh) (abyte0)).F & ~a.bq;
	// 3768 7040:aload_1         
	// 3769 7041:aload_1         
	// 3770 7042:getfield        #306 <Field int azh.F>
	// 3771 7045:aload_0         
	// 3772 7046:getfield        #12  <Field azh a>
	// 3773 7049:getfield        #291 <Field int azh.bq>
	// 3774 7052:iconst_m1       
	// 3775 7053:ixor            
	// 3776 7054:iand            
	// 3777 7055:putfield        #49  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 3778 7058:aload_0         
	// 3779 7059:getfield        #12  <Field azh a>
	// 3780 7062:astore_1        
		abyte0.aO = ((azh) (abyte0)).p & ~a.bd;
	// 3781 7063:aload_1         
	// 3782 7064:aload_1         
	// 3783 7065:getfield        #309 <Field int azh.p>
	// 3784 7068:aload_0         
	// 3785 7069:getfield        #12  <Field azh a>
	// 3786 7072:getfield        #288 <Field int azh.bd>
	// 3787 7075:iconst_m1       
	// 3788 7076:ixor            
	// 3789 7077:iand            
	// 3790 7078:putfield        #255 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 3791 7081:aload_0         
	// 3792 7082:getfield        #12  <Field azh a>
	// 3793 7085:astore_1        
		abyte0.aO = ((azh) (abyte0)).bd ^ a.aO;
	// 3794 7086:aload_1         
	// 3795 7087:aload_1         
	// 3796 7088:getfield        #288 <Field int azh.bd>
	// 3797 7091:aload_0         
	// 3798 7092:getfield        #12  <Field azh a>
	// 3799 7095:getfield        #255 <Field int azh.aO>
	// 3800 7098:ixor            
	// 3801 7099:putfield        #255 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 3802 7102:aload_0         
	// 3803 7103:getfield        #12  <Field azh a>
	// 3804 7106:astore_1        
		abyte0.ap = ((azh) (abyte0)).aj & a.x;
	// 3805 7107:aload_1         
	// 3806 7108:aload_1         
	// 3807 7109:getfield        #303 <Field int azh.aj>
	// 3808 7112:aload_0         
	// 3809 7113:getfield        #12  <Field azh a>
	// 3810 7116:getfield        #315 <Field int azh.x>
	// 3811 7119:iand            
	// 3812 7120:putfield        #26  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 3813 7123:aload_0         
	// 3814 7124:getfield        #12  <Field azh a>
	// 3815 7127:astore_1        
		abyte0.aJ = ((azh) (abyte0)).ap ^ a.p;
	// 3816 7128:aload_1         
	// 3817 7129:aload_1         
	// 3818 7130:getfield        #26  <Field int azh.ap>
	// 3819 7133:aload_0         
	// 3820 7134:getfield        #12  <Field azh a>
	// 3821 7137:getfield        #309 <Field int azh.p>
	// 3822 7140:ixor            
	// 3823 7141:putfield        #108 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 3824 7144:aload_0         
	// 3825 7145:getfield        #12  <Field azh a>
	// 3826 7148:astore_1        
		abyte0.aq = ((azh) (abyte0)).aJ ^ a.aq;
	// 3827 7149:aload_1         
	// 3828 7150:aload_1         
	// 3829 7151:getfield        #108 <Field int azh.aJ>
	// 3830 7154:aload_0         
	// 3831 7155:getfield        #12  <Field azh a>
	// 3832 7158:getfield        #300 <Field int azh.aq>
	// 3833 7161:ixor            
	// 3834 7162:putfield        #300 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 3835 7165:aload_0         
	// 3836 7166:getfield        #12  <Field azh a>
	// 3837 7169:astore_1        
		abyte0.aJ = ((azh) (abyte0)).aJ & a.F;
	// 3838 7170:aload_1         
	// 3839 7171:aload_1         
	// 3840 7172:getfield        #108 <Field int azh.aJ>
	// 3841 7175:aload_0         
	// 3842 7176:getfield        #12  <Field azh a>
	// 3843 7179:getfield        #306 <Field int azh.F>
	// 3844 7182:iand            
	// 3845 7183:putfield        #108 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 3846 7186:aload_0         
	// 3847 7187:getfield        #12  <Field azh a>
	// 3848 7190:astore_1        
		abyte0.ce = ((azh) (abyte0)).p & a.aj;
	// 3849 7191:aload_1         
	// 3850 7192:aload_1         
	// 3851 7193:getfield        #309 <Field int azh.p>
	// 3852 7196:aload_0         
	// 3853 7197:getfield        #12  <Field azh a>
	// 3854 7200:getfield        #303 <Field int azh.aj>
	// 3855 7203:iand            
	// 3856 7204:putfield        #87  <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 3857 7207:aload_0         
	// 3858 7208:getfield        #12  <Field azh a>
	// 3859 7211:astore_1        
		abyte0.cg = ((azh) (abyte0)).p & ~a.aj;
	// 3860 7212:aload_1         
	// 3861 7213:aload_1         
	// 3862 7214:getfield        #309 <Field int azh.p>
	// 3863 7217:aload_0         
	// 3864 7218:getfield        #12  <Field azh a>
	// 3865 7221:getfield        #303 <Field int azh.aj>
	// 3866 7224:iconst_m1       
	// 3867 7225:ixor            
	// 3868 7226:iand            
	// 3869 7227:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 3870 7230:aload_0         
	// 3871 7231:getfield        #12  <Field azh a>
	// 3872 7234:astore_1        
		abyte0.cg = ((azh) (abyte0)).cg & a.F;
	// 3873 7235:aload_1         
	// 3874 7236:aload_1         
	// 3875 7237:getfield        #114 <Field int azh.cg>
	// 3876 7240:aload_0         
	// 3877 7241:getfield        #12  <Field azh a>
	// 3878 7244:getfield        #306 <Field int azh.F>
	// 3879 7247:iand            
	// 3880 7248:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 3881 7251:aload_0         
	// 3882 7252:getfield        #12  <Field azh a>
	// 3883 7255:astore_1        
		abyte0.cg = ((azh) (abyte0)).bK ^ a.cg;
	// 3884 7256:aload_1         
	// 3885 7257:aload_1         
	// 3886 7258:getfield        #318 <Field int azh.bK>
	// 3887 7261:aload_0         
	// 3888 7262:getfield        #12  <Field azh a>
	// 3889 7265:getfield        #114 <Field int azh.cg>
	// 3890 7268:ixor            
	// 3891 7269:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 3892 7272:aload_0         
	// 3893 7273:getfield        #12  <Field azh a>
	// 3894 7276:astore_1        
		abyte0.cg = ((azh) (abyte0)).h & ~a.cg;
	// 3895 7277:aload_1         
	// 3896 7278:aload_1         
	// 3897 7279:getfield        #321 <Field int azh.h>
	// 3898 7282:aload_0         
	// 3899 7283:getfield        #12  <Field azh a>
	// 3900 7286:getfield        #114 <Field int azh.cg>
	// 3901 7289:iconst_m1       
	// 3902 7290:ixor            
	// 3903 7291:iand            
	// 3904 7292:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 3905 7295:aload_0         
	// 3906 7296:getfield        #12  <Field azh a>
	// 3907 7299:astore_1        
		abyte0.bK = ((azh) (abyte0)).p & ~a.aj;
	// 3908 7300:aload_1         
	// 3909 7301:aload_1         
	// 3910 7302:getfield        #309 <Field int azh.p>
	// 3911 7305:aload_0         
	// 3912 7306:getfield        #12  <Field azh a>
	// 3913 7309:getfield        #303 <Field int azh.aj>
	// 3914 7312:iconst_m1       
	// 3915 7313:ixor            
	// 3916 7314:iand            
	// 3917 7315:putfield        #318 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 3918 7318:aload_0         
	// 3919 7319:getfield        #12  <Field azh a>
	// 3920 7322:astore_1        
		abyte0.bK = ((azh) (abyte0)).bd ^ a.bK;
	// 3921 7323:aload_1         
	// 3922 7324:aload_1         
	// 3923 7325:getfield        #288 <Field int azh.bd>
	// 3924 7328:aload_0         
	// 3925 7329:getfield        #12  <Field azh a>
	// 3926 7332:getfield        #318 <Field int azh.bK>
	// 3927 7335:ixor            
	// 3928 7336:putfield        #318 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 3929 7339:aload_0         
	// 3930 7340:getfield        #12  <Field azh a>
	// 3931 7343:astore_1        
		abyte0.bd = ((azh) (abyte0)).p & a.aj;
	// 3932 7344:aload_1         
	// 3933 7345:aload_1         
	// 3934 7346:getfield        #309 <Field int azh.p>
	// 3935 7349:aload_0         
	// 3936 7350:getfield        #12  <Field azh a>
	// 3937 7353:getfield        #303 <Field int azh.aj>
	// 3938 7356:iand            
	// 3939 7357:putfield        #288 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 3940 7360:aload_0         
	// 3941 7361:getfield        #12  <Field azh a>
	// 3942 7364:astore_1        
		abyte0.bd = ((azh) (abyte0)).ap ^ a.bd;
	// 3943 7365:aload_1         
	// 3944 7366:aload_1         
	// 3945 7367:getfield        #26  <Field int azh.ap>
	// 3946 7370:aload_0         
	// 3947 7371:getfield        #12  <Field azh a>
	// 3948 7374:getfield        #288 <Field int azh.bd>
	// 3949 7377:ixor            
	// 3950 7378:putfield        #288 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 3951 7381:aload_0         
	// 3952 7382:getfield        #12  <Field azh a>
	// 3953 7385:astore_1        
		abyte0.bm = ((azh) (abyte0)).bd & a.F;
	// 3954 7386:aload_1         
	// 3955 7387:aload_1         
	// 3956 7388:getfield        #288 <Field int azh.bd>
	// 3957 7391:aload_0         
	// 3958 7392:getfield        #12  <Field azh a>
	// 3959 7395:getfield        #306 <Field int azh.F>
	// 3960 7398:iand            
	// 3961 7399:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 3962 7402:aload_0         
	// 3963 7403:getfield        #12  <Field azh a>
	// 3964 7406:astore_1        
		abyte0.aT = ((azh) (abyte0)).bd & ~a.F;
	// 3965 7407:aload_1         
	// 3966 7408:aload_1         
	// 3967 7409:getfield        #288 <Field int azh.bd>
	// 3968 7412:aload_0         
	// 3969 7413:getfield        #12  <Field azh a>
	// 3970 7416:getfield        #306 <Field int azh.F>
	// 3971 7419:iconst_m1       
	// 3972 7420:ixor            
	// 3973 7421:iand            
	// 3974 7422:putfield        #105 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 3975 7425:aload_0         
	// 3976 7426:getfield        #12  <Field azh a>
	// 3977 7429:astore_1        
		abyte0.aT = ((azh) (abyte0)).bd ^ a.aT;
	// 3978 7430:aload_1         
	// 3979 7431:aload_1         
	// 3980 7432:getfield        #288 <Field int azh.bd>
	// 3981 7435:aload_0         
	// 3982 7436:getfield        #12  <Field azh a>
	// 3983 7439:getfield        #105 <Field int azh.aT>
	// 3984 7442:ixor            
	// 3985 7443:putfield        #105 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 3986 7446:aload_0         
	// 3987 7447:getfield        #12  <Field azh a>
	// 3988 7450:astore_1        
		abyte0.aT = ((azh) (abyte0)).h & a.aT;
	// 3989 7451:aload_1         
	// 3990 7452:aload_1         
	// 3991 7453:getfield        #321 <Field int azh.h>
	// 3992 7456:aload_0         
	// 3993 7457:getfield        #12  <Field azh a>
	// 3994 7460:getfield        #105 <Field int azh.aT>
	// 3995 7463:iand            
	// 3996 7464:putfield        #105 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 3997 7467:aload_0         
	// 3998 7468:getfield        #12  <Field azh a>
	// 3999 7471:astore_1        
		abyte0.aT = ((azh) (abyte0)).N | a.aT;
	// 4000 7472:aload_1         
	// 4001 7473:aload_1         
	// 4002 7474:getfield        #324 <Field int azh.N>
	// 4003 7477:aload_0         
	// 4004 7478:getfield        #12  <Field azh a>
	// 4005 7481:getfield        #105 <Field int azh.aT>
	// 4006 7484:ior             
	// 4007 7485:putfield        #105 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 4008 7488:aload_0         
	// 4009 7489:getfield        #12  <Field azh a>
	// 4010 7492:astore_1        
		abyte0.bd = ((azh) (abyte0)).p & a.aj;
	// 4011 7493:aload_1         
	// 4012 7494:aload_1         
	// 4013 7495:getfield        #309 <Field int azh.p>
	// 4014 7498:aload_0         
	// 4015 7499:getfield        #12  <Field azh a>
	// 4016 7502:getfield        #303 <Field int azh.aj>
	// 4017 7505:iand            
	// 4018 7506:putfield        #288 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4019 7509:aload_0         
	// 4020 7510:getfield        #12  <Field azh a>
	// 4021 7513:astore_1        
		abyte0.bJ = ((azh) (abyte0)).p & ~a.aj;
	// 4022 7514:aload_1         
	// 4023 7515:aload_1         
	// 4024 7516:getfield        #309 <Field int azh.p>
	// 4025 7519:aload_0         
	// 4026 7520:getfield        #12  <Field azh a>
	// 4027 7523:getfield        #303 <Field int azh.aj>
	// 4028 7526:iconst_m1       
	// 4029 7527:ixor            
	// 4030 7528:iand            
	// 4031 7529:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 4032 7532:aload_0         
	// 4033 7533:getfield        #12  <Field azh a>
	// 4034 7536:astore_1        
		abyte0.bJ = ((azh) (abyte0)).ap ^ a.bJ;
	// 4035 7537:aload_1         
	// 4036 7538:aload_1         
	// 4037 7539:getfield        #26  <Field int azh.ap>
	// 4038 7542:aload_0         
	// 4039 7543:getfield        #12  <Field azh a>
	// 4040 7546:getfield        #31  <Field int azh.bJ>
	// 4041 7549:ixor            
	// 4042 7550:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 4043 7553:aload_0         
	// 4044 7554:getfield        #12  <Field azh a>
	// 4045 7557:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bJ & a.F;
	// 4046 7558:aload_1         
	// 4047 7559:aload_1         
	// 4048 7560:getfield        #31  <Field int azh.bJ>
	// 4049 7563:aload_0         
	// 4050 7564:getfield        #12  <Field azh a>
	// 4051 7567:getfield        #306 <Field int azh.F>
	// 4052 7570:iand            
	// 4053 7571:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 4054 7574:aload_0         
	// 4055 7575:getfield        #12  <Field azh a>
	// 4056 7578:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bD ^ a.bJ;
	// 4057 7579:aload_1         
	// 4058 7580:aload_1         
	// 4059 7581:getfield        #312 <Field int azh.bD>
	// 4060 7584:aload_0         
	// 4061 7585:getfield        #12  <Field azh a>
	// 4062 7588:getfield        #31  <Field int azh.bJ>
	// 4063 7591:ixor            
	// 4064 7592:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 4065 7595:aload_0         
	// 4066 7596:getfield        #12  <Field azh a>
	// 4067 7599:astore_1        
		abyte0.bJ = ((azh) (abyte0)).h & a.bJ;
	// 4068 7600:aload_1         
	// 4069 7601:aload_1         
	// 4070 7602:getfield        #321 <Field int azh.h>
	// 4071 7605:aload_0         
	// 4072 7606:getfield        #12  <Field azh a>
	// 4073 7609:getfield        #31  <Field int azh.bJ>
	// 4074 7612:iand            
	// 4075 7613:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 4076 7616:aload_0         
	// 4077 7617:getfield        #12  <Field azh a>
	// 4078 7620:astore_1        
		abyte0.bD = ((azh) (abyte0)).x ^ a.aj;
	// 4079 7621:aload_1         
	// 4080 7622:aload_1         
	// 4081 7623:getfield        #315 <Field int azh.x>
	// 4082 7626:aload_0         
	// 4083 7627:getfield        #12  <Field azh a>
	// 4084 7630:getfield        #303 <Field int azh.aj>
	// 4085 7633:ixor            
	// 4086 7634:putfield        #312 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 4087 7637:aload_0         
	// 4088 7638:getfield        #12  <Field azh a>
	// 4089 7641:astore_1        
		abyte0.bd = ((azh) (abyte0)).bD ^ a.bd;
	// 4090 7642:aload_1         
	// 4091 7643:aload_1         
	// 4092 7644:getfield        #312 <Field int azh.bD>
	// 4093 7647:aload_0         
	// 4094 7648:getfield        #12  <Field azh a>
	// 4095 7651:getfield        #288 <Field int azh.bd>
	// 4096 7654:ixor            
	// 4097 7655:putfield        #288 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4098 7658:aload_0         
	// 4099 7659:getfield        #12  <Field azh a>
	// 4100 7662:astore_1        
		abyte0.bd = ((azh) (abyte0)).bd & ~a.F;
	// 4101 7663:aload_1         
	// 4102 7664:aload_1         
	// 4103 7665:getfield        #288 <Field int azh.bd>
	// 4104 7668:aload_0         
	// 4105 7669:getfield        #12  <Field azh a>
	// 4106 7672:getfield        #306 <Field int azh.F>
	// 4107 7675:iconst_m1       
	// 4108 7676:ixor            
	// 4109 7677:iand            
	// 4110 7678:putfield        #288 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4111 7681:aload_0         
	// 4112 7682:getfield        #12  <Field azh a>
	// 4113 7685:astore_1        
		abyte0.bd = ((azh) (abyte0)).bK ^ a.bd;
	// 4114 7686:aload_1         
	// 4115 7687:aload_1         
	// 4116 7688:getfield        #318 <Field int azh.bK>
	// 4117 7691:aload_0         
	// 4118 7692:getfield        #12  <Field azh a>
	// 4119 7695:getfield        #288 <Field int azh.bd>
	// 4120 7698:ixor            
	// 4121 7699:putfield        #288 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4122 7702:aload_0         
	// 4123 7703:getfield        #12  <Field azh a>
	// 4124 7706:astore_1        
		abyte0.ap = ((azh) (abyte0)).p & ~a.bD;
	// 4125 7707:aload_1         
	// 4126 7708:aload_1         
	// 4127 7709:getfield        #309 <Field int azh.p>
	// 4128 7712:aload_0         
	// 4129 7713:getfield        #12  <Field azh a>
	// 4130 7716:getfield        #312 <Field int azh.bD>
	// 4131 7719:iconst_m1       
	// 4132 7720:ixor            
	// 4133 7721:iand            
	// 4134 7722:putfield        #26  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 4135 7725:aload_0         
	// 4136 7726:getfield        #12  <Field azh a>
	// 4137 7729:astore_1        
		abyte0.ap = ((azh) (abyte0)).ap & a.F;
	// 4138 7730:aload_1         
	// 4139 7731:aload_1         
	// 4140 7732:getfield        #26  <Field int azh.ap>
	// 4141 7735:aload_0         
	// 4142 7736:getfield        #12  <Field azh a>
	// 4143 7739:getfield        #306 <Field int azh.F>
	// 4144 7742:iand            
	// 4145 7743:putfield        #26  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 4146 7746:aload_0         
	// 4147 7747:getfield        #12  <Field azh a>
	// 4148 7750:astore_1        
		abyte0.bL = ((azh) (abyte0)).bD ^ a.bL;
	// 4149 7751:aload_1         
	// 4150 7752:aload_1         
	// 4151 7753:getfield        #312 <Field int azh.bD>
	// 4152 7756:aload_0         
	// 4153 7757:getfield        #12  <Field azh a>
	// 4154 7760:getfield        #64  <Field int azh.bL>
	// 4155 7763:ixor            
	// 4156 7764:putfield        #64  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 4157 7767:aload_0         
	// 4158 7768:getfield        #12  <Field azh a>
	// 4159 7771:astore_1        
		abyte0.bm = ((azh) (abyte0)).bL ^ a.bm;
	// 4160 7772:aload_1         
	// 4161 7773:aload_1         
	// 4162 7774:getfield        #64  <Field int azh.bL>
	// 4163 7777:aload_0         
	// 4164 7778:getfield        #12  <Field azh a>
	// 4165 7781:getfield        #70  <Field int azh.bm>
	// 4166 7784:ixor            
	// 4167 7785:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 4168 7788:aload_0         
	// 4169 7789:getfield        #12  <Field azh a>
	// 4170 7792:astore_1        
		abyte0.bm = ((azh) (abyte0)).h & a.bm;
	// 4171 7793:aload_1         
	// 4172 7794:aload_1         
	// 4173 7795:getfield        #321 <Field int azh.h>
	// 4174 7798:aload_0         
	// 4175 7799:getfield        #12  <Field azh a>
	// 4176 7802:getfield        #70  <Field int azh.bm>
	// 4177 7805:iand            
	// 4178 7806:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 4179 7809:aload_0         
	// 4180 7810:getfield        #12  <Field azh a>
	// 4181 7813:astore_1        
		abyte0.bm = ((azh) (abyte0)).aq ^ a.bm;
	// 4182 7814:aload_1         
	// 4183 7815:aload_1         
	// 4184 7816:getfield        #300 <Field int azh.aq>
	// 4185 7819:aload_0         
	// 4186 7820:getfield        #12  <Field azh a>
	// 4187 7823:getfield        #70  <Field int azh.bm>
	// 4188 7826:ixor            
	// 4189 7827:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 4190 7830:aload_0         
	// 4191 7831:getfield        #12  <Field azh a>
	// 4192 7834:astore_1        
		abyte0.aJ = ((azh) (abyte0)).bD ^ a.aJ;
	// 4193 7835:aload_1         
	// 4194 7836:aload_1         
	// 4195 7837:getfield        #312 <Field int azh.bD>
	// 4196 7840:aload_0         
	// 4197 7841:getfield        #12  <Field azh a>
	// 4198 7844:getfield        #108 <Field int azh.aJ>
	// 4199 7847:ixor            
	// 4200 7848:putfield        #108 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 4201 7851:aload_0         
	// 4202 7852:getfield        #12  <Field azh a>
	// 4203 7855:astore_1        
		abyte0.bG = ((azh) (abyte0)).aJ ^ a.bG;
	// 4204 7856:aload_1         
	// 4205 7857:aload_1         
	// 4206 7858:getfield        #108 <Field int azh.aJ>
	// 4207 7861:aload_0         
	// 4208 7862:getfield        #12  <Field azh a>
	// 4209 7865:getfield        #327 <Field int azh.bG>
	// 4210 7868:ixor            
	// 4211 7869:putfield        #327 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 4212 7872:aload_0         
	// 4213 7873:getfield        #12  <Field azh a>
	// 4214 7876:astore_1        
		abyte0.aJ = ((azh) (abyte0)).aj & ~a.bg;
	// 4215 7877:aload_1         
	// 4216 7878:aload_1         
	// 4217 7879:getfield        #303 <Field int azh.aj>
	// 4218 7882:aload_0         
	// 4219 7883:getfield        #12  <Field azh a>
	// 4220 7886:getfield        #273 <Field int azh.bg>
	// 4221 7889:iconst_m1       
	// 4222 7890:ixor            
	// 4223 7891:iand            
	// 4224 7892:putfield        #108 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 4225 7895:aload_0         
	// 4226 7896:getfield        #12  <Field azh a>
	// 4227 7899:astore_1        
		abyte0.bD = ((azh) (abyte0)).x & ~a.aj;
	// 4228 7900:aload_1         
	// 4229 7901:aload_1         
	// 4230 7902:getfield        #315 <Field int azh.x>
	// 4231 7905:aload_0         
	// 4232 7906:getfield        #12  <Field azh a>
	// 4233 7909:getfield        #303 <Field int azh.aj>
	// 4234 7912:iconst_m1       
	// 4235 7913:ixor            
	// 4236 7914:iand            
	// 4237 7915:putfield        #312 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 4238 7918:aload_0         
	// 4239 7919:getfield        #12  <Field azh a>
	// 4240 7922:astore_1        
		abyte0.aq = ((azh) (abyte0)).F & ~a.bD;
	// 4241 7923:aload_1         
	// 4242 7924:aload_1         
	// 4243 7925:getfield        #306 <Field int azh.F>
	// 4244 7928:aload_0         
	// 4245 7929:getfield        #12  <Field azh a>
	// 4246 7932:getfield        #312 <Field int azh.bD>
	// 4247 7935:iconst_m1       
	// 4248 7936:ixor            
	// 4249 7937:iand            
	// 4250 7938:putfield        #300 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 4251 7941:aload_0         
	// 4252 7942:getfield        #12  <Field azh a>
	// 4253 7945:astore_1        
		abyte0.aq = ((azh) (abyte0)).bK ^ a.aq;
	// 4254 7946:aload_1         
	// 4255 7947:aload_1         
	// 4256 7948:getfield        #318 <Field int azh.bK>
	// 4257 7951:aload_0         
	// 4258 7952:getfield        #12  <Field azh a>
	// 4259 7955:getfield        #300 <Field int azh.aq>
	// 4260 7958:ixor            
	// 4261 7959:putfield        #300 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 4262 7962:aload_0         
	// 4263 7963:getfield        #12  <Field azh a>
	// 4264 7966:astore_1        
		abyte0.aq = ((azh) (abyte0)).h & a.aq;
	// 4265 7967:aload_1         
	// 4266 7968:aload_1         
	// 4267 7969:getfield        #321 <Field int azh.h>
	// 4268 7972:aload_0         
	// 4269 7973:getfield        #12  <Field azh a>
	// 4270 7976:getfield        #300 <Field int azh.aq>
	// 4271 7979:iand            
	// 4272 7980:putfield        #300 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 4273 7983:aload_0         
	// 4274 7984:getfield        #12  <Field azh a>
	// 4275 7987:astore_1        
		abyte0.bW = ((azh) (abyte0)).bD ^ a.bW;
	// 4276 7988:aload_1         
	// 4277 7989:aload_1         
	// 4278 7990:getfield        #312 <Field int azh.bD>
	// 4279 7993:aload_0         
	// 4280 7994:getfield        #12  <Field azh a>
	// 4281 7997:getfield        #55  <Field int azh.bW>
	// 4282 8000:ixor            
	// 4283 8001:putfield        #55  <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 4284 8004:aload_0         
	// 4285 8005:getfield        #12  <Field azh a>
	// 4286 8008:astore_1        
		abyte0.bK = ((azh) (abyte0)).F & ~a.bW;
	// 4287 8009:aload_1         
	// 4288 8010:aload_1         
	// 4289 8011:getfield        #306 <Field int azh.F>
	// 4290 8014:aload_0         
	// 4291 8015:getfield        #12  <Field azh a>
	// 4292 8018:getfield        #55  <Field int azh.bW>
	// 4293 8021:iconst_m1       
	// 4294 8022:ixor            
	// 4295 8023:iand            
	// 4296 8024:putfield        #318 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 4297 8027:aload_0         
	// 4298 8028:getfield        #12  <Field azh a>
	// 4299 8031:astore_1        
		abyte0.bK = ((azh) (abyte0)).bq ^ a.bK;
	// 4300 8032:aload_1         
	// 4301 8033:aload_1         
	// 4302 8034:getfield        #291 <Field int azh.bq>
	// 4303 8037:aload_0         
	// 4304 8038:getfield        #12  <Field azh a>
	// 4305 8041:getfield        #318 <Field int azh.bK>
	// 4306 8044:ixor            
	// 4307 8045:putfield        #318 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 4308 8048:aload_0         
	// 4309 8049:getfield        #12  <Field azh a>
	// 4310 8052:astore_1        
		abyte0.aq = ((azh) (abyte0)).bK ^ a.aq;
	// 4311 8053:aload_1         
	// 4312 8054:aload_1         
	// 4313 8055:getfield        #318 <Field int azh.bK>
	// 4314 8058:aload_0         
	// 4315 8059:getfield        #12  <Field azh a>
	// 4316 8062:getfield        #300 <Field int azh.aq>
	// 4317 8065:ixor            
	// 4318 8066:putfield        #300 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 4319 8069:aload_0         
	// 4320 8070:getfield        #12  <Field azh a>
	// 4321 8073:astore_1        
		abyte0.aq = ((azh) (abyte0)).aq & ~a.N;
	// 4322 8074:aload_1         
	// 4323 8075:aload_1         
	// 4324 8076:getfield        #300 <Field int azh.aq>
	// 4325 8079:aload_0         
	// 4326 8080:getfield        #12  <Field azh a>
	// 4327 8083:getfield        #324 <Field int azh.N>
	// 4328 8086:iconst_m1       
	// 4329 8087:ixor            
	// 4330 8088:iand            
	// 4331 8089:putfield        #300 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 4332 8092:aload_0         
	// 4333 8093:getfield        #12  <Field azh a>
	// 4334 8096:astore_1        
		abyte0.aq = ((azh) (abyte0)).bm ^ a.aq;
	// 4335 8097:aload_1         
	// 4336 8098:aload_1         
	// 4337 8099:getfield        #70  <Field int azh.bm>
	// 4338 8102:aload_0         
	// 4339 8103:getfield        #12  <Field azh a>
	// 4340 8106:getfield        #300 <Field int azh.aq>
	// 4341 8109:ixor            
	// 4342 8110:putfield        #300 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 4343 8113:aload_0         
	// 4344 8114:getfield        #12  <Field azh a>
	// 4345 8117:astore_1        
		abyte0.Y = ((azh) (abyte0)).aq ^ a.Y;
	// 4346 8118:aload_1         
	// 4347 8119:aload_1         
	// 4348 8120:getfield        #300 <Field int azh.aq>
	// 4349 8123:aload_0         
	// 4350 8124:getfield        #12  <Field azh a>
	// 4351 8127:getfield        #330 <Field int azh.Y>
	// 4352 8130:ixor            
	// 4353 8131:putfield        #330 <Field int azh.Y>
		abyte0 = ((byte []) (a));
	// 4354 8134:aload_0         
	// 4355 8135:getfield        #12  <Field azh a>
	// 4356 8138:astore_1        
		abyte0.bW = ((azh) (abyte0)).F & ~a.bW;
	// 4357 8139:aload_1         
	// 4358 8140:aload_1         
	// 4359 8141:getfield        #306 <Field int azh.F>
	// 4360 8144:aload_0         
	// 4361 8145:getfield        #12  <Field azh a>
	// 4362 8148:getfield        #55  <Field int azh.bW>
	// 4363 8151:iconst_m1       
	// 4364 8152:ixor            
	// 4365 8153:iand            
	// 4366 8154:putfield        #55  <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 4367 8157:aload_0         
	// 4368 8158:getfield        #12  <Field azh a>
	// 4369 8161:astore_1        
		abyte0.bW = ((azh) (abyte0)).aO ^ a.bW;
	// 4370 8162:aload_1         
	// 4371 8163:aload_1         
	// 4372 8164:getfield        #255 <Field int azh.aO>
	// 4373 8167:aload_0         
	// 4374 8168:getfield        #12  <Field azh a>
	// 4375 8171:getfield        #55  <Field int azh.bW>
	// 4376 8174:ixor            
	// 4377 8175:putfield        #55  <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 4378 8178:aload_0         
	// 4379 8179:getfield        #12  <Field azh a>
	// 4380 8182:astore_1        
		abyte0.cg = ((azh) (abyte0)).bW ^ a.cg;
	// 4381 8183:aload_1         
	// 4382 8184:aload_1         
	// 4383 8185:getfield        #55  <Field int azh.bW>
	// 4384 8188:aload_0         
	// 4385 8189:getfield        #12  <Field azh a>
	// 4386 8192:getfield        #114 <Field int azh.cg>
	// 4387 8195:ixor            
	// 4388 8196:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 4389 8199:aload_0         
	// 4390 8200:getfield        #12  <Field azh a>
	// 4391 8203:astore_1        
		abyte0.bW = ((azh) (abyte0)).bD | a.aj;
	// 4392 8204:aload_1         
	// 4393 8205:aload_1         
	// 4394 8206:getfield        #312 <Field int azh.bD>
	// 4395 8209:aload_0         
	// 4396 8210:getfield        #12  <Field azh a>
	// 4397 8213:getfield        #303 <Field int azh.aj>
	// 4398 8216:ior             
	// 4399 8217:putfield        #55  <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 4400 8220:aload_0         
	// 4401 8221:getfield        #12  <Field azh a>
	// 4402 8224:astore_1        
		abyte0.ce = ((azh) (abyte0)).bW ^ a.ce;
	// 4403 8225:aload_1         
	// 4404 8226:aload_1         
	// 4405 8227:getfield        #55  <Field int azh.bW>
	// 4406 8230:aload_0         
	// 4407 8231:getfield        #12  <Field azh a>
	// 4408 8234:getfield        #87  <Field int azh.ce>
	// 4409 8237:ixor            
	// 4410 8238:putfield        #87  <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 4411 8241:aload_0         
	// 4412 8242:getfield        #12  <Field azh a>
	// 4413 8245:astore_1        
		abyte0.bs = ((azh) (abyte0)).ce ^ a.bs;
	// 4414 8246:aload_1         
	// 4415 8247:aload_1         
	// 4416 8248:getfield        #87  <Field int azh.ce>
	// 4417 8251:aload_0         
	// 4418 8252:getfield        #12  <Field azh a>
	// 4419 8255:getfield        #297 <Field int azh.bs>
	// 4420 8258:ixor            
	// 4421 8259:putfield        #297 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 4422 8262:aload_0         
	// 4423 8263:getfield        #12  <Field azh a>
	// 4424 8266:astore_1        
		abyte0.bs = ((azh) (abyte0)).h & a.bs;
	// 4425 8267:aload_1         
	// 4426 8268:aload_1         
	// 4427 8269:getfield        #321 <Field int azh.h>
	// 4428 8272:aload_0         
	// 4429 8273:getfield        #12  <Field azh a>
	// 4430 8276:getfield        #297 <Field int azh.bs>
	// 4431 8279:iand            
	// 4432 8280:putfield        #297 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 4433 8283:aload_0         
	// 4434 8284:getfield        #12  <Field azh a>
	// 4435 8287:astore_1        
		abyte0.bs = ((azh) (abyte0)).bk ^ a.bs;
	// 4436 8288:aload_1         
	// 4437 8289:aload_1         
	// 4438 8290:getfield        #49  <Field int azh.bk>
	// 4439 8293:aload_0         
	// 4440 8294:getfield        #12  <Field azh a>
	// 4441 8297:getfield        #297 <Field int azh.bs>
	// 4442 8300:ixor            
	// 4443 8301:putfield        #297 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 4444 8304:aload_0         
	// 4445 8305:getfield        #12  <Field azh a>
	// 4446 8308:astore_1        
		abyte0.bs = ((azh) (abyte0)).bs | a.N;
	// 4447 8309:aload_1         
	// 4448 8310:aload_1         
	// 4449 8311:getfield        #297 <Field int azh.bs>
	// 4450 8314:aload_0         
	// 4451 8315:getfield        #12  <Field azh a>
	// 4452 8318:getfield        #324 <Field int azh.N>
	// 4453 8321:ior             
	// 4454 8322:putfield        #297 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 4455 8325:aload_0         
	// 4456 8326:getfield        #12  <Field azh a>
	// 4457 8329:astore_1        
		abyte0.bs = ((azh) (abyte0)).bG ^ a.bs;
	// 4458 8330:aload_1         
	// 4459 8331:aload_1         
	// 4460 8332:getfield        #327 <Field int azh.bG>
	// 4461 8335:aload_0         
	// 4462 8336:getfield        #12  <Field azh a>
	// 4463 8339:getfield        #297 <Field int azh.bs>
	// 4464 8342:ixor            
	// 4465 8343:putfield        #297 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 4466 8346:aload_0         
	// 4467 8347:getfield        #12  <Field azh a>
	// 4468 8350:astore_1        
		abyte0.bs = ((azh) (abyte0)).bs ^ a.C;
	// 4469 8351:aload_1         
	// 4470 8352:aload_1         
	// 4471 8353:getfield        #297 <Field int azh.bs>
	// 4472 8356:aload_0         
	// 4473 8357:getfield        #12  <Field azh a>
	// 4474 8360:getfield        #333 <Field int azh.C>
	// 4475 8363:ixor            
	// 4476 8364:putfield        #297 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 4477 8367:aload_0         
	// 4478 8368:getfield        #12  <Field azh a>
	// 4479 8371:astore_1        
		abyte0.aH = ((azh) (abyte0)).bW ^ a.aH;
	// 4480 8372:aload_1         
	// 4481 8373:aload_1         
	// 4482 8374:getfield        #55  <Field int azh.bW>
	// 4483 8377:aload_0         
	// 4484 8378:getfield        #12  <Field azh a>
	// 4485 8381:getfield        #282 <Field int azh.aH>
	// 4486 8384:ixor            
	// 4487 8385:putfield        #282 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 4488 8388:aload_0         
	// 4489 8389:getfield        #12  <Field azh a>
	// 4490 8392:astore_1        
		abyte0.ap = ((azh) (abyte0)).aH ^ a.ap;
	// 4491 8393:aload_1         
	// 4492 8394:aload_1         
	// 4493 8395:getfield        #282 <Field int azh.aH>
	// 4494 8398:aload_0         
	// 4495 8399:getfield        #12  <Field azh a>
	// 4496 8402:getfield        #26  <Field int azh.ap>
	// 4497 8405:ixor            
	// 4498 8406:putfield        #26  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 4499 8409:aload_0         
	// 4500 8410:getfield        #12  <Field azh a>
	// 4501 8413:astore_1        
		abyte0.bJ = ((azh) (abyte0)).ap ^ a.bJ;
	// 4502 8414:aload_1         
	// 4503 8415:aload_1         
	// 4504 8416:getfield        #26  <Field int azh.ap>
	// 4505 8419:aload_0         
	// 4506 8420:getfield        #12  <Field azh a>
	// 4507 8423:getfield        #31  <Field int azh.bJ>
	// 4508 8426:ixor            
	// 4509 8427:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 4510 8430:aload_0         
	// 4511 8431:getfield        #12  <Field azh a>
	// 4512 8434:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bJ & ~a.N;
	// 4513 8435:aload_1         
	// 4514 8436:aload_1         
	// 4515 8437:getfield        #31  <Field int azh.bJ>
	// 4516 8440:aload_0         
	// 4517 8441:getfield        #12  <Field azh a>
	// 4518 8444:getfield        #324 <Field int azh.N>
	// 4519 8447:iconst_m1       
	// 4520 8448:ixor            
	// 4521 8449:iand            
	// 4522 8450:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 4523 8453:aload_0         
	// 4524 8454:getfield        #12  <Field azh a>
	// 4525 8457:astore_1        
		abyte0.bJ = ((azh) (abyte0)).cg ^ a.bJ;
	// 4526 8458:aload_1         
	// 4527 8459:aload_1         
	// 4528 8460:getfield        #114 <Field int azh.cg>
	// 4529 8463:aload_0         
	// 4530 8464:getfield        #12  <Field azh a>
	// 4531 8467:getfield        #31  <Field int azh.bJ>
	// 4532 8470:ixor            
	// 4533 8471:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 4534 8474:aload_0         
	// 4535 8475:getfield        #12  <Field azh a>
	// 4536 8478:astore_1        
		abyte0.ac = ((azh) (abyte0)).bJ ^ a.ac;
	// 4537 8479:aload_1         
	// 4538 8480:aload_1         
	// 4539 8481:getfield        #31  <Field int azh.bJ>
	// 4540 8484:aload_0         
	// 4541 8485:getfield        #12  <Field azh a>
	// 4542 8488:getfield        #84  <Field int azh.ac>
	// 4543 8491:ixor            
	// 4544 8492:putfield        #84  <Field int azh.ac>
		abyte0 = ((byte []) (a));
	// 4545 8495:aload_0         
	// 4546 8496:getfield        #12  <Field azh a>
	// 4547 8499:astore_1        
		abyte0.bJ = ((azh) (abyte0)).p & a.bD;
	// 4548 8500:aload_1         
	// 4549 8501:aload_1         
	// 4550 8502:getfield        #309 <Field int azh.p>
	// 4551 8505:aload_0         
	// 4552 8506:getfield        #12  <Field azh a>
	// 4553 8509:getfield        #312 <Field int azh.bD>
	// 4554 8512:iand            
	// 4555 8513:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 4556 8516:aload_0         
	// 4557 8517:getfield        #12  <Field azh a>
	// 4558 8520:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bD ^ a.bJ;
	// 4559 8521:aload_1         
	// 4560 8522:aload_1         
	// 4561 8523:getfield        #312 <Field int azh.bD>
	// 4562 8526:aload_0         
	// 4563 8527:getfield        #12  <Field azh a>
	// 4564 8530:getfield        #31  <Field int azh.bJ>
	// 4565 8533:ixor            
	// 4566 8534:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 4567 8537:aload_0         
	// 4568 8538:getfield        #12  <Field azh a>
	// 4569 8541:astore_1        
		abyte0.bJ = ((azh) (abyte0)).h & ~a.bJ;
	// 4570 8542:aload_1         
	// 4571 8543:aload_1         
	// 4572 8544:getfield        #321 <Field int azh.h>
	// 4573 8547:aload_0         
	// 4574 8548:getfield        #12  <Field azh a>
	// 4575 8551:getfield        #31  <Field int azh.bJ>
	// 4576 8554:iconst_m1       
	// 4577 8555:ixor            
	// 4578 8556:iand            
	// 4579 8557:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 4580 8560:aload_0         
	// 4581 8561:getfield        #12  <Field azh a>
	// 4582 8564:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bd ^ a.bJ;
	// 4583 8565:aload_1         
	// 4584 8566:aload_1         
	// 4585 8567:getfield        #288 <Field int azh.bd>
	// 4586 8570:aload_0         
	// 4587 8571:getfield        #12  <Field azh a>
	// 4588 8574:getfield        #31  <Field int azh.bJ>
	// 4589 8577:ixor            
	// 4590 8578:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 4591 8581:aload_0         
	// 4592 8582:getfield        #12  <Field azh a>
	// 4593 8585:astore_1        
		abyte0.aT = ((azh) (abyte0)).bJ ^ a.aT;
	// 4594 8586:aload_1         
	// 4595 8587:aload_1         
	// 4596 8588:getfield        #31  <Field int azh.bJ>
	// 4597 8591:aload_0         
	// 4598 8592:getfield        #12  <Field azh a>
	// 4599 8595:getfield        #105 <Field int azh.aT>
	// 4600 8598:ixor            
	// 4601 8599:putfield        #105 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 4602 8602:aload_0         
	// 4603 8603:getfield        #12  <Field azh a>
	// 4604 8606:astore_1        
		abyte0.G = ((azh) (abyte0)).aT ^ a.G;
	// 4605 8607:aload_1         
	// 4606 8608:aload_1         
	// 4607 8609:getfield        #105 <Field int azh.aT>
	// 4608 8612:aload_0         
	// 4609 8613:getfield        #12  <Field azh a>
	// 4610 8616:getfield        #336 <Field int azh.G>
	// 4611 8619:ixor            
	// 4612 8620:putfield        #336 <Field int azh.G>
		abyte0 = ((byte []) (a));
	// 4613 8623:aload_0         
	// 4614 8624:getfield        #12  <Field azh a>
	// 4615 8627:astore_1        
		abyte0.be = ((azh) (abyte0)).be & ~a.E;
	// 4616 8628:aload_1         
	// 4617 8629:aload_1         
	// 4618 8630:getfield        #96  <Field int azh.be>
	// 4619 8633:aload_0         
	// 4620 8634:getfield        #12  <Field azh a>
	// 4621 8637:getfield        #76  <Field int azh.E>
	// 4622 8640:iconst_m1       
	// 4623 8641:ixor            
	// 4624 8642:iand            
	// 4625 8643:putfield        #96  <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 4626 8646:aload_0         
	// 4627 8647:getfield        #12  <Field azh a>
	// 4628 8650:astore_1        
		abyte0.be = ((azh) (abyte0)).ai ^ a.be;
	// 4629 8651:aload_1         
	// 4630 8652:aload_1         
	// 4631 8653:getfield        #129 <Field int azh.ai>
	// 4632 8656:aload_0         
	// 4633 8657:getfield        #12  <Field azh a>
	// 4634 8660:getfield        #96  <Field int azh.be>
	// 4635 8663:ixor            
	// 4636 8664:putfield        #96  <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 4637 8667:aload_0         
	// 4638 8668:getfield        #12  <Field azh a>
	// 4639 8671:astore_1        
		abyte0.be = ((azh) (abyte0)).be & a.M;
	// 4640 8672:aload_1         
	// 4641 8673:aload_1         
	// 4642 8674:getfield        #96  <Field int azh.be>
	// 4643 8677:aload_0         
	// 4644 8678:getfield        #12  <Field azh a>
	// 4645 8681:getfield        #93  <Field int azh.M>
	// 4646 8684:iand            
	// 4647 8685:putfield        #96  <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 4648 8688:aload_0         
	// 4649 8689:getfield        #12  <Field azh a>
	// 4650 8692:astore_1        
		abyte0.be = ((azh) (abyte0)).g | a.be;
	// 4651 8693:aload_1         
	// 4652 8694:aload_1         
	// 4653 8695:getfield        #99  <Field int azh.g>
	// 4654 8698:aload_0         
	// 4655 8699:getfield        #12  <Field azh a>
	// 4656 8702:getfield        #96  <Field int azh.be>
	// 4657 8705:ior             
	// 4658 8706:putfield        #96  <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 4659 8709:aload_0         
	// 4660 8710:getfield        #12  <Field azh a>
	// 4661 8713:astore_1        
		abyte0.be = ((azh) (abyte0)).at ^ a.be;
	// 4662 8714:aload_1         
	// 4663 8715:aload_1         
	// 4664 8716:getfield        #249 <Field int azh.at>
	// 4665 8719:aload_0         
	// 4666 8720:getfield        #12  <Field azh a>
	// 4667 8723:getfield        #96  <Field int azh.be>
	// 4668 8726:ixor            
	// 4669 8727:putfield        #96  <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 4670 8730:aload_0         
	// 4671 8731:getfield        #12  <Field azh a>
	// 4672 8734:astore_1        
		abyte0.ax = ((azh) (abyte0)).be ^ a.ax;
	// 4673 8735:aload_1         
	// 4674 8736:aload_1         
	// 4675 8737:getfield        #96  <Field int azh.be>
	// 4676 8740:aload_0         
	// 4677 8741:getfield        #12  <Field azh a>
	// 4678 8744:getfield        #246 <Field int azh.ax>
	// 4679 8747:ixor            
	// 4680 8748:putfield        #246 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 4681 8751:aload_0         
	// 4682 8752:getfield        #12  <Field azh a>
	// 4683 8755:astore_1        
		abyte0.ad = ((azh) (abyte0)).ax ^ a.ad;
	// 4684 8756:aload_1         
	// 4685 8757:aload_1         
	// 4686 8758:getfield        #246 <Field int azh.ax>
	// 4687 8761:aload_0         
	// 4688 8762:getfield        #12  <Field azh a>
	// 4689 8765:getfield        #339 <Field int azh.ad>
	// 4690 8768:ixor            
	// 4691 8769:putfield        #339 <Field int azh.ad>
		abyte0 = ((byte []) (a));
	// 4692 8772:aload_0         
	// 4693 8773:getfield        #12  <Field azh a>
	// 4694 8776:astore_1        
		abyte0.W = ((azh) (abyte0)).W & ~a.ad;
	// 4695 8777:aload_1         
	// 4696 8778:aload_1         
	// 4697 8779:getfield        #342 <Field int azh.W>
	// 4698 8782:aload_0         
	// 4699 8783:getfield        #12  <Field azh a>
	// 4700 8786:getfield        #339 <Field int azh.ad>
	// 4701 8789:iconst_m1       
	// 4702 8790:ixor            
	// 4703 8791:iand            
	// 4704 8792:putfield        #342 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 4705 8795:aload_0         
	// 4706 8796:getfield        #12  <Field azh a>
	// 4707 8799:astore_1        
		abyte0.aN = ((azh) (abyte0)).ad & ~a.aN;
	// 4708 8800:aload_1         
	// 4709 8801:aload_1         
	// 4710 8802:getfield        #339 <Field int azh.ad>
	// 4711 8805:aload_0         
	// 4712 8806:getfield        #12  <Field azh a>
	// 4713 8809:getfield        #345 <Field int azh.aN>
	// 4714 8812:iconst_m1       
	// 4715 8813:ixor            
	// 4716 8814:iand            
	// 4717 8815:putfield        #345 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 4718 8818:aload_0         
	// 4719 8819:getfield        #12  <Field azh a>
	// 4720 8822:astore_1        
		abyte0.ax = ((azh) (abyte0)).E | a.ai;
	// 4721 8823:aload_1         
	// 4722 8824:aload_1         
	// 4723 8825:getfield        #76  <Field int azh.E>
	// 4724 8828:aload_0         
	// 4725 8829:getfield        #12  <Field azh a>
	// 4726 8832:getfield        #129 <Field int azh.ai>
	// 4727 8835:ior             
	// 4728 8836:putfield        #246 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 4729 8839:aload_0         
	// 4730 8840:getfield        #12  <Field azh a>
	// 4731 8843:astore_1        
		abyte0.ax = ((azh) (abyte0)).M & ~a.ax;
	// 4732 8844:aload_1         
	// 4733 8845:aload_1         
	// 4734 8846:getfield        #93  <Field int azh.M>
	// 4735 8849:aload_0         
	// 4736 8850:getfield        #12  <Field azh a>
	// 4737 8853:getfield        #246 <Field int azh.ax>
	// 4738 8856:iconst_m1       
	// 4739 8857:ixor            
	// 4740 8858:iand            
	// 4741 8859:putfield        #246 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 4742 8862:aload_0         
	// 4743 8863:getfield        #12  <Field azh a>
	// 4744 8866:astore_1        
		abyte0.an = ((azh) (abyte0)).ax ^ a.an;
	// 4745 8867:aload_1         
	// 4746 8868:aload_1         
	// 4747 8869:getfield        #246 <Field int azh.ax>
	// 4748 8872:aload_0         
	// 4749 8873:getfield        #12  <Field azh a>
	// 4750 8876:getfield        #198 <Field int azh.an>
	// 4751 8879:ixor            
	// 4752 8880:putfield        #198 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 4753 8883:aload_0         
	// 4754 8884:getfield        #12  <Field azh a>
	// 4755 8887:astore_1        
		abyte0.an = ((azh) (abyte0)).o & a.an;
	// 4756 8888:aload_1         
	// 4757 8889:aload_1         
	// 4758 8890:getfield        #132 <Field int azh.o>
	// 4759 8893:aload_0         
	// 4760 8894:getfield        #12  <Field azh a>
	// 4761 8897:getfield        #198 <Field int azh.an>
	// 4762 8900:iand            
	// 4763 8901:putfield        #198 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 4764 8904:aload_0         
	// 4765 8905:getfield        #12  <Field azh a>
	// 4766 8908:astore_1        
		abyte0.an = ((azh) (abyte0)).ah ^ a.an;
	// 4767 8909:aload_1         
	// 4768 8910:aload_1         
	// 4769 8911:getfield        #102 <Field int azh.ah>
	// 4770 8914:aload_0         
	// 4771 8915:getfield        #12  <Field azh a>
	// 4772 8918:getfield        #198 <Field int azh.an>
	// 4773 8921:ixor            
	// 4774 8922:putfield        #198 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 4775 8925:aload_0         
	// 4776 8926:getfield        #12  <Field azh a>
	// 4777 8929:astore_1        
		abyte0.Z = ((azh) (abyte0)).an ^ a.Z;
	// 4778 8930:aload_1         
	// 4779 8931:aload_1         
	// 4780 8932:getfield        #198 <Field int azh.an>
	// 4781 8935:aload_0         
	// 4782 8936:getfield        #12  <Field azh a>
	// 4783 8939:getfield        #348 <Field int azh.Z>
	// 4784 8942:ixor            
	// 4785 8943:putfield        #348 <Field int azh.Z>
		abyte0 = ((byte []) (a));
	// 4786 8946:aload_0         
	// 4787 8947:getfield        #12  <Field azh a>
	// 4788 8950:astore_1        
		abyte0.bM = ((azh) (abyte0)).Z ^ a.bM;
	// 4789 8951:aload_1         
	// 4790 8952:aload_1         
	// 4791 8953:getfield        #348 <Field int azh.Z>
	// 4792 8956:aload_0         
	// 4793 8957:getfield        #12  <Field azh a>
	// 4794 8960:getfield        #351 <Field int azh.bM>
	// 4795 8963:ixor            
	// 4796 8964:putfield        #351 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 4797 8967:aload_0         
	// 4798 8968:getfield        #12  <Field azh a>
	// 4799 8971:astore_1        
		abyte0.an = ((azh) (abyte0)).f | a.Z;
	// 4800 8972:aload_1         
	// 4801 8973:aload_1         
	// 4802 8974:getfield        #354 <Field int azh.f>
	// 4803 8977:aload_0         
	// 4804 8978:getfield        #12  <Field azh a>
	// 4805 8981:getfield        #348 <Field int azh.Z>
	// 4806 8984:ior             
	// 4807 8985:putfield        #198 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 4808 8988:aload_0         
	// 4809 8989:getfield        #12  <Field azh a>
	// 4810 8992:astore_1        
		abyte0.ah = ((azh) (abyte0)).B | a.an;
	// 4811 8993:aload_1         
	// 4812 8994:aload_1         
	// 4813 8995:getfield        #357 <Field int azh.B>
	// 4814 8998:aload_0         
	// 4815 8999:getfield        #12  <Field azh a>
	// 4816 9002:getfield        #198 <Field int azh.an>
	// 4817 9005:ior             
	// 4818 9006:putfield        #102 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 4819 9009:aload_0         
	// 4820 9010:getfield        #12  <Field azh a>
	// 4821 9013:astore_1        
		abyte0.ah = ((azh) (abyte0)).br | a.ah;
	// 4822 9014:aload_1         
	// 4823 9015:aload_1         
	// 4824 9016:getfield        #147 <Field int azh.br>
	// 4825 9019:aload_0         
	// 4826 9020:getfield        #12  <Field azh a>
	// 4827 9023:getfield        #102 <Field int azh.ah>
	// 4828 9026:ior             
	// 4829 9027:putfield        #102 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 4830 9030:aload_0         
	// 4831 9031:getfield        #12  <Field azh a>
	// 4832 9034:astore_1        
		abyte0.an = ((azh) (abyte0)).B | a.an;
	// 4833 9035:aload_1         
	// 4834 9036:aload_1         
	// 4835 9037:getfield        #357 <Field int azh.B>
	// 4836 9040:aload_0         
	// 4837 9041:getfield        #12  <Field azh a>
	// 4838 9044:getfield        #198 <Field int azh.an>
	// 4839 9047:ior             
	// 4840 9048:putfield        #198 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 4841 9051:aload_0         
	// 4842 9052:getfield        #12  <Field azh a>
	// 4843 9055:astore_1        
		abyte0.ax = ((azh) (abyte0)).Z & ~a.f;
	// 4844 9056:aload_1         
	// 4845 9057:aload_1         
	// 4846 9058:getfield        #348 <Field int azh.Z>
	// 4847 9061:aload_0         
	// 4848 9062:getfield        #12  <Field azh a>
	// 4849 9065:getfield        #354 <Field int azh.f>
	// 4850 9068:iconst_m1       
	// 4851 9069:ixor            
	// 4852 9070:iand            
	// 4853 9071:putfield        #246 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 4854 9074:aload_0         
	// 4855 9075:getfield        #12  <Field azh a>
	// 4856 9078:astore_1        
		abyte0.be = ((azh) (abyte0)).ax & ~a.B;
	// 4857 9079:aload_1         
	// 4858 9080:aload_1         
	// 4859 9081:getfield        #246 <Field int azh.ax>
	// 4860 9084:aload_0         
	// 4861 9085:getfield        #12  <Field azh a>
	// 4862 9088:getfield        #357 <Field int azh.B>
	// 4863 9091:iconst_m1       
	// 4864 9092:ixor            
	// 4865 9093:iand            
	// 4866 9094:putfield        #96  <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 4867 9097:aload_0         
	// 4868 9098:getfield        #12  <Field azh a>
	// 4869 9101:astore_1        
		abyte0.at = ((azh) (abyte0)).ax & ~a.br;
	// 4870 9102:aload_1         
	// 4871 9103:aload_1         
	// 4872 9104:getfield        #246 <Field int azh.ax>
	// 4873 9107:aload_0         
	// 4874 9108:getfield        #12  <Field azh a>
	// 4875 9111:getfield        #147 <Field int azh.br>
	// 4876 9114:iconst_m1       
	// 4877 9115:ixor            
	// 4878 9116:iand            
	// 4879 9117:putfield        #249 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 4880 9120:aload_0         
	// 4881 9121:getfield        #12  <Field azh a>
	// 4882 9124:astore_1        
		abyte0.aT = ((azh) (abyte0)).ax ^ a.B;
	// 4883 9125:aload_1         
	// 4884 9126:aload_1         
	// 4885 9127:getfield        #246 <Field int azh.ax>
	// 4886 9130:aload_0         
	// 4887 9131:getfield        #12  <Field azh a>
	// 4888 9134:getfield        #357 <Field int azh.B>
	// 4889 9137:ixor            
	// 4890 9138:putfield        #105 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 4891 9141:aload_0         
	// 4892 9142:getfield        #12  <Field azh a>
	// 4893 9145:astore_1        
		abyte0.aT = ((azh) (abyte0)).aT ^ a.br;
	// 4894 9146:aload_1         
	// 4895 9147:aload_1         
	// 4896 9148:getfield        #105 <Field int azh.aT>
	// 4897 9151:aload_0         
	// 4898 9152:getfield        #12  <Field azh a>
	// 4899 9155:getfield        #147 <Field int azh.br>
	// 4900 9158:ixor            
	// 4901 9159:putfield        #105 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 4902 9162:aload_0         
	// 4903 9163:getfield        #12  <Field azh a>
	// 4904 9166:astore_1        
		abyte0.bJ = ((azh) (abyte0)).Z & ~a.ax;
	// 4905 9167:aload_1         
	// 4906 9168:aload_1         
	// 4907 9169:getfield        #348 <Field int azh.Z>
	// 4908 9172:aload_0         
	// 4909 9173:getfield        #12  <Field azh a>
	// 4910 9176:getfield        #246 <Field int azh.ax>
	// 4911 9179:iconst_m1       
	// 4912 9180:ixor            
	// 4913 9181:iand            
	// 4914 9182:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 4915 9185:aload_0         
	// 4916 9186:getfield        #12  <Field azh a>
	// 4917 9189:astore_1        
		abyte0.bd = ((azh) (abyte0)).br | a.bJ;
	// 4918 9190:aload_1         
	// 4919 9191:aload_1         
	// 4920 9192:getfield        #147 <Field int azh.br>
	// 4921 9195:aload_0         
	// 4922 9196:getfield        #12  <Field azh a>
	// 4923 9199:getfield        #31  <Field int azh.bJ>
	// 4924 9202:ior             
	// 4925 9203:putfield        #288 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4926 9206:aload_0         
	// 4927 9207:getfield        #12  <Field azh a>
	// 4928 9210:astore_1        
		abyte0.bd = ((azh) (abyte0)).Z ^ a.bd;
	// 4929 9211:aload_1         
	// 4930 9212:aload_1         
	// 4931 9213:getfield        #348 <Field int azh.Z>
	// 4932 9216:aload_0         
	// 4933 9217:getfield        #12  <Field azh a>
	// 4934 9220:getfield        #288 <Field int azh.bd>
	// 4935 9223:ixor            
	// 4936 9224:putfield        #288 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4937 9227:aload_0         
	// 4938 9228:getfield        #12  <Field azh a>
	// 4939 9231:astore_1        
		abyte0.bD = ((azh) (abyte0)).bJ ^ a.B;
	// 4940 9232:aload_1         
	// 4941 9233:aload_1         
	// 4942 9234:getfield        #31  <Field int azh.bJ>
	// 4943 9237:aload_0         
	// 4944 9238:getfield        #12  <Field azh a>
	// 4945 9241:getfield        #357 <Field int azh.B>
	// 4946 9244:ixor            
	// 4947 9245:putfield        #312 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 4948 9248:aload_0         
	// 4949 9249:getfield        #12  <Field azh a>
	// 4950 9252:astore_1        
		abyte0.bD = ((azh) (abyte0)).bD & ~a.br;
	// 4951 9253:aload_1         
	// 4952 9254:aload_1         
	// 4953 9255:getfield        #312 <Field int azh.bD>
	// 4954 9258:aload_0         
	// 4955 9259:getfield        #12  <Field azh a>
	// 4956 9262:getfield        #147 <Field int azh.br>
	// 4957 9265:iconst_m1       
	// 4958 9266:ixor            
	// 4959 9267:iand            
	// 4960 9268:putfield        #312 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 4961 9271:aload_0         
	// 4962 9272:getfield        #12  <Field azh a>
	// 4963 9275:astore_1        
		abyte0.bD = ((azh) (abyte0)).cb ^ a.bD;
	// 4964 9276:aload_1         
	// 4965 9277:aload_1         
	// 4966 9278:getfield        #156 <Field int azh.cb>
	// 4967 9281:aload_0         
	// 4968 9282:getfield        #12  <Field azh a>
	// 4969 9285:getfield        #312 <Field int azh.bD>
	// 4970 9288:ixor            
	// 4971 9289:putfield        #312 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 4972 9292:aload_0         
	// 4973 9293:getfield        #12  <Field azh a>
	// 4974 9296:astore_1        
		abyte0.an = ((azh) (abyte0)).bJ ^ a.an;
	// 4975 9297:aload_1         
	// 4976 9298:aload_1         
	// 4977 9299:getfield        #31  <Field int azh.bJ>
	// 4978 9302:aload_0         
	// 4979 9303:getfield        #12  <Field azh a>
	// 4980 9306:getfield        #198 <Field int azh.an>
	// 4981 9309:ixor            
	// 4982 9310:putfield        #198 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 4983 9313:aload_0         
	// 4984 9314:getfield        #12  <Field azh a>
	// 4985 9317:astore_1        
		abyte0.an = ((azh) (abyte0)).an & ~a.br;
	// 4986 9318:aload_1         
	// 4987 9319:aload_1         
	// 4988 9320:getfield        #198 <Field int azh.an>
	// 4989 9323:aload_0         
	// 4990 9324:getfield        #12  <Field azh a>
	// 4991 9327:getfield        #147 <Field int azh.br>
	// 4992 9330:iconst_m1       
	// 4993 9331:ixor            
	// 4994 9332:iand            
	// 4995 9333:putfield        #198 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 4996 9336:aload_0         
	// 4997 9337:getfield        #12  <Field azh a>
	// 4998 9340:astore_1        
		abyte0.an = ((azh) (abyte0)).Z ^ a.an;
	// 4999 9341:aload_1         
	// 5000 9342:aload_1         
	// 5001 9343:getfield        #348 <Field int azh.Z>
	// 5002 9346:aload_0         
	// 5003 9347:getfield        #12  <Field azh a>
	// 5004 9350:getfield        #198 <Field int azh.an>
	// 5005 9353:ixor            
	// 5006 9354:putfield        #198 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 5007 9357:aload_0         
	// 5008 9358:getfield        #12  <Field azh a>
	// 5009 9361:astore_1        
		abyte0.bJ = ((azh) (abyte0)).ax & ~a.B;
	// 5010 9362:aload_1         
	// 5011 9363:aload_1         
	// 5012 9364:getfield        #246 <Field int azh.ax>
	// 5013 9367:aload_0         
	// 5014 9368:getfield        #12  <Field azh a>
	// 5015 9371:getfield        #357 <Field int azh.B>
	// 5016 9374:iconst_m1       
	// 5017 9375:ixor            
	// 5018 9376:iand            
	// 5019 9377:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 5020 9380:aload_0         
	// 5021 9381:getfield        #12  <Field azh a>
	// 5022 9384:astore_1        
		abyte0.cb = ((azh) (abyte0)).B | a.ax;
	// 5023 9385:aload_1         
	// 5024 9386:aload_1         
	// 5025 9387:getfield        #357 <Field int azh.B>
	// 5026 9390:aload_0         
	// 5027 9391:getfield        #12  <Field azh a>
	// 5028 9394:getfield        #246 <Field int azh.ax>
	// 5029 9397:ior             
	// 5030 9398:putfield        #156 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 5031 9401:aload_0         
	// 5032 9402:getfield        #12  <Field azh a>
	// 5033 9405:astore_1        
		abyte0.ay = ((azh) (abyte0)).cb ^ a.ay;
	// 5034 9406:aload_1         
	// 5035 9407:aload_1         
	// 5036 9408:getfield        #156 <Field int azh.cb>
	// 5037 9411:aload_0         
	// 5038 9412:getfield        #12  <Field azh a>
	// 5039 9415:getfield        #153 <Field int azh.ay>
	// 5040 9418:ixor            
	// 5041 9419:putfield        #153 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 5042 9422:aload_0         
	// 5043 9423:getfield        #12  <Field azh a>
	// 5044 9426:astore_1        
		abyte0.cb = ((azh) (abyte0)).Z & ~a.B;
	// 5045 9427:aload_1         
	// 5046 9428:aload_1         
	// 5047 9429:getfield        #348 <Field int azh.Z>
	// 5048 9432:aload_0         
	// 5049 9433:getfield        #12  <Field azh a>
	// 5050 9436:getfield        #357 <Field int azh.B>
	// 5051 9439:iconst_m1       
	// 5052 9440:ixor            
	// 5053 9441:iand            
	// 5054 9442:putfield        #156 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 5055 9445:aload_0         
	// 5056 9446:getfield        #12  <Field azh a>
	// 5057 9449:astore_1        
		abyte0.cg = ((azh) (abyte0)).Z & a.f;
	// 5058 9450:aload_1         
	// 5059 9451:aload_1         
	// 5060 9452:getfield        #348 <Field int azh.Z>
	// 5061 9455:aload_0         
	// 5062 9456:getfield        #12  <Field azh a>
	// 5063 9459:getfield        #354 <Field int azh.f>
	// 5064 9462:iand            
	// 5065 9463:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 5066 9466:aload_0         
	// 5067 9467:getfield        #12  <Field azh a>
	// 5068 9470:astore_1        
		abyte0.ap = ((azh) (abyte0)).f ^ a.Z;
	// 5069 9471:aload_1         
	// 5070 9472:aload_1         
	// 5071 9473:getfield        #354 <Field int azh.f>
	// 5072 9476:aload_0         
	// 5073 9477:getfield        #12  <Field azh a>
	// 5074 9480:getfield        #348 <Field int azh.Z>
	// 5075 9483:ixor            
	// 5076 9484:putfield        #26  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 5077 9487:aload_0         
	// 5078 9488:getfield        #12  <Field azh a>
	// 5079 9491:astore_1        
		abyte0.aH = ((azh) (abyte0)).ap & ~a.B;
	// 5080 9492:aload_1         
	// 5081 9493:aload_1         
	// 5082 9494:getfield        #26  <Field int azh.ap>
	// 5083 9497:aload_0         
	// 5084 9498:getfield        #12  <Field azh a>
	// 5085 9501:getfield        #357 <Field int azh.B>
	// 5086 9504:iconst_m1       
	// 5087 9505:ixor            
	// 5088 9506:iand            
	// 5089 9507:putfield        #282 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 5090 9510:aload_0         
	// 5091 9511:getfield        #12  <Field azh a>
	// 5092 9514:astore_1        
		abyte0.aH = ((azh) (abyte0)).cg ^ a.aH;
	// 5093 9515:aload_1         
	// 5094 9516:aload_1         
	// 5095 9517:getfield        #114 <Field int azh.cg>
	// 5096 9520:aload_0         
	// 5097 9521:getfield        #12  <Field azh a>
	// 5098 9524:getfield        #282 <Field int azh.aH>
	// 5099 9527:ixor            
	// 5100 9528:putfield        #282 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 5101 9531:aload_0         
	// 5102 9532:getfield        #12  <Field azh a>
	// 5103 9535:astore_1        
		abyte0.cf = ((azh) (abyte0)).aH ^ a.cf;
	// 5104 9536:aload_1         
	// 5105 9537:aload_1         
	// 5106 9538:getfield        #282 <Field int azh.aH>
	// 5107 9541:aload_0         
	// 5108 9542:getfield        #12  <Field azh a>
	// 5109 9545:getfield        #150 <Field int azh.cf>
	// 5110 9548:ixor            
	// 5111 9549:putfield        #150 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 5112 9552:aload_0         
	// 5113 9553:getfield        #12  <Field azh a>
	// 5114 9556:astore_1        
		abyte0.aH = ((azh) (abyte0)).ap & ~a.B;
	// 5115 9557:aload_1         
	// 5116 9558:aload_1         
	// 5117 9559:getfield        #26  <Field int azh.ap>
	// 5118 9562:aload_0         
	// 5119 9563:getfield        #12  <Field azh a>
	// 5120 9566:getfield        #357 <Field int azh.B>
	// 5121 9569:iconst_m1       
	// 5122 9570:ixor            
	// 5123 9571:iand            
	// 5124 9572:putfield        #282 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 5125 9575:aload_0         
	// 5126 9576:getfield        #12  <Field azh a>
	// 5127 9579:astore_1        
		abyte0.aH = ((azh) (abyte0)).ax ^ a.aH;
	// 5128 9580:aload_1         
	// 5129 9581:aload_1         
	// 5130 9582:getfield        #246 <Field int azh.ax>
	// 5131 9585:aload_0         
	// 5132 9586:getfield        #12  <Field azh a>
	// 5133 9589:getfield        #282 <Field int azh.aH>
	// 5134 9592:ixor            
	// 5135 9593:putfield        #282 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 5136 9596:aload_0         
	// 5137 9597:getfield        #12  <Field azh a>
	// 5138 9600:astore_1        
		abyte0.cb = ((azh) (abyte0)).ap ^ a.cb;
	// 5139 9601:aload_1         
	// 5140 9602:aload_1         
	// 5141 9603:getfield        #26  <Field int azh.ap>
	// 5142 9606:aload_0         
	// 5143 9607:getfield        #12  <Field azh a>
	// 5144 9610:getfield        #156 <Field int azh.cb>
	// 5145 9613:ixor            
	// 5146 9614:putfield        #156 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 5147 9617:aload_0         
	// 5148 9618:getfield        #12  <Field azh a>
	// 5149 9621:astore_1        
		abyte0.cb = ((azh) (abyte0)).br | a.cb;
	// 5150 9622:aload_1         
	// 5151 9623:aload_1         
	// 5152 9624:getfield        #147 <Field int azh.br>
	// 5153 9627:aload_0         
	// 5154 9628:getfield        #12  <Field azh a>
	// 5155 9631:getfield        #156 <Field int azh.cb>
	// 5156 9634:ior             
	// 5157 9635:putfield        #156 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 5158 9638:aload_0         
	// 5159 9639:getfield        #12  <Field azh a>
	// 5160 9642:astore_1        
		abyte0.ax = ((azh) (abyte0)).f & ~a.Z;
	// 5161 9643:aload_1         
	// 5162 9644:aload_1         
	// 5163 9645:getfield        #354 <Field int azh.f>
	// 5164 9648:aload_0         
	// 5165 9649:getfield        #12  <Field azh a>
	// 5166 9652:getfield        #348 <Field int azh.Z>
	// 5167 9655:iconst_m1       
	// 5168 9656:ixor            
	// 5169 9657:iand            
	// 5170 9658:putfield        #246 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 5171 9661:aload_0         
	// 5172 9662:getfield        #12  <Field azh a>
	// 5173 9665:astore_1        
		abyte0.cg = ((azh) (abyte0)).B | a.ax;
	// 5174 9666:aload_1         
	// 5175 9667:aload_1         
	// 5176 9668:getfield        #357 <Field int azh.B>
	// 5177 9671:aload_0         
	// 5178 9672:getfield        #12  <Field azh a>
	// 5179 9675:getfield        #246 <Field int azh.ax>
	// 5180 9678:ior             
	// 5181 9679:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 5182 9682:aload_0         
	// 5183 9683:getfield        #12  <Field azh a>
	// 5184 9686:astore_1        
		abyte0.cg = ((azh) (abyte0)).ap ^ a.cg;
	// 5185 9687:aload_1         
	// 5186 9688:aload_1         
	// 5187 9689:getfield        #26  <Field int azh.ap>
	// 5188 9692:aload_0         
	// 5189 9693:getfield        #12  <Field azh a>
	// 5190 9696:getfield        #114 <Field int azh.cg>
	// 5191 9699:ixor            
	// 5192 9700:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 5193 9703:aload_0         
	// 5194 9704:getfield        #12  <Field azh a>
	// 5195 9707:astore_1        
		abyte0.cb = ((azh) (abyte0)).cg ^ a.cb;
	// 5196 9708:aload_1         
	// 5197 9709:aload_1         
	// 5198 9710:getfield        #114 <Field int azh.cg>
	// 5199 9713:aload_0         
	// 5200 9714:getfield        #12  <Field azh a>
	// 5201 9717:getfield        #156 <Field int azh.cb>
	// 5202 9720:ixor            
	// 5203 9721:putfield        #156 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 5204 9724:aload_0         
	// 5205 9725:getfield        #12  <Field azh a>
	// 5206 9728:astore_1        
		abyte0.cg = ((azh) (abyte0)).B | a.ax;
	// 5207 9729:aload_1         
	// 5208 9730:aload_1         
	// 5209 9731:getfield        #357 <Field int azh.B>
	// 5210 9734:aload_0         
	// 5211 9735:getfield        #12  <Field azh a>
	// 5212 9738:getfield        #246 <Field int azh.ax>
	// 5213 9741:ior             
	// 5214 9742:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 5215 9745:aload_0         
	// 5216 9746:getfield        #12  <Field azh a>
	// 5217 9749:astore_1        
		abyte0.cg = ((azh) (abyte0)).f ^ a.cg;
	// 5218 9750:aload_1         
	// 5219 9751:aload_1         
	// 5220 9752:getfield        #354 <Field int azh.f>
	// 5221 9755:aload_0         
	// 5222 9756:getfield        #12  <Field azh a>
	// 5223 9759:getfield        #114 <Field int azh.cg>
	// 5224 9762:ixor            
	// 5225 9763:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 5226 9766:aload_0         
	// 5227 9767:getfield        #12  <Field azh a>
	// 5228 9770:astore_1        
		abyte0.bW = ((azh) (abyte0)).br | a.cg;
	// 5229 9771:aload_1         
	// 5230 9772:aload_1         
	// 5231 9773:getfield        #147 <Field int azh.br>
	// 5232 9776:aload_0         
	// 5233 9777:getfield        #12  <Field azh a>
	// 5234 9780:getfield        #114 <Field int azh.cg>
	// 5235 9783:ior             
	// 5236 9784:putfield        #55  <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 5237 9787:aload_0         
	// 5238 9788:getfield        #12  <Field azh a>
	// 5239 9791:astore_1        
		abyte0.at = ((azh) (abyte0)).cg ^ a.at;
	// 5240 9792:aload_1         
	// 5241 9793:aload_1         
	// 5242 9794:getfield        #114 <Field int azh.cg>
	// 5243 9797:aload_0         
	// 5244 9798:getfield        #12  <Field azh a>
	// 5245 9801:getfield        #249 <Field int azh.at>
	// 5246 9804:ixor            
	// 5247 9805:putfield        #249 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 5248 9808:aload_0         
	// 5249 9809:getfield        #12  <Field azh a>
	// 5250 9812:astore_1        
		abyte0.cg = ((azh) (abyte0)).ax | a.Z;
	// 5251 9813:aload_1         
	// 5252 9814:aload_1         
	// 5253 9815:getfield        #246 <Field int azh.ax>
	// 5254 9818:aload_0         
	// 5255 9819:getfield        #12  <Field azh a>
	// 5256 9822:getfield        #348 <Field int azh.Z>
	// 5257 9825:ior             
	// 5258 9826:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 5259 9829:aload_0         
	// 5260 9830:getfield        #12  <Field azh a>
	// 5261 9833:astore_1        
		abyte0.bG = ((azh) (abyte0)).cg & ~a.B;
	// 5262 9834:aload_1         
	// 5263 9835:aload_1         
	// 5264 9836:getfield        #114 <Field int azh.cg>
	// 5265 9839:aload_0         
	// 5266 9840:getfield        #12  <Field azh a>
	// 5267 9843:getfield        #357 <Field int azh.B>
	// 5268 9846:iconst_m1       
	// 5269 9847:ixor            
	// 5270 9848:iand            
	// 5271 9849:putfield        #327 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 5272 9852:aload_0         
	// 5273 9853:getfield        #12  <Field azh a>
	// 5274 9856:astore_1        
		abyte0.bA = ((azh) (abyte0)).bG ^ a.bA;
	// 5275 9857:aload_1         
	// 5276 9858:aload_1         
	// 5277 9859:getfield        #327 <Field int azh.bG>
	// 5278 9862:aload_0         
	// 5279 9863:getfield        #12  <Field azh a>
	// 5280 9866:getfield        #123 <Field int azh.bA>
	// 5281 9869:ixor            
	// 5282 9870:putfield        #123 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 5283 9873:aload_0         
	// 5284 9874:getfield        #12  <Field azh a>
	// 5285 9877:astore_1        
		abyte0.ah = ((azh) (abyte0)).bG ^ a.ah;
	// 5286 9878:aload_1         
	// 5287 9879:aload_1         
	// 5288 9880:getfield        #327 <Field int azh.bG>
	// 5289 9883:aload_0         
	// 5290 9884:getfield        #12  <Field azh a>
	// 5291 9887:getfield        #102 <Field int azh.ah>
	// 5292 9890:ixor            
	// 5293 9891:putfield        #102 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 5294 9894:aload_0         
	// 5295 9895:getfield        #12  <Field azh a>
	// 5296 9898:astore_1        
		abyte0.bG = ((azh) (abyte0)).cg & ~a.B;
	// 5297 9899:aload_1         
	// 5298 9900:aload_1         
	// 5299 9901:getfield        #114 <Field int azh.cg>
	// 5300 9904:aload_0         
	// 5301 9905:getfield        #12  <Field azh a>
	// 5302 9908:getfield        #357 <Field int azh.B>
	// 5303 9911:iconst_m1       
	// 5304 9912:ixor            
	// 5305 9913:iand            
	// 5306 9914:putfield        #327 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 5307 9917:aload_0         
	// 5308 9918:getfield        #12  <Field azh a>
	// 5309 9921:astore_1        
		abyte0.bG = ((azh) (abyte0)).Z ^ a.bG;
	// 5310 9922:aload_1         
	// 5311 9923:aload_1         
	// 5312 9924:getfield        #348 <Field int azh.Z>
	// 5313 9927:aload_0         
	// 5314 9928:getfield        #12  <Field azh a>
	// 5315 9931:getfield        #327 <Field int azh.bG>
	// 5316 9934:ixor            
	// 5317 9935:putfield        #327 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 5318 9938:aload_0         
	// 5319 9939:getfield        #12  <Field azh a>
	// 5320 9942:astore_1        
		abyte0.bW = ((azh) (abyte0)).bG ^ a.bW;
	// 5321 9943:aload_1         
	// 5322 9944:aload_1         
	// 5323 9945:getfield        #327 <Field int azh.bG>
	// 5324 9948:aload_0         
	// 5325 9949:getfield        #12  <Field azh a>
	// 5326 9952:getfield        #55  <Field int azh.bW>
	// 5327 9955:ixor            
	// 5328 9956:putfield        #55  <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 5329 9959:aload_0         
	// 5330 9960:getfield        #12  <Field azh a>
	// 5331 9963:astore_1        
		abyte0.bG = ((azh) (abyte0)).cg & ~a.B;
	// 5332 9964:aload_1         
	// 5333 9965:aload_1         
	// 5334 9966:getfield        #114 <Field int azh.cg>
	// 5335 9969:aload_0         
	// 5336 9970:getfield        #12  <Field azh a>
	// 5337 9973:getfield        #357 <Field int azh.B>
	// 5338 9976:iconst_m1       
	// 5339 9977:ixor            
	// 5340 9978:iand            
	// 5341 9979:putfield        #327 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 5342 9982:aload_0         
	// 5343 9983:getfield        #12  <Field azh a>
	// 5344 9986:astore_1        
		abyte0.bG = ((azh) (abyte0)).ap ^ a.bG;
	// 5345 9987:aload_1         
	// 5346 9988:aload_1         
	// 5347 9989:getfield        #26  <Field int azh.ap>
	// 5348 9992:aload_0         
	// 5349 9993:getfield        #12  <Field azh a>
	// 5350 9996:getfield        #327 <Field int azh.bG>
	// 5351 9999:ixor            
	// 5352 10000:putfield        #327 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 5353 10003:aload_0         
	// 5354 10004:getfield        #12  <Field azh a>
	// 5355 10007:astore_1        
		abyte0.bG = ((azh) (abyte0)).br | a.bG;
	// 5356 10008:aload_1         
	// 5357 10009:aload_1         
	// 5358 10010:getfield        #147 <Field int azh.br>
	// 5359 10013:aload_0         
	// 5360 10014:getfield        #12  <Field azh a>
	// 5361 10017:getfield        #327 <Field int azh.bG>
	// 5362 10020:ior             
	// 5363 10021:putfield        #327 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 5364 10024:aload_0         
	// 5365 10025:getfield        #12  <Field azh a>
	// 5366 10028:astore_1        
		abyte0.bJ = ((azh) (abyte0)).cg ^ a.bJ;
	// 5367 10029:aload_1         
	// 5368 10030:aload_1         
	// 5369 10031:getfield        #114 <Field int azh.cg>
	// 5370 10034:aload_0         
	// 5371 10035:getfield        #12  <Field azh a>
	// 5372 10038:getfield        #31  <Field int azh.bJ>
	// 5373 10041:ixor            
	// 5374 10042:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 5375 10045:aload_0         
	// 5376 10046:getfield        #12  <Field azh a>
	// 5377 10049:astore_1        
		abyte0.bG = ((azh) (abyte0)).bJ ^ a.bG;
	// 5378 10050:aload_1         
	// 5379 10051:aload_1         
	// 5380 10052:getfield        #31  <Field int azh.bJ>
	// 5381 10055:aload_0         
	// 5382 10056:getfield        #12  <Field azh a>
	// 5383 10059:getfield        #327 <Field int azh.bG>
	// 5384 10062:ixor            
	// 5385 10063:putfield        #327 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 5386 10066:aload_0         
	// 5387 10067:getfield        #12  <Field azh a>
	// 5388 10070:astore_1        
		abyte0.bJ = ((azh) (abyte0)).ax & ~a.B;
	// 5389 10071:aload_1         
	// 5390 10072:aload_1         
	// 5391 10073:getfield        #246 <Field int azh.ax>
	// 5392 10076:aload_0         
	// 5393 10077:getfield        #12  <Field azh a>
	// 5394 10080:getfield        #357 <Field int azh.B>
	// 5395 10083:iconst_m1       
	// 5396 10084:ixor            
	// 5397 10085:iand            
	// 5398 10086:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 5399 10089:aload_0         
	// 5400 10090:getfield        #12  <Field azh a>
	// 5401 10093:astore_1        
		abyte0.bJ = ((azh) (abyte0)).ap ^ a.bJ;
	// 5402 10094:aload_1         
	// 5403 10095:aload_1         
	// 5404 10096:getfield        #26  <Field int azh.ap>
	// 5405 10099:aload_0         
	// 5406 10100:getfield        #12  <Field azh a>
	// 5407 10103:getfield        #31  <Field int azh.bJ>
	// 5408 10106:ixor            
	// 5409 10107:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 5410 10110:aload_0         
	// 5411 10111:getfield        #12  <Field azh a>
	// 5412 10114:astore_1        
		abyte0.bJ = ((azh) (abyte0)).br | a.bJ;
	// 5413 10115:aload_1         
	// 5414 10116:aload_1         
	// 5415 10117:getfield        #147 <Field int azh.br>
	// 5416 10120:aload_0         
	// 5417 10121:getfield        #12  <Field azh a>
	// 5418 10124:getfield        #31  <Field int azh.bJ>
	// 5419 10127:ior             
	// 5420 10128:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 5421 10131:aload_0         
	// 5422 10132:getfield        #12  <Field azh a>
	// 5423 10135:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bM ^ a.bJ;
	// 5424 10136:aload_1         
	// 5425 10137:aload_1         
	// 5426 10138:getfield        #351 <Field int azh.bM>
	// 5427 10141:aload_0         
	// 5428 10142:getfield        #12  <Field azh a>
	// 5429 10145:getfield        #31  <Field int azh.bJ>
	// 5430 10148:ixor            
	// 5431 10149:putfield        #31  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 5432 10152:aload_0         
	// 5433 10153:getfield        #12  <Field azh a>
	// 5434 10156:astore_1        
		abyte0.be = ((azh) (abyte0)).ax ^ a.be;
	// 5435 10157:aload_1         
	// 5436 10158:aload_1         
	// 5437 10159:getfield        #246 <Field int azh.ax>
	// 5438 10162:aload_0         
	// 5439 10163:getfield        #12  <Field azh a>
	// 5440 10166:getfield        #96  <Field int azh.be>
	// 5441 10169:ixor            
	// 5442 10170:putfield        #96  <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 5443 10173:aload_0         
	// 5444 10174:getfield        #12  <Field azh a>
	// 5445 10177:astore_1        
		abyte0.be = ((azh) (abyte0)).be ^ a.br;
	// 5446 10178:aload_1         
	// 5447 10179:aload_1         
	// 5448 10180:getfield        #96  <Field int azh.be>
	// 5449 10183:aload_0         
	// 5450 10184:getfield        #12  <Field azh a>
	// 5451 10187:getfield        #147 <Field int azh.br>
	// 5452 10190:ixor            
	// 5453 10191:putfield        #96  <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 5454 10194:aload_0         
	// 5455 10195:getfield        #12  <Field azh a>
	// 5456 10198:astore_1        
		abyte0.b = ((azh) (abyte0)).r & ~a.b;
	// 5457 10199:aload_1         
	// 5458 10200:aload_1         
	// 5459 10201:getfield        #360 <Field int azh.r>
	// 5460 10204:aload_0         
	// 5461 10205:getfield        #12  <Field azh a>
	// 5462 10208:getfield        #363 <Field int azh.b>
	// 5463 10211:iconst_m1       
	// 5464 10212:ixor            
	// 5465 10213:iand            
	// 5466 10214:putfield        #363 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 5467 10217:aload_0         
	// 5468 10218:getfield        #12  <Field azh a>
	// 5469 10221:astore_1        
		abyte0.z = ((azh) (abyte0)).b & ~a.z;
	// 5470 10222:aload_1         
	// 5471 10223:aload_1         
	// 5472 10224:getfield        #363 <Field int azh.b>
	// 5473 10227:aload_0         
	// 5474 10228:getfield        #12  <Field azh a>
	// 5475 10231:getfield        #366 <Field int azh.z>
	// 5476 10234:iconst_m1       
	// 5477 10235:ixor            
	// 5478 10236:iand            
	// 5479 10237:putfield        #366 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 5480 10240:aload_0         
	// 5481 10241:getfield        #12  <Field azh a>
	// 5482 10244:astore_1        
		abyte0.z = ((azh) (abyte0)).H & ~a.z;
	// 5483 10245:aload_1         
	// 5484 10246:aload_1         
	// 5485 10247:getfield        #201 <Field int azh.H>
	// 5486 10250:aload_0         
	// 5487 10251:getfield        #12  <Field azh a>
	// 5488 10254:getfield        #366 <Field int azh.z>
	// 5489 10257:iconst_m1       
	// 5490 10258:ixor            
	// 5491 10259:iand            
	// 5492 10260:putfield        #366 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 5493 10263:aload_0         
	// 5494 10264:getfield        #12  <Field azh a>
	// 5495 10267:astore_1        
		abyte0.aC = ((azh) (abyte0)).z ^ a.aC;
	// 5496 10268:aload_1         
	// 5497 10269:aload_1         
	// 5498 10270:getfield        #366 <Field int azh.z>
	// 5499 10273:aload_0         
	// 5500 10274:getfield        #12  <Field azh a>
	// 5501 10277:getfield        #369 <Field int azh.aC>
	// 5502 10280:ixor            
	// 5503 10281:putfield        #369 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 5504 10284:aload_0         
	// 5505 10285:getfield        #12  <Field azh a>
	// 5506 10288:astore_1        
		abyte0.aC = ((azh) (abyte0)).aC | a.al;
	// 5507 10289:aload_1         
	// 5508 10290:aload_1         
	// 5509 10291:getfield        #369 <Field int azh.aC>
	// 5510 10294:aload_0         
	// 5511 10295:getfield        #12  <Field azh a>
	// 5512 10298:getfield        #372 <Field int azh.al>
	// 5513 10301:ior             
	// 5514 10302:putfield        #369 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 5515 10305:aload_0         
	// 5516 10306:getfield        #12  <Field azh a>
	// 5517 10309:astore_1        
		abyte0.aC = ((azh) (abyte0)).aZ ^ a.aC;
	// 5518 10310:aload_1         
	// 5519 10311:aload_1         
	// 5520 10312:getfield        #375 <Field int azh.aZ>
	// 5521 10315:aload_0         
	// 5522 10316:getfield        #12  <Field azh a>
	// 5523 10319:getfield        #369 <Field int azh.aC>
	// 5524 10322:ixor            
	// 5525 10323:putfield        #369 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 5526 10326:aload_0         
	// 5527 10327:getfield        #12  <Field azh a>
	// 5528 10330:astore_1        
		abyte0.m = ((azh) (abyte0)).aC ^ a.m;
	// 5529 10331:aload_1         
	// 5530 10332:aload_1         
	// 5531 10333:getfield        #369 <Field int azh.aC>
	// 5532 10336:aload_0         
	// 5533 10337:getfield        #12  <Field azh a>
	// 5534 10340:getfield        #378 <Field int azh.m>
	// 5535 10343:ixor            
	// 5536 10344:putfield        #378 <Field int azh.m>
		abyte0 = ((byte []) (a));
	// 5537 10347:aload_0         
	// 5538 10348:getfield        #12  <Field azh a>
	// 5539 10351:astore_1        
		abyte0.aC = ((azh) (abyte0)).m & ~a.aX;
	// 5540 10352:aload_1         
	// 5541 10353:aload_1         
	// 5542 10354:getfield        #378 <Field int azh.m>
	// 5543 10357:aload_0         
	// 5544 10358:getfield        #12  <Field azh a>
	// 5545 10361:getfield        #381 <Field int azh.aX>
	// 5546 10364:iconst_m1       
	// 5547 10365:ixor            
	// 5548 10366:iand            
	// 5549 10367:putfield        #369 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 5550 10370:aload_0         
	// 5551 10371:getfield        #12  <Field azh a>
	// 5552 10374:astore_1        
		abyte0.aC = ((azh) (abyte0)).aC & ~a.K;
	// 5553 10375:aload_1         
	// 5554 10376:aload_1         
	// 5555 10377:getfield        #369 <Field int azh.aC>
	// 5556 10380:aload_0         
	// 5557 10381:getfield        #12  <Field azh a>
	// 5558 10384:getfield        #384 <Field int azh.K>
	// 5559 10387:iconst_m1       
	// 5560 10388:ixor            
	// 5561 10389:iand            
	// 5562 10390:putfield        #369 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 5563 10393:aload_0         
	// 5564 10394:getfield        #12  <Field azh a>
	// 5565 10397:astore_1        
		abyte0.aZ = ((azh) (abyte0)).m & a.e;
	// 5566 10398:aload_1         
	// 5567 10399:aload_1         
	// 5568 10400:getfield        #378 <Field int azh.m>
	// 5569 10403:aload_0         
	// 5570 10404:getfield        #12  <Field azh a>
	// 5571 10407:getfield        #387 <Field int azh.e>
	// 5572 10410:iand            
	// 5573 10411:putfield        #375 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 5574 10414:aload_0         
	// 5575 10415:getfield        #12  <Field azh a>
	// 5576 10418:astore_1        
		abyte0.aZ = ((azh) (abyte0)).u ^ a.aZ;
	// 5577 10419:aload_1         
	// 5578 10420:aload_1         
	// 5579 10421:getfield        #390 <Field int azh.u>
	// 5580 10424:aload_0         
	// 5581 10425:getfield        #12  <Field azh a>
	// 5582 10428:getfield        #375 <Field int azh.aZ>
	// 5583 10431:ixor            
	// 5584 10432:putfield        #375 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 5585 10435:aload_0         
	// 5586 10436:getfield        #12  <Field azh a>
	// 5587 10439:astore_1        
		abyte0.z = ((azh) (abyte0)).e ^ a.m;
	// 5588 10440:aload_1         
	// 5589 10441:aload_1         
	// 5590 10442:getfield        #387 <Field int azh.e>
	// 5591 10445:aload_0         
	// 5592 10446:getfield        #12  <Field azh a>
	// 5593 10449:getfield        #378 <Field int azh.m>
	// 5594 10452:ixor            
	// 5595 10453:putfield        #366 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 5596 10456:aload_0         
	// 5597 10457:getfield        #12  <Field azh a>
	// 5598 10460:astore_1        
		abyte0.H = ((azh) (abyte0)).m & ~a.bi;
	// 5599 10461:aload_1         
	// 5600 10462:aload_1         
	// 5601 10463:getfield        #378 <Field int azh.m>
	// 5602 10466:aload_0         
	// 5603 10467:getfield        #12  <Field azh a>
	// 5604 10470:getfield        #393 <Field int azh.bi>
	// 5605 10473:iconst_m1       
	// 5606 10474:ixor            
	// 5607 10475:iand            
	// 5608 10476:putfield        #201 <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 5609 10479:aload_0         
	// 5610 10480:getfield        #12  <Field azh a>
	// 5611 10483:astore_1        
		abyte0.H = ((azh) (abyte0)).bi ^ a.H;
	// 5612 10484:aload_1         
	// 5613 10485:aload_1         
	// 5614 10486:getfield        #393 <Field int azh.bi>
	// 5615 10489:aload_0         
	// 5616 10490:getfield        #12  <Field azh a>
	// 5617 10493:getfield        #201 <Field int azh.H>
	// 5618 10496:ixor            
	// 5619 10497:putfield        #201 <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 5620 10500:aload_0         
	// 5621 10501:getfield        #12  <Field azh a>
	// 5622 10504:astore_1        
		abyte0.H = ((azh) (abyte0)).H | a.K;
	// 5623 10505:aload_1         
	// 5624 10506:aload_1         
	// 5625 10507:getfield        #201 <Field int azh.H>
	// 5626 10510:aload_0         
	// 5627 10511:getfield        #12  <Field azh a>
	// 5628 10514:getfield        #384 <Field int azh.K>
	// 5629 10517:ior             
	// 5630 10518:putfield        #201 <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 5631 10521:aload_0         
	// 5632 10522:getfield        #12  <Field azh a>
	// 5633 10525:astore_1        
		abyte0.b = ((azh) (abyte0)).m & a.e;
	// 5634 10526:aload_1         
	// 5635 10527:aload_1         
	// 5636 10528:getfield        #378 <Field int azh.m>
	// 5637 10531:aload_0         
	// 5638 10532:getfield        #12  <Field azh a>
	// 5639 10535:getfield        #387 <Field int azh.e>
	// 5640 10538:iand            
	// 5641 10539:putfield        #363 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 5642 10542:aload_0         
	// 5643 10543:getfield        #12  <Field azh a>
	// 5644 10546:astore_1        
		abyte0.b = ((azh) (abyte0)).as ^ a.b;
	// 5645 10547:aload_1         
	// 5646 10548:aload_1         
	// 5647 10549:getfield        #396 <Field int azh.as>
	// 5648 10552:aload_0         
	// 5649 10553:getfield        #12  <Field azh a>
	// 5650 10556:getfield        #363 <Field int azh.b>
	// 5651 10559:ixor            
	// 5652 10560:putfield        #363 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 5653 10563:aload_0         
	// 5654 10564:getfield        #12  <Field azh a>
	// 5655 10567:astore_1        
		abyte0.as = ((azh) (abyte0)).m & ~a.bQ;
	// 5656 10568:aload_1         
	// 5657 10569:aload_1         
	// 5658 10570:getfield        #378 <Field int azh.m>
	// 5659 10573:aload_0         
	// 5660 10574:getfield        #12  <Field azh a>
	// 5661 10577:getfield        #399 <Field int azh.bQ>
	// 5662 10580:iconst_m1       
	// 5663 10581:ixor            
	// 5664 10582:iand            
	// 5665 10583:putfield        #396 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 5666 10586:aload_0         
	// 5667 10587:getfield        #12  <Field azh a>
	// 5668 10590:astore_1        
		abyte0.as = ((azh) (abyte0)).bi ^ a.as;
	// 5669 10591:aload_1         
	// 5670 10592:aload_1         
	// 5671 10593:getfield        #393 <Field int azh.bi>
	// 5672 10596:aload_0         
	// 5673 10597:getfield        #12  <Field azh a>
	// 5674 10600:getfield        #396 <Field int azh.as>
	// 5675 10603:ixor            
	// 5676 10604:putfield        #396 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 5677 10607:aload_0         
	// 5678 10608:getfield        #12  <Field azh a>
	// 5679 10611:astore_1        
		abyte0.r = ((azh) (abyte0)).as | a.K;
	// 5680 10612:aload_1         
	// 5681 10613:aload_1         
	// 5682 10614:getfield        #396 <Field int azh.as>
	// 5683 10617:aload_0         
	// 5684 10618:getfield        #12  <Field azh a>
	// 5685 10621:getfield        #384 <Field int azh.K>
	// 5686 10624:ior             
	// 5687 10625:putfield        #360 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 5688 10628:aload_0         
	// 5689 10629:getfield        #12  <Field azh a>
	// 5690 10632:astore_1        
		abyte0.r = ((azh) (abyte0)).z ^ a.r;
	// 5691 10633:aload_1         
	// 5692 10634:aload_1         
	// 5693 10635:getfield        #366 <Field int azh.z>
	// 5694 10638:aload_0         
	// 5695 10639:getfield        #12  <Field azh a>
	// 5696 10642:getfield        #360 <Field int azh.r>
	// 5697 10645:ixor            
	// 5698 10646:putfield        #360 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 5699 10649:aload_0         
	// 5700 10650:getfield        #12  <Field azh a>
	// 5701 10653:astore_1        
		abyte0.as = ((azh) (abyte0)).as | a.K;
	// 5702 10654:aload_1         
	// 5703 10655:aload_1         
	// 5704 10656:getfield        #396 <Field int azh.as>
	// 5705 10659:aload_0         
	// 5706 10660:getfield        #12  <Field azh a>
	// 5707 10663:getfield        #384 <Field int azh.K>
	// 5708 10666:ior             
	// 5709 10667:putfield        #396 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 5710 10670:aload_0         
	// 5711 10671:getfield        #12  <Field azh a>
	// 5712 10674:astore_1        
		abyte0.as = ((azh) (abyte0)).b ^ a.as;
	// 5713 10675:aload_1         
	// 5714 10676:aload_1         
	// 5715 10677:getfield        #363 <Field int azh.b>
	// 5716 10680:aload_0         
	// 5717 10681:getfield        #12  <Field azh a>
	// 5718 10684:getfield        #396 <Field int azh.as>
	// 5719 10687:ixor            
	// 5720 10688:putfield        #396 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 5721 10691:aload_0         
	// 5722 10692:getfield        #12  <Field azh a>
	// 5723 10695:astore_1        
		abyte0.as = ((azh) (abyte0)).C | a.as;
	// 5724 10696:aload_1         
	// 5725 10697:aload_1         
	// 5726 10698:getfield        #333 <Field int azh.C>
	// 5727 10701:aload_0         
	// 5728 10702:getfield        #12  <Field azh a>
	// 5729 10705:getfield        #396 <Field int azh.as>
	// 5730 10708:ior             
	// 5731 10709:putfield        #396 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 5732 10712:aload_0         
	// 5733 10713:getfield        #12  <Field azh a>
	// 5734 10716:astore_1        
		abyte0.b = ((azh) (abyte0)).m & ~a.u;
	// 5735 10717:aload_1         
	// 5736 10718:aload_1         
	// 5737 10719:getfield        #378 <Field int azh.m>
	// 5738 10722:aload_0         
	// 5739 10723:getfield        #12  <Field azh a>
	// 5740 10726:getfield        #390 <Field int azh.u>
	// 5741 10729:iconst_m1       
	// 5742 10730:ixor            
	// 5743 10731:iand            
	// 5744 10732:putfield        #363 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 5745 10735:aload_0         
	// 5746 10736:getfield        #12  <Field azh a>
	// 5747 10739:astore_1        
		abyte0.b = ((azh) (abyte0)).aU ^ a.b;
	// 5748 10740:aload_1         
	// 5749 10741:aload_1         
	// 5750 10742:getfield        #402 <Field int azh.aU>
	// 5751 10745:aload_0         
	// 5752 10746:getfield        #12  <Field azh a>
	// 5753 10749:getfield        #363 <Field int azh.b>
	// 5754 10752:ixor            
	// 5755 10753:putfield        #363 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 5756 10756:aload_0         
	// 5757 10757:getfield        #12  <Field azh a>
	// 5758 10760:astore_1        
		abyte0.H = ((azh) (abyte0)).b ^ a.H;
	// 5759 10761:aload_1         
	// 5760 10762:aload_1         
	// 5761 10763:getfield        #363 <Field int azh.b>
	// 5762 10766:aload_0         
	// 5763 10767:getfield        #12  <Field azh a>
	// 5764 10770:getfield        #201 <Field int azh.H>
	// 5765 10773:ixor            
	// 5766 10774:putfield        #201 <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 5767 10777:aload_0         
	// 5768 10778:getfield        #12  <Field azh a>
	// 5769 10781:astore_1        
		abyte0.ba = ((azh) (abyte0)).m & a.ba;
	// 5770 10782:aload_1         
	// 5771 10783:aload_1         
	// 5772 10784:getfield        #378 <Field int azh.m>
	// 5773 10787:aload_0         
	// 5774 10788:getfield        #12  <Field azh a>
	// 5775 10791:getfield        #405 <Field int azh.ba>
	// 5776 10794:iand            
	// 5777 10795:putfield        #405 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 5778 10798:aload_0         
	// 5779 10799:getfield        #12  <Field azh a>
	// 5780 10802:astore_1        
		abyte0.ba = ((azh) (abyte0)).K | a.ba;
	// 5781 10803:aload_1         
	// 5782 10804:aload_1         
	// 5783 10805:getfield        #384 <Field int azh.K>
	// 5784 10808:aload_0         
	// 5785 10809:getfield        #12  <Field azh a>
	// 5786 10812:getfield        #405 <Field int azh.ba>
	// 5787 10815:ior             
	// 5788 10816:putfield        #405 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 5789 10819:aload_0         
	// 5790 10820:getfield        #12  <Field azh a>
	// 5791 10823:astore_1        
		abyte0.b = ((azh) (abyte0)).m & ~a.e;
	// 5792 10824:aload_1         
	// 5793 10825:aload_1         
	// 5794 10826:getfield        #378 <Field int azh.m>
	// 5795 10829:aload_0         
	// 5796 10830:getfield        #12  <Field azh a>
	// 5797 10833:getfield        #387 <Field int azh.e>
	// 5798 10836:iconst_m1       
	// 5799 10837:ixor            
	// 5800 10838:iand            
	// 5801 10839:putfield        #363 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 5802 10842:aload_0         
	// 5803 10843:getfield        #12  <Field azh a>
	// 5804 10846:astore_1        
		abyte0.b = ((azh) (abyte0)).bQ ^ a.b;
	// 5805 10847:aload_1         
	// 5806 10848:aload_1         
	// 5807 10849:getfield        #399 <Field int azh.bQ>
	// 5808 10852:aload_0         
	// 5809 10853:getfield        #12  <Field azh a>
	// 5810 10856:getfield        #363 <Field int azh.b>
	// 5811 10859:ixor            
	// 5812 10860:putfield        #363 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 5813 10863:aload_0         
	// 5814 10864:getfield        #12  <Field azh a>
	// 5815 10867:astore_1        
		abyte0.ba = ((azh) (abyte0)).b ^ a.ba;
	// 5816 10868:aload_1         
	// 5817 10869:aload_1         
	// 5818 10870:getfield        #363 <Field int azh.b>
	// 5819 10873:aload_0         
	// 5820 10874:getfield        #12  <Field azh a>
	// 5821 10877:getfield        #405 <Field int azh.ba>
	// 5822 10880:ixor            
	// 5823 10881:putfield        #405 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 5824 10884:aload_0         
	// 5825 10885:getfield        #12  <Field azh a>
	// 5826 10888:astore_1        
		abyte0.as = ((azh) (abyte0)).ba ^ a.as;
	// 5827 10889:aload_1         
	// 5828 10890:aload_1         
	// 5829 10891:getfield        #405 <Field int azh.ba>
	// 5830 10894:aload_0         
	// 5831 10895:getfield        #12  <Field azh a>
	// 5832 10898:getfield        #396 <Field int azh.as>
	// 5833 10901:ixor            
	// 5834 10902:putfield        #396 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 5835 10905:aload_0         
	// 5836 10906:getfield        #12  <Field azh a>
	// 5837 10909:astore_1        
		abyte0.bz = ((azh) (abyte0)).m & ~a.bz;
	// 5838 10910:aload_1         
	// 5839 10911:aload_1         
	// 5840 10912:getfield        #378 <Field int azh.m>
	// 5841 10915:aload_0         
	// 5842 10916:getfield        #12  <Field azh a>
	// 5843 10919:getfield        #408 <Field int azh.bz>
	// 5844 10922:iconst_m1       
	// 5845 10923:ixor            
	// 5846 10924:iand            
	// 5847 10925:putfield        #408 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 5848 10928:aload_0         
	// 5849 10929:getfield        #12  <Field azh a>
	// 5850 10932:astore_1        
		abyte0.bz = ((azh) (abyte0)).aX ^ a.bz;
	// 5851 10933:aload_1         
	// 5852 10934:aload_1         
	// 5853 10935:getfield        #381 <Field int azh.aX>
	// 5854 10938:aload_0         
	// 5855 10939:getfield        #12  <Field azh a>
	// 5856 10942:getfield        #408 <Field int azh.bz>
	// 5857 10945:ixor            
	// 5858 10946:putfield        #408 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 5859 10949:aload_0         
	// 5860 10950:getfield        #12  <Field azh a>
	// 5861 10953:astore_1        
		abyte0.aC = ((azh) (abyte0)).bz ^ a.aC;
	// 5862 10954:aload_1         
	// 5863 10955:aload_1         
	// 5864 10956:getfield        #408 <Field int azh.bz>
	// 5865 10959:aload_0         
	// 5866 10960:getfield        #12  <Field azh a>
	// 5867 10963:getfield        #369 <Field int azh.aC>
	// 5868 10966:ixor            
	// 5869 10967:putfield        #369 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 5870 10970:aload_0         
	// 5871 10971:getfield        #12  <Field azh a>
	// 5872 10974:astore_1        
		abyte0.bz = ((azh) (abyte0)).m & ~a.bQ;
	// 5873 10975:aload_1         
	// 5874 10976:aload_1         
	// 5875 10977:getfield        #378 <Field int azh.m>
	// 5876 10980:aload_0         
	// 5877 10981:getfield        #12  <Field azh a>
	// 5878 10984:getfield        #399 <Field int azh.bQ>
	// 5879 10987:iconst_m1       
	// 5880 10988:ixor            
	// 5881 10989:iand            
	// 5882 10990:putfield        #408 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 5883 10993:aload_0         
	// 5884 10994:getfield        #12  <Field azh a>
	// 5885 10997:astore_1        
		abyte0.bz = ((azh) (abyte0)).bz & ~a.K;
	// 5886 10998:aload_1         
	// 5887 10999:aload_1         
	// 5888 11000:getfield        #408 <Field int azh.bz>
	// 5889 11003:aload_0         
	// 5890 11004:getfield        #12  <Field azh a>
	// 5891 11007:getfield        #384 <Field int azh.K>
	// 5892 11010:iconst_m1       
	// 5893 11011:ixor            
	// 5894 11012:iand            
	// 5895 11013:putfield        #408 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 5896 11016:aload_0         
	// 5897 11017:getfield        #12  <Field azh a>
	// 5898 11020:astore_1        
		abyte0.bz = ((azh) (abyte0)).aZ ^ a.bz;
	// 5899 11021:aload_1         
	// 5900 11022:aload_1         
	// 5901 11023:getfield        #375 <Field int azh.aZ>
	// 5902 11026:aload_0         
	// 5903 11027:getfield        #12  <Field azh a>
	// 5904 11030:getfield        #408 <Field int azh.bz>
	// 5905 11033:ixor            
	// 5906 11034:putfield        #408 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 5907 11037:aload_0         
	// 5908 11038:getfield        #12  <Field azh a>
	// 5909 11041:astore_1        
		abyte0.bz = ((azh) (abyte0)).bz & ~a.C;
	// 5910 11042:aload_1         
	// 5911 11043:aload_1         
	// 5912 11044:getfield        #408 <Field int azh.bz>
	// 5913 11047:aload_0         
	// 5914 11048:getfield        #12  <Field azh a>
	// 5915 11051:getfield        #333 <Field int azh.C>
	// 5916 11054:iconst_m1       
	// 5917 11055:ixor            
	// 5918 11056:iand            
	// 5919 11057:putfield        #408 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 5920 11060:aload_0         
	// 5921 11061:getfield        #12  <Field azh a>
	// 5922 11064:astore_1        
		abyte0.bz = ((azh) (abyte0)).r ^ a.bz;
	// 5923 11065:aload_1         
	// 5924 11066:aload_1         
	// 5925 11067:getfield        #360 <Field int azh.r>
	// 5926 11070:aload_0         
	// 5927 11071:getfield        #12  <Field azh a>
	// 5928 11074:getfield        #408 <Field int azh.bz>
	// 5929 11077:ixor            
	// 5930 11078:putfield        #408 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 5931 11081:aload_0         
	// 5932 11082:getfield        #12  <Field azh a>
	// 5933 11085:astore_1        
		abyte0.bQ = ((azh) (abyte0)).m & a.bQ;
	// 5934 11086:aload_1         
	// 5935 11087:aload_1         
	// 5936 11088:getfield        #378 <Field int azh.m>
	// 5937 11091:aload_0         
	// 5938 11092:getfield        #12  <Field azh a>
	// 5939 11095:getfield        #399 <Field int azh.bQ>
	// 5940 11098:iand            
	// 5941 11099:putfield        #399 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 5942 11102:aload_0         
	// 5943 11103:getfield        #12  <Field azh a>
	// 5944 11106:astore_1        
		abyte0.bQ = ((azh) (abyte0)).bi ^ a.bQ;
	// 5945 11107:aload_1         
	// 5946 11108:aload_1         
	// 5947 11109:getfield        #393 <Field int azh.bi>
	// 5948 11112:aload_0         
	// 5949 11113:getfield        #12  <Field azh a>
	// 5950 11116:getfield        #399 <Field int azh.bQ>
	// 5951 11119:ixor            
	// 5952 11120:putfield        #399 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 5953 11123:aload_0         
	// 5954 11124:getfield        #12  <Field azh a>
	// 5955 11127:astore_1        
		abyte0.az = ((azh) (abyte0)).bQ ^ a.az;
	// 5956 11128:aload_1         
	// 5957 11129:aload_1         
	// 5958 11130:getfield        #399 <Field int azh.bQ>
	// 5959 11133:aload_0         
	// 5960 11134:getfield        #12  <Field azh a>
	// 5961 11137:getfield        #411 <Field int azh.az>
	// 5962 11140:ixor            
	// 5963 11141:putfield        #411 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 5964 11144:aload_0         
	// 5965 11145:getfield        #12  <Field azh a>
	// 5966 11148:astore_1        
		abyte0.az = ((azh) (abyte0)).C | a.az;
	// 5967 11149:aload_1         
	// 5968 11150:aload_1         
	// 5969 11151:getfield        #333 <Field int azh.C>
	// 5970 11154:aload_0         
	// 5971 11155:getfield        #12  <Field azh a>
	// 5972 11158:getfield        #411 <Field int azh.az>
	// 5973 11161:ior             
	// 5974 11162:putfield        #411 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 5975 11165:aload_0         
	// 5976 11166:getfield        #12  <Field azh a>
	// 5977 11169:astore_1        
		abyte0.az = ((azh) (abyte0)).H ^ a.az;
	// 5978 11170:aload_1         
	// 5979 11171:aload_1         
	// 5980 11172:getfield        #201 <Field int azh.H>
	// 5981 11175:aload_0         
	// 5982 11176:getfield        #12  <Field azh a>
	// 5983 11179:getfield        #411 <Field int azh.az>
	// 5984 11182:ixor            
	// 5985 11183:putfield        #411 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 5986 11186:aload_0         
	// 5987 11187:getfield        #12  <Field azh a>
	// 5988 11190:astore_1        
		abyte0.H = ((azh) (abyte0)).ag & ~a.az;
	// 5989 11191:aload_1         
	// 5990 11192:aload_1         
	// 5991 11193:getfield        #414 <Field int azh.ag>
	// 5992 11196:aload_0         
	// 5993 11197:getfield        #12  <Field azh a>
	// 5994 11200:getfield        #411 <Field int azh.az>
	// 5995 11203:iconst_m1       
	// 5996 11204:ixor            
	// 5997 11205:iand            
	// 5998 11206:putfield        #201 <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 5999 11209:aload_0         
	// 6000 11210:getfield        #12  <Field azh a>
	// 6001 11213:astore_1        
		abyte0.H = ((azh) (abyte0)).as ^ a.H;
	// 6002 11214:aload_1         
	// 6003 11215:aload_1         
	// 6004 11216:getfield        #396 <Field int azh.as>
	// 6005 11219:aload_0         
	// 6006 11220:getfield        #12  <Field azh a>
	// 6007 11223:getfield        #201 <Field int azh.H>
	// 6008 11226:ixor            
	// 6009 11227:putfield        #201 <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 6010 11230:aload_0         
	// 6011 11231:getfield        #12  <Field azh a>
	// 6012 11234:astore_1        
		abyte0.al = ((azh) (abyte0)).H ^ a.al;
	// 6013 11235:aload_1         
	// 6014 11236:aload_1         
	// 6015 11237:getfield        #201 <Field int azh.H>
	// 6016 11240:aload_0         
	// 6017 11241:getfield        #12  <Field azh a>
	// 6018 11244:getfield        #372 <Field int azh.al>
	// 6019 11247:ixor            
	// 6020 11248:putfield        #372 <Field int azh.al>
		abyte0 = ((byte []) (a));
	// 6021 11251:aload_0         
	// 6022 11252:getfield        #12  <Field azh a>
	// 6023 11255:astore_1        
		abyte0.H = ((azh) (abyte0)).F & ~a.al;
	// 6024 11256:aload_1         
	// 6025 11257:aload_1         
	// 6026 11258:getfield        #306 <Field int azh.F>
	// 6027 11261:aload_0         
	// 6028 11262:getfield        #12  <Field azh a>
	// 6029 11265:getfield        #372 <Field int azh.al>
	// 6030 11268:iconst_m1       
	// 6031 11269:ixor            
	// 6032 11270:iand            
	// 6033 11271:putfield        #201 <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 6034 11274:aload_0         
	// 6035 11275:getfield        #12  <Field azh a>
	// 6036 11278:astore_1        
		abyte0.bi = ((azh) (abyte0)).N & ~a.H;
	// 6037 11279:aload_1         
	// 6038 11280:aload_1         
	// 6039 11281:getfield        #324 <Field int azh.N>
	// 6040 11284:aload_0         
	// 6041 11285:getfield        #12  <Field azh a>
	// 6042 11288:getfield        #201 <Field int azh.H>
	// 6043 11291:iconst_m1       
	// 6044 11292:ixor            
	// 6045 11293:iand            
	// 6046 11294:putfield        #393 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 6047 11297:aload_0         
	// 6048 11298:getfield        #12  <Field azh a>
	// 6049 11301:astore_1        
		abyte0.r = ((azh) (abyte0)).H ^ a.N;
	// 6050 11302:aload_1         
	// 6051 11303:aload_1         
	// 6052 11304:getfield        #201 <Field int azh.H>
	// 6053 11307:aload_0         
	// 6054 11308:getfield        #12  <Field azh a>
	// 6055 11311:getfield        #324 <Field int azh.N>
	// 6056 11314:ixor            
	// 6057 11315:putfield        #360 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 6058 11318:aload_0         
	// 6059 11319:getfield        #12  <Field azh a>
	// 6060 11322:astore_1        
		abyte0.r = ((azh) (abyte0)).r & ~a.ad;
	// 6061 11323:aload_1         
	// 6062 11324:aload_1         
	// 6063 11325:getfield        #360 <Field int azh.r>
	// 6064 11328:aload_0         
	// 6065 11329:getfield        #12  <Field azh a>
	// 6066 11332:getfield        #339 <Field int azh.ad>
	// 6067 11335:iconst_m1       
	// 6068 11336:ixor            
	// 6069 11337:iand            
	// 6070 11338:putfield        #360 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 6071 11341:aload_0         
	// 6072 11342:getfield        #12  <Field azh a>
	// 6073 11345:astore_1        
		abyte0.aZ = ((azh) (abyte0)).N & a.H;
	// 6074 11346:aload_1         
	// 6075 11347:aload_1         
	// 6076 11348:getfield        #324 <Field int azh.N>
	// 6077 11351:aload_0         
	// 6078 11352:getfield        #12  <Field azh a>
	// 6079 11355:getfield        #201 <Field int azh.H>
	// 6080 11358:iand            
	// 6081 11359:putfield        #375 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 6082 11362:aload_0         
	// 6083 11363:getfield        #12  <Field azh a>
	// 6084 11366:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aZ & ~a.ad;
	// 6085 11367:aload_1         
	// 6086 11368:aload_1         
	// 6087 11369:getfield        #375 <Field int azh.aZ>
	// 6088 11372:aload_0         
	// 6089 11373:getfield        #12  <Field azh a>
	// 6090 11376:getfield        #339 <Field int azh.ad>
	// 6091 11379:iconst_m1       
	// 6092 11380:ixor            
	// 6093 11381:iand            
	// 6094 11382:putfield        #375 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 6095 11385:aload_0         
	// 6096 11386:getfield        #12  <Field azh a>
	// 6097 11389:astore_1        
		abyte0.aZ = ((azh) (abyte0)).H ^ a.aZ;
	// 6098 11390:aload_1         
	// 6099 11391:aload_1         
	// 6100 11392:getfield        #201 <Field int azh.H>
	// 6101 11395:aload_0         
	// 6102 11396:getfield        #12  <Field azh a>
	// 6103 11399:getfield        #375 <Field int azh.aZ>
	// 6104 11402:ixor            
	// 6105 11403:putfield        #375 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 6106 11406:aload_0         
	// 6107 11407:getfield        #12  <Field azh a>
	// 6108 11410:astore_1        
		abyte0.aX = ((azh) (abyte0)).F & ~a.H;
	// 6109 11411:aload_1         
	// 6110 11412:aload_1         
	// 6111 11413:getfield        #306 <Field int azh.F>
	// 6112 11416:aload_0         
	// 6113 11417:getfield        #12  <Field azh a>
	// 6114 11420:getfield        #201 <Field int azh.H>
	// 6115 11423:iconst_m1       
	// 6116 11424:ixor            
	// 6117 11425:iand            
	// 6118 11426:putfield        #381 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 6119 11429:aload_0         
	// 6120 11430:getfield        #12  <Field azh a>
	// 6121 11433:astore_1        
		abyte0.ba = ((azh) (abyte0)).N & ~a.aX;
	// 6122 11434:aload_1         
	// 6123 11435:aload_1         
	// 6124 11436:getfield        #324 <Field int azh.N>
	// 6125 11439:aload_0         
	// 6126 11440:getfield        #12  <Field azh a>
	// 6127 11443:getfield        #381 <Field int azh.aX>
	// 6128 11446:iconst_m1       
	// 6129 11447:ixor            
	// 6130 11448:iand            
	// 6131 11449:putfield        #405 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 6132 11452:aload_0         
	// 6133 11453:getfield        #12  <Field azh a>
	// 6134 11456:astore_1        
		abyte0.ba = ((azh) (abyte0)).aX ^ a.ba;
	// 6135 11457:aload_1         
	// 6136 11458:aload_1         
	// 6137 11459:getfield        #381 <Field int azh.aX>
	// 6138 11462:aload_0         
	// 6139 11463:getfield        #12  <Field azh a>
	// 6140 11466:getfield        #405 <Field int azh.ba>
	// 6141 11469:ixor            
	// 6142 11470:putfield        #405 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 6143 11473:aload_0         
	// 6144 11474:getfield        #12  <Field azh a>
	// 6145 11477:astore_1        
		abyte0.aX = ((azh) (abyte0)).N & ~a.aX;
	// 6146 11478:aload_1         
	// 6147 11479:aload_1         
	// 6148 11480:getfield        #324 <Field int azh.N>
	// 6149 11483:aload_0         
	// 6150 11484:getfield        #12  <Field azh a>
	// 6151 11487:getfield        #381 <Field int azh.aX>
	// 6152 11490:iconst_m1       
	// 6153 11491:ixor            
	// 6154 11492:iand            
	// 6155 11493:putfield        #381 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 6156 11496:aload_0         
	// 6157 11497:getfield        #12  <Field azh a>
	// 6158 11500:astore_1        
		abyte0.aX = ((azh) (abyte0)).ad | a.aX;
	// 6159 11501:aload_1         
	// 6160 11502:aload_1         
	// 6161 11503:getfield        #339 <Field int azh.ad>
	// 6162 11506:aload_0         
	// 6163 11507:getfield        #12  <Field azh a>
	// 6164 11510:getfield        #381 <Field int azh.aX>
	// 6165 11513:ior             
	// 6166 11514:putfield        #381 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 6167 11517:aload_0         
	// 6168 11518:getfield        #12  <Field azh a>
	// 6169 11521:astore_1        
		abyte0.b = ((azh) (abyte0)).N & ~a.H;
	// 6170 11522:aload_1         
	// 6171 11523:aload_1         
	// 6172 11524:getfield        #324 <Field int azh.N>
	// 6173 11527:aload_0         
	// 6174 11528:getfield        #12  <Field azh a>
	// 6175 11531:getfield        #201 <Field int azh.H>
	// 6176 11534:iconst_m1       
	// 6177 11535:ixor            
	// 6178 11536:iand            
	// 6179 11537:putfield        #363 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 6180 11540:aload_0         
	// 6181 11541:getfield        #12  <Field azh a>
	// 6182 11544:astore_1        
		abyte0.aU = ((azh) (abyte0)).al ^ a.F;
	// 6183 11545:aload_1         
	// 6184 11546:aload_1         
	// 6185 11547:getfield        #372 <Field int azh.al>
	// 6186 11550:aload_0         
	// 6187 11551:getfield        #12  <Field azh a>
	// 6188 11554:getfield        #306 <Field int azh.F>
	// 6189 11557:ixor            
	// 6190 11558:putfield        #402 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 6191 11561:aload_0         
	// 6192 11562:getfield        #12  <Field azh a>
	// 6193 11565:astore_1        
		abyte0.z = ((azh) (abyte0)).N & a.aU;
	// 6194 11566:aload_1         
	// 6195 11567:aload_1         
	// 6196 11568:getfield        #324 <Field int azh.N>
	// 6197 11571:aload_0         
	// 6198 11572:getfield        #12  <Field azh a>
	// 6199 11575:getfield        #402 <Field int azh.aU>
	// 6200 11578:iand            
	// 6201 11579:putfield        #366 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 6202 11582:aload_0         
	// 6203 11583:getfield        #12  <Field azh a>
	// 6204 11586:astore_1        
		abyte0.z = ((azh) (abyte0)).H ^ a.z;
	// 6205 11587:aload_1         
	// 6206 11588:aload_1         
	// 6207 11589:getfield        #201 <Field int azh.H>
	// 6208 11592:aload_0         
	// 6209 11593:getfield        #12  <Field azh a>
	// 6210 11596:getfield        #366 <Field int azh.z>
	// 6211 11599:ixor            
	// 6212 11600:putfield        #366 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 6213 11603:aload_0         
	// 6214 11604:getfield        #12  <Field azh a>
	// 6215 11607:astore_1        
		abyte0.bM = ((azh) (abyte0)).N & a.aU;
	// 6216 11608:aload_1         
	// 6217 11609:aload_1         
	// 6218 11610:getfield        #324 <Field int azh.N>
	// 6219 11613:aload_0         
	// 6220 11614:getfield        #12  <Field azh a>
	// 6221 11617:getfield        #402 <Field int azh.aU>
	// 6222 11620:iand            
	// 6223 11621:putfield        #351 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 6224 11624:aload_0         
	// 6225 11625:getfield        #12  <Field azh a>
	// 6226 11628:astore_1        
		abyte0.ap = ((azh) (abyte0)).aU ^ a.N;
	// 6227 11629:aload_1         
	// 6228 11630:aload_1         
	// 6229 11631:getfield        #402 <Field int azh.aU>
	// 6230 11634:aload_0         
	// 6231 11635:getfield        #12  <Field azh a>
	// 6232 11638:getfield        #324 <Field int azh.N>
	// 6233 11641:ixor            
	// 6234 11642:putfield        #26  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 6235 11645:aload_0         
	// 6236 11646:getfield        #12  <Field azh a>
	// 6237 11649:astore_1        
		abyte0.ap = ((azh) (abyte0)).ap & ~a.ad;
	// 6238 11650:aload_1         
	// 6239 11651:aload_1         
	// 6240 11652:getfield        #26  <Field int azh.ap>
	// 6241 11655:aload_0         
	// 6242 11656:getfield        #12  <Field azh a>
	// 6243 11659:getfield        #339 <Field int azh.ad>
	// 6244 11662:iconst_m1       
	// 6245 11663:ixor            
	// 6246 11664:iand            
	// 6247 11665:putfield        #26  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 6248 11668:aload_0         
	// 6249 11669:getfield        #12  <Field azh a>
	// 6250 11672:astore_1        
		abyte0.bi = ((azh) (abyte0)).aU ^ a.bi;
	// 6251 11673:aload_1         
	// 6252 11674:aload_1         
	// 6253 11675:getfield        #402 <Field int azh.aU>
	// 6254 11678:aload_0         
	// 6255 11679:getfield        #12  <Field azh a>
	// 6256 11682:getfield        #393 <Field int azh.bi>
	// 6257 11685:ixor            
	// 6258 11686:putfield        #393 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 6259 11689:aload_0         
	// 6260 11690:getfield        #12  <Field azh a>
	// 6261 11693:astore_1        
		abyte0.aX = ((azh) (abyte0)).bi ^ a.aX;
	// 6262 11694:aload_1         
	// 6263 11695:aload_1         
	// 6264 11696:getfield        #393 <Field int azh.bi>
	// 6265 11699:aload_0         
	// 6266 11700:getfield        #12  <Field azh a>
	// 6267 11703:getfield        #381 <Field int azh.aX>
	// 6268 11706:ixor            
	// 6269 11707:putfield        #381 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 6270 11710:aload_0         
	// 6271 11711:getfield        #12  <Field azh a>
	// 6272 11714:astore_1        
		abyte0.aU = ((azh) (abyte0)).N & ~a.aU;
	// 6273 11715:aload_1         
	// 6274 11716:aload_1         
	// 6275 11717:getfield        #324 <Field int azh.N>
	// 6276 11720:aload_0         
	// 6277 11721:getfield        #12  <Field azh a>
	// 6278 11724:getfield        #402 <Field int azh.aU>
	// 6279 11727:iconst_m1       
	// 6280 11728:ixor            
	// 6281 11729:iand            
	// 6282 11730:putfield        #402 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 6283 11733:aload_0         
	// 6284 11734:getfield        #12  <Field azh a>
	// 6285 11737:astore_1        
		abyte0.aU = ((azh) (abyte0)).H ^ a.aU;
	// 6286 11738:aload_1         
	// 6287 11739:aload_1         
	// 6288 11740:getfield        #201 <Field int azh.H>
	// 6289 11743:aload_0         
	// 6290 11744:getfield        #12  <Field azh a>
	// 6291 11747:getfield        #402 <Field int azh.aU>
	// 6292 11750:ixor            
	// 6293 11751:putfield        #402 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 6294 11754:aload_0         
	// 6295 11755:getfield        #12  <Field azh a>
	// 6296 11758:astore_1        
		abyte0.W = ((azh) (abyte0)).aU ^ a.W;
	// 6297 11759:aload_1         
	// 6298 11760:aload_1         
	// 6299 11761:getfield        #402 <Field int azh.aU>
	// 6300 11764:aload_0         
	// 6301 11765:getfield        #12  <Field azh a>
	// 6302 11768:getfield        #342 <Field int azh.W>
	// 6303 11771:ixor            
	// 6304 11772:putfield        #342 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 6305 11775:aload_0         
	// 6306 11776:getfield        #12  <Field azh a>
	// 6307 11779:astore_1        
		abyte0.W = ((azh) (abyte0)).V & ~a.W;
	// 6308 11780:aload_1         
	// 6309 11781:aload_1         
	// 6310 11782:getfield        #417 <Field int azh.V>
	// 6311 11785:aload_0         
	// 6312 11786:getfield        #12  <Field azh a>
	// 6313 11789:getfield        #342 <Field int azh.W>
	// 6314 11792:iconst_m1       
	// 6315 11793:ixor            
	// 6316 11794:iand            
	// 6317 11795:putfield        #342 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 6318 11798:aload_0         
	// 6319 11799:getfield        #12  <Field azh a>
	// 6320 11802:astore_1        
		abyte0.aU = ((azh) (abyte0)).al & a.F;
	// 6321 11803:aload_1         
	// 6322 11804:aload_1         
	// 6323 11805:getfield        #372 <Field int azh.al>
	// 6324 11808:aload_0         
	// 6325 11809:getfield        #12  <Field azh a>
	// 6326 11812:getfield        #306 <Field int azh.F>
	// 6327 11815:iand            
	// 6328 11816:putfield        #402 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 6329 11819:aload_0         
	// 6330 11820:getfield        #12  <Field azh a>
	// 6331 11823:astore_1        
		abyte0.aU = ((azh) (abyte0)).N & a.aU;
	// 6332 11824:aload_1         
	// 6333 11825:aload_1         
	// 6334 11826:getfield        #324 <Field int azh.N>
	// 6335 11829:aload_0         
	// 6336 11830:getfield        #12  <Field azh a>
	// 6337 11833:getfield        #402 <Field int azh.aU>
	// 6338 11836:iand            
	// 6339 11837:putfield        #402 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 6340 11840:aload_0         
	// 6341 11841:getfield        #12  <Field azh a>
	// 6342 11844:astore_1        
		abyte0.aU = ((azh) (abyte0)).F ^ a.aU;
	// 6343 11845:aload_1         
	// 6344 11846:aload_1         
	// 6345 11847:getfield        #306 <Field int azh.F>
	// 6346 11850:aload_0         
	// 6347 11851:getfield        #12  <Field azh a>
	// 6348 11854:getfield        #402 <Field int azh.aU>
	// 6349 11857:ixor            
	// 6350 11858:putfield        #402 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 6351 11861:aload_0         
	// 6352 11862:getfield        #12  <Field azh a>
	// 6353 11865:astore_1        
		abyte0.aU = ((azh) (abyte0)).ad | a.aU;
	// 6354 11866:aload_1         
	// 6355 11867:aload_1         
	// 6356 11868:getfield        #339 <Field int azh.ad>
	// 6357 11871:aload_0         
	// 6358 11872:getfield        #12  <Field azh a>
	// 6359 11875:getfield        #402 <Field int azh.aU>
	// 6360 11878:ior             
	// 6361 11879:putfield        #402 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 6362 11882:aload_0         
	// 6363 11883:getfield        #12  <Field azh a>
	// 6364 11886:astore_1        
		abyte0.H = ((azh) (abyte0)).N & ~a.al;
	// 6365 11887:aload_1         
	// 6366 11888:aload_1         
	// 6367 11889:getfield        #324 <Field int azh.N>
	// 6368 11892:aload_0         
	// 6369 11893:getfield        #12  <Field azh a>
	// 6370 11896:getfield        #372 <Field int azh.al>
	// 6371 11899:iconst_m1       
	// 6372 11900:ixor            
	// 6373 11901:iand            
	// 6374 11902:putfield        #201 <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 6375 11905:aload_0         
	// 6376 11906:getfield        #12  <Field azh a>
	// 6377 11909:astore_1        
		abyte0.aU = ((azh) (abyte0)).H ^ a.aU;
	// 6378 11910:aload_1         
	// 6379 11911:aload_1         
	// 6380 11912:getfield        #201 <Field int azh.H>
	// 6381 11915:aload_0         
	// 6382 11916:getfield        #12  <Field azh a>
	// 6383 11919:getfield        #402 <Field int azh.aU>
	// 6384 11922:ixor            
	// 6385 11923:putfield        #402 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 6386 11926:aload_0         
	// 6387 11927:getfield        #12  <Field azh a>
	// 6388 11930:astore_1        
		abyte0.bu = ((azh) (abyte0)).al & ~a.bu;
	// 6389 11931:aload_1         
	// 6390 11932:aload_1         
	// 6391 11933:getfield        #372 <Field int azh.al>
	// 6392 11936:aload_0         
	// 6393 11937:getfield        #12  <Field azh a>
	// 6394 11940:getfield        #180 <Field int azh.bu>
	// 6395 11943:iconst_m1       
	// 6396 11944:ixor            
	// 6397 11945:iand            
	// 6398 11946:putfield        #180 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 6399 11949:aload_0         
	// 6400 11950:getfield        #12  <Field azh a>
	// 6401 11953:astore_1        
		abyte0.bu = ((azh) (abyte0)).am ^ a.bu;
	// 6402 11954:aload_1         
	// 6403 11955:aload_1         
	// 6404 11956:getfield        #40  <Field int azh.am>
	// 6405 11959:aload_0         
	// 6406 11960:getfield        #12  <Field azh a>
	// 6407 11963:getfield        #180 <Field int azh.bu>
	// 6408 11966:ixor            
	// 6409 11967:putfield        #180 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 6410 11970:aload_0         
	// 6411 11971:getfield        #12  <Field azh a>
	// 6412 11974:astore_1        
		abyte0.m = ((azh) (abyte0)).bu ^ a.m;
	// 6413 11975:aload_1         
	// 6414 11976:aload_1         
	// 6415 11977:getfield        #180 <Field int azh.bu>
	// 6416 11980:aload_0         
	// 6417 11981:getfield        #12  <Field azh a>
	// 6418 11984:getfield        #378 <Field int azh.m>
	// 6419 11987:ixor            
	// 6420 11988:putfield        #378 <Field int azh.m>
		abyte0 = ((byte []) (a));
	// 6421 11991:aload_0         
	// 6422 11992:getfield        #12  <Field azh a>
	// 6423 11995:astore_1        
		abyte0.ci = ((azh) (abyte0)).ci & ~a.al;
	// 6424 11996:aload_1         
	// 6425 11997:aload_1         
	// 6426 11998:getfield        #186 <Field int azh.ci>
	// 6427 12001:aload_0         
	// 6428 12002:getfield        #12  <Field azh a>
	// 6429 12005:getfield        #372 <Field int azh.al>
	// 6430 12008:iconst_m1       
	// 6431 12009:ixor            
	// 6432 12010:iand            
	// 6433 12011:putfield        #186 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 6434 12014:aload_0         
	// 6435 12015:getfield        #12  <Field azh a>
	// 6436 12018:astore_1        
		abyte0.ci = ((azh) (abyte0)).aI ^ a.ci;
	// 6437 12019:aload_1         
	// 6438 12020:aload_1         
	// 6439 12021:getfield        #189 <Field int azh.aI>
	// 6440 12024:aload_0         
	// 6441 12025:getfield        #12  <Field azh a>
	// 6442 12028:getfield        #186 <Field int azh.ci>
	// 6443 12031:ixor            
	// 6444 12032:putfield        #186 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 6445 12035:aload_0         
	// 6446 12036:getfield        #12  <Field azh a>
	// 6447 12039:astore_1        
		abyte0.E = ((azh) (abyte0)).ci ^ a.E;
	// 6448 12040:aload_1         
	// 6449 12041:aload_1         
	// 6450 12042:getfield        #186 <Field int azh.ci>
	// 6451 12045:aload_0         
	// 6452 12046:getfield        #12  <Field azh a>
	// 6453 12049:getfield        #76  <Field int azh.E>
	// 6454 12052:ixor            
	// 6455 12053:putfield        #76  <Field int azh.E>
		abyte0 = ((byte []) (a));
	// 6456 12056:aload_0         
	// 6457 12057:getfield        #12  <Field azh a>
	// 6458 12060:astore_1        
		abyte0.ci = ((azh) (abyte0)).al | a.F;
	// 6459 12061:aload_1         
	// 6460 12062:aload_1         
	// 6461 12063:getfield        #372 <Field int azh.al>
	// 6462 12066:aload_0         
	// 6463 12067:getfield        #12  <Field azh a>
	// 6464 12070:getfield        #306 <Field int azh.F>
	// 6465 12073:ior             
	// 6466 12074:putfield        #186 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 6467 12077:aload_0         
	// 6468 12078:getfield        #12  <Field azh a>
	// 6469 12081:astore_1        
		abyte0.bo = ((azh) (abyte0)).ci ^ a.bo;
	// 6470 12082:aload_1         
	// 6471 12083:aload_1         
	// 6472 12084:getfield        #186 <Field int azh.ci>
	// 6473 12087:aload_0         
	// 6474 12088:getfield        #12  <Field azh a>
	// 6475 12091:getfield        #420 <Field int azh.bo>
	// 6476 12094:ixor            
	// 6477 12095:putfield        #420 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 6478 12098:aload_0         
	// 6479 12099:getfield        #12  <Field azh a>
	// 6480 12102:astore_1        
		abyte0.bu = ((azh) (abyte0)).ad & ~a.bo;
	// 6481 12103:aload_1         
	// 6482 12104:aload_1         
	// 6483 12105:getfield        #339 <Field int azh.ad>
	// 6484 12108:aload_0         
	// 6485 12109:getfield        #12  <Field azh a>
	// 6486 12112:getfield        #420 <Field int azh.bo>
	// 6487 12115:iconst_m1       
	// 6488 12116:ixor            
	// 6489 12117:iand            
	// 6490 12118:putfield        #180 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 6491 12121:aload_0         
	// 6492 12122:getfield        #12  <Field azh a>
	// 6493 12125:astore_1        
		abyte0.bu = ((azh) (abyte0)).ba ^ a.bu;
	// 6494 12126:aload_1         
	// 6495 12127:aload_1         
	// 6496 12128:getfield        #405 <Field int azh.ba>
	// 6497 12131:aload_0         
	// 6498 12132:getfield        #12  <Field azh a>
	// 6499 12135:getfield        #180 <Field int azh.bu>
	// 6500 12138:ixor            
	// 6501 12139:putfield        #180 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 6502 12142:aload_0         
	// 6503 12143:getfield        #12  <Field azh a>
	// 6504 12146:astore_1        
		abyte0.bu = ((azh) (abyte0)).V & ~a.bu;
	// 6505 12147:aload_1         
	// 6506 12148:aload_1         
	// 6507 12149:getfield        #417 <Field int azh.V>
	// 6508 12152:aload_0         
	// 6509 12153:getfield        #12  <Field azh a>
	// 6510 12156:getfield        #180 <Field int azh.bu>
	// 6511 12159:iconst_m1       
	// 6512 12160:ixor            
	// 6513 12161:iand            
	// 6514 12162:putfield        #180 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 6515 12165:aload_0         
	// 6516 12166:getfield        #12  <Field azh a>
	// 6517 12169:astore_1        
		abyte0.bo = ((azh) (abyte0)).ad | a.bo;
	// 6518 12170:aload_1         
	// 6519 12171:aload_1         
	// 6520 12172:getfield        #339 <Field int azh.ad>
	// 6521 12175:aload_0         
	// 6522 12176:getfield        #12  <Field azh a>
	// 6523 12179:getfield        #420 <Field int azh.bo>
	// 6524 12182:ior             
	// 6525 12183:putfield        #420 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 6526 12186:aload_0         
	// 6527 12187:getfield        #12  <Field azh a>
	// 6528 12190:astore_1        
		abyte0.am = ((azh) (abyte0)).ad & ~a.ci;
	// 6529 12191:aload_1         
	// 6530 12192:aload_1         
	// 6531 12193:getfield        #339 <Field int azh.ad>
	// 6532 12196:aload_0         
	// 6533 12197:getfield        #12  <Field azh a>
	// 6534 12200:getfield        #186 <Field int azh.ci>
	// 6535 12203:iconst_m1       
	// 6536 12204:ixor            
	// 6537 12205:iand            
	// 6538 12206:putfield        #40  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 6539 12209:aload_0         
	// 6540 12210:getfield        #12  <Field azh a>
	// 6541 12213:astore_1        
		abyte0.am = ((azh) (abyte0)).bi ^ a.am;
	// 6542 12214:aload_1         
	// 6543 12215:aload_1         
	// 6544 12216:getfield        #393 <Field int azh.bi>
	// 6545 12219:aload_0         
	// 6546 12220:getfield        #12  <Field azh a>
	// 6547 12223:getfield        #40  <Field int azh.am>
	// 6548 12226:ixor            
	// 6549 12227:putfield        #40  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 6550 12230:aload_0         
	// 6551 12231:getfield        #12  <Field azh a>
	// 6552 12234:astore_1        
		abyte0.am = ((azh) (abyte0)).V & a.am;
	// 6553 12235:aload_1         
	// 6554 12236:aload_1         
	// 6555 12237:getfield        #417 <Field int azh.V>
	// 6556 12240:aload_0         
	// 6557 12241:getfield        #12  <Field azh a>
	// 6558 12244:getfield        #40  <Field int azh.am>
	// 6559 12247:iand            
	// 6560 12248:putfield        #40  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 6561 12251:aload_0         
	// 6562 12252:getfield        #12  <Field azh a>
	// 6563 12255:astore_1        
		abyte0.bi = ((azh) (abyte0)).N & a.al;
	// 6564 12256:aload_1         
	// 6565 12257:aload_1         
	// 6566 12258:getfield        #324 <Field int azh.N>
	// 6567 12261:aload_0         
	// 6568 12262:getfield        #12  <Field azh a>
	// 6569 12265:getfield        #372 <Field int azh.al>
	// 6570 12268:iand            
	// 6571 12269:putfield        #393 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 6572 12272:aload_0         
	// 6573 12273:getfield        #12  <Field azh a>
	// 6574 12276:astore_1        
		abyte0.bh = ((azh) (abyte0)).al & ~a.bh;
	// 6575 12277:aload_1         
	// 6576 12278:aload_1         
	// 6577 12279:getfield        #372 <Field int azh.al>
	// 6578 12282:aload_0         
	// 6579 12283:getfield        #12  <Field azh a>
	// 6580 12286:getfield        #111 <Field int azh.bh>
	// 6581 12289:iconst_m1       
	// 6582 12290:ixor            
	// 6583 12291:iand            
	// 6584 12292:putfield        #111 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 6585 12295:aload_0         
	// 6586 12296:getfield        #12  <Field azh a>
	// 6587 12299:astore_1        
		abyte0.bh = ((azh) (abyte0)).aI ^ a.bh;
	// 6588 12300:aload_1         
	// 6589 12301:aload_1         
	// 6590 12302:getfield        #189 <Field int azh.aI>
	// 6591 12305:aload_0         
	// 6592 12306:getfield        #12  <Field azh a>
	// 6593 12309:getfield        #111 <Field int azh.bh>
	// 6594 12312:ixor            
	// 6595 12313:putfield        #111 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 6596 12316:aload_0         
	// 6597 12317:getfield        #12  <Field azh a>
	// 6598 12320:astore_1        
		abyte0.A = ((azh) (abyte0)).bh ^ a.A;
	// 6599 12321:aload_1         
	// 6600 12322:aload_1         
	// 6601 12323:getfield        #111 <Field int azh.bh>
	// 6602 12326:aload_0         
	// 6603 12327:getfield        #12  <Field azh a>
	// 6604 12330:getfield        #423 <Field int azh.A>
	// 6605 12333:ixor            
	// 6606 12334:putfield        #423 <Field int azh.A>
		abyte0 = ((byte []) (a));
	// 6607 12337:aload_0         
	// 6608 12338:getfield        #12  <Field azh a>
	// 6609 12341:astore_1        
		abyte0.bh = ((azh) (abyte0)).Y & a.A;
	// 6610 12342:aload_1         
	// 6611 12343:aload_1         
	// 6612 12344:getfield        #330 <Field int azh.Y>
	// 6613 12347:aload_0         
	// 6614 12348:getfield        #12  <Field azh a>
	// 6615 12351:getfield        #423 <Field int azh.A>
	// 6616 12354:iand            
	// 6617 12355:putfield        #111 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 6618 12358:aload_0         
	// 6619 12359:getfield        #12  <Field azh a>
	// 6620 12362:astore_1        
		abyte0.aI = ((azh) (abyte0)).I ^ a.A;
	// 6621 12363:aload_1         
	// 6622 12364:aload_1         
	// 6623 12365:getfield        #28  <Field int azh.I>
	// 6624 12368:aload_0         
	// 6625 12369:getfield        #12  <Field azh a>
	// 6626 12372:getfield        #423 <Field int azh.A>
	// 6627 12375:ixor            
	// 6628 12376:putfield        #189 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 6629 12379:aload_0         
	// 6630 12380:getfield        #12  <Field azh a>
	// 6631 12383:astore_1        
		abyte0.H = ((azh) (abyte0)).I & a.A;
	// 6632 12384:aload_1         
	// 6633 12385:aload_1         
	// 6634 12386:getfield        #28  <Field int azh.I>
	// 6635 12389:aload_0         
	// 6636 12390:getfield        #12  <Field azh a>
	// 6637 12393:getfield        #423 <Field int azh.A>
	// 6638 12396:iand            
	// 6639 12397:putfield        #201 <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 6640 12400:aload_0         
	// 6641 12401:getfield        #12  <Field azh a>
	// 6642 12404:astore_1        
		abyte0.cg = ((azh) (abyte0)).I & ~a.A;
	// 6643 12405:aload_1         
	// 6644 12406:aload_1         
	// 6645 12407:getfield        #28  <Field int azh.I>
	// 6646 12410:aload_0         
	// 6647 12411:getfield        #12  <Field azh a>
	// 6648 12414:getfield        #423 <Field int azh.A>
	// 6649 12417:iconst_m1       
	// 6650 12418:ixor            
	// 6651 12419:iand            
	// 6652 12420:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 6653 12423:aload_0         
	// 6654 12424:getfield        #12  <Field azh a>
	// 6655 12427:astore_1        
		abyte0.bk = ((azh) (abyte0)).A | a.cg;
	// 6656 12428:aload_1         
	// 6657 12429:aload_1         
	// 6658 12430:getfield        #423 <Field int azh.A>
	// 6659 12433:aload_0         
	// 6660 12434:getfield        #12  <Field azh a>
	// 6661 12437:getfield        #114 <Field int azh.cg>
	// 6662 12440:ior             
	// 6663 12441:putfield        #49  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 6664 12444:aload_0         
	// 6665 12445:getfield        #12  <Field azh a>
	// 6666 12448:astore_1        
		abyte0.ce = ((azh) (abyte0)).A & ~a.I;
	// 6667 12449:aload_1         
	// 6668 12450:aload_1         
	// 6669 12451:getfield        #423 <Field int azh.A>
	// 6670 12454:aload_0         
	// 6671 12455:getfield        #12  <Field azh a>
	// 6672 12458:getfield        #28  <Field int azh.I>
	// 6673 12461:iconst_m1       
	// 6674 12462:ixor            
	// 6675 12463:iand            
	// 6676 12464:putfield        #87  <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 6677 12467:aload_0         
	// 6678 12468:getfield        #12  <Field azh a>
	// 6679 12471:astore_1        
		abyte0.aO = ((azh) (abyte0)).A | a.I;
	// 6680 12472:aload_1         
	// 6681 12473:aload_1         
	// 6682 12474:getfield        #423 <Field int azh.A>
	// 6683 12477:aload_0         
	// 6684 12478:getfield        #12  <Field azh a>
	// 6685 12481:getfield        #28  <Field int azh.I>
	// 6686 12484:ior             
	// 6687 12485:putfield        #255 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 6688 12488:aload_0         
	// 6689 12489:getfield        #12  <Field azh a>
	// 6690 12492:astore_1        
		abyte0.aq = ((azh) (abyte0)).N & ~a.al;
	// 6691 12493:aload_1         
	// 6692 12494:aload_1         
	// 6693 12495:getfield        #324 <Field int azh.N>
	// 6694 12498:aload_0         
	// 6695 12499:getfield        #12  <Field azh a>
	// 6696 12502:getfield        #372 <Field int azh.al>
	// 6697 12505:iconst_m1       
	// 6698 12506:ixor            
	// 6699 12507:iand            
	// 6700 12508:putfield        #300 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 6701 12511:aload_0         
	// 6702 12512:getfield        #12  <Field azh a>
	// 6703 12515:astore_1        
		abyte0.aq = ((azh) (abyte0)).al ^ a.aq;
	// 6704 12516:aload_1         
	// 6705 12517:aload_1         
	// 6706 12518:getfield        #372 <Field int azh.al>
	// 6707 12521:aload_0         
	// 6708 12522:getfield        #12  <Field azh a>
	// 6709 12525:getfield        #300 <Field int azh.aq>
	// 6710 12528:ixor            
	// 6711 12529:putfield        #300 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 6712 12532:aload_0         
	// 6713 12533:getfield        #12  <Field azh a>
	// 6714 12536:astore_1        
		abyte0.bm = ((azh) (abyte0)).aq & ~a.ad;
	// 6715 12537:aload_1         
	// 6716 12538:aload_1         
	// 6717 12539:getfield        #300 <Field int azh.aq>
	// 6718 12542:aload_0         
	// 6719 12543:getfield        #12  <Field azh a>
	// 6720 12546:getfield        #339 <Field int azh.ad>
	// 6721 12549:iconst_m1       
	// 6722 12550:ixor            
	// 6723 12551:iand            
	// 6724 12552:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 6725 12555:aload_0         
	// 6726 12556:getfield        #12  <Field azh a>
	// 6727 12559:astore_1        
		abyte0.cc = ((azh) (abyte0)).al & a.cc;
	// 6728 12560:aload_1         
	// 6729 12561:aload_1         
	// 6730 12562:getfield        #372 <Field int azh.al>
	// 6731 12565:aload_0         
	// 6732 12566:getfield        #12  <Field azh a>
	// 6733 12569:getfield        #192 <Field int azh.cc>
	// 6734 12572:iand            
	// 6735 12573:putfield        #192 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 6736 12576:aload_0         
	// 6737 12577:getfield        #12  <Field azh a>
	// 6738 12580:astore_1        
		abyte0.cc = ((azh) (abyte0)).s ^ a.cc;
	// 6739 12581:aload_1         
	// 6740 12582:aload_1         
	// 6741 12583:getfield        #117 <Field int azh.s>
	// 6742 12586:aload_0         
	// 6743 12587:getfield        #12  <Field azh a>
	// 6744 12590:getfield        #192 <Field int azh.cc>
	// 6745 12593:ixor            
	// 6746 12594:putfield        #192 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 6747 12597:aload_0         
	// 6748 12598:getfield        #12  <Field azh a>
	// 6749 12601:astore_1        
		abyte0.O = ((azh) (abyte0)).cc ^ a.O;
	// 6750 12602:aload_1         
	// 6751 12603:aload_1         
	// 6752 12604:getfield        #192 <Field int azh.cc>
	// 6753 12607:aload_0         
	// 6754 12608:getfield        #12  <Field azh a>
	// 6755 12611:getfield        #426 <Field int azh.O>
	// 6756 12614:ixor            
	// 6757 12615:putfield        #426 <Field int azh.O>
		abyte0 = ((byte []) (a));
	// 6758 12618:aload_0         
	// 6759 12619:getfield        #12  <Field azh a>
	// 6760 12622:astore_1        
		abyte0.bt = ((azh) (abyte0)).al ^ a.bt;
	// 6761 12623:aload_1         
	// 6762 12624:aload_1         
	// 6763 12625:getfield        #372 <Field int azh.al>
	// 6764 12628:aload_0         
	// 6765 12629:getfield        #12  <Field azh a>
	// 6766 12632:getfield        #429 <Field int azh.bt>
	// 6767 12635:ixor            
	// 6768 12636:putfield        #429 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 6769 12639:aload_0         
	// 6770 12640:getfield        #12  <Field azh a>
	// 6771 12643:astore_1        
		abyte0.aN = ((azh) (abyte0)).bt ^ a.aN;
	// 6772 12644:aload_1         
	// 6773 12645:aload_1         
	// 6774 12646:getfield        #429 <Field int azh.bt>
	// 6775 12649:aload_0         
	// 6776 12650:getfield        #12  <Field azh a>
	// 6777 12653:getfield        #345 <Field int azh.aN>
	// 6778 12656:ixor            
	// 6779 12657:putfield        #345 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 6780 12660:aload_0         
	// 6781 12661:getfield        #12  <Field azh a>
	// 6782 12664:astore_1        
		abyte0.ap = ((azh) (abyte0)).bt ^ a.ap;
	// 6783 12665:aload_1         
	// 6784 12666:aload_1         
	// 6785 12667:getfield        #429 <Field int azh.bt>
	// 6786 12670:aload_0         
	// 6787 12671:getfield        #12  <Field azh a>
	// 6788 12674:getfield        #26  <Field int azh.ap>
	// 6789 12677:ixor            
	// 6790 12678:putfield        #26  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 6791 12681:aload_0         
	// 6792 12682:getfield        #12  <Field azh a>
	// 6793 12685:astore_1        
		abyte0.ap = ((azh) (abyte0)).V & a.ap;
	// 6794 12686:aload_1         
	// 6795 12687:aload_1         
	// 6796 12688:getfield        #417 <Field int azh.V>
	// 6797 12691:aload_0         
	// 6798 12692:getfield        #12  <Field azh a>
	// 6799 12695:getfield        #26  <Field int azh.ap>
	// 6800 12698:iand            
	// 6801 12699:putfield        #26  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 6802 12702:aload_0         
	// 6803 12703:getfield        #12  <Field azh a>
	// 6804 12706:astore_1        
		abyte0.ap = ((azh) (abyte0)).aN ^ a.ap;
	// 6805 12707:aload_1         
	// 6806 12708:aload_1         
	// 6807 12709:getfield        #345 <Field int azh.aN>
	// 6808 12712:aload_0         
	// 6809 12713:getfield        #12  <Field azh a>
	// 6810 12716:getfield        #26  <Field int azh.ap>
	// 6811 12719:ixor            
	// 6812 12720:putfield        #26  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 6813 12723:aload_0         
	// 6814 12724:getfield        #12  <Field azh a>
	// 6815 12727:astore_1        
		abyte0.aN = ((azh) (abyte0)).al & ~a.F;
	// 6816 12728:aload_1         
	// 6817 12729:aload_1         
	// 6818 12730:getfield        #372 <Field int azh.al>
	// 6819 12733:aload_0         
	// 6820 12734:getfield        #12  <Field azh a>
	// 6821 12737:getfield        #306 <Field int azh.F>
	// 6822 12740:iconst_m1       
	// 6823 12741:ixor            
	// 6824 12742:iand            
	// 6825 12743:putfield        #345 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 6826 12746:aload_0         
	// 6827 12747:getfield        #12  <Field azh a>
	// 6828 12750:astore_1        
		abyte0.bM = ((azh) (abyte0)).aN ^ a.bM;
	// 6829 12751:aload_1         
	// 6830 12752:aload_1         
	// 6831 12753:getfield        #345 <Field int azh.aN>
	// 6832 12756:aload_0         
	// 6833 12757:getfield        #12  <Field azh a>
	// 6834 12760:getfield        #351 <Field int azh.bM>
	// 6835 12763:ixor            
	// 6836 12764:putfield        #351 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 6837 12767:aload_0         
	// 6838 12768:getfield        #12  <Field azh a>
	// 6839 12771:astore_1        
		abyte0.r = ((azh) (abyte0)).bM ^ a.r;
	// 6840 12772:aload_1         
	// 6841 12773:aload_1         
	// 6842 12774:getfield        #351 <Field int azh.bM>
	// 6843 12777:aload_0         
	// 6844 12778:getfield        #12  <Field azh a>
	// 6845 12781:getfield        #360 <Field int azh.r>
	// 6846 12784:ixor            
	// 6847 12785:putfield        #360 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 6848 12788:aload_0         
	// 6849 12789:getfield        #12  <Field azh a>
	// 6850 12792:astore_1        
		abyte0.W = ((azh) (abyte0)).r ^ a.W;
	// 6851 12793:aload_1         
	// 6852 12794:aload_1         
	// 6853 12795:getfield        #360 <Field int azh.r>
	// 6854 12798:aload_0         
	// 6855 12799:getfield        #12  <Field azh a>
	// 6856 12802:getfield        #342 <Field int azh.W>
	// 6857 12805:ixor            
	// 6858 12806:putfield        #342 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 6859 12809:aload_0         
	// 6860 12810:getfield        #12  <Field azh a>
	// 6861 12813:astore_1        
		abyte0.bv = ((azh) (abyte0)).aN ^ a.bv;
	// 6862 12814:aload_1         
	// 6863 12815:aload_1         
	// 6864 12816:getfield        #345 <Field int azh.aN>
	// 6865 12819:aload_0         
	// 6866 12820:getfield        #12  <Field azh a>
	// 6867 12823:getfield        #432 <Field int azh.bv>
	// 6868 12826:ixor            
	// 6869 12827:putfield        #432 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6870 12830:aload_0         
	// 6871 12831:getfield        #12  <Field azh a>
	// 6872 12834:astore_1        
		abyte0.bv = ((azh) (abyte0)).bv & ~a.ad;
	// 6873 12835:aload_1         
	// 6874 12836:aload_1         
	// 6875 12837:getfield        #432 <Field int azh.bv>
	// 6876 12840:aload_0         
	// 6877 12841:getfield        #12  <Field azh a>
	// 6878 12844:getfield        #339 <Field int azh.ad>
	// 6879 12847:iconst_m1       
	// 6880 12848:ixor            
	// 6881 12849:iand            
	// 6882 12850:putfield        #432 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6883 12853:aload_0         
	// 6884 12854:getfield        #12  <Field azh a>
	// 6885 12857:astore_1        
		abyte0.bv = ((azh) (abyte0)).z ^ a.bv;
	// 6886 12858:aload_1         
	// 6887 12859:aload_1         
	// 6888 12860:getfield        #366 <Field int azh.z>
	// 6889 12863:aload_0         
	// 6890 12864:getfield        #12  <Field azh a>
	// 6891 12867:getfield        #432 <Field int azh.bv>
	// 6892 12870:ixor            
	// 6893 12871:putfield        #432 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6894 12874:aload_0         
	// 6895 12875:getfield        #12  <Field azh a>
	// 6896 12878:astore_1        
		abyte0.bv = ((azh) (abyte0)).V & a.bv;
	// 6897 12879:aload_1         
	// 6898 12880:aload_1         
	// 6899 12881:getfield        #417 <Field int azh.V>
	// 6900 12884:aload_0         
	// 6901 12885:getfield        #12  <Field azh a>
	// 6902 12888:getfield        #432 <Field int azh.bv>
	// 6903 12891:iand            
	// 6904 12892:putfield        #432 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6905 12895:aload_0         
	// 6906 12896:getfield        #12  <Field azh a>
	// 6907 12899:astore_1        
		abyte0.bv = ((azh) (abyte0)).aZ ^ a.bv;
	// 6908 12900:aload_1         
	// 6909 12901:aload_1         
	// 6910 12902:getfield        #375 <Field int azh.aZ>
	// 6911 12905:aload_0         
	// 6912 12906:getfield        #12  <Field azh a>
	// 6913 12909:getfield        #432 <Field int azh.bv>
	// 6914 12912:ixor            
	// 6915 12913:putfield        #432 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6916 12916:aload_0         
	// 6917 12917:getfield        #12  <Field azh a>
	// 6918 12920:astore_1        
		abyte0.bv = ((azh) (abyte0)).aL | a.bv;
	// 6919 12921:aload_1         
	// 6920 12922:aload_1         
	// 6921 12923:getfield        #171 <Field int azh.aL>
	// 6922 12926:aload_0         
	// 6923 12927:getfield        #12  <Field azh a>
	// 6924 12930:getfield        #432 <Field int azh.bv>
	// 6925 12933:ior             
	// 6926 12934:putfield        #432 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6927 12937:aload_0         
	// 6928 12938:getfield        #12  <Field azh a>
	// 6929 12941:astore_1        
		abyte0.bi = ((azh) (abyte0)).aN ^ a.bi;
	// 6930 12942:aload_1         
	// 6931 12943:aload_1         
	// 6932 12944:getfield        #345 <Field int azh.aN>
	// 6933 12947:aload_0         
	// 6934 12948:getfield        #12  <Field azh a>
	// 6935 12951:getfield        #393 <Field int azh.bi>
	// 6936 12954:ixor            
	// 6937 12955:putfield        #393 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 6938 12958:aload_0         
	// 6939 12959:getfield        #12  <Field azh a>
	// 6940 12962:astore_1        
		abyte0.bi = ((azh) (abyte0)).V & ~a.bi;
	// 6941 12963:aload_1         
	// 6942 12964:aload_1         
	// 6943 12965:getfield        #417 <Field int azh.V>
	// 6944 12968:aload_0         
	// 6945 12969:getfield        #12  <Field azh a>
	// 6946 12972:getfield        #393 <Field int azh.bi>
	// 6947 12975:iconst_m1       
	// 6948 12976:ixor            
	// 6949 12977:iand            
	// 6950 12978:putfield        #393 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 6951 12981:aload_0         
	// 6952 12982:getfield        #12  <Field azh a>
	// 6953 12985:astore_1        
		abyte0.bi = ((azh) (abyte0)).aX ^ a.bi;
	// 6954 12986:aload_1         
	// 6955 12987:aload_1         
	// 6956 12988:getfield        #381 <Field int azh.aX>
	// 6957 12991:aload_0         
	// 6958 12992:getfield        #12  <Field azh a>
	// 6959 12995:getfield        #393 <Field int azh.bi>
	// 6960 12998:ixor            
	// 6961 12999:putfield        #393 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 6962 13002:aload_0         
	// 6963 13003:getfield        #12  <Field azh a>
	// 6964 13006:astore_1        
		abyte0.bv = ((azh) (abyte0)).bi ^ a.bv;
	// 6965 13007:aload_1         
	// 6966 13008:aload_1         
	// 6967 13009:getfield        #393 <Field int azh.bi>
	// 6968 13012:aload_0         
	// 6969 13013:getfield        #12  <Field azh a>
	// 6970 13016:getfield        #432 <Field int azh.bv>
	// 6971 13019:ixor            
	// 6972 13020:putfield        #432 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6973 13023:aload_0         
	// 6974 13024:getfield        #12  <Field azh a>
	// 6975 13027:astore_1        
		abyte0.i = ((azh) (abyte0)).bv ^ a.i;
	// 6976 13028:aload_1         
	// 6977 13029:aload_1         
	// 6978 13030:getfield        #432 <Field int azh.bv>
	// 6979 13033:aload_0         
	// 6980 13034:getfield        #12  <Field azh a>
	// 6981 13037:getfield        #435 <Field int azh.i>
	// 6982 13040:ixor            
	// 6983 13041:putfield        #435 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 6984 13044:aload_0         
	// 6985 13045:getfield        #12  <Field azh a>
	// 6986 13048:astore_1        
		abyte0.bv = ((azh) (abyte0)).N & a.aN;
	// 6987 13049:aload_1         
	// 6988 13050:aload_1         
	// 6989 13051:getfield        #324 <Field int azh.N>
	// 6990 13054:aload_0         
	// 6991 13055:getfield        #12  <Field azh a>
	// 6992 13058:getfield        #345 <Field int azh.aN>
	// 6993 13061:iand            
	// 6994 13062:putfield        #432 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6995 13065:aload_0         
	// 6996 13066:getfield        #12  <Field azh a>
	// 6997 13069:astore_1        
		abyte0.bv = ((azh) (abyte0)).aN ^ a.bv;
	// 6998 13070:aload_1         
	// 6999 13071:aload_1         
	// 7000 13072:getfield        #345 <Field int azh.aN>
	// 7001 13075:aload_0         
	// 7002 13076:getfield        #12  <Field azh a>
	// 7003 13079:getfield        #432 <Field int azh.bv>
	// 7004 13082:ixor            
	// 7005 13083:putfield        #432 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 7006 13086:aload_0         
	// 7007 13087:getfield        #12  <Field azh a>
	// 7008 13090:astore_1        
		abyte0.bv = ((azh) (abyte0)).bv & ~a.ad;
	// 7009 13091:aload_1         
	// 7010 13092:aload_1         
	// 7011 13093:getfield        #432 <Field int azh.bv>
	// 7012 13096:aload_0         
	// 7013 13097:getfield        #12  <Field azh a>
	// 7014 13100:getfield        #339 <Field int azh.ad>
	// 7015 13103:iconst_m1       
	// 7016 13104:ixor            
	// 7017 13105:iand            
	// 7018 13106:putfield        #432 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 7019 13109:aload_0         
	// 7020 13110:getfield        #12  <Field azh a>
	// 7021 13113:astore_1        
		abyte0.bv = ((azh) (abyte0)).ci ^ a.bv;
	// 7022 13114:aload_1         
	// 7023 13115:aload_1         
	// 7024 13116:getfield        #186 <Field int azh.ci>
	// 7025 13119:aload_0         
	// 7026 13120:getfield        #12  <Field azh a>
	// 7027 13123:getfield        #432 <Field int azh.bv>
	// 7028 13126:ixor            
	// 7029 13127:putfield        #432 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 7030 13130:aload_0         
	// 7031 13131:getfield        #12  <Field azh a>
	// 7032 13134:astore_1        
		abyte0.bu = ((azh) (abyte0)).bv ^ a.bu;
	// 7033 13135:aload_1         
	// 7034 13136:aload_1         
	// 7035 13137:getfield        #432 <Field int azh.bv>
	// 7036 13140:aload_0         
	// 7037 13141:getfield        #12  <Field azh a>
	// 7038 13144:getfield        #180 <Field int azh.bu>
	// 7039 13147:ixor            
	// 7040 13148:putfield        #180 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 7041 13151:aload_0         
	// 7042 13152:getfield        #12  <Field azh a>
	// 7043 13155:astore_1        
		abyte0.bu = ((azh) (abyte0)).bu & ~a.aL;
	// 7044 13156:aload_1         
	// 7045 13157:aload_1         
	// 7046 13158:getfield        #180 <Field int azh.bu>
	// 7047 13161:aload_0         
	// 7048 13162:getfield        #12  <Field azh a>
	// 7049 13165:getfield        #171 <Field int azh.aL>
	// 7050 13168:iconst_m1       
	// 7051 13169:ixor            
	// 7052 13170:iand            
	// 7053 13171:putfield        #180 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 7054 13174:aload_0         
	// 7055 13175:getfield        #12  <Field azh a>
	// 7056 13178:astore_1        
		abyte0.bu = ((azh) (abyte0)).W ^ a.bu;
	// 7057 13179:aload_1         
	// 7058 13180:aload_1         
	// 7059 13181:getfield        #342 <Field int azh.W>
	// 7060 13184:aload_0         
	// 7061 13185:getfield        #12  <Field azh a>
	// 7062 13188:getfield        #180 <Field int azh.bu>
	// 7063 13191:ixor            
	// 7064 13192:putfield        #180 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 7065 13195:aload_0         
	// 7066 13196:getfield        #12  <Field azh a>
	// 7067 13199:astore_1        
		abyte0.bu = ((azh) (abyte0)).bu ^ a.ag;
	// 7068 13200:aload_1         
	// 7069 13201:aload_1         
	// 7070 13202:getfield        #180 <Field int azh.bu>
	// 7071 13205:aload_0         
	// 7072 13206:getfield        #12  <Field azh a>
	// 7073 13209:getfield        #414 <Field int azh.ag>
	// 7074 13212:ixor            
	// 7075 13213:putfield        #180 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 7076 13216:aload_0         
	// 7077 13217:getfield        #12  <Field azh a>
	// 7078 13220:astore_1        
		abyte0.b = ((azh) (abyte0)).aN ^ a.b;
	// 7079 13221:aload_1         
	// 7080 13222:aload_1         
	// 7081 13223:getfield        #345 <Field int azh.aN>
	// 7082 13226:aload_0         
	// 7083 13227:getfield        #12  <Field azh a>
	// 7084 13230:getfield        #363 <Field int azh.b>
	// 7085 13233:ixor            
	// 7086 13234:putfield        #363 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 7087 13237:aload_0         
	// 7088 13238:getfield        #12  <Field azh a>
	// 7089 13241:astore_1        
		abyte0.bm = ((azh) (abyte0)).b ^ a.bm;
	// 7090 13242:aload_1         
	// 7091 13243:aload_1         
	// 7092 13244:getfield        #363 <Field int azh.b>
	// 7093 13247:aload_0         
	// 7094 13248:getfield        #12  <Field azh a>
	// 7095 13251:getfield        #70  <Field int azh.bm>
	// 7096 13254:ixor            
	// 7097 13255:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 7098 13258:aload_0         
	// 7099 13259:getfield        #12  <Field azh a>
	// 7100 13262:astore_1        
		abyte0.am = ((azh) (abyte0)).bm ^ a.am;
	// 7101 13263:aload_1         
	// 7102 13264:aload_1         
	// 7103 13265:getfield        #70  <Field int azh.bm>
	// 7104 13268:aload_0         
	// 7105 13269:getfield        #12  <Field azh a>
	// 7106 13272:getfield        #40  <Field int azh.am>
	// 7107 13275:ixor            
	// 7108 13276:putfield        #40  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 7109 13279:aload_0         
	// 7110 13280:getfield        #12  <Field azh a>
	// 7111 13283:astore_1        
		abyte0.aN = ((azh) (abyte0)).F | a.aN;
	// 7112 13284:aload_1         
	// 7113 13285:aload_1         
	// 7114 13286:getfield        #306 <Field int azh.F>
	// 7115 13289:aload_0         
	// 7116 13290:getfield        #12  <Field azh a>
	// 7117 13293:getfield        #345 <Field int azh.aN>
	// 7118 13296:ior             
	// 7119 13297:putfield        #345 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 7120 13300:aload_0         
	// 7121 13301:getfield        #12  <Field azh a>
	// 7122 13304:astore_1        
		abyte0.bm = ((azh) (abyte0)).aN ^ a.N;
	// 7123 13305:aload_1         
	// 7124 13306:aload_1         
	// 7125 13307:getfield        #345 <Field int azh.aN>
	// 7126 13310:aload_0         
	// 7127 13311:getfield        #12  <Field azh a>
	// 7128 13314:getfield        #324 <Field int azh.N>
	// 7129 13317:ixor            
	// 7130 13318:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 7131 13321:aload_0         
	// 7132 13322:getfield        #12  <Field azh a>
	// 7133 13325:astore_1        
		abyte0.bm = ((azh) (abyte0)).bm & ~a.ad;
	// 7134 13326:aload_1         
	// 7135 13327:aload_1         
	// 7136 13328:getfield        #70  <Field int azh.bm>
	// 7137 13331:aload_0         
	// 7138 13332:getfield        #12  <Field azh a>
	// 7139 13335:getfield        #339 <Field int azh.ad>
	// 7140 13338:iconst_m1       
	// 7141 13339:ixor            
	// 7142 13340:iand            
	// 7143 13341:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 7144 13344:aload_0         
	// 7145 13345:getfield        #12  <Field azh a>
	// 7146 13348:astore_1        
		abyte0.bm = ((azh) (abyte0)).aq ^ a.bm;
	// 7147 13349:aload_1         
	// 7148 13350:aload_1         
	// 7149 13351:getfield        #300 <Field int azh.aq>
	// 7150 13354:aload_0         
	// 7151 13355:getfield        #12  <Field azh a>
	// 7152 13358:getfield        #70  <Field int azh.bm>
	// 7153 13361:ixor            
	// 7154 13362:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 7155 13365:aload_0         
	// 7156 13366:getfield        #12  <Field azh a>
	// 7157 13369:astore_1        
		abyte0.bm = ((azh) (abyte0)).V & ~a.bm;
	// 7158 13370:aload_1         
	// 7159 13371:aload_1         
	// 7160 13372:getfield        #417 <Field int azh.V>
	// 7161 13375:aload_0         
	// 7162 13376:getfield        #12  <Field azh a>
	// 7163 13379:getfield        #70  <Field int azh.bm>
	// 7164 13382:iconst_m1       
	// 7165 13383:ixor            
	// 7166 13384:iand            
	// 7167 13385:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 7168 13388:aload_0         
	// 7169 13389:getfield        #12  <Field azh a>
	// 7170 13392:astore_1        
		abyte0.bm = ((azh) (abyte0)).aU ^ a.bm;
	// 7171 13393:aload_1         
	// 7172 13394:aload_1         
	// 7173 13395:getfield        #402 <Field int azh.aU>
	// 7174 13398:aload_0         
	// 7175 13399:getfield        #12  <Field azh a>
	// 7176 13402:getfield        #70  <Field int azh.bm>
	// 7177 13405:ixor            
	// 7178 13406:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 7179 13409:aload_0         
	// 7180 13410:getfield        #12  <Field azh a>
	// 7181 13413:astore_1        
		abyte0.bm = ((azh) (abyte0)).aL | a.bm;
	// 7182 13414:aload_1         
	// 7183 13415:aload_1         
	// 7184 13416:getfield        #171 <Field int azh.aL>
	// 7185 13419:aload_0         
	// 7186 13420:getfield        #12  <Field azh a>
	// 7187 13423:getfield        #70  <Field int azh.bm>
	// 7188 13426:ior             
	// 7189 13427:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 7190 13430:aload_0         
	// 7191 13431:getfield        #12  <Field azh a>
	// 7192 13434:astore_1        
		abyte0.bm = ((azh) (abyte0)).ap ^ a.bm;
	// 7193 13435:aload_1         
	// 7194 13436:aload_1         
	// 7195 13437:getfield        #26  <Field int azh.ap>
	// 7196 13440:aload_0         
	// 7197 13441:getfield        #12  <Field azh a>
	// 7198 13444:getfield        #70  <Field int azh.bm>
	// 7199 13447:ixor            
	// 7200 13448:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 7201 13451:aload_0         
	// 7202 13452:getfield        #12  <Field azh a>
	// 7203 13455:astore_1        
		abyte0.ai = ((azh) (abyte0)).bm ^ a.ai;
	// 7204 13456:aload_1         
	// 7205 13457:aload_1         
	// 7206 13458:getfield        #70  <Field int azh.bm>
	// 7207 13461:aload_0         
	// 7208 13462:getfield        #12  <Field azh a>
	// 7209 13465:getfield        #129 <Field int azh.ai>
	// 7210 13468:ixor            
	// 7211 13469:putfield        #129 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 7212 13472:aload_0         
	// 7213 13473:getfield        #12  <Field azh a>
	// 7214 13476:astore_1        
		abyte0.bm = ((azh) (abyte0)).E | a.ai;
	// 7215 13477:aload_1         
	// 7216 13478:aload_1         
	// 7217 13479:getfield        #76  <Field int azh.E>
	// 7218 13482:aload_0         
	// 7219 13483:getfield        #12  <Field azh a>
	// 7220 13486:getfield        #129 <Field int azh.ai>
	// 7221 13489:ior             
	// 7222 13490:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 7223 13493:aload_0         
	// 7224 13494:getfield        #12  <Field azh a>
	// 7225 13497:astore_1        
		abyte0.bm = ((azh) (abyte0)).ai ^ a.bm;
	// 7226 13498:aload_1         
	// 7227 13499:aload_1         
	// 7228 13500:getfield        #129 <Field int azh.ai>
	// 7229 13503:aload_0         
	// 7230 13504:getfield        #12  <Field azh a>
	// 7231 13507:getfield        #70  <Field int azh.bm>
	// 7232 13510:ixor            
	// 7233 13511:putfield        #70  <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 7234 13514:aload_0         
	// 7235 13515:getfield        #12  <Field azh a>
	// 7236 13518:astore_1        
		abyte0.ap = ((azh) (abyte0)).ai & ~a.E;
	// 7237 13519:aload_1         
	// 7238 13520:aload_1         
	// 7239 13521:getfield        #129 <Field int azh.ai>
	// 7240 13524:aload_0         
	// 7241 13525:getfield        #12  <Field azh a>
	// 7242 13528:getfield        #76  <Field int azh.E>
	// 7243 13531:iconst_m1       
	// 7244 13532:ixor            
	// 7245 13533:iand            
	// 7246 13534:putfield        #26  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 7247 13537:aload_0         
	// 7248 13538:getfield        #12  <Field azh a>
	// 7249 13541:astore_1        
		abyte0.aU = ((azh) (abyte0)).ai & ~a.bs;
	// 7250 13542:aload_1         
	// 7251 13543:aload_1         
	// 7252 13544:getfield        #129 <Field int azh.ai>
	// 7253 13547:aload_0         
	// 7254 13548:getfield        #12  <Field azh a>
	// 7255 13551:getfield        #297 <Field int azh.bs>
	// 7256 13554:iconst_m1       
	// 7257 13555:ixor            
	// 7258 13556:iand            
	// 7259 13557:putfield        #402 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 7260 13560:aload_0         
	// 7261 13561:getfield        #12  <Field azh a>
	// 7262 13564:astore_1        
		abyte0.aq = ((azh) (abyte0)).ai & ~a.E;
	// 7263 13565:aload_1         
	// 7264 13566:aload_1         
	// 7265 13567:getfield        #129 <Field int azh.ai>
	// 7266 13570:aload_0         
	// 7267 13571:getfield        #12  <Field azh a>
	// 7268 13574:getfield        #76  <Field int azh.E>
	// 7269 13577:iconst_m1       
	// 7270 13578:ixor            
	// 7271 13579:iand            
	// 7272 13580:putfield        #300 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 7273 13583:aload_0         
	// 7274 13584:getfield        #12  <Field azh a>
	// 7275 13587:astore_1        
		abyte0.b = ((azh) (abyte0)).E | a.ai;
	// 7276 13588:aload_1         
	// 7277 13589:aload_1         
	// 7278 13590:getfield        #76  <Field int azh.E>
	// 7279 13593:aload_0         
	// 7280 13594:getfield        #12  <Field azh a>
	// 7281 13597:getfield        #129 <Field int azh.ai>
	// 7282 13600:ior             
	// 7283 13601:putfield        #363 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 7284 13604:aload_0         
	// 7285 13605:getfield        #12  <Field azh a>
	// 7286 13608:astore_1        
		abyte0.W = ((azh) (abyte0)).ai & ~a.E;
	// 7287 13609:aload_1         
	// 7288 13610:aload_1         
	// 7289 13611:getfield        #129 <Field int azh.ai>
	// 7290 13614:aload_0         
	// 7291 13615:getfield        #12  <Field azh a>
	// 7292 13618:getfield        #76  <Field int azh.E>
	// 7293 13621:iconst_m1       
	// 7294 13622:ixor            
	// 7295 13623:iand            
	// 7296 13624:putfield        #342 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 7297 13627:aload_0         
	// 7298 13628:getfield        #12  <Field azh a>
	// 7299 13631:astore_1        
		abyte0.aN = ((azh) (abyte0)).N & a.aN;
	// 7300 13632:aload_1         
	// 7301 13633:aload_1         
	// 7302 13634:getfield        #324 <Field int azh.N>
	// 7303 13637:aload_0         
	// 7304 13638:getfield        #12  <Field azh a>
	// 7305 13641:getfield        #345 <Field int azh.aN>
	// 7306 13644:iand            
	// 7307 13645:putfield        #345 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 7308 13648:aload_0         
	// 7309 13649:getfield        #12  <Field azh a>
	// 7310 13652:astore_1        
		abyte0.aN = ((azh) (abyte0)).ci ^ a.aN;
	// 7311 13653:aload_1         
	// 7312 13654:aload_1         
	// 7313 13655:getfield        #186 <Field int azh.ci>
	// 7314 13658:aload_0         
	// 7315 13659:getfield        #12  <Field azh a>
	// 7316 13662:getfield        #345 <Field int azh.aN>
	// 7317 13665:ixor            
	// 7318 13666:putfield        #345 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 7319 13669:aload_0         
	// 7320 13670:getfield        #12  <Field azh a>
	// 7321 13673:astore_1        
		abyte0.bo = ((azh) (abyte0)).aN ^ a.bo;
	// 7322 13674:aload_1         
	// 7323 13675:aload_1         
	// 7324 13676:getfield        #345 <Field int azh.aN>
	// 7325 13679:aload_0         
	// 7326 13680:getfield        #12  <Field azh a>
	// 7327 13683:getfield        #420 <Field int azh.bo>
	// 7328 13686:ixor            
	// 7329 13687:putfield        #420 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7330 13690:aload_0         
	// 7331 13691:getfield        #12  <Field azh a>
	// 7332 13694:astore_1        
		abyte0.bo = ((azh) (abyte0)).V & a.bo;
	// 7333 13695:aload_1         
	// 7334 13696:aload_1         
	// 7335 13697:getfield        #417 <Field int azh.V>
	// 7336 13700:aload_0         
	// 7337 13701:getfield        #12  <Field azh a>
	// 7338 13704:getfield        #420 <Field int azh.bo>
	// 7339 13707:iand            
	// 7340 13708:putfield        #420 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7341 13711:aload_0         
	// 7342 13712:getfield        #12  <Field azh a>
	// 7343 13715:astore_1        
		abyte0.aN = ((azh) (abyte0)).ad | a.aN;
	// 7344 13716:aload_1         
	// 7345 13717:aload_1         
	// 7346 13718:getfield        #339 <Field int azh.ad>
	// 7347 13721:aload_0         
	// 7348 13722:getfield        #12  <Field azh a>
	// 7349 13725:getfield        #345 <Field int azh.aN>
	// 7350 13728:ior             
	// 7351 13729:putfield        #345 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 7352 13732:aload_0         
	// 7353 13733:getfield        #12  <Field azh a>
	// 7354 13736:astore_1        
		abyte0.aN = ((azh) (abyte0)).ba ^ a.aN;
	// 7355 13737:aload_1         
	// 7356 13738:aload_1         
	// 7357 13739:getfield        #405 <Field int azh.ba>
	// 7358 13742:aload_0         
	// 7359 13743:getfield        #12  <Field azh a>
	// 7360 13746:getfield        #345 <Field int azh.aN>
	// 7361 13749:ixor            
	// 7362 13750:putfield        #345 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 7363 13753:aload_0         
	// 7364 13754:getfield        #12  <Field azh a>
	// 7365 13757:astore_1        
		abyte0.bo = ((azh) (abyte0)).aN ^ a.bo;
	// 7366 13758:aload_1         
	// 7367 13759:aload_1         
	// 7368 13760:getfield        #345 <Field int azh.aN>
	// 7369 13763:aload_0         
	// 7370 13764:getfield        #12  <Field azh a>
	// 7371 13767:getfield        #420 <Field int azh.bo>
	// 7372 13770:ixor            
	// 7373 13771:putfield        #420 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7374 13774:aload_0         
	// 7375 13775:getfield        #12  <Field azh a>
	// 7376 13778:astore_1        
		abyte0.bo = ((azh) (abyte0)).bo & ~a.aL;
	// 7377 13779:aload_1         
	// 7378 13780:aload_1         
	// 7379 13781:getfield        #420 <Field int azh.bo>
	// 7380 13784:aload_0         
	// 7381 13785:getfield        #12  <Field azh a>
	// 7382 13788:getfield        #171 <Field int azh.aL>
	// 7383 13791:iconst_m1       
	// 7384 13792:ixor            
	// 7385 13793:iand            
	// 7386 13794:putfield        #420 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7387 13797:aload_0         
	// 7388 13798:getfield        #12  <Field azh a>
	// 7389 13801:astore_1        
		abyte0.bo = ((azh) (abyte0)).am ^ a.bo;
	// 7390 13802:aload_1         
	// 7391 13803:aload_1         
	// 7392 13804:getfield        #40  <Field int azh.am>
	// 7393 13807:aload_0         
	// 7394 13808:getfield        #12  <Field azh a>
	// 7395 13811:getfield        #420 <Field int azh.bo>
	// 7396 13814:ixor            
	// 7397 13815:putfield        #420 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7398 13818:aload_0         
	// 7399 13819:getfield        #12  <Field azh a>
	// 7400 13822:astore_1        
		abyte0.k = ((azh) (abyte0)).bo ^ a.k;
	// 7401 13823:aload_1         
	// 7402 13824:aload_1         
	// 7403 13825:getfield        #420 <Field int azh.bo>
	// 7404 13828:aload_0         
	// 7405 13829:getfield        #12  <Field azh a>
	// 7406 13832:getfield        #61  <Field int azh.k>
	// 7407 13835:ixor            
	// 7408 13836:putfield        #61  <Field int azh.k>
		abyte0 = ((byte []) (a));
	// 7409 13839:aload_0         
	// 7410 13840:getfield        #12  <Field azh a>
	// 7411 13843:astore_1        
		abyte0.az = ((azh) (abyte0)).az & ~a.ag;
	// 7412 13844:aload_1         
	// 7413 13845:aload_1         
	// 7414 13846:getfield        #411 <Field int azh.az>
	// 7415 13849:aload_0         
	// 7416 13850:getfield        #12  <Field azh a>
	// 7417 13853:getfield        #414 <Field int azh.ag>
	// 7418 13856:iconst_m1       
	// 7419 13857:ixor            
	// 7420 13858:iand            
	// 7421 13859:putfield        #411 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 7422 13862:aload_0         
	// 7423 13863:getfield        #12  <Field azh a>
	// 7424 13866:astore_1        
		abyte0.az = ((azh) (abyte0)).as ^ a.az;
	// 7425 13867:aload_1         
	// 7426 13868:aload_1         
	// 7427 13869:getfield        #396 <Field int azh.as>
	// 7428 13872:aload_0         
	// 7429 13873:getfield        #12  <Field azh a>
	// 7430 13876:getfield        #411 <Field int azh.az>
	// 7431 13879:ixor            
	// 7432 13880:putfield        #411 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 7433 13883:aload_0         
	// 7434 13884:getfield        #12  <Field azh a>
	// 7435 13887:astore_1        
		abyte0.ab = ((azh) (abyte0)).az ^ a.ab;
	// 7436 13888:aload_1         
	// 7437 13889:aload_1         
	// 7438 13890:getfield        #411 <Field int azh.az>
	// 7439 13893:aload_0         
	// 7440 13894:getfield        #12  <Field azh a>
	// 7441 13897:getfield        #438 <Field int azh.ab>
	// 7442 13900:ixor            
	// 7443 13901:putfield        #438 <Field int azh.ab>
		abyte0 = ((byte []) (a));
	// 7444 13904:aload_0         
	// 7445 13905:getfield        #12  <Field azh a>
	// 7446 13908:astore_1        
		abyte0.az = ((azh) (abyte0)).D ^ a.ab;
	// 7447 13909:aload_1         
	// 7448 13910:aload_1         
	// 7449 13911:getfield        #261 <Field int azh.D>
	// 7450 13914:aload_0         
	// 7451 13915:getfield        #12  <Field azh a>
	// 7452 13918:getfield        #438 <Field int azh.ab>
	// 7453 13921:ixor            
	// 7454 13922:putfield        #411 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 7455 13925:aload_0         
	// 7456 13926:getfield        #12  <Field azh a>
	// 7457 13929:astore_1        
		abyte0.az = ((azh) (abyte0)).az & ~a.L;
	// 7458 13930:aload_1         
	// 7459 13931:aload_1         
	// 7460 13932:getfield        #411 <Field int azh.az>
	// 7461 13935:aload_0         
	// 7462 13936:getfield        #12  <Field azh a>
	// 7463 13939:getfield        #285 <Field int azh.L>
	// 7464 13942:iconst_m1       
	// 7465 13943:ixor            
	// 7466 13944:iand            
	// 7467 13945:putfield        #411 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 7468 13948:aload_0         
	// 7469 13949:getfield        #12  <Field azh a>
	// 7470 13952:astore_1        
		abyte0.as = ((azh) (abyte0)).ab & a.bg;
	// 7471 13953:aload_1         
	// 7472 13954:aload_1         
	// 7473 13955:getfield        #438 <Field int azh.ab>
	// 7474 13958:aload_0         
	// 7475 13959:getfield        #12  <Field azh a>
	// 7476 13962:getfield        #273 <Field int azh.bg>
	// 7477 13965:iand            
	// 7478 13966:putfield        #396 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 7479 13969:aload_0         
	// 7480 13970:getfield        #12  <Field azh a>
	// 7481 13973:astore_1        
		abyte0.as = ((azh) (abyte0)).as & ~a.L;
	// 7482 13974:aload_1         
	// 7483 13975:aload_1         
	// 7484 13976:getfield        #396 <Field int azh.as>
	// 7485 13979:aload_0         
	// 7486 13980:getfield        #12  <Field azh a>
	// 7487 13983:getfield        #285 <Field int azh.L>
	// 7488 13986:iconst_m1       
	// 7489 13987:ixor            
	// 7490 13988:iand            
	// 7491 13989:putfield        #396 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 7492 13992:aload_0         
	// 7493 13993:getfield        #12  <Field azh a>
	// 7494 13996:astore_1        
		abyte0.bo = ((azh) (abyte0)).ab & a.bP;
	// 7495 13997:aload_1         
	// 7496 13998:aload_1         
	// 7497 13999:getfield        #438 <Field int azh.ab>
	// 7498 14002:aload_0         
	// 7499 14003:getfield        #12  <Field azh a>
	// 7500 14006:getfield        #279 <Field int azh.bP>
	// 7501 14009:iand            
	// 7502 14010:putfield        #420 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7503 14013:aload_0         
	// 7504 14014:getfield        #12  <Field azh a>
	// 7505 14017:astore_1        
		abyte0.bo = ((azh) (abyte0)).aA ^ a.bo;
	// 7506 14018:aload_1         
	// 7507 14019:aload_1         
	// 7508 14020:getfield        #73  <Field int azh.aA>
	// 7509 14023:aload_0         
	// 7510 14024:getfield        #12  <Field azh a>
	// 7511 14027:getfield        #420 <Field int azh.bo>
	// 7512 14030:ixor            
	// 7513 14031:putfield        #420 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7514 14034:aload_0         
	// 7515 14035:getfield        #12  <Field azh a>
	// 7516 14038:astore_1        
		abyte0.bo = ((azh) (abyte0)).bo & ~a.L;
	// 7517 14039:aload_1         
	// 7518 14040:aload_1         
	// 7519 14041:getfield        #420 <Field int azh.bo>
	// 7520 14044:aload_0         
	// 7521 14045:getfield        #12  <Field azh a>
	// 7522 14048:getfield        #285 <Field int azh.L>
	// 7523 14051:iconst_m1       
	// 7524 14052:ixor            
	// 7525 14053:iand            
	// 7526 14054:putfield        #420 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7527 14057:aload_0         
	// 7528 14058:getfield        #12  <Field azh a>
	// 7529 14061:astore_1        
		abyte0.am = ((azh) (abyte0)).ab & a.aA;
	// 7530 14062:aload_1         
	// 7531 14063:aload_1         
	// 7532 14064:getfield        #438 <Field int azh.ab>
	// 7533 14067:aload_0         
	// 7534 14068:getfield        #12  <Field azh a>
	// 7535 14071:getfield        #73  <Field int azh.aA>
	// 7536 14074:iand            
	// 7537 14075:putfield        #40  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 7538 14078:aload_0         
	// 7539 14079:getfield        #12  <Field azh a>
	// 7540 14082:astore_1        
		abyte0.am = ((azh) (abyte0)).aA ^ a.am;
	// 7541 14083:aload_1         
	// 7542 14084:aload_1         
	// 7543 14085:getfield        #73  <Field int azh.aA>
	// 7544 14088:aload_0         
	// 7545 14089:getfield        #12  <Field azh a>
	// 7546 14092:getfield        #40  <Field int azh.am>
	// 7547 14095:ixor            
	// 7548 14096:putfield        #40  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 7549 14099:aload_0         
	// 7550 14100:getfield        #12  <Field azh a>
	// 7551 14103:astore_1        
		abyte0.aN = ((azh) (abyte0)).ab & ~a.D;
	// 7552 14104:aload_1         
	// 7553 14105:aload_1         
	// 7554 14106:getfield        #438 <Field int azh.ab>
	// 7555 14109:aload_0         
	// 7556 14110:getfield        #12  <Field azh a>
	// 7557 14113:getfield        #261 <Field int azh.D>
	// 7558 14116:iconst_m1       
	// 7559 14117:ixor            
	// 7560 14118:iand            
	// 7561 14119:putfield        #345 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 7562 14122:aload_0         
	// 7563 14123:getfield        #12  <Field azh a>
	// 7564 14126:astore_1        
		abyte0.aN = ((azh) (abyte0)).aN & a.L;
	// 7565 14127:aload_1         
	// 7566 14128:aload_1         
	// 7567 14129:getfield        #345 <Field int azh.aN>
	// 7568 14132:aload_0         
	// 7569 14133:getfield        #12  <Field azh a>
	// 7570 14136:getfield        #285 <Field int azh.L>
	// 7571 14139:iand            
	// 7572 14140:putfield        #345 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 7573 14143:aload_0         
	// 7574 14144:getfield        #12  <Field azh a>
	// 7575 14147:astore_1        
		abyte0.ba = ((azh) (abyte0)).ab & ~a.T;
	// 7576 14148:aload_1         
	// 7577 14149:aload_1         
	// 7578 14150:getfield        #438 <Field int azh.ab>
	// 7579 14153:aload_0         
	// 7580 14154:getfield        #12  <Field azh a>
	// 7581 14157:getfield        #43  <Field int azh.T>
	// 7582 14160:iconst_m1       
	// 7583 14161:ixor            
	// 7584 14162:iand            
	// 7585 14163:putfield        #405 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 7586 14166:aload_0         
	// 7587 14167:getfield        #12  <Field azh a>
	// 7588 14170:astore_1        
		abyte0.bj = ((azh) (abyte0)).ba ^ a.bj;
	// 7589 14171:aload_1         
	// 7590 14172:aload_1         
	// 7591 14173:getfield        #405 <Field int azh.ba>
	// 7592 14176:aload_0         
	// 7593 14177:getfield        #12  <Field azh a>
	// 7594 14180:getfield        #270 <Field int azh.bj>
	// 7595 14183:ixor            
	// 7596 14184:putfield        #270 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 7597 14187:aload_0         
	// 7598 14188:getfield        #12  <Field azh a>
	// 7599 14191:astore_1        
		abyte0.bj = ((azh) (abyte0)).aj & a.bj;
	// 7600 14192:aload_1         
	// 7601 14193:aload_1         
	// 7602 14194:getfield        #303 <Field int azh.aj>
	// 7603 14197:aload_0         
	// 7604 14198:getfield        #12  <Field azh a>
	// 7605 14201:getfield        #270 <Field int azh.bj>
	// 7606 14204:iand            
	// 7607 14205:putfield        #270 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 7608 14208:aload_0         
	// 7609 14209:getfield        #12  <Field azh a>
	// 7610 14212:astore_1        
		abyte0.ba = ((azh) (abyte0)).ab & ~a.T;
	// 7611 14213:aload_1         
	// 7612 14214:aload_1         
	// 7613 14215:getfield        #438 <Field int azh.ab>
	// 7614 14218:aload_0         
	// 7615 14219:getfield        #12  <Field azh a>
	// 7616 14222:getfield        #43  <Field int azh.T>
	// 7617 14225:iconst_m1       
	// 7618 14226:ixor            
	// 7619 14227:iand            
	// 7620 14228:putfield        #405 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 7621 14231:aload_0         
	// 7622 14232:getfield        #12  <Field azh a>
	// 7623 14235:astore_1        
		abyte0.ba = ((azh) (abyte0)).aQ ^ a.ba;
	// 7624 14236:aload_1         
	// 7625 14237:aload_1         
	// 7626 14238:getfield        #52  <Field int azh.aQ>
	// 7627 14241:aload_0         
	// 7628 14242:getfield        #12  <Field azh a>
	// 7629 14245:getfield        #405 <Field int azh.ba>
	// 7630 14248:ixor            
	// 7631 14249:putfield        #405 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 7632 14252:aload_0         
	// 7633 14253:getfield        #12  <Field azh a>
	// 7634 14256:astore_1        
		abyte0.bo = ((azh) (abyte0)).ba ^ a.bo;
	// 7635 14257:aload_1         
	// 7636 14258:aload_1         
	// 7637 14259:getfield        #405 <Field int azh.ba>
	// 7638 14262:aload_0         
	// 7639 14263:getfield        #12  <Field azh a>
	// 7640 14266:getfield        #420 <Field int azh.bo>
	// 7641 14269:ixor            
	// 7642 14270:putfield        #420 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7643 14273:aload_0         
	// 7644 14274:getfield        #12  <Field azh a>
	// 7645 14277:astore_1        
		abyte0.bj = ((azh) (abyte0)).bo ^ a.bj;
	// 7646 14278:aload_1         
	// 7647 14279:aload_1         
	// 7648 14280:getfield        #420 <Field int azh.bo>
	// 7649 14283:aload_0         
	// 7650 14284:getfield        #12  <Field azh a>
	// 7651 14287:getfield        #270 <Field int azh.bj>
	// 7652 14290:ixor            
	// 7653 14291:putfield        #270 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 7654 14294:aload_0         
	// 7655 14295:getfield        #12  <Field azh a>
	// 7656 14298:astore_1        
		abyte0.bj = ((azh) (abyte0)).bj | a.h;
	// 7657 14299:aload_1         
	// 7658 14300:aload_1         
	// 7659 14301:getfield        #270 <Field int azh.bj>
	// 7660 14304:aload_0         
	// 7661 14305:getfield        #12  <Field azh a>
	// 7662 14308:getfield        #321 <Field int azh.h>
	// 7663 14311:ior             
	// 7664 14312:putfield        #270 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 7665 14315:aload_0         
	// 7666 14316:getfield        #12  <Field azh a>
	// 7667 14319:astore_1        
		abyte0.bo = ((azh) (abyte0)).aR ^ a.ab;
	// 7668 14320:aload_1         
	// 7669 14321:aload_1         
	// 7670 14322:getfield        #264 <Field int azh.aR>
	// 7671 14325:aload_0         
	// 7672 14326:getfield        #12  <Field azh a>
	// 7673 14329:getfield        #438 <Field int azh.ab>
	// 7674 14332:ixor            
	// 7675 14333:putfield        #420 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7676 14336:aload_0         
	// 7677 14337:getfield        #12  <Field azh a>
	// 7678 14340:astore_1        
		abyte0.bo = ((azh) (abyte0)).bo ^ a.L;
	// 7679 14341:aload_1         
	// 7680 14342:aload_1         
	// 7681 14343:getfield        #420 <Field int azh.bo>
	// 7682 14346:aload_0         
	// 7683 14347:getfield        #12  <Field azh a>
	// 7684 14350:getfield        #285 <Field int azh.L>
	// 7685 14353:ixor            
	// 7686 14354:putfield        #420 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 7687 14357:aload_0         
	// 7688 14358:getfield        #12  <Field azh a>
	// 7689 14361:astore_1        
		abyte0.ba = ((azh) (abyte0)).ab & ~a.D;
	// 7690 14362:aload_1         
	// 7691 14363:aload_1         
	// 7692 14364:getfield        #438 <Field int azh.ab>
	// 7693 14367:aload_0         
	// 7694 14368:getfield        #12  <Field azh a>
	// 7695 14371:getfield        #261 <Field int azh.D>
	// 7696 14374:iconst_m1       
	// 7697 14375:ixor            
	// 7698 14376:iand            
	// 7699 14377:putfield        #405 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 7700 14380:aload_0         
	// 7701 14381:getfield        #12  <Field azh a>
	// 7702 14384:astore_1        
		abyte0.ba = ((azh) (abyte0)).D ^ a.ba;
	// 7703 14385:aload_1         
	// 7704 14386:aload_1         
	// 7705 14387:getfield        #261 <Field int azh.D>
	// 7706 14390:aload_0         
	// 7707 14391:getfield        #12  <Field azh a>
	// 7708 14394:getfield        #405 <Field int azh.ba>
	// 7709 14397:ixor            
	// 7710 14398:putfield        #405 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 7711 14401:aload_0         
	// 7712 14402:getfield        #12  <Field azh a>
	// 7713 14405:astore_1        
		abyte0.ci = ((azh) (abyte0)).ba & ~a.L;
	// 7714 14406:aload_1         
	// 7715 14407:aload_1         
	// 7716 14408:getfield        #405 <Field int azh.ba>
	// 7717 14411:aload_0         
	// 7718 14412:getfield        #12  <Field azh a>
	// 7719 14415:getfield        #285 <Field int azh.L>
	// 7720 14418:iconst_m1       
	// 7721 14419:ixor            
	// 7722 14420:iand            
	// 7723 14421:putfield        #186 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 7724 14424:aload_0         
	// 7725 14425:getfield        #12  <Field azh a>
	// 7726 14428:astore_1        
		abyte0.ci = ((azh) (abyte0)).aA ^ a.ci;
	// 7727 14429:aload_1         
	// 7728 14430:aload_1         
	// 7729 14431:getfield        #73  <Field int azh.aA>
	// 7730 14434:aload_0         
	// 7731 14435:getfield        #12  <Field azh a>
	// 7732 14438:getfield        #186 <Field int azh.ci>
	// 7733 14441:ixor            
	// 7734 14442:putfield        #186 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 7735 14445:aload_0         
	// 7736 14446:getfield        #12  <Field azh a>
	// 7737 14449:astore_1        
		abyte0.ba = ((azh) (abyte0)).L | a.ba;
	// 7738 14450:aload_1         
	// 7739 14451:aload_1         
	// 7740 14452:getfield        #285 <Field int azh.L>
	// 7741 14455:aload_0         
	// 7742 14456:getfield        #12  <Field azh a>
	// 7743 14459:getfield        #405 <Field int azh.ba>
	// 7744 14462:ior             
	// 7745 14463:putfield        #405 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 7746 14466:aload_0         
	// 7747 14467:getfield        #12  <Field azh a>
	// 7748 14470:astore_1        
		abyte0.ba = ((azh) (abyte0)).ab ^ a.ba;
	// 7749 14471:aload_1         
	// 7750 14472:aload_1         
	// 7751 14473:getfield        #438 <Field int azh.ab>
	// 7752 14476:aload_0         
	// 7753 14477:getfield        #12  <Field azh a>
	// 7754 14480:getfield        #405 <Field int azh.ba>
	// 7755 14483:ixor            
	// 7756 14484:putfield        #405 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 7757 14487:aload_0         
	// 7758 14488:getfield        #12  <Field azh a>
	// 7759 14491:astore_1        
		abyte0.ba = ((azh) (abyte0)).aj & a.ba;
	// 7760 14492:aload_1         
	// 7761 14493:aload_1         
	// 7762 14494:getfield        #303 <Field int azh.aj>
	// 7763 14497:aload_0         
	// 7764 14498:getfield        #12  <Field azh a>
	// 7765 14501:getfield        #405 <Field int azh.ba>
	// 7766 14504:iand            
	// 7767 14505:putfield        #405 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 7768 14508:aload_0         
	// 7769 14509:getfield        #12  <Field azh a>
	// 7770 14512:astore_1        
		abyte0.ba = ((azh) (abyte0)).ci ^ a.ba;
	// 7771 14513:aload_1         
	// 7772 14514:aload_1         
	// 7773 14515:getfield        #186 <Field int azh.ci>
	// 7774 14518:aload_0         
	// 7775 14519:getfield        #12  <Field azh a>
	// 7776 14522:getfield        #405 <Field int azh.ba>
	// 7777 14525:ixor            
	// 7778 14526:putfield        #405 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 7779 14529:aload_0         
	// 7780 14530:getfield        #12  <Field azh a>
	// 7781 14533:astore_1        
		abyte0.bj = ((azh) (abyte0)).ba ^ a.bj;
	// 7782 14534:aload_1         
	// 7783 14535:aload_1         
	// 7784 14536:getfield        #405 <Field int azh.ba>
	// 7785 14539:aload_0         
	// 7786 14540:getfield        #12  <Field azh a>
	// 7787 14543:getfield        #270 <Field int azh.bj>
	// 7788 14546:ixor            
	// 7789 14547:putfield        #270 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 7790 14550:aload_0         
	// 7791 14551:getfield        #12  <Field azh a>
	// 7792 14554:astore_1        
		abyte0.c = ((azh) (abyte0)).bj ^ a.c;
	// 7793 14555:aload_1         
	// 7794 14556:aload_1         
	// 7795 14557:getfield        #270 <Field int azh.bj>
	// 7796 14560:aload_0         
	// 7797 14561:getfield        #12  <Field azh a>
	// 7798 14564:getfield        #46  <Field int azh.c>
	// 7799 14567:ixor            
	// 7800 14568:putfield        #46  <Field int azh.c>
		abyte0 = ((byte []) (a));
	// 7801 14571:aload_0         
	// 7802 14572:getfield        #12  <Field azh a>
	// 7803 14575:astore_1        
		abyte0.bj = ((azh) (abyte0)).c & ~a.bT;
	// 7804 14576:aload_1         
	// 7805 14577:aload_1         
	// 7806 14578:getfield        #46  <Field int azh.c>
	// 7807 14581:aload_0         
	// 7808 14582:getfield        #12  <Field azh a>
	// 7809 14585:getfield        #276 <Field int azh.bT>
	// 7810 14588:iconst_m1       
	// 7811 14589:ixor            
	// 7812 14590:iand            
	// 7813 14591:putfield        #270 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 7814 14594:aload_0         
	// 7815 14595:getfield        #12  <Field azh a>
	// 7816 14598:astore_1        
		abyte0.ba = ((azh) (abyte0)).c & ~a.bT;
	// 7817 14599:aload_1         
	// 7818 14600:aload_1         
	// 7819 14601:getfield        #46  <Field int azh.c>
	// 7820 14604:aload_0         
	// 7821 14605:getfield        #12  <Field azh a>
	// 7822 14608:getfield        #276 <Field int azh.bT>
	// 7823 14611:iconst_m1       
	// 7824 14612:ixor            
	// 7825 14613:iand            
	// 7826 14614:putfield        #405 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 7827 14617:aload_0         
	// 7828 14618:getfield        #12  <Field azh a>
	// 7829 14621:astore_1        
		abyte0.ci = ((azh) (abyte0)).cg & a.c;
	// 7830 14622:aload_1         
	// 7831 14623:aload_1         
	// 7832 14624:getfield        #114 <Field int azh.cg>
	// 7833 14627:aload_0         
	// 7834 14628:getfield        #12  <Field azh a>
	// 7835 14631:getfield        #46  <Field int azh.c>
	// 7836 14634:iand            
	// 7837 14635:putfield        #186 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 7838 14638:aload_0         
	// 7839 14639:getfield        #12  <Field azh a>
	// 7840 14642:astore_1        
		abyte0.ci = ((azh) (abyte0)).k | a.ci;
	// 7841 14643:aload_1         
	// 7842 14644:aload_1         
	// 7843 14645:getfield        #61  <Field int azh.k>
	// 7844 14648:aload_0         
	// 7845 14649:getfield        #12  <Field azh a>
	// 7846 14652:getfield        #186 <Field int azh.ci>
	// 7847 14655:ior             
	// 7848 14656:putfield        #186 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 7849 14659:aload_0         
	// 7850 14660:getfield        #12  <Field azh a>
	// 7851 14663:astore_1        
		abyte0.bv = ((azh) (abyte0)).c & ~a.bT;
	// 7852 14664:aload_1         
	// 7853 14665:aload_1         
	// 7854 14666:getfield        #46  <Field int azh.c>
	// 7855 14669:aload_0         
	// 7856 14670:getfield        #12  <Field azh a>
	// 7857 14673:getfield        #276 <Field int azh.bT>
	// 7858 14676:iconst_m1       
	// 7859 14677:ixor            
	// 7860 14678:iand            
	// 7861 14679:putfield        #432 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 7862 14682:aload_0         
	// 7863 14683:getfield        #12  <Field azh a>
	// 7864 14686:astore_1        
		abyte0.bv = ((azh) (abyte0)).c ^ a.bv;
	// 7865 14687:aload_1         
	// 7866 14688:aload_1         
	// 7867 14689:getfield        #46  <Field int azh.c>
	// 7868 14692:aload_0         
	// 7869 14693:getfield        #12  <Field azh a>
	// 7870 14696:getfield        #432 <Field int azh.bv>
	// 7871 14699:ixor            
	// 7872 14700:putfield        #432 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 7873 14703:aload_0         
	// 7874 14704:getfield        #12  <Field azh a>
	// 7875 14707:astore_1        
		abyte0.bi = ((azh) (abyte0)).aI & ~a.c;
	// 7876 14708:aload_1         
	// 7877 14709:aload_1         
	// 7878 14710:getfield        #189 <Field int azh.aI>
	// 7879 14713:aload_0         
	// 7880 14714:getfield        #12  <Field azh a>
	// 7881 14717:getfield        #46  <Field int azh.c>
	// 7882 14720:iconst_m1       
	// 7883 14721:ixor            
	// 7884 14722:iand            
	// 7885 14723:putfield        #393 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 7886 14726:aload_0         
	// 7887 14727:getfield        #12  <Field azh a>
	// 7888 14730:astore_1        
		abyte0.aX = ((azh) (abyte0)).c & ~a.ce;
	// 7889 14731:aload_1         
	// 7890 14732:aload_1         
	// 7891 14733:getfield        #46  <Field int azh.c>
	// 7892 14736:aload_0         
	// 7893 14737:getfield        #12  <Field azh a>
	// 7894 14740:getfield        #87  <Field int azh.ce>
	// 7895 14743:iconst_m1       
	// 7896 14744:ixor            
	// 7897 14745:iand            
	// 7898 14746:putfield        #381 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 7899 14749:aload_0         
	// 7900 14750:getfield        #12  <Field azh a>
	// 7901 14753:astore_1        
		abyte0.aX = ((azh) (abyte0)).aX & ~a.k;
	// 7902 14754:aload_1         
	// 7903 14755:aload_1         
	// 7904 14756:getfield        #381 <Field int azh.aX>
	// 7905 14759:aload_0         
	// 7906 14760:getfield        #12  <Field azh a>
	// 7907 14763:getfield        #61  <Field int azh.k>
	// 7908 14766:iconst_m1       
	// 7909 14767:ixor            
	// 7910 14768:iand            
	// 7911 14769:putfield        #381 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 7912 14772:aload_0         
	// 7913 14773:getfield        #12  <Field azh a>
	// 7914 14776:astore_1        
		abyte0.aZ = ((azh) (abyte0)).ab & ~a.D;
	// 7915 14777:aload_1         
	// 7916 14778:aload_1         
	// 7917 14779:getfield        #438 <Field int azh.ab>
	// 7918 14782:aload_0         
	// 7919 14783:getfield        #12  <Field azh a>
	// 7920 14786:getfield        #261 <Field int azh.D>
	// 7921 14789:iconst_m1       
	// 7922 14790:ixor            
	// 7923 14791:iand            
	// 7924 14792:putfield        #375 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 7925 14795:aload_0         
	// 7926 14796:getfield        #12  <Field azh a>
	// 7927 14799:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bg ^ a.aZ;
	// 7928 14800:aload_1         
	// 7929 14801:aload_1         
	// 7930 14802:getfield        #273 <Field int azh.bg>
	// 7931 14805:aload_0         
	// 7932 14806:getfield        #12  <Field azh a>
	// 7933 14809:getfield        #375 <Field int azh.aZ>
	// 7934 14812:ixor            
	// 7935 14813:putfield        #375 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 7936 14816:aload_0         
	// 7937 14817:getfield        #12  <Field azh a>
	// 7938 14820:astore_1        
		abyte0.av = ((azh) (abyte0)).aZ ^ a.av;
	// 7939 14821:aload_1         
	// 7940 14822:aload_1         
	// 7941 14823:getfield        #375 <Field int azh.aZ>
	// 7942 14826:aload_0         
	// 7943 14827:getfield        #12  <Field azh a>
	// 7944 14830:getfield        #267 <Field int azh.av>
	// 7945 14833:ixor            
	// 7946 14834:putfield        #267 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 7947 14837:aload_0         
	// 7948 14838:getfield        #12  <Field azh a>
	// 7949 14841:astore_1        
		abyte0.av = ((azh) (abyte0)).aj & a.av;
	// 7950 14842:aload_1         
	// 7951 14843:aload_1         
	// 7952 14844:getfield        #303 <Field int azh.aj>
	// 7953 14847:aload_0         
	// 7954 14848:getfield        #12  <Field azh a>
	// 7955 14851:getfield        #267 <Field int azh.av>
	// 7956 14854:iand            
	// 7957 14855:putfield        #267 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 7958 14858:aload_0         
	// 7959 14859:getfield        #12  <Field azh a>
	// 7960 14862:astore_1        
		abyte0.aZ = ((azh) (abyte0)).ab & a.bg;
	// 7961 14863:aload_1         
	// 7962 14864:aload_1         
	// 7963 14865:getfield        #438 <Field int azh.ab>
	// 7964 14868:aload_0         
	// 7965 14869:getfield        #12  <Field azh a>
	// 7966 14872:getfield        #273 <Field int azh.bg>
	// 7967 14875:iand            
	// 7968 14876:putfield        #375 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 7969 14879:aload_0         
	// 7970 14880:getfield        #12  <Field azh a>
	// 7971 14883:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aA ^ a.aZ;
	// 7972 14884:aload_1         
	// 7973 14885:aload_1         
	// 7974 14886:getfield        #73  <Field int azh.aA>
	// 7975 14889:aload_0         
	// 7976 14890:getfield        #12  <Field azh a>
	// 7977 14893:getfield        #375 <Field int azh.aZ>
	// 7978 14896:ixor            
	// 7979 14897:putfield        #375 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 7980 14900:aload_0         
	// 7981 14901:getfield        #12  <Field azh a>
	// 7982 14904:astore_1        
		abyte0.z = ((azh) (abyte0)).ab & a.T;
	// 7983 14905:aload_1         
	// 7984 14906:aload_1         
	// 7985 14907:getfield        #438 <Field int azh.ab>
	// 7986 14910:aload_0         
	// 7987 14911:getfield        #12  <Field azh a>
	// 7988 14914:getfield        #43  <Field int azh.T>
	// 7989 14917:iand            
	// 7990 14918:putfield        #366 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 7991 14921:aload_0         
	// 7992 14922:getfield        #12  <Field azh a>
	// 7993 14925:astore_1        
		abyte0.aN = ((azh) (abyte0)).z ^ a.aN;
	// 7994 14926:aload_1         
	// 7995 14927:aload_1         
	// 7996 14928:getfield        #366 <Field int azh.z>
	// 7997 14931:aload_0         
	// 7998 14932:getfield        #12  <Field azh a>
	// 7999 14935:getfield        #345 <Field int azh.aN>
	// 8000 14938:ixor            
	// 8001 14939:putfield        #345 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 8002 14942:aload_0         
	// 8003 14943:getfield        #12  <Field azh a>
	// 8004 14946:astore_1        
		abyte0.aN = ((azh) (abyte0)).aj & a.aN;
	// 8005 14947:aload_1         
	// 8006 14948:aload_1         
	// 8007 14949:getfield        #303 <Field int azh.aj>
	// 8008 14952:aload_0         
	// 8009 14953:getfield        #12  <Field azh a>
	// 8010 14956:getfield        #345 <Field int azh.aN>
	// 8011 14959:iand            
	// 8012 14960:putfield        #345 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 8013 14963:aload_0         
	// 8014 14964:getfield        #12  <Field azh a>
	// 8015 14967:astore_1        
		abyte0.aN = ((azh) (abyte0)).as ^ a.aN;
	// 8016 14968:aload_1         
	// 8017 14969:aload_1         
	// 8018 14970:getfield        #396 <Field int azh.as>
	// 8019 14973:aload_0         
	// 8020 14974:getfield        #12  <Field azh a>
	// 8021 14977:getfield        #345 <Field int azh.aN>
	// 8022 14980:ixor            
	// 8023 14981:putfield        #345 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 8024 14984:aload_0         
	// 8025 14985:getfield        #12  <Field azh a>
	// 8026 14988:astore_1        
		abyte0.aN = ((azh) (abyte0)).h | a.aN;
	// 8027 14989:aload_1         
	// 8028 14990:aload_1         
	// 8029 14991:getfield        #321 <Field int azh.h>
	// 8030 14994:aload_0         
	// 8031 14995:getfield        #12  <Field azh a>
	// 8032 14998:getfield        #345 <Field int azh.aN>
	// 8033 15001:ior             
	// 8034 15002:putfield        #345 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 8035 15005:aload_0         
	// 8036 15006:getfield        #12  <Field azh a>
	// 8037 15009:astore_1        
		abyte0.z = ((azh) (abyte0)).L | a.z;
	// 8038 15010:aload_1         
	// 8039 15011:aload_1         
	// 8040 15012:getfield        #285 <Field int azh.L>
	// 8041 15015:aload_0         
	// 8042 15016:getfield        #12  <Field azh a>
	// 8043 15019:getfield        #366 <Field int azh.z>
	// 8044 15022:ior             
	// 8045 15023:putfield        #366 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 8046 15026:aload_0         
	// 8047 15027:getfield        #12  <Field azh a>
	// 8048 15030:astore_1        
		abyte0.z = ((azh) (abyte0)).am ^ a.z;
	// 8049 15031:aload_1         
	// 8050 15032:aload_1         
	// 8051 15033:getfield        #40  <Field int azh.am>
	// 8052 15036:aload_0         
	// 8053 15037:getfield        #12  <Field azh a>
	// 8054 15040:getfield        #366 <Field int azh.z>
	// 8055 15043:ixor            
	// 8056 15044:putfield        #366 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 8057 15047:aload_0         
	// 8058 15048:getfield        #12  <Field azh a>
	// 8059 15051:astore_1        
		abyte0.av = ((azh) (abyte0)).z ^ a.av;
	// 8060 15052:aload_1         
	// 8061 15053:aload_1         
	// 8062 15054:getfield        #366 <Field int azh.z>
	// 8063 15057:aload_0         
	// 8064 15058:getfield        #12  <Field azh a>
	// 8065 15061:getfield        #267 <Field int azh.av>
	// 8066 15064:ixor            
	// 8067 15065:putfield        #267 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 8068 15068:aload_0         
	// 8069 15069:getfield        #12  <Field azh a>
	// 8070 15072:astore_1        
		abyte0.aR = ((azh) (abyte0)).ab & a.aR;
	// 8071 15073:aload_1         
	// 8072 15074:aload_1         
	// 8073 15075:getfield        #438 <Field int azh.ab>
	// 8074 15078:aload_0         
	// 8075 15079:getfield        #12  <Field azh a>
	// 8076 15082:getfield        #264 <Field int azh.aR>
	// 8077 15085:iand            
	// 8078 15086:putfield        #264 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 8079 15089:aload_0         
	// 8080 15090:getfield        #12  <Field azh a>
	// 8081 15093:astore_1        
		abyte0.aR = ((azh) (abyte0)).D ^ a.aR;
	// 8082 15094:aload_1         
	// 8083 15095:aload_1         
	// 8084 15096:getfield        #261 <Field int azh.D>
	// 8085 15099:aload_0         
	// 8086 15100:getfield        #12  <Field azh a>
	// 8087 15103:getfield        #264 <Field int azh.aR>
	// 8088 15106:ixor            
	// 8089 15107:putfield        #264 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 8090 15110:aload_0         
	// 8091 15111:getfield        #12  <Field azh a>
	// 8092 15114:astore_1        
		abyte0.ar = ((azh) (abyte0)).aR ^ a.ar;
	// 8093 15115:aload_1         
	// 8094 15116:aload_1         
	// 8095 15117:getfield        #264 <Field int azh.aR>
	// 8096 15120:aload_0         
	// 8097 15121:getfield        #12  <Field azh a>
	// 8098 15124:getfield        #37  <Field int azh.ar>
	// 8099 15127:ixor            
	// 8100 15128:putfield        #37  <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 8101 15131:aload_0         
	// 8102 15132:getfield        #12  <Field azh a>
	// 8103 15135:astore_1        
		abyte0.ar = ((azh) (abyte0)).aj & ~a.ar;
	// 8104 15136:aload_1         
	// 8105 15137:aload_1         
	// 8106 15138:getfield        #303 <Field int azh.aj>
	// 8107 15141:aload_0         
	// 8108 15142:getfield        #12  <Field azh a>
	// 8109 15145:getfield        #37  <Field int azh.ar>
	// 8110 15148:iconst_m1       
	// 8111 15149:ixor            
	// 8112 15150:iand            
	// 8113 15151:putfield        #37  <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 8114 15154:aload_0         
	// 8115 15155:getfield        #12  <Field azh a>
	// 8116 15158:astore_1        
		abyte0.bP = ((azh) (abyte0)).bP ^ a.ab;
	// 8117 15159:aload_1         
	// 8118 15160:aload_1         
	// 8119 15161:getfield        #279 <Field int azh.bP>
	// 8120 15164:aload_0         
	// 8121 15165:getfield        #12  <Field azh a>
	// 8122 15168:getfield        #438 <Field int azh.ab>
	// 8123 15171:ixor            
	// 8124 15172:putfield        #279 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 8125 15175:aload_0         
	// 8126 15176:getfield        #12  <Field azh a>
	// 8127 15179:astore_1        
		abyte0.aR = ((azh) (abyte0)).ab & ~a.bg;
	// 8128 15180:aload_1         
	// 8129 15181:aload_1         
	// 8130 15182:getfield        #438 <Field int azh.ab>
	// 8131 15185:aload_0         
	// 8132 15186:getfield        #12  <Field azh a>
	// 8133 15189:getfield        #273 <Field int azh.bg>
	// 8134 15192:iconst_m1       
	// 8135 15193:ixor            
	// 8136 15194:iand            
	// 8137 15195:putfield        #264 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 8138 15198:aload_0         
	// 8139 15199:getfield        #12  <Field azh a>
	// 8140 15202:astore_1        
		abyte0.aR = ((azh) (abyte0)).bN ^ a.aR;
	// 8141 15203:aload_1         
	// 8142 15204:aload_1         
	// 8143 15205:getfield        #183 <Field int azh.bN>
	// 8144 15208:aload_0         
	// 8145 15209:getfield        #12  <Field azh a>
	// 8146 15212:getfield        #264 <Field int azh.aR>
	// 8147 15215:ixor            
	// 8148 15216:putfield        #264 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 8149 15219:aload_0         
	// 8150 15220:getfield        #12  <Field azh a>
	// 8151 15223:astore_1        
		abyte0.aR = ((azh) (abyte0)).L & ~a.aR;
	// 8152 15224:aload_1         
	// 8153 15225:aload_1         
	// 8154 15226:getfield        #285 <Field int azh.L>
	// 8155 15229:aload_0         
	// 8156 15230:getfield        #12  <Field azh a>
	// 8157 15233:getfield        #264 <Field int azh.aR>
	// 8158 15236:iconst_m1       
	// 8159 15237:ixor            
	// 8160 15238:iand            
	// 8161 15239:putfield        #264 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 8162 15242:aload_0         
	// 8163 15243:getfield        #12  <Field azh a>
	// 8164 15246:astore_1        
		abyte0.aR = ((azh) (abyte0)).aZ ^ a.aR;
	// 8165 15247:aload_1         
	// 8166 15248:aload_1         
	// 8167 15249:getfield        #375 <Field int azh.aZ>
	// 8168 15252:aload_0         
	// 8169 15253:getfield        #12  <Field azh a>
	// 8170 15256:getfield        #264 <Field int azh.aR>
	// 8171 15259:ixor            
	// 8172 15260:putfield        #264 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 8173 15263:aload_0         
	// 8174 15264:getfield        #12  <Field azh a>
	// 8175 15267:astore_1        
		abyte0.aJ = ((azh) (abyte0)).aR ^ a.aJ;
	// 8176 15268:aload_1         
	// 8177 15269:aload_1         
	// 8178 15270:getfield        #264 <Field int azh.aR>
	// 8179 15273:aload_0         
	// 8180 15274:getfield        #12  <Field azh a>
	// 8181 15277:getfield        #108 <Field int azh.aJ>
	// 8182 15280:ixor            
	// 8183 15281:putfield        #108 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 8184 15284:aload_0         
	// 8185 15285:getfield        #12  <Field azh a>
	// 8186 15288:astore_1        
		abyte0.aN = ((azh) (abyte0)).aJ ^ a.aN;
	// 8187 15289:aload_1         
	// 8188 15290:aload_1         
	// 8189 15291:getfield        #108 <Field int azh.aJ>
	// 8190 15294:aload_0         
	// 8191 15295:getfield        #12  <Field azh a>
	// 8192 15298:getfield        #345 <Field int azh.aN>
	// 8193 15301:ixor            
	// 8194 15302:putfield        #345 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 8195 15305:aload_0         
	// 8196 15306:getfield        #12  <Field azh a>
	// 8197 15309:astore_1        
		abyte0.e = ((azh) (abyte0)).aN ^ a.e;
	// 8198 15310:aload_1         
	// 8199 15311:aload_1         
	// 8200 15312:getfield        #345 <Field int azh.aN>
	// 8201 15315:aload_0         
	// 8202 15316:getfield        #12  <Field azh a>
	// 8203 15319:getfield        #387 <Field int azh.e>
	// 8204 15322:ixor            
	// 8205 15323:putfield        #387 <Field int azh.e>
		abyte0 = ((byte []) (a));
	// 8206 15326:aload_0         
	// 8207 15327:getfield        #12  <Field azh a>
	// 8208 15330:astore_1        
		abyte0.aN = ((azh) (abyte0)).m & a.e;
	// 8209 15331:aload_1         
	// 8210 15332:aload_1         
	// 8211 15333:getfield        #378 <Field int azh.m>
	// 8212 15336:aload_0         
	// 8213 15337:getfield        #12  <Field azh a>
	// 8214 15340:getfield        #387 <Field int azh.e>
	// 8215 15343:iand            
	// 8216 15344:putfield        #345 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 8217 15347:aload_0         
	// 8218 15348:getfield        #12  <Field azh a>
	// 8219 15351:astore_1        
		abyte0.aJ = ((azh) (abyte0)).e & a.A;
	// 8220 15352:aload_1         
	// 8221 15353:aload_1         
	// 8222 15354:getfield        #387 <Field int azh.e>
	// 8223 15357:aload_0         
	// 8224 15358:getfield        #12  <Field azh a>
	// 8225 15361:getfield        #423 <Field int azh.A>
	// 8226 15364:iand            
	// 8227 15365:putfield        #108 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 8228 15368:aload_0         
	// 8229 15369:getfield        #12  <Field azh a>
	// 8230 15372:astore_1        
		abyte0.aR = ((azh) (abyte0)).Y & a.aJ;
	// 8231 15373:aload_1         
	// 8232 15374:aload_1         
	// 8233 15375:getfield        #330 <Field int azh.Y>
	// 8234 15378:aload_0         
	// 8235 15379:getfield        #12  <Field azh a>
	// 8236 15382:getfield        #108 <Field int azh.aJ>
	// 8237 15385:iand            
	// 8238 15386:putfield        #264 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 8239 15389:aload_0         
	// 8240 15390:getfield        #12  <Field azh a>
	// 8241 15393:astore_1        
		abyte0.bh = ((azh) (abyte0)).aJ ^ a.bh;
	// 8242 15394:aload_1         
	// 8243 15395:aload_1         
	// 8244 15396:getfield        #108 <Field int azh.aJ>
	// 8245 15399:aload_0         
	// 8246 15400:getfield        #12  <Field azh a>
	// 8247 15403:getfield        #111 <Field int azh.bh>
	// 8248 15406:ixor            
	// 8249 15407:putfield        #111 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 8250 15410:aload_0         
	// 8251 15411:getfield        #12  <Field azh a>
	// 8252 15414:astore_1        
		abyte0.bN = ((azh) (abyte0)).e & ~a.A;
	// 8253 15415:aload_1         
	// 8254 15416:aload_1         
	// 8255 15417:getfield        #387 <Field int azh.e>
	// 8256 15420:aload_0         
	// 8257 15421:getfield        #12  <Field azh a>
	// 8258 15424:getfield        #423 <Field int azh.A>
	// 8259 15427:iconst_m1       
	// 8260 15428:ixor            
	// 8261 15429:iand            
	// 8262 15430:putfield        #183 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 8263 15433:aload_0         
	// 8264 15434:getfield        #12  <Field azh a>
	// 8265 15437:astore_1        
		abyte0.z = ((azh) (abyte0)).e & ~a.bN;
	// 8266 15438:aload_1         
	// 8267 15439:aload_1         
	// 8268 15440:getfield        #387 <Field int azh.e>
	// 8269 15443:aload_0         
	// 8270 15444:getfield        #12  <Field azh a>
	// 8271 15447:getfield        #183 <Field int azh.bN>
	// 8272 15450:iconst_m1       
	// 8273 15451:ixor            
	// 8274 15452:iand            
	// 8275 15453:putfield        #366 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 8276 15456:aload_0         
	// 8277 15457:getfield        #12  <Field azh a>
	// 8278 15460:astore_1        
		abyte0.am = ((azh) (abyte0)).Y & ~a.z;
	// 8279 15461:aload_1         
	// 8280 15462:aload_1         
	// 8281 15463:getfield        #330 <Field int azh.Y>
	// 8282 15466:aload_0         
	// 8283 15467:getfield        #12  <Field azh a>
	// 8284 15470:getfield        #366 <Field int azh.z>
	// 8285 15473:iconst_m1       
	// 8286 15474:ixor            
	// 8287 15475:iand            
	// 8288 15476:putfield        #40  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 8289 15479:aload_0         
	// 8290 15480:getfield        #12  <Field azh a>
	// 8291 15483:astore_1        
		abyte0.as = ((azh) (abyte0)).Y & ~a.bN;
	// 8292 15484:aload_1         
	// 8293 15485:aload_1         
	// 8294 15486:getfield        #330 <Field int azh.Y>
	// 8295 15489:aload_0         
	// 8296 15490:getfield        #12  <Field azh a>
	// 8297 15493:getfield        #183 <Field int azh.bN>
	// 8298 15496:iconst_m1       
	// 8299 15497:ixor            
	// 8300 15498:iand            
	// 8301 15499:putfield        #396 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 8302 15502:aload_0         
	// 8303 15503:getfield        #12  <Field azh a>
	// 8304 15506:astore_1        
		abyte0.r = ((azh) (abyte0)).Y & a.bN;
	// 8305 15507:aload_1         
	// 8306 15508:aload_1         
	// 8307 15509:getfield        #330 <Field int azh.Y>
	// 8308 15512:aload_0         
	// 8309 15513:getfield        #12  <Field azh a>
	// 8310 15516:getfield        #183 <Field int azh.bN>
	// 8311 15519:iand            
	// 8312 15520:putfield        #360 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 8313 15523:aload_0         
	// 8314 15524:getfield        #12  <Field azh a>
	// 8315 15527:astore_1        
		abyte0.bM = ((azh) (abyte0)).Y & a.bN;
	// 8316 15528:aload_1         
	// 8317 15529:aload_1         
	// 8318 15530:getfield        #330 <Field int azh.Y>
	// 8319 15533:aload_0         
	// 8320 15534:getfield        #12  <Field azh a>
	// 8321 15537:getfield        #183 <Field int azh.bN>
	// 8322 15540:iand            
	// 8323 15541:putfield        #351 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 8324 15544:aload_0         
	// 8325 15545:getfield        #12  <Field azh a>
	// 8326 15548:astore_1        
		abyte0.bt = ((azh) (abyte0)).Y & a.bN;
	// 8327 15549:aload_1         
	// 8328 15550:aload_1         
	// 8329 15551:getfield        #330 <Field int azh.Y>
	// 8330 15554:aload_0         
	// 8331 15555:getfield        #12  <Field azh a>
	// 8332 15558:getfield        #183 <Field int azh.bN>
	// 8333 15561:iand            
	// 8334 15562:putfield        #429 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 8335 15565:aload_0         
	// 8336 15566:getfield        #12  <Field azh a>
	// 8337 15569:astore_1        
		abyte0.bt = ((azh) (abyte0)).A ^ a.bt;
	// 8338 15570:aload_1         
	// 8339 15571:aload_1         
	// 8340 15572:getfield        #423 <Field int azh.A>
	// 8341 15575:aload_0         
	// 8342 15576:getfield        #12  <Field azh a>
	// 8343 15579:getfield        #429 <Field int azh.bt>
	// 8344 15582:ixor            
	// 8345 15583:putfield        #429 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 8346 15586:aload_0         
	// 8347 15587:getfield        #12  <Field azh a>
	// 8348 15590:astore_1        
		abyte0.aR = ((azh) (abyte0)).bN ^ a.aR;
	// 8349 15591:aload_1         
	// 8350 15592:aload_1         
	// 8351 15593:getfield        #183 <Field int azh.bN>
	// 8352 15596:aload_0         
	// 8353 15597:getfield        #12  <Field azh a>
	// 8354 15600:getfield        #264 <Field int azh.aR>
	// 8355 15603:ixor            
	// 8356 15604:putfield        #264 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 8357 15607:aload_0         
	// 8358 15608:getfield        #12  <Field azh a>
	// 8359 15611:astore_1        
		abyte0.cc = ((azh) (abyte0)).Y & a.bN;
	// 8360 15612:aload_1         
	// 8361 15613:aload_1         
	// 8362 15614:getfield        #330 <Field int azh.Y>
	// 8363 15617:aload_0         
	// 8364 15618:getfield        #12  <Field azh a>
	// 8365 15621:getfield        #183 <Field int azh.bN>
	// 8366 15624:iand            
	// 8367 15625:putfield        #192 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 8368 15628:aload_0         
	// 8369 15629:getfield        #12  <Field azh a>
	// 8370 15632:astore_1        
		abyte0.bN = ((azh) (abyte0)).Y & ~a.bN;
	// 8371 15633:aload_1         
	// 8372 15634:aload_1         
	// 8373 15635:getfield        #330 <Field int azh.Y>
	// 8374 15638:aload_0         
	// 8375 15639:getfield        #12  <Field azh a>
	// 8376 15642:getfield        #183 <Field int azh.bN>
	// 8377 15645:iconst_m1       
	// 8378 15646:ixor            
	// 8379 15647:iand            
	// 8380 15648:putfield        #183 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 8381 15651:aload_0         
	// 8382 15652:getfield        #12  <Field azh a>
	// 8383 15655:astore_1        
		abyte0.bN = ((azh) (abyte0)).A ^ a.bN;
	// 8384 15656:aload_1         
	// 8385 15657:aload_1         
	// 8386 15658:getfield        #423 <Field int azh.A>
	// 8387 15661:aload_0         
	// 8388 15662:getfield        #12  <Field azh a>
	// 8389 15665:getfield        #183 <Field int azh.bN>
	// 8390 15668:ixor            
	// 8391 15669:putfield        #183 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 8392 15672:aload_0         
	// 8393 15673:getfield        #12  <Field azh a>
	// 8394 15676:astore_1        
		abyte0.s = ((azh) (abyte0)).Y & ~a.e;
	// 8395 15677:aload_1         
	// 8396 15678:aload_1         
	// 8397 15679:getfield        #330 <Field int azh.Y>
	// 8398 15682:aload_0         
	// 8399 15683:getfield        #12  <Field azh a>
	// 8400 15686:getfield        #387 <Field int azh.e>
	// 8401 15689:iconst_m1       
	// 8402 15690:ixor            
	// 8403 15691:iand            
	// 8404 15692:putfield        #117 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 8405 15695:aload_0         
	// 8406 15696:getfield        #12  <Field azh a>
	// 8407 15699:astore_1        
		abyte0.s = ((azh) (abyte0)).e ^ a.s;
	// 8408 15700:aload_1         
	// 8409 15701:aload_1         
	// 8410 15702:getfield        #387 <Field int azh.e>
	// 8411 15705:aload_0         
	// 8412 15706:getfield        #12  <Field azh a>
	// 8413 15709:getfield        #117 <Field int azh.s>
	// 8414 15712:ixor            
	// 8415 15713:putfield        #117 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 8416 15716:aload_0         
	// 8417 15717:getfield        #12  <Field azh a>
	// 8418 15720:astore_1        
		abyte0.bK = ((azh) (abyte0)).A ^ a.e;
	// 8419 15721:aload_1         
	// 8420 15722:aload_1         
	// 8421 15723:getfield        #423 <Field int azh.A>
	// 8422 15726:aload_0         
	// 8423 15727:getfield        #12  <Field azh a>
	// 8424 15730:getfield        #387 <Field int azh.e>
	// 8425 15733:ixor            
	// 8426 15734:putfield        #318 <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 8427 15737:aload_0         
	// 8428 15738:getfield        #12  <Field azh a>
	// 8429 15741:astore_1        
		abyte0.as = ((azh) (abyte0)).bK ^ a.as;
	// 8430 15742:aload_1         
	// 8431 15743:aload_1         
	// 8432 15744:getfield        #318 <Field int azh.bK>
	// 8433 15747:aload_0         
	// 8434 15748:getfield        #12  <Field azh a>
	// 8435 15751:getfield        #396 <Field int azh.as>
	// 8436 15754:ixor            
	// 8437 15755:putfield        #396 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 8438 15758:aload_0         
	// 8439 15759:getfield        #12  <Field azh a>
	// 8440 15762:astore_1        
		abyte0.bq = ((azh) (abyte0)).Y & ~a.bK;
	// 8441 15763:aload_1         
	// 8442 15764:aload_1         
	// 8443 15765:getfield        #330 <Field int azh.Y>
	// 8444 15768:aload_0         
	// 8445 15769:getfield        #12  <Field azh a>
	// 8446 15772:getfield        #318 <Field int azh.bK>
	// 8447 15775:iconst_m1       
	// 8448 15776:ixor            
	// 8449 15777:iand            
	// 8450 15778:putfield        #291 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 8451 15781:aload_0         
	// 8452 15782:getfield        #12  <Field azh a>
	// 8453 15785:astore_1        
		abyte0.bq = ((azh) (abyte0)).aJ ^ a.bq;
	// 8454 15786:aload_1         
	// 8455 15787:aload_1         
	// 8456 15788:getfield        #108 <Field int azh.aJ>
	// 8457 15791:aload_0         
	// 8458 15792:getfield        #12  <Field azh a>
	// 8459 15795:getfield        #291 <Field int azh.bq>
	// 8460 15798:ixor            
	// 8461 15799:putfield        #291 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 8462 15802:aload_0         
	// 8463 15803:getfield        #12  <Field azh a>
	// 8464 15806:astore_1        
		abyte0.aJ = ((azh) (abyte0)).Y & a.bK;
	// 8465 15807:aload_1         
	// 8466 15808:aload_1         
	// 8467 15809:getfield        #330 <Field int azh.Y>
	// 8468 15812:aload_0         
	// 8469 15813:getfield        #12  <Field azh a>
	// 8470 15816:getfield        #318 <Field int azh.bK>
	// 8471 15819:iand            
	// 8472 15820:putfield        #108 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 8473 15823:aload_0         
	// 8474 15824:getfield        #12  <Field azh a>
	// 8475 15827:astore_1        
		abyte0.aJ = ((azh) (abyte0)).z ^ a.aJ;
	// 8476 15828:aload_1         
	// 8477 15829:aload_1         
	// 8478 15830:getfield        #366 <Field int azh.z>
	// 8479 15833:aload_0         
	// 8480 15834:getfield        #12  <Field azh a>
	// 8481 15837:getfield        #108 <Field int azh.aJ>
	// 8482 15840:ixor            
	// 8483 15841:putfield        #108 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 8484 15844:aload_0         
	// 8485 15845:getfield        #12  <Field azh a>
	// 8486 15848:astore_1        
		abyte0.z = ((azh) (abyte0)).A | a.e;
	// 8487 15849:aload_1         
	// 8488 15850:aload_1         
	// 8489 15851:getfield        #423 <Field int azh.A>
	// 8490 15854:aload_0         
	// 8491 15855:getfield        #12  <Field azh a>
	// 8492 15858:getfield        #387 <Field int azh.e>
	// 8493 15861:ior             
	// 8494 15862:putfield        #366 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 8495 15865:aload_0         
	// 8496 15866:getfield        #12  <Field azh a>
	// 8497 15869:astore_1        
		abyte0.cc = ((azh) (abyte0)).z ^ a.cc;
	// 8498 15870:aload_1         
	// 8499 15871:aload_1         
	// 8500 15872:getfield        #366 <Field int azh.z>
	// 8501 15875:aload_0         
	// 8502 15876:getfield        #12  <Field azh a>
	// 8503 15879:getfield        #192 <Field int azh.cc>
	// 8504 15882:ixor            
	// 8505 15883:putfield        #192 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 8506 15886:aload_0         
	// 8507 15887:getfield        #12  <Field azh a>
	// 8508 15890:astore_1        
		abyte0.am = ((azh) (abyte0)).z ^ a.am;
	// 8509 15891:aload_1         
	// 8510 15892:aload_1         
	// 8511 15893:getfield        #366 <Field int azh.z>
	// 8512 15896:aload_0         
	// 8513 15897:getfield        #12  <Field azh a>
	// 8514 15900:getfield        #40  <Field int azh.am>
	// 8515 15903:ixor            
	// 8516 15904:putfield        #40  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 8517 15907:aload_0         
	// 8518 15908:getfield        #12  <Field azh a>
	// 8519 15911:astore_1        
		abyte0.bL = ((azh) (abyte0)).Y & ~a.e;
	// 8520 15912:aload_1         
	// 8521 15913:aload_1         
	// 8522 15914:getfield        #330 <Field int azh.Y>
	// 8523 15917:aload_0         
	// 8524 15918:getfield        #12  <Field azh a>
	// 8525 15921:getfield        #387 <Field int azh.e>
	// 8526 15924:iconst_m1       
	// 8527 15925:ixor            
	// 8528 15926:iand            
	// 8529 15927:putfield        #64  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 8530 15930:aload_0         
	// 8531 15931:getfield        #12  <Field azh a>
	// 8532 15934:astore_1        
		abyte0.bL = ((azh) (abyte0)).bK ^ a.bL;
	// 8533 15935:aload_1         
	// 8534 15936:aload_1         
	// 8535 15937:getfield        #318 <Field int azh.bK>
	// 8536 15940:aload_0         
	// 8537 15941:getfield        #12  <Field azh a>
	// 8538 15944:getfield        #64  <Field int azh.bL>
	// 8539 15947:ixor            
	// 8540 15948:putfield        #64  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 8541 15951:aload_0         
	// 8542 15952:getfield        #12  <Field azh a>
	// 8543 15955:astore_1        
		abyte0.aB = ((azh) (abyte0)).Y & ~a.e;
	// 8544 15956:aload_1         
	// 8545 15957:aload_1         
	// 8546 15958:getfield        #330 <Field int azh.Y>
	// 8547 15961:aload_0         
	// 8548 15962:getfield        #12  <Field azh a>
	// 8549 15965:getfield        #387 <Field int azh.e>
	// 8550 15968:iconst_m1       
	// 8551 15969:ixor            
	// 8552 15970:iand            
	// 8553 15971:putfield        #240 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 8554 15974:aload_0         
	// 8555 15975:getfield        #12  <Field azh a>
	// 8556 15978:astore_1        
		abyte0.aB = ((azh) (abyte0)).z ^ a.aB;
	// 8557 15979:aload_1         
	// 8558 15980:aload_1         
	// 8559 15981:getfield        #366 <Field int azh.z>
	// 8560 15984:aload_0         
	// 8561 15985:getfield        #12  <Field azh a>
	// 8562 15988:getfield        #240 <Field int azh.aB>
	// 8563 15991:ixor            
	// 8564 15992:putfield        #240 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 8565 15995:aload_0         
	// 8566 15996:getfield        #12  <Field azh a>
	// 8567 15999:astore_1        
		abyte0.z = ((azh) (abyte0)).A & ~a.e;
	// 8568 16000:aload_1         
	// 8569 16001:aload_1         
	// 8570 16002:getfield        #423 <Field int azh.A>
	// 8571 16005:aload_0         
	// 8572 16006:getfield        #12  <Field azh a>
	// 8573 16009:getfield        #387 <Field int azh.e>
	// 8574 16012:iconst_m1       
	// 8575 16013:ixor            
	// 8576 16014:iand            
	// 8577 16015:putfield        #366 <Field int azh.z>
		abyte0 = ((byte []) (a));
	// 8578 16018:aload_0         
	// 8579 16019:getfield        #12  <Field azh a>
	// 8580 16022:astore_1        
		abyte0.bR = ((azh) (abyte0)).Y & a.z;
	// 8581 16023:aload_1         
	// 8582 16024:aload_1         
	// 8583 16025:getfield        #330 <Field int azh.Y>
	// 8584 16028:aload_0         
	// 8585 16029:getfield        #12  <Field azh a>
	// 8586 16032:getfield        #366 <Field int azh.z>
	// 8587 16035:iand            
	// 8588 16036:putfield        #135 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 8589 16039:aload_0         
	// 8590 16040:getfield        #12  <Field azh a>
	// 8591 16043:astore_1        
		abyte0.bM = ((azh) (abyte0)).z ^ a.bM;
	// 8592 16044:aload_1         
	// 8593 16045:aload_1         
	// 8594 16046:getfield        #366 <Field int azh.z>
	// 8595 16049:aload_0         
	// 8596 16050:getfield        #12  <Field azh a>
	// 8597 16053:getfield        #351 <Field int azh.bM>
	// 8598 16056:ixor            
	// 8599 16057:putfield        #351 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 8600 16060:aload_0         
	// 8601 16061:getfield        #12  <Field azh a>
	// 8602 16064:astore_1        
		abyte0.bH = ((azh) (abyte0)).z | a.e;
	// 8603 16065:aload_1         
	// 8604 16066:aload_1         
	// 8605 16067:getfield        #366 <Field int azh.z>
	// 8606 16070:aload_0         
	// 8607 16071:getfield        #12  <Field azh a>
	// 8608 16074:getfield        #387 <Field int azh.e>
	// 8609 16077:ior             
	// 8610 16078:putfield        #168 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 8611 16081:aload_0         
	// 8612 16082:getfield        #12  <Field azh a>
	// 8613 16085:astore_1        
		abyte0.by = ((azh) (abyte0)).Y & a.bH;
	// 8614 16086:aload_1         
	// 8615 16087:aload_1         
	// 8616 16088:getfield        #330 <Field int azh.Y>
	// 8617 16091:aload_0         
	// 8618 16092:getfield        #12  <Field azh a>
	// 8619 16095:getfield        #168 <Field int azh.bH>
	// 8620 16098:iand            
	// 8621 16099:putfield        #216 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 8622 16102:aload_0         
	// 8623 16103:getfield        #12  <Field azh a>
	// 8624 16106:astore_1        
		abyte0.by = ((azh) (abyte0)).bK ^ a.by;
	// 8625 16107:aload_1         
	// 8626 16108:aload_1         
	// 8627 16109:getfield        #318 <Field int azh.bK>
	// 8628 16112:aload_0         
	// 8629 16113:getfield        #12  <Field azh a>
	// 8630 16116:getfield        #216 <Field int azh.by>
	// 8631 16119:ixor            
	// 8632 16120:putfield        #216 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 8633 16123:aload_0         
	// 8634 16124:getfield        #12  <Field azh a>
	// 8635 16127:astore_1        
		abyte0.bB = ((azh) (abyte0)).Y & a.bH;
	// 8636 16128:aload_1         
	// 8637 16129:aload_1         
	// 8638 16130:getfield        #330 <Field int azh.Y>
	// 8639 16133:aload_0         
	// 8640 16134:getfield        #12  <Field azh a>
	// 8641 16137:getfield        #168 <Field int azh.bH>
	// 8642 16140:iand            
	// 8643 16141:putfield        #219 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 8644 16144:aload_0         
	// 8645 16145:getfield        #12  <Field azh a>
	// 8646 16148:astore_1        
		abyte0.bB = ((azh) (abyte0)).A ^ a.bB;
	// 8647 16149:aload_1         
	// 8648 16150:aload_1         
	// 8649 16151:getfield        #423 <Field int azh.A>
	// 8650 16154:aload_0         
	// 8651 16155:getfield        #12  <Field azh a>
	// 8652 16158:getfield        #219 <Field int azh.bB>
	// 8653 16161:ixor            
	// 8654 16162:putfield        #219 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 8655 16165:aload_0         
	// 8656 16166:getfield        #12  <Field azh a>
	// 8657 16169:astore_1        
		abyte0.bY = ((azh) (abyte0)).ab & ~a.aQ;
	// 8658 16170:aload_1         
	// 8659 16171:aload_1         
	// 8660 16172:getfield        #438 <Field int azh.ab>
	// 8661 16175:aload_0         
	// 8662 16176:getfield        #12  <Field azh a>
	// 8663 16179:getfield        #52  <Field int azh.aQ>
	// 8664 16182:iconst_m1       
	// 8665 16183:ixor            
	// 8666 16184:iand            
	// 8667 16185:putfield        #441 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 8668 16188:aload_0         
	// 8669 16189:getfield        #12  <Field azh a>
	// 8670 16192:astore_1        
		abyte0.bY = ((azh) (abyte0)).aA ^ a.bY;
	// 8671 16193:aload_1         
	// 8672 16194:aload_1         
	// 8673 16195:getfield        #73  <Field int azh.aA>
	// 8674 16198:aload_0         
	// 8675 16199:getfield        #12  <Field azh a>
	// 8676 16202:getfield        #441 <Field int azh.bY>
	// 8677 16205:ixor            
	// 8678 16206:putfield        #441 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 8679 16209:aload_0         
	// 8680 16210:getfield        #12  <Field azh a>
	// 8681 16213:astore_1        
		abyte0.bY = ((azh) (abyte0)).L | a.bY;
	// 8682 16214:aload_1         
	// 8683 16215:aload_1         
	// 8684 16216:getfield        #285 <Field int azh.L>
	// 8685 16219:aload_0         
	// 8686 16220:getfield        #12  <Field azh a>
	// 8687 16223:getfield        #441 <Field int azh.bY>
	// 8688 16226:ior             
	// 8689 16227:putfield        #441 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 8690 16230:aload_0         
	// 8691 16231:getfield        #12  <Field azh a>
	// 8692 16234:astore_1        
		abyte0.bY = ((azh) (abyte0)).aZ ^ a.bY;
	// 8693 16235:aload_1         
	// 8694 16236:aload_1         
	// 8695 16237:getfield        #375 <Field int azh.aZ>
	// 8696 16240:aload_0         
	// 8697 16241:getfield        #12  <Field azh a>
	// 8698 16244:getfield        #441 <Field int azh.bY>
	// 8699 16247:ixor            
	// 8700 16248:putfield        #441 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 8701 16251:aload_0         
	// 8702 16252:getfield        #12  <Field azh a>
	// 8703 16255:astore_1        
		abyte0.ar = ((azh) (abyte0)).bY ^ a.ar;
	// 8704 16256:aload_1         
	// 8705 16257:aload_1         
	// 8706 16258:getfield        #441 <Field int azh.bY>
	// 8707 16261:aload_0         
	// 8708 16262:getfield        #12  <Field azh a>
	// 8709 16265:getfield        #37  <Field int azh.ar>
	// 8710 16268:ixor            
	// 8711 16269:putfield        #37  <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 8712 16272:aload_0         
	// 8713 16273:getfield        #12  <Field azh a>
	// 8714 16276:astore_1        
		abyte0.ar = ((azh) (abyte0)).ar & ~a.h;
	// 8715 16277:aload_1         
	// 8716 16278:aload_1         
	// 8717 16279:getfield        #37  <Field int azh.ar>
	// 8718 16282:aload_0         
	// 8719 16283:getfield        #12  <Field azh a>
	// 8720 16286:getfield        #321 <Field int azh.h>
	// 8721 16289:iconst_m1       
	// 8722 16290:ixor            
	// 8723 16291:iand            
	// 8724 16292:putfield        #37  <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 8725 16295:aload_0         
	// 8726 16296:getfield        #12  <Field azh a>
	// 8727 16299:astore_1        
		abyte0.ar = ((azh) (abyte0)).av ^ a.ar;
	// 8728 16300:aload_1         
	// 8729 16301:aload_1         
	// 8730 16302:getfield        #267 <Field int azh.av>
	// 8731 16305:aload_0         
	// 8732 16306:getfield        #12  <Field azh a>
	// 8733 16309:getfield        #37  <Field int azh.ar>
	// 8734 16312:ixor            
	// 8735 16313:putfield        #37  <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 8736 16316:aload_0         
	// 8737 16317:getfield        #12  <Field azh a>
	// 8738 16320:astore_1        
		abyte0.q = ((azh) (abyte0)).ar ^ a.q;
	// 8739 16321:aload_1         
	// 8740 16322:aload_1         
	// 8741 16323:getfield        #37  <Field int azh.ar>
	// 8742 16326:aload_0         
	// 8743 16327:getfield        #12  <Field azh a>
	// 8744 16330:getfield        #444 <Field int azh.q>
	// 8745 16333:ixor            
	// 8746 16334:putfield        #444 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 8747 16337:aload_0         
	// 8748 16338:getfield        #12  <Field azh a>
	// 8749 16341:astore_1        
		abyte0.ar = ((azh) (abyte0)).q & ~a.G;
	// 8750 16342:aload_1         
	// 8751 16343:aload_1         
	// 8752 16344:getfield        #444 <Field int azh.q>
	// 8753 16347:aload_0         
	// 8754 16348:getfield        #12  <Field azh a>
	// 8755 16351:getfield        #336 <Field int azh.G>
	// 8756 16354:iconst_m1       
	// 8757 16355:ixor            
	// 8758 16356:iand            
	// 8759 16357:putfield        #37  <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 8760 16360:aload_0         
	// 8761 16361:getfield        #12  <Field azh a>
	// 8762 16364:astore_1        
		abyte0.ar = ((azh) (abyte0)).G ^ a.ar;
	// 8763 16365:aload_1         
	// 8764 16366:aload_1         
	// 8765 16367:getfield        #336 <Field int azh.G>
	// 8766 16370:aload_0         
	// 8767 16371:getfield        #12  <Field azh a>
	// 8768 16374:getfield        #37  <Field int azh.ar>
	// 8769 16377:ixor            
	// 8770 16378:putfield        #37  <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 8771 16381:aload_0         
	// 8772 16382:getfield        #12  <Field azh a>
	// 8773 16385:astore_1        
		abyte0.av = ((azh) (abyte0)).q & ~a.G;
	// 8774 16386:aload_1         
	// 8775 16387:aload_1         
	// 8776 16388:getfield        #444 <Field int azh.q>
	// 8777 16391:aload_0         
	// 8778 16392:getfield        #12  <Field azh a>
	// 8779 16395:getfield        #336 <Field int azh.G>
	// 8780 16398:iconst_m1       
	// 8781 16399:ixor            
	// 8782 16400:iand            
	// 8783 16401:putfield        #267 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 8784 16404:aload_0         
	// 8785 16405:getfield        #12  <Field azh a>
	// 8786 16408:astore_1        
		abyte0.bY = ((azh) (abyte0)).G ^ a.q;
	// 8787 16409:aload_1         
	// 8788 16410:aload_1         
	// 8789 16411:getfield        #336 <Field int azh.G>
	// 8790 16414:aload_0         
	// 8791 16415:getfield        #12  <Field azh a>
	// 8792 16418:getfield        #444 <Field int azh.q>
	// 8793 16421:ixor            
	// 8794 16422:putfield        #441 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 8795 16425:aload_0         
	// 8796 16426:getfield        #12  <Field azh a>
	// 8797 16429:astore_1        
		abyte0.aZ = ((azh) (abyte0)).q & a.G;
	// 8798 16430:aload_1         
	// 8799 16431:aload_1         
	// 8800 16432:getfield        #444 <Field int azh.q>
	// 8801 16435:aload_0         
	// 8802 16436:getfield        #12  <Field azh a>
	// 8803 16439:getfield        #336 <Field int azh.G>
	// 8804 16442:iand            
	// 8805 16443:putfield        #375 <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 8806 16446:aload_0         
	// 8807 16447:getfield        #12  <Field azh a>
	// 8808 16450:astore_1        
		abyte0.aQ = ((azh) (abyte0)).ab & ~a.aQ;
	// 8809 16451:aload_1         
	// 8810 16452:aload_1         
	// 8811 16453:getfield        #438 <Field int azh.ab>
	// 8812 16456:aload_0         
	// 8813 16457:getfield        #12  <Field azh a>
	// 8814 16460:getfield        #52  <Field int azh.aQ>
	// 8815 16463:iconst_m1       
	// 8816 16464:ixor            
	// 8817 16465:iand            
	// 8818 16466:putfield        #52  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 8819 16469:aload_0         
	// 8820 16470:getfield        #12  <Field azh a>
	// 8821 16473:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bg ^ a.aQ;
	// 8822 16474:aload_1         
	// 8823 16475:aload_1         
	// 8824 16476:getfield        #273 <Field int azh.bg>
	// 8825 16479:aload_0         
	// 8826 16480:getfield        #12  <Field azh a>
	// 8827 16483:getfield        #52  <Field int azh.aQ>
	// 8828 16486:ixor            
	// 8829 16487:putfield        #52  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 8830 16490:aload_0         
	// 8831 16491:getfield        #12  <Field azh a>
	// 8832 16494:astore_1        
		abyte0.az = ((azh) (abyte0)).aQ ^ a.az;
	// 8833 16495:aload_1         
	// 8834 16496:aload_1         
	// 8835 16497:getfield        #52  <Field int azh.aQ>
	// 8836 16500:aload_0         
	// 8837 16501:getfield        #12  <Field azh a>
	// 8838 16504:getfield        #411 <Field int azh.az>
	// 8839 16507:ixor            
	// 8840 16508:putfield        #411 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 8841 16511:aload_0         
	// 8842 16512:getfield        #12  <Field azh a>
	// 8843 16515:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aj & ~a.az;
	// 8844 16516:aload_1         
	// 8845 16517:aload_1         
	// 8846 16518:getfield        #303 <Field int azh.aj>
	// 8847 16521:aload_0         
	// 8848 16522:getfield        #12  <Field azh a>
	// 8849 16525:getfield        #411 <Field int azh.az>
	// 8850 16528:iconst_m1       
	// 8851 16529:ixor            
	// 8852 16530:iand            
	// 8853 16531:putfield        #52  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 8854 16534:aload_0         
	// 8855 16535:getfield        #12  <Field azh a>
	// 8856 16538:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bo ^ a.aQ;
	// 8857 16539:aload_1         
	// 8858 16540:aload_1         
	// 8859 16541:getfield        #420 <Field int azh.bo>
	// 8860 16544:aload_0         
	// 8861 16545:getfield        #12  <Field azh a>
	// 8862 16548:getfield        #52  <Field int azh.aQ>
	// 8863 16551:ixor            
	// 8864 16552:putfield        #52  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 8865 16555:aload_0         
	// 8866 16556:getfield        #12  <Field azh a>
	// 8867 16559:astore_1        
		abyte0.az = ((azh) (abyte0)).aj & a.az;
	// 8868 16560:aload_1         
	// 8869 16561:aload_1         
	// 8870 16562:getfield        #303 <Field int azh.aj>
	// 8871 16565:aload_0         
	// 8872 16566:getfield        #12  <Field azh a>
	// 8873 16569:getfield        #411 <Field int azh.az>
	// 8874 16572:iand            
	// 8875 16573:putfield        #411 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 8876 16576:aload_0         
	// 8877 16577:getfield        #12  <Field azh a>
	// 8878 16580:astore_1        
		abyte0.bo = ((azh) (abyte0)).T ^ a.ab;
	// 8879 16581:aload_1         
	// 8880 16582:aload_1         
	// 8881 16583:getfield        #43  <Field int azh.T>
	// 8882 16586:aload_0         
	// 8883 16587:getfield        #12  <Field azh a>
	// 8884 16590:getfield        #438 <Field int azh.ab>
	// 8885 16593:ixor            
	// 8886 16594:putfield        #420 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 8887 16597:aload_0         
	// 8888 16598:getfield        #12  <Field azh a>
	// 8889 16601:astore_1        
		abyte0.bo = ((azh) (abyte0)).bo & ~a.L;
	// 8890 16602:aload_1         
	// 8891 16603:aload_1         
	// 8892 16604:getfield        #420 <Field int azh.bo>
	// 8893 16607:aload_0         
	// 8894 16608:getfield        #12  <Field azh a>
	// 8895 16611:getfield        #285 <Field int azh.L>
	// 8896 16614:iconst_m1       
	// 8897 16615:ixor            
	// 8898 16616:iand            
	// 8899 16617:putfield        #420 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 8900 16620:aload_0         
	// 8901 16621:getfield        #12  <Field azh a>
	// 8902 16624:astore_1        
		abyte0.bo = ((azh) (abyte0)).bP ^ a.bo;
	// 8903 16625:aload_1         
	// 8904 16626:aload_1         
	// 8905 16627:getfield        #279 <Field int azh.bP>
	// 8906 16630:aload_0         
	// 8907 16631:getfield        #12  <Field azh a>
	// 8908 16634:getfield        #420 <Field int azh.bo>
	// 8909 16637:ixor            
	// 8910 16638:putfield        #420 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 8911 16641:aload_0         
	// 8912 16642:getfield        #12  <Field azh a>
	// 8913 16645:astore_1        
		abyte0.az = ((azh) (abyte0)).bo ^ a.az;
	// 8914 16646:aload_1         
	// 8915 16647:aload_1         
	// 8916 16648:getfield        #420 <Field int azh.bo>
	// 8917 16651:aload_0         
	// 8918 16652:getfield        #12  <Field azh a>
	// 8919 16655:getfield        #411 <Field int azh.az>
	// 8920 16658:ixor            
	// 8921 16659:putfield        #411 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 8922 16662:aload_0         
	// 8923 16663:getfield        #12  <Field azh a>
	// 8924 16666:astore_1        
		abyte0.az = ((azh) (abyte0)).az & ~a.h;
	// 8925 16667:aload_1         
	// 8926 16668:aload_1         
	// 8927 16669:getfield        #411 <Field int azh.az>
	// 8928 16672:aload_0         
	// 8929 16673:getfield        #12  <Field azh a>
	// 8930 16676:getfield        #321 <Field int azh.h>
	// 8931 16679:iconst_m1       
	// 8932 16680:ixor            
	// 8933 16681:iand            
	// 8934 16682:putfield        #411 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 8935 16685:aload_0         
	// 8936 16686:getfield        #12  <Field azh a>
	// 8937 16689:astore_1        
		abyte0.az = ((azh) (abyte0)).aQ ^ a.az;
	// 8938 16690:aload_1         
	// 8939 16691:aload_1         
	// 8940 16692:getfield        #52  <Field int azh.aQ>
	// 8941 16695:aload_0         
	// 8942 16696:getfield        #12  <Field azh a>
	// 8943 16699:getfield        #411 <Field int azh.az>
	// 8944 16702:ixor            
	// 8945 16703:putfield        #411 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 8946 16706:aload_0         
	// 8947 16707:getfield        #12  <Field azh a>
	// 8948 16710:astore_1        
		abyte0.w = ((azh) (abyte0)).az ^ a.w;
	// 8949 16711:aload_1         
	// 8950 16712:aload_1         
	// 8951 16713:getfield        #411 <Field int azh.az>
	// 8952 16716:aload_0         
	// 8953 16717:getfield        #12  <Field azh a>
	// 8954 16720:getfield        #258 <Field int azh.w>
	// 8955 16723:ixor            
	// 8956 16724:putfield        #258 <Field int azh.w>
		abyte0 = ((byte []) (a));
	// 8957 16727:aload_0         
	// 8958 16728:getfield        #12  <Field azh a>
	// 8959 16731:astore_1        
		abyte0.az = ((azh) (abyte0)).ai | a.w;
	// 8960 16732:aload_1         
	// 8961 16733:aload_1         
	// 8962 16734:getfield        #129 <Field int azh.ai>
	// 8963 16737:aload_0         
	// 8964 16738:getfield        #12  <Field azh a>
	// 8965 16741:getfield        #258 <Field int azh.w>
	// 8966 16744:ior             
	// 8967 16745:putfield        #411 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 8968 16748:aload_0         
	// 8969 16749:getfield        #12  <Field azh a>
	// 8970 16752:astore_1        
		abyte0.W = ((azh) (abyte0)).az ^ a.W;
	// 8971 16753:aload_1         
	// 8972 16754:aload_1         
	// 8973 16755:getfield        #411 <Field int azh.az>
	// 8974 16758:aload_0         
	// 8975 16759:getfield        #12  <Field azh a>
	// 8976 16762:getfield        #342 <Field int azh.W>
	// 8977 16765:ixor            
	// 8978 16766:putfield        #342 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 8979 16769:aload_0         
	// 8980 16770:getfield        #12  <Field azh a>
	// 8981 16773:astore_1        
		abyte0.aQ = ((azh) (abyte0)).az & ~a.ai;
	// 8982 16774:aload_1         
	// 8983 16775:aload_1         
	// 8984 16776:getfield        #411 <Field int azh.az>
	// 8985 16779:aload_0         
	// 8986 16780:getfield        #12  <Field azh a>
	// 8987 16783:getfield        #129 <Field int azh.ai>
	// 8988 16786:iconst_m1       
	// 8989 16787:ixor            
	// 8990 16788:iand            
	// 8991 16789:putfield        #52  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 8992 16792:aload_0         
	// 8993 16793:getfield        #12  <Field azh a>
	// 8994 16796:astore_1        
		abyte0.aQ = ((azh) (abyte0)).E | a.aQ;
	// 8995 16797:aload_1         
	// 8996 16798:aload_1         
	// 8997 16799:getfield        #76  <Field int azh.E>
	// 8998 16802:aload_0         
	// 8999 16803:getfield        #12  <Field azh a>
	// 9000 16806:getfield        #52  <Field int azh.aQ>
	// 9001 16809:ior             
	// 9002 16810:putfield        #52  <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 9003 16813:aload_0         
	// 9004 16814:getfield        #12  <Field azh a>
	// 9005 16817:astore_1        
		abyte0.bo = ((azh) (abyte0)).w & a.ai;
	// 9006 16818:aload_1         
	// 9007 16819:aload_1         
	// 9008 16820:getfield        #258 <Field int azh.w>
	// 9009 16823:aload_0         
	// 9010 16824:getfield        #12  <Field azh a>
	// 9011 16827:getfield        #129 <Field int azh.ai>
	// 9012 16830:iand            
	// 9013 16831:putfield        #420 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 9014 16834:aload_0         
	// 9015 16835:getfield        #12  <Field azh a>
	// 9016 16838:astore_1        
		abyte0.bP = ((azh) (abyte0)).E | a.bo;
	// 9017 16839:aload_1         
	// 9018 16840:aload_1         
	// 9019 16841:getfield        #76  <Field int azh.E>
	// 9020 16844:aload_0         
	// 9021 16845:getfield        #12  <Field azh a>
	// 9022 16848:getfield        #420 <Field int azh.bo>
	// 9023 16851:ior             
	// 9024 16852:putfield        #279 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 9025 16855:aload_0         
	// 9026 16856:getfield        #12  <Field azh a>
	// 9027 16859:astore_1        
		abyte0.bP = ((azh) (abyte0)).az ^ a.bP;
	// 9028 16860:aload_1         
	// 9029 16861:aload_1         
	// 9030 16862:getfield        #411 <Field int azh.az>
	// 9031 16865:aload_0         
	// 9032 16866:getfield        #12  <Field azh a>
	// 9033 16869:getfield        #279 <Field int azh.bP>
	// 9034 16872:ixor            
	// 9035 16873:putfield        #279 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 9036 16876:aload_0         
	// 9037 16877:getfield        #12  <Field azh a>
	// 9038 16880:astore_1        
		abyte0.bg = ((azh) (abyte0)).E | a.bo;
	// 9039 16881:aload_1         
	// 9040 16882:aload_1         
	// 9041 16883:getfield        #76  <Field int azh.E>
	// 9042 16886:aload_0         
	// 9043 16887:getfield        #12  <Field azh a>
	// 9044 16890:getfield        #420 <Field int azh.bo>
	// 9045 16893:ior             
	// 9046 16894:putfield        #273 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 9047 16897:aload_0         
	// 9048 16898:getfield        #12  <Field azh a>
	// 9049 16901:astore_1        
		abyte0.aA = ((azh) (abyte0)).ai & ~a.bo;
	// 9050 16902:aload_1         
	// 9051 16903:aload_1         
	// 9052 16904:getfield        #129 <Field int azh.ai>
	// 9053 16907:aload_0         
	// 9054 16908:getfield        #12  <Field azh a>
	// 9055 16911:getfield        #420 <Field int azh.bo>
	// 9056 16914:iconst_m1       
	// 9057 16915:ixor            
	// 9058 16916:iand            
	// 9059 16917:putfield        #73  <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 9060 16920:aload_0         
	// 9061 16921:getfield        #12  <Field azh a>
	// 9062 16924:astore_1        
		abyte0.bC = ((azh) (abyte0)).aA ^ a.E;
	// 9063 16925:aload_1         
	// 9064 16926:aload_1         
	// 9065 16927:getfield        #73  <Field int azh.aA>
	// 9066 16930:aload_0         
	// 9067 16931:getfield        #12  <Field azh a>
	// 9068 16934:getfield        #76  <Field int azh.E>
	// 9069 16937:ixor            
	// 9070 16938:putfield        #447 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 9071 16941:aload_0         
	// 9072 16942:getfield        #12  <Field azh a>
	// 9073 16945:astore_1        
		abyte0.aq = ((azh) (abyte0)).w ^ a.aq;
	// 9074 16946:aload_1         
	// 9075 16947:aload_1         
	// 9076 16948:getfield        #258 <Field int azh.w>
	// 9077 16951:aload_0         
	// 9078 16952:getfield        #12  <Field azh a>
	// 9079 16955:getfield        #300 <Field int azh.aq>
	// 9080 16958:ixor            
	// 9081 16959:putfield        #300 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 9082 16962:aload_0         
	// 9083 16963:getfield        #12  <Field azh a>
	// 9084 16966:astore_1        
		abyte0.aE = ((azh) (abyte0)).w ^ a.ai;
	// 9085 16967:aload_1         
	// 9086 16968:aload_1         
	// 9087 16969:getfield        #258 <Field int azh.w>
	// 9088 16972:aload_0         
	// 9089 16973:getfield        #12  <Field azh a>
	// 9090 16976:getfield        #129 <Field int azh.ai>
	// 9091 16979:ixor            
	// 9092 16980:putfield        #450 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 9093 16983:aload_0         
	// 9094 16984:getfield        #12  <Field azh a>
	// 9095 16987:astore_1        
		abyte0.aD = ((azh) (abyte0)).E | a.aE;
	// 9096 16988:aload_1         
	// 9097 16989:aload_1         
	// 9098 16990:getfield        #76  <Field int azh.E>
	// 9099 16993:aload_0         
	// 9100 16994:getfield        #12  <Field azh a>
	// 9101 16997:getfield        #450 <Field int azh.aE>
	// 9102 17000:ior             
	// 9103 17001:putfield        #453 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 9104 17004:aload_0         
	// 9105 17005:getfield        #12  <Field azh a>
	// 9106 17008:astore_1        
		abyte0.aD = ((azh) (abyte0)).bo ^ a.aD;
	// 9107 17009:aload_1         
	// 9108 17010:aload_1         
	// 9109 17011:getfield        #420 <Field int azh.bo>
	// 9110 17014:aload_0         
	// 9111 17015:getfield        #12  <Field azh a>
	// 9112 17018:getfield        #453 <Field int azh.aD>
	// 9113 17021:ixor            
	// 9114 17022:putfield        #453 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 9115 17025:aload_0         
	// 9116 17026:getfield        #12  <Field azh a>
	// 9117 17029:astore_1        
		abyte0.aY = ((azh) (abyte0)).aE & ~a.E;
	// 9118 17030:aload_1         
	// 9119 17031:aload_1         
	// 9120 17032:getfield        #450 <Field int azh.aE>
	// 9121 17035:aload_0         
	// 9122 17036:getfield        #12  <Field azh a>
	// 9123 17039:getfield        #76  <Field int azh.E>
	// 9124 17042:iconst_m1       
	// 9125 17043:ixor            
	// 9126 17044:iand            
	// 9127 17045:putfield        #456 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 9128 17048:aload_0         
	// 9129 17049:getfield        #12  <Field azh a>
	// 9130 17052:astore_1        
		abyte0.aY = ((azh) (abyte0)).az ^ a.aY;
	// 9131 17053:aload_1         
	// 9132 17054:aload_1         
	// 9133 17055:getfield        #411 <Field int azh.az>
	// 9134 17058:aload_0         
	// 9135 17059:getfield        #12  <Field azh a>
	// 9136 17062:getfield        #456 <Field int azh.aY>
	// 9137 17065:ixor            
	// 9138 17066:putfield        #456 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 9139 17069:aload_0         
	// 9140 17070:getfield        #12  <Field azh a>
	// 9141 17073:astore_1        
		abyte0.az = ((azh) (abyte0)).w & ~a.ai;
	// 9142 17074:aload_1         
	// 9143 17075:aload_1         
	// 9144 17076:getfield        #258 <Field int azh.w>
	// 9145 17079:aload_0         
	// 9146 17080:getfield        #12  <Field azh a>
	// 9147 17083:getfield        #129 <Field int azh.ai>
	// 9148 17086:iconst_m1       
	// 9149 17087:ixor            
	// 9150 17088:iand            
	// 9151 17089:putfield        #411 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 9152 17092:aload_0         
	// 9153 17093:getfield        #12  <Field azh a>
	// 9154 17096:astore_1        
		abyte0.bg = ((azh) (abyte0)).az ^ a.bg;
	// 9155 17097:aload_1         
	// 9156 17098:aload_1         
	// 9157 17099:getfield        #411 <Field int azh.az>
	// 9158 17102:aload_0         
	// 9159 17103:getfield        #12  <Field azh a>
	// 9160 17106:getfield        #273 <Field int azh.bg>
	// 9161 17109:ixor            
	// 9162 17110:putfield        #273 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 9163 17113:aload_0         
	// 9164 17114:getfield        #12  <Field azh a>
	// 9165 17117:astore_1        
		abyte0.ae = ((azh) (abyte0)).az & ~a.E;
	// 9166 17118:aload_1         
	// 9167 17119:aload_1         
	// 9168 17120:getfield        #411 <Field int azh.az>
	// 9169 17123:aload_0         
	// 9170 17124:getfield        #12  <Field azh a>
	// 9171 17127:getfield        #76  <Field int azh.E>
	// 9172 17130:iconst_m1       
	// 9173 17131:ixor            
	// 9174 17132:iand            
	// 9175 17133:putfield        #459 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 9176 17136:aload_0         
	// 9177 17137:getfield        #12  <Field azh a>
	// 9178 17140:astore_1        
		abyte0.ae = ((azh) (abyte0)).ai ^ a.ae;
	// 9179 17141:aload_1         
	// 9180 17142:aload_1         
	// 9181 17143:getfield        #129 <Field int azh.ai>
	// 9182 17146:aload_0         
	// 9183 17147:getfield        #12  <Field azh a>
	// 9184 17150:getfield        #459 <Field int azh.ae>
	// 9185 17153:ixor            
	// 9186 17154:putfield        #459 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 9187 17157:aload_0         
	// 9188 17158:getfield        #12  <Field azh a>
	// 9189 17161:astore_1        
		abyte0.bp = ((azh) (abyte0)).az & ~a.E;
	// 9190 17162:aload_1         
	// 9191 17163:aload_1         
	// 9192 17164:getfield        #411 <Field int azh.az>
	// 9193 17167:aload_0         
	// 9194 17168:getfield        #12  <Field azh a>
	// 9195 17171:getfield        #76  <Field int azh.E>
	// 9196 17174:iconst_m1       
	// 9197 17175:ixor            
	// 9198 17176:iand            
	// 9199 17177:putfield        #462 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 9200 17180:aload_0         
	// 9201 17181:getfield        #12  <Field azh a>
	// 9202 17184:astore_1        
		abyte0.az = ((azh) (abyte0)).az & ~a.E;
	// 9203 17185:aload_1         
	// 9204 17186:aload_1         
	// 9205 17187:getfield        #411 <Field int azh.az>
	// 9206 17190:aload_0         
	// 9207 17191:getfield        #12  <Field azh a>
	// 9208 17194:getfield        #76  <Field int azh.E>
	// 9209 17197:iconst_m1       
	// 9210 17198:ixor            
	// 9211 17199:iand            
	// 9212 17200:putfield        #411 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 9213 17203:aload_0         
	// 9214 17204:getfield        #12  <Field azh a>
	// 9215 17207:astore_1        
		abyte0.az = ((azh) (abyte0)).aE ^ a.az;
	// 9216 17208:aload_1         
	// 9217 17209:aload_1         
	// 9218 17210:getfield        #450 <Field int azh.aE>
	// 9219 17213:aload_0         
	// 9220 17214:getfield        #12  <Field azh a>
	// 9221 17217:getfield        #411 <Field int azh.az>
	// 9222 17220:ixor            
	// 9223 17221:putfield        #411 <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 9224 17224:aload_0         
	// 9225 17225:getfield        #12  <Field azh a>
	// 9226 17228:astore_1        
		abyte0.aK = ((azh) (abyte0)).bQ ^ a.aK;
	// 9227 17229:aload_1         
	// 9228 17230:aload_1         
	// 9229 17231:getfield        #399 <Field int azh.bQ>
	// 9230 17234:aload_0         
	// 9231 17235:getfield        #12  <Field azh a>
	// 9232 17238:getfield        #465 <Field int azh.aK>
	// 9233 17241:ixor            
	// 9234 17242:putfield        #465 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 9235 17245:aload_0         
	// 9236 17246:getfield        #12  <Field azh a>
	// 9237 17249:astore_1        
		abyte0.aK = ((azh) (abyte0)).C | a.aK;
	// 9238 17250:aload_1         
	// 9239 17251:aload_1         
	// 9240 17252:getfield        #333 <Field int azh.C>
	// 9241 17255:aload_0         
	// 9242 17256:getfield        #12  <Field azh a>
	// 9243 17259:getfield        #465 <Field int azh.aK>
	// 9244 17262:ior             
	// 9245 17263:putfield        #465 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 9246 17266:aload_0         
	// 9247 17267:getfield        #12  <Field azh a>
	// 9248 17270:astore_1        
		abyte0.aK = ((azh) (abyte0)).aC ^ a.aK;
	// 9249 17271:aload_1         
	// 9250 17272:aload_1         
	// 9251 17273:getfield        #369 <Field int azh.aC>
	// 9252 17276:aload_0         
	// 9253 17277:getfield        #12  <Field azh a>
	// 9254 17280:getfield        #465 <Field int azh.aK>
	// 9255 17283:ixor            
	// 9256 17284:putfield        #465 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 9257 17287:aload_0         
	// 9258 17288:getfield        #12  <Field azh a>
	// 9259 17291:astore_1        
		abyte0.aC = ((azh) (abyte0)).ag & ~a.aK;
	// 9260 17292:aload_1         
	// 9261 17293:aload_1         
	// 9262 17294:getfield        #414 <Field int azh.ag>
	// 9263 17297:aload_0         
	// 9264 17298:getfield        #12  <Field azh a>
	// 9265 17301:getfield        #465 <Field int azh.aK>
	// 9266 17304:iconst_m1       
	// 9267 17305:ixor            
	// 9268 17306:iand            
	// 9269 17307:putfield        #369 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 9270 17310:aload_0         
	// 9271 17311:getfield        #12  <Field azh a>
	// 9272 17314:astore_1        
		abyte0.aC = ((azh) (abyte0)).bz ^ a.aC;
	// 9273 17315:aload_1         
	// 9274 17316:aload_1         
	// 9275 17317:getfield        #408 <Field int azh.bz>
	// 9276 17320:aload_0         
	// 9277 17321:getfield        #12  <Field azh a>
	// 9278 17324:getfield        #369 <Field int azh.aC>
	// 9279 17327:ixor            
	// 9280 17328:putfield        #369 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 9281 17331:aload_0         
	// 9282 17332:getfield        #12  <Field azh a>
	// 9283 17335:astore_1        
		abyte0.X = ((azh) (abyte0)).aC ^ a.X;
	// 9284 17336:aload_1         
	// 9285 17337:aload_1         
	// 9286 17338:getfield        #369 <Field int azh.aC>
	// 9287 17341:aload_0         
	// 9288 17342:getfield        #12  <Field azh a>
	// 9289 17345:getfield        #468 <Field int azh.X>
	// 9290 17348:ixor            
	// 9291 17349:putfield        #468 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 9292 17352:aload_0         
	// 9293 17353:getfield        #12  <Field azh a>
	// 9294 17356:astore_1        
		abyte0.bI = ((azh) (abyte0)).X | a.bI;
	// 9295 17357:aload_1         
	// 9296 17358:aload_1         
	// 9297 17359:getfield        #468 <Field int azh.X>
	// 9298 17362:aload_0         
	// 9299 17363:getfield        #12  <Field azh a>
	// 9300 17366:getfield        #225 <Field int azh.bI>
	// 9301 17369:ior             
	// 9302 17370:putfield        #225 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 9303 17373:aload_0         
	// 9304 17374:getfield        #12  <Field azh a>
	// 9305 17377:astore_1        
		abyte0.bI = ((azh) (abyte0)).aV ^ a.bI;
	// 9306 17378:aload_1         
	// 9307 17379:aload_1         
	// 9308 17380:getfield        #126 <Field int azh.aV>
	// 9309 17383:aload_0         
	// 9310 17384:getfield        #12  <Field azh a>
	// 9311 17387:getfield        #225 <Field int azh.bI>
	// 9312 17390:ixor            
	// 9313 17391:putfield        #225 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 9314 17394:aload_0         
	// 9315 17395:getfield        #12  <Field azh a>
	// 9316 17398:astore_1        
		abyte0.bI = ((azh) (abyte0)).bE | a.bI;
	// 9317 17399:aload_1         
	// 9318 17400:aload_1         
	// 9319 17401:getfield        #162 <Field int azh.bE>
	// 9320 17404:aload_0         
	// 9321 17405:getfield        #12  <Field azh a>
	// 9322 17408:getfield        #225 <Field int azh.bI>
	// 9323 17411:ior             
	// 9324 17412:putfield        #225 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 9325 17415:aload_0         
	// 9326 17416:getfield        #12  <Field azh a>
	// 9327 17419:astore_1        
		abyte0.au = ((azh) (abyte0)).X | a.au;
	// 9328 17420:aload_1         
	// 9329 17421:aload_1         
	// 9330 17422:getfield        #468 <Field int azh.X>
	// 9331 17425:aload_0         
	// 9332 17426:getfield        #12  <Field azh a>
	// 9333 17429:getfield        #228 <Field int azh.au>
	// 9334 17432:ior             
	// 9335 17433:putfield        #228 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 9336 17436:aload_0         
	// 9337 17437:getfield        #12  <Field azh a>
	// 9338 17440:astore_1        
		abyte0.au = ((azh) (abyte0)).bx ^ a.au;
	// 9339 17441:aload_1         
	// 9340 17442:aload_1         
	// 9341 17443:getfield        #243 <Field int azh.bx>
	// 9342 17446:aload_0         
	// 9343 17447:getfield        #12  <Field azh a>
	// 9344 17450:getfield        #228 <Field int azh.au>
	// 9345 17453:ixor            
	// 9346 17454:putfield        #228 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 9347 17457:aload_0         
	// 9348 17458:getfield        #12  <Field azh a>
	// 9349 17461:astore_1        
		abyte0.bU = ((azh) (abyte0)).X | a.bU;
	// 9350 17462:aload_1         
	// 9351 17463:aload_1         
	// 9352 17464:getfield        #468 <Field int azh.X>
	// 9353 17467:aload_0         
	// 9354 17468:getfield        #12  <Field azh a>
	// 9355 17471:getfield        #231 <Field int azh.bU>
	// 9356 17474:ior             
	// 9357 17475:putfield        #231 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 9358 17478:aload_0         
	// 9359 17479:getfield        #12  <Field azh a>
	// 9360 17482:astore_1        
		abyte0.bU = ((azh) (abyte0)).ao ^ a.bU;
	// 9361 17483:aload_1         
	// 9362 17484:aload_1         
	// 9363 17485:getfield        #141 <Field int azh.ao>
	// 9364 17488:aload_0         
	// 9365 17489:getfield        #12  <Field azh a>
	// 9366 17492:getfield        #231 <Field int azh.bU>
	// 9367 17495:ixor            
	// 9368 17496:putfield        #231 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 9369 17499:aload_0         
	// 9370 17500:getfield        #12  <Field azh a>
	// 9371 17503:astore_1        
		abyte0.bU = ((azh) (abyte0)).bU & ~a.bE;
	// 9372 17504:aload_1         
	// 9373 17505:aload_1         
	// 9374 17506:getfield        #231 <Field int azh.bU>
	// 9375 17509:aload_0         
	// 9376 17510:getfield        #12  <Field azh a>
	// 9377 17513:getfield        #162 <Field int azh.bE>
	// 9378 17516:iconst_m1       
	// 9379 17517:ixor            
	// 9380 17518:iand            
	// 9381 17519:putfield        #231 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 9382 17522:aload_0         
	// 9383 17523:getfield        #12  <Field azh a>
	// 9384 17526:astore_1        
		abyte0.bO = ((azh) (abyte0)).bO & ~a.X;
	// 9385 17527:aload_1         
	// 9386 17528:aload_1         
	// 9387 17529:getfield        #138 <Field int azh.bO>
	// 9388 17532:aload_0         
	// 9389 17533:getfield        #12  <Field azh a>
	// 9390 17536:getfield        #468 <Field int azh.X>
	// 9391 17539:iconst_m1       
	// 9392 17540:ixor            
	// 9393 17541:iand            
	// 9394 17542:putfield        #138 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 9395 17545:aload_0         
	// 9396 17546:getfield        #12  <Field azh a>
	// 9397 17549:astore_1        
		abyte0.bO = ((azh) (abyte0)).aW ^ a.bO;
	// 9398 17550:aload_1         
	// 9399 17551:aload_1         
	// 9400 17552:getfield        #222 <Field int azh.aW>
	// 9401 17555:aload_0         
	// 9402 17556:getfield        #12  <Field azh a>
	// 9403 17559:getfield        #138 <Field int azh.bO>
	// 9404 17562:ixor            
	// 9405 17563:putfield        #138 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 9406 17566:aload_0         
	// 9407 17567:getfield        #12  <Field azh a>
	// 9408 17570:astore_1        
		abyte0.aw = ((azh) (abyte0)).X | a.aw;
	// 9409 17571:aload_1         
	// 9410 17572:aload_1         
	// 9411 17573:getfield        #468 <Field int azh.X>
	// 9412 17576:aload_0         
	// 9413 17577:getfield        #12  <Field azh a>
	// 9414 17580:getfield        #177 <Field int azh.aw>
	// 9415 17583:ior             
	// 9416 17584:putfield        #177 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 9417 17587:aload_0         
	// 9418 17588:getfield        #12  <Field azh a>
	// 9419 17591:astore_1        
		abyte0.aw = ((azh) (abyte0)).bc ^ a.aw;
	// 9420 17592:aload_1         
	// 9421 17593:aload_1         
	// 9422 17594:getfield        #234 <Field int azh.bc>
	// 9423 17597:aload_0         
	// 9424 17598:getfield        #12  <Field azh a>
	// 9425 17601:getfield        #177 <Field int azh.aw>
	// 9426 17604:ixor            
	// 9427 17605:putfield        #177 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 9428 17608:aload_0         
	// 9429 17609:getfield        #12  <Field azh a>
	// 9430 17612:astore_1        
		abyte0.aw = ((azh) (abyte0)).bE | a.aw;
	// 9431 17613:aload_1         
	// 9432 17614:aload_1         
	// 9433 17615:getfield        #162 <Field int azh.bE>
	// 9434 17618:aload_0         
	// 9435 17619:getfield        #12  <Field azh a>
	// 9436 17622:getfield        #177 <Field int azh.aw>
	// 9437 17625:ior             
	// 9438 17626:putfield        #177 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 9439 17629:aload_0         
	// 9440 17630:getfield        #12  <Field azh a>
	// 9441 17633:astore_1        
		abyte0.aw = ((azh) (abyte0)).bO ^ a.aw;
	// 9442 17634:aload_1         
	// 9443 17635:aload_1         
	// 9444 17636:getfield        #138 <Field int azh.bO>
	// 9445 17639:aload_0         
	// 9446 17640:getfield        #12  <Field azh a>
	// 9447 17643:getfield        #177 <Field int azh.aw>
	// 9448 17646:ixor            
	// 9449 17647:putfield        #177 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 9450 17650:aload_0         
	// 9451 17651:getfield        #12  <Field azh a>
	// 9452 17654:astore_1        
		abyte0.o = ((azh) (abyte0)).aw ^ a.o;
	// 9453 17655:aload_1         
	// 9454 17656:aload_1         
	// 9455 17657:getfield        #177 <Field int azh.aw>
	// 9456 17660:aload_0         
	// 9457 17661:getfield        #12  <Field azh a>
	// 9458 17664:getfield        #132 <Field int azh.o>
	// 9459 17667:ixor            
	// 9460 17668:putfield        #132 <Field int azh.o>
		abyte0 = ((byte []) (a));
	// 9461 17671:aload_0         
	// 9462 17672:getfield        #12  <Field azh a>
	// 9463 17675:astore_1        
		abyte0.aw = ((azh) (abyte0)).o | a.E;
	// 9464 17676:aload_1         
	// 9465 17677:aload_1         
	// 9466 17678:getfield        #132 <Field int azh.o>
	// 9467 17681:aload_0         
	// 9468 17682:getfield        #12  <Field azh a>
	// 9469 17685:getfield        #76  <Field int azh.E>
	// 9470 17688:ior             
	// 9471 17689:putfield        #177 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 9472 17692:aload_0         
	// 9473 17693:getfield        #12  <Field azh a>
	// 9474 17696:astore_1        
		abyte0.bO = ((azh) (abyte0)).b & ~a.o;
	// 9475 17697:aload_1         
	// 9476 17698:aload_1         
	// 9477 17699:getfield        #363 <Field int azh.b>
	// 9478 17702:aload_0         
	// 9479 17703:getfield        #12  <Field azh a>
	// 9480 17706:getfield        #132 <Field int azh.o>
	// 9481 17709:iconst_m1       
	// 9482 17710:ixor            
	// 9483 17711:iand            
	// 9484 17712:putfield        #138 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 9485 17715:aload_0         
	// 9486 17716:getfield        #12  <Field azh a>
	// 9487 17719:astore_1        
		abyte0.bZ = ((azh) (abyte0)).X | a.bZ;
	// 9488 17720:aload_1         
	// 9489 17721:aload_1         
	// 9490 17722:getfield        #468 <Field int azh.X>
	// 9491 17725:aload_0         
	// 9492 17726:getfield        #12  <Field azh a>
	// 9493 17729:getfield        #237 <Field int azh.bZ>
	// 9494 17732:ior             
	// 9495 17733:putfield        #237 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 9496 17736:aload_0         
	// 9497 17737:getfield        #12  <Field azh a>
	// 9498 17740:astore_1        
		abyte0.bZ = ((azh) (abyte0)).ch ^ a.bZ;
	// 9499 17741:aload_1         
	// 9500 17742:aload_1         
	// 9501 17743:getfield        #90  <Field int azh.ch>
	// 9502 17746:aload_0         
	// 9503 17747:getfield        #12  <Field azh a>
	// 9504 17750:getfield        #237 <Field int azh.bZ>
	// 9505 17753:ixor            
	// 9506 17754:putfield        #237 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 9507 17757:aload_0         
	// 9508 17758:getfield        #12  <Field azh a>
	// 9509 17761:astore_1        
		abyte0.bI = ((azh) (abyte0)).bZ ^ a.bI;
	// 9510 17762:aload_1         
	// 9511 17763:aload_1         
	// 9512 17764:getfield        #237 <Field int azh.bZ>
	// 9513 17767:aload_0         
	// 9514 17768:getfield        #12  <Field azh a>
	// 9515 17771:getfield        #225 <Field int azh.bI>
	// 9516 17774:ixor            
	// 9517 17775:putfield        #225 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 9518 17778:aload_0         
	// 9519 17779:getfield        #12  <Field azh a>
	// 9520 17782:astore_1        
		abyte0.a = ((azh) (abyte0)).bI ^ a.a;
	// 9521 17783:aload_1         
	// 9522 17784:aload_1         
	// 9523 17785:getfield        #225 <Field int azh.bI>
	// 9524 17788:aload_0         
	// 9525 17789:getfield        #12  <Field azh a>
	// 9526 17792:getfield        #78  <Field int azh.a>
	// 9527 17795:ixor            
	// 9528 17796:putfield        #78  <Field int azh.a>
		abyte0 = ((byte []) (a));
	// 9529 17799:aload_0         
	// 9530 17800:getfield        #12  <Field azh a>
	// 9531 17803:astore_1        
		abyte0.bI = ((azh) (abyte0)).G & ~a.a;
	// 9532 17804:aload_1         
	// 9533 17805:aload_1         
	// 9534 17806:getfield        #336 <Field int azh.G>
	// 9535 17809:aload_0         
	// 9536 17810:getfield        #12  <Field azh a>
	// 9537 17813:getfield        #78  <Field int azh.a>
	// 9538 17816:iconst_m1       
	// 9539 17817:ixor            
	// 9540 17818:iand            
	// 9541 17819:putfield        #225 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 9542 17822:aload_0         
	// 9543 17823:getfield        #12  <Field azh a>
	// 9544 17826:astore_1        
		abyte0.bI = ((azh) (abyte0)).i & ~a.bI;
	// 9545 17827:aload_1         
	// 9546 17828:aload_1         
	// 9547 17829:getfield        #435 <Field int azh.i>
	// 9548 17832:aload_0         
	// 9549 17833:getfield        #12  <Field azh a>
	// 9550 17836:getfield        #225 <Field int azh.bI>
	// 9551 17839:iconst_m1       
	// 9552 17840:ixor            
	// 9553 17841:iand            
	// 9554 17842:putfield        #225 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 9555 17845:aload_0         
	// 9556 17846:getfield        #12  <Field azh a>
	// 9557 17849:astore_1        
		abyte0.bZ = ((azh) (abyte0)).ac & ~a.a;
	// 9558 17850:aload_1         
	// 9559 17851:aload_1         
	// 9560 17852:getfield        #84  <Field int azh.ac>
	// 9561 17855:aload_0         
	// 9562 17856:getfield        #12  <Field azh a>
	// 9563 17859:getfield        #78  <Field int azh.a>
	// 9564 17862:iconst_m1       
	// 9565 17863:ixor            
	// 9566 17864:iand            
	// 9567 17865:putfield        #237 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 9568 17868:aload_0         
	// 9569 17869:getfield        #12  <Field azh a>
	// 9570 17872:astore_1        
		abyte0.ch = ((azh) (abyte0)).ac & ~a.a;
	// 9571 17873:aload_1         
	// 9572 17874:aload_1         
	// 9573 17875:getfield        #84  <Field int azh.ac>
	// 9574 17878:aload_0         
	// 9575 17879:getfield        #12  <Field azh a>
	// 9576 17882:getfield        #78  <Field int azh.a>
	// 9577 17885:iconst_m1       
	// 9578 17886:ixor            
	// 9579 17887:iand            
	// 9580 17888:putfield        #90  <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 9581 17891:aload_0         
	// 9582 17892:getfield        #12  <Field azh a>
	// 9583 17895:astore_1        
		abyte0.bc = ((azh) (abyte0)).ac & a.a;
	// 9584 17896:aload_1         
	// 9585 17897:aload_1         
	// 9586 17898:getfield        #84  <Field int azh.ac>
	// 9587 17901:aload_0         
	// 9588 17902:getfield        #12  <Field azh a>
	// 9589 17905:getfield        #78  <Field int azh.a>
	// 9590 17908:iand            
	// 9591 17909:putfield        #234 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 9592 17912:aload_0         
	// 9593 17913:getfield        #12  <Field azh a>
	// 9594 17916:astore_1        
		abyte0.aW = ((azh) (abyte0)).ac & a.a;
	// 9595 17917:aload_1         
	// 9596 17918:aload_1         
	// 9597 17919:getfield        #84  <Field int azh.ac>
	// 9598 17922:aload_0         
	// 9599 17923:getfield        #12  <Field azh a>
	// 9600 17926:getfield        #78  <Field int azh.a>
	// 9601 17929:iand            
	// 9602 17930:putfield        #222 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 9603 17933:aload_0         
	// 9604 17934:getfield        #12  <Field azh a>
	// 9605 17937:astore_1        
		abyte0.aW = ((azh) (abyte0)).E & ~a.aW;
	// 9606 17938:aload_1         
	// 9607 17939:aload_1         
	// 9608 17940:getfield        #76  <Field int azh.E>
	// 9609 17943:aload_0         
	// 9610 17944:getfield        #12  <Field azh a>
	// 9611 17947:getfield        #222 <Field int azh.aW>
	// 9612 17950:iconst_m1       
	// 9613 17951:ixor            
	// 9614 17952:iand            
	// 9615 17953:putfield        #222 <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 9616 17956:aload_0         
	// 9617 17957:getfield        #12  <Field azh a>
	// 9618 17960:astore_1        
		abyte0.ao = ((azh) (abyte0)).ac & ~a.a;
	// 9619 17961:aload_1         
	// 9620 17962:aload_1         
	// 9621 17963:getfield        #84  <Field int azh.ac>
	// 9622 17966:aload_0         
	// 9623 17967:getfield        #12  <Field azh a>
	// 9624 17970:getfield        #78  <Field int azh.a>
	// 9625 17973:iconst_m1       
	// 9626 17974:ixor            
	// 9627 17975:iand            
	// 9628 17976:putfield        #141 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 9629 17979:aload_0         
	// 9630 17980:getfield        #12  <Field azh a>
	// 9631 17983:astore_1        
		abyte0.av = ((azh) (abyte0)).a & a.av;
	// 9632 17984:aload_1         
	// 9633 17985:aload_1         
	// 9634 17986:getfield        #78  <Field int azh.a>
	// 9635 17989:aload_0         
	// 9636 17990:getfield        #12  <Field azh a>
	// 9637 17993:getfield        #267 <Field int azh.av>
	// 9638 17996:iand            
	// 9639 17997:putfield        #267 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 9640 18000:aload_0         
	// 9641 18001:getfield        #12  <Field azh a>
	// 9642 18004:astore_1        
		abyte0.bY = ((azh) (abyte0)).bY & ~a.a;
	// 9643 18005:aload_1         
	// 9644 18006:aload_1         
	// 9645 18007:getfield        #441 <Field int azh.bY>
	// 9646 18010:aload_0         
	// 9647 18011:getfield        #12  <Field azh a>
	// 9648 18014:getfield        #78  <Field int azh.a>
	// 9649 18017:iconst_m1       
	// 9650 18018:ixor            
	// 9651 18019:iand            
	// 9652 18020:putfield        #441 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 9653 18023:aload_0         
	// 9654 18024:getfield        #12  <Field azh a>
	// 9655 18027:astore_1        
		abyte0.bx = ((azh) (abyte0)).ac & ~a.a;
	// 9656 18028:aload_1         
	// 9657 18029:aload_1         
	// 9658 18030:getfield        #84  <Field int azh.ac>
	// 9659 18033:aload_0         
	// 9660 18034:getfield        #12  <Field azh a>
	// 9661 18037:getfield        #78  <Field int azh.a>
	// 9662 18040:iconst_m1       
	// 9663 18041:ixor            
	// 9664 18042:iand            
	// 9665 18043:putfield        #243 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 9666 18046:aload_0         
	// 9667 18047:getfield        #12  <Field azh a>
	// 9668 18050:astore_1        
		abyte0.bx = ((azh) (abyte0)).bx & a.E;
	// 9669 18051:aload_1         
	// 9670 18052:aload_1         
	// 9671 18053:getfield        #243 <Field int azh.bx>
	// 9672 18056:aload_0         
	// 9673 18057:getfield        #12  <Field azh a>
	// 9674 18060:getfield        #76  <Field int azh.E>
	// 9675 18063:iand            
	// 9676 18064:putfield        #243 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 9677 18067:aload_0         
	// 9678 18068:getfield        #12  <Field azh a>
	// 9679 18071:astore_1        
		abyte0.aV = ((azh) (abyte0)).ac & ~a.a;
	// 9680 18072:aload_1         
	// 9681 18073:aload_1         
	// 9682 18074:getfield        #84  <Field int azh.ac>
	// 9683 18077:aload_0         
	// 9684 18078:getfield        #12  <Field azh a>
	// 9685 18081:getfield        #78  <Field int azh.a>
	// 9686 18084:iconst_m1       
	// 9687 18085:ixor            
	// 9688 18086:iand            
	// 9689 18087:putfield        #126 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 9690 18090:aload_0         
	// 9691 18091:getfield        #12  <Field azh a>
	// 9692 18094:astore_1        
		abyte0.n = ((azh) (abyte0)).n & ~a.X;
	// 9693 18095:aload_1         
	// 9694 18096:aload_1         
	// 9695 18097:getfield        #210 <Field int azh.n>
	// 9696 18100:aload_0         
	// 9697 18101:getfield        #12  <Field azh a>
	// 9698 18104:getfield        #468 <Field int azh.X>
	// 9699 18107:iconst_m1       
	// 9700 18108:ixor            
	// 9701 18109:iand            
	// 9702 18110:putfield        #210 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 9703 18113:aload_0         
	// 9704 18114:getfield        #12  <Field azh a>
	// 9705 18117:astore_1        
		abyte0.n = ((azh) (abyte0)).bX ^ a.n;
	// 9706 18118:aload_1         
	// 9707 18119:aload_1         
	// 9708 18120:getfield        #120 <Field int azh.bX>
	// 9709 18123:aload_0         
	// 9710 18124:getfield        #12  <Field azh a>
	// 9711 18127:getfield        #210 <Field int azh.n>
	// 9712 18130:ixor            
	// 9713 18131:putfield        #210 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 9714 18134:aload_0         
	// 9715 18135:getfield        #12  <Field azh a>
	// 9716 18138:astore_1        
		abyte0.n = ((azh) (abyte0)).bE | a.n;
	// 9717 18139:aload_1         
	// 9718 18140:aload_1         
	// 9719 18141:getfield        #162 <Field int azh.bE>
	// 9720 18144:aload_0         
	// 9721 18145:getfield        #12  <Field azh a>
	// 9722 18148:getfield        #210 <Field int azh.n>
	// 9723 18151:ior             
	// 9724 18152:putfield        #210 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 9725 18155:aload_0         
	// 9726 18156:getfield        #12  <Field azh a>
	// 9727 18159:astore_1        
		abyte0.n = ((azh) (abyte0)).au ^ a.n;
	// 9728 18160:aload_1         
	// 9729 18161:aload_1         
	// 9730 18162:getfield        #228 <Field int azh.au>
	// 9731 18165:aload_0         
	// 9732 18166:getfield        #12  <Field azh a>
	// 9733 18169:getfield        #210 <Field int azh.n>
	// 9734 18172:ixor            
	// 9735 18173:putfield        #210 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 9736 18176:aload_0         
	// 9737 18177:getfield        #12  <Field azh a>
	// 9738 18180:astore_1        
		abyte0.K = ((azh) (abyte0)).n ^ a.K;
	// 9739 18181:aload_1         
	// 9740 18182:aload_1         
	// 9741 18183:getfield        #210 <Field int azh.n>
	// 9742 18186:aload_0         
	// 9743 18187:getfield        #12  <Field azh a>
	// 9744 18190:getfield        #384 <Field int azh.K>
	// 9745 18193:ixor            
	// 9746 18194:putfield        #384 <Field int azh.K>
		abyte0 = ((byte []) (a));
	// 9747 18197:aload_0         
	// 9748 18198:getfield        #12  <Field azh a>
	// 9749 18201:astore_1        
		abyte0.bV = ((azh) (abyte0)).bV & ~a.X;
	// 9750 18202:aload_1         
	// 9751 18203:aload_1         
	// 9752 18204:getfield        #174 <Field int azh.bV>
	// 9753 18207:aload_0         
	// 9754 18208:getfield        #12  <Field azh a>
	// 9755 18211:getfield        #468 <Field int azh.X>
	// 9756 18214:iconst_m1       
	// 9757 18215:ixor            
	// 9758 18216:iand            
	// 9759 18217:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 9760 18220:aload_0         
	// 9761 18221:getfield        #12  <Field azh a>
	// 9762 18224:astore_1        
		abyte0.bV = ((azh) (abyte0)).bw ^ a.bV;
	// 9763 18225:aload_1         
	// 9764 18226:aload_1         
	// 9765 18227:getfield        #195 <Field int azh.bw>
	// 9766 18230:aload_0         
	// 9767 18231:getfield        #12  <Field azh a>
	// 9768 18234:getfield        #174 <Field int azh.bV>
	// 9769 18237:ixor            
	// 9770 18238:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 9771 18241:aload_0         
	// 9772 18242:getfield        #12  <Field azh a>
	// 9773 18245:astore_1        
		abyte0.bU = ((azh) (abyte0)).bV ^ a.bU;
	// 9774 18246:aload_1         
	// 9775 18247:aload_1         
	// 9776 18248:getfield        #174 <Field int azh.bV>
	// 9777 18251:aload_0         
	// 9778 18252:getfield        #12  <Field azh a>
	// 9779 18255:getfield        #231 <Field int azh.bU>
	// 9780 18258:ixor            
	// 9781 18259:putfield        #231 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 9782 18262:aload_0         
	// 9783 18263:getfield        #12  <Field azh a>
	// 9784 18266:astore_1        
		abyte0.bb = ((azh) (abyte0)).bU ^ a.bb;
	// 9785 18267:aload_1         
	// 9786 18268:aload_1         
	// 9787 18269:getfield        #231 <Field int azh.bU>
	// 9788 18272:aload_0         
	// 9789 18273:getfield        #12  <Field azh a>
	// 9790 18276:getfield        #34  <Field int azh.bb>
	// 9791 18279:ixor            
	// 9792 18280:putfield        #34  <Field int azh.bb>
		abyte0 = ((byte []) (a));
	// 9793 18283:aload_0         
	// 9794 18284:getfield        #12  <Field azh a>
	// 9795 18287:astore_1        
		abyte0.bU = ((azh) (abyte0)).bb & a.ce;
	// 9796 18288:aload_1         
	// 9797 18289:aload_1         
	// 9798 18290:getfield        #34  <Field int azh.bb>
	// 9799 18293:aload_0         
	// 9800 18294:getfield        #12  <Field azh a>
	// 9801 18297:getfield        #87  <Field int azh.ce>
	// 9802 18300:iand            
	// 9803 18301:putfield        #231 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 9804 18304:aload_0         
	// 9805 18305:getfield        #12  <Field azh a>
	// 9806 18308:astore_1        
		abyte0.bU = ((azh) (abyte0)).bU & ~a.c;
	// 9807 18309:aload_1         
	// 9808 18310:aload_1         
	// 9809 18311:getfield        #231 <Field int azh.bU>
	// 9810 18314:aload_0         
	// 9811 18315:getfield        #12  <Field azh a>
	// 9812 18318:getfield        #46  <Field int azh.c>
	// 9813 18321:iconst_m1       
	// 9814 18322:ixor            
	// 9815 18323:iand            
	// 9816 18324:putfield        #231 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 9817 18327:aload_0         
	// 9818 18328:getfield        #12  <Field azh a>
	// 9819 18331:astore_1        
		abyte0.bV = ((azh) (abyte0)).ce ^ a.bb;
	// 9820 18332:aload_1         
	// 9821 18333:aload_1         
	// 9822 18334:getfield        #87  <Field int azh.ce>
	// 9823 18337:aload_0         
	// 9824 18338:getfield        #12  <Field azh a>
	// 9825 18341:getfield        #34  <Field int azh.bb>
	// 9826 18344:ixor            
	// 9827 18345:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 9828 18348:aload_0         
	// 9829 18349:getfield        #12  <Field azh a>
	// 9830 18352:astore_1        
		abyte0.bV = ((azh) (abyte0)).c | a.bV;
	// 9831 18353:aload_1         
	// 9832 18354:aload_1         
	// 9833 18355:getfield        #46  <Field int azh.c>
	// 9834 18358:aload_0         
	// 9835 18359:getfield        #12  <Field azh a>
	// 9836 18362:getfield        #174 <Field int azh.bV>
	// 9837 18365:ior             
	// 9838 18366:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 9839 18369:aload_0         
	// 9840 18370:getfield        #12  <Field azh a>
	// 9841 18373:astore_1        
		abyte0.bw = ((azh) (abyte0)).bb & a.I;
	// 9842 18374:aload_1         
	// 9843 18375:aload_1         
	// 9844 18376:getfield        #34  <Field int azh.bb>
	// 9845 18379:aload_0         
	// 9846 18380:getfield        #12  <Field azh a>
	// 9847 18383:getfield        #28  <Field int azh.I>
	// 9848 18386:iand            
	// 9849 18387:putfield        #195 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 9850 18390:aload_0         
	// 9851 18391:getfield        #12  <Field azh a>
	// 9852 18394:astore_1        
		abyte0.bw = ((azh) (abyte0)).H ^ a.bw;
	// 9853 18395:aload_1         
	// 9854 18396:aload_1         
	// 9855 18397:getfield        #201 <Field int azh.H>
	// 9856 18400:aload_0         
	// 9857 18401:getfield        #12  <Field azh a>
	// 9858 18404:getfield        #195 <Field int azh.bw>
	// 9859 18407:ixor            
	// 9860 18408:putfield        #195 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 9861 18411:aload_0         
	// 9862 18412:getfield        #12  <Field azh a>
	// 9863 18415:astore_1        
		abyte0.H = ((azh) (abyte0)).bw & ~a.c;
	// 9864 18416:aload_1         
	// 9865 18417:aload_1         
	// 9866 18418:getfield        #195 <Field int azh.bw>
	// 9867 18421:aload_0         
	// 9868 18422:getfield        #12  <Field azh a>
	// 9869 18425:getfield        #46  <Field int azh.c>
	// 9870 18428:iconst_m1       
	// 9871 18429:ixor            
	// 9872 18430:iand            
	// 9873 18431:putfield        #201 <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 9874 18434:aload_0         
	// 9875 18435:getfield        #12  <Field azh a>
	// 9876 18438:astore_1        
		abyte0.n = ((azh) (abyte0)).bb & a.bk;
	// 9877 18439:aload_1         
	// 9878 18440:aload_1         
	// 9879 18441:getfield        #34  <Field int azh.bb>
	// 9880 18444:aload_0         
	// 9881 18445:getfield        #12  <Field azh a>
	// 9882 18448:getfield        #49  <Field int azh.bk>
	// 9883 18451:iand            
	// 9884 18452:putfield        #210 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 9885 18455:aload_0         
	// 9886 18456:getfield        #12  <Field azh a>
	// 9887 18459:astore_1        
		abyte0.n = ((azh) (abyte0)).c | a.n;
	// 9888 18460:aload_1         
	// 9889 18461:aload_1         
	// 9890 18462:getfield        #46  <Field int azh.c>
	// 9891 18465:aload_0         
	// 9892 18466:getfield        #12  <Field azh a>
	// 9893 18469:getfield        #210 <Field int azh.n>
	// 9894 18472:ior             
	// 9895 18473:putfield        #210 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 9896 18476:aload_0         
	// 9897 18477:getfield        #12  <Field azh a>
	// 9898 18480:astore_1        
		abyte0.au = ((azh) (abyte0)).bb & ~a.aO;
	// 9899 18481:aload_1         
	// 9900 18482:aload_1         
	// 9901 18483:getfield        #34  <Field int azh.bb>
	// 9902 18486:aload_0         
	// 9903 18487:getfield        #12  <Field azh a>
	// 9904 18490:getfield        #255 <Field int azh.aO>
	// 9905 18493:iconst_m1       
	// 9906 18494:ixor            
	// 9907 18495:iand            
	// 9908 18496:putfield        #228 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 9909 18499:aload_0         
	// 9910 18500:getfield        #12  <Field azh a>
	// 9911 18503:astore_1        
		abyte0.au = ((azh) (abyte0)).aI ^ a.au;
	// 9912 18504:aload_1         
	// 9913 18505:aload_1         
	// 9914 18506:getfield        #189 <Field int azh.aI>
	// 9915 18509:aload_0         
	// 9916 18510:getfield        #12  <Field azh a>
	// 9917 18513:getfield        #228 <Field int azh.au>
	// 9918 18516:ixor            
	// 9919 18517:putfield        #228 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 9920 18520:aload_0         
	// 9921 18521:getfield        #12  <Field azh a>
	// 9922 18524:astore_1        
		abyte0.bi = ((azh) (abyte0)).au ^ a.bi;
	// 9923 18525:aload_1         
	// 9924 18526:aload_1         
	// 9925 18527:getfield        #228 <Field int azh.au>
	// 9926 18530:aload_0         
	// 9927 18531:getfield        #12  <Field azh a>
	// 9928 18534:getfield        #393 <Field int azh.bi>
	// 9929 18537:ixor            
	// 9930 18538:putfield        #393 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 9931 18541:aload_0         
	// 9932 18542:getfield        #12  <Field azh a>
	// 9933 18545:astore_1        
		abyte0.bi = ((azh) (abyte0)).bi & ~a.k;
	// 9934 18546:aload_1         
	// 9935 18547:aload_1         
	// 9936 18548:getfield        #393 <Field int azh.bi>
	// 9937 18551:aload_0         
	// 9938 18552:getfield        #12  <Field azh a>
	// 9939 18555:getfield        #61  <Field int azh.k>
	// 9940 18558:iconst_m1       
	// 9941 18559:ixor            
	// 9942 18560:iand            
	// 9943 18561:putfield        #393 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 9944 18564:aload_0         
	// 9945 18565:getfield        #12  <Field azh a>
	// 9946 18568:astore_1        
		abyte0.bi = ((azh) (abyte0)).bU ^ a.bi;
	// 9947 18569:aload_1         
	// 9948 18570:aload_1         
	// 9949 18571:getfield        #231 <Field int azh.bU>
	// 9950 18574:aload_0         
	// 9951 18575:getfield        #12  <Field azh a>
	// 9952 18578:getfield        #393 <Field int azh.bi>
	// 9953 18581:ixor            
	// 9954 18582:putfield        #393 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 9955 18585:aload_0         
	// 9956 18586:getfield        #12  <Field azh a>
	// 9957 18589:astore_1        
		abyte0.bU = ((azh) (abyte0)).bb & ~a.I;
	// 9958 18590:aload_1         
	// 9959 18591:aload_1         
	// 9960 18592:getfield        #34  <Field int azh.bb>
	// 9961 18595:aload_0         
	// 9962 18596:getfield        #12  <Field azh a>
	// 9963 18599:getfield        #28  <Field int azh.I>
	// 9964 18602:iconst_m1       
	// 9965 18603:ixor            
	// 9966 18604:iand            
	// 9967 18605:putfield        #231 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 9968 18608:aload_0         
	// 9969 18609:getfield        #12  <Field azh a>
	// 9970 18612:astore_1        
		abyte0.bU = ((azh) (abyte0)).aI ^ a.bU;
	// 9971 18613:aload_1         
	// 9972 18614:aload_1         
	// 9973 18615:getfield        #189 <Field int azh.aI>
	// 9974 18618:aload_0         
	// 9975 18619:getfield        #12  <Field azh a>
	// 9976 18622:getfield        #231 <Field int azh.bU>
	// 9977 18625:ixor            
	// 9978 18626:putfield        #231 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 9979 18629:aload_0         
	// 9980 18630:getfield        #12  <Field azh a>
	// 9981 18633:astore_1        
		abyte0.n = ((azh) (abyte0)).bU ^ a.n;
	// 9982 18634:aload_1         
	// 9983 18635:aload_1         
	// 9984 18636:getfield        #231 <Field int azh.bU>
	// 9985 18639:aload_0         
	// 9986 18640:getfield        #12  <Field azh a>
	// 9987 18643:getfield        #210 <Field int azh.n>
	// 9988 18646:ixor            
	// 9989 18647:putfield        #210 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 9990 18650:aload_0         
	// 9991 18651:getfield        #12  <Field azh a>
	// 9992 18654:astore_1        
		abyte0.bU = ((azh) (abyte0)).bb & a.I;
	// 9993 18655:aload_1         
	// 9994 18656:aload_1         
	// 9995 18657:getfield        #34  <Field int azh.bb>
	// 9996 18660:aload_0         
	// 9997 18661:getfield        #12  <Field azh a>
	// 9998 18664:getfield        #28  <Field int azh.I>
	// 9999 18667:iand            
	// 10000 18668:putfield        #231 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 10001 18671:aload_0         
	// 10002 18672:getfield        #12  <Field azh a>
	// 10003 18675:astore_1        
		abyte0.bU = ((azh) (abyte0)).I ^ a.bU;
	// 10004 18676:aload_1         
	// 10005 18677:aload_1         
	// 10006 18678:getfield        #28  <Field int azh.I>
	// 10007 18681:aload_0         
	// 10008 18682:getfield        #12  <Field azh a>
	// 10009 18685:getfield        #231 <Field int azh.bU>
	// 10010 18688:ixor            
	// 10011 18689:putfield        #231 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 10012 18692:aload_0         
	// 10013 18693:getfield        #12  <Field azh a>
	// 10014 18696:astore_1        
		abyte0.bU = ((azh) (abyte0)).c | a.bU;
	// 10015 18697:aload_1         
	// 10016 18698:aload_1         
	// 10017 18699:getfield        #46  <Field int azh.c>
	// 10018 18702:aload_0         
	// 10019 18703:getfield        #12  <Field azh a>
	// 10020 18706:getfield        #231 <Field int azh.bU>
	// 10021 18709:ior             
	// 10022 18710:putfield        #231 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 10023 18713:aload_0         
	// 10024 18714:getfield        #12  <Field azh a>
	// 10025 18717:astore_1        
		abyte0.cg = ((azh) (abyte0)).bb & a.cg;
	// 10026 18718:aload_1         
	// 10027 18719:aload_1         
	// 10028 18720:getfield        #34  <Field int azh.bb>
	// 10029 18723:aload_0         
	// 10030 18724:getfield        #12  <Field azh a>
	// 10031 18727:getfield        #114 <Field int azh.cg>
	// 10032 18730:iand            
	// 10033 18731:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 10034 18734:aload_0         
	// 10035 18735:getfield        #12  <Field azh a>
	// 10036 18738:astore_1        
		abyte0.bV = ((azh) (abyte0)).cg ^ a.bV;
	// 10037 18739:aload_1         
	// 10038 18740:aload_1         
	// 10039 18741:getfield        #114 <Field int azh.cg>
	// 10040 18744:aload_0         
	// 10041 18745:getfield        #12  <Field azh a>
	// 10042 18748:getfield        #174 <Field int azh.bV>
	// 10043 18751:ixor            
	// 10044 18752:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 10045 18755:aload_0         
	// 10046 18756:getfield        #12  <Field azh a>
	// 10047 18759:astore_1        
		abyte0.bV = ((azh) (abyte0)).bV | a.k;
	// 10048 18760:aload_1         
	// 10049 18761:aload_1         
	// 10050 18762:getfield        #174 <Field int azh.bV>
	// 10051 18765:aload_0         
	// 10052 18766:getfield        #12  <Field azh a>
	// 10053 18769:getfield        #61  <Field int azh.k>
	// 10054 18772:ior             
	// 10055 18773:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 10056 18776:aload_0         
	// 10057 18777:getfield        #12  <Field azh a>
	// 10058 18780:astore_1        
		abyte0.cg = ((azh) (abyte0)).bb & a.I;
	// 10059 18781:aload_1         
	// 10060 18782:aload_1         
	// 10061 18783:getfield        #34  <Field int azh.bb>
	// 10062 18786:aload_0         
	// 10063 18787:getfield        #12  <Field azh a>
	// 10064 18790:getfield        #28  <Field int azh.I>
	// 10065 18793:iand            
	// 10066 18794:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 10067 18797:aload_0         
	// 10068 18798:getfield        #12  <Field azh a>
	// 10069 18801:astore_1        
		abyte0.cg = ((azh) (abyte0)).ce ^ a.cg;
	// 10070 18802:aload_1         
	// 10071 18803:aload_1         
	// 10072 18804:getfield        #87  <Field int azh.ce>
	// 10073 18807:aload_0         
	// 10074 18808:getfield        #12  <Field azh a>
	// 10075 18811:getfield        #114 <Field int azh.cg>
	// 10076 18814:ixor            
	// 10077 18815:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 10078 18818:aload_0         
	// 10079 18819:getfield        #12  <Field azh a>
	// 10080 18822:astore_1        
		abyte0.cg = ((azh) (abyte0)).cg & ~a.c;
	// 10081 18823:aload_1         
	// 10082 18824:aload_1         
	// 10083 18825:getfield        #114 <Field int azh.cg>
	// 10084 18828:aload_0         
	// 10085 18829:getfield        #12  <Field azh a>
	// 10086 18832:getfield        #46  <Field int azh.c>
	// 10087 18835:iconst_m1       
	// 10088 18836:ixor            
	// 10089 18837:iand            
	// 10090 18838:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 10091 18841:aload_0         
	// 10092 18842:getfield        #12  <Field azh a>
	// 10093 18845:astore_1        
		abyte0.cg = ((azh) (abyte0)).bw ^ a.cg;
	// 10094 18846:aload_1         
	// 10095 18847:aload_1         
	// 10096 18848:getfield        #195 <Field int azh.bw>
	// 10097 18851:aload_0         
	// 10098 18852:getfield        #12  <Field azh a>
	// 10099 18855:getfield        #114 <Field int azh.cg>
	// 10100 18858:ixor            
	// 10101 18859:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 10102 18862:aload_0         
	// 10103 18863:getfield        #12  <Field azh a>
	// 10104 18866:astore_1        
		abyte0.cg = ((azh) (abyte0)).cg & ~a.k;
	// 10105 18867:aload_1         
	// 10106 18868:aload_1         
	// 10107 18869:getfield        #114 <Field int azh.cg>
	// 10108 18872:aload_0         
	// 10109 18873:getfield        #12  <Field azh a>
	// 10110 18876:getfield        #61  <Field int azh.k>
	// 10111 18879:iconst_m1       
	// 10112 18880:ixor            
	// 10113 18881:iand            
	// 10114 18882:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 10115 18885:aload_0         
	// 10116 18886:getfield        #12  <Field azh a>
	// 10117 18889:astore_1        
		abyte0.cg = ((azh) (abyte0)).n ^ a.cg;
	// 10118 18890:aload_1         
	// 10119 18891:aload_1         
	// 10120 18892:getfield        #210 <Field int azh.n>
	// 10121 18895:aload_0         
	// 10122 18896:getfield        #12  <Field azh a>
	// 10123 18899:getfield        #114 <Field int azh.cg>
	// 10124 18902:ixor            
	// 10125 18903:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 10126 18906:aload_0         
	// 10127 18907:getfield        #12  <Field azh a>
	// 10128 18910:astore_1        
		abyte0.n = ((azh) (abyte0)).c | a.bb;
	// 10129 18911:aload_1         
	// 10130 18912:aload_1         
	// 10131 18913:getfield        #46  <Field int azh.c>
	// 10132 18916:aload_0         
	// 10133 18917:getfield        #12  <Field azh a>
	// 10134 18920:getfield        #34  <Field int azh.bb>
	// 10135 18923:ior             
	// 10136 18924:putfield        #210 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10137 18927:aload_0         
	// 10138 18928:getfield        #12  <Field azh a>
	// 10139 18931:astore_1        
		abyte0.n = ((azh) (abyte0)).k & a.n;
	// 10140 18932:aload_1         
	// 10141 18933:aload_1         
	// 10142 18934:getfield        #61  <Field int azh.k>
	// 10143 18937:aload_0         
	// 10144 18938:getfield        #12  <Field azh a>
	// 10145 18941:getfield        #210 <Field int azh.n>
	// 10146 18944:iand            
	// 10147 18945:putfield        #210 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10148 18948:aload_0         
	// 10149 18949:getfield        #12  <Field azh a>
	// 10150 18952:astore_1        
		abyte0.bw = ((azh) (abyte0)).bb & ~a.aI;
	// 10151 18953:aload_1         
	// 10152 18954:aload_1         
	// 10153 18955:getfield        #34  <Field int azh.bb>
	// 10154 18958:aload_0         
	// 10155 18959:getfield        #12  <Field azh a>
	// 10156 18962:getfield        #189 <Field int azh.aI>
	// 10157 18965:iconst_m1       
	// 10158 18966:ixor            
	// 10159 18967:iand            
	// 10160 18968:putfield        #195 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 10161 18971:aload_0         
	// 10162 18972:getfield        #12  <Field azh a>
	// 10163 18975:astore_1        
		abyte0.bw = ((azh) (abyte0)).I ^ a.bw;
	// 10164 18976:aload_1         
	// 10165 18977:aload_1         
	// 10166 18978:getfield        #28  <Field int azh.I>
	// 10167 18981:aload_0         
	// 10168 18982:getfield        #12  <Field azh a>
	// 10169 18985:getfield        #195 <Field int azh.bw>
	// 10170 18988:ixor            
	// 10171 18989:putfield        #195 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 10172 18992:aload_0         
	// 10173 18993:getfield        #12  <Field azh a>
	// 10174 18996:astore_1        
		abyte0.bX = ((azh) (abyte0)).c | a.bw;
	// 10175 18997:aload_1         
	// 10176 18998:aload_1         
	// 10177 18999:getfield        #46  <Field int azh.c>
	// 10178 19002:aload_0         
	// 10179 19003:getfield        #12  <Field azh a>
	// 10180 19006:getfield        #195 <Field int azh.bw>
	// 10181 19009:ior             
	// 10182 19010:putfield        #120 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 10183 19013:aload_0         
	// 10184 19014:getfield        #12  <Field azh a>
	// 10185 19017:astore_1        
		abyte0.aC = ((azh) (abyte0)).bb & ~a.I;
	// 10186 19018:aload_1         
	// 10187 19019:aload_1         
	// 10188 19020:getfield        #34  <Field int azh.bb>
	// 10189 19023:aload_0         
	// 10190 19024:getfield        #12  <Field azh a>
	// 10191 19027:getfield        #28  <Field int azh.I>
	// 10192 19030:iconst_m1       
	// 10193 19031:ixor            
	// 10194 19032:iand            
	// 10195 19033:putfield        #369 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 10196 19036:aload_0         
	// 10197 19037:getfield        #12  <Field azh a>
	// 10198 19040:astore_1        
		abyte0.aC = ((azh) (abyte0)).c | a.aC;
	// 10199 19041:aload_1         
	// 10200 19042:aload_1         
	// 10201 19043:getfield        #46  <Field int azh.c>
	// 10202 19046:aload_0         
	// 10203 19047:getfield        #12  <Field azh a>
	// 10204 19050:getfield        #369 <Field int azh.aC>
	// 10205 19053:ior             
	// 10206 19054:putfield        #369 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 10207 19057:aload_0         
	// 10208 19058:getfield        #12  <Field azh a>
	// 10209 19061:astore_1        
		abyte0.aC = ((azh) (abyte0)).bw ^ a.aC;
	// 10210 19062:aload_1         
	// 10211 19063:aload_1         
	// 10212 19064:getfield        #195 <Field int azh.bw>
	// 10213 19067:aload_0         
	// 10214 19068:getfield        #12  <Field azh a>
	// 10215 19071:getfield        #369 <Field int azh.aC>
	// 10216 19074:ixor            
	// 10217 19075:putfield        #369 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 10218 19078:aload_0         
	// 10219 19079:getfield        #12  <Field azh a>
	// 10220 19082:astore_1        
		abyte0.aO = ((azh) (abyte0)).bb & ~a.aO;
	// 10221 19083:aload_1         
	// 10222 19084:aload_1         
	// 10223 19085:getfield        #34  <Field int azh.bb>
	// 10224 19088:aload_0         
	// 10225 19089:getfield        #12  <Field azh a>
	// 10226 19092:getfield        #255 <Field int azh.aO>
	// 10227 19095:iconst_m1       
	// 10228 19096:ixor            
	// 10229 19097:iand            
	// 10230 19098:putfield        #255 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 10231 19101:aload_0         
	// 10232 19102:getfield        #12  <Field azh a>
	// 10233 19105:astore_1        
		abyte0.aO = ((azh) (abyte0)).ce ^ a.aO;
	// 10234 19106:aload_1         
	// 10235 19107:aload_1         
	// 10236 19108:getfield        #87  <Field int azh.ce>
	// 10237 19111:aload_0         
	// 10238 19112:getfield        #12  <Field azh a>
	// 10239 19115:getfield        #255 <Field int azh.aO>
	// 10240 19118:ixor            
	// 10241 19119:putfield        #255 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 10242 19122:aload_0         
	// 10243 19123:getfield        #12  <Field azh a>
	// 10244 19126:astore_1        
		abyte0.bw = ((azh) (abyte0)).bb & a.ce;
	// 10245 19127:aload_1         
	// 10246 19128:aload_1         
	// 10247 19129:getfield        #34  <Field int azh.bb>
	// 10248 19132:aload_0         
	// 10249 19133:getfield        #12  <Field azh a>
	// 10250 19136:getfield        #87  <Field int azh.ce>
	// 10251 19139:iand            
	// 10252 19140:putfield        #195 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 10253 19143:aload_0         
	// 10254 19144:getfield        #12  <Field azh a>
	// 10255 19147:astore_1        
		abyte0.bw = ((azh) (abyte0)).A ^ a.bw;
	// 10256 19148:aload_1         
	// 10257 19149:aload_1         
	// 10258 19150:getfield        #423 <Field int azh.A>
	// 10259 19153:aload_0         
	// 10260 19154:getfield        #12  <Field azh a>
	// 10261 19157:getfield        #195 <Field int azh.bw>
	// 10262 19160:ixor            
	// 10263 19161:putfield        #195 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 10264 19164:aload_0         
	// 10265 19165:getfield        #12  <Field azh a>
	// 10266 19168:astore_1        
		abyte0.bw = ((azh) (abyte0)).c | a.bw;
	// 10267 19169:aload_1         
	// 10268 19170:aload_1         
	// 10269 19171:getfield        #46  <Field int azh.c>
	// 10270 19174:aload_0         
	// 10271 19175:getfield        #12  <Field azh a>
	// 10272 19178:getfield        #195 <Field int azh.bw>
	// 10273 19181:ior             
	// 10274 19182:putfield        #195 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 10275 19185:aload_0         
	// 10276 19186:getfield        #12  <Field azh a>
	// 10277 19189:astore_1        
		abyte0.bw = ((azh) (abyte0)).au ^ a.bw;
	// 10278 19190:aload_1         
	// 10279 19191:aload_1         
	// 10280 19192:getfield        #228 <Field int azh.au>
	// 10281 19195:aload_0         
	// 10282 19196:getfield        #12  <Field azh a>
	// 10283 19199:getfield        #195 <Field int azh.bw>
	// 10284 19202:ixor            
	// 10285 19203:putfield        #195 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 10286 19206:aload_0         
	// 10287 19207:getfield        #12  <Field azh a>
	// 10288 19210:astore_1        
		abyte0.aX = ((azh) (abyte0)).bw ^ a.aX;
	// 10289 19211:aload_1         
	// 10290 19212:aload_1         
	// 10291 19213:getfield        #195 <Field int azh.bw>
	// 10292 19216:aload_0         
	// 10293 19217:getfield        #12  <Field azh a>
	// 10294 19220:getfield        #381 <Field int azh.aX>
	// 10295 19223:ixor            
	// 10296 19224:putfield        #381 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 10297 19227:aload_0         
	// 10298 19228:getfield        #12  <Field azh a>
	// 10299 19231:astore_1        
		abyte0.bw = ((azh) (abyte0)).bb & ~a.A;
	// 10300 19232:aload_1         
	// 10301 19233:aload_1         
	// 10302 19234:getfield        #34  <Field int azh.bb>
	// 10303 19237:aload_0         
	// 10304 19238:getfield        #12  <Field azh a>
	// 10305 19241:getfield        #423 <Field int azh.A>
	// 10306 19244:iconst_m1       
	// 10307 19245:ixor            
	// 10308 19246:iand            
	// 10309 19247:putfield        #195 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 10310 19250:aload_0         
	// 10311 19251:getfield        #12  <Field azh a>
	// 10312 19254:astore_1        
		abyte0.bw = ((azh) (abyte0)).aI ^ a.bw;
	// 10313 19255:aload_1         
	// 10314 19256:aload_1         
	// 10315 19257:getfield        #189 <Field int azh.aI>
	// 10316 19260:aload_0         
	// 10317 19261:getfield        #12  <Field azh a>
	// 10318 19264:getfield        #195 <Field int azh.bw>
	// 10319 19267:ixor            
	// 10320 19268:putfield        #195 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 10321 19271:aload_0         
	// 10322 19272:getfield        #12  <Field azh a>
	// 10323 19275:astore_1        
		abyte0.bU = ((azh) (abyte0)).bw ^ a.bU;
	// 10324 19276:aload_1         
	// 10325 19277:aload_1         
	// 10326 19278:getfield        #195 <Field int azh.bw>
	// 10327 19281:aload_0         
	// 10328 19282:getfield        #12  <Field azh a>
	// 10329 19285:getfield        #231 <Field int azh.bU>
	// 10330 19288:ixor            
	// 10331 19289:putfield        #231 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 10332 19292:aload_0         
	// 10333 19293:getfield        #12  <Field azh a>
	// 10334 19296:astore_1        
		abyte0.n = ((azh) (abyte0)).bU ^ a.n;
	// 10335 19297:aload_1         
	// 10336 19298:aload_1         
	// 10337 19299:getfield        #231 <Field int azh.bU>
	// 10338 19302:aload_0         
	// 10339 19303:getfield        #12  <Field azh a>
	// 10340 19306:getfield        #210 <Field int azh.n>
	// 10341 19309:ixor            
	// 10342 19310:putfield        #210 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10343 19313:aload_0         
	// 10344 19314:getfield        #12  <Field azh a>
	// 10345 19317:astore_1        
		abyte0.bU = ((azh) (abyte0)).k | a.bU;
	// 10346 19318:aload_1         
	// 10347 19319:aload_1         
	// 10348 19320:getfield        #61  <Field int azh.k>
	// 10349 19323:aload_0         
	// 10350 19324:getfield        #12  <Field azh a>
	// 10351 19327:getfield        #231 <Field int azh.bU>
	// 10352 19330:ior             
	// 10353 19331:putfield        #231 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 10354 19334:aload_0         
	// 10355 19335:getfield        #12  <Field azh a>
	// 10356 19338:astore_1        
		abyte0.bU = ((azh) (abyte0)).aC ^ a.bU;
	// 10357 19339:aload_1         
	// 10358 19340:aload_1         
	// 10359 19341:getfield        #369 <Field int azh.aC>
	// 10360 19344:aload_0         
	// 10361 19345:getfield        #12  <Field azh a>
	// 10362 19348:getfield        #231 <Field int azh.bU>
	// 10363 19351:ixor            
	// 10364 19352:putfield        #231 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 10365 19355:aload_0         
	// 10366 19356:getfield        #12  <Field azh a>
	// 10367 19359:astore_1        
		abyte0.H = ((azh) (abyte0)).bw ^ a.H;
	// 10368 19360:aload_1         
	// 10369 19361:aload_1         
	// 10370 19362:getfield        #195 <Field int azh.bw>
	// 10371 19365:aload_0         
	// 10372 19366:getfield        #12  <Field azh a>
	// 10373 19369:getfield        #201 <Field int azh.H>
	// 10374 19372:ixor            
	// 10375 19373:putfield        #201 <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 10376 19376:aload_0         
	// 10377 19377:getfield        #12  <Field azh a>
	// 10378 19380:astore_1        
		abyte0.H = ((azh) (abyte0)).H | a.k;
	// 10379 19381:aload_1         
	// 10380 19382:aload_1         
	// 10381 19383:getfield        #201 <Field int azh.H>
	// 10382 19386:aload_0         
	// 10383 19387:getfield        #12  <Field azh a>
	// 10384 19390:getfield        #61  <Field int azh.k>
	// 10385 19393:ior             
	// 10386 19394:putfield        #201 <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 10387 19397:aload_0         
	// 10388 19398:getfield        #12  <Field azh a>
	// 10389 19401:astore_1        
		abyte0.H = ((azh) (abyte0)).aO ^ a.H;
	// 10390 19402:aload_1         
	// 10391 19403:aload_1         
	// 10392 19404:getfield        #255 <Field int azh.aO>
	// 10393 19407:aload_0         
	// 10394 19408:getfield        #12  <Field azh a>
	// 10395 19411:getfield        #201 <Field int azh.H>
	// 10396 19414:ixor            
	// 10397 19415:putfield        #201 <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 10398 19418:aload_0         
	// 10399 19419:getfield        #12  <Field azh a>
	// 10400 19422:astore_1        
		abyte0.aO = ((azh) (abyte0)).bb & ~a.ce;
	// 10401 19423:aload_1         
	// 10402 19424:aload_1         
	// 10403 19425:getfield        #34  <Field int azh.bb>
	// 10404 19428:aload_0         
	// 10405 19429:getfield        #12  <Field azh a>
	// 10406 19432:getfield        #87  <Field int azh.ce>
	// 10407 19435:iconst_m1       
	// 10408 19436:ixor            
	// 10409 19437:iand            
	// 10410 19438:putfield        #255 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 10411 19441:aload_0         
	// 10412 19442:getfield        #12  <Field azh a>
	// 10413 19445:astore_1        
		abyte0.aO = ((azh) (abyte0)).I ^ a.aO;
	// 10414 19446:aload_1         
	// 10415 19447:aload_1         
	// 10416 19448:getfield        #28  <Field int azh.I>
	// 10417 19451:aload_0         
	// 10418 19452:getfield        #12  <Field azh a>
	// 10419 19455:getfield        #255 <Field int azh.aO>
	// 10420 19458:ixor            
	// 10421 19459:putfield        #255 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 10422 19462:aload_0         
	// 10423 19463:getfield        #12  <Field azh a>
	// 10424 19466:astore_1        
		abyte0.aO = ((azh) (abyte0)).aO & ~a.c;
	// 10425 19467:aload_1         
	// 10426 19468:aload_1         
	// 10427 19469:getfield        #255 <Field int azh.aO>
	// 10428 19472:aload_0         
	// 10429 19473:getfield        #12  <Field azh a>
	// 10430 19476:getfield        #46  <Field int azh.c>
	// 10431 19479:iconst_m1       
	// 10432 19480:ixor            
	// 10433 19481:iand            
	// 10434 19482:putfield        #255 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 10435 19485:aload_0         
	// 10436 19486:getfield        #12  <Field azh a>
	// 10437 19489:astore_1        
		abyte0.bV = ((azh) (abyte0)).aO ^ a.bV;
	// 10438 19490:aload_1         
	// 10439 19491:aload_1         
	// 10440 19492:getfield        #255 <Field int azh.aO>
	// 10441 19495:aload_0         
	// 10442 19496:getfield        #12  <Field azh a>
	// 10443 19499:getfield        #174 <Field int azh.bV>
	// 10444 19502:ixor            
	// 10445 19503:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 10446 19506:aload_0         
	// 10447 19507:getfield        #12  <Field azh a>
	// 10448 19510:astore_1        
		abyte0.bk = ((azh) (abyte0)).bb & a.bk;
	// 10449 19511:aload_1         
	// 10450 19512:aload_1         
	// 10451 19513:getfield        #34  <Field int azh.bb>
	// 10452 19516:aload_0         
	// 10453 19517:getfield        #12  <Field azh a>
	// 10454 19520:getfield        #49  <Field int azh.bk>
	// 10455 19523:iand            
	// 10456 19524:putfield        #49  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 10457 19527:aload_0         
	// 10458 19528:getfield        #12  <Field azh a>
	// 10459 19531:astore_1        
		abyte0.bk = ((azh) (abyte0)).ce ^ a.bk;
	// 10460 19532:aload_1         
	// 10461 19533:aload_1         
	// 10462 19534:getfield        #87  <Field int azh.ce>
	// 10463 19537:aload_0         
	// 10464 19538:getfield        #12  <Field azh a>
	// 10465 19541:getfield        #49  <Field int azh.bk>
	// 10466 19544:ixor            
	// 10467 19545:putfield        #49  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 10468 19548:aload_0         
	// 10469 19549:getfield        #12  <Field azh a>
	// 10470 19552:astore_1        
		abyte0.bX = ((azh) (abyte0)).bk ^ a.bX;
	// 10471 19553:aload_1         
	// 10472 19554:aload_1         
	// 10473 19555:getfield        #49  <Field int azh.bk>
	// 10474 19558:aload_0         
	// 10475 19559:getfield        #12  <Field azh a>
	// 10476 19562:getfield        #120 <Field int azh.bX>
	// 10477 19565:ixor            
	// 10478 19566:putfield        #120 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 10479 19569:aload_0         
	// 10480 19570:getfield        #12  <Field azh a>
	// 10481 19573:astore_1        
		abyte0.ci = ((azh) (abyte0)).bX ^ a.ci;
	// 10482 19574:aload_1         
	// 10483 19575:aload_1         
	// 10484 19576:getfield        #120 <Field int azh.bX>
	// 10485 19579:aload_0         
	// 10486 19580:getfield        #12  <Field azh a>
	// 10487 19583:getfield        #186 <Field int azh.ci>
	// 10488 19586:ixor            
	// 10489 19587:putfield        #186 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 10490 19590:aload_0         
	// 10491 19591:getfield        #12  <Field azh a>
	// 10492 19594:astore_1        
		abyte0.ag = ((azh) (abyte0)).aK & ~a.ag;
	// 10493 19595:aload_1         
	// 10494 19596:aload_1         
	// 10495 19597:getfield        #465 <Field int azh.aK>
	// 10496 19600:aload_0         
	// 10497 19601:getfield        #12  <Field azh a>
	// 10498 19604:getfield        #414 <Field int azh.ag>
	// 10499 19607:iconst_m1       
	// 10500 19608:ixor            
	// 10501 19609:iand            
	// 10502 19610:putfield        #414 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 10503 19613:aload_0         
	// 10504 19614:getfield        #12  <Field azh a>
	// 10505 19617:astore_1        
		abyte0.ag = ((azh) (abyte0)).bz ^ a.ag;
	// 10506 19618:aload_1         
	// 10507 19619:aload_1         
	// 10508 19620:getfield        #408 <Field int azh.bz>
	// 10509 19623:aload_0         
	// 10510 19624:getfield        #12  <Field azh a>
	// 10511 19627:getfield        #414 <Field int azh.ag>
	// 10512 19630:ixor            
	// 10513 19631:putfield        #414 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 10514 19634:aload_0         
	// 10515 19635:getfield        #12  <Field azh a>
	// 10516 19638:astore_1        
		abyte0.J = ((azh) (abyte0)).ag ^ a.J;
	// 10517 19639:aload_1         
	// 10518 19640:aload_1         
	// 10519 19641:getfield        #414 <Field int azh.ag>
	// 10520 19644:aload_0         
	// 10521 19645:getfield        #12  <Field azh a>
	// 10522 19648:getfield        #471 <Field int azh.J>
	// 10523 19651:ixor            
	// 10524 19652:putfield        #471 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 10525 19655:aload_0         
	// 10526 19656:getfield        #12  <Field azh a>
	// 10527 19659:astore_1        
		abyte0.cf = ((azh) (abyte0)).J | a.cf;
	// 10528 19660:aload_1         
	// 10529 19661:aload_1         
	// 10530 19662:getfield        #471 <Field int azh.J>
	// 10531 19665:aload_0         
	// 10532 19666:getfield        #12  <Field azh a>
	// 10533 19669:getfield        #150 <Field int azh.cf>
	// 10534 19672:ior             
	// 10535 19673:putfield        #150 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 10536 19676:aload_0         
	// 10537 19677:getfield        #12  <Field azh a>
	// 10538 19680:astore_1        
		abyte0.cf = ((azh) (abyte0)).bD ^ a.cf;
	// 10539 19681:aload_1         
	// 10540 19682:aload_1         
	// 10541 19683:getfield        #312 <Field int azh.bD>
	// 10542 19686:aload_0         
	// 10543 19687:getfield        #12  <Field azh a>
	// 10544 19690:getfield        #150 <Field int azh.cf>
	// 10545 19693:ixor            
	// 10546 19694:putfield        #150 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 10547 19697:aload_0         
	// 10548 19698:getfield        #12  <Field azh a>
	// 10549 19701:astore_1        
		abyte0.cf = ((azh) (abyte0)).cf & a.R;
	// 10550 19702:aload_1         
	// 10551 19703:aload_1         
	// 10552 19704:getfield        #150 <Field int azh.cf>
	// 10553 19707:aload_0         
	// 10554 19708:getfield        #12  <Field azh a>
	// 10555 19711:getfield        #67  <Field int azh.R>
	// 10556 19714:iand            
	// 10557 19715:putfield        #150 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 10558 19718:aload_0         
	// 10559 19719:getfield        #12  <Field azh a>
	// 10560 19722:astore_1        
		abyte0.an = ((azh) (abyte0)).an & ~a.J;
	// 10561 19723:aload_1         
	// 10562 19724:aload_1         
	// 10563 19725:getfield        #198 <Field int azh.an>
	// 10564 19728:aload_0         
	// 10565 19729:getfield        #12  <Field azh a>
	// 10566 19732:getfield        #471 <Field int azh.J>
	// 10567 19735:iconst_m1       
	// 10568 19736:ixor            
	// 10569 19737:iand            
	// 10570 19738:putfield        #198 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 10571 19741:aload_0         
	// 10572 19742:getfield        #12  <Field azh a>
	// 10573 19745:astore_1        
		abyte0.an = ((azh) (abyte0)).be ^ a.an;
	// 10574 19746:aload_1         
	// 10575 19747:aload_1         
	// 10576 19748:getfield        #96  <Field int azh.be>
	// 10577 19751:aload_0         
	// 10578 19752:getfield        #12  <Field azh a>
	// 10579 19755:getfield        #198 <Field int azh.an>
	// 10580 19758:ixor            
	// 10581 19759:putfield        #198 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 10582 19762:aload_0         
	// 10583 19763:getfield        #12  <Field azh a>
	// 10584 19766:astore_1        
		abyte0.ax = ((azh) (abyte0)).J | a.ax;
	// 10585 19767:aload_1         
	// 10586 19768:aload_1         
	// 10587 19769:getfield        #471 <Field int azh.J>
	// 10588 19772:aload_0         
	// 10589 19773:getfield        #12  <Field azh a>
	// 10590 19776:getfield        #246 <Field int azh.ax>
	// 10591 19779:ior             
	// 10592 19780:putfield        #246 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 10593 19783:aload_0         
	// 10594 19784:getfield        #12  <Field azh a>
	// 10595 19787:astore_1        
		abyte0.ax = ((azh) (abyte0)).aT ^ a.ax;
	// 10596 19788:aload_1         
	// 10597 19789:aload_1         
	// 10598 19790:getfield        #105 <Field int azh.aT>
	// 10599 19793:aload_0         
	// 10600 19794:getfield        #12  <Field azh a>
	// 10601 19797:getfield        #246 <Field int azh.ax>
	// 10602 19800:ixor            
	// 10603 19801:putfield        #246 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 10604 19804:aload_0         
	// 10605 19805:getfield        #12  <Field azh a>
	// 10606 19808:astore_1        
		abyte0.aT = ((azh) (abyte0)).t & ~a.J;
	// 10607 19809:aload_1         
	// 10608 19810:aload_1         
	// 10609 19811:getfield        #474 <Field int azh.t>
	// 10610 19814:aload_0         
	// 10611 19815:getfield        #12  <Field azh a>
	// 10612 19818:getfield        #471 <Field int azh.J>
	// 10613 19821:iconst_m1       
	// 10614 19822:ixor            
	// 10615 19823:iand            
	// 10616 19824:putfield        #105 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 10617 19827:aload_0         
	// 10618 19828:getfield        #12  <Field azh a>
	// 10619 19831:astore_1        
		abyte0.be = ((azh) (abyte0)).t & ~a.aT;
	// 10620 19832:aload_1         
	// 10621 19833:aload_1         
	// 10622 19834:getfield        #474 <Field int azh.t>
	// 10623 19837:aload_0         
	// 10624 19838:getfield        #12  <Field azh a>
	// 10625 19841:getfield        #105 <Field int azh.aT>
	// 10626 19844:iconst_m1       
	// 10627 19845:ixor            
	// 10628 19846:iand            
	// 10629 19847:putfield        #96  <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 10630 19850:aload_0         
	// 10631 19851:getfield        #12  <Field azh a>
	// 10632 19854:astore_1        
		abyte0.bD = ((azh) (abyte0)).d | a.be;
	// 10633 19855:aload_1         
	// 10634 19856:aload_1         
	// 10635 19857:getfield        #213 <Field int azh.d>
	// 10636 19860:aload_0         
	// 10637 19861:getfield        #12  <Field azh a>
	// 10638 19864:getfield        #96  <Field int azh.be>
	// 10639 19867:ior             
	// 10640 19868:putfield        #312 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 10641 19871:aload_0         
	// 10642 19872:getfield        #12  <Field azh a>
	// 10643 19875:astore_1        
		abyte0.ag = ((azh) (abyte0)).B | a.be;
	// 10644 19876:aload_1         
	// 10645 19877:aload_1         
	// 10646 19878:getfield        #357 <Field int azh.B>
	// 10647 19881:aload_0         
	// 10648 19882:getfield        #12  <Field azh a>
	// 10649 19885:getfield        #96  <Field int azh.be>
	// 10650 19888:ior             
	// 10651 19889:putfield        #414 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 10652 19892:aload_0         
	// 10653 19893:getfield        #12  <Field azh a>
	// 10654 19896:astore_1        
		abyte0.be = ((azh) (abyte0)).B | a.be;
	// 10655 19897:aload_1         
	// 10656 19898:aload_1         
	// 10657 19899:getfield        #357 <Field int azh.B>
	// 10658 19902:aload_0         
	// 10659 19903:getfield        #12  <Field azh a>
	// 10660 19906:getfield        #96  <Field int azh.be>
	// 10661 19909:ior             
	// 10662 19910:putfield        #96  <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 10663 19913:aload_0         
	// 10664 19914:getfield        #12  <Field azh a>
	// 10665 19917:astore_1        
		abyte0.be = ((azh) (abyte0)).af & a.be;
	// 10666 19918:aload_1         
	// 10667 19919:aload_1         
	// 10668 19920:getfield        #207 <Field int azh.af>
	// 10669 19923:aload_0         
	// 10670 19924:getfield        #12  <Field azh a>
	// 10671 19927:getfield        #96  <Field int azh.be>
	// 10672 19930:iand            
	// 10673 19931:putfield        #96  <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 10674 19934:aload_0         
	// 10675 19935:getfield        #12  <Field azh a>
	// 10676 19938:astore_1        
		abyte0.bz = ((azh) (abyte0)).aT & ~a.B;
	// 10677 19939:aload_1         
	// 10678 19940:aload_1         
	// 10679 19941:getfield        #105 <Field int azh.aT>
	// 10680 19944:aload_0         
	// 10681 19945:getfield        #12  <Field azh a>
	// 10682 19948:getfield        #357 <Field int azh.B>
	// 10683 19951:iconst_m1       
	// 10684 19952:ixor            
	// 10685 19953:iand            
	// 10686 19954:putfield        #408 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 10687 19957:aload_0         
	// 10688 19958:getfield        #12  <Field azh a>
	// 10689 19961:astore_1        
		abyte0.bz = ((azh) (abyte0)).aT ^ a.bz;
	// 10690 19962:aload_1         
	// 10691 19963:aload_1         
	// 10692 19964:getfield        #105 <Field int azh.aT>
	// 10693 19967:aload_0         
	// 10694 19968:getfield        #12  <Field azh a>
	// 10695 19971:getfield        #408 <Field int azh.bz>
	// 10696 19974:ixor            
	// 10697 19975:putfield        #408 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 10698 19978:aload_0         
	// 10699 19979:getfield        #12  <Field azh a>
	// 10700 19982:astore_1        
		abyte0.bz = ((azh) (abyte0)).af & a.bz;
	// 10701 19983:aload_1         
	// 10702 19984:aload_1         
	// 10703 19985:getfield        #207 <Field int azh.af>
	// 10704 19988:aload_0         
	// 10705 19989:getfield        #12  <Field azh a>
	// 10706 19992:getfield        #408 <Field int azh.bz>
	// 10707 19995:iand            
	// 10708 19996:putfield        #408 <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 10709 19999:aload_0         
	// 10710 20000:getfield        #12  <Field azh a>
	// 10711 20003:astore_1        
		abyte0.cb = ((azh) (abyte0)).cb & ~a.J;
	// 10712 20004:aload_1         
	// 10713 20005:aload_1         
	// 10714 20006:getfield        #156 <Field int azh.cb>
	// 10715 20009:aload_0         
	// 10716 20010:getfield        #12  <Field azh a>
	// 10717 20013:getfield        #471 <Field int azh.J>
	// 10718 20016:iconst_m1       
	// 10719 20017:ixor            
	// 10720 20018:iand            
	// 10721 20019:putfield        #156 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 10722 20022:aload_0         
	// 10723 20023:getfield        #12  <Field azh a>
	// 10724 20026:astore_1        
		abyte0.cb = ((azh) (abyte0)).bW ^ a.cb;
	// 10725 20027:aload_1         
	// 10726 20028:aload_1         
	// 10727 20029:getfield        #55  <Field int azh.bW>
	// 10728 20032:aload_0         
	// 10729 20033:getfield        #12  <Field azh a>
	// 10730 20036:getfield        #156 <Field int azh.cb>
	// 10731 20039:ixor            
	// 10732 20040:putfield        #156 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 10733 20043:aload_0         
	// 10734 20044:getfield        #12  <Field azh a>
	// 10735 20047:astore_1        
		abyte0.cf = ((azh) (abyte0)).cb ^ a.cf;
	// 10736 20048:aload_1         
	// 10737 20049:aload_1         
	// 10738 20050:getfield        #156 <Field int azh.cb>
	// 10739 20053:aload_0         
	// 10740 20054:getfield        #12  <Field azh a>
	// 10741 20057:getfield        #150 <Field int azh.cf>
	// 10742 20060:ixor            
	// 10743 20061:putfield        #150 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 10744 20064:aload_0         
	// 10745 20065:getfield        #12  <Field azh a>
	// 10746 20068:astore_1        
		abyte0.g = ((azh) (abyte0)).cf ^ a.g;
	// 10747 20069:aload_1         
	// 10748 20070:aload_1         
	// 10749 20071:getfield        #150 <Field int azh.cf>
	// 10750 20074:aload_0         
	// 10751 20075:getfield        #12  <Field azh a>
	// 10752 20078:getfield        #99  <Field int azh.g>
	// 10753 20081:ixor            
	// 10754 20082:putfield        #99  <Field int azh.g>
		abyte0 = ((byte []) (a));
	// 10755 20085:aload_0         
	// 10756 20086:getfield        #12  <Field azh a>
	// 10757 20089:astore_1        
		abyte0.cf = ((azh) (abyte0)).g | a.bs;
	// 10758 20090:aload_1         
	// 10759 20091:aload_1         
	// 10760 20092:getfield        #99  <Field int azh.g>
	// 10761 20095:aload_0         
	// 10762 20096:getfield        #12  <Field azh a>
	// 10763 20099:getfield        #297 <Field int azh.bs>
	// 10764 20102:ior             
	// 10765 20103:putfield        #150 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 10766 20106:aload_0         
	// 10767 20107:getfield        #12  <Field azh a>
	// 10768 20110:astore_1        
		abyte0.cf = ((azh) (abyte0)).bs ^ a.cf;
	// 10769 20111:aload_1         
	// 10770 20112:aload_1         
	// 10771 20113:getfield        #297 <Field int azh.bs>
	// 10772 20116:aload_0         
	// 10773 20117:getfield        #12  <Field azh a>
	// 10774 20120:getfield        #150 <Field int azh.cf>
	// 10775 20123:ixor            
	// 10776 20124:putfield        #150 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 10777 20127:aload_0         
	// 10778 20128:getfield        #12  <Field azh a>
	// 10779 20131:astore_1        
		abyte0.cb = ((azh) (abyte0)).cf & a.ai;
	// 10780 20132:aload_1         
	// 10781 20133:aload_1         
	// 10782 20134:getfield        #150 <Field int azh.cf>
	// 10783 20137:aload_0         
	// 10784 20138:getfield        #12  <Field azh a>
	// 10785 20141:getfield        #129 <Field int azh.ai>
	// 10786 20144:iand            
	// 10787 20145:putfield        #156 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 10788 20148:aload_0         
	// 10789 20149:getfield        #12  <Field azh a>
	// 10790 20152:astore_1        
		abyte0.cf = ((azh) (abyte0)).cf & a.ai;
	// 10791 20153:aload_1         
	// 10792 20154:aload_1         
	// 10793 20155:getfield        #150 <Field int azh.cf>
	// 10794 20158:aload_0         
	// 10795 20159:getfield        #12  <Field azh a>
	// 10796 20162:getfield        #129 <Field int azh.ai>
	// 10797 20165:iand            
	// 10798 20166:putfield        #150 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 10799 20169:aload_0         
	// 10800 20170:getfield        #12  <Field azh a>
	// 10801 20173:astore_1        
		abyte0.bW = ((azh) (abyte0)).ai & ~a.g;
	// 10802 20174:aload_1         
	// 10803 20175:aload_1         
	// 10804 20176:getfield        #129 <Field int azh.ai>
	// 10805 20179:aload_0         
	// 10806 20180:getfield        #12  <Field azh a>
	// 10807 20183:getfield        #99  <Field int azh.g>
	// 10808 20186:iconst_m1       
	// 10809 20187:ixor            
	// 10810 20188:iand            
	// 10811 20189:putfield        #55  <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 10812 20192:aload_0         
	// 10813 20193:getfield        #12  <Field azh a>
	// 10814 20196:astore_1        
		abyte0.bW = ((azh) (abyte0)).aa & ~a.bW;
	// 10815 20197:aload_1         
	// 10816 20198:aload_1         
	// 10817 20199:getfield        #294 <Field int azh.aa>
	// 10818 20202:aload_0         
	// 10819 20203:getfield        #12  <Field azh a>
	// 10820 20206:getfield        #55  <Field int azh.bW>
	// 10821 20209:iconst_m1       
	// 10822 20210:ixor            
	// 10823 20211:iand            
	// 10824 20212:putfield        #55  <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 10825 20215:aload_0         
	// 10826 20216:getfield        #12  <Field azh a>
	// 10827 20219:astore_1        
		abyte0.aK = ((azh) (abyte0)).g | a.bs;
	// 10828 20220:aload_1         
	// 10829 20221:aload_1         
	// 10830 20222:getfield        #99  <Field int azh.g>
	// 10831 20225:aload_0         
	// 10832 20226:getfield        #12  <Field azh a>
	// 10833 20229:getfield        #297 <Field int azh.bs>
	// 10834 20232:ior             
	// 10835 20233:putfield        #465 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 10836 20236:aload_0         
	// 10837 20237:getfield        #12  <Field azh a>
	// 10838 20240:astore_1        
		abyte0.bX = ((azh) (abyte0)).aK & ~a.ai;
	// 10839 20241:aload_1         
	// 10840 20242:aload_1         
	// 10841 20243:getfield        #465 <Field int azh.aK>
	// 10842 20246:aload_0         
	// 10843 20247:getfield        #12  <Field azh a>
	// 10844 20250:getfield        #129 <Field int azh.ai>
	// 10845 20253:iconst_m1       
	// 10846 20254:ixor            
	// 10847 20255:iand            
	// 10848 20256:putfield        #120 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 10849 20259:aload_0         
	// 10850 20260:getfield        #12  <Field azh a>
	// 10851 20263:astore_1        
		abyte0.aK = ((azh) (abyte0)).ai | a.aK;
	// 10852 20264:aload_1         
	// 10853 20265:aload_1         
	// 10854 20266:getfield        #129 <Field int azh.ai>
	// 10855 20269:aload_0         
	// 10856 20270:getfield        #12  <Field azh a>
	// 10857 20273:getfield        #465 <Field int azh.aK>
	// 10858 20276:ior             
	// 10859 20277:putfield        #465 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 10860 20280:aload_0         
	// 10861 20281:getfield        #12  <Field azh a>
	// 10862 20284:astore_1        
		abyte0.bk = ((azh) (abyte0)).J ^ a.B;
	// 10863 20285:aload_1         
	// 10864 20286:aload_1         
	// 10865 20287:getfield        #471 <Field int azh.J>
	// 10866 20290:aload_0         
	// 10867 20291:getfield        #12  <Field azh a>
	// 10868 20294:getfield        #357 <Field int azh.B>
	// 10869 20297:ixor            
	// 10870 20298:putfield        #49  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 10871 20301:aload_0         
	// 10872 20302:getfield        #12  <Field azh a>
	// 10873 20305:astore_1        
		abyte0.bk = ((azh) (abyte0)).af & a.bk;
	// 10874 20306:aload_1         
	// 10875 20307:aload_1         
	// 10876 20308:getfield        #207 <Field int azh.af>
	// 10877 20311:aload_0         
	// 10878 20312:getfield        #12  <Field azh a>
	// 10879 20315:getfield        #49  <Field int azh.bk>
	// 10880 20318:iand            
	// 10881 20319:putfield        #49  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 10882 20322:aload_0         
	// 10883 20323:getfield        #12  <Field azh a>
	// 10884 20326:astore_1        
		abyte0.ce = ((azh) (abyte0)).J & ~a.B;
	// 10885 20327:aload_1         
	// 10886 20328:aload_1         
	// 10887 20329:getfield        #471 <Field int azh.J>
	// 10888 20332:aload_0         
	// 10889 20333:getfield        #12  <Field azh a>
	// 10890 20336:getfield        #357 <Field int azh.B>
	// 10891 20339:iconst_m1       
	// 10892 20340:ixor            
	// 10893 20341:iand            
	// 10894 20342:putfield        #87  <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 10895 20345:aload_0         
	// 10896 20346:getfield        #12  <Field azh a>
	// 10897 20349:astore_1        
		abyte0.ce = ((azh) (abyte0)).t ^ a.ce;
	// 10898 20350:aload_1         
	// 10899 20351:aload_1         
	// 10900 20352:getfield        #474 <Field int azh.t>
	// 10901 20355:aload_0         
	// 10902 20356:getfield        #12  <Field azh a>
	// 10903 20359:getfield        #87  <Field int azh.ce>
	// 10904 20362:ixor            
	// 10905 20363:putfield        #87  <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 10906 20366:aload_0         
	// 10907 20367:getfield        #12  <Field azh a>
	// 10908 20370:astore_1        
		abyte0.ce = ((azh) (abyte0)).af & ~a.ce;
	// 10909 20371:aload_1         
	// 10910 20372:aload_1         
	// 10911 20373:getfield        #207 <Field int azh.af>
	// 10912 20376:aload_0         
	// 10913 20377:getfield        #12  <Field azh a>
	// 10914 20380:getfield        #87  <Field int azh.ce>
	// 10915 20383:iconst_m1       
	// 10916 20384:ixor            
	// 10917 20385:iand            
	// 10918 20386:putfield        #87  <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 10919 20389:aload_0         
	// 10920 20390:getfield        #12  <Field azh a>
	// 10921 20393:astore_1        
		abyte0.ce = ((azh) (abyte0)).t ^ a.ce;
	// 10922 20394:aload_1         
	// 10923 20395:aload_1         
	// 10924 20396:getfield        #474 <Field int azh.t>
	// 10925 20399:aload_0         
	// 10926 20400:getfield        #12  <Field azh a>
	// 10927 20403:getfield        #87  <Field int azh.ce>
	// 10928 20406:ixor            
	// 10929 20407:putfield        #87  <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 10930 20410:aload_0         
	// 10931 20411:getfield        #12  <Field azh a>
	// 10932 20414:astore_1        
		abyte0.ce = ((azh) (abyte0)).d | a.ce;
	// 10933 20415:aload_1         
	// 10934 20416:aload_1         
	// 10935 20417:getfield        #213 <Field int azh.d>
	// 10936 20420:aload_0         
	// 10937 20421:getfield        #12  <Field azh a>
	// 10938 20424:getfield        #87  <Field int azh.ce>
	// 10939 20427:ior             
	// 10940 20428:putfield        #87  <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 10941 20431:aload_0         
	// 10942 20432:getfield        #12  <Field azh a>
	// 10943 20435:astore_1        
		abyte0.ce = ((azh) (abyte0)).bz ^ a.ce;
	// 10944 20436:aload_1         
	// 10945 20437:aload_1         
	// 10946 20438:getfield        #408 <Field int azh.bz>
	// 10947 20441:aload_0         
	// 10948 20442:getfield        #12  <Field azh a>
	// 10949 20445:getfield        #87  <Field int azh.ce>
	// 10950 20448:ixor            
	// 10951 20449:putfield        #87  <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 10952 20452:aload_0         
	// 10953 20453:getfield        #12  <Field azh a>
	// 10954 20456:astore_1        
		abyte0.ce = ((azh) (abyte0)).ce & ~a.l;
	// 10955 20457:aload_1         
	// 10956 20458:aload_1         
	// 10957 20459:getfield        #87  <Field int azh.ce>
	// 10958 20462:aload_0         
	// 10959 20463:getfield        #12  <Field azh a>
	// 10960 20466:getfield        #252 <Field int azh.l>
	// 10961 20469:iconst_m1       
	// 10962 20470:ixor            
	// 10963 20471:iand            
	// 10964 20472:putfield        #87  <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 10965 20475:aload_0         
	// 10966 20476:getfield        #12  <Field azh a>
	// 10967 20479:astore_1        
		abyte0.bA = ((azh) (abyte0)).J | a.bA;
	// 10968 20480:aload_1         
	// 10969 20481:aload_1         
	// 10970 20482:getfield        #471 <Field int azh.J>
	// 10971 20485:aload_0         
	// 10972 20486:getfield        #12  <Field azh a>
	// 10973 20489:getfield        #123 <Field int azh.bA>
	// 10974 20492:ior             
	// 10975 20493:putfield        #123 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 10976 20496:aload_0         
	// 10977 20497:getfield        #12  <Field azh a>
	// 10978 20500:astore_1        
		abyte0.bA = ((azh) (abyte0)).ah ^ a.bA;
	// 10979 20501:aload_1         
	// 10980 20502:aload_1         
	// 10981 20503:getfield        #102 <Field int azh.ah>
	// 10982 20506:aload_0         
	// 10983 20507:getfield        #12  <Field azh a>
	// 10984 20510:getfield        #123 <Field int azh.bA>
	// 10985 20513:ixor            
	// 10986 20514:putfield        #123 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 10987 20517:aload_0         
	// 10988 20518:getfield        #12  <Field azh a>
	// 10989 20521:astore_1        
		abyte0.bA = ((azh) (abyte0)).R & ~a.bA;
	// 10990 20522:aload_1         
	// 10991 20523:aload_1         
	// 10992 20524:getfield        #67  <Field int azh.R>
	// 10993 20527:aload_0         
	// 10994 20528:getfield        #12  <Field azh a>
	// 10995 20531:getfield        #123 <Field int azh.bA>
	// 10996 20534:iconst_m1       
	// 10997 20535:ixor            
	// 10998 20536:iand            
	// 10999 20537:putfield        #123 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 11000 20540:aload_0         
	// 11001 20541:getfield        #12  <Field azh a>
	// 11002 20544:astore_1        
		abyte0.bA = ((azh) (abyte0)).an ^ a.bA;
	// 11003 20545:aload_1         
	// 11004 20546:aload_1         
	// 11005 20547:getfield        #198 <Field int azh.an>
	// 11006 20550:aload_0         
	// 11007 20551:getfield        #12  <Field azh a>
	// 11008 20554:getfield        #123 <Field int azh.bA>
	// 11009 20557:ixor            
	// 11010 20558:putfield        #123 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 11011 20561:aload_0         
	// 11012 20562:getfield        #12  <Field azh a>
	// 11013 20565:astore_1        
		abyte0.bF = ((azh) (abyte0)).bA ^ a.bF;
	// 11014 20566:aload_1         
	// 11015 20567:aload_1         
	// 11016 20568:getfield        #123 <Field int azh.bA>
	// 11017 20571:aload_0         
	// 11018 20572:getfield        #12  <Field azh a>
	// 11019 20575:getfield        #477 <Field int azh.bF>
	// 11020 20578:ixor            
	// 11021 20579:putfield        #477 <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 11022 20582:aload_0         
	// 11023 20583:getfield        #12  <Field azh a>
	// 11024 20586:astore_1        
		abyte0.bV = ((azh) (abyte0)).bV & ~a.bF;
	// 11025 20587:aload_1         
	// 11026 20588:aload_1         
	// 11027 20589:getfield        #174 <Field int azh.bV>
	// 11028 20592:aload_0         
	// 11029 20593:getfield        #12  <Field azh a>
	// 11030 20596:getfield        #477 <Field int azh.bF>
	// 11031 20599:iconst_m1       
	// 11032 20600:ixor            
	// 11033 20601:iand            
	// 11034 20602:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11035 20605:aload_0         
	// 11036 20606:getfield        #12  <Field azh a>
	// 11037 20609:astore_1        
		abyte0.bV = ((azh) (abyte0)).n ^ a.bV;
	// 11038 20610:aload_1         
	// 11039 20611:aload_1         
	// 11040 20612:getfield        #210 <Field int azh.n>
	// 11041 20615:aload_0         
	// 11042 20616:getfield        #12  <Field azh a>
	// 11043 20619:getfield        #174 <Field int azh.bV>
	// 11044 20622:ixor            
	// 11045 20623:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11046 20626:aload_0         
	// 11047 20627:getfield        #12  <Field azh a>
	// 11048 20630:astore_1        
		abyte0.N = ((azh) (abyte0)).bV ^ a.N;
	// 11049 20631:aload_1         
	// 11050 20632:aload_1         
	// 11051 20633:getfield        #174 <Field int azh.bV>
	// 11052 20636:aload_0         
	// 11053 20637:getfield        #12  <Field azh a>
	// 11054 20640:getfield        #324 <Field int azh.N>
	// 11055 20643:ixor            
	// 11056 20644:putfield        #324 <Field int azh.N>
		abyte0 = ((byte []) (a));
	// 11057 20647:aload_0         
	// 11058 20648:getfield        #12  <Field azh a>
	// 11059 20651:astore_1        
		abyte0.aX = ((azh) (abyte0)).aX & ~a.bF;
	// 11060 20652:aload_1         
	// 11061 20653:aload_1         
	// 11062 20654:getfield        #381 <Field int azh.aX>
	// 11063 20657:aload_0         
	// 11064 20658:getfield        #12  <Field azh a>
	// 11065 20661:getfield        #477 <Field int azh.bF>
	// 11066 20664:iconst_m1       
	// 11067 20665:ixor            
	// 11068 20666:iand            
	// 11069 20667:putfield        #381 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 11070 20670:aload_0         
	// 11071 20671:getfield        #12  <Field azh a>
	// 11072 20674:astore_1        
		abyte0.aX = ((azh) (abyte0)).ci ^ a.aX;
	// 11073 20675:aload_1         
	// 11074 20676:aload_1         
	// 11075 20677:getfield        #186 <Field int azh.ci>
	// 11076 20680:aload_0         
	// 11077 20681:getfield        #12  <Field azh a>
	// 11078 20684:getfield        #381 <Field int azh.aX>
	// 11079 20687:ixor            
	// 11080 20688:putfield        #381 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 11081 20691:aload_0         
	// 11082 20692:getfield        #12  <Field azh a>
	// 11083 20695:astore_1        
		abyte0.T = ((azh) (abyte0)).aX ^ a.T;
	// 11084 20696:aload_1         
	// 11085 20697:aload_1         
	// 11086 20698:getfield        #381 <Field int azh.aX>
	// 11087 20701:aload_0         
	// 11088 20702:getfield        #12  <Field azh a>
	// 11089 20705:getfield        #43  <Field int azh.T>
	// 11090 20708:ixor            
	// 11091 20709:putfield        #43  <Field int azh.T>
		abyte0 = ((byte []) (a));
	// 11092 20712:aload_0         
	// 11093 20713:getfield        #12  <Field azh a>
	// 11094 20716:astore_1        
		abyte0.aX = ((azh) (abyte0)).c & ~a.bF;
	// 11095 20717:aload_1         
	// 11096 20718:aload_1         
	// 11097 20719:getfield        #46  <Field int azh.c>
	// 11098 20722:aload_0         
	// 11099 20723:getfield        #12  <Field azh a>
	// 11100 20726:getfield        #477 <Field int azh.bF>
	// 11101 20729:iconst_m1       
	// 11102 20730:ixor            
	// 11103 20731:iand            
	// 11104 20732:putfield        #381 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 11105 20735:aload_0         
	// 11106 20736:getfield        #12  <Field azh a>
	// 11107 20739:astore_1        
		abyte0.bi = ((azh) (abyte0)).bF | a.bi;
	// 11108 20740:aload_1         
	// 11109 20741:aload_1         
	// 11110 20742:getfield        #477 <Field int azh.bF>
	// 11111 20745:aload_0         
	// 11112 20746:getfield        #12  <Field azh a>
	// 11113 20749:getfield        #393 <Field int azh.bi>
	// 11114 20752:ior             
	// 11115 20753:putfield        #393 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 11116 20756:aload_0         
	// 11117 20757:getfield        #12  <Field azh a>
	// 11118 20760:astore_1        
		abyte0.bi = ((azh) (abyte0)).cg ^ a.bi;
	// 11119 20761:aload_1         
	// 11120 20762:aload_1         
	// 11121 20763:getfield        #114 <Field int azh.cg>
	// 11122 20766:aload_0         
	// 11123 20767:getfield        #12  <Field azh a>
	// 11124 20770:getfield        #393 <Field int azh.bi>
	// 11125 20773:ixor            
	// 11126 20774:putfield        #393 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 11127 20777:aload_0         
	// 11128 20778:getfield        #12  <Field azh a>
	// 11129 20781:astore_1        
		abyte0.bE = ((azh) (abyte0)).bi ^ a.bE;
	// 11130 20782:aload_1         
	// 11131 20783:aload_1         
	// 11132 20784:getfield        #393 <Field int azh.bi>
	// 11133 20787:aload_0         
	// 11134 20788:getfield        #12  <Field azh a>
	// 11135 20791:getfield        #162 <Field int azh.bE>
	// 11136 20794:ixor            
	// 11137 20795:putfield        #162 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 11138 20798:aload_0         
	// 11139 20799:getfield        #12  <Field azh a>
	// 11140 20802:astore_1        
		abyte0.H = ((azh) (abyte0)).bF | a.H;
	// 11141 20803:aload_1         
	// 11142 20804:aload_1         
	// 11143 20805:getfield        #477 <Field int azh.bF>
	// 11144 20808:aload_0         
	// 11145 20809:getfield        #12  <Field azh a>
	// 11146 20812:getfield        #201 <Field int azh.H>
	// 11147 20815:ior             
	// 11148 20816:putfield        #201 <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 11149 20819:aload_0         
	// 11150 20820:getfield        #12  <Field azh a>
	// 11151 20823:astore_1        
		abyte0.H = ((azh) (abyte0)).bU ^ a.H;
	// 11152 20824:aload_1         
	// 11153 20825:aload_1         
	// 11154 20826:getfield        #231 <Field int azh.bU>
	// 11155 20829:aload_0         
	// 11156 20830:getfield        #12  <Field azh a>
	// 11157 20833:getfield        #201 <Field int azh.H>
	// 11158 20836:ixor            
	// 11159 20837:putfield        #201 <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 11160 20840:aload_0         
	// 11161 20841:getfield        #12  <Field azh a>
	// 11162 20844:astore_1        
		abyte0.H = ((azh) (abyte0)).H ^ a.R;
	// 11163 20845:aload_1         
	// 11164 20846:aload_1         
	// 11165 20847:getfield        #201 <Field int azh.H>
	// 11166 20850:aload_0         
	// 11167 20851:getfield        #12  <Field azh a>
	// 11168 20854:getfield        #67  <Field int azh.R>
	// 11169 20857:ixor            
	// 11170 20858:putfield        #201 <Field int azh.H>
		abyte0 = ((byte []) (a));
	// 11171 20861:aload_0         
	// 11172 20862:getfield        #12  <Field azh a>
	// 11173 20865:astore_1        
		abyte0.bv = ((azh) (abyte0)).bv & ~a.bF;
	// 11174 20866:aload_1         
	// 11175 20867:aload_1         
	// 11176 20868:getfield        #432 <Field int azh.bv>
	// 11177 20871:aload_0         
	// 11178 20872:getfield        #12  <Field azh a>
	// 11179 20875:getfield        #477 <Field int azh.bF>
	// 11180 20878:iconst_m1       
	// 11181 20879:ixor            
	// 11182 20880:iand            
	// 11183 20881:putfield        #432 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 11184 20884:aload_0         
	// 11185 20885:getfield        #12  <Field azh a>
	// 11186 20888:astore_1        
		abyte0.ay = ((azh) (abyte0)).J | a.ay;
	// 11187 20889:aload_1         
	// 11188 20890:aload_1         
	// 11189 20891:getfield        #471 <Field int azh.J>
	// 11190 20894:aload_0         
	// 11191 20895:getfield        #12  <Field azh a>
	// 11192 20898:getfield        #153 <Field int azh.ay>
	// 11193 20901:ior             
	// 11194 20902:putfield        #153 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 11195 20905:aload_0         
	// 11196 20906:getfield        #12  <Field azh a>
	// 11197 20909:astore_1        
		abyte0.ay = ((azh) (abyte0)).bd ^ a.ay;
	// 11198 20910:aload_1         
	// 11199 20911:aload_1         
	// 11200 20912:getfield        #288 <Field int azh.bd>
	// 11201 20915:aload_0         
	// 11202 20916:getfield        #12  <Field azh a>
	// 11203 20919:getfield        #153 <Field int azh.ay>
	// 11204 20922:ixor            
	// 11205 20923:putfield        #153 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 11206 20926:aload_0         
	// 11207 20927:getfield        #12  <Field azh a>
	// 11208 20930:astore_1        
		abyte0.ay = ((azh) (abyte0)).ay & a.R;
	// 11209 20931:aload_1         
	// 11210 20932:aload_1         
	// 11211 20933:getfield        #153 <Field int azh.ay>
	// 11212 20936:aload_0         
	// 11213 20937:getfield        #12  <Field azh a>
	// 11214 20940:getfield        #67  <Field int azh.R>
	// 11215 20943:iand            
	// 11216 20944:putfield        #153 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 11217 20947:aload_0         
	// 11218 20948:getfield        #12  <Field azh a>
	// 11219 20951:astore_1        
		abyte0.bd = ((azh) (abyte0)).J ^ a.t;
	// 11220 20952:aload_1         
	// 11221 20953:aload_1         
	// 11222 20954:getfield        #471 <Field int azh.J>
	// 11223 20957:aload_0         
	// 11224 20958:getfield        #12  <Field azh a>
	// 11225 20961:getfield        #474 <Field int azh.t>
	// 11226 20964:ixor            
	// 11227 20965:putfield        #288 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 11228 20968:aload_0         
	// 11229 20969:getfield        #12  <Field azh a>
	// 11230 20972:astore_1        
		abyte0.cd = ((azh) (abyte0)).bd ^ a.cd;
	// 11231 20973:aload_1         
	// 11232 20974:aload_1         
	// 11233 20975:getfield        #288 <Field int azh.bd>
	// 11234 20978:aload_0         
	// 11235 20979:getfield        #12  <Field azh a>
	// 11236 20982:getfield        #480 <Field int azh.cd>
	// 11237 20985:ixor            
	// 11238 20986:putfield        #480 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 11239 20989:aload_0         
	// 11240 20990:getfield        #12  <Field azh a>
	// 11241 20993:astore_1        
		abyte0.bU = ((azh) (abyte0)).cd ^ a.af;
	// 11242 20994:aload_1         
	// 11243 20995:aload_1         
	// 11244 20996:getfield        #480 <Field int azh.cd>
	// 11245 20999:aload_0         
	// 11246 21000:getfield        #12  <Field azh a>
	// 11247 21003:getfield        #207 <Field int azh.af>
	// 11248 21006:ixor            
	// 11249 21007:putfield        #231 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 11250 21010:aload_0         
	// 11251 21011:getfield        #12  <Field azh a>
	// 11252 21014:astore_1        
		abyte0.cd = ((azh) (abyte0)).af | a.cd;
	// 11253 21015:aload_1         
	// 11254 21016:aload_1         
	// 11255 21017:getfield        #207 <Field int azh.af>
	// 11256 21020:aload_0         
	// 11257 21021:getfield        #12  <Field azh a>
	// 11258 21024:getfield        #480 <Field int azh.cd>
	// 11259 21027:ior             
	// 11260 21028:putfield        #480 <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 11261 21031:aload_0         
	// 11262 21032:getfield        #12  <Field azh a>
	// 11263 21035:astore_1        
		abyte0.bi = ((azh) (abyte0)).J & ~a.t;
	// 11264 21036:aload_1         
	// 11265 21037:aload_1         
	// 11266 21038:getfield        #471 <Field int azh.J>
	// 11267 21041:aload_0         
	// 11268 21042:getfield        #12  <Field azh a>
	// 11269 21045:getfield        #474 <Field int azh.t>
	// 11270 21048:iconst_m1       
	// 11271 21049:ixor            
	// 11272 21050:iand            
	// 11273 21051:putfield        #393 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 11274 21054:aload_0         
	// 11275 21055:getfield        #12  <Field azh a>
	// 11276 21058:astore_1        
		abyte0.cg = ((azh) (abyte0)).bi ^ a.B;
	// 11277 21059:aload_1         
	// 11278 21060:aload_1         
	// 11279 21061:getfield        #393 <Field int azh.bi>
	// 11280 21064:aload_0         
	// 11281 21065:getfield        #12  <Field azh a>
	// 11282 21068:getfield        #357 <Field int azh.B>
	// 11283 21071:ixor            
	// 11284 21072:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 11285 21075:aload_0         
	// 11286 21076:getfield        #12  <Field azh a>
	// 11287 21079:astore_1        
		abyte0.cg = ((azh) (abyte0)).cg ^ a.af;
	// 11288 21080:aload_1         
	// 11289 21081:aload_1         
	// 11290 21082:getfield        #114 <Field int azh.cg>
	// 11291 21085:aload_0         
	// 11292 21086:getfield        #12  <Field azh a>
	// 11293 21089:getfield        #207 <Field int azh.af>
	// 11294 21092:ixor            
	// 11295 21093:putfield        #114 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 11296 21096:aload_0         
	// 11297 21097:getfield        #12  <Field azh a>
	// 11298 21100:astore_1        
		abyte0.aP = ((azh) (abyte0)).bi ^ a.aP;
	// 11299 21101:aload_1         
	// 11300 21102:aload_1         
	// 11301 21103:getfield        #393 <Field int azh.bi>
	// 11302 21106:aload_0         
	// 11303 21107:getfield        #12  <Field azh a>
	// 11304 21110:getfield        #483 <Field int azh.aP>
	// 11305 21113:ixor            
	// 11306 21114:putfield        #483 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 11307 21117:aload_0         
	// 11308 21118:getfield        #12  <Field azh a>
	// 11309 21121:astore_1        
		abyte0.be = ((azh) (abyte0)).aP ^ a.be;
	// 11310 21122:aload_1         
	// 11311 21123:aload_1         
	// 11312 21124:getfield        #483 <Field int azh.aP>
	// 11313 21127:aload_0         
	// 11314 21128:getfield        #12  <Field azh a>
	// 11315 21131:getfield        #96  <Field int azh.be>
	// 11316 21134:ixor            
	// 11317 21135:putfield        #96  <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 11318 21138:aload_0         
	// 11319 21139:getfield        #12  <Field azh a>
	// 11320 21142:astore_1        
		abyte0.be = ((azh) (abyte0)).be & ~a.d;
	// 11321 21143:aload_1         
	// 11322 21144:aload_1         
	// 11323 21145:getfield        #96  <Field int azh.be>
	// 11324 21148:aload_0         
	// 11325 21149:getfield        #12  <Field azh a>
	// 11326 21152:getfield        #213 <Field int azh.d>
	// 11327 21155:iconst_m1       
	// 11328 21156:ixor            
	// 11329 21157:iand            
	// 11330 21158:putfield        #96  <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 11331 21161:aload_0         
	// 11332 21162:getfield        #12  <Field azh a>
	// 11333 21165:astore_1        
		abyte0.ci = ((azh) (abyte0)).bi & ~a.B;
	// 11334 21166:aload_1         
	// 11335 21167:aload_1         
	// 11336 21168:getfield        #393 <Field int azh.bi>
	// 11337 21171:aload_0         
	// 11338 21172:getfield        #12  <Field azh a>
	// 11339 21175:getfield        #357 <Field int azh.B>
	// 11340 21178:iconst_m1       
	// 11341 21179:ixor            
	// 11342 21180:iand            
	// 11343 21181:putfield        #186 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 11344 21184:aload_0         
	// 11345 21185:getfield        #12  <Field azh a>
	// 11346 21188:astore_1        
		abyte0.bV = ((azh) (abyte0)).bi & ~a.B;
	// 11347 21189:aload_1         
	// 11348 21190:aload_1         
	// 11349 21191:getfield        #393 <Field int azh.bi>
	// 11350 21194:aload_0         
	// 11351 21195:getfield        #12  <Field azh a>
	// 11352 21198:getfield        #357 <Field int azh.B>
	// 11353 21201:iconst_m1       
	// 11354 21202:ixor            
	// 11355 21203:iand            
	// 11356 21204:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11357 21207:aload_0         
	// 11358 21208:getfield        #12  <Field azh a>
	// 11359 21211:astore_1        
		abyte0.bV = ((azh) (abyte0)).aT ^ a.bV;
	// 11360 21212:aload_1         
	// 11361 21213:aload_1         
	// 11362 21214:getfield        #105 <Field int azh.aT>
	// 11363 21217:aload_0         
	// 11364 21218:getfield        #12  <Field azh a>
	// 11365 21221:getfield        #174 <Field int azh.bV>
	// 11366 21224:ixor            
	// 11367 21225:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11368 21228:aload_0         
	// 11369 21229:getfield        #12  <Field azh a>
	// 11370 21232:astore_1        
		abyte0.ag = ((azh) (abyte0)).bi ^ a.ag;
	// 11371 21233:aload_1         
	// 11372 21234:aload_1         
	// 11373 21235:getfield        #393 <Field int azh.bi>
	// 11374 21238:aload_0         
	// 11375 21239:getfield        #12  <Field azh a>
	// 11376 21242:getfield        #414 <Field int azh.ag>
	// 11377 21245:ixor            
	// 11378 21246:putfield        #414 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 11379 21249:aload_0         
	// 11380 21250:getfield        #12  <Field azh a>
	// 11381 21253:astore_1        
		abyte0.n = ((azh) (abyte0)).af & ~a.ag;
	// 11382 21254:aload_1         
	// 11383 21255:aload_1         
	// 11384 21256:getfield        #207 <Field int azh.af>
	// 11385 21259:aload_0         
	// 11386 21260:getfield        #12  <Field azh a>
	// 11387 21263:getfield        #414 <Field int azh.ag>
	// 11388 21266:iconst_m1       
	// 11389 21267:ixor            
	// 11390 21268:iand            
	// 11391 21269:putfield        #210 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 11392 21272:aload_0         
	// 11393 21273:getfield        #12  <Field azh a>
	// 11394 21276:astore_1        
		abyte0.n = ((azh) (abyte0)).bV ^ a.n;
	// 11395 21277:aload_1         
	// 11396 21278:aload_1         
	// 11397 21279:getfield        #174 <Field int azh.bV>
	// 11398 21282:aload_0         
	// 11399 21283:getfield        #12  <Field azh a>
	// 11400 21286:getfield        #210 <Field int azh.n>
	// 11401 21289:ixor            
	// 11402 21290:putfield        #210 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 11403 21293:aload_0         
	// 11404 21294:getfield        #12  <Field azh a>
	// 11405 21297:astore_1        
		abyte0.be = ((azh) (abyte0)).n ^ a.be;
	// 11406 21298:aload_1         
	// 11407 21299:aload_1         
	// 11408 21300:getfield        #210 <Field int azh.n>
	// 11409 21303:aload_0         
	// 11410 21304:getfield        #12  <Field azh a>
	// 11411 21307:getfield        #96  <Field int azh.be>
	// 11412 21310:ixor            
	// 11413 21311:putfield        #96  <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 11414 21314:aload_0         
	// 11415 21315:getfield        #12  <Field azh a>
	// 11416 21318:astore_1        
		abyte0.ag = ((azh) (abyte0)).af & a.ag;
	// 11417 21319:aload_1         
	// 11418 21320:aload_1         
	// 11419 21321:getfield        #207 <Field int azh.af>
	// 11420 21324:aload_0         
	// 11421 21325:getfield        #12  <Field azh a>
	// 11422 21328:getfield        #414 <Field int azh.ag>
	// 11423 21331:iand            
	// 11424 21332:putfield        #414 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 11425 21335:aload_0         
	// 11426 21336:getfield        #12  <Field azh a>
	// 11427 21339:astore_1        
		abyte0.n = ((azh) (abyte0)).J & ~a.B;
	// 11428 21340:aload_1         
	// 11429 21341:aload_1         
	// 11430 21342:getfield        #471 <Field int azh.J>
	// 11431 21345:aload_0         
	// 11432 21346:getfield        #12  <Field azh a>
	// 11433 21349:getfield        #357 <Field int azh.B>
	// 11434 21352:iconst_m1       
	// 11435 21353:ixor            
	// 11436 21354:iand            
	// 11437 21355:putfield        #210 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 11438 21358:aload_0         
	// 11439 21359:getfield        #12  <Field azh a>
	// 11440 21362:astore_1        
		abyte0.n = ((azh) (abyte0)).aT ^ a.n;
	// 11441 21363:aload_1         
	// 11442 21364:aload_1         
	// 11443 21365:getfield        #105 <Field int azh.aT>
	// 11444 21368:aload_0         
	// 11445 21369:getfield        #12  <Field azh a>
	// 11446 21372:getfield        #210 <Field int azh.n>
	// 11447 21375:ixor            
	// 11448 21376:putfield        #210 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 11449 21379:aload_0         
	// 11450 21380:getfield        #12  <Field azh a>
	// 11451 21383:astore_1        
		abyte0.bk = ((azh) (abyte0)).n ^ a.bk;
	// 11452 21384:aload_1         
	// 11453 21385:aload_1         
	// 11454 21386:getfield        #210 <Field int azh.n>
	// 11455 21389:aload_0         
	// 11456 21390:getfield        #12  <Field azh a>
	// 11457 21393:getfield        #49  <Field int azh.bk>
	// 11458 21396:ixor            
	// 11459 21397:putfield        #49  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 11460 21400:aload_0         
	// 11461 21401:getfield        #12  <Field azh a>
	// 11462 21404:astore_1        
		abyte0.bk = ((azh) (abyte0)).bk & ~a.d;
	// 11463 21405:aload_1         
	// 11464 21406:aload_1         
	// 11465 21407:getfield        #49  <Field int azh.bk>
	// 11466 21410:aload_0         
	// 11467 21411:getfield        #12  <Field azh a>
	// 11468 21414:getfield        #213 <Field int azh.d>
	// 11469 21417:iconst_m1       
	// 11470 21418:ixor            
	// 11471 21419:iand            
	// 11472 21420:putfield        #49  <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 11473 21423:aload_0         
	// 11474 21424:getfield        #12  <Field azh a>
	// 11475 21427:astore_1        
		abyte0.n = ((azh) (abyte0)).J & ~a.B;
	// 11476 21428:aload_1         
	// 11477 21429:aload_1         
	// 11478 21430:getfield        #471 <Field int azh.J>
	// 11479 21433:aload_0         
	// 11480 21434:getfield        #12  <Field azh a>
	// 11481 21437:getfield        #357 <Field int azh.B>
	// 11482 21440:iconst_m1       
	// 11483 21441:ixor            
	// 11484 21442:iand            
	// 11485 21443:putfield        #210 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 11486 21446:aload_0         
	// 11487 21447:getfield        #12  <Field azh a>
	// 11488 21450:astore_1        
		abyte0.n = ((azh) (abyte0)).af & ~a.n;
	// 11489 21451:aload_1         
	// 11490 21452:aload_1         
	// 11491 21453:getfield        #207 <Field int azh.af>
	// 11492 21456:aload_0         
	// 11493 21457:getfield        #12  <Field azh a>
	// 11494 21460:getfield        #210 <Field int azh.n>
	// 11495 21463:iconst_m1       
	// 11496 21464:ixor            
	// 11497 21465:iand            
	// 11498 21466:putfield        #210 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 11499 21469:aload_0         
	// 11500 21470:getfield        #12  <Field azh a>
	// 11501 21473:astore_1        
		abyte0.bV = ((azh) (abyte0)).B | a.J;
	// 11502 21474:aload_1         
	// 11503 21475:aload_1         
	// 11504 21476:getfield        #357 <Field int azh.B>
	// 11505 21479:aload_0         
	// 11506 21480:getfield        #12  <Field azh a>
	// 11507 21483:getfield        #471 <Field int azh.J>
	// 11508 21486:ior             
	// 11509 21487:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11510 21490:aload_0         
	// 11511 21491:getfield        #12  <Field azh a>
	// 11512 21494:astore_1        
		abyte0.bV = ((azh) (abyte0)).aT ^ a.bV;
	// 11513 21495:aload_1         
	// 11514 21496:aload_1         
	// 11515 21497:getfield        #105 <Field int azh.aT>
	// 11516 21500:aload_0         
	// 11517 21501:getfield        #12  <Field azh a>
	// 11518 21504:getfield        #174 <Field int azh.bV>
	// 11519 21507:ixor            
	// 11520 21508:putfield        #174 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11521 21511:aload_0         
	// 11522 21512:getfield        #12  <Field azh a>
	// 11523 21515:astore_1        
		abyte0.bA = ((azh) (abyte0)).bV | a.af;
	// 11524 21516:aload_1         
	// 11525 21517:aload_1         
	// 11526 21518:getfield        #174 <Field int azh.bV>
	// 11527 21521:aload_0         
	// 11528 21522:getfield        #12  <Field azh a>
	// 11529 21525:getfield        #207 <Field int azh.af>
	// 11530 21528:ior             
	// 11531 21529:putfield        #123 <Field int azh.bA>
	// 11532 21532:return          
	}

	private final azh a;
}
