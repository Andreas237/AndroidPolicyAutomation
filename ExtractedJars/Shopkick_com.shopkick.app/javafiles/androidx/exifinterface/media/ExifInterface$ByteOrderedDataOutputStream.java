// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.exifinterface.media;

import java.io.*;
import java.nio.ByteOrder;

// Referenced classes of package androidx.exifinterface.media:
//			ExifInterface

private static class ExifInterface$ByteOrderedDataOutputStream extends FilterOutputStream
{

	public void setByteOrder(ByteOrder byteorder)
	{
		mByteOrder = byteorder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ByteOrder mByteOrder>
	//    3    5:return          
	}

	public void write(byte abyte0[])
		throws IOException
	{
		mOutputStream.write(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OutputStream mOutputStream>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #31  <Method void OutputStream.write(byte[])>
	//    4    8:return          
	}

	public void write(byte abyte0[], int i, int j)
		throws IOException
	{
		mOutputStream.write(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OutputStream mOutputStream>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #35  <Method void OutputStream.write(byte[], int, int)>
	//    6   10:return          
	}

	public void writeByte(int i)
		throws IOException
	{
		mOutputStream.write(i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OutputStream mOutputStream>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #39  <Method void OutputStream.write(int)>
	//    4    8:return          
	}

	public void writeInt(int i)
		throws IOException
	{
		if(mByteOrder == ByteOrder.LITTLE_ENDIAN)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field ByteOrder mByteOrder>
	//*   2    4:getstatic       #45  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//*   3    7:if_acmpne       70
		{
			mOutputStream.write(i >>> 0 & 0xff);
	//    4   10:aload_0         
	//    5   11:getfield        #18  <Field OutputStream mOutputStream>
	//    6   14:iload_1         
	//    7   15:iconst_0        
	//    8   16:iushr           
	//    9   17:sipush          255
	//   10   20:iand            
	//   11   21:invokevirtual   #39  <Method void OutputStream.write(int)>
			mOutputStream.write(i >>> 8 & 0xff);
	//   12   24:aload_0         
	//   13   25:getfield        #18  <Field OutputStream mOutputStream>
	//   14   28:iload_1         
	//   15   29:bipush          8
	//   16   31:iushr           
	//   17   32:sipush          255
	//   18   35:iand            
	//   19   36:invokevirtual   #39  <Method void OutputStream.write(int)>
			mOutputStream.write(i >>> 16 & 0xff);
	//   20   39:aload_0         
	//   21   40:getfield        #18  <Field OutputStream mOutputStream>
	//   22   43:iload_1         
	//   23   44:bipush          16
	//   24   46:iushr           
	//   25   47:sipush          255
	//   26   50:iand            
	//   27   51:invokevirtual   #39  <Method void OutputStream.write(int)>
			mOutputStream.write(i >>> 24 & 0xff);
	//   28   54:aload_0         
	//   29   55:getfield        #18  <Field OutputStream mOutputStream>
	//   30   58:iload_1         
	//   31   59:bipush          24
	//   32   61:iushr           
	//   33   62:sipush          255
	//   34   65:iand            
	//   35   66:invokevirtual   #39  <Method void OutputStream.write(int)>
			return;
	//   36   69:return          
		}
		if(mByteOrder == ByteOrder.BIG_ENDIAN)
	//*  37   70:aload_0         
	//*  38   71:getfield        #20  <Field ByteOrder mByteOrder>
	//*  39   74:getstatic       #48  <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//*  40   77:if_acmpne       139
		{
			mOutputStream.write(i >>> 24 & 0xff);
	//   41   80:aload_0         
	//   42   81:getfield        #18  <Field OutputStream mOutputStream>
	//   43   84:iload_1         
	//   44   85:bipush          24
	//   45   87:iushr           
	//   46   88:sipush          255
	//   47   91:iand            
	//   48   92:invokevirtual   #39  <Method void OutputStream.write(int)>
			mOutputStream.write(i >>> 16 & 0xff);
	//   49   95:aload_0         
	//   50   96:getfield        #18  <Field OutputStream mOutputStream>
	//   51   99:iload_1         
	//   52  100:bipush          16
	//   53  102:iushr           
	//   54  103:sipush          255
	//   55  106:iand            
	//   56  107:invokevirtual   #39  <Method void OutputStream.write(int)>
			mOutputStream.write(i >>> 8 & 0xff);
	//   57  110:aload_0         
	//   58  111:getfield        #18  <Field OutputStream mOutputStream>
	//   59  114:iload_1         
	//   60  115:bipush          8
	//   61  117:iushr           
	//   62  118:sipush          255
	//   63  121:iand            
	//   64  122:invokevirtual   #39  <Method void OutputStream.write(int)>
			mOutputStream.write(i >>> 0 & 0xff);
	//   65  125:aload_0         
	//   66  126:getfield        #18  <Field OutputStream mOutputStream>
	//   67  129:iload_1         
	//   68  130:iconst_0        
	//   69  131:iushr           
	//   70  132:sipush          255
	//   71  135:iand            
	//   72  136:invokevirtual   #39  <Method void OutputStream.write(int)>
		}
	//   73  139:return          
	}

	public void writeShort(short word0)
		throws IOException
	{
		if(mByteOrder == ByteOrder.LITTLE_ENDIAN)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field ByteOrder mByteOrder>
	//*   2    4:getstatic       #45  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//*   3    7:if_acmpne       40
		{
			mOutputStream.write(word0 >>> 0 & 0xff);
	//    4   10:aload_0         
	//    5   11:getfield        #18  <Field OutputStream mOutputStream>
	//    6   14:iload_1         
	//    7   15:iconst_0        
	//    8   16:iushr           
	//    9   17:sipush          255
	//   10   20:iand            
	//   11   21:invokevirtual   #39  <Method void OutputStream.write(int)>
			mOutputStream.write(word0 >>> 8 & 0xff);
	//   12   24:aload_0         
	//   13   25:getfield        #18  <Field OutputStream mOutputStream>
	//   14   28:iload_1         
	//   15   29:bipush          8
	//   16   31:iushr           
	//   17   32:sipush          255
	//   18   35:iand            
	//   19   36:invokevirtual   #39  <Method void OutputStream.write(int)>
			return;
	//   20   39:return          
		}
		if(mByteOrder == ByteOrder.BIG_ENDIAN)
	//*  21   40:aload_0         
	//*  22   41:getfield        #20  <Field ByteOrder mByteOrder>
	//*  23   44:getstatic       #48  <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//*  24   47:if_acmpne       79
		{
			mOutputStream.write(word0 >>> 8 & 0xff);
	//   25   50:aload_0         
	//   26   51:getfield        #18  <Field OutputStream mOutputStream>
	//   27   54:iload_1         
	//   28   55:bipush          8
	//   29   57:iushr           
	//   30   58:sipush          255
	//   31   61:iand            
	//   32   62:invokevirtual   #39  <Method void OutputStream.write(int)>
			mOutputStream.write(word0 >>> 0 & 0xff);
	//   33   65:aload_0         
	//   34   66:getfield        #18  <Field OutputStream mOutputStream>
	//   35   69:iload_1         
	//   36   70:iconst_0        
	//   37   71:iushr           
	//   38   72:sipush          255
	//   39   75:iand            
	//   40   76:invokevirtual   #39  <Method void OutputStream.write(int)>
		}
	//   41   79:return          
	}

	public void writeUnsignedInt(long l)
		throws IOException
	{
		writeInt((int)l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:l2i             
	//    3    3:invokevirtual   #54  <Method void writeInt(int)>
	//    4    6:return          
	}

	public void writeUnsignedShort(int i)
		throws IOException
	{
		writeShort((short)i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:int2short       
	//    3    3:invokevirtual   #57  <Method void writeShort(short)>
	//    4    6:return          
	}

	private ByteOrder mByteOrder;
	private final OutputStream mOutputStream;

	public ExifInterface$ByteOrderedDataOutputStream(OutputStream outputstream, ByteOrder byteorder)
	{
		super(outputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void FilterOutputStream(OutputStream)>
		mOutputStream = outputstream;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #18  <Field OutputStream mOutputStream>
		mByteOrder = byteorder;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #20  <Field ByteOrder mByteOrder>
	//    9   15:return          
	}
}
