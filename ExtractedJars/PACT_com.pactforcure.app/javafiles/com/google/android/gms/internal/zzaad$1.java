// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//			zzaad, zzzx

class zzaad$1
	implements com.google.android.gms.common.api.esult.zza
{

	public void zzx(Status status)
	{
		zzaad.zza(zzazF).remove(((Object) (zzazE)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzaad zzazF>
	//    2    4:invokestatic    #30  <Method Map zzaad.zza(zzaad)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field zzzx zzazE>
	//    5   11:invokeinterface #36  <Method Object Map.remove(Object)>
	//    6   16:pop             
	//    7   17:return          
	}

	final zzzx zzazE;
	final zzaad zzazF;

	zzaad$1(zzaad zzaad1, zzzx zzzx)
	{
		zzazF = zzaad1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field zzaad zzazF>
		zzazE = zzzx;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field zzzx zzazE>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
