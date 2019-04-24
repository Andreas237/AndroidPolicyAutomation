// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.common.a;


// Referenced classes of package com.startapp.common.a:
//			h

public static class h$a
{

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String a>
	//    2    4:areturn         
	}

	public void a(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field String a>
	//    3    5:return          
	}

	public String b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String b>
	//    2    4:areturn         
	}

	public void b(String s)
	{
		b = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field String b>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("HttpResult: ").append(b).append(" ").append(a).toString();
	//    0    0:new             #23  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void StringBuilder()>
	//    3    7:ldc1            #26  <String "HttpResult: ">
	//    4    9:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #20  <Field String b>
	//    7   16:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #32  <String " ">
	//    9   21:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #17  <Field String a>
	//   12   28:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:invokevirtual   #34  <Method String StringBuilder.toString()>
	//   14   34:areturn         
	}

	private String a;
	private String b;

	public h$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
