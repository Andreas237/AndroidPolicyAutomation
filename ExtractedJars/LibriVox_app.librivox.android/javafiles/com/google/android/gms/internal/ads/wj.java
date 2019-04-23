// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wi

final class wj
	implements Callable
{

	wj(wi wi1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = wi1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field wi a>
	//    5    9:return          
	}

	public final Object call()
	{
		return ((Object) (a.o()));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field wi a>
	//    2    4:invokevirtual   #24  <Method java.util.ArrayList wi.o()>
	//    3    7:areturn         
	}

	private final wi a;
}
