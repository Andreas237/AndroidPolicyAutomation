// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaoo, zzwb, zzff

final class zzfi
	implements zzaoo
{

	zzfi(zzff zzff, JSONObject jsonobject)
	{
		zzagb = jsonobject;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #13  <Field JSONObject zzagb>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	public final void zze(Object obj)
	{
		((zzwb)obj).zzb("AFMA_updateActiveView", zzagb);
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class zzwb>
	//    2    4:ldc1            #23  <String "AFMA_updateActiveView">
	//    3    6:aload_0         
	//    4    7:getfield        #13  <Field JSONObject zzagb>
	//    5   10:invokeinterface #27  <Method void zzwb.zzb(String, JSONObject)>
	//    6   15:return          
	}

	private final JSONObject zzagb;
}
