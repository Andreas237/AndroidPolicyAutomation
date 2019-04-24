// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.io;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.itextpdf.text.io:
//			RandomAccessSource

public class RASInputStream extends InputStream
{

	public RASInputStream(RandomAccessSource randomaccesssource)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void InputStream()>
		position = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #15  <Field long position>
		source = randomaccesssource;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #17  <Field RandomAccessSource source>
	//    8   14:return          
	}

	public int read()
		throws IOException
	{
		RandomAccessSource randomaccesssource = source;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RandomAccessSource source>
	//    2    4:astore_3        
		long l = position;
	//    3    5:aload_0         
	//    4    6:getfield        #15  <Field long position>
	//    5    9:lstore_1        
		position = 1L + l;
	//    6   10:aload_0         
	//    7   11:lconst_1        
	//    8   12:lload_1         
	//    9   13:ladd            
	//   10   14:putfield        #15  <Field long position>
		return randomaccesssource.get(l);
	//   11   17:aload_3         
	//   12   18:lload_1         
	//   13   19:invokeinterface #28  <Method int RandomAccessSource.get(long)>
	//   14   24:ireturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		i = source.get(position, abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RandomAccessSource source>
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field long position>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokeinterface #33  <Method int RandomAccessSource.get(long, byte[], int, int)>
	//    8   16:istore_2        
		position = position + (long)i;
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #15  <Field long position>
	//   12   22:iload_2         
	//   13   23:i2l             
	//   14   24:ladd            
	//   15   25:putfield        #15  <Field long position>
		return i;
	//   16   28:iload_2         
	//   17   29:ireturn         
	}

	private long position;
	private final RandomAccessSource source;
}
