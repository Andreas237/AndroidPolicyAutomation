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

	public void onShuffleModeChangedDeprecated(boolean flag)
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
			callback.postToHandler(10, ((Object) (Boolean.valueOf(flag))), ((Bundle) (null)));
	//    7   15:aload_2         
	//    8   16:bipush          10
	//    9   18:iload_1         
	//   10   19:invokestatic    #40  <Method Boolean Boolean.valueOf(boolean)>
	//   11   22:aconst_null     
	//   12   23:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
	//   13   26:return          
	}

	public void onVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
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
	//*   6   12:ifnull          56
		{
			MediaControllerCompat.PlaybackInfo playbackinfo = null;
	//    7   15:aconst_null     
	//    8   16:astore_2        
			if(parcelablevolumeinfo != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          49
				playbackinfo = new MediaControllerCompat.PlaybackInfo(parcelablevolumeinfo.volumeType, parcelablevolumeinfo.audioStream, parcelablevolumeinfo.controlType, parcelablevolumeinfo.maxVolume, parcelablevolumeinfo.currentVolume);
	//   11   21:new             #73  <Class MediaControllerCompat$PlaybackInfo>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:getfield        #79  <Field int ParcelableVolumeInfo.volumeType>
	//   15   29:aload_1         
	//   16   30:getfield        #82  <Field int ParcelableVolumeInfo.audioStream>
	//   17   33:aload_1         
	//   18   34:getfield        #85  <Field int ParcelableVolumeInfo.controlType>
	//   19   37:aload_1         
	//   20   38:getfield        #88  <Field int ParcelableVolumeInfo.maxVolume>
	//   21   41:aload_1         
	//   22   42:getfield        #91  <Field int ParcelableVolumeInfo.currentVolume>
	//   23   45:invokespecial   #94  <Method void MediaControllerCompat$PlaybackInfo(int, int, int, int, int)>
	//   24   48:astore_2        
			callback.postToHandler(4, ((Object) (playbackinfo)), ((Bundle) (null)));
	//   25   49:aload_3         
	//   26   50:iconst_4        
	//   27   51:aload_2         
	//   28   52:aconst_null     
	//   29   53:invokevirtual   #44  <Method void MediaControllerCompat$Callback.postToHandler(int, Object, Bundle)>
		}
	//   30   56:return          
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
