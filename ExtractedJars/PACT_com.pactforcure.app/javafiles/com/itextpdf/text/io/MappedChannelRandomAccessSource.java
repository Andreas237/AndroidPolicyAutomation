// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.io;

import java.io.IOException;
import java.nio.channels.FileChannel;

// Referenced classes of package com.itextpdf.text.io:
//			RandomAccessSource, ByteBufferRandomAccessSource, MapFailedException

class MappedChannelRandomAccessSource
	implements RandomAccessSource
{

	public MappedChannelRandomAccessSource(FileChannel filechannel, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		if(l < 0L)
	//*   2    4:lload_2         
	//*   3    5:lconst_0        
	//*   4    6:lcmp            
	//*   5    7:ifge            37
			throw new IllegalArgumentException((new StringBuilder()).append(l).append(" is negative").toString());
	//    6   10:new             #20  <Class IllegalArgumentException>
	//    7   13:dup             
	//    8   14:new             #22  <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #23  <Method void StringBuilder()>
	//   11   21:lload_2         
	//   12   22:invokevirtual   #27  <Method StringBuilder StringBuilder.append(long)>
	//   13   25:ldc1            #29  <String " is negative">
	//   14   27:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:invokevirtual   #36  <Method String StringBuilder.toString()>
	//   16   33:invokespecial   #39  <Method void IllegalArgumentException(String)>
	//   17   36:athrow          
		if(l1 <= 0L)
	//*  18   37:lload           4
	//*  19   39:lconst_0        
	//*  20   40:lcmp            
	//*  21   41:ifgt            72
		{
			throw new IllegalArgumentException((new StringBuilder()).append(l1).append(" is zero or negative").toString());
	//   22   44:new             #20  <Class IllegalArgumentException>
	//   23   47:dup             
	//   24   48:new             #22  <Class StringBuilder>
	//   25   51:dup             
	//   26   52:invokespecial   #23  <Method void StringBuilder()>
	//   27   55:lload           4
	//   28   57:invokevirtual   #27  <Method StringBuilder StringBuilder.append(long)>
	//   29   60:ldc1            #41  <String " is zero or negative">
	//   30   62:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   31   65:invokevirtual   #36  <Method String StringBuilder.toString()>
	//   32   68:invokespecial   #39  <Method void IllegalArgumentException(String)>
	//   33   71:athrow          
		} else
		{
			channel = filechannel;
	//   34   72:aload_0         
	//   35   73:aload_1         
	//   36   74:putfield        #43  <Field FileChannel channel>
			offset = l;
	//   37   77:aload_0         
	//   38   78:lload_2         
	//   39   79:putfield        #45  <Field long offset>
			length = l1;
	//   40   82:aload_0         
	//   41   83:lload           4
	//   42   85:putfield        #47  <Field long length>
			source = null;
	//   43   88:aload_0         
	//   44   89:aconst_null     
	//   45   90:putfield        #49  <Field ByteBufferRandomAccessSource source>
			return;
	//   46   93:return          
		}
	}

	private static boolean exceptionIsMapFailureException(IOException ioexception)
	{
		return ioexception.getMessage() != null && ioexception.getMessage().indexOf("Map failed") >= 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method String IOException.getMessage()>
	//    2    4:ifnull          21
	//    3    7:aload_0         
	//    4    8:invokevirtual   #57  <Method String IOException.getMessage()>
	//    5   11:ldc1            #59  <String "Map failed">
	//    6   13:invokevirtual   #65  <Method int String.indexOf(String)>
	//    7   16:iflt            21
	//    8   19:iconst_1        
	//    9   20:ireturn         
	//   10   21:iconst_0        
	//   11   22:ireturn         
	}

	public void close()
		throws IOException
	{
		if(source == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field ByteBufferRandomAccessSource source>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			source.close();
	//    4    8:aload_0         
	//    5    9:getfield        #49  <Field ByteBufferRandomAccessSource source>
	//    6   12:invokevirtual   #70  <Method void ByteBufferRandomAccessSource.close()>
			source = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #49  <Field ByteBufferRandomAccessSource source>
			return;
	//   10   20:return          
		}
	}

	public int get(long l)
		throws IOException
	{
		if(source == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field ByteBufferRandomAccessSource source>
	//*   2    4:ifnonnull       17
			throw new IOException("RandomAccessSource not opened");
	//    3    7:new             #54  <Class IOException>
	//    4   10:dup             
	//    5   11:ldc1            #75  <String "RandomAccessSource not opened">
	//    6   13:invokespecial   #76  <Method void IOException(String)>
	//    7   16:athrow          
		else
			return source.get(l);
	//    8   17:aload_0         
	//    9   18:getfield        #49  <Field ByteBufferRandomAccessSource source>
	//   10   21:lload_1         
	//   11   22:invokevirtual   #78  <Method int ByteBufferRandomAccessSource.get(long)>
	//   12   25:ireturn         
	}

	public int get(long l, byte abyte0[], int i, int j)
		throws IOException
	{
		if(source == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field ByteBufferRandomAccessSource source>
	//*   2    4:ifnonnull       17
			throw new IOException("RandomAccessSource not opened");
	//    3    7:new             #54  <Class IOException>
	//    4   10:dup             
	//    5   11:ldc1            #75  <String "RandomAccessSource not opened">
	//    6   13:invokespecial   #76  <Method void IOException(String)>
	//    7   16:athrow          
		else
			return source.get(l, abyte0, i, j);
	//    8   17:aload_0         
	//    9   18:getfield        #49  <Field ByteBufferRandomAccessSource source>
	//   10   21:lload_1         
	//   11   22:aload_3         
	//   12   23:iload           4
	//   13   25:iload           5
	//   14   27:invokevirtual   #81  <Method int ByteBufferRandomAccessSource.get(long, byte[], int, int)>
	//   15   30:ireturn         
	}

	public long length()
	{
		return length;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field long length>
	//    2    4:lreturn         
	}

	void open()
		throws IOException
	{
		if(source != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field ByteBufferRandomAccessSource source>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		if(!channel.isOpen())
	//*   4    8:aload_0         
	//*   5    9:getfield        #43  <Field FileChannel channel>
	//*   6   12:invokevirtual   #89  <Method boolean FileChannel.isOpen()>
	//*   7   15:ifne            28
			throw new IllegalStateException("Channel is closed");
	//    8   18:new             #91  <Class IllegalStateException>
	//    9   21:dup             
	//   10   22:ldc1            #93  <String "Channel is closed">
	//   11   24:invokespecial   #94  <Method void IllegalStateException(String)>
	//   12   27:athrow          
		try
		{
			source = new ByteBufferRandomAccessSource(((java.nio.ByteBuffer) (channel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, offset, length))));
	//   13   28:aload_0         
	//   14   29:new             #68  <Class ByteBufferRandomAccessSource>
	//   15   32:dup             
	//   16   33:aload_0         
	//   17   34:getfield        #43  <Field FileChannel channel>
	//   18   37:getstatic       #100 <Field java.nio.channels.FileChannel$MapMode java.nio.channels.FileChannel$MapMode.READ_ONLY>
	//   19   40:aload_0         
	//   20   41:getfield        #45  <Field long offset>
	//   21   44:aload_0         
	//   22   45:getfield        #47  <Field long length>
	//   23   48:invokevirtual   #104 <Method java.nio.MappedByteBuffer FileChannel.map(java.nio.channels.FileChannel$MapMode, long, long)>
	//   24   51:invokespecial   #107 <Method void ByteBufferRandomAccessSource(java.nio.ByteBuffer)>
	//   25   54:putfield        #49  <Field ByteBufferRandomAccessSource source>
			return;
	//   26   57:return          
		}
		catch(IOException ioexception)
	//*  27   58:astore_1        
		{
			if(exceptionIsMapFailureException(ioexception))
	//*  28   59:aload_1         
	//*  29   60:invokestatic    #109 <Method boolean exceptionIsMapFailureException(IOException)>
	//*  30   63:ifeq            75
				throw new MapFailedException(ioexception);
	//   31   66:new             #111 <Class MapFailedException>
	//   32   69:dup             
	//   33   70:aload_1         
	//   34   71:invokespecial   #114 <Method void MapFailedException(IOException)>
	//   35   74:athrow          
			else
				throw ioexception;
	//   36   75:aload_1         
	//   37   76:athrow          
		}
	}

	public String toString()
	{
		return (new StringBuilder()).append(((Object)this).getClass().getName()).append(" (").append(offset).append(", ").append(length).append(")").toString();
	//    0    0:new             #22  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #118 <Method Class Object.getClass()>
	//    5   11:invokevirtual   #123 <Method String Class.getName()>
	//    6   14:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:ldc1            #125 <String " (">
	//    8   19:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:aload_0         
	//   10   23:getfield        #45  <Field long offset>
	//   11   26:invokevirtual   #27  <Method StringBuilder StringBuilder.append(long)>
	//   12   29:ldc1            #127 <String ", ">
	//   13   31:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   14   34:aload_0         
	//   15   35:getfield        #47  <Field long length>
	//   16   38:invokevirtual   #27  <Method StringBuilder StringBuilder.append(long)>
	//   17   41:ldc1            #129 <String ")">
	//   18   43:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   19   46:invokevirtual   #36  <Method String StringBuilder.toString()>
	//   20   49:areturn         
	}

	private final FileChannel channel;
	private final long length;
	private final long offset;
	private ByteBufferRandomAccessSource source;
}
