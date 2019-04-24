// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hidatamanager.util;

import java.util.*;

public class Const
{
	public static interface HealthMustParams
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

	public static interface RawDataType
	{

		public static final long COMMUTER_TIME = 5L;
		public static final long COMMUTER_WAY = 6L;
		public static final long HEALTH_EVENT_RECORD = 1001L;
		public static final long HEALTH_PAIRED_DEVICE = 1000L;
		public static final long HEALTH_SLEEP_RECORD = 1002L;
		public static final long HICARD_CLICK = 1L;
		public static final long HOME_LOCATION = 2L;
		public static final long WORKING_CALENDER = 4L;
		public static final long WORKSHOP_LOCATION = 3L;
	}


	public Const()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
	//    2    4:return          
	}

	public static final List RAW_DATATYPE_LIST = Collections.unmodifiableList(Arrays.asList(((Object []) (new Long[] {
		Long.valueOf(1L), Long.valueOf(2L), Long.valueOf(3L), Long.valueOf(4L), Long.valueOf(5L), Long.valueOf(6L), Long.valueOf(1000L), Long.valueOf(1001L), Long.valueOf(1002L)
	}))));

	static 
	{
	//    0    0:bipush          9
	//    1    2:anewarray       Long[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:lconst_1        
	//    5    8:invokestatic    #20  <Method Long Long.valueOf(long)>
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:ldc2w           #21  <Long 2L>
	//   10   17:invokestatic    #20  <Method Long Long.valueOf(long)>
	//   11   20:aastore         
	//   12   21:dup             
	//   13   22:iconst_2        
	//   14   23:ldc2w           #23  <Long 3L>
	//   15   26:invokestatic    #20  <Method Long Long.valueOf(long)>
	//   16   29:aastore         
	//   17   30:dup             
	//   18   31:iconst_3        
	//   19   32:ldc2w           #25  <Long 4L>
	//   20   35:invokestatic    #20  <Method Long Long.valueOf(long)>
	//   21   38:aastore         
	//   22   39:dup             
	//   23   40:iconst_4        
	//   24   41:ldc2w           #27  <Long 5L>
	//   25   44:invokestatic    #20  <Method Long Long.valueOf(long)>
	//   26   47:aastore         
	//   27   48:dup             
	//   28   49:iconst_5        
	//   29   50:ldc2w           #29  <Long 6L>
	//   30   53:invokestatic    #20  <Method Long Long.valueOf(long)>
	//   31   56:aastore         
	//   32   57:dup             
	//   33   58:bipush          6
	//   34   60:ldc2w           #31  <Long 1000L>
	//   35   63:invokestatic    #20  <Method Long Long.valueOf(long)>
	//   36   66:aastore         
	//   37   67:dup             
	//   38   68:bipush          7
	//   39   70:ldc2w           #33  <Long 1001L>
	//   40   73:invokestatic    #20  <Method Long Long.valueOf(long)>
	//   41   76:aastore         
	//   42   77:dup             
	//   43   78:bipush          8
	//   44   80:ldc2w           #35  <Long 1002L>
	//   45   83:invokestatic    #20  <Method Long Long.valueOf(long)>
	//   46   86:aastore         
	//   47   87:invokestatic    #42  <Method List Arrays.asList(Object[])>
	//   48   90:invokestatic    #48  <Method List Collections.unmodifiableList(List)>
	//   49   93:putstatic       #50  <Field List RAW_DATATYPE_LIST>
	//*  50   96:return          
	}
}
