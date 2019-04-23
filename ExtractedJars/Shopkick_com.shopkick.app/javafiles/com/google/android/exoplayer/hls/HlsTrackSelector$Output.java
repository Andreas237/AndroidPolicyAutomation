// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;


// Referenced classes of package com.google.android.exoplayer.hls:
//			HlsTrackSelector, HlsMasterPlaylist, Variant

public static interface HlsTrackSelector$Output
{

	public abstract void adaptiveTrack(HlsMasterPlaylist hlsmasterplaylist, Variant avariant[]);

	public abstract void fixedTrack(HlsMasterPlaylist hlsmasterplaylist, Variant variant);
}
