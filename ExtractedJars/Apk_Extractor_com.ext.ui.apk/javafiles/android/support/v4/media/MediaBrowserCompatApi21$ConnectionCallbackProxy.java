// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;


// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompatApi21

static class MediaBrowserCompatApi21$ConnectionCallbackProxy extends android.media.browse.MediaBrowser.ConnectionCallback
{

	public void onConnected()
	{
		mConnectionCallback.onConnected();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaBrowserCompatApi21$ConnectionCallback mConnectionCallback>
	//    2    4:invokeinterface #26  <Method void MediaBrowserCompatApi21$ConnectionCallback.onConnected()>
	//    3    9:return          
	}

	public void onConnectionFailed()
	{
		mConnectionCallback.onConnectionFailed();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaBrowserCompatApi21$ConnectionCallback mConnectionCallback>
	//    2    4:invokeinterface #29  <Method void MediaBrowserCompatApi21$ConnectionCallback.onConnectionFailed()>
	//    3    9:return          
	}

	public void onConnectionSuspended()
	{
		mConnectionCallback.onConnectionSuspended();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaBrowserCompatApi21$ConnectionCallback mConnectionCallback>
	//    2    4:invokeinterface #32  <Method void MediaBrowserCompatApi21$ConnectionCallback.onConnectionSuspended()>
	//    3    9:return          
	}

	protected final MediaBrowserCompatApi21.ConnectionCallback mConnectionCallback;

	public MediaBrowserCompatApi21$ConnectionCallbackProxy(MediaBrowserCompatApi21.ConnectionCallback connectioncallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void android.media.browse.MediaBrowser$ConnectionCallback()>
		mConnectionCallback = connectioncallback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field MediaBrowserCompatApi21$ConnectionCallback mConnectionCallback>
	//    5    9:return          
	}
}
