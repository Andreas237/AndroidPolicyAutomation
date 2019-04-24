// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcw, zzci, zzcr

static final class zzcw$zzq extends zzcw$zzb
{

	public void zza(zzci zzci1)
	{
		zzaa(((Object) (new zzah$zza(zzcr.zzik(zzci1.statusCode), ((com.google.android.gms.wearable.DataItem) (zzci1.zzbUC))))));
	//    0    0:aload_0         
	//    1    1:new             #25  <Class zzah$zza>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:getfield        #31  <Field int zzci.statusCode>
	//    5    9:invokestatic    #37  <Method com.google.android.gms.common.api.Status zzcr.zzik(int)>
	//    6   12:aload_1         
	//    7   13:getfield        #41  <Field zzao zzci.zzbUC>
	//    8   16:invokespecial   #44  <Method void zzah$zza(com.google.android.gms.common.api.Status, com.google.android.gms.wearable.DataItem)>
	//    9   19:invokevirtual   #48  <Method void zzaa(Object)>
		if(zzci1.statusCode != 0)
	//*  10   22:aload_1         
	//*  11   23:getfield        #31  <Field int zzci.statusCode>
	//*  12   26:ifeq            65
			for(zzci1 = ((zzci) (zzIz.iterator())); ((Iterator) (zzci1)).hasNext(); ((FutureTask)((Iterator) (zzci1)).next()).cancel(true));
	//   13   29:aload_0         
	//   14   30:getfield        #18  <Field List zzIz>
	//   15   33:invokeinterface #54  <Method Iterator List.iterator()>
	//   16   38:astore_1        
	//   17   39:aload_1         
	//   18   40:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//   19   45:ifeq            65
	//   20   48:aload_1         
	//   21   49:invokeinterface #64  <Method Object Iterator.next()>
	//   22   54:checkcast       #66  <Class FutureTask>
	//   23   57:iconst_1        
	//   24   58:invokevirtual   #70  <Method boolean FutureTask.cancel(boolean)>
	//   25   61:pop             
	//*  26   62:goto            39
	//   27   65:return          
	}

	private final List zzIz;

	zzcw$zzq(com.google.android.gms.internal. , List list)
	{
		super();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
		zzIz = list;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field List zzIz>
	//    6   10:return          
	}
}
