// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			VideoDecoder

class VideoDecoder$1
	implements com.bumptech.glide.load.Updater
{

	public void update(byte abyte0[], Long long1, MessageDigest messagedigest)
	{
		messagedigest.update(abyte0);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #32  <Method void MessageDigest.update(byte[])>
		synchronized(buffer)
	//*   3    5:aload_0         
	//*   4    6:getfield        #23  <Field ByteBuffer buffer>
	//*   5    9:astore_1        
	//*   6   10:aload_1         
	//*   7   11:monitorenter    
		{
			buffer.position(0);
	//    8   12:aload_0         
	//    9   13:getfield        #23  <Field ByteBuffer buffer>
	//   10   16:iconst_0        
	//   11   17:invokevirtual   #36  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   12   20:pop             
			messagedigest.update(buffer.putLong(long1.longValue()).array());
	//   13   21:aload_3         
	//   14   22:aload_0         
	//   15   23:getfield        #23  <Field ByteBuffer buffer>
	//   16   26:aload_2         
	//   17   27:invokevirtual   #42  <Method long Long.longValue()>
	//   18   30:invokevirtual   #46  <Method ByteBuffer ByteBuffer.putLong(long)>
	//   19   33:invokevirtual   #50  <Method byte[] ByteBuffer.array()>
	//   20   36:invokevirtual   #32  <Method void MessageDigest.update(byte[])>
		}
	//   21   39:aload_1         
	//   22   40:monitorexit     
		return;
	//   23   41:return          
		long1;
	//   24   42:astore_2        
		abyte0;
	//   25   43:aload_1         
		JVM INSTR monitorexit ;
	//   26   44:monitorexit     
		throw long1;
	//   27   45:aload_2         
	//   28   46:athrow          
	}

	public volatile void update(byte abyte0[], Object obj, MessageDigest messagedigest)
	{
		update(abyte0, (Long)obj, messagedigest);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #38  <Class Long>
	//    4    6:aload_3         
	//    5    7:invokevirtual   #54  <Method void update(byte[], Long, MessageDigest)>
	//    6   10:return          
	}

	private final ByteBuffer buffer = ByteBuffer.allocate(8);

	VideoDecoder$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:bipush          8
	//    4    7:invokestatic    #21  <Method ByteBuffer ByteBuffer.allocate(int)>
	//    5   10:putfield        #23  <Field ByteBuffer buffer>
	//    6   13:return          
	}
}
