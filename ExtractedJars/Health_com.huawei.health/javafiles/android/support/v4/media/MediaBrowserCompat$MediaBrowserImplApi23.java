// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat, MediaBrowserCompatApi23

static class MediaBrowserCompat$MediaBrowserImplApi23 extends MediaBrowserCompat$MediaBrowserImplApi21
{

	public void getItem(String s, MediaBrowserCompat.ItemCallback itemcallback)
	{
		if(mServiceBinderWrapper == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*   2    4:ifnonnull       20
		{
			MediaBrowserCompatApi23.getItem(mBrowserObj, s, itemcallback.mItemCallbackObj);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field Object mBrowserObj>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:getfield        #28  <Field Object MediaBrowserCompat$ItemCallback.mItemCallbackObj>
	//    8   16:invokestatic    #33  <Method void MediaBrowserCompatApi23.getItem(Object, String, Object)>
			return;
	//    9   19:return          
		} else
		{
			super.getItem(s, itemcallback);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokespecial   #35  <Method void MediaBrowserCompat$MediaBrowserImplApi21.getItem(String, MediaBrowserCompat$ItemCallback)>
			return;
	//   14   26:return          
		}
	}

	public MediaBrowserCompat$MediaBrowserImplApi23(Context context, ComponentName componentname, MediaBrowserCompat.ConnectionCallback connectioncallback, Bundle bundle)
	{
		super(context, componentname, connectioncallback, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #11  <Method void MediaBrowserCompat$MediaBrowserImplApi21(Context, ComponentName, MediaBrowserCompat$ConnectionCallback, Bundle)>
	//    6    9:return          
	}
}
