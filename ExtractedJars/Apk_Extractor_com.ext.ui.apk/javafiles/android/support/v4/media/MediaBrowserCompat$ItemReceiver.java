// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.os.ResultReceiver;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

private static class MediaBrowserCompat$ItemReceiver extends ResultReceiver
{

	protected void onReceiveResult(int i, Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          13
			bundle.setClassLoader(((Class) (android/support/v4/media/MediaBrowserCompat)).getClassLoader());
	//    2    4:aload_2         
	//    3    5:ldc1            #6   <Class MediaBrowserCompat>
	//    4    7:invokevirtual   #29  <Method ClassLoader Class.getClassLoader()>
	//    5   10:invokevirtual   #35  <Method void Bundle.setClassLoader(ClassLoader)>
		if(i != 0 || bundle == null || !bundle.containsKey("media_item"))
	//*   6   13:iload_1         
	//*   7   14:ifne            30
	//*   8   17:aload_2         
	//*   9   18:ifnull          30
	//*  10   21:aload_2         
	//*  11   22:ldc1            #37  <String "media_item">
	//*  12   24:invokevirtual   #41  <Method boolean Bundle.containsKey(String)>
	//*  13   27:ifne            42
		{
			mCallback.onError(mMediaId);
	//   14   30:aload_0         
	//   15   31:getfield        #20  <Field MediaBrowserCompat$ItemCallback mCallback>
	//   16   34:aload_0         
	//   17   35:getfield        #18  <Field String mMediaId>
	//   18   38:invokevirtual   #47  <Method void MediaBrowserCompat$ItemCallback.onError(String)>
			return;
	//   19   41:return          
		}
		bundle = ((Bundle) (bundle.getParcelable("media_item")));
	//   20   42:aload_2         
	//   21   43:ldc1            #37  <String "media_item">
	//   22   45:invokevirtual   #51  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   23   48:astore_2        
		if(bundle == null || (bundle instanceof MediaBrowserCompat.MediaItem))
	//*  24   49:aload_2         
	//*  25   50:ifnull          60
	//*  26   53:aload_2         
	//*  27   54:instanceof      #53  <Class MediaBrowserCompat$MediaItem>
	//*  28   57:ifeq            72
		{
			mCallback.onItemLoaded((MediaBrowserCompat.MediaItem)bundle);
	//   29   60:aload_0         
	//   30   61:getfield        #20  <Field MediaBrowserCompat$ItemCallback mCallback>
	//   31   64:aload_2         
	//   32   65:checkcast       #53  <Class MediaBrowserCompat$MediaItem>
	//   33   68:invokevirtual   #57  <Method void MediaBrowserCompat$ItemCallback.onItemLoaded(MediaBrowserCompat$MediaItem)>
			return;
	//   34   71:return          
		} else
		{
			mCallback.onError(mMediaId);
	//   35   72:aload_0         
	//   36   73:getfield        #20  <Field MediaBrowserCompat$ItemCallback mCallback>
	//   37   76:aload_0         
	//   38   77:getfield        #18  <Field String mMediaId>
	//   39   80:invokevirtual   #47  <Method void MediaBrowserCompat$ItemCallback.onError(String)>
			return;
	//   40   83:return          
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
