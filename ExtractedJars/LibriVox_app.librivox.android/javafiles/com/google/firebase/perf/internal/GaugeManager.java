// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.perf.internal;

import android.util.Log;
import com.google.android.gms.internal.firebase-perf.*;
import java.util.concurrent.*;

// Referenced classes of package com.google.firebase.perf.internal:
//			h, FeatureControl, t, s, 
//			q, r

public class GaugeManager
{

	private GaugeManager()
	{
		this(Executors.newSingleThreadScheduledExecutor(), h.a(), FeatureControl.zzar(), t.a(), p.a(), s.a());
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method ScheduledExecutorService Executors.newSingleThreadScheduledExecutor()>
	//    2    4:invokestatic    #41  <Method h h.a()>
	//    3    7:invokestatic    #47  <Method FeatureControl FeatureControl.zzar()>
	//    4   10:invokestatic    #52  <Method t t.a()>
	//    5   13:invokestatic    #57  <Method p p.a()>
	//    6   16:invokestatic    #62  <Method s s.a()>
	//    7   19:invokespecial   #65  <Method void GaugeManager(ScheduledExecutorService, h, FeatureControl, t, p, s)>
	//    8   22:return          
	}

	private GaugeManager(ScheduledExecutorService scheduledexecutorservice, h h1, FeatureControl featurecontrol, t t1, p p1, s s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void Object()>
		zzdq = ax.a;
	//    2    4:aload_0         
	//    3    5:getstatic       #71  <Field ax ax.a>
	//    4    8:putfield        #73  <Field ax zzdq>
		zzdr = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #75  <Field String zzdr>
		zzds = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #77  <Field ScheduledFuture zzds>
		zzdl = scheduledexecutorservice;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #79  <Field ScheduledExecutorService zzdl>
		zzdm = h1;
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:putfield        #81  <Field h zzdm>
		zzcz = featurecontrol;
	//   17   31:aload_0         
	//   18   32:aload_3         
	//   19   33:putfield        #83  <Field FeatureControl zzcz>
		zzdn = t1;
	//   20   36:aload_0         
	//   21   37:aload           4
	//   22   39:putfield        #85  <Field t zzdn>
		zzdo = p1;
	//   23   42:aload_0         
	//   24   43:aload           5
	//   25   45:putfield        #87  <Field p zzdo>
		zzdp = s1;
	//   26   48:aload_0         
	//   27   49:aload           6
	//   28   51:putfield        #89  <Field s zzdp>
	//   29   54:return          
	}

	private static void zza(boolean flag, boolean flag1, p p1, s s1)
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            11
			p1.c();
	//    2    4:aload_2         
	//    3    5:invokevirtual   #94  <Method void p.c()>
		else
	//*   4    8:goto            19
			Log.d("FirebasePerformance", "Cpu Metrics collection is disabled. Did not collect Cpu Metric.");
	//    5   11:ldc1            #96  <String "FirebasePerformance">
	//    6   13:ldc1            #98  <String "Cpu Metrics collection is disabled. Did not collect Cpu Metric.">
	//    7   15:invokestatic    #104 <Method int Log.d(String, String)>
	//    8   18:pop             
		if(flag1)
	//*   9   19:iload_1         
	//*  10   20:ifeq            28
		{
			s1.c();
	//   11   23:aload_3         
	//   12   24:invokevirtual   #105 <Method void s.c()>
			return;
	//   13   27:return          
		} else
		{
			Log.d("FirebasePerformance", "Memory Metrics collection is disabled. Did not collect Memory Metric.");
	//   14   28:ldc1            #96  <String "FirebasePerformance">
	//   15   30:ldc1            #107 <String "Memory Metrics collection is disabled. Did not collect Memory Metric.">
	//   16   32:invokestatic    #104 <Method int Log.d(String, String)>
	//   17   35:pop             
			return;
	//   18   36:return          
		}
	}

	private final void zzb(String s1, ax ax1)
	{
		bl bl1 = bk.g();
	//    0    0:invokestatic    #115 <Method bl bk.g()>
	//    1    3:astore_3        
		for(; !zzdo.a.isEmpty(); bl1.a((ba)zzdo.a.poll()));
	//    2    4:aload_0         
	//    3    5:getfield        #87  <Field p zzdo>
	//    4    8:getfield        #118 <Field ConcurrentLinkedQueue p.a>
	//    5   11:invokevirtual   #124 <Method boolean ConcurrentLinkedQueue.isEmpty()>
	//    6   14:ifne            38
	//    7   17:aload_3         
	//    8   18:aload_0         
	//    9   19:getfield        #87  <Field p zzdo>
	//   10   22:getfield        #118 <Field ConcurrentLinkedQueue p.a>
	//   11   25:invokevirtual   #128 <Method Object ConcurrentLinkedQueue.poll()>
	//   12   28:checkcast       #130 <Class ba>
	//   13   31:invokevirtual   #135 <Method bl bl.a(ba)>
	//   14   34:pop             
	//*  15   35:goto            4
		for(; !zzdp.a.isEmpty(); bl1.a((aq)zzdp.a.poll()));
	//   16   38:aload_0         
	//   17   39:getfield        #89  <Field s zzdp>
	//   18   42:getfield        #136 <Field ConcurrentLinkedQueue s.a>
	//   19   45:invokevirtual   #124 <Method boolean ConcurrentLinkedQueue.isEmpty()>
	//   20   48:ifne            72
	//   21   51:aload_3         
	//   22   52:aload_0         
	//   23   53:getfield        #89  <Field s zzdp>
	//   24   56:getfield        #136 <Field ConcurrentLinkedQueue s.a>
	//   25   59:invokevirtual   #128 <Method Object ConcurrentLinkedQueue.poll()>
	//   26   62:checkcast       #138 <Class aq>
	//   27   65:invokevirtual   #141 <Method bl bl.a(aq)>
	//   28   68:pop             
	//*  29   69:goto            38
		bl1.a(s1);
	//   30   72:aload_3         
	//   31   73:aload_1         
	//   32   74:invokevirtual   #144 <Method bl bl.a(String)>
	//   33   77:pop             
		zzdm.a((bk)(ep)((eq) (bl1)).l(), ax1);
	//   34   78:aload_0         
	//   35   79:getfield        #81  <Field h zzdm>
	//   36   82:aload_3         
	//   37   83:invokevirtual   #150 <Method com.google.android.gms.internal.firebase_2D_perf.gd eq.l()>
	//   38   86:checkcast       #152 <Class ep>
	//   39   89:checkcast       #111 <Class bk>
	//   40   92:aload_2         
	//   41   93:invokevirtual   #155 <Method void h.a(bk, ax)>
	//   42   96:return          
	}

	public static GaugeManager zzbf()
	{
		com/google/firebase/perf/internal/GaugeManager;
	//    0    0:ldc1            #2   <Class GaugeManager>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		GaugeManager gaugemanager;
		if(zzdk == null)
	//*   2    3:getstatic       #159 <Field GaugeManager zzdk>
	//*   3    6:ifnonnull       19
			zzdk = new GaugeManager();
	//    4    9:new             #2   <Class GaugeManager>
	//    5   12:dup             
	//    6   13:invokespecial   #160 <Method void GaugeManager()>
	//    7   16:putstatic       #159 <Field GaugeManager zzdk>
		gaugemanager = zzdk;
	//    8   19:getstatic       #159 <Field GaugeManager zzdk>
	//    9   22:astore_0        
		com/google/firebase/perf/internal/GaugeManager;
	//   10   23:ldc1            #2   <Class GaugeManager>
		JVM INSTR monitorexit ;
	//   11   25:monitorexit     
		return gaugemanager;
	//   12   26:aload_0         
	//   13   27:areturn         
		Exception exception;
		exception;
	//   14   28:astore_0        
	//*  15   29:ldc1            #2   <Class GaugeManager>
		throw exception;
	//   16   31:monitorexit     
	//   17   32:aload_0         
	//   18   33:athrow          
	}

	public static void zzbi()
	{
		zza(true, true, p.a(), s.a());
	//    0    0:iconst_1        
	//    1    1:iconst_1        
	//    2    2:invokestatic    #57  <Method p p.a()>
	//    3    5:invokestatic    #62  <Method s s.a()>
	//    4    8:invokestatic    #163 <Method void zza(boolean, boolean, p, s)>
	//    5   11:return          
	}

	public final void zza(String s1, ax ax1)
	{
		long l2;
		long l3;
label0:
		{
			if(zzdr != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field String zzdr>
	//*   2    4:ifnull          11
				zzbg();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #168 <Method void zzbg()>
			long l;
			switch(s.a[ax1.ordinal()])
	//*   5   11:getstatic       #173 <Field int[] s.a>
	//*   6   14:aload_2         
	//*   7   15:invokevirtual   #177 <Method int ax.ordinal()>
	//*   8   18:iaload          
			{
	//*   9   19:tableswitch     1 2: default 40
	//	               1 60
	//	               2 48
			default:
				l = -1L;
	//   10   40:ldc2w           #178 <Long -1L>
	//   11   43:lstore          5
				break;

	//*  12   45:goto            69
			case 2: // '\002'
				l = zzcz.zzaw();
	//   13   48:aload_0         
	//   14   49:getfield        #83  <Field FeatureControl zzcz>
	//   15   52:invokevirtual   #183 <Method long FeatureControl.zzaw()>
	//   16   55:lstore          5
				break;

	//*  17   57:goto            69
			case 1: // '\001'
				l = zzcz.zzay();
	//   18   60:aload_0         
	//   19   61:getfield        #83  <Field FeatureControl zzcz>
	//   20   64:invokevirtual   #186 <Method long FeatureControl.zzay()>
	//   21   67:lstore          5
				break;
			}
			if(l != -1L)
	//*  22   69:lload           5
	//*  23   71:ldc2w           #178 <Long -1L>
	//*  24   74:lcmp            
	//*  25   75:ifeq            89
			{
				l3 = l;
	//   26   78:lload           5
	//   27   80:lstore          7
				if(l > 0L)
					break label0;
	//   28   82:lload           5
	//   29   84:lconst_0        
	//   30   85:lcmp            
	//   31   86:ifgt            94
			}
			l3 = -1L;
	//   32   89:ldc2w           #178 <Long -1L>
	//   33   92:lstore          7
		}
		boolean flag2;
		long l4;
label1:
		{
			boolean flag3 = zzcz.zzat();
	//   34   94:aload_0         
	//   35   95:getfield        #83  <Field FeatureControl zzcz>
	//   36   98:invokevirtual   #189 <Method boolean FeatureControl.zzat()>
	//   37  101:istore          11
			flag2 = false;
	//   38  103:iconst_0        
	//   39  104:istore          4
			boolean flag;
			if(!flag3)
	//*  40  106:iload           11
	//*  41  108:ifne            124
			{
				Log.d("FirebasePerformance", "Cpu Metrics collection is disabled. Did not collect Cpu Metrics.");
	//   42  111:ldc1            #96  <String "FirebasePerformance">
	//   43  113:ldc1            #191 <String "Cpu Metrics collection is disabled. Did not collect Cpu Metrics.">
	//   44  115:invokestatic    #104 <Method int Log.d(String, String)>
	//   45  118:pop             
				flag = false;
	//   46  119:iconst_0        
	//   47  120:istore_3        
			} else
	//*  48  121:goto            157
			if(l3 == -1L)
	//*  49  124:lload           7
	//*  50  126:ldc2w           #178 <Long -1L>
	//*  51  129:lcmp            
	//*  52  130:ifne            146
			{
				Log.d("FirebasePerformance", "Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
	//   53  133:ldc1            #96  <String "FirebasePerformance">
	//   54  135:ldc1            #193 <String "Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.">
	//   55  137:invokestatic    #104 <Method int Log.d(String, String)>
	//   56  140:pop             
				flag = false;
	//   57  141:iconst_0        
	//   58  142:istore_3        
			} else
	//*  59  143:goto            157
			{
				zzdo.a(l3);
	//   60  146:aload_0         
	//   61  147:getfield        #87  <Field p zzdo>
	//   62  150:lload           7
	//   63  152:invokevirtual   #196 <Method void p.a(long)>
				flag = true;
	//   64  155:iconst_1        
	//   65  156:istore_3        
			}
			if(!flag)
	//*  66  157:iload_3         
	//*  67  158:ifeq            164
	//*  68  161:goto            169
				l3 = -1L;
	//   69  164:ldc2w           #178 <Long -1L>
	//   70  167:lstore          7
			long l1;
			switch(s.a[ax1.ordinal()])
	//*  71  169:getstatic       #173 <Field int[] s.a>
	//*  72  172:aload_2         
	//*  73  173:invokevirtual   #177 <Method int ax.ordinal()>
	//*  74  176:iaload          
			{
	//*  75  177:tableswitch     1 2: default 200
	//	               1 220
	//	               2 208
			default:
				l1 = -1L;
	//   76  200:ldc2w           #178 <Long -1L>
	//   77  203:lstore          5
				break;

	//*  78  205:goto            229
			case 2: // '\002'
				l1 = zzcz.zzax();
	//   79  208:aload_0         
	//   80  209:getfield        #83  <Field FeatureControl zzcz>
	//   81  212:invokevirtual   #199 <Method long FeatureControl.zzax()>
	//   82  215:lstore          5
				break;

	//*  83  217:goto            229
			case 1: // '\001'
				l1 = zzcz.zzaz();
	//   84  220:aload_0         
	//   85  221:getfield        #83  <Field FeatureControl zzcz>
	//   86  224:invokevirtual   #202 <Method long FeatureControl.zzaz()>
	//   87  227:lstore          5
				break;
			}
			if(l1 != -1L)
	//*  88  229:lload           5
	//*  89  231:ldc2w           #178 <Long -1L>
	//*  90  234:lcmp            
	//*  91  235:ifeq            249
			{
				l4 = l1;
	//   92  238:lload           5
	//   93  240:lstore          9
				if(l1 > 0L)
					break label1;
	//   94  242:lload           5
	//   95  244:lconst_0        
	//   96  245:lcmp            
	//   97  246:ifgt            254
			}
			l4 = -1L;
	//   98  249:ldc2w           #178 <Long -1L>
	//   99  252:lstore          9
		}
		boolean flag1;
		if(!zzcz.zzau())
	//* 100  254:aload_0         
	//* 101  255:getfield        #83  <Field FeatureControl zzcz>
	//* 102  258:invokevirtual   #205 <Method boolean FeatureControl.zzau()>
	//* 103  261:ifne            278
		{
			Log.d("FirebasePerformance", "Memory Metrics collection is disabled. Did not collect Memory Metrics.");
	//  104  264:ldc1            #96  <String "FirebasePerformance">
	//  105  266:ldc1            #207 <String "Memory Metrics collection is disabled. Did not collect Memory Metrics.">
	//  106  268:invokestatic    #104 <Method int Log.d(String, String)>
	//  107  271:pop             
			flag1 = flag2;
	//  108  272:iload           4
	//  109  274:istore_3        
		} else
	//* 110  275:goto            312
		if(l4 == -1L)
	//* 111  278:lload           9
	//* 112  280:ldc2w           #178 <Long -1L>
	//* 113  283:lcmp            
	//* 114  284:ifne            301
		{
			Log.d("FirebasePerformance", "Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
	//  115  287:ldc1            #96  <String "FirebasePerformance">
	//  116  289:ldc1            #209 <String "Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.">
	//  117  291:invokestatic    #104 <Method int Log.d(String, String)>
	//  118  294:pop             
			flag1 = flag2;
	//  119  295:iload           4
	//  120  297:istore_3        
		} else
	//* 121  298:goto            312
		{
			zzdp.a(l4);
	//  122  301:aload_0         
	//  123  302:getfield        #89  <Field s zzdp>
	//  124  305:lload           9
	//  125  307:invokevirtual   #210 <Method void s.a(long)>
			flag1 = true;
	//  126  310:iconst_1        
	//  127  311:istore_3        
		}
		l2 = l3;
	//  128  312:lload           7
	//  129  314:lstore          5
		if(flag1)
	//* 130  316:iload_3         
	//* 131  317:ifeq            345
			if(l3 == -1L)
	//* 132  320:lload           7
	//* 133  322:ldc2w           #178 <Long -1L>
	//* 134  325:lcmp            
	//* 135  326:ifne            336
				l2 = l4;
	//  136  329:lload           9
	//  137  331:lstore          5
			else
	//* 138  333:goto            345
				l2 = Math.min(l3, l4);
	//  139  336:lload           7
	//  140  338:lload           9
	//  141  340:invokestatic    #216 <Method long Math.min(long, long)>
	//  142  343:lstore          5
		if(l2 == -1L)
	//* 143  345:lload           5
	//* 144  347:ldc2w           #178 <Long -1L>
	//* 145  350:lcmp            
	//* 146  351:ifne            363
		{
			Log.w("FirebasePerformance", "Invalid gauge collection frequency. Unable to start collecting Gauges.");
	//  147  354:ldc1            #96  <String "FirebasePerformance">
	//  148  356:ldc1            #218 <String "Invalid gauge collection frequency. Unable to start collecting Gauges.">
	//  149  358:invokestatic    #221 <Method int Log.w(String, String)>
	//  150  361:pop             
			return;
	//  151  362:return          
		}
		zzdr = s1;
	//  152  363:aload_0         
	//  153  364:aload_1         
	//  154  365:putfield        #75  <Field String zzdr>
		zzdq = ax1;
	//  155  368:aload_0         
	//  156  369:aload_2         
	//  157  370:putfield        #73  <Field ax zzdq>
		ScheduledExecutorService scheduledexecutorservice;
		scheduledexecutorservice = zzdl;
	//  158  373:aload_0         
	//  159  374:getfield        #79  <Field ScheduledExecutorService zzdl>
	//  160  377:astore          12
		s1 = ((String) (new q(this, s1, ax1)));
	//  161  379:new             #223 <Class q>
	//  162  382:dup             
	//  163  383:aload_0         
	//  164  384:aload_1         
	//  165  385:aload_2         
	//  166  386:invokespecial   #226 <Method void q(GaugeManager, String, ax)>
	//  167  389:astore_1        
		l2 *= 20L;
	//  168  390:lload           5
	//  169  392:ldc2w           #227 <Long 20L>
	//  170  395:lmul            
	//  171  396:lstore          5
		try
		{
			zzds = scheduledexecutorservice.scheduleAtFixedRate(((Runnable) (s1)), l2, l2, TimeUnit.MILLISECONDS);
	//  172  398:aload_0         
	//  173  399:aload           12
	//  174  401:aload_1         
	//  175  402:lload           5
	//  176  404:lload           5
	//  177  406:getstatic       #234 <Field TimeUnit TimeUnit.MILLISECONDS>
	//  178  409:invokeinterface #240 <Method ScheduledFuture ScheduledExecutorService.scheduleAtFixedRate(Runnable, long, long, TimeUnit)>
	//  179  414:putfield        #77  <Field ScheduledFuture zzds>
			return;
	//  180  417:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s1)
	//* 181  418:astore_1        
		{
			s1 = String.valueOf(((Object) (((RejectedExecutionException) (s1)).getMessage())));
	//  182  419:aload_1         
	//  183  420:invokevirtual   #244 <Method String RejectedExecutionException.getMessage()>
	//  184  423:invokestatic    #250 <Method String String.valueOf(Object)>
	//  185  426:astore_1        
		}
		if(s1.length() != 0)
	//* 186  427:aload_1         
	//* 187  428:invokevirtual   #253 <Method int String.length()>
	//* 188  431:ifeq            444
			s1 = "Unable to start collecting Gauges: ".concat(s1);
	//  189  434:ldc1            #255 <String "Unable to start collecting Gauges: ">
	//  190  436:aload_1         
	//  191  437:invokevirtual   #259 <Method String String.concat(String)>
	//  192  440:astore_1        
		else
	//* 193  441:goto            454
			s1 = new String("Unable to start collecting Gauges: ");
	//  194  444:new             #246 <Class String>
	//  195  447:dup             
	//  196  448:ldc1            #255 <String "Unable to start collecting Gauges: ">
	//  197  450:invokespecial   #262 <Method void String(String)>
	//  198  453:astore_1        
		Log.w("FirebasePerformance", s1);
	//  199  454:ldc1            #96  <String "FirebasePerformance">
	//  200  456:aload_1         
	//  201  457:invokestatic    #221 <Method int Log.w(String, String)>
	//  202  460:pop             
		return;
	//  203  461:return          
	}

	public final void zzbg()
	{
		String s1 = zzdr;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field String zzdr>
	//    2    4:astore_1        
		if(s1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		ax ax1 = zzdq;
	//    6   10:aload_0         
	//    7   11:getfield        #73  <Field ax zzdq>
	//    8   14:astore_2        
		zzdo.b();
	//    9   15:aload_0         
	//   10   16:getfield        #87  <Field p zzdo>
	//   11   19:invokevirtual   #265 <Method void p.b()>
		zzdp.b();
	//   12   22:aload_0         
	//   13   23:getfield        #89  <Field s zzdp>
	//   14   26:invokevirtual   #266 <Method void s.b()>
		ScheduledFuture scheduledfuture = zzds;
	//   15   29:aload_0         
	//   16   30:getfield        #77  <Field ScheduledFuture zzds>
	//   17   33:astore_3        
		if(scheduledfuture != null)
	//*  18   34:aload_3         
	//*  19   35:ifnull          46
			scheduledfuture.cancel(false);
	//   20   38:aload_3         
	//   21   39:iconst_0        
	//   22   40:invokeinterface #272 <Method boolean ScheduledFuture.cancel(boolean)>
	//   23   45:pop             
		zzdl.schedule(((Runnable) (new r(this, s1, ax1))), 20L, TimeUnit.MILLISECONDS);
	//   24   46:aload_0         
	//   25   47:getfield        #79  <Field ScheduledExecutorService zzdl>
	//   26   50:new             #274 <Class r>
	//   27   53:dup             
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:aload_2         
	//   31   57:invokespecial   #275 <Method void r(GaugeManager, String, ax)>
	//   32   60:ldc2w           #227 <Long 20L>
	//   33   63:getstatic       #234 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   34   66:invokeinterface #279 <Method ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
	//   35   71:pop             
		zzdr = null;
	//   36   72:aload_0         
	//   37   73:aconst_null     
	//   38   74:putfield        #75  <Field String zzdr>
		zzdq = ax.a;
	//   39   77:aload_0         
	//   40   78:getstatic       #71  <Field ax ax.a>
	//   41   81:putfield        #73  <Field ax zzdq>
	//   42   84:return          
	}

	public final void zzbh()
	{
		zza(zzcz.zzat(), zzcz.zzau(), zzdo, zzdp);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field FeatureControl zzcz>
	//    2    4:invokevirtual   #189 <Method boolean FeatureControl.zzat()>
	//    3    7:aload_0         
	//    4    8:getfield        #83  <Field FeatureControl zzcz>
	//    5   11:invokevirtual   #205 <Method boolean FeatureControl.zzau()>
	//    6   14:aload_0         
	//    7   15:getfield        #87  <Field p zzdo>
	//    8   18:aload_0         
	//    9   19:getfield        #89  <Field s zzdp>
	//   10   22:invokestatic    #163 <Method void zza(boolean, boolean, p, s)>
	//   11   25:return          
	}

	final void zzc(String s1, ax ax1)
	{
		s1 = ((String) ((bk)(ep)((eq) (bk.g().a(s1).a((bg)(ep)((eq) (bg.b().a(zzdn.b()).a(zzdn.e()).b(zzdn.c()).c(zzdn.d()))).l()))).l()));
	//    0    0:invokestatic    #115 <Method bl bk.g()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #144 <Method bl bl.a(String)>
	//    3    7:invokestatic    #286 <Method bh bg.b()>
	//    4   10:aload_0         
	//    5   11:getfield        #85  <Field t zzdn>
	//    6   14:invokevirtual   #288 <Method String t.b()>
	//    7   17:invokevirtual   #293 <Method bh bh.a(String)>
	//    8   20:aload_0         
	//    9   21:getfield        #85  <Field t zzdn>
	//   10   24:invokevirtual   #296 <Method int t.e()>
	//   11   27:invokevirtual   #299 <Method bh bh.a(int)>
	//   12   30:aload_0         
	//   13   31:getfield        #85  <Field t zzdn>
	//   14   34:invokevirtual   #301 <Method int t.c()>
	//   15   37:invokevirtual   #303 <Method bh bh.b(int)>
	//   16   40:aload_0         
	//   17   41:getfield        #85  <Field t zzdn>
	//   18   44:invokevirtual   #305 <Method int t.d()>
	//   19   47:invokevirtual   #307 <Method bh bh.c(int)>
	//   20   50:invokevirtual   #150 <Method com.google.android.gms.internal.firebase_2D_perf.gd eq.l()>
	//   21   53:checkcast       #152 <Class ep>
	//   22   56:checkcast       #283 <Class bg>
	//   23   59:invokevirtual   #310 <Method bl bl.a(bg)>
	//   24   62:invokevirtual   #150 <Method com.google.android.gms.internal.firebase_2D_perf.gd eq.l()>
	//   25   65:checkcast       #152 <Class ep>
	//   26   68:checkcast       #111 <Class bk>
	//   27   71:astore_1        
		zzdm.a(((bk) (s1)), ax1);
	//   28   72:aload_0         
	//   29   73:getfield        #81  <Field h zzdm>
	//   30   76:aload_1         
	//   31   77:aload_2         
	//   32   78:invokevirtual   #155 <Method void h.a(bk, ax)>
	//   33   81:return          
	}

	final void zzd(String s1, ax ax1)
	{
		zzb(s1, ax1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #313 <Method void zzb(String, ax)>
	//    4    6:return          
	}

	final void zze(String s1, ax ax1)
	{
		zzb(s1, ax1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #313 <Method void zzb(String, ax)>
	//    4    6:return          
	}

	private static GaugeManager zzdk;
	private final FeatureControl zzcz;
	private final ScheduledExecutorService zzdl;
	private final h zzdm;
	private final t zzdn;
	private final p zzdo;
	private final s zzdp;
	private ax zzdq;
	private String zzdr;
	private ScheduledFuture zzds;

	static 
	{
	//    0    0:return          
	}
}
