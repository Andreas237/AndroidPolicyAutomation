// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.chunk;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.extractor.*;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.util.ParsableByteArray;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.chunk:
//			BaseMediaChunk, ChunkExtractorWrapper, Format

public class ContainerMediaChunk extends BaseMediaChunk
	implements ChunkExtractorWrapper.SingleTrackOutput
{

	public ContainerMediaChunk(DataSource datasource, DataSpec dataspec, int i, Format format1, long l, long l1, int j, long l2, ChunkExtractorWrapper chunkextractorwrapper, MediaFormat mediaformat, int k, 
			int i1, DrmInitData drminitdata, boolean flag, int j1)
	{
		super(datasource, dataspec, i, format1, l, l1, j, flag, j1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:lload           5
	//    6    8:lload           7
	//    7   10:iload           9
	//    8   12:iload           17
	//    9   14:iload           18
	//   10   16:invokespecial   #25  <Method void BaseMediaChunk(DataSource, DataSpec, int, Format, long, long, int, boolean, int)>
		extractorWrapper = chunkextractorwrapper;
	//   11   19:aload_0         
	//   12   20:aload           12
	//   13   22:putfield        #27  <Field ChunkExtractorWrapper extractorWrapper>
		sampleOffsetUs = l2;
	//   14   25:aload_0         
	//   15   26:lload           10
	//   16   28:putfield        #29  <Field long sampleOffsetUs>
		adaptiveMaxWidth = k;
	//   17   31:aload_0         
	//   18   32:iload           14
	//   19   34:putfield        #31  <Field int adaptiveMaxWidth>
		adaptiveMaxHeight = i1;
	//   20   37:aload_0         
	//   21   38:iload           15
	//   22   40:putfield        #33  <Field int adaptiveMaxHeight>
		mediaFormat = getAdjustedMediaFormat(mediaformat, l2, k, i1);
	//   23   43:aload_0         
	//   24   44:aload           13
	//   25   46:lload           10
	//   26   48:iload           14
	//   27   50:iload           15
	//   28   52:invokestatic    #37  <Method MediaFormat getAdjustedMediaFormat(MediaFormat, long, int, int)>
	//   29   55:putfield        #39  <Field MediaFormat mediaFormat>
		drmInitData = drminitdata;
	//   30   58:aload_0         
	//   31   59:aload           16
	//   32   61:putfield        #41  <Field DrmInitData drmInitData>
	//   33   64:return          
	}

	private static MediaFormat getAdjustedMediaFormat(MediaFormat mediaformat, long l, int i, int j)
	{
label0:
		{
			if(mediaformat == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
				return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
			MediaFormat mediaformat1 = mediaformat;
	//    4    6:aload_0         
	//    5    7:astore          5
			if(l != 0L)
	//*   6    9:lload_1         
	//*   7   10:lconst_0        
	//*   8   11:lcmp            
	//*   9   12:ifeq            41
			{
				mediaformat1 = mediaformat;
	//   10   15:aload_0         
	//   11   16:astore          5
				if(mediaformat.subsampleOffsetUs != 0xffffffffL)
	//*  12   18:aload_0         
	//*  13   19:getfield        #47  <Field long MediaFormat.subsampleOffsetUs>
	//*  14   22:ldc2w           #48  <Long 0xffffffffL>
	//*  15   25:lcmp            
	//*  16   26:ifeq            41
					mediaformat1 = mediaformat.copyWithSubsampleOffsetUs(mediaformat.subsampleOffsetUs + l);
	//   17   29:aload_0         
	//   18   30:aload_0         
	//   19   31:getfield        #47  <Field long MediaFormat.subsampleOffsetUs>
	//   20   34:lload_1         
	//   21   35:ladd            
	//   22   36:invokevirtual   #53  <Method MediaFormat MediaFormat.copyWithSubsampleOffsetUs(long)>
	//   23   39:astore          5
			}
			if(i == -1)
	//*  24   41:iload_3         
	//*  25   42:iconst_m1       
	//*  26   43:icmpne          55
			{
				mediaformat = mediaformat1;
	//   27   46:aload           5
	//   28   48:astore_0        
				if(j == -1)
					break label0;
	//   29   49:iload           4
	//   30   51:iconst_m1       
	//   31   52:icmpeq          64
			}
			mediaformat = mediaformat1.copyWithMaxVideoDimensions(i, j);
	//   32   55:aload           5
	//   33   57:iload_3         
	//   34   58:iload           4
	//   35   60:invokevirtual   #57  <Method MediaFormat MediaFormat.copyWithMaxVideoDimensions(int, int)>
	//   36   63:astore_0        
		}
		return mediaformat;
	//   37   64:aload_0         
	//   38   65:areturn         
	}

	public final long bytesLoaded()
	{
		return (long)bytesLoaded;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int bytesLoaded>
	//    2    4:i2l             
	//    3    5:lreturn         
	}

	public final void cancelLoad()
	{
		loadCanceled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #64  <Field boolean loadCanceled>
	//    3    5:return          
	}

	public final void drmInitData(DrmInitData drminitdata)
	{
		drmInitData = drminitdata;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field DrmInitData drmInitData>
	//    3    5:return          
	}

	public final void format(MediaFormat mediaformat)
	{
		mediaFormat = getAdjustedMediaFormat(mediaformat, sampleOffsetUs, adaptiveMaxWidth, adaptiveMaxHeight);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #29  <Field long sampleOffsetUs>
	//    4    6:aload_0         
	//    5    7:getfield        #31  <Field int adaptiveMaxWidth>
	//    6   10:aload_0         
	//    7   11:getfield        #33  <Field int adaptiveMaxHeight>
	//    8   14:invokestatic    #37  <Method MediaFormat getAdjustedMediaFormat(MediaFormat, long, int, int)>
	//    9   17:putfield        #39  <Field MediaFormat mediaFormat>
	//   10   20:return          
	}

	public final DrmInitData getDrmInitData()
	{
		return drmInitData;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field DrmInitData drmInitData>
	//    2    4:areturn         
	}

	public final MediaFormat getMediaFormat()
	{
		return mediaFormat;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field MediaFormat mediaFormat>
	//    2    4:areturn         
	}

	public final boolean isLoadCanceled()
	{
		return loadCanceled;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field boolean loadCanceled>
	//    2    4:ireturn         
	}

	public final void load()
		throws IOException, InterruptedException
	{
		Object obj = ((Object) (Util.getRemainderDataSpec(dataSpec, bytesLoaded)));
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field DataSpec dataSpec>
	//    2    4:aload_0         
	//    3    5:getfield        #60  <Field int bytesLoaded>
	//    4    8:invokestatic    #88  <Method DataSpec Util.getRemainderDataSpec(DataSpec, int)>
	//    5   11:astore_2        
		obj = ((Object) (new DefaultExtractorInput(dataSource, ((DataSpec) (obj)).absoluteStreamPosition, dataSource.open(((DataSpec) (obj))))));
	//    6   12:new             #90  <Class DefaultExtractorInput>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #94  <Field DataSource dataSource>
	//   10   20:aload_2         
	//   11   21:getfield        #99  <Field long DataSpec.absoluteStreamPosition>
	//   12   24:aload_0         
	//   13   25:getfield        #94  <Field DataSource dataSource>
	//   14   28:aload_2         
	//   15   29:invokeinterface #105 <Method long DataSource.open(DataSpec)>
	//   16   34:invokespecial   #108 <Method void DefaultExtractorInput(DataSource, long, long)>
	//   17   37:astore_2        
		if(bytesLoaded == 0)
	//*  18   38:aload_0         
	//*  19   39:getfield        #60  <Field int bytesLoaded>
	//*  20   42:ifne            53
			extractorWrapper.init(((ChunkExtractorWrapper.SingleTrackOutput) (this)));
	//   21   45:aload_0         
	//   22   46:getfield        #27  <Field ChunkExtractorWrapper extractorWrapper>
	//   23   49:aload_0         
	//   24   50:invokevirtual   #114 <Method void ChunkExtractorWrapper.init(ChunkExtractorWrapper$SingleTrackOutput)>
		int i = 0;
	//   25   53:iconst_0        
	//   26   54:istore_1        
_L2:
		if(i != 0)
			break; /* Loop/switch isn't completed */
	//   27   55:iload_1         
	//   28   56:ifne            100
		if(loadCanceled)
			break; /* Loop/switch isn't completed */
	//   29   59:aload_0         
	//   30   60:getfield        #64  <Field boolean loadCanceled>
	//   31   63:ifne            100
		i = extractorWrapper.read(((ExtractorInput) (obj)));
	//   32   66:aload_0         
	//   33   67:getfield        #27  <Field ChunkExtractorWrapper extractorWrapper>
	//   34   70:aload_2         
	//   35   71:invokevirtual   #118 <Method int ChunkExtractorWrapper.read(ExtractorInput)>
	//   36   74:istore_1        
		if(true) goto _L2; else goto _L1
	//   37   75:goto            55
		Exception exception1;
		exception1;
	//   38   78:astore_3        
		bytesLoaded = (int)(((ExtractorInput) (obj)).getPosition() - dataSpec.absoluteStreamPosition);
	//   39   79:aload_0         
	//   40   80:aload_2         
	//   41   81:invokeinterface #123 <Method long ExtractorInput.getPosition()>
	//   42   86:aload_0         
	//   43   87:getfield        #82  <Field DataSpec dataSpec>
	//   44   90:getfield        #99  <Field long DataSpec.absoluteStreamPosition>
	//   45   93:lsub            
	//   46   94:l2i             
	//   47   95:putfield        #60  <Field int bytesLoaded>
		throw exception1;
	//   48   98:aload_3         
	//   49   99:athrow          
_L1:
		bytesLoaded = (int)(((ExtractorInput) (obj)).getPosition() - dataSpec.absoluteStreamPosition);
	//   50  100:aload_0         
	//   51  101:aload_2         
	//   52  102:invokeinterface #123 <Method long ExtractorInput.getPosition()>
	//   53  107:aload_0         
	//   54  108:getfield        #82  <Field DataSpec dataSpec>
	//   55  111:getfield        #99  <Field long DataSpec.absoluteStreamPosition>
	//   56  114:lsub            
	//   57  115:l2i             
	//   58  116:putfield        #60  <Field int bytesLoaded>
		Util.closeQuietly(dataSource);
	//   59  119:aload_0         
	//   60  120:getfield        #94  <Field DataSource dataSource>
	//   61  123:invokestatic    #127 <Method void Util.closeQuietly(DataSource)>
		return;
	//   62  126:return          
		Exception exception;
		exception;
	//   63  127:astore_2        
		Util.closeQuietly(dataSource);
	//   64  128:aload_0         
	//   65  129:getfield        #94  <Field DataSource dataSource>
	//   66  132:invokestatic    #127 <Method void Util.closeQuietly(DataSource)>
		throw exception;
	//   67  135:aload_2         
	//   68  136:athrow          
	}

	public final int sampleData(ExtractorInput extractorinput, int i, boolean flag)
		throws IOException, InterruptedException
	{
		return getOutput().sampleData(extractorinput, i, flag);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #134 <Method DefaultTrackOutput getOutput()>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #138 <Method int DefaultTrackOutput.sampleData(ExtractorInput, int, boolean)>
	//    6   10:ireturn         
	}

	public final void sampleData(ParsableByteArray parsablebytearray, int i)
	{
		getOutput().sampleData(parsablebytearray, i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #134 <Method DefaultTrackOutput getOutput()>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #141 <Method void DefaultTrackOutput.sampleData(ParsableByteArray, int)>
	//    5    9:return          
	}

	public final void sampleMetadata(long l, int i, int j, int k, byte abyte0[])
	{
		getOutput().sampleMetadata(sampleOffsetUs + l, i, j, k, abyte0);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #134 <Method DefaultTrackOutput getOutput()>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field long sampleOffsetUs>
	//    4    8:lload_1         
	//    5    9:ladd            
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:iload           5
	//    9   15:aload           6
	//   10   17:invokevirtual   #145 <Method void DefaultTrackOutput.sampleMetadata(long, int, int, int, byte[])>
	//   11   20:return          
	}

	public final void seekMap(SeekMap seekmap)
	{
	//    0    0:return          
	}

	private final int adaptiveMaxHeight;
	private final int adaptiveMaxWidth;
	private volatile int bytesLoaded;
	private DrmInitData drmInitData;
	private final ChunkExtractorWrapper extractorWrapper;
	private volatile boolean loadCanceled;
	private MediaFormat mediaFormat;
	private final long sampleOffsetUs;
}
