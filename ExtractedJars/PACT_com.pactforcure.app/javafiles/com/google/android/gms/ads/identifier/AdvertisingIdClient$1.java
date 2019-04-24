// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.identifier;


// Referenced classes of package com.google.android.gms.ads.identifier:
//			AdvertisingIdClient, zza

class AdvertisingIdClient$1 extends Thread
{

	public void run()
	{
		(new zza()).zzu(zzsk);
	//    0    0:new             #22  <Class zza>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void zza()>
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field String zzsk>
	//    5   11:invokevirtual   #27  <Method void zza.zzu(String)>
	//    6   14:return          
	}

	final String zzsk;

	AdvertisingIdClient$1(AdvertisingIdClient advertisingidclient, String s)
	{
		zzsk = s;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field String zzsk>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Thread()>
	//    5    9:return          
	}
}
