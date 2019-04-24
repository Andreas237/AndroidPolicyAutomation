// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzxh, zzanz, zzxb

final class zzxj
	implements Runnable
{

	zzxj(zzxh zzxh1, zzanz zzanz1)
	{
		zzbuk = zzxh1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzxh zzbuk>
		zzbul = zzanz1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field zzanz zzbul>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		Iterator iterator = zzxh.zze(zzbuk).keySet().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzxh zzbuk>
	//    2    4:invokestatic    #27  <Method Map zzxh.zze(zzxh)>
	//    3    7:invokeinterface #33  <Method Set Map.keySet()>
	//    4   12:invokeinterface #39  <Method Iterator Set.iterator()>
	//    5   17:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    6   18:aload_1         
	//    7   19:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//    8   24:ifeq            67
			zzanz zzanz1 = (zzanz)iterator.next();
	//    9   27:aload_1         
	//   10   28:invokeinterface #49  <Method Object Iterator.next()>
	//   11   33:checkcast       #51  <Class zzanz>
	//   12   36:astore_2        
			if(zzanz1 != zzbul)
	//*  13   37:aload_2         
	//*  14   38:aload_0         
	//*  15   39:getfield        #16  <Field zzanz zzbul>
	//*  16   42:if_acmpeq       18
				((zzxb)zzxh.zze(zzbuk).get(((Object) (zzanz1)))).cancel();
	//   17   45:aload_0         
	//   18   46:getfield        #14  <Field zzxh zzbuk>
	//   19   49:invokestatic    #27  <Method Map zzxh.zze(zzxh)>
	//   20   52:aload_2         
	//   21   53:invokeinterface #55  <Method Object Map.get(Object)>
	//   22   58:checkcast       #57  <Class zzxb>
	//   23   61:invokevirtual   #60  <Method void zzxb.cancel()>
		} while(true);
	//   24   64:goto            18
	//   25   67:return          
	}

	private final zzxh zzbuk;
	private final zzanz zzbul;
}
