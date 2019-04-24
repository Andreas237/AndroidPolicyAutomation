// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.internal.zzaaw;
import com.google.android.gms.internal.zzaax;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package com.google.android.gms.tasks:
//			zzh, zzf

private static class zzh$zza extends zzaaw
{

	public static zzh$zza zzw(Activity activity)
	{
		zzaax zzaax1 = zzs(activity);
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method zzaax zzs(Activity)>
	//    2    4:astore_2        
		zzh$zza zzh$zza1 = (zzh$zza)zzaax1.zza("TaskOnStopCallback", com/google/android/gms/tasks/zzh$zza);
	//    3    5:aload_2         
	//    4    6:ldc1            #27  <String "TaskOnStopCallback">
	//    5    8:ldc1            #2   <Class zzh$zza>
	//    6   10:invokeinterface #42  <Method zzaaw zzaax.zza(String, Class)>
	//    7   15:checkcast       #2   <Class zzh$zza>
	//    8   18:astore_1        
		activity = ((Activity) (zzh$zza1));
	//    9   19:aload_1         
	//   10   20:astore_0        
		if(zzh$zza1 == null)
	//*  11   21:aload_1         
	//*  12   22:ifnonnull       34
			activity = ((Activity) (new zzh$zza(zzaax1)));
	//   13   25:new             #2   <Class zzh$zza>
	//   14   28:dup             
	//   15   29:aload_2         
	//   16   30:invokespecial   #43  <Method void zzh$zza(zzaax)>
	//   17   33:astore_0        
		return ((zzh$zza) (activity));
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

	private zzh$zza(zzaax zzaax1)
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
