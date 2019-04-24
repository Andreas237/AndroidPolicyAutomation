// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzaax

class zzaax$zza$3
	implements Runnable
{

	public void run()
	{
		zzaCG.onConnectionFailed(zzaCH);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzaax$zza zzaCG>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field ConnectionResult zzaCH>
	//    4    8:invokevirtual   #32  <Method void zzaax$zza.onConnectionFailed(ConnectionResult)>
	//    5   11:return          
	}

	final zzaax.zza zzaCG;
	final ConnectionResult zzaCH;

	zzaax$zza$3(zzaax.zza zza1, ConnectionResult connectionresult)
	{
		zzaCG = zza1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field zzaax$zza zzaCG>
		zzaCH = connectionresult;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field ConnectionResult zzaCH>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
	//    8   14:return          
	}
}
