// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sensor.data;


public class SensorTypes
{
	public static final class AccessResultCode extends Enum
	{

		public static AccessResultCode valueOf(String s)
		{
			return (AccessResultCode)Enum.valueOf(com/samsung/android/sensor/data/SensorTypes$AccessResultCode, s);
		//    0    0:ldc1            #2   <Class SensorTypes$AccessResultCode>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class SensorTypes$AccessResultCode>
		//    4    9:areturn         
		}

		public static AccessResultCode[] values()
		{
			return (AccessResultCode[])((AccessResultCode []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field SensorTypes$AccessResultCode[] $VALUES>
		//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.samsung.android.sensor.data.SensorTypes$AccessResultCode_3B_.clone()>
		//    2    6:checkcast       #50  <Class SensorTypes$AccessResultCode[]>
		//    3    9:areturn         
		}

		private static final AccessResultCode $VALUES[];
		public static final AccessResultCode ACCESS_CODE_FAILURE_BY_OTHER_REASON;
		public static final AccessResultCode ACCESS_CODE_NONE;
		public static final AccessResultCode ACCESS_CODE_SEARCH_TIMEOUT;
		public static final AccessResultCode ACCESS_CODE_SUCCESS;
		public static final AccessResultCode ACCESS_CODE_USER_CANCEL;

		static 
		{
			ACCESS_CODE_NONE = new AccessResultCode("ACCESS_CODE_NONE", 0);
		//    0    0:new             #2   <Class SensorTypes$AccessResultCode>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "ACCESS_CODE_NONE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void SensorTypes$AccessResultCode(String, int)>
		//    5   10:putstatic       #25  <Field SensorTypes$AccessResultCode ACCESS_CODE_NONE>
			ACCESS_CODE_SUCCESS = new AccessResultCode("ACCESS_CODE_SUCCESS", 1);
		//    6   13:new             #2   <Class SensorTypes$AccessResultCode>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "ACCESS_CODE_SUCCESS">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void SensorTypes$AccessResultCode(String, int)>
		//   11   23:putstatic       #28  <Field SensorTypes$AccessResultCode ACCESS_CODE_SUCCESS>
			ACCESS_CODE_SEARCH_TIMEOUT = new AccessResultCode("ACCESS_CODE_SEARCH_TIMEOUT", 2);
		//   12   26:new             #2   <Class SensorTypes$AccessResultCode>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "ACCESS_CODE_SEARCH_TIMEOUT">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void SensorTypes$AccessResultCode(String, int)>
		//   17   36:putstatic       #31  <Field SensorTypes$AccessResultCode ACCESS_CODE_SEARCH_TIMEOUT>
			ACCESS_CODE_FAILURE_BY_OTHER_REASON = new AccessResultCode("ACCESS_CODE_FAILURE_BY_OTHER_REASON", 3);
		//   18   39:new             #2   <Class SensorTypes$AccessResultCode>
		//   19   42:dup             
		//   20   43:ldc1            #32  <String "ACCESS_CODE_FAILURE_BY_OTHER_REASON">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void SensorTypes$AccessResultCode(String, int)>
		//   23   49:putstatic       #34  <Field SensorTypes$AccessResultCode ACCESS_CODE_FAILURE_BY_OTHER_REASON>
			ACCESS_CODE_USER_CANCEL = new AccessResultCode("ACCESS_CODE_USER_CANCEL", 4);
		//   24   52:new             #2   <Class SensorTypes$AccessResultCode>
		//   25   55:dup             
		//   26   56:ldc1            #35  <String "ACCESS_CODE_USER_CANCEL">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void SensorTypes$AccessResultCode(String, int)>
		//   29   62:putstatic       #37  <Field SensorTypes$AccessResultCode ACCESS_CODE_USER_CANCEL>
			$VALUES = (new AccessResultCode[] {
				ACCESS_CODE_NONE, ACCESS_CODE_SUCCESS, ACCESS_CODE_SEARCH_TIMEOUT, ACCESS_CODE_FAILURE_BY_OTHER_REASON, ACCESS_CODE_USER_CANCEL
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       AccessResultCode[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #25  <Field SensorTypes$AccessResultCode ACCESS_CODE_NONE>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #28  <Field SensorTypes$AccessResultCode ACCESS_CODE_SUCCESS>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #31  <Field SensorTypes$AccessResultCode ACCESS_CODE_SEARCH_TIMEOUT>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #34  <Field SensorTypes$AccessResultCode ACCESS_CODE_FAILURE_BY_OTHER_REASON>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #37  <Field SensorTypes$AccessResultCode ACCESS_CODE_USER_CANCEL>
		//   51   98:aastore         
		//   52   99:putstatic       #39  <Field SensorTypes$AccessResultCode[] $VALUES>
		//*  53  102:return          
		}

		private AccessResultCode(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class SensorConnectionType extends Enum
	{

		public static SensorConnectionType valueOf(String s)
		{
			return (SensorConnectionType)Enum.valueOf(com/samsung/android/sensor/data/SensorTypes$SensorConnectionType, s);
		//    0    0:ldc1            #2   <Class SensorTypes$SensorConnectionType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #67  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class SensorTypes$SensorConnectionType>
		//    4    9:areturn         
		}

		public static SensorConnectionType[] values()
		{
			return (SensorConnectionType[])((SensorConnectionType []) ($VALUES)).clone();
		//    0    0:getstatic       #59  <Field SensorTypes$SensorConnectionType[] $VALUES>
		//    1    3:invokevirtual   #74  <Method Object _5B_Lcom.samsung.android.sensor.data.SensorTypes$SensorConnectionType_3B_.clone()>
		//    2    6:checkcast       #70  <Class SensorTypes$SensorConnectionType[]>
		//    3    9:areturn         
		}

		private static final SensorConnectionType $VALUES[];
		public static final SensorConnectionType SENSOR_CONNECTION_TYPE_ALL;
		public static final SensorConnectionType SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT;
		public static final SensorConnectionType SENSOR_CONNECTION_TYPE_ANT;
		public static final SensorConnectionType SENSOR_CONNECTION_TYPE_AUX_PORT;
		public static final SensorConnectionType SENSOR_CONNECTION_TYPE_BLE;
		public static final SensorConnectionType SENSOR_CONNECTION_TYPE_BLUETOOTH;
		public static final SensorConnectionType SENSOR_CONNECTION_TYPE_NFC;
		public static final SensorConnectionType SENSOR_CONNECTION_TYPE_NONE;
		public static final SensorConnectionType SENSOR_CONNECTION_TYPE_SAMSUNG_ACCESSORY;
		public static final SensorConnectionType SENSOR_CONNECTION_TYPE_USB;

		static 
		{
			SENSOR_CONNECTION_TYPE_NONE = new SensorConnectionType("SENSOR_CONNECTION_TYPE_NONE", 0);
		//    0    0:new             #2   <Class SensorTypes$SensorConnectionType>
		//    1    3:dup             
		//    2    4:ldc1            #24  <String "SENSOR_CONNECTION_TYPE_NONE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #28  <Method void SensorTypes$SensorConnectionType(String, int)>
		//    5   10:putstatic       #30  <Field SensorTypes$SensorConnectionType SENSOR_CONNECTION_TYPE_NONE>
			SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT = new SensorConnectionType("SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT", 1);
		//    6   13:new             #2   <Class SensorTypes$SensorConnectionType>
		//    7   16:dup             
		//    8   17:ldc1            #31  <String "SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #28  <Method void SensorTypes$SensorConnectionType(String, int)>
		//   11   23:putstatic       #33  <Field SensorTypes$SensorConnectionType SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT>
			SENSOR_CONNECTION_TYPE_BLUETOOTH = new SensorConnectionType("SENSOR_CONNECTION_TYPE_BLUETOOTH", 2);
		//   12   26:new             #2   <Class SensorTypes$SensorConnectionType>
		//   13   29:dup             
		//   14   30:ldc1            #34  <String "SENSOR_CONNECTION_TYPE_BLUETOOTH">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #28  <Method void SensorTypes$SensorConnectionType(String, int)>
		//   17   36:putstatic       #36  <Field SensorTypes$SensorConnectionType SENSOR_CONNECTION_TYPE_BLUETOOTH>
			SENSOR_CONNECTION_TYPE_BLE = new SensorConnectionType("SENSOR_CONNECTION_TYPE_BLE", 3);
		//   18   39:new             #2   <Class SensorTypes$SensorConnectionType>
		//   19   42:dup             
		//   20   43:ldc1            #37  <String "SENSOR_CONNECTION_TYPE_BLE">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #28  <Method void SensorTypes$SensorConnectionType(String, int)>
		//   23   49:putstatic       #39  <Field SensorTypes$SensorConnectionType SENSOR_CONNECTION_TYPE_BLE>
			SENSOR_CONNECTION_TYPE_USB = new SensorConnectionType("SENSOR_CONNECTION_TYPE_USB", 4);
		//   24   52:new             #2   <Class SensorTypes$SensorConnectionType>
		//   25   55:dup             
		//   26   56:ldc1            #40  <String "SENSOR_CONNECTION_TYPE_USB">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #28  <Method void SensorTypes$SensorConnectionType(String, int)>
		//   29   62:putstatic       #42  <Field SensorTypes$SensorConnectionType SENSOR_CONNECTION_TYPE_USB>
			SENSOR_CONNECTION_TYPE_SAMSUNG_ACCESSORY = new SensorConnectionType("SENSOR_CONNECTION_TYPE_SAMSUNG_ACCESSORY", 5);
		//   30   65:new             #2   <Class SensorTypes$SensorConnectionType>
		//   31   68:dup             
		//   32   69:ldc1            #43  <String "SENSOR_CONNECTION_TYPE_SAMSUNG_ACCESSORY">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #28  <Method void SensorTypes$SensorConnectionType(String, int)>
		//   35   75:putstatic       #45  <Field SensorTypes$SensorConnectionType SENSOR_CONNECTION_TYPE_SAMSUNG_ACCESSORY>
			SENSOR_CONNECTION_TYPE_ANT = new SensorConnectionType("SENSOR_CONNECTION_TYPE_ANT", 6);
		//   36   78:new             #2   <Class SensorTypes$SensorConnectionType>
		//   37   81:dup             
		//   38   82:ldc1            #46  <String "SENSOR_CONNECTION_TYPE_ANT">
		//   39   84:bipush          6
		//   40   86:invokespecial   #28  <Method void SensorTypes$SensorConnectionType(String, int)>
		//   41   89:putstatic       #48  <Field SensorTypes$SensorConnectionType SENSOR_CONNECTION_TYPE_ANT>
			SENSOR_CONNECTION_TYPE_NFC = new SensorConnectionType("SENSOR_CONNECTION_TYPE_NFC", 7);
		//   42   92:new             #2   <Class SensorTypes$SensorConnectionType>
		//   43   95:dup             
		//   44   96:ldc1            #49  <String "SENSOR_CONNECTION_TYPE_NFC">
		//   45   98:bipush          7
		//   46  100:invokespecial   #28  <Method void SensorTypes$SensorConnectionType(String, int)>
		//   47  103:putstatic       #51  <Field SensorTypes$SensorConnectionType SENSOR_CONNECTION_TYPE_NFC>
			SENSOR_CONNECTION_TYPE_AUX_PORT = new SensorConnectionType("SENSOR_CONNECTION_TYPE_AUX_PORT", 8);
		//   48  106:new             #2   <Class SensorTypes$SensorConnectionType>
		//   49  109:dup             
		//   50  110:ldc1            #52  <String "SENSOR_CONNECTION_TYPE_AUX_PORT">
		//   51  112:bipush          8
		//   52  114:invokespecial   #28  <Method void SensorTypes$SensorConnectionType(String, int)>
		//   53  117:putstatic       #54  <Field SensorTypes$SensorConnectionType SENSOR_CONNECTION_TYPE_AUX_PORT>
			SENSOR_CONNECTION_TYPE_ALL = new SensorConnectionType("SENSOR_CONNECTION_TYPE_ALL", 9);
		//   54  120:new             #2   <Class SensorTypes$SensorConnectionType>
		//   55  123:dup             
		//   56  124:ldc1            #55  <String "SENSOR_CONNECTION_TYPE_ALL">
		//   57  126:bipush          9
		//   58  128:invokespecial   #28  <Method void SensorTypes$SensorConnectionType(String, int)>
		//   59  131:putstatic       #57  <Field SensorTypes$SensorConnectionType SENSOR_CONNECTION_TYPE_ALL>
			$VALUES = (new SensorConnectionType[] {
				SENSOR_CONNECTION_TYPE_NONE, SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT, SENSOR_CONNECTION_TYPE_BLUETOOTH, SENSOR_CONNECTION_TYPE_BLE, SENSOR_CONNECTION_TYPE_USB, SENSOR_CONNECTION_TYPE_SAMSUNG_ACCESSORY, SENSOR_CONNECTION_TYPE_ANT, SENSOR_CONNECTION_TYPE_NFC, SENSOR_CONNECTION_TYPE_AUX_PORT, SENSOR_CONNECTION_TYPE_ALL
			});
		//   60  134:bipush          10
		//   61  136:anewarray       SensorConnectionType[]
		//   62  139:dup             
		//   63  140:iconst_0        
		//   64  141:getstatic       #30  <Field SensorTypes$SensorConnectionType SENSOR_CONNECTION_TYPE_NONE>
		//   65  144:aastore         
		//   66  145:dup             
		//   67  146:iconst_1        
		//   68  147:getstatic       #33  <Field SensorTypes$SensorConnectionType SENSOR_CONNECTION_TYPE_ANDROID_DEFAULT>
		//   69  150:aastore         
		//   70  151:dup             
		//   71  152:iconst_2        
		//   72  153:getstatic       #36  <Field SensorTypes$SensorConnectionType SENSOR_CONNECTION_TYPE_BLUETOOTH>
		//   73  156:aastore         
		//   74  157:dup             
		//   75  158:iconst_3        
		//   76  159:getstatic       #39  <Field SensorTypes$SensorConnectionType SENSOR_CONNECTION_TYPE_BLE>
		//   77  162:aastore         
		//   78  163:dup             
		//   79  164:iconst_4        
		//   80  165:getstatic       #42  <Field SensorTypes$SensorConnectionType SENSOR_CONNECTION_TYPE_USB>
		//   81  168:aastore         
		//   82  169:dup             
		//   83  170:iconst_5        
		//   84  171:getstatic       #45  <Field SensorTypes$SensorConnectionType SENSOR_CONNECTION_TYPE_SAMSUNG_ACCESSORY>
		//   85  174:aastore         
		//   86  175:dup             
		//   87  176:bipush          6
		//   88  178:getstatic       #48  <Field SensorTypes$SensorConnectionType SENSOR_CONNECTION_TYPE_ANT>
		//   89  181:aastore         
		//   90  182:dup             
		//   91  183:bipush          7
		//   92  185:getstatic       #51  <Field SensorTypes$SensorConnectionType SENSOR_CONNECTION_TYPE_NFC>
		//   93  188:aastore         
		//   94  189:dup             
		//   95  190:bipush          8
		//   96  192:getstatic       #54  <Field SensorTypes$SensorConnectionType SENSOR_CONNECTION_TYPE_AUX_PORT>
		//   97  195:aastore         
		//   98  196:dup             
		//   99  197:bipush          9
		//  100  199:getstatic       #57  <Field SensorTypes$SensorConnectionType SENSOR_CONNECTION_TYPE_ALL>
		//  101  202:aastore         
		//  102  203:putstatic       #59  <Field SensorTypes$SensorConnectionType[] $VALUES>
		//* 103  206:return          
		}

		private SensorConnectionType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #61  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public SensorTypes()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
	//    2    4:return          
	}

	public static final int SENSOR_DATA_TYPE_BIKE_CADENCE = 4096;
	public static final int SENSOR_DATA_TYPE_BIKE_COMBINED_SPD_CAD = 16384;
	public static final int SENSOR_DATA_TYPE_BIKE_POWER = 32768;
	public static final int SENSOR_DATA_TYPE_BIKE_SPEED = 8192;
	public static final int SENSOR_DATA_TYPE_BLOOD_GLUCOSE = 128;
	public static final int SENSOR_DATA_TYPE_BLOOD_PRESSURE_MONITOR = 256;
	public static final int SENSOR_DATA_TYPE_BODY_TEMPERATURE = 1024;
	public static final int SENSOR_DATA_TYPE_ECG = 2048;
	public static final int SENSOR_DATA_TYPE_HEARTRATE_BIO = 1;
	public static final int SENSOR_DATA_TYPE_HEARTRATE_RAW = 2;
	public static final int SENSOR_DATA_TYPE_HUMIDITY = 32;
	public static final int SENSOR_DATA_TYPE_NONE = 0;
	public static final int SENSOR_DATA_TYPE_PULSE_OXIMETER = 4;
	public static final int SENSOR_DATA_TYPE_STRESS = 8;
	public static final int SENSOR_DATA_TYPE_STRIDE_SDM = 0x10000;
	public static final int SENSOR_DATA_TYPE_SYNC = 0x20000;
	public static final int SENSOR_DATA_TYPE_TEMPERATURE = 512;
	public static final int SENSOR_DATA_TYPE_UV_RAY = 64;
	public static final int SENSOR_DATA_TYPE_WEIGHT = 16;
}
