// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.animation;


// Referenced classes of package android.support.v4.view.animation:
//			LookupTableInterpolator

public class FastOutSlowInInterpolator extends LookupTableInterpolator
{

	public FastOutSlowInInterpolator()
	{
		super(VALUES);
	//    0    0:aload_0         
	//    1    1:getstatic       #207 <Field float[] VALUES>
	//    2    4:invokespecial   #212 <Method void LookupTableInterpolator(float[])>
	//    3    7:return          
	}

	public volatile float getInterpolation(float f)
	{
		return super.getInterpolation(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokespecial   #216 <Method float LookupTableInterpolator.getInterpolation(float)>
	//    3    5:freturn         
	}

	private static final float VALUES[] = {
		0.0F, 0.0001F, 0.0002F, 0.0005F, 0.0009F, 0.0014F, 0.002F, 0.0027F, 0.0036F, 0.0046F, 
		0.0058F, 0.0071F, 0.0085F, 0.0101F, 0.0118F, 0.0137F, 0.0158F, 0.018F, 0.0205F, 0.0231F, 
		0.0259F, 0.0289F, 0.0321F, 0.0355F, 0.0391F, 0.043F, 0.0471F, 0.0514F, 0.056F, 0.0608F, 
		0.066F, 0.0714F, 0.0771F, 0.083F, 0.0893F, 0.0959F, 0.1029F, 0.1101F, 0.1177F, 0.1257F, 
		0.1339F, 0.1426F, 0.1516F, 0.161F, 0.1707F, 0.1808F, 0.1913F, 0.2021F, 0.2133F, 0.2248F, 
		0.2366F, 0.2487F, 0.2611F, 0.2738F, 0.2867F, 0.2998F, 0.3131F, 0.3265F, 0.34F, 0.3536F, 
		0.3673F, 0.381F, 0.3946F, 0.4082F, 0.4217F, 0.4352F, 0.4485F, 0.4616F, 0.4746F, 0.4874F, 
		0.5F, 0.5124F, 0.5246F, 0.5365F, 0.5482F, 0.5597F, 0.571F, 0.582F, 0.5928F, 0.6033F, 
		0.6136F, 0.6237F, 0.6335F, 0.6431F, 0.6525F, 0.6616F, 0.6706F, 0.6793F, 0.6878F, 0.6961F, 
		0.7043F, 0.7122F, 0.7199F, 0.7275F, 0.7349F, 0.7421F, 0.7491F, 0.7559F, 0.7626F, 0.7692F, 
		0.7756F, 0.7818F, 0.7879F, 0.7938F, 0.7996F, 0.8053F, 0.8108F, 0.8162F, 0.8215F, 0.8266F, 
		0.8317F, 0.8366F, 0.8414F, 0.8461F, 0.8507F, 0.8551F, 0.8595F, 0.8638F, 0.8679F, 0.872F, 
		0.876F, 0.8798F, 0.8836F, 0.8873F, 0.8909F, 0.8945F, 0.8979F, 0.9013F, 0.9046F, 0.9078F, 
		0.9109F, 0.9139F, 0.9169F, 0.9198F, 0.9227F, 0.9254F, 0.9281F, 0.9307F, 0.9333F, 0.9358F, 
		0.9382F, 0.9406F, 0.9429F, 0.9452F, 0.9474F, 0.9495F, 0.9516F, 0.9536F, 0.9556F, 0.9575F, 
		0.9594F, 0.9612F, 0.9629F, 0.9646F, 0.9663F, 0.9679F, 0.9695F, 0.971F, 0.9725F, 0.9739F, 
		0.9753F, 0.9766F, 0.9779F, 0.9791F, 0.9803F, 0.9815F, 0.9826F, 0.9837F, 0.9848F, 0.9858F, 
		0.9867F, 0.9877F, 0.9885F, 0.9894F, 0.9902F, 0.991F, 0.9917F, 0.9924F, 0.9931F, 0.9937F, 
		0.9944F, 0.9949F, 0.9955F, 0.996F, 0.9964F, 0.9969F, 0.9973F, 0.9977F, 0.998F, 0.9984F, 
		0.9986F, 0.9989F, 0.9991F, 0.9993F, 0.9995F, 0.9997F, 0.9998F, 0.9999F, 0.9999F, 1.0F, 
		1.0F
	};

	static 
	{
	//    0    0:sipush          201
	//    1    3:newarray        float[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:fconst_0        
	//    5    8:fastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #9   <Float 0.0001F>
	//    9   13:fastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #10  <Float 0.0002F>
	//   13   18:fastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #11  <Float 0.0005F>
	//   17   23:fastore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #12  <Float 0.0009F>
	//   21   28:fastore         
	//   22   29:dup             
	//   23   30:iconst_5        
	//   24   31:ldc1            #13  <Float 0.0014F>
	//   25   33:fastore         
	//   26   34:dup             
	//   27   35:bipush          6
	//   28   37:ldc1            #14  <Float 0.002F>
	//   29   39:fastore         
	//   30   40:dup             
	//   31   41:bipush          7
	//   32   43:ldc1            #15  <Float 0.0027F>
	//   33   45:fastore         
	//   34   46:dup             
	//   35   47:bipush          8
	//   36   49:ldc1            #16  <Float 0.0036F>
	//   37   51:fastore         
	//   38   52:dup             
	//   39   53:bipush          9
	//   40   55:ldc1            #17  <Float 0.0046F>
	//   41   57:fastore         
	//   42   58:dup             
	//   43   59:bipush          10
	//   44   61:ldc1            #18  <Float 0.0058F>
	//   45   63:fastore         
	//   46   64:dup             
	//   47   65:bipush          11
	//   48   67:ldc1            #19  <Float 0.0071F>
	//   49   69:fastore         
	//   50   70:dup             
	//   51   71:bipush          12
	//   52   73:ldc1            #20  <Float 0.0085F>
	//   53   75:fastore         
	//   54   76:dup             
	//   55   77:bipush          13
	//   56   79:ldc1            #21  <Float 0.0101F>
	//   57   81:fastore         
	//   58   82:dup             
	//   59   83:bipush          14
	//   60   85:ldc1            #22  <Float 0.0118F>
	//   61   87:fastore         
	//   62   88:dup             
	//   63   89:bipush          15
	//   64   91:ldc1            #23  <Float 0.0137F>
	//   65   93:fastore         
	//   66   94:dup             
	//   67   95:bipush          16
	//   68   97:ldc1            #24  <Float 0.0158F>
	//   69   99:fastore         
	//   70  100:dup             
	//   71  101:bipush          17
	//   72  103:ldc1            #25  <Float 0.018F>
	//   73  105:fastore         
	//   74  106:dup             
	//   75  107:bipush          18
	//   76  109:ldc1            #26  <Float 0.0205F>
	//   77  111:fastore         
	//   78  112:dup             
	//   79  113:bipush          19
	//   80  115:ldc1            #27  <Float 0.0231F>
	//   81  117:fastore         
	//   82  118:dup             
	//   83  119:bipush          20
	//   84  121:ldc1            #28  <Float 0.0259F>
	//   85  123:fastore         
	//   86  124:dup             
	//   87  125:bipush          21
	//   88  127:ldc1            #29  <Float 0.0289F>
	//   89  129:fastore         
	//   90  130:dup             
	//   91  131:bipush          22
	//   92  133:ldc1            #30  <Float 0.0321F>
	//   93  135:fastore         
	//   94  136:dup             
	//   95  137:bipush          23
	//   96  139:ldc1            #31  <Float 0.0355F>
	//   97  141:fastore         
	//   98  142:dup             
	//   99  143:bipush          24
	//  100  145:ldc1            #32  <Float 0.0391F>
	//  101  147:fastore         
	//  102  148:dup             
	//  103  149:bipush          25
	//  104  151:ldc1            #33  <Float 0.043F>
	//  105  153:fastore         
	//  106  154:dup             
	//  107  155:bipush          26
	//  108  157:ldc1            #34  <Float 0.0471F>
	//  109  159:fastore         
	//  110  160:dup             
	//  111  161:bipush          27
	//  112  163:ldc1            #35  <Float 0.0514F>
	//  113  165:fastore         
	//  114  166:dup             
	//  115  167:bipush          28
	//  116  169:ldc1            #36  <Float 0.056F>
	//  117  171:fastore         
	//  118  172:dup             
	//  119  173:bipush          29
	//  120  175:ldc1            #37  <Float 0.0608F>
	//  121  177:fastore         
	//  122  178:dup             
	//  123  179:bipush          30
	//  124  181:ldc1            #38  <Float 0.066F>
	//  125  183:fastore         
	//  126  184:dup             
	//  127  185:bipush          31
	//  128  187:ldc1            #39  <Float 0.0714F>
	//  129  189:fastore         
	//  130  190:dup             
	//  131  191:bipush          32
	//  132  193:ldc1            #40  <Float 0.0771F>
	//  133  195:fastore         
	//  134  196:dup             
	//  135  197:bipush          33
	//  136  199:ldc1            #41  <Float 0.083F>
	//  137  201:fastore         
	//  138  202:dup             
	//  139  203:bipush          34
	//  140  205:ldc1            #42  <Float 0.0893F>
	//  141  207:fastore         
	//  142  208:dup             
	//  143  209:bipush          35
	//  144  211:ldc1            #43  <Float 0.0959F>
	//  145  213:fastore         
	//  146  214:dup             
	//  147  215:bipush          36
	//  148  217:ldc1            #44  <Float 0.1029F>
	//  149  219:fastore         
	//  150  220:dup             
	//  151  221:bipush          37
	//  152  223:ldc1            #45  <Float 0.1101F>
	//  153  225:fastore         
	//  154  226:dup             
	//  155  227:bipush          38
	//  156  229:ldc1            #46  <Float 0.1177F>
	//  157  231:fastore         
	//  158  232:dup             
	//  159  233:bipush          39
	//  160  235:ldc1            #47  <Float 0.1257F>
	//  161  237:fastore         
	//  162  238:dup             
	//  163  239:bipush          40
	//  164  241:ldc1            #48  <Float 0.1339F>
	//  165  243:fastore         
	//  166  244:dup             
	//  167  245:bipush          41
	//  168  247:ldc1            #49  <Float 0.1426F>
	//  169  249:fastore         
	//  170  250:dup             
	//  171  251:bipush          42
	//  172  253:ldc1            #50  <Float 0.1516F>
	//  173  255:fastore         
	//  174  256:dup             
	//  175  257:bipush          43
	//  176  259:ldc1            #51  <Float 0.161F>
	//  177  261:fastore         
	//  178  262:dup             
	//  179  263:bipush          44
	//  180  265:ldc1            #52  <Float 0.1707F>
	//  181  267:fastore         
	//  182  268:dup             
	//  183  269:bipush          45
	//  184  271:ldc1            #53  <Float 0.1808F>
	//  185  273:fastore         
	//  186  274:dup             
	//  187  275:bipush          46
	//  188  277:ldc1            #54  <Float 0.1913F>
	//  189  279:fastore         
	//  190  280:dup             
	//  191  281:bipush          47
	//  192  283:ldc1            #55  <Float 0.2021F>
	//  193  285:fastore         
	//  194  286:dup             
	//  195  287:bipush          48
	//  196  289:ldc1            #56  <Float 0.2133F>
	//  197  291:fastore         
	//  198  292:dup             
	//  199  293:bipush          49
	//  200  295:ldc1            #57  <Float 0.2248F>
	//  201  297:fastore         
	//  202  298:dup             
	//  203  299:bipush          50
	//  204  301:ldc1            #58  <Float 0.2366F>
	//  205  303:fastore         
	//  206  304:dup             
	//  207  305:bipush          51
	//  208  307:ldc1            #59  <Float 0.2487F>
	//  209  309:fastore         
	//  210  310:dup             
	//  211  311:bipush          52
	//  212  313:ldc1            #60  <Float 0.2611F>
	//  213  315:fastore         
	//  214  316:dup             
	//  215  317:bipush          53
	//  216  319:ldc1            #61  <Float 0.2738F>
	//  217  321:fastore         
	//  218  322:dup             
	//  219  323:bipush          54
	//  220  325:ldc1            #62  <Float 0.2867F>
	//  221  327:fastore         
	//  222  328:dup             
	//  223  329:bipush          55
	//  224  331:ldc1            #63  <Float 0.2998F>
	//  225  333:fastore         
	//  226  334:dup             
	//  227  335:bipush          56
	//  228  337:ldc1            #64  <Float 0.3131F>
	//  229  339:fastore         
	//  230  340:dup             
	//  231  341:bipush          57
	//  232  343:ldc1            #65  <Float 0.3265F>
	//  233  345:fastore         
	//  234  346:dup             
	//  235  347:bipush          58
	//  236  349:ldc1            #66  <Float 0.34F>
	//  237  351:fastore         
	//  238  352:dup             
	//  239  353:bipush          59
	//  240  355:ldc1            #67  <Float 0.3536F>
	//  241  357:fastore         
	//  242  358:dup             
	//  243  359:bipush          60
	//  244  361:ldc1            #68  <Float 0.3673F>
	//  245  363:fastore         
	//  246  364:dup             
	//  247  365:bipush          61
	//  248  367:ldc1            #69  <Float 0.381F>
	//  249  369:fastore         
	//  250  370:dup             
	//  251  371:bipush          62
	//  252  373:ldc1            #70  <Float 0.3946F>
	//  253  375:fastore         
	//  254  376:dup             
	//  255  377:bipush          63
	//  256  379:ldc1            #71  <Float 0.4082F>
	//  257  381:fastore         
	//  258  382:dup             
	//  259  383:bipush          64
	//  260  385:ldc1            #72  <Float 0.4217F>
	//  261  387:fastore         
	//  262  388:dup             
	//  263  389:bipush          65
	//  264  391:ldc1            #73  <Float 0.4352F>
	//  265  393:fastore         
	//  266  394:dup             
	//  267  395:bipush          66
	//  268  397:ldc1            #74  <Float 0.4485F>
	//  269  399:fastore         
	//  270  400:dup             
	//  271  401:bipush          67
	//  272  403:ldc1            #75  <Float 0.4616F>
	//  273  405:fastore         
	//  274  406:dup             
	//  275  407:bipush          68
	//  276  409:ldc1            #76  <Float 0.4746F>
	//  277  411:fastore         
	//  278  412:dup             
	//  279  413:bipush          69
	//  280  415:ldc1            #77  <Float 0.4874F>
	//  281  417:fastore         
	//  282  418:dup             
	//  283  419:bipush          70
	//  284  421:ldc1            #78  <Float 0.5F>
	//  285  423:fastore         
	//  286  424:dup             
	//  287  425:bipush          71
	//  288  427:ldc1            #79  <Float 0.5124F>
	//  289  429:fastore         
	//  290  430:dup             
	//  291  431:bipush          72
	//  292  433:ldc1            #80  <Float 0.5246F>
	//  293  435:fastore         
	//  294  436:dup             
	//  295  437:bipush          73
	//  296  439:ldc1            #81  <Float 0.5365F>
	//  297  441:fastore         
	//  298  442:dup             
	//  299  443:bipush          74
	//  300  445:ldc1            #82  <Float 0.5482F>
	//  301  447:fastore         
	//  302  448:dup             
	//  303  449:bipush          75
	//  304  451:ldc1            #83  <Float 0.5597F>
	//  305  453:fastore         
	//  306  454:dup             
	//  307  455:bipush          76
	//  308  457:ldc1            #84  <Float 0.571F>
	//  309  459:fastore         
	//  310  460:dup             
	//  311  461:bipush          77
	//  312  463:ldc1            #85  <Float 0.582F>
	//  313  465:fastore         
	//  314  466:dup             
	//  315  467:bipush          78
	//  316  469:ldc1            #86  <Float 0.5928F>
	//  317  471:fastore         
	//  318  472:dup             
	//  319  473:bipush          79
	//  320  475:ldc1            #87  <Float 0.6033F>
	//  321  477:fastore         
	//  322  478:dup             
	//  323  479:bipush          80
	//  324  481:ldc1            #88  <Float 0.6136F>
	//  325  483:fastore         
	//  326  484:dup             
	//  327  485:bipush          81
	//  328  487:ldc1            #89  <Float 0.6237F>
	//  329  489:fastore         
	//  330  490:dup             
	//  331  491:bipush          82
	//  332  493:ldc1            #90  <Float 0.6335F>
	//  333  495:fastore         
	//  334  496:dup             
	//  335  497:bipush          83
	//  336  499:ldc1            #91  <Float 0.6431F>
	//  337  501:fastore         
	//  338  502:dup             
	//  339  503:bipush          84
	//  340  505:ldc1            #92  <Float 0.6525F>
	//  341  507:fastore         
	//  342  508:dup             
	//  343  509:bipush          85
	//  344  511:ldc1            #93  <Float 0.6616F>
	//  345  513:fastore         
	//  346  514:dup             
	//  347  515:bipush          86
	//  348  517:ldc1            #94  <Float 0.6706F>
	//  349  519:fastore         
	//  350  520:dup             
	//  351  521:bipush          87
	//  352  523:ldc1            #95  <Float 0.6793F>
	//  353  525:fastore         
	//  354  526:dup             
	//  355  527:bipush          88
	//  356  529:ldc1            #96  <Float 0.6878F>
	//  357  531:fastore         
	//  358  532:dup             
	//  359  533:bipush          89
	//  360  535:ldc1            #97  <Float 0.6961F>
	//  361  537:fastore         
	//  362  538:dup             
	//  363  539:bipush          90
	//  364  541:ldc1            #98  <Float 0.7043F>
	//  365  543:fastore         
	//  366  544:dup             
	//  367  545:bipush          91
	//  368  547:ldc1            #99  <Float 0.7122F>
	//  369  549:fastore         
	//  370  550:dup             
	//  371  551:bipush          92
	//  372  553:ldc1            #100 <Float 0.7199F>
	//  373  555:fastore         
	//  374  556:dup             
	//  375  557:bipush          93
	//  376  559:ldc1            #101 <Float 0.7275F>
	//  377  561:fastore         
	//  378  562:dup             
	//  379  563:bipush          94
	//  380  565:ldc1            #102 <Float 0.7349F>
	//  381  567:fastore         
	//  382  568:dup             
	//  383  569:bipush          95
	//  384  571:ldc1            #103 <Float 0.7421F>
	//  385  573:fastore         
	//  386  574:dup             
	//  387  575:bipush          96
	//  388  577:ldc1            #104 <Float 0.7491F>
	//  389  579:fastore         
	//  390  580:dup             
	//  391  581:bipush          97
	//  392  583:ldc1            #105 <Float 0.7559F>
	//  393  585:fastore         
	//  394  586:dup             
	//  395  587:bipush          98
	//  396  589:ldc1            #106 <Float 0.7626F>
	//  397  591:fastore         
	//  398  592:dup             
	//  399  593:bipush          99
	//  400  595:ldc1            #107 <Float 0.7692F>
	//  401  597:fastore         
	//  402  598:dup             
	//  403  599:bipush          100
	//  404  601:ldc1            #108 <Float 0.7756F>
	//  405  603:fastore         
	//  406  604:dup             
	//  407  605:bipush          101
	//  408  607:ldc1            #109 <Float 0.7818F>
	//  409  609:fastore         
	//  410  610:dup             
	//  411  611:bipush          102
	//  412  613:ldc1            #110 <Float 0.7879F>
	//  413  615:fastore         
	//  414  616:dup             
	//  415  617:bipush          103
	//  416  619:ldc1            #111 <Float 0.7938F>
	//  417  621:fastore         
	//  418  622:dup             
	//  419  623:bipush          104
	//  420  625:ldc1            #112 <Float 0.7996F>
	//  421  627:fastore         
	//  422  628:dup             
	//  423  629:bipush          105
	//  424  631:ldc1            #113 <Float 0.8053F>
	//  425  633:fastore         
	//  426  634:dup             
	//  427  635:bipush          106
	//  428  637:ldc1            #114 <Float 0.8108F>
	//  429  639:fastore         
	//  430  640:dup             
	//  431  641:bipush          107
	//  432  643:ldc1            #115 <Float 0.8162F>
	//  433  645:fastore         
	//  434  646:dup             
	//  435  647:bipush          108
	//  436  649:ldc1            #116 <Float 0.8215F>
	//  437  651:fastore         
	//  438  652:dup             
	//  439  653:bipush          109
	//  440  655:ldc1            #117 <Float 0.8266F>
	//  441  657:fastore         
	//  442  658:dup             
	//  443  659:bipush          110
	//  444  661:ldc1            #118 <Float 0.8317F>
	//  445  663:fastore         
	//  446  664:dup             
	//  447  665:bipush          111
	//  448  667:ldc1            #119 <Float 0.8366F>
	//  449  669:fastore         
	//  450  670:dup             
	//  451  671:bipush          112
	//  452  673:ldc1            #120 <Float 0.8414F>
	//  453  675:fastore         
	//  454  676:dup             
	//  455  677:bipush          113
	//  456  679:ldc1            #121 <Float 0.8461F>
	//  457  681:fastore         
	//  458  682:dup             
	//  459  683:bipush          114
	//  460  685:ldc1            #122 <Float 0.8507F>
	//  461  687:fastore         
	//  462  688:dup             
	//  463  689:bipush          115
	//  464  691:ldc1            #123 <Float 0.8551F>
	//  465  693:fastore         
	//  466  694:dup             
	//  467  695:bipush          116
	//  468  697:ldc1            #124 <Float 0.8595F>
	//  469  699:fastore         
	//  470  700:dup             
	//  471  701:bipush          117
	//  472  703:ldc1            #125 <Float 0.8638F>
	//  473  705:fastore         
	//  474  706:dup             
	//  475  707:bipush          118
	//  476  709:ldc1            #126 <Float 0.8679F>
	//  477  711:fastore         
	//  478  712:dup             
	//  479  713:bipush          119
	//  480  715:ldc1            #127 <Float 0.872F>
	//  481  717:fastore         
	//  482  718:dup             
	//  483  719:bipush          120
	//  484  721:ldc1            #128 <Float 0.876F>
	//  485  723:fastore         
	//  486  724:dup             
	//  487  725:bipush          121
	//  488  727:ldc1            #129 <Float 0.8798F>
	//  489  729:fastore         
	//  490  730:dup             
	//  491  731:bipush          122
	//  492  733:ldc1            #130 <Float 0.8836F>
	//  493  735:fastore         
	//  494  736:dup             
	//  495  737:bipush          123
	//  496  739:ldc1            #131 <Float 0.8873F>
	//  497  741:fastore         
	//  498  742:dup             
	//  499  743:bipush          124
	//  500  745:ldc1            #132 <Float 0.8909F>
	//  501  747:fastore         
	//  502  748:dup             
	//  503  749:bipush          125
	//  504  751:ldc1            #133 <Float 0.8945F>
	//  505  753:fastore         
	//  506  754:dup             
	//  507  755:bipush          126
	//  508  757:ldc1            #134 <Float 0.8979F>
	//  509  759:fastore         
	//  510  760:dup             
	//  511  761:bipush          127
	//  512  763:ldc1            #135 <Float 0.9013F>
	//  513  765:fastore         
	//  514  766:dup             
	//  515  767:sipush          128
	//  516  770:ldc1            #136 <Float 0.9046F>
	//  517  772:fastore         
	//  518  773:dup             
	//  519  774:sipush          129
	//  520  777:ldc1            #137 <Float 0.9078F>
	//  521  779:fastore         
	//  522  780:dup             
	//  523  781:sipush          130
	//  524  784:ldc1            #138 <Float 0.9109F>
	//  525  786:fastore         
	//  526  787:dup             
	//  527  788:sipush          131
	//  528  791:ldc1            #139 <Float 0.9139F>
	//  529  793:fastore         
	//  530  794:dup             
	//  531  795:sipush          132
	//  532  798:ldc1            #140 <Float 0.9169F>
	//  533  800:fastore         
	//  534  801:dup             
	//  535  802:sipush          133
	//  536  805:ldc1            #141 <Float 0.9198F>
	//  537  807:fastore         
	//  538  808:dup             
	//  539  809:sipush          134
	//  540  812:ldc1            #142 <Float 0.9227F>
	//  541  814:fastore         
	//  542  815:dup             
	//  543  816:sipush          135
	//  544  819:ldc1            #143 <Float 0.9254F>
	//  545  821:fastore         
	//  546  822:dup             
	//  547  823:sipush          136
	//  548  826:ldc1            #144 <Float 0.9281F>
	//  549  828:fastore         
	//  550  829:dup             
	//  551  830:sipush          137
	//  552  833:ldc1            #145 <Float 0.9307F>
	//  553  835:fastore         
	//  554  836:dup             
	//  555  837:sipush          138
	//  556  840:ldc1            #146 <Float 0.9333F>
	//  557  842:fastore         
	//  558  843:dup             
	//  559  844:sipush          139
	//  560  847:ldc1            #147 <Float 0.9358F>
	//  561  849:fastore         
	//  562  850:dup             
	//  563  851:sipush          140
	//  564  854:ldc1            #148 <Float 0.9382F>
	//  565  856:fastore         
	//  566  857:dup             
	//  567  858:sipush          141
	//  568  861:ldc1            #149 <Float 0.9406F>
	//  569  863:fastore         
	//  570  864:dup             
	//  571  865:sipush          142
	//  572  868:ldc1            #150 <Float 0.9429F>
	//  573  870:fastore         
	//  574  871:dup             
	//  575  872:sipush          143
	//  576  875:ldc1            #151 <Float 0.9452F>
	//  577  877:fastore         
	//  578  878:dup             
	//  579  879:sipush          144
	//  580  882:ldc1            #152 <Float 0.9474F>
	//  581  884:fastore         
	//  582  885:dup             
	//  583  886:sipush          145
	//  584  889:ldc1            #153 <Float 0.9495F>
	//  585  891:fastore         
	//  586  892:dup             
	//  587  893:sipush          146
	//  588  896:ldc1            #154 <Float 0.9516F>
	//  589  898:fastore         
	//  590  899:dup             
	//  591  900:sipush          147
	//  592  903:ldc1            #155 <Float 0.9536F>
	//  593  905:fastore         
	//  594  906:dup             
	//  595  907:sipush          148
	//  596  910:ldc1            #156 <Float 0.9556F>
	//  597  912:fastore         
	//  598  913:dup             
	//  599  914:sipush          149
	//  600  917:ldc1            #157 <Float 0.9575F>
	//  601  919:fastore         
	//  602  920:dup             
	//  603  921:sipush          150
	//  604  924:ldc1            #158 <Float 0.9594F>
	//  605  926:fastore         
	//  606  927:dup             
	//  607  928:sipush          151
	//  608  931:ldc1            #159 <Float 0.9612F>
	//  609  933:fastore         
	//  610  934:dup             
	//  611  935:sipush          152
	//  612  938:ldc1            #160 <Float 0.9629F>
	//  613  940:fastore         
	//  614  941:dup             
	//  615  942:sipush          153
	//  616  945:ldc1            #161 <Float 0.9646F>
	//  617  947:fastore         
	//  618  948:dup             
	//  619  949:sipush          154
	//  620  952:ldc1            #162 <Float 0.9663F>
	//  621  954:fastore         
	//  622  955:dup             
	//  623  956:sipush          155
	//  624  959:ldc1            #163 <Float 0.9679F>
	//  625  961:fastore         
	//  626  962:dup             
	//  627  963:sipush          156
	//  628  966:ldc1            #164 <Float 0.9695F>
	//  629  968:fastore         
	//  630  969:dup             
	//  631  970:sipush          157
	//  632  973:ldc1            #165 <Float 0.971F>
	//  633  975:fastore         
	//  634  976:dup             
	//  635  977:sipush          158
	//  636  980:ldc1            #166 <Float 0.9725F>
	//  637  982:fastore         
	//  638  983:dup             
	//  639  984:sipush          159
	//  640  987:ldc1            #167 <Float 0.9739F>
	//  641  989:fastore         
	//  642  990:dup             
	//  643  991:sipush          160
	//  644  994:ldc1            #168 <Float 0.9753F>
	//  645  996:fastore         
	//  646  997:dup             
	//  647  998:sipush          161
	//  648 1001:ldc1            #169 <Float 0.9766F>
	//  649 1003:fastore         
	//  650 1004:dup             
	//  651 1005:sipush          162
	//  652 1008:ldc1            #170 <Float 0.9779F>
	//  653 1010:fastore         
	//  654 1011:dup             
	//  655 1012:sipush          163
	//  656 1015:ldc1            #171 <Float 0.9791F>
	//  657 1017:fastore         
	//  658 1018:dup             
	//  659 1019:sipush          164
	//  660 1022:ldc1            #172 <Float 0.9803F>
	//  661 1024:fastore         
	//  662 1025:dup             
	//  663 1026:sipush          165
	//  664 1029:ldc1            #173 <Float 0.9815F>
	//  665 1031:fastore         
	//  666 1032:dup             
	//  667 1033:sipush          166
	//  668 1036:ldc1            #174 <Float 0.9826F>
	//  669 1038:fastore         
	//  670 1039:dup             
	//  671 1040:sipush          167
	//  672 1043:ldc1            #175 <Float 0.9837F>
	//  673 1045:fastore         
	//  674 1046:dup             
	//  675 1047:sipush          168
	//  676 1050:ldc1            #176 <Float 0.9848F>
	//  677 1052:fastore         
	//  678 1053:dup             
	//  679 1054:sipush          169
	//  680 1057:ldc1            #177 <Float 0.9858F>
	//  681 1059:fastore         
	//  682 1060:dup             
	//  683 1061:sipush          170
	//  684 1064:ldc1            #178 <Float 0.9867F>
	//  685 1066:fastore         
	//  686 1067:dup             
	//  687 1068:sipush          171
	//  688 1071:ldc1            #179 <Float 0.9877F>
	//  689 1073:fastore         
	//  690 1074:dup             
	//  691 1075:sipush          172
	//  692 1078:ldc1            #180 <Float 0.9885F>
	//  693 1080:fastore         
	//  694 1081:dup             
	//  695 1082:sipush          173
	//  696 1085:ldc1            #181 <Float 0.9894F>
	//  697 1087:fastore         
	//  698 1088:dup             
	//  699 1089:sipush          174
	//  700 1092:ldc1            #182 <Float 0.9902F>
	//  701 1094:fastore         
	//  702 1095:dup             
	//  703 1096:sipush          175
	//  704 1099:ldc1            #183 <Float 0.991F>
	//  705 1101:fastore         
	//  706 1102:dup             
	//  707 1103:sipush          176
	//  708 1106:ldc1            #184 <Float 0.9917F>
	//  709 1108:fastore         
	//  710 1109:dup             
	//  711 1110:sipush          177
	//  712 1113:ldc1            #185 <Float 0.9924F>
	//  713 1115:fastore         
	//  714 1116:dup             
	//  715 1117:sipush          178
	//  716 1120:ldc1            #186 <Float 0.9931F>
	//  717 1122:fastore         
	//  718 1123:dup             
	//  719 1124:sipush          179
	//  720 1127:ldc1            #187 <Float 0.9937F>
	//  721 1129:fastore         
	//  722 1130:dup             
	//  723 1131:sipush          180
	//  724 1134:ldc1            #188 <Float 0.9944F>
	//  725 1136:fastore         
	//  726 1137:dup             
	//  727 1138:sipush          181
	//  728 1141:ldc1            #189 <Float 0.9949F>
	//  729 1143:fastore         
	//  730 1144:dup             
	//  731 1145:sipush          182
	//  732 1148:ldc1            #190 <Float 0.9955F>
	//  733 1150:fastore         
	//  734 1151:dup             
	//  735 1152:sipush          183
	//  736 1155:ldc1            #191 <Float 0.996F>
	//  737 1157:fastore         
	//  738 1158:dup             
	//  739 1159:sipush          184
	//  740 1162:ldc1            #192 <Float 0.9964F>
	//  741 1164:fastore         
	//  742 1165:dup             
	//  743 1166:sipush          185
	//  744 1169:ldc1            #193 <Float 0.9969F>
	//  745 1171:fastore         
	//  746 1172:dup             
	//  747 1173:sipush          186
	//  748 1176:ldc1            #194 <Float 0.9973F>
	//  749 1178:fastore         
	//  750 1179:dup             
	//  751 1180:sipush          187
	//  752 1183:ldc1            #195 <Float 0.9977F>
	//  753 1185:fastore         
	//  754 1186:dup             
	//  755 1187:sipush          188
	//  756 1190:ldc1            #196 <Float 0.998F>
	//  757 1192:fastore         
	//  758 1193:dup             
	//  759 1194:sipush          189
	//  760 1197:ldc1            #197 <Float 0.9984F>
	//  761 1199:fastore         
	//  762 1200:dup             
	//  763 1201:sipush          190
	//  764 1204:ldc1            #198 <Float 0.9986F>
	//  765 1206:fastore         
	//  766 1207:dup             
	//  767 1208:sipush          191
	//  768 1211:ldc1            #199 <Float 0.9989F>
	//  769 1213:fastore         
	//  770 1214:dup             
	//  771 1215:sipush          192
	//  772 1218:ldc1            #200 <Float 0.9991F>
	//  773 1220:fastore         
	//  774 1221:dup             
	//  775 1222:sipush          193
	//  776 1225:ldc1            #201 <Float 0.9993F>
	//  777 1227:fastore         
	//  778 1228:dup             
	//  779 1229:sipush          194
	//  780 1232:ldc1            #202 <Float 0.9995F>
	//  781 1234:fastore         
	//  782 1235:dup             
	//  783 1236:sipush          195
	//  784 1239:ldc1            #203 <Float 0.9997F>
	//  785 1241:fastore         
	//  786 1242:dup             
	//  787 1243:sipush          196
	//  788 1246:ldc1            #204 <Float 0.9998F>
	//  789 1248:fastore         
	//  790 1249:dup             
	//  791 1250:sipush          197
	//  792 1253:ldc1            #205 <Float 0.9999F>
	//  793 1255:fastore         
	//  794 1256:dup             
	//  795 1257:sipush          198
	//  796 1260:ldc1            #205 <Float 0.9999F>
	//  797 1262:fastore         
	//  798 1263:dup             
	//  799 1264:sipush          199
	//  800 1267:fconst_1        
	//  801 1268:fastore         
	//  802 1269:dup             
	//  803 1270:sipush          200
	//  804 1273:fconst_1        
	//  805 1274:fastore         
	//  806 1275:putstatic       #207 <Field float[] VALUES>
	//* 807 1278:return          
	}
}
