// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$4 extends MediaBrowserServiceCompat$c
{

	void a(Bundle bundle)
	{
		a.b(0, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ResultReceiver a>
	//    2    4:iconst_0        
	//    3    5:aload_1         
	//    4    6:invokevirtual   #29  <Method void ResultReceiver.b(int, Bundle)>
	//    5    9:return          
	}

	volatile void a(Object obj)
	{
		a((Bundle)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #31  <Class Bundle>
	//    3    5:invokevirtual   #33  <Method void a(Bundle)>
	//    4    8:return          
	}

	void b(Bundle bundle)
	{
		a.b(-1, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ResultReceiver a>
	//    2    4:iconst_m1       
	//    3    5:aload_1         
	//    4    6:invokevirtual   #29  <Method void ResultReceiver.b(int, Bundle)>
	//    5    9:return          
	}

	final ResultReceiver a;
	final MediaBrowserServiceCompat b;

	MediaBrowserServiceCompat$4(MediaBrowserServiceCompat mediabrowserservicecompat, Object obj, ResultReceiver resultreceiver)
	{
		b = mediabrowserservicecompat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MediaBrowserServiceCompat b>
		a = resultreceiver;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #19  <Field ResultReceiver a>
		super(obj);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #22  <Method void MediaBrowserServiceCompat$c(Object)>
	//    9   15:return          
	}
}
