// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//			FileLruCache

public static final class FileLruCache$Limits
{

	int getByteCount()
	{
		return byteCount;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int byteCount>
	//    2    4:ireturn         
	}

	int getFileCount()
	{
		return fileCount;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int fileCount>
	//    2    4:ireturn         
	}

	private int byteCount;
	private int fileCount;

	public FileLruCache$Limits()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		fileCount = 1024;
	//    2    4:aload_0         
	//    3    5:sipush          1024
	//    4    8:putfield        #16  <Field int fileCount>
		byteCount = 0x100000;
	//    5   11:aload_0         
	//    6   12:ldc1            #17  <Int 0x100000>
	//    7   14:putfield        #19  <Field int byteCount>
	//    8   17:return          
	}
}
