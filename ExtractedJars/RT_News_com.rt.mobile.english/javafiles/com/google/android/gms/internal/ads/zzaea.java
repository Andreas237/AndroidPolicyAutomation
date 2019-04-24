// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaoo, zzaef, zzadz, zzaen

final class zzaea
	implements zzaoo
{

	zzaea(zzadz zzadz1, zzaen zzaen)
	{
		zzccs = zzadz1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzadz zzccs>
		zzccr = zzaen;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field zzaen zzccr>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void Object()>
	//    8   14:return          
	}

	public final void zze(Object obj)
	{
		obj = ((Object) ((zzaef)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #25  <Class zzaef>
	//    2    4:astore_1        
		if(!zzccs.zza(zzccr, ((zzaef) (obj))))
	//*   3    5:aload_0         
	//*   4    6:getfield        #15  <Field zzadz zzccs>
	//*   5    9:aload_0         
	//*   6   10:getfield        #17  <Field zzaen zzccr>
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #31  <Method boolean zzadz.zza(zzaen, zzaef)>
	//*   9   17:ifne            27
			zzccs.zznz();
	//   10   20:aload_0         
	//   11   21:getfield        #15  <Field zzadz zzccs>
	//   12   24:invokevirtual   #34  <Method void zzadz.zznz()>
	//   13   27:return          
	}

	private final zzaen zzccr;
	private final zzadz zzccs;
}
