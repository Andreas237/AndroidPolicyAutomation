// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package com.google.android.gms.tasks:
//			zzu, zzq

private static class zzu$zza extends LifecycleCallback
{

	public static zzu$zza zza(Activity activity)
	{
		LifecycleFragment lifecyclefragment = getFragment(activity);
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method LifecycleFragment getFragment(Activity)>
	//    2    4:astore_2        
		zzu$zza zzu$zza1 = (zzu$zza)lifecyclefragment.getCallbackOrNull("TaskOnStopCallback", com/google/android/gms/tasks/zzu$zza);
	//    3    5:aload_2         
	//    4    6:ldc1            #27  <String "TaskOnStopCallback">
	//    5    8:ldc1            #2   <Class zzu$zza>
	//    6   10:invokeinterface #43  <Method LifecycleCallback LifecycleFragment.getCallbackOrNull(String, Class)>
	//    7   15:checkcast       #2   <Class zzu$zza>
	//    8   18:astore_1        
		activity = ((Activity) (zzu$zza1));
	//    9   19:aload_1         
	//   10   20:astore_0        
		if(zzu$zza1 == null)
	//*  11   21:aload_1         
	//*  12   22:ifnonnull       34
			activity = ((Activity) (new zzu$zza(lifecyclefragment)));
	//   13   25:new             #2   <Class zzu$zza>
	//   14   28:dup             
	//   15   29:aload_2         
	//   16   30:invokespecial   #44  <Method void zzu$zza(LifecycleFragment)>
	//   17   33:astore_0        
		return ((zzu$zza) (activity));
	//   18   34:aload_0         
	//   19   35:areturn         
	}

	public void onStop()
	{
		List list = zzac;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List zzac>
	//    2    4:astore_1        
		list;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Iterator iterator = zzac.iterator();
	//    5    7:aload_0         
	//    6    8:getfield        #21  <Field List zzac>
	//    7   11:invokeinterface #51  <Method Iterator List.iterator()>
	//    8   16:astore_2        
_L1:
		zzq zzq1;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_55;
	//    9   17:aload_2         
	//   10   18:invokeinterface #57  <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            55
			zzq1 = (zzq)((WeakReference)iterator.next()).get();
	//   12   26:aload_2         
	//   13   27:invokeinterface #61  <Method Object Iterator.next()>
	//   14   32:checkcast       #63  <Class WeakReference>
	//   15   35:invokevirtual   #66  <Method Object WeakReference.get()>
	//   16   38:checkcast       #68  <Class zzq>
	//   17   41:astore_3        
		} while(zzq1 == null);
	//   18   42:aload_3         
	//   19   43:ifnull          17
		zzq1.cancel();
	//   20   46:aload_3         
	//   21   47:invokeinterface #71  <Method void zzq.cancel()>
		  goto _L1
	//*  22   52:goto            17
		zzac.clear();
	//   23   55:aload_0         
	//   24   56:getfield        #21  <Field List zzac>
	//   25   59:invokeinterface #74  <Method void List.clear()>
		list;
	//   26   64:aload_1         
		JVM INSTR monitorexit ;
	//   27   65:monitorexit     
		return;
	//   28   66:return          
		Exception exception;
		exception;
	//   29   67:astore_2        
		list;
	//   30   68:aload_1         
		JVM INSTR monitorexit ;
	//   31   69:monitorexit     
		throw exception;
	//   32   70:aload_2         
	//   33   71:athrow          
	}

	public final void zzb(zzq zzq1)
	{
		synchronized(zzac)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field List zzac>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzac.add(((Object) (new WeakReference(((Object) (zzq1))))));
	//    5    7:aload_0         
	//    6    8:getfield        #21  <Field List zzac>
	//    7   11:new             #63  <Class WeakReference>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:invokespecial   #79  <Method void WeakReference(Object)>
	//   11   19:invokeinterface #83  <Method boolean List.add(Object)>
	//   12   24:pop             
		}
	//   13   25:aload_2         
	//   14   26:monitorexit     
		return;
	//   15   27:return          
		zzq1;
	//   16   28:astore_1        
		list;
	//   17   29:aload_2         
		JVM INSTR monitorexit ;
	//   18   30:monitorexit     
		throw zzq1;
	//   19   31:aload_1         
	//   20   32:athrow          
	}

	private final List zzac = new ArrayList();

	private zzu$zza(LifecycleFragment lifecyclefragment)
	{
		super(lifecyclefragment);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void LifecycleCallback(LifecycleFragment)>
	//    3    5:aload_0         
	//    4    6:new             #16  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #19  <Method void ArrayList()>
	//    7   13:putfield        #21  <Field List zzac>
		mLifecycleFragment.addCallback("TaskOnStopCallback", ((LifecycleCallback) (this)));
	//    8   16:aload_0         
	//    9   17:getfield        #25  <Field LifecycleFragment mLifecycleFragment>
	//   10   20:ldc1            #27  <String "TaskOnStopCallback">
	//   11   22:aload_0         
	//   12   23:invokeinterface #33  <Method void LifecycleFragment.addCallback(String, LifecycleCallback)>
	//   13   28:return          
	}
}
