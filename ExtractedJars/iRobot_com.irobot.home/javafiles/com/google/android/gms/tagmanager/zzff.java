// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzrm;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzfg, zzeq, zzfb

final class zzff
	implements zzfg
{

	zzff(zzfb zzfb)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final void zza(zzrm zzrm1, Set set, Set set1, zzeq zzeq1)
	{
		set.addAll(((java.util.Collection) (zzrm1.zzsm())));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #20  <Method java.util.List zzrm.zzsm()>
	//    3    5:invokeinterface #26  <Method boolean Set.addAll(java.util.Collection)>
	//    4   10:pop             
		set1.addAll(((java.util.Collection) (zzrm1.zzsn())));
	//    5   11:aload_3         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #29  <Method java.util.List zzrm.zzsn()>
	//    8   16:invokeinterface #26  <Method boolean Set.addAll(java.util.Collection)>
	//    9   21:pop             
		zzeq1.zzpe();
	//   10   22:aload           4
	//   11   24:invokeinterface #35  <Method zzeo zzeq.zzpe()>
	//   12   29:pop             
		zzeq1.zzpf();
	//   13   30:aload           4
	//   14   32:invokeinterface #38  <Method zzeo zzeq.zzpf()>
	//   15   37:pop             
	//   16   38:return          
	}
}
