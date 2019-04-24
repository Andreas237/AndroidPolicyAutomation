// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.source.TrackGroup;

// Referenced classes of package com.google.android.exoplayer2.trackselection:
//			TrackSelection

public static interface TrackSelection$Factory
{

	public transient abstract TrackSelection createTrackSelection(TrackGroup trackgroup, int ai[]);
}
