// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.*;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.zzt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzaac
	implements android.app.Application.ActivityLifecycleCallbacks, ComponentCallbacks2
{
	public static interface zza
	{

		public abstract void zzat(boolean flag);
	}


	private zzaac()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #32  <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void AtomicBoolean()>
	//    6   12:putfield        #35  <Field AtomicBoolean zzazW>
	//    7   15:aload_0         
	//    8   16:new             #32  <Class AtomicBoolean>
	//    9   19:dup             
	//   10   20:invokespecial   #33  <Method void AtomicBoolean()>
	//   11   23:putfield        #37  <Field AtomicBoolean zzazX>
	//   12   26:aload_0         
	//   13   27:new             #39  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #40  <Method void ArrayList()>
	//   16   34:putfield        #42  <Field ArrayList mListeners>
		zzadP = false;
	//   17   37:aload_0         
	//   18   38:iconst_0        
	//   19   39:putfield        #44  <Field boolean zzadP>
	//   20   42:return          
	}

	public static void zza(Application application)
	{
		zzaac zzaac1 = zzazV;
	//    0    0:getstatic       #28  <Field zzaac zzazV>
	//    1    3:astore_1        
		zzaac1;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		if(!zzazV.zzadP)
	//*   4    6:getstatic       #28  <Field zzaac zzazV>
	//*   5    9:getfield        #44  <Field boolean zzadP>
	//*   6   12:ifne            36
		{
			application.registerActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (zzazV)));
	//    7   15:aload_0         
	//    8   16:getstatic       #28  <Field zzaac zzazV>
	//    9   19:invokevirtual   #51  <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
			application.registerComponentCallbacks(((android.content.ComponentCallbacks) (zzazV)));
	//   10   22:aload_0         
	//   11   23:getstatic       #28  <Field zzaac zzazV>
	//   12   26:invokevirtual   #55  <Method void Application.registerComponentCallbacks(android.content.ComponentCallbacks)>
			zzazV.zzadP = true;
	//   13   29:getstatic       #28  <Field zzaac zzazV>
	//   14   32:iconst_1        
	//   15   33:putfield        #44  <Field boolean zzadP>
		}
		zzaac1;
	//   16   36:aload_1         
		JVM INSTR monitorexit ;
	//   17   37:monitorexit     
		return;
	//   18   38:return          
		application;
	//   19   39:astore_0        
	//*  20   40:aload_1         
		throw application;
	//   21   41:monitorexit     
	//   22   42:aload_0         
	//   23   43:athrow          
	}

	private void zzat(boolean flag)
	{
		zzaac zzaac1 = zzazV;
	//    0    0:getstatic       #28  <Field zzaac zzazV>
	//    1    3:astore_2        
		zzaac1;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		for(Iterator iterator = mListeners.iterator(); iterator.hasNext(); ((zza)iterator.next()).zzat(flag));
	//    4    6:aload_0         
	//    5    7:getfield        #42  <Field ArrayList mListeners>
	//    6   10:invokevirtual   #61  <Method Iterator ArrayList.iterator()>
	//    7   13:astore_3        
	//    8   14:aload_3         
	//    9   15:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   10   20:ifeq            41
	//   11   23:aload_3         
	//   12   24:invokeinterface #71  <Method Object Iterator.next()>
	//   13   29:checkcast       #10  <Class zzaac$zza>
	//   14   32:iload_1         
	//   15   33:invokeinterface #73  <Method void zzaac$zza.zzat(boolean)>
	//*  16   38:goto            14
		zzaac1;
	//   17   41:aload_2         
		JVM INSTR monitorexit ;
	//   18   42:monitorexit     
		return;
	//   19   43:return          
		Exception exception;
		exception;
	//   20   44:astore_3        
	//*  21   45:aload_2         
		throw exception;
	//   22   46:monitorexit     
	//   23   47:aload_3         
	//   24   48:athrow          
	}

	public static zzaac zzvB()
	{
		return zzazV;
	//    0    0:getstatic       #28  <Field zzaac zzazV>
	//    1    3:areturn         
	}

	public void onActivityCreated(Activity activity, Bundle bundle)
	{
		boolean flag = zzazW.compareAndSet(true, false);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field AtomicBoolean zzazW>
	//    2    4:iconst_1        
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #81  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//    5    9:istore_3        
		zzazX.set(true);
	//    6   10:aload_0         
	//    7   11:getfield        #37  <Field AtomicBoolean zzazX>
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #84  <Method void AtomicBoolean.set(boolean)>
		if(flag)
	//*  10   18:iload_3         
	//*  11   19:ifeq            27
			zzat(false);
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:invokespecial   #85  <Method void zzat(boolean)>
	//   15   27:return          
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
		boolean flag = zzazW.compareAndSet(true, false);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field AtomicBoolean zzazW>
	//    2    4:iconst_1        
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #81  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//    5    9:istore_2        
		zzazX.set(true);
	//    6   10:aload_0         
	//    7   11:getfield        #37  <Field AtomicBoolean zzazX>
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #84  <Method void AtomicBoolean.set(boolean)>
		if(flag)
	//*  10   18:iload_2         
	//*  11   19:ifeq            27
			zzat(false);
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:invokespecial   #85  <Method void zzat(boolean)>
	//   15   27:return          
	}

	public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
	{
	//    0    0:return          
	}

	public void onActivityStarted(Activity activity)
	{
	//    0    0:return          
	}

	public void onActivityStopped(Activity activity)
	{
	//    0    0:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
	//    0    0:return          
	}

	public void onLowMemory()
	{
	//    0    0:return          
	}

	public void onTrimMemory(int i)
	{
		if(i == 20 && zzazW.compareAndSet(false, true))
	//*   0    0:iload_1         
	//*   1    1:bipush          20
	//*   2    3:icmpne          31
	//*   3    6:aload_0         
	//*   4    7:getfield        #35  <Field AtomicBoolean zzazW>
	//*   5   10:iconst_0        
	//*   6   11:iconst_1        
	//*   7   12:invokevirtual   #81  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*   8   15:ifeq            31
		{
			zzazX.set(true);
	//    9   18:aload_0         
	//   10   19:getfield        #37  <Field AtomicBoolean zzazX>
	//   11   22:iconst_1        
	//   12   23:invokevirtual   #84  <Method void AtomicBoolean.set(boolean)>
			zzat(true);
	//   13   26:aload_0         
	//   14   27:iconst_1        
	//   15   28:invokespecial   #85  <Method void zzat(boolean)>
		}
	//   16   31:return          
	}

	public void zza(zza zza1)
	{
		zzaac zzaac1 = zzazV;
	//    0    0:getstatic       #28  <Field zzaac zzazV>
	//    1    3:astore_2        
		zzaac1;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		mListeners.add(((Object) (zza1)));
	//    4    6:aload_0         
	//    5    7:getfield        #42  <Field ArrayList mListeners>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #102 <Method boolean ArrayList.add(Object)>
	//    8   14:pop             
		zzaac1;
	//    9   15:aload_2         
		JVM INSTR monitorexit ;
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		zza1;
	//   12   18:astore_1        
	//*  13   19:aload_2         
		throw zza1;
	//   14   20:monitorexit     
	//   15   21:aload_1         
	//   16   22:athrow          
	}

	public boolean zzas(boolean flag)
	{
		if(!zzazX.get())
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field AtomicBoolean zzazX>
	//*   2    4:invokevirtual   #110 <Method boolean AtomicBoolean.get()>
	//*   3    7:ifne            61
			if(zzt.zzzi())
	//*   4   10:invokestatic    #115 <Method boolean zzt.zzzi()>
	//*   5   13:ifeq            59
			{
				android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = new android.app.ActivityManager.RunningAppProcessInfo();
	//    6   16:new             #117 <Class android.app.ActivityManager$RunningAppProcessInfo>
	//    7   19:dup             
	//    8   20:invokespecial   #118 <Method void android.app.ActivityManager$RunningAppProcessInfo()>
	//    9   23:astore_2        
				ActivityManager.getMyMemoryState(runningappprocessinfo);
	//   10   24:aload_2         
	//   11   25:invokestatic    #124 <Method void ActivityManager.getMyMemoryState(android.app.ActivityManager$RunningAppProcessInfo)>
				if(!zzazX.getAndSet(true) && runningappprocessinfo.importance > 100)
	//*  12   28:aload_0         
	//*  13   29:getfield        #37  <Field AtomicBoolean zzazX>
	//*  14   32:iconst_1        
	//*  15   33:invokevirtual   #127 <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*  16   36:ifne            56
	//*  17   39:aload_2         
	//*  18   40:getfield        #131 <Field int android.app.ActivityManager$RunningAppProcessInfo.importance>
	//*  19   43:bipush          100
	//*  20   45:icmple          56
					zzazW.set(true);
	//   21   48:aload_0         
	//   22   49:getfield        #35  <Field AtomicBoolean zzazW>
	//   23   52:iconst_1        
	//   24   53:invokevirtual   #84  <Method void AtomicBoolean.set(boolean)>
			} else
	//*  25   56:goto            61
			{
				return flag;
	//   26   59:iload_1         
	//   27   60:ireturn         
			}
		return zzvC();
	//   28   61:aload_0         
	//   29   62:invokevirtual   #134 <Method boolean zzvC()>
	//   30   65:ireturn         
	}

	public boolean zzvC()
	{
		return zzazW.get();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field AtomicBoolean zzazW>
	//    2    4:invokevirtual   #110 <Method boolean AtomicBoolean.get()>
	//    3    7:ireturn         
	}

	private static final zzaac zzazV = new zzaac();
	private final ArrayList mListeners = new ArrayList();
	private boolean zzadP;
	private final AtomicBoolean zzazW = new AtomicBoolean();
	private final AtomicBoolean zzazX = new AtomicBoolean();

	static 
	{
	//    0    0:new             #2   <Class zzaac>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void zzaac()>
	//    3    7:putstatic       #28  <Field zzaac zzazV>
	//*   4   10:return          
	}
}
