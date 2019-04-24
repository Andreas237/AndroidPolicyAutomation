// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class MapsUIServiceCommand extends Enum
{

	private MapsUIServiceCommand(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #194 <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static MapsUIServiceCommand valueOf(String s)
	{
		return (MapsUIServiceCommand)Enum.valueOf(com/irobot/core/MapsUIServiceCommand, s);
	//    0    0:ldc1            #2   <Class MapsUIServiceCommand>
	//    1    2:aload_0         
	//    2    3:invokestatic    #200 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MapsUIServiceCommand>
	//    4    9:areturn         
	}

	public static MapsUIServiceCommand[] values()
	{
		return (MapsUIServiceCommand[])((MapsUIServiceCommand []) ($VALUES)).clone();
	//    0    0:getstatic       #192 <Field MapsUIServiceCommand[] $VALUES>
	//    1    3:invokevirtual   #207 <Method Object _5B_Lcom.irobot.core.MapsUIServiceCommand_3B_.clone()>
	//    2    6:checkcast       #203 <Class MapsUIServiceCommand[]>
	//    3    9:areturn         
	}

	private static final MapsUIServiceCommand $VALUES[];
	public static final MapsUIServiceCommand AddDoor;
	public static final MapsUIServiceCommand AddKeepOutZone;
	public static final MapsUIServiceCommand ArchiveMap;
	public static final MapsUIServiceCommand CancelCustomization;
	public static final MapsUIServiceCommand CustomizationOptions;
	public static final MapsUIServiceCommand DeleteFloorPlanListItem;
	public static final MapsUIServiceCommand DeleteMap;
	public static final MapsUIServiceCommand DoneCustomization;
	public static final MapsUIServiceCommand EditCustomization;
	public static final MapsUIServiceCommand ErrorDismissed;
	public static final MapsUIServiceCommand GetBasicRegionTypeTable;
	public static final MapsUIServiceCommand GetCustomRegionTypeItem;
	public static final MapsUIServiceCommand GetListOfRegionNames;
	public static final MapsUIServiceCommand GetRegionTypeTable;
	public static final MapsUIServiceCommand HandleFloorSelection;
	public static final MapsUIServiceCommand NewMapName;
	public static final MapsUIServiceCommand PausePlayback;
	public static final MapsUIServiceCommand PerformNavigation;
	public static final MapsUIServiceCommand PlaceDoor;
	public static final MapsUIServiceCommand PlaceKeepOutZone;
	public static final MapsUIServiceCommand QueryFloorPlanListItem;
	public static final MapsUIServiceCommand RegionNamePlaceHolder;
	public static final MapsUIServiceCommand RegionTypeChange;
	public static final MapsUIServiceCommand RemoveDoor;
	public static final MapsUIServiceCommand RemoveKeepOutZone;
	public static final MapsUIServiceCommand RenameMap;
	public static final MapsUIServiceCommand RenameRegion;
	public static final MapsUIServiceCommand ResetCustomization;
	public static final MapsUIServiceCommand ResetMap;
	public static final MapsUIServiceCommand RotateMap;
	public static final MapsUIServiceCommand SaveCustomization;
	public static final MapsUIServiceCommand SeekPlayback;
	public static final MapsUIServiceCommand SelectedRegionNamePlaceHolder;
	public static final MapsUIServiceCommand SetActiveFloorAndRegions;
	public static final MapsUIServiceCommand SetCurrentMapType;
	public static final MapsUIServiceCommand SetDirtDetectsHidden;
	public static final MapsUIServiceCommand SetFloorListItemModes;
	public static final MapsUIServiceCommand SetPersistentMapId;
	public static final MapsUIServiceCommand SetPlatformViewDimensions;
	public static final MapsUIServiceCommand StartCustomization;
	public static final MapsUIServiceCommand StartMissionAction;
	public static final MapsUIServiceCommand StartOneMoreRunAction;
	public static final MapsUIServiceCommand StartPlayback;
	public static final MapsUIServiceCommand ToggleRegionSelectionId;

	static 
	{
		StartPlayback = new MapsUIServiceCommand("StartPlayback", 0);
	//    0    0:new             #2   <Class MapsUIServiceCommand>
	//    1    3:dup             
	//    2    4:ldc1            #55  <String "StartPlayback">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//    5   10:putstatic       #61  <Field MapsUIServiceCommand StartPlayback>
		PausePlayback = new MapsUIServiceCommand("PausePlayback", 1);
	//    6   13:new             #2   <Class MapsUIServiceCommand>
	//    7   16:dup             
	//    8   17:ldc1            #62  <String "PausePlayback">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//   11   23:putstatic       #64  <Field MapsUIServiceCommand PausePlayback>
		SeekPlayback = new MapsUIServiceCommand("SeekPlayback", 2);
	//   12   26:new             #2   <Class MapsUIServiceCommand>
	//   13   29:dup             
	//   14   30:ldc1            #65  <String "SeekPlayback">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//   17   36:putstatic       #67  <Field MapsUIServiceCommand SeekPlayback>
		ResetMap = new MapsUIServiceCommand("ResetMap", 3);
	//   18   39:new             #2   <Class MapsUIServiceCommand>
	//   19   42:dup             
	//   20   43:ldc1            #68  <String "ResetMap">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//   23   49:putstatic       #70  <Field MapsUIServiceCommand ResetMap>
		SetCurrentMapType = new MapsUIServiceCommand("SetCurrentMapType", 4);
	//   24   52:new             #2   <Class MapsUIServiceCommand>
	//   25   55:dup             
	//   26   56:ldc1            #71  <String "SetCurrentMapType">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//   29   62:putstatic       #73  <Field MapsUIServiceCommand SetCurrentMapType>
		SetDirtDetectsHidden = new MapsUIServiceCommand("SetDirtDetectsHidden", 5);
	//   30   65:new             #2   <Class MapsUIServiceCommand>
	//   31   68:dup             
	//   32   69:ldc1            #74  <String "SetDirtDetectsHidden">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//   35   75:putstatic       #76  <Field MapsUIServiceCommand SetDirtDetectsHidden>
		PerformNavigation = new MapsUIServiceCommand("PerformNavigation", 6);
	//   36   78:new             #2   <Class MapsUIServiceCommand>
	//   37   81:dup             
	//   38   82:ldc1            #77  <String "PerformNavigation">
	//   39   84:bipush          6
	//   40   86:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//   41   89:putstatic       #79  <Field MapsUIServiceCommand PerformNavigation>
		HandleFloorSelection = new MapsUIServiceCommand("HandleFloorSelection", 7);
	//   42   92:new             #2   <Class MapsUIServiceCommand>
	//   43   95:dup             
	//   44   96:ldc1            #80  <String "HandleFloorSelection">
	//   45   98:bipush          7
	//   46  100:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//   47  103:putstatic       #82  <Field MapsUIServiceCommand HandleFloorSelection>
		ToggleRegionSelectionId = new MapsUIServiceCommand("ToggleRegionSelectionId", 8);
	//   48  106:new             #2   <Class MapsUIServiceCommand>
	//   49  109:dup             
	//   50  110:ldc1            #83  <String "ToggleRegionSelectionId">
	//   51  112:bipush          8
	//   52  114:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//   53  117:putstatic       #85  <Field MapsUIServiceCommand ToggleRegionSelectionId>
		StartMissionAction = new MapsUIServiceCommand("StartMissionAction", 9);
	//   54  120:new             #2   <Class MapsUIServiceCommand>
	//   55  123:dup             
	//   56  124:ldc1            #86  <String "StartMissionAction">
	//   57  126:bipush          9
	//   58  128:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//   59  131:putstatic       #88  <Field MapsUIServiceCommand StartMissionAction>
		StartOneMoreRunAction = new MapsUIServiceCommand("StartOneMoreRunAction", 10);
	//   60  134:new             #2   <Class MapsUIServiceCommand>
	//   61  137:dup             
	//   62  138:ldc1            #89  <String "StartOneMoreRunAction">
	//   63  140:bipush          10
	//   64  142:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//   65  145:putstatic       #91  <Field MapsUIServiceCommand StartOneMoreRunAction>
		QueryFloorPlanListItem = new MapsUIServiceCommand("QueryFloorPlanListItem", 11);
	//   66  148:new             #2   <Class MapsUIServiceCommand>
	//   67  151:dup             
	//   68  152:ldc1            #92  <String "QueryFloorPlanListItem">
	//   69  154:bipush          11
	//   70  156:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//   71  159:putstatic       #94  <Field MapsUIServiceCommand QueryFloorPlanListItem>
		DeleteFloorPlanListItem = new MapsUIServiceCommand("DeleteFloorPlanListItem", 12);
	//   72  162:new             #2   <Class MapsUIServiceCommand>
	//   73  165:dup             
	//   74  166:ldc1            #95  <String "DeleteFloorPlanListItem">
	//   75  168:bipush          12
	//   76  170:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//   77  173:putstatic       #97  <Field MapsUIServiceCommand DeleteFloorPlanListItem>
		SetActiveFloorAndRegions = new MapsUIServiceCommand("SetActiveFloorAndRegions", 13);
	//   78  176:new             #2   <Class MapsUIServiceCommand>
	//   79  179:dup             
	//   80  180:ldc1            #98  <String "SetActiveFloorAndRegions">
	//   81  182:bipush          13
	//   82  184:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//   83  187:putstatic       #100 <Field MapsUIServiceCommand SetActiveFloorAndRegions>
		SetFloorListItemModes = new MapsUIServiceCommand("SetFloorListItemModes", 14);
	//   84  190:new             #2   <Class MapsUIServiceCommand>
	//   85  193:dup             
	//   86  194:ldc1            #101 <String "SetFloorListItemModes">
	//   87  196:bipush          14
	//   88  198:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//   89  201:putstatic       #103 <Field MapsUIServiceCommand SetFloorListItemModes>
		StartCustomization = new MapsUIServiceCommand("StartCustomization", 15);
	//   90  204:new             #2   <Class MapsUIServiceCommand>
	//   91  207:dup             
	//   92  208:ldc1            #104 <String "StartCustomization">
	//   93  210:bipush          15
	//   94  212:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//   95  215:putstatic       #106 <Field MapsUIServiceCommand StartCustomization>
		CustomizationOptions = new MapsUIServiceCommand("CustomizationOptions", 16);
	//   96  218:new             #2   <Class MapsUIServiceCommand>
	//   97  221:dup             
	//   98  222:ldc1            #107 <String "CustomizationOptions">
	//   99  224:bipush          16
	//  100  226:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  101  229:putstatic       #109 <Field MapsUIServiceCommand CustomizationOptions>
		ResetCustomization = new MapsUIServiceCommand("ResetCustomization", 17);
	//  102  232:new             #2   <Class MapsUIServiceCommand>
	//  103  235:dup             
	//  104  236:ldc1            #110 <String "ResetCustomization">
	//  105  238:bipush          17
	//  106  240:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  107  243:putstatic       #112 <Field MapsUIServiceCommand ResetCustomization>
		DeleteMap = new MapsUIServiceCommand("DeleteMap", 18);
	//  108  246:new             #2   <Class MapsUIServiceCommand>
	//  109  249:dup             
	//  110  250:ldc1            #113 <String "DeleteMap">
	//  111  252:bipush          18
	//  112  254:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  113  257:putstatic       #115 <Field MapsUIServiceCommand DeleteMap>
		ArchiveMap = new MapsUIServiceCommand("ArchiveMap", 19);
	//  114  260:new             #2   <Class MapsUIServiceCommand>
	//  115  263:dup             
	//  116  264:ldc1            #116 <String "ArchiveMap">
	//  117  266:bipush          19
	//  118  268:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  119  271:putstatic       #118 <Field MapsUIServiceCommand ArchiveMap>
		AddDoor = new MapsUIServiceCommand("AddDoor", 20);
	//  120  274:new             #2   <Class MapsUIServiceCommand>
	//  121  277:dup             
	//  122  278:ldc1            #119 <String "AddDoor">
	//  123  280:bipush          20
	//  124  282:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  125  285:putstatic       #121 <Field MapsUIServiceCommand AddDoor>
		PlaceDoor = new MapsUIServiceCommand("PlaceDoor", 21);
	//  126  288:new             #2   <Class MapsUIServiceCommand>
	//  127  291:dup             
	//  128  292:ldc1            #122 <String "PlaceDoor">
	//  129  294:bipush          21
	//  130  296:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  131  299:putstatic       #124 <Field MapsUIServiceCommand PlaceDoor>
		RemoveDoor = new MapsUIServiceCommand("RemoveDoor", 22);
	//  132  302:new             #2   <Class MapsUIServiceCommand>
	//  133  305:dup             
	//  134  306:ldc1            #125 <String "RemoveDoor">
	//  135  308:bipush          22
	//  136  310:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  137  313:putstatic       #127 <Field MapsUIServiceCommand RemoveDoor>
		PlaceKeepOutZone = new MapsUIServiceCommand("PlaceKeepOutZone", 23);
	//  138  316:new             #2   <Class MapsUIServiceCommand>
	//  139  319:dup             
	//  140  320:ldc1            #128 <String "PlaceKeepOutZone">
	//  141  322:bipush          23
	//  142  324:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  143  327:putstatic       #130 <Field MapsUIServiceCommand PlaceKeepOutZone>
		AddKeepOutZone = new MapsUIServiceCommand("AddKeepOutZone", 24);
	//  144  330:new             #2   <Class MapsUIServiceCommand>
	//  145  333:dup             
	//  146  334:ldc1            #131 <String "AddKeepOutZone">
	//  147  336:bipush          24
	//  148  338:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  149  341:putstatic       #133 <Field MapsUIServiceCommand AddKeepOutZone>
		RemoveKeepOutZone = new MapsUIServiceCommand("RemoveKeepOutZone", 25);
	//  150  344:new             #2   <Class MapsUIServiceCommand>
	//  151  347:dup             
	//  152  348:ldc1            #134 <String "RemoveKeepOutZone">
	//  153  350:bipush          25
	//  154  352:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  155  355:putstatic       #136 <Field MapsUIServiceCommand RemoveKeepOutZone>
		RotateMap = new MapsUIServiceCommand("RotateMap", 26);
	//  156  358:new             #2   <Class MapsUIServiceCommand>
	//  157  361:dup             
	//  158  362:ldc1            #137 <String "RotateMap">
	//  159  364:bipush          26
	//  160  366:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  161  369:putstatic       #139 <Field MapsUIServiceCommand RotateMap>
		SaveCustomization = new MapsUIServiceCommand("SaveCustomization", 27);
	//  162  372:new             #2   <Class MapsUIServiceCommand>
	//  163  375:dup             
	//  164  376:ldc1            #140 <String "SaveCustomization">
	//  165  378:bipush          27
	//  166  380:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  167  383:putstatic       #142 <Field MapsUIServiceCommand SaveCustomization>
		DoneCustomization = new MapsUIServiceCommand("DoneCustomization", 28);
	//  168  386:new             #2   <Class MapsUIServiceCommand>
	//  169  389:dup             
	//  170  390:ldc1            #143 <String "DoneCustomization">
	//  171  392:bipush          28
	//  172  394:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  173  397:putstatic       #145 <Field MapsUIServiceCommand DoneCustomization>
		EditCustomization = new MapsUIServiceCommand("EditCustomization", 29);
	//  174  400:new             #2   <Class MapsUIServiceCommand>
	//  175  403:dup             
	//  176  404:ldc1            #146 <String "EditCustomization">
	//  177  406:bipush          29
	//  178  408:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  179  411:putstatic       #148 <Field MapsUIServiceCommand EditCustomization>
		RenameMap = new MapsUIServiceCommand("RenameMap", 30);
	//  180  414:new             #2   <Class MapsUIServiceCommand>
	//  181  417:dup             
	//  182  418:ldc1            #149 <String "RenameMap">
	//  183  420:bipush          30
	//  184  422:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  185  425:putstatic       #151 <Field MapsUIServiceCommand RenameMap>
		RegionTypeChange = new MapsUIServiceCommand("RegionTypeChange", 31);
	//  186  428:new             #2   <Class MapsUIServiceCommand>
	//  187  431:dup             
	//  188  432:ldc1            #152 <String "RegionTypeChange">
	//  189  434:bipush          31
	//  190  436:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  191  439:putstatic       #154 <Field MapsUIServiceCommand RegionTypeChange>
		RenameRegion = new MapsUIServiceCommand("RenameRegion", 32);
	//  192  442:new             #2   <Class MapsUIServiceCommand>
	//  193  445:dup             
	//  194  446:ldc1            #155 <String "RenameRegion">
	//  195  448:bipush          32
	//  196  450:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  197  453:putstatic       #157 <Field MapsUIServiceCommand RenameRegion>
		NewMapName = new MapsUIServiceCommand("NewMapName", 33);
	//  198  456:new             #2   <Class MapsUIServiceCommand>
	//  199  459:dup             
	//  200  460:ldc1            #158 <String "NewMapName">
	//  201  462:bipush          33
	//  202  464:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  203  467:putstatic       #160 <Field MapsUIServiceCommand NewMapName>
		SetPlatformViewDimensions = new MapsUIServiceCommand("SetPlatformViewDimensions", 34);
	//  204  470:new             #2   <Class MapsUIServiceCommand>
	//  205  473:dup             
	//  206  474:ldc1            #161 <String "SetPlatformViewDimensions">
	//  207  476:bipush          34
	//  208  478:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  209  481:putstatic       #163 <Field MapsUIServiceCommand SetPlatformViewDimensions>
		RegionNamePlaceHolder = new MapsUIServiceCommand("RegionNamePlaceHolder", 35);
	//  210  484:new             #2   <Class MapsUIServiceCommand>
	//  211  487:dup             
	//  212  488:ldc1            #164 <String "RegionNamePlaceHolder">
	//  213  490:bipush          35
	//  214  492:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  215  495:putstatic       #166 <Field MapsUIServiceCommand RegionNamePlaceHolder>
		SelectedRegionNamePlaceHolder = new MapsUIServiceCommand("SelectedRegionNamePlaceHolder", 36);
	//  216  498:new             #2   <Class MapsUIServiceCommand>
	//  217  501:dup             
	//  218  502:ldc1            #167 <String "SelectedRegionNamePlaceHolder">
	//  219  504:bipush          36
	//  220  506:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  221  509:putstatic       #169 <Field MapsUIServiceCommand SelectedRegionNamePlaceHolder>
		ErrorDismissed = new MapsUIServiceCommand("ErrorDismissed", 37);
	//  222  512:new             #2   <Class MapsUIServiceCommand>
	//  223  515:dup             
	//  224  516:ldc1            #170 <String "ErrorDismissed">
	//  225  518:bipush          37
	//  226  520:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  227  523:putstatic       #172 <Field MapsUIServiceCommand ErrorDismissed>
		CancelCustomization = new MapsUIServiceCommand("CancelCustomization", 38);
	//  228  526:new             #2   <Class MapsUIServiceCommand>
	//  229  529:dup             
	//  230  530:ldc1            #173 <String "CancelCustomization">
	//  231  532:bipush          38
	//  232  534:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  233  537:putstatic       #175 <Field MapsUIServiceCommand CancelCustomization>
		SetPersistentMapId = new MapsUIServiceCommand("SetPersistentMapId", 39);
	//  234  540:new             #2   <Class MapsUIServiceCommand>
	//  235  543:dup             
	//  236  544:ldc1            #176 <String "SetPersistentMapId">
	//  237  546:bipush          39
	//  238  548:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  239  551:putstatic       #178 <Field MapsUIServiceCommand SetPersistentMapId>
		GetRegionTypeTable = new MapsUIServiceCommand("GetRegionTypeTable", 40);
	//  240  554:new             #2   <Class MapsUIServiceCommand>
	//  241  557:dup             
	//  242  558:ldc1            #179 <String "GetRegionTypeTable">
	//  243  560:bipush          40
	//  244  562:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  245  565:putstatic       #181 <Field MapsUIServiceCommand GetRegionTypeTable>
		GetBasicRegionTypeTable = new MapsUIServiceCommand("GetBasicRegionTypeTable", 41);
	//  246  568:new             #2   <Class MapsUIServiceCommand>
	//  247  571:dup             
	//  248  572:ldc1            #182 <String "GetBasicRegionTypeTable">
	//  249  574:bipush          41
	//  250  576:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  251  579:putstatic       #184 <Field MapsUIServiceCommand GetBasicRegionTypeTable>
		GetCustomRegionTypeItem = new MapsUIServiceCommand("GetCustomRegionTypeItem", 42);
	//  252  582:new             #2   <Class MapsUIServiceCommand>
	//  253  585:dup             
	//  254  586:ldc1            #185 <String "GetCustomRegionTypeItem">
	//  255  588:bipush          42
	//  256  590:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  257  593:putstatic       #187 <Field MapsUIServiceCommand GetCustomRegionTypeItem>
		GetListOfRegionNames = new MapsUIServiceCommand("GetListOfRegionNames", 43);
	//  258  596:new             #2   <Class MapsUIServiceCommand>
	//  259  599:dup             
	//  260  600:ldc1            #188 <String "GetListOfRegionNames">
	//  261  602:bipush          43
	//  262  604:invokespecial   #59  <Method void MapsUIServiceCommand(String, int)>
	//  263  607:putstatic       #190 <Field MapsUIServiceCommand GetListOfRegionNames>
		$VALUES = (new MapsUIServiceCommand[] {
			StartPlayback, PausePlayback, SeekPlayback, ResetMap, SetCurrentMapType, SetDirtDetectsHidden, PerformNavigation, HandleFloorSelection, ToggleRegionSelectionId, StartMissionAction, 
			StartOneMoreRunAction, QueryFloorPlanListItem, DeleteFloorPlanListItem, SetActiveFloorAndRegions, SetFloorListItemModes, StartCustomization, CustomizationOptions, ResetCustomization, DeleteMap, ArchiveMap, 
			AddDoor, PlaceDoor, RemoveDoor, PlaceKeepOutZone, AddKeepOutZone, RemoveKeepOutZone, RotateMap, SaveCustomization, DoneCustomization, EditCustomization, 
			RenameMap, RegionTypeChange, RenameRegion, NewMapName, SetPlatformViewDimensions, RegionNamePlaceHolder, SelectedRegionNamePlaceHolder, ErrorDismissed, CancelCustomization, SetPersistentMapId, 
			GetRegionTypeTable, GetBasicRegionTypeTable, GetCustomRegionTypeItem, GetListOfRegionNames
		});
	//  264  610:bipush          44
	//  265  612:anewarray       MapsUIServiceCommand[]
	//  266  615:dup             
	//  267  616:iconst_0        
	//  268  617:getstatic       #61  <Field MapsUIServiceCommand StartPlayback>
	//  269  620:aastore         
	//  270  621:dup             
	//  271  622:iconst_1        
	//  272  623:getstatic       #64  <Field MapsUIServiceCommand PausePlayback>
	//  273  626:aastore         
	//  274  627:dup             
	//  275  628:iconst_2        
	//  276  629:getstatic       #67  <Field MapsUIServiceCommand SeekPlayback>
	//  277  632:aastore         
	//  278  633:dup             
	//  279  634:iconst_3        
	//  280  635:getstatic       #70  <Field MapsUIServiceCommand ResetMap>
	//  281  638:aastore         
	//  282  639:dup             
	//  283  640:iconst_4        
	//  284  641:getstatic       #73  <Field MapsUIServiceCommand SetCurrentMapType>
	//  285  644:aastore         
	//  286  645:dup             
	//  287  646:iconst_5        
	//  288  647:getstatic       #76  <Field MapsUIServiceCommand SetDirtDetectsHidden>
	//  289  650:aastore         
	//  290  651:dup             
	//  291  652:bipush          6
	//  292  654:getstatic       #79  <Field MapsUIServiceCommand PerformNavigation>
	//  293  657:aastore         
	//  294  658:dup             
	//  295  659:bipush          7
	//  296  661:getstatic       #82  <Field MapsUIServiceCommand HandleFloorSelection>
	//  297  664:aastore         
	//  298  665:dup             
	//  299  666:bipush          8
	//  300  668:getstatic       #85  <Field MapsUIServiceCommand ToggleRegionSelectionId>
	//  301  671:aastore         
	//  302  672:dup             
	//  303  673:bipush          9
	//  304  675:getstatic       #88  <Field MapsUIServiceCommand StartMissionAction>
	//  305  678:aastore         
	//  306  679:dup             
	//  307  680:bipush          10
	//  308  682:getstatic       #91  <Field MapsUIServiceCommand StartOneMoreRunAction>
	//  309  685:aastore         
	//  310  686:dup             
	//  311  687:bipush          11
	//  312  689:getstatic       #94  <Field MapsUIServiceCommand QueryFloorPlanListItem>
	//  313  692:aastore         
	//  314  693:dup             
	//  315  694:bipush          12
	//  316  696:getstatic       #97  <Field MapsUIServiceCommand DeleteFloorPlanListItem>
	//  317  699:aastore         
	//  318  700:dup             
	//  319  701:bipush          13
	//  320  703:getstatic       #100 <Field MapsUIServiceCommand SetActiveFloorAndRegions>
	//  321  706:aastore         
	//  322  707:dup             
	//  323  708:bipush          14
	//  324  710:getstatic       #103 <Field MapsUIServiceCommand SetFloorListItemModes>
	//  325  713:aastore         
	//  326  714:dup             
	//  327  715:bipush          15
	//  328  717:getstatic       #106 <Field MapsUIServiceCommand StartCustomization>
	//  329  720:aastore         
	//  330  721:dup             
	//  331  722:bipush          16
	//  332  724:getstatic       #109 <Field MapsUIServiceCommand CustomizationOptions>
	//  333  727:aastore         
	//  334  728:dup             
	//  335  729:bipush          17
	//  336  731:getstatic       #112 <Field MapsUIServiceCommand ResetCustomization>
	//  337  734:aastore         
	//  338  735:dup             
	//  339  736:bipush          18
	//  340  738:getstatic       #115 <Field MapsUIServiceCommand DeleteMap>
	//  341  741:aastore         
	//  342  742:dup             
	//  343  743:bipush          19
	//  344  745:getstatic       #118 <Field MapsUIServiceCommand ArchiveMap>
	//  345  748:aastore         
	//  346  749:dup             
	//  347  750:bipush          20
	//  348  752:getstatic       #121 <Field MapsUIServiceCommand AddDoor>
	//  349  755:aastore         
	//  350  756:dup             
	//  351  757:bipush          21
	//  352  759:getstatic       #124 <Field MapsUIServiceCommand PlaceDoor>
	//  353  762:aastore         
	//  354  763:dup             
	//  355  764:bipush          22
	//  356  766:getstatic       #127 <Field MapsUIServiceCommand RemoveDoor>
	//  357  769:aastore         
	//  358  770:dup             
	//  359  771:bipush          23
	//  360  773:getstatic       #130 <Field MapsUIServiceCommand PlaceKeepOutZone>
	//  361  776:aastore         
	//  362  777:dup             
	//  363  778:bipush          24
	//  364  780:getstatic       #133 <Field MapsUIServiceCommand AddKeepOutZone>
	//  365  783:aastore         
	//  366  784:dup             
	//  367  785:bipush          25
	//  368  787:getstatic       #136 <Field MapsUIServiceCommand RemoveKeepOutZone>
	//  369  790:aastore         
	//  370  791:dup             
	//  371  792:bipush          26
	//  372  794:getstatic       #139 <Field MapsUIServiceCommand RotateMap>
	//  373  797:aastore         
	//  374  798:dup             
	//  375  799:bipush          27
	//  376  801:getstatic       #142 <Field MapsUIServiceCommand SaveCustomization>
	//  377  804:aastore         
	//  378  805:dup             
	//  379  806:bipush          28
	//  380  808:getstatic       #145 <Field MapsUIServiceCommand DoneCustomization>
	//  381  811:aastore         
	//  382  812:dup             
	//  383  813:bipush          29
	//  384  815:getstatic       #148 <Field MapsUIServiceCommand EditCustomization>
	//  385  818:aastore         
	//  386  819:dup             
	//  387  820:bipush          30
	//  388  822:getstatic       #151 <Field MapsUIServiceCommand RenameMap>
	//  389  825:aastore         
	//  390  826:dup             
	//  391  827:bipush          31
	//  392  829:getstatic       #154 <Field MapsUIServiceCommand RegionTypeChange>
	//  393  832:aastore         
	//  394  833:dup             
	//  395  834:bipush          32
	//  396  836:getstatic       #157 <Field MapsUIServiceCommand RenameRegion>
	//  397  839:aastore         
	//  398  840:dup             
	//  399  841:bipush          33
	//  400  843:getstatic       #160 <Field MapsUIServiceCommand NewMapName>
	//  401  846:aastore         
	//  402  847:dup             
	//  403  848:bipush          34
	//  404  850:getstatic       #163 <Field MapsUIServiceCommand SetPlatformViewDimensions>
	//  405  853:aastore         
	//  406  854:dup             
	//  407  855:bipush          35
	//  408  857:getstatic       #166 <Field MapsUIServiceCommand RegionNamePlaceHolder>
	//  409  860:aastore         
	//  410  861:dup             
	//  411  862:bipush          36
	//  412  864:getstatic       #169 <Field MapsUIServiceCommand SelectedRegionNamePlaceHolder>
	//  413  867:aastore         
	//  414  868:dup             
	//  415  869:bipush          37
	//  416  871:getstatic       #172 <Field MapsUIServiceCommand ErrorDismissed>
	//  417  874:aastore         
	//  418  875:dup             
	//  419  876:bipush          38
	//  420  878:getstatic       #175 <Field MapsUIServiceCommand CancelCustomization>
	//  421  881:aastore         
	//  422  882:dup             
	//  423  883:bipush          39
	//  424  885:getstatic       #178 <Field MapsUIServiceCommand SetPersistentMapId>
	//  425  888:aastore         
	//  426  889:dup             
	//  427  890:bipush          40
	//  428  892:getstatic       #181 <Field MapsUIServiceCommand GetRegionTypeTable>
	//  429  895:aastore         
	//  430  896:dup             
	//  431  897:bipush          41
	//  432  899:getstatic       #184 <Field MapsUIServiceCommand GetBasicRegionTypeTable>
	//  433  902:aastore         
	//  434  903:dup             
	//  435  904:bipush          42
	//  436  906:getstatic       #187 <Field MapsUIServiceCommand GetCustomRegionTypeItem>
	//  437  909:aastore         
	//  438  910:dup             
	//  439  911:bipush          43
	//  440  913:getstatic       #190 <Field MapsUIServiceCommand GetListOfRegionNames>
	//  441  916:aastore         
	//  442  917:putstatic       #192 <Field MapsUIServiceCommand[] $VALUES>
	//* 443  920:return          
	}
}
