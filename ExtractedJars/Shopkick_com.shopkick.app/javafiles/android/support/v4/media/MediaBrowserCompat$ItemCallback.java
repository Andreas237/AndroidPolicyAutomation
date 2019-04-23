// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Parcel;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat, MediaBrowserCompatApi23

public static abstract class MediaBrowserCompat$ItemCallback
{
	private class StubApi23
		implements MediaBrowserCompatApi23.ItemCallback
	{

		public void onError(String s)
		{
			MediaBrowserCompat.ItemCallback.this.onError(s);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field MediaBrowserCompat$ItemCallback this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #27  <Method void MediaBrowserCompat$ItemCallback.onError(String)>
		//    4    8:return          
		}

		public void onItemLoaded(Parcel parcel)
		{
			if(parcel == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
			{
				MediaBrowserCompat.ItemCallback.this.onItemLoaded(((MediaBrowserCompat.MediaItem) (null)));
		//    2    4:aload_0         
		//    3    5:getfield        #18  <Field MediaBrowserCompat$ItemCallback this$0>
		//    4    8:aconst_null     
		//    5    9:invokevirtual   #33  <Method void MediaBrowserCompat$ItemCallback.onItemLoaded(MediaBrowserCompat$MediaItem)>
				return;
		//    6   12:return          
			} else
			{
				parcel.setDataPosition(0);
		//    7   13:aload_1         
		//    8   14:iconst_0        
		//    9   15:invokevirtual   #39  <Method void Parcel.setDataPosition(int)>
				MediaBrowserCompat.MediaItem mediaitem = (MediaBrowserCompat.MediaItem)MediaBrowserCompat.MediaItem.CREATOR.createFromParcel(parcel);
		//   10   18:getstatic       #45  <Field android.os.Parcelable$Creator MediaBrowserCompat$MediaItem.CREATOR>
		//   11   21:aload_1         
		//   12   22:invokeinterface #51  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   13   27:checkcast       #41  <Class MediaBrowserCompat$MediaItem>
		//   14   30:astore_2        
				parcel.recycle();
		//   15   31:aload_1         
		//   16   32:invokevirtual   #54  <Method void Parcel.recycle()>
				MediaBrowserCompat.ItemCallback.this.onItemLoaded(mediaitem);
		//   17   35:aload_0         
		//   18   36:getfield        #18  <Field MediaBrowserCompat$ItemCallback this$0>
		//   19   39:aload_2         
		//   20   40:invokevirtual   #33  <Method void MediaBrowserCompat$ItemCallback.onItemLoaded(MediaBrowserCompat$MediaItem)>
				return;
		//   21   43:return          
			}
		}

		final MediaBrowserCompat.ItemCallback this$0;

		StubApi23()
		{
			this$0 = MediaBrowserCompat.ItemCallback.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field MediaBrowserCompat$ItemCallback this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
		//    5    9:return          
		}
	}


	public void onError(String s)
	{
	//    0    0:return          
	}

	public void onItemLoaded(MediaBrowserCompat.MediaItem mediaitem)
	{
	//    0    0:return          
	}

	final Object mItemCallbackObj;

	public MediaBrowserCompat$ItemCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   2    4:getstatic       #22  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          23
	//*   4    9:icmplt          28
		{
			mItemCallbackObj = MediaBrowserCompatApi23.createItemCallback(((back) (new StubApi23())));
	//    5   12:aload_0         
	//    6   13:new             #9   <Class MediaBrowserCompat$ItemCallback$StubApi23>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #25  <Method void MediaBrowserCompat$ItemCallback$StubApi23(MediaBrowserCompat$ItemCallback)>
	//   10   21:invokestatic    #31  <Method Object MediaBrowserCompatApi23.createItemCallback(MediaBrowserCompatApi23$ItemCallback)>
	//   11   24:putfield        #33  <Field Object mItemCallbackObj>
			return;
	//   12   27:return          
		} else
		{
			mItemCallbackObj = null;
	//   13   28:aload_0         
	//   14   29:aconst_null     
	//   15   30:putfield        #33  <Field Object mItemCallbackObj>
			return;
	//   16   33:return          
		}
	}
}
