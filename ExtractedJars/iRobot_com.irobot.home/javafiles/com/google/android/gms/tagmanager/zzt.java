// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.*;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbq

final class zzt extends zzbq
{

	public zzt()
	{
		super(ID, new String[] {
			VALUE
		});
	//    0    0:aload_0         
	//    1    1:getstatic       #21  <Field String ID>
	//    2    4:iconst_1        
	//    3    5:anewarray       String[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #30  <Field String VALUE>
	//    7   13:aastore         
	//    8   14:invokespecial   #37  <Method void zzbq(String, String[])>
	//    9   17:return          
	}

	public static String zznm()
	{
		return ID;
	//    0    0:getstatic       #21  <Field String ID>
	//    1    3:areturn         
	}

	public static String zznn()
	{
		return VALUE;
	//    0    0:getstatic       #30  <Field String VALUE>
	//    1    3:areturn         
	}

	public final zzp zzc(Map map)
	{
		return (zzp)map.get(((Object) (VALUE)));
	//    0    0:aload_1         
	//    1    1:getstatic       #30  <Field String VALUE>
	//    2    4:invokeinterface #47  <Method Object Map.get(Object)>
	//    3    9:checkcast       #49  <Class zzp>
	//    4   12:areturn         
	}

	public final boolean zznk()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final String ID;
	private static final String VALUE;

	static 
	{
		ID = zza.zzg.toString();
	//    0    0:getstatic       #15  <Field zza zza.zzg>
	//    1    3:invokevirtual   #19  <Method String zza.toString()>
	//    2    6:putstatic       #21  <Field String ID>
		VALUE = zzb.zznh.toString();
	//    3    9:getstatic       #27  <Field zzb zzb.zznh>
	//    4   12:invokevirtual   #28  <Method String zzb.toString()>
	//    5   15:putstatic       #30  <Field String VALUE>
	//*   6   18:return          
	}
}
