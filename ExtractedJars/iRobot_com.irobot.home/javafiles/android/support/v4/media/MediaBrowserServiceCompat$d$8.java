// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.f.a;
import android.support.v4.os.ResultReceiver;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$d$8
	implements Runnable
{

	public void run()
	{
		Object obj = ((Object) (a.a()));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field MediaBrowserServiceCompat$e a>
	//    2    4:invokeinterface #44  <Method android.os.IBinder android.support.v4.media.MediaBrowserServiceCompat$e.a()>
	//    3    9:astore_1        
		obj = ((Object) ((MediaBrowserServiceCompat.b)e.a.b.get(obj)));
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field MediaBrowserServiceCompat$d e>
	//    6   14:getfield        #47  <Field MediaBrowserServiceCompat android.support.v4.media.MediaBrowserServiceCompat$d.a>
	//    7   17:getfield        #50  <Field a MediaBrowserServiceCompat.b>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #56  <Method Object a.get(Object)>
	//   10   24:checkcast       #58  <Class MediaBrowserServiceCompat$b>
	//   11   27:astore_1        
		if(obj == null)
	//*  12   28:aload_1         
	//*  13   29:ifnonnull       67
		{
			obj = ((Object) (new StringBuilder()));
	//   14   32:new             #60  <Class StringBuilder>
	//   15   35:dup             
	//   16   36:invokespecial   #61  <Method void StringBuilder()>
	//   17   39:astore_1        
			((StringBuilder) (obj)).append("search for callback that isn't registered query=");
	//   18   40:aload_1         
	//   19   41:ldc1            #63  <String "search for callback that isn't registered query=">
	//   20   43:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   21   46:pop             
			((StringBuilder) (obj)).append(b);
	//   22   47:aload_1         
	//   23   48:aload_0         
	//   24   49:getfield        #30  <Field String b>
	//   25   52:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   26   55:pop             
			Log.w("MBServiceCompat", ((StringBuilder) (obj)).toString());
	//   27   56:ldc1            #69  <String "MBServiceCompat">
	//   28   58:aload_1         
	//   29   59:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   30   62:invokestatic    #79  <Method int Log.w(String, String)>
	//   31   65:pop             
			return;
	//   32   66:return          
		} else
		{
			e.a.a(b, c, ((MediaBrowserServiceCompat.b) (obj)), d);
	//   33   67:aload_0         
	//   34   68:getfield        #26  <Field MediaBrowserServiceCompat$d e>
	//   35   71:getfield        #47  <Field MediaBrowserServiceCompat android.support.v4.media.MediaBrowserServiceCompat$d.a>
	//   36   74:aload_0         
	//   37   75:getfield        #30  <Field String b>
	//   38   78:aload_0         
	//   39   79:getfield        #32  <Field Bundle c>
	//   40   82:aload_1         
	//   41   83:aload_0         
	//   42   84:getfield        #34  <Field ResultReceiver d>
	//   43   87:invokevirtual   #82  <Method void android.support.v4.media.MediaBrowserServiceCompat.a(String, Bundle, MediaBrowserServiceCompat$b, ResultReceiver)>
			return;
	//   44   90:return          
		}
	}

	final MediaBrowserServiceCompat.e a;
	final String b;
	final Bundle c;
	final ResultReceiver d;
	final MediaBrowserServiceCompat.d e;

	MediaBrowserServiceCompat$d$8(MediaBrowserServiceCompat.d d1, MediaBrowserServiceCompat.e e1, String s, Bundle bundle, ResultReceiver resultreceiver)
	{
		e = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field MediaBrowserServiceCompat$d e>
		a = e1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field MediaBrowserServiceCompat$e a>
		b = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field String b>
		c = bundle;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #32  <Field Bundle c>
		d = resultreceiver;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #34  <Field ResultReceiver d>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #37  <Method void Object()>
	//   17   31:return          
	}
}
