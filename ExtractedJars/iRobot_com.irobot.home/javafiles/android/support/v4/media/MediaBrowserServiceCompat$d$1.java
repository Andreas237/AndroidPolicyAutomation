// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.f.a;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$d$1
	implements Runnable
{

	public void run()
	{
		RemoteException remoteexception;
		RemoteException remoteexception1;
		Object obj = ((Object) (a.a()));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field MediaBrowserServiceCompat$e a>
	//    2    4:invokeinterface #46  <Method android.os.IBinder android.support.v4.media.MediaBrowserServiceCompat$e.a()>
	//    3    9:astore_1        
		e.a.b.remove(obj);
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field MediaBrowserServiceCompat$d e>
	//    6   14:getfield        #49  <Field MediaBrowserServiceCompat android.support.v4.media.MediaBrowserServiceCompat$d.a>
	//    7   17:getfield        #52  <Field a MediaBrowserServiceCompat.b>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #58  <Method Object a.remove(Object)>
	//   10   24:pop             
		Object obj1 = ((Object) (new MediaBrowserServiceCompat.b()));
	//   11   25:new             #60  <Class MediaBrowserServiceCompat$b>
	//   12   28:dup             
	//   13   29:invokespecial   #61  <Method void MediaBrowserServiceCompat$b()>
	//   14   32:astore_2        
		obj1.a = b;
	//   15   33:aload_2         
	//   16   34:aload_0         
	//   17   35:getfield        #30  <Field String b>
	//   18   38:putfield        #63  <Field String android.support.v4.media.MediaBrowserServiceCompat$b.a>
		obj1.b = c;
	//   19   41:aload_2         
	//   20   42:aload_0         
	//   21   43:getfield        #32  <Field Bundle c>
	//   22   46:putfield        #65  <Field Bundle MediaBrowserServiceCompat$b.b>
		obj1.c = a;
	//   23   49:aload_2         
	//   24   50:aload_0         
	//   25   51:getfield        #28  <Field MediaBrowserServiceCompat$e a>
	//   26   54:putfield        #67  <Field MediaBrowserServiceCompat$e MediaBrowserServiceCompat$b.c>
		obj1.d = e.a.a(b, d, c);
	//   27   57:aload_2         
	//   28   58:aload_0         
	//   29   59:getfield        #26  <Field MediaBrowserServiceCompat$d e>
	//   30   62:getfield        #49  <Field MediaBrowserServiceCompat android.support.v4.media.MediaBrowserServiceCompat$d.a>
	//   31   65:aload_0         
	//   32   66:getfield        #30  <Field String b>
	//   33   69:aload_0         
	//   34   70:getfield        #34  <Field int d>
	//   35   73:aload_0         
	//   36   74:getfield        #32  <Field Bundle c>
	//   37   77:invokevirtual   #70  <Method MediaBrowserServiceCompat$a android.support.v4.media.MediaBrowserServiceCompat.a(String, int, Bundle)>
	//   38   80:putfield        #73  <Field MediaBrowserServiceCompat$a MediaBrowserServiceCompat$b.d>
		if(((MediaBrowserServiceCompat.b) (obj1)).d == null)
	//*  39   83:aload_2         
	//*  40   84:getfield        #73  <Field MediaBrowserServiceCompat$a MediaBrowserServiceCompat$b.d>
	//*  41   87:ifnonnull       188
		{
			obj = ((Object) (new StringBuilder()));
	//   42   90:new             #75  <Class StringBuilder>
	//   43   93:dup             
	//   44   94:invokespecial   #76  <Method void StringBuilder()>
	//   45   97:astore_1        
			((StringBuilder) (obj)).append("No root for client ");
	//   46   98:aload_1         
	//   47   99:ldc1            #78  <String "No root for client ">
	//   48  101:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   49  104:pop             
			((StringBuilder) (obj)).append(b);
	//   50  105:aload_1         
	//   51  106:aload_0         
	//   52  107:getfield        #30  <Field String b>
	//   53  110:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   54  113:pop             
			((StringBuilder) (obj)).append(" from service ");
	//   55  114:aload_1         
	//   56  115:ldc1            #84  <String " from service ">
	//   57  117:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   58  120:pop             
			((StringBuilder) (obj)).append(((Object)this).getClass().getName());
	//   59  121:aload_1         
	//   60  122:aload_0         
	//   61  123:invokevirtual   #88  <Method Class Object.getClass()>
	//   62  126:invokevirtual   #94  <Method String Class.getName()>
	//   63  129:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   64  132:pop             
			Log.i("MBServiceCompat", ((StringBuilder) (obj)).toString());
	//   65  133:ldc1            #96  <String "MBServiceCompat">
	//   66  135:aload_1         
	//   67  136:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   68  139:invokestatic    #105 <Method int Log.i(String, String)>
	//   69  142:pop             
			try
			{
				a.b();
	//   70  143:aload_0         
	//   71  144:getfield        #28  <Field MediaBrowserServiceCompat$e a>
	//   72  147:invokeinterface #107 <Method void MediaBrowserServiceCompat$e.b()>
				return;
	//   73  152:return          
			}
	//*  74  153:new             #75  <Class StringBuilder>
	//*  75  156:dup             
	//*  76  157:invokespecial   #76  <Method void StringBuilder()>
	//*  77  160:astore_1        
	//*  78  161:aload_1         
	//*  79  162:ldc1            #109 <String "Calling onConnectFailed() failed. Ignoring. pkg=">
	//*  80  164:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//*  81  167:pop             
	//*  82  168:aload_1         
	//*  83  169:aload_0         
	//*  84  170:getfield        #30  <Field String b>
	//*  85  173:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//*  86  176:pop             
	//*  87  177:ldc1            #96  <String "MBServiceCompat">
	//*  88  179:aload_1         
	//*  89  180:invokevirtual   #99  <Method String StringBuilder.toString()>
	//*  90  183:invokestatic    #112 <Method int Log.w(String, String)>
	//*  91  186:pop             
	//*  92  187:return          
	//*  93  188:aload_0         
	//*  94  189:getfield        #26  <Field MediaBrowserServiceCompat$d e>
	//*  95  192:getfield        #49  <Field MediaBrowserServiceCompat android.support.v4.media.MediaBrowserServiceCompat$d.a>
	//*  96  195:getfield        #52  <Field a MediaBrowserServiceCompat.b>
	//*  97  198:aload_1         
	//*  98  199:aload_2         
	//*  99  200:invokevirtual   #116 <Method Object a.put(Object, Object)>
	//* 100  203:pop             
	//* 101  204:aload_0         
	//* 102  205:getfield        #26  <Field MediaBrowserServiceCompat$d e>
	//* 103  208:getfield        #49  <Field MediaBrowserServiceCompat android.support.v4.media.MediaBrowserServiceCompat$d.a>
	//* 104  211:getfield        #119 <Field android.support.v4.media.session.MediaSessionCompat$Token MediaBrowserServiceCompat.e>
	//* 105  214:ifnull          300
	//* 106  217:aload_0         
	//* 107  218:getfield        #28  <Field MediaBrowserServiceCompat$e a>
	//* 108  221:aload_2         
	//* 109  222:getfield        #73  <Field MediaBrowserServiceCompat$a MediaBrowserServiceCompat$b.d>
	//* 110  225:invokevirtual   #123 <Method String android.support.v4.media.MediaBrowserServiceCompat$a.a()>
	//* 111  228:aload_0         
	//* 112  229:getfield        #26  <Field MediaBrowserServiceCompat$d e>
	//* 113  232:getfield        #49  <Field MediaBrowserServiceCompat android.support.v4.media.MediaBrowserServiceCompat$d.a>
	//* 114  235:getfield        #119 <Field android.support.v4.media.session.MediaSessionCompat$Token MediaBrowserServiceCompat.e>
	//* 115  238:aload_2         
	//* 116  239:getfield        #73  <Field MediaBrowserServiceCompat$a MediaBrowserServiceCompat$b.d>
	//* 117  242:invokevirtual   #126 <Method Bundle MediaBrowserServiceCompat$a.b()>
	//* 118  245:invokeinterface #129 <Method void android.support.v4.media.MediaBrowserServiceCompat$e.a(String, android.support.v4.media.session.MediaSessionCompat$Token, Bundle)>
	//* 119  250:return          
	//* 120  251:new             #75  <Class StringBuilder>
	//* 121  254:dup             
	//* 122  255:invokespecial   #76  <Method void StringBuilder()>
	//* 123  258:astore_2        
	//* 124  259:aload_2         
	//* 125  260:ldc1            #131 <String "Calling onConnect() failed. Dropping client. pkg=">
	//* 126  262:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//* 127  265:pop             
	//* 128  266:aload_2         
	//* 129  267:aload_0         
	//* 130  268:getfield        #30  <Field String b>
	//* 131  271:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//* 132  274:pop             
	//* 133  275:ldc1            #96  <String "MBServiceCompat">
	//* 134  277:aload_2         
	//* 135  278:invokevirtual   #99  <Method String StringBuilder.toString()>
	//* 136  281:invokestatic    #112 <Method int Log.w(String, String)>
	//* 137  284:pop             
	//* 138  285:aload_0         
	//* 139  286:getfield        #26  <Field MediaBrowserServiceCompat$d e>
	//* 140  289:getfield        #49  <Field MediaBrowserServiceCompat android.support.v4.media.MediaBrowserServiceCompat$d.a>
	//* 141  292:getfield        #52  <Field a MediaBrowserServiceCompat.b>
	//* 142  295:aload_1         
	//* 143  296:invokevirtual   #58  <Method Object a.remove(Object)>
	//* 144  299:pop             
	//* 145  300:return          
			// Misplaced declaration of an exception variable
			catch(RemoteException remoteexception)
			{
				obj = ((Object) (new StringBuilder()));
			}
			((StringBuilder) (obj)).append("Calling onConnectFailed() failed. Ignoring. pkg=");
			((StringBuilder) (obj)).append(b);
			Log.w("MBServiceCompat", ((StringBuilder) (obj)).toString());
			return;
		}
		try
		{
			e.a.b.put(obj, obj1);
			if(e.a.e != null)
			{
				a.a(((MediaBrowserServiceCompat.b) (obj1)).d.a(), e.a.e, ((MediaBrowserServiceCompat.b) (obj1)).d.b());
				return;
			}
		}
	//* 146  301:astore_1        
	//* 147  302:goto            153
		// Misplaced declaration of an exception variable
		catch(RemoteException remoteexception1)
		{
			obj1 = ((Object) (new StringBuilder()));
			((StringBuilder) (obj1)).append("Calling onConnect() failed. Dropping client. pkg=");
			((StringBuilder) (obj1)).append(b);
			Log.w("MBServiceCompat", ((StringBuilder) (obj1)).toString());
			e.a.b.remove(obj);
		}
	//* 148  305:astore_2        
	//* 149  306:goto            251
	}

	final MediaBrowserServiceCompat.e a;
	final String b;
	final Bundle c;
	final int d;
	final MediaBrowserServiceCompat.d e;

	MediaBrowserServiceCompat$d$1(MediaBrowserServiceCompat.d d1, MediaBrowserServiceCompat.e e1, String s, Bundle bundle, int i)
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
		d = i;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #34  <Field int d>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #37  <Method void Object()>
	//   17   31:return          
	}
}
