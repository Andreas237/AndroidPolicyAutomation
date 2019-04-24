// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.source.chunk.Chunk;

// Referenced classes of package com.google.android.exoplayer2.source.hls:
//			HlsChunkSource

public static final class HlsChunkSource$HlsChunkHolder
{

	public void clear()
	{
		chunk = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #23  <Field Chunk chunk>
		endOfStream = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #25  <Field boolean endOfStream>
		playlist = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #27  <Field com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist$HlsUrl playlist>
	//    9   15:return          
	}

	public Chunk chunk;
	public boolean endOfStream;
	public com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl playlist;

	public HlsChunkSource$HlsChunkHolder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		clear();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #20  <Method void clear()>
	//    4    8:return          
	}
}
