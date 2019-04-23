// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.ag;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ov, az

final class pa
	implements ag
{

	pa(ov ov1, az az)
	{
		b = ov1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ov b>
		a = az;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field az a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void zza(Object obj, Map map)
	{
		obj = ((Object) ((String)map.get("asset")));
	//    0    0:aload_2         
	//    1    1:ldc1            #24  <String "asset">
	//    2    3:invokeinterface #30  <Method Object Map.get(Object)>
	//    3    8:checkcast       #32  <Class String>
	//    4   11:astore_1        
		ov.a(b, ((db) (a)), ((String) (obj)));
	//    5   12:aload_0         
	//    6   13:getfield        #14  <Field ov b>
	//    7   16:aload_0         
	//    8   17:getfield        #16  <Field az a>
	//    9   20:aload_1         
	//   10   21:invokestatic    #37  <Method void ov.a(ov, db, String)>
	//   11   24:return          
	}

	private final az a;
	private final ov b;
}
