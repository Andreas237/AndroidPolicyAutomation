// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompatApi21

static class MediaControllerCompatApi21$CallbackProxy extends android.media.session.MediaController.Callback
{

	public void onAudioInfoChanged(android.media.session.MediaController.PlaybackInfo playbackinfo)
	{
		mCallback.onAudioInfoChanged(playbackinfo.getPlaybackType(), MediaControllerCompatApi21.PlaybackInfo.getLegacyAudioStream(((Object) (playbackinfo))), playbackinfo.getVolumeControl(), playbackinfo.getMaxVolume(), playbackinfo.getCurrentVolume());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaControllerCompatApi21$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #29  <Method int android.media.session.MediaController$PlaybackInfo.getPlaybackType()>
	//    4    8:aload_1         
	//    5    9:invokestatic    #35  <Method int MediaControllerCompatApi21$PlaybackInfo.getLegacyAudioStream(Object)>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #38  <Method int android.media.session.MediaController$PlaybackInfo.getVolumeControl()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #41  <Method int android.media.session.MediaController$PlaybackInfo.getMaxVolume()>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #44  <Method int android.media.session.MediaController$PlaybackInfo.getCurrentVolume()>
	//   12   24:invokeinterface #49  <Method void MediaControllerCompatApi21$Callback.onAudioInfoChanged(int, int, int, int, int)>
	//   13   29:return          
	}

	public void onExtrasChanged(Bundle bundle)
	{
		mCallback.onExtrasChanged(bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaControllerCompatApi21$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #53  <Method void MediaControllerCompatApi21$Callback.onExtrasChanged(Bundle)>
	//    4   10:return          
	}

	public void onMetadataChanged(MediaMetadata mediametadata)
	{
		mCallback.onMetadataChanged(((Object) (mediametadata)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaControllerCompatApi21$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #58  <Method void MediaControllerCompatApi21$Callback.onMetadataChanged(Object)>
	//    4   10:return          
	}

	public void onPlaybackStateChanged(PlaybackState playbackstate)
	{
		mCallback.onPlaybackStateChanged(((Object) (playbackstate)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaControllerCompatApi21$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #62  <Method void MediaControllerCompatApi21$Callback.onPlaybackStateChanged(Object)>
	//    4   10:return          
	}

	public void onQueueChanged(List list)
	{
		mCallback.onQueueChanged(list);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaControllerCompatApi21$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #66  <Method void MediaControllerCompatApi21$Callback.onQueueChanged(List)>
	//    4   10:return          
	}

	public void onQueueTitleChanged(CharSequence charsequence)
	{
		mCallback.onQueueTitleChanged(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaControllerCompatApi21$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:invokeinterface #71  <Method void MediaControllerCompatApi21$Callback.onQueueTitleChanged(CharSequence)>
	//    4   10:return          
	}

	public void onSessionDestroyed()
	{
		mCallback.onSessionDestroyed();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaControllerCompatApi21$Callback mCallback>
	//    2    4:invokeinterface #74  <Method void MediaControllerCompatApi21$Callback.onSessionDestroyed()>
	//    3    9:return          
	}

	public void onSessionEvent(String s, Bundle bundle)
	{
		mCallback.onSessionEvent(s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaControllerCompatApi21$Callback mCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #78  <Method void MediaControllerCompatApi21$Callback.onSessionEvent(String, Bundle)>
	//    5   11:return          
	}

	protected final MediaControllerCompatApi21.Callback mCallback;

	public MediaControllerCompatApi21$CallbackProxy(MediaControllerCompatApi21.Callback callback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void android.media.session.MediaController$Callback()>
		mCallback = callback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field MediaControllerCompatApi21$Callback mCallback>
	//    5    9:return          
	}
}
