// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import java.security.InvalidParameterException;

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

	void setByteCount(int i)
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            10
		{
			byteCount = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #19  <Field int byteCount>
			return;
	//    5    9:return          
		} else
		{
			throw new InvalidParameterException("Cache byte-count limit must be >= 0");
	//    6   10:new             #27  <Class InvalidParameterException>
	//    7   13:dup             
	//    8   14:ldc1            #29  <String "Cache byte-count limit must be >= 0">
	//    9   16:invokespecial   #32  <Method void InvalidParameterException(String)>
	//   10   19:athrow          
		}
	}

	void setFileCount(int i)
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            10
		{
			fileCount = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field int fileCount>
			return;
	//    5    9:return          
		} else
		{
			throw new InvalidParameterException("Cache file count limit must be >= 0");
	//    6   10:new             #27  <Class InvalidParameterException>
	//    7   13:dup             
	//    8   14:ldc1            #35  <String "Cache file count limit must be >= 0">
	//    9   16:invokespecial   #32  <Method void InvalidParameterException(String)>
	//   10   19:athrow          
		}
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
