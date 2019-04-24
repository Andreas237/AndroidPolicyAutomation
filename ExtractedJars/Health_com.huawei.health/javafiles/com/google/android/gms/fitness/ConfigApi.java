// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.fitness;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;

public interface ConfigApi
{

	public abstract PendingResult createCustomDataType(GoogleApiClient googleapiclient, DataTypeCreateRequest datatypecreaterequest);

	public abstract PendingResult disableFit(GoogleApiClient googleapiclient);

	public abstract PendingResult readDataType(GoogleApiClient googleapiclient, String s);
}
