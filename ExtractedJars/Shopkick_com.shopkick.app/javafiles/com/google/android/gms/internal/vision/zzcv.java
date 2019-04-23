// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzcw

final class zzcv
{

	zzcv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:bipush          16
	//    6   11:ldc1            #17  <Float 0.75F>
	//    7   13:bipush          10
	//    8   15:invokespecial   #20  <Method void ConcurrentHashMap(int, float, int)>
	//    9   18:putfield        #22  <Field ConcurrentHashMap zzlt>
	//   10   21:aload_0         
	//   11   22:new             #24  <Class ReferenceQueue>
	//   12   25:dup             
	//   13   26:invokespecial   #25  <Method void ReferenceQueue()>
	//   14   29:putfield        #27  <Field ReferenceQueue zzlu>
	//   15   32:return          
	}

	public final List zza(Throwable throwable, boolean flag)
	{
		for(java.lang.ref.Reference reference = zzlu.poll(); reference != null; reference = zzlu.poll())
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field ReferenceQueue zzlu>
	//*   2    4:invokevirtual   #34  <Method java.lang.ref.Reference ReferenceQueue.poll()>
	//*   3    7:astore_3        
	//*   4    8:aload_3         
	//*   5    9:ifnull          32
			zzlt.remove(((Object) (reference)));
	//    6   12:aload_0         
	//    7   13:getfield        #22  <Field ConcurrentHashMap zzlt>
	//    8   16:aload_3         
	//    9   17:invokevirtual   #38  <Method Object ConcurrentHashMap.remove(Object)>
	//   10   20:pop             

	//   11   21:aload_0         
	//   12   22:getfield        #27  <Field ReferenceQueue zzlu>
	//   13   25:invokevirtual   #34  <Method java.lang.ref.Reference ReferenceQueue.poll()>
	//   14   28:astore_3        
	//*  15   29:goto            8
		throwable = ((Throwable) (new zzcw(throwable, ((ReferenceQueue) (null)))));
	//   16   32:new             #40  <Class zzcw>
	//   17   35:dup             
	//   18   36:aload_1         
	//   19   37:aconst_null     
	//   20   38:invokespecial   #43  <Method void zzcw(Throwable, ReferenceQueue)>
	//   21   41:astore_1        
		return (List)zzlt.get(((Object) (throwable)));
	//   22   42:aload_0         
	//   23   43:getfield        #22  <Field ConcurrentHashMap zzlt>
	//   24   46:aload_1         
	//   25   47:invokevirtual   #46  <Method Object ConcurrentHashMap.get(Object)>
	//   26   50:checkcast       #48  <Class List>
	//   27   53:areturn         
	}

	private final ConcurrentHashMap zzlt = new ConcurrentHashMap(16, 0.75F, 10);
	private final ReferenceQueue zzlu = new ReferenceQueue();
}
