// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;

public final class HlsManifest
{

	HlsManifest(HlsMasterPlaylist hlsmasterplaylist, HlsMediaPlaylist hlsmediaplaylist)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		masterPlaylist = hlsmasterplaylist;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field HlsMasterPlaylist masterPlaylist>
		mediaPlaylist = hlsmediaplaylist;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field HlsMediaPlaylist mediaPlaylist>
	//    8   14:return          
	}

	public final HlsMasterPlaylist masterPlaylist;
	public final HlsMediaPlaylist mediaPlaylist;
}
