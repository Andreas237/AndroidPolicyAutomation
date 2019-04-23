// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast.framework.media;

import com.google.android.gms.common.api.w;
import com.google.android.gms.internal.cast.ac;
import com.google.android.gms.internal.cast.au;

// Referenced classes of package com.google.android.gms.cast.framework.media:
//			q, i

final class as extends q
{

	as(i j, w w)
	{
		b = j;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field i b>
		super(j, w);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #12  <Method void q(i, w)>
	//    7   11:return          
	}

	protected final void a(ac ac)
	{
		i.d(b).a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field i b>
	//    2    4:invokestatic    #21  <Method au i.d(i)>
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field com.google.android.gms.internal.cast.ba a>
	//    5   11:invokevirtual   #29  <Method long au.a(com.google.android.gms.internal.cast.ba)>
	//    6   14:pop2            
	//    7   15:return          
	}

	private final i b;
}
