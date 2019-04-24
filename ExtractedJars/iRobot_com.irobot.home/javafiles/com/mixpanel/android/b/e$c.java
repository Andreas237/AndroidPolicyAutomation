// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.b;

import java.io.IOException;

// Referenced classes of package com.mixpanel.android.b:
//			e

public class e$c extends IOException
{

	private static final long serialVersionUID = 0xed411d3cL;
	final e a;

	public e$c(e e1, Throwable throwable)
	{
		a = e1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field e a>
		super(throwable.getMessage());
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #23  <Method String Throwable.getMessage()>
	//    6   10:invokespecial   #26  <Method void IOException(String)>
	//    7   13:return          
	}
}
