// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;


// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat, MediaBrowserCompatApi21

public static class MediaBrowserCompat$ConnectionCallback
{
	static interface ConnectionCallbackInternal
	{

		public abstract void onConnected();

		public abstract void onConnectionFailed();

		public abstract void onConnectionSuspended();
	}

	private class StubApi21
		implements MediaBrowserCompatApi21.ConnectionCallback
	{

		public void onConnected()
		{
			if(mConnectionCallbackInternal != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field MediaBrowserCompat$ConnectionCallback this$0>
		//*   2    4:getfield        #27  <Field MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal MediaBrowserCompat$ConnectionCallback.mConnectionCallbackInternal>
		//*   3    7:ifnull          22
				mConnectionCallbackInternal.onConnected();
		//    4   10:aload_0         
		//    5   11:getfield        #18  <Field MediaBrowserCompat$ConnectionCallback this$0>
		//    6   14:getfield        #27  <Field MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal MediaBrowserCompat$ConnectionCallback.mConnectionCallbackInternal>
		//    7   17:invokeinterface #31  <Method void MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal.onConnected()>
			MediaBrowserCompat.ConnectionCallback.this.onConnected();
		//    8   22:aload_0         
		//    9   23:getfield        #18  <Field MediaBrowserCompat$ConnectionCallback this$0>
		//   10   26:invokevirtual   #32  <Method void MediaBrowserCompat$ConnectionCallback.onConnected()>
		//   11   29:return          
		}

		public void onConnectionFailed()
		{
			if(mConnectionCallbackInternal != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field MediaBrowserCompat$ConnectionCallback this$0>
		//*   2    4:getfield        #27  <Field MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal MediaBrowserCompat$ConnectionCallback.mConnectionCallbackInternal>
		//*   3    7:ifnull          22
				mConnectionCallbackInternal.onConnectionFailed();
		//    4   10:aload_0         
		//    5   11:getfield        #18  <Field MediaBrowserCompat$ConnectionCallback this$0>
		//    6   14:getfield        #27  <Field MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal MediaBrowserCompat$ConnectionCallback.mConnectionCallbackInternal>
		//    7   17:invokeinterface #35  <Method void MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal.onConnectionFailed()>
			MediaBrowserCompat.ConnectionCallback.this.onConnectionFailed();
		//    8   22:aload_0         
		//    9   23:getfield        #18  <Field MediaBrowserCompat$ConnectionCallback this$0>
		//   10   26:invokevirtual   #36  <Method void MediaBrowserCompat$ConnectionCallback.onConnectionFailed()>
		//   11   29:return          
		}

		public void onConnectionSuspended()
		{
			if(mConnectionCallbackInternal != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field MediaBrowserCompat$ConnectionCallback this$0>
		//*   2    4:getfield        #27  <Field MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal MediaBrowserCompat$ConnectionCallback.mConnectionCallbackInternal>
		//*   3    7:ifnull          22
				mConnectionCallbackInternal.onConnectionSuspended();
		//    4   10:aload_0         
		//    5   11:getfield        #18  <Field MediaBrowserCompat$ConnectionCallback this$0>
		//    6   14:getfield        #27  <Field MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal MediaBrowserCompat$ConnectionCallback.mConnectionCallbackInternal>
		//    7   17:invokeinterface #39  <Method void MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal.onConnectionSuspended()>
			MediaBrowserCompat.ConnectionCallback.this.onConnectionSuspended();
		//    8   22:aload_0         
		//    9   23:getfield        #18  <Field MediaBrowserCompat$ConnectionCallback this$0>
		//   10   26:invokevirtual   #40  <Method void MediaBrowserCompat$ConnectionCallback.onConnectionSuspended()>
		//   11   29:return          
		}

		final MediaBrowserCompat.ConnectionCallback this$0;

		StubApi21()
		{
			this$0 = MediaBrowserCompat.ConnectionCallback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field MediaBrowserCompat$ConnectionCallback this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
		//    5    9:return          
		}
	}


	public void onConnected()
	{
	//    0    0:return          
	}

	public void onConnectionFailed()
	{
	//    0    0:return          
	}

	public void onConnectionSuspended()
	{
	//    0    0:return          
	}

	void setInternalConnectionCallback(ConnectionCallbackInternal connectioncallbackinternal)
	{
		mConnectionCallbackInternal = connectioncallbackinternal;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal mConnectionCallbackInternal>
	//    3    5:return          
	}

	ConnectionCallbackInternal mConnectionCallbackInternal;
	final Object mConnectionCallbackObj;

	public MediaBrowserCompat$ConnectionCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   2    4:getstatic       #27  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmplt          28
		{
			mConnectionCallbackObj = MediaBrowserCompatApi21.createConnectionCallback(((back) (new StubApi21())));
	//    5   12:aload_0         
	//    6   13:new             #12  <Class MediaBrowserCompat$ConnectionCallback$StubApi21>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #30  <Method void MediaBrowserCompat$ConnectionCallback$StubApi21(MediaBrowserCompat$ConnectionCallback)>
	//   10   21:invokestatic    #36  <Method Object MediaBrowserCompatApi21.createConnectionCallback(MediaBrowserCompatApi21$ConnectionCallback)>
	//   11   24:putfield        #38  <Field Object mConnectionCallbackObj>
			return;
	//   12   27:return          
		} else
		{
			mConnectionCallbackObj = null;
	//   13   28:aload_0         
	//   14   29:aconst_null     
	//   15   30:putfield        #38  <Field Object mConnectionCallbackObj>
			return;
	//   16   33:return          
		}
	}
}
