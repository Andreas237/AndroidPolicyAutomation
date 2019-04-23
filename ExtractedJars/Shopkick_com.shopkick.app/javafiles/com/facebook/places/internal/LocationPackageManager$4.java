// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;

import com.facebook.FacebookSdk;
import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.places.internal:
//			LocationPackageManager, LocationPackage, ScannerFactory, WifiScanner, 
//			LocationPackageRequestParams

static final class LocationPackageManager$4
	implements Callable
{

	public LocationPackage call()
		throws Exception
	{
		LocationPackage locationpackage = new LocationPackage();
	//    0    0:new             #28  <Class LocationPackage>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void LocationPackage()>
	//    3    7:astore_1        
		WifiScanner wifiscanner = ScannerFactory.newWifiScanner(FacebookSdk.getApplicationContext(), val$requestParams);
	//    4    8:invokestatic    #35  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    5   11:aload_0         
	//    6   12:getfield        #18  <Field LocationPackageRequestParams val$requestParams>
	//    7   15:invokestatic    #41  <Method WifiScanner ScannerFactory.newWifiScanner(android.content.Context, LocationPackageRequestParams)>
	//    8   18:astore_2        
		wifiscanner.initAndCheckEligibility();
	//    9   19:aload_2         
	//   10   20:invokeinterface #46  <Method void WifiScanner.initAndCheckEligibility()>
		locationpackage.connectedWifi = wifiscanner.getConnectedWifi();
	//   11   25:aload_1         
	//   12   26:aload_2         
	//   13   27:invokeinterface #50  <Method WifiScanResult WifiScanner.getConnectedWifi()>
	//   14   32:putfield        #54  <Field WifiScanResult LocationPackage.connectedWifi>
		locationpackage.isWifiScanningEnabled = wifiscanner.isWifiScanningEnabled();
	//   15   35:aload_1         
	//   16   36:aload_2         
	//   17   37:invokeinterface #58  <Method boolean WifiScanner.isWifiScanningEnabled()>
	//   18   42:putfield        #61  <Field boolean LocationPackage.isWifiScanningEnabled>
		if(!locationpackage.isWifiScanningEnabled)
			break MISSING_BLOCK_LABEL_76;
	//   19   45:aload_1         
	//   20   46:getfield        #61  <Field boolean LocationPackage.isWifiScanningEnabled>
	//   21   49:ifeq            76
		locationpackage.ambientWifi = wifiscanner.getWifiScans();
	//   22   52:aload_1         
	//   23   53:aload_2         
	//   24   54:invokeinterface #65  <Method java.util.List WifiScanner.getWifiScans()>
	//   25   59:putfield        #69  <Field java.util.List LocationPackage.ambientWifi>
		return locationpackage;
	//   26   62:aload_1         
	//   27   63:areturn         
		Exception exception;
		exception;
	//   28   64:astore_2        
		LocationPackageManager.access$300("Exception scanning for wifi access points", ((Throwable) (exception)));
	//   29   65:ldc1            #71  <String "Exception scanning for wifi access points">
	//   30   67:aload_2         
	//   31   68:invokestatic    #75  <Method void LocationPackageManager.access$300(String, Throwable)>
		locationpackage.isWifiScanningEnabled = false;
	//   32   71:aload_1         
	//   33   72:iconst_0        
	//   34   73:putfield        #61  <Field boolean LocationPackage.isWifiScanningEnabled>
		return locationpackage;
	//   35   76:aload_1         
	//   36   77:areturn         
	}

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #79  <Method LocationPackage call()>
	//    2    4:areturn         
	}

	final LocationPackageRequestParams val$requestParams;

	LocationPackageManager$4(LocationPackageRequestParams locationpackagerequestparams)
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
