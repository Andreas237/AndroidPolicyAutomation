// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.chunk;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.extractor.DefaultTrackOutput;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.chunk:
//			BaseMediaChunk, Format

public final class SingleSampleMediaChunk extends BaseMediaChunk
{

	public SingleSampleMediaChunk(DataSource datasource, DataSpec dataspec, int i, Format format, long l, long l1, int j, MediaFormat mediaformat, DrmInitData drminitdata, int k)
	{
		super(datasource, dataspec, i, format, l, l1, j, true, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:lload           5
	//    6    8:lload           7
	//    7   10:iload           9
	//    8   12:iconst_1        
	//    9   13:iload           12
	//   10   15:invokespecial   #17  <Method void BaseMediaChunk(DataSource, DataSpec, int, Format, long, long, int, boolean, int)>
		sampleFormat = mediaformat;
	//   11   18:aload_0         
	//   12   19:aload           10
	//   13   21:putfield        #19  <Field MediaFormat sampleFormat>
		sampleDrmInitData = drminitdata;
	//   14   24:aload_0         
	//   15   25:aload           11
	//   16   27:putfield        #21  <Field DrmInitData sampleDrmInitData>
	//   17   30:return          
	}

	public long bytesLoaded()
	{
		return (long)bytesLoaded;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int bytesLoaded>
	//    2    4:i2l             
	//    3    5:lreturn         
	}

	public void cancelLoad()
	{
		loadCanceled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #29  <Field boolean loadCanceled>
	//    3    5:return          
	}

	public DrmInitData getDrmInitData()
	{
		return sampleDrmInitData;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field DrmInitData sampleDrmInitData>
	//    2    4:areturn         
	}

	public MediaFormat getMediaFormat()
	{
		return sampleFormat;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field MediaFormat sampleFormat>
	//    2    4:areturn         
	}

	public boolean isLoadCanceled()
	{
		return loadCanceled;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field boolean loadCanceled>
	//    2    4:ireturn         
	}

	public void load()
		throws IOException, InterruptedException
	{
		DataSpec dataspec = Util.getRemainderDataSpec(dataSpec, bytesLoaded);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field DataSpec dataSpec>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field int bytesLoaded>
	//    4    8:invokestatic    #50  <Method DataSpec Util.getRemainderDataSpec(DataSpec, int)>
	//    5   11:astore_2        
		dataSource.open(dataspec);
	//    6   12:aload_0         
	//    7   13:getfield        #54  <Field DataSource dataSource>
	//    8   16:aload_2         
	//    9   17:invokeinterface #60  <Method long DataSource.open(DataSpec)>
	//   10   22:pop2            
		int i = 0;
	//   11   23:iconst_0        
	//   12   24:istore_1        
_L1:
		if(i == -1)
			break MISSING_BLOCK_LABEL_58;
	//   13   25:iload_1         
	//   14   26:iconst_m1       
	//   15   27:icmpeq          58
		bytesLoaded = bytesLoaded + i;
	//   16   30:aload_0         
	//   17   31:aload_0         
	//   18   32:getfield        #25  <Field int bytesLoaded>
	//   19   35:iload_1         
	//   20   36:iadd            
	//   21   37:putfield        #25  <Field int bytesLoaded>
		i = getOutput().sampleData(dataSource, 0x7fffffff, true);
	//   22   40:aload_0         
	//   23   41:invokevirtual   #64  <Method DefaultTrackOutput getOutput()>
	//   24   44:aload_0         
	//   25   45:getfield        #54  <Field DataSource dataSource>
	//   26   48:ldc1            #65  <Int 0x7fffffff>
	//   27   50:iconst_1        
	//   28   51:invokevirtual   #71  <Method int DefaultTrackOutput.sampleData(DataSource, int, boolean)>
	//   29   54:istore_1        
		  goto _L1
	//*  30   55:goto            25
		int j = bytesLoaded;
	//   31   58:aload_0         
	//   32   59:getfield        #25  <Field int bytesLoaded>
	//   33   62:istore_1        
		getOutput().sampleMetadata(startTimeUs, 1, j, 0, ((byte []) (null)));
	//   34   63:aload_0         
	//   35   64:invokevirtual   #64  <Method DefaultTrackOutput getOutput()>
	//   36   67:aload_0         
	//   37   68:getfield        #75  <Field long startTimeUs>
	//   38   71:iconst_1        
	//   39   72:iload_1         
	//   40   73:iconst_0        
	//   41   74:aconst_null     
	//   42   75:invokevirtual   #79  <Method void DefaultTrackOutput.sampleMetadata(long, int, int, int, byte[])>
		Util.closeQuietly(dataSource);
	//   43   78:aload_0         
	//   44   79:getfield        #54  <Field DataSource dataSource>
	//   45   82:invokestatic    #83  <Method void Util.closeQuietly(DataSource)>
		return;
	//   46   85:return          
		Exception exception;
		exception;
	//   47   86:astore_2        
		Util.closeQuietly(dataSource);
	//   48   87:aload_0         
	//   49   88:getfield        #54  <Field DataSource dataSource>
	//   50   91:invokestatic    #83  <Method void Util.closeQuietly(DataSource)>
		throw exception;
	//   51   94:aload_2         
	//   52   95:athrow          
	}

	private volatile int bytesLoaded;
	private volatile boolean loadCanceled;
	private final DrmInitData sampleDrmInitData;
	private final MediaFormat sampleFormat;
}
