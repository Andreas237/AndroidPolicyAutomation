// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package junit.b;


// Referenced classes of package junit.b:
//			e, i

static class i$1 extends e
{

	protected void c()
	{
		b(a);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field String a>
	//    2    4:invokestatic    #23  <Method void b(String)>
	//    3    7:return          
	}

	final String a;

	i$1(String s, String s1)
	{
		a = s1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #14  <Field String a>
		super(s);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #17  <Method void e(String)>
	//    6   10:return          
	}
}
