// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash;

import com.google.android.exoplayer.dash.mpd.RangedUri;
import com.google.android.exoplayer.extractor.ChunkIndex;

// Referenced classes of package com.google.android.exoplayer.dash:
//			DashSegmentIndex

final class DashWrappingSegmentIndex
	implements DashSegmentIndex
{

	public DashWrappingSegmentIndex(ChunkIndex chunkindex, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		chunkIndex = chunkindex;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field ChunkIndex chunkIndex>
		uri = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field String uri>
	//    8   14:return          
	}

	public long getDurationUs(int i, long l)
	{
		return chunkIndex.durationsUs[i];
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ChunkIndex chunkIndex>
	//    2    4:getfield        #28  <Field long[] ChunkIndex.durationsUs>
	//    3    7:iload_1         
	//    4    8:laload          
	//    5    9:lreturn         
	}

	public int getFirstSegmentNum()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getLastSegmentNum(long l)
	{
		return chunkIndex.length - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ChunkIndex chunkIndex>
	//    2    4:getfield        #36  <Field int ChunkIndex.length>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public int getSegmentNum(long l, long l1)
	{
		return chunkIndex.getChunkIndex(l);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ChunkIndex chunkIndex>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #41  <Method int ChunkIndex.getChunkIndex(long)>
	//    4    8:ireturn         
	}

	public RangedUri getSegmentUrl(int i)
	{
		return new RangedUri(((String) (null)), chunkIndex.offsets[i], chunkIndex.sizes[i]);
	//    0    0:new             #45  <Class RangedUri>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field ChunkIndex chunkIndex>
	//    5    9:getfield        #48  <Field long[] ChunkIndex.offsets>
	//    6   12:iload_1         
	//    7   13:laload          
	//    8   14:aload_0         
	//    9   15:getfield        #17  <Field ChunkIndex chunkIndex>
	//   10   18:getfield        #52  <Field int[] ChunkIndex.sizes>
	//   11   21:iload_1         
	//   12   22:iaload          
	//   13   23:i2l             
	//   14   24:invokespecial   #55  <Method void RangedUri(String, long, long)>
	//   15   27:areturn         
	}

	public long getTimeUs(int i)
	{
		return chunkIndex.timesUs[i];
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ChunkIndex chunkIndex>
	//    2    4:getfield        #60  <Field long[] ChunkIndex.timesUs>
	//    3    7:iload_1         
	//    4    8:laload          
	//    5    9:lreturn         
	}

	public boolean isExplicit()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private final ChunkIndex chunkIndex;
	private final String uri;
}
