// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.file;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.resource.file:
//			FileResource

public class FileDecoder
	implements ResourceDecoder
{

	public FileDecoder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public Resource decode(File file, int i, int j, Options options)
	{
		return ((Resource) (new FileResource(file)));
	//    0    0:new             #17  <Class FileResource>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #20  <Method void FileResource(File)>
	//    4    8:areturn         
	}

	public volatile Resource decode(Object obj, int i, int j, Options options)
		throws IOException
	{
		return decode((File)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #28  <Class File>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #30  <Method Resource decode(File, int, int, Options)>
	//    7   12:areturn         
	}

	public boolean handles(File file, Options options)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public volatile boolean handles(Object obj, Options options)
		throws IOException
	{
		return handles((File)obj, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #28  <Class File>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #36  <Method boolean handles(File, Options)>
	//    5    9:ireturn         
	}
}
