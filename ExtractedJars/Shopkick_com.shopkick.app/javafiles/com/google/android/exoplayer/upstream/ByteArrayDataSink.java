// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import com.google.android.exoplayer.util.Assertions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.upstream:
//			DataSink, DataSpec

public final class ByteArrayDataSink
	implements DataSink
{

	public ByteArrayDataSink()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public void close()
		throws IOException
	{
		stream.close();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ByteArrayOutputStream stream>
	//    2    4:invokevirtual   #22  <Method void ByteArrayOutputStream.close()>
	//    3    7:return          
	}

	public byte[] getData()
	{
		ByteArrayOutputStream bytearrayoutputstream = stream;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ByteArrayOutputStream stream>
	//    2    4:astore_1        
		if(bytearrayoutputstream == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return bytearrayoutputstream.toByteArray();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #28  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//    9   15:areturn         
	}

	public DataSink open(DataSpec dataspec)
		throws IOException
	{
		if(dataspec.length == -1L)
	//*   0    0:aload_1         
	//*   1    1:getfield        #36  <Field long DataSpec.length>
	//*   2    4:ldc2w           #37  <Long -1L>
	//*   3    7:lcmp            
	//*   4    8:ifne            24
		{
			stream = new ByteArrayOutputStream();
	//    5   11:aload_0         
	//    6   12:new             #20  <Class ByteArrayOutputStream>
	//    7   15:dup             
	//    8   16:invokespecial   #39  <Method void ByteArrayOutputStream()>
	//    9   19:putfield        #18  <Field ByteArrayOutputStream stream>
			return ((DataSink) (this));
	//   10   22:aload_0         
	//   11   23:areturn         
		}
		boolean flag;
		if(dataspec.length <= 0x7fffffffL)
	//*  12   24:aload_1         
	//*  13   25:getfield        #36  <Field long DataSpec.length>
	//*  14   28:ldc2w           #40  <Long 0x7fffffffL>
	//*  15   31:lcmp            
	//*  16   32:ifgt            40
			flag = true;
	//   17   35:iconst_1        
	//   18   36:istore_2        
		else
	//*  19   37:goto            42
			flag = false;
	//   20   40:iconst_0        
	//   21   41:istore_2        
		Assertions.checkArgument(flag);
	//   22   42:iload_2         
	//   23   43:invokestatic    #47  <Method void Assertions.checkArgument(boolean)>
		stream = new ByteArrayOutputStream((int)dataspec.length);
	//   24   46:aload_0         
	//   25   47:new             #20  <Class ByteArrayOutputStream>
	//   26   50:dup             
	//   27   51:aload_1         
	//   28   52:getfield        #36  <Field long DataSpec.length>
	//   29   55:l2i             
	//   30   56:invokespecial   #50  <Method void ByteArrayOutputStream(int)>
	//   31   59:putfield        #18  <Field ByteArrayOutputStream stream>
		return ((DataSink) (this));
	//   32   62:aload_0         
	//   33   63:areturn         
	}

	public void write(byte abyte0[], int i, int j)
		throws IOException
	{
		stream.write(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ByteArrayOutputStream stream>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #54  <Method void ByteArrayOutputStream.write(byte[], int, int)>
	//    6   10:return          
	}

	private ByteArrayOutputStream stream;
}
