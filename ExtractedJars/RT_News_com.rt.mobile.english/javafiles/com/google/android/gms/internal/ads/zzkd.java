// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

public class zzkd extends AdListener
{

	public zzkd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void AdListener()>
	//    2    4:aload_0         
	//    3    5:new             #15  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void Object()>
	//    6   12:putfield        #18  <Field Object lock>
	//    7   15:return          
	}

	public void onAdClosed()
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(zzasi != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #22  <Field AdListener zzasi>
	//*   7   11:ifnull          21
				zzasi.onAdClosed();
	//    8   14:aload_0         
	//    9   15:getfield        #22  <Field AdListener zzasi>
	//   10   18:invokevirtual   #24  <Method void AdListener.onAdClosed()>
		}
	//   11   21:aload_1         
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		exception;
	//   14   24:astore_2        
		obj;
	//   15   25:aload_1         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		throw exception;
	//   17   27:aload_2         
	//   18   28:athrow          
	}

	public void onAdFailedToLoad(int i)
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(zzasi != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #22  <Field AdListener zzasi>
	//*   7   11:ifnull          22
				zzasi.onAdFailedToLoad(i);
	//    8   14:aload_0         
	//    9   15:getfield        #22  <Field AdListener zzasi>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #28  <Method void AdListener.onAdFailedToLoad(int)>
		}
	//   12   22:aload_2         
	//   13   23:monitorexit     
		return;
	//   14   24:return          
		exception;
	//   15   25:astore_3        
		obj;
	//   16   26:aload_2         
		JVM INSTR monitorexit ;
	//   17   27:monitorexit     
		throw exception;
	//   18   28:aload_3         
	//   19   29:athrow          
	}

	public void onAdLeftApplication()
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(zzasi != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #22  <Field AdListener zzasi>
	//*   7   11:ifnull          21
				zzasi.onAdLeftApplication();
	//    8   14:aload_0         
	//    9   15:getfield        #22  <Field AdListener zzasi>
	//   10   18:invokevirtual   #31  <Method void AdListener.onAdLeftApplication()>
		}
	//   11   21:aload_1         
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		exception;
	//   14   24:astore_2        
		obj;
	//   15   25:aload_1         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		throw exception;
	//   17   27:aload_2         
	//   18   28:athrow          
	}

	public void onAdLoaded()
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(zzasi != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #22  <Field AdListener zzasi>
	//*   7   11:ifnull          21
				zzasi.onAdLoaded();
	//    8   14:aload_0         
	//    9   15:getfield        #22  <Field AdListener zzasi>
	//   10   18:invokevirtual   #34  <Method void AdListener.onAdLoaded()>
		}
	//   11   21:aload_1         
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		exception;
	//   14   24:astore_2        
		obj;
	//   15   25:aload_1         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		throw exception;
	//   17   27:aload_2         
	//   18   28:athrow          
	}

	public void onAdOpened()
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(zzasi != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #22  <Field AdListener zzasi>
	//*   7   11:ifnull          21
				zzasi.onAdOpened();
	//    8   14:aload_0         
	//    9   15:getfield        #22  <Field AdListener zzasi>
	//   10   18:invokevirtual   #37  <Method void AdListener.onAdOpened()>
		}
	//   11   21:aload_1         
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		exception;
	//   14   24:astore_2        
		obj;
	//   15   25:aload_1         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		throw exception;
	//   17   27:aload_2         
	//   18   28:athrow          
	}

	public final void zza(AdListener adlistener)
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzasi = adlistener;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #22  <Field AdListener zzasi>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		adlistener;
	//   11   15:astore_1        
		obj;
	//   12   16:aload_2         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw adlistener;
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	private final Object lock = new Object();
	private AdListener zzasi;
}
