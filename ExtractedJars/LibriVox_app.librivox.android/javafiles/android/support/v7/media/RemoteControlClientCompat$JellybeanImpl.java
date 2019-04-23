// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.Context;

// Referenced classes of package android.support.v7.media:
//			RemoteControlClientCompat, MediaRouterJellybean

class RemoteControlClientCompat$JellybeanImpl extends RemoteControlClientCompat
{

	public void setPlaybackInfo(RemoteControlClientCompat.PlaybackInfo playbackinfo)
	{
		MediaRouterJellybean.UserRouteInfo.setVolume(mUserRouteObj, playbackinfo.volume);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Object mUserRouteObj>
	//    2    4:aload_1         
	//    3    5:getfield        #45  <Field int RemoteControlClientCompat$PlaybackInfo.volume>
	//    4    8:invokestatic    #51  <Method void MediaRouterJellybean$UserRouteInfo.setVolume(Object, int)>
		MediaRouterJellybean.UserRouteInfo.setVolumeMax(mUserRouteObj, playbackinfo.volumeMax);
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field Object mUserRouteObj>
	//    7   15:aload_1         
	//    8   16:getfield        #54  <Field int RemoteControlClientCompat$PlaybackInfo.volumeMax>
	//    9   19:invokestatic    #57  <Method void MediaRouterJellybean$UserRouteInfo.setVolumeMax(Object, int)>
		MediaRouterJellybean.UserRouteInfo.setVolumeHandling(mUserRouteObj, playbackinfo.volumeHandling);
	//   10   22:aload_0         
	//   11   23:getfield        #36  <Field Object mUserRouteObj>
	//   12   26:aload_1         
	//   13   27:getfield        #60  <Field int RemoteControlClientCompat$PlaybackInfo.volumeHandling>
	//   14   30:invokestatic    #63  <Method void MediaRouterJellybean$UserRouteInfo.setVolumeHandling(Object, int)>
		MediaRouterJellybean.UserRouteInfo.setPlaybackStream(mUserRouteObj, playbackinfo.playbackStream);
	//   15   33:aload_0         
	//   16   34:getfield        #36  <Field Object mUserRouteObj>
	//   17   37:aload_1         
	//   18   38:getfield        #66  <Field int RemoteControlClientCompat$PlaybackInfo.playbackStream>
	//   19   41:invokestatic    #69  <Method void MediaRouterJellybean$UserRouteInfo.setPlaybackStream(Object, int)>
		MediaRouterJellybean.UserRouteInfo.setPlaybackType(mUserRouteObj, playbackinfo.playbackType);
	//   20   44:aload_0         
	//   21   45:getfield        #36  <Field Object mUserRouteObj>
	//   22   48:aload_1         
	//   23   49:getfield        #72  <Field int RemoteControlClientCompat$PlaybackInfo.playbackType>
	//   24   52:invokestatic    #75  <Method void MediaRouterJellybean$UserRouteInfo.setPlaybackType(Object, int)>
		if(!mRegistered)
	//*  25   55:aload_0         
	//*  26   56:getfield        #77  <Field boolean mRegistered>
	//*  27   59:ifne            96
		{
			mRegistered = true;
	//   28   62:aload_0         
	//   29   63:iconst_1        
	//   30   64:putfield        #77  <Field boolean mRegistered>
			class VolumeCallbackWrapper
				implements MediaRouterJellybean.VolumeCallback
			{

				public void onVolumeSetRequest(Object obj, int i)
				{
					obj = ((Object) ((RemoteControlClientCompat.JellybeanImpl)mImplWeak.get()));
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field WeakReference mImplWeak>
				//    2    4:invokevirtual   #27  <Method Object WeakReference.get()>
				//    3    7:checkcast       #29  <Class RemoteControlClientCompat$JellybeanImpl>
				//    4   10:astore_1        
					if(obj != null && ((RemoteControlClientCompat.JellybeanImpl) (obj)).mVolumeCallback != null)
				//*   5   11:aload_1         
				//*   6   12:ifnull          32
				//*   7   15:aload_1         
				//*   8   16:getfield        #33  <Field RemoteControlClientCompat$VolumeCallback RemoteControlClientCompat$JellybeanImpl.mVolumeCallback>
				//*   9   19:ifnull          32
						((RemoteControlClientCompat.JellybeanImpl) (obj)).mVolumeCallback.onVolumeSetRequest(i);
				//   10   22:aload_1         
				//   11   23:getfield        #33  <Field RemoteControlClientCompat$VolumeCallback RemoteControlClientCompat$JellybeanImpl.mVolumeCallback>
				//   12   26:iload_2         
				//   13   27:invokeinterface #38  <Method void RemoteControlClientCompat$VolumeCallback.onVolumeSetRequest(int)>
				//   14   32:return          
				}

				public void onVolumeUpdateRequest(Object obj, int i)
				{
					obj = ((Object) ((RemoteControlClientCompat.JellybeanImpl)mImplWeak.get()));
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field WeakReference mImplWeak>
				//    2    4:invokevirtual   #27  <Method Object WeakReference.get()>
				//    3    7:checkcast       #29  <Class RemoteControlClientCompat$JellybeanImpl>
				//    4   10:astore_1        
					if(obj != null && ((RemoteControlClientCompat.JellybeanImpl) (obj)).mVolumeCallback != null)
				//*   5   11:aload_1         
				//*   6   12:ifnull          32
				//*   7   15:aload_1         
				//*   8   16:getfield        #33  <Field RemoteControlClientCompat$VolumeCallback RemoteControlClientCompat$JellybeanImpl.mVolumeCallback>
				//*   9   19:ifnull          32
						((RemoteControlClientCompat.JellybeanImpl) (obj)).mVolumeCallback.onVolumeUpdateRequest(i);
				//   10   22:aload_1         
				//   11   23:getfield        #33  <Field RemoteControlClientCompat$VolumeCallback RemoteControlClientCompat$JellybeanImpl.mVolumeCallback>
				//   12   26:iload_2         
				//   13   27:invokeinterface #41  <Method void RemoteControlClientCompat$VolumeCallback.onVolumeUpdateRequest(int)>
				//   14   32:return          
				}

				private final WeakReference mImplWeak;

			public VolumeCallbackWrapper()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #13  <Method void Object()>
				mImplWeak = new WeakReference(((Object) (RemoteControlClientCompat.JellybeanImpl.this)));
			//    2    4:aload_0         
			//    3    5:new             #15  <Class WeakReference>
			//    4    8:dup             
			//    5    9:aload_1         
			//    6   10:invokespecial   #18  <Method void WeakReference(Object)>
			//    7   13:putfield        #20  <Field WeakReference mImplWeak>
			//    8   16:return          
			}
			}

			MediaRouterJellybean.UserRouteInfo.setVolumeCallback(mUserRouteObj, MediaRouterJellybean.createVolumeCallback(((MediaRouterJellybean.VolumeCallback) (new VolumeCallbackWrapper()))));
	//   31   67:aload_0         
	//   32   68:getfield        #36  <Field Object mUserRouteObj>
	//   33   71:new             #79  <Class RemoteControlClientCompat$JellybeanImpl$VolumeCallbackWrapper>
	//   34   74:dup             
	//   35   75:aload_0         
	//   36   76:invokespecial   #82  <Method void RemoteControlClientCompat$JellybeanImpl$VolumeCallbackWrapper(RemoteControlClientCompat$JellybeanImpl)>
	//   37   79:invokestatic    #86  <Method Object MediaRouterJellybean.createVolumeCallback(MediaRouterJellybean$VolumeCallback)>
	//   38   82:invokestatic    #90  <Method void MediaRouterJellybean$UserRouteInfo.setVolumeCallback(Object, Object)>
			MediaRouterJellybean.UserRouteInfo.setRemoteControlClient(mUserRouteObj, mRcc);
	//   39   85:aload_0         
	//   40   86:getfield        #36  <Field Object mUserRouteObj>
	//   41   89:aload_0         
	//   42   90:getfield        #93  <Field Object mRcc>
	//   43   93:invokestatic    #96  <Method void MediaRouterJellybean$UserRouteInfo.setRemoteControlClient(Object, Object)>
		}
	//   44   96:return          
	}

	private boolean mRegistered;
	private final Object mRouterObj;
	private final Object mUserRouteCategoryObj;
	private final Object mUserRouteObj;

	public RemoteControlClientCompat$JellybeanImpl(Context context, Object obj)
	{
		super(context, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #14  <Method void RemoteControlClientCompat(Context, Object)>
		mRouterObj = MediaRouterJellybean.getMediaRouter(context);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokestatic    #20  <Method Object MediaRouterJellybean.getMediaRouter(Context)>
	//    7   11:putfield        #22  <Field Object mRouterObj>
		mUserRouteCategoryObj = MediaRouterJellybean.createRouteCategory(mRouterObj, "", false);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field Object mRouterObj>
	//   11   19:ldc1            #24  <String "">
	//   12   21:iconst_0        
	//   13   22:invokestatic    #28  <Method Object MediaRouterJellybean.createRouteCategory(Object, String, boolean)>
	//   14   25:putfield        #30  <Field Object mUserRouteCategoryObj>
		mUserRouteObj = MediaRouterJellybean.createUserRoute(mRouterObj, mUserRouteCategoryObj);
	//   15   28:aload_0         
	//   16   29:aload_0         
	//   17   30:getfield        #22  <Field Object mRouterObj>
	//   18   33:aload_0         
	//   19   34:getfield        #30  <Field Object mUserRouteCategoryObj>
	//   20   37:invokestatic    #34  <Method Object MediaRouterJellybean.createUserRoute(Object, Object)>
	//   21   40:putfield        #36  <Field Object mUserRouteObj>
	//   22   43:return          
	}
}
