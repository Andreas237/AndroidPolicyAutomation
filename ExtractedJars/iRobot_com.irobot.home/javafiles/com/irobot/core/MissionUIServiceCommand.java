// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class MissionUIServiceCommand extends Enum
{

	private MissionUIServiceCommand(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #42  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static MissionUIServiceCommand valueOf(String s)
	{
		return (MissionUIServiceCommand)Enum.valueOf(com/irobot/core/MissionUIServiceCommand, s);
	//    0    0:ldc1            #2   <Class MissionUIServiceCommand>
	//    1    2:aload_0         
	//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MissionUIServiceCommand>
	//    4    9:areturn         
	}

	public static MissionUIServiceCommand[] values()
	{
		return (MissionUIServiceCommand[])((MissionUIServiceCommand []) ($VALUES)).clone();
	//    0    0:getstatic       #40  <Field MissionUIServiceCommand[] $VALUES>
	//    1    3:invokevirtual   #55  <Method Object _5B_Lcom.irobot.core.MissionUIServiceCommand_3B_.clone()>
	//    2    6:checkcast       #51  <Class MissionUIServiceCommand[]>
	//    3    9:areturn         
	}

	private static final MissionUIServiceCommand $VALUES[];
	public static final MissionUIServiceCommand DisableLogStream;
	public static final MissionUIServiceCommand EnableLogStream;
	public static final MissionUIServiceCommand EvacDockManualEvacuation;
	public static final MissionUIServiceCommand EvacDockQueryStatus;
	public static final MissionUIServiceCommand EvacDockTourSeen;
	public static final MissionUIServiceCommand MissionAction;

	static 
	{
		MissionAction = new MissionUIServiceCommand("MissionAction", 0);
	//    0    0:new             #2   <Class MissionUIServiceCommand>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "MissionAction">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void MissionUIServiceCommand(String, int)>
	//    5   10:putstatic       #23  <Field MissionUIServiceCommand MissionAction>
		EvacDockTourSeen = new MissionUIServiceCommand("EvacDockTourSeen", 1);
	//    6   13:new             #2   <Class MissionUIServiceCommand>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "EvacDockTourSeen">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void MissionUIServiceCommand(String, int)>
	//   11   23:putstatic       #26  <Field MissionUIServiceCommand EvacDockTourSeen>
		EvacDockQueryStatus = new MissionUIServiceCommand("EvacDockQueryStatus", 2);
	//   12   26:new             #2   <Class MissionUIServiceCommand>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "EvacDockQueryStatus">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void MissionUIServiceCommand(String, int)>
	//   17   36:putstatic       #29  <Field MissionUIServiceCommand EvacDockQueryStatus>
		EvacDockManualEvacuation = new MissionUIServiceCommand("EvacDockManualEvacuation", 3);
	//   18   39:new             #2   <Class MissionUIServiceCommand>
	//   19   42:dup             
	//   20   43:ldc1            #30  <String "EvacDockManualEvacuation">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #21  <Method void MissionUIServiceCommand(String, int)>
	//   23   49:putstatic       #32  <Field MissionUIServiceCommand EvacDockManualEvacuation>
		EnableLogStream = new MissionUIServiceCommand("EnableLogStream", 4);
	//   24   52:new             #2   <Class MissionUIServiceCommand>
	//   25   55:dup             
	//   26   56:ldc1            #33  <String "EnableLogStream">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #21  <Method void MissionUIServiceCommand(String, int)>
	//   29   62:putstatic       #35  <Field MissionUIServiceCommand EnableLogStream>
		DisableLogStream = new MissionUIServiceCommand("DisableLogStream", 5);
	//   30   65:new             #2   <Class MissionUIServiceCommand>
	//   31   68:dup             
	//   32   69:ldc1            #36  <String "DisableLogStream">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #21  <Method void MissionUIServiceCommand(String, int)>
	//   35   75:putstatic       #38  <Field MissionUIServiceCommand DisableLogStream>
		$VALUES = (new MissionUIServiceCommand[] {
			MissionAction, EvacDockTourSeen, EvacDockQueryStatus, EvacDockManualEvacuation, EnableLogStream, DisableLogStream
		});
	//   36   78:bipush          6
	//   37   80:anewarray       MissionUIServiceCommand[]
	//   38   83:dup             
	//   39   84:iconst_0        
	//   40   85:getstatic       #23  <Field MissionUIServiceCommand MissionAction>
	//   41   88:aastore         
	//   42   89:dup             
	//   43   90:iconst_1        
	//   44   91:getstatic       #26  <Field MissionUIServiceCommand EvacDockTourSeen>
	//   45   94:aastore         
	//   46   95:dup             
	//   47   96:iconst_2        
	//   48   97:getstatic       #29  <Field MissionUIServiceCommand EvacDockQueryStatus>
	//   49  100:aastore         
	//   50  101:dup             
	//   51  102:iconst_3        
	//   52  103:getstatic       #32  <Field MissionUIServiceCommand EvacDockManualEvacuation>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_4        
	//   56  109:getstatic       #35  <Field MissionUIServiceCommand EnableLogStream>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_5        
	//   60  115:getstatic       #38  <Field MissionUIServiceCommand DisableLogStream>
	//   61  118:aastore         
	//   62  119:putstatic       #40  <Field MissionUIServiceCommand[] $VALUES>
	//*  63  122:return          
	}
}
