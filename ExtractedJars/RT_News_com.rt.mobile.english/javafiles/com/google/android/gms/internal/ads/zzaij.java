// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzanj, zzaii, zzanz

final class zzaij
	implements zzanj
{

	zzaij(zzaii zzaii1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzcmy = zzaii1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field zzaii zzcmy>
	//    5    9:return          
	}

	public final zzanz zzc(Object obj)
	{
		return zzcmy.zzm((Map)obj);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzaii zzcmy>
	//    2    4:aload_1         
	//    3    5:checkcast       #20  <Class Map>
	//    4    8:invokevirtual   #26  <Method zzanz zzaii.zzm(Map)>
	//    5   11:areturn         
	}

	private final zzaii zzcmy;
}
