// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;

import java.util.List;

// Referenced classes of package com.facebook.places.internal:
//			ScannerException

public interface BleScanner
{

	public abstract int getErrorCode();

	public abstract List getScanResults();

	public abstract void initAndCheckEligibility()
		throws ScannerException;

	public abstract void startScanning()
		throws ScannerException;

	public abstract void stopScanning()
		throws ScannerException;
}
