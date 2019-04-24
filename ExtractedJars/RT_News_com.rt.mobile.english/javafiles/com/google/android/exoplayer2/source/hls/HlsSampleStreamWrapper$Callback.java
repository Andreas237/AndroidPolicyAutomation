// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls;


// Referenced classes of package com.google.android.exoplayer2.source.hls:
//			HlsSampleStreamWrapper

public static interface HlsSampleStreamWrapper$Callback
	extends com.google.android.exoplayer2.source.SequenceableLoader.Callback
{

	public abstract void onPlaylistRefreshRequired(com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl hlsurl);

	public abstract void onPrepared();
}
