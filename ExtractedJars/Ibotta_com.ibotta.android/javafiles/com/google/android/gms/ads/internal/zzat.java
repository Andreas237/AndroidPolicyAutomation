// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.*;

// Referenced classes of package com.google.android.gms.ads.internal:
//			zzas

final class zzat
	implements zzasd
{

	zzat(zzoo zzoo, String s, zzaqw zzaqw)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzzn = zzoo;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field zzoo zzzn>
		zzzo = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field String zzzo>
		zzzp = zzaqw;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field zzaqw zzzp>
	//   11   19:return          
	}

	public final void zze(boolean flag)
	{
		zzas.zza(zzzn, zzzo, zzzp, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzoo zzzn>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field String zzzo>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field zzaqw zzzp>
	//    6   12:iload_1         
	//    7   13:invokestatic    #32  <Method void zzas.zza(zzoo, String, zzaqw, boolean)>
	//    8   16:return          
	}

	private final zzoo zzzn;
	private final String zzzo;
	private final zzaqw zzzp;
}
