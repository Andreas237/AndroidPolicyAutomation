// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


public final class dr
{

	public dr(String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #15  <String "">
	//    4    7:putfield        #17  <Field String a>
		c = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #15  <String "">
	//    7   13:putfield        #19  <Field String c>
		d = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #15  <String "">
	//   10   19:putfield        #21  <Field String d>
		a = s;
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:putfield        #17  <Field String a>
		c = s1;
	//   14   27:aload_0         
	//   15   28:aload_2         
	//   16   29:putfield        #19  <Field String c>
		d = s2;
	//   17   32:aload_0         
	//   18   33:aload_3         
	//   19   34:putfield        #21  <Field String d>
	//   20   37:return          
	}

	public final String b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String c>
	//    2    4:areturn         
	}

	public final String c()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String a>
	//    2    4:areturn         
	}

	public final String e()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String d>
	//    2    4:areturn         
	}

	private String a;
	private String c;
	private String d;
}
