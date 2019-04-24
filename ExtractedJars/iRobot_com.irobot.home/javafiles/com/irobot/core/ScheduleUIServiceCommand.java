// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class ScheduleUIServiceCommand extends Enum
{

	private ScheduleUIServiceCommand(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #90  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static ScheduleUIServiceCommand valueOf(String s)
	{
		return (ScheduleUIServiceCommand)Enum.valueOf(com/irobot/core/ScheduleUIServiceCommand, s);
	//    0    0:ldc1            #2   <Class ScheduleUIServiceCommand>
	//    1    2:aload_0         
	//    2    3:invokestatic    #96  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ScheduleUIServiceCommand>
	//    4    9:areturn         
	}

	public static ScheduleUIServiceCommand[] values()
	{
		return (ScheduleUIServiceCommand[])((ScheduleUIServiceCommand []) ($VALUES)).clone();
	//    0    0:getstatic       #88  <Field ScheduleUIServiceCommand[] $VALUES>
	//    1    3:invokevirtual   #103 <Method Object _5B_Lcom.irobot.core.ScheduleUIServiceCommand_3B_.clone()>
	//    2    6:checkcast       #99  <Class ScheduleUIServiceCommand[]>
	//    3    9:areturn         
	}

	private static final ScheduleUIServiceCommand $VALUES[];
	public static final ScheduleUIServiceCommand CheckIfSchedulesContainsMapId;
	public static final ScheduleUIServiceCommand CreateMappingScheduleDeleteEntry;
	public static final ScheduleUIServiceCommand CreateMappingScheduleLoadParams;
	public static final ScheduleUIServiceCommand CreateMappingScheduleSaveEntry;
	public static final ScheduleUIServiceCommand CreateMappingScheduleSendData;
	public static final ScheduleUIServiceCommand CreateMappingScheduleViewClosed;
	public static final ScheduleUIServiceCommand CreateMappingScheduleViewOpened;
	public static final ScheduleUIServiceCommand CreateTeamingEntry;
	public static final ScheduleUIServiceCommand DeleteAllSchedulesWithMaps;
	public static final ScheduleUIServiceCommand MappingScheduleItemSwipe;
	public static final ScheduleUIServiceCommand MappingScheduleItemToggled;
	public static final ScheduleUIServiceCommand MappingScheduleLaunchCreateSchedule;
	public static final ScheduleUIServiceCommand MappingScheduleViewClosed;
	public static final ScheduleUIServiceCommand MappingScheduleViewOpened;
	public static final ScheduleUIServiceCommand SimpleScheduleItemClick;
	public static final ScheduleUIServiceCommand SimpleScheduleUpdateMap;
	public static final ScheduleUIServiceCommand SimpleScheduleViewClosed;
	public static final ScheduleUIServiceCommand SimpleScheduleViewOpened;

	static 
	{
		DeleteAllSchedulesWithMaps = new ScheduleUIServiceCommand("DeleteAllSchedulesWithMaps", 0);
	//    0    0:new             #2   <Class ScheduleUIServiceCommand>
	//    1    3:dup             
	//    2    4:ldc1            #29  <String "DeleteAllSchedulesWithMaps">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #33  <Method void ScheduleUIServiceCommand(String, int)>
	//    5   10:putstatic       #35  <Field ScheduleUIServiceCommand DeleteAllSchedulesWithMaps>
		CheckIfSchedulesContainsMapId = new ScheduleUIServiceCommand("CheckIfSchedulesContainsMapId", 1);
	//    6   13:new             #2   <Class ScheduleUIServiceCommand>
	//    7   16:dup             
	//    8   17:ldc1            #36  <String "CheckIfSchedulesContainsMapId">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #33  <Method void ScheduleUIServiceCommand(String, int)>
	//   11   23:putstatic       #38  <Field ScheduleUIServiceCommand CheckIfSchedulesContainsMapId>
		MappingScheduleItemToggled = new ScheduleUIServiceCommand("MappingScheduleItemToggled", 2);
	//   12   26:new             #2   <Class ScheduleUIServiceCommand>
	//   13   29:dup             
	//   14   30:ldc1            #39  <String "MappingScheduleItemToggled">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #33  <Method void ScheduleUIServiceCommand(String, int)>
	//   17   36:putstatic       #41  <Field ScheduleUIServiceCommand MappingScheduleItemToggled>
		MappingScheduleItemSwipe = new ScheduleUIServiceCommand("MappingScheduleItemSwipe", 3);
	//   18   39:new             #2   <Class ScheduleUIServiceCommand>
	//   19   42:dup             
	//   20   43:ldc1            #42  <String "MappingScheduleItemSwipe">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #33  <Method void ScheduleUIServiceCommand(String, int)>
	//   23   49:putstatic       #44  <Field ScheduleUIServiceCommand MappingScheduleItemSwipe>
		MappingScheduleViewOpened = new ScheduleUIServiceCommand("MappingScheduleViewOpened", 4);
	//   24   52:new             #2   <Class ScheduleUIServiceCommand>
	//   25   55:dup             
	//   26   56:ldc1            #45  <String "MappingScheduleViewOpened">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #33  <Method void ScheduleUIServiceCommand(String, int)>
	//   29   62:putstatic       #47  <Field ScheduleUIServiceCommand MappingScheduleViewOpened>
		MappingScheduleViewClosed = new ScheduleUIServiceCommand("MappingScheduleViewClosed", 5);
	//   30   65:new             #2   <Class ScheduleUIServiceCommand>
	//   31   68:dup             
	//   32   69:ldc1            #48  <String "MappingScheduleViewClosed">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #33  <Method void ScheduleUIServiceCommand(String, int)>
	//   35   75:putstatic       #50  <Field ScheduleUIServiceCommand MappingScheduleViewClosed>
		MappingScheduleLaunchCreateSchedule = new ScheduleUIServiceCommand("MappingScheduleLaunchCreateSchedule", 6);
	//   36   78:new             #2   <Class ScheduleUIServiceCommand>
	//   37   81:dup             
	//   38   82:ldc1            #51  <String "MappingScheduleLaunchCreateSchedule">
	//   39   84:bipush          6
	//   40   86:invokespecial   #33  <Method void ScheduleUIServiceCommand(String, int)>
	//   41   89:putstatic       #53  <Field ScheduleUIServiceCommand MappingScheduleLaunchCreateSchedule>
		SimpleScheduleViewOpened = new ScheduleUIServiceCommand("SimpleScheduleViewOpened", 7);
	//   42   92:new             #2   <Class ScheduleUIServiceCommand>
	//   43   95:dup             
	//   44   96:ldc1            #54  <String "SimpleScheduleViewOpened">
	//   45   98:bipush          7
	//   46  100:invokespecial   #33  <Method void ScheduleUIServiceCommand(String, int)>
	//   47  103:putstatic       #56  <Field ScheduleUIServiceCommand SimpleScheduleViewOpened>
		SimpleScheduleViewClosed = new ScheduleUIServiceCommand("SimpleScheduleViewClosed", 8);
	//   48  106:new             #2   <Class ScheduleUIServiceCommand>
	//   49  109:dup             
	//   50  110:ldc1            #57  <String "SimpleScheduleViewClosed">
	//   51  112:bipush          8
	//   52  114:invokespecial   #33  <Method void ScheduleUIServiceCommand(String, int)>
	//   53  117:putstatic       #59  <Field ScheduleUIServiceCommand SimpleScheduleViewClosed>
		SimpleScheduleItemClick = new ScheduleUIServiceCommand("SimpleScheduleItemClick", 9);
	//   54  120:new             #2   <Class ScheduleUIServiceCommand>
	//   55  123:dup             
	//   56  124:ldc1            #60  <String "SimpleScheduleItemClick">
	//   57  126:bipush          9
	//   58  128:invokespecial   #33  <Method void ScheduleUIServiceCommand(String, int)>
	//   59  131:putstatic       #62  <Field ScheduleUIServiceCommand SimpleScheduleItemClick>
		SimpleScheduleUpdateMap = new ScheduleUIServiceCommand("SimpleScheduleUpdateMap", 10);
	//   60  134:new             #2   <Class ScheduleUIServiceCommand>
	//   61  137:dup             
	//   62  138:ldc1            #63  <String "SimpleScheduleUpdateMap">
	//   63  140:bipush          10
	//   64  142:invokespecial   #33  <Method void ScheduleUIServiceCommand(String, int)>
	//   65  145:putstatic       #65  <Field ScheduleUIServiceCommand SimpleScheduleUpdateMap>
		CreateMappingScheduleViewOpened = new ScheduleUIServiceCommand("CreateMappingScheduleViewOpened", 11);
	//   66  148:new             #2   <Class ScheduleUIServiceCommand>
	//   67  151:dup             
	//   68  152:ldc1            #66  <String "CreateMappingScheduleViewOpened">
	//   69  154:bipush          11
	//   70  156:invokespecial   #33  <Method void ScheduleUIServiceCommand(String, int)>
	//   71  159:putstatic       #68  <Field ScheduleUIServiceCommand CreateMappingScheduleViewOpened>
		CreateMappingScheduleViewClosed = new ScheduleUIServiceCommand("CreateMappingScheduleViewClosed", 12);
	//   72  162:new             #2   <Class ScheduleUIServiceCommand>
	//   73  165:dup             
	//   74  166:ldc1            #69  <String "CreateMappingScheduleViewClosed">
	//   75  168:bipush          12
	//   76  170:invokespecial   #33  <Method void ScheduleUIServiceCommand(String, int)>
	//   77  173:putstatic       #71  <Field ScheduleUIServiceCommand CreateMappingScheduleViewClosed>
		CreateMappingScheduleLoadParams = new ScheduleUIServiceCommand("CreateMappingScheduleLoadParams", 13);
	//   78  176:new             #2   <Class ScheduleUIServiceCommand>
	//   79  179:dup             
	//   80  180:ldc1            #72  <String "CreateMappingScheduleLoadParams">
	//   81  182:bipush          13
	//   82  184:invokespecial   #33  <Method void ScheduleUIServiceCommand(String, int)>
	//   83  187:putstatic       #74  <Field ScheduleUIServiceCommand CreateMappingScheduleLoadParams>
		CreateMappingScheduleDeleteEntry = new ScheduleUIServiceCommand("CreateMappingScheduleDeleteEntry", 14);
	//   84  190:new             #2   <Class ScheduleUIServiceCommand>
	//   85  193:dup             
	//   86  194:ldc1            #75  <String "CreateMappingScheduleDeleteEntry">
	//   87  196:bipush          14
	//   88  198:invokespecial   #33  <Method void ScheduleUIServiceCommand(String, int)>
	//   89  201:putstatic       #77  <Field ScheduleUIServiceCommand CreateMappingScheduleDeleteEntry>
		CreateMappingScheduleSaveEntry = new ScheduleUIServiceCommand("CreateMappingScheduleSaveEntry", 15);
	//   90  204:new             #2   <Class ScheduleUIServiceCommand>
	//   91  207:dup             
	//   92  208:ldc1            #78  <String "CreateMappingScheduleSaveEntry">
	//   93  210:bipush          15
	//   94  212:invokespecial   #33  <Method void ScheduleUIServiceCommand(String, int)>
	//   95  215:putstatic       #80  <Field ScheduleUIServiceCommand CreateMappingScheduleSaveEntry>
		CreateMappingScheduleSendData = new ScheduleUIServiceCommand("CreateMappingScheduleSendData", 16);
	//   96  218:new             #2   <Class ScheduleUIServiceCommand>
	//   97  221:dup             
	//   98  222:ldc1            #81  <String "CreateMappingScheduleSendData">
	//   99  224:bipush          16
	//  100  226:invokespecial   #33  <Method void ScheduleUIServiceCommand(String, int)>
	//  101  229:putstatic       #83  <Field ScheduleUIServiceCommand CreateMappingScheduleSendData>
		CreateTeamingEntry = new ScheduleUIServiceCommand("CreateTeamingEntry", 17);
	//  102  232:new             #2   <Class ScheduleUIServiceCommand>
	//  103  235:dup             
	//  104  236:ldc1            #84  <String "CreateTeamingEntry">
	//  105  238:bipush          17
	//  106  240:invokespecial   #33  <Method void ScheduleUIServiceCommand(String, int)>
	//  107  243:putstatic       #86  <Field ScheduleUIServiceCommand CreateTeamingEntry>
		$VALUES = (new ScheduleUIServiceCommand[] {
			DeleteAllSchedulesWithMaps, CheckIfSchedulesContainsMapId, MappingScheduleItemToggled, MappingScheduleItemSwipe, MappingScheduleViewOpened, MappingScheduleViewClosed, MappingScheduleLaunchCreateSchedule, SimpleScheduleViewOpened, SimpleScheduleViewClosed, SimpleScheduleItemClick, 
			SimpleScheduleUpdateMap, CreateMappingScheduleViewOpened, CreateMappingScheduleViewClosed, CreateMappingScheduleLoadParams, CreateMappingScheduleDeleteEntry, CreateMappingScheduleSaveEntry, CreateMappingScheduleSendData, CreateTeamingEntry
		});
	//  108  246:bipush          18
	//  109  248:anewarray       ScheduleUIServiceCommand[]
	//  110  251:dup             
	//  111  252:iconst_0        
	//  112  253:getstatic       #35  <Field ScheduleUIServiceCommand DeleteAllSchedulesWithMaps>
	//  113  256:aastore         
	//  114  257:dup             
	//  115  258:iconst_1        
	//  116  259:getstatic       #38  <Field ScheduleUIServiceCommand CheckIfSchedulesContainsMapId>
	//  117  262:aastore         
	//  118  263:dup             
	//  119  264:iconst_2        
	//  120  265:getstatic       #41  <Field ScheduleUIServiceCommand MappingScheduleItemToggled>
	//  121  268:aastore         
	//  122  269:dup             
	//  123  270:iconst_3        
	//  124  271:getstatic       #44  <Field ScheduleUIServiceCommand MappingScheduleItemSwipe>
	//  125  274:aastore         
	//  126  275:dup             
	//  127  276:iconst_4        
	//  128  277:getstatic       #47  <Field ScheduleUIServiceCommand MappingScheduleViewOpened>
	//  129  280:aastore         
	//  130  281:dup             
	//  131  282:iconst_5        
	//  132  283:getstatic       #50  <Field ScheduleUIServiceCommand MappingScheduleViewClosed>
	//  133  286:aastore         
	//  134  287:dup             
	//  135  288:bipush          6
	//  136  290:getstatic       #53  <Field ScheduleUIServiceCommand MappingScheduleLaunchCreateSchedule>
	//  137  293:aastore         
	//  138  294:dup             
	//  139  295:bipush          7
	//  140  297:getstatic       #56  <Field ScheduleUIServiceCommand SimpleScheduleViewOpened>
	//  141  300:aastore         
	//  142  301:dup             
	//  143  302:bipush          8
	//  144  304:getstatic       #59  <Field ScheduleUIServiceCommand SimpleScheduleViewClosed>
	//  145  307:aastore         
	//  146  308:dup             
	//  147  309:bipush          9
	//  148  311:getstatic       #62  <Field ScheduleUIServiceCommand SimpleScheduleItemClick>
	//  149  314:aastore         
	//  150  315:dup             
	//  151  316:bipush          10
	//  152  318:getstatic       #65  <Field ScheduleUIServiceCommand SimpleScheduleUpdateMap>
	//  153  321:aastore         
	//  154  322:dup             
	//  155  323:bipush          11
	//  156  325:getstatic       #68  <Field ScheduleUIServiceCommand CreateMappingScheduleViewOpened>
	//  157  328:aastore         
	//  158  329:dup             
	//  159  330:bipush          12
	//  160  332:getstatic       #71  <Field ScheduleUIServiceCommand CreateMappingScheduleViewClosed>
	//  161  335:aastore         
	//  162  336:dup             
	//  163  337:bipush          13
	//  164  339:getstatic       #74  <Field ScheduleUIServiceCommand CreateMappingScheduleLoadParams>
	//  165  342:aastore         
	//  166  343:dup             
	//  167  344:bipush          14
	//  168  346:getstatic       #77  <Field ScheduleUIServiceCommand CreateMappingScheduleDeleteEntry>
	//  169  349:aastore         
	//  170  350:dup             
	//  171  351:bipush          15
	//  172  353:getstatic       #80  <Field ScheduleUIServiceCommand CreateMappingScheduleSaveEntry>
	//  173  356:aastore         
	//  174  357:dup             
	//  175  358:bipush          16
	//  176  360:getstatic       #83  <Field ScheduleUIServiceCommand CreateMappingScheduleSendData>
	//  177  363:aastore         
	//  178  364:dup             
	//  179  365:bipush          17
	//  180  367:getstatic       #86  <Field ScheduleUIServiceCommand CreateTeamingEntry>
	//  181  370:aastore         
	//  182  371:putstatic       #88  <Field ScheduleUIServiceCommand[] $VALUES>
	//* 183  374:return          
	}
}
