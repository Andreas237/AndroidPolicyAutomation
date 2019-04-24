// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;

// Referenced classes of package com.google.android.exoplayer2.source.chunk:
//			MediaChunk, BaseMediaChunkOutput

public abstract class BaseMediaChunk extends MediaChunk
{

	public BaseMediaChunk(DataSource datasource, DataSpec dataspec, Format format, int i, Object obj, long l, 
			long l1, long l2, long l3)
	{
		super(datasource, dataspec, format, i, obj, l, l1, l3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:lload           6
	//    7   10:lload           8
	//    8   12:lload           12
	//    9   14:invokespecial   #15  <Method void MediaChunk(DataSource, DataSpec, Format, int, Object, long, long, long)>
		seekTimeUs = l2;
	//   10   17:aload_0         
	//   11   18:lload           10
	//   12   20:putfield        #17  <Field long seekTimeUs>
	//   13   23:return          
	}

	public final int getFirstSampleIndex(int i)
	{
		return firstSampleIndices[i];
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int[] firstSampleIndices>
	//    2    4:iload_1         
	//    3    5:iaload          
	//    4    6:ireturn         
	}

	protected final BaseMediaChunkOutput getOutput()
	{
		return output;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field BaseMediaChunkOutput output>
	//    2    4:areturn         
	}

	public void init(BaseMediaChunkOutput basemediachunkoutput)
	{
		output = basemediachunkoutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field BaseMediaChunkOutput output>
		firstSampleIndices = basemediachunkoutput.getWriteIndices();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #34  <Method int[] BaseMediaChunkOutput.getWriteIndices()>
	//    6   10:putfield        #22  <Field int[] firstSampleIndices>
	//    7   13:return          
	}

	private int firstSampleIndices[];
	private BaseMediaChunkOutput output;
	public final long seekTimeUs;
}
