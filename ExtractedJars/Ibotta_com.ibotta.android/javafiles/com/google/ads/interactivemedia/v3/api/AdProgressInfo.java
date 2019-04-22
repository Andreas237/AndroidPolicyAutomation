// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.api;


public interface AdProgressInfo
{

	public abstract double getAdBreakDuration();

	public abstract int getAdPosition();

	public abstract double getCurrentTime();

	public abstract double getDuration();

	public abstract int getTotalAds();
}
