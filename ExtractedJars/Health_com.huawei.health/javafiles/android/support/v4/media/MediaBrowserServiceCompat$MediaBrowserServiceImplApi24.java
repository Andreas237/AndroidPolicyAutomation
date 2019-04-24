// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import java.util.*;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat, MediaBrowserServiceCompatApi24, MediaBrowserServiceCompatApi21

class MediaBrowserServiceCompat$MediaBrowserServiceImplApi24 extends MediaBrowserServiceCompat$MediaBrowserServiceImplApi23
	implements MediaBrowserServiceCompatApi24.ServiceCompatProxy
{

	public Bundle getBrowserRootHints()
	{
		if(mCurConnection != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field MediaBrowserServiceCompat this$0>
	//*   2    4:getfield        #26  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
	//*   3    7:ifnull          43
		{
			if(mCurConnection.rootHints == null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #17  <Field MediaBrowserServiceCompat this$0>
	//*   6   14:getfield        #26  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
	//*   7   17:getfield        #32  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
	//*   8   20:ifnonnull       25
				return null;
	//    9   23:aconst_null     
	//   10   24:areturn         
			else
				return new Bundle(mCurConnection.rootHints);
	//   11   25:new             #34  <Class Bundle>
	//   12   28:dup             
	//   13   29:aload_0         
	//   14   30:getfield        #17  <Field MediaBrowserServiceCompat this$0>
	//   15   33:getfield        #26  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
	//   16   36:getfield        #32  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
	//   17   39:invokespecial   #37  <Method void Bundle(Bundle)>
	//   18   42:areturn         
		} else
		{
			return MediaBrowserServiceCompatApi24.getBrowserRootHints(mServiceObj);
	//   19   43:aload_0         
	//   20   44:getfield        #41  <Field Object mServiceObj>
	//   21   47:invokestatic    #46  <Method Bundle MediaBrowserServiceCompatApi24.getBrowserRootHints(Object)>
	//   22   50:areturn         
		}
	}

	public void notifyChildrenChanged(String s, Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       13
		{
			MediaBrowserServiceCompatApi21.notifyChildrenChanged(mServiceObj, s);
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field Object mServiceObj>
	//    4    8:aload_1         
	//    5    9:invokestatic    #53  <Method void MediaBrowserServiceCompatApi21.notifyChildrenChanged(Object, String)>
			return;
	//    6   12:return          
		} else
		{
			MediaBrowserServiceCompatApi24.notifyChildrenChanged(mServiceObj, s, bundle);
	//    7   13:aload_0         
	//    8   14:getfield        #41  <Field Object mServiceObj>
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokestatic    #56  <Method void MediaBrowserServiceCompatApi24.notifyChildrenChanged(Object, String, Bundle)>
			return;
	//   12   22:return          
		}
	}

	public void onCreate()
	{
		mServiceObj = MediaBrowserServiceCompatApi24.createService(((android.content.Context) (MediaBrowserServiceCompat.this)), ((MediaBrowserServiceCompatApi24.ServiceCompatProxy) (this)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #17  <Field MediaBrowserServiceCompat this$0>
	//    3    5:aload_0         
	//    4    6:invokestatic    #62  <Method Object MediaBrowserServiceCompatApi24.createService(android.content.Context, MediaBrowserServiceCompatApi24$ServiceCompatProxy)>
	//    5    9:putfield        #41  <Field Object mServiceObj>
		MediaBrowserServiceCompatApi21.onCreate(mServiceObj);
	//    6   12:aload_0         
	//    7   13:getfield        #41  <Field Object mServiceObj>
	//    8   16:invokestatic    #65  <Method void MediaBrowserServiceCompatApi21.onCreate(Object)>
	//    9   19:return          
	}

	public void onLoadChildren(final String final_obj, MediaBrowserServiceCompatApi24.ResultWrapper resultwrapper, Bundle bundle)
	{
		resultwrapper = ((MediaBrowserServiceCompatApi24.ResultWrapper) (new MediaBrowserServiceCompat.Result(resultwrapper) {

			public void detach()
			{
				resultWrapper.detach();
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field MediaBrowserServiceCompatApi24$ResultWrapper val$resultWrapper>
			//    2    4:invokevirtual   #33  <Method void MediaBrowserServiceCompatApi24$ResultWrapper.detach()>
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
				resultWrapper.sendResult(((List) (obj)), i);
			//   31   69:aload_0         
			//   32   70:getfield        #23  <Field MediaBrowserServiceCompatApi24$ResultWrapper val$resultWrapper>
			//   33   73:aload_3         
			//   34   74:iload_2         
			//   35   75:invokevirtual   #77  <Method void MediaBrowserServiceCompatApi24$ResultWrapper.sendResult(List, int)>
			//   36   78:return          
			}

			final MediaBrowserServiceCompat.MediaBrowserServiceImplApi24 this$1;
			final MediaBrowserServiceCompatApi24.ResultWrapper val$resultWrapper;

			
			{
				this$1 = MediaBrowserServiceCompat.MediaBrowserServiceImplApi24.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi24 this$1>
				resultWrapper = resultwrapper;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #23  <Field MediaBrowserServiceCompatApi24$ResultWrapper val$resultWrapper>
				super(final_obj);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #26  <Method void MediaBrowserServiceCompat$Result(Object)>
			//    9   15:return          
			}
		}
));
	//    0    0:new             #11  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi24$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #70  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi24$1(MediaBrowserServiceCompat$MediaBrowserServiceImplApi24, Object, MediaBrowserServiceCompatApi24$ResultWrapper)>
	//    6   10:astore_2        
		MediaBrowserServiceCompat.this.onLoadChildren(final_obj, ((MediaBrowserServiceCompat.Result) (resultwrapper)), bundle);
	//    7   11:aload_0         
	//    8   12:getfield        #17  <Field MediaBrowserServiceCompat this$0>
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:aload_3         
	//   12   18:invokevirtual   #73  <Method void MediaBrowserServiceCompat.onLoadChildren(String, MediaBrowserServiceCompat$Result, Bundle)>
	//   13   21:return          
	}

	final MediaBrowserServiceCompat this$0;

	MediaBrowserServiceCompat$MediaBrowserServiceImplApi24()
	{
		this$0 = MediaBrowserServiceCompat.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MediaBrowserServiceCompat this$0>
		super(MediaBrowserServiceCompat.this);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #19  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi23(MediaBrowserServiceCompat)>
	//    6   10:return          
	}
}
