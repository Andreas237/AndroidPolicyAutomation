// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;

// Referenced classes of package android.support.v7.app:
//			MediaRouteControllerDialog

private final class MediaRouteControllerDialog$MediaControllerCallback extends android.support.v4.media.session.MediaControllerCompat.Callback
{

	public void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
	{
		MediaRouteControllerDialog mediaroutecontrollerdialog = MediaRouteControllerDialog.this;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field MediaRouteControllerDialog this$0>
	//    2    4:astore_2        
		if(mediametadatacompat == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
			mediametadatacompat = null;
	//    5    9:aconst_null     
	//    6   10:astore_1        
		else
	//*   7   11:goto            19
			mediametadatacompat = ((MediaMetadataCompat) (mediametadatacompat.getDescription()));
	//    8   14:aload_1         
	//    9   15:invokevirtual   #25  <Method android.support.v4.media.MediaDescriptionCompat MediaMetadataCompat.getDescription()>
	//   10   18:astore_1        
		mediaroutecontrollerdialog.mDescription = ((android.support.v4.media.MediaDescriptionCompat) (mediametadatacompat));
	//   11   19:aload_2         
	//   12   20:aload_1         
	//   13   21:putfield        #29  <Field android.support.v4.media.MediaDescriptionCompat MediaRouteControllerDialog.mDescription>
		updateArtIconIfNeeded();
	//   14   24:aload_0         
	//   15   25:getfield        #13  <Field MediaRouteControllerDialog this$0>
	//   16   28:invokevirtual   #32  <Method void MediaRouteControllerDialog.updateArtIconIfNeeded()>
		update(false);
	//   17   31:aload_0         
	//   18   32:getfield        #13  <Field MediaRouteControllerDialog this$0>
	//   19   35:iconst_0        
	//   20   36:invokevirtual   #36  <Method void MediaRouteControllerDialog.update(boolean)>
	//   21   39:return          
	}

	public void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat)
	{
		mState = playbackstatecompat;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field MediaRouteControllerDialog this$0>
	//    2    4:aload_1         
	//    3    5:putfield        #42  <Field PlaybackStateCompat MediaRouteControllerDialog.mState>
		update(false);
	//    4    8:aload_0         
	//    5    9:getfield        #13  <Field MediaRouteControllerDialog this$0>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #36  <Method void MediaRouteControllerDialog.update(boolean)>
	//    8   16:return          
	}

	public void onSessionDestroyed()
	{
		if(mMediaController != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field MediaRouteControllerDialog this$0>
	//*   2    4:getfield        #47  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
	//*   3    7:ifnull          35
		{
			mMediaController.unregisterCallback(((android.support.v4.media.session.MediaControllerCompat.Callback) (mControllerCallback)));
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field MediaRouteControllerDialog this$0>
	//    6   14:getfield        #47  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
	//    7   17:aload_0         
	//    8   18:getfield        #13  <Field MediaRouteControllerDialog this$0>
	//    9   21:getfield        #51  <Field MediaRouteControllerDialog$MediaControllerCallback MediaRouteControllerDialog.mControllerCallback>
	//   10   24:invokevirtual   #57  <Method void MediaControllerCompat.unregisterCallback(android.support.v4.media.session.MediaControllerCompat$Callback)>
			mMediaController = null;
	//   11   27:aload_0         
	//   12   28:getfield        #13  <Field MediaRouteControllerDialog this$0>
	//   13   31:aconst_null     
	//   14   32:putfield        #47  <Field MediaControllerCompat MediaRouteControllerDialog.mMediaController>
		}
	//   15   35:return          
	}

	final MediaRouteControllerDialog this$0;

	MediaRouteControllerDialog$MediaControllerCallback()
	{
		this$0 = MediaRouteControllerDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field MediaRouteControllerDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void android.support.v4.media.session.MediaControllerCompat$Callback()>
	//    5    9:return          
	}
}
