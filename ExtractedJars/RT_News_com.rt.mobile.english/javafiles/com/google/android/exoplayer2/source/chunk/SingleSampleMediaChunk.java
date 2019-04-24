// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source.chunk:
//			BaseMediaChunk, BaseMediaChunkOutput

public final class SingleSampleMediaChunk extends BaseMediaChunk
{

	public SingleSampleMediaChunk(DataSource datasource, DataSpec dataspec, Format format, int i, Object obj, long l, 
			long l1, long l2, int j, Format format1)
	{
		super(datasource, dataspec, format, i, obj, l, l1, 0x1L, l2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:lload           6
	//    7   10:lload           8
	//    8   12:ldc2w           #14  <Long 0x1L>
	//    9   15:lload           10
	//   10   17:invokespecial   #18  <Method void BaseMediaChunk(DataSource, DataSpec, Format, int, Object, long, long, long, long)>
		trackType = j;
	//   11   20:aload_0         
	//   12   21:iload           12
	//   13   23:putfield        #20  <Field int trackType>
		sampleFormat = format1;
	//   14   26:aload_0         
	//   15   27:aload           13
	//   16   29:putfield        #22  <Field Format sampleFormat>
	//   17   32:return          
	}

	public long bytesLoaded()
	{
		return (long)bytesLoaded;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int bytesLoaded>
	//    2    4:i2l             
	//    3    5:lreturn         
	}

	public void cancelLoad()
	{
	//    0    0:return          
	}

	public boolean isLoadCompleted()
	{
		return loadCompleted;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field boolean loadCompleted>
	//    2    4:ireturn         
	}

	public void load()
		throws IOException, InterruptedException
	{
		Object obj = ((Object) (dataSpec.subrange(bytesLoaded)));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field DataSpec dataSpec>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field int bytesLoaded>
	//    4    8:i2l             
	//    5    9:invokevirtual   #47  <Method DataSpec DataSpec.subrange(long)>
	//    6   12:astore          5
		long l = dataSource.open(((DataSpec) (obj)));
	//    7   14:aload_0         
	//    8   15:getfield        #51  <Field DataSource dataSource>
	//    9   18:aload           5
	//   10   20:invokeinterface #57  <Method long DataSource.open(DataSpec)>
	//   11   25:lstore_3        
		if(l == -1L)
			break MISSING_BLOCK_LABEL_45;
	//   12   26:lload_3         
	//   13   27:ldc2w           #58  <Long -1L>
	//   14   30:lcmp            
	//   15   31:ifeq            179
		l += bytesLoaded;
	//   16   34:lload_3         
	//   17   35:aload_0         
	//   18   36:getfield        #26  <Field int bytesLoaded>
	//   19   39:i2l             
	//   20   40:ladd            
	//   21   41:lstore_3        
	//*  22   42:goto            45
		int k;
		Object obj1;
		obj = ((Object) (new DefaultExtractorInput(dataSource, bytesLoaded, l)));
	//   23   45:new             #61  <Class DefaultExtractorInput>
	//   24   48:dup             
	//   25   49:aload_0         
	//   26   50:getfield        #51  <Field DataSource dataSource>
	//   27   53:aload_0         
	//   28   54:getfield        #26  <Field int bytesLoaded>
	//   29   57:i2l             
	//   30   58:lload_3         
	//   31   59:invokespecial   #64  <Method void DefaultExtractorInput(DataSource, long, long)>
	//   32   62:astore          5
		obj1 = ((Object) (getOutput()));
	//   33   64:aload_0         
	//   34   65:invokevirtual   #68  <Method BaseMediaChunkOutput getOutput()>
	//   35   68:astore          6
		((BaseMediaChunkOutput) (obj1)).setSampleOffsetUs(0L);
	//   36   70:aload           6
	//   37   72:lconst_0        
	//   38   73:invokevirtual   #74  <Method void BaseMediaChunkOutput.setSampleOffsetUs(long)>
		k = trackType;
	//   39   76:aload_0         
	//   40   77:getfield        #20  <Field int trackType>
	//   41   80:istore_2        
		int i = 0;
	//   42   81:iconst_0        
	//   43   82:istore_1        
		obj1 = ((Object) (((BaseMediaChunkOutput) (obj1)).track(0, k)));
	//   44   83:aload           6
	//   45   85:iconst_0        
	//   46   86:iload_2         
	//   47   87:invokevirtual   #78  <Method TrackOutput BaseMediaChunkOutput.track(int, int)>
	//   48   90:astore          6
		((TrackOutput) (obj1)).format(sampleFormat);
	//   49   92:aload           6
	//   50   94:aload_0         
	//   51   95:getfield        #22  <Field Format sampleFormat>
	//   52   98:invokeinterface #84  <Method void TrackOutput.format(Format)>
_L1:
		if(i == -1)
			break MISSING_BLOCK_LABEL_134;
	//   53  103:iload_1         
	//   54  104:iconst_m1       
	//   55  105:icmpeq          134
		bytesLoaded = bytesLoaded + i;
	//   56  108:aload_0         
	//   57  109:aload_0         
	//   58  110:getfield        #26  <Field int bytesLoaded>
	//   59  113:iload_1         
	//   60  114:iadd            
	//   61  115:putfield        #26  <Field int bytesLoaded>
		i = ((TrackOutput) (obj1)).sampleData(((com.google.android.exoplayer2.extractor.ExtractorInput) (obj)), 0x7fffffff, true);
	//   62  118:aload           6
	//   63  120:aload           5
	//   64  122:ldc1            #85  <Int 0x7fffffff>
	//   65  124:iconst_1        
	//   66  125:invokeinterface #89  <Method int TrackOutput.sampleData(com.google.android.exoplayer2.extractor.ExtractorInput, int, boolean)>
	//   67  130:istore_1        
		  goto _L1
	//*  68  131:goto            103
		int j = bytesLoaded;
	//   69  134:aload_0         
	//   70  135:getfield        #26  <Field int bytesLoaded>
	//   71  138:istore_1        
		((TrackOutput) (obj1)).sampleMetadata(startTimeUs, 1, j, 0, ((com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) (null)));
	//   72  139:aload           6
	//   73  141:aload_0         
	//   74  142:getfield        #93  <Field long startTimeUs>
	//   75  145:iconst_1        
	//   76  146:iload_1         
	//   77  147:iconst_0        
	//   78  148:aconst_null     
	//   79  149:invokeinterface #97  <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
		Util.closeQuietly(dataSource);
	//   80  154:aload_0         
	//   81  155:getfield        #51  <Field DataSource dataSource>
	//   82  158:invokestatic    #103 <Method void Util.closeQuietly(DataSource)>
		loadCompleted = true;
	//   83  161:aload_0         
	//   84  162:iconst_1        
	//   85  163:putfield        #32  <Field boolean loadCompleted>
		return;
	//   86  166:return          
		Exception exception;
		exception;
	//   87  167:astore          5
		Util.closeQuietly(dataSource);
	//   88  169:aload_0         
	//   89  170:getfield        #51  <Field DataSource dataSource>
	//   90  173:invokestatic    #103 <Method void Util.closeQuietly(DataSource)>
		throw exception;
	//   91  176:aload           5
	//   92  178:athrow          
	//*  93  179:goto            45
	}

	private volatile int bytesLoaded;
	private volatile boolean loadCompleted;
	private final Format sampleFormat;
	private final int trackType;
}
