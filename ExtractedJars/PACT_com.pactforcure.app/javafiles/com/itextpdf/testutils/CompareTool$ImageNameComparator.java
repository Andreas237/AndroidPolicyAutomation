// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.testutils;

import java.io.File;
import java.util.Comparator;

// Referenced classes of package com.itextpdf.testutils:
//			CompareTool

class CompareTool$ImageNameComparator
	implements Comparator
{

	public int compare(File file, File file1)
	{
		return file.getAbsolutePath().compareTo(file1.getAbsolutePath());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #28  <Method String File.getAbsolutePath()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #28  <Method String File.getAbsolutePath()>
	//    4    8:invokevirtual   #34  <Method int String.compareTo(String)>
	//    5   11:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((File)obj, (File)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class File>
	//    3    5:aload_2         
	//    4    6:checkcast       #24  <Class File>
	//    5    9:invokevirtual   #37  <Method int compare(File, File)>
	//    6   12:ireturn         
	}

	final CompareTool this$0;

	CompareTool$ImageNameComparator()
	{
		this$0 = CompareTool.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field CompareTool this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
