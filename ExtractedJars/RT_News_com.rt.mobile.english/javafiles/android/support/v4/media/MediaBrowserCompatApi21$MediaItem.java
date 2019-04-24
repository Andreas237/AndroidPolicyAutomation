// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;


// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompatApi21

static class MediaBrowserCompatApi21$MediaItem
{

	public static Object getDescription(Object obj)
	{
		return ((Object) (((android.media.browse.MediaBrowser.MediaItem)obj).getDescription()));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.browse.MediaBrowser$MediaItem>
	//    2    4:invokevirtual   #19  <Method android.media.MediaDescription android.media.browse.MediaBrowser$MediaItem.getDescription()>
	//    3    7:areturn         
	}

	public static int getFlags(Object obj)
	{
		return ((android.media.browse.MediaBrowser.MediaItem)obj).getFlags();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.media.browse.MediaBrowser$MediaItem>
	//    2    4:invokevirtual   #24  <Method int android.media.browse.MediaBrowser$MediaItem.getFlags()>
	//    3    7:ireturn         
	}

	MediaBrowserCompatApi21$MediaItem()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
