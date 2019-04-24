// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.location;

import android.location.LocationListener;

// Referenced classes of package com.amap.api.location:
//			AMapLocation

public interface AMapLocationListener
	extends LocationListener
{

	public abstract void onLocationChanged(AMapLocation amaplocation);
}
