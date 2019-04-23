// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.ac;
import com.google.android.gms.ads.internal.gmsg.ag;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			pf

final class pm
	implements ag
{

	pm(pf pf1)
	{
		a = pf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field pf a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void zza(Object obj, Map map)
	{
		pf.a(a).M();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field pf a>
	//    2    4:invokestatic    #23  <Method ac pf.a(pf)>
	//    3    7:invokevirtual   #28  <Method void ac.M()>
	//    4   10:return          
	}

	private final pf a;
}
