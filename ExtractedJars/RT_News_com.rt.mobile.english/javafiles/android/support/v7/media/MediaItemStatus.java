// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.util.TimeUtils;

public final class MediaItemStatus
{
	public static final class Builder
	{

		public MediaItemStatus build()
		{
			return new MediaItemStatus(mBundle);
		//    0    0:new             #6   <Class MediaItemStatus>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field Bundle mBundle>
		//    4    8:invokespecial   #49  <Method void MediaItemStatus(Bundle)>
		//    5   11:areturn         
		}

		public Builder setContentDuration(long l)
		{
			mBundle.putLong("contentDuration", l);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Bundle mBundle>
		//    2    4:ldc1            #52  <String "contentDuration">
		//    3    6:lload_1         
		//    4    7:invokevirtual   #56  <Method void Bundle.putLong(String, long)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public Builder setContentPosition(long l)
		{
			mBundle.putLong("contentPosition", l);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Bundle mBundle>
		//    2    4:ldc1            #59  <String "contentPosition">
		//    3    6:lload_1         
		//    4    7:invokevirtual   #56  <Method void Bundle.putLong(String, long)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public Builder setExtras(Bundle bundle)
		{
			mBundle.putBundle("extras", bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Bundle mBundle>
		//    2    4:ldc1            #63  <String "extras">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #67  <Method void Bundle.putBundle(String, Bundle)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public Builder setPlaybackState(int i)
		{
			mBundle.putInt("playbackState", i);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Bundle mBundle>
		//    2    4:ldc1            #69  <String "playbackState">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #73  <Method void Bundle.putInt(String, int)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public Builder setTimestamp(long l)
		{
			mBundle.putLong("timestamp", l);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Bundle mBundle>
		//    2    4:ldc1            #75  <String "timestamp">
		//    3    6:lload_1         
		//    4    7:invokevirtual   #56  <Method void Bundle.putLong(String, long)>
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
		//    9   19:invokevirtual   #29  <Method MediaItemStatus$Builder setTimestamp(long)>
		//   10   22:pop             
			setPlaybackState(i);
		//   11   23:aload_0         
		//   12   24:iload_1         
		//   13   25:invokevirtual   #33  <Method MediaItemStatus$Builder setPlaybackState(int)>
		//   14   28:pop             
		//   15   29:return          
		}

		public Builder(MediaItemStatus mediaitemstatus)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			if(mediaitemstatus == null)
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
				mBundle = new Bundle(mediaitemstatus.mBundle);
		//    9   18:aload_0         
		//   10   19:new             #16  <Class Bundle>
		//   11   22:dup             
		//   12   23:aload_1         
		//   13   24:getfield        #43  <Field Bundle MediaItemStatus.mBundle>
		//   14   27:invokespecial   #46  <Method void Bundle(Bundle)>
		//   15   30:putfield        #19  <Field Bundle mBundle>
				return;
		//   16   33:return          
			}
		}
	}


	MediaItemStatus(Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
		mBundle = bundle;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #55  <Field Bundle mBundle>
	//    5    9:return          
	}

	public static MediaItemStatus fromBundle(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
			return new MediaItemStatus(bundle);
	//    2    4:new             #2   <Class MediaItemStatus>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #60  <Method void MediaItemStatus(Bundle)>
	//    6   12:areturn         
		else
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
	}

	private static String playbackStateToString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 7: default 48
	//	               0 74
	//	               1 71
	//	               2 68
	//	               3 65
	//	               4 62
	//	               5 59
	//	               6 56
	//	               7 53
		default:
			return Integer.toString(i);
	//    2   48:iload_0         
	//    3   49:invokestatic    #67  <Method String Integer.toString(int)>
	//    4   52:areturn         

		case 7: // '\007'
			return "error";
	//    5   53:ldc1            #69  <String "error">
	//    6   55:areturn         

		case 6: // '\006'
			return "invalidated";
	//    7   56:ldc1            #71  <String "invalidated">
	//    8   58:areturn         

		case 5: // '\005'
			return "canceled";
	//    9   59:ldc1            #73  <String "canceled">
	//   10   61:areturn         

		case 4: // '\004'
			return "finished";
	//   11   62:ldc1            #75  <String "finished">
	//   12   64:areturn         

		case 3: // '\003'
			return "buffering";
	//   13   65:ldc1            #77  <String "buffering">
	//   14   67:areturn         

		case 2: // '\002'
			return "paused";
	//   15   68:ldc1            #79  <String "paused">
	//   16   70:areturn         

		case 1: // '\001'
			return "playing";
	//   17   71:ldc1            #81  <String "playing">
	//   18   73:areturn         

		case 0: // '\0'
			return "pending";
	//   19   74:ldc1            #83  <String "pending">
	//   20   76:areturn         
		}
	}

	public Bundle asBundle()
	{
		return mBundle;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Bundle mBundle>
	//    2    4:areturn         
	}

	public long getContentDuration()
	{
		return mBundle.getLong("contentDuration", -1L);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Bundle mBundle>
	//    2    4:ldc1            #17  <String "contentDuration">
	//    3    6:ldc2w           #88  <Long -1L>
	//    4    9:invokevirtual   #95  <Method long Bundle.getLong(String, long)>
	//    5   12:lreturn         
	}

	public long getContentPosition()
	{
		return mBundle.getLong("contentPosition", -1L);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Bundle mBundle>
	//    2    4:ldc1            #20  <String "contentPosition">
	//    3    6:ldc2w           #88  <Long -1L>
	//    4    9:invokevirtual   #95  <Method long Bundle.getLong(String, long)>
	//    5   12:lreturn         
	}

	public Bundle getExtras()
	{
		return mBundle.getBundle("extras");
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Bundle mBundle>
	//    2    4:ldc1            #23  <String "extras">
	//    3    6:invokevirtual   #101 <Method Bundle Bundle.getBundle(String)>
	//    4    9:areturn         
	}

	public int getPlaybackState()
	{
		return mBundle.getInt("playbackState", 7);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Bundle mBundle>
	//    2    4:ldc1            #26  <String "playbackState">
	//    3    6:bipush          7
	//    4    8:invokevirtual   #107 <Method int Bundle.getInt(String, int)>
	//    5   11:ireturn         
	}

	public long getTimestamp()
	{
		return mBundle.getLong("timestamp");
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Bundle mBundle>
	//    2    4:ldc1            #29  <String "timestamp">
	//    3    6:invokevirtual   #111 <Method long Bundle.getLong(String)>
	//    4    9:lreturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #114 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #115 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("MediaItemStatus{ ");
	//    4    8:aload_1         
	//    5    9:ldc1            #117 <String "MediaItemStatus{ ">
	//    6   11:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("timestamp=");
	//    8   15:aload_1         
	//    9   16:ldc1            #123 <String "timestamp=">
	//   10   18:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		TimeUtils.formatDuration(SystemClock.elapsedRealtime() - getTimestamp(), stringbuilder);
	//   12   22:invokestatic    #128 <Method long SystemClock.elapsedRealtime()>
	//   13   25:aload_0         
	//   14   26:invokevirtual   #130 <Method long getTimestamp()>
	//   15   29:lsub            
	//   16   30:aload_1         
	//   17   31:invokestatic    #136 <Method void TimeUtils.formatDuration(long, StringBuilder)>
		stringbuilder.append(" ms ago");
	//   18   34:aload_1         
	//   19   35:ldc1            #138 <String " ms ago">
	//   20   37:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
		stringbuilder.append(", playbackState=");
	//   22   41:aload_1         
	//   23   42:ldc1            #140 <String ", playbackState=">
	//   24   44:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
		stringbuilder.append(playbackStateToString(getPlaybackState()));
	//   26   48:aload_1         
	//   27   49:aload_0         
	//   28   50:invokevirtual   #142 <Method int getPlaybackState()>
	//   29   53:invokestatic    #144 <Method String playbackStateToString(int)>
	//   30   56:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   31   59:pop             
		stringbuilder.append(", contentPosition=");
	//   32   60:aload_1         
	//   33   61:ldc1            #146 <String ", contentPosition=">
	//   34   63:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   35   66:pop             
		stringbuilder.append(getContentPosition());
	//   36   67:aload_1         
	//   37   68:aload_0         
	//   38   69:invokevirtual   #148 <Method long getContentPosition()>
	//   39   72:invokevirtual   #151 <Method StringBuilder StringBuilder.append(long)>
	//   40   75:pop             
		stringbuilder.append(", contentDuration=");
	//   41   76:aload_1         
	//   42   77:ldc1            #153 <String ", contentDuration=">
	//   43   79:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   44   82:pop             
		stringbuilder.append(getContentDuration());
	//   45   83:aload_1         
	//   46   84:aload_0         
	//   47   85:invokevirtual   #155 <Method long getContentDuration()>
	//   48   88:invokevirtual   #151 <Method StringBuilder StringBuilder.append(long)>
	//   49   91:pop             
		stringbuilder.append(", extras=");
	//   50   92:aload_1         
	//   51   93:ldc1            #157 <String ", extras=">
	//   52   95:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   53   98:pop             
		stringbuilder.append(((Object) (getExtras())));
	//   54   99:aload_1         
	//   55  100:aload_0         
	//   56  101:invokevirtual   #159 <Method Bundle getExtras()>
	//   57  104:invokevirtual   #162 <Method StringBuilder StringBuilder.append(Object)>
	//   58  107:pop             
		stringbuilder.append(" }");
	//   59  108:aload_1         
	//   60  109:ldc1            #164 <String " }">
	//   61  111:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   62  114:pop             
		return stringbuilder.toString();
	//   63  115:aload_1         
	//   64  116:invokevirtual   #166 <Method String StringBuilder.toString()>
	//   65  119:areturn         
	}

	public static final String EXTRA_HTTP_RESPONSE_HEADERS = "android.media.status.extra.HTTP_RESPONSE_HEADERS";
	public static final String EXTRA_HTTP_STATUS_CODE = "android.media.status.extra.HTTP_STATUS_CODE";
	static final String KEY_CONTENT_DURATION = "contentDuration";
	static final String KEY_CONTENT_POSITION = "contentPosition";
	static final String KEY_EXTRAS = "extras";
	static final String KEY_PLAYBACK_STATE = "playbackState";
	static final String KEY_TIMESTAMP = "timestamp";
	public static final int PLAYBACK_STATE_BUFFERING = 3;
	public static final int PLAYBACK_STATE_CANCELED = 5;
	public static final int PLAYBACK_STATE_ERROR = 7;
	public static final int PLAYBACK_STATE_FINISHED = 4;
	public static final int PLAYBACK_STATE_INVALIDATED = 6;
	public static final int PLAYBACK_STATE_PAUSED = 2;
	public static final int PLAYBACK_STATE_PENDING = 0;
	public static final int PLAYBACK_STATE_PLAYING = 1;
	final Bundle mBundle;
}
