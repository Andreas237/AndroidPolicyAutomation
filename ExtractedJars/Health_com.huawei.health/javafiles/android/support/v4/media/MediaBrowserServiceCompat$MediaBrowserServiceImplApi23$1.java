// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Parcel;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$1 extends MediaBrowserServiceCompat.Result
{

	public void detach()
	{
		val$resultWrapper.detach();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MediaBrowserServiceCompatApi21$ResultWrapper val$resultWrapper>
	//    2    4:invokevirtual   #33  <Method void MediaBrowserServiceCompatApi21$ResultWrapper.detach()>
	//    3    7:return          
	}

	void onResultSent(MediaBrowserCompat.MediaItem mediaitem, int i)
	{
		if(mediaitem == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
		{
			val$resultWrapper.sendResult(((Object) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field MediaBrowserServiceCompatApi21$ResultWrapper val$resultWrapper>
	//    4    8:aconst_null     
	//    5    9:invokevirtual   #38  <Method void MediaBrowserServiceCompatApi21$ResultWrapper.sendResult(Object)>
			return;
	//    6   12:return          
		} else
		{
			Parcel parcel = Parcel.obtain();
	//    7   13:invokestatic    #44  <Method Parcel Parcel.obtain()>
	//    8   16:astore_3        
			mediaitem.writeToParcel(parcel, 0);
	//    9   17:aload_1         
	//   10   18:aload_3         
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #50  <Method void MediaBrowserCompat$MediaItem.writeToParcel(Parcel, int)>
			val$resultWrapper.sendResult(((Object) (parcel)));
	//   13   23:aload_0         
	//   14   24:getfield        #23  <Field MediaBrowserServiceCompatApi21$ResultWrapper val$resultWrapper>
	//   15   27:aload_3         
	//   16   28:invokevirtual   #38  <Method void MediaBrowserServiceCompatApi21$ResultWrapper.sendResult(Object)>
			return;
	//   17   31:return          
		}
	}

	volatile void onResultSent(Object obj, int i)
	{
		onResultSent((MediaBrowserCompat.MediaItem)obj, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #46  <Class MediaBrowserCompat$MediaItem>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #53  <Method void onResultSent(MediaBrowserCompat$MediaItem, int)>
	//    5    9:return          
	}

	final MediaBrowserServiceCompat.MediaBrowserServiceImplApi23 this$1;
	final MediaBrowserServiceCompatApi21.ResultWrapper val$resultWrapper;

	MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$1(MediaBrowserServiceCompatApi21.ResultWrapper resultwrapper)
	{
		this$1 = final_mediabrowserserviceimplapi23;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi23 this$1>
		val$resultWrapper = resultwrapper;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #23  <Field MediaBrowserServiceCompatApi21$ResultWrapper val$resultWrapper>
		super(Object.this);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #26  <Method void MediaBrowserServiceCompat$Result(Object)>
	//    9   15:return          
	}
}
