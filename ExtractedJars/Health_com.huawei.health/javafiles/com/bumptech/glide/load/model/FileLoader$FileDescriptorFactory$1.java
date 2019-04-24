// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import java.io.*;

// Referenced classes of package com.bumptech.glide.load.model:
//			FileLoader

class FileLoader$FileDescriptorFactory$1
	implements FileLoader.FileOpener
{

	public void close(ParcelFileDescriptor parcelfiledescriptor)
		throws IOException
	{
		parcelfiledescriptor.close();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #25  <Method void ParcelFileDescriptor.close()>
	//    2    4:return          
	}

	public volatile void close(Object obj)
		throws IOException
	{
		close((ParcelFileDescriptor)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class ParcelFileDescriptor>
	//    3    5:invokevirtual   #29  <Method void close(ParcelFileDescriptor)>
	//    4    8:return          
	}

	public Class getDataClass()
	{
		return android/os/ParcelFileDescriptor;
	//    0    0:ldc1            #23  <Class ParcelFileDescriptor>
	//    1    2:areturn         
	}

	public ParcelFileDescriptor open(File file)
		throws FileNotFoundException
	{
		return ParcelFileDescriptor.open(file, 0x10000000);
	//    0    0:aload_1         
	//    1    1:ldc1            #38  <Int 0x10000000>
	//    2    3:invokestatic    #41  <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
	//    3    6:areturn         
	}

	public volatile Object open(File file)
		throws FileNotFoundException
	{
		return ((Object) (open(file)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #44  <Method ParcelFileDescriptor open(File)>
	//    3    5:areturn         
	}

	FileLoader$FileDescriptorFactory$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
