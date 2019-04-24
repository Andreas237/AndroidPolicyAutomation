// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Parcel;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat, MediaBrowserServiceCompatApi23, MediaBrowserServiceCompatApi21

class MediaBrowserServiceCompat$MediaBrowserServiceImplApi23 extends MediaBrowserServiceCompat$MediaBrowserServiceImplApi21
	implements MediaBrowserServiceCompatApi23.ServiceCompatProxy
{

	public void onCreate()
	{
		mServiceObj = MediaBrowserServiceCompatApi23.createService(((android.content.Context) (MediaBrowserServiceCompat.this)), ((MediaBrowserServiceCompatApi23.ServiceCompatProxy) (this)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #17  <Field MediaBrowserServiceCompat this$0>
	//    3    5:aload_0         
	//    4    6:invokestatic    #28  <Method Object MediaBrowserServiceCompatApi23.createService(android.content.Context, MediaBrowserServiceCompatApi23$ServiceCompatProxy)>
	//    5    9:putfield        #32  <Field Object mServiceObj>
		MediaBrowserServiceCompatApi21.onCreate(mServiceObj);
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field Object mServiceObj>
	//    8   16:invokestatic    #37  <Method void MediaBrowserServiceCompatApi21.onCreate(Object)>
	//    9   19:return          
	}

	public void onLoadItem(final String final_obj, MediaBrowserServiceCompatApi21.ResultWrapper resultwrapper)
	{
		resultwrapper = ((MediaBrowserServiceCompatApi21.ResultWrapper) (new MediaBrowserServiceCompat.Result(resultwrapper) {

			public void detach()
			{
				resultWrapper.detach();
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field MediaBrowserServiceCompatApi21$ResultWrapper val$resultWrapper>
			//    2    4:invokevirtual   #33  <Method void MediaBrowserServiceCompatApi21$ResultWrapper.detach()>
			//    3    7:return          
			}

			void onResultSent(MediaBrowserCompat.MediaItem mediaitem, int i)
			{
				if(mediaitem == null)
			//*   0    0:aload_1         
			//*   1    1:ifnonnull       13
				{
					resultWrapper.sendResult(((Object) (null)));
			//    2    4:aload_0         
			//    3    5:getfield        #23  <Field MediaBrowserServiceCompatApi21$ResultWrapper val$resultWrapper>
			//    4    8:aconst_null     
			//    5    9:invokevirtual   #38  <Method void MediaBrowserServiceCompatApi21$ResultWrapper.sendResult(Object)>
					return;
			//    6   12:return          
				} else
				{
					Parcel parcel = Parcel.obtain();
			//    7   13:invokestatic    #44  <Method Parcel Parcel.obtain()>
			//    8   16:astore_3        
					mediaitem.writeToParcel(parcel, 0);
			//    9   17:aload_1         
			//   10   18:aload_3         
			//   11   19:iconst_0        
			//   12   20:invokevirtual   #50  <Method void MediaBrowserCompat$MediaItem.writeToParcel(Parcel, int)>
					resultWrapper.sendResult(((Object) (parcel)));
			//   13   23:aload_0         
			//   14   24:getfield        #23  <Field MediaBrowserServiceCompatApi21$ResultWrapper val$resultWrapper>
			//   15   27:aload_3         
			//   16   28:invokevirtual   #38  <Method void MediaBrowserServiceCompatApi21$ResultWrapper.sendResult(Object)>
					return;
			//   17   31:return          
				}
			}

			volatile void onResultSent(Object obj, int i)
			{
				onResultSent((MediaBrowserCompat.MediaItem)obj, i);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #46  <Class MediaBrowserCompat$MediaItem>
			//    3    5:iload_2         
			//    4    6:invokevirtual   #53  <Method void onResultSent(MediaBrowserCompat$MediaItem, int)>
			//    5    9:return          
			}

			final MediaBrowserServiceCompat.MediaBrowserServiceImplApi23 this$1;
			final MediaBrowserServiceCompatApi21.ResultWrapper val$resultWrapper;

			
			{
				this$1 = MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi23 this$1>
				resultWrapper = resultwrapper;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #23  <Field MediaBrowserServiceCompatApi21$ResultWrapper val$resultWrapper>
				super(final_obj);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #26  <Method void MediaBrowserServiceCompat$Result(Object)>
			//    9   15:return          
			}
		}
));
	//    0    0:new             #11  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #42  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$1(MediaBrowserServiceCompat$MediaBrowserServiceImplApi23, Object, MediaBrowserServiceCompatApi21$ResultWrapper)>
	//    6   10:astore_2        
		MediaBrowserServiceCompat.this.onLoadItem(final_obj, ((MediaBrowserServiceCompat.Result) (resultwrapper)));
	//    7   11:aload_0         
	//    8   12:getfield        #17  <Field MediaBrowserServiceCompat this$0>
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #45  <Method void MediaBrowserServiceCompat.onLoadItem(String, MediaBrowserServiceCompat$Result)>
	//   12   20:return          
	}

	final MediaBrowserServiceCompat this$0;

	MediaBrowserServiceCompat$MediaBrowserServiceImplApi23()
	{
		this$0 = MediaBrowserServiceCompat.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MediaBrowserServiceCompat this$0>
		super(MediaBrowserServiceCompat.this);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #19  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21(MediaBrowserServiceCompat)>
	//    6   10:return          
	}
}
