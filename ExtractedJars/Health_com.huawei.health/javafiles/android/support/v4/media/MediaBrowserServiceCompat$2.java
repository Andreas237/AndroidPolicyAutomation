// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$2 extends sult
{

	void onResultSent( , int i)
	{
		if((i & 2) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            16
		{
			val$receiver.send(-1, ((Bundle) (null)));
	//    4    6:aload_0         
	//    5    7:getfield        #20  <Field ResultReceiver val$receiver>
	//    6   10:iconst_m1       
	//    7   11:aconst_null     
	//    8   12:invokevirtual   #32  <Method void ResultReceiver.send(int, Bundle)>
			return;
	//    9   15:return          
		} else
		{
			Bundle bundle = new Bundle();
	//   10   16:new             #34  <Class Bundle>
	//   11   19:dup             
	//   12   20:invokespecial   #37  <Method void Bundle()>
	//   13   23:astore_3        
			bundle.putParcelable("media_item", ((android.os.Parcelable) ()));
	//   14   24:aload_3         
	//   15   25:ldc1            #39  <String "media_item">
	//   16   27:aload_1         
	//   17   28:invokevirtual   #43  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			val$receiver.send(0, bundle);
	//   18   31:aload_0         
	//   19   32:getfield        #20  <Field ResultReceiver val$receiver>
	//   20   35:iconst_0        
	//   21   36:aload_3         
	//   22   37:invokevirtual   #32  <Method void ResultReceiver.send(int, Bundle)>
			return;
	//   23   40:return          
		}
	}

	volatile void onResultSent(Object obj, int i)
	{
		onResultSent(()obj, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #46  <Class MediaBrowserCompat$MediaItem>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #48  <Method void onResultSent(MediaBrowserCompat$MediaItem, int)>
	//    5    9:return          
	}

	final MediaBrowserServiceCompat this$0;
	final ResultReceiver val$receiver;

	MediaBrowserServiceCompat$2(ResultReceiver resultreceiver)
	{
		this$0 = final_mediabrowserservicecompat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field MediaBrowserServiceCompat this$0>
		val$receiver = resultreceiver;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #20  <Field ResultReceiver val$receiver>
		super(Object.this);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #23  <Method void MediaBrowserServiceCompat$Result(Object)>
	//    9   15:return          
	}
}
