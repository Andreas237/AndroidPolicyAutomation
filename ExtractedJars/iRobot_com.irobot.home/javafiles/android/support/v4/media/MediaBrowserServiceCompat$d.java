// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.*;
import android.support.v4.f.a;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

private class MediaBrowserServiceCompat$d
{

	public void a(MediaBrowserServiceCompat$e mediabrowserservicecompat$e)
	{
		a.d.a(new Runnable(mediabrowserservicecompat$e) {

			public void run()
			{
				Object obj = ((Object) (a.a()));
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field MediaBrowserServiceCompat$e a>
			//    2    4:invokeinterface #33  <Method IBinder android.support.v4.media.MediaBrowserServiceCompat$e.a()>
			//    3    9:astore_1        
				obj = ((Object) ((MediaBrowserServiceCompat.b)b.a.b.remove(obj)));
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field MediaBrowserServiceCompat$d b>
			//    6   14:getfield        #36  <Field MediaBrowserServiceCompat android.support.v4.media.MediaBrowserServiceCompat$d.a>
			//    7   17:getfield        #39  <Field a MediaBrowserServiceCompat.b>
			//    8   20:aload_1         
			//    9   21:invokevirtual   #45  <Method Object a.remove(Object)>
			//   10   24:checkcast       #47  <Class MediaBrowserServiceCompat$b>
			//   11   27:astore_1        
			//   12   28:return          
			}

			final MediaBrowserServiceCompat.e a;
			final MediaBrowserServiceCompat.d b;

			
			{
				b = MediaBrowserServiceCompat.d.this;
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
);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field MediaBrowserServiceCompat a>
	//    2    4:getfield        #39  <Field MediaBrowserServiceCompat$g MediaBrowserServiceCompat.d>
	//    3    7:new             #11  <Class MediaBrowserServiceCompat$d$2>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #42  <Method void MediaBrowserServiceCompat$d$2(MediaBrowserServiceCompat$d, MediaBrowserServiceCompat$e)>
	//    8   16:invokevirtual   #47  <Method void android.support.v4.media.MediaBrowserServiceCompat$g.a(Runnable)>
	//    9   19:return          
	}

	public void a(MediaBrowserServiceCompat$e mediabrowserservicecompat$e, Bundle bundle)
	{
		a.d.a(new Runnable(mediabrowserservicecompat$e, bundle) {

			public void run()
			{
				IBinder ibinder = a.a();
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field MediaBrowserServiceCompat$e a>
			//    2    4:invokeinterface #37  <Method IBinder android.support.v4.media.MediaBrowserServiceCompat$e.a()>
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

			
			{
				c = MediaBrowserServiceCompat.d.this;
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
);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field MediaBrowserServiceCompat a>
	//    2    4:getfield        #39  <Field MediaBrowserServiceCompat$g MediaBrowserServiceCompat.d>
	//    3    7:new             #19  <Class MediaBrowserServiceCompat$d$6>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokespecial   #51  <Method void MediaBrowserServiceCompat$d$6(MediaBrowserServiceCompat$d, MediaBrowserServiceCompat$e, Bundle)>
	//    9   17:invokevirtual   #47  <Method void android.support.v4.media.MediaBrowserServiceCompat$g.a(Runnable)>
	//   10   20:return          
	}

	public void a(String s, int i, Bundle bundle, MediaBrowserServiceCompat$e mediabrowserservicecompat$e)
	{
		if(!a.a(s, i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field MediaBrowserServiceCompat a>
	//*   2    4:aload_1         
	//*   3    5:iload_2         
	//*   4    6:invokevirtual   #55  <Method boolean android.support.v4.media.MediaBrowserServiceCompat.a(String, int)>
	//*   5    9:ifne            58
		{
			bundle = ((Bundle) (new StringBuilder()));
	//    6   12:new             #57  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #58  <Method void StringBuilder()>
	//    9   19:astore_3        
			((StringBuilder) (bundle)).append("Package/uid mismatch: uid=");
	//   10   20:aload_3         
	//   11   21:ldc1            #60  <String "Package/uid mismatch: uid=">
	//   12   23:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
			((StringBuilder) (bundle)).append(i);
	//   14   27:aload_3         
	//   15   28:iload_2         
	//   16   29:invokevirtual   #67  <Method StringBuilder StringBuilder.append(int)>
	//   17   32:pop             
			((StringBuilder) (bundle)).append(" package=");
	//   18   33:aload_3         
	//   19   34:ldc1            #69  <String " package=">
	//   20   36:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
			((StringBuilder) (bundle)).append(s);
	//   22   40:aload_3         
	//   23   41:aload_1         
	//   24   42:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   25   45:pop             
			throw new IllegalArgumentException(((StringBuilder) (bundle)).toString());
	//   26   46:new             #71  <Class IllegalArgumentException>
	//   27   49:dup             
	//   28   50:aload_3         
	//   29   51:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   30   54:invokespecial   #78  <Method void IllegalArgumentException(String)>
	//   31   57:athrow          
		} else
		{
			a.d.a(new Runnable(mediabrowserservicecompat$e, s, bundle, i) {

				public void run()
				{
					RemoteException remoteexception;
					RemoteException remoteexception1;
					Object obj = ((Object) (a.a()));
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field MediaBrowserServiceCompat$e a>
				//    2    4:invokeinterface #46  <Method IBinder android.support.v4.media.MediaBrowserServiceCompat$e.a()>
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

			
			{
				e = MediaBrowserServiceCompat.d.this;
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
);
	//   32   58:aload_0         
	//   33   59:getfield        #31  <Field MediaBrowserServiceCompat a>
	//   34   62:getfield        #39  <Field MediaBrowserServiceCompat$g MediaBrowserServiceCompat.d>
	//   35   65:new             #9   <Class MediaBrowserServiceCompat$d$1>
	//   36   68:dup             
	//   37   69:aload_0         
	//   38   70:aload           4
	//   39   72:aload_1         
	//   40   73:aload_3         
	//   41   74:iload_2         
	//   42   75:invokespecial   #81  <Method void MediaBrowserServiceCompat$d$1(MediaBrowserServiceCompat$d, MediaBrowserServiceCompat$e, String, Bundle, int)>
	//   43   78:invokevirtual   #47  <Method void android.support.v4.media.MediaBrowserServiceCompat$g.a(Runnable)>
			return;
	//   44   81:return          
		}
	}

	public void a(String s, Bundle bundle, ResultReceiver resultreceiver, MediaBrowserServiceCompat$e mediabrowserservicecompat$e)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #88  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            35
		{
			if(resultreceiver == null)
	//*   3    7:aload_3         
	//*   4    8:ifnonnull       12
				return;
	//    5   11:return          
			a.d.a(new Runnable(mediabrowserservicecompat$e, s, bundle, resultreceiver) {

				public void run()
				{
					Object obj = ((Object) (a.a()));
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field MediaBrowserServiceCompat$e a>
				//    2    4:invokeinterface #44  <Method IBinder android.support.v4.media.MediaBrowserServiceCompat$e.a()>
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

			
			{
				e = MediaBrowserServiceCompat.d.this;
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
);
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field MediaBrowserServiceCompat a>
	//    8   16:getfield        #39  <Field MediaBrowserServiceCompat$g MediaBrowserServiceCompat.d>
	//    9   19:new             #23  <Class MediaBrowserServiceCompat$d$8>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:aload           4
	//   13   26:aload_1         
	//   14   27:aload_2         
	//   15   28:aload_3         
	//   16   29:invokespecial   #91  <Method void MediaBrowserServiceCompat$d$8(MediaBrowserServiceCompat$d, MediaBrowserServiceCompat$e, String, Bundle, ResultReceiver)>
	//   17   32:invokevirtual   #47  <Method void android.support.v4.media.MediaBrowserServiceCompat$g.a(Runnable)>
		}
	//   18   35:return          
	}

	public void a(String s, IBinder ibinder, Bundle bundle, MediaBrowserServiceCompat$e mediabrowserservicecompat$e)
	{
		a.d.a(new Runnable(mediabrowserservicecompat$e, s, ibinder, bundle) {

			public void run()
			{
				Object obj = ((Object) (a.a()));
			//    0    0:aload_0         
			//    1    1:getfield        #28  <Field MediaBrowserServiceCompat$e a>
			//    2    4:invokeinterface #44  <Method IBinder android.support.v4.media.MediaBrowserServiceCompat$e.a()>
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
					((StringBuilder) (obj)).append("addSubscription for callback that isn't registered id=");
			//   18   40:aload_1         
			//   19   41:ldc1            #63  <String "addSubscription for callback that isn't registered id=">
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
					e.a.a(b, ((MediaBrowserServiceCompat.b) (obj)), c, d);
			//   33   67:aload_0         
			//   34   68:getfield        #26  <Field MediaBrowserServiceCompat$d e>
			//   35   71:getfield        #47  <Field MediaBrowserServiceCompat android.support.v4.media.MediaBrowserServiceCompat$d.a>
			//   36   74:aload_0         
			//   37   75:getfield        #30  <Field String b>
			//   38   78:aload_1         
			//   39   79:aload_0         
			//   40   80:getfield        #32  <Field IBinder c>
			//   41   83:aload_0         
			//   42   84:getfield        #34  <Field Bundle d>
			//   43   87:invokevirtual   #82  <Method void android.support.v4.media.MediaBrowserServiceCompat.a(String, MediaBrowserServiceCompat$b, IBinder, Bundle)>
					return;
			//   44   90:return          
				}
			}

			final MediaBrowserServiceCompat.e a;
			final String b;
			final IBinder c;
			final Bundle d;
			final MediaBrowserServiceCompat.d e;

			
			{
				e = MediaBrowserServiceCompat.d.this;
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
				c = ibinder;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field IBinder c>
				d = bundle;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #34  <Field Bundle d>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #37  <Method void Object()>
			//   17   31:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field MediaBrowserServiceCompat a>
	//    2    4:getfield        #39  <Field MediaBrowserServiceCompat$g MediaBrowserServiceCompat.d>
	//    3    7:new             #13  <Class MediaBrowserServiceCompat$d$3>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload           4
	//    7   14:aload_1         
	//    8   15:aload_2         
	//    9   16:aload_3         
	//   10   17:invokespecial   #95  <Method void MediaBrowserServiceCompat$d$3(MediaBrowserServiceCompat$d, MediaBrowserServiceCompat$e, String, IBinder, Bundle)>
	//   11   20:invokevirtual   #47  <Method void android.support.v4.media.MediaBrowserServiceCompat$g.a(Runnable)>
	//   12   23:return          
	}

	public void a(String s, IBinder ibinder, MediaBrowserServiceCompat$e mediabrowserservicecompat$e)
	{
		a.d.a(new Runnable(mediabrowserservicecompat$e, s, ibinder) {

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

			
			{
				d = MediaBrowserServiceCompat.d.this;
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
);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field MediaBrowserServiceCompat a>
	//    2    4:getfield        #39  <Field MediaBrowserServiceCompat$g MediaBrowserServiceCompat.d>
	//    3    7:new             #15  <Class MediaBrowserServiceCompat$d$4>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_3         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokespecial   #99  <Method void MediaBrowserServiceCompat$d$4(MediaBrowserServiceCompat$d, MediaBrowserServiceCompat$e, String, IBinder)>
	//   10   18:invokevirtual   #47  <Method void android.support.v4.media.MediaBrowserServiceCompat$g.a(Runnable)>
	//   11   21:return          
	}

	public void a(String s, ResultReceiver resultreceiver, MediaBrowserServiceCompat$e mediabrowserservicecompat$e)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #88  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            33
		{
			if(resultreceiver == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       12
				return;
	//    5   11:return          
			a.d.a(new Runnable(mediabrowserservicecompat$e, s, resultreceiver) {

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
						((StringBuilder) (obj)).append("getMediaItem for callback that isn't registered id=");
				//   18   40:aload_1         
				//   19   41:ldc1            #59  <String "getMediaItem for callback that isn't registered id=">
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
					} else
					{
						d.a.a(b, ((MediaBrowserServiceCompat.b) (obj)), c);
				//   33   67:aload_0         
				//   34   68:getfield        #24  <Field MediaBrowserServiceCompat$d d>
				//   35   71:getfield        #43  <Field MediaBrowserServiceCompat android.support.v4.media.MediaBrowserServiceCompat$d.a>
				//   36   74:aload_0         
				//   37   75:getfield        #28  <Field String b>
				//   38   78:aload_1         
				//   39   79:aload_0         
				//   40   80:getfield        #30  <Field ResultReceiver c>
				//   41   83:invokevirtual   #78  <Method void android.support.v4.media.MediaBrowserServiceCompat.a(String, MediaBrowserServiceCompat$b, ResultReceiver)>
						return;
				//   42   86:return          
					}
				}

				final MediaBrowserServiceCompat.e a;
				final String b;
				final ResultReceiver c;
				final MediaBrowserServiceCompat.d d;

			
			{
				d = MediaBrowserServiceCompat.d.this;
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
				c = resultreceiver;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field ResultReceiver c>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #33  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field MediaBrowserServiceCompat a>
	//    8   16:getfield        #39  <Field MediaBrowserServiceCompat$g MediaBrowserServiceCompat.d>
	//    9   19:new             #17  <Class MediaBrowserServiceCompat$d$5>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:aload_3         
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:invokespecial   #103 <Method void MediaBrowserServiceCompat$d$5(MediaBrowserServiceCompat$d, MediaBrowserServiceCompat$e, String, ResultReceiver)>
	//   16   30:invokevirtual   #47  <Method void android.support.v4.media.MediaBrowserServiceCompat$g.a(Runnable)>
		}
	//   17   33:return          
	}

	public void b(MediaBrowserServiceCompat$e mediabrowserservicecompat$e)
	{
		a.d.a(new Runnable(mediabrowserservicecompat$e) {

			public void run()
			{
				IBinder ibinder = a.a();
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field MediaBrowserServiceCompat$e a>
			//    2    4:invokeinterface #33  <Method IBinder android.support.v4.media.MediaBrowserServiceCompat$e.a()>
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

			
			{
				b = MediaBrowserServiceCompat.d.this;
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
);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field MediaBrowserServiceCompat a>
	//    2    4:getfield        #39  <Field MediaBrowserServiceCompat$g MediaBrowserServiceCompat.d>
	//    3    7:new             #21  <Class MediaBrowserServiceCompat$d$7>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #105 <Method void MediaBrowserServiceCompat$d$7(MediaBrowserServiceCompat$d, MediaBrowserServiceCompat$e)>
	//    8   16:invokevirtual   #47  <Method void android.support.v4.media.MediaBrowserServiceCompat$g.a(Runnable)>
	//    9   19:return          
	}

	public void b(String s, Bundle bundle, ResultReceiver resultreceiver, MediaBrowserServiceCompat$e mediabrowserservicecompat$e)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #88  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            35
		{
			if(resultreceiver == null)
	//*   3    7:aload_3         
	//*   4    8:ifnonnull       12
				return;
	//    5   11:return          
			a.d.a(new Runnable(mediabrowserservicecompat$e, s, bundle, resultreceiver) {

				public void run()
				{
					Object obj = ((Object) (a.a()));
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field MediaBrowserServiceCompat$e a>
				//    2    4:invokeinterface #44  <Method IBinder android.support.v4.media.MediaBrowserServiceCompat$e.a()>
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

			
			{
				e = MediaBrowserServiceCompat.d.this;
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
);
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field MediaBrowserServiceCompat a>
	//    8   16:getfield        #39  <Field MediaBrowserServiceCompat$g MediaBrowserServiceCompat.d>
	//    9   19:new             #25  <Class MediaBrowserServiceCompat$d$9>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:aload           4
	//   13   26:aload_1         
	//   14   27:aload_2         
	//   15   28:aload_3         
	//   16   29:invokespecial   #106 <Method void MediaBrowserServiceCompat$d$9(MediaBrowserServiceCompat$d, MediaBrowserServiceCompat$e, String, Bundle, ResultReceiver)>
	//   17   32:invokevirtual   #47  <Method void android.support.v4.media.MediaBrowserServiceCompat$g.a(Runnable)>
		}
	//   18   35:return          
	}

	final MediaBrowserServiceCompat a;

	MediaBrowserServiceCompat$d(MediaBrowserServiceCompat mediabrowserservicecompat)
	{
		a = mediabrowserservicecompat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field MediaBrowserServiceCompat a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #34  <Method void Object()>
	//    5    9:return          
	}
}
