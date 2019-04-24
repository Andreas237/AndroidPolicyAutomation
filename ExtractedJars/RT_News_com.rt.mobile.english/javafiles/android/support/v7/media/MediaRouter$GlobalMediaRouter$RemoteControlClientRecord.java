// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;


// Referenced classes of package android.support.v7.media:
//			MediaRouter, RemoteControlClientCompat

private final class MediaRouter$GlobalMediaRouter$RemoteControlClientRecord
	implements RemoteControlClientCompat.VolumeCallback
{

	public void disconnect()
	{
		mDisconnected = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #48  <Field boolean mDisconnected>
		mRccCompat.setVolumeCallback(((RemoteControlClientCompat.VolumeCallback) (null)));
	//    3    5:aload_0         
	//    4    6:getfield        #37  <Field RemoteControlClientCompat mRccCompat>
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #41  <Method void RemoteControlClientCompat.setVolumeCallback(RemoteControlClientCompat$VolumeCallback)>
	//    7   13:return          
	}

	public Object getRemoteControlClient()
	{
		return mRccCompat.getRemoteControlClient();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field RemoteControlClientCompat mRccCompat>
	//    2    4:invokevirtual   #52  <Method Object RemoteControlClientCompat.getRemoteControlClient()>
	//    3    7:areturn         
	}

	public void onVolumeSetRequest(int i)
	{
		if(!mDisconnected && mSelectedRoute != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field boolean mDisconnected>
	//*   2    4:ifne            28
	//*   3    7:aload_0         
	//*   4    8:getfield        #22  <Field MediaRouter$GlobalMediaRouter this$0>
	//*   5   11:getfield        #58  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
	//*   6   14:ifnull          28
			mSelectedRoute.requestSetVolume(i);
	//    7   17:aload_0         
	//    8   18:getfield        #22  <Field MediaRouter$GlobalMediaRouter this$0>
	//    9   21:getfield        #58  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
	//   10   24:iload_1         
	//   11   25:invokevirtual   #63  <Method void MediaRouter$RouteInfo.requestSetVolume(int)>
	//   12   28:return          
	}

	public void onVolumeUpdateRequest(int i)
	{
		if(!mDisconnected && mSelectedRoute != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field boolean mDisconnected>
	//*   2    4:ifne            28
	//*   3    7:aload_0         
	//*   4    8:getfield        #22  <Field MediaRouter$GlobalMediaRouter this$0>
	//*   5   11:getfield        #58  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
	//*   6   14:ifnull          28
			mSelectedRoute.requestUpdateVolume(i);
	//    7   17:aload_0         
	//    8   18:getfield        #22  <Field MediaRouter$GlobalMediaRouter this$0>
	//    9   21:getfield        #58  <Field MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.mSelectedRoute>
	//   10   24:iload_1         
	//   11   25:invokevirtual   #67  <Method void MediaRouter$RouteInfo.requestUpdateVolume(int)>
	//   12   28:return          
	}

	public void updatePlaybackInfo()
	{
		mRccCompat.setPlaybackInfo(mPlaybackInfo);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field RemoteControlClientCompat mRccCompat>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field MediaRouter$GlobalMediaRouter this$0>
	//    4    8:getfield        #71  <Field RemoteControlClientCompat$PlaybackInfo MediaRouter$GlobalMediaRouter.mPlaybackInfo>
	//    5   11:invokevirtual   #75  <Method void RemoteControlClientCompat.setPlaybackInfo(RemoteControlClientCompat$PlaybackInfo)>
	//    6   14:return          
	}

	private boolean mDisconnected;
	private final RemoteControlClientCompat mRccCompat;
	final MediaRouter.GlobalMediaRouter this$0;

	public MediaRouter$GlobalMediaRouter$RemoteControlClientRecord(Object obj)
	{
		this$0 = MediaRouter.GlobalMediaRouter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field MediaRouter$GlobalMediaRouter this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void Object()>
		mRccCompat = RemoteControlClientCompat.obtain(mApplicationContext, obj);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #29  <Field android.content.Context MediaRouter$GlobalMediaRouter.mApplicationContext>
	//    8   14:aload_2         
	//    9   15:invokestatic    #35  <Method RemoteControlClientCompat RemoteControlClientCompat.obtain(android.content.Context, Object)>
	//   10   18:putfield        #37  <Field RemoteControlClientCompat mRccCompat>
		mRccCompat.setVolumeCallback(((RemoteControlClientCompat.VolumeCallback) (this)));
	//   11   21:aload_0         
	//   12   22:getfield        #37  <Field RemoteControlClientCompat mRccCompat>
	//   13   25:aload_0         
	//   14   26:invokevirtual   #41  <Method void RemoteControlClientCompat.setVolumeCallback(RemoteControlClientCompat$VolumeCallback)>
		updatePlaybackInfo();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #44  <Method void updatePlaybackInfo()>
	//   17   33:return          
	}
}
