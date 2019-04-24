// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzp;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbq, zzfb, zzgj

final class zzbp extends zzbq
{

	public zzbp(zzfb zzfb1)
	{
		super(ID, new String[0]);
	//    0    0:aload_0         
	//    1    1:getstatic       #23  <Field String ID>
	//    2    4:iconst_0        
	//    3    5:anewarray       String[]
	//    4    8:invokespecial   #31  <Method void zzbq(String, String[])>
		zzazs = zzfb1;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #33  <Field zzfb zzazs>
	//    8   16:return          
	}

	public final zzp zzc(Map map)
	{
		map = ((Map) (zzazs.zzpt()));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field zzfb zzazs>
	//    2    4:invokevirtual   #40  <Method String zzfb.zzpt()>
	//    3    7:astore_1        
		if(map == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       16
			return zzgj.zzqq();
	//    6   12:invokestatic    #46  <Method zzp zzgj.zzqq()>
	//    7   15:areturn         
		else
			return zzgj.zzj(((Object) (map)));
	//    8   16:aload_1         
	//    9   17:invokestatic    #50  <Method zzp zzgj.zzj(Object)>
	//   10   20:areturn         
	}

	public final boolean zznk()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private static final String ID;
	private final zzfb zzazs;

	static 
	{
		ID = zza.zzr.toString();
	//    0    0:getstatic       #17  <Field zza zza.zzr>
	//    1    3:invokevirtual   #21  <Method String zza.toString()>
	//    2    6:putstatic       #23  <Field String ID>
	//*   3    9:return          
	}
}
