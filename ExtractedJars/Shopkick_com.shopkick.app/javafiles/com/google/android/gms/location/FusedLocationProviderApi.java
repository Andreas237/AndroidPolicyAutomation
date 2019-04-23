// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

// Referenced classes of package com.google.android.gms.location:
//			LocationAvailability, LocationCallback, LocationListener, LocationRequest

public interface FusedLocationProviderApi
{

	public abstract PendingResult flushLocations(GoogleApiClient googleapiclient);

	public abstract Location getLastLocation(GoogleApiClient googleapiclient);

	public abstract LocationAvailability getLocationAvailability(GoogleApiClient googleapiclient);

	public abstract PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, PendingIntent pendingintent);

	public abstract PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, LocationCallback locationcallback);

	public abstract PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, LocationListener locationlistener);

	public abstract PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, PendingIntent pendingintent);

	public abstract PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationCallback locationcallback, Looper looper);

	public abstract PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener);

	public abstract PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener, Looper looper);

	public abstract PendingResult setMockLocation(GoogleApiClient googleapiclient, Location location);

	public abstract PendingResult setMockMode(GoogleApiClient googleapiclient, boolean flag);

	public static final String KEY_LOCATION_CHANGED = "com.google.android.location.LOCATION";
	public static final String KEY_MOCK_LOCATION = "mockLocation";
}
