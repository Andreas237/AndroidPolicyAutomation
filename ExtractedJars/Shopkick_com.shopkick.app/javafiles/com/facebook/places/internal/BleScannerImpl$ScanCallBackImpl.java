// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.places.internal:
//			BleScannerImpl

private class BleScannerImpl$ScanCallBackImpl extends ScanCallback
{

	public void onBatchScanResults(List list)
	{
		super.onBatchScanResults(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void ScanCallback.onBatchScanResults(List)>
		List list1 = BleScannerImpl.access$300(BleScannerImpl.this);
	//    3    5:aload_0         
	//    4    6:getfield        #13  <Field BleScannerImpl this$0>
	//    5    9:invokestatic    #30  <Method List BleScannerImpl.access$300(BleScannerImpl)>
	//    6   12:astore_2        
		list1;
	//    7   13:aload_2         
		JVM INSTR monitorenter ;
	//    8   14:monitorenter    
		list = ((List) (list.iterator()));
	//    9   15:aload_1         
	//   10   16:invokeinterface #36  <Method Iterator List.iterator()>
	//   11   21:astore_1        
_L1:
		BluetoothScanResult bluetoothscanresult;
		do
		{
			if(!((Iterator) (list)).hasNext())
				break MISSING_BLOCK_LABEL_65;
	//   12   22:aload_1         
	//   13   23:invokeinterface #42  <Method boolean Iterator.hasNext()>
	//   14   28:ifeq            65
			bluetoothscanresult = BleScannerImpl.access$400((ScanResult)((Iterator) (list)).next());
	//   15   31:aload_1         
	//   16   32:invokeinterface #46  <Method Object Iterator.next()>
	//   17   37:checkcast       #48  <Class ScanResult>
	//   18   40:invokestatic    #52  <Method BluetoothScanResult BleScannerImpl.access$400(ScanResult)>
	//   19   43:astore_3        
		} while(bluetoothscanresult == null);
	//   20   44:aload_3         
	//   21   45:ifnull          22
		BleScannerImpl.access$300(BleScannerImpl.this).add(((Object) (bluetoothscanresult)));
	//   22   48:aload_0         
	//   23   49:getfield        #13  <Field BleScannerImpl this$0>
	//   24   52:invokestatic    #30  <Method List BleScannerImpl.access$300(BleScannerImpl)>
	//   25   55:aload_3         
	//   26   56:invokeinterface #56  <Method boolean List.add(Object)>
	//   27   61:pop             
		  goto _L1
	//*  28   62:goto            22
		list1;
	//   29   65:aload_2         
		JVM INSTR monitorexit ;
	//   30   66:monitorexit     
		return;
	//   31   67:return          
		list;
	//   32   68:astore_1        
		list1;
	//   33   69:aload_2         
		JVM INSTR monitorexit ;
	//   34   70:monitorexit     
		try
		{
			throw list;
	//   35   71:aload_1         
	//   36   72:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(List list)
	//*  37   73:astore_1        
		{
			BleScannerImpl.access$100("Exception in ble scan callback", ((Exception) (list)));
	//   38   74:ldc1            #58  <String "Exception in ble scan callback">
	//   39   76:aload_1         
	//   40   77:invokestatic    #62  <Method void BleScannerImpl.access$100(String, Exception)>
		}
		return;
	//   41   80:return          
	}

	public void onScanFailed(int i)
	{
		super.onScanFailed(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #68  <Method void ScanCallback.onScanFailed(int)>
		BleScannerImpl.access$202(BleScannerImpl.this, i);
	//    3    5:aload_0         
	//    4    6:getfield        #13  <Field BleScannerImpl this$0>
	//    5    9:iload_1         
	//    6   10:invokestatic    #72  <Method int BleScannerImpl.access$202(BleScannerImpl, int)>
	//    7   13:pop             
	//    8   14:return          
	}

	public void onScanResult(int i, ScanResult scanresult)
	{
		super.onScanResult(i, scanresult);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #76  <Method void ScanCallback.onScanResult(int, ScanResult)>
		List list = BleScannerImpl.access$300(BleScannerImpl.this);
	//    4    6:aload_0         
	//    5    7:getfield        #13  <Field BleScannerImpl this$0>
	//    6   10:invokestatic    #30  <Method List BleScannerImpl.access$300(BleScannerImpl)>
	//    7   13:astore_3        
		list;
	//    8   14:aload_3         
		JVM INSTR monitorenter ;
	//    9   15:monitorenter    
		scanresult = ((ScanResult) (BleScannerImpl.access$400(scanresult)));
	//   10   16:aload_2         
	//   11   17:invokestatic    #52  <Method BluetoothScanResult BleScannerImpl.access$400(ScanResult)>
	//   12   20:astore_2        
		if(scanresult == null)
			break MISSING_BLOCK_LABEL_39;
	//   13   21:aload_2         
	//   14   22:ifnull          39
		BleScannerImpl.access$300(BleScannerImpl.this).add(((Object) (scanresult)));
	//   15   25:aload_0         
	//   16   26:getfield        #13  <Field BleScannerImpl this$0>
	//   17   29:invokestatic    #30  <Method List BleScannerImpl.access$300(BleScannerImpl)>
	//   18   32:aload_2         
	//   19   33:invokeinterface #56  <Method boolean List.add(Object)>
	//   20   38:pop             
		list;
	//   21   39:aload_3         
		JVM INSTR monitorexit ;
	//   22   40:monitorexit     
		return;
	//   23   41:return          
		scanresult;
	//   24   42:astore_2        
		list;
	//   25   43:aload_3         
		JVM INSTR monitorexit ;
	//   26   44:monitorexit     
		try
		{
			throw scanresult;
	//   27   45:aload_2         
	//   28   46:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(ScanResult scanresult)
	//*  29   47:astore_2        
		{
			BleScannerImpl.access$100("Exception in ble scan callback", ((Exception) (scanresult)));
	//   30   48:ldc1            #58  <String "Exception in ble scan callback">
	//   31   50:aload_2         
	//   32   51:invokestatic    #62  <Method void BleScannerImpl.access$100(String, Exception)>
		}
		return;
	//   33   54:return          
	}

	final BleScannerImpl this$0;

	private BleScannerImpl$ScanCallBackImpl()
	{
		this$0 = BleScannerImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field BleScannerImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void ScanCallback()>
	//    5    9:return          
	}

	BleScannerImpl$ScanCallBackImpl(BleScannerImpl._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void BleScannerImpl$ScanCallBackImpl(BleScannerImpl)>
	//    3    5:return          
	}
}
