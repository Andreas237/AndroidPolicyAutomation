// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			VideoBitmapDecoder

static final class VideoBitmapDecoder$2
	implements com.bumptech.glide.load.r
{

	public void update(byte abyte0[], Integer integer, MessageDigest messagedigest)
	{
		if(integer == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		messagedigest.update(abyte0);
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #31  <Method void MessageDigest.update(byte[])>
		abyte0 = ((byte []) (buffer));
	//    6   10:aload_0         
	//    7   11:getfield        #23  <Field ByteBuffer buffer>
	//    8   14:astore_1        
		abyte0;
	//    9   15:aload_1         
		JVM INSTR monitorenter ;
	//   10   16:monitorenter    
		buffer.position(0);
	//   11   17:aload_0         
	//   12   18:getfield        #23  <Field ByteBuffer buffer>
	//   13   21:iconst_0        
	//   14   22:invokevirtual   #35  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   15   25:pop             
		messagedigest.update(buffer.putInt(integer.intValue()).array());
	//   16   26:aload_3         
	//   17   27:aload_0         
	//   18   28:getfield        #23  <Field ByteBuffer buffer>
	//   19   31:aload_2         
	//   20   32:invokevirtual   #41  <Method int Integer.intValue()>
	//   21   35:invokevirtual   #44  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   22   38:invokevirtual   #48  <Method byte[] ByteBuffer.array()>
	//   23   41:invokevirtual   #31  <Method void MessageDigest.update(byte[])>
		abyte0;
	//   24   44:aload_1         
		JVM INSTR monitorexit ;
	//   25   45:monitorexit     
		return;
	//   26   46:return          
		integer;
	//   27   47:astore_2        
	//*  28   48:aload_1         
		throw integer;
	//   29   49:monitorexit     
	//   30   50:aload_2         
	//   31   51:athrow          
	}

	public volatile void update(byte abyte0[], Object obj, MessageDigest messagedigest)
	{
		update(abyte0, (Integer)obj, messagedigest);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #37  <Class Integer>
	//    4    6:aload_3         
	//    5    7:invokevirtual   #51  <Method void update(byte[], Integer, MessageDigest)>
	//    6   10:return          
	}

	private final ByteBuffer buffer = ByteBuffer.allocate(4);

	VideoBitmapDecoder$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:invokestatic    #21  <Method ByteBuffer ByteBuffer.allocate(int)>
	//    5    9:putfield        #23  <Field ByteBuffer buffer>
	//    6   12:return          
	}
}
