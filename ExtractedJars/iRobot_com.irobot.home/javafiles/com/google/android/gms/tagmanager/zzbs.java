// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzdy, zzgi

final class zzbs extends zzdy
{

	public zzbs()
	{
		super(ID);
	//    0    0:aload_0         
	//    1    1:getstatic       #20  <Field String ID>
	//    2    4:invokespecial   #25  <Method void zzdy(String)>
	//    3    7:return          
	}

	protected final boolean zza(zzgi zzgi1, zzgi zzgi2, Map map)
	{
		return zzgi1.zza(zzgi2) >= 0;
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #32  <Method int com.google.android.gms.tagmanager.zzgi.zza(zzgi)>
	//    3    5:iflt            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	private static final String ID;

	static 
	{
		ID = zza.zzbr.toString();
	//    0    0:getstatic       #14  <Field zza zza.zzbr>
	//    1    3:invokevirtual   #18  <Method String zza.toString()>
	//    2    6:putstatic       #20  <Field String ID>
	//*   3    9:return          
	}
}
