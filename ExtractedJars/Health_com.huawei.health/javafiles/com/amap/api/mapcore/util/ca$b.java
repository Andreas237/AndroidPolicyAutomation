// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			ca, bx, bw

static class ca$b
{

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String a>
	//    2    4:areturn         
	}

	public void a(String s)
	{
		if(s.length() > 1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #47  <Method int String.length()>
	//*   2    4:iconst_1        
	//*   3    5:icmple          13
			e = s;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #49  <Field String e>
	//    7   13:return          
	}

	public String b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String b>
	//    2    4:areturn         
	}

	public String c()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String e>
	//    2    4:areturn         
	}

	public bw d()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field bw c>
	//    2    4:areturn         
	}

	public ca$a e()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field ca$a d>
	//    2    4:areturn         
	}

	public void f()
	{
		d.a = true;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field ca$a d>
	//    2    4:iconst_1        
	//    3    5:putfield        #55  <Field boolean ca$a.a>
	//    4    8:return          
	}

	private String a;
	private String b;
	private bw c;
	private ca$a d;
	private String e;

	public ca$b(bx bx1, bw bw)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		c = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #21  <Field bw c>
		d = new ca$a();
	//    5    9:aload_0         
	//    6   10:new             #23  <Class ca$a>
	//    7   13:dup             
	//    8   14:invokespecial   #24  <Method void ca$a()>
	//    9   17:putfield        #26  <Field ca$a d>
		a = bx1.B();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokeinterface #32  <Method String bx.B()>
	//   13   27:putfield        #34  <Field String a>
		b = bx1.C();
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:invokeinterface #37  <Method String bx.C()>
	//   17   37:putfield        #39  <Field String b>
		c = bw;
	//   18   40:aload_0         
	//   19   41:aload_2         
	//   20   42:putfield        #21  <Field bw c>
	//   21   45:return          
	}
}
