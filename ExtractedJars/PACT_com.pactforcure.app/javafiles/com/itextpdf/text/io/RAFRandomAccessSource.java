// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.io;

import java.io.IOException;
import java.io.RandomAccessFile;

// Referenced classes of package com.itextpdf.text.io:
//			RandomAccessSource

class RAFRandomAccessSource
	implements RandomAccessSource
{

	public RAFRandomAccessSource(RandomAccessFile randomaccessfile)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		raf = randomaccessfile;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field RandomAccessFile raf>
		length = randomaccessfile.length();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #24  <Method long RandomAccessFile.length()>
	//    8   14:putfield        #26  <Field long length>
	//    9   17:return          
	}

	public void close()
		throws IOException
	{
		raf.close();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RandomAccessFile raf>
	//    2    4:invokevirtual   #31  <Method void RandomAccessFile.close()>
	//    3    7:return          
	}

	public int get(long l)
		throws IOException
	{
		if(l > raf.length())
	//*   0    0:lload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #19  <Field RandomAccessFile raf>
	//*   3    5:invokevirtual   #24  <Method long RandomAccessFile.length()>
	//*   4    8:lcmp            
	//*   5    9:ifle            14
		{
			return -1;
	//    6   12:iconst_m1       
	//    7   13:ireturn         
		} else
		{
			raf.seek(l);
	//    8   14:aload_0         
	//    9   15:getfield        #19  <Field RandomAccessFile raf>
	//   10   18:lload_1         
	//   11   19:invokevirtual   #37  <Method void RandomAccessFile.seek(long)>
			return raf.read();
	//   12   22:aload_0         
	//   13   23:getfield        #19  <Field RandomAccessFile raf>
	//   14   26:invokevirtual   #41  <Method int RandomAccessFile.read()>
	//   15   29:ireturn         
		}
	}

	public int get(long l, byte abyte0[], int i, int j)
		throws IOException
	{
		if(l > length)
	//*   0    0:lload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #26  <Field long length>
	//*   3    5:lcmp            
	//*   4    6:ifle            11
		{
			return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
		} else
		{
			raf.seek(l);
	//    7   11:aload_0         
	//    8   12:getfield        #19  <Field RandomAccessFile raf>
	//    9   15:lload_1         
	//   10   16:invokevirtual   #37  <Method void RandomAccessFile.seek(long)>
			return raf.read(abyte0, i, j);
	//   11   19:aload_0         
	//   12   20:getfield        #19  <Field RandomAccessFile raf>
	//   13   23:aload_3         
	//   14   24:iload           4
	//   15   26:iload           5
	//   16   28:invokevirtual   #45  <Method int RandomAccessFile.read(byte[], int, int)>
	//   17   31:ireturn         
		}
	}

	public long length()
	{
		return length;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field long length>
	//    2    4:lreturn         
	}

	private final long length;
	private final RandomAccessFile raf;
}
