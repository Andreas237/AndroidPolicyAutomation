// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.disklrucache;

import java.io.*;

// Referenced classes of package com.bumptech.glide.disklrucache:
//			DiskLruCache

public final class DiskLruCache$Value
{

	public  edit()
		throws IOException
	{
		return DiskLruCache.access$1700(DiskLruCache.this, key, sequenceNumber);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field DiskLruCache this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field String key>
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field long sequenceNumber>
	//    6   12:invokestatic    #44  <Method DiskLruCache$Editor DiskLruCache.access$1700(DiskLruCache, String, long)>
	//    7   15:areturn         
	}

	public File getFile(int i)
	{
		return files[i];
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field File[] files>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public long getLength(int i)
	{
		return lengths[i];
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field long[] lengths>
	//    2    4:iload_1         
	//    3    5:laload          
	//    4    6:lreturn         
	}

	public String getString(int i)
		throws IOException
	{
		return DiskLruCache.access$1800(((java.io.InputStream) (new FileInputStream(files[i]))));
	//    0    0:new             #53  <Class FileInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field File[] files>
	//    4    8:iload_1         
	//    5    9:aaload          
	//    6   10:invokespecial   #56  <Method void FileInputStream(File)>
	//    7   13:invokestatic    #60  <Method String DiskLruCache.access$1800(java.io.InputStream)>
	//    8   16:areturn         
	}

	private final File files[];
	private final String key;
	private final long lengths[];
	private final long sequenceNumber;
	final DiskLruCache this$0;

	private DiskLruCache$Value(String s, long l, File afile[], long al[])
	{
		this$0 = DiskLruCache.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field DiskLruCache this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		key = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field String key>
		sequenceNumber = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #28  <Field long sequenceNumber>
		files = afile;
	//   11   19:aload_0         
	//   12   20:aload           5
	//   13   22:putfield        #30  <Field File[] files>
		lengths = al;
	//   14   25:aload_0         
	//   15   26:aload           6
	//   16   28:putfield        #32  <Field long[] lengths>
	//   17   31:return          
	}

	DiskLruCache$Value(String s, long l, File afile[], long al[], DiskLruCache._cls1 _pcls1)
	{
		this(s, l, afile, al);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:lload_3         
	//    4    4:aload           5
	//    5    6:aload           6
	//    6    8:invokespecial   #36  <Method void DiskLruCache$Value(DiskLruCache, String, long, File[], long[])>
	//    7   11:return          
	}
}
