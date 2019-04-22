// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import java.io.File;

// Referenced classes of package com.facebook.internal:
//			FileLruCache

private static final class FileLruCache$ModifiedFile
	implements Comparable
{

	public int compareTo(FileLruCache$ModifiedFile filelrucache$modifiedfile)
	{
		if(getModified() < filelrucache$modifiedfile.getModified())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #35  <Method long getModified()>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #35  <Method long getModified()>
	//*   4    8:lcmp            
	//*   5    9:ifge            14
			return -1;
	//    6   12:iconst_m1       
	//    7   13:ireturn         
		if(getModified() > filelrucache$modifiedfile.getModified())
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #35  <Method long getModified()>
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #35  <Method long getModified()>
	//*  12   22:lcmp            
	//*  13   23:ifle            28
			return 1;
	//   14   26:iconst_1        
	//   15   27:ireturn         
		else
			return getFile().compareTo(filelrucache$modifiedfile.getFile());
	//   16   28:aload_0         
	//   17   29:invokevirtual   #39  <Method File getFile()>
	//   18   32:aload_1         
	//   19   33:invokevirtual   #39  <Method File getFile()>
	//   20   36:invokevirtual   #42  <Method int File.compareTo(File)>
	//   21   39:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((FileLruCache$ModifiedFile)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class FileLruCache$ModifiedFile>
	//    3    5:invokevirtual   #45  <Method int compareTo(FileLruCache$ModifiedFile)>
	//    4    8:ireturn         
	}

	public boolean equals(Object obj)
	{
		return (obj instanceof FileLruCache$ModifiedFile) && compareTo((FileLruCache$ModifiedFile)obj) == 0;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class FileLruCache$ModifiedFile>
	//    2    4:ifeq            20
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #2   <Class FileLruCache$ModifiedFile>
	//    6   12:invokevirtual   #45  <Method int compareTo(FileLruCache$ModifiedFile)>
	//    7   15:ifne            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	File getFile()
	{
		return file;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field File file>
	//    2    4:areturn         
	}

	long getModified()
	{
		return modified;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field long modified>
	//    2    4:lreturn         
	}

	public int hashCode()
	{
		return (1073 + file.hashCode()) * 37 + (int)(modified % 0x7fffffffL);
	//    0    0:sipush          1073
	//    1    3:aload_0         
	//    2    4:getfield        #21  <Field File file>
	//    3    7:invokevirtual   #51  <Method int File.hashCode()>
	//    4   10:iadd            
	//    5   11:bipush          37
	//    6   13:imul            
	//    7   14:aload_0         
	//    8   15:getfield        #29  <Field long modified>
	//    9   18:ldc2w           #52  <Long 0x7fffffffL>
	//   10   21:lrem            
	//   11   22:l2i             
	//   12   23:iadd            
	//   13   24:ireturn         
	}

	private final File file;
	private final long modified;

	FileLruCache$ModifiedFile(File file1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		file = file1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field File file>
		modified = file1.lastModified();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #27  <Method long File.lastModified()>
	//    8   14:putfield        #29  <Field long modified>
	//    9   17:return          
	}
}
