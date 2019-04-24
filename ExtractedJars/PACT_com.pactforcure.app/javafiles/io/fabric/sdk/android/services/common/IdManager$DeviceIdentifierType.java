// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;


// Referenced classes of package io.fabric.sdk.android.services.common:
//			IdManager

public static final class IdManager$DeviceIdentifierType extends Enum
{

	public static IdManager$DeviceIdentifierType valueOf(String s)
	{
		return (IdManager$DeviceIdentifierType)Enum.valueOf(io/fabric/sdk/android/services/common/IdManager$DeviceIdentifierType, s);
	//    0    0:ldc1            #2   <Class IdManager$DeviceIdentifierType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #62  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class IdManager$DeviceIdentifierType>
	//    4    9:areturn         
	}

	public static IdManager$DeviceIdentifierType[] values()
	{
		return (IdManager$DeviceIdentifierType[])((IdManager$DeviceIdentifierType []) ($VALUES)).clone();
	//    0    0:getstatic       #49  <Field IdManager$DeviceIdentifierType[] $VALUES>
	//    1    3:invokevirtual   #69  <Method Object _5B_Lio.fabric.sdk.android.services.common.IdManager$DeviceIdentifierType_3B_.clone()>
	//    2    6:checkcast       #65  <Class IdManager$DeviceIdentifierType[]>
	//    3    9:areturn         
	}

	private static final IdManager$DeviceIdentifierType $VALUES[];
	public static final IdManager$DeviceIdentifierType ANDROID_ADVERTISING_ID;
	public static final IdManager$DeviceIdentifierType ANDROID_DEVICE_ID;
	public static final IdManager$DeviceIdentifierType ANDROID_ID;
	public static final IdManager$DeviceIdentifierType ANDROID_SERIAL;
	public static final IdManager$DeviceIdentifierType BLUETOOTH_MAC_ADDRESS;
	public static final IdManager$DeviceIdentifierType FONT_TOKEN;
	public static final IdManager$DeviceIdentifierType WIFI_MAC_ADDRESS;
	public final int protobufIndex;

	static 
	{
		WIFI_MAC_ADDRESS = new IdManager$DeviceIdentifierType("WIFI_MAC_ADDRESS", 0, 1);
	//    0    0:new             #2   <Class IdManager$DeviceIdentifierType>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "WIFI_MAC_ADDRESS">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:invokespecial   #27  <Method void IdManager$DeviceIdentifierType(String, int, int)>
	//    6   11:putstatic       #29  <Field IdManager$DeviceIdentifierType WIFI_MAC_ADDRESS>
		BLUETOOTH_MAC_ADDRESS = new IdManager$DeviceIdentifierType("BLUETOOTH_MAC_ADDRESS", 1, 2);
	//    7   14:new             #2   <Class IdManager$DeviceIdentifierType>
	//    8   17:dup             
	//    9   18:ldc1            #30  <String "BLUETOOTH_MAC_ADDRESS">
	//   10   20:iconst_1        
	//   11   21:iconst_2        
	//   12   22:invokespecial   #27  <Method void IdManager$DeviceIdentifierType(String, int, int)>
	//   13   25:putstatic       #32  <Field IdManager$DeviceIdentifierType BLUETOOTH_MAC_ADDRESS>
		FONT_TOKEN = new IdManager$DeviceIdentifierType("FONT_TOKEN", 2, 53);
	//   14   28:new             #2   <Class IdManager$DeviceIdentifierType>
	//   15   31:dup             
	//   16   32:ldc1            #33  <String "FONT_TOKEN">
	//   17   34:iconst_2        
	//   18   35:bipush          53
	//   19   37:invokespecial   #27  <Method void IdManager$DeviceIdentifierType(String, int, int)>
	//   20   40:putstatic       #35  <Field IdManager$DeviceIdentifierType FONT_TOKEN>
		ANDROID_ID = new IdManager$DeviceIdentifierType("ANDROID_ID", 3, 100);
	//   21   43:new             #2   <Class IdManager$DeviceIdentifierType>
	//   22   46:dup             
	//   23   47:ldc1            #36  <String "ANDROID_ID">
	//   24   49:iconst_3        
	//   25   50:bipush          100
	//   26   52:invokespecial   #27  <Method void IdManager$DeviceIdentifierType(String, int, int)>
	//   27   55:putstatic       #38  <Field IdManager$DeviceIdentifierType ANDROID_ID>
		ANDROID_DEVICE_ID = new IdManager$DeviceIdentifierType("ANDROID_DEVICE_ID", 4, 101);
	//   28   58:new             #2   <Class IdManager$DeviceIdentifierType>
	//   29   61:dup             
	//   30   62:ldc1            #39  <String "ANDROID_DEVICE_ID">
	//   31   64:iconst_4        
	//   32   65:bipush          101
	//   33   67:invokespecial   #27  <Method void IdManager$DeviceIdentifierType(String, int, int)>
	//   34   70:putstatic       #41  <Field IdManager$DeviceIdentifierType ANDROID_DEVICE_ID>
		ANDROID_SERIAL = new IdManager$DeviceIdentifierType("ANDROID_SERIAL", 5, 102);
	//   35   73:new             #2   <Class IdManager$DeviceIdentifierType>
	//   36   76:dup             
	//   37   77:ldc1            #42  <String "ANDROID_SERIAL">
	//   38   79:iconst_5        
	//   39   80:bipush          102
	//   40   82:invokespecial   #27  <Method void IdManager$DeviceIdentifierType(String, int, int)>
	//   41   85:putstatic       #44  <Field IdManager$DeviceIdentifierType ANDROID_SERIAL>
		ANDROID_ADVERTISING_ID = new IdManager$DeviceIdentifierType("ANDROID_ADVERTISING_ID", 6, 103);
	//   42   88:new             #2   <Class IdManager$DeviceIdentifierType>
	//   43   91:dup             
	//   44   92:ldc1            #45  <String "ANDROID_ADVERTISING_ID">
	//   45   94:bipush          6
	//   46   96:bipush          103
	//   47   98:invokespecial   #27  <Method void IdManager$DeviceIdentifierType(String, int, int)>
	//   48  101:putstatic       #47  <Field IdManager$DeviceIdentifierType ANDROID_ADVERTISING_ID>
		$VALUES = (new IdManager$DeviceIdentifierType[] {
			WIFI_MAC_ADDRESS, BLUETOOTH_MAC_ADDRESS, FONT_TOKEN, ANDROID_ID, ANDROID_DEVICE_ID, ANDROID_SERIAL, ANDROID_ADVERTISING_ID
		});
	//   49  104:bipush          7
	//   50  106:anewarray       IdManager$DeviceIdentifierType[]
	//   51  109:dup             
	//   52  110:iconst_0        
	//   53  111:getstatic       #29  <Field IdManager$DeviceIdentifierType WIFI_MAC_ADDRESS>
	//   54  114:aastore         
	//   55  115:dup             
	//   56  116:iconst_1        
	//   57  117:getstatic       #32  <Field IdManager$DeviceIdentifierType BLUETOOTH_MAC_ADDRESS>
	//   58  120:aastore         
	//   59  121:dup             
	//   60  122:iconst_2        
	//   61  123:getstatic       #35  <Field IdManager$DeviceIdentifierType FONT_TOKEN>
	//   62  126:aastore         
	//   63  127:dup             
	//   64  128:iconst_3        
	//   65  129:getstatic       #38  <Field IdManager$DeviceIdentifierType ANDROID_ID>
	//   66  132:aastore         
	//   67  133:dup             
	//   68  134:iconst_4        
	//   69  135:getstatic       #41  <Field IdManager$DeviceIdentifierType ANDROID_DEVICE_ID>
	//   70  138:aastore         
	//   71  139:dup             
	//   72  140:iconst_5        
	//   73  141:getstatic       #44  <Field IdManager$DeviceIdentifierType ANDROID_SERIAL>
	//   74  144:aastore         
	//   75  145:dup             
	//   76  146:bipush          6
	//   77  148:getstatic       #47  <Field IdManager$DeviceIdentifierType ANDROID_ADVERTISING_ID>
	//   78  151:aastore         
	//   79  152:putstatic       #49  <Field IdManager$DeviceIdentifierType[] $VALUES>
	//*  80  155:return          
	}

	private IdManager$DeviceIdentifierType(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #53  <Method void Enum(String, int)>
		protobufIndex = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #55  <Field int protobufIndex>
	//    7   11:return          
	}
}
