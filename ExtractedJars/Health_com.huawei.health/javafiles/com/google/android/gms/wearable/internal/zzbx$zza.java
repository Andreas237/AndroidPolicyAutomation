// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.Map;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzbx, zzcy

static class zzbx$zza extends zzcw$zzb
{

	public void zza(Status status)
	{
		Map map;
		Object obj;
		map = (Map)zzbUE.get();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field WeakReference zzbUE>
	//    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
	//    3    7:checkcast       #37  <Class Map>
	//    4   10:astore_2        
		obj = zzbUF.get();
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field WeakReference zzbUF>
	//    7   15:invokevirtual   #35  <Method Object WeakReference.get()>
	//    8   18:astore_3        
		if(status.getStatus().isSuccess() || map == null || obj == null)
			break MISSING_BLOCK_LABEL_68;
	//    9   19:aload_1         
	//   10   20:invokevirtual   #43  <Method Status Status.getStatus()>
	//   11   23:invokevirtual   #47  <Method boolean Status.isSuccess()>
	//   12   26:ifne            68
	//   13   29:aload_2         
	//   14   30:ifnull          68
	//   15   33:aload_3         
	//   16   34:ifnull          68
		map;
	//   17   37:aload_2         
		JVM INSTR monitorenter ;
	//   18   38:monitorenter    
		obj = ((Object) ((zzcy)map.remove(obj)));
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:invokeinterface #51  <Method Object Map.remove(Object)>
	//   22   46:checkcast       #53  <Class zzcy>
	//   23   49:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_58;
	//   24   50:aload_3         
	//   25   51:ifnull          58
		((zzcy) (obj)).clear();
	//   26   54:aload_3         
	//   27   55:invokevirtual   #57  <Method void zzcy.clear()>
		map;
	//   28   58:aload_2         
		JVM INSTR monitorexit ;
	//   29   59:monitorexit     
		break MISSING_BLOCK_LABEL_68;
	//   30   60:goto            68
		status;
	//   31   63:astore_1        
	//*  32   64:aload_2         
		throw status;
	//   33   65:monitorexit     
	//   34   66:aload_1         
	//   35   67:athrow          
		zzaa(((Object) (status)));
	//   36   68:aload_0         
	//   37   69:aload_1         
	//   38   70:invokevirtual   #60  <Method void zzaa(Object)>
		return;
	//   39   73:return          
	}

	private WeakReference zzbUE;
	private WeakReference zzbUF;

	zzbx$zza(Map map, Object obj, com.google.android.gms.internal. )
	{
		super();
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokespecial   #18  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
		zzbUE = new WeakReference(((Object) (map)));
	//    3    5:aload_0         
	//    4    6:new             #20  <Class WeakReference>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokespecial   #23  <Method void WeakReference(Object)>
	//    8   14:putfield        #25  <Field WeakReference zzbUE>
		zzbUF = new WeakReference(obj);
	//    9   17:aload_0         
	//   10   18:new             #20  <Class WeakReference>
	//   11   21:dup             
	//   12   22:aload_2         
	//   13   23:invokespecial   #23  <Method void WeakReference(Object)>
	//   14   26:putfield        #27  <Field WeakReference zzbUF>
	//   15   29:return          
	}
}
