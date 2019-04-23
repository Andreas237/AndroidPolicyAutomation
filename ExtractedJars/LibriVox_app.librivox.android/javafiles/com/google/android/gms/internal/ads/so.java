// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aan, sn, abe

final class so
	implements aan
{

	private so()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public final abe a(Object obj)
	{
		return sn.a((JSONObject)obj);
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class JSONObject>
	//    2    4:invokestatic    #25  <Method abe sn.a(JSONObject)>
	//    3    7:areturn         
	}

	static final aan a = new so();

	static 
	{
	//    0    0:new             #2   <Class so>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void so()>
	//    3    7:putstatic       #15  <Field aan a>
	//*   4   10:return          
	}
}
