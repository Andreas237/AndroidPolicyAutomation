// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.analytics:
//			zza, Tracker, Logger

public final class GoogleAnalytics extends com.google.android.gms.analytics.zza
{
	static interface zza
	{

		public abstract void zzc(Activity activity);

		public abstract void zzd(Activity activity);
	}

	final class zzb
		implements android.app.Application.ActivityLifecycleCallbacks
	{

		public final void onActivityCreated(Activity activity, Bundle bundle)
		{
		//    0    0:return          
		}

		public final void onActivityDestroyed(Activity activity)
		{
		//    0    0:return          
		}

		public final void onActivityPaused(Activity activity)
		{
		//    0    0:return          
		}

		public final void onActivityResumed(Activity activity)
		{
		//    0    0:return          
		}

		public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
		{
		//    0    0:return          
		}

		public final void onActivityStarted(Activity activity)
		{
			zzrs.zza(activity);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field GoogleAnalytics zzrs>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #33  <Method void GoogleAnalytics.zza(Activity)>
		//    4    8:return          
		}

		public final void onActivityStopped(Activity activity)
		{
			zzrs.zzb(activity);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field GoogleAnalytics zzrs>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #36  <Method void GoogleAnalytics.zzb(Activity)>
		//    4    8:return          
		}

		private final GoogleAnalytics zzrs;

		zzb()
		{
			zzrs = GoogleAnalytics.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field GoogleAnalytics zzrs>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
		//    5    9:return          
		}
	}


	public GoogleAnalytics(zzaw zzaw1)
	{
		super(zzaw1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #36  <Method void zza(zzaw)>
		zzrn = ((Set) (new HashSet()));
	//    3    5:aload_0         
	//    4    6:new             #38  <Class HashSet>
	//    5    9:dup             
	//    6   10:invokespecial   #39  <Method void HashSet()>
	//    7   13:putfield        #41  <Field Set zzrn>
	//    8   16:return          
	}

	public static GoogleAnalytics getInstance(Context context)
	{
		return zzaw.zzc(context).zzco();
	//    0    0:aload_0         
	//    1    1:invokestatic    #50  <Method zzaw zzaw.zzc(Context)>
	//    2    4:invokevirtual   #54  <Method GoogleAnalytics zzaw.zzco()>
	//    3    7:areturn         
	}

	public static void zzr()
	{
		com/google/android/gms/analytics/GoogleAnalytics;
	//    0    0:ldc1            #2   <Class GoogleAnalytics>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(zzrl == null)
			break MISSING_BLOCK_LABEL_48;
	//    2    3:getstatic       #32  <Field List zzrl>
	//    3    6:ifnull          48
		for(Iterator iterator = zzrl.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run());
	//    4    9:getstatic       #32  <Field List zzrl>
	//    5   12:invokeinterface #61  <Method Iterator List.iterator()>
	//    6   17:astore_0        
	//    7   18:aload_0         
	//    8   19:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//    9   24:ifeq            44
	//   10   27:aload_0         
	//   11   28:invokeinterface #71  <Method Object Iterator.next()>
	//   12   33:checkcast       #73  <Class Runnable>
	//   13   36:invokeinterface #76  <Method void Runnable.run()>
	//*  14   41:goto            18
		zzrl = null;
	//   15   44:aconst_null     
	//   16   45:putstatic       #32  <Field List zzrl>
		com/google/android/gms/analytics/GoogleAnalytics;
	//   17   48:ldc1            #2   <Class GoogleAnalytics>
		JVM INSTR monitorexit ;
	//   18   50:monitorexit     
		return;
	//   19   51:return          
		Exception exception;
		exception;
	//   20   52:astore_0        
		com/google/android/gms/analytics/GoogleAnalytics;
	//   21   53:ldc1            #2   <Class GoogleAnalytics>
		JVM INSTR monitorexit ;
	//   22   55:monitorexit     
		throw exception;
	//   23   56:aload_0         
	//   24   57:athrow          
	}

	public final void dispatchLocalHits()
	{
		((com.google.android.gms.analytics.zza)this).zzl().zzcc().zzbs();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method zzaw zza.zzl()>
	//    2    4:invokevirtual   #85  <Method zzal zzaw.zzcc()>
	//    3    7:invokevirtual   #90  <Method void zzal.zzbs()>
	//    4   10:return          
	}

	public final void enableAutoActivityReports(Application application)
	{
		if(!zzro)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field boolean zzro>
	//*   2    4:ifne            24
		{
			application.registerActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (new zzb())));
	//    3    7:aload_1         
	//    4    8:new             #9   <Class GoogleAnalytics$zzb>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #100 <Method void GoogleAnalytics$zzb(GoogleAnalytics)>
	//    8   16:invokevirtual   #106 <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
			zzro = true;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:putfield        #97  <Field boolean zzro>
		}
	//   12   24:return          
	}

	public final boolean getAppOptOut()
	{
		return zzrq;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field boolean zzrq>
	//    2    4:ireturn         
	}

	public final Logger getLogger()
	{
		return zzco.getLogger();
	//    0    0:invokestatic    #116 <Method Logger zzco.getLogger()>
	//    1    3:areturn         
	}

	public final boolean isDryRunEnabled()
	{
		return zzrp;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field boolean zzrp>
	//    2    4:ireturn         
	}

	public final boolean isInitialized()
	{
		return zzrm;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field boolean zzrm>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final Tracker newTracker(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Tracker tracker = new Tracker(((com.google.android.gms.analytics.zza)this).zzl(), ((String) (null)), ((com.google.android.gms.internal.measurement.zzcn) (null)));
	//    2    2:new             #127 <Class Tracker>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:invokevirtual   #81  <Method zzaw zza.zzl()>
	//    6   10:aconst_null     
	//    7   11:aconst_null     
	//    8   12:invokespecial   #130 <Method void Tracker(zzaw, String, com.google.android.gms.internal.measurement.zzcn)>
	//    9   15:astore_2        
		if(i <= 0)
			break MISSING_BLOCK_LABEL_48;
	//   10   16:iload_1         
	//   11   17:ifle            48
		zzdf zzdf1 = (zzdf)(new zzdd(((com.google.android.gms.analytics.zza)this).zzl())).zzq(i);
	//   12   20:new             #132 <Class zzdd>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:invokevirtual   #81  <Method zzaw zza.zzl()>
	//   16   28:invokespecial   #133 <Method void zzdd(zzaw)>
	//   17   31:iload_1         
	//   18   32:invokevirtual   #137 <Method com.google.android.gms.internal.measurement.zzbu zzdd.zzq(int)>
	//   19   35:checkcast       #139 <Class zzdf>
	//   20   38:astore_3        
		if(zzdf1 == null)
			break MISSING_BLOCK_LABEL_48;
	//   21   39:aload_3         
	//   22   40:ifnull          48
		tracker.zza(zzdf1);
	//   23   43:aload_2         
	//   24   44:aload_3         
	//   25   45:invokevirtual   #142 <Method void Tracker.zza(zzdf)>
		((zzau) (tracker)).zzq();
	//   26   48:aload_2         
	//   27   49:invokevirtual   #146 <Method void zzau.zzq()>
		this;
	//   28   52:aload_0         
		JVM INSTR monitorexit ;
	//   29   53:monitorexit     
		return tracker;
	//   30   54:aload_2         
	//   31   55:areturn         
		Exception exception;
		exception;
	//   32   56:astore_2        
		this;
	//   33   57:aload_0         
		JVM INSTR monitorexit ;
	//   34   58:monitorexit     
		throw exception;
	//   35   59:aload_2         
	//   36   60:athrow          
	}

	public final Tracker newTracker(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		s = ((String) (new Tracker(((com.google.android.gms.analytics.zza)this).zzl(), s, ((com.google.android.gms.internal.measurement.zzcn) (null)))));
	//    2    2:new             #127 <Class Tracker>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:invokevirtual   #81  <Method zzaw zza.zzl()>
	//    6   10:aload_1         
	//    7   11:aconst_null     
	//    8   12:invokespecial   #130 <Method void Tracker(zzaw, String, com.google.android.gms.internal.measurement.zzcn)>
	//    9   15:astore_1        
		((zzau) (s)).zzq();
	//   10   16:aload_1         
	//   11   17:invokevirtual   #146 <Method void zzau.zzq()>
		this;
	//   12   20:aload_0         
		JVM INSTR monitorexit ;
	//   13   21:monitorexit     
		return ((Tracker) (s));
	//   14   22:aload_1         
	//   15   23:areturn         
		s;
	//   16   24:astore_1        
		this;
	//   17   25:aload_0         
		JVM INSTR monitorexit ;
	//   18   26:monitorexit     
		throw s;
	//   19   27:aload_1         
	//   20   28:athrow          
	}

	public final void reportActivityStart(Activity activity)
	{
		if(!zzro)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field boolean zzro>
	//*   2    4:ifne            12
			zza(activity);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #151 <Method void zza(Activity)>
	//    6   12:return          
	}

	public final void reportActivityStop(Activity activity)
	{
		if(!zzro)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field boolean zzro>
	//*   2    4:ifne            12
			zzb(activity);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #154 <Method void zzb(Activity)>
	//    6   12:return          
	}

	public final void setAppOptOut(boolean flag)
	{
		zzrq = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #109 <Field boolean zzrq>
		if(zzrq)
	//*   3    5:aload_0         
	//*   4    6:getfield        #109 <Field boolean zzrq>
	//*   5    9:ifeq            22
			((com.google.android.gms.analytics.zza)this).zzl().zzcc().zzbr();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #81  <Method zzaw zza.zzl()>
	//    8   16:invokevirtual   #85  <Method zzal zzaw.zzcc()>
	//    9   19:invokevirtual   #159 <Method void zzal.zzbr()>
	//   10   22:return          
	}

	public final void setDryRun(boolean flag)
	{
		zzrp = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #120 <Field boolean zzrp>
	//    3    5:return          
	}

	public final void setLocalDispatchPeriod(int i)
	{
		((com.google.android.gms.analytics.zza)this).zzl().zzcc().setLocalDispatchPeriod(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method zzaw zza.zzl()>
	//    2    4:invokevirtual   #85  <Method zzal zzaw.zzcc()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #164 <Method void zzal.setLocalDispatchPeriod(int)>
	//    5   11:return          
	}

	public final void setLogger(Logger logger)
	{
		zzco.setLogger(logger);
	//    0    0:aload_1         
	//    1    1:invokestatic    #168 <Method void zzco.setLogger(Logger)>
		if(!zzrr)
	//*   2    4:aload_0         
	//*   3    5:getfield        #170 <Field boolean zzrr>
	//*   4    8:ifne            83
		{
			logger = ((Logger) ((String)zzcf.zzyx.get()));
	//    5   11:getstatic       #176 <Field zzcg zzcf.zzyx>
	//    6   14:invokevirtual   #181 <Method Object zzcg.get()>
	//    7   17:checkcast       #183 <Class String>
	//    8   20:astore_1        
			String s = (String)zzcf.zzyx.get();
	//    9   21:getstatic       #176 <Field zzcg zzcf.zzyx>
	//   10   24:invokevirtual   #181 <Method Object zzcg.get()>
	//   11   27:checkcast       #183 <Class String>
	//   12   30:astore_2        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 112);
	//   13   31:new             #185 <Class StringBuilder>
	//   14   34:dup             
	//   15   35:aload_2         
	//   16   36:invokestatic    #189 <Method String String.valueOf(Object)>
	//   17   39:invokevirtual   #193 <Method int String.length()>
	//   18   42:bipush          112
	//   19   44:iadd            
	//   20   45:invokespecial   #195 <Method void StringBuilder(int)>
	//   21   48:astore_3        
			stringbuilder.append("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.");
	//   22   49:aload_3         
	//   23   50:ldc1            #197 <String "GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.">
	//   24   52:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//   25   55:pop             
			stringbuilder.append(s);
	//   26   56:aload_3         
	//   27   57:aload_2         
	//   28   58:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//   29   61:pop             
			stringbuilder.append(" DEBUG");
	//   30   62:aload_3         
	//   31   63:ldc1            #203 <String " DEBUG">
	//   32   65:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//   33   68:pop             
			Log.i(((String) (logger)), stringbuilder.toString());
	//   34   69:aload_1         
	//   35   70:aload_3         
	//   36   71:invokevirtual   #207 <Method String StringBuilder.toString()>
	//   37   74:invokestatic    #213 <Method int Log.i(String, String)>
	//   38   77:pop             
			zzrr = true;
	//   39   78:aload_0         
	//   40   79:iconst_1        
	//   41   80:putfield        #170 <Field boolean zzrr>
		}
	//   42   83:return          
	}

	final void zza(Activity activity)
	{
		for(Iterator iterator = zzrn.iterator(); iterator.hasNext(); ((zza)iterator.next()).zzc(activity));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Set zzrn>
	//    2    4:invokeinterface #216 <Method Iterator Set.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            37
	//    7   19:aload_2         
	//    8   20:invokeinterface #71  <Method Object Iterator.next()>
	//    9   25:checkcast       #6   <Class GoogleAnalytics$zza>
	//   10   28:aload_1         
	//   11   29:invokeinterface #218 <Method void GoogleAnalytics$zza.zzc(Activity)>
	//*  12   34:goto            10
	//   13   37:return          
	}

	final void zza(zza zza1)
	{
		zzrn.add(((Object) (zza1)));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Set zzrn>
	//    2    4:aload_1         
	//    3    5:invokeinterface #223 <Method boolean Set.add(Object)>
	//    4   10:pop             
		zza1 = ((zza) (((com.google.android.gms.analytics.zza)this).zzl().getContext()));
	//    5   11:aload_0         
	//    6   12:invokevirtual   #81  <Method zzaw zza.zzl()>
	//    7   15:invokevirtual   #227 <Method Context zzaw.getContext()>
	//    8   18:astore_1        
		if(zza1 instanceof Application)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #102 <Class Application>
	//*  11   23:ifeq            34
			enableAutoActivityReports((Application)zza1);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:checkcast       #102 <Class Application>
	//   15   31:invokevirtual   #229 <Method void enableAutoActivityReports(Application)>
	//   16   34:return          
	}

	final void zzb(Activity activity)
	{
		for(Iterator iterator = zzrn.iterator(); iterator.hasNext(); ((zza)iterator.next()).zzd(activity));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Set zzrn>
	//    2    4:invokeinterface #216 <Method Iterator Set.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            37
	//    7   19:aload_2         
	//    8   20:invokeinterface #71  <Method Object Iterator.next()>
	//    9   25:checkcast       #6   <Class GoogleAnalytics$zza>
	//   10   28:aload_1         
	//   11   29:invokeinterface #232 <Method void GoogleAnalytics$zza.zzd(Activity)>
	//*  12   34:goto            10
	//   13   37:return          
	}

	final void zzb(zza zza1)
	{
		zzrn.remove(((Object) (zza1)));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Set zzrn>
	//    2    4:aload_1         
	//    3    5:invokeinterface #235 <Method boolean Set.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public final void zzq()
	{
		zzdh zzdh1 = ((com.google.android.gms.analytics.zza)this).zzl().zzce();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method zzaw zza.zzl()>
	//    2    4:invokevirtual   #239 <Method zzdh zzaw.zzce()>
	//    3    7:astore_1        
		zzdh1.zzfr();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #244 <Method boolean zzdh.zzfr()>
	//    6   12:pop             
		if(zzdh1.zzfs())
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #247 <Method boolean zzdh.zzfs()>
	//*   9   17:ifeq            28
			setDryRun(zzdh1.zzft());
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #250 <Method boolean zzdh.zzft()>
	//   13   25:invokevirtual   #252 <Method void setDryRun(boolean)>
		zzdh1.zzfr();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #244 <Method boolean zzdh.zzfr()>
	//   16   32:pop             
		zzrm = true;
	//   17   33:aload_0         
	//   18   34:iconst_1        
	//   19   35:putfield        #123 <Field boolean zzrm>
	//   20   38:return          
	}

	private static List zzrl = new ArrayList();
	private boolean zzrm;
	private Set zzrn;
	private boolean zzro;
	private boolean zzrp;
	private volatile boolean zzrq;
	private boolean zzrr;

	static 
	{
	//    0    0:new             #27  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void ArrayList()>
	//    3    7:putstatic       #32  <Field List zzrl>
	//*   4   10:return          
	}
}
