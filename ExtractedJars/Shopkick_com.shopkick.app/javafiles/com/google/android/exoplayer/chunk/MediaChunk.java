// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.chunk;

import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.util.Assertions;

// Referenced classes of package com.google.android.exoplayer.chunk:
//			Chunk, Format

public abstract class MediaChunk extends Chunk
{

	public MediaChunk(DataSource datasource, DataSpec dataspec, int i, Format format, long l, long l1, int j)
	{
		this(datasource, dataspec, i, format, l, l1, j, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:lload           5
	//    6    8:lload           7
	//    7   10:iload           9
	//    8   12:iconst_m1       
	//    9   13:invokespecial   #14  <Method void MediaChunk(DataSource, DataSpec, int, Format, long, long, int, int)>
	//   10   16:return          
	}

	public MediaChunk(DataSource datasource, DataSpec dataspec, int i, Format format, long l, long l1, int j, int k)
	{
		super(datasource, dataspec, 1, i, format, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:iload_3         
	//    5    5:aload           4
	//    6    7:iload           10
	//    7    9:invokespecial   #18  <Method void Chunk(DataSource, DataSpec, int, int, Format, int)>
		Assertions.checkNotNull(((Object) (format)));
	//    8   12:aload           4
	//    9   14:invokestatic    #24  <Method Object Assertions.checkNotNull(Object)>
	//   10   17:pop             
		startTimeUs = l;
	//   11   18:aload_0         
	//   12   19:lload           5
	//   13   21:putfield        #26  <Field long startTimeUs>
		endTimeUs = l1;
	//   14   24:aload_0         
	//   15   25:lload           7
	//   16   27:putfield        #28  <Field long endTimeUs>
		chunkIndex = j;
	//   17   30:aload_0         
	//   18   31:iload           9
	//   19   33:putfield        #30  <Field int chunkIndex>
	//   20   36:return          
	}

	public long getDurationUs()
	{
		return endTimeUs - startTimeUs;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field long endTimeUs>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field long startTimeUs>
	//    4    8:lsub            
	//    5    9:lreturn         
	}

	public int getNextChunkIndex()
	{
		return chunkIndex + 1;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int chunkIndex>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	public final int chunkIndex;
	public final long endTimeUs;
	public final long startTimeUs;
}
