// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.ag;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bpj, box

final class bpo
	implements ag
{

	bpo(bpj bpj1)
	{
		a = bpj1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bpj a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void zza(Object obj, Map map)
	{
		if(bpj.a(a).a(map))
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field bpj a>
	//*   2    4:invokestatic    #23  <Method box bpj.a(bpj)>
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #28  <Method boolean box.a(Map)>
	//*   5   11:ifeq            25
			bpj.a(a).b(map);
	//    6   14:aload_0         
	//    7   15:getfield        #12  <Field bpj a>
	//    8   18:invokestatic    #23  <Method box bpj.a(bpj)>
	//    9   21:aload_2         
	//   10   22:invokevirtual   #32  <Method void box.b(Map)>
	//   11   25:return          
	}

	private final bpj a;
}
