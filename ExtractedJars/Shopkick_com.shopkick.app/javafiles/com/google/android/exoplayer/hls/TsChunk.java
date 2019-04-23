// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;

import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.chunk.MediaChunk;
import com.google.android.exoplayer.extractor.DefaultExtractorInput;
import com.google.android.exoplayer.extractor.ExtractorInput;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.hls:
//			Aes128DataSource, HlsExtractorWrapper

public final class TsChunk extends MediaChunk
{

	public TsChunk(DataSource datasource, DataSpec dataspec, int i, Format format, long l, long l1, int j, int k, HlsExtractorWrapper hlsextractorwrapper, byte abyte0[], byte abyte1[])
	{
		super(buildDataSource(datasource, abyte0, abyte1), dataspec, i, format, l, l1, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload           12
	//    3    4:aload           13
	//    4    6:invokestatic    #20  <Method DataSource buildDataSource(DataSource, byte[], byte[])>
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:lload           5
	//    9   15:lload           7
	//   10   17:iload           9
	//   11   19:invokespecial   #23  <Method void MediaChunk(DataSource, DataSpec, int, Format, long, long, int)>
		discontinuitySequenceNumber = k;
	//   12   22:aload_0         
	//   13   23:iload           10
	//   14   25:putfield        #25  <Field int discontinuitySequenceNumber>
		extractorWrapper = hlsextractorwrapper;
	//   15   28:aload_0         
	//   16   29:aload           11
	//   17   31:putfield        #27  <Field HlsExtractorWrapper extractorWrapper>
		isEncrypted = dataSource instanceof Aes128DataSource;
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:getfield        #31  <Field DataSource dataSource>
	//   21   39:instanceof      #33  <Class Aes128DataSource>
	//   22   42:putfield        #35  <Field boolean isEncrypted>
		adjustedEndTimeUs = l1;
	//   23   45:aload_0         
	//   24   46:lload           7
	//   25   48:putfield        #37  <Field long adjustedEndTimeUs>
	//   26   51:return          
	}

	private static DataSource buildDataSource(DataSource datasource, byte abyte0[], byte abyte1[])
	{
		if(abyte0 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          21
		{
			if(abyte1 == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       10
				return datasource;
	//    4    8:aload_0         
	//    5    9:areturn         
			else
				return ((DataSource) (new Aes128DataSource(datasource, abyte0, abyte1)));
	//    6   10:new             #33  <Class Aes128DataSource>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #41  <Method void Aes128DataSource(DataSource, byte[], byte[])>
	//   12   20:areturn         
		} else
		{
			return datasource;
	//   13   21:aload_0         
	//   14   22:areturn         
		}
	}

	public long bytesLoaded()
	{
		return (long)bytesLoaded;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int bytesLoaded>
	//    2    4:i2l             
	//    3    5:lreturn         
	}

	public void cancelLoad()
	{
		loadCanceled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #48  <Field boolean loadCanceled>
	//    3    5:return          
	}

	public long getAdjustedEndTimeUs()
	{
		return adjustedEndTimeUs;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field long adjustedEndTimeUs>
	//    2    4:lreturn         
	}

	public boolean isLoadCanceled()
	{
		return loadCanceled;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field boolean loadCanceled>
	//    2    4:ireturn         
	}

	public void load()
		throws IOException, InterruptedException
	{
		boolean flag;
		boolean flag1;
		Object obj;
		boolean flag2 = isEncrypted;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean isEncrypted>
	//    2    4:istore          4
		flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		if(flag2)
	//*   5    8:iload           4
	//*   6   10:ifeq            36
		{
			obj = ((Object) (dataSpec));
	//    7   13:aload_0         
	//    8   14:getfield        #60  <Field DataSpec dataSpec>
	//    9   17:astore          7
			if(bytesLoaded != 0)
	//*  10   19:aload_0         
	//*  11   20:getfield        #44  <Field int bytesLoaded>
	//*  12   23:ifeq            31
				flag = true;
	//   13   26:iconst_1        
	//   14   27:istore_1        
			else
	//*  15   28:goto            51
				flag = false;
	//   16   31:iconst_0        
	//   17   32:istore_1        
		} else
	//*  18   33:goto            51
		{
			obj = ((Object) (Util.getRemainderDataSpec(dataSpec, bytesLoaded)));
	//   19   36:aload_0         
	//   20   37:getfield        #60  <Field DataSpec dataSpec>
	//   21   40:aload_0         
	//   22   41:getfield        #44  <Field int bytesLoaded>
	//   23   44:invokestatic    #66  <Method DataSpec Util.getRemainderDataSpec(DataSpec, int)>
	//   24   47:astore          7
			flag = false;
	//   25   49:iconst_0        
	//   26   50:istore_1        
		}
		obj = ((Object) (new DefaultExtractorInput(dataSource, ((DataSpec) (obj)).absoluteStreamPosition, dataSource.open(((DataSpec) (obj))))));
	//   27   51:new             #68  <Class DefaultExtractorInput>
	//   28   54:dup             
	//   29   55:aload_0         
	//   30   56:getfield        #31  <Field DataSource dataSource>
	//   31   59:aload           7
	//   32   61:getfield        #73  <Field long DataSpec.absoluteStreamPosition>
	//   33   64:aload_0         
	//   34   65:getfield        #31  <Field DataSource dataSource>
	//   35   68:aload           7
	//   36   70:invokeinterface #79  <Method long DataSource.open(DataSpec)>
	//   37   75:invokespecial   #82  <Method void DefaultExtractorInput(DataSource, long, long)>
	//   38   78:astore          7
		int i;
		i = ((int) (flag1));
	//   39   80:iload_3         
	//   40   81:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_99;
	//   41   82:iload_1         
	//   42   83:ifeq            99
		((ExtractorInput) (obj)).skipFully(bytesLoaded);
	//   43   86:aload           7
	//   44   88:aload_0         
	//   45   89:getfield        #44  <Field int bytesLoaded>
	//   46   92:invokeinterface #88  <Method void ExtractorInput.skipFully(int)>
		i = ((int) (flag1));
	//   47   97:iload_3         
	//   48   98:istore_2        
_L1:
		if(i != 0)
			break MISSING_BLOCK_LABEL_123;
	//   49   99:iload_2         
	//   50  100:ifne            123
		if(loadCanceled)
			break MISSING_BLOCK_LABEL_123;
	//   51  103:aload_0         
	//   52  104:getfield        #48  <Field boolean loadCanceled>
	//   53  107:ifne            123
		i = extractorWrapper.read(((ExtractorInput) (obj)));
	//   54  110:aload_0         
	//   55  111:getfield        #27  <Field HlsExtractorWrapper extractorWrapper>
	//   56  114:aload           7
	//   57  116:invokevirtual   #94  <Method int HlsExtractorWrapper.read(ExtractorInput)>
	//   58  119:istore_2        
		  goto _L1
	//*  59  120:goto            99
		long l = extractorWrapper.getAdjustedEndTimeUs();
	//   60  123:aload_0         
	//   61  124:getfield        #27  <Field HlsExtractorWrapper extractorWrapper>
	//   62  127:invokevirtual   #96  <Method long HlsExtractorWrapper.getAdjustedEndTimeUs()>
	//   63  130:lstore          5
		if(l == 0x0L)
			break MISSING_BLOCK_LABEL_147;
	//   64  132:lload           5
	//   65  134:ldc2w           #97  <Long 0x0L>
	//   66  137:lcmp            
	//   67  138:ifeq            147
		adjustedEndTimeUs = l;
	//   68  141:aload_0         
	//   69  142:lload           5
	//   70  144:putfield        #37  <Field long adjustedEndTimeUs>
		bytesLoaded = (int)(((ExtractorInput) (obj)).getPosition() - dataSpec.absoluteStreamPosition);
	//   71  147:aload_0         
	//   72  148:aload           7
	//   73  150:invokeinterface #101 <Method long ExtractorInput.getPosition()>
	//   74  155:aload_0         
	//   75  156:getfield        #60  <Field DataSpec dataSpec>
	//   76  159:getfield        #73  <Field long DataSpec.absoluteStreamPosition>
	//   77  162:lsub            
	//   78  163:l2i             
	//   79  164:putfield        #44  <Field int bytesLoaded>
		Util.closeQuietly(dataSource);
	//   80  167:aload_0         
	//   81  168:getfield        #31  <Field DataSource dataSource>
	//   82  171:invokestatic    #105 <Method void Util.closeQuietly(DataSource)>
		return;
	//   83  174:return          
		Exception exception1;
		exception1;
	//   84  175:astore          8
		bytesLoaded = (int)(((ExtractorInput) (obj)).getPosition() - dataSpec.absoluteStreamPosition);
	//   85  177:aload_0         
	//   86  178:aload           7
	//   87  180:invokeinterface #101 <Method long ExtractorInput.getPosition()>
	//   88  185:aload_0         
	//   89  186:getfield        #60  <Field DataSpec dataSpec>
	//   90  189:getfield        #73  <Field long DataSpec.absoluteStreamPosition>
	//   91  192:lsub            
	//   92  193:l2i             
	//   93  194:putfield        #44  <Field int bytesLoaded>
		throw exception1;
	//   94  197:aload           8
	//   95  199:athrow          
		Exception exception;
		exception;
	//   96  200:astore          7
		Util.closeQuietly(dataSource);
	//   97  202:aload_0         
	//   98  203:getfield        #31  <Field DataSource dataSource>
	//   99  206:invokestatic    #105 <Method void Util.closeQuietly(DataSource)>
		throw exception;
	//  100  209:aload           7
	//  101  211:athrow          
	}

	private long adjustedEndTimeUs;
	private int bytesLoaded;
	public final int discontinuitySequenceNumber;
	public final HlsExtractorWrapper extractorWrapper;
	private final boolean isEncrypted;
	private volatile boolean loadCanceled;
}
