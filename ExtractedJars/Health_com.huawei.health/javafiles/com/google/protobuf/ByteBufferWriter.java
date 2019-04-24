// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// Referenced classes of package com.google.protobuf:
//			UnsafeUtil

final class ByteBufferWriter
{

	private ByteBufferWriter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
	//    2    4:return          
	}

	static void clearCachedBuffer()
	{
		BUFFER.set(((Object) (null)));
	//    0    0:getstatic       #29  <Field ThreadLocal BUFFER>
	//    1    3:aconst_null     
	//    2    4:invokevirtual   #50  <Method void ThreadLocal.set(Object)>
	//    3    7:return          
	}

	private static byte[] getBuffer()
	{
		SoftReference softreference = (SoftReference)BUFFER.get();
	//    0    0:getstatic       #29  <Field ThreadLocal BUFFER>
	//    1    3:invokevirtual   #56  <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #58  <Class SoftReference>
	//    3    9:astore_0        
		if(softreference == null)
	//*   4   10:aload_0         
	//*   5   11:ifnonnull       16
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		else
			return (byte[])softreference.get();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #59  <Method Object SoftReference.get()>
	//   10   20:checkcast       #61  <Class byte[]>
	//   11   23:areturn         
	}

	private static long getChannelFieldOffset(Class class1)
	{
		if(class1 == null)
			break MISSING_BLOCK_LABEL_26;
	//    0    0:aload_0         
	//    1    1:ifnull          22
		long l;
		if(!UnsafeUtil.hasUnsafeArrayOperations())
			break MISSING_BLOCK_LABEL_26;
	//    2    4:invokestatic    #69  <Method boolean UnsafeUtil.hasUnsafeArrayOperations()>
	//    3    7:ifeq            22
		l = UnsafeUtil.objectFieldOffset(class1.getDeclaredField("channel"));
	//    4   10:aload_0         
	//    5   11:ldc1            #71  <String "channel">
	//    6   13:invokevirtual   #77  <Method java.lang.reflect.Field Class.getDeclaredField(String)>
	//    7   16:invokestatic    #81  <Method long UnsafeUtil.objectFieldOffset(java.lang.reflect.Field)>
	//    8   19:lstore_1        
		return l;
	//    9   20:lload_1         
	//   10   21:lreturn         
	//*  11   22:goto            26
		class1;
	//   12   25:astore_0        
		return -1L;
	//   13   26:ldc2w           #82  <Long -1L>
	//   14   29:lreturn         
	}

	private static byte[] getOrCreateBuffer(int i)
	{
		byte abyte0[];
label0:
		{
			i = Math.max(i, 1024);
	//    0    0:iload_0         
	//    1    1:sipush          1024
	//    2    4:invokestatic    #93  <Method int Math.max(int, int)>
	//    3    7:istore_0        
			byte abyte1[] = getBuffer();
	//    4    8:invokestatic    #95  <Method byte[] getBuffer()>
	//    5   11:astore_2        
			if(abyte1 != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          27
			{
				abyte0 = abyte1;
	//    8   16:aload_2         
	//    9   17:astore_1        
				if(!needToReallocate(i, abyte1.length))
					break label0;
	//   10   18:iload_0         
	//   11   19:aload_2         
	//   12   20:arraylength     
	//   13   21:invokestatic    #99  <Method boolean needToReallocate(int, int)>
	//   14   24:ifeq            46
			}
			abyte1 = new byte[i];
	//   15   27:iload_0         
	//   16   28:newarray        byte[]
	//   17   30:astore_2        
			abyte0 = abyte1;
	//   18   31:aload_2         
	//   19   32:astore_1        
			if(i <= 16384)
	//*  20   33:iload_0         
	//*  21   34:sipush          16384
	//*  22   37:icmpgt          46
			{
				setBuffer(abyte1);
	//   23   40:aload_2         
	//   24   41:invokestatic    #103 <Method void setBuffer(byte[])>
				abyte0 = abyte1;
	//   25   44:aload_2         
	//   26   45:astore_1        
			}
		}
		return abyte0;
	//   27   46:aload_1         
	//   28   47:areturn         
	}

	private static boolean needToReallocate(int i, int j)
	{
		return j < i && (float)j < (float)i * 0.5F;
	//    0    0:iload_1         
	//    1    1:iload_0         
	//    2    2:icmpge          18
	//    3    5:iload_1         
	//    4    6:i2f             
	//    5    7:iload_0         
	//    6    8:i2f             
	//    7    9:ldc1            #10  <Float 0.5F>
	//    8   11:fmul            
	//    9   12:fcmpg           
	//   10   13:ifge            18
	//   11   16:iconst_1        
	//   12   17:ireturn         
	//   13   18:iconst_0        
	//   14   19:ireturn         
	}

	private static Class safeGetClass(String s)
	{
		try
		{
			s = ((String) (Class.forName(s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #108 <Method Class Class.forName(String)>
	//    2    4:astore_0        
		}
	//*   3    5:aload_0         
	//*   4    6:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5    7:astore_0        
		{
			return null;
	//    6    8:aconst_null     
	//    7    9:areturn         
		}
		return ((Class) (s));
	}

	private static void setBuffer(byte abyte0[])
	{
		BUFFER.set(((Object) (new SoftReference(((Object) (abyte0))))));
	//    0    0:getstatic       #29  <Field ThreadLocal BUFFER>
	//    1    3:new             #58  <Class SoftReference>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:invokespecial   #111 <Method void SoftReference(Object)>
	//    5   11:invokevirtual   #50  <Method void ThreadLocal.set(Object)>
	//    6   14:return          
	}

	static void write(ByteBuffer bytebuffer, OutputStream outputstream)
		throws IOException
	{
		int i = bytebuffer.position();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #121 <Method int ByteBuffer.position()>
	//    2    4:istore_2        
		if(bytebuffer.hasArray())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #124 <Method boolean ByteBuffer.hasArray()>
	//*   5    9:ifeq            36
		{
			outputstream.write(bytebuffer.array(), bytebuffer.arrayOffset() + bytebuffer.position(), bytebuffer.remaining());
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #127 <Method byte[] ByteBuffer.array()>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #130 <Method int ByteBuffer.arrayOffset()>
	//   11   21:aload_0         
	//   12   22:invokevirtual   #121 <Method int ByteBuffer.position()>
	//   13   25:iadd            
	//   14   26:aload_0         
	//   15   27:invokevirtual   #133 <Method int ByteBuffer.remaining()>
	//   16   30:invokevirtual   #138 <Method void OutputStream.write(byte[], int, int)>
			break MISSING_BLOCK_LABEL_91;
	//   17   33:goto            91
		}
		if(!writeToChannel(bytebuffer, outputstream))
	//*  18   36:aload_0         
	//*  19   37:aload_1         
	//*  20   38:invokestatic    #142 <Method boolean writeToChannel(ByteBuffer, OutputStream)>
	//*  21   41:ifne            91
		{
			byte abyte0[] = getOrCreateBuffer(bytebuffer.remaining());
	//   22   44:aload_0         
	//   23   45:invokevirtual   #133 <Method int ByteBuffer.remaining()>
	//   24   48:invokestatic    #144 <Method byte[] getOrCreateBuffer(int)>
	//   25   51:astore          4
			int j;
			for(; bytebuffer.hasRemaining(); outputstream.write(abyte0, 0, j))
	//*  26   53:aload_0         
	//*  27   54:invokevirtual   #147 <Method boolean ByteBuffer.hasRemaining()>
	//*  28   57:ifeq            91
			{
				j = Math.min(bytebuffer.remaining(), abyte0.length);
	//   29   60:aload_0         
	//   30   61:invokevirtual   #133 <Method int ByteBuffer.remaining()>
	//   31   64:aload           4
	//   32   66:arraylength     
	//   33   67:invokestatic    #150 <Method int Math.min(int, int)>
	//   34   70:istore_3        
				bytebuffer.get(abyte0, 0, j);
	//   35   71:aload_0         
	//   36   72:aload           4
	//   37   74:iconst_0        
	//   38   75:iload_3         
	//   39   76:invokevirtual   #153 <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
	//   40   79:pop             
			}

	//   41   80:aload_1         
	//   42   81:aload           4
	//   43   83:iconst_0        
	//   44   84:iload_3         
	//   45   85:invokevirtual   #138 <Method void OutputStream.write(byte[], int, int)>
		}
	//*  46   88:goto            53
		bytebuffer.position(i);
	//   47   91:aload_0         
	//   48   92:iload_2         
	//   49   93:invokevirtual   #156 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   50   96:pop             
		return;
	//   51   97:return          
		outputstream;
	//   52   98:astore_1        
		bytebuffer.position(i);
	//   53   99:aload_0         
	//   54  100:iload_2         
	//   55  101:invokevirtual   #156 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   56  104:pop             
		throw outputstream;
	//   57  105:aload_1         
	//   58  106:athrow          
	}

	private static boolean writeToChannel(ByteBuffer bytebuffer, OutputStream outputstream)
		throws IOException
	{
		if(CHANNEL_FIELD_OFFSET >= 0L && FILE_OUTPUT_STREAM_CLASS.isInstance(((Object) (outputstream))))
	//*   0    0:getstatic       #43  <Field long CHANNEL_FIELD_OFFSET>
	//*   1    3:lconst_0        
	//*   2    4:lcmp            
	//*   3    5:iflt            51
	//*   4    8:getstatic       #37  <Field Class FILE_OUTPUT_STREAM_CLASS>
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #163 <Method boolean Class.isInstance(Object)>
	//*   7   15:ifeq            51
		{
			Object obj = null;
	//    8   18:aconst_null     
	//    9   19:astore_2        
			try
			{
				outputstream = ((OutputStream) ((WritableByteChannel)UnsafeUtil.getObject(((Object) (outputstream)), CHANNEL_FIELD_OFFSET)));
	//   10   20:aload_1         
	//   11   21:getstatic       #43  <Field long CHANNEL_FIELD_OFFSET>
	//   12   24:invokestatic    #167 <Method Object UnsafeUtil.getObject(Object, long)>
	//   13   27:checkcast       #169 <Class WritableByteChannel>
	//   14   30:astore_1        
			}
	//*  15   31:goto            37
			// Misplaced declaration of an exception variable
			catch(OutputStream outputstream)
	//*  16   34:astore_1        
			{
				outputstream = ((OutputStream) (obj));
	//   17   35:aload_2         
	//   18   36:astore_1        
			}
			if(outputstream != null)
	//*  19   37:aload_1         
	//*  20   38:ifnull          51
			{
				((WritableByteChannel) (outputstream)).write(bytebuffer);
	//   21   41:aload_1         
	//   22   42:aload_0         
	//   23   43:invokeinterface #172 <Method int WritableByteChannel.write(ByteBuffer)>
	//   24   48:pop             
				return true;
	//   25   49:iconst_1        
	//   26   50:ireturn         
			}
		}
		return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
	}

	private static final ThreadLocal BUFFER = new ThreadLocal();
	private static final float BUFFER_REALLOCATION_THRESHOLD = 0.5F;
	private static final long CHANNEL_FIELD_OFFSET;
	private static final Class FILE_OUTPUT_STREAM_CLASS;
	private static final int MAX_CACHED_BUFFER_SIZE = 16384;
	private static final int MIN_CACHED_BUFFER_SIZE = 1024;

	static 
	{
	//    0    0:new             #24  <Class ThreadLocal>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void ThreadLocal()>
	//    3    7:putstatic       #29  <Field ThreadLocal BUFFER>
		FILE_OUTPUT_STREAM_CLASS = safeGetClass("java.io.FileOutputStream");
	//    4   10:ldc1            #31  <String "java.io.FileOutputStream">
	//    5   12:invokestatic    #35  <Method Class safeGetClass(String)>
	//    6   15:putstatic       #37  <Field Class FILE_OUTPUT_STREAM_CLASS>
		CHANNEL_FIELD_OFFSET = getChannelFieldOffset(FILE_OUTPUT_STREAM_CLASS);
	//    7   18:getstatic       #37  <Field Class FILE_OUTPUT_STREAM_CLASS>
	//    8   21:invokestatic    #41  <Method long getChannelFieldOffset(Class)>
	//    9   24:putstatic       #43  <Field long CHANNEL_FIELD_OFFSET>
	//*  10   27:return          
	}
}
