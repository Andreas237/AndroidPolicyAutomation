// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Parcel;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompatApi23

static class MediaBrowserCompatApi23$ItemCallbackProxy extends android.media.browse.MediaBrowser.ItemCallback
{

	public void onError(String s)
	{
		mItemCallback.onError(s);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaBrowserCompatApi23$ItemCallback mItemCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #28  <Method void MediaBrowserCompatApi23$ItemCallback.onError(String)>
	//    4   10:return          
	}

	public void onItemLoaded(android.media.browse.MediaBrowser.MediaItem mediaitem)
	{
		if(mediaitem == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			mItemCallback.onItemLoaded(((Parcel) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field MediaBrowserCompatApi23$ItemCallback mItemCallback>
	//    4    8:aconst_null     
	//    5    9:invokeinterface #34  <Method void MediaBrowserCompatApi23$ItemCallback.onItemLoaded(Parcel)>
			return;
	//    6   14:return          
		} else
		{
			Parcel parcel = Parcel.obtain();
	//    7   15:invokestatic    #40  <Method Parcel Parcel.obtain()>
	//    8   18:astore_2        
			mediaitem.writeToParcel(parcel, 0);
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:iconst_0        
	//   12   22:invokevirtual   #46  <Method void android.media.browse.MediaBrowser$MediaItem.writeToParcel(Parcel, int)>
			mItemCallback.onItemLoaded(parcel);
	//   13   25:aload_0         
	//   14   26:getfield        #18  <Field MediaBrowserCompatApi23$ItemCallback mItemCallback>
	//   15   29:aload_2         
	//   16   30:invokeinterface #34  <Method void MediaBrowserCompatApi23$ItemCallback.onItemLoaded(Parcel)>
			return;
	//   17   35:return          
		}
	}

	protected final MediaBrowserCompatApi23.ItemCallback mItemCallback;

	public MediaBrowserCompatApi23$ItemCallbackProxy(MediaBrowserCompatApi23.ItemCallback itemcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void android.media.browse.MediaBrowser$ItemCallback()>
		mItemCallback = itemcallback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field MediaBrowserCompatApi23$ItemCallback mItemCallback>
	//    5    9:return          
	}
}
