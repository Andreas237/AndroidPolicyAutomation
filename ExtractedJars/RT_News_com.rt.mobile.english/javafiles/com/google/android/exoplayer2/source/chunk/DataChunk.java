// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.source.chunk:
//			Chunk

public abstract class DataChunk extends Chunk
{

	public DataChunk(DataSource datasource, DataSpec dataspec, int i, Format format, int j, Object obj, byte abyte0[])
	{
		super(datasource, dataspec, i, format, j, obj, 0x1L, 0x1L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:aload           6
	//    7   10:ldc2w           #15  <Long 0x1L>
	//    8   13:ldc2w           #15  <Long 0x1L>
	//    9   16:invokespecial   #19  <Method void Chunk(DataSource, DataSpec, int, Format, int, Object, long, long)>
		data = abyte0;
	//   10   19:aload_0         
	//   11   20:aload           7
	//   12   22:putfield        #21  <Field byte[] data>
	//   13   25:return          
	}

	private void maybeExpandData()
	{
		if(data == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field byte[] data>
	//*   2    4:ifnonnull       17
		{
			data = new byte[16384];
	//    3    7:aload_0         
	//    4    8:sipush          16384
	//    5   11:newarray        byte[]
	//    6   13:putfield        #21  <Field byte[] data>
			return;
	//    7   16:return          
		}
		if(data.length < limit + 16384)
	//*   8   17:aload_0         
	//*   9   18:getfield        #21  <Field byte[] data>
	//*  10   21:arraylength     
	//*  11   22:aload_0         
	//*  12   23:getfield        #26  <Field int limit>
	//*  13   26:sipush          16384
	//*  14   29:iadd            
	//*  15   30:icmpge          53
			data = Arrays.copyOf(data, data.length + 16384);
	//   16   33:aload_0         
	//   17   34:aload_0         
	//   18   35:getfield        #21  <Field byte[] data>
	//   19   38:aload_0         
	//   20   39:getfield        #21  <Field byte[] data>
	//   21   42:arraylength     
	//   22   43:sipush          16384
	//   23   46:iadd            
	//   24   47:invokestatic    #32  <Method byte[] Arrays.copyOf(byte[], int)>
	//   25   50:putfield        #21  <Field byte[] data>
	//   26   53:return          
	}

	public long bytesLoaded()
	{
		return (long)limit;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int limit>
	//    2    4:i2l             
	//    3    5:lreturn         
	}

	public final void cancelLoad()
	{
		loadCanceled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #37  <Field boolean loadCanceled>
	//    3    5:return          
	}

	protected abstract void consume(byte abyte0[], int i)
		throws IOException;

	public byte[] getDataHolder()
	{
		return data;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field byte[] data>
	//    2    4:areturn         
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
	//   10   18:putfield        #26  <Field int limit>
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
	//   15   27:getfield        #37  <Field boolean loadCanceled>
	//   16   30:ifne            80
		maybeExpandData();
	//   17   33:aload_0         
	//   18   34:invokespecial   #62  <Method void maybeExpandData()>
		j = dataSource.read(data, limit, 16384);
	//   19   37:aload_0         
	//   20   38:getfield        #50  <Field DataSource dataSource>
	//   21   41:aload_0         
	//   22   42:getfield        #21  <Field byte[] data>
	//   23   45:aload_0         
	//   24   46:getfield        #26  <Field int limit>
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
	//   35   67:getfield        #26  <Field int limit>
	//   36   70:iload_2         
	//   37   71:iadd            
	//   38   72:putfield        #26  <Field int limit>
		i = j;
	//   39   75:iload_2         
	//   40   76:istore_1        
		if(true) goto _L2; else goto _L1
	//   41   77:goto            21
_L1:
		if(!loadCanceled)
	//*  42   80:aload_0         
	//*  43   81:getfield        #37  <Field boolean loadCanceled>
	//*  44   84:ifne            99
			consume(data, limit);
	//   45   87:aload_0         
	//   46   88:aload_0         
	//   47   89:getfield        #21  <Field byte[] data>
	//   48   92:aload_0         
	//   49   93:getfield        #26  <Field int limit>
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
