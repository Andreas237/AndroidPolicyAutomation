// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzp;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbq, zzgj

final class zzge extends zzbq
{

	public zzge()
	{
		super(ID, new String[0]);
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field String ID>
	//    2    4:iconst_0        
	//    3    5:anewarray       String[]
	//    4    8:invokespecial   #27  <Method void zzbq(String, String[])>
	//    5   11:return          
	}

	public final zzp zzc(Map map)
	{
		return zzgj.zzj(((Object) (Long.valueOf(System.currentTimeMillis()))));
	//    0    0:invokestatic    #35  <Method long System.currentTimeMillis()>
	//    1    3:invokestatic    #41  <Method Long Long.valueOf(long)>
	//    2    6:invokestatic    #47  <Method zzp zzgj.zzj(Object)>
	//    3    9:areturn         
	}

	public final boolean zznk()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private static final String ID;

	static 
	{
		ID = zza.zzaf.toString();
	//    0    0:getstatic       #14  <Field zza zza.zzaf>
	//    1    3:invokevirtual   #18  <Method String zza.toString()>
	//    2    6:putstatic       #20  <Field String ID>
	//*   3    9:return          
	}
}
