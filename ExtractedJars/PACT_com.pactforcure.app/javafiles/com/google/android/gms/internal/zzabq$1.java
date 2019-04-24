// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//			zzabq, zzzx

class zzabq$1
	implements b
{

	public void zzc(zzzx zzzx1)
	{
		zzaBZ.zzaBX.remove(((Object) (zzzx1)));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzabq zzaBZ>
	//    2    4:getfield        #24  <Field Set zzabq.zzaBX>
	//    3    7:aload_1         
	//    4    8:invokeinterface #30  <Method boolean Set.remove(Object)>
	//    5   13:pop             
		if(zzzx1.zzuR() != null)
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #36  <Method Integer zzzx.zzuR()>
	//*   8   18:ifnull          29
			zzabq.zza(zzaBZ);
	//    9   21:aload_0         
	//   10   22:getfield        #14  <Field zzabq zzaBZ>
	//   11   25:invokestatic    #40  <Method com.google.android.gms.common.api.zzf zzabq.zza(zzabq)>
	//   12   28:pop             
	//   13   29:return          
	}

	final zzabq zzaBZ;

	zzabq$1(zzabq zzabq1)
	{
		zzaBZ = zzabq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzabq zzaBZ>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
