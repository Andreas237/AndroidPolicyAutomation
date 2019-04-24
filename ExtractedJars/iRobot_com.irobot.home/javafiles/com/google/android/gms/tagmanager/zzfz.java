// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzp;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzef, zzgj

abstract class zzfz extends zzef
{

	public zzfz(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void zzef(String)>
	//    3    5:return          
	}

	protected final boolean zza(zzp zzp, zzp zzp1, Map map)
	{
		zzp = ((zzp) (zzgj.zzc(zzp)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #17  <Method String zzgj.zzc(zzp)>
	//    2    4:astore_1        
		zzp1 = ((zzp) (zzgj.zzc(zzp1)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #17  <Method String zzgj.zzc(zzp)>
	//    5    9:astore_2        
		if(zzp != zzgj.zzqp() && zzp1 != zzgj.zzqp())
	//*   6   10:aload_1         
	//*   7   11:invokestatic    #21  <Method String zzgj.zzqp()>
	//*   8   14:if_acmpeq       35
	//*   9   17:aload_2         
	//*  10   18:invokestatic    #21  <Method String zzgj.zzqp()>
	//*  11   21:if_acmpne       27
	//*  12   24:goto            35
			return zza(((String) (zzp)), ((String) (zzp1)), map);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:invokevirtual   #24  <Method boolean zza(String, String, Map)>
	//   18   34:ireturn         
		else
			return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
	}

	protected abstract boolean zza(String s, String s1, Map map);
}
