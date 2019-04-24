// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzanl, zzaqw, zzacq

final class zzacy
	implements zzanl
{

	zzacy(zzacq zzacq, String s, zzv zzv)
	{
		zzcbt = s;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field String zzcbt>
		zzcbu = zzv;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #17  <Field zzv zzcbu>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void Object()>
	//    8   14:return          
	}

	public final void zzb(Throwable throwable)
	{
	//    0    0:return          
	}

	public final void zzh(Object obj)
	{
		((zzaqw)obj).zzb(zzcbt, zzcbu);
	//    0    0:aload_1         
	//    1    1:checkcast       #27  <Class zzaqw>
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field String zzcbt>
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field zzv zzcbu>
	//    6   12:invokeinterface #30  <Method void zzaqw.zzb(String, zzv)>
	//    7   17:return          
	}

	private final String zzcbt;
	private final zzv zzcbu;
}
