// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public interface CastRemoteDisplayApi
{

	public abstract PendingResult startRemoteDisplay(GoogleApiClient googleapiclient, String s);

	public abstract PendingResult stopRemoteDisplay(GoogleApiClient googleapiclient);
}
