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

class MediaBrowserServiceCompat$d$9
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
	//*  13   29:ifnonnull       83
		{
			obj = ((Object) (new StringBuilder()));
	//   14   32:new             #60  <Class StringBuilder>
	//   15   35:dup             
	//   16   36:invokespecial   #61  <Method void StringBuilder()>
	//   17   39:astore_1        
			((StringBuilder) (obj)).append("sendCustomAction for callback that isn't registered action=");
	//   18   40:aload_1         
	//   19   41:ldc1            #63  <String "sendCustomAction for callback that isn't registered action=">
	//   20   43:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   21   46:pop             
			((StringBuilder) (obj)).append(b);
	//   22   47:aload_1         
	//   23   48:aload_0         
	//   24   49:getfield        #30  <Field String b>
	//   25   52:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   26   55:pop             
			((StringBuilder) (obj)).append(", extras=");
	//   27   56:aload_1         
	//   28   57:ldc1            #69  <String ", extras=">
	//   29   59:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   30   62:pop             
			((StringBuilder) (obj)).append(((Object) (c)));
	//   31   63:aload_1         
	//   32   64:aload_0         
	//   33   65:getfield        #32  <Field Bundle c>
	//   34   68:invokevirtual   #72  <Method StringBuilder StringBuilder.append(Object)>
	//   35   71:pop             
			Log.w("MBServiceCompat", ((StringBuilder) (obj)).toString());
	//   36   72:ldc1            #74  <String "MBServiceCompat">
	//   37   74:aload_1         
	//   38   75:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   39   78:invokestatic    #84  <Method int Log.w(String, String)>
	//   40   81:pop             
			return;
	//   41   82:return          
		} else
		{
			e.a.b(b, c, ((MediaBrowserServiceCompat.b) (obj)), d);
	//   42   83:aload_0         
	//   43   84:getfield        #26  <Field MediaBrowserServiceCompat$d e>
	//   44   87:getfield        #47  <Field MediaBrowserServiceCompat android.support.v4.media.MediaBrowserServiceCompat$d.a>
	//   45   90:aload_0         
	//   46   91:getfield        #30  <Field String b>
	//   47   94:aload_0         
	//   48   95:getfield        #32  <Field Bundle c>
	//   49   98:aload_1         
	//   50   99:aload_0         
	//   51  100:getfield        #34  <Field ResultReceiver d>
	//   52  103:invokevirtual   #87  <Method void MediaBrowserServiceCompat.b(String, Bundle, MediaBrowserServiceCompat$b, ResultReceiver)>
			return;
	//   53  106:return          
		}
	}

	final MediaBrowserServiceCompat.e a;
	final String b;
	final Bundle c;
	final ResultReceiver d;
	final MediaBrowserServiceCompat.d e;

	MediaBrowserServiceCompat$d$9(MediaBrowserServiceCompat.d d1, MediaBrowserServiceCompat.e e1, String s, Bundle bundle, ResultReceiver resultreceiver)
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
