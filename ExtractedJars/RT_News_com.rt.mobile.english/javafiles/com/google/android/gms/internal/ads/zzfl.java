// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzff, zzet

final class zzfl
	implements zzv
{

	zzfl(zzff zzff1)
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
		if(zzff.zza(zzaga).zzc(map))
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field zzff zzaga>
	//*   2    4:invokestatic    #24  <Method zzet zzff.zza(zzff)>
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #30  <Method boolean zzet.zzc(Map)>
	//*   5   11:ifeq            29
			zzff.zza(zzaga).zza(((zzfo) (zzaga)), map);
	//    6   14:aload_0         
	//    7   15:getfield        #13  <Field zzff zzaga>
	//    8   18:invokestatic    #24  <Method zzet zzff.zza(zzff)>
	//    9   21:aload_0         
	//   10   22:getfield        #13  <Field zzff zzaga>
	//   11   25:aload_2         
	//   12   26:invokevirtual   #33  <Method void zzet.zza(zzfo, Map)>
	//   13   29:return          
	}

	private final zzff zzaga;
}
