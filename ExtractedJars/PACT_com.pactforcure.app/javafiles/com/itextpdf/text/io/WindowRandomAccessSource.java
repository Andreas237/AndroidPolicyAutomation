// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.io;

import java.io.IOException;

// Referenced classes of package com.itextpdf.text.io:
//			RandomAccessSource

public class WindowRandomAccessSource
	implements RandomAccessSource
{

	public WindowRandomAccessSource(RandomAccessSource randomaccesssource, long l)
	{
		this(randomaccesssource, l, randomaccesssource.length() - l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:aload_1         
	//    4    4:invokeinterface #16  <Method long RandomAccessSource.length()>
	//    5    9:lload_2         
	//    6   10:lsub            
	//    7   11:invokespecial   #19  <Method void WindowRandomAccessSource(RandomAccessSource, long, long)>
	//    8   14:return          
	}

	public WindowRandomAccessSource(RandomAccessSource randomaccesssource, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		source = randomaccesssource;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field RandomAccessSource source>
		offset = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #27  <Field long offset>
		length = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #29  <Field long length>
	//   11   20:return          
	}

	public void close()
		throws IOException
	{
		source.close();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field RandomAccessSource source>
	//    2    4:invokeinterface #34  <Method void RandomAccessSource.close()>
	//    3    9:return          
	}

	public int get(long l)
		throws IOException
	{
		if(l >= length)
	//*   0    0:lload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #29  <Field long length>
	//*   3    5:lcmp            
	//*   4    6:iflt            11
			return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
		else
			return source.get(offset + l);
	//    7   11:aload_0         
	//    8   12:getfield        #25  <Field RandomAccessSource source>
	//    9   15:aload_0         
	//   10   16:getfield        #27  <Field long offset>
	//   11   19:lload_1         
	//   12   20:ladd            
	//   13   21:invokeinterface #39  <Method int RandomAccessSource.get(long)>
	//   14   26:ireturn         
	}

	public int get(long l, byte abyte0[], int i, int j)
		throws IOException
	{
		if(l >= length)
	//*   0    0:lload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #29  <Field long length>
	//*   3    5:lcmp            
	//*   4    6:iflt            11
		{
			return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
		} else
		{
			long l1 = Math.min(j, length - l);
	//    7   11:iload           5
	//    8   13:i2l             
	//    9   14:aload_0         
	//   10   15:getfield        #29  <Field long length>
	//   11   18:lload_1         
	//   12   19:lsub            
	//   13   20:invokestatic    #46  <Method long Math.min(long, long)>
	//   14   23:lstore          6
			return source.get(offset + l, abyte0, i, (int)l1);
	//   15   25:aload_0         
	//   16   26:getfield        #25  <Field RandomAccessSource source>
	//   17   29:aload_0         
	//   18   30:getfield        #27  <Field long offset>
	//   19   33:lload_1         
	//   20   34:ladd            
	//   21   35:aload_3         
	//   22   36:iload           4
	//   23   38:lload           6
	//   24   40:l2i             
	//   25   41:invokeinterface #48  <Method int RandomAccessSource.get(long, byte[], int, int)>
	//   26   46:ireturn         
		}
	}

	public long length()
	{
		return length;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field long length>
	//    2    4:lreturn         
	}

	private final long length;
	private final long offset;
	private final RandomAccessSource source;
}
