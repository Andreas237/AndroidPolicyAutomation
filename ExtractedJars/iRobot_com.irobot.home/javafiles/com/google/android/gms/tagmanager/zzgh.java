// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzp;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbq, zzgj

abstract class zzgh extends zzbq
{

	public transient zzgh(String s, String as[])
	{
		super(s, as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void zzbq(String, String[])>
	//    4    6:return          
	}

	public zzp zzc(Map map)
	{
		zze(map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #15  <Method void zze(Map)>
		return zzgj.zzqq();
	//    3    5:invokestatic    #21  <Method zzp zzgj.zzqq()>
	//    4    8:areturn         
	}

	public abstract void zze(Map map);

	public boolean zznk()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}
}
