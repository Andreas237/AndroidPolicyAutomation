// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;

public interface StreetViewLifecycleDelegate
	extends LifecycleDelegate
{

	public abstract void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback);
}
