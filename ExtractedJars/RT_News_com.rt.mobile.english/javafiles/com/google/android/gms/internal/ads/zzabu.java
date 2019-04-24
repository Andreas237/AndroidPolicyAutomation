// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzabt, zzabm, zzajh

final class zzabu
	implements Runnable
{

	zzabu(zzabt zzabt1, zzajh zzajh)
	{
		zzbzw = zzabt1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzabt zzbzw>
		zzaam = zzajh;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field zzajh zzaam>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		zzabt.zza(zzbzw).zzb(zzaam);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzabt zzbzw>
	//    2    4:invokestatic    #27  <Method zzabm zzabt.zza(zzabt)>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field zzajh zzaam>
	//    5   11:invokeinterface #33  <Method void zzabm.zzb(zzajh)>
	//    6   16:return          
	}

	private final zzajh zzaam;
	private final zzabt zzbzw;
}
