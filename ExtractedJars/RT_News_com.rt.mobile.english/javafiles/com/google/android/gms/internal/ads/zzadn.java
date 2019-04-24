// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzht, zzadk, zzii

final class zzadn
	implements zzht
{

	zzadn(zzadk zzadk1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzcck = zzadk1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field zzadk zzcck>
	//    5    9:return          
	}

	public final void zza(zzii zzii)
	{
		zzcck.zzb(zzii);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzadk zzcck>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #23  <Method void zzadk.zzb(zzii)>
	//    4    8:return          
	}

	private final zzadk zzcck;
}
