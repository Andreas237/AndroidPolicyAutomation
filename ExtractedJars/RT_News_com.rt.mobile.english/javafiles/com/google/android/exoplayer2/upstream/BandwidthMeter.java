// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;


public interface BandwidthMeter
{
	public static interface EventListener
	{

		public abstract void onBandwidthSample(int i, long l, long l1);
	}


	public abstract long getBitrateEstimate();
}
