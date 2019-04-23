// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;

import java.util.List;

// Referenced classes of package com.facebook.places.internal:
//			ScannerException, WifiScanResult

public interface WifiScanner
{

	public abstract WifiScanResult getConnectedWifi()
		throws ScannerException;

	public abstract List getWifiScans()
		throws ScannerException;

	public abstract void initAndCheckEligibility()
		throws ScannerException;

	public abstract boolean isWifiScanningEnabled();
}
