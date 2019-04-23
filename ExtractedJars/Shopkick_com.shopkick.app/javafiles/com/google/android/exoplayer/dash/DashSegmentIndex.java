// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash;

import com.google.android.exoplayer.dash.mpd.RangedUri;

public interface DashSegmentIndex
{

	public abstract long getDurationUs(int i, long l);

	public abstract int getFirstSegmentNum();

	public abstract int getLastSegmentNum(long l);

	public abstract int getSegmentNum(long l, long l1);

	public abstract RangedUri getSegmentUrl(int i);

	public abstract long getTimeUs(int i);

	public abstract boolean isExplicit();

	public static final int INDEX_UNBOUNDED = -1;
}
