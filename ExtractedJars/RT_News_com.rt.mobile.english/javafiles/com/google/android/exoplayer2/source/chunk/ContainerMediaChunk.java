// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source.chunk:
//			BaseMediaChunk, BaseMediaChunkOutput, ChunkExtractorWrapper

public class ContainerMediaChunk extends BaseMediaChunk
{

	public ContainerMediaChunk(DataSource datasource, DataSpec dataspec, Format format, int i, Object obj, long l, 
			long l1, long l2, long l3, int j, 
			long l4, ChunkExtractorWrapper chunkextractorwrapper)
	{
		super(datasource, dataspec, format, i, obj, l, l1, l2, l3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:lload           6
	//    7   10:lload           8
	//    8   12:lload           10
	//    9   14:lload           12
	//   10   16:invokespecial   #19  <Method void BaseMediaChunk(DataSource, DataSpec, Format, int, Object, long, long, long, long)>
		chunkCount = j;
	//   11   19:aload_0         
	//   12   20:iload           14
	//   13   22:putfield        #21  <Field int chunkCount>
		sampleOffsetUs = l4;
	//   14   25:aload_0         
	//   15   26:lload           15
	//   16   28:putfield        #23  <Field long sampleOffsetUs>
		extractorWrapper = chunkextractorwrapper;
	//   17   31:aload_0         
	//   18   32:aload           17
	//   19   34:putfield        #25  <Field ChunkExtractorWrapper extractorWrapper>
	//   20   37:return          
	}

	public final long bytesLoaded()
	{
		return (long)bytesLoaded;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int bytesLoaded>
	//    2    4:i2l             
	//    3    5:lreturn         
	}

	public final void cancelLoad()
	{
		loadCanceled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #33  <Field boolean loadCanceled>
	//    3    5:return          
	}

	public long getNextChunkIndex()
	{
		return chunkIndex + (long)chunkCount;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field long chunkIndex>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field int chunkCount>
	//    4    8:i2l             
	//    5    9:ladd            
	//    6   10:lreturn         
	}

	public boolean isLoadCompleted()
	{
		return loadCompleted;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field boolean loadCompleted>
	//    2    4:ireturn         
	}

	public final void load()
		throws IOException, InterruptedException
	{
		Object obj = ((Object) (dataSpec.subrange(bytesLoaded)));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field DataSpec dataSpec>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field int bytesLoaded>
	//    4    8:i2l             
	//    5    9:invokevirtual   #56  <Method DataSpec DataSpec.subrange(long)>
	//    6   12:astore          5
		Object obj1;
		ChunkExtractorWrapper chunkextractorwrapper;
		obj = ((Object) (new DefaultExtractorInput(dataSource, ((DataSpec) (obj)).absoluteStreamPosition, dataSource.open(((DataSpec) (obj))))));
	//    7   14:new             #58  <Class DefaultExtractorInput>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:getfield        #62  <Field DataSource dataSource>
	//   11   22:aload           5
	//   12   24:getfield        #65  <Field long DataSpec.absoluteStreamPosition>
	//   13   27:aload_0         
	//   14   28:getfield        #62  <Field DataSource dataSource>
	//   15   31:aload           5
	//   16   33:invokeinterface #71  <Method long DataSource.open(DataSpec)>
	//   17   38:invokespecial   #74  <Method void DefaultExtractorInput(DataSource, long, long)>
	//   18   41:astore          5
		if(bytesLoaded != 0)
			break MISSING_BLOCK_LABEL_105;
	//   19   43:aload_0         
	//   20   44:getfield        #29  <Field int bytesLoaded>
	//   21   47:ifne            105
		obj1 = ((Object) (getOutput()));
	//   22   50:aload_0         
	//   23   51:invokevirtual   #78  <Method BaseMediaChunkOutput getOutput()>
	//   24   54:astore          6
		((BaseMediaChunkOutput) (obj1)).setSampleOffsetUs(sampleOffsetUs);
	//   25   56:aload           6
	//   26   58:aload_0         
	//   27   59:getfield        #23  <Field long sampleOffsetUs>
	//   28   62:invokevirtual   #84  <Method void BaseMediaChunkOutput.setSampleOffsetUs(long)>
		chunkextractorwrapper = extractorWrapper;
	//   29   65:aload_0         
	//   30   66:getfield        #25  <Field ChunkExtractorWrapper extractorWrapper>
	//   31   69:astore          7
		long l;
		if(seekTimeUs == 0x1L)
	//*  32   71:aload_0         
	//*  33   72:getfield        #87  <Field long seekTimeUs>
	//*  34   75:ldc2w           #88  <Long 0x1L>
	//*  35   78:lcmp            
	//*  36   79:ifne            87
		{
			l = 0L;
	//   37   82:lconst_0        
	//   38   83:lstore_2        
			break MISSING_BLOCK_LABEL_97;
	//   39   84:goto            97
		}
		l = seekTimeUs - sampleOffsetUs;
	//   40   87:aload_0         
	//   41   88:getfield        #87  <Field long seekTimeUs>
	//   42   91:aload_0         
	//   43   92:getfield        #23  <Field long sampleOffsetUs>
	//   44   95:lsub            
	//   45   96:lstore_2        
		chunkextractorwrapper.init(((ChunkExtractorWrapper.TrackOutputProvider) (obj1)), l);
	//   46   97:aload           7
	//   47   99:aload           6
	//   48  101:lload_2         
	//   49  102:invokevirtual   #95  <Method void ChunkExtractorWrapper.init(ChunkExtractorWrapper$TrackOutputProvider, long)>
		obj1 = ((Object) (extractorWrapper.extractor));
	//   50  105:aload_0         
	//   51  106:getfield        #25  <Field ChunkExtractorWrapper extractorWrapper>
	//   52  109:getfield        #99  <Field Extractor ChunkExtractorWrapper.extractor>
	//   53  112:astore          6
		int i;
		boolean flag;
		flag = false;
	//   54  114:iconst_0        
	//   55  115:istore          4
		i = 0;
	//   56  117:iconst_0        
	//   57  118:istore_1        
_L2:
		if(i != 0)
			break; /* Loop/switch isn't completed */
	//   58  119:iload_1         
	//   59  120:ifne            219
		if(loadCanceled)
			break; /* Loop/switch isn't completed */
	//   60  123:aload_0         
	//   61  124:getfield        #33  <Field boolean loadCanceled>
	//   62  127:ifne            219
		i = ((Extractor) (obj1)).read(((ExtractorInput) (obj)), ((com.google.android.exoplayer2.extractor.PositionHolder) (null)));
	//   63  130:aload           6
	//   64  132:aload           5
	//   65  134:aconst_null     
	//   66  135:invokeinterface #105 <Method int Extractor.read(ExtractorInput, com.google.android.exoplayer2.extractor.PositionHolder)>
	//   67  140:istore_1        
		if(true) goto _L2; else goto _L1
	//   68  141:goto            119
_L4:
		Assertions.checkState(flag);
	//   69  144:iload           4
	//   70  146:invokestatic    #111 <Method void Assertions.checkState(boolean)>
		bytesLoaded = (int)(((ExtractorInput) (obj)).getPosition() - dataSpec.absoluteStreamPosition);
	//   71  149:aload_0         
	//   72  150:aload           5
	//   73  152:invokeinterface #116 <Method long ExtractorInput.getPosition()>
	//   74  157:aload_0         
	//   75  158:getfield        #50  <Field DataSpec dataSpec>
	//   76  161:getfield        #65  <Field long DataSpec.absoluteStreamPosition>
	//   77  164:lsub            
	//   78  165:l2i             
	//   79  166:putfield        #29  <Field int bytesLoaded>
		Util.closeQuietly(dataSource);
	//   80  169:aload_0         
	//   81  170:getfield        #62  <Field DataSource dataSource>
	//   82  173:invokestatic    #122 <Method void Util.closeQuietly(DataSource)>
		loadCompleted = true;
	//   83  176:aload_0         
	//   84  177:iconst_1        
	//   85  178:putfield        #41  <Field boolean loadCompleted>
		return;
	//   86  181:return          
		Exception exception1;
		exception1;
	//   87  182:astore          6
		bytesLoaded = (int)(((ExtractorInput) (obj)).getPosition() - dataSpec.absoluteStreamPosition);
	//   88  184:aload_0         
	//   89  185:aload           5
	//   90  187:invokeinterface #116 <Method long ExtractorInput.getPosition()>
	//   91  192:aload_0         
	//   92  193:getfield        #50  <Field DataSpec dataSpec>
	//   93  196:getfield        #65  <Field long DataSpec.absoluteStreamPosition>
	//   94  199:lsub            
	//   95  200:l2i             
	//   96  201:putfield        #29  <Field int bytesLoaded>
		throw exception1;
	//   97  204:aload           6
	//   98  206:athrow          
		Exception exception;
		exception;
	//   99  207:astore          5
		Util.closeQuietly(dataSource);
	//  100  209:aload_0         
	//  101  210:getfield        #62  <Field DataSource dataSource>
	//  102  213:invokestatic    #122 <Method void Util.closeQuietly(DataSource)>
		throw exception;
	//  103  216:aload           5
	//  104  218:athrow          
_L1:
		if(i != 1)
	//* 105  219:iload_1         
	//* 106  220:iconst_1        
	//* 107  221:icmpeq          144
			flag = true;
	//  108  224:iconst_1        
	//  109  225:istore          4
		if(true) goto _L4; else goto _L3
	//  110  227:goto            144
_L3:
	}

	private volatile int bytesLoaded;
	private final int chunkCount;
	private final ChunkExtractorWrapper extractorWrapper;
	private volatile boolean loadCanceled;
	private volatile boolean loadCompleted;
	private final long sampleOffsetUs;
}
