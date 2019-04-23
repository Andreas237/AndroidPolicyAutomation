// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			abt, iv, bpj

final class bpm
	implements abt
{

	bpm(bpj bpj, JSONObject jsonobject)
	{
		a = jsonobject;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #12  <Field JSONObject a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void a(Object obj)
	{
		((iv)obj).b("AFMA_updateActiveView", a);
	//    0    0:aload_1         
	//    1    1:checkcast       #19  <Class iv>
	//    2    4:ldc1            #21  <String "AFMA_updateActiveView">
	//    3    6:aload_0         
	//    4    7:getfield        #12  <Field JSONObject a>
	//    5   10:invokeinterface #25  <Method void iv.b(String, JSONObject)>
	//    6   15:return          
	}

	private final JSONObject a;
}
