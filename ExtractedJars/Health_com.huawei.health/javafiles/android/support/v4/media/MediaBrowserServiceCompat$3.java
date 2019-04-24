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

	volatile void onResultSent(Object obj, int i)
	{
		onResultSent((List)obj, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #28  <Class List>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #31  <Method void onResultSent(List, int)>
	//    5    9:return          
	}

	void onResultSent(List list, int i)
	{
		if((i & 4) != 0 || list == null)
	//*   0    0:iload_2         
	//*   1    1:iconst_4        
	//*   2    2:iand            
	//*   3    3:ifne            10
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       20
		{
			val$receiver.send(-1, ((Bundle) (null)));
	//    6   10:aload_0         
	//    7   11:getfield        #20  <Field ResultReceiver val$receiver>
	//    8   14:iconst_m1       
	//    9   15:aconst_null     
	//   10   16:invokevirtual   #37  <Method void ResultReceiver.send(int, Bundle)>
			return;
	//   11   19:return          
		} else
		{
			Bundle bundle = new Bundle();
	//   12   20:new             #39  <Class Bundle>
	//   13   23:dup             
	//   14   24:invokespecial   #42  <Method void Bundle()>
	//   15   27:astore_3        
			bundle.putParcelableArray("search_results", (android.os.Parcelable[])list.toArray(((Object []) (new [0]))));
	//   16   28:aload_3         
	//   17   29:ldc1            #44  <String "search_results">
	//   18   31:aload_1         
	//   19   32:iconst_0        
	//   20   33:anewarray       []
	//   21   36:invokeinterface #50  <Method Object[] List.toArray(Object[])>
	//   22   41:checkcast       #52  <Class android.os.Parcelable[]>
	//   23   44:invokevirtual   #56  <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
			val$receiver.send(0, bundle);
	//   24   47:aload_0         
	//   25   48:getfield        #20  <Field ResultReceiver val$receiver>
	//   26   51:iconst_0        
	//   27   52:aload_3         
	//   28   53:invokevirtual   #37  <Method void ResultReceiver.send(int, Bundle)>
			return;
	//   29   56:return          
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
