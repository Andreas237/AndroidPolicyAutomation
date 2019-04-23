// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.chunk;

import com.google.android.exoplayer.MediaFormat;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.chunk:
//			ChunkOperationHolder, Chunk

public interface ChunkSource
{

	public abstract void continueBuffering(long l);

	public abstract void disable(List list);

	public abstract void enable(int i);

	public abstract void getChunkOperation(List list, long l, ChunkOperationHolder chunkoperationholder);

	public abstract MediaFormat getFormat(int i);

	public abstract int getTrackCount();

	public abstract void maybeThrowError()
		throws IOException;

	public abstract void onChunkLoadCompleted(Chunk chunk);

	public abstract void onChunkLoadError(Chunk chunk, Exception exception);

	public abstract boolean prepare();
}
