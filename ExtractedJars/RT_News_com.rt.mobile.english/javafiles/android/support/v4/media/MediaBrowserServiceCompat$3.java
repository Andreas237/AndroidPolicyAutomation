// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$3 extends sult
{

	volatile void onResultSent(Object obj)
	{
		onResultSent((List)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class List>
	//    3    5:invokevirtual   #30  <Method void onResultSent(List)>
	//    4    8:return          
	}

	void onResultSent(List list)
	{
		if((getFlags() & 4) == 0 && list != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #34  <Method int getFlags()>
	//*   2    4:iconst_4        
	//*   3    5:iand            
	//*   4    6:ifne            53
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       16
	//*   7   13:goto            53
		{
			Bundle bundle = new Bundle();
	//    8   16:new             #36  <Class Bundle>
	//    9   19:dup             
	//   10   20:invokespecial   #39  <Method void Bundle()>
	//   11   23:astore_2        
			bundle.putParcelableArray("search_results", (android.os.Parcelable[])list.toArray(((Object []) (new [0]))));
	//   12   24:aload_2         
	//   13   25:ldc1            #41  <String "search_results">
	//   14   27:aload_1         
	//   15   28:iconst_0        
	//   16   29:anewarray       []
	//   17   32:invokeinterface #47  <Method Object[] List.toArray(Object[])>
	//   18   37:checkcast       #49  <Class android.os.Parcelable[]>
	//   19   40:invokevirtual   #53  <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
			val$receiver.send(0, bundle);
	//   20   43:aload_0         
	//   21   44:getfield        #20  <Field ResultReceiver val$receiver>
	//   22   47:iconst_0        
	//   23   48:aload_2         
	//   24   49:invokevirtual   #59  <Method void ResultReceiver.send(int, Bundle)>
			return;
	//   25   52:return          
		} else
		{
			val$receiver.send(-1, ((Bundle) (null)));
	//   26   53:aload_0         
	//   27   54:getfield        #20  <Field ResultReceiver val$receiver>
	//   28   57:iconst_m1       
	//   29   58:aconst_null     
	//   30   59:invokevirtual   #59  <Method void ResultReceiver.send(int, Bundle)>
			return;
	//   31   62:return          
		}
	}

	final MediaBrowserServiceCompat this$0;
	final ResultReceiver val$receiver;

	MediaBrowserServiceCompat$3(ResultReceiver resultreceiver)
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
