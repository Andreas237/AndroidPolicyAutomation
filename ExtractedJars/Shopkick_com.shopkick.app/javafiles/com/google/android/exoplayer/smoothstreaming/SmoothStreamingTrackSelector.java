// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.smoothstreaming;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.smoothstreaming:
//			SmoothStreamingManifest

public interface SmoothStreamingTrackSelector
{
	public static interface Output
	{

		public abstract void adaptiveTrack(SmoothStreamingManifest smoothstreamingmanifest, int i, int ai[]);

		public abstract void fixedTrack(SmoothStreamingManifest smoothstreamingmanifest, int i, int j);
	}


	public abstract void selectTracks(SmoothStreamingManifest smoothstreamingmanifest, Output output)
		throws IOException;
}
