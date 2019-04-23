// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;

import java.util.Comparator;

// Referenced classes of package com.facebook.places.internal:
//			BleScannerImpl, BluetoothScanResult

class BleScannerImpl$2
	implements Comparator
{

	public int compare(BluetoothScanResult bluetoothscanresult, BluetoothScanResult bluetoothscanresult1)
	{
		return bluetoothscanresult1.rssi - bluetoothscanresult.rssi;
	//    0    0:aload_2         
	//    1    1:getfield        #30  <Field int BluetoothScanResult.rssi>
	//    2    4:aload_1         
	//    3    5:getfield        #30  <Field int BluetoothScanResult.rssi>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((BluetoothScanResult)obj, (BluetoothScanResult)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class BluetoothScanResult>
	//    3    5:aload_2         
	//    4    6:checkcast       #26  <Class BluetoothScanResult>
	//    5    9:invokevirtual   #33  <Method int compare(BluetoothScanResult, BluetoothScanResult)>
	//    6   12:ireturn         
	}

	final BleScannerImpl this$0;

	BleScannerImpl$2()
	{
		this$0 = BleScannerImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field BleScannerImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
