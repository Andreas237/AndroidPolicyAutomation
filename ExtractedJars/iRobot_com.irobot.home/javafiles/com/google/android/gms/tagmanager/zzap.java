// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzaq, DataLayer

final class zzap
	implements zzaq
{

	zzap(DataLayer datalayer)
	{
		zzbbj = datalayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field DataLayer zzbbj>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void zze(List list)
	{
		DataLayer.zza zza;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); DataLayer.zza(zzbbj, DataLayer.zzk(zza.mKey, zza.mValue)))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #24  <Method Iterator List.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #30  <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            47
			zza = (DataLayer.zza)((Iterator) (list)).next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #34  <Method Object Iterator.next()>
	//    8   22:checkcast       #36  <Class DataLayer$zza>
	//    9   25:astore_2        

	//   10   26:aload_0         
	//   11   27:getfield        #12  <Field DataLayer zzbbj>
	//   12   30:aload_2         
	//   13   31:getfield        #40  <Field String DataLayer$zza.mKey>
	//   14   34:aload_2         
	//   15   35:getfield        #44  <Field Object DataLayer$zza.mValue>
	//   16   38:invokestatic    #50  <Method java.util.Map DataLayer.zzk(String, Object)>
	//   17   41:invokestatic    #54  <Method void DataLayer.zza(DataLayer, java.util.Map)>
	//*  18   44:goto            7
		DataLayer.zza(zzbbj).countDown();
	//   19   47:aload_0         
	//   20   48:getfield        #12  <Field DataLayer zzbbj>
	//   21   51:invokestatic    #57  <Method CountDownLatch DataLayer.zza(DataLayer)>
	//   22   54:invokevirtual   #62  <Method void CountDownLatch.countDown()>
	//   23   57:return          
	}

	private final DataLayer zzbbj;
}
