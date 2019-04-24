// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.media.session.MediaSession;

class MediaSessionCompatApi26
{
	public static interface Callback
		extends MediaSessionCompatApi24.Callback
	{

		public abstract void onSetRepeatMode(int i);

		public abstract void onSetShuffleModeEnabled(boolean flag);
	}

	static class CallbackProxy extends MediaSessionCompatApi24.CallbackProxy
	{

		public void onSetRepeatMode(int i)
		{
			((Callback)mCallback).onSetRepeatMode(i);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field MediaSessionCompatApi21$Callback mCallback>
		//    2    4:checkcast       #24  <Class MediaSessionCompatApi26$Callback>
		//    3    7:iload_1         
		//    4    8:invokeinterface #26  <Method void MediaSessionCompatApi26$Callback.onSetRepeatMode(int)>
		//    5   13:return          
		}

		public void onSetShuffleModeEnabled(boolean flag)
		{
			((Callback)mCallback).onSetShuffleModeEnabled(flag);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field MediaSessionCompatApi21$Callback mCallback>
		//    2    4:checkcast       #24  <Class MediaSessionCompatApi26$Callback>
		//    3    7:iload_1         
		//    4    8:invokeinterface #30  <Method void MediaSessionCompatApi26$Callback.onSetShuffleModeEnabled(boolean)>
		//    5   13:return          
		}

		CallbackProxy(Callback callback)
		{
			super(((MediaSessionCompatApi24.Callback) (callback)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #13  <Method void MediaSessionCompatApi24$CallbackProxy(MediaSessionCompatApi24$Callback)>
		//    3    5:return          
		}
	}


	MediaSessionCompatApi26()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static Object createCallback(Callback callback)
	{
		return ((Object) (new CallbackProxy(callback)));
	//    0    0:new             #9   <Class MediaSessionCompatApi26$CallbackProxy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void MediaSessionCompatApi26$CallbackProxy(MediaSessionCompatApi26$Callback)>
	//    4    8:areturn         
	}

	public static void setRepeatMode(Object obj, int i)
	{
		((MediaSession)obj).setRepeatMode(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #24  <Class MediaSession>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #27  <Method void MediaSession.setRepeatMode(int)>
	//    4    8:return          
	}

	public static void setShuffleModeEnabled(Object obj, boolean flag)
	{
		((MediaSession)obj).setShuffleModeEnabled(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #24  <Class MediaSession>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #32  <Method void MediaSession.setShuffleModeEnabled(boolean)>
	//    4    8:return          
	}
}
