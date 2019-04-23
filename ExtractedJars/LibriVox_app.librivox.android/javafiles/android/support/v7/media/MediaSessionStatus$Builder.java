// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.os.Bundle;
import android.os.SystemClock;

// Referenced classes of package android.support.v7.media:
//			MediaSessionStatus

public final class MediaSessionStatus$Builder
{

	public MediaSessionStatus build()
	{
		return new MediaSessionStatus(mBundle);
	//    0    0:new             #34  <Class MediaSessionStatus>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field Bundle mBundle>
	//    4    8:invokespecial   #48  <Method void MediaSessionStatus(Bundle)>
	//    5   11:areturn         
	}

	public MediaSessionStatus$Builder setExtras(Bundle bundle)
	{
		mBundle.putBundle("extras", bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Bundle mBundle>
	//    2    4:ldc1            #52  <String "extras">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #56  <Method void Bundle.putBundle(String, Bundle)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaSessionStatus$Builder setQueuePaused(boolean flag)
	{
		mBundle.putBoolean("queuePaused", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Bundle mBundle>
	//    2    4:ldc1            #60  <String "queuePaused">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #64  <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaSessionStatus$Builder setSessionState(int i)
	{
		mBundle.putInt("sessionState", i);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Bundle mBundle>
	//    2    4:ldc1            #66  <String "sessionState">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #70  <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public MediaSessionStatus$Builder setTimestamp(long l)
	{
		mBundle.putLong("timestamp", l);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Bundle mBundle>
	//    2    4:ldc1            #72  <String "timestamp">
	//    3    6:lload_1         
	//    4    7:invokevirtual   #76  <Method void Bundle.putLong(String, long)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	private final Bundle mBundle;

	public MediaSessionStatus$Builder(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		mBundle = new Bundle();
	//    2    4:aload_0         
	//    3    5:new             #13  <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void Bundle()>
	//    6   12:putfield        #16  <Field Bundle mBundle>
		setTimestamp(SystemClock.elapsedRealtime());
	//    7   15:aload_0         
	//    8   16:invokestatic    #22  <Method long SystemClock.elapsedRealtime()>
	//    9   19:invokevirtual   #26  <Method MediaSessionStatus$Builder setTimestamp(long)>
	//   10   22:pop             
		setSessionState(i);
	//   11   23:aload_0         
	//   12   24:iload_1         
	//   13   25:invokevirtual   #30  <Method MediaSessionStatus$Builder setSessionState(int)>
	//   14   28:pop             
	//   15   29:return          
	}

	public MediaSessionStatus$Builder(MediaSessionStatus mediasessionstatus)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		if(mediasessionstatus != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          24
		{
			mBundle = new Bundle(mediasessionstatus.mBundle);
	//    4    8:aload_0         
	//    5    9:new             #13  <Class Bundle>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:getfield        #35  <Field Bundle MediaSessionStatus.mBundle>
	//    9   17:invokespecial   #38  <Method void Bundle(Bundle)>
	//   10   20:putfield        #16  <Field Bundle mBundle>
			return;
	//   11   23:return          
		} else
		{
			throw new IllegalArgumentException("status must not be null");
	//   12   24:new             #40  <Class IllegalArgumentException>
	//   13   27:dup             
	//   14   28:ldc1            #42  <String "status must not be null">
	//   15   30:invokespecial   #45  <Method void IllegalArgumentException(String)>
	//   16   33:athrow          
		}
	}
}
