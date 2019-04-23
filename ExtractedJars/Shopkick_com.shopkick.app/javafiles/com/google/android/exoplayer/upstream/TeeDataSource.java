// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import com.google.android.exoplayer.util.Assertions;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.upstream:
//			DataSource, DataSink, DataSpec

public final class TeeDataSource
	implements DataSource
{

	public TeeDataSource(DataSource datasource, DataSink datasink)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		upstream = (DataSource)Assertions.checkNotNull(((Object) (datasource)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #21  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #6   <Class DataSource>
	//    6   12:putfield        #23  <Field DataSource upstream>
		dataSink = (DataSink)Assertions.checkNotNull(((Object) (datasink)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #21  <Method Object Assertions.checkNotNull(Object)>
	//   10   20:checkcast       #25  <Class DataSink>
	//   11   23:putfield        #27  <Field DataSink dataSink>
	//   12   26:return          
	}

	public void close()
		throws IOException
	{
		upstream.close();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field DataSource upstream>
	//    2    4:invokeinterface #33  <Method void DataSource.close()>
		dataSink.close();
	//    3    9:aload_0         
	//    4   10:getfield        #27  <Field DataSink dataSink>
	//    5   13:invokeinterface #34  <Method void DataSink.close()>
		return;
	//    6   18:return          
		Exception exception;
		exception;
	//    7   19:astore_1        
		dataSink.close();
	//    8   20:aload_0         
	//    9   21:getfield        #27  <Field DataSink dataSink>
	//   10   24:invokeinterface #34  <Method void DataSink.close()>
		throw exception;
	//   11   29:aload_1         
	//   12   30:athrow          
	}

	public long open(DataSpec dataspec)
		throws IOException
	{
		long l = upstream.open(dataspec);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field DataSource upstream>
	//    2    4:aload_1         
	//    3    5:invokeinterface #39  <Method long DataSource.open(DataSpec)>
	//    4   10:lstore_2        
		DataSpec dataspec1 = dataspec;
	//    5   11:aload_1         
	//    6   12:astore          4
		if(dataspec.length == -1L)
	//*   7   14:aload_1         
	//*   8   15:getfield        #45  <Field long DataSpec.length>
	//*   9   18:ldc2w           #46  <Long -1L>
	//*  10   21:lcmp            
	//*  11   22:ifne            66
		{
			dataspec1 = dataspec;
	//   12   25:aload_1         
	//   13   26:astore          4
			if(l != -1L)
	//*  14   28:lload_2         
	//*  15   29:ldc2w           #46  <Long -1L>
	//*  16   32:lcmp            
	//*  17   33:ifeq            66
				dataspec1 = new DataSpec(dataspec.uri, dataspec.absoluteStreamPosition, dataspec.position, l, dataspec.key, dataspec.flags);
	//   18   36:new             #41  <Class DataSpec>
	//   19   39:dup             
	//   20   40:aload_1         
	//   21   41:getfield        #51  <Field android.net.Uri DataSpec.uri>
	//   22   44:aload_1         
	//   23   45:getfield        #54  <Field long DataSpec.absoluteStreamPosition>
	//   24   48:aload_1         
	//   25   49:getfield        #57  <Field long DataSpec.position>
	//   26   52:lload_2         
	//   27   53:aload_1         
	//   28   54:getfield        #61  <Field String DataSpec.key>
	//   29   57:aload_1         
	//   30   58:getfield        #65  <Field int DataSpec.flags>
	//   31   61:invokespecial   #68  <Method void DataSpec(android.net.Uri, long, long, long, String, int)>
	//   32   64:astore          4
		}
		dataSink.open(dataspec1);
	//   33   66:aload_0         
	//   34   67:getfield        #27  <Field DataSink dataSink>
	//   35   70:aload           4
	//   36   72:invokeinterface #71  <Method DataSink DataSink.open(DataSpec)>
	//   37   77:pop             
		return l;
	//   38   78:lload_2         
	//   39   79:lreturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		j = upstream.read(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field DataSource upstream>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokeinterface #75  <Method int DataSource.read(byte[], int, int)>
	//    6   12:istore_3        
		if(j > 0)
	//*   7   13:iload_3         
	//*   8   14:ifle            29
			dataSink.write(abyte0, i, j);
	//    9   17:aload_0         
	//   10   18:getfield        #27  <Field DataSink dataSink>
	//   11   21:aload_1         
	//   12   22:iload_2         
	//   13   23:iload_3         
	//   14   24:invokeinterface #79  <Method void DataSink.write(byte[], int, int)>
		return j;
	//   15   29:iload_3         
	//   16   30:ireturn         
	}

	private final DataSink dataSink;
	private final DataSource upstream;
}
