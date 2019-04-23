// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal.a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.f;

// Referenced classes of package com.google.android.gms.common.internal.a:
//			b

final class g extends b
{

	public g(f f1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void b()>
		a = f1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field f a>
	//    5    9:return          
	}

	public final void a(int i)
	{
		a.a(((Object) (new Status(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field f a>
	//    2    4:new             #17  <Class Status>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:invokespecial   #19  <Method void Status(int)>
	//    6   12:invokeinterface #24  <Method void f.a(Object)>
	//    7   17:return          
	}

	private final f a;
}
