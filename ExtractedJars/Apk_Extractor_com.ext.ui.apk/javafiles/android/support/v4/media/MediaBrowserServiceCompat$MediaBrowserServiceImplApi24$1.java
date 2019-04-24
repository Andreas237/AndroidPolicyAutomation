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
		ArrayList arraylist = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(list != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          64
		{
			arraylist = new ArrayList();
	//    4    6:new             #41  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #43  <Method void ArrayList()>
	//    7   13:astore_2        
			Parcel parcel;
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (parcel))))
	//*   8   14:aload_1         
	//*   9   15:invokeinterface #47  <Method Iterator List.iterator()>
	//*  10   20:astore_1        
	//*  11   21:aload_1         
	//*  12   22:invokeinterface #53  <Method boolean Iterator.hasNext()>
	//*  13   27:ifeq            64
			{
				MediaBrowserCompat.MediaItem mediaitem = (MediaBrowserCompat.MediaItem)((Iterator) (list)).next();
	//   14   30:aload_1         
	//   15   31:invokeinterface #57  <Method Object Iterator.next()>
	//   16   36:checkcast       #59  <Class MediaBrowserCompat$MediaItem>
	//   17   39:astore_3        
				parcel = Parcel.obtain();
	//   18   40:invokestatic    #65  <Method Parcel Parcel.obtain()>
	//   19   43:astore          4
				mediaitem.writeToParcel(parcel, 0);
	//   20   45:aload_3         
	//   21   46:aload           4
	//   22   48:iconst_0        
	//   23   49:invokevirtual   #69  <Method void MediaBrowserCompat$MediaItem.writeToParcel(Parcel, int)>
			}

	//   24   52:aload_2         
	//   25   53:aload           4
	//   26   55:invokeinterface #73  <Method boolean List.add(Object)>
	//   27   60:pop             
		}
	//*  28   61:goto            21
		val$resultWrapper.sendResult(((List) (arraylist)), getFlags());
	//   29   64:aload_0         
	//   30   65:getfield        #23  <Field MediaBrowserServiceCompatApi24$ResultWrapper val$resultWrapper>
	//   31   68:aload_2         
	//   32   69:aload_0         
	//   33   70:invokevirtual   #77  <Method int getFlags()>
	//   34   73:invokevirtual   #81  <Method void MediaBrowserServiceCompatApi24$ResultWrapper.sendResult(List, int)>
	//   35   76:return          
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
