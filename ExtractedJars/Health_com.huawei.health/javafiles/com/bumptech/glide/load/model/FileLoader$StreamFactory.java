// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import java.io.*;

// Referenced classes of package com.bumptech.glide.load.model:
//			FileLoader

public static class FileLoader$StreamFactory extends FileLoader.Factory
{

	public FileLoader$StreamFactory()
	{
		super(new FileLoader.FileOpener() {

			public void close(InputStream inputstream)
				throws IOException
			{
				inputstream.close();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #25  <Method void InputStream.close()>
			//    2    4:return          
			}

			public volatile void close(Object obj)
				throws IOException
			{
				close((InputStream)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #23  <Class InputStream>
			//    3    5:invokevirtual   #29  <Method void close(InputStream)>
			//    4    8:return          
			}

			public Class getDataClass()
			{
				return java/io/InputStream;
			//    0    0:ldc1            #23  <Class InputStream>
			//    1    2:areturn         
			}

			public InputStream open(File file)
				throws FileNotFoundException
			{
				return ((InputStream) (new FileInputStream(file)));
			//    0    0:new             #39  <Class FileInputStream>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #42  <Method void FileInputStream(File)>
			//    4    8:areturn         
			}

			public volatile Object open(File file)
				throws FileNotFoundException
			{
				return ((Object) (open(file)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #45  <Method InputStream open(File)>
			//    3    5:areturn         
			}

		}
);
	//    0    0:aload_0         
	//    1    1:new             #10  <Class FileLoader$StreamFactory$1>
	//    2    4:dup             
	//    3    5:invokespecial   #14  <Method void FileLoader$StreamFactory$1()>
	//    4    8:invokespecial   #17  <Method void FileLoader$Factory(FileLoader$FileOpener)>
	//    5   11:return          
	}
}
