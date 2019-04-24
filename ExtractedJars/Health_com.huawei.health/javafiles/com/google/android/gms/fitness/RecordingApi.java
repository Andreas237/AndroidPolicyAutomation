// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;

public interface RecordingApi
{

	public abstract PendingResult listSubscriptions(GoogleApiClient googleapiclient);

	public abstract PendingResult listSubscriptions(GoogleApiClient googleapiclient, DataType datatype);

	public abstract PendingResult subscribe(GoogleApiClient googleapiclient, DataSource datasource);

	public abstract PendingResult subscribe(GoogleApiClient googleapiclient, DataType datatype);

	public abstract PendingResult unsubscribe(GoogleApiClient googleapiclient, DataSource datasource);

	public abstract PendingResult unsubscribe(GoogleApiClient googleapiclient, DataType datatype);

	public abstract PendingResult unsubscribe(GoogleApiClient googleapiclient, Subscription subscription);
}
