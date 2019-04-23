// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.chunk;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.extractor.DefaultTrackOutput;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;

// Referenced classes of package com.google.android.exoplayer.chunk:
//			MediaChunk, Format

public abstract class BaseMediaChunk extends MediaChunk
{

	public BaseMediaChunk(DataSource datasource, DataSpec dataspec, int i, Format format, long l, long l1, int j, boolean flag, int k)
	{
		super(datasource, dataspec, i, format, l, l1, j, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:lload           5
	//    6    8:lload           7
	//    7   10:iload           9
	//    8   12:iload           11
	//    9   14:invokespecial   #15  <Method void MediaChunk(DataSource, DataSpec, int, Format, long, long, int, int)>
		isMediaFormatFinal = flag;
	//   10   17:aload_0         
	//   11   18:iload           10
	//   12   20:putfield        #17  <Field boolean isMediaFormatFinal>
	//   13   23:return          
	}

	public abstract DrmInitData getDrmInitData();

	public final int getFirstSampleIndex()
	{
		return firstSampleIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int firstSampleIndex>
	//    2    4:ireturn         
	}

	public abstract MediaFormat getMediaFormat();

	protected final DefaultTrackOutput getOutput()
	{
		return output;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field DefaultTrackOutput output>
	//    2    4:areturn         
	}

	public void init(DefaultTrackOutput defaulttrackoutput)
	{
		output = defaulttrackoutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field DefaultTrackOutput output>
		firstSampleIndex = defaulttrackoutput.getWriteIndex();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #37  <Method int DefaultTrackOutput.getWriteIndex()>
	//    6   10:putfield        #24  <Field int firstSampleIndex>
	//    7   13:return          
	}

	private int firstSampleIndex;
	public final boolean isMediaFormatFinal;
	private DefaultTrackOutput output;
}
