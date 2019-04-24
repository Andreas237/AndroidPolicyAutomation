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
			return MediaBrowserServiceCompatApi24.getBrowserRootHints(mServiceObj);
	//   19   43:aload_0         
	//   20   44:getfield        #44  <Field Object mServiceObj>
	//   21   47:invokestatic    #49  <Method Bundle MediaBrowserServiceCompatApi24.getBrowserRootHints(Object)>
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
	//    3    5:getfield        #44  <Field Object mServiceObj>
	//    4    8:aload_1         
	//    5    9:invokestatic    #56  <Method void MediaBrowserServiceCompatApi21.notifyChildrenChanged(Object, String)>
			return;
	//    6   12:return          
		} else
		{
			MediaBrowserServiceCompatApi24.notifyChildrenChanged(mServiceObj, s, bundle);
	//    7   13:aload_0         
	//    8   14:getfield        #44  <Field Object mServiceObj>
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokestatic    #59  <Method void MediaBrowserServiceCompatApi24.notifyChildrenChanged(Object, String, Bundle)>
			return;
	//   12   22:return          
		}
	}

	public void onCreate()
	{
		mServiceObj = MediaBrowserServiceCompatApi24.createService(((android.content.Context) (MediaBrowserServiceCompat.this)), ((MediaBrowserServiceCompatApi24.ServiceCompatProxy) (this)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field MediaBrowserServiceCompat this$0>
	//    3    5:aload_0         
	//    4    6:invokestatic    #65  <Method Object MediaBrowserServiceCompatApi24.createService(android.content.Context, MediaBrowserServiceCompatApi24$ServiceCompatProxy)>
	//    5    9:putfield        #44  <Field Object mServiceObj>
		MediaBrowserServiceCompatApi21.onCreate(mServiceObj);
	//    6   12:aload_0         
	//    7   13:getfield        #44  <Field Object mServiceObj>
	//    8   16:invokestatic    #68  <Method void MediaBrowserServiceCompatApi21.onCreate(Object)>
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
				resultWrapper.sendResult(((List) (arraylist)), getFlags());
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
	//    5    7:invokespecial   #73  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi24$1(MediaBrowserServiceCompat$MediaBrowserServiceImplApi24, Object, MediaBrowserServiceCompatApi24$ResultWrapper)>
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

	MediaBrowserServiceCompat$MediaBrowserServiceImplApi24()
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
