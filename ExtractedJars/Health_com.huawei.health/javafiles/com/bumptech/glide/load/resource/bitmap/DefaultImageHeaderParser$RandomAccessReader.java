// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			DefaultImageHeaderParser

static final class DefaultImageHeaderParser$RandomAccessReader
{

	private boolean isAvailable(int i, int j)
	{
		return data.remaining() - i >= j;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ByteBuffer data>
	//    2    4:invokevirtual   #43  <Method int ByteBuffer.remaining()>
	//    3    7:iload_1         
	//    4    8:isub            
	//    5    9:iload_2         
	//    6   10:icmplt          15
	//    7   13:iconst_1        
	//    8   14:ireturn         
	//    9   15:iconst_0        
	//   10   16:ireturn         
	}

	short getInt16(int i)
	{
		if(isAvailable(i, 2))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:iconst_2        
	//*   3    3:invokespecial   #47  <Method boolean isAvailable(int, int)>
	//*   4    6:ifeq            18
			return data.getShort(i);
	//    5    9:aload_0         
	//    6   10:getfield        #36  <Field ByteBuffer data>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #50  <Method short ByteBuffer.getShort(int)>
	//    9   17:ireturn         
		else
			return -1;
	//   10   18:iconst_m1       
	//   11   19:ireturn         
	}

	int getInt32(int i)
	{
		if(isAvailable(i, 4))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:iconst_4        
	//*   3    3:invokespecial   #47  <Method boolean isAvailable(int, int)>
	//*   4    6:ifeq            18
			return data.getInt(i);
	//    5    9:aload_0         
	//    6   10:getfield        #36  <Field ByteBuffer data>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #55  <Method int ByteBuffer.getInt(int)>
	//    9   17:ireturn         
		else
			return -1;
	//   10   18:iconst_m1       
	//   11   19:ireturn         
	}

	int length()
	{
		return data.remaining();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ByteBuffer data>
	//    2    4:invokevirtual   #43  <Method int ByteBuffer.remaining()>
	//    3    7:ireturn         
	}

	void order(ByteOrder byteorder)
	{
		data.order(byteorder);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ByteBuffer data>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #30  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//    4    8:pop             
	//    5    9:return          
	}

	private final ByteBuffer data;

	DefaultImageHeaderParser$RandomAccessReader(byte abyte0[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		data = (ByteBuffer)ByteBuffer.wrap(abyte0).order(ByteOrder.BIG_ENDIAN).limit(i);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #20  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//    5    9:getstatic       #26  <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//    6   12:invokevirtual   #30  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//    7   15:iload_2         
	//    8   16:invokevirtual   #34  <Method java.nio.Buffer ByteBuffer.limit(int)>
	//    9   19:checkcast       #16  <Class ByteBuffer>
	//   10   22:putfield        #36  <Field ByteBuffer data>
	//   11   25:return          
	}
}
