// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.*;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

private class MediaBrowserCompat$i$a
	implements ServiceConnection
{

	private void a(Runnable runnable)
	{
		if(Thread.currentThread() == a.e.getLooper().getThread())
	//*   0    0:invokestatic    #32  <Method Thread Thread.currentThread()>
	//*   1    3:aload_0         
	//*   2    4:getfield        #21  <Field MediaBrowserCompat$i a>
	//*   3    7:getfield        #36  <Field MediaBrowserCompat$a MediaBrowserCompat$i.e>
	//*   4   10:invokevirtual   #42  <Method Looper MediaBrowserCompat$a.getLooper()>
	//*   5   13:invokevirtual   #47  <Method Thread Looper.getThread()>
	//*   6   16:if_acmpne       26
		{
			runnable.run();
	//    7   19:aload_1         
	//    8   20:invokeinterface #52  <Method void Runnable.run()>
			return;
	//    9   25:return          
		} else
		{
			a.e.post(runnable);
	//   10   26:aload_0         
	//   11   27:getfield        #21  <Field MediaBrowserCompat$i a>
	//   12   30:getfield        #36  <Field MediaBrowserCompat$a MediaBrowserCompat$i.e>
	//   13   33:aload_1         
	//   14   34:invokevirtual   #56  <Method boolean MediaBrowserCompat$a.post(Runnable)>
	//   15   37:pop             
			return;
	//   16   38:return          
		}
	}

	boolean a(String s)
	{
		if(a.g == this && a.f != 0 && a.f != 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field MediaBrowserCompat$i a>
	//*   2    4:getfield        #61  <Field MediaBrowserCompat$i$a MediaBrowserCompat$i.g>
	//*   3    7:aload_0         
	//*   4    8:if_acmpne       37
	//*   5   11:aload_0         
	//*   6   12:getfield        #21  <Field MediaBrowserCompat$i a>
	//*   7   15:getfield        #65  <Field int MediaBrowserCompat$i.f>
	//*   8   18:ifeq            37
	//*   9   21:aload_0         
	//*  10   22:getfield        #21  <Field MediaBrowserCompat$i a>
	//*  11   25:getfield        #65  <Field int MediaBrowserCompat$i.f>
	//*  12   28:iconst_1        
	//*  13   29:icmpne          35
	//*  14   32:goto            37
			return true;
	//   15   35:iconst_1        
	//   16   36:ireturn         
		if(a.f != 0 && a.f != 1)
	//*  17   37:aload_0         
	//*  18   38:getfield        #21  <Field MediaBrowserCompat$i a>
	//*  19   41:getfield        #65  <Field int MediaBrowserCompat$i.f>
	//*  20   44:ifeq            133
	//*  21   47:aload_0         
	//*  22   48:getfield        #21  <Field MediaBrowserCompat$i a>
	//*  23   51:getfield        #65  <Field int MediaBrowserCompat$i.f>
	//*  24   54:iconst_1        
	//*  25   55:icmpeq          133
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   26   58:new             #67  <Class StringBuilder>
	//   27   61:dup             
	//   28   62:invokespecial   #68  <Method void StringBuilder()>
	//   29   65:astore_2        
			stringbuilder.append(s);
	//   30   66:aload_2         
	//   31   67:aload_1         
	//   32   68:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   33   71:pop             
			stringbuilder.append(" for ");
	//   34   72:aload_2         
	//   35   73:ldc1            #74  <String " for ">
	//   36   75:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   37   78:pop             
			stringbuilder.append(((Object) (a.b)));
	//   38   79:aload_2         
	//   39   80:aload_0         
	//   40   81:getfield        #21  <Field MediaBrowserCompat$i a>
	//   41   84:getfield        #78  <Field ComponentName MediaBrowserCompat$i.b>
	//   42   87:invokevirtual   #81  <Method StringBuilder StringBuilder.append(Object)>
	//   43   90:pop             
			stringbuilder.append(" with mServiceConnection=");
	//   44   91:aload_2         
	//   45   92:ldc1            #83  <String " with mServiceConnection=">
	//   46   94:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   47   97:pop             
			stringbuilder.append(((Object) (a.g)));
	//   48   98:aload_2         
	//   49   99:aload_0         
	//   50  100:getfield        #21  <Field MediaBrowserCompat$i a>
	//   51  103:getfield        #61  <Field MediaBrowserCompat$i$a MediaBrowserCompat$i.g>
	//   52  106:invokevirtual   #81  <Method StringBuilder StringBuilder.append(Object)>
	//   53  109:pop             
			stringbuilder.append(" this=");
	//   54  110:aload_2         
	//   55  111:ldc1            #85  <String " this=">
	//   56  113:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   57  116:pop             
			stringbuilder.append(((Object) (this)));
	//   58  117:aload_2         
	//   59  118:aload_0         
	//   60  119:invokevirtual   #81  <Method StringBuilder StringBuilder.append(Object)>
	//   61  122:pop             
			Log.i("MediaBrowserCompat", stringbuilder.toString());
	//   62  123:ldc1            #87  <String "MediaBrowserCompat">
	//   63  125:aload_2         
	//   64  126:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   65  129:invokestatic    #96  <Method int Log.i(String, String)>
	//   66  132:pop             
		}
		return false;
	//   67  133:iconst_0        
	//   68  134:ireturn         
	}

	public void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		a(new Runnable(componentname, ibinder) {

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

			
			{
				c = MediaBrowserCompat.i.a.this;
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
);
	//    0    0:aload_0         
	//    1    1:new             #14  <Class MediaBrowserCompat$i$a$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #101 <Method void MediaBrowserCompat$i$a$1(MediaBrowserCompat$i$a, ComponentName, IBinder)>
	//    7   11:invokespecial   #103 <Method void a(Runnable)>
	//    8   14:return          
	}

	public void onServiceDisconnected(ComponentName componentname)
	{
		a(new Runnable(componentname) {

			public void run()
			{
				if(MediaBrowserCompat.a)
			//*   0    0:getstatic       #34  <Field boolean MediaBrowserCompat.a>
			//*   1    3:ifeq            85
				{
					StringBuilder stringbuilder = new StringBuilder();
			//    2    6:new             #36  <Class StringBuilder>
			//    3    9:dup             
			//    4   10:invokespecial   #37  <Method void StringBuilder()>
			//    5   13:astore_1        
					stringbuilder.append("MediaServiceConnection.onServiceDisconnected name=");
			//    6   14:aload_1         
			//    7   15:ldc1            #39  <String "MediaServiceConnection.onServiceDisconnected name=">
			//    8   17:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
			//    9   20:pop             
					stringbuilder.append(((Object) (a)));
			//   10   21:aload_1         
			//   11   22:aload_0         
			//   12   23:getfield        #26  <Field ComponentName a>
			//   13   26:invokevirtual   #46  <Method StringBuilder StringBuilder.append(Object)>
			//   14   29:pop             
					stringbuilder.append(" this=");
			//   15   30:aload_1         
			//   16   31:ldc1            #48  <String " this=">
			//   17   33:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
			//   18   36:pop             
					stringbuilder.append(((Object) (this)));
			//   19   37:aload_1         
			//   20   38:aload_0         
			//   21   39:invokevirtual   #46  <Method StringBuilder StringBuilder.append(Object)>
			//   22   42:pop             
					stringbuilder.append(" mServiceConnection=");
			//   23   43:aload_1         
			//   24   44:ldc1            #50  <String " mServiceConnection=">
			//   25   46:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
			//   26   49:pop             
					stringbuilder.append(((Object) (b.a.g)));
			//   27   50:aload_1         
			//   28   51:aload_0         
			//   29   52:getfield        #24  <Field MediaBrowserCompat$i$a b>
			//   30   55:getfield        #53  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
			//   31   58:getfield        #56  <Field MediaBrowserCompat$i$a MediaBrowserCompat$i.g>
			//   32   61:invokevirtual   #46  <Method StringBuilder StringBuilder.append(Object)>
			//   33   64:pop             
					Log.d("MediaBrowserCompat", stringbuilder.toString());
			//   34   65:ldc1            #58  <String "MediaBrowserCompat">
			//   35   67:aload_1         
			//   36   68:invokevirtual   #62  <Method String StringBuilder.toString()>
			//   37   71:invokestatic    #68  <Method int Log.d(String, String)>
			//   38   74:pop             
					b.a.c();
			//   39   75:aload_0         
			//   40   76:getfield        #24  <Field MediaBrowserCompat$i$a b>
			//   41   79:getfield        #53  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
			//   42   82:invokevirtual   #71  <Method void MediaBrowserCompat$i.c()>
				}
				if(!b.a("onServiceDisconnected"))
			//*  43   85:aload_0         
			//*  44   86:getfield        #24  <Field MediaBrowserCompat$i$a b>
			//*  45   89:ldc1            #72  <String "onServiceDisconnected">
			//*  46   91:invokevirtual   #75  <Method boolean MediaBrowserCompat$i$a.a(String)>
			//*  47   94:ifne            98
				{
					return;
			//   48   97:return          
				} else
				{
					b.a.h = null;
			//   49   98:aload_0         
			//   50   99:getfield        #24  <Field MediaBrowserCompat$i$a b>
			//   51  102:getfield        #53  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
			//   52  105:aconst_null     
			//   53  106:putfield        #79  <Field MediaBrowserCompat$l MediaBrowserCompat$i.h>
					b.a.i = null;
			//   54  109:aload_0         
			//   55  110:getfield        #24  <Field MediaBrowserCompat$i$a b>
			//   56  113:getfield        #53  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
			//   57  116:aconst_null     
			//   58  117:putfield        #82  <Field Messenger MediaBrowserCompat$i.i>
					b.a.e.a(((Messenger) (null)));
			//   59  120:aload_0         
			//   60  121:getfield        #24  <Field MediaBrowserCompat$i$a b>
			//   61  124:getfield        #53  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
			//   62  127:getfield        #86  <Field MediaBrowserCompat$a MediaBrowserCompat$i.e>
			//   63  130:aconst_null     
			//   64  131:invokevirtual   #91  <Method void MediaBrowserCompat$a.a(Messenger)>
					b.a.f = 4;
			//   65  134:aload_0         
			//   66  135:getfield        #24  <Field MediaBrowserCompat$i$a b>
			//   67  138:getfield        #53  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
			//   68  141:iconst_4        
			//   69  142:putfield        #95  <Field int MediaBrowserCompat$i.f>
					b.a.c.b();
			//   70  145:aload_0         
			//   71  146:getfield        #24  <Field MediaBrowserCompat$i$a b>
			//   72  149:getfield        #53  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
			//   73  152:getfield        #98  <Field MediaBrowserCompat$b MediaBrowserCompat$i.c>
			//   74  155:invokevirtual   #102 <Method void MediaBrowserCompat$b.b()>
					return;
			//   75  158:return          
				}
			}

			final ComponentName a;
			final MediaBrowserCompat.i.a b;

			
			{
				b = MediaBrowserCompat.i.a.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field MediaBrowserCompat$i$a b>
				a = componentname;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field ComponentName a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #29  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #16  <Class MediaBrowserCompat$i$a$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #108 <Method void MediaBrowserCompat$i$a$2(MediaBrowserCompat$i$a, ComponentName)>
	//    6   10:invokespecial   #103 <Method void a(Runnable)>
	//    7   13:return          
	}

	final MediaBrowserCompat.i a;

	MediaBrowserCompat$i$a(MediaBrowserCompat.i j)
	{
		a = j;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field MediaBrowserCompat$i a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
	//    5    9:return          
	}
}
