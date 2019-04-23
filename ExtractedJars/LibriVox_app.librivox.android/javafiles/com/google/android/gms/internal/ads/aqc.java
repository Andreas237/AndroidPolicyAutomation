// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aqd

final class aqc
{

	aqc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:bipush          16
	//    6   11:ldc1            #15  <Float 0.75F>
	//    7   13:bipush          10
	//    8   15:invokespecial   #18  <Method void ConcurrentHashMap(int, float, int)>
	//    9   18:putfield        #20  <Field ConcurrentHashMap a>
	//   10   21:aload_0         
	//   11   22:new             #22  <Class ReferenceQueue>
	//   12   25:dup             
	//   13   26:invokespecial   #23  <Method void ReferenceQueue()>
	//   14   29:putfield        #25  <Field ReferenceQueue b>
	//   15   32:return          
	}

	public final List a(Throwable throwable, boolean flag)
	{
		for(java.lang.ref.Reference reference = b.poll(); reference != null; reference = b.poll())
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field ReferenceQueue b>
	//*   2    4:invokevirtual   #31  <Method java.lang.ref.Reference ReferenceQueue.poll()>
	//*   3    7:astore_3        
	//*   4    8:aload_3         
	//*   5    9:ifnull          32
			a.remove(((Object) (reference)));
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field ConcurrentHashMap a>
	//    8   16:aload_3         
	//    9   17:invokevirtual   #35  <Method Object ConcurrentHashMap.remove(Object)>
	//   10   20:pop             

	//   11   21:aload_0         
	//   12   22:getfield        #25  <Field ReferenceQueue b>
	//   13   25:invokevirtual   #31  <Method java.lang.ref.Reference ReferenceQueue.poll()>
	//   14   28:astore_3        
	//*  15   29:goto            8
		throwable = ((Throwable) (new aqd(throwable, ((ReferenceQueue) (null)))));
	//   16   32:new             #37  <Class aqd>
	//   17   35:dup             
	//   18   36:aload_1         
	//   19   37:aconst_null     
	//   20   38:invokespecial   #40  <Method void aqd(Throwable, ReferenceQueue)>
	//   21   41:astore_1        
		return (List)a.get(((Object) (throwable)));
	//   22   42:aload_0         
	//   23   43:getfield        #20  <Field ConcurrentHashMap a>
	//   24   46:aload_1         
	//   25   47:invokevirtual   #43  <Method Object ConcurrentHashMap.get(Object)>
	//   26   50:checkcast       #45  <Class List>
	//   27   53:areturn         
	}

	private final ConcurrentHashMap a = new ConcurrentHashMap(16, 0.75F, 10);
	private final ReferenceQueue b = new ReferenceQueue();
}
