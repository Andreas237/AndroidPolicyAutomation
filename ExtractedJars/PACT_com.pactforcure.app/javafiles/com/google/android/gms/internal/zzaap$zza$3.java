// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzaap

class zzaap$zza$3
	implements Runnable
{

	public void run()
	{
		zzaBh.onConnectionFailed(zzaBi);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzaap$zza zzaBh>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field ConnectionResult zzaBi>
	//    4    8:invokevirtual   #32  <Method void zzaap$zza.onConnectionFailed(ConnectionResult)>
	//    5   11:return          
	}

	final zzaap.zza zzaBh;
	final ConnectionResult zzaBi;

	zzaap$zza$3(zzaap.zza zza1, ConnectionResult connectionresult)
	{
		zzaBh = zza1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field zzaap$zza zzaBh>
		zzaBi = connectionresult;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field ConnectionResult zzaBi>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
	//    8   14:return          
	}
}
