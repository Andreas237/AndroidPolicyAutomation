// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.i;

// Referenced classes of package android.support.v7.app:
//			MediaRouteCastDialog

final class MediaRouteCastDialog$MediaControllerCallback extends i
{

	public void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
	{
		MediaRouteCastDialog mediaroutecastdialog = MediaRouteCastDialog.this;
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field MediaRouteCastDialog this$0>
	//    2    4:astore_2        
		if(mediametadatacompat == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
			mediametadatacompat = null;
	//    5    9:aconst_null     
	//    6   10:astore_1        
		else
	//*   7   11:goto            19
			mediametadatacompat = ((MediaMetadataCompat) (mediametadatacompat.a()));
	//    8   14:aload_1         
	//    9   15:invokevirtual   #22  <Method android.support.v4.media.MediaDescriptionCompat MediaMetadataCompat.a()>
	//   10   18:astore_1        
		mediaroutecastdialog.mDescription = ((android.support.v4.media.MediaDescriptionCompat) (mediametadatacompat));
	//   11   19:aload_2         
	//   12   20:aload_1         
	//   13   21:putfield        #28  <Field android.support.v4.media.MediaDescriptionCompat MediaRouteCastDialog.mDescription>
		updateArtIconIfNeeded();
	//   14   24:aload_0         
	//   15   25:getfield        #10  <Field MediaRouteCastDialog this$0>
	//   16   28:invokevirtual   #31  <Method void MediaRouteCastDialog.updateArtIconIfNeeded()>
		update();
	//   17   31:aload_0         
	//   18   32:getfield        #10  <Field MediaRouteCastDialog this$0>
	//   19   35:invokevirtual   #34  <Method void MediaRouteCastDialog.update()>
	//   20   38:return          
	}

	public void onSessionDestroyed()
	{
		if(mMediaController != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #10  <Field MediaRouteCastDialog this$0>
	//*   2    4:getfield        #39  <Field MediaControllerCompat MediaRouteCastDialog.mMediaController>
	//*   3    7:ifnull          35
		{
			mMediaController.b(((i) (mControllerCallback)));
	//    4   10:aload_0         
	//    5   11:getfield        #10  <Field MediaRouteCastDialog this$0>
	//    6   14:getfield        #39  <Field MediaControllerCompat MediaRouteCastDialog.mMediaController>
	//    7   17:aload_0         
	//    8   18:getfield        #10  <Field MediaRouteCastDialog this$0>
	//    9   21:getfield        #43  <Field MediaRouteCastDialog$MediaControllerCallback MediaRouteCastDialog.mControllerCallback>
	//   10   24:invokevirtual   #49  <Method void MediaControllerCompat.b(i)>
			mMediaController = null;
	//   11   27:aload_0         
	//   12   28:getfield        #10  <Field MediaRouteCastDialog this$0>
	//   13   31:aconst_null     
	//   14   32:putfield        #39  <Field MediaControllerCompat MediaRouteCastDialog.mMediaController>
		}
	//   15   35:return          
	}

	final MediaRouteCastDialog this$0;

	MediaRouteCastDialog$MediaControllerCallback()
	{
		this$0 = MediaRouteCastDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field MediaRouteCastDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void i()>
	//    5    9:return          
	}
}
