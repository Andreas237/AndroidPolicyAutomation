// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package b.a.a.a.a.c;


// Referenced classes of package b.a.a.a.a.c:
//			h, f, b

class f$a$1 extends h
{

	public b a()
	{
		return ((b) (f.a.a(a)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field f$a a>
	//    2    4:invokestatic    #26  <Method f f$a.a(f$a)>
	//    3    7:areturn         
	}

	final f.a a;

	f$a$1(f.a a1, Runnable runnable, Object obj)
	{
		a = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field f$a a>
		super(runnable, obj);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #21  <Method void h(Runnable, Object)>
	//    7   11:return          
	}
}
