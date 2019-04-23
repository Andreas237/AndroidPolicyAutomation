// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.g.y;

public final class MediaSessionStatus
{

	MediaSessionStatus(Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		mBundle = bundle;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field Bundle mBundle>
	//    5    9:return          
	}

	public static MediaSessionStatus fromBundle(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
			return new MediaSessionStatus(bundle);
	//    2    4:new             #2   <Class MediaSessionStatus>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #38  <Method void MediaSessionStatus(Bundle)>
	//    6   12:areturn         
		else
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
	}

	private static String sessionStateToString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 39
	//	               1 36
	//	               2 33
		default:
			return Integer.toString(i);
	//    2   28:iload_0         
	//    3   29:invokestatic    #45  <Method String Integer.toString(int)>
	//    4   32:areturn         

		case 2: // '\002'
			return "invalidated";
	//    5   33:ldc1            #47  <String "invalidated">
	//    6   35:areturn         

		case 1: // '\001'
			return "ended";
	//    7   36:ldc1            #49  <String "ended">
	//    8   38:areturn         

		case 0: // '\0'
			return "active";
	//    9   39:ldc1            #51  <String "active">
	//   10   41:areturn         
		}
	}

	public Bundle asBundle()
	{
		return mBundle;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Bundle mBundle>
	//    2    4:areturn         
	}

	public Bundle getExtras()
	{
		return mBundle.getBundle("extras");
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Bundle mBundle>
	//    2    4:ldc1            #8   <String "extras">
	//    3    6:invokevirtual   #60  <Method Bundle Bundle.getBundle(String)>
	//    4    9:areturn         
	}

	public int getSessionState()
	{
		return mBundle.getInt("sessionState", 2);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Bundle mBundle>
	//    2    4:ldc1            #14  <String "sessionState">
	//    3    6:iconst_2        
	//    4    7:invokevirtual   #66  <Method int Bundle.getInt(String, int)>
	//    5   10:ireturn         
	}

	public long getTimestamp()
	{
		return mBundle.getLong("timestamp");
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Bundle mBundle>
	//    2    4:ldc1            #17  <String "timestamp">
	//    3    6:invokevirtual   #72  <Method long Bundle.getLong(String)>
	//    4    9:lreturn         
	}

	public boolean isQueuePaused()
	{
		return mBundle.getBoolean("queuePaused");
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Bundle mBundle>
	//    2    4:ldc1            #11  <String "queuePaused">
	//    3    6:invokevirtual   #78  <Method boolean Bundle.getBoolean(String)>
	//    4    9:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #81  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #82  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("MediaSessionStatus{ ");
	//    4    8:aload_1         
	//    5    9:ldc1            #84  <String "MediaSessionStatus{ ">
	//    6   11:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("timestamp=");
	//    8   15:aload_1         
	//    9   16:ldc1            #90  <String "timestamp=">
	//   10   18:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		y.a(SystemClock.elapsedRealtime() - getTimestamp(), stringbuilder);
	//   12   22:invokestatic    #95  <Method long SystemClock.elapsedRealtime()>
	//   13   25:aload_0         
	//   14   26:invokevirtual   #97  <Method long getTimestamp()>
	//   15   29:lsub            
	//   16   30:aload_1         
	//   17   31:invokestatic    #103 <Method void y.a(long, StringBuilder)>
		stringbuilder.append(" ms ago");
	//   18   34:aload_1         
	//   19   35:ldc1            #105 <String " ms ago">
	//   20   37:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
		stringbuilder.append(", sessionState=");
	//   22   41:aload_1         
	//   23   42:ldc1            #107 <String ", sessionState=">
	//   24   44:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
		stringbuilder.append(sessionStateToString(getSessionState()));
	//   26   48:aload_1         
	//   27   49:aload_0         
	//   28   50:invokevirtual   #109 <Method int getSessionState()>
	//   29   53:invokestatic    #111 <Method String sessionStateToString(int)>
	//   30   56:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   31   59:pop             
		stringbuilder.append(", queuePaused=");
	//   32   60:aload_1         
	//   33   61:ldc1            #113 <String ", queuePaused=">
	//   34   63:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   35   66:pop             
		stringbuilder.append(isQueuePaused());
	//   36   67:aload_1         
	//   37   68:aload_0         
	//   38   69:invokevirtual   #115 <Method boolean isQueuePaused()>
	//   39   72:invokevirtual   #118 <Method StringBuilder StringBuilder.append(boolean)>
	//   40   75:pop             
		stringbuilder.append(", extras=");
	//   41   76:aload_1         
	//   42   77:ldc1            #120 <String ", extras=">
	//   43   79:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   44   82:pop             
		stringbuilder.append(((Object) (getExtras())));
	//   45   83:aload_1         
	//   46   84:aload_0         
	//   47   85:invokevirtual   #122 <Method Bundle getExtras()>
	//   48   88:invokevirtual   #125 <Method StringBuilder StringBuilder.append(Object)>
	//   49   91:pop             
		stringbuilder.append(" }");
	//   50   92:aload_1         
	//   51   93:ldc1            #127 <String " }">
	//   52   95:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   53   98:pop             
		return stringbuilder.toString();
	//   54   99:aload_1         
	//   55  100:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   56  103:areturn         
	}

	static final String KEY_EXTRAS = "extras";
	static final String KEY_QUEUE_PAUSED = "queuePaused";
	static final String KEY_SESSION_STATE = "sessionState";
	static final String KEY_TIMESTAMP = "timestamp";
	public static final int SESSION_STATE_ACTIVE = 0;
	public static final int SESSION_STATE_ENDED = 1;
	public static final int SESSION_STATE_INVALIDATED = 2;
	final Bundle mBundle;
}
