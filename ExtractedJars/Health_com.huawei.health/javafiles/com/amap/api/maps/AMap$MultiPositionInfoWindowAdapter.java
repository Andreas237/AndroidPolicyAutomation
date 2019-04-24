// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;

import android.view.View;
import com.amap.api.maps.model.Marker;

// Referenced classes of package com.amap.api.maps:
//			AMap

public static interface AMap$MultiPositionInfoWindowAdapter
	extends AMap.InfoWindowAdapter
{

	public abstract View getInfoWindowClick(Marker marker);

	public abstract View getOverturnInfoWindow(Marker marker);

	public abstract View getOverturnInfoWindowClick(Marker marker);
}
