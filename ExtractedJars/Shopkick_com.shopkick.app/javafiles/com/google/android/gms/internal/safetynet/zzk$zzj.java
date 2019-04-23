// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal.safetynet:
//			zzk

static final class zzk$zzj
	implements com.google.android.gms.safetynet.tApi.zzc
{

	public final Status getStatus()
	{
		return zzad;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Status zzad>
	//    2    4:areturn         
	}

	public final boolean isVerifyAppsEnabled()
	{
		Status status = zzad;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Status zzad>
	//    2    4:astore_1        
		if(status != null && status.isSuccess())
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #32  <Method boolean Status.isSuccess()>
	//*   7   13:ifeq            21
			return zzao;
	//    8   16:aload_0         
	//    9   17:getfield        #23  <Field boolean zzao>
	//   10   20:ireturn         
		else
			return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	private Status zzad;
	private boolean zzao;

	public zzk$zzj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public zzk$zzj(Status status, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzad = status;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Status zzad>
		zzao = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field boolean zzao>
	//    8   14:return          
	}
}
