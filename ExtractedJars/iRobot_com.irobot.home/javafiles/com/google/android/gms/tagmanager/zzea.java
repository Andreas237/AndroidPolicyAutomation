// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zza;
import com.google.android.gms.internal.measurement.zzp;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbq, zzgj

final class zzea extends zzbq
{

	public zzea()
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
		return zzgj.zzj(((Object) (android.os.Build.VERSION.RELEASE)));
	//    0    0:getstatic       #34  <Field String android.os.Build$VERSION.RELEASE>
	//    1    3:invokestatic    #40  <Method zzp zzgj.zzj(Object)>
	//    2    6:areturn         
	}

	public final boolean zznk()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final String ID;

	static 
	{
		ID = zza.zzx.toString();
	//    0    0:getstatic       #14  <Field zza zza.zzx>
	//    1    3:invokevirtual   #18  <Method String zza.toString()>
	//    2    6:putstatic       #20  <Field String ID>
	//*   3    9:return          
	}
}
