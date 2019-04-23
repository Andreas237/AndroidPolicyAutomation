// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

// Referenced classes of package com.google.android.gms.location:
//			ActivityTransitionRequest

public interface ActivityRecognitionApi
{

	public abstract PendingResult removeActivityUpdates(GoogleApiClient googleapiclient, PendingIntent pendingintent);

	public abstract PendingResult requestActivityUpdates(GoogleApiClient googleapiclient, long l, PendingIntent pendingintent);

	public abstract PendingResult zza(GoogleApiClient googleapiclient, PendingIntent pendingintent);

	public abstract PendingResult zza(GoogleApiClient googleapiclient, ActivityTransitionRequest activitytransitionrequest, PendingIntent pendingintent);
}
