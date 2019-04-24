// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.misc;

import java.io.Closeable;
import java.io.IOException;

public class IOUtils
{

	public IOUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void closeQuietly(Closeable closeable)
	{
		if(closeable == null)
			break MISSING_BLOCK_LABEL_10;
	//    0    0:aload_0         
	//    1    1:ifnull          10
		closeable.close();
	//    2    4:aload_0         
	//    3    5:invokeinterface #18  <Method void Closeable.close()>
		return;
	//    4   10:return          
		closeable;
	//    5   11:astore_0        
	//    6   12:return          
	}
}
