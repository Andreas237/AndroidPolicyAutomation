// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.support.v4.media.cw;
import android.support.v4.media.session.MediaSessionCompat;

final class MediaRouter$GlobalMediaRouter$MediaSessionRecord
{

	public void clearVolumeHandling()
	{
		MediaSessionCompat mediasessioncompat = mMsCompat;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MediaSessionCompat mMsCompat>
	//    2    4:astore_1        
		if(mediasessioncompat != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          28
		{
			mediasessioncompat.b(mPlaybackInfo.playbackStream);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field MediaRouter$GlobalMediaRouter this$0>
	//    8   14:getfield        #43  <Field RemoteControlClientCompat$PlaybackInfo MediaRouter$GlobalMediaRouter.mPlaybackInfo>
	//    9   17:getfield        #48  <Field int RemoteControlClientCompat$PlaybackInfo.playbackStream>
	//   10   20:invokevirtual   #52  <Method void MediaSessionCompat.b(int)>
			mVpCompat = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #54  <Field cw mVpCompat>
		}
	//   14   28:return          
	}

	public void configureVolume(int i, int j, int k)
	{
		if(mMsCompat != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field MediaSessionCompat mMsCompat>
	//*   2    4:ifnull          67
		{
			cw cw1 = mVpCompat;
	//    3    7:aload_0         
	//    4    8:getfield        #54  <Field cw mVpCompat>
	//    5   11:astore          4
			if(cw1 != null && i == mControlType && j == mMaxVolume)
	//*   6   13:aload           4
	//*   7   15:ifnull          41
	//*   8   18:iload_1         
	//*   9   19:aload_0         
	//*  10   20:getfield        #58  <Field int mControlType>
	//*  11   23:icmpne          41
	//*  12   26:iload_2         
	//*  13   27:aload_0         
	//*  14   28:getfield        #60  <Field int mMaxVolume>
	//*  15   31:icmpne          41
			{
				cw1.setCurrentVolume(k);
	//   16   34:aload           4
	//   17   36:iload_3         
	//   18   37:invokevirtual   #65  <Method void cw.setCurrentVolume(int)>
				return;
	//   19   40:return          
			}
			class _cls1 extends cw
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

						final _cls1 this$2;
						final int val$direction;

							_cls2()
							{
								this$2 = _cls1.this;
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

						final _cls1 this$2;
						final int val$volume;

							_cls1()
							{
								this$2 = _cls1.this;
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

			_cls1(int i, int j, int k)
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

			mVpCompat = ((cw) (new _cls1(i, j, k)));
	//   20   41:aload_0         
	//   21   42:new             #67  <Class MediaRouter$GlobalMediaRouter$MediaSessionRecord$1>
	//   22   45:dup             
	//   23   46:aload_0         
	//   24   47:iload_1         
	//   25   48:iload_2         
	//   26   49:iload_3         
	//   27   50:invokespecial   #70  <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord$1(MediaRouter$GlobalMediaRouter$MediaSessionRecord, int, int, int)>
	//   28   53:putfield        #54  <Field cw mVpCompat>
			mMsCompat.a(mVpCompat);
	//   29   56:aload_0         
	//   30   57:getfield        #22  <Field MediaSessionCompat mMsCompat>
	//   31   60:aload_0         
	//   32   61:getfield        #54  <Field cw mVpCompat>
	//   33   64:invokevirtual   #73  <Method void MediaSessionCompat.a(cw)>
		}
	//   34   67:return          
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getToken()
	{
		MediaSessionCompat mediasessioncompat = mMsCompat;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MediaSessionCompat mMsCompat>
	//    2    4:astore_1        
		if(mediasessioncompat != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return mediasessioncompat.c();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #78  <Method android.support.v4.media.session.MediaSessionCompat$Token MediaSessionCompat.c()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	private int mControlType;
	private int mMaxVolume;
	private final MediaSessionCompat mMsCompat;
	private cw mVpCompat;
	final MediaRouter.GlobalMediaRouter this$0;

	MediaRouter$GlobalMediaRouter$MediaSessionRecord(MediaSessionCompat mediasessioncompat)
	{
		this$0 = MediaRouter.GlobalMediaRouter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MediaRouter$GlobalMediaRouter this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		mMsCompat = mediasessioncompat;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field MediaSessionCompat mMsCompat>
	//    8   14:return          
	}

	MediaRouter$GlobalMediaRouter$MediaSessionRecord(Object obj)
	{
		this(MediaSessionCompat.a(mApplicationContext, obj));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:getfield        #30  <Field android.content.Context MediaRouter$GlobalMediaRouter.mApplicationContext>
	//    4    6:aload_2         
	//    5    7:invokestatic    #36  <Method MediaSessionCompat MediaSessionCompat.a(android.content.Context, Object)>
	//    6   10:invokespecial   #38  <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord(MediaRouter$GlobalMediaRouter, MediaSessionCompat)>
	//    7   13:return          
	}
}
