// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class CommandType extends Enum
{

	private CommandType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #154 <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static CommandType valueOf(String s)
	{
		return (CommandType)Enum.valueOf(com/irobot/core/CommandType, s);
	//    0    0:ldc1            #2   <Class CommandType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #160 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CommandType>
	//    4    9:areturn         
	}

	public static CommandType[] values()
	{
		return (CommandType[])((CommandType []) ($VALUES)).clone();
	//    0    0:getstatic       #152 <Field CommandType[] $VALUES>
	//    1    3:invokevirtual   #167 <Method Object _5B_Lcom.irobot.core.CommandType_3B_.clone()>
	//    2    6:checkcast       #163 <Class CommandType[]>
	//    3    9:areturn         
	}

	private static final CommandType $VALUES[];
	public static final CommandType BYE;
	public static final CommandType CLEAN;
	public static final CommandType DLPKG;
	public static final CommandType DOCK;
	public static final CommandType EVAC;
	public static final CommandType FBEEP;
	public static final CommandType FIND;
	public static final CommandType INVALID;
	public static final CommandType IPDONE;
	public static final CommandType OFF;
	public static final CommandType PATCH;
	public static final CommandType PAUSE;
	public static final CommandType PROVDONE;
	public static final CommandType QUERYDOCK;
	public static final CommandType QUICK;
	public static final CommandType RECHRG;
	public static final CommandType RESET;
	public static final CommandType RESUME;
	public static final CommandType SLEEP;
	public static final CommandType SPOT;
	public static final CommandType SPRAY;
	public static final CommandType START;
	public static final CommandType STARTVIBRATE;
	public static final CommandType STOP;
	public static final CommandType STOPVIBRATE;
	public static final CommandType TRAIN;
	public static final CommandType WAKE;
	public static final CommandType WIFISCAN;
	public static final CommandType WIPE;
	public static final CommandType WLAPOFF;
	public static final CommandType WLAPON;
	public static final CommandType WLLOGFLUSH;
	public static final CommandType WLSTOFF;
	public static final CommandType WLSTON;

	static 
	{
		CLEAN = new CommandType("CLEAN", 0);
	//    0    0:new             #2   <Class CommandType>
	//    1    3:dup             
	//    2    4:ldc1            #45  <String "CLEAN">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #49  <Method void CommandType(String, int)>
	//    5   10:putstatic       #51  <Field CommandType CLEAN>
		QUICK = new CommandType("QUICK", 1);
	//    6   13:new             #2   <Class CommandType>
	//    7   16:dup             
	//    8   17:ldc1            #52  <String "QUICK">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #49  <Method void CommandType(String, int)>
	//   11   23:putstatic       #54  <Field CommandType QUICK>
		SPOT = new CommandType("SPOT", 2);
	//   12   26:new             #2   <Class CommandType>
	//   13   29:dup             
	//   14   30:ldc1            #55  <String "SPOT">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #49  <Method void CommandType(String, int)>
	//   17   36:putstatic       #57  <Field CommandType SPOT>
		DOCK = new CommandType("DOCK", 3);
	//   18   39:new             #2   <Class CommandType>
	//   19   42:dup             
	//   20   43:ldc1            #58  <String "DOCK">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #49  <Method void CommandType(String, int)>
	//   23   49:putstatic       #60  <Field CommandType DOCK>
		START = new CommandType("START", 4);
	//   24   52:new             #2   <Class CommandType>
	//   25   55:dup             
	//   26   56:ldc1            #61  <String "START">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #49  <Method void CommandType(String, int)>
	//   29   62:putstatic       #63  <Field CommandType START>
		PAUSE = new CommandType("PAUSE", 5);
	//   30   65:new             #2   <Class CommandType>
	//   31   68:dup             
	//   32   69:ldc1            #64  <String "PAUSE">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #49  <Method void CommandType(String, int)>
	//   35   75:putstatic       #66  <Field CommandType PAUSE>
		RESUME = new CommandType("RESUME", 6);
	//   36   78:new             #2   <Class CommandType>
	//   37   81:dup             
	//   38   82:ldc1            #67  <String "RESUME">
	//   39   84:bipush          6
	//   40   86:invokespecial   #49  <Method void CommandType(String, int)>
	//   41   89:putstatic       #69  <Field CommandType RESUME>
		STOP = new CommandType("STOP", 7);
	//   42   92:new             #2   <Class CommandType>
	//   43   95:dup             
	//   44   96:ldc1            #70  <String "STOP">
	//   45   98:bipush          7
	//   46  100:invokespecial   #49  <Method void CommandType(String, int)>
	//   47  103:putstatic       #72  <Field CommandType STOP>
		WAKE = new CommandType("WAKE", 8);
	//   48  106:new             #2   <Class CommandType>
	//   49  109:dup             
	//   50  110:ldc1            #73  <String "WAKE">
	//   51  112:bipush          8
	//   52  114:invokespecial   #49  <Method void CommandType(String, int)>
	//   53  117:putstatic       #75  <Field CommandType WAKE>
		RESET = new CommandType("RESET", 9);
	//   54  120:new             #2   <Class CommandType>
	//   55  123:dup             
	//   56  124:ldc1            #76  <String "RESET">
	//   57  126:bipush          9
	//   58  128:invokespecial   #49  <Method void CommandType(String, int)>
	//   59  131:putstatic       #78  <Field CommandType RESET>
		FIND = new CommandType("FIND", 10);
	//   60  134:new             #2   <Class CommandType>
	//   61  137:dup             
	//   62  138:ldc1            #79  <String "FIND">
	//   63  140:bipush          10
	//   64  142:invokespecial   #49  <Method void CommandType(String, int)>
	//   65  145:putstatic       #81  <Field CommandType FIND>
		WIPE = new CommandType("WIPE", 11);
	//   66  148:new             #2   <Class CommandType>
	//   67  151:dup             
	//   68  152:ldc1            #82  <String "WIPE">
	//   69  154:bipush          11
	//   70  156:invokespecial   #49  <Method void CommandType(String, int)>
	//   71  159:putstatic       #84  <Field CommandType WIPE>
		PATCH = new CommandType("PATCH", 12);
	//   72  162:new             #2   <Class CommandType>
	//   73  165:dup             
	//   74  166:ldc1            #85  <String "PATCH">
	//   75  168:bipush          12
	//   76  170:invokespecial   #49  <Method void CommandType(String, int)>
	//   77  173:putstatic       #87  <Field CommandType PATCH>
		DLPKG = new CommandType("DLPKG", 13);
	//   78  176:new             #2   <Class CommandType>
	//   79  179:dup             
	//   80  180:ldc1            #88  <String "DLPKG">
	//   81  182:bipush          13
	//   82  184:invokespecial   #49  <Method void CommandType(String, int)>
	//   83  187:putstatic       #90  <Field CommandType DLPKG>
		RECHRG = new CommandType("RECHRG", 14);
	//   84  190:new             #2   <Class CommandType>
	//   85  193:dup             
	//   86  194:ldc1            #91  <String "RECHRG">
	//   87  196:bipush          14
	//   88  198:invokespecial   #49  <Method void CommandType(String, int)>
	//   89  201:putstatic       #93  <Field CommandType RECHRG>
		WLAPON = new CommandType("WLAPON", 15);
	//   90  204:new             #2   <Class CommandType>
	//   91  207:dup             
	//   92  208:ldc1            #94  <String "WLAPON">
	//   93  210:bipush          15
	//   94  212:invokespecial   #49  <Method void CommandType(String, int)>
	//   95  215:putstatic       #96  <Field CommandType WLAPON>
		WLAPOFF = new CommandType("WLAPOFF", 16);
	//   96  218:new             #2   <Class CommandType>
	//   97  221:dup             
	//   98  222:ldc1            #97  <String "WLAPOFF">
	//   99  224:bipush          16
	//  100  226:invokespecial   #49  <Method void CommandType(String, int)>
	//  101  229:putstatic       #99  <Field CommandType WLAPOFF>
		WLSTON = new CommandType("WLSTON", 17);
	//  102  232:new             #2   <Class CommandType>
	//  103  235:dup             
	//  104  236:ldc1            #100 <String "WLSTON">
	//  105  238:bipush          17
	//  106  240:invokespecial   #49  <Method void CommandType(String, int)>
	//  107  243:putstatic       #102 <Field CommandType WLSTON>
		WLSTOFF = new CommandType("WLSTOFF", 18);
	//  108  246:new             #2   <Class CommandType>
	//  109  249:dup             
	//  110  250:ldc1            #103 <String "WLSTOFF">
	//  111  252:bipush          18
	//  112  254:invokespecial   #49  <Method void CommandType(String, int)>
	//  113  257:putstatic       #105 <Field CommandType WLSTOFF>
		WIFISCAN = new CommandType("WIFISCAN", 19);
	//  114  260:new             #2   <Class CommandType>
	//  115  263:dup             
	//  116  264:ldc1            #106 <String "WIFISCAN">
	//  117  266:bipush          19
	//  118  268:invokespecial   #49  <Method void CommandType(String, int)>
	//  119  271:putstatic       #108 <Field CommandType WIFISCAN>
		IPDONE = new CommandType("IPDONE", 20);
	//  120  274:new             #2   <Class CommandType>
	//  121  277:dup             
	//  122  278:ldc1            #109 <String "IPDONE">
	//  123  280:bipush          20
	//  124  282:invokespecial   #49  <Method void CommandType(String, int)>
	//  125  285:putstatic       #111 <Field CommandType IPDONE>
		PROVDONE = new CommandType("PROVDONE", 21);
	//  126  288:new             #2   <Class CommandType>
	//  127  291:dup             
	//  128  292:ldc1            #112 <String "PROVDONE">
	//  129  294:bipush          21
	//  130  296:invokespecial   #49  <Method void CommandType(String, int)>
	//  131  299:putstatic       #114 <Field CommandType PROVDONE>
		BYE = new CommandType("BYE", 22);
	//  132  302:new             #2   <Class CommandType>
	//  133  305:dup             
	//  134  306:ldc1            #115 <String "BYE">
	//  135  308:bipush          22
	//  136  310:invokespecial   #49  <Method void CommandType(String, int)>
	//  137  313:putstatic       #117 <Field CommandType BYE>
		WLLOGFLUSH = new CommandType("WLLOGFLUSH", 23);
	//  138  316:new             #2   <Class CommandType>
	//  139  319:dup             
	//  140  320:ldc1            #118 <String "WLLOGFLUSH">
	//  141  322:bipush          23
	//  142  324:invokespecial   #49  <Method void CommandType(String, int)>
	//  143  327:putstatic       #120 <Field CommandType WLLOGFLUSH>
		SLEEP = new CommandType("SLEEP", 24);
	//  144  330:new             #2   <Class CommandType>
	//  145  333:dup             
	//  146  334:ldc1            #121 <String "SLEEP">
	//  147  336:bipush          24
	//  148  338:invokespecial   #49  <Method void CommandType(String, int)>
	//  149  341:putstatic       #123 <Field CommandType SLEEP>
		OFF = new CommandType("OFF", 25);
	//  150  344:new             #2   <Class CommandType>
	//  151  347:dup             
	//  152  348:ldc1            #124 <String "OFF">
	//  153  350:bipush          25
	//  154  352:invokespecial   #49  <Method void CommandType(String, int)>
	//  155  355:putstatic       #126 <Field CommandType OFF>
		FBEEP = new CommandType("FBEEP", 26);
	//  156  358:new             #2   <Class CommandType>
	//  157  361:dup             
	//  158  362:ldc1            #127 <String "FBEEP">
	//  159  364:bipush          26
	//  160  366:invokespecial   #49  <Method void CommandType(String, int)>
	//  161  369:putstatic       #129 <Field CommandType FBEEP>
		EVAC = new CommandType("EVAC", 27);
	//  162  372:new             #2   <Class CommandType>
	//  163  375:dup             
	//  164  376:ldc1            #130 <String "EVAC">
	//  165  378:bipush          27
	//  166  380:invokespecial   #49  <Method void CommandType(String, int)>
	//  167  383:putstatic       #132 <Field CommandType EVAC>
		QUERYDOCK = new CommandType("QUERYDOCK", 28);
	//  168  386:new             #2   <Class CommandType>
	//  169  389:dup             
	//  170  390:ldc1            #133 <String "QUERYDOCK">
	//  171  392:bipush          28
	//  172  394:invokespecial   #49  <Method void CommandType(String, int)>
	//  173  397:putstatic       #135 <Field CommandType QUERYDOCK>
		STARTVIBRATE = new CommandType("STARTVIBRATE", 29);
	//  174  400:new             #2   <Class CommandType>
	//  175  403:dup             
	//  176  404:ldc1            #136 <String "STARTVIBRATE">
	//  177  406:bipush          29
	//  178  408:invokespecial   #49  <Method void CommandType(String, int)>
	//  179  411:putstatic       #138 <Field CommandType STARTVIBRATE>
		STOPVIBRATE = new CommandType("STOPVIBRATE", 30);
	//  180  414:new             #2   <Class CommandType>
	//  181  417:dup             
	//  182  418:ldc1            #139 <String "STOPVIBRATE">
	//  183  420:bipush          30
	//  184  422:invokespecial   #49  <Method void CommandType(String, int)>
	//  185  425:putstatic       #141 <Field CommandType STOPVIBRATE>
		SPRAY = new CommandType("SPRAY", 31);
	//  186  428:new             #2   <Class CommandType>
	//  187  431:dup             
	//  188  432:ldc1            #142 <String "SPRAY">
	//  189  434:bipush          31
	//  190  436:invokespecial   #49  <Method void CommandType(String, int)>
	//  191  439:putstatic       #144 <Field CommandType SPRAY>
		INVALID = new CommandType("INVALID", 32);
	//  192  442:new             #2   <Class CommandType>
	//  193  445:dup             
	//  194  446:ldc1            #145 <String "INVALID">
	//  195  448:bipush          32
	//  196  450:invokespecial   #49  <Method void CommandType(String, int)>
	//  197  453:putstatic       #147 <Field CommandType INVALID>
		TRAIN = new CommandType("TRAIN", 33);
	//  198  456:new             #2   <Class CommandType>
	//  199  459:dup             
	//  200  460:ldc1            #148 <String "TRAIN">
	//  201  462:bipush          33
	//  202  464:invokespecial   #49  <Method void CommandType(String, int)>
	//  203  467:putstatic       #150 <Field CommandType TRAIN>
		$VALUES = (new CommandType[] {
			CLEAN, QUICK, SPOT, DOCK, START, PAUSE, RESUME, STOP, WAKE, RESET, 
			FIND, WIPE, PATCH, DLPKG, RECHRG, WLAPON, WLAPOFF, WLSTON, WLSTOFF, WIFISCAN, 
			IPDONE, PROVDONE, BYE, WLLOGFLUSH, SLEEP, OFF, FBEEP, EVAC, QUERYDOCK, STARTVIBRATE, 
			STOPVIBRATE, SPRAY, INVALID, TRAIN
		});
	//  204  470:bipush          34
	//  205  472:anewarray       CommandType[]
	//  206  475:dup             
	//  207  476:iconst_0        
	//  208  477:getstatic       #51  <Field CommandType CLEAN>
	//  209  480:aastore         
	//  210  481:dup             
	//  211  482:iconst_1        
	//  212  483:getstatic       #54  <Field CommandType QUICK>
	//  213  486:aastore         
	//  214  487:dup             
	//  215  488:iconst_2        
	//  216  489:getstatic       #57  <Field CommandType SPOT>
	//  217  492:aastore         
	//  218  493:dup             
	//  219  494:iconst_3        
	//  220  495:getstatic       #60  <Field CommandType DOCK>
	//  221  498:aastore         
	//  222  499:dup             
	//  223  500:iconst_4        
	//  224  501:getstatic       #63  <Field CommandType START>
	//  225  504:aastore         
	//  226  505:dup             
	//  227  506:iconst_5        
	//  228  507:getstatic       #66  <Field CommandType PAUSE>
	//  229  510:aastore         
	//  230  511:dup             
	//  231  512:bipush          6
	//  232  514:getstatic       #69  <Field CommandType RESUME>
	//  233  517:aastore         
	//  234  518:dup             
	//  235  519:bipush          7
	//  236  521:getstatic       #72  <Field CommandType STOP>
	//  237  524:aastore         
	//  238  525:dup             
	//  239  526:bipush          8
	//  240  528:getstatic       #75  <Field CommandType WAKE>
	//  241  531:aastore         
	//  242  532:dup             
	//  243  533:bipush          9
	//  244  535:getstatic       #78  <Field CommandType RESET>
	//  245  538:aastore         
	//  246  539:dup             
	//  247  540:bipush          10
	//  248  542:getstatic       #81  <Field CommandType FIND>
	//  249  545:aastore         
	//  250  546:dup             
	//  251  547:bipush          11
	//  252  549:getstatic       #84  <Field CommandType WIPE>
	//  253  552:aastore         
	//  254  553:dup             
	//  255  554:bipush          12
	//  256  556:getstatic       #87  <Field CommandType PATCH>
	//  257  559:aastore         
	//  258  560:dup             
	//  259  561:bipush          13
	//  260  563:getstatic       #90  <Field CommandType DLPKG>
	//  261  566:aastore         
	//  262  567:dup             
	//  263  568:bipush          14
	//  264  570:getstatic       #93  <Field CommandType RECHRG>
	//  265  573:aastore         
	//  266  574:dup             
	//  267  575:bipush          15
	//  268  577:getstatic       #96  <Field CommandType WLAPON>
	//  269  580:aastore         
	//  270  581:dup             
	//  271  582:bipush          16
	//  272  584:getstatic       #99  <Field CommandType WLAPOFF>
	//  273  587:aastore         
	//  274  588:dup             
	//  275  589:bipush          17
	//  276  591:getstatic       #102 <Field CommandType WLSTON>
	//  277  594:aastore         
	//  278  595:dup             
	//  279  596:bipush          18
	//  280  598:getstatic       #105 <Field CommandType WLSTOFF>
	//  281  601:aastore         
	//  282  602:dup             
	//  283  603:bipush          19
	//  284  605:getstatic       #108 <Field CommandType WIFISCAN>
	//  285  608:aastore         
	//  286  609:dup             
	//  287  610:bipush          20
	//  288  612:getstatic       #111 <Field CommandType IPDONE>
	//  289  615:aastore         
	//  290  616:dup             
	//  291  617:bipush          21
	//  292  619:getstatic       #114 <Field CommandType PROVDONE>
	//  293  622:aastore         
	//  294  623:dup             
	//  295  624:bipush          22
	//  296  626:getstatic       #117 <Field CommandType BYE>
	//  297  629:aastore         
	//  298  630:dup             
	//  299  631:bipush          23
	//  300  633:getstatic       #120 <Field CommandType WLLOGFLUSH>
	//  301  636:aastore         
	//  302  637:dup             
	//  303  638:bipush          24
	//  304  640:getstatic       #123 <Field CommandType SLEEP>
	//  305  643:aastore         
	//  306  644:dup             
	//  307  645:bipush          25
	//  308  647:getstatic       #126 <Field CommandType OFF>
	//  309  650:aastore         
	//  310  651:dup             
	//  311  652:bipush          26
	//  312  654:getstatic       #129 <Field CommandType FBEEP>
	//  313  657:aastore         
	//  314  658:dup             
	//  315  659:bipush          27
	//  316  661:getstatic       #132 <Field CommandType EVAC>
	//  317  664:aastore         
	//  318  665:dup             
	//  319  666:bipush          28
	//  320  668:getstatic       #135 <Field CommandType QUERYDOCK>
	//  321  671:aastore         
	//  322  672:dup             
	//  323  673:bipush          29
	//  324  675:getstatic       #138 <Field CommandType STARTVIBRATE>
	//  325  678:aastore         
	//  326  679:dup             
	//  327  680:bipush          30
	//  328  682:getstatic       #141 <Field CommandType STOPVIBRATE>
	//  329  685:aastore         
	//  330  686:dup             
	//  331  687:bipush          31
	//  332  689:getstatic       #144 <Field CommandType SPRAY>
	//  333  692:aastore         
	//  334  693:dup             
	//  335  694:bipush          32
	//  336  696:getstatic       #147 <Field CommandType INVALID>
	//  337  699:aastore         
	//  338  700:dup             
	//  339  701:bipush          33
	//  340  703:getstatic       #150 <Field CommandType TRAIN>
	//  341  706:aastore         
	//  342  707:putstatic       #152 <Field CommandType[] $VALUES>
	//* 343  710:return          
	}
}
