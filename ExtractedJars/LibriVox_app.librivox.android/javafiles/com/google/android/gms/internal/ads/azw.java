// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			azk, azh, azj

final class azw
	implements azk
{

	private azw(azh azh1)
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

	azw(azh azh1, azj azj)
	{
		this(azh1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void azw(azh)>
	//    3    5:return          
	}

	public final void a(byte abyte0[], byte abyte1[])
	{
		abyte0 = ((byte []) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field azh a>
	//    2    4:astore_1        
		abyte0.b = ((azh) (abyte0)).A & a.ao;
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:getfield        #26  <Field int azh.A>
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field azh a>
	//    8   14:getfield        #29  <Field int azh.ao>
	//    9   17:iand            
	//   10   18:putfield        #32  <Field int azh.b>
		abyte0 = ((byte []) (a));
	//   11   21:aload_0         
	//   12   22:getfield        #12  <Field azh a>
	//   13   25:astore_1        
		abyte0.b = ((azh) (abyte0)).bJ ^ a.b;
	//   14   26:aload_1         
	//   15   27:aload_1         
	//   16   28:getfield        #35  <Field int azh.bJ>
	//   17   31:aload_0         
	//   18   32:getfield        #12  <Field azh a>
	//   19   35:getfield        #32  <Field int azh.b>
	//   20   38:ixor            
	//   21   39:putfield        #32  <Field int azh.b>
		abyte0 = ((byte []) (a));
	//   22   42:aload_0         
	//   23   43:getfield        #12  <Field azh a>
	//   24   46:astore_1        
		abyte0.b = ((azh) (abyte0)).b | a.Q;
	//   25   47:aload_1         
	//   26   48:aload_1         
	//   27   49:getfield        #32  <Field int azh.b>
	//   28   52:aload_0         
	//   29   53:getfield        #12  <Field azh a>
	//   30   56:getfield        #38  <Field int azh.Q>
	//   31   59:ior             
	//   32   60:putfield        #32  <Field int azh.b>
		abyte0 = ((byte []) (a));
	//   33   63:aload_0         
	//   34   64:getfield        #12  <Field azh a>
	//   35   67:astore_1        
		abyte0.b = ((azh) (abyte0)).b & ~a.bu;
	//   36   68:aload_1         
	//   37   69:aload_1         
	//   38   70:getfield        #32  <Field int azh.b>
	//   39   73:aload_0         
	//   40   74:getfield        #12  <Field azh a>
	//   41   77:getfield        #41  <Field int azh.bu>
	//   42   80:iconst_m1       
	//   43   81:ixor            
	//   44   82:iand            
	//   45   83:putfield        #32  <Field int azh.b>
		abyte0 = ((byte []) (a));
	//   46   86:aload_0         
	//   47   87:getfield        #12  <Field azh a>
	//   48   90:astore_1        
		abyte0.cv = ((azh) (abyte0)).A & ~a.e;
	//   49   91:aload_1         
	//   50   92:aload_1         
	//   51   93:getfield        #26  <Field int azh.A>
	//   52   96:aload_0         
	//   53   97:getfield        #12  <Field azh a>
	//   54  100:getfield        #44  <Field int azh.e>
	//   55  103:iconst_m1       
	//   56  104:ixor            
	//   57  105:iand            
	//   58  106:putfield        #47  <Field int azh.cv>
		abyte0 = ((byte []) (a));
	//   59  109:aload_0         
	//   60  110:getfield        #12  <Field azh a>
	//   61  113:astore_1        
		abyte0.cv = ((azh) (abyte0)).Y ^ a.cv;
	//   62  114:aload_1         
	//   63  115:aload_1         
	//   64  116:getfield        #50  <Field int azh.Y>
	//   65  119:aload_0         
	//   66  120:getfield        #12  <Field azh a>
	//   67  123:getfield        #47  <Field int azh.cv>
	//   68  126:ixor            
	//   69  127:putfield        #47  <Field int azh.cv>
		abyte0 = ((byte []) (a));
	//   70  130:aload_0         
	//   71  131:getfield        #12  <Field azh a>
	//   72  134:astore_1        
		abyte0.bO = ((azh) (abyte0)).cv ^ a.bO;
	//   73  135:aload_1         
	//   74  136:aload_1         
	//   75  137:getfield        #47  <Field int azh.cv>
	//   76  140:aload_0         
	//   77  141:getfield        #12  <Field azh a>
	//   78  144:getfield        #53  <Field int azh.bO>
	//   79  147:ixor            
	//   80  148:putfield        #53  <Field int azh.bO>
		abyte0 = ((byte []) (a));
	//   81  151:aload_0         
	//   82  152:getfield        #12  <Field azh a>
	//   83  155:astore_1        
		abyte0.b = ((azh) (abyte0)).bO ^ a.b;
	//   84  156:aload_1         
	//   85  157:aload_1         
	//   86  158:getfield        #53  <Field int azh.bO>
	//   87  161:aload_0         
	//   88  162:getfield        #12  <Field azh a>
	//   89  165:getfield        #32  <Field int azh.b>
	//   90  168:ixor            
	//   91  169:putfield        #32  <Field int azh.b>
		abyte0 = ((byte []) (a));
	//   92  172:aload_0         
	//   93  173:getfield        #12  <Field azh a>
	//   94  176:astore_1        
		abyte0.cz = ((azh) (abyte0)).A & ~a.cz;
	//   95  177:aload_1         
	//   96  178:aload_1         
	//   97  179:getfield        #26  <Field int azh.A>
	//   98  182:aload_0         
	//   99  183:getfield        #12  <Field azh a>
	//  100  186:getfield        #56  <Field int azh.cz>
	//  101  189:iconst_m1       
	//  102  190:ixor            
	//  103  191:iand            
	//  104  192:putfield        #56  <Field int azh.cz>
		abyte0 = ((byte []) (a));
	//  105  195:aload_0         
	//  106  196:getfield        #12  <Field azh a>
	//  107  199:astore_1        
		abyte0.cz = ((azh) (abyte0)).cC ^ a.cz;
	//  108  200:aload_1         
	//  109  201:aload_1         
	//  110  202:getfield        #59  <Field int azh.cC>
	//  111  205:aload_0         
	//  112  206:getfield        #12  <Field azh a>
	//  113  209:getfield        #56  <Field int azh.cz>
	//  114  212:ixor            
	//  115  213:putfield        #56  <Field int azh.cz>
		abyte0 = ((byte []) (a));
	//  116  216:aload_0         
	//  117  217:getfield        #12  <Field azh a>
	//  118  220:astore_1        
		abyte0.bI = ((azh) (abyte0)).cz ^ a.bI;
	//  119  221:aload_1         
	//  120  222:aload_1         
	//  121  223:getfield        #56  <Field int azh.cz>
	//  122  226:aload_0         
	//  123  227:getfield        #12  <Field azh a>
	//  124  230:getfield        #62  <Field int azh.bI>
	//  125  233:ixor            
	//  126  234:putfield        #62  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	//  127  237:aload_0         
	//  128  238:getfield        #12  <Field azh a>
	//  129  241:astore_1        
		abyte0.cs = ((azh) (abyte0)).bI ^ a.cs;
	//  130  242:aload_1         
	//  131  243:aload_1         
	//  132  244:getfield        #62  <Field int azh.bI>
	//  133  247:aload_0         
	//  134  248:getfield        #12  <Field azh a>
	//  135  251:getfield        #65  <Field int azh.cs>
	//  136  254:ixor            
	//  137  255:putfield        #65  <Field int azh.cs>
		abyte0 = ((byte []) (a));
	//  138  258:aload_0         
	//  139  259:getfield        #12  <Field azh a>
	//  140  262:astore_1        
		abyte0.bI = ((azh) (abyte0)).A & ~a.e;
	//  141  263:aload_1         
	//  142  264:aload_1         
	//  143  265:getfield        #26  <Field int azh.A>
	//  144  268:aload_0         
	//  145  269:getfield        #12  <Field azh a>
	//  146  272:getfield        #44  <Field int azh.e>
	//  147  275:iconst_m1       
	//  148  276:ixor            
	//  149  277:iand            
	//  150  278:putfield        #62  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	//  151  281:aload_0         
	//  152  282:getfield        #12  <Field azh a>
	//  153  285:astore_1        
		abyte0.bI = ((azh) (abyte0)).ao ^ a.bI;
	//  154  286:aload_1         
	//  155  287:aload_1         
	//  156  288:getfield        #29  <Field int azh.ao>
	//  157  291:aload_0         
	//  158  292:getfield        #12  <Field azh a>
	//  159  295:getfield        #62  <Field int azh.bI>
	//  160  298:ixor            
	//  161  299:putfield        #62  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	//  162  302:aload_0         
	//  163  303:getfield        #12  <Field azh a>
	//  164  306:astore_1        
		abyte0.aW = ((azh) (abyte0)).bI ^ a.aW;
	//  165  307:aload_1         
	//  166  308:aload_1         
	//  167  309:getfield        #62  <Field int azh.bI>
	//  168  312:aload_0         
	//  169  313:getfield        #12  <Field azh a>
	//  170  316:getfield        #68  <Field int azh.aW>
	//  171  319:ixor            
	//  172  320:putfield        #68  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	//  173  323:aload_0         
	//  174  324:getfield        #12  <Field azh a>
	//  175  327:astore_1        
		abyte0.bS = ((azh) (abyte0)).aW ^ a.bS;
	//  176  328:aload_1         
	//  177  329:aload_1         
	//  178  330:getfield        #68  <Field int azh.aW>
	//  179  333:aload_0         
	//  180  334:getfield        #12  <Field azh a>
	//  181  337:getfield        #71  <Field int azh.bS>
	//  182  340:ixor            
	//  183  341:putfield        #71  <Field int azh.bS>
		abyte0 = ((byte []) (a));
	//  184  344:aload_0         
	//  185  345:getfield        #12  <Field azh a>
	//  186  348:astore_1        
		abyte0.aW = ((azh) (abyte0)).A & ~a.Y;
	//  187  349:aload_1         
	//  188  350:aload_1         
	//  189  351:getfield        #26  <Field int azh.A>
	//  190  354:aload_0         
	//  191  355:getfield        #12  <Field azh a>
	//  192  358:getfield        #50  <Field int azh.Y>
	//  193  361:iconst_m1       
	//  194  362:ixor            
	//  195  363:iand            
	//  196  364:putfield        #68  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	//  197  367:aload_0         
	//  198  368:getfield        #12  <Field azh a>
	//  199  371:astore_1        
		abyte0.S = ((azh) (abyte0)).aW ^ a.S;
	//  200  372:aload_1         
	//  201  373:aload_1         
	//  202  374:getfield        #68  <Field int azh.aW>
	//  203  377:aload_0         
	//  204  378:getfield        #12  <Field azh a>
	//  205  381:getfield        #74  <Field int azh.S>
	//  206  384:ixor            
	//  207  385:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	//  208  388:aload_0         
	//  209  389:getfield        #12  <Field azh a>
	//  210  392:astore_1        
		abyte0.am = ((azh) (abyte0)).S ^ a.am;
	//  211  393:aload_1         
	//  212  394:aload_1         
	//  213  395:getfield        #74  <Field int azh.S>
	//  214  398:aload_0         
	//  215  399:getfield        #12  <Field azh a>
	//  216  402:getfield        #77  <Field int azh.am>
	//  217  405:ixor            
	//  218  406:putfield        #77  <Field int azh.am>
		abyte0 = ((byte []) (a));
	//  219  409:aload_0         
	//  220  410:getfield        #12  <Field azh a>
	//  221  413:astore_1        
		abyte0.bJ = ((azh) (abyte0)).A & a.bJ;
	//  222  414:aload_1         
	//  223  415:aload_1         
	//  224  416:getfield        #26  <Field int azh.A>
	//  225  419:aload_0         
	//  226  420:getfield        #12  <Field azh a>
	//  227  423:getfield        #35  <Field int azh.bJ>
	//  228  426:iand            
	//  229  427:putfield        #35  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	//  230  430:aload_0         
	//  231  431:getfield        #12  <Field azh a>
	//  232  434:astore_1        
		abyte0.bJ = ((azh) (abyte0)).cy ^ a.bJ;
	//  233  435:aload_1         
	//  234  436:aload_1         
	//  235  437:getfield        #80  <Field int azh.cy>
	//  236  440:aload_0         
	//  237  441:getfield        #12  <Field azh a>
	//  238  444:getfield        #35  <Field int azh.bJ>
	//  239  447:ixor            
	//  240  448:putfield        #35  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	//  241  451:aload_0         
	//  242  452:getfield        #12  <Field azh a>
	//  243  455:astore_1        
		abyte0.cm = ((azh) (abyte0)).bJ ^ a.cm;
	//  244  456:aload_1         
	//  245  457:aload_1         
	//  246  458:getfield        #35  <Field int azh.bJ>
	//  247  461:aload_0         
	//  248  462:getfield        #12  <Field azh a>
	//  249  465:getfield        #83  <Field int azh.cm>
	//  250  468:ixor            
	//  251  469:putfield        #83  <Field int azh.cm>
		abyte0 = ((byte []) (a));
	//  252  472:aload_0         
	//  253  473:getfield        #12  <Field azh a>
	//  254  476:astore_1        
		abyte0.bJ = ((azh) (abyte0)).Q & a.bJ;
	//  255  477:aload_1         
	//  256  478:aload_1         
	//  257  479:getfield        #38  <Field int azh.Q>
	//  258  482:aload_0         
	//  259  483:getfield        #12  <Field azh a>
	//  260  486:getfield        #35  <Field int azh.bJ>
	//  261  489:iand            
	//  262  490:putfield        #35  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	//  263  493:aload_0         
	//  264  494:getfield        #12  <Field azh a>
	//  265  497:astore_1        
		abyte0.bJ = ((azh) (abyte0)).at ^ a.bJ;
	//  266  498:aload_1         
	//  267  499:aload_1         
	//  268  500:getfield        #86  <Field int azh.at>
	//  269  503:aload_0         
	//  270  504:getfield        #12  <Field azh a>
	//  271  507:getfield        #35  <Field int azh.bJ>
	//  272  510:ixor            
	//  273  511:putfield        #35  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	//  274  514:aload_0         
	//  275  515:getfield        #12  <Field azh a>
	//  276  518:astore_1        
		abyte0.cE = ((azh) (abyte0)).cE ^ a.A;
	//  277  519:aload_1         
	//  278  520:aload_1         
	//  279  521:getfield        #89  <Field int azh.cE>
	//  280  524:aload_0         
	//  281  525:getfield        #12  <Field azh a>
	//  282  528:getfield        #26  <Field int azh.A>
	//  283  531:ixor            
	//  284  532:putfield        #89  <Field int azh.cE>
		abyte0 = ((byte []) (a));
	//  285  535:aload_0         
	//  286  536:getfield        #12  <Field azh a>
	//  287  539:astore_1        
		abyte0.cE = ((azh) (abyte0)).Q & ~a.cE;
	//  288  540:aload_1         
	//  289  541:aload_1         
	//  290  542:getfield        #38  <Field int azh.Q>
	//  291  545:aload_0         
	//  292  546:getfield        #12  <Field azh a>
	//  293  549:getfield        #89  <Field int azh.cE>
	//  294  552:iconst_m1       
	//  295  553:ixor            
	//  296  554:iand            
	//  297  555:putfield        #89  <Field int azh.cE>
		abyte0 = ((byte []) (a));
	//  298  558:aload_0         
	//  299  559:getfield        #12  <Field azh a>
	//  300  562:astore_1        
		abyte0.cE = ((azh) (abyte0)).bx ^ a.cE;
	//  301  563:aload_1         
	//  302  564:aload_1         
	//  303  565:getfield        #92  <Field int azh.bx>
	//  304  568:aload_0         
	//  305  569:getfield        #12  <Field azh a>
	//  306  572:getfield        #89  <Field int azh.cE>
	//  307  575:ixor            
	//  308  576:putfield        #89  <Field int azh.cE>
		abyte0 = ((byte []) (a));
	//  309  579:aload_0         
	//  310  580:getfield        #12  <Field azh a>
	//  311  583:astore_1        
		abyte0.cE = ((azh) (abyte0)).bu | a.cE;
	//  312  584:aload_1         
	//  313  585:aload_1         
	//  314  586:getfield        #41  <Field int azh.bu>
	//  315  589:aload_0         
	//  316  590:getfield        #12  <Field azh a>
	//  317  593:getfield        #89  <Field int azh.cE>
	//  318  596:ior             
	//  319  597:putfield        #89  <Field int azh.cE>
		abyte0 = ((byte []) (a));
	//  320  600:aload_0         
	//  321  601:getfield        #12  <Field azh a>
	//  322  604:astore_1        
		abyte0.cE = ((azh) (abyte0)).cm ^ a.cE;
	//  323  605:aload_1         
	//  324  606:aload_1         
	//  325  607:getfield        #83  <Field int azh.cm>
	//  326  610:aload_0         
	//  327  611:getfield        #12  <Field azh a>
	//  328  614:getfield        #89  <Field int azh.cE>
	//  329  617:ixor            
	//  330  618:putfield        #89  <Field int azh.cE>
		abyte0 = ((byte []) (a));
	//  331  621:aload_0         
	//  332  622:getfield        #12  <Field azh a>
	//  333  625:astore_1        
		abyte0.by = ((azh) (abyte0)).bs ^ a.by;
	//  334  626:aload_1         
	//  335  627:aload_1         
	//  336  628:getfield        #95  <Field int azh.bs>
	//  337  631:aload_0         
	//  338  632:getfield        #12  <Field azh a>
	//  339  635:getfield        #98  <Field int azh.by>
	//  340  638:ixor            
	//  341  639:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	//  342  642:aload_0         
	//  343  643:getfield        #12  <Field azh a>
	//  344  646:astore_1        
		abyte0.aX = ((azh) (abyte0)).by ^ a.aX;
	//  345  647:aload_1         
	//  346  648:aload_1         
	//  347  649:getfield        #98  <Field int azh.by>
	//  348  652:aload_0         
	//  349  653:getfield        #12  <Field azh a>
	//  350  656:getfield        #101 <Field int azh.aX>
	//  351  659:ixor            
	//  352  660:putfield        #101 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	//  353  663:aload_0         
	//  354  664:getfield        #12  <Field azh a>
	//  355  667:astore_1        
		abyte0.aE = ((azh) (abyte0)).aX ^ a.aE;
	//  356  668:aload_1         
	//  357  669:aload_1         
	//  358  670:getfield        #101 <Field int azh.aX>
	//  359  673:aload_0         
	//  360  674:getfield        #12  <Field azh a>
	//  361  677:getfield        #104 <Field int azh.aE>
	//  362  680:ixor            
	//  363  681:putfield        #104 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	//  364  684:aload_0         
	//  365  685:getfield        #12  <Field azh a>
	//  366  688:astore_1        
		abyte0.f = ((azh) (abyte0)).aE ^ a.f;
	//  367  689:aload_1         
	//  368  690:aload_1         
	//  369  691:getfield        #104 <Field int azh.aE>
	//  370  694:aload_0         
	//  371  695:getfield        #12  <Field azh a>
	//  372  698:getfield        #107 <Field int azh.f>
	//  373  701:ixor            
	//  374  702:putfield        #107 <Field int azh.f>
		abyte0 = ((byte []) (a));
	//  375  705:aload_0         
	//  376  706:getfield        #12  <Field azh a>
	//  377  709:astore_1        
		abyte0.aE = ((azh) (abyte0)).v | a.f;
	//  378  710:aload_1         
	//  379  711:aload_1         
	//  380  712:getfield        #110 <Field int azh.v>
	//  381  715:aload_0         
	//  382  716:getfield        #12  <Field azh a>
	//  383  719:getfield        #107 <Field int azh.f>
	//  384  722:ior             
	//  385  723:putfield        #104 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	//  386  726:aload_0         
	//  387  727:getfield        #12  <Field azh a>
	//  388  730:astore_1        
		abyte0.aX = ((azh) (abyte0)).L | a.aE;
	//  389  731:aload_1         
	//  390  732:aload_1         
	//  391  733:getfield        #113 <Field int azh.L>
	//  392  736:aload_0         
	//  393  737:getfield        #12  <Field azh a>
	//  394  740:getfield        #104 <Field int azh.aE>
	//  395  743:ior             
	//  396  744:putfield        #101 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	//  397  747:aload_0         
	//  398  748:getfield        #12  <Field azh a>
	//  399  751:astore_1        
		abyte0.by = ((azh) (abyte0)).aE & ~a.v;
	//  400  752:aload_1         
	//  401  753:aload_1         
	//  402  754:getfield        #104 <Field int azh.aE>
	//  403  757:aload_0         
	//  404  758:getfield        #12  <Field azh a>
	//  405  761:getfield        #110 <Field int azh.v>
	//  406  764:iconst_m1       
	//  407  765:ixor            
	//  408  766:iand            
	//  409  767:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	//  410  770:aload_0         
	//  411  771:getfield        #12  <Field azh a>
	//  412  774:astore_1        
		abyte0.aE = ((azh) (abyte0)).aE & ~a.L;
	//  413  775:aload_1         
	//  414  776:aload_1         
	//  415  777:getfield        #104 <Field int azh.aE>
	//  416  780:aload_0         
	//  417  781:getfield        #12  <Field azh a>
	//  418  784:getfield        #113 <Field int azh.L>
	//  419  787:iconst_m1       
	//  420  788:ixor            
	//  421  789:iand            
	//  422  790:putfield        #104 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	//  423  793:aload_0         
	//  424  794:getfield        #12  <Field azh a>
	//  425  797:astore_1        
		abyte0.aE = ((azh) (abyte0)).f ^ a.aE;
	//  426  798:aload_1         
	//  427  799:aload_1         
	//  428  800:getfield        #107 <Field int azh.f>
	//  429  803:aload_0         
	//  430  804:getfield        #12  <Field azh a>
	//  431  807:getfield        #104 <Field int azh.aE>
	//  432  810:ixor            
	//  433  811:putfield        #104 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	//  434  814:aload_0         
	//  435  815:getfield        #12  <Field azh a>
	//  436  818:astore_1        
		abyte0.bs = ((azh) (abyte0)).f & a.v;
	//  437  819:aload_1         
	//  438  820:aload_1         
	//  439  821:getfield        #107 <Field int azh.f>
	//  440  824:aload_0         
	//  441  825:getfield        #12  <Field azh a>
	//  442  828:getfield        #110 <Field int azh.v>
	//  443  831:iand            
	//  444  832:putfield        #95  <Field int azh.bs>
		abyte0 = ((byte []) (a));
	//  445  835:aload_0         
	//  446  836:getfield        #12  <Field azh a>
	//  447  839:astore_1        
		abyte0.cm = ((azh) (abyte0)).L | a.bs;
	//  448  840:aload_1         
	//  449  841:aload_1         
	//  450  842:getfield        #113 <Field int azh.L>
	//  451  845:aload_0         
	//  452  846:getfield        #12  <Field azh a>
	//  453  849:getfield        #95  <Field int azh.bs>
	//  454  852:ior             
	//  455  853:putfield        #83  <Field int azh.cm>
		abyte0 = ((byte []) (a));
	//  456  856:aload_0         
	//  457  857:getfield        #12  <Field azh a>
	//  458  860:astore_1        
		abyte0.cm = ((azh) (abyte0)).by ^ a.cm;
	//  459  861:aload_1         
	//  460  862:aload_1         
	//  461  863:getfield        #98  <Field int azh.by>
	//  462  866:aload_0         
	//  463  867:getfield        #12  <Field azh a>
	//  464  870:getfield        #83  <Field int azh.cm>
	//  465  873:ixor            
	//  466  874:putfield        #83  <Field int azh.cm>
		abyte0 = ((byte []) (a));
	//  467  877:aload_0         
	//  468  878:getfield        #12  <Field azh a>
	//  469  881:astore_1        
		abyte0.cj = ((azh) (abyte0)).cm ^ a.cj;
	//  470  882:aload_1         
	//  471  883:aload_1         
	//  472  884:getfield        #83  <Field int azh.cm>
	//  473  887:aload_0         
	//  474  888:getfield        #12  <Field azh a>
	//  475  891:getfield        #116 <Field int azh.cj>
	//  476  894:ixor            
	//  477  895:putfield        #116 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	//  478  898:aload_0         
	//  479  899:getfield        #12  <Field azh a>
	//  480  902:astore_1        
		abyte0.by = ((azh) (abyte0)).L | a.bs;
	//  481  903:aload_1         
	//  482  904:aload_1         
	//  483  905:getfield        #113 <Field int azh.L>
	//  484  908:aload_0         
	//  485  909:getfield        #12  <Field azh a>
	//  486  912:getfield        #95  <Field int azh.bs>
	//  487  915:ior             
	//  488  916:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	//  489  919:aload_0         
	//  490  920:getfield        #12  <Field azh a>
	//  491  923:astore_1        
		abyte0.by = ((azh) (abyte0)).bs ^ a.by;
	//  492  924:aload_1         
	//  493  925:aload_1         
	//  494  926:getfield        #95  <Field int azh.bs>
	//  495  929:aload_0         
	//  496  930:getfield        #12  <Field azh a>
	//  497  933:getfield        #98  <Field int azh.by>
	//  498  936:ixor            
	//  499  937:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	//  500  940:aload_0         
	//  501  941:getfield        #12  <Field azh a>
	//  502  944:astore_1        
		abyte0.bx = ((azh) (abyte0)).bs & ~a.L;
	//  503  945:aload_1         
	//  504  946:aload_1         
	//  505  947:getfield        #95  <Field int azh.bs>
	//  506  950:aload_0         
	//  507  951:getfield        #12  <Field azh a>
	//  508  954:getfield        #113 <Field int azh.L>
	//  509  957:iconst_m1       
	//  510  958:ixor            
	//  511  959:iand            
	//  512  960:putfield        #92  <Field int azh.bx>
		abyte0 = ((byte []) (a));
	//  513  963:aload_0         
	//  514  964:getfield        #12  <Field azh a>
	//  515  967:astore_1        
		abyte0.at = ((azh) (abyte0)).L | a.bs;
	//  516  968:aload_1         
	//  517  969:aload_1         
	//  518  970:getfield        #113 <Field int azh.L>
	//  519  973:aload_0         
	//  520  974:getfield        #12  <Field azh a>
	//  521  977:getfield        #95  <Field int azh.bs>
	//  522  980:ior             
	//  523  981:putfield        #86  <Field int azh.at>
		abyte0 = ((byte []) (a));
	//  524  984:aload_0         
	//  525  985:getfield        #12  <Field azh a>
	//  526  988:astore_1        
		abyte0.at = ((azh) (abyte0)).D & a.at;
	//  527  989:aload_1         
	//  528  990:aload_1         
	//  529  991:getfield        #119 <Field int azh.D>
	//  530  994:aload_0         
	//  531  995:getfield        #12  <Field azh a>
	//  532  998:getfield        #86  <Field int azh.at>
	//  533 1001:iand            
	//  534 1002:putfield        #86  <Field int azh.at>
		abyte0 = ((byte []) (a));
	//  535 1005:aload_0         
	//  536 1006:getfield        #12  <Field azh a>
	//  537 1009:astore_1        
		abyte0.cy = ((azh) (abyte0)).bs & ~a.L;
	//  538 1010:aload_1         
	//  539 1011:aload_1         
	//  540 1012:getfield        #95  <Field int azh.bs>
	//  541 1015:aload_0         
	//  542 1016:getfield        #12  <Field azh a>
	//  543 1019:getfield        #113 <Field int azh.L>
	//  544 1022:iconst_m1       
	//  545 1023:ixor            
	//  546 1024:iand            
	//  547 1025:putfield        #80  <Field int azh.cy>
		abyte0 = ((byte []) (a));
	//  548 1028:aload_0         
	//  549 1029:getfield        #12  <Field azh a>
	//  550 1032:astore_1        
		abyte0.cy = ((azh) (abyte0)).bs ^ a.cy;
	//  551 1033:aload_1         
	//  552 1034:aload_1         
	//  553 1035:getfield        #95  <Field int azh.bs>
	//  554 1038:aload_0         
	//  555 1039:getfield        #12  <Field azh a>
	//  556 1042:getfield        #80  <Field int azh.cy>
	//  557 1045:ixor            
	//  558 1046:putfield        #80  <Field int azh.cy>
		abyte0 = ((byte []) (a));
	//  559 1049:aload_0         
	//  560 1050:getfield        #12  <Field azh a>
	//  561 1053:astore_1        
		abyte0.cy = ((azh) (abyte0)).D & ~a.cy;
	//  562 1054:aload_1         
	//  563 1055:aload_1         
	//  564 1056:getfield        #119 <Field int azh.D>
	//  565 1059:aload_0         
	//  566 1060:getfield        #12  <Field azh a>
	//  567 1063:getfield        #80  <Field int azh.cy>
	//  568 1066:iconst_m1       
	//  569 1067:ixor            
	//  570 1068:iand            
	//  571 1069:putfield        #80  <Field int azh.cy>
		abyte0 = ((byte []) (a));
	//  572 1072:aload_0         
	//  573 1073:getfield        #12  <Field azh a>
	//  574 1076:astore_1        
		abyte0.bs = ((azh) (abyte0)).bY & ~a.f;
	//  575 1077:aload_1         
	//  576 1078:aload_1         
	//  577 1079:getfield        #122 <Field int azh.bY>
	//  578 1082:aload_0         
	//  579 1083:getfield        #12  <Field azh a>
	//  580 1086:getfield        #107 <Field int azh.f>
	//  581 1089:iconst_m1       
	//  582 1090:ixor            
	//  583 1091:iand            
	//  584 1092:putfield        #95  <Field int azh.bs>
		abyte0 = ((byte []) (a));
	//  585 1095:aload_0         
	//  586 1096:getfield        #12  <Field azh a>
	//  587 1099:astore_1        
		abyte0.X = ((azh) (abyte0)).bs ^ a.X;
	//  588 1100:aload_1         
	//  589 1101:aload_1         
	//  590 1102:getfield        #95  <Field int azh.bs>
	//  591 1105:aload_0         
	//  592 1106:getfield        #12  <Field azh a>
	//  593 1109:getfield        #125 <Field int azh.X>
	//  594 1112:ixor            
	//  595 1113:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	//  596 1116:aload_0         
	//  597 1117:getfield        #12  <Field azh a>
	//  598 1120:astore_1        
		abyte0.X = ((azh) (abyte0)).br | a.X;
	//  599 1121:aload_1         
	//  600 1122:aload_1         
	//  601 1123:getfield        #128 <Field int azh.br>
	//  602 1126:aload_0         
	//  603 1127:getfield        #12  <Field azh a>
	//  604 1130:getfield        #125 <Field int azh.X>
	//  605 1133:ior             
	//  606 1134:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	//  607 1137:aload_0         
	//  608 1138:getfield        #12  <Field azh a>
	//  609 1141:astore_1        
		abyte0.S = ((azh) (abyte0)).H & ~a.bs;
	//  610 1142:aload_1         
	//  611 1143:aload_1         
	//  612 1144:getfield        #131 <Field int azh.H>
	//  613 1147:aload_0         
	//  614 1148:getfield        #12  <Field azh a>
	//  615 1151:getfield        #95  <Field int azh.bs>
	//  616 1154:iconst_m1       
	//  617 1155:ixor            
	//  618 1156:iand            
	//  619 1157:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	//  620 1160:aload_0         
	//  621 1161:getfield        #12  <Field azh a>
	//  622 1164:astore_1        
		abyte0.S = ((azh) (abyte0)).bs ^ a.S;
	//  623 1165:aload_1         
	//  624 1166:aload_1         
	//  625 1167:getfield        #95  <Field int azh.bs>
	//  626 1170:aload_0         
	//  627 1171:getfield        #12  <Field azh a>
	//  628 1174:getfield        #74  <Field int azh.S>
	//  629 1177:ixor            
	//  630 1178:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	//  631 1181:aload_0         
	//  632 1182:getfield        #12  <Field azh a>
	//  633 1185:astore_1        
		abyte0.S = ((azh) (abyte0)).S & ~a.br;
	//  634 1186:aload_1         
	//  635 1187:aload_1         
	//  636 1188:getfield        #74  <Field int azh.S>
	//  637 1191:aload_0         
	//  638 1192:getfield        #12  <Field azh a>
	//  639 1195:getfield        #128 <Field int azh.br>
	//  640 1198:iconst_m1       
	//  641 1199:ixor            
	//  642 1200:iand            
	//  643 1201:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	//  644 1204:aload_0         
	//  645 1205:getfield        #12  <Field azh a>
	//  646 1208:astore_1        
		abyte0.aW = ((azh) (abyte0)).H & ~a.bs;
	//  647 1209:aload_1         
	//  648 1210:aload_1         
	//  649 1211:getfield        #131 <Field int azh.H>
	//  650 1214:aload_0         
	//  651 1215:getfield        #12  <Field azh a>
	//  652 1218:getfield        #95  <Field int azh.bs>
	//  653 1221:iconst_m1       
	//  654 1222:ixor            
	//  655 1223:iand            
	//  656 1224:putfield        #68  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	//  657 1227:aload_0         
	//  658 1228:getfield        #12  <Field azh a>
	//  659 1231:astore_1        
		abyte0.aW = ((azh) (abyte0)).f ^ a.aW;
	//  660 1232:aload_1         
	//  661 1233:aload_1         
	//  662 1234:getfield        #107 <Field int azh.f>
	//  663 1237:aload_0         
	//  664 1238:getfield        #12  <Field azh a>
	//  665 1241:getfield        #68  <Field int azh.aW>
	//  666 1244:ixor            
	//  667 1245:putfield        #68  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	//  668 1248:aload_0         
	//  669 1249:getfield        #12  <Field azh a>
	//  670 1252:astore_1        
		abyte0.X = ((azh) (abyte0)).aW ^ a.X;
	//  671 1253:aload_1         
	//  672 1254:aload_1         
	//  673 1255:getfield        #68  <Field int azh.aW>
	//  674 1258:aload_0         
	//  675 1259:getfield        #12  <Field azh a>
	//  676 1262:getfield        #125 <Field int azh.X>
	//  677 1265:ixor            
	//  678 1266:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	//  679 1269:aload_0         
	//  680 1270:getfield        #12  <Field azh a>
	//  681 1273:astore_1        
		abyte0.aW = ((azh) (abyte0)).H & ~a.bs;
	//  682 1274:aload_1         
	//  683 1275:aload_1         
	//  684 1276:getfield        #131 <Field int azh.H>
	//  685 1279:aload_0         
	//  686 1280:getfield        #12  <Field azh a>
	//  687 1283:getfield        #95  <Field int azh.bs>
	//  688 1286:iconst_m1       
	//  689 1287:ixor            
	//  690 1288:iand            
	//  691 1289:putfield        #68  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	//  692 1292:aload_0         
	//  693 1293:getfield        #12  <Field azh a>
	//  694 1296:astore_1        
		abyte0.bI = ((azh) (abyte0)).f | a.bs;
	//  695 1297:aload_1         
	//  696 1298:aload_1         
	//  697 1299:getfield        #107 <Field int azh.f>
	//  698 1302:aload_0         
	//  699 1303:getfield        #12  <Field azh a>
	//  700 1306:getfield        #95  <Field int azh.bs>
	//  701 1309:ior             
	//  702 1310:putfield        #62  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	//  703 1313:aload_0         
	//  704 1314:getfield        #12  <Field azh a>
	//  705 1317:astore_1        
		abyte0.ao = ((azh) (abyte0)).bI & ~a.br;
	//  706 1318:aload_1         
	//  707 1319:aload_1         
	//  708 1320:getfield        #62  <Field int azh.bI>
	//  709 1323:aload_0         
	//  710 1324:getfield        #12  <Field azh a>
	//  711 1327:getfield        #128 <Field int azh.br>
	//  712 1330:iconst_m1       
	//  713 1331:ixor            
	//  714 1332:iand            
	//  715 1333:putfield        #29  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	//  716 1336:aload_0         
	//  717 1337:getfield        #12  <Field azh a>
	//  718 1340:astore_1        
		abyte0.C = ((azh) (abyte0)).bI ^ a.C;
	//  719 1341:aload_1         
	//  720 1342:aload_1         
	//  721 1343:getfield        #62  <Field int azh.bI>
	//  722 1346:aload_0         
	//  723 1347:getfield        #12  <Field azh a>
	//  724 1350:getfield        #134 <Field int azh.C>
	//  725 1353:ixor            
	//  726 1354:putfield        #134 <Field int azh.C>
		abyte0 = ((byte []) (a));
	//  727 1357:aload_0         
	//  728 1358:getfield        #12  <Field azh a>
	//  729 1361:astore_1        
		abyte0.cz = ((azh) (abyte0)).bI ^ a.H;
	//  730 1362:aload_1         
	//  731 1363:aload_1         
	//  732 1364:getfield        #62  <Field int azh.bI>
	//  733 1367:aload_0         
	//  734 1368:getfield        #12  <Field azh a>
	//  735 1371:getfield        #131 <Field int azh.H>
	//  736 1374:ixor            
	//  737 1375:putfield        #56  <Field int azh.cz>
		abyte0 = ((byte []) (a));
	//  738 1378:aload_0         
	//  739 1379:getfield        #12  <Field azh a>
	//  740 1382:astore_1        
		abyte0.bI = ((azh) (abyte0)).H & a.bI;
	//  741 1383:aload_1         
	//  742 1384:aload_1         
	//  743 1385:getfield        #131 <Field int azh.H>
	//  744 1388:aload_0         
	//  745 1389:getfield        #12  <Field azh a>
	//  746 1392:getfield        #62  <Field int azh.bI>
	//  747 1395:iand            
	//  748 1396:putfield        #62  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	//  749 1399:aload_0         
	//  750 1400:getfield        #12  <Field azh a>
	//  751 1403:astore_1        
		abyte0.bI = ((azh) (abyte0)).bs ^ a.bI;
	//  752 1404:aload_1         
	//  753 1405:aload_1         
	//  754 1406:getfield        #95  <Field int azh.bs>
	//  755 1409:aload_0         
	//  756 1410:getfield        #12  <Field azh a>
	//  757 1413:getfield        #62  <Field int azh.bI>
	//  758 1416:ixor            
	//  759 1417:putfield        #62  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	//  760 1420:aload_0         
	//  761 1421:getfield        #12  <Field azh a>
	//  762 1424:astore_1        
		abyte0.cC = ((azh) (abyte0)).bI & ~a.br;
	//  763 1425:aload_1         
	//  764 1426:aload_1         
	//  765 1427:getfield        #62  <Field int azh.bI>
	//  766 1430:aload_0         
	//  767 1431:getfield        #12  <Field azh a>
	//  768 1434:getfield        #128 <Field int azh.br>
	//  769 1437:iconst_m1       
	//  770 1438:ixor            
	//  771 1439:iand            
	//  772 1440:putfield        #59  <Field int azh.cC>
		abyte0 = ((byte []) (a));
	//  773 1443:aload_0         
	//  774 1444:getfield        #12  <Field azh a>
	//  775 1447:astore_1        
		abyte0.bO = ((azh) (abyte0)).H & ~a.f;
	//  776 1448:aload_1         
	//  777 1449:aload_1         
	//  778 1450:getfield        #131 <Field int azh.H>
	//  779 1453:aload_0         
	//  780 1454:getfield        #12  <Field azh a>
	//  781 1457:getfield        #107 <Field int azh.f>
	//  782 1460:iconst_m1       
	//  783 1461:ixor            
	//  784 1462:iand            
	//  785 1463:putfield        #53  <Field int azh.bO>
		abyte0 = ((byte []) (a));
	//  786 1466:aload_0         
	//  787 1467:getfield        #12  <Field azh a>
	//  788 1470:astore_1        
		abyte0.cv = ((azh) (abyte0)).br | a.bO;
	//  789 1471:aload_1         
	//  790 1472:aload_1         
	//  791 1473:getfield        #128 <Field int azh.br>
	//  792 1476:aload_0         
	//  793 1477:getfield        #12  <Field azh a>
	//  794 1480:getfield        #53  <Field int azh.bO>
	//  795 1483:ior             
	//  796 1484:putfield        #47  <Field int azh.cv>
		abyte0 = ((byte []) (a));
	//  797 1487:aload_0         
	//  798 1488:getfield        #12  <Field azh a>
	//  799 1491:astore_1        
		abyte0.cv = ((azh) (abyte0)).cz ^ a.cv;
	//  800 1492:aload_1         
	//  801 1493:aload_1         
	//  802 1494:getfield        #56  <Field int azh.cz>
	//  803 1497:aload_0         
	//  804 1498:getfield        #12  <Field azh a>
	//  805 1501:getfield        #47  <Field int azh.cv>
	//  806 1504:ixor            
	//  807 1505:putfield        #47  <Field int azh.cv>
		abyte0 = ((byte []) (a));
	//  808 1508:aload_0         
	//  809 1509:getfield        #12  <Field azh a>
	//  810 1512:astore_1        
		abyte0.cv = ((azh) (abyte0)).Z | a.cv;
	//  811 1513:aload_1         
	//  812 1514:aload_1         
	//  813 1515:getfield        #137 <Field int azh.Z>
	//  814 1518:aload_0         
	//  815 1519:getfield        #12  <Field azh a>
	//  816 1522:getfield        #47  <Field int azh.cv>
	//  817 1525:ior             
	//  818 1526:putfield        #47  <Field int azh.cv>
		abyte0 = ((byte []) (a));
	//  819 1529:aload_0         
	//  820 1530:getfield        #12  <Field azh a>
	//  821 1533:astore_1        
		abyte0.cz = ((azh) (abyte0)).f ^ a.v;
	//  822 1534:aload_1         
	//  823 1535:aload_1         
	//  824 1536:getfield        #107 <Field int azh.f>
	//  825 1539:aload_0         
	//  826 1540:getfield        #12  <Field azh a>
	//  827 1543:getfield        #110 <Field int azh.v>
	//  828 1546:ixor            
	//  829 1547:putfield        #56  <Field int azh.cz>
		abyte0 = ((byte []) (a));
	//  830 1550:aload_0         
	//  831 1551:getfield        #12  <Field azh a>
	//  832 1554:astore_1        
		abyte0.aa = ((azh) (abyte0)).cz & ~a.L;
	//  833 1555:aload_1         
	//  834 1556:aload_1         
	//  835 1557:getfield        #56  <Field int azh.cz>
	//  836 1560:aload_0         
	//  837 1561:getfield        #12  <Field azh a>
	//  838 1564:getfield        #113 <Field int azh.L>
	//  839 1567:iconst_m1       
	//  840 1568:ixor            
	//  841 1569:iand            
	//  842 1570:putfield        #140 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	//  843 1573:aload_0         
	//  844 1574:getfield        #12  <Field azh a>
	//  845 1577:astore_1        
		abyte0.aa = ((azh) (abyte0)).f ^ a.aa;
	//  846 1578:aload_1         
	//  847 1579:aload_1         
	//  848 1580:getfield        #107 <Field int azh.f>
	//  849 1583:aload_0         
	//  850 1584:getfield        #12  <Field azh a>
	//  851 1587:getfield        #140 <Field int azh.aa>
	//  852 1590:ixor            
	//  853 1591:putfield        #140 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	//  854 1594:aload_0         
	//  855 1595:getfield        #12  <Field azh a>
	//  856 1598:astore_1        
		abyte0.ck = ((azh) (abyte0)).D & ~a.cz;
	//  857 1599:aload_1         
	//  858 1600:aload_1         
	//  859 1601:getfield        #119 <Field int azh.D>
	//  860 1604:aload_0         
	//  861 1605:getfield        #12  <Field azh a>
	//  862 1608:getfield        #56  <Field int azh.cz>
	//  863 1611:iconst_m1       
	//  864 1612:ixor            
	//  865 1613:iand            
	//  866 1614:putfield        #143 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	//  867 1617:aload_0         
	//  868 1618:getfield        #12  <Field azh a>
	//  869 1621:astore_1        
		abyte0.ck = ((azh) (abyte0)).aE ^ a.ck;
	//  870 1622:aload_1         
	//  871 1623:aload_1         
	//  872 1624:getfield        #104 <Field int azh.aE>
	//  873 1627:aload_0         
	//  874 1628:getfield        #12  <Field azh a>
	//  875 1631:getfield        #143 <Field int azh.ck>
	//  876 1634:ixor            
	//  877 1635:putfield        #143 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	//  878 1638:aload_0         
	//  879 1639:getfield        #12  <Field azh a>
	//  880 1642:astore_1        
		abyte0.ck = ((azh) (abyte0)).aG & ~a.ck;
	//  881 1643:aload_1         
	//  882 1644:aload_1         
	//  883 1645:getfield        #146 <Field int azh.aG>
	//  884 1648:aload_0         
	//  885 1649:getfield        #12  <Field azh a>
	//  886 1652:getfield        #143 <Field int azh.ck>
	//  887 1655:iconst_m1       
	//  888 1656:ixor            
	//  889 1657:iand            
	//  890 1658:putfield        #143 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	//  891 1661:aload_0         
	//  892 1662:getfield        #12  <Field azh a>
	//  893 1665:astore_1        
		abyte0.aX = ((azh) (abyte0)).cz ^ a.aX;
	//  894 1666:aload_1         
	//  895 1667:aload_1         
	//  896 1668:getfield        #56  <Field int azh.cz>
	//  897 1671:aload_0         
	//  898 1672:getfield        #12  <Field azh a>
	//  899 1675:getfield        #101 <Field int azh.aX>
	//  900 1678:ixor            
	//  901 1679:putfield        #101 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	//  902 1682:aload_0         
	//  903 1683:getfield        #12  <Field azh a>
	//  904 1686:astore_1        
		abyte0.aX = ((azh) (abyte0)).D & ~a.aX;
	//  905 1687:aload_1         
	//  906 1688:aload_1         
	//  907 1689:getfield        #119 <Field int azh.D>
	//  908 1692:aload_0         
	//  909 1693:getfield        #12  <Field azh a>
	//  910 1696:getfield        #101 <Field int azh.aX>
	//  911 1699:iconst_m1       
	//  912 1700:ixor            
	//  913 1701:iand            
	//  914 1702:putfield        #101 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	//  915 1705:aload_0         
	//  916 1706:getfield        #12  <Field azh a>
	//  917 1709:astore_1        
		abyte0.aX = ((azh) (abyte0)).aa ^ a.aX;
	//  918 1710:aload_1         
	//  919 1711:aload_1         
	//  920 1712:getfield        #140 <Field int azh.aa>
	//  921 1715:aload_0         
	//  922 1716:getfield        #12  <Field azh a>
	//  923 1719:getfield        #101 <Field int azh.aX>
	//  924 1722:ixor            
	//  925 1723:putfield        #101 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	//  926 1726:aload_0         
	//  927 1727:getfield        #12  <Field azh a>
	//  928 1730:astore_1        
		abyte0.aa = ((azh) (abyte0)).cz & ~a.L;
	//  929 1731:aload_1         
	//  930 1732:aload_1         
	//  931 1733:getfield        #56  <Field int azh.cz>
	//  932 1736:aload_0         
	//  933 1737:getfield        #12  <Field azh a>
	//  934 1740:getfield        #113 <Field int azh.L>
	//  935 1743:iconst_m1       
	//  936 1744:ixor            
	//  937 1745:iand            
	//  938 1746:putfield        #140 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	//  939 1749:aload_0         
	//  940 1750:getfield        #12  <Field azh a>
	//  941 1753:astore_1        
		abyte0.aa = ((azh) (abyte0)).v ^ a.aa;
	//  942 1754:aload_1         
	//  943 1755:aload_1         
	//  944 1756:getfield        #110 <Field int azh.v>
	//  945 1759:aload_0         
	//  946 1760:getfield        #12  <Field azh a>
	//  947 1763:getfield        #140 <Field int azh.aa>
	//  948 1766:ixor            
	//  949 1767:putfield        #140 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	//  950 1770:aload_0         
	//  951 1771:getfield        #12  <Field azh a>
	//  952 1774:astore_1        
		abyte0.aE = ((azh) (abyte0)).D & ~a.aa;
	//  953 1775:aload_1         
	//  954 1776:aload_1         
	//  955 1777:getfield        #119 <Field int azh.D>
	//  956 1780:aload_0         
	//  957 1781:getfield        #12  <Field azh a>
	//  958 1784:getfield        #140 <Field int azh.aa>
	//  959 1787:iconst_m1       
	//  960 1788:ixor            
	//  961 1789:iand            
	//  962 1790:putfield        #104 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	//  963 1793:aload_0         
	//  964 1794:getfield        #12  <Field azh a>
	//  965 1797:astore_1        
		abyte0.aE = ((azh) (abyte0)).f ^ a.aE;
	//  966 1798:aload_1         
	//  967 1799:aload_1         
	//  968 1800:getfield        #107 <Field int azh.f>
	//  969 1803:aload_0         
	//  970 1804:getfield        #12  <Field azh a>
	//  971 1807:getfield        #104 <Field int azh.aE>
	//  972 1810:ixor            
	//  973 1811:putfield        #104 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	//  974 1814:aload_0         
	//  975 1815:getfield        #12  <Field azh a>
	//  976 1818:astore_1        
		abyte0.aE = ((azh) (abyte0)).aG & a.aE;
	//  977 1819:aload_1         
	//  978 1820:aload_1         
	//  979 1821:getfield        #146 <Field int azh.aG>
	//  980 1824:aload_0         
	//  981 1825:getfield        #12  <Field azh a>
	//  982 1828:getfield        #104 <Field int azh.aE>
	//  983 1831:iand            
	//  984 1832:putfield        #104 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	//  985 1835:aload_0         
	//  986 1836:getfield        #12  <Field azh a>
	//  987 1839:astore_1        
		abyte0.aE = ((azh) (abyte0)).cj ^ a.aE;
	//  988 1840:aload_1         
	//  989 1841:aload_1         
	//  990 1842:getfield        #116 <Field int azh.cj>
	//  991 1845:aload_0         
	//  992 1846:getfield        #12  <Field azh a>
	//  993 1849:getfield        #104 <Field int azh.aE>
	//  994 1852:ixor            
	//  995 1853:putfield        #104 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	//  996 1856:aload_0         
	//  997 1857:getfield        #12  <Field azh a>
	//  998 1860:astore_1        
		abyte0.aa = ((azh) (abyte0)).D & ~a.aa;
	//  999 1861:aload_1         
	// 1000 1862:aload_1         
	// 1001 1863:getfield        #119 <Field int azh.D>
	// 1002 1866:aload_0         
	// 1003 1867:getfield        #12  <Field azh a>
	// 1004 1870:getfield        #140 <Field int azh.aa>
	// 1005 1873:iconst_m1       
	// 1006 1874:ixor            
	// 1007 1875:iand            
	// 1008 1876:putfield        #140 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 1009 1879:aload_0         
	// 1010 1880:getfield        #12  <Field azh a>
	// 1011 1883:astore_1        
		abyte0.aa = ((azh) (abyte0)).by ^ a.aa;
	// 1012 1884:aload_1         
	// 1013 1885:aload_1         
	// 1014 1886:getfield        #98  <Field int azh.by>
	// 1015 1889:aload_0         
	// 1016 1890:getfield        #12  <Field azh a>
	// 1017 1893:getfield        #140 <Field int azh.aa>
	// 1018 1896:ixor            
	// 1019 1897:putfield        #140 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 1020 1900:aload_0         
	// 1021 1901:getfield        #12  <Field azh a>
	// 1022 1904:astore_1        
		abyte0.aa = ((azh) (abyte0)).aG & ~a.aa;
	// 1023 1905:aload_1         
	// 1024 1906:aload_1         
	// 1025 1907:getfield        #146 <Field int azh.aG>
	// 1026 1910:aload_0         
	// 1027 1911:getfield        #12  <Field azh a>
	// 1028 1914:getfield        #140 <Field int azh.aa>
	// 1029 1917:iconst_m1       
	// 1030 1918:ixor            
	// 1031 1919:iand            
	// 1032 1920:putfield        #140 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 1033 1923:aload_0         
	// 1034 1924:getfield        #12  <Field azh a>
	// 1035 1927:astore_1        
		abyte0.by = ((azh) (abyte0)).D & ~a.cz;
	// 1036 1928:aload_1         
	// 1037 1929:aload_1         
	// 1038 1930:getfield        #119 <Field int azh.D>
	// 1039 1933:aload_0         
	// 1040 1934:getfield        #12  <Field azh a>
	// 1041 1937:getfield        #56  <Field int azh.cz>
	// 1042 1940:iconst_m1       
	// 1043 1941:ixor            
	// 1044 1942:iand            
	// 1045 1943:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 1046 1946:aload_0         
	// 1047 1947:getfield        #12  <Field azh a>
	// 1048 1950:astore_1        
		abyte0.by = ((azh) (abyte0)).cm ^ a.by;
	// 1049 1951:aload_1         
	// 1050 1952:aload_1         
	// 1051 1953:getfield        #83  <Field int azh.cm>
	// 1052 1956:aload_0         
	// 1053 1957:getfield        #12  <Field azh a>
	// 1054 1960:getfield        #98  <Field int azh.by>
	// 1055 1963:ixor            
	// 1056 1964:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 1057 1967:aload_0         
	// 1058 1968:getfield        #12  <Field azh a>
	// 1059 1971:astore_1        
		abyte0.by = ((azh) (abyte0)).aG & a.by;
	// 1060 1972:aload_1         
	// 1061 1973:aload_1         
	// 1062 1974:getfield        #146 <Field int azh.aG>
	// 1063 1977:aload_0         
	// 1064 1978:getfield        #12  <Field azh a>
	// 1065 1981:getfield        #98  <Field int azh.by>
	// 1066 1984:iand            
	// 1067 1985:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 1068 1988:aload_0         
	// 1069 1989:getfield        #12  <Field azh a>
	// 1070 1992:astore_1        
		abyte0.by = ((azh) (abyte0)).aX ^ a.by;
	// 1071 1993:aload_1         
	// 1072 1994:aload_1         
	// 1073 1995:getfield        #101 <Field int azh.aX>
	// 1074 1998:aload_0         
	// 1075 1999:getfield        #12  <Field azh a>
	// 1076 2002:getfield        #98  <Field int azh.by>
	// 1077 2005:ixor            
	// 1078 2006:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 1079 2009:aload_0         
	// 1080 2010:getfield        #12  <Field azh a>
	// 1081 2013:astore_1        
		abyte0.aX = ((azh) (abyte0)).br | a.by;
	// 1082 2014:aload_1         
	// 1083 2015:aload_1         
	// 1084 2016:getfield        #128 <Field int azh.br>
	// 1085 2019:aload_0         
	// 1086 2020:getfield        #12  <Field azh a>
	// 1087 2023:getfield        #98  <Field int azh.by>
	// 1088 2026:ior             
	// 1089 2027:putfield        #101 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 1090 2030:aload_0         
	// 1091 2031:getfield        #12  <Field azh a>
	// 1092 2034:astore_1        
		abyte0.by = ((azh) (abyte0)).by & a.br;
	// 1093 2035:aload_1         
	// 1094 2036:aload_1         
	// 1095 2037:getfield        #98  <Field int azh.by>
	// 1096 2040:aload_0         
	// 1097 2041:getfield        #12  <Field azh a>
	// 1098 2044:getfield        #128 <Field int azh.br>
	// 1099 2047:iand            
	// 1100 2048:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 1101 2051:aload_0         
	// 1102 2052:getfield        #12  <Field azh a>
	// 1103 2055:astore_1        
		abyte0.bx = ((azh) (abyte0)).cz ^ a.bx;
	// 1104 2056:aload_1         
	// 1105 2057:aload_1         
	// 1106 2058:getfield        #56  <Field int azh.cz>
	// 1107 2061:aload_0         
	// 1108 2062:getfield        #12  <Field azh a>
	// 1109 2065:getfield        #92  <Field int azh.bx>
	// 1110 2068:ixor            
	// 1111 2069:putfield        #92  <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 1112 2072:aload_0         
	// 1113 2073:getfield        #12  <Field azh a>
	// 1114 2076:astore_1        
		abyte0.cy = ((azh) (abyte0)).bx ^ a.cy;
	// 1115 2077:aload_1         
	// 1116 2078:aload_1         
	// 1117 2079:getfield        #92  <Field int azh.bx>
	// 1118 2082:aload_0         
	// 1119 2083:getfield        #12  <Field azh a>
	// 1120 2086:getfield        #80  <Field int azh.cy>
	// 1121 2089:ixor            
	// 1122 2090:putfield        #80  <Field int azh.cy>
		abyte0 = ((byte []) (a));
	// 1123 2093:aload_0         
	// 1124 2094:getfield        #12  <Field azh a>
	// 1125 2097:astore_1        
		abyte0.ck = ((azh) (abyte0)).cy ^ a.ck;
	// 1126 2098:aload_1         
	// 1127 2099:aload_1         
	// 1128 2100:getfield        #80  <Field int azh.cy>
	// 1129 2103:aload_0         
	// 1130 2104:getfield        #12  <Field azh a>
	// 1131 2107:getfield        #143 <Field int azh.ck>
	// 1132 2110:ixor            
	// 1133 2111:putfield        #143 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 1134 2114:aload_0         
	// 1135 2115:getfield        #12  <Field azh a>
	// 1136 2118:astore_1        
		abyte0.cy = ((azh) (abyte0)).br | a.ck;
	// 1137 2119:aload_1         
	// 1138 2120:aload_1         
	// 1139 2121:getfield        #128 <Field int azh.br>
	// 1140 2124:aload_0         
	// 1141 2125:getfield        #12  <Field azh a>
	// 1142 2128:getfield        #143 <Field int azh.ck>
	// 1143 2131:ior             
	// 1144 2132:putfield        #80  <Field int azh.cy>
		abyte0 = ((byte []) (a));
	// 1145 2135:aload_0         
	// 1146 2136:getfield        #12  <Field azh a>
	// 1147 2139:astore_1        
		abyte0.cy = ((azh) (abyte0)).aE ^ a.cy;
	// 1148 2140:aload_1         
	// 1149 2141:aload_1         
	// 1150 2142:getfield        #104 <Field int azh.aE>
	// 1151 2145:aload_0         
	// 1152 2146:getfield        #12  <Field azh a>
	// 1153 2149:getfield        #80  <Field int azh.cy>
	// 1154 2152:ixor            
	// 1155 2153:putfield        #80  <Field int azh.cy>
		abyte0 = ((byte []) (a));
	// 1156 2156:aload_0         
	// 1157 2157:getfield        #12  <Field azh a>
	// 1158 2160:astore_1        
		abyte0.be = ((azh) (abyte0)).cy ^ a.be;
	// 1159 2161:aload_1         
	// 1160 2162:aload_1         
	// 1161 2163:getfield        #80  <Field int azh.cy>
	// 1162 2166:aload_0         
	// 1163 2167:getfield        #12  <Field azh a>
	// 1164 2170:getfield        #149 <Field int azh.be>
	// 1165 2173:ixor            
	// 1166 2174:putfield        #149 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 1167 2177:aload_0         
	// 1168 2178:getfield        #12  <Field azh a>
	// 1169 2181:astore_1        
		abyte0.cy = ((azh) (abyte0)).aP ^ a.be;
	// 1170 2182:aload_1         
	// 1171 2183:aload_1         
	// 1172 2184:getfield        #152 <Field int azh.aP>
	// 1173 2187:aload_0         
	// 1174 2188:getfield        #12  <Field azh a>
	// 1175 2191:getfield        #149 <Field int azh.be>
	// 1176 2194:ixor            
	// 1177 2195:putfield        #80  <Field int azh.cy>
		abyte0 = ((byte []) (a));
	// 1178 2198:aload_0         
	// 1179 2199:getfield        #12  <Field azh a>
	// 1180 2202:astore_1        
		abyte0.ck = ((azh) (abyte0)).br & a.ck;
	// 1181 2203:aload_1         
	// 1182 2204:aload_1         
	// 1183 2205:getfield        #128 <Field int azh.br>
	// 1184 2208:aload_0         
	// 1185 2209:getfield        #12  <Field azh a>
	// 1186 2212:getfield        #143 <Field int azh.ck>
	// 1187 2215:iand            
	// 1188 2216:putfield        #143 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 1189 2219:aload_0         
	// 1190 2220:getfield        #12  <Field azh a>
	// 1191 2223:astore_1        
		abyte0.ck = ((azh) (abyte0)).aE ^ a.ck;
	// 1192 2224:aload_1         
	// 1193 2225:aload_1         
	// 1194 2226:getfield        #104 <Field int azh.aE>
	// 1195 2229:aload_0         
	// 1196 2230:getfield        #12  <Field azh a>
	// 1197 2233:getfield        #143 <Field int azh.ck>
	// 1198 2236:ixor            
	// 1199 2237:putfield        #143 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 1200 2240:aload_0         
	// 1201 2241:getfield        #12  <Field azh a>
	// 1202 2244:astore_1        
		abyte0.ci = ((azh) (abyte0)).ck ^ a.ci;
	// 1203 2245:aload_1         
	// 1204 2246:aload_1         
	// 1205 2247:getfield        #143 <Field int azh.ck>
	// 1206 2250:aload_0         
	// 1207 2251:getfield        #12  <Field azh a>
	// 1208 2254:getfield        #155 <Field int azh.ci>
	// 1209 2257:ixor            
	// 1210 2258:putfield        #155 <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 1211 2261:aload_0         
	// 1212 2262:getfield        #12  <Field azh a>
	// 1213 2265:astore_1        
		abyte0.bp = ((azh) (abyte0)).ci & a.bp;
	// 1214 2266:aload_1         
	// 1215 2267:aload_1         
	// 1216 2268:getfield        #155 <Field int azh.ci>
	// 1217 2271:aload_0         
	// 1218 2272:getfield        #12  <Field azh a>
	// 1219 2275:getfield        #158 <Field int azh.bp>
	// 1220 2278:iand            
	// 1221 2279:putfield        #158 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 1222 2282:aload_0         
	// 1223 2283:getfield        #12  <Field azh a>
	// 1224 2286:astore_1        
		abyte0.bp = ((azh) (abyte0)).bB ^ a.bp;
	// 1225 2287:aload_1         
	// 1226 2288:aload_1         
	// 1227 2289:getfield        #161 <Field int azh.bB>
	// 1228 2292:aload_0         
	// 1229 2293:getfield        #12  <Field azh a>
	// 1230 2296:getfield        #158 <Field int azh.bp>
	// 1231 2299:ixor            
	// 1232 2300:putfield        #158 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 1233 2303:aload_0         
	// 1234 2304:getfield        #12  <Field azh a>
	// 1235 2307:astore_1        
		abyte0.P = ((azh) (abyte0)).bp ^ a.P;
	// 1236 2308:aload_1         
	// 1237 2309:aload_1         
	// 1238 2310:getfield        #158 <Field int azh.bp>
	// 1239 2313:aload_0         
	// 1240 2314:getfield        #12  <Field azh a>
	// 1241 2317:getfield        #164 <Field int azh.P>
	// 1242 2320:ixor            
	// 1243 2321:putfield        #164 <Field int azh.P>
		abyte0 = ((byte []) (a));
	// 1244 2324:aload_0         
	// 1245 2325:getfield        #12  <Field azh a>
	// 1246 2328:astore_1        
		abyte0.bp = ((azh) (abyte0)).ci ^ a.M;
	// 1247 2329:aload_1         
	// 1248 2330:aload_1         
	// 1249 2331:getfield        #155 <Field int azh.ci>
	// 1250 2334:aload_0         
	// 1251 2335:getfield        #12  <Field azh a>
	// 1252 2338:getfield        #167 <Field int azh.M>
	// 1253 2341:ixor            
	// 1254 2342:putfield        #158 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	// 1255 2345:aload_0         
	// 1256 2346:getfield        #12  <Field azh a>
	// 1257 2349:astore_1        
		abyte0.bB = ((azh) (abyte0)).M & a.ci;
	// 1258 2350:aload_1         
	// 1259 2351:aload_1         
	// 1260 2352:getfield        #167 <Field int azh.M>
	// 1261 2355:aload_0         
	// 1262 2356:getfield        #12  <Field azh a>
	// 1263 2359:getfield        #155 <Field int azh.ci>
	// 1264 2362:iand            
	// 1265 2363:putfield        #161 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 1266 2366:aload_0         
	// 1267 2367:getfield        #12  <Field azh a>
	// 1268 2370:astore_1        
		abyte0.g = ((azh) (abyte0)).ci & ~a.g;
	// 1269 2371:aload_1         
	// 1270 2372:aload_1         
	// 1271 2373:getfield        #155 <Field int azh.ci>
	// 1272 2376:aload_0         
	// 1273 2377:getfield        #12  <Field azh a>
	// 1274 2380:getfield        #170 <Field int azh.g>
	// 1275 2383:iconst_m1       
	// 1276 2384:ixor            
	// 1277 2385:iand            
	// 1278 2386:putfield        #170 <Field int azh.g>
		abyte0 = ((byte []) (a));
	// 1279 2389:aload_0         
	// 1280 2390:getfield        #12  <Field azh a>
	// 1281 2393:astore_1        
		abyte0.g = ((azh) (abyte0)).cr ^ a.g;
	// 1282 2394:aload_1         
	// 1283 2395:aload_1         
	// 1284 2396:getfield        #173 <Field int azh.cr>
	// 1285 2399:aload_0         
	// 1286 2400:getfield        #12  <Field azh a>
	// 1287 2403:getfield        #170 <Field int azh.g>
	// 1288 2406:ixor            
	// 1289 2407:putfield        #170 <Field int azh.g>
		abyte0 = ((byte []) (a));
	// 1290 2410:aload_0         
	// 1291 2411:getfield        #12  <Field azh a>
	// 1292 2414:astore_1        
		abyte0.aG = ((azh) (abyte0)).g ^ a.aG;
	// 1293 2415:aload_1         
	// 1294 2416:aload_1         
	// 1295 2417:getfield        #170 <Field int azh.g>
	// 1296 2420:aload_0         
	// 1297 2421:getfield        #12  <Field azh a>
	// 1298 2424:getfield        #146 <Field int azh.aG>
	// 1299 2427:ixor            
	// 1300 2428:putfield        #146 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 1301 2431:aload_0         
	// 1302 2432:getfield        #12  <Field azh a>
	// 1303 2435:astore_1        
		abyte0.g = ((azh) (abyte0)).M & ~a.ci;
	// 1304 2436:aload_1         
	// 1305 2437:aload_1         
	// 1306 2438:getfield        #167 <Field int azh.M>
	// 1307 2441:aload_0         
	// 1308 2442:getfield        #12  <Field azh a>
	// 1309 2445:getfield        #155 <Field int azh.ci>
	// 1310 2448:iconst_m1       
	// 1311 2449:ixor            
	// 1312 2450:iand            
	// 1313 2451:putfield        #170 <Field int azh.g>
		abyte0 = ((byte []) (a));
	// 1314 2454:aload_0         
	// 1315 2455:getfield        #12  <Field azh a>
	// 1316 2458:astore_1        
		abyte0.cr = ((azh) (abyte0)).M & ~a.ci;
	// 1317 2459:aload_1         
	// 1318 2460:aload_1         
	// 1319 2461:getfield        #167 <Field int azh.M>
	// 1320 2464:aload_0         
	// 1321 2465:getfield        #12  <Field azh a>
	// 1322 2468:getfield        #155 <Field int azh.ci>
	// 1323 2471:iconst_m1       
	// 1324 2472:ixor            
	// 1325 2473:iand            
	// 1326 2474:putfield        #173 <Field int azh.cr>
		abyte0 = ((byte []) (a));
	// 1327 2477:aload_0         
	// 1328 2478:getfield        #12  <Field azh a>
	// 1329 2481:astore_1        
		abyte0.ag = ((azh) (abyte0)).ci & ~a.ag;
	// 1330 2482:aload_1         
	// 1331 2483:aload_1         
	// 1332 2484:getfield        #155 <Field int azh.ci>
	// 1333 2487:aload_0         
	// 1334 2488:getfield        #12  <Field azh a>
	// 1335 2491:getfield        #176 <Field int azh.ag>
	// 1336 2494:iconst_m1       
	// 1337 2495:ixor            
	// 1338 2496:iand            
	// 1339 2497:putfield        #176 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 1340 2500:aload_0         
	// 1341 2501:getfield        #12  <Field azh a>
	// 1342 2504:astore_1        
		abyte0.ag = ((azh) (abyte0)).cq ^ a.ag;
	// 1343 2505:aload_1         
	// 1344 2506:aload_1         
	// 1345 2507:getfield        #179 <Field int azh.cq>
	// 1346 2510:aload_0         
	// 1347 2511:getfield        #12  <Field azh a>
	// 1348 2514:getfield        #176 <Field int azh.ag>
	// 1349 2517:ixor            
	// 1350 2518:putfield        #176 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 1351 2521:aload_0         
	// 1352 2522:getfield        #12  <Field azh a>
	// 1353 2525:astore_1        
		abyte0.F = ((azh) (abyte0)).ag ^ a.F;
	// 1354 2526:aload_1         
	// 1355 2527:aload_1         
	// 1356 2528:getfield        #176 <Field int azh.ag>
	// 1357 2531:aload_0         
	// 1358 2532:getfield        #12  <Field azh a>
	// 1359 2535:getfield        #182 <Field int azh.F>
	// 1360 2538:ixor            
	// 1361 2539:putfield        #182 <Field int azh.F>
		abyte0 = ((byte []) (a));
	// 1362 2542:aload_0         
	// 1363 2543:getfield        #12  <Field azh a>
	// 1364 2546:astore_1        
		abyte0.ag = ((azh) (abyte0)).M & a.ci;
	// 1365 2547:aload_1         
	// 1366 2548:aload_1         
	// 1367 2549:getfield        #167 <Field int azh.M>
	// 1368 2552:aload_0         
	// 1369 2553:getfield        #12  <Field azh a>
	// 1370 2556:getfield        #155 <Field int azh.ci>
	// 1371 2559:iand            
	// 1372 2560:putfield        #176 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 1373 2563:aload_0         
	// 1374 2564:getfield        #12  <Field azh a>
	// 1375 2567:astore_1        
		abyte0.aF = ((azh) (abyte0)).aF & ~a.ci;
	// 1376 2568:aload_1         
	// 1377 2569:aload_1         
	// 1378 2570:getfield        #185 <Field int azh.aF>
	// 1379 2573:aload_0         
	// 1380 2574:getfield        #12  <Field azh a>
	// 1381 2577:getfield        #155 <Field int azh.ci>
	// 1382 2580:iconst_m1       
	// 1383 2581:ixor            
	// 1384 2582:iand            
	// 1385 2583:putfield        #185 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 1386 2586:aload_0         
	// 1387 2587:getfield        #12  <Field azh a>
	// 1388 2590:astore_1        
		abyte0.aF = ((azh) (abyte0)).cq ^ a.aF;
	// 1389 2591:aload_1         
	// 1390 2592:aload_1         
	// 1391 2593:getfield        #179 <Field int azh.cq>
	// 1392 2596:aload_0         
	// 1393 2597:getfield        #12  <Field azh a>
	// 1394 2600:getfield        #185 <Field int azh.aF>
	// 1395 2603:ixor            
	// 1396 2604:putfield        #185 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 1397 2607:aload_0         
	// 1398 2608:getfield        #12  <Field azh a>
	// 1399 2611:astore_1        
		abyte0.aF = ((azh) (abyte0)).aF ^ a.bY;
	// 1400 2612:aload_1         
	// 1401 2613:aload_1         
	// 1402 2614:getfield        #185 <Field int azh.aF>
	// 1403 2617:aload_0         
	// 1404 2618:getfield        #12  <Field azh a>
	// 1405 2621:getfield        #122 <Field int azh.bY>
	// 1406 2624:ixor            
	// 1407 2625:putfield        #185 <Field int azh.aF>
		abyte0 = ((byte []) (a));
	// 1408 2628:aload_0         
	// 1409 2629:getfield        #12  <Field azh a>
	// 1410 2632:astore_1        
		abyte0.at = ((azh) (abyte0)).bx ^ a.at;
	// 1411 2633:aload_1         
	// 1412 2634:aload_1         
	// 1413 2635:getfield        #92  <Field int azh.bx>
	// 1414 2638:aload_0         
	// 1415 2639:getfield        #12  <Field azh a>
	// 1416 2642:getfield        #86  <Field int azh.at>
	// 1417 2645:ixor            
	// 1418 2646:putfield        #86  <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 1419 2649:aload_0         
	// 1420 2650:getfield        #12  <Field azh a>
	// 1421 2653:astore_1        
		abyte0.aa = ((azh) (abyte0)).at ^ a.aa;
	// 1422 2654:aload_1         
	// 1423 2655:aload_1         
	// 1424 2656:getfield        #86  <Field int azh.at>
	// 1425 2659:aload_0         
	// 1426 2660:getfield        #12  <Field azh a>
	// 1427 2663:getfield        #140 <Field int azh.aa>
	// 1428 2666:ixor            
	// 1429 2667:putfield        #140 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 1430 2670:aload_0         
	// 1431 2671:getfield        #12  <Field azh a>
	// 1432 2674:astore_1        
		abyte0.aX = ((azh) (abyte0)).aa ^ a.aX;
	// 1433 2675:aload_1         
	// 1434 2676:aload_1         
	// 1435 2677:getfield        #140 <Field int azh.aa>
	// 1436 2680:aload_0         
	// 1437 2681:getfield        #12  <Field azh a>
	// 1438 2684:getfield        #101 <Field int azh.aX>
	// 1439 2687:ixor            
	// 1440 2688:putfield        #101 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 1441 2691:aload_0         
	// 1442 2692:getfield        #12  <Field azh a>
	// 1443 2695:astore_1        
		abyte0.I = ((azh) (abyte0)).aX ^ a.I;
	// 1444 2696:aload_1         
	// 1445 2697:aload_1         
	// 1446 2698:getfield        #101 <Field int azh.aX>
	// 1447 2701:aload_0         
	// 1448 2702:getfield        #12  <Field azh a>
	// 1449 2705:getfield        #187 <Field int azh.I>
	// 1450 2708:ixor            
	// 1451 2709:putfield        #187 <Field int azh.I>
		abyte0 = ((byte []) (a));
	// 1452 2712:aload_0         
	// 1453 2713:getfield        #12  <Field azh a>
	// 1454 2716:astore_1        
		abyte0.bS = ((azh) (abyte0)).I & a.bS;
	// 1455 2717:aload_1         
	// 1456 2718:aload_1         
	// 1457 2719:getfield        #187 <Field int azh.I>
	// 1458 2722:aload_0         
	// 1459 2723:getfield        #12  <Field azh a>
	// 1460 2726:getfield        #71  <Field int azh.bS>
	// 1461 2729:iand            
	// 1462 2730:putfield        #71  <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 1463 2733:aload_0         
	// 1464 2734:getfield        #12  <Field azh a>
	// 1465 2737:astore_1        
		abyte0.bS = ((azh) (abyte0)).aq ^ a.bS;
	// 1466 2738:aload_1         
	// 1467 2739:aload_1         
	// 1468 2740:getfield        #190 <Field int azh.aq>
	// 1469 2743:aload_0         
	// 1470 2744:getfield        #12  <Field azh a>
	// 1471 2747:getfield        #71  <Field int azh.bS>
	// 1472 2750:ixor            
	// 1473 2751:putfield        #71  <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 1474 2754:aload_0         
	// 1475 2755:getfield        #12  <Field azh a>
	// 1476 2758:astore_1        
		abyte0.cf = ((azh) (abyte0)).bS ^ a.cf;
	// 1477 2759:aload_1         
	// 1478 2760:aload_1         
	// 1479 2761:getfield        #71  <Field int azh.bS>
	// 1480 2764:aload_0         
	// 1481 2765:getfield        #12  <Field azh a>
	// 1482 2768:getfield        #193 <Field int azh.cf>
	// 1483 2771:ixor            
	// 1484 2772:putfield        #193 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 1485 2775:aload_0         
	// 1486 2776:getfield        #12  <Field azh a>
	// 1487 2779:astore_1        
		abyte0.cs = ((azh) (abyte0)).I & a.cs;
	// 1488 2780:aload_1         
	// 1489 2781:aload_1         
	// 1490 2782:getfield        #187 <Field int azh.I>
	// 1491 2785:aload_0         
	// 1492 2786:getfield        #12  <Field azh a>
	// 1493 2789:getfield        #65  <Field int azh.cs>
	// 1494 2792:iand            
	// 1495 2793:putfield        #65  <Field int azh.cs>
		abyte0 = ((byte []) (a));
	// 1496 2796:aload_0         
	// 1497 2797:getfield        #12  <Field azh a>
	// 1498 2800:astore_1        
		abyte0.cs = ((azh) (abyte0)).cE ^ a.cs;
	// 1499 2801:aload_1         
	// 1500 2802:aload_1         
	// 1501 2803:getfield        #89  <Field int azh.cE>
	// 1502 2806:aload_0         
	// 1503 2807:getfield        #12  <Field azh a>
	// 1504 2810:getfield        #65  <Field int azh.cs>
	// 1505 2813:ixor            
	// 1506 2814:putfield        #65  <Field int azh.cs>
		abyte0 = ((byte []) (a));
	// 1507 2817:aload_0         
	// 1508 2818:getfield        #12  <Field azh a>
	// 1509 2821:astore_1        
		abyte0.h = ((azh) (abyte0)).cs ^ a.h;
	// 1510 2822:aload_1         
	// 1511 2823:aload_1         
	// 1512 2824:getfield        #65  <Field int azh.cs>
	// 1513 2827:aload_0         
	// 1514 2828:getfield        #12  <Field azh a>
	// 1515 2831:getfield        #196 <Field int azh.h>
	// 1516 2834:ixor            
	// 1517 2835:putfield        #196 <Field int azh.h>
		abyte0 = ((byte []) (a));
	// 1518 2838:aload_0         
	// 1519 2839:getfield        #12  <Field azh a>
	// 1520 2842:astore_1        
		abyte0.am = ((azh) (abyte0)).I & ~a.am;
	// 1521 2843:aload_1         
	// 1522 2844:aload_1         
	// 1523 2845:getfield        #187 <Field int azh.I>
	// 1524 2848:aload_0         
	// 1525 2849:getfield        #12  <Field azh a>
	// 1526 2852:getfield        #77  <Field int azh.am>
	// 1527 2855:iconst_m1       
	// 1528 2856:ixor            
	// 1529 2857:iand            
	// 1530 2858:putfield        #77  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 1531 2861:aload_0         
	// 1532 2862:getfield        #12  <Field azh a>
	// 1533 2865:astore_1        
		abyte0.am = ((azh) (abyte0)).aw ^ a.am;
	// 1534 2866:aload_1         
	// 1535 2867:aload_1         
	// 1536 2868:getfield        #199 <Field int azh.aw>
	// 1537 2871:aload_0         
	// 1538 2872:getfield        #12  <Field azh a>
	// 1539 2875:getfield        #77  <Field int azh.am>
	// 1540 2878:ixor            
	// 1541 2879:putfield        #77  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 1542 2882:aload_0         
	// 1543 2883:getfield        #12  <Field azh a>
	// 1544 2886:astore_1        
		abyte0.V = ((azh) (abyte0)).am ^ a.V;
	// 1545 2887:aload_1         
	// 1546 2888:aload_1         
	// 1547 2889:getfield        #77  <Field int azh.am>
	// 1548 2892:aload_0         
	// 1549 2893:getfield        #12  <Field azh a>
	// 1550 2896:getfield        #202 <Field int azh.V>
	// 1551 2899:ixor            
	// 1552 2900:putfield        #202 <Field int azh.V>
		abyte0 = ((byte []) (a));
	// 1553 2903:aload_0         
	// 1554 2904:getfield        #12  <Field azh a>
	// 1555 2907:astore_1        
		abyte0.am = ((azh) (abyte0)).V & a.F;
	// 1556 2908:aload_1         
	// 1557 2909:aload_1         
	// 1558 2910:getfield        #202 <Field int azh.V>
	// 1559 2913:aload_0         
	// 1560 2914:getfield        #12  <Field azh a>
	// 1561 2917:getfield        #182 <Field int azh.F>
	// 1562 2920:iand            
	// 1563 2921:putfield        #77  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 1564 2924:aload_0         
	// 1565 2925:getfield        #12  <Field azh a>
	// 1566 2928:astore_1        
		abyte0.aw = ((azh) (abyte0)).V & a.F;
	// 1567 2929:aload_1         
	// 1568 2930:aload_1         
	// 1569 2931:getfield        #202 <Field int azh.V>
	// 1570 2934:aload_0         
	// 1571 2935:getfield        #12  <Field azh a>
	// 1572 2938:getfield        #182 <Field int azh.F>
	// 1573 2941:iand            
	// 1574 2942:putfield        #199 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 1575 2945:aload_0         
	// 1576 2946:getfield        #12  <Field azh a>
	// 1577 2949:astore_1        
		abyte0.cs = ((azh) (abyte0)).V & a.F;
	// 1578 2950:aload_1         
	// 1579 2951:aload_1         
	// 1580 2952:getfield        #202 <Field int azh.V>
	// 1581 2955:aload_0         
	// 1582 2956:getfield        #12  <Field azh a>
	// 1583 2959:getfield        #182 <Field int azh.F>
	// 1584 2962:iand            
	// 1585 2963:putfield        #65  <Field int azh.cs>
		abyte0 = ((byte []) (a));
	// 1586 2966:aload_0         
	// 1587 2967:getfield        #12  <Field azh a>
	// 1588 2970:astore_1        
		abyte0.cE = ((azh) (abyte0)).V & a.F;
	// 1589 2971:aload_1         
	// 1590 2972:aload_1         
	// 1591 2973:getfield        #202 <Field int azh.V>
	// 1592 2976:aload_0         
	// 1593 2977:getfield        #12  <Field azh a>
	// 1594 2980:getfield        #182 <Field int azh.F>
	// 1595 2983:iand            
	// 1596 2984:putfield        #89  <Field int azh.cE>
		abyte0 = ((byte []) (a));
	// 1597 2987:aload_0         
	// 1598 2988:getfield        #12  <Field azh a>
	// 1599 2991:astore_1        
		abyte0.bJ = ((azh) (abyte0)).I & ~a.bJ;
	// 1600 2992:aload_1         
	// 1601 2993:aload_1         
	// 1602 2994:getfield        #187 <Field int azh.I>
	// 1603 2997:aload_0         
	// 1604 2998:getfield        #12  <Field azh a>
	// 1605 3001:getfield        #35  <Field int azh.bJ>
	// 1606 3004:iconst_m1       
	// 1607 3005:ixor            
	// 1608 3006:iand            
	// 1609 3007:putfield        #35  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 1610 3010:aload_0         
	// 1611 3011:getfield        #12  <Field azh a>
	// 1612 3014:astore_1        
		abyte0.bJ = ((azh) (abyte0)).b ^ a.bJ;
	// 1613 3015:aload_1         
	// 1614 3016:aload_1         
	// 1615 3017:getfield        #32  <Field int azh.b>
	// 1616 3020:aload_0         
	// 1617 3021:getfield        #12  <Field azh a>
	// 1618 3024:getfield        #35  <Field int azh.bJ>
	// 1619 3027:ixor            
	// 1620 3028:putfield        #35  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 1621 3031:aload_0         
	// 1622 3032:getfield        #12  <Field azh a>
	// 1623 3035:astore_1        
		abyte0.v = ((azh) (abyte0)).bJ ^ a.v;
	// 1624 3036:aload_1         
	// 1625 3037:aload_1         
	// 1626 3038:getfield        #35  <Field int azh.bJ>
	// 1627 3041:aload_0         
	// 1628 3042:getfield        #12  <Field azh a>
	// 1629 3045:getfield        #110 <Field int azh.v>
	// 1630 3048:ixor            
	// 1631 3049:putfield        #110 <Field int azh.v>
		abyte0 = ((byte []) (a));
	// 1632 3052:aload_0         
	// 1633 3053:getfield        #12  <Field azh a>
	// 1634 3056:astore_1        
		abyte0.bJ = ((azh) (abyte0)).aG | a.v;
	// 1635 3057:aload_1         
	// 1636 3058:aload_1         
	// 1637 3059:getfield        #146 <Field int azh.aG>
	// 1638 3062:aload_0         
	// 1639 3063:getfield        #12  <Field azh a>
	// 1640 3066:getfield        #110 <Field int azh.v>
	// 1641 3069:ior             
	// 1642 3070:putfield        #35  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 1643 3073:aload_0         
	// 1644 3074:getfield        #12  <Field azh a>
	// 1645 3077:astore_1        
		abyte0.by = ((azh) (abyte0)).aa ^ a.by;
	// 1646 3078:aload_1         
	// 1647 3079:aload_1         
	// 1648 3080:getfield        #140 <Field int azh.aa>
	// 1649 3083:aload_0         
	// 1650 3084:getfield        #12  <Field azh a>
	// 1651 3087:getfield        #98  <Field int azh.by>
	// 1652 3090:ixor            
	// 1653 3091:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 1654 3094:aload_0         
	// 1655 3095:getfield        #12  <Field azh a>
	// 1656 3098:astore_1        
		abyte0.bT = ((azh) (abyte0)).by ^ a.bT;
	// 1657 3099:aload_1         
	// 1658 3100:aload_1         
	// 1659 3101:getfield        #98  <Field int azh.by>
	// 1660 3104:aload_0         
	// 1661 3105:getfield        #12  <Field azh a>
	// 1662 3108:getfield        #205 <Field int azh.bT>
	// 1663 3111:ixor            
	// 1664 3112:putfield        #205 <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 1665 3115:aload_0         
	// 1666 3116:getfield        #12  <Field azh a>
	// 1667 3119:astore_1        
		abyte0.bk = ((azh) (abyte0)).bk & a.bT;
	// 1668 3120:aload_1         
	// 1669 3121:aload_1         
	// 1670 3122:getfield        #208 <Field int azh.bk>
	// 1671 3125:aload_0         
	// 1672 3126:getfield        #12  <Field azh a>
	// 1673 3129:getfield        #205 <Field int azh.bT>
	// 1674 3132:iand            
	// 1675 3133:putfield        #208 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 1676 3136:aload_0         
	// 1677 3137:getfield        #12  <Field azh a>
	// 1678 3140:astore_1        
		abyte0.bk = ((azh) (abyte0)).cp ^ a.bk;
	// 1679 3141:aload_1         
	// 1680 3142:aload_1         
	// 1681 3143:getfield        #211 <Field int azh.cp>
	// 1682 3146:aload_0         
	// 1683 3147:getfield        #12  <Field azh a>
	// 1684 3150:getfield        #208 <Field int azh.bk>
	// 1685 3153:ixor            
	// 1686 3154:putfield        #208 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 1687 3157:aload_0         
	// 1688 3158:getfield        #12  <Field azh a>
	// 1689 3161:astore_1        
		abyte0.ai = ((azh) (abyte0)).ai & a.bT;
	// 1690 3162:aload_1         
	// 1691 3163:aload_1         
	// 1692 3164:getfield        #214 <Field int azh.ai>
	// 1693 3167:aload_0         
	// 1694 3168:getfield        #12  <Field azh a>
	// 1695 3171:getfield        #205 <Field int azh.bT>
	// 1696 3174:iand            
	// 1697 3175:putfield        #214 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 1698 3178:aload_0         
	// 1699 3179:getfield        #12  <Field azh a>
	// 1700 3182:astore_1        
		abyte0.ai = ((azh) (abyte0)).aT ^ a.ai;
	// 1701 3183:aload_1         
	// 1702 3184:aload_1         
	// 1703 3185:getfield        #217 <Field int azh.aT>
	// 1704 3188:aload_0         
	// 1705 3189:getfield        #12  <Field azh a>
	// 1706 3192:getfield        #214 <Field int azh.ai>
	// 1707 3195:ixor            
	// 1708 3196:putfield        #214 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 1709 3199:aload_0         
	// 1710 3200:getfield        #12  <Field azh a>
	// 1711 3203:astore_1        
		abyte0.ai = ((azh) (abyte0)).ai & ~a.c;
	// 1712 3204:aload_1         
	// 1713 3205:aload_1         
	// 1714 3206:getfield        #214 <Field int azh.ai>
	// 1715 3209:aload_0         
	// 1716 3210:getfield        #12  <Field azh a>
	// 1717 3213:getfield        #220 <Field int azh.c>
	// 1718 3216:iconst_m1       
	// 1719 3217:ixor            
	// 1720 3218:iand            
	// 1721 3219:putfield        #214 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 1722 3222:aload_0         
	// 1723 3223:getfield        #12  <Field azh a>
	// 1724 3226:astore_1        
		abyte0.ai = ((azh) (abyte0)).bk ^ a.ai;
	// 1725 3227:aload_1         
	// 1726 3228:aload_1         
	// 1727 3229:getfield        #208 <Field int azh.bk>
	// 1728 3232:aload_0         
	// 1729 3233:getfield        #12  <Field azh a>
	// 1730 3236:getfield        #214 <Field int azh.ai>
	// 1731 3239:ixor            
	// 1732 3240:putfield        #214 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 1733 3243:aload_0         
	// 1734 3244:getfield        #12  <Field azh a>
	// 1735 3247:astore_1        
		abyte0.bk = ((azh) (abyte0)).bT & ~a.aD;
	// 1736 3248:aload_1         
	// 1737 3249:aload_1         
	// 1738 3250:getfield        #205 <Field int azh.bT>
	// 1739 3253:aload_0         
	// 1740 3254:getfield        #12  <Field azh a>
	// 1741 3257:getfield        #223 <Field int azh.aD>
	// 1742 3260:iconst_m1       
	// 1743 3261:ixor            
	// 1744 3262:iand            
	// 1745 3263:putfield        #208 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 1746 3266:aload_0         
	// 1747 3267:getfield        #12  <Field azh a>
	// 1748 3270:astore_1        
		abyte0.bk = ((azh) (abyte0)).ct ^ a.bk;
	// 1749 3271:aload_1         
	// 1750 3272:aload_1         
	// 1751 3273:getfield        #226 <Field int azh.ct>
	// 1752 3276:aload_0         
	// 1753 3277:getfield        #12  <Field azh a>
	// 1754 3280:getfield        #208 <Field int azh.bk>
	// 1755 3283:ixor            
	// 1756 3284:putfield        #208 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 1757 3287:aload_0         
	// 1758 3288:getfield        #12  <Field azh a>
	// 1759 3291:astore_1        
		abyte0.bk = ((azh) (abyte0)).bk | a.c;
	// 1760 3292:aload_1         
	// 1761 3293:aload_1         
	// 1762 3294:getfield        #208 <Field int azh.bk>
	// 1763 3297:aload_0         
	// 1764 3298:getfield        #12  <Field azh a>
	// 1765 3301:getfield        #220 <Field int azh.c>
	// 1766 3304:ior             
	// 1767 3305:putfield        #208 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 1768 3308:aload_0         
	// 1769 3309:getfield        #12  <Field azh a>
	// 1770 3312:astore_1        
		abyte0.ct = ((azh) (abyte0)).bT & ~a.bM;
	// 1771 3313:aload_1         
	// 1772 3314:aload_1         
	// 1773 3315:getfield        #205 <Field int azh.bT>
	// 1774 3318:aload_0         
	// 1775 3319:getfield        #12  <Field azh a>
	// 1776 3322:getfield        #229 <Field int azh.bM>
	// 1777 3325:iconst_m1       
	// 1778 3326:ixor            
	// 1779 3327:iand            
	// 1780 3328:putfield        #226 <Field int azh.ct>
		abyte0 = ((byte []) (a));
	// 1781 3331:aload_0         
	// 1782 3332:getfield        #12  <Field azh a>
	// 1783 3335:astore_1        
		abyte0.ct = ((azh) (abyte0)).t ^ a.ct;
	// 1784 3336:aload_1         
	// 1785 3337:aload_1         
	// 1786 3338:getfield        #232 <Field int azh.t>
	// 1787 3341:aload_0         
	// 1788 3342:getfield        #12  <Field azh a>
	// 1789 3345:getfield        #226 <Field int azh.ct>
	// 1790 3348:ixor            
	// 1791 3349:putfield        #226 <Field int azh.ct>
		abyte0 = ((byte []) (a));
	// 1792 3352:aload_0         
	// 1793 3353:getfield        #12  <Field azh a>
	// 1794 3356:astore_1        
		abyte0.ct = ((azh) (abyte0)).ct | a.c;
	// 1795 3357:aload_1         
	// 1796 3358:aload_1         
	// 1797 3359:getfield        #226 <Field int azh.ct>
	// 1798 3362:aload_0         
	// 1799 3363:getfield        #12  <Field azh a>
	// 1800 3366:getfield        #220 <Field int azh.c>
	// 1801 3369:ior             
	// 1802 3370:putfield        #226 <Field int azh.ct>
		abyte0 = ((byte []) (a));
	// 1803 3373:aload_0         
	// 1804 3374:getfield        #12  <Field azh a>
	// 1805 3377:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bT & ~a.aQ;
	// 1806 3378:aload_1         
	// 1807 3379:aload_1         
	// 1808 3380:getfield        #205 <Field int azh.bT>
	// 1809 3383:aload_0         
	// 1810 3384:getfield        #12  <Field azh a>
	// 1811 3387:getfield        #235 <Field int azh.aQ>
	// 1812 3390:iconst_m1       
	// 1813 3391:ixor            
	// 1814 3392:iand            
	// 1815 3393:putfield        #235 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 1816 3396:aload_0         
	// 1817 3397:getfield        #12  <Field azh a>
	// 1818 3400:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bM ^ a.aQ;
	// 1819 3401:aload_1         
	// 1820 3402:aload_1         
	// 1821 3403:getfield        #229 <Field int azh.bM>
	// 1822 3406:aload_0         
	// 1823 3407:getfield        #12  <Field azh a>
	// 1824 3410:getfield        #235 <Field int azh.aQ>
	// 1825 3413:ixor            
	// 1826 3414:putfield        #235 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 1827 3417:aload_0         
	// 1828 3418:getfield        #12  <Field azh a>
	// 1829 3421:astore_1        
		abyte0.aQ = ((azh) (abyte0)).c & a.aQ;
	// 1830 3422:aload_1         
	// 1831 3423:aload_1         
	// 1832 3424:getfield        #220 <Field int azh.c>
	// 1833 3427:aload_0         
	// 1834 3428:getfield        #12  <Field azh a>
	// 1835 3431:getfield        #235 <Field int azh.aQ>
	// 1836 3434:iand            
	// 1837 3435:putfield        #235 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 1838 3438:aload_0         
	// 1839 3439:getfield        #12  <Field azh a>
	// 1840 3442:astore_1        
		abyte0.ae = ((azh) (abyte0)).ae & a.bT;
	// 1841 3443:aload_1         
	// 1842 3444:aload_1         
	// 1843 3445:getfield        #238 <Field int azh.ae>
	// 1844 3448:aload_0         
	// 1845 3449:getfield        #12  <Field azh a>
	// 1846 3452:getfield        #205 <Field int azh.bT>
	// 1847 3455:iand            
	// 1848 3456:putfield        #238 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 1849 3459:aload_0         
	// 1850 3460:getfield        #12  <Field azh a>
	// 1851 3463:astore_1        
		abyte0.ae = ((azh) (abyte0)).O ^ a.ae;
	// 1852 3464:aload_1         
	// 1853 3465:aload_1         
	// 1854 3466:getfield        #241 <Field int azh.O>
	// 1855 3469:aload_0         
	// 1856 3470:getfield        #12  <Field azh a>
	// 1857 3473:getfield        #238 <Field int azh.ae>
	// 1858 3476:ixor            
	// 1859 3477:putfield        #238 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 1860 3480:aload_0         
	// 1861 3481:getfield        #12  <Field azh a>
	// 1862 3484:astore_1        
		abyte0.cp = ((azh) (abyte0)).bT | a.cp;
	// 1863 3485:aload_1         
	// 1864 3486:aload_1         
	// 1865 3487:getfield        #205 <Field int azh.bT>
	// 1866 3490:aload_0         
	// 1867 3491:getfield        #12  <Field azh a>
	// 1868 3494:getfield        #211 <Field int azh.cp>
	// 1869 3497:ior             
	// 1870 3498:putfield        #211 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 1871 3501:aload_0         
	// 1872 3502:getfield        #12  <Field azh a>
	// 1873 3505:astore_1        
		abyte0.cp = ((azh) (abyte0)).aD ^ a.cp;
	// 1874 3506:aload_1         
	// 1875 3507:aload_1         
	// 1876 3508:getfield        #223 <Field int azh.aD>
	// 1877 3511:aload_0         
	// 1878 3512:getfield        #12  <Field azh a>
	// 1879 3515:getfield        #211 <Field int azh.cp>
	// 1880 3518:ixor            
	// 1881 3519:putfield        #211 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 1882 3522:aload_0         
	// 1883 3523:getfield        #12  <Field azh a>
	// 1884 3526:astore_1        
		abyte0.bk = ((azh) (abyte0)).cp ^ a.bk;
	// 1885 3527:aload_1         
	// 1886 3528:aload_1         
	// 1887 3529:getfield        #211 <Field int azh.cp>
	// 1888 3532:aload_0         
	// 1889 3533:getfield        #12  <Field azh a>
	// 1890 3536:getfield        #208 <Field int azh.bk>
	// 1891 3539:ixor            
	// 1892 3540:putfield        #208 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 1893 3543:aload_0         
	// 1894 3544:getfield        #12  <Field azh a>
	// 1895 3547:astore_1        
		abyte0.aQ = ((azh) (abyte0)).cp ^ a.aQ;
	// 1896 3548:aload_1         
	// 1897 3549:aload_1         
	// 1898 3550:getfield        #211 <Field int azh.cp>
	// 1899 3553:aload_0         
	// 1900 3554:getfield        #12  <Field azh a>
	// 1901 3557:getfield        #235 <Field int azh.aQ>
	// 1902 3560:ixor            
	// 1903 3561:putfield        #235 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 1904 3564:aload_0         
	// 1905 3565:getfield        #12  <Field azh a>
	// 1906 3568:astore_1        
		abyte0.aY = ((azh) (abyte0)).aY ^ a.bT;
	// 1907 3569:aload_1         
	// 1908 3570:aload_1         
	// 1909 3571:getfield        #244 <Field int azh.aY>
	// 1910 3574:aload_0         
	// 1911 3575:getfield        #12  <Field azh a>
	// 1912 3578:getfield        #205 <Field int azh.bT>
	// 1913 3581:ixor            
	// 1914 3582:putfield        #244 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 1915 3585:aload_0         
	// 1916 3586:getfield        #12  <Field azh a>
	// 1917 3589:astore_1        
		abyte0.ct = ((azh) (abyte0)).aY ^ a.ct;
	// 1918 3590:aload_1         
	// 1919 3591:aload_1         
	// 1920 3592:getfield        #244 <Field int azh.aY>
	// 1921 3595:aload_0         
	// 1922 3596:getfield        #12  <Field azh a>
	// 1923 3599:getfield        #226 <Field int azh.ct>
	// 1924 3602:ixor            
	// 1925 3603:putfield        #226 <Field int azh.ct>
		abyte0 = ((byte []) (a));
	// 1926 3606:aload_0         
	// 1927 3607:getfield        #12  <Field azh a>
	// 1928 3610:astore_1        
		abyte0.cl = ((azh) (abyte0)).bT & a.cl;
	// 1929 3611:aload_1         
	// 1930 3612:aload_1         
	// 1931 3613:getfield        #205 <Field int azh.bT>
	// 1932 3616:aload_0         
	// 1933 3617:getfield        #12  <Field azh a>
	// 1934 3620:getfield        #247 <Field int azh.cl>
	// 1935 3623:iand            
	// 1936 3624:putfield        #247 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 1937 3627:aload_0         
	// 1938 3628:getfield        #12  <Field azh a>
	// 1939 3631:astore_1        
		abyte0.cl = ((azh) (abyte0)).aT ^ a.cl;
	// 1940 3632:aload_1         
	// 1941 3633:aload_1         
	// 1942 3634:getfield        #217 <Field int azh.aT>
	// 1943 3637:aload_0         
	// 1944 3638:getfield        #12  <Field azh a>
	// 1945 3641:getfield        #247 <Field int azh.cl>
	// 1946 3644:ixor            
	// 1947 3645:putfield        #247 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 1948 3648:aload_0         
	// 1949 3649:getfield        #12  <Field azh a>
	// 1950 3652:astore_1        
		abyte0.cl = ((azh) (abyte0)).cl | a.c;
	// 1951 3653:aload_1         
	// 1952 3654:aload_1         
	// 1953 3655:getfield        #247 <Field int azh.cl>
	// 1954 3658:aload_0         
	// 1955 3659:getfield        #12  <Field azh a>
	// 1956 3662:getfield        #220 <Field int azh.c>
	// 1957 3665:ior             
	// 1958 3666:putfield        #247 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 1959 3669:aload_0         
	// 1960 3670:getfield        #12  <Field azh a>
	// 1961 3673:astore_1        
		abyte0.cl = ((azh) (abyte0)).ae ^ a.cl;
	// 1962 3674:aload_1         
	// 1963 3675:aload_1         
	// 1964 3676:getfield        #238 <Field int azh.ae>
	// 1965 3679:aload_0         
	// 1966 3680:getfield        #12  <Field azh a>
	// 1967 3683:getfield        #247 <Field int azh.cl>
	// 1968 3686:ixor            
	// 1969 3687:putfield        #247 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 1970 3690:aload_0         
	// 1971 3691:getfield        #12  <Field azh a>
	// 1972 3694:astore_1        
		abyte0.ae = ((azh) (abyte0)).t & ~a.bT;
	// 1973 3695:aload_1         
	// 1974 3696:aload_1         
	// 1975 3697:getfield        #232 <Field int azh.t>
	// 1976 3700:aload_0         
	// 1977 3701:getfield        #12  <Field azh a>
	// 1978 3704:getfield        #205 <Field int azh.bT>
	// 1979 3707:iconst_m1       
	// 1980 3708:ixor            
	// 1981 3709:iand            
	// 1982 3710:putfield        #238 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 1983 3713:aload_0         
	// 1984 3714:getfield        #12  <Field azh a>
	// 1985 3717:astore_1        
		abyte0.ae = ((azh) (abyte0)).c | a.ae;
	// 1986 3718:aload_1         
	// 1987 3719:aload_1         
	// 1988 3720:getfield        #220 <Field int azh.c>
	// 1989 3723:aload_0         
	// 1990 3724:getfield        #12  <Field azh a>
	// 1991 3727:getfield        #238 <Field int azh.ae>
	// 1992 3730:ior             
	// 1993 3731:putfield        #238 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 1994 3734:aload_0         
	// 1995 3735:getfield        #12  <Field azh a>
	// 1996 3738:astore_1        
		abyte0.aT = ((azh) (abyte0)).bT & ~a.aT;
	// 1997 3739:aload_1         
	// 1998 3740:aload_1         
	// 1999 3741:getfield        #205 <Field int azh.bT>
	// 2000 3744:aload_0         
	// 2001 3745:getfield        #12  <Field azh a>
	// 2002 3748:getfield        #217 <Field int azh.aT>
	// 2003 3751:iconst_m1       
	// 2004 3752:ixor            
	// 2005 3753:iand            
	// 2006 3754:putfield        #217 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 2007 3757:aload_0         
	// 2008 3758:getfield        #12  <Field azh a>
	// 2009 3761:astore_1        
		abyte0.aT = ((azh) (abyte0)).aR ^ a.aT;
	// 2010 3762:aload_1         
	// 2011 3763:aload_1         
	// 2012 3764:getfield        #250 <Field int azh.aR>
	// 2013 3767:aload_0         
	// 2014 3768:getfield        #12  <Field azh a>
	// 2015 3771:getfield        #217 <Field int azh.aT>
	// 2016 3774:ixor            
	// 2017 3775:putfield        #217 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 2018 3778:aload_0         
	// 2019 3779:getfield        #12  <Field azh a>
	// 2020 3782:astore_1        
		abyte0.ae = ((azh) (abyte0)).aT ^ a.ae;
	// 2021 3783:aload_1         
	// 2022 3784:aload_1         
	// 2023 3785:getfield        #217 <Field int azh.aT>
	// 2024 3788:aload_0         
	// 2025 3789:getfield        #12  <Field azh a>
	// 2026 3792:getfield        #238 <Field int azh.ae>
	// 2027 3795:ixor            
	// 2028 3796:putfield        #238 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 2029 3799:aload_0         
	// 2030 3800:getfield        #12  <Field azh a>
	// 2031 3803:astore_1        
		abyte0.aT = ((azh) (abyte0)).bT & ~a.y;
	// 2032 3804:aload_1         
	// 2033 3805:aload_1         
	// 2034 3806:getfield        #205 <Field int azh.bT>
	// 2035 3809:aload_0         
	// 2036 3810:getfield        #12  <Field azh a>
	// 2037 3813:getfield        #253 <Field int azh.y>
	// 2038 3816:iconst_m1       
	// 2039 3817:ixor            
	// 2040 3818:iand            
	// 2041 3819:putfield        #217 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 2042 3822:aload_0         
	// 2043 3823:getfield        #12  <Field azh a>
	// 2044 3826:astore_1        
		abyte0.aT = ((azh) (abyte0)).au ^ a.aT;
	// 2045 3827:aload_1         
	// 2046 3828:aload_1         
	// 2047 3829:getfield        #256 <Field int azh.au>
	// 2048 3832:aload_0         
	// 2049 3833:getfield        #12  <Field azh a>
	// 2050 3836:getfield        #217 <Field int azh.aT>
	// 2051 3839:ixor            
	// 2052 3840:putfield        #217 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 2053 3843:aload_0         
	// 2054 3844:getfield        #12  <Field azh a>
	// 2055 3847:astore_1        
		abyte0.aT = ((azh) (abyte0)).aT & ~a.c;
	// 2056 3848:aload_1         
	// 2057 3849:aload_1         
	// 2058 3850:getfield        #217 <Field int azh.aT>
	// 2059 3853:aload_0         
	// 2060 3854:getfield        #12  <Field azh a>
	// 2061 3857:getfield        #220 <Field int azh.c>
	// 2062 3860:iconst_m1       
	// 2063 3861:ixor            
	// 2064 3862:iand            
	// 2065 3863:putfield        #217 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 2066 3866:aload_0         
	// 2067 3867:getfield        #12  <Field azh a>
	// 2068 3870:astore_1        
		abyte0.t = ((azh) (abyte0)).t ^ a.bT;
	// 2069 3871:aload_1         
	// 2070 3872:aload_1         
	// 2071 3873:getfield        #232 <Field int azh.t>
	// 2072 3876:aload_0         
	// 2073 3877:getfield        #12  <Field azh a>
	// 2074 3880:getfield        #205 <Field int azh.bT>
	// 2075 3883:ixor            
	// 2076 3884:putfield        #232 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 2077 3887:aload_0         
	// 2078 3888:getfield        #12  <Field azh a>
	// 2079 3891:astore_1        
		abyte0.aT = ((azh) (abyte0)).t ^ a.aT;
	// 2080 3892:aload_1         
	// 2081 3893:aload_1         
	// 2082 3894:getfield        #232 <Field int azh.t>
	// 2083 3897:aload_0         
	// 2084 3898:getfield        #12  <Field azh a>
	// 2085 3901:getfield        #217 <Field int azh.aT>
	// 2086 3904:ixor            
	// 2087 3905:putfield        #217 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 2088 3908:aload_0         
	// 2089 3909:getfield        #12  <Field azh a>
	// 2090 3912:astore_1        
		abyte0.bG = ((azh) (abyte0)).bT & ~a.bG;
	// 2091 3913:aload_1         
	// 2092 3914:aload_1         
	// 2093 3915:getfield        #205 <Field int azh.bT>
	// 2094 3918:aload_0         
	// 2095 3919:getfield        #12  <Field azh a>
	// 2096 3922:getfield        #259 <Field int azh.bG>
	// 2097 3925:iconst_m1       
	// 2098 3926:ixor            
	// 2099 3927:iand            
	// 2100 3928:putfield        #259 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 2101 3931:aload_0         
	// 2102 3932:getfield        #12  <Field azh a>
	// 2103 3935:astore_1        
		abyte0.bG = ((azh) (abyte0)).cc ^ a.bG;
	// 2104 3936:aload_1         
	// 2105 3937:aload_1         
	// 2106 3938:getfield        #262 <Field int azh.cc>
	// 2107 3941:aload_0         
	// 2108 3942:getfield        #12  <Field azh a>
	// 2109 3945:getfield        #259 <Field int azh.bG>
	// 2110 3948:ixor            
	// 2111 3949:putfield        #259 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 2112 3952:aload_0         
	// 2113 3953:getfield        #12  <Field azh a>
	// 2114 3956:astore_1        
		abyte0.bG = ((azh) (abyte0)).c | a.bG;
	// 2115 3957:aload_1         
	// 2116 3958:aload_1         
	// 2117 3959:getfield        #220 <Field int azh.c>
	// 2118 3962:aload_0         
	// 2119 3963:getfield        #12  <Field azh a>
	// 2120 3966:getfield        #259 <Field int azh.bG>
	// 2121 3969:ior             
	// 2122 3970:putfield        #259 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 2123 3973:aload_0         
	// 2124 3974:getfield        #12  <Field azh a>
	// 2125 3977:astore_1        
		abyte0.cB = ((azh) (abyte0)).bT & a.cB;
	// 2126 3978:aload_1         
	// 2127 3979:aload_1         
	// 2128 3980:getfield        #205 <Field int azh.bT>
	// 2129 3983:aload_0         
	// 2130 3984:getfield        #12  <Field azh a>
	// 2131 3987:getfield        #265 <Field int azh.cB>
	// 2132 3990:iand            
	// 2133 3991:putfield        #265 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 2134 3994:aload_0         
	// 2135 3995:getfield        #12  <Field azh a>
	// 2136 3998:astore_1        
		abyte0.cB = ((azh) (abyte0)).cD ^ a.cB;
	// 2137 3999:aload_1         
	// 2138 4000:aload_1         
	// 2139 4001:getfield        #268 <Field int azh.cD>
	// 2140 4004:aload_0         
	// 2141 4005:getfield        #12  <Field azh a>
	// 2142 4008:getfield        #265 <Field int azh.cB>
	// 2143 4011:ixor            
	// 2144 4012:putfield        #265 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 2145 4015:aload_0         
	// 2146 4016:getfield        #12  <Field azh a>
	// 2147 4019:astore_1        
		abyte0.bG = ((azh) (abyte0)).cB ^ a.bG;
	// 2148 4020:aload_1         
	// 2149 4021:aload_1         
	// 2150 4022:getfield        #265 <Field int azh.cB>
	// 2151 4025:aload_0         
	// 2152 4026:getfield        #12  <Field azh a>
	// 2153 4029:getfield        #259 <Field int azh.bG>
	// 2154 4032:ixor            
	// 2155 4033:putfield        #259 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 2156 4036:aload_0         
	// 2157 4037:getfield        #12  <Field azh a>
	// 2158 4040:astore_1        
		abyte0.cB = ((azh) (abyte0)).H & ~a.f;
	// 2159 4041:aload_1         
	// 2160 4042:aload_1         
	// 2161 4043:getfield        #131 <Field int azh.H>
	// 2162 4046:aload_0         
	// 2163 4047:getfield        #12  <Field azh a>
	// 2164 4050:getfield        #107 <Field int azh.f>
	// 2165 4053:iconst_m1       
	// 2166 4054:ixor            
	// 2167 4055:iand            
	// 2168 4056:putfield        #265 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 2169 4059:aload_0         
	// 2170 4060:getfield        #12  <Field azh a>
	// 2171 4063:astore_1        
		abyte0.cD = ((azh) (abyte0)).H & ~a.f;
	// 2172 4064:aload_1         
	// 2173 4065:aload_1         
	// 2174 4066:getfield        #131 <Field int azh.H>
	// 2175 4069:aload_0         
	// 2176 4070:getfield        #12  <Field azh a>
	// 2177 4073:getfield        #107 <Field int azh.f>
	// 2178 4076:iconst_m1       
	// 2179 4077:ixor            
	// 2180 4078:iand            
	// 2181 4079:putfield        #268 <Field int azh.cD>
		abyte0 = ((byte []) (a));
	// 2182 4082:aload_0         
	// 2183 4083:getfield        #12  <Field azh a>
	// 2184 4086:astore_1        
		abyte0.cD = ((azh) (abyte0)).bs ^ a.cD;
	// 2185 4087:aload_1         
	// 2186 4088:aload_1         
	// 2187 4089:getfield        #95  <Field int azh.bs>
	// 2188 4092:aload_0         
	// 2189 4093:getfield        #12  <Field azh a>
	// 2190 4096:getfield        #268 <Field int azh.cD>
	// 2191 4099:ixor            
	// 2192 4100:putfield        #268 <Field int azh.cD>
		abyte0 = ((byte []) (a));
	// 2193 4103:aload_0         
	// 2194 4104:getfield        #12  <Field azh a>
	// 2195 4107:astore_1        
		abyte0.cD = ((azh) (abyte0)).cD & ~a.br;
	// 2196 4108:aload_1         
	// 2197 4109:aload_1         
	// 2198 4110:getfield        #268 <Field int azh.cD>
	// 2199 4113:aload_0         
	// 2200 4114:getfield        #12  <Field azh a>
	// 2201 4117:getfield        #128 <Field int azh.br>
	// 2202 4120:iconst_m1       
	// 2203 4121:ixor            
	// 2204 4122:iand            
	// 2205 4123:putfield        #268 <Field int azh.cD>
		abyte0 = ((byte []) (a));
	// 2206 4126:aload_0         
	// 2207 4127:getfield        #12  <Field azh a>
	// 2208 4130:astore_1        
		abyte0.cc = ((azh) (abyte0)).bY | a.f;
	// 2209 4131:aload_1         
	// 2210 4132:aload_1         
	// 2211 4133:getfield        #122 <Field int azh.bY>
	// 2212 4136:aload_0         
	// 2213 4137:getfield        #12  <Field azh a>
	// 2214 4140:getfield        #107 <Field int azh.f>
	// 2215 4143:ior             
	// 2216 4144:putfield        #262 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 2217 4147:aload_0         
	// 2218 4148:getfield        #12  <Field azh a>
	// 2219 4151:astore_1        
		abyte0.t = ((azh) (abyte0)).H & ~a.cc;
	// 2220 4152:aload_1         
	// 2221 4153:aload_1         
	// 2222 4154:getfield        #131 <Field int azh.H>
	// 2223 4157:aload_0         
	// 2224 4158:getfield        #12  <Field azh a>
	// 2225 4161:getfield        #262 <Field int azh.cc>
	// 2226 4164:iconst_m1       
	// 2227 4165:ixor            
	// 2228 4166:iand            
	// 2229 4167:putfield        #232 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 2230 4170:aload_0         
	// 2231 4171:getfield        #12  <Field azh a>
	// 2232 4174:astore_1        
		abyte0.au = ((azh) (abyte0)).H & ~a.cc;
	// 2233 4175:aload_1         
	// 2234 4176:aload_1         
	// 2235 4177:getfield        #131 <Field int azh.H>
	// 2236 4180:aload_0         
	// 2237 4181:getfield        #12  <Field azh a>
	// 2238 4184:getfield        #262 <Field int azh.cc>
	// 2239 4187:iconst_m1       
	// 2240 4188:ixor            
	// 2241 4189:iand            
	// 2242 4190:putfield        #256 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 2243 4193:aload_0         
	// 2244 4194:getfield        #12  <Field azh a>
	// 2245 4197:astore_1        
		abyte0.au = ((azh) (abyte0)).bs ^ a.au;
	// 2246 4198:aload_1         
	// 2247 4199:aload_1         
	// 2248 4200:getfield        #95  <Field int azh.bs>
	// 2249 4203:aload_0         
	// 2250 4204:getfield        #12  <Field azh a>
	// 2251 4207:getfield        #256 <Field int azh.au>
	// 2252 4210:ixor            
	// 2253 4211:putfield        #256 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 2254 4214:aload_0         
	// 2255 4215:getfield        #12  <Field azh a>
	// 2256 4218:astore_1        
		abyte0.bs = ((azh) (abyte0)).H & ~a.cc;
	// 2257 4219:aload_1         
	// 2258 4220:aload_1         
	// 2259 4221:getfield        #131 <Field int azh.H>
	// 2260 4224:aload_0         
	// 2261 4225:getfield        #12  <Field azh a>
	// 2262 4228:getfield        #262 <Field int azh.cc>
	// 2263 4231:iconst_m1       
	// 2264 4232:ixor            
	// 2265 4233:iand            
	// 2266 4234:putfield        #95  <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 2267 4237:aload_0         
	// 2268 4238:getfield        #12  <Field azh a>
	// 2269 4241:astore_1        
		abyte0.bs = ((azh) (abyte0)).cc ^ a.bs;
	// 2270 4242:aload_1         
	// 2271 4243:aload_1         
	// 2272 4244:getfield        #262 <Field int azh.cc>
	// 2273 4247:aload_0         
	// 2274 4248:getfield        #12  <Field azh a>
	// 2275 4251:getfield        #95  <Field int azh.bs>
	// 2276 4254:ixor            
	// 2277 4255:putfield        #95  <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 2278 4258:aload_0         
	// 2279 4259:getfield        #12  <Field azh a>
	// 2280 4262:astore_1        
		abyte0.cc = ((azh) (abyte0)).bY & a.f;
	// 2281 4263:aload_1         
	// 2282 4264:aload_1         
	// 2283 4265:getfield        #122 <Field int azh.bY>
	// 2284 4268:aload_0         
	// 2285 4269:getfield        #12  <Field azh a>
	// 2286 4272:getfield        #107 <Field int azh.f>
	// 2287 4275:iand            
	// 2288 4276:putfield        #262 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 2289 4279:aload_0         
	// 2290 4280:getfield        #12  <Field azh a>
	// 2291 4283:astore_1        
		abyte0.aR = ((azh) (abyte0)).f & ~a.bY;
	// 2292 4284:aload_1         
	// 2293 4285:aload_1         
	// 2294 4286:getfield        #107 <Field int azh.f>
	// 2295 4289:aload_0         
	// 2296 4290:getfield        #12  <Field azh a>
	// 2297 4293:getfield        #122 <Field int azh.bY>
	// 2298 4296:iconst_m1       
	// 2299 4297:ixor            
	// 2300 4298:iand            
	// 2301 4299:putfield        #250 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 2302 4302:aload_0         
	// 2303 4303:getfield        #12  <Field azh a>
	// 2304 4306:astore_1        
		abyte0.cD = ((azh) (abyte0)).aR ^ a.cD;
	// 2305 4307:aload_1         
	// 2306 4308:aload_1         
	// 2307 4309:getfield        #250 <Field int azh.aR>
	// 2308 4312:aload_0         
	// 2309 4313:getfield        #12  <Field azh a>
	// 2310 4316:getfield        #268 <Field int azh.cD>
	// 2311 4319:ixor            
	// 2312 4320:putfield        #268 <Field int azh.cD>
		abyte0 = ((byte []) (a));
	// 2313 4323:aload_0         
	// 2314 4324:getfield        #12  <Field azh a>
	// 2315 4327:astore_1        
		abyte0.cD = ((azh) (abyte0)).Z | a.cD;
	// 2316 4328:aload_1         
	// 2317 4329:aload_1         
	// 2318 4330:getfield        #137 <Field int azh.Z>
	// 2319 4333:aload_0         
	// 2320 4334:getfield        #12  <Field azh a>
	// 2321 4337:getfield        #268 <Field int azh.cD>
	// 2322 4340:ior             
	// 2323 4341:putfield        #268 <Field int azh.cD>
		abyte0 = ((byte []) (a));
	// 2324 4344:aload_0         
	// 2325 4345:getfield        #12  <Field azh a>
	// 2326 4348:astore_1        
		abyte0.cD = ((azh) (abyte0)).X ^ a.cD;
	// 2327 4349:aload_1         
	// 2328 4350:aload_1         
	// 2329 4351:getfield        #125 <Field int azh.X>
	// 2330 4354:aload_0         
	// 2331 4355:getfield        #12  <Field azh a>
	// 2332 4358:getfield        #268 <Field int azh.cD>
	// 2333 4361:ixor            
	// 2334 4362:putfield        #268 <Field int azh.cD>
		abyte0 = ((byte []) (a));
	// 2335 4365:aload_0         
	// 2336 4366:getfield        #12  <Field azh a>
	// 2337 4369:astore_1        
		abyte0.X = ((azh) (abyte0)).H & ~a.aR;
	// 2338 4370:aload_1         
	// 2339 4371:aload_1         
	// 2340 4372:getfield        #131 <Field int azh.H>
	// 2341 4375:aload_0         
	// 2342 4376:getfield        #12  <Field azh a>
	// 2343 4379:getfield        #250 <Field int azh.aR>
	// 2344 4382:iconst_m1       
	// 2345 4383:ixor            
	// 2346 4384:iand            
	// 2347 4385:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 2348 4388:aload_0         
	// 2349 4389:getfield        #12  <Field azh a>
	// 2350 4392:astore_1        
		abyte0.X = ((azh) (abyte0)).aR ^ a.X;
	// 2351 4393:aload_1         
	// 2352 4394:aload_1         
	// 2353 4395:getfield        #250 <Field int azh.aR>
	// 2354 4398:aload_0         
	// 2355 4399:getfield        #12  <Field azh a>
	// 2356 4402:getfield        #125 <Field int azh.X>
	// 2357 4405:ixor            
	// 2358 4406:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 2359 4409:aload_0         
	// 2360 4410:getfield        #12  <Field azh a>
	// 2361 4413:astore_1        
		abyte0.X = ((azh) (abyte0)).br & ~a.X;
	// 2362 4414:aload_1         
	// 2363 4415:aload_1         
	// 2364 4416:getfield        #128 <Field int azh.br>
	// 2365 4419:aload_0         
	// 2366 4420:getfield        #12  <Field azh a>
	// 2367 4423:getfield        #125 <Field int azh.X>
	// 2368 4426:iconst_m1       
	// 2369 4427:ixor            
	// 2370 4428:iand            
	// 2371 4429:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 2372 4432:aload_0         
	// 2373 4433:getfield        #12  <Field azh a>
	// 2374 4436:astore_1        
		abyte0.X = ((azh) (abyte0)).bO ^ a.X;
	// 2375 4437:aload_1         
	// 2376 4438:aload_1         
	// 2377 4439:getfield        #53  <Field int azh.bO>
	// 2378 4442:aload_0         
	// 2379 4443:getfield        #12  <Field azh a>
	// 2380 4446:getfield        #125 <Field int azh.X>
	// 2381 4449:ixor            
	// 2382 4450:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 2383 4453:aload_0         
	// 2384 4454:getfield        #12  <Field azh a>
	// 2385 4457:astore_1        
		abyte0.X = ((azh) (abyte0)).Z | a.X;
	// 2386 4458:aload_1         
	// 2387 4459:aload_1         
	// 2388 4460:getfield        #137 <Field int azh.Z>
	// 2389 4463:aload_0         
	// 2390 4464:getfield        #12  <Field azh a>
	// 2391 4467:getfield        #125 <Field int azh.X>
	// 2392 4470:ior             
	// 2393 4471:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 2394 4474:aload_0         
	// 2395 4475:getfield        #12  <Field azh a>
	// 2396 4478:astore_1        
		abyte0.bO = ((azh) (abyte0)).f & ~a.aR;
	// 2397 4479:aload_1         
	// 2398 4480:aload_1         
	// 2399 4481:getfield        #107 <Field int azh.f>
	// 2400 4484:aload_0         
	// 2401 4485:getfield        #12  <Field azh a>
	// 2402 4488:getfield        #250 <Field int azh.aR>
	// 2403 4491:iconst_m1       
	// 2404 4492:ixor            
	// 2405 4493:iand            
	// 2406 4494:putfield        #53  <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 2407 4497:aload_0         
	// 2408 4498:getfield        #12  <Field azh a>
	// 2409 4501:astore_1        
		abyte0.aY = ((azh) (abyte0)).br | a.bO;
	// 2410 4502:aload_1         
	// 2411 4503:aload_1         
	// 2412 4504:getfield        #128 <Field int azh.br>
	// 2413 4507:aload_0         
	// 2414 4508:getfield        #12  <Field azh a>
	// 2415 4511:getfield        #53  <Field int azh.bO>
	// 2416 4514:ior             
	// 2417 4515:putfield        #244 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 2418 4518:aload_0         
	// 2419 4519:getfield        #12  <Field azh a>
	// 2420 4522:astore_1        
		abyte0.aN = ((azh) (abyte0)).bO ^ a.aN;
	// 2421 4523:aload_1         
	// 2422 4524:aload_1         
	// 2423 4525:getfield        #53  <Field int azh.bO>
	// 2424 4528:aload_0         
	// 2425 4529:getfield        #12  <Field azh a>
	// 2426 4532:getfield        #271 <Field int azh.aN>
	// 2427 4535:ixor            
	// 2428 4536:putfield        #271 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 2429 4539:aload_0         
	// 2430 4540:getfield        #12  <Field azh a>
	// 2431 4543:astore_1        
		abyte0.cv = ((azh) (abyte0)).aN ^ a.cv;
	// 2432 4544:aload_1         
	// 2433 4545:aload_1         
	// 2434 4546:getfield        #271 <Field int azh.aN>
	// 2435 4549:aload_0         
	// 2436 4550:getfield        #12  <Field azh a>
	// 2437 4553:getfield        #47  <Field int azh.cv>
	// 2438 4556:ixor            
	// 2439 4557:putfield        #47  <Field int azh.cv>
		abyte0 = ((byte []) (a));
	// 2440 4560:aload_0         
	// 2441 4561:getfield        #12  <Field azh a>
	// 2442 4564:astore_1        
		abyte0.aN = ((azh) (abyte0)).H & a.aR;
	// 2443 4565:aload_1         
	// 2444 4566:aload_1         
	// 2445 4567:getfield        #131 <Field int azh.H>
	// 2446 4570:aload_0         
	// 2447 4571:getfield        #12  <Field azh a>
	// 2448 4574:getfield        #250 <Field int azh.aR>
	// 2449 4577:iand            
	// 2450 4578:putfield        #271 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 2451 4581:aload_0         
	// 2452 4582:getfield        #12  <Field azh a>
	// 2453 4585:astore_1        
		abyte0.aN = ((azh) (abyte0)).aR ^ a.aN;
	// 2454 4586:aload_1         
	// 2455 4587:aload_1         
	// 2456 4588:getfield        #250 <Field int azh.aR>
	// 2457 4591:aload_0         
	// 2458 4592:getfield        #12  <Field azh a>
	// 2459 4595:getfield        #271 <Field int azh.aN>
	// 2460 4598:ixor            
	// 2461 4599:putfield        #271 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 2462 4602:aload_0         
	// 2463 4603:getfield        #12  <Field azh a>
	// 2464 4606:astore_1        
		abyte0.cp = ((azh) (abyte0)).aN & a.br;
	// 2465 4607:aload_1         
	// 2466 4608:aload_1         
	// 2467 4609:getfield        #271 <Field int azh.aN>
	// 2468 4612:aload_0         
	// 2469 4613:getfield        #12  <Field azh a>
	// 2470 4616:getfield        #128 <Field int azh.br>
	// 2471 4619:iand            
	// 2472 4620:putfield        #211 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 2473 4623:aload_0         
	// 2474 4624:getfield        #12  <Field azh a>
	// 2475 4627:astore_1        
		abyte0.cp = ((azh) (abyte0)).bO ^ a.cp;
	// 2476 4628:aload_1         
	// 2477 4629:aload_1         
	// 2478 4630:getfield        #53  <Field int azh.bO>
	// 2479 4633:aload_0         
	// 2480 4634:getfield        #12  <Field azh a>
	// 2481 4637:getfield        #211 <Field int azh.cp>
	// 2482 4640:ixor            
	// 2483 4641:putfield        #211 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 2484 4644:aload_0         
	// 2485 4645:getfield        #12  <Field azh a>
	// 2486 4648:astore_1        
		abyte0.cp = ((azh) (abyte0)).Z | a.cp;
	// 2487 4649:aload_1         
	// 2488 4650:aload_1         
	// 2489 4651:getfield        #137 <Field int azh.Z>
	// 2490 4654:aload_0         
	// 2491 4655:getfield        #12  <Field azh a>
	// 2492 4658:getfield        #211 <Field int azh.cp>
	// 2493 4661:ior             
	// 2494 4662:putfield        #211 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 2495 4665:aload_0         
	// 2496 4666:getfield        #12  <Field azh a>
	// 2497 4669:astore_1        
		abyte0.ao = ((azh) (abyte0)).aN ^ a.ao;
	// 2498 4670:aload_1         
	// 2499 4671:aload_1         
	// 2500 4672:getfield        #271 <Field int azh.aN>
	// 2501 4675:aload_0         
	// 2502 4676:getfield        #12  <Field azh a>
	// 2503 4679:getfield        #29  <Field int azh.ao>
	// 2504 4682:ixor            
	// 2505 4683:putfield        #29  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 2506 4686:aload_0         
	// 2507 4687:getfield        #12  <Field azh a>
	// 2508 4690:astore_1        
		abyte0.ao = ((azh) (abyte0)).Z | a.ao;
	// 2509 4691:aload_1         
	// 2510 4692:aload_1         
	// 2511 4693:getfield        #137 <Field int azh.Z>
	// 2512 4696:aload_0         
	// 2513 4697:getfield        #12  <Field azh a>
	// 2514 4700:getfield        #29  <Field int azh.ao>
	// 2515 4703:ior             
	// 2516 4704:putfield        #29  <Field int azh.ao>
		abyte0 = ((byte []) (a));
	// 2517 4707:aload_0         
	// 2518 4708:getfield        #12  <Field azh a>
	// 2519 4711:astore_1        
		abyte0.bO = ((azh) (abyte0)).br | a.aN;
	// 2520 4712:aload_1         
	// 2521 4713:aload_1         
	// 2522 4714:getfield        #128 <Field int azh.br>
	// 2523 4717:aload_0         
	// 2524 4718:getfield        #12  <Field azh a>
	// 2525 4721:getfield        #271 <Field int azh.aN>
	// 2526 4724:ior             
	// 2527 4725:putfield        #53  <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 2528 4728:aload_0         
	// 2529 4729:getfield        #12  <Field azh a>
	// 2530 4732:astore_1        
		abyte0.bO = ((azh) (abyte0)).bI ^ a.bO;
	// 2531 4733:aload_1         
	// 2532 4734:aload_1         
	// 2533 4735:getfield        #62  <Field int azh.bI>
	// 2534 4738:aload_0         
	// 2535 4739:getfield        #12  <Field azh a>
	// 2536 4742:getfield        #53  <Field int azh.bO>
	// 2537 4745:ixor            
	// 2538 4746:putfield        #53  <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 2539 4749:aload_0         
	// 2540 4750:getfield        #12  <Field azh a>
	// 2541 4753:astore_1        
		abyte0.cp = ((azh) (abyte0)).bO ^ a.cp;
	// 2542 4754:aload_1         
	// 2543 4755:aload_1         
	// 2544 4756:getfield        #53  <Field int azh.bO>
	// 2545 4759:aload_0         
	// 2546 4760:getfield        #12  <Field azh a>
	// 2547 4763:getfield        #211 <Field int azh.cp>
	// 2548 4766:ixor            
	// 2549 4767:putfield        #211 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 2550 4770:aload_0         
	// 2551 4771:getfield        #12  <Field azh a>
	// 2552 4774:astore_1        
		abyte0.aY = ((azh) (abyte0)).aN ^ a.aY;
	// 2553 4775:aload_1         
	// 2554 4776:aload_1         
	// 2555 4777:getfield        #271 <Field int azh.aN>
	// 2556 4780:aload_0         
	// 2557 4781:getfield        #12  <Field azh a>
	// 2558 4784:getfield        #244 <Field int azh.aY>
	// 2559 4787:ixor            
	// 2560 4788:putfield        #244 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 2561 4791:aload_0         
	// 2562 4792:getfield        #12  <Field azh a>
	// 2563 4795:astore_1        
		abyte0.aY = ((azh) (abyte0)).aY & ~a.Z;
	// 2564 4796:aload_1         
	// 2565 4797:aload_1         
	// 2566 4798:getfield        #244 <Field int azh.aY>
	// 2567 4801:aload_0         
	// 2568 4802:getfield        #12  <Field azh a>
	// 2569 4805:getfield        #137 <Field int azh.Z>
	// 2570 4808:iconst_m1       
	// 2571 4809:ixor            
	// 2572 4810:iand            
	// 2573 4811:putfield        #244 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 2574 4814:aload_0         
	// 2575 4815:getfield        #12  <Field azh a>
	// 2576 4818:astore_1        
		abyte0.aN = ((azh) (abyte0)).bY ^ a.f;
	// 2577 4819:aload_1         
	// 2578 4820:aload_1         
	// 2579 4821:getfield        #122 <Field int azh.bY>
	// 2580 4824:aload_0         
	// 2581 4825:getfield        #12  <Field azh a>
	// 2582 4828:getfield        #107 <Field int azh.f>
	// 2583 4831:ixor            
	// 2584 4832:putfield        #271 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 2585 4835:aload_0         
	// 2586 4836:getfield        #12  <Field azh a>
	// 2587 4839:astore_1        
		abyte0.aW = ((azh) (abyte0)).aN ^ a.aW;
	// 2588 4840:aload_1         
	// 2589 4841:aload_1         
	// 2590 4842:getfield        #271 <Field int azh.aN>
	// 2591 4845:aload_0         
	// 2592 4846:getfield        #12  <Field azh a>
	// 2593 4849:getfield        #68  <Field int azh.aW>
	// 2594 4852:ixor            
	// 2595 4853:putfield        #68  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 2596 4856:aload_0         
	// 2597 4857:getfield        #12  <Field azh a>
	// 2598 4860:astore_1        
		abyte0.aW = ((azh) (abyte0)).aW & ~a.br;
	// 2599 4861:aload_1         
	// 2600 4862:aload_1         
	// 2601 4863:getfield        #68  <Field int azh.aW>
	// 2602 4866:aload_0         
	// 2603 4867:getfield        #12  <Field azh a>
	// 2604 4870:getfield        #128 <Field int azh.br>
	// 2605 4873:iconst_m1       
	// 2606 4874:ixor            
	// 2607 4875:iand            
	// 2608 4876:putfield        #68  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 2609 4879:aload_0         
	// 2610 4880:getfield        #12  <Field azh a>
	// 2611 4883:astore_1        
		abyte0.aW = ((azh) (abyte0)).bs ^ a.aW;
	// 2612 4884:aload_1         
	// 2613 4885:aload_1         
	// 2614 4886:getfield        #95  <Field int azh.bs>
	// 2615 4889:aload_0         
	// 2616 4890:getfield        #12  <Field azh a>
	// 2617 4893:getfield        #68  <Field int azh.aW>
	// 2618 4896:ixor            
	// 2619 4897:putfield        #68  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 2620 4900:aload_0         
	// 2621 4901:getfield        #12  <Field azh a>
	// 2622 4904:astore_1        
		abyte0.aY = ((azh) (abyte0)).aW ^ a.aY;
	// 2623 4905:aload_1         
	// 2624 4906:aload_1         
	// 2625 4907:getfield        #68  <Field int azh.aW>
	// 2626 4910:aload_0         
	// 2627 4911:getfield        #12  <Field azh a>
	// 2628 4914:getfield        #244 <Field int azh.aY>
	// 2629 4917:ixor            
	// 2630 4918:putfield        #244 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 2631 4921:aload_0         
	// 2632 4922:getfield        #12  <Field azh a>
	// 2633 4925:astore_1        
		abyte0.aY = ((azh) (abyte0)).bt & ~a.aY;
	// 2634 4926:aload_1         
	// 2635 4927:aload_1         
	// 2636 4928:getfield        #274 <Field int azh.bt>
	// 2637 4931:aload_0         
	// 2638 4932:getfield        #12  <Field azh a>
	// 2639 4935:getfield        #244 <Field int azh.aY>
	// 2640 4938:iconst_m1       
	// 2641 4939:ixor            
	// 2642 4940:iand            
	// 2643 4941:putfield        #244 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 2644 4944:aload_0         
	// 2645 4945:getfield        #12  <Field azh a>
	// 2646 4948:astore_1        
		abyte0.aY = ((azh) (abyte0)).cp ^ a.aY;
	// 2647 4949:aload_1         
	// 2648 4950:aload_1         
	// 2649 4951:getfield        #211 <Field int azh.cp>
	// 2650 4954:aload_0         
	// 2651 4955:getfield        #12  <Field azh a>
	// 2652 4958:getfield        #244 <Field int azh.aY>
	// 2653 4961:ixor            
	// 2654 4962:putfield        #244 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 2655 4965:aload_0         
	// 2656 4966:getfield        #12  <Field azh a>
	// 2657 4969:astore_1        
		abyte0.bF = ((azh) (abyte0)).aY ^ a.bF;
	// 2658 4970:aload_1         
	// 2659 4971:aload_1         
	// 2660 4972:getfield        #244 <Field int azh.aY>
	// 2661 4975:aload_0         
	// 2662 4976:getfield        #12  <Field azh a>
	// 2663 4979:getfield        #277 <Field int azh.bF>
	// 2664 4982:ixor            
	// 2665 4983:putfield        #277 <Field int azh.bF>
		abyte0 = ((byte []) (a));
	// 2666 4986:aload_0         
	// 2667 4987:getfield        #12  <Field azh a>
	// 2668 4990:astore_1        
		abyte0.aY = ((azh) (abyte0)).A & a.bF;
	// 2669 4991:aload_1         
	// 2670 4992:aload_1         
	// 2671 4993:getfield        #26  <Field int azh.A>
	// 2672 4996:aload_0         
	// 2673 4997:getfield        #12  <Field azh a>
	// 2674 5000:getfield        #277 <Field int azh.bF>
	// 2675 5003:iand            
	// 2676 5004:putfield        #244 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 2677 5007:aload_0         
	// 2678 5008:getfield        #12  <Field azh a>
	// 2679 5011:astore_1        
		abyte0.aY = ((azh) (abyte0)).aY & ~a.I;
	// 2680 5012:aload_1         
	// 2681 5013:aload_1         
	// 2682 5014:getfield        #244 <Field int azh.aY>
	// 2683 5017:aload_0         
	// 2684 5018:getfield        #12  <Field azh a>
	// 2685 5021:getfield        #187 <Field int azh.I>
	// 2686 5024:iconst_m1       
	// 2687 5025:ixor            
	// 2688 5026:iand            
	// 2689 5027:putfield        #244 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 2690 5030:aload_0         
	// 2691 5031:getfield        #12  <Field azh a>
	// 2692 5034:astore_1        
		abyte0.aY = ((azh) (abyte0)).bb | a.aY;
	// 2693 5035:aload_1         
	// 2694 5036:aload_1         
	// 2695 5037:getfield        #280 <Field int azh.bb>
	// 2696 5040:aload_0         
	// 2697 5041:getfield        #12  <Field azh a>
	// 2698 5044:getfield        #244 <Field int azh.aY>
	// 2699 5047:ior             
	// 2700 5048:putfield        #244 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 2701 5051:aload_0         
	// 2702 5052:getfield        #12  <Field azh a>
	// 2703 5055:astore_1        
		abyte0.cp = ((azh) (abyte0)).k ^ a.bF;
	// 2704 5056:aload_1         
	// 2705 5057:aload_1         
	// 2706 5058:getfield        #283 <Field int azh.k>
	// 2707 5061:aload_0         
	// 2708 5062:getfield        #12  <Field azh a>
	// 2709 5065:getfield        #277 <Field int azh.bF>
	// 2710 5068:ixor            
	// 2711 5069:putfield        #211 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 2712 5072:aload_0         
	// 2713 5073:getfield        #12  <Field azh a>
	// 2714 5076:astore_1        
		abyte0.aW = ((azh) (abyte0)).A & a.cp;
	// 2715 5077:aload_1         
	// 2716 5078:aload_1         
	// 2717 5079:getfield        #26  <Field int azh.A>
	// 2718 5082:aload_0         
	// 2719 5083:getfield        #12  <Field azh a>
	// 2720 5086:getfield        #211 <Field int azh.cp>
	// 2721 5089:iand            
	// 2722 5090:putfield        #68  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 2723 5093:aload_0         
	// 2724 5094:getfield        #12  <Field azh a>
	// 2725 5097:astore_1        
		abyte0.bs = ((azh) (abyte0)).cp ^ a.A;
	// 2726 5098:aload_1         
	// 2727 5099:aload_1         
	// 2728 5100:getfield        #211 <Field int azh.cp>
	// 2729 5103:aload_0         
	// 2730 5104:getfield        #12  <Field azh a>
	// 2731 5107:getfield        #26  <Field int azh.A>
	// 2732 5110:ixor            
	// 2733 5111:putfield        #95  <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 2734 5114:aload_0         
	// 2735 5115:getfield        #12  <Field azh a>
	// 2736 5118:astore_1        
		abyte0.bO = ((azh) (abyte0)).k & ~a.bF;
	// 2737 5119:aload_1         
	// 2738 5120:aload_1         
	// 2739 5121:getfield        #283 <Field int azh.k>
	// 2740 5124:aload_0         
	// 2741 5125:getfield        #12  <Field azh a>
	// 2742 5128:getfield        #277 <Field int azh.bF>
	// 2743 5131:iconst_m1       
	// 2744 5132:ixor            
	// 2745 5133:iand            
	// 2746 5134:putfield        #53  <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 2747 5137:aload_0         
	// 2748 5138:getfield        #12  <Field azh a>
	// 2749 5141:astore_1        
		abyte0.bI = ((azh) (abyte0)).A & a.bO;
	// 2750 5142:aload_1         
	// 2751 5143:aload_1         
	// 2752 5144:getfield        #26  <Field int azh.A>
	// 2753 5147:aload_0         
	// 2754 5148:getfield        #12  <Field azh a>
	// 2755 5151:getfield        #53  <Field int azh.bO>
	// 2756 5154:iand            
	// 2757 5155:putfield        #62  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 2758 5158:aload_0         
	// 2759 5159:getfield        #12  <Field azh a>
	// 2760 5162:astore_1        
		abyte0.bI = ((azh) (abyte0)).k ^ a.bI;
	// 2761 5163:aload_1         
	// 2762 5164:aload_1         
	// 2763 5165:getfield        #283 <Field int azh.k>
	// 2764 5168:aload_0         
	// 2765 5169:getfield        #12  <Field azh a>
	// 2766 5172:getfield        #62  <Field int azh.bI>
	// 2767 5175:ixor            
	// 2768 5176:putfield        #62  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 2769 5179:aload_0         
	// 2770 5180:getfield        #12  <Field azh a>
	// 2771 5183:astore_1        
		abyte0.aD = ((azh) (abyte0)).bI | a.I;
	// 2772 5184:aload_1         
	// 2773 5185:aload_1         
	// 2774 5186:getfield        #62  <Field int azh.bI>
	// 2775 5189:aload_0         
	// 2776 5190:getfield        #12  <Field azh a>
	// 2777 5193:getfield        #187 <Field int azh.I>
	// 2778 5196:ior             
	// 2779 5197:putfield        #223 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 2780 5200:aload_0         
	// 2781 5201:getfield        #12  <Field azh a>
	// 2782 5204:astore_1        
		abyte0.aD = ((azh) (abyte0)).k ^ a.aD;
	// 2783 5205:aload_1         
	// 2784 5206:aload_1         
	// 2785 5207:getfield        #283 <Field int azh.k>
	// 2786 5210:aload_0         
	// 2787 5211:getfield        #12  <Field azh a>
	// 2788 5214:getfield        #223 <Field int azh.aD>
	// 2789 5217:ixor            
	// 2790 5218:putfield        #223 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 2791 5221:aload_0         
	// 2792 5222:getfield        #12  <Field azh a>
	// 2793 5225:astore_1        
		abyte0.aD = ((azh) (abyte0)).bb | a.aD;
	// 2794 5226:aload_1         
	// 2795 5227:aload_1         
	// 2796 5228:getfield        #280 <Field int azh.bb>
	// 2797 5231:aload_0         
	// 2798 5232:getfield        #12  <Field azh a>
	// 2799 5235:getfield        #223 <Field int azh.aD>
	// 2800 5238:ior             
	// 2801 5239:putfield        #223 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 2802 5242:aload_0         
	// 2803 5243:getfield        #12  <Field azh a>
	// 2804 5246:astore_1        
		abyte0.bM = ((azh) (abyte0)).A & a.bO;
	// 2805 5247:aload_1         
	// 2806 5248:aload_1         
	// 2807 5249:getfield        #26  <Field int azh.A>
	// 2808 5252:aload_0         
	// 2809 5253:getfield        #12  <Field azh a>
	// 2810 5256:getfield        #53  <Field int azh.bO>
	// 2811 5259:iand            
	// 2812 5260:putfield        #229 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 2813 5263:aload_0         
	// 2814 5264:getfield        #12  <Field azh a>
	// 2815 5267:astore_1        
		abyte0.by = ((azh) (abyte0)).I & ~a.bM;
	// 2816 5268:aload_1         
	// 2817 5269:aload_1         
	// 2818 5270:getfield        #187 <Field int azh.I>
	// 2819 5273:aload_0         
	// 2820 5274:getfield        #12  <Field azh a>
	// 2821 5277:getfield        #229 <Field int azh.bM>
	// 2822 5280:iconst_m1       
	// 2823 5281:ixor            
	// 2824 5282:iand            
	// 2825 5283:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 2826 5286:aload_0         
	// 2827 5287:getfield        #12  <Field azh a>
	// 2828 5290:astore_1        
		abyte0.by = ((azh) (abyte0)).k ^ a.by;
	// 2829 5291:aload_1         
	// 2830 5292:aload_1         
	// 2831 5293:getfield        #283 <Field int azh.k>
	// 2832 5296:aload_0         
	// 2833 5297:getfield        #12  <Field azh a>
	// 2834 5300:getfield        #98  <Field int azh.by>
	// 2835 5303:ixor            
	// 2836 5304:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 2837 5307:aload_0         
	// 2838 5308:getfield        #12  <Field azh a>
	// 2839 5311:astore_1        
		abyte0.aa = ((azh) (abyte0)).I & ~a.bM;
	// 2840 5312:aload_1         
	// 2841 5313:aload_1         
	// 2842 5314:getfield        #187 <Field int azh.I>
	// 2843 5317:aload_0         
	// 2844 5318:getfield        #12  <Field azh a>
	// 2845 5321:getfield        #229 <Field int azh.bM>
	// 2846 5324:iconst_m1       
	// 2847 5325:ixor            
	// 2848 5326:iand            
	// 2849 5327:putfield        #140 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 2850 5330:aload_0         
	// 2851 5331:getfield        #12  <Field azh a>
	// 2852 5334:astore_1        
		abyte0.aa = ((azh) (abyte0)).cp ^ a.aa;
	// 2853 5335:aload_1         
	// 2854 5336:aload_1         
	// 2855 5337:getfield        #211 <Field int azh.cp>
	// 2856 5340:aload_0         
	// 2857 5341:getfield        #12  <Field azh a>
	// 2858 5344:getfield        #140 <Field int azh.aa>
	// 2859 5347:ixor            
	// 2860 5348:putfield        #140 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 2861 5351:aload_0         
	// 2862 5352:getfield        #12  <Field azh a>
	// 2863 5355:astore_1        
		abyte0.bM = ((azh) (abyte0)).I & a.bM;
	// 2864 5356:aload_1         
	// 2865 5357:aload_1         
	// 2866 5358:getfield        #187 <Field int azh.I>
	// 2867 5361:aload_0         
	// 2868 5362:getfield        #12  <Field azh a>
	// 2869 5365:getfield        #229 <Field int azh.bM>
	// 2870 5368:iand            
	// 2871 5369:putfield        #229 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 2872 5372:aload_0         
	// 2873 5373:getfield        #12  <Field azh a>
	// 2874 5376:astore_1        
		abyte0.bM = ((azh) (abyte0)).A ^ a.bM;
	// 2875 5377:aload_1         
	// 2876 5378:aload_1         
	// 2877 5379:getfield        #26  <Field int azh.A>
	// 2878 5382:aload_0         
	// 2879 5383:getfield        #12  <Field azh a>
	// 2880 5386:getfield        #229 <Field int azh.bM>
	// 2881 5389:ixor            
	// 2882 5390:putfield        #229 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 2883 5393:aload_0         
	// 2884 5394:getfield        #12  <Field azh a>
	// 2885 5397:astore_1        
		abyte0.bM = ((azh) (abyte0)).bM & ~a.bb;
	// 2886 5398:aload_1         
	// 2887 5399:aload_1         
	// 2888 5400:getfield        #229 <Field int azh.bM>
	// 2889 5403:aload_0         
	// 2890 5404:getfield        #12  <Field azh a>
	// 2891 5407:getfield        #280 <Field int azh.bb>
	// 2892 5410:iconst_m1       
	// 2893 5411:ixor            
	// 2894 5412:iand            
	// 2895 5413:putfield        #229 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 2896 5416:aload_0         
	// 2897 5417:getfield        #12  <Field azh a>
	// 2898 5420:astore_1        
		abyte0.bM = ((azh) (abyte0)).aa ^ a.bM;
	// 2899 5421:aload_1         
	// 2900 5422:aload_1         
	// 2901 5423:getfield        #140 <Field int azh.aa>
	// 2902 5426:aload_0         
	// 2903 5427:getfield        #12  <Field azh a>
	// 2904 5430:getfield        #229 <Field int azh.bM>
	// 2905 5433:ixor            
	// 2906 5434:putfield        #229 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 2907 5437:aload_0         
	// 2908 5438:getfield        #12  <Field azh a>
	// 2909 5441:astore_1        
		abyte0.aa = ((azh) (abyte0)).A & ~a.bO;
	// 2910 5442:aload_1         
	// 2911 5443:aload_1         
	// 2912 5444:getfield        #26  <Field int azh.A>
	// 2913 5447:aload_0         
	// 2914 5448:getfield        #12  <Field azh a>
	// 2915 5451:getfield        #53  <Field int azh.bO>
	// 2916 5454:iconst_m1       
	// 2917 5455:ixor            
	// 2918 5456:iand            
	// 2919 5457:putfield        #140 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 2920 5460:aload_0         
	// 2921 5461:getfield        #12  <Field azh a>
	// 2922 5464:astore_1        
		abyte0.aa = ((azh) (abyte0)).bF ^ a.aa;
	// 2923 5465:aload_1         
	// 2924 5466:aload_1         
	// 2925 5467:getfield        #277 <Field int azh.bF>
	// 2926 5470:aload_0         
	// 2927 5471:getfield        #12  <Field azh a>
	// 2928 5474:getfield        #140 <Field int azh.aa>
	// 2929 5477:ixor            
	// 2930 5478:putfield        #140 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 2931 5481:aload_0         
	// 2932 5482:getfield        #12  <Field azh a>
	// 2933 5485:astore_1        
		abyte0.b = ((azh) (abyte0)).A & ~a.bF;
	// 2934 5486:aload_1         
	// 2935 5487:aload_1         
	// 2936 5488:getfield        #26  <Field int azh.A>
	// 2937 5491:aload_0         
	// 2938 5492:getfield        #12  <Field azh a>
	// 2939 5495:getfield        #277 <Field int azh.bF>
	// 2940 5498:iconst_m1       
	// 2941 5499:ixor            
	// 2942 5500:iand            
	// 2943 5501:putfield        #32  <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 2944 5504:aload_0         
	// 2945 5505:getfield        #12  <Field azh a>
	// 2946 5508:astore_1        
		abyte0.b = ((azh) (abyte0)).bF ^ a.b;
	// 2947 5509:aload_1         
	// 2948 5510:aload_1         
	// 2949 5511:getfield        #277 <Field int azh.bF>
	// 2950 5514:aload_0         
	// 2951 5515:getfield        #12  <Field azh a>
	// 2952 5518:getfield        #32  <Field int azh.b>
	// 2953 5521:ixor            
	// 2954 5522:putfield        #32  <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 2955 5525:aload_0         
	// 2956 5526:getfield        #12  <Field azh a>
	// 2957 5529:astore_1        
		abyte0.bS = ((azh) (abyte0)).b & ~a.I;
	// 2958 5530:aload_1         
	// 2959 5531:aload_1         
	// 2960 5532:getfield        #32  <Field int azh.b>
	// 2961 5535:aload_0         
	// 2962 5536:getfield        #12  <Field azh a>
	// 2963 5539:getfield        #187 <Field int azh.I>
	// 2964 5542:iconst_m1       
	// 2965 5543:ixor            
	// 2966 5544:iand            
	// 2967 5545:putfield        #71  <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 2968 5548:aload_0         
	// 2969 5549:getfield        #12  <Field azh a>
	// 2970 5552:astore_1        
		abyte0.bS = ((azh) (abyte0)).A ^ a.bS;
	// 2971 5553:aload_1         
	// 2972 5554:aload_1         
	// 2973 5555:getfield        #26  <Field int azh.A>
	// 2974 5558:aload_0         
	// 2975 5559:getfield        #12  <Field azh a>
	// 2976 5562:getfield        #71  <Field int azh.bS>
	// 2977 5565:ixor            
	// 2978 5566:putfield        #71  <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 2979 5569:aload_0         
	// 2980 5570:getfield        #12  <Field azh a>
	// 2981 5573:astore_1        
		abyte0.bS = ((azh) (abyte0)).bb | a.bS;
	// 2982 5574:aload_1         
	// 2983 5575:aload_1         
	// 2984 5576:getfield        #280 <Field int azh.bb>
	// 2985 5579:aload_0         
	// 2986 5580:getfield        #12  <Field azh a>
	// 2987 5583:getfield        #71  <Field int azh.bS>
	// 2988 5586:ior             
	// 2989 5587:putfield        #71  <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 2990 5590:aload_0         
	// 2991 5591:getfield        #12  <Field azh a>
	// 2992 5594:astore_1        
		abyte0.b = ((azh) (abyte0)).b & ~a.I;
	// 2993 5595:aload_1         
	// 2994 5596:aload_1         
	// 2995 5597:getfield        #32  <Field int azh.b>
	// 2996 5600:aload_0         
	// 2997 5601:getfield        #12  <Field azh a>
	// 2998 5604:getfield        #187 <Field int azh.I>
	// 2999 5607:iconst_m1       
	// 3000 5608:ixor            
	// 3001 5609:iand            
	// 3002 5610:putfield        #32  <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 3003 5613:aload_0         
	// 3004 5614:getfield        #12  <Field azh a>
	// 3005 5617:astore_1        
		abyte0.ct = ((azh) (abyte0)).bF & ~a.ct;
	// 3006 5618:aload_1         
	// 3007 5619:aload_1         
	// 3008 5620:getfield        #277 <Field int azh.bF>
	// 3009 5623:aload_0         
	// 3010 5624:getfield        #12  <Field azh a>
	// 3011 5627:getfield        #226 <Field int azh.ct>
	// 3012 5630:iconst_m1       
	// 3013 5631:ixor            
	// 3014 5632:iand            
	// 3015 5633:putfield        #226 <Field int azh.ct>
		abyte0 = ((byte []) (a));
	// 3016 5636:aload_0         
	// 3017 5637:getfield        #12  <Field azh a>
	// 3018 5640:astore_1        
		abyte0.ct = ((azh) (abyte0)).aQ ^ a.ct;
	// 3019 5641:aload_1         
	// 3020 5642:aload_1         
	// 3021 5643:getfield        #235 <Field int azh.aQ>
	// 3022 5646:aload_0         
	// 3023 5647:getfield        #12  <Field azh a>
	// 3024 5650:getfield        #226 <Field int azh.ct>
	// 3025 5653:ixor            
	// 3026 5654:putfield        #226 <Field int azh.ct>
		abyte0 = ((byte []) (a));
	// 3027 5657:aload_0         
	// 3028 5658:getfield        #12  <Field azh a>
	// 3029 5661:astore_1        
		abyte0.L = ((azh) (abyte0)).ct ^ a.L;
	// 3030 5662:aload_1         
	// 3031 5663:aload_1         
	// 3032 5664:getfield        #226 <Field int azh.ct>
	// 3033 5667:aload_0         
	// 3034 5668:getfield        #12  <Field azh a>
	// 3035 5671:getfield        #113 <Field int azh.L>
	// 3036 5674:ixor            
	// 3037 5675:putfield        #113 <Field int azh.L>
		abyte0 = ((byte []) (a));
	// 3038 5678:aload_0         
	// 3039 5679:getfield        #12  <Field azh a>
	// 3040 5682:astore_1        
		abyte0.ct = ((azh) (abyte0)).h ^ a.L;
	// 3041 5683:aload_1         
	// 3042 5684:aload_1         
	// 3043 5685:getfield        #196 <Field int azh.h>
	// 3044 5688:aload_0         
	// 3045 5689:getfield        #12  <Field azh a>
	// 3046 5692:getfield        #113 <Field int azh.L>
	// 3047 5695:ixor            
	// 3048 5696:putfield        #226 <Field int azh.ct>
		abyte0 = ((byte []) (a));
	// 3049 5699:aload_0         
	// 3050 5700:getfield        #12  <Field azh a>
	// 3051 5703:astore_1        
		abyte0.aQ = ((azh) (abyte0)).h & a.L;
	// 3052 5704:aload_1         
	// 3053 5705:aload_1         
	// 3054 5706:getfield        #196 <Field int azh.h>
	// 3055 5709:aload_0         
	// 3056 5710:getfield        #12  <Field azh a>
	// 3057 5713:getfield        #113 <Field int azh.L>
	// 3058 5716:iand            
	// 3059 5717:putfield        #235 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 3060 5720:aload_0         
	// 3061 5721:getfield        #12  <Field azh a>
	// 3062 5724:astore_1        
		abyte0.aq = ((azh) (abyte0)).L & ~a.aQ;
	// 3063 5725:aload_1         
	// 3064 5726:aload_1         
	// 3065 5727:getfield        #113 <Field int azh.L>
	// 3066 5730:aload_0         
	// 3067 5731:getfield        #12  <Field azh a>
	// 3068 5734:getfield        #235 <Field int azh.aQ>
	// 3069 5737:iconst_m1       
	// 3070 5738:ixor            
	// 3071 5739:iand            
	// 3072 5740:putfield        #190 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 3073 5743:aload_0         
	// 3074 5744:getfield        #12  <Field azh a>
	// 3075 5747:astore_1        
		abyte0.aX = ((azh) (abyte0)).L & ~a.h;
	// 3076 5748:aload_1         
	// 3077 5749:aload_1         
	// 3078 5750:getfield        #113 <Field int azh.L>
	// 3079 5753:aload_0         
	// 3080 5754:getfield        #12  <Field azh a>
	// 3081 5757:getfield        #196 <Field int azh.h>
	// 3082 5760:iconst_m1       
	// 3083 5761:ixor            
	// 3084 5762:iand            
	// 3085 5763:putfield        #101 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 3086 5766:aload_0         
	// 3087 5767:getfield        #12  <Field azh a>
	// 3088 5770:astore_1        
		abyte0.at = ((azh) (abyte0)).h | a.L;
	// 3089 5771:aload_1         
	// 3090 5772:aload_1         
	// 3091 5773:getfield        #196 <Field int azh.h>
	// 3092 5776:aload_0         
	// 3093 5777:getfield        #12  <Field azh a>
	// 3094 5780:getfield        #113 <Field int azh.L>
	// 3095 5783:ior             
	// 3096 5784:putfield        #86  <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 3097 5787:aload_0         
	// 3098 5788:getfield        #12  <Field azh a>
	// 3099 5791:astore_1        
		abyte0.bx = ((azh) (abyte0)).at & ~a.L;
	// 3100 5792:aload_1         
	// 3101 5793:aload_1         
	// 3102 5794:getfield        #86  <Field int azh.at>
	// 3103 5797:aload_0         
	// 3104 5798:getfield        #12  <Field azh a>
	// 3105 5801:getfield        #113 <Field int azh.L>
	// 3106 5804:iconst_m1       
	// 3107 5805:ixor            
	// 3108 5806:iand            
	// 3109 5807:putfield        #92  <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 3110 5810:aload_0         
	// 3111 5811:getfield        #12  <Field azh a>
	// 3112 5814:astore_1        
		abyte0.cq = ((azh) (abyte0)).h & ~a.L;
	// 3113 5815:aload_1         
	// 3114 5816:aload_1         
	// 3115 5817:getfield        #196 <Field int azh.h>
	// 3116 5820:aload_0         
	// 3117 5821:getfield        #12  <Field azh a>
	// 3118 5824:getfield        #113 <Field int azh.L>
	// 3119 5827:iconst_m1       
	// 3120 5828:ixor            
	// 3121 5829:iand            
	// 3122 5830:putfield        #179 <Field int azh.cq>
		abyte0 = ((byte []) (a));
	// 3123 5833:aload_0         
	// 3124 5834:getfield        #12  <Field azh a>
	// 3125 5837:astore_1        
		abyte0.cl = ((azh) (abyte0)).bF & ~a.cl;
	// 3126 5838:aload_1         
	// 3127 5839:aload_1         
	// 3128 5840:getfield        #277 <Field int azh.bF>
	// 3129 5843:aload_0         
	// 3130 5844:getfield        #12  <Field azh a>
	// 3131 5847:getfield        #247 <Field int azh.cl>
	// 3132 5850:iconst_m1       
	// 3133 5851:ixor            
	// 3134 5852:iand            
	// 3135 5853:putfield        #247 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 3136 5856:aload_0         
	// 3137 5857:getfield        #12  <Field azh a>
	// 3138 5860:astore_1        
		abyte0.cl = ((azh) (abyte0)).bk ^ a.cl;
	// 3139 5861:aload_1         
	// 3140 5862:aload_1         
	// 3141 5863:getfield        #208 <Field int azh.bk>
	// 3142 5866:aload_0         
	// 3143 5867:getfield        #12  <Field azh a>
	// 3144 5870:getfield        #247 <Field int azh.cl>
	// 3145 5873:ixor            
	// 3146 5874:putfield        #247 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 3147 5877:aload_0         
	// 3148 5878:getfield        #12  <Field azh a>
	// 3149 5881:astore_1        
		abyte0.aL = ((azh) (abyte0)).cl ^ a.aL;
	// 3150 5882:aload_1         
	// 3151 5883:aload_1         
	// 3152 5884:getfield        #247 <Field int azh.cl>
	// 3153 5887:aload_0         
	// 3154 5888:getfield        #12  <Field azh a>
	// 3155 5891:getfield        #286 <Field int azh.aL>
	// 3156 5894:ixor            
	// 3157 5895:putfield        #286 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 3158 5898:aload_0         
	// 3159 5899:getfield        #12  <Field azh a>
	// 3160 5902:astore_1        
		abyte0.cl = ((azh) (abyte0)).bF & a.k;
	// 3161 5903:aload_1         
	// 3162 5904:aload_1         
	// 3163 5905:getfield        #277 <Field int azh.bF>
	// 3164 5908:aload_0         
	// 3165 5909:getfield        #12  <Field azh a>
	// 3166 5912:getfield        #283 <Field int azh.k>
	// 3167 5915:iand            
	// 3168 5916:putfield        #247 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 3169 5919:aload_0         
	// 3170 5920:getfield        #12  <Field azh a>
	// 3171 5923:astore_1        
		abyte0.cl = ((azh) (abyte0)).A & a.cl;
	// 3172 5924:aload_1         
	// 3173 5925:aload_1         
	// 3174 5926:getfield        #26  <Field int azh.A>
	// 3175 5929:aload_0         
	// 3176 5930:getfield        #12  <Field azh a>
	// 3177 5933:getfield        #247 <Field int azh.cl>
	// 3178 5936:iand            
	// 3179 5937:putfield        #247 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 3180 5940:aload_0         
	// 3181 5941:getfield        #12  <Field azh a>
	// 3182 5944:astore_1        
		abyte0.cl = ((azh) (abyte0)).bO ^ a.cl;
	// 3183 5945:aload_1         
	// 3184 5946:aload_1         
	// 3185 5947:getfield        #53  <Field int azh.bO>
	// 3186 5950:aload_0         
	// 3187 5951:getfield        #12  <Field azh a>
	// 3188 5954:getfield        #247 <Field int azh.cl>
	// 3189 5957:ixor            
	// 3190 5958:putfield        #247 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 3191 5961:aload_0         
	// 3192 5962:getfield        #12  <Field azh a>
	// 3193 5965:astore_1        
		abyte0.cl = ((azh) (abyte0)).I & a.cl;
	// 3194 5966:aload_1         
	// 3195 5967:aload_1         
	// 3196 5968:getfield        #187 <Field int azh.I>
	// 3197 5971:aload_0         
	// 3198 5972:getfield        #12  <Field azh a>
	// 3199 5975:getfield        #247 <Field int azh.cl>
	// 3200 5978:iand            
	// 3201 5979:putfield        #247 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 3202 5982:aload_0         
	// 3203 5983:getfield        #12  <Field azh a>
	// 3204 5986:astore_1        
		abyte0.bk = ((azh) (abyte0)).k | a.bF;
	// 3205 5987:aload_1         
	// 3206 5988:aload_1         
	// 3207 5989:getfield        #283 <Field int azh.k>
	// 3208 5992:aload_0         
	// 3209 5993:getfield        #12  <Field azh a>
	// 3210 5996:getfield        #277 <Field int azh.bF>
	// 3211 5999:ior             
	// 3212 6000:putfield        #208 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 3213 6003:aload_0         
	// 3214 6004:getfield        #12  <Field azh a>
	// 3215 6007:astore_1        
		abyte0.ck = ((azh) (abyte0)).A & ~a.bk;
	// 3216 6008:aload_1         
	// 3217 6009:aload_1         
	// 3218 6010:getfield        #26  <Field int azh.A>
	// 3219 6013:aload_0         
	// 3220 6014:getfield        #12  <Field azh a>
	// 3221 6017:getfield        #208 <Field int azh.bk>
	// 3222 6020:iconst_m1       
	// 3223 6021:ixor            
	// 3224 6022:iand            
	// 3225 6023:putfield        #143 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 3226 6026:aload_0         
	// 3227 6027:getfield        #12  <Field azh a>
	// 3228 6030:astore_1        
		abyte0.ck = ((azh) (abyte0)).bO ^ a.ck;
	// 3229 6031:aload_1         
	// 3230 6032:aload_1         
	// 3231 6033:getfield        #53  <Field int azh.bO>
	// 3232 6036:aload_0         
	// 3233 6037:getfield        #12  <Field azh a>
	// 3234 6040:getfield        #143 <Field int azh.ck>
	// 3235 6043:ixor            
	// 3236 6044:putfield        #143 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 3237 6047:aload_0         
	// 3238 6048:getfield        #12  <Field azh a>
	// 3239 6051:astore_1        
		abyte0.ck = ((azh) (abyte0)).ck & ~a.I;
	// 3240 6052:aload_1         
	// 3241 6053:aload_1         
	// 3242 6054:getfield        #143 <Field int azh.ck>
	// 3243 6057:aload_0         
	// 3244 6058:getfield        #12  <Field azh a>
	// 3245 6061:getfield        #187 <Field int azh.I>
	// 3246 6064:iconst_m1       
	// 3247 6065:ixor            
	// 3248 6066:iand            
	// 3249 6067:putfield        #143 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 3250 6070:aload_0         
	// 3251 6071:getfield        #12  <Field azh a>
	// 3252 6074:astore_1        
		abyte0.bO = ((azh) (abyte0)).bk ^ a.A;
	// 3253 6075:aload_1         
	// 3254 6076:aload_1         
	// 3255 6077:getfield        #208 <Field int azh.bk>
	// 3256 6080:aload_0         
	// 3257 6081:getfield        #12  <Field azh a>
	// 3258 6084:getfield        #26  <Field int azh.A>
	// 3259 6087:ixor            
	// 3260 6088:putfield        #53  <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 3261 6091:aload_0         
	// 3262 6092:getfield        #12  <Field azh a>
	// 3263 6095:astore_1        
		abyte0.cl = ((azh) (abyte0)).bO ^ a.cl;
	// 3264 6096:aload_1         
	// 3265 6097:aload_1         
	// 3266 6098:getfield        #53  <Field int azh.bO>
	// 3267 6101:aload_0         
	// 3268 6102:getfield        #12  <Field azh a>
	// 3269 6105:getfield        #247 <Field int azh.cl>
	// 3270 6108:ixor            
	// 3271 6109:putfield        #247 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 3272 6112:aload_0         
	// 3273 6113:getfield        #12  <Field azh a>
	// 3274 6116:astore_1        
		abyte0.aD = ((azh) (abyte0)).cl ^ a.aD;
	// 3275 6117:aload_1         
	// 3276 6118:aload_1         
	// 3277 6119:getfield        #247 <Field int azh.cl>
	// 3278 6122:aload_0         
	// 3279 6123:getfield        #12  <Field azh a>
	// 3280 6126:getfield        #223 <Field int azh.aD>
	// 3281 6129:ixor            
	// 3282 6130:putfield        #223 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 3283 6133:aload_0         
	// 3284 6134:getfield        #12  <Field azh a>
	// 3285 6137:astore_1        
		abyte0.aW = ((azh) (abyte0)).bk ^ a.aW;
	// 3286 6138:aload_1         
	// 3287 6139:aload_1         
	// 3288 6140:getfield        #208 <Field int azh.bk>
	// 3289 6143:aload_0         
	// 3290 6144:getfield        #12  <Field azh a>
	// 3291 6147:getfield        #68  <Field int azh.aW>
	// 3292 6150:ixor            
	// 3293 6151:putfield        #68  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 3294 6154:aload_0         
	// 3295 6155:getfield        #12  <Field azh a>
	// 3296 6158:astore_1        
		abyte0.aW = ((azh) (abyte0)).aW | a.I;
	// 3297 6159:aload_1         
	// 3298 6160:aload_1         
	// 3299 6161:getfield        #68  <Field int azh.aW>
	// 3300 6164:aload_0         
	// 3301 6165:getfield        #12  <Field azh a>
	// 3302 6168:getfield        #187 <Field int azh.I>
	// 3303 6171:ior             
	// 3304 6172:putfield        #68  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 3305 6175:aload_0         
	// 3306 6176:getfield        #12  <Field azh a>
	// 3307 6179:astore_1        
		abyte0.aW = ((azh) (abyte0)).bI ^ a.aW;
	// 3308 6180:aload_1         
	// 3309 6181:aload_1         
	// 3310 6182:getfield        #62  <Field int azh.bI>
	// 3311 6185:aload_0         
	// 3312 6186:getfield        #12  <Field azh a>
	// 3313 6189:getfield        #68  <Field int azh.aW>
	// 3314 6192:ixor            
	// 3315 6193:putfield        #68  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 3316 6196:aload_0         
	// 3317 6197:getfield        #12  <Field azh a>
	// 3318 6200:astore_1        
		abyte0.ai = ((azh) (abyte0)).bF & ~a.ai;
	// 3319 6201:aload_1         
	// 3320 6202:aload_1         
	// 3321 6203:getfield        #277 <Field int azh.bF>
	// 3322 6206:aload_0         
	// 3323 6207:getfield        #12  <Field azh a>
	// 3324 6210:getfield        #214 <Field int azh.ai>
	// 3325 6213:iconst_m1       
	// 3326 6214:ixor            
	// 3327 6215:iand            
	// 3328 6216:putfield        #214 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 3329 6219:aload_0         
	// 3330 6220:getfield        #12  <Field azh a>
	// 3331 6223:astore_1        
		abyte0.ai = ((azh) (abyte0)).bG ^ a.ai;
	// 3332 6224:aload_1         
	// 3333 6225:aload_1         
	// 3334 6226:getfield        #259 <Field int azh.bG>
	// 3335 6229:aload_0         
	// 3336 6230:getfield        #12  <Field azh a>
	// 3337 6233:getfield        #214 <Field int azh.ai>
	// 3338 6236:ixor            
	// 3339 6237:putfield        #214 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 3340 6240:aload_0         
	// 3341 6241:getfield        #12  <Field azh a>
	// 3342 6244:astore_1        
		abyte0.ap = ((azh) (abyte0)).ai ^ a.ap;
	// 3343 6245:aload_1         
	// 3344 6246:aload_1         
	// 3345 6247:getfield        #214 <Field int azh.ai>
	// 3346 6250:aload_0         
	// 3347 6251:getfield        #12  <Field azh a>
	// 3348 6254:getfield        #289 <Field int azh.ap>
	// 3349 6257:ixor            
	// 3350 6258:putfield        #289 <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 3351 6261:aload_0         
	// 3352 6262:getfield        #12  <Field azh a>
	// 3353 6265:astore_1        
		abyte0.ai = ((azh) (abyte0)).A & ~a.bF;
	// 3354 6266:aload_1         
	// 3355 6267:aload_1         
	// 3356 6268:getfield        #26  <Field int azh.A>
	// 3357 6271:aload_0         
	// 3358 6272:getfield        #12  <Field azh a>
	// 3359 6275:getfield        #277 <Field int azh.bF>
	// 3360 6278:iconst_m1       
	// 3361 6279:ixor            
	// 3362 6280:iand            
	// 3363 6281:putfield        #214 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 3364 6284:aload_0         
	// 3365 6285:getfield        #12  <Field azh a>
	// 3366 6288:astore_1        
		abyte0.ai = ((azh) (abyte0)).I & ~a.ai;
	// 3367 6289:aload_1         
	// 3368 6290:aload_1         
	// 3369 6291:getfield        #187 <Field int azh.I>
	// 3370 6294:aload_0         
	// 3371 6295:getfield        #12  <Field azh a>
	// 3372 6298:getfield        #214 <Field int azh.ai>
	// 3373 6301:iconst_m1       
	// 3374 6302:ixor            
	// 3375 6303:iand            
	// 3376 6304:putfield        #214 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 3377 6307:aload_0         
	// 3378 6308:getfield        #12  <Field azh a>
	// 3379 6311:astore_1        
		abyte0.bG = ((azh) (abyte0)).A & a.bF;
	// 3380 6312:aload_1         
	// 3381 6313:aload_1         
	// 3382 6314:getfield        #26  <Field int azh.A>
	// 3383 6317:aload_0         
	// 3384 6318:getfield        #12  <Field azh a>
	// 3385 6321:getfield        #277 <Field int azh.bF>
	// 3386 6324:iand            
	// 3387 6325:putfield        #259 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 3388 6328:aload_0         
	// 3389 6329:getfield        #12  <Field azh a>
	// 3390 6332:astore_1        
		abyte0.bG = ((azh) (abyte0)).cp ^ a.bG;
	// 3391 6333:aload_1         
	// 3392 6334:aload_1         
	// 3393 6335:getfield        #211 <Field int azh.cp>
	// 3394 6338:aload_0         
	// 3395 6339:getfield        #12  <Field azh a>
	// 3396 6342:getfield        #259 <Field int azh.bG>
	// 3397 6345:ixor            
	// 3398 6346:putfield        #259 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 3399 6349:aload_0         
	// 3400 6350:getfield        #12  <Field azh a>
	// 3401 6353:astore_1        
		abyte0.bG = ((azh) (abyte0)).bG | a.I;
	// 3402 6354:aload_1         
	// 3403 6355:aload_1         
	// 3404 6356:getfield        #259 <Field int azh.bG>
	// 3405 6359:aload_0         
	// 3406 6360:getfield        #12  <Field azh a>
	// 3407 6363:getfield        #187 <Field int azh.I>
	// 3408 6366:ior             
	// 3409 6367:putfield        #259 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 3410 6370:aload_0         
	// 3411 6371:getfield        #12  <Field azh a>
	// 3412 6374:astore_1        
		abyte0.bG = ((azh) (abyte0)).k ^ a.bG;
	// 3413 6375:aload_1         
	// 3414 6376:aload_1         
	// 3415 6377:getfield        #283 <Field int azh.k>
	// 3416 6380:aload_0         
	// 3417 6381:getfield        #12  <Field azh a>
	// 3418 6384:getfield        #259 <Field int azh.bG>
	// 3419 6387:ixor            
	// 3420 6388:putfield        #259 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 3421 6391:aload_0         
	// 3422 6392:getfield        #12  <Field azh a>
	// 3423 6395:astore_1        
		abyte0.bG = ((azh) (abyte0)).bG & ~a.bb;
	// 3424 6396:aload_1         
	// 3425 6397:aload_1         
	// 3426 6398:getfield        #259 <Field int azh.bG>
	// 3427 6401:aload_0         
	// 3428 6402:getfield        #12  <Field azh a>
	// 3429 6405:getfield        #280 <Field int azh.bb>
	// 3430 6408:iconst_m1       
	// 3431 6409:ixor            
	// 3432 6410:iand            
	// 3433 6411:putfield        #259 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 3434 6414:aload_0         
	// 3435 6415:getfield        #12  <Field azh a>
	// 3436 6418:astore_1        
		abyte0.bG = ((azh) (abyte0)).aW ^ a.bG;
	// 3437 6419:aload_1         
	// 3438 6420:aload_1         
	// 3439 6421:getfield        #68  <Field int azh.aW>
	// 3440 6424:aload_0         
	// 3441 6425:getfield        #12  <Field azh a>
	// 3442 6428:getfield        #259 <Field int azh.bG>
	// 3443 6431:ixor            
	// 3444 6432:putfield        #259 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 3445 6435:aload_0         
	// 3446 6436:getfield        #12  <Field azh a>
	// 3447 6439:astore_1        
		abyte0.bG = ((azh) (abyte0)).c & ~a.bG;
	// 3448 6440:aload_1         
	// 3449 6441:aload_1         
	// 3450 6442:getfield        #220 <Field int azh.c>
	// 3451 6445:aload_0         
	// 3452 6446:getfield        #12  <Field azh a>
	// 3453 6449:getfield        #259 <Field int azh.bG>
	// 3454 6452:iconst_m1       
	// 3455 6453:ixor            
	// 3456 6454:iand            
	// 3457 6455:putfield        #259 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 3458 6458:aload_0         
	// 3459 6459:getfield        #12  <Field azh a>
	// 3460 6462:astore_1        
		abyte0.bG = ((azh) (abyte0)).aD ^ a.bG;
	// 3461 6463:aload_1         
	// 3462 6464:aload_1         
	// 3463 6465:getfield        #223 <Field int azh.aD>
	// 3464 6468:aload_0         
	// 3465 6469:getfield        #12  <Field azh a>
	// 3466 6472:getfield        #259 <Field int azh.bG>
	// 3467 6475:ixor            
	// 3468 6476:putfield        #259 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 3469 6479:aload_0         
	// 3470 6480:getfield        #12  <Field azh a>
	// 3471 6483:astore_1        
		abyte0.bE = ((azh) (abyte0)).bG ^ a.bE;
	// 3472 6484:aload_1         
	// 3473 6485:aload_1         
	// 3474 6486:getfield        #259 <Field int azh.bG>
	// 3475 6489:aload_0         
	// 3476 6490:getfield        #12  <Field azh a>
	// 3477 6493:getfield        #292 <Field int azh.bE>
	// 3478 6496:ixor            
	// 3479 6497:putfield        #292 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 3480 6500:aload_0         
	// 3481 6501:getfield        #12  <Field azh a>
	// 3482 6504:astore_1        
		abyte0.aT = ((azh) (abyte0)).bF & ~a.aT;
	// 3483 6505:aload_1         
	// 3484 6506:aload_1         
	// 3485 6507:getfield        #277 <Field int azh.bF>
	// 3486 6510:aload_0         
	// 3487 6511:getfield        #12  <Field azh a>
	// 3488 6514:getfield        #217 <Field int azh.aT>
	// 3489 6517:iconst_m1       
	// 3490 6518:ixor            
	// 3491 6519:iand            
	// 3492 6520:putfield        #217 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 3493 6523:aload_0         
	// 3494 6524:getfield        #12  <Field azh a>
	// 3495 6527:astore_1        
		abyte0.aT = ((azh) (abyte0)).ae ^ a.aT;
	// 3496 6528:aload_1         
	// 3497 6529:aload_1         
	// 3498 6530:getfield        #238 <Field int azh.ae>
	// 3499 6533:aload_0         
	// 3500 6534:getfield        #12  <Field azh a>
	// 3501 6537:getfield        #217 <Field int azh.aT>
	// 3502 6540:ixor            
	// 3503 6541:putfield        #217 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 3504 6544:aload_0         
	// 3505 6545:getfield        #12  <Field azh a>
	// 3506 6548:astore_1        
		abyte0.p = ((azh) (abyte0)).aT ^ a.p;
	// 3507 6549:aload_1         
	// 3508 6550:aload_1         
	// 3509 6551:getfield        #217 <Field int azh.aT>
	// 3510 6554:aload_0         
	// 3511 6555:getfield        #12  <Field azh a>
	// 3512 6558:getfield        #295 <Field int azh.p>
	// 3513 6561:ixor            
	// 3514 6562:putfield        #295 <Field int azh.p>
		abyte0 = ((byte []) (a));
	// 3515 6565:aload_0         
	// 3516 6566:getfield        #12  <Field azh a>
	// 3517 6569:astore_1        
		abyte0.aT = ((azh) (abyte0)).bF & ~a.k;
	// 3518 6570:aload_1         
	// 3519 6571:aload_1         
	// 3520 6572:getfield        #277 <Field int azh.bF>
	// 3521 6575:aload_0         
	// 3522 6576:getfield        #12  <Field azh a>
	// 3523 6579:getfield        #283 <Field int azh.k>
	// 3524 6582:iconst_m1       
	// 3525 6583:ixor            
	// 3526 6584:iand            
	// 3527 6585:putfield        #217 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 3528 6588:aload_0         
	// 3529 6589:getfield        #12  <Field azh a>
	// 3530 6592:astore_1        
		abyte0.ae = ((azh) (abyte0)).bF & ~a.aT;
	// 3531 6593:aload_1         
	// 3532 6594:aload_1         
	// 3533 6595:getfield        #277 <Field int azh.bF>
	// 3534 6598:aload_0         
	// 3535 6599:getfield        #12  <Field azh a>
	// 3536 6602:getfield        #217 <Field int azh.aT>
	// 3537 6605:iconst_m1       
	// 3538 6606:ixor            
	// 3539 6607:iand            
	// 3540 6608:putfield        #238 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 3541 6611:aload_0         
	// 3542 6612:getfield        #12  <Field azh a>
	// 3543 6615:astore_1        
		abyte0.ae = ((azh) (abyte0)).I & ~a.ae;
	// 3544 6616:aload_1         
	// 3545 6617:aload_1         
	// 3546 6618:getfield        #187 <Field int azh.I>
	// 3547 6621:aload_0         
	// 3548 6622:getfield        #12  <Field azh a>
	// 3549 6625:getfield        #238 <Field int azh.ae>
	// 3550 6628:iconst_m1       
	// 3551 6629:ixor            
	// 3552 6630:iand            
	// 3553 6631:putfield        #238 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 3554 6634:aload_0         
	// 3555 6635:getfield        #12  <Field azh a>
	// 3556 6638:astore_1        
		abyte0.ae = ((azh) (abyte0)).bb | a.ae;
	// 3557 6639:aload_1         
	// 3558 6640:aload_1         
	// 3559 6641:getfield        #280 <Field int azh.bb>
	// 3560 6644:aload_0         
	// 3561 6645:getfield        #12  <Field azh a>
	// 3562 6648:getfield        #238 <Field int azh.ae>
	// 3563 6651:ior             
	// 3564 6652:putfield        #238 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 3565 6655:aload_0         
	// 3566 6656:getfield        #12  <Field azh a>
	// 3567 6659:astore_1        
		abyte0.ae = ((azh) (abyte0)).by ^ a.ae;
	// 3568 6660:aload_1         
	// 3569 6661:aload_1         
	// 3570 6662:getfield        #98  <Field int azh.by>
	// 3571 6665:aload_0         
	// 3572 6666:getfield        #12  <Field azh a>
	// 3573 6669:getfield        #238 <Field int azh.ae>
	// 3574 6672:ixor            
	// 3575 6673:putfield        #238 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 3576 6676:aload_0         
	// 3577 6677:getfield        #12  <Field azh a>
	// 3578 6680:astore_1        
		abyte0.ae = ((azh) (abyte0)).c & ~a.ae;
	// 3579 6681:aload_1         
	// 3580 6682:aload_1         
	// 3581 6683:getfield        #220 <Field int azh.c>
	// 3582 6686:aload_0         
	// 3583 6687:getfield        #12  <Field azh a>
	// 3584 6690:getfield        #238 <Field int azh.ae>
	// 3585 6693:iconst_m1       
	// 3586 6694:ixor            
	// 3587 6695:iand            
	// 3588 6696:putfield        #238 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 3589 6699:aload_0         
	// 3590 6700:getfield        #12  <Field azh a>
	// 3591 6703:astore_1        
		abyte0.b = ((azh) (abyte0)).aT ^ a.b;
	// 3592 6704:aload_1         
	// 3593 6705:aload_1         
	// 3594 6706:getfield        #217 <Field int azh.aT>
	// 3595 6709:aload_0         
	// 3596 6710:getfield        #12  <Field azh a>
	// 3597 6713:getfield        #32  <Field int azh.b>
	// 3598 6716:ixor            
	// 3599 6717:putfield        #32  <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 3600 6720:aload_0         
	// 3601 6721:getfield        #12  <Field azh a>
	// 3602 6724:astore_1        
		abyte0.b = ((azh) (abyte0)).bb | a.b;
	// 3603 6725:aload_1         
	// 3604 6726:aload_1         
	// 3605 6727:getfield        #280 <Field int azh.bb>
	// 3606 6730:aload_0         
	// 3607 6731:getfield        #12  <Field azh a>
	// 3608 6734:getfield        #32  <Field int azh.b>
	// 3609 6737:ior             
	// 3610 6738:putfield        #32  <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 3611 6741:aload_0         
	// 3612 6742:getfield        #12  <Field azh a>
	// 3613 6745:astore_1        
		abyte0.b = ((azh) (abyte0)).ck ^ a.b;
	// 3614 6746:aload_1         
	// 3615 6747:aload_1         
	// 3616 6748:getfield        #143 <Field int azh.ck>
	// 3617 6751:aload_0         
	// 3618 6752:getfield        #12  <Field azh a>
	// 3619 6755:getfield        #32  <Field int azh.b>
	// 3620 6758:ixor            
	// 3621 6759:putfield        #32  <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 3622 6762:aload_0         
	// 3623 6763:getfield        #12  <Field azh a>
	// 3624 6766:astore_1        
		abyte0.b = ((azh) (abyte0)).c & a.b;
	// 3625 6767:aload_1         
	// 3626 6768:aload_1         
	// 3627 6769:getfield        #220 <Field int azh.c>
	// 3628 6772:aload_0         
	// 3629 6773:getfield        #12  <Field azh a>
	// 3630 6776:getfield        #32  <Field int azh.b>
	// 3631 6779:iand            
	// 3632 6780:putfield        #32  <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 3633 6783:aload_0         
	// 3634 6784:getfield        #12  <Field azh a>
	// 3635 6787:astore_1        
		abyte0.b = ((azh) (abyte0)).bM ^ a.b;
	// 3636 6788:aload_1         
	// 3637 6789:aload_1         
	// 3638 6790:getfield        #229 <Field int azh.bM>
	// 3639 6793:aload_0         
	// 3640 6794:getfield        #12  <Field azh a>
	// 3641 6797:getfield        #32  <Field int azh.b>
	// 3642 6800:ixor            
	// 3643 6801:putfield        #32  <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 3644 6804:aload_0         
	// 3645 6805:getfield        #12  <Field azh a>
	// 3646 6808:astore_1        
		abyte0.N = ((azh) (abyte0)).b ^ a.N;
	// 3647 6809:aload_1         
	// 3648 6810:aload_1         
	// 3649 6811:getfield        #32  <Field int azh.b>
	// 3650 6814:aload_0         
	// 3651 6815:getfield        #12  <Field azh a>
	// 3652 6818:getfield        #298 <Field int azh.N>
	// 3653 6821:ixor            
	// 3654 6822:putfield        #298 <Field int azh.N>
		abyte0 = ((byte []) (a));
	// 3655 6825:aload_0         
	// 3656 6826:getfield        #12  <Field azh a>
	// 3657 6829:astore_1        
		abyte0.b = ((azh) (abyte0)).N & a.F;
	// 3658 6830:aload_1         
	// 3659 6831:aload_1         
	// 3660 6832:getfield        #298 <Field int azh.N>
	// 3661 6835:aload_0         
	// 3662 6836:getfield        #12  <Field azh a>
	// 3663 6839:getfield        #182 <Field int azh.F>
	// 3664 6842:iand            
	// 3665 6843:putfield        #32  <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 3666 6846:aload_0         
	// 3667 6847:getfield        #12  <Field azh a>
	// 3668 6850:astore_1        
		abyte0.bM = ((azh) (abyte0)).V & a.b;
	// 3669 6851:aload_1         
	// 3670 6852:aload_1         
	// 3671 6853:getfield        #202 <Field int azh.V>
	// 3672 6856:aload_0         
	// 3673 6857:getfield        #12  <Field azh a>
	// 3674 6860:getfield        #32  <Field int azh.b>
	// 3675 6863:iand            
	// 3676 6864:putfield        #229 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 3677 6867:aload_0         
	// 3678 6868:getfield        #12  <Field azh a>
	// 3679 6871:astore_1        
		abyte0.bM = ((azh) (abyte0)).N ^ a.bM;
	// 3680 6872:aload_1         
	// 3681 6873:aload_1         
	// 3682 6874:getfield        #298 <Field int azh.N>
	// 3683 6877:aload_0         
	// 3684 6878:getfield        #12  <Field azh a>
	// 3685 6881:getfield        #229 <Field int azh.bM>
	// 3686 6884:ixor            
	// 3687 6885:putfield        #229 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 3688 6888:aload_0         
	// 3689 6889:getfield        #12  <Field azh a>
	// 3690 6892:astore_1        
		abyte0.bM = ((azh) (abyte0)).aL & ~a.bM;
	// 3691 6893:aload_1         
	// 3692 6894:aload_1         
	// 3693 6895:getfield        #286 <Field int azh.aL>
	// 3694 6898:aload_0         
	// 3695 6899:getfield        #12  <Field azh a>
	// 3696 6902:getfield        #229 <Field int azh.bM>
	// 3697 6905:iconst_m1       
	// 3698 6906:ixor            
	// 3699 6907:iand            
	// 3700 6908:putfield        #229 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 3701 6911:aload_0         
	// 3702 6912:getfield        #12  <Field azh a>
	// 3703 6915:astore_1        
		abyte0.ck = ((azh) (abyte0)).V & a.b;
	// 3704 6916:aload_1         
	// 3705 6917:aload_1         
	// 3706 6918:getfield        #202 <Field int azh.V>
	// 3707 6921:aload_0         
	// 3708 6922:getfield        #12  <Field azh a>
	// 3709 6925:getfield        #32  <Field int azh.b>
	// 3710 6928:iand            
	// 3711 6929:putfield        #143 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 3712 6932:aload_0         
	// 3713 6933:getfield        #12  <Field azh a>
	// 3714 6936:astore_1        
		abyte0.by = ((azh) (abyte0)).V & ~a.N;
	// 3715 6937:aload_1         
	// 3716 6938:aload_1         
	// 3717 6939:getfield        #202 <Field int azh.V>
	// 3718 6942:aload_0         
	// 3719 6943:getfield        #12  <Field azh a>
	// 3720 6946:getfield        #298 <Field int azh.N>
	// 3721 6949:iconst_m1       
	// 3722 6950:ixor            
	// 3723 6951:iand            
	// 3724 6952:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 3725 6955:aload_0         
	// 3726 6956:getfield        #12  <Field azh a>
	// 3727 6959:astore_1        
		abyte0.by = ((azh) (abyte0)).F ^ a.by;
	// 3728 6960:aload_1         
	// 3729 6961:aload_1         
	// 3730 6962:getfield        #182 <Field int azh.F>
	// 3731 6965:aload_0         
	// 3732 6966:getfield        #12  <Field azh a>
	// 3733 6969:getfield        #98  <Field int azh.by>
	// 3734 6972:ixor            
	// 3735 6973:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 3736 6976:aload_0         
	// 3737 6977:getfield        #12  <Field azh a>
	// 3738 6980:astore_1        
		abyte0.by = ((azh) (abyte0)).by | a.aL;
	// 3739 6981:aload_1         
	// 3740 6982:aload_1         
	// 3741 6983:getfield        #98  <Field int azh.by>
	// 3742 6986:aload_0         
	// 3743 6987:getfield        #12  <Field azh a>
	// 3744 6990:getfield        #286 <Field int azh.aL>
	// 3745 6993:ior             
	// 3746 6994:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 3747 6997:aload_0         
	// 3748 6998:getfield        #12  <Field azh a>
	// 3749 7001:astore_1        
		abyte0.bG = ((azh) (abyte0)).N & a.h;
	// 3750 7002:aload_1         
	// 3751 7003:aload_1         
	// 3752 7004:getfield        #298 <Field int azh.N>
	// 3753 7007:aload_0         
	// 3754 7008:getfield        #12  <Field azh a>
	// 3755 7011:getfield        #196 <Field int azh.h>
	// 3756 7014:iand            
	// 3757 7015:putfield        #259 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 3758 7018:aload_0         
	// 3759 7019:getfield        #12  <Field azh a>
	// 3760 7022:astore_1        
		abyte0.aD = ((azh) (abyte0)).h & ~a.bG;
	// 3761 7023:aload_1         
	// 3762 7024:aload_1         
	// 3763 7025:getfield        #196 <Field int azh.h>
	// 3764 7028:aload_0         
	// 3765 7029:getfield        #12  <Field azh a>
	// 3766 7032:getfield        #259 <Field int azh.bG>
	// 3767 7035:iconst_m1       
	// 3768 7036:ixor            
	// 3769 7037:iand            
	// 3770 7038:putfield        #223 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 3771 7041:aload_0         
	// 3772 7042:getfield        #12  <Field azh a>
	// 3773 7045:astore_1        
		abyte0.cE = ((azh) (abyte0)).N ^ a.cE;
	// 3774 7046:aload_1         
	// 3775 7047:aload_1         
	// 3776 7048:getfield        #298 <Field int azh.N>
	// 3777 7051:aload_0         
	// 3778 7052:getfield        #12  <Field azh a>
	// 3779 7055:getfield        #89  <Field int azh.cE>
	// 3780 7058:ixor            
	// 3781 7059:putfield        #89  <Field int azh.cE>
		abyte0 = ((byte []) (a));
	// 3782 7062:aload_0         
	// 3783 7063:getfield        #12  <Field azh a>
	// 3784 7066:astore_1        
		abyte0.aW = ((azh) (abyte0)).V & ~a.N;
	// 3785 7067:aload_1         
	// 3786 7068:aload_1         
	// 3787 7069:getfield        #202 <Field int azh.V>
	// 3788 7072:aload_0         
	// 3789 7073:getfield        #12  <Field azh a>
	// 3790 7076:getfield        #298 <Field int azh.N>
	// 3791 7079:iconst_m1       
	// 3792 7080:ixor            
	// 3793 7081:iand            
	// 3794 7082:putfield        #68  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 3795 7085:aload_0         
	// 3796 7086:getfield        #12  <Field azh a>
	// 3797 7089:astore_1        
		abyte0.cp = ((azh) (abyte0)).N & ~a.h;
	// 3798 7090:aload_1         
	// 3799 7091:aload_1         
	// 3800 7092:getfield        #298 <Field int azh.N>
	// 3801 7095:aload_0         
	// 3802 7096:getfield        #12  <Field azh a>
	// 3803 7099:getfield        #196 <Field int azh.h>
	// 3804 7102:iconst_m1       
	// 3805 7103:ixor            
	// 3806 7104:iand            
	// 3807 7105:putfield        #211 <Field int azh.cp>
		abyte0 = ((byte []) (a));
	// 3808 7108:aload_0         
	// 3809 7109:getfield        #12  <Field azh a>
	// 3810 7112:astore_1        
		abyte0.cl = ((azh) (abyte0)).F ^ a.N;
	// 3811 7113:aload_1         
	// 3812 7114:aload_1         
	// 3813 7115:getfield        #182 <Field int azh.F>
	// 3814 7118:aload_0         
	// 3815 7119:getfield        #12  <Field azh a>
	// 3816 7122:getfield        #298 <Field int azh.N>
	// 3817 7125:ixor            
	// 3818 7126:putfield        #247 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 3819 7129:aload_0         
	// 3820 7130:getfield        #12  <Field azh a>
	// 3821 7133:astore_1        
		abyte0.bO = ((azh) (abyte0)).V & ~a.cl;
	// 3822 7134:aload_1         
	// 3823 7135:aload_1         
	// 3824 7136:getfield        #202 <Field int azh.V>
	// 3825 7139:aload_0         
	// 3826 7140:getfield        #12  <Field azh a>
	// 3827 7143:getfield        #247 <Field int azh.cl>
	// 3828 7146:iconst_m1       
	// 3829 7147:ixor            
	// 3830 7148:iand            
	// 3831 7149:putfield        #53  <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 3832 7152:aload_0         
	// 3833 7153:getfield        #12  <Field azh a>
	// 3834 7156:astore_1        
		abyte0.bO = ((azh) (abyte0)).F ^ a.bO;
	// 3835 7157:aload_1         
	// 3836 7158:aload_1         
	// 3837 7159:getfield        #182 <Field int azh.F>
	// 3838 7162:aload_0         
	// 3839 7163:getfield        #12  <Field azh a>
	// 3840 7166:getfield        #53  <Field int azh.bO>
	// 3841 7169:ixor            
	// 3842 7170:putfield        #53  <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 3843 7173:aload_0         
	// 3844 7174:getfield        #12  <Field azh a>
	// 3845 7177:astore_1        
		abyte0.bO = ((azh) (abyte0)).aL & a.bO;
	// 3846 7178:aload_1         
	// 3847 7179:aload_1         
	// 3848 7180:getfield        #286 <Field int azh.aL>
	// 3849 7183:aload_0         
	// 3850 7184:getfield        #12  <Field azh a>
	// 3851 7187:getfield        #53  <Field int azh.bO>
	// 3852 7190:iand            
	// 3853 7191:putfield        #53  <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 3854 7194:aload_0         
	// 3855 7195:getfield        #12  <Field azh a>
	// 3856 7198:astore_1        
		abyte0.bO = ((azh) (abyte0)).N ^ a.bO;
	// 3857 7199:aload_1         
	// 3858 7200:aload_1         
	// 3859 7201:getfield        #298 <Field int azh.N>
	// 3860 7204:aload_0         
	// 3861 7205:getfield        #12  <Field azh a>
	// 3862 7208:getfield        #53  <Field int azh.bO>
	// 3863 7211:ixor            
	// 3864 7212:putfield        #53  <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 3865 7215:aload_0         
	// 3866 7216:getfield        #12  <Field azh a>
	// 3867 7219:astore_1        
		abyte0.aE = ((azh) (abyte0)).V & ~a.cl;
	// 3868 7220:aload_1         
	// 3869 7221:aload_1         
	// 3870 7222:getfield        #202 <Field int azh.V>
	// 3871 7225:aload_0         
	// 3872 7226:getfield        #12  <Field azh a>
	// 3873 7229:getfield        #247 <Field int azh.cl>
	// 3874 7232:iconst_m1       
	// 3875 7233:ixor            
	// 3876 7234:iand            
	// 3877 7235:putfield        #104 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 3878 7238:aload_0         
	// 3879 7239:getfield        #12  <Field azh a>
	// 3880 7242:astore_1        
		abyte0.aE = ((azh) (abyte0)).b ^ a.aE;
	// 3881 7243:aload_1         
	// 3882 7244:aload_1         
	// 3883 7245:getfield        #32  <Field int azh.b>
	// 3884 7248:aload_0         
	// 3885 7249:getfield        #12  <Field azh a>
	// 3886 7252:getfield        #104 <Field int azh.aE>
	// 3887 7255:ixor            
	// 3888 7256:putfield        #104 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 3889 7259:aload_0         
	// 3890 7260:getfield        #12  <Field azh a>
	// 3891 7263:astore_1        
		abyte0.aE = ((azh) (abyte0)).aE & ~a.aL;
	// 3892 7264:aload_1         
	// 3893 7265:aload_1         
	// 3894 7266:getfield        #104 <Field int azh.aE>
	// 3895 7269:aload_0         
	// 3896 7270:getfield        #12  <Field azh a>
	// 3897 7273:getfield        #286 <Field int azh.aL>
	// 3898 7276:iconst_m1       
	// 3899 7277:ixor            
	// 3900 7278:iand            
	// 3901 7279:putfield        #104 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 3902 7282:aload_0         
	// 3903 7283:getfield        #12  <Field azh a>
	// 3904 7286:astore_1        
		abyte0.cz = ((azh) (abyte0)).V & a.cl;
	// 3905 7287:aload_1         
	// 3906 7288:aload_1         
	// 3907 7289:getfield        #202 <Field int azh.V>
	// 3908 7292:aload_0         
	// 3909 7293:getfield        #12  <Field azh a>
	// 3910 7296:getfield        #247 <Field int azh.cl>
	// 3911 7299:iand            
	// 3912 7300:putfield        #56  <Field int azh.cz>
		abyte0 = ((byte []) (a));
	// 3913 7303:aload_0         
	// 3914 7304:getfield        #12  <Field azh a>
	// 3915 7307:astore_1        
		abyte0.cm = ((azh) (abyte0)).V & a.cl;
	// 3916 7308:aload_1         
	// 3917 7309:aload_1         
	// 3918 7310:getfield        #202 <Field int azh.V>
	// 3919 7313:aload_0         
	// 3920 7314:getfield        #12  <Field azh a>
	// 3921 7317:getfield        #247 <Field int azh.cl>
	// 3922 7320:iand            
	// 3923 7321:putfield        #83  <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 3924 7324:aload_0         
	// 3925 7325:getfield        #12  <Field azh a>
	// 3926 7328:astore_1        
		abyte0.aw = ((azh) (abyte0)).cl ^ a.aw;
	// 3927 7329:aload_1         
	// 3928 7330:aload_1         
	// 3929 7331:getfield        #247 <Field int azh.cl>
	// 3930 7334:aload_0         
	// 3931 7335:getfield        #12  <Field azh a>
	// 3932 7338:getfield        #199 <Field int azh.aw>
	// 3933 7341:ixor            
	// 3934 7342:putfield        #199 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 3935 7345:aload_0         
	// 3936 7346:getfield        #12  <Field azh a>
	// 3937 7349:astore_1        
		abyte0.aw = ((azh) (abyte0)).aw & ~a.aL;
	// 3938 7350:aload_1         
	// 3939 7351:aload_1         
	// 3940 7352:getfield        #199 <Field int azh.aw>
	// 3941 7355:aload_0         
	// 3942 7356:getfield        #12  <Field azh a>
	// 3943 7359:getfield        #286 <Field int azh.aL>
	// 3944 7362:iconst_m1       
	// 3945 7363:ixor            
	// 3946 7364:iand            
	// 3947 7365:putfield        #199 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 3948 7368:aload_0         
	// 3949 7369:getfield        #12  <Field azh a>
	// 3950 7372:astore_1        
		abyte0.cj = ((azh) (abyte0)).V & ~a.cl;
	// 3951 7373:aload_1         
	// 3952 7374:aload_1         
	// 3953 7375:getfield        #202 <Field int azh.V>
	// 3954 7378:aload_0         
	// 3955 7379:getfield        #12  <Field azh a>
	// 3956 7382:getfield        #247 <Field int azh.cl>
	// 3957 7385:iconst_m1       
	// 3958 7386:ixor            
	// 3959 7387:iand            
	// 3960 7388:putfield        #116 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 3961 7391:aload_0         
	// 3962 7392:getfield        #12  <Field azh a>
	// 3963 7395:astore_1        
		abyte0.cu = ((azh) (abyte0)).N & a.p;
	// 3964 7396:aload_1         
	// 3965 7397:aload_1         
	// 3966 7398:getfield        #298 <Field int azh.N>
	// 3967 7401:aload_0         
	// 3968 7402:getfield        #12  <Field azh a>
	// 3969 7405:getfield        #295 <Field int azh.p>
	// 3970 7408:iand            
	// 3971 7409:putfield        #301 <Field int azh.cu>
		abyte0 = ((byte []) (a));
	// 3972 7412:aload_0         
	// 3973 7413:getfield        #12  <Field azh a>
	// 3974 7416:astore_1        
		abyte0.cA = ((azh) (abyte0)).F | a.N;
	// 3975 7417:aload_1         
	// 3976 7418:aload_1         
	// 3977 7419:getfield        #182 <Field int azh.F>
	// 3978 7422:aload_0         
	// 3979 7423:getfield        #12  <Field azh a>
	// 3980 7426:getfield        #298 <Field int azh.N>
	// 3981 7429:ior             
	// 3982 7430:putfield        #304 <Field int azh.cA>
		abyte0 = ((byte []) (a));
	// 3983 7433:aload_0         
	// 3984 7434:getfield        #12  <Field azh a>
	// 3985 7437:astore_1        
		abyte0.aW = ((azh) (abyte0)).cA ^ a.aW;
	// 3986 7438:aload_1         
	// 3987 7439:aload_1         
	// 3988 7440:getfield        #304 <Field int azh.cA>
	// 3989 7443:aload_0         
	// 3990 7444:getfield        #12  <Field azh a>
	// 3991 7447:getfield        #68  <Field int azh.aW>
	// 3992 7450:ixor            
	// 3993 7451:putfield        #68  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 3994 7454:aload_0         
	// 3995 7455:getfield        #12  <Field azh a>
	// 3996 7458:astore_1        
		abyte0.bh = ((azh) (abyte0)).aW | a.aL;
	// 3997 7459:aload_1         
	// 3998 7460:aload_1         
	// 3999 7461:getfield        #68  <Field int azh.aW>
	// 4000 7464:aload_0         
	// 4001 7465:getfield        #12  <Field azh a>
	// 4002 7468:getfield        #286 <Field int azh.aL>
	// 4003 7471:ior             
	// 4004 7472:putfield        #307 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 4005 7475:aload_0         
	// 4006 7476:getfield        #12  <Field azh a>
	// 4007 7479:astore_1        
		abyte0.bh = ((azh) (abyte0)).cm ^ a.bh;
	// 4008 7480:aload_1         
	// 4009 7481:aload_1         
	// 4010 7482:getfield        #83  <Field int azh.cm>
	// 4011 7485:aload_0         
	// 4012 7486:getfield        #12  <Field azh a>
	// 4013 7489:getfield        #307 <Field int azh.bh>
	// 4014 7492:ixor            
	// 4015 7493:putfield        #307 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 4016 7496:aload_0         
	// 4017 7497:getfield        #12  <Field azh a>
	// 4018 7500:astore_1        
		abyte0.bM = ((azh) (abyte0)).aW ^ a.bM;
	// 4019 7501:aload_1         
	// 4020 7502:aload_1         
	// 4021 7503:getfield        #68  <Field int azh.aW>
	// 4022 7506:aload_0         
	// 4023 7507:getfield        #12  <Field azh a>
	// 4024 7510:getfield        #229 <Field int azh.bM>
	// 4025 7513:ixor            
	// 4026 7514:putfield        #229 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 4027 7517:aload_0         
	// 4028 7518:getfield        #12  <Field azh a>
	// 4029 7521:astore_1        
		abyte0.cA = ((azh) (abyte0)).V & ~a.cA;
	// 4030 7522:aload_1         
	// 4031 7523:aload_1         
	// 4032 7524:getfield        #202 <Field int azh.V>
	// 4033 7527:aload_0         
	// 4034 7528:getfield        #12  <Field azh a>
	// 4035 7531:getfield        #304 <Field int azh.cA>
	// 4036 7534:iconst_m1       
	// 4037 7535:ixor            
	// 4038 7536:iand            
	// 4039 7537:putfield        #304 <Field int azh.cA>
		abyte0 = ((byte []) (a));
	// 4040 7540:aload_0         
	// 4041 7541:getfield        #12  <Field azh a>
	// 4042 7544:astore_1        
		abyte0.cA = ((azh) (abyte0)).b ^ a.cA;
	// 4043 7545:aload_1         
	// 4044 7546:aload_1         
	// 4045 7547:getfield        #32  <Field int azh.b>
	// 4046 7550:aload_0         
	// 4047 7551:getfield        #12  <Field azh a>
	// 4048 7554:getfield        #304 <Field int azh.cA>
	// 4049 7557:ixor            
	// 4050 7558:putfield        #304 <Field int azh.cA>
		abyte0 = ((byte []) (a));
	// 4051 7561:aload_0         
	// 4052 7562:getfield        #12  <Field azh a>
	// 4053 7565:astore_1        
		abyte0.aw = ((azh) (abyte0)).cA ^ a.aw;
	// 4054 7566:aload_1         
	// 4055 7567:aload_1         
	// 4056 7568:getfield        #304 <Field int azh.cA>
	// 4057 7571:aload_0         
	// 4058 7572:getfield        #12  <Field azh a>
	// 4059 7575:getfield        #199 <Field int azh.aw>
	// 4060 7578:ixor            
	// 4061 7579:putfield        #199 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 4062 7582:aload_0         
	// 4063 7583:getfield        #12  <Field azh a>
	// 4064 7586:astore_1        
		abyte0.cA = ((azh) (abyte0)).aL & a.cA;
	// 4065 7587:aload_1         
	// 4066 7588:aload_1         
	// 4067 7589:getfield        #286 <Field int azh.aL>
	// 4068 7592:aload_0         
	// 4069 7593:getfield        #12  <Field azh a>
	// 4070 7596:getfield        #304 <Field int azh.cA>
	// 4071 7599:iand            
	// 4072 7600:putfield        #304 <Field int azh.cA>
		abyte0 = ((byte []) (a));
	// 4073 7603:aload_0         
	// 4074 7604:getfield        #12  <Field azh a>
	// 4075 7607:astore_1        
		abyte0.b = ((azh) (abyte0)).h & ~a.N;
	// 4076 7608:aload_1         
	// 4077 7609:aload_1         
	// 4078 7610:getfield        #196 <Field int azh.h>
	// 4079 7613:aload_0         
	// 4080 7614:getfield        #12  <Field azh a>
	// 4081 7617:getfield        #298 <Field int azh.N>
	// 4082 7620:iconst_m1       
	// 4083 7621:ixor            
	// 4084 7622:iand            
	// 4085 7623:putfield        #32  <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 4086 7626:aload_0         
	// 4087 7627:getfield        #12  <Field azh a>
	// 4088 7630:astore_1        
		abyte0.aW = ((azh) (abyte0)).F & ~a.N;
	// 4089 7631:aload_1         
	// 4090 7632:aload_1         
	// 4091 7633:getfield        #182 <Field int azh.F>
	// 4092 7636:aload_0         
	// 4093 7637:getfield        #12  <Field azh a>
	// 4094 7640:getfield        #298 <Field int azh.N>
	// 4095 7643:iconst_m1       
	// 4096 7644:ixor            
	// 4097 7645:iand            
	// 4098 7646:putfield        #68  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 4099 7649:aload_0         
	// 4100 7650:getfield        #12  <Field azh a>
	// 4101 7653:astore_1        
		abyte0.cz = ((azh) (abyte0)).aW ^ a.cz;
	// 4102 7654:aload_1         
	// 4103 7655:aload_1         
	// 4104 7656:getfield        #68  <Field int azh.aW>
	// 4105 7659:aload_0         
	// 4106 7660:getfield        #12  <Field azh a>
	// 4107 7663:getfield        #56  <Field int azh.cz>
	// 4108 7666:ixor            
	// 4109 7667:putfield        #56  <Field int azh.cz>
		abyte0 = ((byte []) (a));
	// 4110 7670:aload_0         
	// 4111 7671:getfield        #12  <Field azh a>
	// 4112 7674:astore_1        
		abyte0.by = ((azh) (abyte0)).cz ^ a.by;
	// 4113 7675:aload_1         
	// 4114 7676:aload_1         
	// 4115 7677:getfield        #56  <Field int azh.cz>
	// 4116 7680:aload_0         
	// 4117 7681:getfield        #12  <Field azh a>
	// 4118 7684:getfield        #98  <Field int azh.by>
	// 4119 7687:ixor            
	// 4120 7688:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 4121 7691:aload_0         
	// 4122 7692:getfield        #12  <Field azh a>
	// 4123 7695:astore_1        
		abyte0.cz = ((azh) (abyte0)).aW | a.aL;
	// 4124 7696:aload_1         
	// 4125 7697:aload_1         
	// 4126 7698:getfield        #68  <Field int azh.aW>
	// 4127 7701:aload_0         
	// 4128 7702:getfield        #12  <Field azh a>
	// 4129 7705:getfield        #286 <Field int azh.aL>
	// 4130 7708:ior             
	// 4131 7709:putfield        #56  <Field int azh.cz>
		abyte0 = ((byte []) (a));
	// 4132 7712:aload_0         
	// 4133 7713:getfield        #12  <Field azh a>
	// 4134 7716:astore_1        
		abyte0.cw = ((azh) (abyte0)).V & ~a.aW;
	// 4135 7717:aload_1         
	// 4136 7718:aload_1         
	// 4137 7719:getfield        #202 <Field int azh.V>
	// 4138 7722:aload_0         
	// 4139 7723:getfield        #12  <Field azh a>
	// 4140 7726:getfield        #68  <Field int azh.aW>
	// 4141 7729:iconst_m1       
	// 4142 7730:ixor            
	// 4143 7731:iand            
	// 4144 7732:putfield        #310 <Field int azh.cw>
		abyte0 = ((byte []) (a));
	// 4145 7735:aload_0         
	// 4146 7736:getfield        #12  <Field azh a>
	// 4147 7739:astore_1        
		abyte0.cs = ((azh) (abyte0)).aW ^ a.cs;
	// 4148 7740:aload_1         
	// 4149 7741:aload_1         
	// 4150 7742:getfield        #68  <Field int azh.aW>
	// 4151 7745:aload_0         
	// 4152 7746:getfield        #12  <Field azh a>
	// 4153 7749:getfield        #65  <Field int azh.cs>
	// 4154 7752:ixor            
	// 4155 7753:putfield        #65  <Field int azh.cs>
		abyte0 = ((byte []) (a));
	// 4156 7756:aload_0         
	// 4157 7757:getfield        #12  <Field azh a>
	// 4158 7760:astore_1        
		abyte0.aV = ((azh) (abyte0)).cs & ~a.aL;
	// 4159 7761:aload_1         
	// 4160 7762:aload_1         
	// 4161 7763:getfield        #65  <Field int azh.cs>
	// 4162 7766:aload_0         
	// 4163 7767:getfield        #12  <Field azh a>
	// 4164 7770:getfield        #286 <Field int azh.aL>
	// 4165 7773:iconst_m1       
	// 4166 7774:ixor            
	// 4167 7775:iand            
	// 4168 7776:putfield        #313 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 4169 7779:aload_0         
	// 4170 7780:getfield        #12  <Field azh a>
	// 4171 7783:astore_1        
		abyte0.aV = ((azh) (abyte0)).cE ^ a.aV;
	// 4172 7784:aload_1         
	// 4173 7785:aload_1         
	// 4174 7786:getfield        #89  <Field int azh.cE>
	// 4175 7789:aload_0         
	// 4176 7790:getfield        #12  <Field azh a>
	// 4177 7793:getfield        #313 <Field int azh.aV>
	// 4178 7796:ixor            
	// 4179 7797:putfield        #313 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 4180 7800:aload_0         
	// 4181 7801:getfield        #12  <Field azh a>
	// 4182 7804:astore_1        
		abyte0.cs = ((azh) (abyte0)).cs & ~a.aL;
	// 4183 7805:aload_1         
	// 4184 7806:aload_1         
	// 4185 7807:getfield        #65  <Field int azh.cs>
	// 4186 7810:aload_0         
	// 4187 7811:getfield        #12  <Field azh a>
	// 4188 7814:getfield        #286 <Field int azh.aL>
	// 4189 7817:iconst_m1       
	// 4190 7818:ixor            
	// 4191 7819:iand            
	// 4192 7820:putfield        #65  <Field int azh.cs>
		abyte0 = ((byte []) (a));
	// 4193 7823:aload_0         
	// 4194 7824:getfield        #12  <Field azh a>
	// 4195 7827:astore_1        
		abyte0.cs = ((azh) (abyte0)).F ^ a.cs;
	// 4196 7828:aload_1         
	// 4197 7829:aload_1         
	// 4198 7830:getfield        #182 <Field int azh.F>
	// 4199 7833:aload_0         
	// 4200 7834:getfield        #12  <Field azh a>
	// 4201 7837:getfield        #65  <Field int azh.cs>
	// 4202 7840:ixor            
	// 4203 7841:putfield        #65  <Field int azh.cs>
		abyte0 = ((byte []) (a));
	// 4204 7844:aload_0         
	// 4205 7845:getfield        #12  <Field azh a>
	// 4206 7848:astore_1        
		abyte0.aW = ((azh) (abyte0)).aW | a.N;
	// 4207 7849:aload_1         
	// 4208 7850:aload_1         
	// 4209 7851:getfield        #68  <Field int azh.aW>
	// 4210 7854:aload_0         
	// 4211 7855:getfield        #12  <Field azh a>
	// 4212 7858:getfield        #298 <Field int azh.N>
	// 4213 7861:ior             
	// 4214 7862:putfield        #68  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 4215 7865:aload_0         
	// 4216 7866:getfield        #12  <Field azh a>
	// 4217 7869:astore_1        
		abyte0.ch = ((azh) (abyte0)).V & a.aW;
	// 4218 7870:aload_1         
	// 4219 7871:aload_1         
	// 4220 7872:getfield        #202 <Field int azh.V>
	// 4221 7875:aload_0         
	// 4222 7876:getfield        #12  <Field azh a>
	// 4223 7879:getfield        #68  <Field int azh.aW>
	// 4224 7882:iand            
	// 4225 7883:putfield        #316 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 4226 7886:aload_0         
	// 4227 7887:getfield        #12  <Field azh a>
	// 4228 7890:astore_1        
		abyte0.ch = ((azh) (abyte0)).ch & ~a.aL;
	// 4229 7891:aload_1         
	// 4230 7892:aload_1         
	// 4231 7893:getfield        #316 <Field int azh.ch>
	// 4232 7896:aload_0         
	// 4233 7897:getfield        #12  <Field azh a>
	// 4234 7900:getfield        #286 <Field int azh.aL>
	// 4235 7903:iconst_m1       
	// 4236 7904:ixor            
	// 4237 7905:iand            
	// 4238 7906:putfield        #316 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 4239 7909:aload_0         
	// 4240 7910:getfield        #12  <Field azh a>
	// 4241 7913:astore_1        
		abyte0.cj = ((azh) (abyte0)).aW ^ a.cj;
	// 4242 7914:aload_1         
	// 4243 7915:aload_1         
	// 4244 7916:getfield        #68  <Field int azh.aW>
	// 4245 7919:aload_0         
	// 4246 7920:getfield        #12  <Field azh a>
	// 4247 7923:getfield        #116 <Field int azh.cj>
	// 4248 7926:ixor            
	// 4249 7927:putfield        #116 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 4250 7930:aload_0         
	// 4251 7931:getfield        #12  <Field azh a>
	// 4252 7934:astore_1        
		abyte0.cj = ((azh) (abyte0)).aL & a.cj;
	// 4253 7935:aload_1         
	// 4254 7936:aload_1         
	// 4255 7937:getfield        #286 <Field int azh.aL>
	// 4256 7940:aload_0         
	// 4257 7941:getfield        #12  <Field azh a>
	// 4258 7944:getfield        #116 <Field int azh.cj>
	// 4259 7947:iand            
	// 4260 7948:putfield        #116 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 4261 7951:aload_0         
	// 4262 7952:getfield        #12  <Field azh a>
	// 4263 7955:astore_1        
		abyte0.cj = ((azh) (abyte0)).cm ^ a.cj;
	// 4264 7956:aload_1         
	// 4265 7957:aload_1         
	// 4266 7958:getfield        #83  <Field int azh.cm>
	// 4267 7961:aload_0         
	// 4268 7962:getfield        #12  <Field azh a>
	// 4269 7965:getfield        #116 <Field int azh.cj>
	// 4270 7968:ixor            
	// 4271 7969:putfield        #116 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 4272 7972:aload_0         
	// 4273 7973:getfield        #12  <Field azh a>
	// 4274 7976:astore_1        
		abyte0.cm = ((azh) (abyte0)).V & a.aW;
	// 4275 7977:aload_1         
	// 4276 7978:aload_1         
	// 4277 7979:getfield        #202 <Field int azh.V>
	// 4278 7982:aload_0         
	// 4279 7983:getfield        #12  <Field azh a>
	// 4280 7986:getfield        #68  <Field int azh.aW>
	// 4281 7989:iand            
	// 4282 7990:putfield        #83  <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 4283 7993:aload_0         
	// 4284 7994:getfield        #12  <Field azh a>
	// 4285 7997:astore_1        
		abyte0.cm = ((azh) (abyte0)).aW ^ a.cm;
	// 4286 7998:aload_1         
	// 4287 7999:aload_1         
	// 4288 8000:getfield        #68  <Field int azh.aW>
	// 4289 8003:aload_0         
	// 4290 8004:getfield        #12  <Field azh a>
	// 4291 8007:getfield        #83  <Field int azh.cm>
	// 4292 8010:ixor            
	// 4293 8011:putfield        #83  <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 4294 8014:aload_0         
	// 4295 8015:getfield        #12  <Field azh a>
	// 4296 8018:astore_1        
		abyte0.cm = ((azh) (abyte0)).cm & ~a.aL;
	// 4297 8019:aload_1         
	// 4298 8020:aload_1         
	// 4299 8021:getfield        #83  <Field int azh.cm>
	// 4300 8024:aload_0         
	// 4301 8025:getfield        #12  <Field azh a>
	// 4302 8028:getfield        #286 <Field int azh.aL>
	// 4303 8031:iconst_m1       
	// 4304 8032:ixor            
	// 4305 8033:iand            
	// 4306 8034:putfield        #83  <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 4307 8037:aload_0         
	// 4308 8038:getfield        #12  <Field azh a>
	// 4309 8041:astore_1        
		abyte0.cm = ((azh) (abyte0)).cE ^ a.cm;
	// 4310 8042:aload_1         
	// 4311 8043:aload_1         
	// 4312 8044:getfield        #89  <Field int azh.cE>
	// 4313 8047:aload_0         
	// 4314 8048:getfield        #12  <Field azh a>
	// 4315 8051:getfield        #83  <Field int azh.cm>
	// 4316 8054:ixor            
	// 4317 8055:putfield        #83  <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 4318 8058:aload_0         
	// 4319 8059:getfield        #12  <Field azh a>
	// 4320 8062:astore_1        
		abyte0.cE = ((azh) (abyte0)).N | a.h;
	// 4321 8063:aload_1         
	// 4322 8064:aload_1         
	// 4323 8065:getfield        #298 <Field int azh.N>
	// 4324 8068:aload_0         
	// 4325 8069:getfield        #12  <Field azh a>
	// 4326 8072:getfield        #196 <Field int azh.h>
	// 4327 8075:ior             
	// 4328 8076:putfield        #89  <Field int azh.cE>
		abyte0 = ((byte []) (a));
	// 4329 8079:aload_0         
	// 4330 8080:getfield        #12  <Field azh a>
	// 4331 8083:astore_1        
		abyte0.aW = ((azh) (abyte0)).cE & ~a.h;
	// 4332 8084:aload_1         
	// 4333 8085:aload_1         
	// 4334 8086:getfield        #89  <Field int azh.cE>
	// 4335 8089:aload_0         
	// 4336 8090:getfield        #12  <Field azh a>
	// 4337 8093:getfield        #196 <Field int azh.h>
	// 4338 8096:iconst_m1       
	// 4339 8097:ixor            
	// 4340 8098:iand            
	// 4341 8099:putfield        #68  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	// 4342 8102:aload_0         
	// 4343 8103:getfield        #12  <Field azh a>
	// 4344 8106:astore_1        
		abyte0.bj = ((azh) (abyte0)).p | a.aW;
	// 4345 8107:aload_1         
	// 4346 8108:aload_1         
	// 4347 8109:getfield        #295 <Field int azh.p>
	// 4348 8112:aload_0         
	// 4349 8113:getfield        #12  <Field azh a>
	// 4350 8116:getfield        #68  <Field int azh.aW>
	// 4351 8119:ior             
	// 4352 8120:putfield        #319 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 4353 8123:aload_0         
	// 4354 8124:getfield        #12  <Field azh a>
	// 4355 8127:astore_1        
		abyte0.bZ = ((azh) (abyte0)).N & ~a.F;
	// 4356 8128:aload_1         
	// 4357 8129:aload_1         
	// 4358 8130:getfield        #298 <Field int azh.N>
	// 4359 8133:aload_0         
	// 4360 8134:getfield        #12  <Field azh a>
	// 4361 8137:getfield        #182 <Field int azh.F>
	// 4362 8140:iconst_m1       
	// 4363 8141:ixor            
	// 4364 8142:iand            
	// 4365 8143:putfield        #322 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 4366 8146:aload_0         
	// 4367 8147:getfield        #12  <Field azh a>
	// 4368 8150:astore_1        
		abyte0.ck = ((azh) (abyte0)).bZ ^ a.ck;
	// 4369 8151:aload_1         
	// 4370 8152:aload_1         
	// 4371 8153:getfield        #322 <Field int azh.bZ>
	// 4372 8156:aload_0         
	// 4373 8157:getfield        #12  <Field azh a>
	// 4374 8160:getfield        #143 <Field int azh.ck>
	// 4375 8163:ixor            
	// 4376 8164:putfield        #143 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 4377 8167:aload_0         
	// 4378 8168:getfield        #12  <Field azh a>
	// 4379 8171:astore_1        
		abyte0.cA = ((azh) (abyte0)).ck ^ a.cA;
	// 4380 8172:aload_1         
	// 4381 8173:aload_1         
	// 4382 8174:getfield        #143 <Field int azh.ck>
	// 4383 8177:aload_0         
	// 4384 8178:getfield        #12  <Field azh a>
	// 4385 8181:getfield        #304 <Field int azh.cA>
	// 4386 8184:ixor            
	// 4387 8185:putfield        #304 <Field int azh.cA>
		abyte0 = ((byte []) (a));
	// 4388 8188:aload_0         
	// 4389 8189:getfield        #12  <Field azh a>
	// 4390 8192:astore_1        
		abyte0.ck = ((azh) (abyte0)).ck & ~a.aL;
	// 4391 8193:aload_1         
	// 4392 8194:aload_1         
	// 4393 8195:getfield        #143 <Field int azh.ck>
	// 4394 8198:aload_0         
	// 4395 8199:getfield        #12  <Field azh a>
	// 4396 8202:getfield        #286 <Field int azh.aL>
	// 4397 8205:iconst_m1       
	// 4398 8206:ixor            
	// 4399 8207:iand            
	// 4400 8208:putfield        #143 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 4401 8211:aload_0         
	// 4402 8212:getfield        #12  <Field azh a>
	// 4403 8215:astore_1        
		abyte0.ck = ((azh) (abyte0)).N ^ a.ck;
	// 4404 8216:aload_1         
	// 4405 8217:aload_1         
	// 4406 8218:getfield        #298 <Field int azh.N>
	// 4407 8221:aload_0         
	// 4408 8222:getfield        #12  <Field azh a>
	// 4409 8225:getfield        #143 <Field int azh.ck>
	// 4410 8228:ixor            
	// 4411 8229:putfield        #143 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 4412 8232:aload_0         
	// 4413 8233:getfield        #12  <Field azh a>
	// 4414 8236:astore_1        
		abyte0.cw = ((azh) (abyte0)).bZ ^ a.cw;
	// 4415 8237:aload_1         
	// 4416 8238:aload_1         
	// 4417 8239:getfield        #322 <Field int azh.bZ>
	// 4418 8242:aload_0         
	// 4419 8243:getfield        #12  <Field azh a>
	// 4420 8246:getfield        #310 <Field int azh.cw>
	// 4421 8249:ixor            
	// 4422 8250:putfield        #310 <Field int azh.cw>
		abyte0 = ((byte []) (a));
	// 4423 8253:aload_0         
	// 4424 8254:getfield        #12  <Field azh a>
	// 4425 8257:astore_1        
		abyte0.cz = ((azh) (abyte0)).cw ^ a.cz;
	// 4426 8258:aload_1         
	// 4427 8259:aload_1         
	// 4428 8260:getfield        #310 <Field int azh.cw>
	// 4429 8263:aload_0         
	// 4430 8264:getfield        #12  <Field azh a>
	// 4431 8267:getfield        #56  <Field int azh.cz>
	// 4432 8270:ixor            
	// 4433 8271:putfield        #56  <Field int azh.cz>
		abyte0 = ((byte []) (a));
	// 4434 8274:aload_0         
	// 4435 8275:getfield        #12  <Field azh a>
	// 4436 8278:astore_1        
		abyte0.cw = ((azh) (abyte0)).V & a.bZ;
	// 4437 8279:aload_1         
	// 4438 8280:aload_1         
	// 4439 8281:getfield        #202 <Field int azh.V>
	// 4440 8284:aload_0         
	// 4441 8285:getfield        #12  <Field azh a>
	// 4442 8288:getfield        #322 <Field int azh.bZ>
	// 4443 8291:iand            
	// 4444 8292:putfield        #310 <Field int azh.cw>
		abyte0 = ((byte []) (a));
	// 4445 8295:aload_0         
	// 4446 8296:getfield        #12  <Field azh a>
	// 4447 8299:astore_1        
		abyte0.cw = ((azh) (abyte0)).cl ^ a.cw;
	// 4448 8300:aload_1         
	// 4449 8301:aload_1         
	// 4450 8302:getfield        #247 <Field int azh.cl>
	// 4451 8305:aload_0         
	// 4452 8306:getfield        #12  <Field azh a>
	// 4453 8309:getfield        #310 <Field int azh.cw>
	// 4454 8312:ixor            
	// 4455 8313:putfield        #310 <Field int azh.cw>
		abyte0 = ((byte []) (a));
	// 4456 8316:aload_0         
	// 4457 8317:getfield        #12  <Field azh a>
	// 4458 8320:astore_1        
		abyte0.ch = ((azh) (abyte0)).cw ^ a.ch;
	// 4459 8321:aload_1         
	// 4460 8322:aload_1         
	// 4461 8323:getfield        #310 <Field int azh.cw>
	// 4462 8326:aload_0         
	// 4463 8327:getfield        #12  <Field azh a>
	// 4464 8330:getfield        #316 <Field int azh.ch>
	// 4465 8333:ixor            
	// 4466 8334:putfield        #316 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 4467 8337:aload_0         
	// 4468 8338:getfield        #12  <Field azh a>
	// 4469 8341:astore_1        
		abyte0.am = ((azh) (abyte0)).bZ ^ a.am;
	// 4470 8342:aload_1         
	// 4471 8343:aload_1         
	// 4472 8344:getfield        #322 <Field int azh.bZ>
	// 4473 8347:aload_0         
	// 4474 8348:getfield        #12  <Field azh a>
	// 4475 8351:getfield        #77  <Field int azh.am>
	// 4476 8354:ixor            
	// 4477 8355:putfield        #77  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 4478 8358:aload_0         
	// 4479 8359:getfield        #12  <Field azh a>
	// 4480 8362:astore_1        
		abyte0.cw = ((azh) (abyte0)).am & ~a.aL;
	// 4481 8363:aload_1         
	// 4482 8364:aload_1         
	// 4483 8365:getfield        #77  <Field int azh.am>
	// 4484 8368:aload_0         
	// 4485 8369:getfield        #12  <Field azh a>
	// 4486 8372:getfield        #286 <Field int azh.aL>
	// 4487 8375:iconst_m1       
	// 4488 8376:ixor            
	// 4489 8377:iand            
	// 4490 8378:putfield        #310 <Field int azh.cw>
		abyte0 = ((byte []) (a));
	// 4491 8381:aload_0         
	// 4492 8382:getfield        #12  <Field azh a>
	// 4493 8385:astore_1        
		abyte0.cw = ((azh) (abyte0)).bZ ^ a.cw;
	// 4494 8386:aload_1         
	// 4495 8387:aload_1         
	// 4496 8388:getfield        #322 <Field int azh.bZ>
	// 4497 8391:aload_0         
	// 4498 8392:getfield        #12  <Field azh a>
	// 4499 8395:getfield        #310 <Field int azh.cw>
	// 4500 8398:ixor            
	// 4501 8399:putfield        #310 <Field int azh.cw>
		abyte0 = ((byte []) (a));
	// 4502 8402:aload_0         
	// 4503 8403:getfield        #12  <Field azh a>
	// 4504 8406:astore_1        
		abyte0.am = ((azh) (abyte0)).am & ~a.aL;
	// 4505 8407:aload_1         
	// 4506 8408:aload_1         
	// 4507 8409:getfield        #77  <Field int azh.am>
	// 4508 8412:aload_0         
	// 4509 8413:getfield        #12  <Field azh a>
	// 4510 8416:getfield        #286 <Field int azh.aL>
	// 4511 8419:iconst_m1       
	// 4512 8420:ixor            
	// 4513 8421:iand            
	// 4514 8422:putfield        #77  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 4515 8425:aload_0         
	// 4516 8426:getfield        #12  <Field azh a>
	// 4517 8429:astore_1        
		abyte0.am = ((azh) (abyte0)).V ^ a.am;
	// 4518 8430:aload_1         
	// 4519 8431:aload_1         
	// 4520 8432:getfield        #202 <Field int azh.V>
	// 4521 8435:aload_0         
	// 4522 8436:getfield        #12  <Field azh a>
	// 4523 8439:getfield        #77  <Field int azh.am>
	// 4524 8442:ixor            
	// 4525 8443:putfield        #77  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 4526 8446:aload_0         
	// 4527 8447:getfield        #12  <Field azh a>
	// 4528 8450:astore_1        
		abyte0.bZ = ((azh) (abyte0)).N ^ a.h;
	// 4529 8451:aload_1         
	// 4530 8452:aload_1         
	// 4531 8453:getfield        #298 <Field int azh.N>
	// 4532 8456:aload_0         
	// 4533 8457:getfield        #12  <Field azh a>
	// 4534 8460:getfield        #196 <Field int azh.h>
	// 4535 8463:ixor            
	// 4536 8464:putfield        #322 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 4537 8467:aload_0         
	// 4538 8468:getfield        #12  <Field azh a>
	// 4539 8471:astore_1        
		abyte0.cl = ((azh) (abyte0)).A & a.aT;
	// 4540 8472:aload_1         
	// 4541 8473:aload_1         
	// 4542 8474:getfield        #26  <Field int azh.A>
	// 4543 8477:aload_0         
	// 4544 8478:getfield        #12  <Field azh a>
	// 4545 8481:getfield        #217 <Field int azh.aT>
	// 4546 8484:iand            
	// 4547 8485:putfield        #247 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 4548 8488:aload_0         
	// 4549 8489:getfield        #12  <Field azh a>
	// 4550 8492:astore_1        
		abyte0.ai = ((azh) (abyte0)).cl ^ a.ai;
	// 4551 8493:aload_1         
	// 4552 8494:aload_1         
	// 4553 8495:getfield        #247 <Field int azh.cl>
	// 4554 8498:aload_0         
	// 4555 8499:getfield        #12  <Field azh a>
	// 4556 8502:getfield        #214 <Field int azh.ai>
	// 4557 8505:ixor            
	// 4558 8506:putfield        #214 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 4559 8509:aload_0         
	// 4560 8510:getfield        #12  <Field azh a>
	// 4561 8513:astore_1        
		abyte0.ai = ((azh) (abyte0)).ai & ~a.bb;
	// 4562 8514:aload_1         
	// 4563 8515:aload_1         
	// 4564 8516:getfield        #214 <Field int azh.ai>
	// 4565 8519:aload_0         
	// 4566 8520:getfield        #12  <Field azh a>
	// 4567 8523:getfield        #280 <Field int azh.bb>
	// 4568 8526:iconst_m1       
	// 4569 8527:ixor            
	// 4570 8528:iand            
	// 4571 8529:putfield        #214 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 4572 8532:aload_0         
	// 4573 8533:getfield        #12  <Field azh a>
	// 4574 8536:astore_1        
		abyte0.cl = ((azh) (abyte0)).I & ~a.aT;
	// 4575 8537:aload_1         
	// 4576 8538:aload_1         
	// 4577 8539:getfield        #187 <Field int azh.I>
	// 4578 8542:aload_0         
	// 4579 8543:getfield        #12  <Field azh a>
	// 4580 8546:getfield        #217 <Field int azh.aT>
	// 4581 8549:iconst_m1       
	// 4582 8550:ixor            
	// 4583 8551:iand            
	// 4584 8552:putfield        #247 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 4585 8555:aload_0         
	// 4586 8556:getfield        #12  <Field azh a>
	// 4587 8559:astore_1        
		abyte0.cl = ((azh) (abyte0)).bs ^ a.cl;
	// 4588 8560:aload_1         
	// 4589 8561:aload_1         
	// 4590 8562:getfield        #95  <Field int azh.bs>
	// 4591 8565:aload_0         
	// 4592 8566:getfield        #12  <Field azh a>
	// 4593 8569:getfield        #247 <Field int azh.cl>
	// 4594 8572:ixor            
	// 4595 8573:putfield        #247 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 4596 8576:aload_0         
	// 4597 8577:getfield        #12  <Field azh a>
	// 4598 8580:astore_1        
		abyte0.ai = ((azh) (abyte0)).cl ^ a.ai;
	// 4599 8581:aload_1         
	// 4600 8582:aload_1         
	// 4601 8583:getfield        #247 <Field int azh.cl>
	// 4602 8586:aload_0         
	// 4603 8587:getfield        #12  <Field azh a>
	// 4604 8590:getfield        #214 <Field int azh.ai>
	// 4605 8593:ixor            
	// 4606 8594:putfield        #214 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 4607 8597:aload_0         
	// 4608 8598:getfield        #12  <Field azh a>
	// 4609 8601:astore_1        
		abyte0.ae = ((azh) (abyte0)).ai ^ a.ae;
	// 4610 8602:aload_1         
	// 4611 8603:aload_1         
	// 4612 8604:getfield        #214 <Field int azh.ai>
	// 4613 8607:aload_0         
	// 4614 8608:getfield        #12  <Field azh a>
	// 4615 8611:getfield        #238 <Field int azh.ae>
	// 4616 8614:ixor            
	// 4617 8615:putfield        #238 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 4618 8618:aload_0         
	// 4619 8619:getfield        #12  <Field azh a>
	// 4620 8622:astore_1        
		abyte0.ae = ((azh) (abyte0)).ae ^ a.H;
	// 4621 8623:aload_1         
	// 4622 8624:aload_1         
	// 4623 8625:getfield        #238 <Field int azh.ae>
	// 4624 8628:aload_0         
	// 4625 8629:getfield        #12  <Field azh a>
	// 4626 8632:getfield        #131 <Field int azh.H>
	// 4627 8635:ixor            
	// 4628 8636:putfield        #238 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	// 4629 8639:aload_0         
	// 4630 8640:getfield        #12  <Field azh a>
	// 4631 8643:astore_1        
		abyte0.aT = ((azh) (abyte0)).A & ~a.aT;
	// 4632 8644:aload_1         
	// 4633 8645:aload_1         
	// 4634 8646:getfield        #26  <Field int azh.A>
	// 4635 8649:aload_0         
	// 4636 8650:getfield        #12  <Field azh a>
	// 4637 8653:getfield        #217 <Field int azh.aT>
	// 4638 8656:iconst_m1       
	// 4639 8657:ixor            
	// 4640 8658:iand            
	// 4641 8659:putfield        #217 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 4642 8662:aload_0         
	// 4643 8663:getfield        #12  <Field azh a>
	// 4644 8666:astore_1        
		abyte0.aT = ((azh) (abyte0)).bk ^ a.aT;
	// 4645 8667:aload_1         
	// 4646 8668:aload_1         
	// 4647 8669:getfield        #208 <Field int azh.bk>
	// 4648 8672:aload_0         
	// 4649 8673:getfield        #12  <Field azh a>
	// 4650 8676:getfield        #217 <Field int azh.aT>
	// 4651 8679:ixor            
	// 4652 8680:putfield        #217 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 4653 8683:aload_0         
	// 4654 8684:getfield        #12  <Field azh a>
	// 4655 8687:astore_1        
		abyte0.bk = ((azh) (abyte0)).I & ~a.aT;
	// 4656 8688:aload_1         
	// 4657 8689:aload_1         
	// 4658 8690:getfield        #187 <Field int azh.I>
	// 4659 8693:aload_0         
	// 4660 8694:getfield        #12  <Field azh a>
	// 4661 8697:getfield        #217 <Field int azh.aT>
	// 4662 8700:iconst_m1       
	// 4663 8701:ixor            
	// 4664 8702:iand            
	// 4665 8703:putfield        #208 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 4666 8706:aload_0         
	// 4667 8707:getfield        #12  <Field azh a>
	// 4668 8710:astore_1        
		abyte0.bk = ((azh) (abyte0)).aa ^ a.bk;
	// 4669 8711:aload_1         
	// 4670 8712:aload_1         
	// 4671 8713:getfield        #140 <Field int azh.aa>
	// 4672 8716:aload_0         
	// 4673 8717:getfield        #12  <Field azh a>
	// 4674 8720:getfield        #208 <Field int azh.bk>
	// 4675 8723:ixor            
	// 4676 8724:putfield        #208 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 4677 8727:aload_0         
	// 4678 8728:getfield        #12  <Field azh a>
	// 4679 8731:astore_1        
		abyte0.bS = ((azh) (abyte0)).bk ^ a.bS;
	// 4680 8732:aload_1         
	// 4681 8733:aload_1         
	// 4682 8734:getfield        #208 <Field int azh.bk>
	// 4683 8737:aload_0         
	// 4684 8738:getfield        #12  <Field azh a>
	// 4685 8741:getfield        #71  <Field int azh.bS>
	// 4686 8744:ixor            
	// 4687 8745:putfield        #71  <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 4688 8748:aload_0         
	// 4689 8749:getfield        #12  <Field azh a>
	// 4690 8752:astore_1        
		abyte0.bS = ((azh) (abyte0)).c & ~a.bS;
	// 4691 8753:aload_1         
	// 4692 8754:aload_1         
	// 4693 8755:getfield        #220 <Field int azh.c>
	// 4694 8758:aload_0         
	// 4695 8759:getfield        #12  <Field azh a>
	// 4696 8762:getfield        #71  <Field int azh.bS>
	// 4697 8765:iconst_m1       
	// 4698 8766:ixor            
	// 4699 8767:iand            
	// 4700 8768:putfield        #71  <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 4701 8771:aload_0         
	// 4702 8772:getfield        #12  <Field azh a>
	// 4703 8775:astore_1        
		abyte0.aT = ((azh) (abyte0)).I & a.aT;
	// 4704 8776:aload_1         
	// 4705 8777:aload_1         
	// 4706 8778:getfield        #187 <Field int azh.I>
	// 4707 8781:aload_0         
	// 4708 8782:getfield        #12  <Field azh a>
	// 4709 8785:getfield        #217 <Field int azh.aT>
	// 4710 8788:iand            
	// 4711 8789:putfield        #217 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 4712 8792:aload_0         
	// 4713 8793:getfield        #12  <Field azh a>
	// 4714 8796:astore_1        
		abyte0.aT = ((azh) (abyte0)).bI ^ a.aT;
	// 4715 8797:aload_1         
	// 4716 8798:aload_1         
	// 4717 8799:getfield        #62  <Field int azh.bI>
	// 4718 8802:aload_0         
	// 4719 8803:getfield        #12  <Field azh a>
	// 4720 8806:getfield        #217 <Field int azh.aT>
	// 4721 8809:ixor            
	// 4722 8810:putfield        #217 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 4723 8813:aload_0         
	// 4724 8814:getfield        #12  <Field azh a>
	// 4725 8817:astore_1        
		abyte0.aY = ((azh) (abyte0)).aT ^ a.aY;
	// 4726 8818:aload_1         
	// 4727 8819:aload_1         
	// 4728 8820:getfield        #217 <Field int azh.aT>
	// 4729 8823:aload_0         
	// 4730 8824:getfield        #12  <Field azh a>
	// 4731 8827:getfield        #244 <Field int azh.aY>
	// 4732 8830:ixor            
	// 4733 8831:putfield        #244 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 4734 8834:aload_0         
	// 4735 8835:getfield        #12  <Field azh a>
	// 4736 8838:astore_1        
		abyte0.bS = ((azh) (abyte0)).aY ^ a.bS;
	// 4737 8839:aload_1         
	// 4738 8840:aload_1         
	// 4739 8841:getfield        #244 <Field int azh.aY>
	// 4740 8844:aload_0         
	// 4741 8845:getfield        #12  <Field azh a>
	// 4742 8848:getfield        #71  <Field int azh.bS>
	// 4743 8851:ixor            
	// 4744 8852:putfield        #71  <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 4745 8855:aload_0         
	// 4746 8856:getfield        #12  <Field azh a>
	// 4747 8859:astore_1        
		abyte0.T = ((azh) (abyte0)).bS ^ a.T;
	// 4748 8860:aload_1         
	// 4749 8861:aload_1         
	// 4750 8862:getfield        #71  <Field int azh.bS>
	// 4751 8865:aload_0         
	// 4752 8866:getfield        #12  <Field azh a>
	// 4753 8869:getfield        #325 <Field int azh.T>
	// 4754 8872:ixor            
	// 4755 8873:putfield        #325 <Field int azh.T>
		abyte0 = ((byte []) (a));
	// 4756 8876:aload_0         
	// 4757 8877:getfield        #12  <Field azh a>
	// 4758 8880:astore_1        
		abyte0.bS = ((azh) (abyte0)).h & a.T;
	// 4759 8881:aload_1         
	// 4760 8882:aload_1         
	// 4761 8883:getfield        #196 <Field int azh.h>
	// 4762 8886:aload_0         
	// 4763 8887:getfield        #12  <Field azh a>
	// 4764 8890:getfield        #325 <Field int azh.T>
	// 4765 8893:iand            
	// 4766 8894:putfield        #71  <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 4767 8897:aload_0         
	// 4768 8898:getfield        #12  <Field azh a>
	// 4769 8901:astore_1        
		abyte0.aY = ((azh) (abyte0)).h & a.T;
	// 4770 8902:aload_1         
	// 4771 8903:aload_1         
	// 4772 8904:getfield        #196 <Field int azh.h>
	// 4773 8907:aload_0         
	// 4774 8908:getfield        #12  <Field azh a>
	// 4775 8911:getfield        #325 <Field int azh.T>
	// 4776 8914:iand            
	// 4777 8915:putfield        #244 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 4778 8918:aload_0         
	// 4779 8919:getfield        #12  <Field azh a>
	// 4780 8922:astore_1        
		abyte0.bx = ((azh) (abyte0)).T & ~a.bx;
	// 4781 8923:aload_1         
	// 4782 8924:aload_1         
	// 4783 8925:getfield        #325 <Field int azh.T>
	// 4784 8928:aload_0         
	// 4785 8929:getfield        #12  <Field azh a>
	// 4786 8932:getfield        #92  <Field int azh.bx>
	// 4787 8935:iconst_m1       
	// 4788 8936:ixor            
	// 4789 8937:iand            
	// 4790 8938:putfield        #92  <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 4791 8941:aload_0         
	// 4792 8942:getfield        #12  <Field azh a>
	// 4793 8945:astore_1        
		abyte0.t = ((azh) (abyte0)).aN ^ a.t;
	// 4794 8946:aload_1         
	// 4795 8947:aload_1         
	// 4796 8948:getfield        #271 <Field int azh.aN>
	// 4797 8951:aload_0         
	// 4798 8952:getfield        #12  <Field azh a>
	// 4799 8955:getfield        #232 <Field int azh.t>
	// 4800 8958:ixor            
	// 4801 8959:putfield        #232 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 4802 8962:aload_0         
	// 4803 8963:getfield        #12  <Field azh a>
	// 4804 8966:astore_1        
		abyte0.cC = ((azh) (abyte0)).t ^ a.cC;
	// 4805 8967:aload_1         
	// 4806 8968:aload_1         
	// 4807 8969:getfield        #232 <Field int azh.t>
	// 4808 8972:aload_0         
	// 4809 8973:getfield        #12  <Field azh a>
	// 4810 8976:getfield        #59  <Field int azh.cC>
	// 4811 8979:ixor            
	// 4812 8980:putfield        #59  <Field int azh.cC>
		abyte0 = ((byte []) (a));
	// 4813 8983:aload_0         
	// 4814 8984:getfield        #12  <Field azh a>
	// 4815 8987:astore_1        
		abyte0.cB = ((azh) (abyte0)).aN ^ a.cB;
	// 4816 8988:aload_1         
	// 4817 8989:aload_1         
	// 4818 8990:getfield        #271 <Field int azh.aN>
	// 4819 8993:aload_0         
	// 4820 8994:getfield        #12  <Field azh a>
	// 4821 8997:getfield        #265 <Field int azh.cB>
	// 4822 9000:ixor            
	// 4823 9001:putfield        #265 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 4824 9004:aload_0         
	// 4825 9005:getfield        #12  <Field azh a>
	// 4826 9008:astore_1        
		abyte0.S = ((azh) (abyte0)).cB ^ a.S;
	// 4827 9009:aload_1         
	// 4828 9010:aload_1         
	// 4829 9011:getfield        #265 <Field int azh.cB>
	// 4830 9014:aload_0         
	// 4831 9015:getfield        #12  <Field azh a>
	// 4832 9018:getfield        #74  <Field int azh.S>
	// 4833 9021:ixor            
	// 4834 9022:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 4835 9025:aload_0         
	// 4836 9026:getfield        #12  <Field azh a>
	// 4837 9029:astore_1        
		abyte0.X = ((azh) (abyte0)).S ^ a.X;
	// 4838 9030:aload_1         
	// 4839 9031:aload_1         
	// 4840 9032:getfield        #74  <Field int azh.S>
	// 4841 9035:aload_0         
	// 4842 9036:getfield        #12  <Field azh a>
	// 4843 9039:getfield        #125 <Field int azh.X>
	// 4844 9042:ixor            
	// 4845 9043:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 4846 9046:aload_0         
	// 4847 9047:getfield        #12  <Field azh a>
	// 4848 9050:astore_1        
		abyte0.S = ((azh) (abyte0)).H & ~a.aN;
	// 4849 9051:aload_1         
	// 4850 9052:aload_1         
	// 4851 9053:getfield        #131 <Field int azh.H>
	// 4852 9056:aload_0         
	// 4853 9057:getfield        #12  <Field azh a>
	// 4854 9060:getfield        #271 <Field int azh.aN>
	// 4855 9063:iconst_m1       
	// 4856 9064:ixor            
	// 4857 9065:iand            
	// 4858 9066:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 4859 9069:aload_0         
	// 4860 9070:getfield        #12  <Field azh a>
	// 4861 9073:astore_1        
		abyte0.S = ((azh) (abyte0)).bY ^ a.S;
	// 4862 9074:aload_1         
	// 4863 9075:aload_1         
	// 4864 9076:getfield        #122 <Field int azh.bY>
	// 4865 9079:aload_0         
	// 4866 9080:getfield        #12  <Field azh a>
	// 4867 9083:getfield        #74  <Field int azh.S>
	// 4868 9086:ixor            
	// 4869 9087:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 4870 9090:aload_0         
	// 4871 9091:getfield        #12  <Field azh a>
	// 4872 9094:astore_1        
		abyte0.S = ((azh) (abyte0)).S & ~a.Z;
	// 4873 9095:aload_1         
	// 4874 9096:aload_1         
	// 4875 9097:getfield        #74  <Field int azh.S>
	// 4876 9100:aload_0         
	// 4877 9101:getfield        #12  <Field azh a>
	// 4878 9104:getfield        #137 <Field int azh.Z>
	// 4879 9107:iconst_m1       
	// 4880 9108:ixor            
	// 4881 9109:iand            
	// 4882 9110:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 4883 9113:aload_0         
	// 4884 9114:getfield        #12  <Field azh a>
	// 4885 9117:astore_1        
		abyte0.S = ((azh) (abyte0)).au ^ a.S;
	// 4886 9118:aload_1         
	// 4887 9119:aload_1         
	// 4888 9120:getfield        #256 <Field int azh.au>
	// 4889 9123:aload_0         
	// 4890 9124:getfield        #12  <Field azh a>
	// 4891 9127:getfield        #74  <Field int azh.S>
	// 4892 9130:ixor            
	// 4893 9131:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 4894 9134:aload_0         
	// 4895 9135:getfield        #12  <Field azh a>
	// 4896 9138:astore_1        
		abyte0.S = ((azh) (abyte0)).bt & ~a.S;
	// 4897 9139:aload_1         
	// 4898 9140:aload_1         
	// 4899 9141:getfield        #274 <Field int azh.bt>
	// 4900 9144:aload_0         
	// 4901 9145:getfield        #12  <Field azh a>
	// 4902 9148:getfield        #74  <Field int azh.S>
	// 4903 9151:iconst_m1       
	// 4904 9152:ixor            
	// 4905 9153:iand            
	// 4906 9154:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 4907 9157:aload_0         
	// 4908 9158:getfield        #12  <Field azh a>
	// 4909 9161:astore_1        
		abyte0.S = ((azh) (abyte0)).X ^ a.S;
	// 4910 9162:aload_1         
	// 4911 9163:aload_1         
	// 4912 9164:getfield        #125 <Field int azh.X>
	// 4913 9167:aload_0         
	// 4914 9168:getfield        #12  <Field azh a>
	// 4915 9171:getfield        #74  <Field int azh.S>
	// 4916 9174:ixor            
	// 4917 9175:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 4918 9178:aload_0         
	// 4919 9179:getfield        #12  <Field azh a>
	// 4920 9182:astore_1        
		abyte0.u = ((azh) (abyte0)).S ^ a.u;
	// 4921 9183:aload_1         
	// 4922 9184:aload_1         
	// 4923 9185:getfield        #74  <Field int azh.S>
	// 4924 9188:aload_0         
	// 4925 9189:getfield        #12  <Field azh a>
	// 4926 9192:getfield        #328 <Field int azh.u>
	// 4927 9195:ixor            
	// 4928 9196:putfield        #328 <Field int azh.u>
		abyte0 = ((byte []) (a));
	// 4929 9199:aload_0         
	// 4930 9200:getfield        #12  <Field azh a>
	// 4931 9203:astore_1        
		abyte0.S = ((azh) (abyte0)).e | a.u;
	// 4932 9204:aload_1         
	// 4933 9205:aload_1         
	// 4934 9206:getfield        #44  <Field int azh.e>
	// 4935 9209:aload_0         
	// 4936 9210:getfield        #12  <Field azh a>
	// 4937 9213:getfield        #328 <Field int azh.u>
	// 4938 9216:ior             
	// 4939 9217:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 4940 9220:aload_0         
	// 4941 9221:getfield        #12  <Field azh a>
	// 4942 9224:astore_1        
		abyte0.S = ((azh) (abyte0)).S & ~a.e;
	// 4943 9225:aload_1         
	// 4944 9226:aload_1         
	// 4945 9227:getfield        #74  <Field int azh.S>
	// 4946 9230:aload_0         
	// 4947 9231:getfield        #12  <Field azh a>
	// 4948 9234:getfield        #44  <Field int azh.e>
	// 4949 9237:iconst_m1       
	// 4950 9238:ixor            
	// 4951 9239:iand            
	// 4952 9240:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 4953 9243:aload_0         
	// 4954 9244:getfield        #12  <Field azh a>
	// 4955 9247:astore_1        
		abyte0.X = ((azh) (abyte0)).K | a.S;
	// 4956 9248:aload_1         
	// 4957 9249:aload_1         
	// 4958 9250:getfield        #331 <Field int azh.K>
	// 4959 9253:aload_0         
	// 4960 9254:getfield        #12  <Field azh a>
	// 4961 9257:getfield        #74  <Field int azh.S>
	// 4962 9260:ior             
	// 4963 9261:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 4964 9264:aload_0         
	// 4965 9265:getfield        #12  <Field azh a>
	// 4966 9268:astore_1        
		abyte0.X = ((azh) (abyte0)).e ^ a.X;
	// 4967 9269:aload_1         
	// 4968 9270:aload_1         
	// 4969 9271:getfield        #44  <Field int azh.e>
	// 4970 9274:aload_0         
	// 4971 9275:getfield        #12  <Field azh a>
	// 4972 9278:getfield        #125 <Field int azh.X>
	// 4973 9281:ixor            
	// 4974 9282:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 4975 9285:aload_0         
	// 4976 9286:getfield        #12  <Field azh a>
	// 4977 9289:astore_1        
		abyte0.au = ((azh) (abyte0)).K | a.S;
	// 4978 9290:aload_1         
	// 4979 9291:aload_1         
	// 4980 9292:getfield        #331 <Field int azh.K>
	// 4981 9295:aload_0         
	// 4982 9296:getfield        #12  <Field azh a>
	// 4983 9299:getfield        #74  <Field int azh.S>
	// 4984 9302:ior             
	// 4985 9303:putfield        #256 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 4986 9306:aload_0         
	// 4987 9307:getfield        #12  <Field azh a>
	// 4988 9310:astore_1        
		abyte0.bY = ((azh) (abyte0)).K | a.S;
	// 4989 9311:aload_1         
	// 4990 9312:aload_1         
	// 4991 9313:getfield        #331 <Field int azh.K>
	// 4992 9316:aload_0         
	// 4993 9317:getfield        #12  <Field azh a>
	// 4994 9320:getfield        #74  <Field int azh.S>
	// 4995 9323:ior             
	// 4996 9324:putfield        #122 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 4997 9327:aload_0         
	// 4998 9328:getfield        #12  <Field azh a>
	// 4999 9331:astore_1        
		abyte0.cB = ((azh) (abyte0)).K | a.S;
	// 5000 9332:aload_1         
	// 5001 9333:aload_1         
	// 5002 9334:getfield        #331 <Field int azh.K>
	// 5003 9337:aload_0         
	// 5004 9338:getfield        #12  <Field azh a>
	// 5005 9341:getfield        #74  <Field int azh.S>
	// 5006 9344:ior             
	// 5007 9345:putfield        #265 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 5008 9348:aload_0         
	// 5009 9349:getfield        #12  <Field azh a>
	// 5010 9352:astore_1        
		abyte0.t = ((azh) (abyte0)).e & ~a.u;
	// 5011 9353:aload_1         
	// 5012 9354:aload_1         
	// 5013 9355:getfield        #44  <Field int azh.e>
	// 5014 9358:aload_0         
	// 5015 9359:getfield        #12  <Field azh a>
	// 5016 9362:getfield        #328 <Field int azh.u>
	// 5017 9365:iconst_m1       
	// 5018 9366:ixor            
	// 5019 9367:iand            
	// 5020 9368:putfield        #232 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 5021 9371:aload_0         
	// 5022 9372:getfield        #12  <Field azh a>
	// 5023 9375:astore_1        
		abyte0.t = ((azh) (abyte0)).t & ~a.K;
	// 5024 9376:aload_1         
	// 5025 9377:aload_1         
	// 5026 9378:getfield        #232 <Field int azh.t>
	// 5027 9381:aload_0         
	// 5028 9382:getfield        #12  <Field azh a>
	// 5029 9385:getfield        #331 <Field int azh.K>
	// 5030 9388:iconst_m1       
	// 5031 9389:ixor            
	// 5032 9390:iand            
	// 5033 9391:putfield        #232 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 5034 9394:aload_0         
	// 5035 9395:getfield        #12  <Field azh a>
	// 5036 9398:astore_1        
		abyte0.t = ((azh) (abyte0)).S ^ a.t;
	// 5037 9399:aload_1         
	// 5038 9400:aload_1         
	// 5039 9401:getfield        #74  <Field int azh.S>
	// 5040 9404:aload_0         
	// 5041 9405:getfield        #12  <Field azh a>
	// 5042 9408:getfield        #232 <Field int azh.t>
	// 5043 9411:ixor            
	// 5044 9412:putfield        #232 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 5045 9415:aload_0         
	// 5046 9416:getfield        #12  <Field azh a>
	// 5047 9419:astore_1        
		abyte0.t = ((azh) (abyte0)).bK & ~a.t;
	// 5048 9420:aload_1         
	// 5049 9421:aload_1         
	// 5050 9422:getfield        #334 <Field int azh.bK>
	// 5051 9425:aload_0         
	// 5052 9426:getfield        #12  <Field azh a>
	// 5053 9429:getfield        #232 <Field int azh.t>
	// 5054 9432:iconst_m1       
	// 5055 9433:ixor            
	// 5056 9434:iand            
	// 5057 9435:putfield        #232 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 5058 9438:aload_0         
	// 5059 9439:getfield        #12  <Field azh a>
	// 5060 9442:astore_1        
		abyte0.S = ((azh) (abyte0)).u & a.e;
	// 5061 9443:aload_1         
	// 5062 9444:aload_1         
	// 5063 9445:getfield        #328 <Field int azh.u>
	// 5064 9448:aload_0         
	// 5065 9449:getfield        #12  <Field azh a>
	// 5066 9452:getfield        #44  <Field int azh.e>
	// 5067 9455:iand            
	// 5068 9456:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 5069 9459:aload_0         
	// 5070 9460:getfield        #12  <Field azh a>
	// 5071 9463:astore_1        
		abyte0.aT = ((azh) (abyte0)).e & ~a.S;
	// 5072 9464:aload_1         
	// 5073 9465:aload_1         
	// 5074 9466:getfield        #44  <Field int azh.e>
	// 5075 9469:aload_0         
	// 5076 9470:getfield        #12  <Field azh a>
	// 5077 9473:getfield        #74  <Field int azh.S>
	// 5078 9476:iconst_m1       
	// 5079 9477:ixor            
	// 5080 9478:iand            
	// 5081 9479:putfield        #217 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 5082 9482:aload_0         
	// 5083 9483:getfield        #12  <Field azh a>
	// 5084 9486:astore_1        
		abyte0.bI = ((azh) (abyte0)).K | a.aT;
	// 5085 9487:aload_1         
	// 5086 9488:aload_1         
	// 5087 9489:getfield        #331 <Field int azh.K>
	// 5088 9492:aload_0         
	// 5089 9493:getfield        #12  <Field azh a>
	// 5090 9496:getfield        #217 <Field int azh.aT>
	// 5091 9499:ior             
	// 5092 9500:putfield        #62  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 5093 9503:aload_0         
	// 5094 9504:getfield        #12  <Field azh a>
	// 5095 9507:astore_1        
		abyte0.bI = ((azh) (abyte0)).S ^ a.bI;
	// 5096 9508:aload_1         
	// 5097 9509:aload_1         
	// 5098 9510:getfield        #74  <Field int azh.S>
	// 5099 9513:aload_0         
	// 5100 9514:getfield        #12  <Field azh a>
	// 5101 9517:getfield        #62  <Field int azh.bI>
	// 5102 9520:ixor            
	// 5103 9521:putfield        #62  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 5104 9524:aload_0         
	// 5105 9525:getfield        #12  <Field azh a>
	// 5106 9528:astore_1        
		abyte0.S = ((azh) (abyte0)).u & ~a.e;
	// 5107 9529:aload_1         
	// 5108 9530:aload_1         
	// 5109 9531:getfield        #328 <Field int azh.u>
	// 5110 9534:aload_0         
	// 5111 9535:getfield        #12  <Field azh a>
	// 5112 9538:getfield        #44  <Field int azh.e>
	// 5113 9541:iconst_m1       
	// 5114 9542:ixor            
	// 5115 9543:iand            
	// 5116 9544:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 5117 9547:aload_0         
	// 5118 9548:getfield        #12  <Field azh a>
	// 5119 9551:astore_1        
		abyte0.au = ((azh) (abyte0)).S ^ a.au;
	// 5120 9552:aload_1         
	// 5121 9553:aload_1         
	// 5122 9554:getfield        #74  <Field int azh.S>
	// 5123 9557:aload_0         
	// 5124 9558:getfield        #12  <Field azh a>
	// 5125 9561:getfield        #256 <Field int azh.au>
	// 5126 9564:ixor            
	// 5127 9565:putfield        #256 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 5128 9568:aload_0         
	// 5129 9569:getfield        #12  <Field azh a>
	// 5130 9572:astore_1        
		abyte0.au = ((azh) (abyte0)).bK & ~a.au;
	// 5131 9573:aload_1         
	// 5132 9574:aload_1         
	// 5133 9575:getfield        #334 <Field int azh.bK>
	// 5134 9578:aload_0         
	// 5135 9579:getfield        #12  <Field azh a>
	// 5136 9582:getfield        #256 <Field int azh.au>
	// 5137 9585:iconst_m1       
	// 5138 9586:ixor            
	// 5139 9587:iand            
	// 5140 9588:putfield        #256 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 5141 9591:aload_0         
	// 5142 9592:getfield        #12  <Field azh a>
	// 5143 9595:astore_1        
		abyte0.bk = ((azh) (abyte0)).S & ~a.K;
	// 5144 9596:aload_1         
	// 5145 9597:aload_1         
	// 5146 9598:getfield        #74  <Field int azh.S>
	// 5147 9601:aload_0         
	// 5148 9602:getfield        #12  <Field azh a>
	// 5149 9605:getfield        #331 <Field int azh.K>
	// 5150 9608:iconst_m1       
	// 5151 9609:ixor            
	// 5152 9610:iand            
	// 5153 9611:putfield        #208 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 5154 9614:aload_0         
	// 5155 9615:getfield        #12  <Field azh a>
	// 5156 9618:astore_1        
		abyte0.bk = ((azh) (abyte0)).bK & ~a.bk;
	// 5157 9619:aload_1         
	// 5158 9620:aload_1         
	// 5159 9621:getfield        #334 <Field int azh.bK>
	// 5160 9624:aload_0         
	// 5161 9625:getfield        #12  <Field azh a>
	// 5162 9628:getfield        #208 <Field int azh.bk>
	// 5163 9631:iconst_m1       
	// 5164 9632:ixor            
	// 5165 9633:iand            
	// 5166 9634:putfield        #208 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 5167 9637:aload_0         
	// 5168 9638:getfield        #12  <Field azh a>
	// 5169 9641:astore_1        
		abyte0.S = ((azh) (abyte0)).S & ~a.K;
	// 5170 9642:aload_1         
	// 5171 9643:aload_1         
	// 5172 9644:getfield        #74  <Field int azh.S>
	// 5173 9647:aload_0         
	// 5174 9648:getfield        #12  <Field azh a>
	// 5175 9651:getfield        #331 <Field int azh.K>
	// 5176 9654:iconst_m1       
	// 5177 9655:ixor            
	// 5178 9656:iand            
	// 5179 9657:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 5180 9660:aload_0         
	// 5181 9661:getfield        #12  <Field azh a>
	// 5182 9664:astore_1        
		abyte0.S = ((azh) (abyte0)).aT ^ a.S;
	// 5183 9665:aload_1         
	// 5184 9666:aload_1         
	// 5185 9667:getfield        #217 <Field int azh.aT>
	// 5186 9670:aload_0         
	// 5187 9671:getfield        #12  <Field azh a>
	// 5188 9674:getfield        #74  <Field int azh.S>
	// 5189 9677:ixor            
	// 5190 9678:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 5191 9681:aload_0         
	// 5192 9682:getfield        #12  <Field azh a>
	// 5193 9685:astore_1        
		abyte0.au = ((azh) (abyte0)).S ^ a.au;
	// 5194 9686:aload_1         
	// 5195 9687:aload_1         
	// 5196 9688:getfield        #74  <Field int azh.S>
	// 5197 9691:aload_0         
	// 5198 9692:getfield        #12  <Field azh a>
	// 5199 9695:getfield        #256 <Field int azh.au>
	// 5200 9698:ixor            
	// 5201 9699:putfield        #256 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 5202 9702:aload_0         
	// 5203 9703:getfield        #12  <Field azh a>
	// 5204 9706:astore_1        
		abyte0.bk = ((azh) (abyte0)).S ^ a.bk;
	// 5205 9707:aload_1         
	// 5206 9708:aload_1         
	// 5207 9709:getfield        #74  <Field int azh.S>
	// 5208 9712:aload_0         
	// 5209 9713:getfield        #12  <Field azh a>
	// 5210 9716:getfield        #208 <Field int azh.bk>
	// 5211 9719:ixor            
	// 5212 9720:putfield        #208 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 5213 9723:aload_0         
	// 5214 9724:getfield        #12  <Field azh a>
	// 5215 9727:astore_1        
		abyte0.S = ((azh) (abyte0)).bK & a.u;
	// 5216 9728:aload_1         
	// 5217 9729:aload_1         
	// 5218 9730:getfield        #334 <Field int azh.bK>
	// 5219 9733:aload_0         
	// 5220 9734:getfield        #12  <Field azh a>
	// 5221 9737:getfield        #328 <Field int azh.u>
	// 5222 9740:iand            
	// 5223 9741:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 5224 9744:aload_0         
	// 5225 9745:getfield        #12  <Field azh a>
	// 5226 9748:astore_1        
		abyte0.aT = ((azh) (abyte0)).u ^ a.e;
	// 5227 9749:aload_1         
	// 5228 9750:aload_1         
	// 5229 9751:getfield        #328 <Field int azh.u>
	// 5230 9754:aload_0         
	// 5231 9755:getfield        #12  <Field azh a>
	// 5232 9758:getfield        #44  <Field int azh.e>
	// 5233 9761:ixor            
	// 5234 9762:putfield        #217 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 5235 9765:aload_0         
	// 5236 9766:getfield        #12  <Field azh a>
	// 5237 9769:astore_1        
		abyte0.bY = ((azh) (abyte0)).aT ^ a.bY;
	// 5238 9770:aload_1         
	// 5239 9771:aload_1         
	// 5240 9772:getfield        #217 <Field int azh.aT>
	// 5241 9775:aload_0         
	// 5242 9776:getfield        #12  <Field azh a>
	// 5243 9779:getfield        #122 <Field int azh.bY>
	// 5244 9782:ixor            
	// 5245 9783:putfield        #122 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 5246 9786:aload_0         
	// 5247 9787:getfield        #12  <Field azh a>
	// 5248 9790:astore_1        
		abyte0.S = ((azh) (abyte0)).bY ^ a.S;
	// 5249 9791:aload_1         
	// 5250 9792:aload_1         
	// 5251 9793:getfield        #122 <Field int azh.bY>
	// 5252 9796:aload_0         
	// 5253 9797:getfield        #12  <Field azh a>
	// 5254 9800:getfield        #74  <Field int azh.S>
	// 5255 9803:ixor            
	// 5256 9804:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 5257 9807:aload_0         
	// 5258 9808:getfield        #12  <Field azh a>
	// 5259 9811:astore_1        
		abyte0.bY = ((azh) (abyte0)).bK & a.aT;
	// 5260 9812:aload_1         
	// 5261 9813:aload_1         
	// 5262 9814:getfield        #334 <Field int azh.bK>
	// 5263 9817:aload_0         
	// 5264 9818:getfield        #12  <Field azh a>
	// 5265 9821:getfield        #217 <Field int azh.aT>
	// 5266 9824:iand            
	// 5267 9825:putfield        #122 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 5268 9828:aload_0         
	// 5269 9829:getfield        #12  <Field azh a>
	// 5270 9832:astore_1        
		abyte0.bY = ((azh) (abyte0)).X ^ a.bY;
	// 5271 9833:aload_1         
	// 5272 9834:aload_1         
	// 5273 9835:getfield        #125 <Field int azh.X>
	// 5274 9838:aload_0         
	// 5275 9839:getfield        #12  <Field azh a>
	// 5276 9842:getfield        #122 <Field int azh.bY>
	// 5277 9845:ixor            
	// 5278 9846:putfield        #122 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 5279 9849:aload_0         
	// 5280 9850:getfield        #12  <Field azh a>
	// 5281 9853:astore_1        
		abyte0.bY = ((azh) (abyte0)).bY & a.m;
	// 5282 9854:aload_1         
	// 5283 9855:aload_1         
	// 5284 9856:getfield        #122 <Field int azh.bY>
	// 5285 9859:aload_0         
	// 5286 9860:getfield        #12  <Field azh a>
	// 5287 9863:getfield        #337 <Field int azh.m>
	// 5288 9866:iand            
	// 5289 9867:putfield        #122 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 5290 9870:aload_0         
	// 5291 9871:getfield        #12  <Field azh a>
	// 5292 9874:astore_1        
		abyte0.X = ((azh) (abyte0)).K | a.aT;
	// 5293 9875:aload_1         
	// 5294 9876:aload_1         
	// 5295 9877:getfield        #331 <Field int azh.K>
	// 5296 9880:aload_0         
	// 5297 9881:getfield        #12  <Field azh a>
	// 5298 9884:getfield        #217 <Field int azh.aT>
	// 5299 9887:ior             
	// 5300 9888:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 5301 9891:aload_0         
	// 5302 9892:getfield        #12  <Field azh a>
	// 5303 9895:astore_1        
		abyte0.X = ((azh) (abyte0)).u ^ a.X;
	// 5304 9896:aload_1         
	// 5305 9897:aload_1         
	// 5306 9898:getfield        #328 <Field int azh.u>
	// 5307 9901:aload_0         
	// 5308 9902:getfield        #12  <Field azh a>
	// 5309 9905:getfield        #125 <Field int azh.X>
	// 5310 9908:ixor            
	// 5311 9909:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 5312 9912:aload_0         
	// 5313 9913:getfield        #12  <Field azh a>
	// 5314 9916:astore_1        
		abyte0.t = ((azh) (abyte0)).X ^ a.t;
	// 5315 9917:aload_1         
	// 5316 9918:aload_1         
	// 5317 9919:getfield        #125 <Field int azh.X>
	// 5318 9922:aload_0         
	// 5319 9923:getfield        #12  <Field azh a>
	// 5320 9926:getfield        #232 <Field int azh.t>
	// 5321 9929:ixor            
	// 5322 9930:putfield        #232 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 5323 9933:aload_0         
	// 5324 9934:getfield        #12  <Field azh a>
	// 5325 9937:astore_1        
		abyte0.bY = ((azh) (abyte0)).t ^ a.bY;
	// 5326 9938:aload_1         
	// 5327 9939:aload_1         
	// 5328 9940:getfield        #232 <Field int azh.t>
	// 5329 9943:aload_0         
	// 5330 9944:getfield        #12  <Field azh a>
	// 5331 9947:getfield        #122 <Field int azh.bY>
	// 5332 9950:ixor            
	// 5333 9951:putfield        #122 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 5334 9954:aload_0         
	// 5335 9955:getfield        #12  <Field azh a>
	// 5336 9958:astore_1        
		abyte0.t = ((azh) (abyte0)).bu & ~a.bY;
	// 5337 9959:aload_1         
	// 5338 9960:aload_1         
	// 5339 9961:getfield        #41  <Field int azh.bu>
	// 5340 9964:aload_0         
	// 5341 9965:getfield        #12  <Field azh a>
	// 5342 9968:getfield        #122 <Field int azh.bY>
	// 5343 9971:iconst_m1       
	// 5344 9972:ixor            
	// 5345 9973:iand            
	// 5346 9974:putfield        #232 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 5347 9977:aload_0         
	// 5348 9978:getfield        #12  <Field azh a>
	// 5349 9981:astore_1        
		abyte0.bY = ((azh) (abyte0)).bY & ~a.bu;
	// 5350 9982:aload_1         
	// 5351 9983:aload_1         
	// 5352 9984:getfield        #122 <Field int azh.bY>
	// 5353 9987:aload_0         
	// 5354 9988:getfield        #12  <Field azh a>
	// 5355 9991:getfield        #41  <Field int azh.bu>
	// 5356 9994:iconst_m1       
	// 5357 9995:ixor            
	// 5358 9996:iand            
	// 5359 9997:putfield        #122 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 5360 10000:aload_0         
	// 5361 10001:getfield        #12  <Field azh a>
	// 5362 10004:astore_1        
		abyte0.X = ((azh) (abyte0)).K | a.aT;
	// 5363 10005:aload_1         
	// 5364 10006:aload_1         
	// 5365 10007:getfield        #331 <Field int azh.K>
	// 5366 10010:aload_0         
	// 5367 10011:getfield        #12  <Field azh a>
	// 5368 10014:getfield        #217 <Field int azh.aT>
	// 5369 10017:ior             
	// 5370 10018:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 5371 10021:aload_0         
	// 5372 10022:getfield        #12  <Field azh a>
	// 5373 10025:astore_1        
		abyte0.X = ((azh) (abyte0)).e ^ a.X;
	// 5374 10026:aload_1         
	// 5375 10027:aload_1         
	// 5376 10028:getfield        #44  <Field int azh.e>
	// 5377 10031:aload_0         
	// 5378 10032:getfield        #12  <Field azh a>
	// 5379 10035:getfield        #125 <Field int azh.X>
	// 5380 10038:ixor            
	// 5381 10039:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 5382 10042:aload_0         
	// 5383 10043:getfield        #12  <Field azh a>
	// 5384 10046:astore_1        
		abyte0.aa = ((azh) (abyte0)).bK & ~a.X;
	// 5385 10047:aload_1         
	// 5386 10048:aload_1         
	// 5387 10049:getfield        #334 <Field int azh.bK>
	// 5388 10052:aload_0         
	// 5389 10053:getfield        #12  <Field azh a>
	// 5390 10056:getfield        #125 <Field int azh.X>
	// 5391 10059:iconst_m1       
	// 5392 10060:ixor            
	// 5393 10061:iand            
	// 5394 10062:putfield        #140 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 5395 10065:aload_0         
	// 5396 10066:getfield        #12  <Field azh a>
	// 5397 10069:astore_1        
		abyte0.aa = ((azh) (abyte0)).cB ^ a.aa;
	// 5398 10070:aload_1         
	// 5399 10071:aload_1         
	// 5400 10072:getfield        #265 <Field int azh.cB>
	// 5401 10075:aload_0         
	// 5402 10076:getfield        #12  <Field azh a>
	// 5403 10079:getfield        #140 <Field int azh.aa>
	// 5404 10082:ixor            
	// 5405 10083:putfield        #140 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 5406 10086:aload_0         
	// 5407 10087:getfield        #12  <Field azh a>
	// 5408 10090:astore_1        
		abyte0.aa = ((azh) (abyte0)).m & a.aa;
	// 5409 10091:aload_1         
	// 5410 10092:aload_1         
	// 5411 10093:getfield        #337 <Field int azh.m>
	// 5412 10096:aload_0         
	// 5413 10097:getfield        #12  <Field azh a>
	// 5414 10100:getfield        #140 <Field int azh.aa>
	// 5415 10103:iand            
	// 5416 10104:putfield        #140 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 5417 10107:aload_0         
	// 5418 10108:getfield        #12  <Field azh a>
	// 5419 10111:astore_1        
		abyte0.aa = ((azh) (abyte0)).au ^ a.aa;
	// 5420 10112:aload_1         
	// 5421 10113:aload_1         
	// 5422 10114:getfield        #256 <Field int azh.au>
	// 5423 10117:aload_0         
	// 5424 10118:getfield        #12  <Field azh a>
	// 5425 10121:getfield        #140 <Field int azh.aa>
	// 5426 10124:ixor            
	// 5427 10125:putfield        #140 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 5428 10128:aload_0         
	// 5429 10129:getfield        #12  <Field azh a>
	// 5430 10132:astore_1        
		abyte0.t = ((azh) (abyte0)).aa ^ a.t;
	// 5431 10133:aload_1         
	// 5432 10134:aload_1         
	// 5433 10135:getfield        #140 <Field int azh.aa>
	// 5434 10138:aload_0         
	// 5435 10139:getfield        #12  <Field azh a>
	// 5436 10142:getfield        #232 <Field int azh.t>
	// 5437 10145:ixor            
	// 5438 10146:putfield        #232 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 5439 10149:aload_0         
	// 5440 10150:getfield        #12  <Field azh a>
	// 5441 10153:astore_1        
		abyte0.al = ((azh) (abyte0)).t ^ a.al;
	// 5442 10154:aload_1         
	// 5443 10155:aload_1         
	// 5444 10156:getfield        #232 <Field int azh.t>
	// 5445 10159:aload_0         
	// 5446 10160:getfield        #12  <Field azh a>
	// 5447 10163:getfield        #340 <Field int azh.al>
	// 5448 10166:ixor            
	// 5449 10167:putfield        #340 <Field int azh.al>
		abyte0 = ((byte []) (a));
	// 5450 10170:aload_0         
	// 5451 10171:getfield        #12  <Field azh a>
	// 5452 10174:astore_1        
		abyte0.cw = ((azh) (abyte0)).al & a.cw;
	// 5453 10175:aload_1         
	// 5454 10176:aload_1         
	// 5455 10177:getfield        #340 <Field int azh.al>
	// 5456 10180:aload_0         
	// 5457 10181:getfield        #12  <Field azh a>
	// 5458 10184:getfield        #310 <Field int azh.cw>
	// 5459 10187:iand            
	// 5460 10188:putfield        #310 <Field int azh.cw>
		abyte0 = ((byte []) (a));
	// 5461 10191:aload_0         
	// 5462 10192:getfield        #12  <Field azh a>
	// 5463 10195:astore_1        
		abyte0.cw = ((azh) (abyte0)).ck ^ a.cw;
	// 5464 10196:aload_1         
	// 5465 10197:aload_1         
	// 5466 10198:getfield        #143 <Field int azh.ck>
	// 5467 10201:aload_0         
	// 5468 10202:getfield        #12  <Field azh a>
	// 5469 10205:getfield        #310 <Field int azh.cw>
	// 5470 10208:ixor            
	// 5471 10209:putfield        #310 <Field int azh.cw>
		abyte0 = ((byte []) (a));
	// 5472 10212:aload_0         
	// 5473 10213:getfield        #12  <Field azh a>
	// 5474 10216:astore_1        
		abyte0.bM = ((azh) (abyte0)).al & a.bM;
	// 5475 10217:aload_1         
	// 5476 10218:aload_1         
	// 5477 10219:getfield        #340 <Field int azh.al>
	// 5478 10222:aload_0         
	// 5479 10223:getfield        #12  <Field azh a>
	// 5480 10226:getfield        #229 <Field int azh.bM>
	// 5481 10229:iand            
	// 5482 10230:putfield        #229 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 5483 10233:aload_0         
	// 5484 10234:getfield        #12  <Field azh a>
	// 5485 10237:astore_1        
		abyte0.bM = ((azh) (abyte0)).cz ^ a.bM;
	// 5486 10238:aload_1         
	// 5487 10239:aload_1         
	// 5488 10240:getfield        #56  <Field int azh.cz>
	// 5489 10243:aload_0         
	// 5490 10244:getfield        #12  <Field azh a>
	// 5491 10247:getfield        #229 <Field int azh.bM>
	// 5492 10250:ixor            
	// 5493 10251:putfield        #229 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 5494 10254:aload_0         
	// 5495 10255:getfield        #12  <Field azh a>
	// 5496 10258:astore_1        
		abyte0.aV = ((azh) (abyte0)).al & ~a.aV;
	// 5497 10259:aload_1         
	// 5498 10260:aload_1         
	// 5499 10261:getfield        #340 <Field int azh.al>
	// 5500 10264:aload_0         
	// 5501 10265:getfield        #12  <Field azh a>
	// 5502 10268:getfield        #313 <Field int azh.aV>
	// 5503 10271:iconst_m1       
	// 5504 10272:ixor            
	// 5505 10273:iand            
	// 5506 10274:putfield        #313 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 5507 10277:aload_0         
	// 5508 10278:getfield        #12  <Field azh a>
	// 5509 10281:astore_1        
		abyte0.aV = ((azh) (abyte0)).cm ^ a.aV;
	// 5510 10282:aload_1         
	// 5511 10283:aload_1         
	// 5512 10284:getfield        #83  <Field int azh.cm>
	// 5513 10287:aload_0         
	// 5514 10288:getfield        #12  <Field azh a>
	// 5515 10291:getfield        #313 <Field int azh.aV>
	// 5516 10294:ixor            
	// 5517 10295:putfield        #313 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 5518 10298:aload_0         
	// 5519 10299:getfield        #12  <Field azh a>
	// 5520 10302:astore_1        
		abyte0.cs = ((azh) (abyte0)).al & ~a.cs;
	// 5521 10303:aload_1         
	// 5522 10304:aload_1         
	// 5523 10305:getfield        #340 <Field int azh.al>
	// 5524 10308:aload_0         
	// 5525 10309:getfield        #12  <Field azh a>
	// 5526 10312:getfield        #65  <Field int azh.cs>
	// 5527 10315:iconst_m1       
	// 5528 10316:ixor            
	// 5529 10317:iand            
	// 5530 10318:putfield        #65  <Field int azh.cs>
		abyte0 = ((byte []) (a));
	// 5531 10321:aload_0         
	// 5532 10322:getfield        #12  <Field azh a>
	// 5533 10325:astore_1        
		abyte0.cs = ((azh) (abyte0)).ch ^ a.cs;
	// 5534 10326:aload_1         
	// 5535 10327:aload_1         
	// 5536 10328:getfield        #316 <Field int azh.ch>
	// 5537 10331:aload_0         
	// 5538 10332:getfield        #12  <Field azh a>
	// 5539 10335:getfield        #65  <Field int azh.cs>
	// 5540 10338:ixor            
	// 5541 10339:putfield        #65  <Field int azh.cs>
		abyte0 = ((byte []) (a));
	// 5542 10342:aload_0         
	// 5543 10343:getfield        #12  <Field azh a>
	// 5544 10346:astore_1        
		abyte0.aE = ((azh) (abyte0)).al & ~a.aE;
	// 5545 10347:aload_1         
	// 5546 10348:aload_1         
	// 5547 10349:getfield        #340 <Field int azh.al>
	// 5548 10352:aload_0         
	// 5549 10353:getfield        #12  <Field azh a>
	// 5550 10356:getfield        #104 <Field int azh.aE>
	// 5551 10359:iconst_m1       
	// 5552 10360:ixor            
	// 5553 10361:iand            
	// 5554 10362:putfield        #104 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 5555 10365:aload_0         
	// 5556 10366:getfield        #12  <Field azh a>
	// 5557 10369:astore_1        
		abyte0.aE = ((azh) (abyte0)).aw ^ a.aE;
	// 5558 10370:aload_1         
	// 5559 10371:aload_1         
	// 5560 10372:getfield        #199 <Field int azh.aw>
	// 5561 10375:aload_0         
	// 5562 10376:getfield        #12  <Field azh a>
	// 5563 10379:getfield        #104 <Field int azh.aE>
	// 5564 10382:ixor            
	// 5565 10383:putfield        #104 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 5566 10386:aload_0         
	// 5567 10387:getfield        #12  <Field azh a>
	// 5568 10390:astore_1        
		abyte0.bh = ((azh) (abyte0)).al & a.bh;
	// 5569 10391:aload_1         
	// 5570 10392:aload_1         
	// 5571 10393:getfield        #340 <Field int azh.al>
	// 5572 10396:aload_0         
	// 5573 10397:getfield        #12  <Field azh a>
	// 5574 10400:getfield        #307 <Field int azh.bh>
	// 5575 10403:iand            
	// 5576 10404:putfield        #307 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 5577 10407:aload_0         
	// 5578 10408:getfield        #12  <Field azh a>
	// 5579 10411:astore_1        
		abyte0.bh = ((azh) (abyte0)).cj ^ a.bh;
	// 5580 10412:aload_1         
	// 5581 10413:aload_1         
	// 5582 10414:getfield        #116 <Field int azh.cj>
	// 5583 10417:aload_0         
	// 5584 10418:getfield        #12  <Field azh a>
	// 5585 10421:getfield        #307 <Field int azh.bh>
	// 5586 10424:ixor            
	// 5587 10425:putfield        #307 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 5588 10428:aload_0         
	// 5589 10429:getfield        #12  <Field azh a>
	// 5590 10432:astore_1        
		abyte0.cA = ((azh) (abyte0)).al & ~a.cA;
	// 5591 10433:aload_1         
	// 5592 10434:aload_1         
	// 5593 10435:getfield        #340 <Field int azh.al>
	// 5594 10438:aload_0         
	// 5595 10439:getfield        #12  <Field azh a>
	// 5596 10442:getfield        #304 <Field int azh.cA>
	// 5597 10445:iconst_m1       
	// 5598 10446:ixor            
	// 5599 10447:iand            
	// 5600 10448:putfield        #304 <Field int azh.cA>
		abyte0 = ((byte []) (a));
	// 5601 10451:aload_0         
	// 5602 10452:getfield        #12  <Field azh a>
	// 5603 10455:astore_1        
		abyte0.cA = ((azh) (abyte0)).by ^ a.cA;
	// 5604 10456:aload_1         
	// 5605 10457:aload_1         
	// 5606 10458:getfield        #98  <Field int azh.by>
	// 5607 10461:aload_0         
	// 5608 10462:getfield        #12  <Field azh a>
	// 5609 10465:getfield        #304 <Field int azh.cA>
	// 5610 10468:ixor            
	// 5611 10469:putfield        #304 <Field int azh.cA>
		abyte0 = ((byte []) (a));
	// 5612 10472:aload_0         
	// 5613 10473:getfield        #12  <Field azh a>
	// 5614 10476:astore_1        
		abyte0.am = ((azh) (abyte0)).al & a.am;
	// 5615 10477:aload_1         
	// 5616 10478:aload_1         
	// 5617 10479:getfield        #340 <Field int azh.al>
	// 5618 10482:aload_0         
	// 5619 10483:getfield        #12  <Field azh a>
	// 5620 10486:getfield        #77  <Field int azh.am>
	// 5621 10489:iand            
	// 5622 10490:putfield        #77  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 5623 10493:aload_0         
	// 5624 10494:getfield        #12  <Field azh a>
	// 5625 10497:astore_1        
		abyte0.am = ((azh) (abyte0)).bO ^ a.am;
	// 5626 10498:aload_1         
	// 5627 10499:aload_1         
	// 5628 10500:getfield        #53  <Field int azh.bO>
	// 5629 10503:aload_0         
	// 5630 10504:getfield        #12  <Field azh a>
	// 5631 10507:getfield        #77  <Field int azh.am>
	// 5632 10510:ixor            
	// 5633 10511:putfield        #77  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 5634 10514:aload_0         
	// 5635 10515:getfield        #12  <Field azh a>
	// 5636 10518:astore_1        
		abyte0.bY = ((azh) (abyte0)).aa ^ a.bY;
	// 5637 10519:aload_1         
	// 5638 10520:aload_1         
	// 5639 10521:getfield        #140 <Field int azh.aa>
	// 5640 10524:aload_0         
	// 5641 10525:getfield        #12  <Field azh a>
	// 5642 10528:getfield        #122 <Field int azh.bY>
	// 5643 10531:ixor            
	// 5644 10532:putfield        #122 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 5645 10535:aload_0         
	// 5646 10536:getfield        #12  <Field azh a>
	// 5647 10539:astore_1        
		abyte0.ab = ((azh) (abyte0)).bY ^ a.ab;
	// 5648 10540:aload_1         
	// 5649 10541:aload_1         
	// 5650 10542:getfield        #122 <Field int azh.bY>
	// 5651 10545:aload_0         
	// 5652 10546:getfield        #12  <Field azh a>
	// 5653 10549:getfield        #343 <Field int azh.ab>
	// 5654 10552:ixor            
	// 5655 10553:putfield        #343 <Field int azh.ab>
		abyte0 = ((byte []) (a));
	// 5656 10556:aload_0         
	// 5657 10557:getfield        #12  <Field azh a>
	// 5658 10560:astore_1        
		abyte0.X = ((azh) (abyte0)).bK & ~a.X;
	// 5659 10561:aload_1         
	// 5660 10562:aload_1         
	// 5661 10563:getfield        #334 <Field int azh.bK>
	// 5662 10566:aload_0         
	// 5663 10567:getfield        #12  <Field azh a>
	// 5664 10570:getfield        #125 <Field int azh.X>
	// 5665 10573:iconst_m1       
	// 5666 10574:ixor            
	// 5667 10575:iand            
	// 5668 10576:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 5669 10579:aload_0         
	// 5670 10580:getfield        #12  <Field azh a>
	// 5671 10583:astore_1        
		abyte0.X = ((azh) (abyte0)).e ^ a.X;
	// 5672 10584:aload_1         
	// 5673 10585:aload_1         
	// 5674 10586:getfield        #44  <Field int azh.e>
	// 5675 10589:aload_0         
	// 5676 10590:getfield        #12  <Field azh a>
	// 5677 10593:getfield        #125 <Field int azh.X>
	// 5678 10596:ixor            
	// 5679 10597:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 5680 10600:aload_0         
	// 5681 10601:getfield        #12  <Field azh a>
	// 5682 10604:astore_1        
		abyte0.X = ((azh) (abyte0)).m & ~a.X;
	// 5683 10605:aload_1         
	// 5684 10606:aload_1         
	// 5685 10607:getfield        #337 <Field int azh.m>
	// 5686 10610:aload_0         
	// 5687 10611:getfield        #12  <Field azh a>
	// 5688 10614:getfield        #125 <Field int azh.X>
	// 5689 10617:iconst_m1       
	// 5690 10618:ixor            
	// 5691 10619:iand            
	// 5692 10620:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 5693 10623:aload_0         
	// 5694 10624:getfield        #12  <Field azh a>
	// 5695 10627:astore_1        
		abyte0.X = ((azh) (abyte0)).S ^ a.X;
	// 5696 10628:aload_1         
	// 5697 10629:aload_1         
	// 5698 10630:getfield        #74  <Field int azh.S>
	// 5699 10633:aload_0         
	// 5700 10634:getfield        #12  <Field azh a>
	// 5701 10637:getfield        #125 <Field int azh.X>
	// 5702 10640:ixor            
	// 5703 10641:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 5704 10644:aload_0         
	// 5705 10645:getfield        #12  <Field azh a>
	// 5706 10648:astore_1        
		abyte0.aT = ((azh) (abyte0)).bK & a.aT;
	// 5707 10649:aload_1         
	// 5708 10650:aload_1         
	// 5709 10651:getfield        #334 <Field int azh.bK>
	// 5710 10654:aload_0         
	// 5711 10655:getfield        #12  <Field azh a>
	// 5712 10658:getfield        #217 <Field int azh.aT>
	// 5713 10661:iand            
	// 5714 10662:putfield        #217 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 5715 10665:aload_0         
	// 5716 10666:getfield        #12  <Field azh a>
	// 5717 10669:astore_1        
		abyte0.aT = ((azh) (abyte0)).bI ^ a.aT;
	// 5718 10670:aload_1         
	// 5719 10671:aload_1         
	// 5720 10672:getfield        #62  <Field int azh.bI>
	// 5721 10675:aload_0         
	// 5722 10676:getfield        #12  <Field azh a>
	// 5723 10679:getfield        #217 <Field int azh.aT>
	// 5724 10682:ixor            
	// 5725 10683:putfield        #217 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 5726 10686:aload_0         
	// 5727 10687:getfield        #12  <Field azh a>
	// 5728 10690:astore_1        
		abyte0.aT = ((azh) (abyte0)).m & a.aT;
	// 5729 10691:aload_1         
	// 5730 10692:aload_1         
	// 5731 10693:getfield        #337 <Field int azh.m>
	// 5732 10696:aload_0         
	// 5733 10697:getfield        #12  <Field azh a>
	// 5734 10700:getfield        #217 <Field int azh.aT>
	// 5735 10703:iand            
	// 5736 10704:putfield        #217 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 5737 10707:aload_0         
	// 5738 10708:getfield        #12  <Field azh a>
	// 5739 10711:astore_1        
		abyte0.aT = ((azh) (abyte0)).bk ^ a.aT;
	// 5740 10712:aload_1         
	// 5741 10713:aload_1         
	// 5742 10714:getfield        #208 <Field int azh.bk>
	// 5743 10717:aload_0         
	// 5744 10718:getfield        #12  <Field azh a>
	// 5745 10721:getfield        #217 <Field int azh.aT>
	// 5746 10724:ixor            
	// 5747 10725:putfield        #217 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 5748 10728:aload_0         
	// 5749 10729:getfield        #12  <Field azh a>
	// 5750 10732:astore_1        
		abyte0.bk = ((azh) (abyte0)).bu & ~a.aT;
	// 5751 10733:aload_1         
	// 5752 10734:aload_1         
	// 5753 10735:getfield        #41  <Field int azh.bu>
	// 5754 10738:aload_0         
	// 5755 10739:getfield        #12  <Field azh a>
	// 5756 10742:getfield        #217 <Field int azh.aT>
	// 5757 10745:iconst_m1       
	// 5758 10746:ixor            
	// 5759 10747:iand            
	// 5760 10748:putfield        #208 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 5761 10751:aload_0         
	// 5762 10752:getfield        #12  <Field azh a>
	// 5763 10755:astore_1        
		abyte0.bk = ((azh) (abyte0)).X ^ a.bk;
	// 5764 10756:aload_1         
	// 5765 10757:aload_1         
	// 5766 10758:getfield        #125 <Field int azh.X>
	// 5767 10761:aload_0         
	// 5768 10762:getfield        #12  <Field azh a>
	// 5769 10765:getfield        #208 <Field int azh.bk>
	// 5770 10768:ixor            
	// 5771 10769:putfield        #208 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 5772 10772:aload_0         
	// 5773 10773:getfield        #12  <Field azh a>
	// 5774 10776:astore_1        
		abyte0.l = ((azh) (abyte0)).bk ^ a.l;
	// 5775 10777:aload_1         
	// 5776 10778:aload_1         
	// 5777 10779:getfield        #208 <Field int azh.bk>
	// 5778 10782:aload_0         
	// 5779 10783:getfield        #12  <Field azh a>
	// 5780 10786:getfield        #346 <Field int azh.l>
	// 5781 10789:ixor            
	// 5782 10790:putfield        #346 <Field int azh.l>
		abyte0 = ((byte []) (a));
	// 5783 10793:aload_0         
	// 5784 10794:getfield        #12  <Field azh a>
	// 5785 10797:astore_1        
		abyte0.bk = ((azh) (abyte0)).l & ~a.P;
	// 5786 10798:aload_1         
	// 5787 10799:aload_1         
	// 5788 10800:getfield        #346 <Field int azh.l>
	// 5789 10803:aload_0         
	// 5790 10804:getfield        #12  <Field azh a>
	// 5791 10807:getfield        #164 <Field int azh.P>
	// 5792 10810:iconst_m1       
	// 5793 10811:ixor            
	// 5794 10812:iand            
	// 5795 10813:putfield        #208 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 5796 10816:aload_0         
	// 5797 10817:getfield        #12  <Field azh a>
	// 5798 10820:astore_1        
		abyte0.bk = ((azh) (abyte0)).P ^ a.bk;
	// 5799 10821:aload_1         
	// 5800 10822:aload_1         
	// 5801 10823:getfield        #164 <Field int azh.P>
	// 5802 10826:aload_0         
	// 5803 10827:getfield        #12  <Field azh a>
	// 5804 10830:getfield        #208 <Field int azh.bk>
	// 5805 10833:ixor            
	// 5806 10834:putfield        #208 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 5807 10837:aload_0         
	// 5808 10838:getfield        #12  <Field azh a>
	// 5809 10841:astore_1        
		abyte0.bI = ((azh) (abyte0)).l & a.P;
	// 5810 10842:aload_1         
	// 5811 10843:aload_1         
	// 5812 10844:getfield        #346 <Field int azh.l>
	// 5813 10847:aload_0         
	// 5814 10848:getfield        #12  <Field azh a>
	// 5815 10851:getfield        #164 <Field int azh.P>
	// 5816 10854:iand            
	// 5817 10855:putfield        #62  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 5818 10858:aload_0         
	// 5819 10859:getfield        #12  <Field azh a>
	// 5820 10862:astore_1        
		abyte0.S = ((azh) (abyte0)).l & a.P;
	// 5821 10863:aload_1         
	// 5822 10864:aload_1         
	// 5823 10865:getfield        #346 <Field int azh.l>
	// 5824 10868:aload_0         
	// 5825 10869:getfield        #12  <Field azh a>
	// 5826 10872:getfield        #164 <Field int azh.P>
	// 5827 10875:iand            
	// 5828 10876:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 5829 10879:aload_0         
	// 5830 10880:getfield        #12  <Field azh a>
	// 5831 10883:astore_1        
		abyte0.S = ((azh) (abyte0)).P ^ a.S;
	// 5832 10884:aload_1         
	// 5833 10885:aload_1         
	// 5834 10886:getfield        #164 <Field int azh.P>
	// 5835 10889:aload_0         
	// 5836 10890:getfield        #12  <Field azh a>
	// 5837 10893:getfield        #74  <Field int azh.S>
	// 5838 10896:ixor            
	// 5839 10897:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 5840 10900:aload_0         
	// 5841 10901:getfield        #12  <Field azh a>
	// 5842 10904:astore_1        
		abyte0.bY = ((azh) (abyte0)).S & ~a.bE;
	// 5843 10905:aload_1         
	// 5844 10906:aload_1         
	// 5845 10907:getfield        #74  <Field int azh.S>
	// 5846 10910:aload_0         
	// 5847 10911:getfield        #12  <Field azh a>
	// 5848 10914:getfield        #292 <Field int azh.bE>
	// 5849 10917:iconst_m1       
	// 5850 10918:ixor            
	// 5851 10919:iand            
	// 5852 10920:putfield        #122 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 5853 10923:aload_0         
	// 5854 10924:getfield        #12  <Field azh a>
	// 5855 10927:astore_1        
		abyte0.bY = ((azh) (abyte0)).bI ^ a.bY;
	// 5856 10928:aload_1         
	// 5857 10929:aload_1         
	// 5858 10930:getfield        #62  <Field int azh.bI>
	// 5859 10933:aload_0         
	// 5860 10934:getfield        #12  <Field azh a>
	// 5861 10937:getfield        #122 <Field int azh.bY>
	// 5862 10940:ixor            
	// 5863 10941:putfield        #122 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 5864 10944:aload_0         
	// 5865 10945:getfield        #12  <Field azh a>
	// 5866 10948:astore_1        
		abyte0.S = ((azh) (abyte0)).S & ~a.bE;
	// 5867 10949:aload_1         
	// 5868 10950:aload_1         
	// 5869 10951:getfield        #74  <Field int azh.S>
	// 5870 10954:aload_0         
	// 5871 10955:getfield        #12  <Field azh a>
	// 5872 10958:getfield        #292 <Field int azh.bE>
	// 5873 10961:iconst_m1       
	// 5874 10962:ixor            
	// 5875 10963:iand            
	// 5876 10964:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 5877 10967:aload_0         
	// 5878 10968:getfield        #12  <Field azh a>
	// 5879 10971:astore_1        
		abyte0.bI = ((azh) (abyte0)).l & ~a.P;
	// 5880 10972:aload_1         
	// 5881 10973:aload_1         
	// 5882 10974:getfield        #346 <Field int azh.l>
	// 5883 10977:aload_0         
	// 5884 10978:getfield        #12  <Field azh a>
	// 5885 10981:getfield        #164 <Field int azh.P>
	// 5886 10984:iconst_m1       
	// 5887 10985:ixor            
	// 5888 10986:iand            
	// 5889 10987:putfield        #62  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 5890 10990:aload_0         
	// 5891 10991:getfield        #12  <Field azh a>
	// 5892 10994:astore_1        
		abyte0.aT = ((azh) (abyte0)).aT & ~a.bu;
	// 5893 10995:aload_1         
	// 5894 10996:aload_1         
	// 5895 10997:getfield        #217 <Field int azh.aT>
	// 5896 11000:aload_0         
	// 5897 11001:getfield        #12  <Field azh a>
	// 5898 11004:getfield        #41  <Field int azh.bu>
	// 5899 11007:iconst_m1       
	// 5900 11008:ixor            
	// 5901 11009:iand            
	// 5902 11010:putfield        #217 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 5903 11013:aload_0         
	// 5904 11014:getfield        #12  <Field azh a>
	// 5905 11017:astore_1        
		abyte0.aT = ((azh) (abyte0)).X ^ a.aT;
	// 5906 11018:aload_1         
	// 5907 11019:aload_1         
	// 5908 11020:getfield        #125 <Field int azh.X>
	// 5909 11023:aload_0         
	// 5910 11024:getfield        #12  <Field azh a>
	// 5911 11027:getfield        #217 <Field int azh.aT>
	// 5912 11030:ixor            
	// 5913 11031:putfield        #217 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 5914 11034:aload_0         
	// 5915 11035:getfield        #12  <Field azh a>
	// 5916 11038:astore_1        
		abyte0.aT = ((azh) (abyte0)).aT ^ a.bt;
	// 5917 11039:aload_1         
	// 5918 11040:aload_1         
	// 5919 11041:getfield        #217 <Field int azh.aT>
	// 5920 11044:aload_0         
	// 5921 11045:getfield        #12  <Field azh a>
	// 5922 11048:getfield        #274 <Field int azh.bt>
	// 5923 11051:ixor            
	// 5924 11052:putfield        #217 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 5925 11055:aload_0         
	// 5926 11056:getfield        #12  <Field azh a>
	// 5927 11059:astore_1        
		abyte0.X = ((azh) (abyte0)).aT & ~a.aF;
	// 5928 11060:aload_1         
	// 5929 11061:aload_1         
	// 5930 11062:getfield        #217 <Field int azh.aT>
	// 5931 11065:aload_0         
	// 5932 11066:getfield        #12  <Field azh a>
	// 5933 11069:getfield        #185 <Field int azh.aF>
	// 5934 11072:iconst_m1       
	// 5935 11073:ixor            
	// 5936 11074:iand            
	// 5937 11075:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 5938 11078:aload_0         
	// 5939 11079:getfield        #12  <Field azh a>
	// 5940 11082:astore_1        
		abyte0.aa = ((azh) (abyte0)).X | a.aF;
	// 5941 11083:aload_1         
	// 5942 11084:aload_1         
	// 5943 11085:getfield        #125 <Field int azh.X>
	// 5944 11088:aload_0         
	// 5945 11089:getfield        #12  <Field azh a>
	// 5946 11092:getfield        #185 <Field int azh.aF>
	// 5947 11095:ior             
	// 5948 11096:putfield        #140 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 5949 11099:aload_0         
	// 5950 11100:getfield        #12  <Field azh a>
	// 5951 11103:astore_1        
		abyte0.bO = ((azh) (abyte0)).aT | a.aF;
	// 5952 11104:aload_1         
	// 5953 11105:aload_1         
	// 5954 11106:getfield        #217 <Field int azh.aT>
	// 5955 11109:aload_0         
	// 5956 11110:getfield        #12  <Field azh a>
	// 5957 11113:getfield        #185 <Field int azh.aF>
	// 5958 11116:ior             
	// 5959 11117:putfield        #53  <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 5960 11120:aload_0         
	// 5961 11121:getfield        #12  <Field azh a>
	// 5962 11124:astore_1        
		abyte0.by = ((azh) (abyte0)).ap | a.bO;
	// 5963 11125:aload_1         
	// 5964 11126:aload_1         
	// 5965 11127:getfield        #289 <Field int azh.ap>
	// 5966 11130:aload_0         
	// 5967 11131:getfield        #12  <Field azh a>
	// 5968 11134:getfield        #53  <Field int azh.bO>
	// 5969 11137:ior             
	// 5970 11138:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 5971 11141:aload_0         
	// 5972 11142:getfield        #12  <Field azh a>
	// 5973 11145:astore_1        
		abyte0.cj = ((azh) (abyte0)).ap | a.bO;
	// 5974 11146:aload_1         
	// 5975 11147:aload_1         
	// 5976 11148:getfield        #289 <Field int azh.ap>
	// 5977 11151:aload_0         
	// 5978 11152:getfield        #12  <Field azh a>
	// 5979 11155:getfield        #53  <Field int azh.bO>
	// 5980 11158:ior             
	// 5981 11159:putfield        #116 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 5982 11162:aload_0         
	// 5983 11163:getfield        #12  <Field azh a>
	// 5984 11166:astore_1        
		abyte0.aw = ((azh) (abyte0)).aT ^ a.aF;
	// 5985 11167:aload_1         
	// 5986 11168:aload_1         
	// 5987 11169:getfield        #217 <Field int azh.aT>
	// 5988 11172:aload_0         
	// 5989 11173:getfield        #12  <Field azh a>
	// 5990 11176:getfield        #185 <Field int azh.aF>
	// 5991 11179:ixor            
	// 5992 11180:putfield        #199 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 5993 11183:aload_0         
	// 5994 11184:getfield        #12  <Field azh a>
	// 5995 11187:astore_1        
		abyte0.ch = ((azh) (abyte0)).aF & a.aT;
	// 5996 11188:aload_1         
	// 5997 11189:aload_1         
	// 5998 11190:getfield        #185 <Field int azh.aF>
	// 5999 11193:aload_0         
	// 6000 11194:getfield        #12  <Field azh a>
	// 6001 11197:getfield        #217 <Field int azh.aT>
	// 6002 11200:iand            
	// 6003 11201:putfield        #316 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 6004 11204:aload_0         
	// 6005 11205:getfield        #12  <Field azh a>
	// 6006 11208:astore_1        
		abyte0.cm = ((azh) (abyte0)).aF & ~a.aT;
	// 6007 11209:aload_1         
	// 6008 11210:aload_1         
	// 6009 11211:getfield        #185 <Field int azh.aF>
	// 6010 11214:aload_0         
	// 6011 11215:getfield        #12  <Field azh a>
	// 6012 11218:getfield        #217 <Field int azh.aT>
	// 6013 11221:iconst_m1       
	// 6014 11222:ixor            
	// 6015 11223:iand            
	// 6016 11224:putfield        #83  <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 6017 11227:aload_0         
	// 6018 11228:getfield        #12  <Field azh a>
	// 6019 11231:astore_1        
		abyte0.cj = ((azh) (abyte0)).cm ^ a.cj;
	// 6020 11232:aload_1         
	// 6021 11233:aload_1         
	// 6022 11234:getfield        #83  <Field int azh.cm>
	// 6023 11237:aload_0         
	// 6024 11238:getfield        #12  <Field azh a>
	// 6025 11241:getfield        #116 <Field int azh.cj>
	// 6026 11244:ixor            
	// 6027 11245:putfield        #116 <Field int azh.cj>
		abyte0 = ((byte []) (a));
	// 6028 11248:aload_0         
	// 6029 11249:getfield        #12  <Field azh a>
	// 6030 11252:astore_1        
		abyte0.cz = ((azh) (abyte0)).aF & ~a.cm;
	// 6031 11253:aload_1         
	// 6032 11254:aload_1         
	// 6033 11255:getfield        #185 <Field int azh.aF>
	// 6034 11258:aload_0         
	// 6035 11259:getfield        #12  <Field azh a>
	// 6036 11262:getfield        #83  <Field int azh.cm>
	// 6037 11265:iconst_m1       
	// 6038 11266:ixor            
	// 6039 11267:iand            
	// 6040 11268:putfield        #56  <Field int azh.cz>
		abyte0 = ((byte []) (a));
	// 6041 11271:aload_0         
	// 6042 11272:getfield        #12  <Field azh a>
	// 6043 11275:astore_1        
		abyte0.ck = ((azh) (abyte0)).H & a.aN;
	// 6044 11276:aload_1         
	// 6045 11277:aload_1         
	// 6046 11278:getfield        #131 <Field int azh.H>
	// 6047 11281:aload_0         
	// 6048 11282:getfield        #12  <Field azh a>
	// 6049 11285:getfield        #271 <Field int azh.aN>
	// 6050 11288:iand            
	// 6051 11289:putfield        #143 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 6052 11292:aload_0         
	// 6053 11293:getfield        #12  <Field azh a>
	// 6054 11296:astore_1        
		abyte0.ck = ((azh) (abyte0)).cc ^ a.ck;
	// 6055 11297:aload_1         
	// 6056 11298:aload_1         
	// 6057 11299:getfield        #262 <Field int azh.cc>
	// 6058 11302:aload_0         
	// 6059 11303:getfield        #12  <Field azh a>
	// 6060 11306:getfield        #143 <Field int azh.ck>
	// 6061 11309:ixor            
	// 6062 11310:putfield        #143 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 6063 11313:aload_0         
	// 6064 11314:getfield        #12  <Field azh a>
	// 6065 11317:astore_1        
		abyte0.bv = ((azh) (abyte0)).ck ^ a.bv;
	// 6066 11318:aload_1         
	// 6067 11319:aload_1         
	// 6068 11320:getfield        #143 <Field int azh.ck>
	// 6069 11323:aload_0         
	// 6070 11324:getfield        #12  <Field azh a>
	// 6071 11327:getfield        #349 <Field int azh.bv>
	// 6072 11330:ixor            
	// 6073 11331:putfield        #349 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6074 11334:aload_0         
	// 6075 11335:getfield        #12  <Field azh a>
	// 6076 11338:astore_1        
		abyte0.bv = ((azh) (abyte0)).bv & ~a.Z;
	// 6077 11339:aload_1         
	// 6078 11340:aload_1         
	// 6079 11341:getfield        #349 <Field int azh.bv>
	// 6080 11344:aload_0         
	// 6081 11345:getfield        #12  <Field azh a>
	// 6082 11348:getfield        #137 <Field int azh.Z>
	// 6083 11351:iconst_m1       
	// 6084 11352:ixor            
	// 6085 11353:iand            
	// 6086 11354:putfield        #349 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6087 11357:aload_0         
	// 6088 11358:getfield        #12  <Field azh a>
	// 6089 11361:astore_1        
		abyte0.bv = ((azh) (abyte0)).cC ^ a.bv;
	// 6090 11362:aload_1         
	// 6091 11363:aload_1         
	// 6092 11364:getfield        #59  <Field int azh.cC>
	// 6093 11367:aload_0         
	// 6094 11368:getfield        #12  <Field azh a>
	// 6095 11371:getfield        #349 <Field int azh.bv>
	// 6096 11374:ixor            
	// 6097 11375:putfield        #349 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6098 11378:aload_0         
	// 6099 11379:getfield        #12  <Field azh a>
	// 6100 11382:astore_1        
		abyte0.bv = ((azh) (abyte0)).bt & a.bv;
	// 6101 11383:aload_1         
	// 6102 11384:aload_1         
	// 6103 11385:getfield        #274 <Field int azh.bt>
	// 6104 11388:aload_0         
	// 6105 11389:getfield        #12  <Field azh a>
	// 6106 11392:getfield        #349 <Field int azh.bv>
	// 6107 11395:iand            
	// 6108 11396:putfield        #349 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6109 11399:aload_0         
	// 6110 11400:getfield        #12  <Field azh a>
	// 6111 11403:astore_1        
		abyte0.bv = ((azh) (abyte0)).cD ^ a.bv;
	// 6112 11404:aload_1         
	// 6113 11405:aload_1         
	// 6114 11406:getfield        #268 <Field int azh.cD>
	// 6115 11409:aload_0         
	// 6116 11410:getfield        #12  <Field azh a>
	// 6117 11413:getfield        #349 <Field int azh.bv>
	// 6118 11416:ixor            
	// 6119 11417:putfield        #349 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6120 11420:aload_0         
	// 6121 11421:getfield        #12  <Field azh a>
	// 6122 11424:astore_1        
		abyte0.bC = ((azh) (abyte0)).bv ^ a.bC;
	// 6123 11425:aload_1         
	// 6124 11426:aload_1         
	// 6125 11427:getfield        #349 <Field int azh.bv>
	// 6126 11430:aload_0         
	// 6127 11431:getfield        #12  <Field azh a>
	// 6128 11434:getfield        #352 <Field int azh.bC>
	// 6129 11437:ixor            
	// 6130 11438:putfield        #352 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	// 6131 11441:aload_0         
	// 6132 11442:getfield        #12  <Field azh a>
	// 6133 11445:astore_1        
		abyte0.bv = ((azh) (abyte0)).a ^ a.bC;
	// 6134 11446:aload_1         
	// 6135 11447:aload_1         
	// 6136 11448:getfield        #354 <Field int azh.a>
	// 6137 11451:aload_0         
	// 6138 11452:getfield        #12  <Field azh a>
	// 6139 11455:getfield        #352 <Field int azh.bC>
	// 6140 11458:ixor            
	// 6141 11459:putfield        #349 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6142 11462:aload_0         
	// 6143 11463:getfield        #12  <Field azh a>
	// 6144 11466:astore_1        
		abyte0.cD = ((azh) (abyte0)).K | a.bC;
	// 6145 11467:aload_1         
	// 6146 11468:aload_1         
	// 6147 11469:getfield        #331 <Field int azh.K>
	// 6148 11472:aload_0         
	// 6149 11473:getfield        #12  <Field azh a>
	// 6150 11476:getfield        #352 <Field int azh.bC>
	// 6151 11479:ior             
	// 6152 11480:putfield        #268 <Field int azh.cD>
		abyte0 = ((byte []) (a));
	// 6153 11483:aload_0         
	// 6154 11484:getfield        #12  <Field azh a>
	// 6155 11487:astore_1        
		abyte0.cC = ((azh) (abyte0)).bC & ~a.W;
	// 6156 11488:aload_1         
	// 6157 11489:aload_1         
	// 6158 11490:getfield        #352 <Field int azh.bC>
	// 6159 11493:aload_0         
	// 6160 11494:getfield        #12  <Field azh a>
	// 6161 11497:getfield        #357 <Field int azh.W>
	// 6162 11500:iconst_m1       
	// 6163 11501:ixor            
	// 6164 11502:iand            
	// 6165 11503:putfield        #59  <Field int azh.cC>
		abyte0 = ((byte []) (a));
	// 6166 11506:aload_0         
	// 6167 11507:getfield        #12  <Field azh a>
	// 6168 11510:astore_1        
		abyte0.cC = ((azh) (abyte0)).bL ^ a.cC;
	// 6169 11511:aload_1         
	// 6170 11512:aload_1         
	// 6171 11513:getfield        #360 <Field int azh.bL>
	// 6172 11516:aload_0         
	// 6173 11517:getfield        #12  <Field azh a>
	// 6174 11520:getfield        #59  <Field int azh.cC>
	// 6175 11523:ixor            
	// 6176 11524:putfield        #59  <Field int azh.cC>
		abyte0 = ((byte []) (a));
	// 6177 11527:aload_0         
	// 6178 11528:getfield        #12  <Field azh a>
	// 6179 11531:astore_1        
		abyte0.cC = ((azh) (abyte0)).E | a.cC;
	// 6180 11532:aload_1         
	// 6181 11533:aload_1         
	// 6182 11534:getfield        #363 <Field int azh.E>
	// 6183 11537:aload_0         
	// 6184 11538:getfield        #12  <Field azh a>
	// 6185 11541:getfield        #59  <Field int azh.cC>
	// 6186 11544:ior             
	// 6187 11545:putfield        #59  <Field int azh.cC>
		abyte0 = ((byte []) (a));
	// 6188 11548:aload_0         
	// 6189 11549:getfield        #12  <Field azh a>
	// 6190 11552:astore_1        
		abyte0.ck = ((azh) (abyte0)).ba & ~a.bC;
	// 6191 11553:aload_1         
	// 6192 11554:aload_1         
	// 6193 11555:getfield        #366 <Field int azh.ba>
	// 6194 11558:aload_0         
	// 6195 11559:getfield        #12  <Field azh a>
	// 6196 11562:getfield        #352 <Field int azh.bC>
	// 6197 11565:iconst_m1       
	// 6198 11566:ixor            
	// 6199 11567:iand            
	// 6200 11568:putfield        #143 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 6201 11571:aload_0         
	// 6202 11572:getfield        #12  <Field azh a>
	// 6203 11575:astore_1        
		abyte0.ck = ((azh) (abyte0)).cF ^ a.ck;
	// 6204 11576:aload_1         
	// 6205 11577:aload_1         
	// 6206 11578:getfield        #369 <Field int azh.cF>
	// 6207 11581:aload_0         
	// 6208 11582:getfield        #12  <Field azh a>
	// 6209 11585:getfield        #143 <Field int azh.ck>
	// 6210 11588:ixor            
	// 6211 11589:putfield        #143 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 6212 11592:aload_0         
	// 6213 11593:getfield        #12  <Field azh a>
	// 6214 11596:astore_1        
		abyte0.ck = ((azh) (abyte0)).E | a.ck;
	// 6215 11597:aload_1         
	// 6216 11598:aload_1         
	// 6217 11599:getfield        #363 <Field int azh.E>
	// 6218 11602:aload_0         
	// 6219 11603:getfield        #12  <Field azh a>
	// 6220 11606:getfield        #143 <Field int azh.ck>
	// 6221 11609:ior             
	// 6222 11610:putfield        #143 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 6223 11613:aload_0         
	// 6224 11614:getfield        #12  <Field azh a>
	// 6225 11617:astore_1        
		abyte0.ca = ((azh) (abyte0)).bC & ~a.ca;
	// 6226 11618:aload_1         
	// 6227 11619:aload_1         
	// 6228 11620:getfield        #352 <Field int azh.bC>
	// 6229 11623:aload_0         
	// 6230 11624:getfield        #12  <Field azh a>
	// 6231 11627:getfield        #372 <Field int azh.ca>
	// 6232 11630:iconst_m1       
	// 6233 11631:ixor            
	// 6234 11632:iand            
	// 6235 11633:putfield        #372 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 6236 11636:aload_0         
	// 6237 11637:getfield        #12  <Field azh a>
	// 6238 11640:astore_1        
		abyte0.ca = ((azh) (abyte0)).d ^ a.ca;
	// 6239 11641:aload_1         
	// 6240 11642:aload_1         
	// 6241 11643:getfield        #375 <Field int azh.d>
	// 6242 11646:aload_0         
	// 6243 11647:getfield        #12  <Field azh a>
	// 6244 11650:getfield        #372 <Field int azh.ca>
	// 6245 11653:ixor            
	// 6246 11654:putfield        #372 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 6247 11657:aload_0         
	// 6248 11658:getfield        #12  <Field azh a>
	// 6249 11661:astore_1        
		abyte0.cC = ((azh) (abyte0)).ca ^ a.cC;
	// 6250 11662:aload_1         
	// 6251 11663:aload_1         
	// 6252 11664:getfield        #372 <Field int azh.ca>
	// 6253 11667:aload_0         
	// 6254 11668:getfield        #12  <Field azh a>
	// 6255 11671:getfield        #59  <Field int azh.cC>
	// 6256 11674:ixor            
	// 6257 11675:putfield        #59  <Field int azh.cC>
		abyte0 = ((byte []) (a));
	// 6258 11678:aload_0         
	// 6259 11679:getfield        #12  <Field azh a>
	// 6260 11682:astore_1        
		abyte0.ca = ((azh) (abyte0)).bC & a.o;
	// 6261 11683:aload_1         
	// 6262 11684:aload_1         
	// 6263 11685:getfield        #352 <Field int azh.bC>
	// 6264 11688:aload_0         
	// 6265 11689:getfield        #12  <Field azh a>
	// 6266 11692:getfield        #378 <Field int azh.o>
	// 6267 11695:iand            
	// 6268 11696:putfield        #372 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 6269 11699:aload_0         
	// 6270 11700:getfield        #12  <Field azh a>
	// 6271 11703:astore_1        
		abyte0.ca = ((azh) (abyte0)).s ^ a.ca;
	// 6272 11704:aload_1         
	// 6273 11705:aload_1         
	// 6274 11706:getfield        #381 <Field int azh.s>
	// 6275 11709:aload_0         
	// 6276 11710:getfield        #12  <Field azh a>
	// 6277 11713:getfield        #372 <Field int azh.ca>
	// 6278 11716:ixor            
	// 6279 11717:putfield        #372 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 6280 11720:aload_0         
	// 6281 11721:getfield        #12  <Field azh a>
	// 6282 11724:astore_1        
		abyte0.ca = ((azh) (abyte0)).E | a.ca;
	// 6283 11725:aload_1         
	// 6284 11726:aload_1         
	// 6285 11727:getfield        #363 <Field int azh.E>
	// 6286 11730:aload_0         
	// 6287 11731:getfield        #12  <Field azh a>
	// 6288 11734:getfield        #372 <Field int azh.ca>
	// 6289 11737:ior             
	// 6290 11738:putfield        #372 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 6291 11741:aload_0         
	// 6292 11742:getfield        #12  <Field azh a>
	// 6293 11745:astore_1        
		abyte0.ca = ((azh) (abyte0)).bv ^ a.ca;
	// 6294 11746:aload_1         
	// 6295 11747:aload_1         
	// 6296 11748:getfield        #349 <Field int azh.bv>
	// 6297 11751:aload_0         
	// 6298 11752:getfield        #12  <Field azh a>
	// 6299 11755:getfield        #372 <Field int azh.ca>
	// 6300 11758:ixor            
	// 6301 11759:putfield        #372 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 6302 11762:aload_0         
	// 6303 11763:getfield        #12  <Field azh a>
	// 6304 11766:astore_1        
		abyte0.bL = ((azh) (abyte0)).bC & ~a.bL;
	// 6305 11767:aload_1         
	// 6306 11768:aload_1         
	// 6307 11769:getfield        #352 <Field int azh.bC>
	// 6308 11772:aload_0         
	// 6309 11773:getfield        #12  <Field azh a>
	// 6310 11776:getfield        #360 <Field int azh.bL>
	// 6311 11779:iconst_m1       
	// 6312 11780:ixor            
	// 6313 11781:iand            
	// 6314 11782:putfield        #360 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 6315 11785:aload_0         
	// 6316 11786:getfield        #12  <Field azh a>
	// 6317 11789:astore_1        
		abyte0.bL = ((azh) (abyte0)).W ^ a.bL;
	// 6318 11790:aload_1         
	// 6319 11791:aload_1         
	// 6320 11792:getfield        #357 <Field int azh.W>
	// 6321 11795:aload_0         
	// 6322 11796:getfield        #12  <Field azh a>
	// 6323 11799:getfield        #360 <Field int azh.bL>
	// 6324 11802:ixor            
	// 6325 11803:putfield        #360 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 6326 11806:aload_0         
	// 6327 11807:getfield        #12  <Field azh a>
	// 6328 11810:astore_1        
		abyte0.bL = ((azh) (abyte0)).E | a.bL;
	// 6329 11811:aload_1         
	// 6330 11812:aload_1         
	// 6331 11813:getfield        #363 <Field int azh.E>
	// 6332 11816:aload_0         
	// 6333 11817:getfield        #12  <Field azh a>
	// 6334 11820:getfield        #360 <Field int azh.bL>
	// 6335 11823:ior             
	// 6336 11824:putfield        #360 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 6337 11827:aload_0         
	// 6338 11828:getfield        #12  <Field azh a>
	// 6339 11831:astore_1        
		abyte0.W = ((azh) (abyte0)).bC & a.ba;
	// 6340 11832:aload_1         
	// 6341 11833:aload_1         
	// 6342 11834:getfield        #352 <Field int azh.bC>
	// 6343 11837:aload_0         
	// 6344 11838:getfield        #12  <Field azh a>
	// 6345 11841:getfield        #366 <Field int azh.ba>
	// 6346 11844:iand            
	// 6347 11845:putfield        #357 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 6348 11848:aload_0         
	// 6349 11849:getfield        #12  <Field azh a>
	// 6350 11852:astore_1        
		abyte0.W = ((azh) (abyte0)).ba ^ a.W;
	// 6351 11853:aload_1         
	// 6352 11854:aload_1         
	// 6353 11855:getfield        #366 <Field int azh.ba>
	// 6354 11858:aload_0         
	// 6355 11859:getfield        #12  <Field azh a>
	// 6356 11862:getfield        #357 <Field int azh.W>
	// 6357 11865:ixor            
	// 6358 11866:putfield        #357 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 6359 11869:aload_0         
	// 6360 11870:getfield        #12  <Field azh a>
	// 6361 11873:astore_1        
		abyte0.bv = ((azh) (abyte0)).W & ~a.E;
	// 6362 11874:aload_1         
	// 6363 11875:aload_1         
	// 6364 11876:getfield        #357 <Field int azh.W>
	// 6365 11879:aload_0         
	// 6366 11880:getfield        #12  <Field azh a>
	// 6367 11883:getfield        #363 <Field int azh.E>
	// 6368 11886:iconst_m1       
	// 6369 11887:ixor            
	// 6370 11888:iand            
	// 6371 11889:putfield        #349 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6372 11892:aload_0         
	// 6373 11893:getfield        #12  <Field azh a>
	// 6374 11896:astore_1        
		abyte0.bv = ((azh) (abyte0)).W ^ a.bv;
	// 6375 11897:aload_1         
	// 6376 11898:aload_1         
	// 6377 11899:getfield        #357 <Field int azh.W>
	// 6378 11902:aload_0         
	// 6379 11903:getfield        #12  <Field azh a>
	// 6380 11906:getfield        #349 <Field int azh.bv>
	// 6381 11909:ixor            
	// 6382 11910:putfield        #349 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6383 11913:aload_0         
	// 6384 11914:getfield        #12  <Field azh a>
	// 6385 11917:astore_1        
		abyte0.bv = ((azh) (abyte0)).bv | a.M;
	// 6386 11918:aload_1         
	// 6387 11919:aload_1         
	// 6388 11920:getfield        #349 <Field int azh.bv>
	// 6389 11923:aload_0         
	// 6390 11924:getfield        #12  <Field azh a>
	// 6391 11927:getfield        #167 <Field int azh.M>
	// 6392 11930:ior             
	// 6393 11931:putfield        #349 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6394 11934:aload_0         
	// 6395 11935:getfield        #12  <Field azh a>
	// 6396 11938:astore_1        
		abyte0.W = ((azh) (abyte0)).bC & ~a.aP;
	// 6397 11939:aload_1         
	// 6398 11940:aload_1         
	// 6399 11941:getfield        #352 <Field int azh.bC>
	// 6400 11944:aload_0         
	// 6401 11945:getfield        #12  <Field azh a>
	// 6402 11948:getfield        #152 <Field int azh.aP>
	// 6403 11951:iconst_m1       
	// 6404 11952:ixor            
	// 6405 11953:iand            
	// 6406 11954:putfield        #357 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 6407 11957:aload_0         
	// 6408 11958:getfield        #12  <Field azh a>
	// 6409 11961:astore_1        
		abyte0.s = ((azh) (abyte0)).be & a.W;
	// 6410 11962:aload_1         
	// 6411 11963:aload_1         
	// 6412 11964:getfield        #149 <Field int azh.be>
	// 6413 11967:aload_0         
	// 6414 11968:getfield        #12  <Field azh a>
	// 6415 11971:getfield        #357 <Field int azh.W>
	// 6416 11974:iand            
	// 6417 11975:putfield        #381 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 6418 11978:aload_0         
	// 6419 11979:getfield        #12  <Field azh a>
	// 6420 11982:astore_1        
		abyte0.d = ((azh) (abyte0)).W ^ a.be;
	// 6421 11983:aload_1         
	// 6422 11984:aload_1         
	// 6423 11985:getfield        #357 <Field int azh.W>
	// 6424 11988:aload_0         
	// 6425 11989:getfield        #12  <Field azh a>
	// 6426 11992:getfield        #149 <Field int azh.be>
	// 6427 11995:ixor            
	// 6428 11996:putfield        #375 <Field int azh.d>
		abyte0 = ((byte []) (a));
	// 6429 11999:aload_0         
	// 6430 12000:getfield        #12  <Field azh a>
	// 6431 12003:astore_1        
		abyte0.d = ((azh) (abyte0)).d & a.K;
	// 6432 12004:aload_1         
	// 6433 12005:aload_1         
	// 6434 12006:getfield        #375 <Field int azh.d>
	// 6435 12009:aload_0         
	// 6436 12010:getfield        #12  <Field azh a>
	// 6437 12013:getfield        #331 <Field int azh.K>
	// 6438 12016:iand            
	// 6439 12017:putfield        #375 <Field int azh.d>
		abyte0 = ((byte []) (a));
	// 6440 12020:aload_0         
	// 6441 12021:getfield        #12  <Field azh a>
	// 6442 12024:astore_1        
		abyte0.d = ((azh) (abyte0)).d & ~a.cF;
	// 6443 12025:aload_1         
	// 6444 12026:aload_1         
	// 6445 12027:getfield        #375 <Field int azh.d>
	// 6446 12030:aload_0         
	// 6447 12031:getfield        #12  <Field azh a>
	// 6448 12034:getfield        #369 <Field int azh.cF>
	// 6449 12037:iconst_m1       
	// 6450 12038:ixor            
	// 6451 12039:iand            
	// 6452 12040:putfield        #375 <Field int azh.d>
		abyte0 = ((byte []) (a));
	// 6453 12043:aload_0         
	// 6454 12044:getfield        #12  <Field azh a>
	// 6455 12047:astore_1        
		abyte0.cc = ((azh) (abyte0)).W & a.K;
	// 6456 12048:aload_1         
	// 6457 12049:aload_1         
	// 6458 12050:getfield        #357 <Field int azh.W>
	// 6459 12053:aload_0         
	// 6460 12054:getfield        #12  <Field azh a>
	// 6461 12057:getfield        #331 <Field int azh.K>
	// 6462 12060:iand            
	// 6463 12061:putfield        #262 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 6464 12064:aload_0         
	// 6465 12065:getfield        #12  <Field azh a>
	// 6466 12068:astore_1        
		abyte0.cg = ((azh) (abyte0)).bC & ~a.cg;
	// 6467 12069:aload_1         
	// 6468 12070:aload_1         
	// 6469 12071:getfield        #352 <Field int azh.bC>
	// 6470 12074:aload_0         
	// 6471 12075:getfield        #12  <Field azh a>
	// 6472 12078:getfield        #384 <Field int azh.cg>
	// 6473 12081:iconst_m1       
	// 6474 12082:ixor            
	// 6475 12083:iand            
	// 6476 12084:putfield        #384 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 6477 12087:aload_0         
	// 6478 12088:getfield        #12  <Field azh a>
	// 6479 12091:astore_1        
		abyte0.cg = ((azh) (abyte0)).bH ^ a.cg;
	// 6480 12092:aload_1         
	// 6481 12093:aload_1         
	// 6482 12094:getfield        #387 <Field int azh.bH>
	// 6483 12097:aload_0         
	// 6484 12098:getfield        #12  <Field azh a>
	// 6485 12101:getfield        #384 <Field int azh.cg>
	// 6486 12104:ixor            
	// 6487 12105:putfield        #384 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 6488 12108:aload_0         
	// 6489 12109:getfield        #12  <Field azh a>
	// 6490 12112:astore_1        
		abyte0.r = ((azh) (abyte0)).cg ^ a.r;
	// 6491 12113:aload_1         
	// 6492 12114:aload_1         
	// 6493 12115:getfield        #384 <Field int azh.cg>
	// 6494 12118:aload_0         
	// 6495 12119:getfield        #12  <Field azh a>
	// 6496 12122:getfield        #390 <Field int azh.r>
	// 6497 12125:ixor            
	// 6498 12126:putfield        #390 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 6499 12129:aload_0         
	// 6500 12130:getfield        #12  <Field azh a>
	// 6501 12133:astore_1        
		abyte0.bv = ((azh) (abyte0)).r ^ a.bv;
	// 6502 12134:aload_1         
	// 6503 12135:aload_1         
	// 6504 12136:getfield        #390 <Field int azh.r>
	// 6505 12139:aload_0         
	// 6506 12140:getfield        #12  <Field azh a>
	// 6507 12143:getfield        #349 <Field int azh.bv>
	// 6508 12146:ixor            
	// 6509 12147:putfield        #349 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6510 12150:aload_0         
	// 6511 12151:getfield        #12  <Field azh a>
	// 6512 12154:astore_1        
		abyte0.bi = ((azh) (abyte0)).bv ^ a.bi;
	// 6513 12155:aload_1         
	// 6514 12156:aload_1         
	// 6515 12157:getfield        #349 <Field int azh.bv>
	// 6516 12160:aload_0         
	// 6517 12161:getfield        #12  <Field azh a>
	// 6518 12164:getfield        #393 <Field int azh.bi>
	// 6519 12167:ixor            
	// 6520 12168:putfield        #393 <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 6521 12171:aload_0         
	// 6522 12172:getfield        #12  <Field azh a>
	// 6523 12175:astore_1        
		abyte0.bv = ((azh) (abyte0)).P ^ a.bi;
	// 6524 12176:aload_1         
	// 6525 12177:aload_1         
	// 6526 12178:getfield        #164 <Field int azh.P>
	// 6527 12181:aload_0         
	// 6528 12182:getfield        #12  <Field azh a>
	// 6529 12185:getfield        #393 <Field int azh.bi>
	// 6530 12188:ixor            
	// 6531 12189:putfield        #349 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6532 12192:aload_0         
	// 6533 12193:getfield        #12  <Field azh a>
	// 6534 12196:astore_1        
		abyte0.r = ((azh) (abyte0)).bv ^ a.l;
	// 6535 12197:aload_1         
	// 6536 12198:aload_1         
	// 6537 12199:getfield        #349 <Field int azh.bv>
	// 6538 12202:aload_0         
	// 6539 12203:getfield        #12  <Field azh a>
	// 6540 12206:getfield        #346 <Field int azh.l>
	// 6541 12209:ixor            
	// 6542 12210:putfield        #390 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 6543 12213:aload_0         
	// 6544 12214:getfield        #12  <Field azh a>
	// 6545 12217:astore_1        
		abyte0.r = ((azh) (abyte0)).r | a.bE;
	// 6546 12218:aload_1         
	// 6547 12219:aload_1         
	// 6548 12220:getfield        #390 <Field int azh.r>
	// 6549 12223:aload_0         
	// 6550 12224:getfield        #12  <Field azh a>
	// 6551 12227:getfield        #292 <Field int azh.bE>
	// 6552 12230:ior             
	// 6553 12231:putfield        #390 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 6554 12234:aload_0         
	// 6555 12235:getfield        #12  <Field azh a>
	// 6556 12238:astore_1        
		abyte0.cg = ((azh) (abyte0)).l & ~a.bv;
	// 6557 12239:aload_1         
	// 6558 12240:aload_1         
	// 6559 12241:getfield        #346 <Field int azh.l>
	// 6560 12244:aload_0         
	// 6561 12245:getfield        #12  <Field azh a>
	// 6562 12248:getfield        #349 <Field int azh.bv>
	// 6563 12251:iconst_m1       
	// 6564 12252:ixor            
	// 6565 12253:iand            
	// 6566 12254:putfield        #384 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 6567 12257:aload_0         
	// 6568 12258:getfield        #12  <Field azh a>
	// 6569 12261:astore_1        
		abyte0.bH = ((azh) (abyte0)).l & ~a.bv;
	// 6570 12262:aload_1         
	// 6571 12263:aload_1         
	// 6572 12264:getfield        #346 <Field int azh.l>
	// 6573 12267:aload_0         
	// 6574 12268:getfield        #12  <Field azh a>
	// 6575 12271:getfield        #349 <Field int azh.bv>
	// 6576 12274:iconst_m1       
	// 6577 12275:ixor            
	// 6578 12276:iand            
	// 6579 12277:putfield        #387 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 6580 12280:aload_0         
	// 6581 12281:getfield        #12  <Field azh a>
	// 6582 12284:astore_1        
		abyte0.bH = ((azh) (abyte0)).bv ^ a.bH;
	// 6583 12285:aload_1         
	// 6584 12286:aload_1         
	// 6585 12287:getfield        #349 <Field int azh.bv>
	// 6586 12290:aload_0         
	// 6587 12291:getfield        #12  <Field azh a>
	// 6588 12294:getfield        #387 <Field int azh.bH>
	// 6589 12297:ixor            
	// 6590 12298:putfield        #387 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 6591 12301:aload_0         
	// 6592 12302:getfield        #12  <Field azh a>
	// 6593 12305:astore_1        
		abyte0.bH = ((azh) (abyte0)).bH | a.bE;
	// 6594 12306:aload_1         
	// 6595 12307:aload_1         
	// 6596 12308:getfield        #387 <Field int azh.bH>
	// 6597 12311:aload_0         
	// 6598 12312:getfield        #12  <Field azh a>
	// 6599 12315:getfield        #292 <Field int azh.bE>
	// 6600 12318:ior             
	// 6601 12319:putfield        #387 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 6602 12322:aload_0         
	// 6603 12323:getfield        #12  <Field azh a>
	// 6604 12326:astore_1        
		abyte0.t = ((azh) (abyte0)).bi & ~a.P;
	// 6605 12327:aload_1         
	// 6606 12328:aload_1         
	// 6607 12329:getfield        #393 <Field int azh.bi>
	// 6608 12332:aload_0         
	// 6609 12333:getfield        #12  <Field azh a>
	// 6610 12336:getfield        #164 <Field int azh.P>
	// 6611 12339:iconst_m1       
	// 6612 12340:ixor            
	// 6613 12341:iand            
	// 6614 12342:putfield        #232 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 6615 12345:aload_0         
	// 6616 12346:getfield        #12  <Field azh a>
	// 6617 12349:astore_1        
		abyte0.bI = ((azh) (abyte0)).t ^ a.bI;
	// 6618 12350:aload_1         
	// 6619 12351:aload_1         
	// 6620 12352:getfield        #232 <Field int azh.t>
	// 6621 12355:aload_0         
	// 6622 12356:getfield        #12  <Field azh a>
	// 6623 12359:getfield        #62  <Field int azh.bI>
	// 6624 12362:ixor            
	// 6625 12363:putfield        #62  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 6626 12366:aload_0         
	// 6627 12367:getfield        #12  <Field azh a>
	// 6628 12370:astore_1        
		abyte0.bI = ((azh) (abyte0)).bE & a.bI;
	// 6629 12371:aload_1         
	// 6630 12372:aload_1         
	// 6631 12373:getfield        #292 <Field int azh.bE>
	// 6632 12376:aload_0         
	// 6633 12377:getfield        #12  <Field azh a>
	// 6634 12380:getfield        #62  <Field int azh.bI>
	// 6635 12383:iand            
	// 6636 12384:putfield        #62  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 6637 12387:aload_0         
	// 6638 12388:getfield        #12  <Field azh a>
	// 6639 12391:astore_1        
		abyte0.bI = ((azh) (abyte0)).bk ^ a.bI;
	// 6640 12392:aload_1         
	// 6641 12393:aload_1         
	// 6642 12394:getfield        #208 <Field int azh.bk>
	// 6643 12397:aload_0         
	// 6644 12398:getfield        #12  <Field azh a>
	// 6645 12401:getfield        #62  <Field int azh.bI>
	// 6646 12404:ixor            
	// 6647 12405:putfield        #62  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 6648 12408:aload_0         
	// 6649 12409:getfield        #12  <Field azh a>
	// 6650 12412:astore_1        
		abyte0.au = ((azh) (abyte0)).bi & ~a.t;
	// 6651 12413:aload_1         
	// 6652 12414:aload_1         
	// 6653 12415:getfield        #393 <Field int azh.bi>
	// 6654 12418:aload_0         
	// 6655 12419:getfield        #12  <Field azh a>
	// 6656 12422:getfield        #232 <Field int azh.t>
	// 6657 12425:iconst_m1       
	// 6658 12426:ixor            
	// 6659 12427:iand            
	// 6660 12428:putfield        #256 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 6661 12431:aload_0         
	// 6662 12432:getfield        #12  <Field azh a>
	// 6663 12435:astore_1        
		abyte0.au = ((azh) (abyte0)).l & ~a.au;
	// 6664 12436:aload_1         
	// 6665 12437:aload_1         
	// 6666 12438:getfield        #346 <Field int azh.l>
	// 6667 12441:aload_0         
	// 6668 12442:getfield        #12  <Field azh a>
	// 6669 12445:getfield        #256 <Field int azh.au>
	// 6670 12448:iconst_m1       
	// 6671 12449:ixor            
	// 6672 12450:iand            
	// 6673 12451:putfield        #256 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 6674 12454:aload_0         
	// 6675 12455:getfield        #12  <Field azh a>
	// 6676 12458:astore_1        
		abyte0.au = ((azh) (abyte0)).t ^ a.au;
	// 6677 12459:aload_1         
	// 6678 12460:aload_1         
	// 6679 12461:getfield        #232 <Field int azh.t>
	// 6680 12464:aload_0         
	// 6681 12465:getfield        #12  <Field azh a>
	// 6682 12468:getfield        #256 <Field int azh.au>
	// 6683 12471:ixor            
	// 6684 12472:putfield        #256 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 6685 12475:aload_0         
	// 6686 12476:getfield        #12  <Field azh a>
	// 6687 12479:astore_1        
		abyte0.au = ((azh) (abyte0)).au | a.bE;
	// 6688 12480:aload_1         
	// 6689 12481:aload_1         
	// 6690 12482:getfield        #256 <Field int azh.au>
	// 6691 12485:aload_0         
	// 6692 12486:getfield        #12  <Field azh a>
	// 6693 12489:getfield        #292 <Field int azh.bE>
	// 6694 12492:ior             
	// 6695 12493:putfield        #256 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 6696 12496:aload_0         
	// 6697 12497:getfield        #12  <Field azh a>
	// 6698 12500:astore_1        
		abyte0.cB = ((azh) (abyte0)).l & a.t;
	// 6699 12501:aload_1         
	// 6700 12502:aload_1         
	// 6701 12503:getfield        #346 <Field int azh.l>
	// 6702 12506:aload_0         
	// 6703 12507:getfield        #12  <Field azh a>
	// 6704 12510:getfield        #232 <Field int azh.t>
	// 6705 12513:iand            
	// 6706 12514:putfield        #265 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 6707 12517:aload_0         
	// 6708 12518:getfield        #12  <Field azh a>
	// 6709 12521:astore_1        
		abyte0.cB = ((azh) (abyte0)).cB & ~a.bE;
	// 6710 12522:aload_1         
	// 6711 12523:aload_1         
	// 6712 12524:getfield        #265 <Field int azh.cB>
	// 6713 12527:aload_0         
	// 6714 12528:getfield        #12  <Field azh a>
	// 6715 12531:getfield        #292 <Field int azh.bE>
	// 6716 12534:iconst_m1       
	// 6717 12535:ixor            
	// 6718 12536:iand            
	// 6719 12537:putfield        #265 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 6720 12540:aload_0         
	// 6721 12541:getfield        #12  <Field azh a>
	// 6722 12544:astore_1        
		abyte0.ai = ((azh) (abyte0)).t & ~a.bE;
	// 6723 12545:aload_1         
	// 6724 12546:aload_1         
	// 6725 12547:getfield        #232 <Field int azh.t>
	// 6726 12550:aload_0         
	// 6727 12551:getfield        #12  <Field azh a>
	// 6728 12554:getfield        #292 <Field int azh.bE>
	// 6729 12557:iconst_m1       
	// 6730 12558:ixor            
	// 6731 12559:iand            
	// 6732 12560:putfield        #214 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 6733 12563:aload_0         
	// 6734 12564:getfield        #12  <Field azh a>
	// 6735 12567:astore_1        
		abyte0.ai = ((azh) (abyte0)).l ^ a.ai;
	// 6736 12568:aload_1         
	// 6737 12569:aload_1         
	// 6738 12570:getfield        #346 <Field int azh.l>
	// 6739 12573:aload_0         
	// 6740 12574:getfield        #12  <Field azh a>
	// 6741 12577:getfield        #214 <Field int azh.ai>
	// 6742 12580:ixor            
	// 6743 12581:putfield        #214 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 6744 12584:aload_0         
	// 6745 12585:getfield        #12  <Field azh a>
	// 6746 12588:astore_1        
		abyte0.cl = ((azh) (abyte0)).t ^ a.l;
	// 6747 12589:aload_1         
	// 6748 12590:aload_1         
	// 6749 12591:getfield        #232 <Field int azh.t>
	// 6750 12594:aload_0         
	// 6751 12595:getfield        #12  <Field azh a>
	// 6752 12598:getfield        #346 <Field int azh.l>
	// 6753 12601:ixor            
	// 6754 12602:putfield        #247 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 6755 12605:aload_0         
	// 6756 12606:getfield        #12  <Field azh a>
	// 6757 12609:astore_1        
		abyte0.bs = ((azh) (abyte0)).cl | a.bE;
	// 6758 12610:aload_1         
	// 6759 12611:aload_1         
	// 6760 12612:getfield        #247 <Field int azh.cl>
	// 6761 12615:aload_0         
	// 6762 12616:getfield        #12  <Field azh a>
	// 6763 12619:getfield        #292 <Field int azh.bE>
	// 6764 12622:ior             
	// 6765 12623:putfield        #95  <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 6766 12626:aload_0         
	// 6767 12627:getfield        #12  <Field azh a>
	// 6768 12630:astore_1        
		abyte0.bs = ((azh) (abyte0)).bk ^ a.bs;
	// 6769 12631:aload_1         
	// 6770 12632:aload_1         
	// 6771 12633:getfield        #208 <Field int azh.bk>
	// 6772 12636:aload_0         
	// 6773 12637:getfield        #12  <Field azh a>
	// 6774 12640:getfield        #95  <Field int azh.bs>
	// 6775 12643:ixor            
	// 6776 12644:putfield        #95  <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 6777 12647:aload_0         
	// 6778 12648:getfield        #12  <Field azh a>
	// 6779 12651:astore_1        
		abyte0.bk = ((azh) (abyte0)).l & ~a.t;
	// 6780 12652:aload_1         
	// 6781 12653:aload_1         
	// 6782 12654:getfield        #346 <Field int azh.l>
	// 6783 12657:aload_0         
	// 6784 12658:getfield        #12  <Field azh a>
	// 6785 12661:getfield        #232 <Field int azh.t>
	// 6786 12664:iconst_m1       
	// 6787 12665:ixor            
	// 6788 12666:iand            
	// 6789 12667:putfield        #208 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 6790 12670:aload_0         
	// 6791 12671:getfield        #12  <Field azh a>
	// 6792 12674:astore_1        
		abyte0.bk = ((azh) (abyte0)).bv ^ a.bk;
	// 6793 12675:aload_1         
	// 6794 12676:aload_1         
	// 6795 12677:getfield        #349 <Field int azh.bv>
	// 6796 12680:aload_0         
	// 6797 12681:getfield        #12  <Field azh a>
	// 6798 12684:getfield        #208 <Field int azh.bk>
	// 6799 12687:ixor            
	// 6800 12688:putfield        #208 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 6801 12691:aload_0         
	// 6802 12692:getfield        #12  <Field azh a>
	// 6803 12695:astore_1        
		abyte0.bv = ((azh) (abyte0)).bk | a.bE;
	// 6804 12696:aload_1         
	// 6805 12697:aload_1         
	// 6806 12698:getfield        #208 <Field int azh.bk>
	// 6807 12701:aload_0         
	// 6808 12702:getfield        #12  <Field azh a>
	// 6809 12705:getfield        #292 <Field int azh.bE>
	// 6810 12708:ior             
	// 6811 12709:putfield        #349 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6812 12712:aload_0         
	// 6813 12713:getfield        #12  <Field azh a>
	// 6814 12716:astore_1        
		abyte0.bk = ((azh) (abyte0)).bk ^ a.bE;
	// 6815 12717:aload_1         
	// 6816 12718:aload_1         
	// 6817 12719:getfield        #208 <Field int azh.bk>
	// 6818 12722:aload_0         
	// 6819 12723:getfield        #12  <Field azh a>
	// 6820 12726:getfield        #292 <Field int azh.bE>
	// 6821 12729:ixor            
	// 6822 12730:putfield        #208 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 6823 12733:aload_0         
	// 6824 12734:getfield        #12  <Field azh a>
	// 6825 12737:astore_1        
		abyte0.i = ((azh) (abyte0)).P & ~a.bi;
	// 6826 12738:aload_1         
	// 6827 12739:aload_1         
	// 6828 12740:getfield        #164 <Field int azh.P>
	// 6829 12743:aload_0         
	// 6830 12744:getfield        #12  <Field azh a>
	// 6831 12747:getfield        #393 <Field int azh.bi>
	// 6832 12750:iconst_m1       
	// 6833 12751:ixor            
	// 6834 12752:iand            
	// 6835 12753:putfield        #396 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 6836 12756:aload_0         
	// 6837 12757:getfield        #12  <Field azh a>
	// 6838 12760:astore_1        
		abyte0.cg = ((azh) (abyte0)).i ^ a.cg;
	// 6839 12761:aload_1         
	// 6840 12762:aload_1         
	// 6841 12763:getfield        #396 <Field int azh.i>
	// 6842 12766:aload_0         
	// 6843 12767:getfield        #12  <Field azh a>
	// 6844 12770:getfield        #384 <Field int azh.cg>
	// 6845 12773:ixor            
	// 6846 12774:putfield        #384 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 6847 12777:aload_0         
	// 6848 12778:getfield        #12  <Field azh a>
	// 6849 12781:astore_1        
		abyte0.S = ((azh) (abyte0)).cg ^ a.S;
	// 6850 12782:aload_1         
	// 6851 12783:aload_1         
	// 6852 12784:getfield        #384 <Field int azh.cg>
	// 6853 12787:aload_0         
	// 6854 12788:getfield        #12  <Field azh a>
	// 6855 12791:getfield        #74  <Field int azh.S>
	// 6856 12794:ixor            
	// 6857 12795:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 6858 12798:aload_0         
	// 6859 12799:getfield        #12  <Field azh a>
	// 6860 12802:astore_1        
		abyte0.cg = ((azh) (abyte0)).bi | a.i;
	// 6861 12803:aload_1         
	// 6862 12804:aload_1         
	// 6863 12805:getfield        #393 <Field int azh.bi>
	// 6864 12808:aload_0         
	// 6865 12809:getfield        #12  <Field azh a>
	// 6866 12812:getfield        #396 <Field int azh.i>
	// 6867 12815:ior             
	// 6868 12816:putfield        #384 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 6869 12819:aload_0         
	// 6870 12820:getfield        #12  <Field azh a>
	// 6871 12823:astore_1        
		abyte0.aH = ((azh) (abyte0)).l & a.cg;
	// 6872 12824:aload_1         
	// 6873 12825:aload_1         
	// 6874 12826:getfield        #346 <Field int azh.l>
	// 6875 12829:aload_0         
	// 6876 12830:getfield        #12  <Field azh a>
	// 6877 12833:getfield        #384 <Field int azh.cg>
	// 6878 12836:iand            
	// 6879 12837:putfield        #399 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 6880 12840:aload_0         
	// 6881 12841:getfield        #12  <Field azh a>
	// 6882 12844:astore_1        
		abyte0.aH = ((azh) (abyte0)).i ^ a.aH;
	// 6883 12845:aload_1         
	// 6884 12846:aload_1         
	// 6885 12847:getfield        #396 <Field int azh.i>
	// 6886 12850:aload_0         
	// 6887 12851:getfield        #12  <Field azh a>
	// 6888 12854:getfield        #399 <Field int azh.aH>
	// 6889 12857:ixor            
	// 6890 12858:putfield        #399 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 6891 12861:aload_0         
	// 6892 12862:getfield        #12  <Field azh a>
	// 6893 12865:astore_1        
		abyte0.cx = ((azh) (abyte0)).bE & a.cg;
	// 6894 12866:aload_1         
	// 6895 12867:aload_1         
	// 6896 12868:getfield        #292 <Field int azh.bE>
	// 6897 12871:aload_0         
	// 6898 12872:getfield        #12  <Field azh a>
	// 6899 12875:getfield        #384 <Field int azh.cg>
	// 6900 12878:iand            
	// 6901 12879:putfield        #402 <Field int azh.cx>
		abyte0 = ((byte []) (a));
	// 6902 12882:aload_0         
	// 6903 12883:getfield        #12  <Field azh a>
	// 6904 12886:astore_1        
		abyte0.cx = ((azh) (abyte0)).cl ^ a.cx;
	// 6905 12887:aload_1         
	// 6906 12888:aload_1         
	// 6907 12889:getfield        #247 <Field int azh.cl>
	// 6908 12892:aload_0         
	// 6909 12893:getfield        #12  <Field azh a>
	// 6910 12896:getfield        #402 <Field int azh.cx>
	// 6911 12899:ixor            
	// 6912 12900:putfield        #402 <Field int azh.cx>
		abyte0 = ((byte []) (a));
	// 6913 12903:aload_0         
	// 6914 12904:getfield        #12  <Field azh a>
	// 6915 12907:astore_1        
		abyte0.cl = ((azh) (abyte0)).l & a.cg;
	// 6916 12908:aload_1         
	// 6917 12909:aload_1         
	// 6918 12910:getfield        #346 <Field int azh.l>
	// 6919 12913:aload_0         
	// 6920 12914:getfield        #12  <Field azh a>
	// 6921 12917:getfield        #384 <Field int azh.cg>
	// 6922 12920:iand            
	// 6923 12921:putfield        #247 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 6924 12924:aload_0         
	// 6925 12925:getfield        #12  <Field azh a>
	// 6926 12928:astore_1        
		abyte0.cl = ((azh) (abyte0)).t ^ a.cl;
	// 6927 12929:aload_1         
	// 6928 12930:aload_1         
	// 6929 12931:getfield        #232 <Field int azh.t>
	// 6930 12934:aload_0         
	// 6931 12935:getfield        #12  <Field azh a>
	// 6932 12938:getfield        #247 <Field int azh.cl>
	// 6933 12941:ixor            
	// 6934 12942:putfield        #247 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 6935 12945:aload_0         
	// 6936 12946:getfield        #12  <Field azh a>
	// 6937 12949:astore_1        
		abyte0.cl = ((azh) (abyte0)).cl ^ a.bE;
	// 6938 12950:aload_1         
	// 6939 12951:aload_1         
	// 6940 12952:getfield        #247 <Field int azh.cl>
	// 6941 12955:aload_0         
	// 6942 12956:getfield        #12  <Field azh a>
	// 6943 12959:getfield        #292 <Field int azh.bE>
	// 6944 12962:ixor            
	// 6945 12963:putfield        #247 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 6946 12966:aload_0         
	// 6947 12967:getfield        #12  <Field azh a>
	// 6948 12970:astore_1        
		abyte0.ce = ((azh) (abyte0)).l & a.cg;
	// 6949 12971:aload_1         
	// 6950 12972:aload_1         
	// 6951 12973:getfield        #346 <Field int azh.l>
	// 6952 12976:aload_0         
	// 6953 12977:getfield        #12  <Field azh a>
	// 6954 12980:getfield        #384 <Field int azh.cg>
	// 6955 12983:iand            
	// 6956 12984:putfield        #405 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 6957 12987:aload_0         
	// 6958 12988:getfield        #12  <Field azh a>
	// 6959 12991:astore_1        
		abyte0.ce = ((azh) (abyte0)).bi ^ a.ce;
	// 6960 12992:aload_1         
	// 6961 12993:aload_1         
	// 6962 12994:getfield        #393 <Field int azh.bi>
	// 6963 12997:aload_0         
	// 6964 12998:getfield        #12  <Field azh a>
	// 6965 13001:getfield        #405 <Field int azh.ce>
	// 6966 13004:ixor            
	// 6967 13005:putfield        #405 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 6968 13008:aload_0         
	// 6969 13009:getfield        #12  <Field azh a>
	// 6970 13012:astore_1        
		abyte0.ce = ((azh) (abyte0)).ce | a.bE;
	// 6971 13013:aload_1         
	// 6972 13014:aload_1         
	// 6973 13015:getfield        #405 <Field int azh.ce>
	// 6974 13018:aload_0         
	// 6975 13019:getfield        #12  <Field azh a>
	// 6976 13022:getfield        #292 <Field int azh.bE>
	// 6977 13025:ior             
	// 6978 13026:putfield        #405 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 6979 13029:aload_0         
	// 6980 13030:getfield        #12  <Field azh a>
	// 6981 13033:astore_1        
		abyte0.i = ((azh) (abyte0)).l & a.i;
	// 6982 13034:aload_1         
	// 6983 13035:aload_1         
	// 6984 13036:getfield        #346 <Field int azh.l>
	// 6985 13039:aload_0         
	// 6986 13040:getfield        #12  <Field azh a>
	// 6987 13043:getfield        #396 <Field int azh.i>
	// 6988 13046:iand            
	// 6989 13047:putfield        #396 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 6990 13050:aload_0         
	// 6991 13051:getfield        #12  <Field azh a>
	// 6992 13054:astore_1        
		abyte0.i = ((azh) (abyte0)).t ^ a.i;
	// 6993 13055:aload_1         
	// 6994 13056:aload_1         
	// 6995 13057:getfield        #232 <Field int azh.t>
	// 6996 13060:aload_0         
	// 6997 13061:getfield        #12  <Field azh a>
	// 6998 13064:getfield        #396 <Field int azh.i>
	// 6999 13067:ixor            
	// 7000 13068:putfield        #396 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 7001 13071:aload_0         
	// 7002 13072:getfield        #12  <Field azh a>
	// 7003 13075:astore_1        
		abyte0.ce = ((azh) (abyte0)).i ^ a.ce;
	// 7004 13076:aload_1         
	// 7005 13077:aload_1         
	// 7006 13078:getfield        #396 <Field int azh.i>
	// 7007 13081:aload_0         
	// 7008 13082:getfield        #12  <Field azh a>
	// 7009 13085:getfield        #405 <Field int azh.ce>
	// 7010 13088:ixor            
	// 7011 13089:putfield        #405 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 7012 13092:aload_0         
	// 7013 13093:getfield        #12  <Field azh a>
	// 7014 13096:astore_1        
		abyte0.i = ((azh) (abyte0)).l & a.bi;
	// 7015 13097:aload_1         
	// 7016 13098:aload_1         
	// 7017 13099:getfield        #346 <Field int azh.l>
	// 7018 13102:aload_0         
	// 7019 13103:getfield        #12  <Field azh a>
	// 7020 13106:getfield        #393 <Field int azh.bi>
	// 7021 13109:iand            
	// 7022 13110:putfield        #396 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 7023 13113:aload_0         
	// 7024 13114:getfield        #12  <Field azh a>
	// 7025 13117:astore_1        
		abyte0.au = ((azh) (abyte0)).i ^ a.au;
	// 7026 13118:aload_1         
	// 7027 13119:aload_1         
	// 7028 13120:getfield        #396 <Field int azh.i>
	// 7029 13123:aload_0         
	// 7030 13124:getfield        #12  <Field azh a>
	// 7031 13127:getfield        #256 <Field int azh.au>
	// 7032 13130:ixor            
	// 7033 13131:putfield        #256 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 7034 13134:aload_0         
	// 7035 13135:getfield        #12  <Field azh a>
	// 7036 13138:astore_1        
		abyte0.i = ((azh) (abyte0)).l & a.bi;
	// 7037 13139:aload_1         
	// 7038 13140:aload_1         
	// 7039 13141:getfield        #346 <Field int azh.l>
	// 7040 13144:aload_0         
	// 7041 13145:getfield        #12  <Field azh a>
	// 7042 13148:getfield        #393 <Field int azh.bi>
	// 7043 13151:iand            
	// 7044 13152:putfield        #396 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 7045 13155:aload_0         
	// 7046 13156:getfield        #12  <Field azh a>
	// 7047 13159:astore_1        
		abyte0.t = ((azh) (abyte0)).P & a.bi;
	// 7048 13160:aload_1         
	// 7049 13161:aload_1         
	// 7050 13162:getfield        #164 <Field int azh.P>
	// 7051 13165:aload_0         
	// 7052 13166:getfield        #12  <Field azh a>
	// 7053 13169:getfield        #393 <Field int azh.bi>
	// 7054 13172:iand            
	// 7055 13173:putfield        #232 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 7056 13176:aload_0         
	// 7057 13177:getfield        #12  <Field azh a>
	// 7058 13180:astore_1        
		abyte0.i = ((azh) (abyte0)).t ^ a.i;
	// 7059 13181:aload_1         
	// 7060 13182:aload_1         
	// 7061 13183:getfield        #232 <Field int azh.t>
	// 7062 13186:aload_0         
	// 7063 13187:getfield        #12  <Field azh a>
	// 7064 13190:getfield        #396 <Field int azh.i>
	// 7065 13193:ixor            
	// 7066 13194:putfield        #396 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 7067 13197:aload_0         
	// 7068 13198:getfield        #12  <Field azh a>
	// 7069 13201:astore_1        
		abyte0.bH = ((azh) (abyte0)).i ^ a.bH;
	// 7070 13202:aload_1         
	// 7071 13203:aload_1         
	// 7072 13204:getfield        #396 <Field int azh.i>
	// 7073 13207:aload_0         
	// 7074 13208:getfield        #12  <Field azh a>
	// 7075 13211:getfield        #387 <Field int azh.bH>
	// 7076 13214:ixor            
	// 7077 13215:putfield        #387 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 7078 13218:aload_0         
	// 7079 13219:getfield        #12  <Field azh a>
	// 7080 13222:astore_1        
		abyte0.t = ((azh) (abyte0)).t ^ a.l;
	// 7081 13223:aload_1         
	// 7082 13224:aload_1         
	// 7083 13225:getfield        #232 <Field int azh.t>
	// 7084 13228:aload_0         
	// 7085 13229:getfield        #12  <Field azh a>
	// 7086 13232:getfield        #346 <Field int azh.l>
	// 7087 13235:ixor            
	// 7088 13236:putfield        #232 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 7089 13239:aload_0         
	// 7090 13240:getfield        #12  <Field azh a>
	// 7091 13243:astore_1        
		abyte0.bv = ((azh) (abyte0)).t ^ a.bv;
	// 7092 13244:aload_1         
	// 7093 13245:aload_1         
	// 7094 13246:getfield        #232 <Field int azh.t>
	// 7095 13249:aload_0         
	// 7096 13250:getfield        #12  <Field azh a>
	// 7097 13253:getfield        #349 <Field int azh.bv>
	// 7098 13256:ixor            
	// 7099 13257:putfield        #349 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 7100 13260:aload_0         
	// 7101 13261:getfield        #12  <Field azh a>
	// 7102 13264:astore_1        
		abyte0.t = ((azh) (abyte0)).bi | a.P;
	// 7103 13265:aload_1         
	// 7104 13266:aload_1         
	// 7105 13267:getfield        #393 <Field int azh.bi>
	// 7106 13270:aload_0         
	// 7107 13271:getfield        #12  <Field azh a>
	// 7108 13274:getfield        #164 <Field int azh.P>
	// 7109 13277:ior             
	// 7110 13278:putfield        #232 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 7111 13281:aload_0         
	// 7112 13282:getfield        #12  <Field azh a>
	// 7113 13285:astore_1        
		abyte0.t = ((azh) (abyte0)).l & ~a.t;
	// 7114 13286:aload_1         
	// 7115 13287:aload_1         
	// 7116 13288:getfield        #346 <Field int azh.l>
	// 7117 13291:aload_0         
	// 7118 13292:getfield        #12  <Field azh a>
	// 7119 13295:getfield        #232 <Field int azh.t>
	// 7120 13298:iconst_m1       
	// 7121 13299:ixor            
	// 7122 13300:iand            
	// 7123 13301:putfield        #232 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 7124 13304:aload_0         
	// 7125 13305:getfield        #12  <Field azh a>
	// 7126 13308:astore_1        
		abyte0.t = ((azh) (abyte0)).cg ^ a.t;
	// 7127 13309:aload_1         
	// 7128 13310:aload_1         
	// 7129 13311:getfield        #384 <Field int azh.cg>
	// 7130 13314:aload_0         
	// 7131 13315:getfield        #12  <Field azh a>
	// 7132 13318:getfield        #232 <Field int azh.t>
	// 7133 13321:ixor            
	// 7134 13322:putfield        #232 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 7135 13325:aload_0         
	// 7136 13326:getfield        #12  <Field azh a>
	// 7137 13329:astore_1        
		abyte0.t = ((azh) (abyte0)).t & ~a.bE;
	// 7138 13330:aload_1         
	// 7139 13331:aload_1         
	// 7140 13332:getfield        #232 <Field int azh.t>
	// 7141 13335:aload_0         
	// 7142 13336:getfield        #12  <Field azh a>
	// 7143 13339:getfield        #292 <Field int azh.bE>
	// 7144 13342:iconst_m1       
	// 7145 13343:ixor            
	// 7146 13344:iand            
	// 7147 13345:putfield        #232 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 7148 13348:aload_0         
	// 7149 13349:getfield        #12  <Field azh a>
	// 7150 13352:astore_1        
		abyte0.t = ((azh) (abyte0)).aH ^ a.t;
	// 7151 13353:aload_1         
	// 7152 13354:aload_1         
	// 7153 13355:getfield        #399 <Field int azh.aH>
	// 7154 13358:aload_0         
	// 7155 13359:getfield        #12  <Field azh a>
	// 7156 13362:getfield        #232 <Field int azh.t>
	// 7157 13365:ixor            
	// 7158 13366:putfield        #232 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 7159 13369:aload_0         
	// 7160 13370:getfield        #12  <Field azh a>
	// 7161 13373:astore_1        
		abyte0.aS = ((azh) (abyte0)).bC & ~a.aS;
	// 7162 13374:aload_1         
	// 7163 13375:aload_1         
	// 7164 13376:getfield        #352 <Field int azh.bC>
	// 7165 13379:aload_0         
	// 7166 13380:getfield        #12  <Field azh a>
	// 7167 13383:getfield        #408 <Field int azh.aS>
	// 7168 13386:iconst_m1       
	// 7169 13387:ixor            
	// 7170 13388:iand            
	// 7171 13389:putfield        #408 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 7172 13392:aload_0         
	// 7173 13393:getfield        #12  <Field azh a>
	// 7174 13396:astore_1        
		abyte0.aS = ((azh) (abyte0)).aU ^ a.aS;
	// 7175 13397:aload_1         
	// 7176 13398:aload_1         
	// 7177 13399:getfield        #411 <Field int azh.aU>
	// 7178 13402:aload_0         
	// 7179 13403:getfield        #12  <Field azh a>
	// 7180 13406:getfield        #408 <Field int azh.aS>
	// 7181 13409:ixor            
	// 7182 13410:putfield        #408 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 7183 13413:aload_0         
	// 7184 13414:getfield        #12  <Field azh a>
	// 7185 13417:astore_1        
		abyte0.aS = ((azh) (abyte0)).aS & ~a.E;
	// 7186 13418:aload_1         
	// 7187 13419:aload_1         
	// 7188 13420:getfield        #408 <Field int azh.aS>
	// 7189 13423:aload_0         
	// 7190 13424:getfield        #12  <Field azh a>
	// 7191 13427:getfield        #363 <Field int azh.E>
	// 7192 13430:iconst_m1       
	// 7193 13431:ixor            
	// 7194 13432:iand            
	// 7195 13433:putfield        #408 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 7196 13436:aload_0         
	// 7197 13437:getfield        #12  <Field azh a>
	// 7198 13440:astore_1        
		abyte0.aU = ((azh) (abyte0)).aP ^ a.bC;
	// 7199 13441:aload_1         
	// 7200 13442:aload_1         
	// 7201 13443:getfield        #152 <Field int azh.aP>
	// 7202 13446:aload_0         
	// 7203 13447:getfield        #12  <Field azh a>
	// 7204 13450:getfield        #352 <Field int azh.bC>
	// 7205 13453:ixor            
	// 7206 13454:putfield        #411 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 7207 13457:aload_0         
	// 7208 13458:getfield        #12  <Field azh a>
	// 7209 13461:astore_1        
		abyte0.cc = ((azh) (abyte0)).aU ^ a.cc;
	// 7210 13462:aload_1         
	// 7211 13463:aload_1         
	// 7212 13464:getfield        #411 <Field int azh.aU>
	// 7213 13467:aload_0         
	// 7214 13468:getfield        #12  <Field azh a>
	// 7215 13471:getfield        #262 <Field int azh.cc>
	// 7216 13474:ixor            
	// 7217 13475:putfield        #262 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 7218 13478:aload_0         
	// 7219 13479:getfield        #12  <Field azh a>
	// 7220 13482:astore_1        
		abyte0.cc = ((azh) (abyte0)).cF | a.cc;
	// 7221 13483:aload_1         
	// 7222 13484:aload_1         
	// 7223 13485:getfield        #369 <Field int azh.cF>
	// 7224 13488:aload_0         
	// 7225 13489:getfield        #12  <Field azh a>
	// 7226 13492:getfield        #262 <Field int azh.cc>
	// 7227 13495:ior             
	// 7228 13496:putfield        #262 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 7229 13499:aload_0         
	// 7230 13500:getfield        #12  <Field azh a>
	// 7231 13503:astore_1        
		abyte0.aH = ((azh) (abyte0)).be & a.bC;
	// 7232 13504:aload_1         
	// 7233 13505:aload_1         
	// 7234 13506:getfield        #149 <Field int azh.be>
	// 7235 13509:aload_0         
	// 7236 13510:getfield        #12  <Field azh a>
	// 7237 13513:getfield        #352 <Field int azh.bC>
	// 7238 13516:iand            
	// 7239 13517:putfield        #399 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 7240 13520:aload_0         
	// 7241 13521:getfield        #12  <Field azh a>
	// 7242 13524:astore_1        
		abyte0.cg = ((azh) (abyte0)).aP & a.bC;
	// 7243 13525:aload_1         
	// 7244 13526:aload_1         
	// 7245 13527:getfield        #152 <Field int azh.aP>
	// 7246 13530:aload_0         
	// 7247 13531:getfield        #12  <Field azh a>
	// 7248 13534:getfield        #352 <Field int azh.bC>
	// 7249 13537:iand            
	// 7250 13538:putfield        #384 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 7251 13541:aload_0         
	// 7252 13542:getfield        #12  <Field azh a>
	// 7253 13545:astore_1        
		abyte0.aH = ((azh) (abyte0)).cg ^ a.aH;
	// 7254 13546:aload_1         
	// 7255 13547:aload_1         
	// 7256 13548:getfield        #384 <Field int azh.cg>
	// 7257 13551:aload_0         
	// 7258 13552:getfield        #12  <Field azh a>
	// 7259 13555:getfield        #399 <Field int azh.aH>
	// 7260 13558:ixor            
	// 7261 13559:putfield        #399 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 7262 13562:aload_0         
	// 7263 13563:getfield        #12  <Field azh a>
	// 7264 13566:astore_1        
		abyte0.aH = ((azh) (abyte0)).K | a.aH;
	// 7265 13567:aload_1         
	// 7266 13568:aload_1         
	// 7267 13569:getfield        #331 <Field int azh.K>
	// 7268 13572:aload_0         
	// 7269 13573:getfield        #12  <Field azh a>
	// 7270 13576:getfield        #399 <Field int azh.aH>
	// 7271 13579:ior             
	// 7272 13580:putfield        #399 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 7273 13583:aload_0         
	// 7274 13584:getfield        #12  <Field azh a>
	// 7275 13587:astore_1        
		abyte0.i = ((azh) (abyte0)).be & ~a.cg;
	// 7276 13588:aload_1         
	// 7277 13589:aload_1         
	// 7278 13590:getfield        #149 <Field int azh.be>
	// 7279 13593:aload_0         
	// 7280 13594:getfield        #12  <Field azh a>
	// 7281 13597:getfield        #384 <Field int azh.cg>
	// 7282 13600:iconst_m1       
	// 7283 13601:ixor            
	// 7284 13602:iand            
	// 7285 13603:putfield        #396 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 7286 13606:aload_0         
	// 7287 13607:getfield        #12  <Field azh a>
	// 7288 13610:astore_1        
		abyte0.i = ((azh) (abyte0)).cg ^ a.i;
	// 7289 13611:aload_1         
	// 7290 13612:aload_1         
	// 7291 13613:getfield        #384 <Field int azh.cg>
	// 7292 13616:aload_0         
	// 7293 13617:getfield        #12  <Field azh a>
	// 7294 13620:getfield        #396 <Field int azh.i>
	// 7295 13623:ixor            
	// 7296 13624:putfield        #396 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 7297 13627:aload_0         
	// 7298 13628:getfield        #12  <Field azh a>
	// 7299 13631:astore_1        
		abyte0.i = ((azh) (abyte0)).i & ~a.cF;
	// 7300 13632:aload_1         
	// 7301 13633:aload_1         
	// 7302 13634:getfield        #396 <Field int azh.i>
	// 7303 13637:aload_0         
	// 7304 13638:getfield        #12  <Field azh a>
	// 7305 13641:getfield        #369 <Field int azh.cF>
	// 7306 13644:iconst_m1       
	// 7307 13645:ixor            
	// 7308 13646:iand            
	// 7309 13647:putfield        #396 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 7310 13650:aload_0         
	// 7311 13651:getfield        #12  <Field azh a>
	// 7312 13654:astore_1        
		abyte0.bX = ((azh) (abyte0)).be & ~a.cg;
	// 7313 13655:aload_1         
	// 7314 13656:aload_1         
	// 7315 13657:getfield        #149 <Field int azh.be>
	// 7316 13660:aload_0         
	// 7317 13661:getfield        #12  <Field azh a>
	// 7318 13664:getfield        #384 <Field int azh.cg>
	// 7319 13667:iconst_m1       
	// 7320 13668:ixor            
	// 7321 13669:iand            
	// 7322 13670:putfield        #414 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 7323 13673:aload_0         
	// 7324 13674:getfield        #12  <Field azh a>
	// 7325 13677:astore_1        
		abyte0.bX = ((azh) (abyte0)).W ^ a.bX;
	// 7326 13678:aload_1         
	// 7327 13679:aload_1         
	// 7328 13680:getfield        #357 <Field int azh.W>
	// 7329 13683:aload_0         
	// 7330 13684:getfield        #12  <Field azh a>
	// 7331 13687:getfield        #414 <Field int azh.bX>
	// 7332 13690:ixor            
	// 7333 13691:putfield        #414 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 7334 13694:aload_0         
	// 7335 13695:getfield        #12  <Field azh a>
	// 7336 13698:astore_1        
		abyte0.bX = ((azh) (abyte0)).bX & ~a.K;
	// 7337 13699:aload_1         
	// 7338 13700:aload_1         
	// 7339 13701:getfield        #414 <Field int azh.bX>
	// 7340 13704:aload_0         
	// 7341 13705:getfield        #12  <Field azh a>
	// 7342 13708:getfield        #331 <Field int azh.K>
	// 7343 13711:iconst_m1       
	// 7344 13712:ixor            
	// 7345 13713:iand            
	// 7346 13714:putfield        #414 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 7347 13717:aload_0         
	// 7348 13718:getfield        #12  <Field azh a>
	// 7349 13721:astore_1        
		abyte0.bD = ((azh) (abyte0)).be & ~a.cg;
	// 7350 13722:aload_1         
	// 7351 13723:aload_1         
	// 7352 13724:getfield        #149 <Field int azh.be>
	// 7353 13727:aload_0         
	// 7354 13728:getfield        #12  <Field azh a>
	// 7355 13731:getfield        #384 <Field int azh.cg>
	// 7356 13734:iconst_m1       
	// 7357 13735:ixor            
	// 7358 13736:iand            
	// 7359 13737:putfield        #417 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 7360 13740:aload_0         
	// 7361 13741:getfield        #12  <Field azh a>
	// 7362 13744:astore_1        
		abyte0.bD = ((azh) (abyte0)).bC ^ a.bD;
	// 7363 13745:aload_1         
	// 7364 13746:aload_1         
	// 7365 13747:getfield        #352 <Field int azh.bC>
	// 7366 13750:aload_0         
	// 7367 13751:getfield        #12  <Field azh a>
	// 7368 13754:getfield        #417 <Field int azh.bD>
	// 7369 13757:ixor            
	// 7370 13758:putfield        #417 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 7371 13761:aload_0         
	// 7372 13762:getfield        #12  <Field azh a>
	// 7373 13765:astore_1        
		abyte0.bX = ((azh) (abyte0)).bD ^ a.bX;
	// 7374 13766:aload_1         
	// 7375 13767:aload_1         
	// 7376 13768:getfield        #417 <Field int azh.bD>
	// 7377 13771:aload_0         
	// 7378 13772:getfield        #12  <Field azh a>
	// 7379 13775:getfield        #414 <Field int azh.bX>
	// 7380 13778:ixor            
	// 7381 13779:putfield        #414 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 7382 13782:aload_0         
	// 7383 13783:getfield        #12  <Field azh a>
	// 7384 13786:astore_1        
		abyte0.d = ((azh) (abyte0)).bX ^ a.d;
	// 7385 13787:aload_1         
	// 7386 13788:aload_1         
	// 7387 13789:getfield        #414 <Field int azh.bX>
	// 7388 13792:aload_0         
	// 7389 13793:getfield        #12  <Field azh a>
	// 7390 13796:getfield        #375 <Field int azh.d>
	// 7391 13799:ixor            
	// 7392 13800:putfield        #375 <Field int azh.d>
		abyte0 = ((byte []) (a));
	// 7393 13803:aload_0         
	// 7394 13804:getfield        #12  <Field azh a>
	// 7395 13807:astore_1        
		abyte0.d = ((azh) (abyte0)).bK | a.d;
	// 7396 13808:aload_1         
	// 7397 13809:aload_1         
	// 7398 13810:getfield        #334 <Field int azh.bK>
	// 7399 13813:aload_0         
	// 7400 13814:getfield        #12  <Field azh a>
	// 7401 13817:getfield        #375 <Field int azh.d>
	// 7402 13820:ior             
	// 7403 13821:putfield        #375 <Field int azh.d>
		abyte0 = ((byte []) (a));
	// 7404 13824:aload_0         
	// 7405 13825:getfield        #12  <Field azh a>
	// 7406 13828:astore_1        
		abyte0.bX = ((azh) (abyte0)).be & a.cg;
	// 7407 13829:aload_1         
	// 7408 13830:aload_1         
	// 7409 13831:getfield        #149 <Field int azh.be>
	// 7410 13834:aload_0         
	// 7411 13835:getfield        #12  <Field azh a>
	// 7412 13838:getfield        #384 <Field int azh.cg>
	// 7413 13841:iand            
	// 7414 13842:putfield        #414 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 7415 13845:aload_0         
	// 7416 13846:getfield        #12  <Field azh a>
	// 7417 13849:astore_1        
		abyte0.bX = ((azh) (abyte0)).W ^ a.bX;
	// 7418 13850:aload_1         
	// 7419 13851:aload_1         
	// 7420 13852:getfield        #357 <Field int azh.W>
	// 7421 13855:aload_0         
	// 7422 13856:getfield        #12  <Field azh a>
	// 7423 13859:getfield        #414 <Field int azh.bX>
	// 7424 13862:ixor            
	// 7425 13863:putfield        #414 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 7426 13866:aload_0         
	// 7427 13867:getfield        #12  <Field azh a>
	// 7428 13870:astore_1        
		abyte0.bX = ((azh) (abyte0)).bX & ~a.K;
	// 7429 13871:aload_1         
	// 7430 13872:aload_1         
	// 7431 13873:getfield        #414 <Field int azh.bX>
	// 7432 13876:aload_0         
	// 7433 13877:getfield        #12  <Field azh a>
	// 7434 13880:getfield        #331 <Field int azh.K>
	// 7435 13883:iconst_m1       
	// 7436 13884:ixor            
	// 7437 13885:iand            
	// 7438 13886:putfield        #414 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 7439 13889:aload_0         
	// 7440 13890:getfield        #12  <Field azh a>
	// 7441 13893:astore_1        
		abyte0.bD = ((azh) (abyte0)).bC & ~a.cg;
	// 7442 13894:aload_1         
	// 7443 13895:aload_1         
	// 7444 13896:getfield        #352 <Field int azh.bC>
	// 7445 13899:aload_0         
	// 7446 13900:getfield        #12  <Field azh a>
	// 7447 13903:getfield        #384 <Field int azh.cg>
	// 7448 13906:iconst_m1       
	// 7449 13907:ixor            
	// 7450 13908:iand            
	// 7451 13909:putfield        #417 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 7452 13912:aload_0         
	// 7453 13913:getfield        #12  <Field azh a>
	// 7454 13916:astore_1        
		abyte0.bD = ((azh) (abyte0)).be & ~a.bD;
	// 7455 13917:aload_1         
	// 7456 13918:aload_1         
	// 7457 13919:getfield        #149 <Field int azh.be>
	// 7458 13922:aload_0         
	// 7459 13923:getfield        #12  <Field azh a>
	// 7460 13926:getfield        #417 <Field int azh.bD>
	// 7461 13929:iconst_m1       
	// 7462 13930:ixor            
	// 7463 13931:iand            
	// 7464 13932:putfield        #417 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 7465 13935:aload_0         
	// 7466 13936:getfield        #12  <Field azh a>
	// 7467 13939:astore_1        
		abyte0.bU = ((azh) (abyte0)).be & a.cg;
	// 7468 13940:aload_1         
	// 7469 13941:aload_1         
	// 7470 13942:getfield        #149 <Field int azh.be>
	// 7471 13945:aload_0         
	// 7472 13946:getfield        #12  <Field azh a>
	// 7473 13949:getfield        #384 <Field int azh.cg>
	// 7474 13952:iand            
	// 7475 13953:putfield        #420 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 7476 13956:aload_0         
	// 7477 13957:getfield        #12  <Field azh a>
	// 7478 13960:astore_1        
		abyte0.bU = ((azh) (abyte0)).K | a.bU;
	// 7479 13961:aload_1         
	// 7480 13962:aload_1         
	// 7481 13963:getfield        #331 <Field int azh.K>
	// 7482 13966:aload_0         
	// 7483 13967:getfield        #12  <Field azh a>
	// 7484 13970:getfield        #420 <Field int azh.bU>
	// 7485 13973:ior             
	// 7486 13974:putfield        #420 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 7487 13977:aload_0         
	// 7488 13978:getfield        #12  <Field azh a>
	// 7489 13981:astore_1        
		abyte0.bU = ((azh) (abyte0)).aU ^ a.bU;
	// 7490 13982:aload_1         
	// 7491 13983:aload_1         
	// 7492 13984:getfield        #411 <Field int azh.aU>
	// 7493 13987:aload_0         
	// 7494 13988:getfield        #12  <Field azh a>
	// 7495 13991:getfield        #420 <Field int azh.bU>
	// 7496 13994:ixor            
	// 7497 13995:putfield        #420 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 7498 13998:aload_0         
	// 7499 13999:getfield        #12  <Field azh a>
	// 7500 14002:astore_1        
		abyte0.i = ((azh) (abyte0)).bU ^ a.i;
	// 7501 14003:aload_1         
	// 7502 14004:aload_1         
	// 7503 14005:getfield        #420 <Field int azh.bU>
	// 7504 14008:aload_0         
	// 7505 14009:getfield        #12  <Field azh a>
	// 7506 14012:getfield        #396 <Field int azh.i>
	// 7507 14015:ixor            
	// 7508 14016:putfield        #396 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 7509 14019:aload_0         
	// 7510 14020:getfield        #12  <Field azh a>
	// 7511 14023:astore_1        
		abyte0.d = ((azh) (abyte0)).i ^ a.d;
	// 7512 14024:aload_1         
	// 7513 14025:aload_1         
	// 7514 14026:getfield        #396 <Field int azh.i>
	// 7515 14029:aload_0         
	// 7516 14030:getfield        #12  <Field azh a>
	// 7517 14033:getfield        #375 <Field int azh.d>
	// 7518 14036:ixor            
	// 7519 14037:putfield        #375 <Field int azh.d>
		abyte0 = ((byte []) (a));
	// 7520 14040:aload_0         
	// 7521 14041:getfield        #12  <Field azh a>
	// 7522 14044:astore_1        
		abyte0.bn = ((azh) (abyte0)).d ^ a.bn;
	// 7523 14045:aload_1         
	// 7524 14046:aload_1         
	// 7525 14047:getfield        #375 <Field int azh.d>
	// 7526 14050:aload_0         
	// 7527 14051:getfield        #12  <Field azh a>
	// 7528 14054:getfield        #423 <Field int azh.bn>
	// 7529 14057:ixor            
	// 7530 14058:putfield        #423 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	// 7531 14061:aload_0         
	// 7532 14062:getfield        #12  <Field azh a>
	// 7533 14065:astore_1        
		abyte0.aa = ((azh) (abyte0)).bn & a.aa;
	// 7534 14066:aload_1         
	// 7535 14067:aload_1         
	// 7536 14068:getfield        #423 <Field int azh.bn>
	// 7537 14071:aload_0         
	// 7538 14072:getfield        #12  <Field azh a>
	// 7539 14075:getfield        #140 <Field int azh.aa>
	// 7540 14078:iand            
	// 7541 14079:putfield        #140 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 7542 14082:aload_0         
	// 7543 14083:getfield        #12  <Field azh a>
	// 7544 14086:astore_1        
		abyte0.aa = ((azh) (abyte0)).cm ^ a.aa;
	// 7545 14087:aload_1         
	// 7546 14088:aload_1         
	// 7547 14089:getfield        #83  <Field int azh.cm>
	// 7548 14092:aload_0         
	// 7549 14093:getfield        #12  <Field azh a>
	// 7550 14096:getfield        #140 <Field int azh.aa>
	// 7551 14099:ixor            
	// 7552 14100:putfield        #140 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 7553 14103:aload_0         
	// 7554 14104:getfield        #12  <Field azh a>
	// 7555 14107:astore_1        
		abyte0.aa = ((azh) (abyte0)).ap | a.aa;
	// 7556 14108:aload_1         
	// 7557 14109:aload_1         
	// 7558 14110:getfield        #289 <Field int azh.ap>
	// 7559 14113:aload_0         
	// 7560 14114:getfield        #12  <Field azh a>
	// 7561 14117:getfield        #140 <Field int azh.aa>
	// 7562 14120:ior             
	// 7563 14121:putfield        #140 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 7564 14124:aload_0         
	// 7565 14125:getfield        #12  <Field azh a>
	// 7566 14128:astore_1        
		abyte0.d = ((azh) (abyte0)).bn & ~a.cm;
	// 7567 14129:aload_1         
	// 7568 14130:aload_1         
	// 7569 14131:getfield        #423 <Field int azh.bn>
	// 7570 14134:aload_0         
	// 7571 14135:getfield        #12  <Field azh a>
	// 7572 14138:getfield        #83  <Field int azh.cm>
	// 7573 14141:iconst_m1       
	// 7574 14142:ixor            
	// 7575 14143:iand            
	// 7576 14144:putfield        #375 <Field int azh.d>
		abyte0 = ((byte []) (a));
	// 7577 14147:aload_0         
	// 7578 14148:getfield        #12  <Field azh a>
	// 7579 14151:astore_1        
		abyte0.d = ((azh) (abyte0)).cm ^ a.d;
	// 7580 14152:aload_1         
	// 7581 14153:aload_1         
	// 7582 14154:getfield        #83  <Field int azh.cm>
	// 7583 14157:aload_0         
	// 7584 14158:getfield        #12  <Field azh a>
	// 7585 14161:getfield        #375 <Field int azh.d>
	// 7586 14164:ixor            
	// 7587 14165:putfield        #375 <Field int azh.d>
		abyte0 = ((byte []) (a));
	// 7588 14168:aload_0         
	// 7589 14169:getfield        #12  <Field azh a>
	// 7590 14172:astore_1        
		abyte0.i = ((azh) (abyte0)).ap | a.d;
	// 7591 14173:aload_1         
	// 7592 14174:aload_1         
	// 7593 14175:getfield        #289 <Field int azh.ap>
	// 7594 14178:aload_0         
	// 7595 14179:getfield        #12  <Field azh a>
	// 7596 14182:getfield        #375 <Field int azh.d>
	// 7597 14185:ior             
	// 7598 14186:putfield        #396 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 7599 14189:aload_0         
	// 7600 14190:getfield        #12  <Field azh a>
	// 7601 14193:astore_1        
		abyte0.bU = ((azh) (abyte0)).bn & ~a.cm;
	// 7602 14194:aload_1         
	// 7603 14195:aload_1         
	// 7604 14196:getfield        #423 <Field int azh.bn>
	// 7605 14199:aload_0         
	// 7606 14200:getfield        #12  <Field azh a>
	// 7607 14203:getfield        #83  <Field int azh.cm>
	// 7608 14206:iconst_m1       
	// 7609 14207:ixor            
	// 7610 14208:iand            
	// 7611 14209:putfield        #420 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 7612 14212:aload_0         
	// 7613 14213:getfield        #12  <Field azh a>
	// 7614 14216:astore_1        
		abyte0.aU = ((azh) (abyte0)).bn & a.cm;
	// 7615 14217:aload_1         
	// 7616 14218:aload_1         
	// 7617 14219:getfield        #423 <Field int azh.bn>
	// 7618 14222:aload_0         
	// 7619 14223:getfield        #12  <Field azh a>
	// 7620 14226:getfield        #83  <Field int azh.cm>
	// 7621 14229:iand            
	// 7622 14230:putfield        #411 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 7623 14233:aload_0         
	// 7624 14234:getfield        #12  <Field azh a>
	// 7625 14237:astore_1        
		abyte0.aU = ((azh) (abyte0)).aF ^ a.aU;
	// 7626 14238:aload_1         
	// 7627 14239:aload_1         
	// 7628 14240:getfield        #185 <Field int azh.aF>
	// 7629 14243:aload_0         
	// 7630 14244:getfield        #12  <Field azh a>
	// 7631 14247:getfield        #411 <Field int azh.aU>
	// 7632 14250:ixor            
	// 7633 14251:putfield        #411 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 7634 14254:aload_0         
	// 7635 14255:getfield        #12  <Field azh a>
	// 7636 14258:astore_1        
		abyte0.au = ((azh) (abyte0)).bn & a.au;
	// 7637 14259:aload_1         
	// 7638 14260:aload_1         
	// 7639 14261:getfield        #423 <Field int azh.bn>
	// 7640 14264:aload_0         
	// 7641 14265:getfield        #12  <Field azh a>
	// 7642 14268:getfield        #256 <Field int azh.au>
	// 7643 14271:iand            
	// 7644 14272:putfield        #256 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 7645 14275:aload_0         
	// 7646 14276:getfield        #12  <Field azh a>
	// 7647 14279:astore_1        
		abyte0.au = ((azh) (abyte0)).bv ^ a.au;
	// 7648 14280:aload_1         
	// 7649 14281:aload_1         
	// 7650 14282:getfield        #349 <Field int azh.bv>
	// 7651 14285:aload_0         
	// 7652 14286:getfield        #12  <Field azh a>
	// 7653 14289:getfield        #256 <Field int azh.au>
	// 7654 14292:ixor            
	// 7655 14293:putfield        #256 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 7656 14296:aload_0         
	// 7657 14297:getfield        #12  <Field azh a>
	// 7658 14300:astore_1        
		abyte0.bv = ((azh) (abyte0)).bn & a.aT;
	// 7659 14301:aload_1         
	// 7660 14302:aload_1         
	// 7661 14303:getfield        #423 <Field int azh.bn>
	// 7662 14306:aload_0         
	// 7663 14307:getfield        #12  <Field azh a>
	// 7664 14310:getfield        #217 <Field int azh.aT>
	// 7665 14313:iand            
	// 7666 14314:putfield        #349 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 7667 14317:aload_0         
	// 7668 14318:getfield        #12  <Field azh a>
	// 7669 14321:astore_1        
		abyte0.bv = ((azh) (abyte0)).aw ^ a.bv;
	// 7670 14322:aload_1         
	// 7671 14323:aload_1         
	// 7672 14324:getfield        #199 <Field int azh.aw>
	// 7673 14327:aload_0         
	// 7674 14328:getfield        #12  <Field azh a>
	// 7675 14331:getfield        #349 <Field int azh.bv>
	// 7676 14334:ixor            
	// 7677 14335:putfield        #349 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 7678 14338:aload_0         
	// 7679 14339:getfield        #12  <Field azh a>
	// 7680 14342:astore_1        
		abyte0.bQ = ((azh) (abyte0)).ap | a.bv;
	// 7681 14343:aload_1         
	// 7682 14344:aload_1         
	// 7683 14345:getfield        #289 <Field int azh.ap>
	// 7684 14348:aload_0         
	// 7685 14349:getfield        #12  <Field azh a>
	// 7686 14352:getfield        #349 <Field int azh.bv>
	// 7687 14355:ior             
	// 7688 14356:putfield        #426 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 7689 14359:aload_0         
	// 7690 14360:getfield        #12  <Field azh a>
	// 7691 14363:astore_1        
		abyte0.bw = ((azh) (abyte0)).ap | a.bv;
	// 7692 14364:aload_1         
	// 7693 14365:aload_1         
	// 7694 14366:getfield        #289 <Field int azh.ap>
	// 7695 14369:aload_0         
	// 7696 14370:getfield        #12  <Field azh a>
	// 7697 14373:getfield        #349 <Field int azh.bv>
	// 7698 14376:ior             
	// 7699 14377:putfield        #429 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 7700 14380:aload_0         
	// 7701 14381:getfield        #12  <Field azh a>
	// 7702 14384:astore_1        
		abyte0.an = ((azh) (abyte0)).bn & a.aw;
	// 7703 14385:aload_1         
	// 7704 14386:aload_1         
	// 7705 14387:getfield        #423 <Field int azh.bn>
	// 7706 14390:aload_0         
	// 7707 14391:getfield        #12  <Field azh a>
	// 7708 14394:getfield        #199 <Field int azh.aw>
	// 7709 14397:iand            
	// 7710 14398:putfield        #432 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 7711 14401:aload_0         
	// 7712 14402:getfield        #12  <Field azh a>
	// 7713 14405:astore_1        
		abyte0.by = ((azh) (abyte0)).an ^ a.by;
	// 7714 14406:aload_1         
	// 7715 14407:aload_1         
	// 7716 14408:getfield        #432 <Field int azh.an>
	// 7717 14411:aload_0         
	// 7718 14412:getfield        #12  <Field azh a>
	// 7719 14415:getfield        #98  <Field int azh.by>
	// 7720 14418:ixor            
	// 7721 14419:putfield        #98  <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 7722 14422:aload_0         
	// 7723 14423:getfield        #12  <Field azh a>
	// 7724 14426:astore_1        
		abyte0.an = ((azh) (abyte0)).bn & a.X;
	// 7725 14427:aload_1         
	// 7726 14428:aload_1         
	// 7727 14429:getfield        #423 <Field int azh.bn>
	// 7728 14432:aload_0         
	// 7729 14433:getfield        #12  <Field azh a>
	// 7730 14436:getfield        #125 <Field int azh.X>
	// 7731 14439:iand            
	// 7732 14440:putfield        #432 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 7733 14443:aload_0         
	// 7734 14444:getfield        #12  <Field azh a>
	// 7735 14447:astore_1        
		abyte0.bN = ((azh) (abyte0)).bn & a.aT;
	// 7736 14448:aload_1         
	// 7737 14449:aload_1         
	// 7738 14450:getfield        #423 <Field int azh.bn>
	// 7739 14453:aload_0         
	// 7740 14454:getfield        #12  <Field azh a>
	// 7741 14457:getfield        #217 <Field int azh.aT>
	// 7742 14460:iand            
	// 7743 14461:putfield        #435 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 7744 14464:aload_0         
	// 7745 14465:getfield        #12  <Field azh a>
	// 7746 14468:astore_1        
		abyte0.bN = ((azh) (abyte0)).bN & ~a.ap;
	// 7747 14469:aload_1         
	// 7748 14470:aload_1         
	// 7749 14471:getfield        #435 <Field int azh.bN>
	// 7750 14474:aload_0         
	// 7751 14475:getfield        #12  <Field azh a>
	// 7752 14478:getfield        #289 <Field int azh.ap>
	// 7753 14481:iconst_m1       
	// 7754 14482:ixor            
	// 7755 14483:iand            
	// 7756 14484:putfield        #435 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 7757 14487:aload_0         
	// 7758 14488:getfield        #12  <Field azh a>
	// 7759 14491:astore_1        
		abyte0.bN = ((azh) (abyte0)).aU ^ a.bN;
	// 7760 14492:aload_1         
	// 7761 14493:aload_1         
	// 7762 14494:getfield        #411 <Field int azh.aU>
	// 7763 14497:aload_0         
	// 7764 14498:getfield        #12  <Field azh a>
	// 7765 14501:getfield        #435 <Field int azh.bN>
	// 7766 14504:ixor            
	// 7767 14505:putfield        #435 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 7768 14508:aload_0         
	// 7769 14509:getfield        #12  <Field azh a>
	// 7770 14512:astore_1        
		abyte0.r = ((azh) (abyte0)).bn & ~a.r;
	// 7771 14513:aload_1         
	// 7772 14514:aload_1         
	// 7773 14515:getfield        #423 <Field int azh.bn>
	// 7774 14518:aload_0         
	// 7775 14519:getfield        #12  <Field azh a>
	// 7776 14522:getfield        #390 <Field int azh.r>
	// 7777 14525:iconst_m1       
	// 7778 14526:ixor            
	// 7779 14527:iand            
	// 7780 14528:putfield        #390 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 7781 14531:aload_0         
	// 7782 14532:getfield        #12  <Field azh a>
	// 7783 14535:astore_1        
		abyte0.r = ((azh) (abyte0)).ai ^ a.r;
	// 7784 14536:aload_1         
	// 7785 14537:aload_1         
	// 7786 14538:getfield        #214 <Field int azh.ai>
	// 7787 14541:aload_0         
	// 7788 14542:getfield        #12  <Field azh a>
	// 7789 14545:getfield        #390 <Field int azh.r>
	// 7790 14548:ixor            
	// 7791 14549:putfield        #390 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 7792 14552:aload_0         
	// 7793 14553:getfield        #12  <Field azh a>
	// 7794 14556:astore_1        
		abyte0.r = ((azh) (abyte0)).cf & a.r;
	// 7795 14557:aload_1         
	// 7796 14558:aload_1         
	// 7797 14559:getfield        #193 <Field int azh.cf>
	// 7798 14562:aload_0         
	// 7799 14563:getfield        #12  <Field azh a>
	// 7800 14566:getfield        #390 <Field int azh.r>
	// 7801 14569:iand            
	// 7802 14570:putfield        #390 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 7803 14573:aload_0         
	// 7804 14574:getfield        #12  <Field azh a>
	// 7805 14577:astore_1        
		abyte0.X = ((azh) (abyte0)).X ^ a.bn;
	// 7806 14578:aload_1         
	// 7807 14579:aload_1         
	// 7808 14580:getfield        #125 <Field int azh.X>
	// 7809 14583:aload_0         
	// 7810 14584:getfield        #12  <Field azh a>
	// 7811 14587:getfield        #423 <Field int azh.bn>
	// 7812 14590:ixor            
	// 7813 14591:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 7814 14594:aload_0         
	// 7815 14595:getfield        #12  <Field azh a>
	// 7816 14598:astore_1        
		abyte0.X = ((azh) (abyte0)).ap | a.X;
	// 7817 14599:aload_1         
	// 7818 14600:aload_1         
	// 7819 14601:getfield        #289 <Field int azh.ap>
	// 7820 14604:aload_0         
	// 7821 14605:getfield        #12  <Field azh a>
	// 7822 14608:getfield        #125 <Field int azh.X>
	// 7823 14611:ior             
	// 7824 14612:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 7825 14615:aload_0         
	// 7826 14616:getfield        #12  <Field azh a>
	// 7827 14619:astore_1        
		abyte0.X = ((azh) (abyte0)).d ^ a.X;
	// 7828 14620:aload_1         
	// 7829 14621:aload_1         
	// 7830 14622:getfield        #375 <Field int azh.d>
	// 7831 14625:aload_0         
	// 7832 14626:getfield        #12  <Field azh a>
	// 7833 14629:getfield        #125 <Field int azh.X>
	// 7834 14632:ixor            
	// 7835 14633:putfield        #125 <Field int azh.X>
		abyte0 = ((byte []) (a));
	// 7836 14636:aload_0         
	// 7837 14637:getfield        #12  <Field azh a>
	// 7838 14640:astore_1        
		abyte0.d = ((azh) (abyte0)).bn & a.cm;
	// 7839 14641:aload_1         
	// 7840 14642:aload_1         
	// 7841 14643:getfield        #423 <Field int azh.bn>
	// 7842 14646:aload_0         
	// 7843 14647:getfield        #12  <Field azh a>
	// 7844 14650:getfield        #83  <Field int azh.cm>
	// 7845 14653:iand            
	// 7846 14654:putfield        #375 <Field int azh.d>
		abyte0 = ((byte []) (a));
	// 7847 14657:aload_0         
	// 7848 14658:getfield        #12  <Field azh a>
	// 7849 14661:astore_1        
		abyte0.d = ((azh) (abyte0)).cm ^ a.d;
	// 7850 14662:aload_1         
	// 7851 14663:aload_1         
	// 7852 14664:getfield        #83  <Field int azh.cm>
	// 7853 14667:aload_0         
	// 7854 14668:getfield        #12  <Field azh a>
	// 7855 14671:getfield        #375 <Field int azh.d>
	// 7856 14674:ixor            
	// 7857 14675:putfield        #375 <Field int azh.d>
		abyte0 = ((byte []) (a));
	// 7858 14678:aload_0         
	// 7859 14679:getfield        #12  <Field azh a>
	// 7860 14682:astore_1        
		abyte0.d = ((azh) (abyte0)).d & ~a.ap;
	// 7861 14683:aload_1         
	// 7862 14684:aload_1         
	// 7863 14685:getfield        #375 <Field int azh.d>
	// 7864 14688:aload_0         
	// 7865 14689:getfield        #12  <Field azh a>
	// 7866 14692:getfield        #289 <Field int azh.ap>
	// 7867 14695:iconst_m1       
	// 7868 14696:ixor            
	// 7869 14697:iand            
	// 7870 14698:putfield        #375 <Field int azh.d>
		abyte0 = ((byte []) (a));
	// 7871 14701:aload_0         
	// 7872 14702:getfield        #12  <Field azh a>
	// 7873 14705:astore_1        
		abyte0.ai = ((azh) (abyte0)).ap & ~a.bn;
	// 7874 14706:aload_1         
	// 7875 14707:aload_1         
	// 7876 14708:getfield        #289 <Field int azh.ap>
	// 7877 14711:aload_0         
	// 7878 14712:getfield        #12  <Field azh a>
	// 7879 14715:getfield        #423 <Field int azh.bn>
	// 7880 14718:iconst_m1       
	// 7881 14719:ixor            
	// 7882 14720:iand            
	// 7883 14721:putfield        #214 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 7884 14724:aload_0         
	// 7885 14725:getfield        #12  <Field azh a>
	// 7886 14728:astore_1        
		abyte0.cm = ((azh) (abyte0)).bn & a.cm;
	// 7887 14729:aload_1         
	// 7888 14730:aload_1         
	// 7889 14731:getfield        #423 <Field int azh.bn>
	// 7890 14734:aload_0         
	// 7891 14735:getfield        #12  <Field azh a>
	// 7892 14738:getfield        #83  <Field int azh.cm>
	// 7893 14741:iand            
	// 7894 14742:putfield        #83  <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 7895 14745:aload_0         
	// 7896 14746:getfield        #12  <Field azh a>
	// 7897 14749:astore_1        
		abyte0.cm = ((azh) (abyte0)).aT ^ a.cm;
	// 7898 14750:aload_1         
	// 7899 14751:aload_1         
	// 7900 14752:getfield        #217 <Field int azh.aT>
	// 7901 14755:aload_0         
	// 7902 14756:getfield        #12  <Field azh a>
	// 7903 14759:getfield        #83  <Field int azh.cm>
	// 7904 14762:ixor            
	// 7905 14763:putfield        #83  <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 7906 14766:aload_0         
	// 7907 14767:getfield        #12  <Field azh a>
	// 7908 14770:astore_1        
		abyte0.cm = ((azh) (abyte0)).ap | a.cm;
	// 7909 14771:aload_1         
	// 7910 14772:aload_1         
	// 7911 14773:getfield        #289 <Field int azh.ap>
	// 7912 14776:aload_0         
	// 7913 14777:getfield        #12  <Field azh a>
	// 7914 14780:getfield        #83  <Field int azh.cm>
	// 7915 14783:ior             
	// 7916 14784:putfield        #83  <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 7917 14787:aload_0         
	// 7918 14788:getfield        #12  <Field azh a>
	// 7919 14791:astore_1        
		abyte0.aU = ((azh) (abyte0)).bn & ~a.aT;
	// 7920 14792:aload_1         
	// 7921 14793:aload_1         
	// 7922 14794:getfield        #423 <Field int azh.bn>
	// 7923 14797:aload_0         
	// 7924 14798:getfield        #12  <Field azh a>
	// 7925 14801:getfield        #217 <Field int azh.aT>
	// 7926 14804:iconst_m1       
	// 7927 14805:ixor            
	// 7928 14806:iand            
	// 7929 14807:putfield        #411 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 7930 14810:aload_0         
	// 7931 14811:getfield        #12  <Field azh a>
	// 7932 14814:astore_1        
		abyte0.aU = ((azh) (abyte0)).aF ^ a.aU;
	// 7933 14815:aload_1         
	// 7934 14816:aload_1         
	// 7935 14817:getfield        #185 <Field int azh.aF>
	// 7936 14820:aload_0         
	// 7937 14821:getfield        #12  <Field azh a>
	// 7938 14824:getfield        #411 <Field int azh.aU>
	// 7939 14827:ixor            
	// 7940 14828:putfield        #411 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 7941 14831:aload_0         
	// 7942 14832:getfield        #12  <Field azh a>
	// 7943 14835:astore_1        
		abyte0.aM = ((azh) (abyte0)).aU & a.ap;
	// 7944 14836:aload_1         
	// 7945 14837:aload_1         
	// 7946 14838:getfield        #411 <Field int azh.aU>
	// 7947 14841:aload_0         
	// 7948 14842:getfield        #12  <Field azh a>
	// 7949 14845:getfield        #289 <Field int azh.ap>
	// 7950 14848:iand            
	// 7951 14849:putfield        #438 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 7952 14852:aload_0         
	// 7953 14853:getfield        #12  <Field azh a>
	// 7954 14856:astore_1        
		abyte0.aM = ((azh) (abyte0)).bv ^ a.aM;
	// 7955 14857:aload_1         
	// 7956 14858:aload_1         
	// 7957 14859:getfield        #349 <Field int azh.bv>
	// 7958 14862:aload_0         
	// 7959 14863:getfield        #12  <Field azh a>
	// 7960 14866:getfield        #438 <Field int azh.aM>
	// 7961 14869:ixor            
	// 7962 14870:putfield        #438 <Field int azh.aM>
		abyte0 = ((byte []) (a));
	// 7963 14873:aload_0         
	// 7964 14874:getfield        #12  <Field azh a>
	// 7965 14877:astore_1        
		abyte0.bw = ((azh) (abyte0)).aU ^ a.bw;
	// 7966 14878:aload_1         
	// 7967 14879:aload_1         
	// 7968 14880:getfield        #411 <Field int azh.aU>
	// 7969 14883:aload_0         
	// 7970 14884:getfield        #12  <Field azh a>
	// 7971 14887:getfield        #429 <Field int azh.bw>
	// 7972 14890:ixor            
	// 7973 14891:putfield        #429 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 7974 14894:aload_0         
	// 7975 14895:getfield        #12  <Field azh a>
	// 7976 14898:astore_1        
		abyte0.ch = ((azh) (abyte0)).bn & a.ch;
	// 7977 14899:aload_1         
	// 7978 14900:aload_1         
	// 7979 14901:getfield        #423 <Field int azh.bn>
	// 7980 14904:aload_0         
	// 7981 14905:getfield        #12  <Field azh a>
	// 7982 14908:getfield        #316 <Field int azh.ch>
	// 7983 14911:iand            
	// 7984 14912:putfield        #316 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 7985 14915:aload_0         
	// 7986 14916:getfield        #12  <Field azh a>
	// 7987 14919:astore_1        
		abyte0.ch = ((azh) (abyte0)).bO ^ a.ch;
	// 7988 14920:aload_1         
	// 7989 14921:aload_1         
	// 7990 14922:getfield        #53  <Field int azh.bO>
	// 7991 14925:aload_0         
	// 7992 14926:getfield        #12  <Field azh a>
	// 7993 14929:getfield        #316 <Field int azh.ch>
	// 7994 14932:ixor            
	// 7995 14933:putfield        #316 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 7996 14936:aload_0         
	// 7997 14937:getfield        #12  <Field azh a>
	// 7998 14940:astore_1        
		abyte0.bQ = ((azh) (abyte0)).ch ^ a.bQ;
	// 7999 14941:aload_1         
	// 8000 14942:aload_1         
	// 8001 14943:getfield        #316 <Field int azh.ch>
	// 8002 14946:aload_0         
	// 8003 14947:getfield        #12  <Field azh a>
	// 8004 14950:getfield        #426 <Field int azh.bQ>
	// 8005 14953:ixor            
	// 8006 14954:putfield        #426 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 8007 14957:aload_0         
	// 8008 14958:getfield        #12  <Field azh a>
	// 8009 14961:astore_1        
		abyte0.ch = ((azh) (abyte0)).bn & ~a.aF;
	// 8010 14962:aload_1         
	// 8011 14963:aload_1         
	// 8012 14964:getfield        #423 <Field int azh.bn>
	// 8013 14967:aload_0         
	// 8014 14968:getfield        #12  <Field azh a>
	// 8015 14971:getfield        #185 <Field int azh.aF>
	// 8016 14974:iconst_m1       
	// 8017 14975:ixor            
	// 8018 14976:iand            
	// 8019 14977:putfield        #316 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 8020 14980:aload_0         
	// 8021 14981:getfield        #12  <Field azh a>
	// 8022 14984:astore_1        
		abyte0.ch = ((azh) (abyte0)).aT ^ a.ch;
	// 8023 14985:aload_1         
	// 8024 14986:aload_1         
	// 8025 14987:getfield        #217 <Field int azh.aT>
	// 8026 14990:aload_0         
	// 8027 14991:getfield        #12  <Field azh a>
	// 8028 14994:getfield        #316 <Field int azh.ch>
	// 8029 14997:ixor            
	// 8030 14998:putfield        #316 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 8031 15001:aload_0         
	// 8032 15002:getfield        #12  <Field azh a>
	// 8033 15005:astore_1        
		abyte0.cm = ((azh) (abyte0)).ch ^ a.cm;
	// 8034 15006:aload_1         
	// 8035 15007:aload_1         
	// 8036 15008:getfield        #316 <Field int azh.ch>
	// 8037 15011:aload_0         
	// 8038 15012:getfield        #12  <Field azh a>
	// 8039 15015:getfield        #83  <Field int azh.cm>
	// 8040 15018:ixor            
	// 8041 15019:putfield        #83  <Field int azh.cm>
		abyte0 = ((byte []) (a));
	// 8042 15022:aload_0         
	// 8043 15023:getfield        #12  <Field azh a>
	// 8044 15026:astore_1        
		abyte0.ce = ((azh) (abyte0)).bn & ~a.ce;
	// 8045 15027:aload_1         
	// 8046 15028:aload_1         
	// 8047 15029:getfield        #423 <Field int azh.bn>
	// 8048 15032:aload_0         
	// 8049 15033:getfield        #12  <Field azh a>
	// 8050 15036:getfield        #405 <Field int azh.ce>
	// 8051 15039:iconst_m1       
	// 8052 15040:ixor            
	// 8053 15041:iand            
	// 8054 15042:putfield        #405 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 8055 15045:aload_0         
	// 8056 15046:getfield        #12  <Field azh a>
	// 8057 15049:astore_1        
		abyte0.ce = ((azh) (abyte0)).t ^ a.ce;
	// 8058 15050:aload_1         
	// 8059 15051:aload_1         
	// 8060 15052:getfield        #232 <Field int azh.t>
	// 8061 15055:aload_0         
	// 8062 15056:getfield        #12  <Field azh a>
	// 8063 15059:getfield        #405 <Field int azh.ce>
	// 8064 15062:ixor            
	// 8065 15063:putfield        #405 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 8066 15066:aload_0         
	// 8067 15067:getfield        #12  <Field azh a>
	// 8068 15070:astore_1        
		abyte0.ch = ((azh) (abyte0)).bn & ~a.aT;
	// 8069 15071:aload_1         
	// 8070 15072:aload_1         
	// 8071 15073:getfield        #423 <Field int azh.bn>
	// 8072 15076:aload_0         
	// 8073 15077:getfield        #12  <Field azh a>
	// 8074 15080:getfield        #217 <Field int azh.aT>
	// 8075 15083:iconst_m1       
	// 8076 15084:ixor            
	// 8077 15085:iand            
	// 8078 15086:putfield        #316 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 8079 15089:aload_0         
	// 8080 15090:getfield        #12  <Field azh a>
	// 8081 15093:astore_1        
		abyte0.ch = ((azh) (abyte0)).bO ^ a.ch;
	// 8082 15094:aload_1         
	// 8083 15095:aload_1         
	// 8084 15096:getfield        #53  <Field int azh.bO>
	// 8085 15099:aload_0         
	// 8086 15100:getfield        #12  <Field azh a>
	// 8087 15103:getfield        #316 <Field int azh.ch>
	// 8088 15106:ixor            
	// 8089 15107:putfield        #316 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 8090 15110:aload_0         
	// 8091 15111:getfield        #12  <Field azh a>
	// 8092 15114:astore_1        
		abyte0.cB = ((azh) (abyte0)).bn & ~a.cB;
	// 8093 15115:aload_1         
	// 8094 15116:aload_1         
	// 8095 15117:getfield        #423 <Field int azh.bn>
	// 8096 15120:aload_0         
	// 8097 15121:getfield        #12  <Field azh a>
	// 8098 15124:getfield        #265 <Field int azh.cB>
	// 8099 15127:iconst_m1       
	// 8100 15128:ixor            
	// 8101 15129:iand            
	// 8102 15130:putfield        #265 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 8103 15133:aload_0         
	// 8104 15134:getfield        #12  <Field azh a>
	// 8105 15137:astore_1        
		abyte0.cB = ((azh) (abyte0)).bk ^ a.cB;
	// 8106 15138:aload_1         
	// 8107 15139:aload_1         
	// 8108 15140:getfield        #208 <Field int azh.bk>
	// 8109 15143:aload_0         
	// 8110 15144:getfield        #12  <Field azh a>
	// 8111 15147:getfield        #265 <Field int azh.cB>
	// 8112 15150:ixor            
	// 8113 15151:putfield        #265 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 8114 15154:aload_0         
	// 8115 15155:getfield        #12  <Field azh a>
	// 8116 15158:astore_1        
		abyte0.r = ((azh) (abyte0)).cB ^ a.r;
	// 8117 15159:aload_1         
	// 8118 15160:aload_1         
	// 8119 15161:getfield        #265 <Field int azh.cB>
	// 8120 15164:aload_0         
	// 8121 15165:getfield        #12  <Field azh a>
	// 8122 15168:getfield        #390 <Field int azh.r>
	// 8123 15171:ixor            
	// 8124 15172:putfield        #390 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 8125 15175:aload_0         
	// 8126 15176:getfield        #12  <Field azh a>
	// 8127 15179:astore_1        
		abyte0.o = ((azh) (abyte0)).r ^ a.o;
	// 8128 15180:aload_1         
	// 8129 15181:aload_1         
	// 8130 15182:getfield        #390 <Field int azh.r>
	// 8131 15185:aload_0         
	// 8132 15186:getfield        #12  <Field azh a>
	// 8133 15189:getfield        #378 <Field int azh.o>
	// 8134 15192:ixor            
	// 8135 15193:putfield        #378 <Field int azh.o>
		abyte0 = ((byte []) (a));
	// 8136 15196:aload_0         
	// 8137 15197:getfield        #12  <Field azh a>
	// 8138 15200:astore_1        
		abyte0.r = ((azh) (abyte0)).bn & ~a.aw;
	// 8139 15201:aload_1         
	// 8140 15202:aload_1         
	// 8141 15203:getfield        #423 <Field int azh.bn>
	// 8142 15206:aload_0         
	// 8143 15207:getfield        #12  <Field azh a>
	// 8144 15210:getfield        #199 <Field int azh.aw>
	// 8145 15213:iconst_m1       
	// 8146 15214:ixor            
	// 8147 15215:iand            
	// 8148 15216:putfield        #390 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 8149 15219:aload_0         
	// 8150 15220:getfield        #12  <Field azh a>
	// 8151 15223:astore_1        
		abyte0.r = ((azh) (abyte0)).cz ^ a.r;
	// 8152 15224:aload_1         
	// 8153 15225:aload_1         
	// 8154 15226:getfield        #56  <Field int azh.cz>
	// 8155 15229:aload_0         
	// 8156 15230:getfield        #12  <Field azh a>
	// 8157 15233:getfield        #390 <Field int azh.r>
	// 8158 15236:ixor            
	// 8159 15237:putfield        #390 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 8160 15240:aload_0         
	// 8161 15241:getfield        #12  <Field azh a>
	// 8162 15244:astore_1        
		abyte0.r = ((azh) (abyte0)).ap | a.r;
	// 8163 15245:aload_1         
	// 8164 15246:aload_1         
	// 8165 15247:getfield        #289 <Field int azh.ap>
	// 8166 15250:aload_0         
	// 8167 15251:getfield        #12  <Field azh a>
	// 8168 15254:getfield        #390 <Field int azh.r>
	// 8169 15257:ior             
	// 8170 15258:putfield        #390 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 8171 15261:aload_0         
	// 8172 15262:getfield        #12  <Field azh a>
	// 8173 15265:astore_1        
		abyte0.r = ((azh) (abyte0)).ch ^ a.r;
	// 8174 15266:aload_1         
	// 8175 15267:aload_1         
	// 8176 15268:getfield        #316 <Field int azh.ch>
	// 8177 15271:aload_0         
	// 8178 15272:getfield        #12  <Field azh a>
	// 8179 15275:getfield        #390 <Field int azh.r>
	// 8180 15278:ixor            
	// 8181 15279:putfield        #390 <Field int azh.r>
		abyte0 = ((byte []) (a));
	// 8182 15282:aload_0         
	// 8183 15283:getfield        #12  <Field azh a>
	// 8184 15286:astore_1        
		abyte0.ch = ((azh) (abyte0)).bn & a.aT;
	// 8185 15287:aload_1         
	// 8186 15288:aload_1         
	// 8187 15289:getfield        #423 <Field int azh.bn>
	// 8188 15292:aload_0         
	// 8189 15293:getfield        #12  <Field azh a>
	// 8190 15296:getfield        #217 <Field int azh.aT>
	// 8191 15299:iand            
	// 8192 15300:putfield        #316 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 8193 15303:aload_0         
	// 8194 15304:getfield        #12  <Field azh a>
	// 8195 15307:astore_1        
		abyte0.ch = ((azh) (abyte0)).aT ^ a.ch;
	// 8196 15308:aload_1         
	// 8197 15309:aload_1         
	// 8198 15310:getfield        #217 <Field int azh.aT>
	// 8199 15313:aload_0         
	// 8200 15314:getfield        #12  <Field azh a>
	// 8201 15317:getfield        #316 <Field int azh.ch>
	// 8202 15320:ixor            
	// 8203 15321:putfield        #316 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 8204 15324:aload_0         
	// 8205 15325:getfield        #12  <Field azh a>
	// 8206 15328:astore_1        
		abyte0.i = ((azh) (abyte0)).ch ^ a.i;
	// 8207 15329:aload_1         
	// 8208 15330:aload_1         
	// 8209 15331:getfield        #316 <Field int azh.ch>
	// 8210 15334:aload_0         
	// 8211 15335:getfield        #12  <Field azh a>
	// 8212 15338:getfield        #396 <Field int azh.i>
	// 8213 15341:ixor            
	// 8214 15342:putfield        #396 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 8215 15345:aload_0         
	// 8216 15346:getfield        #12  <Field azh a>
	// 8217 15349:astore_1        
		abyte0.cl = ((azh) (abyte0)).cl | a.bn;
	// 8218 15350:aload_1         
	// 8219 15351:aload_1         
	// 8220 15352:getfield        #247 <Field int azh.cl>
	// 8221 15355:aload_0         
	// 8222 15356:getfield        #12  <Field azh a>
	// 8223 15359:getfield        #423 <Field int azh.bn>
	// 8224 15362:ior             
	// 8225 15363:putfield        #247 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 8226 15366:aload_0         
	// 8227 15367:getfield        #12  <Field azh a>
	// 8228 15370:astore_1        
		abyte0.cl = ((azh) (abyte0)).t ^ a.cl;
	// 8229 15371:aload_1         
	// 8230 15372:aload_1         
	// 8231 15373:getfield        #232 <Field int azh.t>
	// 8232 15376:aload_0         
	// 8233 15377:getfield        #12  <Field azh a>
	// 8234 15380:getfield        #247 <Field int azh.cl>
	// 8235 15383:ixor            
	// 8236 15384:putfield        #247 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 8237 15387:aload_0         
	// 8238 15388:getfield        #12  <Field azh a>
	// 8239 15391:astore_1        
		abyte0.bH = ((azh) (abyte0)).bn & ~a.bH;
	// 8240 15392:aload_1         
	// 8241 15393:aload_1         
	// 8242 15394:getfield        #423 <Field int azh.bn>
	// 8243 15397:aload_0         
	// 8244 15398:getfield        #12  <Field azh a>
	// 8245 15401:getfield        #387 <Field int azh.bH>
	// 8246 15404:iconst_m1       
	// 8247 15405:ixor            
	// 8248 15406:iand            
	// 8249 15407:putfield        #387 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 8250 15410:aload_0         
	// 8251 15411:getfield        #12  <Field azh a>
	// 8252 15414:astore_1        
		abyte0.bH = ((azh) (abyte0)).bI ^ a.bH;
	// 8253 15415:aload_1         
	// 8254 15416:aload_1         
	// 8255 15417:getfield        #62  <Field int azh.bI>
	// 8256 15420:aload_0         
	// 8257 15421:getfield        #12  <Field azh a>
	// 8258 15424:getfield        #387 <Field int azh.bH>
	// 8259 15427:ixor            
	// 8260 15428:putfield        #387 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 8261 15431:aload_0         
	// 8262 15432:getfield        #12  <Field azh a>
	// 8263 15435:astore_1        
		abyte0.bH = ((azh) (abyte0)).bH & a.cf;
	// 8264 15436:aload_1         
	// 8265 15437:aload_1         
	// 8266 15438:getfield        #387 <Field int azh.bH>
	// 8267 15441:aload_0         
	// 8268 15442:getfield        #12  <Field azh a>
	// 8269 15445:getfield        #193 <Field int azh.cf>
	// 8270 15448:iand            
	// 8271 15449:putfield        #387 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 8272 15452:aload_0         
	// 8273 15453:getfield        #12  <Field azh a>
	// 8274 15456:astore_1        
		abyte0.bH = ((azh) (abyte0)).au ^ a.bH;
	// 8275 15457:aload_1         
	// 8276 15458:aload_1         
	// 8277 15459:getfield        #256 <Field int azh.au>
	// 8278 15462:aload_0         
	// 8279 15463:getfield        #12  <Field azh a>
	// 8280 15466:getfield        #387 <Field int azh.bH>
	// 8281 15469:ixor            
	// 8282 15470:putfield        #387 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 8283 15473:aload_0         
	// 8284 15474:getfield        #12  <Field azh a>
	// 8285 15477:astore_1        
		abyte0.bb = ((azh) (abyte0)).bH ^ a.bb;
	// 8286 15478:aload_1         
	// 8287 15479:aload_1         
	// 8288 15480:getfield        #387 <Field int azh.bH>
	// 8289 15483:aload_0         
	// 8290 15484:getfield        #12  <Field azh a>
	// 8291 15487:getfield        #280 <Field int azh.bb>
	// 8292 15490:ixor            
	// 8293 15491:putfield        #280 <Field int azh.bb>
		abyte0 = ((byte []) (a));
	// 8294 15494:aload_0         
	// 8295 15495:getfield        #12  <Field azh a>
	// 8296 15498:astore_1        
		abyte0.S = ((azh) (abyte0)).bn & a.S;
	// 8297 15499:aload_1         
	// 8298 15500:aload_1         
	// 8299 15501:getfield        #423 <Field int azh.bn>
	// 8300 15504:aload_0         
	// 8301 15505:getfield        #12  <Field azh a>
	// 8302 15508:getfield        #74  <Field int azh.S>
	// 8303 15511:iand            
	// 8304 15512:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 8305 15515:aload_0         
	// 8306 15516:getfield        #12  <Field azh a>
	// 8307 15519:astore_1        
		abyte0.S = ((azh) (abyte0)).bY ^ a.S;
	// 8308 15520:aload_1         
	// 8309 15521:aload_1         
	// 8310 15522:getfield        #122 <Field int azh.bY>
	// 8311 15525:aload_0         
	// 8312 15526:getfield        #12  <Field azh a>
	// 8313 15529:getfield        #74  <Field int azh.S>
	// 8314 15532:ixor            
	// 8315 15533:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 8316 15536:aload_0         
	// 8317 15537:getfield        #12  <Field azh a>
	// 8318 15540:astore_1        
		abyte0.S = ((azh) (abyte0)).cf & ~a.S;
	// 8319 15541:aload_1         
	// 8320 15542:aload_1         
	// 8321 15543:getfield        #193 <Field int azh.cf>
	// 8322 15546:aload_0         
	// 8323 15547:getfield        #12  <Field azh a>
	// 8324 15550:getfield        #74  <Field int azh.S>
	// 8325 15553:iconst_m1       
	// 8326 15554:ixor            
	// 8327 15555:iand            
	// 8328 15556:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 8329 15559:aload_0         
	// 8330 15560:getfield        #12  <Field azh a>
	// 8331 15563:astore_1        
		abyte0.S = ((azh) (abyte0)).ce ^ a.S;
	// 8332 15564:aload_1         
	// 8333 15565:aload_1         
	// 8334 15566:getfield        #405 <Field int azh.ce>
	// 8335 15569:aload_0         
	// 8336 15570:getfield        #12  <Field azh a>
	// 8337 15573:getfield        #74  <Field int azh.S>
	// 8338 15576:ixor            
	// 8339 15577:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 8340 15580:aload_0         
	// 8341 15581:getfield        #12  <Field azh a>
	// 8342 15584:astore_1        
		abyte0.S = ((azh) (abyte0)).S ^ a.ay;
	// 8343 15585:aload_1         
	// 8344 15586:aload_1         
	// 8345 15587:getfield        #74  <Field int azh.S>
	// 8346 15590:aload_0         
	// 8347 15591:getfield        #12  <Field azh a>
	// 8348 15594:getfield        #441 <Field int azh.ay>
	// 8349 15597:ixor            
	// 8350 15598:putfield        #74  <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 8351 15601:aload_0         
	// 8352 15602:getfield        #12  <Field azh a>
	// 8353 15605:astore_1        
		abyte0.ce = ~((azh) (abyte0)).S;
	// 8354 15606:aload_1         
	// 8355 15607:aload_1         
	// 8356 15608:getfield        #74  <Field int azh.S>
	// 8357 15611:iconst_m1       
	// 8358 15612:ixor            
	// 8359 15613:putfield        #405 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 8360 15616:aload_0         
	// 8361 15617:getfield        #12  <Field azh a>
	// 8362 15620:astore_1        
		abyte0.bs = ((azh) (abyte0)).bn & ~a.bs;
	// 8363 15621:aload_1         
	// 8364 15622:aload_1         
	// 8365 15623:getfield        #423 <Field int azh.bn>
	// 8366 15626:aload_0         
	// 8367 15627:getfield        #12  <Field azh a>
	// 8368 15630:getfield        #95  <Field int azh.bs>
	// 8369 15633:iconst_m1       
	// 8370 15634:ixor            
	// 8371 15635:iand            
	// 8372 15636:putfield        #95  <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 8373 15639:aload_0         
	// 8374 15640:getfield        #12  <Field azh a>
	// 8375 15643:astore_1        
		abyte0.bs = ((azh) (abyte0)).cx ^ a.bs;
	// 8376 15644:aload_1         
	// 8377 15645:aload_1         
	// 8378 15646:getfield        #402 <Field int azh.cx>
	// 8379 15649:aload_0         
	// 8380 15650:getfield        #12  <Field azh a>
	// 8381 15653:getfield        #95  <Field int azh.bs>
	// 8382 15656:ixor            
	// 8383 15657:putfield        #95  <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 8384 15660:aload_0         
	// 8385 15661:getfield        #12  <Field azh a>
	// 8386 15664:astore_1        
		abyte0.bs = ((azh) (abyte0)).cf & ~a.bs;
	// 8387 15665:aload_1         
	// 8388 15666:aload_1         
	// 8389 15667:getfield        #193 <Field int azh.cf>
	// 8390 15670:aload_0         
	// 8391 15671:getfield        #12  <Field azh a>
	// 8392 15674:getfield        #95  <Field int azh.bs>
	// 8393 15677:iconst_m1       
	// 8394 15678:ixor            
	// 8395 15679:iand            
	// 8396 15680:putfield        #95  <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 8397 15683:aload_0         
	// 8398 15684:getfield        #12  <Field azh a>
	// 8399 15687:astore_1        
		abyte0.bs = ((azh) (abyte0)).cl ^ a.bs;
	// 8400 15688:aload_1         
	// 8401 15689:aload_1         
	// 8402 15690:getfield        #247 <Field int azh.cl>
	// 8403 15693:aload_0         
	// 8404 15694:getfield        #12  <Field azh a>
	// 8405 15697:getfield        #95  <Field int azh.bs>
	// 8406 15700:ixor            
	// 8407 15701:putfield        #95  <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 8408 15704:aload_0         
	// 8409 15705:getfield        #12  <Field azh a>
	// 8410 15708:astore_1        
		abyte0.bs = ((azh) (abyte0)).bs ^ a.K;
	// 8411 15709:aload_1         
	// 8412 15710:aload_1         
	// 8413 15711:getfield        #95  <Field int azh.bs>
	// 8414 15714:aload_0         
	// 8415 15715:getfield        #12  <Field azh a>
	// 8416 15718:getfield        #331 <Field int azh.K>
	// 8417 15721:ixor            
	// 8418 15722:putfield        #95  <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 8419 15725:aload_0         
	// 8420 15726:getfield        #12  <Field azh a>
	// 8421 15729:astore_1        
		abyte0.cl = ~((azh) (abyte0)).bs;
	// 8422 15730:aload_1         
	// 8423 15731:aload_1         
	// 8424 15732:getfield        #95  <Field int azh.bs>
	// 8425 15735:iconst_m1       
	// 8426 15736:ixor            
	// 8427 15737:putfield        #247 <Field int azh.cl>
		abyte0 = ((byte []) (a));
	// 8428 15740:aload_0         
	// 8429 15741:getfield        #12  <Field azh a>
	// 8430 15744:astore_1        
		abyte0.aw = ((azh) (abyte0)).aw ^ a.bn;
	// 8431 15745:aload_1         
	// 8432 15746:aload_1         
	// 8433 15747:getfield        #199 <Field int azh.aw>
	// 8434 15750:aload_0         
	// 8435 15751:getfield        #12  <Field azh a>
	// 8436 15754:getfield        #423 <Field int azh.bn>
	// 8437 15757:ixor            
	// 8438 15758:putfield        #199 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 8439 15761:aload_0         
	// 8440 15762:getfield        #12  <Field azh a>
	// 8441 15765:astore_1        
		abyte0.aa = ((azh) (abyte0)).aw ^ a.aa;
	// 8442 15766:aload_1         
	// 8443 15767:aload_1         
	// 8444 15768:getfield        #199 <Field int azh.aw>
	// 8445 15771:aload_0         
	// 8446 15772:getfield        #12  <Field azh a>
	// 8447 15775:getfield        #140 <Field int azh.aa>
	// 8448 15778:ixor            
	// 8449 15779:putfield        #140 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 8450 15782:aload_0         
	// 8451 15783:getfield        #12  <Field azh a>
	// 8452 15786:astore_1        
		abyte0.bR = ((azh) (abyte0)).bC & a.bR;
	// 8453 15787:aload_1         
	// 8454 15788:aload_1         
	// 8455 15789:getfield        #352 <Field int azh.bC>
	// 8456 15792:aload_0         
	// 8457 15793:getfield        #12  <Field azh a>
	// 8458 15796:getfield        #444 <Field int azh.bR>
	// 8459 15799:iand            
	// 8460 15800:putfield        #444 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 8461 15803:aload_0         
	// 8462 15804:getfield        #12  <Field azh a>
	// 8463 15807:astore_1        
		abyte0.bR = ((azh) (abyte0)).cF ^ a.bR;
	// 8464 15808:aload_1         
	// 8465 15809:aload_1         
	// 8466 15810:getfield        #369 <Field int azh.cF>
	// 8467 15813:aload_0         
	// 8468 15814:getfield        #12  <Field azh a>
	// 8469 15817:getfield        #444 <Field int azh.bR>
	// 8470 15820:ixor            
	// 8471 15821:putfield        #444 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 8472 15824:aload_0         
	// 8473 15825:getfield        #12  <Field azh a>
	// 8474 15828:astore_1        
		abyte0.bL = ((azh) (abyte0)).bR ^ a.bL;
	// 8475 15829:aload_1         
	// 8476 15830:aload_1         
	// 8477 15831:getfield        #444 <Field int azh.bR>
	// 8478 15834:aload_0         
	// 8479 15835:getfield        #12  <Field azh a>
	// 8480 15838:getfield        #360 <Field int azh.bL>
	// 8481 15841:ixor            
	// 8482 15842:putfield        #360 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 8483 15845:aload_0         
	// 8484 15846:getfield        #12  <Field azh a>
	// 8485 15849:astore_1        
		abyte0.bL = ((azh) (abyte0)).M | a.bL;
	// 8486 15850:aload_1         
	// 8487 15851:aload_1         
	// 8488 15852:getfield        #167 <Field int azh.M>
	// 8489 15855:aload_0         
	// 8490 15856:getfield        #12  <Field azh a>
	// 8491 15859:getfield        #360 <Field int azh.bL>
	// 8492 15862:ior             
	// 8493 15863:putfield        #360 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 8494 15866:aload_0         
	// 8495 15867:getfield        #12  <Field azh a>
	// 8496 15870:astore_1        
		abyte0.bR = ((azh) (abyte0)).be & a.bC;
	// 8497 15871:aload_1         
	// 8498 15872:aload_1         
	// 8499 15873:getfield        #149 <Field int azh.be>
	// 8500 15876:aload_0         
	// 8501 15877:getfield        #12  <Field azh a>
	// 8502 15880:getfield        #352 <Field int azh.bC>
	// 8503 15883:iand            
	// 8504 15884:putfield        #444 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 8505 15887:aload_0         
	// 8506 15888:getfield        #12  <Field azh a>
	// 8507 15891:astore_1        
		abyte0.bR = ((azh) (abyte0)).bC ^ a.bR;
	// 8508 15892:aload_1         
	// 8509 15893:aload_1         
	// 8510 15894:getfield        #352 <Field int azh.bC>
	// 8511 15897:aload_0         
	// 8512 15898:getfield        #12  <Field azh a>
	// 8513 15901:getfield        #444 <Field int azh.bR>
	// 8514 15904:ixor            
	// 8515 15905:putfield        #444 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 8516 15908:aload_0         
	// 8517 15909:getfield        #12  <Field azh a>
	// 8518 15912:astore_1        
		abyte0.bR = ((azh) (abyte0)).bR & ~a.K;
	// 8519 15913:aload_1         
	// 8520 15914:aload_1         
	// 8521 15915:getfield        #444 <Field int azh.bR>
	// 8522 15918:aload_0         
	// 8523 15919:getfield        #12  <Field azh a>
	// 8524 15922:getfield        #331 <Field int azh.K>
	// 8525 15925:iconst_m1       
	// 8526 15926:ixor            
	// 8527 15927:iand            
	// 8528 15928:putfield        #444 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 8529 15931:aload_0         
	// 8530 15932:getfield        #12  <Field azh a>
	// 8531 15935:astore_1        
		abyte0.bR = ((azh) (abyte0)).aP ^ a.bR;
	// 8532 15936:aload_1         
	// 8533 15937:aload_1         
	// 8534 15938:getfield        #152 <Field int azh.aP>
	// 8535 15941:aload_0         
	// 8536 15942:getfield        #12  <Field azh a>
	// 8537 15945:getfield        #444 <Field int azh.bR>
	// 8538 15948:ixor            
	// 8539 15949:putfield        #444 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 8540 15952:aload_0         
	// 8541 15953:getfield        #12  <Field azh a>
	// 8542 15956:astore_1        
		abyte0.bR = ((azh) (abyte0)).cF | a.bR;
	// 8543 15957:aload_1         
	// 8544 15958:aload_1         
	// 8545 15959:getfield        #369 <Field int azh.cF>
	// 8546 15962:aload_0         
	// 8547 15963:getfield        #12  <Field azh a>
	// 8548 15966:getfield        #444 <Field int azh.bR>
	// 8549 15969:ior             
	// 8550 15970:putfield        #444 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 8551 15973:aload_0         
	// 8552 15974:getfield        #12  <Field azh a>
	// 8553 15977:astore_1        
		abyte0.aw = ((azh) (abyte0)).be & ~a.bC;
	// 8554 15978:aload_1         
	// 8555 15979:aload_1         
	// 8556 15980:getfield        #149 <Field int azh.be>
	// 8557 15983:aload_0         
	// 8558 15984:getfield        #12  <Field azh a>
	// 8559 15987:getfield        #352 <Field int azh.bC>
	// 8560 15990:iconst_m1       
	// 8561 15991:ixor            
	// 8562 15992:iand            
	// 8563 15993:putfield        #199 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 8564 15996:aload_0         
	// 8565 15997:getfield        #12  <Field azh a>
	// 8566 16000:astore_1        
		abyte0.aw = ((azh) (abyte0)).aw & ~a.K;
	// 8567 16001:aload_1         
	// 8568 16002:aload_1         
	// 8569 16003:getfield        #199 <Field int azh.aw>
	// 8570 16006:aload_0         
	// 8571 16007:getfield        #12  <Field azh a>
	// 8572 16010:getfield        #331 <Field int azh.K>
	// 8573 16013:iconst_m1       
	// 8574 16014:ixor            
	// 8575 16015:iand            
	// 8576 16016:putfield        #199 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 8577 16019:aload_0         
	// 8578 16020:getfield        #12  <Field azh a>
	// 8579 16023:astore_1        
		abyte0.a = ((azh) (abyte0)).bC & ~a.a;
	// 8580 16024:aload_1         
	// 8581 16025:aload_1         
	// 8582 16026:getfield        #352 <Field int azh.bC>
	// 8583 16029:aload_0         
	// 8584 16030:getfield        #12  <Field azh a>
	// 8585 16033:getfield        #354 <Field int azh.a>
	// 8586 16036:iconst_m1       
	// 8587 16037:ixor            
	// 8588 16038:iand            
	// 8589 16039:putfield        #354 <Field int azh.a>
		abyte0 = ((byte []) (a));
	// 8590 16042:aload_0         
	// 8591 16043:getfield        #12  <Field azh a>
	// 8592 16046:astore_1        
		abyte0.a = ((azh) (abyte0)).B ^ a.a;
	// 8593 16047:aload_1         
	// 8594 16048:aload_1         
	// 8595 16049:getfield        #447 <Field int azh.B>
	// 8596 16052:aload_0         
	// 8597 16053:getfield        #12  <Field azh a>
	// 8598 16056:getfield        #354 <Field int azh.a>
	// 8599 16059:ixor            
	// 8600 16060:putfield        #354 <Field int azh.a>
		abyte0 = ((byte []) (a));
	// 8601 16063:aload_0         
	// 8602 16064:getfield        #12  <Field azh a>
	// 8603 16067:astore_1        
		abyte0.ck = ((azh) (abyte0)).a ^ a.ck;
	// 8604 16068:aload_1         
	// 8605 16069:aload_1         
	// 8606 16070:getfield        #354 <Field int azh.a>
	// 8607 16073:aload_0         
	// 8608 16074:getfield        #12  <Field azh a>
	// 8609 16077:getfield        #143 <Field int azh.ck>
	// 8610 16080:ixor            
	// 8611 16081:putfield        #143 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 8612 16084:aload_0         
	// 8613 16085:getfield        #12  <Field azh a>
	// 8614 16088:astore_1        
		abyte0.bL = ((azh) (abyte0)).ck ^ a.bL;
	// 8615 16089:aload_1         
	// 8616 16090:aload_1         
	// 8617 16091:getfield        #143 <Field int azh.ck>
	// 8618 16094:aload_0         
	// 8619 16095:getfield        #12  <Field azh a>
	// 8620 16098:getfield        #360 <Field int azh.bL>
	// 8621 16101:ixor            
	// 8622 16102:putfield        #360 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 8623 16105:aload_0         
	// 8624 16106:getfield        #12  <Field azh a>
	// 8625 16109:astore_1        
		abyte0.Z = ((azh) (abyte0)).bL ^ a.Z;
	// 8626 16110:aload_1         
	// 8627 16111:aload_1         
	// 8628 16112:getfield        #360 <Field int azh.bL>
	// 8629 16115:aload_0         
	// 8630 16116:getfield        #12  <Field azh a>
	// 8631 16119:getfield        #137 <Field int azh.Z>
	// 8632 16122:ixor            
	// 8633 16123:putfield        #137 <Field int azh.Z>
		abyte0 = ((byte []) (a));
	// 8634 16126:aload_0         
	// 8635 16127:getfield        #12  <Field azh a>
	// 8636 16130:astore_1        
		abyte0.bL = ((azh) (abyte0)).Z & ~a.ae;
	// 8637 16131:aload_1         
	// 8638 16132:aload_1         
	// 8639 16133:getfield        #137 <Field int azh.Z>
	// 8640 16136:aload_0         
	// 8641 16137:getfield        #12  <Field azh a>
	// 8642 16140:getfield        #238 <Field int azh.ae>
	// 8643 16143:iconst_m1       
	// 8644 16144:ixor            
	// 8645 16145:iand            
	// 8646 16146:putfield        #360 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 8647 16149:aload_0         
	// 8648 16150:getfield        #12  <Field azh a>
	// 8649 16153:astore_1        
		abyte0.ck = ((azh) (abyte0)).Z & ~a.ae;
	// 8650 16154:aload_1         
	// 8651 16155:aload_1         
	// 8652 16156:getfield        #137 <Field int azh.Z>
	// 8653 16159:aload_0         
	// 8654 16160:getfield        #12  <Field azh a>
	// 8655 16163:getfield        #238 <Field int azh.ae>
	// 8656 16166:iconst_m1       
	// 8657 16167:ixor            
	// 8658 16168:iand            
	// 8659 16169:putfield        #143 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 8660 16172:aload_0         
	// 8661 16173:getfield        #12  <Field azh a>
	// 8662 16176:astore_1        
		abyte0.av = ((azh) (abyte0)).bC & ~a.av;
	// 8663 16177:aload_1         
	// 8664 16178:aload_1         
	// 8665 16179:getfield        #352 <Field int azh.bC>
	// 8666 16182:aload_0         
	// 8667 16183:getfield        #12  <Field azh a>
	// 8668 16186:getfield        #450 <Field int azh.av>
	// 8669 16189:iconst_m1       
	// 8670 16190:ixor            
	// 8671 16191:iand            
	// 8672 16192:putfield        #450 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 8673 16195:aload_0         
	// 8674 16196:getfield        #12  <Field azh a>
	// 8675 16199:astore_1        
		abyte0.av = ((azh) (abyte0)).ba ^ a.av;
	// 8676 16200:aload_1         
	// 8677 16201:aload_1         
	// 8678 16202:getfield        #366 <Field int azh.ba>
	// 8679 16205:aload_0         
	// 8680 16206:getfield        #12  <Field azh a>
	// 8681 16209:getfield        #450 <Field int azh.av>
	// 8682 16212:ixor            
	// 8683 16213:putfield        #450 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 8684 16216:aload_0         
	// 8685 16217:getfield        #12  <Field azh a>
	// 8686 16220:astore_1        
		abyte0.av = ((azh) (abyte0)).av & ~a.E;
	// 8687 16221:aload_1         
	// 8688 16222:aload_1         
	// 8689 16223:getfield        #450 <Field int azh.av>
	// 8690 16226:aload_0         
	// 8691 16227:getfield        #12  <Field azh a>
	// 8692 16230:getfield        #363 <Field int azh.E>
	// 8693 16233:iconst_m1       
	// 8694 16234:ixor            
	// 8695 16235:iand            
	// 8696 16236:putfield        #450 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 8697 16239:aload_0         
	// 8698 16240:getfield        #12  <Field azh a>
	// 8699 16243:astore_1        
		abyte0.bA = ((azh) (abyte0)).bC & ~a.bA;
	// 8700 16244:aload_1         
	// 8701 16245:aload_1         
	// 8702 16246:getfield        #352 <Field int azh.bC>
	// 8703 16249:aload_0         
	// 8704 16250:getfield        #12  <Field azh a>
	// 8705 16253:getfield        #453 <Field int azh.bA>
	// 8706 16256:iconst_m1       
	// 8707 16257:ixor            
	// 8708 16258:iand            
	// 8709 16259:putfield        #453 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 8710 16262:aload_0         
	// 8711 16263:getfield        #12  <Field azh a>
	// 8712 16266:astore_1        
		abyte0.bA = ((azh) (abyte0)).af ^ a.bA;
	// 8713 16267:aload_1         
	// 8714 16268:aload_1         
	// 8715 16269:getfield        #456 <Field int azh.af>
	// 8716 16272:aload_0         
	// 8717 16273:getfield        #12  <Field azh a>
	// 8718 16276:getfield        #453 <Field int azh.bA>
	// 8719 16279:ixor            
	// 8720 16280:putfield        #453 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 8721 16283:aload_0         
	// 8722 16284:getfield        #12  <Field azh a>
	// 8723 16287:astore_1        
		abyte0.aS = ((azh) (abyte0)).bA ^ a.aS;
	// 8724 16288:aload_1         
	// 8725 16289:aload_1         
	// 8726 16290:getfield        #453 <Field int azh.bA>
	// 8727 16293:aload_0         
	// 8728 16294:getfield        #12  <Field azh a>
	// 8729 16297:getfield        #408 <Field int azh.aS>
	// 8730 16300:ixor            
	// 8731 16301:putfield        #408 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 8732 16304:aload_0         
	// 8733 16305:getfield        #12  <Field azh a>
	// 8734 16308:astore_1        
		abyte0.aS = ((azh) (abyte0)).aS & ~a.M;
	// 8735 16309:aload_1         
	// 8736 16310:aload_1         
	// 8737 16311:getfield        #408 <Field int azh.aS>
	// 8738 16314:aload_0         
	// 8739 16315:getfield        #12  <Field azh a>
	// 8740 16318:getfield        #167 <Field int azh.M>
	// 8741 16321:iconst_m1       
	// 8742 16322:ixor            
	// 8743 16323:iand            
	// 8744 16324:putfield        #408 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 8745 16327:aload_0         
	// 8746 16328:getfield        #12  <Field azh a>
	// 8747 16331:astore_1        
		abyte0.aS = ((azh) (abyte0)).cC ^ a.aS;
	// 8748 16332:aload_1         
	// 8749 16333:aload_1         
	// 8750 16334:getfield        #59  <Field int azh.cC>
	// 8751 16337:aload_0         
	// 8752 16338:getfield        #12  <Field azh a>
	// 8753 16341:getfield        #408 <Field int azh.aS>
	// 8754 16344:ixor            
	// 8755 16345:putfield        #408 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 8756 16348:aload_0         
	// 8757 16349:getfield        #12  <Field azh a>
	// 8758 16352:astore_1        
		abyte0.ad = ((azh) (abyte0)).aS ^ a.ad;
	// 8759 16353:aload_1         
	// 8760 16354:aload_1         
	// 8761 16355:getfield        #408 <Field int azh.aS>
	// 8762 16358:aload_0         
	// 8763 16359:getfield        #12  <Field azh a>
	// 8764 16362:getfield        #459 <Field int azh.ad>
	// 8765 16365:ixor            
	// 8766 16366:putfield        #459 <Field int azh.ad>
		abyte0 = ((byte []) (a));
	// 8767 16369:aload_0         
	// 8768 16370:getfield        #12  <Field azh a>
	// 8769 16373:astore_1        
		abyte0.cs = ((azh) (abyte0)).ad & ~a.cs;
	// 8770 16374:aload_1         
	// 8771 16375:aload_1         
	// 8772 16376:getfield        #459 <Field int azh.ad>
	// 8773 16379:aload_0         
	// 8774 16380:getfield        #12  <Field azh a>
	// 8775 16383:getfield        #65  <Field int azh.cs>
	// 8776 16386:iconst_m1       
	// 8777 16387:ixor            
	// 8778 16388:iand            
	// 8779 16389:putfield        #65  <Field int azh.cs>
		abyte0 = ((byte []) (a));
	// 8780 16392:aload_0         
	// 8781 16393:getfield        #12  <Field azh a>
	// 8782 16396:astore_1        
		abyte0.cs = ((azh) (abyte0)).cA ^ a.cs;
	// 8783 16397:aload_1         
	// 8784 16398:aload_1         
	// 8785 16399:getfield        #304 <Field int azh.cA>
	// 8786 16402:aload_0         
	// 8787 16403:getfield        #12  <Field azh a>
	// 8788 16406:getfield        #65  <Field int azh.cs>
	// 8789 16409:ixor            
	// 8790 16410:putfield        #65  <Field int azh.cs>
		abyte0 = ((byte []) (a));
	// 8791 16413:aload_0         
	// 8792 16414:getfield        #12  <Field azh a>
	// 8793 16417:astore_1        
		abyte0.bu = ((azh) (abyte0)).cs ^ a.bu;
	// 8794 16418:aload_1         
	// 8795 16419:aload_1         
	// 8796 16420:getfield        #65  <Field int azh.cs>
	// 8797 16423:aload_0         
	// 8798 16424:getfield        #12  <Field azh a>
	// 8799 16427:getfield        #41  <Field int azh.bu>
	// 8800 16430:ixor            
	// 8801 16431:putfield        #41  <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 8802 16434:aload_0         
	// 8803 16435:getfield        #12  <Field azh a>
	// 8804 16438:astore_1        
		abyte0.cs = ~((azh) (abyte0)).bu;
	// 8805 16439:aload_1         
	// 8806 16440:aload_1         
	// 8807 16441:getfield        #41  <Field int azh.bu>
	// 8808 16444:iconst_m1       
	// 8809 16445:ixor            
	// 8810 16446:putfield        #65  <Field int azh.cs>
		abyte0 = ((byte []) (a));
	// 8811 16449:aload_0         
	// 8812 16450:getfield        #12  <Field azh a>
	// 8813 16453:astore_1        
		abyte0.am = ((azh) (abyte0)).ad & a.am;
	// 8814 16454:aload_1         
	// 8815 16455:aload_1         
	// 8816 16456:getfield        #459 <Field int azh.ad>
	// 8817 16459:aload_0         
	// 8818 16460:getfield        #12  <Field azh a>
	// 8819 16463:getfield        #77  <Field int azh.am>
	// 8820 16466:iand            
	// 8821 16467:putfield        #77  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 8822 16470:aload_0         
	// 8823 16471:getfield        #12  <Field azh a>
	// 8824 16474:astore_1        
		abyte0.am = ((azh) (abyte0)).aE ^ a.am;
	// 8825 16475:aload_1         
	// 8826 16476:aload_1         
	// 8827 16477:getfield        #104 <Field int azh.aE>
	// 8828 16480:aload_0         
	// 8829 16481:getfield        #12  <Field azh a>
	// 8830 16484:getfield        #77  <Field int azh.am>
	// 8831 16487:ixor            
	// 8832 16488:putfield        #77  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 8833 16491:aload_0         
	// 8834 16492:getfield        #12  <Field azh a>
	// 8835 16495:astore_1        
		abyte0.am = ((azh) (abyte0)).am ^ a.cF;
	// 8836 16496:aload_1         
	// 8837 16497:aload_1         
	// 8838 16498:getfield        #77  <Field int azh.am>
	// 8839 16501:aload_0         
	// 8840 16502:getfield        #12  <Field azh a>
	// 8841 16505:getfield        #369 <Field int azh.cF>
	// 8842 16508:ixor            
	// 8843 16509:putfield        #77  <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 8844 16512:aload_0         
	// 8845 16513:getfield        #12  <Field azh a>
	// 8846 16516:astore_1        
		abyte0.aE = ~((azh) (abyte0)).am;
	// 8847 16517:aload_1         
	// 8848 16518:aload_1         
	// 8849 16519:getfield        #77  <Field int azh.am>
	// 8850 16522:iconst_m1       
	// 8851 16523:ixor            
	// 8852 16524:putfield        #104 <Field int azh.aE>
		abyte0 = ((byte []) (a));
	// 8853 16527:aload_0         
	// 8854 16528:getfield        #12  <Field azh a>
	// 8855 16531:astore_1        
		abyte0.cw = ((azh) (abyte0)).ad & ~a.cw;
	// 8856 16532:aload_1         
	// 8857 16533:aload_1         
	// 8858 16534:getfield        #459 <Field int azh.ad>
	// 8859 16537:aload_0         
	// 8860 16538:getfield        #12  <Field azh a>
	// 8861 16541:getfield        #310 <Field int azh.cw>
	// 8862 16544:iconst_m1       
	// 8863 16545:ixor            
	// 8864 16546:iand            
	// 8865 16547:putfield        #310 <Field int azh.cw>
		abyte0 = ((byte []) (a));
	// 8866 16550:aload_0         
	// 8867 16551:getfield        #12  <Field azh a>
	// 8868 16554:astore_1        
		abyte0.cw = ((azh) (abyte0)).bh ^ a.cw;
	// 8869 16555:aload_1         
	// 8870 16556:aload_1         
	// 8871 16557:getfield        #307 <Field int azh.bh>
	// 8872 16560:aload_0         
	// 8873 16561:getfield        #12  <Field azh a>
	// 8874 16564:getfield        #310 <Field int azh.cw>
	// 8875 16567:ixor            
	// 8876 16568:putfield        #310 <Field int azh.cw>
		abyte0 = ((byte []) (a));
	// 8877 16571:aload_0         
	// 8878 16572:getfield        #12  <Field azh a>
	// 8879 16575:astore_1        
		abyte0.aI = ((azh) (abyte0)).cw ^ a.aI;
	// 8880 16576:aload_1         
	// 8881 16577:aload_1         
	// 8882 16578:getfield        #310 <Field int azh.cw>
	// 8883 16581:aload_0         
	// 8884 16582:getfield        #12  <Field azh a>
	// 8885 16585:getfield        #462 <Field int azh.aI>
	// 8886 16588:ixor            
	// 8887 16589:putfield        #462 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 8888 16592:aload_0         
	// 8889 16593:getfield        #12  <Field azh a>
	// 8890 16596:astore_1        
		abyte0.cw = ~((azh) (abyte0)).aI;
	// 8891 16597:aload_1         
	// 8892 16598:aload_1         
	// 8893 16599:getfield        #462 <Field int azh.aI>
	// 8894 16602:iconst_m1       
	// 8895 16603:ixor            
	// 8896 16604:putfield        #310 <Field int azh.cw>
		abyte0 = ((byte []) (a));
	// 8897 16607:aload_0         
	// 8898 16608:getfield        #12  <Field azh a>
	// 8899 16611:astore_1        
		abyte0.aV = ((azh) (abyte0)).ad & a.aV;
	// 8900 16612:aload_1         
	// 8901 16613:aload_1         
	// 8902 16614:getfield        #459 <Field int azh.ad>
	// 8903 16617:aload_0         
	// 8904 16618:getfield        #12  <Field azh a>
	// 8905 16621:getfield        #313 <Field int azh.aV>
	// 8906 16624:iand            
	// 8907 16625:putfield        #313 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 8908 16628:aload_0         
	// 8909 16629:getfield        #12  <Field azh a>
	// 8910 16632:astore_1        
		abyte0.aV = ((azh) (abyte0)).bM ^ a.aV;
	// 8911 16633:aload_1         
	// 8912 16634:aload_1         
	// 8913 16635:getfield        #229 <Field int azh.bM>
	// 8914 16638:aload_0         
	// 8915 16639:getfield        #12  <Field azh a>
	// 8916 16642:getfield        #313 <Field int azh.aV>
	// 8917 16645:ixor            
	// 8918 16646:putfield        #313 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 8919 16649:aload_0         
	// 8920 16650:getfield        #12  <Field azh a>
	// 8921 16653:astore_1        
		abyte0.k = ((azh) (abyte0)).aV ^ a.k;
	// 8922 16654:aload_1         
	// 8923 16655:aload_1         
	// 8924 16656:getfield        #313 <Field int azh.aV>
	// 8925 16659:aload_0         
	// 8926 16660:getfield        #12  <Field azh a>
	// 8927 16663:getfield        #283 <Field int azh.k>
	// 8928 16666:ixor            
	// 8929 16667:putfield        #283 <Field int azh.k>
		abyte0 = ((byte []) (a));
	// 8930 16670:aload_0         
	// 8931 16671:getfield        #12  <Field azh a>
	// 8932 16674:astore_1        
		abyte0.aV = ((azh) (abyte0)).bC ^ a.be;
	// 8933 16675:aload_1         
	// 8934 16676:aload_1         
	// 8935 16677:getfield        #352 <Field int azh.bC>
	// 8936 16680:aload_0         
	// 8937 16681:getfield        #12  <Field azh a>
	// 8938 16684:getfield        #149 <Field int azh.be>
	// 8939 16687:ixor            
	// 8940 16688:putfield        #313 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 8941 16691:aload_0         
	// 8942 16692:getfield        #12  <Field azh a>
	// 8943 16695:astore_1        
		abyte0.aH = ((azh) (abyte0)).aV ^ a.aH;
	// 8944 16696:aload_1         
	// 8945 16697:aload_1         
	// 8946 16698:getfield        #313 <Field int azh.aV>
	// 8947 16701:aload_0         
	// 8948 16702:getfield        #12  <Field azh a>
	// 8949 16705:getfield        #399 <Field int azh.aH>
	// 8950 16708:ixor            
	// 8951 16709:putfield        #399 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 8952 16712:aload_0         
	// 8953 16713:getfield        #12  <Field azh a>
	// 8954 16716:astore_1        
		abyte0.aV = ((azh) (abyte0)).aP | a.bC;
	// 8955 16717:aload_1         
	// 8956 16718:aload_1         
	// 8957 16719:getfield        #152 <Field int azh.aP>
	// 8958 16722:aload_0         
	// 8959 16723:getfield        #12  <Field azh a>
	// 8960 16726:getfield        #352 <Field int azh.bC>
	// 8961 16729:ior             
	// 8962 16730:putfield        #313 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 8963 16733:aload_0         
	// 8964 16734:getfield        #12  <Field azh a>
	// 8965 16737:astore_1        
		abyte0.bM = ((azh) (abyte0)).be & ~a.aV;
	// 8966 16738:aload_1         
	// 8967 16739:aload_1         
	// 8968 16740:getfield        #149 <Field int azh.be>
	// 8969 16743:aload_0         
	// 8970 16744:getfield        #12  <Field azh a>
	// 8971 16747:getfield        #313 <Field int azh.aV>
	// 8972 16750:iconst_m1       
	// 8973 16751:ixor            
	// 8974 16752:iand            
	// 8975 16753:putfield        #229 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 8976 16756:aload_0         
	// 8977 16757:getfield        #12  <Field azh a>
	// 8978 16760:astore_1        
		abyte0.bM = ((azh) (abyte0)).cg ^ a.bM;
	// 8979 16761:aload_1         
	// 8980 16762:aload_1         
	// 8981 16763:getfield        #384 <Field int azh.cg>
	// 8982 16766:aload_0         
	// 8983 16767:getfield        #12  <Field azh a>
	// 8984 16770:getfield        #229 <Field int azh.bM>
	// 8985 16773:ixor            
	// 8986 16774:putfield        #229 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 8987 16777:aload_0         
	// 8988 16778:getfield        #12  <Field azh a>
	// 8989 16781:astore_1        
		abyte0.cg = ((azh) (abyte0)).be & a.aV;
	// 8990 16782:aload_1         
	// 8991 16783:aload_1         
	// 8992 16784:getfield        #149 <Field int azh.be>
	// 8993 16787:aload_0         
	// 8994 16788:getfield        #12  <Field azh a>
	// 8995 16791:getfield        #313 <Field int azh.aV>
	// 8996 16794:iand            
	// 8997 16795:putfield        #384 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 8998 16798:aload_0         
	// 8999 16799:getfield        #12  <Field azh a>
	// 9000 16802:astore_1        
		abyte0.cg = ((azh) (abyte0)).aV ^ a.cg;
	// 9001 16803:aload_1         
	// 9002 16804:aload_1         
	// 9003 16805:getfield        #313 <Field int azh.aV>
	// 9004 16808:aload_0         
	// 9005 16809:getfield        #12  <Field azh a>
	// 9006 16812:getfield        #384 <Field int azh.cg>
	// 9007 16815:ixor            
	// 9008 16816:putfield        #384 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 9009 16819:aload_0         
	// 9010 16820:getfield        #12  <Field azh a>
	// 9011 16823:astore_1        
		abyte0.cg = ((azh) (abyte0)).K | a.cg;
	// 9012 16824:aload_1         
	// 9013 16825:aload_1         
	// 9014 16826:getfield        #331 <Field int azh.K>
	// 9015 16829:aload_0         
	// 9016 16830:getfield        #12  <Field azh a>
	// 9017 16833:getfield        #384 <Field int azh.cg>
	// 9018 16836:ior             
	// 9019 16837:putfield        #384 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 9020 16840:aload_0         
	// 9021 16841:getfield        #12  <Field azh a>
	// 9022 16844:astore_1        
		abyte0.cg = ((azh) (abyte0)).bM ^ a.cg;
	// 9023 16845:aload_1         
	// 9024 16846:aload_1         
	// 9025 16847:getfield        #229 <Field int azh.bM>
	// 9026 16850:aload_0         
	// 9027 16851:getfield        #12  <Field azh a>
	// 9028 16854:getfield        #384 <Field int azh.cg>
	// 9029 16857:ixor            
	// 9030 16858:putfield        #384 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 9031 16861:aload_0         
	// 9032 16862:getfield        #12  <Field azh a>
	// 9033 16865:astore_1        
		abyte0.s = ((azh) (abyte0)).aV ^ a.s;
	// 9034 16866:aload_1         
	// 9035 16867:aload_1         
	// 9036 16868:getfield        #313 <Field int azh.aV>
	// 9037 16871:aload_0         
	// 9038 16872:getfield        #12  <Field azh a>
	// 9039 16875:getfield        #381 <Field int azh.s>
	// 9040 16878:ixor            
	// 9041 16879:putfield        #381 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 9042 16882:aload_0         
	// 9043 16883:getfield        #12  <Field azh a>
	// 9044 16886:astore_1        
		abyte0.s = ((azh) (abyte0)).s & ~a.cF;
	// 9045 16887:aload_1         
	// 9046 16888:aload_1         
	// 9047 16889:getfield        #381 <Field int azh.s>
	// 9048 16892:aload_0         
	// 9049 16893:getfield        #12  <Field azh a>
	// 9050 16896:getfield        #369 <Field int azh.cF>
	// 9051 16899:iconst_m1       
	// 9052 16900:ixor            
	// 9053 16901:iand            
	// 9054 16902:putfield        #381 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 9055 16905:aload_0         
	// 9056 16906:getfield        #12  <Field azh a>
	// 9057 16909:astore_1        
		abyte0.s = ((azh) (abyte0)).cg ^ a.s;
	// 9058 16910:aload_1         
	// 9059 16911:aload_1         
	// 9060 16912:getfield        #384 <Field int azh.cg>
	// 9061 16915:aload_0         
	// 9062 16916:getfield        #12  <Field azh a>
	// 9063 16919:getfield        #381 <Field int azh.s>
	// 9064 16922:ixor            
	// 9065 16923:putfield        #381 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 9066 16926:aload_0         
	// 9067 16927:getfield        #12  <Field azh a>
	// 9068 16930:astore_1        
		abyte0.cg = ((azh) (abyte0)).be & ~a.aV;
	// 9069 16931:aload_1         
	// 9070 16932:aload_1         
	// 9071 16933:getfield        #149 <Field int azh.be>
	// 9072 16936:aload_0         
	// 9073 16937:getfield        #12  <Field azh a>
	// 9074 16940:getfield        #313 <Field int azh.aV>
	// 9075 16943:iconst_m1       
	// 9076 16944:ixor            
	// 9077 16945:iand            
	// 9078 16946:putfield        #384 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 9079 16949:aload_0         
	// 9080 16950:getfield        #12  <Field azh a>
	// 9081 16953:astore_1        
		abyte0.cg = ((azh) (abyte0)).aP ^ a.cg;
	// 9082 16954:aload_1         
	// 9083 16955:aload_1         
	// 9084 16956:getfield        #152 <Field int azh.aP>
	// 9085 16959:aload_0         
	// 9086 16960:getfield        #12  <Field azh a>
	// 9087 16963:getfield        #384 <Field int azh.cg>
	// 9088 16966:ixor            
	// 9089 16967:putfield        #384 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 9090 16970:aload_0         
	// 9091 16971:getfield        #12  <Field azh a>
	// 9092 16974:astore_1        
		abyte0.cg = ((azh) (abyte0)).cg & ~a.K;
	// 9093 16975:aload_1         
	// 9094 16976:aload_1         
	// 9095 16977:getfield        #384 <Field int azh.cg>
	// 9096 16980:aload_0         
	// 9097 16981:getfield        #12  <Field azh a>
	// 9098 16984:getfield        #331 <Field int azh.K>
	// 9099 16987:iconst_m1       
	// 9100 16988:ixor            
	// 9101 16989:iand            
	// 9102 16990:putfield        #384 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 9103 16993:aload_0         
	// 9104 16994:getfield        #12  <Field azh a>
	// 9105 16997:astore_1        
		abyte0.cg = ((azh) (abyte0)).cy ^ a.cg;
	// 9106 16998:aload_1         
	// 9107 16999:aload_1         
	// 9108 17000:getfield        #80  <Field int azh.cy>
	// 9109 17003:aload_0         
	// 9110 17004:getfield        #12  <Field azh a>
	// 9111 17007:getfield        #384 <Field int azh.cg>
	// 9112 17010:ixor            
	// 9113 17011:putfield        #384 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 9114 17014:aload_0         
	// 9115 17015:getfield        #12  <Field azh a>
	// 9116 17018:astore_1        
		abyte0.cc = ((azh) (abyte0)).cg ^ a.cc;
	// 9117 17019:aload_1         
	// 9118 17020:aload_1         
	// 9119 17021:getfield        #384 <Field int azh.cg>
	// 9120 17024:aload_0         
	// 9121 17025:getfield        #12  <Field azh a>
	// 9122 17028:getfield        #262 <Field int azh.cc>
	// 9123 17031:ixor            
	// 9124 17032:putfield        #262 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 9125 17035:aload_0         
	// 9126 17036:getfield        #12  <Field azh a>
	// 9127 17039:astore_1        
		abyte0.cg = ((azh) (abyte0)).be & ~a.aV;
	// 9128 17040:aload_1         
	// 9129 17041:aload_1         
	// 9130 17042:getfield        #149 <Field int azh.be>
	// 9131 17045:aload_0         
	// 9132 17046:getfield        #12  <Field azh a>
	// 9133 17049:getfield        #313 <Field int azh.aV>
	// 9134 17052:iconst_m1       
	// 9135 17053:ixor            
	// 9136 17054:iand            
	// 9137 17055:putfield        #384 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 9138 17058:aload_0         
	// 9139 17059:getfield        #12  <Field azh a>
	// 9140 17062:astore_1        
		abyte0.cg = ((azh) (abyte0)).W ^ a.cg;
	// 9141 17063:aload_1         
	// 9142 17064:aload_1         
	// 9143 17065:getfield        #357 <Field int azh.W>
	// 9144 17068:aload_0         
	// 9145 17069:getfield        #12  <Field azh a>
	// 9146 17072:getfield        #384 <Field int azh.cg>
	// 9147 17075:ixor            
	// 9148 17076:putfield        #384 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 9149 17079:aload_0         
	// 9150 17080:getfield        #12  <Field azh a>
	// 9151 17083:astore_1        
		abyte0.cg = ((azh) (abyte0)).cg & a.K;
	// 9152 17084:aload_1         
	// 9153 17085:aload_1         
	// 9154 17086:getfield        #384 <Field int azh.cg>
	// 9155 17089:aload_0         
	// 9156 17090:getfield        #12  <Field azh a>
	// 9157 17093:getfield        #331 <Field int azh.K>
	// 9158 17096:iand            
	// 9159 17097:putfield        #384 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 9160 17100:aload_0         
	// 9161 17101:getfield        #12  <Field azh a>
	// 9162 17104:astore_1        
		abyte0.cg = ((azh) (abyte0)).aP ^ a.cg;
	// 9163 17105:aload_1         
	// 9164 17106:aload_1         
	// 9165 17107:getfield        #152 <Field int azh.aP>
	// 9166 17110:aload_0         
	// 9167 17111:getfield        #12  <Field azh a>
	// 9168 17114:getfield        #384 <Field int azh.cg>
	// 9169 17117:ixor            
	// 9170 17118:putfield        #384 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 9171 17121:aload_0         
	// 9172 17122:getfield        #12  <Field azh a>
	// 9173 17125:astore_1        
		abyte0.bR = ((azh) (abyte0)).cg ^ a.bR;
	// 9174 17126:aload_1         
	// 9175 17127:aload_1         
	// 9176 17128:getfield        #384 <Field int azh.cg>
	// 9177 17131:aload_0         
	// 9178 17132:getfield        #12  <Field azh a>
	// 9179 17135:getfield        #444 <Field int azh.bR>
	// 9180 17138:ixor            
	// 9181 17139:putfield        #444 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 9182 17142:aload_0         
	// 9183 17143:getfield        #12  <Field azh a>
	// 9184 17146:astore_1        
		abyte0.bR = ((azh) (abyte0)).bR | a.bK;
	// 9185 17147:aload_1         
	// 9186 17148:aload_1         
	// 9187 17149:getfield        #444 <Field int azh.bR>
	// 9188 17152:aload_0         
	// 9189 17153:getfield        #12  <Field azh a>
	// 9190 17156:getfield        #334 <Field int azh.bK>
	// 9191 17159:ior             
	// 9192 17160:putfield        #444 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 9193 17163:aload_0         
	// 9194 17164:getfield        #12  <Field azh a>
	// 9195 17167:astore_1        
		abyte0.bR = ((azh) (abyte0)).s ^ a.bR;
	// 9196 17168:aload_1         
	// 9197 17169:aload_1         
	// 9198 17170:getfield        #381 <Field int azh.s>
	// 9199 17173:aload_0         
	// 9200 17174:getfield        #12  <Field azh a>
	// 9201 17177:getfield        #444 <Field int azh.bR>
	// 9202 17180:ixor            
	// 9203 17181:putfield        #444 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 9204 17184:aload_0         
	// 9205 17185:getfield        #12  <Field azh a>
	// 9206 17188:astore_1        
		abyte0.f = ((azh) (abyte0)).bR ^ a.f;
	// 9207 17189:aload_1         
	// 9208 17190:aload_1         
	// 9209 17191:getfield        #444 <Field int azh.bR>
	// 9210 17194:aload_0         
	// 9211 17195:getfield        #12  <Field azh a>
	// 9212 17198:getfield        #107 <Field int azh.f>
	// 9213 17201:ixor            
	// 9214 17202:putfield        #107 <Field int azh.f>
		abyte0 = ((byte []) (a));
	// 9215 17205:aload_0         
	// 9216 17206:getfield        #12  <Field azh a>
	// 9217 17209:astore_1        
		abyte0.bR = ((azh) (abyte0)).f & ~a.aG;
	// 9218 17210:aload_1         
	// 9219 17211:aload_1         
	// 9220 17212:getfield        #107 <Field int azh.f>
	// 9221 17215:aload_0         
	// 9222 17216:getfield        #12  <Field azh a>
	// 9223 17219:getfield        #146 <Field int azh.aG>
	// 9224 17222:iconst_m1       
	// 9225 17223:ixor            
	// 9226 17224:iand            
	// 9227 17225:putfield        #444 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 9228 17228:aload_0         
	// 9229 17229:getfield        #12  <Field azh a>
	// 9230 17232:astore_1        
		abyte0.s = ((azh) (abyte0)).f & ~a.ae;
	// 9231 17233:aload_1         
	// 9232 17234:aload_1         
	// 9233 17235:getfield        #107 <Field int azh.f>
	// 9234 17238:aload_0         
	// 9235 17239:getfield        #12  <Field azh a>
	// 9236 17242:getfield        #238 <Field int azh.ae>
	// 9237 17245:iconst_m1       
	// 9238 17246:ixor            
	// 9239 17247:iand            
	// 9240 17248:putfield        #381 <Field int azh.s>
		abyte0 = ((byte []) (a));
	// 9241 17251:aload_0         
	// 9242 17252:getfield        #12  <Field azh a>
	// 9243 17255:astore_1        
		abyte0.cg = ((azh) (abyte0)).f & ~a.s;
	// 9244 17256:aload_1         
	// 9245 17257:aload_1         
	// 9246 17258:getfield        #107 <Field int azh.f>
	// 9247 17261:aload_0         
	// 9248 17262:getfield        #12  <Field azh a>
	// 9249 17265:getfield        #381 <Field int azh.s>
	// 9250 17268:iconst_m1       
	// 9251 17269:ixor            
	// 9252 17270:iand            
	// 9253 17271:putfield        #384 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 9254 17274:aload_0         
	// 9255 17275:getfield        #12  <Field azh a>
	// 9256 17278:astore_1        
		abyte0.cg = ((azh) (abyte0)).Z & ~a.cg;
	// 9257 17279:aload_1         
	// 9258 17280:aload_1         
	// 9259 17281:getfield        #137 <Field int azh.Z>
	// 9260 17284:aload_0         
	// 9261 17285:getfield        #12  <Field azh a>
	// 9262 17288:getfield        #384 <Field int azh.cg>
	// 9263 17291:iconst_m1       
	// 9264 17292:ixor            
	// 9265 17293:iand            
	// 9266 17294:putfield        #384 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 9267 17297:aload_0         
	// 9268 17298:getfield        #12  <Field azh a>
	// 9269 17301:astore_1        
		abyte0.ck = ((azh) (abyte0)).s ^ a.ck;
	// 9270 17302:aload_1         
	// 9271 17303:aload_1         
	// 9272 17304:getfield        #381 <Field int azh.s>
	// 9273 17307:aload_0         
	// 9274 17308:getfield        #12  <Field azh a>
	// 9275 17311:getfield        #143 <Field int azh.ck>
	// 9276 17314:ixor            
	// 9277 17315:putfield        #143 <Field int azh.ck>
		abyte0 = ((byte []) (a));
	// 9278 17318:aload_0         
	// 9279 17319:getfield        #12  <Field azh a>
	// 9280 17322:astore_1        
		abyte0.W = ((azh) (abyte0)).s ^ a.Z;
	// 9281 17323:aload_1         
	// 9282 17324:aload_1         
	// 9283 17325:getfield        #381 <Field int azh.s>
	// 9284 17328:aload_0         
	// 9285 17329:getfield        #12  <Field azh a>
	// 9286 17332:getfield        #137 <Field int azh.Z>
	// 9287 17335:ixor            
	// 9288 17336:putfield        #357 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 9289 17339:aload_0         
	// 9290 17340:getfield        #12  <Field azh a>
	// 9291 17343:astore_1        
		abyte0.cy = ((azh) (abyte0)).Z & a.s;
	// 9292 17344:aload_1         
	// 9293 17345:aload_1         
	// 9294 17346:getfield        #137 <Field int azh.Z>
	// 9295 17349:aload_0         
	// 9296 17350:getfield        #12  <Field azh a>
	// 9297 17353:getfield        #381 <Field int azh.s>
	// 9298 17356:iand            
	// 9299 17357:putfield        #80  <Field int azh.cy>
		abyte0 = ((byte []) (a));
	// 9300 17360:aload_0         
	// 9301 17361:getfield        #12  <Field azh a>
	// 9302 17364:astore_1        
		abyte0.bM = ((azh) (abyte0)).Z & a.s;
	// 9303 17365:aload_1         
	// 9304 17366:aload_1         
	// 9305 17367:getfield        #137 <Field int azh.Z>
	// 9306 17370:aload_0         
	// 9307 17371:getfield        #12  <Field azh a>
	// 9308 17374:getfield        #381 <Field int azh.s>
	// 9309 17377:iand            
	// 9310 17378:putfield        #229 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 9311 17381:aload_0         
	// 9312 17382:getfield        #12  <Field azh a>
	// 9313 17385:astore_1        
		abyte0.bh = ((azh) (abyte0)).f & ~a.aG;
	// 9314 17386:aload_1         
	// 9315 17387:aload_1         
	// 9316 17388:getfield        #107 <Field int azh.f>
	// 9317 17391:aload_0         
	// 9318 17392:getfield        #12  <Field azh a>
	// 9319 17395:getfield        #146 <Field int azh.aG>
	// 9320 17398:iconst_m1       
	// 9321 17399:ixor            
	// 9322 17400:iand            
	// 9323 17401:putfield        #307 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 9324 17404:aload_0         
	// 9325 17405:getfield        #12  <Field azh a>
	// 9326 17408:astore_1        
		abyte0.bh = ((azh) (abyte0)).v ^ a.bh;
	// 9327 17409:aload_1         
	// 9328 17410:aload_1         
	// 9329 17411:getfield        #110 <Field int azh.v>
	// 9330 17414:aload_0         
	// 9331 17415:getfield        #12  <Field azh a>
	// 9332 17418:getfield        #307 <Field int azh.bh>
	// 9333 17421:ixor            
	// 9334 17422:putfield        #307 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 9335 17425:aload_0         
	// 9336 17426:getfield        #12  <Field azh a>
	// 9337 17429:astore_1        
		abyte0.cA = ((azh) (abyte0)).f & ~a.v;
	// 9338 17430:aload_1         
	// 9339 17431:aload_1         
	// 9340 17432:getfield        #107 <Field int azh.f>
	// 9341 17435:aload_0         
	// 9342 17436:getfield        #12  <Field azh a>
	// 9343 17439:getfield        #110 <Field int azh.v>
	// 9344 17442:iconst_m1       
	// 9345 17443:ixor            
	// 9346 17444:iand            
	// 9347 17445:putfield        #304 <Field int azh.cA>
		abyte0 = ((byte []) (a));
	// 9348 17448:aload_0         
	// 9349 17449:getfield        #12  <Field azh a>
	// 9350 17452:astore_1        
		abyte0.aS = ((azh) (abyte0)).f ^ a.v;
	// 9351 17453:aload_1         
	// 9352 17454:aload_1         
	// 9353 17455:getfield        #107 <Field int azh.f>
	// 9354 17458:aload_0         
	// 9355 17459:getfield        #12  <Field azh a>
	// 9356 17462:getfield        #110 <Field int azh.v>
	// 9357 17465:ixor            
	// 9358 17466:putfield        #408 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 9359 17469:aload_0         
	// 9360 17470:getfield        #12  <Field azh a>
	// 9361 17473:astore_1        
		abyte0.cC = ((azh) (abyte0)).aG | a.aS;
	// 9362 17474:aload_1         
	// 9363 17475:aload_1         
	// 9364 17476:getfield        #146 <Field int azh.aG>
	// 9365 17479:aload_0         
	// 9366 17480:getfield        #12  <Field azh a>
	// 9367 17483:getfield        #408 <Field int azh.aS>
	// 9368 17486:ior             
	// 9369 17487:putfield        #59  <Field int azh.cC>
		abyte0 = ((byte []) (a));
	// 9370 17490:aload_0         
	// 9371 17491:getfield        #12  <Field azh a>
	// 9372 17494:astore_1        
		abyte0.bA = ((azh) (abyte0)).aS & ~a.aG;
	// 9373 17495:aload_1         
	// 9374 17496:aload_1         
	// 9375 17497:getfield        #408 <Field int azh.aS>
	// 9376 17500:aload_0         
	// 9377 17501:getfield        #12  <Field azh a>
	// 9378 17504:getfield        #146 <Field int azh.aG>
	// 9379 17507:iconst_m1       
	// 9380 17508:ixor            
	// 9381 17509:iand            
	// 9382 17510:putfield        #453 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 9383 17513:aload_0         
	// 9384 17514:getfield        #12  <Field azh a>
	// 9385 17517:astore_1        
		abyte0.af = ((azh) (abyte0)).aG | a.aS;
	// 9386 17518:aload_1         
	// 9387 17519:aload_1         
	// 9388 17520:getfield        #146 <Field int azh.aG>
	// 9389 17523:aload_0         
	// 9390 17524:getfield        #12  <Field azh a>
	// 9391 17527:getfield        #408 <Field int azh.aS>
	// 9392 17530:ior             
	// 9393 17531:putfield        #456 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 9394 17534:aload_0         
	// 9395 17535:getfield        #12  <Field azh a>
	// 9396 17538:astore_1        
		abyte0.ba = ((azh) (abyte0)).aS & ~a.aG;
	// 9397 17539:aload_1         
	// 9398 17540:aload_1         
	// 9399 17541:getfield        #408 <Field int azh.aS>
	// 9400 17544:aload_0         
	// 9401 17545:getfield        #12  <Field azh a>
	// 9402 17548:getfield        #146 <Field int azh.aG>
	// 9403 17551:iconst_m1       
	// 9404 17552:ixor            
	// 9405 17553:iand            
	// 9406 17554:putfield        #366 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 9407 17557:aload_0         
	// 9408 17558:getfield        #12  <Field azh a>
	// 9409 17561:astore_1        
		abyte0.a = ((azh) (abyte0)).Z & a.f;
	// 9410 17562:aload_1         
	// 9411 17563:aload_1         
	// 9412 17564:getfield        #137 <Field int azh.Z>
	// 9413 17567:aload_0         
	// 9414 17568:getfield        #12  <Field azh a>
	// 9415 17571:getfield        #107 <Field int azh.f>
	// 9416 17574:iand            
	// 9417 17575:putfield        #354 <Field int azh.a>
		abyte0 = ((byte []) (a));
	// 9418 17578:aload_0         
	// 9419 17579:getfield        #12  <Field azh a>
	// 9420 17582:astore_1        
		abyte0.cx = ((azh) (abyte0)).Z & ~a.f;
	// 9421 17583:aload_1         
	// 9422 17584:aload_1         
	// 9423 17585:getfield        #137 <Field int azh.Z>
	// 9424 17588:aload_0         
	// 9425 17589:getfield        #12  <Field azh a>
	// 9426 17592:getfield        #107 <Field int azh.f>
	// 9427 17595:iconst_m1       
	// 9428 17596:ixor            
	// 9429 17597:iand            
	// 9430 17598:putfield        #402 <Field int azh.cx>
		abyte0 = ((byte []) (a));
	// 9431 17601:aload_0         
	// 9432 17602:getfield        #12  <Field azh a>
	// 9433 17605:astore_1        
		abyte0.bY = ((azh) (abyte0)).aG | a.f;
	// 9434 17606:aload_1         
	// 9435 17607:aload_1         
	// 9436 17608:getfield        #146 <Field int azh.aG>
	// 9437 17611:aload_0         
	// 9438 17612:getfield        #12  <Field azh a>
	// 9439 17615:getfield        #107 <Field int azh.f>
	// 9440 17618:ior             
	// 9441 17619:putfield        #122 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 9442 17622:aload_0         
	// 9443 17623:getfield        #12  <Field azh a>
	// 9444 17626:astore_1        
		abyte0.bY = ((azh) (abyte0)).aS ^ a.bY;
	// 9445 17627:aload_1         
	// 9446 17628:aload_1         
	// 9447 17629:getfield        #408 <Field int azh.aS>
	// 9448 17632:aload_0         
	// 9449 17633:getfield        #12  <Field azh a>
	// 9450 17636:getfield        #122 <Field int azh.bY>
	// 9451 17639:ixor            
	// 9452 17640:putfield        #122 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	// 9453 17643:aload_0         
	// 9454 17644:getfield        #12  <Field azh a>
	// 9455 17647:astore_1        
		abyte0.aS = ((azh) (abyte0)).v | a.f;
	// 9456 17648:aload_1         
	// 9457 17649:aload_1         
	// 9458 17650:getfield        #110 <Field int azh.v>
	// 9459 17653:aload_0         
	// 9460 17654:getfield        #12  <Field azh a>
	// 9461 17657:getfield        #107 <Field int azh.f>
	// 9462 17660:ior             
	// 9463 17661:putfield        #408 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 9464 17664:aload_0         
	// 9465 17665:getfield        #12  <Field azh a>
	// 9466 17668:astore_1        
		abyte0.bH = ((azh) (abyte0)).aG | a.aS;
	// 9467 17669:aload_1         
	// 9468 17670:aload_1         
	// 9469 17671:getfield        #146 <Field int azh.aG>
	// 9470 17674:aload_0         
	// 9471 17675:getfield        #12  <Field azh a>
	// 9472 17678:getfield        #408 <Field int azh.aS>
	// 9473 17681:ior             
	// 9474 17682:putfield        #387 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 9475 17685:aload_0         
	// 9476 17686:getfield        #12  <Field azh a>
	// 9477 17689:astore_1        
		abyte0.aS = ((azh) (abyte0)).aS & ~a.v;
	// 9478 17690:aload_1         
	// 9479 17691:aload_1         
	// 9480 17692:getfield        #408 <Field int azh.aS>
	// 9481 17695:aload_0         
	// 9482 17696:getfield        #12  <Field azh a>
	// 9483 17699:getfield        #110 <Field int azh.v>
	// 9484 17702:iconst_m1       
	// 9485 17703:ixor            
	// 9486 17704:iand            
	// 9487 17705:putfield        #408 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 9488 17708:aload_0         
	// 9489 17709:getfield        #12  <Field azh a>
	// 9490 17712:astore_1        
		abyte0.au = ((azh) (abyte0)).aG | a.aS;
	// 9491 17713:aload_1         
	// 9492 17714:aload_1         
	// 9493 17715:getfield        #146 <Field int azh.aG>
	// 9494 17718:aload_0         
	// 9495 17719:getfield        #12  <Field azh a>
	// 9496 17722:getfield        #408 <Field int azh.aS>
	// 9497 17725:ior             
	// 9498 17726:putfield        #256 <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 9499 17729:aload_0         
	// 9500 17730:getfield        #12  <Field azh a>
	// 9501 17733:astore_1        
		abyte0.bH = ((azh) (abyte0)).aS ^ a.bH;
	// 9502 17734:aload_1         
	// 9503 17735:aload_1         
	// 9504 17736:getfield        #408 <Field int azh.aS>
	// 9505 17739:aload_0         
	// 9506 17740:getfield        #12  <Field azh a>
	// 9507 17743:getfield        #387 <Field int azh.bH>
	// 9508 17746:ixor            
	// 9509 17747:putfield        #387 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 9510 17750:aload_0         
	// 9511 17751:getfield        #12  <Field azh a>
	// 9512 17754:astore_1        
		abyte0.aS = ((azh) (abyte0)).Z & a.f;
	// 9513 17755:aload_1         
	// 9514 17756:aload_1         
	// 9515 17757:getfield        #137 <Field int azh.Z>
	// 9516 17760:aload_0         
	// 9517 17761:getfield        #12  <Field azh a>
	// 9518 17764:getfield        #107 <Field int azh.f>
	// 9519 17767:iand            
	// 9520 17768:putfield        #408 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 9521 17771:aload_0         
	// 9522 17772:getfield        #12  <Field azh a>
	// 9523 17775:astore_1        
		abyte0.bI = ((azh) (abyte0)).Z & ~a.f;
	// 9524 17776:aload_1         
	// 9525 17777:aload_1         
	// 9526 17778:getfield        #137 <Field int azh.Z>
	// 9527 17781:aload_0         
	// 9528 17782:getfield        #12  <Field azh a>
	// 9529 17785:getfield        #107 <Field int azh.f>
	// 9530 17788:iconst_m1       
	// 9531 17789:ixor            
	// 9532 17790:iand            
	// 9533 17791:putfield        #62  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 9534 17794:aload_0         
	// 9535 17795:getfield        #12  <Field azh a>
	// 9536 17798:astore_1        
		abyte0.t = ((azh) (abyte0)).ae | a.f;
	// 9537 17799:aload_1         
	// 9538 17800:aload_1         
	// 9539 17801:getfield        #238 <Field int azh.ae>
	// 9540 17804:aload_0         
	// 9541 17805:getfield        #12  <Field azh a>
	// 9542 17808:getfield        #107 <Field int azh.f>
	// 9543 17811:ior             
	// 9544 17812:putfield        #232 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 9545 17815:aload_0         
	// 9546 17816:getfield        #12  <Field azh a>
	// 9547 17819:astore_1        
		abyte0.ch = ((azh) (abyte0)).t ^ a.Z;
	// 9548 17820:aload_1         
	// 9549 17821:aload_1         
	// 9550 17822:getfield        #232 <Field int azh.t>
	// 9551 17825:aload_0         
	// 9552 17826:getfield        #12  <Field azh a>
	// 9553 17829:getfield        #137 <Field int azh.Z>
	// 9554 17832:ixor            
	// 9555 17833:putfield        #316 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 9556 17836:aload_0         
	// 9557 17837:getfield        #12  <Field azh a>
	// 9558 17840:astore_1        
		abyte0.cz = ((azh) (abyte0)).Z & ~a.t;
	// 9559 17841:aload_1         
	// 9560 17842:aload_1         
	// 9561 17843:getfield        #137 <Field int azh.Z>
	// 9562 17846:aload_0         
	// 9563 17847:getfield        #12  <Field azh a>
	// 9564 17850:getfield        #232 <Field int azh.t>
	// 9565 17853:iconst_m1       
	// 9566 17854:ixor            
	// 9567 17855:iand            
	// 9568 17856:putfield        #56  <Field int azh.cz>
		abyte0 = ((byte []) (a));
	// 9569 17859:aload_0         
	// 9570 17860:getfield        #12  <Field azh a>
	// 9571 17863:astore_1        
		abyte0.cz = ((azh) (abyte0)).ae ^ a.cz;
	// 9572 17864:aload_1         
	// 9573 17865:aload_1         
	// 9574 17866:getfield        #238 <Field int azh.ae>
	// 9575 17869:aload_0         
	// 9576 17870:getfield        #12  <Field azh a>
	// 9577 17873:getfield        #56  <Field int azh.cz>
	// 9578 17876:ixor            
	// 9579 17877:putfield        #56  <Field int azh.cz>
		abyte0 = ((byte []) (a));
	// 9580 17880:aload_0         
	// 9581 17881:getfield        #12  <Field azh a>
	// 9582 17884:astore_1        
		abyte0.cB = ((azh) (abyte0)).Z & ~a.t;
	// 9583 17885:aload_1         
	// 9584 17886:aload_1         
	// 9585 17887:getfield        #137 <Field int azh.Z>
	// 9586 17890:aload_0         
	// 9587 17891:getfield        #12  <Field azh a>
	// 9588 17894:getfield        #232 <Field int azh.t>
	// 9589 17897:iconst_m1       
	// 9590 17898:ixor            
	// 9591 17899:iand            
	// 9592 17900:putfield        #265 <Field int azh.cB>
		abyte0 = ((byte []) (a));
	// 9593 17903:aload_0         
	// 9594 17904:getfield        #12  <Field azh a>
	// 9595 17907:astore_1        
		abyte0.bL = ((azh) (abyte0)).t ^ a.bL;
	// 9596 17908:aload_1         
	// 9597 17909:aload_1         
	// 9598 17910:getfield        #232 <Field int azh.t>
	// 9599 17913:aload_0         
	// 9600 17914:getfield        #12  <Field azh a>
	// 9601 17917:getfield        #360 <Field int azh.bL>
	// 9602 17920:ixor            
	// 9603 17921:putfield        #360 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 9604 17924:aload_0         
	// 9605 17925:getfield        #12  <Field azh a>
	// 9606 17928:astore_1        
		abyte0.bL = ((azh) (abyte0)).aT & ~a.bL;
	// 9607 17929:aload_1         
	// 9608 17930:aload_1         
	// 9609 17931:getfield        #217 <Field int azh.aT>
	// 9610 17934:aload_0         
	// 9611 17935:getfield        #12  <Field azh a>
	// 9612 17938:getfield        #360 <Field int azh.bL>
	// 9613 17941:iconst_m1       
	// 9614 17942:ixor            
	// 9615 17943:iand            
	// 9616 17944:putfield        #360 <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 9617 17947:aload_0         
	// 9618 17948:getfield        #12  <Field azh a>
	// 9619 17951:astore_1        
		abyte0.t = ((azh) (abyte0)).Z & ~a.f;
	// 9620 17952:aload_1         
	// 9621 17953:aload_1         
	// 9622 17954:getfield        #137 <Field int azh.Z>
	// 9623 17957:aload_0         
	// 9624 17958:getfield        #12  <Field azh a>
	// 9625 17961:getfield        #107 <Field int azh.f>
	// 9626 17964:iconst_m1       
	// 9627 17965:ixor            
	// 9628 17966:iand            
	// 9629 17967:putfield        #232 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 9630 17970:aload_0         
	// 9631 17971:getfield        #12  <Field azh a>
	// 9632 17974:astore_1        
		abyte0.t = ((azh) (abyte0)).s ^ a.t;
	// 9633 17975:aload_1         
	// 9634 17976:aload_1         
	// 9635 17977:getfield        #381 <Field int azh.s>
	// 9636 17980:aload_0         
	// 9637 17981:getfield        #12  <Field azh a>
	// 9638 17984:getfield        #232 <Field int azh.t>
	// 9639 17987:ixor            
	// 9640 17988:putfield        #232 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 9641 17991:aload_0         
	// 9642 17992:getfield        #12  <Field azh a>
	// 9643 17995:astore_1        
		abyte0.bk = ((azh) (abyte0)).f & a.v;
	// 9644 17996:aload_1         
	// 9645 17997:aload_1         
	// 9646 17998:getfield        #107 <Field int azh.f>
	// 9647 18001:aload_0         
	// 9648 18002:getfield        #12  <Field azh a>
	// 9649 18005:getfield        #110 <Field int azh.v>
	// 9650 18008:iand            
	// 9651 18009:putfield        #208 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 9652 18012:aload_0         
	// 9653 18013:getfield        #12  <Field azh a>
	// 9654 18016:astore_1        
		abyte0.bO = ((azh) (abyte0)).v & ~a.bk;
	// 9655 18017:aload_1         
	// 9656 18018:aload_1         
	// 9657 18019:getfield        #110 <Field int azh.v>
	// 9658 18022:aload_0         
	// 9659 18023:getfield        #12  <Field azh a>
	// 9660 18026:getfield        #208 <Field int azh.bk>
	// 9661 18029:iconst_m1       
	// 9662 18030:ixor            
	// 9663 18031:iand            
	// 9664 18032:putfield        #53  <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 9665 18035:aload_0         
	// 9666 18036:getfield        #12  <Field azh a>
	// 9667 18039:astore_1        
		abyte0.cC = ((azh) (abyte0)).bO ^ a.cC;
	// 9668 18040:aload_1         
	// 9669 18041:aload_1         
	// 9670 18042:getfield        #53  <Field int azh.bO>
	// 9671 18045:aload_0         
	// 9672 18046:getfield        #12  <Field azh a>
	// 9673 18049:getfield        #59  <Field int azh.cC>
	// 9674 18052:ixor            
	// 9675 18053:putfield        #59  <Field int azh.cC>
		abyte0 = ((byte []) (a));
	// 9676 18056:aload_0         
	// 9677 18057:getfield        #12  <Field azh a>
	// 9678 18060:astore_1        
		abyte0.ba = ((azh) (abyte0)).bO ^ a.ba;
	// 9679 18061:aload_1         
	// 9680 18062:aload_1         
	// 9681 18063:getfield        #53  <Field int azh.bO>
	// 9682 18066:aload_0         
	// 9683 18067:getfield        #12  <Field azh a>
	// 9684 18070:getfield        #366 <Field int azh.ba>
	// 9685 18073:ixor            
	// 9686 18074:putfield        #366 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 9687 18077:aload_0         
	// 9688 18078:getfield        #12  <Field azh a>
	// 9689 18081:astore_1        
		abyte0.aU = ((azh) (abyte0)).aG | a.bO;
	// 9690 18082:aload_1         
	// 9691 18083:aload_1         
	// 9692 18084:getfield        #146 <Field int azh.aG>
	// 9693 18087:aload_0         
	// 9694 18088:getfield        #12  <Field azh a>
	// 9695 18091:getfield        #53  <Field int azh.bO>
	// 9696 18094:ior             
	// 9697 18095:putfield        #411 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 9698 18098:aload_0         
	// 9699 18099:getfield        #12  <Field azh a>
	// 9700 18102:astore_1        
		abyte0.aU = ((azh) (abyte0)).bO ^ a.aU;
	// 9701 18103:aload_1         
	// 9702 18104:aload_1         
	// 9703 18105:getfield        #53  <Field int azh.bO>
	// 9704 18108:aload_0         
	// 9705 18109:getfield        #12  <Field azh a>
	// 9706 18112:getfield        #411 <Field int azh.aU>
	// 9707 18115:ixor            
	// 9708 18116:putfield        #411 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 9709 18119:aload_0         
	// 9710 18120:getfield        #12  <Field azh a>
	// 9711 18123:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bk ^ a.bJ;
	// 9712 18124:aload_1         
	// 9713 18125:aload_1         
	// 9714 18126:getfield        #208 <Field int azh.bk>
	// 9715 18129:aload_0         
	// 9716 18130:getfield        #12  <Field azh a>
	// 9717 18133:getfield        #35  <Field int azh.bJ>
	// 9718 18136:ixor            
	// 9719 18137:putfield        #35  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 9720 18140:aload_0         
	// 9721 18141:getfield        #12  <Field azh a>
	// 9722 18144:astore_1        
		abyte0.bk = ((azh) (abyte0)).ae & ~a.f;
	// 9723 18145:aload_1         
	// 9724 18146:aload_1         
	// 9725 18147:getfield        #238 <Field int azh.ae>
	// 9726 18150:aload_0         
	// 9727 18151:getfield        #12  <Field azh a>
	// 9728 18154:getfield        #107 <Field int azh.f>
	// 9729 18157:iconst_m1       
	// 9730 18158:ixor            
	// 9731 18159:iand            
	// 9732 18160:putfield        #208 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 9733 18163:aload_0         
	// 9734 18164:getfield        #12  <Field azh a>
	// 9735 18167:astore_1        
		abyte0.bO = ((azh) (abyte0)).Z & ~a.bk;
	// 9736 18168:aload_1         
	// 9737 18169:aload_1         
	// 9738 18170:getfield        #137 <Field int azh.Z>
	// 9739 18173:aload_0         
	// 9740 18174:getfield        #12  <Field azh a>
	// 9741 18177:getfield        #208 <Field int azh.bk>
	// 9742 18180:iconst_m1       
	// 9743 18181:ixor            
	// 9744 18182:iand            
	// 9745 18183:putfield        #53  <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 9746 18186:aload_0         
	// 9747 18187:getfield        #12  <Field azh a>
	// 9748 18190:astore_1        
		abyte0.cg = ((azh) (abyte0)).bk ^ a.cg;
	// 9749 18191:aload_1         
	// 9750 18192:aload_1         
	// 9751 18193:getfield        #208 <Field int azh.bk>
	// 9752 18196:aload_0         
	// 9753 18197:getfield        #12  <Field azh a>
	// 9754 18200:getfield        #384 <Field int azh.cg>
	// 9755 18203:ixor            
	// 9756 18204:putfield        #384 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 9757 18207:aload_0         
	// 9758 18208:getfield        #12  <Field azh a>
	// 9759 18211:astore_1        
		abyte0.aS = ((azh) (abyte0)).bk ^ a.aS;
	// 9760 18212:aload_1         
	// 9761 18213:aload_1         
	// 9762 18214:getfield        #208 <Field int azh.bk>
	// 9763 18217:aload_0         
	// 9764 18218:getfield        #12  <Field azh a>
	// 9765 18221:getfield        #408 <Field int azh.aS>
	// 9766 18224:ixor            
	// 9767 18225:putfield        #408 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 9768 18228:aload_0         
	// 9769 18229:getfield        #12  <Field azh a>
	// 9770 18232:astore_1        
		abyte0.bM = ((azh) (abyte0)).bk ^ a.bM;
	// 9771 18233:aload_1         
	// 9772 18234:aload_1         
	// 9773 18235:getfield        #208 <Field int azh.bk>
	// 9774 18238:aload_0         
	// 9775 18239:getfield        #12  <Field azh a>
	// 9776 18242:getfield        #229 <Field int azh.bM>
	// 9777 18245:ixor            
	// 9778 18246:putfield        #229 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 9779 18249:aload_0         
	// 9780 18250:getfield        #12  <Field azh a>
	// 9781 18253:astore_1        
		abyte0.bv = ((azh) (abyte0)).bk | a.f;
	// 9782 18254:aload_1         
	// 9783 18255:aload_1         
	// 9784 18256:getfield        #208 <Field int azh.bk>
	// 9785 18259:aload_0         
	// 9786 18260:getfield        #12  <Field azh a>
	// 9787 18263:getfield        #107 <Field int azh.f>
	// 9788 18266:ior             
	// 9789 18267:putfield        #349 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 9790 18270:aload_0         
	// 9791 18271:getfield        #12  <Field azh a>
	// 9792 18274:astore_1        
		abyte0.cy = ((azh) (abyte0)).bv ^ a.cy;
	// 9793 18275:aload_1         
	// 9794 18276:aload_1         
	// 9795 18277:getfield        #349 <Field int azh.bv>
	// 9796 18280:aload_0         
	// 9797 18281:getfield        #12  <Field azh a>
	// 9798 18284:getfield        #80  <Field int azh.cy>
	// 9799 18287:ixor            
	// 9800 18288:putfield        #80  <Field int azh.cy>
		abyte0 = ((byte []) (a));
	// 9801 18291:aload_0         
	// 9802 18292:getfield        #12  <Field azh a>
	// 9803 18295:astore_1        
		abyte0.bO = ((azh) (abyte0)).bv ^ a.bO;
	// 9804 18296:aload_1         
	// 9805 18297:aload_1         
	// 9806 18298:getfield        #349 <Field int azh.bv>
	// 9807 18301:aload_0         
	// 9808 18302:getfield        #12  <Field azh a>
	// 9809 18305:getfield        #53  <Field int azh.bO>
	// 9810 18308:ixor            
	// 9811 18309:putfield        #53  <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 9812 18312:aload_0         
	// 9813 18313:getfield        #12  <Field azh a>
	// 9814 18316:astore_1        
		abyte0.bO = ((azh) (abyte0)).aT & a.bO;
	// 9815 18317:aload_1         
	// 9816 18318:aload_1         
	// 9817 18319:getfield        #217 <Field int azh.aT>
	// 9818 18322:aload_0         
	// 9819 18323:getfield        #12  <Field azh a>
	// 9820 18326:getfield        #53  <Field int azh.bO>
	// 9821 18329:iand            
	// 9822 18330:putfield        #53  <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 9823 18333:aload_0         
	// 9824 18334:getfield        #12  <Field azh a>
	// 9825 18337:astore_1        
		abyte0.bv = ((azh) (abyte0)).Z & ~a.bk;
	// 9826 18338:aload_1         
	// 9827 18339:aload_1         
	// 9828 18340:getfield        #137 <Field int azh.Z>
	// 9829 18343:aload_0         
	// 9830 18344:getfield        #12  <Field azh a>
	// 9831 18347:getfield        #208 <Field int azh.bk>
	// 9832 18350:iconst_m1       
	// 9833 18351:ixor            
	// 9834 18352:iand            
	// 9835 18353:putfield        #349 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 9836 18356:aload_0         
	// 9837 18357:getfield        #12  <Field azh a>
	// 9838 18360:astore_1        
		abyte0.bv = ((azh) (abyte0)).bk ^ a.bv;
	// 9839 18361:aload_1         
	// 9840 18362:aload_1         
	// 9841 18363:getfield        #208 <Field int azh.bk>
	// 9842 18366:aload_0         
	// 9843 18367:getfield        #12  <Field azh a>
	// 9844 18370:getfield        #349 <Field int azh.bv>
	// 9845 18373:ixor            
	// 9846 18374:putfield        #349 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 9847 18377:aload_0         
	// 9848 18378:getfield        #12  <Field azh a>
	// 9849 18381:astore_1        
		abyte0.as = ((azh) (abyte0)).Z & a.bk;
	// 9850 18382:aload_1         
	// 9851 18383:aload_1         
	// 9852 18384:getfield        #137 <Field int azh.Z>
	// 9853 18387:aload_0         
	// 9854 18388:getfield        #12  <Field azh a>
	// 9855 18391:getfield        #208 <Field int azh.bk>
	// 9856 18394:iand            
	// 9857 18395:putfield        #465 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 9858 18398:aload_0         
	// 9859 18399:getfield        #12  <Field azh a>
	// 9860 18402:astore_1        
		abyte0.as = ((azh) (abyte0)).s ^ a.as;
	// 9861 18403:aload_1         
	// 9862 18404:aload_1         
	// 9863 18405:getfield        #381 <Field int azh.s>
	// 9864 18408:aload_0         
	// 9865 18409:getfield        #12  <Field azh a>
	// 9866 18412:getfield        #465 <Field int azh.as>
	// 9867 18415:ixor            
	// 9868 18416:putfield        #465 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 9869 18419:aload_0         
	// 9870 18420:getfield        #12  <Field azh a>
	// 9871 18423:astore_1        
		abyte0.bI = ((azh) (abyte0)).bk ^ a.bI;
	// 9872 18424:aload_1         
	// 9873 18425:aload_1         
	// 9874 18426:getfield        #208 <Field int azh.bk>
	// 9875 18429:aload_0         
	// 9876 18430:getfield        #12  <Field azh a>
	// 9877 18433:getfield        #62  <Field int azh.bI>
	// 9878 18436:ixor            
	// 9879 18437:putfield        #62  <Field int azh.bI>
		abyte0 = ((byte []) (a));
	// 9880 18440:aload_0         
	// 9881 18441:getfield        #12  <Field azh a>
	// 9882 18444:astore_1        
		abyte0.cb = ((azh) (abyte0)).bk ^ a.Z;
	// 9883 18445:aload_1         
	// 9884 18446:aload_1         
	// 9885 18447:getfield        #208 <Field int azh.bk>
	// 9886 18450:aload_0         
	// 9887 18451:getfield        #12  <Field azh a>
	// 9888 18454:getfield        #137 <Field int azh.Z>
	// 9889 18457:ixor            
	// 9890 18458:putfield        #468 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 9891 18461:aload_0         
	// 9892 18462:getfield        #12  <Field azh a>
	// 9893 18465:astore_1        
		abyte0.aK = ((azh) (abyte0)).Z & a.f;
	// 9894 18466:aload_1         
	// 9895 18467:aload_1         
	// 9896 18468:getfield        #137 <Field int azh.Z>
	// 9897 18471:aload_0         
	// 9898 18472:getfield        #12  <Field azh a>
	// 9899 18475:getfield        #107 <Field int azh.f>
	// 9900 18478:iand            
	// 9901 18479:putfield        #471 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 9902 18482:aload_0         
	// 9903 18483:getfield        #12  <Field azh a>
	// 9904 18486:astore_1        
		abyte0.aK = ((azh) (abyte0)).ae ^ a.aK;
	// 9905 18487:aload_1         
	// 9906 18488:aload_1         
	// 9907 18489:getfield        #238 <Field int azh.ae>
	// 9908 18492:aload_0         
	// 9909 18493:getfield        #12  <Field azh a>
	// 9910 18496:getfield        #471 <Field int azh.aK>
	// 9911 18499:ixor            
	// 9912 18500:putfield        #471 <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 9913 18503:aload_0         
	// 9914 18504:getfield        #12  <Field azh a>
	// 9915 18507:astore_1        
		abyte0.aJ = ((azh) (abyte0)).ae ^ a.f;
	// 9916 18508:aload_1         
	// 9917 18509:aload_1         
	// 9918 18510:getfield        #238 <Field int azh.ae>
	// 9919 18513:aload_0         
	// 9920 18514:getfield        #12  <Field azh a>
	// 9921 18517:getfield        #107 <Field int azh.f>
	// 9922 18520:ixor            
	// 9923 18521:putfield        #474 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 9924 18524:aload_0         
	// 9925 18525:getfield        #12  <Field azh a>
	// 9926 18528:astore_1        
		abyte0.R = ((azh) (abyte0)).Z & a.aJ;
	// 9927 18529:aload_1         
	// 9928 18530:aload_1         
	// 9929 18531:getfield        #137 <Field int azh.Z>
	// 9930 18534:aload_0         
	// 9931 18535:getfield        #12  <Field azh a>
	// 9932 18538:getfield        #474 <Field int azh.aJ>
	// 9933 18541:iand            
	// 9934 18542:putfield        #477 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 9935 18545:aload_0         
	// 9936 18546:getfield        #12  <Field azh a>
	// 9937 18549:astore_1        
		abyte0.R = ((azh) (abyte0)).ae ^ a.R;
	// 9938 18550:aload_1         
	// 9939 18551:aload_1         
	// 9940 18552:getfield        #238 <Field int azh.ae>
	// 9941 18555:aload_0         
	// 9942 18556:getfield        #12  <Field azh a>
	// 9943 18559:getfield        #477 <Field int azh.R>
	// 9944 18562:ixor            
	// 9945 18563:putfield        #477 <Field int azh.R>
		abyte0 = ((byte []) (a));
	// 9946 18566:aload_0         
	// 9947 18567:getfield        #12  <Field azh a>
	// 9948 18570:astore_1        
		abyte0.aO = ((azh) (abyte0)).aJ ^ a.Z;
	// 9949 18571:aload_1         
	// 9950 18572:aload_1         
	// 9951 18573:getfield        #474 <Field int azh.aJ>
	// 9952 18576:aload_0         
	// 9953 18577:getfield        #12  <Field azh a>
	// 9954 18580:getfield        #137 <Field int azh.Z>
	// 9955 18583:ixor            
	// 9956 18584:putfield        #480 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 9957 18587:aload_0         
	// 9958 18588:getfield        #12  <Field azh a>
	// 9959 18591:astore_1        
		abyte0.cx = ((azh) (abyte0)).aJ ^ a.cx;
	// 9960 18592:aload_1         
	// 9961 18593:aload_1         
	// 9962 18594:getfield        #474 <Field int azh.aJ>
	// 9963 18597:aload_0         
	// 9964 18598:getfield        #12  <Field azh a>
	// 9965 18601:getfield        #402 <Field int azh.cx>
	// 9966 18604:ixor            
	// 9967 18605:putfield        #402 <Field int azh.cx>
		abyte0 = ((byte []) (a));
	// 9968 18608:aload_0         
	// 9969 18609:getfield        #12  <Field azh a>
	// 9970 18612:astore_1        
		abyte0.aJ = ((azh) (abyte0)).v & ~a.f;
	// 9971 18613:aload_1         
	// 9972 18614:aload_1         
	// 9973 18615:getfield        #110 <Field int azh.v>
	// 9974 18618:aload_0         
	// 9975 18619:getfield        #12  <Field azh a>
	// 9976 18622:getfield        #107 <Field int azh.f>
	// 9977 18625:iconst_m1       
	// 9978 18626:ixor            
	// 9979 18627:iand            
	// 9980 18628:putfield        #474 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 9981 18631:aload_0         
	// 9982 18632:getfield        #12  <Field azh a>
	// 9983 18635:astore_1        
		abyte0.bR = ((azh) (abyte0)).aJ ^ a.bR;
	// 9984 18636:aload_1         
	// 9985 18637:aload_1         
	// 9986 18638:getfield        #474 <Field int azh.aJ>
	// 9987 18641:aload_0         
	// 9988 18642:getfield        #12  <Field azh a>
	// 9989 18645:getfield        #444 <Field int azh.bR>
	// 9990 18648:ixor            
	// 9991 18649:putfield        #444 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 9992 18652:aload_0         
	// 9993 18653:getfield        #12  <Field azh a>
	// 9994 18656:astore_1        
		abyte0.ar = ((azh) (abyte0)).f ^ a.aG;
	// 9995 18657:aload_1         
	// 9996 18658:aload_1         
	// 9997 18659:getfield        #107 <Field int azh.f>
	// 9998 18662:aload_0         
	// 9999 18663:getfield        #12  <Field azh a>
	// 10000 18666:getfield        #146 <Field int azh.aG>
	// 10001 18669:ixor            
	// 10002 18670:putfield        #483 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 10003 18673:aload_0         
	// 10004 18674:getfield        #12  <Field azh a>
	// 10005 18677:astore_1        
		abyte0.aV = ((azh) (abyte0)).aV & ~a.bC;
	// 10006 18678:aload_1         
	// 10007 18679:aload_1         
	// 10008 18680:getfield        #313 <Field int azh.aV>
	// 10009 18683:aload_0         
	// 10010 18684:getfield        #12  <Field azh a>
	// 10011 18687:getfield        #352 <Field int azh.bC>
	// 10012 18690:iconst_m1       
	// 10013 18691:ixor            
	// 10014 18692:iand            
	// 10015 18693:putfield        #313 <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 10016 18696:aload_0         
	// 10017 18697:getfield        #12  <Field azh a>
	// 10018 18700:astore_1        
		abyte0.K = ((azh) (abyte0)).K | a.aV;
	// 10019 18701:aload_1         
	// 10020 18702:aload_1         
	// 10021 18703:getfield        #331 <Field int azh.K>
	// 10022 18706:aload_0         
	// 10023 18707:getfield        #12  <Field azh a>
	// 10024 18710:getfield        #313 <Field int azh.aV>
	// 10025 18713:ior             
	// 10026 18714:putfield        #331 <Field int azh.K>
		abyte0 = ((byte []) (a));
	// 10027 18717:aload_0         
	// 10028 18718:getfield        #12  <Field azh a>
	// 10029 18721:astore_1        
		abyte0.K = ((azh) (abyte0)).bD ^ a.K;
	// 10030 18722:aload_1         
	// 10031 18723:aload_1         
	// 10032 18724:getfield        #417 <Field int azh.bD>
	// 10033 18727:aload_0         
	// 10034 18728:getfield        #12  <Field azh a>
	// 10035 18731:getfield        #331 <Field int azh.K>
	// 10036 18734:ixor            
	// 10037 18735:putfield        #331 <Field int azh.K>
		abyte0 = ((byte []) (a));
	// 10038 18738:aload_0         
	// 10039 18739:getfield        #12  <Field azh a>
	// 10040 18742:astore_1        
		abyte0.K = ((azh) (abyte0)).K & ~a.cF;
	// 10041 18743:aload_1         
	// 10042 18744:aload_1         
	// 10043 18745:getfield        #331 <Field int azh.K>
	// 10044 18748:aload_0         
	// 10045 18749:getfield        #12  <Field azh a>
	// 10046 18752:getfield        #369 <Field int azh.cF>
	// 10047 18755:iconst_m1       
	// 10048 18756:ixor            
	// 10049 18757:iand            
	// 10050 18758:putfield        #331 <Field int azh.K>
		abyte0 = ((byte []) (a));
	// 10051 18761:aload_0         
	// 10052 18762:getfield        #12  <Field azh a>
	// 10053 18765:astore_1        
		abyte0.bD = ((azh) (abyte0)).be & ~a.bC;
	// 10054 18766:aload_1         
	// 10055 18767:aload_1         
	// 10056 18768:getfield        #149 <Field int azh.be>
	// 10057 18771:aload_0         
	// 10058 18772:getfield        #12  <Field azh a>
	// 10059 18775:getfield        #352 <Field int azh.bC>
	// 10060 18778:iconst_m1       
	// 10061 18779:ixor            
	// 10062 18780:iand            
	// 10063 18781:putfield        #417 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 10064 18784:aload_0         
	// 10065 18785:getfield        #12  <Field azh a>
	// 10066 18788:astore_1        
		abyte0.bD = ((azh) (abyte0)).bC ^ a.bD;
	// 10067 18789:aload_1         
	// 10068 18790:aload_1         
	// 10069 18791:getfield        #352 <Field int azh.bC>
	// 10070 18794:aload_0         
	// 10071 18795:getfield        #12  <Field azh a>
	// 10072 18798:getfield        #417 <Field int azh.bD>
	// 10073 18801:ixor            
	// 10074 18802:putfield        #417 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 10075 18805:aload_0         
	// 10076 18806:getfield        #12  <Field azh a>
	// 10077 18809:astore_1        
		abyte0.bX = ((azh) (abyte0)).bD ^ a.bX;
	// 10078 18810:aload_1         
	// 10079 18811:aload_1         
	// 10080 18812:getfield        #417 <Field int azh.bD>
	// 10081 18815:aload_0         
	// 10082 18816:getfield        #12  <Field azh a>
	// 10083 18819:getfield        #414 <Field int azh.bX>
	// 10084 18822:ixor            
	// 10085 18823:putfield        #414 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 10086 18826:aload_0         
	// 10087 18827:getfield        #12  <Field azh a>
	// 10088 18830:astore_1        
		abyte0.K = ((azh) (abyte0)).bX ^ a.K;
	// 10089 18831:aload_1         
	// 10090 18832:aload_1         
	// 10091 18833:getfield        #414 <Field int azh.bX>
	// 10092 18836:aload_0         
	// 10093 18837:getfield        #12  <Field azh a>
	// 10094 18840:getfield        #331 <Field int azh.K>
	// 10095 18843:ixor            
	// 10096 18844:putfield        #331 <Field int azh.K>
		abyte0 = ((byte []) (a));
	// 10097 18847:aload_0         
	// 10098 18848:getfield        #12  <Field azh a>
	// 10099 18851:astore_1        
		abyte0.K = ((azh) (abyte0)).K & ~a.bK;
	// 10100 18852:aload_1         
	// 10101 18853:aload_1         
	// 10102 18854:getfield        #331 <Field int azh.K>
	// 10103 18857:aload_0         
	// 10104 18858:getfield        #12  <Field azh a>
	// 10105 18861:getfield        #334 <Field int azh.bK>
	// 10106 18864:iconst_m1       
	// 10107 18865:ixor            
	// 10108 18866:iand            
	// 10109 18867:putfield        #331 <Field int azh.K>
		abyte0 = ((byte []) (a));
	// 10110 18870:aload_0         
	// 10111 18871:getfield        #12  <Field azh a>
	// 10112 18874:astore_1        
		abyte0.K = ((azh) (abyte0)).cc ^ a.K;
	// 10113 18875:aload_1         
	// 10114 18876:aload_1         
	// 10115 18877:getfield        #262 <Field int azh.cc>
	// 10116 18880:aload_0         
	// 10117 18881:getfield        #12  <Field azh a>
	// 10118 18884:getfield        #331 <Field int azh.K>
	// 10119 18887:ixor            
	// 10120 18888:putfield        #331 <Field int azh.K>
		abyte0 = ((byte []) (a));
	// 10121 18891:aload_0         
	// 10122 18892:getfield        #12  <Field azh a>
	// 10123 18895:astore_1        
		abyte0.bl = ((azh) (abyte0)).K ^ a.bl;
	// 10124 18896:aload_1         
	// 10125 18897:aload_1         
	// 10126 18898:getfield        #331 <Field int azh.K>
	// 10127 18901:aload_0         
	// 10128 18902:getfield        #12  <Field azh a>
	// 10129 18905:getfield        #486 <Field int azh.bl>
	// 10130 18908:ixor            
	// 10131 18909:putfield        #486 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 10132 18912:aload_0         
	// 10133 18913:getfield        #12  <Field azh a>
	// 10134 18916:astore_1        
		abyte0.K = ((azh) (abyte0)).aL & ~a.bl;
	// 10135 18917:aload_1         
	// 10136 18918:aload_1         
	// 10137 18919:getfield        #286 <Field int azh.aL>
	// 10138 18922:aload_0         
	// 10139 18923:getfield        #12  <Field azh a>
	// 10140 18926:getfield        #486 <Field int azh.bl>
	// 10141 18929:iconst_m1       
	// 10142 18930:ixor            
	// 10143 18931:iand            
	// 10144 18932:putfield        #331 <Field int azh.K>
		abyte0 = ((byte []) (a));
	// 10145 18935:aload_0         
	// 10146 18936:getfield        #12  <Field azh a>
	// 10147 18939:astore_1        
		abyte0.cc = ((azh) (abyte0)).aL ^ a.bl;
	// 10148 18940:aload_1         
	// 10149 18941:aload_1         
	// 10150 18942:getfield        #286 <Field int azh.aL>
	// 10151 18945:aload_0         
	// 10152 18946:getfield        #12  <Field azh a>
	// 10153 18949:getfield        #486 <Field int azh.bl>
	// 10154 18952:ixor            
	// 10155 18953:putfield        #262 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 10156 18956:aload_0         
	// 10157 18957:getfield        #12  <Field azh a>
	// 10158 18960:astore_1        
		abyte0.bX = ((azh) (abyte0)).bl | a.aL;
	// 10159 18961:aload_1         
	// 10160 18962:aload_1         
	// 10161 18963:getfield        #486 <Field int azh.bl>
	// 10162 18966:aload_0         
	// 10163 18967:getfield        #12  <Field azh a>
	// 10164 18970:getfield        #286 <Field int azh.aL>
	// 10165 18973:ior             
	// 10166 18974:putfield        #414 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 10167 18977:aload_0         
	// 10168 18978:getfield        #12  <Field azh a>
	// 10169 18981:astore_1        
		abyte0.bD = ((azh) (abyte0)).aL & ~a.bl;
	// 10170 18982:aload_1         
	// 10171 18983:aload_1         
	// 10172 18984:getfield        #286 <Field int azh.aL>
	// 10173 18987:aload_0         
	// 10174 18988:getfield        #12  <Field azh a>
	// 10175 18991:getfield        #486 <Field int azh.bl>
	// 10176 18994:iconst_m1       
	// 10177 18995:ixor            
	// 10178 18996:iand            
	// 10179 18997:putfield        #417 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 10180 19000:aload_0         
	// 10181 19001:getfield        #12  <Field azh a>
	// 10182 19004:astore_1        
		abyte0.bo = ((azh) (abyte0)).bl | a.aL;
	// 10183 19005:aload_1         
	// 10184 19006:aload_1         
	// 10185 19007:getfield        #486 <Field int azh.bl>
	// 10186 19010:aload_0         
	// 10187 19011:getfield        #12  <Field azh a>
	// 10188 19014:getfield        #286 <Field int azh.aL>
	// 10189 19017:ior             
	// 10190 19018:putfield        #489 <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 10191 19021:aload_0         
	// 10192 19022:getfield        #12  <Field azh a>
	// 10193 19025:astore_1        
		abyte0.bf = ((azh) (abyte0)).aL & ~a.bl;
	// 10194 19026:aload_1         
	// 10195 19027:aload_1         
	// 10196 19028:getfield        #286 <Field int azh.aL>
	// 10197 19031:aload_0         
	// 10198 19032:getfield        #12  <Field azh a>
	// 10199 19035:getfield        #486 <Field int azh.bl>
	// 10200 19038:iconst_m1       
	// 10201 19039:ixor            
	// 10202 19040:iand            
	// 10203 19041:putfield        #492 <Field int azh.bf>
		abyte0 = ((byte []) (a));
	// 10204 19044:aload_0         
	// 10205 19045:getfield        #12  <Field azh a>
	// 10206 19048:astore_1        
		abyte0.J = ((azh) (abyte0)).aL & ~a.bl;
	// 10207 19049:aload_1         
	// 10208 19050:aload_1         
	// 10209 19051:getfield        #286 <Field int azh.aL>
	// 10210 19054:aload_0         
	// 10211 19055:getfield        #12  <Field azh a>
	// 10212 19058:getfield        #486 <Field int azh.bl>
	// 10213 19061:iconst_m1       
	// 10214 19062:ixor            
	// 10215 19063:iand            
	// 10216 19064:putfield        #495 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 10217 19067:aload_0         
	// 10218 19068:getfield        #12  <Field azh a>
	// 10219 19071:astore_1        
		abyte0.J = ((azh) (abyte0)).aL ^ a.J;
	// 10220 19072:aload_1         
	// 10221 19073:aload_1         
	// 10222 19074:getfield        #286 <Field int azh.aL>
	// 10223 19077:aload_0         
	// 10224 19078:getfield        #12  <Field azh a>
	// 10225 19081:getfield        #495 <Field int azh.J>
	// 10226 19084:ixor            
	// 10227 19085:putfield        #495 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 10228 19088:aload_0         
	// 10229 19089:getfield        #12  <Field azh a>
	// 10230 19092:astore_1        
		abyte0.J = ((azh) (abyte0)).J & a.bi;
	// 10231 19093:aload_1         
	// 10232 19094:aload_1         
	// 10233 19095:getfield        #495 <Field int azh.J>
	// 10234 19098:aload_0         
	// 10235 19099:getfield        #12  <Field azh a>
	// 10236 19102:getfield        #393 <Field int azh.bi>
	// 10237 19105:iand            
	// 10238 19106:putfield        #495 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 10239 19109:aload_0         
	// 10240 19110:getfield        #12  <Field azh a>
	// 10241 19113:astore_1        
		abyte0.J = ((azh) (abyte0)).bE & ~a.J;
	// 10242 19114:aload_1         
	// 10243 19115:aload_1         
	// 10244 19116:getfield        #292 <Field int azh.bE>
	// 10245 19119:aload_0         
	// 10246 19120:getfield        #12  <Field azh a>
	// 10247 19123:getfield        #495 <Field int azh.J>
	// 10248 19126:iconst_m1       
	// 10249 19127:ixor            
	// 10250 19128:iand            
	// 10251 19129:putfield        #495 <Field int azh.J>
		abyte0 = ((byte []) (a));
	// 10252 19132:aload_0         
	// 10253 19133:getfield        #12  <Field azh a>
	// 10254 19136:astore_1        
		abyte0.aA = ((azh) (abyte0)).bC & ~a.aA;
	// 10255 19137:aload_1         
	// 10256 19138:aload_1         
	// 10257 19139:getfield        #352 <Field int azh.bC>
	// 10258 19142:aload_0         
	// 10259 19143:getfield        #12  <Field azh a>
	// 10260 19146:getfield        #498 <Field int azh.aA>
	// 10261 19149:iconst_m1       
	// 10262 19150:ixor            
	// 10263 19151:iand            
	// 10264 19152:putfield        #498 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 10265 19155:aload_0         
	// 10266 19156:getfield        #12  <Field azh a>
	// 10267 19159:astore_1        
		abyte0.aA = ((azh) (abyte0)).B ^ a.aA;
	// 10268 19160:aload_1         
	// 10269 19161:aload_1         
	// 10270 19162:getfield        #447 <Field int azh.B>
	// 10271 19165:aload_0         
	// 10272 19166:getfield        #12  <Field azh a>
	// 10273 19169:getfield        #498 <Field int azh.aA>
	// 10274 19172:ixor            
	// 10275 19173:putfield        #498 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 10276 19176:aload_0         
	// 10277 19177:getfield        #12  <Field azh a>
	// 10278 19180:astore_1        
		abyte0.av = ((azh) (abyte0)).aA ^ a.av;
	// 10279 19181:aload_1         
	// 10280 19182:aload_1         
	// 10281 19183:getfield        #498 <Field int azh.aA>
	// 10282 19186:aload_0         
	// 10283 19187:getfield        #12  <Field azh a>
	// 10284 19190:getfield        #450 <Field int azh.av>
	// 10285 19193:ixor            
	// 10286 19194:putfield        #450 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 10287 19197:aload_0         
	// 10288 19198:getfield        #12  <Field azh a>
	// 10289 19201:astore_1        
		abyte0.av = ((azh) (abyte0)).av | a.M;
	// 10290 19202:aload_1         
	// 10291 19203:aload_1         
	// 10292 19204:getfield        #450 <Field int azh.av>
	// 10293 19207:aload_0         
	// 10294 19208:getfield        #12  <Field azh a>
	// 10295 19211:getfield        #167 <Field int azh.M>
	// 10296 19214:ior             
	// 10297 19215:putfield        #450 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 10298 19218:aload_0         
	// 10299 19219:getfield        #12  <Field azh a>
	// 10300 19222:astore_1        
		abyte0.av = ((azh) (abyte0)).ca ^ a.av;
	// 10301 19223:aload_1         
	// 10302 19224:aload_1         
	// 10303 19225:getfield        #372 <Field int azh.ca>
	// 10304 19228:aload_0         
	// 10305 19229:getfield        #12  <Field azh a>
	// 10306 19232:getfield        #450 <Field int azh.av>
	// 10307 19235:ixor            
	// 10308 19236:putfield        #450 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 10309 19239:aload_0         
	// 10310 19240:getfield        #12  <Field azh a>
	// 10311 19243:astore_1        
		abyte0.D = ((azh) (abyte0)).av ^ a.D;
	// 10312 19244:aload_1         
	// 10313 19245:aload_1         
	// 10314 19246:getfield        #450 <Field int azh.av>
	// 10315 19249:aload_0         
	// 10316 19250:getfield        #12  <Field azh a>
	// 10317 19253:getfield        #119 <Field int azh.D>
	// 10318 19256:ixor            
	// 10319 19257:putfield        #119 <Field int azh.D>
		abyte0 = ((byte []) (a));
	// 10320 19260:aload_0         
	// 10321 19261:getfield        #12  <Field azh a>
	// 10322 19264:astore_1        
		abyte0.av = ((azh) (abyte0)).at & ~a.D;
	// 10323 19265:aload_1         
	// 10324 19266:aload_1         
	// 10325 19267:getfield        #86  <Field int azh.at>
	// 10326 19270:aload_0         
	// 10327 19271:getfield        #12  <Field azh a>
	// 10328 19274:getfield        #119 <Field int azh.D>
	// 10329 19277:iconst_m1       
	// 10330 19278:ixor            
	// 10331 19279:iand            
	// 10332 19280:putfield        #450 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 10333 19283:aload_0         
	// 10334 19284:getfield        #12  <Field azh a>
	// 10335 19287:astore_1        
		abyte0.av = ((azh) (abyte0)).L ^ a.av;
	// 10336 19288:aload_1         
	// 10337 19289:aload_1         
	// 10338 19290:getfield        #113 <Field int azh.L>
	// 10339 19293:aload_0         
	// 10340 19294:getfield        #12  <Field azh a>
	// 10341 19297:getfield        #450 <Field int azh.av>
	// 10342 19300:ixor            
	// 10343 19301:putfield        #450 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 10344 19304:aload_0         
	// 10345 19305:getfield        #12  <Field azh a>
	// 10346 19308:astore_1        
		abyte0.av = ((azh) (abyte0)).T | a.av;
	// 10347 19309:aload_1         
	// 10348 19310:aload_1         
	// 10349 19311:getfield        #325 <Field int azh.T>
	// 10350 19314:aload_0         
	// 10351 19315:getfield        #12  <Field azh a>
	// 10352 19318:getfield        #450 <Field int azh.av>
	// 10353 19321:ior             
	// 10354 19322:putfield        #450 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 10355 19325:aload_0         
	// 10356 19326:getfield        #12  <Field azh a>
	// 10357 19329:astore_1        
		abyte0.ca = ((azh) (abyte0)).cq & ~a.D;
	// 10358 19330:aload_1         
	// 10359 19331:aload_1         
	// 10360 19332:getfield        #179 <Field int azh.cq>
	// 10361 19335:aload_0         
	// 10362 19336:getfield        #12  <Field azh a>
	// 10363 19339:getfield        #119 <Field int azh.D>
	// 10364 19342:iconst_m1       
	// 10365 19343:ixor            
	// 10366 19344:iand            
	// 10367 19345:putfield        #372 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 10368 19348:aload_0         
	// 10369 19349:getfield        #12  <Field azh a>
	// 10370 19352:astore_1        
		abyte0.ca = ((azh) (abyte0)).cq ^ a.ca;
	// 10371 19353:aload_1         
	// 10372 19354:aload_1         
	// 10373 19355:getfield        #179 <Field int azh.cq>
	// 10374 19358:aload_0         
	// 10375 19359:getfield        #12  <Field azh a>
	// 10376 19362:getfield        #372 <Field int azh.ca>
	// 10377 19365:ixor            
	// 10378 19366:putfield        #372 <Field int azh.ca>
		abyte0 = ((byte []) (a));
	// 10379 19369:aload_0         
	// 10380 19370:getfield        #12  <Field azh a>
	// 10381 19373:astore_1        
		abyte0.aA = ((azh) (abyte0)).ca & ~a.T;
	// 10382 19374:aload_1         
	// 10383 19375:aload_1         
	// 10384 19376:getfield        #372 <Field int azh.ca>
	// 10385 19379:aload_0         
	// 10386 19380:getfield        #12  <Field azh a>
	// 10387 19383:getfield        #325 <Field int azh.T>
	// 10388 19386:iconst_m1       
	// 10389 19387:ixor            
	// 10390 19388:iand            
	// 10391 19389:putfield        #498 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 10392 19392:aload_0         
	// 10393 19393:getfield        #12  <Field azh a>
	// 10394 19396:astore_1        
		abyte0.cA = ((azh) (abyte0)).cA & a.D;
	// 10395 19397:aload_1         
	// 10396 19398:aload_1         
	// 10397 19399:getfield        #304 <Field int azh.cA>
	// 10398 19402:aload_0         
	// 10399 19403:getfield        #12  <Field azh a>
	// 10400 19406:getfield        #119 <Field int azh.D>
	// 10401 19409:iand            
	// 10402 19410:putfield        #304 <Field int azh.cA>
		abyte0 = ((byte []) (a));
	// 10403 19413:aload_0         
	// 10404 19414:getfield        #12  <Field azh a>
	// 10405 19417:astore_1        
		abyte0.cA = ((azh) (abyte0)).aU ^ a.cA;
	// 10406 19418:aload_1         
	// 10407 19419:aload_1         
	// 10408 19420:getfield        #411 <Field int azh.aU>
	// 10409 19423:aload_0         
	// 10410 19424:getfield        #12  <Field azh a>
	// 10411 19427:getfield        #304 <Field int azh.cA>
	// 10412 19430:ixor            
	// 10413 19431:putfield        #304 <Field int azh.cA>
		abyte0 = ((byte []) (a));
	// 10414 19434:aload_0         
	// 10415 19435:getfield        #12  <Field azh a>
	// 10416 19438:astore_1        
		abyte0.cA = ((azh) (abyte0)).L & a.cA;
	// 10417 19439:aload_1         
	// 10418 19440:aload_1         
	// 10419 19441:getfield        #113 <Field int azh.L>
	// 10420 19444:aload_0         
	// 10421 19445:getfield        #12  <Field azh a>
	// 10422 19448:getfield        #304 <Field int azh.cA>
	// 10423 19451:iand            
	// 10424 19452:putfield        #304 <Field int azh.cA>
		abyte0 = ((byte []) (a));
	// 10425 19455:aload_0         
	// 10426 19456:getfield        #12  <Field azh a>
	// 10427 19459:astore_1        
		abyte0.B = ((azh) (abyte0)).D | a.at;
	// 10428 19460:aload_1         
	// 10429 19461:aload_1         
	// 10430 19462:getfield        #119 <Field int azh.D>
	// 10431 19465:aload_0         
	// 10432 19466:getfield        #12  <Field azh a>
	// 10433 19469:getfield        #86  <Field int azh.at>
	// 10434 19472:ior             
	// 10435 19473:putfield        #447 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 10436 19476:aload_0         
	// 10437 19477:getfield        #12  <Field azh a>
	// 10438 19480:astore_1        
		abyte0.B = ((azh) (abyte0)).h ^ a.B;
	// 10439 19481:aload_1         
	// 10440 19482:aload_1         
	// 10441 19483:getfield        #196 <Field int azh.h>
	// 10442 19486:aload_0         
	// 10443 19487:getfield        #12  <Field azh a>
	// 10444 19490:getfield        #447 <Field int azh.B>
	// 10445 19493:ixor            
	// 10446 19494:putfield        #447 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 10447 19497:aload_0         
	// 10448 19498:getfield        #12  <Field azh a>
	// 10449 19501:astore_1        
		abyte0.B = ((azh) (abyte0)).T & ~a.B;
	// 10450 19502:aload_1         
	// 10451 19503:aload_1         
	// 10452 19504:getfield        #325 <Field int azh.T>
	// 10453 19507:aload_0         
	// 10454 19508:getfield        #12  <Field azh a>
	// 10455 19511:getfield        #447 <Field int azh.B>
	// 10456 19514:iconst_m1       
	// 10457 19515:ixor            
	// 10458 19516:iand            
	// 10459 19517:putfield        #447 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 10460 19520:aload_0         
	// 10461 19521:getfield        #12  <Field azh a>
	// 10462 19524:astore_1        
		abyte0.bA = ((azh) (abyte0)).D & ~a.bA;
	// 10463 19525:aload_1         
	// 10464 19526:aload_1         
	// 10465 19527:getfield        #119 <Field int azh.D>
	// 10466 19530:aload_0         
	// 10467 19531:getfield        #12  <Field azh a>
	// 10468 19534:getfield        #453 <Field int azh.bA>
	// 10469 19537:iconst_m1       
	// 10470 19538:ixor            
	// 10471 19539:iand            
	// 10472 19540:putfield        #453 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 10473 19543:aload_0         
	// 10474 19544:getfield        #12  <Field azh a>
	// 10475 19547:astore_1        
		abyte0.bA = ((azh) (abyte0)).bH ^ a.bA;
	// 10476 19548:aload_1         
	// 10477 19549:aload_1         
	// 10478 19550:getfield        #387 <Field int azh.bH>
	// 10479 19553:aload_0         
	// 10480 19554:getfield        #12  <Field azh a>
	// 10481 19557:getfield        #453 <Field int azh.bA>
	// 10482 19560:ixor            
	// 10483 19561:putfield        #453 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 10484 19564:aload_0         
	// 10485 19565:getfield        #12  <Field azh a>
	// 10486 19568:astore_1        
		abyte0.bH = ((azh) (abyte0)).aX & ~a.D;
	// 10487 19569:aload_1         
	// 10488 19570:aload_1         
	// 10489 19571:getfield        #101 <Field int azh.aX>
	// 10490 19574:aload_0         
	// 10491 19575:getfield        #12  <Field azh a>
	// 10492 19578:getfield        #119 <Field int azh.D>
	// 10493 19581:iconst_m1       
	// 10494 19582:ixor            
	// 10495 19583:iand            
	// 10496 19584:putfield        #387 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 10497 19587:aload_0         
	// 10498 19588:getfield        #12  <Field azh a>
	// 10499 19591:astore_1        
		abyte0.bV = ((azh) (abyte0)).D | a.L;
	// 10500 19592:aload_1         
	// 10501 19593:aload_1         
	// 10502 19594:getfield        #119 <Field int azh.D>
	// 10503 19597:aload_0         
	// 10504 19598:getfield        #12  <Field azh a>
	// 10505 19601:getfield        #113 <Field int azh.L>
	// 10506 19604:ior             
	// 10507 19605:putfield        #501 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 10508 19608:aload_0         
	// 10509 19609:getfield        #12  <Field azh a>
	// 10510 19612:astore_1        
		abyte0.bV = ((azh) (abyte0)).L ^ a.bV;
	// 10511 19613:aload_1         
	// 10512 19614:aload_1         
	// 10513 19615:getfield        #113 <Field int azh.L>
	// 10514 19618:aload_0         
	// 10515 19619:getfield        #12  <Field azh a>
	// 10516 19622:getfield        #501 <Field int azh.bV>
	// 10517 19625:ixor            
	// 10518 19626:putfield        #501 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 10519 19629:aload_0         
	// 10520 19630:getfield        #12  <Field azh a>
	// 10521 19633:astore_1        
		abyte0.aA = ((azh) (abyte0)).bV ^ a.aA;
	// 10522 19634:aload_1         
	// 10523 19635:aload_1         
	// 10524 19636:getfield        #501 <Field int azh.bV>
	// 10525 19639:aload_0         
	// 10526 19640:getfield        #12  <Field azh a>
	// 10527 19643:getfield        #498 <Field int azh.aA>
	// 10528 19646:ixor            
	// 10529 19647:putfield        #498 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 10530 19650:aload_0         
	// 10531 19651:getfield        #12  <Field azh a>
	// 10532 19654:astore_1        
		abyte0.bS = ((azh) (abyte0)).bV ^ a.bS;
	// 10533 19655:aload_1         
	// 10534 19656:aload_1         
	// 10535 19657:getfield        #501 <Field int azh.bV>
	// 10536 19660:aload_0         
	// 10537 19661:getfield        #12  <Field azh a>
	// 10538 19664:getfield        #71  <Field int azh.bS>
	// 10539 19667:ixor            
	// 10540 19668:putfield        #71  <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 10541 19671:aload_0         
	// 10542 19672:getfield        #12  <Field azh a>
	// 10543 19675:astore_1        
		abyte0.bS = ((azh) (abyte0)).ab & ~a.bS;
	// 10544 19676:aload_1         
	// 10545 19677:aload_1         
	// 10546 19678:getfield        #343 <Field int azh.ab>
	// 10547 19681:aload_0         
	// 10548 19682:getfield        #12  <Field azh a>
	// 10549 19685:getfield        #71  <Field int azh.bS>
	// 10550 19688:iconst_m1       
	// 10551 19689:ixor            
	// 10552 19690:iand            
	// 10553 19691:putfield        #71  <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 10554 19694:aload_0         
	// 10555 19695:getfield        #12  <Field azh a>
	// 10556 19698:astore_1        
		abyte0.bS = ((azh) (abyte0)).aA ^ a.bS;
	// 10557 19699:aload_1         
	// 10558 19700:aload_1         
	// 10559 19701:getfield        #498 <Field int azh.aA>
	// 10560 19704:aload_0         
	// 10561 19705:getfield        #12  <Field azh a>
	// 10562 19708:getfield        #71  <Field int azh.bS>
	// 10563 19711:ixor            
	// 10564 19712:putfield        #71  <Field int azh.bS>
		abyte0 = ((byte []) (a));
	// 10565 19715:aload_0         
	// 10566 19716:getfield        #12  <Field azh a>
	// 10567 19719:astore_1        
		abyte0.bV = ((azh) (abyte0)).bV & ~a.T;
	// 10568 19720:aload_1         
	// 10569 19721:aload_1         
	// 10570 19722:getfield        #501 <Field int azh.bV>
	// 10571 19725:aload_0         
	// 10572 19726:getfield        #12  <Field azh a>
	// 10573 19729:getfield        #325 <Field int azh.T>
	// 10574 19732:iconst_m1       
	// 10575 19733:ixor            
	// 10576 19734:iand            
	// 10577 19735:putfield        #501 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 10578 19738:aload_0         
	// 10579 19739:getfield        #12  <Field azh a>
	// 10580 19742:astore_1        
		abyte0.aA = ((azh) (abyte0)).D | a.h;
	// 10581 19743:aload_1         
	// 10582 19744:aload_1         
	// 10583 19745:getfield        #119 <Field int azh.D>
	// 10584 19748:aload_0         
	// 10585 19749:getfield        #12  <Field azh a>
	// 10586 19752:getfield        #196 <Field int azh.h>
	// 10587 19755:ior             
	// 10588 19756:putfield        #498 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 10589 19759:aload_0         
	// 10590 19760:getfield        #12  <Field azh a>
	// 10591 19763:astore_1        
		abyte0.bg = ((azh) (abyte0)).T & ~a.aA;
	// 10592 19764:aload_1         
	// 10593 19765:aload_1         
	// 10594 19766:getfield        #325 <Field int azh.T>
	// 10595 19769:aload_0         
	// 10596 19770:getfield        #12  <Field azh a>
	// 10597 19773:getfield        #498 <Field int azh.aA>
	// 10598 19776:iconst_m1       
	// 10599 19777:ixor            
	// 10600 19778:iand            
	// 10601 19779:putfield        #504 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 10602 19782:aload_0         
	// 10603 19783:getfield        #12  <Field azh a>
	// 10604 19786:astore_1        
		abyte0.bg = ((azh) (abyte0)).aX ^ a.bg;
	// 10605 19787:aload_1         
	// 10606 19788:aload_1         
	// 10607 19789:getfield        #101 <Field int azh.aX>
	// 10608 19792:aload_0         
	// 10609 19793:getfield        #12  <Field azh a>
	// 10610 19796:getfield        #504 <Field int azh.bg>
	// 10611 19799:ixor            
	// 10612 19800:putfield        #504 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 10613 19803:aload_0         
	// 10614 19804:getfield        #12  <Field azh a>
	// 10615 19807:astore_1        
		abyte0.bg = ((azh) (abyte0)).ab & a.bg;
	// 10616 19808:aload_1         
	// 10617 19809:aload_1         
	// 10618 19810:getfield        #343 <Field int azh.ab>
	// 10619 19813:aload_0         
	// 10620 19814:getfield        #12  <Field azh a>
	// 10621 19817:getfield        #504 <Field int azh.bg>
	// 10622 19820:iand            
	// 10623 19821:putfield        #504 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 10624 19824:aload_0         
	// 10625 19825:getfield        #12  <Field azh a>
	// 10626 19828:astore_1        
		abyte0.n = ((azh) (abyte0)).T & ~a.aA;
	// 10627 19829:aload_1         
	// 10628 19830:aload_1         
	// 10629 19831:getfield        #325 <Field int azh.T>
	// 10630 19834:aload_0         
	// 10631 19835:getfield        #12  <Field azh a>
	// 10632 19838:getfield        #498 <Field int azh.aA>
	// 10633 19841:iconst_m1       
	// 10634 19842:ixor            
	// 10635 19843:iand            
	// 10636 19844:putfield        #507 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10637 19847:aload_0         
	// 10638 19848:getfield        #12  <Field azh a>
	// 10639 19851:astore_1        
		abyte0.n = ((azh) (abyte0)).bH ^ a.n;
	// 10640 19852:aload_1         
	// 10641 19853:aload_1         
	// 10642 19854:getfield        #387 <Field int azh.bH>
	// 10643 19857:aload_0         
	// 10644 19858:getfield        #12  <Field azh a>
	// 10645 19861:getfield        #507 <Field int azh.n>
	// 10646 19864:ixor            
	// 10647 19865:putfield        #507 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10648 19868:aload_0         
	// 10649 19869:getfield        #12  <Field azh a>
	// 10650 19872:astore_1        
		abyte0.bg = ((azh) (abyte0)).n ^ a.bg;
	// 10651 19873:aload_1         
	// 10652 19874:aload_1         
	// 10653 19875:getfield        #507 <Field int azh.n>
	// 10654 19878:aload_0         
	// 10655 19879:getfield        #12  <Field azh a>
	// 10656 19882:getfield        #504 <Field int azh.bg>
	// 10657 19885:ixor            
	// 10658 19886:putfield        #504 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 10659 19889:aload_0         
	// 10660 19890:getfield        #12  <Field azh a>
	// 10661 19893:astore_1        
		abyte0.aA = ((azh) (abyte0)).T & ~a.aA;
	// 10662 19894:aload_1         
	// 10663 19895:aload_1         
	// 10664 19896:getfield        #325 <Field int azh.T>
	// 10665 19899:aload_0         
	// 10666 19900:getfield        #12  <Field azh a>
	// 10667 19903:getfield        #498 <Field int azh.aA>
	// 10668 19906:iconst_m1       
	// 10669 19907:ixor            
	// 10670 19908:iand            
	// 10671 19909:putfield        #498 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 10672 19912:aload_0         
	// 10673 19913:getfield        #12  <Field azh a>
	// 10674 19916:astore_1        
		abyte0.aA = ((azh) (abyte0)).L ^ a.aA;
	// 10675 19917:aload_1         
	// 10676 19918:aload_1         
	// 10677 19919:getfield        #113 <Field int azh.L>
	// 10678 19922:aload_0         
	// 10679 19923:getfield        #12  <Field azh a>
	// 10680 19926:getfield        #498 <Field int azh.aA>
	// 10681 19929:ixor            
	// 10682 19930:putfield        #498 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 10683 19933:aload_0         
	// 10684 19934:getfield        #12  <Field azh a>
	// 10685 19937:astore_1        
		abyte0.aA = ((azh) (abyte0)).ab & ~a.aA;
	// 10686 19938:aload_1         
	// 10687 19939:aload_1         
	// 10688 19940:getfield        #343 <Field int azh.ab>
	// 10689 19943:aload_0         
	// 10690 19944:getfield        #12  <Field azh a>
	// 10691 19947:getfield        #498 <Field int azh.aA>
	// 10692 19950:iconst_m1       
	// 10693 19951:ixor            
	// 10694 19952:iand            
	// 10695 19953:putfield        #498 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 10696 19956:aload_0         
	// 10697 19957:getfield        #12  <Field azh a>
	// 10698 19960:astore_1        
		abyte0.aq = ((azh) (abyte0)).D | a.aq;
	// 10699 19961:aload_1         
	// 10700 19962:aload_1         
	// 10701 19963:getfield        #119 <Field int azh.D>
	// 10702 19966:aload_0         
	// 10703 19967:getfield        #12  <Field azh a>
	// 10704 19970:getfield        #190 <Field int azh.aq>
	// 10705 19973:ior             
	// 10706 19974:putfield        #190 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 10707 19977:aload_0         
	// 10708 19978:getfield        #12  <Field azh a>
	// 10709 19981:astore_1        
		abyte0.aq = ((azh) (abyte0)).at ^ a.aq;
	// 10710 19982:aload_1         
	// 10711 19983:aload_1         
	// 10712 19984:getfield        #86  <Field int azh.at>
	// 10713 19987:aload_0         
	// 10714 19988:getfield        #12  <Field azh a>
	// 10715 19991:getfield        #190 <Field int azh.aq>
	// 10716 19994:ixor            
	// 10717 19995:putfield        #190 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 10718 19998:aload_0         
	// 10719 19999:getfield        #12  <Field azh a>
	// 10720 20002:astore_1        
		abyte0.bx = ((azh) (abyte0)).aq ^ a.bx;
	// 10721 20003:aload_1         
	// 10722 20004:aload_1         
	// 10723 20005:getfield        #190 <Field int azh.aq>
	// 10724 20008:aload_0         
	// 10725 20009:getfield        #12  <Field azh a>
	// 10726 20012:getfield        #92  <Field int azh.bx>
	// 10727 20015:ixor            
	// 10728 20016:putfield        #92  <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 10729 20019:aload_0         
	// 10730 20020:getfield        #12  <Field azh a>
	// 10731 20023:astore_1        
		abyte0.aA = ((azh) (abyte0)).bx ^ a.aA;
	// 10732 20024:aload_1         
	// 10733 20025:aload_1         
	// 10734 20026:getfield        #92  <Field int azh.bx>
	// 10735 20029:aload_0         
	// 10736 20030:getfield        #12  <Field azh a>
	// 10737 20033:getfield        #498 <Field int azh.aA>
	// 10738 20036:ixor            
	// 10739 20037:putfield        #498 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 10740 20040:aload_0         
	// 10741 20041:getfield        #12  <Field azh a>
	// 10742 20044:astore_1        
		abyte0.bx = ((azh) (abyte0)).ct ^ a.D;
	// 10743 20045:aload_1         
	// 10744 20046:aload_1         
	// 10745 20047:getfield        #226 <Field int azh.ct>
	// 10746 20050:aload_0         
	// 10747 20051:getfield        #12  <Field azh a>
	// 10748 20054:getfield        #119 <Field int azh.D>
	// 10749 20057:ixor            
	// 10750 20058:putfield        #92  <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 10751 20061:aload_0         
	// 10752 20062:getfield        #12  <Field azh a>
	// 10753 20065:astore_1        
		abyte0.bV = ((azh) (abyte0)).bx ^ a.bV;
	// 10754 20066:aload_1         
	// 10755 20067:aload_1         
	// 10756 20068:getfield        #92  <Field int azh.bx>
	// 10757 20071:aload_0         
	// 10758 20072:getfield        #12  <Field azh a>
	// 10759 20075:getfield        #501 <Field int azh.bV>
	// 10760 20078:ixor            
	// 10761 20079:putfield        #501 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 10762 20082:aload_0         
	// 10763 20083:getfield        #12  <Field azh a>
	// 10764 20086:astore_1        
		abyte0.cC = ((azh) (abyte0)).cC & ~a.D;
	// 10765 20087:aload_1         
	// 10766 20088:aload_1         
	// 10767 20089:getfield        #59  <Field int azh.cC>
	// 10768 20092:aload_0         
	// 10769 20093:getfield        #12  <Field azh a>
	// 10770 20096:getfield        #119 <Field int azh.D>
	// 10771 20099:iconst_m1       
	// 10772 20100:ixor            
	// 10773 20101:iand            
	// 10774 20102:putfield        #59  <Field int azh.cC>
		abyte0 = ((byte []) (a));
	// 10775 20105:aload_0         
	// 10776 20106:getfield        #12  <Field azh a>
	// 10777 20109:astore_1        
		abyte0.cC = ((azh) (abyte0)).aU ^ a.cC;
	// 10778 20110:aload_1         
	// 10779 20111:aload_1         
	// 10780 20112:getfield        #411 <Field int azh.aU>
	// 10781 20115:aload_0         
	// 10782 20116:getfield        #12  <Field azh a>
	// 10783 20119:getfield        #59  <Field int azh.cC>
	// 10784 20122:ixor            
	// 10785 20123:putfield        #59  <Field int azh.cC>
		abyte0 = ((byte []) (a));
	// 10786 20126:aload_0         
	// 10787 20127:getfield        #12  <Field azh a>
	// 10788 20130:astore_1        
		abyte0.cC = ((azh) (abyte0)).L & ~a.cC;
	// 10789 20131:aload_1         
	// 10790 20132:aload_1         
	// 10791 20133:getfield        #113 <Field int azh.L>
	// 10792 20136:aload_0         
	// 10793 20137:getfield        #12  <Field azh a>
	// 10794 20140:getfield        #59  <Field int azh.cC>
	// 10795 20143:iconst_m1       
	// 10796 20144:ixor            
	// 10797 20145:iand            
	// 10798 20146:putfield        #59  <Field int azh.cC>
		abyte0 = ((byte []) (a));
	// 10799 20149:aload_0         
	// 10800 20150:getfield        #12  <Field azh a>
	// 10801 20153:astore_1        
		abyte0.aU = ((azh) (abyte0)).aQ & ~a.D;
	// 10802 20154:aload_1         
	// 10803 20155:aload_1         
	// 10804 20156:getfield        #235 <Field int azh.aQ>
	// 10805 20159:aload_0         
	// 10806 20160:getfield        #12  <Field azh a>
	// 10807 20163:getfield        #119 <Field int azh.D>
	// 10808 20166:iconst_m1       
	// 10809 20167:ixor            
	// 10810 20168:iand            
	// 10811 20169:putfield        #411 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 10812 20172:aload_0         
	// 10813 20173:getfield        #12  <Field azh a>
	// 10814 20176:astore_1        
		abyte0.aU = ((azh) (abyte0)).cq ^ a.aU;
	// 10815 20177:aload_1         
	// 10816 20178:aload_1         
	// 10817 20179:getfield        #179 <Field int azh.cq>
	// 10818 20182:aload_0         
	// 10819 20183:getfield        #12  <Field azh a>
	// 10820 20186:getfield        #411 <Field int azh.aU>
	// 10821 20189:ixor            
	// 10822 20190:putfield        #411 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 10823 20193:aload_0         
	// 10824 20194:getfield        #12  <Field azh a>
	// 10825 20197:astore_1        
		abyte0.aY = ((azh) (abyte0)).aU ^ a.aY;
	// 10826 20198:aload_1         
	// 10827 20199:aload_1         
	// 10828 20200:getfield        #411 <Field int azh.aU>
	// 10829 20203:aload_0         
	// 10830 20204:getfield        #12  <Field azh a>
	// 10831 20207:getfield        #244 <Field int azh.aY>
	// 10832 20210:ixor            
	// 10833 20211:putfield        #244 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 10834 20214:aload_0         
	// 10835 20215:getfield        #12  <Field azh a>
	// 10836 20218:astore_1        
		abyte0.aY = ((azh) (abyte0)).ab & a.aY;
	// 10837 20219:aload_1         
	// 10838 20220:aload_1         
	// 10839 20221:getfield        #343 <Field int azh.ab>
	// 10840 20224:aload_0         
	// 10841 20225:getfield        #12  <Field azh a>
	// 10842 20228:getfield        #244 <Field int azh.aY>
	// 10843 20231:iand            
	// 10844 20232:putfield        #244 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 10845 20235:aload_0         
	// 10846 20236:getfield        #12  <Field azh a>
	// 10847 20239:astore_1        
		abyte0.av = ((azh) (abyte0)).aU ^ a.av;
	// 10848 20240:aload_1         
	// 10849 20241:aload_1         
	// 10850 20242:getfield        #411 <Field int azh.aU>
	// 10851 20245:aload_0         
	// 10852 20246:getfield        #12  <Field azh a>
	// 10853 20249:getfield        #450 <Field int azh.av>
	// 10854 20252:ixor            
	// 10855 20253:putfield        #450 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 10856 20256:aload_0         
	// 10857 20257:getfield        #12  <Field azh a>
	// 10858 20260:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aQ & ~a.D;
	// 10859 20261:aload_1         
	// 10860 20262:aload_1         
	// 10861 20263:getfield        #235 <Field int azh.aQ>
	// 10862 20266:aload_0         
	// 10863 20267:getfield        #12  <Field azh a>
	// 10864 20270:getfield        #119 <Field int azh.D>
	// 10865 20273:iconst_m1       
	// 10866 20274:ixor            
	// 10867 20275:iand            
	// 10868 20276:putfield        #235 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 10869 20279:aload_0         
	// 10870 20280:getfield        #12  <Field azh a>
	// 10871 20283:astore_1        
		abyte0.aQ = ((azh) (abyte0)).T & ~a.aQ;
	// 10872 20284:aload_1         
	// 10873 20285:aload_1         
	// 10874 20286:getfield        #325 <Field int azh.T>
	// 10875 20289:aload_0         
	// 10876 20290:getfield        #12  <Field azh a>
	// 10877 20293:getfield        #235 <Field int azh.aQ>
	// 10878 20296:iconst_m1       
	// 10879 20297:ixor            
	// 10880 20298:iand            
	// 10881 20299:putfield        #235 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 10882 20302:aload_0         
	// 10883 20303:getfield        #12  <Field azh a>
	// 10884 20306:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bx ^ a.aQ;
	// 10885 20307:aload_1         
	// 10886 20308:aload_1         
	// 10887 20309:getfield        #92  <Field int azh.bx>
	// 10888 20312:aload_0         
	// 10889 20313:getfield        #12  <Field azh a>
	// 10890 20316:getfield        #235 <Field int azh.aQ>
	// 10891 20319:ixor            
	// 10892 20320:putfield        #235 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 10893 20323:aload_0         
	// 10894 20324:getfield        #12  <Field azh a>
	// 10895 20327:astore_1        
		abyte0.bh = ((azh) (abyte0)).D & a.bh;
	// 10896 20328:aload_1         
	// 10897 20329:aload_1         
	// 10898 20330:getfield        #119 <Field int azh.D>
	// 10899 20333:aload_0         
	// 10900 20334:getfield        #12  <Field azh a>
	// 10901 20337:getfield        #307 <Field int azh.bh>
	// 10902 20340:iand            
	// 10903 20341:putfield        #307 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 10904 20344:aload_0         
	// 10905 20345:getfield        #12  <Field azh a>
	// 10906 20348:astore_1        
		abyte0.bh = ((azh) (abyte0)).ar ^ a.bh;
	// 10907 20349:aload_1         
	// 10908 20350:aload_1         
	// 10909 20351:getfield        #483 <Field int azh.ar>
	// 10910 20354:aload_0         
	// 10911 20355:getfield        #12  <Field azh a>
	// 10912 20358:getfield        #307 <Field int azh.bh>
	// 10913 20361:ixor            
	// 10914 20362:putfield        #307 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 10915 20365:aload_0         
	// 10916 20366:getfield        #12  <Field azh a>
	// 10917 20369:astore_1        
		abyte0.ar = ((azh) (abyte0)).T | a.D;
	// 10918 20370:aload_1         
	// 10919 20371:aload_1         
	// 10920 20372:getfield        #325 <Field int azh.T>
	// 10921 20375:aload_0         
	// 10922 20376:getfield        #12  <Field azh a>
	// 10923 20379:getfield        #119 <Field int azh.D>
	// 10924 20382:ior             
	// 10925 20383:putfield        #483 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 10926 20386:aload_0         
	// 10927 20387:getfield        #12  <Field azh a>
	// 10928 20390:astore_1        
		abyte0.aY = ((azh) (abyte0)).ar ^ a.aY;
	// 10929 20391:aload_1         
	// 10930 20392:aload_1         
	// 10931 20393:getfield        #483 <Field int azh.ar>
	// 10932 20396:aload_0         
	// 10933 20397:getfield        #12  <Field azh a>
	// 10934 20400:getfield        #244 <Field int azh.aY>
	// 10935 20403:ixor            
	// 10936 20404:putfield        #244 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	// 10937 20407:aload_0         
	// 10938 20408:getfield        #12  <Field azh a>
	// 10939 20411:astore_1        
		abyte0.af = ((azh) (abyte0)).D | a.af;
	// 10940 20412:aload_1         
	// 10941 20413:aload_1         
	// 10942 20414:getfield        #119 <Field int azh.D>
	// 10943 20417:aload_0         
	// 10944 20418:getfield        #12  <Field azh a>
	// 10945 20421:getfield        #456 <Field int azh.af>
	// 10946 20424:ior             
	// 10947 20425:putfield        #456 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 10948 20428:aload_0         
	// 10949 20429:getfield        #12  <Field azh a>
	// 10950 20432:astore_1        
		abyte0.af = ((azh) (abyte0)).aJ ^ a.af;
	// 10951 20433:aload_1         
	// 10952 20434:aload_1         
	// 10953 20435:getfield        #474 <Field int azh.aJ>
	// 10954 20438:aload_0         
	// 10955 20439:getfield        #12  <Field azh a>
	// 10956 20442:getfield        #456 <Field int azh.af>
	// 10957 20445:ixor            
	// 10958 20446:putfield        #456 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 10959 20449:aload_0         
	// 10960 20450:getfield        #12  <Field azh a>
	// 10961 20453:astore_1        
		abyte0.af = ((azh) (abyte0)).L & a.af;
	// 10962 20454:aload_1         
	// 10963 20455:aload_1         
	// 10964 20456:getfield        #113 <Field int azh.L>
	// 10965 20459:aload_0         
	// 10966 20460:getfield        #12  <Field azh a>
	// 10967 20463:getfield        #456 <Field int azh.af>
	// 10968 20466:iand            
	// 10969 20467:putfield        #456 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 10970 20470:aload_0         
	// 10971 20471:getfield        #12  <Field azh a>
	// 10972 20474:astore_1        
		abyte0.af = ((azh) (abyte0)).bh ^ a.af;
	// 10973 20475:aload_1         
	// 10974 20476:aload_1         
	// 10975 20477:getfield        #307 <Field int azh.bh>
	// 10976 20480:aload_0         
	// 10977 20481:getfield        #12  <Field azh a>
	// 10978 20484:getfield        #456 <Field int azh.af>
	// 10979 20487:ixor            
	// 10980 20488:putfield        #456 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 10981 20491:aload_0         
	// 10982 20492:getfield        #12  <Field azh a>
	// 10983 20495:astore_1        
		abyte0.aJ = ((azh) (abyte0)).D & a.aJ;
	// 10984 20496:aload_1         
	// 10985 20497:aload_1         
	// 10986 20498:getfield        #119 <Field int azh.D>
	// 10987 20501:aload_0         
	// 10988 20502:getfield        #12  <Field azh a>
	// 10989 20505:getfield        #474 <Field int azh.aJ>
	// 10990 20508:iand            
	// 10991 20509:putfield        #474 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 10992 20512:aload_0         
	// 10993 20513:getfield        #12  <Field azh a>
	// 10994 20516:astore_1        
		abyte0.aJ = ((azh) (abyte0)).au ^ a.aJ;
	// 10995 20517:aload_1         
	// 10996 20518:aload_1         
	// 10997 20519:getfield        #256 <Field int azh.au>
	// 10998 20522:aload_0         
	// 10999 20523:getfield        #12  <Field azh a>
	// 11000 20526:getfield        #474 <Field int azh.aJ>
	// 11001 20529:ixor            
	// 11002 20530:putfield        #474 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 11003 20533:aload_0         
	// 11004 20534:getfield        #12  <Field azh a>
	// 11005 20537:astore_1        
		abyte0.aJ = ((azh) (abyte0)).L & ~a.aJ;
	// 11006 20538:aload_1         
	// 11007 20539:aload_1         
	// 11008 20540:getfield        #113 <Field int azh.L>
	// 11009 20543:aload_0         
	// 11010 20544:getfield        #12  <Field azh a>
	// 11011 20547:getfield        #474 <Field int azh.aJ>
	// 11012 20550:iconst_m1       
	// 11013 20551:ixor            
	// 11014 20552:iand            
	// 11015 20553:putfield        #474 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 11016 20556:aload_0         
	// 11017 20557:getfield        #12  <Field azh a>
	// 11018 20560:astore_1        
		abyte0.aJ = ((azh) (abyte0)).bA ^ a.aJ;
	// 11019 20561:aload_1         
	// 11020 20562:aload_1         
	// 11021 20563:getfield        #453 <Field int azh.bA>
	// 11022 20566:aload_0         
	// 11023 20567:getfield        #12  <Field azh a>
	// 11024 20570:getfield        #474 <Field int azh.aJ>
	// 11025 20573:ixor            
	// 11026 20574:putfield        #474 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 11027 20577:aload_0         
	// 11028 20578:getfield        #12  <Field azh a>
	// 11029 20581:astore_1        
		abyte0.bA = ((azh) (abyte0)).cq & ~a.D;
	// 11030 20582:aload_1         
	// 11031 20583:aload_1         
	// 11032 20584:getfield        #179 <Field int azh.cq>
	// 11033 20587:aload_0         
	// 11034 20588:getfield        #12  <Field azh a>
	// 11035 20591:getfield        #119 <Field int azh.D>
	// 11036 20594:iconst_m1       
	// 11037 20595:ixor            
	// 11038 20596:iand            
	// 11039 20597:putfield        #453 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 11040 20600:aload_0         
	// 11041 20601:getfield        #12  <Field azh a>
	// 11042 20604:astore_1        
		abyte0.bA = ((azh) (abyte0)).ct ^ a.bA;
	// 11043 20605:aload_1         
	// 11044 20606:aload_1         
	// 11045 20607:getfield        #226 <Field int azh.ct>
	// 11046 20610:aload_0         
	// 11047 20611:getfield        #12  <Field azh a>
	// 11048 20614:getfield        #453 <Field int azh.bA>
	// 11049 20617:ixor            
	// 11050 20618:putfield        #453 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 11051 20621:aload_0         
	// 11052 20622:getfield        #12  <Field azh a>
	// 11053 20625:astore_1        
		abyte0.bA = ((azh) (abyte0)).bA & ~a.T;
	// 11054 20626:aload_1         
	// 11055 20627:aload_1         
	// 11056 20628:getfield        #453 <Field int azh.bA>
	// 11057 20631:aload_0         
	// 11058 20632:getfield        #12  <Field azh a>
	// 11059 20635:getfield        #325 <Field int azh.T>
	// 11060 20638:iconst_m1       
	// 11061 20639:ixor            
	// 11062 20640:iand            
	// 11063 20641:putfield        #453 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 11064 20644:aload_0         
	// 11065 20645:getfield        #12  <Field azh a>
	// 11066 20648:astore_1        
		abyte0.bA = ((azh) (abyte0)).ca ^ a.bA;
	// 11067 20649:aload_1         
	// 11068 20650:aload_1         
	// 11069 20651:getfield        #372 <Field int azh.ca>
	// 11070 20654:aload_0         
	// 11071 20655:getfield        #12  <Field azh a>
	// 11072 20658:getfield        #453 <Field int azh.bA>
	// 11073 20661:ixor            
	// 11074 20662:putfield        #453 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 11075 20665:aload_0         
	// 11076 20666:getfield        #12  <Field azh a>
	// 11077 20669:astore_1        
		abyte0.bA = ((azh) (abyte0)).ab & ~a.bA;
	// 11078 20670:aload_1         
	// 11079 20671:aload_1         
	// 11080 20672:getfield        #343 <Field int azh.ab>
	// 11081 20675:aload_0         
	// 11082 20676:getfield        #12  <Field azh a>
	// 11083 20679:getfield        #453 <Field int azh.bA>
	// 11084 20682:iconst_m1       
	// 11085 20683:ixor            
	// 11086 20684:iand            
	// 11087 20685:putfield        #453 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 11088 20688:aload_0         
	// 11089 20689:getfield        #12  <Field azh a>
	// 11090 20692:astore_1        
		abyte0.bR = ((azh) (abyte0)).D & a.bR;
	// 11091 20693:aload_1         
	// 11092 20694:aload_1         
	// 11093 20695:getfield        #119 <Field int azh.D>
	// 11094 20698:aload_0         
	// 11095 20699:getfield        #12  <Field azh a>
	// 11096 20702:getfield        #444 <Field int azh.bR>
	// 11097 20705:iand            
	// 11098 20706:putfield        #444 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 11099 20709:aload_0         
	// 11100 20710:getfield        #12  <Field azh a>
	// 11101 20713:astore_1        
		abyte0.bR = ((azh) (abyte0)).bY ^ a.bR;
	// 11102 20714:aload_1         
	// 11103 20715:aload_1         
	// 11104 20716:getfield        #122 <Field int azh.bY>
	// 11105 20719:aload_0         
	// 11106 20720:getfield        #12  <Field azh a>
	// 11107 20723:getfield        #444 <Field int azh.bR>
	// 11108 20726:ixor            
	// 11109 20727:putfield        #444 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	// 11110 20730:aload_0         
	// 11111 20731:getfield        #12  <Field azh a>
	// 11112 20734:astore_1        
		abyte0.cC = ((azh) (abyte0)).bR ^ a.cC;
	// 11113 20735:aload_1         
	// 11114 20736:aload_1         
	// 11115 20737:getfield        #444 <Field int azh.bR>
	// 11116 20740:aload_0         
	// 11117 20741:getfield        #12  <Field azh a>
	// 11118 20744:getfield        #59  <Field int azh.cC>
	// 11119 20747:ixor            
	// 11120 20748:putfield        #59  <Field int azh.cC>
		abyte0 = ((byte []) (a));
	// 11121 20751:aload_0         
	// 11122 20752:getfield        #12  <Field azh a>
	// 11123 20755:astore_1        
		abyte0.ba = ((azh) (abyte0)).D & ~a.ba;
	// 11124 20756:aload_1         
	// 11125 20757:aload_1         
	// 11126 20758:getfield        #119 <Field int azh.D>
	// 11127 20761:aload_0         
	// 11128 20762:getfield        #12  <Field azh a>
	// 11129 20765:getfield        #366 <Field int azh.ba>
	// 11130 20768:iconst_m1       
	// 11131 20769:ixor            
	// 11132 20770:iand            
	// 11133 20771:putfield        #366 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 11134 20774:aload_0         
	// 11135 20775:getfield        #12  <Field azh a>
	// 11136 20778:astore_1        
		abyte0.ba = ((azh) (abyte0)).bJ ^ a.ba;
	// 11137 20779:aload_1         
	// 11138 20780:aload_1         
	// 11139 20781:getfield        #35  <Field int azh.bJ>
	// 11140 20784:aload_0         
	// 11141 20785:getfield        #12  <Field azh a>
	// 11142 20788:getfield        #366 <Field int azh.ba>
	// 11143 20791:ixor            
	// 11144 20792:putfield        #366 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 11145 20795:aload_0         
	// 11146 20796:getfield        #12  <Field azh a>
	// 11147 20799:astore_1        
		abyte0.cA = ((azh) (abyte0)).ba ^ a.cA;
	// 11148 20800:aload_1         
	// 11149 20801:aload_1         
	// 11150 20802:getfield        #366 <Field int azh.ba>
	// 11151 20805:aload_0         
	// 11152 20806:getfield        #12  <Field azh a>
	// 11153 20809:getfield        #304 <Field int azh.cA>
	// 11154 20812:ixor            
	// 11155 20813:putfield        #304 <Field int azh.cA>
		abyte0 = ((byte []) (a));
	// 11156 20816:aload_0         
	// 11157 20817:getfield        #12  <Field azh a>
	// 11158 20820:astore_1        
		abyte0.ba = ((azh) (abyte0)).at & ~a.D;
	// 11159 20821:aload_1         
	// 11160 20822:aload_1         
	// 11161 20823:getfield        #86  <Field int azh.at>
	// 11162 20826:aload_0         
	// 11163 20827:getfield        #12  <Field azh a>
	// 11164 20830:getfield        #119 <Field int azh.D>
	// 11165 20833:iconst_m1       
	// 11166 20834:ixor            
	// 11167 20835:iand            
	// 11168 20836:putfield        #366 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 11169 20839:aload_0         
	// 11170 20840:getfield        #12  <Field azh a>
	// 11171 20843:astore_1        
		abyte0.ba = ((azh) (abyte0)).aX ^ a.ba;
	// 11172 20844:aload_1         
	// 11173 20845:aload_1         
	// 11174 20846:getfield        #101 <Field int azh.aX>
	// 11175 20849:aload_0         
	// 11176 20850:getfield        #12  <Field azh a>
	// 11177 20853:getfield        #366 <Field int azh.ba>
	// 11178 20856:ixor            
	// 11179 20857:putfield        #366 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 11180 20860:aload_0         
	// 11181 20861:getfield        #12  <Field azh a>
	// 11182 20864:astore_1        
		abyte0.ba = ((azh) (abyte0)).ba & ~a.T;
	// 11183 20865:aload_1         
	// 11184 20866:aload_1         
	// 11185 20867:getfield        #366 <Field int azh.ba>
	// 11186 20870:aload_0         
	// 11187 20871:getfield        #12  <Field azh a>
	// 11188 20874:getfield        #325 <Field int azh.T>
	// 11189 20877:iconst_m1       
	// 11190 20878:ixor            
	// 11191 20879:iand            
	// 11192 20880:putfield        #366 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 11193 20883:aload_0         
	// 11194 20884:getfield        #12  <Field azh a>
	// 11195 20887:astore_1        
		abyte0.ba = ((azh) (abyte0)).bx ^ a.ba;
	// 11196 20888:aload_1         
	// 11197 20889:aload_1         
	// 11198 20890:getfield        #92  <Field int azh.bx>
	// 11199 20893:aload_0         
	// 11200 20894:getfield        #12  <Field azh a>
	// 11201 20897:getfield        #366 <Field int azh.ba>
	// 11202 20900:ixor            
	// 11203 20901:putfield        #366 <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 11204 20904:aload_0         
	// 11205 20905:getfield        #12  <Field azh a>
	// 11206 20908:astore_1        
		abyte0.bA = ((azh) (abyte0)).ba ^ a.bA;
	// 11207 20909:aload_1         
	// 11208 20910:aload_1         
	// 11209 20911:getfield        #366 <Field int azh.ba>
	// 11210 20914:aload_0         
	// 11211 20915:getfield        #12  <Field azh a>
	// 11212 20918:getfield        #453 <Field int azh.bA>
	// 11213 20921:ixor            
	// 11214 20922:putfield        #453 <Field int azh.bA>
		abyte0 = ((byte []) (a));
	// 11215 20925:aload_0         
	// 11216 20926:getfield        #12  <Field azh a>
	// 11217 20929:astore_1        
		abyte0.ct = ((azh) (abyte0)).D | a.ct;
	// 11218 20930:aload_1         
	// 11219 20931:aload_1         
	// 11220 20932:getfield        #119 <Field int azh.D>
	// 11221 20935:aload_0         
	// 11222 20936:getfield        #12  <Field azh a>
	// 11223 20939:getfield        #226 <Field int azh.ct>
	// 11224 20942:ior             
	// 11225 20943:putfield        #226 <Field int azh.ct>
		abyte0 = ((byte []) (a));
	// 11226 20946:aload_0         
	// 11227 20947:getfield        #12  <Field azh a>
	// 11228 20950:astore_1        
		abyte0.ct = ((azh) (abyte0)).at ^ a.ct;
	// 11229 20951:aload_1         
	// 11230 20952:aload_1         
	// 11231 20953:getfield        #86  <Field int azh.at>
	// 11232 20956:aload_0         
	// 11233 20957:getfield        #12  <Field azh a>
	// 11234 20960:getfield        #226 <Field int azh.ct>
	// 11235 20963:ixor            
	// 11236 20964:putfield        #226 <Field int azh.ct>
		abyte0 = ((byte []) (a));
	// 11237 20967:aload_0         
	// 11238 20968:getfield        #12  <Field azh a>
	// 11239 20971:astore_1        
		abyte0.B = ((azh) (abyte0)).ct ^ a.B;
	// 11240 20972:aload_1         
	// 11241 20973:aload_1         
	// 11242 20974:getfield        #226 <Field int azh.ct>
	// 11243 20977:aload_0         
	// 11244 20978:getfield        #12  <Field azh a>
	// 11245 20981:getfield        #447 <Field int azh.B>
	// 11246 20984:ixor            
	// 11247 20985:putfield        #447 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 11248 20988:aload_0         
	// 11249 20989:getfield        #12  <Field azh a>
	// 11250 20992:astore_1        
		abyte0.B = ((azh) (abyte0)).ab & ~a.B;
	// 11251 20993:aload_1         
	// 11252 20994:aload_1         
	// 11253 20995:getfield        #343 <Field int azh.ab>
	// 11254 20998:aload_0         
	// 11255 20999:getfield        #12  <Field azh a>
	// 11256 21002:getfield        #447 <Field int azh.B>
	// 11257 21005:iconst_m1       
	// 11258 21006:ixor            
	// 11259 21007:iand            
	// 11260 21008:putfield        #447 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 11261 21011:aload_0         
	// 11262 21012:getfield        #12  <Field azh a>
	// 11263 21015:astore_1        
		abyte0.B = ((azh) (abyte0)).bV ^ a.B;
	// 11264 21016:aload_1         
	// 11265 21017:aload_1         
	// 11266 21018:getfield        #501 <Field int azh.bV>
	// 11267 21021:aload_0         
	// 11268 21022:getfield        #12  <Field azh a>
	// 11269 21025:getfield        #447 <Field int azh.B>
	// 11270 21028:ixor            
	// 11271 21029:putfield        #447 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 11272 21032:aload_0         
	// 11273 21033:getfield        #12  <Field azh a>
	// 11274 21036:astore_1        
		abyte0.bV = ((azh) (abyte0)).h & ~a.D;
	// 11275 21037:aload_1         
	// 11276 21038:aload_1         
	// 11277 21039:getfield        #196 <Field int azh.h>
	// 11278 21042:aload_0         
	// 11279 21043:getfield        #12  <Field azh a>
	// 11280 21046:getfield        #119 <Field int azh.D>
	// 11281 21049:iconst_m1       
	// 11282 21050:ixor            
	// 11283 21051:iand            
	// 11284 21052:putfield        #501 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11285 21055:aload_0         
	// 11286 21056:getfield        #12  <Field azh a>
	// 11287 21059:astore_1        
		abyte0.bV = ((azh) (abyte0)).h ^ a.bV;
	// 11288 21060:aload_1         
	// 11289 21061:aload_1         
	// 11290 21062:getfield        #196 <Field int azh.h>
	// 11291 21065:aload_0         
	// 11292 21066:getfield        #12  <Field azh a>
	// 11293 21069:getfield        #501 <Field int azh.bV>
	// 11294 21072:ixor            
	// 11295 21073:putfield        #501 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11296 21076:aload_0         
	// 11297 21077:getfield        #12  <Field azh a>
	// 11298 21080:astore_1        
		abyte0.bV = ((azh) (abyte0)).bV & ~a.T;
	// 11299 21081:aload_1         
	// 11300 21082:aload_1         
	// 11301 21083:getfield        #501 <Field int azh.bV>
	// 11302 21086:aload_0         
	// 11303 21087:getfield        #12  <Field azh a>
	// 11304 21090:getfield        #325 <Field int azh.T>
	// 11305 21093:iconst_m1       
	// 11306 21094:ixor            
	// 11307 21095:iand            
	// 11308 21096:putfield        #501 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11309 21099:aload_0         
	// 11310 21100:getfield        #12  <Field azh a>
	// 11311 21103:astore_1        
		abyte0.bV = ((azh) (abyte0)).D ^ a.bV;
	// 11312 21104:aload_1         
	// 11313 21105:aload_1         
	// 11314 21106:getfield        #119 <Field int azh.D>
	// 11315 21109:aload_0         
	// 11316 21110:getfield        #12  <Field azh a>
	// 11317 21113:getfield        #501 <Field int azh.bV>
	// 11318 21116:ixor            
	// 11319 21117:putfield        #501 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11320 21120:aload_0         
	// 11321 21121:getfield        #12  <Field azh a>
	// 11322 21124:astore_1        
		abyte0.bV = ((azh) (abyte0)).ab & a.bV;
	// 11323 21125:aload_1         
	// 11324 21126:aload_1         
	// 11325 21127:getfield        #343 <Field int azh.ab>
	// 11326 21130:aload_0         
	// 11327 21131:getfield        #12  <Field azh a>
	// 11328 21134:getfield        #501 <Field int azh.bV>
	// 11329 21137:iand            
	// 11330 21138:putfield        #501 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11331 21141:aload_0         
	// 11332 21142:getfield        #12  <Field azh a>
	// 11333 21145:astore_1        
		abyte0.bV = ((azh) (abyte0)).av ^ a.bV;
	// 11334 21146:aload_1         
	// 11335 21147:aload_1         
	// 11336 21148:getfield        #450 <Field int azh.av>
	// 11337 21151:aload_0         
	// 11338 21152:getfield        #12  <Field azh a>
	// 11339 21155:getfield        #501 <Field int azh.bV>
	// 11340 21158:ixor            
	// 11341 21159:putfield        #501 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11342 21162:aload_0         
	// 11343 21163:getfield        #12  <Field azh a>
	// 11344 21166:astore_1        
		abyte0.cq = ((azh) (abyte0)).cq & ~a.D;
	// 11345 21167:aload_1         
	// 11346 21168:aload_1         
	// 11347 21169:getfield        #179 <Field int azh.cq>
	// 11348 21172:aload_0         
	// 11349 21173:getfield        #12  <Field azh a>
	// 11350 21176:getfield        #119 <Field int azh.D>
	// 11351 21179:iconst_m1       
	// 11352 21180:ixor            
	// 11353 21181:iand            
	// 11354 21182:putfield        #179 <Field int azh.cq>
		abyte0 = ((byte []) (a));
	// 11355 21185:aload_0         
	// 11356 21186:getfield        #12  <Field azh a>
	// 11357 21189:astore_1        
		abyte0.cq = ((azh) (abyte0)).cq & a.T;
	// 11358 21190:aload_1         
	// 11359 21191:aload_1         
	// 11360 21192:getfield        #179 <Field int azh.cq>
	// 11361 21195:aload_0         
	// 11362 21196:getfield        #12  <Field azh a>
	// 11363 21199:getfield        #325 <Field int azh.T>
	// 11364 21202:iand            
	// 11365 21203:putfield        #179 <Field int azh.cq>
		abyte0 = ((byte []) (a));
	// 11366 21206:aload_0         
	// 11367 21207:getfield        #12  <Field azh a>
	// 11368 21210:astore_1        
		abyte0.cq = ((azh) (abyte0)).ab & ~a.cq;
	// 11369 21211:aload_1         
	// 11370 21212:aload_1         
	// 11371 21213:getfield        #343 <Field int azh.ab>
	// 11372 21216:aload_0         
	// 11373 21217:getfield        #12  <Field azh a>
	// 11374 21220:getfield        #179 <Field int azh.cq>
	// 11375 21223:iconst_m1       
	// 11376 21224:ixor            
	// 11377 21225:iand            
	// 11378 21226:putfield        #179 <Field int azh.cq>
		abyte0 = ((byte []) (a));
	// 11379 21229:aload_0         
	// 11380 21230:getfield        #12  <Field azh a>
	// 11381 21233:astore_1        
		abyte0.cq = ((azh) (abyte0)).aQ ^ a.cq;
	// 11382 21234:aload_1         
	// 11383 21235:aload_1         
	// 11384 21236:getfield        #235 <Field int azh.aQ>
	// 11385 21239:aload_0         
	// 11386 21240:getfield        #12  <Field azh a>
	// 11387 21243:getfield        #179 <Field int azh.cq>
	// 11388 21246:ixor            
	// 11389 21247:putfield        #179 <Field int azh.cq>
		abyte0 = ((byte []) (a));
	// 11390 21250:aload_0         
	// 11391 21251:getfield        #12  <Field azh a>
	// 11392 21254:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aP & ~a.bC;
	// 11393 21255:aload_1         
	// 11394 21256:aload_1         
	// 11395 21257:getfield        #152 <Field int azh.aP>
	// 11396 21260:aload_0         
	// 11397 21261:getfield        #12  <Field azh a>
	// 11398 21264:getfield        #352 <Field int azh.bC>
	// 11399 21267:iconst_m1       
	// 11400 21268:ixor            
	// 11401 21269:iand            
	// 11402 21270:putfield        #235 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 11403 21273:aload_0         
	// 11404 21274:getfield        #12  <Field azh a>
	// 11405 21277:astore_1        
		abyte0.aQ = ((azh) (abyte0)).be & a.aQ;
	// 11406 21278:aload_1         
	// 11407 21279:aload_1         
	// 11408 21280:getfield        #149 <Field int azh.be>
	// 11409 21283:aload_0         
	// 11410 21284:getfield        #12  <Field azh a>
	// 11411 21287:getfield        #235 <Field int azh.aQ>
	// 11412 21290:iand            
	// 11413 21291:putfield        #235 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 11414 21294:aload_0         
	// 11415 21295:getfield        #12  <Field azh a>
	// 11416 21298:astore_1        
		abyte0.cD = ((azh) (abyte0)).aQ ^ a.cD;
	// 11417 21299:aload_1         
	// 11418 21300:aload_1         
	// 11419 21301:getfield        #235 <Field int azh.aQ>
	// 11420 21304:aload_0         
	// 11421 21305:getfield        #12  <Field azh a>
	// 11422 21308:getfield        #268 <Field int azh.cD>
	// 11423 21311:ixor            
	// 11424 21312:putfield        #268 <Field int azh.cD>
		abyte0 = ((byte []) (a));
	// 11425 21315:aload_0         
	// 11426 21316:getfield        #12  <Field azh a>
	// 11427 21319:astore_1        
		abyte0.cD = ((azh) (abyte0)).cF | a.cD;
	// 11428 21320:aload_1         
	// 11429 21321:aload_1         
	// 11430 21322:getfield        #369 <Field int azh.cF>
	// 11431 21325:aload_0         
	// 11432 21326:getfield        #12  <Field azh a>
	// 11433 21329:getfield        #268 <Field int azh.cD>
	// 11434 21332:ior             
	// 11435 21333:putfield        #268 <Field int azh.cD>
		abyte0 = ((byte []) (a));
	// 11436 21336:aload_0         
	// 11437 21337:getfield        #12  <Field azh a>
	// 11438 21340:astore_1        
		abyte0.cD = ((azh) (abyte0)).aV ^ a.cD;
	// 11439 21341:aload_1         
	// 11440 21342:aload_1         
	// 11441 21343:getfield        #313 <Field int azh.aV>
	// 11442 21346:aload_0         
	// 11443 21347:getfield        #12  <Field azh a>
	// 11444 21350:getfield        #268 <Field int azh.cD>
	// 11445 21353:ixor            
	// 11446 21354:putfield        #268 <Field int azh.cD>
		abyte0 = ((byte []) (a));
	// 11447 21357:aload_0         
	// 11448 21358:getfield        #12  <Field azh a>
	// 11449 21361:astore_1        
		abyte0.cD = ((azh) (abyte0)).cD & ~a.bK;
	// 11450 21362:aload_1         
	// 11451 21363:aload_1         
	// 11452 21364:getfield        #268 <Field int azh.cD>
	// 11453 21367:aload_0         
	// 11454 21368:getfield        #12  <Field azh a>
	// 11455 21371:getfield        #334 <Field int azh.bK>
	// 11456 21374:iconst_m1       
	// 11457 21375:ixor            
	// 11458 21376:iand            
	// 11459 21377:putfield        #268 <Field int azh.cD>
		abyte0 = ((byte []) (a));
	// 11460 21380:aload_0         
	// 11461 21381:getfield        #12  <Field azh a>
	// 11462 21384:astore_1        
		abyte0.aw = ((azh) (abyte0)).aQ ^ a.aw;
	// 11463 21385:aload_1         
	// 11464 21386:aload_1         
	// 11465 21387:getfield        #235 <Field int azh.aQ>
	// 11466 21390:aload_0         
	// 11467 21391:getfield        #12  <Field azh a>
	// 11468 21394:getfield        #199 <Field int azh.aw>
	// 11469 21397:ixor            
	// 11470 21398:putfield        #199 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 11471 21401:aload_0         
	// 11472 21402:getfield        #12  <Field azh a>
	// 11473 21405:astore_1        
		abyte0.aw = ((azh) (abyte0)).cF | a.aw;
	// 11474 21406:aload_1         
	// 11475 21407:aload_1         
	// 11476 21408:getfield        #369 <Field int azh.cF>
	// 11477 21411:aload_0         
	// 11478 21412:getfield        #12  <Field azh a>
	// 11479 21415:getfield        #199 <Field int azh.aw>
	// 11480 21418:ior             
	// 11481 21419:putfield        #199 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 11482 21422:aload_0         
	// 11483 21423:getfield        #12  <Field azh a>
	// 11484 21426:astore_1        
		abyte0.aw = ((azh) (abyte0)).aH ^ a.aw;
	// 11485 21427:aload_1         
	// 11486 21428:aload_1         
	// 11487 21429:getfield        #399 <Field int azh.aH>
	// 11488 21432:aload_0         
	// 11489 21433:getfield        #12  <Field azh a>
	// 11490 21436:getfield        #199 <Field int azh.aw>
	// 11491 21439:ixor            
	// 11492 21440:putfield        #199 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 11493 21443:aload_0         
	// 11494 21444:getfield        #12  <Field azh a>
	// 11495 21447:astore_1        
		abyte0.cD = ((azh) (abyte0)).aw ^ a.cD;
	// 11496 21448:aload_1         
	// 11497 21449:aload_1         
	// 11498 21450:getfield        #199 <Field int azh.aw>
	// 11499 21453:aload_0         
	// 11500 21454:getfield        #12  <Field azh a>
	// 11501 21457:getfield        #268 <Field int azh.cD>
	// 11502 21460:ixor            
	// 11503 21461:putfield        #268 <Field int azh.cD>
		abyte0 = ((byte []) (a));
	// 11504 21464:aload_0         
	// 11505 21465:getfield        #12  <Field azh a>
	// 11506 21468:astore_1        
		abyte0.x = ((azh) (abyte0)).cD ^ a.x;
	// 11507 21469:aload_1         
	// 11508 21470:aload_1         
	// 11509 21471:getfield        #268 <Field int azh.cD>
	// 11510 21474:aload_0         
	// 11511 21475:getfield        #12  <Field azh a>
	// 11512 21478:getfield        #510 <Field int azh.x>
	// 11513 21481:ixor            
	// 11514 21482:putfield        #510 <Field int azh.x>
		abyte0 = ((byte []) (a));
	// 11515 21485:aload_0         
	// 11516 21486:getfield        #12  <Field azh a>
	// 11517 21489:astore_1        
		abyte0.aN = ((azh) (abyte0)).H & ~a.aN;
	// 11518 21490:aload_1         
	// 11519 21491:aload_1         
	// 11520 21492:getfield        #131 <Field int azh.H>
	// 11521 21495:aload_0         
	// 11522 21496:getfield        #12  <Field azh a>
	// 11523 21499:getfield        #271 <Field int azh.aN>
	// 11524 21502:iconst_m1       
	// 11525 21503:ixor            
	// 11526 21504:iand            
	// 11527 21505:putfield        #271 <Field int azh.aN>
	// 11528 21508:return          
	}

	private final azh a;
}
