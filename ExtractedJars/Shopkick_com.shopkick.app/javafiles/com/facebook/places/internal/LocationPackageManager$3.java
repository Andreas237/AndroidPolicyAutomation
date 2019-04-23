// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;

import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import java.util.Locale;
import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.places.internal:
//			LocationPackageManager, LocationPackage, ScannerFactory, BleScanner, 
//			LocationPackageRequestParams

static final class LocationPackageManager$3
	implements Callable
{

	public LocationPackage call()
		throws Exception
	{
		LocationPackage locationpackage = new LocationPackage();
	//    0    0:new             #28  <Class LocationPackage>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void LocationPackage()>
	//    3    7:astore_2        
		BleScanner blescanner;
		blescanner = ScannerFactory.newBleScanner(FacebookSdk.getApplicationContext(), val$requestParams);
	//    4    8:invokestatic    #35  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    5   11:aload_0         
	//    6   12:getfield        #18  <Field LocationPackageRequestParams val$requestParams>
	//    7   15:invokestatic    #41  <Method BleScanner ScannerFactory.newBleScanner(android.content.Context, LocationPackageRequestParams)>
	//    8   18:astore_3        
		blescanner.initAndCheckEligibility();
	//    9   19:aload_3         
	//   10   20:invokeinterface #46  <Method void BleScanner.initAndCheckEligibility()>
		blescanner.startScanning();
	//   11   25:aload_3         
	//   12   26:invokeinterface #49  <Method void BleScanner.startScanning()>
		int i;
		Exception exception1;
		try
		{
			Thread.sleep(val$requestParams.getBluetoothScanDurationMs());
	//   13   31:aload_0         
	//   14   32:getfield        #18  <Field LocationPackageRequestParams val$requestParams>
	//   15   35:invokevirtual   #55  <Method long LocationPackageRequestParams.getBluetoothScanDurationMs()>
	//   16   38:invokestatic    #61  <Method void Thread.sleep(long)>
		}
	//*  17   41:aload_3         
	//*  18   42:invokeinterface #64  <Method void BleScanner.stopScanning()>
	//*  19   47:aload_3         
	//*  20   48:invokeinterface #68  <Method int BleScanner.getErrorCode()>
	//*  21   53:istore_1        
	//*  22   54:iload_1         
	//*  23   55:ifne            75
	//*  24   58:aload_2         
	//*  25   59:aload_3         
	//*  26   60:invokeinterface #72  <Method java.util.List BleScanner.getScanResults()>
	//*  27   65:putfield        #76  <Field java.util.List LocationPackage.ambientBluetoothLe>
	//*  28   68:aload_2         
	//*  29   69:iconst_1        
	//*  30   70:putfield        #80  <Field boolean LocationPackage.isBluetoothScanningEnabled>
	//*  31   73:aload_2         
	//*  32   74:areturn         
	//*  33   75:invokestatic    #84  <Method boolean FacebookSdk.isDebugEnabled()>
	//*  34   78:ifeq            105
	//*  35   81:ldc1            #86  <String "LocationPackageManager">
	//*  36   83:invokestatic    #92  <Method Locale Locale.getDefault()>
	//*  37   86:ldc1            #94  <String "Bluetooth LE scan failed with error: %d">
	//*  38   88:iconst_1        
	//*  39   89:anewarray       Object[]
	//*  40   92:dup             
	//*  41   93:iconst_0        
	//*  42   94:iload_1         
	//*  43   95:invokestatic    #100 <Method Integer Integer.valueOf(int)>
	//*  44   98:aastore         
	//*  45   99:invokestatic    #106 <Method String String.format(Locale, String, Object[])>
	//*  46  102:invokestatic    #112 <Method void Utility.logd(String, String)>
	//*  47  105:aload_2         
	//*  48  106:iconst_0        
	//*  49  107:putfield        #80  <Field boolean LocationPackage.isBluetoothScanningEnabled>
	//*  50  110:aload_2         
	//*  51  111:areturn         
	//*  52  112:astore          4
	//*  53  114:aload_3         
	//*  54  115:invokeinterface #64  <Method void BleScanner.stopScanning()>
	//*  55  120:aload           4
	//*  56  122:athrow          
	//*  57  123:astore_3        
	//*  58  124:ldc1            #114 <String "Exception scanning for bluetooth beacons">
	//*  59  126:aload_3         
	//*  60  127:invokestatic    #118 <Method void LocationPackageManager.access$300(String, Throwable)>
	//*  61  130:aload_2         
	//*  62  131:iconst_0        
	//*  63  132:putfield        #80  <Field boolean LocationPackage.isBluetoothScanningEnabled>
	//*  64  135:aload_2         
	//*  65  136:areturn         
		catch(Exception exception2) { }
	//   66  137:astore          4
		blescanner.stopScanning();
		i = blescanner.getErrorCode();
		if(i != 0)
			break MISSING_BLOCK_LABEL_75;
		locationpackage.ambientBluetoothLe = blescanner.getScanResults();
		locationpackage.isBluetoothScanningEnabled = true;
		return locationpackage;
		if(FacebookSdk.isDebugEnabled())
			Utility.logd("LocationPackageManager", String.format(Locale.getDefault(), "Bluetooth LE scan failed with error: %d", new Object[] {
				Integer.valueOf(i)
			}));
		locationpackage.isBluetoothScanningEnabled = false;
		return locationpackage;
		exception1;
		try
		{
			blescanner.stopScanning();
			throw exception1;
		}
		catch(Exception exception)
		{
			LocationPackageManager.access$300("Exception scanning for bluetooth beacons", ((Throwable) (exception)));
		}
		locationpackage.isBluetoothScanningEnabled = false;
		return locationpackage;
	//*  67  139:goto            41
	}

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #122 <Method LocationPackage call()>
	//    2    4:areturn         
	}

	final LocationPackageRequestParams val$requestParams;

	LocationPackageManager$3(LocationPackageRequestParams locationpackagerequestparams)
	{
		val$requestParams = locationpackagerequestparams;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field LocationPackageRequestParams val$requestParams>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
