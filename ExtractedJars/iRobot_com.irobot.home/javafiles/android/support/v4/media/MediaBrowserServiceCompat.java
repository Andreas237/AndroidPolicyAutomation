// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.app.Service;
import android.content.pm.PackageManager;
import android.os.*;
import android.support.v4.app.BundleCompat;
import android.support.v4.f.a;
import android.support.v4.f.j;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.util.*;

// Referenced classes of package android.support.v4.media:
//			c, MediaBrowserCompat

public abstract class MediaBrowserServiceCompat extends Service
{
	public static final class a
	{

		public String a()
		{
			return a;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field String a>
		//    2    4:areturn         
		}

		public Bundle b()
		{
			return b;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field Bundle b>
		//    2    4:areturn         
		}

		private final String a;
		private final Bundle b;
	}

	private static class b
	{

		String a;
		Bundle b;
		e c;
		a d;
		HashMap e;

		b()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			e = new HashMap();
		//    2    4:aload_0         
		//    3    5:new             #23  <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #24  <Method void HashMap()>
		//    6   12:putfield        #26  <Field HashMap e>
		//    7   15:return          
		}
	}

	public static class c
	{

		void a(int i)
		{
			e = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #26  <Field int e>
		//    3    5:return          
		}

		void a(Object obj)
		{
		//    0    0:return          
		}

		boolean a()
		{
			return b || c || d;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field boolean b>
		//    2    4:ifne            26
		//    3    7:aload_0         
		//    4    8:getfield        #33  <Field boolean c>
		//    5   11:ifne            26
		//    6   14:aload_0         
		//    7   15:getfield        #35  <Field boolean d>
		//    8   18:ifeq            24
		//    9   21:goto            26
		//   10   24:iconst_0        
		//   11   25:ireturn         
		//   12   26:iconst_1        
		//   13   27:ireturn         
		}

		int b()
		{
			return e;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field int e>
		//    2    4:ireturn         
		}

		void b(Bundle bundle)
		{
			bundle = ((Bundle) (new StringBuilder()));
		//    0    0:new             #39  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #40  <Method void StringBuilder()>
		//    3    7:astore_1        
			((StringBuilder) (bundle)).append("It is not supported to send an error for ");
		//    4    8:aload_1         
		//    5    9:ldc1            #42  <String "It is not supported to send an error for ">
		//    6   11:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			((StringBuilder) (bundle)).append(a);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #22  <Field Object a>
		//   11   20:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
		//   12   23:pop             
			throw new UnsupportedOperationException(((StringBuilder) (bundle)).toString());
		//   13   24:new             #51  <Class UnsupportedOperationException>
		//   14   27:dup             
		//   15   28:aload_1         
		//   16   29:invokevirtual   #55  <Method String StringBuilder.toString()>
		//   17   32:invokespecial   #58  <Method void UnsupportedOperationException(String)>
		//   18   35:athrow          
		}

		public void b(Object obj)
		{
			if(!c && !d)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field boolean c>
		//*   2    4:ifne            28
		//*   3    7:aload_0         
		//*   4    8:getfield        #35  <Field boolean d>
		//*   5   11:ifeq            17
		//*   6   14:goto            28
			{
				c = true;
		//    7   17:aload_0         
		//    8   18:iconst_1        
		//    9   19:putfield        #33  <Field boolean c>
				a(obj);
		//   10   22:aload_0         
		//   11   23:aload_1         
		//   12   24:invokevirtual   #60  <Method void a(Object)>
				return;
		//   13   27:return          
			} else
			{
				obj = ((Object) (new StringBuilder()));
		//   14   28:new             #39  <Class StringBuilder>
		//   15   31:dup             
		//   16   32:invokespecial   #40  <Method void StringBuilder()>
		//   17   35:astore_1        
				((StringBuilder) (obj)).append("sendResult() called when either sendResult() or sendError() had already been called for: ");
		//   18   36:aload_1         
		//   19   37:ldc1            #62  <String "sendResult() called when either sendResult() or sendError() had already been called for: ">
		//   20   39:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//   21   42:pop             
				((StringBuilder) (obj)).append(a);
		//   22   43:aload_1         
		//   23   44:aload_0         
		//   24   45:getfield        #22  <Field Object a>
		//   25   48:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
		//   26   51:pop             
				throw new IllegalStateException(((StringBuilder) (obj)).toString());
		//   27   52:new             #64  <Class IllegalStateException>
		//   28   55:dup             
		//   29   56:aload_1         
		//   30   57:invokevirtual   #55  <Method String StringBuilder.toString()>
		//   31   60:invokespecial   #65  <Method void IllegalStateException(String)>
		//   32   63:athrow          
			}
		}

		public void c(Bundle bundle)
		{
			if(!c && !d)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field boolean c>
		//*   2    4:ifne            28
		//*   3    7:aload_0         
		//*   4    8:getfield        #35  <Field boolean d>
		//*   5   11:ifeq            17
		//*   6   14:goto            28
			{
				d = true;
		//    7   17:aload_0         
		//    8   18:iconst_1        
		//    9   19:putfield        #35  <Field boolean d>
				b(bundle);
		//   10   22:aload_0         
		//   11   23:aload_1         
		//   12   24:invokevirtual   #67  <Method void b(Bundle)>
				return;
		//   13   27:return          
			} else
			{
				bundle = ((Bundle) (new StringBuilder()));
		//   14   28:new             #39  <Class StringBuilder>
		//   15   31:dup             
		//   16   32:invokespecial   #40  <Method void StringBuilder()>
		//   17   35:astore_1        
				((StringBuilder) (bundle)).append("sendError() called when either sendResult() or sendError() had already been called for: ");
		//   18   36:aload_1         
		//   19   37:ldc1            #69  <String "sendError() called when either sendResult() or sendError() had already been called for: ">
		//   20   39:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//   21   42:pop             
				((StringBuilder) (bundle)).append(a);
		//   22   43:aload_1         
		//   23   44:aload_0         
		//   24   45:getfield        #22  <Field Object a>
		//   25   48:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
		//   26   51:pop             
				throw new IllegalStateException(((StringBuilder) (bundle)).toString());
		//   27   52:new             #64  <Class IllegalStateException>
		//   28   55:dup             
		//   29   56:aload_1         
		//   30   57:invokevirtual   #55  <Method String StringBuilder.toString()>
		//   31   60:invokespecial   #65  <Method void IllegalStateException(String)>
		//   32   63:athrow          
			}
		}

		private final Object a;
		private boolean b;
		private boolean c;
		private boolean d;
		private int e;

		c(Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			a = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field Object a>
		//    5    9:return          
		}
	}

	private class d
	{

		public void a(e e1)
		{
			a.d.a(new Runnable(this, e1) {

				public void run()
				{
					Object obj = ((Object) (a.a()));
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field MediaBrowserServiceCompat$e a>
				//    2    4:invokeinterface #33  <Method IBinder android.support.v4.media.MediaBrowserServiceCompat$e.a()>
				//    3    9:astore_1        
					obj = ((Object) ((b)b.a.b.remove(obj)));
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

				final e a;
				final d b;

			
			{
				b = d1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field MediaBrowserServiceCompat$d b>
				a = e1;
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

		public void a(e e1, Bundle bundle)
		{
			a.d.a(new Runnable(this, e1, bundle) {

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
					b b1 = new b();
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

				final e a;
				final Bundle b;
				final d c;

			
			{
				c = d1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field MediaBrowserServiceCompat$d c>
				a = e1;
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

		public void a(String s, int i, Bundle bundle, e e1)
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
				a.d.a(new Runnable(this, e1, s, bundle, i) {

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
						Object obj1 = ((Object) (new b()));
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
						if(((b) (obj1)).d == null)
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
								a.a(((b) (obj1)).d.a(), e.a.e, ((b) (obj1)).d.b());
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

					final e a;
					final String b;
					final Bundle c;
					final int d;
					final d e;

			
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

		public void a(String s, Bundle bundle, ResultReceiver resultreceiver, e e1)
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
				a.d.a(new Runnable(this, e1, s, bundle, resultreceiver) {

					public void run()
					{
						Object obj = ((Object) (a.a()));
					//    0    0:aload_0         
					//    1    1:getfield        #28  <Field MediaBrowserServiceCompat$e a>
					//    2    4:invokeinterface #44  <Method IBinder android.support.v4.media.MediaBrowserServiceCompat$e.a()>
					//    3    9:astore_1        
						obj = ((Object) ((b)e.a.b.get(obj)));
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
							e.a.a(b, c, ((b) (obj)), d);
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

					final e a;
					final String b;
					final Bundle c;
					final ResultReceiver d;
					final d e;

			
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

		public void a(String s, IBinder ibinder, Bundle bundle, e e1)
		{
			a.d.a(new Runnable(this, e1, s, ibinder, bundle) {

				public void run()
				{
					Object obj = ((Object) (a.a()));
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field MediaBrowserServiceCompat$e a>
				//    2    4:invokeinterface #44  <Method IBinder android.support.v4.media.MediaBrowserServiceCompat$e.a()>
				//    3    9:astore_1        
					obj = ((Object) ((b)e.a.b.get(obj)));
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
						e.a.a(b, ((b) (obj)), c, d);
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

				final e a;
				final String b;
				final IBinder c;
				final Bundle d;
				final d e;

			
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

		public void a(String s, IBinder ibinder, e e1)
		{
			a.d.a(new Runnable(this, e1, s, ibinder) {

				public void run()
				{
					Object obj = ((Object) (a.a()));
				//    0    0:aload_0         
				//    1    1:getfield        #26  <Field MediaBrowserServiceCompat$e a>
				//    2    4:invokeinterface #40  <Method IBinder android.support.v4.media.MediaBrowserServiceCompat$e.a()>
				//    3    9:astore_1        
					obj = ((Object) ((b)d.a.b.get(obj)));
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
					if(!d.a.a(b, ((b) (obj)), c))
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

				final e a;
				final String b;
				final IBinder c;
				final d d;

			
			{
				d = d1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field MediaBrowserServiceCompat$d d>
				a = e1;
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

		public void a(String s, ResultReceiver resultreceiver, e e1)
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
				a.d.a(new Runnable(this, e1, s, resultreceiver) {

					public void run()
					{
						Object obj = ((Object) (a.a()));
					//    0    0:aload_0         
					//    1    1:getfield        #26  <Field MediaBrowserServiceCompat$e a>
					//    2    4:invokeinterface #40  <Method IBinder android.support.v4.media.MediaBrowserServiceCompat$e.a()>
					//    3    9:astore_1        
						obj = ((Object) ((b)d.a.b.get(obj)));
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
							d.a.a(b, ((b) (obj)), c);
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

					final e a;
					final String b;
					final ResultReceiver c;
					final d d;

			
			{
				d = d1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field MediaBrowserServiceCompat$d d>
				a = e1;
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

		public void b(e e1)
		{
			a.d.a(new Runnable(this, e1) {

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

				final e a;
				final d b;

			
			{
				b = d1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field MediaBrowserServiceCompat$d b>
				a = e1;
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

		public void b(String s, Bundle bundle, ResultReceiver resultreceiver, e e1)
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
				a.d.a(new Runnable(this, e1, s, bundle, resultreceiver) {

					public void run()
					{
						Object obj = ((Object) (a.a()));
					//    0    0:aload_0         
					//    1    1:getfield        #28  <Field MediaBrowserServiceCompat$e a>
					//    2    4:invokeinterface #44  <Method IBinder android.support.v4.media.MediaBrowserServiceCompat$e.a()>
					//    3    9:astore_1        
						obj = ((Object) ((b)e.a.b.get(obj)));
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
							e.a.b(b, c, ((b) (obj)), d);
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

					final e a;
					final String b;
					final Bundle c;
					final ResultReceiver d;
					final d e;

			
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

		d()
		{
			a = MediaBrowserServiceCompat.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #31  <Field MediaBrowserServiceCompat a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #34  <Method void Object()>
		//    5    9:return          
		}
	}

	private static interface e
	{

		public abstract IBinder a();

		public abstract void a(String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle);

		public abstract void a(String s, List list, Bundle bundle);

		public abstract void b();
	}

	private static class f
		implements e
	{

		private void a(int i, Bundle bundle)
		{
			Message message = Message.obtain();
		//    0    0:invokestatic    #26  <Method Message Message.obtain()>
		//    1    3:astore_3        
			message.what = i;
		//    2    4:aload_3         
		//    3    5:iload_1         
		//    4    6:putfield        #30  <Field int Message.what>
			message.arg1 = 1;
		//    5    9:aload_3         
		//    6   10:iconst_1        
		//    7   11:putfield        #33  <Field int Message.arg1>
			message.setData(bundle);
		//    8   14:aload_3         
		//    9   15:aload_2         
		//   10   16:invokevirtual   #37  <Method void Message.setData(Bundle)>
			a.send(message);
		//   11   19:aload_0         
		//   12   20:getfield        #18  <Field Messenger a>
		//   13   23:aload_3         
		//   14   24:invokevirtual   #43  <Method void Messenger.send(Message)>
		//   15   27:return          
		}

		public IBinder a()
		{
			return a.getBinder();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Messenger a>
		//    2    4:invokevirtual   #47  <Method IBinder Messenger.getBinder()>
		//    3    7:areturn         
		}

		public void a(String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle)
		{
			Bundle bundle1 = bundle;
		//    0    0:aload_3         
		//    1    1:astore          4
			if(bundle == null)
		//*   2    3:aload_3         
		//*   3    4:ifnonnull       16
				bundle1 = new Bundle();
		//    4    7:new             #50  <Class Bundle>
		//    5   10:dup             
		//    6   11:invokespecial   #51  <Method void Bundle()>
		//    7   14:astore          4
			bundle1.putInt("extra_service_version", 1);
		//    8   16:aload           4
		//    9   18:ldc1            #53  <String "extra_service_version">
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #57  <Method void Bundle.putInt(String, int)>
			bundle = new Bundle();
		//   12   24:new             #50  <Class Bundle>
		//   13   27:dup             
		//   14   28:invokespecial   #51  <Method void Bundle()>
		//   15   31:astore_3        
			bundle.putString("data_media_item_id", s);
		//   16   32:aload_3         
		//   17   33:ldc1            #59  <String "data_media_item_id">
		//   18   35:aload_1         
		//   19   36:invokevirtual   #63  <Method void Bundle.putString(String, String)>
			bundle.putParcelable("data_media_session_token", ((android.os.Parcelable) (token)));
		//   20   39:aload_3         
		//   21   40:ldc1            #65  <String "data_media_session_token">
		//   22   42:aload_2         
		//   23   43:invokevirtual   #69  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			bundle.putBundle("data_root_hints", bundle1);
		//   24   46:aload_3         
		//   25   47:ldc1            #71  <String "data_root_hints">
		//   26   49:aload           4
		//   27   51:invokevirtual   #75  <Method void Bundle.putBundle(String, Bundle)>
			a(1, bundle);
		//   28   54:aload_0         
		//   29   55:iconst_1        
		//   30   56:aload_3         
		//   31   57:invokespecial   #77  <Method void a(int, Bundle)>
		//   32   60:return          
		}

		public void a(String s, List list, Bundle bundle)
		{
			Bundle bundle1 = new Bundle();
		//    0    0:new             #50  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #51  <Method void Bundle()>
		//    3    7:astore          4
			bundle1.putString("data_media_item_id", s);
		//    4    9:aload           4
		//    5   11:ldc1            #59  <String "data_media_item_id">
		//    6   13:aload_1         
		//    7   14:invokevirtual   #63  <Method void Bundle.putString(String, String)>
			bundle1.putBundle("data_options", bundle);
		//    8   17:aload           4
		//    9   19:ldc1            #80  <String "data_options">
		//   10   21:aload_3         
		//   11   22:invokevirtual   #75  <Method void Bundle.putBundle(String, Bundle)>
			if(list != null)
		//*  12   25:aload_2         
		//*  13   26:ifnull          61
			{
				if(list instanceof ArrayList)
		//*  14   29:aload_2         
		//*  15   30:instanceof      #82  <Class ArrayList>
		//*  16   33:ifeq            44
					s = ((String) ((ArrayList)list));
		//   17   36:aload_2         
		//   18   37:checkcast       #82  <Class ArrayList>
		//   19   40:astore_1        
				else
		//*  20   41:goto            53
					s = ((String) (new ArrayList(((java.util.Collection) (list)))));
		//   21   44:new             #82  <Class ArrayList>
		//   22   47:dup             
		//   23   48:aload_2         
		//   24   49:invokespecial   #85  <Method void ArrayList(java.util.Collection)>
		//   25   52:astore_1        
				bundle1.putParcelableArrayList("data_media_item_list", ((ArrayList) (s)));
		//   26   53:aload           4
		//   27   55:ldc1            #87  <String "data_media_item_list">
		//   28   57:aload_1         
		//   29   58:invokevirtual   #91  <Method void Bundle.putParcelableArrayList(String, ArrayList)>
			}
			a(3, bundle1);
		//   30   61:aload_0         
		//   31   62:iconst_3        
		//   32   63:aload           4
		//   33   65:invokespecial   #77  <Method void a(int, Bundle)>
		//   34   68:return          
		}

		public void b()
		{
			a(2, ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:iconst_2        
		//    2    2:aconst_null     
		//    3    3:invokespecial   #77  <Method void a(int, Bundle)>
		//    4    6:return          
		}

		final Messenger a;

		f(Messenger messenger)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			a = messenger;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field Messenger a>
		//    5    9:return          
		}
	}

	private final class g extends Handler
	{

		public void a(Runnable runnable)
		{
			if(Thread.currentThread() == getLooper().getThread())
		//*   0    0:invokestatic    #32  <Method Thread Thread.currentThread()>
		//*   1    3:aload_0         
		//*   2    4:invokevirtual   #36  <Method Looper getLooper()>
		//*   3    7:invokevirtual   #41  <Method Thread Looper.getThread()>
		//*   4   10:if_acmpne       20
			{
				runnable.run();
		//    5   13:aload_1         
		//    6   14:invokeinterface #46  <Method void Runnable.run()>
				return;
		//    7   19:return          
			} else
			{
				post(runnable);
		//    8   20:aload_0         
		//    9   21:aload_1         
		//   10   22:invokevirtual   #50  <Method boolean post(Runnable)>
		//   11   25:pop             
				return;
		//   12   26:return          
			}
		}

		public void handleMessage(Message message)
		{
			Object obj = ((Object) (message.getData()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #58  <Method Bundle Message.getData()>
		//    2    4:astore_2        
			switch(message.what)
		//*   3    5:aload_1         
		//*   4    6:getfield        #62  <Field int Message.what>
			{
		//*   5    9:tableswitch     1 9: default 60
		//		               1 366
		//		               2 347
		//		               3 310
		//		               4 279
		//		               5 245
		//		               6 220
		//		               7 201
		//		               8 161
		//		               9 121
			default:
				obj = ((Object) (new StringBuilder()));
		//    6   60:new             #64  <Class StringBuilder>
		//    7   63:dup             
		//    8   64:invokespecial   #65  <Method void StringBuilder()>
		//    9   67:astore_2        
				((StringBuilder) (obj)).append("Unhandled message: ");
		//   10   68:aload_2         
		//   11   69:ldc1            #67  <String "Unhandled message: ">
		//   12   71:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   13   74:pop             
				((StringBuilder) (obj)).append(((Object) (message)));
		//   14   75:aload_2         
		//   15   76:aload_1         
		//   16   77:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   17   80:pop             
				((StringBuilder) (obj)).append("\n  Service version: ");
		//   18   81:aload_2         
		//   19   82:ldc1            #76  <String "\n  Service version: ">
		//   20   84:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   21   87:pop             
				((StringBuilder) (obj)).append(1);
		//   22   88:aload_2         
		//   23   89:iconst_1        
		//   24   90:invokevirtual   #79  <Method StringBuilder StringBuilder.append(int)>
		//   25   93:pop             
				((StringBuilder) (obj)).append("\n  Client version: ");
		//   26   94:aload_2         
		//   27   95:ldc1            #81  <String "\n  Client version: ">
		//   28   97:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   29  100:pop             
				((StringBuilder) (obj)).append(message.arg1);
		//   30  101:aload_2         
		//   31  102:aload_1         
		//   32  103:getfield        #84  <Field int Message.arg1>
		//   33  106:invokevirtual   #79  <Method StringBuilder StringBuilder.append(int)>
		//   34  109:pop             
				Log.w("MBServiceCompat", ((StringBuilder) (obj)).toString());
		//   35  110:ldc1            #86  <String "MBServiceCompat">
		//   36  112:aload_2         
		//   37  113:invokevirtual   #90  <Method String StringBuilder.toString()>
		//   38  116:invokestatic    #96  <Method int Log.w(String, String)>
		//   39  119:pop             
				return;
		//   40  120:return          

			case 9: // '\t'
				b.b(((Bundle) (obj)).getString("data_custom_action"), ((Bundle) (obj)).getBundle("data_custom_action_extras"), (ResultReceiver)((Bundle) (obj)).getParcelable("data_result_receiver"), ((e) (new f(message.replyTo))));
		//   41  121:aload_0         
		//   42  122:getfield        #24  <Field MediaBrowserServiceCompat$d b>
		//   43  125:aload_2         
		//   44  126:ldc1            #98  <String "data_custom_action">
		//   45  128:invokevirtual   #104 <Method String Bundle.getString(String)>
		//   46  131:aload_2         
		//   47  132:ldc1            #106 <String "data_custom_action_extras">
		//   48  134:invokevirtual   #110 <Method Bundle Bundle.getBundle(String)>
		//   49  137:aload_2         
		//   50  138:ldc1            #112 <String "data_result_receiver">
		//   51  140:invokevirtual   #116 <Method android.os.Parcelable Bundle.getParcelable(String)>
		//   52  143:checkcast       #118 <Class ResultReceiver>
		//   53  146:new             #120 <Class MediaBrowserServiceCompat$f>
		//   54  149:dup             
		//   55  150:aload_1         
		//   56  151:getfield        #124 <Field Messenger Message.replyTo>
		//   57  154:invokespecial   #127 <Method void MediaBrowserServiceCompat$f(Messenger)>
		//   58  157:invokevirtual   #130 <Method void MediaBrowserServiceCompat$d.b(String, Bundle, ResultReceiver, MediaBrowserServiceCompat$e)>
				return;
		//   59  160:return          

			case 8: // '\b'
				b.a(((Bundle) (obj)).getString("data_search_query"), ((Bundle) (obj)).getBundle("data_search_extras"), (ResultReceiver)((Bundle) (obj)).getParcelable("data_result_receiver"), ((e) (new f(message.replyTo))));
		//   60  161:aload_0         
		//   61  162:getfield        #24  <Field MediaBrowserServiceCompat$d b>
		//   62  165:aload_2         
		//   63  166:ldc1            #132 <String "data_search_query">
		//   64  168:invokevirtual   #104 <Method String Bundle.getString(String)>
		//   65  171:aload_2         
		//   66  172:ldc1            #134 <String "data_search_extras">
		//   67  174:invokevirtual   #110 <Method Bundle Bundle.getBundle(String)>
		//   68  177:aload_2         
		//   69  178:ldc1            #112 <String "data_result_receiver">
		//   70  180:invokevirtual   #116 <Method android.os.Parcelable Bundle.getParcelable(String)>
		//   71  183:checkcast       #118 <Class ResultReceiver>
		//   72  186:new             #120 <Class MediaBrowserServiceCompat$f>
		//   73  189:dup             
		//   74  190:aload_1         
		//   75  191:getfield        #124 <Field Messenger Message.replyTo>
		//   76  194:invokespecial   #127 <Method void MediaBrowserServiceCompat$f(Messenger)>
		//   77  197:invokevirtual   #136 <Method void android.support.v4.media.MediaBrowserServiceCompat$d.a(String, Bundle, ResultReceiver, MediaBrowserServiceCompat$e)>
				return;
		//   78  200:return          

			case 7: // '\007'
				b.b(((e) (new f(message.replyTo))));
		//   79  201:aload_0         
		//   80  202:getfield        #24  <Field MediaBrowserServiceCompat$d b>
		//   81  205:new             #120 <Class MediaBrowserServiceCompat$f>
		//   82  208:dup             
		//   83  209:aload_1         
		//   84  210:getfield        #124 <Field Messenger Message.replyTo>
		//   85  213:invokespecial   #127 <Method void MediaBrowserServiceCompat$f(Messenger)>
		//   86  216:invokevirtual   #139 <Method void MediaBrowserServiceCompat$d.b(MediaBrowserServiceCompat$e)>
				return;
		//   87  219:return          

			case 6: // '\006'
				b.a(((e) (new f(message.replyTo))), ((Bundle) (obj)).getBundle("data_root_hints"));
		//   88  220:aload_0         
		//   89  221:getfield        #24  <Field MediaBrowserServiceCompat$d b>
		//   90  224:new             #120 <Class MediaBrowserServiceCompat$f>
		//   91  227:dup             
		//   92  228:aload_1         
		//   93  229:getfield        #124 <Field Messenger Message.replyTo>
		//   94  232:invokespecial   #127 <Method void MediaBrowserServiceCompat$f(Messenger)>
		//   95  235:aload_2         
		//   96  236:ldc1            #141 <String "data_root_hints">
		//   97  238:invokevirtual   #110 <Method Bundle Bundle.getBundle(String)>
		//   98  241:invokevirtual   #144 <Method void android.support.v4.media.MediaBrowserServiceCompat$d.a(MediaBrowserServiceCompat$e, Bundle)>
				return;
		//   99  244:return          

			case 5: // '\005'
				b.a(((Bundle) (obj)).getString("data_media_item_id"), (ResultReceiver)((Bundle) (obj)).getParcelable("data_result_receiver"), ((e) (new f(message.replyTo))));
		//  100  245:aload_0         
		//  101  246:getfield        #24  <Field MediaBrowserServiceCompat$d b>
		//  102  249:aload_2         
		//  103  250:ldc1            #146 <String "data_media_item_id">
		//  104  252:invokevirtual   #104 <Method String Bundle.getString(String)>
		//  105  255:aload_2         
		//  106  256:ldc1            #112 <String "data_result_receiver">
		//  107  258:invokevirtual   #116 <Method android.os.Parcelable Bundle.getParcelable(String)>
		//  108  261:checkcast       #118 <Class ResultReceiver>
		//  109  264:new             #120 <Class MediaBrowserServiceCompat$f>
		//  110  267:dup             
		//  111  268:aload_1         
		//  112  269:getfield        #124 <Field Messenger Message.replyTo>
		//  113  272:invokespecial   #127 <Method void MediaBrowserServiceCompat$f(Messenger)>
		//  114  275:invokevirtual   #149 <Method void android.support.v4.media.MediaBrowserServiceCompat$d.a(String, ResultReceiver, MediaBrowserServiceCompat$e)>
				return;
		//  115  278:return          

			case 4: // '\004'
				b.a(((Bundle) (obj)).getString("data_media_item_id"), BundleCompat.getBinder(((Bundle) (obj)), "data_callback_token"), ((e) (new f(message.replyTo))));
		//  116  279:aload_0         
		//  117  280:getfield        #24  <Field MediaBrowserServiceCompat$d b>
		//  118  283:aload_2         
		//  119  284:ldc1            #146 <String "data_media_item_id">
		//  120  286:invokevirtual   #104 <Method String Bundle.getString(String)>
		//  121  289:aload_2         
		//  122  290:ldc1            #151 <String "data_callback_token">
		//  123  292:invokestatic    #157 <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//  124  295:new             #120 <Class MediaBrowserServiceCompat$f>
		//  125  298:dup             
		//  126  299:aload_1         
		//  127  300:getfield        #124 <Field Messenger Message.replyTo>
		//  128  303:invokespecial   #127 <Method void MediaBrowserServiceCompat$f(Messenger)>
		//  129  306:invokevirtual   #160 <Method void android.support.v4.media.MediaBrowserServiceCompat$d.a(String, IBinder, MediaBrowserServiceCompat$e)>
				return;
		//  130  309:return          

			case 3: // '\003'
				b.a(((Bundle) (obj)).getString("data_media_item_id"), BundleCompat.getBinder(((Bundle) (obj)), "data_callback_token"), ((Bundle) (obj)).getBundle("data_options"), ((e) (new f(message.replyTo))));
		//  131  310:aload_0         
		//  132  311:getfield        #24  <Field MediaBrowserServiceCompat$d b>
		//  133  314:aload_2         
		//  134  315:ldc1            #146 <String "data_media_item_id">
		//  135  317:invokevirtual   #104 <Method String Bundle.getString(String)>
		//  136  320:aload_2         
		//  137  321:ldc1            #151 <String "data_callback_token">
		//  138  323:invokestatic    #157 <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//  139  326:aload_2         
		//  140  327:ldc1            #162 <String "data_options">
		//  141  329:invokevirtual   #110 <Method Bundle Bundle.getBundle(String)>
		//  142  332:new             #120 <Class MediaBrowserServiceCompat$f>
		//  143  335:dup             
		//  144  336:aload_1         
		//  145  337:getfield        #124 <Field Messenger Message.replyTo>
		//  146  340:invokespecial   #127 <Method void MediaBrowserServiceCompat$f(Messenger)>
		//  147  343:invokevirtual   #165 <Method void android.support.v4.media.MediaBrowserServiceCompat$d.a(String, IBinder, Bundle, MediaBrowserServiceCompat$e)>
				return;
		//  148  346:return          

			case 2: // '\002'
				b.a(((e) (new f(message.replyTo))));
		//  149  347:aload_0         
		//  150  348:getfield        #24  <Field MediaBrowserServiceCompat$d b>
		//  151  351:new             #120 <Class MediaBrowserServiceCompat$f>
		//  152  354:dup             
		//  153  355:aload_1         
		//  154  356:getfield        #124 <Field Messenger Message.replyTo>
		//  155  359:invokespecial   #127 <Method void MediaBrowserServiceCompat$f(Messenger)>
		//  156  362:invokevirtual   #167 <Method void android.support.v4.media.MediaBrowserServiceCompat$d.a(MediaBrowserServiceCompat$e)>
				return;
		//  157  365:return          

			case 1: // '\001'
				b.a(((Bundle) (obj)).getString("data_package_name"), ((Bundle) (obj)).getInt("data_calling_uid"), ((Bundle) (obj)).getBundle("data_root_hints"), ((e) (new f(message.replyTo))));
		//  158  366:aload_0         
		//  159  367:getfield        #24  <Field MediaBrowserServiceCompat$d b>
		//  160  370:aload_2         
		//  161  371:ldc1            #169 <String "data_package_name">
		//  162  373:invokevirtual   #104 <Method String Bundle.getString(String)>
		//  163  376:aload_2         
		//  164  377:ldc1            #171 <String "data_calling_uid">
		//  165  379:invokevirtual   #175 <Method int Bundle.getInt(String)>
		//  166  382:aload_2         
		//  167  383:ldc1            #141 <String "data_root_hints">
		//  168  385:invokevirtual   #110 <Method Bundle Bundle.getBundle(String)>
		//  169  388:new             #120 <Class MediaBrowserServiceCompat$f>
		//  170  391:dup             
		//  171  392:aload_1         
		//  172  393:getfield        #124 <Field Messenger Message.replyTo>
		//  173  396:invokespecial   #127 <Method void MediaBrowserServiceCompat$f(Messenger)>
		//  174  399:invokevirtual   #178 <Method void android.support.v4.media.MediaBrowserServiceCompat$d.a(String, int, Bundle, MediaBrowserServiceCompat$e)>
				return;
		//  175  402:return          
			}
		}

		public boolean sendMessageAtTime(Message message, long l)
		{
			Bundle bundle = message.getData();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #58  <Method Bundle Message.getData()>
		//    2    4:astore          4
			bundle.setClassLoader(((Class) (android/support/v4/media/MediaBrowserCompat)).getClassLoader());
		//    3    6:aload           4
		//    4    8:ldc1            #182 <Class MediaBrowserCompat>
		//    5   10:invokevirtual   #188 <Method ClassLoader Class.getClassLoader()>
		//    6   13:invokevirtual   #192 <Method void Bundle.setClassLoader(ClassLoader)>
			bundle.putInt("data_calling_uid", Binder.getCallingUid());
		//    7   16:aload           4
		//    8   18:ldc1            #171 <String "data_calling_uid">
		//    9   20:invokestatic    #198 <Method int Binder.getCallingUid()>
		//   10   23:invokevirtual   #202 <Method void Bundle.putInt(String, int)>
			return super.sendMessageAtTime(message, l);
		//   11   26:aload_0         
		//   12   27:aload_1         
		//   13   28:lload_2         
		//   14   29:invokespecial   #204 <Method boolean Handler.sendMessageAtTime(Message, long)>
		//   15   32:ireturn         
		}

		final MediaBrowserServiceCompat a;
		private final d b;

		g()
		{
			a = MediaBrowserServiceCompat.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field MediaBrowserServiceCompat a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Handler()>
			b = ((d) (a)). new d();
		//    5    9:aload_0         
		//    6   10:new             #20  <Class MediaBrowserServiceCompat$d>
		//    7   13:dup             
		//    8   14:aload_0         
		//    9   15:getfield        #15  <Field MediaBrowserServiceCompat a>
		//   10   18:invokespecial   #22  <Method void MediaBrowserServiceCompat$d(MediaBrowserServiceCompat)>
		//   11   21:putfield        #24  <Field MediaBrowserServiceCompat$d b>
		//   12   24:return          
		}
	}


	public MediaBrowserServiceCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void Service()>
	//    2    4:aload_0         
	//    3    5:new             #75  <Class a>
	//    4    8:dup             
	//    5    9:invokespecial   #76  <Method void a()>
	//    6   12:putfield        #78  <Field a b>
	//    7   15:aload_0         
	//    8   16:new             #50  <Class MediaBrowserServiceCompat$g>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #81  <Method void MediaBrowserServiceCompat$g(MediaBrowserServiceCompat)>
	//   12   24:putfield        #83  <Field MediaBrowserServiceCompat$g d>
	//   13   27:return          
	}

	public abstract a a(String s, int i, Bundle bundle);

	List a(List list, Bundle bundle)
	{
		if(list == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
	//    4    6:aload_2         
	//    5    7:ldc1            #87  <String "android.media.browse.extra.PAGE">
	//    6    9:iconst_m1       
	//    7   10:invokevirtual   #93  <Method int Bundle.getInt(String, int)>
	//    8   13:istore_3        
		int j1 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
	//    9   14:aload_2         
	//   10   15:ldc1            #95  <String "android.media.browse.extra.PAGE_SIZE">
	//   11   17:iconst_m1       
	//   12   18:invokevirtual   #93  <Method int Bundle.getInt(String, int)>
	//   13   21:istore          6
		if(i == -1 && j1 == -1)
	//*  14   23:iload_3         
	//*  15   24:iconst_m1       
	//*  16   25:icmpne          36
	//*  17   28:iload           6
	//*  18   30:iconst_m1       
	//*  19   31:icmpne          36
			return list;
	//   20   34:aload_1         
	//   21   35:areturn         
		int i1 = j1 * i;
	//   22   36:iload           6
	//   23   38:iload_3         
	//   24   39:imul            
	//   25   40:istore          5
		int l = i1 + j1;
	//   26   42:iload           5
	//   27   44:iload           6
	//   28   46:iadd            
	//   29   47:istore          4
		if(i >= 0 && j1 >= 1 && i1 < list.size())
	//*  30   49:iload_3         
	//*  31   50:iflt            104
	//*  32   53:iload           6
	//*  33   55:iconst_1        
	//*  34   56:icmplt          104
	//*  35   59:iload           5
	//*  36   61:aload_1         
	//*  37   62:invokeinterface #101 <Method int List.size()>
	//*  38   67:icmplt          73
	//*  39   70:goto            104
		{
			int k = l;
	//   40   73:iload           4
	//   41   75:istore_3        
			if(l > list.size())
	//*  42   76:iload           4
	//*  43   78:aload_1         
	//*  44   79:invokeinterface #101 <Method int List.size()>
	//*  45   84:icmple          94
				k = list.size();
	//   46   87:aload_1         
	//   47   88:invokeinterface #101 <Method int List.size()>
	//   48   93:istore_3        
			return list.subList(i1, k);
	//   49   94:aload_1         
	//   50   95:iload           5
	//   51   97:iload_3         
	//   52   98:invokeinterface #105 <Method List List.subList(int, int)>
	//   53  103:areturn         
		} else
		{
			return Collections.EMPTY_LIST;
	//   54  104:getstatic       #111 <Field List Collections.EMPTY_LIST>
	//   55  107:areturn         
		}
	}

	void a(String s, Bundle bundle, b b1, ResultReceiver resultreceiver)
	{
		resultreceiver = ((ResultReceiver) (new c(((Object) (s)), resultreceiver) {

			volatile void a(Object obj)
			{
				a((List)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class List>
			//    3    5:invokevirtual   #28  <Method void a(List)>
			//    4    8:return          
			}

			void a(List list)
			{
				if((b() & 4) == 0 && list != null)
			//*   0    0:aload_0         
			//*   1    1:invokevirtual   #31  <Method int b()>
			//*   2    4:iconst_4        
			//*   3    5:iand            
			//*   4    6:ifne            53
			//*   5    9:aload_1         
			//*   6   10:ifnonnull       16
			//*   7   13:goto            53
				{
					Bundle bundle1 = new Bundle();
			//    8   16:new             #33  <Class Bundle>
			//    9   19:dup             
			//   10   20:invokespecial   #36  <Method void Bundle()>
			//   11   23:astore_2        
					bundle1.putParcelableArray("search_results", (android.os.Parcelable[])list.toArray(((Object []) (new MediaBrowserCompat.MediaItem[0]))));
			//   12   24:aload_2         
			//   13   25:ldc1            #38  <String "search_results">
			//   14   27:aload_1         
			//   15   28:iconst_0        
			//   16   29:anewarray       MediaBrowserCompat.MediaItem[]
			//   17   32:invokeinterface #44  <Method Object[] List.toArray(Object[])>
			//   18   37:checkcast       #46  <Class android.os.Parcelable[]>
			//   19   40:invokevirtual   #50  <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
					a.b(0, bundle1);
			//   20   43:aload_0         
			//   21   44:getfield        #19  <Field ResultReceiver a>
			//   22   47:iconst_0        
			//   23   48:aload_2         
			//   24   49:invokevirtual   #55  <Method void ResultReceiver.b(int, Bundle)>
					return;
			//   25   52:return          
				} else
				{
					a.b(-1, ((Bundle) (null)));
			//   26   53:aload_0         
			//   27   54:getfield        #19  <Field ResultReceiver a>
			//   28   57:iconst_m1       
			//   29   58:aconst_null     
			//   30   59:invokevirtual   #55  <Method void ResultReceiver.b(int, Bundle)>
					return;
			//   31   62:return          
				}
			}

			final ResultReceiver a;
			final MediaBrowserServiceCompat b;

			
			{
				b = MediaBrowserServiceCompat.this;
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
));
	//    0    0:new             #10  <Class MediaBrowserServiceCompat$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload           4
	//    5    8:invokespecial   #117 <Method void MediaBrowserServiceCompat$3(MediaBrowserServiceCompat, Object, ResultReceiver)>
	//    6   11:astore          4
		c = b1;
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:putfield        #119 <Field MediaBrowserServiceCompat$b c>
		a(s, bundle, ((c) (resultreceiver)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload           4
	//   14   23:invokevirtual   #122 <Method void a(String, Bundle, MediaBrowserServiceCompat$c)>
		c = null;
	//   15   26:aload_0         
	//   16   27:aconst_null     
	//   17   28:putfield        #119 <Field MediaBrowserServiceCompat$b c>
		if(!((c) (resultreceiver)).a())
	//*  18   31:aload           4
	//*  19   33:invokevirtual   #125 <Method boolean android.support.v4.media.MediaBrowserServiceCompat$c.a()>
	//*  20   36:ifne            72
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   21   39:new             #127 <Class StringBuilder>
	//   22   42:dup             
	//   23   43:invokespecial   #128 <Method void StringBuilder()>
	//   24   46:astore_2        
			((StringBuilder) (bundle)).append("onSearch must call detach() or sendResult() before returning for query=");
	//   25   47:aload_2         
	//   26   48:ldc1            #130 <String "onSearch must call detach() or sendResult() before returning for query=">
	//   27   50:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   28   53:pop             
			((StringBuilder) (bundle)).append(s);
	//   29   54:aload_2         
	//   30   55:aload_1         
	//   31   56:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   32   59:pop             
			throw new IllegalStateException(((StringBuilder) (bundle)).toString());
	//   33   60:new             #136 <Class IllegalStateException>
	//   34   63:dup             
	//   35   64:aload_2         
	//   36   65:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   37   68:invokespecial   #143 <Method void IllegalStateException(String)>
	//   38   71:athrow          
		} else
		{
			return;
	//   39   72:return          
		}
	}

	public void a(String s, Bundle bundle, c c1)
	{
		c1.a(4);
	//    0    0:aload_3         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #146 <Method void android.support.v4.media.MediaBrowserServiceCompat$c.a(int)>
		c1.b(((Object) (null)));
	//    3    5:aload_3         
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #149 <Method void MediaBrowserServiceCompat$c.b(Object)>
	//    6   10:return          
	}

	void a(String s, b b1, Bundle bundle)
	{
		c c1 = new c(((Object) (s)), b1, s, bundle) {

			volatile void a(Object obj)
			{
				a((List)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #33  <Class List>
			//    3    5:invokevirtual   #36  <Method void a(List)>
			//    4    8:return          
			}

			void a(List list)
			{
				if(d.b.get(((Object) (a.c.a()))) != a)
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field MediaBrowserServiceCompat d>
			//*   2    4:getfield        #41  <Field a MediaBrowserServiceCompat.b>
			//*   3    7:aload_0         
			//*   4    8:getfield        #23  <Field MediaBrowserServiceCompat$b a>
			//*   5   11:getfield        #46  <Field MediaBrowserServiceCompat$e MediaBrowserServiceCompat$b.c>
			//*   6   14:invokeinterface #51  <Method IBinder android.support.v4.media.MediaBrowserServiceCompat$e.a()>
			//*   7   19:invokevirtual   #57  <Method Object a.get(Object)>
			//*   8   22:aload_0         
			//*   9   23:getfield        #23  <Field MediaBrowserServiceCompat$b a>
			//*  10   26:if_acmpeq       89
				{
					if(android.support.v4.media.MediaBrowserServiceCompat.a)
			//*  11   29:getstatic       #60  <Field boolean android.support.v4.media.MediaBrowserServiceCompat.a>
			//*  12   32:ifeq            88
					{
						list = ((List) (new StringBuilder()));
			//   13   35:new             #62  <Class StringBuilder>
			//   14   38:dup             
			//   15   39:invokespecial   #65  <Method void StringBuilder()>
			//   16   42:astore_1        
						((StringBuilder) (list)).append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
			//   17   43:aload_1         
			//   18   44:ldc1            #67  <String "Not sending onLoadChildren result for connection that has been disconnected. pkg=">
			//   19   46:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
			//   20   49:pop             
						((StringBuilder) (list)).append(a.a);
			//   21   50:aload_1         
			//   22   51:aload_0         
			//   23   52:getfield        #23  <Field MediaBrowserServiceCompat$b a>
			//   24   55:getfield        #73  <Field String android.support.v4.media.MediaBrowserServiceCompat$b.a>
			//   25   58:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
			//   26   61:pop             
						((StringBuilder) (list)).append(" id=");
			//   27   62:aload_1         
			//   28   63:ldc1            #75  <String " id=">
			//   29   65:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
			//   30   68:pop             
						((StringBuilder) (list)).append(b);
			//   31   69:aload_1         
			//   32   70:aload_0         
			//   33   71:getfield        #25  <Field String b>
			//   34   74:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
			//   35   77:pop             
						Log.d("MBServiceCompat", ((StringBuilder) (list)).toString());
			//   36   78:ldc1            #77  <String "MBServiceCompat">
			//   37   80:aload_1         
			//   38   81:invokevirtual   #81  <Method String StringBuilder.toString()>
			//   39   84:invokestatic    #86  <Method int Log.d(String, String)>
			//   40   87:pop             
					}
					return;
			//   41   88:return          
				}
				List list1 = list;
			//   42   89:aload_1         
			//   43   90:astore_2        
				if((b() & 1) != 0)
			//*  44   91:aload_0         
			//*  45   92:invokevirtual   #89  <Method int b()>
			//*  46   95:iconst_1        
			//*  47   96:iand            
			//*  48   97:ifeq            113
					list1 = d.a(list, c);
			//   49  100:aload_0         
			//   50  101:getfield        #21  <Field MediaBrowserServiceCompat d>
			//   51  104:aload_1         
			//   52  105:aload_0         
			//   53  106:getfield        #27  <Field Bundle c>
			//   54  109:invokevirtual   #92  <Method List android.support.v4.media.MediaBrowserServiceCompat.a(List, Bundle)>
			//   55  112:astore_2        
				try
				{
					a.c.a(b, list1, c);
			//   56  113:aload_0         
			//   57  114:getfield        #23  <Field MediaBrowserServiceCompat$b a>
			//   58  117:getfield        #46  <Field MediaBrowserServiceCompat$e MediaBrowserServiceCompat$b.c>
			//   59  120:aload_0         
			//   60  121:getfield        #25  <Field String b>
			//   61  124:aload_2         
			//   62  125:aload_0         
			//   63  126:getfield        #27  <Field Bundle c>
			//   64  129:invokeinterface #95  <Method void android.support.v4.media.MediaBrowserServiceCompat$e.a(String, List, Bundle)>
					return;
			//   65  134:return          
				}
			//*  66  135:new             #62  <Class StringBuilder>
			//*  67  138:dup             
			//*  68  139:invokespecial   #65  <Method void StringBuilder()>
			//*  69  142:astore_1        
			//*  70  143:aload_1         
			//*  71  144:ldc1            #97  <String "Calling onLoadChildren() failed for id=">
			//*  72  146:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
			//*  73  149:pop             
			//*  74  150:aload_1         
			//*  75  151:aload_0         
			//*  76  152:getfield        #25  <Field String b>
			//*  77  155:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
			//*  78  158:pop             
			//*  79  159:aload_1         
			//*  80  160:ldc1            #99  <String " package=">
			//*  81  162:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
			//*  82  165:pop             
			//*  83  166:aload_1         
			//*  84  167:aload_0         
			//*  85  168:getfield        #23  <Field MediaBrowserServiceCompat$b a>
			//*  86  171:getfield        #73  <Field String android.support.v4.media.MediaBrowserServiceCompat$b.a>
			//*  87  174:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
			//*  88  177:pop             
			//*  89  178:ldc1            #77  <String "MBServiceCompat">
			//*  90  180:aload_1         
			//*  91  181:invokevirtual   #81  <Method String StringBuilder.toString()>
			//*  92  184:invokestatic    #102 <Method int Log.w(String, String)>
			//*  93  187:pop             
			//*  94  188:return          
				// Misplaced declaration of an exception variable
				catch(List list)
				{
					list = ((List) (new StringBuilder()));
				}
				((StringBuilder) (list)).append("Calling onLoadChildren() failed for id=");
				((StringBuilder) (list)).append(b);
				((StringBuilder) (list)).append(" package=");
				((StringBuilder) (list)).append(a.a);
				Log.w("MBServiceCompat", ((StringBuilder) (list)).toString());
			//*  95  189:astore_1        
			//*  96  190:goto            135
			}

			final b a;
			final String b;
			final Bundle c;
			final MediaBrowserServiceCompat d;

			
			{
				d = MediaBrowserServiceCompat.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field MediaBrowserServiceCompat d>
				a = b1;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #23  <Field MediaBrowserServiceCompat$b a>
				b = s;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #25  <Field String b>
				c = bundle;
			//    9   16:aload_0         
			//   10   17:aload           5
			//   11   19:putfield        #27  <Field Bundle c>
				super(obj);
			//   12   22:aload_0         
			//   13   23:aload_2         
			//   14   24:invokespecial   #30  <Method void MediaBrowserServiceCompat$c(Object)>
			//   15   27:return          
			}
		}
;
	//    0    0:new             #6   <Class MediaBrowserServiceCompat$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_1         
	//    6    8:aload_3         
	//    7    9:invokespecial   #154 <Method void MediaBrowserServiceCompat$1(MediaBrowserServiceCompat, Object, MediaBrowserServiceCompat$b, String, Bundle)>
	//    8   12:astore          4
		c = b1;
	//    9   14:aload_0         
	//   10   15:aload_2         
	//   11   16:putfield        #119 <Field MediaBrowserServiceCompat$b c>
		if(bundle == null)
	//*  12   19:aload_3         
	//*  13   20:ifnonnull       33
			a(s, ((c) (c1)));
	//   14   23:aload_0         
	//   15   24:aload_1         
	//   16   25:aload           4
	//   17   27:invokevirtual   #157 <Method void a(String, MediaBrowserServiceCompat$c)>
		else
	//*  18   30:goto            41
			a(s, ((c) (c1)), bundle);
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:aload           4
	//   22   37:aload_3         
	//   23   38:invokevirtual   #160 <Method void a(String, MediaBrowserServiceCompat$c, Bundle)>
		c = null;
	//   24   41:aload_0         
	//   25   42:aconst_null     
	//   26   43:putfield        #119 <Field MediaBrowserServiceCompat$b c>
		if(!((c) (c1)).a())
	//*  27   46:aload           4
	//*  28   48:invokevirtual   #125 <Method boolean android.support.v4.media.MediaBrowserServiceCompat$c.a()>
	//*  29   51:ifne            103
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   30   54:new             #127 <Class StringBuilder>
	//   31   57:dup             
	//   32   58:invokespecial   #128 <Method void StringBuilder()>
	//   33   61:astore_3        
			((StringBuilder) (bundle)).append("onLoadChildren must call detach() or sendResult() before returning for package=");
	//   34   62:aload_3         
	//   35   63:ldc1            #162 <String "onLoadChildren must call detach() or sendResult() before returning for package=">
	//   36   65:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   37   68:pop             
			((StringBuilder) (bundle)).append(b1.a);
	//   38   69:aload_3         
	//   39   70:aload_2         
	//   40   71:getfield        #165 <Field String android.support.v4.media.MediaBrowserServiceCompat$b.a>
	//   41   74:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   42   77:pop             
			((StringBuilder) (bundle)).append(" id=");
	//   43   78:aload_3         
	//   44   79:ldc1            #167 <String " id=">
	//   45   81:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   46   84:pop             
			((StringBuilder) (bundle)).append(s);
	//   47   85:aload_3         
	//   48   86:aload_1         
	//   49   87:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   50   90:pop             
			throw new IllegalStateException(((StringBuilder) (bundle)).toString());
	//   51   91:new             #136 <Class IllegalStateException>
	//   52   94:dup             
	//   53   95:aload_3         
	//   54   96:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   55   99:invokespecial   #143 <Method void IllegalStateException(String)>
	//   56  102:athrow          
		} else
		{
			return;
	//   57  103:return          
		}
	}

	void a(String s, b b1, IBinder ibinder, Bundle bundle)
	{
		List list = (List)b1.e.get(((Object) (s)));
	//    0    0:aload_2         
	//    1    1:getfield        #171 <Field HashMap MediaBrowserServiceCompat$b.e>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #177 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #97  <Class List>
	//    5   11:astore          6
		Object obj = ((Object) (list));
	//    6   13:aload           6
	//    7   15:astore          5
		if(list == null)
	//*   8   17:aload           6
	//*   9   19:ifnonnull       31
			obj = ((Object) (new ArrayList()));
	//   10   22:new             #179 <Class ArrayList>
	//   11   25:dup             
	//   12   26:invokespecial   #180 <Method void ArrayList()>
	//   13   29:astore          5
		for(Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext();)
	//*  14   31:aload           5
	//*  15   33:invokeinterface #184 <Method Iterator List.iterator()>
	//*  16   38:astore          6
	//*  17   40:aload           6
	//*  18   42:invokeinterface #189 <Method boolean Iterator.hasNext()>
	//*  19   47:ifeq            88
		{
			j j1 = (j)iterator.next();
	//   20   50:aload           6
	//   21   52:invokeinterface #193 <Method Object Iterator.next()>
	//   22   57:checkcast       #195 <Class j>
	//   23   60:astore          7
			if(ibinder == j1.a && android.support.v4.media.c.a(bundle, (Bundle)j1.b))
	//*  24   62:aload_3         
	//*  25   63:aload           7
	//*  26   65:getfield        #198 <Field Object j.a>
	//*  27   68:if_acmpne       40
	//*  28   71:aload           4
	//*  29   73:aload           7
	//*  30   75:getfield        #200 <Field Object j.b>
	//*  31   78:checkcast       #89  <Class Bundle>
	//*  32   81:invokestatic    #205 <Method boolean android.support.v4.media.c.a(Bundle, Bundle)>
	//*  33   84:ifeq            40
				return;
	//   34   87:return          
		}

		((List) (obj)).add(((Object) (new j(((Object) (ibinder)), ((Object) (bundle))))));
	//   35   88:aload           5
	//   36   90:new             #195 <Class j>
	//   37   93:dup             
	//   38   94:aload_3         
	//   39   95:aload           4
	//   40   97:invokespecial   #208 <Method void j(Object, Object)>
	//   41  100:invokeinterface #212 <Method boolean List.add(Object)>
	//   42  105:pop             
		b1.e.put(((Object) (s)), obj);
	//   43  106:aload_2         
	//   44  107:getfield        #171 <Field HashMap MediaBrowserServiceCompat$b.e>
	//   45  110:aload_1         
	//   46  111:aload           5
	//   47  113:invokevirtual   #216 <Method Object HashMap.put(Object, Object)>
	//   48  116:pop             
		a(s, b1, bundle);
	//   49  117:aload_0         
	//   50  118:aload_1         
	//   51  119:aload_2         
	//   52  120:aload           4
	//   53  122:invokevirtual   #218 <Method void a(String, MediaBrowserServiceCompat$b, Bundle)>
	//   54  125:return          
	}

	void a(String s, b b1, ResultReceiver resultreceiver)
	{
		resultreceiver = ((ResultReceiver) (new c(((Object) (s)), resultreceiver) {

			void a(MediaBrowserCompat.MediaItem mediaitem)
			{
				if((b() & 2) != 0)
			//*   0    0:aload_0         
			//*   1    1:invokevirtual   #27  <Method int b()>
			//*   2    4:iconst_2        
			//*   3    5:iand            
			//*   4    6:ifeq            19
				{
					a.b(-1, ((Bundle) (null)));
			//    5    9:aload_0         
			//    6   10:getfield        #19  <Field ResultReceiver a>
			//    7   13:iconst_m1       
			//    8   14:aconst_null     
			//    9   15:invokevirtual   #32  <Method void ResultReceiver.b(int, Bundle)>
					return;
			//   10   18:return          
				} else
				{
					Bundle bundle = new Bundle();
			//   11   19:new             #34  <Class Bundle>
			//   12   22:dup             
			//   13   23:invokespecial   #37  <Method void Bundle()>
			//   14   26:astore_2        
					bundle.putParcelable("media_item", ((android.os.Parcelable) (mediaitem)));
			//   15   27:aload_2         
			//   16   28:ldc1            #39  <String "media_item">
			//   17   30:aload_1         
			//   18   31:invokevirtual   #43  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
					a.b(0, bundle);
			//   19   34:aload_0         
			//   20   35:getfield        #19  <Field ResultReceiver a>
			//   21   38:iconst_0        
			//   22   39:aload_2         
			//   23   40:invokevirtual   #32  <Method void ResultReceiver.b(int, Bundle)>
					return;
			//   24   43:return          
				}
			}

			volatile void a(Object obj)
			{
				a((MediaBrowserCompat.MediaItem)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #45  <Class MediaBrowserCompat$MediaItem>
			//    3    5:invokevirtual   #47  <Method void a(MediaBrowserCompat$MediaItem)>
			//    4    8:return          
			}

			final ResultReceiver a;
			final MediaBrowserServiceCompat b;

			
			{
				b = MediaBrowserServiceCompat.this;
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
));
	//    0    0:new             #8   <Class MediaBrowserServiceCompat$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_3         
	//    5    7:invokespecial   #220 <Method void MediaBrowserServiceCompat$2(MediaBrowserServiceCompat, Object, ResultReceiver)>
	//    6   10:astore_3        
		c = b1;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #119 <Field MediaBrowserServiceCompat$b c>
		b(s, ((c) (resultreceiver)));
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:aload_3         
	//   13   19:invokevirtual   #222 <Method void b(String, MediaBrowserServiceCompat$c)>
		c = null;
	//   14   22:aload_0         
	//   15   23:aconst_null     
	//   16   24:putfield        #119 <Field MediaBrowserServiceCompat$b c>
		if(!((c) (resultreceiver)).a())
	//*  17   27:aload_3         
	//*  18   28:invokevirtual   #125 <Method boolean android.support.v4.media.MediaBrowserServiceCompat$c.a()>
	//*  19   31:ifne            67
		{
			b1 = ((b) (new StringBuilder()));
	//   20   34:new             #127 <Class StringBuilder>
	//   21   37:dup             
	//   22   38:invokespecial   #128 <Method void StringBuilder()>
	//   23   41:astore_2        
			((StringBuilder) (b1)).append("onLoadItem must call detach() or sendResult() before returning for id=");
	//   24   42:aload_2         
	//   25   43:ldc1            #224 <String "onLoadItem must call detach() or sendResult() before returning for id=">
	//   26   45:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   27   48:pop             
			((StringBuilder) (b1)).append(s);
	//   28   49:aload_2         
	//   29   50:aload_1         
	//   30   51:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   31   54:pop             
			throw new IllegalStateException(((StringBuilder) (b1)).toString());
	//   32   55:new             #136 <Class IllegalStateException>
	//   33   58:dup             
	//   34   59:aload_2         
	//   35   60:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   36   63:invokespecial   #143 <Method void IllegalStateException(String)>
	//   37   66:athrow          
		} else
		{
			return;
	//   38   67:return          
		}
	}

	public abstract void a(String s, c c1);

	public void a(String s, c c1, Bundle bundle)
	{
		c1.a(1);
	//    0    0:aload_2         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #146 <Method void android.support.v4.media.MediaBrowserServiceCompat$c.a(int)>
		a(s, c1);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #157 <Method void a(String, MediaBrowserServiceCompat$c)>
	//    7   11:return          
	}

	boolean a(String s, int i)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		String as[] = getPackageManager().getPackagesForUid(i);
	//    4    6:aload_0         
	//    5    7:invokevirtual   #229 <Method PackageManager getPackageManager()>
	//    6   10:iload_2         
	//    7   11:invokevirtual   #235 <Method String[] PackageManager.getPackagesForUid(int)>
	//    8   14:astore          4
		int k = as.length;
	//    9   16:aload           4
	//   10   18:arraylength     
	//   11   19:istore_3        
		for(i = 0; i < k; i++)
	//*  12   20:iconst_0        
	//*  13   21:istore_2        
	//*  14   22:iload_2         
	//*  15   23:iload_3         
	//*  16   24:icmpge          47
			if(as[i].equals(((Object) (s))))
	//*  17   27:aload           4
	//*  18   29:iload_2         
	//*  19   30:aaload          
	//*  20   31:aload_1         
	//*  21   32:invokevirtual   #240 <Method boolean String.equals(Object)>
	//*  22   35:ifeq            40
				return true;
	//   23   38:iconst_1        
	//   24   39:ireturn         

	//   25   40:iload_2         
	//   26   41:iconst_1        
	//   27   42:iadd            
	//   28   43:istore_2        
	//*  29   44:goto            22
		return false;
	//   30   47:iconst_0        
	//   31   48:ireturn         
	}

	boolean a(String s, b b1, IBinder ibinder)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		boolean flag2 = false;
	//    2    3:iconst_0        
	//    3    4:istore          6
		boolean flag1 = false;
	//    4    6:iconst_0        
	//    5    7:istore          5
		if(ibinder == null)
	//*   6    9:aload_3         
	//*   7   10:ifnonnull       34
		{
			flag = flag1;
	//    8   13:iload           5
	//    9   15:istore          4
			if(b1.e.remove(((Object) (s))) != null)
	//*  10   17:aload_2         
	//*  11   18:getfield        #171 <Field HashMap MediaBrowserServiceCompat$b.e>
	//*  12   21:aload_1         
	//*  13   22:invokevirtual   #244 <Method Object HashMap.remove(Object)>
	//*  14   25:ifnull          31
				flag = true;
	//   15   28:iconst_1        
	//   16   29:istore          4
			return flag;
	//   17   31:iload           4
	//   18   33:ireturn         
		}
		List list = (List)b1.e.get(((Object) (s)));
	//   19   34:aload_2         
	//   20   35:getfield        #171 <Field HashMap MediaBrowserServiceCompat$b.e>
	//   21   38:aload_1         
	//   22   39:invokevirtual   #177 <Method Object HashMap.get(Object)>
	//   23   42:checkcast       #97  <Class List>
	//   24   45:astore          7
		flag1 = flag2;
	//   25   47:iload           6
	//   26   49:istore          5
		if(list != null)
	//*  27   51:aload           7
	//*  28   53:ifnull          132
		{
			Iterator iterator = list.iterator();
	//   29   56:aload           7
	//   30   58:invokeinterface #184 <Method Iterator List.iterator()>
	//   31   63:astore          8
			do
			{
				if(!iterator.hasNext())
					break;
	//   32   65:aload           8
	//   33   67:invokeinterface #189 <Method boolean Iterator.hasNext()>
	//   34   72:ifeq            105
				if(ibinder == ((j)iterator.next()).a)
	//*  35   75:aload_3         
	//*  36   76:aload           8
	//*  37   78:invokeinterface #193 <Method Object Iterator.next()>
	//*  38   83:checkcast       #195 <Class j>
	//*  39   86:getfield        #198 <Field Object j.a>
	//*  40   89:if_acmpne       65
				{
					iterator.remove();
	//   41   92:aload           8
	//   42   94:invokeinterface #246 <Method void Iterator.remove()>
					flag = true;
	//   43   99:iconst_1        
	//   44  100:istore          4
				}
			} while(true);
	//   45  102:goto            65
			flag1 = flag;
	//   46  105:iload           4
	//   47  107:istore          5
			if(list.size() == 0)
	//*  48  109:aload           7
	//*  49  111:invokeinterface #101 <Method int List.size()>
	//*  50  116:ifne            132
			{
				b1.e.remove(((Object) (s)));
	//   51  119:aload_2         
	//   52  120:getfield        #171 <Field HashMap MediaBrowserServiceCompat$b.e>
	//   53  123:aload_1         
	//   54  124:invokevirtual   #244 <Method Object HashMap.remove(Object)>
	//   55  127:pop             
				flag1 = flag;
	//   56  128:iload           4
	//   57  130:istore          5
			}
		}
		return flag1;
	//   58  132:iload           5
	//   59  134:ireturn         
	}

	void b(String s, Bundle bundle, b b1, ResultReceiver resultreceiver)
	{
		resultreceiver = ((ResultReceiver) (new c(((Object) (s)), resultreceiver) {

			void a(Bundle bundle1)
			{
				a.b(0, bundle1);
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

			void b(Bundle bundle1)
			{
				a.b(-1, bundle1);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field ResultReceiver a>
			//    2    4:iconst_m1       
			//    3    5:aload_1         
			//    4    6:invokevirtual   #29  <Method void ResultReceiver.b(int, Bundle)>
			//    5    9:return          
			}

			final ResultReceiver a;
			final MediaBrowserServiceCompat b;

			
			{
				b = MediaBrowserServiceCompat.this;
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
));
	//    0    0:new             #12  <Class MediaBrowserServiceCompat$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload           4
	//    5    8:invokespecial   #247 <Method void MediaBrowserServiceCompat$4(MediaBrowserServiceCompat, Object, ResultReceiver)>
	//    6   11:astore          4
		c = b1;
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:putfield        #119 <Field MediaBrowserServiceCompat$b c>
		b(s, bundle, ((c) (resultreceiver)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload           4
	//   14   23:invokevirtual   #249 <Method void b(String, Bundle, MediaBrowserServiceCompat$c)>
		c = null;
	//   15   26:aload_0         
	//   16   27:aconst_null     
	//   17   28:putfield        #119 <Field MediaBrowserServiceCompat$b c>
		if(!((c) (resultreceiver)).a())
	//*  18   31:aload           4
	//*  19   33:invokevirtual   #125 <Method boolean android.support.v4.media.MediaBrowserServiceCompat$c.a()>
	//*  20   36:ifne            85
		{
			b1 = ((b) (new StringBuilder()));
	//   21   39:new             #127 <Class StringBuilder>
	//   22   42:dup             
	//   23   43:invokespecial   #128 <Method void StringBuilder()>
	//   24   46:astore_3        
			((StringBuilder) (b1)).append("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
	//   25   47:aload_3         
	//   26   48:ldc1            #251 <String "onCustomAction must call detach() or sendResult() or sendError() before returning for action=">
	//   27   50:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   28   53:pop             
			((StringBuilder) (b1)).append(s);
	//   29   54:aload_3         
	//   30   55:aload_1         
	//   31   56:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   32   59:pop             
			((StringBuilder) (b1)).append(" extras=");
	//   33   60:aload_3         
	//   34   61:ldc1            #253 <String " extras=">
	//   35   63:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   36   66:pop             
			((StringBuilder) (b1)).append(((Object) (bundle)));
	//   37   67:aload_3         
	//   38   68:aload_2         
	//   39   69:invokevirtual   #256 <Method StringBuilder StringBuilder.append(Object)>
	//   40   72:pop             
			throw new IllegalStateException(((StringBuilder) (b1)).toString());
	//   41   73:new             #136 <Class IllegalStateException>
	//   42   76:dup             
	//   43   77:aload_3         
	//   44   78:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   45   81:invokespecial   #143 <Method void IllegalStateException(String)>
	//   46   84:athrow          
		} else
		{
			return;
	//   47   85:return          
		}
	}

	public void b(String s, Bundle bundle, c c1)
	{
		c1.c(((Bundle) (null)));
	//    0    0:aload_3         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #259 <Method void MediaBrowserServiceCompat$c.c(Bundle)>
	//    3    5:return          
	}

	public void b(String s, c c1)
	{
		c1.a(2);
	//    0    0:aload_2         
	//    1    1:iconst_2        
	//    2    2:invokevirtual   #146 <Method void android.support.v4.media.MediaBrowserServiceCompat$c.a(int)>
		c1.b(((Object) (null)));
	//    3    5:aload_2         
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #149 <Method void MediaBrowserServiceCompat$c.b(Object)>
	//    6   10:return          
	}

	static final boolean a = Log.isLoggable("MBServiceCompat", 3);
	final android.support.v4.f.a b = new android.support.v4.f.a();
	b c;
	final g d = new g();
	android.support.v4.media.session.MediaSessionCompat.Token e;

	static 
	{
	//    0    0:ldc1            #61  <String "MBServiceCompat">
	//    1    2:iconst_3        
	//    2    3:invokestatic    #67  <Method boolean Log.isLoggable(String, int)>
	//    3    6:putstatic       #69  <Field boolean a>
	//*   4    9:return          
	}
}
