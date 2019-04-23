// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aap, afn, pt

final class qd
	implements aap
{

	qd(pt pt, String s, JSONObject jsonobject)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #14  <Field String a>
		b = jsonobject;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #16  <Field JSONObject b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void a(Object obj)
	{
		((afn)obj).a(a, b);
	//    0    0:aload_1         
	//    1    1:checkcast       #23  <Class afn>
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field String a>
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field JSONObject b>
	//    6   12:invokeinterface #26  <Method void afn.a(String, JSONObject)>
	//    7   17:return          
	}

	public final void a(Throwable throwable)
	{
	//    0    0:return          
	}

	private final String a;
	private final JSONObject b;
}
