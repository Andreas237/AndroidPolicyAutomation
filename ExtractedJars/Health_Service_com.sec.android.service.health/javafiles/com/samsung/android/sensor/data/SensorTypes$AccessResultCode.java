// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sensor.data;


// Referenced classes of package com.samsung.android.sensor.data:
//			SensorTypes

public static final class SensorTypes$AccessResultCode extends Enum
{

	public static SensorTypes$AccessResultCode valueOf(String s)
	{
		return (SensorTypes$AccessResultCode)Enum.valueOf(com/samsung/android/sensor/data/SensorTypes$AccessResultCode, s);
	//    0    0:ldc1            #2   <Class SensorTypes$AccessResultCode>
	//    1    2:aload_0         
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class SensorTypes$AccessResultCode>
	//    4    9:areturn         
	}

	public static SensorTypes$AccessResultCode[] values()
	{
		return (SensorTypes$AccessResultCode[])((SensorTypes$AccessResultCode []) ($VALUES)).clone();
	//    0    0:getstatic       #39  <Field SensorTypes$AccessResultCode[] $VALUES>
	//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.samsung.android.sensor.data.SensorTypes$AccessResultCode_3B_.clone()>
	//    2    6:checkcast       #50  <Class SensorTypes$AccessResultCode[]>
	//    3    9:areturn         
	}

	private static final SensorTypes$AccessResultCode $VALUES[];
	public static final SensorTypes$AccessResultCode ACCESS_CODE_FAILURE_BY_OTHER_REASON;
	public static final SensorTypes$AccessResultCode ACCESS_CODE_NONE;
	public static final SensorTypes$AccessResultCode ACCESS_CODE_SEARCH_TIMEOUT;
	public static final SensorTypes$AccessResultCode ACCESS_CODE_SUCCESS;
	public static final SensorTypes$AccessResultCode ACCESS_CODE_USER_CANCEL;

	static 
	{
		ACCESS_CODE_NONE = new SensorTypes$AccessResultCode("ACCESS_CODE_NONE", 0);
	//    0    0:new             #2   <Class SensorTypes$AccessResultCode>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "ACCESS_CODE_NONE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void SensorTypes$AccessResultCode(String, int)>
	//    5   10:putstatic       #25  <Field SensorTypes$AccessResultCode ACCESS_CODE_NONE>
		ACCESS_CODE_SUCCESS = new SensorTypes$AccessResultCode("ACCESS_CODE_SUCCESS", 1);
	//    6   13:new             #2   <Class SensorTypes$AccessResultCode>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "ACCESS_CODE_SUCCESS">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void SensorTypes$AccessResultCode(String, int)>
	//   11   23:putstatic       #28  <Field SensorTypes$AccessResultCode ACCESS_CODE_SUCCESS>
		ACCESS_CODE_SEARCH_TIMEOUT = new SensorTypes$AccessResultCode("ACCESS_CODE_SEARCH_TIMEOUT", 2);
	//   12   26:new             #2   <Class SensorTypes$AccessResultCode>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "ACCESS_CODE_SEARCH_TIMEOUT">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void SensorTypes$AccessResultCode(String, int)>
	//   17   36:putstatic       #31  <Field SensorTypes$AccessResultCode ACCESS_CODE_SEARCH_TIMEOUT>
		ACCESS_CODE_FAILURE_BY_OTHER_REASON = new SensorTypes$AccessResultCode("ACCESS_CODE_FAILURE_BY_OTHER_REASON", 3);
	//   18   39:new             #2   <Class SensorTypes$AccessResultCode>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "ACCESS_CODE_FAILURE_BY_OTHER_REASON">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void SensorTypes$AccessResultCode(String, int)>
	//   23   49:putstatic       #34  <Field SensorTypes$AccessResultCode ACCESS_CODE_FAILURE_BY_OTHER_REASON>
		ACCESS_CODE_USER_CANCEL = new SensorTypes$AccessResultCode("ACCESS_CODE_USER_CANCEL", 4);
	//   24   52:new             #2   <Class SensorTypes$AccessResultCode>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "ACCESS_CODE_USER_CANCEL">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void SensorTypes$AccessResultCode(String, int)>
	//   29   62:putstatic       #37  <Field SensorTypes$AccessResultCode ACCESS_CODE_USER_CANCEL>
		$VALUES = (new SensorTypes$AccessResultCode[] {
			ACCESS_CODE_NONE, ACCESS_CODE_SUCCESS, ACCESS_CODE_SEARCH_TIMEOUT, ACCESS_CODE_FAILURE_BY_OTHER_REASON, ACCESS_CODE_USER_CANCEL
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       SensorTypes$AccessResultCode[]
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

	private SensorTypes$AccessResultCode(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
