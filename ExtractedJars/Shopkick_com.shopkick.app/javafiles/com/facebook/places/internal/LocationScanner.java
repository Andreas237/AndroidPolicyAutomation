// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;

import android.location.Location;

// Referenced classes of package com.facebook.places.internal:
//			ScannerException

public interface LocationScanner
{

	public abstract Location getLocation()
		throws ScannerException;

	public abstract void initAndCheckEligibility()
		throws ScannerException;
}
