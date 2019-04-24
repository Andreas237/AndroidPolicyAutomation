// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;


// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat

static class MediaControllerCompat$TransportControlsApi26 extends MediaControllerCompat$TransportControlsApi24
{

	public void setRepeatMode(int i)
	{
		MediaControllerCompatApi26$TransportControls.setRepeatMode(mControlsObj, i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object mControlsObj>
	//    2    4:iload_1         
	//    3    5:invokestatic    #23  <Method void MediaControllerCompatApi26$TransportControls.setRepeatMode(Object, int)>
	//    4    8:return          
	}

	public void setShuffleModeEnabled(boolean flag)
	{
		MediaControllerCompatApi26$TransportControls.setShuffleModeEnabled(mControlsObj, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object mControlsObj>
	//    2    4:iload_1         
	//    3    5:invokestatic    #28  <Method void MediaControllerCompatApi26$TransportControls.setShuffleModeEnabled(Object, boolean)>
	//    4    8:return          
	}

	MediaControllerCompat$TransportControlsApi26(Object obj)
	{
		super(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void MediaControllerCompat$TransportControlsApi24(Object)>
	//    3    5:return          
	}
}
