// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaoo, zzwb, zzff

final class zzfg
	implements zzaoo
{

	zzfg(zzff zzff1)
	{
		zzaga = zzff1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzff zzaga>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	public final void zze(Object obj)
	{
		obj = ((Object) ((zzwb)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzwb>
	//    2    4:astore_1        
		zzff.zza(zzaga, true);
	//    3    5:aload_0         
	//    4    6:getfield        #13  <Field zzff zzaga>
	//    5    9:iconst_1        
	//    6   10:invokestatic    #27  <Method boolean zzff.zza(zzff, boolean)>
	//    7   13:pop             
		zzaga.zza(((zzwb) (obj)));
	//    8   14:aload_0         
	//    9   15:getfield        #13  <Field zzff zzaga>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #30  <Method void zzff.zza(zzwb)>
	//   12   22:return          
	}

	private final zzff zzaga;
}