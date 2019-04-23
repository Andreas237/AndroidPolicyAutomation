// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.hls:
//			HlsMasterPlaylist, Variant

public interface HlsTrackSelector
{
	public static interface Output
	{

		public abstract void adaptiveTrack(HlsMasterPlaylist hlsmasterplaylist, Variant avariant[]);

		public abstract void fixedTrack(HlsMasterPlaylist hlsmasterplaylist, Variant variant);
	}


	public abstract void selectTracks(HlsMasterPlaylist hlsmasterplaylist, Output output)
		throws IOException;
}
