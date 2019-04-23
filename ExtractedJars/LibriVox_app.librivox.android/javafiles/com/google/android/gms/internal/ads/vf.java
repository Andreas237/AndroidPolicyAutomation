// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aan, ve, abe

final class vf
	implements aan
{

	vf(ve ve1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = ve1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field ve a>
	//    5    9:return          
	}

	public final abe a(Object obj)
	{
		return a.a((Map)obj);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ve a>
	//    2    4:aload_1         
	//    3    5:checkcast       #19  <Class Map>
	//    4    8:invokevirtual   #24  <Method abe ve.a(Map)>
	//    5   11:areturn         
	}

	private final ve a;
}
