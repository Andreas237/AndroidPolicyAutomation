// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.SeekParameters;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.source.chunk:
//			MediaChunk, ChunkHolder, Chunk

public interface ChunkSource
{

	public abstract long getAdjustedSeekPositionUs(long l, SeekParameters seekparameters);

	public abstract void getNextChunk(MediaChunk mediachunk, long l, long l1, ChunkHolder chunkholder);

	public abstract int getPreferredQueueSize(long l, List list);

	public abstract void maybeThrowError()
		throws IOException;

	public abstract void onChunkLoadCompleted(Chunk chunk);

	public abstract boolean onChunkLoadError(Chunk chunk, boolean flag, Exception exception);
}
