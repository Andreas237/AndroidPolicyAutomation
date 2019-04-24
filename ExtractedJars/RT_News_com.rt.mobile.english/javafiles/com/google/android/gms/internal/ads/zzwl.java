// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzwh, zzwk

final class zzwl
	implements zzwh
{

	private zzwl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public final Object zze(JSONObject jsonobject)
	{
		return ((Object) (zzwk.zzf(jsonobject)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #25  <Method java.io.InputStream zzwk.zzf(JSONObject)>
	//    2    4:areturn         
	}

	static final zzwh zzbre = new zzwl();

	static 
	{
	//    0    0:new             #2   <Class zzwl>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void zzwl()>
	//    3    7:putstatic       #15  <Field zzwh zzbre>
	//*   4   10:return          
	}
}
