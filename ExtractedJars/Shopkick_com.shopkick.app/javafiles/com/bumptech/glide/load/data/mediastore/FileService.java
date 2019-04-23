// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data.mediastore;

import java.io.File;

class FileService
{

	FileService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public boolean exists(File file)
	{
		return file.exists();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #16  <Method boolean File.exists()>
	//    2    4:ireturn         
	}

	public File get(String s)
	{
		return new File(s);
	//    0    0:new             #13  <Class File>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #21  <Method void File(String)>
	//    4    8:areturn         
	}

	public long length(File file)
	{
		return file.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method long File.length()>
	//    2    4:lreturn         
	}
}
