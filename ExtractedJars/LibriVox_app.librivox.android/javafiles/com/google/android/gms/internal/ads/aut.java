// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal.ads:
//			auz, aus, auq, aur

final class aut extends auz
{

	private aut(auq auq)
	{
		a = auq;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field auq a>
		super(auq, ((aur) (null)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokespecial   #13  <Method void auz(auq, aur)>
	//    7   11:return          
	}

	aut(auq auq, aur aur)
	{
		this(auq);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void aut(auq)>
	//    3    5:return          
	}

	public final Iterator iterator()
	{
		return ((Iterator) (new aus(a, ((aur) (null)))));
	//    0    0:new             #20  <Class aus>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #10  <Field auq a>
	//    4    8:aconst_null     
	//    5    9:invokespecial   #21  <Method void aus(auq, aur)>
	//    6   12:areturn         
	}

	private final auq a;
}
