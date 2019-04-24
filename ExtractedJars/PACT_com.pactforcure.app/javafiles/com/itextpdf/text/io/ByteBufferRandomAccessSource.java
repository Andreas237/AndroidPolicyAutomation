// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.io;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedAction;

// Referenced classes of package com.itextpdf.text.io:
//			RandomAccessSource

class ByteBufferRandomAccessSource
	implements RandomAccessSource
{

	public ByteBufferRandomAccessSource(ByteBuffer bytebuffer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		byteBuffer = bytebuffer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field ByteBuffer byteBuffer>
	//    5    9:return          
	}

	private static boolean clean(ByteBuffer bytebuffer)
	{
		if(bytebuffer == null || !bytebuffer.isDirect())
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #26  <Method boolean ByteBuffer.isDirect()>
	//*   4    8:ifne            13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return ((Boolean)AccessController.doPrivileged(new PrivilegedAction(bytebuffer) {

				public Boolean run()
				{
					Boolean boolean1 = Boolean.FALSE;
				//    0    0:getstatic       #32  <Field Boolean Boolean.FALSE>
				//    1    3:astore_1        
					Object obj;
					try
					{
						obj = ((Object) (((Object) (buffer)).getClass().getMethod("cleaner", (Class[])null)));
				//    2    4:aload_0         
				//    3    5:getfield        #18  <Field ByteBuffer val$buffer>
				//    4    8:invokevirtual   #36  <Method Class Object.getClass()>
				//    5   11:ldc1            #38  <String "cleaner">
				//    6   13:aconst_null     
				//    7   14:checkcast       #40  <Class Class[]>
				//    8   17:invokevirtual   #46  <Method Method Class.getMethod(String, Class[])>
				//    9   20:astore_2        
						((Method) (obj)).setAccessible(true);
				//   10   21:aload_2         
				//   11   22:iconst_1        
				//   12   23:invokevirtual   #52  <Method void Method.setAccessible(boolean)>
						obj = ((Method) (obj)).invoke(((Object) (buffer)), (Object[])null);
				//   13   26:aload_2         
				//   14   27:aload_0         
				//   15   28:getfield        #18  <Field ByteBuffer val$buffer>
				//   16   31:aconst_null     
				//   17   32:checkcast       #54  <Class Object[]>
				//   18   35:invokevirtual   #58  <Method Object Method.invoke(Object, Object[])>
				//   19   38:astore_2        
						obj.getClass().getMethod("clean", (Class[])null).invoke(obj, (Object[])null);
				//   20   39:aload_2         
				//   21   40:invokevirtual   #36  <Method Class Object.getClass()>
				//   22   43:ldc1            #59  <String "clean">
				//   23   45:aconst_null     
				//   24   46:checkcast       #40  <Class Class[]>
				//   25   49:invokevirtual   #46  <Method Method Class.getMethod(String, Class[])>
				//   26   52:aload_2         
				//   27   53:aconst_null     
				//   28   54:checkcast       #54  <Class Object[]>
				//   29   57:invokevirtual   #58  <Method Object Method.invoke(Object, Object[])>
				//   30   60:pop             
						obj = ((Object) (Boolean.TRUE));
				//   31   61:getstatic       #62  <Field Boolean Boolean.TRUE>
				//   32   64:astore_2        
					}
				//*  33   65:aload_2         
				//*  34   66:areturn         
					catch(Exception exception)
				//*  35   67:astore_2        
					{
						return boolean1;
				//   36   68:aload_1         
				//   37   69:areturn         
					}
					return ((Boolean) (obj));
				}

				public volatile Object run()
				{
					return ((Object) (run()));
				//    0    0:aload_0         
				//    1    1:invokevirtual   #65  <Method Boolean run()>
				//    2    4:areturn         
				}

				final ByteBuffer val$buffer;

			
			{
				buffer = bytebuffer;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ByteBuffer val$buffer>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
			}
)).booleanValue();
	//    7   13:new             #8   <Class ByteBufferRandomAccessSource$1>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokespecial   #28  <Method void ByteBufferRandomAccessSource$1(ByteBuffer)>
	//   11   21:invokestatic    #34  <Method Object AccessController.doPrivileged(PrivilegedAction)>
	//   12   24:checkcast       #36  <Class Boolean>
	//   13   27:invokevirtual   #39  <Method boolean Boolean.booleanValue()>
	//   14   30:ireturn         
	}

	public void close()
		throws IOException
	{
		clean(byteBuffer);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ByteBuffer byteBuffer>
	//    2    4:invokestatic    #44  <Method boolean clean(ByteBuffer)>
	//    3    7:pop             
	//    4    8:return          
	}

	public int get(long l)
		throws IOException
	{
		if(l > 0x7fffffffL)
	//*   0    0:lload_1         
	//*   1    1:ldc2w           #50  <Long 0x7fffffffL>
	//*   2    4:lcmp            
	//*   3    5:ifle            18
			throw new IllegalArgumentException("Position must be less than Integer.MAX_VALUE");
	//    4    8:new             #53  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #55  <String "Position must be less than Integer.MAX_VALUE">
	//    7   14:invokespecial   #58  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		if(l >= (long)byteBuffer.limit())
	//*   9   18:lload_1         
	//*  10   19:aload_0         
	//*  11   20:getfield        #17  <Field ByteBuffer byteBuffer>
	//*  12   23:invokevirtual   #62  <Method int ByteBuffer.limit()>
	//*  13   26:i2l             
	//*  14   27:lcmp            
	//*  15   28:iflt            33
			return -1;
	//   16   31:iconst_m1       
	//   17   32:ireturn         
		byte byte0;
		try
		{
			byte0 = byteBuffer.get((int)l);
	//   18   33:aload_0         
	//   19   34:getfield        #17  <Field ByteBuffer byteBuffer>
	//   20   37:lload_1         
	//   21   38:l2i             
	//   22   39:invokevirtual   #65  <Method byte ByteBuffer.get(int)>
	//   23   42:istore_3        
		}
	//*  24   43:iload_3         
	//*  25   44:sipush          255
	//*  26   47:iand            
	//*  27   48:ireturn         
		catch(BufferUnderflowException bufferunderflowexception)
	//*  28   49:astore          4
		{
			return -1;
	//   29   51:iconst_m1       
	//   30   52:ireturn         
		}
		return byte0 & 0xff;
	}

	public int get(long l, byte abyte0[], int i, int j)
		throws IOException
	{
		if(l > 0x7fffffffL)
	//*   0    0:lload_1         
	//*   1    1:ldc2w           #50  <Long 0x7fffffffL>
	//*   2    4:lcmp            
	//*   3    5:ifle            18
			throw new IllegalArgumentException("Position must be less than Integer.MAX_VALUE");
	//    4    8:new             #53  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #55  <String "Position must be less than Integer.MAX_VALUE">
	//    7   14:invokespecial   #58  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		if(l >= (long)byteBuffer.limit())
	//*   9   18:lload_1         
	//*  10   19:aload_0         
	//*  11   20:getfield        #17  <Field ByteBuffer byteBuffer>
	//*  12   23:invokevirtual   #62  <Method int ByteBuffer.limit()>
	//*  13   26:i2l             
	//*  14   27:lcmp            
	//*  15   28:iflt            33
		{
			return -1;
	//   16   31:iconst_m1       
	//   17   32:ireturn         
		} else
		{
			byteBuffer.position((int)l);
	//   18   33:aload_0         
	//   19   34:getfield        #17  <Field ByteBuffer byteBuffer>
	//   20   37:lload_1         
	//   21   38:l2i             
	//   22   39:invokevirtual   #70  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   23   42:pop             
			j = Math.min(j, byteBuffer.remaining());
	//   24   43:iload           5
	//   25   45:aload_0         
	//   26   46:getfield        #17  <Field ByteBuffer byteBuffer>
	//   27   49:invokevirtual   #73  <Method int ByteBuffer.remaining()>
	//   28   52:invokestatic    #79  <Method int Math.min(int, int)>
	//   29   55:istore          5
			byteBuffer.get(abyte0, i, j);
	//   30   57:aload_0         
	//   31   58:getfield        #17  <Field ByteBuffer byteBuffer>
	//   32   61:aload_3         
	//   33   62:iload           4
	//   34   64:iload           5
	//   35   66:invokevirtual   #82  <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
	//   36   69:pop             
			return j;
	//   37   70:iload           5
	//   38   72:ireturn         
		}
	}

	public long length()
	{
		return (long)byteBuffer.limit();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ByteBuffer byteBuffer>
	//    2    4:invokevirtual   #62  <Method int ByteBuffer.limit()>
	//    3    7:i2l             
	//    4    8:lreturn         
	}

	private final ByteBuffer byteBuffer;
}
