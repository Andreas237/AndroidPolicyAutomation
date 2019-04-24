// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.media.session.MediaController;

class MediaControllerCompatApi26
{
	public static interface Callback
		extends MediaControllerCompatApi21.Callback
	{

		public abstract void onRepeatModeChanged(int i);

		public abstract void onShuffleModeChanged(boolean flag);
	}

	static class CallbackProxy extends MediaControllerCompatApi21.CallbackProxy
	{

		public void onRepeatModeChanged(int i)
		{
			((Callback)mCallback).onRepeatModeChanged(i);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field MediaControllerCompatApi21$Callback mCallback>
		//    2    4:checkcast       #24  <Class MediaControllerCompatApi26$Callback>
		//    3    7:iload_1         
		//    4    8:invokeinterface #26  <Method void MediaControllerCompatApi26$Callback.onRepeatModeChanged(int)>
		//    5   13:return          
		}

		public void onShuffleModeChanged(boolean flag)
		{
			((Callback)mCallback).onShuffleModeChanged(flag);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field MediaControllerCompatApi21$Callback mCallback>
		//    2    4:checkcast       #24  <Class MediaControllerCompatApi26$Callback>
		//    3    7:iload_1         
		//    4    8:invokeinterface #30  <Method void MediaControllerCompatApi26$Callback.onShuffleModeChanged(boolean)>
		//    5   13:return          
		}

		CallbackProxy(Callback callback)
		{
			super(((MediaControllerCompatApi21.Callback) (callback)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #13  <Method void MediaControllerCompatApi21$CallbackProxy(MediaControllerCompatApi21$Callback)>
		//    3    5:return          
		}
	}

	public static class TransportControls extends MediaControllerCompatApi23.TransportControls
	{

		public static void setRepeatMode(Object obj, int i)
		{
			((android.media.session.MediaController.TransportControls)obj).setRepeatMode(i);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #19  <Method void android.media.session.MediaController$TransportControls.setRepeatMode(int)>
		//    4    8:return          
		}

		public static void setShuffleModeEnabled(Object obj, boolean flag)
		{
			((android.media.session.MediaController.TransportControls)obj).setShuffleModeEnabled(flag);
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #24  <Method void android.media.session.MediaController$TransportControls.setShuffleModeEnabled(boolean)>
		//    4    8:return          
		}

		public TransportControls()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void MediaControllerCompatApi23$TransportControls()>
		//    2    4:return          
		}
	}


	MediaControllerCompatApi26()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static Object createCallback(Callback callback)
	{
		return ((Object) (new CallbackProxy(callback)));
	//    0    0:new             #9   <Class MediaControllerCompatApi26$CallbackProxy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #23  <Method void MediaControllerCompatApi26$CallbackProxy(MediaControllerCompatApi26$Callback)>
	//    4    8:areturn         
	}

	public static int getRepeatMode(Object obj)
	{
		return ((MediaController)obj).getRepeatMode();
	//    0    0:aload_0         
	//    1    1:checkcast       #27  <Class MediaController>
	//    2    4:invokevirtual   #30  <Method int MediaController.getRepeatMode()>
	//    3    7:ireturn         
	}

	public static boolean isShuffleModeEnabled(Object obj)
	{
		return ((MediaController)obj).isShuffleModeEnabled();
	//    0    0:aload_0         
	//    1    1:checkcast       #27  <Class MediaController>
	//    2    4:invokevirtual   #35  <Method boolean MediaController.isShuffleModeEnabled()>
	//    3    7:ireturn         
	}
}
