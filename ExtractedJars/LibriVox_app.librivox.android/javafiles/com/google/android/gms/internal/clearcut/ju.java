// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal.clearcut:
//			fz, jr

final class ju extends fz
{

	ju(jr jr1)
	{
		a = jr1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field jr a>
		super(((eu) (null)));
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #13  <Method void fz(eu)>
	//    6   10:return          
	}

	public final void a(Status status)
	{
		a.b(((com.google.android.gms.common.api.ah) (status)));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field jr a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #21  <Method void jr.b(com.google.android.gms.common.api.ah)>
	//    4    8:return          
	}

	private final jr a;
}
