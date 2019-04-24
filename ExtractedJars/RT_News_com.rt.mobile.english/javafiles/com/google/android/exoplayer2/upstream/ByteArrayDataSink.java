// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.Assertions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.upstream:
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
		if(stream == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field ByteArrayOutputStream stream>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return stream.toByteArray();
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field ByteArrayOutputStream stream>
	//    7   13:invokevirtual   #28  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//    8   16:areturn         
	}

	public void open(DataSpec dataspec)
		throws IOException
	{
		if(dataspec.length == -1L)
	//*   0    0:aload_1         
	//*   1    1:getfield        #36  <Field long DataSpec.length>
	//*   2    4:ldc2w           #37  <Long -1L>
	//*   3    7:lcmp            
	//*   4    8:ifne            23
		{
			stream = new ByteArrayOutputStream();
	//    5   11:aload_0         
	//    6   12:new             #20  <Class ByteArrayOutputStream>
	//    7   15:dup             
	//    8   16:invokespecial   #39  <Method void ByteArrayOutputStream()>
	//    9   19:putfield        #18  <Field ByteArrayOutputStream stream>
			return;
	//   10   22:return          
		}
		boolean flag;
		if(dataspec.length <= 0x7fffffffL)
	//*  11   23:aload_1         
	//*  12   24:getfield        #36  <Field long DataSpec.length>
	//*  13   27:ldc2w           #40  <Long 0x7fffffffL>
	//*  14   30:lcmp            
	//*  15   31:ifgt            39
			flag = true;
	//   16   34:iconst_1        
	//   17   35:istore_2        
		else
	//*  18   36:goto            41
			flag = false;
	//   19   39:iconst_0        
	//   20   40:istore_2        
		Assertions.checkArgument(flag);
	//   21   41:iload_2         
	//   22   42:invokestatic    #47  <Method void Assertions.checkArgument(boolean)>
		stream = new ByteArrayOutputStream((int)dataspec.length);
	//   23   45:aload_0         
	//   24   46:new             #20  <Class ByteArrayOutputStream>
	//   25   49:dup             
	//   26   50:aload_1         
	//   27   51:getfield        #36  <Field long DataSpec.length>
	//   28   54:l2i             
	//   29   55:invokespecial   #50  <Method void ByteArrayOutputStream(int)>
	//   30   58:putfield        #18  <Field ByteArrayOutputStream stream>
	//   31   61:return          
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
