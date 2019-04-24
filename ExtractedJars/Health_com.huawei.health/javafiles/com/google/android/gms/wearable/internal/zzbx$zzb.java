// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.Map;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzbx, zzcy

static class zzbx$zzb extends zzcw$zzb
{

	public void zza(Status status)
	{
		Map map;
		Object obj;
		map = (Map)zzbUE.get();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field WeakReference zzbUE>
	//    2    4:invokevirtual   #36  <Method Object WeakReference.get()>
	//    3    7:checkcast       #38  <Class Map>
	//    4   10:astore_2        
		obj = zzbUF.get();
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field WeakReference zzbUF>
	//    7   15:invokevirtual   #36  <Method Object WeakReference.get()>
	//    8   18:astore_3        
		if(status.getStatus().getStatusCode() != 4002 || map == null || obj == null)
			break MISSING_BLOCK_LABEL_71;
	//    9   19:aload_1         
	//   10   20:invokevirtual   #44  <Method Status Status.getStatus()>
	//   11   23:invokevirtual   #48  <Method int Status.getStatusCode()>
	//   12   26:sipush          4002
	//   13   29:icmpne          71
	//   14   32:aload_2         
	//   15   33:ifnull          71
	//   16   36:aload_3         
	//   17   37:ifnull          71
		map;
	//   18   40:aload_2         
		JVM INSTR monitorenter ;
	//   19   41:monitorenter    
		obj = ((Object) ((zzcy)map.remove(obj)));
	//   20   42:aload_2         
	//   21   43:aload_3         
	//   22   44:invokeinterface #52  <Method Object Map.remove(Object)>
	//   23   49:checkcast       #54  <Class zzcy>
	//   24   52:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_61;
	//   25   53:aload_3         
	//   26   54:ifnull          61
		((zzcy) (obj)).clear();
	//   27   57:aload_3         
	//   28   58:invokevirtual   #58  <Method void zzcy.clear()>
		map;
	//   29   61:aload_2         
		JVM INSTR monitorexit ;
	//   30   62:monitorexit     
		break MISSING_BLOCK_LABEL_71;
	//   31   63:goto            71
		status;
	//   32   66:astore_1        
	//*  33   67:aload_2         
		throw status;
	//   34   68:monitorexit     
	//   35   69:aload_1         
	//   36   70:athrow          
		zzaa(((Object) (status)));
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:invokevirtual   #61  <Method void zzaa(Object)>
		return;
	//   40   76:return          
	}

	private WeakReference zzbUE;
	private WeakReference zzbUF;

	zzbx$zzb(Map map, Object obj, com.google.android.gms.internal. )
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
