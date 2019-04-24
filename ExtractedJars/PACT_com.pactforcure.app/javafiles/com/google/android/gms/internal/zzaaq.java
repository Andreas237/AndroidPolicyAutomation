// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Looper;
import com.google.android.gms.common.api.zzc;

// Referenced classes of package com.google.android.gms.internal:
//			zzaah, zzabp

public class zzaaq extends zzaah
{

	public zzaaq(zzc zzc1)
	{
		super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
	//    0    0:aload_0         
	//    1    1:ldc1            #12  <String "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.">
	//    2    3:invokespecial   #15  <Method void zzaah(String)>
		zzaBl = zzc1;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #17  <Field zzc zzaBl>
	//    6   11:return          
	}

	public Looper getLooper()
	{
		return zzaBl.getLooper();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzc zzaBl>
	//    2    4:invokevirtual   #26  <Method Looper zzc.getLooper()>
	//    3    7:areturn         
	}

	public zzzv.zza zza(zzzv.zza zza1)
	{
		return zzaBl.doRead(zza1);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzc zzaBl>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #32  <Method zzzv$zza zzc.doRead(zzzv$zza)>
	//    4    8:areturn         
	}

	public void zza(zzabp zzabp)
	{
	//    0    0:return          
	}

	public zzzv.zza zzb(zzzv.zza zza1)
	{
		return zzaBl.doWrite(zza1);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzc zzaBl>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #39  <Method zzzv$zza zzc.doWrite(zzzv$zza)>
	//    4    8:areturn         
	}

	public void zzb(zzabp zzabp)
	{
	//    0    0:return          
	}

	private final zzc zzaBl;
}
