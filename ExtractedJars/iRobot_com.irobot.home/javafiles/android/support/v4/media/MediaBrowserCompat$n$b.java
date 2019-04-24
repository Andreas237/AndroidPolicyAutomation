// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

private class MediaBrowserCompat$n$b extends MediaBrowserCompat$n$a
	implements b.a
{

	public void a(String s, Bundle bundle)
	{
		b.a(s, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MediaBrowserCompat$n b>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #24  <Method void MediaBrowserCompat$n.a(String, Bundle)>
	//    5    9:return          
	}

	public void a(String s, List list, Bundle bundle)
	{
		b.a(s, aItem.a(list), bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MediaBrowserCompat$n b>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #30  <Method List MediaBrowserCompat$MediaItem.a(List)>
	//    5    9:aload_3         
	//    6   10:invokevirtual   #32  <Method void MediaBrowserCompat$n.a(String, List, Bundle)>
	//    7   13:return          
	}

	final MediaBrowserCompat.n b;

	MediaBrowserCompat$n$b(MediaBrowserCompat.n n1)
	{
		b = n1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MediaBrowserCompat$n b>
		super(n1);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #19  <Method void MediaBrowserCompat$n$a(MediaBrowserCompat$n)>
	//    6   10:return          
	}
}
