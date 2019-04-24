// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompatApi24

static class MediaBrowserCompatApi24$SubscriptionCallbackProxy extends MediaBrowserCompatApi21$SubscriptionCallbackProxy
{

	public void onChildrenLoaded(String s, List list, Bundle bundle)
	{
		((MediaBrowserCompatApi24.SubscriptionCallback)mSubscriptionCallback).onChildrenLoaded(s, list, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MediaBrowserCompatApi21$SubscriptionCallback mSubscriptionCallback>
	//    2    4:checkcast       #25  <Class MediaBrowserCompatApi24$SubscriptionCallback>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:invokeinterface #27  <Method void MediaBrowserCompatApi24$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
	//    7   15:return          
	}

	public void onError(String s, Bundle bundle)
	{
		((MediaBrowserCompatApi24.SubscriptionCallback)mSubscriptionCallback).onError(s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MediaBrowserCompatApi21$SubscriptionCallback mSubscriptionCallback>
	//    2    4:checkcast       #25  <Class MediaBrowserCompatApi24$SubscriptionCallback>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #33  <Method void MediaBrowserCompatApi24$SubscriptionCallback.onError(String, Bundle)>
	//    6   14:return          
	}

	public MediaBrowserCompatApi24$SubscriptionCallbackProxy(MediaBrowserCompatApi24.SubscriptionCallback subscriptioncallback)
	{
		super(((MediaBrowserCompatApi21.SubscriptionCallback) (subscriptioncallback)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void MediaBrowserCompatApi21$SubscriptionCallbackProxy(MediaBrowserCompatApi21$SubscriptionCallback)>
	//    3    5:return          
	}
}
