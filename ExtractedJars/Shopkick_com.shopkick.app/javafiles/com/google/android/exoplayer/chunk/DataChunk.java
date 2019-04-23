// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.chunk;

import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer.chunk:
//			Chunk, Format

public abstract class DataChunk extends Chunk
{

	public DataChunk(DataSource datasource, DataSpec dataspec, int i, int j, Format format, int k, byte abyte0[])
	{
		super(datasource, dataspec, i, j, format, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:iload           6
	//    7   10:invokespecial   #17  <Method void Chunk(DataSource, DataSpec, int, int, Format, int)>
		data = abyte0;
	//    8   13:aload_0         
	//    9   14:aload           7
	//   10   16:putfield        #19  <Field byte[] data>
	//   11   19:return          
	}

	private void maybeExpandData()
	{
		byte abyte0[] = data;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field byte[] data>
	//    2    4:astore_1        
		if(abyte0 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       19
		{
			data = new byte[16384];
	//    5    9:aload_0         
	//    6   10:sipush          16384
	//    7   13:newarray        byte[]
	//    8   15:putfield        #19  <Field byte[] data>
			return;
	//    9   18:return          
		}
		if(abyte0.length < limit + 16384)
	//*  10   19:aload_1         
	//*  11   20:arraylength     
	//*  12   21:aload_0         
	//*  13   22:getfield        #24  <Field int limit>
	//*  14   25:sipush          16384
	//*  15   28:iadd            
	//*  16   29:icmpge          46
			data = Arrays.copyOf(abyte0, abyte0.length + 16384);
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:aload_1         
	//   20   35:arraylength     
	//   21   36:sipush          16384
	//   22   39:iadd            
	//   23   40:invokestatic    #30  <Method byte[] Arrays.copyOf(byte[], int)>
	//   24   43:putfield        #19  <Field byte[] data>
	//   25   46:return          
	}

	public long bytesLoaded()
	{
		return (long)limit;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int limit>
	//    2    4:i2l             
	//    3    5:lreturn         
	}

	public final void cancelLoad()
	{
		loadCanceled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #35  <Field boolean loadCanceled>
	//    3    5:return          
	}

	protected abstract void consume(byte abyte0[], int i)
		throws IOException;

	public byte[] getDataHolder()
	{
		return data;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field byte[] data>
	//    2    4:areturn         
	}

	public final boolean isLoadCanceled()
	{
		return loadCanceled;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean loadCanceled>
	//    2    4:ireturn         
	}

	public final void load()
		throws IOException, InterruptedException
	{
		dataSource.open(dataSpec);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field DataSource dataSource>
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field DataSpec dataSpec>
	//    4    8:invokeinterface #60  <Method long DataSource.open(DataSpec)>
	//    5   13:pop2            
		int i = 0;
	//    6   14:iconst_0        
	//    7   15:istore_1        
		limit = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #24  <Field int limit>
_L2:
		if(i == -1)
			break; /* Loop/switch isn't completed */
	//   11   21:iload_1         
	//   12   22:iconst_m1       
	//   13   23:icmpeq          80
		int j;
		if(loadCanceled)
			break; /* Loop/switch isn't completed */
	//   14   26:aload_0         
	//   15   27:getfield        #35  <Field boolean loadCanceled>
	//   16   30:ifne            80
		maybeExpandData();
	//   17   33:aload_0         
	//   18   34:invokespecial   #62  <Method void maybeExpandData()>
		j = dataSource.read(data, limit, 16384);
	//   19   37:aload_0         
	//   20   38:getfield        #50  <Field DataSource dataSource>
	//   21   41:aload_0         
	//   22   42:getfield        #19  <Field byte[] data>
	//   23   45:aload_0         
	//   24   46:getfield        #24  <Field int limit>
	//   25   49:sipush          16384
	//   26   52:invokeinterface #66  <Method int DataSource.read(byte[], int, int)>
	//   27   57:istore_2        
		i = j;
	//   28   58:iload_2         
	//   29   59:istore_1        
		if(j == -1)
			continue; /* Loop/switch isn't completed */
	//   30   60:iload_2         
	//   31   61:iconst_m1       
	//   32   62:icmpeq          21
		limit = limit + j;
	//   33   65:aload_0         
	//   34   66:aload_0         
	//   35   67:getfield        #24  <Field int limit>
	//   36   70:iload_2         
	//   37   71:iadd            
	//   38   72:putfield        #24  <Field int limit>
		i = j;
	//   39   75:iload_2         
	//   40   76:istore_1        
		if(true) goto _L2; else goto _L1
	//   41   77:goto            21
_L1:
		if(!loadCanceled)
	//*  42   80:aload_0         
	//*  43   81:getfield        #35  <Field boolean loadCanceled>
	//*  44   84:ifne            99
			consume(data, limit);
	//   45   87:aload_0         
	//   46   88:aload_0         
	//   47   89:getfield        #19  <Field byte[] data>
	//   48   92:aload_0         
	//   49   93:getfield        #24  <Field int limit>
	//   50   96:invokevirtual   #68  <Method void consume(byte[], int)>
		Util.closeQuietly(dataSource);
	//   51   99:aload_0         
	//   52  100:getfield        #50  <Field DataSource dataSource>
	//   53  103:invokestatic    #74  <Method void Util.closeQuietly(DataSource)>
		return;
	//   54  106:return          
		Exception exception;
		exception;
	//   55  107:astore_3        
		Util.closeQuietly(dataSource);
	//   56  108:aload_0         
	//   57  109:getfield        #50  <Field DataSource dataSource>
	//   58  112:invokestatic    #74  <Method void Util.closeQuietly(DataSource)>
		throw exception;
	//   59  115:aload_3         
	//   60  116:athrow          
	}

	private static final int READ_GRANULARITY = 16384;
	private byte data[];
	private int limit;
	private volatile boolean loadCanceled;
}
