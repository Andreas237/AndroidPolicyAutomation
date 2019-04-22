// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.Logger;
import java.util.Locale;

// Referenced classes of package com.facebook.appevents.internal:
//			SourceApplicationInfo, InternalAppEventsLogger, SessionInfo

class SessionLogger
{

	SessionLogger()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void Object()>
	//    2    4:return          
	}

	private static int getQuantaIndex(long l)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		do
		{
			long al[] = INACTIVE_SECONDS_QUANTA;
	//    2    2:getstatic       #58  <Field long[] INACTIVE_SECONDS_QUANTA>
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

	public static void logActivateApp(Context context, String s, SourceApplicationInfo sourceapplicationinfo, String s1)
	{
		if(sourceapplicationinfo != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          12
			context = ((Context) (sourceapplicationinfo.toString()));
	//    2    4:aload_2         
	//    3    5:invokevirtual   #71  <Method String SourceApplicationInfo.toString()>
	//    4    8:astore_0        
		else
	//*   5    9:goto            15
			context = "Unclassified";
	//    6   12:ldc1            #73  <String "Unclassified">
	//    7   14:astore_0        
		sourceapplicationinfo = ((SourceApplicationInfo) (new Bundle()));
	//    8   15:new             #75  <Class Bundle>
	//    9   18:dup             
	//   10   19:invokespecial   #76  <Method void Bundle()>
	//   11   22:astore_2        
		((Bundle) (sourceapplicationinfo)).putString("fb_mobile_launch_source", ((String) (context)));
	//   12   23:aload_2         
	//   13   24:ldc1            #78  <String "fb_mobile_launch_source">
	//   14   26:aload_0         
	//   15   27:invokevirtual   #82  <Method void Bundle.putString(String, String)>
		context = ((Context) (new InternalAppEventsLogger(s, s1, ((com.facebook.AccessToken) (null)))));
	//   16   30:new             #84  <Class InternalAppEventsLogger>
	//   17   33:dup             
	//   18   34:aload_1         
	//   19   35:aload_3         
	//   20   36:aconst_null     
	//   21   37:invokespecial   #87  <Method void InternalAppEventsLogger(String, String, com.facebook.AccessToken)>
	//   22   40:astore_0        
		((AppEventsLogger) (context)).logEvent("fb_mobile_activate_app", ((Bundle) (sourceapplicationinfo)));
	//   23   41:aload_0         
	//   24   42:ldc1            #89  <String "fb_mobile_activate_app">
	//   25   44:aload_2         
	//   26   45:invokevirtual   #95  <Method void AppEventsLogger.logEvent(String, Bundle)>
		if(AppEventsLogger.getFlushBehavior() != com.facebook.appevents.AppEventsLogger.FlushBehavior.EXPLICIT_ONLY)
	//*  27   48:invokestatic    #99  <Method com.facebook.appevents.AppEventsLogger$FlushBehavior AppEventsLogger.getFlushBehavior()>
	//*  28   51:getstatic       #105 <Field com.facebook.appevents.AppEventsLogger$FlushBehavior com.facebook.appevents.AppEventsLogger$FlushBehavior.EXPLICIT_ONLY>
	//*  29   54:if_acmpeq       61
			((AppEventsLogger) (context)).flush();
	//   30   57:aload_0         
	//   31   58:invokevirtual   #108 <Method void AppEventsLogger.flush()>
	//   32   61:return          
	}

	private static void logClockSkewEvent()
	{
		Logger.log(LoggingBehavior.APP_EVENTS, TAG, "Clock skew detected");
	//    0    0:getstatic       #115 <Field LoggingBehavior LoggingBehavior.APP_EVENTS>
	//    1    3:getstatic       #18  <Field String TAG>
	//    2    6:ldc1            #117 <String "Clock skew detected">
	//    3    8:invokestatic    #123 <Method void Logger.log(LoggingBehavior, String, String)>
	//    4   11:return          
	}

	public static void logDeactivateApp(Context context, String s, SessionInfo sessioninfo, String s1)
	{
		context = ((Context) (Long.valueOf(sessioninfo.getDiskRestoreTime() - sessioninfo.getSessionLastEventTime().longValue())));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #131 <Method long SessionInfo.getDiskRestoreTime()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #135 <Method Long SessionInfo.getSessionLastEventTime()>
	//    4    8:invokevirtual   #140 <Method long Long.longValue()>
	//    5   11:lsub            
	//    6   12:invokestatic    #144 <Method Long Long.valueOf(long)>
	//    7   15:astore_0        
		Object obj = ((Object) (context));
	//    8   16:aload_0         
	//    9   17:astore          4
		if(((Long) (context)).longValue() < 0L)
	//*  10   19:aload_0         
	//*  11   20:invokevirtual   #140 <Method long Long.longValue()>
	//*  12   23:lconst_0        
	//*  13   24:lcmp            
	//*  14   25:ifge            37
		{
			obj = ((Object) (Long.valueOf(0L)));
	//   15   28:lconst_0        
	//   16   29:invokestatic    #144 <Method Long Long.valueOf(long)>
	//   17   32:astore          4
			logClockSkewEvent();
	//   18   34:invokestatic    #146 <Method void logClockSkewEvent()>
		}
		Object obj1 = ((Object) (Long.valueOf(sessioninfo.getSessionLength())));
	//   19   37:aload_2         
	//   20   38:invokevirtual   #149 <Method long SessionInfo.getSessionLength()>
	//   21   41:invokestatic    #144 <Method Long Long.valueOf(long)>
	//   22   44:astore          5
		context = ((Context) (obj1));
	//   23   46:aload           5
	//   24   48:astore_0        
		if(((Long) (obj1)).longValue() < 0L)
	//*  25   49:aload           5
	//*  26   51:invokevirtual   #140 <Method long Long.longValue()>
	//*  27   54:lconst_0        
	//*  28   55:lcmp            
	//*  29   56:ifge            67
		{
			logClockSkewEvent();
	//   30   59:invokestatic    #146 <Method void logClockSkewEvent()>
			context = ((Context) (Long.valueOf(0L)));
	//   31   62:lconst_0        
	//   32   63:invokestatic    #144 <Method Long Long.valueOf(long)>
	//   33   66:astore_0        
		}
		obj1 = ((Object) (new Bundle()));
	//   34   67:new             #75  <Class Bundle>
	//   35   70:dup             
	//   36   71:invokespecial   #76  <Method void Bundle()>
	//   37   74:astore          5
		((Bundle) (obj1)).putInt("fb_mobile_app_interruptions", sessioninfo.getInterruptionCount());
	//   38   76:aload           5
	//   39   78:ldc1            #151 <String "fb_mobile_app_interruptions">
	//   40   80:aload_2         
	//   41   81:invokevirtual   #155 <Method int SessionInfo.getInterruptionCount()>
	//   42   84:invokevirtual   #159 <Method void Bundle.putInt(String, int)>
		((Bundle) (obj1)).putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[] {
			Integer.valueOf(getQuantaIndex(((Long) (obj)).longValue()))
		}));
	//   43   87:aload           5
	//   44   89:ldc1            #161 <String "fb_mobile_time_between_sessions">
	//   45   91:getstatic       #167 <Field Locale Locale.ROOT>
	//   46   94:ldc1            #169 <String "session_quanta_%d">
	//   47   96:iconst_1        
	//   48   97:anewarray       Object[]
	//   49  100:dup             
	//   50  101:iconst_0        
	//   51  102:aload           4
	//   52  104:invokevirtual   #140 <Method long Long.longValue()>
	//   53  107:invokestatic    #171 <Method int getQuantaIndex(long)>
	//   54  110:invokestatic    #176 <Method Integer Integer.valueOf(int)>
	//   55  113:aastore         
	//   56  114:invokestatic    #182 <Method String String.format(Locale, String, Object[])>
	//   57  117:invokevirtual   #82  <Method void Bundle.putString(String, String)>
		obj = ((Object) (sessioninfo.getSourceApplicationInfo()));
	//   58  120:aload_2         
	//   59  121:invokevirtual   #186 <Method SourceApplicationInfo SessionInfo.getSourceApplicationInfo()>
	//   60  124:astore          4
		if(obj != null)
	//*  61  126:aload           4
	//*  62  128:ifnull          141
			obj = ((Object) (((SourceApplicationInfo) (obj)).toString()));
	//   63  131:aload           4
	//   64  133:invokevirtual   #71  <Method String SourceApplicationInfo.toString()>
	//   65  136:astore          4
		else
	//*  66  138:goto            145
			obj = "Unclassified";
	//   67  141:ldc1            #73  <String "Unclassified">
	//   68  143:astore          4
		((Bundle) (obj1)).putString("fb_mobile_launch_source", ((String) (obj)));
	//   69  145:aload           5
	//   70  147:ldc1            #78  <String "fb_mobile_launch_source">
	//   71  149:aload           4
	//   72  151:invokevirtual   #82  <Method void Bundle.putString(String, String)>
		((Bundle) (obj1)).putLong("_logTime", sessioninfo.getSessionLastEventTime().longValue() / 1000L);
	//   73  154:aload           5
	//   74  156:ldc1            #188 <String "_logTime">
	//   75  158:aload_2         
	//   76  159:invokevirtual   #135 <Method Long SessionInfo.getSessionLastEventTime()>
	//   77  162:invokevirtual   #140 <Method long Long.longValue()>
	//   78  165:ldc2w           #189 <Long 1000L>
	//   79  168:ldiv            
	//   80  169:invokevirtual   #194 <Method void Bundle.putLong(String, long)>
		(new InternalAppEventsLogger(s, s1, ((com.facebook.AccessToken) (null)))).logEvent("fb_mobile_deactivate_app", ((Long) (context)).longValue() / 1000L, ((Bundle) (obj1)));
	//   81  172:new             #84  <Class InternalAppEventsLogger>
	//   82  175:dup             
	//   83  176:aload_1         
	//   84  177:aload_3         
	//   85  178:aconst_null     
	//   86  179:invokespecial   #87  <Method void InternalAppEventsLogger(String, String, com.facebook.AccessToken)>
	//   87  182:ldc1            #196 <String "fb_mobile_deactivate_app">
	//   88  184:aload_0         
	//   89  185:invokevirtual   #140 <Method long Long.longValue()>
	//   90  188:ldc2w           #189 <Long 1000L>
	//   91  191:ldiv            
	//   92  192:l2d             
	//   93  193:aload           5
	//   94  195:invokevirtual   #199 <Method void InternalAppEventsLogger.logEvent(String, double, Bundle)>
	//   95  198:return          
	}

	private static final long INACTIVE_SECONDS_QUANTA[] = {
		0x493e0L, 0xdbba0L, 0x1b7740L, 0x36ee80L, 0x1499700L, 0x2932e00L, 0x5265c00L, 0xa4cb800L, 0xf731400L, 0x240c8400L, 
		0x48190800L, 0x6c258c00L, 0x90321000L, 0x34fd9000L, 0xcf7c5800L, 0x69fb2000L, 0x479e800L, 0x9ef8b000L, 0x57b12c00L
	};
	private static final String TAG = ((Class) (com/facebook/appevents/internal/SessionLogger)).getCanonicalName();

	static 
	{
	//    0    0:ldc1            #2   <Class SessionLogger>
	//    1    2:invokevirtual   #16  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #18  <Field String TAG>
	//    3    8:bipush          19
	//    4   10:newarray        long[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:ldc2w           #19  <Long 0x493e0L>
	//    8   17:lastore         
	//    9   18:dup             
	//   10   19:iconst_1        
	//   11   20:ldc2w           #21  <Long 0xdbba0L>
	//   12   23:lastore         
	//   13   24:dup             
	//   14   25:iconst_2        
	//   15   26:ldc2w           #23  <Long 0x1b7740L>
	//   16   29:lastore         
	//   17   30:dup             
	//   18   31:iconst_3        
	//   19   32:ldc2w           #25  <Long 0x36ee80L>
	//   20   35:lastore         
	//   21   36:dup             
	//   22   37:iconst_4        
	//   23   38:ldc2w           #27  <Long 0x1499700L>
	//   24   41:lastore         
	//   25   42:dup             
	//   26   43:iconst_5        
	//   27   44:ldc2w           #29  <Long 0x2932e00L>
	//   28   47:lastore         
	//   29   48:dup             
	//   30   49:bipush          6
	//   31   51:ldc2w           #31  <Long 0x5265c00L>
	//   32   54:lastore         
	//   33   55:dup             
	//   34   56:bipush          7
	//   35   58:ldc2w           #33  <Long 0xa4cb800L>
	//   36   61:lastore         
	//   37   62:dup             
	//   38   63:bipush          8
	//   39   65:ldc2w           #35  <Long 0xf731400L>
	//   40   68:lastore         
	//   41   69:dup             
	//   42   70:bipush          9
	//   43   72:ldc2w           #37  <Long 0x240c8400L>
	//   44   75:lastore         
	//   45   76:dup             
	//   46   77:bipush          10
	//   47   79:ldc2w           #39  <Long 0x48190800L>
	//   48   82:lastore         
	//   49   83:dup             
	//   50   84:bipush          11
	//   51   86:ldc2w           #41  <Long 0x6c258c00L>
	//   52   89:lastore         
	//   53   90:dup             
	//   54   91:bipush          12
	//   55   93:ldc2w           #43  <Long 0x90321000L>
	//   56   96:lastore         
	//   57   97:dup             
	//   58   98:bipush          13
	//   59  100:ldc2w           #45  <Long 0x34fd9000L>
	//   60  103:lastore         
	//   61  104:dup             
	//   62  105:bipush          14
	//   63  107:ldc2w           #47  <Long 0xcf7c5800L>
	//   64  110:lastore         
	//   65  111:dup             
	//   66  112:bipush          15
	//   67  114:ldc2w           #49  <Long 0x69fb2000L>
	//   68  117:lastore         
	//   69  118:dup             
	//   70  119:bipush          16
	//   71  121:ldc2w           #51  <Long 0x479e800L>
	//   72  124:lastore         
	//   73  125:dup             
	//   74  126:bipush          17
	//   75  128:ldc2w           #53  <Long 0x9ef8b000L>
	//   76  131:lastore         
	//   77  132:dup             
	//   78  133:bipush          18
	//   79  135:ldc2w           #55  <Long 0x57b12c00L>
	//   80  138:lastore         
	//   81  139:putstatic       #58  <Field long[] INACTIVE_SECONDS_QUANTA>
	//*  82  142:return          
	}
}
