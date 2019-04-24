// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.io;

import java.io.IOException;
import java.nio.channels.FileChannel;

// Referenced classes of package com.itextpdf.text.io:
//			RandomAccessSource, MappedChannelRandomAccessSource

public class FileChannelRandomAccessSource
	implements RandomAccessSource
{

	public FileChannelRandomAccessSource(FileChannel filechannel)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		channel = filechannel;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field FileChannel channel>
		if(filechannel.size() == 0L)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #25  <Method long FileChannel.size()>
	//*   7   13:lconst_0        
	//*   8   14:lcmp            
	//*   9   15:ifne            28
		{
			throw new IOException("File size is 0 bytes");
	//   10   18:new             #14  <Class IOException>
	//   11   21:dup             
	//   12   22:ldc1            #27  <String "File size is 0 bytes">
	//   13   24:invokespecial   #30  <Method void IOException(String)>
	//   14   27:athrow          
		} else
		{
			source = new MappedChannelRandomAccessSource(filechannel, 0L, filechannel.size());
	//   15   28:aload_0         
	//   16   29:new             #32  <Class MappedChannelRandomAccessSource>
	//   17   32:dup             
	//   18   33:aload_1         
	//   19   34:lconst_0        
	//   20   35:aload_1         
	//   21   36:invokevirtual   #25  <Method long FileChannel.size()>
	//   22   39:invokespecial   #35  <Method void MappedChannelRandomAccessSource(FileChannel, long, long)>
	//   23   42:putfield        #37  <Field MappedChannelRandomAccessSource source>
			source.open();
	//   24   45:aload_0         
	//   25   46:getfield        #37  <Field MappedChannelRandomAccessSource source>
	//   26   49:invokevirtual   #40  <Method void MappedChannelRandomAccessSource.open()>
			return;
	//   27   52:return          
		}
	}

	public void close()
		throws IOException
	{
		source.close();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field MappedChannelRandomAccessSource source>
	//    2    4:invokevirtual   #45  <Method void MappedChannelRandomAccessSource.close()>
		channel.close();
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field FileChannel channel>
	//    5   11:invokevirtual   #46  <Method void FileChannel.close()>
	//    6   14:return          
	}

	public int get(long l)
		throws IOException
	{
		return source.get(l);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field MappedChannelRandomAccessSource source>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #50  <Method int MappedChannelRandomAccessSource.get(long)>
	//    4    8:ireturn         
	}

	public int get(long l, byte abyte0[], int i, int j)
		throws IOException
	{
		return source.get(l, abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field MappedChannelRandomAccessSource source>
	//    2    4:lload_1         
	//    3    5:aload_3         
	//    4    6:iload           4
	//    5    8:iload           5
	//    6   10:invokevirtual   #53  <Method int MappedChannelRandomAccessSource.get(long, byte[], int, int)>
	//    7   13:ireturn         
	}

	public long length()
	{
		return source.length();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field MappedChannelRandomAccessSource source>
	//    2    4:invokevirtual   #56  <Method long MappedChannelRandomAccessSource.length()>
	//    3    7:lreturn         
	}

	private final FileChannel channel;
	private final MappedChannelRandomAccessSource source;
}
