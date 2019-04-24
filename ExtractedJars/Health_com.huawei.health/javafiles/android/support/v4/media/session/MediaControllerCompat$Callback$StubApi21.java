// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat, PlaybackStateCompat

class MediaControllerCompat$Callback$StubApi21
	implements MediaControllerCompatApi21.Callback
{

	public void onAudioInfoChanged(int i, int j, int k, int l, int i1)
	{
		MediaControllerCompat.Callback.this.onAudioInfoChanged(new MediaControllerCompat.PlaybackInfo(i, j, k, l, i1));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
	//    2    4:new             #26  <Class MediaControllerCompat$PlaybackInfo>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:iload           5
	//    9   15:invokespecial   #28  <Method void MediaControllerCompat$PlaybackInfo(int, int, int, int, int)>
	//   10   18:invokevirtual   #31  <Method void MediaControllerCompat$Callback.onAudioInfoChanged(MediaControllerCompat$PlaybackInfo)>
	//   11   21:return          
	}

	public void onExtrasChanged(Bundle bundle)
	{
		MediaControllerCompat.Callback.this.onExtrasChanged(bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #35  <Method void MediaControllerCompat$Callback.onExtrasChanged(Bundle)>
	//    4    8:return          
	}

	public void onMetadataChanged(Object obj)
	{
		MediaControllerCompat.Callback.this.onMetadataChanged(MediaMetadataCompat.fromMediaMetadata(obj));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #43  <Method MediaMetadataCompat MediaMetadataCompat.fromMediaMetadata(Object)>
	//    4    8:invokevirtual   #46  <Method void MediaControllerCompat$Callback.onMetadataChanged(MediaMetadataCompat)>
	//    5   11:return          
	}

	public void onPlaybackStateChanged(Object obj)
	{
		if(mHasExtraCallback)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
	//*   2    4:getfield        #51  <Field boolean MediaControllerCompat$Callback.mHasExtraCallback>
	//*   3    7:ifeq            11
		{
			return;
	//    4   10:return          
		} else
		{
			MediaControllerCompat.Callback.this.onPlaybackStateChanged(PlaybackStateCompat.fromPlaybackState(obj));
	//    5   11:aload_0         
	//    6   12:getfield        #18  <Field MediaControllerCompat$Callback this$0>
	//    7   15:aload_1         
	//    8   16:invokestatic    #57  <Method PlaybackStateCompat PlaybackStateCompat.fromPlaybackState(Object)>
	//    9   19:invokevirtual   #60  <Method void MediaControllerCompat$Callback.onPlaybackStateChanged(PlaybackStateCompat)>
			return;
	//   10   22:return          
		}
	}

	public void onQueueChanged(List list)
	{
		MediaControllerCompat.Callback.this.onQueueChanged(MediaSessionCompat.QueueItem.fromQueueItemList(list));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #68  <Method List MediaSessionCompat$QueueItem.fromQueueItemList(List)>
	//    4    8:invokevirtual   #70  <Method void MediaControllerCompat$Callback.onQueueChanged(List)>
	//    5   11:return          
	}

	public void onQueueTitleChanged(CharSequence charsequence)
	{
		MediaControllerCompat.Callback.this.onQueueTitleChanged(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #76  <Method void MediaControllerCompat$Callback.onQueueTitleChanged(CharSequence)>
	//    4    8:return          
	}

	public void onSessionDestroyed()
	{
		MediaControllerCompat.Callback.this.onSessionDestroyed();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
	//    2    4:invokevirtual   #79  <Method void MediaControllerCompat$Callback.onSessionDestroyed()>
	//    3    7:return          
	}

	public void onSessionEvent(String s, Bundle bundle)
	{
		if(mHasExtraCallback && android.os.Build.VERSION.SDK_INT < 23)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field MediaControllerCompat$Callback this$0>
	//*   2    4:getfield        #51  <Field boolean MediaControllerCompat$Callback.mHasExtraCallback>
	//*   3    7:ifeq            19
	//*   4   10:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   13:bipush          23
	//*   6   15:icmpge          19
		{
			return;
	//    7   18:return          
		} else
		{
			MediaControllerCompat.Callback.this.onSessionEvent(s, bundle);
	//    8   19:aload_0         
	//    9   20:getfield        #18  <Field MediaControllerCompat$Callback this$0>
	//   10   23:aload_1         
	//   11   24:aload_2         
	//   12   25:invokevirtual   #89  <Method void MediaControllerCompat$Callback.onSessionEvent(String, Bundle)>
			return;
	//   13   28:return          
		}
	}

	final MediaControllerCompat.Callback this$0;

	MediaControllerCompat$Callback$StubApi21()
	{
		this$0 = MediaControllerCompat.Callback.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field MediaControllerCompat$Callback this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
