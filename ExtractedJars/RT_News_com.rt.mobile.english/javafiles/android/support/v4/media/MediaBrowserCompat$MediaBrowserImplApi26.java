// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat, MediaBrowserCompatApi21, MediaBrowserCompatApi26

static class MediaBrowserCompat$MediaBrowserImplApi26 extends MediaBrowserCompat$MediaBrowserImplApi23
{

	public void subscribe(String s, Bundle bundle, MediaBrowserCompat.SubscriptionCallback subscriptioncallback)
	{
		if(mServiceBinderWrapper != null && mServiceVersion >= 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*   2    4:ifnull          26
	//*   3    7:aload_0         
	//*   4    8:getfield        #27  <Field int mServiceVersion>
	//*   5   11:iconst_2        
	//*   6   12:icmpge          18
	//*   7   15:goto            26
		{
			super.subscribe(s, bundle, subscriptioncallback);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:invokespecial   #29  <Method void MediaBrowserCompat$MediaBrowserImplApi23.subscribe(String, Bundle, MediaBrowserCompat$SubscriptionCallback)>
			return;
	//   13   25:return          
		}
		if(bundle == null)
	//*  14   26:aload_2         
	//*  15   27:ifnonnull       43
		{
			MediaBrowserCompatApi21.subscribe(mBrowserObj, s, MediaBrowserCompat.SubscriptionCallback.access$200(subscriptioncallback));
	//   16   30:aload_0         
	//   17   31:getfield        #33  <Field Object mBrowserObj>
	//   18   34:aload_1         
	//   19   35:aload_3         
	//   20   36:invokestatic    #39  <Method Object MediaBrowserCompat$SubscriptionCallback.access$200(MediaBrowserCompat$SubscriptionCallback)>
	//   21   39:invokestatic    #44  <Method void MediaBrowserCompatApi21.subscribe(Object, String, Object)>
			return;
	//   22   42:return          
		} else
		{
			MediaBrowserCompatApi26.subscribe(mBrowserObj, s, bundle, MediaBrowserCompat.SubscriptionCallback.access$200(subscriptioncallback));
	//   23   43:aload_0         
	//   24   44:getfield        #33  <Field Object mBrowserObj>
	//   25   47:aload_1         
	//   26   48:aload_2         
	//   27   49:aload_3         
	//   28   50:invokestatic    #39  <Method Object MediaBrowserCompat$SubscriptionCallback.access$200(MediaBrowserCompat$SubscriptionCallback)>
	//   29   53:invokestatic    #49  <Method void MediaBrowserCompatApi26.subscribe(Object, String, Bundle, Object)>
			return;
	//   30   56:return          
		}
	}

	public void unsubscribe(String s, MediaBrowserCompat.SubscriptionCallback subscriptioncallback)
	{
		if(mServiceBinderWrapper != null && mServiceVersion >= 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #27  <Field int mServiceVersion>
	//*   5   11:iconst_2        
	//*   6   12:icmpge          18
	//*   7   15:goto            25
		{
			super.unsubscribe(s, subscriptioncallback);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokespecial   #54  <Method void MediaBrowserCompat$MediaBrowserImplApi23.unsubscribe(String, MediaBrowserCompat$SubscriptionCallback)>
			return;
	//   12   24:return          
		}
		if(subscriptioncallback == null)
	//*  13   25:aload_2         
	//*  14   26:ifnonnull       38
		{
			MediaBrowserCompatApi21.unsubscribe(mBrowserObj, s);
	//   15   29:aload_0         
	//   16   30:getfield        #33  <Field Object mBrowserObj>
	//   17   33:aload_1         
	//   18   34:invokestatic    #57  <Method void MediaBrowserCompatApi21.unsubscribe(Object, String)>
			return;
	//   19   37:return          
		} else
		{
			MediaBrowserCompatApi26.unsubscribe(mBrowserObj, s, MediaBrowserCompat.SubscriptionCallback.access$200(subscriptioncallback));
	//   20   38:aload_0         
	//   21   39:getfield        #33  <Field Object mBrowserObj>
	//   22   42:aload_1         
	//   23   43:aload_2         
	//   24   44:invokestatic    #39  <Method Object MediaBrowserCompat$SubscriptionCallback.access$200(MediaBrowserCompat$SubscriptionCallback)>
	//   25   47:invokestatic    #59  <Method void MediaBrowserCompatApi26.unsubscribe(Object, String, Object)>
			return;
	//   26   50:return          
		}
	}

	MediaBrowserCompat$MediaBrowserImplApi26(Context context, ComponentName componentname, MediaBrowserCompat.ConnectionCallback connectioncallback, Bundle bundle)
	{
		super(context, componentname, connectioncallback, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #14  <Method void MediaBrowserCompat$MediaBrowserImplApi23(Context, ComponentName, MediaBrowserCompat$ConnectionCallback, Bundle)>
	//    6    9:return          
	}
}
