// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzts, zztt, zzahe, zzagu, 
//			zzti

final class zztn
	implements zzts
{

	zztn(zzti zzti, zzagu zzagu)
	{
		zzboa = zzagu;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #12  <Field zzagu zzboa>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void zzb(zztt zztt1)
		throws RemoteException
	{
		if(zztt1.zzboh != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #26  <Field zzahe zztt.zzboh>
	//*   2    4:ifnull          20
			zztt1.zzboh.zza(zzboa);
	//    3    7:aload_1         
	//    4    8:getfield        #26  <Field zzahe zztt.zzboh>
	//    5   11:aload_0         
	//    6   12:getfield        #12  <Field zzagu zzboa>
	//    7   15:invokeinterface #32  <Method void zzahe.zza(zzagu)>
	//    8   20:return          
	}

	private final zzagu zzboa;
}
