// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;


// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

class MediaBrowserCompat$ConnectionCallback$StubApi21
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

	MediaBrowserCompat$ConnectionCallback$StubApi21()
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
