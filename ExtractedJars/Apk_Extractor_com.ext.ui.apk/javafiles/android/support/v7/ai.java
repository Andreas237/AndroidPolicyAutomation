// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;


// Referenced classes of package android.support.v7:
//			ah, au

public class ai extends ah
{

	public ai(au au, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ah()>
		b = au;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field au b>
		c = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #18  <Field String c>
		d = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #20  <Field String d>
	//   11   19:return          
	}

	public au a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field au b>
	//    2    4:areturn         
	}

	public String b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String c>
	//    2    4:areturn         
	}

	public String c()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String d>
	//    2    4:areturn         
	}

	private final au b;
	private final String c;
	private final String d;
}
