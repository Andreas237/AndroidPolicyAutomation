// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$3 extends MediaBrowserServiceCompat$c
{

	volatile void a(Object obj)
	{
		a((List)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class List>
	//    3    5:invokevirtual   #28  <Method void a(List)>
	//    4    8:return          
	}

	void a(List list)
	{
		if((b() & 4) == 0 && list != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #31  <Method int b()>
	//*   2    4:iconst_4        
	//*   3    5:iand            
	//*   4    6:ifne            53
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       16
	//*   7   13:goto            53
		{
			Bundle bundle = new Bundle();
	//    8   16:new             #33  <Class Bundle>
	//    9   19:dup             
	//   10   20:invokespecial   #36  <Method void Bundle()>
	//   11   23:astore_2        
			bundle.putParcelableArray("search_results", (android.os.Parcelable[])list.toArray(((Object []) (new [0]))));
	//   12   24:aload_2         
	//   13   25:ldc1            #38  <String "search_results">
	//   14   27:aload_1         
	//   15   28:iconst_0        
	//   16   29:anewarray       []
	//   17   32:invokeinterface #44  <Method Object[] List.toArray(Object[])>
	//   18   37:checkcast       #46  <Class android.os.Parcelable[]>
	//   19   40:invokevirtual   #50  <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
			a.b(0, bundle);
	//   20   43:aload_0         
	//   21   44:getfield        #19  <Field ResultReceiver a>
	//   22   47:iconst_0        
	//   23   48:aload_2         
	//   24   49:invokevirtual   #55  <Method void ResultReceiver.b(int, Bundle)>
			return;
	//   25   52:return          
		} else
		{
			a.b(-1, ((Bundle) (null)));
	//   26   53:aload_0         
	//   27   54:getfield        #19  <Field ResultReceiver a>
	//   28   57:iconst_m1       
	//   29   58:aconst_null     
	//   30   59:invokevirtual   #55  <Method void ResultReceiver.b(int, Bundle)>
			return;
	//   31   62:return          
		}
	}

	final ResultReceiver a;
	final MediaBrowserServiceCompat b;

	MediaBrowserServiceCompat$3(MediaBrowserServiceCompat mediabrowserservicecompat, Object obj, ResultReceiver resultreceiver)
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
