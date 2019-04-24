// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, ParcelableVolumeInfo, PlaybackStateCompat

private static class MediaControllerCompat$Callback$StubCompat extends IMediaControllerCallback.Stub
{

	public void onCaptioningEnabledChanged(boolean flag)
		throws RemoteException
	{
		MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field WeakReference mCallback>
	//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
	//    4   10:astore_2        
		if(callback != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          26
			callback.postToHandler(11, ((Object) (Boolean.valueOf(flag))), ((Bundle) (null)));
	//    7   15:aload_2         
	//    8   16:bipush          11
	//    9   18:iload_1         
	//   10   19:invokestatic    #40  <Method Boolean Boolean.valueOf(boolean)>
	//   11   22:aconst_null     
	//   12   23:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
	//   13   26:return          
	}

	public void onEvent(String s, Bundle bundle)
		throws RemoteException
	{
		MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field WeakReference mCallback>
	//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
	//    4   10:astore_3        
		if(callback != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          22
			callback.postToHandler(1, ((Object) (s)), bundle);
	//    7   15:aload_3         
	//    8   16:iconst_1        
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
	//   12   22:return          
	}

	public void onExtrasChanged(Bundle bundle)
		throws RemoteException
	{
		MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field WeakReference mCallback>
	//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
	//    4   10:astore_2        
		if(callback != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          23
			callback.postToHandler(7, ((Object) (bundle)), ((Bundle) (null)));
	//    7   15:aload_2         
	//    8   16:bipush          7
	//    9   18:aload_1         
	//   10   19:aconst_null     
	//   11   20:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
	//   12   23:return          
	}

	public void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
		throws RemoteException
	{
		MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field WeakReference mCallback>
	//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
	//    4   10:astore_2        
		if(callback != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          22
			callback.postToHandler(3, ((Object) (mediametadatacompat)), ((Bundle) (null)));
	//    7   15:aload_2         
	//    8   16:iconst_3        
	//    9   17:aload_1         
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
	//   12   22:return          
	}

	public void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat)
		throws RemoteException
	{
		MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field WeakReference mCallback>
	//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
	//    4   10:astore_2        
		if(callback != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          22
			callback.postToHandler(2, ((Object) (playbackstatecompat)), ((Bundle) (null)));
	//    7   15:aload_2         
	//    8   16:iconst_2        
	//    9   17:aload_1         
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
	//   12   22:return          
	}

	public void onQueueChanged(List list)
		throws RemoteException
	{
		MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field WeakReference mCallback>
	//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
	//    4   10:astore_2        
		if(callback != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          22
			callback.postToHandler(5, ((Object) (list)), ((Bundle) (null)));
	//    7   15:aload_2         
	//    8   16:iconst_5        
	//    9   17:aload_1         
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
	//   12   22:return          
	}

	public void onQueueTitleChanged(CharSequence charsequence)
		throws RemoteException
	{
		MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field WeakReference mCallback>
	//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
	//    4   10:astore_2        
		if(callback != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          23
			callback.postToHandler(6, ((Object) (charsequence)), ((Bundle) (null)));
	//    7   15:aload_2         
	//    8   16:bipush          6
	//    9   18:aload_1         
	//   10   19:aconst_null     
	//   11   20:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
	//   12   23:return          
	}

	public void onRepeatModeChanged(int i)
		throws RemoteException
	{
		MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field WeakReference mCallback>
	//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
	//    4   10:astore_2        
		if(callback != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          26
			callback.postToHandler(9, ((Object) (Integer.valueOf(i))), ((Bundle) (null)));
	//    7   15:aload_2         
	//    8   16:bipush          9
	//    9   18:iload_1         
	//   10   19:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   11   22:aconst_null     
	//   12   23:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
	//   13   26:return          
	}

	public void onSessionDestroyed()
		throws RemoteException
	{
		MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field WeakReference mCallback>
	//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
	//    4   10:astore_1        
		if(callback != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          23
			callback.postToHandler(8, ((Object) (null)), ((Bundle) (null)));
	//    7   15:aload_1         
	//    8   16:bipush          8
	//    9   18:aconst_null     
	//   10   19:aconst_null     
	//   11   20:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
	//   12   23:return          
	}

	public void onSessionReady()
		throws RemoteException
	{
		MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field WeakReference mCallback>
	//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
	//    4   10:astore_1        
		if(callback != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          23
			callback.postToHandler(13, ((Object) (null)), ((Bundle) (null)));
	//    7   15:aload_1         
	//    8   16:bipush          13
	//    9   18:aconst_null     
	//   10   19:aconst_null     
	//   11   20:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
	//   12   23:return          
	}

	public void onShuffleModeChanged(int i)
		throws RemoteException
	{
		MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field WeakReference mCallback>
	//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
	//    4   10:astore_2        
		if(callback != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          26
			callback.postToHandler(12, ((Object) (Integer.valueOf(i))), ((Bundle) (null)));
	//    7   15:aload_2         
	//    8   16:bipush          12
	//    9   18:iload_1         
	//   10   19:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   11   22:aconst_null     
	//   12   23:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
	//   13   26:return          
	}

	public void onShuffleModeChangedRemoved(boolean flag)
		throws RemoteException
	{
	//    0    0:return          
	}

	public void onVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
		throws RemoteException
	{
		MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field WeakReference mCallback>
	//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class MediaControllerCompat$Callback>
	//    4   10:astore_2        
		if(callback != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          59
		{
			if(parcelablevolumeinfo != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          50
				parcelablevolumeinfo = ((ParcelableVolumeInfo) (new MediaControllerCompat.PlaybackInfo(parcelablevolumeinfo.volumeType, parcelablevolumeinfo.audioStream, parcelablevolumeinfo.controlType, parcelablevolumeinfo.maxVolume, parcelablevolumeinfo.currentVolume)));
	//    9   19:new             #74  <Class MediaControllerCompat$PlaybackInfo>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:getfield        #80  <Field int ParcelableVolumeInfo.volumeType>
	//   13   27:aload_1         
	//   14   28:getfield        #83  <Field int ParcelableVolumeInfo.audioStream>
	//   15   31:aload_1         
	//   16   32:getfield        #86  <Field int ParcelableVolumeInfo.controlType>
	//   17   35:aload_1         
	//   18   36:getfield        #89  <Field int ParcelableVolumeInfo.maxVolume>
	//   19   39:aload_1         
	//   20   40:getfield        #92  <Field int ParcelableVolumeInfo.currentVolume>
	//   21   43:invokespecial   #95  <Method void MediaControllerCompat$PlaybackInfo(int, int, int, int, int)>
	//   22   46:astore_1        
			else
	//*  23   47:goto            52
				parcelablevolumeinfo = null;
	//   24   50:aconst_null     
	//   25   51:astore_1        
			callback.postToHandler(4, ((Object) (parcelablevolumeinfo)), ((Bundle) (null)));
	//   26   52:aload_2         
	//   27   53:iconst_4        
	//   28   54:aload_1         
	//   29   55:aconst_null     
	//   30   56:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
		}
	//   31   59:return          
	}

	private final WeakReference mCallback;

	MediaControllerCompat$Callback$StubCompat(MediaControllerCompat.Callback callback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void IMediaControllerCallback$Stub()>
		mCallback = new WeakReference(((Object) (callback)));
	//    2    4:aload_0         
	//    3    5:new             #20  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #23  <Method void WeakReference(Object)>
	//    7   13:putfield        #25  <Field WeakReference mCallback>
	//    8   16:return          
	}
}
