// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;

import android.content.*;

// Referenced classes of package com.facebook.places.internal:
//			WifiScannerImpl

private class WifiScannerImpl$ScanResultBroadcastReceiver extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		if(intent != null && "android.net.wifi.SCAN_RESULTS".equals(((Object) (intent.getAction()))))
	//*   0    0:aload_2         
	//*   1    1:ifnull          51
	//*   2    4:ldc1            #24  <String "android.net.wifi.SCAN_RESULTS">
	//*   3    6:aload_2         
	//*   4    7:invokevirtual   #30  <Method String Intent.getAction()>
	//*   5   10:invokevirtual   #36  <Method boolean String.equals(Object)>
	//*   6   13:ifeq            51
		{
			synchronized(WifiScannerImpl.access$100(WifiScannerImpl.this))
	//*   7   16:aload_0         
	//*   8   17:getfield        #13  <Field WifiScannerImpl this$0>
	//*   9   20:invokestatic    #40  <Method Object WifiScannerImpl.access$100(WifiScannerImpl)>
	//*  10   23:astore_1        
	//*  11   24:aload_1         
	//*  12   25:monitorenter    
			{
				WifiScannerImpl.access$100(WifiScannerImpl.this).notify();
	//   13   26:aload_0         
	//   14   27:getfield        #13  <Field WifiScannerImpl this$0>
	//   15   30:invokestatic    #40  <Method Object WifiScannerImpl.access$100(WifiScannerImpl)>
	//   16   33:invokevirtual   #45  <Method void Object.notify()>
			}
	//   17   36:aload_1         
	//   18   37:monitorexit     
			WifiScannerImpl.access$200(WifiScannerImpl.this);
	//   19   38:aload_0         
	//   20   39:getfield        #13  <Field WifiScannerImpl this$0>
	//   21   42:invokestatic    #48  <Method void WifiScannerImpl.access$200(WifiScannerImpl)>
			return;
	//   22   45:return          
		} else
	//*  23   46:astore_2        
	//*  24   47:aload_1         
	//*  25   48:monitorexit     
	//*  26   49:aload_2         
	//*  27   50:athrow          
		{
			return;
	//   28   51:return          
		}
		intent;
		context;
		JVM INSTR monitorexit ;
		throw intent;
	}

	final WifiScannerImpl this$0;

	private WifiScannerImpl$ScanResultBroadcastReceiver()
	{
		this$0 = WifiScannerImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field WifiScannerImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void BroadcastReceiver()>
	//    5    9:return          
	}

	WifiScannerImpl$ScanResultBroadcastReceiver(WifiScannerImpl._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void WifiScannerImpl$ScanResultBroadcastReceiver(WifiScannerImpl)>
	//    3    5:return          
	}
}
