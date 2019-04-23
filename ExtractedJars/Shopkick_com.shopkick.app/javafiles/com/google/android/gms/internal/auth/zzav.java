// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal.auth:
//			zzaj, zzax, zzau

final class zzav extends zzaj
{

	zzav(zzau zzau1)
	{
		zzcg = zzau1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field zzau zzcg>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void zzaj()>
	//    5    9:return          
	}

	public final void zzb(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
		{
			zzcg.setResult(((com.google.android.gms.common.api.Result) (new zzax(s))));
	//    2    4:aload_0         
	//    3    5:getfield        #10  <Field zzau zzcg>
	//    4    8:new             #18  <Class zzax>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #20  <Method void zzax(String)>
	//    8   16:invokevirtual   #26  <Method void zzau.setResult(com.google.android.gms.common.api.Result)>
			return;
	//    9   19:return          
		} else
		{
			zzcg.setResult(((com.google.android.gms.common.api.Result) (zzau.zzc(new Status(3006)))));
	//   10   20:aload_0         
	//   11   21:getfield        #10  <Field zzau zzcg>
	//   12   24:new             #28  <Class Status>
	//   13   27:dup             
	//   14   28:sipush          3006
	//   15   31:invokespecial   #31  <Method void Status(int)>
	//   16   34:invokestatic    #35  <Method com.google.android.gms.auth.api.proxy.ProxyApi$SpatulaHeaderResult zzau.zzc(Status)>
	//   17   37:invokevirtual   #26  <Method void zzau.setResult(com.google.android.gms.common.api.Result)>
			return;
	//   18   40:return          
		}
	}

	private final zzau zzcg;
}
