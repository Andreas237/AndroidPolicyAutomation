// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			DataSource, DataSink, DataSpec

public final class TeeDataSource
	implements DataSource
{

	public TeeDataSource(DataSource datasource, DataSink datasink)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		upstream = (DataSource)Assertions.checkNotNull(((Object) (datasource)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #25  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #6   <Class DataSource>
	//    6   12:putfield        #27  <Field DataSource upstream>
		dataSink = (DataSink)Assertions.checkNotNull(((Object) (datasink)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #25  <Method Object Assertions.checkNotNull(Object)>
	//   10   20:checkcast       #29  <Class DataSink>
	//   11   23:putfield        #31  <Field DataSink dataSink>
	//   12   26:return          
	}

	public void close()
		throws IOException
	{
		upstream.close();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field DataSource upstream>
	//    2    4:invokeinterface #37  <Method void DataSource.close()>
		if(dataSinkNeedsClosing)
	//*   3    9:aload_0         
	//*   4   10:getfield        #39  <Field boolean dataSinkNeedsClosing>
	//*   5   13:ifeq            30
		{
			dataSinkNeedsClosing = false;
	//    6   16:aload_0         
	//    7   17:iconst_0        
	//    8   18:putfield        #39  <Field boolean dataSinkNeedsClosing>
			dataSink.close();
	//    9   21:aload_0         
	//   10   22:getfield        #31  <Field DataSink dataSink>
	//   11   25:invokeinterface #40  <Method void DataSink.close()>
		}
		return;
	//   12   30:return          
		Exception exception;
		exception;
	//   13   31:astore_1        
		if(dataSinkNeedsClosing)
	//*  14   32:aload_0         
	//*  15   33:getfield        #39  <Field boolean dataSinkNeedsClosing>
	//*  16   36:ifeq            53
		{
			dataSinkNeedsClosing = false;
	//   17   39:aload_0         
	//   18   40:iconst_0        
	//   19   41:putfield        #39  <Field boolean dataSinkNeedsClosing>
			dataSink.close();
	//   20   44:aload_0         
	//   21   45:getfield        #31  <Field DataSink dataSink>
	//   22   48:invokeinterface #40  <Method void DataSink.close()>
		}
		throw exception;
	//   23   53:aload_1         
	//   24   54:athrow          
	}

	public Uri getUri()
	{
		return upstream.getUri();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field DataSource upstream>
	//    2    4:invokeinterface #45  <Method Uri DataSource.getUri()>
	//    3    9:areturn         
	}

	public long open(DataSpec dataspec)
		throws IOException
	{
		bytesRemaining = upstream.open(dataspec);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field DataSource upstream>
	//    3    5:aload_1         
	//    4    6:invokeinterface #49  <Method long DataSource.open(DataSpec)>
	//    5   11:putfield        #51  <Field long bytesRemaining>
		if(bytesRemaining == 0L)
	//*   6   14:aload_0         
	//*   7   15:getfield        #51  <Field long bytesRemaining>
	//*   8   18:lconst_0        
	//*   9   19:lcmp            
	//*  10   20:ifne            25
			return 0L;
	//   11   23:lconst_0        
	//   12   24:lreturn         
		DataSpec dataspec1 = dataspec;
	//   13   25:aload_1         
	//   14   26:astore_2        
		if(dataspec.length == -1L)
	//*  15   27:aload_1         
	//*  16   28:getfield        #56  <Field long DataSpec.length>
	//*  17   31:ldc2w           #57  <Long -1L>
	//*  18   34:lcmp            
	//*  19   35:ifne            83
		{
			dataspec1 = dataspec;
	//   20   38:aload_1         
	//   21   39:astore_2        
			if(bytesRemaining != -1L)
	//*  22   40:aload_0         
	//*  23   41:getfield        #51  <Field long bytesRemaining>
	//*  24   44:ldc2w           #57  <Long -1L>
	//*  25   47:lcmp            
	//*  26   48:ifeq            83
				dataspec1 = new DataSpec(dataspec.uri, dataspec.absoluteStreamPosition, dataspec.position, bytesRemaining, dataspec.key, dataspec.flags);
	//   27   51:new             #53  <Class DataSpec>
	//   28   54:dup             
	//   29   55:aload_1         
	//   30   56:getfield        #62  <Field Uri DataSpec.uri>
	//   31   59:aload_1         
	//   32   60:getfield        #65  <Field long DataSpec.absoluteStreamPosition>
	//   33   63:aload_1         
	//   34   64:getfield        #68  <Field long DataSpec.position>
	//   35   67:aload_0         
	//   36   68:getfield        #51  <Field long bytesRemaining>
	//   37   71:aload_1         
	//   38   72:getfield        #72  <Field String DataSpec.key>
	//   39   75:aload_1         
	//   40   76:getfield        #76  <Field int DataSpec.flags>
	//   41   79:invokespecial   #79  <Method void DataSpec(Uri, long, long, long, String, int)>
	//   42   82:astore_2        
		}
		dataSinkNeedsClosing = true;
	//   43   83:aload_0         
	//   44   84:iconst_1        
	//   45   85:putfield        #39  <Field boolean dataSinkNeedsClosing>
		dataSink.open(dataspec1);
	//   46   88:aload_0         
	//   47   89:getfield        #31  <Field DataSink dataSink>
	//   48   92:aload_2         
	//   49   93:invokeinterface #82  <Method void DataSink.open(DataSpec)>
		return bytesRemaining;
	//   50   98:aload_0         
	//   51   99:getfield        #51  <Field long bytesRemaining>
	//   52  102:lreturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		if(bytesRemaining == 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field long bytesRemaining>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifne            11
			return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
		j = upstream.read(abyte0, i, j);
	//    7   11:aload_0         
	//    8   12:getfield        #27  <Field DataSource upstream>
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:iload_3         
	//   12   18:invokeinterface #86  <Method int DataSource.read(byte[], int, int)>
	//   13   23:istore_3        
		if(j > 0)
	//*  14   24:iload_3         
	//*  15   25:ifle            62
		{
			dataSink.write(abyte0, i, j);
	//   16   28:aload_0         
	//   17   29:getfield        #31  <Field DataSink dataSink>
	//   18   32:aload_1         
	//   19   33:iload_2         
	//   20   34:iload_3         
	//   21   35:invokeinterface #90  <Method void DataSink.write(byte[], int, int)>
			if(bytesRemaining != -1L)
	//*  22   40:aload_0         
	//*  23   41:getfield        #51  <Field long bytesRemaining>
	//*  24   44:ldc2w           #57  <Long -1L>
	//*  25   47:lcmp            
	//*  26   48:ifeq            62
				bytesRemaining = bytesRemaining - (long)j;
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getfield        #51  <Field long bytesRemaining>
	//   30   56:iload_3         
	//   31   57:i2l             
	//   32   58:lsub            
	//   33   59:putfield        #51  <Field long bytesRemaining>
		}
		return j;
	//   34   62:iload_3         
	//   35   63:ireturn         
	}

	private long bytesRemaining;
	private final DataSink dataSink;
	private boolean dataSinkNeedsClosing;
	private final DataSource upstream;
}
