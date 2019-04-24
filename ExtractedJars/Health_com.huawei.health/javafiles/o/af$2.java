// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.File;
import java.io.FileFilter;

// Referenced classes of package o:
//			af

static final class af$2
	implements FileFilter
{

	public boolean accept(File file)
	{
		return !file.getName().startsWith(a);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method String File.getName()>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field String a>
	//    4    8:invokevirtual   #35  <Method boolean String.startsWith(String)>
	//    5   11:ifne            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	final String a;

	af$2(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field String a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
