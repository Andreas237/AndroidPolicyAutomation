// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.zzc;

// Referenced classes of package com.google.android.gms.internal:
//			zzaap, zzabx

public class zzaay extends zzaap
{

	public zzaay(zzc zzc1)
	{
		super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
	//    0    0:aload_0         
	//    1    1:ldc1            #12  <String "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.">
	//    2    3:invokespecial   #15  <Method void zzaap(String)>
		zzaCK = zzc1;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #17  <Field zzc zzaCK>
	//    6   11:return          
	}

	public Context getContext()
	{
		return zzaCK.getApplicationContext();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzc zzaCK>
	//    2    4:invokevirtual   #27  <Method Context zzc.getApplicationContext()>
	//    3    7:areturn         
	}

	public Looper getLooper()
	{
		return zzaCK.getLooper();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzc zzaCK>
	//    2    4:invokevirtual   #31  <Method Looper zzc.getLooper()>
	//    3    7:areturn         
	}

	public zzaad.zza zza(zzaad.zza zza1)
	{
		return zzaCK.doRead(zza1);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzc zzaCK>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #37  <Method zzaad$zza zzc.doRead(zzaad$zza)>
	//    4    8:areturn         
	}

	public void zza(zzabx zzabx)
	{
	//    0    0:return          
	}

	public zzaad.zza zzb(zzaad.zza zza1)
	{
		return zzaCK.doWrite(zza1);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzc zzaCK>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #44  <Method zzaad$zza zzc.doWrite(zzaad$zza)>
	//    4    8:areturn         
	}

	public void zzb(zzabx zzabx)
	{
	//    0    0:return          
	}

	private final zzc zzaCK;
}
