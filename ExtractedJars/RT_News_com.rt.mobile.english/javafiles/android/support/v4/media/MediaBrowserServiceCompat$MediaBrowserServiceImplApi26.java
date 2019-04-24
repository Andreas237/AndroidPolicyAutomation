// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import java.util.*;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat, MediaBrowserServiceCompatApi26, MediaBrowserServiceCompatApi21

class MediaBrowserServiceCompat$MediaBrowserServiceImplApi26 extends MediaBrowserServiceCompat$MediaBrowserServiceImplApi23
	implements MediaBrowserServiceCompatApi26.ServiceCompatProxy
{

	public Bundle getBrowserRootHints()
	{
		if(mCurConnection != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field MediaBrowserServiceCompat this$0>
	//*   2    4:getfield        #29  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
	//*   3    7:ifnull          43
		{
			if(mCurConnection.rootHints == null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #20  <Field MediaBrowserServiceCompat this$0>
	//*   6   14:getfield        #29  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
	//*   7   17:getfield        #35  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
	//*   8   20:ifnonnull       25
				return null;
	//    9   23:aconst_null     
	//   10   24:areturn         
			else
				return new Bundle(mCurConnection.rootHints);
	//   11   25:new             #37  <Class Bundle>
	//   12   28:dup             
	//   13   29:aload_0         
	//   14   30:getfield        #20  <Field MediaBrowserServiceCompat this$0>
	//   15   33:getfield        #29  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
	//   16   36:getfield        #35  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
	//   17   39:invokespecial   #40  <Method void Bundle(Bundle)>
	//   18   42:areturn         
		} else
		{
			return MediaBrowserServiceCompatApi26.getBrowserRootHints(mServiceObj);
	//   19   43:aload_0         
	//   20   44:getfield        #44  <Field Object mServiceObj>
	//   21   47:invokestatic    #49  <Method Bundle MediaBrowserServiceCompatApi26.getBrowserRootHints(Object)>
	//   22   50:areturn         
		}
	}

	void notifyChildrenChangedForFramework(String s, Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          14
		{
			MediaBrowserServiceCompatApi26.notifyChildrenChanged(mServiceObj, s, bundle);
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field Object mServiceObj>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #55  <Method void MediaBrowserServiceCompatApi26.notifyChildrenChanged(Object, String, Bundle)>
			return;
	//    7   13:return          
		} else
		{
			super.notifyChildrenChangedForFramework(s, bundle);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #57  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi23.notifyChildrenChangedForFramework(String, Bundle)>
			return;
	//   12   20:return          
		}
	}

	public void onCreate()
	{
		mServiceObj = MediaBrowserServiceCompatApi26.createService(((android.content.Context) (MediaBrowserServiceCompat.this)), ((MediaBrowserServiceCompatApi26.ServiceCompatProxy) (this)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field MediaBrowserServiceCompat this$0>
	//    3    5:aload_0         
	//    4    6:invokestatic    #63  <Method Object MediaBrowserServiceCompatApi26.createService(android.content.Context, MediaBrowserServiceCompatApi26$ServiceCompatProxy)>
	//    5    9:putfield        #44  <Field Object mServiceObj>
		MediaBrowserServiceCompatApi21.onCreate(mServiceObj);
	//    6   12:aload_0         
	//    7   13:getfield        #44  <Field Object mServiceObj>
	//    8   16:invokestatic    #68  <Method void MediaBrowserServiceCompatApi21.onCreate(Object)>
	//    9   19:return          
	}

	public void onLoadChildren(final String final_obj, MediaBrowserServiceCompatApi26.ResultWrapper resultwrapper, Bundle bundle)
	{
		resultwrapper = ((MediaBrowserServiceCompatApi26.ResultWrapper) (new MediaBrowserServiceCompat.Result(resultwrapper) {

			public void detach()
			{
				resultWrapper.detach();
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
				resultWrapper.sendResult(list, getFlags());
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

			
			{
				this$1 = MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi26 this$1>
				resultWrapper = resultwrapper;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #23  <Field MediaBrowserServiceCompatApi26$ResultWrapper val$resultWrapper>
				super(final_obj);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #26  <Method void MediaBrowserServiceCompat$Result(Object)>
			//    9   15:return          
			}
		}
));
	//    0    0:new             #11  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #73  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$1(MediaBrowserServiceCompat$MediaBrowserServiceImplApi26, Object, MediaBrowserServiceCompatApi26$ResultWrapper)>
	//    6   10:astore_2        
		MediaBrowserServiceCompat.this.onLoadChildren(final_obj, ((MediaBrowserServiceCompat.Result) (resultwrapper)), bundle);
	//    7   11:aload_0         
	//    8   12:getfield        #20  <Field MediaBrowserServiceCompat this$0>
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:aload_3         
	//   12   18:invokevirtual   #76  <Method void MediaBrowserServiceCompat.onLoadChildren(String, MediaBrowserServiceCompat$Result, Bundle)>
	//   13   21:return          
	}

	final MediaBrowserServiceCompat this$0;

	MediaBrowserServiceCompat$MediaBrowserServiceImplApi26()
	{
		this$0 = MediaBrowserServiceCompat.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field MediaBrowserServiceCompat this$0>
		super(MediaBrowserServiceCompat.this);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #22  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi23(MediaBrowserServiceCompat)>
	//    6   10:return          
	}
}
