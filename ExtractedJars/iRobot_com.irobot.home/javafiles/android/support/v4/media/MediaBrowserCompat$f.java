// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.app.BundleCompat;
import android.support.v4.f.a;
import android.util.Log;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat, a

static class MediaBrowserCompat$f
	implements a, MediaBrowserCompat$e, MediaBrowserCompat$j
{

	public void a()
	{
		RemoteException remoteexception;
		Object obj = ((Object) (android.support.v4.media.a.c(b)));
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Object b>
	//    2    4:invokestatic    #82  <Method Bundle a.c(Object)>
	//    3    7:astore_1        
		if(obj == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		android.os.IBinder ibinder = BundleCompat.getBinder(((Bundle) (obj)), "extra_messenger");
	//    7   13:aload_1         
	//    8   14:ldc1            #84  <String "extra_messenger">
	//    9   16:invokestatic    #90  <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//   10   19:astore_2        
		if(ibinder != null)
	//*  11   20:aload_2         
	//*  12   21:ifnull          88
		{
			e = new MediaBrowserCompat$l(ibinder, c);
	//   13   24:aload_0         
	//   14   25:new             #92  <Class MediaBrowserCompat$l>
	//   15   28:dup             
	//   16   29:aload_2         
	//   17   30:aload_0         
	//   18   31:getfield        #62  <Field Bundle c>
	//   19   34:invokespecial   #95  <Method void MediaBrowserCompat$l(android.os.IBinder, Bundle)>
	//   20   37:putfield        #97  <Field MediaBrowserCompat$l e>
			f = new Messenger(((android.os.Handler) (d)));
	//   21   40:aload_0         
	//   22   41:new             #99  <Class Messenger>
	//   23   44:dup             
	//   24   45:aload_0         
	//   25   46:getfield        #41  <Field MediaBrowserCompat$a d>
	//   26   49:invokespecial   #102 <Method void Messenger(android.os.Handler)>
	//   27   52:putfield        #104 <Field Messenger f>
			d.a(f);
	//   28   55:aload_0         
	//   29   56:getfield        #41  <Field MediaBrowserCompat$a d>
	//   30   59:aload_0         
	//   31   60:getfield        #104 <Field Messenger f>
	//   32   63:invokevirtual   #107 <Method void android.support.v4.media.MediaBrowserCompat$a.a(Messenger)>
			try
			{
				e.b(f);
	//   33   66:aload_0         
	//   34   67:getfield        #97  <Field MediaBrowserCompat$l e>
	//   35   70:aload_0         
	//   36   71:getfield        #104 <Field Messenger f>
	//   37   74:invokevirtual   #109 <Method void MediaBrowserCompat$l.b(Messenger)>
			}
	//*  38   77:goto            88
	//*  39   80:ldc1            #111 <String "MediaBrowserCompat">
	//*  40   82:ldc1            #113 <String "Remote error registering client messenger.">
	//*  41   84:invokestatic    #119 <Method int Log.i(String, String)>
	//*  42   87:pop             
	//*  43   88:aload_1         
	//*  44   89:ldc1            #121 <String "extra_session_binder">
	//*  45   91:invokestatic    #90  <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//*  46   94:invokestatic    #126 <Method android.support.v4.media.session.b android.support.v4.media.session.b$a.a(android.os.IBinder)>
	//*  47   97:astore_1        
	//*  48   98:aload_1         
	//*  49   99:ifnull          117
	//*  50  102:aload_0         
	//*  51  103:aload_0         
	//*  52  104:getfield        #76  <Field Object b>
	//*  53  107:invokestatic    #129 <Method Object a.d(Object)>
	//*  54  110:aload_1         
	//*  55  111:invokestatic    #134 <Method android.support.v4.media.session.MediaSessionCompat$Token android.support.v4.media.session.MediaSessionCompat$Token.a(Object, android.support.v4.media.session.b)>
	//*  56  114:putfield        #136 <Field android.support.v4.media.session.MediaSessionCompat$Token h>
	//*  57  117:return          
			// Misplaced declaration of an exception variable
			catch(RemoteException remoteexception)
			{
				Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
			}
		}
		obj = ((Object) (android.support.v4.media.session.b.a.a(BundleCompat.getBinder(((Bundle) (obj)), "extra_session_binder"))));
		if(obj != null)
			h = android.support.v4.media.session.ken.a(android.support.v4.media.a.d(b), ((android.support.v4.media.session.b) (obj)));
	//*  58  118:astore_2        
	//*  59  119:goto            80
	}

	public void a(Messenger messenger)
	{
	//    0    0:return          
	}

	public void a(Messenger messenger, String s, android.support.v4.media.session.ken ken, Bundle bundle)
	{
	//    0    0:return          
	}

	public void a(Messenger messenger, String s, List list, Bundle bundle)
	{
		if(f != messenger)
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field Messenger f>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       9
			return;
	//    4    8:return          
		messenger = ((Messenger) ((MediaBrowserCompat$m)g.get(((Object) (s)))));
	//    5    9:aload_0         
	//    6   10:getfield        #46  <Field a g>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #141 <Method Object a.get(Object)>
	//    9   17:checkcast       #143 <Class MediaBrowserCompat$m>
	//   10   20:astore_1        
		if(messenger == null)
	//*  11   21:aload_1         
	//*  12   22:ifnonnull       63
		{
			if(android.support.v4.media.MediaBrowserCompat.a)
	//*  13   25:getstatic       #146 <Field boolean android.support.v4.media.MediaBrowserCompat.a>
	//*  14   28:ifeq            62
			{
				messenger = ((Messenger) (new StringBuilder()));
	//   15   31:new             #148 <Class StringBuilder>
	//   16   34:dup             
	//   17   35:invokespecial   #149 <Method void StringBuilder()>
	//   18   38:astore_1        
				((StringBuilder) (messenger)).append("onLoadChildren for id that isn't subscribed id=");
	//   19   39:aload_1         
	//   20   40:ldc1            #151 <String "onLoadChildren for id that isn't subscribed id=">
	//   21   42:invokevirtual   #155 <Method StringBuilder StringBuilder.append(String)>
	//   22   45:pop             
				((StringBuilder) (messenger)).append(s);
	//   23   46:aload_1         
	//   24   47:aload_2         
	//   25   48:invokevirtual   #155 <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
				Log.d("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
	//   27   52:ldc1            #111 <String "MediaBrowserCompat">
	//   28   54:aload_1         
	//   29   55:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   30   58:invokestatic    #161 <Method int Log.d(String, String)>
	//   31   61:pop             
			}
			return;
	//   32   62:return          
		}
		messenger = ((Messenger) (((MediaBrowserCompat$m) (messenger)).a(a, bundle)));
	//   33   63:aload_1         
	//   34   64:aload_0         
	//   35   65:getfield        #48  <Field Context a>
	//   36   68:aload           4
	//   37   70:invokevirtual   #164 <Method MediaBrowserCompat$n android.support.v4.media.MediaBrowserCompat$m.a(Context, Bundle)>
	//   38   73:astore_1        
		if(messenger != null)
	//*  39   74:aload_1         
	//*  40   75:ifnull          120
		{
			if(bundle == null)
	//*  41   78:aload           4
	//*  42   80:ifnonnull       100
				if(list == null)
	//*  43   83:aload_3         
	//*  44   84:ifnonnull       93
				{
					((MediaBrowserCompat$n) (messenger)).a(s);
	//   45   87:aload_1         
	//   46   88:aload_2         
	//   47   89:invokevirtual   #169 <Method void android.support.v4.media.MediaBrowserCompat$n.a(String)>
					return;
	//   48   92:return          
				} else
				{
					((MediaBrowserCompat$n) (messenger)).a(s, list);
	//   49   93:aload_1         
	//   50   94:aload_2         
	//   51   95:aload_3         
	//   52   96:invokevirtual   #172 <Method void android.support.v4.media.MediaBrowserCompat$n.a(String, List)>
					return;
	//   53   99:return          
				}
			if(list == null)
	//*  54  100:aload_3         
	//*  55  101:ifnonnull       112
			{
				((MediaBrowserCompat$n) (messenger)).a(s, bundle);
	//   56  104:aload_1         
	//   57  105:aload_2         
	//   58  106:aload           4
	//   59  108:invokevirtual   #175 <Method void android.support.v4.media.MediaBrowserCompat$n.a(String, Bundle)>
				return;
	//   60  111:return          
			}
			((MediaBrowserCompat$n) (messenger)).a(s, list, bundle);
	//   61  112:aload_1         
	//   62  113:aload_2         
	//   63  114:aload_3         
	//   64  115:aload           4
	//   65  117:invokevirtual   #178 <Method void android.support.v4.media.MediaBrowserCompat$n.a(String, List, Bundle)>
		}
	//   66  120:return          
	}

	public void b()
	{
		e = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #97  <Field MediaBrowserCompat$l e>
		f = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #104 <Field Messenger f>
		h = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #136 <Field android.support.v4.media.session.MediaSessionCompat$Token h>
		d.a(((Messenger) (null)));
	//    9   15:aload_0         
	//   10   16:getfield        #41  <Field MediaBrowserCompat$a d>
	//   11   19:aconst_null     
	//   12   20:invokevirtual   #107 <Method void android.support.v4.media.MediaBrowserCompat$a.a(Messenger)>
	//   13   23:return          
	}

	public void c()
	{
	//    0    0:return          
	}

	public void d()
	{
		android.support.v4.media.a.a(b);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Object b>
	//    2    4:invokestatic    #181 <Method void android.support.v4.media.a.a(Object)>
	//    3    7:return          
	}

	public void e()
	{
		RemoteException remoteexception;
		if(e != null && f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field MediaBrowserCompat$l e>
	//*   2    4:ifnull          36
	//*   3    7:aload_0         
	//*   4    8:getfield        #104 <Field Messenger f>
	//*   5   11:ifnull          36
			try
			{
				e.c(f);
	//    6   14:aload_0         
	//    7   15:getfield        #97  <Field MediaBrowserCompat$l e>
	//    8   18:aload_0         
	//    9   19:getfield        #104 <Field Messenger f>
	//   10   22:invokevirtual   #183 <Method void MediaBrowserCompat$l.c(Messenger)>
			}
	//*  11   25:goto            36
	//*  12   28:ldc1            #111 <String "MediaBrowserCompat">
	//*  13   30:ldc1            #185 <String "Remote error unregistering client messenger.">
	//*  14   32:invokestatic    #119 <Method int Log.i(String, String)>
	//*  15   35:pop             
	//*  16   36:aload_0         
	//*  17   37:getfield        #76  <Field Object b>
	//*  18   40:invokestatic    #187 <Method void a.b(Object)>
	//*  19   43:return          
			// Misplaced declaration of an exception variable
			catch(RemoteException remoteexception)
			{
				Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
			}
		android.support.v4.media.a.b(b);
	//*  20   44:astore_1        
	//*  21   45:goto            28
	}

	public android.support.v4.media.session.ken f()
	{
		if(h == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #136 <Field android.support.v4.media.session.MediaSessionCompat$Token h>
	//*   2    4:ifnonnull       21
			h = android.support.v4.media.session.ken.a(android.support.v4.media.a.d(b));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #76  <Field Object b>
	//    6   12:invokestatic    #129 <Method Object a.d(Object)>
	//    7   15:invokestatic    #191 <Method android.support.v4.media.session.MediaSessionCompat$Token android.support.v4.media.session.MediaSessionCompat$Token.a(Object)>
	//    8   18:putfield        #136 <Field android.support.v4.media.session.MediaSessionCompat$Token h>
		return h;
	//    9   21:aload_0         
	//   10   22:getfield        #136 <Field android.support.v4.media.session.MediaSessionCompat$Token h>
	//   11   25:areturn         
	}

	final Context a;
	protected final Object b;
	protected final Bundle c;
	protected final MediaBrowserCompat$a d = new MediaBrowserCompat$a(((MediaBrowserCompat$j) (this)));
	protected MediaBrowserCompat$l e;
	protected Messenger f;
	private final a g = new a();
	private android.support.v4.media.session.ken h;

	public MediaBrowserCompat$f(Context context, ComponentName componentname, MediaBrowserCompat$b mediabrowsercompat$b, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #36  <Class MediaBrowserCompat$a>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #39  <Method void MediaBrowserCompat$a(MediaBrowserCompat$j)>
	//    7   13:putfield        #41  <Field MediaBrowserCompat$a d>
	//    8   16:aload_0         
	//    9   17:new             #43  <Class a>
	//   10   20:dup             
	//   11   21:invokespecial   #44  <Method void a()>
	//   12   24:putfield        #46  <Field a g>
		a = context;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #48  <Field Context a>
		Bundle bundle1 = bundle;
	//   16   32:aload           4
	//   17   34:astore          5
		if(bundle == null)
	//*  18   36:aload           4
	//*  19   38:ifnonnull       50
			bundle1 = new Bundle();
	//   20   41:new             #50  <Class Bundle>
	//   21   44:dup             
	//   22   45:invokespecial   #51  <Method void Bundle()>
	//   23   48:astore          5
		bundle1.putInt("extra_client_version", 1);
	//   24   50:aload           5
	//   25   52:ldc1            #53  <String "extra_client_version">
	//   26   54:iconst_1        
	//   27   55:invokevirtual   #57  <Method void Bundle.putInt(String, int)>
		c = new Bundle(bundle1);
	//   28   58:aload_0         
	//   29   59:new             #50  <Class Bundle>
	//   30   62:dup             
	//   31   63:aload           5
	//   32   65:invokespecial   #60  <Method void Bundle(Bundle)>
	//   33   68:putfield        #62  <Field Bundle c>
		mediabrowsercompat$b.a(((a) (this)));
	//   34   71:aload_3         
	//   35   72:aload_0         
	//   36   73:invokevirtual   #67  <Method void android.support.v4.media.MediaBrowserCompat$b.a(MediaBrowserCompat$b$a)>
		b = android.support.v4.media.a.a(context, componentname, mediabrowsercompat$b.a, c);
	//   37   76:aload_0         
	//   38   77:aload_1         
	//   39   78:aload_2         
	//   40   79:aload_3         
	//   41   80:getfield        #69  <Field Object android.support.v4.media.MediaBrowserCompat$b.a>
	//   42   83:aload_0         
	//   43   84:getfield        #62  <Field Bundle c>
	//   44   87:invokestatic    #74  <Method Object android.support.v4.media.a.a(Context, ComponentName, Object, Bundle)>
	//   45   90:putfield        #76  <Field Object b>
	//   46   93:return          
	}
}
