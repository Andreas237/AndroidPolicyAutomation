// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aao, tc

final class td
	implements aao
{

	td(tc tc1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = tc1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field tc a>
	//    5    9:return          
	}

	public final Object a(Object obj)
	{
		return ((Object) (a.a((JSONObject)obj)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field tc a>
	//    2    4:aload_1         
	//    3    5:checkcast       #19  <Class JSONObject>
	//    4    8:invokevirtual   #24  <Method Void tc.a(JSONObject)>
	//    5   11:areturn         
	}

	private final tc a;
}
