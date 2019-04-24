// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzht, zzii, zzig, zzit

final class zzadm
	implements zzht
{

	zzadm(zzit zzit)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzccl = zzit;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field zzit zzccl>
	//    5    9:return          
	}

	public final void zza(zzii zzii1)
	{
		zzit zzit = zzccl;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzit zzccl>
	//    2    4:astore_2        
		zzii1.zzanm.zzamx = zzit;
	//    3    5:aload_1         
	//    4    6:getfield        #24  <Field zzig zzii.zzanm>
	//    5    9:aload_2         
	//    6   10:putfield        #29  <Field zzit zzig.zzamx>
	//    7   13:return          
	}

	private final zzit zzccl;
}
