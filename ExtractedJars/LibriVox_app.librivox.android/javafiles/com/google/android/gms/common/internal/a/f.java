// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal.a;

import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.w;

// Referenced classes of package com.google.android.gms.common.internal.a:
//			i, j, m, g, 
//			e

final class f extends i
{

	f(e e, w w)
	{
		super(w);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #9   <Method void i(w)>
	//    3    5:return          
	}

	protected final void a(c c)
	{
		((m)((j)c).x()).a(((k) (new g(((com.google.android.gms.common.api.internal.f) (this))))));
	//    0    0:aload_1         
	//    1    1:checkcast       #14  <Class j>
	//    2    4:invokevirtual   #18  <Method android.os.IInterface j.x()>
	//    3    7:checkcast       #20  <Class m>
	//    4   10:new             #22  <Class g>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #25  <Method void g(com.google.android.gms.common.api.internal.f)>
	//    8   18:invokeinterface #28  <Method void m.a(k)>
	//    9   23:return          
	}
}
