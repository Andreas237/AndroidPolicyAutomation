// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.ag;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bpf, box

final class bpi
	implements ag
{

	bpi(bpf bpf1)
	{
		a = bpf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bpf a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void zza(Object obj, Map map)
	{
		bpf.a(a).c(map);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field bpf a>
	//    2    4:invokestatic    #23  <Method box bpf.a(bpf)>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #29  <Method void box.c(Map)>
	//    5   11:return          
	}

	private final bpf a;
}
