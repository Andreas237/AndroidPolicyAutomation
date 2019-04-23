// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


// Referenced classes of package bo.app:
//			e, g, c, d

public class b
{

	public static d a()
	{
		return a(5000);
	//    0    0:sipush          5000
	//    1    3:invokestatic    #9   <Method d a(int)>
	//    2    6:areturn         
	}

	public static d a(int i)
	{
		return ((d) (new e(((d) (new g(((d) (new c(i)))))))));
	//    0    0:new             #12  <Class e>
	//    1    3:dup             
	//    2    4:new             #14  <Class g>
	//    3    7:dup             
	//    4    8:new             #16  <Class c>
	//    5   11:dup             
	//    6   12:iload_0         
	//    7   13:invokespecial   #20  <Method void c(int)>
	//    8   16:invokespecial   #23  <Method void g(d)>
	//    9   19:invokespecial   #24  <Method void e(d)>
	//   10   22:areturn         
	}
}
