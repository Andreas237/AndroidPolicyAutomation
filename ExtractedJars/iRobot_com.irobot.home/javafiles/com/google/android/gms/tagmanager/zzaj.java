// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzp;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbq, zzgj

final class zzaj extends zzbq
{

	public zzaj(String s)
	{
		super(ID, new String[0]);
	//    0    0:aload_0         
	//    1    1:getstatic       #22  <Field String ID>
	//    2    4:iconst_0        
	//    3    5:anewarray       String[]
	//    4    8:invokespecial   #30  <Method void zzbq(String, String[])>
		version = s;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #32  <Field String version>
	//    8   16:return          
	}

	public final zzp zzc(Map map)
	{
		if(version == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field String version>
	//*   2    4:ifnonnull       11
			return zzgj.zzqq();
	//    3    7:invokestatic    #40  <Method zzp zzgj.zzqq()>
	//    4   10:areturn         
		else
			return zzgj.zzj(((Object) (version)));
	//    5   11:aload_0         
	//    6   12:getfield        #32  <Field String version>
	//    7   15:invokestatic    #43  <Method zzp zzgj.zzj(Object)>
	//    8   18:areturn         
	}

	public final boolean zznk()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final String ID;
	private final String version;

	static 
	{
		ID = zza.zzj.toString();
	//    0    0:getstatic       #16  <Field zza zza.zzj>
	//    1    3:invokevirtual   #20  <Method String zza.toString()>
	//    2    6:putstatic       #22  <Field String ID>
	//*   3    9:return          
	}
}
