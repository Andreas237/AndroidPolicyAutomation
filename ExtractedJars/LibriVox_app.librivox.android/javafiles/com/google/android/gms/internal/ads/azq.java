// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			azk, azh, azj

final class azq
	implements azk
{

	private azq(azh azh1)
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

	azq(azh azh1, azj azj)
	{
		this(azh1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void azq(azh)>
	//    3    5:return          
	}

	public final void a(byte abyte0[], byte abyte1[])
	{
		abyte0 = ((byte []) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field azh a>
	//    2    4:astore_1        
		abyte0.bo = ((azh) (abyte0)).D & ~a.T;
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:getfield        #26  <Field int azh.D>
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field azh a>
	//    8   14:getfield        #29  <Field int azh.T>
	//    9   17:iconst_m1       
	//   10   18:ixor            
	//   11   19:iand            
	//   12   20:putfield        #32  <Field int azh.bo>
		abyte0 = ((byte []) (a));
	//   13   23:aload_0         
	//   14   24:getfield        #12  <Field azh a>
	//   15   27:astore_1        
		abyte0.bT = ((azh) (abyte0)).bo ^ a.bT;
	//   16   28:aload_1         
	//   17   29:aload_1         
	//   18   30:getfield        #32  <Field int azh.bo>
	//   19   33:aload_0         
	//   20   34:getfield        #12  <Field azh a>
	//   21   37:getfield        #35  <Field int azh.bT>
	//   22   40:ixor            
	//   23   41:putfield        #35  <Field int azh.bT>
		abyte0 = ((byte []) (a));
	//   24   44:aload_0         
	//   25   45:getfield        #12  <Field azh a>
	//   26   48:astore_1        
		abyte0.bo = ((azh) (abyte0)).ab | a.T;
	//   27   49:aload_1         
	//   28   50:aload_1         
	//   29   51:getfield        #38  <Field int azh.ab>
	//   30   54:aload_0         
	//   31   55:getfield        #12  <Field azh a>
	//   32   58:getfield        #29  <Field int azh.T>
	//   33   61:ior             
	//   34   62:putfield        #32  <Field int azh.bo>
		abyte0 = ((byte []) (a));
	//   35   65:aload_0         
	//   36   66:getfield        #12  <Field azh a>
	//   37   69:astore_1        
		abyte0.bo = ((azh) (abyte0)).aZ ^ a.bo;
	//   38   70:aload_1         
	//   39   71:aload_1         
	//   40   72:getfield        #41  <Field int azh.aZ>
	//   41   75:aload_0         
	//   42   76:getfield        #12  <Field azh a>
	//   43   79:getfield        #32  <Field int azh.bo>
	//   44   82:ixor            
	//   45   83:putfield        #32  <Field int azh.bo>
		abyte0 = ((byte []) (a));
	//   46   86:aload_0         
	//   47   87:getfield        #12  <Field azh a>
	//   48   90:astore_1        
		abyte0.aK = ((azh) (abyte0)).T ^ a.D;
	//   49   91:aload_1         
	//   50   92:aload_1         
	//   51   93:getfield        #29  <Field int azh.T>
	//   52   96:aload_0         
	//   53   97:getfield        #12  <Field azh a>
	//   54  100:getfield        #26  <Field int azh.D>
	//   55  103:ixor            
	//   56  104:putfield        #44  <Field int azh.aK>
		abyte0 = ((byte []) (a));
	//   57  107:aload_0         
	//   58  108:getfield        #12  <Field azh a>
	//   59  111:astore_1        
		abyte0.bL = ((azh) (abyte0)).aK ^ a.ab;
	//   60  112:aload_1         
	//   61  113:aload_1         
	//   62  114:getfield        #44  <Field int azh.aK>
	//   63  117:aload_0         
	//   64  118:getfield        #12  <Field azh a>
	//   65  121:getfield        #38  <Field int azh.ab>
	//   66  124:ixor            
	//   67  125:putfield        #47  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	//   68  128:aload_0         
	//   69  129:getfield        #12  <Field azh a>
	//   70  132:astore_1        
		abyte0.az = ((azh) (abyte0)).aK & ~a.ab;
	//   71  133:aload_1         
	//   72  134:aload_1         
	//   73  135:getfield        #44  <Field int azh.aK>
	//   74  138:aload_0         
	//   75  139:getfield        #12  <Field azh a>
	//   76  142:getfield        #38  <Field int azh.ab>
	//   77  145:iconst_m1       
	//   78  146:ixor            
	//   79  147:iand            
	//   80  148:putfield        #50  <Field int azh.az>
		abyte0 = ((byte []) (a));
	//   81  151:aload_0         
	//   82  152:getfield        #12  <Field azh a>
	//   83  155:astore_1        
		abyte0.bJ = ((azh) (abyte0)).T & a.D;
	//   84  156:aload_1         
	//   85  157:aload_1         
	//   86  158:getfield        #29  <Field int azh.T>
	//   87  161:aload_0         
	//   88  162:getfield        #12  <Field azh a>
	//   89  165:getfield        #26  <Field int azh.D>
	//   90  168:iand            
	//   91  169:putfield        #53  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	//   92  172:aload_0         
	//   93  173:getfield        #12  <Field azh a>
	//   94  176:astore_1        
		abyte0.bK = ((azh) (abyte0)).bJ & ~a.ab;
	//   95  177:aload_1         
	//   96  178:aload_1         
	//   97  179:getfield        #53  <Field int azh.bJ>
	//   98  182:aload_0         
	//   99  183:getfield        #12  <Field azh a>
	//  100  186:getfield        #38  <Field int azh.ab>
	//  101  189:iconst_m1       
	//  102  190:ixor            
	//  103  191:iand            
	//  104  192:putfield        #56  <Field int azh.bK>
		abyte0 = ((byte []) (a));
	//  105  195:aload_0         
	//  106  196:getfield        #12  <Field azh a>
	//  107  199:astore_1        
		abyte0.bK = ((azh) (abyte0)).bJ ^ a.bK;
	//  108  200:aload_1         
	//  109  201:aload_1         
	//  110  202:getfield        #53  <Field int azh.bJ>
	//  111  205:aload_0         
	//  112  206:getfield        #12  <Field azh a>
	//  113  209:getfield        #56  <Field int azh.bK>
	//  114  212:ixor            
	//  115  213:putfield        #56  <Field int azh.bK>
		abyte0 = ((byte []) (a));
	//  116  216:aload_0         
	//  117  217:getfield        #12  <Field azh a>
	//  118  220:astore_1        
		abyte0.cd = ((azh) (abyte0)).ab | a.bJ;
	//  119  221:aload_1         
	//  120  222:aload_1         
	//  121  223:getfield        #38  <Field int azh.ab>
	//  122  226:aload_0         
	//  123  227:getfield        #12  <Field azh a>
	//  124  230:getfield        #53  <Field int azh.bJ>
	//  125  233:ior             
	//  126  234:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	//  127  237:aload_0         
	//  128  238:getfield        #12  <Field azh a>
	//  129  241:astore_1        
		abyte0.cd = ((azh) (abyte0)).aZ ^ a.cd;
	//  130  242:aload_1         
	//  131  243:aload_1         
	//  132  244:getfield        #41  <Field int azh.aZ>
	//  133  247:aload_0         
	//  134  248:getfield        #12  <Field azh a>
	//  135  251:getfield        #59  <Field int azh.cd>
	//  136  254:ixor            
	//  137  255:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	//  138  258:aload_0         
	//  139  259:getfield        #12  <Field azh a>
	//  140  262:astore_1        
		abyte0.bi = ((azh) (abyte0)).ab | a.bJ;
	//  141  263:aload_1         
	//  142  264:aload_1         
	//  143  265:getfield        #38  <Field int azh.ab>
	//  144  268:aload_0         
	//  145  269:getfield        #12  <Field azh a>
	//  146  272:getfield        #53  <Field int azh.bJ>
	//  147  275:ior             
	//  148  276:putfield        #62  <Field int azh.bi>
		abyte0 = ((byte []) (a));
	//  149  279:aload_0         
	//  150  280:getfield        #12  <Field azh a>
	//  151  283:astore_1        
		abyte0.ba = ((azh) (abyte0)).D & ~a.bJ;
	//  152  284:aload_1         
	//  153  285:aload_1         
	//  154  286:getfield        #26  <Field int azh.D>
	//  155  289:aload_0         
	//  156  290:getfield        #12  <Field azh a>
	//  157  293:getfield        #53  <Field int azh.bJ>
	//  158  296:iconst_m1       
	//  159  297:ixor            
	//  160  298:iand            
	//  161  299:putfield        #65  <Field int azh.ba>
		abyte0 = ((byte []) (a));
	//  162  302:aload_0         
	//  163  303:getfield        #12  <Field azh a>
	//  164  306:astore_1        
		abyte0.ap = ((azh) (abyte0)).ab | a.ba;
	//  165  307:aload_1         
	//  166  308:aload_1         
	//  167  309:getfield        #38  <Field int azh.ab>
	//  168  312:aload_0         
	//  169  313:getfield        #12  <Field azh a>
	//  170  316:getfield        #65  <Field int azh.ba>
	//  171  319:ior             
	//  172  320:putfield        #68  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	//  173  323:aload_0         
	//  174  324:getfield        #12  <Field azh a>
	//  175  327:astore_1        
		abyte0.ap = ((azh) (abyte0)).aZ ^ a.ap;
	//  176  328:aload_1         
	//  177  329:aload_1         
	//  178  330:getfield        #41  <Field int azh.aZ>
	//  179  333:aload_0         
	//  180  334:getfield        #12  <Field azh a>
	//  181  337:getfield        #68  <Field int azh.ap>
	//  182  340:ixor            
	//  183  341:putfield        #68  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	//  184  344:aload_0         
	//  185  345:getfield        #12  <Field azh a>
	//  186  348:astore_1        
		abyte0.ci = ((azh) (abyte0)).bJ & ~a.ab;
	//  187  349:aload_1         
	//  188  350:aload_1         
	//  189  351:getfield        #53  <Field int azh.bJ>
	//  190  354:aload_0         
	//  191  355:getfield        #12  <Field azh a>
	//  192  358:getfield        #38  <Field int azh.ab>
	//  193  361:iconst_m1       
	//  194  362:ixor            
	//  195  363:iand            
	//  196  364:putfield        #71  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	//  197  367:aload_0         
	//  198  368:getfield        #12  <Field azh a>
	//  199  371:astore_1        
		abyte0.ci = ((azh) (abyte0)).T ^ a.ci;
	//  200  372:aload_1         
	//  201  373:aload_1         
	//  202  374:getfield        #29  <Field int azh.T>
	//  203  377:aload_0         
	//  204  378:getfield        #12  <Field azh a>
	//  205  381:getfield        #71  <Field int azh.ci>
	//  206  384:ixor            
	//  207  385:putfield        #71  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	//  208  388:aload_0         
	//  209  389:getfield        #12  <Field azh a>
	//  210  392:astore_1        
		abyte0.bz = ((azh) (abyte0)).bJ & ~a.ab;
	//  211  393:aload_1         
	//  212  394:aload_1         
	//  213  395:getfield        #53  <Field int azh.bJ>
	//  214  398:aload_0         
	//  215  399:getfield        #12  <Field azh a>
	//  216  402:getfield        #38  <Field int azh.ab>
	//  217  405:iconst_m1       
	//  218  406:ixor            
	//  219  407:iand            
	//  220  408:putfield        #74  <Field int azh.bz>
		abyte0 = ((byte []) (a));
	//  221  411:aload_0         
	//  222  412:getfield        #12  <Field azh a>
	//  223  415:astore_1        
		abyte0.bz = ((azh) (abyte0)).D ^ a.bz;
	//  224  416:aload_1         
	//  225  417:aload_1         
	//  226  418:getfield        #26  <Field int azh.D>
	//  227  421:aload_0         
	//  228  422:getfield        #12  <Field azh a>
	//  229  425:getfield        #74  <Field int azh.bz>
	//  230  428:ixor            
	//  231  429:putfield        #74  <Field int azh.bz>
		abyte0 = ((byte []) (a));
	//  232  432:aload_0         
	//  233  433:getfield        #12  <Field azh a>
	//  234  436:astore_1        
		abyte0.aE = ((azh) (abyte0)).aE & ~a.I;
	//  235  437:aload_1         
	//  236  438:aload_1         
	//  237  439:getfield        #77  <Field int azh.aE>
	//  238  442:aload_0         
	//  239  443:getfield        #12  <Field azh a>
	//  240  446:getfield        #79  <Field int azh.I>
	//  241  449:iconst_m1       
	//  242  450:ixor            
	//  243  451:iand            
	//  244  452:putfield        #77  <Field int azh.aE>
		abyte0 = ((byte []) (a));
	//  245  455:aload_0         
	//  246  456:getfield        #12  <Field azh a>
	//  247  459:astore_1        
		abyte0.aE = ((azh) (abyte0)).aV ^ a.aE;
	//  248  460:aload_1         
	//  249  461:aload_1         
	//  250  462:getfield        #82  <Field int azh.aV>
	//  251  465:aload_0         
	//  252  466:getfield        #12  <Field azh a>
	//  253  469:getfield        #77  <Field int azh.aE>
	//  254  472:ixor            
	//  255  473:putfield        #77  <Field int azh.aE>
		abyte0 = ((byte []) (a));
	//  256  476:aload_0         
	//  257  477:getfield        #12  <Field azh a>
	//  258  480:astore_1        
		abyte0.au = ((azh) (abyte0)).I | a.au;
	//  259  481:aload_1         
	//  260  482:aload_1         
	//  261  483:getfield        #79  <Field int azh.I>
	//  262  486:aload_0         
	//  263  487:getfield        #12  <Field azh a>
	//  264  490:getfield        #85  <Field int azh.au>
	//  265  493:ior             
	//  266  494:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	//  267  497:aload_0         
	//  268  498:getfield        #12  <Field azh a>
	//  269  501:astore_1        
		abyte0.au = ((azh) (abyte0)).aW ^ a.au;
	//  270  502:aload_1         
	//  271  503:aload_1         
	//  272  504:getfield        #88  <Field int azh.aW>
	//  273  507:aload_0         
	//  274  508:getfield        #12  <Field azh a>
	//  275  511:getfield        #85  <Field int azh.au>
	//  276  514:ixor            
	//  277  515:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	//  278  518:aload_0         
	//  279  519:getfield        #12  <Field azh a>
	//  280  522:astore_1        
		abyte0.au = ((azh) (abyte0)).Y & ~a.au;
	//  281  523:aload_1         
	//  282  524:aload_1         
	//  283  525:getfield        #91  <Field int azh.Y>
	//  284  528:aload_0         
	//  285  529:getfield        #12  <Field azh a>
	//  286  532:getfield        #85  <Field int azh.au>
	//  287  535:iconst_m1       
	//  288  536:ixor            
	//  289  537:iand            
	//  290  538:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	//  291  541:aload_0         
	//  292  542:getfield        #12  <Field azh a>
	//  293  545:astore_1        
		abyte0.au = ((azh) (abyte0)).aE ^ a.au;
	//  294  546:aload_1         
	//  295  547:aload_1         
	//  296  548:getfield        #77  <Field int azh.aE>
	//  297  551:aload_0         
	//  298  552:getfield        #12  <Field azh a>
	//  299  555:getfield        #85  <Field int azh.au>
	//  300  558:ixor            
	//  301  559:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	//  302  562:aload_0         
	//  303  563:getfield        #12  <Field azh a>
	//  304  566:astore_1        
		abyte0.h = ((azh) (abyte0)).au ^ a.h;
	//  305  567:aload_1         
	//  306  568:aload_1         
	//  307  569:getfield        #85  <Field int azh.au>
	//  308  572:aload_0         
	//  309  573:getfield        #12  <Field azh a>
	//  310  576:getfield        #94  <Field int azh.h>
	//  311  579:ixor            
	//  312  580:putfield        #94  <Field int azh.h>
		abyte0 = ((byte []) (a));
	//  313  583:aload_0         
	//  314  584:getfield        #12  <Field azh a>
	//  315  587:astore_1        
		abyte0.au = ((azh) (abyte0)).A & a.I;
	//  316  588:aload_1         
	//  317  589:aload_1         
	//  318  590:getfield        #97  <Field int azh.A>
	//  319  593:aload_0         
	//  320  594:getfield        #12  <Field azh a>
	//  321  597:getfield        #79  <Field int azh.I>
	//  322  600:iand            
	//  323  601:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	//  324  604:aload_0         
	//  325  605:getfield        #12  <Field azh a>
	//  326  608:astore_1        
		abyte0.au = ((azh) (abyte0)).c ^ a.au;
	//  327  609:aload_1         
	//  328  610:aload_1         
	//  329  611:getfield        #100 <Field int azh.c>
	//  330  614:aload_0         
	//  331  615:getfield        #12  <Field azh a>
	//  332  618:getfield        #85  <Field int azh.au>
	//  333  621:ixor            
	//  334  622:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	//  335  625:aload_0         
	//  336  626:getfield        #12  <Field azh a>
	//  337  629:astore_1        
		abyte0.bD = ((azh) (abyte0)).au ^ a.bD;
	//  338  630:aload_1         
	//  339  631:aload_1         
	//  340  632:getfield        #85  <Field int azh.au>
	//  341  635:aload_0         
	//  342  636:getfield        #12  <Field azh a>
	//  343  639:getfield        #103 <Field int azh.bD>
	//  344  642:ixor            
	//  345  643:putfield        #103 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	//  346  646:aload_0         
	//  347  647:getfield        #12  <Field azh a>
	//  348  650:astore_1        
		abyte0.av = ((azh) (abyte0)).bD ^ a.av;
	//  349  651:aload_1         
	//  350  652:aload_1         
	//  351  653:getfield        #103 <Field int azh.bD>
	//  352  656:aload_0         
	//  353  657:getfield        #12  <Field azh a>
	//  354  660:getfield        #106 <Field int azh.av>
	//  355  663:ixor            
	//  356  664:putfield        #106 <Field int azh.av>
		abyte0 = ((byte []) (a));
	//  357  667:aload_0         
	//  358  668:getfield        #12  <Field azh a>
	//  359  671:astore_1        
		abyte0.aH = ((azh) (abyte0)).av ^ a.aH;
	//  360  672:aload_1         
	//  361  673:aload_1         
	//  362  674:getfield        #106 <Field int azh.av>
	//  363  677:aload_0         
	//  364  678:getfield        #12  <Field azh a>
	//  365  681:getfield        #109 <Field int azh.aH>
	//  366  684:ixor            
	//  367  685:putfield        #109 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	//  368  688:aload_0         
	//  369  689:getfield        #12  <Field azh a>
	//  370  692:astore_1        
		abyte0.z = ((azh) (abyte0)).aH ^ a.z;
	//  371  693:aload_1         
	//  372  694:aload_1         
	//  373  695:getfield        #109 <Field int azh.aH>
	//  374  698:aload_0         
	//  375  699:getfield        #12  <Field azh a>
	//  376  702:getfield        #112 <Field int azh.z>
	//  377  705:ixor            
	//  378  706:putfield        #112 <Field int azh.z>
		abyte0 = ((byte []) (a));
	//  379  709:aload_0         
	//  380  710:getfield        #12  <Field azh a>
	//  381  713:astore_1        
		abyte0.aH = ((azh) (abyte0)).r & ~a.z;
	//  382  714:aload_1         
	//  383  715:aload_1         
	//  384  716:getfield        #115 <Field int azh.r>
	//  385  719:aload_0         
	//  386  720:getfield        #12  <Field azh a>
	//  387  723:getfield        #112 <Field int azh.z>
	//  388  726:iconst_m1       
	//  389  727:ixor            
	//  390  728:iand            
	//  391  729:putfield        #109 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	//  392  732:aload_0         
	//  393  733:getfield        #12  <Field azh a>
	//  394  736:astore_1        
		abyte0.av = ((azh) (abyte0)).z | a.r;
	//  395  737:aload_1         
	//  396  738:aload_1         
	//  397  739:getfield        #112 <Field int azh.z>
	//  398  742:aload_0         
	//  399  743:getfield        #12  <Field azh a>
	//  400  746:getfield        #115 <Field int azh.r>
	//  401  749:ior             
	//  402  750:putfield        #106 <Field int azh.av>
		abyte0 = ((byte []) (a));
	//  403  753:aload_0         
	//  404  754:getfield        #12  <Field azh a>
	//  405  757:astore_1        
		abyte0.bD = ((azh) (abyte0)).z | a.r;
	//  406  758:aload_1         
	//  407  759:aload_1         
	//  408  760:getfield        #112 <Field int azh.z>
	//  409  763:aload_0         
	//  410  764:getfield        #12  <Field azh a>
	//  411  767:getfield        #115 <Field int azh.r>
	//  412  770:ior             
	//  413  771:putfield        #103 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	//  414  774:aload_0         
	//  415  775:getfield        #12  <Field azh a>
	//  416  778:astore_1        
		abyte0.bD = ((azh) (abyte0)).r ^ a.bD;
	//  417  779:aload_1         
	//  418  780:aload_1         
	//  419  781:getfield        #115 <Field int azh.r>
	//  420  784:aload_0         
	//  421  785:getfield        #12  <Field azh a>
	//  422  788:getfield        #103 <Field int azh.bD>
	//  423  791:ixor            
	//  424  792:putfield        #103 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	//  425  795:aload_0         
	//  426  796:getfield        #12  <Field azh a>
	//  427  799:astore_1        
		abyte0.bD = ((azh) (abyte0)).H & ~a.bD;
	//  428  800:aload_1         
	//  429  801:aload_1         
	//  430  802:getfield        #118 <Field int azh.H>
	//  431  805:aload_0         
	//  432  806:getfield        #12  <Field azh a>
	//  433  809:getfield        #103 <Field int azh.bD>
	//  434  812:iconst_m1       
	//  435  813:ixor            
	//  436  814:iand            
	//  437  815:putfield        #103 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	//  438  818:aload_0         
	//  439  819:getfield        #12  <Field azh a>
	//  440  822:astore_1        
		abyte0.bD = ((azh) (abyte0)).bD & ~a.j;
	//  441  823:aload_1         
	//  442  824:aload_1         
	//  443  825:getfield        #103 <Field int azh.bD>
	//  444  828:aload_0         
	//  445  829:getfield        #12  <Field azh a>
	//  446  832:getfield        #121 <Field int azh.j>
	//  447  835:iconst_m1       
	//  448  836:ixor            
	//  449  837:iand            
	//  450  838:putfield        #103 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	//  451  841:aload_0         
	//  452  842:getfield        #12  <Field azh a>
	//  453  845:astore_1        
		abyte0.bc = ((azh) (abyte0)).z | a.bc;
	//  454  846:aload_1         
	//  455  847:aload_1         
	//  456  848:getfield        #112 <Field int azh.z>
	//  457  851:aload_0         
	//  458  852:getfield        #12  <Field azh a>
	//  459  855:getfield        #124 <Field int azh.bc>
	//  460  858:ior             
	//  461  859:putfield        #124 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	//  462  862:aload_0         
	//  463  863:getfield        #12  <Field azh a>
	//  464  866:astore_1        
		abyte0.bn = ((azh) (abyte0)).bn & ~a.I;
	//  465  867:aload_1         
	//  466  868:aload_1         
	//  467  869:getfield        #127 <Field int azh.bn>
	//  468  872:aload_0         
	//  469  873:getfield        #12  <Field azh a>
	//  470  876:getfield        #79  <Field int azh.I>
	//  471  879:iconst_m1       
	//  472  880:ixor            
	//  473  881:iand            
	//  474  882:putfield        #127 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	//  475  885:aload_0         
	//  476  886:getfield        #12  <Field azh a>
	//  477  889:astore_1        
		abyte0.bn = ((azh) (abyte0)).bZ ^ a.bn;
	//  478  890:aload_1         
	//  479  891:aload_1         
	//  480  892:getfield        #130 <Field int azh.bZ>
	//  481  895:aload_0         
	//  482  896:getfield        #12  <Field azh a>
	//  483  899:getfield        #127 <Field int azh.bn>
	//  484  902:ixor            
	//  485  903:putfield        #127 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	//  486  906:aload_0         
	//  487  907:getfield        #12  <Field azh a>
	//  488  910:astore_1        
		abyte0.bC = ((azh) (abyte0)).bn ^ a.bC;
	//  489  911:aload_1         
	//  490  912:aload_1         
	//  491  913:getfield        #127 <Field int azh.bn>
	//  492  916:aload_0         
	//  493  917:getfield        #12  <Field azh a>
	//  494  920:getfield        #133 <Field int azh.bC>
	//  495  923:ixor            
	//  496  924:putfield        #133 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	//  497  927:aload_0         
	//  498  928:getfield        #12  <Field azh a>
	//  499  931:astore_1        
		abyte0.af = ((azh) (abyte0)).bC ^ a.af;
	//  500  932:aload_1         
	//  501  933:aload_1         
	//  502  934:getfield        #133 <Field int azh.bC>
	//  503  937:aload_0         
	//  504  938:getfield        #12  <Field azh a>
	//  505  941:getfield        #136 <Field int azh.af>
	//  506  944:ixor            
	//  507  945:putfield        #136 <Field int azh.af>
		abyte0 = ((byte []) (a));
	//  508  948:aload_0         
	//  509  949:getfield        #12  <Field azh a>
	//  510  952:astore_1        
		abyte0.bC = ((azh) (abyte0)).af & a.P;
	//  511  953:aload_1         
	//  512  954:aload_1         
	//  513  955:getfield        #136 <Field int azh.af>
	//  514  958:aload_0         
	//  515  959:getfield        #12  <Field azh a>
	//  516  962:getfield        #139 <Field int azh.P>
	//  517  965:iand            
	//  518  966:putfield        #133 <Field int azh.bC>
		abyte0 = ((byte []) (a));
	//  519  969:aload_0         
	//  520  970:getfield        #12  <Field azh a>
	//  521  973:astore_1        
		abyte0.bR = ((azh) (abyte0)).bC ^ a.bR;
	//  522  974:aload_1         
	//  523  975:aload_1         
	//  524  976:getfield        #133 <Field int azh.bC>
	//  525  979:aload_0         
	//  526  980:getfield        #12  <Field azh a>
	//  527  983:getfield        #142 <Field int azh.bR>
	//  528  986:ixor            
	//  529  987:putfield        #142 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	//  530  990:aload_0         
	//  531  991:getfield        #12  <Field azh a>
	//  532  994:astore_1        
		abyte0.bR = ((azh) (abyte0)).bR | a.d;
	//  533  995:aload_1         
	//  534  996:aload_1         
	//  535  997:getfield        #142 <Field int azh.bR>
	//  536 1000:aload_0         
	//  537 1001:getfield        #12  <Field azh a>
	//  538 1004:getfield        #145 <Field int azh.d>
	//  539 1007:ior             
	//  540 1008:putfield        #142 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	//  541 1011:aload_0         
	//  542 1012:getfield        #12  <Field azh a>
	//  543 1015:astore_1        
		abyte0.bR = ((azh) (abyte0)).af ^ a.bR;
	//  544 1016:aload_1         
	//  545 1017:aload_1         
	//  546 1018:getfield        #136 <Field int azh.af>
	//  547 1021:aload_0         
	//  548 1022:getfield        #12  <Field azh a>
	//  549 1025:getfield        #142 <Field int azh.bR>
	//  550 1028:ixor            
	//  551 1029:putfield        #142 <Field int azh.bR>
		abyte0 = ((byte []) (a));
	//  552 1032:aload_0         
	//  553 1033:getfield        #12  <Field azh a>
	//  554 1036:astore_1        
		abyte0.bn = ((azh) (abyte0)).H & a.bC;
	//  555 1037:aload_1         
	//  556 1038:aload_1         
	//  557 1039:getfield        #118 <Field int azh.H>
	//  558 1042:aload_0         
	//  559 1043:getfield        #12  <Field azh a>
	//  560 1046:getfield        #133 <Field int azh.bC>
	//  561 1049:iand            
	//  562 1050:putfield        #127 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	//  563 1053:aload_0         
	//  564 1054:getfield        #12  <Field azh a>
	//  565 1057:astore_1        
		abyte0.bn = ((azh) (abyte0)).bC ^ a.bn;
	//  566 1058:aload_1         
	//  567 1059:aload_1         
	//  568 1060:getfield        #133 <Field int azh.bC>
	//  569 1063:aload_0         
	//  570 1064:getfield        #12  <Field azh a>
	//  571 1067:getfield        #127 <Field int azh.bn>
	//  572 1070:ixor            
	//  573 1071:putfield        #127 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	//  574 1074:aload_0         
	//  575 1075:getfield        #12  <Field azh a>
	//  576 1078:astore_1        
		abyte0.aY = ((azh) (abyte0)).bn ^ a.aY;
	//  577 1079:aload_1         
	//  578 1080:aload_1         
	//  579 1081:getfield        #127 <Field int azh.bn>
	//  580 1084:aload_0         
	//  581 1085:getfield        #12  <Field azh a>
	//  582 1088:getfield        #148 <Field int azh.aY>
	//  583 1091:ixor            
	//  584 1092:putfield        #148 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	//  585 1095:aload_0         
	//  586 1096:getfield        #12  <Field azh a>
	//  587 1099:astore_1        
		abyte0.aY = ((azh) (abyte0)).z | a.aY;
	//  588 1100:aload_1         
	//  589 1101:aload_1         
	//  590 1102:getfield        #112 <Field int azh.z>
	//  591 1105:aload_0         
	//  592 1106:getfield        #12  <Field azh a>
	//  593 1109:getfield        #148 <Field int azh.aY>
	//  594 1112:ior             
	//  595 1113:putfield        #148 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	//  596 1116:aload_0         
	//  597 1117:getfield        #12  <Field azh a>
	//  598 1120:astore_1        
		abyte0.bn = ((azh) (abyte0)).P & ~a.bC;
	//  599 1121:aload_1         
	//  600 1122:aload_1         
	//  601 1123:getfield        #139 <Field int azh.P>
	//  602 1126:aload_0         
	//  603 1127:getfield        #12  <Field azh a>
	//  604 1130:getfield        #133 <Field int azh.bC>
	//  605 1133:iconst_m1       
	//  606 1134:ixor            
	//  607 1135:iand            
	//  608 1136:putfield        #127 <Field int azh.bn>
		abyte0 = ((byte []) (a));
	//  609 1139:aload_0         
	//  610 1140:getfield        #12  <Field azh a>
	//  611 1143:astore_1        
		abyte0.bZ = ((azh) (abyte0)).H & ~a.bn;
	//  612 1144:aload_1         
	//  613 1145:aload_1         
	//  614 1146:getfield        #118 <Field int azh.H>
	//  615 1149:aload_0         
	//  616 1150:getfield        #12  <Field azh a>
	//  617 1153:getfield        #127 <Field int azh.bn>
	//  618 1156:iconst_m1       
	//  619 1157:ixor            
	//  620 1158:iand            
	//  621 1159:putfield        #130 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	//  622 1162:aload_0         
	//  623 1163:getfield        #12  <Field azh a>
	//  624 1166:astore_1        
		abyte0.au = ((azh) (abyte0)).H & ~a.bn;
	//  625 1167:aload_1         
	//  626 1168:aload_1         
	//  627 1169:getfield        #118 <Field int azh.H>
	//  628 1172:aload_0         
	//  629 1173:getfield        #12  <Field azh a>
	//  630 1176:getfield        #127 <Field int azh.bn>
	//  631 1179:iconst_m1       
	//  632 1180:ixor            
	//  633 1181:iand            
	//  634 1182:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	//  635 1185:aload_0         
	//  636 1186:getfield        #12  <Field azh a>
	//  637 1189:astore_1        
		abyte0.au = ((azh) (abyte0)).d & ~a.au;
	//  638 1190:aload_1         
	//  639 1191:aload_1         
	//  640 1192:getfield        #145 <Field int azh.d>
	//  641 1195:aload_0         
	//  642 1196:getfield        #12  <Field azh a>
	//  643 1199:getfield        #85  <Field int azh.au>
	//  644 1202:iconst_m1       
	//  645 1203:ixor            
	//  646 1204:iand            
	//  647 1205:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	//  648 1208:aload_0         
	//  649 1209:getfield        #12  <Field azh a>
	//  650 1212:astore_1        
		abyte0.aE = ((azh) (abyte0)).bn ^ a.H;
	//  651 1213:aload_1         
	//  652 1214:aload_1         
	//  653 1215:getfield        #127 <Field int azh.bn>
	//  654 1218:aload_0         
	//  655 1219:getfield        #12  <Field azh a>
	//  656 1222:getfield        #118 <Field int azh.H>
	//  657 1225:ixor            
	//  658 1226:putfield        #77  <Field int azh.aE>
		abyte0 = ((byte []) (a));
	//  659 1229:aload_0         
	//  660 1230:getfield        #12  <Field azh a>
	//  661 1233:astore_1        
		abyte0.aW = ((azh) (abyte0)).P & ~a.af;
	//  662 1234:aload_1         
	//  663 1235:aload_1         
	//  664 1236:getfield        #139 <Field int azh.P>
	//  665 1239:aload_0         
	//  666 1240:getfield        #12  <Field azh a>
	//  667 1243:getfield        #136 <Field int azh.af>
	//  668 1246:iconst_m1       
	//  669 1247:ixor            
	//  670 1248:iand            
	//  671 1249:putfield        #88  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	//  672 1252:aload_0         
	//  673 1253:getfield        #12  <Field azh a>
	//  674 1256:astore_1        
		abyte0.aW = ((azh) (abyte0)).H & a.aW;
	//  675 1257:aload_1         
	//  676 1258:aload_1         
	//  677 1259:getfield        #118 <Field int azh.H>
	//  678 1262:aload_0         
	//  679 1263:getfield        #12  <Field azh a>
	//  680 1266:getfield        #88  <Field int azh.aW>
	//  681 1269:iand            
	//  682 1270:putfield        #88  <Field int azh.aW>
		abyte0 = ((byte []) (a));
	//  683 1273:aload_0         
	//  684 1274:getfield        #12  <Field azh a>
	//  685 1277:astore_1        
		abyte0.aV = ((azh) (abyte0)).d & ~a.aW;
	//  686 1278:aload_1         
	//  687 1279:aload_1         
	//  688 1280:getfield        #145 <Field int azh.d>
	//  689 1283:aload_0         
	//  690 1284:getfield        #12  <Field azh a>
	//  691 1287:getfield        #88  <Field int azh.aW>
	//  692 1290:iconst_m1       
	//  693 1291:ixor            
	//  694 1292:iand            
	//  695 1293:putfield        #82  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	//  696 1296:aload_0         
	//  697 1297:getfield        #12  <Field azh a>
	//  698 1300:astore_1        
		abyte0.bp = ((azh) (abyte0)).af ^ a.bp;
	//  699 1301:aload_1         
	//  700 1302:aload_1         
	//  701 1303:getfield        #136 <Field int azh.af>
	//  702 1306:aload_0         
	//  703 1307:getfield        #12  <Field azh a>
	//  704 1310:getfield        #151 <Field int azh.bp>
	//  705 1313:ixor            
	//  706 1314:putfield        #151 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	//  707 1317:aload_0         
	//  708 1318:getfield        #12  <Field azh a>
	//  709 1321:astore_1        
		abyte0.aw = ((azh) (abyte0)).bp | a.d;
	//  710 1322:aload_1         
	//  711 1323:aload_1         
	//  712 1324:getfield        #151 <Field int azh.bp>
	//  713 1327:aload_0         
	//  714 1328:getfield        #12  <Field azh a>
	//  715 1331:getfield        #145 <Field int azh.d>
	//  716 1334:ior             
	//  717 1335:putfield        #154 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	//  718 1338:aload_0         
	//  719 1339:getfield        #12  <Field azh a>
	//  720 1342:astore_1        
		abyte0.aw = ((azh) (abyte0)).z | a.aw;
	//  721 1343:aload_1         
	//  722 1344:aload_1         
	//  723 1345:getfield        #112 <Field int azh.z>
	//  724 1348:aload_0         
	//  725 1349:getfield        #12  <Field azh a>
	//  726 1352:getfield        #154 <Field int azh.aw>
	//  727 1355:ior             
	//  728 1356:putfield        #154 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	//  729 1359:aload_0         
	//  730 1360:getfield        #12  <Field azh a>
	//  731 1363:astore_1        
		abyte0.aw = ((azh) (abyte0)).bp ^ a.aw;
	//  732 1364:aload_1         
	//  733 1365:aload_1         
	//  734 1366:getfield        #151 <Field int azh.bp>
	//  735 1369:aload_0         
	//  736 1370:getfield        #12  <Field azh a>
	//  737 1373:getfield        #154 <Field int azh.aw>
	//  738 1376:ixor            
	//  739 1377:putfield        #154 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	//  740 1380:aload_0         
	//  741 1381:getfield        #12  <Field azh a>
	//  742 1384:astore_1        
		abyte0.aw = ((azh) (abyte0)).X | a.aw;
	//  743 1385:aload_1         
	//  744 1386:aload_1         
	//  745 1387:getfield        #157 <Field int azh.X>
	//  746 1390:aload_0         
	//  747 1391:getfield        #12  <Field azh a>
	//  748 1394:getfield        #154 <Field int azh.aw>
	//  749 1397:ior             
	//  750 1398:putfield        #154 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	//  751 1401:aload_0         
	//  752 1402:getfield        #12  <Field azh a>
	//  753 1405:astore_1        
		abyte0.bp = ((azh) (abyte0)).H & a.af;
	//  754 1406:aload_1         
	//  755 1407:aload_1         
	//  756 1408:getfield        #118 <Field int azh.H>
	//  757 1411:aload_0         
	//  758 1412:getfield        #12  <Field azh a>
	//  759 1415:getfield        #136 <Field int azh.af>
	//  760 1418:iand            
	//  761 1419:putfield        #151 <Field int azh.bp>
		abyte0 = ((byte []) (a));
	//  762 1422:aload_0         
	//  763 1423:getfield        #12  <Field azh a>
	//  764 1426:astore_1        
		abyte0.ae = ((azh) (abyte0)).bp & ~a.d;
	//  765 1427:aload_1         
	//  766 1428:aload_1         
	//  767 1429:getfield        #151 <Field int azh.bp>
	//  768 1432:aload_0         
	//  769 1433:getfield        #12  <Field azh a>
	//  770 1436:getfield        #145 <Field int azh.d>
	//  771 1439:iconst_m1       
	//  772 1440:ixor            
	//  773 1441:iand            
	//  774 1442:putfield        #160 <Field int azh.ae>
		abyte0 = ((byte []) (a));
	//  775 1445:aload_0         
	//  776 1446:getfield        #12  <Field azh a>
	//  777 1449:astore_1        
		abyte0.bu = ((azh) (abyte0)).af & ~a.P;
	//  778 1450:aload_1         
	//  779 1451:aload_1         
	//  780 1452:getfield        #136 <Field int azh.af>
	//  781 1455:aload_0         
	//  782 1456:getfield        #12  <Field azh a>
	//  783 1459:getfield        #139 <Field int azh.P>
	//  784 1462:iconst_m1       
	//  785 1463:ixor            
	//  786 1464:iand            
	//  787 1465:putfield        #163 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	//  788 1468:aload_0         
	//  789 1469:getfield        #12  <Field azh a>
	//  790 1472:astore_1        
		abyte0.bY = ((azh) (abyte0)).bu ^ a.bY;
	//  791 1473:aload_1         
	//  792 1474:aload_1         
	//  793 1475:getfield        #163 <Field int azh.bu>
	//  794 1478:aload_0         
	//  795 1479:getfield        #12  <Field azh a>
	//  796 1482:getfield        #166 <Field int azh.bY>
	//  797 1485:ixor            
	//  798 1486:putfield        #166 <Field int azh.bY>
		abyte0 = ((byte []) (a));
	//  799 1489:aload_0         
	//  800 1490:getfield        #12  <Field azh a>
	//  801 1493:astore_1        
		abyte0.bu = ((azh) (abyte0)).d & a.bY;
	//  802 1494:aload_1         
	//  803 1495:aload_1         
	//  804 1496:getfield        #145 <Field int azh.d>
	//  805 1499:aload_0         
	//  806 1500:getfield        #12  <Field azh a>
	//  807 1503:getfield        #166 <Field int azh.bY>
	//  808 1506:iand            
	//  809 1507:putfield        #163 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	//  810 1510:aload_0         
	//  811 1511:getfield        #12  <Field azh a>
	//  812 1514:astore_1        
		abyte0.bu = ((azh) (abyte0)).z | a.bu;
	//  813 1515:aload_1         
	//  814 1516:aload_1         
	//  815 1517:getfield        #112 <Field int azh.z>
	//  816 1520:aload_0         
	//  817 1521:getfield        #12  <Field azh a>
	//  818 1524:getfield        #163 <Field int azh.bu>
	//  819 1527:ior             
	//  820 1528:putfield        #163 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	//  821 1531:aload_0         
	//  822 1532:getfield        #12  <Field azh a>
	//  823 1535:astore_1        
		abyte0.bI = ((azh) (abyte0)).af | a.P;
	//  824 1536:aload_1         
	//  825 1537:aload_1         
	//  826 1538:getfield        #136 <Field int azh.af>
	//  827 1541:aload_0         
	//  828 1542:getfield        #12  <Field azh a>
	//  829 1545:getfield        #139 <Field int azh.P>
	//  830 1548:ior             
	//  831 1549:putfield        #169 <Field int azh.bI>
		abyte0 = ((byte []) (a));
	//  832 1552:aload_0         
	//  833 1553:getfield        #12  <Field azh a>
	//  834 1556:astore_1        
		abyte0.ao = ((azh) (abyte0)).bI ^ a.ao;
	//  835 1557:aload_1         
	//  836 1558:aload_1         
	//  837 1559:getfield        #169 <Field int azh.bI>
	//  838 1562:aload_0         
	//  839 1563:getfield        #12  <Field azh a>
	//  840 1566:getfield        #172 <Field int azh.ao>
	//  841 1569:ixor            
	//  842 1570:putfield        #172 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	//  843 1573:aload_0         
	//  844 1574:getfield        #12  <Field azh a>
	//  845 1577:astore_1        
		abyte0.au = ((azh) (abyte0)).ao ^ a.au;
	//  846 1578:aload_1         
	//  847 1579:aload_1         
	//  848 1580:getfield        #172 <Field int azh.ao>
	//  849 1583:aload_0         
	//  850 1584:getfield        #12  <Field azh a>
	//  851 1587:getfield        #85  <Field int azh.au>
	//  852 1590:ixor            
	//  853 1591:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	//  854 1594:aload_0         
	//  855 1595:getfield        #12  <Field azh a>
	//  856 1598:astore_1        
		abyte0.aY = ((azh) (abyte0)).au ^ a.aY;
	//  857 1599:aload_1         
	//  858 1600:aload_1         
	//  859 1601:getfield        #85  <Field int azh.au>
	//  860 1604:aload_0         
	//  861 1605:getfield        #12  <Field azh a>
	//  862 1608:getfield        #148 <Field int azh.aY>
	//  863 1611:ixor            
	//  864 1612:putfield        #148 <Field int azh.aY>
		abyte0 = ((byte []) (a));
	//  865 1615:aload_0         
	//  866 1616:getfield        #12  <Field azh a>
	//  867 1619:astore_1        
		abyte0.aV = ((azh) (abyte0)).bI ^ a.aV;
	//  868 1620:aload_1         
	//  869 1621:aload_1         
	//  870 1622:getfield        #169 <Field int azh.bI>
	//  871 1625:aload_0         
	//  872 1626:getfield        #12  <Field azh a>
	//  873 1629:getfield        #82  <Field int azh.aV>
	//  874 1632:ixor            
	//  875 1633:putfield        #82  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	//  876 1636:aload_0         
	//  877 1637:getfield        #12  <Field azh a>
	//  878 1640:astore_1        
		abyte0.aV = ((azh) (abyte0)).aV & ~a.z;
	//  879 1641:aload_1         
	//  880 1642:aload_1         
	//  881 1643:getfield        #82  <Field int azh.aV>
	//  882 1646:aload_0         
	//  883 1647:getfield        #12  <Field azh a>
	//  884 1650:getfield        #112 <Field int azh.z>
	//  885 1653:iconst_m1       
	//  886 1654:ixor            
	//  887 1655:iand            
	//  888 1656:putfield        #82  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	//  889 1659:aload_0         
	//  890 1660:getfield        #12  <Field azh a>
	//  891 1663:astore_1        
		abyte0.au = ((azh) (abyte0)).d & ~a.af;
	//  892 1664:aload_1         
	//  893 1665:aload_1         
	//  894 1666:getfield        #145 <Field int azh.d>
	//  895 1669:aload_0         
	//  896 1670:getfield        #12  <Field azh a>
	//  897 1673:getfield        #136 <Field int azh.af>
	//  898 1676:iconst_m1       
	//  899 1677:ixor            
	//  900 1678:iand            
	//  901 1679:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	//  902 1682:aload_0         
	//  903 1683:getfield        #12  <Field azh a>
	//  904 1686:astore_1        
		abyte0.ao = ((azh) (abyte0)).af ^ a.P;
	//  905 1687:aload_1         
	//  906 1688:aload_1         
	//  907 1689:getfield        #136 <Field int azh.af>
	//  908 1692:aload_0         
	//  909 1693:getfield        #12  <Field azh a>
	//  910 1696:getfield        #139 <Field int azh.P>
	//  911 1699:ixor            
	//  912 1700:putfield        #172 <Field int azh.ao>
		abyte0 = ((byte []) (a));
	//  913 1703:aload_0         
	//  914 1704:getfield        #12  <Field azh a>
	//  915 1707:astore_1        
		abyte0.aD = ((azh) (abyte0)).H & a.ao;
	//  916 1708:aload_1         
	//  917 1709:aload_1         
	//  918 1710:getfield        #118 <Field int azh.H>
	//  919 1713:aload_0         
	//  920 1714:getfield        #12  <Field azh a>
	//  921 1717:getfield        #172 <Field int azh.ao>
	//  922 1720:iand            
	//  923 1721:putfield        #175 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	//  924 1724:aload_0         
	//  925 1725:getfield        #12  <Field azh a>
	//  926 1728:astore_1        
		abyte0.aD = ((azh) (abyte0)).bn ^ a.aD;
	//  927 1729:aload_1         
	//  928 1730:aload_1         
	//  929 1731:getfield        #127 <Field int azh.bn>
	//  930 1734:aload_0         
	//  931 1735:getfield        #12  <Field azh a>
	//  932 1738:getfield        #175 <Field int azh.aD>
	//  933 1741:ixor            
	//  934 1742:putfield        #175 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	//  935 1745:aload_0         
	//  936 1746:getfield        #12  <Field azh a>
	//  937 1749:astore_1        
		abyte0.aD = ((azh) (abyte0)).d & ~a.aD;
	//  938 1750:aload_1         
	//  939 1751:aload_1         
	//  940 1752:getfield        #145 <Field int azh.d>
	//  941 1755:aload_0         
	//  942 1756:getfield        #12  <Field azh a>
	//  943 1759:getfield        #175 <Field int azh.aD>
	//  944 1762:iconst_m1       
	//  945 1763:ixor            
	//  946 1764:iand            
	//  947 1765:putfield        #175 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	//  948 1768:aload_0         
	//  949 1769:getfield        #12  <Field azh a>
	//  950 1772:astore_1        
		abyte0.aD = ((azh) (abyte0)).bp ^ a.aD;
	//  951 1773:aload_1         
	//  952 1774:aload_1         
	//  953 1775:getfield        #151 <Field int azh.bp>
	//  954 1778:aload_0         
	//  955 1779:getfield        #12  <Field azh a>
	//  956 1782:getfield        #175 <Field int azh.aD>
	//  957 1785:ixor            
	//  958 1786:putfield        #175 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	//  959 1789:aload_0         
	//  960 1790:getfield        #12  <Field azh a>
	//  961 1793:astore_1        
		abyte0.aD = ((azh) (abyte0)).aD & ~a.z;
	//  962 1794:aload_1         
	//  963 1795:aload_1         
	//  964 1796:getfield        #175 <Field int azh.aD>
	//  965 1799:aload_0         
	//  966 1800:getfield        #12  <Field azh a>
	//  967 1803:getfield        #112 <Field int azh.z>
	//  968 1806:iconst_m1       
	//  969 1807:ixor            
	//  970 1808:iand            
	//  971 1809:putfield        #175 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	//  972 1812:aload_0         
	//  973 1813:getfield        #12  <Field azh a>
	//  974 1816:astore_1        
		abyte0.aD = ((azh) (abyte0)).ae ^ a.aD;
	//  975 1817:aload_1         
	//  976 1818:aload_1         
	//  977 1819:getfield        #160 <Field int azh.ae>
	//  978 1822:aload_0         
	//  979 1823:getfield        #12  <Field azh a>
	//  980 1826:getfield        #175 <Field int azh.aD>
	//  981 1829:ixor            
	//  982 1830:putfield        #175 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	//  983 1833:aload_0         
	//  984 1834:getfield        #12  <Field azh a>
	//  985 1837:astore_1        
		abyte0.aD = ((azh) (abyte0)).X | a.aD;
	//  986 1838:aload_1         
	//  987 1839:aload_1         
	//  988 1840:getfield        #157 <Field int azh.X>
	//  989 1843:aload_0         
	//  990 1844:getfield        #12  <Field azh a>
	//  991 1847:getfield        #175 <Field int azh.aD>
	//  992 1850:ior             
	//  993 1851:putfield        #175 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	//  994 1854:aload_0         
	//  995 1855:getfield        #12  <Field azh a>
	//  996 1858:astore_1        
		abyte0.aD = ((azh) (abyte0)).aY ^ a.aD;
	//  997 1859:aload_1         
	//  998 1860:aload_1         
	//  999 1861:getfield        #148 <Field int azh.aY>
	// 1000 1864:aload_0         
	// 1001 1865:getfield        #12  <Field azh a>
	// 1002 1868:getfield        #175 <Field int azh.aD>
	// 1003 1871:ixor            
	// 1004 1872:putfield        #175 <Field int azh.aD>
		abyte0 = ((byte []) (a));
	// 1005 1875:aload_0         
	// 1006 1876:getfield        #12  <Field azh a>
	// 1007 1879:astore_1        
		abyte0.bb = ((azh) (abyte0)).aD ^ a.bb;
	// 1008 1880:aload_1         
	// 1009 1881:aload_1         
	// 1010 1882:getfield        #175 <Field int azh.aD>
	// 1011 1885:aload_0         
	// 1012 1886:getfield        #12  <Field azh a>
	// 1013 1889:getfield        #178 <Field int azh.bb>
	// 1014 1892:ixor            
	// 1015 1893:putfield        #178 <Field int azh.bb>
		abyte0 = ((byte []) (a));
	// 1016 1896:aload_0         
	// 1017 1897:getfield        #12  <Field azh a>
	// 1018 1900:astore_1        
		abyte0.bN = ((azh) (abyte0)).ao ^ a.bN;
	// 1019 1901:aload_1         
	// 1020 1902:aload_1         
	// 1021 1903:getfield        #172 <Field int azh.ao>
	// 1022 1906:aload_0         
	// 1023 1907:getfield        #12  <Field azh a>
	// 1024 1910:getfield        #181 <Field int azh.bN>
	// 1025 1913:ixor            
	// 1026 1914:putfield        #181 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 1027 1917:aload_0         
	// 1028 1918:getfield        #12  <Field azh a>
	// 1029 1921:astore_1        
		abyte0.bN = ((azh) (abyte0)).bN ^ a.d;
	// 1030 1922:aload_1         
	// 1031 1923:aload_1         
	// 1032 1924:getfield        #181 <Field int azh.bN>
	// 1033 1927:aload_0         
	// 1034 1928:getfield        #12  <Field azh a>
	// 1035 1931:getfield        #145 <Field int azh.d>
	// 1036 1934:ixor            
	// 1037 1935:putfield        #181 <Field int azh.bN>
		abyte0 = ((byte []) (a));
	// 1038 1938:aload_0         
	// 1039 1939:getfield        #12  <Field azh a>
	// 1040 1942:astore_1        
		abyte0.bZ = ((azh) (abyte0)).ao ^ a.bZ;
	// 1041 1943:aload_1         
	// 1042 1944:aload_1         
	// 1043 1945:getfield        #172 <Field int azh.ao>
	// 1044 1948:aload_0         
	// 1045 1949:getfield        #12  <Field azh a>
	// 1046 1952:getfield        #130 <Field int azh.bZ>
	// 1047 1955:ixor            
	// 1048 1956:putfield        #130 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 1049 1959:aload_0         
	// 1050 1960:getfield        #12  <Field azh a>
	// 1051 1963:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bZ & ~a.d;
	// 1052 1964:aload_1         
	// 1053 1965:aload_1         
	// 1054 1966:getfield        #130 <Field int azh.bZ>
	// 1055 1969:aload_0         
	// 1056 1970:getfield        #12  <Field azh a>
	// 1057 1973:getfield        #145 <Field int azh.d>
	// 1058 1976:iconst_m1       
	// 1059 1977:ixor            
	// 1060 1978:iand            
	// 1061 1979:putfield        #130 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 1062 1982:aload_0         
	// 1063 1983:getfield        #12  <Field azh a>
	// 1064 1986:astore_1        
		abyte0.bZ = ((azh) (abyte0)).aE ^ a.bZ;
	// 1065 1987:aload_1         
	// 1066 1988:aload_1         
	// 1067 1989:getfield        #77  <Field int azh.aE>
	// 1068 1992:aload_0         
	// 1069 1993:getfield        #12  <Field azh a>
	// 1070 1996:getfield        #130 <Field int azh.bZ>
	// 1071 1999:ixor            
	// 1072 2000:putfield        #130 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 1073 2003:aload_0         
	// 1074 2004:getfield        #12  <Field azh a>
	// 1075 2007:astore_1        
		abyte0.bc = ((azh) (abyte0)).bZ ^ a.bc;
	// 1076 2008:aload_1         
	// 1077 2009:aload_1         
	// 1078 2010:getfield        #130 <Field int azh.bZ>
	// 1079 2013:aload_0         
	// 1080 2014:getfield        #12  <Field azh a>
	// 1081 2017:getfield        #124 <Field int azh.bc>
	// 1082 2020:ixor            
	// 1083 2021:putfield        #124 <Field int azh.bc>
		abyte0 = ((byte []) (a));
	// 1084 2024:aload_0         
	// 1085 2025:getfield        #12  <Field azh a>
	// 1086 2028:astore_1        
		abyte0.bZ = ((azh) (abyte0)).d & a.ao;
	// 1087 2029:aload_1         
	// 1088 2030:aload_1         
	// 1089 2031:getfield        #145 <Field int azh.d>
	// 1090 2034:aload_0         
	// 1091 2035:getfield        #12  <Field azh a>
	// 1092 2038:getfield        #172 <Field int azh.ao>
	// 1093 2041:iand            
	// 1094 2042:putfield        #130 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 1095 2045:aload_0         
	// 1096 2046:getfield        #12  <Field azh a>
	// 1097 2049:astore_1        
		abyte0.bZ = ((azh) (abyte0)).aE ^ a.bZ;
	// 1098 2050:aload_1         
	// 1099 2051:aload_1         
	// 1100 2052:getfield        #77  <Field int azh.aE>
	// 1101 2055:aload_0         
	// 1102 2056:getfield        #12  <Field azh a>
	// 1103 2059:getfield        #130 <Field int azh.bZ>
	// 1104 2062:ixor            
	// 1105 2063:putfield        #130 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 1106 2066:aload_0         
	// 1107 2067:getfield        #12  <Field azh a>
	// 1108 2070:astore_1        
		abyte0.aV = ((azh) (abyte0)).bZ ^ a.aV;
	// 1109 2071:aload_1         
	// 1110 2072:aload_1         
	// 1111 2073:getfield        #130 <Field int azh.bZ>
	// 1112 2076:aload_0         
	// 1113 2077:getfield        #12  <Field azh a>
	// 1114 2080:getfield        #82  <Field int azh.aV>
	// 1115 2083:ixor            
	// 1116 2084:putfield        #82  <Field int azh.aV>
		abyte0 = ((byte []) (a));
	// 1117 2087:aload_0         
	// 1118 2088:getfield        #12  <Field azh a>
	// 1119 2091:astore_1        
		abyte0.bZ = ((azh) (abyte0)).H & a.ao;
	// 1120 2092:aload_1         
	// 1121 2093:aload_1         
	// 1122 2094:getfield        #118 <Field int azh.H>
	// 1123 2097:aload_0         
	// 1124 2098:getfield        #12  <Field azh a>
	// 1125 2101:getfield        #172 <Field int azh.ao>
	// 1126 2104:iand            
	// 1127 2105:putfield        #130 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 1128 2108:aload_0         
	// 1129 2109:getfield        #12  <Field azh a>
	// 1130 2112:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bC ^ a.bZ;
	// 1131 2113:aload_1         
	// 1132 2114:aload_1         
	// 1133 2115:getfield        #133 <Field int azh.bC>
	// 1134 2118:aload_0         
	// 1135 2119:getfield        #12  <Field azh a>
	// 1136 2122:getfield        #130 <Field int azh.bZ>
	// 1137 2125:ixor            
	// 1138 2126:putfield        #130 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 1139 2129:aload_0         
	// 1140 2130:getfield        #12  <Field azh a>
	// 1141 2133:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bZ | a.d;
	// 1142 2134:aload_1         
	// 1143 2135:aload_1         
	// 1144 2136:getfield        #130 <Field int azh.bZ>
	// 1145 2139:aload_0         
	// 1146 2140:getfield        #12  <Field azh a>
	// 1147 2143:getfield        #145 <Field int azh.d>
	// 1148 2146:ior             
	// 1149 2147:putfield        #130 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 1150 2150:aload_0         
	// 1151 2151:getfield        #12  <Field azh a>
	// 1152 2154:astore_1        
		abyte0.bZ = ((azh) (abyte0)).bY ^ a.bZ;
	// 1153 2155:aload_1         
	// 1154 2156:aload_1         
	// 1155 2157:getfield        #166 <Field int azh.bY>
	// 1156 2160:aload_0         
	// 1157 2161:getfield        #12  <Field azh a>
	// 1158 2164:getfield        #130 <Field int azh.bZ>
	// 1159 2167:ixor            
	// 1160 2168:putfield        #130 <Field int azh.bZ>
		abyte0 = ((byte []) (a));
	// 1161 2171:aload_0         
	// 1162 2172:getfield        #12  <Field azh a>
	// 1163 2175:astore_1        
		abyte0.bu = ((azh) (abyte0)).bZ ^ a.bu;
	// 1164 2176:aload_1         
	// 1165 2177:aload_1         
	// 1166 2178:getfield        #130 <Field int azh.bZ>
	// 1167 2181:aload_0         
	// 1168 2182:getfield        #12  <Field azh a>
	// 1169 2185:getfield        #163 <Field int azh.bu>
	// 1170 2188:ixor            
	// 1171 2189:putfield        #163 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 1172 2192:aload_0         
	// 1173 2193:getfield        #12  <Field azh a>
	// 1174 2196:astore_1        
		abyte0.bu = ((azh) (abyte0)).bu & ~a.X;
	// 1175 2197:aload_1         
	// 1176 2198:aload_1         
	// 1177 2199:getfield        #163 <Field int azh.bu>
	// 1178 2202:aload_0         
	// 1179 2203:getfield        #12  <Field azh a>
	// 1180 2206:getfield        #157 <Field int azh.X>
	// 1181 2209:iconst_m1       
	// 1182 2210:ixor            
	// 1183 2211:iand            
	// 1184 2212:putfield        #163 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 1185 2215:aload_0         
	// 1186 2216:getfield        #12  <Field azh a>
	// 1187 2219:astore_1        
		abyte0.bu = ((azh) (abyte0)).bc ^ a.bu;
	// 1188 2220:aload_1         
	// 1189 2221:aload_1         
	// 1190 2222:getfield        #124 <Field int azh.bc>
	// 1191 2225:aload_0         
	// 1192 2226:getfield        #12  <Field azh a>
	// 1193 2229:getfield        #163 <Field int azh.bu>
	// 1194 2232:ixor            
	// 1195 2233:putfield        #163 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 1196 2236:aload_0         
	// 1197 2237:getfield        #12  <Field azh a>
	// 1198 2240:astore_1        
		abyte0.a = ((azh) (abyte0)).bu ^ a.a;
	// 1199 2241:aload_1         
	// 1200 2242:aload_1         
	// 1201 2243:getfield        #163 <Field int azh.bu>
	// 1202 2246:aload_0         
	// 1203 2247:getfield        #12  <Field azh a>
	// 1204 2250:getfield        #183 <Field int azh.a>
	// 1205 2253:ixor            
	// 1206 2254:putfield        #183 <Field int azh.a>
		abyte0 = ((byte []) (a));
	// 1207 2257:aload_0         
	// 1208 2258:getfield        #12  <Field azh a>
	// 1209 2261:astore_1        
		abyte0.bu = ((azh) (abyte0)).H & ~a.ao;
	// 1210 2262:aload_1         
	// 1211 2263:aload_1         
	// 1212 2264:getfield        #118 <Field int azh.H>
	// 1213 2267:aload_0         
	// 1214 2268:getfield        #12  <Field azh a>
	// 1215 2271:getfield        #172 <Field int azh.ao>
	// 1216 2274:iconst_m1       
	// 1217 2275:ixor            
	// 1218 2276:iand            
	// 1219 2277:putfield        #163 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 1220 2280:aload_0         
	// 1221 2281:getfield        #12  <Field azh a>
	// 1222 2284:astore_1        
		abyte0.bu = ((azh) (abyte0)).bI ^ a.bu;
	// 1223 2285:aload_1         
	// 1224 2286:aload_1         
	// 1225 2287:getfield        #169 <Field int azh.bI>
	// 1226 2290:aload_0         
	// 1227 2291:getfield        #12  <Field azh a>
	// 1228 2294:getfield        #163 <Field int azh.bu>
	// 1229 2297:ixor            
	// 1230 2298:putfield        #163 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 1231 2301:aload_0         
	// 1232 2302:getfield        #12  <Field azh a>
	// 1233 2305:astore_1        
		abyte0.bu = ((azh) (abyte0)).bu | a.d;
	// 1234 2306:aload_1         
	// 1235 2307:aload_1         
	// 1236 2308:getfield        #163 <Field int azh.bu>
	// 1237 2311:aload_0         
	// 1238 2312:getfield        #12  <Field azh a>
	// 1239 2315:getfield        #145 <Field int azh.d>
	// 1240 2318:ior             
	// 1241 2319:putfield        #163 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 1242 2322:aload_0         
	// 1243 2323:getfield        #12  <Field azh a>
	// 1244 2326:astore_1        
		abyte0.bu = ((azh) (abyte0)).aW ^ a.bu;
	// 1245 2327:aload_1         
	// 1246 2328:aload_1         
	// 1247 2329:getfield        #88  <Field int azh.aW>
	// 1248 2332:aload_0         
	// 1249 2333:getfield        #12  <Field azh a>
	// 1250 2336:getfield        #163 <Field int azh.bu>
	// 1251 2339:ixor            
	// 1252 2340:putfield        #163 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 1253 2343:aload_0         
	// 1254 2344:getfield        #12  <Field azh a>
	// 1255 2347:astore_1        
		abyte0.bu = ((azh) (abyte0)).bu & ~a.z;
	// 1256 2348:aload_1         
	// 1257 2349:aload_1         
	// 1258 2350:getfield        #163 <Field int azh.bu>
	// 1259 2353:aload_0         
	// 1260 2354:getfield        #12  <Field azh a>
	// 1261 2357:getfield        #112 <Field int azh.z>
	// 1262 2360:iconst_m1       
	// 1263 2361:ixor            
	// 1264 2362:iand            
	// 1265 2363:putfield        #163 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 1266 2366:aload_0         
	// 1267 2367:getfield        #12  <Field azh a>
	// 1268 2370:astore_1        
		abyte0.bu = ((azh) (abyte0)).bN ^ a.bu;
	// 1269 2371:aload_1         
	// 1270 2372:aload_1         
	// 1271 2373:getfield        #181 <Field int azh.bN>
	// 1272 2376:aload_0         
	// 1273 2377:getfield        #12  <Field azh a>
	// 1274 2380:getfield        #163 <Field int azh.bu>
	// 1275 2383:ixor            
	// 1276 2384:putfield        #163 <Field int azh.bu>
		abyte0 = ((byte []) (a));
	// 1277 2387:aload_0         
	// 1278 2388:getfield        #12  <Field azh a>
	// 1279 2391:astore_1        
		abyte0.aw = ((azh) (abyte0)).bu ^ a.aw;
	// 1280 2392:aload_1         
	// 1281 2393:aload_1         
	// 1282 2394:getfield        #163 <Field int azh.bu>
	// 1283 2397:aload_0         
	// 1284 2398:getfield        #12  <Field azh a>
	// 1285 2401:getfield        #154 <Field int azh.aw>
	// 1286 2404:ixor            
	// 1287 2405:putfield        #154 <Field int azh.aw>
		abyte0 = ((byte []) (a));
	// 1288 2408:aload_0         
	// 1289 2409:getfield        #12  <Field azh a>
	// 1290 2412:astore_1        
		abyte0.o = ((azh) (abyte0)).aw ^ a.o;
	// 1291 2413:aload_1         
	// 1292 2414:aload_1         
	// 1293 2415:getfield        #154 <Field int azh.aw>
	// 1294 2418:aload_0         
	// 1295 2419:getfield        #12  <Field azh a>
	// 1296 2422:getfield        #186 <Field int azh.o>
	// 1297 2425:ixor            
	// 1298 2426:putfield        #186 <Field int azh.o>
		abyte0 = ((byte []) (a));
	// 1299 2429:aload_0         
	// 1300 2430:getfield        #12  <Field azh a>
	// 1301 2433:astore_1        
		abyte0.bO = ((azh) (abyte0)).ao ^ a.bO;
	// 1302 2434:aload_1         
	// 1303 2435:aload_1         
	// 1304 2436:getfield        #172 <Field int azh.ao>
	// 1305 2439:aload_0         
	// 1306 2440:getfield        #12  <Field azh a>
	// 1307 2443:getfield        #189 <Field int azh.bO>
	// 1308 2446:ixor            
	// 1309 2447:putfield        #189 <Field int azh.bO>
		abyte0 = ((byte []) (a));
	// 1310 2450:aload_0         
	// 1311 2451:getfield        #12  <Field azh a>
	// 1312 2454:astore_1        
		abyte0.au = ((azh) (abyte0)).bO ^ a.au;
	// 1313 2455:aload_1         
	// 1314 2456:aload_1         
	// 1315 2457:getfield        #189 <Field int azh.bO>
	// 1316 2460:aload_0         
	// 1317 2461:getfield        #12  <Field azh a>
	// 1318 2464:getfield        #85  <Field int azh.au>
	// 1319 2467:ixor            
	// 1320 2468:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 1321 2471:aload_0         
	// 1322 2472:getfield        #12  <Field azh a>
	// 1323 2475:astore_1        
		abyte0.au = ((azh) (abyte0)).z | a.au;
	// 1324 2476:aload_1         
	// 1325 2477:aload_1         
	// 1326 2478:getfield        #112 <Field int azh.z>
	// 1327 2481:aload_0         
	// 1328 2482:getfield        #12  <Field azh a>
	// 1329 2485:getfield        #85  <Field int azh.au>
	// 1330 2488:ior             
	// 1331 2489:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 1332 2492:aload_0         
	// 1333 2493:getfield        #12  <Field azh a>
	// 1334 2496:astore_1        
		abyte0.au = ((azh) (abyte0)).bR ^ a.au;
	// 1335 2497:aload_1         
	// 1336 2498:aload_1         
	// 1337 2499:getfield        #142 <Field int azh.bR>
	// 1338 2502:aload_0         
	// 1339 2503:getfield        #12  <Field azh a>
	// 1340 2506:getfield        #85  <Field int azh.au>
	// 1341 2509:ixor            
	// 1342 2510:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 1343 2513:aload_0         
	// 1344 2514:getfield        #12  <Field azh a>
	// 1345 2517:astore_1        
		abyte0.au = ((azh) (abyte0)).au | a.X;
	// 1346 2518:aload_1         
	// 1347 2519:aload_1         
	// 1348 2520:getfield        #85  <Field int azh.au>
	// 1349 2523:aload_0         
	// 1350 2524:getfield        #12  <Field azh a>
	// 1351 2527:getfield        #157 <Field int azh.X>
	// 1352 2530:ior             
	// 1353 2531:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 1354 2534:aload_0         
	// 1355 2535:getfield        #12  <Field azh a>
	// 1356 2538:astore_1        
		abyte0.au = ((azh) (abyte0)).aV ^ a.au;
	// 1357 2539:aload_1         
	// 1358 2540:aload_1         
	// 1359 2541:getfield        #82  <Field int azh.aV>
	// 1360 2544:aload_0         
	// 1361 2545:getfield        #12  <Field azh a>
	// 1362 2548:getfield        #85  <Field int azh.au>
	// 1363 2551:ixor            
	// 1364 2552:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 1365 2555:aload_0         
	// 1366 2556:getfield        #12  <Field azh a>
	// 1367 2559:astore_1        
		abyte0.K = ((azh) (abyte0)).au ^ a.K;
	// 1368 2560:aload_1         
	// 1369 2561:aload_1         
	// 1370 2562:getfield        #85  <Field int azh.au>
	// 1371 2565:aload_0         
	// 1372 2566:getfield        #12  <Field azh a>
	// 1373 2569:getfield        #192 <Field int azh.K>
	// 1374 2572:ixor            
	// 1375 2573:putfield        #192 <Field int azh.K>
		abyte0 = ((byte []) (a));
	// 1376 2576:aload_0         
	// 1377 2577:getfield        #12  <Field azh a>
	// 1378 2580:astore_1        
		abyte0.au = ((azh) (abyte0)).g | a.K;
	// 1379 2581:aload_1         
	// 1380 2582:aload_1         
	// 1381 2583:getfield        #195 <Field int azh.g>
	// 1382 2586:aload_0         
	// 1383 2587:getfield        #12  <Field azh a>
	// 1384 2590:getfield        #192 <Field int azh.K>
	// 1385 2593:ior             
	// 1386 2594:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 1387 2597:aload_0         
	// 1388 2598:getfield        #12  <Field azh a>
	// 1389 2601:astore_1        
		abyte0.ah = ((azh) (abyte0)).bA | a.ah;
	// 1390 2602:aload_1         
	// 1391 2603:aload_1         
	// 1392 2604:getfield        #198 <Field int azh.bA>
	// 1393 2607:aload_0         
	// 1394 2608:getfield        #12  <Field azh a>
	// 1395 2611:getfield        #201 <Field int azh.ah>
	// 1396 2614:ior             
	// 1397 2615:putfield        #201 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 1398 2618:aload_0         
	// 1399 2619:getfield        #12  <Field azh a>
	// 1400 2622:astore_1        
		abyte0.ah = ((azh) (abyte0)).s ^ a.ah;
	// 1401 2623:aload_1         
	// 1402 2624:aload_1         
	// 1403 2625:getfield        #204 <Field int azh.s>
	// 1404 2628:aload_0         
	// 1405 2629:getfield        #12  <Field azh a>
	// 1406 2632:getfield        #201 <Field int azh.ah>
	// 1407 2635:ixor            
	// 1408 2636:putfield        #201 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 1409 2639:aload_0         
	// 1410 2640:getfield        #12  <Field azh a>
	// 1411 2643:astore_1        
		abyte0.W = ((azh) (abyte0)).ah ^ a.W;
	// 1412 2644:aload_1         
	// 1413 2645:aload_1         
	// 1414 2646:getfield        #201 <Field int azh.ah>
	// 1415 2649:aload_0         
	// 1416 2650:getfield        #12  <Field azh a>
	// 1417 2653:getfield        #207 <Field int azh.W>
	// 1418 2656:ixor            
	// 1419 2657:putfield        #207 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 1420 2660:aload_0         
	// 1421 2661:getfield        #12  <Field azh a>
	// 1422 2664:astore_1        
		abyte0.as = ((azh) (abyte0)).as & a.W;
	// 1423 2665:aload_1         
	// 1424 2666:aload_1         
	// 1425 2667:getfield        #210 <Field int azh.as>
	// 1426 2670:aload_0         
	// 1427 2671:getfield        #12  <Field azh a>
	// 1428 2674:getfield        #207 <Field int azh.W>
	// 1429 2677:iand            
	// 1430 2678:putfield        #210 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 1431 2681:aload_0         
	// 1432 2682:getfield        #12  <Field azh a>
	// 1433 2685:astore_1        
		abyte0.as = ((azh) (abyte0)).bt ^ a.as;
	// 1434 2686:aload_1         
	// 1435 2687:aload_1         
	// 1436 2688:getfield        #213 <Field int azh.bt>
	// 1437 2691:aload_0         
	// 1438 2692:getfield        #12  <Field azh a>
	// 1439 2695:getfield        #210 <Field int azh.as>
	// 1440 2698:ixor            
	// 1441 2699:putfield        #210 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 1442 2702:aload_0         
	// 1443 2703:getfield        #12  <Field azh a>
	// 1444 2706:astore_1        
		abyte0.bU = ((azh) (abyte0)).W & ~a.bU;
	// 1445 2707:aload_1         
	// 1446 2708:aload_1         
	// 1447 2709:getfield        #207 <Field int azh.W>
	// 1448 2712:aload_0         
	// 1449 2713:getfield        #12  <Field azh a>
	// 1450 2716:getfield        #216 <Field int azh.bU>
	// 1451 2719:iconst_m1       
	// 1452 2720:ixor            
	// 1453 2721:iand            
	// 1454 2722:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 1455 2725:aload_0         
	// 1456 2726:getfield        #12  <Field azh a>
	// 1457 2729:astore_1        
		abyte0.bU = ((azh) (abyte0)).bs ^ a.bU;
	// 1458 2730:aload_1         
	// 1459 2731:aload_1         
	// 1460 2732:getfield        #219 <Field int azh.bs>
	// 1461 2735:aload_0         
	// 1462 2736:getfield        #12  <Field azh a>
	// 1463 2739:getfield        #216 <Field int azh.bU>
	// 1464 2742:ixor            
	// 1465 2743:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 1466 2746:aload_0         
	// 1467 2747:getfield        #12  <Field azh a>
	// 1468 2750:astore_1        
		abyte0.bU = ((azh) (abyte0)).bU & ~a.aI;
	// 1469 2751:aload_1         
	// 1470 2752:aload_1         
	// 1471 2753:getfield        #216 <Field int azh.bU>
	// 1472 2756:aload_0         
	// 1473 2757:getfield        #12  <Field azh a>
	// 1474 2760:getfield        #222 <Field int azh.aI>
	// 1475 2763:iconst_m1       
	// 1476 2764:ixor            
	// 1477 2765:iand            
	// 1478 2766:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 1479 2769:aload_0         
	// 1480 2770:getfield        #12  <Field azh a>
	// 1481 2773:astore_1        
		abyte0.bB = ((azh) (abyte0)).W & ~a.bB;
	// 1482 2774:aload_1         
	// 1483 2775:aload_1         
	// 1484 2776:getfield        #207 <Field int azh.W>
	// 1485 2779:aload_0         
	// 1486 2780:getfield        #12  <Field azh a>
	// 1487 2783:getfield        #225 <Field int azh.bB>
	// 1488 2786:iconst_m1       
	// 1489 2787:ixor            
	// 1490 2788:iand            
	// 1491 2789:putfield        #225 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 1492 2792:aload_0         
	// 1493 2793:getfield        #12  <Field azh a>
	// 1494 2796:astore_1        
		abyte0.bB = ((azh) (abyte0)).bX ^ a.bB;
	// 1495 2797:aload_1         
	// 1496 2798:aload_1         
	// 1497 2799:getfield        #228 <Field int azh.bX>
	// 1498 2802:aload_0         
	// 1499 2803:getfield        #12  <Field azh a>
	// 1500 2806:getfield        #225 <Field int azh.bB>
	// 1501 2809:ixor            
	// 1502 2810:putfield        #225 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 1503 2813:aload_0         
	// 1504 2814:getfield        #12  <Field azh a>
	// 1505 2817:astore_1        
		abyte0.aP = ((azh) (abyte0)).W & ~a.aP;
	// 1506 2818:aload_1         
	// 1507 2819:aload_1         
	// 1508 2820:getfield        #207 <Field int azh.W>
	// 1509 2823:aload_0         
	// 1510 2824:getfield        #12  <Field azh a>
	// 1511 2827:getfield        #231 <Field int azh.aP>
	// 1512 2830:iconst_m1       
	// 1513 2831:ixor            
	// 1514 2832:iand            
	// 1515 2833:putfield        #231 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 1516 2836:aload_0         
	// 1517 2837:getfield        #12  <Field azh a>
	// 1518 2840:astore_1        
		abyte0.aP = ((azh) (abyte0)).bk ^ a.aP;
	// 1519 2841:aload_1         
	// 1520 2842:aload_1         
	// 1521 2843:getfield        #234 <Field int azh.bk>
	// 1522 2846:aload_0         
	// 1523 2847:getfield        #12  <Field azh a>
	// 1524 2850:getfield        #231 <Field int azh.aP>
	// 1525 2853:ixor            
	// 1526 2854:putfield        #231 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 1527 2857:aload_0         
	// 1528 2858:getfield        #12  <Field azh a>
	// 1529 2861:astore_1        
		abyte0.aP = ((azh) (abyte0)).aI | a.aP;
	// 1530 2862:aload_1         
	// 1531 2863:aload_1         
	// 1532 2864:getfield        #222 <Field int azh.aI>
	// 1533 2867:aload_0         
	// 1534 2868:getfield        #12  <Field azh a>
	// 1535 2871:getfield        #231 <Field int azh.aP>
	// 1536 2874:ior             
	// 1537 2875:putfield        #231 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 1538 2878:aload_0         
	// 1539 2879:getfield        #12  <Field azh a>
	// 1540 2882:astore_1        
		abyte0.aP = ((azh) (abyte0)).as ^ a.aP;
	// 1541 2883:aload_1         
	// 1542 2884:aload_1         
	// 1543 2885:getfield        #210 <Field int azh.as>
	// 1544 2888:aload_0         
	// 1545 2889:getfield        #12  <Field azh a>
	// 1546 2892:getfield        #231 <Field int azh.aP>
	// 1547 2895:ixor            
	// 1548 2896:putfield        #231 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 1549 2899:aload_0         
	// 1550 2900:getfield        #12  <Field azh a>
	// 1551 2903:astore_1        
		abyte0.L = ((azh) (abyte0)).aP ^ a.L;
	// 1552 2904:aload_1         
	// 1553 2905:aload_1         
	// 1554 2906:getfield        #231 <Field int azh.aP>
	// 1555 2909:aload_0         
	// 1556 2910:getfield        #12  <Field azh a>
	// 1557 2913:getfield        #237 <Field int azh.L>
	// 1558 2916:ixor            
	// 1559 2917:putfield        #237 <Field int azh.L>
		abyte0 = ((byte []) (a));
	// 1560 2920:aload_0         
	// 1561 2921:getfield        #12  <Field azh a>
	// 1562 2924:astore_1        
		abyte0.aP = ((azh) (abyte0)).L | a.aZ;
	// 1563 2925:aload_1         
	// 1564 2926:aload_1         
	// 1565 2927:getfield        #237 <Field int azh.L>
	// 1566 2930:aload_0         
	// 1567 2931:getfield        #12  <Field azh a>
	// 1568 2934:getfield        #41  <Field int azh.aZ>
	// 1569 2937:ior             
	// 1570 2938:putfield        #231 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 1571 2941:aload_0         
	// 1572 2942:getfield        #12  <Field azh a>
	// 1573 2945:astore_1        
		abyte0.aP = ((azh) (abyte0)).cb ^ a.aP;
	// 1574 2946:aload_1         
	// 1575 2947:aload_1         
	// 1576 2948:getfield        #240 <Field int azh.cb>
	// 1577 2951:aload_0         
	// 1578 2952:getfield        #12  <Field azh a>
	// 1579 2955:getfield        #231 <Field int azh.aP>
	// 1580 2958:ixor            
	// 1581 2959:putfield        #231 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 1582 2962:aload_0         
	// 1583 2963:getfield        #12  <Field azh a>
	// 1584 2966:astore_1        
		abyte0.aP = ((azh) (abyte0)).h & ~a.aP;
	// 1585 2967:aload_1         
	// 1586 2968:aload_1         
	// 1587 2969:getfield        #94  <Field int azh.h>
	// 1588 2972:aload_0         
	// 1589 2973:getfield        #12  <Field azh a>
	// 1590 2976:getfield        #231 <Field int azh.aP>
	// 1591 2979:iconst_m1       
	// 1592 2980:ixor            
	// 1593 2981:iand            
	// 1594 2982:putfield        #231 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 1595 2985:aload_0         
	// 1596 2986:getfield        #12  <Field azh a>
	// 1597 2989:astore_1        
		abyte0.bL = ((azh) (abyte0)).bL ^ a.L;
	// 1598 2990:aload_1         
	// 1599 2991:aload_1         
	// 1600 2992:getfield        #47  <Field int azh.bL>
	// 1601 2995:aload_0         
	// 1602 2996:getfield        #12  <Field azh a>
	// 1603 2999:getfield        #237 <Field int azh.L>
	// 1604 3002:ixor            
	// 1605 3003:putfield        #47  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 1606 3006:aload_0         
	// 1607 3007:getfield        #12  <Field azh a>
	// 1608 3010:astore_1        
		abyte0.cb = ((azh) (abyte0)).L & ~a.bQ;
	// 1609 3011:aload_1         
	// 1610 3012:aload_1         
	// 1611 3013:getfield        #237 <Field int azh.L>
	// 1612 3016:aload_0         
	// 1613 3017:getfield        #12  <Field azh a>
	// 1614 3020:getfield        #243 <Field int azh.bQ>
	// 1615 3023:iconst_m1       
	// 1616 3024:ixor            
	// 1617 3025:iand            
	// 1618 3026:putfield        #240 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 1619 3029:aload_0         
	// 1620 3030:getfield        #12  <Field azh a>
	// 1621 3033:astore_1        
		abyte0.cb = ((azh) (abyte0)).bK ^ a.cb;
	// 1622 3034:aload_1         
	// 1623 3035:aload_1         
	// 1624 3036:getfield        #56  <Field int azh.bK>
	// 1625 3039:aload_0         
	// 1626 3040:getfield        #12  <Field azh a>
	// 1627 3043:getfield        #240 <Field int azh.cb>
	// 1628 3046:ixor            
	// 1629 3047:putfield        #240 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 1630 3050:aload_0         
	// 1631 3051:getfield        #12  <Field azh a>
	// 1632 3054:astore_1        
		abyte0.as = ((azh) (abyte0)).cb & a.h;
	// 1633 3055:aload_1         
	// 1634 3056:aload_1         
	// 1635 3057:getfield        #240 <Field int azh.cb>
	// 1636 3060:aload_0         
	// 1637 3061:getfield        #12  <Field azh a>
	// 1638 3064:getfield        #94  <Field int azh.h>
	// 1639 3067:iand            
	// 1640 3068:putfield        #210 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 1641 3071:aload_0         
	// 1642 3072:getfield        #12  <Field azh a>
	// 1643 3075:astore_1        
		abyte0.as = ((azh) (abyte0)).cb ^ a.as;
	// 1644 3076:aload_1         
	// 1645 3077:aload_1         
	// 1646 3078:getfield        #240 <Field int azh.cb>
	// 1647 3081:aload_0         
	// 1648 3082:getfield        #12  <Field azh a>
	// 1649 3085:getfield        #210 <Field int azh.as>
	// 1650 3088:ixor            
	// 1651 3089:putfield        #210 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 1652 3092:aload_0         
	// 1653 3093:getfield        #12  <Field azh a>
	// 1654 3096:astore_1        
		abyte0.as = ((azh) (abyte0)).aj & ~a.as;
	// 1655 3097:aload_1         
	// 1656 3098:aload_1         
	// 1657 3099:getfield        #246 <Field int azh.aj>
	// 1658 3102:aload_0         
	// 1659 3103:getfield        #12  <Field azh a>
	// 1660 3106:getfield        #210 <Field int azh.as>
	// 1661 3109:iconst_m1       
	// 1662 3110:ixor            
	// 1663 3111:iand            
	// 1664 3112:putfield        #210 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 1665 3115:aload_0         
	// 1666 3116:getfield        #12  <Field azh a>
	// 1667 3119:astore_1        
		abyte0.bi = ((azh) (abyte0)).L | a.bi;
	// 1668 3120:aload_1         
	// 1669 3121:aload_1         
	// 1670 3122:getfield        #237 <Field int azh.L>
	// 1671 3125:aload_0         
	// 1672 3126:getfield        #12  <Field azh a>
	// 1673 3129:getfield        #62  <Field int azh.bi>
	// 1674 3132:ior             
	// 1675 3133:putfield        #62  <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 1676 3136:aload_0         
	// 1677 3137:getfield        #12  <Field azh a>
	// 1678 3140:astore_1        
		abyte0.bi = ((azh) (abyte0)).az ^ a.bi;
	// 1679 3141:aload_1         
	// 1680 3142:aload_1         
	// 1681 3143:getfield        #50  <Field int azh.az>
	// 1682 3146:aload_0         
	// 1683 3147:getfield        #12  <Field azh a>
	// 1684 3150:getfield        #62  <Field int azh.bi>
	// 1685 3153:ixor            
	// 1686 3154:putfield        #62  <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 1687 3157:aload_0         
	// 1688 3158:getfield        #12  <Field azh a>
	// 1689 3161:astore_1        
		abyte0.bi = ((azh) (abyte0)).h & a.bi;
	// 1690 3162:aload_1         
	// 1691 3163:aload_1         
	// 1692 3164:getfield        #94  <Field int azh.h>
	// 1693 3167:aload_0         
	// 1694 3168:getfield        #12  <Field azh a>
	// 1695 3171:getfield        #62  <Field int azh.bi>
	// 1696 3174:iand            
	// 1697 3175:putfield        #62  <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 1698 3178:aload_0         
	// 1699 3179:getfield        #12  <Field azh a>
	// 1700 3182:astore_1        
		abyte0.cd = ((azh) (abyte0)).cd & ~a.L;
	// 1701 3183:aload_1         
	// 1702 3184:aload_1         
	// 1703 3185:getfield        #59  <Field int azh.cd>
	// 1704 3188:aload_0         
	// 1705 3189:getfield        #12  <Field azh a>
	// 1706 3192:getfield        #237 <Field int azh.L>
	// 1707 3195:iconst_m1       
	// 1708 3196:ixor            
	// 1709 3197:iand            
	// 1710 3198:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 1711 3201:aload_0         
	// 1712 3202:getfield        #12  <Field azh a>
	// 1713 3205:astore_1        
		abyte0.cd = ((azh) (abyte0)).aL ^ a.cd;
	// 1714 3206:aload_1         
	// 1715 3207:aload_1         
	// 1716 3208:getfield        #249 <Field int azh.aL>
	// 1717 3211:aload_0         
	// 1718 3212:getfield        #12  <Field azh a>
	// 1719 3215:getfield        #59  <Field int azh.cd>
	// 1720 3218:ixor            
	// 1721 3219:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 1722 3222:aload_0         
	// 1723 3223:getfield        #12  <Field azh a>
	// 1724 3226:astore_1        
		abyte0.cd = ((azh) (abyte0)).h & ~a.cd;
	// 1725 3227:aload_1         
	// 1726 3228:aload_1         
	// 1727 3229:getfield        #94  <Field int azh.h>
	// 1728 3232:aload_0         
	// 1729 3233:getfield        #12  <Field azh a>
	// 1730 3236:getfield        #59  <Field int azh.cd>
	// 1731 3239:iconst_m1       
	// 1732 3240:ixor            
	// 1733 3241:iand            
	// 1734 3242:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 1735 3245:aload_0         
	// 1736 3246:getfield        #12  <Field azh a>
	// 1737 3249:astore_1        
		abyte0.bo = ((azh) (abyte0)).L & ~a.bo;
	// 1738 3250:aload_1         
	// 1739 3251:aload_1         
	// 1740 3252:getfield        #237 <Field int azh.L>
	// 1741 3255:aload_0         
	// 1742 3256:getfield        #12  <Field azh a>
	// 1743 3259:getfield        #32  <Field int azh.bo>
	// 1744 3262:iconst_m1       
	// 1745 3263:ixor            
	// 1746 3264:iand            
	// 1747 3265:putfield        #32  <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 1748 3268:aload_0         
	// 1749 3269:getfield        #12  <Field azh a>
	// 1750 3272:astore_1        
		abyte0.bo = ((azh) (abyte0)).bQ ^ a.bo;
	// 1751 3273:aload_1         
	// 1752 3274:aload_1         
	// 1753 3275:getfield        #243 <Field int azh.bQ>
	// 1754 3278:aload_0         
	// 1755 3279:getfield        #12  <Field azh a>
	// 1756 3282:getfield        #32  <Field int azh.bo>
	// 1757 3285:ixor            
	// 1758 3286:putfield        #32  <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 1759 3289:aload_0         
	// 1760 3290:getfield        #12  <Field azh a>
	// 1761 3293:astore_1        
		abyte0.cd = ((azh) (abyte0)).bo ^ a.cd;
	// 1762 3294:aload_1         
	// 1763 3295:aload_1         
	// 1764 3296:getfield        #32  <Field int azh.bo>
	// 1765 3299:aload_0         
	// 1766 3300:getfield        #12  <Field azh a>
	// 1767 3303:getfield        #59  <Field int azh.cd>
	// 1768 3306:ixor            
	// 1769 3307:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 1770 3310:aload_0         
	// 1771 3311:getfield        #12  <Field azh a>
	// 1772 3314:astore_1        
		abyte0.cc = ((azh) (abyte0)).cc & ~a.L;
	// 1773 3315:aload_1         
	// 1774 3316:aload_1         
	// 1775 3317:getfield        #252 <Field int azh.cc>
	// 1776 3320:aload_0         
	// 1777 3321:getfield        #12  <Field azh a>
	// 1778 3324:getfield        #237 <Field int azh.L>
	// 1779 3327:iconst_m1       
	// 1780 3328:ixor            
	// 1781 3329:iand            
	// 1782 3330:putfield        #252 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 1783 3333:aload_0         
	// 1784 3334:getfield        #12  <Field azh a>
	// 1785 3337:astore_1        
		abyte0.cc = ((azh) (abyte0)).ab ^ a.cc;
	// 1786 3338:aload_1         
	// 1787 3339:aload_1         
	// 1788 3340:getfield        #38  <Field int azh.ab>
	// 1789 3343:aload_0         
	// 1790 3344:getfield        #12  <Field azh a>
	// 1791 3347:getfield        #252 <Field int azh.cc>
	// 1792 3350:ixor            
	// 1793 3351:putfield        #252 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 1794 3354:aload_0         
	// 1795 3355:getfield        #12  <Field azh a>
	// 1796 3358:astore_1        
		abyte0.aP = ((azh) (abyte0)).cc ^ a.aP;
	// 1797 3359:aload_1         
	// 1798 3360:aload_1         
	// 1799 3361:getfield        #252 <Field int azh.cc>
	// 1800 3364:aload_0         
	// 1801 3365:getfield        #12  <Field azh a>
	// 1802 3368:getfield        #231 <Field int azh.aP>
	// 1803 3371:ixor            
	// 1804 3372:putfield        #231 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 1805 3375:aload_0         
	// 1806 3376:getfield        #12  <Field azh a>
	// 1807 3379:astore_1        
		abyte0.aP = ((azh) (abyte0)).aj & a.aP;
	// 1808 3380:aload_1         
	// 1809 3381:aload_1         
	// 1810 3382:getfield        #246 <Field int azh.aj>
	// 1811 3385:aload_0         
	// 1812 3386:getfield        #12  <Field azh a>
	// 1813 3389:getfield        #231 <Field int azh.aP>
	// 1814 3392:iand            
	// 1815 3393:putfield        #231 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 1816 3396:aload_0         
	// 1817 3397:getfield        #12  <Field azh a>
	// 1818 3400:astore_1        
		abyte0.bK = ((azh) (abyte0)).bK & ~a.L;
	// 1819 3401:aload_1         
	// 1820 3402:aload_1         
	// 1821 3403:getfield        #56  <Field int azh.bK>
	// 1822 3406:aload_0         
	// 1823 3407:getfield        #12  <Field azh a>
	// 1824 3410:getfield        #237 <Field int azh.L>
	// 1825 3413:iconst_m1       
	// 1826 3414:ixor            
	// 1827 3415:iand            
	// 1828 3416:putfield        #56  <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 1829 3419:aload_0         
	// 1830 3420:getfield        #12  <Field azh a>
	// 1831 3423:astore_1        
		abyte0.bK = ((azh) (abyte0)).bJ ^ a.bK;
	// 1832 3424:aload_1         
	// 1833 3425:aload_1         
	// 1834 3426:getfield        #53  <Field int azh.bJ>
	// 1835 3429:aload_0         
	// 1836 3430:getfield        #12  <Field azh a>
	// 1837 3433:getfield        #56  <Field int azh.bK>
	// 1838 3436:ixor            
	// 1839 3437:putfield        #56  <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 1840 3440:aload_0         
	// 1841 3441:getfield        #12  <Field azh a>
	// 1842 3444:astore_1        
		abyte0.bK = ((azh) (abyte0)).h & ~a.bK;
	// 1843 3445:aload_1         
	// 1844 3446:aload_1         
	// 1845 3447:getfield        #94  <Field int azh.h>
	// 1846 3450:aload_0         
	// 1847 3451:getfield        #12  <Field azh a>
	// 1848 3454:getfield        #56  <Field int azh.bK>
	// 1849 3457:iconst_m1       
	// 1850 3458:ixor            
	// 1851 3459:iand            
	// 1852 3460:putfield        #56  <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 1853 3463:aload_0         
	// 1854 3464:getfield        #12  <Field azh a>
	// 1855 3467:astore_1        
		abyte0.bK = ((azh) (abyte0)).bL ^ a.bK;
	// 1856 3468:aload_1         
	// 1857 3469:aload_1         
	// 1858 3470:getfield        #47  <Field int azh.bL>
	// 1859 3473:aload_0         
	// 1860 3474:getfield        #12  <Field azh a>
	// 1861 3477:getfield        #56  <Field int azh.bK>
	// 1862 3480:ixor            
	// 1863 3481:putfield        #56  <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 1864 3484:aload_0         
	// 1865 3485:getfield        #12  <Field azh a>
	// 1866 3488:astore_1        
		abyte0.aP = ((azh) (abyte0)).bK ^ a.aP;
	// 1867 3489:aload_1         
	// 1868 3490:aload_1         
	// 1869 3491:getfield        #56  <Field int azh.bK>
	// 1870 3494:aload_0         
	// 1871 3495:getfield        #12  <Field azh a>
	// 1872 3498:getfield        #231 <Field int azh.aP>
	// 1873 3501:ixor            
	// 1874 3502:putfield        #231 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 1875 3505:aload_0         
	// 1876 3506:getfield        #12  <Field azh a>
	// 1877 3509:astore_1        
		abyte0.c = ((azh) (abyte0)).aP ^ a.c;
	// 1878 3510:aload_1         
	// 1879 3511:aload_1         
	// 1880 3512:getfield        #231 <Field int azh.aP>
	// 1881 3515:aload_0         
	// 1882 3516:getfield        #12  <Field azh a>
	// 1883 3519:getfield        #100 <Field int azh.c>
	// 1884 3522:ixor            
	// 1885 3523:putfield        #100 <Field int azh.c>
		abyte0 = ((byte []) (a));
	// 1886 3526:aload_0         
	// 1887 3527:getfield        #12  <Field azh a>
	// 1888 3530:astore_1        
		abyte0.aP = ((azh) (abyte0)).bF | a.c;
	// 1889 3531:aload_1         
	// 1890 3532:aload_1         
	// 1891 3533:getfield        #255 <Field int azh.bF>
	// 1892 3536:aload_0         
	// 1893 3537:getfield        #12  <Field azh a>
	// 1894 3540:getfield        #100 <Field int azh.c>
	// 1895 3543:ior             
	// 1896 3544:putfield        #231 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 1897 3547:aload_0         
	// 1898 3548:getfield        #12  <Field azh a>
	// 1899 3551:astore_1        
		abyte0.bK = ((azh) (abyte0)).bF | a.c;
	// 1900 3552:aload_1         
	// 1901 3553:aload_1         
	// 1902 3554:getfield        #255 <Field int azh.bF>
	// 1903 3557:aload_0         
	// 1904 3558:getfield        #12  <Field azh a>
	// 1905 3561:getfield        #100 <Field int azh.c>
	// 1906 3564:ior             
	// 1907 3565:putfield        #56  <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 1908 3568:aload_0         
	// 1909 3569:getfield        #12  <Field azh a>
	// 1910 3572:astore_1        
		abyte0.bL = ((azh) (abyte0)).bF & ~a.c;
	// 1911 3573:aload_1         
	// 1912 3574:aload_1         
	// 1913 3575:getfield        #255 <Field int azh.bF>
	// 1914 3578:aload_0         
	// 1915 3579:getfield        #12  <Field azh a>
	// 1916 3582:getfield        #100 <Field int azh.c>
	// 1917 3585:iconst_m1       
	// 1918 3586:ixor            
	// 1919 3587:iand            
	// 1920 3588:putfield        #47  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 1921 3591:aload_0         
	// 1922 3592:getfield        #12  <Field azh a>
	// 1923 3595:astore_1        
		abyte0.cc = ((azh) (abyte0)).bF | a.c;
	// 1924 3596:aload_1         
	// 1925 3597:aload_1         
	// 1926 3598:getfield        #255 <Field int azh.bF>
	// 1927 3601:aload_0         
	// 1928 3602:getfield        #12  <Field azh a>
	// 1929 3605:getfield        #100 <Field int azh.c>
	// 1930 3608:ior             
	// 1931 3609:putfield        #252 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 1932 3612:aload_0         
	// 1933 3613:getfield        #12  <Field azh a>
	// 1934 3616:astore_1        
		abyte0.bo = ((azh) (abyte0)).c | a.bF;
	// 1935 3617:aload_1         
	// 1936 3618:aload_1         
	// 1937 3619:getfield        #100 <Field int azh.c>
	// 1938 3622:aload_0         
	// 1939 3623:getfield        #12  <Field azh a>
	// 1940 3626:getfield        #255 <Field int azh.bF>
	// 1941 3629:ior             
	// 1942 3630:putfield        #32  <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 1943 3633:aload_0         
	// 1944 3634:getfield        #12  <Field azh a>
	// 1945 3637:astore_1        
		abyte0.bo = ((azh) (abyte0)).bF ^ a.bo;
	// 1946 3638:aload_1         
	// 1947 3639:aload_1         
	// 1948 3640:getfield        #255 <Field int azh.bF>
	// 1949 3643:aload_0         
	// 1950 3644:getfield        #12  <Field azh a>
	// 1951 3647:getfield        #32  <Field int azh.bo>
	// 1952 3650:ixor            
	// 1953 3651:putfield        #32  <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 1954 3654:aload_0         
	// 1955 3655:getfield        #12  <Field azh a>
	// 1956 3658:astore_1        
		abyte0.aZ = ((azh) (abyte0)).L | a.aZ;
	// 1957 3659:aload_1         
	// 1958 3660:aload_1         
	// 1959 3661:getfield        #237 <Field int azh.L>
	// 1960 3664:aload_0         
	// 1961 3665:getfield        #12  <Field azh a>
	// 1962 3668:getfield        #41  <Field int azh.aZ>
	// 1963 3671:ior             
	// 1964 3672:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 1965 3675:aload_0         
	// 1966 3676:getfield        #12  <Field azh a>
	// 1967 3679:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bT ^ a.aZ;
	// 1968 3680:aload_1         
	// 1969 3681:aload_1         
	// 1970 3682:getfield        #35  <Field int azh.bT>
	// 1971 3685:aload_0         
	// 1972 3686:getfield        #12  <Field azh a>
	// 1973 3689:getfield        #41  <Field int azh.aZ>
	// 1974 3692:ixor            
	// 1975 3693:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 1976 3696:aload_0         
	// 1977 3697:getfield        #12  <Field azh a>
	// 1978 3700:astore_1        
		abyte0.ap = ((azh) (abyte0)).L | a.ap;
	// 1979 3701:aload_1         
	// 1980 3702:aload_1         
	// 1981 3703:getfield        #237 <Field int azh.L>
	// 1982 3706:aload_0         
	// 1983 3707:getfield        #12  <Field azh a>
	// 1984 3710:getfield        #68  <Field int azh.ap>
	// 1985 3713:ior             
	// 1986 3714:putfield        #68  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 1987 3717:aload_0         
	// 1988 3718:getfield        #12  <Field azh a>
	// 1989 3721:astore_1        
		abyte0.ap = ((azh) (abyte0)).bQ ^ a.ap;
	// 1990 3722:aload_1         
	// 1991 3723:aload_1         
	// 1992 3724:getfield        #243 <Field int azh.bQ>
	// 1993 3727:aload_0         
	// 1994 3728:getfield        #12  <Field azh a>
	// 1995 3731:getfield        #68  <Field int azh.ap>
	// 1996 3734:ixor            
	// 1997 3735:putfield        #68  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 1998 3738:aload_0         
	// 1999 3739:getfield        #12  <Field azh a>
	// 2000 3742:astore_1        
		abyte0.bi = ((azh) (abyte0)).ap ^ a.bi;
	// 2001 3743:aload_1         
	// 2002 3744:aload_1         
	// 2003 3745:getfield        #68  <Field int azh.ap>
	// 2004 3748:aload_0         
	// 2005 3749:getfield        #12  <Field azh a>
	// 2006 3752:getfield        #62  <Field int azh.bi>
	// 2007 3755:ixor            
	// 2008 3756:putfield        #62  <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 2009 3759:aload_0         
	// 2010 3760:getfield        #12  <Field azh a>
	// 2011 3763:astore_1        
		abyte0.ap = ((azh) (abyte0)).v & ~a.L;
	// 2012 3764:aload_1         
	// 2013 3765:aload_1         
	// 2014 3766:getfield        #258 <Field int azh.v>
	// 2015 3769:aload_0         
	// 2016 3770:getfield        #12  <Field azh a>
	// 2017 3773:getfield        #237 <Field int azh.L>
	// 2018 3776:iconst_m1       
	// 2019 3777:ixor            
	// 2020 3778:iand            
	// 2021 3779:putfield        #68  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 2022 3782:aload_0         
	// 2023 3783:getfield        #12  <Field azh a>
	// 2024 3786:astore_1        
		abyte0.bQ = ((azh) (abyte0)).bQ & ~a.L;
	// 2025 3787:aload_1         
	// 2026 3788:aload_1         
	// 2027 3789:getfield        #243 <Field int azh.bQ>
	// 2028 3792:aload_0         
	// 2029 3793:getfield        #12  <Field azh a>
	// 2030 3796:getfield        #237 <Field int azh.L>
	// 2031 3799:iconst_m1       
	// 2032 3800:ixor            
	// 2033 3801:iand            
	// 2034 3802:putfield        #243 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 2035 3805:aload_0         
	// 2036 3806:getfield        #12  <Field azh a>
	// 2037 3809:astore_1        
		abyte0.bQ = ((azh) (abyte0)).ci ^ a.bQ;
	// 2038 3810:aload_1         
	// 2039 3811:aload_1         
	// 2040 3812:getfield        #71  <Field int azh.ci>
	// 2041 3815:aload_0         
	// 2042 3816:getfield        #12  <Field azh a>
	// 2043 3819:getfield        #243 <Field int azh.bQ>
	// 2044 3822:ixor            
	// 2045 3823:putfield        #243 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 2046 3826:aload_0         
	// 2047 3827:getfield        #12  <Field azh a>
	// 2048 3830:astore_1        
		abyte0.ci = ((azh) (abyte0)).L | a.f;
	// 2049 3831:aload_1         
	// 2050 3832:aload_1         
	// 2051 3833:getfield        #237 <Field int azh.L>
	// 2052 3836:aload_0         
	// 2053 3837:getfield        #12  <Field azh a>
	// 2054 3840:getfield        #261 <Field int azh.f>
	// 2055 3843:ior             
	// 2056 3844:putfield        #71  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 2057 3847:aload_0         
	// 2058 3848:getfield        #12  <Field azh a>
	// 2059 3851:astore_1        
		abyte0.bT = ((azh) (abyte0)).v & a.ci;
	// 2060 3852:aload_1         
	// 2061 3853:aload_1         
	// 2062 3854:getfield        #258 <Field int azh.v>
	// 2063 3857:aload_0         
	// 2064 3858:getfield        #12  <Field azh a>
	// 2065 3861:getfield        #71  <Field int azh.ci>
	// 2066 3864:iand            
	// 2067 3865:putfield        #35  <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 2068 3868:aload_0         
	// 2069 3869:getfield        #12  <Field azh a>
	// 2070 3872:astore_1        
		abyte0.aL = ((azh) (abyte0)).v & a.ci;
	// 2071 3873:aload_1         
	// 2072 3874:aload_1         
	// 2073 3875:getfield        #258 <Field int azh.v>
	// 2074 3878:aload_0         
	// 2075 3879:getfield        #12  <Field azh a>
	// 2076 3882:getfield        #71  <Field int azh.ci>
	// 2077 3885:iand            
	// 2078 3886:putfield        #249 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 2079 3889:aload_0         
	// 2080 3890:getfield        #12  <Field azh a>
	// 2081 3893:astore_1        
		abyte0.ci = ((azh) (abyte0)).ci & ~a.f;
	// 2082 3894:aload_1         
	// 2083 3895:aload_1         
	// 2084 3896:getfield        #71  <Field int azh.ci>
	// 2085 3899:aload_0         
	// 2086 3900:getfield        #12  <Field azh a>
	// 2087 3903:getfield        #261 <Field int azh.f>
	// 2088 3906:iconst_m1       
	// 2089 3907:ixor            
	// 2090 3908:iand            
	// 2091 3909:putfield        #71  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 2092 3912:aload_0         
	// 2093 3913:getfield        #12  <Field azh a>
	// 2094 3916:astore_1        
		abyte0.bT = ((azh) (abyte0)).ci ^ a.bT;
	// 2095 3917:aload_1         
	// 2096 3918:aload_1         
	// 2097 3919:getfield        #71  <Field int azh.ci>
	// 2098 3922:aload_0         
	// 2099 3923:getfield        #12  <Field azh a>
	// 2100 3926:getfield        #35  <Field int azh.bT>
	// 2101 3929:ixor            
	// 2102 3930:putfield        #35  <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 2103 3933:aload_0         
	// 2104 3934:getfield        #12  <Field azh a>
	// 2105 3937:astore_1        
		abyte0.bT = ((azh) (abyte0)).D & ~a.bT;
	// 2106 3938:aload_1         
	// 2107 3939:aload_1         
	// 2108 3940:getfield        #26  <Field int azh.D>
	// 2109 3943:aload_0         
	// 2110 3944:getfield        #12  <Field azh a>
	// 2111 3947:getfield        #35  <Field int azh.bT>
	// 2112 3950:iconst_m1       
	// 2113 3951:ixor            
	// 2114 3952:iand            
	// 2115 3953:putfield        #35  <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 2116 3956:aload_0         
	// 2117 3957:getfield        #12  <Field azh a>
	// 2118 3960:astore_1        
		abyte0.ci = ((azh) (abyte0)).v & ~a.L;
	// 2119 3961:aload_1         
	// 2120 3962:aload_1         
	// 2121 3963:getfield        #258 <Field int azh.v>
	// 2122 3966:aload_0         
	// 2123 3967:getfield        #12  <Field azh a>
	// 2124 3970:getfield        #237 <Field int azh.L>
	// 2125 3973:iconst_m1       
	// 2126 3974:ixor            
	// 2127 3975:iand            
	// 2128 3976:putfield        #71  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 2129 3979:aload_0         
	// 2130 3980:getfield        #12  <Field azh a>
	// 2131 3983:astore_1        
		abyte0.cb = ((azh) (abyte0)).v & a.L;
	// 2132 3984:aload_1         
	// 2133 3985:aload_1         
	// 2134 3986:getfield        #258 <Field int azh.v>
	// 2135 3989:aload_0         
	// 2136 3990:getfield        #12  <Field azh a>
	// 2137 3993:getfield        #237 <Field int azh.L>
	// 2138 3996:iand            
	// 2139 3997:putfield        #240 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 2140 4000:aload_0         
	// 2141 4001:getfield        #12  <Field azh a>
	// 2142 4004:astore_1        
		abyte0.bk = ((azh) (abyte0)).f & ~a.L;
	// 2143 4005:aload_1         
	// 2144 4006:aload_1         
	// 2145 4007:getfield        #261 <Field int azh.f>
	// 2146 4010:aload_0         
	// 2147 4011:getfield        #12  <Field azh a>
	// 2148 4014:getfield        #237 <Field int azh.L>
	// 2149 4017:iconst_m1       
	// 2150 4018:ixor            
	// 2151 4019:iand            
	// 2152 4020:putfield        #234 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 2153 4023:aload_0         
	// 2154 4024:getfield        #12  <Field azh a>
	// 2155 4027:astore_1        
		abyte0.aL = ((azh) (abyte0)).bk ^ a.aL;
	// 2156 4028:aload_1         
	// 2157 4029:aload_1         
	// 2158 4030:getfield        #234 <Field int azh.bk>
	// 2159 4033:aload_0         
	// 2160 4034:getfield        #12  <Field azh a>
	// 2161 4037:getfield        #249 <Field int azh.aL>
	// 2162 4040:ixor            
	// 2163 4041:putfield        #249 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 2164 4044:aload_0         
	// 2165 4045:getfield        #12  <Field azh a>
	// 2166 4048:astore_1        
		abyte0.aX = ((azh) (abyte0)).aL ^ a.aX;
	// 2167 4049:aload_1         
	// 2168 4050:aload_1         
	// 2169 4051:getfield        #249 <Field int azh.aL>
	// 2170 4054:aload_0         
	// 2171 4055:getfield        #12  <Field azh a>
	// 2172 4058:getfield        #264 <Field int azh.aX>
	// 2173 4061:ixor            
	// 2174 4062:putfield        #264 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 2175 4065:aload_0         
	// 2176 4066:getfield        #12  <Field azh a>
	// 2177 4069:astore_1        
		abyte0.aX = ((azh) (abyte0)).aG & a.aX;
	// 2178 4070:aload_1         
	// 2179 4071:aload_1         
	// 2180 4072:getfield        #267 <Field int azh.aG>
	// 2181 4075:aload_0         
	// 2182 4076:getfield        #12  <Field azh a>
	// 2183 4079:getfield        #264 <Field int azh.aX>
	// 2184 4082:iand            
	// 2185 4083:putfield        #264 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 2186 4086:aload_0         
	// 2187 4087:getfield        #12  <Field azh a>
	// 2188 4090:astore_1        
		abyte0.bk = ((azh) (abyte0)).v & a.bk;
	// 2189 4091:aload_1         
	// 2190 4092:aload_1         
	// 2191 4093:getfield        #258 <Field int azh.v>
	// 2192 4096:aload_0         
	// 2193 4097:getfield        #12  <Field azh a>
	// 2194 4100:getfield        #234 <Field int azh.bk>
	// 2195 4103:iand            
	// 2196 4104:putfield        #234 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 2197 4107:aload_0         
	// 2198 4108:getfield        #12  <Field azh a>
	// 2199 4111:astore_1        
		abyte0.bk = ((azh) (abyte0)).f ^ a.bk;
	// 2200 4112:aload_1         
	// 2201 4113:aload_1         
	// 2202 4114:getfield        #261 <Field int azh.f>
	// 2203 4117:aload_0         
	// 2204 4118:getfield        #12  <Field azh a>
	// 2205 4121:getfield        #234 <Field int azh.bk>
	// 2206 4124:ixor            
	// 2207 4125:putfield        #234 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 2208 4128:aload_0         
	// 2209 4129:getfield        #12  <Field azh a>
	// 2210 4132:astore_1        
		abyte0.aL = ((azh) (abyte0)).L & a.f;
	// 2211 4133:aload_1         
	// 2212 4134:aload_1         
	// 2213 4135:getfield        #237 <Field int azh.L>
	// 2214 4138:aload_0         
	// 2215 4139:getfield        #12  <Field azh a>
	// 2216 4142:getfield        #261 <Field int azh.f>
	// 2217 4145:iand            
	// 2218 4146:putfield        #249 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 2219 4149:aload_0         
	// 2220 4150:getfield        #12  <Field azh a>
	// 2221 4153:astore_1        
		abyte0.cb = ((azh) (abyte0)).aL ^ a.cb;
	// 2222 4154:aload_1         
	// 2223 4155:aload_1         
	// 2224 4156:getfield        #249 <Field int azh.aL>
	// 2225 4159:aload_0         
	// 2226 4160:getfield        #12  <Field azh a>
	// 2227 4163:getfield        #240 <Field int azh.cb>
	// 2228 4166:ixor            
	// 2229 4167:putfield        #240 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 2230 4170:aload_0         
	// 2231 4171:getfield        #12  <Field azh a>
	// 2232 4174:astore_1        
		abyte0.cb = ((azh) (abyte0)).D & ~a.cb;
	// 2233 4175:aload_1         
	// 2234 4176:aload_1         
	// 2235 4177:getfield        #26  <Field int azh.D>
	// 2236 4180:aload_0         
	// 2237 4181:getfield        #12  <Field azh a>
	// 2238 4184:getfield        #240 <Field int azh.cb>
	// 2239 4187:iconst_m1       
	// 2240 4188:ixor            
	// 2241 4189:iand            
	// 2242 4190:putfield        #240 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 2243 4193:aload_0         
	// 2244 4194:getfield        #12  <Field azh a>
	// 2245 4197:astore_1        
		abyte0.cb = ((azh) (abyte0)).bk ^ a.cb;
	// 2246 4198:aload_1         
	// 2247 4199:aload_1         
	// 2248 4200:getfield        #234 <Field int azh.bk>
	// 2249 4203:aload_0         
	// 2250 4204:getfield        #12  <Field azh a>
	// 2251 4207:getfield        #240 <Field int azh.cb>
	// 2252 4210:ixor            
	// 2253 4211:putfield        #240 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 2254 4214:aload_0         
	// 2255 4215:getfield        #12  <Field azh a>
	// 2256 4218:astore_1        
		abyte0.bX = ((azh) (abyte0)).v & a.aL;
	// 2257 4219:aload_1         
	// 2258 4220:aload_1         
	// 2259 4221:getfield        #258 <Field int azh.v>
	// 2260 4224:aload_0         
	// 2261 4225:getfield        #12  <Field azh a>
	// 2262 4228:getfield        #249 <Field int azh.aL>
	// 2263 4231:iand            
	// 2264 4232:putfield        #228 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 2265 4235:aload_0         
	// 2266 4236:getfield        #12  <Field azh a>
	// 2267 4239:astore_1        
		abyte0.bX = ((azh) (abyte0)).D & ~a.bX;
	// 2268 4240:aload_1         
	// 2269 4241:aload_1         
	// 2270 4242:getfield        #26  <Field int azh.D>
	// 2271 4245:aload_0         
	// 2272 4246:getfield        #12  <Field azh a>
	// 2273 4249:getfield        #228 <Field int azh.bX>
	// 2274 4252:iconst_m1       
	// 2275 4253:ixor            
	// 2276 4254:iand            
	// 2277 4255:putfield        #228 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 2278 4258:aload_0         
	// 2279 4259:getfield        #12  <Field azh a>
	// 2280 4262:astore_1        
		abyte0.bX = ((azh) (abyte0)).bq ^ a.bX;
	// 2281 4263:aload_1         
	// 2282 4264:aload_1         
	// 2283 4265:getfield        #270 <Field int azh.bq>
	// 2284 4268:aload_0         
	// 2285 4269:getfield        #12  <Field azh a>
	// 2286 4272:getfield        #228 <Field int azh.bX>
	// 2287 4275:ixor            
	// 2288 4276:putfield        #228 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 2289 4279:aload_0         
	// 2290 4280:getfield        #12  <Field azh a>
	// 2291 4283:astore_1        
		abyte0.aX = ((azh) (abyte0)).bX ^ a.aX;
	// 2292 4284:aload_1         
	// 2293 4285:aload_1         
	// 2294 4286:getfield        #228 <Field int azh.bX>
	// 2295 4289:aload_0         
	// 2296 4290:getfield        #12  <Field azh a>
	// 2297 4293:getfield        #264 <Field int azh.aX>
	// 2298 4296:ixor            
	// 2299 4297:putfield        #264 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 2300 4300:aload_0         
	// 2301 4301:getfield        #12  <Field azh a>
	// 2302 4304:astore_1        
		abyte0.bX = ((azh) (abyte0)).aX | a.br;
	// 2303 4305:aload_1         
	// 2304 4306:aload_1         
	// 2305 4307:getfield        #264 <Field int azh.aX>
	// 2306 4310:aload_0         
	// 2307 4311:getfield        #12  <Field azh a>
	// 2308 4314:getfield        #273 <Field int azh.br>
	// 2309 4317:ior             
	// 2310 4318:putfield        #228 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 2311 4321:aload_0         
	// 2312 4322:getfield        #12  <Field azh a>
	// 2313 4325:astore_1        
		abyte0.aX = ((azh) (abyte0)).br & a.aX;
	// 2314 4326:aload_1         
	// 2315 4327:aload_1         
	// 2316 4328:getfield        #273 <Field int azh.br>
	// 2317 4331:aload_0         
	// 2318 4332:getfield        #12  <Field azh a>
	// 2319 4335:getfield        #264 <Field int azh.aX>
	// 2320 4338:iand            
	// 2321 4339:putfield        #264 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 2322 4342:aload_0         
	// 2323 4343:getfield        #12  <Field azh a>
	// 2324 4346:astore_1        
		abyte0.bq = ((azh) (abyte0)).v & ~a.aL;
	// 2325 4347:aload_1         
	// 2326 4348:aload_1         
	// 2327 4349:getfield        #258 <Field int azh.v>
	// 2328 4352:aload_0         
	// 2329 4353:getfield        #12  <Field azh a>
	// 2330 4356:getfield        #249 <Field int azh.aL>
	// 2331 4359:iconst_m1       
	// 2332 4360:ixor            
	// 2333 4361:iand            
	// 2334 4362:putfield        #270 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 2335 4365:aload_0         
	// 2336 4366:getfield        #12  <Field azh a>
	// 2337 4369:astore_1        
		abyte0.bq = ((azh) (abyte0)).D & ~a.bq;
	// 2338 4370:aload_1         
	// 2339 4371:aload_1         
	// 2340 4372:getfield        #26  <Field int azh.D>
	// 2341 4375:aload_0         
	// 2342 4376:getfield        #12  <Field azh a>
	// 2343 4379:getfield        #270 <Field int azh.bq>
	// 2344 4382:iconst_m1       
	// 2345 4383:ixor            
	// 2346 4384:iand            
	// 2347 4385:putfield        #270 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 2348 4388:aload_0         
	// 2349 4389:getfield        #12  <Field azh a>
	// 2350 4392:astore_1        
		abyte0.bs = ((azh) (abyte0)).v & ~a.aL;
	// 2351 4393:aload_1         
	// 2352 4394:aload_1         
	// 2353 4395:getfield        #258 <Field int azh.v>
	// 2354 4398:aload_0         
	// 2355 4399:getfield        #12  <Field azh a>
	// 2356 4402:getfield        #249 <Field int azh.aL>
	// 2357 4405:iconst_m1       
	// 2358 4406:ixor            
	// 2359 4407:iand            
	// 2360 4408:putfield        #219 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 2361 4411:aload_0         
	// 2362 4412:getfield        #12  <Field azh a>
	// 2363 4415:astore_1        
		abyte0.bs = ((azh) (abyte0)).L ^ a.bs;
	// 2364 4416:aload_1         
	// 2365 4417:aload_1         
	// 2366 4418:getfield        #237 <Field int azh.L>
	// 2367 4421:aload_0         
	// 2368 4422:getfield        #12  <Field azh a>
	// 2369 4425:getfield        #219 <Field int azh.bs>
	// 2370 4428:ixor            
	// 2371 4429:putfield        #219 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 2372 4432:aload_0         
	// 2373 4433:getfield        #12  <Field azh a>
	// 2374 4436:astore_1        
		abyte0.aS = ((azh) (abyte0)).bs ^ a.aS;
	// 2375 4437:aload_1         
	// 2376 4438:aload_1         
	// 2377 4439:getfield        #219 <Field int azh.bs>
	// 2378 4442:aload_0         
	// 2379 4443:getfield        #12  <Field azh a>
	// 2380 4446:getfield        #276 <Field int azh.aS>
	// 2381 4449:ixor            
	// 2382 4450:putfield        #276 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 2383 4453:aload_0         
	// 2384 4454:getfield        #12  <Field azh a>
	// 2385 4457:astore_1        
		abyte0.aS = ((azh) (abyte0)).aG & ~a.aS;
	// 2386 4458:aload_1         
	// 2387 4459:aload_1         
	// 2388 4460:getfield        #267 <Field int azh.aG>
	// 2389 4463:aload_0         
	// 2390 4464:getfield        #12  <Field azh a>
	// 2391 4467:getfield        #276 <Field int azh.aS>
	// 2392 4470:iconst_m1       
	// 2393 4471:ixor            
	// 2394 4472:iand            
	// 2395 4473:putfield        #276 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 2396 4476:aload_0         
	// 2397 4477:getfield        #12  <Field azh a>
	// 2398 4480:astore_1        
		abyte0.ci = ((azh) (abyte0)).aL ^ a.ci;
	// 2399 4481:aload_1         
	// 2400 4482:aload_1         
	// 2401 4483:getfield        #249 <Field int azh.aL>
	// 2402 4486:aload_0         
	// 2403 4487:getfield        #12  <Field azh a>
	// 2404 4490:getfield        #71  <Field int azh.ci>
	// 2405 4493:ixor            
	// 2406 4494:putfield        #71  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 2407 4497:aload_0         
	// 2408 4498:getfield        #12  <Field azh a>
	// 2409 4501:astore_1        
		abyte0.bs = ((azh) (abyte0)).D & a.ci;
	// 2410 4502:aload_1         
	// 2411 4503:aload_1         
	// 2412 4504:getfield        #26  <Field int azh.D>
	// 2413 4507:aload_0         
	// 2414 4508:getfield        #12  <Field azh a>
	// 2415 4511:getfield        #71  <Field int azh.ci>
	// 2416 4514:iand            
	// 2417 4515:putfield        #219 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 2418 4518:aload_0         
	// 2419 4519:getfield        #12  <Field azh a>
	// 2420 4522:astore_1        
		abyte0.bs = ((azh) (abyte0)).bk ^ a.bs;
	// 2421 4523:aload_1         
	// 2422 4524:aload_1         
	// 2423 4525:getfield        #234 <Field int azh.bk>
	// 2424 4528:aload_0         
	// 2425 4529:getfield        #12  <Field azh a>
	// 2426 4532:getfield        #219 <Field int azh.bs>
	// 2427 4535:ixor            
	// 2428 4536:putfield        #219 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 2429 4539:aload_0         
	// 2430 4540:getfield        #12  <Field azh a>
	// 2431 4543:astore_1        
		abyte0.bs = ((azh) (abyte0)).aG & ~a.bs;
	// 2432 4544:aload_1         
	// 2433 4545:aload_1         
	// 2434 4546:getfield        #267 <Field int azh.aG>
	// 2435 4549:aload_0         
	// 2436 4550:getfield        #12  <Field azh a>
	// 2437 4553:getfield        #219 <Field int azh.bs>
	// 2438 4556:iconst_m1       
	// 2439 4557:ixor            
	// 2440 4558:iand            
	// 2441 4559:putfield        #219 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 2442 4562:aload_0         
	// 2443 4563:getfield        #12  <Field azh a>
	// 2444 4566:astore_1        
		abyte0.ci = ((azh) (abyte0)).D & a.ci;
	// 2445 4567:aload_1         
	// 2446 4568:aload_1         
	// 2447 4569:getfield        #26  <Field int azh.D>
	// 2448 4572:aload_0         
	// 2449 4573:getfield        #12  <Field azh a>
	// 2450 4576:getfield        #71  <Field int azh.ci>
	// 2451 4579:iand            
	// 2452 4580:putfield        #71  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 2453 4583:aload_0         
	// 2454 4584:getfield        #12  <Field azh a>
	// 2455 4587:astore_1        
		abyte0.aL = ((azh) (abyte0)).f & ~a.aL;
	// 2456 4588:aload_1         
	// 2457 4589:aload_1         
	// 2458 4590:getfield        #261 <Field int azh.f>
	// 2459 4593:aload_0         
	// 2460 4594:getfield        #12  <Field azh a>
	// 2461 4597:getfield        #249 <Field int azh.aL>
	// 2462 4600:iconst_m1       
	// 2463 4601:ixor            
	// 2464 4602:iand            
	// 2465 4603:putfield        #249 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 2466 4606:aload_0         
	// 2467 4607:getfield        #12  <Field azh a>
	// 2468 4610:astore_1        
		abyte0.ap = ((azh) (abyte0)).aL ^ a.ap;
	// 2469 4611:aload_1         
	// 2470 4612:aload_1         
	// 2471 4613:getfield        #249 <Field int azh.aL>
	// 2472 4616:aload_0         
	// 2473 4617:getfield        #12  <Field azh a>
	// 2474 4620:getfield        #68  <Field int azh.ap>
	// 2475 4623:ixor            
	// 2476 4624:putfield        #68  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 2477 4627:aload_0         
	// 2478 4628:getfield        #12  <Field azh a>
	// 2479 4631:astore_1        
		abyte0.ci = ((azh) (abyte0)).ap ^ a.ci;
	// 2480 4632:aload_1         
	// 2481 4633:aload_1         
	// 2482 4634:getfield        #68  <Field int azh.ap>
	// 2483 4637:aload_0         
	// 2484 4638:getfield        #12  <Field azh a>
	// 2485 4641:getfield        #71  <Field int azh.ci>
	// 2486 4644:ixor            
	// 2487 4645:putfield        #71  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 2488 4648:aload_0         
	// 2489 4649:getfield        #12  <Field azh a>
	// 2490 4652:astore_1        
		abyte0.ci = ((azh) (abyte0)).aG & ~a.ci;
	// 2491 4653:aload_1         
	// 2492 4654:aload_1         
	// 2493 4655:getfield        #267 <Field int azh.aG>
	// 2494 4658:aload_0         
	// 2495 4659:getfield        #12  <Field azh a>
	// 2496 4662:getfield        #71  <Field int azh.ci>
	// 2497 4665:iconst_m1       
	// 2498 4666:ixor            
	// 2499 4667:iand            
	// 2500 4668:putfield        #71  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 2501 4671:aload_0         
	// 2502 4672:getfield        #12  <Field azh a>
	// 2503 4675:astore_1        
		abyte0.ci = ((azh) (abyte0)).cb ^ a.ci;
	// 2504 4676:aload_1         
	// 2505 4677:aload_1         
	// 2506 4678:getfield        #240 <Field int azh.cb>
	// 2507 4681:aload_0         
	// 2508 4682:getfield        #12  <Field azh a>
	// 2509 4685:getfield        #71  <Field int azh.ci>
	// 2510 4688:ixor            
	// 2511 4689:putfield        #71  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 2512 4692:aload_0         
	// 2513 4693:getfield        #12  <Field azh a>
	// 2514 4696:astore_1        
		abyte0.aL = ((azh) (abyte0)).v & ~a.aL;
	// 2515 4697:aload_1         
	// 2516 4698:aload_1         
	// 2517 4699:getfield        #258 <Field int azh.v>
	// 2518 4702:aload_0         
	// 2519 4703:getfield        #12  <Field azh a>
	// 2520 4706:getfield        #249 <Field int azh.aL>
	// 2521 4709:iconst_m1       
	// 2522 4710:ixor            
	// 2523 4711:iand            
	// 2524 4712:putfield        #249 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 2525 4715:aload_0         
	// 2526 4716:getfield        #12  <Field azh a>
	// 2527 4719:astore_1        
		abyte0.aL = ((azh) (abyte0)).L ^ a.aL;
	// 2528 4720:aload_1         
	// 2529 4721:aload_1         
	// 2530 4722:getfield        #237 <Field int azh.L>
	// 2531 4725:aload_0         
	// 2532 4726:getfield        #12  <Field azh a>
	// 2533 4729:getfield        #249 <Field int azh.aL>
	// 2534 4732:ixor            
	// 2535 4733:putfield        #249 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 2536 4736:aload_0         
	// 2537 4737:getfield        #12  <Field azh a>
	// 2538 4740:astore_1        
		abyte0.bT = ((azh) (abyte0)).aL ^ a.bT;
	// 2539 4741:aload_1         
	// 2540 4742:aload_1         
	// 2541 4743:getfield        #249 <Field int azh.aL>
	// 2542 4746:aload_0         
	// 2543 4747:getfield        #12  <Field azh a>
	// 2544 4750:getfield        #35  <Field int azh.bT>
	// 2545 4753:ixor            
	// 2546 4754:putfield        #35  <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 2547 4757:aload_0         
	// 2548 4758:getfield        #12  <Field azh a>
	// 2549 4761:astore_1        
		abyte0.aS = ((azh) (abyte0)).bT ^ a.aS;
	// 2550 4762:aload_1         
	// 2551 4763:aload_1         
	// 2552 4764:getfield        #35  <Field int azh.bT>
	// 2553 4767:aload_0         
	// 2554 4768:getfield        #12  <Field azh a>
	// 2555 4771:getfield        #276 <Field int azh.aS>
	// 2556 4774:ixor            
	// 2557 4775:putfield        #276 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 2558 4778:aload_0         
	// 2559 4779:getfield        #12  <Field azh a>
	// 2560 4782:astore_1        
		abyte0.bT = ((azh) (abyte0)).aS | a.br;
	// 2561 4783:aload_1         
	// 2562 4784:aload_1         
	// 2563 4785:getfield        #276 <Field int azh.aS>
	// 2564 4788:aload_0         
	// 2565 4789:getfield        #12  <Field azh a>
	// 2566 4792:getfield        #273 <Field int azh.br>
	// 2567 4795:ior             
	// 2568 4796:putfield        #35  <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 2569 4799:aload_0         
	// 2570 4800:getfield        #12  <Field azh a>
	// 2571 4803:astore_1        
		abyte0.bT = ((azh) (abyte0)).ci ^ a.bT;
	// 2572 4804:aload_1         
	// 2573 4805:aload_1         
	// 2574 4806:getfield        #71  <Field int azh.ci>
	// 2575 4809:aload_0         
	// 2576 4810:getfield        #12  <Field azh a>
	// 2577 4813:getfield        #35  <Field int azh.bT>
	// 2578 4816:ixor            
	// 2579 4817:putfield        #35  <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 2580 4820:aload_0         
	// 2581 4821:getfield        #12  <Field azh a>
	// 2582 4824:astore_1        
		abyte0.bT = ((azh) (abyte0)).bT ^ a.W;
	// 2583 4825:aload_1         
	// 2584 4826:aload_1         
	// 2585 4827:getfield        #35  <Field int azh.bT>
	// 2586 4830:aload_0         
	// 2587 4831:getfield        #12  <Field azh a>
	// 2588 4834:getfield        #207 <Field int azh.W>
	// 2589 4837:ixor            
	// 2590 4838:putfield        #35  <Field int azh.bT>
		abyte0 = ((byte []) (a));
	// 2591 4841:aload_0         
	// 2592 4842:getfield        #12  <Field azh a>
	// 2593 4845:astore_1        
		abyte0.cc = ((azh) (abyte0)).bT & ~a.cc;
	// 2594 4846:aload_1         
	// 2595 4847:aload_1         
	// 2596 4848:getfield        #35  <Field int azh.bT>
	// 2597 4851:aload_0         
	// 2598 4852:getfield        #12  <Field azh a>
	// 2599 4855:getfield        #252 <Field int azh.cc>
	// 2600 4858:iconst_m1       
	// 2601 4859:ixor            
	// 2602 4860:iand            
	// 2603 4861:putfield        #252 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 2604 4864:aload_0         
	// 2605 4865:getfield        #12  <Field azh a>
	// 2606 4868:astore_1        
		abyte0.aS = ((azh) (abyte0)).br & a.aS;
	// 2607 4869:aload_1         
	// 2608 4870:aload_1         
	// 2609 4871:getfield        #273 <Field int azh.br>
	// 2610 4874:aload_0         
	// 2611 4875:getfield        #12  <Field azh a>
	// 2612 4878:getfield        #276 <Field int azh.aS>
	// 2613 4881:iand            
	// 2614 4882:putfield        #276 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 2615 4885:aload_0         
	// 2616 4886:getfield        #12  <Field azh a>
	// 2617 4889:astore_1        
		abyte0.aS = ((azh) (abyte0)).ci ^ a.aS;
	// 2618 4890:aload_1         
	// 2619 4891:aload_1         
	// 2620 4892:getfield        #71  <Field int azh.ci>
	// 2621 4895:aload_0         
	// 2622 4896:getfield        #12  <Field azh a>
	// 2623 4899:getfield        #276 <Field int azh.aS>
	// 2624 4902:ixor            
	// 2625 4903:putfield        #276 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 2626 4906:aload_0         
	// 2627 4907:getfield        #12  <Field azh a>
	// 2628 4910:astore_1        
		abyte0.I = ((azh) (abyte0)).aS ^ a.I;
	// 2629 4911:aload_1         
	// 2630 4912:aload_1         
	// 2631 4913:getfield        #276 <Field int azh.aS>
	// 2632 4916:aload_0         
	// 2633 4917:getfield        #12  <Field azh a>
	// 2634 4920:getfield        #79  <Field int azh.I>
	// 2635 4923:ixor            
	// 2636 4924:putfield        #79  <Field int azh.I>
		abyte0 = ((byte []) (a));
	// 2637 4927:aload_0         
	// 2638 4928:getfield        #12  <Field azh a>
	// 2639 4931:astore_1        
		abyte0.aS = ((azh) (abyte0)).bo & ~a.I;
	// 2640 4932:aload_1         
	// 2641 4933:aload_1         
	// 2642 4934:getfield        #32  <Field int azh.bo>
	// 2643 4937:aload_0         
	// 2644 4938:getfield        #12  <Field azh a>
	// 2645 4941:getfield        #79  <Field int azh.I>
	// 2646 4944:iconst_m1       
	// 2647 4945:ixor            
	// 2648 4946:iand            
	// 2649 4947:putfield        #276 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 2650 4950:aload_0         
	// 2651 4951:getfield        #12  <Field azh a>
	// 2652 4954:astore_1        
		abyte0.bq = ((azh) (abyte0)).aL ^ a.bq;
	// 2653 4955:aload_1         
	// 2654 4956:aload_1         
	// 2655 4957:getfield        #249 <Field int azh.aL>
	// 2656 4960:aload_0         
	// 2657 4961:getfield        #12  <Field azh a>
	// 2658 4964:getfield        #270 <Field int azh.bq>
	// 2659 4967:ixor            
	// 2660 4968:putfield        #270 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 2661 4971:aload_0         
	// 2662 4972:getfield        #12  <Field azh a>
	// 2663 4975:astore_1        
		abyte0.bs = ((azh) (abyte0)).bq ^ a.bs;
	// 2664 4976:aload_1         
	// 2665 4977:aload_1         
	// 2666 4978:getfield        #270 <Field int azh.bq>
	// 2667 4981:aload_0         
	// 2668 4982:getfield        #12  <Field azh a>
	// 2669 4985:getfield        #219 <Field int azh.bs>
	// 2670 4988:ixor            
	// 2671 4989:putfield        #219 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 2672 4992:aload_0         
	// 2673 4993:getfield        #12  <Field azh a>
	// 2674 4996:astore_1        
		abyte0.aX = ((azh) (abyte0)).bs ^ a.aX;
	// 2675 4997:aload_1         
	// 2676 4998:aload_1         
	// 2677 4999:getfield        #219 <Field int azh.bs>
	// 2678 5002:aload_0         
	// 2679 5003:getfield        #12  <Field azh a>
	// 2680 5006:getfield        #264 <Field int azh.aX>
	// 2681 5009:ixor            
	// 2682 5010:putfield        #264 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 2683 5013:aload_0         
	// 2684 5014:getfield        #12  <Field azh a>
	// 2685 5017:astore_1        
		abyte0.aa = ((azh) (abyte0)).aX ^ a.aa;
	// 2686 5018:aload_1         
	// 2687 5019:aload_1         
	// 2688 5020:getfield        #264 <Field int azh.aX>
	// 2689 5023:aload_0         
	// 2690 5024:getfield        #12  <Field azh a>
	// 2691 5027:getfield        #279 <Field int azh.aa>
	// 2692 5030:ixor            
	// 2693 5031:putfield        #279 <Field int azh.aa>
		abyte0 = ((byte []) (a));
	// 2694 5034:aload_0         
	// 2695 5035:getfield        #12  <Field azh a>
	// 2696 5038:astore_1        
		abyte0.bX = ((azh) (abyte0)).bs ^ a.bX;
	// 2697 5039:aload_1         
	// 2698 5040:aload_1         
	// 2699 5041:getfield        #219 <Field int azh.bs>
	// 2700 5044:aload_0         
	// 2701 5045:getfield        #12  <Field azh a>
	// 2702 5048:getfield        #228 <Field int azh.bX>
	// 2703 5051:ixor            
	// 2704 5052:putfield        #228 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 2705 5055:aload_0         
	// 2706 5056:getfield        #12  <Field azh a>
	// 2707 5059:astore_1        
		abyte0.ak = ((azh) (abyte0)).bX ^ a.ak;
	// 2708 5060:aload_1         
	// 2709 5061:aload_1         
	// 2710 5062:getfield        #228 <Field int azh.bX>
	// 2711 5065:aload_0         
	// 2712 5066:getfield        #12  <Field azh a>
	// 2713 5069:getfield        #282 <Field int azh.ak>
	// 2714 5072:ixor            
	// 2715 5073:putfield        #282 <Field int azh.ak>
		abyte0 = ((byte []) (a));
	// 2716 5076:aload_0         
	// 2717 5077:getfield        #12  <Field azh a>
	// 2718 5080:astore_1        
		abyte0.bX = ((azh) (abyte0)).ak & ~a.a;
	// 2719 5081:aload_1         
	// 2720 5082:aload_1         
	// 2721 5083:getfield        #282 <Field int azh.ak>
	// 2722 5086:aload_0         
	// 2723 5087:getfield        #12  <Field azh a>
	// 2724 5090:getfield        #183 <Field int azh.a>
	// 2725 5093:iconst_m1       
	// 2726 5094:ixor            
	// 2727 5095:iand            
	// 2728 5096:putfield        #228 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 2729 5099:aload_0         
	// 2730 5100:getfield        #12  <Field azh a>
	// 2731 5103:astore_1        
		abyte0.bX = ((azh) (abyte0)).a ^ a.bX;
	// 2732 5104:aload_1         
	// 2733 5105:aload_1         
	// 2734 5106:getfield        #183 <Field int azh.a>
	// 2735 5109:aload_0         
	// 2736 5110:getfield        #12  <Field azh a>
	// 2737 5113:getfield        #228 <Field int azh.bX>
	// 2738 5116:ixor            
	// 2739 5117:putfield        #228 <Field int azh.bX>
		abyte0 = ((byte []) (a));
	// 2740 5120:aload_0         
	// 2741 5121:getfield        #12  <Field azh a>
	// 2742 5124:astore_1        
		abyte0.bs = ((azh) (abyte0)).ak & a.a;
	// 2743 5125:aload_1         
	// 2744 5126:aload_1         
	// 2745 5127:getfield        #282 <Field int azh.ak>
	// 2746 5130:aload_0         
	// 2747 5131:getfield        #12  <Field azh a>
	// 2748 5134:getfield        #183 <Field int azh.a>
	// 2749 5137:iand            
	// 2750 5138:putfield        #219 <Field int azh.bs>
		abyte0 = ((byte []) (a));
	// 2751 5141:aload_0         
	// 2752 5142:getfield        #12  <Field azh a>
	// 2753 5145:astore_1        
		abyte0.aK = ((azh) (abyte0)).L | a.aK;
	// 2754 5146:aload_1         
	// 2755 5147:aload_1         
	// 2756 5148:getfield        #237 <Field int azh.L>
	// 2757 5151:aload_0         
	// 2758 5152:getfield        #12  <Field azh a>
	// 2759 5155:getfield        #44  <Field int azh.aK>
	// 2760 5158:ior             
	// 2761 5159:putfield        #44  <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 2762 5162:aload_0         
	// 2763 5163:getfield        #12  <Field azh a>
	// 2764 5166:astore_1        
		abyte0.aK = ((azh) (abyte0)).bz ^ a.aK;
	// 2765 5167:aload_1         
	// 2766 5168:aload_1         
	// 2767 5169:getfield        #74  <Field int azh.bz>
	// 2768 5172:aload_0         
	// 2769 5173:getfield        #12  <Field azh a>
	// 2770 5176:getfield        #44  <Field int azh.aK>
	// 2771 5179:ixor            
	// 2772 5180:putfield        #44  <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 2773 5183:aload_0         
	// 2774 5184:getfield        #12  <Field azh a>
	// 2775 5187:astore_1        
		abyte0.aK = ((azh) (abyte0)).h & ~a.aK;
	// 2776 5188:aload_1         
	// 2777 5189:aload_1         
	// 2778 5190:getfield        #94  <Field int azh.h>
	// 2779 5193:aload_0         
	// 2780 5194:getfield        #12  <Field azh a>
	// 2781 5197:getfield        #44  <Field int azh.aK>
	// 2782 5200:iconst_m1       
	// 2783 5201:ixor            
	// 2784 5202:iand            
	// 2785 5203:putfield        #44  <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 2786 5206:aload_0         
	// 2787 5207:getfield        #12  <Field azh a>
	// 2788 5210:astore_1        
		abyte0.aK = ((azh) (abyte0)).bQ ^ a.aK;
	// 2789 5211:aload_1         
	// 2790 5212:aload_1         
	// 2791 5213:getfield        #243 <Field int azh.bQ>
	// 2792 5216:aload_0         
	// 2793 5217:getfield        #12  <Field azh a>
	// 2794 5220:getfield        #44  <Field int azh.aK>
	// 2795 5223:ixor            
	// 2796 5224:putfield        #44  <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 2797 5227:aload_0         
	// 2798 5228:getfield        #12  <Field azh a>
	// 2799 5231:astore_1        
		abyte0.as = ((azh) (abyte0)).aK ^ a.as;
	// 2800 5232:aload_1         
	// 2801 5233:aload_1         
	// 2802 5234:getfield        #44  <Field int azh.aK>
	// 2803 5237:aload_0         
	// 2804 5238:getfield        #12  <Field azh a>
	// 2805 5241:getfield        #210 <Field int azh.as>
	// 2806 5244:ixor            
	// 2807 5245:putfield        #210 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 2808 5248:aload_0         
	// 2809 5249:getfield        #12  <Field azh a>
	// 2810 5252:astore_1        
		abyte0.w = ((azh) (abyte0)).as ^ a.w;
	// 2811 5253:aload_1         
	// 2812 5254:aload_1         
	// 2813 5255:getfield        #210 <Field int azh.as>
	// 2814 5258:aload_0         
	// 2815 5259:getfield        #12  <Field azh a>
	// 2816 5262:getfield        #285 <Field int azh.w>
	// 2817 5265:ixor            
	// 2818 5266:putfield        #285 <Field int azh.w>
		abyte0 = ((byte []) (a));
	// 2819 5269:aload_0         
	// 2820 5270:getfield        #12  <Field azh a>
	// 2821 5273:astore_1        
		abyte0.aU = ((azh) (abyte0)).L | a.aU;
	// 2822 5274:aload_1         
	// 2823 5275:aload_1         
	// 2824 5276:getfield        #237 <Field int azh.L>
	// 2825 5279:aload_0         
	// 2826 5280:getfield        #12  <Field azh a>
	// 2827 5283:getfield        #288 <Field int azh.aU>
	// 2828 5286:ior             
	// 2829 5287:putfield        #288 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 2830 5290:aload_0         
	// 2831 5291:getfield        #12  <Field azh a>
	// 2832 5294:astore_1        
		abyte0.aU = ((azh) (abyte0)).az ^ a.aU;
	// 2833 5295:aload_1         
	// 2834 5296:aload_1         
	// 2835 5297:getfield        #50  <Field int azh.az>
	// 2836 5300:aload_0         
	// 2837 5301:getfield        #12  <Field azh a>
	// 2838 5304:getfield        #288 <Field int azh.aU>
	// 2839 5307:ixor            
	// 2840 5308:putfield        #288 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 2841 5311:aload_0         
	// 2842 5312:getfield        #12  <Field azh a>
	// 2843 5315:astore_1        
		abyte0.aU = ((azh) (abyte0)).h & ~a.aU;
	// 2844 5316:aload_1         
	// 2845 5317:aload_1         
	// 2846 5318:getfield        #94  <Field int azh.h>
	// 2847 5321:aload_0         
	// 2848 5322:getfield        #12  <Field azh a>
	// 2849 5325:getfield        #288 <Field int azh.aU>
	// 2850 5328:iconst_m1       
	// 2851 5329:ixor            
	// 2852 5330:iand            
	// 2853 5331:putfield        #288 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 2854 5334:aload_0         
	// 2855 5335:getfield        #12  <Field azh a>
	// 2856 5338:astore_1        
		abyte0.aU = ((azh) (abyte0)).ba ^ a.aU;
	// 2857 5339:aload_1         
	// 2858 5340:aload_1         
	// 2859 5341:getfield        #65  <Field int azh.ba>
	// 2860 5344:aload_0         
	// 2861 5345:getfield        #12  <Field azh a>
	// 2862 5348:getfield        #288 <Field int azh.aU>
	// 2863 5351:ixor            
	// 2864 5352:putfield        #288 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 2865 5355:aload_0         
	// 2866 5356:getfield        #12  <Field azh a>
	// 2867 5359:astore_1        
		abyte0.aU = ((azh) (abyte0)).aj & ~a.aU;
	// 2868 5360:aload_1         
	// 2869 5361:aload_1         
	// 2870 5362:getfield        #246 <Field int azh.aj>
	// 2871 5365:aload_0         
	// 2872 5366:getfield        #12  <Field azh a>
	// 2873 5369:getfield        #288 <Field int azh.aU>
	// 2874 5372:iconst_m1       
	// 2875 5373:ixor            
	// 2876 5374:iand            
	// 2877 5375:putfield        #288 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 2878 5378:aload_0         
	// 2879 5379:getfield        #12  <Field azh a>
	// 2880 5382:astore_1        
		abyte0.aU = ((azh) (abyte0)).bi ^ a.aU;
	// 2881 5383:aload_1         
	// 2882 5384:aload_1         
	// 2883 5385:getfield        #62  <Field int azh.bi>
	// 2884 5388:aload_0         
	// 2885 5389:getfield        #12  <Field azh a>
	// 2886 5392:getfield        #288 <Field int azh.aU>
	// 2887 5395:ixor            
	// 2888 5396:putfield        #288 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 2889 5399:aload_0         
	// 2890 5400:getfield        #12  <Field azh a>
	// 2891 5403:astore_1        
		abyte0.e = ((azh) (abyte0)).aU ^ a.e;
	// 2892 5404:aload_1         
	// 2893 5405:aload_1         
	// 2894 5406:getfield        #288 <Field int azh.aU>
	// 2895 5409:aload_0         
	// 2896 5410:getfield        #12  <Field azh a>
	// 2897 5413:getfield        #291 <Field int azh.e>
	// 2898 5416:ixor            
	// 2899 5417:putfield        #291 <Field int azh.e>
		abyte0 = ((byte []) (a));
	// 2900 5420:aload_0         
	// 2901 5421:getfield        #12  <Field azh a>
	// 2902 5424:astore_1        
		abyte0.aU = ((azh) (abyte0)).e & a.u;
	// 2903 5425:aload_1         
	// 2904 5426:aload_1         
	// 2905 5427:getfield        #291 <Field int azh.e>
	// 2906 5430:aload_0         
	// 2907 5431:getfield        #12  <Field azh a>
	// 2908 5434:getfield        #294 <Field int azh.u>
	// 2909 5437:iand            
	// 2910 5438:putfield        #288 <Field int azh.aU>
		abyte0 = ((byte []) (a));
	// 2911 5441:aload_0         
	// 2912 5442:getfield        #12  <Field azh a>
	// 2913 5445:astore_1        
		abyte0.bi = ((azh) (abyte0)).u & ~a.aU;
	// 2914 5446:aload_1         
	// 2915 5447:aload_1         
	// 2916 5448:getfield        #294 <Field int azh.u>
	// 2917 5451:aload_0         
	// 2918 5452:getfield        #12  <Field azh a>
	// 2919 5455:getfield        #288 <Field int azh.aU>
	// 2920 5458:iconst_m1       
	// 2921 5459:ixor            
	// 2922 5460:iand            
	// 2923 5461:putfield        #62  <Field int azh.bi>
		abyte0 = ((byte []) (a));
	// 2924 5464:aload_0         
	// 2925 5465:getfield        #12  <Field azh a>
	// 2926 5468:astore_1        
		abyte0.ba = ((azh) (abyte0)).e & ~a.u;
	// 2927 5469:aload_1         
	// 2928 5470:aload_1         
	// 2929 5471:getfield        #291 <Field int azh.e>
	// 2930 5474:aload_0         
	// 2931 5475:getfield        #12  <Field azh a>
	// 2932 5478:getfield        #294 <Field int azh.u>
	// 2933 5481:iconst_m1       
	// 2934 5482:ixor            
	// 2935 5483:iand            
	// 2936 5484:putfield        #65  <Field int azh.ba>
		abyte0 = ((byte []) (a));
	// 2937 5487:aload_0         
	// 2938 5488:getfield        #12  <Field azh a>
	// 2939 5491:astore_1        
		abyte0.az = ((azh) (abyte0)).ba & ~a.K;
	// 2940 5492:aload_1         
	// 2941 5493:aload_1         
	// 2942 5494:getfield        #65  <Field int azh.ba>
	// 2943 5497:aload_0         
	// 2944 5498:getfield        #12  <Field azh a>
	// 2945 5501:getfield        #192 <Field int azh.K>
	// 2946 5504:iconst_m1       
	// 2947 5505:ixor            
	// 2948 5506:iand            
	// 2949 5507:putfield        #50  <Field int azh.az>
		abyte0 = ((byte []) (a));
	// 2950 5510:aload_0         
	// 2951 5511:getfield        #12  <Field azh a>
	// 2952 5514:astore_1        
		abyte0.as = ((azh) (abyte0)).u & ~a.e;
	// 2953 5515:aload_1         
	// 2954 5516:aload_1         
	// 2955 5517:getfield        #294 <Field int azh.u>
	// 2956 5520:aload_0         
	// 2957 5521:getfield        #12  <Field azh a>
	// 2958 5524:getfield        #291 <Field int azh.e>
	// 2959 5527:iconst_m1       
	// 2960 5528:ixor            
	// 2961 5529:iand            
	// 2962 5530:putfield        #210 <Field int azh.as>
		abyte0 = ((byte []) (a));
	// 2963 5533:aload_0         
	// 2964 5534:getfield        #12  <Field azh a>
	// 2965 5537:astore_1        
		abyte0.aK = ((azh) (abyte0)).K & a.as;
	// 2966 5538:aload_1         
	// 2967 5539:aload_1         
	// 2968 5540:getfield        #192 <Field int azh.K>
	// 2969 5543:aload_0         
	// 2970 5544:getfield        #12  <Field azh a>
	// 2971 5547:getfield        #210 <Field int azh.as>
	// 2972 5550:iand            
	// 2973 5551:putfield        #44  <Field int azh.aK>
		abyte0 = ((byte []) (a));
	// 2974 5554:aload_0         
	// 2975 5555:getfield        #12  <Field azh a>
	// 2976 5558:astore_1        
		abyte0.bQ = ((azh) (abyte0)).e ^ a.u;
	// 2977 5559:aload_1         
	// 2978 5560:aload_1         
	// 2979 5561:getfield        #291 <Field int azh.e>
	// 2980 5564:aload_0         
	// 2981 5565:getfield        #12  <Field azh a>
	// 2982 5568:getfield        #294 <Field int azh.u>
	// 2983 5571:ixor            
	// 2984 5572:putfield        #243 <Field int azh.bQ>
		abyte0 = ((byte []) (a));
	// 2985 5575:aload_0         
	// 2986 5576:getfield        #12  <Field azh a>
	// 2987 5579:astore_1        
		abyte0.bz = ((azh) (abyte0)).u | a.e;
	// 2988 5580:aload_1         
	// 2989 5581:aload_1         
	// 2990 5582:getfield        #294 <Field int azh.u>
	// 2991 5585:aload_0         
	// 2992 5586:getfield        #12  <Field azh a>
	// 2993 5589:getfield        #291 <Field int azh.e>
	// 2994 5592:ior             
	// 2995 5593:putfield        #74  <Field int azh.bz>
		abyte0 = ((byte []) (a));
	// 2996 5596:aload_0         
	// 2997 5597:getfield        #12  <Field azh a>
	// 2998 5600:astore_1        
		abyte0.aX = ((azh) (abyte0)).bz & ~a.u;
	// 2999 5601:aload_1         
	// 3000 5602:aload_1         
	// 3001 5603:getfield        #74  <Field int azh.bz>
	// 3002 5606:aload_0         
	// 3003 5607:getfield        #12  <Field azh a>
	// 3004 5610:getfield        #294 <Field int azh.u>
	// 3005 5613:iconst_m1       
	// 3006 5614:ixor            
	// 3007 5615:iand            
	// 3008 5616:putfield        #264 <Field int azh.aX>
		abyte0 = ((byte []) (a));
	// 3009 5619:aload_0         
	// 3010 5620:getfield        #12  <Field azh a>
	// 3011 5623:astore_1        
		abyte0.bJ = ((azh) (abyte0)).L | a.bJ;
	// 3012 5624:aload_1         
	// 3013 5625:aload_1         
	// 3014 5626:getfield        #237 <Field int azh.L>
	// 3015 5629:aload_0         
	// 3016 5630:getfield        #12  <Field azh a>
	// 3017 5633:getfield        #53  <Field int azh.bJ>
	// 3018 5636:ior             
	// 3019 5637:putfield        #53  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 3020 5640:aload_0         
	// 3021 5641:getfield        #12  <Field azh a>
	// 3022 5644:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bj ^ a.bJ;
	// 3023 5645:aload_1         
	// 3024 5646:aload_1         
	// 3025 5647:getfield        #297 <Field int azh.bj>
	// 3026 5650:aload_0         
	// 3027 5651:getfield        #12  <Field azh a>
	// 3028 5654:getfield        #53  <Field int azh.bJ>
	// 3029 5657:ixor            
	// 3030 5658:putfield        #53  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 3031 5661:aload_0         
	// 3032 5662:getfield        #12  <Field azh a>
	// 3033 5665:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bJ & a.h;
	// 3034 5666:aload_1         
	// 3035 5667:aload_1         
	// 3036 5668:getfield        #53  <Field int azh.bJ>
	// 3037 5671:aload_0         
	// 3038 5672:getfield        #12  <Field azh a>
	// 3039 5675:getfield        #94  <Field int azh.h>
	// 3040 5678:iand            
	// 3041 5679:putfield        #53  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 3042 5682:aload_0         
	// 3043 5683:getfield        #12  <Field azh a>
	// 3044 5686:astore_1        
		abyte0.bJ = ((azh) (abyte0)).aZ ^ a.bJ;
	// 3045 5687:aload_1         
	// 3046 5688:aload_1         
	// 3047 5689:getfield        #41  <Field int azh.aZ>
	// 3048 5692:aload_0         
	// 3049 5693:getfield        #12  <Field azh a>
	// 3050 5696:getfield        #53  <Field int azh.bJ>
	// 3051 5699:ixor            
	// 3052 5700:putfield        #53  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 3053 5703:aload_0         
	// 3054 5704:getfield        #12  <Field azh a>
	// 3055 5707:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bJ & a.aj;
	// 3056 5708:aload_1         
	// 3057 5709:aload_1         
	// 3058 5710:getfield        #53  <Field int azh.bJ>
	// 3059 5713:aload_0         
	// 3060 5714:getfield        #12  <Field azh a>
	// 3061 5717:getfield        #246 <Field int azh.aj>
	// 3062 5720:iand            
	// 3063 5721:putfield        #53  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 3064 5724:aload_0         
	// 3065 5725:getfield        #12  <Field azh a>
	// 3066 5728:astore_1        
		abyte0.bJ = ((azh) (abyte0)).cd ^ a.bJ;
	// 3067 5729:aload_1         
	// 3068 5730:aload_1         
	// 3069 5731:getfield        #59  <Field int azh.cd>
	// 3070 5734:aload_0         
	// 3071 5735:getfield        #12  <Field azh a>
	// 3072 5738:getfield        #53  <Field int azh.bJ>
	// 3073 5741:ixor            
	// 3074 5742:putfield        #53  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 3075 5745:aload_0         
	// 3076 5746:getfield        #12  <Field azh a>
	// 3077 5749:astore_1        
		abyte0.q = ((azh) (abyte0)).bJ ^ a.q;
	// 3078 5750:aload_1         
	// 3079 5751:aload_1         
	// 3080 5752:getfield        #53  <Field int azh.bJ>
	// 3081 5755:aload_0         
	// 3082 5756:getfield        #12  <Field azh a>
	// 3083 5759:getfield        #300 <Field int azh.q>
	// 3084 5762:ixor            
	// 3085 5763:putfield        #300 <Field int azh.q>
		abyte0 = ((byte []) (a));
	// 3086 5766:aload_0         
	// 3087 5767:getfield        #12  <Field azh a>
	// 3088 5770:astore_1        
		abyte0.bd = ((azh) (abyte0)).W & ~a.bd;
	// 3089 5771:aload_1         
	// 3090 5772:aload_1         
	// 3091 5773:getfield        #207 <Field int azh.W>
	// 3092 5776:aload_0         
	// 3093 5777:getfield        #12  <Field azh a>
	// 3094 5780:getfield        #303 <Field int azh.bd>
	// 3095 5783:iconst_m1       
	// 3096 5784:ixor            
	// 3097 5785:iand            
	// 3098 5786:putfield        #303 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 3099 5789:aload_0         
	// 3100 5790:getfield        #12  <Field azh a>
	// 3101 5793:astore_1        
		abyte0.bd = ((azh) (abyte0)).n ^ a.bd;
	// 3102 5794:aload_1         
	// 3103 5795:aload_1         
	// 3104 5796:getfield        #306 <Field int azh.n>
	// 3105 5799:aload_0         
	// 3106 5800:getfield        #12  <Field azh a>
	// 3107 5803:getfield        #303 <Field int azh.bd>
	// 3108 5806:ixor            
	// 3109 5807:putfield        #303 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 3110 5810:aload_0         
	// 3111 5811:getfield        #12  <Field azh a>
	// 3112 5814:astore_1        
		abyte0.bd = ((azh) (abyte0)).aI | a.bd;
	// 3113 5815:aload_1         
	// 3114 5816:aload_1         
	// 3115 5817:getfield        #222 <Field int azh.aI>
	// 3116 5820:aload_0         
	// 3117 5821:getfield        #12  <Field azh a>
	// 3118 5824:getfield        #303 <Field int azh.bd>
	// 3119 5827:ior             
	// 3120 5828:putfield        #303 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 3121 5831:aload_0         
	// 3122 5832:getfield        #12  <Field azh a>
	// 3123 5835:astore_1        
		abyte0.bh = ((azh) (abyte0)).W & a.bh;
	// 3124 5836:aload_1         
	// 3125 5837:aload_1         
	// 3126 5838:getfield        #207 <Field int azh.W>
	// 3127 5841:aload_0         
	// 3128 5842:getfield        #12  <Field azh a>
	// 3129 5845:getfield        #309 <Field int azh.bh>
	// 3130 5848:iand            
	// 3131 5849:putfield        #309 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 3132 5852:aload_0         
	// 3133 5853:getfield        #12  <Field azh a>
	// 3134 5856:astore_1        
		abyte0.bh = ((azh) (abyte0)).bg ^ a.bh;
	// 3135 5857:aload_1         
	// 3136 5858:aload_1         
	// 3137 5859:getfield        #312 <Field int azh.bg>
	// 3138 5862:aload_0         
	// 3139 5863:getfield        #12  <Field azh a>
	// 3140 5866:getfield        #309 <Field int azh.bh>
	// 3141 5869:ixor            
	// 3142 5870:putfield        #309 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 3143 5873:aload_0         
	// 3144 5874:getfield        #12  <Field azh a>
	// 3145 5877:astore_1        
		abyte0.bU = ((azh) (abyte0)).bh ^ a.bU;
	// 3146 5878:aload_1         
	// 3147 5879:aload_1         
	// 3148 5880:getfield        #309 <Field int azh.bh>
	// 3149 5883:aload_0         
	// 3150 5884:getfield        #12  <Field azh a>
	// 3151 5887:getfield        #216 <Field int azh.bU>
	// 3152 5890:ixor            
	// 3153 5891:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 3154 5894:aload_0         
	// 3155 5895:getfield        #12  <Field azh a>
	// 3156 5898:astore_1        
		abyte0.p = ((azh) (abyte0)).bU ^ a.p;
	// 3157 5899:aload_1         
	// 3158 5900:aload_1         
	// 3159 5901:getfield        #216 <Field int azh.bU>
	// 3160 5904:aload_0         
	// 3161 5905:getfield        #12  <Field azh a>
	// 3162 5908:getfield        #315 <Field int azh.p>
	// 3163 5911:ixor            
	// 3164 5912:putfield        #315 <Field int azh.p>
		abyte0 = ((byte []) (a));
	// 3165 5915:aload_0         
	// 3166 5916:getfield        #12  <Field azh a>
	// 3167 5919:astore_1        
		abyte0.bU = ((azh) (abyte0)).p ^ a.N;
	// 3168 5920:aload_1         
	// 3169 5921:aload_1         
	// 3170 5922:getfield        #315 <Field int azh.p>
	// 3171 5925:aload_0         
	// 3172 5926:getfield        #12  <Field azh a>
	// 3173 5929:getfield        #318 <Field int azh.N>
	// 3174 5932:ixor            
	// 3175 5933:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 3176 5936:aload_0         
	// 3177 5937:getfield        #12  <Field azh a>
	// 3178 5940:astore_1        
		abyte0.bh = ((azh) (abyte0)).bU & a.F;
	// 3179 5941:aload_1         
	// 3180 5942:aload_1         
	// 3181 5943:getfield        #216 <Field int azh.bU>
	// 3182 5946:aload_0         
	// 3183 5947:getfield        #12  <Field azh a>
	// 3184 5950:getfield        #321 <Field int azh.F>
	// 3185 5953:iand            
	// 3186 5954:putfield        #309 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 3187 5957:aload_0         
	// 3188 5958:getfield        #12  <Field azh a>
	// 3189 5961:astore_1        
		abyte0.bh = ((azh) (abyte0)).bV ^ a.bh;
	// 3190 5962:aload_1         
	// 3191 5963:aload_1         
	// 3192 5964:getfield        #324 <Field int azh.bV>
	// 3193 5967:aload_0         
	// 3194 5968:getfield        #12  <Field azh a>
	// 3195 5971:getfield        #309 <Field int azh.bh>
	// 3196 5974:ixor            
	// 3197 5975:putfield        #309 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 3198 5978:aload_0         
	// 3199 5979:getfield        #12  <Field azh a>
	// 3200 5982:astore_1        
		abyte0.at = ((azh) (abyte0)).bh ^ a.at;
	// 3201 5983:aload_1         
	// 3202 5984:aload_1         
	// 3203 5985:getfield        #309 <Field int azh.bh>
	// 3204 5988:aload_0         
	// 3205 5989:getfield        #12  <Field azh a>
	// 3206 5992:getfield        #327 <Field int azh.at>
	// 3207 5995:ixor            
	// 3208 5996:putfield        #327 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 3209 5999:aload_0         
	// 3210 6000:getfield        #12  <Field azh a>
	// 3211 6003:astore_1        
		abyte0.bh = ((azh) (abyte0)).p & ~a.aj;
	// 3212 6004:aload_1         
	// 3213 6005:aload_1         
	// 3214 6006:getfield        #315 <Field int azh.p>
	// 3215 6009:aload_0         
	// 3216 6010:getfield        #12  <Field azh a>
	// 3217 6013:getfield        #246 <Field int azh.aj>
	// 3218 6016:iconst_m1       
	// 3219 6017:ixor            
	// 3220 6018:iand            
	// 3221 6019:putfield        #309 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 3222 6022:aload_0         
	// 3223 6023:getfield        #12  <Field azh a>
	// 3224 6026:astore_1        
		abyte0.bV = ((azh) (abyte0)).aj | a.bh;
	// 3225 6027:aload_1         
	// 3226 6028:aload_1         
	// 3227 6029:getfield        #246 <Field int azh.aj>
	// 3228 6032:aload_0         
	// 3229 6033:getfield        #12  <Field azh a>
	// 3230 6036:getfield        #309 <Field int azh.bh>
	// 3231 6039:ior             
	// 3232 6040:putfield        #324 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 3233 6043:aload_0         
	// 3234 6044:getfield        #12  <Field azh a>
	// 3235 6047:astore_1        
		abyte0.bV = ((azh) (abyte0)).bV & ~a.N;
	// 3236 6048:aload_1         
	// 3237 6049:aload_1         
	// 3238 6050:getfield        #324 <Field int azh.bV>
	// 3239 6053:aload_0         
	// 3240 6054:getfield        #12  <Field azh a>
	// 3241 6057:getfield        #318 <Field int azh.N>
	// 3242 6060:iconst_m1       
	// 3243 6061:ixor            
	// 3244 6062:iand            
	// 3245 6063:putfield        #324 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 3246 6066:aload_0         
	// 3247 6067:getfield        #12  <Field azh a>
	// 3248 6070:astore_1        
		abyte0.bg = ((azh) (abyte0)).bh & ~a.N;
	// 3249 6071:aload_1         
	// 3250 6072:aload_1         
	// 3251 6073:getfield        #309 <Field int azh.bh>
	// 3252 6076:aload_0         
	// 3253 6077:getfield        #12  <Field azh a>
	// 3254 6080:getfield        #318 <Field int azh.N>
	// 3255 6083:iconst_m1       
	// 3256 6084:ixor            
	// 3257 6085:iand            
	// 3258 6086:putfield        #312 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 3259 6089:aload_0         
	// 3260 6090:getfield        #12  <Field azh a>
	// 3261 6093:astore_1        
		abyte0.bg = ((azh) (abyte0)).bh ^ a.bg;
	// 3262 6094:aload_1         
	// 3263 6095:aload_1         
	// 3264 6096:getfield        #309 <Field int azh.bh>
	// 3265 6099:aload_0         
	// 3266 6100:getfield        #12  <Field azh a>
	// 3267 6103:getfield        #312 <Field int azh.bg>
	// 3268 6106:ixor            
	// 3269 6107:putfield        #312 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 3270 6110:aload_0         
	// 3271 6111:getfield        #12  <Field azh a>
	// 3272 6114:astore_1        
		abyte0.bg = ((azh) (abyte0)).bg & a.F;
	// 3273 6115:aload_1         
	// 3274 6116:aload_1         
	// 3275 6117:getfield        #312 <Field int azh.bg>
	// 3276 6120:aload_0         
	// 3277 6121:getfield        #12  <Field azh a>
	// 3278 6124:getfield        #321 <Field int azh.F>
	// 3279 6127:iand            
	// 3280 6128:putfield        #312 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 3281 6131:aload_0         
	// 3282 6132:getfield        #12  <Field azh a>
	// 3283 6135:astore_1        
		abyte0.n = ((azh) (abyte0)).bh ^ a.N;
	// 3284 6136:aload_1         
	// 3285 6137:aload_1         
	// 3286 6138:getfield        #309 <Field int azh.bh>
	// 3287 6141:aload_0         
	// 3288 6142:getfield        #12  <Field azh a>
	// 3289 6145:getfield        #318 <Field int azh.N>
	// 3290 6148:ixor            
	// 3291 6149:putfield        #306 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 3292 6152:aload_0         
	// 3293 6153:getfield        #12  <Field azh a>
	// 3294 6156:astore_1        
		abyte0.n = ((azh) (abyte0)).F & a.n;
	// 3295 6157:aload_1         
	// 3296 6158:aload_1         
	// 3297 6159:getfield        #321 <Field int azh.F>
	// 3298 6162:aload_0         
	// 3299 6163:getfield        #12  <Field azh a>
	// 3300 6166:getfield        #306 <Field int azh.n>
	// 3301 6169:iand            
	// 3302 6170:putfield        #306 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 3303 6173:aload_0         
	// 3304 6174:getfield        #12  <Field azh a>
	// 3305 6177:astore_1        
		abyte0.bh = ((azh) (abyte0)).N | a.bh;
	// 3306 6178:aload_1         
	// 3307 6179:aload_1         
	// 3308 6180:getfield        #318 <Field int azh.N>
	// 3309 6183:aload_0         
	// 3310 6184:getfield        #12  <Field azh a>
	// 3311 6187:getfield        #309 <Field int azh.bh>
	// 3312 6190:ior             
	// 3313 6191:putfield        #309 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 3314 6194:aload_0         
	// 3315 6195:getfield        #12  <Field azh a>
	// 3316 6198:astore_1        
		abyte0.bJ = ((azh) (abyte0)).p ^ a.aj;
	// 3317 6199:aload_1         
	// 3318 6200:aload_1         
	// 3319 6201:getfield        #315 <Field int azh.p>
	// 3320 6204:aload_0         
	// 3321 6205:getfield        #12  <Field azh a>
	// 3322 6208:getfield        #246 <Field int azh.aj>
	// 3323 6211:ixor            
	// 3324 6212:putfield        #53  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 3325 6215:aload_0         
	// 3326 6216:getfield        #12  <Field azh a>
	// 3327 6219:astore_1        
		abyte0.bG = ((azh) (abyte0)).bJ ^ a.bG;
	// 3328 6220:aload_1         
	// 3329 6221:aload_1         
	// 3330 6222:getfield        #53  <Field int azh.bJ>
	// 3331 6225:aload_0         
	// 3332 6226:getfield        #12  <Field azh a>
	// 3333 6229:getfield        #330 <Field int azh.bG>
	// 3334 6232:ixor            
	// 3335 6233:putfield        #330 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 3336 6236:aload_0         
	// 3337 6237:getfield        #12  <Field azh a>
	// 3338 6240:astore_1        
		abyte0.cd = ((azh) (abyte0)).p & ~a.N;
	// 3339 6241:aload_1         
	// 3340 6242:aload_1         
	// 3341 6243:getfield        #315 <Field int azh.p>
	// 3342 6246:aload_0         
	// 3343 6247:getfield        #12  <Field azh a>
	// 3344 6250:getfield        #318 <Field int azh.N>
	// 3345 6253:iconst_m1       
	// 3346 6254:ixor            
	// 3347 6255:iand            
	// 3348 6256:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 3349 6259:aload_0         
	// 3350 6260:getfield        #12  <Field azh a>
	// 3351 6263:astore_1        
		abyte0.aq = ((azh) (abyte0)).cd ^ a.aq;
	// 3352 6264:aload_1         
	// 3353 6265:aload_1         
	// 3354 6266:getfield        #59  <Field int azh.cd>
	// 3355 6269:aload_0         
	// 3356 6270:getfield        #12  <Field azh a>
	// 3357 6273:getfield        #333 <Field int azh.aq>
	// 3358 6276:ixor            
	// 3359 6277:putfield        #333 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 3360 6280:aload_0         
	// 3361 6281:getfield        #12  <Field azh a>
	// 3362 6284:astore_1        
		abyte0.aq = ((azh) (abyte0)).aq & ~a.x;
	// 3363 6285:aload_1         
	// 3364 6286:aload_1         
	// 3365 6287:getfield        #333 <Field int azh.aq>
	// 3366 6290:aload_0         
	// 3367 6291:getfield        #12  <Field azh a>
	// 3368 6294:getfield        #336 <Field int azh.x>
	// 3369 6297:iconst_m1       
	// 3370 6298:ixor            
	// 3371 6299:iand            
	// 3372 6300:putfield        #333 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 3373 6303:aload_0         
	// 3374 6304:getfield        #12  <Field azh a>
	// 3375 6307:astore_1        
		abyte0.cd = ((azh) (abyte0)).p & ~a.N;
	// 3376 6308:aload_1         
	// 3377 6309:aload_1         
	// 3378 6310:getfield        #315 <Field int azh.p>
	// 3379 6313:aload_0         
	// 3380 6314:getfield        #12  <Field azh a>
	// 3381 6317:getfield        #318 <Field int azh.N>
	// 3382 6320:iconst_m1       
	// 3383 6321:ixor            
	// 3384 6322:iand            
	// 3385 6323:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 3386 6326:aload_0         
	// 3387 6327:getfield        #12  <Field azh a>
	// 3388 6330:astore_1        
		abyte0.cd = ((azh) (abyte0)).bJ ^ a.cd;
	// 3389 6331:aload_1         
	// 3390 6332:aload_1         
	// 3391 6333:getfield        #53  <Field int azh.bJ>
	// 3392 6336:aload_0         
	// 3393 6337:getfield        #12  <Field azh a>
	// 3394 6340:getfield        #59  <Field int azh.cd>
	// 3395 6343:ixor            
	// 3396 6344:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 3397 6347:aload_0         
	// 3398 6348:getfield        #12  <Field azh a>
	// 3399 6351:astore_1        
		abyte0.cd = ((azh) (abyte0)).cd & a.F;
	// 3400 6352:aload_1         
	// 3401 6353:aload_1         
	// 3402 6354:getfield        #59  <Field int azh.cd>
	// 3403 6357:aload_0         
	// 3404 6358:getfield        #12  <Field azh a>
	// 3405 6361:getfield        #321 <Field int azh.F>
	// 3406 6364:iand            
	// 3407 6365:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 3408 6368:aload_0         
	// 3409 6369:getfield        #12  <Field azh a>
	// 3410 6372:astore_1        
		abyte0.cd = ((azh) (abyte0)).bV ^ a.cd;
	// 3411 6373:aload_1         
	// 3412 6374:aload_1         
	// 3413 6375:getfield        #324 <Field int azh.bV>
	// 3414 6378:aload_0         
	// 3415 6379:getfield        #12  <Field azh a>
	// 3416 6382:getfield        #59  <Field int azh.cd>
	// 3417 6385:ixor            
	// 3418 6386:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 3419 6389:aload_0         
	// 3420 6390:getfield        #12  <Field azh a>
	// 3421 6393:astore_1        
		abyte0.cd = ((azh) (abyte0)).x | a.cd;
	// 3422 6394:aload_1         
	// 3423 6395:aload_1         
	// 3424 6396:getfield        #336 <Field int azh.x>
	// 3425 6399:aload_0         
	// 3426 6400:getfield        #12  <Field azh a>
	// 3427 6403:getfield        #59  <Field int azh.cd>
	// 3428 6406:ior             
	// 3429 6407:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 3430 6410:aload_0         
	// 3431 6411:getfield        #12  <Field azh a>
	// 3432 6414:astore_1        
		abyte0.bV = ((azh) (abyte0)).p | a.aj;
	// 3433 6415:aload_1         
	// 3434 6416:aload_1         
	// 3435 6417:getfield        #315 <Field int azh.p>
	// 3436 6420:aload_0         
	// 3437 6421:getfield        #12  <Field azh a>
	// 3438 6424:getfield        #246 <Field int azh.aj>
	// 3439 6427:ior             
	// 3440 6428:putfield        #324 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 3441 6431:aload_0         
	// 3442 6432:getfield        #12  <Field azh a>
	// 3443 6435:astore_1        
		abyte0.aZ = ((azh) (abyte0)).F & ~a.bV;
	// 3444 6436:aload_1         
	// 3445 6437:aload_1         
	// 3446 6438:getfield        #321 <Field int azh.F>
	// 3447 6441:aload_0         
	// 3448 6442:getfield        #12  <Field azh a>
	// 3449 6445:getfield        #324 <Field int azh.bV>
	// 3450 6448:iconst_m1       
	// 3451 6449:ixor            
	// 3452 6450:iand            
	// 3453 6451:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 3454 6454:aload_0         
	// 3455 6455:getfield        #12  <Field azh a>
	// 3456 6458:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bU ^ a.aZ;
	// 3457 6459:aload_1         
	// 3458 6460:aload_1         
	// 3459 6461:getfield        #216 <Field int azh.bU>
	// 3460 6464:aload_0         
	// 3461 6465:getfield        #12  <Field azh a>
	// 3462 6468:getfield        #41  <Field int azh.aZ>
	// 3463 6471:ixor            
	// 3464 6472:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 3465 6475:aload_0         
	// 3466 6476:getfield        #12  <Field azh a>
	// 3467 6479:astore_1        
		abyte0.aB = ((azh) (abyte0)).aZ ^ a.aB;
	// 3468 6480:aload_1         
	// 3469 6481:aload_1         
	// 3470 6482:getfield        #41  <Field int azh.aZ>
	// 3471 6485:aload_0         
	// 3472 6486:getfield        #12  <Field azh a>
	// 3473 6489:getfield        #339 <Field int azh.aB>
	// 3474 6492:ixor            
	// 3475 6493:putfield        #339 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 3476 6496:aload_0         
	// 3477 6497:getfield        #12  <Field azh a>
	// 3478 6500:astore_1        
		abyte0.bV = ((azh) (abyte0)).N | a.bV;
	// 3479 6501:aload_1         
	// 3480 6502:aload_1         
	// 3481 6503:getfield        #318 <Field int azh.N>
	// 3482 6506:aload_0         
	// 3483 6507:getfield        #12  <Field azh a>
	// 3484 6510:getfield        #324 <Field int azh.bV>
	// 3485 6513:ior             
	// 3486 6514:putfield        #324 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 3487 6517:aload_0         
	// 3488 6518:getfield        #12  <Field azh a>
	// 3489 6521:astore_1        
		abyte0.bV = ((azh) (abyte0)).p ^ a.bV;
	// 3490 6522:aload_1         
	// 3491 6523:aload_1         
	// 3492 6524:getfield        #315 <Field int azh.p>
	// 3493 6527:aload_0         
	// 3494 6528:getfield        #12  <Field azh a>
	// 3495 6531:getfield        #324 <Field int azh.bV>
	// 3496 6534:ixor            
	// 3497 6535:putfield        #324 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 3498 6538:aload_0         
	// 3499 6539:getfield        #12  <Field azh a>
	// 3500 6542:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aj & ~a.p;
	// 3501 6543:aload_1         
	// 3502 6544:aload_1         
	// 3503 6545:getfield        #246 <Field int azh.aj>
	// 3504 6548:aload_0         
	// 3505 6549:getfield        #12  <Field azh a>
	// 3506 6552:getfield        #315 <Field int azh.p>
	// 3507 6555:iconst_m1       
	// 3508 6556:ixor            
	// 3509 6557:iand            
	// 3510 6558:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 3511 6561:aload_0         
	// 3512 6562:getfield        #12  <Field azh a>
	// 3513 6565:astore_1        
		abyte0.bU = ((azh) (abyte0)).aj & ~a.aZ;
	// 3514 6566:aload_1         
	// 3515 6567:aload_1         
	// 3516 6568:getfield        #246 <Field int azh.aj>
	// 3517 6571:aload_0         
	// 3518 6572:getfield        #12  <Field azh a>
	// 3519 6575:getfield        #41  <Field int azh.aZ>
	// 3520 6578:iconst_m1       
	// 3521 6579:ixor            
	// 3522 6580:iand            
	// 3523 6581:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 3524 6584:aload_0         
	// 3525 6585:getfield        #12  <Field azh a>
	// 3526 6588:astore_1        
		abyte0.bU = ((azh) (abyte0)).N | a.bU;
	// 3527 6589:aload_1         
	// 3528 6590:aload_1         
	// 3529 6591:getfield        #318 <Field int azh.N>
	// 3530 6594:aload_0         
	// 3531 6595:getfield        #12  <Field azh a>
	// 3532 6598:getfield        #216 <Field int azh.bU>
	// 3533 6601:ior             
	// 3534 6602:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 3535 6605:aload_0         
	// 3536 6606:getfield        #12  <Field azh a>
	// 3537 6609:astore_1        
		abyte0.bU = ((azh) (abyte0)).aZ ^ a.bU;
	// 3538 6610:aload_1         
	// 3539 6611:aload_1         
	// 3540 6612:getfield        #41  <Field int azh.aZ>
	// 3541 6615:aload_0         
	// 3542 6616:getfield        #12  <Field azh a>
	// 3543 6619:getfield        #216 <Field int azh.bU>
	// 3544 6622:ixor            
	// 3545 6623:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 3546 6626:aload_0         
	// 3547 6627:getfield        #12  <Field azh a>
	// 3548 6630:astore_1        
		abyte0.bU = ((azh) (abyte0)).F & a.bU;
	// 3549 6631:aload_1         
	// 3550 6632:aload_1         
	// 3551 6633:getfield        #321 <Field int azh.F>
	// 3552 6636:aload_0         
	// 3553 6637:getfield        #12  <Field azh a>
	// 3554 6640:getfield        #216 <Field int azh.bU>
	// 3555 6643:iand            
	// 3556 6644:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 3557 6647:aload_0         
	// 3558 6648:getfield        #12  <Field azh a>
	// 3559 6651:astore_1        
		abyte0.bU = ((azh) (abyte0)).bJ ^ a.bU;
	// 3560 6652:aload_1         
	// 3561 6653:aload_1         
	// 3562 6654:getfield        #53  <Field int azh.bJ>
	// 3563 6657:aload_0         
	// 3564 6658:getfield        #12  <Field azh a>
	// 3565 6661:getfield        #216 <Field int azh.bU>
	// 3566 6664:ixor            
	// 3567 6665:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 3568 6668:aload_0         
	// 3569 6669:getfield        #12  <Field azh a>
	// 3570 6672:astore_1        
		abyte0.ce = ((azh) (abyte0)).bU ^ a.ce;
	// 3571 6673:aload_1         
	// 3572 6674:aload_1         
	// 3573 6675:getfield        #216 <Field int azh.bU>
	// 3574 6678:aload_0         
	// 3575 6679:getfield        #12  <Field azh a>
	// 3576 6682:getfield        #342 <Field int azh.ce>
	// 3577 6685:ixor            
	// 3578 6686:putfield        #342 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 3579 6689:aload_0         
	// 3580 6690:getfield        #12  <Field azh a>
	// 3581 6693:astore_1        
		abyte0.ay = ((azh) (abyte0)).aZ ^ a.ay;
	// 3582 6694:aload_1         
	// 3583 6695:aload_1         
	// 3584 6696:getfield        #41  <Field int azh.aZ>
	// 3585 6699:aload_0         
	// 3586 6700:getfield        #12  <Field azh a>
	// 3587 6703:getfield        #345 <Field int azh.ay>
	// 3588 6706:ixor            
	// 3589 6707:putfield        #345 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 3590 6710:aload_0         
	// 3591 6711:getfield        #12  <Field azh a>
	// 3592 6714:astore_1        
		abyte0.ay = ((azh) (abyte0)).ay & ~a.x;
	// 3593 6715:aload_1         
	// 3594 6716:aload_1         
	// 3595 6717:getfield        #345 <Field int azh.ay>
	// 3596 6720:aload_0         
	// 3597 6721:getfield        #12  <Field azh a>
	// 3598 6724:getfield        #336 <Field int azh.x>
	// 3599 6727:iconst_m1       
	// 3600 6728:ixor            
	// 3601 6729:iand            
	// 3602 6730:putfield        #345 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 3603 6733:aload_0         
	// 3604 6734:getfield        #12  <Field azh a>
	// 3605 6737:astore_1        
		abyte0.ay = ((azh) (abyte0)).bg ^ a.ay;
	// 3606 6738:aload_1         
	// 3607 6739:aload_1         
	// 3608 6740:getfield        #312 <Field int azh.bg>
	// 3609 6743:aload_0         
	// 3610 6744:getfield        #12  <Field azh a>
	// 3611 6747:getfield        #345 <Field int azh.ay>
	// 3612 6750:ixor            
	// 3613 6751:putfield        #345 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 3614 6754:aload_0         
	// 3615 6755:getfield        #12  <Field azh a>
	// 3616 6758:astore_1        
		abyte0.ay = ((azh) (abyte0)).h & ~a.ay;
	// 3617 6759:aload_1         
	// 3618 6760:aload_1         
	// 3619 6761:getfield        #94  <Field int azh.h>
	// 3620 6764:aload_0         
	// 3621 6765:getfield        #12  <Field azh a>
	// 3622 6768:getfield        #345 <Field int azh.ay>
	// 3623 6771:iconst_m1       
	// 3624 6772:ixor            
	// 3625 6773:iand            
	// 3626 6774:putfield        #345 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 3627 6777:aload_0         
	// 3628 6778:getfield        #12  <Field azh a>
	// 3629 6781:astore_1        
		abyte0.ay = ((azh) (abyte0)).aB ^ a.ay;
	// 3630 6782:aload_1         
	// 3631 6783:aload_1         
	// 3632 6784:getfield        #339 <Field int azh.aB>
	// 3633 6787:aload_0         
	// 3634 6788:getfield        #12  <Field azh a>
	// 3635 6791:getfield        #345 <Field int azh.ay>
	// 3636 6794:ixor            
	// 3637 6795:putfield        #345 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 3638 6798:aload_0         
	// 3639 6799:getfield        #12  <Field azh a>
	// 3640 6802:astore_1        
		abyte0.G = ((azh) (abyte0)).ay ^ a.G;
	// 3641 6803:aload_1         
	// 3642 6804:aload_1         
	// 3643 6805:getfield        #345 <Field int azh.ay>
	// 3644 6808:aload_0         
	// 3645 6809:getfield        #12  <Field azh a>
	// 3646 6812:getfield        #348 <Field int azh.G>
	// 3647 6815:ixor            
	// 3648 6816:putfield        #348 <Field int azh.G>
		abyte0 = ((byte []) (a));
	// 3649 6819:aload_0         
	// 3650 6820:getfield        #12  <Field azh a>
	// 3651 6823:astore_1        
		abyte0.ay = ((azh) (abyte0)).G & ~a.q;
	// 3652 6824:aload_1         
	// 3653 6825:aload_1         
	// 3654 6826:getfield        #348 <Field int azh.G>
	// 3655 6829:aload_0         
	// 3656 6830:getfield        #12  <Field azh a>
	// 3657 6833:getfield        #300 <Field int azh.q>
	// 3658 6836:iconst_m1       
	// 3659 6837:ixor            
	// 3660 6838:iand            
	// 3661 6839:putfield        #345 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 3662 6842:aload_0         
	// 3663 6843:getfield        #12  <Field azh a>
	// 3664 6846:astore_1        
		abyte0.aB = ((azh) (abyte0)).G & ~a.ay;
	// 3665 6847:aload_1         
	// 3666 6848:aload_1         
	// 3667 6849:getfield        #348 <Field int azh.G>
	// 3668 6852:aload_0         
	// 3669 6853:getfield        #12  <Field azh a>
	// 3670 6856:getfield        #345 <Field int azh.ay>
	// 3671 6859:iconst_m1       
	// 3672 6860:ixor            
	// 3673 6861:iand            
	// 3674 6862:putfield        #339 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 3675 6865:aload_0         
	// 3676 6866:getfield        #12  <Field azh a>
	// 3677 6869:astore_1        
		abyte0.bg = ((azh) (abyte0)).a | a.G;
	// 3678 6870:aload_1         
	// 3679 6871:aload_1         
	// 3680 6872:getfield        #183 <Field int azh.a>
	// 3681 6875:aload_0         
	// 3682 6876:getfield        #12  <Field azh a>
	// 3683 6879:getfield        #348 <Field int azh.G>
	// 3684 6882:ior             
	// 3685 6883:putfield        #312 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 3686 6886:aload_0         
	// 3687 6887:getfield        #12  <Field azh a>
	// 3688 6890:astore_1        
		abyte0.bU = ((azh) (abyte0)).G & a.q;
	// 3689 6891:aload_1         
	// 3690 6892:aload_1         
	// 3691 6893:getfield        #348 <Field int azh.G>
	// 3692 6896:aload_0         
	// 3693 6897:getfield        #12  <Field azh a>
	// 3694 6900:getfield        #300 <Field int azh.q>
	// 3695 6903:iand            
	// 3696 6904:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 3697 6907:aload_0         
	// 3698 6908:getfield        #12  <Field azh a>
	// 3699 6911:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bU & a.a;
	// 3700 6912:aload_1         
	// 3701 6913:aload_1         
	// 3702 6914:getfield        #216 <Field int azh.bU>
	// 3703 6917:aload_0         
	// 3704 6918:getfield        #12  <Field azh a>
	// 3705 6921:getfield        #183 <Field int azh.a>
	// 3706 6924:iand            
	// 3707 6925:putfield        #53  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 3708 6928:aload_0         
	// 3709 6929:getfield        #12  <Field azh a>
	// 3710 6932:astore_1        
		abyte0.bj = ((azh) (abyte0)).q | a.G;
	// 3711 6933:aload_1         
	// 3712 6934:aload_1         
	// 3713 6935:getfield        #300 <Field int azh.q>
	// 3714 6938:aload_0         
	// 3715 6939:getfield        #12  <Field azh a>
	// 3716 6942:getfield        #348 <Field int azh.G>
	// 3717 6945:ior             
	// 3718 6946:putfield        #297 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 3719 6949:aload_0         
	// 3720 6950:getfield        #12  <Field azh a>
	// 3721 6953:astore_1        
		abyte0.bq = ((azh) (abyte0)).q & ~a.G;
	// 3722 6954:aload_1         
	// 3723 6955:aload_1         
	// 3724 6956:getfield        #300 <Field int azh.q>
	// 3725 6959:aload_0         
	// 3726 6960:getfield        #12  <Field azh a>
	// 3727 6963:getfield        #348 <Field int azh.G>
	// 3728 6966:iconst_m1       
	// 3729 6967:ixor            
	// 3730 6968:iand            
	// 3731 6969:putfield        #270 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 3732 6972:aload_0         
	// 3733 6973:getfield        #12  <Field azh a>
	// 3734 6976:astore_1        
		abyte0.aL = ((azh) (abyte0)).bq | a.G;
	// 3735 6977:aload_1         
	// 3736 6978:aload_1         
	// 3737 6979:getfield        #270 <Field int azh.bq>
	// 3738 6982:aload_0         
	// 3739 6983:getfield        #12  <Field azh a>
	// 3740 6986:getfield        #348 <Field int azh.G>
	// 3741 6989:ior             
	// 3742 6990:putfield        #249 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 3743 6993:aload_0         
	// 3744 6994:getfield        #12  <Field azh a>
	// 3745 6997:astore_1        
		abyte0.ci = ((azh) (abyte0)).q ^ a.G;
	// 3746 6998:aload_1         
	// 3747 6999:aload_1         
	// 3748 7000:getfield        #300 <Field int azh.q>
	// 3749 7003:aload_0         
	// 3750 7004:getfield        #12  <Field azh a>
	// 3751 7007:getfield        #348 <Field int azh.G>
	// 3752 7010:ixor            
	// 3753 7011:putfield        #71  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 3754 7014:aload_0         
	// 3755 7015:getfield        #12  <Field azh a>
	// 3756 7018:astore_1        
		abyte0.cb = ((azh) (abyte0)).a | a.ci;
	// 3757 7019:aload_1         
	// 3758 7020:aload_1         
	// 3759 7021:getfield        #183 <Field int azh.a>
	// 3760 7024:aload_0         
	// 3761 7025:getfield        #12  <Field azh a>
	// 3762 7028:getfield        #71  <Field int azh.ci>
	// 3763 7031:ior             
	// 3764 7032:putfield        #240 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 3765 7035:aload_0         
	// 3766 7036:getfield        #12  <Field azh a>
	// 3767 7039:astore_1        
		abyte0.aZ = ((azh) (abyte0)).N | a.aZ;
	// 3768 7040:aload_1         
	// 3769 7041:aload_1         
	// 3770 7042:getfield        #318 <Field int azh.N>
	// 3771 7045:aload_0         
	// 3772 7046:getfield        #12  <Field azh a>
	// 3773 7049:getfield        #41  <Field int azh.aZ>
	// 3774 7052:ior             
	// 3775 7053:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 3776 7056:aload_0         
	// 3777 7057:getfield        #12  <Field azh a>
	// 3778 7060:astore_1        
		abyte0.n = ((azh) (abyte0)).aZ ^ a.n;
	// 3779 7061:aload_1         
	// 3780 7062:aload_1         
	// 3781 7063:getfield        #41  <Field int azh.aZ>
	// 3782 7066:aload_0         
	// 3783 7067:getfield        #12  <Field azh a>
	// 3784 7070:getfield        #306 <Field int azh.n>
	// 3785 7073:ixor            
	// 3786 7074:putfield        #306 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 3787 7077:aload_0         
	// 3788 7078:getfield        #12  <Field azh a>
	// 3789 7081:astore_1        
		abyte0.bM = ((azh) (abyte0)).n ^ a.bM;
	// 3790 7082:aload_1         
	// 3791 7083:aload_1         
	// 3792 7084:getfield        #306 <Field int azh.n>
	// 3793 7087:aload_0         
	// 3794 7088:getfield        #12  <Field azh a>
	// 3795 7091:getfield        #351 <Field int azh.bM>
	// 3796 7094:ixor            
	// 3797 7095:putfield        #351 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 3798 7098:aload_0         
	// 3799 7099:getfield        #12  <Field azh a>
	// 3800 7102:astore_1        
		abyte0.bM = ((azh) (abyte0)).h & a.bM;
	// 3801 7103:aload_1         
	// 3802 7104:aload_1         
	// 3803 7105:getfield        #94  <Field int azh.h>
	// 3804 7108:aload_0         
	// 3805 7109:getfield        #12  <Field azh a>
	// 3806 7112:getfield        #351 <Field int azh.bM>
	// 3807 7115:iand            
	// 3808 7116:putfield        #351 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 3809 7119:aload_0         
	// 3810 7120:getfield        #12  <Field azh a>
	// 3811 7123:astore_1        
		abyte0.bM = ((azh) (abyte0)).ce ^ a.bM;
	// 3812 7124:aload_1         
	// 3813 7125:aload_1         
	// 3814 7126:getfield        #342 <Field int azh.ce>
	// 3815 7129:aload_0         
	// 3816 7130:getfield        #12  <Field azh a>
	// 3817 7133:getfield        #351 <Field int azh.bM>
	// 3818 7136:ixor            
	// 3819 7137:putfield        #351 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 3820 7140:aload_0         
	// 3821 7141:getfield        #12  <Field azh a>
	// 3822 7144:astore_1        
		abyte0.Y = ((azh) (abyte0)).bM ^ a.Y;
	// 3823 7145:aload_1         
	// 3824 7146:aload_1         
	// 3825 7147:getfield        #351 <Field int azh.bM>
	// 3826 7150:aload_0         
	// 3827 7151:getfield        #12  <Field azh a>
	// 3828 7154:getfield        #91  <Field int azh.Y>
	// 3829 7157:ixor            
	// 3830 7158:putfield        #91  <Field int azh.Y>
		abyte0 = ((byte []) (a));
	// 3831 7161:aload_0         
	// 3832 7162:getfield        #12  <Field azh a>
	// 3833 7165:astore_1        
		abyte0.bM = ((azh) (abyte0)).p & a.aj;
	// 3834 7166:aload_1         
	// 3835 7167:aload_1         
	// 3836 7168:getfield        #315 <Field int azh.p>
	// 3837 7171:aload_0         
	// 3838 7172:getfield        #12  <Field azh a>
	// 3839 7175:getfield        #246 <Field int azh.aj>
	// 3840 7178:iand            
	// 3841 7179:putfield        #351 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 3842 7182:aload_0         
	// 3843 7183:getfield        #12  <Field azh a>
	// 3844 7186:astore_1        
		abyte0.bh = ((azh) (abyte0)).bM ^ a.bh;
	// 3845 7187:aload_1         
	// 3846 7188:aload_1         
	// 3847 7189:getfield        #351 <Field int azh.bM>
	// 3848 7192:aload_0         
	// 3849 7193:getfield        #12  <Field azh a>
	// 3850 7196:getfield        #309 <Field int azh.bh>
	// 3851 7199:ixor            
	// 3852 7200:putfield        #309 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 3853 7203:aload_0         
	// 3854 7204:getfield        #12  <Field azh a>
	// 3855 7207:astore_1        
		abyte0.bh = ((azh) (abyte0)).F | a.bh;
	// 3856 7208:aload_1         
	// 3857 7209:aload_1         
	// 3858 7210:getfield        #321 <Field int azh.F>
	// 3859 7213:aload_0         
	// 3860 7214:getfield        #12  <Field azh a>
	// 3861 7217:getfield        #309 <Field int azh.bh>
	// 3862 7220:ior             
	// 3863 7221:putfield        #309 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 3864 7224:aload_0         
	// 3865 7225:getfield        #12  <Field azh a>
	// 3866 7228:astore_1        
		abyte0.bh = ((azh) (abyte0)).by ^ a.bh;
	// 3867 7229:aload_1         
	// 3868 7230:aload_1         
	// 3869 7231:getfield        #354 <Field int azh.by>
	// 3870 7234:aload_0         
	// 3871 7235:getfield        #12  <Field azh a>
	// 3872 7238:getfield        #309 <Field int azh.bh>
	// 3873 7241:ixor            
	// 3874 7242:putfield        #309 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 3875 7245:aload_0         
	// 3876 7246:getfield        #12  <Field azh a>
	// 3877 7249:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bh ^ a.aQ;
	// 3878 7250:aload_1         
	// 3879 7251:aload_1         
	// 3880 7252:getfield        #309 <Field int azh.bh>
	// 3881 7255:aload_0         
	// 3882 7256:getfield        #12  <Field azh a>
	// 3883 7259:getfield        #357 <Field int azh.aQ>
	// 3884 7262:ixor            
	// 3885 7263:putfield        #357 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 3886 7266:aload_0         
	// 3887 7267:getfield        #12  <Field azh a>
	// 3888 7270:astore_1        
		abyte0.aQ = ((azh) (abyte0)).aQ & a.h;
	// 3889 7271:aload_1         
	// 3890 7272:aload_1         
	// 3891 7273:getfield        #357 <Field int azh.aQ>
	// 3892 7276:aload_0         
	// 3893 7277:getfield        #12  <Field azh a>
	// 3894 7280:getfield        #94  <Field int azh.h>
	// 3895 7283:iand            
	// 3896 7284:putfield        #357 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 3897 7287:aload_0         
	// 3898 7288:getfield        #12  <Field azh a>
	// 3899 7291:astore_1        
		abyte0.aQ = ((azh) (abyte0)).at ^ a.aQ;
	// 3900 7292:aload_1         
	// 3901 7293:aload_1         
	// 3902 7294:getfield        #327 <Field int azh.at>
	// 3903 7297:aload_0         
	// 3904 7298:getfield        #12  <Field azh a>
	// 3905 7301:getfield        #357 <Field int azh.aQ>
	// 3906 7304:ixor            
	// 3907 7305:putfield        #357 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 3908 7308:aload_0         
	// 3909 7309:getfield        #12  <Field azh a>
	// 3910 7312:astore_1        
		abyte0.C = ((azh) (abyte0)).aQ ^ a.C;
	// 3911 7313:aload_1         
	// 3912 7314:aload_1         
	// 3913 7315:getfield        #357 <Field int azh.aQ>
	// 3914 7318:aload_0         
	// 3915 7319:getfield        #12  <Field azh a>
	// 3916 7322:getfield        #360 <Field int azh.C>
	// 3917 7325:ixor            
	// 3918 7326:putfield        #360 <Field int azh.C>
		abyte0 = ((byte []) (a));
	// 3919 7329:aload_0         
	// 3920 7330:getfield        #12  <Field azh a>
	// 3921 7333:astore_1        
		abyte0.aQ = ((azh) (abyte0)).C | a.g;
	// 3922 7334:aload_1         
	// 3923 7335:aload_1         
	// 3924 7336:getfield        #360 <Field int azh.C>
	// 3925 7339:aload_0         
	// 3926 7340:getfield        #12  <Field azh a>
	// 3927 7343:getfield        #195 <Field int azh.g>
	// 3928 7346:ior             
	// 3929 7347:putfield        #357 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 3930 7350:aload_0         
	// 3931 7351:getfield        #12  <Field azh a>
	// 3932 7354:astore_1        
		abyte0.aQ = ((azh) (abyte0)).K & ~a.aQ;
	// 3933 7355:aload_1         
	// 3934 7356:aload_1         
	// 3935 7357:getfield        #192 <Field int azh.K>
	// 3936 7360:aload_0         
	// 3937 7361:getfield        #12  <Field azh a>
	// 3938 7364:getfield        #357 <Field int azh.aQ>
	// 3939 7367:iconst_m1       
	// 3940 7368:ixor            
	// 3941 7369:iand            
	// 3942 7370:putfield        #357 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 3943 7373:aload_0         
	// 3944 7374:getfield        #12  <Field azh a>
	// 3945 7377:astore_1        
		abyte0.at = ((azh) (abyte0)).C | a.K;
	// 3946 7378:aload_1         
	// 3947 7379:aload_1         
	// 3948 7380:getfield        #360 <Field int azh.C>
	// 3949 7383:aload_0         
	// 3950 7384:getfield        #12  <Field azh a>
	// 3951 7387:getfield        #192 <Field int azh.K>
	// 3952 7390:ior             
	// 3953 7391:putfield        #327 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 3954 7394:aload_0         
	// 3955 7395:getfield        #12  <Field azh a>
	// 3956 7398:astore_1        
		abyte0.bh = ((azh) (abyte0)).C | a.g;
	// 3957 7399:aload_1         
	// 3958 7400:aload_1         
	// 3959 7401:getfield        #360 <Field int azh.C>
	// 3960 7404:aload_0         
	// 3961 7405:getfield        #12  <Field azh a>
	// 3962 7408:getfield        #195 <Field int azh.g>
	// 3963 7411:ior             
	// 3964 7412:putfield        #309 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 3965 7415:aload_0         
	// 3966 7416:getfield        #12  <Field azh a>
	// 3967 7419:astore_1        
		abyte0.by = ((azh) (abyte0)).g & ~a.C;
	// 3968 7420:aload_1         
	// 3969 7421:aload_1         
	// 3970 7422:getfield        #195 <Field int azh.g>
	// 3971 7425:aload_0         
	// 3972 7426:getfield        #12  <Field azh a>
	// 3973 7429:getfield        #360 <Field int azh.C>
	// 3974 7432:iconst_m1       
	// 3975 7433:ixor            
	// 3976 7434:iand            
	// 3977 7435:putfield        #354 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 3978 7438:aload_0         
	// 3979 7439:getfield        #12  <Field azh a>
	// 3980 7442:astore_1        
		abyte0.ce = ((azh) (abyte0)).by & ~a.K;
	// 3981 7443:aload_1         
	// 3982 7444:aload_1         
	// 3983 7445:getfield        #354 <Field int azh.by>
	// 3984 7448:aload_0         
	// 3985 7449:getfield        #12  <Field azh a>
	// 3986 7452:getfield        #192 <Field int azh.K>
	// 3987 7455:iconst_m1       
	// 3988 7456:ixor            
	// 3989 7457:iand            
	// 3990 7458:putfield        #342 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 3991 7461:aload_0         
	// 3992 7462:getfield        #12  <Field azh a>
	// 3993 7465:astore_1        
		abyte0.by = ((azh) (abyte0)).by & ~a.K;
	// 3994 7466:aload_1         
	// 3995 7467:aload_1         
	// 3996 7468:getfield        #354 <Field int azh.by>
	// 3997 7471:aload_0         
	// 3998 7472:getfield        #12  <Field azh a>
	// 3999 7475:getfield        #192 <Field int azh.K>
	// 4000 7478:iconst_m1       
	// 4001 7479:ixor            
	// 4002 7480:iand            
	// 4003 7481:putfield        #354 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 4004 7484:aload_0         
	// 4005 7485:getfield        #12  <Field azh a>
	// 4006 7488:astore_1        
		abyte0.n = ((azh) (abyte0)).g & ~a.C;
	// 4007 7489:aload_1         
	// 4008 7490:aload_1         
	// 4009 7491:getfield        #195 <Field int azh.g>
	// 4010 7494:aload_0         
	// 4011 7495:getfield        #12  <Field azh a>
	// 4012 7498:getfield        #360 <Field int azh.C>
	// 4013 7501:iconst_m1       
	// 4014 7502:ixor            
	// 4015 7503:iand            
	// 4016 7504:putfield        #306 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 4017 7507:aload_0         
	// 4018 7508:getfield        #12  <Field azh a>
	// 4019 7511:astore_1        
		abyte0.bM = ((azh) (abyte0)).bM & ~a.N;
	// 4020 7512:aload_1         
	// 4021 7513:aload_1         
	// 4022 7514:getfield        #351 <Field int azh.bM>
	// 4023 7517:aload_0         
	// 4024 7518:getfield        #12  <Field azh a>
	// 4025 7521:getfield        #318 <Field int azh.N>
	// 4026 7524:iconst_m1       
	// 4027 7525:ixor            
	// 4028 7526:iand            
	// 4029 7527:putfield        #351 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 4030 7530:aload_0         
	// 4031 7531:getfield        #12  <Field azh a>
	// 4032 7534:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bM & a.F;
	// 4033 7535:aload_1         
	// 4034 7536:aload_1         
	// 4035 7537:getfield        #351 <Field int azh.bM>
	// 4036 7540:aload_0         
	// 4037 7541:getfield        #12  <Field azh a>
	// 4038 7544:getfield        #321 <Field int azh.F>
	// 4039 7547:iand            
	// 4040 7548:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 4041 7551:aload_0         
	// 4042 7552:getfield        #12  <Field azh a>
	// 4043 7555:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bG ^ a.aZ;
	// 4044 7556:aload_1         
	// 4045 7557:aload_1         
	// 4046 7558:getfield        #330 <Field int azh.bG>
	// 4047 7561:aload_0         
	// 4048 7562:getfield        #12  <Field azh a>
	// 4049 7565:getfield        #41  <Field int azh.aZ>
	// 4050 7568:ixor            
	// 4051 7569:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 4052 7572:aload_0         
	// 4053 7573:getfield        #12  <Field azh a>
	// 4054 7576:astore_1        
		abyte0.aq = ((azh) (abyte0)).aZ ^ a.aq;
	// 4055 7577:aload_1         
	// 4056 7578:aload_1         
	// 4057 7579:getfield        #41  <Field int azh.aZ>
	// 4058 7582:aload_0         
	// 4059 7583:getfield        #12  <Field azh a>
	// 4060 7586:getfield        #333 <Field int azh.aq>
	// 4061 7589:ixor            
	// 4062 7590:putfield        #333 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 4063 7593:aload_0         
	// 4064 7594:getfield        #12  <Field azh a>
	// 4065 7597:astore_1        
		abyte0.aq = ((azh) (abyte0)).h & ~a.aq;
	// 4066 7598:aload_1         
	// 4067 7599:aload_1         
	// 4068 7600:getfield        #94  <Field int azh.h>
	// 4069 7603:aload_0         
	// 4070 7604:getfield        #12  <Field azh a>
	// 4071 7607:getfield        #333 <Field int azh.aq>
	// 4072 7610:iconst_m1       
	// 4073 7611:ixor            
	// 4074 7612:iand            
	// 4075 7613:putfield        #333 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 4076 7616:aload_0         
	// 4077 7617:getfield        #12  <Field azh a>
	// 4078 7620:astore_1        
		abyte0.bM = ((azh) (abyte0)).F & ~a.bM;
	// 4079 7621:aload_1         
	// 4080 7622:aload_1         
	// 4081 7623:getfield        #321 <Field int azh.F>
	// 4082 7626:aload_0         
	// 4083 7627:getfield        #12  <Field azh a>
	// 4084 7630:getfield        #351 <Field int azh.bM>
	// 4085 7633:iconst_m1       
	// 4086 7634:ixor            
	// 4087 7635:iand            
	// 4088 7636:putfield        #351 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 4089 7639:aload_0         
	// 4090 7640:getfield        #12  <Field azh a>
	// 4091 7643:astore_1        
		abyte0.bM = ((azh) (abyte0)).bV ^ a.bM;
	// 4092 7644:aload_1         
	// 4093 7645:aload_1         
	// 4094 7646:getfield        #324 <Field int azh.bV>
	// 4095 7649:aload_0         
	// 4096 7650:getfield        #12  <Field azh a>
	// 4097 7653:getfield        #351 <Field int azh.bM>
	// 4098 7656:ixor            
	// 4099 7657:putfield        #351 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 4100 7660:aload_0         
	// 4101 7661:getfield        #12  <Field azh a>
	// 4102 7664:astore_1        
		abyte0.cd = ((azh) (abyte0)).bM ^ a.cd;
	// 4103 7665:aload_1         
	// 4104 7666:aload_1         
	// 4105 7667:getfield        #351 <Field int azh.bM>
	// 4106 7670:aload_0         
	// 4107 7671:getfield        #12  <Field azh a>
	// 4108 7674:getfield        #59  <Field int azh.cd>
	// 4109 7677:ixor            
	// 4110 7678:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 4111 7681:aload_0         
	// 4112 7682:getfield        #12  <Field azh a>
	// 4113 7685:astore_1        
		abyte0.aq = ((azh) (abyte0)).cd ^ a.aq;
	// 4114 7686:aload_1         
	// 4115 7687:aload_1         
	// 4116 7688:getfield        #59  <Field int azh.cd>
	// 4117 7691:aload_0         
	// 4118 7692:getfield        #12  <Field azh a>
	// 4119 7695:getfield        #333 <Field int azh.aq>
	// 4120 7698:ixor            
	// 4121 7699:putfield        #333 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 4122 7702:aload_0         
	// 4123 7703:getfield        #12  <Field azh a>
	// 4124 7706:astore_1        
		abyte0.ac = ((azh) (abyte0)).aq ^ a.ac;
	// 4125 7707:aload_1         
	// 4126 7708:aload_1         
	// 4127 7709:getfield        #333 <Field int azh.aq>
	// 4128 7712:aload_0         
	// 4129 7713:getfield        #12  <Field azh a>
	// 4130 7716:getfield        #363 <Field int azh.ac>
	// 4131 7719:ixor            
	// 4132 7720:putfield        #363 <Field int azh.ac>
		abyte0 = ((byte []) (a));
	// 4133 7723:aload_0         
	// 4134 7724:getfield        #12  <Field azh a>
	// 4135 7727:astore_1        
		abyte0.aq = ((azh) (abyte0)).ac & ~a.a;
	// 4136 7728:aload_1         
	// 4137 7729:aload_1         
	// 4138 7730:getfield        #363 <Field int azh.ac>
	// 4139 7733:aload_0         
	// 4140 7734:getfield        #12  <Field azh a>
	// 4141 7737:getfield        #183 <Field int azh.a>
	// 4142 7740:iconst_m1       
	// 4143 7741:ixor            
	// 4144 7742:iand            
	// 4145 7743:putfield        #333 <Field int azh.aq>
		abyte0 = ((byte []) (a));
	// 4146 7746:aload_0         
	// 4147 7747:getfield        #12  <Field azh a>
	// 4148 7750:astore_1        
		abyte0.bl = ((azh) (abyte0)).W & ~a.bl;
	// 4149 7751:aload_1         
	// 4150 7752:aload_1         
	// 4151 7753:getfield        #207 <Field int azh.W>
	// 4152 7756:aload_0         
	// 4153 7757:getfield        #12  <Field azh a>
	// 4154 7760:getfield        #366 <Field int azh.bl>
	// 4155 7763:iconst_m1       
	// 4156 7764:ixor            
	// 4157 7765:iand            
	// 4158 7766:putfield        #366 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 4159 7769:aload_0         
	// 4160 7770:getfield        #12  <Field azh a>
	// 4161 7773:astore_1        
		abyte0.bl = ((azh) (abyte0)).aR ^ a.bl;
	// 4162 7774:aload_1         
	// 4163 7775:aload_1         
	// 4164 7776:getfield        #369 <Field int azh.aR>
	// 4165 7779:aload_0         
	// 4166 7780:getfield        #12  <Field azh a>
	// 4167 7783:getfield        #366 <Field int azh.bl>
	// 4168 7786:ixor            
	// 4169 7787:putfield        #366 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 4170 7790:aload_0         
	// 4171 7791:getfield        #12  <Field azh a>
	// 4172 7794:astore_1        
		abyte0.bd = ((azh) (abyte0)).bl ^ a.bd;
	// 4173 7795:aload_1         
	// 4174 7796:aload_1         
	// 4175 7797:getfield        #366 <Field int azh.bl>
	// 4176 7800:aload_0         
	// 4177 7801:getfield        #12  <Field azh a>
	// 4178 7804:getfield        #303 <Field int azh.bd>
	// 4179 7807:ixor            
	// 4180 7808:putfield        #303 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4181 7811:aload_0         
	// 4182 7812:getfield        #12  <Field azh a>
	// 4183 7815:astore_1        
		abyte0.t = ((azh) (abyte0)).bd ^ a.t;
	// 4184 7816:aload_1         
	// 4185 7817:aload_1         
	// 4186 7818:getfield        #303 <Field int azh.bd>
	// 4187 7821:aload_0         
	// 4188 7822:getfield        #12  <Field azh a>
	// 4189 7825:getfield        #372 <Field int azh.t>
	// 4190 7828:ixor            
	// 4191 7829:putfield        #372 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 4192 7832:aload_0         
	// 4193 7833:getfield        #12  <Field azh a>
	// 4194 7836:astore_1        
		abyte0.bd = ((azh) (abyte0)).d & ~a.t;
	// 4195 7837:aload_1         
	// 4196 7838:aload_1         
	// 4197 7839:getfield        #145 <Field int azh.d>
	// 4198 7842:aload_0         
	// 4199 7843:getfield        #12  <Field azh a>
	// 4200 7846:getfield        #372 <Field int azh.t>
	// 4201 7849:iconst_m1       
	// 4202 7850:ixor            
	// 4203 7851:iand            
	// 4204 7852:putfield        #303 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4205 7855:aload_0         
	// 4206 7856:getfield        #12  <Field azh a>
	// 4207 7859:astore_1        
		abyte0.bd = ((azh) (abyte0)).bE ^ a.bd;
	// 4208 7860:aload_1         
	// 4209 7861:aload_1         
	// 4210 7862:getfield        #375 <Field int azh.bE>
	// 4211 7865:aload_0         
	// 4212 7866:getfield        #12  <Field azh a>
	// 4213 7869:getfield        #303 <Field int azh.bd>
	// 4214 7872:ixor            
	// 4215 7873:putfield        #303 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4216 7876:aload_0         
	// 4217 7877:getfield        #12  <Field azh a>
	// 4218 7880:astore_1        
		abyte0.bd = ((azh) (abyte0)).bd & ~a.l;
	// 4219 7881:aload_1         
	// 4220 7882:aload_1         
	// 4221 7883:getfield        #303 <Field int azh.bd>
	// 4222 7886:aload_0         
	// 4223 7887:getfield        #12  <Field azh a>
	// 4224 7890:getfield        #378 <Field int azh.l>
	// 4225 7893:iconst_m1       
	// 4226 7894:ixor            
	// 4227 7895:iand            
	// 4228 7896:putfield        #303 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4229 7899:aload_0         
	// 4230 7900:getfield        #12  <Field azh a>
	// 4231 7903:astore_1        
		abyte0.cg = ((azh) (abyte0)).t | a.cg;
	// 4232 7904:aload_1         
	// 4233 7905:aload_1         
	// 4234 7906:getfield        #372 <Field int azh.t>
	// 4235 7909:aload_0         
	// 4236 7910:getfield        #12  <Field azh a>
	// 4237 7913:getfield        #381 <Field int azh.cg>
	// 4238 7916:ior             
	// 4239 7917:putfield        #381 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 4240 7920:aload_0         
	// 4241 7921:getfield        #12  <Field azh a>
	// 4242 7924:astore_1        
		abyte0.cg = ((azh) (abyte0)).aN ^ a.cg;
	// 4243 7925:aload_1         
	// 4244 7926:aload_1         
	// 4245 7927:getfield        #384 <Field int azh.aN>
	// 4246 7930:aload_0         
	// 4247 7931:getfield        #12  <Field azh a>
	// 4248 7934:getfield        #381 <Field int azh.cg>
	// 4249 7937:ixor            
	// 4250 7938:putfield        #381 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 4251 7941:aload_0         
	// 4252 7942:getfield        #12  <Field azh a>
	// 4253 7945:astore_1        
		abyte0.cg = ((azh) (abyte0)).cg ^ a.l;
	// 4254 7946:aload_1         
	// 4255 7947:aload_1         
	// 4256 7948:getfield        #381 <Field int azh.cg>
	// 4257 7951:aload_0         
	// 4258 7952:getfield        #12  <Field azh a>
	// 4259 7955:getfield        #378 <Field int azh.l>
	// 4260 7958:ixor            
	// 4261 7959:putfield        #381 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 4262 7962:aload_0         
	// 4263 7963:getfield        #12  <Field azh a>
	// 4264 7966:astore_1        
		abyte0.bl = ((azh) (abyte0)).aO & ~a.t;
	// 4265 7967:aload_1         
	// 4266 7968:aload_1         
	// 4267 7969:getfield        #387 <Field int azh.aO>
	// 4268 7972:aload_0         
	// 4269 7973:getfield        #12  <Field azh a>
	// 4270 7976:getfield        #372 <Field int azh.t>
	// 4271 7979:iconst_m1       
	// 4272 7980:ixor            
	// 4273 7981:iand            
	// 4274 7982:putfield        #366 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 4275 7985:aload_0         
	// 4276 7986:getfield        #12  <Field azh a>
	// 4277 7989:astore_1        
		abyte0.bl = ((azh) (abyte0)).bm ^ a.bl;
	// 4278 7990:aload_1         
	// 4279 7991:aload_1         
	// 4280 7992:getfield        #390 <Field int azh.bm>
	// 4281 7995:aload_0         
	// 4282 7996:getfield        #12  <Field azh a>
	// 4283 7999:getfield        #366 <Field int azh.bl>
	// 4284 8002:ixor            
	// 4285 8003:putfield        #366 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 4286 8006:aload_0         
	// 4287 8007:getfield        #12  <Field azh a>
	// 4288 8010:astore_1        
		abyte0.aR = ((azh) (abyte0)).t | a.aN;
	// 4289 8011:aload_1         
	// 4290 8012:aload_1         
	// 4291 8013:getfield        #372 <Field int azh.t>
	// 4292 8016:aload_0         
	// 4293 8017:getfield        #12  <Field azh a>
	// 4294 8020:getfield        #384 <Field int azh.aN>
	// 4295 8023:ior             
	// 4296 8024:putfield        #369 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 4297 8027:aload_0         
	// 4298 8028:getfield        #12  <Field azh a>
	// 4299 8031:astore_1        
		abyte0.aR = ((azh) (abyte0)).d ^ a.aR;
	// 4300 8032:aload_1         
	// 4301 8033:aload_1         
	// 4302 8034:getfield        #145 <Field int azh.d>
	// 4303 8037:aload_0         
	// 4304 8038:getfield        #12  <Field azh a>
	// 4305 8041:getfield        #369 <Field int azh.aR>
	// 4306 8044:ixor            
	// 4307 8045:putfield        #369 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 4308 8048:aload_0         
	// 4309 8049:getfield        #12  <Field azh a>
	// 4310 8052:astore_1        
		abyte0.be = ((azh) (abyte0)).aR ^ a.be;
	// 4311 8053:aload_1         
	// 4312 8054:aload_1         
	// 4313 8055:getfield        #369 <Field int azh.aR>
	// 4314 8058:aload_0         
	// 4315 8059:getfield        #12  <Field azh a>
	// 4316 8062:getfield        #393 <Field int azh.be>
	// 4317 8065:ixor            
	// 4318 8066:putfield        #393 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 4319 8069:aload_0         
	// 4320 8070:getfield        #12  <Field azh a>
	// 4321 8073:astore_1        
		abyte0.aR = ((azh) (abyte0)).J & ~a.t;
	// 4322 8074:aload_1         
	// 4323 8075:aload_1         
	// 4324 8076:getfield        #396 <Field int azh.J>
	// 4325 8079:aload_0         
	// 4326 8080:getfield        #12  <Field azh a>
	// 4327 8083:getfield        #372 <Field int azh.t>
	// 4328 8086:iconst_m1       
	// 4329 8087:ixor            
	// 4330 8088:iand            
	// 4331 8089:putfield        #369 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 4332 8092:aload_0         
	// 4333 8093:getfield        #12  <Field azh a>
	// 4334 8096:astore_1        
		abyte0.aR = ((azh) (abyte0)).aO ^ a.aR;
	// 4335 8097:aload_1         
	// 4336 8098:aload_1         
	// 4337 8099:getfield        #387 <Field int azh.aO>
	// 4338 8102:aload_0         
	// 4339 8103:getfield        #12  <Field azh a>
	// 4340 8106:getfield        #369 <Field int azh.aR>
	// 4341 8109:ixor            
	// 4342 8110:putfield        #369 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 4343 8113:aload_0         
	// 4344 8114:getfield        #12  <Field azh a>
	// 4345 8117:astore_1        
		abyte0.aR = ((azh) (abyte0)).aR & a.l;
	// 4346 8118:aload_1         
	// 4347 8119:aload_1         
	// 4348 8120:getfield        #369 <Field int azh.aR>
	// 4349 8123:aload_0         
	// 4350 8124:getfield        #12  <Field azh a>
	// 4351 8127:getfield        #378 <Field int azh.l>
	// 4352 8130:iand            
	// 4353 8131:putfield        #369 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 4354 8134:aload_0         
	// 4355 8135:getfield        #12  <Field azh a>
	// 4356 8138:astore_1        
		abyte0.cd = ((azh) (abyte0)).t | a.J;
	// 4357 8139:aload_1         
	// 4358 8140:aload_1         
	// 4359 8141:getfield        #372 <Field int azh.t>
	// 4360 8144:aload_0         
	// 4361 8145:getfield        #12  <Field azh a>
	// 4362 8148:getfield        #396 <Field int azh.J>
	// 4363 8151:ior             
	// 4364 8152:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 4365 8155:aload_0         
	// 4366 8156:getfield        #12  <Field azh a>
	// 4367 8159:astore_1        
		abyte0.cd = ((azh) (abyte0)).aN ^ a.cd;
	// 4368 8160:aload_1         
	// 4369 8161:aload_1         
	// 4370 8162:getfield        #384 <Field int azh.aN>
	// 4371 8165:aload_0         
	// 4372 8166:getfield        #12  <Field azh a>
	// 4373 8169:getfield        #59  <Field int azh.cd>
	// 4374 8172:ixor            
	// 4375 8173:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 4376 8176:aload_0         
	// 4377 8177:getfield        #12  <Field azh a>
	// 4378 8180:astore_1        
		abyte0.cd = ((azh) (abyte0)).l | a.cd;
	// 4379 8181:aload_1         
	// 4380 8182:aload_1         
	// 4381 8183:getfield        #378 <Field int azh.l>
	// 4382 8186:aload_0         
	// 4383 8187:getfield        #12  <Field azh a>
	// 4384 8190:getfield        #59  <Field int azh.cd>
	// 4385 8193:ior             
	// 4386 8194:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 4387 8197:aload_0         
	// 4388 8198:getfield        #12  <Field azh a>
	// 4389 8201:astore_1        
		abyte0.bM = ((azh) (abyte0)).t | a.J;
	// 4390 8202:aload_1         
	// 4391 8203:aload_1         
	// 4392 8204:getfield        #372 <Field int azh.t>
	// 4393 8207:aload_0         
	// 4394 8208:getfield        #12  <Field azh a>
	// 4395 8211:getfield        #396 <Field int azh.J>
	// 4396 8214:ior             
	// 4397 8215:putfield        #351 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 4398 8218:aload_0         
	// 4399 8219:getfield        #12  <Field azh a>
	// 4400 8222:astore_1        
		abyte0.bV = ((azh) (abyte0)).bm ^ a.t;
	// 4401 8223:aload_1         
	// 4402 8224:aload_1         
	// 4403 8225:getfield        #390 <Field int azh.bm>
	// 4404 8228:aload_0         
	// 4405 8229:getfield        #12  <Field azh a>
	// 4406 8232:getfield        #372 <Field int azh.t>
	// 4407 8235:ixor            
	// 4408 8236:putfield        #324 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 4409 8239:aload_0         
	// 4410 8240:getfield        #12  <Field azh a>
	// 4411 8243:astore_1        
		abyte0.bV = ((azh) (abyte0)).l & ~a.bV;
	// 4412 8244:aload_1         
	// 4413 8245:aload_1         
	// 4414 8246:getfield        #378 <Field int azh.l>
	// 4415 8249:aload_0         
	// 4416 8250:getfield        #12  <Field azh a>
	// 4417 8253:getfield        #324 <Field int azh.bV>
	// 4418 8256:iconst_m1       
	// 4419 8257:ixor            
	// 4420 8258:iand            
	// 4421 8259:putfield        #324 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 4422 8262:aload_0         
	// 4423 8263:getfield        #12  <Field azh a>
	// 4424 8266:astore_1        
		abyte0.bV = ((azh) (abyte0)).bM ^ a.bV;
	// 4425 8267:aload_1         
	// 4426 8268:aload_1         
	// 4427 8269:getfield        #351 <Field int azh.bM>
	// 4428 8272:aload_0         
	// 4429 8273:getfield        #12  <Field azh a>
	// 4430 8276:getfield        #324 <Field int azh.bV>
	// 4431 8279:ixor            
	// 4432 8280:putfield        #324 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 4433 8283:aload_0         
	// 4434 8284:getfield        #12  <Field azh a>
	// 4435 8287:astore_1        
		abyte0.bV = ((azh) (abyte0)).af | a.bV;
	// 4436 8288:aload_1         
	// 4437 8289:aload_1         
	// 4438 8290:getfield        #136 <Field int azh.af>
	// 4439 8293:aload_0         
	// 4440 8294:getfield        #12  <Field azh a>
	// 4441 8297:getfield        #324 <Field int azh.bV>
	// 4442 8300:ior             
	// 4443 8301:putfield        #324 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 4444 8304:aload_0         
	// 4445 8305:getfield        #12  <Field azh a>
	// 4446 8308:astore_1        
		abyte0.bM = ((azh) (abyte0)).d & ~a.t;
	// 4447 8309:aload_1         
	// 4448 8310:aload_1         
	// 4449 8311:getfield        #145 <Field int azh.d>
	// 4450 8314:aload_0         
	// 4451 8315:getfield        #12  <Field azh a>
	// 4452 8318:getfield        #372 <Field int azh.t>
	// 4453 8321:iconst_m1       
	// 4454 8322:ixor            
	// 4455 8323:iand            
	// 4456 8324:putfield        #351 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 4457 8327:aload_0         
	// 4458 8328:getfield        #12  <Field azh a>
	// 4459 8331:astore_1        
		abyte0.bM = ((azh) (abyte0)).l | a.bM;
	// 4460 8332:aload_1         
	// 4461 8333:aload_1         
	// 4462 8334:getfield        #378 <Field int azh.l>
	// 4463 8337:aload_0         
	// 4464 8338:getfield        #12  <Field azh a>
	// 4465 8341:getfield        #351 <Field int azh.bM>
	// 4466 8344:ior             
	// 4467 8345:putfield        #351 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 4468 8348:aload_0         
	// 4469 8349:getfield        #12  <Field azh a>
	// 4470 8352:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bE & ~a.t;
	// 4471 8353:aload_1         
	// 4472 8354:aload_1         
	// 4473 8355:getfield        #375 <Field int azh.bE>
	// 4474 8358:aload_0         
	// 4475 8359:getfield        #12  <Field azh a>
	// 4476 8362:getfield        #372 <Field int azh.t>
	// 4477 8365:iconst_m1       
	// 4478 8366:ixor            
	// 4479 8367:iand            
	// 4480 8368:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 4481 8371:aload_0         
	// 4482 8372:getfield        #12  <Field azh a>
	// 4483 8375:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bE ^ a.aZ;
	// 4484 8376:aload_1         
	// 4485 8377:aload_1         
	// 4486 8378:getfield        #375 <Field int azh.bE>
	// 4487 8381:aload_0         
	// 4488 8382:getfield        #12  <Field azh a>
	// 4489 8385:getfield        #41  <Field int azh.aZ>
	// 4490 8388:ixor            
	// 4491 8389:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 4492 8392:aload_0         
	// 4493 8393:getfield        #12  <Field azh a>
	// 4494 8396:astore_1        
		abyte0.bw = ((azh) (abyte0)).aZ ^ a.bw;
	// 4495 8397:aload_1         
	// 4496 8398:aload_1         
	// 4497 8399:getfield        #41  <Field int azh.aZ>
	// 4498 8402:aload_0         
	// 4499 8403:getfield        #12  <Field azh a>
	// 4500 8406:getfield        #399 <Field int azh.bw>
	// 4501 8409:ixor            
	// 4502 8410:putfield        #399 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 4503 8413:aload_0         
	// 4504 8414:getfield        #12  <Field azh a>
	// 4505 8417:astore_1        
		abyte0.bw = ((azh) (abyte0)).af | a.bw;
	// 4506 8418:aload_1         
	// 4507 8419:aload_1         
	// 4508 8420:getfield        #136 <Field int azh.af>
	// 4509 8423:aload_0         
	// 4510 8424:getfield        #12  <Field azh a>
	// 4511 8427:getfield        #399 <Field int azh.bw>
	// 4512 8430:ior             
	// 4513 8431:putfield        #399 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 4514 8434:aload_0         
	// 4515 8435:getfield        #12  <Field azh a>
	// 4516 8438:astore_1        
		abyte0.bd = ((azh) (abyte0)).aZ ^ a.bd;
	// 4517 8439:aload_1         
	// 4518 8440:aload_1         
	// 4519 8441:getfield        #41  <Field int azh.aZ>
	// 4520 8444:aload_0         
	// 4521 8445:getfield        #12  <Field azh a>
	// 4522 8448:getfield        #303 <Field int azh.bd>
	// 4523 8451:ixor            
	// 4524 8452:putfield        #303 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4525 8455:aload_0         
	// 4526 8456:getfield        #12  <Field azh a>
	// 4527 8459:astore_1        
		abyte0.bd = ((azh) (abyte0)).af | a.bd;
	// 4528 8460:aload_1         
	// 4529 8461:aload_1         
	// 4530 8462:getfield        #136 <Field int azh.af>
	// 4531 8465:aload_0         
	// 4532 8466:getfield        #12  <Field azh a>
	// 4533 8469:getfield        #303 <Field int azh.bd>
	// 4534 8472:ior             
	// 4535 8473:putfield        #303 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4536 8476:aload_0         
	// 4537 8477:getfield        #12  <Field azh a>
	// 4538 8480:astore_1        
		abyte0.aR = ((azh) (abyte0)).aZ ^ a.aR;
	// 4539 8481:aload_1         
	// 4540 8482:aload_1         
	// 4541 8483:getfield        #41  <Field int azh.aZ>
	// 4542 8486:aload_0         
	// 4543 8487:getfield        #12  <Field azh a>
	// 4544 8490:getfield        #369 <Field int azh.aR>
	// 4545 8493:ixor            
	// 4546 8494:putfield        #369 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 4547 8497:aload_0         
	// 4548 8498:getfield        #12  <Field azh a>
	// 4549 8501:astore_1        
		abyte0.aR = ((azh) (abyte0)).aR & ~a.af;
	// 4550 8502:aload_1         
	// 4551 8503:aload_1         
	// 4552 8504:getfield        #369 <Field int azh.aR>
	// 4553 8507:aload_0         
	// 4554 8508:getfield        #12  <Field azh a>
	// 4555 8511:getfield        #136 <Field int azh.af>
	// 4556 8514:iconst_m1       
	// 4557 8515:ixor            
	// 4558 8516:iand            
	// 4559 8517:putfield        #369 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 4560 8520:aload_0         
	// 4561 8521:getfield        #12  <Field azh a>
	// 4562 8524:astore_1        
		abyte0.aR = ((azh) (abyte0)).t ^ a.aR;
	// 4563 8525:aload_1         
	// 4564 8526:aload_1         
	// 4565 8527:getfield        #372 <Field int azh.t>
	// 4566 8530:aload_0         
	// 4567 8531:getfield        #12  <Field azh a>
	// 4568 8534:getfield        #369 <Field int azh.aR>
	// 4569 8537:ixor            
	// 4570 8538:putfield        #369 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 4571 8541:aload_0         
	// 4572 8542:getfield        #12  <Field azh a>
	// 4573 8545:astore_1        
		abyte0.aR = ((azh) (abyte0)).B & ~a.aR;
	// 4574 8546:aload_1         
	// 4575 8547:aload_1         
	// 4576 8548:getfield        #402 <Field int azh.B>
	// 4577 8551:aload_0         
	// 4578 8552:getfield        #12  <Field azh a>
	// 4579 8555:getfield        #369 <Field int azh.aR>
	// 4580 8558:iconst_m1       
	// 4581 8559:ixor            
	// 4582 8560:iand            
	// 4583 8561:putfield        #369 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 4584 8564:aload_0         
	// 4585 8565:getfield        #12  <Field azh a>
	// 4586 8568:astore_1        
		abyte0.cf = ((azh) (abyte0)).aZ ^ a.cf;
	// 4587 8569:aload_1         
	// 4588 8570:aload_1         
	// 4589 8571:getfield        #41  <Field int azh.aZ>
	// 4590 8574:aload_0         
	// 4591 8575:getfield        #12  <Field azh a>
	// 4592 8578:getfield        #405 <Field int azh.cf>
	// 4593 8581:ixor            
	// 4594 8582:putfield        #405 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 4595 8585:aload_0         
	// 4596 8586:getfield        #12  <Field azh a>
	// 4597 8589:astore_1        
		abyte0.aZ = ((azh) (abyte0)).l | a.t;
	// 4598 8590:aload_1         
	// 4599 8591:aload_1         
	// 4600 8592:getfield        #378 <Field int azh.l>
	// 4601 8595:aload_0         
	// 4602 8596:getfield        #12  <Field azh a>
	// 4603 8599:getfield        #372 <Field int azh.t>
	// 4604 8602:ior             
	// 4605 8603:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 4606 8606:aload_0         
	// 4607 8607:getfield        #12  <Field azh a>
	// 4608 8610:astore_1        
		abyte0.bV = ((azh) (abyte0)).aZ ^ a.bV;
	// 4609 8611:aload_1         
	// 4610 8612:aload_1         
	// 4611 8613:getfield        #41  <Field int azh.aZ>
	// 4612 8616:aload_0         
	// 4613 8617:getfield        #12  <Field azh a>
	// 4614 8620:getfield        #324 <Field int azh.bV>
	// 4615 8623:ixor            
	// 4616 8624:putfield        #324 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 4617 8627:aload_0         
	// 4618 8628:getfield        #12  <Field azh a>
	// 4619 8631:astore_1        
		abyte0.bV = ((azh) (abyte0)).B & ~a.bV;
	// 4620 8632:aload_1         
	// 4621 8633:aload_1         
	// 4622 8634:getfield        #402 <Field int azh.B>
	// 4623 8637:aload_0         
	// 4624 8638:getfield        #12  <Field azh a>
	// 4625 8641:getfield        #324 <Field int azh.bV>
	// 4626 8644:iconst_m1       
	// 4627 8645:ixor            
	// 4628 8646:iand            
	// 4629 8647:putfield        #324 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 4630 8650:aload_0         
	// 4631 8651:getfield        #12  <Field azh a>
	// 4632 8654:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bm & ~a.t;
	// 4633 8655:aload_1         
	// 4634 8656:aload_1         
	// 4635 8657:getfield        #390 <Field int azh.bm>
	// 4636 8660:aload_0         
	// 4637 8661:getfield        #12  <Field azh a>
	// 4638 8664:getfield        #372 <Field int azh.t>
	// 4639 8667:iconst_m1       
	// 4640 8668:ixor            
	// 4641 8669:iand            
	// 4642 8670:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 4643 8673:aload_0         
	// 4644 8674:getfield        #12  <Field azh a>
	// 4645 8677:astore_1        
		abyte0.aZ = ((azh) (abyte0)).J ^ a.aZ;
	// 4646 8678:aload_1         
	// 4647 8679:aload_1         
	// 4648 8680:getfield        #396 <Field int azh.J>
	// 4649 8683:aload_0         
	// 4650 8684:getfield        #12  <Field azh a>
	// 4651 8687:getfield        #41  <Field int azh.aZ>
	// 4652 8690:ixor            
	// 4653 8691:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 4654 8694:aload_0         
	// 4655 8695:getfield        #12  <Field azh a>
	// 4656 8698:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aZ & a.l;
	// 4657 8699:aload_1         
	// 4658 8700:aload_1         
	// 4659 8701:getfield        #41  <Field int azh.aZ>
	// 4660 8704:aload_0         
	// 4661 8705:getfield        #12  <Field azh a>
	// 4662 8708:getfield        #378 <Field int azh.l>
	// 4663 8711:iand            
	// 4664 8712:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 4665 8715:aload_0         
	// 4666 8716:getfield        #12  <Field azh a>
	// 4667 8719:astore_1        
		abyte0.aZ = ((azh) (abyte0)).J ^ a.aZ;
	// 4668 8720:aload_1         
	// 4669 8721:aload_1         
	// 4670 8722:getfield        #396 <Field int azh.J>
	// 4671 8725:aload_0         
	// 4672 8726:getfield        #12  <Field azh a>
	// 4673 8729:getfield        #41  <Field int azh.aZ>
	// 4674 8732:ixor            
	// 4675 8733:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 4676 8736:aload_0         
	// 4677 8737:getfield        #12  <Field azh a>
	// 4678 8740:astore_1        
		abyte0.aZ = ((azh) (abyte0)).af | a.aZ;
	// 4679 8741:aload_1         
	// 4680 8742:aload_1         
	// 4681 8743:getfield        #136 <Field int azh.af>
	// 4682 8746:aload_0         
	// 4683 8747:getfield        #12  <Field azh a>
	// 4684 8750:getfield        #41  <Field int azh.aZ>
	// 4685 8753:ior             
	// 4686 8754:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 4687 8757:aload_0         
	// 4688 8758:getfield        #12  <Field azh a>
	// 4689 8761:astore_1        
		abyte0.bG = ((azh) (abyte0)).t | a.aN;
	// 4690 8762:aload_1         
	// 4691 8763:aload_1         
	// 4692 8764:getfield        #372 <Field int azh.t>
	// 4693 8767:aload_0         
	// 4694 8768:getfield        #12  <Field azh a>
	// 4695 8771:getfield        #384 <Field int azh.aN>
	// 4696 8774:ior             
	// 4697 8775:putfield        #330 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 4698 8778:aload_0         
	// 4699 8779:getfield        #12  <Field azh a>
	// 4700 8782:astore_1        
		abyte0.bE = ((azh) (abyte0)).bE & ~a.t;
	// 4701 8783:aload_1         
	// 4702 8784:aload_1         
	// 4703 8785:getfield        #375 <Field int azh.bE>
	// 4704 8788:aload_0         
	// 4705 8789:getfield        #12  <Field azh a>
	// 4706 8792:getfield        #372 <Field int azh.t>
	// 4707 8795:iconst_m1       
	// 4708 8796:ixor            
	// 4709 8797:iand            
	// 4710 8798:putfield        #375 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 4711 8801:aload_0         
	// 4712 8802:getfield        #12  <Field azh a>
	// 4713 8805:astore_1        
		abyte0.bE = ((azh) (abyte0)).aO ^ a.bE;
	// 4714 8806:aload_1         
	// 4715 8807:aload_1         
	// 4716 8808:getfield        #387 <Field int azh.aO>
	// 4717 8811:aload_0         
	// 4718 8812:getfield        #12  <Field azh a>
	// 4719 8815:getfield        #375 <Field int azh.bE>
	// 4720 8818:ixor            
	// 4721 8819:putfield        #375 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 4722 8822:aload_0         
	// 4723 8823:getfield        #12  <Field azh a>
	// 4724 8826:astore_1        
		abyte0.ax = ((azh) (abyte0)).bE ^ a.ax;
	// 4725 8827:aload_1         
	// 4726 8828:aload_1         
	// 4727 8829:getfield        #375 <Field int azh.bE>
	// 4728 8832:aload_0         
	// 4729 8833:getfield        #12  <Field azh a>
	// 4730 8836:getfield        #408 <Field int azh.ax>
	// 4731 8839:ixor            
	// 4732 8840:putfield        #408 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 4733 8843:aload_0         
	// 4734 8844:getfield        #12  <Field azh a>
	// 4735 8847:astore_1        
		abyte0.ax = ((azh) (abyte0)).ax & ~a.af;
	// 4736 8848:aload_1         
	// 4737 8849:aload_1         
	// 4738 8850:getfield        #408 <Field int azh.ax>
	// 4739 8853:aload_0         
	// 4740 8854:getfield        #12  <Field azh a>
	// 4741 8857:getfield        #136 <Field int azh.af>
	// 4742 8860:iconst_m1       
	// 4743 8861:ixor            
	// 4744 8862:iand            
	// 4745 8863:putfield        #408 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 4746 8866:aload_0         
	// 4747 8867:getfield        #12  <Field azh a>
	// 4748 8870:astore_1        
		abyte0.ax = ((azh) (abyte0)).cg ^ a.ax;
	// 4749 8871:aload_1         
	// 4750 8872:aload_1         
	// 4751 8873:getfield        #381 <Field int azh.cg>
	// 4752 8876:aload_0         
	// 4753 8877:getfield        #12  <Field azh a>
	// 4754 8880:getfield        #408 <Field int azh.ax>
	// 4755 8883:ixor            
	// 4756 8884:putfield        #408 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 4757 8887:aload_0         
	// 4758 8888:getfield        #12  <Field azh a>
	// 4759 8891:astore_1        
		abyte0.cg = ((azh) (abyte0)).bv & ~a.t;
	// 4760 8892:aload_1         
	// 4761 8893:aload_1         
	// 4762 8894:getfield        #411 <Field int azh.bv>
	// 4763 8897:aload_0         
	// 4764 8898:getfield        #12  <Field azh a>
	// 4765 8901:getfield        #372 <Field int azh.t>
	// 4766 8904:iconst_m1       
	// 4767 8905:ixor            
	// 4768 8906:iand            
	// 4769 8907:putfield        #381 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 4770 8910:aload_0         
	// 4771 8911:getfield        #12  <Field azh a>
	// 4772 8914:astore_1        
		abyte0.cg = ((azh) (abyte0)).d ^ a.cg;
	// 4773 8915:aload_1         
	// 4774 8916:aload_1         
	// 4775 8917:getfield        #145 <Field int azh.d>
	// 4776 8920:aload_0         
	// 4777 8921:getfield        #12  <Field azh a>
	// 4778 8924:getfield        #381 <Field int azh.cg>
	// 4779 8927:ixor            
	// 4780 8928:putfield        #381 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 4781 8931:aload_0         
	// 4782 8932:getfield        #12  <Field azh a>
	// 4783 8935:astore_1        
		abyte0.cg = ((azh) (abyte0)).cg & a.l;
	// 4784 8936:aload_1         
	// 4785 8937:aload_1         
	// 4786 8938:getfield        #381 <Field int azh.cg>
	// 4787 8941:aload_0         
	// 4788 8942:getfield        #12  <Field azh a>
	// 4789 8945:getfield        #378 <Field int azh.l>
	// 4790 8948:iand            
	// 4791 8949:putfield        #381 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 4792 8952:aload_0         
	// 4793 8953:getfield        #12  <Field azh a>
	// 4794 8956:astore_1        
		abyte0.cg = ((azh) (abyte0)).bG ^ a.cg;
	// 4795 8957:aload_1         
	// 4796 8958:aload_1         
	// 4797 8959:getfield        #330 <Field int azh.bG>
	// 4798 8962:aload_0         
	// 4799 8963:getfield        #12  <Field azh a>
	// 4800 8966:getfield        #381 <Field int azh.cg>
	// 4801 8969:ixor            
	// 4802 8970:putfield        #381 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 4803 8973:aload_0         
	// 4804 8974:getfield        #12  <Field azh a>
	// 4805 8977:astore_1        
		abyte0.bw = ((azh) (abyte0)).cg ^ a.bw;
	// 4806 8978:aload_1         
	// 4807 8979:aload_1         
	// 4808 8980:getfield        #381 <Field int azh.cg>
	// 4809 8983:aload_0         
	// 4810 8984:getfield        #12  <Field azh a>
	// 4811 8987:getfield        #399 <Field int azh.bw>
	// 4812 8990:ixor            
	// 4813 8991:putfield        #399 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 4814 8994:aload_0         
	// 4815 8995:getfield        #12  <Field azh a>
	// 4816 8998:astore_1        
		abyte0.bm = ((azh) (abyte0)).bm & ~a.t;
	// 4817 8999:aload_1         
	// 4818 9000:aload_1         
	// 4819 9001:getfield        #390 <Field int azh.bm>
	// 4820 9004:aload_0         
	// 4821 9005:getfield        #12  <Field azh a>
	// 4822 9008:getfield        #372 <Field int azh.t>
	// 4823 9011:iconst_m1       
	// 4824 9012:ixor            
	// 4825 9013:iand            
	// 4826 9014:putfield        #390 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 4827 9017:aload_0         
	// 4828 9018:getfield        #12  <Field azh a>
	// 4829 9021:astore_1        
		abyte0.bm = ((azh) (abyte0)).aN ^ a.bm;
	// 4830 9022:aload_1         
	// 4831 9023:aload_1         
	// 4832 9024:getfield        #384 <Field int azh.aN>
	// 4833 9027:aload_0         
	// 4834 9028:getfield        #12  <Field azh a>
	// 4835 9031:getfield        #390 <Field int azh.bm>
	// 4836 9034:ixor            
	// 4837 9035:putfield        #390 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 4838 9038:aload_0         
	// 4839 9039:getfield        #12  <Field azh a>
	// 4840 9042:astore_1        
		abyte0.aN = ((azh) (abyte0)).l & ~a.bm;
	// 4841 9043:aload_1         
	// 4842 9044:aload_1         
	// 4843 9045:getfield        #378 <Field int azh.l>
	// 4844 9048:aload_0         
	// 4845 9049:getfield        #12  <Field azh a>
	// 4846 9052:getfield        #390 <Field int azh.bm>
	// 4847 9055:iconst_m1       
	// 4848 9056:ixor            
	// 4849 9057:iand            
	// 4850 9058:putfield        #384 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 4851 9061:aload_0         
	// 4852 9062:getfield        #12  <Field azh a>
	// 4853 9065:astore_1        
		abyte0.aN = ((azh) (abyte0)).bl ^ a.aN;
	// 4854 9066:aload_1         
	// 4855 9067:aload_1         
	// 4856 9068:getfield        #366 <Field int azh.bl>
	// 4857 9071:aload_0         
	// 4858 9072:getfield        #12  <Field azh a>
	// 4859 9075:getfield        #384 <Field int azh.aN>
	// 4860 9078:ixor            
	// 4861 9079:putfield        #384 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 4862 9082:aload_0         
	// 4863 9083:getfield        #12  <Field azh a>
	// 4864 9086:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aN ^ a.aZ;
	// 4865 9087:aload_1         
	// 4866 9088:aload_1         
	// 4867 9089:getfield        #384 <Field int azh.aN>
	// 4868 9092:aload_0         
	// 4869 9093:getfield        #12  <Field azh a>
	// 4870 9096:getfield        #41  <Field int azh.aZ>
	// 4871 9099:ixor            
	// 4872 9100:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 4873 9103:aload_0         
	// 4874 9104:getfield        #12  <Field azh a>
	// 4875 9107:astore_1        
		abyte0.bV = ((azh) (abyte0)).aZ ^ a.bV;
	// 4876 9108:aload_1         
	// 4877 9109:aload_1         
	// 4878 9110:getfield        #41  <Field int azh.aZ>
	// 4879 9113:aload_0         
	// 4880 9114:getfield        #12  <Field azh a>
	// 4881 9117:getfield        #324 <Field int azh.bV>
	// 4882 9120:ixor            
	// 4883 9121:putfield        #324 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 4884 9124:aload_0         
	// 4885 9125:getfield        #12  <Field azh a>
	// 4886 9128:astore_1        
		abyte0.Q = ((azh) (abyte0)).bV ^ a.Q;
	// 4887 9129:aload_1         
	// 4888 9130:aload_1         
	// 4889 9131:getfield        #324 <Field int azh.bV>
	// 4890 9134:aload_0         
	// 4891 9135:getfield        #12  <Field azh a>
	// 4892 9138:getfield        #414 <Field int azh.Q>
	// 4893 9141:ixor            
	// 4894 9142:putfield        #414 <Field int azh.Q>
		abyte0 = ((byte []) (a));
	// 4895 9145:aload_0         
	// 4896 9146:getfield        #12  <Field azh a>
	// 4897 9149:astore_1        
		abyte0.bM = ((azh) (abyte0)).bm ^ a.bM;
	// 4898 9150:aload_1         
	// 4899 9151:aload_1         
	// 4900 9152:getfield        #390 <Field int azh.bm>
	// 4901 9155:aload_0         
	// 4902 9156:getfield        #12  <Field azh a>
	// 4903 9159:getfield        #351 <Field int azh.bM>
	// 4904 9162:ixor            
	// 4905 9163:putfield        #351 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 4906 9166:aload_0         
	// 4907 9167:getfield        #12  <Field azh a>
	// 4908 9170:astore_1        
		abyte0.bd = ((azh) (abyte0)).bM ^ a.bd;
	// 4909 9171:aload_1         
	// 4910 9172:aload_1         
	// 4911 9173:getfield        #351 <Field int azh.bM>
	// 4912 9176:aload_0         
	// 4913 9177:getfield        #12  <Field azh a>
	// 4914 9180:getfield        #303 <Field int azh.bd>
	// 4915 9183:ixor            
	// 4916 9184:putfield        #303 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 4917 9187:aload_0         
	// 4918 9188:getfield        #12  <Field azh a>
	// 4919 9191:astore_1        
		abyte0.aR = ((azh) (abyte0)).bd ^ a.aR;
	// 4920 9192:aload_1         
	// 4921 9193:aload_1         
	// 4922 9194:getfield        #303 <Field int azh.bd>
	// 4923 9197:aload_0         
	// 4924 9198:getfield        #12  <Field azh a>
	// 4925 9201:getfield        #369 <Field int azh.aR>
	// 4926 9204:ixor            
	// 4927 9205:putfield        #369 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 4928 9208:aload_0         
	// 4929 9209:getfield        #12  <Field azh a>
	// 4930 9212:astore_1        
		abyte0.M = ((azh) (abyte0)).aR ^ a.M;
	// 4931 9213:aload_1         
	// 4932 9214:aload_1         
	// 4933 9215:getfield        #369 <Field int azh.aR>
	// 4934 9218:aload_0         
	// 4935 9219:getfield        #12  <Field azh a>
	// 4936 9222:getfield        #417 <Field int azh.M>
	// 4937 9225:ixor            
	// 4938 9226:putfield        #417 <Field int azh.M>
		abyte0 = ((byte []) (a));
	// 4939 9229:aload_0         
	// 4940 9230:getfield        #12  <Field azh a>
	// 4941 9233:astore_1        
		abyte0.ch = ((azh) (abyte0)).t | a.ch;
	// 4942 9234:aload_1         
	// 4943 9235:aload_1         
	// 4944 9236:getfield        #372 <Field int azh.t>
	// 4945 9239:aload_0         
	// 4946 9240:getfield        #12  <Field azh a>
	// 4947 9243:getfield        #420 <Field int azh.ch>
	// 4948 9246:ior             
	// 4949 9247:putfield        #420 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 4950 9250:aload_0         
	// 4951 9251:getfield        #12  <Field azh a>
	// 4952 9254:astore_1        
		abyte0.ch = ((azh) (abyte0)).bv ^ a.ch;
	// 4953 9255:aload_1         
	// 4954 9256:aload_1         
	// 4955 9257:getfield        #411 <Field int azh.bv>
	// 4956 9260:aload_0         
	// 4957 9261:getfield        #12  <Field azh a>
	// 4958 9264:getfield        #420 <Field int azh.ch>
	// 4959 9267:ixor            
	// 4960 9268:putfield        #420 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 4961 9271:aload_0         
	// 4962 9272:getfield        #12  <Field azh a>
	// 4963 9275:astore_1        
		abyte0.cd = ((azh) (abyte0)).ch ^ a.cd;
	// 4964 9276:aload_1         
	// 4965 9277:aload_1         
	// 4966 9278:getfield        #420 <Field int azh.ch>
	// 4967 9281:aload_0         
	// 4968 9282:getfield        #12  <Field azh a>
	// 4969 9285:getfield        #59  <Field int azh.cd>
	// 4970 9288:ixor            
	// 4971 9289:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 4972 9292:aload_0         
	// 4973 9293:getfield        #12  <Field azh a>
	// 4974 9296:astore_1        
		abyte0.cd = ((azh) (abyte0)).cd & ~a.af;
	// 4975 9297:aload_1         
	// 4976 9298:aload_1         
	// 4977 9299:getfield        #59  <Field int azh.cd>
	// 4978 9302:aload_0         
	// 4979 9303:getfield        #12  <Field azh a>
	// 4980 9306:getfield        #136 <Field int azh.af>
	// 4981 9309:iconst_m1       
	// 4982 9310:ixor            
	// 4983 9311:iand            
	// 4984 9312:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 4985 9315:aload_0         
	// 4986 9316:getfield        #12  <Field azh a>
	// 4987 9319:astore_1        
		abyte0.cd = ((azh) (abyte0)).cf ^ a.cd;
	// 4988 9320:aload_1         
	// 4989 9321:aload_1         
	// 4990 9322:getfield        #405 <Field int azh.cf>
	// 4991 9325:aload_0         
	// 4992 9326:getfield        #12  <Field azh a>
	// 4993 9329:getfield        #59  <Field int azh.cd>
	// 4994 9332:ixor            
	// 4995 9333:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 4996 9336:aload_0         
	// 4997 9337:getfield        #12  <Field azh a>
	// 4998 9340:astore_1        
		abyte0.cd = ((azh) (abyte0)).B & ~a.cd;
	// 4999 9341:aload_1         
	// 5000 9342:aload_1         
	// 5001 9343:getfield        #402 <Field int azh.B>
	// 5002 9346:aload_0         
	// 5003 9347:getfield        #12  <Field azh a>
	// 5004 9350:getfield        #59  <Field int azh.cd>
	// 5005 9353:iconst_m1       
	// 5006 9354:ixor            
	// 5007 9355:iand            
	// 5008 9356:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 5009 9359:aload_0         
	// 5010 9360:getfield        #12  <Field azh a>
	// 5011 9363:astore_1        
		abyte0.cd = ((azh) (abyte0)).bw ^ a.cd;
	// 5012 9364:aload_1         
	// 5013 9365:aload_1         
	// 5014 9366:getfield        #399 <Field int azh.bw>
	// 5015 9369:aload_0         
	// 5016 9370:getfield        #12  <Field azh a>
	// 5017 9373:getfield        #59  <Field int azh.cd>
	// 5018 9376:ixor            
	// 5019 9377:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 5020 9380:aload_0         
	// 5021 9381:getfield        #12  <Field azh a>
	// 5022 9384:astore_1        
		abyte0.y = ((azh) (abyte0)).cd ^ a.y;
	// 5023 9385:aload_1         
	// 5024 9386:aload_1         
	// 5025 9387:getfield        #59  <Field int azh.cd>
	// 5026 9390:aload_0         
	// 5027 9391:getfield        #12  <Field azh a>
	// 5028 9394:getfield        #423 <Field int azh.y>
	// 5029 9397:ixor            
	// 5030 9398:putfield        #423 <Field int azh.y>
		abyte0 = ((byte []) (a));
	// 5031 9401:aload_0         
	// 5032 9402:getfield        #12  <Field azh a>
	// 5033 9405:astore_1        
		abyte0.cd = ((azh) (abyte0)).c | a.y;
	// 5034 9406:aload_1         
	// 5035 9407:aload_1         
	// 5036 9408:getfield        #100 <Field int azh.c>
	// 5037 9411:aload_0         
	// 5038 9412:getfield        #12  <Field azh a>
	// 5039 9415:getfield        #423 <Field int azh.y>
	// 5040 9418:ior             
	// 5041 9419:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 5042 9422:aload_0         
	// 5043 9423:getfield        #12  <Field azh a>
	// 5044 9426:astore_1        
		abyte0.aP = ((azh) (abyte0)).cd ^ a.aP;
	// 5045 9427:aload_1         
	// 5046 9428:aload_1         
	// 5047 9429:getfield        #59  <Field int azh.cd>
	// 5048 9432:aload_0         
	// 5049 9433:getfield        #12  <Field azh a>
	// 5050 9436:getfield        #231 <Field int azh.aP>
	// 5051 9439:ixor            
	// 5052 9440:putfield        #231 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 5053 9443:aload_0         
	// 5054 9444:getfield        #12  <Field azh a>
	// 5055 9447:astore_1        
		abyte0.cc = ((azh) (abyte0)).aP ^ a.cc;
	// 5056 9448:aload_1         
	// 5057 9449:aload_1         
	// 5058 9450:getfield        #231 <Field int azh.aP>
	// 5059 9453:aload_0         
	// 5060 9454:getfield        #12  <Field azh a>
	// 5061 9457:getfield        #252 <Field int azh.cc>
	// 5062 9460:ixor            
	// 5063 9461:putfield        #252 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 5064 9464:aload_0         
	// 5065 9465:getfield        #12  <Field azh a>
	// 5066 9468:astore_1        
		abyte0.cc = ((azh) (abyte0)).G & ~a.cc;
	// 5067 9469:aload_1         
	// 5068 9470:aload_1         
	// 5069 9471:getfield        #348 <Field int azh.G>
	// 5070 9474:aload_0         
	// 5071 9475:getfield        #12  <Field azh a>
	// 5072 9478:getfield        #252 <Field int azh.cc>
	// 5073 9481:iconst_m1       
	// 5074 9482:ixor            
	// 5075 9483:iand            
	// 5076 9484:putfield        #252 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 5077 9487:aload_0         
	// 5078 9488:getfield        #12  <Field azh a>
	// 5079 9491:astore_1        
		abyte0.cd = ((azh) (abyte0)).bF | a.cd;
	// 5080 9492:aload_1         
	// 5081 9493:aload_1         
	// 5082 9494:getfield        #255 <Field int azh.bF>
	// 5083 9497:aload_0         
	// 5084 9498:getfield        #12  <Field azh a>
	// 5085 9501:getfield        #59  <Field int azh.cd>
	// 5086 9504:ior             
	// 5087 9505:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 5088 9508:aload_0         
	// 5089 9509:getfield        #12  <Field azh a>
	// 5090 9512:astore_1        
		abyte0.cd = ((azh) (abyte0)).bT | a.cd;
	// 5091 9513:aload_1         
	// 5092 9514:aload_1         
	// 5093 9515:getfield        #35  <Field int azh.bT>
	// 5094 9518:aload_0         
	// 5095 9519:getfield        #12  <Field azh a>
	// 5096 9522:getfield        #59  <Field int azh.cd>
	// 5097 9525:ior             
	// 5098 9526:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 5099 9529:aload_0         
	// 5100 9530:getfield        #12  <Field azh a>
	// 5101 9533:astore_1        
		abyte0.aL = ((azh) (abyte0)).y & a.aL;
	// 5102 9534:aload_1         
	// 5103 9535:aload_1         
	// 5104 9536:getfield        #423 <Field int azh.y>
	// 5105 9539:aload_0         
	// 5106 9540:getfield        #12  <Field azh a>
	// 5107 9543:getfield        #249 <Field int azh.aL>
	// 5108 9546:iand            
	// 5109 9547:putfield        #249 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 5110 9550:aload_0         
	// 5111 9551:getfield        #12  <Field azh a>
	// 5112 9554:astore_1        
		abyte0.aL = ((azh) (abyte0)).G ^ a.aL;
	// 5113 9555:aload_1         
	// 5114 9556:aload_1         
	// 5115 9557:getfield        #348 <Field int azh.G>
	// 5116 9560:aload_0         
	// 5117 9561:getfield        #12  <Field azh a>
	// 5118 9564:getfield        #249 <Field int azh.aL>
	// 5119 9567:ixor            
	// 5120 9568:putfield        #249 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 5121 9571:aload_0         
	// 5122 9572:getfield        #12  <Field azh a>
	// 5123 9575:astore_1        
		abyte0.bw = ((azh) (abyte0)).bF | a.y;
	// 5124 9576:aload_1         
	// 5125 9577:aload_1         
	// 5126 9578:getfield        #255 <Field int azh.bF>
	// 5127 9581:aload_0         
	// 5128 9582:getfield        #12  <Field azh a>
	// 5129 9585:getfield        #423 <Field int azh.y>
	// 5130 9588:ior             
	// 5131 9589:putfield        #399 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 5132 9592:aload_0         
	// 5133 9593:getfield        #12  <Field azh a>
	// 5134 9596:astore_1        
		abyte0.cf = ((azh) (abyte0)).y & a.bq;
	// 5135 9597:aload_1         
	// 5136 9598:aload_1         
	// 5137 9599:getfield        #423 <Field int azh.y>
	// 5138 9602:aload_0         
	// 5139 9603:getfield        #12  <Field azh a>
	// 5140 9606:getfield        #270 <Field int azh.bq>
	// 5141 9609:iand            
	// 5142 9610:putfield        #405 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 5143 9613:aload_0         
	// 5144 9614:getfield        #12  <Field azh a>
	// 5145 9617:astore_1        
		abyte0.bv = ((azh) (abyte0)).c ^ a.y;
	// 5146 9618:aload_1         
	// 5147 9619:aload_1         
	// 5148 9620:getfield        #100 <Field int azh.c>
	// 5149 9623:aload_0         
	// 5150 9624:getfield        #12  <Field azh a>
	// 5151 9627:getfield        #423 <Field int azh.y>
	// 5152 9630:ixor            
	// 5153 9631:putfield        #411 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 5154 9634:aload_0         
	// 5155 9635:getfield        #12  <Field azh a>
	// 5156 9638:astore_1        
		abyte0.aR = ((azh) (abyte0)).bT | a.bv;
	// 5157 9639:aload_1         
	// 5158 9640:aload_1         
	// 5159 9641:getfield        #35  <Field int azh.bT>
	// 5160 9644:aload_0         
	// 5161 9645:getfield        #12  <Field azh a>
	// 5162 9648:getfield        #411 <Field int azh.bv>
	// 5163 9651:ior             
	// 5164 9652:putfield        #369 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 5165 9655:aload_0         
	// 5166 9656:getfield        #12  <Field azh a>
	// 5167 9659:astore_1        
		abyte0.bd = ((azh) (abyte0)).bv & ~a.bF;
	// 5168 9660:aload_1         
	// 5169 9661:aload_1         
	// 5170 9662:getfield        #411 <Field int azh.bv>
	// 5171 9665:aload_0         
	// 5172 9666:getfield        #12  <Field azh a>
	// 5173 9669:getfield        #255 <Field int azh.bF>
	// 5174 9672:iconst_m1       
	// 5175 9673:ixor            
	// 5176 9674:iand            
	// 5177 9675:putfield        #303 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 5178 9678:aload_0         
	// 5179 9679:getfield        #12  <Field azh a>
	// 5180 9682:astore_1        
		abyte0.bd = ((azh) (abyte0)).c ^ a.bd;
	// 5181 9683:aload_1         
	// 5182 9684:aload_1         
	// 5183 9685:getfield        #100 <Field int azh.c>
	// 5184 9688:aload_0         
	// 5185 9689:getfield        #12  <Field azh a>
	// 5186 9692:getfield        #303 <Field int azh.bd>
	// 5187 9695:ixor            
	// 5188 9696:putfield        #303 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 5189 9699:aload_0         
	// 5190 9700:getfield        #12  <Field azh a>
	// 5191 9703:astore_1        
		abyte0.bM = ((azh) (abyte0)).bv ^ a.bF;
	// 5192 9704:aload_1         
	// 5193 9705:aload_1         
	// 5194 9706:getfield        #411 <Field int azh.bv>
	// 5195 9709:aload_0         
	// 5196 9710:getfield        #12  <Field azh a>
	// 5197 9713:getfield        #255 <Field int azh.bF>
	// 5198 9716:ixor            
	// 5199 9717:putfield        #351 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 5200 9720:aload_0         
	// 5201 9721:getfield        #12  <Field azh a>
	// 5202 9724:astore_1        
		abyte0.bm = ((azh) (abyte0)).bv & ~a.bF;
	// 5203 9725:aload_1         
	// 5204 9726:aload_1         
	// 5205 9727:getfield        #411 <Field int azh.bv>
	// 5206 9730:aload_0         
	// 5207 9731:getfield        #12  <Field azh a>
	// 5208 9734:getfield        #255 <Field int azh.bF>
	// 5209 9737:iconst_m1       
	// 5210 9738:ixor            
	// 5211 9739:iand            
	// 5212 9740:putfield        #390 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 5213 9743:aload_0         
	// 5214 9744:getfield        #12  <Field azh a>
	// 5215 9747:astore_1        
		abyte0.bV = ((azh) (abyte0)).y & a.G;
	// 5216 9748:aload_1         
	// 5217 9749:aload_1         
	// 5218 9750:getfield        #423 <Field int azh.y>
	// 5219 9753:aload_0         
	// 5220 9754:getfield        #12  <Field azh a>
	// 5221 9757:getfield        #348 <Field int azh.G>
	// 5222 9760:iand            
	// 5223 9761:putfield        #324 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 5224 9764:aload_0         
	// 5225 9765:getfield        #12  <Field azh a>
	// 5226 9768:astore_1        
		abyte0.bV = ((azh) (abyte0)).a | a.bV;
	// 5227 9769:aload_1         
	// 5228 9770:aload_1         
	// 5229 9771:getfield        #183 <Field int azh.a>
	// 5230 9774:aload_0         
	// 5231 9775:getfield        #12  <Field azh a>
	// 5232 9778:getfield        #324 <Field int azh.bV>
	// 5233 9781:ior             
	// 5234 9782:putfield        #324 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 5235 9785:aload_0         
	// 5236 9786:getfield        #12  <Field azh a>
	// 5237 9789:astore_1        
		abyte0.bV = ((azh) (abyte0)).aL ^ a.bV;
	// 5238 9790:aload_1         
	// 5239 9791:aload_1         
	// 5240 9792:getfield        #249 <Field int azh.aL>
	// 5241 9795:aload_0         
	// 5242 9796:getfield        #12  <Field azh a>
	// 5243 9799:getfield        #324 <Field int azh.bV>
	// 5244 9802:ixor            
	// 5245 9803:putfield        #324 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 5246 9806:aload_0         
	// 5247 9807:getfield        #12  <Field azh a>
	// 5248 9810:astore_1        
		abyte0.aL = ((azh) (abyte0)).c & ~a.y;
	// 5249 9811:aload_1         
	// 5250 9812:aload_1         
	// 5251 9813:getfield        #100 <Field int azh.c>
	// 5252 9816:aload_0         
	// 5253 9817:getfield        #12  <Field azh a>
	// 5254 9820:getfield        #423 <Field int azh.y>
	// 5255 9823:iconst_m1       
	// 5256 9824:ixor            
	// 5257 9825:iand            
	// 5258 9826:putfield        #249 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 5259 9829:aload_0         
	// 5260 9830:getfield        #12  <Field azh a>
	// 5261 9833:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aL & ~a.bF;
	// 5262 9834:aload_1         
	// 5263 9835:aload_1         
	// 5264 9836:getfield        #249 <Field int azh.aL>
	// 5265 9839:aload_0         
	// 5266 9840:getfield        #12  <Field azh a>
	// 5267 9843:getfield        #255 <Field int azh.bF>
	// 5268 9846:iconst_m1       
	// 5269 9847:ixor            
	// 5270 9848:iand            
	// 5271 9849:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 5272 9852:aload_0         
	// 5273 9853:getfield        #12  <Field azh a>
	// 5274 9856:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aZ & ~a.bT;
	// 5275 9857:aload_1         
	// 5276 9858:aload_1         
	// 5277 9859:getfield        #41  <Field int azh.aZ>
	// 5278 9862:aload_0         
	// 5279 9863:getfield        #12  <Field azh a>
	// 5280 9866:getfield        #35  <Field int azh.bT>
	// 5281 9869:iconst_m1       
	// 5282 9870:ixor            
	// 5283 9871:iand            
	// 5284 9872:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 5285 9875:aload_0         
	// 5286 9876:getfield        #12  <Field azh a>
	// 5287 9879:astore_1        
		abyte0.cd = ((azh) (abyte0)).aL ^ a.cd;
	// 5288 9880:aload_1         
	// 5289 9881:aload_1         
	// 5290 9882:getfield        #249 <Field int azh.aL>
	// 5291 9885:aload_0         
	// 5292 9886:getfield        #12  <Field azh a>
	// 5293 9889:getfield        #59  <Field int azh.cd>
	// 5294 9892:ixor            
	// 5295 9893:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 5296 9896:aload_0         
	// 5297 9897:getfield        #12  <Field azh a>
	// 5298 9900:astore_1        
		abyte0.cd = ((azh) (abyte0)).G & ~a.cd;
	// 5299 9901:aload_1         
	// 5300 9902:aload_1         
	// 5301 9903:getfield        #348 <Field int azh.G>
	// 5302 9906:aload_0         
	// 5303 9907:getfield        #12  <Field azh a>
	// 5304 9910:getfield        #59  <Field int azh.cd>
	// 5305 9913:iconst_m1       
	// 5306 9914:ixor            
	// 5307 9915:iand            
	// 5308 9916:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 5309 9919:aload_0         
	// 5310 9920:getfield        #12  <Field azh a>
	// 5311 9923:astore_1        
		abyte0.aN = ((azh) (abyte0)).aL | a.y;
	// 5312 9924:aload_1         
	// 5313 9925:aload_1         
	// 5314 9926:getfield        #249 <Field int azh.aL>
	// 5315 9929:aload_0         
	// 5316 9930:getfield        #12  <Field azh a>
	// 5317 9933:getfield        #423 <Field int azh.y>
	// 5318 9936:ior             
	// 5319 9937:putfield        #384 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 5320 9940:aload_0         
	// 5321 9941:getfield        #12  <Field azh a>
	// 5322 9944:astore_1        
		abyte0.bl = ((azh) (abyte0)).aN ^ a.bF;
	// 5323 9945:aload_1         
	// 5324 9946:aload_1         
	// 5325 9947:getfield        #384 <Field int azh.aN>
	// 5326 9950:aload_0         
	// 5327 9951:getfield        #12  <Field azh a>
	// 5328 9954:getfield        #255 <Field int azh.bF>
	// 5329 9957:ixor            
	// 5330 9958:putfield        #366 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 5331 9961:aload_0         
	// 5332 9962:getfield        #12  <Field azh a>
	// 5333 9965:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bl ^ a.aZ;
	// 5334 9966:aload_1         
	// 5335 9967:aload_1         
	// 5336 9968:getfield        #366 <Field int azh.bl>
	// 5337 9971:aload_0         
	// 5338 9972:getfield        #12  <Field azh a>
	// 5339 9975:getfield        #41  <Field int azh.aZ>
	// 5340 9978:ixor            
	// 5341 9979:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 5342 9982:aload_0         
	// 5343 9983:getfield        #12  <Field azh a>
	// 5344 9986:astore_1        
		abyte0.aL = ((azh) (abyte0)).aL & ~a.bT;
	// 5345 9987:aload_1         
	// 5346 9988:aload_1         
	// 5347 9989:getfield        #249 <Field int azh.aL>
	// 5348 9992:aload_0         
	// 5349 9993:getfield        #12  <Field azh a>
	// 5350 9996:getfield        #35  <Field int azh.bT>
	// 5351 9999:iconst_m1       
	// 5352 10000:ixor            
	// 5353 10001:iand            
	// 5354 10002:putfield        #249 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 5355 10005:aload_0         
	// 5356 10006:getfield        #12  <Field azh a>
	// 5357 10009:astore_1        
		abyte0.aL = ((azh) (abyte0)).aP ^ a.aL;
	// 5358 10010:aload_1         
	// 5359 10011:aload_1         
	// 5360 10012:getfield        #231 <Field int azh.aP>
	// 5361 10015:aload_0         
	// 5362 10016:getfield        #12  <Field azh a>
	// 5363 10019:getfield        #249 <Field int azh.aL>
	// 5364 10022:ixor            
	// 5365 10023:putfield        #249 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 5366 10026:aload_0         
	// 5367 10027:getfield        #12  <Field azh a>
	// 5368 10030:astore_1        
		abyte0.aL = ((azh) (abyte0)).G & a.aL;
	// 5369 10031:aload_1         
	// 5370 10032:aload_1         
	// 5371 10033:getfield        #348 <Field int azh.G>
	// 5372 10036:aload_0         
	// 5373 10037:getfield        #12  <Field azh a>
	// 5374 10040:getfield        #249 <Field int azh.aL>
	// 5375 10043:iand            
	// 5376 10044:putfield        #249 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 5377 10047:aload_0         
	// 5378 10048:getfield        #12  <Field azh a>
	// 5379 10051:astore_1        
		abyte0.aL = ((azh) (abyte0)).aZ ^ a.aL;
	// 5380 10052:aload_1         
	// 5381 10053:aload_1         
	// 5382 10054:getfield        #41  <Field int azh.aZ>
	// 5383 10057:aload_0         
	// 5384 10058:getfield        #12  <Field azh a>
	// 5385 10061:getfield        #249 <Field int azh.aL>
	// 5386 10064:ixor            
	// 5387 10065:putfield        #249 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 5388 10068:aload_0         
	// 5389 10069:getfield        #12  <Field azh a>
	// 5390 10072:astore_1        
		abyte0.aZ = ((azh) (abyte0)).y & a.c;
	// 5391 10073:aload_1         
	// 5392 10074:aload_1         
	// 5393 10075:getfield        #423 <Field int azh.y>
	// 5394 10078:aload_0         
	// 5395 10079:getfield        #12  <Field azh a>
	// 5396 10082:getfield        #100 <Field int azh.c>
	// 5397 10085:iand            
	// 5398 10086:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 5399 10089:aload_0         
	// 5400 10090:getfield        #12  <Field azh a>
	// 5401 10093:astore_1        
		abyte0.aP = ((azh) (abyte0)).aZ & ~a.bT;
	// 5402 10094:aload_1         
	// 5403 10095:aload_1         
	// 5404 10096:getfield        #41  <Field int azh.aZ>
	// 5405 10099:aload_0         
	// 5406 10100:getfield        #12  <Field azh a>
	// 5407 10103:getfield        #35  <Field int azh.bT>
	// 5408 10106:iconst_m1       
	// 5409 10107:ixor            
	// 5410 10108:iand            
	// 5411 10109:putfield        #231 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 5412 10112:aload_0         
	// 5413 10113:getfield        #12  <Field azh a>
	// 5414 10116:astore_1        
		abyte0.aP = ((azh) (abyte0)).bd ^ a.aP;
	// 5415 10117:aload_1         
	// 5416 10118:aload_1         
	// 5417 10119:getfield        #303 <Field int azh.bd>
	// 5418 10122:aload_0         
	// 5419 10123:getfield        #12  <Field azh a>
	// 5420 10126:getfield        #231 <Field int azh.aP>
	// 5421 10129:ixor            
	// 5422 10130:putfield        #231 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 5423 10133:aload_0         
	// 5424 10134:getfield        #12  <Field azh a>
	// 5425 10137:astore_1        
		abyte0.aP = ((azh) (abyte0)).G & ~a.aP;
	// 5426 10138:aload_1         
	// 5427 10139:aload_1         
	// 5428 10140:getfield        #348 <Field int azh.G>
	// 5429 10143:aload_0         
	// 5430 10144:getfield        #12  <Field azh a>
	// 5431 10147:getfield        #231 <Field int azh.aP>
	// 5432 10150:iconst_m1       
	// 5433 10151:ixor            
	// 5434 10152:iand            
	// 5435 10153:putfield        #231 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 5436 10156:aload_0         
	// 5437 10157:getfield        #12  <Field azh a>
	// 5438 10160:astore_1        
		abyte0.bl = ((azh) (abyte0)).aZ & ~a.bF;
	// 5439 10161:aload_1         
	// 5440 10162:aload_1         
	// 5441 10163:getfield        #41  <Field int azh.aZ>
	// 5442 10166:aload_0         
	// 5443 10167:getfield        #12  <Field azh a>
	// 5444 10170:getfield        #255 <Field int azh.bF>
	// 5445 10173:iconst_m1       
	// 5446 10174:ixor            
	// 5447 10175:iand            
	// 5448 10176:putfield        #366 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 5449 10179:aload_0         
	// 5450 10180:getfield        #12  <Field azh a>
	// 5451 10183:astore_1        
		abyte0.bl = ((azh) (abyte0)).aZ ^ a.bl;
	// 5452 10184:aload_1         
	// 5453 10185:aload_1         
	// 5454 10186:getfield        #41  <Field int azh.aZ>
	// 5455 10189:aload_0         
	// 5456 10190:getfield        #12  <Field azh a>
	// 5457 10193:getfield        #366 <Field int azh.bl>
	// 5458 10196:ixor            
	// 5459 10197:putfield        #366 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 5460 10200:aload_0         
	// 5461 10201:getfield        #12  <Field azh a>
	// 5462 10204:astore_1        
		abyte0.aR = ((azh) (abyte0)).bl ^ a.aR;
	// 5463 10205:aload_1         
	// 5464 10206:aload_1         
	// 5465 10207:getfield        #366 <Field int azh.bl>
	// 5466 10210:aload_0         
	// 5467 10211:getfield        #12  <Field azh a>
	// 5468 10214:getfield        #369 <Field int azh.aR>
	// 5469 10217:ixor            
	// 5470 10218:putfield        #369 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 5471 10221:aload_0         
	// 5472 10222:getfield        #12  <Field azh a>
	// 5473 10225:astore_1        
		abyte0.aR = ((azh) (abyte0)).G & ~a.aR;
	// 5474 10226:aload_1         
	// 5475 10227:aload_1         
	// 5476 10228:getfield        #348 <Field int azh.G>
	// 5477 10231:aload_0         
	// 5478 10232:getfield        #12  <Field azh a>
	// 5479 10235:getfield        #369 <Field int azh.aR>
	// 5480 10238:iconst_m1       
	// 5481 10239:ixor            
	// 5482 10240:iand            
	// 5483 10241:putfield        #369 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 5484 10244:aload_0         
	// 5485 10245:getfield        #12  <Field azh a>
	// 5486 10248:astore_1        
		abyte0.bl = ((azh) (abyte0)).bl & ~a.bT;
	// 5487 10249:aload_1         
	// 5488 10250:aload_1         
	// 5489 10251:getfield        #366 <Field int azh.bl>
	// 5490 10254:aload_0         
	// 5491 10255:getfield        #12  <Field azh a>
	// 5492 10258:getfield        #35  <Field int azh.bT>
	// 5493 10261:iconst_m1       
	// 5494 10262:ixor            
	// 5495 10263:iand            
	// 5496 10264:putfield        #366 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 5497 10267:aload_0         
	// 5498 10268:getfield        #12  <Field azh a>
	// 5499 10271:astore_1        
		abyte0.bl = ((azh) (abyte0)).bw ^ a.bl;
	// 5500 10272:aload_1         
	// 5501 10273:aload_1         
	// 5502 10274:getfield        #399 <Field int azh.bw>
	// 5503 10277:aload_0         
	// 5504 10278:getfield        #12  <Field azh a>
	// 5505 10281:getfield        #366 <Field int azh.bl>
	// 5506 10284:ixor            
	// 5507 10285:putfield        #366 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 5508 10288:aload_0         
	// 5509 10289:getfield        #12  <Field azh a>
	// 5510 10292:astore_1        
		abyte0.aP = ((azh) (abyte0)).bl ^ a.aP;
	// 5511 10293:aload_1         
	// 5512 10294:aload_1         
	// 5513 10295:getfield        #366 <Field int azh.bl>
	// 5514 10298:aload_0         
	// 5515 10299:getfield        #12  <Field azh a>
	// 5516 10302:getfield        #231 <Field int azh.aP>
	// 5517 10305:ixor            
	// 5518 10306:putfield        #231 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 5519 10309:aload_0         
	// 5520 10310:getfield        #12  <Field azh a>
	// 5521 10313:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bT | a.aZ;
	// 5522 10314:aload_1         
	// 5523 10315:aload_1         
	// 5524 10316:getfield        #35  <Field int azh.bT>
	// 5525 10319:aload_0         
	// 5526 10320:getfield        #12  <Field azh a>
	// 5527 10323:getfield        #41  <Field int azh.aZ>
	// 5528 10326:ior             
	// 5529 10327:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 5530 10330:aload_0         
	// 5531 10331:getfield        #12  <Field azh a>
	// 5532 10334:astore_1        
		abyte0.aZ = ((azh) (abyte0)).bM ^ a.aZ;
	// 5533 10335:aload_1         
	// 5534 10336:aload_1         
	// 5535 10337:getfield        #351 <Field int azh.bM>
	// 5536 10340:aload_0         
	// 5537 10341:getfield        #12  <Field azh a>
	// 5538 10344:getfield        #41  <Field int azh.aZ>
	// 5539 10347:ixor            
	// 5540 10348:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 5541 10351:aload_0         
	// 5542 10352:getfield        #12  <Field azh a>
	// 5543 10355:astore_1        
		abyte0.cd = ((azh) (abyte0)).aZ ^ a.cd;
	// 5544 10356:aload_1         
	// 5545 10357:aload_1         
	// 5546 10358:getfield        #41  <Field int azh.aZ>
	// 5547 10361:aload_0         
	// 5548 10362:getfield        #12  <Field azh a>
	// 5549 10365:getfield        #59  <Field int azh.cd>
	// 5550 10368:ixor            
	// 5551 10369:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 5552 10372:aload_0         
	// 5553 10373:getfield        #12  <Field azh a>
	// 5554 10376:astore_1        
		abyte0.aZ = ((azh) (abyte0)).ci ^ a.y;
	// 5555 10377:aload_1         
	// 5556 10378:aload_1         
	// 5557 10379:getfield        #71  <Field int azh.ci>
	// 5558 10382:aload_0         
	// 5559 10383:getfield        #12  <Field azh a>
	// 5560 10386:getfield        #423 <Field int azh.y>
	// 5561 10389:ixor            
	// 5562 10390:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 5563 10393:aload_0         
	// 5564 10394:getfield        #12  <Field azh a>
	// 5565 10397:astore_1        
		abyte0.bM = ((azh) (abyte0)).y & ~a.bq;
	// 5566 10398:aload_1         
	// 5567 10399:aload_1         
	// 5568 10400:getfield        #423 <Field int azh.y>
	// 5569 10403:aload_0         
	// 5570 10404:getfield        #12  <Field azh a>
	// 5571 10407:getfield        #270 <Field int azh.bq>
	// 5572 10410:iconst_m1       
	// 5573 10411:ixor            
	// 5574 10412:iand            
	// 5575 10413:putfield        #351 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 5576 10416:aload_0         
	// 5577 10417:getfield        #12  <Field azh a>
	// 5578 10420:astore_1        
		abyte0.bM = ((azh) (abyte0)).bU ^ a.bM;
	// 5579 10421:aload_1         
	// 5580 10422:aload_1         
	// 5581 10423:getfield        #216 <Field int azh.bU>
	// 5582 10426:aload_0         
	// 5583 10427:getfield        #12  <Field azh a>
	// 5584 10430:getfield        #351 <Field int azh.bM>
	// 5585 10433:ixor            
	// 5586 10434:putfield        #351 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 5587 10437:aload_0         
	// 5588 10438:getfield        #12  <Field azh a>
	// 5589 10441:astore_1        
		abyte0.bl = ((azh) (abyte0)).y & a.bU;
	// 5590 10442:aload_1         
	// 5591 10443:aload_1         
	// 5592 10444:getfield        #423 <Field int azh.y>
	// 5593 10447:aload_0         
	// 5594 10448:getfield        #12  <Field azh a>
	// 5595 10451:getfield        #216 <Field int azh.bU>
	// 5596 10454:iand            
	// 5597 10455:putfield        #366 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 5598 10458:aload_0         
	// 5599 10459:getfield        #12  <Field azh a>
	// 5600 10462:astore_1        
		abyte0.cb = ((azh) (abyte0)).bl ^ a.cb;
	// 5601 10463:aload_1         
	// 5602 10464:aload_1         
	// 5603 10465:getfield        #366 <Field int azh.bl>
	// 5604 10468:aload_0         
	// 5605 10469:getfield        #12  <Field azh a>
	// 5606 10472:getfield        #240 <Field int azh.cb>
	// 5607 10475:ixor            
	// 5608 10476:putfield        #240 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 5609 10479:aload_0         
	// 5610 10480:getfield        #12  <Field azh a>
	// 5611 10483:astore_1        
		abyte0.bl = ((azh) (abyte0)).y & ~a.bF;
	// 5612 10484:aload_1         
	// 5613 10485:aload_1         
	// 5614 10486:getfield        #423 <Field int azh.y>
	// 5615 10489:aload_0         
	// 5616 10490:getfield        #12  <Field azh a>
	// 5617 10493:getfield        #255 <Field int azh.bF>
	// 5618 10496:iconst_m1       
	// 5619 10497:ixor            
	// 5620 10498:iand            
	// 5621 10499:putfield        #366 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 5622 10502:aload_0         
	// 5623 10503:getfield        #12  <Field azh a>
	// 5624 10506:astore_1        
		abyte0.bK = ((azh) (abyte0)).y ^ a.bK;
	// 5625 10507:aload_1         
	// 5626 10508:aload_1         
	// 5627 10509:getfield        #423 <Field int azh.y>
	// 5628 10512:aload_0         
	// 5629 10513:getfield        #12  <Field azh a>
	// 5630 10516:getfield        #56  <Field int azh.bK>
	// 5631 10519:ixor            
	// 5632 10520:putfield        #56  <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 5633 10523:aload_0         
	// 5634 10524:getfield        #12  <Field azh a>
	// 5635 10527:astore_1        
		abyte0.bw = ((azh) (abyte0)).bT & ~a.bK;
	// 5636 10528:aload_1         
	// 5637 10529:aload_1         
	// 5638 10530:getfield        #35  <Field int azh.bT>
	// 5639 10533:aload_0         
	// 5640 10534:getfield        #12  <Field azh a>
	// 5641 10537:getfield        #56  <Field int azh.bK>
	// 5642 10540:iconst_m1       
	// 5643 10541:ixor            
	// 5644 10542:iand            
	// 5645 10543:putfield        #399 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 5646 10546:aload_0         
	// 5647 10547:getfield        #12  <Field azh a>
	// 5648 10550:astore_1        
		abyte0.bw = ((azh) (abyte0)).bd ^ a.bw;
	// 5649 10551:aload_1         
	// 5650 10552:aload_1         
	// 5651 10553:getfield        #303 <Field int azh.bd>
	// 5652 10556:aload_0         
	// 5653 10557:getfield        #12  <Field azh a>
	// 5654 10560:getfield        #399 <Field int azh.bw>
	// 5655 10563:ixor            
	// 5656 10564:putfield        #399 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 5657 10567:aload_0         
	// 5658 10568:getfield        #12  <Field azh a>
	// 5659 10571:astore_1        
		abyte0.aR = ((azh) (abyte0)).bw ^ a.aR;
	// 5660 10572:aload_1         
	// 5661 10573:aload_1         
	// 5662 10574:getfield        #399 <Field int azh.bw>
	// 5663 10577:aload_0         
	// 5664 10578:getfield        #12  <Field azh a>
	// 5665 10581:getfield        #369 <Field int azh.aR>
	// 5666 10584:ixor            
	// 5667 10585:putfield        #369 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 5668 10588:aload_0         
	// 5669 10589:getfield        #12  <Field azh a>
	// 5670 10592:astore_1        
		abyte0.bw = ((azh) (abyte0)).y & ~a.ci;
	// 5671 10593:aload_1         
	// 5672 10594:aload_1         
	// 5673 10595:getfield        #423 <Field int azh.y>
	// 5674 10598:aload_0         
	// 5675 10599:getfield        #12  <Field azh a>
	// 5676 10602:getfield        #71  <Field int azh.ci>
	// 5677 10605:iconst_m1       
	// 5678 10606:ixor            
	// 5679 10607:iand            
	// 5680 10608:putfield        #399 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 5681 10611:aload_0         
	// 5682 10612:getfield        #12  <Field azh a>
	// 5683 10615:astore_1        
		abyte0.bw = ((azh) (abyte0)).ci ^ a.bw;
	// 5684 10616:aload_1         
	// 5685 10617:aload_1         
	// 5686 10618:getfield        #71  <Field int azh.ci>
	// 5687 10621:aload_0         
	// 5688 10622:getfield        #12  <Field azh a>
	// 5689 10625:getfield        #399 <Field int azh.bw>
	// 5690 10628:ixor            
	// 5691 10629:putfield        #399 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 5692 10632:aload_0         
	// 5693 10633:getfield        #12  <Field azh a>
	// 5694 10636:astore_1        
		abyte0.bj = ((azh) (abyte0)).y & ~a.bj;
	// 5695 10637:aload_1         
	// 5696 10638:aload_1         
	// 5697 10639:getfield        #423 <Field int azh.y>
	// 5698 10642:aload_0         
	// 5699 10643:getfield        #12  <Field azh a>
	// 5700 10646:getfield        #297 <Field int azh.bj>
	// 5701 10649:iconst_m1       
	// 5702 10650:ixor            
	// 5703 10651:iand            
	// 5704 10652:putfield        #297 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 5705 10655:aload_0         
	// 5706 10656:getfield        #12  <Field azh a>
	// 5707 10659:astore_1        
		abyte0.bj = ((azh) (abyte0)).bq ^ a.bj;
	// 5708 10660:aload_1         
	// 5709 10661:aload_1         
	// 5710 10662:getfield        #270 <Field int azh.bq>
	// 5711 10665:aload_0         
	// 5712 10666:getfield        #12  <Field azh a>
	// 5713 10669:getfield        #297 <Field int azh.bj>
	// 5714 10672:ixor            
	// 5715 10673:putfield        #297 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 5716 10676:aload_0         
	// 5717 10677:getfield        #12  <Field azh a>
	// 5718 10680:astore_1        
		abyte0.bd = ((azh) (abyte0)).y & ~a.c;
	// 5719 10681:aload_1         
	// 5720 10682:aload_1         
	// 5721 10683:getfield        #423 <Field int azh.y>
	// 5722 10686:aload_0         
	// 5723 10687:getfield        #12  <Field azh a>
	// 5724 10690:getfield        #100 <Field int azh.c>
	// 5725 10693:iconst_m1       
	// 5726 10694:ixor            
	// 5727 10695:iand            
	// 5728 10696:putfield        #303 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 5729 10699:aload_0         
	// 5730 10700:getfield        #12  <Field azh a>
	// 5731 10703:astore_1        
		abyte0.cg = ((azh) (abyte0)).y & ~a.bd;
	// 5732 10704:aload_1         
	// 5733 10705:aload_1         
	// 5734 10706:getfield        #423 <Field int azh.y>
	// 5735 10709:aload_0         
	// 5736 10710:getfield        #12  <Field azh a>
	// 5737 10713:getfield        #303 <Field int azh.bd>
	// 5738 10716:iconst_m1       
	// 5739 10717:ixor            
	// 5740 10718:iand            
	// 5741 10719:putfield        #381 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 5742 10722:aload_0         
	// 5743 10723:getfield        #12  <Field azh a>
	// 5744 10726:astore_1        
		abyte0.bG = ((azh) (abyte0)).bF | a.cg;
	// 5745 10727:aload_1         
	// 5746 10728:aload_1         
	// 5747 10729:getfield        #255 <Field int azh.bF>
	// 5748 10732:aload_0         
	// 5749 10733:getfield        #12  <Field azh a>
	// 5750 10736:getfield        #381 <Field int azh.cg>
	// 5751 10739:ior             
	// 5752 10740:putfield        #330 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 5753 10743:aload_0         
	// 5754 10744:getfield        #12  <Field azh a>
	// 5755 10747:astore_1        
		abyte0.bG = ((azh) (abyte0)).bv ^ a.bG;
	// 5756 10748:aload_1         
	// 5757 10749:aload_1         
	// 5758 10750:getfield        #411 <Field int azh.bv>
	// 5759 10753:aload_0         
	// 5760 10754:getfield        #12  <Field azh a>
	// 5761 10757:getfield        #330 <Field int azh.bG>
	// 5762 10760:ixor            
	// 5763 10761:putfield        #330 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 5764 10764:aload_0         
	// 5765 10765:getfield        #12  <Field azh a>
	// 5766 10768:astore_1        
		abyte0.bG = ((azh) (abyte0)).bG & ~a.bT;
	// 5767 10769:aload_1         
	// 5768 10770:aload_1         
	// 5769 10771:getfield        #330 <Field int azh.bG>
	// 5770 10774:aload_0         
	// 5771 10775:getfield        #12  <Field azh a>
	// 5772 10778:getfield        #35  <Field int azh.bT>
	// 5773 10781:iconst_m1       
	// 5774 10782:ixor            
	// 5775 10783:iand            
	// 5776 10784:putfield        #330 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 5777 10787:aload_0         
	// 5778 10788:getfield        #12  <Field azh a>
	// 5779 10791:astore_1        
		abyte0.bG = ((azh) (abyte0)).bK ^ a.bG;
	// 5780 10792:aload_1         
	// 5781 10793:aload_1         
	// 5782 10794:getfield        #56  <Field int azh.bK>
	// 5783 10797:aload_0         
	// 5784 10798:getfield        #12  <Field azh a>
	// 5785 10801:getfield        #330 <Field int azh.bG>
	// 5786 10804:ixor            
	// 5787 10805:putfield        #330 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 5788 10808:aload_0         
	// 5789 10809:getfield        #12  <Field azh a>
	// 5790 10812:astore_1        
		abyte0.cc = ((azh) (abyte0)).bG ^ a.cc;
	// 5791 10813:aload_1         
	// 5792 10814:aload_1         
	// 5793 10815:getfield        #330 <Field int azh.bG>
	// 5794 10818:aload_0         
	// 5795 10819:getfield        #12  <Field azh a>
	// 5796 10822:getfield        #252 <Field int azh.cc>
	// 5797 10825:ixor            
	// 5798 10826:putfield        #252 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 5799 10829:aload_0         
	// 5800 10830:getfield        #12  <Field azh a>
	// 5801 10833:astore_1        
		abyte0.bm = ((azh) (abyte0)).cg ^ a.bm;
	// 5802 10834:aload_1         
	// 5803 10835:aload_1         
	// 5804 10836:getfield        #381 <Field int azh.cg>
	// 5805 10839:aload_0         
	// 5806 10840:getfield        #12  <Field azh a>
	// 5807 10843:getfield        #390 <Field int azh.bm>
	// 5808 10846:ixor            
	// 5809 10847:putfield        #390 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 5810 10850:aload_0         
	// 5811 10851:getfield        #12  <Field azh a>
	// 5812 10854:astore_1        
		abyte0.bl = ((azh) (abyte0)).cg ^ a.bl;
	// 5813 10855:aload_1         
	// 5814 10856:aload_1         
	// 5815 10857:getfield        #381 <Field int azh.cg>
	// 5816 10860:aload_0         
	// 5817 10861:getfield        #12  <Field azh a>
	// 5818 10864:getfield        #366 <Field int azh.bl>
	// 5819 10867:ixor            
	// 5820 10868:putfield        #366 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 5821 10871:aload_0         
	// 5822 10872:getfield        #12  <Field azh a>
	// 5823 10875:astore_1        
		abyte0.cg = ((azh) (abyte0)).bd & ~a.bF;
	// 5824 10876:aload_1         
	// 5825 10877:aload_1         
	// 5826 10878:getfield        #303 <Field int azh.bd>
	// 5827 10881:aload_0         
	// 5828 10882:getfield        #12  <Field azh a>
	// 5829 10885:getfield        #255 <Field int azh.bF>
	// 5830 10888:iconst_m1       
	// 5831 10889:ixor            
	// 5832 10890:iand            
	// 5833 10891:putfield        #381 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 5834 10894:aload_0         
	// 5835 10895:getfield        #12  <Field azh a>
	// 5836 10898:astore_1        
		abyte0.cg = ((azh) (abyte0)).bd ^ a.cg;
	// 5837 10899:aload_1         
	// 5838 10900:aload_1         
	// 5839 10901:getfield        #303 <Field int azh.bd>
	// 5840 10904:aload_0         
	// 5841 10905:getfield        #12  <Field azh a>
	// 5842 10908:getfield        #381 <Field int azh.cg>
	// 5843 10911:ixor            
	// 5844 10912:putfield        #381 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 5845 10915:aload_0         
	// 5846 10916:getfield        #12  <Field azh a>
	// 5847 10919:astore_1        
		abyte0.bG = ((azh) (abyte0)).G & ~a.cg;
	// 5848 10920:aload_1         
	// 5849 10921:aload_1         
	// 5850 10922:getfield        #348 <Field int azh.G>
	// 5851 10925:aload_0         
	// 5852 10926:getfield        #12  <Field azh a>
	// 5853 10929:getfield        #381 <Field int azh.cg>
	// 5854 10932:iconst_m1       
	// 5855 10933:ixor            
	// 5856 10934:iand            
	// 5857 10935:putfield        #330 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 5858 10938:aload_0         
	// 5859 10939:getfield        #12  <Field azh a>
	// 5860 10942:astore_1        
		abyte0.bK = ((azh) (abyte0)).bF | a.bd;
	// 5861 10943:aload_1         
	// 5862 10944:aload_1         
	// 5863 10945:getfield        #255 <Field int azh.bF>
	// 5864 10948:aload_0         
	// 5865 10949:getfield        #12  <Field azh a>
	// 5866 10952:getfield        #303 <Field int azh.bd>
	// 5867 10955:ior             
	// 5868 10956:putfield        #56  <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 5869 10959:aload_0         
	// 5870 10960:getfield        #12  <Field azh a>
	// 5871 10963:astore_1        
		abyte0.bK = ((azh) (abyte0)).bd ^ a.bK;
	// 5872 10964:aload_1         
	// 5873 10965:aload_1         
	// 5874 10966:getfield        #303 <Field int azh.bd>
	// 5875 10969:aload_0         
	// 5876 10970:getfield        #12  <Field azh a>
	// 5877 10973:getfield        #56  <Field int azh.bK>
	// 5878 10976:ixor            
	// 5879 10977:putfield        #56  <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 5880 10980:aload_0         
	// 5881 10981:getfield        #12  <Field azh a>
	// 5882 10984:astore_1        
		abyte0.bK = ((azh) (abyte0)).bT & ~a.bK;
	// 5883 10985:aload_1         
	// 5884 10986:aload_1         
	// 5885 10987:getfield        #35  <Field int azh.bT>
	// 5886 10990:aload_0         
	// 5887 10991:getfield        #12  <Field azh a>
	// 5888 10994:getfield        #56  <Field int azh.bK>
	// 5889 10997:iconst_m1       
	// 5890 10998:ixor            
	// 5891 10999:iand            
	// 5892 11000:putfield        #56  <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 5893 11003:aload_0         
	// 5894 11004:getfield        #12  <Field azh a>
	// 5895 11007:astore_1        
		abyte0.bK = ((azh) (abyte0)).bv ^ a.bK;
	// 5896 11008:aload_1         
	// 5897 11009:aload_1         
	// 5898 11010:getfield        #411 <Field int azh.bv>
	// 5899 11013:aload_0         
	// 5900 11014:getfield        #12  <Field azh a>
	// 5901 11017:getfield        #56  <Field int azh.bK>
	// 5902 11020:ixor            
	// 5903 11021:putfield        #56  <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 5904 11024:aload_0         
	// 5905 11025:getfield        #12  <Field azh a>
	// 5906 11028:astore_1        
		abyte0.bG = ((azh) (abyte0)).bK ^ a.bG;
	// 5907 11029:aload_1         
	// 5908 11030:aload_1         
	// 5909 11031:getfield        #56  <Field int azh.bK>
	// 5910 11034:aload_0         
	// 5911 11035:getfield        #12  <Field azh a>
	// 5912 11038:getfield        #330 <Field int azh.bG>
	// 5913 11041:ixor            
	// 5914 11042:putfield        #330 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 5915 11045:aload_0         
	// 5916 11046:getfield        #12  <Field azh a>
	// 5917 11049:astore_1        
		abyte0.bK = ((azh) (abyte0)).bT | a.bd;
	// 5918 11050:aload_1         
	// 5919 11051:aload_1         
	// 5920 11052:getfield        #35  <Field int azh.bT>
	// 5921 11055:aload_0         
	// 5922 11056:getfield        #12  <Field azh a>
	// 5923 11059:getfield        #303 <Field int azh.bd>
	// 5924 11062:ior             
	// 5925 11063:putfield        #56  <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 5926 11066:aload_0         
	// 5927 11067:getfield        #12  <Field azh a>
	// 5928 11070:astore_1        
		abyte0.bK = ((azh) (abyte0)).bl ^ a.bK;
	// 5929 11071:aload_1         
	// 5930 11072:aload_1         
	// 5931 11073:getfield        #366 <Field int azh.bl>
	// 5932 11076:aload_0         
	// 5933 11077:getfield        #12  <Field azh a>
	// 5934 11080:getfield        #56  <Field int azh.bK>
	// 5935 11083:ixor            
	// 5936 11084:putfield        #56  <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 5937 11087:aload_0         
	// 5938 11088:getfield        #12  <Field azh a>
	// 5939 11091:astore_1        
		abyte0.bK = ((azh) (abyte0)).G & a.bK;
	// 5940 11092:aload_1         
	// 5941 11093:aload_1         
	// 5942 11094:getfield        #348 <Field int azh.G>
	// 5943 11097:aload_0         
	// 5944 11098:getfield        #12  <Field azh a>
	// 5945 11101:getfield        #56  <Field int azh.bK>
	// 5946 11104:iand            
	// 5947 11105:putfield        #56  <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 5948 11108:aload_0         
	// 5949 11109:getfield        #12  <Field azh a>
	// 5950 11112:astore_1        
		abyte0.bK = ((azh) (abyte0)).cg ^ a.bK;
	// 5951 11113:aload_1         
	// 5952 11114:aload_1         
	// 5953 11115:getfield        #381 <Field int azh.cg>
	// 5954 11118:aload_0         
	// 5955 11119:getfield        #12  <Field azh a>
	// 5956 11122:getfield        #56  <Field int azh.bK>
	// 5957 11125:ixor            
	// 5958 11126:putfield        #56  <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 5959 11129:aload_0         
	// 5960 11130:getfield        #12  <Field azh a>
	// 5961 11133:astore_1        
		abyte0.bd = ((azh) (abyte0)).bF | a.bd;
	// 5962 11134:aload_1         
	// 5963 11135:aload_1         
	// 5964 11136:getfield        #255 <Field int azh.bF>
	// 5965 11139:aload_0         
	// 5966 11140:getfield        #12  <Field azh a>
	// 5967 11143:getfield        #303 <Field int azh.bd>
	// 5968 11146:ior             
	// 5969 11147:putfield        #303 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 5970 11150:aload_0         
	// 5971 11151:getfield        #12  <Field azh a>
	// 5972 11154:astore_1        
		abyte0.bd = ((azh) (abyte0)).aN ^ a.bd;
	// 5973 11155:aload_1         
	// 5974 11156:aload_1         
	// 5975 11157:getfield        #384 <Field int azh.aN>
	// 5976 11160:aload_0         
	// 5977 11161:getfield        #12  <Field azh a>
	// 5978 11164:getfield        #303 <Field int azh.bd>
	// 5979 11167:ixor            
	// 5980 11168:putfield        #303 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 5981 11171:aload_0         
	// 5982 11172:getfield        #12  <Field azh a>
	// 5983 11175:astore_1        
		abyte0.bd = ((azh) (abyte0)).bT | a.bd;
	// 5984 11176:aload_1         
	// 5985 11177:aload_1         
	// 5986 11178:getfield        #35  <Field int azh.bT>
	// 5987 11181:aload_0         
	// 5988 11182:getfield        #12  <Field azh a>
	// 5989 11185:getfield        #303 <Field int azh.bd>
	// 5990 11188:ior             
	// 5991 11189:putfield        #303 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 5992 11192:aload_0         
	// 5993 11193:getfield        #12  <Field azh a>
	// 5994 11196:astore_1        
		abyte0.bd = ((azh) (abyte0)).bm ^ a.bd;
	// 5995 11197:aload_1         
	// 5996 11198:aload_1         
	// 5997 11199:getfield        #390 <Field int azh.bm>
	// 5998 11202:aload_0         
	// 5999 11203:getfield        #12  <Field azh a>
	// 6000 11206:getfield        #303 <Field int azh.bd>
	// 6001 11209:ixor            
	// 6002 11210:putfield        #303 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 6003 11213:aload_0         
	// 6004 11214:getfield        #12  <Field azh a>
	// 6005 11217:astore_1        
		abyte0.bd = ((azh) (abyte0)).bd ^ a.G;
	// 6006 11218:aload_1         
	// 6007 11219:aload_1         
	// 6008 11220:getfield        #303 <Field int azh.bd>
	// 6009 11223:aload_0         
	// 6010 11224:getfield        #12  <Field azh a>
	// 6011 11227:getfield        #348 <Field int azh.G>
	// 6012 11230:ixor            
	// 6013 11231:putfield        #303 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 6014 11234:aload_0         
	// 6015 11235:getfield        #12  <Field azh a>
	// 6016 11238:astore_1        
		abyte0.bm = ((azh) (abyte0)).y & ~a.ay;
	// 6017 11239:aload_1         
	// 6018 11240:aload_1         
	// 6019 11241:getfield        #423 <Field int azh.y>
	// 6020 11244:aload_0         
	// 6021 11245:getfield        #12  <Field azh a>
	// 6022 11248:getfield        #345 <Field int azh.ay>
	// 6023 11251:iconst_m1       
	// 6024 11252:ixor            
	// 6025 11253:iand            
	// 6026 11254:putfield        #390 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 6027 11257:aload_0         
	// 6028 11258:getfield        #12  <Field azh a>
	// 6029 11261:astore_1        
		abyte0.bm = ((azh) (abyte0)).aB ^ a.bm;
	// 6030 11262:aload_1         
	// 6031 11263:aload_1         
	// 6032 11264:getfield        #339 <Field int azh.aB>
	// 6033 11267:aload_0         
	// 6034 11268:getfield        #12  <Field azh a>
	// 6035 11271:getfield        #390 <Field int azh.bm>
	// 6036 11274:ixor            
	// 6037 11275:putfield        #390 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 6038 11278:aload_0         
	// 6039 11279:getfield        #12  <Field azh a>
	// 6040 11282:astore_1        
		abyte0.aN = ((azh) (abyte0)).a | a.bm;
	// 6041 11283:aload_1         
	// 6042 11284:aload_1         
	// 6043 11285:getfield        #183 <Field int azh.a>
	// 6044 11288:aload_0         
	// 6045 11289:getfield        #12  <Field azh a>
	// 6046 11292:getfield        #390 <Field int azh.bm>
	// 6047 11295:ior             
	// 6048 11296:putfield        #384 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 6049 11299:aload_0         
	// 6050 11300:getfield        #12  <Field azh a>
	// 6051 11303:astore_1        
		abyte0.aN = ((azh) (abyte0)).bj ^ a.aN;
	// 6052 11304:aload_1         
	// 6053 11305:aload_1         
	// 6054 11306:getfield        #297 <Field int azh.bj>
	// 6055 11309:aload_0         
	// 6056 11310:getfield        #12  <Field azh a>
	// 6057 11313:getfield        #384 <Field int azh.aN>
	// 6058 11316:ixor            
	// 6059 11317:putfield        #384 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 6060 11320:aload_0         
	// 6061 11321:getfield        #12  <Field azh a>
	// 6062 11324:astore_1        
		abyte0.bm = ((azh) (abyte0)).a | a.bm;
	// 6063 11325:aload_1         
	// 6064 11326:aload_1         
	// 6065 11327:getfield        #183 <Field int azh.a>
	// 6066 11330:aload_0         
	// 6067 11331:getfield        #12  <Field azh a>
	// 6068 11334:getfield        #390 <Field int azh.bm>
	// 6069 11337:ior             
	// 6070 11338:putfield        #390 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 6071 11341:aload_0         
	// 6072 11342:getfield        #12  <Field azh a>
	// 6073 11345:astore_1        
		abyte0.bm = ((azh) (abyte0)).ay ^ a.bm;
	// 6074 11346:aload_1         
	// 6075 11347:aload_1         
	// 6076 11348:getfield        #345 <Field int azh.ay>
	// 6077 11351:aload_0         
	// 6078 11352:getfield        #12  <Field azh a>
	// 6079 11355:getfield        #390 <Field int azh.bm>
	// 6080 11358:ixor            
	// 6081 11359:putfield        #390 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 6082 11362:aload_0         
	// 6083 11363:getfield        #12  <Field azh a>
	// 6084 11366:astore_1        
		abyte0.bj = ((azh) (abyte0)).y & ~a.G;
	// 6085 11367:aload_1         
	// 6086 11368:aload_1         
	// 6087 11369:getfield        #423 <Field int azh.y>
	// 6088 11372:aload_0         
	// 6089 11373:getfield        #12  <Field azh a>
	// 6090 11376:getfield        #348 <Field int azh.G>
	// 6091 11379:iconst_m1       
	// 6092 11380:ixor            
	// 6093 11381:iand            
	// 6094 11382:putfield        #297 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 6095 11385:aload_0         
	// 6096 11386:getfield        #12  <Field azh a>
	// 6097 11389:astore_1        
		abyte0.bj = ((azh) (abyte0)).bq ^ a.bj;
	// 6098 11390:aload_1         
	// 6099 11391:aload_1         
	// 6100 11392:getfield        #270 <Field int azh.bq>
	// 6101 11395:aload_0         
	// 6102 11396:getfield        #12  <Field azh a>
	// 6103 11399:getfield        #297 <Field int azh.bj>
	// 6104 11402:ixor            
	// 6105 11403:putfield        #297 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 6106 11406:aload_0         
	// 6107 11407:getfield        #12  <Field azh a>
	// 6108 11410:astore_1        
		abyte0.bj = ((azh) (abyte0)).a | a.bj;
	// 6109 11411:aload_1         
	// 6110 11412:aload_1         
	// 6111 11413:getfield        #183 <Field int azh.a>
	// 6112 11416:aload_0         
	// 6113 11417:getfield        #12  <Field azh a>
	// 6114 11420:getfield        #297 <Field int azh.bj>
	// 6115 11423:ior             
	// 6116 11424:putfield        #297 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 6117 11427:aload_0         
	// 6118 11428:getfield        #12  <Field azh a>
	// 6119 11431:astore_1        
		abyte0.bj = ((azh) (abyte0)).bM ^ a.bj;
	// 6120 11432:aload_1         
	// 6121 11433:aload_1         
	// 6122 11434:getfield        #351 <Field int azh.bM>
	// 6123 11437:aload_0         
	// 6124 11438:getfield        #12  <Field azh a>
	// 6125 11441:getfield        #297 <Field int azh.bj>
	// 6126 11444:ixor            
	// 6127 11445:putfield        #297 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 6128 11448:aload_0         
	// 6129 11449:getfield        #12  <Field azh a>
	// 6130 11452:astore_1        
		abyte0.aB = ((azh) (abyte0)).y & ~a.aB;
	// 6131 11453:aload_1         
	// 6132 11454:aload_1         
	// 6133 11455:getfield        #423 <Field int azh.y>
	// 6134 11458:aload_0         
	// 6135 11459:getfield        #12  <Field azh a>
	// 6136 11462:getfield        #339 <Field int azh.aB>
	// 6137 11465:iconst_m1       
	// 6138 11466:ixor            
	// 6139 11467:iand            
	// 6140 11468:putfield        #339 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 6141 11471:aload_0         
	// 6142 11472:getfield        #12  <Field azh a>
	// 6143 11475:astore_1        
		abyte0.aB = ((azh) (abyte0)).ci ^ a.aB;
	// 6144 11476:aload_1         
	// 6145 11477:aload_1         
	// 6146 11478:getfield        #71  <Field int azh.ci>
	// 6147 11481:aload_0         
	// 6148 11482:getfield        #12  <Field azh a>
	// 6149 11485:getfield        #339 <Field int azh.aB>
	// 6150 11488:ixor            
	// 6151 11489:putfield        #339 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 6152 11492:aload_0         
	// 6153 11493:getfield        #12  <Field azh a>
	// 6154 11496:astore_1        
		abyte0.aB = ((azh) (abyte0)).a | a.aB;
	// 6155 11497:aload_1         
	// 6156 11498:aload_1         
	// 6157 11499:getfield        #183 <Field int azh.a>
	// 6158 11502:aload_0         
	// 6159 11503:getfield        #12  <Field azh a>
	// 6160 11506:getfield        #339 <Field int azh.aB>
	// 6161 11509:ior             
	// 6162 11510:putfield        #339 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 6163 11513:aload_0         
	// 6164 11514:getfield        #12  <Field azh a>
	// 6165 11517:astore_1        
		abyte0.aB = ((azh) (abyte0)).cf ^ a.aB;
	// 6166 11518:aload_1         
	// 6167 11519:aload_1         
	// 6168 11520:getfield        #405 <Field int azh.cf>
	// 6169 11523:aload_0         
	// 6170 11524:getfield        #12  <Field azh a>
	// 6171 11527:getfield        #339 <Field int azh.aB>
	// 6172 11530:ixor            
	// 6173 11531:putfield        #339 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 6174 11534:aload_0         
	// 6175 11535:getfield        #12  <Field azh a>
	// 6176 11538:astore_1        
		abyte0.cf = ((azh) (abyte0)).y & ~a.G;
	// 6177 11539:aload_1         
	// 6178 11540:aload_1         
	// 6179 11541:getfield        #423 <Field int azh.y>
	// 6180 11544:aload_0         
	// 6181 11545:getfield        #12  <Field azh a>
	// 6182 11548:getfield        #348 <Field int azh.G>
	// 6183 11551:iconst_m1       
	// 6184 11552:ixor            
	// 6185 11553:iand            
	// 6186 11554:putfield        #405 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 6187 11557:aload_0         
	// 6188 11558:getfield        #12  <Field azh a>
	// 6189 11561:astore_1        
		abyte0.cf = ((azh) (abyte0)).G ^ a.cf;
	// 6190 11562:aload_1         
	// 6191 11563:aload_1         
	// 6192 11564:getfield        #348 <Field int azh.G>
	// 6193 11567:aload_0         
	// 6194 11568:getfield        #12  <Field azh a>
	// 6195 11571:getfield        #405 <Field int azh.cf>
	// 6196 11574:ixor            
	// 6197 11575:putfield        #405 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 6198 11578:aload_0         
	// 6199 11579:getfield        #12  <Field azh a>
	// 6200 11582:astore_1        
		abyte0.ci = ((azh) (abyte0)).cf & ~a.a;
	// 6201 11583:aload_1         
	// 6202 11584:aload_1         
	// 6203 11585:getfield        #405 <Field int azh.cf>
	// 6204 11588:aload_0         
	// 6205 11589:getfield        #12  <Field azh a>
	// 6206 11592:getfield        #183 <Field int azh.a>
	// 6207 11595:iconst_m1       
	// 6208 11596:ixor            
	// 6209 11597:iand            
	// 6210 11598:putfield        #71  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 6211 11601:aload_0         
	// 6212 11602:getfield        #12  <Field azh a>
	// 6213 11605:astore_1        
		abyte0.ci = ((azh) (abyte0)).y ^ a.ci;
	// 6214 11606:aload_1         
	// 6215 11607:aload_1         
	// 6216 11608:getfield        #423 <Field int azh.y>
	// 6217 11611:aload_0         
	// 6218 11612:getfield        #12  <Field azh a>
	// 6219 11615:getfield        #71  <Field int azh.ci>
	// 6220 11618:ixor            
	// 6221 11619:putfield        #71  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 6222 11622:aload_0         
	// 6223 11623:getfield        #12  <Field azh a>
	// 6224 11626:astore_1        
		abyte0.cf = ((azh) (abyte0)).a | a.cf;
	// 6225 11627:aload_1         
	// 6226 11628:aload_1         
	// 6227 11629:getfield        #183 <Field int azh.a>
	// 6228 11632:aload_0         
	// 6229 11633:getfield        #12  <Field azh a>
	// 6230 11636:getfield        #405 <Field int azh.cf>
	// 6231 11639:ior             
	// 6232 11640:putfield        #405 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 6233 11643:aload_0         
	// 6234 11644:getfield        #12  <Field azh a>
	// 6235 11647:astore_1        
		abyte0.ay = ((azh) (abyte0)).y & a.ay;
	// 6236 11648:aload_1         
	// 6237 11649:aload_1         
	// 6238 11650:getfield        #423 <Field int azh.y>
	// 6239 11653:aload_0         
	// 6240 11654:getfield        #12  <Field azh a>
	// 6241 11657:getfield        #345 <Field int azh.ay>
	// 6242 11660:iand            
	// 6243 11661:putfield        #345 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 6244 11664:aload_0         
	// 6245 11665:getfield        #12  <Field azh a>
	// 6246 11668:astore_1        
		abyte0.ay = ((azh) (abyte0)).G ^ a.ay;
	// 6247 11669:aload_1         
	// 6248 11670:aload_1         
	// 6249 11671:getfield        #348 <Field int azh.G>
	// 6250 11674:aload_0         
	// 6251 11675:getfield        #12  <Field azh a>
	// 6252 11678:getfield        #345 <Field int azh.ay>
	// 6253 11681:ixor            
	// 6254 11682:putfield        #345 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 6255 11685:aload_0         
	// 6256 11686:getfield        #12  <Field azh a>
	// 6257 11689:astore_1        
		abyte0.cf = ((azh) (abyte0)).ay ^ a.cf;
	// 6258 11690:aload_1         
	// 6259 11691:aload_1         
	// 6260 11692:getfield        #345 <Field int azh.ay>
	// 6261 11695:aload_0         
	// 6262 11696:getfield        #12  <Field azh a>
	// 6263 11699:getfield        #405 <Field int azh.cf>
	// 6264 11702:ixor            
	// 6265 11703:putfield        #405 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 6266 11706:aload_0         
	// 6267 11707:getfield        #12  <Field azh a>
	// 6268 11710:astore_1        
		abyte0.bM = ((azh) (abyte0)).a | a.ay;
	// 6269 11711:aload_1         
	// 6270 11712:aload_1         
	// 6271 11713:getfield        #183 <Field int azh.a>
	// 6272 11716:aload_0         
	// 6273 11717:getfield        #12  <Field azh a>
	// 6274 11720:getfield        #345 <Field int azh.ay>
	// 6275 11723:ior             
	// 6276 11724:putfield        #351 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 6277 11727:aload_0         
	// 6278 11728:getfield        #12  <Field azh a>
	// 6279 11731:astore_1        
		abyte0.bM = ((azh) (abyte0)).aZ ^ a.bM;
	// 6280 11732:aload_1         
	// 6281 11733:aload_1         
	// 6282 11734:getfield        #41  <Field int azh.aZ>
	// 6283 11737:aload_0         
	// 6284 11738:getfield        #12  <Field azh a>
	// 6285 11741:getfield        #351 <Field int azh.bM>
	// 6286 11744:ixor            
	// 6287 11745:putfield        #351 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 6288 11748:aload_0         
	// 6289 11749:getfield        #12  <Field azh a>
	// 6290 11752:astore_1        
		abyte0.bq = ((azh) (abyte0)).y & ~a.G;
	// 6291 11753:aload_1         
	// 6292 11754:aload_1         
	// 6293 11755:getfield        #423 <Field int azh.y>
	// 6294 11758:aload_0         
	// 6295 11759:getfield        #12  <Field azh a>
	// 6296 11762:getfield        #348 <Field int azh.G>
	// 6297 11765:iconst_m1       
	// 6298 11766:ixor            
	// 6299 11767:iand            
	// 6300 11768:putfield        #270 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 6301 11771:aload_0         
	// 6302 11772:getfield        #12  <Field azh a>
	// 6303 11775:astore_1        
		abyte0.bq = ((azh) (abyte0)).a | a.bq;
	// 6304 11776:aload_1         
	// 6305 11777:aload_1         
	// 6306 11778:getfield        #183 <Field int azh.a>
	// 6307 11781:aload_0         
	// 6308 11782:getfield        #12  <Field azh a>
	// 6309 11785:getfield        #270 <Field int azh.bq>
	// 6310 11788:ior             
	// 6311 11789:putfield        #270 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 6312 11792:aload_0         
	// 6313 11793:getfield        #12  <Field azh a>
	// 6314 11796:astore_1        
		abyte0.bq = ((azh) (abyte0)).bw ^ a.bq;
	// 6315 11797:aload_1         
	// 6316 11798:aload_1         
	// 6317 11799:getfield        #399 <Field int azh.bw>
	// 6318 11802:aload_0         
	// 6319 11803:getfield        #12  <Field azh a>
	// 6320 11806:getfield        #270 <Field int azh.bq>
	// 6321 11809:ixor            
	// 6322 11810:putfield        #270 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 6323 11813:aload_0         
	// 6324 11814:getfield        #12  <Field azh a>
	// 6325 11817:astore_1        
		abyte0.bU = ((azh) (abyte0)).y & a.bU;
	// 6326 11818:aload_1         
	// 6327 11819:aload_1         
	// 6328 11820:getfield        #423 <Field int azh.y>
	// 6329 11823:aload_0         
	// 6330 11824:getfield        #12  <Field azh a>
	// 6331 11827:getfield        #216 <Field int azh.bU>
	// 6332 11830:iand            
	// 6333 11831:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 6334 11834:aload_0         
	// 6335 11835:getfield        #12  <Field azh a>
	// 6336 11838:astore_1        
		abyte0.bU = ((azh) (abyte0)).q ^ a.bU;
	// 6337 11839:aload_1         
	// 6338 11840:aload_1         
	// 6339 11841:getfield        #300 <Field int azh.q>
	// 6340 11844:aload_0         
	// 6341 11845:getfield        #12  <Field azh a>
	// 6342 11848:getfield        #216 <Field int azh.bU>
	// 6343 11851:ixor            
	// 6344 11852:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 6345 11855:aload_0         
	// 6346 11856:getfield        #12  <Field azh a>
	// 6347 11859:astore_1        
		abyte0.bU = ((azh) (abyte0)).a & a.bU;
	// 6348 11860:aload_1         
	// 6349 11861:aload_1         
	// 6350 11862:getfield        #183 <Field int azh.a>
	// 6351 11865:aload_0         
	// 6352 11866:getfield        #12  <Field azh a>
	// 6353 11869:getfield        #216 <Field int azh.bU>
	// 6354 11872:iand            
	// 6355 11873:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 6356 11876:aload_0         
	// 6357 11877:getfield        #12  <Field azh a>
	// 6358 11880:astore_1        
		abyte0.bU = ((azh) (abyte0)).aZ ^ a.bU;
	// 6359 11881:aload_1         
	// 6360 11882:aload_1         
	// 6361 11883:getfield        #41  <Field int azh.aZ>
	// 6362 11886:aload_0         
	// 6363 11887:getfield        #12  <Field azh a>
	// 6364 11890:getfield        #216 <Field int azh.bU>
	// 6365 11893:ixor            
	// 6366 11894:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 6367 11897:aload_0         
	// 6368 11898:getfield        #12  <Field azh a>
	// 6369 11901:astore_1        
		abyte0.aJ = ((azh) (abyte0)).ch ^ a.aJ;
	// 6370 11902:aload_1         
	// 6371 11903:aload_1         
	// 6372 11904:getfield        #420 <Field int azh.ch>
	// 6373 11907:aload_0         
	// 6374 11908:getfield        #12  <Field azh a>
	// 6375 11911:getfield        #426 <Field int azh.aJ>
	// 6376 11914:ixor            
	// 6377 11915:putfield        #426 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 6378 11918:aload_0         
	// 6379 11919:getfield        #12  <Field azh a>
	// 6380 11922:astore_1        
		abyte0.aJ = ((azh) (abyte0)).af | a.aJ;
	// 6381 11923:aload_1         
	// 6382 11924:aload_1         
	// 6383 11925:getfield        #136 <Field int azh.af>
	// 6384 11928:aload_0         
	// 6385 11929:getfield        #12  <Field azh a>
	// 6386 11932:getfield        #426 <Field int azh.aJ>
	// 6387 11935:ior             
	// 6388 11936:putfield        #426 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 6389 11939:aload_0         
	// 6390 11940:getfield        #12  <Field azh a>
	// 6391 11943:astore_1        
		abyte0.aJ = ((azh) (abyte0)).be ^ a.aJ;
	// 6392 11944:aload_1         
	// 6393 11945:aload_1         
	// 6394 11946:getfield        #393 <Field int azh.be>
	// 6395 11949:aload_0         
	// 6396 11950:getfield        #12  <Field azh a>
	// 6397 11953:getfield        #426 <Field int azh.aJ>
	// 6398 11956:ixor            
	// 6399 11957:putfield        #426 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 6400 11960:aload_0         
	// 6401 11961:getfield        #12  <Field azh a>
	// 6402 11964:astore_1        
		abyte0.aJ = ((azh) (abyte0)).aJ & a.B;
	// 6403 11965:aload_1         
	// 6404 11966:aload_1         
	// 6405 11967:getfield        #426 <Field int azh.aJ>
	// 6406 11970:aload_0         
	// 6407 11971:getfield        #12  <Field azh a>
	// 6408 11974:getfield        #402 <Field int azh.B>
	// 6409 11977:iand            
	// 6410 11978:putfield        #426 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 6411 11981:aload_0         
	// 6412 11982:getfield        #12  <Field azh a>
	// 6413 11985:astore_1        
		abyte0.aJ = ((azh) (abyte0)).ax ^ a.aJ;
	// 6414 11986:aload_1         
	// 6415 11987:aload_1         
	// 6416 11988:getfield        #408 <Field int azh.ax>
	// 6417 11991:aload_0         
	// 6418 11992:getfield        #12  <Field azh a>
	// 6419 11995:getfield        #426 <Field int azh.aJ>
	// 6420 11998:ixor            
	// 6421 11999:putfield        #426 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 6422 12002:aload_0         
	// 6423 12003:getfield        #12  <Field azh a>
	// 6424 12006:astore_1        
		abyte0.S = ((azh) (abyte0)).aJ ^ a.S;
	// 6425 12007:aload_1         
	// 6426 12008:aload_1         
	// 6427 12009:getfield        #426 <Field int azh.aJ>
	// 6428 12012:aload_0         
	// 6429 12013:getfield        #12  <Field azh a>
	// 6430 12016:getfield        #429 <Field int azh.S>
	// 6431 12019:ixor            
	// 6432 12020:putfield        #429 <Field int azh.S>
		abyte0 = ((byte []) (a));
	// 6433 12023:aload_0         
	// 6434 12024:getfield        #12  <Field azh a>
	// 6435 12027:astore_1        
		abyte0.aJ = ((azh) (abyte0)).S & ~a.g;
	// 6436 12028:aload_1         
	// 6437 12029:aload_1         
	// 6438 12030:getfield        #429 <Field int azh.S>
	// 6439 12033:aload_0         
	// 6440 12034:getfield        #12  <Field azh a>
	// 6441 12037:getfield        #195 <Field int azh.g>
	// 6442 12040:iconst_m1       
	// 6443 12041:ixor            
	// 6444 12042:iand            
	// 6445 12043:putfield        #426 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 6446 12046:aload_0         
	// 6447 12047:getfield        #12  <Field azh a>
	// 6448 12050:astore_1        
		abyte0.ax = ((azh) (abyte0)).g & ~a.S;
	// 6449 12051:aload_1         
	// 6450 12052:aload_1         
	// 6451 12053:getfield        #195 <Field int azh.g>
	// 6452 12056:aload_0         
	// 6453 12057:getfield        #12  <Field azh a>
	// 6454 12060:getfield        #429 <Field int azh.S>
	// 6455 12063:iconst_m1       
	// 6456 12064:ixor            
	// 6457 12065:iand            
	// 6458 12066:putfield        #408 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 6459 12069:aload_0         
	// 6460 12070:getfield        #12  <Field azh a>
	// 6461 12073:astore_1        
		abyte0.be = ((azh) (abyte0)).ax & ~a.C;
	// 6462 12074:aload_1         
	// 6463 12075:aload_1         
	// 6464 12076:getfield        #408 <Field int azh.ax>
	// 6465 12079:aload_0         
	// 6466 12080:getfield        #12  <Field azh a>
	// 6467 12083:getfield        #360 <Field int azh.C>
	// 6468 12086:iconst_m1       
	// 6469 12087:ixor            
	// 6470 12088:iand            
	// 6471 12089:putfield        #393 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 6472 12092:aload_0         
	// 6473 12093:getfield        #12  <Field azh a>
	// 6474 12096:astore_1        
		abyte0.be = ((azh) (abyte0)).ax ^ a.be;
	// 6475 12097:aload_1         
	// 6476 12098:aload_1         
	// 6477 12099:getfield        #408 <Field int azh.ax>
	// 6478 12102:aload_0         
	// 6479 12103:getfield        #12  <Field azh a>
	// 6480 12106:getfield        #393 <Field int azh.be>
	// 6481 12109:ixor            
	// 6482 12110:putfield        #393 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 6483 12113:aload_0         
	// 6484 12114:getfield        #12  <Field azh a>
	// 6485 12117:astore_1        
		abyte0.be = ((azh) (abyte0)).be & ~a.K;
	// 6486 12118:aload_1         
	// 6487 12119:aload_1         
	// 6488 12120:getfield        #393 <Field int azh.be>
	// 6489 12123:aload_0         
	// 6490 12124:getfield        #12  <Field azh a>
	// 6491 12127:getfield        #192 <Field int azh.K>
	// 6492 12130:iconst_m1       
	// 6493 12131:ixor            
	// 6494 12132:iand            
	// 6495 12133:putfield        #393 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 6496 12136:aload_0         
	// 6497 12137:getfield        #12  <Field azh a>
	// 6498 12140:astore_1        
		abyte0.ax = ((azh) (abyte0)).ax & ~a.C;
	// 6499 12141:aload_1         
	// 6500 12142:aload_1         
	// 6501 12143:getfield        #408 <Field int azh.ax>
	// 6502 12146:aload_0         
	// 6503 12147:getfield        #12  <Field azh a>
	// 6504 12150:getfield        #360 <Field int azh.C>
	// 6505 12153:iconst_m1       
	// 6506 12154:ixor            
	// 6507 12155:iand            
	// 6508 12156:putfield        #408 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 6509 12159:aload_0         
	// 6510 12160:getfield        #12  <Field azh a>
	// 6511 12163:astore_1        
		abyte0.ax = ((azh) (abyte0)).aJ ^ a.ax;
	// 6512 12164:aload_1         
	// 6513 12165:aload_1         
	// 6514 12166:getfield        #426 <Field int azh.aJ>
	// 6515 12169:aload_0         
	// 6516 12170:getfield        #12  <Field azh a>
	// 6517 12173:getfield        #408 <Field int azh.ax>
	// 6518 12176:ixor            
	// 6519 12177:putfield        #408 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 6520 12180:aload_0         
	// 6521 12181:getfield        #12  <Field azh a>
	// 6522 12184:astore_1        
		abyte0.ch = ((azh) (abyte0)).ax & ~a.K;
	// 6523 12185:aload_1         
	// 6524 12186:aload_1         
	// 6525 12187:getfield        #408 <Field int azh.ax>
	// 6526 12190:aload_0         
	// 6527 12191:getfield        #12  <Field azh a>
	// 6528 12194:getfield        #192 <Field int azh.K>
	// 6529 12197:iconst_m1       
	// 6530 12198:ixor            
	// 6531 12199:iand            
	// 6532 12200:putfield        #420 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 6533 12203:aload_0         
	// 6534 12204:getfield        #12  <Field azh a>
	// 6535 12207:astore_1        
		abyte0.ax = ((azh) (abyte0)).ax & ~a.K;
	// 6536 12208:aload_1         
	// 6537 12209:aload_1         
	// 6538 12210:getfield        #408 <Field int azh.ax>
	// 6539 12213:aload_0         
	// 6540 12214:getfield        #12  <Field azh a>
	// 6541 12217:getfield        #192 <Field int azh.K>
	// 6542 12220:iconst_m1       
	// 6543 12221:ixor            
	// 6544 12222:iand            
	// 6545 12223:putfield        #408 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 6546 12226:aload_0         
	// 6547 12227:getfield        #12  <Field azh a>
	// 6548 12230:astore_1        
		abyte0.aZ = ((azh) (abyte0)).S ^ a.g;
	// 6549 12231:aload_1         
	// 6550 12232:aload_1         
	// 6551 12233:getfield        #429 <Field int azh.S>
	// 6552 12236:aload_0         
	// 6553 12237:getfield        #12  <Field azh a>
	// 6554 12240:getfield        #195 <Field int azh.g>
	// 6555 12243:ixor            
	// 6556 12244:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 6557 12247:aload_0         
	// 6558 12248:getfield        #12  <Field azh a>
	// 6559 12251:astore_1        
		abyte0.bw = ((azh) (abyte0)).aZ & ~a.C;
	// 6560 12252:aload_1         
	// 6561 12253:aload_1         
	// 6562 12254:getfield        #41  <Field int azh.aZ>
	// 6563 12257:aload_0         
	// 6564 12258:getfield        #12  <Field azh a>
	// 6565 12261:getfield        #360 <Field int azh.C>
	// 6566 12264:iconst_m1       
	// 6567 12265:ixor            
	// 6568 12266:iand            
	// 6569 12267:putfield        #399 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 6570 12270:aload_0         
	// 6571 12271:getfield        #12  <Field azh a>
	// 6572 12274:astore_1        
		abyte0.cg = ((azh) (abyte0)).S & a.g;
	// 6573 12275:aload_1         
	// 6574 12276:aload_1         
	// 6575 12277:getfield        #429 <Field int azh.S>
	// 6576 12280:aload_0         
	// 6577 12281:getfield        #12  <Field azh a>
	// 6578 12284:getfield        #195 <Field int azh.g>
	// 6579 12287:iand            
	// 6580 12288:putfield        #381 <Field int azh.cg>
		abyte0 = ((byte []) (a));
	// 6581 12291:aload_0         
	// 6582 12292:getfield        #12  <Field azh a>
	// 6583 12295:astore_1        
		abyte0.bl = ((azh) (abyte0)).g & ~a.cg;
	// 6584 12296:aload_1         
	// 6585 12297:aload_1         
	// 6586 12298:getfield        #195 <Field int azh.g>
	// 6587 12301:aload_0         
	// 6588 12302:getfield        #12  <Field azh a>
	// 6589 12305:getfield        #381 <Field int azh.cg>
	// 6590 12308:iconst_m1       
	// 6591 12309:ixor            
	// 6592 12310:iand            
	// 6593 12311:putfield        #366 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 6594 12314:aload_0         
	// 6595 12315:getfield        #12  <Field azh a>
	// 6596 12318:astore_1        
		abyte0.at = ((azh) (abyte0)).bl ^ a.at;
	// 6597 12319:aload_1         
	// 6598 12320:aload_1         
	// 6599 12321:getfield        #366 <Field int azh.bl>
	// 6600 12324:aload_0         
	// 6601 12325:getfield        #12  <Field azh a>
	// 6602 12328:getfield        #327 <Field int azh.at>
	// 6603 12331:ixor            
	// 6604 12332:putfield        #327 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 6605 12335:aload_0         
	// 6606 12336:getfield        #12  <Field azh a>
	// 6607 12339:astore_1        
		abyte0.bv = ((azh) (abyte0)).C | a.bl;
	// 6608 12340:aload_1         
	// 6609 12341:aload_1         
	// 6610 12342:getfield        #360 <Field int azh.C>
	// 6611 12345:aload_0         
	// 6612 12346:getfield        #12  <Field azh a>
	// 6613 12349:getfield        #366 <Field int azh.bl>
	// 6614 12352:ior             
	// 6615 12353:putfield        #411 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6616 12356:aload_0         
	// 6617 12357:getfield        #12  <Field azh a>
	// 6618 12360:astore_1        
		abyte0.bv = ((azh) (abyte0)).aJ ^ a.bv;
	// 6619 12361:aload_1         
	// 6620 12362:aload_1         
	// 6621 12363:getfield        #426 <Field int azh.aJ>
	// 6622 12366:aload_0         
	// 6623 12367:getfield        #12  <Field azh a>
	// 6624 12370:getfield        #411 <Field int azh.bv>
	// 6625 12373:ixor            
	// 6626 12374:putfield        #411 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6627 12377:aload_0         
	// 6628 12378:getfield        #12  <Field azh a>
	// 6629 12381:astore_1        
		abyte0.bv = ((azh) (abyte0)).bv ^ a.K;
	// 6630 12382:aload_1         
	// 6631 12383:aload_1         
	// 6632 12384:getfield        #411 <Field int azh.bv>
	// 6633 12387:aload_0         
	// 6634 12388:getfield        #12  <Field azh a>
	// 6635 12391:getfield        #192 <Field int azh.K>
	// 6636 12394:ixor            
	// 6637 12395:putfield        #411 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 6638 12398:aload_0         
	// 6639 12399:getfield        #12  <Field azh a>
	// 6640 12402:astore_1        
		abyte0.bh = ((azh) (abyte0)).bl ^ a.bh;
	// 6641 12403:aload_1         
	// 6642 12404:aload_1         
	// 6643 12405:getfield        #366 <Field int azh.bl>
	// 6644 12408:aload_0         
	// 6645 12409:getfield        #12  <Field azh a>
	// 6646 12412:getfield        #309 <Field int azh.bh>
	// 6647 12415:ixor            
	// 6648 12416:putfield        #309 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 6649 12419:aload_0         
	// 6650 12420:getfield        #12  <Field azh a>
	// 6651 12423:astore_1        
		abyte0.bE = ((azh) (abyte0)).bh & ~a.K;
	// 6652 12424:aload_1         
	// 6653 12425:aload_1         
	// 6654 12426:getfield        #309 <Field int azh.bh>
	// 6655 12429:aload_0         
	// 6656 12430:getfield        #12  <Field azh a>
	// 6657 12433:getfield        #192 <Field int azh.K>
	// 6658 12436:iconst_m1       
	// 6659 12437:ixor            
	// 6660 12438:iand            
	// 6661 12439:putfield        #375 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 6662 12442:aload_0         
	// 6663 12443:getfield        #12  <Field azh a>
	// 6664 12446:astore_1        
		abyte0.ax = ((azh) (abyte0)).bh ^ a.ax;
	// 6665 12447:aload_1         
	// 6666 12448:aload_1         
	// 6667 12449:getfield        #309 <Field int azh.bh>
	// 6668 12452:aload_0         
	// 6669 12453:getfield        #12  <Field azh a>
	// 6670 12456:getfield        #408 <Field int azh.ax>
	// 6671 12459:ixor            
	// 6672 12460:putfield        #408 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 6673 12463:aload_0         
	// 6674 12464:getfield        #12  <Field azh a>
	// 6675 12467:astore_1        
		abyte0.n = ((azh) (abyte0)).cg ^ a.n;
	// 6676 12468:aload_1         
	// 6677 12469:aload_1         
	// 6678 12470:getfield        #381 <Field int azh.cg>
	// 6679 12473:aload_0         
	// 6680 12474:getfield        #12  <Field azh a>
	// 6681 12477:getfield        #306 <Field int azh.n>
	// 6682 12480:ixor            
	// 6683 12481:putfield        #306 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 6684 12484:aload_0         
	// 6685 12485:getfield        #12  <Field azh a>
	// 6686 12488:astore_1        
		abyte0.ce = ((azh) (abyte0)).n ^ a.ce;
	// 6687 12489:aload_1         
	// 6688 12490:aload_1         
	// 6689 12491:getfield        #306 <Field int azh.n>
	// 6690 12494:aload_0         
	// 6691 12495:getfield        #12  <Field azh a>
	// 6692 12498:getfield        #342 <Field int azh.ce>
	// 6693 12501:ixor            
	// 6694 12502:putfield        #342 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 6695 12505:aload_0         
	// 6696 12506:getfield        #12  <Field azh a>
	// 6697 12509:astore_1        
		abyte0.aO = ((azh) (abyte0)).cg & ~a.C;
	// 6698 12510:aload_1         
	// 6699 12511:aload_1         
	// 6700 12512:getfield        #381 <Field int azh.cg>
	// 6701 12515:aload_0         
	// 6702 12516:getfield        #12  <Field azh a>
	// 6703 12519:getfield        #360 <Field int azh.C>
	// 6704 12522:iconst_m1       
	// 6705 12523:ixor            
	// 6706 12524:iand            
	// 6707 12525:putfield        #387 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 6708 12528:aload_0         
	// 6709 12529:getfield        #12  <Field azh a>
	// 6710 12532:astore_1        
		abyte0.aO = ((azh) (abyte0)).aO & ~a.K;
	// 6711 12533:aload_1         
	// 6712 12534:aload_1         
	// 6713 12535:getfield        #387 <Field int azh.aO>
	// 6714 12538:aload_0         
	// 6715 12539:getfield        #12  <Field azh a>
	// 6716 12542:getfield        #192 <Field int azh.K>
	// 6717 12545:iconst_m1       
	// 6718 12546:ixor            
	// 6719 12547:iand            
	// 6720 12548:putfield        #387 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 6721 12551:aload_0         
	// 6722 12552:getfield        #12  <Field azh a>
	// 6723 12555:astore_1        
		abyte0.aO = ((azh) (abyte0)).bl ^ a.aO;
	// 6724 12556:aload_1         
	// 6725 12557:aload_1         
	// 6726 12558:getfield        #366 <Field int azh.bl>
	// 6727 12561:aload_0         
	// 6728 12562:getfield        #12  <Field azh a>
	// 6729 12565:getfield        #387 <Field int azh.aO>
	// 6730 12568:ixor            
	// 6731 12569:putfield        #387 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 6732 12572:aload_0         
	// 6733 12573:getfield        #12  <Field azh a>
	// 6734 12576:astore_1        
		abyte0.bl = ((azh) (abyte0)).C | a.cg;
	// 6735 12577:aload_1         
	// 6736 12578:aload_1         
	// 6737 12579:getfield        #360 <Field int azh.C>
	// 6738 12582:aload_0         
	// 6739 12583:getfield        #12  <Field azh a>
	// 6740 12586:getfield        #381 <Field int azh.cg>
	// 6741 12589:ior             
	// 6742 12590:putfield        #366 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 6743 12593:aload_0         
	// 6744 12594:getfield        #12  <Field azh a>
	// 6745 12597:astore_1        
		abyte0.ap = ((azh) (abyte0)).g | a.S;
	// 6746 12598:aload_1         
	// 6747 12599:aload_1         
	// 6748 12600:getfield        #195 <Field int azh.g>
	// 6749 12603:aload_0         
	// 6750 12604:getfield        #12  <Field azh a>
	// 6751 12607:getfield        #429 <Field int azh.S>
	// 6752 12610:ior             
	// 6753 12611:putfield        #68  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 6754 12614:aload_0         
	// 6755 12615:getfield        #12  <Field azh a>
	// 6756 12618:astore_1        
		abyte0.bk = ((azh) (abyte0)).ap & ~a.C;
	// 6757 12619:aload_1         
	// 6758 12620:aload_1         
	// 6759 12621:getfield        #68  <Field int azh.ap>
	// 6760 12624:aload_0         
	// 6761 12625:getfield        #12  <Field azh a>
	// 6762 12628:getfield        #360 <Field int azh.C>
	// 6763 12631:iconst_m1       
	// 6764 12632:ixor            
	// 6765 12633:iand            
	// 6766 12634:putfield        #234 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 6767 12637:aload_0         
	// 6768 12638:getfield        #12  <Field azh a>
	// 6769 12641:astore_1        
		abyte0.bt = ((azh) (abyte0)).C | a.ap;
	// 6770 12642:aload_1         
	// 6771 12643:aload_1         
	// 6772 12644:getfield        #360 <Field int azh.C>
	// 6773 12647:aload_0         
	// 6774 12648:getfield        #12  <Field azh a>
	// 6775 12651:getfield        #68  <Field int azh.ap>
	// 6776 12654:ior             
	// 6777 12655:putfield        #213 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 6778 12658:aload_0         
	// 6779 12659:getfield        #12  <Field azh a>
	// 6780 12662:astore_1        
		abyte0.bt = ((azh) (abyte0)).ap ^ a.bt;
	// 6781 12663:aload_1         
	// 6782 12664:aload_1         
	// 6783 12665:getfield        #68  <Field int azh.ap>
	// 6784 12668:aload_0         
	// 6785 12669:getfield        #12  <Field azh a>
	// 6786 12672:getfield        #213 <Field int azh.bt>
	// 6787 12675:ixor            
	// 6788 12676:putfield        #213 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 6789 12679:aload_0         
	// 6790 12680:getfield        #12  <Field azh a>
	// 6791 12683:astore_1        
		abyte0.bt = ((azh) (abyte0)).bt ^ a.K;
	// 6792 12684:aload_1         
	// 6793 12685:aload_1         
	// 6794 12686:getfield        #213 <Field int azh.bt>
	// 6795 12689:aload_0         
	// 6796 12690:getfield        #12  <Field azh a>
	// 6797 12693:getfield        #192 <Field int azh.K>
	// 6798 12696:ixor            
	// 6799 12697:putfield        #213 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 6800 12700:aload_0         
	// 6801 12701:getfield        #12  <Field azh a>
	// 6802 12704:astore_1        
		abyte0.ah = ((azh) (abyte0)).C | a.ap;
	// 6803 12705:aload_1         
	// 6804 12706:aload_1         
	// 6805 12707:getfield        #360 <Field int azh.C>
	// 6806 12710:aload_0         
	// 6807 12711:getfield        #12  <Field azh a>
	// 6808 12714:getfield        #68  <Field int azh.ap>
	// 6809 12717:ior             
	// 6810 12718:putfield        #201 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 6811 12721:aload_0         
	// 6812 12722:getfield        #12  <Field azh a>
	// 6813 12725:astore_1        
		abyte0.ah = ((azh) (abyte0)).aJ ^ a.ah;
	// 6814 12726:aload_1         
	// 6815 12727:aload_1         
	// 6816 12728:getfield        #426 <Field int azh.aJ>
	// 6817 12731:aload_0         
	// 6818 12732:getfield        #12  <Field azh a>
	// 6819 12735:getfield        #201 <Field int azh.ah>
	// 6820 12738:ixor            
	// 6821 12739:putfield        #201 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 6822 12742:aload_0         
	// 6823 12743:getfield        #12  <Field azh a>
	// 6824 12746:astore_1        
		abyte0.au = ((azh) (abyte0)).ah ^ a.au;
	// 6825 12747:aload_1         
	// 6826 12748:aload_1         
	// 6827 12749:getfield        #201 <Field int azh.ah>
	// 6828 12752:aload_0         
	// 6829 12753:getfield        #12  <Field azh a>
	// 6830 12756:getfield        #85  <Field int azh.au>
	// 6831 12759:ixor            
	// 6832 12760:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 6833 12763:aload_0         
	// 6834 12764:getfield        #12  <Field azh a>
	// 6835 12767:astore_1        
		abyte0.ah = ((azh) (abyte0)).ap & ~a.C;
	// 6836 12768:aload_1         
	// 6837 12769:aload_1         
	// 6838 12770:getfield        #68  <Field int azh.ap>
	// 6839 12773:aload_0         
	// 6840 12774:getfield        #12  <Field azh a>
	// 6841 12777:getfield        #360 <Field int azh.C>
	// 6842 12780:iconst_m1       
	// 6843 12781:ixor            
	// 6844 12782:iand            
	// 6845 12783:putfield        #201 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 6846 12786:aload_0         
	// 6847 12787:getfield        #12  <Field azh a>
	// 6848 12790:astore_1        
		abyte0.ah = ((azh) (abyte0)).cg ^ a.ah;
	// 6849 12791:aload_1         
	// 6850 12792:aload_1         
	// 6851 12793:getfield        #381 <Field int azh.cg>
	// 6852 12796:aload_0         
	// 6853 12797:getfield        #12  <Field azh a>
	// 6854 12800:getfield        #201 <Field int azh.ah>
	// 6855 12803:ixor            
	// 6856 12804:putfield        #201 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 6857 12807:aload_0         
	// 6858 12808:getfield        #12  <Field azh a>
	// 6859 12811:astore_1        
		abyte0.ah = ((azh) (abyte0)).ah & ~a.K;
	// 6860 12812:aload_1         
	// 6861 12813:aload_1         
	// 6862 12814:getfield        #201 <Field int azh.ah>
	// 6863 12817:aload_0         
	// 6864 12818:getfield        #12  <Field azh a>
	// 6865 12821:getfield        #192 <Field int azh.K>
	// 6866 12824:iconst_m1       
	// 6867 12825:ixor            
	// 6868 12826:iand            
	// 6869 12827:putfield        #201 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 6870 12830:aload_0         
	// 6871 12831:getfield        #12  <Field azh a>
	// 6872 12834:astore_1        
		abyte0.aJ = ((azh) (abyte0)).ap & ~a.g;
	// 6873 12835:aload_1         
	// 6874 12836:aload_1         
	// 6875 12837:getfield        #68  <Field int azh.ap>
	// 6876 12840:aload_0         
	// 6877 12841:getfield        #12  <Field azh a>
	// 6878 12844:getfield        #195 <Field int azh.g>
	// 6879 12847:iconst_m1       
	// 6880 12848:ixor            
	// 6881 12849:iand            
	// 6882 12850:putfield        #426 <Field int azh.aJ>
		abyte0 = ((byte []) (a));
	// 6883 12853:aload_0         
	// 6884 12854:getfield        #12  <Field azh a>
	// 6885 12857:astore_1        
		abyte0.ch = ((azh) (abyte0)).aJ ^ a.ch;
	// 6886 12858:aload_1         
	// 6887 12859:aload_1         
	// 6888 12860:getfield        #426 <Field int azh.aJ>
	// 6889 12863:aload_0         
	// 6890 12864:getfield        #12  <Field azh a>
	// 6891 12867:getfield        #420 <Field int azh.ch>
	// 6892 12870:ixor            
	// 6893 12871:putfield        #420 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 6894 12874:aload_0         
	// 6895 12875:getfield        #12  <Field azh a>
	// 6896 12878:astore_1        
		abyte0.bw = ((azh) (abyte0)).aJ ^ a.bw;
	// 6897 12879:aload_1         
	// 6898 12880:aload_1         
	// 6899 12881:getfield        #426 <Field int azh.aJ>
	// 6900 12884:aload_0         
	// 6901 12885:getfield        #12  <Field azh a>
	// 6902 12888:getfield        #399 <Field int azh.bw>
	// 6903 12891:ixor            
	// 6904 12892:putfield        #399 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 6905 12895:aload_0         
	// 6906 12896:getfield        #12  <Field azh a>
	// 6907 12899:astore_1        
		abyte0.by = ((azh) (abyte0)).bw ^ a.by;
	// 6908 12900:aload_1         
	// 6909 12901:aload_1         
	// 6910 12902:getfield        #399 <Field int azh.bw>
	// 6911 12905:aload_0         
	// 6912 12906:getfield        #12  <Field azh a>
	// 6913 12909:getfield        #354 <Field int azh.by>
	// 6914 12912:ixor            
	// 6915 12913:putfield        #354 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 6916 12916:aload_0         
	// 6917 12917:getfield        #12  <Field azh a>
	// 6918 12920:astore_1        
		abyte0.bw = ((azh) (abyte0)).K & ~a.bw;
	// 6919 12921:aload_1         
	// 6920 12922:aload_1         
	// 6921 12923:getfield        #192 <Field int azh.K>
	// 6922 12926:aload_0         
	// 6923 12927:getfield        #12  <Field azh a>
	// 6924 12930:getfield        #399 <Field int azh.bw>
	// 6925 12933:iconst_m1       
	// 6926 12934:ixor            
	// 6927 12935:iand            
	// 6928 12936:putfield        #399 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 6929 12939:aload_0         
	// 6930 12940:getfield        #12  <Field azh a>
	// 6931 12943:astore_1        
		abyte0.bw = ((azh) (abyte0)).bh ^ a.bw;
	// 6932 12944:aload_1         
	// 6933 12945:aload_1         
	// 6934 12946:getfield        #309 <Field int azh.bh>
	// 6935 12949:aload_0         
	// 6936 12950:getfield        #12  <Field azh a>
	// 6937 12953:getfield        #399 <Field int azh.bw>
	// 6938 12956:ixor            
	// 6939 12957:putfield        #399 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 6940 12960:aload_0         
	// 6941 12961:getfield        #12  <Field azh a>
	// 6942 12964:astore_1        
		abyte0.bh = ((azh) (abyte0)).C | a.aJ;
	// 6943 12965:aload_1         
	// 6944 12966:aload_1         
	// 6945 12967:getfield        #360 <Field int azh.C>
	// 6946 12970:aload_0         
	// 6947 12971:getfield        #12  <Field azh a>
	// 6948 12974:getfield        #426 <Field int azh.aJ>
	// 6949 12977:ior             
	// 6950 12978:putfield        #309 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 6951 12981:aload_0         
	// 6952 12982:getfield        #12  <Field azh a>
	// 6953 12985:astore_1        
		abyte0.bh = ((azh) (abyte0)).cg ^ a.bh;
	// 6954 12986:aload_1         
	// 6955 12987:aload_1         
	// 6956 12988:getfield        #381 <Field int azh.cg>
	// 6957 12991:aload_0         
	// 6958 12992:getfield        #12  <Field azh a>
	// 6959 12995:getfield        #309 <Field int azh.bh>
	// 6960 12998:ixor            
	// 6961 12999:putfield        #309 <Field int azh.bh>
		abyte0 = ((byte []) (a));
	// 6962 13002:aload_0         
	// 6963 13003:getfield        #12  <Field azh a>
	// 6964 13006:astore_1        
		abyte0.bE = ((azh) (abyte0)).bh ^ a.bE;
	// 6965 13007:aload_1         
	// 6966 13008:aload_1         
	// 6967 13009:getfield        #309 <Field int azh.bh>
	// 6968 13012:aload_0         
	// 6969 13013:getfield        #12  <Field azh a>
	// 6970 13016:getfield        #375 <Field int azh.bE>
	// 6971 13019:ixor            
	// 6972 13020:putfield        #375 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 6973 13023:aload_0         
	// 6974 13024:getfield        #12  <Field azh a>
	// 6975 13027:astore_1        
		abyte0.bk = ((azh) (abyte0)).aJ ^ a.bk;
	// 6976 13028:aload_1         
	// 6977 13029:aload_1         
	// 6978 13030:getfield        #426 <Field int azh.aJ>
	// 6979 13033:aload_0         
	// 6980 13034:getfield        #12  <Field azh a>
	// 6981 13037:getfield        #234 <Field int azh.bk>
	// 6982 13040:ixor            
	// 6983 13041:putfield        #234 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 6984 13044:aload_0         
	// 6985 13045:getfield        #12  <Field azh a>
	// 6986 13048:astore_1        
		abyte0.bk = ((azh) (abyte0)).K | a.bk;
	// 6987 13049:aload_1         
	// 6988 13050:aload_1         
	// 6989 13051:getfield        #192 <Field int azh.K>
	// 6990 13054:aload_0         
	// 6991 13055:getfield        #12  <Field azh a>
	// 6992 13058:getfield        #234 <Field int azh.bk>
	// 6993 13061:ior             
	// 6994 13062:putfield        #234 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 6995 13065:aload_0         
	// 6996 13066:getfield        #12  <Field azh a>
	// 6997 13069:astore_1        
		abyte0.bk = ((azh) (abyte0)).n ^ a.bk;
	// 6998 13070:aload_1         
	// 6999 13071:aload_1         
	// 7000 13072:getfield        #306 <Field int azh.n>
	// 7001 13075:aload_0         
	// 7002 13076:getfield        #12  <Field azh a>
	// 7003 13079:getfield        #234 <Field int azh.bk>
	// 7004 13082:ixor            
	// 7005 13083:putfield        #234 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 7006 13086:aload_0         
	// 7007 13087:getfield        #12  <Field azh a>
	// 7008 13090:astore_1        
		abyte0.ap = ((azh) (abyte0)).C | a.ap;
	// 7009 13091:aload_1         
	// 7010 13092:aload_1         
	// 7011 13093:getfield        #360 <Field int azh.C>
	// 7012 13096:aload_0         
	// 7013 13097:getfield        #12  <Field azh a>
	// 7014 13100:getfield        #68  <Field int azh.ap>
	// 7015 13103:ior             
	// 7016 13104:putfield        #68  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 7017 13107:aload_0         
	// 7018 13108:getfield        #12  <Field azh a>
	// 7019 13111:astore_1        
		abyte0.ap = ((azh) (abyte0)).aZ ^ a.ap;
	// 7020 13112:aload_1         
	// 7021 13113:aload_1         
	// 7022 13114:getfield        #41  <Field int azh.aZ>
	// 7023 13117:aload_0         
	// 7024 13118:getfield        #12  <Field azh a>
	// 7025 13121:getfield        #68  <Field int azh.ap>
	// 7026 13124:ixor            
	// 7027 13125:putfield        #68  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 7028 13128:aload_0         
	// 7029 13129:getfield        #12  <Field azh a>
	// 7030 13132:astore_1        
		abyte0.ah = ((azh) (abyte0)).ap ^ a.ah;
	// 7031 13133:aload_1         
	// 7032 13134:aload_1         
	// 7033 13135:getfield        #68  <Field int azh.ap>
	// 7034 13138:aload_0         
	// 7035 13139:getfield        #12  <Field azh a>
	// 7036 13142:getfield        #201 <Field int azh.ah>
	// 7037 13145:ixor            
	// 7038 13146:putfield        #201 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 7039 13149:aload_0         
	// 7040 13150:getfield        #12  <Field azh a>
	// 7041 13153:astore_1        
		abyte0.W = ((azh) (abyte0)).aA & a.W;
	// 7042 13154:aload_1         
	// 7043 13155:aload_1         
	// 7044 13156:getfield        #432 <Field int azh.aA>
	// 7045 13159:aload_0         
	// 7046 13160:getfield        #12  <Field azh a>
	// 7047 13163:getfield        #207 <Field int azh.W>
	// 7048 13166:iand            
	// 7049 13167:putfield        #207 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 7050 13170:aload_0         
	// 7051 13171:getfield        #12  <Field azh a>
	// 7052 13174:astore_1        
		abyte0.W = ((azh) (abyte0)).ar ^ a.W;
	// 7053 13175:aload_1         
	// 7054 13176:aload_1         
	// 7055 13177:getfield        #435 <Field int azh.ar>
	// 7056 13180:aload_0         
	// 7057 13181:getfield        #12  <Field azh a>
	// 7058 13184:getfield        #207 <Field int azh.W>
	// 7059 13187:ixor            
	// 7060 13188:putfield        #207 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 7061 13191:aload_0         
	// 7062 13192:getfield        #12  <Field azh a>
	// 7063 13195:astore_1        
		abyte0.aI = ((azh) (abyte0)).W | a.aI;
	// 7064 13196:aload_1         
	// 7065 13197:aload_1         
	// 7066 13198:getfield        #207 <Field int azh.W>
	// 7067 13201:aload_0         
	// 7068 13202:getfield        #12  <Field azh a>
	// 7069 13205:getfield        #222 <Field int azh.aI>
	// 7070 13208:ior             
	// 7071 13209:putfield        #222 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 7072 13212:aload_0         
	// 7073 13213:getfield        #12  <Field azh a>
	// 7074 13216:astore_1        
		abyte0.aI = ((azh) (abyte0)).bB ^ a.aI;
	// 7075 13217:aload_1         
	// 7076 13218:aload_1         
	// 7077 13219:getfield        #225 <Field int azh.bB>
	// 7078 13222:aload_0         
	// 7079 13223:getfield        #12  <Field azh a>
	// 7080 13226:getfield        #222 <Field int azh.aI>
	// 7081 13229:ixor            
	// 7082 13230:putfield        #222 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 7083 13233:aload_0         
	// 7084 13234:getfield        #12  <Field azh a>
	// 7085 13237:astore_1        
		abyte0.b = ((azh) (abyte0)).aI ^ a.b;
	// 7086 13238:aload_1         
	// 7087 13239:aload_1         
	// 7088 13240:getfield        #222 <Field int azh.aI>
	// 7089 13243:aload_0         
	// 7090 13244:getfield        #12  <Field azh a>
	// 7091 13247:getfield        #438 <Field int azh.b>
	// 7092 13250:ixor            
	// 7093 13251:putfield        #438 <Field int azh.b>
		abyte0 = ((byte []) (a));
	// 7094 13254:aload_0         
	// 7095 13255:getfield        #12  <Field azh a>
	// 7096 13258:astore_1        
		abyte0.aI = ((azh) (abyte0)).r & a.b;
	// 7097 13259:aload_1         
	// 7098 13260:aload_1         
	// 7099 13261:getfield        #115 <Field int azh.r>
	// 7100 13264:aload_0         
	// 7101 13265:getfield        #12  <Field azh a>
	// 7102 13268:getfield        #438 <Field int azh.b>
	// 7103 13271:iand            
	// 7104 13272:putfield        #222 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 7105 13275:aload_0         
	// 7106 13276:getfield        #12  <Field azh a>
	// 7107 13279:astore_1        
		abyte0.bB = ((azh) (abyte0)).r & ~a.aI;
	// 7108 13280:aload_1         
	// 7109 13281:aload_1         
	// 7110 13282:getfield        #115 <Field int azh.r>
	// 7111 13285:aload_0         
	// 7112 13286:getfield        #12  <Field azh a>
	// 7113 13289:getfield        #222 <Field int azh.aI>
	// 7114 13292:iconst_m1       
	// 7115 13293:ixor            
	// 7116 13294:iand            
	// 7117 13295:putfield        #225 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 7118 13298:aload_0         
	// 7119 13299:getfield        #12  <Field azh a>
	// 7120 13302:astore_1        
		abyte0.bB = ((azh) (abyte0)).z | a.bB;
	// 7121 13303:aload_1         
	// 7122 13304:aload_1         
	// 7123 13305:getfield        #112 <Field int azh.z>
	// 7124 13308:aload_0         
	// 7125 13309:getfield        #12  <Field azh a>
	// 7126 13312:getfield        #225 <Field int azh.bB>
	// 7127 13315:ior             
	// 7128 13316:putfield        #225 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 7129 13319:aload_0         
	// 7130 13320:getfield        #12  <Field azh a>
	// 7131 13323:astore_1        
		abyte0.bB = ((azh) (abyte0)).H & a.bB;
	// 7132 13324:aload_1         
	// 7133 13325:aload_1         
	// 7134 13326:getfield        #118 <Field int azh.H>
	// 7135 13329:aload_0         
	// 7136 13330:getfield        #12  <Field azh a>
	// 7137 13333:getfield        #225 <Field int azh.bB>
	// 7138 13336:iand            
	// 7139 13337:putfield        #225 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 7140 13340:aload_0         
	// 7141 13341:getfield        #12  <Field azh a>
	// 7142 13344:astore_1        
		abyte0.av = ((azh) (abyte0)).aI ^ a.av;
	// 7143 13345:aload_1         
	// 7144 13346:aload_1         
	// 7145 13347:getfield        #222 <Field int azh.aI>
	// 7146 13350:aload_0         
	// 7147 13351:getfield        #12  <Field azh a>
	// 7148 13354:getfield        #106 <Field int azh.av>
	// 7149 13357:ixor            
	// 7150 13358:putfield        #106 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 7151 13361:aload_0         
	// 7152 13362:getfield        #12  <Field azh a>
	// 7153 13365:astore_1        
		abyte0.av = ((azh) (abyte0)).H & ~a.av;
	// 7154 13366:aload_1         
	// 7155 13367:aload_1         
	// 7156 13368:getfield        #118 <Field int azh.H>
	// 7157 13371:aload_0         
	// 7158 13372:getfield        #12  <Field azh a>
	// 7159 13375:getfield        #106 <Field int azh.av>
	// 7160 13378:iconst_m1       
	// 7161 13379:ixor            
	// 7162 13380:iand            
	// 7163 13381:putfield        #106 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 7164 13384:aload_0         
	// 7165 13385:getfield        #12  <Field azh a>
	// 7166 13388:astore_1        
		abyte0.bD = ((azh) (abyte0)).av ^ a.bD;
	// 7167 13389:aload_1         
	// 7168 13390:aload_1         
	// 7169 13391:getfield        #106 <Field int azh.av>
	// 7170 13394:aload_0         
	// 7171 13395:getfield        #12  <Field azh a>
	// 7172 13398:getfield        #103 <Field int azh.bD>
	// 7173 13401:ixor            
	// 7174 13402:putfield        #103 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 7175 13405:aload_0         
	// 7176 13406:getfield        #12  <Field azh a>
	// 7177 13409:astore_1        
		abyte0.bD = ((azh) (abyte0)).al | a.bD;
	// 7178 13410:aload_1         
	// 7179 13411:aload_1         
	// 7180 13412:getfield        #441 <Field int azh.al>
	// 7181 13415:aload_0         
	// 7182 13416:getfield        #12  <Field azh a>
	// 7183 13419:getfield        #103 <Field int azh.bD>
	// 7184 13422:ior             
	// 7185 13423:putfield        #103 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 7186 13426:aload_0         
	// 7187 13427:getfield        #12  <Field azh a>
	// 7188 13430:astore_1        
		abyte0.av = ((azh) (abyte0)).aI & ~a.z;
	// 7189 13431:aload_1         
	// 7190 13432:aload_1         
	// 7191 13433:getfield        #222 <Field int azh.aI>
	// 7192 13436:aload_0         
	// 7193 13437:getfield        #12  <Field azh a>
	// 7194 13440:getfield        #112 <Field int azh.z>
	// 7195 13443:iconst_m1       
	// 7196 13444:ixor            
	// 7197 13445:iand            
	// 7198 13446:putfield        #106 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 7199 13449:aload_0         
	// 7200 13450:getfield        #12  <Field azh a>
	// 7201 13453:astore_1        
		abyte0.av = ((azh) (abyte0)).aI ^ a.av;
	// 7202 13454:aload_1         
	// 7203 13455:aload_1         
	// 7204 13456:getfield        #222 <Field int azh.aI>
	// 7205 13459:aload_0         
	// 7206 13460:getfield        #12  <Field azh a>
	// 7207 13463:getfield        #106 <Field int azh.av>
	// 7208 13466:ixor            
	// 7209 13467:putfield        #106 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 7210 13470:aload_0         
	// 7211 13471:getfield        #12  <Field azh a>
	// 7212 13474:astore_1        
		abyte0.aI = ((azh) (abyte0)).H & a.av;
	// 7213 13475:aload_1         
	// 7214 13476:aload_1         
	// 7215 13477:getfield        #118 <Field int azh.H>
	// 7216 13480:aload_0         
	// 7217 13481:getfield        #12  <Field azh a>
	// 7218 13484:getfield        #106 <Field int azh.av>
	// 7219 13487:iand            
	// 7220 13488:putfield        #222 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 7221 13491:aload_0         
	// 7222 13492:getfield        #12  <Field azh a>
	// 7223 13495:astore_1        
		abyte0.av = ((azh) (abyte0)).H & ~a.av;
	// 7224 13496:aload_1         
	// 7225 13497:aload_1         
	// 7226 13498:getfield        #118 <Field int azh.H>
	// 7227 13501:aload_0         
	// 7228 13502:getfield        #12  <Field azh a>
	// 7229 13505:getfield        #106 <Field int azh.av>
	// 7230 13508:iconst_m1       
	// 7231 13509:ixor            
	// 7232 13510:iand            
	// 7233 13511:putfield        #106 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 7234 13514:aload_0         
	// 7235 13515:getfield        #12  <Field azh a>
	// 7236 13518:astore_1        
		abyte0.W = ((azh) (abyte0)).b ^ a.r;
	// 7237 13519:aload_1         
	// 7238 13520:aload_1         
	// 7239 13521:getfield        #438 <Field int azh.b>
	// 7240 13524:aload_0         
	// 7241 13525:getfield        #12  <Field azh a>
	// 7242 13528:getfield        #115 <Field int azh.r>
	// 7243 13531:ixor            
	// 7244 13532:putfield        #207 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 7245 13535:aload_0         
	// 7246 13536:getfield        #12  <Field azh a>
	// 7247 13539:astore_1        
		abyte0.ar = ((azh) (abyte0)).z | a.W;
	// 7248 13540:aload_1         
	// 7249 13541:aload_1         
	// 7250 13542:getfield        #112 <Field int azh.z>
	// 7251 13545:aload_0         
	// 7252 13546:getfield        #12  <Field azh a>
	// 7253 13549:getfield        #207 <Field int azh.W>
	// 7254 13552:ior             
	// 7255 13553:putfield        #435 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 7256 13556:aload_0         
	// 7257 13557:getfield        #12  <Field azh a>
	// 7258 13560:astore_1        
		abyte0.aA = ((azh) (abyte0)).z | a.W;
	// 7259 13561:aload_1         
	// 7260 13562:aload_1         
	// 7261 13563:getfield        #112 <Field int azh.z>
	// 7262 13566:aload_0         
	// 7263 13567:getfield        #12  <Field azh a>
	// 7264 13570:getfield        #207 <Field int azh.W>
	// 7265 13573:ior             
	// 7266 13574:putfield        #432 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 7267 13577:aload_0         
	// 7268 13578:getfield        #12  <Field azh a>
	// 7269 13581:astore_1        
		abyte0.aA = ((azh) (abyte0)).W ^ a.aA;
	// 7270 13582:aload_1         
	// 7271 13583:aload_1         
	// 7272 13584:getfield        #207 <Field int azh.W>
	// 7273 13587:aload_0         
	// 7274 13588:getfield        #12  <Field azh a>
	// 7275 13591:getfield        #432 <Field int azh.aA>
	// 7276 13594:ixor            
	// 7277 13595:putfield        #432 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 7278 13598:aload_0         
	// 7279 13599:getfield        #12  <Field azh a>
	// 7280 13602:astore_1        
		abyte0.aA = ((azh) (abyte0)).H & ~a.aA;
	// 7281 13603:aload_1         
	// 7282 13604:aload_1         
	// 7283 13605:getfield        #118 <Field int azh.H>
	// 7284 13608:aload_0         
	// 7285 13609:getfield        #12  <Field azh a>
	// 7286 13612:getfield        #432 <Field int azh.aA>
	// 7287 13615:iconst_m1       
	// 7288 13616:ixor            
	// 7289 13617:iand            
	// 7290 13618:putfield        #432 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 7291 13621:aload_0         
	// 7292 13622:getfield        #12  <Field azh a>
	// 7293 13625:astore_1        
		abyte0.ap = ((azh) (abyte0)).W & ~a.z;
	// 7294 13626:aload_1         
	// 7295 13627:aload_1         
	// 7296 13628:getfield        #207 <Field int azh.W>
	// 7297 13631:aload_0         
	// 7298 13632:getfield        #12  <Field azh a>
	// 7299 13635:getfield        #112 <Field int azh.z>
	// 7300 13638:iconst_m1       
	// 7301 13639:ixor            
	// 7302 13640:iand            
	// 7303 13641:putfield        #68  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 7304 13644:aload_0         
	// 7305 13645:getfield        #12  <Field azh a>
	// 7306 13648:astore_1        
		abyte0.ap = ((azh) (abyte0)).W ^ a.ap;
	// 7307 13649:aload_1         
	// 7308 13650:aload_1         
	// 7309 13651:getfield        #207 <Field int azh.W>
	// 7310 13654:aload_0         
	// 7311 13655:getfield        #12  <Field azh a>
	// 7312 13658:getfield        #68  <Field int azh.ap>
	// 7313 13661:ixor            
	// 7314 13662:putfield        #68  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 7315 13665:aload_0         
	// 7316 13666:getfield        #12  <Field azh a>
	// 7317 13669:astore_1        
		abyte0.aI = ((azh) (abyte0)).ap ^ a.aI;
	// 7318 13670:aload_1         
	// 7319 13671:aload_1         
	// 7320 13672:getfield        #68  <Field int azh.ap>
	// 7321 13675:aload_0         
	// 7322 13676:getfield        #12  <Field azh a>
	// 7323 13679:getfield        #222 <Field int azh.aI>
	// 7324 13682:ixor            
	// 7325 13683:putfield        #222 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 7326 13686:aload_0         
	// 7327 13687:getfield        #12  <Field azh a>
	// 7328 13690:astore_1        
		abyte0.bB = ((azh) (abyte0)).ap ^ a.bB;
	// 7329 13691:aload_1         
	// 7330 13692:aload_1         
	// 7331 13693:getfield        #68  <Field int azh.ap>
	// 7332 13696:aload_0         
	// 7333 13697:getfield        #12  <Field azh a>
	// 7334 13700:getfield        #225 <Field int azh.bB>
	// 7335 13703:ixor            
	// 7336 13704:putfield        #225 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 7337 13707:aload_0         
	// 7338 13708:getfield        #12  <Field azh a>
	// 7339 13711:astore_1        
		abyte0.aH = ((azh) (abyte0)).W ^ a.aH;
	// 7340 13712:aload_1         
	// 7341 13713:aload_1         
	// 7342 13714:getfield        #207 <Field int azh.W>
	// 7343 13717:aload_0         
	// 7344 13718:getfield        #12  <Field azh a>
	// 7345 13721:getfield        #109 <Field int azh.aH>
	// 7346 13724:ixor            
	// 7347 13725:putfield        #109 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 7348 13728:aload_0         
	// 7349 13729:getfield        #12  <Field azh a>
	// 7350 13732:astore_1        
		abyte0.aA = ((azh) (abyte0)).aH ^ a.aA;
	// 7351 13733:aload_1         
	// 7352 13734:aload_1         
	// 7353 13735:getfield        #109 <Field int azh.aH>
	// 7354 13738:aload_0         
	// 7355 13739:getfield        #12  <Field azh a>
	// 7356 13742:getfield        #432 <Field int azh.aA>
	// 7357 13745:ixor            
	// 7358 13746:putfield        #432 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 7359 13749:aload_0         
	// 7360 13750:getfield        #12  <Field azh a>
	// 7361 13753:astore_1        
		abyte0.aA = ((azh) (abyte0)).j | a.aA;
	// 7362 13754:aload_1         
	// 7363 13755:aload_1         
	// 7364 13756:getfield        #121 <Field int azh.j>
	// 7365 13759:aload_0         
	// 7366 13760:getfield        #12  <Field azh a>
	// 7367 13763:getfield        #432 <Field int azh.aA>
	// 7368 13766:ior             
	// 7369 13767:putfield        #432 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 7370 13770:aload_0         
	// 7371 13771:getfield        #12  <Field azh a>
	// 7372 13774:astore_1        
		abyte0.aA = ((azh) (abyte0)).bB ^ a.aA;
	// 7373 13775:aload_1         
	// 7374 13776:aload_1         
	// 7375 13777:getfield        #225 <Field int azh.bB>
	// 7376 13780:aload_0         
	// 7377 13781:getfield        #12  <Field azh a>
	// 7378 13784:getfield        #432 <Field int azh.aA>
	// 7379 13787:ixor            
	// 7380 13788:putfield        #432 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 7381 13791:aload_0         
	// 7382 13792:getfield        #12  <Field azh a>
	// 7383 13795:astore_1        
		abyte0.aA = ((azh) (abyte0)).al | a.aA;
	// 7384 13796:aload_1         
	// 7385 13797:aload_1         
	// 7386 13798:getfield        #441 <Field int azh.al>
	// 7387 13801:aload_0         
	// 7388 13802:getfield        #12  <Field azh a>
	// 7389 13805:getfield        #432 <Field int azh.aA>
	// 7390 13808:ior             
	// 7391 13809:putfield        #432 <Field int azh.aA>
		abyte0 = ((byte []) (a));
	// 7392 13812:aload_0         
	// 7393 13813:getfield        #12  <Field azh a>
	// 7394 13816:astore_1        
		abyte0.bB = ((azh) (abyte0)).H & a.aH;
	// 7395 13817:aload_1         
	// 7396 13818:aload_1         
	// 7397 13819:getfield        #118 <Field int azh.H>
	// 7398 13822:aload_0         
	// 7399 13823:getfield        #12  <Field azh a>
	// 7400 13826:getfield        #109 <Field int azh.aH>
	// 7401 13829:iand            
	// 7402 13830:putfield        #225 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 7403 13833:aload_0         
	// 7404 13834:getfield        #12  <Field azh a>
	// 7405 13837:astore_1        
		abyte0.aH = ((azh) (abyte0)).aH & ~a.H;
	// 7406 13838:aload_1         
	// 7407 13839:aload_1         
	// 7408 13840:getfield        #109 <Field int azh.aH>
	// 7409 13843:aload_0         
	// 7410 13844:getfield        #12  <Field azh a>
	// 7411 13847:getfield        #118 <Field int azh.H>
	// 7412 13850:iconst_m1       
	// 7413 13851:ixor            
	// 7414 13852:iand            
	// 7415 13853:putfield        #109 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 7416 13856:aload_0         
	// 7417 13857:getfield        #12  <Field azh a>
	// 7418 13860:astore_1        
		abyte0.W = ((azh) (abyte0)).z | a.W;
	// 7419 13861:aload_1         
	// 7420 13862:aload_1         
	// 7421 13863:getfield        #112 <Field int azh.z>
	// 7422 13866:aload_0         
	// 7423 13867:getfield        #12  <Field azh a>
	// 7424 13870:getfield        #207 <Field int azh.W>
	// 7425 13873:ior             
	// 7426 13874:putfield        #207 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 7427 13877:aload_0         
	// 7428 13878:getfield        #12  <Field azh a>
	// 7429 13881:astore_1        
		abyte0.W = ((azh) (abyte0)).b ^ a.W;
	// 7430 13882:aload_1         
	// 7431 13883:aload_1         
	// 7432 13884:getfield        #438 <Field int azh.b>
	// 7433 13887:aload_0         
	// 7434 13888:getfield        #12  <Field azh a>
	// 7435 13891:getfield        #207 <Field int azh.W>
	// 7436 13894:ixor            
	// 7437 13895:putfield        #207 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 7438 13898:aload_0         
	// 7439 13899:getfield        #12  <Field azh a>
	// 7440 13902:astore_1        
		abyte0.ap = ((azh) (abyte0)).b & ~a.r;
	// 7441 13903:aload_1         
	// 7442 13904:aload_1         
	// 7443 13905:getfield        #438 <Field int azh.b>
	// 7444 13908:aload_0         
	// 7445 13909:getfield        #12  <Field azh a>
	// 7446 13912:getfield        #115 <Field int azh.r>
	// 7447 13915:iconst_m1       
	// 7448 13916:ixor            
	// 7449 13917:iand            
	// 7450 13918:putfield        #68  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 7451 13921:aload_0         
	// 7452 13922:getfield        #12  <Field azh a>
	// 7453 13925:astore_1        
		abyte0.ap = ((azh) (abyte0)).ap ^ a.z;
	// 7454 13926:aload_1         
	// 7455 13927:aload_1         
	// 7456 13928:getfield        #68  <Field int azh.ap>
	// 7457 13931:aload_0         
	// 7458 13932:getfield        #12  <Field azh a>
	// 7459 13935:getfield        #112 <Field int azh.z>
	// 7460 13938:ixor            
	// 7461 13939:putfield        #68  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 7462 13942:aload_0         
	// 7463 13943:getfield        #12  <Field azh a>
	// 7464 13946:astore_1        
		abyte0.aH = ((azh) (abyte0)).ap ^ a.aH;
	// 7465 13947:aload_1         
	// 7466 13948:aload_1         
	// 7467 13949:getfield        #68  <Field int azh.ap>
	// 7468 13952:aload_0         
	// 7469 13953:getfield        #12  <Field azh a>
	// 7470 13956:getfield        #109 <Field int azh.aH>
	// 7471 13959:ixor            
	// 7472 13960:putfield        #109 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 7473 13963:aload_0         
	// 7474 13964:getfield        #12  <Field azh a>
	// 7475 13967:astore_1        
		abyte0.aZ = ((azh) (abyte0)).z | a.b;
	// 7476 13968:aload_1         
	// 7477 13969:aload_1         
	// 7478 13970:getfield        #112 <Field int azh.z>
	// 7479 13973:aload_0         
	// 7480 13974:getfield        #12  <Field azh a>
	// 7481 13977:getfield        #438 <Field int azh.b>
	// 7482 13980:ior             
	// 7483 13981:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 7484 13984:aload_0         
	// 7485 13985:getfield        #12  <Field azh a>
	// 7486 13988:astore_1        
		abyte0.aZ = ((azh) (abyte0)).H & ~a.aZ;
	// 7487 13989:aload_1         
	// 7488 13990:aload_1         
	// 7489 13991:getfield        #118 <Field int azh.H>
	// 7490 13994:aload_0         
	// 7491 13995:getfield        #12  <Field azh a>
	// 7492 13998:getfield        #41  <Field int azh.aZ>
	// 7493 14001:iconst_m1       
	// 7494 14002:ixor            
	// 7495 14003:iand            
	// 7496 14004:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 7497 14007:aload_0         
	// 7498 14008:getfield        #12  <Field azh a>
	// 7499 14011:astore_1        
		abyte0.aZ = ((azh) (abyte0)).W ^ a.aZ;
	// 7500 14012:aload_1         
	// 7501 14013:aload_1         
	// 7502 14014:getfield        #207 <Field int azh.W>
	// 7503 14017:aload_0         
	// 7504 14018:getfield        #12  <Field azh a>
	// 7505 14021:getfield        #41  <Field int azh.aZ>
	// 7506 14024:ixor            
	// 7507 14025:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 7508 14028:aload_0         
	// 7509 14029:getfield        #12  <Field azh a>
	// 7510 14032:astore_1        
		abyte0.aZ = ((azh) (abyte0)).aZ & ~a.j;
	// 7511 14033:aload_1         
	// 7512 14034:aload_1         
	// 7513 14035:getfield        #41  <Field int azh.aZ>
	// 7514 14038:aload_0         
	// 7515 14039:getfield        #12  <Field azh a>
	// 7516 14042:getfield        #121 <Field int azh.j>
	// 7517 14045:iconst_m1       
	// 7518 14046:ixor            
	// 7519 14047:iand            
	// 7520 14048:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 7521 14051:aload_0         
	// 7522 14052:getfield        #12  <Field azh a>
	// 7523 14055:astore_1        
		abyte0.W = ((azh) (abyte0)).b | a.r;
	// 7524 14056:aload_1         
	// 7525 14057:aload_1         
	// 7526 14058:getfield        #438 <Field int azh.b>
	// 7527 14061:aload_0         
	// 7528 14062:getfield        #12  <Field azh a>
	// 7529 14065:getfield        #115 <Field int azh.r>
	// 7530 14068:ior             
	// 7531 14069:putfield        #207 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 7532 14072:aload_0         
	// 7533 14073:getfield        #12  <Field azh a>
	// 7534 14076:astore_1        
		abyte0.n = ((azh) (abyte0)).H & a.W;
	// 7535 14077:aload_1         
	// 7536 14078:aload_1         
	// 7537 14079:getfield        #118 <Field int azh.H>
	// 7538 14082:aload_0         
	// 7539 14083:getfield        #12  <Field azh a>
	// 7540 14086:getfield        #207 <Field int azh.W>
	// 7541 14089:iand            
	// 7542 14090:putfield        #306 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 7543 14093:aload_0         
	// 7544 14094:getfield        #12  <Field azh a>
	// 7545 14097:astore_1        
		abyte0.n = ((azh) (abyte0)).ap ^ a.n;
	// 7546 14098:aload_1         
	// 7547 14099:aload_1         
	// 7548 14100:getfield        #68  <Field int azh.ap>
	// 7549 14103:aload_0         
	// 7550 14104:getfield        #12  <Field azh a>
	// 7551 14107:getfield        #306 <Field int azh.n>
	// 7552 14110:ixor            
	// 7553 14111:putfield        #306 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 7554 14114:aload_0         
	// 7555 14115:getfield        #12  <Field azh a>
	// 7556 14118:astore_1        
		abyte0.aZ = ((azh) (abyte0)).n ^ a.aZ;
	// 7557 14119:aload_1         
	// 7558 14120:aload_1         
	// 7559 14121:getfield        #306 <Field int azh.n>
	// 7560 14124:aload_0         
	// 7561 14125:getfield        #12  <Field azh a>
	// 7562 14128:getfield        #41  <Field int azh.aZ>
	// 7563 14131:ixor            
	// 7564 14132:putfield        #41  <Field int azh.aZ>
		abyte0 = ((byte []) (a));
	// 7565 14135:aload_0         
	// 7566 14136:getfield        #12  <Field azh a>
	// 7567 14139:astore_1        
		abyte0.W = ((azh) (abyte0)).W & ~a.r;
	// 7568 14140:aload_1         
	// 7569 14141:aload_1         
	// 7570 14142:getfield        #207 <Field int azh.W>
	// 7571 14145:aload_0         
	// 7572 14146:getfield        #12  <Field azh a>
	// 7573 14149:getfield        #115 <Field int azh.r>
	// 7574 14152:iconst_m1       
	// 7575 14153:ixor            
	// 7576 14154:iand            
	// 7577 14155:putfield        #207 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 7578 14158:aload_0         
	// 7579 14159:getfield        #12  <Field azh a>
	// 7580 14162:astore_1        
		abyte0.bB = ((azh) (abyte0)).W ^ a.bB;
	// 7581 14163:aload_1         
	// 7582 14164:aload_1         
	// 7583 14165:getfield        #207 <Field int azh.W>
	// 7584 14168:aload_0         
	// 7585 14169:getfield        #12  <Field azh a>
	// 7586 14172:getfield        #225 <Field int azh.bB>
	// 7587 14175:ixor            
	// 7588 14176:putfield        #225 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 7589 14179:aload_0         
	// 7590 14180:getfield        #12  <Field azh a>
	// 7591 14183:astore_1        
		abyte0.bB = ((azh) (abyte0)).j | a.bB;
	// 7592 14184:aload_1         
	// 7593 14185:aload_1         
	// 7594 14186:getfield        #121 <Field int azh.j>
	// 7595 14189:aload_0         
	// 7596 14190:getfield        #12  <Field azh a>
	// 7597 14193:getfield        #225 <Field int azh.bB>
	// 7598 14196:ior             
	// 7599 14197:putfield        #225 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 7600 14200:aload_0         
	// 7601 14201:getfield        #12  <Field azh a>
	// 7602 14204:astore_1        
		abyte0.bB = ((azh) (abyte0)).aI ^ a.bB;
	// 7603 14205:aload_1         
	// 7604 14206:aload_1         
	// 7605 14207:getfield        #222 <Field int azh.aI>
	// 7606 14210:aload_0         
	// 7607 14211:getfield        #12  <Field azh a>
	// 7608 14214:getfield        #225 <Field int azh.bB>
	// 7609 14217:ixor            
	// 7610 14218:putfield        #225 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 7611 14221:aload_0         
	// 7612 14222:getfield        #12  <Field azh a>
	// 7613 14225:astore_1        
		abyte0.bB = ((azh) (abyte0)).al & a.bB;
	// 7614 14226:aload_1         
	// 7615 14227:aload_1         
	// 7616 14228:getfield        #441 <Field int azh.al>
	// 7617 14231:aload_0         
	// 7618 14232:getfield        #12  <Field azh a>
	// 7619 14235:getfield        #225 <Field int azh.bB>
	// 7620 14238:iand            
	// 7621 14239:putfield        #225 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 7622 14242:aload_0         
	// 7623 14243:getfield        #12  <Field azh a>
	// 7624 14246:astore_1        
		abyte0.an = ((azh) (abyte0)).b | a.an;
	// 7625 14247:aload_1         
	// 7626 14248:aload_1         
	// 7627 14249:getfield        #438 <Field int azh.b>
	// 7628 14252:aload_0         
	// 7629 14253:getfield        #12  <Field azh a>
	// 7630 14256:getfield        #444 <Field int azh.an>
	// 7631 14259:ior             
	// 7632 14260:putfield        #444 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 7633 14263:aload_0         
	// 7634 14264:getfield        #12  <Field azh a>
	// 7635 14267:astore_1        
		abyte0.an = ((azh) (abyte0)).aT ^ a.an;
	// 7636 14268:aload_1         
	// 7637 14269:aload_1         
	// 7638 14270:getfield        #447 <Field int azh.aT>
	// 7639 14273:aload_0         
	// 7640 14274:getfield        #12  <Field azh a>
	// 7641 14277:getfield        #444 <Field int azh.an>
	// 7642 14280:ixor            
	// 7643 14281:putfield        #444 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 7644 14284:aload_0         
	// 7645 14285:getfield        #12  <Field azh a>
	// 7646 14288:astore_1        
		abyte0.ai = ((azh) (abyte0)).an ^ a.ai;
	// 7647 14289:aload_1         
	// 7648 14290:aload_1         
	// 7649 14291:getfield        #444 <Field int azh.an>
	// 7650 14294:aload_0         
	// 7651 14295:getfield        #12  <Field azh a>
	// 7652 14298:getfield        #450 <Field int azh.ai>
	// 7653 14301:ixor            
	// 7654 14302:putfield        #450 <Field int azh.ai>
		abyte0 = ((byte []) (a));
	// 7655 14305:aload_0         
	// 7656 14306:getfield        #12  <Field azh a>
	// 7657 14309:astore_1        
		abyte0.an = ((azh) (abyte0)).M | a.ai;
	// 7658 14310:aload_1         
	// 7659 14311:aload_1         
	// 7660 14312:getfield        #417 <Field int azh.M>
	// 7661 14315:aload_0         
	// 7662 14316:getfield        #12  <Field azh a>
	// 7663 14319:getfield        #450 <Field int azh.ai>
	// 7664 14322:ior             
	// 7665 14323:putfield        #444 <Field int azh.an>
		abyte0 = ((byte []) (a));
	// 7666 14326:aload_0         
	// 7667 14327:getfield        #12  <Field azh a>
	// 7668 14330:astore_1        
		abyte0.by = ((azh) (abyte0)).ai & ~a.by;
	// 7669 14331:aload_1         
	// 7670 14332:aload_1         
	// 7671 14333:getfield        #450 <Field int azh.ai>
	// 7672 14336:aload_0         
	// 7673 14337:getfield        #12  <Field azh a>
	// 7674 14340:getfield        #354 <Field int azh.by>
	// 7675 14343:iconst_m1       
	// 7676 14344:ixor            
	// 7677 14345:iand            
	// 7678 14346:putfield        #354 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 7679 14349:aload_0         
	// 7680 14350:getfield        #12  <Field azh a>
	// 7681 14353:astore_1        
		abyte0.by = ((azh) (abyte0)).ax ^ a.by;
	// 7682 14354:aload_1         
	// 7683 14355:aload_1         
	// 7684 14356:getfield        #408 <Field int azh.ax>
	// 7685 14359:aload_0         
	// 7686 14360:getfield        #12  <Field azh a>
	// 7687 14363:getfield        #354 <Field int azh.by>
	// 7688 14366:ixor            
	// 7689 14367:putfield        #354 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 7690 14370:aload_0         
	// 7691 14371:getfield        #12  <Field azh a>
	// 7692 14374:astore_1        
		abyte0.at = ((azh) (abyte0)).ai & a.at;
	// 7693 14375:aload_1         
	// 7694 14376:aload_1         
	// 7695 14377:getfield        #450 <Field int azh.ai>
	// 7696 14380:aload_0         
	// 7697 14381:getfield        #12  <Field azh a>
	// 7698 14384:getfield        #327 <Field int azh.at>
	// 7699 14387:iand            
	// 7700 14388:putfield        #327 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 7701 14391:aload_0         
	// 7702 14392:getfield        #12  <Field azh a>
	// 7703 14395:astore_1        
		abyte0.at = ((azh) (abyte0)).be ^ a.at;
	// 7704 14396:aload_1         
	// 7705 14397:aload_1         
	// 7706 14398:getfield        #393 <Field int azh.be>
	// 7707 14401:aload_0         
	// 7708 14402:getfield        #12  <Field azh a>
	// 7709 14405:getfield        #327 <Field int azh.at>
	// 7710 14408:ixor            
	// 7711 14409:putfield        #327 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 7712 14412:aload_0         
	// 7713 14413:getfield        #12  <Field azh a>
	// 7714 14416:astore_1        
		abyte0.at = ((azh) (abyte0)).at | a.aa;
	// 7715 14417:aload_1         
	// 7716 14418:aload_1         
	// 7717 14419:getfield        #327 <Field int azh.at>
	// 7718 14422:aload_0         
	// 7719 14423:getfield        #12  <Field azh a>
	// 7720 14426:getfield        #279 <Field int azh.aa>
	// 7721 14429:ior             
	// 7722 14430:putfield        #327 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 7723 14433:aload_0         
	// 7724 14434:getfield        #12  <Field azh a>
	// 7725 14437:astore_1        
		abyte0.be = ((azh) (abyte0)).ai & ~a.w;
	// 7726 14438:aload_1         
	// 7727 14439:aload_1         
	// 7728 14440:getfield        #450 <Field int azh.ai>
	// 7729 14443:aload_0         
	// 7730 14444:getfield        #12  <Field azh a>
	// 7731 14447:getfield        #285 <Field int azh.w>
	// 7732 14450:iconst_m1       
	// 7733 14451:ixor            
	// 7734 14452:iand            
	// 7735 14453:putfield        #393 <Field int azh.be>
		abyte0 = ((byte []) (a));
	// 7736 14456:aload_0         
	// 7737 14457:getfield        #12  <Field azh a>
	// 7738 14460:astore_1        
		abyte0.ax = ((azh) (abyte0)).w | a.be;
	// 7739 14461:aload_1         
	// 7740 14462:aload_1         
	// 7741 14463:getfield        #285 <Field int azh.w>
	// 7742 14466:aload_0         
	// 7743 14467:getfield        #12  <Field azh a>
	// 7744 14470:getfield        #393 <Field int azh.be>
	// 7745 14473:ior             
	// 7746 14474:putfield        #408 <Field int azh.ax>
		abyte0 = ((byte []) (a));
	// 7747 14477:aload_0         
	// 7748 14478:getfield        #12  <Field azh a>
	// 7749 14481:astore_1        
		abyte0.aQ = ((azh) (abyte0)).ai & ~a.aQ;
	// 7750 14482:aload_1         
	// 7751 14483:aload_1         
	// 7752 14484:getfield        #450 <Field int azh.ai>
	// 7753 14487:aload_0         
	// 7754 14488:getfield        #12  <Field azh a>
	// 7755 14491:getfield        #357 <Field int azh.aQ>
	// 7756 14494:iconst_m1       
	// 7757 14495:ixor            
	// 7758 14496:iand            
	// 7759 14497:putfield        #357 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 7760 14500:aload_0         
	// 7761 14501:getfield        #12  <Field azh a>
	// 7762 14504:astore_1        
		abyte0.aQ = ((azh) (abyte0)).bE ^ a.aQ;
	// 7763 14505:aload_1         
	// 7764 14506:aload_1         
	// 7765 14507:getfield        #375 <Field int azh.bE>
	// 7766 14510:aload_0         
	// 7767 14511:getfield        #12  <Field azh a>
	// 7768 14514:getfield        #357 <Field int azh.aQ>
	// 7769 14517:ixor            
	// 7770 14518:putfield        #357 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 7771 14521:aload_0         
	// 7772 14522:getfield        #12  <Field azh a>
	// 7773 14525:astore_1        
		abyte0.bl = ((azh) (abyte0)).ai & ~a.bl;
	// 7774 14526:aload_1         
	// 7775 14527:aload_1         
	// 7776 14528:getfield        #450 <Field int azh.ai>
	// 7777 14531:aload_0         
	// 7778 14532:getfield        #12  <Field azh a>
	// 7779 14535:getfield        #366 <Field int azh.bl>
	// 7780 14538:iconst_m1       
	// 7781 14539:ixor            
	// 7782 14540:iand            
	// 7783 14541:putfield        #366 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 7784 14544:aload_0         
	// 7785 14545:getfield        #12  <Field azh a>
	// 7786 14548:astore_1        
		abyte0.bl = ((azh) (abyte0)).ch ^ a.bl;
	// 7787 14549:aload_1         
	// 7788 14550:aload_1         
	// 7789 14551:getfield        #420 <Field int azh.ch>
	// 7790 14554:aload_0         
	// 7791 14555:getfield        #12  <Field azh a>
	// 7792 14558:getfield        #366 <Field int azh.bl>
	// 7793 14561:ixor            
	// 7794 14562:putfield        #366 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 7795 14565:aload_0         
	// 7796 14566:getfield        #12  <Field azh a>
	// 7797 14569:astore_1        
		abyte0.bl = ((azh) (abyte0)).aa | a.bl;
	// 7798 14570:aload_1         
	// 7799 14571:aload_1         
	// 7800 14572:getfield        #279 <Field int azh.aa>
	// 7801 14575:aload_0         
	// 7802 14576:getfield        #12  <Field azh a>
	// 7803 14579:getfield        #366 <Field int azh.bl>
	// 7804 14582:ior             
	// 7805 14583:putfield        #366 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 7806 14586:aload_0         
	// 7807 14587:getfield        #12  <Field azh a>
	// 7808 14590:astore_1        
		abyte0.ch = ((azh) (abyte0)).w | a.ai;
	// 7809 14591:aload_1         
	// 7810 14592:aload_1         
	// 7811 14593:getfield        #285 <Field int azh.w>
	// 7812 14596:aload_0         
	// 7813 14597:getfield        #12  <Field azh a>
	// 7814 14600:getfield        #450 <Field int azh.ai>
	// 7815 14603:ior             
	// 7816 14604:putfield        #420 <Field int azh.ch>
		abyte0 = ((byte []) (a));
	// 7817 14607:aload_0         
	// 7818 14608:getfield        #12  <Field azh a>
	// 7819 14611:astore_1        
		abyte0.aO = ((azh) (abyte0)).ai & a.aO;
	// 7820 14612:aload_1         
	// 7821 14613:aload_1         
	// 7822 14614:getfield        #450 <Field int azh.ai>
	// 7823 14617:aload_0         
	// 7824 14618:getfield        #12  <Field azh a>
	// 7825 14621:getfield        #387 <Field int azh.aO>
	// 7826 14624:iand            
	// 7827 14625:putfield        #387 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 7828 14628:aload_0         
	// 7829 14629:getfield        #12  <Field azh a>
	// 7830 14632:astore_1        
		abyte0.aO = ((azh) (abyte0)).bv ^ a.aO;
	// 7831 14633:aload_1         
	// 7832 14634:aload_1         
	// 7833 14635:getfield        #411 <Field int azh.bv>
	// 7834 14638:aload_0         
	// 7835 14639:getfield        #12  <Field azh a>
	// 7836 14642:getfield        #387 <Field int azh.aO>
	// 7837 14645:ixor            
	// 7838 14646:putfield        #387 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 7839 14649:aload_0         
	// 7840 14650:getfield        #12  <Field azh a>
	// 7841 14653:astore_1        
		abyte0.at = ((azh) (abyte0)).aO ^ a.at;
	// 7842 14654:aload_1         
	// 7843 14655:aload_1         
	// 7844 14656:getfield        #387 <Field int azh.aO>
	// 7845 14659:aload_0         
	// 7846 14660:getfield        #12  <Field azh a>
	// 7847 14663:getfield        #327 <Field int azh.at>
	// 7848 14666:ixor            
	// 7849 14667:putfield        #327 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 7850 14670:aload_0         
	// 7851 14671:getfield        #12  <Field azh a>
	// 7852 14674:astore_1        
		abyte0.d = ((azh) (abyte0)).at ^ a.d;
	// 7853 14675:aload_1         
	// 7854 14676:aload_1         
	// 7855 14677:getfield        #327 <Field int azh.at>
	// 7856 14680:aload_0         
	// 7857 14681:getfield        #12  <Field azh a>
	// 7858 14684:getfield        #145 <Field int azh.d>
	// 7859 14687:ixor            
	// 7860 14688:putfield        #145 <Field int azh.d>
		abyte0 = ((byte []) (a));
	// 7861 14691:aload_0         
	// 7862 14692:getfield        #12  <Field azh a>
	// 7863 14695:astore_1        
		abyte0.ah = ((azh) (abyte0)).ai & ~a.ah;
	// 7864 14696:aload_1         
	// 7865 14697:aload_1         
	// 7866 14698:getfield        #450 <Field int azh.ai>
	// 7867 14701:aload_0         
	// 7868 14702:getfield        #12  <Field azh a>
	// 7869 14705:getfield        #201 <Field int azh.ah>
	// 7870 14708:iconst_m1       
	// 7871 14709:ixor            
	// 7872 14710:iand            
	// 7873 14711:putfield        #201 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 7874 14714:aload_0         
	// 7875 14715:getfield        #12  <Field azh a>
	// 7876 14718:astore_1        
		abyte0.ah = ((azh) (abyte0)).bw ^ a.ah;
	// 7877 14719:aload_1         
	// 7878 14720:aload_1         
	// 7879 14721:getfield        #399 <Field int azh.bw>
	// 7880 14724:aload_0         
	// 7881 14725:getfield        #12  <Field azh a>
	// 7882 14728:getfield        #201 <Field int azh.ah>
	// 7883 14731:ixor            
	// 7884 14732:putfield        #201 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 7885 14735:aload_0         
	// 7886 14736:getfield        #12  <Field azh a>
	// 7887 14739:astore_1        
		abyte0.bl = ((azh) (abyte0)).ah ^ a.bl;
	// 7888 14740:aload_1         
	// 7889 14741:aload_1         
	// 7890 14742:getfield        #201 <Field int azh.ah>
	// 7891 14745:aload_0         
	// 7892 14746:getfield        #12  <Field azh a>
	// 7893 14749:getfield        #366 <Field int azh.bl>
	// 7894 14752:ixor            
	// 7895 14753:putfield        #366 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 7896 14756:aload_0         
	// 7897 14757:getfield        #12  <Field azh a>
	// 7898 14760:astore_1        
		abyte0.bl = ((azh) (abyte0)).bl ^ a.r;
	// 7899 14761:aload_1         
	// 7900 14762:aload_1         
	// 7901 14763:getfield        #366 <Field int azh.bl>
	// 7902 14766:aload_0         
	// 7903 14767:getfield        #12  <Field azh a>
	// 7904 14770:getfield        #115 <Field int azh.r>
	// 7905 14773:ixor            
	// 7906 14774:putfield        #366 <Field int azh.bl>
		abyte0 = ((byte []) (a));
	// 7907 14777:aload_0         
	// 7908 14778:getfield        #12  <Field azh a>
	// 7909 14781:astore_1        
		abyte0.ah = ((azh) (abyte0)).ai & a.w;
	// 7910 14782:aload_1         
	// 7911 14783:aload_1         
	// 7912 14784:getfield        #450 <Field int azh.ai>
	// 7913 14787:aload_0         
	// 7914 14788:getfield        #12  <Field azh a>
	// 7915 14791:getfield        #285 <Field int azh.w>
	// 7916 14794:iand            
	// 7917 14795:putfield        #201 <Field int azh.ah>
		abyte0 = ((byte []) (a));
	// 7918 14798:aload_0         
	// 7919 14799:getfield        #12  <Field azh a>
	// 7920 14802:astore_1        
		abyte0.bw = ((azh) (abyte0)).w & ~a.ai;
	// 7921 14803:aload_1         
	// 7922 14804:aload_1         
	// 7923 14805:getfield        #285 <Field int azh.w>
	// 7924 14808:aload_0         
	// 7925 14809:getfield        #12  <Field azh a>
	// 7926 14812:getfield        #450 <Field int azh.ai>
	// 7927 14815:iconst_m1       
	// 7928 14816:ixor            
	// 7929 14817:iand            
	// 7930 14818:putfield        #399 <Field int azh.bw>
		abyte0 = ((byte []) (a));
	// 7931 14821:aload_0         
	// 7932 14822:getfield        #12  <Field azh a>
	// 7933 14825:astore_1        
		abyte0.at = ((azh) (abyte0)).M & ~a.bw;
	// 7934 14826:aload_1         
	// 7935 14827:aload_1         
	// 7936 14828:getfield        #417 <Field int azh.M>
	// 7937 14831:aload_0         
	// 7938 14832:getfield        #12  <Field azh a>
	// 7939 14835:getfield        #399 <Field int azh.bw>
	// 7940 14838:iconst_m1       
	// 7941 14839:ixor            
	// 7942 14840:iand            
	// 7943 14841:putfield        #327 <Field int azh.at>
		abyte0 = ((byte []) (a));
	// 7944 14844:aload_0         
	// 7945 14845:getfield        #12  <Field azh a>
	// 7946 14848:astore_1        
		abyte0.aO = ((azh) (abyte0)).w & ~a.bw;
	// 7947 14849:aload_1         
	// 7948 14850:aload_1         
	// 7949 14851:getfield        #285 <Field int azh.w>
	// 7950 14854:aload_0         
	// 7951 14855:getfield        #12  <Field azh a>
	// 7952 14858:getfield        #399 <Field int azh.bw>
	// 7953 14861:iconst_m1       
	// 7954 14862:ixor            
	// 7955 14863:iand            
	// 7956 14864:putfield        #387 <Field int azh.aO>
		abyte0 = ((byte []) (a));
	// 7957 14867:aload_0         
	// 7958 14868:getfield        #12  <Field azh a>
	// 7959 14871:astore_1        
		abyte0.au = ((azh) (abyte0)).ai & a.au;
	// 7960 14872:aload_1         
	// 7961 14873:aload_1         
	// 7962 14874:getfield        #450 <Field int azh.ai>
	// 7963 14877:aload_0         
	// 7964 14878:getfield        #12  <Field azh a>
	// 7965 14881:getfield        #85  <Field int azh.au>
	// 7966 14884:iand            
	// 7967 14885:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 7968 14888:aload_0         
	// 7969 14889:getfield        #12  <Field azh a>
	// 7970 14892:astore_1        
		abyte0.au = ((azh) (abyte0)).bt ^ a.au;
	// 7971 14893:aload_1         
	// 7972 14894:aload_1         
	// 7973 14895:getfield        #213 <Field int azh.bt>
	// 7974 14898:aload_0         
	// 7975 14899:getfield        #12  <Field azh a>
	// 7976 14902:getfield        #85  <Field int azh.au>
	// 7977 14905:ixor            
	// 7978 14906:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 7979 14909:aload_0         
	// 7980 14910:getfield        #12  <Field azh a>
	// 7981 14913:astore_1        
		abyte0.au = ((azh) (abyte0)).aa | a.au;
	// 7982 14914:aload_1         
	// 7983 14915:aload_1         
	// 7984 14916:getfield        #279 <Field int azh.aa>
	// 7985 14919:aload_0         
	// 7986 14920:getfield        #12  <Field azh a>
	// 7987 14923:getfield        #85  <Field int azh.au>
	// 7988 14926:ior             
	// 7989 14927:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 7990 14930:aload_0         
	// 7991 14931:getfield        #12  <Field azh a>
	// 7992 14934:astore_1        
		abyte0.au = ((azh) (abyte0)).aQ ^ a.au;
	// 7993 14935:aload_1         
	// 7994 14936:aload_1         
	// 7995 14937:getfield        #357 <Field int azh.aQ>
	// 7996 14940:aload_0         
	// 7997 14941:getfield        #12  <Field azh a>
	// 7998 14944:getfield        #85  <Field int azh.au>
	// 7999 14947:ixor            
	// 8000 14948:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 8001 14951:aload_0         
	// 8002 14952:getfield        #12  <Field azh a>
	// 8003 14955:astore_1        
		abyte0.x = ((azh) (abyte0)).au ^ a.x;
	// 8004 14956:aload_1         
	// 8005 14957:aload_1         
	// 8006 14958:getfield        #85  <Field int azh.au>
	// 8007 14961:aload_0         
	// 8008 14962:getfield        #12  <Field azh a>
	// 8009 14965:getfield        #336 <Field int azh.x>
	// 8010 14968:ixor            
	// 8011 14969:putfield        #336 <Field int azh.x>
		abyte0 = ((byte []) (a));
	// 8012 14972:aload_0         
	// 8013 14973:getfield        #12  <Field azh a>
	// 8014 14976:astore_1        
		abyte0.ce = ((azh) (abyte0)).ai & a.ce;
	// 8015 14977:aload_1         
	// 8016 14978:aload_1         
	// 8017 14979:getfield        #450 <Field int azh.ai>
	// 8018 14982:aload_0         
	// 8019 14983:getfield        #12  <Field azh a>
	// 8020 14986:getfield        #342 <Field int azh.ce>
	// 8021 14989:iand            
	// 8022 14990:putfield        #342 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 8023 14993:aload_0         
	// 8024 14994:getfield        #12  <Field azh a>
	// 8025 14997:astore_1        
		abyte0.ce = ((azh) (abyte0)).bk ^ a.ce;
	// 8026 14998:aload_1         
	// 8027 14999:aload_1         
	// 8028 15000:getfield        #234 <Field int azh.bk>
	// 8029 15003:aload_0         
	// 8030 15004:getfield        #12  <Field azh a>
	// 8031 15007:getfield        #342 <Field int azh.ce>
	// 8032 15010:ixor            
	// 8033 15011:putfield        #342 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 8034 15014:aload_0         
	// 8035 15015:getfield        #12  <Field azh a>
	// 8036 15018:astore_1        
		abyte0.ce = ((azh) (abyte0)).ce & ~a.aa;
	// 8037 15019:aload_1         
	// 8038 15020:aload_1         
	// 8039 15021:getfield        #342 <Field int azh.ce>
	// 8040 15024:aload_0         
	// 8041 15025:getfield        #12  <Field azh a>
	// 8042 15028:getfield        #279 <Field int azh.aa>
	// 8043 15031:iconst_m1       
	// 8044 15032:ixor            
	// 8045 15033:iand            
	// 8046 15034:putfield        #342 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 8047 15037:aload_0         
	// 8048 15038:getfield        #12  <Field azh a>
	// 8049 15041:astore_1        
		abyte0.ce = ((azh) (abyte0)).by ^ a.ce;
	// 8050 15042:aload_1         
	// 8051 15043:aload_1         
	// 8052 15044:getfield        #354 <Field int azh.by>
	// 8053 15047:aload_0         
	// 8054 15048:getfield        #12  <Field azh a>
	// 8055 15051:getfield        #342 <Field int azh.ce>
	// 8056 15054:ixor            
	// 8057 15055:putfield        #342 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 8058 15058:aload_0         
	// 8059 15059:getfield        #12  <Field azh a>
	// 8060 15062:astore_1        
		abyte0.f = ((azh) (abyte0)).ce ^ a.f;
	// 8061 15063:aload_1         
	// 8062 15064:aload_1         
	// 8063 15065:getfield        #342 <Field int azh.ce>
	// 8064 15068:aload_0         
	// 8065 15069:getfield        #12  <Field azh a>
	// 8066 15072:getfield        #261 <Field int azh.f>
	// 8067 15075:ixor            
	// 8068 15076:putfield        #261 <Field int azh.f>
		abyte0 = ((byte []) (a));
	// 8069 15079:aload_0         
	// 8070 15080:getfield        #12  <Field azh a>
	// 8071 15083:astore_1        
		abyte0.ce = ((azh) (abyte0)).ai ^ a.w;
	// 8072 15084:aload_1         
	// 8073 15085:aload_1         
	// 8074 15086:getfield        #450 <Field int azh.ai>
	// 8075 15089:aload_0         
	// 8076 15090:getfield        #12  <Field azh a>
	// 8077 15093:getfield        #285 <Field int azh.w>
	// 8078 15096:ixor            
	// 8079 15097:putfield        #342 <Field int azh.ce>
		abyte0 = ((byte []) (a));
	// 8080 15100:aload_0         
	// 8081 15101:getfield        #12  <Field azh a>
	// 8082 15104:astore_1        
		abyte0.bx = ((azh) (abyte0)).b | a.bx;
	// 8083 15105:aload_1         
	// 8084 15106:aload_1         
	// 8085 15107:getfield        #438 <Field int azh.b>
	// 8086 15110:aload_0         
	// 8087 15111:getfield        #12  <Field azh a>
	// 8088 15114:getfield        #453 <Field int azh.bx>
	// 8089 15117:ior             
	// 8090 15118:putfield        #453 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 8091 15121:aload_0         
	// 8092 15122:getfield        #12  <Field azh a>
	// 8093 15125:astore_1        
		abyte0.bx = ((azh) (abyte0)).aC ^ a.bx;
	// 8094 15126:aload_1         
	// 8095 15127:aload_1         
	// 8096 15128:getfield        #456 <Field int azh.aC>
	// 8097 15131:aload_0         
	// 8098 15132:getfield        #12  <Field azh a>
	// 8099 15135:getfield        #453 <Field int azh.bx>
	// 8100 15138:ixor            
	// 8101 15139:putfield        #453 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 8102 15142:aload_0         
	// 8103 15143:getfield        #12  <Field azh a>
	// 8104 15146:astore_1        
		abyte0.k = ((azh) (abyte0)).bx ^ a.k;
	// 8105 15147:aload_1         
	// 8106 15148:aload_1         
	// 8107 15149:getfield        #453 <Field int azh.bx>
	// 8108 15152:aload_0         
	// 8109 15153:getfield        #12  <Field azh a>
	// 8110 15156:getfield        #459 <Field int azh.k>
	// 8111 15159:ixor            
	// 8112 15160:putfield        #459 <Field int azh.k>
		abyte0 = ((byte []) (a));
	// 8113 15163:aload_0         
	// 8114 15164:getfield        #12  <Field azh a>
	// 8115 15167:astore_1        
		abyte0.bx = ((azh) (abyte0)).b & ~a.z;
	// 8116 15168:aload_1         
	// 8117 15169:aload_1         
	// 8118 15170:getfield        #438 <Field int azh.b>
	// 8119 15173:aload_0         
	// 8120 15174:getfield        #12  <Field azh a>
	// 8121 15177:getfield        #112 <Field int azh.z>
	// 8122 15180:iconst_m1       
	// 8123 15181:ixor            
	// 8124 15182:iand            
	// 8125 15183:putfield        #453 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 8126 15186:aload_0         
	// 8127 15187:getfield        #12  <Field azh a>
	// 8128 15190:astore_1        
		abyte0.bx = ((azh) (abyte0)).r ^ a.bx;
	// 8129 15191:aload_1         
	// 8130 15192:aload_1         
	// 8131 15193:getfield        #115 <Field int azh.r>
	// 8132 15196:aload_0         
	// 8133 15197:getfield        #12  <Field azh a>
	// 8134 15200:getfield        #453 <Field int azh.bx>
	// 8135 15203:ixor            
	// 8136 15204:putfield        #453 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 8137 15207:aload_0         
	// 8138 15208:getfield        #12  <Field azh a>
	// 8139 15211:astore_1        
		abyte0.av = ((azh) (abyte0)).bx ^ a.av;
	// 8140 15212:aload_1         
	// 8141 15213:aload_1         
	// 8142 15214:getfield        #453 <Field int azh.bx>
	// 8143 15217:aload_0         
	// 8144 15218:getfield        #12  <Field azh a>
	// 8145 15221:getfield        #106 <Field int azh.av>
	// 8146 15224:ixor            
	// 8147 15225:putfield        #106 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 8148 15228:aload_0         
	// 8149 15229:getfield        #12  <Field azh a>
	// 8150 15232:astore_1        
		abyte0.bx = ((azh) (abyte0)).z | a.b;
	// 8151 15233:aload_1         
	// 8152 15234:aload_1         
	// 8153 15235:getfield        #112 <Field int azh.z>
	// 8154 15238:aload_0         
	// 8155 15239:getfield        #12  <Field azh a>
	// 8156 15242:getfield        #438 <Field int azh.b>
	// 8157 15245:ior             
	// 8158 15246:putfield        #453 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 8159 15249:aload_0         
	// 8160 15250:getfield        #12  <Field azh a>
	// 8161 15253:astore_1        
		abyte0.bx = ((azh) (abyte0)).b ^ a.bx;
	// 8162 15254:aload_1         
	// 8163 15255:aload_1         
	// 8164 15256:getfield        #438 <Field int azh.b>
	// 8165 15259:aload_0         
	// 8166 15260:getfield        #12  <Field azh a>
	// 8167 15263:getfield        #453 <Field int azh.bx>
	// 8168 15266:ixor            
	// 8169 15267:putfield        #453 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 8170 15270:aload_0         
	// 8171 15271:getfield        #12  <Field azh a>
	// 8172 15274:astore_1        
		abyte0.aC = ((azh) (abyte0)).H & ~a.bx;
	// 8173 15275:aload_1         
	// 8174 15276:aload_1         
	// 8175 15277:getfield        #118 <Field int azh.H>
	// 8176 15280:aload_0         
	// 8177 15281:getfield        #12  <Field azh a>
	// 8178 15284:getfield        #453 <Field int azh.bx>
	// 8179 15287:iconst_m1       
	// 8180 15288:ixor            
	// 8181 15289:iand            
	// 8182 15290:putfield        #456 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 8183 15293:aload_0         
	// 8184 15294:getfield        #12  <Field azh a>
	// 8185 15297:astore_1        
		abyte0.aC = ((azh) (abyte0)).ar ^ a.aC;
	// 8186 15298:aload_1         
	// 8187 15299:aload_1         
	// 8188 15300:getfield        #435 <Field int azh.ar>
	// 8189 15303:aload_0         
	// 8190 15304:getfield        #12  <Field azh a>
	// 8191 15307:getfield        #456 <Field int azh.aC>
	// 8192 15310:ixor            
	// 8193 15311:putfield        #456 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 8194 15314:aload_0         
	// 8195 15315:getfield        #12  <Field azh a>
	// 8196 15318:astore_1        
		abyte0.aC = ((azh) (abyte0)).j | a.aC;
	// 8197 15319:aload_1         
	// 8198 15320:aload_1         
	// 8199 15321:getfield        #121 <Field int azh.j>
	// 8200 15324:aload_0         
	// 8201 15325:getfield        #12  <Field azh a>
	// 8202 15328:getfield        #456 <Field int azh.aC>
	// 8203 15331:ior             
	// 8204 15332:putfield        #456 <Field int azh.aC>
		abyte0 = ((byte []) (a));
	// 8205 15335:aload_0         
	// 8206 15336:getfield        #12  <Field azh a>
	// 8207 15339:astore_1        
		abyte0.bH = ((azh) (abyte0)).b | a.bH;
	// 8208 15340:aload_1         
	// 8209 15341:aload_1         
	// 8210 15342:getfield        #438 <Field int azh.b>
	// 8211 15345:aload_0         
	// 8212 15346:getfield        #12  <Field azh a>
	// 8213 15349:getfield        #462 <Field int azh.bH>
	// 8214 15352:ior             
	// 8215 15353:putfield        #462 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 8216 15356:aload_0         
	// 8217 15357:getfield        #12  <Field azh a>
	// 8218 15360:astore_1        
		abyte0.bH = ((azh) (abyte0)).bW ^ a.bH;
	// 8219 15361:aload_1         
	// 8220 15362:aload_1         
	// 8221 15363:getfield        #465 <Field int azh.bW>
	// 8222 15366:aload_0         
	// 8223 15367:getfield        #12  <Field azh a>
	// 8224 15370:getfield        #462 <Field int azh.bH>
	// 8225 15373:ixor            
	// 8226 15374:putfield        #462 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 8227 15377:aload_0         
	// 8228 15378:getfield        #12  <Field azh a>
	// 8229 15381:astore_1        
		abyte0.i = ((azh) (abyte0)).bH ^ a.i;
	// 8230 15382:aload_1         
	// 8231 15383:aload_1         
	// 8232 15384:getfield        #462 <Field int azh.bH>
	// 8233 15387:aload_0         
	// 8234 15388:getfield        #12  <Field azh a>
	// 8235 15391:getfield        #468 <Field int azh.i>
	// 8236 15394:ixor            
	// 8237 15395:putfield        #468 <Field int azh.i>
		abyte0 = ((byte []) (a));
	// 8238 15398:aload_0         
	// 8239 15399:getfield        #12  <Field azh a>
	// 8240 15402:astore_1        
		abyte0.bV = ((azh) (abyte0)).i & a.bV;
	// 8241 15403:aload_1         
	// 8242 15404:aload_1         
	// 8243 15405:getfield        #468 <Field int azh.i>
	// 8244 15408:aload_0         
	// 8245 15409:getfield        #12  <Field azh a>
	// 8246 15412:getfield        #324 <Field int azh.bV>
	// 8247 15415:iand            
	// 8248 15416:putfield        #324 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 8249 15419:aload_0         
	// 8250 15420:getfield        #12  <Field azh a>
	// 8251 15423:astore_1        
		abyte0.bV = ((azh) (abyte0)).bm ^ a.bV;
	// 8252 15424:aload_1         
	// 8253 15425:aload_1         
	// 8254 15426:getfield        #390 <Field int azh.bm>
	// 8255 15429:aload_0         
	// 8256 15430:getfield        #12  <Field azh a>
	// 8257 15433:getfield        #324 <Field int azh.bV>
	// 8258 15436:ixor            
	// 8259 15437:putfield        #324 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 8260 15440:aload_0         
	// 8261 15441:getfield        #12  <Field azh a>
	// 8262 15444:astore_1        
		abyte0.bV = ((azh) (abyte0)).ak & a.bV;
	// 8263 15445:aload_1         
	// 8264 15446:aload_1         
	// 8265 15447:getfield        #282 <Field int azh.ak>
	// 8266 15450:aload_0         
	// 8267 15451:getfield        #12  <Field azh a>
	// 8268 15454:getfield        #324 <Field int azh.bV>
	// 8269 15457:iand            
	// 8270 15458:putfield        #324 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 8271 15461:aload_0         
	// 8272 15462:getfield        #12  <Field azh a>
	// 8273 15465:astore_1        
		abyte0.cb = ((azh) (abyte0)).i & a.cb;
	// 8274 15466:aload_1         
	// 8275 15467:aload_1         
	// 8276 15468:getfield        #468 <Field int azh.i>
	// 8277 15471:aload_0         
	// 8278 15472:getfield        #12  <Field azh a>
	// 8279 15475:getfield        #240 <Field int azh.cb>
	// 8280 15478:iand            
	// 8281 15479:putfield        #240 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 8282 15482:aload_0         
	// 8283 15483:getfield        #12  <Field azh a>
	// 8284 15486:astore_1        
		abyte0.cb = ((azh) (abyte0)).aB ^ a.cb;
	// 8285 15487:aload_1         
	// 8286 15488:aload_1         
	// 8287 15489:getfield        #339 <Field int azh.aB>
	// 8288 15492:aload_0         
	// 8289 15493:getfield        #12  <Field azh a>
	// 8290 15496:getfield        #240 <Field int azh.cb>
	// 8291 15499:ixor            
	// 8292 15500:putfield        #240 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 8293 15503:aload_0         
	// 8294 15504:getfield        #12  <Field azh a>
	// 8295 15507:astore_1        
		abyte0.cb = ((azh) (abyte0)).cb | a.ak;
	// 8296 15508:aload_1         
	// 8297 15509:aload_1         
	// 8298 15510:getfield        #240 <Field int azh.cb>
	// 8299 15513:aload_0         
	// 8300 15514:getfield        #12  <Field azh a>
	// 8301 15517:getfield        #282 <Field int azh.ak>
	// 8302 15520:ior             
	// 8303 15521:putfield        #240 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 8304 15524:aload_0         
	// 8305 15525:getfield        #12  <Field azh a>
	// 8306 15528:astore_1        
		abyte0.ay = ((azh) (abyte0)).i & a.ay;
	// 8307 15529:aload_1         
	// 8308 15530:aload_1         
	// 8309 15531:getfield        #468 <Field int azh.i>
	// 8310 15534:aload_0         
	// 8311 15535:getfield        #12  <Field azh a>
	// 8312 15538:getfield        #345 <Field int azh.ay>
	// 8313 15541:iand            
	// 8314 15542:putfield        #345 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 8315 15545:aload_0         
	// 8316 15546:getfield        #12  <Field azh a>
	// 8317 15549:astore_1        
		abyte0.ay = ((azh) (abyte0)).bJ ^ a.ay;
	// 8318 15550:aload_1         
	// 8319 15551:aload_1         
	// 8320 15552:getfield        #53  <Field int azh.bJ>
	// 8321 15555:aload_0         
	// 8322 15556:getfield        #12  <Field azh a>
	// 8323 15559:getfield        #345 <Field int azh.ay>
	// 8324 15562:ixor            
	// 8325 15563:putfield        #345 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 8326 15566:aload_0         
	// 8327 15567:getfield        #12  <Field azh a>
	// 8328 15570:astore_1        
		abyte0.ay = ((azh) (abyte0)).ak | a.ay;
	// 8329 15571:aload_1         
	// 8330 15572:aload_1         
	// 8331 15573:getfield        #282 <Field int azh.ak>
	// 8332 15576:aload_0         
	// 8333 15577:getfield        #12  <Field azh a>
	// 8334 15580:getfield        #345 <Field int azh.ay>
	// 8335 15583:ior             
	// 8336 15584:putfield        #345 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 8337 15587:aload_0         
	// 8338 15588:getfield        #12  <Field azh a>
	// 8339 15591:astore_1        
		abyte0.bq = ((azh) (abyte0)).i & a.bq;
	// 8340 15592:aload_1         
	// 8341 15593:aload_1         
	// 8342 15594:getfield        #468 <Field int azh.i>
	// 8343 15597:aload_0         
	// 8344 15598:getfield        #12  <Field azh a>
	// 8345 15601:getfield        #270 <Field int azh.bq>
	// 8346 15604:iand            
	// 8347 15605:putfield        #270 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 8348 15608:aload_0         
	// 8349 15609:getfield        #12  <Field azh a>
	// 8350 15612:astore_1        
		abyte0.bq = ((azh) (abyte0)).aN ^ a.bq;
	// 8351 15613:aload_1         
	// 8352 15614:aload_1         
	// 8353 15615:getfield        #384 <Field int azh.aN>
	// 8354 15618:aload_0         
	// 8355 15619:getfield        #12  <Field azh a>
	// 8356 15622:getfield        #270 <Field int azh.bq>
	// 8357 15625:ixor            
	// 8358 15626:putfield        #270 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 8359 15629:aload_0         
	// 8360 15630:getfield        #12  <Field azh a>
	// 8361 15633:astore_1        
		abyte0.bq = ((azh) (abyte0)).bq & ~a.ak;
	// 8362 15634:aload_1         
	// 8363 15635:aload_1         
	// 8364 15636:getfield        #270 <Field int azh.bq>
	// 8365 15639:aload_0         
	// 8366 15640:getfield        #12  <Field azh a>
	// 8367 15643:getfield        #282 <Field int azh.ak>
	// 8368 15646:iconst_m1       
	// 8369 15647:ixor            
	// 8370 15648:iand            
	// 8371 15649:putfield        #270 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 8372 15652:aload_0         
	// 8373 15653:getfield        #12  <Field azh a>
	// 8374 15656:astore_1        
		abyte0.cf = ((azh) (abyte0)).i & a.cf;
	// 8375 15657:aload_1         
	// 8376 15658:aload_1         
	// 8377 15659:getfield        #468 <Field int azh.i>
	// 8378 15662:aload_0         
	// 8379 15663:getfield        #12  <Field azh a>
	// 8380 15666:getfield        #405 <Field int azh.cf>
	// 8381 15669:iand            
	// 8382 15670:putfield        #405 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 8383 15673:aload_0         
	// 8384 15674:getfield        #12  <Field azh a>
	// 8385 15677:astore_1        
		abyte0.cf = ((azh) (abyte0)).bj ^ a.cf;
	// 8386 15678:aload_1         
	// 8387 15679:aload_1         
	// 8388 15680:getfield        #297 <Field int azh.bj>
	// 8389 15683:aload_0         
	// 8390 15684:getfield        #12  <Field azh a>
	// 8391 15687:getfield        #405 <Field int azh.cf>
	// 8392 15690:ixor            
	// 8393 15691:putfield        #405 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 8394 15694:aload_0         
	// 8395 15695:getfield        #12  <Field azh a>
	// 8396 15698:astore_1        
		abyte0.ay = ((azh) (abyte0)).cf ^ a.ay;
	// 8397 15699:aload_1         
	// 8398 15700:aload_1         
	// 8399 15701:getfield        #405 <Field int azh.cf>
	// 8400 15704:aload_0         
	// 8401 15705:getfield        #12  <Field azh a>
	// 8402 15708:getfield        #345 <Field int azh.ay>
	// 8403 15711:ixor            
	// 8404 15712:putfield        #345 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 8405 15715:aload_0         
	// 8406 15716:getfield        #12  <Field azh a>
	// 8407 15719:astore_1        
		abyte0.P = ((azh) (abyte0)).ay ^ a.P;
	// 8408 15720:aload_1         
	// 8409 15721:aload_1         
	// 8410 15722:getfield        #345 <Field int azh.ay>
	// 8411 15725:aload_0         
	// 8412 15726:getfield        #12  <Field azh a>
	// 8413 15729:getfield        #139 <Field int azh.P>
	// 8414 15732:ixor            
	// 8415 15733:putfield        #139 <Field int azh.P>
		abyte0 = ((byte []) (a));
	// 8416 15736:aload_0         
	// 8417 15737:getfield        #12  <Field azh a>
	// 8418 15740:astore_1        
		abyte0.ci = ((azh) (abyte0)).i & ~a.ci;
	// 8419 15741:aload_1         
	// 8420 15742:aload_1         
	// 8421 15743:getfield        #468 <Field int azh.i>
	// 8422 15746:aload_0         
	// 8423 15747:getfield        #12  <Field azh a>
	// 8424 15750:getfield        #71  <Field int azh.ci>
	// 8425 15753:iconst_m1       
	// 8426 15754:ixor            
	// 8427 15755:iand            
	// 8428 15756:putfield        #71  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 8429 15759:aload_0         
	// 8430 15760:getfield        #12  <Field azh a>
	// 8431 15763:astore_1        
		abyte0.ci = ((azh) (abyte0)).bM ^ a.ci;
	// 8432 15764:aload_1         
	// 8433 15765:aload_1         
	// 8434 15766:getfield        #351 <Field int azh.bM>
	// 8435 15769:aload_0         
	// 8436 15770:getfield        #12  <Field azh a>
	// 8437 15773:getfield        #71  <Field int azh.ci>
	// 8438 15776:ixor            
	// 8439 15777:putfield        #71  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 8440 15780:aload_0         
	// 8441 15781:getfield        #12  <Field azh a>
	// 8442 15784:astore_1        
		abyte0.cb = ((azh) (abyte0)).ci ^ a.cb;
	// 8443 15785:aload_1         
	// 8444 15786:aload_1         
	// 8445 15787:getfield        #71  <Field int azh.ci>
	// 8446 15790:aload_0         
	// 8447 15791:getfield        #12  <Field azh a>
	// 8448 15794:getfield        #240 <Field int azh.cb>
	// 8449 15797:ixor            
	// 8450 15798:putfield        #240 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 8451 15801:aload_0         
	// 8452 15802:getfield        #12  <Field azh a>
	// 8453 15805:astore_1        
		abyte0.B = ((azh) (abyte0)).cb ^ a.B;
	// 8454 15806:aload_1         
	// 8455 15807:aload_1         
	// 8456 15808:getfield        #240 <Field int azh.cb>
	// 8457 15811:aload_0         
	// 8458 15812:getfield        #12  <Field azh a>
	// 8459 15815:getfield        #402 <Field int azh.B>
	// 8460 15818:ixor            
	// 8461 15819:putfield        #402 <Field int azh.B>
		abyte0 = ((byte []) (a));
	// 8462 15822:aload_0         
	// 8463 15823:getfield        #12  <Field azh a>
	// 8464 15826:astore_1        
		abyte0.cb = ((azh) (abyte0)).f & ~a.B;
	// 8465 15827:aload_1         
	// 8466 15828:aload_1         
	// 8467 15829:getfield        #261 <Field int azh.f>
	// 8468 15832:aload_0         
	// 8469 15833:getfield        #12  <Field azh a>
	// 8470 15836:getfield        #402 <Field int azh.B>
	// 8471 15839:iconst_m1       
	// 8472 15840:ixor            
	// 8473 15841:iand            
	// 8474 15842:putfield        #240 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 8475 15845:aload_0         
	// 8476 15846:getfield        #12  <Field azh a>
	// 8477 15849:astore_1        
		abyte0.cb = ((azh) (abyte0)).f ^ a.cb;
	// 8478 15850:aload_1         
	// 8479 15851:aload_1         
	// 8480 15852:getfield        #261 <Field int azh.f>
	// 8481 15855:aload_0         
	// 8482 15856:getfield        #12  <Field azh a>
	// 8483 15859:getfield        #240 <Field int azh.cb>
	// 8484 15862:ixor            
	// 8485 15863:putfield        #240 <Field int azh.cb>
		abyte0 = ((byte []) (a));
	// 8486 15866:aload_0         
	// 8487 15867:getfield        #12  <Field azh a>
	// 8488 15870:astore_1        
		abyte0.bM = ((azh) (abyte0)).B | a.f;
	// 8489 15871:aload_1         
	// 8490 15872:aload_1         
	// 8491 15873:getfield        #402 <Field int azh.B>
	// 8492 15876:aload_0         
	// 8493 15877:getfield        #12  <Field azh a>
	// 8494 15880:getfield        #261 <Field int azh.f>
	// 8495 15883:ior             
	// 8496 15884:putfield        #351 <Field int azh.bM>
		abyte0 = ((byte []) (a));
	// 8497 15887:aload_0         
	// 8498 15888:getfield        #12  <Field azh a>
	// 8499 15891:astore_1        
		abyte0.ay = ((azh) (abyte0)).f ^ a.B;
	// 8500 15892:aload_1         
	// 8501 15893:aload_1         
	// 8502 15894:getfield        #261 <Field int azh.f>
	// 8503 15897:aload_0         
	// 8504 15898:getfield        #12  <Field azh a>
	// 8505 15901:getfield        #402 <Field int azh.B>
	// 8506 15904:ixor            
	// 8507 15905:putfield        #345 <Field int azh.ay>
		abyte0 = ((byte []) (a));
	// 8508 15908:aload_0         
	// 8509 15909:getfield        #12  <Field azh a>
	// 8510 15912:astore_1        
		abyte0.cf = ((azh) (abyte0)).f & ~a.B;
	// 8511 15913:aload_1         
	// 8512 15914:aload_1         
	// 8513 15915:getfield        #261 <Field int azh.f>
	// 8514 15918:aload_0         
	// 8515 15919:getfield        #12  <Field azh a>
	// 8516 15922:getfield        #402 <Field int azh.B>
	// 8517 15925:iconst_m1       
	// 8518 15926:ixor            
	// 8519 15927:iand            
	// 8520 15928:putfield        #405 <Field int azh.cf>
		abyte0 = ((byte []) (a));
	// 8521 15931:aload_0         
	// 8522 15932:getfield        #12  <Field azh a>
	// 8523 15935:astore_1        
		abyte0.bV = ((azh) (abyte0)).ci ^ a.bV;
	// 8524 15936:aload_1         
	// 8525 15937:aload_1         
	// 8526 15938:getfield        #71  <Field int azh.ci>
	// 8527 15941:aload_0         
	// 8528 15942:getfield        #12  <Field azh a>
	// 8529 15945:getfield        #324 <Field int azh.bV>
	// 8530 15948:ixor            
	// 8531 15949:putfield        #324 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 8532 15952:aload_0         
	// 8533 15953:getfield        #12  <Field azh a>
	// 8534 15956:astore_1        
		abyte0.F = ((azh) (abyte0)).bV ^ a.F;
	// 8535 15957:aload_1         
	// 8536 15958:aload_1         
	// 8537 15959:getfield        #324 <Field int azh.bV>
	// 8538 15962:aload_0         
	// 8539 15963:getfield        #12  <Field azh a>
	// 8540 15966:getfield        #321 <Field int azh.F>
	// 8541 15969:ixor            
	// 8542 15970:putfield        #321 <Field int azh.F>
		abyte0 = ((byte []) (a));
	// 8543 15973:aload_0         
	// 8544 15974:getfield        #12  <Field azh a>
	// 8545 15977:astore_1        
		abyte0.bg = ((azh) (abyte0)).i & a.bg;
	// 8546 15978:aload_1         
	// 8547 15979:aload_1         
	// 8548 15980:getfield        #468 <Field int azh.i>
	// 8549 15983:aload_0         
	// 8550 15984:getfield        #12  <Field azh a>
	// 8551 15987:getfield        #312 <Field int azh.bg>
	// 8552 15990:iand            
	// 8553 15991:putfield        #312 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 8554 15994:aload_0         
	// 8555 15995:getfield        #12  <Field azh a>
	// 8556 15998:astore_1        
		abyte0.bg = ((azh) (abyte0)).bU ^ a.bg;
	// 8557 15999:aload_1         
	// 8558 16000:aload_1         
	// 8559 16001:getfield        #216 <Field int azh.bU>
	// 8560 16004:aload_0         
	// 8561 16005:getfield        #12  <Field azh a>
	// 8562 16008:getfield        #312 <Field int azh.bg>
	// 8563 16011:ixor            
	// 8564 16012:putfield        #312 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 8565 16015:aload_0         
	// 8566 16016:getfield        #12  <Field azh a>
	// 8567 16019:astore_1        
		abyte0.bq = ((azh) (abyte0)).bg ^ a.bq;
	// 8568 16020:aload_1         
	// 8569 16021:aload_1         
	// 8570 16022:getfield        #312 <Field int azh.bg>
	// 8571 16025:aload_0         
	// 8572 16026:getfield        #12  <Field azh a>
	// 8573 16029:getfield        #270 <Field int azh.bq>
	// 8574 16032:ixor            
	// 8575 16033:putfield        #270 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 8576 16036:aload_0         
	// 8577 16037:getfield        #12  <Field azh a>
	// 8578 16040:astore_1        
		abyte0.aG = ((azh) (abyte0)).bq ^ a.aG;
	// 8579 16041:aload_1         
	// 8580 16042:aload_1         
	// 8581 16043:getfield        #270 <Field int azh.bq>
	// 8582 16046:aload_0         
	// 8583 16047:getfield        #12  <Field azh a>
	// 8584 16050:getfield        #267 <Field int azh.aG>
	// 8585 16053:ixor            
	// 8586 16054:putfield        #267 <Field int azh.aG>
		abyte0 = ((byte []) (a));
	// 8587 16057:aload_0         
	// 8588 16058:getfield        #12  <Field azh a>
	// 8589 16061:astore_1        
		abyte0.bq = ((azh) (abyte0)).f | a.aG;
	// 8590 16062:aload_1         
	// 8591 16063:aload_1         
	// 8592 16064:getfield        #261 <Field int azh.f>
	// 8593 16067:aload_0         
	// 8594 16068:getfield        #12  <Field azh a>
	// 8595 16071:getfield        #267 <Field int azh.aG>
	// 8596 16074:ior             
	// 8597 16075:putfield        #270 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 8598 16078:aload_0         
	// 8599 16079:getfield        #12  <Field azh a>
	// 8600 16082:astore_1        
		abyte0.bg = ((azh) (abyte0)).f & ~a.aG;
	// 8601 16083:aload_1         
	// 8602 16084:aload_1         
	// 8603 16085:getfield        #261 <Field int azh.f>
	// 8604 16088:aload_0         
	// 8605 16089:getfield        #12  <Field azh a>
	// 8606 16092:getfield        #267 <Field int azh.aG>
	// 8607 16095:iconst_m1       
	// 8608 16096:ixor            
	// 8609 16097:iand            
	// 8610 16098:putfield        #312 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 8611 16101:aload_0         
	// 8612 16102:getfield        #12  <Field azh a>
	// 8613 16105:astore_1        
		abyte0.am = ((azh) (abyte0)).am & ~a.b;
	// 8614 16106:aload_1         
	// 8615 16107:aload_1         
	// 8616 16108:getfield        #471 <Field int azh.am>
	// 8617 16111:aload_0         
	// 8618 16112:getfield        #12  <Field azh a>
	// 8619 16115:getfield        #438 <Field int azh.b>
	// 8620 16118:iconst_m1       
	// 8621 16119:ixor            
	// 8622 16120:iand            
	// 8623 16121:putfield        #471 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 8624 16124:aload_0         
	// 8625 16125:getfield        #12  <Field azh a>
	// 8626 16128:astore_1        
		abyte0.am = ((azh) (abyte0)).bP ^ a.am;
	// 8627 16129:aload_1         
	// 8628 16130:aload_1         
	// 8629 16131:getfield        #474 <Field int azh.bP>
	// 8630 16134:aload_0         
	// 8631 16135:getfield        #12  <Field azh a>
	// 8632 16138:getfield        #471 <Field int azh.am>
	// 8633 16141:ixor            
	// 8634 16142:putfield        #471 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 8635 16145:aload_0         
	// 8636 16146:getfield        #12  <Field azh a>
	// 8637 16149:astore_1        
		abyte0.ag = ((azh) (abyte0)).am ^ a.ag;
	// 8638 16150:aload_1         
	// 8639 16151:aload_1         
	// 8640 16152:getfield        #471 <Field int azh.am>
	// 8641 16155:aload_0         
	// 8642 16156:getfield        #12  <Field azh a>
	// 8643 16159:getfield        #477 <Field int azh.ag>
	// 8644 16162:ixor            
	// 8645 16163:putfield        #477 <Field int azh.ag>
		abyte0 = ((byte []) (a));
	// 8646 16166:aload_0         
	// 8647 16167:getfield        #12  <Field azh a>
	// 8648 16170:astore_1        
		abyte0.am = ((azh) (abyte0)).Q & a.ag;
	// 8649 16171:aload_1         
	// 8650 16172:aload_1         
	// 8651 16173:getfield        #414 <Field int azh.Q>
	// 8652 16176:aload_0         
	// 8653 16177:getfield        #12  <Field azh a>
	// 8654 16180:getfield        #477 <Field int azh.ag>
	// 8655 16183:iand            
	// 8656 16184:putfield        #471 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 8657 16187:aload_0         
	// 8658 16188:getfield        #12  <Field azh a>
	// 8659 16191:astore_1        
		abyte0.bP = ((azh) (abyte0)).I ^ a.ag;
	// 8660 16192:aload_1         
	// 8661 16193:aload_1         
	// 8662 16194:getfield        #79  <Field int azh.I>
	// 8663 16197:aload_0         
	// 8664 16198:getfield        #12  <Field azh a>
	// 8665 16201:getfield        #477 <Field int azh.ag>
	// 8666 16204:ixor            
	// 8667 16205:putfield        #474 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 8668 16208:aload_0         
	// 8669 16209:getfield        #12  <Field azh a>
	// 8670 16212:astore_1        
		abyte0.bU = ((azh) (abyte0)).Q & a.bP;
	// 8671 16213:aload_1         
	// 8672 16214:aload_1         
	// 8673 16215:getfield        #414 <Field int azh.Q>
	// 8674 16218:aload_0         
	// 8675 16219:getfield        #12  <Field azh a>
	// 8676 16222:getfield        #474 <Field int azh.bP>
	// 8677 16225:iand            
	// 8678 16226:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 8679 16229:aload_0         
	// 8680 16230:getfield        #12  <Field azh a>
	// 8681 16233:astore_1        
		abyte0.bV = ((azh) (abyte0)).I & ~a.ag;
	// 8682 16234:aload_1         
	// 8683 16235:aload_1         
	// 8684 16236:getfield        #79  <Field int azh.I>
	// 8685 16239:aload_0         
	// 8686 16240:getfield        #12  <Field azh a>
	// 8687 16243:getfield        #477 <Field int azh.ag>
	// 8688 16246:iconst_m1       
	// 8689 16247:ixor            
	// 8690 16248:iand            
	// 8691 16249:putfield        #324 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 8692 16252:aload_0         
	// 8693 16253:getfield        #12  <Field azh a>
	// 8694 16256:astore_1        
		abyte0.ci = ((azh) (abyte0)).ag | a.bV;
	// 8695 16257:aload_1         
	// 8696 16258:aload_1         
	// 8697 16259:getfield        #477 <Field int azh.ag>
	// 8698 16262:aload_0         
	// 8699 16263:getfield        #12  <Field azh a>
	// 8700 16266:getfield        #324 <Field int azh.bV>
	// 8701 16269:ior             
	// 8702 16270:putfield        #71  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 8703 16273:aload_0         
	// 8704 16274:getfield        #12  <Field azh a>
	// 8705 16277:astore_1        
		abyte0.bj = ((azh) (abyte0)).I | a.ag;
	// 8706 16278:aload_1         
	// 8707 16279:aload_1         
	// 8708 16280:getfield        #79  <Field int azh.I>
	// 8709 16283:aload_0         
	// 8710 16284:getfield        #12  <Field azh a>
	// 8711 16287:getfield        #477 <Field int azh.ag>
	// 8712 16290:ior             
	// 8713 16291:putfield        #297 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 8714 16294:aload_0         
	// 8715 16295:getfield        #12  <Field azh a>
	// 8716 16298:astore_1        
		abyte0.aN = ((azh) (abyte0)).ag & ~a.I;
	// 8717 16299:aload_1         
	// 8718 16300:aload_1         
	// 8719 16301:getfield        #477 <Field int azh.ag>
	// 8720 16304:aload_0         
	// 8721 16305:getfield        #12  <Field azh a>
	// 8722 16308:getfield        #79  <Field int azh.I>
	// 8723 16311:iconst_m1       
	// 8724 16312:ixor            
	// 8725 16313:iand            
	// 8726 16314:putfield        #384 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 8727 16317:aload_0         
	// 8728 16318:getfield        #12  <Field azh a>
	// 8729 16321:astore_1        
		abyte0.bJ = ((azh) (abyte0)).ag & ~a.aN;
	// 8730 16322:aload_1         
	// 8731 16323:aload_1         
	// 8732 16324:getfield        #477 <Field int azh.ag>
	// 8733 16327:aload_0         
	// 8734 16328:getfield        #12  <Field azh a>
	// 8735 16331:getfield        #384 <Field int azh.aN>
	// 8736 16334:iconst_m1       
	// 8737 16335:ixor            
	// 8738 16336:iand            
	// 8739 16337:putfield        #53  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 8740 16340:aload_0         
	// 8741 16341:getfield        #12  <Field azh a>
	// 8742 16344:astore_1        
		abyte0.aB = ((azh) (abyte0)).Y & ~a.aN;
	// 8743 16345:aload_1         
	// 8744 16346:aload_1         
	// 8745 16347:getfield        #91  <Field int azh.Y>
	// 8746 16350:aload_0         
	// 8747 16351:getfield        #12  <Field azh a>
	// 8748 16354:getfield        #384 <Field int azh.aN>
	// 8749 16357:iconst_m1       
	// 8750 16358:ixor            
	// 8751 16359:iand            
	// 8752 16360:putfield        #339 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 8753 16363:aload_0         
	// 8754 16364:getfield        #12  <Field azh a>
	// 8755 16367:astore_1        
		abyte0.bm = ((azh) (abyte0)).b & ~a.z;
	// 8756 16368:aload_1         
	// 8757 16369:aload_1         
	// 8758 16370:getfield        #438 <Field int azh.b>
	// 8759 16373:aload_0         
	// 8760 16374:getfield        #12  <Field azh a>
	// 8761 16377:getfield        #112 <Field int azh.z>
	// 8762 16380:iconst_m1       
	// 8763 16381:ixor            
	// 8764 16382:iand            
	// 8765 16383:putfield        #390 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 8766 16386:aload_0         
	// 8767 16387:getfield        #12  <Field azh a>
	// 8768 16390:astore_1        
		abyte0.bH = ((azh) (abyte0)).bm & ~a.H;
	// 8769 16391:aload_1         
	// 8770 16392:aload_1         
	// 8771 16393:getfield        #390 <Field int azh.bm>
	// 8772 16396:aload_0         
	// 8773 16397:getfield        #12  <Field azh a>
	// 8774 16400:getfield        #118 <Field int azh.H>
	// 8775 16403:iconst_m1       
	// 8776 16404:ixor            
	// 8777 16405:iand            
	// 8778 16406:putfield        #462 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 8779 16409:aload_0         
	// 8780 16410:getfield        #12  <Field azh a>
	// 8781 16413:astore_1        
		abyte0.bH = ((azh) (abyte0)).j | a.bH;
	// 8782 16414:aload_1         
	// 8783 16415:aload_1         
	// 8784 16416:getfield        #121 <Field int azh.j>
	// 8785 16419:aload_0         
	// 8786 16420:getfield        #12  <Field azh a>
	// 8787 16423:getfield        #462 <Field int azh.bH>
	// 8788 16426:ior             
	// 8789 16427:putfield        #462 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 8790 16430:aload_0         
	// 8791 16431:getfield        #12  <Field azh a>
	// 8792 16434:astore_1        
		abyte0.bH = ((azh) (abyte0)).aH ^ a.bH;
	// 8793 16435:aload_1         
	// 8794 16436:aload_1         
	// 8795 16437:getfield        #109 <Field int azh.aH>
	// 8796 16440:aload_0         
	// 8797 16441:getfield        #12  <Field azh a>
	// 8798 16444:getfield        #462 <Field int azh.bH>
	// 8799 16447:ixor            
	// 8800 16448:putfield        #462 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 8801 16451:aload_0         
	// 8802 16452:getfield        #12  <Field azh a>
	// 8803 16455:astore_1        
		abyte0.bD = ((azh) (abyte0)).bH ^ a.bD;
	// 8804 16456:aload_1         
	// 8805 16457:aload_1         
	// 8806 16458:getfield        #462 <Field int azh.bH>
	// 8807 16461:aload_0         
	// 8808 16462:getfield        #12  <Field azh a>
	// 8809 16465:getfield        #103 <Field int azh.bD>
	// 8810 16468:ixor            
	// 8811 16469:putfield        #103 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 8812 16472:aload_0         
	// 8813 16473:getfield        #12  <Field azh a>
	// 8814 16476:astore_1        
		abyte0.O = ((azh) (abyte0)).bD ^ a.O;
	// 8815 16477:aload_1         
	// 8816 16478:aload_1         
	// 8817 16479:getfield        #103 <Field int azh.bD>
	// 8818 16482:aload_0         
	// 8819 16483:getfield        #12  <Field azh a>
	// 8820 16486:getfield        #480 <Field int azh.O>
	// 8821 16489:ixor            
	// 8822 16490:putfield        #480 <Field int azh.O>
		abyte0 = ((byte []) (a));
	// 8823 16493:aload_0         
	// 8824 16494:getfield        #12  <Field azh a>
	// 8825 16497:astore_1        
		abyte0.bK = ((azh) (abyte0)).O & ~a.bK;
	// 8826 16498:aload_1         
	// 8827 16499:aload_1         
	// 8828 16500:getfield        #480 <Field int azh.O>
	// 8829 16503:aload_0         
	// 8830 16504:getfield        #12  <Field azh a>
	// 8831 16507:getfield        #56  <Field int azh.bK>
	// 8832 16510:iconst_m1       
	// 8833 16511:ixor            
	// 8834 16512:iand            
	// 8835 16513:putfield        #56  <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 8836 16516:aload_0         
	// 8837 16517:getfield        #12  <Field azh a>
	// 8838 16520:astore_1        
		abyte0.bK = ((azh) (abyte0)).bG ^ a.bK;
	// 8839 16521:aload_1         
	// 8840 16522:aload_1         
	// 8841 16523:getfield        #330 <Field int azh.bG>
	// 8842 16526:aload_0         
	// 8843 16527:getfield        #12  <Field azh a>
	// 8844 16530:getfield        #56  <Field int azh.bK>
	// 8845 16533:ixor            
	// 8846 16534:putfield        #56  <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 8847 16537:aload_0         
	// 8848 16538:getfield        #12  <Field azh a>
	// 8849 16541:astore_1        
		abyte0.p = ((azh) (abyte0)).bK ^ a.p;
	// 8850 16542:aload_1         
	// 8851 16543:aload_1         
	// 8852 16544:getfield        #56  <Field int azh.bK>
	// 8853 16547:aload_0         
	// 8854 16548:getfield        #12  <Field azh a>
	// 8855 16551:getfield        #315 <Field int azh.p>
	// 8856 16554:ixor            
	// 8857 16555:putfield        #315 <Field int azh.p>
		abyte0 = ((byte []) (a));
	// 8858 16558:aload_0         
	// 8859 16559:getfield        #12  <Field azh a>
	// 8860 16562:astore_1        
		abyte0.bK = ((azh) (abyte0)).p & ~a.x;
	// 8861 16563:aload_1         
	// 8862 16564:aload_1         
	// 8863 16565:getfield        #315 <Field int azh.p>
	// 8864 16568:aload_0         
	// 8865 16569:getfield        #12  <Field azh a>
	// 8866 16572:getfield        #336 <Field int azh.x>
	// 8867 16575:iconst_m1       
	// 8868 16576:ixor            
	// 8869 16577:iand            
	// 8870 16578:putfield        #56  <Field int azh.bK>
		abyte0 = ((byte []) (a));
	// 8871 16581:aload_0         
	// 8872 16582:getfield        #12  <Field azh a>
	// 8873 16585:astore_1        
		abyte0.bG = ((azh) (abyte0)).F | a.p;
	// 8874 16586:aload_1         
	// 8875 16587:aload_1         
	// 8876 16588:getfield        #321 <Field int azh.F>
	// 8877 16591:aload_0         
	// 8878 16592:getfield        #12  <Field azh a>
	// 8879 16595:getfield        #315 <Field int azh.p>
	// 8880 16598:ior             
	// 8881 16599:putfield        #330 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 8882 16602:aload_0         
	// 8883 16603:getfield        #12  <Field azh a>
	// 8884 16606:astore_1        
		abyte0.bD = ((azh) (abyte0)).p & a.x;
	// 8885 16607:aload_1         
	// 8886 16608:aload_1         
	// 8887 16609:getfield        #315 <Field int azh.p>
	// 8888 16612:aload_0         
	// 8889 16613:getfield        #12  <Field azh a>
	// 8890 16616:getfield        #336 <Field int azh.x>
	// 8891 16619:iand            
	// 8892 16620:putfield        #103 <Field int azh.bD>
		abyte0 = ((byte []) (a));
	// 8893 16623:aload_0         
	// 8894 16624:getfield        #12  <Field azh a>
	// 8895 16627:astore_1        
		abyte0.aL = ((azh) (abyte0)).O & ~a.aL;
	// 8896 16628:aload_1         
	// 8897 16629:aload_1         
	// 8898 16630:getfield        #480 <Field int azh.O>
	// 8899 16633:aload_0         
	// 8900 16634:getfield        #12  <Field azh a>
	// 8901 16637:getfield        #249 <Field int azh.aL>
	// 8902 16640:iconst_m1       
	// 8903 16641:ixor            
	// 8904 16642:iand            
	// 8905 16643:putfield        #249 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 8906 16646:aload_0         
	// 8907 16647:getfield        #12  <Field azh a>
	// 8908 16650:astore_1        
		abyte0.aL = ((azh) (abyte0)).cc ^ a.aL;
	// 8909 16651:aload_1         
	// 8910 16652:aload_1         
	// 8911 16653:getfield        #252 <Field int azh.cc>
	// 8912 16656:aload_0         
	// 8913 16657:getfield        #12  <Field azh a>
	// 8914 16660:getfield        #249 <Field int azh.aL>
	// 8915 16663:ixor            
	// 8916 16664:putfield        #249 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 8917 16667:aload_0         
	// 8918 16668:getfield        #12  <Field azh a>
	// 8919 16671:astore_1        
		abyte0.aL = ((azh) (abyte0)).aL ^ a.b;
	// 8920 16672:aload_1         
	// 8921 16673:aload_1         
	// 8922 16674:getfield        #249 <Field int azh.aL>
	// 8923 16677:aload_0         
	// 8924 16678:getfield        #12  <Field azh a>
	// 8925 16681:getfield        #438 <Field int azh.b>
	// 8926 16684:ixor            
	// 8927 16685:putfield        #249 <Field int azh.aL>
		abyte0 = ((byte []) (a));
	// 8928 16688:aload_0         
	// 8929 16689:getfield        #12  <Field azh a>
	// 8930 16692:astore_1        
		abyte0.cc = ((azh) (abyte0)).aL & a.bl;
	// 8931 16693:aload_1         
	// 8932 16694:aload_1         
	// 8933 16695:getfield        #249 <Field int azh.aL>
	// 8934 16698:aload_0         
	// 8935 16699:getfield        #12  <Field azh a>
	// 8936 16702:getfield        #366 <Field int azh.bl>
	// 8937 16705:iand            
	// 8938 16706:putfield        #252 <Field int azh.cc>
		abyte0 = ((byte []) (a));
	// 8939 16709:aload_0         
	// 8940 16710:getfield        #12  <Field azh a>
	// 8941 16713:astore_1        
		abyte0.aR = ((azh) (abyte0)).O & ~a.aR;
	// 8942 16714:aload_1         
	// 8943 16715:aload_1         
	// 8944 16716:getfield        #480 <Field int azh.O>
	// 8945 16719:aload_0         
	// 8946 16720:getfield        #12  <Field azh a>
	// 8947 16723:getfield        #369 <Field int azh.aR>
	// 8948 16726:iconst_m1       
	// 8949 16727:ixor            
	// 8950 16728:iand            
	// 8951 16729:putfield        #369 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 8952 16732:aload_0         
	// 8953 16733:getfield        #12  <Field azh a>
	// 8954 16736:astore_1        
		abyte0.aR = ((azh) (abyte0)).bd ^ a.aR;
	// 8955 16737:aload_1         
	// 8956 16738:aload_1         
	// 8957 16739:getfield        #303 <Field int azh.bd>
	// 8958 16742:aload_0         
	// 8959 16743:getfield        #12  <Field azh a>
	// 8960 16746:getfield        #369 <Field int azh.aR>
	// 8961 16749:ixor            
	// 8962 16750:putfield        #369 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 8963 16753:aload_0         
	// 8964 16754:getfield        #12  <Field azh a>
	// 8965 16757:astore_1        
		abyte0.L = ((azh) (abyte0)).aR ^ a.L;
	// 8966 16758:aload_1         
	// 8967 16759:aload_1         
	// 8968 16760:getfield        #369 <Field int azh.aR>
	// 8969 16763:aload_0         
	// 8970 16764:getfield        #12  <Field azh a>
	// 8971 16767:getfield        #237 <Field int azh.L>
	// 8972 16770:ixor            
	// 8973 16771:putfield        #237 <Field int azh.L>
		abyte0 = ((byte []) (a));
	// 8974 16774:aload_0         
	// 8975 16775:getfield        #12  <Field azh a>
	// 8976 16778:astore_1        
		abyte0.aR = ((azh) (abyte0)).L & ~a.f;
	// 8977 16779:aload_1         
	// 8978 16780:aload_1         
	// 8979 16781:getfield        #237 <Field int azh.L>
	// 8980 16784:aload_0         
	// 8981 16785:getfield        #12  <Field azh a>
	// 8982 16788:getfield        #261 <Field int azh.f>
	// 8983 16791:iconst_m1       
	// 8984 16792:ixor            
	// 8985 16793:iand            
	// 8986 16794:putfield        #369 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 8987 16797:aload_0         
	// 8988 16798:getfield        #12  <Field azh a>
	// 8989 16801:astore_1        
		abyte0.bd = ((azh) (abyte0)).f | a.L;
	// 8990 16802:aload_1         
	// 8991 16803:aload_1         
	// 8992 16804:getfield        #261 <Field int azh.f>
	// 8993 16807:aload_0         
	// 8994 16808:getfield        #12  <Field azh a>
	// 8995 16811:getfield        #237 <Field int azh.L>
	// 8996 16814:ior             
	// 8997 16815:putfield        #303 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 8998 16818:aload_0         
	// 8999 16819:getfield        #12  <Field azh a>
	// 9000 16822:astore_1        
		abyte0.aP = ((azh) (abyte0)).O & a.aP;
	// 9001 16823:aload_1         
	// 9002 16824:aload_1         
	// 9003 16825:getfield        #480 <Field int azh.O>
	// 9004 16828:aload_0         
	// 9005 16829:getfield        #12  <Field azh a>
	// 9006 16832:getfield        #231 <Field int azh.aP>
	// 9007 16835:iand            
	// 9008 16836:putfield        #231 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 9009 16839:aload_0         
	// 9010 16840:getfield        #12  <Field azh a>
	// 9011 16843:astore_1        
		abyte0.aP = ((azh) (abyte0)).cd ^ a.aP;
	// 9012 16844:aload_1         
	// 9013 16845:aload_1         
	// 9014 16846:getfield        #59  <Field int azh.cd>
	// 9015 16849:aload_0         
	// 9016 16850:getfield        #12  <Field azh a>
	// 9017 16853:getfield        #231 <Field int azh.aP>
	// 9018 16856:ixor            
	// 9019 16857:putfield        #231 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 9020 16860:aload_0         
	// 9021 16861:getfield        #12  <Field azh a>
	// 9022 16864:astore_1        
		abyte0.t = ((azh) (abyte0)).aP ^ a.t;
	// 9023 16865:aload_1         
	// 9024 16866:aload_1         
	// 9025 16867:getfield        #231 <Field int azh.aP>
	// 9026 16870:aload_0         
	// 9027 16871:getfield        #12  <Field azh a>
	// 9028 16874:getfield        #372 <Field int azh.t>
	// 9029 16877:ixor            
	// 9030 16878:putfield        #372 <Field int azh.t>
		abyte0 = ((byte []) (a));
	// 9031 16881:aload_0         
	// 9032 16882:getfield        #12  <Field azh a>
	// 9033 16885:astore_1        
		abyte0.aP = ((azh) (abyte0)).t & ~a.B;
	// 9034 16886:aload_1         
	// 9035 16887:aload_1         
	// 9036 16888:getfield        #372 <Field int azh.t>
	// 9037 16891:aload_0         
	// 9038 16892:getfield        #12  <Field azh a>
	// 9039 16895:getfield        #402 <Field int azh.B>
	// 9040 16898:iconst_m1       
	// 9041 16899:ixor            
	// 9042 16900:iand            
	// 9043 16901:putfield        #231 <Field int azh.aP>
		abyte0 = ((byte []) (a));
	// 9044 16904:aload_0         
	// 9045 16905:getfield        #12  <Field azh a>
	// 9046 16908:astore_1        
		abyte0.cd = ((azh) (abyte0)).B | a.t;
	// 9047 16909:aload_1         
	// 9048 16910:aload_1         
	// 9049 16911:getfield        #402 <Field int azh.B>
	// 9050 16914:aload_0         
	// 9051 16915:getfield        #12  <Field azh a>
	// 9052 16918:getfield        #372 <Field int azh.t>
	// 9053 16921:ior             
	// 9054 16922:putfield        #59  <Field int azh.cd>
		abyte0 = ((byte []) (a));
	// 9055 16925:aload_0         
	// 9056 16926:getfield        #12  <Field azh a>
	// 9057 16929:astore_1        
		abyte0.bm = ((azh) (abyte0)).H & a.bm;
	// 9058 16930:aload_1         
	// 9059 16931:aload_1         
	// 9060 16932:getfield        #118 <Field int azh.H>
	// 9061 16935:aload_0         
	// 9062 16936:getfield        #12  <Field azh a>
	// 9063 16939:getfield        #390 <Field int azh.bm>
	// 9064 16942:iand            
	// 9065 16943:putfield        #390 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 9066 16946:aload_0         
	// 9067 16947:getfield        #12  <Field azh a>
	// 9068 16950:astore_1        
		abyte0.bm = ((azh) (abyte0)).bx ^ a.bm;
	// 9069 16951:aload_1         
	// 9070 16952:aload_1         
	// 9071 16953:getfield        #453 <Field int azh.bx>
	// 9072 16956:aload_0         
	// 9073 16957:getfield        #12  <Field azh a>
	// 9074 16960:getfield        #390 <Field int azh.bm>
	// 9075 16963:ixor            
	// 9076 16964:putfield        #390 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 9077 16967:aload_0         
	// 9078 16968:getfield        #12  <Field azh a>
	// 9079 16971:astore_1        
		abyte0.bm = ((azh) (abyte0)).j | a.bm;
	// 9080 16972:aload_1         
	// 9081 16973:aload_1         
	// 9082 16974:getfield        #121 <Field int azh.j>
	// 9083 16977:aload_0         
	// 9084 16978:getfield        #12  <Field azh a>
	// 9085 16981:getfield        #390 <Field int azh.bm>
	// 9086 16984:ior             
	// 9087 16985:putfield        #390 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 9088 16988:aload_0         
	// 9089 16989:getfield        #12  <Field azh a>
	// 9090 16992:astore_1        
		abyte0.bm = ((azh) (abyte0)).av ^ a.bm;
	// 9091 16993:aload_1         
	// 9092 16994:aload_1         
	// 9093 16995:getfield        #106 <Field int azh.av>
	// 9094 16998:aload_0         
	// 9095 16999:getfield        #12  <Field azh a>
	// 9096 17002:getfield        #390 <Field int azh.bm>
	// 9097 17005:ixor            
	// 9098 17006:putfield        #390 <Field int azh.bm>
		abyte0 = ((byte []) (a));
	// 9099 17009:aload_0         
	// 9100 17010:getfield        #12  <Field azh a>
	// 9101 17013:astore_1        
		abyte0.bB = ((azh) (abyte0)).bm ^ a.bB;
	// 9102 17014:aload_1         
	// 9103 17015:aload_1         
	// 9104 17016:getfield        #390 <Field int azh.bm>
	// 9105 17019:aload_0         
	// 9106 17020:getfield        #12  <Field azh a>
	// 9107 17023:getfield        #225 <Field int azh.bB>
	// 9108 17026:ixor            
	// 9109 17027:putfield        #225 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 9110 17030:aload_0         
	// 9111 17031:getfield        #12  <Field azh a>
	// 9112 17034:astore_1        
		abyte0.A = ((azh) (abyte0)).bB ^ a.A;
	// 9113 17035:aload_1         
	// 9114 17036:aload_1         
	// 9115 17037:getfield        #225 <Field int azh.bB>
	// 9116 17040:aload_0         
	// 9117 17041:getfield        #12  <Field azh a>
	// 9118 17044:getfield        #97  <Field int azh.A>
	// 9119 17047:ixor            
	// 9120 17048:putfield        #97  <Field int azh.A>
		abyte0 = ((byte []) (a));
	// 9121 17051:aload_0         
	// 9122 17052:getfield        #12  <Field azh a>
	// 9123 17055:astore_1        
		abyte0.bB = ((azh) (abyte0)).A & ~a.bj;
	// 9124 17056:aload_1         
	// 9125 17057:aload_1         
	// 9126 17058:getfield        #97  <Field int azh.A>
	// 9127 17061:aload_0         
	// 9128 17062:getfield        #12  <Field azh a>
	// 9129 17065:getfield        #297 <Field int azh.bj>
	// 9130 17068:iconst_m1       
	// 9131 17069:ixor            
	// 9132 17070:iand            
	// 9133 17071:putfield        #225 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 9134 17074:aload_0         
	// 9135 17075:getfield        #12  <Field azh a>
	// 9136 17078:astore_1        
		abyte0.bB = ((azh) (abyte0)).Q & a.bB;
	// 9137 17079:aload_1         
	// 9138 17080:aload_1         
	// 9139 17081:getfield        #414 <Field int azh.Q>
	// 9140 17084:aload_0         
	// 9141 17085:getfield        #12  <Field azh a>
	// 9142 17088:getfield        #225 <Field int azh.bB>
	// 9143 17091:iand            
	// 9144 17092:putfield        #225 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 9145 17095:aload_0         
	// 9146 17096:getfield        #12  <Field azh a>
	// 9147 17099:astore_1        
		abyte0.av = ((azh) (abyte0)).A & ~a.ag;
	// 9148 17100:aload_1         
	// 9149 17101:aload_1         
	// 9150 17102:getfield        #97  <Field int azh.A>
	// 9151 17105:aload_0         
	// 9152 17106:getfield        #12  <Field azh a>
	// 9153 17109:getfield        #477 <Field int azh.ag>
	// 9154 17112:iconst_m1       
	// 9155 17113:ixor            
	// 9156 17114:iand            
	// 9157 17115:putfield        #106 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 9158 17118:aload_0         
	// 9159 17119:getfield        #12  <Field azh a>
	// 9160 17122:astore_1        
		abyte0.av = ((azh) (abyte0)).Q | a.av;
	// 9161 17123:aload_1         
	// 9162 17124:aload_1         
	// 9163 17125:getfield        #414 <Field int azh.Q>
	// 9164 17128:aload_0         
	// 9165 17129:getfield        #12  <Field azh a>
	// 9166 17132:getfield        #106 <Field int azh.av>
	// 9167 17135:ior             
	// 9168 17136:putfield        #106 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 9169 17139:aload_0         
	// 9170 17140:getfield        #12  <Field azh a>
	// 9171 17143:astore_1        
		abyte0.bj = ((azh) (abyte0)).bj ^ a.A;
	// 9172 17144:aload_1         
	// 9173 17145:aload_1         
	// 9174 17146:getfield        #297 <Field int azh.bj>
	// 9175 17149:aload_0         
	// 9176 17150:getfield        #12  <Field azh a>
	// 9177 17153:getfield        #97  <Field int azh.A>
	// 9178 17156:ixor            
	// 9179 17157:putfield        #297 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 9180 17160:aload_0         
	// 9181 17161:getfield        #12  <Field azh a>
	// 9182 17164:astore_1        
		abyte0.bB = ((azh) (abyte0)).bj ^ a.bB;
	// 9183 17165:aload_1         
	// 9184 17166:aload_1         
	// 9185 17167:getfield        #297 <Field int azh.bj>
	// 9186 17170:aload_0         
	// 9187 17171:getfield        #12  <Field azh a>
	// 9188 17174:getfield        #225 <Field int azh.bB>
	// 9189 17177:ixor            
	// 9190 17178:putfield        #225 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 9191 17181:aload_0         
	// 9192 17182:getfield        #12  <Field azh a>
	// 9193 17185:astore_1        
		abyte0.bx = ((azh) (abyte0)).A & a.I;
	// 9194 17186:aload_1         
	// 9195 17187:aload_1         
	// 9196 17188:getfield        #97  <Field int azh.A>
	// 9197 17191:aload_0         
	// 9198 17192:getfield        #12  <Field azh a>
	// 9199 17195:getfield        #79  <Field int azh.I>
	// 9200 17198:iand            
	// 9201 17199:putfield        #453 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 9202 17202:aload_0         
	// 9203 17203:getfield        #12  <Field azh a>
	// 9204 17206:astore_1        
		abyte0.bx = ((azh) (abyte0)).ag ^ a.bx;
	// 9205 17207:aload_1         
	// 9206 17208:aload_1         
	// 9207 17209:getfield        #477 <Field int azh.ag>
	// 9208 17212:aload_0         
	// 9209 17213:getfield        #12  <Field azh a>
	// 9210 17216:getfield        #453 <Field int azh.bx>
	// 9211 17219:ixor            
	// 9212 17220:putfield        #453 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 9213 17223:aload_0         
	// 9214 17224:getfield        #12  <Field azh a>
	// 9215 17227:astore_1        
		abyte0.bx = ((azh) (abyte0)).Q & a.bx;
	// 9216 17228:aload_1         
	// 9217 17229:aload_1         
	// 9218 17230:getfield        #414 <Field int azh.Q>
	// 9219 17233:aload_0         
	// 9220 17234:getfield        #12  <Field azh a>
	// 9221 17237:getfield        #453 <Field int azh.bx>
	// 9222 17240:iand            
	// 9223 17241:putfield        #453 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 9224 17244:aload_0         
	// 9225 17245:getfield        #12  <Field azh a>
	// 9226 17248:astore_1        
		abyte0.bH = ((azh) (abyte0)).A & ~a.aN;
	// 9227 17249:aload_1         
	// 9228 17250:aload_1         
	// 9229 17251:getfield        #97  <Field int azh.A>
	// 9230 17254:aload_0         
	// 9231 17255:getfield        #12  <Field azh a>
	// 9232 17258:getfield        #384 <Field int azh.aN>
	// 9233 17261:iconst_m1       
	// 9234 17262:ixor            
	// 9235 17263:iand            
	// 9236 17264:putfield        #462 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 9237 17267:aload_0         
	// 9238 17268:getfield        #12  <Field azh a>
	// 9239 17271:astore_1        
		abyte0.bH = ((azh) (abyte0)).bV ^ a.bH;
	// 9240 17272:aload_1         
	// 9241 17273:aload_1         
	// 9242 17274:getfield        #324 <Field int azh.bV>
	// 9243 17277:aload_0         
	// 9244 17278:getfield        #12  <Field azh a>
	// 9245 17281:getfield        #462 <Field int azh.bH>
	// 9246 17284:ixor            
	// 9247 17285:putfield        #462 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 9248 17288:aload_0         
	// 9249 17289:getfield        #12  <Field azh a>
	// 9250 17292:astore_1        
		abyte0.aH = ((azh) (abyte0)).Q & a.bH;
	// 9251 17293:aload_1         
	// 9252 17294:aload_1         
	// 9253 17295:getfield        #414 <Field int azh.Q>
	// 9254 17298:aload_0         
	// 9255 17299:getfield        #12  <Field azh a>
	// 9256 17302:getfield        #462 <Field int azh.bH>
	// 9257 17305:iand            
	// 9258 17306:putfield        #109 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 9259 17309:aload_0         
	// 9260 17310:getfield        #12  <Field azh a>
	// 9261 17313:astore_1        
		abyte0.aH = ((azh) (abyte0)).bJ ^ a.aH;
	// 9262 17314:aload_1         
	// 9263 17315:aload_1         
	// 9264 17316:getfield        #53  <Field int azh.bJ>
	// 9265 17319:aload_0         
	// 9266 17320:getfield        #12  <Field azh a>
	// 9267 17323:getfield        #109 <Field int azh.aH>
	// 9268 17326:ixor            
	// 9269 17327:putfield        #109 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 9270 17330:aload_0         
	// 9271 17331:getfield        #12  <Field azh a>
	// 9272 17334:astore_1        
		abyte0.bW = ((azh) (abyte0)).A & a.ci;
	// 9273 17335:aload_1         
	// 9274 17336:aload_1         
	// 9275 17337:getfield        #97  <Field int azh.A>
	// 9276 17340:aload_0         
	// 9277 17341:getfield        #12  <Field azh a>
	// 9278 17344:getfield        #71  <Field int azh.ci>
	// 9279 17347:iand            
	// 9280 17348:putfield        #465 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 9281 17351:aload_0         
	// 9282 17352:getfield        #12  <Field azh a>
	// 9283 17355:astore_1        
		abyte0.bW = ((azh) (abyte0)).I ^ a.bW;
	// 9284 17356:aload_1         
	// 9285 17357:aload_1         
	// 9286 17358:getfield        #79  <Field int azh.I>
	// 9287 17361:aload_0         
	// 9288 17362:getfield        #12  <Field azh a>
	// 9289 17365:getfield        #465 <Field int azh.bW>
	// 9290 17368:ixor            
	// 9291 17369:putfield        #465 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 9292 17372:aload_0         
	// 9293 17373:getfield        #12  <Field azh a>
	// 9294 17376:astore_1        
		abyte0.am = ((azh) (abyte0)).bW ^ a.am;
	// 9295 17377:aload_1         
	// 9296 17378:aload_1         
	// 9297 17379:getfield        #465 <Field int azh.bW>
	// 9298 17382:aload_0         
	// 9299 17383:getfield        #12  <Field azh a>
	// 9300 17386:getfield        #471 <Field int azh.am>
	// 9301 17389:ixor            
	// 9302 17390:putfield        #471 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 9303 17393:aload_0         
	// 9304 17394:getfield        #12  <Field azh a>
	// 9305 17397:astore_1        
		abyte0.am = ((azh) (abyte0)).Y & a.am;
	// 9306 17398:aload_1         
	// 9307 17399:aload_1         
	// 9308 17400:getfield        #91  <Field int azh.Y>
	// 9309 17403:aload_0         
	// 9310 17404:getfield        #12  <Field azh a>
	// 9311 17407:getfield        #471 <Field int azh.am>
	// 9312 17410:iand            
	// 9313 17411:putfield        #471 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 9314 17414:aload_0         
	// 9315 17415:getfield        #12  <Field azh a>
	// 9316 17418:astore_1        
		abyte0.bW = ((azh) (abyte0)).bF | a.A;
	// 9317 17419:aload_1         
	// 9318 17420:aload_1         
	// 9319 17421:getfield        #255 <Field int azh.bF>
	// 9320 17424:aload_0         
	// 9321 17425:getfield        #12  <Field azh a>
	// 9322 17428:getfield        #97  <Field int azh.A>
	// 9323 17431:ior             
	// 9324 17432:putfield        #465 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 9325 17435:aload_0         
	// 9326 17436:getfield        #12  <Field azh a>
	// 9327 17439:astore_1        
		abyte0.ar = ((azh) (abyte0)).c | a.bW;
	// 9328 17440:aload_1         
	// 9329 17441:aload_1         
	// 9330 17442:getfield        #100 <Field int azh.c>
	// 9331 17445:aload_0         
	// 9332 17446:getfield        #12  <Field azh a>
	// 9333 17449:getfield        #465 <Field int azh.bW>
	// 9334 17452:ior             
	// 9335 17453:putfield        #435 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 9336 17456:aload_0         
	// 9337 17457:getfield        #12  <Field azh a>
	// 9338 17460:astore_1        
		abyte0.bW = ((azh) (abyte0)).c | a.bW;
	// 9339 17461:aload_1         
	// 9340 17462:aload_1         
	// 9341 17463:getfield        #100 <Field int azh.c>
	// 9342 17466:aload_0         
	// 9343 17467:getfield        #12  <Field azh a>
	// 9344 17470:getfield        #465 <Field int azh.bW>
	// 9345 17473:ior             
	// 9346 17474:putfield        #465 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 9347 17477:aload_0         
	// 9348 17478:getfield        #12  <Field azh a>
	// 9349 17481:astore_1        
		abyte0.bW = ((azh) (abyte0)).A ^ a.bW;
	// 9350 17482:aload_1         
	// 9351 17483:aload_1         
	// 9352 17484:getfield        #97  <Field int azh.A>
	// 9353 17487:aload_0         
	// 9354 17488:getfield        #12  <Field azh a>
	// 9355 17491:getfield        #465 <Field int azh.bW>
	// 9356 17494:ixor            
	// 9357 17495:putfield        #465 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 9358 17498:aload_0         
	// 9359 17499:getfield        #12  <Field azh a>
	// 9360 17502:astore_1        
		abyte0.by = ((azh) (abyte0)).A & ~a.I;
	// 9361 17503:aload_1         
	// 9362 17504:aload_1         
	// 9363 17505:getfield        #97  <Field int azh.A>
	// 9364 17508:aload_0         
	// 9365 17509:getfield        #12  <Field azh a>
	// 9366 17512:getfield        #79  <Field int azh.I>
	// 9367 17515:iconst_m1       
	// 9368 17516:ixor            
	// 9369 17517:iand            
	// 9370 17518:putfield        #354 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 9371 17521:aload_0         
	// 9372 17522:getfield        #12  <Field azh a>
	// 9373 17525:astore_1        
		abyte0.by = ((azh) (abyte0)).bP ^ a.by;
	// 9374 17526:aload_1         
	// 9375 17527:aload_1         
	// 9376 17528:getfield        #474 <Field int azh.bP>
	// 9377 17531:aload_0         
	// 9378 17532:getfield        #12  <Field azh a>
	// 9379 17535:getfield        #354 <Field int azh.by>
	// 9380 17538:ixor            
	// 9381 17539:putfield        #354 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 9382 17542:aload_0         
	// 9383 17543:getfield        #12  <Field azh a>
	// 9384 17546:astore_1        
		abyte0.bk = ((azh) (abyte0)).Q & a.by;
	// 9385 17547:aload_1         
	// 9386 17548:aload_1         
	// 9387 17549:getfield        #414 <Field int azh.Q>
	// 9388 17552:aload_0         
	// 9389 17553:getfield        #12  <Field azh a>
	// 9390 17556:getfield        #354 <Field int azh.by>
	// 9391 17559:iand            
	// 9392 17560:putfield        #234 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 9393 17563:aload_0         
	// 9394 17564:getfield        #12  <Field azh a>
	// 9395 17567:astore_1        
		abyte0.by = ((azh) (abyte0)).by & ~a.Q;
	// 9396 17568:aload_1         
	// 9397 17569:aload_1         
	// 9398 17570:getfield        #354 <Field int azh.by>
	// 9399 17573:aload_0         
	// 9400 17574:getfield        #12  <Field azh a>
	// 9401 17577:getfield        #414 <Field int azh.Q>
	// 9402 17580:iconst_m1       
	// 9403 17581:ixor            
	// 9404 17582:iand            
	// 9405 17583:putfield        #354 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 9406 17586:aload_0         
	// 9407 17587:getfield        #12  <Field azh a>
	// 9408 17590:astore_1        
		abyte0.au = ((azh) (abyte0)).A & ~a.bJ;
	// 9409 17591:aload_1         
	// 9410 17592:aload_1         
	// 9411 17593:getfield        #97  <Field int azh.A>
	// 9412 17596:aload_0         
	// 9413 17597:getfield        #12  <Field azh a>
	// 9414 17600:getfield        #53  <Field int azh.bJ>
	// 9415 17603:iconst_m1       
	// 9416 17604:ixor            
	// 9417 17605:iand            
	// 9418 17606:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 9419 17609:aload_0         
	// 9420 17610:getfield        #12  <Field azh a>
	// 9421 17613:astore_1        
		abyte0.au = ((azh) (abyte0)).ag ^ a.au;
	// 9422 17614:aload_1         
	// 9423 17615:aload_1         
	// 9424 17616:getfield        #477 <Field int azh.ag>
	// 9425 17619:aload_0         
	// 9426 17620:getfield        #12  <Field azh a>
	// 9427 17623:getfield        #85  <Field int azh.au>
	// 9428 17626:ixor            
	// 9429 17627:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 9430 17630:aload_0         
	// 9431 17631:getfield        #12  <Field azh a>
	// 9432 17634:astore_1        
		abyte0.aQ = ((azh) (abyte0)).A & a.bF;
	// 9433 17635:aload_1         
	// 9434 17636:aload_1         
	// 9435 17637:getfield        #97  <Field int azh.A>
	// 9436 17640:aload_0         
	// 9437 17641:getfield        #12  <Field azh a>
	// 9438 17644:getfield        #255 <Field int azh.bF>
	// 9439 17647:iand            
	// 9440 17648:putfield        #357 <Field int azh.aQ>
		abyte0 = ((byte []) (a));
	// 9441 17651:aload_0         
	// 9442 17652:getfield        #12  <Field azh a>
	// 9443 17655:astore_1        
		abyte0.bt = ((azh) (abyte0)).aQ & ~a.I;
	// 9444 17656:aload_1         
	// 9445 17657:aload_1         
	// 9446 17658:getfield        #357 <Field int azh.aQ>
	// 9447 17661:aload_0         
	// 9448 17662:getfield        #12  <Field azh a>
	// 9449 17665:getfield        #79  <Field int azh.I>
	// 9450 17668:iconst_m1       
	// 9451 17669:ixor            
	// 9452 17670:iand            
	// 9453 17671:putfield        #213 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 9454 17674:aload_0         
	// 9455 17675:getfield        #12  <Field azh a>
	// 9456 17678:astore_1        
		abyte0.bt = ((azh) (abyte0)).bo ^ a.bt;
	// 9457 17679:aload_1         
	// 9458 17680:aload_1         
	// 9459 17681:getfield        #32  <Field int azh.bo>
	// 9460 17684:aload_0         
	// 9461 17685:getfield        #12  <Field azh a>
	// 9462 17688:getfield        #213 <Field int azh.bt>
	// 9463 17691:ixor            
	// 9464 17692:putfield        #213 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 9465 17695:aload_0         
	// 9466 17696:getfield        #12  <Field azh a>
	// 9467 17699:astore_1        
		abyte0.bt = ((azh) (abyte0)).bt & ~a.bb;
	// 9468 17700:aload_1         
	// 9469 17701:aload_1         
	// 9470 17702:getfield        #213 <Field int azh.bt>
	// 9471 17705:aload_0         
	// 9472 17706:getfield        #12  <Field azh a>
	// 9473 17709:getfield        #178 <Field int azh.bb>
	// 9474 17712:iconst_m1       
	// 9475 17713:ixor            
	// 9476 17714:iand            
	// 9477 17715:putfield        #213 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 9478 17718:aload_0         
	// 9479 17719:getfield        #12  <Field azh a>
	// 9480 17722:astore_1        
		abyte0.bv = ((azh) (abyte0)).aQ & ~a.c;
	// 9481 17723:aload_1         
	// 9482 17724:aload_1         
	// 9483 17725:getfield        #357 <Field int azh.aQ>
	// 9484 17728:aload_0         
	// 9485 17729:getfield        #12  <Field azh a>
	// 9486 17732:getfield        #100 <Field int azh.c>
	// 9487 17735:iconst_m1       
	// 9488 17736:ixor            
	// 9489 17737:iand            
	// 9490 17738:putfield        #411 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 9491 17741:aload_0         
	// 9492 17742:getfield        #12  <Field azh a>
	// 9493 17745:astore_1        
		abyte0.bE = ((azh) (abyte0)).aQ ^ a.c;
	// 9494 17746:aload_1         
	// 9495 17747:aload_1         
	// 9496 17748:getfield        #357 <Field int azh.aQ>
	// 9497 17751:aload_0         
	// 9498 17752:getfield        #12  <Field azh a>
	// 9499 17755:getfield        #100 <Field int azh.c>
	// 9500 17758:ixor            
	// 9501 17759:putfield        #375 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 9502 17762:aload_0         
	// 9503 17763:getfield        #12  <Field azh a>
	// 9504 17766:astore_1        
		abyte0.bE = ((azh) (abyte0)).bE | a.I;
	// 9505 17767:aload_1         
	// 9506 17768:aload_1         
	// 9507 17769:getfield        #375 <Field int azh.bE>
	// 9508 17772:aload_0         
	// 9509 17773:getfield        #12  <Field azh a>
	// 9510 17776:getfield        #79  <Field int azh.I>
	// 9511 17779:ior             
	// 9512 17780:putfield        #375 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 9513 17783:aload_0         
	// 9514 17784:getfield        #12  <Field azh a>
	// 9515 17787:astore_1        
		abyte0.bE = ((azh) (abyte0)).aQ ^ a.bE;
	// 9516 17788:aload_1         
	// 9517 17789:aload_1         
	// 9518 17790:getfield        #357 <Field int azh.aQ>
	// 9519 17793:aload_0         
	// 9520 17794:getfield        #12  <Field azh a>
	// 9521 17797:getfield        #375 <Field int azh.bE>
	// 9522 17800:ixor            
	// 9523 17801:putfield        #375 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 9524 17804:aload_0         
	// 9525 17805:getfield        #12  <Field azh a>
	// 9526 17808:astore_1        
		abyte0.bE = ((azh) (abyte0)).bb | a.bE;
	// 9527 17809:aload_1         
	// 9528 17810:aload_1         
	// 9529 17811:getfield        #178 <Field int azh.bb>
	// 9530 17814:aload_0         
	// 9531 17815:getfield        #12  <Field azh a>
	// 9532 17818:getfield        #375 <Field int azh.bE>
	// 9533 17821:ior             
	// 9534 17822:putfield        #375 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 9535 17825:aload_0         
	// 9536 17826:getfield        #12  <Field azh a>
	// 9537 17829:astore_1        
		abyte0.aT = ((azh) (abyte0)).A & ~a.aN;
	// 9538 17830:aload_1         
	// 9539 17831:aload_1         
	// 9540 17832:getfield        #97  <Field int azh.A>
	// 9541 17835:aload_0         
	// 9542 17836:getfield        #12  <Field azh a>
	// 9543 17839:getfield        #384 <Field int azh.aN>
	// 9544 17842:iconst_m1       
	// 9545 17843:ixor            
	// 9546 17844:iand            
	// 9547 17845:putfield        #447 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 9548 17848:aload_0         
	// 9549 17849:getfield        #12  <Field azh a>
	// 9550 17852:astore_1        
		abyte0.aT = ((azh) (abyte0)).aN ^ a.aT;
	// 9551 17853:aload_1         
	// 9552 17854:aload_1         
	// 9553 17855:getfield        #384 <Field int azh.aN>
	// 9554 17858:aload_0         
	// 9555 17859:getfield        #12  <Field azh a>
	// 9556 17862:getfield        #447 <Field int azh.aT>
	// 9557 17865:ixor            
	// 9558 17866:putfield        #447 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 9559 17869:aload_0         
	// 9560 17870:getfield        #12  <Field azh a>
	// 9561 17873:astore_1        
		abyte0.aT = ((azh) (abyte0)).aT & ~a.Q;
	// 9562 17874:aload_1         
	// 9563 17875:aload_1         
	// 9564 17876:getfield        #447 <Field int azh.aT>
	// 9565 17879:aload_0         
	// 9566 17880:getfield        #12  <Field azh a>
	// 9567 17883:getfield        #414 <Field int azh.Q>
	// 9568 17886:iconst_m1       
	// 9569 17887:ixor            
	// 9570 17888:iand            
	// 9571 17889:putfield        #447 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 9572 17892:aload_0         
	// 9573 17893:getfield        #12  <Field azh a>
	// 9574 17896:astore_1        
		abyte0.aT = ((azh) (abyte0)).bH ^ a.aT;
	// 9575 17897:aload_1         
	// 9576 17898:aload_1         
	// 9577 17899:getfield        #462 <Field int azh.bH>
	// 9578 17902:aload_0         
	// 9579 17903:getfield        #12  <Field azh a>
	// 9580 17906:getfield        #447 <Field int azh.aT>
	// 9581 17909:ixor            
	// 9582 17910:putfield        #447 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 9583 17913:aload_0         
	// 9584 17914:getfield        #12  <Field azh a>
	// 9585 17917:astore_1        
		abyte0.aB = ((azh) (abyte0)).aT ^ a.aB;
	// 9586 17918:aload_1         
	// 9587 17919:aload_1         
	// 9588 17920:getfield        #447 <Field int azh.aT>
	// 9589 17923:aload_0         
	// 9590 17924:getfield        #12  <Field azh a>
	// 9591 17927:getfield        #339 <Field int azh.aB>
	// 9592 17930:ixor            
	// 9593 17931:putfield        #339 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 9594 17934:aload_0         
	// 9595 17935:getfield        #12  <Field azh a>
	// 9596 17938:astore_1        
		abyte0.aT = ((azh) (abyte0)).bF ^ a.A;
	// 9597 17939:aload_1         
	// 9598 17940:aload_1         
	// 9599 17941:getfield        #255 <Field int azh.bF>
	// 9600 17944:aload_0         
	// 9601 17945:getfield        #12  <Field azh a>
	// 9602 17948:getfield        #97  <Field int azh.A>
	// 9603 17951:ixor            
	// 9604 17952:putfield        #447 <Field int azh.aT>
		abyte0 = ((byte []) (a));
	// 9605 17955:aload_0         
	// 9606 17956:getfield        #12  <Field azh a>
	// 9607 17959:astore_1        
		abyte0.ar = ((azh) (abyte0)).aT ^ a.ar;
	// 9608 17960:aload_1         
	// 9609 17961:aload_1         
	// 9610 17962:getfield        #447 <Field int azh.aT>
	// 9611 17965:aload_0         
	// 9612 17966:getfield        #12  <Field azh a>
	// 9613 17969:getfield        #435 <Field int azh.ar>
	// 9614 17972:ixor            
	// 9615 17973:putfield        #435 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 9616 17976:aload_0         
	// 9617 17977:getfield        #12  <Field azh a>
	// 9618 17980:astore_1        
		abyte0.bH = ((azh) (abyte0)).I & a.ar;
	// 9619 17981:aload_1         
	// 9620 17982:aload_1         
	// 9621 17983:getfield        #79  <Field int azh.I>
	// 9622 17986:aload_0         
	// 9623 17987:getfield        #12  <Field azh a>
	// 9624 17990:getfield        #435 <Field int azh.ar>
	// 9625 17993:iand            
	// 9626 17994:putfield        #462 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 9627 17997:aload_0         
	// 9628 17998:getfield        #12  <Field azh a>
	// 9629 18001:astore_1        
		abyte0.bH = ((azh) (abyte0)).bb | a.bH;
	// 9630 18002:aload_1         
	// 9631 18003:aload_1         
	// 9632 18004:getfield        #178 <Field int azh.bb>
	// 9633 18007:aload_0         
	// 9634 18008:getfield        #12  <Field azh a>
	// 9635 18011:getfield        #462 <Field int azh.bH>
	// 9636 18014:ior             
	// 9637 18015:putfield        #462 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 9638 18018:aload_0         
	// 9639 18019:getfield        #12  <Field azh a>
	// 9640 18022:astore_1        
		abyte0.ar = ((azh) (abyte0)).I & ~a.ar;
	// 9641 18023:aload_1         
	// 9642 18024:aload_1         
	// 9643 18025:getfield        #79  <Field int azh.I>
	// 9644 18028:aload_0         
	// 9645 18029:getfield        #12  <Field azh a>
	// 9646 18032:getfield        #435 <Field int azh.ar>
	// 9647 18035:iconst_m1       
	// 9648 18036:ixor            
	// 9649 18037:iand            
	// 9650 18038:putfield        #435 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 9651 18041:aload_0         
	// 9652 18042:getfield        #12  <Field azh a>
	// 9653 18045:astore_1        
		abyte0.aI = ((azh) (abyte0)).c | a.aT;
	// 9654 18046:aload_1         
	// 9655 18047:aload_1         
	// 9656 18048:getfield        #100 <Field int azh.c>
	// 9657 18051:aload_0         
	// 9658 18052:getfield        #12  <Field azh a>
	// 9659 18055:getfield        #447 <Field int azh.aT>
	// 9660 18058:ior             
	// 9661 18059:putfield        #222 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 9662 18062:aload_0         
	// 9663 18063:getfield        #12  <Field azh a>
	// 9664 18066:astore_1        
		abyte0.W = ((azh) (abyte0)).aI | a.I;
	// 9665 18067:aload_1         
	// 9666 18068:aload_1         
	// 9667 18069:getfield        #222 <Field int azh.aI>
	// 9668 18072:aload_0         
	// 9669 18073:getfield        #12  <Field azh a>
	// 9670 18076:getfield        #79  <Field int azh.I>
	// 9671 18079:ior             
	// 9672 18080:putfield        #207 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 9673 18083:aload_0         
	// 9674 18084:getfield        #12  <Field azh a>
	// 9675 18087:astore_1        
		abyte0.W = ((azh) (abyte0)).bW ^ a.W;
	// 9676 18088:aload_1         
	// 9677 18089:aload_1         
	// 9678 18090:getfield        #465 <Field int azh.bW>
	// 9679 18093:aload_0         
	// 9680 18094:getfield        #12  <Field azh a>
	// 9681 18097:getfield        #207 <Field int azh.W>
	// 9682 18100:ixor            
	// 9683 18101:putfield        #207 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 9684 18104:aload_0         
	// 9685 18105:getfield        #12  <Field azh a>
	// 9686 18108:astore_1        
		abyte0.bE = ((azh) (abyte0)).W ^ a.bE;
	// 9687 18109:aload_1         
	// 9688 18110:aload_1         
	// 9689 18111:getfield        #207 <Field int azh.W>
	// 9690 18114:aload_0         
	// 9691 18115:getfield        #12  <Field azh a>
	// 9692 18118:getfield        #375 <Field int azh.bE>
	// 9693 18121:ixor            
	// 9694 18122:putfield        #375 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 9695 18125:aload_0         
	// 9696 18126:getfield        #12  <Field azh a>
	// 9697 18129:astore_1        
		abyte0.bE = ((azh) (abyte0)).k & a.bE;
	// 9698 18130:aload_1         
	// 9699 18131:aload_1         
	// 9700 18132:getfield        #459 <Field int azh.k>
	// 9701 18135:aload_0         
	// 9702 18136:getfield        #12  <Field azh a>
	// 9703 18139:getfield        #375 <Field int azh.bE>
	// 9704 18142:iand            
	// 9705 18143:putfield        #375 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 9706 18146:aload_0         
	// 9707 18147:getfield        #12  <Field azh a>
	// 9708 18150:astore_1        
		abyte0.aI = ((azh) (abyte0)).aI & ~a.I;
	// 9709 18151:aload_1         
	// 9710 18152:aload_1         
	// 9711 18153:getfield        #222 <Field int azh.aI>
	// 9712 18156:aload_0         
	// 9713 18157:getfield        #12  <Field azh a>
	// 9714 18160:getfield        #79  <Field int azh.I>
	// 9715 18163:iconst_m1       
	// 9716 18164:ixor            
	// 9717 18165:iand            
	// 9718 18166:putfield        #222 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 9719 18169:aload_0         
	// 9720 18170:getfield        #12  <Field azh a>
	// 9721 18173:astore_1        
		abyte0.W = ((azh) (abyte0)).A & ~a.bF;
	// 9722 18174:aload_1         
	// 9723 18175:aload_1         
	// 9724 18176:getfield        #97  <Field int azh.A>
	// 9725 18179:aload_0         
	// 9726 18180:getfield        #12  <Field azh a>
	// 9727 18183:getfield        #255 <Field int azh.bF>
	// 9728 18186:iconst_m1       
	// 9729 18187:ixor            
	// 9730 18188:iand            
	// 9731 18189:putfield        #207 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 9732 18192:aload_0         
	// 9733 18193:getfield        #12  <Field azh a>
	// 9734 18196:astore_1        
		abyte0.aS = ((azh) (abyte0)).W ^ a.aS;
	// 9735 18197:aload_1         
	// 9736 18198:aload_1         
	// 9737 18199:getfield        #207 <Field int azh.W>
	// 9738 18202:aload_0         
	// 9739 18203:getfield        #12  <Field azh a>
	// 9740 18206:getfield        #276 <Field int azh.aS>
	// 9741 18209:ixor            
	// 9742 18210:putfield        #276 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 9743 18213:aload_0         
	// 9744 18214:getfield        #12  <Field azh a>
	// 9745 18217:astore_1        
		abyte0.aS = ((azh) (abyte0)).aS & ~a.bb;
	// 9746 18218:aload_1         
	// 9747 18219:aload_1         
	// 9748 18220:getfield        #276 <Field int azh.aS>
	// 9749 18223:aload_0         
	// 9750 18224:getfield        #12  <Field azh a>
	// 9751 18227:getfield        #178 <Field int azh.bb>
	// 9752 18230:iconst_m1       
	// 9753 18231:ixor            
	// 9754 18232:iand            
	// 9755 18233:putfield        #276 <Field int azh.aS>
		abyte0 = ((byte []) (a));
	// 9756 18236:aload_0         
	// 9757 18237:getfield        #12  <Field azh a>
	// 9758 18240:astore_1        
		abyte0.bW = ((azh) (abyte0)).W ^ a.c;
	// 9759 18241:aload_1         
	// 9760 18242:aload_1         
	// 9761 18243:getfield        #207 <Field int azh.W>
	// 9762 18246:aload_0         
	// 9763 18247:getfield        #12  <Field azh a>
	// 9764 18250:getfield        #100 <Field int azh.c>
	// 9765 18253:ixor            
	// 9766 18254:putfield        #465 <Field int azh.bW>
		abyte0 = ((byte []) (a));
	// 9767 18257:aload_0         
	// 9768 18258:getfield        #12  <Field azh a>
	// 9769 18261:astore_1        
		abyte0.W = ((azh) (abyte0)).A & ~a.W;
	// 9770 18262:aload_1         
	// 9771 18263:aload_1         
	// 9772 18264:getfield        #97  <Field int azh.A>
	// 9773 18267:aload_0         
	// 9774 18268:getfield        #12  <Field azh a>
	// 9775 18271:getfield        #207 <Field int azh.W>
	// 9776 18274:iconst_m1       
	// 9777 18275:ixor            
	// 9778 18276:iand            
	// 9779 18277:putfield        #207 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 9780 18280:aload_0         
	// 9781 18281:getfield        #12  <Field azh a>
	// 9782 18284:astore_1        
		abyte0.W = ((azh) (abyte0)).c | a.W;
	// 9783 18285:aload_1         
	// 9784 18286:aload_1         
	// 9785 18287:getfield        #100 <Field int azh.c>
	// 9786 18290:aload_0         
	// 9787 18291:getfield        #12  <Field azh a>
	// 9788 18294:getfield        #207 <Field int azh.W>
	// 9789 18297:ior             
	// 9790 18298:putfield        #207 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 9791 18301:aload_0         
	// 9792 18302:getfield        #12  <Field azh a>
	// 9793 18305:astore_1        
		abyte0.W = ((azh) (abyte0)).aQ ^ a.W;
	// 9794 18306:aload_1         
	// 9795 18307:aload_1         
	// 9796 18308:getfield        #357 <Field int azh.aQ>
	// 9797 18311:aload_0         
	// 9798 18312:getfield        #12  <Field azh a>
	// 9799 18315:getfield        #207 <Field int azh.W>
	// 9800 18318:ixor            
	// 9801 18319:putfield        #207 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 9802 18322:aload_0         
	// 9803 18323:getfield        #12  <Field azh a>
	// 9804 18326:astore_1        
		abyte0.W = ((azh) (abyte0)).I & ~a.W;
	// 9805 18327:aload_1         
	// 9806 18328:aload_1         
	// 9807 18329:getfield        #79  <Field int azh.I>
	// 9808 18332:aload_0         
	// 9809 18333:getfield        #12  <Field azh a>
	// 9810 18336:getfield        #207 <Field int azh.W>
	// 9811 18339:iconst_m1       
	// 9812 18340:ixor            
	// 9813 18341:iand            
	// 9814 18342:putfield        #207 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 9815 18345:aload_0         
	// 9816 18346:getfield        #12  <Field azh a>
	// 9817 18349:astore_1        
		abyte0.W = ((azh) (abyte0)).aT ^ a.W;
	// 9818 18350:aload_1         
	// 9819 18351:aload_1         
	// 9820 18352:getfield        #447 <Field int azh.aT>
	// 9821 18355:aload_0         
	// 9822 18356:getfield        #12  <Field azh a>
	// 9823 18359:getfield        #207 <Field int azh.W>
	// 9824 18362:ixor            
	// 9825 18363:putfield        #207 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 9826 18366:aload_0         
	// 9827 18367:getfield        #12  <Field azh a>
	// 9828 18370:astore_1        
		abyte0.n = ((azh) (abyte0)).A & a.aN;
	// 9829 18371:aload_1         
	// 9830 18372:aload_1         
	// 9831 18373:getfield        #97  <Field int azh.A>
	// 9832 18376:aload_0         
	// 9833 18377:getfield        #12  <Field azh a>
	// 9834 18380:getfield        #384 <Field int azh.aN>
	// 9835 18383:iand            
	// 9836 18384:putfield        #306 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 9837 18387:aload_0         
	// 9838 18388:getfield        #12  <Field azh a>
	// 9839 18391:astore_1        
		abyte0.n = ((azh) (abyte0)).aN ^ a.n;
	// 9840 18392:aload_1         
	// 9841 18393:aload_1         
	// 9842 18394:getfield        #384 <Field int azh.aN>
	// 9843 18397:aload_0         
	// 9844 18398:getfield        #12  <Field azh a>
	// 9845 18401:getfield        #306 <Field int azh.n>
	// 9846 18404:ixor            
	// 9847 18405:putfield        #306 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 9848 18408:aload_0         
	// 9849 18409:getfield        #12  <Field azh a>
	// 9850 18412:astore_1        
		abyte0.n = ((azh) (abyte0)).Q & ~a.n;
	// 9851 18413:aload_1         
	// 9852 18414:aload_1         
	// 9853 18415:getfield        #414 <Field int azh.Q>
	// 9854 18418:aload_0         
	// 9855 18419:getfield        #12  <Field azh a>
	// 9856 18422:getfield        #306 <Field int azh.n>
	// 9857 18425:iconst_m1       
	// 9858 18426:ixor            
	// 9859 18427:iand            
	// 9860 18428:putfield        #306 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 9861 18431:aload_0         
	// 9862 18432:getfield        #12  <Field azh a>
	// 9863 18435:astore_1        
		abyte0.n = ((azh) (abyte0)).bj ^ a.n;
	// 9864 18436:aload_1         
	// 9865 18437:aload_1         
	// 9866 18438:getfield        #297 <Field int azh.bj>
	// 9867 18441:aload_0         
	// 9868 18442:getfield        #12  <Field azh a>
	// 9869 18445:getfield        #306 <Field int azh.n>
	// 9870 18448:ixor            
	// 9871 18449:putfield        #306 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 9872 18452:aload_0         
	// 9873 18453:getfield        #12  <Field azh a>
	// 9874 18456:astore_1        
		abyte0.am = ((azh) (abyte0)).n ^ a.am;
	// 9875 18457:aload_1         
	// 9876 18458:aload_1         
	// 9877 18459:getfield        #306 <Field int azh.n>
	// 9878 18462:aload_0         
	// 9879 18463:getfield        #12  <Field azh a>
	// 9880 18466:getfield        #471 <Field int azh.am>
	// 9881 18469:ixor            
	// 9882 18470:putfield        #471 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 9883 18473:aload_0         
	// 9884 18474:getfield        #12  <Field azh a>
	// 9885 18477:astore_1        
		abyte0.n = ((azh) (abyte0)).A & ~a.I;
	// 9886 18478:aload_1         
	// 9887 18479:aload_1         
	// 9888 18480:getfield        #97  <Field int azh.A>
	// 9889 18483:aload_0         
	// 9890 18484:getfield        #12  <Field azh a>
	// 9891 18487:getfield        #79  <Field int azh.I>
	// 9892 18490:iconst_m1       
	// 9893 18491:ixor            
	// 9894 18492:iand            
	// 9895 18493:putfield        #306 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 9896 18496:aload_0         
	// 9897 18497:getfield        #12  <Field azh a>
	// 9898 18500:astore_1        
		abyte0.n = ((azh) (abyte0)).ag ^ a.n;
	// 9899 18501:aload_1         
	// 9900 18502:aload_1         
	// 9901 18503:getfield        #477 <Field int azh.ag>
	// 9902 18506:aload_0         
	// 9903 18507:getfield        #12  <Field azh a>
	// 9904 18510:getfield        #306 <Field int azh.n>
	// 9905 18513:ixor            
	// 9906 18514:putfield        #306 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 9907 18517:aload_0         
	// 9908 18518:getfield        #12  <Field azh a>
	// 9909 18521:astore_1        
		abyte0.by = ((azh) (abyte0)).n ^ a.by;
	// 9910 18522:aload_1         
	// 9911 18523:aload_1         
	// 9912 18524:getfield        #306 <Field int azh.n>
	// 9913 18527:aload_0         
	// 9914 18528:getfield        #12  <Field azh a>
	// 9915 18531:getfield        #354 <Field int azh.by>
	// 9916 18534:ixor            
	// 9917 18535:putfield        #354 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 9918 18538:aload_0         
	// 9919 18539:getfield        #12  <Field azh a>
	// 9920 18542:astore_1        
		abyte0.by = ((azh) (abyte0)).Y & ~a.by;
	// 9921 18543:aload_1         
	// 9922 18544:aload_1         
	// 9923 18545:getfield        #91  <Field int azh.Y>
	// 9924 18548:aload_0         
	// 9925 18549:getfield        #12  <Field azh a>
	// 9926 18552:getfield        #354 <Field int azh.by>
	// 9927 18555:iconst_m1       
	// 9928 18556:ixor            
	// 9929 18557:iand            
	// 9930 18558:putfield        #354 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 9931 18561:aload_0         
	// 9932 18562:getfield        #12  <Field azh a>
	// 9933 18565:astore_1        
		abyte0.bj = ((azh) (abyte0)).Q & ~a.n;
	// 9934 18566:aload_1         
	// 9935 18567:aload_1         
	// 9936 18568:getfield        #414 <Field int azh.Q>
	// 9937 18571:aload_0         
	// 9938 18572:getfield        #12  <Field azh a>
	// 9939 18575:getfield        #306 <Field int azh.n>
	// 9940 18578:iconst_m1       
	// 9941 18579:ixor            
	// 9942 18580:iand            
	// 9943 18581:putfield        #297 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 9944 18584:aload_0         
	// 9945 18585:getfield        #12  <Field azh a>
	// 9946 18588:astore_1        
		abyte0.bj = ((azh) (abyte0)).au ^ a.bj;
	// 9947 18589:aload_1         
	// 9948 18590:aload_1         
	// 9949 18591:getfield        #85  <Field int azh.au>
	// 9950 18594:aload_0         
	// 9951 18595:getfield        #12  <Field azh a>
	// 9952 18598:getfield        #297 <Field int azh.bj>
	// 9953 18601:ixor            
	// 9954 18602:putfield        #297 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 9955 18605:aload_0         
	// 9956 18606:getfield        #12  <Field azh a>
	// 9957 18609:astore_1        
		abyte0.bj = ((azh) (abyte0)).Y & a.bj;
	// 9958 18610:aload_1         
	// 9959 18611:aload_1         
	// 9960 18612:getfield        #91  <Field int azh.Y>
	// 9961 18615:aload_0         
	// 9962 18616:getfield        #12  <Field azh a>
	// 9963 18619:getfield        #297 <Field int azh.bj>
	// 9964 18622:iand            
	// 9965 18623:putfield        #297 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 9966 18626:aload_0         
	// 9967 18627:getfield        #12  <Field azh a>
	// 9968 18630:astore_1        
		abyte0.au = ((azh) (abyte0)).A & ~a.bP;
	// 9969 18631:aload_1         
	// 9970 18632:aload_1         
	// 9971 18633:getfield        #97  <Field int azh.A>
	// 9972 18636:aload_0         
	// 9973 18637:getfield        #12  <Field azh a>
	// 9974 18640:getfield        #474 <Field int azh.bP>
	// 9975 18643:iconst_m1       
	// 9976 18644:ixor            
	// 9977 18645:iand            
	// 9978 18646:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 9979 18649:aload_0         
	// 9980 18650:getfield        #12  <Field azh a>
	// 9981 18653:astore_1        
		abyte0.au = ((azh) (abyte0)).bP ^ a.au;
	// 9982 18654:aload_1         
	// 9983 18655:aload_1         
	// 9984 18656:getfield        #474 <Field int azh.bP>
	// 9985 18659:aload_0         
	// 9986 18660:getfield        #12  <Field azh a>
	// 9987 18663:getfield        #85  <Field int azh.au>
	// 9988 18666:ixor            
	// 9989 18667:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 9990 18670:aload_0         
	// 9991 18671:getfield        #12  <Field azh a>
	// 9992 18674:astore_1        
		abyte0.bU = ((azh) (abyte0)).au ^ a.bU;
	// 9993 18675:aload_1         
	// 9994 18676:aload_1         
	// 9995 18677:getfield        #85  <Field int azh.au>
	// 9996 18680:aload_0         
	// 9997 18681:getfield        #12  <Field azh a>
	// 9998 18684:getfield        #216 <Field int azh.bU>
	// 9999 18687:ixor            
	// 10000 18688:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 10001 18691:aload_0         
	// 10002 18692:getfield        #12  <Field azh a>
	// 10003 18695:astore_1        
		abyte0.bU = ((azh) (abyte0)).Y & ~a.bU;
	// 10004 18696:aload_1         
	// 10005 18697:aload_1         
	// 10006 18698:getfield        #91  <Field int azh.Y>
	// 10007 18701:aload_0         
	// 10008 18702:getfield        #12  <Field azh a>
	// 10009 18705:getfield        #216 <Field int azh.bU>
	// 10010 18708:iconst_m1       
	// 10011 18709:ixor            
	// 10012 18710:iand            
	// 10013 18711:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 10014 18714:aload_0         
	// 10015 18715:getfield        #12  <Field azh a>
	// 10016 18718:astore_1        
		abyte0.bU = ((azh) (abyte0)).aH ^ a.bU;
	// 10017 18719:aload_1         
	// 10018 18720:aload_1         
	// 10019 18721:getfield        #109 <Field int azh.aH>
	// 10020 18724:aload_0         
	// 10021 18725:getfield        #12  <Field azh a>
	// 10022 18728:getfield        #216 <Field int azh.bU>
	// 10023 18731:ixor            
	// 10024 18732:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 10025 18735:aload_0         
	// 10026 18736:getfield        #12  <Field azh a>
	// 10027 18739:astore_1        
		abyte0.bU = ((azh) (abyte0)).e | a.bU;
	// 10028 18740:aload_1         
	// 10029 18741:aload_1         
	// 10030 18742:getfield        #291 <Field int azh.e>
	// 10031 18745:aload_0         
	// 10032 18746:getfield        #12  <Field azh a>
	// 10033 18749:getfield        #216 <Field int azh.bU>
	// 10034 18752:ior             
	// 10035 18753:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 10036 18756:aload_0         
	// 10037 18757:getfield        #12  <Field azh a>
	// 10038 18760:astore_1        
		abyte0.au = ((azh) (abyte0)).Q & ~a.au;
	// 10039 18761:aload_1         
	// 10040 18762:aload_1         
	// 10041 18763:getfield        #414 <Field int azh.Q>
	// 10042 18766:aload_0         
	// 10043 18767:getfield        #12  <Field azh a>
	// 10044 18770:getfield        #85  <Field int azh.au>
	// 10045 18773:iconst_m1       
	// 10046 18774:ixor            
	// 10047 18775:iand            
	// 10048 18776:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 10049 18779:aload_0         
	// 10050 18780:getfield        #12  <Field azh a>
	// 10051 18783:astore_1        
		abyte0.aH = ((azh) (abyte0)).A & ~a.bV;
	// 10052 18784:aload_1         
	// 10053 18785:aload_1         
	// 10054 18786:getfield        #97  <Field int azh.A>
	// 10055 18789:aload_0         
	// 10056 18790:getfield        #12  <Field azh a>
	// 10057 18793:getfield        #324 <Field int azh.bV>
	// 10058 18796:iconst_m1       
	// 10059 18797:ixor            
	// 10060 18798:iand            
	// 10061 18799:putfield        #109 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 10062 18802:aload_0         
	// 10063 18803:getfield        #12  <Field azh a>
	// 10064 18806:astore_1        
		abyte0.aH = ((azh) (abyte0)).bP ^ a.aH;
	// 10065 18807:aload_1         
	// 10066 18808:aload_1         
	// 10067 18809:getfield        #474 <Field int azh.bP>
	// 10068 18812:aload_0         
	// 10069 18813:getfield        #12  <Field azh a>
	// 10070 18816:getfield        #109 <Field int azh.aH>
	// 10071 18819:ixor            
	// 10072 18820:putfield        #109 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 10073 18823:aload_0         
	// 10074 18824:getfield        #12  <Field azh a>
	// 10075 18827:astore_1        
		abyte0.aH = ((azh) (abyte0)).Q | a.aH;
	// 10076 18828:aload_1         
	// 10077 18829:aload_1         
	// 10078 18830:getfield        #414 <Field int azh.Q>
	// 10079 18833:aload_0         
	// 10080 18834:getfield        #12  <Field azh a>
	// 10081 18837:getfield        #109 <Field int azh.aH>
	// 10082 18840:ior             
	// 10083 18841:putfield        #109 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 10084 18844:aload_0         
	// 10085 18845:getfield        #12  <Field azh a>
	// 10086 18848:astore_1        
		abyte0.aH = ((azh) (abyte0)).n ^ a.aH;
	// 10087 18849:aload_1         
	// 10088 18850:aload_1         
	// 10089 18851:getfield        #306 <Field int azh.n>
	// 10090 18854:aload_0         
	// 10091 18855:getfield        #12  <Field azh a>
	// 10092 18858:getfield        #109 <Field int azh.aH>
	// 10093 18861:ixor            
	// 10094 18862:putfield        #109 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 10095 18865:aload_0         
	// 10096 18866:getfield        #12  <Field azh a>
	// 10097 18869:astore_1        
		abyte0.bj = ((azh) (abyte0)).aH ^ a.bj;
	// 10098 18870:aload_1         
	// 10099 18871:aload_1         
	// 10100 18872:getfield        #109 <Field int azh.aH>
	// 10101 18875:aload_0         
	// 10102 18876:getfield        #12  <Field azh a>
	// 10103 18879:getfield        #297 <Field int azh.bj>
	// 10104 18882:ixor            
	// 10105 18883:putfield        #297 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 10106 18886:aload_0         
	// 10107 18887:getfield        #12  <Field azh a>
	// 10108 18890:astore_1        
		abyte0.bU = ((azh) (abyte0)).bj ^ a.bU;
	// 10109 18891:aload_1         
	// 10110 18892:aload_1         
	// 10111 18893:getfield        #297 <Field int azh.bj>
	// 10112 18896:aload_0         
	// 10113 18897:getfield        #12  <Field azh a>
	// 10114 18900:getfield        #216 <Field int azh.bU>
	// 10115 18903:ixor            
	// 10116 18904:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 10117 18907:aload_0         
	// 10118 18908:getfield        #12  <Field azh a>
	// 10119 18911:astore_1        
		abyte0.h = ((azh) (abyte0)).bU ^ a.h;
	// 10120 18912:aload_1         
	// 10121 18913:aload_1         
	// 10122 18914:getfield        #216 <Field int azh.bU>
	// 10123 18917:aload_0         
	// 10124 18918:getfield        #12  <Field azh a>
	// 10125 18921:getfield        #94  <Field int azh.h>
	// 10126 18924:ixor            
	// 10127 18925:putfield        #94  <Field int azh.h>
		abyte0 = ((byte []) (a));
	// 10128 18928:aload_0         
	// 10129 18929:getfield        #12  <Field azh a>
	// 10130 18932:astore_1        
		abyte0.bG = ((azh) (abyte0)).h & a.bG;
	// 10131 18933:aload_1         
	// 10132 18934:aload_1         
	// 10133 18935:getfield        #94  <Field int azh.h>
	// 10134 18938:aload_0         
	// 10135 18939:getfield        #12  <Field azh a>
	// 10136 18942:getfield        #330 <Field int azh.bG>
	// 10137 18945:iand            
	// 10138 18946:putfield        #330 <Field int azh.bG>
		abyte0 = ((byte []) (a));
	// 10139 18949:aload_0         
	// 10140 18950:getfield        #12  <Field azh a>
	// 10141 18953:astore_1        
		abyte0.bU = ((azh) (abyte0)).A & ~a.I;
	// 10142 18954:aload_1         
	// 10143 18955:aload_1         
	// 10144 18956:getfield        #97  <Field int azh.A>
	// 10145 18959:aload_0         
	// 10146 18960:getfield        #12  <Field azh a>
	// 10147 18963:getfield        #79  <Field int azh.I>
	// 10148 18966:iconst_m1       
	// 10149 18967:ixor            
	// 10150 18968:iand            
	// 10151 18969:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 10152 18972:aload_0         
	// 10153 18973:getfield        #12  <Field azh a>
	// 10154 18976:astore_1        
		abyte0.bU = ((azh) (abyte0)).bJ ^ a.bU;
	// 10155 18977:aload_1         
	// 10156 18978:aload_1         
	// 10157 18979:getfield        #53  <Field int azh.bJ>
	// 10158 18982:aload_0         
	// 10159 18983:getfield        #12  <Field azh a>
	// 10160 18986:getfield        #216 <Field int azh.bU>
	// 10161 18989:ixor            
	// 10162 18990:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 10163 18993:aload_0         
	// 10164 18994:getfield        #12  <Field azh a>
	// 10165 18997:astore_1        
		abyte0.bJ = ((azh) (abyte0)).Q & ~a.bU;
	// 10166 18998:aload_1         
	// 10167 18999:aload_1         
	// 10168 19000:getfield        #414 <Field int azh.Q>
	// 10169 19003:aload_0         
	// 10170 19004:getfield        #12  <Field azh a>
	// 10171 19007:getfield        #216 <Field int azh.bU>
	// 10172 19010:iconst_m1       
	// 10173 19011:ixor            
	// 10174 19012:iand            
	// 10175 19013:putfield        #53  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 10176 19016:aload_0         
	// 10177 19017:getfield        #12  <Field azh a>
	// 10178 19020:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bU ^ a.bJ;
	// 10179 19021:aload_1         
	// 10180 19022:aload_1         
	// 10181 19023:getfield        #216 <Field int azh.bU>
	// 10182 19026:aload_0         
	// 10183 19027:getfield        #12  <Field azh a>
	// 10184 19030:getfield        #53  <Field int azh.bJ>
	// 10185 19033:ixor            
	// 10186 19034:putfield        #53  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 10187 19037:aload_0         
	// 10188 19038:getfield        #12  <Field azh a>
	// 10189 19041:astore_1        
		abyte0.bU = ((azh) (abyte0)).A & a.ag;
	// 10190 19042:aload_1         
	// 10191 19043:aload_1         
	// 10192 19044:getfield        #97  <Field int azh.A>
	// 10193 19047:aload_0         
	// 10194 19048:getfield        #12  <Field azh a>
	// 10195 19051:getfield        #477 <Field int azh.ag>
	// 10196 19054:iand            
	// 10197 19055:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 10198 19058:aload_0         
	// 10199 19059:getfield        #12  <Field azh a>
	// 10200 19062:astore_1        
		abyte0.bU = ((azh) (abyte0)).bP ^ a.bU;
	// 10201 19063:aload_1         
	// 10202 19064:aload_1         
	// 10203 19065:getfield        #474 <Field int azh.bP>
	// 10204 19068:aload_0         
	// 10205 19069:getfield        #12  <Field azh a>
	// 10206 19072:getfield        #216 <Field int azh.bU>
	// 10207 19075:ixor            
	// 10208 19076:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 10209 19079:aload_0         
	// 10210 19080:getfield        #12  <Field azh a>
	// 10211 19083:astore_1        
		abyte0.bP = ((azh) (abyte0)).Q & a.bU;
	// 10212 19084:aload_1         
	// 10213 19085:aload_1         
	// 10214 19086:getfield        #414 <Field int azh.Q>
	// 10215 19089:aload_0         
	// 10216 19090:getfield        #12  <Field azh a>
	// 10217 19093:getfield        #216 <Field int azh.bU>
	// 10218 19096:iand            
	// 10219 19097:putfield        #474 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 10220 19100:aload_0         
	// 10221 19101:getfield        #12  <Field azh a>
	// 10222 19104:astore_1        
		abyte0.bP = ((azh) (abyte0)).I ^ a.bP;
	// 10223 19105:aload_1         
	// 10224 19106:aload_1         
	// 10225 19107:getfield        #79  <Field int azh.I>
	// 10226 19110:aload_0         
	// 10227 19111:getfield        #12  <Field azh a>
	// 10228 19114:getfield        #474 <Field int azh.bP>
	// 10229 19117:ixor            
	// 10230 19118:putfield        #474 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 10231 19121:aload_0         
	// 10232 19122:getfield        #12  <Field azh a>
	// 10233 19125:astore_1        
		abyte0.bP = ((azh) (abyte0)).Y & a.bP;
	// 10234 19126:aload_1         
	// 10235 19127:aload_1         
	// 10236 19128:getfield        #91  <Field int azh.Y>
	// 10237 19131:aload_0         
	// 10238 19132:getfield        #12  <Field azh a>
	// 10239 19135:getfield        #474 <Field int azh.bP>
	// 10240 19138:iand            
	// 10241 19139:putfield        #474 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 10242 19142:aload_0         
	// 10243 19143:getfield        #12  <Field azh a>
	// 10244 19146:astore_1        
		abyte0.bP = ((azh) (abyte0)).bx ^ a.bP;
	// 10245 19147:aload_1         
	// 10246 19148:aload_1         
	// 10247 19149:getfield        #453 <Field int azh.bx>
	// 10248 19152:aload_0         
	// 10249 19153:getfield        #12  <Field azh a>
	// 10250 19156:getfield        #474 <Field int azh.bP>
	// 10251 19159:ixor            
	// 10252 19160:putfield        #474 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 10253 19163:aload_0         
	// 10254 19164:getfield        #12  <Field azh a>
	// 10255 19167:astore_1        
		abyte0.bP = ((azh) (abyte0)).e | a.bP;
	// 10256 19168:aload_1         
	// 10257 19169:aload_1         
	// 10258 19170:getfield        #291 <Field int azh.e>
	// 10259 19173:aload_0         
	// 10260 19174:getfield        #12  <Field azh a>
	// 10261 19177:getfield        #474 <Field int azh.bP>
	// 10262 19180:ior             
	// 10263 19181:putfield        #474 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 10264 19184:aload_0         
	// 10265 19185:getfield        #12  <Field azh a>
	// 10266 19188:astore_1        
		abyte0.av = ((azh) (abyte0)).bU ^ a.av;
	// 10267 19189:aload_1         
	// 10268 19190:aload_1         
	// 10269 19191:getfield        #216 <Field int azh.bU>
	// 10270 19194:aload_0         
	// 10271 19195:getfield        #12  <Field azh a>
	// 10272 19198:getfield        #106 <Field int azh.av>
	// 10273 19201:ixor            
	// 10274 19202:putfield        #106 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 10275 19205:aload_0         
	// 10276 19206:getfield        #12  <Field azh a>
	// 10277 19209:astore_1        
		abyte0.by = ((azh) (abyte0)).av ^ a.by;
	// 10278 19210:aload_1         
	// 10279 19211:aload_1         
	// 10280 19212:getfield        #106 <Field int azh.av>
	// 10281 19215:aload_0         
	// 10282 19216:getfield        #12  <Field azh a>
	// 10283 19219:getfield        #354 <Field int azh.by>
	// 10284 19222:ixor            
	// 10285 19223:putfield        #354 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 10286 19226:aload_0         
	// 10287 19227:getfield        #12  <Field azh a>
	// 10288 19230:astore_1        
		abyte0.bP = ((azh) (abyte0)).by ^ a.bP;
	// 10289 19231:aload_1         
	// 10290 19232:aload_1         
	// 10291 19233:getfield        #354 <Field int azh.by>
	// 10292 19236:aload_0         
	// 10293 19237:getfield        #12  <Field azh a>
	// 10294 19240:getfield        #474 <Field int azh.bP>
	// 10295 19243:ixor            
	// 10296 19244:putfield        #474 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 10297 19247:aload_0         
	// 10298 19248:getfield        #12  <Field azh a>
	// 10299 19251:astore_1        
		abyte0.v = ((azh) (abyte0)).bP ^ a.v;
	// 10300 19252:aload_1         
	// 10301 19253:aload_1         
	// 10302 19254:getfield        #474 <Field int azh.bP>
	// 10303 19257:aload_0         
	// 10304 19258:getfield        #12  <Field azh a>
	// 10305 19261:getfield        #258 <Field int azh.v>
	// 10306 19264:ixor            
	// 10307 19265:putfield        #258 <Field int azh.v>
		abyte0 = ((byte []) (a));
	// 10308 19268:aload_0         
	// 10309 19269:getfield        #12  <Field azh a>
	// 10310 19272:astore_1        
		abyte0.bP = ((azh) (abyte0)).L & ~a.v;
	// 10311 19273:aload_1         
	// 10312 19274:aload_1         
	// 10313 19275:getfield        #237 <Field int azh.L>
	// 10314 19278:aload_0         
	// 10315 19279:getfield        #12  <Field azh a>
	// 10316 19282:getfield        #258 <Field int azh.v>
	// 10317 19285:iconst_m1       
	// 10318 19286:ixor            
	// 10319 19287:iand            
	// 10320 19288:putfield        #474 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 10321 19291:aload_0         
	// 10322 19292:getfield        #12  <Field azh a>
	// 10323 19295:astore_1        
		abyte0.by = ((azh) (abyte0)).L & ~a.bP;
	// 10324 19296:aload_1         
	// 10325 19297:aload_1         
	// 10326 19298:getfield        #237 <Field int azh.L>
	// 10327 19301:aload_0         
	// 10328 19302:getfield        #12  <Field azh a>
	// 10329 19305:getfield        #474 <Field int azh.bP>
	// 10330 19308:iconst_m1       
	// 10331 19309:ixor            
	// 10332 19310:iand            
	// 10333 19311:putfield        #354 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 10334 19314:aload_0         
	// 10335 19315:getfield        #12  <Field azh a>
	// 10336 19318:astore_1        
		abyte0.bd = ((azh) (abyte0)).bP ^ a.bd;
	// 10337 19319:aload_1         
	// 10338 19320:aload_1         
	// 10339 19321:getfield        #474 <Field int azh.bP>
	// 10340 19324:aload_0         
	// 10341 19325:getfield        #12  <Field azh a>
	// 10342 19328:getfield        #303 <Field int azh.bd>
	// 10343 19331:ixor            
	// 10344 19332:putfield        #303 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 10345 19335:aload_0         
	// 10346 19336:getfield        #12  <Field azh a>
	// 10347 19339:astore_1        
		abyte0.bd = ((azh) (abyte0)).bd & ~a.aG;
	// 10348 19340:aload_1         
	// 10349 19341:aload_1         
	// 10350 19342:getfield        #303 <Field int azh.bd>
	// 10351 19345:aload_0         
	// 10352 19346:getfield        #12  <Field azh a>
	// 10353 19349:getfield        #267 <Field int azh.aG>
	// 10354 19352:iconst_m1       
	// 10355 19353:ixor            
	// 10356 19354:iand            
	// 10357 19355:putfield        #303 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 10358 19358:aload_0         
	// 10359 19359:getfield        #12  <Field azh a>
	// 10360 19362:astore_1        
		abyte0.bd = ((azh) (abyte0)).v ^ a.bd;
	// 10361 19363:aload_1         
	// 10362 19364:aload_1         
	// 10363 19365:getfield        #258 <Field int azh.v>
	// 10364 19368:aload_0         
	// 10365 19369:getfield        #12  <Field azh a>
	// 10366 19372:getfield        #303 <Field int azh.bd>
	// 10367 19375:ixor            
	// 10368 19376:putfield        #303 <Field int azh.bd>
		abyte0 = ((byte []) (a));
	// 10369 19379:aload_0         
	// 10370 19380:getfield        #12  <Field azh a>
	// 10371 19383:astore_1        
		abyte0.av = ((azh) (abyte0)).f | a.bP;
	// 10372 19384:aload_1         
	// 10373 19385:aload_1         
	// 10374 19386:getfield        #261 <Field int azh.f>
	// 10375 19389:aload_0         
	// 10376 19390:getfield        #12  <Field azh a>
	// 10377 19393:getfield        #474 <Field int azh.bP>
	// 10378 19396:ior             
	// 10379 19397:putfield        #106 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 10380 19400:aload_0         
	// 10381 19401:getfield        #12  <Field azh a>
	// 10382 19404:astore_1        
		abyte0.av = ((azh) (abyte0)).L ^ a.av;
	// 10383 19405:aload_1         
	// 10384 19406:aload_1         
	// 10385 19407:getfield        #237 <Field int azh.L>
	// 10386 19410:aload_0         
	// 10387 19411:getfield        #12  <Field azh a>
	// 10388 19414:getfield        #106 <Field int azh.av>
	// 10389 19417:ixor            
	// 10390 19418:putfield        #106 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 10391 19421:aload_0         
	// 10392 19422:getfield        #12  <Field azh a>
	// 10393 19425:astore_1        
		abyte0.av = ((azh) (abyte0)).aG | a.av;
	// 10394 19426:aload_1         
	// 10395 19427:aload_1         
	// 10396 19428:getfield        #267 <Field int azh.aG>
	// 10397 19431:aload_0         
	// 10398 19432:getfield        #12  <Field azh a>
	// 10399 19435:getfield        #106 <Field int azh.av>
	// 10400 19438:ior             
	// 10401 19439:putfield        #106 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 10402 19442:aload_0         
	// 10403 19443:getfield        #12  <Field azh a>
	// 10404 19446:astore_1        
		abyte0.bU = ((azh) (abyte0)).f | a.bP;
	// 10405 19447:aload_1         
	// 10406 19448:aload_1         
	// 10407 19449:getfield        #261 <Field int azh.f>
	// 10408 19452:aload_0         
	// 10409 19453:getfield        #12  <Field azh a>
	// 10410 19456:getfield        #474 <Field int azh.bP>
	// 10411 19459:ior             
	// 10412 19460:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 10413 19463:aload_0         
	// 10414 19464:getfield        #12  <Field azh a>
	// 10415 19467:astore_1        
		abyte0.bx = ((azh) (abyte0)).bP & ~a.f;
	// 10416 19468:aload_1         
	// 10417 19469:aload_1         
	// 10418 19470:getfield        #474 <Field int azh.bP>
	// 10419 19473:aload_0         
	// 10420 19474:getfield        #12  <Field azh a>
	// 10421 19477:getfield        #261 <Field int azh.f>
	// 10422 19480:iconst_m1       
	// 10423 19481:ixor            
	// 10424 19482:iand            
	// 10425 19483:putfield        #453 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 10426 19486:aload_0         
	// 10427 19487:getfield        #12  <Field azh a>
	// 10428 19490:astore_1        
		abyte0.bj = ((azh) (abyte0)).v & ~a.L;
	// 10429 19491:aload_1         
	// 10430 19492:aload_1         
	// 10431 19493:getfield        #258 <Field int azh.v>
	// 10432 19496:aload_0         
	// 10433 19497:getfield        #12  <Field azh a>
	// 10434 19500:getfield        #237 <Field int azh.L>
	// 10435 19503:iconst_m1       
	// 10436 19504:ixor            
	// 10437 19505:iand            
	// 10438 19506:putfield        #297 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 10439 19509:aload_0         
	// 10440 19510:getfield        #12  <Field azh a>
	// 10441 19513:astore_1        
		abyte0.aH = ((azh) (abyte0)).f | a.bj;
	// 10442 19514:aload_1         
	// 10443 19515:aload_1         
	// 10444 19516:getfield        #261 <Field int azh.f>
	// 10445 19519:aload_0         
	// 10446 19520:getfield        #12  <Field azh a>
	// 10447 19523:getfield        #297 <Field int azh.bj>
	// 10448 19526:ior             
	// 10449 19527:putfield        #109 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 10450 19530:aload_0         
	// 10451 19531:getfield        #12  <Field azh a>
	// 10452 19534:astore_1        
		abyte0.n = ((azh) (abyte0)).f | a.bj;
	// 10453 19535:aload_1         
	// 10454 19536:aload_1         
	// 10455 19537:getfield        #261 <Field int azh.f>
	// 10456 19540:aload_0         
	// 10457 19541:getfield        #12  <Field azh a>
	// 10458 19544:getfield        #297 <Field int azh.bj>
	// 10459 19547:ior             
	// 10460 19548:putfield        #306 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10461 19551:aload_0         
	// 10462 19552:getfield        #12  <Field azh a>
	// 10463 19555:astore_1        
		abyte0.n = ((azh) (abyte0)).by ^ a.n;
	// 10464 19556:aload_1         
	// 10465 19557:aload_1         
	// 10466 19558:getfield        #354 <Field int azh.by>
	// 10467 19561:aload_0         
	// 10468 19562:getfield        #12  <Field azh a>
	// 10469 19565:getfield        #306 <Field int azh.n>
	// 10470 19568:ixor            
	// 10471 19569:putfield        #306 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10472 19572:aload_0         
	// 10473 19573:getfield        #12  <Field azh a>
	// 10474 19576:astore_1        
		abyte0.by = ((azh) (abyte0)).L | a.bj;
	// 10475 19577:aload_1         
	// 10476 19578:aload_1         
	// 10477 19579:getfield        #237 <Field int azh.L>
	// 10478 19582:aload_0         
	// 10479 19583:getfield        #12  <Field azh a>
	// 10480 19586:getfield        #297 <Field int azh.bj>
	// 10481 19589:ior             
	// 10482 19590:putfield        #354 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 10483 19593:aload_0         
	// 10484 19594:getfield        #12  <Field azh a>
	// 10485 19597:astore_1        
		abyte0.aH = ((azh) (abyte0)).by ^ a.aH;
	// 10486 19598:aload_1         
	// 10487 19599:aload_1         
	// 10488 19600:getfield        #354 <Field int azh.by>
	// 10489 19603:aload_0         
	// 10490 19604:getfield        #12  <Field azh a>
	// 10491 19607:getfield        #109 <Field int azh.aH>
	// 10492 19610:ixor            
	// 10493 19611:putfield        #109 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 10494 19614:aload_0         
	// 10495 19615:getfield        #12  <Field azh a>
	// 10496 19618:astore_1        
		abyte0.aH = ((azh) (abyte0)).aG | a.aH;
	// 10497 19619:aload_1         
	// 10498 19620:aload_1         
	// 10499 19621:getfield        #267 <Field int azh.aG>
	// 10500 19624:aload_0         
	// 10501 19625:getfield        #12  <Field azh a>
	// 10502 19628:getfield        #109 <Field int azh.aH>
	// 10503 19631:ior             
	// 10504 19632:putfield        #109 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 10505 19635:aload_0         
	// 10506 19636:getfield        #12  <Field azh a>
	// 10507 19639:astore_1        
		abyte0.by = ((azh) (abyte0)).by & ~a.f;
	// 10508 19640:aload_1         
	// 10509 19641:aload_1         
	// 10510 19642:getfield        #354 <Field int azh.by>
	// 10511 19645:aload_0         
	// 10512 19646:getfield        #12  <Field azh a>
	// 10513 19649:getfield        #261 <Field int azh.f>
	// 10514 19652:iconst_m1       
	// 10515 19653:ixor            
	// 10516 19654:iand            
	// 10517 19655:putfield        #354 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 10518 19658:aload_0         
	// 10519 19659:getfield        #12  <Field azh a>
	// 10520 19662:astore_1        
		abyte0.by = ((azh) (abyte0)).v ^ a.by;
	// 10521 19663:aload_1         
	// 10522 19664:aload_1         
	// 10523 19665:getfield        #258 <Field int azh.v>
	// 10524 19668:aload_0         
	// 10525 19669:getfield        #12  <Field azh a>
	// 10526 19672:getfield        #354 <Field int azh.by>
	// 10527 19675:ixor            
	// 10528 19676:putfield        #354 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 10529 19679:aload_0         
	// 10530 19680:getfield        #12  <Field azh a>
	// 10531 19683:astore_1        
		abyte0.aH = ((azh) (abyte0)).by ^ a.aH;
	// 10532 19684:aload_1         
	// 10533 19685:aload_1         
	// 10534 19686:getfield        #354 <Field int azh.by>
	// 10535 19689:aload_0         
	// 10536 19690:getfield        #12  <Field azh a>
	// 10537 19693:getfield        #109 <Field int azh.aH>
	// 10538 19696:ixor            
	// 10539 19697:putfield        #109 <Field int azh.aH>
		abyte0 = ((byte []) (a));
	// 10540 19700:aload_0         
	// 10541 19701:getfield        #12  <Field azh a>
	// 10542 19704:astore_1        
		abyte0.bj = ((azh) (abyte0)).bj & ~a.f;
	// 10543 19705:aload_1         
	// 10544 19706:aload_1         
	// 10545 19707:getfield        #297 <Field int azh.bj>
	// 10546 19710:aload_0         
	// 10547 19711:getfield        #12  <Field azh a>
	// 10548 19714:getfield        #261 <Field int azh.f>
	// 10549 19717:iconst_m1       
	// 10550 19718:ixor            
	// 10551 19719:iand            
	// 10552 19720:putfield        #297 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 10553 19723:aload_0         
	// 10554 19724:getfield        #12  <Field azh a>
	// 10555 19727:astore_1        
		abyte0.bj = ((azh) (abyte0)).bP ^ a.bj;
	// 10556 19728:aload_1         
	// 10557 19729:aload_1         
	// 10558 19730:getfield        #474 <Field int azh.bP>
	// 10559 19733:aload_0         
	// 10560 19734:getfield        #12  <Field azh a>
	// 10561 19737:getfield        #297 <Field int azh.bj>
	// 10562 19740:ixor            
	// 10563 19741:putfield        #297 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 10564 19744:aload_0         
	// 10565 19745:getfield        #12  <Field azh a>
	// 10566 19748:astore_1        
		abyte0.bg = ((azh) (abyte0)).bj ^ a.bg;
	// 10567 19749:aload_1         
	// 10568 19750:aload_1         
	// 10569 19751:getfield        #297 <Field int azh.bj>
	// 10570 19754:aload_0         
	// 10571 19755:getfield        #12  <Field azh a>
	// 10572 19758:getfield        #312 <Field int azh.bg>
	// 10573 19761:ixor            
	// 10574 19762:putfield        #312 <Field int azh.bg>
		abyte0 = ((byte []) (a));
	// 10575 19765:aload_0         
	// 10576 19766:getfield        #12  <Field azh a>
	// 10577 19769:astore_1        
		abyte0.bj = ((azh) (abyte0)).L | a.v;
	// 10578 19770:aload_1         
	// 10579 19771:aload_1         
	// 10580 19772:getfield        #237 <Field int azh.L>
	// 10581 19775:aload_0         
	// 10582 19776:getfield        #12  <Field azh a>
	// 10583 19779:getfield        #258 <Field int azh.v>
	// 10584 19782:ior             
	// 10585 19783:putfield        #297 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 10586 19786:aload_0         
	// 10587 19787:getfield        #12  <Field azh a>
	// 10588 19790:astore_1        
		abyte0.aR = ((azh) (abyte0)).bj ^ a.aR;
	// 10589 19791:aload_1         
	// 10590 19792:aload_1         
	// 10591 19793:getfield        #297 <Field int azh.bj>
	// 10592 19796:aload_0         
	// 10593 19797:getfield        #12  <Field azh a>
	// 10594 19800:getfield        #369 <Field int azh.aR>
	// 10595 19803:ixor            
	// 10596 19804:putfield        #369 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 10597 19807:aload_0         
	// 10598 19808:getfield        #12  <Field azh a>
	// 10599 19811:astore_1        
		abyte0.bj = ((azh) (abyte0)).aG & ~a.aR;
	// 10600 19812:aload_1         
	// 10601 19813:aload_1         
	// 10602 19814:getfield        #267 <Field int azh.aG>
	// 10603 19817:aload_0         
	// 10604 19818:getfield        #12  <Field azh a>
	// 10605 19821:getfield        #369 <Field int azh.aR>
	// 10606 19824:iconst_m1       
	// 10607 19825:ixor            
	// 10608 19826:iand            
	// 10609 19827:putfield        #297 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 10610 19830:aload_0         
	// 10611 19831:getfield        #12  <Field azh a>
	// 10612 19834:astore_1        
		abyte0.bj = ((azh) (abyte0)).v ^ a.bj;
	// 10613 19835:aload_1         
	// 10614 19836:aload_1         
	// 10615 19837:getfield        #258 <Field int azh.v>
	// 10616 19840:aload_0         
	// 10617 19841:getfield        #12  <Field azh a>
	// 10618 19844:getfield        #297 <Field int azh.bj>
	// 10619 19847:ixor            
	// 10620 19848:putfield        #297 <Field int azh.bj>
		abyte0 = ((byte []) (a));
	// 10621 19851:aload_0         
	// 10622 19852:getfield        #12  <Field azh a>
	// 10623 19855:astore_1        
		abyte0.av = ((azh) (abyte0)).aR ^ a.av;
	// 10624 19856:aload_1         
	// 10625 19857:aload_1         
	// 10626 19858:getfield        #369 <Field int azh.aR>
	// 10627 19861:aload_0         
	// 10628 19862:getfield        #12  <Field azh a>
	// 10629 19865:getfield        #106 <Field int azh.av>
	// 10630 19868:ixor            
	// 10631 19869:putfield        #106 <Field int azh.av>
		abyte0 = ((byte []) (a));
	// 10632 19872:aload_0         
	// 10633 19873:getfield        #12  <Field azh a>
	// 10634 19876:astore_1        
		abyte0.aR = ((azh) (abyte0)).v ^ a.f;
	// 10635 19877:aload_1         
	// 10636 19878:aload_1         
	// 10637 19879:getfield        #258 <Field int azh.v>
	// 10638 19882:aload_0         
	// 10639 19883:getfield        #12  <Field azh a>
	// 10640 19886:getfield        #261 <Field int azh.f>
	// 10641 19889:ixor            
	// 10642 19890:putfield        #369 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 10643 19893:aload_0         
	// 10644 19894:getfield        #12  <Field azh a>
	// 10645 19897:astore_1        
		abyte0.bP = ((azh) (abyte0)).aR | a.aG;
	// 10646 19898:aload_1         
	// 10647 19899:aload_1         
	// 10648 19900:getfield        #369 <Field int azh.aR>
	// 10649 19903:aload_0         
	// 10650 19904:getfield        #12  <Field azh a>
	// 10651 19907:getfield        #267 <Field int azh.aG>
	// 10652 19910:ior             
	// 10653 19911:putfield        #474 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 10654 19914:aload_0         
	// 10655 19915:getfield        #12  <Field azh a>
	// 10656 19918:astore_1        
		abyte0.bP = ((azh) (abyte0)).bx ^ a.bP;
	// 10657 19919:aload_1         
	// 10658 19920:aload_1         
	// 10659 19921:getfield        #453 <Field int azh.bx>
	// 10660 19924:aload_0         
	// 10661 19925:getfield        #12  <Field azh a>
	// 10662 19928:getfield        #474 <Field int azh.bP>
	// 10663 19931:ixor            
	// 10664 19932:putfield        #474 <Field int azh.bP>
		abyte0 = ((byte []) (a));
	// 10665 19935:aload_0         
	// 10666 19936:getfield        #12  <Field azh a>
	// 10667 19939:astore_1        
		abyte0.aR = ((azh) (abyte0)).aR | a.aG;
	// 10668 19940:aload_1         
	// 10669 19941:aload_1         
	// 10670 19942:getfield        #369 <Field int azh.aR>
	// 10671 19945:aload_0         
	// 10672 19946:getfield        #12  <Field azh a>
	// 10673 19949:getfield        #267 <Field int azh.aG>
	// 10674 19952:ior             
	// 10675 19953:putfield        #369 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 10676 19956:aload_0         
	// 10677 19957:getfield        #12  <Field azh a>
	// 10678 19960:astore_1        
		abyte0.aR = ((azh) (abyte0)).n ^ a.aR;
	// 10679 19961:aload_1         
	// 10680 19962:aload_1         
	// 10681 19963:getfield        #306 <Field int azh.n>
	// 10682 19966:aload_0         
	// 10683 19967:getfield        #12  <Field azh a>
	// 10684 19970:getfield        #369 <Field int azh.aR>
	// 10685 19973:ixor            
	// 10686 19974:putfield        #369 <Field int azh.aR>
		abyte0 = ((byte []) (a));
	// 10687 19977:aload_0         
	// 10688 19978:getfield        #12  <Field azh a>
	// 10689 19981:astore_1        
		abyte0.n = ((azh) (abyte0)).v ^ a.L;
	// 10690 19982:aload_1         
	// 10691 19983:aload_1         
	// 10692 19984:getfield        #258 <Field int azh.v>
	// 10693 19987:aload_0         
	// 10694 19988:getfield        #12  <Field azh a>
	// 10695 19991:getfield        #237 <Field int azh.L>
	// 10696 19994:ixor            
	// 10697 19995:putfield        #306 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10698 19998:aload_0         
	// 10699 19999:getfield        #12  <Field azh a>
	// 10700 20002:astore_1        
		abyte0.bU = ((azh) (abyte0)).n ^ a.bU;
	// 10701 20003:aload_1         
	// 10702 20004:aload_1         
	// 10703 20005:getfield        #306 <Field int azh.n>
	// 10704 20008:aload_0         
	// 10705 20009:getfield        #12  <Field azh a>
	// 10706 20012:getfield        #216 <Field int azh.bU>
	// 10707 20015:ixor            
	// 10708 20016:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 10709 20019:aload_0         
	// 10710 20020:getfield        #12  <Field azh a>
	// 10711 20023:astore_1        
		abyte0.bq = ((azh) (abyte0)).bU ^ a.bq;
	// 10712 20024:aload_1         
	// 10713 20025:aload_1         
	// 10714 20026:getfield        #216 <Field int azh.bU>
	// 10715 20029:aload_0         
	// 10716 20030:getfield        #12  <Field azh a>
	// 10717 20033:getfield        #270 <Field int azh.bq>
	// 10718 20036:ixor            
	// 10719 20037:putfield        #270 <Field int azh.bq>
		abyte0 = ((byte []) (a));
	// 10720 20040:aload_0         
	// 10721 20041:getfield        #12  <Field azh a>
	// 10722 20044:astore_1        
		abyte0.bU = ((azh) (abyte0)).A & a.ci;
	// 10723 20045:aload_1         
	// 10724 20046:aload_1         
	// 10725 20047:getfield        #97  <Field int azh.A>
	// 10726 20050:aload_0         
	// 10727 20051:getfield        #12  <Field azh a>
	// 10728 20054:getfield        #71  <Field int azh.ci>
	// 10729 20057:iand            
	// 10730 20058:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 10731 20061:aload_0         
	// 10732 20062:getfield        #12  <Field azh a>
	// 10733 20065:astore_1        
		abyte0.au = ((azh) (abyte0)).bU ^ a.au;
	// 10734 20066:aload_1         
	// 10735 20067:aload_1         
	// 10736 20068:getfield        #216 <Field int azh.bU>
	// 10737 20071:aload_0         
	// 10738 20072:getfield        #12  <Field azh a>
	// 10739 20075:getfield        #85  <Field int azh.au>
	// 10740 20078:ixor            
	// 10741 20079:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 10742 20082:aload_0         
	// 10743 20083:getfield        #12  <Field azh a>
	// 10744 20086:astore_1        
		abyte0.au = ((azh) (abyte0)).Y & a.au;
	// 10745 20087:aload_1         
	// 10746 20088:aload_1         
	// 10747 20089:getfield        #91  <Field int azh.Y>
	// 10748 20092:aload_0         
	// 10749 20093:getfield        #12  <Field azh a>
	// 10750 20096:getfield        #85  <Field int azh.au>
	// 10751 20099:iand            
	// 10752 20100:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 10753 20103:aload_0         
	// 10754 20104:getfield        #12  <Field azh a>
	// 10755 20107:astore_1        
		abyte0.au = ((azh) (abyte0)).bB ^ a.au;
	// 10756 20108:aload_1         
	// 10757 20109:aload_1         
	// 10758 20110:getfield        #225 <Field int azh.bB>
	// 10759 20113:aload_0         
	// 10760 20114:getfield        #12  <Field azh a>
	// 10761 20117:getfield        #85  <Field int azh.au>
	// 10762 20120:ixor            
	// 10763 20121:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 10764 20124:aload_0         
	// 10765 20125:getfield        #12  <Field azh a>
	// 10766 20128:astore_1        
		abyte0.au = ((azh) (abyte0)).au & ~a.e;
	// 10767 20129:aload_1         
	// 10768 20130:aload_1         
	// 10769 20131:getfield        #85  <Field int azh.au>
	// 10770 20134:aload_0         
	// 10771 20135:getfield        #12  <Field azh a>
	// 10772 20138:getfield        #291 <Field int azh.e>
	// 10773 20141:iconst_m1       
	// 10774 20142:ixor            
	// 10775 20143:iand            
	// 10776 20144:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 10777 20147:aload_0         
	// 10778 20148:getfield        #12  <Field azh a>
	// 10779 20151:astore_1        
		abyte0.au = ((azh) (abyte0)).aB ^ a.au;
	// 10780 20152:aload_1         
	// 10781 20153:aload_1         
	// 10782 20154:getfield        #339 <Field int azh.aB>
	// 10783 20157:aload_0         
	// 10784 20158:getfield        #12  <Field azh a>
	// 10785 20161:getfield        #85  <Field int azh.au>
	// 10786 20164:ixor            
	// 10787 20165:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 10788 20168:aload_0         
	// 10789 20169:getfield        #12  <Field azh a>
	// 10790 20172:astore_1        
		abyte0.af = ((azh) (abyte0)).au ^ a.af;
	// 10791 20173:aload_1         
	// 10792 20174:aload_1         
	// 10793 20175:getfield        #85  <Field int azh.au>
	// 10794 20178:aload_0         
	// 10795 20179:getfield        #12  <Field azh a>
	// 10796 20182:getfield        #136 <Field int azh.af>
	// 10797 20185:ixor            
	// 10798 20186:putfield        #136 <Field int azh.af>
		abyte0 = ((byte []) (a));
	// 10799 20189:aload_0         
	// 10800 20190:getfield        #12  <Field azh a>
	// 10801 20193:astore_1        
		abyte0.au = ((azh) (abyte0)).af & ~a.P;
	// 10802 20194:aload_1         
	// 10803 20195:aload_1         
	// 10804 20196:getfield        #136 <Field int azh.af>
	// 10805 20199:aload_0         
	// 10806 20200:getfield        #12  <Field azh a>
	// 10807 20203:getfield        #139 <Field int azh.P>
	// 10808 20206:iconst_m1       
	// 10809 20207:ixor            
	// 10810 20208:iand            
	// 10811 20209:putfield        #85  <Field int azh.au>
		abyte0 = ((byte []) (a));
	// 10812 20212:aload_0         
	// 10813 20213:getfield        #12  <Field azh a>
	// 10814 20216:astore_1        
		abyte0.aB = ((azh) (abyte0)).af & ~a.P;
	// 10815 20217:aload_1         
	// 10816 20218:aload_1         
	// 10817 20219:getfield        #136 <Field int azh.af>
	// 10818 20222:aload_0         
	// 10819 20223:getfield        #12  <Field azh a>
	// 10820 20226:getfield        #139 <Field int azh.P>
	// 10821 20229:iconst_m1       
	// 10822 20230:ixor            
	// 10823 20231:iand            
	// 10824 20232:putfield        #339 <Field int azh.aB>
		abyte0 = ((byte []) (a));
	// 10825 20235:aload_0         
	// 10826 20236:getfield        #12  <Field azh a>
	// 10827 20239:astore_1        
		abyte0.bB = ((azh) (abyte0)).af & a.P;
	// 10828 20240:aload_1         
	// 10829 20241:aload_1         
	// 10830 20242:getfield        #136 <Field int azh.af>
	// 10831 20245:aload_0         
	// 10832 20246:getfield        #12  <Field azh a>
	// 10833 20249:getfield        #139 <Field int azh.P>
	// 10834 20252:iand            
	// 10835 20253:putfield        #225 <Field int azh.bB>
		abyte0 = ((byte []) (a));
	// 10836 20256:aload_0         
	// 10837 20257:getfield        #12  <Field azh a>
	// 10838 20260:astore_1        
		abyte0.bU = ((azh) (abyte0)).af & a.P;
	// 10839 20261:aload_1         
	// 10840 20262:aload_1         
	// 10841 20263:getfield        #136 <Field int azh.af>
	// 10842 20266:aload_0         
	// 10843 20267:getfield        #12  <Field azh a>
	// 10844 20270:getfield        #139 <Field int azh.P>
	// 10845 20273:iand            
	// 10846 20274:putfield        #216 <Field int azh.bU>
		abyte0 = ((byte []) (a));
	// 10847 20277:aload_0         
	// 10848 20278:getfield        #12  <Field azh a>
	// 10849 20281:astore_1        
		abyte0.n = ((azh) (abyte0)).af & a.d;
	// 10850 20282:aload_1         
	// 10851 20283:aload_1         
	// 10852 20284:getfield        #136 <Field int azh.af>
	// 10853 20287:aload_0         
	// 10854 20288:getfield        #12  <Field azh a>
	// 10855 20291:getfield        #145 <Field int azh.d>
	// 10856 20294:iand            
	// 10857 20295:putfield        #306 <Field int azh.n>
		abyte0 = ((byte []) (a));
	// 10858 20298:aload_0         
	// 10859 20299:getfield        #12  <Field azh a>
	// 10860 20302:astore_1        
		abyte0.bx = ((azh) (abyte0)).P ^ a.af;
	// 10861 20303:aload_1         
	// 10862 20304:aload_1         
	// 10863 20305:getfield        #139 <Field int azh.P>
	// 10864 20308:aload_0         
	// 10865 20309:getfield        #12  <Field azh a>
	// 10866 20312:getfield        #136 <Field int azh.af>
	// 10867 20315:ixor            
	// 10868 20316:putfield        #453 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 10869 20319:aload_0         
	// 10870 20320:getfield        #12  <Field azh a>
	// 10871 20323:astore_1        
		abyte0.bx = ((azh) (abyte0)).d & a.bx;
	// 10872 20324:aload_1         
	// 10873 20325:aload_1         
	// 10874 20326:getfield        #145 <Field int azh.d>
	// 10875 20329:aload_0         
	// 10876 20330:getfield        #12  <Field azh a>
	// 10877 20333:getfield        #453 <Field int azh.bx>
	// 10878 20336:iand            
	// 10879 20337:putfield        #453 <Field int azh.bx>
		abyte0 = ((byte []) (a));
	// 10880 20340:aload_0         
	// 10881 20341:getfield        #12  <Field azh a>
	// 10882 20344:astore_1        
		abyte0.by = ((azh) (abyte0)).af & a.P;
	// 10883 20345:aload_1         
	// 10884 20346:aload_1         
	// 10885 20347:getfield        #136 <Field int azh.af>
	// 10886 20350:aload_0         
	// 10887 20351:getfield        #12  <Field azh a>
	// 10888 20354:getfield        #139 <Field int azh.P>
	// 10889 20357:iand            
	// 10890 20358:putfield        #354 <Field int azh.by>
		abyte0 = ((byte []) (a));
	// 10891 20361:aload_0         
	// 10892 20362:getfield        #12  <Field azh a>
	// 10893 20365:astore_1        
		abyte0.ci = ((azh) (abyte0)).A & a.ci;
	// 10894 20366:aload_1         
	// 10895 20367:aload_1         
	// 10896 20368:getfield        #97  <Field int azh.A>
	// 10897 20371:aload_0         
	// 10898 20372:getfield        #12  <Field azh a>
	// 10899 20375:getfield        #71  <Field int azh.ci>
	// 10900 20378:iand            
	// 10901 20379:putfield        #71  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 10902 20382:aload_0         
	// 10903 20383:getfield        #12  <Field azh a>
	// 10904 20386:astore_1        
		abyte0.ci = ((azh) (abyte0)).bV ^ a.ci;
	// 10905 20387:aload_1         
	// 10906 20388:aload_1         
	// 10907 20389:getfield        #324 <Field int azh.bV>
	// 10908 20392:aload_0         
	// 10909 20393:getfield        #12  <Field azh a>
	// 10910 20396:getfield        #71  <Field int azh.ci>
	// 10911 20399:ixor            
	// 10912 20400:putfield        #71  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 10913 20403:aload_0         
	// 10914 20404:getfield        #12  <Field azh a>
	// 10915 20407:astore_1        
		abyte0.bk = ((azh) (abyte0)).ci ^ a.bk;
	// 10916 20408:aload_1         
	// 10917 20409:aload_1         
	// 10918 20410:getfield        #71  <Field int azh.ci>
	// 10919 20413:aload_0         
	// 10920 20414:getfield        #12  <Field azh a>
	// 10921 20417:getfield        #234 <Field int azh.bk>
	// 10922 20420:ixor            
	// 10923 20421:putfield        #234 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 10924 20424:aload_0         
	// 10925 20425:getfield        #12  <Field azh a>
	// 10926 20428:astore_1        
		abyte0.bk = ((azh) (abyte0)).Y & ~a.bk;
	// 10927 20429:aload_1         
	// 10928 20430:aload_1         
	// 10929 20431:getfield        #91  <Field int azh.Y>
	// 10930 20434:aload_0         
	// 10931 20435:getfield        #12  <Field azh a>
	// 10932 20438:getfield        #234 <Field int azh.bk>
	// 10933 20441:iconst_m1       
	// 10934 20442:ixor            
	// 10935 20443:iand            
	// 10936 20444:putfield        #234 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 10937 20447:aload_0         
	// 10938 20448:getfield        #12  <Field azh a>
	// 10939 20451:astore_1        
		abyte0.bk = ((azh) (abyte0)).bJ ^ a.bk;
	// 10940 20452:aload_1         
	// 10941 20453:aload_1         
	// 10942 20454:getfield        #53  <Field int azh.bJ>
	// 10943 20457:aload_0         
	// 10944 20458:getfield        #12  <Field azh a>
	// 10945 20461:getfield        #234 <Field int azh.bk>
	// 10946 20464:ixor            
	// 10947 20465:putfield        #234 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 10948 20468:aload_0         
	// 10949 20469:getfield        #12  <Field azh a>
	// 10950 20472:astore_1        
		abyte0.bk = ((azh) (abyte0)).bk & ~a.e;
	// 10951 20473:aload_1         
	// 10952 20474:aload_1         
	// 10953 20475:getfield        #234 <Field int azh.bk>
	// 10954 20478:aload_0         
	// 10955 20479:getfield        #12  <Field azh a>
	// 10956 20482:getfield        #291 <Field int azh.e>
	// 10957 20485:iconst_m1       
	// 10958 20486:ixor            
	// 10959 20487:iand            
	// 10960 20488:putfield        #234 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 10961 20491:aload_0         
	// 10962 20492:getfield        #12  <Field azh a>
	// 10963 20495:astore_1        
		abyte0.bk = ((azh) (abyte0)).am ^ a.bk;
	// 10964 20496:aload_1         
	// 10965 20497:aload_1         
	// 10966 20498:getfield        #471 <Field int azh.am>
	// 10967 20501:aload_0         
	// 10968 20502:getfield        #12  <Field azh a>
	// 10969 20505:getfield        #234 <Field int azh.bk>
	// 10970 20508:ixor            
	// 10971 20509:putfield        #234 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 10972 20512:aload_0         
	// 10973 20513:getfield        #12  <Field azh a>
	// 10974 20516:astore_1        
		abyte0.V = ((azh) (abyte0)).bk ^ a.V;
	// 10975 20517:aload_1         
	// 10976 20518:aload_1         
	// 10977 20519:getfield        #234 <Field int azh.bk>
	// 10978 20522:aload_0         
	// 10979 20523:getfield        #12  <Field azh a>
	// 10980 20526:getfield        #483 <Field int azh.V>
	// 10981 20529:ixor            
	// 10982 20530:putfield        #483 <Field int azh.V>
		abyte0 = ((byte []) (a));
	// 10983 20533:aload_0         
	// 10984 20534:getfield        #12  <Field azh a>
	// 10985 20537:astore_1        
		abyte0.bk = ((azh) (abyte0)).bF & ~a.A;
	// 10986 20538:aload_1         
	// 10987 20539:aload_1         
	// 10988 20540:getfield        #255 <Field int azh.bF>
	// 10989 20543:aload_0         
	// 10990 20544:getfield        #12  <Field azh a>
	// 10991 20547:getfield        #97  <Field int azh.A>
	// 10992 20550:iconst_m1       
	// 10993 20551:ixor            
	// 10994 20552:iand            
	// 10995 20553:putfield        #234 <Field int azh.bk>
		abyte0 = ((byte []) (a));
	// 10996 20556:aload_0         
	// 10997 20557:getfield        #12  <Field azh a>
	// 10998 20560:astore_1        
		abyte0.am = ((azh) (abyte0)).bk | a.A;
	// 10999 20561:aload_1         
	// 11000 20562:aload_1         
	// 11001 20563:getfield        #234 <Field int azh.bk>
	// 11002 20566:aload_0         
	// 11003 20567:getfield        #12  <Field azh a>
	// 11004 20570:getfield        #97  <Field int azh.A>
	// 11005 20573:ior             
	// 11006 20574:putfield        #471 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 11007 20577:aload_0         
	// 11008 20578:getfield        #12  <Field azh a>
	// 11009 20581:astore_1        
		abyte0.bJ = ((azh) (abyte0)).am & ~a.c;
	// 11010 20582:aload_1         
	// 11011 20583:aload_1         
	// 11012 20584:getfield        #471 <Field int azh.am>
	// 11013 20587:aload_0         
	// 11014 20588:getfield        #12  <Field azh a>
	// 11015 20591:getfield        #100 <Field int azh.c>
	// 11016 20594:iconst_m1       
	// 11017 20595:ixor            
	// 11018 20596:iand            
	// 11019 20597:putfield        #53  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 11020 20600:aload_0         
	// 11021 20601:getfield        #12  <Field azh a>
	// 11022 20604:astore_1        
		abyte0.bJ = ((azh) (abyte0)).bF ^ a.bJ;
	// 11023 20605:aload_1         
	// 11024 20606:aload_1         
	// 11025 20607:getfield        #255 <Field int azh.bF>
	// 11026 20610:aload_0         
	// 11027 20611:getfield        #12  <Field azh a>
	// 11028 20614:getfield        #53  <Field int azh.bJ>
	// 11029 20617:ixor            
	// 11030 20618:putfield        #53  <Field int azh.bJ>
		abyte0 = ((byte []) (a));
	// 11031 20621:aload_0         
	// 11032 20622:getfield        #12  <Field azh a>
	// 11033 20625:astore_1        
		abyte0.aI = ((azh) (abyte0)).bJ ^ a.aI;
	// 11034 20626:aload_1         
	// 11035 20627:aload_1         
	// 11036 20628:getfield        #53  <Field int azh.bJ>
	// 11037 20631:aload_0         
	// 11038 20632:getfield        #12  <Field azh a>
	// 11039 20635:getfield        #222 <Field int azh.aI>
	// 11040 20638:ixor            
	// 11041 20639:putfield        #222 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 11042 20642:aload_0         
	// 11043 20643:getfield        #12  <Field azh a>
	// 11044 20646:astore_1        
		abyte0.bH = ((azh) (abyte0)).aI ^ a.bH;
	// 11045 20647:aload_1         
	// 11046 20648:aload_1         
	// 11047 20649:getfield        #222 <Field int azh.aI>
	// 11048 20652:aload_0         
	// 11049 20653:getfield        #12  <Field azh a>
	// 11050 20656:getfield        #462 <Field int azh.bH>
	// 11051 20659:ixor            
	// 11052 20660:putfield        #462 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 11053 20663:aload_0         
	// 11054 20664:getfield        #12  <Field azh a>
	// 11055 20667:astore_1        
		abyte0.bE = ((azh) (abyte0)).bH ^ a.bE;
	// 11056 20668:aload_1         
	// 11057 20669:aload_1         
	// 11058 20670:getfield        #462 <Field int azh.bH>
	// 11059 20673:aload_0         
	// 11060 20674:getfield        #12  <Field azh a>
	// 11061 20677:getfield        #375 <Field int azh.bE>
	// 11062 20680:ixor            
	// 11063 20681:putfield        #375 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 11064 20684:aload_0         
	// 11065 20685:getfield        #12  <Field azh a>
	// 11066 20688:astore_1        
		abyte0.bE = ((azh) (abyte0)).bE ^ a.z;
	// 11067 20689:aload_1         
	// 11068 20690:aload_1         
	// 11069 20691:getfield        #375 <Field int azh.bE>
	// 11070 20694:aload_0         
	// 11071 20695:getfield        #12  <Field azh a>
	// 11072 20698:getfield        #112 <Field int azh.z>
	// 11073 20701:ixor            
	// 11074 20702:putfield        #375 <Field int azh.bE>
		abyte0 = ((byte []) (a));
	// 11075 20705:aload_0         
	// 11076 20706:getfield        #12  <Field azh a>
	// 11077 20709:astore_1        
		abyte0.bH = ((azh) (abyte0)).bl | a.bE;
	// 11078 20710:aload_1         
	// 11079 20711:aload_1         
	// 11080 20712:getfield        #366 <Field int azh.bl>
	// 11081 20715:aload_0         
	// 11082 20716:getfield        #12  <Field azh a>
	// 11083 20719:getfield        #375 <Field int azh.bE>
	// 11084 20722:ior             
	// 11085 20723:putfield        #462 <Field int azh.bH>
		abyte0 = ((byte []) (a));
	// 11086 20726:aload_0         
	// 11087 20727:getfield        #12  <Field azh a>
	// 11088 20730:astore_1        
		abyte0.aI = ((azh) (abyte0)).bE & ~a.bl;
	// 11089 20731:aload_1         
	// 11090 20732:aload_1         
	// 11091 20733:getfield        #375 <Field int azh.bE>
	// 11092 20736:aload_0         
	// 11093 20737:getfield        #12  <Field azh a>
	// 11094 20740:getfield        #366 <Field int azh.bl>
	// 11095 20743:iconst_m1       
	// 11096 20744:ixor            
	// 11097 20745:iand            
	// 11098 20746:putfield        #222 <Field int azh.aI>
		abyte0 = ((byte []) (a));
	// 11099 20749:aload_0         
	// 11100 20750:getfield        #12  <Field azh a>
	// 11101 20753:astore_1        
		abyte0.ci = ((azh) (abyte0)).bl | a.bE;
	// 11102 20754:aload_1         
	// 11103 20755:aload_1         
	// 11104 20756:getfield        #366 <Field int azh.bl>
	// 11105 20759:aload_0         
	// 11106 20760:getfield        #12  <Field azh a>
	// 11107 20763:getfield        #375 <Field int azh.bE>
	// 11108 20766:ior             
	// 11109 20767:putfield        #71  <Field int azh.ci>
		abyte0 = ((byte []) (a));
	// 11110 20770:aload_0         
	// 11111 20771:getfield        #12  <Field azh a>
	// 11112 20774:astore_1        
		abyte0.bV = ((azh) (abyte0)).bE & ~a.bl;
	// 11113 20775:aload_1         
	// 11114 20776:aload_1         
	// 11115 20777:getfield        #375 <Field int azh.bE>
	// 11116 20780:aload_0         
	// 11117 20781:getfield        #12  <Field azh a>
	// 11118 20784:getfield        #366 <Field int azh.bl>
	// 11119 20787:iconst_m1       
	// 11120 20788:ixor            
	// 11121 20789:iand            
	// 11122 20790:putfield        #324 <Field int azh.bV>
		abyte0 = ((byte []) (a));
	// 11123 20793:aload_0         
	// 11124 20794:getfield        #12  <Field azh a>
	// 11125 20797:astore_1        
		abyte0.ar = ((azh) (abyte0)).bJ ^ a.ar;
	// 11126 20798:aload_1         
	// 11127 20799:aload_1         
	// 11128 20800:getfield        #53  <Field int azh.bJ>
	// 11129 20803:aload_0         
	// 11130 20804:getfield        #12  <Field azh a>
	// 11131 20807:getfield        #435 <Field int azh.ar>
	// 11132 20810:ixor            
	// 11133 20811:putfield        #435 <Field int azh.ar>
		abyte0 = ((byte []) (a));
	// 11134 20814:aload_0         
	// 11135 20815:getfield        #12  <Field azh a>
	// 11136 20818:astore_1        
		abyte0.am = ((azh) (abyte0)).am & ~a.c;
	// 11137 20819:aload_1         
	// 11138 20820:aload_1         
	// 11139 20821:getfield        #471 <Field int azh.am>
	// 11140 20824:aload_0         
	// 11141 20825:getfield        #12  <Field azh a>
	// 11142 20828:getfield        #100 <Field int azh.c>
	// 11143 20831:iconst_m1       
	// 11144 20832:ixor            
	// 11145 20833:iand            
	// 11146 20834:putfield        #471 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 11147 20837:aload_0         
	// 11148 20838:getfield        #12  <Field azh a>
	// 11149 20841:astore_1        
		abyte0.am = ((azh) (abyte0)).am & ~a.I;
	// 11150 20842:aload_1         
	// 11151 20843:aload_1         
	// 11152 20844:getfield        #471 <Field int azh.am>
	// 11153 20847:aload_0         
	// 11154 20848:getfield        #12  <Field azh a>
	// 11155 20851:getfield        #79  <Field int azh.I>
	// 11156 20854:iconst_m1       
	// 11157 20855:ixor            
	// 11158 20856:iand            
	// 11159 20857:putfield        #471 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 11160 20860:aload_0         
	// 11161 20861:getfield        #12  <Field azh a>
	// 11162 20864:astore_1        
		abyte0.am = ((azh) (abyte0)).bv ^ a.am;
	// 11163 20865:aload_1         
	// 11164 20866:aload_1         
	// 11165 20867:getfield        #411 <Field int azh.bv>
	// 11166 20870:aload_0         
	// 11167 20871:getfield        #12  <Field azh a>
	// 11168 20874:getfield        #471 <Field int azh.am>
	// 11169 20877:ixor            
	// 11170 20878:putfield        #471 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 11171 20881:aload_0         
	// 11172 20882:getfield        #12  <Field azh a>
	// 11173 20885:astore_1        
		abyte0.am = ((azh) (abyte0)).k & ~a.am;
	// 11174 20886:aload_1         
	// 11175 20887:aload_1         
	// 11176 20888:getfield        #459 <Field int azh.k>
	// 11177 20891:aload_0         
	// 11178 20892:getfield        #12  <Field azh a>
	// 11179 20895:getfield        #471 <Field int azh.am>
	// 11180 20898:iconst_m1       
	// 11181 20899:ixor            
	// 11182 20900:iand            
	// 11183 20901:putfield        #471 <Field int azh.am>
		abyte0 = ((byte []) (a));
	// 11184 20904:aload_0         
	// 11185 20905:getfield        #12  <Field azh a>
	// 11186 20908:astore_1        
		abyte0.bL = ((azh) (abyte0)).bk ^ a.bL;
	// 11187 20909:aload_1         
	// 11188 20910:aload_1         
	// 11189 20911:getfield        #234 <Field int azh.bk>
	// 11190 20914:aload_0         
	// 11191 20915:getfield        #12  <Field azh a>
	// 11192 20918:getfield        #47  <Field int azh.bL>
	// 11193 20921:ixor            
	// 11194 20922:putfield        #47  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 11195 20925:aload_0         
	// 11196 20926:getfield        #12  <Field azh a>
	// 11197 20929:astore_1        
		abyte0.bL = ((azh) (abyte0)).bL | a.I;
	// 11198 20930:aload_1         
	// 11199 20931:aload_1         
	// 11200 20932:getfield        #47  <Field int azh.bL>
	// 11201 20935:aload_0         
	// 11202 20936:getfield        #12  <Field azh a>
	// 11203 20939:getfield        #79  <Field int azh.I>
	// 11204 20942:ior             
	// 11205 20943:putfield        #47  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 11206 20946:aload_0         
	// 11207 20947:getfield        #12  <Field azh a>
	// 11208 20950:astore_1        
		abyte0.bL = ((azh) (abyte0)).c ^ a.bL;
	// 11209 20951:aload_1         
	// 11210 20952:aload_1         
	// 11211 20953:getfield        #100 <Field int azh.c>
	// 11212 20956:aload_0         
	// 11213 20957:getfield        #12  <Field azh a>
	// 11214 20960:getfield        #47  <Field int azh.bL>
	// 11215 20963:ixor            
	// 11216 20964:putfield        #47  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 11217 20967:aload_0         
	// 11218 20968:getfield        #12  <Field azh a>
	// 11219 20971:astore_1        
		abyte0.bL = ((azh) (abyte0)).bb | a.bL;
	// 11220 20972:aload_1         
	// 11221 20973:aload_1         
	// 11222 20974:getfield        #178 <Field int azh.bb>
	// 11223 20977:aload_0         
	// 11224 20978:getfield        #12  <Field azh a>
	// 11225 20981:getfield        #47  <Field int azh.bL>
	// 11226 20984:ior             
	// 11227 20985:putfield        #47  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 11228 20988:aload_0         
	// 11229 20989:getfield        #12  <Field azh a>
	// 11230 20992:astore_1        
		abyte0.bv = ((azh) (abyte0)).c | a.bk;
	// 11231 20993:aload_1         
	// 11232 20994:aload_1         
	// 11233 20995:getfield        #100 <Field int azh.c>
	// 11234 20998:aload_0         
	// 11235 20999:getfield        #12  <Field azh a>
	// 11236 21002:getfield        #234 <Field int azh.bk>
	// 11237 21005:ior             
	// 11238 21006:putfield        #411 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 11239 21009:aload_0         
	// 11240 21010:getfield        #12  <Field azh a>
	// 11241 21013:astore_1        
		abyte0.bv = ((azh) (abyte0)).bF ^ a.bv;
	// 11242 21014:aload_1         
	// 11243 21015:aload_1         
	// 11244 21016:getfield        #255 <Field int azh.bF>
	// 11245 21019:aload_0         
	// 11246 21020:getfield        #12  <Field azh a>
	// 11247 21023:getfield        #411 <Field int azh.bv>
	// 11248 21026:ixor            
	// 11249 21027:putfield        #411 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 11250 21030:aload_0         
	// 11251 21031:getfield        #12  <Field azh a>
	// 11252 21034:astore_1        
		abyte0.aN = ((azh) (abyte0)).I & a.bv;
	// 11253 21035:aload_1         
	// 11254 21036:aload_1         
	// 11255 21037:getfield        #79  <Field int azh.I>
	// 11256 21040:aload_0         
	// 11257 21041:getfield        #12  <Field azh a>
	// 11258 21044:getfield        #411 <Field int azh.bv>
	// 11259 21047:iand            
	// 11260 21048:putfield        #384 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 11261 21051:aload_0         
	// 11262 21052:getfield        #12  <Field azh a>
	// 11263 21055:astore_1        
		abyte0.aN = ((azh) (abyte0)).bW ^ a.aN;
	// 11264 21056:aload_1         
	// 11265 21057:aload_1         
	// 11266 21058:getfield        #465 <Field int azh.bW>
	// 11267 21061:aload_0         
	// 11268 21062:getfield        #12  <Field azh a>
	// 11269 21065:getfield        #384 <Field int azh.aN>
	// 11270 21068:ixor            
	// 11271 21069:putfield        #384 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 11272 21072:aload_0         
	// 11273 21073:getfield        #12  <Field azh a>
	// 11274 21076:astore_1        
		abyte0.aN = ((azh) (abyte0)).aN & ~a.bb;
	// 11275 21077:aload_1         
	// 11276 21078:aload_1         
	// 11277 21079:getfield        #384 <Field int azh.aN>
	// 11278 21082:aload_0         
	// 11279 21083:getfield        #12  <Field azh a>
	// 11280 21086:getfield        #178 <Field int azh.bb>
	// 11281 21089:iconst_m1       
	// 11282 21090:ixor            
	// 11283 21091:iand            
	// 11284 21092:putfield        #384 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 11285 21095:aload_0         
	// 11286 21096:getfield        #12  <Field azh a>
	// 11287 21099:astore_1        
		abyte0.aN = ((azh) (abyte0)).W ^ a.aN;
	// 11288 21100:aload_1         
	// 11289 21101:aload_1         
	// 11290 21102:getfield        #207 <Field int azh.W>
	// 11291 21105:aload_0         
	// 11292 21106:getfield        #12  <Field azh a>
	// 11293 21109:getfield        #384 <Field int azh.aN>
	// 11294 21112:ixor            
	// 11295 21113:putfield        #384 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 11296 21116:aload_0         
	// 11297 21117:getfield        #12  <Field azh a>
	// 11298 21120:astore_1        
		abyte0.bv = ((azh) (abyte0)).bv & ~a.I;
	// 11299 21121:aload_1         
	// 11300 21122:aload_1         
	// 11301 21123:getfield        #411 <Field int azh.bv>
	// 11302 21126:aload_0         
	// 11303 21127:getfield        #12  <Field azh a>
	// 11304 21130:getfield        #79  <Field int azh.I>
	// 11305 21133:iconst_m1       
	// 11306 21134:ixor            
	// 11307 21135:iand            
	// 11308 21136:putfield        #411 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 11309 21139:aload_0         
	// 11310 21140:getfield        #12  <Field azh a>
	// 11311 21143:astore_1        
		abyte0.bv = ((azh) (abyte0)).aT ^ a.bv;
	// 11312 21144:aload_1         
	// 11313 21145:aload_1         
	// 11314 21146:getfield        #447 <Field int azh.aT>
	// 11315 21149:aload_0         
	// 11316 21150:getfield        #12  <Field azh a>
	// 11317 21153:getfield        #411 <Field int azh.bv>
	// 11318 21156:ixor            
	// 11319 21157:putfield        #411 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 11320 21160:aload_0         
	// 11321 21161:getfield        #12  <Field azh a>
	// 11322 21164:astore_1        
		abyte0.bL = ((azh) (abyte0)).bv ^ a.bL;
	// 11323 21165:aload_1         
	// 11324 21166:aload_1         
	// 11325 21167:getfield        #411 <Field int azh.bv>
	// 11326 21170:aload_0         
	// 11327 21171:getfield        #12  <Field azh a>
	// 11328 21174:getfield        #47  <Field int azh.bL>
	// 11329 21177:ixor            
	// 11330 21178:putfield        #47  <Field int azh.bL>
		abyte0 = ((byte []) (a));
	// 11331 21181:aload_0         
	// 11332 21182:getfield        #12  <Field azh a>
	// 11333 21185:astore_1        
		abyte0.bv = ((azh) (abyte0)).bk & ~a.c;
	// 11334 21186:aload_1         
	// 11335 21187:aload_1         
	// 11336 21188:getfield        #234 <Field int azh.bk>
	// 11337 21191:aload_0         
	// 11338 21192:getfield        #12  <Field azh a>
	// 11339 21195:getfield        #100 <Field int azh.c>
	// 11340 21198:iconst_m1       
	// 11341 21199:ixor            
	// 11342 21200:iand            
	// 11343 21201:putfield        #411 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 11344 21204:aload_0         
	// 11345 21205:getfield        #12  <Field azh a>
	// 11346 21208:astore_1        
		abyte0.bv = ((azh) (abyte0)).bk ^ a.bv;
	// 11347 21209:aload_1         
	// 11348 21210:aload_1         
	// 11349 21211:getfield        #234 <Field int azh.bk>
	// 11350 21214:aload_0         
	// 11351 21215:getfield        #12  <Field azh a>
	// 11352 21218:getfield        #411 <Field int azh.bv>
	// 11353 21221:ixor            
	// 11354 21222:putfield        #411 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 11355 21225:aload_0         
	// 11356 21226:getfield        #12  <Field azh a>
	// 11357 21229:astore_1        
		abyte0.bv = ((azh) (abyte0)).I & a.bv;
	// 11358 21230:aload_1         
	// 11359 21231:aload_1         
	// 11360 21232:getfield        #79  <Field int azh.I>
	// 11361 21235:aload_0         
	// 11362 21236:getfield        #12  <Field azh a>
	// 11363 21239:getfield        #411 <Field int azh.bv>
	// 11364 21242:iand            
	// 11365 21243:putfield        #411 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 11366 21246:aload_0         
	// 11367 21247:getfield        #12  <Field azh a>
	// 11368 21250:astore_1        
		abyte0.bv = ((azh) (abyte0)).bo ^ a.bv;
	// 11369 21251:aload_1         
	// 11370 21252:aload_1         
	// 11371 21253:getfield        #32  <Field int azh.bo>
	// 11372 21256:aload_0         
	// 11373 21257:getfield        #12  <Field azh a>
	// 11374 21260:getfield        #411 <Field int azh.bv>
	// 11375 21263:ixor            
	// 11376 21264:putfield        #411 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 11377 21267:aload_0         
	// 11378 21268:getfield        #12  <Field azh a>
	// 11379 21271:astore_1        
		abyte0.bt = ((azh) (abyte0)).bv ^ a.bt;
	// 11380 21272:aload_1         
	// 11381 21273:aload_1         
	// 11382 21274:getfield        #411 <Field int azh.bv>
	// 11383 21277:aload_0         
	// 11384 21278:getfield        #12  <Field azh a>
	// 11385 21281:getfield        #213 <Field int azh.bt>
	// 11386 21284:ixor            
	// 11387 21285:putfield        #213 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 11388 21288:aload_0         
	// 11389 21289:getfield        #12  <Field azh a>
	// 11390 21292:astore_1        
		abyte0.bt = ((azh) (abyte0)).k & ~a.bt;
	// 11391 21293:aload_1         
	// 11392 21294:aload_1         
	// 11393 21295:getfield        #459 <Field int azh.k>
	// 11394 21298:aload_0         
	// 11395 21299:getfield        #12  <Field azh a>
	// 11396 21302:getfield        #213 <Field int azh.bt>
	// 11397 21305:iconst_m1       
	// 11398 21306:ixor            
	// 11399 21307:iand            
	// 11400 21308:putfield        #213 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 11401 21311:aload_0         
	// 11402 21312:getfield        #12  <Field azh a>
	// 11403 21315:astore_1        
		abyte0.bt = ((azh) (abyte0)).aN ^ a.bt;
	// 11404 21316:aload_1         
	// 11405 21317:aload_1         
	// 11406 21318:getfield        #384 <Field int azh.aN>
	// 11407 21321:aload_0         
	// 11408 21322:getfield        #12  <Field azh a>
	// 11409 21325:getfield        #213 <Field int azh.bt>
	// 11410 21328:ixor            
	// 11411 21329:putfield        #213 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 11412 21332:aload_0         
	// 11413 21333:getfield        #12  <Field azh a>
	// 11414 21336:astore_1        
		abyte0.N = ((azh) (abyte0)).bt ^ a.N;
	// 11415 21337:aload_1         
	// 11416 21338:aload_1         
	// 11417 21339:getfield        #213 <Field int azh.bt>
	// 11418 21342:aload_0         
	// 11419 21343:getfield        #12  <Field azh a>
	// 11420 21346:getfield        #318 <Field int azh.N>
	// 11421 21349:ixor            
	// 11422 21350:putfield        #318 <Field int azh.N>
		abyte0 = ((byte []) (a));
	// 11423 21353:aload_0         
	// 11424 21354:getfield        #12  <Field azh a>
	// 11425 21357:astore_1        
		abyte0.bt = ((azh) (abyte0)).N & ~a.F;
	// 11426 21358:aload_1         
	// 11427 21359:aload_1         
	// 11428 21360:getfield        #318 <Field int azh.N>
	// 11429 21363:aload_0         
	// 11430 21364:getfield        #12  <Field azh a>
	// 11431 21367:getfield        #321 <Field int azh.F>
	// 11432 21370:iconst_m1       
	// 11433 21371:ixor            
	// 11434 21372:iand            
	// 11435 21373:putfield        #213 <Field int azh.bt>
		abyte0 = ((byte []) (a));
	// 11436 21376:aload_0         
	// 11437 21377:getfield        #12  <Field azh a>
	// 11438 21380:astore_1        
		abyte0.aN = ((azh) (abyte0)).F ^ a.N;
	// 11439 21381:aload_1         
	// 11440 21382:aload_1         
	// 11441 21383:getfield        #321 <Field int azh.F>
	// 11442 21386:aload_0         
	// 11443 21387:getfield        #12  <Field azh a>
	// 11444 21390:getfield        #318 <Field int azh.N>
	// 11445 21393:ixor            
	// 11446 21394:putfield        #384 <Field int azh.aN>
		abyte0 = ((byte []) (a));
	// 11447 21397:aload_0         
	// 11448 21398:getfield        #12  <Field azh a>
	// 11449 21401:astore_1        
		abyte0.bv = ((azh) (abyte0)).N & ~a.F;
	// 11450 21402:aload_1         
	// 11451 21403:aload_1         
	// 11452 21404:getfield        #318 <Field int azh.N>
	// 11453 21407:aload_0         
	// 11454 21408:getfield        #12  <Field azh a>
	// 11455 21411:getfield        #321 <Field int azh.F>
	// 11456 21414:iconst_m1       
	// 11457 21415:ixor            
	// 11458 21416:iand            
	// 11459 21417:putfield        #411 <Field int azh.bv>
		abyte0 = ((byte []) (a));
	// 11460 21420:aload_0         
	// 11461 21421:getfield        #12  <Field azh a>
	// 11462 21424:astore_1        
		abyte0.bo = ((azh) (abyte0)).N & a.F;
	// 11463 21425:aload_1         
	// 11464 21426:aload_1         
	// 11465 21427:getfield        #318 <Field int azh.N>
	// 11466 21430:aload_0         
	// 11467 21431:getfield        #12  <Field azh a>
	// 11468 21434:getfield        #321 <Field int azh.F>
	// 11469 21437:iand            
	// 11470 21438:putfield        #32  <Field int azh.bo>
		abyte0 = ((byte []) (a));
	// 11471 21441:aload_0         
	// 11472 21442:getfield        #12  <Field azh a>
	// 11473 21445:astore_1        
		abyte0.W = ((azh) (abyte0)).N & a.F;
	// 11474 21446:aload_1         
	// 11475 21447:aload_1         
	// 11476 21448:getfield        #318 <Field int azh.N>
	// 11477 21451:aload_0         
	// 11478 21452:getfield        #12  <Field azh a>
	// 11479 21455:getfield        #321 <Field int azh.F>
	// 11480 21458:iand            
	// 11481 21459:putfield        #207 <Field int azh.W>
		abyte0 = ((byte []) (a));
	// 11482 21462:aload_0         
	// 11483 21463:getfield        #12  <Field azh a>
	// 11484 21466:astore_1        
		abyte0.ap = ((azh) (abyte0)).c | a.bk;
	// 11485 21467:aload_1         
	// 11486 21468:aload_1         
	// 11487 21469:getfield        #100 <Field int azh.c>
	// 11488 21472:aload_0         
	// 11489 21473:getfield        #12  <Field azh a>
	// 11490 21476:getfield        #234 <Field int azh.bk>
	// 11491 21479:ior             
	// 11492 21480:putfield        #68  <Field int azh.ap>
		abyte0 = ((byte []) (a));
	// 11493 21483:aload_0         
	// 11494 21484:getfield        #12  <Field azh a>
	// 11495 21487:astore_1        
		abyte0.ap = ((azh) (abyte0)).aT ^ a.ap;
	// 11496 21488:aload_1         
	// 11497 21489:aload_1         
	// 11498 21490:getfield        #447 <Field int azh.aT>
	// 11499 21493:aload_0         
	// 11500 21494:getfield        #12  <Field azh a>
	// 11501 21497:getfield        #68  <Field int azh.ap>
	// 11502 21500:ixor            
	// 11503 21501:putfield        #68  <Field int azh.ap>
	// 11504 21504:return          
	}

	private final azh a;
}
