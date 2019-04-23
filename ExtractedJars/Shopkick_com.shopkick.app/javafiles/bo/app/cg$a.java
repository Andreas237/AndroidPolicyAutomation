// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


// Referenced classes of package bo.app:
//			cg, cf

public static class cg$a
{

	public cg$a a()
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

	public cg$a a(cf cf)
	{
		d = cf;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field cf d>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public cg$a a(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field String a>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public cg$a b()
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

	public cg c()
	{
		return new cg(a, b, c, d, ((cg$1) (null)));
	//    0    0:new             #6   <Class cg>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field String a>
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field Boolean b>
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field Boolean c>
	//    8   16:aload_0         
	//    9   17:getfield        #30  <Field cf d>
	//   10   20:aconst_null     
	//   11   21:invokespecial   #39  <Method void cg(String, Boolean, Boolean, cf, cg$1)>
	//   12   24:areturn         
	}

	private String a;
	private Boolean b;
	private Boolean c;
	private cf d;

	public cg$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}
}
