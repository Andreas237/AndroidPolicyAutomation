// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class ScheduleViewState extends Enum
{

	private ScheduleViewState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #118 <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static ScheduleViewState valueOf(String s)
	{
		return (ScheduleViewState)Enum.valueOf(com/irobot/core/ScheduleViewState, s);
	//    0    0:ldc1            #2   <Class ScheduleViewState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #124 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ScheduleViewState>
	//    4    9:areturn         
	}

	public static ScheduleViewState[] values()
	{
		return (ScheduleViewState[])((ScheduleViewState []) ($VALUES)).clone();
	//    0    0:getstatic       #116 <Field ScheduleViewState[] $VALUES>
	//    1    3:invokevirtual   #131 <Method Object _5B_Lcom.irobot.core.ScheduleViewState_3B_.clone()>
	//    2    6:checkcast       #127 <Class ScheduleViewState[]>
	//    3    9:areturn         
	}

	private static final ScheduleViewState $VALUES[];
	public static final ScheduleViewState CreateMappingScheduleCloseView;
	public static final ScheduleViewState CreateMappingScheduleDismissAllDialogs;
	public static final ScheduleViewState CreateMappingScheduleDismissProgressDialog;
	public static final ScheduleViewState CreateMappingSchedulePopulateSchedulesList;
	public static final ScheduleViewState CreateMappingScheduleShowCannotConnect;
	public static final ScheduleViewState CreateMappingScheduleShowConflictDialog;
	public static final ScheduleViewState CreateMappingScheduleShowConnectionErrorDialog;
	public static final ScheduleViewState CreateMappingScheduleShowProgressDialog;
	public static final ScheduleViewState CreateMappingScheduleShowTimeoutError;
	public static final ScheduleViewState MappingScheduleDismissAllDialogs;
	public static final ScheduleViewState MappingScheduleDismissProgressDialog;
	public static final ScheduleViewState MappingScheduleEnableListSelection;
	public static final ScheduleViewState MappingSchedulePopulateSchedulesList;
	public static final ScheduleViewState MappingScheduleRemoveScheduleItem;
	public static final ScheduleViewState MappingScheduleShowCannotConnect;
	public static final ScheduleViewState MappingScheduleShowConflictDialog;
	public static final ScheduleViewState MappingScheduleShowConnectionErrorDialog;
	public static final ScheduleViewState MappingScheduleShowMaxCountDialog;
	public static final ScheduleViewState MappingScheduleShowProgressDialog;
	public static final ScheduleViewState MappingScheduleShowScheduleCreateScreen;
	public static final ScheduleViewState MappingScheduleShowTimeoutError;
	public static final ScheduleViewState SimpleSchedulePopulateScheduleMap;
	public static final ScheduleViewState SimpleScheduleShowMappingScheduleView;
	public static final ScheduleViewState SimpleScheduleShowTimePickerDialog;
	public static final ScheduleViewState SimpleScheduleUpdatingScheduleMap;

	static 
	{
		MappingScheduleShowConflictDialog = new ScheduleViewState("MappingScheduleShowConflictDialog", 0);
	//    0    0:new             #2   <Class ScheduleViewState>
	//    1    3:dup             
	//    2    4:ldc1            #36  <String "MappingScheduleShowConflictDialog">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//    5   10:putstatic       #42  <Field ScheduleViewState MappingScheduleShowConflictDialog>
		MappingScheduleShowProgressDialog = new ScheduleViewState("MappingScheduleShowProgressDialog", 1);
	//    6   13:new             #2   <Class ScheduleViewState>
	//    7   16:dup             
	//    8   17:ldc1            #43  <String "MappingScheduleShowProgressDialog">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//   11   23:putstatic       #45  <Field ScheduleViewState MappingScheduleShowProgressDialog>
		MappingScheduleShowTimeoutError = new ScheduleViewState("MappingScheduleShowTimeoutError", 2);
	//   12   26:new             #2   <Class ScheduleViewState>
	//   13   29:dup             
	//   14   30:ldc1            #46  <String "MappingScheduleShowTimeoutError">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//   17   36:putstatic       #48  <Field ScheduleViewState MappingScheduleShowTimeoutError>
		MappingScheduleRemoveScheduleItem = new ScheduleViewState("MappingScheduleRemoveScheduleItem", 3);
	//   18   39:new             #2   <Class ScheduleViewState>
	//   19   42:dup             
	//   20   43:ldc1            #49  <String "MappingScheduleRemoveScheduleItem">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//   23   49:putstatic       #51  <Field ScheduleViewState MappingScheduleRemoveScheduleItem>
		MappingScheduleShowCannotConnect = new ScheduleViewState("MappingScheduleShowCannotConnect", 4);
	//   24   52:new             #2   <Class ScheduleViewState>
	//   25   55:dup             
	//   26   56:ldc1            #52  <String "MappingScheduleShowCannotConnect">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//   29   62:putstatic       #54  <Field ScheduleViewState MappingScheduleShowCannotConnect>
		MappingScheduleShowConnectionErrorDialog = new ScheduleViewState("MappingScheduleShowConnectionErrorDialog", 5);
	//   30   65:new             #2   <Class ScheduleViewState>
	//   31   68:dup             
	//   32   69:ldc1            #55  <String "MappingScheduleShowConnectionErrorDialog">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//   35   75:putstatic       #57  <Field ScheduleViewState MappingScheduleShowConnectionErrorDialog>
		MappingScheduleEnableListSelection = new ScheduleViewState("MappingScheduleEnableListSelection", 6);
	//   36   78:new             #2   <Class ScheduleViewState>
	//   37   81:dup             
	//   38   82:ldc1            #58  <String "MappingScheduleEnableListSelection">
	//   39   84:bipush          6
	//   40   86:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//   41   89:putstatic       #60  <Field ScheduleViewState MappingScheduleEnableListSelection>
		MappingScheduleDismissAllDialogs = new ScheduleViewState("MappingScheduleDismissAllDialogs", 7);
	//   42   92:new             #2   <Class ScheduleViewState>
	//   43   95:dup             
	//   44   96:ldc1            #61  <String "MappingScheduleDismissAllDialogs">
	//   45   98:bipush          7
	//   46  100:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//   47  103:putstatic       #63  <Field ScheduleViewState MappingScheduleDismissAllDialogs>
		MappingScheduleDismissProgressDialog = new ScheduleViewState("MappingScheduleDismissProgressDialog", 8);
	//   48  106:new             #2   <Class ScheduleViewState>
	//   49  109:dup             
	//   50  110:ldc1            #64  <String "MappingScheduleDismissProgressDialog">
	//   51  112:bipush          8
	//   52  114:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//   53  117:putstatic       #66  <Field ScheduleViewState MappingScheduleDismissProgressDialog>
		MappingSchedulePopulateSchedulesList = new ScheduleViewState("MappingSchedulePopulateSchedulesList", 9);
	//   54  120:new             #2   <Class ScheduleViewState>
	//   55  123:dup             
	//   56  124:ldc1            #67  <String "MappingSchedulePopulateSchedulesList">
	//   57  126:bipush          9
	//   58  128:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//   59  131:putstatic       #69  <Field ScheduleViewState MappingSchedulePopulateSchedulesList>
		MappingScheduleShowMaxCountDialog = new ScheduleViewState("MappingScheduleShowMaxCountDialog", 10);
	//   60  134:new             #2   <Class ScheduleViewState>
	//   61  137:dup             
	//   62  138:ldc1            #70  <String "MappingScheduleShowMaxCountDialog">
	//   63  140:bipush          10
	//   64  142:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//   65  145:putstatic       #72  <Field ScheduleViewState MappingScheduleShowMaxCountDialog>
		MappingScheduleShowScheduleCreateScreen = new ScheduleViewState("MappingScheduleShowScheduleCreateScreen", 11);
	//   66  148:new             #2   <Class ScheduleViewState>
	//   67  151:dup             
	//   68  152:ldc1            #73  <String "MappingScheduleShowScheduleCreateScreen">
	//   69  154:bipush          11
	//   70  156:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//   71  159:putstatic       #75  <Field ScheduleViewState MappingScheduleShowScheduleCreateScreen>
		SimpleSchedulePopulateScheduleMap = new ScheduleViewState("SimpleSchedulePopulateScheduleMap", 12);
	//   72  162:new             #2   <Class ScheduleViewState>
	//   73  165:dup             
	//   74  166:ldc1            #76  <String "SimpleSchedulePopulateScheduleMap">
	//   75  168:bipush          12
	//   76  170:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//   77  173:putstatic       #78  <Field ScheduleViewState SimpleSchedulePopulateScheduleMap>
		SimpleScheduleShowMappingScheduleView = new ScheduleViewState("SimpleScheduleShowMappingScheduleView", 13);
	//   78  176:new             #2   <Class ScheduleViewState>
	//   79  179:dup             
	//   80  180:ldc1            #79  <String "SimpleScheduleShowMappingScheduleView">
	//   81  182:bipush          13
	//   82  184:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//   83  187:putstatic       #81  <Field ScheduleViewState SimpleScheduleShowMappingScheduleView>
		SimpleScheduleShowTimePickerDialog = new ScheduleViewState("SimpleScheduleShowTimePickerDialog", 14);
	//   84  190:new             #2   <Class ScheduleViewState>
	//   85  193:dup             
	//   86  194:ldc1            #82  <String "SimpleScheduleShowTimePickerDialog">
	//   87  196:bipush          14
	//   88  198:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//   89  201:putstatic       #84  <Field ScheduleViewState SimpleScheduleShowTimePickerDialog>
		SimpleScheduleUpdatingScheduleMap = new ScheduleViewState("SimpleScheduleUpdatingScheduleMap", 15);
	//   90  204:new             #2   <Class ScheduleViewState>
	//   91  207:dup             
	//   92  208:ldc1            #85  <String "SimpleScheduleUpdatingScheduleMap">
	//   93  210:bipush          15
	//   94  212:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//   95  215:putstatic       #87  <Field ScheduleViewState SimpleScheduleUpdatingScheduleMap>
		CreateMappingScheduleShowConnectionErrorDialog = new ScheduleViewState("CreateMappingScheduleShowConnectionErrorDialog", 16);
	//   96  218:new             #2   <Class ScheduleViewState>
	//   97  221:dup             
	//   98  222:ldc1            #88  <String "CreateMappingScheduleShowConnectionErrorDialog">
	//   99  224:bipush          16
	//  100  226:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//  101  229:putstatic       #90  <Field ScheduleViewState CreateMappingScheduleShowConnectionErrorDialog>
		CreateMappingScheduleDismissAllDialogs = new ScheduleViewState("CreateMappingScheduleDismissAllDialogs", 17);
	//  102  232:new             #2   <Class ScheduleViewState>
	//  103  235:dup             
	//  104  236:ldc1            #91  <String "CreateMappingScheduleDismissAllDialogs">
	//  105  238:bipush          17
	//  106  240:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//  107  243:putstatic       #93  <Field ScheduleViewState CreateMappingScheduleDismissAllDialogs>
		CreateMappingScheduleShowCannotConnect = new ScheduleViewState("CreateMappingScheduleShowCannotConnect", 18);
	//  108  246:new             #2   <Class ScheduleViewState>
	//  109  249:dup             
	//  110  250:ldc1            #94  <String "CreateMappingScheduleShowCannotConnect">
	//  111  252:bipush          18
	//  112  254:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//  113  257:putstatic       #96  <Field ScheduleViewState CreateMappingScheduleShowCannotConnect>
		CreateMappingSchedulePopulateSchedulesList = new ScheduleViewState("CreateMappingSchedulePopulateSchedulesList", 19);
	//  114  260:new             #2   <Class ScheduleViewState>
	//  115  263:dup             
	//  116  264:ldc1            #97  <String "CreateMappingSchedulePopulateSchedulesList">
	//  117  266:bipush          19
	//  118  268:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//  119  271:putstatic       #99  <Field ScheduleViewState CreateMappingSchedulePopulateSchedulesList>
		CreateMappingScheduleCloseView = new ScheduleViewState("CreateMappingScheduleCloseView", 20);
	//  120  274:new             #2   <Class ScheduleViewState>
	//  121  277:dup             
	//  122  278:ldc1            #100 <String "CreateMappingScheduleCloseView">
	//  123  280:bipush          20
	//  124  282:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//  125  285:putstatic       #102 <Field ScheduleViewState CreateMappingScheduleCloseView>
		CreateMappingScheduleShowTimeoutError = new ScheduleViewState("CreateMappingScheduleShowTimeoutError", 21);
	//  126  288:new             #2   <Class ScheduleViewState>
	//  127  291:dup             
	//  128  292:ldc1            #103 <String "CreateMappingScheduleShowTimeoutError">
	//  129  294:bipush          21
	//  130  296:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//  131  299:putstatic       #105 <Field ScheduleViewState CreateMappingScheduleShowTimeoutError>
		CreateMappingScheduleDismissProgressDialog = new ScheduleViewState("CreateMappingScheduleDismissProgressDialog", 22);
	//  132  302:new             #2   <Class ScheduleViewState>
	//  133  305:dup             
	//  134  306:ldc1            #106 <String "CreateMappingScheduleDismissProgressDialog">
	//  135  308:bipush          22
	//  136  310:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//  137  313:putstatic       #108 <Field ScheduleViewState CreateMappingScheduleDismissProgressDialog>
		CreateMappingScheduleShowProgressDialog = new ScheduleViewState("CreateMappingScheduleShowProgressDialog", 23);
	//  138  316:new             #2   <Class ScheduleViewState>
	//  139  319:dup             
	//  140  320:ldc1            #109 <String "CreateMappingScheduleShowProgressDialog">
	//  141  322:bipush          23
	//  142  324:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//  143  327:putstatic       #111 <Field ScheduleViewState CreateMappingScheduleShowProgressDialog>
		CreateMappingScheduleShowConflictDialog = new ScheduleViewState("CreateMappingScheduleShowConflictDialog", 24);
	//  144  330:new             #2   <Class ScheduleViewState>
	//  145  333:dup             
	//  146  334:ldc1            #112 <String "CreateMappingScheduleShowConflictDialog">
	//  147  336:bipush          24
	//  148  338:invokespecial   #40  <Method void ScheduleViewState(String, int)>
	//  149  341:putstatic       #114 <Field ScheduleViewState CreateMappingScheduleShowConflictDialog>
		$VALUES = (new ScheduleViewState[] {
			MappingScheduleShowConflictDialog, MappingScheduleShowProgressDialog, MappingScheduleShowTimeoutError, MappingScheduleRemoveScheduleItem, MappingScheduleShowCannotConnect, MappingScheduleShowConnectionErrorDialog, MappingScheduleEnableListSelection, MappingScheduleDismissAllDialogs, MappingScheduleDismissProgressDialog, MappingSchedulePopulateSchedulesList, 
			MappingScheduleShowMaxCountDialog, MappingScheduleShowScheduleCreateScreen, SimpleSchedulePopulateScheduleMap, SimpleScheduleShowMappingScheduleView, SimpleScheduleShowTimePickerDialog, SimpleScheduleUpdatingScheduleMap, CreateMappingScheduleShowConnectionErrorDialog, CreateMappingScheduleDismissAllDialogs, CreateMappingScheduleShowCannotConnect, CreateMappingSchedulePopulateSchedulesList, 
			CreateMappingScheduleCloseView, CreateMappingScheduleShowTimeoutError, CreateMappingScheduleDismissProgressDialog, CreateMappingScheduleShowProgressDialog, CreateMappingScheduleShowConflictDialog
		});
	//  150  344:bipush          25
	//  151  346:anewarray       ScheduleViewState[]
	//  152  349:dup             
	//  153  350:iconst_0        
	//  154  351:getstatic       #42  <Field ScheduleViewState MappingScheduleShowConflictDialog>
	//  155  354:aastore         
	//  156  355:dup             
	//  157  356:iconst_1        
	//  158  357:getstatic       #45  <Field ScheduleViewState MappingScheduleShowProgressDialog>
	//  159  360:aastore         
	//  160  361:dup             
	//  161  362:iconst_2        
	//  162  363:getstatic       #48  <Field ScheduleViewState MappingScheduleShowTimeoutError>
	//  163  366:aastore         
	//  164  367:dup             
	//  165  368:iconst_3        
	//  166  369:getstatic       #51  <Field ScheduleViewState MappingScheduleRemoveScheduleItem>
	//  167  372:aastore         
	//  168  373:dup             
	//  169  374:iconst_4        
	//  170  375:getstatic       #54  <Field ScheduleViewState MappingScheduleShowCannotConnect>
	//  171  378:aastore         
	//  172  379:dup             
	//  173  380:iconst_5        
	//  174  381:getstatic       #57  <Field ScheduleViewState MappingScheduleShowConnectionErrorDialog>
	//  175  384:aastore         
	//  176  385:dup             
	//  177  386:bipush          6
	//  178  388:getstatic       #60  <Field ScheduleViewState MappingScheduleEnableListSelection>
	//  179  391:aastore         
	//  180  392:dup             
	//  181  393:bipush          7
	//  182  395:getstatic       #63  <Field ScheduleViewState MappingScheduleDismissAllDialogs>
	//  183  398:aastore         
	//  184  399:dup             
	//  185  400:bipush          8
	//  186  402:getstatic       #66  <Field ScheduleViewState MappingScheduleDismissProgressDialog>
	//  187  405:aastore         
	//  188  406:dup             
	//  189  407:bipush          9
	//  190  409:getstatic       #69  <Field ScheduleViewState MappingSchedulePopulateSchedulesList>
	//  191  412:aastore         
	//  192  413:dup             
	//  193  414:bipush          10
	//  194  416:getstatic       #72  <Field ScheduleViewState MappingScheduleShowMaxCountDialog>
	//  195  419:aastore         
	//  196  420:dup             
	//  197  421:bipush          11
	//  198  423:getstatic       #75  <Field ScheduleViewState MappingScheduleShowScheduleCreateScreen>
	//  199  426:aastore         
	//  200  427:dup             
	//  201  428:bipush          12
	//  202  430:getstatic       #78  <Field ScheduleViewState SimpleSchedulePopulateScheduleMap>
	//  203  433:aastore         
	//  204  434:dup             
	//  205  435:bipush          13
	//  206  437:getstatic       #81  <Field ScheduleViewState SimpleScheduleShowMappingScheduleView>
	//  207  440:aastore         
	//  208  441:dup             
	//  209  442:bipush          14
	//  210  444:getstatic       #84  <Field ScheduleViewState SimpleScheduleShowTimePickerDialog>
	//  211  447:aastore         
	//  212  448:dup             
	//  213  449:bipush          15
	//  214  451:getstatic       #87  <Field ScheduleViewState SimpleScheduleUpdatingScheduleMap>
	//  215  454:aastore         
	//  216  455:dup             
	//  217  456:bipush          16
	//  218  458:getstatic       #90  <Field ScheduleViewState CreateMappingScheduleShowConnectionErrorDialog>
	//  219  461:aastore         
	//  220  462:dup             
	//  221  463:bipush          17
	//  222  465:getstatic       #93  <Field ScheduleViewState CreateMappingScheduleDismissAllDialogs>
	//  223  468:aastore         
	//  224  469:dup             
	//  225  470:bipush          18
	//  226  472:getstatic       #96  <Field ScheduleViewState CreateMappingScheduleShowCannotConnect>
	//  227  475:aastore         
	//  228  476:dup             
	//  229  477:bipush          19
	//  230  479:getstatic       #99  <Field ScheduleViewState CreateMappingSchedulePopulateSchedulesList>
	//  231  482:aastore         
	//  232  483:dup             
	//  233  484:bipush          20
	//  234  486:getstatic       #102 <Field ScheduleViewState CreateMappingScheduleCloseView>
	//  235  489:aastore         
	//  236  490:dup             
	//  237  491:bipush          21
	//  238  493:getstatic       #105 <Field ScheduleViewState CreateMappingScheduleShowTimeoutError>
	//  239  496:aastore         
	//  240  497:dup             
	//  241  498:bipush          22
	//  242  500:getstatic       #108 <Field ScheduleViewState CreateMappingScheduleDismissProgressDialog>
	//  243  503:aastore         
	//  244  504:dup             
	//  245  505:bipush          23
	//  246  507:getstatic       #111 <Field ScheduleViewState CreateMappingScheduleShowProgressDialog>
	//  247  510:aastore         
	//  248  511:dup             
	//  249  512:bipush          24
	//  250  514:getstatic       #114 <Field ScheduleViewState CreateMappingScheduleShowConflictDialog>
	//  251  517:aastore         
	//  252  518:putstatic       #116 <Field ScheduleViewState[] $VALUES>
	//* 253  521:return          
	}
}
