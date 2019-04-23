// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import com.google.android.exoplayer.util.Assertions;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.exoplayer.upstream:
//			DataSource, DataSpec

public final class DataSourceInputStream extends InputStream
{

	public DataSourceInputStream(DataSource datasource, DataSpec dataspec)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void InputStream()>
		opened = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #20  <Field boolean opened>
		closed = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #22  <Field boolean closed>
		dataSource = datasource;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #24  <Field DataSource dataSource>
		dataSpec = dataspec;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #26  <Field DataSpec dataSpec>
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:newarray        byte[]
	//   17   28:putfield        #28  <Field byte[] singleByteArray>
	//   18   31:return          
	}

	private void checkOpened()
		throws IOException
	{
		if(!opened)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field boolean opened>
	//*   2    4:ifne            26
		{
			dataSource.open(dataSpec);
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field DataSource dataSource>
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field DataSpec dataSpec>
	//    7   15:invokeinterface #38  <Method long DataSource.open(DataSpec)>
	//    8   20:pop2            
			opened = true;
	//    9   21:aload_0         
	//   10   22:iconst_1        
	//   11   23:putfield        #20  <Field boolean opened>
		}
	//   12   26:return          
	}

	public void close()
		throws IOException
	{
		if(!closed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field boolean closed>
	//*   2    4:ifne            21
		{
			dataSource.close();
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field DataSource dataSource>
	//    5   11:invokeinterface #42  <Method void DataSource.close()>
			closed = true;
	//    6   16:aload_0         
	//    7   17:iconst_1        
	//    8   18:putfield        #22  <Field boolean closed>
		}
	//    9   21:return          
	}

	public void open()
		throws IOException
	{
		checkOpened();
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void checkOpened()>
	//    2    4:return          
	}

	public int read()
		throws IOException
	{
		if(read(singleByteArray) == -1)
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #28  <Field byte[] singleByteArray>
	//*   3    5:invokevirtual   #49  <Method int read(byte[])>
	//*   4    8:iconst_m1       
	//*   5    9:icmpne          14
			return -1;
	//    6   12:iconst_m1       
	//    7   13:ireturn         
		else
			return singleByteArray[0] & 0xff;
	//    8   14:aload_0         
	//    9   15:getfield        #28  <Field byte[] singleByteArray>
	//   10   18:iconst_0        
	//   11   19:baload          
	//   12   20:sipush          255
	//   13   23:iand            
	//   14   24:ireturn         
	}

	public int read(byte abyte0[])
		throws IOException
	{
		return read(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokevirtual   #52  <Method int read(byte[], int, int)>
	//    6    8:ireturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		Assertions.checkState(closed ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean closed>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #58  <Method void Assertions.checkState(boolean)>
		checkOpened();
	//    5    9:aload_0         
	//    6   10:invokespecial   #44  <Method void checkOpened()>
		return dataSource.read(abyte0, i, j);
	//    7   13:aload_0         
	//    8   14:getfield        #24  <Field DataSource dataSource>
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:iload_3         
	//   12   20:invokeinterface #59  <Method int DataSource.read(byte[], int, int)>
	//   13   25:ireturn         
	}

	public long skip(long l)
		throws IOException
	{
		Assertions.checkState(closed ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean closed>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #58  <Method void Assertions.checkState(boolean)>
		checkOpened();
	//    5    9:aload_0         
	//    6   10:invokespecial   #44  <Method void checkOpened()>
		return super.skip(l);
	//    7   13:aload_0         
	//    8   14:lload_1         
	//    9   15:invokespecial   #63  <Method long InputStream.skip(long)>
	//   10   18:lreturn         
	}

	private boolean closed;
	private final DataSource dataSource;
	private final DataSpec dataSpec;
	private boolean opened;
	private final byte singleByteArray[] = new byte[1];
}
