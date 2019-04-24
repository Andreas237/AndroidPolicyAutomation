// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//			zzaaj, zzaan, zzaal

private class zzaaj$zzc extends zzaaj$zzf
{

	public void zzvA()
	{
		zzaaj.zzd(zzaAa).zzazd.zzaAs = zzaaj.zzg(zzaAa);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzaaj zzaAa>
	//    2    4:invokestatic    #31  <Method zzaan zzaaj.zzd(zzaaj)>
	//    3    7:getfield        #37  <Field zzaal zzaan.zzazd>
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field zzaaj zzaAa>
	//    6   14:invokestatic    #41  <Method java.util.Set zzaaj.zzg(zzaaj)>
	//    7   17:putfield        #47  <Field java.util.Set zzaal.zzaAs>
		for(Iterator iterator = zzaAg.iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.Api.zze)iterator.next()).zza(zzaaj.zzh(zzaAa), zzaaj.zzd(zzaAa).zzazd.zzaAs));
	//    8   20:aload_0         
	//    9   21:getfield        #21  <Field ArrayList zzaAg>
	//   10   24:invokevirtual   #53  <Method Iterator ArrayList.iterator()>
	//   11   27:astore_1        
	//   12   28:aload_1         
	//   13   29:invokeinterface #59  <Method boolean Iterator.hasNext()>
	//   14   34:ifeq            74
	//   15   37:aload_1         
	//   16   38:invokeinterface #63  <Method Object Iterator.next()>
	//   17   43:checkcast       #65  <Class com.google.android.gms.common.api.Api$zze>
	//   18   46:aload_0         
	//   19   47:getfield        #16  <Field zzaaj zzaAa>
	//   20   50:invokestatic    #69  <Method com.google.android.gms.common.internal.zzr zzaaj.zzh(zzaaj)>
	//   21   53:aload_0         
	//   22   54:getfield        #16  <Field zzaaj zzaAa>
	//   23   57:invokestatic    #31  <Method zzaan zzaaj.zzd(zzaaj)>
	//   24   60:getfield        #37  <Field zzaal zzaan.zzazd>
	//   25   63:getfield        #47  <Field java.util.Set zzaal.zzaAs>
	//   26   66:invokeinterface #73  <Method void com.google.android.gms.common.api.Api$zze.zza(com.google.android.gms.common.internal.zzr, java.util.Set)>
	//*  27   71:goto            28
	//   28   74:return          
	}

	final zzaaj zzaAa;
	private final ArrayList zzaAg;

	public zzaaj$zzc(zzaaj zzaaj1, ArrayList arraylist)
	{
		zzaAa = zzaaj1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field zzaaj zzaAa>
		super(zzaaj1, ((zzaaj._cls1) (null)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokespecial   #19  <Method void zzaaj$zzf(zzaaj, zzaaj$1)>
		zzaAg = arraylist;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #21  <Field ArrayList zzaAg>
	//   10   16:return          
	}
}
