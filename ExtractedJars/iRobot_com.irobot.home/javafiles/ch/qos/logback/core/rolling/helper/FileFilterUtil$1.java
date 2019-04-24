// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling.helper;

import java.io.File;
import java.util.Comparator;

// Referenced classes of package ch.qos.logback.core.rolling.helper:
//			FileFilterUtil

static final class FileFilterUtil$1
	implements Comparator
{

	public int compare(File file, File file1)
	{
		return file.getName().compareTo(file1.getName());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #25  <Method String File.getName()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #25  <Method String File.getName()>
	//    4    8:invokevirtual   #31  <Method int String.compareTo(String)>
	//    5   11:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((File)obj, (File)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class File>
	//    3    5:aload_2         
	//    4    6:checkcast       #21  <Class File>
	//    5    9:invokevirtual   #34  <Method int compare(File, File)>
	//    6   12:ireturn         
	}

	FileFilterUtil$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
