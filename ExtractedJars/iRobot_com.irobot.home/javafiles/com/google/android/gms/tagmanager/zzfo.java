// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//			zzcc, zzfn

final class zzfo
	implements zzcc
{

	zzfo(zzfn zzfn1)
	{
		zzbgl = zzfn1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzfn zzbgl>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void zzo(boolean flag)
	{
		zzbgl.zzb(flag, zzfn.zzd(zzbgl));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzfn zzbgl>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #12  <Field zzfn zzbgl>
	//    5    9:invokestatic    #24  <Method boolean zzfn.zzd(zzfn)>
	//    6   12:invokevirtual   #28  <Method void zzfn.zzb(boolean, boolean)>
	//    7   15:return          
	}

	private final zzfn zzbgl;
}
