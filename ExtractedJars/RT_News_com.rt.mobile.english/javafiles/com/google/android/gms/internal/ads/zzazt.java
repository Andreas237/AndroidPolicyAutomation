// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzazu

final class zzazt
{

	zzazt()
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
	//    9   18:putfield        #22  <Field ConcurrentHashMap zzdoy>
	//   10   21:aload_0         
	//   11   22:new             #24  <Class ReferenceQueue>
	//   12   25:dup             
	//   13   26:invokespecial   #25  <Method void ReferenceQueue()>
	//   14   29:putfield        #27  <Field ReferenceQueue zzdoz>
	//   15   32:return          
	}

	public final List zza(Throwable throwable, boolean flag)
	{
		do
		{
			java.lang.ref.Reference reference = zzdoz.poll();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ReferenceQueue zzdoz>
	//    2    4:invokevirtual   #34  <Method java.lang.ref.Reference ReferenceQueue.poll()>
	//    3    7:astore_3        
			if(reference != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          24
			{
				zzdoy.remove(((Object) (reference)));
	//    6   12:aload_0         
	//    7   13:getfield        #22  <Field ConcurrentHashMap zzdoy>
	//    8   16:aload_3         
	//    9   17:invokevirtual   #38  <Method Object ConcurrentHashMap.remove(Object)>
	//   10   20:pop             
			} else
	//*  11   21:goto            0
			{
				throwable = ((Throwable) (new zzazu(throwable, ((ReferenceQueue) (null)))));
	//   12   24:new             #40  <Class zzazu>
	//   13   27:dup             
	//   14   28:aload_1         
	//   15   29:aconst_null     
	//   16   30:invokespecial   #43  <Method void zzazu(Throwable, ReferenceQueue)>
	//   17   33:astore_1        
				return (List)zzdoy.get(((Object) (throwable)));
	//   18   34:aload_0         
	//   19   35:getfield        #22  <Field ConcurrentHashMap zzdoy>
	//   20   38:aload_1         
	//   21   39:invokevirtual   #46  <Method Object ConcurrentHashMap.get(Object)>
	//   22   42:checkcast       #48  <Class List>
	//   23   45:areturn         
			}
		} while(true);
	}

	private final ConcurrentHashMap zzdoy = new ConcurrentHashMap(16, 0.75F, 10);
	private final ReferenceQueue zzdoz = new ReferenceQueue();
}
