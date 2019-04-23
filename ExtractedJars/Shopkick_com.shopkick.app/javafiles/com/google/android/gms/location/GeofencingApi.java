// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//			GeofencingRequest

public interface GeofencingApi
{

	public abstract PendingResult addGeofences(GoogleApiClient googleapiclient, GeofencingRequest geofencingrequest, PendingIntent pendingintent);

	public abstract PendingResult addGeofences(GoogleApiClient googleapiclient, List list, PendingIntent pendingintent);

	public abstract PendingResult removeGeofences(GoogleApiClient googleapiclient, PendingIntent pendingintent);

	public abstract PendingResult removeGeofences(GoogleApiClient googleapiclient, List list);
}
