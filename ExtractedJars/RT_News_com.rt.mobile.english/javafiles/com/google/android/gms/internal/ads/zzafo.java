// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzanj, zzafn, zzanz

final class zzafo
	implements zzanj
{

	private zzafo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public final zzanz zzc(Object obj)
	{
		return zzafn.zzm((JSONObject)obj);
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class JSONObject>
	//    2    4:invokestatic    #27  <Method zzanz zzafn.zzm(JSONObject)>
	//    3    7:areturn         
	}

	static final zzanj zzxn = new zzafo();

	static 
	{
	//    0    0:new             #2   <Class zzafo>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void zzafo()>
	//    3    7:putstatic       #15  <Field zzanj zzxn>
	//*   4   10:return          
	}
}
