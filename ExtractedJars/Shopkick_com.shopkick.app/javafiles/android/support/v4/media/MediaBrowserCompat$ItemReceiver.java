// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

private static class MediaBrowserCompat$ItemReceiver extends ResultReceiver
{

	protected void onReceiveResult(int i, Bundle bundle)
	{
		MediaSessionCompat.ensureClassLoader(bundle);
	//    0    0:aload_2         
	//    1    1:invokestatic    #29  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
		if(i == 0 && bundle != null && bundle.containsKey("media_item"))
	//*   2    4:iload_1         
	//*   3    5:ifne            69
	//*   4    8:aload_2         
	//*   5    9:ifnull          69
	//*   6   12:aload_2         
	//*   7   13:ldc1            #31  <String "media_item">
	//*   8   15:invokevirtual   #37  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifne            24
	//*  10   21:goto            69
		{
			bundle = ((Bundle) (bundle.getParcelable("media_item")));
	//   11   24:aload_2         
	//   12   25:ldc1            #31  <String "media_item">
	//   13   27:invokevirtual   #41  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   14   30:astore_2        
			if(bundle != null && !(bundle instanceof MediaBrowserCompat.MediaItem))
	//*  15   31:aload_2         
	//*  16   32:ifnull          57
	//*  17   35:aload_2         
	//*  18   36:instanceof      #43  <Class MediaBrowserCompat$MediaItem>
	//*  19   39:ifeq            45
	//*  20   42:goto            57
			{
				mCallback.onError(mMediaId);
	//   21   45:aload_0         
	//   22   46:getfield        #20  <Field MediaBrowserCompat$ItemCallback mCallback>
	//   23   49:aload_0         
	//   24   50:getfield        #18  <Field String mMediaId>
	//   25   53:invokevirtual   #49  <Method void MediaBrowserCompat$ItemCallback.onError(String)>
				return;
	//   26   56:return          
			} else
			{
				mCallback.onItemLoaded((MediaBrowserCompat.MediaItem)bundle);
	//   27   57:aload_0         
	//   28   58:getfield        #20  <Field MediaBrowserCompat$ItemCallback mCallback>
	//   29   61:aload_2         
	//   30   62:checkcast       #43  <Class MediaBrowserCompat$MediaItem>
	//   31   65:invokevirtual   #53  <Method void MediaBrowserCompat$ItemCallback.onItemLoaded(MediaBrowserCompat$MediaItem)>
				return;
	//   32   68:return          
			}
		} else
		{
			mCallback.onError(mMediaId);
	//   33   69:aload_0         
	//   34   70:getfield        #20  <Field MediaBrowserCompat$ItemCallback mCallback>
	//   35   73:aload_0         
	//   36   74:getfield        #18  <Field String mMediaId>
	//   37   77:invokevirtual   #49  <Method void MediaBrowserCompat$ItemCallback.onError(String)>
			return;
	//   38   80:return          
		}
	}

	private final MediaBrowserCompat$ItemCallback mCallback;
	private final String mMediaId;

	MediaBrowserCompat$ItemReceiver(String s, MediaBrowserCompat$ItemCallback mediabrowsercompat$itemcallback, Handler handler)
	{
		super(handler);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokespecial   #16  <Method void ResultReceiver(Handler)>
		mMediaId = s;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #18  <Field String mMediaId>
		mCallback = mediabrowsercompat$itemcallback;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #20  <Field MediaBrowserCompat$ItemCallback mCallback>
	//    9   15:return          
	}
}
