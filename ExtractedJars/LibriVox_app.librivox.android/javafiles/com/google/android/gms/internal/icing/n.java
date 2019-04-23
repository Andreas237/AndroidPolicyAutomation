// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.icing;

import com.google.android.gms.common.api.w;

// Referenced classes of package com.google.android.gms.internal.icing:
//			l, m, c, zzx, 
//			j

final class n extends l
{

	n(j j, w w, zzx azzx[])
	{
		a = azzx;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #10  <Field zzx[] a>
		super(w);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void l(w)>
	//    6   10:return          
	}

	protected final void a(c c1)
	{
		c1.a(((e) (new m(((com.google.android.gms.common.api.internal.f) (this))))), ((String) (null)), a);
	//    0    0:aload_1         
	//    1    1:new             #17  <Class m>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void m(com.google.android.gms.common.api.internal.f)>
	//    5    9:aconst_null     
	//    6   10:aload_0         
	//    7   11:getfield        #10  <Field zzx[] a>
	//    8   14:invokeinterface #25  <Method void c.a(e, String, zzx[])>
	//    9   19:return          
	}

	private final zzx a[];
}
