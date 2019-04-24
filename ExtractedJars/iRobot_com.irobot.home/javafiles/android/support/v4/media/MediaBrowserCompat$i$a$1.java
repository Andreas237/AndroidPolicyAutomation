// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.ComponentName;
import android.os.*;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

class MediaBrowserCompat$i$a$1
	implements Runnable
{

	public void run()
	{
		RemoteException remoteexception;
		if(MediaBrowserCompat.a)
	//*   0    0:getstatic       #40  <Field boolean MediaBrowserCompat.a>
	//*   1    3:ifeq            66
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #42  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #43  <Method void StringBuilder()>
	//    5   13:astore_1        
			stringbuilder.append("MediaServiceConnection.onServiceConnected name=");
	//    6   14:aload_1         
	//    7   15:ldc1            #45  <String "MediaServiceConnection.onServiceConnected name=">
	//    8   17:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
			stringbuilder.append(((Object) (a)));
	//   10   21:aload_1         
	//   11   22:aload_0         
	//   12   23:getfield        #28  <Field ComponentName a>
	//   13   26:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
	//   14   29:pop             
			stringbuilder.append(" binder=");
	//   15   30:aload_1         
	//   16   31:ldc1            #54  <String " binder=">
	//   17   33:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			stringbuilder.append(((Object) (b)));
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:getfield        #30  <Field IBinder b>
	//   22   42:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
	//   23   45:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
	//   24   46:ldc1            #56  <String "MediaBrowserCompat">
	//   25   48:aload_1         
	//   26   49:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   27   52:invokestatic    #66  <Method int Log.d(String, String)>
	//   28   55:pop             
			c.a.c();
	//   29   56:aload_0         
	//   30   57:getfield        #26  <Field MediaBrowserCompat$i$a c>
	//   31   60:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
	//   32   63:invokevirtual   #71  <Method void MediaBrowserCompat$i.c()>
		}
		if(!c.a("onServiceConnected"))
	//*  33   66:aload_0         
	//*  34   67:getfield        #26  <Field MediaBrowserCompat$i$a c>
	//*  35   70:ldc1            #72  <String "onServiceConnected">
	//*  36   72:invokevirtual   #75  <Method boolean MediaBrowserCompat$i$a.a(String)>
	//*  37   75:ifne            79
			return;
	//   38   78:return          
		c.a.h = new MediaBrowserCompat.l(b, c.a.d);
	//   39   79:aload_0         
	//   40   80:getfield        #26  <Field MediaBrowserCompat$i$a c>
	//   41   83:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
	//   42   86:new             #77  <Class MediaBrowserCompat$l>
	//   43   89:dup             
	//   44   90:aload_0         
	//   45   91:getfield        #30  <Field IBinder b>
	//   46   94:aload_0         
	//   47   95:getfield        #26  <Field MediaBrowserCompat$i$a c>
	//   48   98:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
	//   49  101:getfield        #80  <Field android.os.Bundle MediaBrowserCompat$i.d>
	//   50  104:invokespecial   #83  <Method void MediaBrowserCompat$l(IBinder, android.os.Bundle)>
	//   51  107:putfield        #87  <Field MediaBrowserCompat$l MediaBrowserCompat$i.h>
		c.a.i = new Messenger(((android.os.Handler) (c.a.e)));
	//   52  110:aload_0         
	//   53  111:getfield        #26  <Field MediaBrowserCompat$i$a c>
	//   54  114:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
	//   55  117:new             #89  <Class Messenger>
	//   56  120:dup             
	//   57  121:aload_0         
	//   58  122:getfield        #26  <Field MediaBrowserCompat$i$a c>
	//   59  125:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
	//   60  128:getfield        #93  <Field MediaBrowserCompat$a MediaBrowserCompat$i.e>
	//   61  131:invokespecial   #96  <Method void Messenger(android.os.Handler)>
	//   62  134:putfield        #99  <Field Messenger MediaBrowserCompat$i.i>
		c.a.e.a(c.a.i);
	//   63  137:aload_0         
	//   64  138:getfield        #26  <Field MediaBrowserCompat$i$a c>
	//   65  141:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
	//   66  144:getfield        #93  <Field MediaBrowserCompat$a MediaBrowserCompat$i.e>
	//   67  147:aload_0         
	//   68  148:getfield        #26  <Field MediaBrowserCompat$i$a c>
	//   69  151:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
	//   70  154:getfield        #99  <Field Messenger MediaBrowserCompat$i.i>
	//   71  157:invokevirtual   #104 <Method void MediaBrowserCompat$a.a(Messenger)>
		c.a.f = 2;
	//   72  160:aload_0         
	//   73  161:getfield        #26  <Field MediaBrowserCompat$i$a c>
	//   74  164:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
	//   75  167:iconst_2        
	//   76  168:putfield        #108 <Field int MediaBrowserCompat$i.f>
		StringBuilder stringbuilder1;
		try
		{
			if(MediaBrowserCompat.a)
	//*  77  171:getstatic       #40  <Field boolean MediaBrowserCompat.a>
	//*  78  174:ifeq            195
			{
				Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
	//   79  177:ldc1            #56  <String "MediaBrowserCompat">
	//   80  179:ldc1            #110 <String "ServiceCallbacks.onConnect...">
	//   81  181:invokestatic    #66  <Method int Log.d(String, String)>
	//   82  184:pop             
				c.a.c();
	//   83  185:aload_0         
	//   84  186:getfield        #26  <Field MediaBrowserCompat$i$a c>
	//   85  189:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
	//   86  192:invokevirtual   #71  <Method void MediaBrowserCompat$i.c()>
			}
			c.a.h.a(c.a.a, c.a.i);
	//   87  195:aload_0         
	//   88  196:getfield        #26  <Field MediaBrowserCompat$i$a c>
	//   89  199:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
	//   90  202:getfield        #87  <Field MediaBrowserCompat$l MediaBrowserCompat$i.h>
	//   91  205:aload_0         
	//   92  206:getfield        #26  <Field MediaBrowserCompat$i$a c>
	//   93  209:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
	//   94  212:getfield        #113 <Field android.content.Context MediaBrowserCompat$i.a>
	//   95  215:aload_0         
	//   96  216:getfield        #26  <Field MediaBrowserCompat$i$a c>
	//   97  219:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
	//   98  222:getfield        #99  <Field Messenger MediaBrowserCompat$i.i>
	//   99  225:invokevirtual   #116 <Method void MediaBrowserCompat$l.a(android.content.Context, Messenger)>
			return;
	//  100  228:return          
		}
	//* 101  229:new             #42  <Class StringBuilder>
	//* 102  232:dup             
	//* 103  233:invokespecial   #43  <Method void StringBuilder()>
	//* 104  236:astore_1        
	//* 105  237:aload_1         
	//* 106  238:ldc1            #118 <String "RemoteException during connect for ">
	//* 107  240:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//* 108  243:pop             
	//* 109  244:aload_1         
	//* 110  245:aload_0         
	//* 111  246:getfield        #26  <Field MediaBrowserCompat$i$a c>
	//* 112  249:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
	//* 113  252:getfield        #120 <Field ComponentName MediaBrowserCompat$i.b>
	//* 114  255:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
	//* 115  258:pop             
	//* 116  259:ldc1            #56  <String "MediaBrowserCompat">
	//* 117  261:aload_1         
	//* 118  262:invokevirtual   #60  <Method String StringBuilder.toString()>
	//* 119  265:invokestatic    #123 <Method int Log.w(String, String)>
	//* 120  268:pop             
	//* 121  269:getstatic       #40  <Field boolean MediaBrowserCompat.a>
	//* 122  272:ifeq            293
	//* 123  275:ldc1            #56  <String "MediaBrowserCompat">
	//* 124  277:ldc1            #110 <String "ServiceCallbacks.onConnect...">
	//* 125  279:invokestatic    #66  <Method int Log.d(String, String)>
	//* 126  282:pop             
	//* 127  283:aload_0         
	//* 128  284:getfield        #26  <Field MediaBrowserCompat$i$a c>
	//* 129  287:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
	//* 130  290:invokevirtual   #71  <Method void MediaBrowserCompat$i.c()>
	//* 131  293:return          
		// Misplaced declaration of an exception variable
		catch(RemoteException remoteexception)
		{
			stringbuilder1 = new StringBuilder();
		}
		stringbuilder1.append("RemoteException during connect for ");
		stringbuilder1.append(((Object) (c.a.b)));
		Log.w("MediaBrowserCompat", stringbuilder1.toString());
		if(MediaBrowserCompat.a)
		{
			Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
			c.a.c();
		}
	//* 132  294:astore_1        
	//* 133  295:goto            229
	}

	final ComponentName a;
	final IBinder b;
	final MediaBrowserCompat.i.a c;

	MediaBrowserCompat$i$a$1(MediaBrowserCompat.i.a a1, ComponentName componentname, IBinder ibinder)
	{
		c = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field MediaBrowserCompat$i$a c>
		a = componentname;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field ComponentName a>
		b = ibinder;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field IBinder b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #33  <Method void Object()>
	//   11   19:return          
	}
}
