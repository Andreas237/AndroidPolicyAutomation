// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;

import android.content.Context;

// Referenced classes of package com.facebook.places.internal:
//			BleScannerImpl, BleScannerLegacy, LocationScannerImpl, WifiScannerImpl, 
//			LocationPackageRequestParams, BleScanner, LocationScanner, WifiScanner

public class ScannerFactory
{

	public ScannerFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static BleScanner newBleScanner(Context context, LocationPackageRequestParams locationpackagerequestparams)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          18
			return ((BleScanner) (new BleScannerImpl(context, locationpackagerequestparams)));
	//    3    8:new             #25  <Class BleScannerImpl>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:invokespecial   #28  <Method void BleScannerImpl(Context, LocationPackageRequestParams)>
	//    8   17:areturn         
		else
			return ((BleScanner) (new BleScannerLegacy()));
	//    9   18:new             #30  <Class BleScannerLegacy>
	//   10   21:dup             
	//   11   22:invokespecial   #31  <Method void BleScannerLegacy()>
	//   12   25:areturn         
	}

	public static LocationScanner newLocationScanner(Context context, LocationPackageRequestParams locationpackagerequestparams)
	{
		return ((LocationScanner) (new LocationScannerImpl(context, locationpackagerequestparams)));
	//    0    0:new             #35  <Class LocationScannerImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #36  <Method void LocationScannerImpl(Context, LocationPackageRequestParams)>
	//    5    9:areturn         
	}

	public static WifiScanner newWifiScanner(Context context, LocationPackageRequestParams locationpackagerequestparams)
	{
		return ((WifiScanner) (new WifiScannerImpl(context, locationpackagerequestparams)));
	//    0    0:new             #40  <Class WifiScannerImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #41  <Method void WifiScannerImpl(Context, LocationPackageRequestParams)>
	//    5    9:areturn         
	}

	public static final int OS_VERSION_JELLY_BEAN_MR1 = 17;
	public static final int OS_VERSION_JELLY_BEAN_MR2 = 18;
	public static final int OS_VERSION_LOLLIPOP = 21;
}
