// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;

// Referenced classes of package com.google.android.exoplayer2.source.chunk:
//			Chunk

public abstract class MediaChunk extends Chunk
{

	public MediaChunk(DataSource datasource, DataSpec dataspec, Format format, int i, Object obj, long l, 
			long l1, long l2)
	{
		super(datasource, dataspec, 1, format, i, obj, l, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:aload_3         
	//    5    5:iload           4
	//    6    7:aload           5
	//    7    9:lload           6
	//    8   11:lload           8
	//    9   13:invokespecial   #11  <Method void Chunk(DataSource, DataSpec, int, Format, int, Object, long, long)>
		Assertions.checkNotNull(((Object) (format)));
	//   10   16:aload_3         
	//   11   17:invokestatic    #17  <Method Object Assertions.checkNotNull(Object)>
	//   12   20:pop             
		chunkIndex = l2;
	//   13   21:aload_0         
	//   14   22:lload           10
	//   15   24:putfield        #19  <Field long chunkIndex>
	//   16   27:return          
	}

	public long getNextChunkIndex()
	{
		long l1 = chunkIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field long chunkIndex>
	//    2    4:lstore_3        
		long l = -1L;
	//    3    5:ldc2w           #23  <Long -1L>
	//    4    8:lstore_1        
		if(l1 != -1L)
	//*   5    9:lload_3         
	//*   6   10:ldc2w           #23  <Long -1L>
	//*   7   13:lcmp            
	//*   8   14:ifeq            24
			l = chunkIndex + 1L;
	//    9   17:aload_0         
	//   10   18:getfield        #19  <Field long chunkIndex>
	//   11   21:lconst_1        
	//   12   22:ladd            
	//   13   23:lstore_1        
		return l;
	//   14   24:lload_1         
	//   15   25:lreturn         
	}

	public abstract boolean isLoadCompleted();

	public final long chunkIndex;
}
