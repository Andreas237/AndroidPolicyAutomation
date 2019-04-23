// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.smoothstreaming;


// Referenced classes of package com.google.android.exoplayer.smoothstreaming:
//			SmoothStreamingTrackSelector, SmoothStreamingManifest

public static interface SmoothStreamingTrackSelector$Output
{

	public abstract void adaptiveTrack(SmoothStreamingManifest smoothstreamingmanifest, int i, int ai[]);

	public abstract void fixedTrack(SmoothStreamingManifest smoothstreamingmanifest, int i, int j);
}
