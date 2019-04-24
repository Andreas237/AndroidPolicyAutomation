// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;


// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompatApi26

public static class MediaControllerCompatApi26$TransportControls extends MediaControllerCompatApi23$TransportControls
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

	public MediaControllerCompatApi26$TransportControls()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void MediaControllerCompatApi23$TransportControls()>
	//    2    4:return          
	}
}
