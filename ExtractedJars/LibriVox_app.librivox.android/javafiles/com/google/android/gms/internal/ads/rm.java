// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			rt, rc, zzasm

public final class rm extends rt
{

	public rm(rc rc1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void rt()>
		a = new WeakReference(((Object) (rc1)));
	//    2    4:aload_0         
	//    3    5:new             #14  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #17  <Method void WeakReference(Object)>
	//    7   13:putfield        #19  <Field WeakReference a>
	//    8   16:return          
	}

	public final void a(zzasm zzasm)
	{
		rc rc1 = (rc)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field WeakReference a>
	//    2    4:invokevirtual   #25  <Method Object WeakReference.get()>
	//    3    7:checkcast       #27  <Class rc>
	//    4   10:astore_2        
		if(rc1 != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          22
			rc1.a(zzasm);
	//    7   15:aload_2         
	//    8   16:aload_1         
	//    9   17:invokeinterface #29  <Method void rc.a(zzasm)>
	//   10   22:return          
	}

	private final WeakReference a;
}
