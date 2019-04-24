// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

private static class MediaBrowserCompat$ItemReceiver extends ResultReceiver
{

	protected void a(int i, Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          13
			bundle.setClassLoader(((Class) (android/support/v4/media/MediaBrowserCompat)).getClassLoader());
	//    2    4:aload_2         
	//    3    5:ldc1            #6   <Class MediaBrowserCompat>
	//    4    7:invokevirtual   #19  <Method ClassLoader Class.getClassLoader()>
	//    5   10:invokevirtual   #25  <Method void Bundle.setClassLoader(ClassLoader)>
		if(i == 0 && bundle != null && bundle.containsKey("media_item"))
	//*   6   13:iload_1         
	//*   7   14:ifne            78
	//*   8   17:aload_2         
	//*   9   18:ifnull          78
	//*  10   21:aload_2         
	//*  11   22:ldc1            #27  <String "media_item">
	//*  12   24:invokevirtual   #31  <Method boolean Bundle.containsKey(String)>
	//*  13   27:ifne            33
	//*  14   30:goto            78
		{
			bundle = ((Bundle) (bundle.getParcelable("media_item")));
	//   15   33:aload_2         
	//   16   34:ldc1            #27  <String "media_item">
	//   17   36:invokevirtual   #35  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   18   39:astore_2        
			if(bundle != null && !(bundle instanceof MediaBrowserCompat.MediaItem))
	//*  19   40:aload_2         
	//*  20   41:ifnull          66
	//*  21   44:aload_2         
	//*  22   45:instanceof      #37  <Class MediaBrowserCompat$MediaItem>
	//*  23   48:ifeq            54
	//*  24   51:goto            66
			{
				e.a(d);
	//   25   54:aload_0         
	//   26   55:getfield        #39  <Field MediaBrowserCompat$d e>
	//   27   58:aload_0         
	//   28   59:getfield        #41  <Field String d>
	//   29   62:invokevirtual   #46  <Method void MediaBrowserCompat$d.a(String)>
				return;
	//   30   65:return          
			} else
			{
				e.a((MediaBrowserCompat.MediaItem)bundle);
	//   31   66:aload_0         
	//   32   67:getfield        #39  <Field MediaBrowserCompat$d e>
	//   33   70:aload_2         
	//   34   71:checkcast       #37  <Class MediaBrowserCompat$MediaItem>
	//   35   74:invokevirtual   #49  <Method void MediaBrowserCompat$d.a(MediaBrowserCompat$MediaItem)>
				return;
	//   36   77:return          
			}
		} else
		{
			e.a(d);
	//   37   78:aload_0         
	//   38   79:getfield        #39  <Field MediaBrowserCompat$d e>
	//   39   82:aload_0         
	//   40   83:getfield        #41  <Field String d>
	//   41   86:invokevirtual   #46  <Method void MediaBrowserCompat$d.a(String)>
			return;
	//   42   89:return          
		}
	}

	private final String d;
	private final MediaBrowserCompat.d e;
}
