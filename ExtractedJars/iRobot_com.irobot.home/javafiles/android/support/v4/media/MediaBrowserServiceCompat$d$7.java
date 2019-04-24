// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.support.v4.f.a;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$d$7
	implements Runnable
{

	public void run()
	{
		android.os.IBinder ibinder = a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MediaBrowserServiceCompat$e a>
	//    2    4:invokeinterface #33  <Method android.os.IBinder android.support.v4.media.MediaBrowserServiceCompat$e.a()>
	//    3    9:astore_1        
		b.a.b.remove(((Object) (ibinder)));
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field MediaBrowserServiceCompat$d b>
	//    6   14:getfield        #36  <Field MediaBrowserServiceCompat android.support.v4.media.MediaBrowserServiceCompat$d.a>
	//    7   17:getfield        #39  <Field a MediaBrowserServiceCompat.b>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #45  <Method Object a.remove(Object)>
	//   10   24:pop             
	//   11   25:return          
	}

	final MediaBrowserServiceCompat.e a;
	final MediaBrowserServiceCompat.d b;

	MediaBrowserServiceCompat$d$7(MediaBrowserServiceCompat.d d1, MediaBrowserServiceCompat.e e)
	{
		b = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field MediaBrowserServiceCompat$d b>
		a = e;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field MediaBrowserServiceCompat$e a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
	//    8   14:return          
	}
}
