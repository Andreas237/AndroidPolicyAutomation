// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.util.TimeUtils;

public final class MediaSessionStatus
{
	public static final class Builder
	{

		public MediaSessionStatus build()
		{
			return new MediaSessionStatus(mBundle);
		//    0    0:new             #6   <Class MediaSessionStatus>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field Bundle mBundle>
		//    4    8:invokespecial   #49  <Method void MediaSessionStatus(Bundle)>
		//    5   11:areturn         
		}

		public Builder setExtras(Bundle bundle)
		{
			mBundle.putBundle("extras", bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Bundle mBundle>
		//    2    4:ldc1            #53  <String "extras">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #57  <Method void Bundle.putBundle(String, Bundle)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public Builder setQueuePaused(boolean flag)
		{
			mBundle.putBoolean("queuePaused", flag);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Bundle mBundle>
		//    2    4:ldc1            #61  <String "queuePaused">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #65  <Method void Bundle.putBoolean(String, boolean)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public Builder setSessionState(int i)
		{
			mBundle.putInt("sessionState", i);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Bundle mBundle>
		//    2    4:ldc1            #67  <String "sessionState">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #71  <Method void Bundle.putInt(String, int)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public Builder setTimestamp(long l)
		{
			mBundle.putLong("timestamp", l);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Bundle mBundle>
		//    2    4:ldc1            #73  <String "timestamp">
		//    3    6:lload_1         
		//    4    7:invokevirtual   #77  <Method void Bundle.putLong(String, long)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		private final Bundle mBundle;

		public Builder(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			mBundle = new Bundle();
		//    2    4:aload_0         
		//    3    5:new             #16  <Class Bundle>
		//    4    8:dup             
		//    5    9:invokespecial   #17  <Method void Bundle()>
		//    6   12:putfield        #19  <Field Bundle mBundle>
			setTimestamp(SystemClock.elapsedRealtime());
		//    7   15:aload_0         
		//    8   16:invokestatic    #25  <Method long SystemClock.elapsedRealtime()>
		//    9   19:invokevirtual   #29  <Method MediaSessionStatus$Builder setTimestamp(long)>
		//   10   22:pop             
			setSessionState(i);
		//   11   23:aload_0         
		//   12   24:iload_1         
		//   13   25:invokevirtual   #33  <Method MediaSessionStatus$Builder setSessionState(int)>
		//   14   28:pop             
		//   15   29:return          
		}

		public Builder(MediaSessionStatus mediasessionstatus)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			if(mediasessionstatus == null)
		//*   2    4:aload_1         
		//*   3    5:ifnonnull       18
			{
				throw new IllegalArgumentException("status must not be null");
		//    4    8:new             #37  <Class IllegalArgumentException>
		//    5   11:dup             
		//    6   12:ldc1            #39  <String "status must not be null">
		//    7   14:invokespecial   #42  <Method void IllegalArgumentException(String)>
		//    8   17:athrow          
			} else
			{
				mBundle = new Bundle(mediasessionstatus.mBundle);
		//    9   18:aload_0         
		//   10   19:new             #16  <Class Bundle>
		//   11   22:dup             
		//   12   23:aload_1         
		//   13   24:getfield        #43  <Field Bundle MediaSessionStatus.mBundle>
		//   14   27:invokespecial   #46  <Method void Bundle(Bundle)>
		//   15   30:putfield        #19  <Field Bundle mBundle>
				return;
		//   16   33:return          
			}
		}
	}


	MediaSessionStatus(Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		mBundle = bundle;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field Bundle mBundle>
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
	//    5    9:invokespecial   #41  <Method void MediaSessionStatus(Bundle)>
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
	//    3   29:invokestatic    #48  <Method String Integer.toString(int)>
	//    4   32:areturn         

		case 2: // '\002'
			return "invalidated";
	//    5   33:ldc1            #50  <String "invalidated">
	//    6   35:areturn         

		case 1: // '\001'
			return "ended";
	//    7   36:ldc1            #52  <String "ended">
	//    8   38:areturn         

		case 0: // '\0'
			return "active";
	//    9   39:ldc1            #54  <String "active">
	//   10   41:areturn         
		}
	}

	public Bundle asBundle()
	{
		return mBundle;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Bundle mBundle>
	//    2    4:areturn         
	}

	public Bundle getExtras()
	{
		return mBundle.getBundle("extras");
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Bundle mBundle>
	//    2    4:ldc1            #11  <String "extras">
	//    3    6:invokevirtual   #63  <Method Bundle Bundle.getBundle(String)>
	//    4    9:areturn         
	}

	public int getSessionState()
	{
		return mBundle.getInt("sessionState", 2);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Bundle mBundle>
	//    2    4:ldc1            #17  <String "sessionState">
	//    3    6:iconst_2        
	//    4    7:invokevirtual   #69  <Method int Bundle.getInt(String, int)>
	//    5   10:ireturn         
	}

	public long getTimestamp()
	{
		return mBundle.getLong("timestamp");
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Bundle mBundle>
	//    2    4:ldc1            #20  <String "timestamp">
	//    3    6:invokevirtual   #75  <Method long Bundle.getLong(String)>
	//    4    9:lreturn         
	}

	public boolean isQueuePaused()
	{
		return mBundle.getBoolean("queuePaused");
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Bundle mBundle>
	//    2    4:ldc1            #14  <String "queuePaused">
	//    3    6:invokevirtual   #81  <Method boolean Bundle.getBoolean(String)>
	//    4    9:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #84  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #85  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("MediaSessionStatus{ ");
	//    4    8:aload_1         
	//    5    9:ldc1            #87  <String "MediaSessionStatus{ ">
	//    6   11:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("timestamp=");
	//    8   15:aload_1         
	//    9   16:ldc1            #93  <String "timestamp=">
	//   10   18:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		TimeUtils.formatDuration(SystemClock.elapsedRealtime() - getTimestamp(), stringbuilder);
	//   12   22:invokestatic    #98  <Method long SystemClock.elapsedRealtime()>
	//   13   25:aload_0         
	//   14   26:invokevirtual   #100 <Method long getTimestamp()>
	//   15   29:lsub            
	//   16   30:aload_1         
	//   17   31:invokestatic    #106 <Method void TimeUtils.formatDuration(long, StringBuilder)>
		stringbuilder.append(" ms ago");
	//   18   34:aload_1         
	//   19   35:ldc1            #108 <String " ms ago">
	//   20   37:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
		stringbuilder.append(", sessionState=");
	//   22   41:aload_1         
	//   23   42:ldc1            #110 <String ", sessionState=">
	//   24   44:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
		stringbuilder.append(sessionStateToString(getSessionState()));
	//   26   48:aload_1         
	//   27   49:aload_0         
	//   28   50:invokevirtual   #112 <Method int getSessionState()>
	//   29   53:invokestatic    #114 <Method String sessionStateToString(int)>
	//   30   56:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   31   59:pop             
		stringbuilder.append(", queuePaused=");
	//   32   60:aload_1         
	//   33   61:ldc1            #116 <String ", queuePaused=">
	//   34   63:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   35   66:pop             
		stringbuilder.append(isQueuePaused());
	//   36   67:aload_1         
	//   37   68:aload_0         
	//   38   69:invokevirtual   #118 <Method boolean isQueuePaused()>
	//   39   72:invokevirtual   #121 <Method StringBuilder StringBuilder.append(boolean)>
	//   40   75:pop             
		stringbuilder.append(", extras=");
	//   41   76:aload_1         
	//   42   77:ldc1            #123 <String ", extras=">
	//   43   79:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   44   82:pop             
		stringbuilder.append(((Object) (getExtras())));
	//   45   83:aload_1         
	//   46   84:aload_0         
	//   47   85:invokevirtual   #125 <Method Bundle getExtras()>
	//   48   88:invokevirtual   #128 <Method StringBuilder StringBuilder.append(Object)>
	//   49   91:pop             
		stringbuilder.append(" }");
	//   50   92:aload_1         
	//   51   93:ldc1            #130 <String " }">
	//   52   95:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   53   98:pop             
		return stringbuilder.toString();
	//   54   99:aload_1         
	//   55  100:invokevirtual   #132 <Method String StringBuilder.toString()>
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
