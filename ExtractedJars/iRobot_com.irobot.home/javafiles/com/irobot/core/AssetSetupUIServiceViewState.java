// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class AssetSetupUIServiceViewState extends Enum
{

	private AssetSetupUIServiceViewState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #106 <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static AssetSetupUIServiceViewState valueOf(String s)
	{
		return (AssetSetupUIServiceViewState)Enum.valueOf(com/irobot/core/AssetSetupUIServiceViewState, s);
	//    0    0:ldc1            #2   <Class AssetSetupUIServiceViewState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #112 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AssetSetupUIServiceViewState>
	//    4    9:areturn         
	}

	public static AssetSetupUIServiceViewState[] values()
	{
		return (AssetSetupUIServiceViewState[])((AssetSetupUIServiceViewState []) ($VALUES)).clone();
	//    0    0:getstatic       #104 <Field AssetSetupUIServiceViewState[] $VALUES>
	//    1    3:invokevirtual   #119 <Method Object _5B_Lcom.irobot.core.AssetSetupUIServiceViewState_3B_.clone()>
	//    2    6:checkcast       #115 <Class AssetSetupUIServiceViewState[]>
	//    3    9:areturn         
	}

	private static final AssetSetupUIServiceViewState $VALUES[];
	public static final AssetSetupUIServiceViewState AssetDiscoveredOnHomeNetworkUpdated;
	public static final AssetSetupUIServiceViewState ConnectToHomeAp;
	public static final AssetSetupUIServiceViewState ConnectToSoftAp;
	public static final AssetSetupUIServiceViewState CurrentProvisioningStatus;
	public static final AssetSetupUIServiceViewState DiscoveredBleAssetsListUpdated;
	public static final AssetSetupUIServiceViewState DiscoveredWifiAssetsListUpdated;
	public static final AssetSetupUIServiceViewState DiscoveryInProgress;
	public static final AssetSetupUIServiceViewState DiscoveryStateChanged;
	public static final AssetSetupUIServiceViewState DiscoveryTerminated;
	public static final AssetSetupUIServiceViewState HideDontSeeMyRobotOption;
	public static final AssetSetupUIServiceViewState Invalid;
	public static final AssetSetupUIServiceViewState NavigateToAddRobotFlow;
	public static final AssetSetupUIServiceViewState NavigateToProvisioningFlow;
	public static final AssetSetupUIServiceViewState NavigateToWifiSettings;
	public static final AssetSetupUIServiceViewState ProceedToBleProvisioning;
	public static final AssetSetupUIServiceViewState ProceedToWifiProvisioning;
	public static final AssetSetupUIServiceViewState ReconnectedToIncorrectHomeAccessPoint;
	public static final AssetSetupUIServiceViewState RefreshRobotDiscoveryList;
	public static final AssetSetupUIServiceViewState RobotDiscovered;
	public static final AssetSetupUIServiceViewState ShowDontSeeMyRobotOption;
	public static final AssetSetupUIServiceViewState TransitionToProvisioningType;
	public static final AssetSetupUIServiceViewState WifiProvisioningError;

	static 
	{
		CurrentProvisioningStatus = new AssetSetupUIServiceViewState("CurrentProvisioningStatus", 0);
	//    0    0:new             #2   <Class AssetSetupUIServiceViewState>
	//    1    3:dup             
	//    2    4:ldc1            #33  <String "CurrentProvisioningStatus">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #37  <Method void AssetSetupUIServiceViewState(String, int)>
	//    5   10:putstatic       #39  <Field AssetSetupUIServiceViewState CurrentProvisioningStatus>
		ConnectToSoftAp = new AssetSetupUIServiceViewState("ConnectToSoftAp", 1);
	//    6   13:new             #2   <Class AssetSetupUIServiceViewState>
	//    7   16:dup             
	//    8   17:ldc1            #40  <String "ConnectToSoftAp">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #37  <Method void AssetSetupUIServiceViewState(String, int)>
	//   11   23:putstatic       #42  <Field AssetSetupUIServiceViewState ConnectToSoftAp>
		ConnectToHomeAp = new AssetSetupUIServiceViewState("ConnectToHomeAp", 2);
	//   12   26:new             #2   <Class AssetSetupUIServiceViewState>
	//   13   29:dup             
	//   14   30:ldc1            #43  <String "ConnectToHomeAp">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #37  <Method void AssetSetupUIServiceViewState(String, int)>
	//   17   36:putstatic       #45  <Field AssetSetupUIServiceViewState ConnectToHomeAp>
		ReconnectedToIncorrectHomeAccessPoint = new AssetSetupUIServiceViewState("ReconnectedToIncorrectHomeAccessPoint", 3);
	//   18   39:new             #2   <Class AssetSetupUIServiceViewState>
	//   19   42:dup             
	//   20   43:ldc1            #46  <String "ReconnectedToIncorrectHomeAccessPoint">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #37  <Method void AssetSetupUIServiceViewState(String, int)>
	//   23   49:putstatic       #48  <Field AssetSetupUIServiceViewState ReconnectedToIncorrectHomeAccessPoint>
		WifiProvisioningError = new AssetSetupUIServiceViewState("WifiProvisioningError", 4);
	//   24   52:new             #2   <Class AssetSetupUIServiceViewState>
	//   25   55:dup             
	//   26   56:ldc1            #49  <String "WifiProvisioningError">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #37  <Method void AssetSetupUIServiceViewState(String, int)>
	//   29   62:putstatic       #51  <Field AssetSetupUIServiceViewState WifiProvisioningError>
		AssetDiscoveredOnHomeNetworkUpdated = new AssetSetupUIServiceViewState("AssetDiscoveredOnHomeNetworkUpdated", 5);
	//   30   65:new             #2   <Class AssetSetupUIServiceViewState>
	//   31   68:dup             
	//   32   69:ldc1            #52  <String "AssetDiscoveredOnHomeNetworkUpdated">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #37  <Method void AssetSetupUIServiceViewState(String, int)>
	//   35   75:putstatic       #54  <Field AssetSetupUIServiceViewState AssetDiscoveredOnHomeNetworkUpdated>
		TransitionToProvisioningType = new AssetSetupUIServiceViewState("TransitionToProvisioningType", 6);
	//   36   78:new             #2   <Class AssetSetupUIServiceViewState>
	//   37   81:dup             
	//   38   82:ldc1            #55  <String "TransitionToProvisioningType">
	//   39   84:bipush          6
	//   40   86:invokespecial   #37  <Method void AssetSetupUIServiceViewState(String, int)>
	//   41   89:putstatic       #57  <Field AssetSetupUIServiceViewState TransitionToProvisioningType>
		DiscoveryStateChanged = new AssetSetupUIServiceViewState("DiscoveryStateChanged", 7);
	//   42   92:new             #2   <Class AssetSetupUIServiceViewState>
	//   43   95:dup             
	//   44   96:ldc1            #58  <String "DiscoveryStateChanged">
	//   45   98:bipush          7
	//   46  100:invokespecial   #37  <Method void AssetSetupUIServiceViewState(String, int)>
	//   47  103:putstatic       #60  <Field AssetSetupUIServiceViewState DiscoveryStateChanged>
		DiscoveredBleAssetsListUpdated = new AssetSetupUIServiceViewState("DiscoveredBleAssetsListUpdated", 8);
	//   48  106:new             #2   <Class AssetSetupUIServiceViewState>
	//   49  109:dup             
	//   50  110:ldc1            #61  <String "DiscoveredBleAssetsListUpdated">
	//   51  112:bipush          8
	//   52  114:invokespecial   #37  <Method void AssetSetupUIServiceViewState(String, int)>
	//   53  117:putstatic       #63  <Field AssetSetupUIServiceViewState DiscoveredBleAssetsListUpdated>
		DiscoveredWifiAssetsListUpdated = new AssetSetupUIServiceViewState("DiscoveredWifiAssetsListUpdated", 9);
	//   54  120:new             #2   <Class AssetSetupUIServiceViewState>
	//   55  123:dup             
	//   56  124:ldc1            #64  <String "DiscoveredWifiAssetsListUpdated">
	//   57  126:bipush          9
	//   58  128:invokespecial   #37  <Method void AssetSetupUIServiceViewState(String, int)>
	//   59  131:putstatic       #66  <Field AssetSetupUIServiceViewState DiscoveredWifiAssetsListUpdated>
		ShowDontSeeMyRobotOption = new AssetSetupUIServiceViewState("ShowDontSeeMyRobotOption", 10);
	//   60  134:new             #2   <Class AssetSetupUIServiceViewState>
	//   61  137:dup             
	//   62  138:ldc1            #67  <String "ShowDontSeeMyRobotOption">
	//   63  140:bipush          10
	//   64  142:invokespecial   #37  <Method void AssetSetupUIServiceViewState(String, int)>
	//   65  145:putstatic       #69  <Field AssetSetupUIServiceViewState ShowDontSeeMyRobotOption>
		HideDontSeeMyRobotOption = new AssetSetupUIServiceViewState("HideDontSeeMyRobotOption", 11);
	//   66  148:new             #2   <Class AssetSetupUIServiceViewState>
	//   67  151:dup             
	//   68  152:ldc1            #70  <String "HideDontSeeMyRobotOption">
	//   69  154:bipush          11
	//   70  156:invokespecial   #37  <Method void AssetSetupUIServiceViewState(String, int)>
	//   71  159:putstatic       #72  <Field AssetSetupUIServiceViewState HideDontSeeMyRobotOption>
		ProceedToBleProvisioning = new AssetSetupUIServiceViewState("ProceedToBleProvisioning", 12);
	//   72  162:new             #2   <Class AssetSetupUIServiceViewState>
	//   73  165:dup             
	//   74  166:ldc1            #73  <String "ProceedToBleProvisioning">
	//   75  168:bipush          12
	//   76  170:invokespecial   #37  <Method void AssetSetupUIServiceViewState(String, int)>
	//   77  173:putstatic       #75  <Field AssetSetupUIServiceViewState ProceedToBleProvisioning>
		ProceedToWifiProvisioning = new AssetSetupUIServiceViewState("ProceedToWifiProvisioning", 13);
	//   78  176:new             #2   <Class AssetSetupUIServiceViewState>
	//   79  179:dup             
	//   80  180:ldc1            #76  <String "ProceedToWifiProvisioning">
	//   81  182:bipush          13
	//   82  184:invokespecial   #37  <Method void AssetSetupUIServiceViewState(String, int)>
	//   83  187:putstatic       #78  <Field AssetSetupUIServiceViewState ProceedToWifiProvisioning>
		RefreshRobotDiscoveryList = new AssetSetupUIServiceViewState("RefreshRobotDiscoveryList", 14);
	//   84  190:new             #2   <Class AssetSetupUIServiceViewState>
	//   85  193:dup             
	//   86  194:ldc1            #79  <String "RefreshRobotDiscoveryList">
	//   87  196:bipush          14
	//   88  198:invokespecial   #37  <Method void AssetSetupUIServiceViewState(String, int)>
	//   89  201:putstatic       #81  <Field AssetSetupUIServiceViewState RefreshRobotDiscoveryList>
		NavigateToProvisioningFlow = new AssetSetupUIServiceViewState("NavigateToProvisioningFlow", 15);
	//   90  204:new             #2   <Class AssetSetupUIServiceViewState>
	//   91  207:dup             
	//   92  208:ldc1            #82  <String "NavigateToProvisioningFlow">
	//   93  210:bipush          15
	//   94  212:invokespecial   #37  <Method void AssetSetupUIServiceViewState(String, int)>
	//   95  215:putstatic       #84  <Field AssetSetupUIServiceViewState NavigateToProvisioningFlow>
		NavigateToAddRobotFlow = new AssetSetupUIServiceViewState("NavigateToAddRobotFlow", 16);
	//   96  218:new             #2   <Class AssetSetupUIServiceViewState>
	//   97  221:dup             
	//   98  222:ldc1            #85  <String "NavigateToAddRobotFlow">
	//   99  224:bipush          16
	//  100  226:invokespecial   #37  <Method void AssetSetupUIServiceViewState(String, int)>
	//  101  229:putstatic       #87  <Field AssetSetupUIServiceViewState NavigateToAddRobotFlow>
		NavigateToWifiSettings = new AssetSetupUIServiceViewState("NavigateToWifiSettings", 17);
	//  102  232:new             #2   <Class AssetSetupUIServiceViewState>
	//  103  235:dup             
	//  104  236:ldc1            #88  <String "NavigateToWifiSettings">
	//  105  238:bipush          17
	//  106  240:invokespecial   #37  <Method void AssetSetupUIServiceViewState(String, int)>
	//  107  243:putstatic       #90  <Field AssetSetupUIServiceViewState NavigateToWifiSettings>
		DiscoveryInProgress = new AssetSetupUIServiceViewState("DiscoveryInProgress", 18);
	//  108  246:new             #2   <Class AssetSetupUIServiceViewState>
	//  109  249:dup             
	//  110  250:ldc1            #91  <String "DiscoveryInProgress">
	//  111  252:bipush          18
	//  112  254:invokespecial   #37  <Method void AssetSetupUIServiceViewState(String, int)>
	//  113  257:putstatic       #93  <Field AssetSetupUIServiceViewState DiscoveryInProgress>
		RobotDiscovered = new AssetSetupUIServiceViewState("RobotDiscovered", 19);
	//  114  260:new             #2   <Class AssetSetupUIServiceViewState>
	//  115  263:dup             
	//  116  264:ldc1            #94  <String "RobotDiscovered">
	//  117  266:bipush          19
	//  118  268:invokespecial   #37  <Method void AssetSetupUIServiceViewState(String, int)>
	//  119  271:putstatic       #96  <Field AssetSetupUIServiceViewState RobotDiscovered>
		DiscoveryTerminated = new AssetSetupUIServiceViewState("DiscoveryTerminated", 20);
	//  120  274:new             #2   <Class AssetSetupUIServiceViewState>
	//  121  277:dup             
	//  122  278:ldc1            #97  <String "DiscoveryTerminated">
	//  123  280:bipush          20
	//  124  282:invokespecial   #37  <Method void AssetSetupUIServiceViewState(String, int)>
	//  125  285:putstatic       #99  <Field AssetSetupUIServiceViewState DiscoveryTerminated>
		Invalid = new AssetSetupUIServiceViewState("Invalid", 21);
	//  126  288:new             #2   <Class AssetSetupUIServiceViewState>
	//  127  291:dup             
	//  128  292:ldc1            #100 <String "Invalid">
	//  129  294:bipush          21
	//  130  296:invokespecial   #37  <Method void AssetSetupUIServiceViewState(String, int)>
	//  131  299:putstatic       #102 <Field AssetSetupUIServiceViewState Invalid>
		$VALUES = (new AssetSetupUIServiceViewState[] {
			CurrentProvisioningStatus, ConnectToSoftAp, ConnectToHomeAp, ReconnectedToIncorrectHomeAccessPoint, WifiProvisioningError, AssetDiscoveredOnHomeNetworkUpdated, TransitionToProvisioningType, DiscoveryStateChanged, DiscoveredBleAssetsListUpdated, DiscoveredWifiAssetsListUpdated, 
			ShowDontSeeMyRobotOption, HideDontSeeMyRobotOption, ProceedToBleProvisioning, ProceedToWifiProvisioning, RefreshRobotDiscoveryList, NavigateToProvisioningFlow, NavigateToAddRobotFlow, NavigateToWifiSettings, DiscoveryInProgress, RobotDiscovered, 
			DiscoveryTerminated, Invalid
		});
	//  132  302:bipush          22
	//  133  304:anewarray       AssetSetupUIServiceViewState[]
	//  134  307:dup             
	//  135  308:iconst_0        
	//  136  309:getstatic       #39  <Field AssetSetupUIServiceViewState CurrentProvisioningStatus>
	//  137  312:aastore         
	//  138  313:dup             
	//  139  314:iconst_1        
	//  140  315:getstatic       #42  <Field AssetSetupUIServiceViewState ConnectToSoftAp>
	//  141  318:aastore         
	//  142  319:dup             
	//  143  320:iconst_2        
	//  144  321:getstatic       #45  <Field AssetSetupUIServiceViewState ConnectToHomeAp>
	//  145  324:aastore         
	//  146  325:dup             
	//  147  326:iconst_3        
	//  148  327:getstatic       #48  <Field AssetSetupUIServiceViewState ReconnectedToIncorrectHomeAccessPoint>
	//  149  330:aastore         
	//  150  331:dup             
	//  151  332:iconst_4        
	//  152  333:getstatic       #51  <Field AssetSetupUIServiceViewState WifiProvisioningError>
	//  153  336:aastore         
	//  154  337:dup             
	//  155  338:iconst_5        
	//  156  339:getstatic       #54  <Field AssetSetupUIServiceViewState AssetDiscoveredOnHomeNetworkUpdated>
	//  157  342:aastore         
	//  158  343:dup             
	//  159  344:bipush          6
	//  160  346:getstatic       #57  <Field AssetSetupUIServiceViewState TransitionToProvisioningType>
	//  161  349:aastore         
	//  162  350:dup             
	//  163  351:bipush          7
	//  164  353:getstatic       #60  <Field AssetSetupUIServiceViewState DiscoveryStateChanged>
	//  165  356:aastore         
	//  166  357:dup             
	//  167  358:bipush          8
	//  168  360:getstatic       #63  <Field AssetSetupUIServiceViewState DiscoveredBleAssetsListUpdated>
	//  169  363:aastore         
	//  170  364:dup             
	//  171  365:bipush          9
	//  172  367:getstatic       #66  <Field AssetSetupUIServiceViewState DiscoveredWifiAssetsListUpdated>
	//  173  370:aastore         
	//  174  371:dup             
	//  175  372:bipush          10
	//  176  374:getstatic       #69  <Field AssetSetupUIServiceViewState ShowDontSeeMyRobotOption>
	//  177  377:aastore         
	//  178  378:dup             
	//  179  379:bipush          11
	//  180  381:getstatic       #72  <Field AssetSetupUIServiceViewState HideDontSeeMyRobotOption>
	//  181  384:aastore         
	//  182  385:dup             
	//  183  386:bipush          12
	//  184  388:getstatic       #75  <Field AssetSetupUIServiceViewState ProceedToBleProvisioning>
	//  185  391:aastore         
	//  186  392:dup             
	//  187  393:bipush          13
	//  188  395:getstatic       #78  <Field AssetSetupUIServiceViewState ProceedToWifiProvisioning>
	//  189  398:aastore         
	//  190  399:dup             
	//  191  400:bipush          14
	//  192  402:getstatic       #81  <Field AssetSetupUIServiceViewState RefreshRobotDiscoveryList>
	//  193  405:aastore         
	//  194  406:dup             
	//  195  407:bipush          15
	//  196  409:getstatic       #84  <Field AssetSetupUIServiceViewState NavigateToProvisioningFlow>
	//  197  412:aastore         
	//  198  413:dup             
	//  199  414:bipush          16
	//  200  416:getstatic       #87  <Field AssetSetupUIServiceViewState NavigateToAddRobotFlow>
	//  201  419:aastore         
	//  202  420:dup             
	//  203  421:bipush          17
	//  204  423:getstatic       #90  <Field AssetSetupUIServiceViewState NavigateToWifiSettings>
	//  205  426:aastore         
	//  206  427:dup             
	//  207  428:bipush          18
	//  208  430:getstatic       #93  <Field AssetSetupUIServiceViewState DiscoveryInProgress>
	//  209  433:aastore         
	//  210  434:dup             
	//  211  435:bipush          19
	//  212  437:getstatic       #96  <Field AssetSetupUIServiceViewState RobotDiscovered>
	//  213  440:aastore         
	//  214  441:dup             
	//  215  442:bipush          20
	//  216  444:getstatic       #99  <Field AssetSetupUIServiceViewState DiscoveryTerminated>
	//  217  447:aastore         
	//  218  448:dup             
	//  219  449:bipush          21
	//  220  451:getstatic       #102 <Field AssetSetupUIServiceViewState Invalid>
	//  221  454:aastore         
	//  222  455:putstatic       #104 <Field AssetSetupUIServiceViewState[] $VALUES>
	//* 223  458:return          
	}
}
