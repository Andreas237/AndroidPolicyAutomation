// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.getkeepsafe.relinker;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.getkeepsafe.relinker:
//			ReLinkerInstance

class ReLinkerInstance$2
	implements FilenameFilter
{

	public boolean accept(File file, String s)
	{
		return s.startsWith(val$mappedLibraryName);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field String val$mappedLibraryName>
	//    3    5:invokevirtual   #33  <Method boolean String.startsWith(String)>
	//    4    8:ireturn         
	}

	final ReLinkerInstance this$0;
	final String val$mappedLibraryName;

	ReLinkerInstance$2()
	{
		this$0 = final_relinkerinstance;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ReLinkerInstance this$0>
		val$mappedLibraryName = String.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String val$mappedLibraryName>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
