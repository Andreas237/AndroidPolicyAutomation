// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			js, jt

static class js$b
{

	public void a(jt jt)
	{
		c = jt;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field jt c>
	//    3    5:return          
	}

	public jt d()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field jt c>
	//    2    4:areturn         
	}

	public String e()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String a>
	//    2    4:areturn         
	}

	public void e(String s)
	{
		a = s.replace("##", "#");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #28  <String "##">
	//    3    4:ldc1            #30  <String "#">
	//    4    6:invokevirtual   #36  <Method String String.replace(CharSequence, CharSequence)>
	//    5    9:putfield        #19  <Field String a>
	//    6   12:return          
	}

	private String a;
	private jt c;

	protected js$b()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		c = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #17  <Field jt c>
		a = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #19  <Field String a>
	//    8   14:return          
	}
}
