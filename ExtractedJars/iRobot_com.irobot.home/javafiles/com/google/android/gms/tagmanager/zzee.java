// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzp;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbq, zzgj

final class zzee extends zzbq
{

	public zzee()
	{
		super(ID, new String[0]);
	//    0    0:aload_0         
	//    1    1:getstatic       #22  <Field String ID>
	//    2    4:iconst_0        
	//    3    5:anewarray       String[]
	//    4    8:invokespecial   #39  <Method void zzbq(String, String[])>
	//    5   11:return          
	}

	public final zzp zzc(Map map)
	{
		return zzbea;
	//    0    0:getstatic       #32  <Field zzp zzbea>
	//    1    3:areturn         
	}

	public final boolean zznk()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final String ID;
	private static final zzp zzbea = zzgj.zzj("Android");

	static 
	{
		ID = zza.zzy.toString();
	//    0    0:getstatic       #16  <Field zza zza.zzy>
	//    1    3:invokevirtual   #20  <Method String zza.toString()>
	//    2    6:putstatic       #22  <Field String ID>
	//    3    9:ldc1            #24  <String "Android">
	//    4   11:invokestatic    #30  <Method zzp zzgj.zzj(Object)>
	//    5   14:putstatic       #32  <Field zzp zzbea>
	//*   6   17:return          
	}
}
