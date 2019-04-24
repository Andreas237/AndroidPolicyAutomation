// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class MissionMapDataType extends Enum
{

	private MissionMapDataType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #26  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static MissionMapDataType valueOf(String s)
	{
		return (MissionMapDataType)Enum.valueOf(com/irobot/core/MissionMapDataType, s);
	//    0    0:ldc1            #2   <Class MissionMapDataType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #32  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MissionMapDataType>
	//    4    9:areturn         
	}

	public static MissionMapDataType[] values()
	{
		return (MissionMapDataType[])((MissionMapDataType []) ($VALUES)).clone();
	//    0    0:getstatic       #24  <Field MissionMapDataType[] $VALUES>
	//    1    3:invokevirtual   #39  <Method Object _5B_Lcom.irobot.core.MissionMapDataType_3B_.clone()>
	//    2    6:checkcast       #35  <Class MissionMapDataType[]>
	//    3    9:areturn         
	}

	private static final MissionMapDataType $VALUES[];
	public static final MissionMapDataType Static;
	public static final MissionMapDataType Umf;

	static 
	{
		Static = new MissionMapDataType("Static", 0);
	//    0    0:new             #2   <Class MissionMapDataType>
	//    1    3:dup             
	//    2    4:ldc1            #13  <String "Static">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #17  <Method void MissionMapDataType(String, int)>
	//    5   10:putstatic       #19  <Field MissionMapDataType Static>
		Umf = new MissionMapDataType("Umf", 1);
	//    6   13:new             #2   <Class MissionMapDataType>
	//    7   16:dup             
	//    8   17:ldc1            #20  <String "Umf">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #17  <Method void MissionMapDataType(String, int)>
	//   11   23:putstatic       #22  <Field MissionMapDataType Umf>
		$VALUES = (new MissionMapDataType[] {
			Static, Umf
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       MissionMapDataType[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #19  <Field MissionMapDataType Static>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #22  <Field MissionMapDataType Umf>
	//   21   41:aastore         
	//   22   42:putstatic       #24  <Field MissionMapDataType[] $VALUES>
	//*  23   45:return          
	}
}
