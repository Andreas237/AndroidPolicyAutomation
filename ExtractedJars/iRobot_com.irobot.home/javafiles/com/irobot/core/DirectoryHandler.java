// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


// Referenced classes of package com.irobot.core:
//			DirectoryHandlerDataCallback

public abstract class DirectoryHandler
{

	public DirectoryHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract void dataForFileNamed(String s, DirectoryHandlerDataCallback directoryhandlerdatacallback);

	public abstract String documentsDirectoryPath();
}
