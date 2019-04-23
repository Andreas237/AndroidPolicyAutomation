// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompatApi26

static class MediaBrowserCompatApi26$SubscriptionCallbackProxy extends MediaBrowserCompatApi21$SubscriptionCallbackProxy
{

	public void onChildrenLoaded(String s, List list, Bundle bundle)
	{
		MediaSessionCompat.ensureClassLoader(bundle);
	//    0    0:aload_3         
	//    1    1:invokestatic    #25  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
		((MediaBrowserCompatApi26.SubscriptionCallback)mSubscriptionCallback).onChildrenLoaded(s, list, bundle);
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
		((MediaBrowserCompatApi26.SubscriptionCallback)mSubscriptionCallback).onError(s, bundle);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field MediaBrowserCompatApi21$SubscriptionCallback mSubscriptionCallback>
	//    4    8:checkcast       #31  <Class MediaBrowserCompatApi26$SubscriptionCallback>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokeinterface #39  <Method void MediaBrowserCompatApi26$SubscriptionCallback.onError(String, Bundle)>
	//    8   18:return          
	}

	MediaBrowserCompatApi26$SubscriptionCallbackProxy(MediaBrowserCompatApi26.SubscriptionCallback subscriptioncallback)
	{
		super(((MediaBrowserCompatApi21.SubscriptionCallback) (subscriptioncallback)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void MediaBrowserCompatApi21$SubscriptionCallbackProxy(MediaBrowserCompatApi21$SubscriptionCallback)>
	//    3    5:return          
	}
}
