// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			agx, afn

final class pj
	implements agx
{

	pj(afn afn1, JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = afn1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field afn a>
		b = jsonobject;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field JSONObject b>
	//    8   14:return          
	}

	public final void a()
	{
		a.b("google.afma.nativeAds.renderVideo", b);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field afn a>
	//    2    4:ldc1            #22  <String "google.afma.nativeAds.renderVideo">
	//    3    6:aload_0         
	//    4    7:getfield        #19  <Field JSONObject b>
	//    5   10:invokeinterface #27  <Method void afn.b(String, JSONObject)>
	//    6   15:return          
	}

	private final afn a;
	private final JSONObject b;
}
