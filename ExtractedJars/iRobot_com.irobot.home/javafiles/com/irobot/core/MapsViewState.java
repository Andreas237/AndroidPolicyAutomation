// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class MapsViewState extends Enum
{

	private MapsViewState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #98  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static MapsViewState valueOf(String s)
	{
		return (MapsViewState)Enum.valueOf(com/irobot/core/MapsViewState, s);
	//    0    0:ldc1            #2   <Class MapsViewState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #104 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MapsViewState>
	//    4    9:areturn         
	}

	public static MapsViewState[] values()
	{
		return (MapsViewState[])((MapsViewState []) ($VALUES)).clone();
	//    0    0:getstatic       #96  <Field MapsViewState[] $VALUES>
	//    1    3:invokevirtual   #111 <Method Object _5B_Lcom.irobot.core.MapsViewState_3B_.clone()>
	//    2    6:checkcast       #107 <Class MapsViewState[]>
	//    3    9:areturn         
	}

	private static final MapsViewState $VALUES[];
	public static final MapsViewState CustomizationViewState;
	public static final MapsViewState DebugInfo;
	public static final MapsViewState FloorPlanBooleanValue;
	public static final MapsViewState FloorPlanError;
	public static final MapsViewState FloorPlanItemNotFound;
	public static final MapsViewState FloorPlanListItem;
	public static final MapsViewState FloorPlanNavigation;
	public static final MapsViewState FloorPlanRegionList;
	public static final MapsViewState MapDirty;
	public static final MapsViewState MapZoomReset;
	public static final MapsViewState NoRegionSelectedToLabel;
	public static final MapsViewState RegionNameAlreadyInUse;
	public static final MapsViewState RegionSelectedToLabel;
	public static final MapsViewState ShowCustomizationErrorMessage;
	public static final MapsViewState ShowCustomizationOptionMenu;
	public static final MapsViewState ShowCustomizedMapName;
	public static final MapsViewState ShowEnterMapNameDialog;
	public static final MapsViewState ShowUnlabeledRegionCount;
	public static final MapsViewState StartMissionActionSuccessful;
	public static final MapsViewState UpdateViewTitle;

	static 
	{
		FloorPlanNavigation = new MapsViewState("FloorPlanNavigation", 0);
	//    0    0:new             #2   <Class MapsViewState>
	//    1    3:dup             
	//    2    4:ldc1            #31  <String "FloorPlanNavigation">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #35  <Method void MapsViewState(String, int)>
	//    5   10:putstatic       #37  <Field MapsViewState FloorPlanNavigation>
		FloorPlanListItem = new MapsViewState("FloorPlanListItem", 1);
	//    6   13:new             #2   <Class MapsViewState>
	//    7   16:dup             
	//    8   17:ldc1            #38  <String "FloorPlanListItem">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #35  <Method void MapsViewState(String, int)>
	//   11   23:putstatic       #40  <Field MapsViewState FloorPlanListItem>
		FloorPlanItemNotFound = new MapsViewState("FloorPlanItemNotFound", 2);
	//   12   26:new             #2   <Class MapsViewState>
	//   13   29:dup             
	//   14   30:ldc1            #41  <String "FloorPlanItemNotFound">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #35  <Method void MapsViewState(String, int)>
	//   17   36:putstatic       #43  <Field MapsViewState FloorPlanItemNotFound>
		FloorPlanBooleanValue = new MapsViewState("FloorPlanBooleanValue", 3);
	//   18   39:new             #2   <Class MapsViewState>
	//   19   42:dup             
	//   20   43:ldc1            #44  <String "FloorPlanBooleanValue">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #35  <Method void MapsViewState(String, int)>
	//   23   49:putstatic       #46  <Field MapsViewState FloorPlanBooleanValue>
		FloorPlanRegionList = new MapsViewState("FloorPlanRegionList", 4);
	//   24   52:new             #2   <Class MapsViewState>
	//   25   55:dup             
	//   26   56:ldc1            #47  <String "FloorPlanRegionList">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #35  <Method void MapsViewState(String, int)>
	//   29   62:putstatic       #49  <Field MapsViewState FloorPlanRegionList>
		FloorPlanError = new MapsViewState("FloorPlanError", 5);
	//   30   65:new             #2   <Class MapsViewState>
	//   31   68:dup             
	//   32   69:ldc1            #50  <String "FloorPlanError">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #35  <Method void MapsViewState(String, int)>
	//   35   75:putstatic       #52  <Field MapsViewState FloorPlanError>
		RegionSelectedToLabel = new MapsViewState("RegionSelectedToLabel", 6);
	//   36   78:new             #2   <Class MapsViewState>
	//   37   81:dup             
	//   38   82:ldc1            #53  <String "RegionSelectedToLabel">
	//   39   84:bipush          6
	//   40   86:invokespecial   #35  <Method void MapsViewState(String, int)>
	//   41   89:putstatic       #55  <Field MapsViewState RegionSelectedToLabel>
		NoRegionSelectedToLabel = new MapsViewState("NoRegionSelectedToLabel", 7);
	//   42   92:new             #2   <Class MapsViewState>
	//   43   95:dup             
	//   44   96:ldc1            #56  <String "NoRegionSelectedToLabel">
	//   45   98:bipush          7
	//   46  100:invokespecial   #35  <Method void MapsViewState(String, int)>
	//   47  103:putstatic       #58  <Field MapsViewState NoRegionSelectedToLabel>
		CustomizationViewState = new MapsViewState("CustomizationViewState", 8);
	//   48  106:new             #2   <Class MapsViewState>
	//   49  109:dup             
	//   50  110:ldc1            #59  <String "CustomizationViewState">
	//   51  112:bipush          8
	//   52  114:invokespecial   #35  <Method void MapsViewState(String, int)>
	//   53  117:putstatic       #61  <Field MapsViewState CustomizationViewState>
		ShowCustomizationOptionMenu = new MapsViewState("ShowCustomizationOptionMenu", 9);
	//   54  120:new             #2   <Class MapsViewState>
	//   55  123:dup             
	//   56  124:ldc1            #62  <String "ShowCustomizationOptionMenu">
	//   57  126:bipush          9
	//   58  128:invokespecial   #35  <Method void MapsViewState(String, int)>
	//   59  131:putstatic       #64  <Field MapsViewState ShowCustomizationOptionMenu>
		ShowCustomizationErrorMessage = new MapsViewState("ShowCustomizationErrorMessage", 10);
	//   60  134:new             #2   <Class MapsViewState>
	//   61  137:dup             
	//   62  138:ldc1            #65  <String "ShowCustomizationErrorMessage">
	//   63  140:bipush          10
	//   64  142:invokespecial   #35  <Method void MapsViewState(String, int)>
	//   65  145:putstatic       #67  <Field MapsViewState ShowCustomizationErrorMessage>
		ShowCustomizedMapName = new MapsViewState("ShowCustomizedMapName", 11);
	//   66  148:new             #2   <Class MapsViewState>
	//   67  151:dup             
	//   68  152:ldc1            #68  <String "ShowCustomizedMapName">
	//   69  154:bipush          11
	//   70  156:invokespecial   #35  <Method void MapsViewState(String, int)>
	//   71  159:putstatic       #70  <Field MapsViewState ShowCustomizedMapName>
		ShowEnterMapNameDialog = new MapsViewState("ShowEnterMapNameDialog", 12);
	//   72  162:new             #2   <Class MapsViewState>
	//   73  165:dup             
	//   74  166:ldc1            #71  <String "ShowEnterMapNameDialog">
	//   75  168:bipush          12
	//   76  170:invokespecial   #35  <Method void MapsViewState(String, int)>
	//   77  173:putstatic       #73  <Field MapsViewState ShowEnterMapNameDialog>
		ShowUnlabeledRegionCount = new MapsViewState("ShowUnlabeledRegionCount", 13);
	//   78  176:new             #2   <Class MapsViewState>
	//   79  179:dup             
	//   80  180:ldc1            #74  <String "ShowUnlabeledRegionCount">
	//   81  182:bipush          13
	//   82  184:invokespecial   #35  <Method void MapsViewState(String, int)>
	//   83  187:putstatic       #76  <Field MapsViewState ShowUnlabeledRegionCount>
		MapDirty = new MapsViewState("MapDirty", 14);
	//   84  190:new             #2   <Class MapsViewState>
	//   85  193:dup             
	//   86  194:ldc1            #77  <String "MapDirty">
	//   87  196:bipush          14
	//   88  198:invokespecial   #35  <Method void MapsViewState(String, int)>
	//   89  201:putstatic       #79  <Field MapsViewState MapDirty>
		RegionNameAlreadyInUse = new MapsViewState("RegionNameAlreadyInUse", 15);
	//   90  204:new             #2   <Class MapsViewState>
	//   91  207:dup             
	//   92  208:ldc1            #80  <String "RegionNameAlreadyInUse">
	//   93  210:bipush          15
	//   94  212:invokespecial   #35  <Method void MapsViewState(String, int)>
	//   95  215:putstatic       #82  <Field MapsViewState RegionNameAlreadyInUse>
		DebugInfo = new MapsViewState("DebugInfo", 16);
	//   96  218:new             #2   <Class MapsViewState>
	//   97  221:dup             
	//   98  222:ldc1            #83  <String "DebugInfo">
	//   99  224:bipush          16
	//  100  226:invokespecial   #35  <Method void MapsViewState(String, int)>
	//  101  229:putstatic       #85  <Field MapsViewState DebugInfo>
		UpdateViewTitle = new MapsViewState("UpdateViewTitle", 17);
	//  102  232:new             #2   <Class MapsViewState>
	//  103  235:dup             
	//  104  236:ldc1            #86  <String "UpdateViewTitle">
	//  105  238:bipush          17
	//  106  240:invokespecial   #35  <Method void MapsViewState(String, int)>
	//  107  243:putstatic       #88  <Field MapsViewState UpdateViewTitle>
		MapZoomReset = new MapsViewState("MapZoomReset", 18);
	//  108  246:new             #2   <Class MapsViewState>
	//  109  249:dup             
	//  110  250:ldc1            #89  <String "MapZoomReset">
	//  111  252:bipush          18
	//  112  254:invokespecial   #35  <Method void MapsViewState(String, int)>
	//  113  257:putstatic       #91  <Field MapsViewState MapZoomReset>
		StartMissionActionSuccessful = new MapsViewState("StartMissionActionSuccessful", 19);
	//  114  260:new             #2   <Class MapsViewState>
	//  115  263:dup             
	//  116  264:ldc1            #92  <String "StartMissionActionSuccessful">
	//  117  266:bipush          19
	//  118  268:invokespecial   #35  <Method void MapsViewState(String, int)>
	//  119  271:putstatic       #94  <Field MapsViewState StartMissionActionSuccessful>
		$VALUES = (new MapsViewState[] {
			FloorPlanNavigation, FloorPlanListItem, FloorPlanItemNotFound, FloorPlanBooleanValue, FloorPlanRegionList, FloorPlanError, RegionSelectedToLabel, NoRegionSelectedToLabel, CustomizationViewState, ShowCustomizationOptionMenu, 
			ShowCustomizationErrorMessage, ShowCustomizedMapName, ShowEnterMapNameDialog, ShowUnlabeledRegionCount, MapDirty, RegionNameAlreadyInUse, DebugInfo, UpdateViewTitle, MapZoomReset, StartMissionActionSuccessful
		});
	//  120  274:bipush          20
	//  121  276:anewarray       MapsViewState[]
	//  122  279:dup             
	//  123  280:iconst_0        
	//  124  281:getstatic       #37  <Field MapsViewState FloorPlanNavigation>
	//  125  284:aastore         
	//  126  285:dup             
	//  127  286:iconst_1        
	//  128  287:getstatic       #40  <Field MapsViewState FloorPlanListItem>
	//  129  290:aastore         
	//  130  291:dup             
	//  131  292:iconst_2        
	//  132  293:getstatic       #43  <Field MapsViewState FloorPlanItemNotFound>
	//  133  296:aastore         
	//  134  297:dup             
	//  135  298:iconst_3        
	//  136  299:getstatic       #46  <Field MapsViewState FloorPlanBooleanValue>
	//  137  302:aastore         
	//  138  303:dup             
	//  139  304:iconst_4        
	//  140  305:getstatic       #49  <Field MapsViewState FloorPlanRegionList>
	//  141  308:aastore         
	//  142  309:dup             
	//  143  310:iconst_5        
	//  144  311:getstatic       #52  <Field MapsViewState FloorPlanError>
	//  145  314:aastore         
	//  146  315:dup             
	//  147  316:bipush          6
	//  148  318:getstatic       #55  <Field MapsViewState RegionSelectedToLabel>
	//  149  321:aastore         
	//  150  322:dup             
	//  151  323:bipush          7
	//  152  325:getstatic       #58  <Field MapsViewState NoRegionSelectedToLabel>
	//  153  328:aastore         
	//  154  329:dup             
	//  155  330:bipush          8
	//  156  332:getstatic       #61  <Field MapsViewState CustomizationViewState>
	//  157  335:aastore         
	//  158  336:dup             
	//  159  337:bipush          9
	//  160  339:getstatic       #64  <Field MapsViewState ShowCustomizationOptionMenu>
	//  161  342:aastore         
	//  162  343:dup             
	//  163  344:bipush          10
	//  164  346:getstatic       #67  <Field MapsViewState ShowCustomizationErrorMessage>
	//  165  349:aastore         
	//  166  350:dup             
	//  167  351:bipush          11
	//  168  353:getstatic       #70  <Field MapsViewState ShowCustomizedMapName>
	//  169  356:aastore         
	//  170  357:dup             
	//  171  358:bipush          12
	//  172  360:getstatic       #73  <Field MapsViewState ShowEnterMapNameDialog>
	//  173  363:aastore         
	//  174  364:dup             
	//  175  365:bipush          13
	//  176  367:getstatic       #76  <Field MapsViewState ShowUnlabeledRegionCount>
	//  177  370:aastore         
	//  178  371:dup             
	//  179  372:bipush          14
	//  180  374:getstatic       #79  <Field MapsViewState MapDirty>
	//  181  377:aastore         
	//  182  378:dup             
	//  183  379:bipush          15
	//  184  381:getstatic       #82  <Field MapsViewState RegionNameAlreadyInUse>
	//  185  384:aastore         
	//  186  385:dup             
	//  187  386:bipush          16
	//  188  388:getstatic       #85  <Field MapsViewState DebugInfo>
	//  189  391:aastore         
	//  190  392:dup             
	//  191  393:bipush          17
	//  192  395:getstatic       #88  <Field MapsViewState UpdateViewTitle>
	//  193  398:aastore         
	//  194  399:dup             
	//  195  400:bipush          18
	//  196  402:getstatic       #91  <Field MapsViewState MapZoomReset>
	//  197  405:aastore         
	//  198  406:dup             
	//  199  407:bipush          19
	//  200  409:getstatic       #94  <Field MapsViewState StartMissionActionSuccessful>
	//  201  412:aastore         
	//  202  413:putstatic       #96  <Field MapsViewState[] $VALUES>
	//* 203  416:return          
	}
}
