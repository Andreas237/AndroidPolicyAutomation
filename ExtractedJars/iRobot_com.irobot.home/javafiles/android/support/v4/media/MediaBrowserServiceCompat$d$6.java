// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.f.a;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$d$6
	implements Runnable
{

	public void run()
	{
		android.os.IBinder ibinder = a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field MediaBrowserServiceCompat$e a>
	//    2    4:invokeinterface #37  <Method android.os.IBinder android.support.v4.media.MediaBrowserServiceCompat$e.a()>
	//    3    9:astore_1        
		c.a.b.remove(((Object) (ibinder)));
	//    4   10:aload_0         
	//    5   11:getfield        #23  <Field MediaBrowserServiceCompat$d c>
	//    6   14:getfield        #40  <Field MediaBrowserServiceCompat android.support.v4.media.MediaBrowserServiceCompat$d.a>
	//    7   17:getfield        #43  <Field a MediaBrowserServiceCompat.b>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #49  <Method Object a.remove(Object)>
	//   10   24:pop             
		MediaBrowserServiceCompat.b b1 = new MediaBrowserServiceCompat.b();
	//   11   25:new             #51  <Class MediaBrowserServiceCompat$b>
	//   12   28:dup             
	//   13   29:invokespecial   #52  <Method void MediaBrowserServiceCompat$b()>
	//   14   32:astore_2        
		b1.c = a;
	//   15   33:aload_2         
	//   16   34:aload_0         
	//   17   35:getfield        #25  <Field MediaBrowserServiceCompat$e a>
	//   18   38:putfield        #54  <Field MediaBrowserServiceCompat$e MediaBrowserServiceCompat$b.c>
		b1.b = b;
	//   19   41:aload_2         
	//   20   42:aload_0         
	//   21   43:getfield        #27  <Field Bundle b>
	//   22   46:putfield        #55  <Field Bundle MediaBrowserServiceCompat$b.b>
		c.a.b.put(((Object) (ibinder)), ((Object) (b1)));
	//   23   49:aload_0         
	//   24   50:getfield        #23  <Field MediaBrowserServiceCompat$d c>
	//   25   53:getfield        #40  <Field MediaBrowserServiceCompat android.support.v4.media.MediaBrowserServiceCompat$d.a>
	//   26   56:getfield        #43  <Field a MediaBrowserServiceCompat.b>
	//   27   59:aload_1         
	//   28   60:aload_2         
	//   29   61:invokevirtual   #59  <Method Object a.put(Object, Object)>
	//   30   64:pop             
	//   31   65:return          
	}

	final MediaBrowserServiceCompat.e a;
	final Bundle b;
	final MediaBrowserServiceCompat.d c;

	MediaBrowserServiceCompat$d$6(MediaBrowserServiceCompat.d d1, MediaBrowserServiceCompat.e e, Bundle bundle)
	{
		c = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field MediaBrowserServiceCompat$d c>
		a = e;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field MediaBrowserServiceCompat$e a>
		b = bundle;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field Bundle b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #30  <Method void Object()>
	//   11   19:return          
	}
}
