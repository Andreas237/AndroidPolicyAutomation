// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.stats;

import android.content.*;
import android.os.Process;
import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.common.stats:
//			StatisticalEventTrackerProvider, StatsEvent, LoggingConstants

public class StatsUtils
{

	public StatsUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String getEventKey(AbstractThreadedSyncAdapter abstractthreadedsyncadapter, String s)
	{
		String s1 = String.valueOf(((Object) (String.valueOf((long)Process.myPid() << 32 | (long)System.identityHashCode(((Object) (abstractthreadedsyncadapter)))))));
	//    0    0:invokestatic    #17  <Method int Process.myPid()>
	//    1    3:i2l             
	//    2    4:bipush          32
	//    3    6:lshl            
	//    4    7:aload_0         
	//    5    8:invokestatic    #23  <Method int System.identityHashCode(Object)>
	//    6   11:i2l             
	//    7   12:lor             
	//    8   13:invokestatic    #29  <Method String String.valueOf(long)>
	//    9   16:invokestatic    #32  <Method String String.valueOf(Object)>
	//   10   19:astore_2        
		abstractthreadedsyncadapter = ((AbstractThreadedSyncAdapter) (s));
	//   11   20:aload_1         
	//   12   21:astore_0        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  13   22:aload_1         
	//*  14   23:invokestatic    #38  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  15   26:ifeq            32
			abstractthreadedsyncadapter = "";
	//   16   29:ldc1            #40  <String "">
	//   17   31:astore_0        
		abstractthreadedsyncadapter = ((AbstractThreadedSyncAdapter) (String.valueOf(((Object) (abstractthreadedsyncadapter)))));
	//   18   32:aload_0         
	//   19   33:invokestatic    #32  <Method String String.valueOf(Object)>
	//   20   36:astore_0        
		if(((String) (abstractthreadedsyncadapter)).length() != 0)
	//*  21   37:aload_0         
	//*  22   38:invokevirtual   #43  <Method int String.length()>
	//*  23   41:ifeq            50
			return s1.concat(((String) (abstractthreadedsyncadapter)));
	//   24   44:aload_2         
	//   25   45:aload_0         
	//   26   46:invokevirtual   #47  <Method String String.concat(String)>
	//   27   49:areturn         
		else
			return new String(s1);
	//   28   50:new             #25  <Class String>
	//   29   53:dup             
	//   30   54:aload_2         
	//   31   55:invokespecial   #50  <Method void String(String)>
	//   32   58:areturn         
	}

	public static String getEventKey(Context context, Intent intent)
	{
		return String.valueOf((long)System.identityHashCode(((Object) (context))) << 32 | (long)System.identityHashCode(((Object) (intent))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #23  <Method int System.identityHashCode(Object)>
	//    2    4:i2l             
	//    3    5:bipush          32
	//    4    7:lshl            
	//    5    8:aload_1         
	//    6    9:invokestatic    #23  <Method int System.identityHashCode(Object)>
	//    7   12:i2l             
	//    8   13:lor             
	//    9   14:invokestatic    #29  <Method String String.valueOf(long)>
	//   10   17:areturn         
	}

	public static String getEventKey(android.os.PowerManager.WakeLock wakelock, String s)
	{
		String s1 = String.valueOf(((Object) (String.valueOf((long)Process.myPid() << 32 | (long)System.identityHashCode(((Object) (wakelock)))))));
	//    0    0:invokestatic    #17  <Method int Process.myPid()>
	//    1    3:i2l             
	//    2    4:bipush          32
	//    3    6:lshl            
	//    4    7:aload_0         
	//    5    8:invokestatic    #23  <Method int System.identityHashCode(Object)>
	//    6   11:i2l             
	//    7   12:lor             
	//    8   13:invokestatic    #29  <Method String String.valueOf(long)>
	//    9   16:invokestatic    #32  <Method String String.valueOf(Object)>
	//   10   19:astore_2        
		wakelock = ((android.os.PowerManager.WakeLock) (s));
	//   11   20:aload_1         
	//   12   21:astore_0        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  13   22:aload_1         
	//*  14   23:invokestatic    #38  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  15   26:ifeq            32
			wakelock = "";
	//   16   29:ldc1            #40  <String "">
	//   17   31:astore_0        
		wakelock = ((android.os.PowerManager.WakeLock) (String.valueOf(((Object) (wakelock)))));
	//   18   32:aload_0         
	//   19   33:invokestatic    #32  <Method String String.valueOf(Object)>
	//   20   36:astore_0        
		if(((String) (wakelock)).length() != 0)
	//*  21   37:aload_0         
	//*  22   38:invokevirtual   #43  <Method int String.length()>
	//*  23   41:ifeq            50
			return s1.concat(((String) (wakelock)));
	//   24   44:aload_2         
	//   25   45:aload_0         
	//   26   46:invokevirtual   #47  <Method String String.concat(String)>
	//   27   49:areturn         
		else
			return new String(s1);
	//   28   50:new             #25  <Class String>
	//   29   53:dup             
	//   30   54:aload_2         
	//   31   55:invokespecial   #50  <Method void String(String)>
	//   32   58:areturn         
	}

	public static boolean isLoggingEnabled()
	{
		StatisticalEventTrackerProvider.StatisticalEventTracker statisticaleventtracker = StatisticalEventTrackerProvider.getImpl();
	//    0    0:invokestatic    #60  <Method StatisticalEventTrackerProvider$StatisticalEventTracker StatisticalEventTrackerProvider.getImpl()>
	//    1    3:astore_0        
		return statisticaleventtracker != null && statisticaleventtracker.isEnabled() && (zza(Integer.valueOf(statisticaleventtracker.getLogLevel(3))) || zza(Integer.valueOf(statisticaleventtracker.getLogLevel(2))) || zza(Integer.valueOf(statisticaleventtracker.getLogLevel(1))));
	//    2    4:aload_0         
	//    3    5:ifnull          67
	//    4    8:aload_0         
	//    5    9:invokeinterface #65  <Method boolean StatisticalEventTrackerProvider$StatisticalEventTracker.isEnabled()>
	//    6   14:ifeq            67
	//    7   17:aload_0         
	//    8   18:iconst_3        
	//    9   19:invokeinterface #69  <Method int StatisticalEventTrackerProvider$StatisticalEventTracker.getLogLevel(int)>
	//   10   24:invokestatic    #74  <Method Integer Integer.valueOf(int)>
	//   11   27:invokestatic    #78  <Method boolean zza(Integer)>
	//   12   30:ifne            65
	//   13   33:aload_0         
	//   14   34:iconst_2        
	//   15   35:invokeinterface #69  <Method int StatisticalEventTrackerProvider$StatisticalEventTracker.getLogLevel(int)>
	//   16   40:invokestatic    #74  <Method Integer Integer.valueOf(int)>
	//   17   43:invokestatic    #78  <Method boolean zza(Integer)>
	//   18   46:ifne            65
	//   19   49:aload_0         
	//   20   50:iconst_1        
	//   21   51:invokeinterface #69  <Method int StatisticalEventTrackerProvider$StatisticalEventTracker.getLogLevel(int)>
	//   22   56:invokestatic    #74  <Method Integer Integer.valueOf(int)>
	//   23   59:invokestatic    #78  <Method boolean zza(Integer)>
	//   24   62:ifeq            67
	//   25   65:iconst_1        
	//   26   66:ireturn         
	//   27   67:iconst_0        
	//   28   68:ireturn         
	}

	public static boolean isTimeOutEvent(StatsEvent statsevent)
	{
		int i = statsevent.getEventType();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #85  <Method int StatsEvent.getEventType()>
	//    2    4:istore_1        
		return i == 6 || i == 9 || i == 12;
	//    3    5:iload_1         
	//    4    6:bipush          6
	//    5    8:icmpeq          25
	//    6   11:iload_1         
	//    7   12:bipush          9
	//    8   14:icmpeq          25
	//    9   17:iload_1         
	//   10   18:bipush          12
	//   11   20:icmpeq          25
	//   12   23:iconst_0        
	//   13   24:ireturn         
	//   14   25:iconst_1        
	//   15   26:ireturn         
	}

	private static boolean zza(Integer integer)
	{
		return !integer.equals(((Object) (Integer.valueOf(LoggingConstants.LOG_LEVEL_OFF))));
	//    0    0:aload_0         
	//    1    1:getstatic       #91  <Field int LoggingConstants.LOG_LEVEL_OFF>
	//    2    4:invokestatic    #74  <Method Integer Integer.valueOf(int)>
	//    3    7:invokevirtual   #95  <Method boolean Integer.equals(Object)>
	//    4   10:ifne            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}
}
