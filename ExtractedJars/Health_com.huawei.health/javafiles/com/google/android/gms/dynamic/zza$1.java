// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.dynamic:
//			zze, zza, LifecycleDelegate

class zza$1
	implements zze
{

	public void zza(LifecycleDelegate lifecycledelegate)
	{
		com.google.android.gms.dynamic.zza.zza(zzaRE, lifecycledelegate);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zza zzaRE>
	//    2    4:aload_1         
	//    3    5:invokestatic    #24  <Method LifecycleDelegate zza.zza(zza, LifecycleDelegate)>
	//    4    8:pop             
		for(lifecycledelegate = ((LifecycleDelegate) (com.google.android.gms.dynamic.zza.zza(zzaRE).iterator())); ((Iterator) (lifecycledelegate)).hasNext(); ((a)((Iterator) (lifecycledelegate)).next()).zzb(com.google.android.gms.dynamic.zza.zzb(zzaRE)));
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field zza zzaRE>
	//    7   13:invokestatic    #27  <Method LinkedList zza.zza(zza)>
	//    8   16:invokevirtual   #33  <Method Iterator LinkedList.iterator()>
	//    9   19:astore_1        
	//   10   20:aload_1         
	//   11   21:invokeinterface #39  <Method boolean Iterator.hasNext()>
	//   12   26:ifeq            53
	//   13   29:aload_1         
	//   14   30:invokeinterface #43  <Method Object Iterator.next()>
	//   15   35:checkcast       #45  <Class zza$zza>
	//   16   38:aload_0         
	//   17   39:getfield        #15  <Field zza zzaRE>
	//   18   42:invokestatic    #49  <Method LifecycleDelegate zza.zzb(zza)>
	//   19   45:invokeinterface #51  <Method void zza$zza.zzb(LifecycleDelegate)>
	//*  20   50:goto            20
		com.google.android.gms.dynamic.zza.zza(zzaRE).clear();
	//   21   53:aload_0         
	//   22   54:getfield        #15  <Field zza zzaRE>
	//   23   57:invokestatic    #27  <Method LinkedList zza.zza(zza)>
	//   24   60:invokevirtual   #54  <Method void LinkedList.clear()>
		com.google.android.gms.dynamic.zza.zza(zzaRE, ((android.os.Bundle) (null)));
	//   25   63:aload_0         
	//   26   64:getfield        #15  <Field zza zzaRE>
	//   27   67:aconst_null     
	//   28   68:invokestatic    #57  <Method android.os.Bundle zza.zza(zza, android.os.Bundle)>
	//   29   71:pop             
	//   30   72:return          
	}

	final zza zzaRE;

	zza$1(zza zza1)
	{
		zzaRE = zza1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zza zzaRE>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
