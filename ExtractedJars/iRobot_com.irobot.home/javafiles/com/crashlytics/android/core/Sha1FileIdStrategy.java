// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import b.a.a.a.a.b.i;
import java.io.*;

class Sha1FileIdStrategy
	implements BinaryImagesConverter.FileIdStrategy
{

	Sha1FileIdStrategy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	private static String getFileSHA(String s)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		s = ((String) (new BufferedInputStream(((java.io.InputStream) (new FileInputStream(s))))));
	//    2    2:new             #15  <Class BufferedInputStream>
	//    3    5:dup             
	//    4    6:new             #17  <Class FileInputStream>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void FileInputStream(String)>
	//    8   14:invokespecial   #23  <Method void BufferedInputStream(java.io.InputStream)>
	//    9   17:astore_0        
		String s1 = i.b(((java.io.InputStream) (s)));
	//   10   18:aload_0         
	//   11   19:invokestatic    #29  <Method String i.b(java.io.InputStream)>
	//   12   22:astore_1        
		i.a(((java.io.Closeable) (s)));
	//   13   23:aload_0         
	//   14   24:invokestatic    #33  <Method void i.a(java.io.Closeable)>
		return s1;
	//   15   27:aload_1         
	//   16   28:areturn         
		Exception exception;
		exception;
	//   17   29:astore_1        
		break MISSING_BLOCK_LABEL_36;
	//   18   30:goto            36
		exception;
	//   19   33:astore_1        
		s = ((String) (obj));
	//   20   34:aload_2         
	//   21   35:astore_0        
		i.a(((java.io.Closeable) (s)));
	//   22   36:aload_0         
	//   23   37:invokestatic    #33  <Method void i.a(java.io.Closeable)>
		throw exception;
	//   24   40:aload_1         
	//   25   41:athrow          
	}

	public String createId(File file)
	{
		return getFileSHA(file.getPath());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #41  <Method String File.getPath()>
	//    2    4:invokestatic    #43  <Method String getFileSHA(String)>
	//    3    7:areturn         
	}
}
