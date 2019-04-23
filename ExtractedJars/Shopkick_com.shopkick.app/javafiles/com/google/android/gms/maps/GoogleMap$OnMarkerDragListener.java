// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.Marker;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

public static interface GoogleMap$OnMarkerDragListener
{

	public abstract void onMarkerDrag(Marker marker);

	public abstract void onMarkerDragEnd(Marker marker);

	public abstract void onMarkerDragStart(Marker marker);
}
