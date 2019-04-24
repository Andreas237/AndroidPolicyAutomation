// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.nostra13.universalimageloader.cache.disc.impl;

import com.nostra13.universalimageloader.cache.disc.naming.FileNameGenerator;
import java.io.File;

// Referenced classes of package com.nostra13.universalimageloader.cache.disc.impl:
//			BaseDiskCache

public class UnlimitedDiskCache extends BaseDiskCache
{

	public UnlimitedDiskCache(File file)
	{
		super(file);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void BaseDiskCache(File)>
	//    3    5:return          
	}

	public UnlimitedDiskCache(File file, File file1)
	{
		super(file, file1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void BaseDiskCache(File, File)>
	//    4    6:return          
	}

	public UnlimitedDiskCache(File file, File file1, FileNameGenerator filenamegenerator)
	{
		super(file, file1, filenamegenerator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #15  <Method void BaseDiskCache(File, File, FileNameGenerator)>
	//    5    7:return          
	}
}
