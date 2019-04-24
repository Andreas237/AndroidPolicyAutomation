// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.internal.zzaaw;
import com.google.android.gms.internal.zzaax;
import java.lang.ref.WeakReference;
import java.util.*;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.tasks:
//			Task, zzg, zzc, TaskExecutors, 
//			zzd, zze, zza, zzb, 
//			RuntimeExecutionException, OnCompleteListener, OnFailureListener, OnSuccessListener, 
//			Continuation, zzf

final class zzh extends Task
{
	private static class zza extends zzaaw
	{

		public static zza zzw(Activity activity)
		{
			zzaax zzaax1 = zzs(activity);
		//    0    0:aload_0         
		//    1    1:invokestatic    #39  <Method zzaax zzs(Activity)>
		//    2    4:astore_2        
			zza zza1 = (zza)zzaax1.zza("TaskOnStopCallback", com/google/android/gms/tasks/zzh$zza);
		//    3    5:aload_2         
		//    4    6:ldc1            #27  <String "TaskOnStopCallback">
		//    5    8:ldc1            #2   <Class zzh$zza>
		//    6   10:invokeinterface #42  <Method zzaaw zzaax.zza(String, Class)>
		//    7   15:checkcast       #2   <Class zzh$zza>
		//    8   18:astore_1        
			activity = ((Activity) (zza1));
		//    9   19:aload_1         
		//   10   20:astore_0        
			if(zza1 == null)
		//*  11   21:aload_1         
		//*  12   22:ifnonnull       34
				activity = ((Activity) (new zza(zzaax1)));
		//   13   25:new             #2   <Class zzh$zza>
		//   14   28:dup             
		//   15   29:aload_2         
		//   16   30:invokespecial   #43  <Method void zzh$zza(zzaax)>
		//   17   33:astore_0        
			return ((zza) (activity));
		//   18   34:aload_0         
		//   19   35:areturn         
		}

		public void onStop()
		{
			List list = mListeners;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field List mListeners>
		//    2    4:astore_1        
			list;
		//    3    5:aload_1         
			JVM INSTR monitorenter ;
		//    4    6:monitorenter    
			Iterator iterator = mListeners.iterator();
		//    5    7:aload_0         
		//    6    8:getfield        #21  <Field List mListeners>
		//    7   11:invokeinterface #51  <Method Iterator List.iterator()>
		//    8   16:astore_2        
_L2:
			zzf zzf1;
			do
			{
				if(!iterator.hasNext())
					break MISSING_BLOCK_LABEL_60;
		//    9   17:aload_2         
		//   10   18:invokeinterface #57  <Method boolean Iterator.hasNext()>
		//   11   23:ifeq            60
				zzf1 = (zzf)((WeakReference)iterator.next()).get();
		//   12   26:aload_2         
		//   13   27:invokeinterface #61  <Method Object Iterator.next()>
		//   14   32:checkcast       #63  <Class WeakReference>
		//   15   35:invokevirtual   #66  <Method Object WeakReference.get()>
		//   16   38:checkcast       #68  <Class zzf>
		//   17   41:astore_3        
			} while(zzf1 == null);
		//   18   42:aload_3         
		//   19   43:ifnull          17
			zzf1.cancel();
		//   20   46:aload_3         
		//   21   47:invokeinterface #71  <Method void zzf.cancel()>
			if(true) goto _L2; else goto _L1
		//   22   52:goto            17
_L1:
			Exception exception;
			exception;
		//   23   55:astore_2        
			list;
		//   24   56:aload_1         
			JVM INSTR monitorexit ;
		//   25   57:monitorexit     
			throw exception;
		//   26   58:aload_2         
		//   27   59:athrow          
			mListeners.clear();
		//   28   60:aload_0         
		//   29   61:getfield        #21  <Field List mListeners>
		//   30   64:invokeinterface #74  <Method void List.clear()>
			list;
		//   31   69:aload_1         
			JVM INSTR monitorexit ;
		//   32   70:monitorexit     
		//   33   71:return          
		}

		public void zzb(zzf zzf1)
		{
			synchronized(mListeners)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field List mListeners>
		//*   2    4:astore_2        
		//*   3    5:aload_2         
		//*   4    6:monitorenter    
			{
				mListeners.add(((Object) (new WeakReference(((Object) (zzf1))))));
		//    5    7:aload_0         
		//    6    8:getfield        #21  <Field List mListeners>
		//    7   11:new             #63  <Class WeakReference>
		//    8   14:dup             
		//    9   15:aload_1         
		//   10   16:invokespecial   #80  <Method void WeakReference(Object)>
		//   11   19:invokeinterface #84  <Method boolean List.add(Object)>
		//   12   24:pop             
			}
		//   13   25:aload_2         
		//   14   26:monitorexit     
			return;
		//   15   27:return          
			zzf1;
		//   16   28:astore_1        
			list;
		//   17   29:aload_2         
			JVM INSTR monitorexit ;
		//   18   30:monitorexit     
			throw zzf1;
		//   19   31:aload_1         
		//   20   32:athrow          
		}

		private final List mListeners = new ArrayList();

		private zza(zzaax zzaax1)
		{
			super(zzaax1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #14  <Method void zzaaw(zzaax)>
		//    3    5:aload_0         
		//    4    6:new             #16  <Class ArrayList>
		//    5    9:dup             
		//    6   10:invokespecial   #19  <Method void ArrayList()>
		//    7   13:putfield        #21  <Field List mListeners>
			zzaBs.zza("TaskOnStopCallback", ((zzaaw) (this)));
		//    8   16:aload_0         
		//    9   17:getfield        #25  <Field zzaax zzaBs>
		//   10   20:ldc1            #27  <String "TaskOnStopCallback">
		//   11   22:aload_0         
		//   12   23:invokeinterface #32  <Method void zzaax.zza(String, zzaaw)>
		//   13   28:return          
		}
	}


	zzh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Task()>
	//    2    4:aload_0         
	//    3    5:new             #25  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void Object()>
	//    6   12:putfield        #28  <Field Object zzrN>
	//    7   15:aload_0         
	//    8   16:new             #30  <Class zzg>
	//    9   19:dup             
	//   10   20:invokespecial   #31  <Method void zzg()>
	//   11   23:putfield        #33  <Field zzg zzbLH>
	//   12   26:return          
	}

	private void zzSe()
	{
		zzac.zza(zzbLI, "Task is not yet complete");
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean zzbLI>
	//    2    4:ldc1            #39  <String "Task is not yet complete">
	//    3    6:invokestatic    #44  <Method void zzac.zza(boolean, Object)>
	//    4    9:return          
	}

	private void zzSf()
	{
		boolean flag;
		if(!zzbLI)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field boolean zzbLI>
	//*   2    4:ifne            16
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:iload_1         
	//*   6   10:ldc1            #47  <String "Task is already complete">
	//*   7   12:invokestatic    #44  <Method void zzac.zza(boolean, Object)>
	//*   8   15:return          
			flag = false;
	//    9   16:iconst_0        
	//   10   17:istore_1        
		zzac.zza(flag, "Task is already complete");
	//*  11   18:goto            9
	}

	private void zzSg()
	{
label0:
		{
			synchronized(zzrN)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Object zzrN>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(zzbLI)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field boolean zzbLI>
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
		zzbLH.zza(((Task) (this)));
	//   13   19:aload_0         
	//   14   20:getfield        #33  <Field zzg zzbLH>
	//   15   23:aload_0         
	//   16   24:invokevirtual   #51  <Method void zzg.zza(Task)>
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

	public Task addOnCompleteListener(Activity activity, OnCompleteListener oncompletelistener)
	{
		oncompletelistener = ((OnCompleteListener) (new zzc(TaskExecutors.MAIN_THREAD, oncompletelistener)));
	//    0    0:new             #56  <Class zzc>
	//    1    3:dup             
	//    2    4:getstatic       #62  <Field Executor TaskExecutors.MAIN_THREAD>
	//    3    7:aload_2         
	//    4    8:invokespecial   #65  <Method void zzc(Executor, OnCompleteListener)>
	//    5   11:astore_2        
		zzbLH.zza(((zzf) (oncompletelistener)));
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field zzg zzbLH>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #68  <Method void zzg.zza(zzf)>
		zza.zzw(activity).zzb(((zzf) (oncompletelistener)));
	//   10   20:aload_1         
	//   11   21:invokestatic    #72  <Method zzh$zza zzh$zza.zzw(Activity)>
	//   12   24:aload_2         
	//   13   25:invokevirtual   #75  <Method void zzh$zza.zzb(zzf)>
		zzSg();
	//   14   28:aload_0         
	//   15   29:invokespecial   #77  <Method void zzSg()>
		return ((Task) (this));
	//   16   32:aload_0         
	//   17   33:areturn         
	}

	public Task addOnCompleteListener(OnCompleteListener oncompletelistener)
	{
		return addOnCompleteListener(TaskExecutors.MAIN_THREAD, oncompletelistener);
	//    0    0:aload_0         
	//    1    1:getstatic       #62  <Field Executor TaskExecutors.MAIN_THREAD>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #85  <Method Task addOnCompleteListener(Executor, OnCompleteListener)>
	//    4    8:areturn         
	}

	public Task addOnCompleteListener(Executor executor, OnCompleteListener oncompletelistener)
	{
		zzbLH.zza(((zzf) (new zzc(executor, oncompletelistener))));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field zzg zzbLH>
	//    2    4:new             #56  <Class zzc>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #65  <Method void zzc(Executor, OnCompleteListener)>
	//    7   13:invokevirtual   #68  <Method void zzg.zza(zzf)>
		zzSg();
	//    8   16:aload_0         
	//    9   17:invokespecial   #77  <Method void zzSg()>
		return ((Task) (this));
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public Task addOnFailureListener(Activity activity, OnFailureListener onfailurelistener)
	{
		onfailurelistener = ((OnFailureListener) (new zzd(TaskExecutors.MAIN_THREAD, onfailurelistener)));
	//    0    0:new             #91  <Class zzd>
	//    1    3:dup             
	//    2    4:getstatic       #62  <Field Executor TaskExecutors.MAIN_THREAD>
	//    3    7:aload_2         
	//    4    8:invokespecial   #94  <Method void zzd(Executor, OnFailureListener)>
	//    5   11:astore_2        
		zzbLH.zza(((zzf) (onfailurelistener)));
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field zzg zzbLH>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #68  <Method void zzg.zza(zzf)>
		zza.zzw(activity).zzb(((zzf) (onfailurelistener)));
	//   10   20:aload_1         
	//   11   21:invokestatic    #72  <Method zzh$zza zzh$zza.zzw(Activity)>
	//   12   24:aload_2         
	//   13   25:invokevirtual   #75  <Method void zzh$zza.zzb(zzf)>
		zzSg();
	//   14   28:aload_0         
	//   15   29:invokespecial   #77  <Method void zzSg()>
		return ((Task) (this));
	//   16   32:aload_0         
	//   17   33:areturn         
	}

	public Task addOnFailureListener(OnFailureListener onfailurelistener)
	{
		return addOnFailureListener(TaskExecutors.MAIN_THREAD, onfailurelistener);
	//    0    0:aload_0         
	//    1    1:getstatic       #62  <Field Executor TaskExecutors.MAIN_THREAD>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #99  <Method Task addOnFailureListener(Executor, OnFailureListener)>
	//    4    8:areturn         
	}

	public Task addOnFailureListener(Executor executor, OnFailureListener onfailurelistener)
	{
		zzbLH.zza(((zzf) (new zzd(executor, onfailurelistener))));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field zzg zzbLH>
	//    2    4:new             #91  <Class zzd>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #94  <Method void zzd(Executor, OnFailureListener)>
	//    7   13:invokevirtual   #68  <Method void zzg.zza(zzf)>
		zzSg();
	//    8   16:aload_0         
	//    9   17:invokespecial   #77  <Method void zzSg()>
		return ((Task) (this));
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public Task addOnSuccessListener(Activity activity, OnSuccessListener onsuccesslistener)
	{
		onsuccesslistener = ((OnSuccessListener) (new zze(TaskExecutors.MAIN_THREAD, onsuccesslistener)));
	//    0    0:new             #105 <Class zze>
	//    1    3:dup             
	//    2    4:getstatic       #62  <Field Executor TaskExecutors.MAIN_THREAD>
	//    3    7:aload_2         
	//    4    8:invokespecial   #108 <Method void zze(Executor, OnSuccessListener)>
	//    5   11:astore_2        
		zzbLH.zza(((zzf) (onsuccesslistener)));
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field zzg zzbLH>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #68  <Method void zzg.zza(zzf)>
		zza.zzw(activity).zzb(((zzf) (onsuccesslistener)));
	//   10   20:aload_1         
	//   11   21:invokestatic    #72  <Method zzh$zza zzh$zza.zzw(Activity)>
	//   12   24:aload_2         
	//   13   25:invokevirtual   #75  <Method void zzh$zza.zzb(zzf)>
		zzSg();
	//   14   28:aload_0         
	//   15   29:invokespecial   #77  <Method void zzSg()>
		return ((Task) (this));
	//   16   32:aload_0         
	//   17   33:areturn         
	}

	public Task addOnSuccessListener(OnSuccessListener onsuccesslistener)
	{
		return addOnSuccessListener(TaskExecutors.MAIN_THREAD, onsuccesslistener);
	//    0    0:aload_0         
	//    1    1:getstatic       #62  <Field Executor TaskExecutors.MAIN_THREAD>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #113 <Method Task addOnSuccessListener(Executor, OnSuccessListener)>
	//    4    8:areturn         
	}

	public Task addOnSuccessListener(Executor executor, OnSuccessListener onsuccesslistener)
	{
		zzbLH.zza(((zzf) (new zze(executor, onsuccesslistener))));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field zzg zzbLH>
	//    2    4:new             #105 <Class zze>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #108 <Method void zze(Executor, OnSuccessListener)>
	//    7   13:invokevirtual   #68  <Method void zzg.zza(zzf)>
		zzSg();
	//    8   16:aload_0         
	//    9   17:invokespecial   #77  <Method void zzSg()>
		return ((Task) (this));
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public Task continueWith(Continuation continuation)
	{
		return continueWith(TaskExecutors.MAIN_THREAD, continuation);
	//    0    0:aload_0         
	//    1    1:getstatic       #62  <Field Executor TaskExecutors.MAIN_THREAD>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #120 <Method Task continueWith(Executor, Continuation)>
	//    4    8:areturn         
	}

	public Task continueWith(Executor executor, Continuation continuation)
	{
		zzh zzh1 = new zzh();
	//    0    0:new             #2   <Class zzh>
	//    1    3:dup             
	//    2    4:invokespecial   #122 <Method void zzh()>
	//    3    7:astore_3        
		zzbLH.zza(((zzf) (new com.google.android.gms.tasks.zza(executor, continuation, zzh1))));
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field zzg zzbLH>
	//    6   12:new             #124 <Class zza>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:invokespecial   #127 <Method void zza(Executor, Continuation, zzh)>
	//   12   22:invokevirtual   #68  <Method void zzg.zza(zzf)>
		zzSg();
	//   13   25:aload_0         
	//   14   26:invokespecial   #77  <Method void zzSg()>
		return ((Task) (zzh1));
	//   15   29:aload_3         
	//   16   30:areturn         
	}

	public Task continueWithTask(Continuation continuation)
	{
		return continueWithTask(TaskExecutors.MAIN_THREAD, continuation);
	//    0    0:aload_0         
	//    1    1:getstatic       #62  <Field Executor TaskExecutors.MAIN_THREAD>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #131 <Method Task continueWithTask(Executor, Continuation)>
	//    4    8:areturn         
	}

	public Task continueWithTask(Executor executor, Continuation continuation)
	{
		zzh zzh1 = new zzh();
	//    0    0:new             #2   <Class zzh>
	//    1    3:dup             
	//    2    4:invokespecial   #122 <Method void zzh()>
	//    3    7:astore_3        
		zzbLH.zza(((zzf) (new zzb(executor, continuation, zzh1))));
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field zzg zzbLH>
	//    6   12:new             #134 <Class zzb>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:invokespecial   #135 <Method void zzb(Executor, Continuation, zzh)>
	//   12   22:invokevirtual   #68  <Method void zzg.zza(zzf)>
		zzSg();
	//   13   25:aload_0         
	//   14   26:invokespecial   #77  <Method void zzSg()>
		return ((Task) (zzh1));
	//   15   29:aload_3         
	//   16   30:areturn         
	}

	public Exception getException()
	{
		Exception exception;
		synchronized(zzrN)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Object zzrN>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			exception = zzbLK;
	//    5    7:aload_0         
	//    6    8:getfield        #141 <Field Exception zzbLK>
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

	public Object getResult()
	{
		Object obj = zzrN;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Object zzrN>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		zzSe();
	//    5    7:aload_0         
	//    6    8:invokespecial   #145 <Method void zzSe()>
		if(zzbLK != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #141 <Field Exception zzbLK>
	//*   9   15:ifnull          35
			throw new RuntimeExecutionException(((Throwable) (zzbLK)));
	//   10   18:new             #147 <Class RuntimeExecutionException>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:getfield        #141 <Field Exception zzbLK>
	//   14   26:invokespecial   #150 <Method void RuntimeExecutionException(Throwable)>
	//   15   29:athrow          
		break MISSING_BLOCK_LABEL_35;
		Exception exception;
		exception;
	//   16   30:astore_2        
		obj;
	//   17   31:aload_1         
		JVM INSTR monitorexit ;
	//   18   32:monitorexit     
		throw exception;
	//   19   33:aload_2         
	//   20   34:athrow          
		Object obj1 = zzbLJ;
	//   21   35:aload_0         
	//   22   36:getfield        #152 <Field Object zzbLJ>
	//   23   39:astore_2        
		obj;
	//   24   40:aload_1         
		JVM INSTR monitorexit ;
	//   25   41:monitorexit     
		return obj1;
	//   26   42:aload_2         
	//   27   43:areturn         
	}

	public Object getResult(Class class1)
		throws Throwable
	{
		Object obj = zzrN;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Object zzrN>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		zzSe();
	//    5    7:aload_0         
	//    6    8:invokespecial   #145 <Method void zzSe()>
		if(class1.isInstance(((Object) (zzbLK))))
	//*   7   11:aload_1         
	//*   8   12:aload_0         
	//*   9   13:getfield        #141 <Field Exception zzbLK>
	//*  10   16:invokevirtual   #162 <Method boolean Class.isInstance(Object)>
	//*  11   19:ifeq            39
			throw (Throwable)class1.cast(((Object) (zzbLK)));
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #141 <Field Exception zzbLK>
	//   15   27:invokevirtual   #166 <Method Object Class.cast(Object)>
	//   16   30:checkcast       #156 <Class Throwable>
	//   17   33:athrow          
		break MISSING_BLOCK_LABEL_39;
		class1;
	//   18   34:astore_1        
		obj;
	//   19   35:aload_2         
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		throw class1;
	//   21   37:aload_1         
	//   22   38:athrow          
		if(zzbLK != null)
	//*  23   39:aload_0         
	//*  24   40:getfield        #141 <Field Exception zzbLK>
	//*  25   43:ifnull          58
			throw new RuntimeExecutionException(((Throwable) (zzbLK)));
	//   26   46:new             #147 <Class RuntimeExecutionException>
	//   27   49:dup             
	//   28   50:aload_0         
	//   29   51:getfield        #141 <Field Exception zzbLK>
	//   30   54:invokespecial   #150 <Method void RuntimeExecutionException(Throwable)>
	//   31   57:athrow          
		class1 = ((Class) (zzbLJ));
	//   32   58:aload_0         
	//   33   59:getfield        #152 <Field Object zzbLJ>
	//   34   62:astore_1        
		obj;
	//   35   63:aload_2         
		JVM INSTR monitorexit ;
	//   36   64:monitorexit     
		return ((Object) (class1));
	//   37   65:aload_1         
	//   38   66:areturn         
	}

	public boolean isComplete()
	{
		boolean flag;
		synchronized(zzrN)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Object zzrN>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = zzbLI;
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field boolean zzbLI>
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

	public boolean isSuccessful()
	{
		Object obj = zzrN;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Object zzrN>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(zzbLI && zzbLK == null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #37  <Field boolean zzbLI>
	//*   7   11:ifeq            32
	//*   8   14:aload_0         
	//*   9   15:getfield        #141 <Field Exception zzbLK>
	//*  10   18:ifnonnull       32
			flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_1        
		else
	//*  13   23:aload_2         
	//*  14   24:monitorexit     
	//*  15   25:iload_1         
	//*  16   26:ireturn         
	//*  17   27:astore_3        
	//*  18   28:aload_2         
	//*  19   29:monitorexit     
	//*  20   30:aload_3         
	//*  21   31:athrow          
			flag = false;
	//   22   32:iconst_0        
	//   23   33:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  24   34:goto            23
	}

	public void setException(Exception exception)
	{
		zzac.zzb(((Object) (exception)), "Exception must not be null");
	//    0    0:aload_1         
	//    1    1:ldc1            #175 <String "Exception must not be null">
	//    2    3:invokestatic    #178 <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		synchronized(zzrN)
	//*   4    7:aload_0         
	//*   5    8:getfield        #28  <Field Object zzrN>
	//*   6   11:astore_2        
	//*   7   12:aload_2         
	//*   8   13:monitorenter    
		{
			zzSf();
	//    9   14:aload_0         
	//   10   15:invokespecial   #180 <Method void zzSf()>
			zzbLI = true;
	//   11   18:aload_0         
	//   12   19:iconst_1        
	//   13   20:putfield        #37  <Field boolean zzbLI>
			zzbLK = exception;
	//   14   23:aload_0         
	//   15   24:aload_1         
	//   16   25:putfield        #141 <Field Exception zzbLK>
		}
	//   17   28:aload_2         
	//   18   29:monitorexit     
		zzbLH.zza(((Task) (this)));
	//   19   30:aload_0         
	//   20   31:getfield        #33  <Field zzg zzbLH>
	//   21   34:aload_0         
	//   22   35:invokevirtual   #51  <Method void zzg.zza(Task)>
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

	public void setResult(Object obj)
	{
		synchronized(zzrN)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Object zzrN>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzSf();
	//    5    7:aload_0         
	//    6    8:invokespecial   #180 <Method void zzSf()>
			zzbLI = true;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #37  <Field boolean zzbLI>
			zzbLJ = obj;
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:putfield        #152 <Field Object zzbLJ>
		}
	//   13   21:aload_2         
	//   14   22:monitorexit     
		zzbLH.zza(((Task) (this)));
	//   15   23:aload_0         
	//   16   24:getfield        #33  <Field zzg zzbLH>
	//   17   27:aload_0         
	//   18   28:invokevirtual   #51  <Method void zzg.zza(Task)>
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

	public boolean trySetException(Exception exception)
	{
label0:
		{
			zzac.zzb(((Object) (exception)), "Exception must not be null");
	//    0    0:aload_1         
	//    1    1:ldc1            #175 <String "Exception must not be null">
	//    2    3:invokestatic    #178 <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
			synchronized(zzrN)
	//*   4    7:aload_0         
	//*   5    8:getfield        #28  <Field Object zzrN>
	//*   6   11:astore_2        
	//*   7   12:aload_2         
	//*   8   13:monitorenter    
			{
				if(!zzbLI)
					break label0;
	//    9   14:aload_0         
	//   10   15:getfield        #37  <Field boolean zzbLI>
	//   11   18:ifeq            25
			}
	//   12   21:aload_2         
	//   13   22:monitorexit     
			return false;
	//   14   23:iconst_0        
	//   15   24:ireturn         
		}
		zzbLI = true;
	//   16   25:aload_0         
	//   17   26:iconst_1        
	//   18   27:putfield        #37  <Field boolean zzbLI>
		zzbLK = exception;
	//   19   30:aload_0         
	//   20   31:aload_1         
	//   21   32:putfield        #141 <Field Exception zzbLK>
		obj;
	//   22   35:aload_2         
		JVM INSTR monitorexit ;
	//   23   36:monitorexit     
		zzbLH.zza(((Task) (this)));
	//   24   37:aload_0         
	//   25   38:getfield        #33  <Field zzg zzbLH>
	//   26   41:aload_0         
	//   27   42:invokevirtual   #51  <Method void zzg.zza(Task)>
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

	public boolean trySetResult(Object obj)
	{
label0:
		{
			synchronized(zzrN)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Object zzrN>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(!zzbLI)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field boolean zzbLI>
	//    7   11:ifeq            18
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		}
		zzbLI = true;
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:putfield        #37  <Field boolean zzbLI>
		zzbLJ = obj;
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:putfield        #152 <Field Object zzbLJ>
		obj1;
	//   18   28:aload_2         
		JVM INSTR monitorexit ;
	//   19   29:monitorexit     
		zzbLH.zza(((Task) (this)));
	//   20   30:aload_0         
	//   21   31:getfield        #33  <Field zzg zzbLH>
	//   22   34:aload_0         
	//   23   35:invokevirtual   #51  <Method void zzg.zza(Task)>
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

	private final zzg zzbLH = new zzg();
	private boolean zzbLI;
	private Object zzbLJ;
	private Exception zzbLK;
	private final Object zzrN = new Object();
}
