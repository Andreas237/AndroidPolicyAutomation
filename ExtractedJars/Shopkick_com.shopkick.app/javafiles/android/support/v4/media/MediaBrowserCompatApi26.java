// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
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
			MediaSessionCompat.ensureClassLoader(bundle);
		//    0    0:aload_3         
		//    1    1:invokestatic    #25  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
			((SubscriptionCallback)mSubscriptionCallback).onChildrenLoaded(s, list, bundle);
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field MediaBrowserCompatApi21$SubscriptionCallback mSubscriptionCallback>
		//    4    8:checkcast       #31  <Class MediaBrowserCompatApi26$SubscriptionCallback>
		//    5   11:aload_1         
		//    6   12:aload_2         
		//    7   13:aload_3         
		//    8   14:invokeinterface #33  <Method void MediaBrowserCompatApi26$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
		//    9   19:return          
		}

		public void onError(String s, Bundle bundle)
		{
			MediaSessionCompat.ensureClassLoader(bundle);
		//    0    0:aload_2         
		//    1    1:invokestatic    #25  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
			((SubscriptionCallback)mSubscriptionCallback).onError(s, bundle);
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field MediaBrowserCompatApi21$SubscriptionCallback mSubscriptionCallback>
		//    4    8:checkcast       #31  <Class MediaBrowserCompatApi26$SubscriptionCallback>
		//    5   11:aload_1         
		//    6   12:aload_2         
		//    7   13:invokeinterface #39  <Method void MediaBrowserCompatApi26$SubscriptionCallback.onError(String, Bundle)>
		//    8   18:return          
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


	private MediaBrowserCompatApi26()
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
