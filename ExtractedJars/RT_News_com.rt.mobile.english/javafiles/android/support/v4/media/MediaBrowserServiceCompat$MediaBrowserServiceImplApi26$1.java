// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Parcel;
import java.util.*;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$1 extends MediaBrowserServiceCompat.Result
{

	public void detach()
	{
		val$resultWrapper.detach();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MediaBrowserServiceCompatApi26$ResultWrapper val$resultWrapper>
	//    2    4:invokevirtual   #33  <Method void MediaBrowserServiceCompatApi26$ResultWrapper.detach()>
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
		if(list != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          64
		{
			ArrayList arraylist = new ArrayList();
	//    2    4:new             #41  <Class ArrayList>
	//    3    7:dup             
	//    4    8:invokespecial   #43  <Method void ArrayList()>
	//    5   11:astore_2        
			Iterator iterator = list.iterator();
	//    6   12:aload_1         
	//    7   13:invokeinterface #47  <Method Iterator List.iterator()>
	//    8   18:astore_3        
			do
			{
				list = ((List) (arraylist));
	//    9   19:aload_2         
	//   10   20:astore_1        
				if(!iterator.hasNext())
					break;
	//   11   21:aload_3         
	//   12   22:invokeinterface #53  <Method boolean Iterator.hasNext()>
	//   13   27:ifeq            66
				list = ((List) ((MediaBrowserCompat.MediaItem)iterator.next()));
	//   14   30:aload_3         
	//   15   31:invokeinterface #57  <Method Object Iterator.next()>
	//   16   36:checkcast       #59  <Class MediaBrowserCompat$MediaItem>
	//   17   39:astore_1        
				Parcel parcel = Parcel.obtain();
	//   18   40:invokestatic    #65  <Method Parcel Parcel.obtain()>
	//   19   43:astore          4
				((MediaBrowserCompat.MediaItem) (list)).writeToParcel(parcel, 0);
	//   20   45:aload_1         
	//   21   46:aload           4
	//   22   48:iconst_0        
	//   23   49:invokevirtual   #69  <Method void MediaBrowserCompat$MediaItem.writeToParcel(Parcel, int)>
				((List) (arraylist)).add(((Object) (parcel)));
	//   24   52:aload_2         
	//   25   53:aload           4
	//   26   55:invokeinterface #73  <Method boolean List.add(Object)>
	//   27   60:pop             
			} while(true);
	//   28   61:goto            19
		} else
		{
			list = null;
	//   29   64:aconst_null     
	//   30   65:astore_1        
		}
		val$resultWrapper.sendResult(list, getFlags());
	//   31   66:aload_0         
	//   32   67:getfield        #23  <Field MediaBrowserServiceCompatApi26$ResultWrapper val$resultWrapper>
	//   33   70:aload_1         
	//   34   71:aload_0         
	//   35   72:invokevirtual   #77  <Method int getFlags()>
	//   36   75:invokevirtual   #81  <Method void MediaBrowserServiceCompatApi26$ResultWrapper.sendResult(List, int)>
	//   37   78:return          
	}

	final MediaBrowserServiceCompat.MediaBrowserServiceImplApi26 this$1;
	final MediaBrowserServiceCompatApi26.ResultWrapper val$resultWrapper;

	MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$1(MediaBrowserServiceCompatApi26.ResultWrapper resultwrapper)
	{
		this$1 = final_mediabrowserserviceimplapi26;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi26 this$1>
		val$resultWrapper = resultwrapper;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #23  <Field MediaBrowserServiceCompatApi26$ResultWrapper val$resultWrapper>
		super(Object.this);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #26  <Method void MediaBrowserServiceCompat$Result(Object)>
	//    9   15:return          
	}
}
