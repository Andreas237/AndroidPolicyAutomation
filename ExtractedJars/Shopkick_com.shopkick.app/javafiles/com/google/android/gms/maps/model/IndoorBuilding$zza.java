// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import com.google.android.gms.internal.maps.zzq;
import com.google.android.gms.internal.maps.zzr;

// Referenced classes of package com.google.android.gms.maps.model:
//			IndoorBuilding, IndoorLevel

static final class IndoorBuilding$zza
{

	public static zzq zza(IBinder ibinder)
	{
		return zzr.zzf(ibinder);
	//    0    0:aload_0         
	//    1    1:invokestatic    #26  <Method zzq zzr.zzf(IBinder)>
	//    2    4:areturn         
	}

	public static IndoorLevel zza(zzq zzq)
	{
		return new IndoorLevel(zzq);
	//    0    0:new             #30  <Class IndoorLevel>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void IndoorLevel(zzq)>
	//    4    8:areturn         
	}

	public static final IndoorBuilding$zza zzde = new IndoorBuilding$zza();

	static 
	{
	//    0    0:new             #2   <Class IndoorBuilding$zza>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void IndoorBuilding$zza()>
	//    3    7:putstatic       #17  <Field IndoorBuilding$zza zzde>
	//*   4   10:return          
	}

	private IndoorBuilding$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}
}
