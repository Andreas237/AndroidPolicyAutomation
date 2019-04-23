// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.media.MediaDescription;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompatApi21

static class MediaSessionCompatApi21$QueueItem
{

	public static Object createItem(Object obj, long l)
	{
		return ((Object) (new android.media.session.MediaSession.QueueItem((MediaDescription)obj, l)));
	//    0    0:new             #16  <Class android.media.session.MediaSession$QueueItem>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:checkcast       #18  <Class MediaDescription>
	//    4    8:lload_1         
	//    5    9:invokespecial   #21  <Method void android.media.session.MediaSession$QueueItem(MediaDescription, long)>
	//    6   12:areturn         
	}

	public static Object getDescription(Object obj)
	{
		return ((Object) (((android.media.session.MediaSession.QueueItem)obj).getDescription()));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.session.MediaSession$QueueItem>
	//    2    4:invokevirtual   #26  <Method MediaDescription android.media.session.MediaSession$QueueItem.getDescription()>
	//    3    7:areturn         
	}

	public static long getQueueId(Object obj)
	{
		return ((android.media.session.MediaSession.QueueItem)obj).getQueueId();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.session.MediaSession$QueueItem>
	//    2    4:invokevirtual   #31  <Method long android.media.session.MediaSession$QueueItem.getQueueId()>
	//    3    7:lreturn         
	}

	private MediaSessionCompatApi21$QueueItem()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
