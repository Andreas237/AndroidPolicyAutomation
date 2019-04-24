// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.media.Rating;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompatApi21

public static class MediaControllerCompatApi21$TransportControls
{

	public static void fastForward(Object obj)
	{
		((android.media.session.MediaController.TransportControls)obj).fastForward();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
	//    2    4:invokevirtual   #18  <Method void android.media.session.MediaController$TransportControls.fastForward()>
	//    3    7:return          
	}

	public static void pause(Object obj)
	{
		((android.media.session.MediaController.TransportControls)obj).pause();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
	//    2    4:invokevirtual   #21  <Method void android.media.session.MediaController$TransportControls.pause()>
	//    3    7:return          
	}

	public static void play(Object obj)
	{
		((android.media.session.MediaController.TransportControls)obj).play();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
	//    2    4:invokevirtual   #24  <Method void android.media.session.MediaController$TransportControls.play()>
	//    3    7:return          
	}

	public static void playFromMediaId(Object obj, String s, Bundle bundle)
	{
		((android.media.session.MediaController.TransportControls)obj).playFromMediaId(s, bundle);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #29  <Method void android.media.session.MediaController$TransportControls.playFromMediaId(String, Bundle)>
	//    5    9:return          
	}

	public static void playFromSearch(Object obj, String s, Bundle bundle)
	{
		((android.media.session.MediaController.TransportControls)obj).playFromSearch(s, bundle);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #32  <Method void android.media.session.MediaController$TransportControls.playFromSearch(String, Bundle)>
	//    5    9:return          
	}

	public static void rewind(Object obj)
	{
		((android.media.session.MediaController.TransportControls)obj).rewind();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
	//    2    4:invokevirtual   #35  <Method void android.media.session.MediaController$TransportControls.rewind()>
	//    3    7:return          
	}

	public static void seekTo(Object obj, long l)
	{
		((android.media.session.MediaController.TransportControls)obj).seekTo(l);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #40  <Method void android.media.session.MediaController$TransportControls.seekTo(long)>
	//    4    8:return          
	}

	public static void sendCustomAction(Object obj, String s, Bundle bundle)
	{
		((android.media.session.MediaController.TransportControls)obj).sendCustomAction(s, bundle);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #43  <Method void android.media.session.MediaController$TransportControls.sendCustomAction(String, Bundle)>
	//    5    9:return          
	}

	public static void setRating(Object obj, Object obj1)
	{
		((android.media.session.MediaController.TransportControls)obj).setRating((Rating)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
	//    2    4:aload_1         
	//    3    5:checkcast       #47  <Class Rating>
	//    4    8:invokevirtual   #50  <Method void android.media.session.MediaController$TransportControls.setRating(Rating)>
	//    5   11:return          
	}

	public static void skipToNext(Object obj)
	{
		((android.media.session.MediaController.TransportControls)obj).skipToNext();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
	//    2    4:invokevirtual   #53  <Method void android.media.session.MediaController$TransportControls.skipToNext()>
	//    3    7:return          
	}

	public static void skipToPrevious(Object obj)
	{
		((android.media.session.MediaController.TransportControls)obj).skipToPrevious();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
	//    2    4:invokevirtual   #56  <Method void android.media.session.MediaController$TransportControls.skipToPrevious()>
	//    3    7:return          
	}

	public static void skipToQueueItem(Object obj, long l)
	{
		((android.media.session.MediaController.TransportControls)obj).skipToQueueItem(l);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #59  <Method void android.media.session.MediaController$TransportControls.skipToQueueItem(long)>
	//    4    8:return          
	}

	public static void stop(Object obj)
	{
		((android.media.session.MediaController.TransportControls)obj).stop();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.session.MediaController$TransportControls>
	//    2    4:invokevirtual   #62  <Method void android.media.session.MediaController$TransportControls.stop()>
	//    3    7:return          
	}

	public MediaControllerCompatApi21$TransportControls()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
