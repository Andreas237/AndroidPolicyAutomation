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

	void onResultSent( )
	{
		if((getFlags() & 2) != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #30  <Method int getFlags()>
	//*   2    4:iconst_2        
	//*   3    5:iand            
	//*   4    6:ifeq            19
		{
			val$receiver.send(-1, ((Bundle) (null)));
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field ResultReceiver val$receiver>
	//    7   13:iconst_m1       
	//    8   14:aconst_null     
	//    9   15:invokevirtual   #36  <Method void ResultReceiver.send(int, Bundle)>
			return;
	//   10   18:return          
		} else
		{
			Bundle bundle = new Bundle();
	//   11   19:new             #38  <Class Bundle>
	//   12   22:dup             
	//   13   23:invokespecial   #41  <Method void Bundle()>
	//   14   26:astore_2        
			bundle.putParcelable("media_item", ((android.os.Parcelable) ()));
	//   15   27:aload_2         
	//   16   28:ldc1            #43  <String "media_item">
	//   17   30:aload_1         
	//   18   31:invokevirtual   #47  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			val$receiver.send(0, bundle);
	//   19   34:aload_0         
	//   20   35:getfield        #20  <Field ResultReceiver val$receiver>
	//   21   38:iconst_0        
	//   22   39:aload_2         
	//   23   40:invokevirtual   #36  <Method void ResultReceiver.send(int, Bundle)>
			return;
	//   24   43:return          
		}
	}

	volatile void onResultSent(Object obj)
	{
		onResultSent(()obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #49  <Class MediaBrowserCompat$MediaItem>
	//    3    5:invokevirtual   #51  <Method void onResultSent(MediaBrowserCompat$MediaItem)>
	//    4    8:return          
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
