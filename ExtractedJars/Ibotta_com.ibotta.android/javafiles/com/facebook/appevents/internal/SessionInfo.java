// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import java.util.UUID;

// Referenced classes of package com.facebook.appevents.internal:
//			SourceApplicationInfo

class SessionInfo
{

	public SessionInfo(Long long1, Long long2)
	{
		this(long1, long2, UUID.randomUUID());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #22  <Method UUID UUID.randomUUID()>
	//    4    6:invokespecial   #25  <Method void SessionInfo(Long, Long, UUID)>
	//    5    9:return          
	}

	public SessionInfo(Long long1, Long long2, UUID uuid)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		sessionStartTime = long1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field Long sessionStartTime>
		sessionLastEventTime = long2;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #33  <Field Long sessionLastEventTime>
		sessionId = uuid;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #35  <Field UUID sessionId>
	//   11   19:return          
	}

	public static void clearSavedSessionFromDisk()
	{
		android.content.SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
	//    0    0:invokestatic    #42  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    1    3:invokestatic    #48  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
	//    2    6:invokeinterface #54  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3   11:astore_0        
		editor.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
	//    4   12:aload_0         
	//    5   13:ldc1            #56  <String "com.facebook.appevents.SessionInfo.sessionStartTime">
	//    6   15:invokeinterface #62  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//    7   20:pop             
		editor.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
	//    8   21:aload_0         
	//    9   22:ldc1            #64  <String "com.facebook.appevents.SessionInfo.sessionEndTime">
	//   10   24:invokeinterface #62  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   11   29:pop             
		editor.remove("com.facebook.appevents.SessionInfo.interruptionCount");
	//   12   30:aload_0         
	//   13   31:ldc1            #66  <String "com.facebook.appevents.SessionInfo.interruptionCount">
	//   14   33:invokeinterface #62  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   15   38:pop             
		editor.remove("com.facebook.appevents.SessionInfo.sessionId");
	//   16   39:aload_0         
	//   17   40:ldc1            #68  <String "com.facebook.appevents.SessionInfo.sessionId">
	//   18   42:invokeinterface #62  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   19   47:pop             
		editor.apply();
	//   20   48:aload_0         
	//   21   49:invokeinterface #71  <Method void android.content.SharedPreferences$Editor.apply()>
		SourceApplicationInfo.clearSavedSourceApplicationInfoFromDisk();
	//   22   54:invokestatic    #76  <Method void SourceApplicationInfo.clearSavedSourceApplicationInfoFromDisk()>
	//   23   57:return          
	}

	public static SessionInfo getStoredSessionInfo()
	{
		SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext());
	//    0    0:invokestatic    #42  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    1    3:invokestatic    #48  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
	//    2    6:astore          4
		long l = sharedpreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
	//    3    8:aload           4
	//    4   10:ldc1            #56  <String "com.facebook.appevents.SessionInfo.sessionStartTime">
	//    5   12:lconst_0        
	//    6   13:invokeinterface #82  <Method long SharedPreferences.getLong(String, long)>
	//    7   18:lstore_0        
		long l1 = sharedpreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
	//    8   19:aload           4
	//    9   21:ldc1            #64  <String "com.facebook.appevents.SessionInfo.sessionEndTime">
	//   10   23:lconst_0        
	//   11   24:invokeinterface #82  <Method long SharedPreferences.getLong(String, long)>
	//   12   29:lstore_2        
		String s = sharedpreferences.getString("com.facebook.appevents.SessionInfo.sessionId", ((String) (null)));
	//   13   30:aload           4
	//   14   32:ldc1            #68  <String "com.facebook.appevents.SessionInfo.sessionId">
	//   15   34:aconst_null     
	//   16   35:invokeinterface #86  <Method String SharedPreferences.getString(String, String)>
	//   17   40:astore          5
		if(l != 0L && l1 != 0L)
	//*  18   42:lload_0         
	//*  19   43:lconst_0        
	//*  20   44:lcmp            
	//*  21   45:ifeq            125
	//*  22   48:lload_2         
	//*  23   49:lconst_0        
	//*  24   50:lcmp            
	//*  25   51:ifeq            125
		{
			if(s == null)
	//*  26   54:aload           5
	//*  27   56:ifnonnull       61
			{
				return null;
	//   28   59:aconst_null     
	//   29   60:areturn         
			} else
			{
				SessionInfo sessioninfo = new SessionInfo(Long.valueOf(l), Long.valueOf(l1));
	//   30   61:new             #2   <Class SessionInfo>
	//   31   64:dup             
	//   32   65:lload_0         
	//   33   66:invokestatic    #92  <Method Long Long.valueOf(long)>
	//   34   69:lload_2         
	//   35   70:invokestatic    #92  <Method Long Long.valueOf(long)>
	//   36   73:invokespecial   #94  <Method void SessionInfo(Long, Long)>
	//   37   76:astore          6
				sessioninfo.interruptionCount = sharedpreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
	//   38   78:aload           6
	//   39   80:aload           4
	//   40   82:ldc1            #66  <String "com.facebook.appevents.SessionInfo.interruptionCount">
	//   41   84:iconst_0        
	//   42   85:invokeinterface #98  <Method int SharedPreferences.getInt(String, int)>
	//   43   90:putfield        #100 <Field int interruptionCount>
				sessioninfo.sourceApplicationInfo = SourceApplicationInfo.getStoredSourceApplicatioInfo();
	//   44   93:aload           6
	//   45   95:invokestatic    #104 <Method SourceApplicationInfo SourceApplicationInfo.getStoredSourceApplicatioInfo()>
	//   46   98:putfield        #106 <Field SourceApplicationInfo sourceApplicationInfo>
				sessioninfo.diskRestoreTime = Long.valueOf(System.currentTimeMillis());
	//   47  101:aload           6
	//   48  103:invokestatic    #112 <Method long System.currentTimeMillis()>
	//   49  106:invokestatic    #92  <Method Long Long.valueOf(long)>
	//   50  109:putfield        #114 <Field Long diskRestoreTime>
				sessioninfo.sessionId = UUID.fromString(s);
	//   51  112:aload           6
	//   52  114:aload           5
	//   53  116:invokestatic    #118 <Method UUID UUID.fromString(String)>
	//   54  119:putfield        #35  <Field UUID sessionId>
				return sessioninfo;
	//   55  122:aload           6
	//   56  124:areturn         
			}
		} else
		{
			return null;
	//   57  125:aconst_null     
	//   58  126:areturn         
		}
	}

	public long getDiskRestoreTime()
	{
		Long long1 = diskRestoreTime;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field Long diskRestoreTime>
	//    2    4:astore_1        
		if(long1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0L;
	//    5    9:lconst_0        
	//    6   10:lreturn         
		else
			return long1.longValue();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #122 <Method long Long.longValue()>
	//    9   15:lreturn         
	}

	public int getInterruptionCount()
	{
		return interruptionCount;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field int interruptionCount>
	//    2    4:ireturn         
	}

	public UUID getSessionId()
	{
		return sessionId;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field UUID sessionId>
	//    2    4:areturn         
	}

	public Long getSessionLastEventTime()
	{
		return sessionLastEventTime;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Long sessionLastEventTime>
	//    2    4:areturn         
	}

	public long getSessionLength()
	{
		if(sessionStartTime != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Long sessionStartTime>
	//*   2    4:ifnull          32
		{
			Long long1 = sessionLastEventTime;
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field Long sessionLastEventTime>
	//    5   11:astore_1        
			if(long1 != null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       19
	//*   8   16:goto            32
				return long1.longValue() - sessionStartTime.longValue();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #122 <Method long Long.longValue()>
	//   11   23:aload_0         
	//   12   24:getfield        #31  <Field Long sessionStartTime>
	//   13   27:invokevirtual   #122 <Method long Long.longValue()>
	//   14   30:lsub            
	//   15   31:lreturn         
		}
		return 0L;
	//   16   32:lconst_0        
	//   17   33:lreturn         
	}

	public SourceApplicationInfo getSourceApplicationInfo()
	{
		return sourceApplicationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field SourceApplicationInfo sourceApplicationInfo>
	//    2    4:areturn         
	}

	public void incrementInterruptionCount()
	{
		interruptionCount = interruptionCount + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #100 <Field int interruptionCount>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #100 <Field int interruptionCount>
	//    6   10:return          
	}

	public void setSessionLastEventTime(Long long1)
	{
		sessionLastEventTime = long1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field Long sessionLastEventTime>
	//    3    5:return          
	}

	public void setSourceApplicationInfo(SourceApplicationInfo sourceapplicationinfo)
	{
		sourceApplicationInfo = sourceapplicationinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #106 <Field SourceApplicationInfo sourceApplicationInfo>
	//    3    5:return          
	}

	public void writeSessionToDisk()
	{
		Object obj = ((Object) (PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit()));
	//    0    0:invokestatic    #42  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    1    3:invokestatic    #48  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
	//    2    6:invokeinterface #54  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3   11:astore_1        
		((android.content.SharedPreferences.Editor) (obj)).putLong("com.facebook.appevents.SessionInfo.sessionStartTime", sessionStartTime.longValue());
	//    4   12:aload_1         
	//    5   13:ldc1            #56  <String "com.facebook.appevents.SessionInfo.sessionStartTime">
	//    6   15:aload_0         
	//    7   16:getfield        #31  <Field Long sessionStartTime>
	//    8   19:invokevirtual   #122 <Method long Long.longValue()>
	//    9   22:invokeinterface #139 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   10   27:pop             
		((android.content.SharedPreferences.Editor) (obj)).putLong("com.facebook.appevents.SessionInfo.sessionEndTime", sessionLastEventTime.longValue());
	//   11   28:aload_1         
	//   12   29:ldc1            #64  <String "com.facebook.appevents.SessionInfo.sessionEndTime">
	//   13   31:aload_0         
	//   14   32:getfield        #33  <Field Long sessionLastEventTime>
	//   15   35:invokevirtual   #122 <Method long Long.longValue()>
	//   16   38:invokeinterface #139 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   17   43:pop             
		((android.content.SharedPreferences.Editor) (obj)).putInt("com.facebook.appevents.SessionInfo.interruptionCount", interruptionCount);
	//   18   44:aload_1         
	//   19   45:ldc1            #66  <String "com.facebook.appevents.SessionInfo.interruptionCount">
	//   20   47:aload_0         
	//   21   48:getfield        #100 <Field int interruptionCount>
	//   22   51:invokeinterface #143 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   23   56:pop             
		((android.content.SharedPreferences.Editor) (obj)).putString("com.facebook.appevents.SessionInfo.sessionId", sessionId.toString());
	//   24   57:aload_1         
	//   25   58:ldc1            #68  <String "com.facebook.appevents.SessionInfo.sessionId">
	//   26   60:aload_0         
	//   27   61:getfield        #35  <Field UUID sessionId>
	//   28   64:invokevirtual   #147 <Method String UUID.toString()>
	//   29   67:invokeinterface #151 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   30   72:pop             
		((android.content.SharedPreferences.Editor) (obj)).apply();
	//   31   73:aload_1         
	//   32   74:invokeinterface #71  <Method void android.content.SharedPreferences$Editor.apply()>
		obj = ((Object) (sourceApplicationInfo));
	//   33   79:aload_0         
	//   34   80:getfield        #106 <Field SourceApplicationInfo sourceApplicationInfo>
	//   35   83:astore_1        
		if(obj != null)
	//*  36   84:aload_1         
	//*  37   85:ifnull          92
			((SourceApplicationInfo) (obj)).writeSourceApplicationInfoToDisk();
	//   38   88:aload_1         
	//   39   89:invokevirtual   #154 <Method void SourceApplicationInfo.writeSourceApplicationInfoToDisk()>
	//   40   92:return          
	}

	private Long diskRestoreTime;
	private int interruptionCount;
	private UUID sessionId;
	private Long sessionLastEventTime;
	private Long sessionStartTime;
	private SourceApplicationInfo sourceApplicationInfo;
}
