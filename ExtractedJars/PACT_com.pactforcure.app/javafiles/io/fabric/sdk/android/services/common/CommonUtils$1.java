// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import java.io.File;
import java.util.Comparator;

// Referenced classes of package io.fabric.sdk.android.services.common:
//			CommonUtils

static final class CommonUtils$1
	implements Comparator
{

	public int compare(File file, File file1)
	{
		return (int)(file.lastModified() - file1.lastModified());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method long File.lastModified()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #22  <Method long File.lastModified()>
	//    4    8:lsub            
	//    5    9:l2i             
	//    6   10:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((File)obj, (File)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class File>
	//    3    5:aload_2         
	//    4    6:checkcast       #18  <Class File>
	//    5    9:invokevirtual   #25  <Method int compare(File, File)>
	//    6   12:ireturn         
	}

	CommonUtils$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
