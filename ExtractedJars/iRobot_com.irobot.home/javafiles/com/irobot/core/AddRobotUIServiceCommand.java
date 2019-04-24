// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class AddRobotUIServiceCommand extends Enum
{

	private AddRobotUIServiceCommand(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #30  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static AddRobotUIServiceCommand valueOf(String s)
	{
		return (AddRobotUIServiceCommand)Enum.valueOf(com/irobot/core/AddRobotUIServiceCommand, s);
	//    0    0:ldc1            #2   <Class AddRobotUIServiceCommand>
	//    1    2:aload_0         
	//    2    3:invokestatic    #36  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AddRobotUIServiceCommand>
	//    4    9:areturn         
	}

	public static AddRobotUIServiceCommand[] values()
	{
		return (AddRobotUIServiceCommand[])((AddRobotUIServiceCommand []) ($VALUES)).clone();
	//    0    0:getstatic       #28  <Field AddRobotUIServiceCommand[] $VALUES>
	//    1    3:invokevirtual   #43  <Method Object _5B_Lcom.irobot.core.AddRobotUIServiceCommand_3B_.clone()>
	//    2    6:checkcast       #39  <Class AddRobotUIServiceCommand[]>
	//    3    9:areturn         
	}

	private static final AddRobotUIServiceCommand $VALUES[];
	public static final AddRobotUIServiceCommand Cancel;
	public static final AddRobotUIServiceCommand Start;
	public static final AddRobotUIServiceCommand UpdateData;

	static 
	{
		Start = new AddRobotUIServiceCommand("Start", 0);
	//    0    0:new             #2   <Class AddRobotUIServiceCommand>
	//    1    3:dup             
	//    2    4:ldc1            #14  <String "Start">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #18  <Method void AddRobotUIServiceCommand(String, int)>
	//    5   10:putstatic       #20  <Field AddRobotUIServiceCommand Start>
		Cancel = new AddRobotUIServiceCommand("Cancel", 1);
	//    6   13:new             #2   <Class AddRobotUIServiceCommand>
	//    7   16:dup             
	//    8   17:ldc1            #21  <String "Cancel">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #18  <Method void AddRobotUIServiceCommand(String, int)>
	//   11   23:putstatic       #23  <Field AddRobotUIServiceCommand Cancel>
		UpdateData = new AddRobotUIServiceCommand("UpdateData", 2);
	//   12   26:new             #2   <Class AddRobotUIServiceCommand>
	//   13   29:dup             
	//   14   30:ldc1            #24  <String "UpdateData">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #18  <Method void AddRobotUIServiceCommand(String, int)>
	//   17   36:putstatic       #26  <Field AddRobotUIServiceCommand UpdateData>
		$VALUES = (new AddRobotUIServiceCommand[] {
			Start, Cancel, UpdateData
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       AddRobotUIServiceCommand[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #20  <Field AddRobotUIServiceCommand Start>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #23  <Field AddRobotUIServiceCommand Cancel>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #26  <Field AddRobotUIServiceCommand UpdateData>
	//   31   60:aastore         
	//   32   61:putstatic       #28  <Field AddRobotUIServiceCommand[] $VALUES>
	//*  33   64:return          
	}
}
