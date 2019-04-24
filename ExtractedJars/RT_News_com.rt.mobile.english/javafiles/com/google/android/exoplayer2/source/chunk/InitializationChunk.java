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
//			Chunk, ChunkExtractorWrapper

public final class InitializationChunk extends Chunk
{

	public InitializationChunk(DataSource datasource, DataSpec dataspec, Format format, int i, Object obj, ChunkExtractorWrapper chunkextractorwrapper)
	{
		super(datasource, dataspec, 2, format, i, obj, 0x1L, 0x1L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_2        
	//    4    4:aload_3         
	//    5    5:iload           4
	//    6    7:aload           5
	//    7    9:ldc2w           #14  <Long 0x1L>
	//    8   12:ldc2w           #14  <Long 0x1L>
	//    9   15:invokespecial   #18  <Method void Chunk(DataSource, DataSpec, int, Format, int, Object, long, long)>
		extractorWrapper = chunkextractorwrapper;
	//   10   18:aload_0         
	//   11   19:aload           6
	//   12   21:putfield        #20  <Field ChunkExtractorWrapper extractorWrapper>
	//   13   24:return          
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

	public void load()
		throws IOException, InterruptedException
	{
		Object obj = ((Object) (dataSpec.subrange(bytesLoaded)));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field DataSpec dataSpec>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field int bytesLoaded>
	//    4    8:i2l             
	//    5    9:invokevirtual   #44  <Method DataSpec DataSpec.subrange(long)>
	//    6   12:astore_3        
		obj = ((Object) (new DefaultExtractorInput(dataSource, ((DataSpec) (obj)).absoluteStreamPosition, dataSource.open(((DataSpec) (obj))))));
	//    7   13:new             #46  <Class DefaultExtractorInput>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #50  <Field DataSource dataSource>
	//   11   21:aload_3         
	//   12   22:getfield        #54  <Field long DataSpec.absoluteStreamPosition>
	//   13   25:aload_0         
	//   14   26:getfield        #50  <Field DataSource dataSource>
	//   15   29:aload_3         
	//   16   30:invokeinterface #60  <Method long DataSource.open(DataSpec)>
	//   17   35:invokespecial   #63  <Method void DefaultExtractorInput(DataSource, long, long)>
	//   18   38:astore_3        
		if(bytesLoaded == 0)
	//*  19   39:aload_0         
	//*  20   40:getfield        #25  <Field int bytesLoaded>
	//*  21   43:ifne            57
			extractorWrapper.init(((ChunkExtractorWrapper.TrackOutputProvider) (null)), 0x1L);
	//   22   46:aload_0         
	//   23   47:getfield        #20  <Field ChunkExtractorWrapper extractorWrapper>
	//   24   50:aconst_null     
	//   25   51:ldc2w           #14  <Long 0x1L>
	//   26   54:invokevirtual   #69  <Method void ChunkExtractorWrapper.init(ChunkExtractorWrapper$TrackOutputProvider, long)>
		Extractor extractor = extractorWrapper.extractor;
	//   27   57:aload_0         
	//   28   58:getfield        #20  <Field ChunkExtractorWrapper extractorWrapper>
	//   29   61:getfield        #73  <Field Extractor ChunkExtractorWrapper.extractor>
	//   30   64:astore          4
		int i = 0;
	//   31   66:iconst_0        
	//   32   67:istore_1        
_L2:
		if(i != 0)
			break; /* Loop/switch isn't completed */
	//   33   68:iload_1         
	//   34   69:ifne            157
		if(loadCanceled)
			break; /* Loop/switch isn't completed */
	//   35   72:aload_0         
	//   36   73:getfield        #29  <Field boolean loadCanceled>
	//   37   76:ifne            157
		i = extractor.read(((ExtractorInput) (obj)), ((com.google.android.exoplayer2.extractor.PositionHolder) (null)));
	//   38   79:aload           4
	//   39   81:aload_3         
	//   40   82:aconst_null     
	//   41   83:invokeinterface #79  <Method int Extractor.read(ExtractorInput, com.google.android.exoplayer2.extractor.PositionHolder)>
	//   42   88:istore_1        
		if(true) goto _L2; else goto _L1
	//   43   89:goto            68
_L4:
		boolean flag;
		Assertions.checkState(flag);
	//   44   92:iload_2         
	//   45   93:invokestatic    #85  <Method void Assertions.checkState(boolean)>
		bytesLoaded = (int)(((ExtractorInput) (obj)).getPosition() - dataSpec.absoluteStreamPosition);
	//   46   96:aload_0         
	//   47   97:aload_3         
	//   48   98:invokeinterface #90  <Method long ExtractorInput.getPosition()>
	//   49  103:aload_0         
	//   50  104:getfield        #38  <Field DataSpec dataSpec>
	//   51  107:getfield        #54  <Field long DataSpec.absoluteStreamPosition>
	//   52  110:lsub            
	//   53  111:l2i             
	//   54  112:putfield        #25  <Field int bytesLoaded>
		Util.closeQuietly(dataSource);
	//   55  115:aload_0         
	//   56  116:getfield        #50  <Field DataSource dataSource>
	//   57  119:invokestatic    #96  <Method void Util.closeQuietly(DataSource)>
		return;
	//   58  122:return          
		Exception exception1;
		exception1;
	//   59  123:astore          4
		bytesLoaded = (int)(((ExtractorInput) (obj)).getPosition() - dataSpec.absoluteStreamPosition);
	//   60  125:aload_0         
	//   61  126:aload_3         
	//   62  127:invokeinterface #90  <Method long ExtractorInput.getPosition()>
	//   63  132:aload_0         
	//   64  133:getfield        #38  <Field DataSpec dataSpec>
	//   65  136:getfield        #54  <Field long DataSpec.absoluteStreamPosition>
	//   66  139:lsub            
	//   67  140:l2i             
	//   68  141:putfield        #25  <Field int bytesLoaded>
		throw exception1;
	//   69  144:aload           4
	//   70  146:athrow          
		Exception exception;
		exception;
	//   71  147:astore_3        
		Util.closeQuietly(dataSource);
	//   72  148:aload_0         
	//   73  149:getfield        #50  <Field DataSource dataSource>
	//   74  152:invokestatic    #96  <Method void Util.closeQuietly(DataSource)>
		throw exception;
	//   75  155:aload_3         
	//   76  156:athrow          
_L1:
		flag = true;
	//   77  157:iconst_1        
	//   78  158:istore_2        
		if(i == 1)
	//*  79  159:iload_1         
	//*  80  160:iconst_1        
	//*  81  161:icmpeq          167
	//*  82  164:goto            92
			flag = false;
	//   83  167:iconst_0        
	//   84  168:istore_2        
		if(true) goto _L4; else goto _L3
	//   85  169:goto            92
_L3:
	}

	private volatile int bytesLoaded;
	private final ChunkExtractorWrapper extractorWrapper;
	private volatile boolean loadCanceled;
}
