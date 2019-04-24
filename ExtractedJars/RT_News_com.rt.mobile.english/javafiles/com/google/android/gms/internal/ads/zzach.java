// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzasd, zzace, zzaoj, zzaqw

final class zzach
	implements zzasd
{

	zzach(zzace zzace1, zzaoj zzaoj, zzaqw zzaqw)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzcbf = zzace1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field zzace zzcbf>
		zzcag = zzaoj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field zzaoj zzcag>
		zzzp = zzaqw;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field zzaqw zzzp>
	//   11   19:return          
	}

	public final void zze(boolean flag)
	{
		zzcbf.zza(zzcag, zzzp, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzace zzcbf>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field zzaoj zzcag>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field zzaqw zzzp>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #32  <Method void zzace.zza(zzaoj, zzaqw, boolean)>
	//    8   16:return          
	}

	private final zzaoj zzcag;
	private final zzace zzcbf;
	private final zzaqw zzzp;
}
