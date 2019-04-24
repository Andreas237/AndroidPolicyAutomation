// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			ei

public final class dx
{

	public dx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		a = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #16  <String "">
	//    4    7:putfield        #18  <Field String a>
		c = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #16  <String "">
	//    7   13:putfield        #20  <Field String c>
		e = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #16  <String "">
	//   10   19:putfield        #22  <Field String e>
		d = "";
	//   11   22:aload_0         
	//   12   23:ldc1            #16  <String "">
	//   13   25:putfield        #24  <Field String d>
		b = "";
	//   14   28:aload_0         
	//   15   29:ldc1            #16  <String "">
	//   16   31:putfield        #26  <Field String b>
	//   17   34:return          
	}

	public dx(String s, String s1, String s2, String s3, String s4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		a = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #16  <String "">
	//    4    7:putfield        #18  <Field String a>
		c = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #16  <String "">
	//    7   13:putfield        #20  <Field String c>
		e = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #16  <String "">
	//   10   19:putfield        #22  <Field String e>
		d = "";
	//   11   22:aload_0         
	//   12   23:ldc1            #16  <String "">
	//   13   25:putfield        #24  <Field String d>
		b = "";
	//   14   28:aload_0         
	//   15   29:ldc1            #16  <String "">
	//   16   31:putfield        #26  <Field String b>
		a = s;
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:putfield        #18  <Field String a>
		c = s1;
	//   20   39:aload_0         
	//   21   40:aload_2         
	//   22   41:putfield        #20  <Field String c>
		e = s2;
	//   23   44:aload_0         
	//   24   45:aload_3         
	//   25   46:putfield        #22  <Field String e>
		d = s3;
	//   26   49:aload_0         
	//   27   50:aload           4
	//   28   52:putfield        #24  <Field String d>
		b = s4;
	//   29   55:aload_0         
	//   30   56:aload           5
	//   31   58:putfield        #26  <Field String b>
	//   32   61:return          
	}

	public final String a()
	{
		return ei.e(d);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String d>
	//    2    4:invokestatic    #34  <Method String ei.e(String)>
	//    3    7:areturn         
	}

	public final void a(String s)
	{
		d = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field String d>
	//    3    5:return          
	}

	public final String b()
	{
		return ei.e(e);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String e>
	//    2    4:invokestatic    #34  <Method String ei.e(String)>
	//    3    7:areturn         
	}

	public final void b(String s)
	{
		b = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field String b>
	//    3    5:return          
	}

	public final String c()
	{
		return ei.e(a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String a>
	//    2    4:invokestatic    #34  <Method String ei.e(String)>
	//    3    7:areturn         
	}

	public final void c(String s)
	{
		e = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field String e>
	//    3    5:return          
	}

	public final String d()
	{
		return ei.e(c);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String c>
	//    2    4:invokestatic    #34  <Method String ei.e(String)>
	//    3    7:areturn         
	}

	public final void d(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field String a>
	//    3    5:return          
	}

	public final String e()
	{
		return ei.e(b);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String b>
	//    2    4:invokestatic    #34  <Method String ei.e(String)>
	//    3    7:areturn         
	}

	public final void e(String s)
	{
		c = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field String c>
	//    3    5:return          
	}

	private String a;
	private String b;
	private String c;
	private String d;
	private String e;
}
