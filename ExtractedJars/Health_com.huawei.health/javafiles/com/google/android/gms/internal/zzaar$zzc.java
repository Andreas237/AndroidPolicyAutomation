// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//			zzaar, zzaav, zzaat

class zzaar$zzc extends zzaar$zzf
{

	public void zzwe()
	{
		zzaar.zzd(zzaBA).zzaAw.zzaBR = zzaar.zzg(zzaBA);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzaar zzaBA>
	//    2    4:invokestatic    #31  <Method zzaav zzaar.zzd(zzaar)>
	//    3    7:getfield        #37  <Field zzaat zzaav.zzaAw>
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field zzaar zzaBA>
	//    6   14:invokestatic    #41  <Method java.util.Set zzaar.zzg(zzaar)>
	//    7   17:putfield        #47  <Field java.util.Set zzaat.zzaBR>
		for(Iterator iterator = zzaBG.iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.Api.zze)iterator.next()).zza(zzaar.zzh(zzaBA), zzaar.zzd(zzaBA).zzaAw.zzaBR));
	//    8   20:aload_0         
	//    9   21:getfield        #21  <Field ArrayList zzaBG>
	//   10   24:invokevirtual   #53  <Method Iterator ArrayList.iterator()>
	//   11   27:astore_1        
	//   12   28:aload_1         
	//   13   29:invokeinterface #59  <Method boolean Iterator.hasNext()>
	//   14   34:ifeq            74
	//   15   37:aload_1         
	//   16   38:invokeinterface #63  <Method Object Iterator.next()>
	//   17   43:checkcast       #65  <Class com.google.android.gms.common.api.Api$zze>
	//   18   46:aload_0         
	//   19   47:getfield        #16  <Field zzaar zzaBA>
	//   20   50:invokestatic    #69  <Method com.google.android.gms.common.internal.zzr zzaar.zzh(zzaar)>
	//   21   53:aload_0         
	//   22   54:getfield        #16  <Field zzaar zzaBA>
	//   23   57:invokestatic    #31  <Method zzaav zzaar.zzd(zzaar)>
	//   24   60:getfield        #37  <Field zzaat zzaav.zzaAw>
	//   25   63:getfield        #47  <Field java.util.Set zzaat.zzaBR>
	//   26   66:invokeinterface #73  <Method void com.google.android.gms.common.api.Api$zze.zza(com.google.android.gms.common.internal.zzr, java.util.Set)>
	//*  27   71:goto            28
	//   28   74:return          
	}

	final zzaar zzaBA;
	private final ArrayList zzaBG;

	public zzaar$zzc(zzaar zzaar1, ArrayList arraylist)
	{
		zzaBA = zzaar1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field zzaar zzaBA>
		super(zzaar1, ((zzaar._cls1) (null)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokespecial   #19  <Method void zzaar$zzf(zzaar, zzaar$1)>
		zzaBG = arraylist;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #21  <Field ArrayList zzaBG>
	//   10   16:return          
	}
}
