// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;

import android.location.Location;
import java.util.List;

// Referenced classes of package com.facebook.places.internal:
//			WifiScanResult

public class LocationPackage
{

	public LocationPackage()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public List ambientBluetoothLe;
	public List ambientWifi;
	public WifiScanResult connectedWifi;
	public boolean isBluetoothScanningEnabled;
	public boolean isWifiScanningEnabled;
	public Location location;
	public ScannerException.Type locationError;
}
