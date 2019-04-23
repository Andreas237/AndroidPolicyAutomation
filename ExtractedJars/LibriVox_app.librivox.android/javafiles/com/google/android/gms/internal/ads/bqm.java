// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.ads.internal.aw;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			p, bwk, m, brc, 
//			wi, aag, xg, bqn, 
//			bqo, wx

final class bqm
	implements android.app.Application.ActivityLifecycleCallbacks
{

	bqm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #32  <Method void Object()>
	//    6   12:putfield        #34  <Field Object c>
		d = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #36  <Field boolean d>
		e = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #38  <Field boolean e>
	//   13   25:aload_0         
	//   14   26:new             #40  <Class ArrayList>
	//   15   29:dup             
	//   16   30:invokespecial   #41  <Method void ArrayList()>
	//   17   33:putfield        #43  <Field List f>
	//   18   36:aload_0         
	//   19   37:new             #40  <Class ArrayList>
	//   20   40:dup             
	//   21   41:invokespecial   #41  <Method void ArrayList()>
	//   22   44:putfield        #45  <Field List g>
		i = false;
	//   23   47:aload_0         
	//   24   48:iconst_0        
	//   25   49:putfield        #47  <Field boolean i>
	//   26   52:return          
	}

	static Object a(bqm bqm1)
	{
		return bqm1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Object c>
	//    2    4:areturn         
	}

	private final void a(Activity activity)
	{
		synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Object c>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(!((Object) (activity)).getClass().getName().startsWith("com.google.android.gms.ads"))
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #54  <Method Class Object.getClass()>
	//*   7   11:invokevirtual   #60  <Method String Class.getName()>
	//*   8   14:ldc1            #62  <String "com.google.android.gms.ads">
	//*   9   16:invokevirtual   #68  <Method boolean String.startsWith(String)>
	//*  10   19:ifne            27
				a = activity;
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:putfield        #70  <Field Activity a>
		}
	//   14   27:aload_2         
	//   15   28:monitorexit     
		return;
	//   16   29:return          
		activity;
	//   17   30:astore_1        
		obj;
	//   18   31:aload_2         
		JVM INSTR monitorexit ;
	//   19   32:monitorexit     
		throw activity;
	//   20   33:aload_1         
	//   21   34:athrow          
	}

	static boolean a(bqm bqm1, boolean flag)
	{
		bqm1.d = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #36  <Field boolean d>
		return false;
	//    3    5:iconst_0        
	//    4    6:ireturn         
	}

	static boolean b(bqm bqm1)
	{
		return bqm1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean d>
	//    2    4:ireturn         
	}

	static boolean c(bqm bqm1)
	{
		return bqm1.e;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field boolean e>
	//    2    4:ireturn         
	}

	static List d(bqm bqm1)
	{
		return bqm1.f;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List f>
	//    2    4:areturn         
	}

	public final Activity a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Activity a>
	//    2    4:areturn         
	}

	public final void a(Application application, Context context)
	{
		if(!i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field boolean i>
	//*   2    4:ifne            58
		{
			application.registerActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (this)));
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #81  <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
			if(context instanceof Activity)
	//*   6   12:aload_2         
	//*   7   13:instanceof      #83  <Class Activity>
	//*   8   16:ifeq            27
				a((Activity)context);
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:checkcast       #83  <Class Activity>
	//   12   24:invokespecial   #85  <Method void a(Activity)>
			b = ((Context) (application));
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #87  <Field Context b>
			application = ((Application) (p.au));
	//   16   32:getstatic       #93  <Field e p.au>
	//   17   35:astore_1        
			j = ((Long)bwk.e().a(((e) (application)))).longValue();
	//   18   36:aload_0         
	//   19   37:invokestatic    #98  <Method m bwk.e()>
	//   20   40:aload_1         
	//   21   41:invokevirtual   #103 <Method Object m.a(e)>
	//   22   44:checkcast       #105 <Class Long>
	//   23   47:invokevirtual   #109 <Method long Long.longValue()>
	//   24   50:putfield        #111 <Field long j>
			i = true;
	//   25   53:aload_0         
	//   26   54:iconst_1        
	//   27   55:putfield        #47  <Field boolean i>
		}
	//   28   58:return          
	}

	public final void a(bqo bqo1)
	{
		synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Object c>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			f.add(((Object) (bqo1)));
	//    5    7:aload_0         
	//    6    8:getfield        #43  <Field List f>
	//    7   11:aload_1         
	//    8   12:invokeinterface #118 <Method boolean List.add(Object)>
	//    9   17:pop             
		}
	//   10   18:aload_2         
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		bqo1;
	//   13   21:astore_1        
		obj;
	//   14   22:aload_2         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		throw bqo1;
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	public final Context b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field Context b>
	//    2    4:areturn         
	}

	public final void onActivityCreated(Activity activity, Bundle bundle)
	{
	//    0    0:return          
	}

	public final void onActivityDestroyed(Activity activity)
	{
label0:
		{
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Object c>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(a != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #70  <Field Activity a>
	//    7   11:ifnonnull       17
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		Iterator iterator;
		if(((Object) (a)).equals(((Object) (activity))))
	//*  11   17:aload_0         
	//*  12   18:getfield        #70  <Field Activity a>
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #127 <Method boolean Object.equals(Object)>
	//*  15   25:ifeq            33
			a = null;
	//   16   28:aload_0         
	//   17   29:aconst_null     
	//   18   30:putfield        #70  <Field Activity a>
		iterator = g.iterator();
	//   19   33:aload_0         
	//   20   34:getfield        #45  <Field List g>
	//   21   37:invokeinterface #131 <Method Iterator List.iterator()>
	//   22   42:astore_3        
_L2:
		brc brc1;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_105;
	//   23   43:aload_3         
	//   24   44:invokeinterface #137 <Method boolean Iterator.hasNext()>
	//   25   49:ifeq            105
		brc1 = (brc)iterator.next();
	//   26   52:aload_3         
	//   27   53:invokeinterface #141 <Method Object Iterator.next()>
	//   28   58:checkcast       #143 <Class brc>
	//   29   61:astore          4
		if(!brc1.c(activity)) goto _L2; else goto _L1
	//   30   63:aload           4
	//   31   65:aload_1         
	//   32   66:invokeinterface #146 <Method boolean brc.c(Activity)>
	//   33   71:ifeq            43
_L1:
		iterator.remove();
	//   34   74:aload_3         
	//   35   75:invokeinterface #149 <Method void Iterator.remove()>
		  goto _L2
	//*  36   80:goto            43
		Exception exception;
		exception;
	//   37   83:astore          4
		aw.i().a(((Throwable) (exception)), "AppActivityTracker.ActivityListener.onActivityDestroyed");
	//   38   85:invokestatic    #154 <Method wi aw.i()>
	//   39   88:aload           4
	//   40   90:ldc1            #156 <String "AppActivityTracker.ActivityListener.onActivityDestroyed">
	//   41   92:invokevirtual   #161 <Method void wi.a(Throwable, String)>
		aag.b("", ((Throwable) (exception)));
	//   42   95:ldc1            #163 <String "">
	//   43   97:aload           4
	//   44   99:invokestatic    #168 <Method void aag.b(String, Throwable)>
		  goto _L2
	//*  45  102:goto            43
		obj;
	//   46  105:aload_2         
		JVM INSTR monitorexit ;
	//   47  106:monitorexit     
		return;
	//   48  107:return          
		activity;
	//   49  108:astore_1        
		obj;
	//   50  109:aload_2         
		JVM INSTR monitorexit ;
	//   51  110:monitorexit     
		throw activity;
	//   52  111:aload_1         
	//   53  112:athrow          
	}

	public final void onActivityPaused(Activity activity)
	{
		a(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #85  <Method void a(Activity)>
		Object obj = c;
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field Object c>
	//    5    9:astore_2        
		obj;
	//    6   10:aload_2         
		JVM INSTR monitorenter ;
	//    7   11:monitorenter    
		Iterator iterator = g.iterator();
	//    8   12:aload_0         
	//    9   13:getfield        #45  <Field List g>
	//   10   16:invokeinterface #131 <Method Iterator List.iterator()>
	//   11   21:astore_3        
_L1:
		brc brc1;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_75;
	//   12   22:aload_3         
	//   13   23:invokeinterface #137 <Method boolean Iterator.hasNext()>
	//   14   28:ifeq            75
		brc1 = (brc)iterator.next();
	//   15   31:aload_3         
	//   16   32:invokeinterface #141 <Method Object Iterator.next()>
	//   17   37:checkcast       #143 <Class brc>
	//   18   40:astore          4
		brc1.b(activity);
	//   19   42:aload           4
	//   20   44:aload_1         
	//   21   45:invokeinterface #171 <Method void brc.b(Activity)>
		  goto _L1
	//*  22   50:goto            22
		Exception exception;
		exception;
	//   23   53:astore          4
		aw.i().a(((Throwable) (exception)), "AppActivityTracker.ActivityListener.onActivityPaused");
	//   24   55:invokestatic    #154 <Method wi aw.i()>
	//   25   58:aload           4
	//   26   60:ldc1            #173 <String "AppActivityTracker.ActivityListener.onActivityPaused">
	//   27   62:invokevirtual   #161 <Method void wi.a(Throwable, String)>
		aag.b("", ((Throwable) (exception)));
	//   28   65:ldc1            #163 <String "">
	//   29   67:aload           4
	//   30   69:invokestatic    #168 <Method void aag.b(String, Throwable)>
		  goto _L1
	//*  31   72:goto            22
		obj;
	//   32   75:aload_2         
		JVM INSTR monitorexit ;
	//   33   76:monitorexit     
		e = true;
	//   34   77:aload_0         
	//   35   78:iconst_1        
	//   36   79:putfield        #38  <Field boolean e>
		if(h != null)
	//*  37   82:aload_0         
	//*  38   83:getfield        #175 <Field Runnable h>
	//*  39   86:ifnull          99
			xg.a.removeCallbacks(h);
	//   40   89:getstatic       #180 <Field Handler xg.a>
	//   41   92:aload_0         
	//   42   93:getfield        #175 <Field Runnable h>
	//   43   96:invokevirtual   #186 <Method void Handler.removeCallbacks(Runnable)>
		activity = ((Activity) (xg.a));
	//   44   99:getstatic       #180 <Field Handler xg.a>
	//   45  102:astore_1        
		obj = ((Object) (new bqn(this)));
	//   46  103:new             #188 <Class bqn>
	//   47  106:dup             
	//   48  107:aload_0         
	//   49  108:invokespecial   #191 <Method void bqn(bqm)>
	//   50  111:astore_2        
		h = ((Runnable) (obj));
	//   51  112:aload_0         
	//   52  113:aload_2         
	//   53  114:putfield        #175 <Field Runnable h>
		((Handler) (activity)).postDelayed(((Runnable) (obj)), j);
	//   54  117:aload_1         
	//   55  118:aload_2         
	//   56  119:aload_0         
	//   57  120:getfield        #111 <Field long j>
	//   58  123:invokevirtual   #195 <Method boolean Handler.postDelayed(Runnable, long)>
	//   59  126:pop             
		return;
	//   60  127:return          
		activity;
	//   61  128:astore_1        
		obj;
	//   62  129:aload_2         
		JVM INSTR monitorexit ;
	//   63  130:monitorexit     
		throw activity;
	//   64  131:aload_1         
	//   65  132:athrow          
	}

	public final void onActivityResumed(Activity activity)
	{
		boolean flag;
		a(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #85  <Method void a(Activity)>
		e = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #38  <Field boolean e>
		flag = d;
	//    6   10:aload_0         
	//    7   11:getfield        #36  <Field boolean d>
	//    8   14:istore_2        
		d = true;
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:putfield        #36  <Field boolean d>
		if(h != null)
	//*  12   20:aload_0         
	//*  13   21:getfield        #175 <Field Runnable h>
	//*  14   24:ifnull          37
			xg.a.removeCallbacks(h);
	//   15   27:getstatic       #180 <Field Handler xg.a>
	//   16   30:aload_0         
	//   17   31:getfield        #175 <Field Runnable h>
	//   18   34:invokevirtual   #186 <Method void Handler.removeCallbacks(Runnable)>
		Object obj = c;
	//   19   37:aload_0         
	//   20   38:getfield        #34  <Field Object c>
	//   21   41:astore_3        
		obj;
	//   22   42:aload_3         
		JVM INSTR monitorenter ;
	//   23   43:monitorenter    
		Object obj1 = ((Object) (g.iterator()));
	//   24   44:aload_0         
	//   25   45:getfield        #45  <Field List g>
	//   26   48:invokeinterface #131 <Method Iterator List.iterator()>
	//   27   53:astore          4
_L1:
		brc brc1;
		if(!((Iterator) (obj1)).hasNext())
			break MISSING_BLOCK_LABEL_110;
	//   28   55:aload           4
	//   29   57:invokeinterface #137 <Method boolean Iterator.hasNext()>
	//   30   62:ifeq            110
		brc1 = (brc)((Iterator) (obj1)).next();
	//   31   65:aload           4
	//   32   67:invokeinterface #141 <Method Object Iterator.next()>
	//   33   72:checkcast       #143 <Class brc>
	//   34   75:astore          5
		brc1.a(activity);
	//   35   77:aload           5
	//   36   79:aload_1         
	//   37   80:invokeinterface #197 <Method void brc.a(Activity)>
		  goto _L1
	//*  38   85:goto            55
		Exception exception1;
		exception1;
	//   39   88:astore          5
		aw.i().a(((Throwable) (exception1)), "AppActivityTracker.ActivityListener.onActivityResumed");
	//   40   90:invokestatic    #154 <Method wi aw.i()>
	//   41   93:aload           5
	//   42   95:ldc1            #199 <String "AppActivityTracker.ActivityListener.onActivityResumed">
	//   43   97:invokevirtual   #161 <Method void wi.a(Throwable, String)>
		aag.b("", ((Throwable) (exception1)));
	//   44  100:ldc1            #163 <String "">
	//   45  102:aload           5
	//   46  104:invokestatic    #168 <Method void aag.b(String, Throwable)>
		  goto _L1
	//*  47  107:goto            55
		if(!(flag ^ true))
			break MISSING_BLOCK_LABEL_169;
	//   48  110:iload_2         
	//   49  111:iconst_1        
	//   50  112:ixor            
	//   51  113:ifeq            169
		activity = ((Activity) (f.iterator()));
	//   52  116:aload_0         
	//   53  117:getfield        #43  <Field List f>
	//   54  120:invokeinterface #131 <Method Iterator List.iterator()>
	//   55  125:astore_1        
_L2:
		if(!((Iterator) (activity)).hasNext())
			break MISSING_BLOCK_LABEL_174;
	//   56  126:aload_1         
	//   57  127:invokeinterface #137 <Method boolean Iterator.hasNext()>
	//   58  132:ifeq            174
		obj1 = ((Object) ((bqo)((Iterator) (activity)).next()));
	//   59  135:aload_1         
	//   60  136:invokeinterface #141 <Method Object Iterator.next()>
	//   61  141:checkcast       #201 <Class bqo>
	//   62  144:astore          4
		((bqo) (obj1)).a(true);
	//   63  146:aload           4
	//   64  148:iconst_1        
	//   65  149:invokeinterface #204 <Method void bqo.a(boolean)>
		  goto _L2
	//*  66  154:goto            126
		Exception exception;
		exception;
	//   67  157:astore          4
		aag.b("", ((Throwable) (exception)));
	//   68  159:ldc1            #163 <String "">
	//   69  161:aload           4
	//   70  163:invokestatic    #168 <Method void aag.b(String, Throwable)>
		  goto _L2
	//*  71  166:goto            126
		wx.b("App is still foreground.");
	//   72  169:ldc1            #206 <String "App is still foreground.">
	//   73  171:invokestatic    #211 <Method void wx.b(String)>
		obj;
	//   74  174:aload_3         
		JVM INSTR monitorexit ;
	//   75  175:monitorexit     
		return;
	//   76  176:return          
		activity;
	//   77  177:astore_1        
		obj;
	//   78  178:aload_3         
		JVM INSTR monitorexit ;
	//   79  179:monitorexit     
		throw activity;
	//   80  180:aload_1         
	//   81  181:athrow          
	}

	public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
	{
	//    0    0:return          
	}

	public final void onActivityStarted(Activity activity)
	{
		a(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #85  <Method void a(Activity)>
	//    3    5:return          
	}

	public final void onActivityStopped(Activity activity)
	{
	//    0    0:return          
	}

	private Activity a;
	private Context b;
	private final Object c = new Object();
	private boolean d;
	private boolean e;
	private final List f = new ArrayList();
	private final List g = new ArrayList();
	private Runnable h;
	private boolean i;
	private long j;
}
