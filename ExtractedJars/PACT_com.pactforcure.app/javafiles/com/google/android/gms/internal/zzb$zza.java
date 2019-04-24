// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//			zzb

public static class zzb$zza
{

	public boolean zza()
	{
		return zzd < System.currentTimeMillis();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field long zzd>
	//    2    4:invokestatic    #40  <Method long System.currentTimeMillis()>
	//    3    7:lcmp            
	//    4    8:ifge            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public boolean zzb()
	{
		return zze < System.currentTimeMillis();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field long zze>
	//    2    4:invokestatic    #40  <Method long System.currentTimeMillis()>
	//    3    7:lcmp            
	//    4    8:ifge            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public byte data[];
	public String zza;
	public long zzb;
	public long zzc;
	public long zzd;
	public long zze;
	public Map zzf;

	public zzb$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		zzf = Collections.emptyMap();
	//    2    4:aload_0         
	//    3    5:invokestatic    #28  <Method Map Collections.emptyMap()>
	//    4    8:putfield        #30  <Field Map zzf>
	//    5   11:return          
	}
}
