// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.ads.identifier:
//			AdvertisingIdClient

static class AdvertisingIdClient$zza extends Thread
{

	private void disconnect()
	{
		AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)zzsl.get();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field WeakReference zzsl>
	//    2    4:invokevirtual   #48  <Method Object WeakReference.get()>
	//    3    7:checkcast       #6   <Class AdvertisingIdClient>
	//    4   10:astore_1        
		if(advertisingidclient != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          24
		{
			advertisingidclient.finish();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #51  <Method void AdvertisingIdClient.finish()>
			zzso = true;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:putfield        #39  <Field boolean zzso>
		}
	//   12   24:return          
	}

	public void cancel()
	{
		zzsn.countDown();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field CountDownLatch zzsn>
	//    2    4:invokevirtual   #55  <Method void CountDownLatch.countDown()>
	//    3    7:return          
	}

	public void run()
	{
		try
		{
			if(!zzsn.await(zzsm, TimeUnit.MILLISECONDS))
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field CountDownLatch zzsn>
	//*   2    4:aload_0         
	//*   3    5:getfield        #30  <Field long zzsm>
	//*   4    8:getstatic       #64  <Field TimeUnit TimeUnit.MILLISECONDS>
	//*   5   11:invokevirtual   #68  <Method boolean CountDownLatch.await(long, TimeUnit)>
	//*   6   14:ifne            21
				disconnect();
	//    7   17:aload_0         
	//    8   18:invokespecial   #70  <Method void disconnect()>
			return;
	//    9   21:return          
		}
		catch(InterruptedException interruptedexception)
	//*  10   22:astore_1        
		{
			disconnect();
	//   11   23:aload_0         
	//   12   24:invokespecial   #70  <Method void disconnect()>
		}
	//   13   27:return          
	}

	public boolean zzby()
	{
		return zzso;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field boolean zzso>
	//    2    4:ireturn         
	}

	private WeakReference zzsl;
	private long zzsm;
	CountDownLatch zzsn;
	boolean zzso;

	public AdvertisingIdClient$zza(AdvertisingIdClient advertisingidclient, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Thread()>
		zzsl = new WeakReference(((Object) (advertisingidclient)));
	//    2    4:aload_0         
	//    3    5:new             #23  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #26  <Method void WeakReference(Object)>
	//    7   13:putfield        #28  <Field WeakReference zzsl>
		zzsm = l;
	//    8   16:aload_0         
	//    9   17:lload_2         
	//   10   18:putfield        #30  <Field long zzsm>
		zzsn = new CountDownLatch(1);
	//   11   21:aload_0         
	//   12   22:new             #32  <Class CountDownLatch>
	//   13   25:dup             
	//   14   26:iconst_1        
	//   15   27:invokespecial   #35  <Method void CountDownLatch(int)>
	//   16   30:putfield        #37  <Field CountDownLatch zzsn>
		zzso = false;
	//   17   33:aload_0         
	//   18   34:iconst_0        
	//   19   35:putfield        #39  <Field boolean zzso>
		start();
	//   20   38:aload_0         
	//   21   39:invokevirtual   #42  <Method void start()>
	//   22   42:return          
	}
}
