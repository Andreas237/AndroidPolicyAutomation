// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


// Referenced classes of package bo.app:
//			cm, cl

public static class cm$a
{

	public cm$a a()
	{
		b = Boolean.valueOf(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #25  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #27  <Field Boolean b>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public cm$a a(cl cl)
	{
		d = cl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field cl d>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public cm$a a(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field String a>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public cm$a b()
	{
		c = Boolean.valueOf(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #25  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #35  <Field Boolean c>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public cm c()
	{
		return new cm(a, b, c, d, ((cm$1) (null)));
	//    0    0:new             #6   <Class cm>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field String a>
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field Boolean b>
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field Boolean c>
	//    8   16:aload_0         
	//    9   17:getfield        #30  <Field cl d>
	//   10   20:aconst_null     
	//   11   21:invokespecial   #39  <Method void cm(String, Boolean, Boolean, cl, cm$1)>
	//   12   24:areturn         
	}

	private String a;
	private Boolean b;
	private Boolean c;
	private cl d;

	public cm$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}
}
