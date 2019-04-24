// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.testutils;

import java.io.File;
import java.io.FileFilter;

// Referenced classes of package com.itextpdf.testutils:
//			CompareTool

class CompareTool$CmpPngFileFilter
	implements FileFilter
{

	public boolean accept(File file)
	{
		file = ((File) (file.getAbsolutePath()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method String File.getAbsolutePath()>
	//    2    4:astore_1        
		boolean flag = ((String) (file)).endsWith(".png");
	//    3    5:aload_1         
	//    4    6:ldc1            #29  <String ".png">
	//    5    8:invokevirtual   #35  <Method boolean String.endsWith(String)>
	//    6   11:istore_2        
		boolean flag1 = ((String) (file)).contains("cmp_");
	//    7   12:aload_1         
	//    8   13:ldc1            #37  <String "cmp_">
	//    9   15:invokevirtual   #41  <Method boolean String.contains(CharSequence)>
	//   10   18:istore_3        
		return flag && flag1 && ((String) (file)).contains(((CharSequence) (CompareTool.access$200(CompareTool.this))));
	//   11   19:iload_2         
	//   12   20:ifeq            43
	//   13   23:iload_3         
	//   14   24:ifeq            43
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:getfield        #15  <Field CompareTool this$0>
	//   18   32:invokestatic    #45  <Method String CompareTool.access$200(CompareTool)>
	//   19   35:invokevirtual   #41  <Method boolean String.contains(CharSequence)>
	//   20   38:ifeq            43
	//   21   41:iconst_1        
	//   22   42:ireturn         
	//   23   43:iconst_0        
	//   24   44:ireturn         
	}

	final CompareTool this$0;

	CompareTool$CmpPngFileFilter()
	{
		this$0 = CompareTool.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field CompareTool this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
