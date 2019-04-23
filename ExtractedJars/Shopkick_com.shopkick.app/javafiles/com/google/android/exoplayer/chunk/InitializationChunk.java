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
//			Chunk, ChunkExtractorWrapper, Format

public class InitializationChunk extends Chunk
	implements ChunkExtractorWrapper.SingleTrackOutput
{

	public InitializationChunk(DataSource datasource, DataSpec dataspec, int i, Format format1, ChunkExtractorWrapper chunkextractorwrapper)
	{
		this(datasource, dataspec, i, format1, chunkextractorwrapper, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:iconst_m1       
	//    7    9:invokespecial   #23  <Method void InitializationChunk(DataSource, DataSpec, int, Format, ChunkExtractorWrapper, int)>
	//    8   12:return          
	}

	public InitializationChunk(DataSource datasource, DataSpec dataspec, int i, Format format1, ChunkExtractorWrapper chunkextractorwrapper, int j)
	{
		super(datasource, dataspec, 2, i, format1, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_2        
	//    4    4:iload_3         
	//    5    5:aload           4
	//    6    7:iload           6
	//    7    9:invokespecial   #27  <Method void Chunk(DataSource, DataSpec, int, int, Format, int)>
		extractorWrapper = chunkextractorwrapper;
	//    8   12:aload_0         
	//    9   13:aload           5
	//   10   15:putfield        #29  <Field ChunkExtractorWrapper extractorWrapper>
	//   11   18:return          
	}

	public long bytesLoaded()
	{
		return (long)bytesLoaded;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int bytesLoaded>
	//    2    4:i2l             
	//    3    5:lreturn         
	}

	public void cancelLoad()
	{
		loadCanceled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #36  <Field boolean loadCanceled>
	//    3    5:return          
	}

	public void drmInitData(DrmInitData drminitdata)
	{
		drmInitData = drminitdata;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field DrmInitData drmInitData>
	//    3    5:return          
	}

	public void format(MediaFormat mediaformat)
	{
		mediaFormat = mediaformat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field MediaFormat mediaFormat>
	//    3    5:return          
	}

	public DrmInitData getDrmInitData()
	{
		return drmInitData;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field DrmInitData drmInitData>
	//    2    4:areturn         
	}

	public MediaFormat getFormat()
	{
		return mediaFormat;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field MediaFormat mediaFormat>
	//    2    4:areturn         
	}

	public SeekMap getSeekMap()
	{
		return seekMap;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field SeekMap seekMap>
	//    2    4:areturn         
	}

	public boolean hasDrmInitData()
	{
		return drmInitData != null;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field DrmInitData drmInitData>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean hasFormat()
	{
		return mediaFormat != null;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field MediaFormat mediaFormat>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean hasSeekMap()
	{
		return seekMap != null;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field SeekMap seekMap>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isLoadCanceled()
	{
		return loadCanceled;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean loadCanceled>
	//    2    4:ireturn         
	}

	public void load()
		throws IOException, InterruptedException
	{
		Object obj = ((Object) (Util.getRemainderDataSpec(dataSpec, bytesLoaded)));
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field DataSpec dataSpec>
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field int bytesLoaded>
	//    4    8:invokestatic    #71  <Method DataSpec Util.getRemainderDataSpec(DataSpec, int)>
	//    5   11:astore_2        
		obj = ((Object) (new DefaultExtractorInput(dataSource, ((DataSpec) (obj)).absoluteStreamPosition, dataSource.open(((DataSpec) (obj))))));
	//    6   12:new             #73  <Class DefaultExtractorInput>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #77  <Field DataSource dataSource>
	//   10   20:aload_2         
	//   11   21:getfield        #83  <Field long DataSpec.absoluteStreamPosition>
	//   12   24:aload_0         
	//   13   25:getfield        #77  <Field DataSource dataSource>
	//   14   28:aload_2         
	//   15   29:invokeinterface #89  <Method long DataSource.open(DataSpec)>
	//   16   34:invokespecial   #92  <Method void DefaultExtractorInput(DataSource, long, long)>
	//   17   37:astore_2        
		if(bytesLoaded == 0)
	//*  18   38:aload_0         
	//*  19   39:getfield        #32  <Field int bytesLoaded>
	//*  20   42:ifne            53
			extractorWrapper.init(((ChunkExtractorWrapper.SingleTrackOutput) (this)));
	//   21   45:aload_0         
	//   22   46:getfield        #29  <Field ChunkExtractorWrapper extractorWrapper>
	//   23   49:aload_0         
	//   24   50:invokevirtual   #98  <Method void ChunkExtractorWrapper.init(ChunkExtractorWrapper$SingleTrackOutput)>
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
	//   30   60:getfield        #36  <Field boolean loadCanceled>
	//   31   63:ifne            100
		i = extractorWrapper.read(((ExtractorInput) (obj)));
	//   32   66:aload_0         
	//   33   67:getfield        #29  <Field ChunkExtractorWrapper extractorWrapper>
	//   34   70:aload_2         
	//   35   71:invokevirtual   #102 <Method int ChunkExtractorWrapper.read(ExtractorInput)>
	//   36   74:istore_1        
		if(true) goto _L2; else goto _L1
	//   37   75:goto            55
		Exception exception1;
		exception1;
	//   38   78:astore_3        
		bytesLoaded = (int)(((ExtractorInput) (obj)).getPosition() - dataSpec.absoluteStreamPosition);
	//   39   79:aload_0         
	//   40   80:aload_2         
	//   41   81:invokeinterface #107 <Method long ExtractorInput.getPosition()>
	//   42   86:aload_0         
	//   43   87:getfield        #65  <Field DataSpec dataSpec>
	//   44   90:getfield        #83  <Field long DataSpec.absoluteStreamPosition>
	//   45   93:lsub            
	//   46   94:l2i             
	//   47   95:putfield        #32  <Field int bytesLoaded>
		throw exception1;
	//   48   98:aload_3         
	//   49   99:athrow          
_L1:
		bytesLoaded = (int)(((ExtractorInput) (obj)).getPosition() - dataSpec.absoluteStreamPosition);
	//   50  100:aload_0         
	//   51  101:aload_2         
	//   52  102:invokeinterface #107 <Method long ExtractorInput.getPosition()>
	//   53  107:aload_0         
	//   54  108:getfield        #65  <Field DataSpec dataSpec>
	//   55  111:getfield        #83  <Field long DataSpec.absoluteStreamPosition>
	//   56  114:lsub            
	//   57  115:l2i             
	//   58  116:putfield        #32  <Field int bytesLoaded>
		Util.closeQuietly(dataSource);
	//   59  119:aload_0         
	//   60  120:getfield        #77  <Field DataSource dataSource>
	//   61  123:invokestatic    #111 <Method void Util.closeQuietly(DataSource)>
		return;
	//   62  126:return          
		Exception exception;
		exception;
	//   63  127:astore_2        
		Util.closeQuietly(dataSource);
	//   64  128:aload_0         
	//   65  129:getfield        #77  <Field DataSource dataSource>
	//   66  132:invokestatic    #111 <Method void Util.closeQuietly(DataSource)>
		throw exception;
	//   67  135:aload_2         
	//   68  136:athrow          
	}

	public int sampleData(ExtractorInput extractorinput, int i, boolean flag)
		throws IOException, InterruptedException
	{
		throw new IllegalStateException("Unexpected sample data in initialization chunk");
	//    0    0:new             #116 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #118 <String "Unexpected sample data in initialization chunk">
	//    3    6:invokespecial   #121 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public void sampleData(ParsableByteArray parsablebytearray, int i)
	{
		throw new IllegalStateException("Unexpected sample data in initialization chunk");
	//    0    0:new             #116 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #118 <String "Unexpected sample data in initialization chunk">
	//    3    6:invokespecial   #121 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public void sampleMetadata(long l, int i, int j, int k, byte abyte0[])
	{
		throw new IllegalStateException("Unexpected sample data in initialization chunk");
	//    0    0:new             #116 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #118 <String "Unexpected sample data in initialization chunk">
	//    3    6:invokespecial   #121 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public void seekMap(SeekMap seekmap)
	{
		seekMap = seekmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field SeekMap seekMap>
	//    3    5:return          
	}

	private volatile int bytesLoaded;
	private DrmInitData drmInitData;
	private final ChunkExtractorWrapper extractorWrapper;
	private volatile boolean loadCanceled;
	private MediaFormat mediaFormat;
	private SeekMap seekMap;
}
