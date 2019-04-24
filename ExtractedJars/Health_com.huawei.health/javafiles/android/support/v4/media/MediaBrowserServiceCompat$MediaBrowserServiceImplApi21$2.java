// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Parcel;
import java.util.*;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$2 extends MediaBrowserServiceCompat.Result
{

	public void detach()
	{
		val$resultWrapper.detach();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MediaBrowserServiceCompatApi21$ResultWrapper val$resultWrapper>
	//    2    4:invokevirtual   #33  <Method void MediaBrowserServiceCompatApi21$ResultWrapper.detach()>
	//    3    7:return          
	}

	volatile void onResultSent(Object obj, int i)
	{
		onResultSent((List)obj, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #37  <Class List>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #40  <Method void onResultSent(List, int)>
	//    5    9:return          
	}

	void onResultSent(List list, int i)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		if(list != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          69
		{
			ArrayList arraylist = new ArrayList();
	//    4    6:new             #42  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #44  <Method void ArrayList()>
	//    7   13:astore          4
			list = ((List) (list.iterator()));
	//    8   15:aload_1         
	//    9   16:invokeinterface #48  <Method Iterator List.iterator()>
	//   10   21:astore_1        
			do
			{
				obj = ((Object) (arraylist));
	//   11   22:aload           4
	//   12   24:astore_3        
				if(!((Iterator) (list)).hasNext())
					break;
	//   13   25:aload_1         
	//   14   26:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//   15   31:ifeq            69
				obj = ((Object) ((MediaBrowserCompat.MediaItem)((Iterator) (list)).next()));
	//   16   34:aload_1         
	//   17   35:invokeinterface #58  <Method Object Iterator.next()>
	//   18   40:checkcast       #60  <Class MediaBrowserCompat$MediaItem>
	//   19   43:astore_3        
				Parcel parcel = Parcel.obtain();
	//   20   44:invokestatic    #66  <Method Parcel Parcel.obtain()>
	//   21   47:astore          5
				((MediaBrowserCompat.MediaItem) (obj)).writeToParcel(parcel, 0);
	//   22   49:aload_3         
	//   23   50:aload           5
	//   24   52:iconst_0        
	//   25   53:invokevirtual   #70  <Method void MediaBrowserCompat$MediaItem.writeToParcel(Parcel, int)>
				((List) (arraylist)).add(((Object) (parcel)));
	//   26   56:aload           4
	//   27   58:aload           5
	//   28   60:invokeinterface #74  <Method boolean List.add(Object)>
	//   29   65:pop             
			} while(true);
	//   30   66:goto            22
		}
		val$resultWrapper.sendResult(obj);
	//   31   69:aload_0         
	//   32   70:getfield        #23  <Field MediaBrowserServiceCompatApi21$ResultWrapper val$resultWrapper>
	//   33   73:aload_3         
	//   34   74:invokevirtual   #77  <Method void MediaBrowserServiceCompatApi21$ResultWrapper.sendResult(Object)>
	//   35   77:return          
	}

	final MediaBrowserServiceCompat.MediaBrowserServiceImplApi21 this$1;
	final MediaBrowserServiceCompatApi21.ResultWrapper val$resultWrapper;

	MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$2(MediaBrowserServiceCompatApi21.ResultWrapper resultwrapper)
	{
		this$1 = final_mediabrowserserviceimplapi21;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
		val$resultWrapper = resultwrapper;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #23  <Field MediaBrowserServiceCompatApi21$ResultWrapper val$resultWrapper>
		super(Object.this);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #26  <Method void MediaBrowserServiceCompat$Result(Object)>
	//    9   15:return          
	}
}
