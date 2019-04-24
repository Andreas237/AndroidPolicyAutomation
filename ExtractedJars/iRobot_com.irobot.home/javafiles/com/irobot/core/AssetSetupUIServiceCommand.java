// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class AssetSetupUIServiceCommand extends Enum
{

	private AssetSetupUIServiceCommand(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #90  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static AssetSetupUIServiceCommand valueOf(String s)
	{
		return (AssetSetupUIServiceCommand)Enum.valueOf(com/irobot/core/AssetSetupUIServiceCommand, s);
	//    0    0:ldc1            #2   <Class AssetSetupUIServiceCommand>
	//    1    2:aload_0         
	//    2    3:invokestatic    #96  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AssetSetupUIServiceCommand>
	//    4    9:areturn         
	}

	public static AssetSetupUIServiceCommand[] values()
	{
		return (AssetSetupUIServiceCommand[])((AssetSetupUIServiceCommand []) ($VALUES)).clone();
	//    0    0:getstatic       #88  <Field AssetSetupUIServiceCommand[] $VALUES>
	//    1    3:invokevirtual   #103 <Method Object _5B_Lcom.irobot.core.AssetSetupUIServiceCommand_3B_.clone()>
	//    2    6:checkcast       #99  <Class AssetSetupUIServiceCommand[]>
	//    3    9:areturn         
	}

	private static final AssetSetupUIServiceCommand $VALUES[];
	public static final AssetSetupUIServiceCommand AssetNotVisibleToUser;
	public static final AssetSetupUIServiceCommand AssetSelectedForProvisioning;
	public static final AssetSetupUIServiceCommand CancelProvisioning;
	public static final AssetSetupUIServiceCommand ChangeWifiSettingsClicked;
	public static final AssetSetupUIServiceCommand PrepareForProvisioning;
	public static final AssetSetupUIServiceCommand RefreshDiscoveryItemsList;
	public static final AssetSetupUIServiceCommand ResetAssetSetup;
	public static final AssetSetupUIServiceCommand RobotListItemSelected;
	public static final AssetSetupUIServiceCommand SSIDChanged;
	public static final AssetSetupUIServiceCommand SetAssetIdDiscoveryFilter;
	public static final AssetSetupUIServiceCommand StartFetchingDiscoveryListItems;
	public static final AssetSetupUIServiceCommand StartPickBLERobotPresentationFlow;
	public static final AssetSetupUIServiceCommand StartProvisioning;
	public static final AssetSetupUIServiceCommand StartSelectARobotPresentationFlow;
	public static final AssetSetupUIServiceCommand StopFetchingDiscoveryListItems;
	public static final AssetSetupUIServiceCommand StopPickBLERobotPresentationFlow;
	public static final AssetSetupUIServiceCommand StopSelectARobotPresentationFlow;
	public static final AssetSetupUIServiceCommand UpdateServiceData;

	static 
	{
		UpdateServiceData = new AssetSetupUIServiceCommand("UpdateServiceData", 0);
	//    0    0:new             #2   <Class AssetSetupUIServiceCommand>
	//    1    3:dup             
	//    2    4:ldc1            #29  <String "UpdateServiceData">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #33  <Method void AssetSetupUIServiceCommand(String, int)>
	//    5   10:putstatic       #35  <Field AssetSetupUIServiceCommand UpdateServiceData>
		PrepareForProvisioning = new AssetSetupUIServiceCommand("PrepareForProvisioning", 1);
	//    6   13:new             #2   <Class AssetSetupUIServiceCommand>
	//    7   16:dup             
	//    8   17:ldc1            #36  <String "PrepareForProvisioning">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #33  <Method void AssetSetupUIServiceCommand(String, int)>
	//   11   23:putstatic       #38  <Field AssetSetupUIServiceCommand PrepareForProvisioning>
		StartProvisioning = new AssetSetupUIServiceCommand("StartProvisioning", 2);
	//   12   26:new             #2   <Class AssetSetupUIServiceCommand>
	//   13   29:dup             
	//   14   30:ldc1            #39  <String "StartProvisioning">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #33  <Method void AssetSetupUIServiceCommand(String, int)>
	//   17   36:putstatic       #41  <Field AssetSetupUIServiceCommand StartProvisioning>
		CancelProvisioning = new AssetSetupUIServiceCommand("CancelProvisioning", 3);
	//   18   39:new             #2   <Class AssetSetupUIServiceCommand>
	//   19   42:dup             
	//   20   43:ldc1            #42  <String "CancelProvisioning">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #33  <Method void AssetSetupUIServiceCommand(String, int)>
	//   23   49:putstatic       #44  <Field AssetSetupUIServiceCommand CancelProvisioning>
		ResetAssetSetup = new AssetSetupUIServiceCommand("ResetAssetSetup", 4);
	//   24   52:new             #2   <Class AssetSetupUIServiceCommand>
	//   25   55:dup             
	//   26   56:ldc1            #45  <String "ResetAssetSetup">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #33  <Method void AssetSetupUIServiceCommand(String, int)>
	//   29   62:putstatic       #47  <Field AssetSetupUIServiceCommand ResetAssetSetup>
		SSIDChanged = new AssetSetupUIServiceCommand("SSIDChanged", 5);
	//   30   65:new             #2   <Class AssetSetupUIServiceCommand>
	//   31   68:dup             
	//   32   69:ldc1            #48  <String "SSIDChanged">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #33  <Method void AssetSetupUIServiceCommand(String, int)>
	//   35   75:putstatic       #50  <Field AssetSetupUIServiceCommand SSIDChanged>
		SetAssetIdDiscoveryFilter = new AssetSetupUIServiceCommand("SetAssetIdDiscoveryFilter", 6);
	//   36   78:new             #2   <Class AssetSetupUIServiceCommand>
	//   37   81:dup             
	//   38   82:ldc1            #51  <String "SetAssetIdDiscoveryFilter">
	//   39   84:bipush          6
	//   40   86:invokespecial   #33  <Method void AssetSetupUIServiceCommand(String, int)>
	//   41   89:putstatic       #53  <Field AssetSetupUIServiceCommand SetAssetIdDiscoveryFilter>
		StartSelectARobotPresentationFlow = new AssetSetupUIServiceCommand("StartSelectARobotPresentationFlow", 7);
	//   42   92:new             #2   <Class AssetSetupUIServiceCommand>
	//   43   95:dup             
	//   44   96:ldc1            #54  <String "StartSelectARobotPresentationFlow">
	//   45   98:bipush          7
	//   46  100:invokespecial   #33  <Method void AssetSetupUIServiceCommand(String, int)>
	//   47  103:putstatic       #56  <Field AssetSetupUIServiceCommand StartSelectARobotPresentationFlow>
		StopSelectARobotPresentationFlow = new AssetSetupUIServiceCommand("StopSelectARobotPresentationFlow", 8);
	//   48  106:new             #2   <Class AssetSetupUIServiceCommand>
	//   49  109:dup             
	//   50  110:ldc1            #57  <String "StopSelectARobotPresentationFlow">
	//   51  112:bipush          8
	//   52  114:invokespecial   #33  <Method void AssetSetupUIServiceCommand(String, int)>
	//   53  117:putstatic       #59  <Field AssetSetupUIServiceCommand StopSelectARobotPresentationFlow>
		StartPickBLERobotPresentationFlow = new AssetSetupUIServiceCommand("StartPickBLERobotPresentationFlow", 9);
	//   54  120:new             #2   <Class AssetSetupUIServiceCommand>
	//   55  123:dup             
	//   56  124:ldc1            #60  <String "StartPickBLERobotPresentationFlow">
	//   57  126:bipush          9
	//   58  128:invokespecial   #33  <Method void AssetSetupUIServiceCommand(String, int)>
	//   59  131:putstatic       #62  <Field AssetSetupUIServiceCommand StartPickBLERobotPresentationFlow>
		StopPickBLERobotPresentationFlow = new AssetSetupUIServiceCommand("StopPickBLERobotPresentationFlow", 10);
	//   60  134:new             #2   <Class AssetSetupUIServiceCommand>
	//   61  137:dup             
	//   62  138:ldc1            #63  <String "StopPickBLERobotPresentationFlow">
	//   63  140:bipush          10
	//   64  142:invokespecial   #33  <Method void AssetSetupUIServiceCommand(String, int)>
	//   65  145:putstatic       #65  <Field AssetSetupUIServiceCommand StopPickBLERobotPresentationFlow>
		StartFetchingDiscoveryListItems = new AssetSetupUIServiceCommand("StartFetchingDiscoveryListItems", 11);
	//   66  148:new             #2   <Class AssetSetupUIServiceCommand>
	//   67  151:dup             
	//   68  152:ldc1            #66  <String "StartFetchingDiscoveryListItems">
	//   69  154:bipush          11
	//   70  156:invokespecial   #33  <Method void AssetSetupUIServiceCommand(String, int)>
	//   71  159:putstatic       #68  <Field AssetSetupUIServiceCommand StartFetchingDiscoveryListItems>
		RefreshDiscoveryItemsList = new AssetSetupUIServiceCommand("RefreshDiscoveryItemsList", 12);
	//   72  162:new             #2   <Class AssetSetupUIServiceCommand>
	//   73  165:dup             
	//   74  166:ldc1            #69  <String "RefreshDiscoveryItemsList">
	//   75  168:bipush          12
	//   76  170:invokespecial   #33  <Method void AssetSetupUIServiceCommand(String, int)>
	//   77  173:putstatic       #71  <Field AssetSetupUIServiceCommand RefreshDiscoveryItemsList>
		RobotListItemSelected = new AssetSetupUIServiceCommand("RobotListItemSelected", 13);
	//   78  176:new             #2   <Class AssetSetupUIServiceCommand>
	//   79  179:dup             
	//   80  180:ldc1            #72  <String "RobotListItemSelected">
	//   81  182:bipush          13
	//   82  184:invokespecial   #33  <Method void AssetSetupUIServiceCommand(String, int)>
	//   83  187:putstatic       #74  <Field AssetSetupUIServiceCommand RobotListItemSelected>
		ChangeWifiSettingsClicked = new AssetSetupUIServiceCommand("ChangeWifiSettingsClicked", 14);
	//   84  190:new             #2   <Class AssetSetupUIServiceCommand>
	//   85  193:dup             
	//   86  194:ldc1            #75  <String "ChangeWifiSettingsClicked">
	//   87  196:bipush          14
	//   88  198:invokespecial   #33  <Method void AssetSetupUIServiceCommand(String, int)>
	//   89  201:putstatic       #77  <Field AssetSetupUIServiceCommand ChangeWifiSettingsClicked>
		StopFetchingDiscoveryListItems = new AssetSetupUIServiceCommand("StopFetchingDiscoveryListItems", 15);
	//   90  204:new             #2   <Class AssetSetupUIServiceCommand>
	//   91  207:dup             
	//   92  208:ldc1            #78  <String "StopFetchingDiscoveryListItems">
	//   93  210:bipush          15
	//   94  212:invokespecial   #33  <Method void AssetSetupUIServiceCommand(String, int)>
	//   95  215:putstatic       #80  <Field AssetSetupUIServiceCommand StopFetchingDiscoveryListItems>
		AssetSelectedForProvisioning = new AssetSetupUIServiceCommand("AssetSelectedForProvisioning", 16);
	//   96  218:new             #2   <Class AssetSetupUIServiceCommand>
	//   97  221:dup             
	//   98  222:ldc1            #81  <String "AssetSelectedForProvisioning">
	//   99  224:bipush          16
	//  100  226:invokespecial   #33  <Method void AssetSetupUIServiceCommand(String, int)>
	//  101  229:putstatic       #83  <Field AssetSetupUIServiceCommand AssetSelectedForProvisioning>
		AssetNotVisibleToUser = new AssetSetupUIServiceCommand("AssetNotVisibleToUser", 17);
	//  102  232:new             #2   <Class AssetSetupUIServiceCommand>
	//  103  235:dup             
	//  104  236:ldc1            #84  <String "AssetNotVisibleToUser">
	//  105  238:bipush          17
	//  106  240:invokespecial   #33  <Method void AssetSetupUIServiceCommand(String, int)>
	//  107  243:putstatic       #86  <Field AssetSetupUIServiceCommand AssetNotVisibleToUser>
		$VALUES = (new AssetSetupUIServiceCommand[] {
			UpdateServiceData, PrepareForProvisioning, StartProvisioning, CancelProvisioning, ResetAssetSetup, SSIDChanged, SetAssetIdDiscoveryFilter, StartSelectARobotPresentationFlow, StopSelectARobotPresentationFlow, StartPickBLERobotPresentationFlow, 
			StopPickBLERobotPresentationFlow, StartFetchingDiscoveryListItems, RefreshDiscoveryItemsList, RobotListItemSelected, ChangeWifiSettingsClicked, StopFetchingDiscoveryListItems, AssetSelectedForProvisioning, AssetNotVisibleToUser
		});
	//  108  246:bipush          18
	//  109  248:anewarray       AssetSetupUIServiceCommand[]
	//  110  251:dup             
	//  111  252:iconst_0        
	//  112  253:getstatic       #35  <Field AssetSetupUIServiceCommand UpdateServiceData>
	//  113  256:aastore         
	//  114  257:dup             
	//  115  258:iconst_1        
	//  116  259:getstatic       #38  <Field AssetSetupUIServiceCommand PrepareForProvisioning>
	//  117  262:aastore         
	//  118  263:dup             
	//  119  264:iconst_2        
	//  120  265:getstatic       #41  <Field AssetSetupUIServiceCommand StartProvisioning>
	//  121  268:aastore         
	//  122  269:dup             
	//  123  270:iconst_3        
	//  124  271:getstatic       #44  <Field AssetSetupUIServiceCommand CancelProvisioning>
	//  125  274:aastore         
	//  126  275:dup             
	//  127  276:iconst_4        
	//  128  277:getstatic       #47  <Field AssetSetupUIServiceCommand ResetAssetSetup>
	//  129  280:aastore         
	//  130  281:dup             
	//  131  282:iconst_5        
	//  132  283:getstatic       #50  <Field AssetSetupUIServiceCommand SSIDChanged>
	//  133  286:aastore         
	//  134  287:dup             
	//  135  288:bipush          6
	//  136  290:getstatic       #53  <Field AssetSetupUIServiceCommand SetAssetIdDiscoveryFilter>
	//  137  293:aastore         
	//  138  294:dup             
	//  139  295:bipush          7
	//  140  297:getstatic       #56  <Field AssetSetupUIServiceCommand StartSelectARobotPresentationFlow>
	//  141  300:aastore         
	//  142  301:dup             
	//  143  302:bipush          8
	//  144  304:getstatic       #59  <Field AssetSetupUIServiceCommand StopSelectARobotPresentationFlow>
	//  145  307:aastore         
	//  146  308:dup             
	//  147  309:bipush          9
	//  148  311:getstatic       #62  <Field AssetSetupUIServiceCommand StartPickBLERobotPresentationFlow>
	//  149  314:aastore         
	//  150  315:dup             
	//  151  316:bipush          10
	//  152  318:getstatic       #65  <Field AssetSetupUIServiceCommand StopPickBLERobotPresentationFlow>
	//  153  321:aastore         
	//  154  322:dup             
	//  155  323:bipush          11
	//  156  325:getstatic       #68  <Field AssetSetupUIServiceCommand StartFetchingDiscoveryListItems>
	//  157  328:aastore         
	//  158  329:dup             
	//  159  330:bipush          12
	//  160  332:getstatic       #71  <Field AssetSetupUIServiceCommand RefreshDiscoveryItemsList>
	//  161  335:aastore         
	//  162  336:dup             
	//  163  337:bipush          13
	//  164  339:getstatic       #74  <Field AssetSetupUIServiceCommand RobotListItemSelected>
	//  165  342:aastore         
	//  166  343:dup             
	//  167  344:bipush          14
	//  168  346:getstatic       #77  <Field AssetSetupUIServiceCommand ChangeWifiSettingsClicked>
	//  169  349:aastore         
	//  170  350:dup             
	//  171  351:bipush          15
	//  172  353:getstatic       #80  <Field AssetSetupUIServiceCommand StopFetchingDiscoveryListItems>
	//  173  356:aastore         
	//  174  357:dup             
	//  175  358:bipush          16
	//  176  360:getstatic       #83  <Field AssetSetupUIServiceCommand AssetSelectedForProvisioning>
	//  177  363:aastore         
	//  178  364:dup             
	//  179  365:bipush          17
	//  180  367:getstatic       #86  <Field AssetSetupUIServiceCommand AssetNotVisibleToUser>
	//  181  370:aastore         
	//  182  371:putstatic       #88  <Field AssetSetupUIServiceCommand[] $VALUES>
	//* 183  374:return          
	}
}
