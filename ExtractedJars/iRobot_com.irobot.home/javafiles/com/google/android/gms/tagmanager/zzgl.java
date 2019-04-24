// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.*;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbq, zzgj

final class zzgl extends zzbq
{

	public zzgl()
	{
		super(ID, new String[] {
			zzbcf
		});
	//    0    0:aload_0         
	//    1    1:getstatic       #21  <Field String ID>
	//    2    4:iconst_1        
	//    3    5:anewarray       String[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #30  <Field String zzbcf>
	//    7   13:aastore         
	//    8   14:invokespecial   #37  <Method void zzbq(String, String[])>
	//    9   17:return          
	}

	public final zzp zzc(Map map)
	{
		return zzgj.zzj(((Object) (zzgj.zzc((zzp)map.get(((Object) (zzbcf)))).toUpperCase())));
	//    0    0:aload_1         
	//    1    1:getstatic       #30  <Field String zzbcf>
	//    2    4:invokeinterface #45  <Method Object Map.get(Object)>
	//    3    9:checkcast       #47  <Class zzp>
	//    4   12:invokestatic    #52  <Method String zzgj.zzc(zzp)>
	//    5   15:invokevirtual   #55  <Method String String.toUpperCase()>
	//    6   18:invokestatic    #59  <Method zzp zzgj.zzj(Object)>
	//    7   21:areturn         
	}

	public final boolean zznk()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final String ID;
	private static final String zzbcf;

	static 
	{
		ID = zza.zzas.toString();
	//    0    0:getstatic       #15  <Field zza zza.zzas>
	//    1    3:invokevirtual   #19  <Method String zza.toString()>
	//    2    6:putstatic       #21  <Field String ID>
		zzbcf = zzb.zzef.toString();
	//    3    9:getstatic       #27  <Field zzb zzb.zzef>
	//    4   12:invokevirtual   #28  <Method String zzb.toString()>
	//    5   15:putstatic       #30  <Field String zzbcf>
	//*   6   18:return          
	}
}
