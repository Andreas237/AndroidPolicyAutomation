// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aan, afn, pt, abe

final class pv
	implements aan
{

	pv(pt pt1, JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = pt1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field pt a>
		b = jsonobject;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field JSONObject b>
	//    8   14:return          
	}

	public final abe a(Object obj)
	{
		return a.d(b, (afn)obj);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field pt a>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field JSONObject b>
	//    4    8:aload_1         
	//    5    9:checkcast       #23  <Class afn>
	//    6   12:invokevirtual   #29  <Method abe pt.d(JSONObject, afn)>
	//    7   15:areturn         
	}

	private final pt a;
	private final JSONObject b;
}
