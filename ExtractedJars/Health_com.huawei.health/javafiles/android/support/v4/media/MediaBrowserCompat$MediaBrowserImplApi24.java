// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat, MediaBrowserCompatApi21, MediaBrowserCompatApi24

static class MediaBrowserCompat$MediaBrowserImplApi24 extends MediaBrowserCompat$MediaBrowserImplApi23
{

	public void subscribe(String s, Bundle bundle, MediaBrowserCompat.SubscriptionCallback subscriptioncallback)
	{
		if(bundle == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       17
		{
			MediaBrowserCompatApi21.subscribe(mBrowserObj, s, MediaBrowserCompat.SubscriptionCallback.access$200(subscriptioncallback));
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Object mBrowserObj>
	//    4    8:aload_1         
	//    5    9:aload_3         
	//    6   10:invokestatic    #25  <Method Object MediaBrowserCompat$SubscriptionCallback.access$200(MediaBrowserCompat$SubscriptionCallback)>
	//    7   13:invokestatic    #30  <Method void MediaBrowserCompatApi21.subscribe(Object, String, Object)>
			return;
	//    8   16:return          
		} else
		{
			MediaBrowserCompatApi24.subscribe(mBrowserObj, s, bundle, MediaBrowserCompat.SubscriptionCallback.access$200(subscriptioncallback));
	//    9   17:aload_0         
	//   10   18:getfield        #19  <Field Object mBrowserObj>
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:aload_3         
	//   14   24:invokestatic    #25  <Method Object MediaBrowserCompat$SubscriptionCallback.access$200(MediaBrowserCompat$SubscriptionCallback)>
	//   15   27:invokestatic    #35  <Method void MediaBrowserCompatApi24.subscribe(Object, String, Bundle, Object)>
			return;
	//   16   30:return          
		}
	}

	public void unsubscribe(String s, MediaBrowserCompat.SubscriptionCallback subscriptioncallback)
	{
		if(subscriptioncallback == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       13
		{
			MediaBrowserCompatApi21.unsubscribe(mBrowserObj, s);
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Object mBrowserObj>
	//    4    8:aload_1         
	//    5    9:invokestatic    #41  <Method void MediaBrowserCompatApi21.unsubscribe(Object, String)>
			return;
	//    6   12:return          
		} else
		{
			MediaBrowserCompatApi24.unsubscribe(mBrowserObj, s, MediaBrowserCompat.SubscriptionCallback.access$200(subscriptioncallback));
	//    7   13:aload_0         
	//    8   14:getfield        #19  <Field Object mBrowserObj>
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokestatic    #25  <Method Object MediaBrowserCompat$SubscriptionCallback.access$200(MediaBrowserCompat$SubscriptionCallback)>
	//   12   22:invokestatic    #43  <Method void MediaBrowserCompatApi24.unsubscribe(Object, String, Object)>
			return;
	//   13   25:return          
		}
	}

	public MediaBrowserCompat$MediaBrowserImplApi24(Context context, ComponentName componentname, MediaBrowserCompat.ConnectionCallback connectioncallback, Bundle bundle)
	{
		super(context, componentname, connectioncallback, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #11  <Method void MediaBrowserCompat$MediaBrowserImplApi23(Context, ComponentName, MediaBrowserCompat$ConnectionCallback, Bundle)>
	//    6    9:return          
	}
}
