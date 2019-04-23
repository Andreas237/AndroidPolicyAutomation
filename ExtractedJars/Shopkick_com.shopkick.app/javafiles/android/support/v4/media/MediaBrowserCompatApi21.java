// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import java.util.List;

class MediaBrowserCompatApi21
{
	static interface ConnectionCallback
	{

		public abstract void onConnected();

		public abstract void onConnectionFailed();

		public abstract void onConnectionSuspended();
	}

	static class ConnectionCallbackProxy extends android.media.browse.MediaBrowser.ConnectionCallback
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

		protected final ConnectionCallback mConnectionCallback;

		public ConnectionCallbackProxy(ConnectionCallback connectioncallback)
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

	static class MediaItem
	{

		public static Object getDescription(Object obj)
		{
			return ((Object) (((android.media.browse.MediaBrowser.MediaItem)obj).getDescription()));
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.browse.MediaBrowser$MediaItem>
		//    2    4:invokevirtual   #19  <Method android.media.MediaDescription android.media.browse.MediaBrowser$MediaItem.getDescription()>
		//    3    7:areturn         
		}

		public static int getFlags(Object obj)
		{
			return ((android.media.browse.MediaBrowser.MediaItem)obj).getFlags();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.browse.MediaBrowser$MediaItem>
		//    2    4:invokevirtual   #24  <Method int android.media.browse.MediaBrowser$MediaItem.getFlags()>
		//    3    7:ireturn         
		}

		private MediaItem()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	static interface SubscriptionCallback
	{

		public abstract void onChildrenLoaded(String s, List list);

		public abstract void onError(String s);
	}

	static class SubscriptionCallbackProxy extends android.media.browse.MediaBrowser.SubscriptionCallback
	{

		public void onChildrenLoaded(String s, List list)
		{
			mSubscriptionCallback.onChildrenLoaded(s, list);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaBrowserCompatApi21$SubscriptionCallback mSubscriptionCallback>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #28  <Method void MediaBrowserCompatApi21$SubscriptionCallback.onChildrenLoaded(String, List)>
		//    5   11:return          
		}

		public void onError(String s)
		{
			mSubscriptionCallback.onError(s);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaBrowserCompatApi21$SubscriptionCallback mSubscriptionCallback>
		//    2    4:aload_1         
		//    3    5:invokeinterface #34  <Method void MediaBrowserCompatApi21$SubscriptionCallback.onError(String)>
		//    4   10:return          
		}

		protected final SubscriptionCallback mSubscriptionCallback;

		public SubscriptionCallbackProxy(SubscriptionCallback subscriptioncallback)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void android.media.browse.MediaBrowser$SubscriptionCallback()>
			mSubscriptionCallback = subscriptioncallback;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field MediaBrowserCompatApi21$SubscriptionCallback mSubscriptionCallback>
		//    5    9:return          
		}
	}


	private MediaBrowserCompatApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	public static void connect(Object obj)
	{
		((MediaBrowser)obj).connect();
	//    0    0:aload_0         
	//    1    1:checkcast       #35  <Class MediaBrowser>
	//    2    4:invokevirtual   #37  <Method void MediaBrowser.connect()>
	//    3    7:return          
	}

	public static Object createBrowser(Context context, ComponentName componentname, Object obj, Bundle bundle)
	{
		return ((Object) (new MediaBrowser(context, componentname, (android.media.browse.MediaBrowser.ConnectionCallback)obj, bundle)));
	//    0    0:new             #35  <Class MediaBrowser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:checkcast       #41  <Class android.media.browse.MediaBrowser$ConnectionCallback>
	//    6   10:aload_3         
	//    7   11:invokespecial   #44  <Method void MediaBrowser(Context, ComponentName, android.media.browse.MediaBrowser$ConnectionCallback, Bundle)>
	//    8   14:areturn         
	}

	public static Object createConnectionCallback(ConnectionCallback connectioncallback)
	{
		return ((Object) (new ConnectionCallbackProxy(connectioncallback)));
	//    0    0:new             #9   <Class MediaBrowserCompatApi21$ConnectionCallbackProxy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #49  <Method void MediaBrowserCompatApi21$ConnectionCallbackProxy(MediaBrowserCompatApi21$ConnectionCallback)>
	//    4    8:areturn         
	}

	public static Object createSubscriptionCallback(SubscriptionCallback subscriptioncallback)
	{
		return ((Object) (new SubscriptionCallbackProxy(subscriptioncallback)));
	//    0    0:new             #18  <Class MediaBrowserCompatApi21$SubscriptionCallbackProxy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #54  <Method void MediaBrowserCompatApi21$SubscriptionCallbackProxy(MediaBrowserCompatApi21$SubscriptionCallback)>
	//    4    8:areturn         
	}

	public static void disconnect(Object obj)
	{
		((MediaBrowser)obj).disconnect();
	//    0    0:aload_0         
	//    1    1:checkcast       #35  <Class MediaBrowser>
	//    2    4:invokevirtual   #57  <Method void MediaBrowser.disconnect()>
	//    3    7:return          
	}

	public static Bundle getExtras(Object obj)
	{
		return ((MediaBrowser)obj).getExtras();
	//    0    0:aload_0         
	//    1    1:checkcast       #35  <Class MediaBrowser>
	//    2    4:invokevirtual   #62  <Method Bundle MediaBrowser.getExtras()>
	//    3    7:areturn         
	}

	public static String getRoot(Object obj)
	{
		return ((MediaBrowser)obj).getRoot();
	//    0    0:aload_0         
	//    1    1:checkcast       #35  <Class MediaBrowser>
	//    2    4:invokevirtual   #67  <Method String MediaBrowser.getRoot()>
	//    3    7:areturn         
	}

	public static ComponentName getServiceComponent(Object obj)
	{
		return ((MediaBrowser)obj).getServiceComponent();
	//    0    0:aload_0         
	//    1    1:checkcast       #35  <Class MediaBrowser>
	//    2    4:invokevirtual   #72  <Method ComponentName MediaBrowser.getServiceComponent()>
	//    3    7:areturn         
	}

	public static Object getSessionToken(Object obj)
	{
		return ((Object) (((MediaBrowser)obj).getSessionToken()));
	//    0    0:aload_0         
	//    1    1:checkcast       #35  <Class MediaBrowser>
	//    2    4:invokevirtual   #77  <Method android.media.session.MediaSession$Token MediaBrowser.getSessionToken()>
	//    3    7:areturn         
	}

	public static boolean isConnected(Object obj)
	{
		return ((MediaBrowser)obj).isConnected();
	//    0    0:aload_0         
	//    1    1:checkcast       #35  <Class MediaBrowser>
	//    2    4:invokevirtual   #82  <Method boolean MediaBrowser.isConnected()>
	//    3    7:ireturn         
	}

	public static void subscribe(Object obj, String s, Object obj1)
	{
		((MediaBrowser)obj).subscribe(s, (android.media.browse.MediaBrowser.SubscriptionCallback)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #35  <Class MediaBrowser>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:checkcast       #86  <Class android.media.browse.MediaBrowser$SubscriptionCallback>
	//    5    9:invokevirtual   #89  <Method void MediaBrowser.subscribe(String, android.media.browse.MediaBrowser$SubscriptionCallback)>
	//    6   12:return          
	}

	public static void unsubscribe(Object obj, String s)
	{
		((MediaBrowser)obj).unsubscribe(s);
	//    0    0:aload_0         
	//    1    1:checkcast       #35  <Class MediaBrowser>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #94  <Method void MediaBrowser.unsubscribe(String)>
	//    4    8:return          
	}

	static final String NULL_MEDIA_ITEM_ID = "android.support.v4.media.MediaBrowserCompat.NULL_MEDIA_ITEM";
}
