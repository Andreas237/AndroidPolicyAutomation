// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class ProvisioningType extends Enum
{

	private ProvisioningType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #38  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static ProvisioningType valueOf(String s)
	{
		return (ProvisioningType)Enum.valueOf(com/irobot/core/ProvisioningType, s);
	//    0    0:ldc1            #2   <Class ProvisioningType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #44  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ProvisioningType>
	//    4    9:areturn         
	}

	public static ProvisioningType[] values()
	{
		return (ProvisioningType[])((ProvisioningType []) ($VALUES)).clone();
	//    0    0:getstatic       #36  <Field ProvisioningType[] $VALUES>
	//    1    3:invokevirtual   #51  <Method Object _5B_Lcom.irobot.core.ProvisioningType_3B_.clone()>
	//    2    6:checkcast       #47  <Class ProvisioningType[]>
	//    3    9:areturn         
	}

	private static final ProvisioningType $VALUES[];
	public static final ProvisioningType Ble;
	public static final ProvisioningType None;
	public static final ProvisioningType WifiV1;
	public static final ProvisioningType WifiV2;
	public static final ProvisioningType WifiV3;

	static 
	{
		None = new ProvisioningType("None", 0);
	//    0    0:new             #2   <Class ProvisioningType>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "None">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void ProvisioningType(String, int)>
	//    5   10:putstatic       #22  <Field ProvisioningType None>
		WifiV1 = new ProvisioningType("WifiV1", 1);
	//    6   13:new             #2   <Class ProvisioningType>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "WifiV1">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void ProvisioningType(String, int)>
	//   11   23:putstatic       #25  <Field ProvisioningType WifiV1>
		WifiV2 = new ProvisioningType("WifiV2", 2);
	//   12   26:new             #2   <Class ProvisioningType>
	//   13   29:dup             
	//   14   30:ldc1            #26  <String "WifiV2">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #20  <Method void ProvisioningType(String, int)>
	//   17   36:putstatic       #28  <Field ProvisioningType WifiV2>
		Ble = new ProvisioningType("Ble", 3);
	//   18   39:new             #2   <Class ProvisioningType>
	//   19   42:dup             
	//   20   43:ldc1            #29  <String "Ble">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #20  <Method void ProvisioningType(String, int)>
	//   23   49:putstatic       #31  <Field ProvisioningType Ble>
		WifiV3 = new ProvisioningType("WifiV3", 4);
	//   24   52:new             #2   <Class ProvisioningType>
	//   25   55:dup             
	//   26   56:ldc1            #32  <String "WifiV3">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #20  <Method void ProvisioningType(String, int)>
	//   29   62:putstatic       #34  <Field ProvisioningType WifiV3>
		$VALUES = (new ProvisioningType[] {
			None, WifiV1, WifiV2, Ble, WifiV3
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       ProvisioningType[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #22  <Field ProvisioningType None>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #25  <Field ProvisioningType WifiV1>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #28  <Field ProvisioningType WifiV2>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #31  <Field ProvisioningType Ble>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #34  <Field ProvisioningType WifiV3>
	//   51   98:aastore         
	//   52   99:putstatic       #36  <Field ProvisioningType[] $VALUES>
	//*  53  102:return          
	}
}
