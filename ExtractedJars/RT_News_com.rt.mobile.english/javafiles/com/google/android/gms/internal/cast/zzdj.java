// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.MediaQueueItem;

public interface zzdj
{

	public abstract void onAdBreakStatusUpdated();

	public abstract void onMetadataUpdated();

	public abstract void onPreloadStatusUpdated();

	public abstract void onQueueStatusUpdated();

	public abstract void onStatusUpdated();

	public abstract void zza(int ai[]);

	public abstract void zza(int ai[], int i);

	public abstract void zzb(int ai[]);

	public abstract void zzb(MediaQueueItem amediaqueueitem[]);

	public abstract void zzc(int ai[]);
}
