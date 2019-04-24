// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Parcel;
import java.util.*;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$MediaBrowserServiceImplApi24$1 extends MediaBrowserServiceCompat.Result
{

	public void detach()
	{
		val$resultWrapper.detach();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MediaBrowserServiceCompatApi24$ResultWrapper val$resultWrapper>
	//    2    4:invokevirtual   #33  <Method void MediaBrowserServiceCompatApi24$ResultWrapper.detach()>
	//    3    7:return          
	}

	volatile void onResultSent(Object obj)
	{
		onResultSent((List)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #36  <Class List>
	//    3    5:invokevirtual   #39  <Method void onResultSent(List)>
	//    4    8:return          
	}

	void onResultSent(List list)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(list != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          66
		{
			ArrayList arraylist = new ArrayList();
	//    4    6:new             #41  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #43  <Method void ArrayList()>
	//    7   13:astore_3        
			list = ((List) (list.iterator()));
	//    8   14:aload_1         
	//    9   15:invokeinterface #47  <Method Iterator List.iterator()>
	//   10   20:astore_1        
			do
			{
				obj = ((Object) (arraylist));
	//   11   21:aload_3         
	//   12   22:astore_2        
				if(!((Iterator) (list)).hasNext())
					break;
	//   13   23:aload_1         
	//   14   24:invokeinterface #53  <Method boolean Iterator.hasNext()>
	//   15   29:ifeq            66
				obj = ((Object) ((MediaBrowserCompat.MediaItem)((Iterator) (list)).next()));
	//   16   32:aload_1         
	//   17   33:invokeinterface #57  <Method Object Iterator.next()>
	//   18   38:checkcast       #59  <Class MediaBrowserCompat$MediaItem>
	//   19   41:astore_2        
				Parcel parcel = Parcel.obtain();
	//   20   42:invokestatic    #65  <Method Parcel Parcel.obtain()>
	//   21   45:astore          4
				((MediaBrowserCompat.MediaItem) (obj)).writeToParcel(parcel, 0);
	//   22   47:aload_2         
	//   23   48:aload           4
	//   24   50:iconst_0        
	//   25   51:invokevirtual   #69  <Method void MediaBrowserCompat$MediaItem.writeToParcel(Parcel, int)>
				((List) (arraylist)).add(((Object) (parcel)));
	//   26   54:aload_3         
	//   27   55:aload           4
	//   28   57:invokeinterface #73  <Method boolean List.add(Object)>
	//   29   62:pop             
			} while(true);
	//   30   63:goto            21
		}
		val$resultWrapper.sendResult(((List) (obj)), getFlags());
	//   31   66:aload_0         
	//   32   67:getfield        #23  <Field MediaBrowserServiceCompatApi24$ResultWrapper val$resultWrapper>
	//   33   70:aload_2         
	//   34   71:aload_0         
	//   35   72:invokevirtual   #77  <Method int getFlags()>
	//   36   75:invokevirtual   #81  <Method void MediaBrowserServiceCompatApi24$ResultWrapper.sendResult(List, int)>
	//   37   78:return          
	}

	final MediaBrowserServiceCompat.MediaBrowserServiceImplApi24 this$1;
	final MediaBrowserServiceCompatApi24.ResultWrapper val$resultWrapper;

	MediaBrowserServiceCompat$MediaBrowserServiceImplApi24$1(MediaBrowserServiceCompatApi24.ResultWrapper resultwrapper)
	{
		this$1 = final_mediabrowserserviceimplapi24;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi24 this$1>
		val$resultWrapper = resultwrapper;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #23  <Field MediaBrowserServiceCompatApi24$ResultWrapper val$resultWrapper>
		super(Object.this);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #26  <Method void MediaBrowserServiceCompat$Result(Object)>
	//    9   15:return          
	}
}
