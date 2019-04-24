// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaoo, zzwb, zzwq, zzvs, 
//			zzaoj

final class zzwr
	implements zzaoo
{

	zzwr(zzwq zzwq1, zzvs zzvs, Object obj, zzaoj zzaoj)
	{
		zzbro = zzwq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field zzwq zzbro>
		zzbrl = zzvs;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field zzvs zzbrl>
		zzbrm = obj;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field Object zzbrm>
		zzbrn = zzaoj;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #25  <Field zzaoj zzbrn>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #28  <Method void Object()>
	//   14   25:return          
	}

	public final void zze(Object obj)
	{
		obj = ((Object) ((zzwb)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #33  <Class zzwb>
	//    2    4:astore_1        
		zzwq.zza(zzbro, zzbrl, ((zzwb) (obj)), zzbrm, zzbrn);
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field zzwq zzbro>
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field zzvs zzbrl>
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #23  <Field Object zzbrm>
	//   10   18:aload_0         
	//   11   19:getfield        #25  <Field zzaoj zzbrn>
	//   12   22:invokestatic    #39  <Method void zzwq.zza(zzwq, zzvs, zzwb, Object, zzaoj)>
	//   13   25:return          
	}

	private final zzvs zzbrl;
	private final Object zzbrm;
	private final zzaoj zzbrn;
	private final zzwq zzbro;
}
