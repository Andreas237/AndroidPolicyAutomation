// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;


// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat

static class MediaControllerCompat$MediaControllerExtraData extends android.support.v4.app.SupportActivity.ExtraData
{

	MediaControllerCompat getMediaController()
	{
		return mMediaController;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MediaControllerCompat mMediaController>
	//    2    4:areturn         
	}

	private final MediaControllerCompat mMediaController;

	MediaControllerCompat$MediaControllerExtraData(MediaControllerCompat mediacontrollercompat)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void android.support.v4.app.SupportActivity$ExtraData()>
		mMediaController = mediacontrollercompat;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field MediaControllerCompat mMediaController>
	//    5    9:return          
	}
}
