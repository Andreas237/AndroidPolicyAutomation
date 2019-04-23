// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.app.Activity;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			LifecycleCallback, zaa, LifecycleFragment

static class zaa$zaa extends LifecycleCallback
{

	private static zaa$zaa zaa(Activity activity)
	{
		activity;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zaa$zaa zaa$zaa2;
		LifecycleFragment lifecyclefragment;
		lifecyclefragment = getFragment(activity);
	//    2    2:aload_0         
	//    3    3:invokestatic    #42  <Method LifecycleFragment getFragment(Activity)>
	//    4    6:astore_3        
		zaa$zaa2 = (zaa$zaa)lifecyclefragment.getCallbackOrNull("LifecycleObserverOnStop", com/google/android/gms/common/api/internal/zaa$zaa);
	//    5    7:aload_3         
	//    6    8:ldc1            #30  <String "LifecycleObserverOnStop">
	//    7   10:ldc1            #2   <Class zaa$zaa>
	//    8   12:invokeinterface #46  <Method LifecycleCallback LifecycleFragment.getCallbackOrNull(String, Class)>
	//    9   17:checkcast       #2   <Class zaa$zaa>
	//   10   20:astore_2        
		zaa$zaa zaa$zaa1;
		zaa$zaa1 = zaa$zaa2;
	//   11   21:aload_2         
	//   12   22:astore_1        
		if(zaa$zaa2 != null)
			break MISSING_BLOCK_LABEL_36;
	//   13   23:aload_2         
	//   14   24:ifnonnull       36
		zaa$zaa1 = new zaa$zaa(lifecyclefragment);
	//   15   27:new             #2   <Class zaa$zaa>
	//   16   30:dup             
	//   17   31:aload_3         
	//   18   32:invokespecial   #47  <Method void zaa$zaa(LifecycleFragment)>
	//   19   35:astore_1        
		activity;
	//   20   36:aload_0         
		JVM INSTR monitorexit ;
	//   21   37:monitorexit     
		return zaa$zaa1;
	//   22   38:aload_1         
	//   23   39:areturn         
		Exception exception;
		exception;
	//   24   40:astore_1        
		activity;
	//   25   41:aload_0         
		JVM INSTR monitorexit ;
	//   26   42:monitorexit     
		throw exception;
	//   27   43:aload_1         
	//   28   44:athrow          
	}

	static void zaa(zaa$zaa zaa$zaa1, Runnable runnable)
	{
		zaa$zaa1.zaa(runnable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #51  <Method void zaa(Runnable)>
	//    3    5:return          
	}

	private final void zaa(Runnable runnable)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zacl.add(((Object) (runnable)));
	//    2    2:aload_0         
	//    3    3:getfield        #24  <Field List zacl>
	//    4    6:aload_1         
	//    5    7:invokeinterface #57  <Method boolean List.add(Object)>
	//    6   12:pop             
		this;
	//    7   13:aload_0         
		JVM INSTR monitorexit ;
	//    8   14:monitorexit     
		return;
	//    9   15:return          
		runnable;
	//   10   16:astore_1        
	//*  11   17:aload_0         
		throw runnable;
	//   12   18:monitorexit     
	//   13   19:aload_1         
	//   14   20:athrow          
	}

	static zaa$zaa zab(Activity activity)
	{
		return zaa(activity);
	//    0    0:aload_0         
	//    1    1:invokestatic    #60  <Method zaa$zaa zaa(Activity)>
	//    2    4:areturn         
	}

	public void onStop()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj;
		obj = ((Object) (zacl));
	//    2    2:aload_0         
	//    3    3:getfield        #24  <Field List zacl>
	//    4    6:astore_1        
		zacl = ((List) (new ArrayList()));
	//    5    7:aload_0         
	//    6    8:new             #19  <Class ArrayList>
	//    7   11:dup             
	//    8   12:invokespecial   #22  <Method void ArrayList()>
	//    9   15:putfield        #24  <Field List zacl>
		this;
	//   10   18:aload_0         
		JVM INSTR monitorexit ;
	//   11   19:monitorexit     
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((Runnable)((Iterator) (obj)).next()).run());
	//   12   20:aload_1         
	//   13   21:invokeinterface #66  <Method Iterator List.iterator()>
	//   14   26:astore_1        
	//   15   27:aload_1         
	//   16   28:invokeinterface #72  <Method boolean Iterator.hasNext()>
	//   17   33:ifeq            53
	//   18   36:aload_1         
	//   19   37:invokeinterface #76  <Method Object Iterator.next()>
	//   20   42:checkcast       #78  <Class Runnable>
	//   21   45:invokeinterface #81  <Method void Runnable.run()>
	//*  22   50:goto            27
		return;
	//   23   53:return          
		Exception exception;
		exception;
	//   24   54:astore_1        
		this;
	//   25   55:aload_0         
		JVM INSTR monitorexit ;
	//   26   56:monitorexit     
		throw exception;
	//   27   57:aload_1         
	//   28   58:athrow          
	}

	private List zacl;

	private zaa$zaa(LifecycleFragment lifecyclefragment)
	{
		super(lifecyclefragment);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void LifecycleCallback(LifecycleFragment)>
		zacl = ((List) (new ArrayList()));
	//    3    5:aload_0         
	//    4    6:new             #19  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #22  <Method void ArrayList()>
	//    7   13:putfield        #24  <Field List zacl>
		mLifecycleFragment.addCallback("LifecycleObserverOnStop", ((LifecycleCallback) (this)));
	//    8   16:aload_0         
	//    9   17:getfield        #28  <Field LifecycleFragment mLifecycleFragment>
	//   10   20:ldc1            #30  <String "LifecycleObserverOnStop">
	//   11   22:aload_0         
	//   12   23:invokeinterface #36  <Method void LifecycleFragment.addCallback(String, LifecycleCallback)>
	//   13   28:return          
	}
}
