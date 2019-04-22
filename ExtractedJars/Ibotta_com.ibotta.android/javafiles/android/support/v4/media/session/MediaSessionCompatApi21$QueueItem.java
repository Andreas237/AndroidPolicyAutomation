// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;


// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompatApi21

static class MediaSessionCompatApi21$QueueItem
{

	public static Object getDescription(Object obj)
	{
		return ((Object) (((android.media.session.MediaSession.QueueItem)obj).getDescription()));
	//    0    0:aload_0         
	//    1    1:checkcast       #11  <Class android.media.session.MediaSession$QueueItem>
	//    2    4:invokevirtual   #14  <Method android.media.MediaDescription android.media.session.MediaSession$QueueItem.getDescription()>
	//    3    7:areturn         
	}

	public static long getQueueId(Object obj)
	{
		return ((android.media.session.MediaSession.QueueItem)obj).getQueueId();
	//    0    0:aload_0         
	//    1    1:checkcast       #11  <Class android.media.session.MediaSession$QueueItem>
	//    2    4:invokevirtual   #20  <Method long android.media.session.MediaSession$QueueItem.getQueueId()>
	//    3    7:lreturn         
	}
}
