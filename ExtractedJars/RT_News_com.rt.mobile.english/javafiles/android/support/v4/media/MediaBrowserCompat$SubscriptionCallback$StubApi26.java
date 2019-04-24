// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

private class MediaBrowserCompat$SubscriptionCallback$StubApi26 extends MediaBrowserCompat$SubscriptionCallback$StubApi21
	implements MediaBrowserCompatApi26.SubscriptionCallback
{

	public void onChildrenLoaded(String s, List list, Bundle bundle)
	{
		MediaBrowserCompat.SubscriptionCallback.this.onChildrenLoaded(s, MediaBrowserCompat.MediaItem.fromMediaItemList(list), bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #30  <Method List MediaBrowserCompat$MediaItem.fromMediaItemList(List)>
	//    5    9:aload_3         
	//    6   10:invokevirtual   #32  <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
	//    7   13:return          
	}

	public void onError(String s, Bundle bundle)
	{
		MediaBrowserCompat.SubscriptionCallback.this.onError(s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #39  <Method void MediaBrowserCompat$SubscriptionCallback.onError(String, Bundle)>
	//    5    9:return          
	}

	final MediaBrowserCompat.SubscriptionCallback this$0;

	MediaBrowserCompat$SubscriptionCallback$StubApi26()
	{
		this$0 = MediaBrowserCompat.SubscriptionCallback.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field MediaBrowserCompat$SubscriptionCallback this$0>
		super(MediaBrowserCompat.SubscriptionCallback.this);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #20  <Method void MediaBrowserCompat$SubscriptionCallback$StubApi21(MediaBrowserCompat$SubscriptionCallback)>
	//    6   10:return          
	}
}
