// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.source.dash.manifest.RangedUri;

public interface DashSegmentIndex
{

	public abstract long getDurationUs(long l, long l1);

	public abstract long getFirstSegmentNum();

	public abstract int getSegmentCount(long l);

	public abstract long getSegmentNum(long l, long l1);

	public abstract RangedUri getSegmentUrl(long l);

	public abstract long getTimeUs(long l);

	public abstract boolean isExplicit();

	public static final int INDEX_UNBOUNDED = -1;
}
