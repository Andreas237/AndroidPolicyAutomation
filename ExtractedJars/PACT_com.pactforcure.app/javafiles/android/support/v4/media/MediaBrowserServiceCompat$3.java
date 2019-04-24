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
		if((getFlags() & 4) != 0 || list == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #34  <Method int getFlags()>
	//*   2    4:iconst_4        
	//*   3    5:iand            
	//*   4    6:ifne            13
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       23
		{
			val$receiver.send(-1, ((Bundle) (null)));
	//    7   13:aload_0         
	//    8   14:getfield        #20  <Field ResultReceiver val$receiver>
	//    9   17:iconst_m1       
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #40  <Method void ResultReceiver.send(int, Bundle)>
			return;
	//   12   22:return          
		} else
		{
			Bundle bundle = new Bundle();
	//   13   23:new             #42  <Class Bundle>
	//   14   26:dup             
	//   15   27:invokespecial   #45  <Method void Bundle()>
	//   16   30:astore_2        
			bundle.putParcelableArray("search_results", (android.os.Parcelable[])list.toArray(((Object []) (new [0]))));
	//   17   31:aload_2         
	//   18   32:ldc1            #47  <String "search_results">
	//   19   34:aload_1         
	//   20   35:iconst_0        
	//   21   36:anewarray       []
	//   22   39:invokeinterface #53  <Method Object[] List.toArray(Object[])>
	//   23   44:checkcast       #55  <Class android.os.Parcelable[]>
	//   24   47:invokevirtual   #59  <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
			val$receiver.send(0, bundle);
	//   25   50:aload_0         
	//   26   51:getfield        #20  <Field ResultReceiver val$receiver>
	//   27   54:iconst_0        
	//   28   55:aload_2         
	//   29   56:invokevirtual   #40  <Method void ResultReceiver.send(int, Bundle)>
			return;
	//   30   59:return          
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
