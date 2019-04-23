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
	//    1    1:invokespecial   #96  <Method void Object()>
		resetSession();
	//    2    4:aload_0         
	//    3    5:invokespecial   #99  <Method void resetSession()>
	//    4    8:return          
	}

	private FacebookTimeSpentData(long l, long l1, long l2, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method void Object()>
		resetSession();
	//    2    4:aload_0         
	//    3    5:invokespecial   #99  <Method void resetSession()>
		lastResumeTime = l;
	//    4    8:aload_0         
	//    5    9:lload_1         
	//    6   10:putfield        #102 <Field long lastResumeTime>
		lastSuspendTime = l1;
	//    7   13:aload_0         
	//    8   14:lload_3         
	//    9   15:putfield        #104 <Field long lastSuspendTime>
		millisecondsSpentInSession = l2;
	//   10   18:aload_0         
	//   11   19:lload           5
	//   12   21:putfield        #106 <Field long millisecondsSpentInSession>
		interruptionCount = i;
	//   13   24:aload_0         
	//   14   25:iload           7
	//   15   27:putfield        #108 <Field int interruptionCount>
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
	//    5    7:invokespecial   #111 <Method void FacebookTimeSpentData(long, long, long, int)>
	//    6   10:return          
	}

	private FacebookTimeSpentData(long l, long l1, long l2, int i, 
			String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method void Object()>
		resetSession();
	//    2    4:aload_0         
	//    3    5:invokespecial   #99  <Method void resetSession()>
		lastResumeTime = l;
	//    4    8:aload_0         
	//    5    9:lload_1         
	//    6   10:putfield        #102 <Field long lastResumeTime>
		lastSuspendTime = l1;
	//    7   13:aload_0         
	//    8   14:lload_3         
	//    9   15:putfield        #104 <Field long lastSuspendTime>
		millisecondsSpentInSession = l2;
	//   10   18:aload_0         
	//   11   19:lload           5
	//   12   21:putfield        #106 <Field long millisecondsSpentInSession>
		interruptionCount = i;
	//   13   24:aload_0         
	//   14   25:iload           7
	//   15   27:putfield        #108 <Field int interruptionCount>
		firstOpenSourceApplication = s;
	//   16   30:aload_0         
	//   17   31:aload           8
	//   18   33:putfield        #114 <Field String firstOpenSourceApplication>
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
	//    6    9:invokespecial   #117 <Method void FacebookTimeSpentData(long, long, long, int, String)>
	//    7   12:return          
	}

	private static int getQuantaIndex(long l)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		do
		{
			long al[] = INACTIVE_SECONDS_QUANTA;
	//    2    2:getstatic       #92  <Field long[] INACTIVE_SECONDS_QUANTA>
	//    3    5:astore_3        
			if(i < al.length && al[i] < l)
	//*   4    6:iload_2         
	//*   5    7:aload_3         
	//*   6    8:arraylength     
	//*   7    9:icmpge          27
	//*   8   12:aload_3         
	//*   9   13:iload_2         
	//*  10   14:laload          
	//*  11   15:lload_0         
	//*  12   16:lcmp            
	//*  13   17:ifge            27
				i++;
	//   14   20:iload_2         
	//   15   21:iconst_1        
	//   16   22:iadd            
	//   17   23:istore_2        
			else
	//*  18   24:goto            2
				return i;
	//   19   27:iload_2         
	//   20   28:ireturn         
		} while(true);
	}

	private boolean isColdLaunch()
	{
		boolean flag = isWarmLaunch;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field boolean isWarmLaunch>
	//    2    4:istore_1        
		isWarmLaunch = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #123 <Field boolean isWarmLaunch>
		return flag ^ true;
	//    6   10:iload_1         
	//    7   11:iconst_1        
	//    8   12:ixor            
	//    9   13:ireturn         
	}

	private void logAppDeactivatedEvent(AppEventsLogger appeventslogger, long l)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #127 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #128 <Method void Bundle()>
	//    3    7:astore          4
		bundle.putInt("fb_mobile_app_interruptions", interruptionCount);
	//    4    9:aload           4
	//    5   11:ldc1            #130 <String "fb_mobile_app_interruptions">
	//    6   13:aload_0         
	//    7   14:getfield        #108 <Field int interruptionCount>
	//    8   17:invokevirtual   #134 <Method void Bundle.putInt(String, int)>
		bundle.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[] {
			Integer.valueOf(getQuantaIndex(l))
		}));
	//    9   20:aload           4
	//   10   22:ldc1            #136 <String "fb_mobile_time_between_sessions">
	//   11   24:getstatic       #142 <Field Locale Locale.ROOT>
	//   12   27:ldc1            #144 <String "session_quanta_%d">
	//   13   29:iconst_1        
	//   14   30:anewarray       Object[]
	//   15   33:dup             
	//   16   34:iconst_0        
	//   17   35:lload_2         
	//   18   36:invokestatic    #146 <Method int getQuantaIndex(long)>
	//   19   39:invokestatic    #152 <Method Integer Integer.valueOf(int)>
	//   20   42:aastore         
	//   21   43:invokestatic    #158 <Method String String.format(Locale, String, Object[])>
	//   22   46:invokevirtual   #162 <Method void Bundle.putString(String, String)>
		bundle.putString("fb_mobile_launch_source", firstOpenSourceApplication);
	//   23   49:aload           4
	//   24   51:ldc1            #164 <String "fb_mobile_launch_source">
	//   25   53:aload_0         
	//   26   54:getfield        #114 <Field String firstOpenSourceApplication>
	//   27   57:invokevirtual   #162 <Method void Bundle.putString(String, String)>
		appeventslogger.logEvent("fb_mobile_deactivate_app", millisecondsSpentInSession / 1000L, bundle);
	//   28   60:aload_1         
	//   29   61:ldc1            #166 <String "fb_mobile_deactivate_app">
	//   30   63:aload_0         
	//   31   64:getfield        #106 <Field long millisecondsSpentInSession>
	//   32   67:ldc2w           #25  <Long 1000L>
	//   33   70:ldiv            
	//   34   71:l2d             
	//   35   72:aload           4
	//   36   74:invokevirtual   #172 <Method void AppEventsLogger.logEvent(String, double, Bundle)>
		resetSession();
	//   37   77:aload_0         
	//   38   78:invokespecial   #99  <Method void resetSession()>
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
	//    5    9:putfield        #102 <Field long lastResumeTime>
		lastSuspendTime = -1L;
	//    6   12:aload_0         
	//    7   13:ldc2w           #20  <Long -1L>
	//    8   16:putfield        #104 <Field long lastSuspendTime>
		interruptionCount = 0;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #108 <Field int interruptionCount>
		millisecondsSpentInSession = 0L;
	//   12   24:aload_0         
	//   13   25:lconst_0        
	//   14   26:putfield        #106 <Field long millisecondsSpentInSession>
	//   15   29:return          
	}

	private boolean wasSuspendedEver()
	{
		return lastSuspendTime != -1L;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field long lastSuspendTime>
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
	//    3    5:getfield        #102 <Field long lastResumeTime>
	//    4    8:aload_0         
	//    5    9:getfield        #104 <Field long lastSuspendTime>
	//    6   12:aload_0         
	//    7   13:getfield        #106 <Field long millisecondsSpentInSession>
	//    8   16:aload_0         
	//    9   17:getfield        #108 <Field int interruptionCount>
	//   10   20:aload_0         
	//   11   21:getfield        #114 <Field String firstOpenSourceApplication>
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
	//*   9   17:ifle            64
		{
			Bundle bundle = new Bundle();
	//   10   20:new             #127 <Class Bundle>
	//   11   23:dup             
	//   12   24:invokespecial   #128 <Method void Bundle()>
	//   13   27:astore          10
			bundle.putString("fb_mobile_launch_source", s);
	//   14   29:aload           10
	//   15   31:ldc1            #164 <String "fb_mobile_launch_source">
	//   16   33:aload           4
	//   17   35:invokevirtual   #162 <Method void Bundle.putString(String, String)>
			appeventslogger.logEvent("fb_mobile_activate_app", bundle);
	//   18   38:aload_1         
	//   19   39:ldc1            #186 <String "fb_mobile_activate_app">
	//   20   41:aload           10
	//   21   43:invokevirtual   #189 <Method void AppEventsLogger.logEvent(String, Bundle)>
			lastActivateEventLoggedTime = l;
	//   22   46:aload_0         
	//   23   47:lload_2         
	//   24   48:putfield        #184 <Field long lastActivateEventLoggedTime>
			if(AppEventsLogger.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY)
	//*  25   51:invokestatic    #193 <Method AppEventsLogger$FlushBehavior AppEventsLogger.getFlushBehavior()>
	//*  26   54:getstatic       #199 <Field AppEventsLogger$FlushBehavior AppEventsLogger$FlushBehavior.EXPLICIT_ONLY>
	//*  27   57:if_acmpeq       64
				appeventslogger.flush();
	//   28   60:aload_1         
	//   29   61:invokevirtual   #202 <Method void AppEventsLogger.flush()>
		}
		if(isAppActive)
	//*  30   64:aload_0         
	//*  31   65:getfield        #174 <Field boolean isAppActive>
	//*  32   68:ifeq            83
		{
			Logger.log(LoggingBehavior.APP_EVENTS, TAG, "Resume for active app");
	//   33   71:getstatic       #208 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//   34   74:getstatic       #54  <Field String TAG>
	//   35   77:ldc1            #210 <String "Resume for active app">
	//   36   79:invokestatic    #216 <Method void Logger.log(LoggingBehavior, String, String)>
			return;
	//   37   82:return          
		}
		boolean flag = wasSuspendedEver();
	//   38   83:aload_0         
	//   39   84:invokespecial   #218 <Method boolean wasSuspendedEver()>
	//   40   87:istore          9
		long l2 = 0L;
	//   41   89:lconst_0        
	//   42   90:lstore          7
		long l1;
		if(flag)
	//*  43   92:iload           9
	//*  44   94:ifeq            108
			l1 = l - lastSuspendTime;
	//   45   97:lload_2         
	//   46   98:aload_0         
	//   47   99:getfield        #104 <Field long lastSuspendTime>
	//   48  102:lsub            
	//   49  103:lstore          5
		else
	//*  50  105:goto            111
			l1 = 0L;
	//   51  108:lconst_0        
	//   52  109:lstore          5
		if(l1 < 0L)
	//*  53  111:lload           5
	//*  54  113:lconst_0        
	//*  55  114:lcmp            
	//*  56  115:ifge            136
		{
			Logger.log(LoggingBehavior.APP_EVENTS, TAG, "Clock skew detected");
	//   57  118:getstatic       #208 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//   58  121:getstatic       #54  <Field String TAG>
	//   59  124:ldc1            #220 <String "Clock skew detected">
	//   60  126:invokestatic    #216 <Method void Logger.log(LoggingBehavior, String, String)>
			l1 = l2;
	//   61  129:lload           7
	//   62  131:lstore          5
		}
	//*  63  133:goto            136
		if(l1 > 60000L)
	//*  64  136:lload           5
	//*  65  138:ldc2w           #28  <Long 60000L>
	//*  66  141:lcmp            
	//*  67  142:ifle            155
			logAppDeactivatedEvent(appeventslogger, l1);
	//   68  145:aload_0         
	//   69  146:aload_1         
	//   70  147:lload           5
	//   71  149:invokespecial   #222 <Method void logAppDeactivatedEvent(AppEventsLogger, long)>
		else
	//*  72  152:goto            174
		if(l1 > 1000L)
	//*  73  155:lload           5
	//*  74  157:ldc2w           #25  <Long 1000L>
	//*  75  160:lcmp            
	//*  76  161:ifle            174
			interruptionCount = interruptionCount + 1;
	//   77  164:aload_0         
	//   78  165:aload_0         
	//   79  166:getfield        #108 <Field int interruptionCount>
	//   80  169:iconst_1        
	//   81  170:iadd            
	//   82  171:putfield        #108 <Field int interruptionCount>
		if(interruptionCount == 0)
	//*  83  174:aload_0         
	//*  84  175:getfield        #108 <Field int interruptionCount>
	//*  85  178:ifne            187
			firstOpenSourceApplication = s;
	//   86  181:aload_0         
	//   87  182:aload           4
	//   88  184:putfield        #114 <Field String firstOpenSourceApplication>
		lastResumeTime = l;
	//   89  187:aload_0         
	//   90  188:lload_2         
	//   91  189:putfield        #102 <Field long lastResumeTime>
		isAppActive = true;
	//   92  192:aload_0         
	//   93  193:iconst_1        
	//   94  194:putfield        #174 <Field boolean isAppActive>
	//   95  197:return          
	}

	void onSuspend(AppEventsLogger appeventslogger, long l)
	{
		if(!isAppActive)
	//*   0    0:aload_0         
	//*   1    1:getfield        #174 <Field boolean isAppActive>
	//*   2    4:ifne            19
		{
			Logger.log(LoggingBehavior.APP_EVENTS, TAG, "Suspend for inactive app");
	//    3    7:getstatic       #208 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//    4   10:getstatic       #54  <Field String TAG>
	//    5   13:ldc1            #225 <String "Suspend for inactive app">
	//    6   15:invokestatic    #216 <Method void Logger.log(LoggingBehavior, String, String)>
			return;
	//    7   18:return          
		}
		long l2 = l - lastResumeTime;
	//    8   19:lload_2         
	//    9   20:aload_0         
	//   10   21:getfield        #102 <Field long lastResumeTime>
	//   11   24:lsub            
	//   12   25:lstore          6
		long l1 = l2;
	//   13   27:lload           6
	//   14   29:lstore          4
		if(l2 < 0L)
	//*  15   31:lload           6
	//*  16   33:lconst_0        
	//*  17   34:lcmp            
	//*  18   35:ifge            52
		{
			Logger.log(LoggingBehavior.APP_EVENTS, TAG, "Clock skew detected");
	//   19   38:getstatic       #208 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//   20   41:getstatic       #54  <Field String TAG>
	//   21   44:ldc1            #220 <String "Clock skew detected">
	//   22   46:invokestatic    #216 <Method void Logger.log(LoggingBehavior, String, String)>
			l1 = 0L;
	//   23   49:lconst_0        
	//   24   50:lstore          4
		}
		millisecondsSpentInSession = millisecondsSpentInSession + l1;
	//   25   52:aload_0         
	//   26   53:aload_0         
	//   27   54:getfield        #106 <Field long millisecondsSpentInSession>
	//   28   57:lload           4
	//   29   59:ladd            
	//   30   60:putfield        #106 <Field long millisecondsSpentInSession>
		lastSuspendTime = l;
	//   31   63:aload_0         
	//   32   64:lload_2         
	//   33   65:putfield        #104 <Field long lastSuspendTime>
		isAppActive = false;
	//   34   68:aload_0         
	//   35   69:iconst_0        
	//   36   70:putfield        #174 <Field boolean isAppActive>
	//   37   73:return          
	}

	private static final long APP_ACTIVATE_SUPPRESSION_PERIOD_IN_MILLISECONDS = 0x493e0L;
	private static final long FIRST_TIME_LOAD_RESUME_TIME = -1L;
	private static final long INACTIVE_SECONDS_QUANTA[] = {
		0x493e0L, 0xdbba0L, 0x1b7740L, 0x36ee80L, 0x1499700L, 0x2932e00L, 0x5265c00L, 0xa4cb800L, 0xf731400L, 0x240c8400L, 
		0x48190800L, 0x6c258c00L, 0x90321000L, 0x34fd9000L, 0xcf7c5800L, 0x69fb2000L, 0x479e800L, 0x9ef8b000L, 0x57b12c00L
	};
	private static final long INTERRUPTION_THRESHOLD_MILLISECONDS = 1000L;
	private static final long NUM_MILLISECONDS_IDLE_TO_BE_NEW_SESSION = 60000L;
	private static final String TAG = ((Class) (com/facebook/appevents/FacebookTimeSpentData)).getCanonicalName();
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
	//    0    0:ldc1            #2   <Class FacebookTimeSpentData>
	//    1    2:invokevirtual   #52  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #54  <Field String TAG>
	//    3    8:bipush          19
	//    4   10:newarray        long[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:ldc2w           #17  <Long 0x493e0L>
	//    8   17:lastore         
	//    9   18:dup             
	//   10   19:iconst_1        
	//   11   20:ldc2w           #55  <Long 0xdbba0L>
	//   12   23:lastore         
	//   13   24:dup             
	//   14   25:iconst_2        
	//   15   26:ldc2w           #57  <Long 0x1b7740L>
	//   16   29:lastore         
	//   17   30:dup             
	//   18   31:iconst_3        
	//   19   32:ldc2w           #59  <Long 0x36ee80L>
	//   20   35:lastore         
	//   21   36:dup             
	//   22   37:iconst_4        
	//   23   38:ldc2w           #61  <Long 0x1499700L>
	//   24   41:lastore         
	//   25   42:dup             
	//   26   43:iconst_5        
	//   27   44:ldc2w           #63  <Long 0x2932e00L>
	//   28   47:lastore         
	//   29   48:dup             
	//   30   49:bipush          6
	//   31   51:ldc2w           #65  <Long 0x5265c00L>
	//   32   54:lastore         
	//   33   55:dup             
	//   34   56:bipush          7
	//   35   58:ldc2w           #67  <Long 0xa4cb800L>
	//   36   61:lastore         
	//   37   62:dup             
	//   38   63:bipush          8
	//   39   65:ldc2w           #69  <Long 0xf731400L>
	//   40   68:lastore         
	//   41   69:dup             
	//   42   70:bipush          9
	//   43   72:ldc2w           #71  <Long 0x240c8400L>
	//   44   75:lastore         
	//   45   76:dup             
	//   46   77:bipush          10
	//   47   79:ldc2w           #73  <Long 0x48190800L>
	//   48   82:lastore         
	//   49   83:dup             
	//   50   84:bipush          11
	//   51   86:ldc2w           #75  <Long 0x6c258c00L>
	//   52   89:lastore         
	//   53   90:dup             
	//   54   91:bipush          12
	//   55   93:ldc2w           #77  <Long 0x90321000L>
	//   56   96:lastore         
	//   57   97:dup             
	//   58   98:bipush          13
	//   59  100:ldc2w           #79  <Long 0x34fd9000L>
	//   60  103:lastore         
	//   61  104:dup             
	//   62  105:bipush          14
	//   63  107:ldc2w           #81  <Long 0xcf7c5800L>
	//   64  110:lastore         
	//   65  111:dup             
	//   66  112:bipush          15
	//   67  114:ldc2w           #83  <Long 0x69fb2000L>
	//   68  117:lastore         
	//   69  118:dup             
	//   70  119:bipush          16
	//   71  121:ldc2w           #85  <Long 0x479e800L>
	//   72  124:lastore         
	//   73  125:dup             
	//   74  126:bipush          17
	//   75  128:ldc2w           #87  <Long 0x9ef8b000L>
	//   76  131:lastore         
	//   77  132:dup             
	//   78  133:bipush          18
	//   79  135:ldc2w           #89  <Long 0x57b12c00L>
	//   80  138:lastore         
	//   81  139:putstatic       #92  <Field long[] INACTIVE_SECONDS_QUANTA>
	//*  82  142:return          
	}
}
