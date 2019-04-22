// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			DefaultImageHeaderParser

private static final class DefaultImageHeaderParser$ByteBufferReader
	implements DefaultImageHeaderParser.Reader
{

	public int getByte()
	{
		if(byteBuffer.remaining() < 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field ByteBuffer byteBuffer>
	//*   2    4:invokevirtual   #36  <Method int ByteBuffer.remaining()>
	//*   3    7:iconst_1        
	//*   4    8:icmpge          13
			return -1;
	//    5   11:iconst_m1       
	//    6   12:ireturn         
		else
			return ((int) (byteBuffer.get()));
	//    7   13:aload_0         
	//    8   14:getfield        #18  <Field ByteBuffer byteBuffer>
	//    9   17:invokevirtual   #40  <Method byte ByteBuffer.get()>
	//   10   20:ireturn         
	}

	public int getUInt16()
	{
		return getByte() << 8 & 0xff00 | getByte() & 0xff;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method int getByte()>
	//    2    4:bipush          8
	//    3    6:ishl            
	//    4    7:ldc1            #44  <Int 65280>
	//    5    9:iand            
	//    6   10:aload_0         
	//    7   11:invokevirtual   #43  <Method int getByte()>
	//    8   14:sipush          255
	//    9   17:iand            
	//   10   18:ior             
	//   11   19:ireturn         
	}

	public short getUInt8()
	{
		return (short)(getByte() & 0xff);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method int getByte()>
	//    2    4:sipush          255
	//    3    7:iand            
	//    4    8:int2short       
	//    5    9:ireturn         
	}

	public int read(byte abyte0[], int i)
	{
		i = Math.min(i, byteBuffer.remaining());
	//    0    0:iload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field ByteBuffer byteBuffer>
	//    3    5:invokevirtual   #36  <Method int ByteBuffer.remaining()>
	//    4    8:invokestatic    #54  <Method int Math.min(int, int)>
	//    5   11:istore_2        
		if(i == 0)
	//*   6   12:iload_2         
	//*   7   13:ifne            18
		{
			return -1;
	//    8   16:iconst_m1       
	//    9   17:ireturn         
		} else
		{
			byteBuffer.get(abyte0, 0, i);
	//   10   18:aload_0         
	//   11   19:getfield        #18  <Field ByteBuffer byteBuffer>
	//   12   22:aload_1         
	//   13   23:iconst_0        
	//   14   24:iload_2         
	//   15   25:invokevirtual   #57  <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
	//   16   28:pop             
			return i;
	//   17   29:iload_2         
	//   18   30:ireturn         
		}
	}

	public long skip(long l)
	{
		int i = (int)Math.min(byteBuffer.remaining(), l);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ByteBuffer byteBuffer>
	//    2    4:invokevirtual   #36  <Method int ByteBuffer.remaining()>
	//    3    7:i2l             
	//    4    8:lload_1         
	//    5    9:invokestatic    #62  <Method long Math.min(long, long)>
	//    6   12:l2i             
	//    7   13:istore_3        
		ByteBuffer bytebuffer = byteBuffer;
	//    8   14:aload_0         
	//    9   15:getfield        #18  <Field ByteBuffer byteBuffer>
	//   10   18:astore          4
		bytebuffer.position(bytebuffer.position() + i);
	//   11   20:aload           4
	//   12   22:aload           4
	//   13   24:invokevirtual   #65  <Method int ByteBuffer.position()>
	//   14   27:iload_3         
	//   15   28:iadd            
	//   16   29:invokevirtual   #68  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   17   32:pop             
		return (long)i;
	//   18   33:iload_3         
	//   19   34:i2l             
	//   20   35:lreturn         
	}

	private final ByteBuffer byteBuffer;

	DefaultImageHeaderParser$ByteBufferReader(ByteBuffer bytebuffer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		byteBuffer = bytebuffer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field ByteBuffer byteBuffer>
		bytebuffer.order(ByteOrder.BIG_ENDIAN);
	//    5    9:aload_1         
	//    6   10:getstatic       #24  <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//    7   13:invokevirtual   #30  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//    8   16:pop             
	//    9   17:return          
	}
}
