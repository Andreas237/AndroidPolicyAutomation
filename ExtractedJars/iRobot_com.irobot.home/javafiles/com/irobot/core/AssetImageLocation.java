// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class AssetImageLocation extends Enum
{

	private AssetImageLocation(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #74  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static AssetImageLocation valueOf(String s)
	{
		return (AssetImageLocation)Enum.valueOf(com/irobot/core/AssetImageLocation, s);
	//    0    0:ldc1            #2   <Class AssetImageLocation>
	//    1    2:aload_0         
	//    2    3:invokestatic    #80  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AssetImageLocation>
	//    4    9:areturn         
	}

	public static AssetImageLocation[] values()
	{
		return (AssetImageLocation[])((AssetImageLocation []) ($VALUES)).clone();
	//    0    0:getstatic       #72  <Field AssetImageLocation[] $VALUES>
	//    1    3:invokevirtual   #87  <Method Object _5B_Lcom.irobot.core.AssetImageLocation_3B_.clone()>
	//    2    6:checkcast       #83  <Class AssetImageLocation[]>
	//    3    9:areturn         
	}

	private static final AssetImageLocation $VALUES[];
	public static final AssetImageLocation AddRobot;
	public static final AssetImageLocation CareBin;
	public static final AssetImageLocation CareCore;
	public static final AssetImageLocation CareExtractors;
	public static final AssetImageLocation CareMain;
	public static final AssetImageLocation Discovery;
	public static final AssetImageLocation MissionMapCancel;
	public static final AssetImageLocation MissionMapDirt;
	public static final AssetImageLocation MissionMapDock;
	public static final AssetImageLocation MissionMapError;
	public static final AssetImageLocation MissionMapOnDock;
	public static final AssetImageLocation MissionMapRobot;
	public static final AssetImageLocation MissionMapSuccess;
	public static final AssetImageLocation SideMenu;

	static 
	{
		Discovery = new AssetImageLocation("Discovery", 0);
	//    0    0:new             #2   <Class AssetImageLocation>
	//    1    3:dup             
	//    2    4:ldc1            #25  <String "Discovery">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #29  <Method void AssetImageLocation(String, int)>
	//    5   10:putstatic       #31  <Field AssetImageLocation Discovery>
		AddRobot = new AssetImageLocation("AddRobot", 1);
	//    6   13:new             #2   <Class AssetImageLocation>
	//    7   16:dup             
	//    8   17:ldc1            #32  <String "AddRobot">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #29  <Method void AssetImageLocation(String, int)>
	//   11   23:putstatic       #34  <Field AssetImageLocation AddRobot>
		SideMenu = new AssetImageLocation("SideMenu", 2);
	//   12   26:new             #2   <Class AssetImageLocation>
	//   13   29:dup             
	//   14   30:ldc1            #35  <String "SideMenu">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #29  <Method void AssetImageLocation(String, int)>
	//   17   36:putstatic       #37  <Field AssetImageLocation SideMenu>
		CareMain = new AssetImageLocation("CareMain", 3);
	//   18   39:new             #2   <Class AssetImageLocation>
	//   19   42:dup             
	//   20   43:ldc1            #38  <String "CareMain">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #29  <Method void AssetImageLocation(String, int)>
	//   23   49:putstatic       #40  <Field AssetImageLocation CareMain>
		CareBin = new AssetImageLocation("CareBin", 4);
	//   24   52:new             #2   <Class AssetImageLocation>
	//   25   55:dup             
	//   26   56:ldc1            #41  <String "CareBin">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #29  <Method void AssetImageLocation(String, int)>
	//   29   62:putstatic       #43  <Field AssetImageLocation CareBin>
		CareExtractors = new AssetImageLocation("CareExtractors", 5);
	//   30   65:new             #2   <Class AssetImageLocation>
	//   31   68:dup             
	//   32   69:ldc1            #44  <String "CareExtractors">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #29  <Method void AssetImageLocation(String, int)>
	//   35   75:putstatic       #46  <Field AssetImageLocation CareExtractors>
		CareCore = new AssetImageLocation("CareCore", 6);
	//   36   78:new             #2   <Class AssetImageLocation>
	//   37   81:dup             
	//   38   82:ldc1            #47  <String "CareCore">
	//   39   84:bipush          6
	//   40   86:invokespecial   #29  <Method void AssetImageLocation(String, int)>
	//   41   89:putstatic       #49  <Field AssetImageLocation CareCore>
		MissionMapRobot = new AssetImageLocation("MissionMapRobot", 7);
	//   42   92:new             #2   <Class AssetImageLocation>
	//   43   95:dup             
	//   44   96:ldc1            #50  <String "MissionMapRobot">
	//   45   98:bipush          7
	//   46  100:invokespecial   #29  <Method void AssetImageLocation(String, int)>
	//   47  103:putstatic       #52  <Field AssetImageLocation MissionMapRobot>
		MissionMapDirt = new AssetImageLocation("MissionMapDirt", 8);
	//   48  106:new             #2   <Class AssetImageLocation>
	//   49  109:dup             
	//   50  110:ldc1            #53  <String "MissionMapDirt">
	//   51  112:bipush          8
	//   52  114:invokespecial   #29  <Method void AssetImageLocation(String, int)>
	//   53  117:putstatic       #55  <Field AssetImageLocation MissionMapDirt>
		MissionMapDock = new AssetImageLocation("MissionMapDock", 9);
	//   54  120:new             #2   <Class AssetImageLocation>
	//   55  123:dup             
	//   56  124:ldc1            #56  <String "MissionMapDock">
	//   57  126:bipush          9
	//   58  128:invokespecial   #29  <Method void AssetImageLocation(String, int)>
	//   59  131:putstatic       #58  <Field AssetImageLocation MissionMapDock>
		MissionMapError = new AssetImageLocation("MissionMapError", 10);
	//   60  134:new             #2   <Class AssetImageLocation>
	//   61  137:dup             
	//   62  138:ldc1            #59  <String "MissionMapError">
	//   63  140:bipush          10
	//   64  142:invokespecial   #29  <Method void AssetImageLocation(String, int)>
	//   65  145:putstatic       #61  <Field AssetImageLocation MissionMapError>
		MissionMapOnDock = new AssetImageLocation("MissionMapOnDock", 11);
	//   66  148:new             #2   <Class AssetImageLocation>
	//   67  151:dup             
	//   68  152:ldc1            #62  <String "MissionMapOnDock">
	//   69  154:bipush          11
	//   70  156:invokespecial   #29  <Method void AssetImageLocation(String, int)>
	//   71  159:putstatic       #64  <Field AssetImageLocation MissionMapOnDock>
		MissionMapSuccess = new AssetImageLocation("MissionMapSuccess", 12);
	//   72  162:new             #2   <Class AssetImageLocation>
	//   73  165:dup             
	//   74  166:ldc1            #65  <String "MissionMapSuccess">
	//   75  168:bipush          12
	//   76  170:invokespecial   #29  <Method void AssetImageLocation(String, int)>
	//   77  173:putstatic       #67  <Field AssetImageLocation MissionMapSuccess>
		MissionMapCancel = new AssetImageLocation("MissionMapCancel", 13);
	//   78  176:new             #2   <Class AssetImageLocation>
	//   79  179:dup             
	//   80  180:ldc1            #68  <String "MissionMapCancel">
	//   81  182:bipush          13
	//   82  184:invokespecial   #29  <Method void AssetImageLocation(String, int)>
	//   83  187:putstatic       #70  <Field AssetImageLocation MissionMapCancel>
		$VALUES = (new AssetImageLocation[] {
			Discovery, AddRobot, SideMenu, CareMain, CareBin, CareExtractors, CareCore, MissionMapRobot, MissionMapDirt, MissionMapDock, 
			MissionMapError, MissionMapOnDock, MissionMapSuccess, MissionMapCancel
		});
	//   84  190:bipush          14
	//   85  192:anewarray       AssetImageLocation[]
	//   86  195:dup             
	//   87  196:iconst_0        
	//   88  197:getstatic       #31  <Field AssetImageLocation Discovery>
	//   89  200:aastore         
	//   90  201:dup             
	//   91  202:iconst_1        
	//   92  203:getstatic       #34  <Field AssetImageLocation AddRobot>
	//   93  206:aastore         
	//   94  207:dup             
	//   95  208:iconst_2        
	//   96  209:getstatic       #37  <Field AssetImageLocation SideMenu>
	//   97  212:aastore         
	//   98  213:dup             
	//   99  214:iconst_3        
	//  100  215:getstatic       #40  <Field AssetImageLocation CareMain>
	//  101  218:aastore         
	//  102  219:dup             
	//  103  220:iconst_4        
	//  104  221:getstatic       #43  <Field AssetImageLocation CareBin>
	//  105  224:aastore         
	//  106  225:dup             
	//  107  226:iconst_5        
	//  108  227:getstatic       #46  <Field AssetImageLocation CareExtractors>
	//  109  230:aastore         
	//  110  231:dup             
	//  111  232:bipush          6
	//  112  234:getstatic       #49  <Field AssetImageLocation CareCore>
	//  113  237:aastore         
	//  114  238:dup             
	//  115  239:bipush          7
	//  116  241:getstatic       #52  <Field AssetImageLocation MissionMapRobot>
	//  117  244:aastore         
	//  118  245:dup             
	//  119  246:bipush          8
	//  120  248:getstatic       #55  <Field AssetImageLocation MissionMapDirt>
	//  121  251:aastore         
	//  122  252:dup             
	//  123  253:bipush          9
	//  124  255:getstatic       #58  <Field AssetImageLocation MissionMapDock>
	//  125  258:aastore         
	//  126  259:dup             
	//  127  260:bipush          10
	//  128  262:getstatic       #61  <Field AssetImageLocation MissionMapError>
	//  129  265:aastore         
	//  130  266:dup             
	//  131  267:bipush          11
	//  132  269:getstatic       #64  <Field AssetImageLocation MissionMapOnDock>
	//  133  272:aastore         
	//  134  273:dup             
	//  135  274:bipush          12
	//  136  276:getstatic       #67  <Field AssetImageLocation MissionMapSuccess>
	//  137  279:aastore         
	//  138  280:dup             
	//  139  281:bipush          13
	//  140  283:getstatic       #70  <Field AssetImageLocation MissionMapCancel>
	//  141  286:aastore         
	//  142  287:putstatic       #72  <Field AssetImageLocation[] $VALUES>
	//* 143  290:return          
	}
}
