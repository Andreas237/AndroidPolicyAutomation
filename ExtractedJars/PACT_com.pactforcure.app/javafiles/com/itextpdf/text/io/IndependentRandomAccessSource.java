// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.io;

import java.io.IOException;

// Referenced classes of package com.itextpdf.text.io:
//			RandomAccessSource

public class IndependentRandomAccessSource
	implements RandomAccessSource
{

	public IndependentRandomAccessSource(RandomAccessSource randomaccesssource)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		source = randomaccesssource;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field RandomAccessSource source>
	//    5    9:return          
	}

	public void close()
		throws IOException
	{
	//    0    0:return          
	}

	public int get(long l)
		throws IOException
	{
		return source.get(l);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field RandomAccessSource source>
	//    2    4:lload_1         
	//    3    5:invokeinterface #24  <Method int RandomAccessSource.get(long)>
	//    4   10:ireturn         
	}

	public int get(long l, byte abyte0[], int i, int j)
		throws IOException
	{
		return source.get(l, abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field RandomAccessSource source>
	//    2    4:lload_1         
	//    3    5:aload_3         
	//    4    6:iload           4
	//    5    8:iload           5
	//    6   10:invokeinterface #27  <Method int RandomAccessSource.get(long, byte[], int, int)>
	//    7   15:ireturn         
	}

	public long length()
	{
		return source.length();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field RandomAccessSource source>
	//    2    4:invokeinterface #31  <Method long RandomAccessSource.length()>
	//    3    9:lreturn         
	}

	private final RandomAccessSource source;
}
