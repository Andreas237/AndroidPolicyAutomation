// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ta, xe

public final class sz
{

	public sz()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		a = new WeakHashMap();
	//    2    4:aload_0         
	//    3    5:new             #13  <Class WeakHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void WeakHashMap()>
	//    6   12:putfield        #16  <Field WeakHashMap a>
	//    7   15:return          
	}

	static WeakHashMap a(sz sz1)
	{
		return sz1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field WeakHashMap a>
	//    2    4:areturn         
	}

	public final Future a(Context context)
	{
		return ((Future) (xe.a(((java.util.concurrent.Callable) (new ta(this, context))))));
	//    0    0:new             #21  <Class ta>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #24  <Method void ta(sz, Context)>
	//    5    9:invokestatic    #29  <Method abe xe.a(java.util.concurrent.Callable)>
	//    6   12:areturn         
	}

	private WeakHashMap a;
}
