// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aap, ve, abe

final class vi
	implements aap
{

	vi(ve ve1, abe abe)
	{
		a = abe;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #12  <Field abe a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void a(Object obj)
	{
		ve.e().remove(((Object) (a)));
	//    0    0:invokestatic    #23  <Method List ve.e()>
	//    1    3:aload_0         
	//    2    4:getfield        #12  <Field abe a>
	//    3    7:invokeinterface #29  <Method boolean List.remove(Object)>
	//    4   12:pop             
	//    5   13:return          
	}

	public final void a(Throwable throwable)
	{
		ve.e().remove(((Object) (a)));
	//    0    0:invokestatic    #23  <Method List ve.e()>
	//    1    3:aload_0         
	//    2    4:getfield        #12  <Field abe a>
	//    3    7:invokeinterface #29  <Method boolean List.remove(Object)>
	//    4   12:pop             
	//    5   13:return          
	}

	private final abe a;
}
