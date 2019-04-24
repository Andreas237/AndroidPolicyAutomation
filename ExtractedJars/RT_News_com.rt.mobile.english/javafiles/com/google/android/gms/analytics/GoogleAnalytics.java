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
			zzrh.zza(activity);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field GoogleAnalytics zzrh>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #33  <Method void GoogleAnalytics.zza(Activity)>
		//    4    8:return          
		}

		public final void onActivityStopped(Activity activity)
		{
			zzrh.zzb(activity);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field GoogleAnalytics zzrh>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #36  <Method void GoogleAnalytics.zzb(Activity)>
		//    4    8:return          
		}

		private final GoogleAnalytics zzrh;

		zzb()
		{
			zzrh = GoogleAnalytics.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field GoogleAnalytics zzrh>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
		//    5    9:return          
		}
	}


	public GoogleAnalytics(zzat zzat1)
	{
		super(zzat1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #36  <Method void zza(zzat)>
		zzrc = ((Set) (new HashSet()));
	//    3    5:aload_0         
	//    4    6:new             #38  <Class HashSet>
	//    5    9:dup             
	//    6   10:invokespecial   #39  <Method void HashSet()>
	//    7   13:putfield        #41  <Field Set zzrc>
	//    8   16:return          
	}

	public static GoogleAnalytics getInstance(Context context)
	{
		return zzat.zzc(context).zzck();
	//    0    0:aload_0         
	//    1    1:invokestatic    #54  <Method zzat zzat.zzc(Context)>
	//    2    4:invokevirtual   #58  <Method GoogleAnalytics zzat.zzck()>
	//    3    7:areturn         
	}

	public static void zzn()
	{
		com/google/android/gms/analytics/GoogleAnalytics;
	//    0    0:ldc1            #2   <Class GoogleAnalytics>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(zzra == null)
			break MISSING_BLOCK_LABEL_48;
	//    2    3:getstatic       #32  <Field List zzra>
	//    3    6:ifnull          48
		for(Iterator iterator = zzra.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run());
	//    4    9:getstatic       #32  <Field List zzra>
	//    5   12:invokeinterface #65  <Method Iterator List.iterator()>
	//    6   17:astore_0        
	//    7   18:aload_0         
	//    8   19:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//    9   24:ifeq            44
	//   10   27:aload_0         
	//   11   28:invokeinterface #75  <Method Object Iterator.next()>
	//   12   33:checkcast       #77  <Class Runnable>
	//   13   36:invokeinterface #80  <Method void Runnable.run()>
	//*  14   41:goto            18
		zzra = null;
	//   15   44:aconst_null     
	//   16   45:putstatic       #32  <Field List zzra>
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
		((com.google.android.gms.analytics.zza)this).zzh().zzby().zzbo();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #85  <Method zzat zza.zzh()>
	//    2    4:invokevirtual   #89  <Method zzai zzat.zzby()>
	//    3    7:invokevirtual   #94  <Method void zzai.zzbo()>
	//    4   10:return          
	}

	public final void enableAutoActivityReports(Application application)
	{
		if(!zzrd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field boolean zzrd>
	//*   2    4:ifne            24
		{
			application.registerActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (new zzb())));
	//    3    7:aload_1         
	//    4    8:new             #9   <Class GoogleAnalytics$zzb>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #104 <Method void GoogleAnalytics$zzb(GoogleAnalytics)>
	//    8   16:invokevirtual   #110 <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
			zzrd = true;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:putfield        #101 <Field boolean zzrd>
		}
	//   12   24:return          
	}

	public final boolean getAppOptOut()
	{
		return zzrf;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field boolean zzrf>
	//    2    4:ireturn         
	}

	public final Logger getLogger()
	{
		return zzcl.getLogger();
	//    0    0:invokestatic    #120 <Method Logger zzcl.getLogger()>
	//    1    3:areturn         
	}

	public final boolean isDryRunEnabled()
	{
		return zzre;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field boolean zzre>
	//    2    4:ireturn         
	}

	public final boolean isInitialized()
	{
		return zzrb;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field boolean zzrb>
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
		Tracker tracker = new Tracker(((com.google.android.gms.analytics.zza)this).zzh(), ((String) (null)), ((com.google.android.gms.internal.measurement.zzck) (null)));
	//    2    2:new             #131 <Class Tracker>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:invokevirtual   #85  <Method zzat zza.zzh()>
	//    6   10:aconst_null     
	//    7   11:aconst_null     
	//    8   12:invokespecial   #134 <Method void Tracker(zzat, String, com.google.android.gms.internal.measurement.zzck)>
	//    9   15:astore_2        
		if(i <= 0)
			break MISSING_BLOCK_LABEL_48;
	//   10   16:iload_1         
	//   11   17:ifle            48
		zzdc zzdc1 = (zzdc)(new zzda(((com.google.android.gms.analytics.zza)this).zzh())).zzo(i);
	//   12   20:new             #136 <Class zzda>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:invokevirtual   #85  <Method zzat zza.zzh()>
	//   16   28:invokespecial   #137 <Method void zzda(zzat)>
	//   17   31:iload_1         
	//   18   32:invokevirtual   #141 <Method com.google.android.gms.internal.measurement.zzbr zzda.zzo(int)>
	//   19   35:checkcast       #143 <Class zzdc>
	//   20   38:astore_3        
		if(zzdc1 == null)
			break MISSING_BLOCK_LABEL_48;
	//   21   39:aload_3         
	//   22   40:ifnull          48
		tracker.zza(zzdc1);
	//   23   43:aload_2         
	//   24   44:aload_3         
	//   25   45:invokevirtual   #146 <Method void Tracker.zza(zzdc)>
		((zzar) (tracker)).zzm();
	//   26   48:aload_2         
	//   27   49:invokevirtual   #151 <Method void zzar.zzm()>
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
		s = ((String) (new Tracker(((com.google.android.gms.analytics.zza)this).zzh(), s, ((com.google.android.gms.internal.measurement.zzck) (null)))));
	//    2    2:new             #131 <Class Tracker>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:invokevirtual   #85  <Method zzat zza.zzh()>
	//    6   10:aload_1         
	//    7   11:aconst_null     
	//    8   12:invokespecial   #134 <Method void Tracker(zzat, String, com.google.android.gms.internal.measurement.zzck)>
	//    9   15:astore_1        
		((zzar) (s)).zzm();
	//   10   16:aload_1         
	//   11   17:invokevirtual   #151 <Method void zzar.zzm()>
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
		if(!zzrd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field boolean zzrd>
	//*   2    4:ifne            12
			zza(activity);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #156 <Method void zza(Activity)>
	//    6   12:return          
	}

	public final void reportActivityStop(Activity activity)
	{
		if(!zzrd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field boolean zzrd>
	//*   2    4:ifne            12
			zzb(activity);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #159 <Method void zzb(Activity)>
	//    6   12:return          
	}

	public final void setAppOptOut(boolean flag)
	{
		zzrf = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #113 <Field boolean zzrf>
		if(zzrf)
	//*   3    5:aload_0         
	//*   4    6:getfield        #113 <Field boolean zzrf>
	//*   5    9:ifeq            22
			((com.google.android.gms.analytics.zza)this).zzh().zzby().zzbn();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #85  <Method zzat zza.zzh()>
	//    8   16:invokevirtual   #89  <Method zzai zzat.zzby()>
	//    9   19:invokevirtual   #164 <Method void zzai.zzbn()>
	//   10   22:return          
	}

	public final void setDryRun(boolean flag)
	{
		zzre = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #124 <Field boolean zzre>
	//    3    5:return          
	}

	public final void setLocalDispatchPeriod(int i)
	{
		((com.google.android.gms.analytics.zza)this).zzh().zzby().setLocalDispatchPeriod(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #85  <Method zzat zza.zzh()>
	//    2    4:invokevirtual   #89  <Method zzai zzat.zzby()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #169 <Method void zzai.setLocalDispatchPeriod(int)>
	//    5   11:return          
	}

	public final void setLogger(Logger logger)
	{
		zzcl.setLogger(logger);
	//    0    0:aload_1         
	//    1    1:invokestatic    #173 <Method void zzcl.setLogger(Logger)>
		if(!zzrg)
	//*   2    4:aload_0         
	//*   3    5:getfield        #175 <Field boolean zzrg>
	//*   4    8:ifne            83
		{
			logger = ((Logger) ((String)zzcc.zzym.get()));
	//    5   11:getstatic       #181 <Field zzcd zzcc.zzym>
	//    6   14:invokevirtual   #186 <Method Object zzcd.get()>
	//    7   17:checkcast       #188 <Class String>
	//    8   20:astore_1        
			String s = (String)zzcc.zzym.get();
	//    9   21:getstatic       #181 <Field zzcd zzcc.zzym>
	//   10   24:invokevirtual   #186 <Method Object zzcd.get()>
	//   11   27:checkcast       #188 <Class String>
	//   12   30:astore_2        
			StringBuilder stringbuilder = new StringBuilder(112 + String.valueOf(((Object) (s))).length());
	//   13   31:new             #190 <Class StringBuilder>
	//   14   34:dup             
	//   15   35:bipush          112
	//   16   37:aload_2         
	//   17   38:invokestatic    #194 <Method String String.valueOf(Object)>
	//   18   41:invokevirtual   #198 <Method int String.length()>
	//   19   44:iadd            
	//   20   45:invokespecial   #200 <Method void StringBuilder(int)>
	//   21   48:astore_3        
			stringbuilder.append("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.");
	//   22   49:aload_3         
	//   23   50:ldc1            #202 <String "GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.">
	//   24   52:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   25   55:pop             
			stringbuilder.append(s);
	//   26   56:aload_3         
	//   27   57:aload_2         
	//   28   58:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   29   61:pop             
			stringbuilder.append(" DEBUG");
	//   30   62:aload_3         
	//   31   63:ldc1            #208 <String " DEBUG">
	//   32   65:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   33   68:pop             
			Log.i(((String) (logger)), stringbuilder.toString());
	//   34   69:aload_1         
	//   35   70:aload_3         
	//   36   71:invokevirtual   #212 <Method String StringBuilder.toString()>
	//   37   74:invokestatic    #218 <Method int Log.i(String, String)>
	//   38   77:pop             
			zzrg = true;
	//   39   78:aload_0         
	//   40   79:iconst_1        
	//   41   80:putfield        #175 <Field boolean zzrg>
		}
	//   42   83:return          
	}

	final void zza(Activity activity)
	{
		for(Iterator iterator = zzrc.iterator(); iterator.hasNext(); ((zza)iterator.next()).zzc(activity));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Set zzrc>
	//    2    4:invokeinterface #221 <Method Iterator Set.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            37
	//    7   19:aload_2         
	//    8   20:invokeinterface #75  <Method Object Iterator.next()>
	//    9   25:checkcast       #6   <Class GoogleAnalytics$zza>
	//   10   28:aload_1         
	//   11   29:invokeinterface #223 <Method void GoogleAnalytics$zza.zzc(Activity)>
	//*  12   34:goto            10
	//   13   37:return          
	}

	final void zza(zza zza1)
	{
		zzrc.add(((Object) (zza1)));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Set zzrc>
	//    2    4:aload_1         
	//    3    5:invokeinterface #228 <Method boolean Set.add(Object)>
	//    4   10:pop             
		zza1 = ((zza) (((com.google.android.gms.analytics.zza)this).zzh().getContext()));
	//    5   11:aload_0         
	//    6   12:invokevirtual   #85  <Method zzat zza.zzh()>
	//    7   15:invokevirtual   #232 <Method Context zzat.getContext()>
	//    8   18:astore_1        
		if(zza1 instanceof Application)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #106 <Class Application>
	//*  11   23:ifeq            34
			enableAutoActivityReports((Application)zza1);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:checkcast       #106 <Class Application>
	//   15   31:invokevirtual   #234 <Method void enableAutoActivityReports(Application)>
	//   16   34:return          
	}

	final void zzb(Activity activity)
	{
		for(Iterator iterator = zzrc.iterator(); iterator.hasNext(); ((zza)iterator.next()).zzd(activity));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Set zzrc>
	//    2    4:invokeinterface #221 <Method Iterator Set.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            37
	//    7   19:aload_2         
	//    8   20:invokeinterface #75  <Method Object Iterator.next()>
	//    9   25:checkcast       #6   <Class GoogleAnalytics$zza>
	//   10   28:aload_1         
	//   11   29:invokeinterface #237 <Method void GoogleAnalytics$zza.zzd(Activity)>
	//*  12   34:goto            10
	//   13   37:return          
	}

	final void zzb(zza zza1)
	{
		zzrc.remove(((Object) (zza1)));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Set zzrc>
	//    2    4:aload_1         
	//    3    5:invokeinterface #240 <Method boolean Set.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public final void zzm()
	{
		zzde zzde1 = ((com.google.android.gms.analytics.zza)this).zzh().zzca();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #85  <Method zzat zza.zzh()>
	//    2    4:invokevirtual   #244 <Method zzde zzat.zzca()>
	//    3    7:astore_1        
		zzde1.zzfn();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #249 <Method boolean zzde.zzfn()>
	//    6   12:pop             
		if(zzde1.zzfo())
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #252 <Method boolean zzde.zzfo()>
	//*   9   17:ifeq            28
			setDryRun(zzde1.zzfp());
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #255 <Method boolean zzde.zzfp()>
	//   13   25:invokevirtual   #257 <Method void setDryRun(boolean)>
		zzde1.zzfn();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #249 <Method boolean zzde.zzfn()>
	//   16   32:pop             
		zzrb = true;
	//   17   33:aload_0         
	//   18   34:iconst_1        
	//   19   35:putfield        #127 <Field boolean zzrb>
	//   20   38:return          
	}

	private static List zzra = new ArrayList();
	private boolean zzrb;
	private Set zzrc;
	private boolean zzrd;
	private boolean zzre;
	private volatile boolean zzrf;
	private boolean zzrg;

	static 
	{
	//    0    0:new             #27  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void ArrayList()>
	//    3    7:putstatic       #32  <Field List zzra>
	//*   4   10:return          
	}
}
