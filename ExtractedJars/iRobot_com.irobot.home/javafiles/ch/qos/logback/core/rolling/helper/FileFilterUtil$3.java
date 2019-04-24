// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling.helper;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package ch.qos.logback.core.rolling.helper:
//			FileFilterUtil

static final class FileFilterUtil$3
	implements FilenameFilter
{

	public boolean accept(File file, String s)
	{
		return s.matches(val$stemRegex);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #17  <Field String val$stemRegex>
	//    3    5:invokevirtual   #29  <Method boolean String.matches(String)>
	//    4    8:ireturn         
	}

	final String val$stemRegex;

	FileFilterUtil$3(String s)
	{
		val$stemRegex = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field String val$stemRegex>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
