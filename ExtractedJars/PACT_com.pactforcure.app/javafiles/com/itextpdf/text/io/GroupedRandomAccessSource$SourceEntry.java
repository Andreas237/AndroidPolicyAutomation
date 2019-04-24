// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.io;


// Referenced classes of package com.itextpdf.text.io:
//			GroupedRandomAccessSource, RandomAccessSource

private static class GroupedRandomAccessSource$SourceEntry
{

	public long offsetN(long l)
	{
		return l - firstByte;
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field long firstByte>
	//    3    5:lsub            
	//    4    6:lreturn         
	}

	final long firstByte;
	final int index;
	final long lastByte;
	final RandomAccessSource source;

	public GroupedRandomAccessSource$SourceEntry(int i, RandomAccessSource randomaccesssource, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		index = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #21  <Field int index>
		source = randomaccesssource;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field RandomAccessSource source>
		firstByte = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #25  <Field long firstByte>
		lastByte = (randomaccesssource.length() + l) - 1L;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:invokeinterface #31  <Method long RandomAccessSource.length()>
	//   14   26:lload_3         
	//   15   27:ladd            
	//   16   28:lconst_1        
	//   17   29:lsub            
	//   18   30:putfield        #33  <Field long lastByte>
	//   19   33:return          
	}
}
