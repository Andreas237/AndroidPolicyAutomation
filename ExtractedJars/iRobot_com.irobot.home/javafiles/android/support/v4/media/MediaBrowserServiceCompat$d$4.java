// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.IBinder;
import android.support.v4.f.a;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$d$4
	implements Runnable
{

	public void run()
	{
		Object obj = ((Object) (a.a()));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field MediaBrowserServiceCompat$e a>
	//    2    4:invokeinterface #40  <Method IBinder android.support.v4.media.MediaBrowserServiceCompat$e.a()>
	//    3    9:astore_1        
		obj = ((Object) ((MediaBrowserServiceCompat.b)d.a.b.get(obj)));
	//    4   10:aload_0         
	//    5   11:getfield        #24  <Field MediaBrowserServiceCompat$d d>
	//    6   14:getfield        #43  <Field MediaBrowserServiceCompat android.support.v4.media.MediaBrowserServiceCompat$d.a>
	//    7   17:getfield        #46  <Field a MediaBrowserServiceCompat.b>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #52  <Method Object a.get(Object)>
	//   10   24:checkcast       #54  <Class MediaBrowserServiceCompat$b>
	//   11   27:astore_1        
		if(obj == null)
	//*  12   28:aload_1         
	//*  13   29:ifnonnull       67
		{
			obj = ((Object) (new StringBuilder()));
	//   14   32:new             #56  <Class StringBuilder>
	//   15   35:dup             
	//   16   36:invokespecial   #57  <Method void StringBuilder()>
	//   17   39:astore_1        
			((StringBuilder) (obj)).append("removeSubscription for callback that isn't registered id=");
	//   18   40:aload_1         
	//   19   41:ldc1            #59  <String "removeSubscription for callback that isn't registered id=">
	//   20   43:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   21   46:pop             
			((StringBuilder) (obj)).append(b);
	//   22   47:aload_1         
	//   23   48:aload_0         
	//   24   49:getfield        #28  <Field String b>
	//   25   52:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   26   55:pop             
			Log.w("MBServiceCompat", ((StringBuilder) (obj)).toString());
	//   27   56:ldc1            #65  <String "MBServiceCompat">
	//   28   58:aload_1         
	//   29   59:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   30   62:invokestatic    #75  <Method int Log.w(String, String)>
	//   31   65:pop             
			return;
	//   32   66:return          
		}
		if(!d.a.a(b, ((MediaBrowserServiceCompat.b) (obj)), c))
	//*  33   67:aload_0         
	//*  34   68:getfield        #24  <Field MediaBrowserServiceCompat$d d>
	//*  35   71:getfield        #43  <Field MediaBrowserServiceCompat android.support.v4.media.MediaBrowserServiceCompat$d.a>
	//*  36   74:aload_0         
	//*  37   75:getfield        #28  <Field String b>
	//*  38   78:aload_1         
	//*  39   79:aload_0         
	//*  40   80:getfield        #30  <Field IBinder c>
	//*  41   83:invokevirtual   #78  <Method boolean android.support.v4.media.MediaBrowserServiceCompat.a(String, MediaBrowserServiceCompat$b, IBinder)>
	//*  42   86:ifne            130
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   43   89:new             #56  <Class StringBuilder>
	//   44   92:dup             
	//   45   93:invokespecial   #57  <Method void StringBuilder()>
	//   46   96:astore_1        
			stringbuilder.append("removeSubscription called for ");
	//   47   97:aload_1         
	//   48   98:ldc1            #80  <String "removeSubscription called for ">
	//   49  100:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   50  103:pop             
			stringbuilder.append(b);
	//   51  104:aload_1         
	//   52  105:aload_0         
	//   53  106:getfield        #28  <Field String b>
	//   54  109:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   55  112:pop             
			stringbuilder.append(" which is not subscribed");
	//   56  113:aload_1         
	//   57  114:ldc1            #82  <String " which is not subscribed">
	//   58  116:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   59  119:pop             
			Log.w("MBServiceCompat", stringbuilder.toString());
	//   60  120:ldc1            #65  <String "MBServiceCompat">
	//   61  122:aload_1         
	//   62  123:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   63  126:invokestatic    #75  <Method int Log.w(String, String)>
	//   64  129:pop             
		}
	//   65  130:return          
	}

	final MediaBrowserServiceCompat.e a;
	final String b;
	final IBinder c;
	final MediaBrowserServiceCompat.d d;

	MediaBrowserServiceCompat$d$4(MediaBrowserServiceCompat.d d1, MediaBrowserServiceCompat.e e, String s, IBinder ibinder)
	{
		d = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field MediaBrowserServiceCompat$d d>
		a = e;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field MediaBrowserServiceCompat$e a>
		b = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field String b>
		c = ibinder;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field IBinder c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #33  <Method void Object()>
	//   14   25:return          
	}
}
