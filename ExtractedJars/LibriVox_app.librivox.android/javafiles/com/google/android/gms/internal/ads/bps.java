// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.ag;
import com.google.android.gms.ads.internal.gmsg.f;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			iv, bpj, box

final class bps
	implements ag
{

	bps(bpj bpj1)
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
		obj = ((Object) ((iv)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class iv>
	//    2    4:astore_1        
		if(bpj.a(a).a(map))
	//*   3    5:aload_0         
	//*   4    6:getfield        #12  <Field bpj a>
	//*   5    9:invokestatic    #25  <Method box bpj.a(bpj)>
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #30  <Method boolean box.a(Map)>
	//*   8   16:ifeq            31
			bpj.b(a).zza(obj, map);
	//    9   19:aload_0         
	//   10   20:getfield        #12  <Field bpj a>
	//   11   23:invokestatic    #34  <Method f bpj.b(bpj)>
	//   12   26:aload_1         
	//   13   27:aload_2         
	//   14   28:invokevirtual   #38  <Method void f.zza(Object, Map)>
	//   15   31:return          
	}

	private final bpj a;
}
