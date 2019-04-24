// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class RoombaSetupStep extends Enum
{

	private RoombaSetupStep(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #50  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static RoombaSetupStep valueOf(String s)
	{
		return (RoombaSetupStep)Enum.valueOf(com/irobot/core/RoombaSetupStep, s);
	//    0    0:ldc1            #2   <Class RoombaSetupStep>
	//    1    2:aload_0         
	//    2    3:invokestatic    #56  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class RoombaSetupStep>
	//    4    9:areturn         
	}

	public static RoombaSetupStep[] values()
	{
		return (RoombaSetupStep[])((RoombaSetupStep []) ($VALUES)).clone();
	//    0    0:getstatic       #48  <Field RoombaSetupStep[] $VALUES>
	//    1    3:invokevirtual   #63  <Method Object _5B_Lcom.irobot.core.RoombaSetupStep_3B_.clone()>
	//    2    6:checkcast       #59  <Class RoombaSetupStep[]>
	//    3    9:areturn         
	}

	private static final RoombaSetupStep $VALUES[];
	public static final RoombaSetupStep ActivateRoomba;
	public static final RoombaSetupStep AdvancedWifiInfo;
	public static final RoombaSetupStep ConnectToRoomba;
	public static final RoombaSetupStep CustomerRegistration;
	public static final RoombaSetupStep DockPlacement;
	public static final RoombaSetupStep Provisioning;
	public static final RoombaSetupStep SetupChecklist;
	public static final RoombaSetupStep WifiInfo;

	static 
	{
		SetupChecklist = new RoombaSetupStep("SetupChecklist", 0);
	//    0    0:new             #2   <Class RoombaSetupStep>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "SetupChecklist">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void RoombaSetupStep(String, int)>
	//    5   10:putstatic       #25  <Field RoombaSetupStep SetupChecklist>
		DockPlacement = new RoombaSetupStep("DockPlacement", 1);
	//    6   13:new             #2   <Class RoombaSetupStep>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "DockPlacement">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void RoombaSetupStep(String, int)>
	//   11   23:putstatic       #28  <Field RoombaSetupStep DockPlacement>
		WifiInfo = new RoombaSetupStep("WifiInfo", 2);
	//   12   26:new             #2   <Class RoombaSetupStep>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "WifiInfo">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void RoombaSetupStep(String, int)>
	//   17   36:putstatic       #31  <Field RoombaSetupStep WifiInfo>
		AdvancedWifiInfo = new RoombaSetupStep("AdvancedWifiInfo", 3);
	//   18   39:new             #2   <Class RoombaSetupStep>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "AdvancedWifiInfo">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void RoombaSetupStep(String, int)>
	//   23   49:putstatic       #34  <Field RoombaSetupStep AdvancedWifiInfo>
		ActivateRoomba = new RoombaSetupStep("ActivateRoomba", 4);
	//   24   52:new             #2   <Class RoombaSetupStep>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "ActivateRoomba">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void RoombaSetupStep(String, int)>
	//   29   62:putstatic       #37  <Field RoombaSetupStep ActivateRoomba>
		ConnectToRoomba = new RoombaSetupStep("ConnectToRoomba", 5);
	//   30   65:new             #2   <Class RoombaSetupStep>
	//   31   68:dup             
	//   32   69:ldc1            #38  <String "ConnectToRoomba">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #23  <Method void RoombaSetupStep(String, int)>
	//   35   75:putstatic       #40  <Field RoombaSetupStep ConnectToRoomba>
		Provisioning = new RoombaSetupStep("Provisioning", 6);
	//   36   78:new             #2   <Class RoombaSetupStep>
	//   37   81:dup             
	//   38   82:ldc1            #41  <String "Provisioning">
	//   39   84:bipush          6
	//   40   86:invokespecial   #23  <Method void RoombaSetupStep(String, int)>
	//   41   89:putstatic       #43  <Field RoombaSetupStep Provisioning>
		CustomerRegistration = new RoombaSetupStep("CustomerRegistration", 7);
	//   42   92:new             #2   <Class RoombaSetupStep>
	//   43   95:dup             
	//   44   96:ldc1            #44  <String "CustomerRegistration">
	//   45   98:bipush          7
	//   46  100:invokespecial   #23  <Method void RoombaSetupStep(String, int)>
	//   47  103:putstatic       #46  <Field RoombaSetupStep CustomerRegistration>
		$VALUES = (new RoombaSetupStep[] {
			SetupChecklist, DockPlacement, WifiInfo, AdvancedWifiInfo, ActivateRoomba, ConnectToRoomba, Provisioning, CustomerRegistration
		});
	//   48  106:bipush          8
	//   49  108:anewarray       RoombaSetupStep[]
	//   50  111:dup             
	//   51  112:iconst_0        
	//   52  113:getstatic       #25  <Field RoombaSetupStep SetupChecklist>
	//   53  116:aastore         
	//   54  117:dup             
	//   55  118:iconst_1        
	//   56  119:getstatic       #28  <Field RoombaSetupStep DockPlacement>
	//   57  122:aastore         
	//   58  123:dup             
	//   59  124:iconst_2        
	//   60  125:getstatic       #31  <Field RoombaSetupStep WifiInfo>
	//   61  128:aastore         
	//   62  129:dup             
	//   63  130:iconst_3        
	//   64  131:getstatic       #34  <Field RoombaSetupStep AdvancedWifiInfo>
	//   65  134:aastore         
	//   66  135:dup             
	//   67  136:iconst_4        
	//   68  137:getstatic       #37  <Field RoombaSetupStep ActivateRoomba>
	//   69  140:aastore         
	//   70  141:dup             
	//   71  142:iconst_5        
	//   72  143:getstatic       #40  <Field RoombaSetupStep ConnectToRoomba>
	//   73  146:aastore         
	//   74  147:dup             
	//   75  148:bipush          6
	//   76  150:getstatic       #43  <Field RoombaSetupStep Provisioning>
	//   77  153:aastore         
	//   78  154:dup             
	//   79  155:bipush          7
	//   80  157:getstatic       #46  <Field RoombaSetupStep CustomerRegistration>
	//   81  160:aastore         
	//   82  161:putstatic       #48  <Field RoombaSetupStep[] $VALUES>
	//*  83  164:return          
	}
}
