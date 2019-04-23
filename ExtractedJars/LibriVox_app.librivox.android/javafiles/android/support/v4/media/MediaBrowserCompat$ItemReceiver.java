// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;

// Referenced classes of package android.support.v4.media:
//			i

class MediaBrowserCompat$ItemReceiver extends ResultReceiver
{

	protected void a(int j, Bundle bundle)
	{
		MediaSessionCompat.a(bundle);
	//    0    0:aload_2         
	//    1    1:invokestatic    #15  <Method void MediaSessionCompat.a(Bundle)>
		if(j == 0 && bundle != null && bundle.containsKey("media_item"))
	//*   2    4:iload_1         
	//*   3    5:ifne            69
	//*   4    8:aload_2         
	//*   5    9:ifnull          69
	//*   6   12:aload_2         
	//*   7   13:ldc1            #17  <String "media_item">
	//*   8   15:invokevirtual   #23  <Method boolean Bundle.containsKey(String)>
	//*   9   18:ifne            24
	//*  10   21:goto            69
		{
			bundle = ((Bundle) (bundle.getParcelable("media_item")));
	//   11   24:aload_2         
	//   12   25:ldc1            #17  <String "media_item">
	//   13   27:invokevirtual   #27  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   14   30:astore_2        
			if(bundle != null && !(bundle instanceof MediaBrowserCompat.MediaItem))
	//*  15   31:aload_2         
	//*  16   32:ifnull          57
	//*  17   35:aload_2         
	//*  18   36:instanceof      #29  <Class MediaBrowserCompat$MediaItem>
	//*  19   39:ifeq            45
	//*  20   42:goto            57
			{
				e.a(d);
	//   21   45:aload_0         
	//   22   46:getfield        #31  <Field i e>
	//   23   49:aload_0         
	//   24   50:getfield        #33  <Field String d>
	//   25   53:invokevirtual   #38  <Method void i.a(String)>
				return;
	//   26   56:return          
			} else
			{
				e.a((MediaBrowserCompat.MediaItem)bundle);
	//   27   57:aload_0         
	//   28   58:getfield        #31  <Field i e>
	//   29   61:aload_2         
	//   30   62:checkcast       #29  <Class MediaBrowserCompat$MediaItem>
	//   31   65:invokevirtual   #41  <Method void i.a(MediaBrowserCompat$MediaItem)>
				return;
	//   32   68:return          
			}
		} else
		{
			e.a(d);
	//   33   69:aload_0         
	//   34   70:getfield        #31  <Field i e>
	//   35   73:aload_0         
	//   36   74:getfield        #33  <Field String d>
	//   37   77:invokevirtual   #38  <Method void i.a(String)>
			return;
	//   38   80:return          
		}
	}

	private final String d;
	private final i e;
}
