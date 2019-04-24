// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import java.io.IOException;

// Referenced classes of package com.itextpdf.text:
//			Jpeg2000

private class Jpeg2000$ZeroBoxSizeException extends IOException
{

	final Jpeg2000 this$0;

	public Jpeg2000$ZeroBoxSizeException()
	{
		this$0 = Jpeg2000.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field Jpeg2000 this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void IOException()>
	//    5    9:return          
	}

	public Jpeg2000$ZeroBoxSizeException(String s)
	{
		this$0 = Jpeg2000.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field Jpeg2000 this$0>
		super(s);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #21  <Method void IOException(String)>
	//    6   10:return          
	}
}
