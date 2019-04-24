// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class MapsDataState extends Enum
{

	private MapsDataState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #146 <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static MapsDataState valueOf(String s)
	{
		return (MapsDataState)Enum.valueOf(com/irobot/core/MapsDataState, s);
	//    0    0:ldc1            #2   <Class MapsDataState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #152 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MapsDataState>
	//    4    9:areturn         
	}

	public static MapsDataState[] values()
	{
		return (MapsDataState[])((MapsDataState []) ($VALUES)).clone();
	//    0    0:getstatic       #144 <Field MapsDataState[] $VALUES>
	//    1    3:invokevirtual   #159 <Method Object _5B_Lcom.irobot.core.MapsDataState_3B_.clone()>
	//    2    6:checkcast       #155 <Class MapsDataState[]>
	//    3    9:areturn         
	}

	private static final MapsDataState $VALUES[];
	public static final MapsDataState ActiveFloorMapId;
	public static final MapsDataState ActiveFloorRegionIds;
	public static final MapsDataState DirtDetectsHidden;
	public static final MapsDataState ErrorDismissed;
	public static final MapsDataState ErrorMessage;
	public static final MapsDataState FloorPlanListItemModes;
	public static final MapsDataState FloorPlanListMapId;
	public static final MapsDataState FloorPlanListMapVersionId;
	public static final MapsDataState FloorPlanSelectionListItem;
	public static final MapsDataState HighestLearningPercentage;
	public static final MapsDataState Invalid;
	public static final MapsDataState MapCompleted;
	public static final MapsDataState MapCustomizationInfo;
	public static final MapsDataState MapReadyForSetUp;
	public static final MapsDataState MissionDetailsViewState;
	public static final MapsDataState MissionHistoryDetails;
	public static final MapsDataState MissionMapType;
	public static final MapsDataState MissionMapZoomState;
	public static final MapsDataState NewMapName;
	public static final MapsDataState PlaybackProgress;
	public static final MapsDataState RegionNamePlaceHolder;
	public static final MapsDataState RegionTypeChange;
	public static final MapsDataState RenameRegion;
	public static final MapsDataState RunActionCommandType;
	public static final MapsDataState RunActionMapId;
	public static final MapsDataState RuntimeChart;
	public static final MapsDataState SelectedRegionNamePlaceHolder;
	public static final MapsDataState SetCustomizationMapId;
	public static final MapsDataState SetPlatformViewDimensions;
	public static final MapsDataState ToggleRegionSelectionId;
	public static final MapsDataState WifiBadRegions;
	public static final MapsDataState WifiColorLegend;

	static 
	{
		MissionDetailsViewState = new MapsDataState("MissionDetailsViewState", 0);
	//    0    0:new             #2   <Class MapsDataState>
	//    1    3:dup             
	//    2    4:ldc1            #43  <String "MissionDetailsViewState">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #47  <Method void MapsDataState(String, int)>
	//    5   10:putstatic       #49  <Field MapsDataState MissionDetailsViewState>
		MapCustomizationInfo = new MapsDataState("MapCustomizationInfo", 1);
	//    6   13:new             #2   <Class MapsDataState>
	//    7   16:dup             
	//    8   17:ldc1            #50  <String "MapCustomizationInfo">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #47  <Method void MapsDataState(String, int)>
	//   11   23:putstatic       #52  <Field MapsDataState MapCustomizationInfo>
		ErrorMessage = new MapsDataState("ErrorMessage", 2);
	//   12   26:new             #2   <Class MapsDataState>
	//   13   29:dup             
	//   14   30:ldc1            #53  <String "ErrorMessage">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #47  <Method void MapsDataState(String, int)>
	//   17   36:putstatic       #55  <Field MapsDataState ErrorMessage>
		RuntimeChart = new MapsDataState("RuntimeChart", 3);
	//   18   39:new             #2   <Class MapsDataState>
	//   19   42:dup             
	//   20   43:ldc1            #56  <String "RuntimeChart">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #47  <Method void MapsDataState(String, int)>
	//   23   49:putstatic       #58  <Field MapsDataState RuntimeChart>
		MissionHistoryDetails = new MapsDataState("MissionHistoryDetails", 4);
	//   24   52:new             #2   <Class MapsDataState>
	//   25   55:dup             
	//   26   56:ldc1            #59  <String "MissionHistoryDetails">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #47  <Method void MapsDataState(String, int)>
	//   29   62:putstatic       #61  <Field MapsDataState MissionHistoryDetails>
		WifiBadRegions = new MapsDataState("WifiBadRegions", 5);
	//   30   65:new             #2   <Class MapsDataState>
	//   31   68:dup             
	//   32   69:ldc1            #62  <String "WifiBadRegions">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #47  <Method void MapsDataState(String, int)>
	//   35   75:putstatic       #64  <Field MapsDataState WifiBadRegions>
		WifiColorLegend = new MapsDataState("WifiColorLegend", 6);
	//   36   78:new             #2   <Class MapsDataState>
	//   37   81:dup             
	//   38   82:ldc1            #65  <String "WifiColorLegend">
	//   39   84:bipush          6
	//   40   86:invokespecial   #47  <Method void MapsDataState(String, int)>
	//   41   89:putstatic       #67  <Field MapsDataState WifiColorLegend>
		PlaybackProgress = new MapsDataState("PlaybackProgress", 7);
	//   42   92:new             #2   <Class MapsDataState>
	//   43   95:dup             
	//   44   96:ldc1            #68  <String "PlaybackProgress">
	//   45   98:bipush          7
	//   46  100:invokespecial   #47  <Method void MapsDataState(String, int)>
	//   47  103:putstatic       #70  <Field MapsDataState PlaybackProgress>
		MissionMapZoomState = new MapsDataState("MissionMapZoomState", 8);
	//   48  106:new             #2   <Class MapsDataState>
	//   49  109:dup             
	//   50  110:ldc1            #71  <String "MissionMapZoomState">
	//   51  112:bipush          8
	//   52  114:invokespecial   #47  <Method void MapsDataState(String, int)>
	//   53  117:putstatic       #73  <Field MapsDataState MissionMapZoomState>
		MissionMapType = new MapsDataState("MissionMapType", 9);
	//   54  120:new             #2   <Class MapsDataState>
	//   55  123:dup             
	//   56  124:ldc1            #74  <String "MissionMapType">
	//   57  126:bipush          9
	//   58  128:invokespecial   #47  <Method void MapsDataState(String, int)>
	//   59  131:putstatic       #76  <Field MapsDataState MissionMapType>
		DirtDetectsHidden = new MapsDataState("DirtDetectsHidden", 10);
	//   60  134:new             #2   <Class MapsDataState>
	//   61  137:dup             
	//   62  138:ldc1            #77  <String "DirtDetectsHidden">
	//   63  140:bipush          10
	//   64  142:invokespecial   #47  <Method void MapsDataState(String, int)>
	//   65  145:putstatic       #79  <Field MapsDataState DirtDetectsHidden>
		FloorPlanSelectionListItem = new MapsDataState("FloorPlanSelectionListItem", 11);
	//   66  148:new             #2   <Class MapsDataState>
	//   67  151:dup             
	//   68  152:ldc1            #80  <String "FloorPlanSelectionListItem">
	//   69  154:bipush          11
	//   70  156:invokespecial   #47  <Method void MapsDataState(String, int)>
	//   71  159:putstatic       #82  <Field MapsDataState FloorPlanSelectionListItem>
		ToggleRegionSelectionId = new MapsDataState("ToggleRegionSelectionId", 12);
	//   72  162:new             #2   <Class MapsDataState>
	//   73  165:dup             
	//   74  166:ldc1            #83  <String "ToggleRegionSelectionId">
	//   75  168:bipush          12
	//   76  170:invokespecial   #47  <Method void MapsDataState(String, int)>
	//   77  173:putstatic       #85  <Field MapsDataState ToggleRegionSelectionId>
		RunActionCommandType = new MapsDataState("RunActionCommandType", 13);
	//   78  176:new             #2   <Class MapsDataState>
	//   79  179:dup             
	//   80  180:ldc1            #86  <String "RunActionCommandType">
	//   81  182:bipush          13
	//   82  184:invokespecial   #47  <Method void MapsDataState(String, int)>
	//   83  187:putstatic       #88  <Field MapsDataState RunActionCommandType>
		RunActionMapId = new MapsDataState("RunActionMapId", 14);
	//   84  190:new             #2   <Class MapsDataState>
	//   85  193:dup             
	//   86  194:ldc1            #89  <String "RunActionMapId">
	//   87  196:bipush          14
	//   88  198:invokespecial   #47  <Method void MapsDataState(String, int)>
	//   89  201:putstatic       #91  <Field MapsDataState RunActionMapId>
		FloorPlanListItemModes = new MapsDataState("FloorPlanListItemModes", 15);
	//   90  204:new             #2   <Class MapsDataState>
	//   91  207:dup             
	//   92  208:ldc1            #92  <String "FloorPlanListItemModes">
	//   93  210:bipush          15
	//   94  212:invokespecial   #47  <Method void MapsDataState(String, int)>
	//   95  215:putstatic       #94  <Field MapsDataState FloorPlanListItemModes>
		FloorPlanListMapId = new MapsDataState("FloorPlanListMapId", 16);
	//   96  218:new             #2   <Class MapsDataState>
	//   97  221:dup             
	//   98  222:ldc1            #95  <String "FloorPlanListMapId">
	//   99  224:bipush          16
	//  100  226:invokespecial   #47  <Method void MapsDataState(String, int)>
	//  101  229:putstatic       #97  <Field MapsDataState FloorPlanListMapId>
		FloorPlanListMapVersionId = new MapsDataState("FloorPlanListMapVersionId", 17);
	//  102  232:new             #2   <Class MapsDataState>
	//  103  235:dup             
	//  104  236:ldc1            #98  <String "FloorPlanListMapVersionId">
	//  105  238:bipush          17
	//  106  240:invokespecial   #47  <Method void MapsDataState(String, int)>
	//  107  243:putstatic       #100 <Field MapsDataState FloorPlanListMapVersionId>
		ActiveFloorMapId = new MapsDataState("ActiveFloorMapId", 18);
	//  108  246:new             #2   <Class MapsDataState>
	//  109  249:dup             
	//  110  250:ldc1            #101 <String "ActiveFloorMapId">
	//  111  252:bipush          18
	//  112  254:invokespecial   #47  <Method void MapsDataState(String, int)>
	//  113  257:putstatic       #103 <Field MapsDataState ActiveFloorMapId>
		ActiveFloorRegionIds = new MapsDataState("ActiveFloorRegionIds", 19);
	//  114  260:new             #2   <Class MapsDataState>
	//  115  263:dup             
	//  116  264:ldc1            #104 <String "ActiveFloorRegionIds">
	//  117  266:bipush          19
	//  118  268:invokespecial   #47  <Method void MapsDataState(String, int)>
	//  119  271:putstatic       #106 <Field MapsDataState ActiveFloorRegionIds>
		HighestLearningPercentage = new MapsDataState("HighestLearningPercentage", 20);
	//  120  274:new             #2   <Class MapsDataState>
	//  121  277:dup             
	//  122  278:ldc1            #107 <String "HighestLearningPercentage">
	//  123  280:bipush          20
	//  124  282:invokespecial   #47  <Method void MapsDataState(String, int)>
	//  125  285:putstatic       #109 <Field MapsDataState HighestLearningPercentage>
		MapCompleted = new MapsDataState("MapCompleted", 21);
	//  126  288:new             #2   <Class MapsDataState>
	//  127  291:dup             
	//  128  292:ldc1            #110 <String "MapCompleted">
	//  129  294:bipush          21
	//  130  296:invokespecial   #47  <Method void MapsDataState(String, int)>
	//  131  299:putstatic       #112 <Field MapsDataState MapCompleted>
		MapReadyForSetUp = new MapsDataState("MapReadyForSetUp", 22);
	//  132  302:new             #2   <Class MapsDataState>
	//  133  305:dup             
	//  134  306:ldc1            #113 <String "MapReadyForSetUp">
	//  135  308:bipush          22
	//  136  310:invokespecial   #47  <Method void MapsDataState(String, int)>
	//  137  313:putstatic       #115 <Field MapsDataState MapReadyForSetUp>
		RegionTypeChange = new MapsDataState("RegionTypeChange", 23);
	//  138  316:new             #2   <Class MapsDataState>
	//  139  319:dup             
	//  140  320:ldc1            #116 <String "RegionTypeChange">
	//  141  322:bipush          23
	//  142  324:invokespecial   #47  <Method void MapsDataState(String, int)>
	//  143  327:putstatic       #118 <Field MapsDataState RegionTypeChange>
		RenameRegion = new MapsDataState("RenameRegion", 24);
	//  144  330:new             #2   <Class MapsDataState>
	//  145  333:dup             
	//  146  334:ldc1            #119 <String "RenameRegion">
	//  147  336:bipush          24
	//  148  338:invokespecial   #47  <Method void MapsDataState(String, int)>
	//  149  341:putstatic       #121 <Field MapsDataState RenameRegion>
		NewMapName = new MapsDataState("NewMapName", 25);
	//  150  344:new             #2   <Class MapsDataState>
	//  151  347:dup             
	//  152  348:ldc1            #122 <String "NewMapName">
	//  153  350:bipush          25
	//  154  352:invokespecial   #47  <Method void MapsDataState(String, int)>
	//  155  355:putstatic       #124 <Field MapsDataState NewMapName>
		SetPlatformViewDimensions = new MapsDataState("SetPlatformViewDimensions", 26);
	//  156  358:new             #2   <Class MapsDataState>
	//  157  361:dup             
	//  158  362:ldc1            #125 <String "SetPlatformViewDimensions">
	//  159  364:bipush          26
	//  160  366:invokespecial   #47  <Method void MapsDataState(String, int)>
	//  161  369:putstatic       #127 <Field MapsDataState SetPlatformViewDimensions>
		RegionNamePlaceHolder = new MapsDataState("RegionNamePlaceHolder", 27);
	//  162  372:new             #2   <Class MapsDataState>
	//  163  375:dup             
	//  164  376:ldc1            #128 <String "RegionNamePlaceHolder">
	//  165  378:bipush          27
	//  166  380:invokespecial   #47  <Method void MapsDataState(String, int)>
	//  167  383:putstatic       #130 <Field MapsDataState RegionNamePlaceHolder>
		SelectedRegionNamePlaceHolder = new MapsDataState("SelectedRegionNamePlaceHolder", 28);
	//  168  386:new             #2   <Class MapsDataState>
	//  169  389:dup             
	//  170  390:ldc1            #131 <String "SelectedRegionNamePlaceHolder">
	//  171  392:bipush          28
	//  172  394:invokespecial   #47  <Method void MapsDataState(String, int)>
	//  173  397:putstatic       #133 <Field MapsDataState SelectedRegionNamePlaceHolder>
		ErrorDismissed = new MapsDataState("ErrorDismissed", 29);
	//  174  400:new             #2   <Class MapsDataState>
	//  175  403:dup             
	//  176  404:ldc1            #134 <String "ErrorDismissed">
	//  177  406:bipush          29
	//  178  408:invokespecial   #47  <Method void MapsDataState(String, int)>
	//  179  411:putstatic       #136 <Field MapsDataState ErrorDismissed>
		SetCustomizationMapId = new MapsDataState("SetCustomizationMapId", 30);
	//  180  414:new             #2   <Class MapsDataState>
	//  181  417:dup             
	//  182  418:ldc1            #137 <String "SetCustomizationMapId">
	//  183  420:bipush          30
	//  184  422:invokespecial   #47  <Method void MapsDataState(String, int)>
	//  185  425:putstatic       #139 <Field MapsDataState SetCustomizationMapId>
		Invalid = new MapsDataState("Invalid", 31);
	//  186  428:new             #2   <Class MapsDataState>
	//  187  431:dup             
	//  188  432:ldc1            #140 <String "Invalid">
	//  189  434:bipush          31
	//  190  436:invokespecial   #47  <Method void MapsDataState(String, int)>
	//  191  439:putstatic       #142 <Field MapsDataState Invalid>
		$VALUES = (new MapsDataState[] {
			MissionDetailsViewState, MapCustomizationInfo, ErrorMessage, RuntimeChart, MissionHistoryDetails, WifiBadRegions, WifiColorLegend, PlaybackProgress, MissionMapZoomState, MissionMapType, 
			DirtDetectsHidden, FloorPlanSelectionListItem, ToggleRegionSelectionId, RunActionCommandType, RunActionMapId, FloorPlanListItemModes, FloorPlanListMapId, FloorPlanListMapVersionId, ActiveFloorMapId, ActiveFloorRegionIds, 
			HighestLearningPercentage, MapCompleted, MapReadyForSetUp, RegionTypeChange, RenameRegion, NewMapName, SetPlatformViewDimensions, RegionNamePlaceHolder, SelectedRegionNamePlaceHolder, ErrorDismissed, 
			SetCustomizationMapId, Invalid
		});
	//  192  442:bipush          32
	//  193  444:anewarray       MapsDataState[]
	//  194  447:dup             
	//  195  448:iconst_0        
	//  196  449:getstatic       #49  <Field MapsDataState MissionDetailsViewState>
	//  197  452:aastore         
	//  198  453:dup             
	//  199  454:iconst_1        
	//  200  455:getstatic       #52  <Field MapsDataState MapCustomizationInfo>
	//  201  458:aastore         
	//  202  459:dup             
	//  203  460:iconst_2        
	//  204  461:getstatic       #55  <Field MapsDataState ErrorMessage>
	//  205  464:aastore         
	//  206  465:dup             
	//  207  466:iconst_3        
	//  208  467:getstatic       #58  <Field MapsDataState RuntimeChart>
	//  209  470:aastore         
	//  210  471:dup             
	//  211  472:iconst_4        
	//  212  473:getstatic       #61  <Field MapsDataState MissionHistoryDetails>
	//  213  476:aastore         
	//  214  477:dup             
	//  215  478:iconst_5        
	//  216  479:getstatic       #64  <Field MapsDataState WifiBadRegions>
	//  217  482:aastore         
	//  218  483:dup             
	//  219  484:bipush          6
	//  220  486:getstatic       #67  <Field MapsDataState WifiColorLegend>
	//  221  489:aastore         
	//  222  490:dup             
	//  223  491:bipush          7
	//  224  493:getstatic       #70  <Field MapsDataState PlaybackProgress>
	//  225  496:aastore         
	//  226  497:dup             
	//  227  498:bipush          8
	//  228  500:getstatic       #73  <Field MapsDataState MissionMapZoomState>
	//  229  503:aastore         
	//  230  504:dup             
	//  231  505:bipush          9
	//  232  507:getstatic       #76  <Field MapsDataState MissionMapType>
	//  233  510:aastore         
	//  234  511:dup             
	//  235  512:bipush          10
	//  236  514:getstatic       #79  <Field MapsDataState DirtDetectsHidden>
	//  237  517:aastore         
	//  238  518:dup             
	//  239  519:bipush          11
	//  240  521:getstatic       #82  <Field MapsDataState FloorPlanSelectionListItem>
	//  241  524:aastore         
	//  242  525:dup             
	//  243  526:bipush          12
	//  244  528:getstatic       #85  <Field MapsDataState ToggleRegionSelectionId>
	//  245  531:aastore         
	//  246  532:dup             
	//  247  533:bipush          13
	//  248  535:getstatic       #88  <Field MapsDataState RunActionCommandType>
	//  249  538:aastore         
	//  250  539:dup             
	//  251  540:bipush          14
	//  252  542:getstatic       #91  <Field MapsDataState RunActionMapId>
	//  253  545:aastore         
	//  254  546:dup             
	//  255  547:bipush          15
	//  256  549:getstatic       #94  <Field MapsDataState FloorPlanListItemModes>
	//  257  552:aastore         
	//  258  553:dup             
	//  259  554:bipush          16
	//  260  556:getstatic       #97  <Field MapsDataState FloorPlanListMapId>
	//  261  559:aastore         
	//  262  560:dup             
	//  263  561:bipush          17
	//  264  563:getstatic       #100 <Field MapsDataState FloorPlanListMapVersionId>
	//  265  566:aastore         
	//  266  567:dup             
	//  267  568:bipush          18
	//  268  570:getstatic       #103 <Field MapsDataState ActiveFloorMapId>
	//  269  573:aastore         
	//  270  574:dup             
	//  271  575:bipush          19
	//  272  577:getstatic       #106 <Field MapsDataState ActiveFloorRegionIds>
	//  273  580:aastore         
	//  274  581:dup             
	//  275  582:bipush          20
	//  276  584:getstatic       #109 <Field MapsDataState HighestLearningPercentage>
	//  277  587:aastore         
	//  278  588:dup             
	//  279  589:bipush          21
	//  280  591:getstatic       #112 <Field MapsDataState MapCompleted>
	//  281  594:aastore         
	//  282  595:dup             
	//  283  596:bipush          22
	//  284  598:getstatic       #115 <Field MapsDataState MapReadyForSetUp>
	//  285  601:aastore         
	//  286  602:dup             
	//  287  603:bipush          23
	//  288  605:getstatic       #118 <Field MapsDataState RegionTypeChange>
	//  289  608:aastore         
	//  290  609:dup             
	//  291  610:bipush          24
	//  292  612:getstatic       #121 <Field MapsDataState RenameRegion>
	//  293  615:aastore         
	//  294  616:dup             
	//  295  617:bipush          25
	//  296  619:getstatic       #124 <Field MapsDataState NewMapName>
	//  297  622:aastore         
	//  298  623:dup             
	//  299  624:bipush          26
	//  300  626:getstatic       #127 <Field MapsDataState SetPlatformViewDimensions>
	//  301  629:aastore         
	//  302  630:dup             
	//  303  631:bipush          27
	//  304  633:getstatic       #130 <Field MapsDataState RegionNamePlaceHolder>
	//  305  636:aastore         
	//  306  637:dup             
	//  307  638:bipush          28
	//  308  640:getstatic       #133 <Field MapsDataState SelectedRegionNamePlaceHolder>
	//  309  643:aastore         
	//  310  644:dup             
	//  311  645:bipush          29
	//  312  647:getstatic       #136 <Field MapsDataState ErrorDismissed>
	//  313  650:aastore         
	//  314  651:dup             
	//  315  652:bipush          30
	//  316  654:getstatic       #139 <Field MapsDataState SetCustomizationMapId>
	//  317  657:aastore         
	//  318  658:dup             
	//  319  659:bipush          31
	//  320  661:getstatic       #142 <Field MapsDataState Invalid>
	//  321  664:aastore         
	//  322  665:putstatic       #144 <Field MapsDataState[] $VALUES>
	//* 323  668:return          
	}
}
