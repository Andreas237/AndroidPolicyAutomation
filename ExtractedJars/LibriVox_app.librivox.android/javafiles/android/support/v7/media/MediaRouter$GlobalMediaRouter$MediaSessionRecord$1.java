// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.support.v4.media.cw;

class MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 extends cw
{

	public void onAdjustVolume(final int direction)
	{
		class _cls2
			implements Runnable
		{

			public void run()
			{
				if(mSelectedRoute != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #14  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
			//*   2    4:getfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord MediaRouter$GlobalMediaRouter$MediaSessionRecord$1.this$1>
			//*   3    7:getfield        #33  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
			//*   4   10:getfield        #39  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
			//*   5   13:ifnull          36
					mSelectedRoute.requestUpdateVolume(direction);
			//    6   16:aload_0         
			//    7   17:getfield        #14  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
			//    8   20:getfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord MediaRouter$GlobalMediaRouter$MediaSessionRecord$1.this$1>
			//    9   23:getfield        #33  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
			//   10   26:getfield        #39  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
			//   11   29:aload_0         
			//   12   30:getfield        #16  <Field int val$direction>
			//   13   33:invokevirtual   #45  <Method void MediaRouter$RouteInfo.requestUpdateVolume(int)>
			//   14   36:return          
			}

			final MediaRouter.GlobalMediaRouter.MediaSessionRecord._cls1 this$2;
			final int val$direction;

			_cls2()
			{
				this$2 = MediaRouter.GlobalMediaRouter.MediaSessionRecord._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
				direction = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #16  <Field int val$direction>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #19  <Method void Object()>
			//    8   14:return          
			}
		}

		mCallbackHandler.post(((Runnable) (new _cls2())));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord this$1>
	//    2    4:getfield        #22  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
	//    3    7:getfield        #28  <Field MediaRouter$GlobalMediaRouter$CallbackHandler MediaRouter$GlobalMediaRouter.mCallbackHandler>
	//    4   10:new             #30  <Class MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$2>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:iload_1         
	//    8   16:invokespecial   #33  <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$2(MediaRouter$GlobalMediaRouter$MediaSessionRecord$1, int)>
	//    9   19:invokevirtual   #39  <Method boolean MediaRouter$GlobalMediaRouter$CallbackHandler.post(Runnable)>
	//   10   22:pop             
	//   11   23:return          
	}

	public void onSetVolumeTo(final int volume)
	{
		class _cls1
			implements Runnable
		{

			public void run()
			{
				if(mSelectedRoute != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #14  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
			//*   2    4:getfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord MediaRouter$GlobalMediaRouter$MediaSessionRecord$1.this$1>
			//*   3    7:getfield        #33  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
			//*   4   10:getfield        #39  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
			//*   5   13:ifnull          36
					mSelectedRoute.requestSetVolume(volume);
			//    6   16:aload_0         
			//    7   17:getfield        #14  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
			//    8   20:getfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord MediaRouter$GlobalMediaRouter$MediaSessionRecord$1.this$1>
			//    9   23:getfield        #33  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
			//   10   26:getfield        #39  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
			//   11   29:aload_0         
			//   12   30:getfield        #16  <Field int val$volume>
			//   13   33:invokevirtual   #45  <Method void MediaRouter$RouteInfo.requestSetVolume(int)>
			//   14   36:return          
			}

			final MediaRouter.GlobalMediaRouter.MediaSessionRecord._cls1 this$2;
			final int val$volume;

			_cls1()
			{
				this$2 = MediaRouter.GlobalMediaRouter.MediaSessionRecord._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
				volume = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #16  <Field int val$volume>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #19  <Method void Object()>
			//    8   14:return          
			}
		}

		mCallbackHandler.post(((Runnable) (new _cls1())));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord this$1>
	//    2    4:getfield        #22  <Field MediaRouter$GlobalMediaRouter MediaRouter$GlobalMediaRouter$MediaSessionRecord.this$0>
	//    3    7:getfield        #28  <Field MediaRouter$GlobalMediaRouter$CallbackHandler MediaRouter$GlobalMediaRouter.mCallbackHandler>
	//    4   10:new             #42  <Class MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$1>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:iload_1         
	//    8   16:invokespecial   #43  <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord$1$1(MediaRouter$GlobalMediaRouter$MediaSessionRecord$1, int)>
	//    9   19:invokevirtual   #39  <Method boolean MediaRouter$GlobalMediaRouter$CallbackHandler.post(Runnable)>
	//   10   22:pop             
	//   11   23:return          
	}

	final MediaRouter.GlobalMediaRouter.MediaSessionRecord this$1;

	MediaRouter$GlobalMediaRouter$MediaSessionRecord$1(int i, int j, int k)
	{
		this$1 = MediaRouter.GlobalMediaRouter.MediaSessionRecord.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord this$1>
		super(i, j, k);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:invokespecial   #13  <Method void cw(int, int, int)>
	//    8   13:return          
	}
}
