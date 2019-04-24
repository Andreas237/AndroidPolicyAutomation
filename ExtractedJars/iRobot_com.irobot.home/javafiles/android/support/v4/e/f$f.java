// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.e;

import java.util.Locale;

// Referenced classes of package android.support.v4.e:
//			f, g

private static class f$f extends f$d
{

	protected boolean a()
	{
		return g.a(Locale.getDefault()) == 1;
	//    0    0:invokestatic    #27  <Method Locale Locale.getDefault()>
	//    1    3:invokestatic    #32  <Method int g.a(Locale)>
	//    2    6:iconst_1        
	//    3    7:icmpne          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public static final f$f a = new f$f();

	static 
	{
	//    0    0:new             #2   <Class f$f>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void f$f()>
	//    3    7:putstatic       #16  <Field f$f a>
	//*   4   10:return          
	}

	public f$f()
	{
		super(((f$c) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #20  <Method void f$d(f$c)>
	//    3    5:return          
	}
}
