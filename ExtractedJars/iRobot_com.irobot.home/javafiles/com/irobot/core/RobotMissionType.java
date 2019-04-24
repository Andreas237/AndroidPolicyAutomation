// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class RobotMissionType extends Enum
{

	private RobotMissionType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #54  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static RobotMissionType valueOf(String s)
	{
		return (RobotMissionType)Enum.valueOf(com/irobot/core/RobotMissionType, s);
	//    0    0:ldc1            #2   <Class RobotMissionType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #60  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class RobotMissionType>
	//    4    9:areturn         
	}

	public static RobotMissionType[] values()
	{
		return (RobotMissionType[])((RobotMissionType []) ($VALUES)).clone();
	//    0    0:getstatic       #52  <Field RobotMissionType[] $VALUES>
	//    1    3:invokevirtual   #67  <Method Object _5B_Lcom.irobot.core.RobotMissionType_3B_.clone()>
	//    2    6:checkcast       #63  <Class RobotMissionType[]>
	//    3    9:areturn         
	}

	private static final RobotMissionType $VALUES[];
	public static final RobotMissionType Clean;
	public static final RobotMissionType Dock;
	public static final RobotMissionType DockUpgrade;
	public static final RobotMissionType Evac;
	public static final RobotMissionType Manual;
	public static final RobotMissionType None;
	public static final RobotMissionType Quick;
	public static final RobotMissionType Spot;
	public static final RobotMissionType Train;

	static 
	{
		None = new RobotMissionType("None", 0);
	//    0    0:new             #2   <Class RobotMissionType>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "None">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #24  <Method void RobotMissionType(String, int)>
	//    5   10:putstatic       #26  <Field RobotMissionType None>
		Clean = new RobotMissionType("Clean", 1);
	//    6   13:new             #2   <Class RobotMissionType>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "Clean">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #24  <Method void RobotMissionType(String, int)>
	//   11   23:putstatic       #29  <Field RobotMissionType Clean>
		Spot = new RobotMissionType("Spot", 2);
	//   12   26:new             #2   <Class RobotMissionType>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "Spot">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #24  <Method void RobotMissionType(String, int)>
	//   17   36:putstatic       #32  <Field RobotMissionType Spot>
		Quick = new RobotMissionType("Quick", 3);
	//   18   39:new             #2   <Class RobotMissionType>
	//   19   42:dup             
	//   20   43:ldc1            #33  <String "Quick">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #24  <Method void RobotMissionType(String, int)>
	//   23   49:putstatic       #35  <Field RobotMissionType Quick>
		Dock = new RobotMissionType("Dock", 4);
	//   24   52:new             #2   <Class RobotMissionType>
	//   25   55:dup             
	//   26   56:ldc1            #36  <String "Dock">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #24  <Method void RobotMissionType(String, int)>
	//   29   62:putstatic       #38  <Field RobotMissionType Dock>
		Manual = new RobotMissionType("Manual", 5);
	//   30   65:new             #2   <Class RobotMissionType>
	//   31   68:dup             
	//   32   69:ldc1            #39  <String "Manual">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #24  <Method void RobotMissionType(String, int)>
	//   35   75:putstatic       #41  <Field RobotMissionType Manual>
		Evac = new RobotMissionType("Evac", 6);
	//   36   78:new             #2   <Class RobotMissionType>
	//   37   81:dup             
	//   38   82:ldc1            #42  <String "Evac">
	//   39   84:bipush          6
	//   40   86:invokespecial   #24  <Method void RobotMissionType(String, int)>
	//   41   89:putstatic       #44  <Field RobotMissionType Evac>
		DockUpgrade = new RobotMissionType("DockUpgrade", 7);
	//   42   92:new             #2   <Class RobotMissionType>
	//   43   95:dup             
	//   44   96:ldc1            #45  <String "DockUpgrade">
	//   45   98:bipush          7
	//   46  100:invokespecial   #24  <Method void RobotMissionType(String, int)>
	//   47  103:putstatic       #47  <Field RobotMissionType DockUpgrade>
		Train = new RobotMissionType("Train", 8);
	//   48  106:new             #2   <Class RobotMissionType>
	//   49  109:dup             
	//   50  110:ldc1            #48  <String "Train">
	//   51  112:bipush          8
	//   52  114:invokespecial   #24  <Method void RobotMissionType(String, int)>
	//   53  117:putstatic       #50  <Field RobotMissionType Train>
		$VALUES = (new RobotMissionType[] {
			None, Clean, Spot, Quick, Dock, Manual, Evac, DockUpgrade, Train
		});
	//   54  120:bipush          9
	//   55  122:anewarray       RobotMissionType[]
	//   56  125:dup             
	//   57  126:iconst_0        
	//   58  127:getstatic       #26  <Field RobotMissionType None>
	//   59  130:aastore         
	//   60  131:dup             
	//   61  132:iconst_1        
	//   62  133:getstatic       #29  <Field RobotMissionType Clean>
	//   63  136:aastore         
	//   64  137:dup             
	//   65  138:iconst_2        
	//   66  139:getstatic       #32  <Field RobotMissionType Spot>
	//   67  142:aastore         
	//   68  143:dup             
	//   69  144:iconst_3        
	//   70  145:getstatic       #35  <Field RobotMissionType Quick>
	//   71  148:aastore         
	//   72  149:dup             
	//   73  150:iconst_4        
	//   74  151:getstatic       #38  <Field RobotMissionType Dock>
	//   75  154:aastore         
	//   76  155:dup             
	//   77  156:iconst_5        
	//   78  157:getstatic       #41  <Field RobotMissionType Manual>
	//   79  160:aastore         
	//   80  161:dup             
	//   81  162:bipush          6
	//   82  164:getstatic       #44  <Field RobotMissionType Evac>
	//   83  167:aastore         
	//   84  168:dup             
	//   85  169:bipush          7
	//   86  171:getstatic       #47  <Field RobotMissionType DockUpgrade>
	//   87  174:aastore         
	//   88  175:dup             
	//   89  176:bipush          8
	//   90  178:getstatic       #50  <Field RobotMissionType Train>
	//   91  181:aastore         
	//   92  182:putstatic       #52  <Field RobotMissionType[] $VALUES>
	//*  93  185:return          
	}
}
