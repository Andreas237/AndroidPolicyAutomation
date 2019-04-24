// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class OperatingSystemType extends Enum
{

	private OperatingSystemType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #26  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static OperatingSystemType valueOf(String s)
	{
		return (OperatingSystemType)Enum.valueOf(com/irobot/core/OperatingSystemType, s);
	//    0    0:ldc1            #2   <Class OperatingSystemType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #32  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class OperatingSystemType>
	//    4    9:areturn         
	}

	public static OperatingSystemType[] values()
	{
		return (OperatingSystemType[])((OperatingSystemType []) ($VALUES)).clone();
	//    0    0:getstatic       #24  <Field OperatingSystemType[] $VALUES>
	//    1    3:invokevirtual   #39  <Method Object _5B_Lcom.irobot.core.OperatingSystemType_3B_.clone()>
	//    2    6:checkcast       #35  <Class OperatingSystemType[]>
	//    3    9:areturn         
	}

	private static final OperatingSystemType $VALUES[];
	public static final OperatingSystemType Android;
	public static final OperatingSystemType Ios;

	static 
	{
		Android = new OperatingSystemType("Android", 0);
	//    0    0:new             #2   <Class OperatingSystemType>
	//    1    3:dup             
	//    2    4:ldc1            #13  <String "Android">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #17  <Method void OperatingSystemType(String, int)>
	//    5   10:putstatic       #19  <Field OperatingSystemType Android>
		Ios = new OperatingSystemType("Ios", 1);
	//    6   13:new             #2   <Class OperatingSystemType>
	//    7   16:dup             
	//    8   17:ldc1            #20  <String "Ios">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #17  <Method void OperatingSystemType(String, int)>
	//   11   23:putstatic       #22  <Field OperatingSystemType Ios>
		$VALUES = (new OperatingSystemType[] {
			Android, Ios
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       OperatingSystemType[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #19  <Field OperatingSystemType Android>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #22  <Field OperatingSystemType Ios>
	//   21   41:aastore         
	//   22   42:putstatic       #24  <Field OperatingSystemType[] $VALUES>
	//*  23   45:return          
	}
}
