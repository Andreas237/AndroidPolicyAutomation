// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//			zzaal, zzabl

class zzaal$3
	implements com.google.android.gms.common.api.iClient.OnConnectionFailedListener
{

	public void onConnectionFailed(ConnectionResult connectionresult)
	{
		zzaAB.zzb(((com.google.android.gms.common.api.Result) (new Status(8))));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzabl zzaAB>
	//    2    4:new             #26  <Class Status>
	//    3    7:dup             
	//    4    8:bipush          8
	//    5   10:invokespecial   #29  <Method void Status(int)>
	//    6   13:invokevirtual   #35  <Method void zzabl.zzb(com.google.android.gms.common.api.Result)>
	//    7   16:return          
	}

	final zzabl zzaAB;

	zzaal$3(zzaal zzaal1, zzabl zzabl1)
	{
		zzaAB = zzabl1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #17  <Field zzabl zzaAB>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
