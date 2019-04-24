// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class AssetStatusType extends Enum
{

	private AssetStatusType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #62  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static AssetStatusType valueOf(String s)
	{
		return (AssetStatusType)Enum.valueOf(com/irobot/core/AssetStatusType, s);
	//    0    0:ldc1            #2   <Class AssetStatusType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #68  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AssetStatusType>
	//    4    9:areturn         
	}

	public static AssetStatusType[] values()
	{
		return (AssetStatusType[])((AssetStatusType []) ($VALUES)).clone();
	//    0    0:getstatic       #60  <Field AssetStatusType[] $VALUES>
	//    1    3:invokevirtual   #75  <Method Object _5B_Lcom.irobot.core.AssetStatusType_3B_.clone()>
	//    2    6:checkcast       #71  <Class AssetStatusType[]>
	//    3    9:areturn         
	}

	private static final AssetStatusType $VALUES[];
	public static final AssetStatusType BatteryLevel;
	public static final AssetStatusType BatteryType;
	public static final AssetStatusType BinFull;
	public static final AssetStatusType DockInfo;
	public static final AssetStatusType PadCategory;
	public static final AssetStatusType RegistrationDate;
	public static final AssetStatusType SerialNumber;
	public static final AssetStatusType Sku;
	public static final AssetStatusType SoftwareVersion;
	public static final AssetStatusType SoftwareVersionUpdateDate;
	public static final AssetStatusType TankLevel;

	static 
	{
		BatteryLevel = new AssetStatusType("BatteryLevel", 0);
	//    0    0:new             #2   <Class AssetStatusType>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "BatteryLevel">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #26  <Method void AssetStatusType(String, int)>
	//    5   10:putstatic       #28  <Field AssetStatusType BatteryLevel>
		BatteryType = new AssetStatusType("BatteryType", 1);
	//    6   13:new             #2   <Class AssetStatusType>
	//    7   16:dup             
	//    8   17:ldc1            #29  <String "BatteryType">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #26  <Method void AssetStatusType(String, int)>
	//   11   23:putstatic       #31  <Field AssetStatusType BatteryType>
		PadCategory = new AssetStatusType("PadCategory", 2);
	//   12   26:new             #2   <Class AssetStatusType>
	//   13   29:dup             
	//   14   30:ldc1            #32  <String "PadCategory">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #26  <Method void AssetStatusType(String, int)>
	//   17   36:putstatic       #34  <Field AssetStatusType PadCategory>
		Sku = new AssetStatusType("Sku", 3);
	//   18   39:new             #2   <Class AssetStatusType>
	//   19   42:dup             
	//   20   43:ldc1            #35  <String "Sku">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #26  <Method void AssetStatusType(String, int)>
	//   23   49:putstatic       #37  <Field AssetStatusType Sku>
		SoftwareVersion = new AssetStatusType("SoftwareVersion", 4);
	//   24   52:new             #2   <Class AssetStatusType>
	//   25   55:dup             
	//   26   56:ldc1            #38  <String "SoftwareVersion">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #26  <Method void AssetStatusType(String, int)>
	//   29   62:putstatic       #40  <Field AssetStatusType SoftwareVersion>
		SoftwareVersionUpdateDate = new AssetStatusType("SoftwareVersionUpdateDate", 5);
	//   30   65:new             #2   <Class AssetStatusType>
	//   31   68:dup             
	//   32   69:ldc1            #41  <String "SoftwareVersionUpdateDate">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #26  <Method void AssetStatusType(String, int)>
	//   35   75:putstatic       #43  <Field AssetStatusType SoftwareVersionUpdateDate>
		RegistrationDate = new AssetStatusType("RegistrationDate", 6);
	//   36   78:new             #2   <Class AssetStatusType>
	//   37   81:dup             
	//   38   82:ldc1            #44  <String "RegistrationDate">
	//   39   84:bipush          6
	//   40   86:invokespecial   #26  <Method void AssetStatusType(String, int)>
	//   41   89:putstatic       #46  <Field AssetStatusType RegistrationDate>
		SerialNumber = new AssetStatusType("SerialNumber", 7);
	//   42   92:new             #2   <Class AssetStatusType>
	//   43   95:dup             
	//   44   96:ldc1            #47  <String "SerialNumber">
	//   45   98:bipush          7
	//   46  100:invokespecial   #26  <Method void AssetStatusType(String, int)>
	//   47  103:putstatic       #49  <Field AssetStatusType SerialNumber>
		TankLevel = new AssetStatusType("TankLevel", 8);
	//   48  106:new             #2   <Class AssetStatusType>
	//   49  109:dup             
	//   50  110:ldc1            #50  <String "TankLevel">
	//   51  112:bipush          8
	//   52  114:invokespecial   #26  <Method void AssetStatusType(String, int)>
	//   53  117:putstatic       #52  <Field AssetStatusType TankLevel>
		DockInfo = new AssetStatusType("DockInfo", 9);
	//   54  120:new             #2   <Class AssetStatusType>
	//   55  123:dup             
	//   56  124:ldc1            #53  <String "DockInfo">
	//   57  126:bipush          9
	//   58  128:invokespecial   #26  <Method void AssetStatusType(String, int)>
	//   59  131:putstatic       #55  <Field AssetStatusType DockInfo>
		BinFull = new AssetStatusType("BinFull", 10);
	//   60  134:new             #2   <Class AssetStatusType>
	//   61  137:dup             
	//   62  138:ldc1            #56  <String "BinFull">
	//   63  140:bipush          10
	//   64  142:invokespecial   #26  <Method void AssetStatusType(String, int)>
	//   65  145:putstatic       #58  <Field AssetStatusType BinFull>
		$VALUES = (new AssetStatusType[] {
			BatteryLevel, BatteryType, PadCategory, Sku, SoftwareVersion, SoftwareVersionUpdateDate, RegistrationDate, SerialNumber, TankLevel, DockInfo, 
			BinFull
		});
	//   66  148:bipush          11
	//   67  150:anewarray       AssetStatusType[]
	//   68  153:dup             
	//   69  154:iconst_0        
	//   70  155:getstatic       #28  <Field AssetStatusType BatteryLevel>
	//   71  158:aastore         
	//   72  159:dup             
	//   73  160:iconst_1        
	//   74  161:getstatic       #31  <Field AssetStatusType BatteryType>
	//   75  164:aastore         
	//   76  165:dup             
	//   77  166:iconst_2        
	//   78  167:getstatic       #34  <Field AssetStatusType PadCategory>
	//   79  170:aastore         
	//   80  171:dup             
	//   81  172:iconst_3        
	//   82  173:getstatic       #37  <Field AssetStatusType Sku>
	//   83  176:aastore         
	//   84  177:dup             
	//   85  178:iconst_4        
	//   86  179:getstatic       #40  <Field AssetStatusType SoftwareVersion>
	//   87  182:aastore         
	//   88  183:dup             
	//   89  184:iconst_5        
	//   90  185:getstatic       #43  <Field AssetStatusType SoftwareVersionUpdateDate>
	//   91  188:aastore         
	//   92  189:dup             
	//   93  190:bipush          6
	//   94  192:getstatic       #46  <Field AssetStatusType RegistrationDate>
	//   95  195:aastore         
	//   96  196:dup             
	//   97  197:bipush          7
	//   98  199:getstatic       #49  <Field AssetStatusType SerialNumber>
	//   99  202:aastore         
	//  100  203:dup             
	//  101  204:bipush          8
	//  102  206:getstatic       #52  <Field AssetStatusType TankLevel>
	//  103  209:aastore         
	//  104  210:dup             
	//  105  211:bipush          9
	//  106  213:getstatic       #55  <Field AssetStatusType DockInfo>
	//  107  216:aastore         
	//  108  217:dup             
	//  109  218:bipush          10
	//  110  220:getstatic       #58  <Field AssetStatusType BinFull>
	//  111  223:aastore         
	//  112  224:putstatic       #60  <Field AssetStatusType[] $VALUES>
	//* 113  227:return          
	}
}
