// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import java.util.List;

class MediaBrowserCompatApi26
{
	static interface SubscriptionCallback
		extends MediaBrowserCompatApi21.SubscriptionCallback
	{

		public abstract void onChildrenLoaded(String s, List list, Bundle bundle);

		public abstract void onError(String s, Bundle bundle);
	}

	static class SubscriptionCallbackProxy extends MediaBrowserCompatApi21.SubscriptionCallbackProxy
	{

		public void onChildrenLoaded(String s, List list, Bundle bundle)
		{
			((SubscriptionCallback)mSubscriptionCallback).onChildrenLoaded(s, list, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field MediaBrowserCompatApi21$SubscriptionCallback mSubscriptionCallback>
		//    2    4:checkcast       #25  <Class MediaBrowserCompatApi26$SubscriptionCallback>
		//    3    7:aload_1         
		//    4    8:aload_2         
		//    5    9:aload_3         
		//    6   10:invokeinterface #27  <Method void MediaBrowserCompatApi26$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
		//    7   15:return          
		}

		public void onError(String s, Bundle bundle)
		{
			((SubscriptionCallback)mSubscriptionCallback).onError(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field MediaBrowserCompatApi21$SubscriptionCallback mSubscriptionCallback>
		//    2    4:checkcast       #25  <Class MediaBrowserCompatApi26$SubscriptionCallback>
		//    3    7:aload_1         
		//    4    8:aload_2         
		//    5    9:invokeinterface #33  <Method void MediaBrowserCompatApi26$SubscriptionCallback.onError(String, Bundle)>
		//    6   14:return          
		}

		SubscriptionCallbackProxy(SubscriptionCallback subscriptioncallback)
		{
			super(((MediaBrowserCompatApi21.SubscriptionCallback) (subscriptioncallback)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #13  <Method void MediaBrowserCompatApi21$SubscriptionCallbackProxy(MediaBrowserCompatApi21$SubscriptionCallback)>
		//    3    5:return          
		}
	}


	MediaBrowserCompatApi26()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	static Object createSubscriptionCallback(SubscriptionCallback subscriptioncallback)
	{
		return ((Object) (new SubscriptionCallbackProxy(subscriptioncallback)));
	//    0    0:new             #9   <Class MediaBrowserCompatApi26$SubscriptionCallbackProxy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #23  <Method void MediaBrowserCompatApi26$SubscriptionCallbackProxy(MediaBrowserCompatApi26$SubscriptionCallback)>
	//    4    8:areturn         
	}

	public static void subscribe(Object obj, String s, Bundle bundle, Object obj1)
	{
		((MediaBrowser)obj).subscribe(s, bundle, (android.media.browse.MediaBrowser.SubscriptionCallback)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #27  <Class MediaBrowser>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:checkcast       #29  <Class android.media.browse.MediaBrowser$SubscriptionCallback>
	//    6   10:invokevirtual   #32  <Method void MediaBrowser.subscribe(String, Bundle, android.media.browse.MediaBrowser$SubscriptionCallback)>
	//    7   13:return          
	}

	public static void unsubscribe(Object obj, String s, Object obj1)
	{
		((MediaBrowser)obj).unsubscribe(s, (android.media.browse.MediaBrowser.SubscriptionCallback)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #27  <Class MediaBrowser>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:checkcast       #29  <Class android.media.browse.MediaBrowser$SubscriptionCallback>
	//    5    9:invokevirtual   #37  <Method void MediaBrowser.unsubscribe(String, android.media.browse.MediaBrowser$SubscriptionCallback)>
	//    6   12:return          
	}
}
