// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzab;
import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzwb, zzff, zzet

final class zzfn
	implements zzv
{

	zzfn(zzff zzff1)
	{
		zzaga = zzff1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzff zzaga>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	public final void zza(Object obj, Map map)
	{
		obj = ((Object) ((zzwb)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzwb>
	//    2    4:astore_1        
		if(zzff.zza(zzaga).zzc(map))
	//*   3    5:aload_0         
	//*   4    6:getfield        #13  <Field zzff zzaga>
	//*   5    9:invokestatic    #26  <Method zzet zzff.zza(zzff)>
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #32  <Method boolean zzet.zzc(Map)>
	//*   8   16:ifeq            31
			zzff.zzb(zzaga).zza(obj, map);
	//    9   19:aload_0         
	//   10   20:getfield        #13  <Field zzff zzaga>
	//   11   23:invokestatic    #36  <Method zzab zzff.zzb(zzff)>
	//   12   26:aload_1         
	//   13   27:aload_2         
	//   14   28:invokevirtual   #40  <Method void zzab.zza(Object, Map)>
	//   15   31:return          
	}

	private final zzff zzaga;
}
