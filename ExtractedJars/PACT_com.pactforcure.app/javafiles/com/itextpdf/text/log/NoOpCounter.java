// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.log;


// Referenced classes of package com.itextpdf.text.log:
//			Counter

public class NoOpCounter
	implements Counter
{

	public NoOpCounter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public Counter getCounter(Class class1)
	{
		return ((Counter) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public void read(long l)
	{
	//    0    0:return          
	}

	public void written(long l)
	{
	//    0    0:return          
	}
}
