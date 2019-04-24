// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompatApi21

static class MediaBrowserCompatApi21$SubscriptionCallbackProxy extends android.media.browse.MediaBrowser.SubscriptionCallback
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

	protected final MediaBrowserCompatApi21.SubscriptionCallback mSubscriptionCallback;

	public MediaBrowserCompatApi21$SubscriptionCallbackProxy(MediaBrowserCompatApi21.SubscriptionCallback subscriptioncallback)
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
