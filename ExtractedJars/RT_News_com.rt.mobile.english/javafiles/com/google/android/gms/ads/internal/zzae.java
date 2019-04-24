// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.*;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal:
//			zzbv

final class zzae
	implements zzanj
{

	private zzae()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public final zzanz zzc(Object obj)
	{
		obj = ((Object) ((JSONObject)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class JSONObject>
	//    2    4:astore_1        
		if(((JSONObject) (obj)).optBoolean("isSuccessful", false))
	//*   3    5:aload_1         
	//*   4    6:ldc1            #23  <String "isSuccessful">
	//*   5    8:iconst_0        
	//*   6    9:invokevirtual   #27  <Method boolean JSONObject.optBoolean(String, boolean)>
	//*   7   12:ifeq            32
		{
			obj = ((Object) (((JSONObject) (obj)).getString("appSettingsJson")));
	//    8   15:aload_1         
	//    9   16:ldc1            #29  <String "appSettingsJson">
	//   10   18:invokevirtual   #33  <Method String JSONObject.getString(String)>
	//   11   21:astore_1        
			zzbv.zzeo().zzqh().zzcs(((String) (obj)));
	//   12   22:invokestatic    #39  <Method zzajm zzbv.zzeo()>
	//   13   25:invokevirtual   #45  <Method zzakd zzajm.zzqh()>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #51  <Method void zzakd.zzcs(String)>
		}
		return ((zzanz) (zzano.zzi(((Object) (null)))));
	//   16   32:aconst_null     
	//   17   33:invokestatic    #57  <Method com.google.android.gms.internal.ads.zzany zzano.zzi(Object)>
	//   18   36:areturn         
	}

	static final zzanj zzxn = new zzae();

	static 
	{
	//    0    0:new             #2   <Class zzae>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void zzae()>
	//    3    7:putstatic       #15  <Field zzanj zzxn>
	//*   4   10:return          
	}
}
