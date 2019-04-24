// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;


// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompatApi26

static class MediaSessionCompatApi26$CallbackProxy extends MediaSessionCompatApi24$CallbackProxy
{

	public void onSetRepeatMode(int i)
	{
		((MediaSessionCompatApi26.Callback)mCallback).onSetRepeatMode(i);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:checkcast       #24  <Class MediaSessionCompatApi26$Callback>
	//    3    7:iload_1         
	//    4    8:invokeinterface #26  <Method void MediaSessionCompatApi26$Callback.onSetRepeatMode(int)>
	//    5   13:return          
	}

	public void onSetShuffleModeEnabled(boolean flag)
	{
		((MediaSessionCompatApi26.Callback)mCallback).onSetShuffleModeEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MediaSessionCompatApi21$Callback mCallback>
	//    2    4:checkcast       #24  <Class MediaSessionCompatApi26$Callback>
	//    3    7:iload_1         
	//    4    8:invokeinterface #30  <Method void MediaSessionCompatApi26$Callback.onSetShuffleModeEnabled(boolean)>
	//    5   13:return          
	}

	MediaSessionCompatApi26$CallbackProxy(MediaSessionCompatApi26.Callback callback)
	{
		super(((MediaSessionCompatApi24.Callback) (callback)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void MediaSessionCompatApi24$CallbackProxy(MediaSessionCompatApi24$Callback)>
	//    3    5:return          
	}
}
