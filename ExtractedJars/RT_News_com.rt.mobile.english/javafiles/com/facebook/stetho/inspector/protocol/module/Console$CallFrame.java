// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;


// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			Console

public static class Console$CallFrame
{

	public int columnNumber;
	public String functionName;
	public int lineNumber;
	public String url;

	public Console$CallFrame()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	public Console$CallFrame(String s, String s1, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		functionName = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field String functionName>
		url = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field String url>
		lineNumber = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #32  <Field int lineNumber>
		columnNumber = j;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #34  <Field int columnNumber>
	//   14   25:return          
	}
}
