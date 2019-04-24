// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.ads.identifier:
//			AdvertisingIdClient

static final class AdvertisingIdClient$zza extends Thread
{

	private final void disconnect()
	{
		AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)zzm.get();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field WeakReference zzm>
	//    2    4:invokevirtual   #49  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class AdvertisingIdClient>
	//    4   10:astore_1        
		if(advertisingidclient != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          24
		{
			advertisingidclient.finish();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #52  <Method void AdvertisingIdClient.finish()>
			zzp = true;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:putfield        #40  <Field boolean zzp>
		}
	//   12   24:return          
	}

	public final void run()
	{
		InterruptedException interruptedexception;
		try
		{
			if(!zzo.await(zzn, TimeUnit.MILLISECONDS))
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field CountDownLatch zzo>
	//*   2    4:aload_0         
	//*   3    5:getfield        #31  <Field long zzn>
	//*   4    8:getstatic       #61  <Field TimeUnit TimeUnit.MILLISECONDS>
	//*   5   11:invokevirtual   #65  <Method boolean CountDownLatch.await(long, TimeUnit)>
	//*   6   14:ifne            21
				disconnect();
	//    7   17:aload_0         
	//    8   18:invokespecial   #67  <Method void disconnect()>
			return;
	//    9   21:return          
		}
	//*  10   22:aload_0         
	//*  11   23:invokespecial   #67  <Method void disconnect()>
	//*  12   26:return          
		// Misplaced declaration of an exception variable
		catch(InterruptedException interruptedexception)
		{
			disconnect();
		}
	//*  13   27:astore_1        
	//*  14   28:goto            22
	}

	private WeakReference zzm;
	private long zzn;
	CountDownLatch zzo;
	boolean zzp;

	public AdvertisingIdClient$zza(AdvertisingIdClient advertisingidclient, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Thread()>
		zzm = new WeakReference(((Object) (advertisingidclient)));
	//    2    4:aload_0         
	//    3    5:new             #24  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #27  <Method void WeakReference(Object)>
	//    7   13:putfield        #29  <Field WeakReference zzm>
		zzn = l;
	//    8   16:aload_0         
	//    9   17:lload_2         
	//   10   18:putfield        #31  <Field long zzn>
		zzo = new CountDownLatch(1);
	//   11   21:aload_0         
	//   12   22:new             #33  <Class CountDownLatch>
	//   13   25:dup             
	//   14   26:iconst_1        
	//   15   27:invokespecial   #36  <Method void CountDownLatch(int)>
	//   16   30:putfield        #38  <Field CountDownLatch zzo>
		zzp = false;
	//   17   33:aload_0         
	//   18   34:iconst_0        
	//   19   35:putfield        #40  <Field boolean zzp>
		start();
	//   20   38:aload_0         
	//   21   39:invokevirtual   #43  <Method void start()>
	//   22   42:return          
	}
}
