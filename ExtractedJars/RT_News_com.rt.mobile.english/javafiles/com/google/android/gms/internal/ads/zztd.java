// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzts, zztt, zzla, zztc

final class zztd
	implements zzts
{

	zztd(zztc zztc, String s, String s1)
	{
		val$name = s;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #13  <Field String val$name>
		zzbny = s1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #15  <Field String zzbny>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #18  <Method void Object()>
	//    8   14:return          
	}

	public final void zzb(zztt zztt1)
		throws RemoteException
	{
		if(zztt1.zzboe != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #29  <Field zzla zztt.zzboe>
	//*   2    4:ifnull          24
			zztt1.zzboe.onAppEvent(val$name, zzbny);
	//    3    7:aload_1         
	//    4    8:getfield        #29  <Field zzla zztt.zzboe>
	//    5   11:aload_0         
	//    6   12:getfield        #13  <Field String val$name>
	//    7   15:aload_0         
	//    8   16:getfield        #15  <Field String zzbny>
	//    9   19:invokeinterface #35  <Method void zzla.onAppEvent(String, String)>
	//   10   24:return          
	}

	private final String val$name;
	private final String zzbny;
}
