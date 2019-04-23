// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package bo.app:
//			cx

static final class cx$1
	implements FilenameFilter
{

	public boolean accept(File file, String s)
	{
		return s.startsWith("appboy.db");
	//    0    0:aload_2         
	//    1    1:ldc1            #20  <String "appboy.db">
	//    2    3:invokevirtual   #26  <Method boolean String.startsWith(String)>
	//    3    6:ireturn         
	}

	cx$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
