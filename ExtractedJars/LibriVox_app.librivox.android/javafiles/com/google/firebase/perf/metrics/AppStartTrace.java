// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.perf.metrics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.firebase-perf.*;
import com.google.firebase.perf.internal.*;
import com.google.firebase.perf.provider.FirebasePerfProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AppStartTrace
	implements android.app.Application.ActivityLifecycleCallbacks
{

	private AppStartTrace(h h1, x x1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		c = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #48  <Field boolean c>
		i = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #50  <Field boolean i>
		j = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #52  <Field zzbg j>
		k = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #54  <Field zzbg k>
		l = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #56  <Field zzbg l>
		m = false;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #58  <Field boolean m>
		d = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #60  <Field h d>
		e = x1;
	//   23   39:aload_0         
	//   24   40:aload_2         
	//   25   41:putfield        #62  <Field x e>
	//   26   44:return          
	}

	static zzbg a(AppStartTrace appstarttrace)
	{
		return appstarttrace.j;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field zzbg j>
	//    2    4:areturn         
	}

	public static AppStartTrace a()
	{
		if(b != null)
	//*   0    0:getstatic       #66  <Field AppStartTrace b>
	//*   1    3:ifnull          10
			return b;
	//    2    6:getstatic       #66  <Field AppStartTrace b>
	//    3    9:areturn         
		else
			return a(((h) (null)), new x());
	//    4   10:aconst_null     
	//    5   11:new             #68  <Class x>
	//    6   14:dup             
	//    7   15:invokespecial   #69  <Method void x()>
	//    8   18:invokestatic    #72  <Method AppStartTrace a(h, x)>
	//    9   21:areturn         
	}

	private static AppStartTrace a(h h1, x x1)
	{
		if(b != null)
			break MISSING_BLOCK_LABEL_39;
	//    0    0:getstatic       #66  <Field AppStartTrace b>
	//    1    3:ifnonnull       39
		com/google/firebase/perf/metrics/AppStartTrace;
	//    2    6:ldc1            #2   <Class AppStartTrace>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(b == null)
	//*   4    9:getstatic       #66  <Field AppStartTrace b>
	//*   5   12:ifnonnull       27
			b = new AppStartTrace(((h) (null)), x1);
	//    6   15:new             #2   <Class AppStartTrace>
	//    7   18:dup             
	//    8   19:aconst_null     
	//    9   20:aload_1         
	//   10   21:invokespecial   #74  <Method void AppStartTrace(h, x)>
	//   11   24:putstatic       #66  <Field AppStartTrace b>
		com/google/firebase/perf/metrics/AppStartTrace;
	//   12   27:ldc1            #2   <Class AppStartTrace>
		JVM INSTR monitorexit ;
	//   13   29:monitorexit     
		break MISSING_BLOCK_LABEL_39;
	//   14   30:goto            39
		h1;
	//   15   33:astore_0        
		com/google/firebase/perf/metrics/AppStartTrace;
	//   16   34:ldc1            #2   <Class AppStartTrace>
		JVM INSTR monitorexit ;
	//   17   36:monitorexit     
		throw h1;
	//   18   37:aload_0         
	//   19   38:athrow          
		return b;
	//   20   39:getstatic       #66  <Field AppStartTrace b>
	//   21   42:areturn         
	}

	static boolean a(AppStartTrace appstarttrace, boolean flag)
	{
		appstarttrace.m = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #58  <Field boolean m>
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
	}

	private final void b()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = c;
	//    2    2:aload_0         
	//    3    3:getfield        #48  <Field boolean c>
	//    4    6:istore_1        
		if(flag)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:iload_1         
	//    6    8:ifne            14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		((Application)f).unregisterActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (this)));
	//   10   14:aload_0         
	//   11   15:getfield        #77  <Field Context f>
	//   12   18:checkcast       #79  <Class Application>
	//   13   21:aload_0         
	//   14   22:invokevirtual   #83  <Method void Application.unregisterActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
		c = false;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #48  <Field boolean c>
		this;
	//   18   30:aload_0         
		JVM INSTR monitorexit ;
	//   19   31:monitorexit     
		return;
	//   20   32:return          
		Exception exception;
		exception;
	//   21   33:astore_2        
	//*  22   34:aload_0         
		throw exception;
	//   23   35:monitorexit     
	//   24   36:aload_2         
	//   25   37:athrow          
	}

	public static void setLauncherActivityOnCreateTime(String s)
	{
	//    0    0:return          
	}

	public static void setLauncherActivityOnResumeTime(String s)
	{
	//    0    0:return          
	}

	public static void setLauncherActivityOnStartTime(String s)
	{
	//    0    0:return          
	}

	public final void a(Context context)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = c;
	//    2    2:aload_0         
	//    3    3:getfield        #48  <Field boolean c>
	//    4    6:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:iload_2         
	//    6    8:ifeq            14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		context = context.getApplicationContext();
	//   10   14:aload_1         
	//   11   15:invokevirtual   #96  <Method Context Context.getApplicationContext()>
	//   12   18:astore_1        
		if(context instanceof Application)
	//*  13   19:aload_1         
	//*  14   20:instanceof      #79  <Class Application>
	//*  15   23:ifeq            44
		{
			((Application)context).registerActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (this)));
	//   16   26:aload_1         
	//   17   27:checkcast       #79  <Class Application>
	//   18   30:aload_0         
	//   19   31:invokevirtual   #99  <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
			c = true;
	//   20   34:aload_0         
	//   21   35:iconst_1        
	//   22   36:putfield        #48  <Field boolean c>
			f = context;
	//   23   39:aload_0         
	//   24   40:aload_1         
	//   25   41:putfield        #77  <Field Context f>
		}
		this;
	//   26   44:aload_0         
		JVM INSTR monitorexit ;
	//   27   45:monitorexit     
		return;
	//   28   46:return          
		context;
	//   29   47:astore_1        
	//*  30   48:aload_0         
		throw context;
	//   31   49:monitorexit     
	//   32   50:aload_1         
	//   33   51:athrow          
	}

	public void onActivityCreated(Activity activity, Bundle bundle)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		SessionManager.zzcn().zzc(ax.b);
	//    2    2:invokestatic    #107 <Method SessionManager SessionManager.zzcn()>
	//    3    5:getstatic       #112 <Field ax ax.b>
	//    4    8:invokevirtual   #116 <Method void SessionManager.zzc(ax)>
		if(m || j != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #58  <Field boolean m>
	//*   7   15:ifne            76
	//*   8   18:aload_0         
	//*   9   19:getfield        #52  <Field zzbg j>
	//*  10   22:ifnull          28
			break MISSING_BLOCK_LABEL_76;
	//   11   25:goto            76
		g = new WeakReference(((Object) (activity)));
	//   12   28:aload_0         
	//   13   29:new             #118 <Class WeakReference>
	//   14   32:dup             
	//   15   33:aload_1         
	//   16   34:invokespecial   #121 <Method void WeakReference(Object)>
	//   17   37:putfield        #123 <Field WeakReference g>
		j = new zzbg();
	//   18   40:aload_0         
	//   19   41:new             #125 <Class zzbg>
	//   20   44:dup             
	//   21   45:invokespecial   #126 <Method void zzbg()>
	//   22   48:putfield        #52  <Field zzbg j>
		if(FirebasePerfProvider.zzda().a(j) > a)
	//*  23   51:invokestatic    #132 <Method zzbg FirebasePerfProvider.zzda()>
	//*  24   54:aload_0         
	//*  25   55:getfield        #52  <Field zzbg j>
	//*  26   58:invokevirtual   #135 <Method long zzbg.a(zzbg)>
	//*  27   61:getstatic       #41  <Field long a>
	//*  28   64:lcmp            
	//*  29   65:ifle            73
			i = true;
	//   30   68:aload_0         
	//   31   69:iconst_1        
	//   32   70:putfield        #50  <Field boolean i>
		this;
	//   33   73:aload_0         
		JVM INSTR monitorexit ;
	//   34   74:monitorexit     
		return;
	//   35   75:return          
		this;
	//   36   76:aload_0         
		JVM INSTR monitorexit ;
	//   37   77:monitorexit     
		return;
	//   38   78:return          
		activity;
	//   39   79:astore_1        
	//*  40   80:aload_0         
		throw activity;
	//   41   81:monitorexit     
	//   42   82:aload_1         
	//   43   83:athrow          
	}

	public void onActivityDestroyed(Activity activity)
	{
	//    0    0:return          
	}

	public void onActivityPaused(Activity activity)
	{
	//    0    0:return          
	}

	public void onActivityResumed(Activity activity)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(m || l != null || i)
	//*   2    2:aload_0         
	//*   3    3:getfield        #58  <Field boolean m>
	//*   4    6:ifne            426
	//*   5    9:aload_0         
	//*   6   10:getfield        #56  <Field zzbg l>
	//*   7   13:ifnonnull       426
	//*   8   16:aload_0         
	//*   9   17:getfield        #50  <Field boolean i>
	//*  10   20:ifeq            26
			break MISSING_BLOCK_LABEL_426;
	//   11   23:goto            426
		h = new WeakReference(((Object) (activity)));
	//   12   26:aload_0         
	//   13   27:new             #118 <Class WeakReference>
	//   14   30:dup             
	//   15   31:aload_1         
	//   16   32:invokespecial   #121 <Method void WeakReference(Object)>
	//   17   35:putfield        #141 <Field WeakReference h>
		l = new zzbg();
	//   18   38:aload_0         
	//   19   39:new             #125 <Class zzbg>
	//   20   42:dup             
	//   21   43:invokespecial   #126 <Method void zzbg()>
	//   22   46:putfield        #56  <Field zzbg l>
		Object obj = ((Object) (FirebasePerfProvider.zzda()));
	//   23   49:invokestatic    #132 <Method zzbg FirebasePerfProvider.zzda()>
	//   24   52:astore          4
		activity = ((Activity) (((Object) (activity)).getClass().getName()));
	//   25   54:aload_1         
	//   26   55:invokevirtual   #145 <Method Class Object.getClass()>
	//   27   58:invokevirtual   #151 <Method String Class.getName()>
	//   28   61:astore_1        
		long l1 = ((zzbg) (obj)).a(l);
	//   29   62:aload           4
	//   30   64:aload_0         
	//   31   65:getfield        #56  <Field zzbg l>
	//   32   68:invokevirtual   #135 <Method long zzbg.a(zzbg)>
	//   33   71:lstore_2        
		Object obj1 = ((Object) (new StringBuilder(String.valueOf(((Object) (activity))).length() + 47)));
	//   34   72:new             #153 <Class StringBuilder>
	//   35   75:dup             
	//   36   76:aload_1         
	//   37   77:invokestatic    #159 <Method String String.valueOf(Object)>
	//   38   80:invokevirtual   #163 <Method int String.length()>
	//   39   83:bipush          47
	//   40   85:iadd            
	//   41   86:invokespecial   #166 <Method void StringBuilder(int)>
	//   42   89:astore          5
		((StringBuilder) (obj1)).append("onResume(): ");
	//   43   91:aload           5
	//   44   93:ldc1            #168 <String "onResume(): ">
	//   45   95:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   46   98:pop             
		((StringBuilder) (obj1)).append(((String) (activity)));
	//   47   99:aload           5
	//   48  101:aload_1         
	//   49  102:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   50  105:pop             
		((StringBuilder) (obj1)).append(": ");
	//   51  106:aload           5
	//   52  108:ldc1            #174 <String ": ">
	//   53  110:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   54  113:pop             
		((StringBuilder) (obj1)).append(l1);
	//   55  114:aload           5
	//   56  116:lload_2         
	//   57  117:invokevirtual   #177 <Method StringBuilder StringBuilder.append(long)>
	//   58  120:pop             
		((StringBuilder) (obj1)).append(" microseconds");
	//   59  121:aload           5
	//   60  123:ldc1            #179 <String " microseconds">
	//   61  125:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   62  128:pop             
		Log.d("FirebasePerformance", ((StringBuilder) (obj1)).toString());
	//   63  129:ldc1            #181 <String "FirebasePerformance">
	//   64  131:aload           5
	//   65  133:invokevirtual   #184 <Method String StringBuilder.toString()>
	//   66  136:invokestatic    #189 <Method int Log.d(String, String)>
	//   67  139:pop             
		activity = ((Activity) (cq.i().a(z.a.toString()).a(((zzbg) (obj)).b()).b(((zzbg) (obj)).a(l))));
	//   68  140:invokestatic    #194 <Method cr cq.i()>
	//   69  143:getstatic       #199 <Field z z.a>
	//   70  146:invokevirtual   #200 <Method String z.toString()>
	//   71  149:invokevirtual   #205 <Method cr cr.a(String)>
	//   72  152:aload           4
	//   73  154:invokevirtual   #208 <Method long zzbg.b()>
	//   74  157:invokevirtual   #211 <Method cr cr.a(long)>
	//   75  160:aload           4
	//   76  162:aload_0         
	//   77  163:getfield        #56  <Field zzbg l>
	//   78  166:invokevirtual   #135 <Method long zzbg.a(zzbg)>
	//   79  169:invokevirtual   #213 <Method cr cr.b(long)>
	//   80  172:astore_1        
		obj1 = ((Object) (new ArrayList(3)));
	//   81  173:new             #215 <Class ArrayList>
	//   82  176:dup             
	//   83  177:iconst_3        
	//   84  178:invokespecial   #216 <Method void ArrayList(int)>
	//   85  181:astore          5
		((List) (obj1)).add(((Object) ((cq)(ep)((eq) (cq.i().a(z.b.toString()).a(((zzbg) (obj)).b()).b(((zzbg) (obj)).a(j)))).l())));
	//   86  183:aload           5
	//   87  185:invokestatic    #194 <Method cr cq.i()>
	//   88  188:getstatic       #218 <Field z z.b>
	//   89  191:invokevirtual   #200 <Method String z.toString()>
	//   90  194:invokevirtual   #205 <Method cr cr.a(String)>
	//   91  197:aload           4
	//   92  199:invokevirtual   #208 <Method long zzbg.b()>
	//   93  202:invokevirtual   #211 <Method cr cr.a(long)>
	//   94  205:aload           4
	//   95  207:aload_0         
	//   96  208:getfield        #52  <Field zzbg j>
	//   97  211:invokevirtual   #135 <Method long zzbg.a(zzbg)>
	//   98  214:invokevirtual   #213 <Method cr cr.b(long)>
	//   99  217:invokevirtual   #223 <Method com.google.android.gms.internal.firebase_2D_perf.gd eq.l()>
	//  100  220:checkcast       #225 <Class ep>
	//  101  223:checkcast       #191 <Class cq>
	//  102  226:invokeinterface #231 <Method boolean List.add(Object)>
	//  103  231:pop             
		obj = ((Object) (cq.i()));
	//  104  232:invokestatic    #194 <Method cr cq.i()>
	//  105  235:astore          4
		((cr) (obj)).a(z.c.toString()).a(j.b()).b(j.a(k));
	//  106  237:aload           4
	//  107  239:getstatic       #233 <Field z z.c>
	//  108  242:invokevirtual   #200 <Method String z.toString()>
	//  109  245:invokevirtual   #205 <Method cr cr.a(String)>
	//  110  248:aload_0         
	//  111  249:getfield        #52  <Field zzbg j>
	//  112  252:invokevirtual   #208 <Method long zzbg.b()>
	//  113  255:invokevirtual   #211 <Method cr cr.a(long)>
	//  114  258:aload_0         
	//  115  259:getfield        #52  <Field zzbg j>
	//  116  262:aload_0         
	//  117  263:getfield        #54  <Field zzbg k>
	//  118  266:invokevirtual   #135 <Method long zzbg.a(zzbg)>
	//  119  269:invokevirtual   #213 <Method cr cr.b(long)>
	//  120  272:pop             
		((List) (obj1)).add(((Object) ((cq)(ep)((eq) (obj)).l())));
	//  121  273:aload           5
	//  122  275:aload           4
	//  123  277:invokevirtual   #223 <Method com.google.android.gms.internal.firebase_2D_perf.gd eq.l()>
	//  124  280:checkcast       #225 <Class ep>
	//  125  283:checkcast       #191 <Class cq>
	//  126  286:invokeinterface #231 <Method boolean List.add(Object)>
	//  127  291:pop             
		obj = ((Object) (cq.i()));
	//  128  292:invokestatic    #194 <Method cr cq.i()>
	//  129  295:astore          4
		((cr) (obj)).a(z.d.toString()).a(k.b()).b(k.a(l));
	//  130  297:aload           4
	//  131  299:getstatic       #235 <Field z z.d>
	//  132  302:invokevirtual   #200 <Method String z.toString()>
	//  133  305:invokevirtual   #205 <Method cr cr.a(String)>
	//  134  308:aload_0         
	//  135  309:getfield        #54  <Field zzbg k>
	//  136  312:invokevirtual   #208 <Method long zzbg.b()>
	//  137  315:invokevirtual   #211 <Method cr cr.a(long)>
	//  138  318:aload_0         
	//  139  319:getfield        #54  <Field zzbg k>
	//  140  322:aload_0         
	//  141  323:getfield        #56  <Field zzbg l>
	//  142  326:invokevirtual   #135 <Method long zzbg.a(zzbg)>
	//  143  329:invokevirtual   #213 <Method cr cr.b(long)>
	//  144  332:pop             
		((List) (obj1)).add(((Object) ((cq)(ep)((eq) (obj)).l())));
	//  145  333:aload           5
	//  146  335:aload           4
	//  147  337:invokevirtual   #223 <Method com.google.android.gms.internal.firebase_2D_perf.gd eq.l()>
	//  148  340:checkcast       #225 <Class ep>
	//  149  343:checkcast       #191 <Class cq>
	//  150  346:invokeinterface #231 <Method boolean List.add(Object)>
	//  151  351:pop             
		((cr) (activity)).a(((Iterable) (obj1))).a(SessionManager.zzcn().zzco().e());
	//  152  352:aload_1         
	//  153  353:aload           5
	//  154  355:invokevirtual   #238 <Method cr cr.a(Iterable)>
	//  155  358:invokestatic    #107 <Method SessionManager SessionManager.zzcn()>
	//  156  361:invokevirtual   #242 <Method zzt SessionManager.zzco()>
	//  157  364:invokevirtual   #247 <Method com.google.android.gms.internal.firebase_2D_perf.cg zzt.e()>
	//  158  367:invokevirtual   #250 <Method cr cr.a(com.google.android.gms.internal.firebase_2D_perf.cg)>
	//  159  370:pop             
		if(d == null)
	//* 160  371:aload_0         
	//* 161  372:getfield        #60  <Field h d>
	//* 162  375:ifnonnull       385
			d = com.google.firebase.perf.internal.h.a();
	//  163  378:aload_0         
	//  164  379:invokestatic    #255 <Method h h.a()>
	//  165  382:putfield        #60  <Field h d>
		if(d != null)
	//* 166  385:aload_0         
	//* 167  386:getfield        #60  <Field h d>
	//* 168  389:ifnull          412
			d.a((cq)(ep)((eq) (activity)).l(), ax.d);
	//  169  392:aload_0         
	//  170  393:getfield        #60  <Field h d>
	//  171  396:aload_1         
	//  172  397:invokevirtual   #223 <Method com.google.android.gms.internal.firebase_2D_perf.gd eq.l()>
	//  173  400:checkcast       #225 <Class ep>
	//  174  403:checkcast       #191 <Class cq>
	//  175  406:getstatic       #257 <Field ax ax.d>
	//  176  409:invokevirtual   #260 <Method void h.a(cq, ax)>
		if(c)
	//* 177  412:aload_0         
	//* 178  413:getfield        #48  <Field boolean c>
	//* 179  416:ifeq            423
			b();
	//  180  419:aload_0         
	//  181  420:invokespecial   #262 <Method void b()>
		this;
	//  182  423:aload_0         
		JVM INSTR monitorexit ;
	//  183  424:monitorexit     
		return;
	//  184  425:return          
		this;
	//  185  426:aload_0         
		JVM INSTR monitorexit ;
	//  186  427:monitorexit     
		return;
	//  187  428:return          
		activity;
	//  188  429:astore_1        
	//* 189  430:aload_0         
		throw activity;
	//  190  431:monitorexit     
	//  191  432:aload_1         
	//  192  433:athrow          
	}

	public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
	{
	//    0    0:return          
	}

	public void onActivityStarted(Activity activity)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(m || k != null || i)
	//*   2    2:aload_0         
	//*   3    3:getfield        #58  <Field boolean m>
	//*   4    6:ifne            40
	//*   5    9:aload_0         
	//*   6   10:getfield        #54  <Field zzbg k>
	//*   7   13:ifnonnull       40
	//*   8   16:aload_0         
	//*   9   17:getfield        #50  <Field boolean i>
	//*  10   20:ifeq            26
			break MISSING_BLOCK_LABEL_40;
	//   11   23:goto            40
		k = new zzbg();
	//   12   26:aload_0         
	//   13   27:new             #125 <Class zzbg>
	//   14   30:dup             
	//   15   31:invokespecial   #126 <Method void zzbg()>
	//   16   34:putfield        #54  <Field zzbg k>
		this;
	//   17   37:aload_0         
		JVM INSTR monitorexit ;
	//   18   38:monitorexit     
		return;
	//   19   39:return          
		this;
	//   20   40:aload_0         
		JVM INSTR monitorexit ;
	//   21   41:monitorexit     
		return;
	//   22   42:return          
		activity;
	//   23   43:astore_1        
	//*  24   44:aload_0         
		throw activity;
	//   25   45:monitorexit     
	//   26   46:aload_1         
	//   27   47:athrow          
	}

	public void onActivityStopped(Activity activity)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
	//*   2    2:aload_0         
	//    3    3:monitorexit     
	//    4    4:return          
	}

	private static final long a;
	private static volatile AppStartTrace b;
	private boolean c;
	private h d;
	private final x e;
	private Context f;
	private WeakReference g;
	private WeakReference h;
	private boolean i;
	private zzbg j;
	private zzbg k;
	private zzbg l;
	private boolean m;

	static 
	{
		a = TimeUnit.MINUTES.toMicros(1L);
	//    0    0:getstatic       #35  <Field TimeUnit TimeUnit.MINUTES>
	//    1    3:lconst_1        
	//    2    4:invokevirtual   #39  <Method long TimeUnit.toMicros(long)>
	//    3    7:putstatic       #41  <Field long a>
	//*   4   10:return          
	}
}
