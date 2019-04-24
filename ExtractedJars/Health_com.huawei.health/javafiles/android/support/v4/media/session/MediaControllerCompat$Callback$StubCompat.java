// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, ParcelableVolumeInfo, PlaybackStateCompat

class MediaControllerCompat$Callback$StubCompat extends IMediaControllerCallback.Stub
{

	public void onEvent(String s, Bundle bundle)
		throws RemoteException
	{
		mHandler.post(1, ((Object) (s)), bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MediaControllerCompat$Callback this$0>
	//    2    4:getfield        #28  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
	//    3    7:iconst_1        
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #34  <Method void MediaControllerCompat$Callback$MessageHandler.post(int, Object, Bundle)>
	//    7   13:return          
	}

	public void onExtrasChanged(Bundle bundle)
		throws RemoteException
	{
		mHandler.post(7, ((Object) (bundle)), ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MediaControllerCompat$Callback this$0>
	//    2    4:getfield        #28  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
	//    3    7:bipush          7
	//    4    9:aload_1         
	//    5   10:aconst_null     
	//    6   11:invokevirtual   #34  <Method void MediaControllerCompat$Callback$MessageHandler.post(int, Object, Bundle)>
	//    7   14:return          
	}

	public void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
		throws RemoteException
	{
		mHandler.post(3, ((Object) (mediametadatacompat)), ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MediaControllerCompat$Callback this$0>
	//    2    4:getfield        #28  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
	//    3    7:iconst_3        
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #34  <Method void MediaControllerCompat$Callback$MessageHandler.post(int, Object, Bundle)>
	//    7   13:return          
	}

	public void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat)
		throws RemoteException
	{
		mHandler.post(2, ((Object) (playbackstatecompat)), ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MediaControllerCompat$Callback this$0>
	//    2    4:getfield        #28  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
	//    3    7:iconst_2        
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #34  <Method void MediaControllerCompat$Callback$MessageHandler.post(int, Object, Bundle)>
	//    7   13:return          
	}

	public void onQueueChanged(List list)
		throws RemoteException
	{
		mHandler.post(5, ((Object) (list)), ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MediaControllerCompat$Callback this$0>
	//    2    4:getfield        #28  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
	//    3    7:iconst_5        
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #34  <Method void MediaControllerCompat$Callback$MessageHandler.post(int, Object, Bundle)>
	//    7   13:return          
	}

	public void onQueueTitleChanged(CharSequence charsequence)
		throws RemoteException
	{
		mHandler.post(6, ((Object) (charsequence)), ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MediaControllerCompat$Callback this$0>
	//    2    4:getfield        #28  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
	//    3    7:bipush          6
	//    4    9:aload_1         
	//    5   10:aconst_null     
	//    6   11:invokevirtual   #34  <Method void MediaControllerCompat$Callback$MessageHandler.post(int, Object, Bundle)>
	//    7   14:return          
	}

	public void onRepeatModeChanged(int i)
		throws RemoteException
	{
		mHandler.post(9, ((Object) (Integer.valueOf(i))), ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MediaControllerCompat$Callback this$0>
	//    2    4:getfield        #28  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
	//    3    7:bipush          9
	//    4    9:iload_1         
	//    5   10:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//    6   13:aconst_null     
	//    7   14:invokevirtual   #34  <Method void MediaControllerCompat$Callback$MessageHandler.post(int, Object, Bundle)>
	//    8   17:return          
	}

	public void onSessionDestroyed()
		throws RemoteException
	{
		mHandler.post(8, ((Object) (null)), ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MediaControllerCompat$Callback this$0>
	//    2    4:getfield        #28  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
	//    3    7:bipush          8
	//    4    9:aconst_null     
	//    5   10:aconst_null     
	//    6   11:invokevirtual   #34  <Method void MediaControllerCompat$Callback$MessageHandler.post(int, Object, Bundle)>
	//    7   14:return          
	}

	public void onShuffleModeChanged(boolean flag)
		throws RemoteException
	{
		mHandler.post(10, ((Object) (Boolean.valueOf(flag))), ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MediaControllerCompat$Callback this$0>
	//    2    4:getfield        #28  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
	//    3    7:bipush          10
	//    4    9:iload_1         
	//    5   10:invokestatic    #63  <Method Boolean Boolean.valueOf(boolean)>
	//    6   13:aconst_null     
	//    7   14:invokevirtual   #34  <Method void MediaControllerCompat$Callback$MessageHandler.post(int, Object, Bundle)>
	//    8   17:return          
	}

	public void onVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
		throws RemoteException
	{
		MediaControllerCompat.PlaybackInfo playbackinfo = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(parcelablevolumeinfo != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          34
			playbackinfo = new MediaControllerCompat.PlaybackInfo(parcelablevolumeinfo.volumeType, parcelablevolumeinfo.audioStream, parcelablevolumeinfo.controlType, parcelablevolumeinfo.maxVolume, parcelablevolumeinfo.currentVolume);
	//    4    6:new             #67  <Class MediaControllerCompat$PlaybackInfo>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:getfield        #73  <Field int ParcelableVolumeInfo.volumeType>
	//    8   14:aload_1         
	//    9   15:getfield        #76  <Field int ParcelableVolumeInfo.audioStream>
	//   10   18:aload_1         
	//   11   19:getfield        #79  <Field int ParcelableVolumeInfo.controlType>
	//   12   22:aload_1         
	//   13   23:getfield        #82  <Field int ParcelableVolumeInfo.maxVolume>
	//   14   26:aload_1         
	//   15   27:getfield        #85  <Field int ParcelableVolumeInfo.currentVolume>
	//   16   30:invokespecial   #88  <Method void MediaControllerCompat$PlaybackInfo(int, int, int, int, int)>
	//   17   33:astore_2        
		mHandler.post(4, ((Object) (playbackinfo)), ((Bundle) (null)));
	//   18   34:aload_0         
	//   19   35:getfield        #16  <Field MediaControllerCompat$Callback this$0>
	//   20   38:getfield        #28  <Field MediaControllerCompat$Callback$MessageHandler MediaControllerCompat$Callback.mHandler>
	//   21   41:iconst_4        
	//   22   42:aload_2         
	//   23   43:aconst_null     
	//   24   44:invokevirtual   #34  <Method void MediaControllerCompat$Callback$MessageHandler.post(int, Object, Bundle)>
	//   25   47:return          
	}

	final MediaControllerCompat.Callback this$0;

	MediaControllerCompat$Callback$StubCompat()
	{
		this$0 = MediaControllerCompat.Callback.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field MediaControllerCompat$Callback this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void IMediaControllerCallback$Stub()>
	//    5    9:return          
	}
}
