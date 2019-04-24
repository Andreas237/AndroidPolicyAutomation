// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.*;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.tasks:
//			Task, zzr, zzg, TaskExecutors, 
//			zzi, zzk, zzm, zzc, 
//			zze, RuntimeExecutionException, zzo, OnCanceledListener, 
//			OnCompleteListener, OnFailureListener, OnSuccessListener, Continuation, 
//			SuccessContinuation, zzq

final class zzu extends Task
{
	private static class zza extends LifecycleCallback
	{

		public static zza zza(Activity activity)
		{
			LifecycleFragment lifecyclefragment = getFragment(activity);
		//    0    0:aload_0         
		//    1    1:invokestatic    #39  <Method LifecycleFragment getFragment(Activity)>
		//    2    4:astore_2        
			zza zza1 = (zza)lifecyclefragment.getCallbackOrNull("TaskOnStopCallback", com/google/android/gms/tasks/zzu$zza);
		//    3    5:aload_2         
		//    4    6:ldc1            #27  <String "TaskOnStopCallback">
		//    5    8:ldc1            #2   <Class zzu$zza>
		//    6   10:invokeinterface #43  <Method LifecycleCallback LifecycleFragment.getCallbackOrNull(String, Class)>
		//    7   15:checkcast       #2   <Class zzu$zza>
		//    8   18:astore_1        
			activity = ((Activity) (zza1));
		//    9   19:aload_1         
		//   10   20:astore_0        
			if(zza1 == null)
		//*  11   21:aload_1         
		//*  12   22:ifnonnull       34
				activity = ((Activity) (new zza(lifecyclefragment)));
		//   13   25:new             #2   <Class zzu$zza>
		//   14   28:dup             
		//   15   29:aload_2         
		//   16   30:invokespecial   #44  <Method void zzu$zza(LifecycleFragment)>
		//   17   33:astore_0        
			return ((zza) (activity));
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

		private zza(LifecycleFragment lifecyclefragment)
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


	zzu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Task()>
	//    2    4:aload_0         
	//    3    5:new             #28  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void Object()>
	//    6   12:putfield        #31  <Field Object mLock>
	//    7   15:aload_0         
	//    8   16:new             #33  <Class zzr>
	//    9   19:dup             
	//   10   20:invokespecial   #34  <Method void zzr()>
	//   11   23:putfield        #36  <Field zzr zzx>
	//   12   26:return          
	}

	private final void zzb()
	{
		Preconditions.checkState(zzy, "Task is not yet complete");
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean zzy>
	//    2    4:ldc1            #42  <String "Task is not yet complete">
	//    3    6:invokestatic    #48  <Method void Preconditions.checkState(boolean, Object)>
	//    4    9:return          
	}

	private final void zzc()
	{
		Preconditions.checkState(zzy ^ true, "Task is already complete");
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean zzy>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ldc1            #52  <String "Task is already complete">
	//    5    8:invokestatic    #48  <Method void Preconditions.checkState(boolean, Object)>
	//    6   11:return          
	}

	private final void zzd()
	{
		if(zzz)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field boolean zzz>
	//*   2    4:ifeq            17
			throw new CancellationException("Task is already canceled.");
	//    3    7:new             #57  <Class CancellationException>
	//    4   10:dup             
	//    5   11:ldc1            #59  <String "Task is already canceled.">
	//    6   13:invokespecial   #62  <Method void CancellationException(String)>
	//    7   16:athrow          
		else
			return;
	//    8   17:return          
	}

	private final void zze()
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(zzy)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #40  <Field boolean zzy>
	//    7   11:ifne            17
			}
	//    8   14:aload_1         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		obj;
	//   11   17:aload_1         
		JVM INSTR monitorexit ;
	//   12   18:monitorexit     
		zzx.zza(((Task) (this)));
	//   13   19:aload_0         
	//   14   20:getfield        #36  <Field zzr zzx>
	//   15   23:aload_0         
	//   16   24:invokevirtual   #66  <Method void zzr.zza(Task)>
		return;
	//   17   27:return          
		exception;
	//   18   28:astore_2        
		obj;
	//   19   29:aload_1         
		JVM INSTR monitorexit ;
	//   20   30:monitorexit     
		throw exception;
	//   21   31:aload_2         
	//   22   32:athrow          
	}

	public final Task addOnCanceledListener(Activity activity, OnCanceledListener oncanceledlistener)
	{
		oncanceledlistener = ((OnCanceledListener) (new zzg(TaskExecutors.MAIN_THREAD, oncanceledlistener)));
	//    0    0:new             #70  <Class zzg>
	//    1    3:dup             
	//    2    4:getstatic       #76  <Field Executor TaskExecutors.MAIN_THREAD>
	//    3    7:aload_2         
	//    4    8:invokespecial   #79  <Method void zzg(Executor, OnCanceledListener)>
	//    5   11:astore_2        
		zzx.zza(((zzq) (oncanceledlistener)));
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field zzr zzx>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #82  <Method void zzr.zza(zzq)>
		zza.zza(activity).zzb(((zzq) (oncanceledlistener)));
	//   10   20:aload_1         
	//   11   21:invokestatic    #85  <Method zzu$zza zzu$zza.zza(Activity)>
	//   12   24:aload_2         
	//   13   25:invokevirtual   #87  <Method void zzu$zza.zzb(zzq)>
		zze();
	//   14   28:aload_0         
	//   15   29:invokespecial   #89  <Method void zze()>
		return ((Task) (this));
	//   16   32:aload_0         
	//   17   33:areturn         
	}

	public final Task addOnCanceledListener(OnCanceledListener oncanceledlistener)
	{
		return ((Task)this).addOnCanceledListener(TaskExecutors.MAIN_THREAD, oncanceledlistener);
	//    0    0:aload_0         
	//    1    1:getstatic       #76  <Field Executor TaskExecutors.MAIN_THREAD>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #95  <Method Task Task.addOnCanceledListener(Executor, OnCanceledListener)>
	//    4    8:areturn         
	}

	public final Task addOnCanceledListener(Executor executor, OnCanceledListener oncanceledlistener)
	{
		zzx.zza(((zzq) (new zzg(executor, oncanceledlistener))));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field zzr zzx>
	//    2    4:new             #70  <Class zzg>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #79  <Method void zzg(Executor, OnCanceledListener)>
	//    7   13:invokevirtual   #82  <Method void zzr.zza(zzq)>
		zze();
	//    8   16:aload_0         
	//    9   17:invokespecial   #89  <Method void zze()>
		return ((Task) (this));
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public final Task addOnCompleteListener(Activity activity, OnCompleteListener oncompletelistener)
	{
		oncompletelistener = ((OnCompleteListener) (new zzi(TaskExecutors.MAIN_THREAD, oncompletelistener)));
	//    0    0:new             #101 <Class zzi>
	//    1    3:dup             
	//    2    4:getstatic       #76  <Field Executor TaskExecutors.MAIN_THREAD>
	//    3    7:aload_2         
	//    4    8:invokespecial   #104 <Method void zzi(Executor, OnCompleteListener)>
	//    5   11:astore_2        
		zzx.zza(((zzq) (oncompletelistener)));
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field zzr zzx>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #82  <Method void zzr.zza(zzq)>
		zza.zza(activity).zzb(((zzq) (oncompletelistener)));
	//   10   20:aload_1         
	//   11   21:invokestatic    #85  <Method zzu$zza zzu$zza.zza(Activity)>
	//   12   24:aload_2         
	//   13   25:invokevirtual   #87  <Method void zzu$zza.zzb(zzq)>
		zze();
	//   14   28:aload_0         
	//   15   29:invokespecial   #89  <Method void zze()>
		return ((Task) (this));
	//   16   32:aload_0         
	//   17   33:areturn         
	}

	public final Task addOnCompleteListener(OnCompleteListener oncompletelistener)
	{
		return ((Task)this).addOnCompleteListener(TaskExecutors.MAIN_THREAD, oncompletelistener);
	//    0    0:aload_0         
	//    1    1:getstatic       #76  <Field Executor TaskExecutors.MAIN_THREAD>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #109 <Method Task Task.addOnCompleteListener(Executor, OnCompleteListener)>
	//    4    8:areturn         
	}

	public final Task addOnCompleteListener(Executor executor, OnCompleteListener oncompletelistener)
	{
		zzx.zza(((zzq) (new zzi(executor, oncompletelistener))));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field zzr zzx>
	//    2    4:new             #101 <Class zzi>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #104 <Method void zzi(Executor, OnCompleteListener)>
	//    7   13:invokevirtual   #82  <Method void zzr.zza(zzq)>
		zze();
	//    8   16:aload_0         
	//    9   17:invokespecial   #89  <Method void zze()>
		return ((Task) (this));
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public final Task addOnFailureListener(Activity activity, OnFailureListener onfailurelistener)
	{
		onfailurelistener = ((OnFailureListener) (new zzk(TaskExecutors.MAIN_THREAD, onfailurelistener)));
	//    0    0:new             #115 <Class zzk>
	//    1    3:dup             
	//    2    4:getstatic       #76  <Field Executor TaskExecutors.MAIN_THREAD>
	//    3    7:aload_2         
	//    4    8:invokespecial   #118 <Method void zzk(Executor, OnFailureListener)>
	//    5   11:astore_2        
		zzx.zza(((zzq) (onfailurelistener)));
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field zzr zzx>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #82  <Method void zzr.zza(zzq)>
		zza.zza(activity).zzb(((zzq) (onfailurelistener)));
	//   10   20:aload_1         
	//   11   21:invokestatic    #85  <Method zzu$zza zzu$zza.zza(Activity)>
	//   12   24:aload_2         
	//   13   25:invokevirtual   #87  <Method void zzu$zza.zzb(zzq)>
		zze();
	//   14   28:aload_0         
	//   15   29:invokespecial   #89  <Method void zze()>
		return ((Task) (this));
	//   16   32:aload_0         
	//   17   33:areturn         
	}

	public final Task addOnFailureListener(OnFailureListener onfailurelistener)
	{
		return ((Task)this).addOnFailureListener(TaskExecutors.MAIN_THREAD, onfailurelistener);
	//    0    0:aload_0         
	//    1    1:getstatic       #76  <Field Executor TaskExecutors.MAIN_THREAD>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #123 <Method Task Task.addOnFailureListener(Executor, OnFailureListener)>
	//    4    8:areturn         
	}

	public final Task addOnFailureListener(Executor executor, OnFailureListener onfailurelistener)
	{
		zzx.zza(((zzq) (new zzk(executor, onfailurelistener))));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field zzr zzx>
	//    2    4:new             #115 <Class zzk>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #118 <Method void zzk(Executor, OnFailureListener)>
	//    7   13:invokevirtual   #82  <Method void zzr.zza(zzq)>
		zze();
	//    8   16:aload_0         
	//    9   17:invokespecial   #89  <Method void zze()>
		return ((Task) (this));
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public final Task addOnSuccessListener(Activity activity, OnSuccessListener onsuccesslistener)
	{
		onsuccesslistener = ((OnSuccessListener) (new zzm(TaskExecutors.MAIN_THREAD, onsuccesslistener)));
	//    0    0:new             #129 <Class zzm>
	//    1    3:dup             
	//    2    4:getstatic       #76  <Field Executor TaskExecutors.MAIN_THREAD>
	//    3    7:aload_2         
	//    4    8:invokespecial   #132 <Method void zzm(Executor, OnSuccessListener)>
	//    5   11:astore_2        
		zzx.zza(((zzq) (onsuccesslistener)));
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field zzr zzx>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #82  <Method void zzr.zza(zzq)>
		zza.zza(activity).zzb(((zzq) (onsuccesslistener)));
	//   10   20:aload_1         
	//   11   21:invokestatic    #85  <Method zzu$zza zzu$zza.zza(Activity)>
	//   12   24:aload_2         
	//   13   25:invokevirtual   #87  <Method void zzu$zza.zzb(zzq)>
		zze();
	//   14   28:aload_0         
	//   15   29:invokespecial   #89  <Method void zze()>
		return ((Task) (this));
	//   16   32:aload_0         
	//   17   33:areturn         
	}

	public final Task addOnSuccessListener(OnSuccessListener onsuccesslistener)
	{
		return ((Task)this).addOnSuccessListener(TaskExecutors.MAIN_THREAD, onsuccesslistener);
	//    0    0:aload_0         
	//    1    1:getstatic       #76  <Field Executor TaskExecutors.MAIN_THREAD>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #137 <Method Task Task.addOnSuccessListener(Executor, OnSuccessListener)>
	//    4    8:areturn         
	}

	public final Task addOnSuccessListener(Executor executor, OnSuccessListener onsuccesslistener)
	{
		zzx.zza(((zzq) (new zzm(executor, onsuccesslistener))));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field zzr zzx>
	//    2    4:new             #129 <Class zzm>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #132 <Method void zzm(Executor, OnSuccessListener)>
	//    7   13:invokevirtual   #82  <Method void zzr.zza(zzq)>
		zze();
	//    8   16:aload_0         
	//    9   17:invokespecial   #89  <Method void zze()>
		return ((Task) (this));
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public final Task continueWith(Continuation continuation)
	{
		return ((Task)this).continueWith(TaskExecutors.MAIN_THREAD, continuation);
	//    0    0:aload_0         
	//    1    1:getstatic       #76  <Field Executor TaskExecutors.MAIN_THREAD>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #144 <Method Task Task.continueWith(Executor, Continuation)>
	//    4    8:areturn         
	}

	public final Task continueWith(Executor executor, Continuation continuation)
	{
		zzu zzu1 = new zzu();
	//    0    0:new             #2   <Class zzu>
	//    1    3:dup             
	//    2    4:invokespecial   #146 <Method void zzu()>
	//    3    7:astore_3        
		zzx.zza(((zzq) (new zzc(executor, continuation, zzu1))));
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field zzr zzx>
	//    6   12:new             #148 <Class zzc>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:invokespecial   #151 <Method void zzc(Executor, Continuation, zzu)>
	//   12   22:invokevirtual   #82  <Method void zzr.zza(zzq)>
		zze();
	//   13   25:aload_0         
	//   14   26:invokespecial   #89  <Method void zze()>
		return ((Task) (zzu1));
	//   15   29:aload_3         
	//   16   30:areturn         
	}

	public final Task continueWithTask(Continuation continuation)
	{
		return ((Task)this).continueWithTask(TaskExecutors.MAIN_THREAD, continuation);
	//    0    0:aload_0         
	//    1    1:getstatic       #76  <Field Executor TaskExecutors.MAIN_THREAD>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #155 <Method Task Task.continueWithTask(Executor, Continuation)>
	//    4    8:areturn         
	}

	public final Task continueWithTask(Executor executor, Continuation continuation)
	{
		zzu zzu1 = new zzu();
	//    0    0:new             #2   <Class zzu>
	//    1    3:dup             
	//    2    4:invokespecial   #146 <Method void zzu()>
	//    3    7:astore_3        
		zzx.zza(((zzq) (new zze(executor, continuation, zzu1))));
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field zzr zzx>
	//    6   12:new             #158 <Class zze>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:invokespecial   #159 <Method void zze(Executor, Continuation, zzu)>
	//   12   22:invokevirtual   #82  <Method void zzr.zza(zzq)>
		zze();
	//   13   25:aload_0         
	//   14   26:invokespecial   #89  <Method void zze()>
		return ((Task) (zzu1));
	//   15   29:aload_3         
	//   16   30:areturn         
	}

	public final Exception getException()
	{
		Exception exception;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			exception = zzab;
	//    5    7:aload_0         
	//    6    8:getfield        #164 <Field Exception zzab>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return exception;
	//   10   14:aload_2         
	//   11   15:areturn         
		exception1;
	//   12   16:astore_2        
		obj;
	//   13   17:aload_1         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception1;
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	public final Object getResult()
	{
		Object obj1;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzb();
	//    5    7:aload_0         
	//    6    8:invokespecial   #168 <Method void zzb()>
			zzd();
	//    7   11:aload_0         
	//    8   12:invokespecial   #170 <Method void zzd()>
			if(zzab != null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #164 <Field Exception zzab>
	//*  11   19:ifnull          34
				throw new RuntimeExecutionException(((Throwable) (zzab)));
	//   12   22:new             #172 <Class RuntimeExecutionException>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:getfield        #164 <Field Exception zzab>
	//   16   30:invokespecial   #175 <Method void RuntimeExecutionException(Throwable)>
	//   17   33:athrow          
			obj1 = zzaa;
	//   18   34:aload_0         
	//   19   35:getfield        #177 <Field Object zzaa>
	//   20   38:astore_2        
		}
	//   21   39:aload_1         
	//   22   40:monitorexit     
		return obj1;
	//   23   41:aload_2         
	//   24   42:areturn         
		exception;
	//   25   43:astore_2        
		obj;
	//   26   44:aload_1         
		JVM INSTR monitorexit ;
	//   27   45:monitorexit     
		throw exception;
	//   28   46:aload_2         
	//   29   47:athrow          
	}

	public final Object getResult(Class class1)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzb();
	//    5    7:aload_0         
	//    6    8:invokespecial   #168 <Method void zzb()>
			zzd();
	//    7   11:aload_0         
	//    8   12:invokespecial   #170 <Method void zzd()>
			if(class1.isInstance(((Object) (zzab))))
	//*   9   15:aload_1         
	//*  10   16:aload_0         
	//*  11   17:getfield        #164 <Field Exception zzab>
	//*  12   20:invokevirtual   #185 <Method boolean Class.isInstance(Object)>
	//*  13   23:ifeq            38
				throw (Throwable)class1.cast(((Object) (zzab)));
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #164 <Field Exception zzab>
	//   17   31:invokevirtual   #189 <Method Object Class.cast(Object)>
	//   18   34:checkcast       #191 <Class Throwable>
	//   19   37:athrow          
			if(zzab != null)
	//*  20   38:aload_0         
	//*  21   39:getfield        #164 <Field Exception zzab>
	//*  22   42:ifnull          57
				throw new RuntimeExecutionException(((Throwable) (zzab)));
	//   23   45:new             #172 <Class RuntimeExecutionException>
	//   24   48:dup             
	//   25   49:aload_0         
	//   26   50:getfield        #164 <Field Exception zzab>
	//   27   53:invokespecial   #175 <Method void RuntimeExecutionException(Throwable)>
	//   28   56:athrow          
			class1 = ((Class) (zzaa));
	//   29   57:aload_0         
	//   30   58:getfield        #177 <Field Object zzaa>
	//   31   61:astore_1        
		}
	//   32   62:aload_2         
	//   33   63:monitorexit     
		return ((Object) (class1));
	//   34   64:aload_1         
	//   35   65:areturn         
		class1;
	//   36   66:astore_1        
		obj;
	//   37   67:aload_2         
		JVM INSTR monitorexit ;
	//   38   68:monitorexit     
		throw class1;
	//   39   69:aload_1         
	//   40   70:athrow          
	}

	public final boolean isCanceled()
	{
		return zzz;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field boolean zzz>
	//    2    4:ireturn         
	}

	public final boolean isComplete()
	{
		boolean flag;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = zzy;
	//    5    7:aload_0         
	//    6    8:getfield        #40  <Field boolean zzy>
	//    7   11:istore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return flag;
	//   10   14:iload_1         
	//   11   15:ireturn         
		exception;
	//   12   16:astore_3        
		obj;
	//   13   17:aload_2         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	public final boolean isSuccessful()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(zzy && !zzz && zzab == null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #40  <Field boolean zzy>
	//*   7   11:ifeq            42
	//*   8   14:aload_0         
	//*   9   15:getfield        #55  <Field boolean zzz>
	//*  10   18:ifne            42
	//*  11   21:aload_0         
	//*  12   22:getfield        #164 <Field Exception zzab>
	//*  13   25:ifnonnull       42
			flag = true;
	//   14   28:iconst_1        
	//   15   29:istore_1        
		else
	//*  16   30:goto            33
	//*  17   33:aload_2         
	//*  18   34:monitorexit     
	//*  19   35:iload_1         
	//*  20   36:ireturn         
	//*  21   37:astore_3        
	//*  22   38:aload_2         
	//*  23   39:monitorexit     
	//*  24   40:aload_3         
	//*  25   41:athrow          
			flag = false;
	//   26   42:iconst_0        
	//   27   43:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  28   44:goto            33
	}

	public final Task onSuccessTask(SuccessContinuation successcontinuation)
	{
		return ((Task)this).onSuccessTask(TaskExecutors.MAIN_THREAD, successcontinuation);
	//    0    0:aload_0         
	//    1    1:getstatic       #76  <Field Executor TaskExecutors.MAIN_THREAD>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #201 <Method Task Task.onSuccessTask(Executor, SuccessContinuation)>
	//    4    8:areturn         
	}

	public final Task onSuccessTask(Executor executor, SuccessContinuation successcontinuation)
	{
		zzu zzu1 = new zzu();
	//    0    0:new             #2   <Class zzu>
	//    1    3:dup             
	//    2    4:invokespecial   #146 <Method void zzu()>
	//    3    7:astore_3        
		zzx.zza(((zzq) (new zzo(executor, successcontinuation, zzu1))));
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field zzr zzx>
	//    6   12:new             #204 <Class zzo>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:invokespecial   #207 <Method void zzo(Executor, SuccessContinuation, zzu)>
	//   12   22:invokevirtual   #82  <Method void zzr.zza(zzq)>
		zze();
	//   13   25:aload_0         
	//   14   26:invokespecial   #89  <Method void zze()>
		return ((Task) (zzu1));
	//   15   29:aload_3         
	//   16   30:areturn         
	}

	public final void setException(Exception exception)
	{
		Preconditions.checkNotNull(((Object) (exception)), "Exception must not be null");
	//    0    0:aload_1         
	//    1    1:ldc1            #212 <String "Exception must not be null">
	//    2    3:invokestatic    #216 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		synchronized(mLock)
	//*   4    7:aload_0         
	//*   5    8:getfield        #31  <Field Object mLock>
	//*   6   11:astore_2        
	//*   7   12:aload_2         
	//*   8   13:monitorenter    
		{
			zzc();
	//    9   14:aload_0         
	//   10   15:invokespecial   #218 <Method void zzc()>
			zzy = true;
	//   11   18:aload_0         
	//   12   19:iconst_1        
	//   13   20:putfield        #40  <Field boolean zzy>
			zzab = exception;
	//   14   23:aload_0         
	//   15   24:aload_1         
	//   16   25:putfield        #164 <Field Exception zzab>
		}
	//   17   28:aload_2         
	//   18   29:monitorexit     
		zzx.zza(((Task) (this)));
	//   19   30:aload_0         
	//   20   31:getfield        #36  <Field zzr zzx>
	//   21   34:aload_0         
	//   22   35:invokevirtual   #66  <Method void zzr.zza(Task)>
		return;
	//   23   38:return          
		exception;
	//   24   39:astore_1        
		obj;
	//   25   40:aload_2         
		JVM INSTR monitorexit ;
	//   26   41:monitorexit     
		throw exception;
	//   27   42:aload_1         
	//   28   43:athrow          
	}

	public final void setResult(Object obj)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzc();
	//    5    7:aload_0         
	//    6    8:invokespecial   #218 <Method void zzc()>
			zzy = true;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #40  <Field boolean zzy>
			zzaa = obj;
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:putfield        #177 <Field Object zzaa>
		}
	//   13   21:aload_2         
	//   14   22:monitorexit     
		zzx.zza(((Task) (this)));
	//   15   23:aload_0         
	//   16   24:getfield        #36  <Field zzr zzx>
	//   17   27:aload_0         
	//   18   28:invokevirtual   #66  <Method void zzr.zza(Task)>
		return;
	//   19   31:return          
		obj;
	//   20   32:astore_1        
		obj1;
	//   21   33:aload_2         
		JVM INSTR monitorexit ;
	//   22   34:monitorexit     
		throw obj;
	//   23   35:aload_1         
	//   24   36:athrow          
	}

	public final boolean trySetException(Exception exception)
	{
label0:
		{
			Preconditions.checkNotNull(((Object) (exception)), "Exception must not be null");
	//    0    0:aload_1         
	//    1    1:ldc1            #212 <String "Exception must not be null">
	//    2    3:invokestatic    #216 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
			synchronized(mLock)
	//*   4    7:aload_0         
	//*   5    8:getfield        #31  <Field Object mLock>
	//*   6   11:astore_2        
	//*   7   12:aload_2         
	//*   8   13:monitorenter    
			{
				if(!zzy)
					break label0;
	//    9   14:aload_0         
	//   10   15:getfield        #40  <Field boolean zzy>
	//   11   18:ifeq            25
			}
	//   12   21:aload_2         
	//   13   22:monitorexit     
			return false;
	//   14   23:iconst_0        
	//   15   24:ireturn         
		}
		zzy = true;
	//   16   25:aload_0         
	//   17   26:iconst_1        
	//   18   27:putfield        #40  <Field boolean zzy>
		zzab = exception;
	//   19   30:aload_0         
	//   20   31:aload_1         
	//   21   32:putfield        #164 <Field Exception zzab>
		obj;
	//   22   35:aload_2         
		JVM INSTR monitorexit ;
	//   23   36:monitorexit     
		zzx.zza(((Task) (this)));
	//   24   37:aload_0         
	//   25   38:getfield        #36  <Field zzr zzx>
	//   26   41:aload_0         
	//   27   42:invokevirtual   #66  <Method void zzr.zza(Task)>
		return true;
	//   28   45:iconst_1        
	//   29   46:ireturn         
		exception;
	//   30   47:astore_1        
		obj;
	//   31   48:aload_2         
		JVM INSTR monitorexit ;
	//   32   49:monitorexit     
		throw exception;
	//   33   50:aload_1         
	//   34   51:athrow          
	}

	public final boolean trySetResult(Object obj)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(!zzy)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #40  <Field boolean zzy>
	//    7   11:ifeq            18
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		}
		zzy = true;
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:putfield        #40  <Field boolean zzy>
		zzaa = obj;
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:putfield        #177 <Field Object zzaa>
		obj1;
	//   18   28:aload_2         
		JVM INSTR monitorexit ;
	//   19   29:monitorexit     
		zzx.zza(((Task) (this)));
	//   20   30:aload_0         
	//   21   31:getfield        #36  <Field zzr zzx>
	//   22   34:aload_0         
	//   23   35:invokevirtual   #66  <Method void zzr.zza(Task)>
		return true;
	//   24   38:iconst_1        
	//   25   39:ireturn         
		obj;
	//   26   40:astore_1        
		obj1;
	//   27   41:aload_2         
		JVM INSTR monitorexit ;
	//   28   42:monitorexit     
		throw obj;
	//   29   43:aload_1         
	//   30   44:athrow          
	}

	public final boolean zza()
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(!zzy)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #40  <Field boolean zzy>
	//    7   11:ifeq            18
			}
	//    8   14:aload_1         
	//    9   15:monitorexit     
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		}
		zzy = true;
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:putfield        #40  <Field boolean zzy>
		zzz = true;
	//   15   23:aload_0         
	//   16   24:iconst_1        
	//   17   25:putfield        #55  <Field boolean zzz>
		obj;
	//   18   28:aload_1         
		JVM INSTR monitorexit ;
	//   19   29:monitorexit     
		zzx.zza(((Task) (this)));
	//   20   30:aload_0         
	//   21   31:getfield        #36  <Field zzr zzx>
	//   22   34:aload_0         
	//   23   35:invokevirtual   #66  <Method void zzr.zza(Task)>
		return true;
	//   24   38:iconst_1        
	//   25   39:ireturn         
		exception;
	//   26   40:astore_2        
		obj;
	//   27   41:aload_1         
		JVM INSTR monitorexit ;
	//   28   42:monitorexit     
		throw exception;
	//   29   43:aload_2         
	//   30   44:athrow          
	}

	private final Object mLock = new Object();
	private Object zzaa;
	private Exception zzab;
	private final zzr zzx = new zzr();
	private boolean zzy;
	private volatile boolean zzz;
}
