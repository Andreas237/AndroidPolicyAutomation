// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, PlaybackStateCompat

private static class MediaControllerCompat$Callback$StubApi21
	implements MediaControllerCompatApi21.Callback
{

	public void onAudioInfoChanged(int i, int j, int k, int l, int i1)
	{
		MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field WeakReference mCallback>
	//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class MediaControllerCompat$Callback>
	//    4   10:astore          6
		if(callback != null)
	//*   5   12:aload           6
	//*   6   14:ifnull          36
			callback.onAudioInfoChanged(new MediaControllerCompat.PlaybackInfo(i, j, k, l, i1));
	//    7   17:aload           6
	//    8   19:new             #36  <Class MediaControllerCompat$PlaybackInfo>
	//    9   22:dup             
	//   10   23:iload_1         
	//   11   24:iload_2         
	//   12   25:iload_3         
	//   13   26:iload           4
	//   14   28:iload           5
	//   15   30:invokespecial   #38  <Method void MediaControllerCompat$PlaybackInfo(int, int, int, int, int)>
	//   16   33:invokevirtual   #41  <Method void MediaControllerCompat$Callback.onAudioInfoChanged(MediaControllerCompat$PlaybackInfo)>
	//   17   36:return          
	}

	public void onExtrasChanged(Bundle bundle)
	{
		MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field WeakReference mCallback>
	//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class MediaControllerCompat$Callback>
	//    4   10:astore_2        
		if(callback != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          20
			callback.onExtrasChanged(bundle);
	//    7   15:aload_2         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #45  <Method void MediaControllerCompat$Callback.onExtrasChanged(Bundle)>
	//   10   20:return          
	}

	public void onMetadataChanged(Object obj)
	{
		MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field WeakReference mCallback>
	//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class MediaControllerCompat$Callback>
	//    4   10:astore_2        
		if(callback != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          23
			callback.onMetadataChanged(MediaMetadataCompat.fromMediaMetadata(obj));
	//    7   15:aload_2         
	//    8   16:aload_1         
	//    9   17:invokestatic    #52  <Method MediaMetadataCompat MediaMetadataCompat.fromMediaMetadata(Object)>
	//   10   20:invokevirtual   #55  <Method void MediaControllerCompat$Callback.onMetadataChanged(MediaMetadataCompat)>
	//   11   23:return          
	}

	public void onPlaybackStateChanged(Object obj)
	{
		MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field WeakReference mCallback>
	//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class MediaControllerCompat$Callback>
	//    4   10:astore_2        
		if(callback != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          31
		{
			if(callback.mHasExtraCallback)
	//*   7   15:aload_2         
	//*   8   16:getfield        #60  <Field boolean MediaControllerCompat$Callback.mHasExtraCallback>
	//*   9   19:ifeq            23
				return;
	//   10   22:return          
			callback.onPlaybackStateChanged(PlaybackStateCompat.fromPlaybackState(obj));
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokestatic    #66  <Method PlaybackStateCompat PlaybackStateCompat.fromPlaybackState(Object)>
	//   14   28:invokevirtual   #69  <Method void MediaControllerCompat$Callback.onPlaybackStateChanged(PlaybackStateCompat)>
		}
	//   15   31:return          
	}

	public void onQueueChanged(List list)
	{
		MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field WeakReference mCallback>
	//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class MediaControllerCompat$Callback>
	//    4   10:astore_2        
		if(callback != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          23
			callback.onQueueChanged(MediaSessionCompat.QueueItem.fromQueueItemList(list));
	//    7   15:aload_2         
	//    8   16:aload_1         
	//    9   17:invokestatic    #77  <Method List MediaSessionCompat$QueueItem.fromQueueItemList(List)>
	//   10   20:invokevirtual   #79  <Method void MediaControllerCompat$Callback.onQueueChanged(List)>
	//   11   23:return          
	}

	public void onQueueTitleChanged(CharSequence charsequence)
	{
		MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field WeakReference mCallback>
	//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class MediaControllerCompat$Callback>
	//    4   10:astore_2        
		if(callback != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          20
			callback.onQueueTitleChanged(charsequence);
	//    7   15:aload_2         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #85  <Method void MediaControllerCompat$Callback.onQueueTitleChanged(CharSequence)>
	//   10   20:return          
	}

	public void onSessionDestroyed()
	{
		MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field WeakReference mCallback>
	//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class MediaControllerCompat$Callback>
	//    4   10:astore_1        
		if(callback != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          19
			callback.onSessionDestroyed();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #88  <Method void MediaControllerCompat$Callback.onSessionDestroyed()>
	//    9   19:return          
	}

	public void onSessionEvent(String s, Bundle bundle)
	{
		MediaControllerCompat.Callback callback = (MediaControllerCompat.Callback)mCallback.get();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field WeakReference mCallback>
	//    2    4:invokevirtual   #34  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class MediaControllerCompat$Callback>
	//    4   10:astore_3        
		if(callback != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          37
		{
			if(callback.mHasExtraCallback && android.os.Build.VERSION.SDK_INT < 23)
	//*   7   15:aload_3         
	//*   8   16:getfield        #60  <Field boolean MediaControllerCompat$Callback.mHasExtraCallback>
	//*   9   19:ifeq            31
	//*  10   22:getstatic       #96  <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   25:bipush          23
	//*  12   27:icmpge          31
				return;
	//   13   30:return          
			callback.onSessionEvent(s, bundle);
	//   14   31:aload_3         
	//   15   32:aload_1         
	//   16   33:aload_2         
	//   17   34:invokevirtual   #98  <Method void MediaControllerCompat$Callback.onSessionEvent(String, Bundle)>
		}
	//   18   37:return          
	}

	private final WeakReference mCallback;

	MediaControllerCompat$Callback$StubApi21(MediaControllerCompat.Callback callback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mCallback = new WeakReference(((Object) (callback)));
	//    2    4:aload_0         
	//    3    5:new             #22  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #25  <Method void WeakReference(Object)>
	//    7   13:putfield        #27  <Field WeakReference mCallback>
	//    8   16:return          
	}
}
