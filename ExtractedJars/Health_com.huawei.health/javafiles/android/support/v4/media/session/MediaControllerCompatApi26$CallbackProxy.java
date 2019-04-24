// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;


// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompatApi26

static class MediaControllerCompatApi26$CallbackProxy extends MediaControllerCompatApi21$CallbackProxy
{

	public void onRepeatModeChanged(int i)
	{
		((MediaControllerCompatApi26.Callback)mCallback).onRepeatModeChanged(i);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MediaControllerCompatApi21$Callback mCallback>
	//    2    4:checkcast       #24  <Class MediaControllerCompatApi26$Callback>
	//    3    7:iload_1         
	//    4    8:invokeinterface #26  <Method void MediaControllerCompatApi26$Callback.onRepeatModeChanged(int)>
	//    5   13:return          
	}

	public void onShuffleModeChanged(boolean flag)
	{
		((MediaControllerCompatApi26.Callback)mCallback).onShuffleModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MediaControllerCompatApi21$Callback mCallback>
	//    2    4:checkcast       #24  <Class MediaControllerCompatApi26$Callback>
	//    3    7:iload_1         
	//    4    8:invokeinterface #30  <Method void MediaControllerCompatApi26$Callback.onShuffleModeChanged(boolean)>
	//    5   13:return          
	}

	MediaControllerCompatApi26$CallbackProxy(MediaControllerCompatApi26.Callback callback)
	{
		super(((MediaControllerCompatApi21.Callback) (callback)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void MediaControllerCompatApi21$CallbackProxy(MediaControllerCompatApi21$Callback)>
	//    3    5:return          
	}
}
