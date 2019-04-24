// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzasd, zzaoj, zzaqw

final class zzabx
	implements zzasd
{

	zzabx(zzaoj zzaoj1, zzaqw zzaqw)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzbnu = zzaoj1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field zzaoj zzbnu>
		zzcai = zzaqw;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field zzaqw zzcai>
	//    8   14:return          
	}

	public final void zze(boolean flag)
	{
		zzbnu.set(((Object) (zzcai)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzaoj zzbnu>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field zzaqw zzcai>
	//    4    8:invokevirtual   #28  <Method void zzaoj.set(Object)>
	//    5   11:return          
	}

	private final zzaoj zzbnu;
	private final zzaqw zzcai;
}
