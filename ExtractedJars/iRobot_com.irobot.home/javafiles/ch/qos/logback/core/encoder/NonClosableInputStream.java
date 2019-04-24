// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.encoder;

import java.io.FilterInputStream;
import java.io.InputStream;

public class NonClosableInputStream extends FilterInputStream
{

	NonClosableInputStream(InputStream inputstream)
	{
		super(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void FilterInputStream(InputStream)>
	//    3    5:return          
	}

	public void close()
	{
	//    0    0:return          
	}

	public void realClose()
	{
		super.close();
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void FilterInputStream.close()>
	//    2    4:return          
	}
}
