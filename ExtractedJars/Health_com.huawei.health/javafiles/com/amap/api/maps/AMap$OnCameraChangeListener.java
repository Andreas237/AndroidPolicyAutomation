// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;

import com.amap.api.maps.model.CameraPosition;

// Referenced classes of package com.amap.api.maps:
//			AMap

public static interface AMap$OnCameraChangeListener
{

	public abstract void onCameraChange(CameraPosition cameraposition);

	public abstract void onCameraChangeFinish(CameraPosition cameraposition);
}
