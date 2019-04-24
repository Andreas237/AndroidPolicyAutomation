// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

// Referenced classes of package com.facebook.internal:
//			Utility

static final class Utility$3
	implements FilenameFilter
{

	public boolean accept(File file, String s)
	{
		return Pattern.matches("cpu[0-9]+", ((CharSequence) (s)));
	//    0    0:ldc1            #20  <String "cpu[0-9]+">
	//    1    2:aload_2         
	//    2    3:invokestatic    #26  <Method boolean Pattern.matches(String, CharSequence)>
	//    3    6:ireturn         
	}

	Utility$3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
