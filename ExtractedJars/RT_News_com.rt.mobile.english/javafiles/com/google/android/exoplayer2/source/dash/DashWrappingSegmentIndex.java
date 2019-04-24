// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;

// Referenced classes of package com.google.android.exoplayer2.source.dash:
//			DashSegmentIndex

public final class DashWrappingSegmentIndex
	implements DashSegmentIndex
{

	public DashWrappingSegmentIndex(ChunkIndex chunkindex, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		chunkIndex = chunkindex;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field ChunkIndex chunkIndex>
		timeOffsetUs = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #19  <Field long timeOffsetUs>
	//    8   14:return          
	}

	public long getDurationUs(long l, long l1)
	{
		return chunkIndex.durationsUs[(int)l];
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ChunkIndex chunkIndex>
	//    2    4:getfield        #28  <Field long[] ChunkIndex.durationsUs>
	//    3    7:lload_1         
	//    4    8:l2i             
	//    5    9:laload          
	//    6   10:lreturn         
	}

	public long getFirstSegmentNum()
	{
		return 0L;
	//    0    0:lconst_0        
	//    1    1:lreturn         
	}

	public int getSegmentCount(long l)
	{
		return chunkIndex.length;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ChunkIndex chunkIndex>
	//    2    4:getfield        #36  <Field int ChunkIndex.length>
	//    3    7:ireturn         
	}

	public long getSegmentNum(long l, long l1)
	{
		return (long)chunkIndex.getChunkIndex(l + timeOffsetUs);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ChunkIndex chunkIndex>
	//    2    4:lload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field long timeOffsetUs>
	//    5    9:ladd            
	//    6   10:invokevirtual   #40  <Method int ChunkIndex.getChunkIndex(long)>
	//    7   13:i2l             
	//    8   14:lreturn         
	}

	public RangedUri getSegmentUrl(long l)
	{
		long al[] = chunkIndex.offsets;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ChunkIndex chunkIndex>
	//    2    4:getfield        #45  <Field long[] ChunkIndex.offsets>
	//    3    7:astore          4
		int i = (int)l;
	//    4    9:lload_1         
	//    5   10:l2i             
	//    6   11:istore_3        
		return new RangedUri(((String) (null)), al[i], chunkIndex.sizes[i]);
	//    7   12:new             #47  <Class RangedUri>
	//    8   15:dup             
	//    9   16:aconst_null     
	//   10   17:aload           4
	//   11   19:iload_3         
	//   12   20:laload          
	//   13   21:aload_0         
	//   14   22:getfield        #17  <Field ChunkIndex chunkIndex>
	//   15   25:getfield        #51  <Field int[] ChunkIndex.sizes>
	//   16   28:iload_3         
	//   17   29:iaload          
	//   18   30:i2l             
	//   19   31:invokespecial   #54  <Method void RangedUri(String, long, long)>
	//   20   34:areturn         
	}

	public long getTimeUs(long l)
	{
		return chunkIndex.timesUs[(int)l] - timeOffsetUs;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ChunkIndex chunkIndex>
	//    2    4:getfield        #59  <Field long[] ChunkIndex.timesUs>
	//    3    7:lload_1         
	//    4    8:l2i             
	//    5    9:laload          
	//    6   10:aload_0         
	//    7   11:getfield        #19  <Field long timeOffsetUs>
	//    8   14:lsub            
	//    9   15:lreturn         
	}

	public boolean isExplicit()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private final ChunkIndex chunkIndex;
	private final long timeOffsetUs;
}
