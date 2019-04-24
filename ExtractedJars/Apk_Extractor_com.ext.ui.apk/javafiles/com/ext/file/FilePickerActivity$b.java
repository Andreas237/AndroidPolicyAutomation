// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.file;

import java.io.File;
import java.util.Comparator;

// Referenced classes of package com.ext.file:
//			FilePickerActivity

private class FilePickerActivity$b
	implements Comparator
{

	public int a(File file, File file1)
	{
		if(file == file1)
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:if_acmpne       7
			return 0;
	//    3    5:iconst_0        
	//    4    6:ireturn         
		if(file.isDirectory() && file1.isFile())
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #30  <Method boolean File.isDirectory()>
	//*   7   11:ifeq            23
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #33  <Method boolean File.isFile()>
	//*  10   18:ifeq            23
			return -1;
	//   11   21:iconst_m1       
	//   12   22:ireturn         
		if(file.isFile() && file1.isDirectory())
	//*  13   23:aload_1         
	//*  14   24:invokevirtual   #33  <Method boolean File.isFile()>
	//*  15   27:ifeq            39
	//*  16   30:aload_2         
	//*  17   31:invokevirtual   #30  <Method boolean File.isDirectory()>
	//*  18   34:ifeq            39
			return 1;
	//   19   37:iconst_1        
	//   20   38:ireturn         
		else
			return file.getName().compareToIgnoreCase(file1.getName());
	//   21   39:aload_1         
	//   22   40:invokevirtual   #37  <Method String File.getName()>
	//   23   43:aload_2         
	//   24   44:invokevirtual   #37  <Method String File.getName()>
	//   25   47:invokevirtual   #43  <Method int String.compareToIgnoreCase(String)>
	//   26   50:ireturn         
	}

	public int compare(Object obj, Object obj1)
	{
		return a((File)obj, (File)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class File>
	//    3    5:aload_2         
	//    4    6:checkcast       #26  <Class File>
	//    5    9:invokevirtual   #47  <Method int a(File, File)>
	//    6   12:ireturn         
	}

	final FilePickerActivity a;

	private FilePickerActivity$b(FilePickerActivity filepickeractivity)
	{
		a = filepickeractivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field FilePickerActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	FilePickerActivity$b(FilePickerActivity filepickeractivity, FilePickerActivity$1 filepickeractivity$1)
	{
		this(filepickeractivity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void FilePickerActivity$b(FilePickerActivity)>
	//    3    5:return          
	}
}
