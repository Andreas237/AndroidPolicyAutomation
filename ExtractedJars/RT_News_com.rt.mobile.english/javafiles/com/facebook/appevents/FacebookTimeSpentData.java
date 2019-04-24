// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import java.io.Serializable;
import java.util.Locale;

// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

class FacebookTimeSpentData
	implements Serializable
{
	private static class SerializationProxyV1
		implements Serializable
	{

		private Object readResolve()
		{
			return ((Object) (new FacebookTimeSpentData(lastResumeTime, lastSuspendTime, millisecondsSpentInSession, interruptionCount)));
		//    0    0:new             #8   <Class FacebookTimeSpentData>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #25  <Field long lastResumeTime>
		//    4    8:aload_0         
		//    5    9:getfield        #27  <Field long lastSuspendTime>
		//    6   12:aload_0         
		//    7   13:getfield        #29  <Field long millisecondsSpentInSession>
		//    8   16:aload_0         
		//    9   17:getfield        #31  <Field int interruptionCount>
		//   10   20:aconst_null     
		//   11   21:invokespecial   #37  <Method void FacebookTimeSpentData(long, long, long, int, FacebookTimeSpentData$1)>
		//   12   24:areturn         
		}

		private static final long serialVersionUID = 6L;
		private final int interruptionCount;
		private final long lastResumeTime;
		private final long lastSuspendTime;
		private final long millisecondsSpentInSession;

		SerializationProxyV1(long l, long l1, long l2, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			lastResumeTime = l;
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:putfield        #25  <Field long lastResumeTime>
			lastSuspendTime = l1;
		//    5    9:aload_0         
		//    6   10:lload_3         
		//    7   11:putfield        #27  <Field long lastSuspendTime>
			millisecondsSpentInSession = l2;
		//    8   14:aload_0         
		//    9   15:lload           5
		//   10   17:putfield        #29  <Field long millisecondsSpentInSession>
			interruptionCount = i;
		//   11   20:aload_0         
		//   12   21:iload           7
		//   13   23:putfield        #31  <Field int interruptionCount>
		//   14   26:return          
		}
	}

	private static class SerializationProxyV2
		implements Serializable
	{

		private Object readResolve()
		{
			return ((Object) (new FacebookTimeSpentData(lastResumeTime, lastSuspendTime, millisecondsSpentInSession, interruptionCount, firstOpenSourceApplication)));
		//    0    0:new             #8   <Class FacebookTimeSpentData>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #27  <Field long lastResumeTime>
		//    4    8:aload_0         
		//    5    9:getfield        #29  <Field long lastSuspendTime>
		//    6   12:aload_0         
		//    7   13:getfield        #31  <Field long millisecondsSpentInSession>
		//    8   16:aload_0         
		//    9   17:getfield        #33  <Field int interruptionCount>
		//   10   20:aload_0         
		//   11   21:getfield        #35  <Field String firstOpenSourceApplication>
		//   12   24:aconst_null     
		//   13   25:invokespecial   #41  <Method void FacebookTimeSpentData(long, long, long, int, String, FacebookTimeSpentData$1)>
		//   14   28:areturn         
		}

		private static final long serialVersionUID = 6L;
		private final String firstOpenSourceApplication;
		private final int interruptionCount;
		private final long lastResumeTime;
		private final long lastSuspendTime;
		private final long millisecondsSpentInSession;

		SerializationProxyV2(long l, long l1, long l2, int i, 
				String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			lastResumeTime = l;
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:putfield        #27  <Field long lastResumeTime>
			lastSuspendTime = l1;
		//    5    9:aload_0         
		//    6   10:lload_3         
		//    7   11:putfield        #29  <Field long lastSuspendTime>
			millisecondsSpentInSession = l2;
		//    8   14:aload_0         
		//    9   15:lload           5
		//   10   17:putfield        #31  <Field long millisecondsSpentInSession>
			interruptionCount = i;
		//   11   20:aload_0         
		//   12   21:iload           7
		//   13   23:putfield        #33  <Field int interruptionCount>
			firstOpenSourceApplication = s;
		//   14   26:aload_0         
		//   15   27:aload           8
		//   16   29:putfield        #35  <Field String firstOpenSourceApplication>
		//   17   32:return          
		}
	}


	FacebookTimeSpentData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void Object()>
		resetSession();
	//    2    4:aload_0         
	//    3    5:invokespecial   #101 <Method void resetSession()>
	//    4    8:return          
	}

	private FacebookTimeSpentData(long l, long l1, long l2, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void Object()>
		resetSession();
	//    2    4:aload_0         
	//    3    5:invokespecial   #101 <Method void resetSession()>
		lastResumeTime = l;
	//    4    8:aload_0         
	//    5    9:lload_1         
	//    6   10:putfield        #104 <Field long lastResumeTime>
		lastSuspendTime = l1;
	//    7   13:aload_0         
	//    8   14:lload_3         
	//    9   15:putfield        #106 <Field long lastSuspendTime>
		millisecondsSpentInSession = l2;
	//   10   18:aload_0         
	//   11   19:lload           5
	//   12   21:putfield        #108 <Field long millisecondsSpentInSession>
		interruptionCount = i;
	//   13   24:aload_0         
	//   14   25:iload           7
	//   15   27:putfield        #110 <Field int interruptionCount>
	//   16   30:return          
	}

	FacebookTimeSpentData(long l, long l1, long l2, int i, 
			_cls1 _pcls1)
	{
		this(l, l1, l2, i);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_3         
	//    3    3:lload           5
	//    4    5:iload           7
	//    5    7:invokespecial   #113 <Method void FacebookTimeSpentData(long, long, long, int)>
	//    6   10:return          
	}

	private FacebookTimeSpentData(long l, long l1, long l2, int i, 
			String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void Object()>
		resetSession();
	//    2    4:aload_0         
	//    3    5:invokespecial   #101 <Method void resetSession()>
		lastResumeTime = l;
	//    4    8:aload_0         
	//    5    9:lload_1         
	//    6   10:putfield        #104 <Field long lastResumeTime>
		lastSuspendTime = l1;
	//    7   13:aload_0         
	//    8   14:lload_3         
	//    9   15:putfield        #106 <Field long lastSuspendTime>
		millisecondsSpentInSession = l2;
	//   10   18:aload_0         
	//   11   19:lload           5
	//   12   21:putfield        #108 <Field long millisecondsSpentInSession>
		interruptionCount = i;
	//   13   24:aload_0         
	//   14   25:iload           7
	//   15   27:putfield        #110 <Field int interruptionCount>
		firstOpenSourceApplication = s;
	//   16   30:aload_0         
	//   17   31:aload           8
	//   18   33:putfield        #116 <Field String firstOpenSourceApplication>
	//   19   36:return          
	}

	FacebookTimeSpentData(long l, long l1, long l2, int i, 
			String s, _cls1 _pcls1)
	{
		this(l, l1, l2, i, s);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_3         
	//    3    3:lload           5
	//    4    5:iload           7
	//    5    7:aload           8
	//    6    9:invokespecial   #119 <Method void FacebookTimeSpentData(long, long, long, int, String)>
	//    7   12:return          
	}

	private static int getQuantaIndex(long l)
	{
		int i;
		for(i = 0; i < INACTIVE_SECONDS_QUANTA.length && INACTIVE_SECONDS_QUANTA[i] < l; i++);
	//    0    0:iconst_0        
	//    1    1:istore_2        
	//    2    2:iload_2         
	//    3    3:getstatic       #94  <Field long[] INACTIVE_SECONDS_QUANTA>
	//    4    6:arraylength     
	//    5    7:icmpge          27
	//    6   10:getstatic       #94  <Field long[] INACTIVE_SECONDS_QUANTA>
	//    7   13:iload_2         
	//    8   14:laload          
	//    9   15:lload_0         
	//   10   16:lcmp            
	//   11   17:ifge            27
	//   12   20:iload_2         
	//   13   21:iconst_1        
	//   14   22:iadd            
	//   15   23:istore_2        
	//*  16   24:goto            2
		return i;
	//   17   27:iload_2         
	//   18   28:ireturn         
	}

	private boolean isColdLaunch()
	{
		boolean flag = isWarmLaunch;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field boolean isWarmLaunch>
	//    2    4:istore_1        
		isWarmLaunch = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #125 <Field boolean isWarmLaunch>
		return flag ^ true;
	//    6   10:iload_1         
	//    7   11:iconst_1        
	//    8   12:ixor            
	//    9   13:ireturn         
	}

	private void logAppDeactivatedEvent(AppEventsLogger appeventslogger, long l)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #129 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #130 <Method void Bundle()>
	//    3    7:astore          4
		bundle.putInt("fb_mobile_app_interruptions", interruptionCount);
	//    4    9:aload           4
	//    5   11:ldc1            #132 <String "fb_mobile_app_interruptions">
	//    6   13:aload_0         
	//    7   14:getfield        #110 <Field int interruptionCount>
	//    8   17:invokevirtual   #136 <Method void Bundle.putInt(String, int)>
		bundle.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[] {
			Integer.valueOf(getQuantaIndex(l))
		}));
	//    9   20:aload           4
	//   10   22:ldc1            #138 <String "fb_mobile_time_between_sessions">
	//   11   24:getstatic       #144 <Field Locale Locale.ROOT>
	//   12   27:ldc1            #146 <String "session_quanta_%d">
	//   13   29:iconst_1        
	//   14   30:anewarray       Object[]
	//   15   33:dup             
	//   16   34:iconst_0        
	//   17   35:lload_2         
	//   18   36:invokestatic    #148 <Method int getQuantaIndex(long)>
	//   19   39:invokestatic    #154 <Method Integer Integer.valueOf(int)>
	//   20   42:aastore         
	//   21   43:invokestatic    #160 <Method String String.format(Locale, String, Object[])>
	//   22   46:invokevirtual   #164 <Method void Bundle.putString(String, String)>
		bundle.putString("fb_mobile_launch_source", firstOpenSourceApplication);
	//   23   49:aload           4
	//   24   51:ldc1            #166 <String "fb_mobile_launch_source">
	//   25   53:aload_0         
	//   26   54:getfield        #116 <Field String firstOpenSourceApplication>
	//   27   57:invokevirtual   #164 <Method void Bundle.putString(String, String)>
		appeventslogger.logEvent("fb_mobile_deactivate_app", millisecondsSpentInSession / 1000L, bundle);
	//   28   60:aload_1         
	//   29   61:ldc1            #168 <String "fb_mobile_deactivate_app">
	//   30   63:aload_0         
	//   31   64:getfield        #108 <Field long millisecondsSpentInSession>
	//   32   67:ldc2w           #25  <Long 1000L>
	//   33   70:ldiv            
	//   34   71:l2d             
	//   35   72:aload           4
	//   36   74:invokevirtual   #172 <Method void AppEventsLogger.logEvent(String, double, Bundle)>
		resetSession();
	//   37   77:aload_0         
	//   38   78:invokespecial   #101 <Method void resetSession()>
	//   39   81:return          
	}

	private void resetSession()
	{
		isAppActive = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #174 <Field boolean isAppActive>
		lastResumeTime = -1L;
	//    3    5:aload_0         
	//    4    6:ldc2w           #20  <Long -1L>
	//    5    9:putfield        #104 <Field long lastResumeTime>
		lastSuspendTime = -1L;
	//    6   12:aload_0         
	//    7   13:ldc2w           #20  <Long -1L>
	//    8   16:putfield        #106 <Field long lastSuspendTime>
		interruptionCount = 0;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #110 <Field int interruptionCount>
		millisecondsSpentInSession = 0L;
	//   12   24:aload_0         
	//   13   25:lconst_0        
	//   14   26:putfield        #108 <Field long millisecondsSpentInSession>
	//   15   29:return          
	}

	private boolean wasSuspendedEver()
	{
		return lastSuspendTime != -1L;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field long lastSuspendTime>
	//    2    4:ldc2w           #20  <Long -1L>
	//    3    7:lcmp            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private Object writeReplace()
	{
		return ((Object) (new SerializationProxyV2(lastResumeTime, lastSuspendTime, millisecondsSpentInSession, interruptionCount, firstOpenSourceApplication)));
	//    0    0:new             #13  <Class FacebookTimeSpentData$SerializationProxyV2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #104 <Field long lastResumeTime>
	//    4    8:aload_0         
	//    5    9:getfield        #106 <Field long lastSuspendTime>
	//    6   12:aload_0         
	//    7   13:getfield        #108 <Field long millisecondsSpentInSession>
	//    8   16:aload_0         
	//    9   17:getfield        #110 <Field int interruptionCount>
	//   10   20:aload_0         
	//   11   21:getfield        #116 <Field String firstOpenSourceApplication>
	//   12   24:invokespecial   #178 <Method void FacebookTimeSpentData$SerializationProxyV2(long, long, long, int, String)>
	//   13   27:areturn         
	}

	void onResume(AppEventsLogger appeventslogger, long l, String s)
	{
		if(isColdLaunch() || l - lastActivateEventLoggedTime > 0x493e0L)
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #182 <Method boolean isColdLaunch()>
	//*   2    4:ifne            20
	//*   3    7:lload_2         
	//*   4    8:aload_0         
	//*   5    9:getfield        #184 <Field long lastActivateEventLoggedTime>
	//*   6   12:lsub            
	//*   7   13:ldc2w           #17  <Long 0x493e0L>
	//*   8   16:lcmp            
	//*   9   17:ifle            51
		{
			Bundle bundle = new Bundle();
	//   10   20:new             #129 <Class Bundle>
	//   11   23:dup             
	//   12   24:invokespecial   #130 <Method void Bundle()>
	//   13   27:astore          10
			bundle.putString("fb_mobile_launch_source", s);
	//   14   29:aload           10
	//   15   31:ldc1            #166 <String "fb_mobile_launch_source">
	//   16   33:aload           4
	//   17   35:invokevirtual   #164 <Method void Bundle.putString(String, String)>
			appeventslogger.logEvent("fb_mobile_activate_app", bundle);
	//   18   38:aload_1         
	//   19   39:ldc1            #186 <String "fb_mobile_activate_app">
	//   20   41:aload           10
	//   21   43:invokevirtual   #189 <Method void AppEventsLogger.logEvent(String, Bundle)>
			lastActivateEventLoggedTime = l;
	//   22   46:aload_0         
	//   23   47:lload_2         
	//   24   48:putfield        #184 <Field long lastActivateEventLoggedTime>
		}
		if(isAppActive)
	//*  25   51:aload_0         
	//*  26   52:getfield        #174 <Field boolean isAppActive>
	//*  27   55:ifeq            70
		{
			Logger.log(LoggingBehavior.APP_EVENTS, TAG, "Resume for active app");
	//   28   58:getstatic       #195 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//   29   61:getstatic       #56  <Field String TAG>
	//   30   64:ldc1            #197 <String "Resume for active app">
	//   31   66:invokestatic    #203 <Method void Logger.log(LoggingBehavior, String, String)>
			return;
	//   32   69:return          
		}
		boolean flag = wasSuspendedEver();
	//   33   70:aload_0         
	//   34   71:invokespecial   #205 <Method boolean wasSuspendedEver()>
	//   35   74:istore          9
		long l2 = 0L;
	//   36   76:lconst_0        
	//   37   77:lstore          7
		long l1;
		if(flag)
	//*  38   79:iload           9
	//*  39   81:ifeq            95
			l1 = l - lastSuspendTime;
	//   40   84:lload_2         
	//   41   85:aload_0         
	//   42   86:getfield        #106 <Field long lastSuspendTime>
	//   43   89:lsub            
	//   44   90:lstore          5
		else
	//*  45   92:goto            98
			l1 = 0L;
	//   46   95:lconst_0        
	//   47   96:lstore          5
		if(l1 < 0L)
	//*  48   98:lload           5
	//*  49  100:lconst_0        
	//*  50  101:lcmp            
	//*  51  102:ifge            123
		{
			Logger.log(LoggingBehavior.APP_EVENTS, TAG, "Clock skew detected");
	//   52  105:getstatic       #195 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//   53  108:getstatic       #56  <Field String TAG>
	//   54  111:ldc1            #207 <String "Clock skew detected">
	//   55  113:invokestatic    #203 <Method void Logger.log(LoggingBehavior, String, String)>
			l1 = l2;
	//   56  116:lload           7
	//   57  118:lstore          5
		}
	//*  58  120:goto            123
		if(l1 > 60000L)
	//*  59  123:lload           5
	//*  60  125:ldc2w           #28  <Long 60000L>
	//*  61  128:lcmp            
	//*  62  129:ifle            142
			logAppDeactivatedEvent(appeventslogger, l1);
	//   63  132:aload_0         
	//   64  133:aload_1         
	//   65  134:lload           5
	//   66  136:invokespecial   #209 <Method void logAppDeactivatedEvent(AppEventsLogger, long)>
		else
	//*  67  139:goto            161
		if(l1 > 1000L)
	//*  68  142:lload           5
	//*  69  144:ldc2w           #25  <Long 1000L>
	//*  70  147:lcmp            
	//*  71  148:ifle            161
			interruptionCount = interruptionCount + 1;
	//   72  151:aload_0         
	//   73  152:aload_0         
	//   74  153:getfield        #110 <Field int interruptionCount>
	//   75  156:iconst_1        
	//   76  157:iadd            
	//   77  158:putfield        #110 <Field int interruptionCount>
		if(interruptionCount == 0)
	//*  78  161:aload_0         
	//*  79  162:getfield        #110 <Field int interruptionCount>
	//*  80  165:ifne            174
			firstOpenSourceApplication = s;
	//   81  168:aload_0         
	//   82  169:aload           4
	//   83  171:putfield        #116 <Field String firstOpenSourceApplication>
		lastResumeTime = l;
	//   84  174:aload_0         
	//   85  175:lload_2         
	//   86  176:putfield        #104 <Field long lastResumeTime>
		isAppActive = true;
	//   87  179:aload_0         
	//   88  180:iconst_1        
	//   89  181:putfield        #174 <Field boolean isAppActive>
	//   90  184:return          
	}

	void onSuspend(AppEventsLogger appeventslogger, long l)
	{
		if(!isAppActive)
	//*   0    0:aload_0         
	//*   1    1:getfield        #174 <Field boolean isAppActive>
	//*   2    4:ifne            19
		{
			Logger.log(LoggingBehavior.APP_EVENTS, TAG, "Suspend for inactive app");
	//    3    7:getstatic       #195 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//    4   10:getstatic       #56  <Field String TAG>
	//    5   13:ldc1            #212 <String "Suspend for inactive app">
	//    6   15:invokestatic    #203 <Method void Logger.log(LoggingBehavior, String, String)>
			return;
	//    7   18:return          
		}
		long l1 = l - lastResumeTime;
	//    8   19:lload_2         
	//    9   20:aload_0         
	//   10   21:getfield        #104 <Field long lastResumeTime>
	//   11   24:lsub            
	//   12   25:lstore          4
		long l2 = 0L;
	//   13   27:lconst_0        
	//   14   28:lstore          6
		if(l1 < 0L)
	//*  15   30:lload           4
	//*  16   32:lconst_0        
	//*  17   33:lcmp            
	//*  18   34:ifge            55
		{
			Logger.log(LoggingBehavior.APP_EVENTS, TAG, "Clock skew detected");
	//   19   37:getstatic       #195 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//   20   40:getstatic       #56  <Field String TAG>
	//   21   43:ldc1            #207 <String "Clock skew detected">
	//   22   45:invokestatic    #203 <Method void Logger.log(LoggingBehavior, String, String)>
			l1 = l2;
	//   23   48:lload           6
	//   24   50:lstore          4
		}
	//*  25   52:goto            55
		millisecondsSpentInSession = millisecondsSpentInSession + l1;
	//   26   55:aload_0         
	//   27   56:aload_0         
	//   28   57:getfield        #108 <Field long millisecondsSpentInSession>
	//   29   60:lload           4
	//   30   62:ladd            
	//   31   63:putfield        #108 <Field long millisecondsSpentInSession>
		lastSuspendTime = l;
	//   32   66:aload_0         
	//   33   67:lload_2         
	//   34   68:putfield        #106 <Field long lastSuspendTime>
		isAppActive = false;
	//   35   71:aload_0         
	//   36   72:iconst_0        
	//   37   73:putfield        #174 <Field boolean isAppActive>
	//   38   76:return          
	}

	private static final long APP_ACTIVATE_SUPPRESSION_PERIOD_IN_MILLISECONDS = 0x493e0L;
	private static final long FIRST_TIME_LOAD_RESUME_TIME = -1L;
	private static final long INACTIVE_SECONDS_QUANTA[] = {
		0x493e0L, 0xdbba0L, 0x1b7740L, 0x36ee80L, 0x1499700L, 0x2932e00L, 0x5265c00L, 0xa4cb800L, 0xf731400L, 0x240c8400L, 
		0x48190800L, 0x6c258c00L, 0x90321000L, 0x34fd9000L, 0xcf7c5800L, 0x69fb2000L, 0x479e800L, 0x9ef8b000L, 0x57b12c00L
	};
	private static final long INTERRUPTION_THRESHOLD_MILLISECONDS = 1000L;
	private static final long NUM_MILLISECONDS_IDLE_TO_BE_NEW_SESSION = 60000L;
	private static final String TAG = ((Class) (com/facebook/appevents/AppEventsLogger)).getCanonicalName();
	private static final long serialVersionUID = 1L;
	private String firstOpenSourceApplication;
	private int interruptionCount;
	private boolean isAppActive;
	private boolean isWarmLaunch;
	private long lastActivateEventLoggedTime;
	private long lastResumeTime;
	private long lastSuspendTime;
	private long millisecondsSpentInSession;

	static 
	{
	//    0    0:ldc1            #48  <Class AppEventsLogger>
	//    1    2:invokevirtual   #54  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #56  <Field String TAG>
	//    3    8:bipush          19
	//    4   10:newarray        long[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:ldc2w           #17  <Long 0x493e0L>
	//    8   17:lastore         
	//    9   18:dup             
	//   10   19:iconst_1        
	//   11   20:ldc2w           #57  <Long 0xdbba0L>
	//   12   23:lastore         
	//   13   24:dup             
	//   14   25:iconst_2        
	//   15   26:ldc2w           #59  <Long 0x1b7740L>
	//   16   29:lastore         
	//   17   30:dup             
	//   18   31:iconst_3        
	//   19   32:ldc2w           #61  <Long 0x36ee80L>
	//   20   35:lastore         
	//   21   36:dup             
	//   22   37:iconst_4        
	//   23   38:ldc2w           #63  <Long 0x1499700L>
	//   24   41:lastore         
	//   25   42:dup             
	//   26   43:iconst_5        
	//   27   44:ldc2w           #65  <Long 0x2932e00L>
	//   28   47:lastore         
	//   29   48:dup             
	//   30   49:bipush          6
	//   31   51:ldc2w           #67  <Long 0x5265c00L>
	//   32   54:lastore         
	//   33   55:dup             
	//   34   56:bipush          7
	//   35   58:ldc2w           #69  <Long 0xa4cb800L>
	//   36   61:lastore         
	//   37   62:dup             
	//   38   63:bipush          8
	//   39   65:ldc2w           #71  <Long 0xf731400L>
	//   40   68:lastore         
	//   41   69:dup             
	//   42   70:bipush          9
	//   43   72:ldc2w           #73  <Long 0x240c8400L>
	//   44   75:lastore         
	//   45   76:dup             
	//   46   77:bipush          10
	//   47   79:ldc2w           #75  <Long 0x48190800L>
	//   48   82:lastore         
	//   49   83:dup             
	//   50   84:bipush          11
	//   51   86:ldc2w           #77  <Long 0x6c258c00L>
	//   52   89:lastore         
	//   53   90:dup             
	//   54   91:bipush          12
	//   55   93:ldc2w           #79  <Long 0x90321000L>
	//   56   96:lastore         
	//   57   97:dup             
	//   58   98:bipush          13
	//   59  100:ldc2w           #81  <Long 0x34fd9000L>
	//   60  103:lastore         
	//   61  104:dup             
	//   62  105:bipush          14
	//   63  107:ldc2w           #83  <Long 0xcf7c5800L>
	//   64  110:lastore         
	//   65  111:dup             
	//   66  112:bipush          15
	//   67  114:ldc2w           #85  <Long 0x69fb2000L>
	//   68  117:lastore         
	//   69  118:dup             
	//   70  119:bipush          16
	//   71  121:ldc2w           #87  <Long 0x479e800L>
	//   72  124:lastore         
	//   73  125:dup             
	//   74  126:bipush          17
	//   75  128:ldc2w           #89  <Long 0x9ef8b000L>
	//   76  131:lastore         
	//   77  132:dup             
	//   78  133:bipush          18
	//   79  135:ldc2w           #91  <Long 0x57b12c00L>
	//   80  138:lastore         
	//   81  139:putstatic       #94  <Field long[] INACTIVE_SECONDS_QUANTA>
	//*  82  142:return          
	}
}
