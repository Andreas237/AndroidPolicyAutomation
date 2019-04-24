// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;


// Referenced classes of package com.google.android.gms.tasks:
//			zza, CancellationToken

public class CancellationTokenSource
{

	public CancellationTokenSource()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #12  <Class zza>
	//    4    8:dup             
	//    5    9:invokespecial   #13  <Method void zza()>
	//    6   12:putfield        #15  <Field zza zzc>
	//    7   15:return          
	}

	public void cancel()
	{
		zzc.cancel();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zza zzc>
	//    2    4:invokevirtual   #19  <Method void zza.cancel()>
	//    3    7:return          
	}

	public CancellationToken getToken()
	{
		return ((CancellationToken) (zzc));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zza zzc>
	//    2    4:areturn         
	}

	private final zza zzc = new zza();
}
