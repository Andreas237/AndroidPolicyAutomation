// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.support.v4.media.VolumeProviderCompat;
import android.support.v4.media.session.MediaSessionCompat;

// Referenced classes of package android.support.v7.media:
//			MediaRouter

private final class MediaRouter$GlobalMediaRouter$MediaSessionRecord
{

	public void clearVolumeHandling()
	{
		mMsCompat.setPlaybackToLocal(mPlaybackInfo.playbackStream);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field MediaSessionCompat mMsCompat>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field MediaRouter$GlobalMediaRouter this$0>
	//    4    8:getfield        #51  <Field RemoteControlClientCompat$PlaybackInfo MediaRouter$GlobalMediaRouter.mPlaybackInfo>
	//    5   11:getfield        #56  <Field int RemoteControlClientCompat$PlaybackInfo.playbackStream>
	//    6   14:invokevirtual   #60  <Method void MediaSessionCompat.setPlaybackToLocal(int)>
		mVpCompat = null;
	//    7   17:aload_0         
	//    8   18:aconst_null     
	//    9   19:putfield        #62  <Field VolumeProviderCompat mVpCompat>
	//   10   22:return          
	}

	public void configureVolume(int i, int j, int k)
	{
		if(mVpCompat != null && i == mControlType && j == mMaxVolume)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field VolumeProviderCompat mVpCompat>
	//*   2    4:ifnull          32
	//*   3    7:iload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #66  <Field int mControlType>
	//*   6   12:icmpne          32
	//*   7   15:iload_2         
	//*   8   16:aload_0         
	//*   9   17:getfield        #68  <Field int mMaxVolume>
	//*  10   20:icmpne          32
		{
			mVpCompat.setCurrentVolume(k);
	//   11   23:aload_0         
	//   12   24:getfield        #62  <Field VolumeProviderCompat mVpCompat>
	//   13   27:iload_3         
	//   14   28:invokevirtual   #73  <Method void VolumeProviderCompat.setCurrentVolume(int)>
			return;
	//   15   31:return          
		} else
		{
			mVpCompat = ((VolumeProviderCompat) (new VolumeProviderCompat(i, j, k) {

				public void onAdjustVolume(int l)
				{
					mCallbackHandler.post(((_cls2) (l)). new Runnable() {

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

						final _cls1 this$2;
						final int val$direction;

			
			{
				this$2 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
				direction = I.this;
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

				public void onSetVolumeTo(int l)
				{
					mCallbackHandler.post(((_cls1) (l)). new Runnable() {

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

						final _cls1 this$2;
						final int val$volume;

			
			{
				this$2 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field MediaRouter$GlobalMediaRouter$MediaSessionRecord$1 this$2>
				volume = I.this;
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
));
	//   16   32:aload_0         
	//   17   33:new             #12  <Class MediaRouter$GlobalMediaRouter$MediaSessionRecord$1>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:iload_1         
	//   21   39:iload_2         
	//   22   40:iload_3         
	//   23   41:invokespecial   #76  <Method void MediaRouter$GlobalMediaRouter$MediaSessionRecord$1(MediaRouter$GlobalMediaRouter$MediaSessionRecord, int, int, int)>
	//   24   44:putfield        #62  <Field VolumeProviderCompat mVpCompat>
			mMsCompat.setPlaybackToRemote(mVpCompat);
	//   25   47:aload_0         
	//   26   48:getfield        #34  <Field MediaSessionCompat mMsCompat>
	//   27   51:aload_0         
	//   28   52:getfield        #62  <Field VolumeProviderCompat mVpCompat>
	//   29   55:invokevirtual   #80  <Method void MediaSessionCompat.setPlaybackToRemote(VolumeProviderCompat)>
			return;
	//   30   58:return          
		}
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getToken()
	{
		return mMsCompat.getSessionToken();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field MediaSessionCompat mMsCompat>
	//    2    4:invokevirtual   #85  <Method android.support.v4.media.session.MediaSessionCompat$Token MediaSessionCompat.getSessionToken()>
	//    3    7:areturn         
	}

	private int mControlType;
	private int mMaxVolume;
	private final MediaSessionCompat mMsCompat;
	private VolumeProviderCompat mVpCompat;
	final MediaRouter.GlobalMediaRouter this$0;

	public MediaRouter$GlobalMediaRouter$MediaSessionRecord(MediaSessionCompat mediasessioncompat)
	{
		this$0 = MediaRouter.GlobalMediaRouter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field MediaRouter$GlobalMediaRouter this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #32  <Method void Object()>
		mMsCompat = mediasessioncompat;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #34  <Field MediaSessionCompat mMsCompat>
	//    8   14:return          
	}

	public MediaRouter$GlobalMediaRouter$MediaSessionRecord(Object obj)
	{
		this$0 = MediaRouter.GlobalMediaRouter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field MediaRouter$GlobalMediaRouter this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #32  <Method void Object()>
		mMsCompat = MediaSessionCompat.fromMediaSession(mApplicationContext, obj);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #40  <Field android.content.Context MediaRouter$GlobalMediaRouter.mApplicationContext>
	//    8   14:aload_2         
	//    9   15:invokestatic    #46  <Method MediaSessionCompat MediaSessionCompat.fromMediaSession(android.content.Context, Object)>
	//   10   18:putfield        #34  <Field MediaSessionCompat mMsCompat>
	//   11   21:return          
	}
}
