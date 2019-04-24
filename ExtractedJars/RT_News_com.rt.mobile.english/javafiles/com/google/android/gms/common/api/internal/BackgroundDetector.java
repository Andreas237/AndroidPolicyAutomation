// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.app.*;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class BackgroundDetector
	implements android.app.Application.ActivityLifecycleCallbacks, ComponentCallbacks2
{
	public static interface BackgroundStateChangeListener
	{

		public abstract void onBackgroundStateChanged(boolean flag);
	}


	private BackgroundDetector()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #36  <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:invokespecial   #37  <Method void AtomicBoolean()>
	//    6   12:putfield        #39  <Field AtomicBoolean zzen>
	//    7   15:aload_0         
	//    8   16:new             #36  <Class AtomicBoolean>
	//    9   19:dup             
	//   10   20:invokespecial   #37  <Method void AtomicBoolean()>
	//   11   23:putfield        #41  <Field AtomicBoolean zzeo>
	//   12   26:aload_0         
	//   13   27:new             #43  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #44  <Method void ArrayList()>
	//   16   34:putfield        #46  <Field ArrayList zzep>
		zzeq = false;
	//   17   37:aload_0         
	//   18   38:iconst_0        
	//   19   39:putfield        #48  <Field boolean zzeq>
	//   20   42:return          
	}

	public static BackgroundDetector getInstance()
	{
		return zzem;
	//    0    0:getstatic       #32  <Field BackgroundDetector zzem>
	//    1    3:areturn         
	}

	public static void initialize(Application application)
	{
		synchronized(zzem)
	//*   0    0:getstatic       #32  <Field BackgroundDetector zzem>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			if(!zzem.zzeq)
	//*   4    6:getstatic       #32  <Field BackgroundDetector zzem>
	//*   5    9:getfield        #48  <Field boolean zzeq>
	//*   6   12:ifne            36
			{
				application.registerActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (zzem)));
	//    7   15:aload_0         
	//    8   16:getstatic       #32  <Field BackgroundDetector zzem>
	//    9   19:invokevirtual   #59  <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
				application.registerComponentCallbacks(((android.content.ComponentCallbacks) (zzem)));
	//   10   22:aload_0         
	//   11   23:getstatic       #32  <Field BackgroundDetector zzem>
	//   12   26:invokevirtual   #63  <Method void Application.registerComponentCallbacks(android.content.ComponentCallbacks)>
				zzem.zzeq = true;
	//   13   29:getstatic       #32  <Field BackgroundDetector zzem>
	//   14   32:iconst_1        
	//   15   33:putfield        #48  <Field boolean zzeq>
			}
		}
	//   16   36:aload_1         
	//   17   37:monitorexit     
		return;
	//   18   38:return          
		application;
	//   19   39:astore_0        
		backgrounddetector;
	//   20   40:aload_1         
		JVM INSTR monitorexit ;
	//   21   41:monitorexit     
		throw application;
	//   22   42:aload_0         
	//   23   43:athrow          
	}

	private final void onBackgroundStateChanged(boolean flag)
	{
		BackgroundDetector backgrounddetector = zzem;
	//    0    0:getstatic       #32  <Field BackgroundDetector zzem>
	//    1    3:astore          4
		backgrounddetector;
	//    2    5:aload           4
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		int j;
		ArrayList arraylist;
		arraylist = (ArrayList)zzep;
	//    4    8:aload_0         
	//    5    9:getfield        #46  <Field ArrayList zzep>
	//    6   12:checkcast       #43  <Class ArrayList>
	//    7   15:astore          5
		j = arraylist.size();
	//    8   17:aload           5
	//    9   19:invokevirtual   #69  <Method int ArrayList.size()>
	//   10   22:istore_3        
		int i = 0;
	//   11   23:iconst_0        
	//   12   24:istore_2        
_L1:
		if(i >= j)
			break MISSING_BLOCK_LABEL_56;
	//   13   25:iload_2         
	//   14   26:iload_3         
	//   15   27:icmpge          56
		Object obj = arraylist.get(i);
	//   16   30:aload           5
	//   17   32:iload_2         
	//   18   33:invokevirtual   #73  <Method Object ArrayList.get(int)>
	//   19   36:astore          6
		i++;
	//   20   38:iload_2         
	//   21   39:iconst_1        
	//   22   40:iadd            
	//   23   41:istore_2        
		((BackgroundStateChangeListener)obj).onBackgroundStateChanged(flag);
	//   24   42:aload           6
	//   25   44:checkcast       #10  <Class BackgroundDetector$BackgroundStateChangeListener>
	//   26   47:iload_1         
	//   27   48:invokeinterface #75  <Method void BackgroundDetector$BackgroundStateChangeListener.onBackgroundStateChanged(boolean)>
		  goto _L1
	//*  28   53:goto            25
		backgrounddetector;
	//   29   56:aload           4
		JVM INSTR monitorexit ;
	//   30   58:monitorexit     
		return;
	//   31   59:return          
		Exception exception;
		exception;
	//   32   60:astore          5
		backgrounddetector;
	//   33   62:aload           4
		JVM INSTR monitorexit ;
	//   34   64:monitorexit     
		throw exception;
	//   35   65:aload           5
	//   36   67:athrow          
	}

	public final void addListener(BackgroundStateChangeListener backgroundstatechangelistener)
	{
		synchronized(zzem)
	//*   0    0:getstatic       #32  <Field BackgroundDetector zzem>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
		{
			zzep.add(((Object) (backgroundstatechangelistener)));
	//    4    6:aload_0         
	//    5    7:getfield        #46  <Field ArrayList zzep>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #81  <Method boolean ArrayList.add(Object)>
	//    8   14:pop             
		}
	//    9   15:aload_2         
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		backgroundstatechangelistener;
	//   12   18:astore_1        
		backgrounddetector;
	//   13   19:aload_2         
		JVM INSTR monitorexit ;
	//   14   20:monitorexit     
		throw backgroundstatechangelistener;
	//   15   21:aload_1         
	//   16   22:athrow          
	}

	public final boolean isInBackground()
	{
		return zzen.get();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AtomicBoolean zzen>
	//    2    4:invokevirtual   #85  <Method boolean AtomicBoolean.get()>
	//    3    7:ireturn         
	}

	public final void onActivityCreated(Activity activity, Bundle bundle)
	{
		boolean flag = zzen.compareAndSet(true, false);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AtomicBoolean zzen>
	//    2    4:iconst_1        
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #91  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//    5    9:istore_3        
		zzeo.set(true);
	//    6   10:aload_0         
	//    7   11:getfield        #41  <Field AtomicBoolean zzeo>
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #94  <Method void AtomicBoolean.set(boolean)>
		if(flag)
	//*  10   18:iload_3         
	//*  11   19:ifeq            27
			onBackgroundStateChanged(false);
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:invokespecial   #95  <Method void onBackgroundStateChanged(boolean)>
	//   15   27:return          
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
		boolean flag = zzen.compareAndSet(true, false);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AtomicBoolean zzen>
	//    2    4:iconst_1        
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #91  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//    5    9:istore_2        
		zzeo.set(true);
	//    6   10:aload_0         
	//    7   11:getfield        #41  <Field AtomicBoolean zzeo>
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #94  <Method void AtomicBoolean.set(boolean)>
		if(flag)
	//*  10   18:iload_2         
	//*  11   19:ifeq            27
			onBackgroundStateChanged(false);
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:invokespecial   #95  <Method void onBackgroundStateChanged(boolean)>
	//   15   27:return          
	}

	public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
	{
	//    0    0:return          
	}

	public final void onActivityStarted(Activity activity)
	{
	//    0    0:return          
	}

	public final void onActivityStopped(Activity activity)
	{
	//    0    0:return          
	}

	public final void onConfigurationChanged(Configuration configuration)
	{
	//    0    0:return          
	}

	public final void onLowMemory()
	{
	//    0    0:return          
	}

	public final void onTrimMemory(int i)
	{
		if(i == 20 && zzen.compareAndSet(false, true))
	//*   0    0:iload_1         
	//*   1    1:bipush          20
	//*   2    3:icmpne          31
	//*   3    6:aload_0         
	//*   4    7:getfield        #39  <Field AtomicBoolean zzen>
	//*   5   10:iconst_0        
	//*   6   11:iconst_1        
	//*   7   12:invokevirtual   #91  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*   8   15:ifeq            31
		{
			zzeo.set(true);
	//    9   18:aload_0         
	//   10   19:getfield        #41  <Field AtomicBoolean zzeo>
	//   11   22:iconst_1        
	//   12   23:invokevirtual   #94  <Method void AtomicBoolean.set(boolean)>
			onBackgroundStateChanged(true);
	//   13   26:aload_0         
	//   14   27:iconst_1        
	//   15   28:invokespecial   #95  <Method void onBackgroundStateChanged(boolean)>
		}
	//   16   31:return          
	}

	public final boolean readCurrentStateIfPossible(boolean flag)
	{
		if(!zzeo.get())
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field AtomicBoolean zzeo>
	//*   2    4:invokevirtual   #85  <Method boolean AtomicBoolean.get()>
	//*   3    7:ifne            61
			if(PlatformVersion.isAtLeastJellyBean())
	//*   4   10:invokestatic    #116 <Method boolean PlatformVersion.isAtLeastJellyBean()>
	//*   5   13:ifeq            59
			{
				android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = new android.app.ActivityManager.RunningAppProcessInfo();
	//    6   16:new             #118 <Class android.app.ActivityManager$RunningAppProcessInfo>
	//    7   19:dup             
	//    8   20:invokespecial   #119 <Method void android.app.ActivityManager$RunningAppProcessInfo()>
	//    9   23:astore_2        
				ActivityManager.getMyMemoryState(runningappprocessinfo);
	//   10   24:aload_2         
	//   11   25:invokestatic    #125 <Method void ActivityManager.getMyMemoryState(android.app.ActivityManager$RunningAppProcessInfo)>
				if(!zzeo.getAndSet(true) && runningappprocessinfo.importance > 100)
	//*  12   28:aload_0         
	//*  13   29:getfield        #41  <Field AtomicBoolean zzeo>
	//*  14   32:iconst_1        
	//*  15   33:invokevirtual   #128 <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*  16   36:ifne            61
	//*  17   39:aload_2         
	//*  18   40:getfield        #132 <Field int android.app.ActivityManager$RunningAppProcessInfo.importance>
	//*  19   43:bipush          100
	//*  20   45:icmple          61
					zzen.set(true);
	//   21   48:aload_0         
	//   22   49:getfield        #39  <Field AtomicBoolean zzen>
	//   23   52:iconst_1        
	//   24   53:invokevirtual   #94  <Method void AtomicBoolean.set(boolean)>
			} else
	//*  25   56:goto            61
			{
				return flag;
	//   26   59:iload_1         
	//   27   60:ireturn         
			}
		return isInBackground();
	//   28   61:aload_0         
	//   29   62:invokevirtual   #134 <Method boolean isInBackground()>
	//   30   65:ireturn         
	}

	private static final BackgroundDetector zzem = new BackgroundDetector();
	private final AtomicBoolean zzen = new AtomicBoolean();
	private final AtomicBoolean zzeo = new AtomicBoolean();
	private final ArrayList zzep = new ArrayList();
	private boolean zzeq;

	static 
	{
	//    0    0:new             #2   <Class BackgroundDetector>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void BackgroundDetector()>
	//    3    7:putstatic       #32  <Field BackgroundDetector zzem>
	//*   4   10:return          
	}
}
