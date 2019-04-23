// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.location.Location;

public interface LocationSource
{
	public static interface OnLocationChangedListener
	{

		public abstract void onLocationChanged(Location location);
	}


	public abstract void activate(OnLocationChangedListener onlocationchangedlistener);

	public abstract void deactivate();
}
