// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.facebook.internal:
//			FileLruCache

static final class FileLruCache$BufferFile$2
	implements FilenameFilter
{

	public boolean accept(File file, String s)
	{
		return s.startsWith("buffer");
	//    0    0:aload_2         
	//    1    1:ldc1            #20  <String "buffer">
	//    2    3:invokevirtual   #26  <Method boolean String.startsWith(String)>
	//    3    6:ireturn         
	}

	FileLruCache$BufferFile$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
