// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.support.v4.media.VolumeProviderCompat;

// Referenced classes of package android.support.v7.media:
//			MediaRouter

class MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 extends VolumeProviderCompat
{

	public void onAdjustVolume(final int direction)
	{
		mCallbackHandler.post(new Runnable() {

			public void run()
			{
				if(mSelectedRoute != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
			//*   2    4:getfield        #38  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord MediaRouter$GlobalMediaRouter$MediaSessionRecord$1.this$1>
			//*   3    7:getfield        #42  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
			//*   4   10:getfield        #46  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
			//*   5   13:ifnull          36
					mSelectedRoute.requestUpdateVolume(direction);
			//    6   16:aload_0         
			//    7   17:getfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
			//    8   20:getfield        #38  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord MediaRouter$GlobalMediaRouter$MediaSessionRecord$1.this$1>
			//    9   23:getfield        #42  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
			//   10   26:getfield        #46  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
			//   11   29:aload_0         
			//   12   30:getfield        #29  <Field int val$direction>
			//   13   33:invokevirtual   #51  <Method void MediaRouter$RouteInfo.requestUpdateVolume(int)>
			//   14   36:return          
			}

			final MediaRouter.GlobalMediaRouter.MediaSessionRecord._cls1 this$2;
			final int val$direction;

			
			{
				this$2 = MediaRouter.GlobalMediaRouter.MediaSessionRecord._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
				direction = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #29  <Field int val$direction>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #32  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord this$1>
	//    2    4:getfield        #34  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
	//    3    7:getfield        #38  <Field MediaRouter$GlobalMediaRouter$CallbackHandler MediaRouter$GlobalMediaRouter.mCallbackHandler>
	//    4   10:new             #19  <Class MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$2>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:iload_1         
	//    8   16:invokespecial   #41  <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$2(MediaRouter$GlobalMediaRouter$MediaSessionRecord$1, int)>
	//    9   19:invokevirtual   #47  <Method boolean MediaRouter$GlobalMediaRouter$CallbackHandler.post(Runnable)>
	//   10   22:pop             
	//   11   23:return          
	}

	public void onSetVolumeTo(final int volume)
	{
		mCallbackHandler.post(new Runnable() {

			public void run()
			{
				if(mSelectedRoute != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
			//*   2    4:getfield        #38  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord MediaRouter$GlobalMediaRouter$MediaSessionRecord$1.this$1>
			//*   3    7:getfield        #42  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
			//*   4   10:getfield        #46  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
			//*   5   13:ifnull          36
					mSelectedRoute.requestSetVolume(volume);
			//    6   16:aload_0         
			//    7   17:getfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
			//    8   20:getfield        #38  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord MediaRouter$GlobalMediaRouter$MediaSessionRecord$1.this$1>
			//    9   23:getfield        #42  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
			//   10   26:getfield        #46  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
			//   11   29:aload_0         
			//   12   30:getfield        #29  <Field int val$volume>
			//   13   33:invokevirtual   #51  <Method void MediaRouter$RouteInfo.requestSetVolume(int)>
			//   14   36:return          
			}

			final MediaRouter.GlobalMediaRouter.MediaSessionRecord._cls1 this$2;
			final int val$volume;

			
			{
				this$2 = MediaRouter.GlobalMediaRouter.MediaSessionRecord._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
				volume = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #29  <Field int val$volume>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #32  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord this$1>
	//    2    4:getfield        #34  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
	//    3    7:getfield        #38  <Field MediaRouter$GlobalMediaRouter$CallbackHandler MediaRouter$GlobalMediaRouter.mCallbackHandler>
	//    4   10:new             #17  <Class MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$1>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:iload_1         
	//    8   16:invokespecial   #49  <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$1(MediaRouter$GlobalMediaRouter$MediaSessionRecord$1, int)>
	//    9   19:invokevirtual   #47  <Method boolean MediaRouter$GlobalMediaRouter$CallbackHandler.post(Runnable)>
	//   10   22:pop             
	//   11   23:return          
	}

	final MediaRouter.GlobalMediaRouter.MediaSessionRecord this$1;

	MediaRouter$GlobalMediaRouter$MediaSessionRecord$1(int i, int j, int k)
	{
		this$1 = MediaRouter.GlobalMediaRouter.MediaSessionRecord.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord this$1>
		super(i, j, k);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:invokespecial   #27  <Method void VolumeProviderCompat(int, int, int)>
	//    8   13:return          
	}
}
