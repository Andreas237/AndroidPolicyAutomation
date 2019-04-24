// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hidatamanager.util;


// Referenced classes of package com.huawei.hidatamanager.util:
//			Const

public static interface Const$HealthMustParams
{

	public static final String EVENT_RECORD[] = {
		"SportType", "SportStartTime", "SportDuration"
	};
	public static final String PAIRED_DEVICE[] = {
		"DeviceName", "DeviceID", "DeviceType", "DeviceActiveTime"
	};
	public static final String SLEEP_RECORD[] = {
		"SleepStartTime", "SleepEndTime"
	};

	/* static  */
	/* { */
	//    0    0:iconst_4        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #17  <String "DeviceName">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #19  <String "DeviceID">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #21  <String "DeviceType">
	//   13   18:aastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #23  <String "DeviceActiveTime">
	//   17   23:aastore         
	//   18   24:putstatic       #25  <Field String[] PAIRED_DEVICE>
	//   19   27:iconst_3        
	//   20   28:anewarray       String[]
	//   21   31:dup             
	//   22   32:iconst_0        
	//   23   33:ldc1            #27  <String "SportType">
	//   24   35:aastore         
	//   25   36:dup             
	//   26   37:iconst_1        
	//   27   38:ldc1            #29  <String "SportStartTime">
	//   28   40:aastore         
	//   29   41:dup             
	//   30   42:iconst_2        
	//   31   43:ldc1            #31  <String "SportDuration">
	//   32   45:aastore         
	//   33   46:putstatic       #33  <Field String[] EVENT_RECORD>
	//   34   49:iconst_2        
	//   35   50:anewarray       String[]
	//   36   53:dup             
	//   37   54:iconst_0        
	//   38   55:ldc1            #35  <String "SleepStartTime">
	//   39   57:aastore         
	//   40   58:dup             
	//   41   59:iconst_1        
	//   42   60:ldc1            #37  <String "SleepEndTime">
	//   43   62:aastore         
	//   44   63:putstatic       #39  <Field String[] SLEEP_RECORD>
	//*  45   66:return          
	/* } */
}
