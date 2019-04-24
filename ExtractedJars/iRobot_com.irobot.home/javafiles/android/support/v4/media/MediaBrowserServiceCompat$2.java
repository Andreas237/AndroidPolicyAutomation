// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$2 extends MediaBrowserServiceCompat$c
{

	void a( )
	{
		if((b() & 2) != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #27  <Method int b()>
	//*   2    4:iconst_2        
	//*   3    5:iand            
	//*   4    6:ifeq            19
		{
			a.b(-1, ((Bundle) (null)));
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field ResultReceiver a>
	//    7   13:iconst_m1       
	//    8   14:aconst_null     
	//    9   15:invokevirtual   #32  <Method void ResultReceiver.b(int, Bundle)>
			return;
	//   10   18:return          
		} else
		{
			Bundle bundle = new Bundle();
	//   11   19:new             #34  <Class Bundle>
	//   12   22:dup             
	//   13   23:invokespecial   #37  <Method void Bundle()>
	//   14   26:astore_2        
			bundle.putParcelable("media_item", ((android.os.Parcelable) ()));
	//   15   27:aload_2         
	//   16   28:ldc1            #39  <String "media_item">
	//   17   30:aload_1         
	//   18   31:invokevirtual   #43  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			a.b(0, bundle);
	//   19   34:aload_0         
	//   20   35:getfield        #19  <Field ResultReceiver a>
	//   21   38:iconst_0        
	//   22   39:aload_2         
	//   23   40:invokevirtual   #32  <Method void ResultReceiver.b(int, Bundle)>
			return;
	//   24   43:return          
		}
	}

	volatile void a(Object obj)
	{
		a(()obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #45  <Class MediaBrowserCompat$MediaItem>
	//    3    5:invokevirtual   #47  <Method void a(MediaBrowserCompat$MediaItem)>
	//    4    8:return          
	}

	final ResultReceiver a;
	final MediaBrowserServiceCompat b;

	MediaBrowserServiceCompat$2(MediaBrowserServiceCompat mediabrowserservicecompat, Object obj, ResultReceiver resultreceiver)
	{
		b = mediabrowserservicecompat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MediaBrowserServiceCompat b>
		a = resultreceiver;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #19  <Field ResultReceiver a>
		super(obj);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #22  <Method void MediaBrowserServiceCompat$c(Object)>
	//    9   15:return          
	}
}
