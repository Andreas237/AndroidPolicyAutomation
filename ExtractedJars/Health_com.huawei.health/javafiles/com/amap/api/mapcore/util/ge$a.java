// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.amap.api.mapcore.util:
//			ge

static class ge$a
	implements FilenameFilter
{

	public boolean accept(File file, String s)
	{
		file = ((File) ((new StringBuilder()).append(ge.b()).append(ge.c()).toString()));
	//    0    0:new             #18  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void StringBuilder()>
	//    3    7:invokestatic    #23  <Method String ge.b()>
	//    4   10:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//    5   13:invokestatic    #30  <Method String ge.c()>
	//    6   16:invokevirtual   #27  <Method StringBuilder StringBuilder.append(String)>
	//    7   19:invokevirtual   #33  <Method String StringBuilder.toString()>
	//    8   22:astore_1        
		return s.startsWith(ge.d()) && !s.endsWith(((String) (file)));
	//    9   23:aload_2         
	//   10   24:invokestatic    #36  <Method String ge.d()>
	//   11   27:invokevirtual   #42  <Method boolean String.startsWith(String)>
	//   12   30:ifeq            43
	//   13   33:aload_2         
	//   14   34:aload_1         
	//   15   35:invokevirtual   #45  <Method boolean String.endsWith(String)>
	//   16   38:ifne            43
	//   17   41:iconst_1        
	//   18   42:ireturn         
	//   19   43:iconst_0        
	//   20   44:ireturn         
	}

	ge$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
