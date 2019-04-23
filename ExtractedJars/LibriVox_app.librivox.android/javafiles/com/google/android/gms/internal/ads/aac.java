// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public final class aac
{

	public static int a(byte byte0)
	{
		int i = ((int) (byte0));
	//    0    0:iload_0         
	//    1    1:istore_1        
		if(byte0 < 0)
	//*   2    2:iload_0         
	//*   3    3:ifge            12
			i = byte0 + 256;
	//    4    6:iload_0         
	//    5    7:sipush          256
	//    6   10:iadd            
	//    7   11:istore_1        
		return i;
	//    8   12:iload_1         
	//    9   13:ireturn         
	}

	public static long a(ByteBuffer bytebuffer)
	{
		long l1 = bytebuffer.getInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #14  <Method int ByteBuffer.getInt()>
	//    2    4:i2l             
	//    3    5:lstore_3        
		long l = l1;
	//    4    6:lload_3         
	//    5    7:lstore_1        
		if(l1 < 0L)
	//*   6    8:lload_3         
	//*   7    9:lconst_0        
	//*   8   10:lcmp            
	//*   9   11:ifge            20
			l = l1 + 0x0L;
	//   10   14:lload_3         
	//   11   15:ldc2w           #15  <Long 0x0L>
	//   12   18:ladd            
	//   13   19:lstore_1        
		return l;
	//   14   20:lload_1         
	//   15   21:lreturn         
	}

	public static int b(ByteBuffer bytebuffer)
	{
		return (a(bytebuffer.get()) << 8) + 0 + a(bytebuffer.get());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method byte ByteBuffer.get()>
	//    2    4:invokestatic    #24  <Method int a(byte)>
	//    3    7:bipush          8
	//    4    9:ishl            
	//    5   10:iconst_0        
	//    6   11:iadd            
	//    7   12:aload_0         
	//    8   13:invokevirtual   #22  <Method byte ByteBuffer.get()>
	//    9   16:invokestatic    #24  <Method int a(byte)>
	//   10   19:iadd            
	//   11   20:ireturn         
	}

	public static long c(ByteBuffer bytebuffer)
	{
		long l = (a(bytebuffer) << 32) + 0L;
	//    0    0:aload_0         
	//    1    1:invokestatic    #27  <Method long a(ByteBuffer)>
	//    2    4:bipush          32
	//    3    6:lshl            
	//    4    7:lconst_0        
	//    5    8:ladd            
	//    6    9:lstore_1        
		if(l >= 0L)
	//*   7   10:lload_1         
	//*   8   11:lconst_0        
	//*   9   12:lcmp            
	//*  10   13:iflt            23
			return l + a(bytebuffer);
	//   11   16:lload_1         
	//   12   17:aload_0         
	//   13   18:invokestatic    #27  <Method long a(ByteBuffer)>
	//   14   21:ladd            
	//   15   22:lreturn         
		else
			throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
	//   16   23:new             #29  <Class RuntimeException>
	//   17   26:dup             
	//   18   27:ldc1            #31  <String "I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt">
	//   19   29:invokespecial   #35  <Method void RuntimeException(String)>
	//   20   32:athrow          
	}

	public static double d(ByteBuffer bytebuffer)
	{
		byte abyte0[] = new byte[4];
	//    0    0:iconst_4        
	//    1    1:newarray        byte[]
	//    2    3:astore_3        
		bytebuffer.get(abyte0);
	//    3    4:aload_0         
	//    4    5:aload_3         
	//    5    6:invokevirtual   #40  <Method ByteBuffer ByteBuffer.get(byte[])>
	//    6    9:pop             
		double d1 = 0 | abyte0[0] << 24 & 0xff000000 | abyte0[1] << 16 & 0xff0000 | abyte0[2] << 8 & 0xff00 | abyte0[3] & 0xff;
	//    7   10:iconst_0        
	//    8   11:aload_3         
	//    9   12:iconst_0        
	//   10   13:baload          
	//   11   14:bipush          24
	//   12   16:ishl            
	//   13   17:ldc1            #41  <Int 0xff000000>
	//   14   19:iand            
	//   15   20:ior             
	//   16   21:aload_3         
	//   17   22:iconst_1        
	//   18   23:baload          
	//   19   24:bipush          16
	//   20   26:ishl            
	//   21   27:ldc1            #42  <Int 0xff0000>
	//   22   29:iand            
	//   23   30:ior             
	//   24   31:aload_3         
	//   25   32:iconst_2        
	//   26   33:baload          
	//   27   34:bipush          8
	//   28   36:ishl            
	//   29   37:ldc1            #43  <Int 65280>
	//   30   39:iand            
	//   31   40:ior             
	//   32   41:aload_3         
	//   33   42:iconst_3        
	//   34   43:baload          
	//   35   44:sipush          255
	//   36   47:iand            
	//   37   48:ior             
	//   38   49:i2d             
	//   39   50:dstore_1        
		Double.isNaN(d1);
	//   40   51:dload_1         
	//   41   52:invokestatic    #49  <Method boolean Double.isNaN(double)>
	//   42   55:pop             
		return d1 / 65536D;
	//   43   56:dload_1         
	//   44   57:ldc2w           #50  <Double 65536D>
	//   45   60:ddiv            
	//   46   61:dreturn         
	}

	public static double e(ByteBuffer bytebuffer)
	{
		byte abyte0[] = new byte[4];
	//    0    0:iconst_4        
	//    1    1:newarray        byte[]
	//    2    3:astore_3        
		bytebuffer.get(abyte0);
	//    3    4:aload_0         
	//    4    5:aload_3         
	//    5    6:invokevirtual   #40  <Method ByteBuffer ByteBuffer.get(byte[])>
	//    6    9:pop             
		double d1 = 0 | abyte0[0] << 24 & 0xff000000 | abyte0[1] << 16 & 0xff0000 | abyte0[2] << 8 & 0xff00 | abyte0[3] & 0xff;
	//    7   10:iconst_0        
	//    8   11:aload_3         
	//    9   12:iconst_0        
	//   10   13:baload          
	//   11   14:bipush          24
	//   12   16:ishl            
	//   13   17:ldc1            #41  <Int 0xff000000>
	//   14   19:iand            
	//   15   20:ior             
	//   16   21:aload_3         
	//   17   22:iconst_1        
	//   18   23:baload          
	//   19   24:bipush          16
	//   20   26:ishl            
	//   21   27:ldc1            #42  <Int 0xff0000>
	//   22   29:iand            
	//   23   30:ior             
	//   24   31:aload_3         
	//   25   32:iconst_2        
	//   26   33:baload          
	//   27   34:bipush          8
	//   28   36:ishl            
	//   29   37:ldc1            #43  <Int 65280>
	//   30   39:iand            
	//   31   40:ior             
	//   32   41:aload_3         
	//   33   42:iconst_3        
	//   34   43:baload          
	//   35   44:sipush          255
	//   36   47:iand            
	//   37   48:ior             
	//   38   49:i2d             
	//   39   50:dstore_1        
		Double.isNaN(d1);
	//   40   51:dload_1         
	//   41   52:invokestatic    #49  <Method boolean Double.isNaN(double)>
	//   42   55:pop             
		return d1 / 1073741824D;
	//   43   56:dload_1         
	//   44   57:ldc2w           #53  <Double 1073741824D>
	//   45   60:ddiv            
	//   46   61:dreturn         
	}

	public static String f(ByteBuffer bytebuffer)
	{
		byte abyte0[] = new byte[4];
	//    0    0:iconst_4        
	//    1    1:newarray        byte[]
	//    2    3:astore_1        
		bytebuffer.get(abyte0);
	//    3    4:aload_0         
	//    4    5:aload_1         
	//    5    6:invokevirtual   #40  <Method ByteBuffer ByteBuffer.get(byte[])>
	//    6    9:pop             
		try
		{
			bytebuffer = ((ByteBuffer) (new String(abyte0, "ISO-8859-1")));
	//    7   10:new             #60  <Class String>
	//    8   13:dup             
	//    9   14:aload_1         
	//   10   15:ldc1            #62  <String "ISO-8859-1">
	//   11   17:invokespecial   #65  <Method void String(byte[], String)>
	//   12   20:astore_0        
		}
	//*  13   21:aload_0         
	//*  14   22:areturn         
		// Misplaced declaration of an exception variable
		catch(ByteBuffer bytebuffer)
	//*  15   23:astore_0        
		{
			throw new RuntimeException(((Throwable) (bytebuffer)));
	//   16   24:new             #29  <Class RuntimeException>
	//   17   27:dup             
	//   18   28:aload_0         
	//   19   29:invokespecial   #68  <Method void RuntimeException(Throwable)>
	//   20   32:athrow          
		}
		return ((String) (bytebuffer));
	}
}
