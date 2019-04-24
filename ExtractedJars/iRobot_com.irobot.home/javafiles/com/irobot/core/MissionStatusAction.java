// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class MissionStatusAction extends Enum
{

	private MissionStatusAction(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #62  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static MissionStatusAction valueOf(String s)
	{
		return (MissionStatusAction)Enum.valueOf(com/irobot/core/MissionStatusAction, s);
	//    0    0:ldc1            #2   <Class MissionStatusAction>
	//    1    2:aload_0         
	//    2    3:invokestatic    #68  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MissionStatusAction>
	//    4    9:areturn         
	}

	public static MissionStatusAction[] values()
	{
		return (MissionStatusAction[])((MissionStatusAction []) ($VALUES)).clone();
	//    0    0:getstatic       #60  <Field MissionStatusAction[] $VALUES>
	//    1    3:invokevirtual   #75  <Method Object _5B_Lcom.irobot.core.MissionStatusAction_3B_.clone()>
	//    2    6:checkcast       #71  <Class MissionStatusAction[]>
	//    3    9:areturn         
	}

	private static final MissionStatusAction $VALUES[];
	public static final MissionStatusAction Cancel;
	public static final MissionStatusAction Custom;
	public static final MissionStatusAction EndJob;
	public static final MissionStatusAction EndNow;
	public static final MissionStatusAction InjectVirtualStatus;
	public static final MissionStatusAction Resume;
	public static final MissionStatusAction ReturnToDock;
	public static final MissionStatusAction StartMission;
	public static final MissionStatusAction StartTraining;
	public static final MissionStatusAction TimedOut;
	public static final MissionStatusAction Unknown;

	static 
	{
		Custom = new MissionStatusAction("Custom", 0);
	//    0    0:new             #2   <Class MissionStatusAction>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "Custom">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #26  <Method void MissionStatusAction(String, int)>
	//    5   10:putstatic       #28  <Field MissionStatusAction Custom>
		StartMission = new MissionStatusAction("StartMission", 1);
	//    6   13:new             #2   <Class MissionStatusAction>
	//    7   16:dup             
	//    8   17:ldc1            #29  <String "StartMission">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #26  <Method void MissionStatusAction(String, int)>
	//   11   23:putstatic       #31  <Field MissionStatusAction StartMission>
		Resume = new MissionStatusAction("Resume", 2);
	//   12   26:new             #2   <Class MissionStatusAction>
	//   13   29:dup             
	//   14   30:ldc1            #32  <String "Resume">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #26  <Method void MissionStatusAction(String, int)>
	//   17   36:putstatic       #34  <Field MissionStatusAction Resume>
		EndJob = new MissionStatusAction("EndJob", 3);
	//   18   39:new             #2   <Class MissionStatusAction>
	//   19   42:dup             
	//   20   43:ldc1            #35  <String "EndJob">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #26  <Method void MissionStatusAction(String, int)>
	//   23   49:putstatic       #37  <Field MissionStatusAction EndJob>
		ReturnToDock = new MissionStatusAction("ReturnToDock", 4);
	//   24   52:new             #2   <Class MissionStatusAction>
	//   25   55:dup             
	//   26   56:ldc1            #38  <String "ReturnToDock">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #26  <Method void MissionStatusAction(String, int)>
	//   29   62:putstatic       #40  <Field MissionStatusAction ReturnToDock>
		EndNow = new MissionStatusAction("EndNow", 5);
	//   30   65:new             #2   <Class MissionStatusAction>
	//   31   68:dup             
	//   32   69:ldc1            #41  <String "EndNow">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #26  <Method void MissionStatusAction(String, int)>
	//   35   75:putstatic       #43  <Field MissionStatusAction EndNow>
		TimedOut = new MissionStatusAction("TimedOut", 6);
	//   36   78:new             #2   <Class MissionStatusAction>
	//   37   81:dup             
	//   38   82:ldc1            #44  <String "TimedOut">
	//   39   84:bipush          6
	//   40   86:invokespecial   #26  <Method void MissionStatusAction(String, int)>
	//   41   89:putstatic       #46  <Field MissionStatusAction TimedOut>
		StartTraining = new MissionStatusAction("StartTraining", 7);
	//   42   92:new             #2   <Class MissionStatusAction>
	//   43   95:dup             
	//   44   96:ldc1            #47  <String "StartTraining">
	//   45   98:bipush          7
	//   46  100:invokespecial   #26  <Method void MissionStatusAction(String, int)>
	//   47  103:putstatic       #49  <Field MissionStatusAction StartTraining>
		InjectVirtualStatus = new MissionStatusAction("InjectVirtualStatus", 8);
	//   48  106:new             #2   <Class MissionStatusAction>
	//   49  109:dup             
	//   50  110:ldc1            #50  <String "InjectVirtualStatus">
	//   51  112:bipush          8
	//   52  114:invokespecial   #26  <Method void MissionStatusAction(String, int)>
	//   53  117:putstatic       #52  <Field MissionStatusAction InjectVirtualStatus>
		Cancel = new MissionStatusAction("Cancel", 9);
	//   54  120:new             #2   <Class MissionStatusAction>
	//   55  123:dup             
	//   56  124:ldc1            #53  <String "Cancel">
	//   57  126:bipush          9
	//   58  128:invokespecial   #26  <Method void MissionStatusAction(String, int)>
	//   59  131:putstatic       #55  <Field MissionStatusAction Cancel>
		Unknown = new MissionStatusAction("Unknown", 10);
	//   60  134:new             #2   <Class MissionStatusAction>
	//   61  137:dup             
	//   62  138:ldc1            #56  <String "Unknown">
	//   63  140:bipush          10
	//   64  142:invokespecial   #26  <Method void MissionStatusAction(String, int)>
	//   65  145:putstatic       #58  <Field MissionStatusAction Unknown>
		$VALUES = (new MissionStatusAction[] {
			Custom, StartMission, Resume, EndJob, ReturnToDock, EndNow, TimedOut, StartTraining, InjectVirtualStatus, Cancel, 
			Unknown
		});
	//   66  148:bipush          11
	//   67  150:anewarray       MissionStatusAction[]
	//   68  153:dup             
	//   69  154:iconst_0        
	//   70  155:getstatic       #28  <Field MissionStatusAction Custom>
	//   71  158:aastore         
	//   72  159:dup             
	//   73  160:iconst_1        
	//   74  161:getstatic       #31  <Field MissionStatusAction StartMission>
	//   75  164:aastore         
	//   76  165:dup             
	//   77  166:iconst_2        
	//   78  167:getstatic       #34  <Field MissionStatusAction Resume>
	//   79  170:aastore         
	//   80  171:dup             
	//   81  172:iconst_3        
	//   82  173:getstatic       #37  <Field MissionStatusAction EndJob>
	//   83  176:aastore         
	//   84  177:dup             
	//   85  178:iconst_4        
	//   86  179:getstatic       #40  <Field MissionStatusAction ReturnToDock>
	//   87  182:aastore         
	//   88  183:dup             
	//   89  184:iconst_5        
	//   90  185:getstatic       #43  <Field MissionStatusAction EndNow>
	//   91  188:aastore         
	//   92  189:dup             
	//   93  190:bipush          6
	//   94  192:getstatic       #46  <Field MissionStatusAction TimedOut>
	//   95  195:aastore         
	//   96  196:dup             
	//   97  197:bipush          7
	//   98  199:getstatic       #49  <Field MissionStatusAction StartTraining>
	//   99  202:aastore         
	//  100  203:dup             
	//  101  204:bipush          8
	//  102  206:getstatic       #52  <Field MissionStatusAction InjectVirtualStatus>
	//  103  209:aastore         
	//  104  210:dup             
	//  105  211:bipush          9
	//  106  213:getstatic       #55  <Field MissionStatusAction Cancel>
	//  107  216:aastore         
	//  108  217:dup             
	//  109  218:bipush          10
	//  110  220:getstatic       #58  <Field MissionStatusAction Unknown>
	//  111  223:aastore         
	//  112  224:putstatic       #60  <Field MissionStatusAction[] $VALUES>
	//* 113  227:return          
	}
}
