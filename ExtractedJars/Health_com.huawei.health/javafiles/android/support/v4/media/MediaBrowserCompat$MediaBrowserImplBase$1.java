// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.ServiceConnection;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

class MediaBrowserCompat$MediaBrowserImplBase$1
	implements Runnable
{

	public void run()
	{
		if(val$thisConnection == mServiceConnection)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field ServiceConnection val$thisConnection>
	//*   2    4:aload_0         
	//*   3    5:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//*   4    8:getfield        #32  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
	//*   5   11:if_acmpne       31
		{
			forceCloseConnection();
	//    6   14:aload_0         
	//    7   15:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//    8   18:invokevirtual   #35  <Method void MediaBrowserCompat$MediaBrowserImplBase.forceCloseConnection()>
			mCallback.onConnectionFailed();
	//    9   21:aload_0         
	//   10   22:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   11   25:getfield        #39  <Field MediaBrowserCompat$ConnectionCallback MediaBrowserCompat$MediaBrowserImplBase.mCallback>
	//   12   28:invokevirtual   #44  <Method void MediaBrowserCompat$ConnectionCallback.onConnectionFailed()>
		}
	//   13   31:return          
	}

	final MediaBrowserCompat.MediaBrowserImplBase this$0;
	final ServiceConnection val$thisConnection;

	MediaBrowserCompat$MediaBrowserImplBase$1()
	{
		this$0 = final_mediabrowserimplbase;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		val$thisConnection = ServiceConnection.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field ServiceConnection val$thisConnection>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
	//    8   14:return          
	}
}
