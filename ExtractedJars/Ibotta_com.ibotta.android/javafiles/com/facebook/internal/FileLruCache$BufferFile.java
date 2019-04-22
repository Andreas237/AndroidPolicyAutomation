// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.facebook.internal:
//			FileLruCache

private static class FileLruCache$BufferFile
{

	static void deleteAll(File file)
	{
		file = ((File) (file.listFiles(excludeNonBufferFiles())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #31  <Method FilenameFilter excludeNonBufferFiles()>
	//    2    4:invokevirtual   #37  <Method File[] File.listFiles(FilenameFilter)>
	//    3    7:astore_0        
		if(file != null)
	//*   4    8:aload_0         
	//*   5    9:ifnull          36
		{
			int j = file.length;
	//    6   12:aload_0         
	//    7   13:arraylength     
	//    8   14:istore_2        
			for(int i = 0; i < j; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_1        
	//*  11   17:iload_1         
	//*  12   18:iload_2         
	//*  13   19:icmpge          36
				((File) (file[i])).delete();
	//   14   22:aload_0         
	//   15   23:iload_1         
	//   16   24:aaload          
	//   17   25:invokevirtual   #41  <Method boolean File.delete()>
	//   18   28:pop             

	//   19   29:iload_1         
	//   20   30:iconst_1        
	//   21   31:iadd            
	//   22   32:istore_1        
		}
	//*  23   33:goto            17
	//   24   36:return          
	}

	static FilenameFilter excludeBufferFiles()
	{
		return filterExcludeBufferFiles;
	//    0    0:getstatic       #21  <Field FilenameFilter filterExcludeBufferFiles>
	//    1    3:areturn         
	}

	static FilenameFilter excludeNonBufferFiles()
	{
		return filterExcludeNonBufferFiles;
	//    0    0:getstatic       #24  <Field FilenameFilter filterExcludeNonBufferFiles>
	//    1    3:areturn         
	}

	static File newFile(File file)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #46  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("buffer");
	//    4    8:aload_1         
	//    5    9:ldc1            #49  <String "buffer">
	//    6   11:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(Long.valueOf(FileLruCache.access$300().incrementAndGet()).toString());
	//    8   15:aload_1         
	//    9   16:invokestatic    #57  <Method AtomicLong FileLruCache.access$300()>
	//   10   19:invokevirtual   #63  <Method long AtomicLong.incrementAndGet()>
	//   11   22:invokestatic    #69  <Method Long Long.valueOf(long)>
	//   12   25:invokevirtual   #73  <Method String Long.toString()>
	//   13   28:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:pop             
		return new File(file, stringbuilder.toString());
	//   15   32:new             #33  <Class File>
	//   16   35:dup             
	//   17   36:aload_0         
	//   18   37:aload_1         
	//   19   38:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   20   41:invokespecial   #77  <Method void File(File, String)>
	//   21   44:areturn         
	}

	private static final FilenameFilter filterExcludeBufferFiles = new FilenameFilter() {

		public boolean accept(File file, String s)
		{
			return s.startsWith("buffer") ^ true;
		//    0    0:aload_2         
		//    1    1:ldc1            #20  <String "buffer">
		//    2    3:invokevirtual   #26  <Method boolean String.startsWith(String)>
		//    3    6:iconst_1        
		//    4    7:ixor            
		//    5    8:ireturn         
		}

	}
;
	private static final FilenameFilter filterExcludeNonBufferFiles = new FilenameFilter() {

		public boolean accept(File file, String s)
		{
			return s.startsWith("buffer");
		//    0    0:aload_2         
		//    1    1:ldc1            #20  <String "buffer">
		//    2    3:invokevirtual   #26  <Method boolean String.startsWith(String)>
		//    3    6:ireturn         
		}

	}
;

	static 
	{
	//    0    0:new             #9   <Class FileLruCache$BufferFile$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void FileLruCache$BufferFile$1()>
	//    3    7:putstatic       #21  <Field FilenameFilter filterExcludeBufferFiles>
	//    4   10:new             #11  <Class FileLruCache$BufferFile$2>
	//    5   13:dup             
	//    6   14:invokespecial   #22  <Method void FileLruCache$BufferFile$2()>
	//    7   17:putstatic       #24  <Field FilenameFilter filterExcludeNonBufferFiles>
	//*   8   20:return          
	}
}
