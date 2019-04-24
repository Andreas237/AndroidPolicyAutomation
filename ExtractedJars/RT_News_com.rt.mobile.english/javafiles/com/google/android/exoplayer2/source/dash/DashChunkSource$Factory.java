// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;

// Referenced classes of package com.google.android.exoplayer2.source.dash:
//			DashChunkSource

public static interface DashChunkSource$Factory
{

	public abstract DashChunkSource createDashChunkSource(LoaderErrorThrower loadererrorthrower, DashManifest dashmanifest, int i, int ai[], TrackSelection trackselection, int j, long l, boolean flag, boolean flag1, TrackEmsgHandler trackemsghandler);
}
