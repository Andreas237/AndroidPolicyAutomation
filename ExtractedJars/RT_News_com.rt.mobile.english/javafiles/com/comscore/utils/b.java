// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils;

import java.io.File;
import java.io.FilenameFilter;

final class b
	implements FilenameFilter
{

	b()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public boolean accept(File file, String s)
	{
		return s.startsWith("cs_cache_");
	//    0    0:aload_2         
	//    1    1:ldc1            #15  <String "cs_cache_">
	//    2    3:invokevirtual   #21  <Method boolean String.startsWith(String)>
	//    3    6:ifeq            11
	//    4    9:iconst_1        
	//    5   10:ireturn         
	//    6   11:iconst_0        
	//    7   12:ireturn         
	}
}
