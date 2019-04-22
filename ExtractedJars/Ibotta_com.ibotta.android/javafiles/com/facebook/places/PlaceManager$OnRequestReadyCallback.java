// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places;

import com.facebook.GraphRequest;

// Referenced classes of package com.facebook.places:
//			PlaceManager

public static interface PlaceManager$OnRequestReadyCallback
{

	public abstract void onLocationError(PlaceManager.LocationError locationerror);

	public abstract void onRequestReady(GraphRequest graphrequest);
}
