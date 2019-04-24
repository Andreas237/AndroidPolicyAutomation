// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.os.Bundle;
import android.os.SystemClock;

// Referenced classes of package android.support.v7.media:
//			MediaItemStatus

public static final class MediaItemStatus$Builder
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

	public MediaItemStatus$Builder setContentDuration(long l)
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

	public MediaItemStatus$Builder setContentPosition(long l)
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

	public MediaItemStatus$Builder setExtras(Bundle bundle)
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

	public MediaItemStatus$Builder setPlaybackState(int i)
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

	public MediaItemStatus$Builder setTimestamp(long l)
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

	public MediaItemStatus$Builder(int i)
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

	public MediaItemStatus$Builder(MediaItemStatus mediaitemstatus)
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
