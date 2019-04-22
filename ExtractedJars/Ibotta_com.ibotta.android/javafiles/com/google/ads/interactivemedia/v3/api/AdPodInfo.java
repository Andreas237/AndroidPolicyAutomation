// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.api;


public interface AdPodInfo
{

	public abstract int getAdPosition();

	public abstract double getMaxDuration();

	public abstract int getPodIndex();

	public abstract double getTimeOffset();

	public abstract int getTotalAds();

	public abstract boolean isBumper();
}
